```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions;
import com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NameAnalyzerTest {

    private static final String GLOBAL = "window";

    private SimpleCompiler compiler;

    private void setupCompiler(String code) {
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        // No need to set compiler.getOptions().setCodingConvention() here,
        // as the tests that need a custom one set it up themselves.
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());
    }

    private NameAnalyzer analyze(String code) {
        setupCompiler(code);
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());
        return analyzer;
    }

    private JsName getJsName(NameAnalyzer analyzer, String name) {
        return analyzer.allNames.get(name);
    }

    @Test
    public void testGlobalDeclaration() throws Exception {
        String code = "var a = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "a");
        assertNotNull(jsName);
        assertFalse(jsName.externallyDefined);
        assertTrue(jsName.referenced); // 'a' is referenced by the assignment
    }

    @Test
    public void testGlobalDeclarationReferencedLater() throws Exception {
        String code = "var a; a = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "a");
        assertNotNull(jsName);
        assertTrue(jsName.referenced);
    }

    @Test
    public void testGlobalDeclarationNotReferenced() throws Exception {
        String code = "var a;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "a");
        assertNotNull(jsName);
        assertFalse(jsName.referenced);
    }

    @Test
    public void testFunctionDeclaration() throws Exception {
        String code = "function f() {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "f");
        assertNotNull(jsName);
        assertFalse(jsName.referenced); // Not referenced in this simple case
    }

    @Test
    public void testFunctionDeclarationReferenced() throws Exception {
        String code = "function f() {} f();";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "f");
        assertNotNull(jsName);
        assertTrue(jsName.referenced);
    }

    @Test
    public void testFunctionDeclarationNotReferenced() throws Exception {
        String code = "function f() {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "f");
        assertNotNull(jsName);
        assertFalse(jsName.referenced);
    }

    @Test
    public void testObjectLiteralProperty() throws Exception {
        String code = "var obj = { a: 1 };";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "obj");
        assertNotNull(jsName);
        assertTrue(jsName.referenced); // obj is referenced
        JsName jsNameA = getJsName(analyzer, "obj.a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced); // obj.a is referenced
    }

    @Test
    public void testObjectLiteralPropertyNotReferenced() throws Exception {
        String code = "var obj = {};";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "obj");
        assertNotNull(jsName);
        assertTrue(jsName.referenced); // obj is referenced
        JsName jsNameA = getJsName(analyzer, "obj.a");
        assertNull(jsNameA); // obj.a is not defined and not referenced
    }


    @Test
    public void testQualifiedNameDeclaration() throws Exception {
        String code = "var a = {}; a.b = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);

        JsName jsNameAB = getJsName(analyzer, "a.b");
        assertNotNull(jsNameAB);
        assertTrue(jsNameAB.referenced);
    }

    @Test
    public void testQualifiedNameDeclarationNotReferenced() throws Exception {
        String code = "var a = {};";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);

        JsName jsNameAB = getJsName(analyzer, "a.b");
        assertNull(jsNameAB);
    }

    @Test
    public void testPrototypePropertyAssignment() throws Exception {
        String code = "function F() {} F.prototype.method = function() {};";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameF = getJsName(analyzer, "F");
        assertNotNull(jsNameF);
        assertTrue(jsNameF.referenced); // F is referenced by prototype assignment

        // F.prototype itself might not be created as a JsName if not explicitly referenced.
        // The important part is that F.prototype.method is created and referenced.
        JsName jsNameMethod = getJsName(analyzer, "F.prototype.method");
        assertNotNull(jsNameMethod);
        assertTrue(jsNameMethod.referenced);
    }

    @Test
    public void testPrototypePropertyAssignmentNotReferenced() throws Exception {
        String code = "function F() {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameF = getJsName(analyzer, "F");
        assertNotNull(jsNameF);
        assertFalse(jsNameF.referenced);

        JsName jsNameFPrototype = getJsName(analyzer, "F.prototype");
        assertNull(jsNameFPrototype);

        JsName jsNameMethod = getJsName(analyzer, "F.prototype.method");
        assertNull(jsNameMethod);
    }

    @Test
    public void testInheritance() throws Exception {
        String code = "function Parent() {} function Child() {} Parent.prototype.parentMethod = function() {}; Child.prototype = Object.create(Parent.prototype); Child.prototype.childMethod = function() {};";
        NameAnalyzer analyzer = analyze(code);

        JsName parent = getJsName(analyzer, "Parent");
        assertNotNull(parent);
        assertTrue(parent.referenced);

        JsName child = getJsName(analyzer, "Child");
        assertNotNull(child);
        assertTrue(child.referenced);

        JsName parentMethod = getJsName(analyzer, "Parent.prototype.parentMethod");
        assertNotNull(parentMethod);
        assertTrue(parentMethod.referenced);

        JsName childMethod = getJsName(analyzer, "Child.prototype.childMethod");
        assertNotNull(childMethod);
        assertTrue(childMethod.referenced);
    }

    @Test
    public void testExternalName() throws Exception {
        String code = "console.log('hello');"; // console is external
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "console");
        assertNotNull(jsName);
        assertTrue(jsName.referenced);
        assertTrue(jsName.externallyDefined);
    }

    @Test
    public void testWindowName() throws Exception {
        String code = "var x = window;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "window");
        assertNotNull(jsName);
        assertTrue(jsName.referenced);
        assertTrue(jsName.externallyDefined);
    }

    @Test
    public void testAliasedVariableAssignment() throws Exception {
        String code = "var a = {}; var b = a; a.prop = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);

        JsName jsNameB = getJsName(analyzer, "b");
        assertNotNull(jsNameB);
        assertTrue(jsNameB.referenced);

        JsName jsNameAProp = getJsName(analyzer, "a.prop");
        assertNotNull(jsNameAProp);
        assertTrue(jsNameAProp.referenced);
    }

    @Test
    public void testAliasedVariableAssignmentToAlias() throws Exception {
        String code = "var a = {}; var b = a; b.prop = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);

        JsName jsNameB = getJsName(analyzer, "b");
        assertNotNull(jsNameB);
        assertTrue(jsNameB.referenced);

        JsName jsNameBProp = getJsName(analyzer, "b.prop");
        assertNotNull(jsNameBProp);
        assertTrue(jsNameBProp.referenced);

        // Check that 'a.prop' is also considered referenced due to aliasing
        JsName jsNameAProp = getJsName(analyzer, "a.prop");
        assertNotNull(jsNameAProp);
        assertTrue(jsNameAProp.referenced);
    }


    @Test
    public void testInstanceOf() throws Exception {
        String code = "function F() {}; var instance = new F(); if (instance instanceof F) {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameF = getJsName(analyzer, "F");
        assertNotNull(jsNameF);
        assertTrue(jsNameF.referenced);
    }

    @Test
    public void testInstanceOfExternal() throws Exception {
        String code = "var d = new Date(); if (d instanceof Date) {}"; // Date is external
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameDate = getJsName(analyzer, "Date");
        assertNotNull(jsNameDate);
        assertTrue(jsNameDate.referenced);
        assertTrue(jsNameDate.externallyDefined);
    }

    @Test
    public void testCallHasSideEffects() throws Exception {
        String code = "var a = 1; foo();";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testCallArgumentHasSideEffects() throws Exception {
        String code = "function bar(x) {}; foo(bar(1));";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameFoo = getJsName(analyzer, "foo");
        assertNotNull(jsNameFoo);
        assertTrue(jsNameFoo.referenced);
        JsName jsNameBar = getJsName(analyzer, "bar");
        assertNotNull(jsNameBar);
        assertTrue(jsNameBar.referenced);
    }

    @Test
    public void testAssignmentInForLoopInit() throws Exception {
        String code = "var x = 0; for (var i = x = 1; i < 2; i++) {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameX = getJsName(analyzer, "x");
        assertNotNull(jsNameX);
        assertTrue(jsNameX.referenced);
    }

    @Test
    public void testAssignmentInForLoopCondition() throws Exception {
        String code = "var x = 0; for (var i = 0; x = 1; i < 2) {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameX = getJsName(analyzer, "x");
        assertNotNull(jsNameX);
        assertTrue(jsNameX.referenced);
    }

    @Test
    public void testAssignmentInForLoopIncr() throws Exception {
        String code = "var x = 0; for (var i = 0; i < 2; x = 1) {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameX = getJsName(analyzer, "x");
        assertNotNull(jsNameX);
        assertTrue(jsNameX.referenced);
    }

    @Test
    public void testSimpleAssignmentExpression() throws Exception {
        String code = "var x; x = 5;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameX = getJsName(analyzer, "x");
        assertNotNull(jsNameX);
        assertTrue(jsNameX.referenced);
    }

    @Test
    public void testQualifiedAssignmentExpression() throws Exception {
        String code = "var obj = {}; obj.prop = 5;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameObj = getJsName(analyzer, "obj");
        assertNotNull(jsNameObj);
        assertTrue(jsNameObj.referenced);
        JsName jsNameProp = getJsName(analyzer, "obj.prop");
        assertNotNull(jsNameProp);
        assertTrue(jsNameProp.referenced);
    }

    @Test
    public void testComplexLhsAssignment() throws Exception {
        String code = "var arr = []; arr[0] = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameArr = getJsName(analyzer, "arr");
        assertNotNull(jsNameArr);
        assertTrue(jsNameArr.referenced);
        JsName jsNameArrElem = getJsName(analyzer, "arr[0]");
        assertNotNull(jsNameArrElem);
        assertTrue(jsNameArrElem.referenced);
    }

    @Test
    public void testUndefinedVariable() throws Exception {
        String code = "var x; x;"; // Reference to undefined variable in global scope
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameX = getJsName(analyzer, "x");
        assertNotNull(jsNameX);
        assertTrue(jsNameX.referenced);
    }

    @Test
    public void testGlobalScopeAlias() throws Exception {
        String code = "var x = {}; var y = x; y;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameX = getJsName(analyzer, "x");
        assertNotNull(jsNameX);
        assertTrue(jsNameX.referenced);

        JsName jsNameY = getJsName(analyzer, "y");
        assertNotNull(jsNameY);
        assertTrue(jsNameY.referenced);
    }

    @Test
    public void testBooleanLiteralTrue() {
        String code = "var a = true;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testBooleanLiteralFalse() {
        String code = "var a = false;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testNullLiteral() {
        String code = "var a = null;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testNumericLiteral() {
        String code = "var a = 123;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testStringLiteral() {
        String code = "var a = 'hello';";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testRegExpLiteral() {
        String code = "var a = /abc/;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testArrayLiteral() {
        String code = "var a = [1, 2];";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testObjectLiteral() {
        String code = "var a = { b: 1 };";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
        JsName jsNameB = getJsName(analyzer, "a.b");
        assertNotNull(jsNameB);
        assertTrue(jsNameB.referenced);
    }

    @Test
    public void testThrowStatement() {
        String code = "throw new Error('test');";
        NameAnalyzer analyzer = analyze(code);
        // No specific name analysis for throw statements, but the compiler will run
        // and not crash.
    }

    @Test
    public void testTryCatchBlock() {
        String code = "try { var a = 1; } catch (e) {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testTryCatchBlockNotReferenced() {
        String code = "try {} catch (e) {}";
        NameAnalyzer analyzer = analyze(code);
        // No names declared here, so nothing to assert.
    }

    @Test
    public void testCommaOperator() {
        String code = "var a = (1, 2);";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testForInLoop() {
        String code = "var obj = {a: 1}; for (var key in obj) {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameObj = getJsName(analyzer, "obj");
        assertNotNull(jsNameObj);
        assertTrue(jsNameObj.referenced);
        JsName jsNameKey = getJsName(analyzer, "key");
        assertNotNull(jsNameKey);
        assertTrue(jsNameKey.referenced);
    }

    @Test
    public void testForLoop() {
        String code = "var count = 0; for (var i = 0; i < 10; i++) { count++; }";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameCount = getJsName(analyzer, "count");
        assertNotNull(jsNameCount);
        assertTrue(jsNameCount.referenced);
        JsName jsNameI = getJsName(analyzer, "i");
        assertNotNull(jsNameI);
        assertTrue(jsNameI.referenced);
    }

    @Test
    public void testWhileLoop() {
        String code = "var count = 0; while (count < 10) { count++; }";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameCount = getJsName(analyzer, "count");
        assertNotNull(jsNameCount);
        assertTrue(jsNameCount.referenced);
    }

    @Test
    public void testDoLoop() {
        String code = "var count = 0; do { count++; } while (count < 10);";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameCount = getJsName(analyzer, "count");
        assertNotNull(jsNameCount);
        assertTrue(jsNameCount.referenced);
    }

    @Test
    public void testSwitchStatement() {
        String code = "var a = 1; switch(a) { case 1: break; }";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testBreakStatement() {
        String code = "var loop = true; while(loop) { loop = false; break; }";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameLoop = getJsName(analyzer, "loop");
        assertNotNull(jsNameLoop);
        assertTrue(jsNameLoop.referenced);
    }

    @Test
    public void testContinueStatement() {
        String code = "var count = 0; while(count < 1) { count++; continue; }";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameCount = getJsName(analyzer, "count");
        assertNotNull(jsNameCount);
        assertTrue(jsNameCount.referenced);
    }

    @Test
    public void testWithStatement() {
        String code = "var obj = { a: 1 }; with(obj) { var b = a; }";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameObj = getJsName(analyzer, "obj");
        assertNotNull(jsNameObj);
        assertTrue(jsNameObj.referenced);
        JsName jsNameA = getJsName(analyzer, "a"); // 'a' is accessed via 'with'
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
    }

    @Test
    public void testDebuggerStatement() {
        String code = "debugger;";
        NameAnalyzer analyzer = analyze(code);
        // No specific name analysis for debugger, but compiler should handle it.
    }

    @Test
    public void testQualifiedNameInCall() {
        String code = "var ns = {}; ns.method = function() {}; ns.method();";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameNs = getJsName(analyzer, "ns");
        assertNotNull(jsNameNs);
        assertTrue(jsNameNs.referenced);
        JsName jsNameMethod = getJsName(analyzer, "ns.method");
        assertNotNull(jsNameMethod);
        assertTrue(jsNameMethod.referenced);
    }

    @Test
    public void testAliasingWithExternal() {
        String code = "var alias = window; alias.prop = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameWindow = getJsName(analyzer, "window");
        assertNotNull(jsNameWindow);
        assertTrue(jsNameWindow.referenced);
        assertTrue(jsNameWindow.externallyDefined);

        JsName jsNameAlias = getJsName(analyzer, "alias");
        assertNotNull(jsNameAlias);
        assertTrue(jsNameAlias.referenced);

        JsName jsNameProp = getJsName(analyzer, "window.prop");
        assertNotNull(jsNameProp);
        assertTrue(jsNameProp.referenced);
    }

    @Test
    public void testMultipleAliases() {
        String code = "var a = {}, b = a, c = b; a.prop = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        assertTrue(jsNameA.referenced);
        JsName jsNameB = getJsName(analyzer, "b");
        assertNotNull(jsNameB);
        assertTrue(jsNameB.referenced);
        JsName jsNameC = getJsName(analyzer, "c");
        assertNotNull(jsNameC);
        assertTrue(jsNameC.referenced);
        JsName jsNameProp = getJsName(analyzer, "a.prop");
        assertNotNull(jsNameProp);
        assertTrue(jsNameProp.referenced);
    }

    @Test
    public void testClassDefiningCall() {
        // Mock a simple class definition via coding convention
        String code = "var Foo = function() {}; Foo.prototype.bar = function() {};";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        // Override getClassesDefinedByCall to simulate a class definition
        CodingConvention codingConvention = new CodingConvention.DefaultCodingConvention() {
            @Override
            public SubclassRelationship getClassesDefinedByCall(Node callNode) {
                if (callNode.isCall() && callNode.getFirstChild().isName() && "Foo".equals(callNode.getFirstChild().getString())) {
                    return new SubclassRelationship("Foo", "Object");
                }
                return null;
            }
        };
        compiler.setCodingConvention(codingConvention);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());

        JsName jsNameFoo = getJsName(analyzer, "Foo");
        assertNotNull(jsNameFoo);
        assertTrue(jsNameFoo.referenced);

        JsName jsNameBar = getJsName(analyzer, "Foo.prototype.bar");
        assertNotNull(jsNameBar);
        assertTrue(jsNameBar.referenced);
    }

    @Test
    public void testClassDefiningCallWithSuper() {
        String code = "var Parent = function() {}; var Child = function() {};";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        CodingConvention codingConvention = new CodingConvention.DefaultCodingConvention() {
            @Override
            public SubclassRelationship getClassesDefinedByCall(Node callNode) {
                if (callNode.isCall()) {
                    Node target = callNode.getFirstChild();
                    if (target.isName()) {
                        if ("Parent".equals(target.getString())) {
                            return new SubclassRelationship("Parent", "Object");
                        } else if ("Child".equals(target.getString())) {
                            return new SubclassRelationship("Child", "Parent");
                        }
                    }
                }
                return null;
            }
        };
        compiler.setCodingConvention(codingConvention);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());

        JsName jsNameParent = getJsName(analyzer, "Parent");
        assertNotNull(jsNameParent);
        assertTrue(jsNameParent.referenced);
        JsName jsNameChild = getJsName(analyzer, "Child");
        assertNotNull(jsNameChild);
        assertTrue(jsNameChild.referenced);
    }
    
    @Test
    public void testTraverseEdge() throws Exception {
        String code = "var a = 1; var b = a;";
        NameAnalyzer analyzer = analyze(code);
        
        // Get JsName objects for 'a' and 'b'
        JsName nameA = getJsName(analyzer, "a");
        JsName nameB = getJsName(analyzer, "b");
        
        // Ensure they exist
        assertNotNull(nameA);
        assertNotNull(nameB);
        
        RefType regularRef = RefType.REGULAR;

        // Test case 1: 'a' is referenced, 'b' is not.
        // 'a' should cause 'b' to become referenced.
        nameA.referenced = true;
        nameB.referenced = false;
        boolean result1 = analyzer.traverseEdge(nameA, regularRef, nameB);
        assertTrue("Edge traversal should return true when a referenced name causes an unreferenced name to be referenced.", result1);
        assertTrue("Name 'b' should now be referenced.", nameB.referenced);

        // Reset for the next test case
        nameA.referenced = true; // Keep 'a' referenced for subsequent tests

        // Test case 2: Both 'a' and 'b' are already referenced.
        // No change should occur.
        nameB.referenced = true;
        boolean result2 = analyzer.traverseEdge(nameA, regularRef, nameB);
        assertFalse("Edge traversal should return false when both names are already referenced.", result2);
        assertTrue("Name 'b' should remain referenced.", nameB.referenced);

        // Test case 3: 'a' is not referenced.
        // 'b' should remain unreferenced.
        nameA.referenced = false;
        nameB.referenced = false;
        boolean result3 = analyzer.traverseEdge(nameA, regularRef, nameB);
        assertFalse("Edge traversal should return false when the source name is not referenced.", result3);
        assertFalse("Name 'b' should remain unreferenced.", nameB.referenced);
    }

    @Test
    public void testJsNameToString() throws Exception {
        String code = "var a = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "a");
        jsName.prototypeNames.add("method1");
        jsName.prototypeNames.add("method2");
        String result = jsName.toString();
        assertTrue("toString should include the name and prototype functions.", result.contains("a (CLASS)"));
        assertTrue("toString should list prototype functions.", result.contains("method1, method2"));
    }
    
    @Test
    public void testJsNameCompareTo() throws Exception {
        // JsName objects are created within the NameAnalyzer, so we need to get them from there.
        String code = "var apple = 1; var banana = 2;";
        NameAnalyzer analyzer = analyze(code);
        
        JsName name1 = getJsName(analyzer, "apple");
        JsName name2 = getJsName(analyzer, "banana");
        
        assertNotNull(name1);
        assertNotNull(name2);
        
        assertTrue("compareTo should return negative for lexicographically smaller name.", name1.compareTo(name2) < 0);
        assertTrue("compareTo should return positive for lexicographically larger name.", name2.compareTo(name1) > 0);
        assertTrue("compareTo should return zero for equal names.", name1.compareTo(name1) == 0);
    }

    @Test
    public void testJsNameRemove() throws Exception {
        // The remove() method is part of RefNode interface and its implementations,
        // not directly on JsName. JsName itself doesn't have a remove method.
        // This test cannot directly call JsName.remove().
        // The effect of removal is tested indirectly by checking AST changes or
        // by ensuring that unreferenced names are not present after removal.
        // Since we don't have direct access to the AST modification here,
        // this test is a placeholder to indicate that JsName itself doesn't implement remove.
        String code = "var a = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameA = getJsName(analyzer, "a");
        assertNotNull(jsNameA);
        // No assertion possible for a method that doesn't exist on JsName.
    }
    
    @Test
    public void testFindDeclarationsAndSettersVisit() throws Exception {
        String code = "var globalVar = 1; function globalFunc() {} globalVar = 2; globalFunc.prototype.method = function() {};";
        NameAnalyzer analyzer = analyze(code);
        
        JsName globalVar = getJsName(analyzer, "globalVar");
        assertNotNull(globalVar);
        assertTrue(globalVar.referenced);

        JsName globalFunc = getJsName(analyzer, "globalFunc");
        assertNotNull(globalFunc);
        assertTrue(globalFunc.referenced);

        JsName method = getJsName(analyzer, "globalFunc.prototype.method");
        assertNotNull(method);
        assertTrue(method.referenced);
    }

    @Test
    public void testFindReferencesVisit_InstanceOf() throws Exception {
        String code = "function F() {}; var obj = new F(); obj instanceof F;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameF = getJsName(analyzer, "F");
        assertNotNull(jsNameF);
        assertTrue(jsNameF.referenced);
        assertTrue(jsNameF.hasInstanceOfReference);
    }
    
    @Test
    public void testFindReferencesVisit_ClassDefiningCall() throws Exception {
        String code = "var MyClass = function() {}; MyClass();";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        CodingConvention codingConvention = new CodingConvention.DefaultCodingConvention() {
            @Override
            public SubclassRelationship getClassesDefinedByCall(Node callNode) {
                if (callNode.isCall() && callNode.getFirstChild().isName() && "MyClass".equals(callNode.getFirstChild().getString())) {
                    return new SubclassRelationship("MyClass", "Object");
                }
                return null;
            }
        };
        compiler.setCodingConvention(codingConvention);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());

        JsName jsNameMyClass = getJsName(analyzer, "MyClass");
        assertNotNull(jsNameMyClass);
        assertTrue(jsNameMyClass.referenced);
    }

    @Test
    public void testFindReferencesVisit_SuperCall() throws Exception {
        String code = "function Parent() {}; function Child() { Parent.call(this); }";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        CodingConvention codingConvention = new CodingConvention.DefaultCodingConvention() {
            @Override
            public SubclassRelationship getClassesDefinedByCall(Node callNode) {
                if (callNode.isCall()) {
                    Node target = callNode.getFirstChild();
                    if (target.isName()) {
                        if ("Parent".equals(target.getString())) {
                            return new SubclassRelationship("Parent", "Object");
                        } else if ("Child".equals(target.getString())) {
                            return new SubclassRelationship("Child", "Parent");
                        }
                    }
                }
                return null;
            }
        };
        compiler.setCodingConvention(codingConvention);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());

        JsName jsNameParent = getJsName(analyzer, "Parent");
        assertNotNull(jsNameParent);
        assertTrue(jsNameParent.referenced);
        JsName jsNameChild = getJsName(analyzer, "Child");
        assertNotNull(jsNameChild);
        assertTrue(jsNameChild.referenced);
    }

    @Test
    public void testFindDependencyScopesVisit_Assign() throws Exception {
        String code = "var x; x = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameX = getJsName(analyzer, "x");
        assertNotNull(jsNameX);
        assertTrue(jsNameX.referenced);
    }

    @Test
    public void testFindDependencyScopesVisit_VarDeclaration() throws Exception {
        String code = "var y;";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameY = getJsName(analyzer, "y");
        assertNotNull(jsNameY);
        assertFalse(jsNameY.referenced); // Not referenced
    }

    @Test
    public void testFindDependencyScopesVisit_FunctionDeclaration() throws Exception {
        String code = "function g() {}";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameG = getJsName(analyzer, "g");
        assertNotNull(jsNameG);
        assertFalse(jsNameG.referenced); // Not referenced
    }

    @Test
    public void testFindDependencyScopesVisit_ExprCall() throws Exception {
        String code = "doSomething();";
        NameAnalyzer analyzer = analyze(code);
        JsName jsNameDoSomething = getJsName(analyzer, "doSomething");
        assertNotNull(jsNameDoSomething);
        assertTrue(jsNameDoSomething.referenced);
    }

    @Test
    public void testReferenceParentNames() throws Exception {
        String code = "var a = {}; a.b = 1; a.b.c = 2;";
        NameAnalyzer analyzer = analyze(code);
        JsName nameA = getJsName(analyzer, "a");
        JsName nameAB = getJsName(analyzer, "a.b");
        JsName nameABC = getJsName(analyzer, "a.b.c");

        assertNotNull(nameA);
        assertNotNull(nameAB);
        assertNotNull(nameABC);

        assertTrue(nameAB.referenced);
        assertTrue(nameABC.referenced);

        // Check references created by referenceParentNames
        // a.b should reference a, and a should reference a.b
        assertTrue(analyzer.referenceGraph.hasNode(nameA));
        assertTrue(analyzer.referenceGraph.hasNode(nameAB));
        assertTrue(analyzer.referenceGraph.hasNode(nameABC));

        boolean abRefersToA = false;
        for (DiGraphEdge<JsName, RefType> edge : analyzer.referenceGraph.getOutEdges(nameAB)) {
            if (edge.getDestination().getValue().equals(nameA)) {
                abRefersToA = true;
                break;
            }
        }
        assertTrue("a.b should reference a", abRefersToA);

        boolean aRefersToAB = false;
        for (DiGraphEdge<JsName, RefType> edge : analyzer.referenceGraph.getOutEdges(nameA)) {
            if (edge.getDestination().getValue().equals(nameAB)) {
                aRefersToAB = true;
                break;
            }
        }
        assertTrue("a should reference a.b", aRefersToAB);
    }
    
    @Test
    public void testReferenceAliases_WrittenDescendants() throws Exception {
        String code = "var a = {}, b = a; a.prop = 1;";
        NameAnalyzer analyzer = analyze(code);
        JsName nameA = getJsName(analyzer, "a");
        assertNotNull(nameA);
        assertTrue(nameA.hasWrittenDescendants);
        
        // Check that 'b' references 'a' due to alias writing
        boolean bRefsA = false;
        for (DiGraphEdge<JsName, RefType> edge : analyzer.referenceGraph.getOutEdges(getJsName(analyzer, "b"))) {
            if (edge.getDestination().getValue().equals(nameA)) {
                bRefsA = true;
                break;
            }
        }
        assertTrue("'b' should reference 'a' because 'a.prop' was written.", bRefsA);
    }

    @Test
    public void testReferenceAliases_InstanceOfReference() throws Exception {
        String code = "function F() {}; var a = F; var b = a; obj instanceof a;";
        NameAnalyzer analyzer = analyze(code);
        JsName nameF = getJsName(analyzer, "F");
        assertNotNull(nameF);
        assertTrue(nameF.hasInstanceOfReference);

        // Check that 'b' references 'a' due to instanceof
        boolean bRefsA = false;
        for (DiGraphEdge<JsName, RefType> edge : analyzer.referenceGraph.getOutEdges(getJsName(analyzer, "b"))) {
            if (edge.getDestination().getValue().equals(getJsName(analyzer, "a"))) {
                bRefsA = true;
                break;
            }
        }
        assertTrue("'b' should reference 'a' because 'obj instanceof a' was evaluated.", bRefsA);
    }

    @Test
    public void testCalculateReferences_WindowAndFunction() throws Exception {
        String code = "var x = window; var y = Function;";
        NameAnalyzer analyzer = analyze(code);
        
        JsName windowName = getJsName(analyzer, "window");
        assertNotNull(windowName);
        assertTrue(windowName.referenced);
        assertTrue(windowName.externallyDefined);

        JsName functionName = getJsName(analyzer, "Function");
        assertNotNull(functionName);
        assertTrue(functionName.referenced);
        assertTrue(functionName.externallyDefined);
    }

    @Test
    public void testCountOf_ReferencedClasses() throws Exception {
        String code = "function C1() {}; C1.prototype.m = 1; var c2 = {}; C2.prototype.m = 2;";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        CodingConvention codingConvention = new CodingConvention.DefaultCodingConvention() {
            @Override
            public SubclassRelationship getClassesDefinedByCall(Node callNode) {
                if (callNode.isCall()) {
                    Node target = callNode.getFirstChild();
                    if (target.isName()) {
                        if ("C1".equals(target.getString())) {
                            return new SubclassRelationship("C1", "Object");
                        } else if ("C2".equals(target.getString())) {
                            return new SubclassRelationship("C2", "Object");
                        }
                    }
                }
                return null;
            }
        };
        compiler.setCodingConvention(codingConvention);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());

        // C1 is a class, but not referenced. C2 is a class and referenced.
        // Expected: 1 referenced class.
        assertEquals(1, analyzer.countOf(TriState.TRUE, TriState.TRUE));
    }

    @Test
    public void testCountOf_UnreferencedFunctions() throws Exception {
        String code = "function f1() {}; var f2 = function() {};";
        NameAnalyzer analyzer = analyze(code);

        JsName nameF1 = getJsName(analyzer, "f1");
        assertNotNull(nameF1);
        assertFalse(nameF1.referenced); // f1 is declared but not called.

        JsName nameF2 = getJsName(analyzer, "f2");
        assertNotNull(nameF2);
        assertFalse(nameF2.referenced); // f2 is assigned but not called.

        // Expected: 2 unreferenced functions (both f1 and f2)
        assertEquals(2, analyzer.countOf(TriState.FALSE, TriState.FALSE));
    }

    @Test
    public void testGetHtmlReport() throws Exception {
        String code = "var a = 1; function b() {}; b();";
        NameAnalyzer analyzer = analyze(code);
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("Total Names: 3"));
        assertTrue(report.contains("Referenced Names: 2"));
        assertTrue(report.contains("ALL NAMES"));
        assertTrue(report.contains("a"));
        assertTrue(report.contains("b"));
    }
    
    // Tests for specific methods that might have edge cases
    
    @Test
    public void testCreateNameInformation_QualifiedNameWithGetElem() throws Exception {
        String code = "var arr = [1, 2]; arr[0] = 3;";
        NameAnalyzer analyzer = analyze(code);
        JsName nameArr = getJsName(analyzer, "arr");
        assertNotNull(nameArr);
        assertTrue(nameArr.referenced);
        // Note: "arr[0]" is not a directly named JsName in the same way "a.b" is.
        // It's handled as an element access. The logic in createNameInformation
        // aims to shorten names like a.b['c'].d to just a.b.
        // For arr[0], the name is simply "arr".
    }
    
    @Test
    public void testCreateNameInformation_ObjectLitKeyAsNamespace() throws Exception {
        String code = "var ns = { method: function() {} }; ns.method();";
        NameAnalyzer analyzer = analyze(code);
        JsName ns = getJsName(analyzer, "ns");
        assertNotNull(ns);
        assertTrue(ns.referenced);
        
        JsName method = getJsName(analyzer, "ns.method");
        assertNotNull(method);
        assertTrue(method.referenced);
    }

    @Test
    public void testIsExternallyReferenceable_GlobalName() throws Exception {
        String code = "var x = window;"; // window is external
        NameAnalyzer analyzer = analyze(code);
        JsName jsName = getJsName(analyzer, "window");
        assertNotNull(jsName);
        assertTrue(jsName.isExternallyReferenceable);
    }

    @Test
    public void testIsExternallyReferenceable_ExportedName() throws Exception {
        // Assuming a convention where names starting with "export_" are exported.
        String code = "var export_myVar = 1;";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        // Mock a coding convention that exports names starting with "export_"
        CodingConvention codingConvention = new CodingConvention.DefaultCodingConvention() {
            @Override
            public boolean isExported(String name) {
                return name.startsWith("export_");
            }
        };
        compiler.setCodingConvention(codingConvention);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());

        JsName jsName = getJsName(analyzer, "export_myVar");
        assertNotNull(jsName);
        assertTrue(jsName.isExternallyReferenceable);
    }
    
    @Test
    public void testGetDependencyScope_Empty() throws Exception {
        String code = "var a = 1;";
        NameAnalyzer analyzer = analyze(code);
        // Find the Node for 'a'
        Node rootNode = compiler.getJsRoot();
        Node varNode = null;
        for (Node child = rootNode.getFirstChild(); child != null; child = child.getNext()) {
            if (child.isVar()) {
                varNode = child.getFirstChild(); // The NAME node for 'a'
                break;
            }
        }
        assertNotNull("Could not find the 'a' variable declaration node.", varNode);
        assertTrue("getDependencyScope should return an empty list for a simple variable.", analyzer.getDependencyScope(varNode).isEmpty());
    }
    
    @Test
    public void testGetEnclosingFunctionDependencyScope() throws Exception {
        String code = "function outer() { var inner = 1; }";
        NameAnalyzer analyzer = analyze(code);
        
        // Find the NodeTraversal instance that would be within 'outer'
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
                // This visit method is called for each node. We need to find the one
                // for 'inner' declaration to simulate the context.
                if (n.isName() && "inner".equals(n.getString())) {
                    // Now we have a valid traversal 't' within the scope of 'outer'.
                    // We can call the method we want to test.
                    List<NameInformation> scopes = t.getEnclosingFunctionDependencyScope();
                    
                    // The dependency scope for 'inner' should be associated with 'outer'.
                    assertFalse("Should find dependency scope for enclosing function.", scopes.isEmpty());
                    boolean foundOuter = false;
                    for (NameInformation info : scopes) {
                        if ("outer".equals(info.name)) {
                            foundOuter = true;
                            break;
                        }
                    }
                    assertTrue("Should find 'outer' as the dependency scope.", foundOuter);
                    
                    // We found what we needed, so stop traversal early.
                    throw new RuntimeException("StopTraversal"); 
                }
            }
        });
        
        try {
            traversal.traverse(compiler.getJsRoot());
        } catch (RuntimeException e) {
            if (!"StopTraversal".equals(e.getMessage())) {
                throw e;
            }
        }
    }

    @Test
    public void testRemoveUnreferenced_PropertyAssignment() throws Exception {
        String code = "var obj = {}; obj.unreferencedProp = 1;";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());

        // Simulate the removal process
        analyzer.removeUnreferenced();

        // After removal, 'unreferencedProp' should not be in allNames if it was truly removed.
        // However, the current removeUnreferenced logic might not remove properties of unreferenced objects.
        // We check if the AST has changed if possible, or if the name exists and is marked as unreferenced.
        JsName obj = getJsName(analyzer, "obj");
        assertNotNull(obj);
        assertTrue(obj.referenced);

        JsName unreferencedProp = getJsName(analyzer, "obj.unreferencedProp");
        assertNotNull(unreferencedProp); // It might still exist in the map, but shouldn't be in the AST if removed.
        assertFalse(unreferencedProp.referenced); // It should be marked as unreferenced.
    }

    @Test
    public void testReplaceWithRhs_SimpleVar() throws Exception {
        String code = "var x = 1;";
        compiler = new SimpleCompiler();
        compiler.getOptions().setPrettyPrint(true);
        compiler.parse(code);
        compiler.getPassConfig().setSettings(compiler.getOptions());

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(compiler.getExternsRoot(), compiler.getJsRoot());
        
        // Find the Var node for 'x'
        Node varNode = null;
        Node root = compiler.getJsRoot();
        for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
            if (c.isVar()) {
                varNode = c;
                break;
            }
        }
        assertNotNull(varNode);
        
        Node parentOfVar = varNode.getParent();
        
        // The refNodes list is populated by FindDeclarationsAndSetters.
        // For "var x = 1;", the first refNode should be a JsNameRefNode for "x".
        RefNode refNodeToRemove = null;
        for(RefNode refNode : analyzer.refNodes) {
            if (refNode instanceof NameAnalyzer.JsNameRefNode) {
                NameAnalyzer.JsNameRefNode jsNameRefNode = (NameAnalyzer.JsNameRefNode) refNode;
                if ("x".equals(jsNameRefNode.name().name)) {
                    refNodeToRemove = refNode;
                    break;
                }
            }
        }
        assertNotNull(refNodeToRemove);

        // Simulate the removal
        refNodeToRemove.remove();

        // After replacement, the VAR node should be gone or modified.
        // The specific change depends on whether the value is consumed.
        // In this case, 'var x = 1;' where 'x' is not used elsewhere,
        // the 'var x' part should be removed. If '1' was consumed, it would
        // become an EXPR_RESULT. Here, it's likely removed entirely or replaced
        // with an empty node if the parent is a BLOCK/SCRIPT.
        
        // Check that the original varNode is no longer a child of its parent
        Node checkNode = null;
        if (parentOfVar.isScript() || parentOfVar.isBlock()) {
            for (Node c = parentOfVar.getFirstChild(); c != null; c = c.getNext()) {
                if (c == varNode) {
                    checkNode = c; // Should not find it
                    break;
                }
            }
        }
        assertNull("The 'var x' node should have been removed or replaced.", checkNode);
    }

    @Test
    public void testValueConsumedByParent_ReturnStatement() throws Exception {
        String code = "function f() { return 1; }";
        NameAnalyzer analyzer = analyze(code);
        Node root = compiler.getJsRoot();
        Node returnNode = null;
        for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
            if (c.isFunction()) {
                for (Node funcChild = c.getChildAtIndex(2); funcChild != null; funcChild = funcChild.getNext()) {
                    if (funcChild.isReturn()) {
                        returnNode = funcChild;
                        break;
                    }
                }
            }
            if (returnNode != null) break;
        }
        assertNotNull(returnNode);
        Node literalOne = returnNode.getFirstChild(); // Node for '1'
        
        assertTrue(analyzer.valueConsumedByParent(literalOne, returnNode));
    }
    
    @Test
    public void testValueConsumedByParent_IfCondition() throws Exception {
        String code = "if (true) {}";
        NameAnalyzer analyzer = analyze(code);
        Node ifNode = compiler.getJsRoot().getFirstChild();
        Node literalTrue = ifNode.getFirstChild(); // Node for 'true'
        
        assertTrue(analyzer.valueConsumedByParent(literalTrue, ifNode));
    }
    
    @Test
    public void testValueConsumedByParent_AssignmentRhs() throws Exception {
        String code = "var x; x = 1;";
        NameAnalyzer analyzer = analyze(code);
        Node varNode = compiler.getJsRoot().getFirstChild(); // Node for 'var x'
        Node assignNode = varNode.getNext(); // Node for 'x = 1'
        Node literalOne = assignNode.getLastChild(); // Node for '1'
        
        assertTrue(analyzer.valueConsumedByParent(literalOne, assignNode));
    }
    
    @Test
    public void testValueConsumedByParent_ForLoopCondition() throws Exception {
        String code = "for (var i = 0; i < 10; i++) {}";
        NameAnalyzer analyzer = analyze(code);
        Node forNode = compiler.getJsRoot().getFirstChild();
        Node conditionNode = forNode.getChildAtIndex(1); // Node for 'i < 10'
        
        assertTrue(analyzer.valueConsumedByParent(conditionNode, forNode));
    }

    @Test
    public void testValueConsumedByParent_AssignmentLhs() throws Exception {
        String code = "var x; x = 1;";
        NameAnalyzer analyzer = analyze(code);
        Node varNode = compiler.getJsRoot().getFirstChild(); // Node for 'var x'
        Node assignNode = varNode.getNext(); // Node for 'x = 1'
        Node nameX = assignNode.getFirstChild(); // Node for 'x'
        
        // The LHS of an assignment is not consumed by the parent (the assignment itself).
        assertFalse(analyzer.valueConsumedByParent(nameX, assignNode));
    }
}
```