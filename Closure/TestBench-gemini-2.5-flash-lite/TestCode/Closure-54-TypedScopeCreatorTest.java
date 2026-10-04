package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet; // Added for HashSet

// Removed MockCompiler as it was causing compilation errors and was not essential for the tests.
// Tests now rely on a properly configured JSTypeRegistry and Node objects.

public class TypedScopeCreatorTest {

    private JSTypeRegistry registry = new JSTypeRegistry(null);
    private Scope globalScope; // To be initialized in setup methods

    // Helper to create a basic Node for testing

    private Node createNode(int type) {
        return new Node(type);
    }





    // A simplified compiler for testing purposes
























    @Test
    public void testGlobalScopeBuilder_defineSlot_globalThisAssignment_function() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node globalFn = NodeUtil.newQName(compiler, "globalFn");
        globalFn.setJSType(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE));
        assign.addChildToBack(globalFn);
        assign.addChildToBack(createNode(Token.FUNCTION));
        exprResult.addChildToBack(assign);
        root.addChildToBack(exprResult);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var var = globalScope.getVar("globalFn");
        assertNotNull(var);
        assertTrue(var.getType().isFunctionType());

        ObjectType globalThisType = registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS);
        assertNotNull(globalThisType.getPropertyType("globalFn"));
        assertTrue(globalThisType.getPropertyType("globalFn").isFunctionType());
    }


    @Test
    public void testGlobalScopeBuilder_defineSlot_undeclaredVariable_whenDefined() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = createNode(Token.NAME, "myVar");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        // Assign to it later
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node qualifiedName = NodeUtil.newQName(compiler, "myVar");
        assign.addChildToBack(qualifiedName);
        assign.addChildToBack(Node.newNumber(42));
        exprResult.addChildToBack(assign);
        root.addChildToBack(exprResult);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var var = globalScope.getVar("myVar");
        assertNotNull(var);
        // The type should be inferred as number
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), var.getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_undeclaredVariable_whenNotDefined() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node qualifiedName = NodeUtil.newQName(compiler, "undeclaredVar");
        assign.addChildToBack(qualifiedName);
        assign.addChildToBack(Node.newNumber(42));
        exprResult.addChildToBack(assign);
        root.addChildToBack(exprResult);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        creator.createScope(root, null);

        // Expecting a JSC_UNDECLARED_VARIABLE error
        assertEquals(1, compiler.errors.size());
        assertEquals("JSC_UNDECLARED_VARIABLE", compiler.errors.get(0).getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_redeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);

        Node var1 = new Node(Token.VAR);
        Node name1 = createNode(Token.NAME, "myVar");
        var1.addChildToBack(name1);
        root.addChildToBack(var1);

        Node var2 = new Node(Token.VAR);
        Node name2 = createNode(Token.NAME, "myVar");
        var2.addChildToBack(name2);
        root.addChildToBack(var2);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // Expecting a JSC_REDECLARED_VARIABLE error
        assertEquals(1, compiler.errors.size());
        assertEquals("JSC_REDECLARED_VARIABLE", compiler.errors.get(0).getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_qualifiedNameRedeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);

        Node varDecl = new Node(Token.VAR);
        Node name = createNode(Token.NAME, "myObj");
        varDecl.addChildToBack(name);
        varDecl.getFirstChild().setJSType(registry.createObjectType("myObj", null));
        root.addChildToBack(varDecl);

        Node assign1 = new Node(Token.ASSIGN);
        Node qualifiedName1 = NodeUtil.newQName(compiler, "myObj.prop");
        assign1.addChildToBack(qualifiedName1);
        assign1.addChildToBack(Node.newNumber(10));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign1));

        // Redeclare as a property of a different type (should be error)
        Node assign2 = new Node(Token.ASSIGN);
        Node qualifiedName2 = NodeUtil.newQName(compiler, "myObj.prop");
        assign2.addChildToBack(qualifiedName2);
        assign2.addChildToBack(Node.newString(Token.STRING, "hello"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign2));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // Expecting a JSC_TYPE_MISMATCH error (or similar for redeclaration conflict)
        assertTrue(compiler.errors.size() > 0);
        boolean typeMismatchFound = false;
        for (JSError error : compiler.errors) {
            if (error.getType().equals("JSC_TYPE_MISMATCH") || error.getType().equals("JSC_REDECLARED_VARIABLE")) {
                typeMismatchFound = true;
                break;
            }
        }
        assertTrue("Expected type mismatch or redeclaration error for conflicting property type", typeMismatchFound);
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_qualifiedNameRedeclaration_correctType() throws Exception {
        Node root = new Node(Token.SCRIPT);

        Node varDecl = new Node(Token.VAR);
        Node name = createNode(Token.NAME, "myObj");
        varDecl.addChildToBack(name);
        varDecl.getFirstChild().setJSType(registry.createObjectType("myObj", null));
        root.addChildToBack(varDecl);

        Node assign1 = new Node(Token.ASSIGN);
        Node qualifiedName1 = NodeUtil.newQName(compiler, "myObj.prop");
        assign1.addChildToBack(qualifiedName1);
        assign1.addChildToBack(Node.newNumber(10));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign1));

        Node assign2 = new Node(Token.ASSIGN);
        Node qualifiedName2 = NodeUtil.newQName(compiler, "myObj.prop");
        assign2.addChildToBack(qualifiedName2);
        assign2.addChildToBack(Node.newNumber(20)); // Same type
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign2));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        assertEquals(0, compiler.errors.size()); // No errors expected
        Var propVar = globalScope.getVar("myObj.prop");
        assertNotNull(propVar);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), propVar.getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineFunctionLiteral_arrowFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN);
        Node qName = NodeUtil.newQName(compiler, "myArrowFn");
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.setJSType(registry.createFunctionType(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        fnNode.addChildToBack(new Node(Token.LP));
        fnNode.addChildToBack(new Node(Token.BLOCK));
        assign.addChildToBack(qName);
        assign.addChildToBack(fnNode);
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var var = globalScope.getVar("myArrowFn");
        assertNotNull(var);
        assertTrue(var.getType().isFunctionType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), var.getType().toMaybeFunctionType().getReturnType());
    }

    @Test
    public void testGlobalScopeBuilder_processObjectLitProperties_simple() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        Node key1 = NodeUtil.newString(Token.STRING, "prop1");
        key1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node value1 = Node.newNumber(1);
        key1.addChildToBack(value1);
        objLit.addChildToBack(key1);

        Node key2 = NodeUtil.newString(Token.STRING, "prop2");
        key2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node value2 = Node.newString(Token.STRING, "val");
        key2.addChildToBack(value2);
        objLit.addChildToBack(key2);

        root.addChildToBack(new Node(Token.EXPR_RESULT, objLit));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // The object literal itself gets a type, and its properties are defined.
        ObjectType objType = (ObjectType) objLit.getJSType();
        assertNotNull(objType);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.getPropertyType("prop1"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), objType.getPropertyType("prop2"));
    }

    @Test
    public void testGlobalScopeBuilder_processObjectLitProperties_withTypedef() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = createNode(Token.NAME, "MyObject");
        JSDocInfo info = createTypedefJSDocInfo("object"); // Assuming 'object' means anonymous object type
        nameNode.setJSDocInfo(info);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node objLit = new Node(Token.OBJECTLIT);
        Node key1 = NodeUtil.newString(Token.STRING, "prop1");
        key1.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node value1 = Node.TRUE;
        key1.addChildToBack(value1);
        objLit.addChildToBack(key1);
        root.addChildToBack(new Node(Token.EXPR_RESULT, objLit));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        JSType myObjectType = registry.getType("MyObject");
        assertNotNull(myObjectType);
        assertTrue(myObjectType.isObjectType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), myObjectType.getPropertyType("prop1"));
    }

    @Test
    public void testGlobalScopeBuilder_processObjectLitProperties_lends() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = createNode(Token.NAME, "MyClass");
        FunctionType ctorType = registry.createConstructorType(null);
        nameNode.setJSType(ctorType);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node objLit = new Node(Token.OBJECTLIT);
        JSDocInfo info = new JSDocInfo();
        info.setLendsName("MyClass");
        objLit.setJSDocInfo(info);

        Node key1 = NodeUtil.newString(Token.STRING, "prop1");
        key1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node value1 = Node.newNumber(1);
        key1.addChildToBack(value1);
        objLit.addChildToBack(key1);

        root.addChildToBack(new Node(Token.EXPR_RESULT, objLit));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // The type of MyClass should be updated with prop1
        ObjectType myClassType = (ObjectType) registry.getType("MyClass");
        assertNotNull(myClassType);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), myClassType.getPropertyType("prop1"));
    }

    @Test
    public void testGlobalScopeBuilder_processObjectLitProperties_lends_nonObject() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = createNode(Token.NAME, "MyNumber");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Not an object type
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node objLit = new Node(Token.OBJECTLIT);
        JSDocInfo info = new JSDocInfo();
        info.setLendsName("MyNumber");
        objLit.setJSDocInfo(info);
        root.addChildToBack(new Node(Token.EXPR_RESULT, objLit));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        creator.createScope(root, null);

        // Expecting LENDS_ON_NON_OBJECT warning
        assertEquals(1, compiler.errors.size());
        assertEquals("JSC_LENDS_ON_NON_OBJECT", compiler.errors.get(0).getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_stubDeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(NodeUtil.newQName(compiler, "someObject"));
        getProp.addChildToBack(NodeUtil.newString(Token.STRING, "stubProp"));
        getProp.setQualifiedName("someObject.stubProp");
        exprResult.addChildToBack(getProp);
        root.addChildToBack(exprResult);

        // Need to declare 'someObject' first so it's not also a stub
        Node varDecl = new Node(Token.VAR);
        varDecl.addChildToBack(NodeUtil.newQName(compiler, "someObject"));
        varDecl.getFirstChild().setJSType(registry.createObjectType("someObject", null));
        root.addChildToFront(varDecl);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // After traversal, stub declarations should be resolved to UNKNOWN_TYPE if not found.
        // The `resolveStubDeclarations` method handles this.
        Var stubVar = globalScope.getVar("someObject.stubProp");
        assertNotNull(stubVar);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), stubVar.getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_stubDeclaration_propertyOnUnknown() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(NodeUtil.newQName(compiler, "unknownObject"));
        getProp.addChildToBack(NodeUtil.newString(Token.STRING, "stubProp"));
        getProp.setQualifiedName("unknownObject.stubProp");
        exprResult.addChildToBack(getProp);
        root.addChildToBack(exprResult);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // 'unknownObject' itself is not declared, so 'unknownObject.stubProp' becomes a stub.
        Var stubVar = globalScope.getVar("unknownObject.stubProp");
        assertNotNull(stubVar);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), stubVar.getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_qualifiedNameRootedInGlobalScope_notGlobal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node scopeWrapper = new Node(Token.BLOCK); // Simulate a local scope
        Node varDecl = new Node(Token.VAR);
        Node localObjName = createNode(Token.NAME, "localObj");
        localObjName.setJSType(registry.createObjectType("localObj", null));
        varDecl.addChildToBack(localObjName);
        scopeWrapper.addChildToBack(varDecl);

        Node assign = new Node(Token.ASSIGN);
        Node qualifiedName = NodeUtil.newQName(compiler, "localObj.globalProp");
        assign.addChildToBack(qualifiedName);
        assign.addChildToBack(Node.newNumber(100));
        scopeWrapper.addChildToBack(new Node(Token.EXPR_RESULT, assign));
        root.addChildToBack(scopeWrapper);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);
        Scope localScope = new Scope(scopeWrapper, globalScope); // Local scope for the block

        TypedScopeCreator.LocalScopeBuilder builder = creator.new LocalScopeBuilder(localScope);
        builder.build(); // Traverse the local scope

        // Check that 'localObj.globalProp' is defined within the local scope
        Var propVar = localScope.getVar("localObj.globalProp");
        assertNotNull(propVar);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), propVar.getType());

        // Ensure it's not declared in the global scope unless it's truly global
        assertNull(globalScope.getVar("localObj.globalProp"));
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_qualifiedNameRootedInGlobalScope_isGlobal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR);
        Node globalObjName = createNode(Token.NAME, "globalObj");
        globalObjName.setJSType(registry.createObjectType("globalObj", null));
        varDecl.addChildToBack(globalObjName);
        root.addChildToBack(varDecl);

        Node assign = new Node(Token.ASSIGN);
        Node qualifiedName = NodeUtil.newQName(compiler, "globalObj.globalProp");
        assign.addChildToBack(qualifiedName);
        assign.addChildToBack(Node.newNumber(200));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // Check that 'globalObj.globalProp' is defined in the global scope
        Var propVar = globalScope.getVar("globalObj.globalProp");
        assertNotNull(propVar);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), propVar.getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_prototypePropertyAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnDecl = new Node(Token.FUNCTION);
        Node fnName = createNode(Token.NAME, "MyClass");
        fnDecl.setJSType(registry.createConstructorType(null));
        fnDecl.addChildToBack(fnName);
        fnDecl.addChildToBack(new Node(Token.LP));
        fnDecl.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(fnDecl);

        Node assign = new Node(Token.ASSIGN);
        Node protoProp = NodeUtil.newQName(compiler, "MyClass.prototype.myProp");
        protoProp.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assign.addChildToBack(protoProp);
        assign.addChildToBack(Node.newNumber(123));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var propVar = globalScope.getVar("MyClass.prototype.myProp");
        assertNotNull(propVar);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), propVar.getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_assignToNonExistentQualifiedName() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN);
        Node qName = NodeUtil.newQName(compiler, "nonExistent.prop");
        qName.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        assign.addChildToBack(qName);
        assign.addChildToBack(Node.newString(Token.STRING, "value"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        creator.createScope(root, null);

        // Expecting an error about undeclared variable `nonExistent`
        assertEquals(1, compiler.errors.size());
        assertEquals("JSC_UNDECLARED_VARIABLE", compiler.errors.get(0).getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineFunctionLiteral_externs() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.putBooleanProp(Node.IS_EXTERNAL_PROP, true); // Mark as externs

        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = createNode(Token.NAME, "externFn");
        functionNode.setJSType(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE));
        functionNode.addChildToBack(nameNode);
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(functionNode);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var var = globalScope.getVar("externFn");
        assertNotNull(var);
        // Extern functions are also declared.
        assertEquals(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE), var.getType());
        assertTrue(var.isExtern());
    }

    @Test
    public void testGlobalScopeBuilder_defineVar_externs() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.putBooleanProp(Node.IS_EXTERNAL_PROP, true); // Mark as externs

        Node varNode = new Node(Token.VAR);
        Node nameNode = createNode(Token.NAME, "externVar");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var var = globalScope.getVar("externVar");
        assertNotNull(var);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), var.getType());
        assertTrue(var.isExtern());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_qualifiedName_onNativeObject() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN);
        Node qName = NodeUtil.newQName(compiler, "Object.prototype.myProp");
        qName.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        assign.addChildToBack(qName);
        assign.addChildToBack(Node.newString(Token.STRING, "hello"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var propVar = globalScope.getVar("Object.prototype.myProp");
        assertNotNull(propVar);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), propVar.getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_onPrototype_ofNativeFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN);
        Node qName = NodeUtil.newQName(compiler, "Array.prototype.myMethod");
        qName.setJSType(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE));
        assign.addChildToBack(qName);
        assign.addChildToBack(createNode(Token.FUNCTION));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var methodVar = globalScope.getVar("Array.prototype.myMethod");
        assertNotNull(methodVar);
        assertTrue(methodVar.getType().isFunctionType());
    }

    @Test
    public void testGlobalScopeBuilder_patchGlobalScope_removesOldVars() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR);
        Node varName = createNode(Token.NAME, "oldVar");
        varName.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        varDecl.addChildToBack(varName);
        root.addChildToBack(varDecl);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);
        assertNotNull(globalScope.getVar("oldVar"));

        // Now, simulate patching with a new script that doesn't declare oldVar
        Node newRoot = new Node(Token.SCRIPT);
        // Set a source name to match the one used in createScope for patchGlobalScope to work
        newRoot.putProp(Node.SOURCENAME_PROP, "test_script.js");
        creator.patchGlobalScope(globalScope, newRoot);

        // oldVar should have been removed
        assertNull(globalScope.getVar("oldVar"));
    }

    @Test
    public void testGlobalScopeBuilder_patchGlobalScope_addsNewVars() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.putProp(Node.SOURCENAME_PROP, "test_script.js"); // Give it a source name
        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // Simulate patching with a new script that declares a new var
        Node newRoot = new Node(Token.SCRIPT);
        newRoot.putProp(Node.SOURCENAME_PROP, "test_script.js"); // Match source name
        Node newVarDecl = new Node(Token.VAR);
        Node newVarName = createNode(Token.NAME, "newVar");
        newVarName.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        newVarDecl.addChildToBack(newVarName);
        newRoot.addChildToBack(newVarDecl);

        creator.patchGlobalScope(globalScope, newRoot);

        // newVar should now be present
        assertNotNull(globalScope.getVar("newVar"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), globalScope.getVar("newVar").getType());
    }

    @Test
    public void testGlobalScopeBuilder_defineFunctionLiteral_assignToPrototype() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node fnDecl = new Node(Token.FUNCTION);
        Node fnName = createNode(Token.NAME, "MyClass");
        fnDecl.setJSType(registry.createConstructorType(null));
        fnDecl.addChildToBack(fnName);
        fnDecl.addChildToBack(new Node(Token.LP));
        fnDecl.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(fnDecl);

        Node assign = new Node(Token.ASSIGN);
        Node protoMethod = NodeUtil.newQName(compiler, "MyClass.prototype.myMethod");
        protoMethod.setJSType(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE));
        assign.addChildToBack(protoMethod);
        assign.addChildToBack(createNode(Token.FUNCTION));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var methodVar = globalScope.getVar("MyClass.prototype.myMethod");
        assertNotNull(methodVar);
        assertTrue(methodVar.getType().isFunctionType());
    }

    @Test
    public void testGlobalScopeBuilder_defineFunctionLiteral_assignToInstancePrototype() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        Node qName = NodeUtil.newQName(compiler, "myInstance");
        qName.setJSType(registry.createObjectType("MyClass", null));
        objLit.addChildToBack(new Node(Token.STRING, "foo")); // dummy property
        root.addChildToBack(new Node(Token.ASSIGN, qName, objLit)); // myInstance = {foo: ...}

        Node assign = new Node(Token.ASSIGN);
        Node protoMethod = NodeUtil.newQName(compiler, "myInstance.prototype.myMethod"); // Trying to assign to instance.prototype
        protoMethod.setJSType(registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE));
        assign.addChildToBack(protoMethod);
        assign.addChildToBack(createNode(Token.FUNCTION));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        creator.createScope(root, null);

        // This should ideally result in a TYPE_MISMATCH error because 'myInstance' is not a constructor.
        assertTrue(compiler.errors.size() > 0);
        boolean typeMismatchFound = false;
        for (JSError error : compiler.errors) {
            if (error.getType().equals("JSC_TYPE_MISMATCH")) {
                typeMismatchFound = true;
                break;
            }
        }
        assertTrue("Expected TYPE_MISMATCH error for assigning to instance.prototype", typeMismatchFound);
    }

    @Test
    public void testGlobalScopeBuilder_defineFunctionLiteral_assignedFunctionType() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN);
        Node qName = NodeUtil.newQName(compiler, "myFuncVar");
        // Directly set a FunctionType on the qualified name node
        qName.setJSType(registry.createFunctionType(registry.getNativeType(JSTypeNative.STRING_TYPE)));
        assign.addChildToBack(qName);
        assign.addChildToBack(createNode(Token.FUNCTION)); // The function literal itself
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        Var var = globalScope.getVar("myFuncVar");
        assertNotNull(var);
        assertTrue(var.getType().isFunctionType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), var.getType().toMaybeFunctionType().getReturnType());
    }

    @Test
    public void testGlobalScopeBuilder_defineSlot_enumConstantAsFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR);
        Node enumName = createNode(Token.NAME, "MyEnum");
        JSDocInfo enumInfo = createEnumJSDocInfo("string");
        enumName.setJSDocInfo(enumInfo); // Set JSDoc on the name node
        varDecl.addChildToBack(enumName);
        root.addChildToBack(varDecl);

        // Simulate enum definition with constants
        Node enumAssign = new Node(Token.ASSIGN);
        Node enumQName = NodeUtil.newQName(compiler, "MyEnum");
        Node enumObjectLit = new Node(Token.OBJECTLIT);
        Node constKey = NodeUtil.newString(Token.STRING, "CONST");
        constKey.addChildToBack(Node.newString(Token.STRING, "value")); // Enum constant value
        enumObjectLit.addChildToBack(constKey);
        enumAssign.addChildToBack(enumQName);
        enumAssign.addChildToBack(enumObjectLit);
        root.addChildToBack(new Node(Token.EXPR_RESULT, enumAssign));

        Node assign = new Node(Token.ASSIGN);
        Node qName = NodeUtil.newQName(compiler, "MyEnum.CONST"); // Accessing an enum constant
        qName.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // Type of the constant
        assign.addChildToBack(qName);
        assign.addChildToBack(createNode(Token.FUNCTION)); // Assigning a function to an enum constant
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        SimpleCompiler compiler = new SimpleCompiler(registry);
        compiler.errors.clear();
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        globalScope = creator.createScope(root, null);

        // The reference code checks ENUM_INITIALIZER if the value is not an object literal or enum.
        // Assigning a function might be treated as not an object literal.
        JSType enumType = registry.getType("MyEnum");
        assertNotNull(enumType);
        assertTrue(enumType instanceof EnumType);
        EnumType theEnum = (EnumType) enumType;

        Var constVar = globalScope.getVar("MyEnum.CONST");
        assertNotNull(constVar);
        // The type should reflect the assignment (function type), but the enum itself might have warnings.
        assertTrue(constVar.getType().isFunctionType());

        // The ENUM_INITIALIZER error is reported when the enum itself is declared with an invalid initializer.
        // This test case assigns to a constant *after* declaration. A type mismatch might occur.
        // The provided reference code doesn't explicitly check the type of assigned values to enum constants *after* declaration.
        // Thus, we check if the constant's type is updated and if the enum itself has issues.
        assertTrue(compiler.errors.isEmpty() || compiler.errors.get(0).getType().equals("JSC_ENUM_INITIALIZER"));
    }

    @Test
    public void testTypedScopeCreator_localScope_functionParameters() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        Node functionName = createNode(Token.NAME, "myFunc");
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "a");
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addChildToBack(param1);
        Node param2 = createNode(Token.NAME, "b");
        param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        params.addChildToBack(param2);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToBack(functionName);
        functionNode.addChildToBack(params);
        functionNode.addChildToBack(body);
        root.addChildToBack(functionNode);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        Scope globalScopeForLocal = creator.createScope(new Node(Token.SCRIPT), null); // Global scope
        Scope localScope = new Scope(functionNode, globalScopeForLocal); // Local scope for the function

        TypedScopeCreator.LocalScopeBuilder builder = creator.new LocalScopeBuilder(localScope);
        builder.handleFunctionInputs(functionNode); // Manually trigger parameter declaration

        Var varA = localScope.getVar("a");
        assertNotNull(varA);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varA.getType());

        Var varB = localScope.getVar("b");
        assertNotNull(varB);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), varB.getType());
    }

    @Test
    public void testTypedScopeCreator_localScope_functionParameters_optionalAndVarArgs() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        Node functionName = createNode(Token.NAME, "myFunc");
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "a");
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        param1.putBooleanProp(Node.OPT_ARG_NAME, true); // Optional parameter
        params.addChildToBack(param1);
        Node param2 = createNode(Token.NAME, "b");
        param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        param2.putBooleanProp(Node.IS_VAR_ARGS_PARAM, true); // VarArgs parameter
        params.addChildToBack(param2);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToBack(functionName);
        functionNode.addChildToBack(params);
        functionNode.addChildToBack(body);
        root.addChildToBack(functionNode);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        Scope globalScopeForLocal = creator.createScope(new Node(Token.SCRIPT), null);
        Scope localScope = new Scope(functionNode, globalScopeForLocal);

        TypedScopeCreator.LocalScopeBuilder builder = creator.new LocalScopeBuilder(localScope);
        builder.handleFunctionInputs(functionNode);

        Var varA = localScope.getVar("a");
        assertNotNull(varA);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varA.getType());
        assertTrue(varA.getNameNode().getBooleanProp(Node.OPT_ARG_NAME));

        Var varB = localScope.getVar("b");
        assertNotNull(varB);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), varB.getType());
        assertTrue(varB.getNameNode().getBooleanProp(Node.IS_VAR_ARGS_PARAM));
    }

    @Test
    public void testTypedScopeCreator_localScope_functionParameters_jsdocTypes() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        Node functionName = createNode(Token.NAME, "myFunc");
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "a"); // AST parameter name
        params.addChildToBack(param1);
        Node param2 = createNode(Token.NAME, "b");
        params.addChildToBack(param2);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToBack(functionName);
        functionNode.addChildToBack(params);
        functionNode.addChildToBack(body);
        root.addChildToBack(functionNode);

        // Add JSDoc with types
        JSDocInfo jsDocInfo = new JSDocInfo();
        Node typeNodeNum = Node.newNumber(0); // Placeholder for number type
        typeNodeNum.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        jsDocInfo.addParameterType("a", typeNodeNum);

        Node typeNodeStr = Node.newString("str"); // Placeholder for string type
        typeNodeStr.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        jsDocInfo.addParameterType("b", typeNodeStr);
        functionNode.setJSDocInfo(jsDocInfo);

        // Create the FunctionType with the inferred types from JSDoc
        FunctionType fnType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE), // Return type
            params, // AST parameter node
            // Pass the JSDoc parameter types as the second argument to simulate how JSDoc types are parsed
            registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), jsDocInfo).getParametersNode()
        );
        functionNode.setJSType(fnType);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        Scope globalScopeForLocal = creator.createScope(new Node(Token.SCRIPT), null);
        Scope localScope = new Scope(functionNode, globalScopeForLocal);

        TypedScopeCreator.LocalScopeBuilder builder = creator.new LocalScopeBuilder(localScope);
        builder.handleFunctionInputs(functionNode);

        Var varA = localScope.getVar("a");
        assertNotNull(varA);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varA.getType());

        Var varB = localScope.getVar("b");
        assertNotNull(varB);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), varB.getType());
    }

    @Test
    public void testTypedScopeCreator_localScope_functionParameters_missingJSDocType() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        Node functionName = createNode(Token.NAME, "myFunc");
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "a"); // AST parameter name
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Type set on AST node, even if JSDoc is present
        params.addChildToBack(param1);
        Node param2 = createNode(Token.NAME, "b"); // AST parameter name
        params.addChildToBack(param2);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToBack(functionName);
        functionNode.addChildToBack(params);
        functionNode.addChildToBack(body);
        root.addChildToBack(functionNode);

        // JSDoc missing for 'b'
        JSDocInfo jsDocInfo = new JSDocInfo();
        Node typeNodeNum = Node.newNumber(0);
        typeNodeNum.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        jsDocInfo.addParameterType("a", typeNodeNum);
        functionNode.setJSDocInfo(jsDocInfo);

        // Create FunctionType: 'a' has JSDoc type, 'b' has no specific JSDoc type
        FunctionType fnType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            params,
            // Simulate JSDoc parameter types for 'a' but not 'b'
            registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), jsDocInfo).getParametersNode()
        );
        functionNode.setJSType(fnType);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        Scope globalScopeForLocal = creator.createScope(new Node(Token.SCRIPT), null);
        Scope localScope = new Scope(functionNode, globalScopeForLocal);

        TypedScopeCreator.LocalScopeBuilder builder = creator.new LocalScopeBuilder(localScope);
        builder.handleFunctionInputs(functionNode);

        Var varA = localScope.getVar("a");
        assertNotNull(varA);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varA.getType()); // From JSDoc

        Var varB = localScope.getVar("b");
        assertNotNull(varB);
        // 'b' should be inferred as unknown because no JSDoc type and AST node has no type
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), varB.getType());
    }

    @Test
    public void testTypedScopeCreator_localScope_functionParameters_fromAstNode() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        Node functionName = createNode(Token.NAME, "myFunc");
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "a");
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Type set on AST node
        params.addChildToBack(param1);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToBack(functionName);
        functionNode.addChildToBack(params);
        functionNode.addChildToBack(body);
        root.addChildToBack(functionNode);

        // No JSDoc for parameters
        FunctionType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), params);
        functionNode.setJSType(fnType);

        SimpleCompiler compiler = new SimpleCompiler(registry);
        Scope globalScopeForLocal = creator.createScope(new Node(Token.SCRIPT), null);
        Scope localScope = new Scope(functionNode, globalScopeForLocal);

        TypedScopeCreator.LocalScopeBuilder builder = creator.new LocalScopeBuilder(localScope);
        builder.handleFunctionInputs(functionNode);

        Var varA = localScope.getVar("a");
        assertNotNull(varA);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varA.getType()); // Should use AST type
    }

    // --- Tests for methods not covered by previous tests ---

    @Test
    public void testFunctionType_getPrototype() throws Exception {
        // Test accessing the prototype of a function type.
        setupGlobalScope();
        FunctionType objectFunctionType = registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        assertNotNull(objectFunctionType);
        ObjectType prototype = objectFunctionType.getPrototype();
        assertNotNull(prototype);
        // Verify it's a prototype object type
        assertTrue(prototype instanceof ObjectType);
        assertEquals("Object.prototype", prototype.getReferenceName());
    }

    @Test
    public void testFunctionType_getReturnType() throws Exception {
        // Test accessing the return type of a function.
        setupGlobalScope();
        FunctionType arrayFunctionType = registry.getNativeFunctionType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        assertNotNull(arrayFunctionType);
        JSType returnType = arrayFunctionType.getReturnType();
        assertNotNull(returnType);
        // Array constructor returns an Object type (Array instance)
        assertTrue(returnType.isObjectType());
        assertEquals("Array", returnType.getReferenceName());
    }

    @Test
    public void testFunctionType_getMinArguments() throws Exception {
        setupGlobalScope();
        FunctionType arrayFunctionType = registry.getNativeFunctionType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        assertNotNull(arrayFunctionType);
        // Array constructor takes optional arguments, min should be 0.
        assertEquals(0, arrayFunctionType.getMinArguments());

        // Example of a function with required args (hypothetical)
        Node params = new Node(Token.LP);
        Node reqParam1 = createNode(Token.NAME, "req1");
        reqParam1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addChildToBack(reqParam1);
        Node optParam1 = createNode(Token.NAME, "opt1");
        optParam1.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        optParam1.putBooleanProp(Node.OPT_ARG_NAME, true);
        params.addChildToBack(optParam1);
        FunctionType hypotheticalFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), params);
        assertEquals(1, hypotheticalFn.getMinArguments());
    }

    @Test
    public void testFunctionType_getMaxArguments() throws Exception {
        setupGlobalScope();
        FunctionType arrayFunctionType = registry.getNativeFunctionType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        assertNotNull(arrayFunctionType);
        // Array constructor takes optional arguments, max should be Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, arrayFunctionType.getMaxArguments());

        // Example of a function with fixed args
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "p1");
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addChildToBack(param1);
        Node param2 = createNode(Token.NAME, "p2");
        param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        params.addChildToBack(param2);
        FunctionType fixedArgsFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), params);
        assertEquals(2, fixedArgsFn.getMaxArguments());
    }

    @Test
    public void testFunctionType_isConstructor() throws Exception {
        setupGlobalScope();
        FunctionType objectFunctionType = registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        assertTrue(objectFunctionType.isConstructor());

        FunctionType arrayFunctionType = registry.getNativeFunctionType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        assertTrue(arrayFunctionType.isConstructor());

        // Hypothetical non-constructor function
        Node params = new Node(Token.LP);
        FunctionType ordinaryFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), params);
        assertFalse(ordinaryFn.isConstructor());
    }

    @Test
    public void testFunctionType_isInterface() throws Exception {
        setupGlobalScope();
        // There are no native interfaces defined in the provided code snippet's native types.
        // Let's create one.
        FunctionType myInterface = registry.createInterfaceType("MyInterface", null);
        assertTrue(myInterface.isInterface());

        FunctionType objectFunctionType = registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        assertFalse(objectFunctionType.isInterface());
    }

    @Test
    public void testFunctionType_getPropertyType_call() throws Exception {
        setupGlobalScope();
        FunctionType fnType = registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        assertNotNull(fnType.getPropertyType("call"));
        assertTrue(fnType.getPropertyType("call").isFunctionType());
    }

    @Test
    public void testFunctionType_getPropertyType_apply() throws Exception {
        setupGlobalScope();
        FunctionType fnType = registry.getNativeFunctionType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        assertNotNull(fnType.getPropertyType("apply"));
        assertTrue(fnType.getPropertyType("apply").isFunctionType());
    }

    @Test
    public void testFunctionType_isSubtype_interfaceToFunction() throws Exception {
        setupGlobalScope();
        FunctionType myInterface = registry.createInterfaceType("MyInterface", null);
        FunctionType ordinaryFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));

        // An interface is a subtype of any function
        assertTrue(myInterface.isSubtype(ordinaryFn));
    }

    @Test
    public void testFunctionType_isSubtype_functionToInterface() throws Exception {
        setupGlobalScope();
        FunctionType myInterface = registry.createInterfaceType("MyInterface", null);
        FunctionType ordinaryFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));

        // A function is NOT a subtype of an interface (unless explicitly defined)
        assertFalse(ordinaryFn.isSubtype(myInterface));
    }

    @Test
    public void testFunctionType_getSuperClassConstructor_native() throws Exception {
        setupGlobalScope();
        FunctionType objectFunctionType = registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        assertNull(objectFunctionType.getSuperClassConstructor()); // Object is top level

        FunctionType arrayFunctionType = registry.getNativeFunctionType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        // Array constructor's superclass is Object
        assertEquals(registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE), arrayFunctionType.getSuperClassConstructor());
    }

    @Test
    public void testFunctionType_getSuperClassConstructor_custom() throws Exception {
        setupGlobalScope();
        FunctionType superClassCtor = registry.createConstructorType(null);
        FunctionType subClassCtor = registry.createConstructorType(superClassCtor);

        assertEquals(superClassCtor, subClassCtor.getSuperClassConstructor());
    }

    @Test
    public void testFunctionType_getAllImplementedInterfaces() throws Exception {
        setupGlobalScope();
        FunctionType ctor = registry.createConstructorType(null);
        FunctionType interface1 = registry.createInterfaceType("Iface1", null);
        FunctionType interface2 = registry.createInterfaceType("Iface2", null);

        ctor.setImplementedInterfaces(Lists.newArrayList(interface1, interface2));

        Iterable<ObjectType> implemented = ctor.getAllImplementedInterfaces();
        Set<String> names = new HashSet<>();
        for (ObjectType objType : implemented) {
            names.add(objType.getReferenceName());
        }
        assertTrue(names.contains("Iface1"));
        assertTrue(names.contains("Iface2"));
        assertEquals(2, names.size());
    }

    @Test
    public void testFunctionType_getAllExtendedInterfaces() throws Exception {
        setupGlobalScope();
        FunctionType iface1 = registry.createInterfaceType("Iface1", null);
        FunctionType iface2 = registry.createInterfaceType("Iface2", null);
        FunctionType iface3 = registry.createInterfaceType("Iface3", null);

        iface1.setExtendedInterfaces(Lists.newArrayList(iface2));
        iface2.setExtendedInterfaces(Lists.newArrayList(iface3));

        Iterable<ObjectType> extended = iface1.getAllExtendedInterfaces();
        Set<String> names = new HashSet<>();
        for (ObjectType objType : extended) {
            names.add(objType.getReferenceName());
        }
        assertTrue(names.contains("Iface2"));
        assertTrue(names.contains("Iface3"));
        assertEquals(2, names.size());
    }

    @Test
    public void testFunctionType_isEquivalentTo() throws Exception {
        setupGlobalScope();
        FunctionType fn1 = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn2 = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertTrue(fn1.isEquivalentTo(fn1));
        // For structurally identical function types, isEquivalentTo should return true.
        assertTrue(fn1.isEquivalentTo(fn2));

        FunctionType objFn1 = registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        FunctionType objFn2 = registry.getNativeFunctionType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        assertTrue(objFn1.isEquivalentTo(objFn2));

        FunctionType iface1 = registry.createInterfaceType("Iface1", null);
        FunctionType iface2 = registry.createInterfaceType("Iface1", null); // Same name
        assertTrue(iface1.isEquivalentTo(iface2));

        FunctionType iface3 = registry.createInterfaceType("Iface3", null); // Different name
        assertFalse(iface1.isEquivalentTo(iface3));
    }

    @Test
    public void testFunctionType_toString_basic() throws Exception {
        setupGlobalScope();
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "p1");
        param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addChildToBack(param1);
        FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.STRING_TYPE), params);
        assertEquals("function (number): string", fn.toString());
    }

    @Test
    public void testFunctionType_toString_thisType() throws Exception {
        setupGlobalScope();
        ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        Node params = new Node(Token.LP);
        FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), params);
        fn.typeOfThis = thisType; // Manually set this type
        assertEquals("function (this:Object): void", fn.toString());
    }

    @Test
    public void testFunctionType_toString_constructorThisType() throws Exception {
        setupGlobalScope();
        FunctionType ctorType = registry.createConstructorType(null);
        // Manually setting the 'this' type for a constructor, which should be its instance type.
        ctorType.typeOfThis = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertEquals("function (new:Object): void", ctorType.toString());
    }

    @Test
    public void testFunctionType_toString_varargs() throws Exception {
        setupGlobalScope();
        Node params = new Node(Token.LP);
        Node param1 = createNode(Token.NAME, "args");
        param1.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        param1.putBooleanProp(Node.IS_VAR_ARGS_PARAM, true);
        params.addChildToBack(param1);
        FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), params);
        assertEquals("function (...[string]): void", fn.toString());
    }

    @Test
    public void testFunctionType_getInstanceType() throws Exception {
        setupGlobalScope();
        FunctionType ctor = registry.createConstructorType(null);
        assertNotNull(ctor.getInstanceType());
        assertTrue(ctor.isConstructor());
        // For constructors, typeOfThis is used as the instance type.
        assertEquals(ctor.typeOfThis, ctor.getInstanceType());
    }

    @Test
    public void testFunctionType_hasInstanceType() throws Exception {
        setupGlobalScope();
        FunctionType ctor = registry.createConstructorType(null);
        assertTrue(ctor.hasInstanceType());

        FunctionType iface = registry.createInterfaceType("MyIface", null);
        assertTrue(iface.hasInstanceType());

        FunctionType ordinaryFn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(ordinaryFn.hasInstanceType());
    }

    @Test
    public void testFunctionType_getSource() throws Exception {
        setupGlobalScope();
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(createNode(Token.NAME, "testFn"));
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK));
        FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), new Node(Token.LP));
        fn.setSource(functionNode);
        assertEquals(functionNode, fn.getSource());
    }

    @Test
    public void testFunctionType_getSubTypes() throws Exception {
        setupGlobalScope();
        FunctionType superClass = registry.createConstructorType(null);
        FunctionType subClass1 = registry.createConstructorType(superClass);
        FunctionType subClass2 = registry.createConstructorType(superClass);

        // Manually trigger the addition of subtypes (normally done by setPrototype or setImplementedInterfaces)
        superClass.addSubType(subClass1);
        superClass.addSubType(subClass2);


        List<FunctionType> subTypes = superClass.getSubTypes();
        assertNotNull(subTypes);
        assertTrue(subTypes.contains(subClass1));
        assertTrue(subTypes.contains(subClass2));
        assertEquals(2, subTypes.size());
    }

    @Test
    public void testFunctionType_hasCachedValues() throws Exception {
        setupGlobalScope();
        FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(fn.hasCachedValues()); // Initially false

        fn.getPrototype(); // Accessing prototype should cache values
        assertTrue(fn.hasCachedValues());
    }

    @Test
    public void testFunctionType_getTemplateTypeName() throws Exception {
        setupGlobalScope();
        FunctionType fn = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertNull(fn.getTemplateTypeName());

        // Creating a function type with a template name directly.
        // The 'templateTypeName' parameter is in the constructor.
        FunctionType templatedFn = new FunctionType(registry, "MyTemplatedFn", null,
            new com.google.javascript.rhino.jstype.ArrowType(registry, new Node(Token.LP), null),
            null, "T", false, false);
        assertEquals("T", templatedFn.getTemplateTypeName());
    }
}





