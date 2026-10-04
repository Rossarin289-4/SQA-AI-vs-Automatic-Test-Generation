package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.jscomp.GlobalNamespace.Ref.Type;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CollapsePropertiesTest {

    // Helper method to create a minimal compiler instance for testing.
    private static AbstractCompiler createCompiler() {
        Compiler compiler = new Compiler();
        compiler.initCompilerOptionsIfTesting(); // This method exists in Compiler, not AbstractCompiler
        return compiler;
    }

    // Helper method to parse a JS string into a Node.
    private Node parseCode(String code) {
        Compiler compiler = (Compiler) createCompiler();
        // parse method expects JSSourceFile or similar, not String.
        // For testing, we can use parse directly on a string if available,
        // or simulate the compilation process.
        // Based on the typical usage, `parse` likely creates a root Node.
        // Assuming a simplified parse for testing purposes.
        // The actual compiler.parse() takes externs and root.
        // For a simple code snippet, we can parse it into a single root node.
        // A more robust way would be to use `compiler.parse(code)` which returns a Node.
        return compiler.parse(code);
    }

    // Helper method to run the CollapseProperties pass.
    private void runCollapseProperties(String code, boolean collapseExterns, boolean inlineAliases) {
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, collapseExterns, inlineAliases);
        cp.process(null, root);
    }

    @Test
    public void testSimplePropertyCollapse() throws Exception {
        String code = "var a = {}; a.b = 1; a.c = 2;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node firstVarDecl = root.getFirstChild();
        assertTrue(firstVarDecl.isVar() && firstVarDecl.getFirstChild().isName() && firstVarDecl.getFirstChild().getString().equals("a"));
        Node a_b_decl = firstVarDecl.getNext();
        assertTrue(a_b_decl.isVar() && a_b_decl.getFirstChild().isName() && a_b_decl.getFirstChild().getString().equals("a$b"));
        Node a_c_decl = a_b_decl.getNext();
        assertTrue(a_c_decl.isVar() && a_c_decl.getFirstChild().isName() && a_c_decl.getFirstChild().getString().equals("a$c"));
    }

    @Test
    public void testNestedPropertyCollapse() throws Exception {
        String code = "var a = {b: {}}; a.b.c = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node firstVarDecl = root.getFirstChild();
        assertTrue(firstVarDecl.isVar() && firstVarDecl.getFirstChild().isName() && firstVarDecl.getFirstChild().getString().equals("a"));
        Node a_b_objLit = firstVarDecl.getFirstChild().getFirstChild();
        assertTrue(a_b_objLit.isObjectLit());
        Node a_b_c_decl = root.getLastChild();
        assertTrue(a_b_c_decl.isVar() && a_b_c_decl.getFirstChild().isName() && a_b_c_decl.getFirstChild().getString().equals("a$b$c"));
        Node value = a_b_c_decl.getFirstChild().getFirstChild();
        assertTrue(value.isNumber() && value.getDouble() == 1.0);
    }

    @Test
    public void testObjectLiteralCollapse() throws Exception {
        String code = "var a = {b: 1, c: 2};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node firstVarDecl = root.getFirstChild();
        assertTrue(firstVarDecl.isVar() && firstVarDecl.getFirstChild().isName() && firstVarDecl.getFirstChild().getString().equals("a"));
        Node a_b_decl = firstVarDecl.getNext();
        assertTrue(a_b_decl.isVar() && a_b_decl.getFirstChild().isName() && a_b_decl.getFirstChild().getString().equals("a$b"));
        Node a_c_decl = a_b_decl.getNext();
        assertTrue(a_c_decl.isVar() && a_c_decl.getFirstChild().isName() && a_c_decl.getFirstChild().getString().equals("a$c"));
    }

    @Test
    public void testObjectLiteralWithFunctionCollapse() throws Exception {
        String code = "var a = {b: function() {}};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node firstVarDecl = root.getFirstChild();
        assertTrue(firstVarDecl.isVar() && firstVarDecl.getFirstChild().isName() && firstVarDecl.getFirstChild().getString().equals("a"));
        Node a_b_decl = firstVarDecl.getNext();
        assertTrue(a_b_decl.isVar() && a_b_decl.getFirstChild().isName() && a_b_decl.getFirstChild().getString().equals("a$b"));
        assertTrue(a_b_decl.getFirstChild().hasChildren());
        assertTrue(a_b_decl.getFirstChild().getFirstChild().isFunction());
    }

    @Test
    public void testObjectLiteralWithNestedObjectCollapse() throws Exception {
        String code = "var a = {b: {c: 1}};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node firstVarDecl = root.getFirstChild();
        assertTrue(firstVarDecl.isVar() && firstVarDecl.getFirstChild().isName() && firstVarDecl.getFirstChild().getString().equals("a"));
        Node a_b_decl = firstVarDecl.getNext();
        assertTrue(a_b_decl.isVar() && a_b_decl.getFirstChild().isName() && a_b_decl.getFirstChild().getString().equals("a$b"));
        assertTrue(a_b_decl.getFirstChild().hasChildren());
        assertTrue(a_b_decl.getFirstChild().getFirstChild().isObjectLit());
        Node a_b_c_decl = a_b_decl.getNext();
        assertTrue(a_b_c_decl.isVar() && a_b_c_decl.getFirstChild().isName() && a_b_c_decl.getFirstChild().getString().equals("a$b$c"));
        assertTrue(a_b_c_decl.getFirstChild().hasChildren());
        assertTrue(a_b_c_decl.getFirstChild().getFirstChild().isNumber() && a_b_c_decl.getFirstChild().getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testChainedPropertyAssignment() throws Exception {
        String code = "var a; var b; a = b = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node varA = root.getFirstChild();
        assertTrue(varA.isVar() && varA.getFirstChild().isName() && varA.getFirstChild().getString().equals("a"));
        Node varB = varA.getNext();
        assertTrue(varB.isVar() && varB.getFirstChild().isName() && varB.getFirstChild().getString().equals("b"));
        Node assignExpr = varB.getNext();
        assertTrue(assignExpr.isExprResult());
        Node assign = assignExpr.getFirstChild();
        assertTrue(assign.isAssign());
        Node bName = assign.getFirstChild();
        assertTrue(bName.isName() && bName.getString().equals("b"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testPropertyAccessOnGloballyAliasedObject() throws Exception {
        String code = "var a = {}; var b = a; b.c = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node varADecl = root.getFirstChild();
        assertTrue(varADecl.isVar() && varADecl.getFirstChild().isName() && varADecl.getFirstChild().getString().equals("a"));
        Node varBDecl = varADecl.getNext();
        assertTrue(varBDecl.isVar() && varBDecl.getFirstChild().isName() && varBDecl.getFirstChild().getString().equals("b"));
        assertTrue(varBDecl.getFirstChild().getFirstChild().isName() && varBDecl.getFirstChild().getFirstChild().getString().equals("a"));

        Node bcAssign = root.getLastChild(); // b.c = 1
        assertTrue(bcAssign.isExprResult());
        Node assign = bcAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node bcGetProp = assign.getFirstChild();
        assertTrue(bcGetProp.isGetProp());
        assertTrue(bcGetProp.getFirstChild().isName() && bcGetProp.getFirstChild().getString().equals("b"));
        assertTrue(bcGetProp.getLastChild().isString() && bcGetProp.getLastChild().getString().equals("c"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testNoCollapseForAliasedObject() throws Exception {
        String code = "var ns = {}; var alias = ns; ns.prop = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node aliasDecl = nsDecl.getNext();
        assertTrue(aliasDecl.isVar() && aliasDecl.getFirstChild().isName() && aliasDecl.getFirstChild().getString().equals("alias"));
        assertTrue(aliasDecl.getFirstChild().getFirstChild().isName() && aliasDecl.getFirstChild().getFirstChild().getString().equals("ns"));

        Node nsPropAssign = aliasDecl.getNext();
        assertTrue(nsPropAssign.isExprResult());
        Node assign = nsPropAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node nsPropGetProp = assign.getFirstChild();
        assertTrue(nsPropGetProp.isGetProp());
        assertTrue(nsPropGetProp.getFirstChild().isName() && nsPropGetProp.getFirstChild().getString().equals("ns"));
        assertTrue(nsPropGetProp.getLastChild().isString() && nsPropGetProp.getLastChild().getString().equals("prop"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testInlineAliases() throws Exception {
        String code = "var ns = { val: 1 }; function f() { var x = ns; x.val = 2; }";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, true);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsValue = nsDecl.getFirstChild().getFirstChild();
        assertTrue(nsValue.isObjectLit());
        Node nsValDecl = nsValue.getFirstChild();
        assertTrue(nsValDecl.isString() && nsValDecl.getString().equals("val"));
        assertTrue(nsValDecl.getFirstChild().isNumber() && nsValDecl.getFirstChild().getDouble() == 1.0);

        Node fnDecl = nsDecl.getNext();
        assertTrue(fnDecl.isFunction());
        Node fnName = fnDecl.getFirstChild();
        assertTrue(fnName.isName() && fnName.getString().equals("f"));
        Node fnBody = fnName.getNext();
        assertTrue(fnBody.isBlock());

        Node varXDecl = fnBody.getFirstChild();
        assertTrue(varXDecl.isVar() && varXDecl.getFirstChild().isName() && varXDecl.getFirstChild().getString().equals("x"));
        assertTrue(varXDecl.getFirstChild().getFirstChild().isName() && varXDecl.getFirstChild().getFirstChild().getString().equals("ns"));

        Node xValAssign = varXDecl.getNext();
        assertTrue(xValAssign.isExprResult());
        Node assign = xValAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node xValGetProp = assign.getFirstChild();
        assertTrue(xValGetProp.isGetProp());
        assertTrue(xValGetProp.getFirstChild().isName() && xValGetProp.getFirstChild().getString().equals("ns")); // Should be ns after inlining
        assertTrue(xValGetProp.getLastChild().isString() && xValGetProp.getLastChild().getString().equals("val"));
        Node two = assign.getLastChild();
        assertTrue(two.isNumber() && two.getDouble() == 2.0);
    }

    @Test
    public void testNoInlineForLocalAliasIfNamespaceIsModified() throws Exception {
        String code = "var ns = {}; var alias = ns; ns.prop = 1; alias.prop = 2;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, true);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node aliasDecl = nsDecl.getNext();
        assertTrue(aliasDecl.isVar() && aliasDecl.getFirstChild().isName() && aliasDecl.getFirstChild().getString().equals("alias"));
        assertTrue(aliasDecl.getFirstChild().getFirstChild().isName() && aliasDecl.getFirstChild().getFirstChild().getString().equals("ns"));

        Node nsPropAssign = aliasDecl.getNext();
        assertTrue(nsPropAssign.isExprResult());
        Node assignNs = nsPropAssign.getFirstChild();
        assertTrue(assignNs.isAssign());
        Node nsPropGetProp = assignNs.getFirstChild();
        assertTrue(nsPropGetProp.isGetProp() && nsPropGetProp.getFirstChild().isName() && nsPropGetProp.getFirstChild().getString().equals("ns") && nsPropGetProp.getLastChild().isString() && nsPropGetProp.getLastChild().getString().equals("prop"));
        Node one = assignNs.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);

        Node aliasPropAssign = root.getLastChild();
        assertTrue(aliasPropAssign.isExprResult());
        Node assignAlias = aliasPropAssign.getFirstChild();
        assertTrue(assignAlias.isAssign());
        Node aliasPropGetProp = assignAlias.getFirstChild();
        assertTrue(aliasPropGetProp.isGetProp() && aliasPropGetProp.getFirstChild().isName() && aliasPropGetProp.getFirstChild().getString().equals("alias") && aliasPropGetProp.getLastChild().isString() && aliasPropGetProp.getLastChild().getString().equals("prop"));
        Node two = assignAlias.getLastChild();
        assertTrue(two.isNumber() && two.getDouble() == 2.0);
    }

    @Test
    public void testPrototypePropertyAccess() throws Exception {
        String code = "Function.prototype.method = function() {};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node assignExpr = root.getFirstChild();
        assertTrue(assignExpr.isExprResult());
        Node assign = assignExpr.getFirstChild();
        assertTrue(assign.isAssign());
        Node getProp = assign.getFirstChild();
        assertTrue(getProp.isGetProp());
        Node functionNode = assign.getLastChild();
        assertTrue(functionNode.isFunction());
        Node outerGetProp = getProp.getFirstChild();
        assertTrue(outerGetProp.isGetProp());
        Node functionName = outerGetProp.getFirstChild();
        assertTrue(functionName.isName() && functionName.getString().equals("Function"));
        Node prototypeName = outerGetProp.getLastChild();
        assertTrue(prototypeName.isString() && prototypeName.getString().equals("prototype"));
        Node methodName = getProp.getLastChild();
        assertTrue(methodName.isString() && methodName.getString().equals("method"));
    }

    @Test
    public void testPrototypePropertyAccess_CollapseExterns() throws Exception {
        String code = "Function.prototype.method = function() {};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, true, false);
        cp.process(null, root);
        Node assignExpr = root.getFirstChild();
        assertTrue(assignExpr.isExprResult());
        Node assign = assignExpr.getFirstChild();
        assertTrue(assign.isAssign());
        Node nameNode = assign.getFirstChild();
        assertTrue(nameNode.isName());
        assertEquals("Function$prototype$method", nameNode.getString());
        Node functionNode = assign.getLastChild();
        assertTrue(functionNode.isFunction());
    }

    @Test
    public void testNamespaceRedefinitionWarning() throws Exception {
        String code = "var ns = {}; ns = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsAssign = root.getLastChild();
        assertTrue(nsAssign.isExprResult());
        Node assign = nsAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node nsName = assign.getFirstChild();
        assertTrue(nsName.isName() && nsName.getString().equals("ns"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testUnsafeNamespaceWarning() throws Exception {
        String code = "var ns; ns.a = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsAssign = root.getLastChild();
        assertTrue(nsAssign.isExprResult());
        Node assign = nsAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node nsPropGetProp = assign.getFirstChild();
        assertTrue(nsPropGetProp.isGetProp());
        assertTrue(nsPropGetProp.getFirstChild().isName() && nsPropGetProp.getFirstChild().getString().equals("ns"));
        assertTrue(nsPropGetProp.getLastChild().isString() && nsPropGetProp.getLastChild().getString().equals("a"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testNoCollapseForClassOrEnumDeclarations() throws Exception {
        String code = "/** @constructor */ var MyClass = function() {}; MyClass.staticProp = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node myClassDecl = root.getFirstChild();
        assertTrue(myClassDecl.isVar() && myClassDecl.getFirstChild().isName() && myClassDecl.getFirstChild().getString().equals("MyClass"));
        assertTrue(myClassDecl.getFirstChild().hasChildren());
        assertTrue(myClassDecl.getFirstChild().getFirstChild().isFunction());

        Node staticPropAssign = root.getLastChild();
        assertTrue(staticPropAssign.isExprResult());
        Node assign = staticPropAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node getProp = assign.getFirstChild();
        assertTrue(getProp.isGetProp());
        assertTrue(getProp.getFirstChild().isName() && getProp.getFirstChild().getString().equals("MyClass"));
        assertTrue(getProp.getLastChild().isString() && getProp.getLastChild().getString().equals("staticProp"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testCollapseIfConstructorAnnotatedButNotFunction() throws Exception {
        String code = "/** @constructor */ var MyObj = {}; MyObj.prop = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node myObjDecl = root.getFirstChild();
        assertTrue(myObjDecl.isVar() && myObjObj.getFirstChild().isName() && myObjObj.getFirstChild().getString().equals("MyObj"));
        assertTrue(myObjObj.getFirstChild().hasChildren());
        assertTrue(myObjObj.getFirstChild().getFirstChild().isObjectLit());

        Node propAssign = root.getLastChild();
        assertTrue(propAssign.isExprResult());
        Node assign = propAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node getProp = assign.getFirstChild();
        assertTrue(getProp.isGetProp());
        assertTrue(getProp.getFirstChild().isName() && getProp.getFirstChild().getString().equals("MyObj"));
        assertTrue(getProp.getLastChild().isString() && getProp.getLastChild().getString().equals("prop"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testObjectLiteralKeyThatIsNotIdentifier() throws Exception {
        String code = "var ns = {'123': 1};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsObjLit = nsDecl.getFirstChild().getFirstChild();
        assertTrue(nsObjLit.isObjectLit());

        Node varFor123 = nsDecl.getNext();
        assertTrue(varFor123.isVar());
        Node nameFor123 = varFor123.getFirstChild();
        assertTrue(nameFor123.isName());
        assertTrue(nameFor123.getString().startsWith("ns_")); // Expecting an arbitrary name like ns_1
        assertTrue(nameFor123.hasChildren());
        assertTrue(nameFor123.getFirstChild().isNumber() && nameFor123.getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testEncodeDollarSign() throws Exception {
        String code = "var ns = {}; ns.$ = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node varForDollar = nsDecl.getNext();
        assertTrue(varForDollar.isVar());
        Node nameForDollar = varForDollar.getFirstChild();
        assertTrue(nameForDollar.isName());
        assertEquals("ns$0", nameForDollar.getString()); // '$' encoded as '$0'
        assertTrue(nameForDollar.hasChildren());
        assertTrue(nameForDollar.getFirstChild().isNumber() && nameForDollar.getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testNestedDollarSignEncoding() throws Exception {
        String code = "var ns = {sub: { '$': 1 }};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsSubDecl = nsDecl.getNext();
        assertTrue(nsSubDecl.isVar() && nsSubDecl.getFirstChild().isName() && nsSubDecl.getFirstChild().getString().equals("ns$sub"));
        assertTrue(nsSubDecl.getFirstChild().hasChildren());
        assertTrue(nsSubDecl.getFirstChild().getFirstChild().isObjectLit());

        Node nsSubFnDecl = nsSubDecl.getNext();
        assertTrue(nsSubFnDecl.isVar() && nsSubFnDecl.getFirstChild().isName() && nsSubFnDecl.getFirstChild().getString().equals("ns$sub$0"));
        assertTrue(nsSubFnDecl.getFirstChild().hasChildren());
        assertTrue(nsSubFnDecl.getFirstChild().getFirstChild().isNumber() && nsSubFnDecl.getFirstChild().getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testPropertiesAddedLateInLocalScope() throws Exception {
        String code = "var ns = {}; function f() { ns.lateProp = 1; }";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node fnDecl = nsDecl.getNext();
        assertTrue(fnDecl.isFunction());
        Node fnName = fnDecl.getFirstChild();
        assertTrue(fnName.isName() && fnName.getString().equals("f"));
        Node fnBody = fnName.getNext();
        assertTrue(fnBody.isBlock());
        Node latePropAssign = fnBody.getLastChild();
        assertTrue(latePropAssign.isExprResult());
        Node assign = latePropAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node getProp = assign.getFirstChild();
        assertTrue(getProp.isGetProp());
        assertTrue(getProp.getFirstChild().isName() && getProp.getFirstChild().getString().equals("ns"));
        assertTrue(getProp.getLastChild().isString() && getProp.getLastChild().getString().equals("lateProp"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);
    }

    @Test
    public void testAddStubsForUndeclaredProperties() throws Exception {
        String code = "var ns = {}; ns.prop1 = 1; function f() { ns.prop2 = 2; }";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsProp1Assign = nsDecl.getNext();
        assertTrue(nsProp1Assign.isExprResult());
        Node assign = nsProp1Assign.getFirstChild();
        assertTrue(assign.isAssign());
        Node nsProp1Name = assign.getFirstChild();
        assertTrue(nsProp1Name.isName() && nsProp1Name.getString().equals("ns$prop1"));
        Node one = assign.getLastChild();
        assertTrue(one.isNumber() && one.getDouble() == 1.0);

        Node fnDecl = nsProp1Assign.getNext();
        assertTrue(fnDecl.isFunction());
        Node fnName = fnDecl.getFirstChild();
        assertTrue(fnName.isName() && fnName.getString().equals("f"));
        Node fnBody = fnName.getNext();
        assertTrue(fnBody.isBlock());
        Node nsProp2Assign = fnBody.getLastChild();
        assertTrue(nsProp2Assign.isExprResult());
        Node assign2 = nsProp2Assign.getFirstChild();
        assertTrue(assign2.isAssign());
        Node nsProp2GetProp = assign2.getFirstChild();
        assertTrue(nsProp2GetProp.isGetProp());
        assertTrue(nsProp2GetProp.getFirstChild().isName() && nsProp2GetProp.getFirstChild().getString().equals("ns"));
        assertTrue(nsProp2GetProp.getLastChild().isString() && nsProp2GetProp.getLastChild().getString().equals("prop2"));
        Node two = assign2.getLastChild();
        assertTrue(two.isNumber() && two.getDouble() == 2.0);
    }

    @Test
    public void testNoCollapseForGetProp() throws Exception {
        String code = "var ns = {}; var x = ns.prop;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node xDecl = nsDecl.getNext();
        assertTrue(xDecl.isVar() && xDecl.getFirstChild().isName() && xDecl.getFirstChild().getString().equals("x"));
        Node xValue = xDecl.getFirstChild().getFirstChild();
        assertTrue(xValue.isGetProp());
        assertTrue(xValue.getFirstChild().isName() && xValue.getFirstChild().getString().equals("ns"));
        assertTrue(xValue.getLastChild().isString() && xValue.getLastChild().getString().equals("prop"));
    }

    @Test
    public void testFunctionDeclarationCollapse() throws Exception {
        String code = "var fn = function() {}; fn.prop = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node fnDecl = root.getFirstChild();
        assertTrue(fnDecl.isVar() && fnDecl.getFirstChild().isName() && fnDecl.getFirstChild().getString().equals("fn"));
        assertTrue(fnDecl.getFirstChild().hasChildren());
        assertTrue(fnDecl.getFirstChild().getFirstChild().isFunction());

        Node fnPropAssign = root.getLastChild();
        assertTrue(fnPropAssign.isVar());
        Node fnPropName = fnPropAssign.getFirstChild();
        assertTrue(fnPropName.isName() && fnPropName.getString().equals("fn$prop"));
        assertTrue(fnPropName.hasChildren());
        assertTrue(fnPropName.getFirstChild().isNumber() && fnPropName.getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testAnonymousFunctionPropertyCollapse() throws Exception {
        String code = "var ns = {}; ns.anonFn = function() {}; ns.anonFn.prop = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsAnonFnDecl = nsDecl.getNext();
        assertTrue(nsAnonFnDecl.isVar() && nsAnonFnDecl.getFirstChild().isName() && nsAnonFnDecl.getFirstChild().getString().equals("ns$anonFn"));
        assertTrue(nsAnonFnDecl.getFirstChild().hasChildren());
        assertTrue(nsAnonFnDecl.getFirstChild().getFirstChild().isFunction());

        Node nsAnonFnPropDecl = nsAnonFnDecl.getNext();
        assertTrue(nsAnonFnPropDecl.isVar() && nsAnonFnPropDecl.getFirstChild().isName() && nsAnonFnPropDecl.getFirstChild().getString().equals("ns$anonFn$prop"));
        assertTrue(nsAnonFnPropDecl.getFirstChild().hasChildren());
        assertTrue(nsAnonFnPropDecl.getFirstChild().getFirstChild().isNumber() && nsAnonFnPropDecl.getFirstChild().getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testNestedObjectLiteralWithFunction() throws Exception {
        String code = "var ns = { sub: { fn: function() {} } };";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        Node nsSubDecl = nsDecl.getNext();
        assertTrue(nsSubDecl.isVar() && nsSubDecl.getFirstChild().isName() && nsSubDecl.getFirstChild().getString().equals("ns$sub"));
        assertTrue(nsSubDecl.getFirstChild().hasChildren());
        assertTrue(nsSubDecl.getFirstChild().getFirstChild().isObjectLit());

        Node nsSubFnDecl = nsSubDecl.getNext();
        assertTrue(nsSubFnDecl.isVar() && nsSubFnDecl.getFirstChild().isName() && nsSubFnDecl.getFirstChild().getString().equals("ns$sub$fn"));
        assertTrue(nsSubFnDecl.getFirstChild().hasChildren());
        assertTrue(nsSubFnDecl.getFirstChild().getFirstChild().isFunction());
    }

    @Test
    public void testMultiplePropertiesInObjectLiteral() throws Exception {
        String code = "var obj = { p1: 1, p2: 'hello', p3: true };";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node objDecl = root.getFirstChild();
        assertTrue(objDecl.isVar() && objDecl.getFirstChild().isName() && objDecl.getFirstChild().getString().equals("obj"));

        Node objP1Decl = objDecl.getNext();
        assertTrue(objP1Decl.isVar() && objP1Decl.getFirstChild().isName() && objP1Decl.getFirstChild().getString().equals("obj$p1"));
        assertTrue(objP1Decl.getFirstChild().hasChildren());
        assertTrue(objP1Decl.getFirstChild().getFirstChild().isNumber() && objP1Decl.getFirstChild().getFirstChild().getDouble() == 1.0);

        Node objP2Decl = objP1Decl.getNext();
        assertTrue(objP2Decl.isVar() && objP2Decl.getFirstChild().isName() && objP2Decl.getFirstChild().getString().equals("obj$p2"));
        assertTrue(objP2Decl.getFirstChild().hasChildren());
        assertTrue(objP2Decl.getFirstChild().getFirstChild().isString() && objP2Decl.getFirstChild().getFirstChild().getString().equals("hello"));

        Node objP3Decl = objP2Decl.getNext();
        assertTrue(objP3Decl.isVar() && objP3Decl.getFirstChild().isName() && objP3Decl.getFirstChild().getString().equals("obj$p3"));
        assertTrue(objP3Decl.getFirstChild().hasChildren());
        assertTrue(objP3Decl.getFirstChild().getType() == Token.TRUE);
    }

    @Test
    public void testComplexNestedObjectLiteral() throws Exception {
        String code = "var ns = { a: { b: { c: 1 } }, d: 2 };";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));

        Node nsADecl = nsDecl.getNext();
        assertTrue(nsADecl.isVar() && nsADecl.getFirstChild().isName() && nsADecl.getFirstChild().getString().equals("ns$a"));
        assertTrue(nsADecl.getFirstChild().hasChildren());
        assertTrue(nsADecl.getFirstChild().getFirstChild().isObjectLit());

        Node nsABDecl = nsADecl.getNext();
        assertTrue(nsABDecl.isVar() && nsABDecl.getFirstChild().isName() && nsABDecl.getFirstChild().getString().equals("ns$a$b"));
        assertTrue(nsABDecl.getFirstChild().hasChildren());
        assertTrue(nsABDecl.getFirstChild().getFirstChild().isObjectLit());

        Node nsABCDecl = nsABDecl.getNext();
        assertTrue(nsABCDecl.isVar() && nsABCDecl.getFirstChild().isName() && nsABCDecl.getFirstChild().getString().equals("ns$a$b$c"));
        assertTrue(nsABCDecl.getFirstChild().hasChildren());
        assertTrue(nsABCDecl.getFirstChild().getFirstChild().isNumber() && nsABCDecl.getFirstChild().getFirstChild().getDouble() == 1.0);

        Node nsDDecl = nsABCDecl.getNext();
        assertTrue(nsDDecl.isVar() && nsDDecl.getFirstChild().isName() && nsDDecl.getFirstChild().getString().equals("ns$d"));
        assertTrue(nsDDecl.getFirstChild().hasChildren());
        assertTrue(nsDDecl.getFirstChild().getFirstChild().isNumber() && nsDDecl.getFirstChild().getFirstChild().getDouble() == 2.0);
    }

    @Test
    public void testPropertyWithDollarSign() throws Exception {
        String code = "var ns = {}; ns['prop$sub'] = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));

        Node propAssign = nsDecl.getNext();
        assertTrue(propAssign.isVar());
        Node propName = propAssign.getFirstChild();
        assertTrue(propName.isName());
        assertEquals("ns$prop0sub", propName.getString());
        assertTrue(propName.hasChildren());
        assertTrue(propName.getFirstChild().isNumber() && propName.getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testConstructorWithNoProperties() throws Exception {
        String code = "/** @constructor */ var MyClass = function() {};";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);
        Node myClassDecl = root.getFirstChild();
        assertTrue(myClassDecl.isVar() && myClassDecl.getFirstChild().isName() && myClassDecl.getFirstChild().getString().equals("MyClass"));
        assertTrue(myClassDecl.getFirstChild().hasChildren());
        assertTrue(myClassDecl.getFirstChild().getFirstChild().isFunction());
        assertNull(myClassDecl.getNext());
    }

    @Test
    public void testEnumWithProperties() throws Exception {
        String code = "/** @enum {number} */ var MyEnum = { A: 1, B: 2 };";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node myEnumDecl = root.getFirstChild();
        assertTrue(myEnumDecl.isVar() && myEnumDecl.getFirstChild().isName() && myEnumDecl.getFirstChild().getString().equals("MyEnum"));
        assertTrue(myEnumDecl.getFirstChild().hasChildren());
        assertTrue(myEnumDecl.getFirstChild().getFirstChild().isObjectLit());

        Node myEnumADecl = myEnumDecl.getNext();
        assertTrue(myEnumADecl.isVar() && myEnumADecl.getFirstChild().isName() && myEnumADecl.getFirstChild().getString().equals("MyEnum$A"));
        assertTrue(myEnumADecl.getFirstChild().hasChildren());
        assertTrue(myEnumADecl.getFirstChild().getFirstChild().isNumber() && myEnumADecl.getFirstChild().getFirstChild().getDouble() == 1.0);

        Node myEnumBDecl = myEnumADecl.getNext();
        assertTrue(myEnumBDecl.isVar() && myEnumBDecl.getFirstChild().isName() && myEnumBDecl.getFirstChild().getString().equals("MyEnum$B"));
        assertTrue(myEnumBDecl.getFirstChild().hasChildren());
        assertTrue(myEnumBDecl.getFirstChild().getFirstChild().isNumber() && myEnumBDecl.getFirstChild().getFirstChild().getDouble() == 2.0);
    }

    @Test
    public void testEnumWithNonIdentifierKey() throws Exception {
        String code = "/** @enum {number} */ var MyEnum = { '1': 1 };";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node myEnumDecl = root.getFirstChild();
        assertTrue(myEnumDecl.isVar() && myEnumDecl.getFirstChild().isName() && myEnumDecl.getFirstChild().getString().equals("MyEnum"));
        assertTrue(myEnumDecl.getFirstChild().hasChildren());
        assertTrue(myEnumDecl.getFirstChild().getFirstChild().isObjectLit());

        Node myEnum1Decl = myEnumDecl.getNext();
        assertTrue(myEnum1Decl.isVar());
        Node nameNode = myEnum1Decl.getFirstChild();
        assertTrue(nameNode.isName());
        assertTrue(nameNode.getString().startsWith("MyEnum_"));
        assertTrue(nameNode.hasChildren());
        assertTrue(nameNode.getFirstChild().isNumber() && nameNode.getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testAliasedObjectLiteralPropertyAccess() throws Exception {
        String code = "var ns = { sub: {} }; var alias = ns.sub; alias.prop = 1;";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar() && nsDecl.getFirstChild().isName() && nsDecl.getFirstChild().getString().equals("ns"));
        assertTrue(nsDecl.getFirstChild().hasChildren());
        Node nsSubDecl = nsDecl.getFirstChild().getFirstChild();
        assertTrue(nsSubDecl.isObjectLit());

        Node aliasDecl = nsDecl.getNext();
        assertTrue(aliasDecl.isVar() && aliasDecl.getFirstChild().isName() && aliasDecl.getFirstChild().getString().equals("alias"));
        Node aliasAccess = aliasDecl.getFirstChild().getFirstChild();
        assertTrue(aliasAccess.isGetProp());
        assertTrue(aliasAccess.getFirstChild().isName() && aliasAccess.getFirstChild().getString().equals("ns"));
        assertTrue(aliasAccess.getLastChild().isString() && aliasAccess.getLastChild().getString().equals("sub"));

        Node propAssign = aliasDecl.getNext();
        assertTrue(propAssign.isVar());
        Node propName = propAssign.getFirstChild();
        assertTrue(propName.isName() && propName.getString().equals("ns$sub$prop"));
        assertTrue(propName.hasChildren());
        assertTrue(propName.getFirstChild().isNumber() && propName.getFirstChild().getDouble() == 1.0);
    }

    @Test
    public void testNoCollapseOnThisInStaticMethod() throws Exception {
        String code = "var MyClass = {}; MyClass.staticMethod = function() { this.prop = 1; };";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node myClassDecl = root.getFirstChild();
        assertTrue(myClassDecl.isVar() && myClassDecl.getFirstChild().isName() && myClassDecl.getFirstChild().getString().equals("MyClass"));
        assertTrue(myClassDecl.getFirstChild().hasChildren());
        assertTrue(myClassDecl.getFirstChild().getFirstChild().isObjectLit());

        Node staticMethodAssign = myClassDecl.getNext();
        assertTrue(staticMethodAssign.isExprResult());
        Node assign = staticMethodAssign.getFirstChild();
        assertTrue(assign.isAssign());
        Node getProp = assign.getFirstChild();
        assertTrue(getProp.isGetProp());
        assertTrue(getProp.getFirstChild().isName() && getProp.getFirstChild().getString().equals("MyClass"));
        assertTrue(getProp.getLastChild().isString() && getProp.getLastChild().getString().equals("staticMethod"));
        Node functionNode = assign.getLastChild();
        assertTrue(functionNode.isFunction());
        Node fnName = functionNode.getFirstChild();
        assertNull(fnName); // Anonymous function
        Node body = fnName != null ? fnName.getNext() : functionNode.getLastChild();
        assertTrue(body.isBlock());
        Node thisPropAssign = body.getFirstChild();
        assertTrue(thisPropAssign.isExprResult());
        Node thisAssign = thisPropAssign.getFirstChild();
        assertTrue(thisAssign.isAssign());
        Node thisAccess = thisAssign.getFirstChild();
        assertTrue(thisAccess.isThis());
        Node propAccess = thisAssign.getLastChild();
        assertTrue(propAccess.isGetProp());
        assertTrue(propAccess.getFirstChild().isThis());
        assertTrue(propAccess.getLastChild().isString() && propAccess.getLastChild().getString().equals("prop"));
    }
}
