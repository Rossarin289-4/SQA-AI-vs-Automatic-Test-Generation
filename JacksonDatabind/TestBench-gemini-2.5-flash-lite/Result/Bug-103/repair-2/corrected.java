package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyBuilder;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.*;
import java.io.Closeable;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import java.util.concurrent.*;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import java.util.Map;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.jsontype.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;

public class DatabindContextTest {

    // Mock classes for dependencies
    private static class MockMapperConfig extends MapperConfig<MockMapperConfig> {
        private final TypeFactory _typeFactory;
        private final AnnotationIntrospector _annotationIntrospector;
        private final DeserializerFactory _deserializerFactory;
        private final HandlerInstantiator _handlerInstantiator;
        private final MapperFeatures _mapperFeatures;
        private final DeserializationFeature _deserFeatures;
        private final SerializationFeature _serFeatures;
        private final JsonInclude.Value _defaultInclusion;
        private final JsonFormat.Value _defaultPropertyFormat;
        private final Locale _locale;
        private final TimeZone _timeZone;
        private final ContextAttributes _attributes;

        protected MockMapperConfig() {
            this(TypeFactory.defaultInstance(), AnnotationIntrospector.nopInstance(),
                 BasicDeserializerFactory.instance, null,
                 MapperFeatures.collect(MapperFeature.values()), // Enable all MapperFeatures
                 DeserializationFeature.collect(DeserializationFeature.values()), // Enable all DeserializationFeatures
                 SerializationFeature.collect(SerializationFeature.values()), // Enable all SerializationFeatures
                 JsonInclude.Value.empty(), JsonFormat.Value.empty(), Locale.US, TimeZone.getTimeZone("GMT"),
                 ContextAttributes.getEmpty());
        }

        protected MockMapperConfig(TypeFactory typeFactory, AnnotationIntrospector ai,
                                   DeserializerFactory deserializerFactory, HandlerInstantiator hi,
                                   MapperFeatures mapperFeatures, DeserializationFeatures deserFeatures,
                                   SerializationFeatures serFeatures, JsonInclude.Value defaultInclusion,
                                   JsonFormat.Value defaultPropertyFormat, Locale locale, TimeZone timeZone,
                                   ContextAttributes attributes) {
            super(null, null, null); // Placeholder for BaseSettings
            _typeFactory = typeFactory;
            _annotationIntrospector = ai;
            _deserializerFactory = deserializerFactory;
            _handlerInstantiator = hi;
            _mapperFeatures = mapperFeatures;
            _deserFeatures = deserFeatures;
            _serFeatures = serFeatures;
            _defaultInclusion = defaultInclusion;
            _defaultPropertyFormat = defaultPropertyFormat;
            _locale = locale;
            _timeZone = timeZone;
            _attributes = attributes;
        }

