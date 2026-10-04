package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.util.StdKeyResolver;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.ext.CoreXMLSerializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

// Mock JsonGenerator
public class NumberSerializerTest {

    // Mock JsonGenerator
    private static class MockJsonGenerator implements JsonGenerator {
        public String writtenValue;
        public int intValue;
        public long longValue;
        public double doubleValue;
        public BigDecimal bigDecimalValue;
        public BigInteger bigIntegerValue;
        public String stringValue;

        @Override
        public JsonGenerator writeNumber(BigDecimal value) throws IOException {
            this.bigDecimalValue = value;
            this.writtenValue = value.toString();
            return this;
        }

        @Override
        public JsonGenerator writeNumber(BigInteger value) throws IOException {
            this.bigIntegerValue = value;
            this.writtenValue = value.toString();
            return this;
        }

        @Override
        public JsonGenerator writeNumber(int value) throws IOException {
            this.intValue = value;
            this.writtenValue = String.valueOf(value);
            return this;
        }

        @Override
        public JsonGenerator writeNumber(long value) throws IOException {
            this.longValue = value;
            this.writtenValue = String.valueOf(value);
            return this;
        }

        @Override
        public JsonGenerator writeNumber(double value) throws IOException {
            this.doubleValue = value;
            this.writtenValue = String.valueOf(value);
            return this;
        }

        @Override
        public JsonGenerator writeNumber(float value) throws IOException {
            this.doubleValue = value; // Float is promoted to double
            this.writtenValue = String.valueOf(value);
            return this;
        }

        @Override
        public JsonGenerator writeNumber(String value) throws IOException {
            this.stringValue = value;
            this.writtenValue = value;
            return this;
        }

        // --- Other JsonGenerator methods (stubbed to compile) ---
        @Override public void close() throws IOException { }
        @Override public void flush() throws IOException { }
        @Override public void writeString(String text) throws IOException { }
        @Override public void writeRaw(String text) throws IOException { }
        @Override public void writeBoolean(boolean state) throws IOException { }
        @Override public void writeNull() throws IOException { }
        @Override public void writeObject(Object value) throws IOException { }
        @Override public void writeStartObject() throws IOException { }
        @Override public void writeEndObject() throws IOException { }
        @Override public void writeFieldName(String name) throws IOException { }
        @Override public void writeString(char[] text, int offset, int length) throws IOException { }
        @Override public void writeRaw(char[] text, int offset, int length) throws IOException { }
        @Override public void writeRawValue(String text) throws IOException { }
        @Override public void writeRawValue(char[] text, int offset, int length) throws IOException { }
        @Override public void writeBinary(byte[] data) throws IOException { }
        @Override public void writeBinary(byte[] data, int offset, int length) throws IOException { }
        @Override public void writeTypeId(Object typeId) throws IOException { }
        @Override public void writeObjectId(Object id) throws IOException { }
        @Override public void writeObjectIdReference(Object id) throws IOException { }
        @Override public void writeObjectRef(Object ob) throws IOException { }
        @Override public void writeEmbeddedObject(Object object) throws IOException { }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public JsonGenerator enable(JsonGenerator.Feature f) { return this; }
        @Override public JsonGenerator disable(JsonGenerator.Feature f) { return this; }
        @Override public boolean isEnabled(JsonGenerator.Feature f) { return false; }
        @Override public JsonGenerator setCodec(ObjectCodec oc) { return this; }
        @Override public ObjectCodec getCodec() { return null; }
        @Override public com.fasterxml.jackson.core.JsonStreamContext getOutputContext() { return null; }
        @Override public void copyCurrentEvent(JsonGenerator jg) throws IOException { }
        @Override public void writeOmittedFields(Object value) throws IOException { }
        @Override public boolean canWriteTypeId() { return false; }
        @Override public boolean canWriteObjectId() { return false; }
        @Override public boolean canWriteFormattedDates() { return false; }
        @Override public boolean canWriteObjectIdReference() { return false; }
        @Override public boolean canWriteObjectIdMap() { return false; }
        @Override public void writeStartArray() throws IOException { }
        @Override public void writeEndArray() throws IOException { }
    }

    // Mock SerializerProvider
    private static class MockSerializerProvider extends SerializerProvider {
        @Override
        public JsonSerializer<?> findValueSerializer(Class<?> cls, BeanProperty property) {
            return null;
        }

        @Override
        public JsonSerializer<?> findValueSerializer(JavaType type, BeanProperty property) {
            return null;
        }

        @Override
        public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.introspect.AnnotatedMember member) {
            return null;
        }
        
