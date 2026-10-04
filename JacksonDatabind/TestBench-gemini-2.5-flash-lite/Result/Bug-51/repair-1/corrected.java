package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class TypeDeserializerBaseTest {

    // Dummy implementations for abstract methods and dependencies
    private static class DummyTypeIdResolver implements TypeIdResolver {
        @Override
        public void init(JavaType baseType) {}
        @Override
        public String idFromValue(Object value) { return "dummy"; }
        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) { return "dummy"; }
        @Override
        public String idFromBaseType() { return "dummy"; }
        @Override
        public JavaType typeFromId(DatabindContext context, String id) throws IOException {
            return TypeFactory.defaultInstance().constructType(Object.class);
        }
        @Override
        public String getDescForKnownTypeIds() { return "dummy desc"; }
        @Override
        public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CUSTOM; }
    }

    private static class DummyBeanProperty implements BeanProperty {
        private final JavaType _type;
        private final String _name;

        public DummyBeanProperty(String name, JavaType type) {
            _name = name;
            _type = type;
        }

        @Override
        public String getName() { return _name; }
        @Override
        public JavaType getType() { return _type; }
        @Override
        public PropertyName getFullName() { return PropertyName.construct(_name); }
        @Override
        public PropertyName getWrapperName() { return null; }
        @Override
        public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
        @Override
        public boolean isRequired() { return false; }
        @Override
        public boolean isVirtual() { return false; }
        @Override
        public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override
        public <A extends java.lang.annotation.Annotation> A getContextAnnotation(Class<A> acls) { return null; }
        @Override
        public AnnotatedMember getMember() { return null; }
        @Override
        public JsonFormat.Value findFormatOverrides(AnnotationIntrospector intr) { return null; }
        @Override
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> config, Class<?> baseType) { return null; }
        @Override
        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> config, Class<?> baseType) { return null; }
        @Override
        public void depositSchemaProperty(JsonObjectFormatVisitor visitor, com.fasterxml.jackson.databind.SerializerProvider provider) throws JsonMappingException {}
        @Override
        public String toString() { return "DummyBeanProperty(" + _name + ")"; }
    }

    // Mock DeserializationContext to control behavior of findContextualValueDeserializer
    private static class MockDeserializationContext extends DefaultDeserializationContext {
        private final JsonDeserializer<Object> mockDeserializer;
        private final JavaType mockJavaType;
        private final boolean failOnInvalidSubtype;

        protected MockDeserializationContext(DeserializerFactory factory, DeserializerCache cache, JsonDeserializer<Object> mockDeserializer, JavaType mockJavaType, boolean failOnInvalidSubtype) {
            super(factory, cache);
            this._featureFlags = DeserializationFeature.collectFeatureDefaults();
            this.mockDeserializer = mockDeserializer;
            this.mockJavaType = mockJavaType;
            this.failOnInvalidSubtype = failOnInvalidSubtype;
        }

        @Override
        public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
            if (type.equals(mockJavaType)) {
                return mockDeserializer;
            }
            // Fallback for other types if needed
            // Need to call super to avoid infinite recursion if the type is not the mockJavaType
            return super.findContextualValueDeserializer(type, property);
        }

        @Override
        public JavaType getTypeFactory() {
            return TypeFactory.defaultInstance();
        }

        @Override
        public boolean isEnabled(DeserializationFeature feature) {
            if (feature == DeserializationFeature.FAIL_ON_INVALID_SUBTYPE) {
                return failOnInvalidSubtype;
            }
            return super.isEnabled(feature);
        }

        @Override
        public void reportMappingException(String message) throws JsonMappingException {
            throw new JsonMappingException(null, message);
        }

        @Override
        public JavaType handleUnknownTypeId(JavaType baseType, String typeId, TypeIdResolver idResolver, String extraDesc) throws IOException {
            // For testing purposes, let's return a known type or null
            return TypeFactory.defaultInstance().constructType(Object.class);
        }

        @Override
        public DeserializerFactory getFactory() {
            // Ensure a factory is available to avoid NPE in super methods
            return super.getFactory() != null ? super.getFactory() : new com.fasterxml.jackson.databind.deser.BasicDeserializerFactory(new DeserializerFactoryConfig());
        }
    }

    private TypeDeserializerBase createInstance(JavaType baseType, TypeIdResolver idRes, String typePropName, boolean typeIdVisible, JavaType defaultImpl) {
        // Using AsArrayTypeDeserializer as a concrete implementation for testing TypeDeserializerBase
        return new AsArrayTypeDeserializer(baseType, idRes, typePropName, typeIdVisible, defaultImpl);
    }

    private TypeDeserializerBase createInstance(TypeDeserializerBase src, BeanProperty prop) {
        // Using AsArrayTypeDeserializer as a concrete implementation for testing TypeDeserializerBase
        return new AsArrayTypeDeserializer(src, prop);
    }

    @Test
    public void testConstructorAndAccessors() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        String typePropName = "type";
        boolean typeIdVisible = true;
        JavaType defaultImpl = TypeFactory.defaultInstance().constructType(Object.class);

        TypeDeserializerBase instance = createInstance(baseType, idResolver, typePropName, typeIdVisible, defaultImpl);

        assertNotNull(instance);
        assertEquals(baseType, instance._baseType);
        assertEquals(idResolver, instance._idResolver);
        assertEquals(typePropName, instance._typePropertyName);
        assertEquals(typeIdVisible, instance._typeIdVisible);
        assertEquals(defaultImpl, instance._defaultImpl);
        assertNull(instance._property);
        assertNotNull(instance._deserializers);
        assertTrue(instance._deserializers instanceof ConcurrentHashMap);
    }

    @Test
    public void testConstructorWithNullPropName() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        String typePropName = null;
        boolean typeIdVisible = false;
        JavaType defaultImpl = null;

        TypeDeserializerBase instance = createInstance(baseType, idResolver, typePropName, typeIdVisible, defaultImpl);

        assertNotNull(instance);
        assertEquals("", instance._typePropertyName); // Should be empty string if null
    }

    @Test
    public void testCopyConstructorAndAccessors() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        String typePropName = "type";
        boolean typeIdVisible = false;
        JavaType defaultImpl = TypeFactory.defaultInstance().constructType(Number.class);

        TypeDeserializerBase srcInstance = createInstance(baseType, idResolver, typePropName, typeIdVisible, defaultImpl);

        BeanProperty property = new DummyBeanProperty("myProp", baseType);
        TypeDeserializerBase instance = createInstance(srcInstance, property);

        assertNotNull(instance);
        assertEquals(baseType, instance._baseType);
        assertEquals(idResolver, instance._idResolver);
        assertEquals(typePropName, instance._typePropertyName);
        assertEquals(typeIdVisible, instance._typeIdVisible);
        assertEquals(defaultImpl, instance._defaultImpl);
        assertEquals(property, instance._property);
        // _deserializers map should be shared
        assertSame(srcInstance._deserializers, instance._deserializers);
    }

    @Test
    public void testBaseTypeName() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);
        assertEquals(String.class.getName(), instance.baseTypeName());
    }

    @Test
    public void testGetPropertyName() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        String typePropName = "customType";
        TypeDeserializerBase instance = createInstance(baseType, idResolver, typePropName, false, null);
        assertEquals(typePropName, instance.getPropertyName());

        // Test with null prop name during construction
        instance = createInstance(baseType, idResolver, null, false, null);
        assertEquals("", instance.getPropertyName());
    }

    @Test
    public void testGetTypeIdResolver() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);
        assertEquals(idResolver, instance.getTypeIdResolver());
    }

    @Test
    public void testGetDefaultImpl() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        JavaType defaultImpl = TypeFactory.defaultInstance().constructType(Object.class);
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, defaultImpl);
        assertEquals(Object.class, instance.getDefaultImpl());

        // Test with null defaultImpl
        instance = createInstance(baseType, idResolver, "type", false, null);
        assertNull(instance.getDefaultImpl());
    }

    @Test
    public void testToString() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);
        String toString = instance.toString();
        assertTrue(toString.contains(AsArrayTypeDeserializer.class.getName()));
        assertTrue(toString.contains("base-type:" + baseType.toString()));
        assertTrue(toString.contains("id-resolver: " + idResolver.toString()));
    }

    // --- Tests for _findDeserializer ---

    @Test
    public void testFindDeserializer_existing() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);

        // Manually put a deserializer into the map
        JsonDeserializer<Object> mockDeser = new MockDeserializerForObject();
        instance._deserializers.put("existingType", mockDeser);

        DeserializationContext ctxt = new MockDeserializationContext(null, null, null, null, true); // Mock context

        JsonDeserializer<Object> foundDeser = instance._findDeserializer(ctxt, "existingType");
        assertSame(mockDeser, foundDeser);
    }

    @Test
    public void testFindDeserializer_resolveType() throws IOException {
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> resolvedDeserializer = new MockDeserializerForObject();
        // Mock context to return a specific deserializer for a specific type
        DeserializationContext ctxt = new MockDeserializationContext(null, null, resolvedDeserializer, resolvedType, true);

        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver() {
            @Override
            public JavaType typeFromId(DatabindContext context, String id) throws IOException {
                if ("testId".equals(id)) {
                    return resolvedType;
                }
                return super.typeFromId(context, id);
            }
        };

        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> foundDeser = instance._findDeserializer(ctxt, "testId");
        assertSame(resolvedDeserializer, foundDeser);
        // Check if it was added to the cache
        assertTrue(instance._deserializers.containsKey("testId"));
        assertSame(resolvedDeserializer, instance._deserializers.get("testId"));
    }

    @Test
    public void testFindDeserializer_defaultImpl_when_typeId_null() throws IOException {
        JavaType defaultImplType = TypeFactory.defaultInstance().constructType(Integer.class);
        JsonDeserializer<Object> defaultImplDeserializer = new MockDeserializerForObject(); // Use a concrete deserializer
        DeserializationContext ctxt = new MockDeserializationContext(null, null, defaultImplDeserializer, defaultImplType, true) {
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.equals(defaultImplType)) {
                    return defaultImplDeserializer;
                }
                return super.findContextualValueDeserializer(type, property);
            }
        };

        // TypeIdResolver returns null for the given ID
        TypeIdResolver idResolver = new DummyTypeIdResolver() {
            @Override
            public JavaType typeFromId(DatabindContext context, String id) throws IOException {
                return null; // Simulate unknown or unresolvable type ID
            }
        };

        TypeDeserializerBase instance = createInstance(TypeFactory.defaultInstance().constructType(Object.class),
                                                         idResolver, "type", false, defaultImplType);

        // _defaultImplDeserializer is lazily initialized
        assertNull(instance._defaultImplDeserializer);
        JsonDeserializer<Object> foundDeser = instance._findDeserializer(ctxt, "unknownId");
        assertSame(defaultImplDeserializer, foundDeser);
        assertNotNull(instance._defaultImplDeserializer); // Should be initialized now
    }

    @Test
    public void testFindDeserializer_defaultImpl_when_typeId_unresolvable() throws IOException {
        JavaType defaultImplType = TypeFactory.defaultInstance().constructType(Integer.class);
        JsonDeserializer<Object> defaultImplDeserializer = new MockDeserializerForObject();
        DeserializationContext ctxt = new MockDeserializationContext(null, null, defaultImplDeserializer, defaultImplType, true) {
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.equals(defaultImplType)) {
                    return defaultImplDeserializer;
                }
                return super.findContextualValueDeserializer(type, property);
            }
        };

        // TypeIdResolver returns a type that cannot be deserialized by default
        JavaType unresolvedType = TypeFactory.defaultInstance().constructType(java.io.Serializable.class); // Example of a type that might not have a direct deserializer
        TypeIdResolver idResolver = new DummyTypeIdResolver() {
            @Override
            public JavaType typeFromId(DatabindContext context, String id) throws IOException {
                if ("unresolvableId".equals(id)) {
                    return unresolvedType;
                }
                return super.typeFromId(context, id);
            }
        };

        TypeDeserializerBase instance = createInstance(TypeFactory.defaultInstance().constructType(Object.class),
                                                         idResolver, "type", false, defaultImplType);

        // Mock ctxt.handleUnknownTypeId to return a type that will eventually resolve to the default impl.
        DeserializationContext ctxWithUnknownHandler = new MockDeserializationContext(null, null, defaultImplDeserializer, defaultImplType, true) {
             @Override
             public JavaType handleUnknownTypeId(JavaType baseType, String typeId, TypeIdResolver idResolver, String extraDesc) throws IOException {
                 // Simulate that unknown type ultimately leads to resolving the default impl
                 return defaultImplType;
             }
             // Ensure we can find a deserializer for the resolved default type
             @Override
             public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                 if (type.equals(defaultImplType)) {
                     return defaultImplDeserializer;
                 }
                 return NullifyingDeserializer.instance; // Fallback
             }
        };

        JsonDeserializer<Object> foundDeser = instance._findDeserializer(ctxWithUnknownHandler, "unresolvableId");
        assertSame(defaultImplDeserializer, foundDeser);
    }


    @Test
    public void testFindDeserializer_handleUnknownTypeId_returns_null() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver() {
            @Override
            public JavaType typeFromId(DatabindContext context, String id) throws IOException {
                return null; // unknown type id
            }
        };

        // Mock context where handleUnknownTypeId returns null
        DeserializationContext ctxt = new MockDeserializationContext(null, null, null, null, false) { // FAIL_ON_INVALID_SUBTYPE disabled
            @Override
            public JavaType handleUnknownTypeId(JavaType baseType, String typeId, TypeIdResolver idResolver, String extraDesc) throws IOException {
                return null; // Simulate that unknown type cannot be resolved
            }
            // Ensure _findDefaultImplDeserializer returns NullifyingDeserializer as expected when feature is disabled
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                 return NullifyingDeserializer.instance; // Simulate finding NullifyingDeserializer
            }
        };

        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);

        JsonDeserializer<Object> foundDeser = instance._findDeserializer(ctxt, "unknownId");
        assertNotNull(foundDeser);
        assertTrue(foundDeser instanceof NullifyingDeserializer); // Should return NullifyingDeserializer
    }

    @Test
    public void testFindDeserializer_NullifyingDeserializer_when_no_defaultImpl_and_fail_off() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver() {
            @Override
            public JavaType typeFromId(DatabindContext context, String id) throws IOException {
                return null; // Simulate unknown type ID
            }
        };

        // Mock context where FAIL_ON_INVALID_SUBTYPE is disabled
        DeserializationContext ctxt = new MockDeserializationContext(null, null, null, null, false) { // FAIL_ON_INVALID_SUBTYPE is disabled
            // This mock context ensures that _findDefaultImplDeserializer can return NullifyingDeserializer
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                 return NullifyingDeserializer.instance; // Simulate finding NullifyingDeserializer
            }
        };

        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null); // No default impl

        JsonDeserializer<Object> foundDeser = instance._findDeserializer(ctxt, "unknownId");
        assertNotNull(foundDeser);
        assertTrue(foundDeser instanceof NullifyingDeserializer);
    }

    // --- Tests for _findDefaultImplDeserializer ---

    @Test
    public void testFindDefaultImplDeserializer_null_defaultImpl_and_fail_enabled() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null); // No default impl

        DeserializationContext ctxt = new MockDeserializationContext(null, null, null, null, true) { // FAIL_ON_INVALID_SUBTYPE is enabled
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                // Should not be called for default impl if _defaultImpl is null and FAIL_ON_INVALID_SUBTYPE is true.
                // It should return null.
                return null;
            }
        };

        JsonDeserializer<Object> deser = instance._findDefaultImplDeserializer(ctxt);
        assertNull(deser); // Should be null if no default impl and FAIL_ON_INVALID_SUBTYPE is true
    }

    @Test
    public void testFindDefaultImplDeserializer_null_defaultImpl_and_fail_disabled() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null); // No default impl

        DeserializationContext ctxt = new MockDeserializationContext(null, null, null, null, false) { // FAIL_ON_INVALID_SUBTYPE is disabled
             // Ensure findContextualValueDeserializer returns NullifyingDeserializer for a "bogus" type if _defaultImpl is null.
             // This mimics the behavior where _findDefaultImplDeserializer returns NullifyingDeserializer.instance.
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                 return NullifyingDeserializer.instance; // Simulates NullifyingDeserializer.instance
            }
        };

        JsonDeserializer<Object> deser = instance._findDefaultImplDeserializer(ctxt);
        assertNotNull(deser);
        assertTrue(deser instanceof NullifyingDeserializer);
    }

    @Test
    public void testFindDefaultImplDeserializer_with_defaultImpl_and_bogus_class() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        // Using a "bogus" class that ClassUtil.isBogusClass would identify
        JavaType defaultImplType = TypeFactory.defaultInstance().constructType(Void.class); // Void is often treated specially
        
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, defaultImplType);

        // Mock context to provide a deserializer for Void.class
        JsonDeserializer<Object> voidDeserializer = new MockDeserializerForObject(); // Mock deserializer for Void
        DeserializationContext ctxt = new MockDeserializationContext(null, null, voidDeserializer, defaultImplType, true) {
             @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.equals(defaultImplType)) {
                    return voidDeserializer;
                }
                return super.findContextualValueDeserializer(type, property);
            }
        };


        JsonDeserializer<Object> deser = instance._findDefaultImplDeserializer(ctxt);
        // For Void.class, it should return NullifyingDeserializer.instance.
        assertNotNull(deser);
        assertTrue(deser instanceof NullifyingDeserializer);
    }

    @Test
    public void testFindDefaultImplDeserializer_with_defaultImpl_and_valid_class() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        JavaType defaultImplType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> expectedDeserializer = new MockDeserializerForObject();

        DeserializationContext ctxt = new MockDeserializationContext(null, null, expectedDeserializer, defaultImplType, true) {
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.equals(defaultImplType)) {
                    return expectedDeserializer;
                }
                return super.findContextualValueDeserializer(type, property);
            }
        };

        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, defaultImplType);

        // First call, deserializer should be null
        assertNull(instance._defaultImplDeserializer);
        JsonDeserializer<Object> deser1 = instance._findDefaultImplDeserializer(ctxt);
        assertSame(expectedDeserializer, deser1);
        // After first call, it should be cached
        assertNotNull(instance._defaultImplDeserializer);
        assertSame(expectedDeserializer, instance._defaultImplDeserializer);

        // Second call, should return cached version
        JsonDeserializer<Object> deser2 = instance._findDefaultImplDeserializer(ctxt);
        assertSame(expectedDeserializer, deser2);
    }

    // --- Tests for _deserializeWithNativeTypeId ---

    @Test
    public void testDeserializeWithNativeTypeId_null_typeId() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        JavaType defaultImplType = TypeFactory.defaultInstance().constructType(Integer.class);
        JsonDeserializer<Object> defaultImplDeserializer = new MockDeserializerForObject();

        DeserializationContext ctxt = new MockDeserializationContext(null, null, defaultImplDeserializer, defaultImplType, true) {
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.equals(defaultImplType)) {
                    return defaultImplDeserializer;
                }
                return super.findContextualValueDeserializer(type, property);
            }
        };

        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, defaultImplType);

        // Mock JsonParser to return null for getTypeId()
        JsonParser jp = new MockJsonParser() {
            @Override
            public Object getTypeId() {
                return null;
            }
        };

        Object result = instance._deserializeWithNativeTypeId(jp, ctxt);
        // _deserializeWithNativeTypeId calls _findDefaultImplDeserializer, which should return defaultImplDeserializer.
        // Then it calls deserialize on that.
        assertNotNull(result); // MockDeserializerForObject returns new Object()
    }

    @Test
    public void testDeserializeWithNativeTypeId_with_typeId() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        JavaType resolvedType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> resolvedDeserializer = new MockDeserializerForObject();

        // Mock context to provide a deserializer for the type resolved by typeFromId
        DeserializationContext ctxt = new MockDeserializationContext(null, null, resolvedDeserializer, resolvedType, true) {
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.equals(resolvedType)) {
                    return resolvedDeserializer;
                }
                return super.findContextualValueDeserializer(type, property);
            }
        };

        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);

        // Mock JsonParser to return a typeId
        JsonParser jp = new MockJsonParser() {
            @Override
            public Object getTypeId() {
                return "testTypeId";
            }
        };

        // The _deserializeWithNativeTypeId calls _findDeserializer, which in turn calls _idResolver.typeFromId
        // Our DummyTypeIdResolver returns Object.class. Then _findDeserializer will try to find a deserializer for Object.class.
        // We need to ensure that the context can provide a deserializer for Object.class.
        JavaType objectType = TypeFactory.defaultInstance().constructType(Object.class);
        JsonDeserializer<Object> objectDeserializer = new MockDeserializerForObject();
        DeserializationContext ctxtForObject = new MockDeserializationContext(null, null, objectDeserializer, objectType, true) {
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                if (type.equals(objectType)) {
                    return objectDeserializer;
                }
                return super.findContextualValueDeserializer(type, property);
            }
        };

        Object result = instance._deserializeWithNativeTypeId(jp, ctxtForObject);
        // _findDeserializer will find objectDeserializer, and its deserialize method returns new Object().
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    // --- Tests for _handleUnknownTypeId ---

    @Test
    public void testHandleUnknownTypeId_delegatesToContext() throws IOException {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeIdResolver idResolver = new DummyTypeIdResolver();
        TypeDeserializerBase instance = createInstance(baseType, idResolver, "type", false, null);

        JavaType mockResolvedType = TypeFactory.defaultInstance().constructType(String.class);
        // Mock DeserializationContext to verify handleUnknownTypeId is called and returns a value.
        DeserializationContext ctxt = new MockDeserializationContext(null, null, null, null, true) {
            @Override
            public JavaType handleUnknownTypeId(JavaType baseType, String typeId, TypeIdResolver idResolver, String extraDesc) throws IOException {
                // Verify parameters are passed correctly (optional, but good for debugging)
                assertEquals(baseType, TypeDeserializerBaseTest.this.createInstance(baseType, idResolver, "type", false, null)._baseType);
                assertEquals("unknown", typeId);
                assertNotNull(idResolver);
                // Simulate that handleUnknownTypeId resolves to a known type
                return mockResolvedType;
            }
            // Need to provide a deserializer for mockResolvedType for subsequent calls if they were to happen
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
                 if (type.equals(mockResolvedType)) {
                     return new MockDeserializerForObject(); // Dummy deserializer
                 }
                 return super.findContextualValueDeserializer(type, property);
            }
        };

        JavaType handledType = instance._handleUnknownTypeId(ctxt, "unknown", idResolver, "extra");
        assertNotNull(handledType);
        assertEquals(mockResolvedType, handledType);
    }

    // --- Mock Classes ---
    private static class MockJsonParser extends JsonParser {
        @Override
        public void close() throws IOException {}
        @Override
        public boolean isClosed() { return false; }
        @Override
        public JsonToken nextToken() throws IOException { return null; }
        @Override
        public String getCurrentName() throws IOException { return null; }
        @Override
        public JsonStreamContext getParsingContext() { return null; }
        @Override
        public JsonLocation getTokenLocation() { return null; }
        @Override
        public JsonLocation getCurrentLocation() { return null; }
        @Override
        public void setCodec(ObjectCodec c) {}
        @Override
        public ObjectCodec getCodec() { return null; }
        @Override
        public Version version() { return Version.unknownVersion(); }
        @Override
        public JsonToken getCurrentToken() { return null; }
        @Override
        public boolean hasTextCharacters() { return false; }
        @Override
        public Object getInputSource() { return null; }
        @Override
        public String getText() throws IOException { return null; }
        @Override
        public boolean isNumeric() throws IOException { return false; }
        @Override
        public char getChar(int index) throws IOException { return 0; }
        @Override
        public int getTextLength() throws IOException { return 0; }
        @Override
        public int getTextOffset() throws IOException { return 0; }
        @Override
        public BigInteger getBigIntegerValue() throws IOException { return null; }
        @Override
        public BigDecimal getDecimalValue() throws IOException { return null; }
        @Override
        public double getDoubleValue() throws IOException { return 0.0; }
        @Override
        public float getFloatValue() throws IOException { return 0.0f; }
        @Override
        public int getIntValue() throws IOException { return 0; }
        @Override
        public long getLongValue() throws IOException { return 0L; }
        @Override
        public Number getNumberValue() throws IOException { return null; }
        @Override
        public NumberType getNumberType() throws IOException { return null; }
        @Override
        public String getValueAsString() throws IOException { return null; }
        @Override
        public String getValueAsString(String defaultValue) throws IOException { return null; }
        @Override
        public boolean getValueAsBoolean() throws IOException { return false; }
        @Override
        public int getValueAsInt() throws IOException { return 0; }
        @Override
        public long getValueAsLong() throws IOException { return 0L; }
        @Override
        public boolean canReadTypeId() { return true; }
        @Override
        public Object getTypeId() { return null; } // Default to null
    }
    
    private static class MockDeserializerForObject extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return new Object(); // A simple object
        }
    }
}
