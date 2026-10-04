package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;

public class AnyGetterWriterTest {
    // Helper to create a dummy BeanProperty
    private BeanProperty createDummyProperty() {
        return new BeanProperty.Std(new PropertyName("dummy"), TypeFactory.defaultInstance().constructType(Object.class), null, null, null, PropertyMetadata.STD_OPTIONAL);
    }

    // Helper to create a dummy AnnotatedMember
    private AnnotatedMember createDummyAccessor() {
        // Using a simple dummy class and method for demonstration
        class DummyBean {
            public Map<String, String> getAny() { return Collections.emptyMap(); }
        }
        AnnotatedClass ac = AnnotatedClass.construct(DummyBean.class, null, null);
        // Find the specific method to avoid issues with method order
        AnnotatedMethod am = null;
        for (Method m : DummyBean.class.getMethods()) {
            if ("getAny".equals(m.getName())) {
                am = new AnnotatedMethod(ac, m, null, null);
                break;
            }
        }
        if (am == null) {
            throw new IllegalStateException("Could not find getAny method in DummyBean");
        }
        return am;
    }

    // Helper to create a dummy SerializerProvider
    private SerializerProvider createDummyProvider() throws JsonMappingException {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.getSerializerProviderInstance();
    }

    // Helper to create a dummy JsonGenerator
    private JsonGenerator createDummyGenerator() throws IOException {
        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        return jf.createGenerator(sw);
    }

