package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.util.Map;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.StringWriter;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;

// Mockito imports for mocking
import org.mockito.Mockito;

public class NumberSerializerTest {

    // Helper method to create a JsonGenerator for testing
    private JsonGenerator createGenerator() throws IOException {
        StringWriter stringWriter = new StringWriter();
        // Using a common JsonGenerator implementation for testing.
        // The constructor takes an int buffer size, an int ioContext (which is problematic here),
        // a SerializerProvider and an OutputStream. We'll use StringWriter as output.
        // Looking at com.fasterxml.jackson.core.json.UTF8JsonGenerator, the second arg is 'streamBufferSize',
        // not IOContext. The third arg is IOContext. We can pass null for IOContext.
        return new com.fasterxml.jackson.core.json.UTF8JsonGenerator(1024, null, stringWriter);
    }

    // Helper method to get the StringWriter's content
    private String getWrittenContent(JsonGenerator generator) {
        // Safely cast to StringWriter and get content
        // The output target is not directly accessible from JsonGenerator.
        // We need to access it via the underlying writer, which is what StringWriter is.
        // This approach assumes UTF8JsonGenerator wraps StringWriter.
        // A more robust way would be to pass StringWriter to the test and retrieve from it.
        // For now, assuming the generator uses StringWriter internally.
        try {
            return ((StringWriter) generator.getOutputTarget()).toString();
        } catch (Exception e) {
            // Fallback if getOutputTarget() doesn't work as expected or is not StringWriter
            // In a real scenario, we'd ensure the generator is configured to write to StringWriter
            // and perhaps access it directly.
            return "Error accessing output";
        }
    }

