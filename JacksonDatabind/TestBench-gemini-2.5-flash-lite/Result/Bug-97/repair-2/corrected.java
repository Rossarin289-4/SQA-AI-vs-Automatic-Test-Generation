package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;

import java.util.Date; // Added for testing toString with custom object
import java.util.Locale;
import java.util.TimeZone;
import java.math.BigDecimal;
import java.lang.reflect.Type;

// Mock JsonGenerator for testing
class MockJsonGenerator implements JsonGenerator {
    public StringBuilder output = new StringBuilder();
    public boolean writeNullCalled = false;
    public Object writtenObject = null;
    public String fieldName = null;

    // Implement all abstract methods or remove them if not needed for the test
    @Override public void writeStartObject() throws IOException {}
    @Override public void writeEndObject() throws IOException {}
    @Override public void writeStartArray() throws IOException {}
    @Override public void writeEndArray() throws IOException {}
    @Override public void writeFieldName(String name) throws IOException { this.fieldName = name; }
    @Override public void writeFieldName(SerializableString name) throws IOException { this.fieldName = name.getValue(); }
    @Override public void writeString(String value) throws IOException { output.append(value); }
    @Override public void writeString(SerializableString value) throws IOException { output.append(value.getValue()); }
    @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
    @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
    @Override public void writeRaw(String text) throws IOException { output.append(text); }
    @Override public void writeRaw(StringBuilder sb) throws IOException { output.append(sb); }
    @Override public void writeRaw(char[] c, int offset, int length) throws IOException {}
    @Override public void writeRawValue(String text) throws IOException { output.append(text); }
    @Override public void writeRawValue(SerializableString text) throws IOException { output.append(text.getValue()); }
    @Override public void writeRawValue(char[] c, int offset, int length) throws IOException {}
    @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int length) throws IOException { this.writtenObject = data; }
    @Override public void writeNumber(String encoded) throws IOException { output.append(encoded); }
    @Override public void writeNumber(int v) throws IOException { output.append(v); }
    @Override public void writeNumber(long v) throws IOException { output.append(v); }
    @Override public void writeNumber(double v) throws IOException { output.append(v); }
    @Override public void writeNumber(float v) throws IOException { output.append(v); }
    @Override public void writeNumber(BigDecimal v) throws IOException { output.append(v); }
    @Override public void writeBoolean(boolean v) throws IOException { output.append(v); }
    @Override public void writeNull() throws IOException { writeNullCalled = true; }
    @Override public void writeObject(Object value) throws IOException { this.writtenObject = value; }
    @Override public void writeOmittedFields(String... names) throws IOException {}
    @Override public void writeObjectRef(Object ob) throws IOException {}
    @Override public void writeTypeId(Object id) throws IOException {}
    @Override public void writeObject(Object pojo, com.fasterxml.jackson.databind.JsonSerializer<Object> ser) throws IOException { this.writtenObject = pojo; }
    @Override public void writeEmbeddedObject(Object obj) throws IOException { this.writtenObject = obj; }
    @Override public void copyCurrentEvent(JsonParser p) throws IOException {}
    // Feature enum is part of JsonGenerator, no need to import separately if JsonGenerator is imported.
    @Override public JsonGenerator enable(Feature f) { return this; }
    @Override public JsonGenerator disable(Feature f) { return this; }
    @Override public JsonGenerator configure(Feature f, boolean state) { return this; }
    @Override public boolean isEnabled(Feature f) { return false; }
    @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
    @Override public void setPrettyPrinter(PrettyPrinter pp) {}
    @Override public void flush() throws IOException {}
    @Override public void close() throws IOException {}
    @Override public boolean isClosed() { return false; }
    @Override public JsonStreamContext getOutputContext() { return null; }
    @Override public JsonGenerator.Feature getFeatureMask() { return null; }
    @Override public PrettyPrinter getPrettyPrinter() { return null; }
    @Override public void writeTypeId(String id) throws IOException {}
    @Override public void writeStringField(String fieldName, String value) throws IOException { this.fieldName = fieldName; output.append(value); }
    @Override public void writeBooleanField(String fieldName, boolean value) throws IOException { this.fieldName = fieldName; output.append(value); }
    @Override public void writeNullField(String fieldName) throws IOException { this.fieldName = fieldName; writeNullCalled = true; }
    @Override public void writeNumberField(String fieldName, int value) throws IOException { this.fieldName = fieldName; output.append(value); }
    @Override public void writeNumberField(String fieldName, long value) throws IOException { this.fieldName = fieldName; output.append(value); }
    @Override public void writeNumberField(String fieldName, double value) throws IOException { this.fieldName = fieldName; output.append(value); }
    @Override public void writeNumberField(String fieldName, float value) throws IOException { this.fieldName = fieldName; output.append(value); }
    @Override public void writeNumberField(String fieldName, BigDecimal value) throws IOException { this.fieldName = fieldName; output.append(value); }
    @Override public void writeBinaryField(String fieldName, byte[] data) throws IOException { this.fieldName = fieldName; this.writtenObject = data; }
    @Override public void writeObjectField(String fieldName, Object value) throws IOException { this.fieldName = fieldName; this.writtenObject = value; }
    @Override public void writeEmbeddedObjectField(String fieldName, Object value) throws IOException { this.fieldName = fieldName; this.writtenObject = value; }
}

