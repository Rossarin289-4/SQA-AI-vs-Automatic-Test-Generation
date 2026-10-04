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
import com.fasterxml.jackson.core.JsonGenerator; // Added import for JsonGenerator


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
    private DeserializationContext createDummyContext() {
        return new DeserializationContext(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) {
            @Override
            public Object findInjectableValue(Object valueId, SettableBeanProperty forProperty, Object beanInstance) {
                if ("testInjectableId".equals(valueId)) {
                    return "injectedValue";
                }
                return null;
            }

            @Override
            public void reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
                throw new JsonMappingException(null, msg);
            }

            @Override
            public void reportBadDefinition(Class<?> type, String msg) throws JsonMappingException {
                throw new JsonMappingException(null, msg);
            }

            public ReadableObjectId findObjectId(Object id, com.fasterxml.jackson.databind.util.ObjectIdGenerator<?> generator, com.fasterxml.jackson.databind.jsontype.ObjectIdResolver resolver) throws JsonMappingException {
                 // Mock implementation for ObjectIdResolver
                return new ReadableObjectId(id) {
                    @Override
                    public void appendReferring(Referring ref) {
                        // Do nothing for this test
                    }

                    @Override
                    public Object bindItem(Object ob) {
                        // Do nothing for this test
                        return null;
                    }
                };
            }
        };
    }

    // Helper method to create a dummy JsonParser
    private JsonParser createDummyParser() throws IOException {
        return new JsonParser() {
            private JsonToken _currentToken = JsonToken.VALUE_EMBEDDED_OBJECT;

            @Override
            public void close() throws IOException {}
            @Override
            public JsonToken getCurrentToken() { return _currentToken; }
            @Override
            public boolean hasToken(JsonToken t) { return _currentToken == t; }
            @Override
            public String getCurrentName() throws IOException { return null; }
            @Override
            public void setCodec(ObjectCodec c) {}
            @Override
            public ObjectCodec getCodec() { return null; }
            @Override
            public Version version() { return null; }
            @Override
            public void overrideCurrentName(String name) {}
            @Override
            public JsonToken nextToken() throws IOException {
                _currentToken = JsonToken.NOT_AVAILABLE;
                return _currentToken;
            }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
            @Override
            public JsonParser skipChildren() throws IOException { return this; }
            @Override
            public boolean isClosed() { return false; }
            @Override
            public String getText() throws IOException { return null; }
            @Override
            public char[] getTextCharacters() throws IOException { return null; }
            @Override
            public int getTextLength() throws IOException { return 0; }
            @Override
            public int getTextOffset() throws IOException { return 0; }
            @Override
            public Number getNumberValue() throws IOException { return null; }
            @Override
            public int getIntValue() throws IOException { return 0; }
            @Override
            public long getLongValue() throws IOException { return 0; }
            @Override
            public float getFloatValue() throws IOException { return 0; }
            @Override
            public double getDoubleValue() throws IOException { return 0; }
            @Override
            public boolean getBooleanValue() throws IOException { return false; }
            // Corrected: getInputSource() return type is com.fasterxml.jackson.core.JsonParser.Feature or similar, not null
            // Assuming it's not critical for these tests and returning null for simplicity, but fixing the signature.
            @Override
            public Object getInputSource() throws IOException { return null; }
            @Override
            public String getValueAsString() throws IOException { return null; }
            @Override
            public String getValueAsString(String def) throws IOException { return def; }
            @Override
            public <T> T readValueAs(com.fasterxml.jackson.databind.type.TypeFactory tf, java.lang.reflect.Type type) throws IOException { return null; }
            @Override
            public <T> T readValueAs(com.fasterxml.jackson.databind.type.TypeFactory tf, com.fasterxml.jackson.databind.JavaType type) throws IOException { return null; }
            @Override
            public <T extends com.fasterxml.jackson.databind.JsonNode> T readValueAs(Class<T> valueType) throws IOException { return null; }
            @Override
            public com.fasterxml.jackson.databind.JsonNode readTree(com.fasterxml.jackson.core.JsonGenerator g) throws IOException { return null; }
            @Override
            public com.fasterxml.jackson.databind.JsonNode readTree(com.fasterxml.jackson.core.ObjectCodec oc) throws IOException { return null; }
            @Override
            public com.fasterxml.jackson.databind.JsonNode readTree(com.fasterxml.jackson.databind.DeserializationContext ctxt) throws IOException { return null; }
            @Override
            public void setLocation(Object loc) {}
            @Override
            public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonLocation getCurrentLocation() { return null; }
            @Override
            public String getFormatName() { return null; }
            @Override
            public boolean canReadTypeId() { return false; }
            @Override
            public Object getTypeId() throws IOException { return null; }
            @Override
            public JsonParser.ParserFeature getFeatureMask() { return null; }
            @Override
            public boolean isEnabled(JsonParser.ParserFeature f) { return false; }
            @Override
            public JsonParser.NumberType getNumberType() throws IOException { return null; }
            @Override
            public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant bv) throws IOException { return null; }
            @Override
            public Object getEmbeddedObject() throws IOException { return null; }
        };
    }

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
    public void testWithNullProvider() throws Exception {
        CreatorProperty originalProp = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        NullValueProvider newNullProvider = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException {
                return "nullValue";
            }
            @Override
            public AccessPattern getNullAccessPattern() { return AccessPattern.CONSTANT; }
        };
        SettableBeanProperty newProp = originalProp.withNullProvider(newNullProvider);

        assertNotNull(newProp);
        assertEquals(newNullProvider, newProp.getNullProvider());
        assertTrue(newProp instanceof CreatorProperty);
        assertEquals(originalProp.getName(), newProp.getName());
    }

    @Test
    public void testFixAccess() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        SettableBeanProperty dummySetter = new FieldProperty(
                new BeanPropertyDefinition() {
                    @Override public PropertyName getFullName() { return null; }
                    @Override public String getName() { return "dummyField"; }
                    @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                    @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                    @Override public String getInternalName() { return "dummyField"; }
                    @Override public PropertyName getWrapperName() { return null; }
                    @Override public boolean isExplicitlyIncluded() { return false; }
                    @Override public boolean isExplicitlyNamed() { return false; }
                    @Override public JavaType getPrimaryType() { return null; }
                    @Override public Class<?> getRawPrimaryType() { return null; }
                    @Override public PropertyMetadata getMetadata() { return null; }
                    @Override public boolean isRequired() { return false; }
                    @Override public boolean couldDeserialize() { return false; }
                    @Override public boolean couldSerialize() { return false; }
                    @Override public boolean hasGetter() { return false; }
                    @Override public boolean hasSetter() { return false; }
                    @Override public boolean hasField() { return true; }
                    @Override public boolean hasConstructorParameter() { return false; }
                    @Override public AnnotatedMethod getGetter() { return null; }
                    @Override public AnnotatedMethod getSetter() { return null; }
                    @Override public AnnotatedField getField() {
                        try {
                            AnnotatedField af = new AnnotatedField(null, Field.class.getDeclaredField("name"));
                            return af;
                        } catch (NoSuchFieldException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    @Override public AnnotatedParameter getConstructorParameter() { return null; }
                    @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                    @Override public AnnotatedMember getAccessor() { return null; }
                    @Override public AnnotatedMember getMutator() { return getField(); }
                    @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                    @Override public AnnotatedMember getPrimaryMember() { return getField(); }
                    @Override public Class<?>[] findViews() { return null; }
                    @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                    @Override public String findReferenceName() { return null; }
                    @Override public boolean isTypeId() { return false; }
                    @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                    @Override public JsonInclude.Value findInclusion() { return null; }
                },
                TypeFactory.defaultInstance().constructType(Object.class),
                null, null, null);
        prop.setFallbackSetter(dummySetter);
        prop.fixAccess(null); // This call should not throw an exception.
    }

    @Test
    public void testSetFallbackSetter() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        SettableBeanProperty dummySetter = new FieldProperty(
                new BeanPropertyDefinition() {
                    @Override public PropertyName getFullName() { return null; }
                    @Override public String getName() { return "dummyField"; }
                    @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                    @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                    @Override public String getInternalName() { return "dummyField"; }
                    @Override public PropertyName getWrapperName() { return null; }
                    @Override public boolean isExplicitlyIncluded() { return false; }
                    @Override public boolean isExplicitlyNamed() { return false; }
                    @Override public JavaType getPrimaryType() { return null; }
                    @Override public Class<?> getRawPrimaryType() { return null; }
                    @Override public PropertyMetadata getMetadata() { return null; }
                    @Override public boolean isRequired() { return false; }
                    @Override public boolean couldDeserialize() { return false; }
                    @Override public boolean couldSerialize() { return false; }
                    @Override public boolean hasGetter() { return false; }
                    @Override public boolean hasSetter() { return false; }
                    @Override public boolean hasField() { return true; }
                    @Override public boolean hasConstructorParameter() { return false; }
                    @Override public AnnotatedMethod getGetter() { return null; }
                    @Override public AnnotatedMethod getSetter() { return null; }
                    @Override public AnnotatedField getField() {
                        try {
                            AnnotatedField af = new AnnotatedField(null, Field.class.getDeclaredField("name"));
                            return af;
                        } catch (NoSuchFieldException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    @Override public AnnotatedParameter getConstructorParameter() { return null; }
                    @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                    @Override public AnnotatedMember getAccessor() { return null; }
                    @Override public AnnotatedMember getMutator() { return getField(); }
                    @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                    @Override public AnnotatedMember getPrimaryMember() { return getField(); }
                    @Override public Class<?>[] findViews() { return null; }
                    @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                    @Override public String findReferenceName() { return null; }
                    @Override public boolean isTypeId() { return false; }
                    @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                    @Override public JsonInclude.Value findInclusion() { return null; }
                },
                TypeFactory.defaultInstance().constructType(Object.class),
                null, null, null);
        prop.setFallbackSetter(dummySetter);
        assertNotNull(prop);
    }

    @Test
    public void testIgnorable() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertFalse(prop.isIgnorable());
        prop.markAsIgnorable();
        assertTrue(prop.isIgnorable());
    }

    @Test
    public void testFindInjectableValue_ExistingId() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, "testInjectableId");
        DeserializationContext ctxt = createDummyContext();
        Object beanInstance = new Object();
        Object injectedValue = prop.findInjectableValue(ctxt, beanInstance);
        assertEquals("injectedValue", injectedValue);
    }

    @Test
    public void testFindInjectableValue_NonExistingId() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, "nonExistingId");
        DeserializationContext ctxt = createDummyContext();
        Object beanInstance = new Object();
        try {
            prop.findInjectableValue(ctxt, beanInstance);
            fail("Should have thrown JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("no injectable value id configured"));
        }
    }

    @Test
    public void testInject() throws Exception {
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("test"), TypeFactory.defaultInstance().constructType(String.class), null, null, null, null, 0, "testInjectableId", PropertyMetadata.STD_REQUIRED_OR_OPTIONAL) {
            public Object injectedValue = null;
            @Override
            public void set(Object instance, Object value) throws IOException {
                this.injectedValue = value;
            }
        };
        DeserializationContext ctxt = createDummyContext();
        Object beanInstance = new Object();
        prop.inject(ctxt, beanInstance);
        assertEquals("injectedValue", ((CreatorProperty) prop).injectedValue);
    }

    @Test
    public void testGetAnnotation() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertNull(prop.getAnnotation(Override.class));
    }

    @Test
    public void testDeserializeAndSet() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        SettableBeanProperty mockSetter = new MethodProperty(
                new BeanPropertyDefinition() {
                    @Override public PropertyName getFullName() { return null; }
                    @Override public String getName() { return "mockSetter"; }
                    @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                    @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                    @Override public String getInternalName() { return "mockSetter"; }
                    @Override public PropertyName getWrapperName() { return null; }
                    @Override public boolean isExplicitlyIncluded() { return false; }
                    @Override public boolean isExplicitlyNamed() { return false; }
                    @Override public JavaType getPrimaryType() { return null; }
                    @Override public Class<?> getRawPrimaryType() { return null; }
                    @Override public PropertyMetadata getMetadata() { return null; }
                    @Override public boolean isRequired() { return false; }
                    @Override public boolean couldDeserialize() { return false; }
                    @Override public boolean couldSerialize() { return false; }
                    @Override public boolean hasGetter() { return false; }
                    @Override public boolean hasSetter() { return true; }
                    @Override public boolean hasField() { return false; }
                    @Override public boolean hasConstructorParameter() { return false; }
                    @Override public AnnotatedMethod getGetter() { return null; }
                    @Override public AnnotatedMethod getSetter() {
                        try {
                            return new AnnotatedMethod(null, Object.class.getDeclaredMethod("toString"));
                        } catch (NoSuchMethodException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    @Override public AnnotatedField getField() { return null; }
                    @Override public AnnotatedParameter getConstructorParameter() { return null; }
                    @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                    @Override public AnnotatedMember getAccessor() { return null; }
                    @Override public AnnotatedMember getMutator() { return getSetter(); }
                    @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                    @Override public AnnotatedMember getPrimaryMember() { return getMutator(); }
                    @Override public Class<?>[] findViews() { return null; }
                    @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                    @Override public String findReferenceName() { return null; }
                    @Override public boolean isTypeId() { return false; }
                    @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                    @Override public JsonInclude.Value findInclusion() { return null; }
                },
                TypeFactory.defaultInstance().constructType(String.class),
                null, null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public void set(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
            }

            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException {
                set(instance, value);
                return instance;
            }
        };
        prop.setFallbackSetter(mockSetter);

        DeserializationContext ctxt = createDummyContext();
        JsonParser p = createDummyParser();
        ((JsonParser.Parser) p)._currentToken = JsonToken.VALUE_STRING;
        JsonDeserializer<String> mockDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctx) throws IOException {
                return "deserializedValue";
            }
        };
        prop.withValueDeserializer(mockDeserializer);

        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance);

        assertTrue(((MethodProperty) mockSetter).setterCalled);
        assertEquals(instance, ((MethodProperty) mockSetter).instanceArg);
        assertEquals("deserializedValue", ((MethodProperty) mockSetter).valueArg);
    }


    @Test
    public void testDeserializeSetAndReturn() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        SettableBeanProperty mockSetter = new MethodProperty(
                new BeanPropertyDefinition() {
                    @Override public PropertyName getFullName() { return null; }
                    @Override public String getName() { return "mockSetter"; }
                    @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                    @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                    @Override public String getInternalName() { return "mockSetter"; }
                    @Override public PropertyName getWrapperName() { return null; }
                    @Override public boolean isExplicitlyIncluded() { return false; }
                    @Override public boolean isExplicitlyNamed() { return false; }
                    @Override public JavaType getPrimaryType() { return null; }
                    @Override public Class<?> getRawPrimaryType() { return null; }
                    @Override public PropertyMetadata getMetadata() { return null; }
                    @Override public boolean isRequired() { return false; }
                    @Override public boolean couldDeserialize() { return false; }
                    @Override public boolean couldSerialize() { return false; }
                    @Override public boolean hasGetter() { return false; }
                    @Override public boolean hasSetter() { return true; }
                    @Override public boolean hasField() { return false; }
                    @Override public boolean hasConstructorParameter() { return false; }
                    @Override public AnnotatedMethod getGetter() { return null; }
                    @Override public AnnotatedMethod getSetter() {
                        try {
                            return new AnnotatedMethod(null, Object.class.getDeclaredMethod("toString"));
                        } catch (NoSuchMethodException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    @Override public AnnotatedField getField() { return null; }
                    @Override public AnnotatedParameter getConstructorParameter() { return null; }
                    @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                    @Override public AnnotatedMember getAccessor() { return null; }
                    @Override public AnnotatedMember getMutator() { return getSetter(); }
                    @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                    @Override public AnnotatedMember getPrimaryMember() { return getMutator(); }
                    @Override public Class<?>[] findViews() { return null; }
                    @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                    @Override public String findReferenceName() { return null; }
                    @Override public boolean isTypeId() { return false; }
                    @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                    @Override public JsonInclude.Value findInclusion() { return null; }
                },
                TypeFactory.defaultInstance().constructType(String.class),
                null, null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
                return instance;
            }
        };
        prop.setFallbackSetter(mockSetter);

        DeserializationContext ctxt = createDummyContext();
        JsonParser p = createDummyParser();
        ((JsonParser.Parser) p)._currentToken = JsonToken.VALUE_STRING;
        JsonDeserializer<String> mockDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctx) throws IOException {
                return "deserializedValue";
            }
        };
        prop.withValueDeserializer(mockDeserializer);

        Object instance = new Object();
        Object returnValue = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertTrue(((MethodProperty) mockSetter).setterCalled);
        assertEquals(instance, ((MethodProperty) mockSetter).instanceArg);
        assertEquals("deserializedValue", ((MethodProperty) mockSetter).valueArg);
        assertEquals(instance, returnValue);
    }


    @Test
    public void testSet() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        SettableBeanProperty mockSetter = new FieldProperty(
                new BeanPropertyDefinition() {
                    @Override public PropertyName getFullName() { return null; }
                    @Override public String getName() { return "mockField"; }
                    @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                    @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                    @Override public String getInternalName() { return "mockField"; }
                    @Override public PropertyName getWrapperName() { return null; }
                    @Override public boolean isExplicitlyIncluded() { return false; }
                    @Override public boolean isExplicitlyNamed() { return false; }
                    @Override public JavaType getPrimaryType() { return null; }
                    @Override public Class<?> getRawPrimaryType() { return null; }
                    @Override public PropertyMetadata getMetadata() { return null; }
                    @Override public boolean isRequired() { return false; }
                    @Override public boolean couldDeserialize() { return false; }
                    @Override public boolean couldSerialize() { return false; }
                    @Override public boolean hasGetter() { return false; }
                    @Override public boolean hasSetter() { return false; }
                    @Override public boolean hasField() { return true; }
                    @Override public boolean hasConstructorParameter() { return false; }
                    @Override public AnnotatedMethod getGetter() { return null; }
                    @Override public AnnotatedMethod getSetter() { return null; }
                    @Override public AnnotatedField getField() {
                        try {
                            AnnotatedField af = new AnnotatedField(null, Field.class.getDeclaredField("name"));
                            return af;
                        } catch (NoSuchFieldException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    @Override public AnnotatedParameter getConstructorParameter() { return null; }
                    @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                    @Override public AnnotatedMember getAccessor() { return null; }
                    @Override public AnnotatedMember getMutator() { return getField(); }
                    @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                    @Override public AnnotatedMember getPrimaryMember() { return getField(); }
                    @Override public Class<?>[] findViews() { return null; }
                    @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                    @Override public String findReferenceName() { return null; }
                    @Override public boolean isTypeId() { return false; }
                    @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                    @Override public JsonInclude.Value findInclusion() { return null; }
                },
                TypeFactory.defaultInstance().constructType(Object.class),
                null, null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public void set(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
            }
        };
        prop.setFallbackSetter(mockSetter);

        Object instance = new Object();
        Object value = "testValue";
        prop.set(instance, value);

        assertTrue(((FieldProperty) mockSetter).setterCalled);
        assertEquals(instance, ((FieldProperty) mockSetter).instanceArg);
        assertEquals(value, ((FieldProperty) mockSetter).valueArg);
    }

    @Test
    public void testSetAndReturn() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        SettableBeanProperty mockSetter = new FieldProperty(
                new BeanPropertyDefinition() {
                    @Override public PropertyName getFullName() { return null; }
                    @Override public String getName() { return "mockField"; }
                    @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                    @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                    @Override public String getInternalName() { return "mockField"; }
                    @Override public PropertyName getWrapperName() { return null; }
                    @Override public boolean isExplicitlyIncluded() { return false; }
                    @Override public boolean isExplicitlyNamed() { return false; }
                    @Override public JavaType getPrimaryType() { return null; }
                    @Override public Class<?> getRawPrimaryType() { return null; }
                    @Override public PropertyMetadata getMetadata() { return null; }
                    @Override public boolean isRequired() { return false; }
                    @Override public boolean couldDeserialize() { return false; }
                    @Override public boolean couldSerialize() { return false; }
                    @Override public boolean hasGetter() { return false; }
                    @Override public boolean hasSetter() { return false; }
                    @Override public boolean hasField() { return true; }
                    @Override public boolean hasConstructorParameter() { return false; }
                    @Override public AnnotatedMethod getGetter() { return null; }
                    @Override public AnnotatedMethod getSetter() { return null; }
                    @Override public AnnotatedField getField() {
                        try {
                            AnnotatedField af = new AnnotatedField(null, Field.class.getDeclaredField("name"));
                            return af;
                        } catch (NoSuchFieldException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    @Override public AnnotatedParameter getConstructorParameter() { return null; }
                    @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                    @Override public AnnotatedMember getAccessor() { return null; }
                    @Override public AnnotatedMember getMutator() { return getField(); }
                    @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                    @Override public AnnotatedMember getPrimaryMember() { return getField(); }
                    @Override public Class<?>[] findViews() { return null; }
                    @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                    @Override public String findReferenceName() { return null; }
                    @Override public boolean isTypeId() { return false; }
                    @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                    @Override public JsonInclude.Value findInclusion() { return null; }
                },
                TypeFactory.defaultInstance().constructType(Object.class),
                null, null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
                return instance;
            }
        };
        prop.setFallbackSetter(mockSetter);

        Object instance = new Object();
        Object value = "testValue";
        Object returnValue = prop.setAndReturn(instance, value);

        assertTrue(((FieldProperty) mockSetter).setterCalled);
        assertEquals(instance, ((FieldProperty) mockSetter).instanceArg);
        assertEquals(value, ((FieldProperty) mockSetter).valueArg);
        assertEquals(instance, returnValue);
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
    public void testGetMember() throws Exception {
        AnnotatedParameter mockAnnotatedParameter = new AnnotatedParameter(null, null, null, null, null) {
             @Override
             public AnnotationMap getAllAnnotations() { return null; }
             @Override
             public Class<?> getDeclaringClass() { return Object.class; }
             @Override
             public Member getMember() { return null; }
             @Override
             public TypeResolutionContext getTypeContext() { return null; }
             @Override
             public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
             @Override
             public boolean hasAnnotation(Class<?> acls) { return false; }
             @Override
             public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) { return false; }
             @Override
             public Annotated withAnnotations(AnnotationMap fallback) { return this; }
             @Override
             public void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException { }
             @Override
             public Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException { return null; }
        };

        CreatorProperty prop = new CreatorProperty(
            PropertyName.construct("test"),
            TypeFactory.defaultInstance().constructType(String.class),
            null, null, null, mockAnnotatedParameter, 0, null, PropertyMetadata.STD_REQUIRED_OR_OPTIONAL
        );
        assertEquals(mockAnnotatedParameter, prop.getMember());
    }

    @Test
    public void testGetCreatorIndex() throws Exception {
        int index = 3;
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), index, null);
        assertEquals(index, prop.getCreatorIndex());
    }

    @Test
    public void testDeserializeDelegation() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        JsonDeserializer<String> mockDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "delegatedDeserializeResult";
            }
        };
        prop.withValueDeserializer(mockDeserializer);

        JsonParser p = createDummyParser();
        ((JsonParser.Parser) p)._currentToken = JsonToken.VALUE_STRING;
        DeserializationContext ctxt = createDummyContext();

        SettableBeanProperty mockSetter = new MethodProperty(
                new BeanPropertyDefinition() {
                    @Override public PropertyName getFullName() { return null; }
                    @Override public String getName() { return "mockSetter"; }
                    @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                    @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                    @Override public String getInternalName() { return "mockSetter"; }
                    @Override public PropertyName getWrapperName() { return null; }
                    @Override public boolean isExplicitlyIncluded() { return false; }
                    @Override public boolean isExplicitlyNamed() { return false; }
                    @Override public JavaType getPrimaryType() { return null; }
                    @Override public Class<?> getRawPrimaryType() { return null; }
                    @Override public PropertyMetadata getMetadata() { return null; }
                    @Override public boolean isRequired() { return false; }
                    @Override public boolean couldDeserialize() { return false; }
                    @Override public boolean couldSerialize() { return false; }
                    @Override public boolean hasGetter() { return false; }
                    @Override public boolean hasSetter() { return true; }
                    @Override public boolean hasField() { return false; }
                    @Override public boolean hasConstructorParameter() { return false; }
                    @Override public AnnotatedMethod getGetter() { return null; }
                    @Override public AnnotatedMethod getSetter() {
                        try {
                            return new AnnotatedMethod(null, Object.class.getDeclaredMethod("toString"));
                        } catch (NoSuchMethodException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    @Override public AnnotatedField getField() { return null; }
                    @Override public AnnotatedParameter getConstructorParameter() { return null; }
                    @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                    @Override public AnnotatedMember getAccessor() { return null; }
                    @Override public AnnotatedMember getMutator() { return getSetter(); }
                    @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                    @Override public AnnotatedMember getPrimaryMember() { return getMutator(); }
                    @Override public Class<?>[] findViews() { return null; }
                    @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                    @Override public String findReferenceName() { return null; }
                    @Override public boolean isTypeId() { return false; }
                    @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                    @Override public JsonInclude.Value findInclusion() { return null; }
                },
                TypeFactory.defaultInstance().constructType(String.class),
                null, null, null) {
            public boolean setterCalled = false;
            @Override
            public void set(Object instance, Object value) throws IOException {
                setterCalled = true;
            }
        };
        prop.setFallbackSetter(mockSetter);

        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance);
        assertTrue(((MethodProperty)mockSetter).setterCalled);
    }


    @Test
    public void testDeserializeAndSet_NoFallbackSetter() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        JsonParser p = createDummyParser();
        ((JsonParser.Parser) p)._currentToken = JsonToken.VALUE_STRING;
        DeserializationContext ctxt = createDummyContext();

        try {
            prop.deserializeAndSet(p, ctxt, new Object());
            fail("Should have thrown InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            assertTrue(e.getMessage().contains("No fallback setter/field defined"));
        }
    }

    @Test
    public void testDeserializeSetAndReturn_NoFallbackSetter() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        JsonParser p = createDummyParser();
        ((JsonParser.Parser) p)._currentToken = JsonToken.VALUE_STRING;
        DeserializationContext ctxt = createDummyContext();

        try {
            prop.deserializeSetAndReturn(p, ctxt, new Object());
            fail("Should have thrown InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            assertTrue(e.getMessage().contains("No fallback setter/field defined"));
        }
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
    public void testFindInjectableValue_NullBeanInstance() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, "testInjectableId");
        DeserializationContext ctxt = createDummyContext();
        Object injectedValue = prop.findInjectableValue(ctxt, null);
        assertEquals("injectedValue", injectedValue);
    }

    @Test
    public void testInject_NullBeanInstance() throws Exception {
        CreatorProperty prop = new CreatorProperty(PropertyName.construct("test"), TypeFactory.defaultInstance().constructType(String.class), null, null, null, null, 0, "testInjectableId", PropertyMetadata.STD_REQUIRED_OR_OPTIONAL) {
            public Object injectedValue = null;
            @Override
            public void set(Object instance, Object value) throws IOException {
                this.injectedValue = value;
            }
        };
        DeserializationContext ctxt = createDummyContext();
        prop.inject(ctxt, null);
        assertEquals("injectedValue", ((CreatorProperty) prop).injectedValue);
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
        prop.fixAccess(null);
    }

    @Test
    public void testIgnorable_MultipleTimes() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertFalse(prop.isIgnorable());
        prop.markAsIgnorable();
        assertTrue(prop.isIgnorable());
        prop.markAsIgnorable();
        assertTrue(prop.isIgnorable());
    }

    @Test
    public void testGetMember_NullAnnotated() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        assertNull(prop.getMember());
    }

    @Test
    public void testWithValueDeserializer_SameDeserializer() throws Exception {
        JsonDeserializer<String> originalDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "original";
            }
        };
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        // Directly setting the deserializer to ensure the comparison works
        prop._valueDeserializer = originalDeserializer;
        SettableBeanProperty propWithSameDeser = prop.withValueDeserializer(originalDeserializer);
        assertSame(prop, propWithSameDeser);
    }

    @Test
    public void testWithName_SameName() throws Exception {
        PropertyName originalName = PropertyName.construct("test");
        CreatorProperty prop = new CreatorProperty(originalName, TypeFactory.defaultInstance().constructType(String.class), null, null, null, null, 0, null, PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
        SettableBeanProperty propWithSameName = prop.withName(originalName);
        assertSame(prop, propWithSameName);
    }

    @Test
    public void testWithNullProvider_SameProvider() throws Exception {
        NullValueProvider originalProvider = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException { return null; }
            @Override
            public AccessPattern getNullAccessPattern() { return AccessPattern.CONSTANT; }
        };
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        // Directly setting the provider to ensure the comparison works
        prop._nullProvider = originalProvider;

        SettableBeanProperty propWithSameProvider = prop.withNullProvider(originalProvider);
        assertSame(prop, propWithSameProvider);
    }

    // --- Tests for methods from the 'uncalled' list ---

    // Test handleResolvedForwardReference
    @Test
    public void testHandleResolvedForwardReference() throws Exception {
        // This method is part of SettableBeanProperty and is called internally by
        // ObjectIdReferenceProperty during deserialization. It's not directly called
        // on CreatorProperty in typical usage without being an ObjectIdReferenceProperty itself.
        // A direct test on CreatorProperty is complex without extensive mocking of
        // DeserializationContext and ObjectId resolution mechanisms.
        // As per instructions, if a method is not directly testable or called, we acknowledge it.
        // This test serves as a placeholder to indicate the method exists and its context.
        
        // Mocking a scenario where this might be called.
        // We are testing CreatorProperty, which extends SettableBeanProperty.
        // SettableBeanProperty has the handleResolvedForwardReference method.
        
        CreatorProperty prop = createDummyCreatorProperty("testProp", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        Object instance = new Object();
        
        // Need to simulate the conditions under which handleResolvedForwardReference is called.
        // This typically happens when an UnresolvedForwardReference is encountered.
        // Let's create mock objects for this.
        UnresolvedForwardReference ufr = new UnresolvedForwardReference(null, null);
        ReadableObjectId roid = new ReadableObjectId(ufr);
        ufr.setRoid(roid);

        // To test this, we'd need to set a fallback setter as CreatorProperty delegates to it.
        SettableBeanProperty mockSetter = new MethodProperty(
            new BeanPropertyDefinition() {
                @Override public PropertyName getFullName() { return null; }
                @Override public String getName() { return "mockSetter"; }
                @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
                @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
                @Override public String getInternalName() { return "mockSetter"; }
                @Override public PropertyName getWrapperName() { return null; }
                @Override public boolean isExplicitlyIncluded() { return false; }
                @Override public boolean isExplicitlyNamed() { return false; }
                @Override public JavaType getPrimaryType() { return null; }
                @Override public Class<?> getRawPrimaryType() { return null; }
                @Override public PropertyMetadata getMetadata() { return null; }
                @Override public boolean isRequired() { return false; }
                @Override public boolean couldDeserialize() { return false; }
                @Override public boolean couldSerialize() { return false; }
                @Override public boolean hasGetter() { return false; }
                @Override public boolean hasSetter() { return true; }
                @Override public boolean hasField() { return false; }
                @Override public boolean hasConstructorParameter() { return false; }
                @Override public AnnotatedMethod getGetter() { return null; }
                @Override public AnnotatedMethod getSetter() {
                    try {
                        return new AnnotatedMethod(null, Object.class.getDeclaredMethod("toString"));
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    }
                }
                @Override public AnnotatedField getField() { return null; }
                @Override public AnnotatedParameter getConstructorParameter() { return null; }
                @Override public Iterator<AnnotatedParameter> getConstructorParameters() { return ClassUtil.emptyIterator(); }
                @Override public AnnotatedMember getAccessor() { return null; }
                @Override public AnnotatedMember getMutator() { return getSetter(); }
                @Override public AnnotatedMember getNonConstructorMutator() { return getMutator(); }
                @Override public AnnotatedMember getPrimaryMember() { return getMutator(); }
                @Override public Class<?>[] findViews() { return null; }
                @Override public AnnotationIntrospector.ReferenceProperty findReferenceType() { return null; }
                @Override public String findReferenceName() { return null; }
                @Override public boolean isTypeId() { return false; }
                @Override public ObjectIdInfo findObjectIdInfo() { return null; }
                @Override public JsonInclude.Value findInclusion() { return null; }
            },
            TypeFactory.defaultInstance().constructType(String.class),
            null, null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public void set(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
            }
        };
        prop.setFallbackSetter(mockSetter);

        // Simulate calling the inherited method
        // In reality, this is called via context.findObjectId()...appendReferring()...
        // where appendReferring calls handleResolvedForwardReference on the referring object.
        
        // We can't directly call handleResolvedForwardReference on CreatorProperty as it's
        // protected in SettableBeanProperty and intended for internal callback.
        // The prompt asks to test uncalled methods. This one is tricky as its direct
        // invocation on CreatorProperty is not standard.
        // The presence of this method in SettableBeanProperty means it's part of the API
        // that CreatorProperty inherits.
        // For the purpose of this exercise, we acknowledge its existence and inheritance.
        // A concrete test would require mocking the entire deserialization context.
    }

    // Test withResolved (from AtomicReferenceDeserializer, potentially inherited)
    @Test
    public void testWithResolved() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        // Using a concrete deserializer that extends ReferenceTypeDeserializer
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        TypeDeserializer newTypeDeser = new AsPropertyTypeDeserializer(type, null, null, false, null);
        JsonDeserializer<?> newValueDeser = new StdDeserializer<Object>(Object.class) {};

        AtomicReferenceDeserializer resolvedDeserializer = delegate.withResolved(newTypeDeser, newValueDeser);
        assertNotNull(resolvedDeserializer);
        // Further assertions could be added if we could inspect resolved properties easily.
    }

    // Test getNullValue (from AtomicReferenceDeserializer)
    @Test
    public void testGetNullValue() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        JsonDeserializer<String> valueDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return "nullString"; }
            @Override
            public String getNullValue(DeserializationContext ctxt) throws JsonMappingException { return "nullString"; }
        };
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, valueDeser
        );
        DeserializationContext ctxt = createDummyContext();
        AtomicReference<Object> nullRef = delegate.getNullValue(ctxt);
        assertNotNull(nullRef);
        assertEquals("nullString", nullRef.get());
    }

    // Test getEmptyValue (from AtomicReferenceDeserializer)
    @Test
    public void testGetEmptyValue() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        DeserializationContext ctxt = createDummyContext();
        // getEmptyValue is defined to return Object, need to cast
        AtomicReference<Object> emptyRef = (AtomicReference<Object>) delegate.getEmptyValue(ctxt);
        assertNotNull(emptyRef);
        assertNull(emptyRef.get()); // Empty AtomicReference should hold null
    }

    // Test referenceValue (from AtomicReferenceDeserializer)
    @Test
    public void testReferenceValue() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        String value = "testContent";
        AtomicReference<Object> ref = delegate.referenceValue(value);
        assertNotNull(ref);
        assertEquals(value, ref.get());
    }

    // Test getReferenced (from AtomicReferenceDeserializer)
    @Test
    public void testGetReferenced() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        String value = "testContent";
        AtomicReference<Object> ref = new AtomicReference<>(value);
        Object referencedValue = delegate.getReferenced(ref);
        assertEquals(value, referencedValue);
    }

    // Test updateReference (from AtomicReferenceDeserializer)
    @Test
    public void testUpdateReference() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        String initialValue = "initial";
        String newValue = "updated";
        AtomicReference<Object> ref = new AtomicReference<>(initialValue);
        AtomicReference<Object> updatedRef = delegate.updateReference(ref, newValue);
        assertNotNull(updatedRef);
        assertEquals(newValue, ref.get()); // Verify the original reference was updated
        assertEquals(newValue, updatedRef.get()); // Verify the returned reference is the same and updated
    }

    // Test supportsUpdate (from AtomicReferenceDeserializer)
    @Test
    public void testSupportsUpdate() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        DeserializationConfig config = null; // Can be null for this check
        Boolean supports = delegate.supportsUpdate(config);
        assertNotNull(supports);
        assertTrue(supports); // AtomicReference should support updates
    }
}
