```java
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class NumberSerializersTest {

    // Dummy SerializerProvider for tests
    private static class DummySerializerProvider extends SerializerProvider {
        private static final long serialVersionUID = 1L;

        protected DummySerializerProvider() {
            super(null); // null for BeanSerializerFactory
        }

        @Override
        public JsonSerializer<Object> findValueSerializer(Class<?> valueType, BeanProperty property) throws JsonMappingException {
            // Basic stub for common types, enough for these tests
            if (valueType == Integer.class || valueType == int.class) return (JsonSerializer<Object>) new NumberSerializers.IntegerSerializer();
            if (valueType == Short.class || valueType == short.class) return (JsonSerializer<Object>) new NumberSerializers.ShortSerializer();
            if (valueType == Long.class || valueType == long.class) return (JsonSerializer<Object>) new NumberSerializers.LongSerializer();
            if (valueType == Float.class || valueType == float.class) return (JsonSerializer<Object>) new NumberSerializers.FloatSerializer();
            if (valueType == Double.class || valueType == double.class) return (JsonSerializer<Object>) new NumberSerializers.DoubleSerializer();
            if (valueType == Byte.class || valueType == byte.class) return (JsonSerializer<Object>) new NumberSerializers.IntLikeSerializer();
            return null;
        }
        
        @Override
        public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty property) throws JsonMappingException {
            return null;
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return AnnotationIntrospector.nopInstance();
        }

        @Override
        public TypeFactory getTypeFactory() {
            return TypeFactory.defaultInstance();
        }
        
        @Override
        public boolean isEnabled(MapperFeature f) { return false; }
        
        @Override
        public boolean isEnabled(SerializationFeature f) { return false; }

        @Override
        public JsonFormat.Value getDefaultPropertyFormat(JavaType type) {
            return JsonFormat.Value.empty();
        }

        @Override
        public Object getAttribute(Object key) {
            return null;
        }
        
        @Override
        public JsonNode getNodeFactory() {
            return null; // Not needed
        }

        @Override
        public TypeIdResolver getTypeIdResolver(JavaType type) {
            return null; // Not needed
        }
        
        @Override
        protected JsonSerializer<Object> _findkrétSerializer(LogicalType logicalType, JavaType type, BeanProperty property) throws JsonMappingException {
            return null;
        }

        @Override
        public <T> T findInjectableValue(Object key, BeanProperty forProperty, Object beanInstance) throws JsonMappingException {
            return null;
        }

        @Override
        public BeanDescription getContextual(JavaType sourceType, BeanProperty property) throws JsonMappingException {
            return null;
        }
        
        @Override
        public JavaType constructType(Type type) {
            return getTypeFactory().constructType(type);
        }

        @Override
        public boolean hasSerializerFor(LogicalType type, Class<?> valueClass) {
            return false;
        }

        @Override
        public JavaType getActiveView() {
            return null;
        }
        
        @Override
        public PropertySerializerMap getSerializerMap(LogicalType type) {
            return PropertySerializerMap.emptyForTransient();
        }

        @Override
        public <T> T findInjectableValue(Object valueKey, BeanProperty forProperty, Object beanInstance, InjectionKey key) throws JsonMappingException {
            return null;
        }

        @Override
        public BeanDescription getBeanDescription(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public Object getFactory() {
            return null;
        }

        @Override
        public Object getObjectIdMapper(JavaType type) throws JsonMappingException {
            return null;
        }

        @Override
        public void verifyValueSchema(Object valueToSchema) throws JsonMappingException {
        }

        @Override
        public TypeIdResolver getTypeIdResolver(JavaType type, JsonSerializer<?> serializer) throws JsonMappingException {
            return null;
        }

        @Override
        public void setAttribute(Object key, Object value) {
        }

        @Override
        public JavaType constructType(java.lang.reflect.Type rawType, com.fasterxml.jackson.databind.type.TypeBindings bindings) {
            return getTypeFactory().constructType(rawType, bindings);
        }
    }

    // Dummy JsonGenerator for tests
    private static class DummyJsonGenerator extends JsonGenerator.Base {
        private StringBuilder sb = new StringBuilder();

        @Override
        public void writeStartObject() throws IOException { sb.append("{"); }
        @Override
        public void writeEndObject() throws IOException { sb.append("}"); }
        @Override
        public void writeFieldName(String name) throws IOException { sb.append("\"").append(name).append("\":"); }
        @Override
        public void writeString(String value) throws IOException { sb.append("\"").append(value).append("\""); }
        @Override
        public void writeNumber(short value) throws IOException { sb.append(value); }
        @Override
        public void writeNumber(int value) throws IOException { sb.append(value); }
        @Override
        public void writeNumber(long value) throws IOException { sb.append(value); }
        @Override
        public void writeNumber(float value) throws IOException { sb.append(value); }
        @Override
        public void writeNumber(double value) throws IOException { sb.append(value); }
        @Override
        public void writeNumber(String value) throws IOException { sb.append(value); }
        @Override
        public void writeBoolean(boolean value) throws IOException { sb.append(value); }
        @Override
        public void writeNull() throws IOException { sb.append("null"); }
        @Override
        public void writeStartArray() throws IOException { sb.append("["); }
        @Override
        public void writeEndArray() throws IOException { sb.append("]"); }
        @Override
        public void writeRaw(String text) throws IOException { sb.append(text); }
        @Override
        public void writeRawValue(String text) throws IOException { sb.append(text); }
        @Override
        public void writeObjectRef(Object pojo) throws IOException { sb.append("REF(").append(pojo).append(")"); }
        @Override
        public void writeTypeId(Object id) throws IOException { sb.append("TYPEID(").append(id).append(")"); }
        @Override
        public void flush() throws IOException {}
        @Override
        public void close() throws IOException {}
        @Override
        public boolean isClosed() { return false; }
        @Override
        public JsonGenerator enable(Feature f) { return this; }
        @Override
        public JsonGenerator disable(Feature f) { return this; }
        @Override
        public boolean isEnabled(Feature f) { return false; }
        @Override
        public JsonStreamContext getOutputContext() { return null; }

        public String getText() { return sb.toString(); }
    }

    // Mock JsonFormatVisitorWrapper for testing acceptJsonFormatVisitor
    private static class MockJsonFormatVisitorWrapper extends JsonFormatVisitorWrapper.Base {
        private JsonParser.NumberType numberType;
        private String schemaType;

        public MockJsonFormatVisitorWrapper(SerializerProvider provider) {
            super(provider);
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException {
            return new JsonIntegerFormatVisitor.Base(provider) {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    MockJsonFormatVisitorWrapper.this.numberType = type;
                }
            };
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException {
            return new JsonNumberFormatVisitor.Base(provider) {
                @Override
                public void numberType(JsonParser.NumberType type) {
                    MockJsonFormatVisitorWrapper.this.numberType = type;
                }
            };
        }

        public JsonParser.NumberType getNumberType() { return numberType; }
        public String getSchemaType() { return schemaType; }
    }

    // Test for addAll method
    @Test
    public void testAddAll() {
        Map<String, JsonSerializer<?>> serializers = new HashMap<>();
        NumberSerializers.addAll(serializers);

        assertTrue(serializers.containsKey(Integer.class.getName()));
        assertTrue(serializers.containsKey(Integer.TYPE.getName()));
        assertTrue(serializers.containsKey(Long.class.getName()));
        assertTrue(serializers.containsKey(Long.TYPE.getName()));
        assertTrue(serializers.containsKey(Byte.class.getName()));
        assertTrue(serializers.containsKey(Byte.TYPE.getName()));
        assertTrue(serializers.containsKey(Short.class.getName()));
        assertTrue(serializers.containsKey(Short.TYPE.getName()));
        assertTrue(serializers.containsKey(Float.class.getName()));
        assertTrue(serializers.containsKey(Float.TYPE.getName()));
        assertTrue(serializers.containsKey(Double.class.getName()));
        assertTrue(serializers.containsKey(Double.TYPE.getName()));
    }

    // Test for ShortSerializer.serialize
    @Test
    public void testShortSerialize() throws IOException {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        short value = 123;
        serializer.serialize(value, generator, provider);
        assertEquals("123", generator.getText());
    }

    // Test for ShortSerializer.isEmpty
    @Test
    public void testShortIsEmpty() {
        NumberSerializers.ShortSerializer serializer = new NumberSerializers.ShortSerializer();
        SerializerProvider provider = new DummySerializerProvider();
        assertTrue(serializer.isEmpty(provider, (short) 0));
        assertFalse(serializer.isEmpty(provider, (short) 1));
    }

    // Test for IntegerSerializer.serialize
    @Test
    public void testIntegerSerialize() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        int value = 456;
        serializer.serialize(value, generator, provider);
        assertEquals("456", generator.getText());
    }

    // Test for IntegerSerializer.serializeWithType
    @Test
    public void testIntegerSerializeWithType() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        TypeSerializer typeSer = null; // Not used in this implementation
        int value = 789;
        serializer.serializeWithType(value, generator, provider, typeSer);
        assertEquals("789", generator.getText());
    }

    // Test for IntegerSerializer.isEmpty
    @Test
    public void testIntegerIsEmpty() {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        SerializerProvider provider = new DummySerializerProvider();
        assertTrue(serializer.isEmpty(provider, 0));
        assertFalse(serializer.isEmpty(provider, 1));
    }

    // Test for IntLikeSerializer.serialize
    @Test
    public void testIntLikeSerialize() throws IOException {
        NumberSerializers.IntLikeSerializer serializer = NumberSerializers.IntLikeSerializer.instance;
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        Number value = Integer.valueOf(1000);
        serializer.serialize(value, generator, provider);
        assertEquals("1000", generator.getText());
    }

    // Test for IntLikeSerializer.isEmpty
    @Test
    public void testIntLikeIsEmpty() {
        NumberSerializers.IntLikeSerializer serializer = NumberSerializers.IntLikeSerializer.instance;
        SerializerProvider provider = new DummySerializerProvider();
        assertTrue(serializer.isEmpty(provider, Integer.valueOf(0)));
        assertFalse(serializer.isEmpty(provider, Integer.valueOf(1)));
    }

    // Test for LongSerializer.serialize
    @Test
    public void testLongSerialize() throws IOException {
        NumberSerializers.LongSerializer serializer = NumberSerializers.LongSerializer.instance;
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        long value = 123456789L;
        serializer.serialize(value, generator, provider);
        assertEquals("123456789", generator.getText());
    }

    // Test for LongSerializer.isEmpty
    @Test
    public void testLongIsEmpty() {
        NumberSerializers.LongSerializer serializer = NumberSerializers.LongSerializer.instance;
        SerializerProvider provider = new DummySerializerProvider();
        assertTrue(serializer.isEmpty(provider, 0L));
        assertFalse(serializer.isEmpty(provider, 1L));
    }

    // Test for FloatSerializer.serialize
    @Test
    public void testFloatSerialize() throws IOException {
        NumberSerializers.FloatSerializer serializer = NumberSerializers.FloatSerializer.instance;
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        float value = 3.14159f;
        serializer.serialize(value, generator, provider);
        assertEquals("3.14159", generator.getText());
    }

    // Test for FloatSerializer.isEmpty
    @Test
    public void testFloatIsEmpty() {
        NumberSerializers.FloatSerializer serializer = NumberSerializers.FloatSerializer.instance;
        SerializerProvider provider = new DummySerializerProvider();
        assertTrue(serializer.isEmpty(provider, 0.0f));
        assertFalse(serializer.isEmpty(provider, 1.0f));
    }

    // Test for DoubleSerializer.serialize
    @Test
    public void testDoubleSerialize() throws IOException {
        NumberSerializers.DoubleSerializer serializer = NumberSerializers.DoubleSerializer.instance;
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        double value = 2.718281828459045d;
        serializer.serialize(value, generator, provider);
        assertEquals("2.718281828459045", generator.getText());
    }

    // Test for DoubleSerializer.serializeWithType
    @Test
    public void testDoubleSerializeWithType() throws IOException {
        NumberSerializers.DoubleSerializer serializer = NumberSerializers.DoubleSerializer.instance;
        DummyJsonGenerator generator = new DummyJsonGenerator();
        SerializerProvider provider = new DummySerializerProvider();
        TypeSerializer typeSer = null; // Not used in this implementation
        double value = 1.618033988749895d;
        serializer.serializeWithType(value, generator, provider, typeSer);
        assertEquals("1.618033988749895", generator.getText());
    }

    // Test for DoubleSerializer.isEmpty
    @Test
    public void testDoubleIsEmpty() {
        NumberSerializers.DoubleSerializer serializer = NumberSerializers.DoubleSerializer.instance;
        SerializerProvider provider = new DummySerializerProvider();
        assertTrue(serializer.isEmpty(provider, 0.0d));
        assertFalse(serializer.isEmpty(provider, 1.0d));
    }

    // Test for Base.acceptJsonFormatVisitor (IntegerSerializer)
    @Test
    public void testBaseAcceptJsonFormatVisitorInteger() throws IOException, JsonMappingException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        SerializerProvider provider = new DummySerializerProvider();
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Integer.class);
        
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        
        assertEquals(JsonParser.NumberType.INT, visitor.getNumberType());
    }

    // Test for Base.acceptJsonFormatVisitor (DoubleSerializer)
    @Test
    public void testBaseAcceptJsonFormatVisitorDouble() throws IOException, JsonMappingException {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        SerializerProvider provider = new DummySerializerProvider();
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper(provider);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(Double.class);
        
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        
        assertEquals(JsonParser.NumberType.DOUBLE, visitor.getNumberType());
    }
    
    // Test for Base.createContextual with JsonFormat.Shape.STRING
    @Test
    public void testContextualSerializerWithStringShape() throws Exception {
        SerializerProvider provider = new DummySerializerProvider() {
             @Override
             public JsonSerializer<Object> findValueSerializer(Class<?> valueType, BeanProperty property) throws JsonMappingException {
                 if (valueType == String.class) {
                     return (JsonSerializer<Object>) ToStringSerializer.instance;
                 }
                 return super.findValueSerializer(valueType, property);
             }
        };

        AnnotationIntrospector mockAnnotationIntrospector = new AnnotationIntrospector.nopInstance() {
            @Override
            public JsonFormat.Value findFormat(AnnotatedMember member) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
            }
        };
        
        SerializerProvider mockProviderWithAnnotation = new SerializerProvider() {
            private static final long serialVersionUID = 1L;
            @Override
            public AnnotationIntrospector getAnnotationIntrospector() {
                return mockAnnotationIntrospector;
            }
             @Override
            public JsonSerializer<Object> findValueSerializer(Class<?> valueType, BeanProperty property) throws JsonMappingException {
                if (valueType == String.class) {
                    return (JsonSerializer<Object>) ToStringSerializer.instance;
                }
                return null; // For other types
            }
            @Override
            public JavaType constructType(Type type) { return TypeFactory.defaultInstance().constructType(type); }
            @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
            @Override public boolean isEnabled(MapperFeature f) { return false; }
            @Override public boolean isEnabled(SerializationFeature f) { return false; }
            @Override public JsonFormat.Value getDefaultPropertyFormat(JavaType type) { return JsonFormat.Value.empty(); }
            @Override public Object getAttribute(Object key) { return null; }
            @Override public JsonNode getNodeFactory() { return null; }
            @Override public TypeIdResolver getTypeIdResolver(JavaType type) { return null; }
            @Override protected JsonSerializer<Object> _findkrétSerializer(LogicalType logicalType, JavaType type, BeanProperty property) throws JsonMappingException { return null; }
            @Override public <T> T findInjectableValue(Object key, BeanProperty forProperty, Object beanInstance) throws JsonMappingException { return null; }
            @Override public BeanDescription getContextual(JavaType sourceType, BeanProperty property) throws JsonMappingException { return null; }
            @Override public PropertySerializerMap getSerializerMap(LogicalType type) { return PropertySerializerMap.emptyForTransient(); }
            @Override public JavaType getActiveView() { return null;}
            @Override public boolean hasSerializerFor(LogicalType type, Class<?> valueClass) { return false;}
            @Override public JavaType getContextualType() { return null;}
            @Override public <T> T findInjectableValue(Object valueKey, BeanProperty forProperty, Object beanInstance, InjectionKey key) throws JsonMappingException { return null; }
            @Override public BeanDescription getBeanDescription(JavaType type) throws JsonMappingException { return null; }
            @Override public Object getFactory() { return null; }
            @Override public Object getObjectIdMapper(JavaType type) throws JsonMappingException { return null; }
            @Override public void verifyValueSchema(Object valueToSchema) throws JsonMappingException { }
            @Override public TypeIdResolver getTypeIdResolver(JavaType type, JsonSerializer<?> serializer) throws JsonMappingException { return null; }
            @Override public void setAttribute(Object key, Object value) { }
            @Override public JavaType constructType(java.lang.reflect.Type rawType, com.fasterxml.jackson.databind.type.TypeBindings bindings) { return TypeFactory.defaultInstance().constructType(rawType, bindings); }
        };

        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        
        AnnotatedMember mockMember = new AnnotatedMember(null, null) {
            @Override public Class<?> getDeclaringClass() { return Integer.class; }
            @Override public java.lang.reflect.Member getMember() { return null; }
            @Override public void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException {}
            @Override public Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException { return null; }
        };

        BeanProperty mockProperty = new BeanProperty.Std(
            PropertyName.construct("testProperty"),
            null,
            null,
            mockMember,
            PropertyMetadata.STD_OPTIONAL,
            null,
            null,
            null,
            null,
            JsonFormat.Value.forShape(JsonFormat.Shape.STRING),
            null
        );
        
        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProviderWithAnnotation, mockProperty);
        
        assertTrue(contextualSerializer instanceof ToStringSerializer);
    }
    
    // Test for Base.createContextual with no special JsonFormat
    @Test
    public void testContextualSerializerNoFormat() throws Exception {
        SerializerProvider provider = new DummySerializerProvider();

        AnnotationIntrospector defaultAnnotationIntrospector = new AnnotationIntrospector.nopInstance() {
            @Override
            public JsonFormat.Value findFormat(AnnotatedMember member) {
                return JsonFormat.Value.empty();
            }
        };
        SerializerProvider mockProviderWithNoAnnotation = new SerializerProvider() {
            private static final long serialVersionUID = 1L;
            @Override
            public AnnotationIntrospector getAnnotationIntrospector() {
                return defaultAnnotationIntrospector;
            }
             @Override
            public JsonSerializer<Object> findValueSerializer(Class<?> valueType, BeanProperty property) throws JsonMappingException { return null; }
            @Override
            public JavaType constructType(Type type) { return TypeFactory.defaultInstance().constructType(type); }
            @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
            @Override public boolean isEnabled(MapperFeature f) { return false; }
            @Override public boolean isEnabled(SerializationFeature f) { return false; }
            @Override public JsonFormat.Value getDefaultPropertyFormat(JavaType type) { return JsonFormat.Value.empty(); }
            @Override public Object getAttribute(Object key) { return null; }
            @Override public JsonNode getNodeFactory() { return null; }
             @Override
            public TypeIdResolver getTypeIdResolver(JavaType type) { return null; }
            @Override protected JsonSerializer<Object> _findkrétSerializer(LogicalType logicalType, JavaType type, BeanProperty property) throws JsonMappingException { return null; }
            @Override public <T> T findInjectableValue(Object key, BeanProperty forProperty, Object beanInstance) throws JsonMappingException { return null; }
            @Override public BeanDescription getContextual(JavaType sourceType, BeanProperty property) throws JsonMappingException { return null; }
            @Override public PropertySerializerMap getSerializerMap(LogicalType type) { return PropertySerializerMap.emptyForTransient(); }
            @Override public JavaType getActiveView() { return null;}
            @Override public boolean hasSerializerFor(LogicalType type, Class<?> valueClass) { return false;}
            @Override public JavaType getContextualType() { return null;}
            @Override public <T> T findInjectableValue(Object valueKey, BeanProperty forProperty, Object beanInstance, InjectionKey key) throws JsonMappingException { return null; }
            @Override public BeanDescription getBeanDescription(JavaType type) throws JsonMappingException { return null; }
            @Override public Object getFactory() { return null; }
            @Override public Object getObjectIdMapper(JavaType type) throws JsonMappingException { return null; }
            @Override public void verifyValueSchema(Object valueToSchema) throws JsonMappingException { }
            @Override public TypeIdResolver getTypeIdResolver(JavaType type, JsonSerializer<?> serializer) throws JsonMappingException { return null; }
            @Override public void setAttribute(Object key, Object value) { }
            @Override public JavaType constructType(java.lang.reflect.Type rawType, com.fasterxml.jackson.databind.type.TypeBindings bindings) { return TypeFactory.defaultInstance().constructType(rawType, bindings); }
        };

        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        
        AnnotatedMember mockMember = new AnnotatedMember(null, null) {
            @Override public Class<?> getDeclaringClass() { return Integer.class; }
            @Override public java.lang.reflect.Member getMember() { return null; }
            @Override public void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException {}
            @Override public Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException { return null; }
        };

        BeanProperty mockProperty = new BeanProperty.Std(
            PropertyName.construct("defaultProperty"),
            null,
            null,
            mockMember,
            PropertyMetadata.STD_OPTIONAL,
            null,
            null,
            null,
            null,
            JsonFormat.Value.empty(),
            null
        );
        
        JsonSerializer<?> contextualSerializer = serializer.createContextual(mockProviderWithNoAnnotation, mockProperty);
        
        assertTrue(contextualSerializer == serializer); 
    }

    // Test for Base.getSchema
    @Test
    public void testBaseGetSchema() throws IOException {
        NumberSerializers.IntegerSerializer serializer = new NumberSerializers.IntegerSerializer();
        SerializerProvider provider = new DummySerializerProvider();
        Type typeHint = Integer.class;
        
        JsonNode schemaNode = serializer.getSchema(provider, typeHint);
        
        assertNotNull(schemaNode);
        assertTrue(schemaNode.isObject());
        assertEquals("integer", schemaNode.get("type").asText());
        assertTrue(schemaNode.get("required").asBoolean());
    }
    
    // Test for Base.getSchema (DoubleSerializer)
    @Test
    public void testBaseGetSchemaDouble() throws IOException {
        NumberSerializers.DoubleSerializer serializer = new NumberSerializers.DoubleSerializer();
        SerializerProvider provider = new DummySerializerProvider();
        Type typeHint = Double.class;
        
        JsonNode schemaNode = serializer.getSchema(provider, typeHint);
        
        assertNotNull(schemaNode);
        assertTrue(schemaNode.isObject());
        assertEquals("number", schemaNode.get("type").asText());
        assertTrue(schemaNode.get("required").asBoolean()); 
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover the `addAll` method, serialization of primitive and wrapper number types (short, int, long, float, double), checking for empty values, handling of `serializeWithType`, format contextualization, and schema generation.
2. TEST CASE DESIGN -
    - testAddAll: Checks if all number serializers are added to the map.
    - testShortSerialize: Serializes a short value.
    - testShortIsEmpty: Checks if zero is considered empty for short.
    - testIntegerSerialize: Serializes an int value.
    - testIntegerSerializeWithType: Serializes an int value with type information (though it doesn't add any).
    - testIntegerIsEmpty: Checks if zero is considered empty for int.
    - testIntLikeSerialize: Serializes a Number (as int) value.
    - testIntLikeIsEmpty: Checks if zero is considered empty for Number (as int).
    - testLongSerialize: Serializes a long value.
    - testLongIsEmpty: Checks if zero is considered empty for long.
    - testFloatSerialize: Serializes a float value.
    - testFloatIsEmpty: Checks if zero is considered empty for float.
    - testDoubleSerialize: Serializes a double value.
    - testDoubleSerializeWithType: Serializes a double value with type information.
    - testDoubleIsEmpty: Checks if zero is considered empty for double.
    - testBaseAcceptJsonFormatVisitorInteger: Tests `acceptJsonFormatVisitor` for IntegerSerializer.
    - testBaseAcceptJsonFormatVisitorDouble: Tests `acceptJsonFormatVisitor` for DoubleSerializer.
    - testContextualSerializerWithStringShape: Tests `createContextual` when `JsonFormat.Shape.STRING` is specified.
    - testContextualSerializerNoFormat: Tests `createContextual` when no special `JsonFormat` is specified.
    - testBaseGetSchema: Tests `getSchema` for IntegerSerializer.
    - testBaseGetSchemaDouble: Tests `getSchema` for DoubleSerializer.
4. DEFECT DETECTION STRATEGY - These tests focus on the correct serialization of various number types, handling of empty values, and adherence to configuration, particularly the `JsonFormat.Shape.STRING` which might be a point of failure in a buggy implementation.
5. SUMMARY - 21 tests.
6. LIMITATIONS - The dummy implementations of `SerializerProvider` and `JsonGenerator` are simplified and might not cover all edge cases of the actual Jackson framework. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.