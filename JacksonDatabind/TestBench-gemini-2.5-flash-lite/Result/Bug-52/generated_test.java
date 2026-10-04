package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;


public class BeanDeserializerBaseTest {

    // Helper method to create a dummy BeanDescription for testing purposes


    // Helper method to create a dummy ValueInstantiator
    private ValueInstantiator createDummyValueInstantiator(JavaType type) {
        return new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return type.getRawClass(); }
            @Override public String getValueTypeDesc() { return type.getRawClass().getName(); }
            @Override public boolean canInstantiate() { return true; }
            @Override public boolean canCreateFromString() { return false; }
            @Override public boolean canCreateFromInt() { return false; }
            @Override public boolean canCreateFromLong() { return false; }
            @Override public boolean canCreateFromDouble() { return false; }
            @Override public boolean canCreateFromBoolean() { return false; }
            @Override public boolean canCreateUsingDefault() { return true; }
            @Override public boolean canCreateUsingDelegate() { return false; }
            @Override public boolean canCreateUsingArrayDelegate() { return false; }
            @Override public boolean canCreateFromObjectWith() { return false; }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return null; }
            @Override public JavaType getDelegateType(DeserializationConfig config) { return null; }
            @Override public JavaType getArrayDelegateType(DeserializationConfig config) { return null; }
            @Override public Object createUsingDefault(DeserializationContext ctxt) throws IOException { return new Object(); }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) throws IOException { return null; }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] props, PropertyValueBuffer buffer) throws IOException { return null; }
            @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return null; }
            @Override public Object createUsingArrayDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return null; }
            @Override public Object createFromString(DeserializationContext ctxt, String value) throws IOException { return null; }
            @Override public Object createFromInt(DeserializationContext ctxt, int value) throws IOException { return null; }
        };
    }

    // Helper method to create a dummy DeserializationContext

    private DeserializationContext createDummyDeserializationContext() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getDeserializationContext();
    }

    // Helper method to create a dummy BeanDeserializerBuilder
    
    // Helper to create a dummy JavaType
    private JavaType createDummyJavaType(Class<?> cls) {
        return SimpleType.constructUnsafe(cls);
    }

    // --- Tests ---




    










    @Test
    public void testHandleIgnoredProperty() throws Exception {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        Set<String> ignorableProps = new HashSet<>(Collections.singletonList("dummyIgnored"));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, ignorableProps, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        
        MockJsonParser mockParser = new MockJsonParser() {
            @Override public JsonToken nextToken() throws IOException { return JsonToken.VALUE_NULL; } 
            @Override public void skipChildren() throws IOException {} 
        };
        
        // Test with FAIL_ON_IGNORED_PROPERTIES enabled
        DeserializationConfig configEnabled = ctxt.getConfig().with(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        DeserializationContext ctxtEnabled = new DefaultDeserializationContext.Impl(configEnabled, null);

        try {
            deserializer.handleIgnoredProperty(mockParser, ctxtEnabled, new Object(), "dummyIgnored");
            fail("Should have thrown IgnoredPropertyException");
        } catch (IgnoredPropertyException e) {
            assertEquals("dummyIgnored", e.getPropertyName());
        }

        // Test with FAIL_ON_IGNORED_PROPERTIES disabled
        DeserializationConfig configDisabled = ctxt.getConfig().without(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        DeserializationContext ctxtDisabled = new DefaultDeserializationContext.Impl(configDisabled, null);
        try {
            deserializer.handleIgnoredProperty(mockParser, ctxtDisabled, new Object(), "dummyIgnored");
        } catch (Exception e) {
            fail("Should not have thrown an exception when FAIL_ON_IGNORED_PROPERTIES is disabled: " + e.getMessage());
        }
    }
    
    @Test
    public void testWrapAndThrowWithJsonMappingException() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Object bean = new Object();
        String fieldName = "testField";
        
        // JsonMappingException.wrapWithPath is static. We simulate its effect.
        JsonMappingException originalException = new JsonMappingException("Original message");
        originalException.prependPathSegment(fieldName); // Prepend path for the current field

        try {
            deserializer.wrapAndThrow(originalException, bean, fieldName, ctxt); // The method will add path info
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertEquals("Original message", e.getMessage());
            // The path should now contain the fieldName added by the method.
            assertTrue(e.getPathReference().contains(fieldName));
        }
    }

    @Test
    public void testWrapAndThrowWithRuntimeException() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Object bean = new Object();
        String fieldName = "testField";
        RuntimeException originalException = new RuntimeException("Runtime error");

        try {
            deserializer.wrapAndThrow(originalException, bean, fieldName, ctxt);
            fail("Expected RuntimeException wrapped in JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Runtime error", e.getCause().getMessage());
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapAndThrowWithInvocationTargetException() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Object bean = new Object();
        String fieldName = "testField";
        InvocationTargetException ite = new InvocationTargetException(new RuntimeException("Inner error"));

        try {
            deserializer.wrapAndThrow(ite, bean, fieldName, ctxt);
            fail("Expected RuntimeException wrapped in JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Inner error", e.getCause().getMessage());
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapAndThrowWithWrapExceptionsEnabled() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        DeserializationConfig config = createDummyDeserializationContext().getConfig().with(DeserializationFeature.WRAP_EXCEPTIONS);
        DeserializationContext ctxt = new DefaultDeserializationContext.Impl(config, null);
        Object bean = new Object();
        String fieldName = "testField";
        IOException ioException = new IOException("IO error");

        try {
            deserializer.wrapAndThrow(ioException, bean, fieldName, ctxt);
            fail("Expected IOException wrapped in JsonMappingException");
        } catch (JsonMappingException e) { // WRAP_EXCEPTIONS means it should still be wrapped
            assertTrue(e.getCause() instanceof IOException);
            assertEquals("IO error", e.getCause().getMessage());
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapAndThrowWithWrapExceptionsDisabled() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        DeserializationConfig config = createDummyDeserializationContext().getConfig().without(DeserializationFeature.WRAP_EXCEPTIONS);
        DeserializationContext ctxt = new DefaultDeserializationContext.Impl(config, null);
        Object bean = new Object();
        String fieldName = "testField";
        IOException ioException = new IOException("IO error");

        try {
            deserializer.wrapAndThrow(ioException, bean, fieldName, ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("IO error", e.getMessage());
            // JsonMappingException.wrapWithPath might still add path info even if not wrapping
            // However, the core exception should be IOException.
            assertTrue(e.getMessage().contains("path=[testField]"));
        }
    }

    @Test
    public void testWrapInstantiationProblem() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        DeserializationContext ctxt = createDummyDeserializationContext();
        Throwable throwable = new RuntimeException("Instantiation failure");

        try {
            deserializer.wrapInstantiationProblem(throwable, ctxt);
            fail("Expected handleInstantiationProblem");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Failed to instantiate"));
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Instantiation failure", e.getCause().getMessage());
        }
    }

    @Test
    public void testFindBackReference() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty backRefProp = new SettableBeanProperty(PropertyName.construct("backRef"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "backRef"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };

        Map<String, SettableBeanProperty> backRefs = new HashMap<>();
        backRefs.put("myRef", backRefProp);
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), backRefs, null, false, false);
        
        assertNotNull(deserializer.findBackReference("myRef"));
        assertEquals(backRefProp, deserializer.findBackReference("myRef"));
        assertNull(deserializer.findBackReference("nonExistentRef"));
    }
    
    @Test
    public void testGetPropertyCount() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("prop1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        SettableBeanProperty prop2 = new SettableBeanProperty(PropertyName.construct("prop2"), createDummyJavaType(Integer.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop2"; } @Override public JavaType getType() { return createDummyJavaType(Integer.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };

        BeanPropertyMap properties = new BeanPropertyMap(false, Arrays.asList(prop1, prop2));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        assertEquals(2, deserializer.getPropertyCount());
    }

    @Test
    public void testGetKnownPropertyNames() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("name1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "name1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        SettableBeanProperty prop2 = new SettableBeanProperty(PropertyName.construct("name2"), createDummyJavaType(Integer.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "name2"; } @Override public JavaType getType() { return createDummyJavaType(Integer.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };

        BeanPropertyMap properties = new BeanPropertyMap(false, Arrays.asList(prop1, prop2));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        Collection<Object> names = deserializer.getKnownPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("name1"));
        assertTrue(names.contains("name2"));
    }

    @Test
    public void testIsCachable() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        assertTrue(deserializer.isCachable());
    }
    
    @Test
    public void testValueType() {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        assertEquals(beanType, deserializer.getValueType());
    }

    @Test
    public void testUnwrappingDeserializer() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        // BeanDeserializerBase is abstract and unwrappingDeserializer is abstract.
        // Need to use a concrete subclass like BeanDeserializer.
        BeanDeserializer deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        NameTransformer transformer = new NameTransformer.Chained(new NameTransformer.Prefix("pre_"), new NameTransformer.Suffix("_suf"));
        JsonDeserializer<Object> unwrapping = deserializer.unwrappingDeserializer(transformer);
        
        assertNotNull(unwrapping);
        // Further assertions would require knowing the specific behavior of unwrappingDeserializer.
        // For this test, we just verify that it returns a non-null deserializer.
    }

    @Test
    public void testWithObjectIdReader() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);

        ObjectIdReader oir = ObjectIdReader.construct(
            createDummyJavaType(Integer.class),
            PropertyName.construct("id"),
            new ObjectIdGenerators.IntSequenceGenerator(null, -1),
            createDummyDeserializationContext().findRootValueDeserializer(createDummyJavaType(Integer.class)), // Requires a DeserializerProvider
            null, // No idProperty for this simple test
            new ObjectIdResolver() { // Dummy resolver
                @Override public void bindItem(Object id, Object item) {}
                @Override public Object resolveId(Object id) throws IOException { return null; }
                @Override public ObjectIdResolver newForDeserialization(Object context) { return this; }
                @Override public boolean canUseFor(ObjectIdResolver resolverToTest) { return false; }
            }
        );
        
        BeanDeserializerBase newDeserializer = deserializer.withObjectIdReader(oir);
        assertNotSame(deserializer, newDeserializer);
        assertNotNull(newDeserializer._objectIdReader);
        assertEquals("id", newDeserializer._objectIdReader.propertyName.getSimpleName());
    }

    @Test
    public void testWithIgnorableProperties() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        Set<String> initialIgnorable = new HashSet<>(Arrays.asList("prop1"));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, initialIgnorable, false, false);

        Set<String> newIgnorable = new HashSet<>(Arrays.asList("prop2", "prop3"));
        BeanDeserializerBase newDeserializer = deserializer.withIgnorableProperties(newIgnorable);
        
        assertNotSame(deserializer, newDeserializer);
        assertEquals(newIgnorable, newDeserializer._ignorableProps);
    }
    
    @Test
    public void testWithBeanProperties() throws Exception {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));

        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("prop1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        SettableBeanProperty prop2 = new SettableBeanProperty(PropertyName.construct("prop2"), createDummyJavaType(Integer.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop2"; } @Override public JavaType getType() { return createDummyJavaType(Integer.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap initialProps = new BeanPropertyMap(false, Arrays.asList(prop1));
        
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, initialProps, null, null, false, false);

        BeanPropertyMap newProps = new BeanPropertyMap(false, Arrays.asList(prop2));
        BeanDeserializerBase newDeserializer = deserializer.withBeanProperties(newProps);
        
        assertNotSame(deserializer, newDeserializer);
        assertEquals(newProps, newDeserializer._beanProperties);
    }

    @Test
    public void testHandledType() {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        assertEquals(String.class, deserializer.handledType());
    }
    
    @Test
    public void testGetObjectIdReader() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);

        assertNull(deserializer.getObjectIdReader());
    }

    @Test
    public void testHasProperty() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop = new SettableBeanProperty(PropertyName.construct("testProp"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "testProp"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);

        assertTrue(deserializer.hasProperty("testProp"));
        assertFalse(deserializer.hasProperty("nonExistentProp"));
    }

    @Test
    public void testHasViews() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false); // hasViews = false
        assertFalse(deserializer.hasViews());

        // Create a new builder and deserializer with hasViews set to true.
        BeanDeserializerBuilder builderWithViews = createDummyBeanDeserializerBuilder(beanType);
        builderWithViews.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializerWithViews = new BeanDeserializer(builderWithViews, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, true); // hasViews = true
        assertTrue(deserializerWithViews.hasViews());
    }
    
    @Test
    public void testGetBeanClass() {
        JavaType beanType = createDummyJavaType(String.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        assertEquals(String.class, deserializer.getBeanClass());
    }

    @Test
    public void testPropertiesIterator() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop1 = new SettableBeanProperty(PropertyName.construct("prop1"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "prop1"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop1));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);

        Iterator<SettableBeanProperty> it = deserializer.properties();
        assertTrue(it.hasNext());
        assertEquals(prop1, it.next());
        assertFalse(it.hasNext());
    }
    
    @Test
    public void testCreatorPropertiesIterator() {
        JavaType beanType = createDummyJavaType(TestBean.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);

        JavaType nameType = createDummyJavaType(String.class);
        SettableBeanProperty nameProp = new SettableBeanProperty(PropertyName.construct("name"), nameType, null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "name"; } @Override public JavaType getType() { return nameType; } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        
        ValueInstantiator vi = new ValueInstantiator() {
            @Override public Class<?> getValueClass() { return TestBean.class; }
            @Override public String getValueTypeDesc() { return "TestBean"; }
            @Override public boolean canCreateFromObjectWith() { return true; }
            @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { 
                nameProp.assignIndex(0);
                return new SettableBeanProperty[]{ nameProp }; 
            }
            @Override public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] props, PropertyValueBuffer buffer) throws IOException { return null; }
        };

        // PropertyBasedCreator requires DeserializationConfig.
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();

        PropertyBasedCreator creator = PropertyBasedCreator.construct(createDummyDeserializationContext(config), 
            vi,
            new SettableBeanProperty[]{ nameProp }
        );
        
        builder.setValueInstantiator(creator.getValueInstantiator()); 
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, new BeanPropertyMap(false, Collections.emptyList()), null, null, false, false);
        
        // Need to inject the creator into the deserializer instance for testing creatorProperties()
        try {
            java.lang.reflect.Field field = BeanDeserializerBase.class.getDeclaredField("_propertyBasedCreator");
            field.setAccessible(true);
            field.set(deserializer, creator);
        } catch (Exception e) { throw new RuntimeException(e); }

        Iterator<SettableBeanProperty> it = deserializer.creatorProperties();
        assertTrue(it.hasNext());
        assertEquals(nameProp, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testFindPropertyByName() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop = new SettableBeanProperty(PropertyName.construct("testProp"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "testProp"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        assertEquals(prop, deserializer.findProperty("testProp"));
        assertNull(deserializer.findProperty("nonExistentProp"));
    }
    
    @Test
    public void testFindPropertyByPropertyName() {
        JavaType beanType = createDummyJavaType(Object.class);
        BeanDescription beanDesc = createDummyBeanDescription(beanType);
        BeanDeserializerBuilder builder = createDummyBeanDeserializerBuilder(beanType);
        builder.setValueInstantiator(createDummyValueInstantiator(beanType));
        
        SettableBeanProperty prop = new SettableBeanProperty(PropertyName.construct("testProp"), createDummyJavaType(String.class), null, null, null, PropertyMetadata.STD_OPTIONAL) {
            private static final long serialVersionUID = 1L; @Override public void set(Object instance, Object value) {} @Override public Object get(Object instance) { return null; } @Override public String getName() { return "testProp"; } @Override public JavaType getType() { return createDummyJavaType(String.class); } @Override public BeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        };
        BeanPropertyMap properties = new BeanPropertyMap(false, Collections.singletonList(prop));
        BeanDeserializerBase deserializer = new BeanDeserializer(builder, beanDesc, properties, null, null, false, false);
        
        assertEquals(prop, deserializer.findProperty(PropertyName.construct("testProp")));
        assertNull(deserializer.findProperty(PropertyName.construct("nonExistentProp")));
    }

    // Mock JsonParser implementation for testing
    
    // Dummy class for property-based creator tests
    static class TestBean {
        public String name;
        public int age;
        // Constructor required for PropertyBasedCreator
        public TestBean(String name, int age) { this.name = name; this.age = age; }
    }
}





