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

    private JSTypeRegistry registry = new JSTypeRegistry(null);

    // Helper method to create a basic PrototypeObjectType
    private PrototypeObjectType createObject(String className, ObjectType implicitPrototype) {
        return new PrototypeObjectType(registry, className, implicitPrototype);
    }

    // Helper method to create a basic PrototypeObjectType with a null implicit prototype
    private PrototypeObjectType createObject(String className) {
        return new PrototypeObjectType(registry, className, null);
    }

    // Helper method to create a basic ObjectType for implicit prototype
    private ObjectType createSimpleObjectType(String name) {
        return new PrototypeObjectType(registry, name, null);
    }

    // Helper for creating a native object type
    private ObjectType createNativeObjectType(JSTypeNative typeId) {
        return registry.getNativeObjectType(typeId);
    }

    @Test
    public void testGetSlot_existingProperty() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertNotNull(obj.getSlot("myProp"));
    }

    @Test
    public void testGetSlot_nonExistingProperty() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertNull(obj.getSlot("nonExistentProp"));
    }

    @Test
    public void testGetSlot_inheritedProperty() throws Exception {
        ObjectType implicitProto = createObject("Proto");
        implicitProto.defineProperty("protoProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        ObjectType obj = createObject("MyClass", implicitProto);
        assertNotNull(obj.getSlot("protoProp"));
    }

    @Test
    public void testGetPropertiesCount_noProperties() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertEquals(0, obj.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount_withProperties() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("prop1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        obj.defineProperty("prop2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertEquals(2, obj.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount_withInheritedProperties() throws Exception {
        ObjectType implicitProto = createObject("Proto");
        implicitProto.defineProperty("protoProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        ObjectType obj = createObject("MyClass", implicitProto);
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        // The count should include inherited properties
        assertEquals(2, obj.getPropertiesCount());
    }

    @Test
    public void testHasProperty_existingProperty() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(obj.hasProperty("myProp"));
    }

    @Test
    public void testHasProperty_nonExistingProperty() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertFalse(obj.hasProperty("nonExistentProp"));
    }

    @Test
    public void testHasProperty_inheritedProperty() throws Exception {
        ObjectType implicitProto = createObject("Proto");
        implicitProto.defineProperty("protoProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        ObjectType obj = createObject("MyClass", implicitProto);
        assertTrue(obj.hasProperty("protoProp"));
    }

    @Test
    public void testHasOwnProperty_existingProperty() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(obj.hasOwnProperty("myProp"));
    }

    @Test
    public void testHasOwnProperty_nonExistingProperty() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertFalse(obj.hasOwnProperty("nonExistentProp"));
    }

    @Test
    public void testHasOwnProperty_inheritedProperty() throws Exception {
        ObjectType implicitProto = createObject("Proto");
        implicitProto.defineProperty("protoProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        ObjectType obj = createObject("MyClass", implicitProto);
        assertFalse(obj.hasOwnProperty("protoProp"));
    }

    @Test
    public void testGetOwnPropertyNames_empty() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertTrue(obj.getOwnPropertyNames().isEmpty());
    }

    @Test
    public void testGetOwnPropertyNames_withProperties() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("prop1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        obj.defineProperty("prop2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        Set<String> names = obj.getOwnPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("prop1"));
        assertTrue(names.contains("prop2"));
    }

    @Test
    public void testIsPropertyTypeDeclared_declared() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(obj.isPropertyTypeDeclared("myProp"));
    }

    @Test
    public void testIsPropertyTypeDeclared_inferred() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineInferredProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        assertFalse(obj.isPropertyTypeDeclared("myProp"));
    }

    @Test
    public void testIsPropertyTypeDeclared_nonExistent() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertFalse(obj.isPropertyTypeDeclared("nonExistentProp"));
    }

    @Test
    public void testIsPropertyTypeInferred_inferred() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineInferredProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
        assertTrue(obj.isPropertyTypeInferred("myProp"));
    }

    @Test
    public void testIsPropertyTypeInferred_declared() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertFalse(obj.isPropertyTypeInferred("myProp"));
    }

    @Test
    public void testIsPropertyTypeInferred_nonExistent() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertFalse(obj.isPropertyTypeInferred("nonExistentProp"));
    }

    @Test
    public void testGetPropertyType_existing() throws Exception {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", stringType, false, null);
        assertEquals(stringType, obj.getPropertyType("myProp"));
    }

    @Test
    public void testGetPropertyType_nonExisting() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), obj.getPropertyType("nonExistentProp"));
    }

    @Test
    public void testGetPropertyType_inherited() throws Exception {
        ObjectType implicitProto = createObject("Proto");
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        implicitProto.defineProperty("protoProp", numberType, false, null);
        ObjectType obj = createObject("MyClass", implicitProto);
        assertEquals(numberType, obj.getPropertyType("protoProp"));
    }

    @Test
    public void testIsPropertyInExterns_true() throws Exception {
        // Property class is available as it's used internally by PrototypeObjectType
        Property p = new Property("externProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        p.setFromExterns(true);
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("externProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        obj.setPropertyJSDocInfo("externProp", new JSDocInfo(false)); // Dummy JSDoc to associate property
        ((PrototypeObjectType) obj).properties.put("externProp", p); // Manually set the property for testing
        assertTrue(obj.isPropertyInExterns("externProp"));
    }

    @Test
    public void testIsPropertyInExterns_false() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertFalse(obj.isPropertyInExterns("myProp"));
    }

    @Test
    public void testIsPropertyInExterns_inherited_true() throws Exception {
        Property p = new Property("externProtoProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        p.setFromExterns(true);
        ObjectType implicitProto = createObject("Proto");
        implicitProto.defineProperty("externProtoProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        implicitProto.setPropertyJSDocInfo("externProtoProp", new JSDocInfo(false)); // Dummy JSDoc
        ((PrototypeObjectType) implicitProto).properties.put("externProtoProp", p); // Manually set the property
        ObjectType obj = createObject("MyClass", implicitProto);
        assertTrue(obj.isPropertyInExterns("externProtoProp"));
    }

    @Test
    public void testRemoveProperty_existing() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(obj.removeProperty("myProp"));
        assertFalse(obj.hasOwnProperty("myProp"));
    }

    @Test
    public void testRemoveProperty_nonExisting() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertFalse(obj.removeProperty("nonExistentProp"));
    }

    @Test
    public void testGetPropertyNode_existing() throws Exception {
        Node propNode = new Node(Node.STRING); // STRING_KEY is not a valid Node type
        propNode.setString("myProp");
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, propNode);
        assertEquals(propNode, obj.getPropertyNode("myProp"));
    }

    @Test
    public void testGetPropertyNode_nonExisting() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertNull(obj.getPropertyNode("nonExistentProp"));
    }

    @Test
    public void testGetPropertyNode_inherited() throws Exception {
        Node protoNode = new Node(Node.STRING); // STRING_KEY is not a valid Node type
        protoNode.setString("protoProp");
        ObjectType implicitProto = createObject("Proto");
        implicitProto.defineProperty("protoProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, protoNode);
        ObjectType obj = createObject("MyClass", implicitProto);
        assertEquals(protoNode, obj.getPropertyNode("protoProp"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo_existing() throws Exception {
        JSDocInfo jsDoc = new JSDocInfo(true); // Use constructor without arguments
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        obj.setPropertyJSDocInfo("myProp", jsDoc);
        assertEquals(jsDoc, obj.getOwnPropertyJSDocInfo("myProp"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo_nonExisting() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertNull(obj.getOwnPropertyJSDocInfo("nonExistentProp"));
    }

    @Test
    public void testSetPropertyJSDocInfo_addsPropertyIfMissing() throws Exception {
        JSDocInfo jsDoc = new JSDocInfo(true); // Use constructor without arguments
        ObjectType obj = createObject("MyClass");
        // Property is not defined yet
        obj.setPropertyJSDocInfo("myProp", jsDoc);
        assertTrue(obj.hasOwnProperty("myProp"));
        assertEquals(jsDoc, obj.getOwnPropertyJSDocInfo("myProp"));
    }

    @Test
    public void testMatchesNumberContext_isNumberObjectType() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
        assertTrue(obj.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContext_isDateType() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.DATE_TYPE);
        assertTrue(obj.matchesNumberContext());
    }
    
    @Test
    public void testMatchesNumberContext_valueOfOverride() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("valueOf", registry.getNativeType(JSTypeNative.FUNCTION_TYPE), false, null);
        assertTrue(obj.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContext_isStringObjectType() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
        assertTrue(obj.matchesStringContext());
    }

    @Test
    public void testMatchesStringContext_isRegexpType() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.REGEXP_TYPE);
        assertTrue(obj.matchesStringContext());
    }

    @Test
    public void testMatchesStringContext_toStringOverride() throws Exception {
        ObjectType obj = createObject("MyClass");
        obj.defineProperty("toString", registry.getNativeType(JSTypeNative.FUNCTION_TYPE), false, null);
        assertTrue(obj.matchesStringContext());
    }

    @Test
    public void testUnboxesTo_string() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), obj.unboxesTo());
    }

    @Test
    public void testUnboxesTo_number() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), obj.unboxesTo());
    }

    @Test
    public void testUnboxesTo_boolean() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), obj.unboxesTo());
    }
    
    @Test
    public void testMatchesObjectContext() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertTrue(obj.matchesObjectContext());
    }

    @Test
    public void testCanBeCalled_isRegexpType() throws Exception {
        ObjectType obj = createNativeObjectType(JSTypeNative.REGEXP_TYPE);
        assertTrue(obj.canBeCalled());
    }

    @Test
    public void testGetConstructor_null() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertNull(obj.getConstructor());
    }

    @Test
    public void testGetImplicitPrototype_null() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertNull(obj.getImplicitPrototype());
    }

    @Test
    public void testGetImplicitPrototype_notNull() throws Exception {
        ObjectType implicitProto = createSimpleObjectType("Proto");
        ObjectType obj = createObject("MyClass", implicitProto);
        assertEquals(implicitProto, obj.getImplicitPrototype());
    }

    @Test
    public void testGetReferenceName_classNameNotNull() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertEquals("MyClass", obj.getReferenceName());
    }

    @Test
    public void testGetReferenceName_ownerFunctionNotNull() throws Exception {
        FunctionType func = FunctionType.forInterface(registry, "MyFunc", null);
        ObjectType proto = func.getPrototype();
        ((PrototypeObjectType) proto).setOwnerFunction(func);
        assertEquals("MyFunc.prototype", proto.getReferenceName());
    }

    @Test
    public void testGetReferenceName_null() throws Exception {
        ObjectType obj = createObject(null);
        assertNull(obj.getReferenceName());
    }

    @Test
    public void testHasReferenceName_classNameNotNull() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertTrue(obj.hasReferenceName());
    }

    @Test
    public void testHasReferenceName_ownerFunctionNotNull() throws Exception {
        FunctionType func = FunctionType.forInterface(registry, "MyFunc", null);
        ObjectType proto = func.getPrototype();
        ((PrototypeObjectType) proto).setOwnerFunction(func);
        assertTrue(proto.hasReferenceName());
    }

    @Test
    public void testHasReferenceName_null() throws Exception {
        ObjectType obj = createObject(null);
        assertFalse(obj.hasReferenceName());
    }

    @Test
    public void testIsSubtype_identical() throws Exception {
        ObjectType obj1 = createObject("MyClass");
        ObjectType obj2 = createObject("MyClass");
        assertTrue(obj1.isSubtype(obj2));
    }

    @Test
    public void testIsSubtype_different() throws Exception {
        ObjectType obj1 = createObject("MyClass1");
        ObjectType obj2 = createObject("MyClass2");
        assertFalse(obj1.isSubtype(obj2));
    }

    @Test
    public void testIsSubtype_inherited() throws Exception {
        ObjectType implicitProto = createObject("Proto");
        ObjectType obj = createObject("MyClass", implicitProto);
        assertTrue(obj.isSubtype(implicitProto));
    }

    @Test
    public void testIsSubtype_interface() throws Exception {
        ObjectType anInterface = FunctionType.forInterface(registry, "MyInterface", null).getPrototype();
        FunctionType func = FunctionType.forInterface(registry, "MyFunc", null);
        ObjectType obj = func.getPrototype();
        ((PrototypeObjectType)obj).setOwnerFunction(func);
        func.setImplementedInterfaces(ImmutableList.of(anInterface));
        assertTrue(obj.isSubtype(anInterface));
    }
    
    @Test
    public void testIsSubtype_interface_extended() throws Exception {
        FunctionType baseInterfaceFunc = FunctionType.forInterface(registry, "BaseInterface", null);
        ObjectType baseInterface = baseInterfaceFunc.getPrototype();
        FunctionType derivedInterfaceFunc = FunctionType.forInterface(registry, "DerivedInterface", null);
        ObjectType derivedInterface = derivedInterfaceFunc.getPrototype();
        derivedInterfaceFunc.setExtendedInterfaces(ImmutableList.of(baseInterface));
        assertTrue(derivedInterface.isSubtype(baseInterface));
    }

    @Test
    public void testHasCachedValues_false() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertFalse(obj.hasCachedValues());
    }

    @Test
    public void testIsNativeObjectType_true() throws Exception {
        ObjectType obj = new PrototypeObjectType(registry, "MyClass", null, true);
        assertTrue(obj.isNativeObjectType());
    }

    @Test
    public void testIsNativeObjectType_false() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertFalse(obj.isNativeObjectType());
    }

    @Test
    public void testGetOwnerFunction_null() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertNull(obj.getOwnerFunction());
    }

    @Test
    public void testGetOwnerFunction_notNull() throws Exception {
        FunctionType func = FunctionType.forInterface(registry, "MyFunc", null);
        ObjectType proto = func.getPrototype();
        ((PrototypeObjectType) proto).setOwnerFunction(func);
        assertEquals(func, proto.getOwnerFunction());
    }

    @Test
    public void testGetCtorImplementedInterfaces_empty() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertTrue(ImmutableList.copyOf(obj.getCtorImplementedInterfaces()).isEmpty());
    }

    @Test
    public void testGetCtorImplementedInterfaces_withInterfaces() throws Exception {
        FunctionType func = FunctionType.forInterface(registry, "MyFunc", null);
        ObjectType iface = FunctionType.forInterface(registry, "MyInterface", null).getPrototype();
        func.setImplementedInterfaces(ImmutableList.of(iface));
        ObjectType proto = func.getPrototype();
        ((PrototypeObjectType) proto).setOwnerFunction(func);
        assertTrue(ImmutableList.copyOf(proto.getCtorImplementedInterfaces()).contains(iface));
    }

    @Test
    public void testGetCtorExtendedInterfaces_empty() throws Exception {
        ObjectType obj = createObject("MyClass");
        assertTrue(ImmutableList.copyOf(obj.getCtorExtendedInterfaces()).isEmpty());
    }

    @Test
    public void testGetCtorExtendedInterfaces_withInterfaces() throws Exception {
        FunctionType func = FunctionType.forInterface(registry, "MyInterface", null);
        ObjectType extendedIface = FunctionType.forInterface(registry, "ExtendedInterface", null).getPrototype();
        func.setExtendedInterfaces(ImmutableList.of(extendedIface));
        ObjectType proto = func.getPrototype();
        ((PrototypeObjectType) proto).setOwnerFunction(func);
        assertTrue(ImmutableList.copyOf(proto.getCtorExtendedInterfaces()).contains(extendedIface));
    }
}
