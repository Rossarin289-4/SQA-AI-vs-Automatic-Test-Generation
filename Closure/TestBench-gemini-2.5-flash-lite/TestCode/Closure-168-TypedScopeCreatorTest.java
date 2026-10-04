package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {

    private MockCompiler compiler = new MockCompiler();
    private JSTypeRegistry typeRegistry = new JSTypeRegistry(compiler.getErrorReporter());

    @Test
    public void testCreateScopeForGlobal() throws Exception {
        Node root = Node.newString("var x = 3;");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("x"));
    }

    @Test
    public void testCreateScopeForLocal() throws Exception {
        Node root = Node.newString("function f() { var x = 3; }");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        Node functionNode = root.getFirstChild().getFirstChild().getNext();
        Scope localScope = globalScope.createChildScope(functionNode);
        assertNotNull(localScope);
        assertFalse(localScope.isGlobal());
        assertEquals(1, localScope.getVarCount());
        assertNotNull(localScope.getVar("x"));
    }

    @Test
    public void testGlobalVariables() throws Exception {
        Node root = Node.newString("var x = 1; var y = 'abc';");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(2, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("x"));
        assertNotNull(globalScope.getVar("y"));
    }

    @Test
    public void testLocalVariables() throws Exception {
        Node root = Node.newString("function f() { var x = 1; var y = 'abc'; }");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        Node functionNode = root.getFirstChild().getFirstChild().getNext();
        Scope localScope = globalScope.createChildScope(functionNode);
        assertEquals(2, localScope.getVarCount());
        assertNotNull(localScope.getVar("x"));
        assertNotNull(localScope.getVar("y"));
    }

    @Test
    public void testFunctionDeclaration() throws Exception {
        Node root = Node.newString("function foo() {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("foo"));
        assertTrue(globalScope.getVar("foo").getType().isFunctionType());
    }

    @Test
    public void testFunctionExpression() throws Exception {
        Node root = Node.newString("var bar = function() {};");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("bar"));
        assertTrue(globalScope.getVar("bar").getType().isFunctionType());
    }

    @Test
    public void testClassDeclaration() throws Exception {
        Node root = Node.newString("class MyClass {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("MyClass"));
        assertTrue(globalScope.getVar("MyClass").getType().isConstructorType());
    }

    @Test
    public void testClassExpression() throws Exception {
        Node root = Node.newString("var MyClass = class {};");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("MyClass"));
        assertTrue(globalScope.getVar("MyClass").getType().isConstructorType());
    }

    @Test
    public void testConstructorWithPrototype() throws Exception {
        Node root = Node.newString("function MyCtor() {} MyCtor.prototype.method = function() {};");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        Var ctorVar = globalScope.getVar("MyCtor");
        assertNotNull(ctorVar);
        assertTrue(ctorVar.getType().isConstructorType());
        ObjectType ctorPrototype = ctorVar.getType().toMaybeFunctionType().getPrototype();
        assertNotNull(ctorPrototype);
        assertTrue(ctorPrototype.hasProperty("method"));
        assertTrue(ctorPrototype.getPropertyType("method").isFunctionType());
    }

    @Test
    public void testInterfaceDeclaration() throws Exception {
        Node root = Node.newString("interface MyInterface {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("MyInterface"));
        assertTrue(globalScope.getVar("MyInterface").getType().isInterfaceType());
    }

    @Test
    public void testEnumDeclaration() throws Exception {
        Node root = Node.newString("/** @enum {number} */ var MyEnum = { A: 1, B: 2 };");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("MyEnum"));
        assertTrue(globalScope.getVar("MyEnum").getType().isEnumType());
        EnumType enumType = globalScope.getVar("MyEnum").getType().toMaybeEnumType();
        assertEquals(2, enumType.getElementsCount());
        assertNotNull(enumType.getPropertyType("A"));
        assertNotNull(enumType.getPropertyType("B"));
    }

    @Test
    public void testTypedefDeclaration() throws Exception {
        Node root = Node.newString("/** @typedef {string} MyTypedef */");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertEquals(1, globalScope.getVarCount());
        assertNotNull(globalScope.getVar("MyTypedef"));
        assertTrue(globalScope.getVar("MyTypedef").getType().isStringValueType());
    }

    @Test
    public void testQualifiedName() throws Exception {
        Node root = Node.newString("var goog = {}; goog.bar = 3;");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType goog = globalScope.getVar("goog").getType().toMaybeObjectType();
        assertNotNull(goog);
        assertTrue(goog.hasProperty("bar"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), goog.getPropertyType("bar"));
    }

    @Test
    public void testQualifiedNameDeclaration() throws Exception {
        Node root = Node.newString("goog.bar = 3;");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertTrue(globalScope.isDeclared("goog", false));
        ObjectType goog = globalScope.getVar("goog").getType().toMaybeObjectType();
        assertNotNull(goog);
        assertTrue(goog.hasProperty("bar"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), goog.getPropertyType("bar"));
    }

    @Test
    public void testCatchBlock() throws Exception {
        Node root = Node.newString("try {} catch (e) {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        Node tryNode = root.getFirstChild();
        Scope catchScope = globalScope.createChildScope(tryNode.getFirstChild().getNext());
        assertEquals(1, catchScope.getVarCount());
        assertNotNull(catchScope.getVar("e"));
    }

    @Test
    public void testFunctionWithTypedParameters() throws Exception {
        Node root = Node.newString("/** @param {string} a */ function f(a) {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(1, fnType.getMaxArguments());
        assertEquals(compiler.getTypeRegistry().getStringType(), fnType.getParamType(0));
    }

    @Test
    public void testFunctionWithUnknownParameters() throws Exception {
        Node root = Node.newString("function f(a, b) {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(2, fnType.getMaxArguments());
        assertTrue(fnType.getParamType(0).isUnknownType());
        assertTrue(fnType.getParamType(1).isUnknownType());
    }

    @Test
    public void testFunctionWithTypedThis() throws Exception {
        Node root = Node.newString("/** @this {MyClass} */ function f() {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals("MyClass", fnType.getTypeOfThis().getDisplayName());
    }

    @Test
    public void testObjectLiteralWithTypedProperties() throws Exception {
        Node root = Node.newString("var obj = { /** @type {number} */ prop: 3 };");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType objType = globalScope.getVar("obj").getType().toMaybeObjectType();
        assertNotNull(objType);
        assertTrue(objType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), objType.getPropertyType("prop"));
    }

    @Test
    public void testObjectLiteralWithImplicitlyTypedProperties() throws Exception {
        Node root = Node.newString("var obj = { prop: 3 };");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType objType = globalScope.getVar("obj").getType().toMaybeObjectType();
        assertNotNull(objType);
        assertTrue(objType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), objType.getPropertyType("prop"));
    }

    @Test
    public void testObjectLiteralWithTypedef() throws Exception {
        Node root = Node.newString("/** @typedef {string} MyStr */ var obj = { /** @type {MyStr} */ prop: 'hello' };");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType objType = globalScope.getVar("obj").getType().toMaybeObjectType();
        assertNotNull(objType);
        assertTrue(objType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getStringType(), objType.getPropertyType("prop"));
    }

    @Test
    public void testPrototypeMethodAssignment() throws Exception {
        Node root = Node.newString("function C() {} C.prototype.m = function() {};");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType ctorType = globalScope.getVar("C").getType().toMaybeFunctionType();
        ObjectType prototypeType = ctorType.getPrototype();
        assertTrue(prototypeType.hasProperty("m"));
        assertTrue(prototypeType.getPropertyType("m").isFunctionType());
    }

    @Test
    public void testPrototypeMethodTypedAssignment() throws Exception {
        Node root = Node.newString("/** @type {function(number): string} */ C.prototype.m = function(x) {}; function C() {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType ctorType = globalScope.getVar("C").getType().toMaybeFunctionType();
        ObjectType prototypeType = ctorType.getPrototype();
        assertTrue(prototypeType.hasProperty("m"));
        FunctionType methodType = prototypeType.getPropertyType("m").toMaybeFunctionType();
        assertNotNull(methodType);
        assertEquals(1, methodType.getMaxArguments());
        assertEquals(compiler.getTypeRegistry().getNumberType(), methodType.getParamType(0));
        assertEquals(compiler.getTypeRegistry().getStringType(), methodType.getReturnType());
    }

    @Test
    public void testQualifiedNamePropertyAssignment() throws Exception {
        Node root = Node.newString("var ns; ns.prop = 1;");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        assertTrue(globalScope.isDeclared("ns", false));
        ObjectType nsType = globalScope.getVar("ns").getType().toMaybeObjectType();
        assertNotNull(nsType);
        assertTrue(nsType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), nsType.getPropertyType("prop"));
    }

    @Test
    public void testNestedQualifiedNamePropertyAssignment() throws Exception {
        Node root = Node.newString("var ns = {}; ns.sub = {}; ns.sub.prop = 1;");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType nsType = globalScope.getVar("ns").getType().toMaybeObjectType();
        ObjectType subType = nsType.getPropertyType("sub").toMaybeObjectType();
        assertNotNull(subType);
        assertTrue(subType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), subType.getPropertyType("prop"));
    }

    @Test
    public void testGlobalThis() throws Exception {
        Node root = Node.newString("this.prop = 1;");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType globalThis = compiler.getTypeRegistry().getGlobalObjectType();
        assertTrue(globalThis.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), globalThis.getPropertyType("prop"));
    }

    @Test
    public void testConstructorThis() throws Exception {
        Node root = Node.newString("function C() { this.prop = 1; }");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType ctorType = globalScope.getVar("C").getType().toMaybeFunctionType();
        ObjectType instanceType = ctorType.getInstanceType();
        assertTrue(instanceType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), instanceType.getPropertyType("prop"));
    }

    @Test
    public void testAnnotatedFunctionReturn() throws Exception {
        Node root = Node.newString("/** @return {number} */ function f() { return 1; }");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(compiler.getTypeRegistry().getNumberType(), fnType.getReturnType());
    }

    @Test
    public void testAnnotatedFunctionReturnImplicit() throws Exception {
        Node root = Node.newString("/** @return {number} */ function f() {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(compiler.getTypeRegistry().getNumberType(), fnType.getReturnType());
    }

    @Test
    public void testDelegateProxy() throws Exception {
        Node root = Node.newString("var proxy = new goog.DelegateProxy(null, null);");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        // This test mainly checks that the delegate proxy is recognized and doesn't crash.
        // A more thorough test would involve checking its type and properties.
        assertNotNull(globalScope.getVar("proxy"));
    }

    @Test
    public void testObjectLiteralCast() throws Exception {
        Node root = Node.newString("var obj = /** @type {{prop: number}} */ ({prop: 1});");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType objType = globalScope.getVar("obj").getType().toMaybeObjectType();
        assertNotNull(objType);
        assertTrue(objType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getNumberType(), objType.getPropertyType("prop"));
    }

    @Test
    public void testFunctionDeclarationInBlock() throws Exception {
        Node root = Node.newString("if (true) { function f() {} }");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        // Function declarations in blocks are not hoisted globally.
        assertNull(globalScope.getVar("f"));
        Node ifNode = root.getFirstChild();
        Scope blockScope = globalScope.createChildScope(ifNode.getFirstChild().getNext());
        assertNotNull(blockScope.getVar("f"));
    }

    @Test
    public void testFunctionExpressionInBlock() throws Exception {
        Node root = Node.newString("if (true) { var f = function() {}; }");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        // Function expressions are not hoisted.
        assertNull(globalScope.getVar("f"));
        Node ifNode = root.getFirstChild();
        Scope blockScope = globalScope.createChildScope(ifNode.getFirstChild().getNext());
        assertNotNull(blockScope.getVar("f"));
    }

    @Test
    public void testVarWithTypedef() throws Exception {
        Node root = Node.newString("/** @typedef {number} MyNum */ var x; /** @type {MyNum} */ x = 5;");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        Var xVar = globalScope.getVar("x");
        assertNotNull(xVar);
        assertEquals(compiler.getTypeRegistry().getNumberType(), xVar.getType());
    }

    @Test
    public void testQualifiedNameWithTypedef() throws Exception {
        Node root = Node.newString("/** @typedef {string} MyStr */ var ns = {}; ns.prop; /** @type {MyStr} */ ns.prop = 'hello';");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        ObjectType nsType = globalScope.getVar("ns").getType().toMaybeObjectType();
        assertNotNull(nsType);
        assertTrue(nsType.hasProperty("prop"));
        assertEquals(compiler.getTypeRegistry().getStringType(), nsType.getPropertyType("prop"));
    }

    @Test
    public void testAbstractClassDeclaration() throws Exception {
        Node root = Node.newString("/** @abstract */ class AbstractClass {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        Var abstractClassVar = globalScope.getVar("AbstractClass");
        assertNotNull(abstractClassVar);
        assertTrue(abstractClassVar.getType().isConstructorType());
        assertTrue(abstractClassVar.getType().toMaybeFunctionType().isAbstract());
    }

    @Test
    public void testNativeTypesAreDeclared() throws Exception {
        Node root = Node.newString("");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);

        assertTrue(globalScope.isDeclared("Object", false));
        assertTrue(globalScope.isDeclared("String", false));
        assertTrue(globalScope.isDeclared("Number", false));
        assertTrue(globalScope.isDeclared("Boolean", false));
        assertTrue(globalScope.isDeclared("Array", false));
        assertTrue(globalScope.isDeclared("Function", false));
        assertTrue(globalScope.isDeclared("Date", false));
        assertTrue(globalScope.isDeclared("RegExp", false));
        assertTrue(globalScope.isDeclared("Error", false));
        assertTrue(globalScope.isDeclared("undefined", false));
    }

    @Test
    public void testConstructorInitializer() throws Exception {
        Node root = Node.newString("/** @constructor */ function F() {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("F").getType().toMaybeFunctionType();
        assertTrue(fnType.isConstructor());
    }

    @Test
    public void testInterfaceInitializer() throws Exception {
        Node root = Node.newString("/** @interface */ function I() {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("I").getType().toMaybeFunctionType();
        assertTrue(fnType.isInterface());
    }

    @Test
    public void testParameterOrder() throws Exception {
        Node root = Node.newString("/** @param {string} a @param {number} b */ function f(a, b) {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(compiler.getTypeRegistry().getStringType(), fnType.getParamType(0));
        assertEquals(compiler.getTypeRegistry().getNumberType(), fnType.getParamType(1));
    }

    @Test
    public void testOverriddenMethod() throws Exception {
        Node root = Node.newString(
            "function Parent() {} Parent.prototype.method = function() {}; " +
            "function Child() {} Child.prototype.method = function() {};");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);

        FunctionType parentCtorType = globalScope.getVar("Parent").getType().toMaybeFunctionType();
        ObjectType parentPrototype = parentCtorType.getPrototype();
        FunctionType childCtorType = globalScope.getVar("Child").getType().toMaybeFunctionType();
        ObjectType childPrototype = childCtorType.getPrototype();

        assertTrue(childPrototype.hasProperty("method"));
        assertNotNull(parentPrototype.getPropertyType("method"));
        assertNotNull(childPrototype.getPropertyType("method"));
    }

    @Test
    public void testFunctionWithVarArgs() throws Exception {
        Node root = Node.newString("/** @param {...number} var_args */ function f(var_args) {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertTrue(fnType.isVarArgs());
        assertEquals(compiler.getTypeRegistry().getNumberType(), fnType.getReturnType()); // Return type is inferred from var_args type
    }

    @Test
    public void testFunctionWithOptionalParam() throws Exception {
        Node root = Node.newString("/** @param {number=} opt_num */ function f(opt_num) {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(1, fnType.getMaxArguments());
        assertTrue(fnType.getParamType(0).isOptionalArg());
        assertEquals(compiler.getTypeRegistry().getNumberType(), fnType.getParamType(0).getImplicitPrototype()); // Optional params are represented as implicit prototypes
    }

    @Test
    public void testFunctionWithOptionalParamAndDefaultValue() throws Exception {
        Node root = Node.newString("function f(opt_num = 5) {}");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("f").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(1, fnType.getMaxArguments());
        assertTrue(fnType.getParamType(0).isOptionalArg());
        assertEquals(compiler.getTypeRegistry().getNumberType(), fnType.getParamType(0).getImplicitPrototype()); // Default value is inferred as the type
    }

    @Test
    public void testAnonymousFunctionType() throws Exception {
        Node root = Node.newString("var fn = function() {};");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        JSType fnType = globalScope.getVar("fn").getType();
        assertTrue(fnType.isFunctionType());
    }

    @Test
    public void testAnonymousFunctionWithAnnotation() throws Exception {
        Node root = Node.newString("/** @return {string} */ var fn = function() {};");
        compiler.init(root);
        ScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(root, null);
        FunctionType fnType = globalScope.getVar("fn").getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertEquals(compiler.getTypeRegistry().getStringType(), fnType.getReturnType());
    }





    // Mock Compiler for testing TypedScopeCreator




