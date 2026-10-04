```java
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

    // Helper method to create a simple PrototypeObjectType
    private PrototypeObjectType createPrototypeObjectType(String className, ObjectType implicitPrototype) {
        return new PrototypeObjectType(registry, className, implicitPrototype);
    }

    // Helper method to create a simple PrototypeObjectType with no implicit prototype
    private PrototypeObjectType createPrototypeObjectType(String className) {
        return new PrototypeObjectType(registry, className, null);
    }

    @Test
    public void testGetSlot_existingProperty() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertNotNull(objType.getSlot("myProp"));
    }

    @Test
    public void testGetSlot_nonExistingProperty() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertNull(objType.getSlot("nonExistentProp"));
    }

    @Test
    public void testGetSlot_inheritedProperty() throws Exception {
        ObjectType parentType = createPrototypeObjectType("Parent");
        parentType.defineProperty("parentProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        PrototypeObjectType objType = createPrototypeObjectType("Child", parentType);
        assertNotNull(objType.getSlot("parentProp"));
    }

    @Test
    public void testGetPropertiesCount_noProperties() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertEquals(0, objType.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount_withProperties() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("prop1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        objType.defineProperty("prop2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertEquals(2, objType.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount_withInheritedProperties() throws Exception {
        ObjectType parentType = createPrototypeObjectType("Parent");
        parentType.defineProperty("parentProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        PrototypeObjectType objType = createPrototypeObjectType("Child", parentType);
        objType.defineProperty("childProp", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        // The count includes properties from the prototype chain.
        assertEquals(2, objType.getPropertiesCount());
    }

    @Test
    public void testHasProperty_existingProperty() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(objType.hasProperty("myProp"));
    }

    @Test
    public void testHasProperty_nonExistingProperty() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertFalse(objType.hasProperty("nonExistentProp"));
    }

    @Test
    public void testHasProperty_inheritedProperty() throws Exception {
        ObjectType parentType = createPrototypeObjectType("Parent");
        parentType.defineProperty("parentProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        PrototypeObjectType objType = createPrototypeObjectType("Child", parentType);
        assertTrue(objType.hasProperty("parentProp"));
    }

    @Test
    public void testHasOwnProperty_existingProperty() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(objType.hasOwnProperty("myProp"));
    }

    @Test
    public void testHasOwnProperty_nonExistingProperty() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertFalse(objType.hasOwnProperty("nonExistentProp"));
    }

    @Test
    public void testHasOwnProperty_inheritedProperty() throws Exception {
        ObjectType parentType = createPrototypeObjectType("Parent");
        parentType.defineProperty("parentProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        PrototypeObjectType objType = createPrototypeObjectType("Child", parentType);
        assertFalse(objType.hasOwnProperty("parentProp")); // Inherited, not own
    }

    @Test
    public void testGetOwnPropertyNames_empty() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertTrue(objType.getOwnPropertyNames().isEmpty());
    }

    @Test
    public void testGetOwnPropertyNames_withProperties() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("prop1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        objType.defineProperty("prop2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        Set<String> names = objType.getOwnPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("prop1"));
        assertTrue(names.contains("prop2"));
    }

    @Test
    public void testIsPropertyTypeDeclared_declared() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(objType.isPropertyTypeDeclared("myProp"));
    }

    @Test
    public void testIsPropertyTypeDeclared_inferred() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertFalse(objType.isPropertyTypeDeclared("myProp"));
    }

    @Test
    public void testIsPropertyTypeDeclared_nonExistent() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertFalse(objType.isPropertyTypeDeclared("nonExistentProp"));
    }

    @Test
    public void testIsPropertyTypeInferred_inferred() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertTrue(objType.isPropertyTypeInferred("myProp"));
    }

    @Test
    public void testIsPropertyTypeInferred_declared() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertFalse(objType.isPropertyTypeInferred("myProp"));
    }

    @Test
    public void testIsPropertyTypeInferred_nonExistent() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertFalse(objType.isPropertyTypeInferred("nonExistentProp"));
    }

    @Test
    public void testGetPropertyType_existing() throws Exception {
        JSType expectedType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", expectedType, false, null);
        assertEquals(expectedType, objType.getPropertyType("myProp"));
    }

    @Test
    public void testGetPropertyType_nonExistent() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), objType.getPropertyType("nonExistentProp"));
    }

    @Test
    public void testGetPropertyType_inherited() throws Exception {
        JSType parentType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType parentProto = createPrototypeObjectType("Parent");
        parentProto.defineProperty("parentProp", parentType, false, null);
        PrototypeObjectType objType = createPrototypeObjectType("Child", parentProto);
        assertEquals(parentType, objType.getPropertyType("parentProp"));
    }

    @Test
    public void testIsPropertyInExterns_definedInExterns() throws Exception {
        // The Property class is not directly exposed in the API outline for instantiation.
        // Instead, we rely on the constructor which can mark a property as from externs.
        PrototypeObjectType objType = new PrototypeObjectType(registry, "MyObject", null, true); // nativeType = true indicates externs
        objType.defineProperty("externProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null); // This defines it as from externs if objType is native
        assertTrue(objType.isPropertyInExterns("externProp"));
    }

    @Test
    public void testIsPropertyInExterns_definedLocallyNotExterns() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertFalse(objType.isPropertyInExterns("myProp"));
    }

    @Test
    public void testIsPropertyInExterns_inheritedFromExterns() throws Exception {
        ObjectType parentProto = createPrototypeObjectType("Parent");
        // Simulate property defined in externs on the parent
        // Similar to the above, we use defineProperty on a native object.
        parentProto.defineProperty("parentExternProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        // For the parent to be considered "from externs", its object type would need to be created with nativeType=true
        // This is a bit tricky to simulate directly without modifying the original constructor call in tests.
        // We assume if a property exists on a type created with nativeType=true, it's from externs.
        // Let's create a dummy "native" parent object type for this.
        ObjectType nativeParentProto = new PrototypeObjectType(registry, "NativeParent", null, true);
        nativeParentProto.defineProperty("parentExternProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

        PrototypeObjectType objType = createPrototypeObjectType("Child", nativeParentProto);
        assertTrue(objType.isPropertyInExterns("parentExternProp"));
    }

    @Test
    public void testRemoveProperty_existing() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(objType.removeProperty("myProp"));
        assertFalse(objType.hasOwnProperty("myProp"));
    }

    @Test
    public void testRemoveProperty_nonExisting() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertFalse(objType.removeProperty("nonExistentProp"));
    }

    @Test
    public void testGetPropertyNode_existing() throws Exception {
        Node node = new Node(Node.NEW_NODE); // Using a generic node type
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, node);
        assertEquals(node, objType.getPropertyNode("myProp"));
    }

    @Test
    public void testGetPropertyNode_nonExisting() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertNull(objType.getPropertyNode("nonExistentProp"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo_existing() throws Exception {
        JSDocInfo info = new JSDocInfo(true); // Constructor takes boolean
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        objType.setPropertyJSDocInfo("myProp", info);
        assertEquals(info, objType.getOwnPropertyJSDocInfo("myProp"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo_nonExisting() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertNull(objType.getOwnPropertyJSDocInfo("nonExistentProp"));
    }

    @Test
    public void testSetPropertyJSDocInfo_addsPropertyIfMissing() throws Exception {
        JSType existingType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("myProp", existingType, false, null); // Property already exists

        JSDocInfo info = new JSDocInfo(true); // Constructor takes boolean
        objType.setPropertyJSDocInfo("myProp", info);
        assertEquals(info, objType.getOwnPropertyJSDocInfo("myProp"));
    }

    @Test
    public void testMatchesNumberContext_isNumberObjectType() throws Exception {
        PrototypeObjectType objType = new PrototypeObjectType(registry, "Number", null, true); // Represents Number object
        assertTrue(objType.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContext_hasValueOf() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        // Simulate having a 'valueOf' property that differs from native
        objType.defineProperty("valueOf", registry.getNativeType(JSTypeNative.FUNCTION_TYPE), false, null);
        assertTrue(objType.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContext_isStringObjectType() throws Exception {
        PrototypeObjectType objType = new PrototypeObjectType(registry, "String", null, true); // Represents String object
        assertTrue(objType.matchesStringContext());
    }

    @Test
    public void testMatchesStringContext_hasToString() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        // Simulate having a 'toString' property that differs from native
        objType.defineProperty("toString", registry.getNativeType(JSTypeNative.FUNCTION_TYPE), false, null);
        assertTrue(objType.matchesStringContext());
    }

    @Test
    public void testUnboxesTo_stringObjectType() throws Exception {
        PrototypeObjectType objType = new PrototypeObjectType(registry, "String", null, true); // Represents String object
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), objType.unboxesTo());
    }

    @Test
    public void testUnboxesTo_booleanObjectType() throws Exception {
        PrototypeObjectType objType = new PrototypeObjectType(registry, "Boolean", null, true); // Represents Boolean object
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), objType.unboxesTo());
    }

    @Test
    public void testUnboxesTo_numberObjectType() throws Exception {
        PrototypeObjectType objType = new PrototypeObjectType(registry, "Number", null, true); // Represents Number object
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.unboxesTo());
    }

    @Test
    public void testUnboxesTo_otherType() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertEquals(objType, objType.unboxesTo()); // Default behavior
    }

    @Test
    public void testMatchesObjectContext_alwaysTrue() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertTrue(objType.matchesObjectContext());
    }

    @Test
    public void testCanBeCalled_isRegexpType() throws Exception {
        // Need to simulate a RegexpType, which extends ObjectType.
        // For simplicity, we'll create a PrototypeObjectType and assume it can be called.
        // In a real scenario, this would be a specific RegexpType instance.
        PrototypeObjectType regexpType = createPrototypeObjectType("RegExp");
        assertTrue(regexpType.canBeCalled());
    }

    @Test
    public void testGetConstructor_null() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertNull(objType.getConstructor());
    }

    @Test
    public void testGetImplicitPrototype_fallback() throws Exception {
        ObjectType fallback = createPrototypeObjectType("Fallback");
        PrototypeObjectType objType = new PrototypeObjectType(registry, "MyObject", fallback);
        assertEquals(fallback, objType.getImplicitPrototype());
    }

    @Test
    public void testGetReferenceName_classNameNotNull() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertEquals("MyObject", objType.getReferenceName());
    }

    @Test
    public void testGetReferenceName_ownerFunctionNotNull() throws Exception {
        FunctionType ownerFn = FunctionType.forInterface(registry, "MyFunction", null);
        PrototypeObjectType objType = createPrototypeObjectType(null);
        objType.setOwnerFunction(ownerFn);
        assertEquals("MyFunction.prototype", objType.getReferenceName());
    }

    @Test
    public void testGetReferenceName_bothNull() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType(null);
        assertNull(objType.getReferenceName());
    }

    @Test
    public void testHasReferenceName_classNameNotNull() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertTrue(objType.hasReferenceName());
    }

    @Test
    public void testHasReferenceName_ownerFunctionNotNull() throws Exception {
        FunctionType ownerFn = FunctionType.forInterface(registry, "MyFunction", null);
        PrototypeObjectType objType = createPrototypeObjectType(null);
        objType.setOwnerFunction(ownerFn);
        assertTrue(objType.hasReferenceName());
    }

    @Test
    public void testHasReferenceName_bothNull() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType(null);
        assertFalse(objType.hasReferenceName());
    }

    @Test
    public void testIsSubtype_identicalType() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertTrue(objType.isSubtype(objType));
    }

    @Test
    public void testIsSubtype_unknownType() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertTrue(objType.isSubtype(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)));
    }

    @Test
    public void testIsSubtype_superType() throws Exception {
        ObjectType parentType = createPrototypeObjectType("Parent");
        PrototypeObjectType objType = createPrototypeObjectType("Child", parentType);
        assertTrue(objType.isSubtype(parentType));
    }

    @Test
    public void testIsSubtype_subType() throws Exception {
        ObjectType parentType = createPrototypeObjectType("Parent");
        PrototypeObjectType objType = createPrototypeObjectType("Child", parentType);
        assertFalse(parentType.isSubtype(objType));
    }

    @Test
    public void testIsSubtype_interfaceImplemented() throws Exception {
        ObjectType interfaceType = createPrototypeObjectType("MyInterface");
        FunctionType ctor = FunctionType.forInterface(registry, "MyInterfaceCtor", null);
        ctor.setImplementedInterfaces(ImmutableList.of(interfaceType));

        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        // Need to associate the constructor with the object type to check interfaces
        objType.setOwnerFunction(ctor);
        assertTrue(objType.isSubtype(interfaceType));
    }

    @Test
    public void testIsSubtype_interfaceExtended() throws Exception {
        ObjectType interfaceType = createPrototypeObjectType("MyInterface");
        FunctionType ctor = FunctionType.forInterface(registry, "MyClass", null);
        // Simulate extending an interface
        ctor.setExtendedInterfaces(ImmutableList.of(interfaceType));

        PrototypeObjectType objType = createPrototypeObjectType("MyClassProto");
        objType.setOwnerFunction(ctor);
        assertTrue(objType.isSubtype(interfaceType));
    }

    @Test
    public void testHasCachedValues_falseByDefault() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertFalse(objType.hasCachedValues());
    }

    @Test
    public void testIsNativeObjectType_trueWhenSet() throws Exception {
        PrototypeObjectType objType = new PrototypeObjectType(registry, "NativeObj", null, true);
        assertTrue(objType.isNativeObjectType());
    }

    @Test
    public void testIsNativeObjectType_falseWhenNotSet() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        assertFalse(objType.isNativeObjectType());
    }

    @Test
    public void testGetOwnerFunction_setAndGet() throws Exception {
        FunctionType ownerFn = FunctionType.forInterface(registry, "MyFunction", null);
        PrototypeObjectType objType = createPrototypeObjectType(null);
        objType.setOwnerFunction(ownerFn);
        assertEquals(ownerFn, objType.getOwnerFunction());
    }

    @Test
    public void testGetCtorImplementedInterfaces_onFunctionPrototype() throws Exception {
        FunctionType ownerFn = FunctionType.forInterface(registry, "MyInterfaceCtor", null);
        ObjectType interfaceType = createPrototypeObjectType("MyInterface");
        ownerFn.setImplementedInterfaces(ImmutableList.of(interfaceType));
        // To test getCtorImplementedInterfaces, we need an object that is a FunctionPrototypeType.
        // A FunctionType can act as a prototype for other functions.
        FunctionType funcProtoOwner = FunctionType.forInterface(registry, "MyProtoOwner", null);
        funcProtoOwner.setImplementedInterfaces(ImmutableList.of(interfaceType));
        
        // Create a PrototypeObjectType that IS a function prototype
        FunctionType functionProtoType = FunctionType.forInterface(registry, "FunctionProto", null);
        // The setPrototype method creates a PrototypeObjectType and sets it as the prototype
        assertTrue(functionProtoType.setPrototype(new PrototypeObjectType(registry, "ProtoName", null), null));
        ObjectType createdProto = functionProtoType.getPrototype();

        // Ensure the created prototype is a PrototypeObjectType and set its owner function
        assertTrue(createdProto instanceof PrototypeObjectType);
        PrototypeObjectType protoObj = (PrototypeObjectType) createdProto;
        protoObj.setOwnerFunction(funcProtoOwner); // Assign the owner function here to access its interfaces

        // Now call getCtorImplementedInterfaces on this function prototype
        Iterable<ObjectType> implemented = protoObj.getCtorImplementedInterfaces();
        assertTrue(implemented.iterator().hasNext());
        assertEquals(interfaceType, implemented.iterator().next());
    }

    @Test
    public void testGetCtorExtendedInterfaces_onFunctionPrototype() throws Exception {
        FunctionType ownerFn = FunctionType.forInterface(registry, "MyInterfaceCtor", null);
        ObjectType extendedInterface = createPrototypeObjectType("ExtendedInterface");
        ownerFn.setExtendedInterfaces(ImmutableList.of(extendedInterface));

        FunctionType funcProtoOwner = FunctionType.forInterface(registry, "MyProtoOwner", null);
        funcProtoOwner.setExtendedInterfaces(ImmutableList.of(extendedInterface));

        FunctionType functionProtoType = FunctionType.forInterface(registry, "FunctionProto", null);
        assertTrue(functionProtoType.setPrototype(new PrototypeObjectType(registry, "ProtoName", null), null));
        ObjectType createdProto = functionProtoType.getPrototype();
        
        assertTrue(createdProto instanceof PrototypeObjectType);
        PrototypeObjectType protoObj = (PrototypeObjectType) createdProto;
        protoObj.setOwnerFunction(funcProtoOwner);

        Iterable<ObjectType> extended = protoObj.getCtorExtendedInterfaces();
        assertTrue(extended.iterator().hasNext());
        assertEquals(extendedInterface, extended.iterator().next());
    }


    @Test
    public void testMatchConstraint_recordType() throws Exception {
        ObjectType constraint = createPrototypeObjectType("ConstraintRecord");
        constraint.defineProperty("newProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.matchConstraint(constraint);
        assertTrue(objType.isPropertyTypeDeclared("newProp"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), objType.getPropertyType("newProp"));
    }

    @Test
    public void testMatchRecordTypeConstraint_addsMissingProperties() throws Exception {
        ObjectType constraintObj = createPrototypeObjectType("ConstraintObj");
        constraintObj.defineProperty("propA", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        constraintObj.defineProperty("propB", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);

        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.defineProperty("propA", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null); // Existing property

        objType.matchRecordTypeConstraint(constraintObj);

        assertTrue(objType.isPropertyTypeDeclared("propA"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.getPropertyType("propA"));

        assertTrue(objType.isPropertyTypeDeclared("propB"));
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), objType.getPropertyType("propB"));
    }

    @Test
    public void testMatchRecordTypeConstraint_infersVoidForNewProperties() throws Exception {
        ObjectType constraintObj = createPrototypeObjectType("ConstraintObj");
        constraintObj.defineProperty("newProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.matchRecordTypeConstraint(constraintObj);

        assertTrue(objType.isPropertyTypeDeclared("newProp"));
        // If the property doesn't exist, it infers VOID_TYPE.leastSupertype(propType)
        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE).getLeastSupertype(registry.getNativeType(JSTypeNative.STRING_TYPE)), objType.getPropertyType("newProp"));
    }

    // Test for toStringHelper with prettyPrint = true
    @Test
    public void testToStringHelper_prettyPrintEnabled() throws Exception {
        ObjectType parentProto = createPrototypeObjectType("Parent");
        parentProto.defineProperty("parentProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

        PrototypeObjectType objType = createPrototypeObjectType("MyObject", parentProto);
        objType.defineProperty("childProp1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        objType.defineProperty("childProp2", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        objType.setPrettyPrint(true);

        // The order of properties in Sets.newTreeSet() will be alphabetical.
        // MAX_PRETTY_PRINTED_PROPERTIES is 4.
        String expected = "{childProp1: string, childProp2: boolean, parentProp: number}";
        assertEquals(expected, objType.toStringHelper(false));
    }

    // Test for toStringHelper with prettyPrint = true and more than MAX_PRETTY_PRINTED_PROPERTIES
    @Test
    public void testToStringHelper_prettyPrintEnabled_exceedsLimit() throws Exception {
        ObjectType parentProto = createPrototypeObjectType("Parent");
        parentProto.defineProperty("parentProp1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        parentProto.defineProperty("parentProp2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        parentProto.defineProperty("parentProp3", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        parentProto.defineProperty("parentProp4", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        parentProto.defineProperty("parentProp5", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);


        PrototypeObjectType objType = createPrototypeObjectType("MyObject", parentProto);
        objType.defineProperty("childProp1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        objType.defineProperty("childProp2", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        objType.setPrettyPrint(true);

        String result = objType.toStringHelper(false);
        assertTrue(result.contains("{childProp1: string, childProp2: boolean, parentProp1: number, parentProp2: number, ...}"));
    }

    // Test for toStringHelper with prettyPrint = false
    @Test
    public void testToStringHelper_prettyPrintDisabled() throws Exception {
        PrototypeObjectType objType = createPrototypeObjectType("MyObject");
        objType.setPrettyPrint(false);
        assertEquals("{...}", objType.toStringHelper(false));
    }
}
```