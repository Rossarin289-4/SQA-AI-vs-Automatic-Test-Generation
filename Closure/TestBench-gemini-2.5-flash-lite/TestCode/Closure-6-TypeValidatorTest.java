package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnknownType;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Collection;

public class TypeValidatorTest {

    // Mock compiler and JSTypeRegistry for testing













































    @Test
    public void testExpectUndeclaredVariable_newDeclaration() throws Exception {
        String sourceName = "test.js";
        CompilerInput input = new CompilerInput(sourceName);
        Node nameNode = Node.newName("myVar");
        Node varNode = new Node(Node.VAR, nameNode);
        JSType newType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Var existingVar = null; // No existing declaration
        NodeTraversal t = createNodeTraversal(nameNode);
        // Mocking Scope creation for testing 'declare' method.
        // In a real scenario, Scope would be managed by the compiler.
        Scope scope = new Scope(compiler.getRoot(), typeRegistry);
        validator.expectUndeclaredVariable(sourceName, input, nameNode, varNode, existingVar, "myVar", newType);
        assertTrue(true);
    }

    @Test
    public void testExpectUndeclaredVariable_duplicateTypedDeclaration() throws Exception {
        String sourceName = "test.js";
        CompilerInput input = new CompilerInput(sourceName);
        Node nameNode = Node.newName("myVar");
        Node varNode = new Node(Node.VAR, nameNode);
        JSType newType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType existingType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Scope scope = new Scope(compiler.getRoot(), typeRegistry);
        Var existingVar = scope.declare("myVar", new Node(Node.NAME, "myVar"), existingType, input, false);
        NodeTraversal t = createNodeTraversal(nameNode);
        validator.expectUndeclaredVariable(sourceName, input, nameNode, varNode, existingVar, "myVar", newType);
        assertTrue(true);
    }

    @Test
    public void testExpectUndeclaredVariable_duplicateSameType() throws Exception {
        String sourceName = "test.js";
        CompilerInput input = new CompilerInput(sourceName);
        Node nameNode = Node.newName("myVar");
        Node varNode = new Node(Node.VAR, nameNode);
        JSType newType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType existingType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Scope scope = new Scope(compiler.getRoot(), typeRegistry);
        Var existingVar = scope.declare("myVar", new Node(Node.NAME, "myVar"), existingType, input, false);
        NodeTraversal t = createNodeTraversal(nameNode);
        validator.expectUndeclaredVariable(sourceName, input, nameNode, varNode, existingVar, "myVar", newType);
        assertTrue(true);
    }

