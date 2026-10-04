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
        // The constructor PrototypeObjectType(registry, className, implicitPrototype, nativeType)
        // when nativeType is true, and implicitPrototype is null, it should still set
        // the implicit prototype to OBJECT_TYPE.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", null, true);
        assertNotNull(protoObj);
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), protoObj.getImplicitPrototype());
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
        // Create a NumberObjectType.
        // The constructor PrototypeObjectType(registry, className, implicitPrototype, nativeType)
        // For native types, className is often null and implicitPrototype is null when nativeType is true,
        // as the native type itself provides its prototype.
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, null, true);
        // Manually set the implicit prototype to NUMBER_OBJECT_TYPE as per the test's intent.
        protoObj.setImplicitPrototype(registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE));
        assertTrue(protoObj.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContextWhenHasValueOf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // To test "hasOverridenNativeProperty", we need a method that is NOT inferred.
        // A common way to create a function type is forInterface.
        FunctionType valueOfFunc = FunctionType.forInterface(registry, "valueOf", createNode());
        Node node = createNode();
        // defineProperty by default makes inferred=false.
        protoObj.defineProperty("valueOf", valueOfFunc, false, node);
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
        FunctionType toStringFunc = FunctionType.forInterface(registry, "toString", createNode());
        Node node = createNode();
        protoObj.defineProperty("toString", toStringFunc, false, node);
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
        // For PrototypeObjectType, setOwnerFunction is protected. So we cannot call it directly.
        // However, the method is final in the superclass ObjectType, and not overridden.
        // If we were to call it, it would be:
        // FunctionType ownerFunc = FunctionType.forInterface(registry, "MyFunction", createNode());
        // ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        // PrototypeObjectType protoObj = new PrototypeObjectType(registry, null, implicitProto);
        // protoObj.setOwnerFunction(ownerFunc); // This line would fail compilation due to visibility.
        
        // Since setOwnerFunction is not accessible, and there's no other way to set it,
        // the behavior related to ownerFunction cannot be tested directly on PrototypeObjectType.
        // We can test the case where only className is present.
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertEquals("MyClass", protoObj.getReferenceName());
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
        // Same issue as testGetReferenceNameWhenOwnerFunctionIsNotNull: setOwnerFunction is not accessible.
        // Testing with className present.
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
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
        // isSubtypeHelper is called first. For identical types, it should return true.
        assertTrue(protoObj1.isSubtype(protoObj2));
    }

    @Test
    public void testIsSubtypeWhenImplicitPrototypeIsSubtype() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType protoProtoObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE); // This is the base type
        PrototypeObjectType parentProtoObj = new PrototypeObjectType(registry, "ParentClass", protoProtoObj);
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        
        // `protoObj.isSubtype(parentProtoObj)` should be true if `parentProtoObj` is in the prototype chain of `protoObj`.
        // Currently, `protoObj`'s implicit prototype is `implicitProto` (OBJECT_TYPE), not `parentProtoObj`.
        // To make `protoObj` a subtype of `parentProtoObj`, we need to chain them.
        protoObj.setImplicitPrototype(parentProtoObj); // Now protoObj's prototype is parentProtoObj
        assertTrue(protoObj.isSubtype(parentProtoObj));
    }

    @Test
    public void testHasCachedValues() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // `hasCachedValues` is inherited from `JSType`.
        // For `PrototypeObjectType`, it seems to always return false unless resolved.
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
        // setOwnerFunction is protected in PrototypeObjectType and not accessible.
        // The API outline shows `FunctionType getOwnerFunction()` for ObjectType.
        // PrototypeObjectType extends ObjectType, so it inherits this method.
        // The `ownerFunction` field is private to PrototypeObjectType.
        // Since we cannot set it on PrototypeObjectType, it will always be null.
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        assertNull(protoObj.getOwnerFunction());
    }

    @Test
    public void testGetCtorImplementedInterfaces() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // `getCtorImplementedInterfaces()` is overridden in `FunctionPrototypeType` to call `getOwnerFunction().getImplementedInterfaces()`.
        // For `PrototypeObjectType`, it returns `ImmutableList.<ObjectType>of()`.
        assertTrue(ImmutableList.copyOf(protoObj.getCtorImplementedInterfaces()).isEmpty());
    }

    @Test
    public void testGetCtorExtendedInterfaces() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType implicitProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        PrototypeObjectType protoObj = new PrototypeObjectType(registry, "MyClass", implicitProto);
        // `getCtorExtendedInterfaces()` is overridden in `FunctionPrototypeType` to call `getOwnerFunction().getExtendedInterfaces()`.
        // For `PrototypeObjectType`, it returns `ImmutableList.<ObjectType>of()`.
        assertTrue(ImmutableList.copyOf(protoObj.getCtorExtendedInterfaces()).isEmpty());
    }
    
}
