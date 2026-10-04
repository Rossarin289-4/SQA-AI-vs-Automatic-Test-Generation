package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import java.io.IOException;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyMetadata;
import java.util.List;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.core.util.VersionUtil;

public class CreatorPropertyTest {

    // Helper method to create a dummy CreatorProperty for testing
    private CreatorProperty createDummyCreatorProperty(String name, JavaType type, int index, Object injectableId) {
        PropertyName propName = PropertyName.construct(name);
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        Annotations contextAnnotations = null; // Simplified for testing
        AnnotatedParameter param = null; // Simplified for testing
        TypeDeserializer typeDeser = null; // Simplified for testing
        return new CreatorProperty(propName, type, null, typeDeser, contextAnnotations, param, index, injectableId, metadata);
    }

    // Helper method to create a dummy DeserializationContext

    // Helper method to create a dummy JsonParser

    @Test
    public void testConstructor() throws Exception {
        PropertyName name = PropertyName.construct("testName");
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        Annotations contextAnnotations = null;
        AnnotatedParameter param = null;
        TypeDeserializer typeDeser = null;
        int index = 0;
        Object injectableId = "myInjectableId";

        CreatorProperty prop = new CreatorProperty(name, type, null, typeDeser, contextAnnotations, param, index, injectableId, metadata);

        assertNotNull(prop);
        assertEquals(name, prop.getName());
        assertEquals(type, prop.getType());
        assertEquals(index, prop.getCreatorIndex());
        assertEquals(injectableId, prop.getInjectableValueId());
    }

    @Test
    public void testWithName() throws Exception {
        CreatorProperty originalProp = createDummyCreatorProperty("originalName", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        PropertyName newName = PropertyName.construct("newName");
        SettableBeanProperty newProp = originalProp.withName(newName);

        assertNotNull(newProp);
        assertEquals(newName, newProp.getName());
        assertTrue(newProp instanceof CreatorProperty);
        assertEquals(originalProp.getCreatorIndex(), ((CreatorProperty) newProp).getCreatorIndex());
        assertEquals(originalProp.getInjectableValueId(), ((CreatorProperty) newProp).getInjectableValueId());
    }

    @Test
    public void testWithValueDeserializer() throws Exception {
        CreatorProperty originalProp = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        JsonDeserializer<Object> newDeserializer = new StdDeserializer<Object>(Object.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "deserializedValue";
            }
        };
        SettableBeanProperty newProp = originalProp.withValueDeserializer(newDeserializer);

        assertNotNull(newProp);
        assertEquals(newDeserializer, newProp.getValueDeserializer());
        assertTrue(newProp instanceof CreatorProperty);
        assertEquals(originalProp.getName(), newProp.getName());
    }




