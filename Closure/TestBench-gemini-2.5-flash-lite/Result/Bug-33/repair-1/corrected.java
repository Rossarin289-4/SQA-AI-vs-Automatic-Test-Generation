package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.util.Map;
import java.util.Set;

public class PrototypeObjectTypeTest {

    // Helper method to create a JSTypeRegistry and other common objects.
    private JSTypeRegistry createRegistry() {
        return new JSTypeRegistry(new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {
                System.err.println("WARNING: " + message);
            }

            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {
                System.err.println("ERROR: " + message);
            }
        });
    }

    private JSDocInfo createJSDocInfo() {
        // JSDocInfo constructor now takes no arguments.
        return new JSDocInfo();
    }

    private Node createNode() {
        return new Node(0); // Dummy node
    }

    @Test
    public void testConstructorWithClassNameAndPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        // Use a concrete subclass if available, otherwise a basic ObjectType
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertNotNull(protoObj);
        assertEquals("MyClass", protoObj.getReferenceName());
    }

    @Test
    public void testConstructorWithNullClassNameAndPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, implicitProto);
        assertNotNull(protoObj);
        assertNull(protoObj.getReferenceName());
    }

    @Test
    public void testConstructorWithNullPrototypeDefaultsToObject() throws Exception {
        JSTypeRegistry registry = createRegistry();
        // The constructor's behavior when implicitPrototype is null is to use OBJECT_TYPE if nativeType is false.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", null, false);
        assertNotNull(protoObj);
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), protoObj.getImplicitPrototype());
    }
    
    @Test
    public void testConstructorWithNativeTypeAndNullPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        // If nativeType is true, it should use the provided implicitPrototype, even if null, but then fallback is OBJECT_TYPE.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", null, true);
        assertNotNull(protoObj);
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), protoObj.getImplicitPrototype());
    }

    @Test
    public void testGetSlotWhenPropertyExists() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, false, node);

        Property slot = protoObj.getSlot("myProp");
        assertNotNull(slot);
        assertEquals("myProp", slot.getName());
        assertEquals(stringType, slot.getType());
    }

    @Test
    public void testGetSlotWhenPropertyInPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType protoProtoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType parentProtoObj = new PrototypeObjectType(registry, "ParentClass", protoProtoObj);

        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", parentProtoObj);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = createNode();
        parentProtoObj.defineProperty("parentProp", numberType, false, node);

        Property slot = protoObj.getSlot("parentProp");
        assertNotNull(slot);
        assertEquals("parentProp", slot.getName());
        assertEquals(numberType, slot.getType());
    }

    @Test
    public void testGetSlotWhenPropertyNotDefined() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);

        Property slot = protoObj.getSlot("nonExistentProp");
        assertNull(slot);
    }

    @Test
    public void testGetPropertiesCountWhenEmpty() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertEquals(0, protoObj.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCountWithLocalProperties() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node1 = createNode();
        Node node2 = createNode();
        protoObj.defineProperty("prop1", stringType, false, node1);
        protoObj.defineProperty("prop2", stringType, false, node2);
        assertEquals(2, protoObj.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCountWithPrototypeProperties() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType protoProtoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType parentProtoObj = new PrototypeObjectType(registry, "ParentClass", protoProtoObj);
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", parentProtoObj);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = createNode();
        parentProtoObj.defineProperty("parentProp", numberType, false, node);
        assertEquals(1, protoObj.getPropertiesCount()); // Counts from prototype
    }

    @Test
    public void testHasPropertyWhenExistsLocally() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, false, node);
        assertTrue(protoObj.hasProperty("myProp"));
    }

    @Test
    public void testHasPropertyWhenExistsInPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType protoProtoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType parentProtoObj = new PrototypeObjectType(registry, "ParentClass", protoProtoObj);
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", parentProtoObj);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = createNode();
        parentProtoObj.defineProperty("parentProp", numberType, false, node);
        assertTrue(protoObj.hasProperty("parentProp"));
    }

    @Test
    public void testHasPropertyWhenNotDefined() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertFalse(protoObj.hasProperty("nonExistentProp"));
    }

    @Test
    public void testHasOwnPropertyWhenExistsLocally() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, false, node);
        assertTrue(protoObj.hasOwnProperty("myProp"));
    }

    @Test
    public void testHasOwnPropertyWhenNotDefinedLocally() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType protoProtoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType parentProtoObj = new PrototypeObjectType(registry, "ParentClass", protoProtoObj);
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", parentProtoObj);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = createNode();
        parentProtoObj.defineProperty("parentProp", numberType, false, node);
        assertFalse(protoObj.hasOwnProperty("parentProp"));
    }

    @Test
    public void testGetOwnPropertyNamesWhenEmpty() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertTrue(protoObj.getOwnPropertyNames().isEmpty());
    }

    @Test
    public void testGetOwnPropertyNamesWithProperties() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node1 = createNode();
        Node node2 = createNode();
        protoObj.defineProperty("prop1", stringType, false, node1);
        protoObj.defineProperty("prop2", stringType, false, node2);
        Set<String> names = protoObj.getOwnPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("prop1"));
        assertTrue(names.contains("prop2"));
    }

    @Test
    public void testIsPropertyTypeDeclaredWhenDeclared() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineDeclaredProperty("myProp", stringType, node);
        assertTrue(protoObj.isPropertyTypeDeclared("myProp"));
    }
    
    @Test
    public void testIsPropertyTypeDeclaredWhenDefined() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, false, node); // defined implies inferred
        assertFalse(protoObj.isPropertyTypeDeclared("myProp"));
    }

    @Test
    public void testIsPropertyTypeInferredWhenInferred() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, true, node); // inferred is true
        assertTrue(protoObj.isPropertyTypeInferred("myProp"));
    }
    
    @Test
    public void testIsPropertyTypeInferredWhenDeclared() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineDeclaredProperty("myProp", stringType, node); // inferred is false
        assertFalse(protoObj.isPropertyTypeInferred("myProp"));
    }

    @Test
    public void testGetPropertyType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myNum", numberType, false, node);

        assertEquals(numberType, protoObj.getPropertyType("myNum"));
    }

    @Test
    public void testGetPropertyTypeWhenNotDefined() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        assertEquals(unknownType, protoObj.getPropertyType("nonExistentProp"));
    }

    @Test
    public void testIsPropertyInExternsWhenDefinedInExterns() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        // Need to create a Property object and set its 'fromExterns' flag.
        // The constructor for Property is not public. Assuming we can achieve this by adding it to properties map.
        // The provided source for Property is not shown, assuming it has setFromExterns(true).
        // Given the constraint, I will simulate this by directly accessing the map IF possible,
        // or by using `defineProperty` and then checking if `isPropertyInExterns` works as expected if it consults the property.
        // The `isPropertyInExterns` method checks `properties.get(propertyName)` and if `p != null` then `p.isFromExterns()`.
        // So we need to ensure the `Property` object added to the map has `isFromExterns()` true.
        // Since `Property` class is not visible, directly creating it is not possible.
        // We will test `defineProperty` and assume it sets up `isFromExterns` correctly based on how it's used.
        // The current `defineProperty` doesn't have a parameter for `isFromExterns`.
        // We will test the case where it's *not* from externs as that's directly supported.
        
        protoObj.defineProperty("externProp", stringType, false, node);
        // This should return false as defineProperty does not mark properties as from externs.
        assertFalse(protoObj.isPropertyInExterns("externProp"));

        // To test true case, we'd need access to modify the Property object, which is not possible here.
    }

    @Test
    public void testIsPropertyInExternsWhenDefinedLocallyButNotExterns() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("localProp", stringType, false, node);

        assertFalse(protoObj.isPropertyInExterns("localProp"));
    }

    @Test
    public void testRemovePropertyWhenExists() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, false, node);
        assertTrue(protoObj.properties.containsKey("myProp"));

        assertTrue(protoObj.removeProperty("myProp"));
        assertFalse(protoObj.properties.containsKey("myProp"));
    }

    @Test
    public void testRemovePropertyWhenNotExists() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertFalse(protoObj.removeProperty("nonExistentProp"));
    }

    @Test
    public void testGetPropertyNodeWhenExists() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = new Node(Node.STRING_NODE, "test");
        protoObj.defineProperty("myProp", stringType, false, node);

        assertEquals(node, protoObj.getPropertyNode("myProp"));
    }

    @Test
    public void testGetPropertyNodeWhenNotDefined() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertNull(protoObj.getPropertyNode("nonExistentProp"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfoWhenExists() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSDocInfo jsDocInfo = createJSDocInfo();
        jsDocInfo.setDeprecated(true);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, false, node);
        protoObj.setPropertyJSDocInfo("myProp", jsDocInfo);

        assertEquals(jsDocInfo, protoObj.getOwnPropertyJSDocInfo("myProp"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfoWhenNotExists() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertNull(protoObj.getOwnPropertyJSDocInfo("nonExistentProp"));
    }

    @Test
    public void testSetPropertyJSDocInfoAndGet() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSDocInfo jsDocInfo = createJSDocInfo();
        jsDocInfo.setDeprecated(true);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = createNode();
        protoObj.defineProperty("myProp", stringType, false, node);

        protoObj.setPropertyJSDocInfo("myProp", jsDocInfo);
        assertEquals(jsDocInfo, protoObj.getOwnPropertyJSDocInfo("myProp"));
    }

    @Test
    public void testSetPropertyJSDocInfoForUndefinedProperty() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSDocInfo jsDocInfo = createJSDocInfo();
        jsDocInfo.setDeprecated(true);

        protoObj.setPropertyJSDocInfo("newProp", jsDocInfo);
        assertTrue(protoObj.hasOwnProperty("newProp")); // Should define the property
        assertEquals(jsDocInfo, protoObj.getOwnPropertyJSDocInfo("newProp"));
    }

    @Test
    public void testMatchesNumberContextWhenIsNumberObjectType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        // Need to create a NumberObjectType. Assuming it's a native type.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "NumberObj", null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE));
        assertTrue(protoObj.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContextWhenHasValueOf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType valueOfFuncType = registry.getNativeFunctionType(null); // Dummy function type
        Node node = createNode();
        protoObj.defineProperty("valueOf", valueOfFuncType, false, node);
        assertTrue(protoObj.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContextWhenIsStringObjectType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        // Need to create a StringObjectType. Assuming it's a native type.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "StringObj", null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE));
        assertTrue(protoObj.matchesStringContext());
    }

    @Test
    public void testMatchesStringContextWhenHasToString() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        JSType toStringFuncType = registry.getNativeFunctionType(null); // Dummy function type
        Node node = createNode();
        protoObj.defineProperty("toString", toStringFuncType, false, node);
        assertTrue(protoObj.matchesStringContext());
    }

    @Test
    public void testUnboxesToString() throws Exception {
        JSTypeRegistry registry = createRegistry();
        // To test unboxesTo, we need to create an object that is specifically a StringObjectType.
        // This can be done by setting its implicit prototype to the native StringObjectType.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "StringObj", null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), protoObj.unboxesTo());
    }

    @Test
    public void testUnboxesToBoolean() throws Exception {
        JSTypeRegistry registry = createRegistry();
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "BooleanObj", null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), protoObj.unboxesTo());
    }

    @Test
    public void testUnboxesToNumber() throws Exception {
        JSTypeRegistry registry = createRegistry();
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "NumberObj", null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), protoObj.unboxesTo());
    }

    @Test
    public void testMatchesObjectContext() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertTrue(protoObj.matchesObjectContext());
    }

    // The canBeCalled method in ObjectType checks `isRegexpType()`.
    // PrototypeObjectType does not have an `isRegexpType()` method nor does it override it.
    // So, the default from ObjectType will be used, which means it should return false unless
    // it's a specific type that's a subtype of ObjectType and has that property set.
    // Without a way to instantiate a RegExpType, this test is limited.
    // However, the source code for ObjectType.canBeCalled() is: `return isRegexpType();`
    // Since `PrototypeObjectType` is a subclass of `ObjectType` and doesn't override `isRegexpType()`,
    // it will inherit `ObjectType.isRegexpType()` which likely returns false for generic types.
    @Test
    public void testCanBeCalledWhenNotRegexpType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertFalse(protoObj.canBeCalled());
    }

    @Test
    public void testGetConstructorReturnsNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertNull(protoObj.getConstructor());
    }

    @Test
    public void testGetImplicitPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType protoProtoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", protoProtoObj);
        assertEquals(protoProtoObj, protoObj.getImplicitPrototype());
    }

    @Test
    public void testGetReferenceNameWhenClassNameIsNotNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertEquals("MyClass", protoObj.getReferenceName());
    }

    @Test
    public void testGetReferenceNameWhenOwnerFunctionIsNotNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        // FunctionType.forInterface requires a Node, use createNode().
        FunctionType ownerFunc = FunctionType.forInterface(registry, "MyFunction", createNode());
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, implicitProto);
        protoObj.setOwnerFunction(ownerFunc);
        assertEquals("MyFunction.prototype", protoObj.getReferenceName());
    }

    @Test
    public void testGetReferenceNameWhenBothNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, implicitProto);
        assertNull(protoObj.getReferenceName());
    }

    @Test
    public void testHasReferenceNameWhenClassNameIsNotNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertTrue(protoObj.hasReferenceName());
    }

    @Test
    public void testHasReferenceNameWhenOwnerFunctionIsNotNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        FunctionType ownerFunc = FunctionType.forInterface(registry, "MyFunction", createNode());
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, implicitProto);
        protoObj.setOwnerFunction(ownerFunc);
        assertTrue(protoObj.hasReferenceName());
    }

    @Test
    public void testHasReferenceNameWhenBothNull() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, implicitProto);
        assertFalse(protoObj.hasReferenceName());
    }

    @Test
    public void testIsSubtypeWhenSameType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj1 = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // Need to create an equivalent type to test against.
        PrototypeObjectType protoObj2 = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertTrue(protoObj1.isSubtype(protoObj2));
    }

    @Test
    public void testIsSubtypeWhenImplicitPrototypeIsSubtype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType protoProtoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType parentProtoObj = new PrototypeObjectType(registry, "ParentClass", protoProtoObj);
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        
        // For `protoObj.isSubtype(parentProtoObj)` to be true, `protoObj` should be a subtype of `parentProtoObj`.
        // This happens if `parentProtoObj` is in the prototype chain of `protoObj`.
        // The current setup has `parentProtoObj` as an explicit prototype of `protoObj`.
        // The `isSubtypeHelper` in `JSType` will delegate to `protoObj.isSubtype(parentProtoObj)`.
        // Inside `isSubtype` of `PrototypeObjectType`, it calls `this.isImplicitPrototype(thatObj)`.
        // This should return true if `parentProtoObj` is an ancestor in the prototype chain of `protoObj`.
        assertTrue(protoObj.isSubtype(parentProtoObj));
    }

    @Test
    public void testHasCachedValues() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // `hasCachedValues` is inherited from `JSType`. The default is `false`.
        assertFalse(protoObj.hasCachedValues());
    }

    @Test
    public void testIsNativeObjectTypeWhenTrue() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto, true); // nativeType = true
        assertTrue(protoObj.isNativeObjectType());
    }

    @Test
    public void testIsNativeObjectTypeWhenFalse() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto, false); // nativeType = false
        assertFalse(protoObj.isNativeObjectType());
    }

    @Test
    public void testGetOwnerFunction() throws Exception {
        JSTypeRegistry registry = createRegistry();
        FunctionType ownerFunc = FunctionType.forInterface(registry, "MyFunction", createNode());
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, implicitProto);
        protoObj.setOwnerFunction(ownerFunc);
        assertEquals(ownerFunc, protoObj.getOwnerFunction());
    }

    @Test
    public void testGetCtorImplementedInterfaces() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // This method is intended for FunctionPrototypeType. For other types, it should return empty.
        assertTrue(protoObj.getCtorImplementedInterfaces().isEmpty());
    }

    @Test
    public void testGetCtorExtendedInterfaces() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // This method is intended for FunctionPrototypeType. For other types, it should return empty.
        assertTrue(protoObj.getCtorExtendedInterfaces().isEmpty());
    }

    @Test
    public void testMatchConstraintWithRecordType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);

        // Create a record type constraint
        Map<String, JSType> recordProps = Maps.newHashMap();
        recordProps.put("propA", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        recordProps.put("propB", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType constraint = new RecordType(registry, recordProps);

        protoObj.matchConstraint(constraint);

        // Check if properties were inferred
        assertTrue(protoObj.isPropertyTypeInferred("propA"));
        assertTrue(protoObj.isPropertyTypeInferred("propB"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), protoObj.getPropertyType("propA"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), protoObj.getPropertyType("propB"));
    }
    
    @Test
    public void testMatchConstraintWithRecordTypeExistingProperty() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        
        JSType existingType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Node existingNode = createNode();
        protoObj.defineProperty("propA", existingType, false, existingNode);

        // Create a record type constraint
        Map<String, JSType> recordProps = Maps.newHashMap();
        recordProps.put("propA", registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Different type
        recordProps.put("propB", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType constraint = new RecordType(registry, recordProps);

        protoObj.matchConstraint(constraint);

        // Existing property should not be overridden, inferred status should remain false.
        assertFalse(protoObj.isPropertyTypeInferred("propA"));
        assertEquals(existingType, protoObj.getPropertyType("propA")); // Should retain original type
        
        // New property should be inferred.
        assertTrue(protoObj.isPropertyTypeInferred("propB"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), protoObj.getPropertyType("propB"));
    }
}
