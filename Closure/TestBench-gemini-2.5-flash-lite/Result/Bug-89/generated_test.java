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
        compiler.initCompilerOptionsIfTesting();
        return compiler;
    }

    // Helper method to parse a JS string into a Node.

    // Helper method to run the CollapseProperties pass.





















    @Test
    public void testAddStubsForUndeclaredProperties() throws Exception {
        String code = "var ns = {}; ns.prop1 = 1; function f() { ns.prop2 = 2; }";
        Compiler compiler = (Compiler) createCompiler();
        Node root = compiler.parse(code);
        CollapseProperties cp = new CollapseProperties(compiler, false, false);
        cp.process(null, root);

        Node nsDecl = root.getFirstChild();
        assertTrue(nsDecl.isVar());
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
        assertTrue(nsDecl.isVar());
        Node xDecl = nsDecl.getNext();
        assertTrue(xDecl.isVar());
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
        assertTrue(fnDecl.isVar());
        assertTrue(fnDecl.getFirstChild().hasChildren());
        assertTrue(fnDecl.getFirstChild().getFirstChild().isFunction());

        Node fnPropAssign = fnDecl.getNext();
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
        assertTrue(nsDecl.isVar());
        Node nsAnonFnDecl = nsDecl.getNext();
        assertTrue(nsAnonFnDecl.isVar());
        assertTrue(nsAnonFnDecl.getFirstChild().hasChildren());
        assertTrue(nsAnonFnDecl.getFirstChild().getFirstChild().isFunction());

        Node nsAnonFnPropDecl = nsAnonFnDecl.getNext();
        assertTrue(nsAnonFnPropDecl.isVar());
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
        assertTrue(nsDecl.isVar());
        Node nsSubDecl = nsDecl.getNext();
        assertTrue(nsSubDecl.isVar());
        assertTrue(nsSubDecl.getFirstChild().hasChildren());
        assertTrue(nsSubDecl.getFirstChild().getFirstChild().isObjectLit());

        Node nsSubFnDecl = nsSubDecl.getNext();
        assertTrue(nsSubFnDecl.isVar());
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
        assertTrue(objDecl.isVar());

        Node objP1Decl = objDecl.getNext();
        assertTrue(objP1Decl.isVar());
        assertTrue(objP1Decl.getFirstChild().hasChildren());
        assertTrue(objP1Decl.getFirstChild().getFirstChild().isNumber() && objP1Decl.getFirstChild().getFirstChild().getDouble() == 1.0);

        Node objP2Decl = objP1Decl.getNext();
        assertTrue(objP2Decl.isVar());
        assertTrue(objP2Decl.getFirstChild().hasChildren());
        assertTrue(objP2Decl.getFirstChild().getFirstChild().isString() && objP2Decl.getFirstChild().getFirstChild().getString().equals("hello"));

        Node objP3Decl = objP2Decl.getNext();
        assertTrue(objP3Decl.isVar());
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
        assertTrue(nsDecl.isVar());

        Node nsADecl = nsDecl.getNext();
        assertTrue(nsADecl.isVar());
        assertTrue(nsADecl.getFirstChild().hasChildren());
        assertTrue(nsADecl.getFirstChild().getFirstChild().isObjectLit());

        Node nsABDecl = nsADecl.getNext();
        assertTrue(nsABDecl.isVar());
        assertTrue(nsABDecl.getFirstChild().hasChildren());
        assertTrue(nsABDecl.getFirstChild().getFirstChild().isObjectLit());

        Node nsABCDecl = nsABDecl.getNext();
        assertTrue(nsABCDecl.isVar());
        assertTrue(nsABCDecl.getFirstChild().hasChildren());
        assertTrue(nsABCDecl.getFirstChild().getFirstChild().isNumber() && nsABCDecl.getFirstChild().getFirstChild().getDouble() == 1.0);

        Node nsDDecl = nsABCDecl.getNext();
        assertTrue(nsDDecl.isVar());
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
        assertTrue(nsDecl.isVar());

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
        assertTrue(myClassDecl.isVar());
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
        assertTrue(myEnumDecl.isVar());
        assertTrue(myEnumDecl.getFirstChild().hasChildren());
        assertTrue(myEnumDecl.getFirstChild().getFirstChild().isObjectLit());

        Node myEnumADecl = myEnumDecl.getNext();
        assertTrue(myEnumADecl.isVar());
        assertTrue(myEnumADecl.getFirstChild().hasChildren());
        assertTrue(myEnumADecl.getFirstChild().getFirstChild().isNumber() && myEnumADecl.getFirstChild().getFirstChild().getDouble() == 1.0);

        Node myEnumBDecl = myEnumADecl.getNext();
        assertTrue(myEnumBDecl.isVar());
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
        assertTrue(myEnumDecl.isVar());
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
        assertTrue(nsDecl.isVar());
        assertTrue(nsDecl.getFirstChild().hasChildren());
        Node nsSubDecl = nsDecl.getFirstChild().getFirstChild();
        assertTrue(nsSubDecl.isObjectLit());

        Node aliasDecl = nsDecl.getNext();
        assertTrue(aliasDecl.isVar());
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
        assertTrue(myClassDecl.isVar());
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
        Node body = functionNode.getLastChild();
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





