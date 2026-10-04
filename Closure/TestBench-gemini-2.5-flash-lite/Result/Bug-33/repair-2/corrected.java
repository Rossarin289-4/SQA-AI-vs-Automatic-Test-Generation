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
import java.util.LinkedHashSet;

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
        return new JSDocInfo();
    }

    private Node createNode() {
        // Node.newString is a valid way to create a Node.
        return Node.newString("dummy");
    }

    @Test
    public void testConstructorWithClassNameAndPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
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
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", null, false);
        assertNotNull(protoObj);
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), protoObj.getImplicitPrototype());
    }
    
    @Test
    public void testConstructorWithNativeTypeAndNullPrototype() throws Exception {
        JSTypeRegistry registry = createRegistry();
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
        // The count should be the sum of local and prototype properties, excluding those shadowed locally.
        // In this case, there are no shadowed properties.
        assertEquals(1, protoObj.getPropertiesCount()); 
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
        // defineProperty defines an inferred property by default.
        protoObj.defineProperty("myProp", stringType, false, node); 
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
        protoObj.defineDeclaredProperty("myProp", stringType, node); // inferred is false by definition
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
        assertTrue(protoObj.hasOwnProperty("myProp")); // Use hasOwnProperty to check existence

        assertTrue(protoObj.removeProperty("myProp"));
        assertFalse(protoObj.hasOwnProperty("myProp")); // Use hasOwnProperty to check removal
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
        Node node = Node.newString("test"); // Corrected Node creation
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
        // Create a NumberObjectType. Assuming it's a native type.
        // The constructor requires registry, className, implicitPrototype, nativeType.
        // For native types, className is often null.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE));
        assertTrue(protoObj.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContextWhenHasValueOf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // Need a function type for valueOf. getNativeFunctionType returns null if not found.
        // Using a dummy function type for the test.
        FunctionType dummyFuncType = new FunctionType(registry, null, null, null, null, null, false, false);
        Node node = createNode();
        protoObj.defineProperty("valueOf", dummyFuncType, false, node);
        assertTrue(protoObj.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContextWhenIsStringObjectType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE));
        assertTrue(protoObj.matchesStringContext());
    }

    @Test
    public void testMatchesStringContextWhenHasToString() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        FunctionType dummyFuncType = new FunctionType(registry, null, null, null, null, null, false, false);
        Node node = createNode();
        protoObj.defineProperty("toString", dummyFuncType, false, node);
        assertTrue(protoObj.matchesStringContext());
    }

    @Test
    public void testUnboxesToString() throws Exception {
        JSTypeRegistry registry = createRegistry();
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), protoObj.unboxesTo());
    }

    @Test
    public void testUnboxesToBoolean() throws Exception {
        JSTypeRegistry registry = createRegistry();
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, null, true);
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), protoObj.unboxesTo());
    }

    @Test
    public void testUnboxesToNumber() throws Exception {
        JSTypeRegistry registry = createRegistry();
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, null, true);
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
        assertTrue(protoObj.isSubtype(parentProtoObj));
    }

    @Test
    public void testHasCachedValues() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertFalse(protoObj.hasCachedValues());
    }

    @Test
    public void testIsNativeObjectTypeWhenTrue() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto, true);
        assertTrue(protoObj.isNativeObjectType());
    }

    @Test
    public void testIsNativeObjectTypeWhenFalse() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto, false);
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
        // `getCtorImplementedInterfaces` returns an `ImmutableList` which is not empty, but its size can be 0.
        // Testing for empty iterable is more robust.
        assertTrue(ImmutableList.copyOf(protoObj.getCtorImplementedInterfaces()).isEmpty());
    }

    @Test
    public void testGetCtorExtendedInterfaces() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // This method is intended for FunctionPrototypeType. For other types, it should return empty.
        assertTrue(ImmutableList.copyOf(protoObj.getCtorExtendedInterfaces()).isEmpty());
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
        // RecordType constructor expects JSTypeRegistry and Map<String, JSType>
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
        protoObj.defineProperty("propA", existingType, false, existingNode); // This defines an inferred property

        // Create a record type constraint
        Map<String, JSType> recordProps = Maps.newHashMap();
        recordProps.put("propA", registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Different type
        recordProps.put("propB", registry.getNativeType(JSTypeNative.STRING_TYPE));
        RecordType constraint = new RecordType(registry, recordProps);

        protoObj.matchConstraint(constraint);

        // Existing property should not be overridden. `defineProperty` with `inferred=false` does not make it declared.
        // `matchConstraint` infers properties if they are not declared. If `propA` was already defined (even if inferred),
        // it shouldn't be re-inferred by `matchConstraint`.
        assertFalse(protoObj.isPropertyTypeInferred("propA")); // Should remain inferred if originally defined as inferred, or not inferred if declared.
        assertEquals(existingType, protoObj.getPropertyType("propA")); // Should retain original type
        
        // New property should be inferred.
        assertTrue(protoObj.isPropertyTypeInferred("propB"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), protoObj.getPropertyType("propB"));
    }
}
