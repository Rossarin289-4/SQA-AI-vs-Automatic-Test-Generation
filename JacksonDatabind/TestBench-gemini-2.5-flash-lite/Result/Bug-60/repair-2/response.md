```java
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated; // Added import
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanProperty; // Added import
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.NameTransformer; // Added import

public class JsonValueSerializerTest {

    // Mock class for SerializerProvider
    private static class MockSerializerProvider extends SerializerProvider {
        protected MockSerializerProvider() {
            super(null, null, null);
        }

        @Override
        public JsonSerializer<Object> findTypedValueSerializer(Class<?> type, boolean cache, BeanProperty property) {
            if (type == String.class) {
                return (JsonSerializer<Object>) new StringSerializer();
            } else if (type == Integer.class || type == int.class) {
                return (JsonSerializer<Object>) new ToStringSerializer();
            } else if (type == Boolean.class || type == boolean.class) {
                // BooleanSerializer constructor takes a JsonSerializer<?> as argument, not TypeIdResolver
                return (JsonSerializer<Object>) new BooleanSerializer(null);
            } else if (type == Double.class || type == double.class) {
                return (JsonSerializer<Object>) new ToStringSerializer();
            } else if (type == Object.class) {
                return (JsonSerializer<Object>) new ToStringSerializer();
            }
            return null;
        }

        @Override
        public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType type, BeanProperty property) {
            if (type == null) return null;
            return findTypedValueSerializer(type.getRawClass(), true, property);
        }

        @Override
        public JsonSerializer<Object> handlePrimaryContextualization(JsonSerializer<?> serializer, BeanProperty property) throws JsonMappingException {
            return (JsonSerializer<Object>) serializer;
        }

        @Override
        public boolean isEnabled(MapperFeature feature) {
            if (feature == MapperFeature.USE_STATIC_TYPING) {
                return true;
            }
            return false;
        }

        @Override
        public void defaultSerializeNull(JsonGenerator gen) throws IOException {
            gen.writeNull();
        }

        @Override
        public JavaType constructType(Type type) {
            if (type instanceof Class) {
                return SimpleType.constructUnsafe((Class<?>) type);
            }
            return null;
        }

        @Override
        public <T> T findInjectableValue(Object key, BeanDescription beanDesc, BeanProperty forProperty, Object beanInstance) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty property) throws JsonMappingException {
             return findTypedValueSerializer(type.getRawClass(), true, property);
        }

        @Override
        public JsonSerializer<Object> findValueSerializer(Class<?> type, BeanProperty property) throws JsonMappingException {
             return findTypedValueSerializer(type, true, property);
        }

        @Override
        public JsonSerializer<?> serializerInstance(Annotated annotated, Object value) {
            return (JsonSerializer<?>) value;
        }
    }

    // Mock class for BeanProperty
    private static class MockBeanProperty extends BeanProperty.Std {
        public MockBeanProperty(String name) {
            // BeanProperty.Std constructor changed, using a simpler approach.
            // It requires PropertyName, JavaType, PropertyName, Annotations, AnnotatedMember, PropertyMetadata.
            // Providing nulls for most to satisfy the constructor.
            super(new com.fasterxml.jackson.databind.PropertyName(name),
                  SimpleType.constructUnsafe(Object.class), // Dummy JavaType
                  null, null, null, null);
        }
    }

    // Mock class to simulate a bean with a @JsonValue method
    private static class MockBean {
        private String value;
        public MockBean(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    private static class MockBeanInt {
        private Integer value;
        public MockBeanInt(Integer value) { this.value = value; }
        public Integer getValue() { return value; }
    }

    private static class MockBeanBoolean {
        private Boolean value;
        public MockBeanBoolean(Boolean value) { this.value = value; }
        public Boolean getValue() { return value; }
    }

    private static class MockBeanDouble {
        private Double value;
        public MockBeanDouble(Double value) { this.value = value; }
        public Double getValue() { return value; }
    }

    private static class MockBeanNull {
        public String getValue() { return null; }
    }
    
    private static class CustomSerializer extends StdSerializer<Object> {
        protected CustomSerializer() { super(Object.class); }
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString("custom_" + value.toString());
        }
    }

    @JacksonStdImpl
    static class MockAnnotatedValueBean {
        public String getValue() { return "annotated"; }
    }

    enum MockEnum {
        VALUE1, VALUE2;
        public String getValue() { return this.name().toLowerCase(); }
    }

    private AnnotatedMethod getAnnotatedMethod(Class<?> clazz, String methodName) throws NoSuchMethodException {
        Method method = clazz.getMethod(methodName);
        return new AnnotatedMethod(null, method, null, null);
    }

    @Test
    public void testSerializeStringValue() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBean bean = new MockBean("testString");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals("\"testString\"", sw.toString());
    }

    @Test
    public void testSerializeStringValueWithCustomSerializer() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, new CustomSerializer());
        MockBean bean = new MockBean("customValue");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals("\"custom_customValue\"", sw.toString());
    }

    @Test
    public void testSerializeNullValue() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanNull.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanNull bean = new MockBeanNull();
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testSerializeIntValue() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanInt.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanInt bean = new MockBeanInt(123);
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals("123", sw.toString());
    }

    @Test
    public void testSerializeBooleanValue() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanBoolean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanBoolean bean = new MockBeanBoolean(true);
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals("true", sw.toString());
    }

    @Test
    public void testSerializeDoubleValue() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanDouble.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanDouble bean = new MockBeanDouble(45.67);
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals("45.67", sw.toString());
    }

    @Test
    public void testSerializeDoubleValueEdgeCase() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanDouble.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanDouble bean = new MockBeanDouble(Double.MAX_VALUE);
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertTrue(sw.toString().contains(String.valueOf(Double.MAX_VALUE)));
    }

    @Test
    public void testSerializeIntValueEdgeCase() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanInt.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanInt bean = new MockBeanInt(Integer.MAX_VALUE);
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals(String.valueOf(Integer.MAX_VALUE), sw.toString());
    }

    @Test
    public void testSerializeIntValueNegativeEdgeCase() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanInt.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanInt bean = new MockBeanInt(Integer.MIN_VALUE);
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals(String.valueOf(Integer.MIN_VALUE), sw.toString());
    }

    @Test
    public void testSerializeStringValueEmpty() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBean bean = new MockBean("");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer.serialize(bean, gen, provider);
        gen.close();
        assertEquals("\"\"", sw.toString());
    }
    
    @Test
    public void testCreateContextualForKnownType() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockSerializerProvider provider = new MockSerializerProvider();
        BeanProperty property = new MockBeanProperty("testProp");

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        
        assertNotNull(contextualSerializer);
        assertTrue(contextualSerializer instanceof StringSerializer || contextualSerializer instanceof ToStringSerializer);
    }

    @Test
    public void testCreateContextualWithExistingSerializer() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, new CustomSerializer());
        MockSerializerProvider provider = new MockSerializerProvider();
        BeanProperty property = new MockBeanProperty("testProp");

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        
        assertNotNull(contextualSerializer);
        assertTrue(contextualSerializer instanceof CustomSerializer);
    }
    
    @Test
    public void testSerializeWithType() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBean bean = new MockBean("typeTest");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        TypeSerializer mockTypeSer = new TypeSerializer() {
            @Override public As getTypeInclusion() { return As.PROPERTY; }
            @Override public String getPropertyName() { return "@type"; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "scalar"); }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "object"); }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "array"); }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForScalar(value, g); }
            public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForObject(value, g); }
            public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForArray(value, g); }
            @Override public void writeCustomTypePrefixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
        };
        
        serializer.serializeWithType(bean, gen, provider, mockTypeSer);
        gen.close();
        
        String result = sw.toString();
        assertTrue(result.contains("\"@type\":\"scalar\""));
        assertTrue(result.contains("\"typeTest\""));
    }

    @Test
    public void testSerializeWithTypeNullValue() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBeanNull.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBeanNull bean = new MockBeanNull();
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        TypeSerializer mockTypeSer = new TypeSerializer() {
            @Override public As getTypeInclusion() { return As.PROPERTY; }
            @Override public String getPropertyName() { return "@type"; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "scalar"); }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "object"); }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "array"); }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForScalar(value, g); }
            public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForObject(value, g); }
            public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForArray(value, g); }
            @Override public void writeCustomTypePrefixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
        };
        
        serializer.serializeWithType(bean, gen, provider, mockTypeSer);
        gen.close();
        
        assertEquals("null", sw.toString());
    }

    @Test
    public void testGetSchema() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockSerializerProvider provider = new MockSerializerProvider();
        Type typeHint = String.class;
        
        JsonNode schema = serializer.getSchema(provider, typeHint);
        
        assertNotNull(schema);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testGetSchemaWithSchemaAwareSerializer() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonSerializer<Object> schemaAwareSer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException { }
            @Override
            public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException {
                return com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode().put("description", "custom schema");
            }
        };
        JsonValueSerializer serializer = new JsonValueSerializer(am, schemaAwareSer);
        MockSerializerProvider provider = new MockSerializerProvider();
        Type typeHint = String.class;
        
        JsonNode schema = serializer.getSchema(provider, typeHint);
        
        assertNotNull(schema);
        assertEquals("custom schema", schema.get("description").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        
        JsonFormatVisitorWrapper mockVisitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
                return new JsonStringFormatVisitor.Base() {};
            }
            @Override public JsonObjectFormatVisitor expectObjectFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonArrayFormatVisitor expectArrayFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNullFormatVisitor expectNullFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonAnyFormatVisitor expectAnyFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) throws JsonMappingException { return null; }
        };
        
        JavaType typeHint = null; 
        serializer.acceptJsonFormatVisitor(mockVisitor, typeHint);
    }
    
    @Test
    public void testAcceptJsonFormatVisitorForEnum() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockEnum.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);

        final java.util.concurrent.atomic.AtomicBoolean enumTypesCalled = new java.util.concurrent.atomic.AtomicBoolean(false);
        final Set<String> capturedEnumTypes = new LinkedHashSet<>();

        JsonFormatVisitorWrapper mockVisitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
                return new JsonStringFormatVisitor.Base() {
                    @Override
                    public void enumTypes(Set<String> enums) throws JsonMappingException {
                        enumTypesCalled.set(true);
                        capturedEnumTypes.addAll(enums);
                    }
                };
            }
            @Override public JsonObjectFormatVisitor expectObjectFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonArrayFormatVisitor expectArrayFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNullFormatVisitor expectNullFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonAnyFormatVisitor expectAnyFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) throws JsonMappingException { return null; }
        };
        
        serializer.acceptJsonFormatVisitor(mockVisitor, null);

        assertTrue("enumTypes should have been called", enumTypesCalled.get());
        assertEquals(2, capturedEnumTypes.size());
        assertTrue(capturedEnumTypes.contains("value1"));
        assertTrue(capturedEnumTypes.contains("value2"));
    }

    @Test
    public void testToString() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        String expected = "(@JsonValue serializer for method " + MockBean.class.getName() + "#getValue)";
        assertEquals(expected, serializer.toString());
    }
    
    @Test
    public void testCreateContextualForFinalTypeAndStaticTyping() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override
            public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType type, BeanProperty property) {
                if (type.getRawClass() == String.class) {
                    return (JsonSerializer<Object>) new StringSerializer();
                }
                return super.findPrimaryPropertySerializer(type, property);
            }
        };
        BeanProperty property = new MockBeanProperty("testProp");
        
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        
        assertNotNull(contextualSerializer);
        assertTrue(contextualSerializer instanceof StringSerializer);
    }

    @Test
    public void testSerializeWithException() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null) {
            @Override
            public void serialize(Object bean, JsonGenerator gen, SerializerProvider prov) throws IOException {
                try {
                    throw new RuntimeException("Simulated exception from accessor method");
                } catch (Exception e) {
                    Throwable t = e;
                    while (t instanceof InvocationTargetException && t.getCause() != null) {
                        t = t.getCause();
                    }
                    if (t instanceof Error) {
                        throw (Error) t;
                    }
                    throw JsonMappingException.wrapWithPath(t, bean, _accessorMethod.getName() + "()");
                }
            }
        };
        
        MockBean bean = new MockBean("errorValue");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        try {
            serializer.serialize(bean, gen, provider);
            fail("Should have thrown JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Simulated exception from accessor method"));
            assertTrue(e.getMessage().contains("_accessorMethod.getName()"));
        } finally {
            gen.close();
        }
    }
    
    @Test
    public void testSerializeWithTypeWhenForceTypeInformationIsTrue() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null) {
            @Override
            protected boolean isNaturalTypeWithStdHandling(Class<?> rawType, JsonSerializer<?> ser) {
                return true; 
            }
        };
        
        MockBean bean = new MockBean("forceType");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        TypeSerializer mockTypeSer = new TypeSerializer() {
            @Override public As getTypeInclusion() { return As.WRAPPER_OBJECT; } 
            @Override public String getPropertyName() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "scalar"); }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "object"); }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "array"); }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForScalar(value, g); }
            public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForObject(value, g); }
            public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForArray(value, g); }
            @Override public void writeCustomTypePrefixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
        };
        
        serializer.serializeWithType(bean, gen, provider, mockTypeSer);
        gen.close();
        
        String result = sw.toString();
        assertTrue(result.contains("{\"@type\":\"scalar\"}")); 
        assertTrue(result.contains("\"forceType\"")); 
        assertTrue(result.endsWith("}")); 
    }

    @Test
    public void testWithResolvedDifferentSerializer() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer originalSerializer = new JsonValueSerializer(am, null);
        
        JsonSerializer<?> newSerializer = new StringSerializer();
        boolean newForceTypeInfo = true;
        BeanProperty property = new MockBeanProperty("resolvedProp");

        JsonValueSerializer resolvedSerializer = originalSerializer.withResolved(property, newSerializer, newForceTypeInfo);

        assertNotNull(resolvedSerializer);
        assertNotSame(originalSerializer, resolvedSerializer); 
        assertEquals(property, resolvedSerializer._property);
        assertEquals(newSerializer, resolvedSerializer._valueSerializer);
        assertEquals(newForceTypeInfo, resolvedSerializer._forceTypeInformation);
    }

    @Test
    public void testWithResolvedSameProperties() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonSerializer<?> existingSerializer = new StringSerializer();
        boolean forceTypeInfo = false;
        BeanProperty property = new MockBeanProperty("resolvedProp");
        JsonValueSerializer originalSerializer = new JsonValueSerializer(am, existingSerializer);
        originalSerializer = originalSerializer.withResolved(property, existingSerializer, forceTypeInfo); 

        JsonValueSerializer sameSerializer = originalSerializer.withResolved(property, existingSerializer, forceTypeInfo);

        assertNotNull(sameSerializer);
        assertSame(originalSerializer, sameSerializer);
    }

    @Test
    public void testSerializeWithTypeCustomPrefixScalar() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBean bean = new MockBean("customPrefixTest");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        String customTypeId = "MyScalarType";
        TypeSerializer mockTypeSer = new TypeSerializer() {
            @Override public As getTypeInclusion() { return As.PROPERTY; }
            @Override public String getPropertyName() { return "@type"; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            
            @Override
            public void writeCustomTypePrefixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {
                g.writeStartObject(); g.writeStringField("@type", typeId);
            }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws IOException { writeCustomTypePrefixForScalar(value, g, "defaultScalar"); }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "object"); }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "array"); }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForScalar(value, g); }
            public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForObject(value, g); }
            public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForArray(value, g); }
            @Override public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
        };
        
        serializer.serializeWithType(bean, gen, provider, mockTypeSer);
        gen.close();
        
        String result = sw.toString();
        assertTrue(result.contains("\"@type\":\"" + customTypeId + "\""));
        assertTrue(result.contains("\"customPrefixTest\""));
    }

    @Test
    public void testSerializeWithTypeCustomPrefixObject() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBean bean = new MockBean("customObjectPrefixTest");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        String customTypeId = "MyObjectType";
        TypeSerializer mockTypeSer = new TypeSerializer() {
            @Override public As getTypeInclusion() { return As.PROPERTY; }
            @Override public String getPropertyName() { return "@type"; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public void writeCustomTypePrefixForObject(Object value, JsonGenerator g, String typeId) throws IOException {
                g.writeStartObject(); g.writeStringField("@type", typeId);
            }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "scalar"); }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { writeCustomTypePrefixForObject(value, g, "defaultObject"); }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "array"); }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForScalar(value, g); }
            public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForObject(value, g); }
            public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForArray(value, g); }
            @Override public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
        };
        
        serializer.serializeWithType(bean, gen, provider, mockTypeSer);
        gen.close();
        
        String result = sw.toString();
        assertTrue(result.contains("\"@type\":\"" + customTypeId + "\""));
        assertTrue(result.contains("\"customObjectPrefixTest\""));
    }
    
     @Test
    public void testSerializeWithTypeCustomSuffixScalar() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBean bean = new MockBean("customSuffixTest");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        String customTypeId = "MyScalarType";
        TypeSerializer mockTypeSer = new TypeSerializer() {
            @Override public As getTypeInclusion() { return As.PROPERTY; }
            @Override public String getPropertyName() { return "@type"; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", customTypeId); }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "object"); }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "array"); }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator g) throws IOException { g.writeRaw(" customSuffix"); } 
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForScalar(value, g); }
            public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForObject(value, g); }
            public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForArray(value, g); }
            @Override public void writeCustomTypePrefixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
        };
        
        serializer.serializeWithType(bean, gen, provider, mockTypeSer);
        gen.close();
        
        String result = sw.toString();
        assertTrue(result.contains("\"@type\":\"" + customTypeId + "\""));
        assertTrue(result.contains("\"customSuffixTest\""));
        assertTrue(result.endsWith(" customSuffix")); 
    }

    @Test
    public void testSerializeWithTypeCustomSuffixObject() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockBean bean = new MockBean("customObjectSuffixTest");
        MockSerializerProvider provider = new MockSerializerProvider();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        
        String customTypeId = "MyObjectType";
        TypeSerializer mockTypeSer = new TypeSerializer() {
            @Override public As getTypeInclusion() { return As.PROPERTY; }
            @Override public String getPropertyName() { return "@type"; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "scalar"); }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", customTypeId); }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator g) throws IOException { g.writeStartObject(); g.writeStringField("@type", "array"); }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator g) throws IOException { g.writeRaw(" customObjectSuffix"); } 
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator g) throws IOException { g.writeEndObject(); }
            public void writeTypePrefixForScalar(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForScalar(value, g); }
            public void writeTypePrefixForObject(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForObject(value, g); }
            public void writeTypePrefixForArray(Object value, JsonGenerator g, Class<?> type) throws IOException { writeTypePrefixForArray(value, g); }
            @Override public void writeCustomTypePrefixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypePrefixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForObject(Object value, JsonGenerator g, String typeId) throws IOException {}
            @Override public void writeCustomTypeSuffixForArray(Object value, JsonGenerator g, String typeId) throws IOException {}
        };
        
        serializer.serializeWithType(bean, gen, provider, mockTypeSer);
        gen.close();
        
        String result = sw.toString();
        assertTrue(result.contains("\"@type\":\"" + customTypeId + "\""));
        assertTrue(result.contains("\"customObjectSuffixTest\""));
        assertTrue(result.endsWith(" customObjectSuffix")); 
    }
    
    @Test
    public void testCreateContextualForEnumWithStaticTyping() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockEnum.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override
            public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType type, BeanProperty property) {
                if (type.getRawClass() == String.class) {
                    return (JsonSerializer<Object>) new StringSerializer();
                }
                return super.findPrimaryPropertySerializer(type, property);
            }
        };
        BeanProperty property = new MockBeanProperty("enumProp");

        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        
        assertNotNull(contextualSerializer);
        assertTrue(contextualSerializer instanceof StringSerializer || contextualSerializer instanceof ToStringSerializer);
    }
    
    @Test
    public void testAcceptJsonFormatVisitorForString() throws Exception {
        AnnotatedMethod am = getAnnotatedMethod(MockBean.class, "getValue");
        JsonValueSerializer serializer = new JsonValueSerializer(am, null);
        
        final java.util.concurrent.atomic.AtomicBoolean stringFormatCalled = new java.util.concurrent.atomic.AtomicBoolean(false);
        
        JsonFormatVisitorWrapper mockVisitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
                stringFormatCalled.set(true);
                return new JsonStringFormatVisitor.Base() {};
            }
            @Override public JsonObjectFormatVisitor expectObjectFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonArrayFormatVisitor expectArrayFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNullFormatVisitor expectNullFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonAnyFormatVisitor expectAnyFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) throws JsonMappingException { return null; }
        };
        
        serializer.acceptJsonFormatVisitor(mockVisitor, null);
        assertTrue("expectStringFormat should have been called", stringFormatCalled.get());
    }
}
```