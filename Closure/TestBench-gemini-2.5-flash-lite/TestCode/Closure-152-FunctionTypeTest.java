package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FunctionTypeTest {

    // Helper method to create a FunctionType for testing.
    private FunctionType createFunctionType(JSTypeRegistry registry, String name, Node source, ArrowType arrowType, ObjectType typeOfThis, String templateTypeName, boolean isConstructor, boolean nativeType) {
        return new FunctionType(registry, name, source, arrowType, typeOfThis, templateTypeName, isConstructor, nativeType);
    }

    // Helper method to create a simple ArrowType.
    private ArrowType createArrowType(JSTypeRegistry registry, JSType returnType) {
        return new ArrowType(registry, new Node(Token.LP), returnType, false);
    }

    // Helper method to create a simple ObjectType.
    private ObjectType createObjectType(JSTypeRegistry registry) {
        // InstanceObjectType constructor needs the FunctionType as its first arg,
        // but it can be null for some testing purposes, or we can create a dummy one.
        // For a general object type, we might not need a specific FunctionType.
        // Let's create a basic FunctionType for this purpose.
        return new InstanceObjectType(registry, new FunctionType(registry, "Dummy", null, new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), null, null, false, false));
    }

    // Helper method to create a simple JSTypeRegistry.
    private JSTypeRegistry createRegistry() {
        return new JSTypeRegistry(null);
    }

    @Test
    public void testIsInstanceType() {
        JSTypeRegistry registry = createRegistry();
        // The universal constructor is its own instance, bizarrely.
        // To make isInstanceType return true, it needs to be equivalent to U2U_CONSTRUCTOR_TYPE.
        // This is a simplification for testing by directly using the native type.
        FunctionType functionType = (FunctionType) registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
        assertTrue(functionType.isInstanceType());
    }

    @Test
    public void testIsConstructor() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        assertTrue(functionType.isConstructor());
    }

    @Test
    public void testIsInterface() {
        JSTypeRegistry registry = createRegistry();
        FunctionType interfaceType = FunctionType.forInterface(registry, "MyInterface", null);
        assertTrue(interfaceType.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.isOrdinaryFunction());
    }

    @Test
    public void testIsFunctionType() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.isFunctionType());
    }

    @Test
    public void testCanBeCalled() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.canBeCalled());
    }

    @Test
    public void testGetParametersNode_whenExists() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertNotNull(functionType.getParametersNode());
        assertEquals(1, functionType.getParametersNode().getChildCount());
    }

    @Test
    public void testGetParametersNode_whenNull() {
        JSTypeRegistry registry = createRegistry();
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertNull(functionType.getParametersNode()); // The ArrowType constructor for LP node implies parameters is not null.
    }

    @Test
    public void testGetMinArguments_noOptionalOrVarArgs() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        paramsNode.addChildToBack(Node.newString(Token.NAME, "b"));
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertEquals(2, functionType.getMinArguments());
    }

    @Test
    public void testGetMinArguments_withOptional() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        Node optionalParam = Node.newString(Token.NAME, "b");
        optionalParam.setOptionalArg(true);
        paramsNode.addChildToBack(optionalParam);
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertEquals(1, functionType.getMinArguments());
    }

    @Test
    public void testGetMinArguments_withVarArgs() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        Node varArgsParam = Node.newString(Token.NAME, "b");
        varArgsParam.setVarArgs(true);
        paramsNode.addChildToBack(varArgsParam);
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertEquals(1, functionType.getMinArguments());
    }

    @Test
    public void testGetMaxArguments_noVarArgs() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        paramsNode.addChildToBack(Node.newString(Token.NAME, "b"));
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertEquals(2, functionType.getMaxArguments());
    }

    @Test
    public void testGetMaxArguments_withVarArgs() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        Node varArgsParam = Node.newString(Token.NAME, "b");
        varArgsParam.setVarArgs(true);
        paramsNode.addChildToBack(varArgsParam);
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertEquals(Integer.MAX_VALUE, functionType.getMaxArguments());
    }

    @Test
    public void testGetMaxArguments_noParams() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertEquals(0, functionType.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        JSTypeRegistry registry = createRegistry();
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ArrowType arrowType = createArrowType(registry, returnType);
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertEquals(returnType, functionType.getReturnType());
    }

    @Test
    public void testIsReturnTypeInferred() {
        JSTypeRegistry registry = createRegistry();
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), true);
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        assertTrue(functionType.isReturnTypeInferred());
    }

    @Test
    public void testGetPrototype() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        assertNotNull(functionType.getPrototype());
        assertTrue(functionType.getPrototype() instanceof FunctionPrototypeType);
    }

    @Test
    public void testSetPrototypeBasedOn() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        ObjectType baseType = createObjectType(registry); // Base type for prototype
        functionType.setPrototypeBasedOn(baseType);
        assertNotNull(functionType.getPrototype());
        // The exact check for setPrototypeBasedOn is complex, focusing on the side effect.
        // For instance, check if the prototype's implicit prototype is set.
        assertEquals(baseType, functionType.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testSetPrototype() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        FunctionPrototypeType proto = new FunctionPrototypeType(registry, functionType, null);
        assertTrue(functionType.setPrototype(proto));
        assertEquals(proto, functionType.getPrototype());
    }

    @Test
    public void testGetAllImplementedInterfaces_empty() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(Iterables.isEmpty(functionType.getAllImplementedInterfaces()));
    }

    @Test
    public void testGetImplementedInterfaces_empty() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(Iterables.isEmpty(functionType.getImplementedInterfaces()));
    }

    @Test
    public void testSetImplementedInterfaces() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        ObjectType interfaceType = FunctionType.forInterface(registry, "MyInterface", null);
        List<ObjectType> interfaces = ImmutableList.of(interfaceType);
        functionType.setImplementedInterfaces(interfaces);
        assertEquals(1, Iterables.size(functionType.getImplementedInterfaces()));
        assertTrue(Iterables.contains(functionType.getImplementedInterfaces(), interfaceType));
    }

    @Test
    public void testHasProperty_prototype() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.hasProperty("prototype"));
    }

    @Test
    public void testHasOwnProperty_prototype() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.hasOwnProperty("prototype"));
    }

    @Test
    public void testGetPropertyType_prototype() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        JSType protoType = functionType.getPropertyType("prototype");
        assertNotNull(protoType);
        assertTrue(protoType instanceof FunctionPrototypeType);
    }

    @Test
    public void testGetPropertyType_call_lazy() {
        JSTypeRegistry registry = createRegistry();
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, createObjectType(registry), null, false, false);
        JSType callType = functionType.getPropertyType("call");
        assertNotNull(callType);
        assertTrue(callType.isFunctionType());
    }

    @Test
    public void testGetPropertyType_apply_lazy() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        JSType applyType = functionType.getPropertyType("apply");
        assertNotNull(applyType);
        assertTrue(applyType.isFunctionType());
    }

    @Test
    public void testIsPropertyTypeInferred_prototype() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.isPropertyTypeInferred("prototype"));
    }

    @Test
    public void testGetLeastSupertype_sameType() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertEquals(functionType, functionType.getLeastSupertype(functionType));
    }

    @Test
    public void testGetGreatestSubtype_sameType() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertEquals(functionType, functionType.getGreatestSubtype(functionType));
    }

    @Test
    public void testGetSuperClassConstructor_null() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        assertNull(functionType.getSuperClassConstructor()); // This is correct when no superclass is set.
    }

    @Test
    public void testHasUnknownSupertype_false() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        assertFalse(functionType.hasUnknownSupertype());
    }

    @Test
    public void testGetTopMostDefiningType() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        // This method requires a property to exist. A simple case is "prototype".
        // Need to ensure prototype has the property for this test to be meaningful.
        ObjectType proto = functionType.getPrototype();
        proto.defineDeclaredProperty("someProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false);
        // The method should return the instance type of the function itself if it defines the property.
        assertEquals(functionType.getInstanceType(), functionType.getTopMostDefiningType("someProp"));
    }

    @Test
    public void testIsEquivalentTo_sameObject() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.isEquivalentTo(functionType));
    }

    @Test
    public void testIsEquivalentTo_differentObject() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType1 = createFunctionType(registry, "MyFunc1", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        FunctionType functionType2 = createFunctionType(registry, "MyFunc2", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        // They are not equivalent if they are different objects and not interfaces with same name.
        assertFalse(functionType1.isEquivalentTo(functionType2));
    }

    @Test
    public void testHasEqualCallType() {
        JSTypeRegistry registry = createRegistry();
        ArrowType arrowType1 = createArrowType(registry, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ArrowType arrowType2 = createArrowType(registry, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType functionType1 = createFunctionType(registry, "MyFunc1", null, arrowType1, createObjectType(registry), null, false, false);
        FunctionType functionType2 = createFunctionType(registry, "MyFunc2", null, arrowType2, createObjectType(registry), null, false, false);
        assertTrue(functionType1.hasEqualCallType(functionType2));
    }

    @Test
    public void testToString_basic() {
        JSTypeRegistry registry = createRegistry();
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ArrowType arrowType = createArrowType(registry, numberType);
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), null, false, false);
        // The toString method includes "this:Object" if typeOfThis is OBJECT_TYPE
        assertEquals("function (this:Object): number", functionType.toString());
    }

    @Test
    public void testIsSubtype_self() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertTrue(functionType.isSubtype(functionType));
    }

    @Test
    public void testGetInstanceType() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        assertNotNull(functionType.getInstanceType());
        assertTrue(functionType.getInstanceType().isInstanceType());
    }

    @Test
    public void testHasInstanceType_true() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        assertTrue(functionType.hasInstanceType());
    }

    @Test
    public void testGetTypeOfThis_nonUnknown() {
        JSTypeRegistry registry = createRegistry();
        ObjectType thisType = createObjectType(registry);
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), thisType, null, false, false);
        assertEquals(thisType, functionType.getTypeOfThis());
    }

    @Test
    public void testGetTypeOfThis_unknown() {
        JSTypeRegistry registry = createRegistry();
        // Ensure 'typeOfThis' is an UNKNOWN_TYPE for the function.
        ObjectType unknownObjType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), unknownObjType, null, false, false);
        // It should resolve to OBJECT_TYPE if it's UNKNOWN_TYPE and not NoObjectType.
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), functionType.getTypeOfThis());
    }

    @Test
    public void testGetSource() {
        JSTypeRegistry registry = createRegistry();
        Node sourceNode = new Node(Token.FUNCTION);
        FunctionType functionType = createFunctionType(registry, "MyFunc", sourceNode, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        assertEquals(sourceNode, functionType.getSource());
    }

    @Test
    public void testSetSource() {
        JSTypeRegistry registry = createRegistry();
        Node sourceNode1 = new Node(Token.FUNCTION);
        Node sourceNode2 = new Node(Token.FUNCTION);
        FunctionType functionType = createFunctionType(registry, "MyFunc", sourceNode1, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, false, false);
        functionType.setSource(sourceNode2);
        assertEquals(sourceNode2, functionType.getSource());
    }

    @Test
    public void testGetSubTypes_null() {
        JSTypeRegistry registry = createRegistry();
        // Subtypes are usually populated for constructors.
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        assertNull(functionType.getSubTypes()); // Correct when not initialized.
    }

    @Test
    public void testHasCachedValues_prototypeSet() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), null, true, false);
        functionType.getPrototype(); // This should initialize the prototype
        assertTrue(functionType.hasCachedValues());
    }

    @Test
    public void testGetTemplateTypeName() {
        JSTypeRegistry registry = createRegistry();
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, createArrowType(registry, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)), createObjectType(registry), "T", false, false);
        assertEquals("T", functionType.getTemplateTypeName());
    }

    @Test
    public void testToDebugHashCodeString_basic() {
        JSTypeRegistry registry = createRegistry();
        // To generate a meaningful debug hash code, we need a bit more structure.
        // Let's create a simple FunctionType with a parameter and return type.
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "x"));
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ArrowType arrowType = new ArrowType(registry, paramsNode, numberType);
        FunctionType functionType = createFunctionType(registry, "MyFunc", null, arrowType, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), null, false, false);
        // The toString() for debug hash code will include "this:Object" based on typeOfThis
        assertNotNull(functionType.toDebugHashCodeString());
        assertTrue(functionType.toDebugHashCodeString().contains("this:Object"));
    }
}
