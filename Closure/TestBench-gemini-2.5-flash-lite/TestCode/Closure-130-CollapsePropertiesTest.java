package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.jscomp.GlobalNamespace.Ref.Type;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.JSType;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollapsePropertiesTest {
    // Helper to create a compiler with default settings
    private static CollapseProperties createCompiler(boolean collapsePropertiesOnExternTypes, boolean inlineAliases) {
        AbstractCompiler compiler = new Compiler();
        return new CollapseProperties(compiler, collapsePropertiesOnExternTypes, inlineAliases);
    }

    // Helper to create a simple AST for testing
    private Node createAst(String code) {
        Compiler compiler = new Compiler();
        Node root = compiler.parseSyntheticCode(code);
        return root;
    }

    // Test case 1: Basic property collapse
    @Test
    public void testBasicCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a.b = 1;");
        collapseProperties.process(null, root);
        // Expected: var a$b = 1;
        assertEquals("var a$b=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 2: Nested property collapse
    @Test
    public void testNestedCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a.b = {}; a.b.c = 1;");
        collapseProperties.process(null, root);
        // Expected: var a$b$c = 1;
        assertEquals("var a$b$c=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 3: No collapse if aliased
    @Test
    public void testAliasedPropertyNoCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; var b = a; a.b = 1;");
        collapseProperties.process(null, root);
        // Expected: var a={};var b=a;a.b=1; (no change)
        assertEquals("var a={};var b=a;a.b=1;", root.toString());
    }

    // Test case 4: Collapse if alias is inlined (inlineAliases = true)
    @Test
    public void testInlineAlias() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, true);
        Node root = createAst("var a = {}; var b = a; a.b = 1;");
        collapseProperties.process(null, root);
        // Expected: var a$b = 1;
        assertEquals("var a$b=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 5: Object literal property collapse
    @Test
    public void testObjectLiteralCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { b: 1 };");
        collapseProperties.process(null, root);
        // Expected: var a$b = 1;
        assertEquals("var a$b=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 6: Nested object literal property collapse
    @Test
    public void testNestedObjectLiteralCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { b: { c: 1 } };");
        collapseProperties.process(null, root);
        // Expected: var a$b$c = 1;
        assertEquals("var a$b$c=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 7: Object literal with function property
    @Test
    public void testObjectLiteralFunctionCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { b: function() {} };");
        collapseProperties.process(null, root);
        // Expected: var a$b = function() {};
        assertEquals("var a$b=function(){};", root.getChildAtIndex(0).toString());
    }

    // Test case 8: Global function property collapse
    @Test
    public void testGlobalFunctionCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("function a() {}; a.b = 1;");
        collapseProperties.process(null, root);
        // Expected: function a() {}; var a$b = 1;
        assertEquals("function a(){};var a$b=1;", root.toString());
    }

    // Test case 9: Object literal with multiple properties
    @Test
    public void testObjectLiteralMultipleProperties() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { b: 1, c: 2 };");
        collapseProperties.process(null, root);
        // Expected: var a$b=1;var a$c=2;
        assertEquals("var a$b=1;var a$c=2;", root.toString());
    }

    // Test case 10: Properties defined in different scopes
    @Test
    public void testPropertiesInDifferentScopes() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a.b = 1; function f() { a.c = 2; } f();");
        collapseProperties.process(null, root);
        // Expected: var a={};a.b=1;function f(){a.c=2;}f(); (no collapse because 'a' is not exclusively used for properties)
        assertEquals("var a={};a.b=1;function f(){a.c=2;}f();", root.toString());
    }

    // Test case 11: Property defined before object declaration (should not collapse)
    @Test
    public void testPropertyBeforeObjectDecl() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("a.b = 1; var a = {};");
        collapseProperties.process(null, root);
        // Expected: a.b=1;var a={}; (no change)
        assertEquals("a.b=1;var a={};", root.toString());
    }

    // Test case 12: Property added to extern type (collapsePropertiesOnExternTypes = true)
    @Test
    public void testExternTypePropertyCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(true, false);
        Node externs = createAst("/** @externs */ var String;");
        Node root = createAst("String.foo = 1;");
        collapseProperties.process(externs, root);
        // Expected: String.foo = 1; (No change, as String is a primitive type)
        assertEquals("String.foo=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 13: Property added to a user-defined extern object type
    @Test
    public void testUserDefinedExternObjectCollapse() throws Exception {
        CollapseProperties collapseProperties = createCompiler(true, false);
        Node externs = createAst("/** @externs */ var MyNs = {};");
        Node root = createAst("MyNs.prop = 1;");
        collapseProperties.process(externs, root);
        // Expected: var MyNs$prop = 1;
        assertEquals("var MyNs$prop=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 14: Complex assignment involving property collapse
    @Test
    public void testComplexAssignment() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; var b = (a.c = 1);");
        collapseProperties.process(null, root);
        // Expected: var a={};var b=(a$c=1);
        assertEquals("var a={};var b=(a$c=1);", root.toString());
    }

    // Test case 15: Property access with bracket notation
    @Test
    public void testBracketNotation() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a['b'] = 1;");
        collapseProperties.process(null, root);
        // Expected: var a={};a['b']=1; (no change)
        assertEquals("var a={};a[\"b\"]=1;", root.toString());
    }

    // Test case 16: Property reassignment
    @Test
    public void testPropertyReassignment() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a.b = 1; a.b = 2;");
        collapseProperties.process(null, root);
        // Expected: var a$b = 2;
        assertEquals("var a$b=2;", root.getChildAtIndex(0).toString());
    }

    // Test case 17: Property deletion
    @Test
    public void testPropertyDeletion() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { b: 1 }; delete a.b;");
        collapseProperties.process(null, root);
        // Expected: var a={};delete a.b; (no change because delete makes it unsafe)
        assertEquals("var a={};delete a.b;", root.toString());
    }

    // Test case 18: Namespace redefinition warning scenario
    @Test
    public void testNamespaceRedefinition() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a.b = 1; a = 2;");
        collapseProperties.process(null, root);
        // Expected: The system might report a warning, but the code structure should reflect attempts to collapse.
        // The expected output is actually the original code because 'a' is redefined, making it unsafe to collapse its properties.
        assertEquals("var a={};a.b=1;a=2;", root.toString());
    }

    // Test case 19: Unsafe 'this' usage in a collapsed function
    @Test
    public void testUnsafeThis() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { method: function() { return this; } };");
        collapseProperties.process(null, root);
        // The function 'method' should not be collapsed because 'this' is used unsafely.
        assertEquals("var a={method:function(){return this}};", root.toString());
    }

    // Test case 20: Flattening of prefixes
    @Test
    public void testFlattenPrefixes() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a.b = {}; a.b.c = 1;");
        collapseProperties.process(null, root);
        // Expected: var a$b$c = 1;
        assertEquals("var a$b$c=1;", root.getChildAtIndex(0).toString());
    }

    // Test case 21: Stub declaration for late properties
    @Test
    public void testStubDeclaration() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; function f() { a.b = 1; } f();");
        collapseProperties.process(null, root);
        // Expected: var a = {}; function f() { a.b = 1; } f(); (no stub created here because 'a' is not exclusively used for properties)
        assertEquals("var a={};function f(){a.b=1;}f();", root.toString());
    }

    // Test case 22: Object literal with numeric keys
    @Test
    public void testNumericKeysInObjectLiteral() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { 1: 10, 2: 20 };");
        collapseProperties.process(null, root);
        // Expected: var a$1=10;var a$2=20; (numeric keys are encoded differently)
        assertEquals("var a1=10;var a2=20;", root.toString());
    }

    // Test case 23: Object literal with special characters in keys
    @Test
    public void testSpecialCharsInObjectLiteralKeys() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { 'key-with-dash': 1, 'key with space': 2 };");
        collapseProperties.process(null, root);
        // Expected: No collapse for keys with special characters.
        assertEquals("var a={'key-with-dash':1,'key with space':2};", root.toString());
    }

    // Test case 24: Constant property assignment
    @Test
    public void testConstantPropertyAssignment() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; /** @const */ a.b = 1;");
        collapseProperties.process(null, root);
        // Expected: var a$b = 1; (and a$b should be marked as constant)
        Node resultNode = root.getChildAtIndex(0);
        assertTrue(resultNode.isVar());
        Node varNameNode = resultNode.getFirstChild();
        assertTrue(varNameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
        // Also check the original assignment transformed correctly
        assertEquals("var a$b=1;", resultNode.toString());
    }

    // Test case 25: Assignment to a non-object global
    @Test
    public void testAssignToNonObject() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = 1; a.b = 2;");
        collapseProperties.process(null, root);
        // Expected: var a=1;a.b=2; (no change)
        assertEquals("var a=1;a.b=2;", root.toString());
    }

    // Test case 26: Method call on a collapsed property
    @Test
    public void testMethodCallOnCollapsedProperty() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; a.b = function() {}; a.b();");
        collapseProperties.process(null, root);
        // Expected: var a$b=function(){};a$b();
        assertEquals("var a$b=function(){};a$b();", root.toString());
    }

    // Test case 27: Nested aliasing with inlineAliases = true
    @Test
    public void testNestedAliasingInline() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, true);
        Node root = createAst("var a = { b: { c: 1 } }; var d = a.b; a.b.c = 2;");
        collapseProperties.process(null, root);
        // Expected: var a$b$c = 2;
        assertEquals("var a$b$c=2;", root.getChildAtIndex(0).toString());
    }

    // Test case 28: Property access as a function argument (FREE_CALL)
    @Test
    public void testFreeCall() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = {}; function f(x) {}; f(a.b);");
        collapseProperties.process(null, root);
        // Expected: var a={};function f(x){};f(a.b); (no change because a.b is not defined as a property of 'a' in a way that it could be flattened)
        assertEquals("var a={};function f(x){};f(a.b);", root.toString());
    }

    // Test case 29: Object literal with getter/setter
    @Test
    public void testGetterSetterInObjectLiteral() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var a = { get b() { return 1; }, set c(v) {} };");
        collapseProperties.process(null, root);
        // Expected: var a={get b(){return 1;},set c(v){}}; (getters and setters are not collapsed)
        assertEquals("var a={get b(){return 1;},set c(v){}};", root.toString());
    }

    // Test case 30: Global object with only properties, no direct assignment
    @Test
    public void testGlobalObjectOnlyProperties() throws Exception {
        CollapseProperties collapseProperties = createCompiler(false, false);
        Node root = createAst("var ns = {}; ns.a = 1; ns.b = 2;");
        collapseProperties.process(null, root);
        // Expected: var ns$a=1;var ns$b=2;
        assertEquals("var ns$a=1;var ns$b=2;", root.toString());
    }
}
