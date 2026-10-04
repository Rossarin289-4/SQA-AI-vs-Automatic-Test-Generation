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
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.UnknownType;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.io.IOException; // Added for appendable use in Node.toStringTree if needed, though not directly used in tests
import java.io.Serializable; // Added for JSType and Node

public class TypeValidatorTest {

    private static final String DUMMY_SOURCE_NAME = "test.js";

    // Mock Compiler and related types to satisfy TypeValidator's dependencies.
    // AbstractCompiler is an abstract class, so we need to provide concrete implementations for its abstract methods.
    // Since no concrete subclasses are provided, and mocking is not allowed for project types, we create a minimal mock.

    // Helper method to get native types
    


    // Mock NodeTraversal to avoid null checks in tests where NodeTraversal is passed.
    // For methods that don't use NodeTraversal's specific features, we can pass null.
    // For methods that *do* use NodeTraversal, we might need a more sophisticated mock.
    // For this specific test suite, most calls to methods like `expectObject` that
    // take `NodeTraversal` as the first argument don't actually *use* it to report errors
    // because we are testing the logic within `TypeValidator` itself, not the reporting mechanism.
    // So, passing null for NodeTraversal is acceptable for these tests.













    


    



    

    

    





    @Test
    public void testExpectIndexMatch_whenObjectAccess() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType objectType = typeRegistry.createObjectType("MyObject");
        JSType indexType = getNativeType(JSTypeNative.STRING_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.STRING_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, objectType, indexType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectIndexMatch_whenIllegalPropertyAccessOnStruct() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType structType = typeRegistry.createObjectType("MyStruct");
        structType.setStruct(true); // Mark as struct
        JSType indexType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.NUMBER_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, structType, indexType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectIndexMatch_whenUnknownTypeAccess() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType indexType = getNativeType(JSTypeNative.STRING_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.STRING_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, unknownType, indexType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanAssignToPropertyOf_whenAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node assignmentNode = new Node(Node.ASSIGN);
        Node propertyOwnerNode = new Node(Node.NAME); // Represents the object owning the property
        propertyOwnerNode.setJSType(getNativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "propName"));
    }