// Mock SerializerProvider to satisfy the serialize method signature
// Inherit from SerializerProvider which is abstract and requires implementation of abstract methods.
abstract class MockSerializerProvider extends SerializerProvider {
    // Minimal implementation for testing POJONode's serialize method
    @Override
    public void defaultSerializeNull(JsonGenerator gen) throws IOException {
        gen.writeNull();
    }

    @Override
    public void defaultSerializeValue(Object value, JsonGenerator gen) throws IOException {
        if (value == null) {
            gen.writeNull();
        } else if (value instanceof JsonSerializable) {
            ((JsonSerializable) value).serialize(gen, this);
        } else {
            // For simple objects, we can just use their toString or writeObject
            // If the object is a byte array, serialize it as binary
            if (value instanceof byte[]) {
                byte[] data = (byte[]) value;
                gen.writeBinary(null, data, 0, data.length);
            } else {
                gen.writeObject(value);
            }
        }
    }

    // Implementations for abstract methods from SerializerProvider.
    // These can be simplified for the purpose of this test.
    @Override public com.fasterxml.jackson.databind.SerializationConfig getConfig() { return null; }
    @Override public com.fasterxml.jackson.databind.AnnotationIntrospector getAnnotationIntrospector() { return null; }
    @Override public com.fasterxml.jackson.databind.type.TypeFactory getTypeFactory() { return null; }
    @Override public Class<?> getActiveView() { return null; }
    @Override public Class<?> getSerializationView() { return null; }
    @Override public boolean canOverrideAccessModifiers() { return false; }
    @Override public boolean isEnabled(MapperFeature feature) { return false; }
    @Override public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return null; }
    @Override public JsonInclude.Value getDefaultPropertyInclusion(Class<?> baseType) { return null; }
    @Override public Locale getLocale() { return null; }
    @Override public TimeZone getTimeZone() { return null; }
    @Override public Object getAttribute(Object key) { return null; }
    @Override public SerializerProvider setAttribute(Object key, Object value) { return this; }
    @Override public boolean hasSerializerFor(Class<?> type) { return false; }
    // Explicitly import missing types.
    @Override public com.fasterxml.jackson.databind.JsonSerializer<Object> findValueSerializer(com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.BeanProperty property) throws com.fasterxml.jackson.databind.JsonMappingException { return null; }
    @Override public com.fasterxml.jackson.databind.JsonSerializer<Object> findKeySerializer(com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.BeanProperty property) throws com.fasterxml.jackson.databind.JsonMappingException { return null; }
    @Override public com.fasterxml.jackson.databind.JsonSerializer<Object> getUnknownTypeSerializer(Class<?> unknownClass) throws com.fasterxml.jackson.databind.JsonMappingException { return null; }
    @Override public com.fasterxml.jackson.databind.JsonSerializer<Object> getDefaultNullValueSerializer() { return null; }
    @Override public void serializeValue(JsonGenerator gen, Object value) throws IOException {}
    @Override public void serializeValue(JsonGenerator gen, Object value, com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.JsonSerializer<Object> ser) throws IOException {}
    @Override public void serializeObject(Object obj, JsonGenerator gen, SerializerProvider provider) throws IOException {}
    @Override public boolean isEnabled(SerializationFeature feature) { return false; }
    @Override public JsonInclude.Include getSerializationInclusion() { return null; }
    @Override public com.fasterxml.jackson.databind.type.TypeBindings getTypeBindings() { return null; }
    @Override public com.fasterxml.jackson.databind.JavaType constructType(Class<?> cls) { return null; }
    @Override public com.fasterxml.jackson.databind.JavaType constructType(Type cls) { return null; }
    @Override public com.fasterxml.jackson.databind.JavaType constructSpecializedType(com.fasterxml.jackson.databind.JavaType baseType, Class<?> subclass) { return null; }
    @Override public com.fasterxml.jackson.databind.introspect.AnnotatedClass getClassIntrospector() { return null; }
    @Override public com.fasterxml.jackson.databind.introspect.BeanDescription introspectClass(com.fasterxml.jackson.databind.JavaType type) { return null; }
    @Override public com.fasterxml.jackson.databind.introspect.BeanDescription introspectForCreation(com.fasterxml.jackson.databind.JavaType type) { return null; }
    @Override public com.fasterxml.jackson.databind.introspect.BeanDescription introspectForSerialization(com.fasterxml.jackson.databind.JavaType type) { return null; }
    @Override public com.fasterxml.jackson.databind.introspect.AnnotatedMember getField(com.fasterxml.jackson.databind.introspect.AnnotatedClass ac, String fieldName) { return null; }
    @Override public com.fasterxml.jackson.databind.introspect.AnnotatedMethod getConstructor(com.fasterxml.jackson.databind.JavaType type) { return null; }
    @Override public com.fasterxml.jackson.databind.introspect.AnnotatedMethod findMethod(com.fasterxml.jackson.databind.JavaType type, String name, Class<?>[] paramTypes) { return null; }
    @Override public boolean hasDeserializationProblemHandler() { return false; }
    @Override public com.fasterxml.jackson.databind.deser.DeserializationProblemHandler getDeserializationProblemHandler() { return null; }
    @Override public com.fasterxml.jackson.databind.cfg.BaseSettings getBaseSettings() { return null; }
    @Override public com.fasterxml.jackson.databind.JsonSerializer<Object> findNullValueSerializer(com.fasterxml.jackson.databind.BeanProperty property) throws com.fasterxml.jackson.databind.JsonMappingException { return null; }
    @Override public com.fasterxml.jackson.databind.JsonSerializer<Object> findNullKeySerializer(com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.BeanProperty property) throws com.fasterxml.jackson.databind.JsonMappingException { return null; }
    @Override public com.fasterxml.jackson.databind.JsonDeserializer<Object> findContextualDeserializer(com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.BeanProperty property, com.fasterxml.jackson.databind.JsonSerializer<?> ser) throws com.fasterxml.jackson.databind.JsonMappingException { return null; }
    @Override public com.fasterxml.jackson.databind.cfg.SerializerFactory getSerializerFactory() { return null; }
}