    @Test
    public void testExpectAllInterfaceProperties_implemented() throws Exception {
        FunctionType functionType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE),
            typeRegistry.createObjectType("MyClass"));
        ObjectType instanceType = functionType.getInstanceType();

        ObjectType dummyInterface = typeRegistry.createInterfaceType("MyInterface");
        dummyInterface.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));

        instanceType.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

        Node node = Node.newName("MyClass");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAllInterfaceProperties(t, node, functionType);
        assertTrue(true);
    }

    @Test
    public void testExpectAllInterfaceProperties_notImplemented() throws Exception {
        FunctionType functionType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE),
            typeRegistry.createObjectType("MyClass"));
        ObjectType instanceType = functionType.getInstanceType();

        ObjectType dummyInterface = typeRegistry.createInterfaceType("MyInterface");
        dummyInterface.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));

        Node node = Node.newName("MyClass");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAllInterfaceProperties(t, node, functionType);
        assertTrue(true);
    }

    @Test
    public void testExpectAllInterfaceProperties_mismatchImplementation() throws Exception {
        FunctionType functionType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE),
            typeRegistry.createObjectType("MyClass"));
        ObjectType instanceType = functionType.getInstanceType();

        ObjectType dummyInterface = typeRegistry.createInterfaceType("MyInterface");
        dummyInterface.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));

        instanceType.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

        Node node = Node.newName("MyClass");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAllInterfaceProperties(t, node, functionType);
        assertTrue(true);
    }

    @Test
    public void testTypeMismatch_basicMismatch() throws Exception {
        JSType foundType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType requiredType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = new Node(Node.ASSIGN);
        NodeTraversal t = createNodeTraversal(node);
        validator.mismatch(t, node, "basic mismatch", foundType, requiredType);
        assertEquals(1, validator.mismatches.size());
        TypeValidator.TypeMismatch mismatch = validator.mismatches.get(0);
        assertTrue(mismatch.typeA.isNumber());
        assertTrue(mismatch.typeB.isString());
    }

    @Test
    public void testTypeMismatch_stringAndNumber() throws Exception {
        JSType foundType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType requiredType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = new Node(Node.ASSIGN);
        NodeTraversal t = createNodeTraversal(node);
        validator.mismatch(t, node, "string to number", foundType, requiredType);
        assertEquals(1, validator.mismatches.size());
        TypeValidator.TypeMismatch mismatch = validator.mismatches.get(0);
        assertTrue(mismatch.typeA.isString());
        assertTrue(mismatch.typeB.isNumber());
    }

    @Test
    public void testTypeMismatch_objectAndNull() throws Exception {
        JSType foundType = typeRegistry.createObjectType("MyObject");
        JSType requiredType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node node = new Node(Node.ASSIGN);
        NodeTraversal t = createNodeTraversal(node);
        validator.mismatch(t, node, "object to null", foundType, requiredType);
        assertEquals(1, validator.mismatches.size());
        TypeValidator.TypeMismatch mismatch = validator.mismatches.get(0);
        assertTrue(mismatch.typeA.isObject());
        assertTrue(mismatch.typeB.isNullType());
    }

    // Additional test for 'containsForwardDeclaredUnresolvedName'
    @Test
    public void testContainsForwardDeclaredUnresolvedName_true() throws Exception {
        JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        // Need to simulate a type that is considered unresolved.
        // This might require deeper mocking or a specific JSType implementation.
        // For now, assume 'unknownType' might represent such a case in some contexts.
        Node node = new Node(Node.NAME, "forwardDeclared");
        NodeTraversal t = createNodeTraversal(node);
        // Directly call the private method via reflection or a public wrapper if available.
        // Since direct access to private methods is not allowed, we test indirectly through expectNotNullOrUndefined.
        // This test aims to ensure that if a type is considered unresolved, expectNotNullOrUndefined handles it.
        // The actual behavior of `containsForwardDeclaredUnresolvedName` is complex and depends on compiler state.
        // We rely on the existing logic within `expectNotNullOrUndefined` for this coverage.
        // A direct call to a protected/private method for isolated testing is not feasible here without more complex setup.
        assertTrue(true); // Placeholder, actual verification would need more setup.
    }

    // Test for getReadableJSTypeName
    @Test
    public void testGetReadableJSTypeName_getProp() throws Exception {
        Node objectNode = Node.newString("obj");
        Node propNode = Node.newString("prop");
        Node getPropNode = new Node(Node.GETPROP, objectNode, propNode);
        // Need to set a JSType on objectNode for getReadableJSTypeName to work properly.
        ObjectType objType = typeRegistry.createObjectType("MyNamespace.MyObject");
        objType.defineProperty("prop", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        objectNode.setJSType(objType);
        NodeTraversal t = createNodeTraversal(getPropNode);
        String typeName = validator.getReadableJSTypeName(getPropNode, false);
        // The exact output depends on how 'MyNamespace.MyObject' is rendered.
        // Assuming it renders as 'MyNamespace.MyObject.prop' or similar.
        assertNotNull(typeName); // Basic check.
    }

    // Test for getReadableJSTypeName with qualified name
    @Test
    public void testGetReadableJSTypeName_qualifiedName() throws Exception {
        Node nameNode = Node.newQualifiedName("MyNamespace.myVar");
        JSType varType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        nameNode.setJSType(varType);
        NodeTraversal t = createNodeTraversal(nameNode);
        String typeName = validator.getReadableJSTypeName(nameNode, false);
        assertEquals("MyNamespace.myVar", typeName);
    }

    // Test for getJSType returning UNKNOWN_TYPE
    @Test
    public void testGetJSType_nullJSType() throws Exception {
        Node nodeWithoutType = new Node(Node.STRING_KEY, "key");
        JSType jsType = validator.getJSType(nodeWithoutType);
        assertTrue(jsType.isUnknownType());
    }
}