        @Override
        public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.introspect.AnnotatedClass ac) {
            return null;
        }

        @Override
        public void reportMappingProblem(String msg, Object... params) { }
        
        @Override
        public MapperConfig<?> getConfig() {
            return null;
        }

        @Override
        public StdKeyResolver getStdKeyResolver() {
            return null;
        }

        @Override
        public PropertyNamingStrategy getPropertyNamingStrategy() {
            return null;
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return null;
        }

        @Override
        public TypeBindings getBindings() {
            return null;
        }

        @Override
        public CoreXMLSerializers.XMLGregorianCalendarSerializer findXMLGregorianCalendarSerializer(BeanProperty property) {
            return null;
        }

        @Override
        public TypeFactory getTypeFactory() {
            return TypeFactory.defaultInstance(); // Provide a default instance
        }

        @Override
        public ValueInstantiator findValueInstantiator(JavaType type, BeanProperty property) throws JsonMappingException {
            return null;
        }

        @Override
        public boolean isEnabled(SerializationFeature f) {
            return false;
        }
    }

    // Mock JsonFormatVisitorWrapper
    private static class MockJsonFormatVisitorWrapper extends JsonFormatVisitorWrapper.Base {
        public JsonParser.NumberType numberType;
        public JavaType lastVisitedType;
        public boolean visitedInt;
        public boolean visitedFloat;

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            this.lastVisitedType = type;
            return new JsonNumberFormatVisitor() {
                @Override
                public void numberType(JsonParser.NumberType vt) {
                    NumberSerializerTest.MockJsonFormatVisitorWrapper.this.numberType = vt;
                }
                // --- Other JsonNumberFormatVisitor methods (stubbed) ---
                @Override public void expectedFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable visitable, JavaType type) { }
                @Override public void format(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes type) { }
                @Override public void enumTypes(java.util.List<java.lang.String> values) { }
            };
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            this.lastVisitedType = type;
            this.visitedInt = true;
            return new JsonIntegerFormatVisitor() {
                @Override public void numberType(JsonParser.NumberType vt) {
                    NumberSerializerTest.MockJsonFormatVisitorWrapper.this.numberType = vt;
                }
                // --- Other JsonIntegerFormatVisitor methods (stubbed) ---
                @Override public void expectedFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable visitable, JavaType type) { }
                @Override public void format(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes type) { }
                @Override public void enumTypes(java.util.List<java.lang.String> values) { }
            };
        }

        @Override
        public JsonNumberFormatVisitor expectFloatFormat(JavaType type) {
            this.lastVisitedType = type;
            this.visitedFloat = true;
            return new JsonNumberFormatVisitor() {
                @Override public void numberType(JsonParser.NumberType vt) {
                    NumberSerializerTest.MockJsonFormatVisitorWrapper.this.numberType = vt;
                }
                // --- Other JsonNumberFormatVisitor methods (stubbed) ---
                @Override public void expectedFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable visitable, JavaType type) { }
                @Override public void format(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes type) { }
                @Override public void enumTypes(java.util.List<java.lang.String> values) { }
            };
        }
    }

    @Test
    public void testSerializeBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigDecimal value = new BigDecimal("123.456");
        serializer.serialize(value, g, provider);
        assertEquals("123.456", g.writtenValue);
        assertEquals(value, g.bigDecimalValue);
    }

    @Test
    public void testSerializeBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class); // _isInt should be true
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigInteger value = new BigInteger("98765432109876543210");
        serializer.serialize(value, g, provider);
        assertEquals("98765432109876543210", g.writtenValue);
        assertEquals(value, g.bigIntegerValue);
    }

    @Test
    public void testSerializeInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Integer value = 12345;
        serializer.serialize(value, g, provider);
        assertEquals(12345, g.intValue);
        assertEquals("12345", g.writtenValue);
    }

    @Test
    public void testSerializeLong() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Long value = 9876543210L;
        serializer.serialize(value, g, provider);
        assertEquals(9876543210L, g.longValue);
        assertEquals("9876543210", g.writtenValue);
    }

    @Test
    public void testSerializeDouble() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Double value = 123.456789;
        serializer.serialize(value, g, provider);
        assertEquals(123.456789, g.doubleValue, 1e-9);
        assertEquals("123.456789", g.writtenValue);
    }

    @Test
    public void testSerializeFloat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Float value = 987.654f;
        serializer.serialize(value, g, provider);
        assertEquals(987.654f, g.doubleValue, 1e-9); // Float is written as double
        assertEquals("987.654", g.writtenValue);
    }

    @Test
    public void testSerializeByte() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Byte value = (byte) 127;
        serializer.serialize(value, g, provider);
        assertEquals(127, g.intValue);
        assertEquals("127", g.writtenValue);
    }

    @Test
    public void testSerializeShort() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Short value = (short) 32767;
        serializer.serialize(value, g, provider);
        assertEquals(32767, g.intValue);
        assertEquals("32767", g.writtenValue);
    }

    @Test
    public void testSerializeZero() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Integer value = 0;
        serializer.serialize(value, g, provider);
        assertEquals(0, g.intValue);
        assertEquals("0", g.writtenValue);
    }

    @Test
    public void testSerializeNegative() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Integer value = -100;
        serializer.serialize(value, g, provider);
        assertEquals(-100, g.intValue);
        assertEquals("-100", g.writtenValue);
    }

    @Test
    public void testSerializeLargeDouble() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Double value = Double.MAX_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Double.MAX_VALUE, g.doubleValue, 1e-9);
        assertEquals(String.valueOf(Double.MAX_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeSmallDouble() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Double value = Double.MIN_NORMAL;
        serializer.serialize(value, g, provider);
        assertEquals(Double.MIN_NORMAL, g.doubleValue, 1e-9);
        assertEquals(String.valueOf(Double.MIN_NORMAL), g.writtenValue);
    }

    @Test
    public void testSerializeLargeFloat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Float value = Float.MAX_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Float.MAX_VALUE, g.doubleValue, 1e-5); // Note: Float precision
        assertEquals(String.valueOf(Float.MAX_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeSmallFloat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Float value = Float.MIN_NORMAL;
        serializer.serialize(value, g, provider);
        assertEquals(Float.MIN_NORMAL, g.doubleValue, 1e-9);
        assertEquals(String.valueOf(Float.MIN_NORMAL), g.writtenValue);
    }

    @Test
    public void testSerializeMaxInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Integer value = Integer.MAX_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Integer.MAX_VALUE, g.intValue);
        assertEquals(String.valueOf(Integer.MAX_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeMinInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Integer value = Integer.MIN_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Integer.MIN_VALUE, g.intValue);
        assertEquals(String.valueOf(Integer.MIN_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeMaxLong() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Long value = Long.MAX_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Long.MAX_VALUE, g.longValue);
        assertEquals(String.valueOf(Long.MAX_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeMinLong() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Long value = Long.MIN_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Long.MIN_VALUE, g.longValue);
        assertEquals(String.valueOf(Long.MIN_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeMaxByte() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Byte value = Byte.MAX_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Byte.MAX_VALUE, g.intValue);
        assertEquals(String.valueOf(Byte.MAX_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeMinByte() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Byte value = Byte.MIN_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Byte.MIN_VALUE, g.intValue);
        assertEquals(String.valueOf(Byte.MIN_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeMaxShort() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Short value = Short.MAX_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Short.MAX_VALUE, g.intValue);
        assertEquals(String.valueOf(Short.MAX_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeMinShort() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        Short value = Short.MIN_VALUE;
        serializer.serialize(value, g, provider);
        assertEquals(Short.MIN_VALUE, g.intValue);
        assertEquals(String.valueOf(Short.MIN_VALUE), g.writtenValue);
    }

    @Test
    public void testSerializeBigDecimalZero() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigDecimal value = BigDecimal.ZERO;
        serializer.serialize(value, g, provider);
        assertEquals("0", g.writtenValue);
        assertEquals(value, g.bigDecimalValue);
    }

    @Test
    public void testSerializeBigIntegerZero() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigInteger value = BigInteger.ZERO;
        serializer.serialize(value, g, provider);
        assertEquals("0", g.writtenValue);
        assertEquals(value, g.bigIntegerValue);
    }

    @Test
    public void testSerializeBigDecimalMax() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigDecimal value = new BigDecimal("12345678901234567890.1234567890");
        serializer.serialize(value, g, provider);
        assertEquals("12345678901234567890.1234567890", g.writtenValue);
        assertEquals(value, g.bigDecimalValue);
    }

    @Test
    public void testSerializeBigIntegerMax() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigInteger value = new BigInteger("123456789012345678901234567890");
        serializer.serialize(value, g, provider);
        assertEquals("123456789012345678901234567890", g.writtenValue);
        assertEquals(value, g.bigIntegerValue);
    }

    @Test
    public void testSerializeBigIntegerMin() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigInteger value = new BigInteger("-123456789012345678901234567890");
        serializer.serialize(value, g, provider);
        assertEquals("-123456789012345678901234567890", g.writtenValue);
        assertEquals(value, g.bigIntegerValue);
    }

    @Test
    public void testGetSchemaForInt() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockSerializerProvider provider = new MockSerializerProvider();
        Type typeHint = String.class; // Not used by the method
        JsonNode schema = serializer.getSchema(provider, typeHint);
        assertEquals("integer", schema.textValue());
        assertTrue(schema.path("type").isTextual());
    }

    @Test
    public void testGetSchemaForNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        MockSerializerProvider provider = new MockSerializerProvider();
        Type typeHint = String.class; // Not used by the method
        JsonNode schema = serializer.getSchema(provider, typeHint);
        assertEquals("number", schema.textValue());
        assertTrue(schema.path("type").isTextual());
    }

    @Test
    public void testAcceptJsonFormatVisitorForInt() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper();
        JavaType typeHint = null; // Not used by the method
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertTrue(visitor.visitedInt);
        assertEquals(JsonParser.NumberType.BIG_INTEGER, visitor.numberType);
    }

    @Test
    public void testAcceptJsonFormatVisitorForBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper();
        JavaType typeHint = null; // Not used by the method
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertFalse(visitor.visitedInt);
        assertTrue(visitor.visitedFloat);
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, visitor.numberType);
    }

    @Test
    public void testAcceptJsonFormatVisitorForOtherNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class); // Default case
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper();
        JavaType typeHint = null; // Not used by the method
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertFalse(visitor.visitedInt);
        assertFalse(visitor.visitedFloat);
        // The method expects numberFormat and passes null if not BigInteger/BigDecimal
        assertNull(visitor.numberType);
    }
}