    @Test
    public void testGetAndSerialize_nullValue() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> serializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, serializer);

        Object bean = new Object() {
            public Map<String, String> getAny() { return null; }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        assertEquals("", sw.toString());
    }

    @Test
    public void testGetAndSerialize_nonMapValue() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> serializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, serializer);

        Object bean = new Object() {
            public String getAny() { return "not a map"; }
        };

        JsonGenerator gen = createDummyGenerator();
        SerializerProvider provider = createDummyProvider();

        try {
            writer.getAndSerialize(bean, gen, provider);
            fail("Expected JsonMappingException for non-Map value");
        } catch (JsonMappingException expected) {
            assertTrue(expected.getMessage().contains("not java.util.Map"));
        } finally {
            gen.close();
        }
    }

    @Test
    public void testGetAndSerialize_emptyMap() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> serializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, serializer);

        Object bean = new Object() {
            public Map<String, String> getAny() { return Collections.emptyMap(); }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        assertEquals("", sw.toString());
    }

    @Test
    public void testGetAndSerialize_mapWithValueSerializer() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        MapSerializer mapSerializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, mapSerializer);

        Object bean = new Object() {
            public Map<String, String> getAny() {
                Map<String, String> map = new HashMap<>();
                map.put("a", "1");
                map.put("b", "2");
                return map;
            }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        String output = sw.toString();
        assertTrue(output.contains("\"a\":\"1\""));
        assertTrue(output.contains("\"b\":\"2\""));
    }

    @Test
    public void testGetAndSerialize_withMapSerializerInstance() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        MapSerializer mapSerializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, mapSerializer);

        Object bean = new Object() {
            public Map<String, Integer> getAny() {
                Map<String, Integer> map = new HashMap<>();
                map.put("count", 100);
                return map;
            }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        assertTrue(sw.toString().contains("\"count\":100"));
    }

    @Test
    public void testGetAndFilter_nullValue() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> serializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, serializer);

        Object bean = new Object() {
            public Map<String, String> getAny() { return null; }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();
        PropertyFilter filter = new MockPropertyFilter();

        writer.getAndFilter(bean, gen, provider, filter);
        gen.close();
        assertEquals("", sw.toString());
    }

    @Test
    public void testGetAndFilter_nonMapValue() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> serializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, serializer);

        Object bean = new Object() {
            public String getAny() { return "not a map"; }
        };

        JsonGenerator gen = createDummyGenerator();
        SerializerProvider provider = createDummyProvider();
        PropertyFilter filter = new MockPropertyFilter();

        try {
            writer.getAndFilter(bean, gen, provider, filter);
            fail("Expected JsonMappingException for non-Map value");
        } catch (JsonMappingException expected) {
            assertTrue(expected.getMessage().contains("not java.util.Map"));
        } finally {
            gen.close();
        }
    }

    @Test
    public void testGetAndFilter_emptyMap() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> serializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, serializer);

        Object bean = new Object() {
            public Map<String, String> getAny() { return Collections.emptyMap(); }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();
        PropertyFilter filter = new MockPropertyFilter();

        writer.getAndFilter(bean, gen, provider, filter);
        gen.close();
        assertEquals("", sw.toString());
    }

    @Test
    public void testGetAndFilter_mapWithValueSerializer() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> mapSerializer = MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, mapSerializer);

        Object bean = new Object() {
            public Map<String, String> getAny() {
                Map<String, String> map = new HashMap<>();
                map.put("a", "1");
                map.put("b", "2");
                return map;
            }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();
        
        MockPropertyFilter filter = new MockPropertyFilter();
        filter.includeField = false; // Initially exclude all fields

        // We need a way to control which fields are filtered by MockPropertyFilter
        // For this test, we'll simulate filtering by only writing 'a'
        filter.setFieldWriter((value, gen1) -> {
            if ("a".equals(filter.capturedFieldName)) {
                gen1.writeStringField(filter.capturedFieldName, (String) value);
            }
        });

        writer.getAndFilter(bean, gen, provider, filter);
        gen.close();
        String output = sw.toString();
        assertTrue(output.contains("\"a\":\"1\""));
        assertFalse(output.contains("\"b\":\"2\""));
    }

    @Test
    public void testResolve_withContextualSerializer() throws Exception {
        // Mock a ContextualSerializer
        JsonSerializer<Object> contextualSerializer = new MockContextualSerializer("contextual_resolved");
        
        AnnotatedMember accessor = createDummyAccessor();
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, contextualSerializer);

        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        writer.resolve(provider);

        Object bean = new Object() {
            public Map<String, String> getAny() {
                Map<String, String> map = new HashMap<>();
                map.put("key", "value");
                return map;
            }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        assertTrue(sw.toString().contains("contextual_resolved"));
    }


    @Test
    public void testResolve_withMapSerializerAsContextualSerializer() throws Exception {
        // Mock a ContextualSerializer that is also a MapSerializer
        class MockMapContextualSerializer extends MockContextualSerializer implements ContextualSerializer {
            public MockMapContextualSerializer(String resolvedValue) {
                super(resolvedValue);
            }

            @Override
            public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException {
                return MapSerializer.construct(null, TypeFactory.defaultInstance().constructType(Map.class), false, null, null, null, null);
            }
        }

        AnnotatedMember accessor = createDummyAccessor();
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, new MockMapContextualSerializer("mock_map_serializer"));

        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        writer.resolve(provider);

        Object bean = new Object() {
            public Map<String, String> getAny() {
                Map<String, String> map = new HashMap<>();
                map.put("key1", "value1");
                return map;
            }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        assertTrue(sw.toString().contains("\"key1\":\"value1\""));
    }

    @Test
    public void testResolve_withNonMapSerializer() throws Exception {
        JsonSerializer<Object> simpleSerializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString("simple");
            }
        };

        AnnotatedMember accessor = createDummyAccessor();
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, simpleSerializer);

        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        writer.resolve(provider);

        Object bean = new Object() {
            public Map<String, String> getAny() {
                Map<String, String> map = new HashMap<>();
                map.put("key", "value");
                return map;
            }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        assertTrue(sw.toString().contains("simple"));
    }

    @Test
    public void testCreateSerializer_forSimpleMap() throws Exception {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JavaType mapType = TypeFactory.defaultInstance().constructType(Map.class);
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        JsonSerializer<?> serializer = factory.createSerializer(provider, mapType);
        assertTrue(serializer instanceof MapSerializer);
    }

    @Test
    public void testFindBeanSerializer_forSimpleBean() throws Exception {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JavaType beanType = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(beanType);
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        JsonSerializer<?> serializer = factory.findBeanSerializer(provider, beanType, beanDesc);
        assertTrue(serializer instanceof BeanSerializer);
    }

    @Test
    public void testFindBeanSerializer_forNonBeanType() throws Exception {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription stringDesc = mapper.getSerializationConfig().introspect(stringType);
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        JsonSerializer<?> serializer = factory.findBeanSerializer(provider, stringType, stringDesc);
        assertNull(serializer);
    }

    @Test
    public void testFindPropertyTypeSerializer_withAnnotation() throws Exception {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        AnnotatedMember dummyAccessor = createDummyAccessor();
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        TypeSerializer typeSerializer = factory.findPropertyTypeSerializer(baseType, config, dummyAccessor);
        // The exact type of TypeSerializer depends on configuration and annotations.
        // For this basic setup, it might be null or a default type serializer.
        // We assert that it's not an error and can be handled.
        assertNotNull(typeSerializer); 
    }

    @Test
    public void testFindPropertyContentTypeSerializer_withAnnotation() throws Exception {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        AnnotatedMember dummyAccessor = createDummyAccessor();
        JavaType containerType = TypeFactory.defaultInstance().constructType(List.class);
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        TypeSerializer typeSerializer = factory.findPropertyContentTypeSerializer(containerType, config, dummyAccessor);
        assertNotNull(typeSerializer);
    }

    @Test
    public void testGetAndSerialize_withCustomSerializerSetInConstructor() throws Exception {
        AnnotatedMember accessor = createDummyAccessor();
        JsonSerializer<Object> customSerializer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString("custom_serialization_in_constructor");
            }
        };
        AnyGetterWriter writer = new AnyGetterWriter(createDummyProperty(), accessor, customSerializer);

        Object bean = new Object() {
            public Map<String, String> getAny() {
                Map<String, String> map = new HashMap<>();
                map.put("key", "value");
                return map;
            }
        };

        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator gen = jf.createGenerator(sw);
        SerializerProvider provider = createDummyProvider();

        writer.getAndSerialize(bean, gen, provider);
        gen.close();
        assertTrue(sw.toString().contains("custom_serialization_in_constructor"));
    }

    // Dummy classes for testing BeanSerializerFactory
    private static class SimpleBean {
        public String getName() { return "test"; }
        public int getAge() { return 30; }
    }

    // Mock PropertyFilter (interface only, as per typical Jackson usage)
    public interface PropertyFilter {
        void serializeAsField(Object value, JsonGenerator gen, SerializerProvider provider, String fieldName) throws IOException;
        void include(Object value, JsonGenerator gen, SerializerProvider provider, String fieldName) throws IOException;
        void exclude(Object value, JsonGenerator gen, SerializerProvider provider, String fieldName) throws IOException;
    }

    // Mock PropertyFilter implementation for tests
    private static class MockPropertyFilter implements PropertyFilter {
        public boolean includeField = true;
        public String capturedFieldName = null;
        public Object capturedValue = null;
        private java.util.function.BiConsumer<Object, JsonGenerator> fieldWriter;

        public MockPropertyFilter() {
            this.fieldWriter = (value, gen) -> {
                // Default writer if not set, handles basic types
                if (value instanceof String) {
                    gen.writeString((String) value);
                } else if (value instanceof Number) {
                    gen.writeNumber(value.toString());
                } else {
                    gen.writeObject(value); // Fallback
                }
            };
        }

        // Allow customizing the field writer for specific tests
        public void setFieldWriter(java.util.function.BiConsumer<Object, JsonGenerator> fieldWriter) {
            this.fieldWriter = fieldWriter;
        }

        @Override
        public void serializeAsField(Object value, JsonGenerator gen, SerializerProvider provider, String fieldName) throws IOException {
            if (includeField) {
                this.capturedFieldName = fieldName;
                this.capturedValue = value;
                gen.writeFieldName(fieldName); // Write field name first
                fieldWriter.accept(value, gen);
            }
        }

        @Override
        public void include(Object value, JsonGenerator gen, SerializerProvider provider, String fieldName) {}
        @Override
        public void exclude(Object value, JsonGenerator gen, SerializerProvider provider, String fieldName) {}
    }
    
    // Mock ContextualSerializer
    private static class MockContextualSerializer extends JsonSerializer<Object> implements ContextualSerializer {
        protected final String resolvedValue;

        public MockContextualSerializer(String resolvedValue) {
            this.resolvedValue = resolvedValue;
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(resolvedValue);
        }

        @Override
        public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException {
            return new JsonSerializer<Object>() {
                @Override
                public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                    gen.writeString(resolvedValue);
                }
            };
        }
    }
}