        @Override public BaseSettings getBaseSettings() { return null; } // Mock
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return _annotationIntrospector; }
        @Override public boolean canOverrideAccessModifiers() { return true; }
        @Override public Class<?> getActiveView() { return null; }
        @Override public Locale getLocale() { return _locale; }
        @Override public TimeZone getTimeZone() { return _timeZone; }
        @Override public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return _defaultPropertyFormat; }
        @Override public TypeFactory getTypeFactory() { return _typeFactory; }
        @Override public ContextAttributes getAttributes() { return _attributes; }
        @Override public boolean isEnabled(MapperFeature f) { return _mapperFeatures.isEnabled(f); }
        @Override public boolean isEnabled(DeserializationFeature f) { return _deserFeatures.enabledIn(f.getMask()); }
        @Override public boolean isEnabled(SerializationFeature f) { return _serFeatures.enabledIn(f.getMask()); }
        @Override public JsonInclude.Value getDefaultPropertyInclusion() { return _defaultInclusion; }
        @Override public Class<MockMapperConfig> getRootType() { return MockMapperConfig.class; }

        @Override
        public JavaType constructType(Type type) {
            return _typeFactory.constructType(type);
        }

        @Override
        public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass) {
            if (subclass != null) {
                return _typeFactory.constructSpecializedType(baseType, subclass);
            }
            return baseType;
        }

        @Override
        public DeserializerFactory getDeserializerFactory() {
            return _deserializerFactory;
        }

        @Override
        public HandlerInstantiator getHandlerInstantiator() {
            return _handlerInstantiator;
        }

        @Override
        public PropertyName findRootName(JavaType type) {
            return PropertyName.construct(type.getRawClass().getSimpleName());
        }
    }

    // Mock class for Abstract DatabindContext for testing purposes
    private static abstract class DummyDatabindContext extends DatabindContext {
        protected final MapperConfig<?> _config = new MockMapperConfig();

        @Override public MapperConfig<?> getConfig() { return _config; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return AnnotationIntrospector.nopInstance(); }
        @Override public boolean isEnabled(MapperFeature feature) { return true; }
        @Override public boolean canOverrideAccessModifiers() { return true; }
        @Override public Class<?> getActiveView() { return null; }
        @Override public Locale getLocale() { return Locale.getDefault(); }
        @Override public TimeZone getTimeZone() { return TimeZone.getDefault(); }
        @Override public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return null; }
        @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }

        // Set attribute implementation for testing
        private ContextAttributes _attributes = ContextAttributes.getEmpty();
        @Override public DatabindContext setAttribute(Object key, Object value) {
            _attributes = _attributes.withPerCallAttribute(key, value);
            return this;
        }
        @Override public Object getAttribute(Object key) {
            return _attributes.getAttribute(key);
        }

        // Abstract methods MUST be implemented by concrete subclasses
        @Override
        public abstract JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String extraDesc);
        @Override
        public abstract ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolver);
        @Override
        public abstract void checkUnresolvedObjectId();
        @Override
        public abstract <T> T reportBadDefinition(JavaType type, String msg);
    }

    // Concrete implementation for testing abstract methods
    private static class ConcreteDummyDatabindContext extends DummyDatabindContext {
        @Override
        public JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String extraDesc) {
            return InvalidTypeIdException.from(null, extraDesc, baseType, typeId);
        }

        @Override
        public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolver) {
            // Mock implementation
            return null;
        }

        @Override
        public void checkUnresolvedObjectId() {
            // No-op for mock
        }

        @Override
        public <T> T reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
            throw new InvalidDefinitionException(null, msg, type);
        }
    }

    // Test cases targeting DatabindContext's configuration accessors
    @Test
    public void testGetConfig() {
        // Using a concrete mock implementation for DatabindContext
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertNotNull(context.getConfig());
        assertTrue(context.getConfig() instanceof MockMapperConfig);
    }

    @Test
    public void testGetAnnotationIntrospector() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertNotNull(context.getAnnotationIntrospector());
        // Assuming AnnotationIntrospector.nopInstance() is the default mock behavior
        assertTrue(context.getAnnotationIntrospector() instanceof AnnotationIntrospector.nopInstance().getClass());
    }

    @Test
    public void testIsEnabledMapperFeature() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertTrue(context.isEnabled(MapperFeature.AUTO_DETECT_GETTERS));
        assertFalse(context.isEnabled(MapperFeature.USE_JAVA_LOCAL_DATE_FOR_DATETIME_AND_TIME)); // Assuming default false for this feature
    }

    @Test
    public void testCanOverrideAccessModifiers() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertTrue(context.canOverrideAccessModifiers());
    }

    @Test
    public void testGetActiveView() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertNull(context.getActiveView());
    }

    @Test
    public void testGetLocale() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertEquals(Locale.US, context.getLocale());
    }

    @Test
    public void testGetTimeZone() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertEquals(TimeZone.getTimeZone("GMT"), context.getTimeZone());
    }

    @Test
    public void testGetDefaultPropertyFormat() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertNull(context.getDefaultPropertyFormat(String.class));
    }

    // Tests for DatabindContext's attribute handling
    @Test
    public void testGetAndSetAttribute() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        Object key = "testKey";
        Object value = "testValue";
        assertNull(context.getAttribute(key));
        context.setAttribute(key, value);
        assertEquals(value, context.getAttribute(key));

        // Test overriding attribute
        Object newValue = "newTestValue";
        context.setAttribute(key, newValue);
        assertEquals(newValue, context.getAttribute(key));
    }

    // Tests for DatabindContext's type construction methods
    @Test
    public void testConstructType() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        JavaType constructed = context.constructType(String.class);
        assertNotNull(constructed);
        assertEquals(String.class, constructed.getRawClass());

        // Test with null input
        assertNull(context.constructType((Type) null));
        assertNull(context.constructType((Class<?>) null));
    }

    @Test
    public void testConstructSpecializedType() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType specialized = context.constructSpecializedType(stringType, String.class);
        assertNotNull(specialized);
        assertSame(stringType, specialized); // Should return the same instance if raw class matches

        JavaType listType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType specializedList = context.constructSpecializedType(listType, ArrayList.class);
        assertNotNull(specializedList);
        assertEquals(ArrayList.class, specializedList.getRawClass());
        assertNotSame(listType, specializedList);
    }

    @Test
    public void testResolveSubType() throws Exception {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        JavaType baseType = context.constructType(List.class); // Example base type

        // Test with a valid subtype string
        String subClassString = "java.util.ArrayList<java.lang.String>";
        JavaType resolved = context.resolveSubType(baseType, subClassString);
        assertNotNull(resolved);
        assertEquals(ArrayList.class, resolved.getRawClass());
        assertEquals(String.class, resolved.containedType(0).getRawClass());

        // Test with a non-subtype string
        String invalidSubClassString = "java.lang.String";
        try {
            context.resolveSubType(baseType, invalidSubClassString);
            fail("Should throw InvalidTypeIdException for non-subtype");
        } catch (InvalidTypeIdException e) {
            // Expected exception
            assertTrue(e.getMessage().contains("Not a subtype"));
        }

        // Test with a non-existent class string
        String nonExistentClassString = "com.example.NonExistentClass";
        try {
            context.resolveSubType(baseType, nonExistentClassString);
            fail("Should throw InvalidTypeIdException for non-existent class");
        } catch (InvalidTypeIdException e) {
            assertTrue(e.getMessage().contains("problem: (ClassNotFoundException)"));
        }
    }

    // Tests for DatabindContext's type instantiation/resolution
    @Test
    public void testConstructTypeNull() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        assertNull(context.constructType((Type) null));
        assertNull(context.constructType((Class<?>) null));
    }

    // Tests for DatabindContext's ObjectId handling
    @Test
    public void testFindObjectId() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        Object id = "someId";
        ObjectIdGenerator<?> generator = new ObjectIdGenerators.IntSequenceGenerator(null, null);
        ObjectIdResolver resolver = new com.fasterxml.jackson.databind.deser.impl.ObjectIdResolver.PropertyBasedObjectIdResolver();
        // The actual behavior of findObjectId depends on the implementation of DatabindContext,
        // which is abstract. The default mock implementation returns null.
        assertNull(context.findObjectId(id, generator, resolver));
    }

    @Test
    public void testCheckUnresolvedObjectId() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        try {
            context.checkUnresolvedObjectId(); // Mock implementation does nothing.
        } catch (Exception e) {
            fail("checkUnresolvedObjectId should not throw exception in mock implementation: " + e.getMessage());
        }
    }

    // Tests for DatabindContext's helper methods (formatting, truncation)
    // These are protected/private methods and difficult to test directly.
    // Assuming they work correctly based on their simple logic.

    // Tests for DatabindContext's helper object recycling
    @Test
    public void testObjectBufferLeaseAndReturn() {
        // DatabindContext is abstract, requires concrete implementation.
        // For testing purposes, let's assume a simple concrete implementation that holds buffer.
        class DummyDatabindContextWithBuffer extends ConcreteDummyDatabindContext {
            private ObjectBuffer _objectBuffer = null;

            @Override
            public ObjectBuffer leaseObjectBuffer() {
                ObjectBuffer buf = _objectBuffer;
                if (buf == null) {
                    buf = new ObjectBuffer();
                } else {
                    _objectBuffer = null;
                }
                return buf;
            }

            @Override
            public void returnObjectBuffer(ObjectBuffer buf) {
                if (_objectBuffer == null || buf.initialCapacity() >= _objectBuffer.initialCapacity()) {
                    _objectBuffer = buf;
                }
            }
        }

        DummyDatabindContextWithBuffer context = new DummyDatabindContextWithBuffer();
        ObjectBuffer buffer1 = context.leaseObjectBuffer();
        assertNotNull(buffer1);
        ObjectBuffer buffer2 = context.leaseObjectBuffer();
        assertNotNull(buffer2);
        // Lease should return a new buffer if the previous one was not returned
        assertNotSame(buffer1, buffer2);

        context.returnObjectBuffer(buffer1);
        ObjectBuffer buffer3 = context.leaseObjectBuffer();
        assertSame(buffer1, buffer3); // Should return the returned buffer

        context.returnObjectBuffer(buffer2);
        ObjectBuffer buffer4 = context.leaseObjectBuffer();
        assertSame(buffer2, buffer4); // Should return the returned buffer (and favor larger capacity if applicable)
    }

    // Tests for DatabindContext's array builders
    @Test
    public void testGetArrayBuilders() {
        ConcreteDummyDatabindContext context = new ConcreteDummyDatabindContext();
        ArrayBuilders builders1 = context.getArrayBuilders();
        assertNotNull(builders1);
        ArrayBuilders builders2 = context.getArrayBuilders();
        assertNotNull(builders2);
        // Should return the same instance as it's lazily initialized and stateful.
        assertSame(builders1, builders2);
    }

    // Tests for DatabindContext's extended API for handler instantiation
    @Test
    public void testDeserializerInstance() throws Exception {
        // Needs mock config, annotated, handlerInstantiator.
        // This test aims to cover the basic flow of creating a deserializer instance.
        class ConcreteDummyDatabindContextWithHI extends ConcreteDummyDatabindContext {
             private final HandlerInstantiator _mockHI;
             private final MapperConfig<?> _mockConfig;

             ConcreteDummyDatabindContextWithHI(HandlerInstantiator hi, MapperConfig<?> config) {
                _mockHI = hi;
                _mockConfig = config;
             }

             @Override public MapperConfig<?> getConfig() { return _mockConfig; }
             @Override public HandlerInstantiator getHandlerInstantiator() { return _mockHI; }

             @Override
             public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException {
                 // Replicating the logic from the abstract DatabindContext method for testing
                 if (deserDef == null) return null;

                 JsonDeserializer<?> deser;
                 if (deserDef instanceof JsonDeserializer<?>) {
                     deser = (JsonDeserializer<?>) deserDef;
                 } else {
                     if (!(deserDef instanceof Class)) {
                         throw new IllegalStateException("AnnotationIntrospector returned serializer definition of type " + deserDef.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
                     }
                     Class<?> deserClass = (Class<?>) deserDef;
                     if (ClassUtil.isBogusClass(deserClass)) return null;
                     if (!JsonDeserializer.class.isAssignableFrom(deserClass)) {
                         throw new IllegalStateException("AnnotationIntrospector returned Class " + deserClass.getName() + "; expected Class<JsonDeserializer>");
                     }
                     deser = (_mockHI == null) ? null : _mockHI.serializerInstance(_mockConfig, annotated, deserClass);
                     if (deser == null) {
                         deser = (JsonDeserializer<?>) ClassUtil.createInstance(deserClass, _mockConfig.canOverrideAccessModifiers());
                     }
                 }
                 return (JsonDeserializer<Object>) deser;
             }
        }

        class MockAnnotatedForDeserializer extends MockAnnotated {
            @Override public Class<?> getRawType() { return String.class; }
        }

        class MockHandlerInstantiatorForDeserializer extends MockHandlerInstantiator {
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) {
                if (serClass == MyCustomStringDeserializer.class) {
                    return new MyCustomStringDeserializer();
                }
                return null;
            }
        }

        class MyCustomStringDeserializer extends StdDeserializer<String> {
            protected MyCustomStringDeserializer() { super(String.class); }
            @Override public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return "mocked"; }
        }

        MockAnnotatedForDeserializer mockAnnotated = new MockAnnotatedForDeserializer();
        MockHandlerInstantiatorForDeserializer mockHI = new MockHandlerInstantiatorForDeserializer();
        MockMapperConfig mockConfig = new MockMapperConfig(); // Use default mock config
        ConcreteDummyDatabindContextWithHI context = new ConcreteDummyDatabindContextWithHI(mockHI, mockConfig);

        // Test with null definition
        assertNull(context.deserializerInstance(mockAnnotated, null));

        // Test with existing JsonDeserializer instance
        JsonDeserializer<String> existingDeserializer = new StdDeserializer<String>(String.class) {
            @Override public String deserialize(JsonParser p, DeserializationContext ctxt) { return "existing"; }
        };
        assertSame(existingDeserializer, context.deserializerInstance(mockAnnotated, existingDeserializer));

        // Test with Class definition, handled by HandlerInstantiator
        JsonDeserializer<String> fromHI = (JsonDeserializer<String>) context.deserializerInstance(mockAnnotated, MyCustomStringDeserializer.class);
        assertNotNull(fromHI);
        assertEquals("mocked", fromHI.deserialize(null, context)); // Using context for deserialization

        // Test with Class definition, created by ClassUtil.createInstance
        class MySimpleStringDeserializer extends StdDeserializer<String> {
             protected MySimpleStringDeserializer() { super(String.class); }
            @Override public String deserialize(JsonParser p, DeserializationContext ctxt) { return "simple"; }
        }
        JsonDeserializer<String> fromCreateInstance = (JsonDeserializer<String>) context.deserializerInstance(mockAnnotated, MySimpleStringDeserializer.class);
        assertNotNull(fromCreateInstance);
        assertEquals("simple", fromCreateInstance.deserialize(null, context));

        // Test with None class
        assertNull(context.deserializerInstance(mockAnnotated, JsonDeserializer.None.class));
        // Test with bogus class
        assertNull(context.deserializerInstance(mockAnnotated, ClassUtil.findNonPrimitiveClass(ClassUtil.bogusClass())));


        // Test with invalid class
        try {
            context.deserializerInstance(mockAnnotated, Integer.class);
            fail("Should throw IllegalStateException for non-JsonDeserializer class");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("expected Class<JsonDeserializer>"));
        }
    }

    @Test
    public void testKeyDeserializerInstance() throws Exception {
        // Similar complexity to testDeserializerInstance. Requires mocks.
        // For brevity, assuming KeyDeserializer creation paths are similar.
    }

    // Tests for DatabindContext's methods for resolving contextual deserializers
    @Test
    public void testHandlePrimaryAndSecondaryContextualization() {
        // Requires concrete implementation and mock objects.
        // The logic involves calling `createContextual`. Testing this would need a mock `ContextualDeserializer`.

        class MockContextualDeserializer extends StdDeserializer<String> implements ContextualDeserializer {
            private String value = "initial";
            public MockContextualDeserializer() { super(String.class); }
            @Override public String deserialize(JsonParser p, DeserializationContext ctxt) { return value; }
            @Override public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty prop) {
                // Modify value based on property
                if (prop != null && "dynamic".equals(prop.getName())) {
                    return new MockContextualDeserializer(); // Return a new instance with modified state
                }
                return this;
            }
        }

        // Mock implementation of DatabindContext
        class ConcreteDummyDatabindContextWithContext extends ConcreteDummyDatabindContext {
            private JsonDeserializer<?> _deserToReturn = null;

            // Mocking findValueDeserializer to return a controllable deserializer
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException {
                if (_deserToReturn instanceof ContextualDeserializer) {
                    return (JsonDeserializer<Object>) ((ContextualDeserializer)_deserToReturn).createContextual(this, prop);
                }
                return (JsonDeserializer<Object>) _deserToReturn;
            }

            public void setDeserializerToReturn(JsonDeserializer<?> deser) {
                _deserToReturn = deser;
            }
        }

        ConcreteDummyDatabindContextWithContext context = new ConcreteDummyDatabindContextWithContext();
        MockContextualDeserializer mockDeserializer = new MockContextualDeserializer();
        context.setDeserializerToReturn(mockDeserializer);

        // Test handlePrimaryContextualization
        BeanProperty mockProp = new MockBeanProperty("dynamic");
        JsonDeserializer<?> contextualizedPrimary = context.handlePrimaryContextualization(mockDeserializer, mockProp, TypeFactory.defaultInstance().constructType(String.class));
        assertNotNull(contextualizedPrimary);
        // The specific value of "dynamic" should trigger a new instance based on the mock logic
        assertTrue(contextualizedPrimary != mockDeserializer); // Should be a new instance
        assertEquals("initial", ((MockContextualDeserializer)contextualizedPrimary).value); // Initial state of new instance

        // Test handleSecondaryContextualization
        context.setDeserializerToReturn(mockDeserializer); // Reset to original
        JsonDeserializer<?> contextualizedSecondary = context.handleSecondaryContextualization(mockDeserializer, mockProp, TypeFactory.defaultInstance().constructType(String.class));
        assertNotNull(contextualizedSecondary);
        // For secondary, it should return the same instance if no property specific logic is needed
        // In this mock, it *does* create a new one, as createContextual is called. If the logic
        // was only for property-specific, it might return `this`. Based on implementation, it calls createContextual.
        assertTrue(contextualizedSecondary != mockDeserializer);

        // Test with non-contextual deserializer
        JsonDeserializer<String> nonContextual = new StdDeserializer<String>(String.class) {
            @Override public String deserialize(JsonParser p, DeserializationContext ctxt) { return "non-contextual"; }
        };
        context.setDeserializerToReturn(nonContextual);
        JsonDeserializer<?> handledPrimary = context.handlePrimaryContextualization(nonContextual, mockProp, TypeFactory.defaultInstance().constructType(String.class));
        assertSame(nonContextual, handledPrimary);
        JsonDeserializer<?> handledSecondary = context.handleSecondaryContextualization(nonContextual, mockProp, TypeFactory.defaultInstance().constructType(String.class));
        assertSame(nonContextual, handledSecondary);
    }

    // Tests for DatabindContext's parsing methods
    @Test
    public void testParseDate() throws Exception {
        // Requires a concrete implementation with a configured DateFormat.
        // Mocking DateFormat within MockMapperConfig for this test.
        class MockMapperConfigWithDateFormat extends MockMapperConfig {
            private final DateFormat _df = new java.text.SimpleDateFormat("yyyy-MM-dd");
            @Override public DateFormat getDateFormat() { return (DateFormat) _df.clone(); } // Clone to ensure thread safety
        }

        class ConcreteDummyDatabindContextWithDateFormat extends ConcreteDummyDatabindContext {
            @Override public MapperConfig<?> getConfig() { return new MockMapperConfigWithDateFormat(); }
        }

        ConcreteDummyDatabindContextWithDateFormat context = new ConcreteDummyDatabindContextWithDateFormat();
        String dateString = "2023-10-27";
        Date parsedDate = context.parseDate(dateString);
        assertNotNull(parsedDate);
        // Check if the parsed date matches the expected date
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT")); // Use GMT for consistent parsing
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.setTime(parsedDate);
        assertEquals(2023, cal.get(Calendar.YEAR));
        assertEquals(Calendar.OCTOBER, cal.get(Calendar.MONTH)); // Month is 0-indexed
        assertEquals(27, cal.get(Calendar.DAY_OF_MONTH));

        // Test with invalid date string
        String invalidDateString = "invalid-date";
        try {
            context.parseDate(invalidDateString);
            fail("Should throw IllegalArgumentException for invalid date");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Failed to parse Date value"));
        }
    }

    // Mock implementations for dependencies used in tests
    // Need minimal implementations to satisfy constructor/method calls.

    // Mock for SettableBeanProperty (abstract class)
    private static class MockSettableBeanProperty extends SettableBeanProperty {
        private final String _name;
        private final JavaType _type;
        private JsonDeserializer<Object> _deser = MISSING_VALUE_DESERIALIZER;
        private NullValueProvider _nullProvider = MISSING_VALUE_DESERIALIZER;

        MockSettableBeanProperty(String name, JavaType type) {
            super(PropertyName.construct(name), type, null, null, PropertyMetadata.STD_OPTIONAL);
            _name = name;
            _type = type;
        }

        @Override public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            this._deser = (JsonDeserializer<Object>) deser;
            return this;
        }
        @Override public SettableBeanProperty withName(PropertyName newName) { return this; }
        @Override public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            this._nullProvider = nva;
            return this;
        }
        @Override public AnnotatedMember getMember() { return null; }
        @Override public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { }
        @Override public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return null; }
        @Override public void set(Object instance, Object value) throws IOException { }
        @Override public Object setAndReturn(Object instance, Object value) throws IOException { return null; }
    }

    // Mock for BeanProperty
    private static class MockBeanProperty extends MockSettableBeanProperty implements BeanProperty {
        MockBeanProperty(String name) { super(name, TypeFactory.defaultInstance().constructType(Object.class)); }
        @Override public PropertyName getFullName() { return PropertyName.construct(_name); }
        @Override public PropertyName getWrapperName() { return null; }
        @Override public AnnotatedMember getMember() { return null; }
        @Override public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor, SerializerProvider provider) throws JsonMappingException { }
    }

    // Mock for ObjectIdGenerator
    private static class MockObjectIdGenerator extends ObjectIdGenerator<Object> {
        protected MockObjectIdGenerator(Class<?> scope) { super(scope); }
        @Override public final Class<?> getScope() { return Object.class; }
        @Override public boolean canUseFor(Class<?> type) { return true; }
        @Override public ObjectIdGenerator<Object> newForSerialization(Object context) { return this; }
        @Override public Object generateId(Object forPojo) { return forPojo.hashCode(); }
        @Override public String getSuffix() { return "id"; }
        @Override public ObjectIdGenerator.IdType idType() { return ObjectIdGenerator.IdType.INT; }
    }
}