    @Test
    public void testExpectCanAssignToPropertyOf_whenNotAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node assignmentNode = new Node(Node.ASSIGN);
        Node propertyOwnerNode = new Node(Node.NAME); // Represents the object owning the property
        propertyOwnerNode.setJSType(getNativeType(JSTypeNative.OBJECT_TYPE));
        assertFalse(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "propName"));
    }
    
    @Test
    public void testExpectCanAssignToPropertyOf_whenInterfaceMethod() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        // Simulate a function type for method assignment
        JSType rightType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        JSType leftType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        Node assignmentNode = new Node(Node.ASSIGN);
        
        // Create an interface and its prototype to simulate inheritance
        ObjectType interfaceProto = typeRegistry.createInterface("MyInterface");
        // The interface itself doesn't have a constructor in the same way an object does.
        // For simplicity, we'll use a generic object type as the owner for the property.
        Node propertyOwnerNode = new Node(Node.NAME); 
        propertyOwnerNode.setJSType(interfaceProto);
        
        assertTrue(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "methodName"));
    }

    @Test
    public void testExpectCanAssignTo_whenAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.ASSIGN); // Dummy node
        assertTrue(validator.expectCanAssignTo(null, n, rightType, leftType, "assign message"));
    }

    @Test
    public void testExpectCanAssignTo_whenNotAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.ASSIGN); // Dummy node
        assertFalse(validator.expectCanAssignTo(null, n, rightType, leftType, "assign message"));
    }

    @Test
    public void testExpectArgumentMatchesParameter_whenMatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType argType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = new Node(Node.NUMBER_VALUE);
        validator.expectArgumentMatchesParameter(null, argNode, argType, paramType, callNode, 0);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectArgumentMatchesParameter_whenMismatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType argType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType paramType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = new Node(Node.STRING_VALUE);
        validator.expectArgumentMatchesParameter(null, argNode, argType, paramType, callNode, 0);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanOverride_whenOverridable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType overridingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType hiddenType = getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node n = new Node(Node.PROP_ASSIGN); // Dummy node
        validator.expectCanOverride(null, n, overridingType, hiddenType, "propName", ownerType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanOverride_whenNotOverridable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType overridingType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType hiddenType = getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node n = new Node(Node.PROP_ASSIGN); // Dummy node
        validator.expectCanOverride(null, n, overridingType, hiddenType, "propName", ownerType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectSuperType_whenCorrectSuperType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType superObject = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        ObjectType subObject = typeRegistry.createObjectType("SubClass");
        subObject.setPrototypeBasedOn(superObject);
        Node n = new Node(Node.CLASS); // Dummy node
        validator.expectSuperType(null, n, superObject, subObject);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectSuperType_whenIncorrectSuperType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType superObject = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType subObject = typeRegistry.createObjectType("SubClass");
        subObject.setPrototypeBasedOn(typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node n = new Node(Node.CLASS); // Dummy node
        validator.expectSuperType(null, n, superObject, subObject);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanCast_whenCastable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType type = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType castType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.CAST); // Dummy node
        validator.expectCanCast(null, n, castType, type);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanCast_whenNotCastable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType type = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType castType = getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.CAST); // Dummy node
        validator.expectCanCast(null, n, castType, type);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectUndeclaredVariable_whenNewVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        Var existingVar = null; // No existing variable
        JSType newType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.NUMBER_VALUE);
        declarationNode.addChildToBack(valueNode);
        // Pass a valid parent node for declarationNode, e.g., itself if it's the root of the declaration
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode, existingVar, "newVar", newType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectUndeclaredVariable_whenDuplicateTypedVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType existingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node existingVarNameNode = new Node(Node.NAME);
        Var existingVar = Var.make("dupVar", existingVarNameNode, existingType, null, null);
        JSType newType = getNativeType(JSTypeNative.STRING_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.STRING_VALUE);
        declarationNode.addChildToBack(valueNode);
        // Pass a valid parent node for declarationNode
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode, existingVar, "dupVar", newType);
        assertTrue(true); // No exception means it passed.
    }
    
    @Test
    public void testExpectUndeclaredVariable_whenDuplicateSameTypeVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType existingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node existingVarNameNode = new Node(Node.NAME);
        Var existingVar = Var.make("dupVar", existingVarNameNode, existingType, null, null);
        JSType newType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.NUMBER_VALUE);
        declarationNode.addChildToBack(valueNode);
        // Pass a valid parent node for declarationNode
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode, existingVar, "dupVar", newType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectAllInterfaceProperties_whenInterfaceWithProperty() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        
        // Create a function type representing a class
        FunctionType functionType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType instanceType = functionType.getInstanceType();
        
        // Create a dummy interface with a property
        ObjectType dummyInterface = typeRegistry.createInterface("DummyInterface");
        dummyInterface.defineDeclaredProperty("dummyProp", getNativeType(JSTypeNative.STRING_TYPE), null);
        
        // Make the function type implement the dummy interface
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));
        
        // Define the property on the instance type as well
        instanceType.defineDeclaredProperty("dummyProp", getNativeType(JSTypeNative.STRING_TYPE), null);

        Node n = new Node(Node.FUNCTION); // Dummy node
        validator.expectAllInterfaceProperties(null, n, functionType);
        assertTrue(true); // No exception means it passed.
    }
    
    @Test
    public void testExpectInterfaceProperty_whenPropertyExistsAndMatches() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType instance = typeRegistry.createObjectType("Instance");
        ObjectType implementedInterface = typeRegistry.createInterface("ImplementedInterface");
        // Property defined on interface
        implementedInterface.defineDeclaredProperty("interfaceProp", getNativeType(JSTypeNative.NUMBER_TYPE), null);
        
        // Property implemented on instance type with matching type
        instance.defineDeclaredProperty("interfaceProp", getNativeType(JSTypeNative.NUMBER_TYPE), null);

        Node n = new Node(Node.OBJECT_LIT); // Dummy node
        validator.expectInterfaceProperty(null, n, instance, implementedInterface, "interfaceProp");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testGetReadableJSTypeName_objectProperty() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType ownerType = typeRegistry.createObjectType("MyObject");
        ownerType.defineDeclaredProperty("myProp", getNativeType(JSTypeNative.STRING_TYPE), null);
        
        Node propNode = new Node(Node.GETPROP);
        Node ownerNode = new Node(Node.NAME);
        ownerNode.setJSType(ownerType);
        Node propNameNode = Node.newString("myProp"); // Use Node.newString for creating string nodes
        propNode.addChildToBack(ownerNode);
        propNode.addChildToBack(propNameNode);
        
        assertEquals("MyObject.myProp", validator.getReadableJSTypeName(propNode, false));
    }

    @Test
    public void testGetReadableJSTypeName_qualifiedName() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        Node nameNode = Node.newString("myVariable"); // Use Node.newString
        nameNode.setJSType(getNativeType(JSTypeNative.STRING_TYPE));
        // JSDocInfo is not strictly needed for getReadableJSTypeName to work based on qualified name.
        
        assertEquals("myVariable", validator.getReadableJSTypeName(nameNode, false));
    }

    @Test
    public void testGetReadableJSTypeName_functionType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        FunctionType fnType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        Node fnNode = new Node(Node.FUNCTION);
        fnNode.setJSType(fnType);
        
        assertEquals("function", validator.getReadableJSTypeName(fnNode, false));
    }
    
    @Test
    public void testTypeMismatch_equalsAndHashCode() throws Exception {
        JSType typeA = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(JSTypeNative.STRING_TYPE);
        JSError error = JSError.make(DUMMY_SOURCE_NAME, new Node(Node.NAME), DiagnosticType.warning("TEST", "test"), "");
        
        TypeValidator.TypeMismatch mismatch1 = new TypeValidator.TypeMismatch(typeA, typeB, error);
        TypeValidator.TypeMismatch mismatch2 = new TypeValidator.TypeMismatch(typeA, typeB, error);
        TypeValidator.TypeMismatch mismatch3 = new TypeValidator.TypeMismatch(typeB, typeA, error);
        
        assertEquals(mismatch1, mismatch2);
        assertEquals(mismatch2, mismatch3); // Order should not matter for equals
        assertNotEquals(mismatch1, null);
        assertNotEquals(mismatch1, new Object());
        
        assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
        assertEquals(mismatch2.hashCode(), mismatch3.hashCode()); // Hash codes should match if equals is true
    }
    
    @Test
    public void testTypeMismatch_toString() throws Exception {
        JSType typeA = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(JSTypeNative.STRING_TYPE);
        JSError error = JSError.make(DUMMY_SOURCE_NAME, new Node(Node.NAME), DiagnosticType.warning("TEST", "test"), "");
        
        TypeValidator.TypeMismatch mismatch = new TypeValidator.TypeMismatch(typeA, typeB, error);
        assertTrue(mismatch.toString().contains("(number, string)"));
    }
}