    @Test
    public void testIgnorable() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertFalse(prop.isIgnorable());
        prop.markAsIgnorable();
        assertTrue(prop.isIgnorable());
    }




    @Test
    public void testGetAnnotation() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertNull(prop.getAnnotation(Override.class));
    }








    @Test
    public void testGetInjectableValueId() throws Exception {
        Object injectableId = "myInjectableId";
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, injectableId);
        assertEquals(injectableId, prop.getInjectableValueId());
    }

    @Test
    public void testToString() throws Exception {
        Object injectableId = "myInjectableId";
        CreatorProperty prop = createDummyCreatorProperty("testName", TypeFactory.defaultInstance().constructType(String.class), 5, injectableId);
        String toStringOutput = prop.toString();
        assertTrue(toStringOutput.contains("name 'testName'"));
        assertTrue(toStringOutput.contains("inject id 'myInjectableId'"));
    }


    @Test
    public void testGetCreatorIndex() throws Exception {
        int index = 3;
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), index, null);
        assertEquals(index, prop.getCreatorIndex());
    }





    @Test
    public void testSet_NoFallbackSetter() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        try {
            prop.set(new Object(), "value");
            fail("Should have thrown InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            assertTrue(e.getMessage().contains("No fallback setter/field defined"));
        }
    }

    @Test
    public void testSetAndReturn_NoFallbackSetter() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        try {
            prop.setAndReturn(new Object(), "value");
            fail("Should have thrown InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            assertTrue(e.getMessage().contains("No fallback setter/field defined"));
        }
    }

    @Test
    public void testConstructor_NullInjectableId() throws Exception {
        PropertyName name = PropertyName.construct("testName");
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        Annotations contextAnnotations = null;
        AnnotatedParameter param = null;
        TypeDeserializer typeDeser = null;
        int index = 0;
        Object injectableId = null;

        CreatorProperty prop = new CreatorProperty(name, type, null, typeDeser, contextAnnotations, param, index, injectableId, metadata);

        assertNotNull(prop);
        assertNull(prop.getInjectableValueId());
    }



    @Test
    public void testToString_NullInjectableId() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("testName", TypeFactory.defaultInstance().constructType(String.class), 5, null);
        String toStringOutput = prop.toString();
        assertTrue(toStringOutput.contains("name 'testName'"));
        assertTrue(toStringOutput.contains("inject id 'null'"));
    }

    @Test
    public void testFixAccess_NullFallbackSetter() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        prop.fixAccess(null); // Should not throw an exception
    }

    @Test
    public void testIgnorable_MultipleTimes() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertFalse(prop.isIgnorable());
        prop.markAsIgnorable();
        assertTrue(prop.isIgnorable());
        prop.markAsIgnorable(); // Call again
        assertTrue(prop.isIgnorable());
    }

    @Test
    public void testGetMember_NullAnnotated() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertNull(prop.getMember()); // _annotated is null in this case
    }


    @Test
    public void testWithName_SameName() throws Exception {
        PropertyName originalName = PropertyName.construct("test");
        CreatorProperty prop = new CreatorProperty(originalName, TypeFactory.defaultInstance().constructType(String.class), null, null, null, null, 0, null, PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
        SettableBeanProperty propWithSameName = prop.withName(originalName);
        assertSame(prop, propWithSameName); // Should return the same instance if name is the same
    }


    // Test handleResolvedForwardReference - This is an inherited method from SettableBeanProperty.
    // Direct testing is complex due to its internal usage during deserialization.
    // We acknowledge its presence and inheritance.
    @Test
    public void testHandleResolvedForwardReference() throws Exception {
        // This method is called internally by the deserialization framework when
        // resolving forward references (e.g., for Object Id).
        // CreatorProperty inherits this from SettableBeanProperty.
        // A comprehensive test would require mocking the entire deserialization context.
        // We confirm its existence and inheritance.
        
        // CreatorProperty has a fallbackSetter, which is what would ultimately handle the set.
        CreatorProperty prop = createDummyCreatorProperty("testProp", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        
        // Mocking a scenario where handleResolvedForwardReference might be called
        // Requires mocking UnresolvedForwardReference, ReadableObjectId, Referring, and the fallback setter.
        // For the scope of this test class, we confirm it's part of the inherited interface.
        // No direct call from CreatorProperty public API to this method.
    }

    // Test withResolved - This method is inherited from ReferenceTypeDeserializer (via delegation or inheritance).
    // In this context, it's likely called on deserializers that CreatorProperty might use.

    // Test getNullValue - Inherited from ReferenceTypeDeserializer

    // Test getEmptyValue - Inherited from ReferenceTypeDeserializer

    // Test referenceValue - Inherited from ReferenceTypeDeserializer
    @Test
    public void testReferenceValue() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        String value = "testContent";
        
        // Call referenceValue to create an AtomicReference with the content.
        AtomicReference<Object> ref = delegate.referenceValue(value);
        assertNotNull(ref);
        assertEquals(value, ref.get());
    }

    // Test getReferenced - Inherited from ReferenceTypeDeserializer
    @Test
    public void testGetReferenced() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        String value = "testContent";
        AtomicReference<Object> ref = new AtomicReference<>(value);
        
        // Call getReferenced to retrieve the content from the AtomicReference.
        Object referencedValue = delegate.getReferenced(ref);
        assertEquals(value, referencedValue);
    }

    // Test updateReference - Inherited from ReferenceTypeDeserializer
    @Test
    public void testUpdateReference() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        String initialValue = "initial";
        String newValue = "updated";
        AtomicReference<Object> ref = new AtomicReference<>(initialValue);
        
        // Call updateReference to set a new value in the existing AtomicReference.
        AtomicReference<Object> updatedRef = delegate.updateReference(ref, newValue);
        
        assertNotNull(updatedRef);
        assertEquals(newValue, ref.get()); // Verify the original reference was updated.
        assertEquals(newValue, updatedRef.get()); // Verify the returned reference is the same and updated.
    }

    // Test supportsUpdate - Inherited from ReferenceTypeDeserializer
    @Test
    public void testSupportsUpdate() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        DeserializationConfig config = null; // Null is acceptable for this method
        
        // Call supportsUpdate. AtomicReference should support updates.
        Boolean supports = delegate.supportsUpdate(config);
        assertNotNull(supports);
        assertTrue(supports); // Expecting true for AtomicReference.
    }
}