public class POJONodeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPojoNodeConstructorAndGetPojo() {
        Object pojo = new Object();
        POJONode node = new POJONode(pojo);
        assertSame(pojo, node.getPojo());
    }

    @Test
    public void testPojoNodeWithNullValue() {
        POJONode node = new POJONode(null);
        assertNull(node.getPojo());
    }

    @Test
    public void testGetNodeType() {
        POJONode node = new POJONode(new Object());
        assertEquals(JsonNodeType.POJO, node.getNodeType());
    }

    @Test
    public void testAsToken() {
        POJONode node = new POJONode(new Object());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    @Test
    public void testBinaryValueForByteArray() throws IOException {
        byte[] data = {1, 2, 3};
        POJONode node = new POJONode(data);
        assertArrayEquals(data, node.binaryValue());
    }

    @Test
    public void testBinaryValueForNonByteArray() throws IOException {
        Object data = new Object();
        POJONode node = new POJONode(data);
        // Default implementation in ValueNode is to throw exception
        try {
            node.binaryValue();
            fail("Expected IOException for non-byte array");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testAsTextForNonNullObject() {
        String text = "testString";
        POJONode node = new POJONode(text);
        assertEquals(text, node.asText());
    }

    @Test
    public void testAsTextForNull() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.asText());
    }

    @Test
    public void testAsTextWithDefaultForNonNullObject() {
        String text = "testString";
        POJONode node = new POJONode(text);
        assertEquals(text, node.asText("default"));
    }

    @Test
    public void testAsTextWithDefaultForNull() {
        POJONode node = new POJONode(null);
        assertEquals("default", node.asText("default"));
    }

    @Test
    public void testAsBooleanForTrueBoolean() {
        POJONode node = new POJONode(Boolean.TRUE);
        assertTrue(node.asBoolean(false));
    }

    @Test
    public void testAsBooleanForFalseBoolean() {
        POJONode node = new POJONode(Boolean.FALSE);
        assertFalse(node.asBoolean(true));
    }

    @Test
    public void testAsBooleanForNonBoolean() {
        POJONode node = new POJONode("true");
        assertFalse(node.asBoolean(false));
    }

    @Test
    public void testAsBooleanForNull() {
        POJONode node = new POJONode(null);
        assertFalse(node.asBoolean(false));
    }

    @Test
    public void testAsIntForInteger() {
        POJONode node = new POJONode(Integer.valueOf(123));
        assertEquals(123, node.asInt(0));
    }

    @Test
    public void testAsIntForDouble() {
        POJONode node = new POJONode(Double.valueOf(123.45));
        assertEquals(123, node.asInt(0));
    }

    @Test
    public void testAsIntForNonNumber() {
        POJONode node = new POJONode("123");
        assertEquals(0, node.asInt(0));
    }

    @Test
    public void testAsIntForNull() {
        POJONode node = new POJONode(null);
        assertEquals(0, node.asInt(0));
    }

    @Test
    public void testAsLongForInteger() {
        POJONode node = new POJONode(Integer.valueOf(123));
        assertEquals(123L, node.asLong(0L));
    }

    @Test
    public void testAsLongForLong() {
        POJONode node = new POJONode(Long.valueOf(456L));
        assertEquals(456L, node.asLong(0L));
    }

    @Test
    public void testAsLongForNonNumber() {
        POJONode node = new POJONode("456");
        assertEquals(0L, node.asLong(0L));
    }

    @Test
    public void testAsLongForNull() {
        POJONode node = new POJONode(null);
        assertEquals(0L, node.asLong(0L));
    }

    @Test
    public void testAsDoubleForInteger() {
        POJONode node = new POJONode(Integer.valueOf(123));
        assertEquals(123.0, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testAsDoubleForDouble() {
        POJONode node = new POJONode(Double.valueOf(456.789));
        assertEquals(456.789, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testAsDoubleForNonNumber() {
        POJONode node = new POJONode("456.789");
        assertEquals(0.0, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testAsDoubleForNull() {
        POJONode node = new POJONode(null);
        assertEquals(0.0, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testEqualsSameInstance() {
        POJONode node = new POJONode(new Object());
        assertTrue(node.equals(node));
    }

    @Test
    public void testEqualsDifferentInstanceSameValue() {
        Object value = new Object();
        POJONode node1 = new POJONode(value);
        POJONode node2 = new POJONode(value);
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEqualsDifferentInstanceDifferentValue() {
        POJONode node1 = new POJONode(new Object());
        POJONode node2 = new POJONode(new Object());
        assertFalse(node1.equals(node2));
    }

    @Test
    public void testEqualsWithNull() {
        POJONode node = new POJONode(new Object());
        assertFalse(node.equals(null));
    }

    @Test
    public void testEqualsWithDifferentType() {
        POJONode node = new POJONode(new Object());
        assertFalse(node.equals("POJONode"));
    }

    @Test
    public void testEqualsForNullPojo() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(null);
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEqualsForNullAndNonNullPojo() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(new Object());
        assertFalse(node1.equals(node2));
    }

    @Test
    public void testHashCodeForSameObject() {
        Object pojo = new Object();
        POJONode node1 = new POJONode(pojo);
        POJONode node2 = new POJONode(pojo);
        assertEquals(node1.hashCode(), node2.hashCode());
    }

    @Test
    public void testHashCodeForDifferentObject() {
        POJONode node1 = new POJONode(new Object());
        POJONode node2 = new POJONode(new Object());
        assertNotEquals(node1.hashCode(), node2.hashCode());
    }

    @Test
    public void testHashCodeForNull() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(null);
        // hashCode for null _value in POJONode uses Object.hashCode() which is not null-safe.
        // However, the reference source code uses _value.hashCode(), so we'll test that.
        // If _value is null, it will throw NullPointerException.
        // This test assumes _value.hashCode() is called.
        try {
            node1.hashCode(); // This will throw NPE if _value is null
            fail("Expected NullPointerException for null _value");
        } catch (NullPointerException e) {
            // Expected behavior for null _value
        }
    }

    @Test
    public void testToStringForSimpleObject() {
        String value = "test";
        POJONode node = new POJONode(value);
        assertEquals(value, node.toString());
    }

    @Test
    public void testToStringForNull() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.toString());
    }

    @Test
    public void testToStringForByteArray() {
        byte[] data = {1, 2, 3};
        POJONode node = new POJONode(data);
        assertEquals("(binary value of 3 bytes)", node.toString());
    }

    @Test
    public void testToStringForRawValue() {
        RawValue rawValue = new RawValue("raw");
        POJONode node = new POJONode(rawValue);
        assertEquals("(raw value 'raw')", node.toString());
    }

    @Test
    public void testSerializeWithNullPojo() throws IOException {
        POJONode node = new POJONode(null);
        MockSerializerProvider provider = new MockSerializerProvider() {
            // Override defaultSerializeNull to ensure it's called.
            // In the original code, defaultSerializeNull is called when _value is null.
            @Override
            public void defaultSerializeNull(JsonGenerator gen) throws IOException {
                gen.writeNull();
            }
        };
        MockJsonGenerator generator = new MockJsonGenerator();
        node.serialize(generator, provider);
        assertTrue(generator.writeNullCalled);
    }

    @Test
    public void testSerializeWithSerializablePojo() throws IOException {
        // Use a concrete implementation for JsonSerializable
        JsonSerializable pojo = new RawValue("some value");
        POJONode node = new POJONode(pojo);
        MockSerializerProvider provider = new MockSerializerProvider() {
            // Override defaultSerializeValue to capture what it's called with
            @Override
            public void defaultSerializeValue(Object value, JsonGenerator gen) throws IOException {
                if (value instanceof JsonSerializable) {
                    ((JsonSerializable) value).serialize(gen, this);
                } else {
                    gen.writeObject(value); // Fallback for other types
                }
            }
        };
        MockJsonGenerator generator = new MockJsonGenerator();
        node.serialize(generator, provider);
        assertEquals("some value", generator.output.toString());
    }

    @Test
    public void testSerializeWithOtherPojo() throws IOException {
        Object pojo = new Object() {
            @Override
            public String toString() { return "CustomObject"; }
        };
        POJONode node = new POJONode(pojo);
        MockSerializerProvider provider = new MockSerializerProvider() {
             // Override defaultSerializeValue to capture what it's called with
            @Override
            public void defaultSerializeValue(Object value, JsonGenerator gen) throws IOException {
                gen.writeObject(value); // This will call toString on our custom object
            }
        };
        MockJsonGenerator generator = new MockJsonGenerator();
        node.serialize(generator, provider);
        assertEquals("CustomObject", generator.output.toString());
    }

    @Test
    public void testSerializeWithByteArrayPojo() throws IOException {
        byte[] data = {1, 2, 3};
        POJONode node = new POJONode(data);
        MockSerializerProvider provider = new MockSerializerProvider() {
            // Override defaultSerializeValue to ensure it's called with the byte array
            @Override
            public void defaultSerializeValue(Object value, JsonGenerator gen) throws IOException {
                 // The serialize method calls ctxt.defaultSerializeValue(_value, gen);
                 // _value is byte[] here.
                 // Our mock defaultSerializeValue handles byte[] by calling gen.writeBinary.
                 super.defaultSerializeValue(value, gen);
            }
        };
        MockJsonGenerator generator = new MockJsonGenerator();
        node.serialize(generator, provider);
        // The defaultSerializeValue will be called by serialize.
        // We expect generator.writtenObject to be set to the byte array by writeBinary.
        assertTrue(generator.writtenObject instanceof byte[]);
        assertArrayEquals(data, (byte[]) generator.writtenObject);
    }

    @Test
    public void testToStringWithDateObject() {
        Date date = new Date(1234567890123L); // A specific date for reproducibility
        POJONode node = new POJONode(date);
        assertEquals(date.toString(), node.toString());
    }
}