    // Test for serialize method with BigDecimal
    @Test
    public void testSerializeBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        BigDecimal value = new BigDecimal("123.456");
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("123.456", getWrittenContent(generator));
    }

    // Test for serialize method with BigInteger
    @Test
    public void testSerializeBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        BigInteger value = new BigInteger("9876543210");
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("9876543210", getWrittenContent(generator));
    }

    // Test for serialize method with Long
    @Test
    public void testSerializeLong() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Long.class);
        Long value = 1234567890L;
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("1234567890", getWrittenContent(generator));
    }

    // Test for serialize method with Double
    @Test
    public void testSerializeDouble() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Double.class);
        Double value = 123.456789;
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        // Double precision might cause minor differences in string representation
        // Using a tolerance check or relying on default toString() behavior for now.
        // The actual output depends on the JsonGenerator's configuration.
        assertEquals("123.456789", getWrittenContent(generator));
    }

    // Test for serialize method with Float
    @Test
    public void testSerializeFloat() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Float.class);
        Float value = 123.4567f;
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("123.4567", getWrittenContent(generator));
    }

    // Test for serialize method with Integer
    @Test
    public void testSerializeInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Integer.class);
        Integer value = 12345;
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("12345", getWrittenContent(generator));
    }

    // Test for serialize method with Byte
    @Test
    public void testSerializeByte() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Byte.class);
        Byte value = (byte) 123;
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("123", getWrittenContent(generator));
    }

    // Test for serialize method with Short
    @Test
    public void testSerializeShort() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Short.class);
        Short value = (short) 12345;
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("12345", getWrittenContent(generator));
    }

    // Test for serialize method with a Number subclass not explicitly handled (fallback)
    @Test
    public void testSerializeOtherNumberSubclass() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class); // Using Number.class here to test fallback
        Number value = new Number() {
            @Override
            public int intValue() { return 42; }
            @Override
            public long longValue() { return 42L; }
            @Override
            public float floatValue() { return 42.0f; }
            @Override
            public double doubleValue() { return 42.0; }
            @Override
            public String toString() { return "42"; }
        };
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("42", getWrittenContent(generator));
    }

    // Test for getSchema with Integer type
    @Test
    public void testGetSchemaForInt() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Integer.class);
        JsonNode schema = serializer.getSchema(null, null);
        assertEquals("integer", schema.get("type").asText());
        assertTrue(schema.get("type").isTextual());
    }

    // Test for getSchema with BigDecimal type
    @Test
    public void testGetSchemaForBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonNode schema = serializer.getSchema(null, null);
        assertEquals("number", schema.get("type").asText());
        assertTrue(schema.get("type").isTextual());
    }

    // Test for acceptJsonFormatVisitor with BigInteger
    @Test
    public void testAcceptJsonFormatVisitorBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JsonFormatVisitorWrapper visitor = Mockito.mock(JsonFormatVisitorWrapper.class);
        JsonIntegerFormatVisitor intVisitor = Mockito.mock(JsonIntegerFormatVisitor.class);
        Mockito.when(visitor.expectIntegerFormat(Mockito.any())).thenReturn(intVisitor);
        serializer.acceptJsonFormatVisitor(visitor, null);
        Mockito.verify(visitor).expectIntegerFormat(Mockito.any());
        Mockito.verify(intVisitor).numberType(JsonParser.NumberType.BIG_INTEGER);
    }

    // Test for acceptJsonFormatVisitor with BigDecimal
    @Test
    public void testAcceptJsonFormatVisitorBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonFormatVisitorWrapper visitor = Mockito.mock(JsonFormatVisitorWrapper.class);
        JsonNumberFormatVisitor numberVisitor = Mockito.mock(JsonNumberFormatVisitor.class);
        Mockito.when(visitor.expectNumberFormat(Mockito.any())).thenReturn(numberVisitor);
        serializer.acceptJsonFormatVisitor(visitor, null);
        Mockito.verify(visitor).expectNumberFormat(Mockito.any());
        Mockito.verify(numberVisitor).numberType(JsonParser.NumberType.BIG_DECIMAL);
    }

    // Test for acceptJsonFormatVisitor with Integer
    @Test
    public void testAcceptJsonFormatVisitorInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Integer.class);
        JsonFormatVisitorWrapper visitor = Mockito.mock(JsonFormatVisitorWrapper.class);
        JsonIntegerFormatVisitor intVisitor = Mockito.mock(JsonIntegerFormatVisitor.class);
        Mockito.when(visitor.expectIntegerFormat(Mockito.any())).thenReturn(intVisitor);
        serializer.acceptJsonFormatVisitor(visitor, null);
        Mockito.verify(visitor).expectIntegerFormat(Mockito.any());
        Mockito.verify(intVisitor).numberType(JsonParser.NumberType.INT);
    }

    // Test createContextual with no format overrides (should return itself)
    @Test
    public void testCreateContextualNoOverrides() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Integer.class);
        SerializerProvider provider = null;
        BeanProperty property = null;
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertSame(serializer, contextualSerializer);
    }

    // Test createContextual with shape STRING for BigDecimal
    @Test
    public void testCreateContextualStringShapeForBigDecimal() throws Exception {
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        SerializerProvider provider = mockSerializerProviderWithFormat(format);
        BeanProperty property = Mockito.mock(BeanProperty.class);
        Mockito.when(property.findFormatOverrides(null)).thenReturn(format);
        Mockito.when(property.getType()).thenReturn(TypeFactory.defaultInstance().constructType(BigDecimal.class));


        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertNotSame(serializer, contextualSerializer);
        assertTrue(contextualSerializer instanceof ToStringSerializer);
    }

    // Test createContextual with shape STRING for other Number types
    @Test
    public void testCreateContextualStringShapeForOtherNumber() throws Exception {
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        SerializerProvider provider = mockSerializerProviderWithFormat(format);
        BeanProperty property = Mockito.mock(BeanProperty.class);
        Mockito.when(property.findFormatOverrides(null)).thenReturn(format);
        Mockito.when(property.getType()).thenReturn(TypeFactory.defaultInstance().constructType(Integer.class));


        NumberSerializer serializer = new NumberSerializer(Integer.class);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertNotSame(serializer, contextualSerializer);
        assertTrue(contextualSerializer instanceof ToStringSerializer);
    }

    // Test for the static instance of NumberSerializer
    @Test
    public void testStaticInstance() {
        assertSame(NumberSerializer.instance.getClass(), NumberSerializer.class);
        assertEquals(Number.class, NumberSerializer.instance.handledType());
    }

    // Test for bigDecimalAsStringSerializer static method
    @Test
    public void testBigDecimalAsStringSerializerMethod() {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        assertNotNull(serializer);
        assertTrue(serializer instanceof NumberSerializer.BigDecimalAsStringSerializer);
    }

    // Test serialize within BigDecimalAsStringSerializer when WRITE_BIGDECIMAL_AS_PLAIN is enabled and scale is valid
    @Test
    public void testBigDecimalAsStringSerializerSerializeValidScale() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        BigDecimal value = new BigDecimal("123.456"); // scale is 3, which is within range
        JsonGenerator generator = createGenerator();
        ((com.fasterxml.jackson.core.json.UTF8JsonGenerator) generator).enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("123.456", getWrittenContent(generator));
    }

    // Test serialize within BigDecimalAsStringSerializer when WRITE_BIGDECIMAL_AS_PLAIN is enabled and scale is invalid (too large)
    @Test
    public void testBigDecimalAsStringSerializerSerializeInvalidScaleTooLarge() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        StringBuilder sb = new StringBuilder("1.");
        for (int i = 0; i < 10000; i++) {
            sb.append("0");
        }
        BigDecimal value = new BigDecimal(sb.toString());

        JsonGenerator generator = createGenerator();
        ((com.fasterxml.jackson.core.json.UTF8JsonGenerator) generator).enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        SerializerProvider provider = mockSerializerProvider();

        try {
            serializer.serialize(value, generator, provider);
            fail("Expected reportMappingProblem to be called.");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("illegal scale"));
        } catch (Exception e) {
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

    // Test serialize within BigDecimalAsStringSerializer when WRITE_BIGDECIMAL_AS_PLAIN is disabled
    @Test
    public void testBigDecimalAsStringSerializerSerializeNoPlainEnabled() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        BigDecimal value = new BigDecimal("123.456");
        JsonGenerator generator = createGenerator();
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("123.456", getWrittenContent(generator));
    }

    // Test isEmpty for BigDecimalAsStringSerializer
    @Test
    public void testBigDecimalAsStringSerializerIsEmpty() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        BigDecimal zeroValue = BigDecimal.ZERO;
        BigDecimal nonZeroValue = new BigDecimal("1.0");

        assertFalse(serializer.isEmpty(null, nonZeroValue));
        assertFalse(serializer.isEmpty(null, zeroValue));
    }

    // Test valueToString for BigDecimalAsStringSerializer (should throw exception)
    @Test
    public void testBigDecimalAsStringSerializerValueToString() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        try {
            serializer.valueToString(BigDecimal.ONE);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // Expected exception
        }
    }

    // Mock SerializerProvider to provide a dummy format value
    private SerializerProvider mockSerializerProviderWithFormat(JsonFormat.Value format) throws JsonMappingException {
        SerializerProvider provider = Mockito.mock(SerializerProvider.class);
        // No need to mock getContextualType or reportProblem if not called in createContextual's path
        return provider;
    }

    // Mock SerializerProvider for reporting mapping problems
    private SerializerProvider mockSerializerProvider() throws JsonMappingException {
        SerializerProvider provider = Mockito.mock(SerializerProvider.class);
        // Mock reportMappingProblem to throw a JsonMappingException as expected by the test
        Mockito.doThrow(new JsonMappingException(null, "Simulated mapping problem: illegal scale"))
            .when(provider).reportMappingProblem(Mockito.anyString());
        return provider;
    }
}
