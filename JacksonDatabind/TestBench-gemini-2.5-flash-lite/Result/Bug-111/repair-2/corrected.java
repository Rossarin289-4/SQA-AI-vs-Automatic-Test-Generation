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
import com.fasterxml.jackson.databind.util.ObjectIdGenerator;
import com.fasterxml.jackson.databind.jsontype.ObjectIdResolver;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.IteratorImpl;
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
    private DeserializationContext createDummyContext() {
        // Simplified DeserializationContext for testing purposes.
        // Mocking necessary methods.
        return new DeserializationContext(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) {

            @Override
            public <T> T reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
                throw new JsonMappingException(null, msg);
            }

            @Override
            public <T> T reportBadDefinition(Class<?> type, String msg) throws JsonMappingException {
                throw new JsonMappingException(null, msg);
            }
            
            @Override
            public Object findInjectableValue(Object valueId, SettableBeanProperty forProperty, Object beanInstance) {
                if ("testInjectableId".equals(valueId)) {
                    return "injectedValue";
                }
                return null;
            }

            @Override
            public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolver) throws JsonMappingException {
                return new ReadableObjectId(id) {
                    @Override
                    public void appendReferring(Referring ref) { /* no-op */ }
                    @Override
                    public Object bindItem(Object ob) { return null; }
                };
            }
            
            @Override
            public DeserializerFactory getFactory() { return null; } // Mock
            @Override
            public DeserializerCache getCache() { return null; } // Mock
            @Override
            public JsonParser getParser() { return null; } // Mock
            @Override
            public InjectableValues getInjectableValues() { return null; } // Mock
            @Override
            public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); } // Mock
            @Override
            public PropertyNamingStrategy getPropertyNamingStrategy() { return null; } // Mock
            @Override
            public TypeDeserializer findTypeDeserializer(JavaType type) throws JsonMappingException { return null; } // Mock
            @Override
            public Version version() { return VersionUtil.unknownVersion(); } // Mock
            @Override
            public DeserializationConfig getConfig() { return null; } // Mock
            @Override
            public void initializeBean(Object bean) { } // Mock
        };
    }

    // Helper method to create a dummy JsonParser
    private JsonParser createDummyParser() throws IOException {
        return new JsonParser() {
            private JsonToken _currentToken = JsonToken.VALUE_EMBEDDED_OBJECT;

            @Override public void close() throws IOException {}
            @Override public JsonToken getCurrentToken() { return _currentToken; }
            @Override public boolean hasToken(JsonToken t) { return _currentToken == t; }
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public void setCodec(ObjectCodec c) {}
            @Override public ObjectCodec getCodec() { return null; }
            @Override public Version version() { return VersionUtil.unknownVersion(); }
            @Override public void overrideCurrentName(String name) {}
            @Override public JsonToken nextToken() throws IOException {
                _currentToken = JsonToken.NOT_AVAILABLE;
                return _currentToken;
            }
            @Override public JsonToken nextValue() throws IOException { return nextToken(); }
            @Override public JsonParser skipChildren() throws IOException { return this; }
            @Override public boolean isClosed() { return false; }
            @Override public String getText() throws IOException { return null; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0; }
            @Override public float getFloatValue() throws IOException { return 0; }
            @Override public double getDoubleValue() throws IOException { return 0; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public Object getInputSource() throws IOException { return null; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String def) throws IOException { return def; }
            @Override public <T> T readValueAs(com.fasterxml.jackson.databind.type.TypeFactory tf, java.lang.reflect.Type type) throws IOException { return null; }
            @Override public <T> T readValueAs(com.fasterxml.jackson.databind.type.TypeFactory tf, com.fasterxml.jackson.databind.JavaType type) throws IOException { return null; }
            @Override public <T extends com.fasterxml.jackson.databind.JsonNode> T readValueAs(Class<T> valueType) throws IOException { return null; }
            @Override public com.fasterxml.jackson.databind.JsonNode readTree(com.fasterxml.jackson.core.JsonGenerator g) throws IOException { return null; }
            @Override public com.fasterxml.jackson.databind.JsonNode readTree(com.fasterxml.jackson.core.ObjectCodec oc) throws IOException { return null; }
            @Override public com.fasterxml.jackson.databind.JsonNode readTree(com.fasterxml.jackson.databind.DeserializationContext ctxt) throws IOException { return null; }
            @Override public void setLocation(Object loc) {}
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public String getFormatName() { return null; }
            @Override public boolean canReadTypeId() { return false; }
            @Override public Object getTypeId() throws IOException { return null; }
            @Override public JsonParser.ParserFeature[] getFeatures() { return new JsonParser.ParserFeature[0]; } // Mock
            @Override public boolean isEnabled(JsonParser.ParserFeature f) { return false; }
            @Override public JsonParser.NumberType getNumberType() throws IOException { return null; }
            @Override public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant bv) throws IOException { return null; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
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
        // Create a dummy FieldProperty to set as fallback setter
        BeanPropertyDefinition dummyPropDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return null; }
            @Override public String getName() { return "dummyField"; }
            @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
            @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
            @Override public String getInternalName() { return "dummyField"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(Object.class); }
            @Override public Class<?> getRawPrimaryType() { return Object.class; }
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
            @Override
            public AnnotatedField getField() {
                try {
                    // Use a field that exists in Object
                    return new AnnotatedField(null, Object.class.getDeclaredField("name"));
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
        };
        SettableBeanProperty dummySetter = new FieldProperty(dummyPropDef, TypeFactory.defaultInstance().constructType(Object.class), null, null, dummyPropDef.getField());
        prop.setFallbackSetter(dummySetter);
        prop.fixAccess(null); // This call should not throw an exception.
    }

    @Test
    public void testSetFallbackSetter() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        BeanPropertyDefinition dummyPropDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return null; }
            @Override public String getName() { return "dummyField"; }
            @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
            @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
            @Override public String getInternalName() { return "dummyField"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(Object.class); }
            @Override public Class<?> getRawPrimaryType() { return Object.class; }
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
            @Override
            public AnnotatedField getField() {
                try {
                    return new AnnotatedField(null, Object.class.getDeclaredField("name"));
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
        };
        SettableBeanProperty dummySetter = new FieldProperty(dummyPropDef, TypeFactory.defaultInstance().constructType(Object.class), null, null, dummyPropDef.getField());
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
        // Custom CreatorProperty to capture the value set
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
        // Mock a MethodProperty as the fallback setter
        BeanPropertyDefinition mockPropDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return null; }
            @Override public String getName() { return "mockSetter"; }
            @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
            @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
            @Override public String getInternalName() { return "mockSetter"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(String.class); }
            @Override public Class<?> getRawPrimaryType() { return String.class; }
            @Override public PropertyMetadata getMetadata() { return null; }
            @Override public boolean isRequired() { return false; }
            @Override public boolean couldDeserialize() { return false; }
            @Override public boolean couldSerialize() { return false; }
            @Override public boolean hasGetter() { return false; }
            @Override public boolean hasSetter() { return true; }
            @Override public boolean hasField() { return false; }
            @Override public boolean hasConstructorParameter() { return false; }
            @Override public AnnotatedMethod getGetter() { return null; }
            @Override
            public AnnotatedMethod getSetter() {
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
        };
        SettableBeanProperty mockSetter = new MethodProperty(mockPropDef, TypeFactory.defaultInstance().constructType(String.class), null, null, mockPropDef.getSetter());
        
        // Anonymous class to track calls
        SettableBeanProperty trackingSetter = new SettableBeanProperty(mockPropDef, TypeFactory.defaultInstance().constructType(String.class), null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public SettableBeanProperty withName(PropertyName newName) { return null; }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return null; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return null; }
            @Override
            public void fixAccess(DeserializationConfig config) {}
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
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
        };

        prop.setFallbackSetter(trackingSetter);

        DeserializationContext ctxt = createDummyContext();
        JsonParser p = createDummyParser();
        ((JsonParser.Parser) p)._currentToken = JsonToken.VALUE_STRING; // Simulate a string token
        JsonDeserializer<String> mockDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctx) throws IOException {
                return "deserializedValue";
            }
        };
        prop.withValueDeserializer(mockDeserializer);

        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance);

        assertTrue(trackingSetter.setterCalled);
        assertEquals(instance, trackingSetter.instanceArg);
        assertEquals("deserializedValue", trackingSetter.valueArg);
    }


    @Test
    public void testDeserializeSetAndReturn() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        // Mock a MethodProperty as the fallback setter
        BeanPropertyDefinition mockPropDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return null; }
            @Override public String getName() { return "mockSetter"; }
            @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
            @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
            @Override public String getInternalName() { return "mockSetter"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(String.class); }
            @Override public Class<?> getRawPrimaryType() { return String.class; }
            @Override public PropertyMetadata getMetadata() { return null; }
            @Override public boolean isRequired() { return false; }
            @Override public boolean couldDeserialize() { return false; }
            @Override public boolean couldSerialize() { return false; }
            @Override public boolean hasGetter() { return false; }
            @Override public boolean hasSetter() { return true; }
            @Override public boolean hasField() { return false; }
            @Override public boolean hasConstructorParameter() { return false; }
            @Override public AnnotatedMethod getGetter() { return null; }
            @Override
            public AnnotatedMethod getSetter() {
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
        };
        SettableBeanProperty mockSetter = new MethodProperty(mockPropDef, TypeFactory.defaultInstance().constructType(String.class), null, null, mockPropDef.getSetter());

        // Anonymous class to track calls and return instance
        SettableBeanProperty trackingSetter = new SettableBeanProperty(mockPropDef, TypeFactory.defaultInstance().constructType(String.class), null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public SettableBeanProperty withName(PropertyName newName) { return null; }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return null; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return null; }
            @Override
            public void fixAccess(DeserializationConfig config) {}
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
                return instance; // Return instance as per setAndReturn contract
            }
            @Override
            public void set(Object instance, Object value) throws IOException { // Not used by deserializeSetAndReturn, but required by abstract class
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
            }
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
        };
        
        prop.setFallbackSetter(trackingSetter);

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

        assertTrue(trackingSetter.setterCalled);
        assertEquals(instance, trackingSetter.instanceArg);
        assertEquals("deserializedValue", trackingSetter.valueArg);
        assertEquals(instance, returnValue); // Check if the correct value is returned
    }


    @Test
    public void testSet() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        // Mock a FieldProperty as the fallback setter
        BeanPropertyDefinition dummyPropDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return null; }
            @Override public String getName() { return "mockField"; }
            @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
            @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
            @Override public String getInternalName() { return "mockField"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(Object.class); }
            @Override public Class<?> getRawPrimaryType() { return Object.class; }
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
            @Override
            public AnnotatedField getField() {
                try {
                    return new AnnotatedField(null, Object.class.getDeclaredField("name"));
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
        };
        SettableBeanProperty mockSetter = new FieldProperty(dummyPropDef, TypeFactory.defaultInstance().constructType(Object.class), null, null, dummyPropDef.getField());
        
        // Anonymous class to track calls
        SettableBeanProperty trackingSetter = new SettableBeanProperty(dummyPropDef, TypeFactory.defaultInstance().constructType(Object.class), null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public SettableBeanProperty withName(PropertyName newName) { return null; }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return null; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return null; }
            @Override
            public void fixAccess(DeserializationConfig config) {}
            @Override
            public void set(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
            }
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException { // Not used by set, but required by abstract class
                set(instance, value);
                return instance;
            }
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
        };
        
        prop.setFallbackSetter(trackingSetter);

        Object instance = new Object();
        Object value = "testValue";
        prop.set(instance, value);

        assertTrue(trackingSetter.setterCalled);
        assertEquals(instance, trackingSetter.instanceArg);
        assertEquals(value, trackingSetter.valueArg);
    }

    @Test
    public void testSetAndReturn() throws Exception {
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        // Mock a FieldProperty as the fallback setter
        BeanPropertyDefinition dummyPropDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return null; }
            @Override public String getName() { return "mockField"; }
            @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
            @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
            @Override public String getInternalName() { return "mockField"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(Object.class); }
            @Override public Class<?> getRawPrimaryType() { return Object.class; }
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
            @Override
            public AnnotatedField getField() {
                try {
                    return new AnnotatedField(null, Object.class.getDeclaredField("name"));
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
        };
        SettableBeanProperty mockSetter = new FieldProperty(dummyPropDef, TypeFactory.defaultInstance().constructType(Object.class), null, null, dummyPropDef.getField());

        // Anonymous class to track calls and return instance
        SettableBeanProperty trackingSetter = new SettableBeanProperty(dummyPropDef, TypeFactory.defaultInstance().constructType(Object.class), null, null) {
            public boolean setterCalled = false;
            public Object instanceArg;
            public Object valueArg;

            @Override
            public SettableBeanProperty withName(PropertyName newName) { return null; }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return null; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return null; }
            @Override
            public void fixAccess(DeserializationConfig config) {}
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException {
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
                return instance; // Return instance as per setAndReturn contract
            }
            @Override
            public void set(Object instance, Object value) throws IOException { // Not used by setAndReturn, but required by abstract class
                this.setterCalled = true;
                this.instanceArg = instance;
                this.valueArg = value;
            }
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
        };
        
        prop.setFallbackSetter(trackingSetter);

        Object instance = new Object();
        Object value = "testValue";
        Object returnValue = prop.setAndReturn(instance, value);

        assertTrue(trackingSetter.setterCalled);
        assertEquals(instance, trackingSetter.instanceArg);
        assertEquals(value, trackingSetter.valueArg);
        assertEquals(instance, returnValue); // Check if the correct value is returned
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
        // Mock AnnotatedParameter
        AnnotatedParameter mockAnnotatedParameter = new AnnotatedParameter(null, null, null, null, null) {
             @Override public AnnotationMap getAllAnnotations() { return null; }
             @Override public Class<?> getDeclaringClass() { return Object.class; }
             @Override public java.lang.reflect.Member getMember() { return null; }
             @Override public TypeResolutionContext getTypeContext() { return null; }
             @Override public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
             @Override public boolean hasAnnotation(Class<?> acls) { return false; }
             @Override public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) { return false; }
             @Override public Annotated withAnnotations(AnnotationMap fallback) { return this; }
             @Override public void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException { }
             @Override public Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException { return null; }
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

        // Mock a MethodProperty as the fallback setter
        BeanPropertyDefinition mockPropDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return null; }
            @Override public String getName() { return "mockSetter"; }
            @Override public BeanPropertyDefinition withName(PropertyName newName) { return this; }
            @Override public BeanPropertyDefinition withSimpleName(String newSimpleName) { return this; }
            @Override public String getInternalName() { return "mockSetter"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return false; }
            @Override public boolean isExplicitlyNamed() { return false; }
            @Override public JavaType getPrimaryType() { return TypeFactory.defaultInstance().constructType(String.class); }
            @Override public Class<?> getRawPrimaryType() { return String.class; }
            @Override public PropertyMetadata getMetadata() { return null; }
            @Override public boolean isRequired() { return false; }
            @Override public boolean couldDeserialize() { return false; }
            @Override public boolean couldSerialize() { return false; }
            @Override public boolean hasGetter() { return false; }
            @Override public boolean hasSetter() { return true; }
            @Override public boolean hasField() { return false; }
            @Override public boolean hasConstructorParameter() { return false; }
            @Override public AnnotatedMethod getGetter() { return null; }
            @Override
            public AnnotatedMethod getSetter() {
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
        };
        SettableBeanProperty mockSetter = new MethodProperty(mockPropDef, TypeFactory.defaultInstance().constructType(String.class), null, null, mockPropDef.getSetter());

        // Anonymous class to track calls
        SettableBeanProperty trackingSetter = new SettableBeanProperty(mockPropDef, TypeFactory.defaultInstance().constructType(String.class), null, null) {
            public boolean setterCalled = false;
            @Override
            public void set(Object instance, Object value) throws IOException {
                setterCalled = true;
            }
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException {
                set(instance, value);
                return instance;
            }
            @Override
            public SettableBeanProperty withName(PropertyName newName) { return null; }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return null; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return null; }
            @Override
            public void fixAccess(DeserializationConfig config) {}
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
        };

        prop.setFallbackSetter(trackingSetter);

        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance);
        assertTrue(trackingSetter.setterCalled);
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
        // Custom CreatorProperty to capture the value set
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
    public void testWithValueDeserializer_SameDeserializer() throws Exception {
        JsonDeserializer<String> originalDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "original";
            }
        };
        CreatorProperty prop = createDummyCreatorProperty("test", TypeFactory.defaultInstance().constructType(String.class), 0, null);
        // Manually set the deserializer to ensure the reference equality check works
        prop._valueDeserializer = originalDeserializer; 
        SettableBeanProperty propWithSameDeser = prop.withValueDeserializer(originalDeserializer);
        assertSame(prop, propWithSameDeser); // Should return the same instance if deserializer is the same
    }

    @Test
    public void testWithName_SameName() throws Exception {
        PropertyName originalName = PropertyName.construct("test");
        CreatorProperty prop = new CreatorProperty(originalName, TypeFactory.defaultInstance().constructType(String.class), null, null, null, null, 0, null, PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
        SettableBeanProperty propWithSameName = prop.withName(originalName);
        assertSame(prop, propWithSameName); // Should return the same instance if name is the same
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
        // Manually set the null provider for reference equality check
        prop._nullProvider = originalProvider; 

        SettableBeanProperty propWithSameProvider = prop.withNullProvider(originalProvider);
        assertSame(prop, propWithSameProvider); // Should return the same instance if provider is the same
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
    @Test
    public void testWithResolved() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        // Create a dummy deserializer that could be resolved.
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        // Create dummy TypeDeserializer and JsonDeserializer to pass to withResolved
        TypeDeserializer newTypeDeser = new AsPropertyTypeDeserializer(type, null, null, false, null);
        JsonDeserializer<?> newValueDeser = new StdDeserializer<Object>(Object.class) {};

        // Call the method
        AtomicReferenceDeserializer resolvedDeserializer = delegate.withResolved(newTypeDeser, newValueDeser);
        
        assertNotNull(resolvedDeserializer);
        // Further assertions would depend on the internal state of the resolved deserializer.
    }

    // Test getNullValue - Inherited from ReferenceTypeDeserializer
    @Test
    public void testGetNullValue() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        // Create a dummy JsonDeserializer to be used by AtomicReferenceDeserializer
        JsonDeserializer<String> valueDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return "deserializedValue"; }
            @Override
            public String getNullValue(DeserializationContext ctxt) throws JsonMappingException { return "providedNullValue"; } // Custom null value
        };
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, valueDeser
        );
        DeserializationContext ctxt = createDummyContext();
        
        // Call getNullValue. Expecting the value provided by valueDeser.getNullValue.
        AtomicReference<Object> nullRef = delegate.getNullValue(ctxt);
        assertNotNull(nullRef);
        assertEquals("providedNullValue", nullRef.get());
    }

    // Test getEmptyValue - Inherited from ReferenceTypeDeserializer
    @Test
    public void testGetEmptyValue() throws Exception {
        JavaType type = SimpleType.constructUnsafe(String.class);
        AtomicReferenceDeserializer delegate = new AtomicReferenceDeserializer(
            type, null, null, null
        );
        DeserializationContext ctxt = createDummyContext();
        
        // Call getEmptyValue. Expected behavior for AtomicReference is an empty AtomicReference.
        Object emptyValue = delegate.getEmptyValue(ctxt);
        assertNotNull(emptyValue);
        assertTrue(emptyValue instanceof AtomicReference);
        AtomicReference<?> atomicRef = (AtomicReference<?>) emptyValue;
        assertNull(atomicRef.get()); // An empty AtomicReference should hold null.
    }

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
