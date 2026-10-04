```java
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
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId; // Import for mock
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap; // Import for mock
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer; // Import for mock
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer; // Import for mock
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer; // Import for mock
import com.fasterxml.jackson.databind.ser.impl.ObjectArraySerializer; // Import for mock
import com.fasterxml.jackson.databind.ser.impl.SerializedLambda; // Import for mock

// Mockito imports for mocking
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

public class NumberSerializerTest {

    // Helper method to create a JsonGenerator for testing
    private JsonGenerator createGenerator() throws IOException {
        // Based on common Jackson usage, StringWriter is often used with JsonGenerator
        StringWriter stringWriter = new StringWriter();
        // Using a common JsonGenerator implementation for testing
        return new com.fasterxml.jackson.core.json.UTF8JsonGenerator(1024, 0, null, stringWriter);
    }

    // Helper method to get the StringWriter's content
    private String getWrittenContent(JsonGenerator generator) {
        // Safely cast to StringWriter and get content
        Object outputTarget = generator.getOutputTarget();
        if (outputTarget instanceof StringWriter) {
            return ((StringWriter) outputTarget).toString();
        }
        return ""; // Or throw an exception if not StringWriter
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
        // Mock JsonFormatVisitorWrapper.Base
        JsonFormatVisitorWrapper visitor = Mockito.mock(JsonFormatVisitorWrapper.class);
        // Mock expectNumberFormat and visitIntFormat to avoid NullPointerException
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
        // Mock expectNumberFormat and visitFloatFormat
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
        // Mock expectNumberFormat and visitIntFormat
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
        SerializerProvider provider = null; // No provider needed for this test
        BeanProperty property = null; // No property needed for this test
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);
        assertSame(serializer, contextualSerializer);
    }

    // Test createContextual with shape STRING for BigDecimal
    @Test
    public void testCreateContextualStringShapeForBigDecimal() throws Exception {
        // Mocking JsonFormat.Value to return shape STRING
        JsonFormat.Value format = JsonFormat.Value.fromShape(JsonFormat.Shape.STRING);
        SerializerProvider provider = mockSerializerProviderWithFormat(format);
        BeanProperty property = null;

        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertNotSame(serializer, contextualSerializer);
        assertTrue(contextualSerializer instanceof ToStringSerializer);
    }

    // Test createContextual with shape STRING for other Number types
    @Test
    public void testCreateContextualStringShapeForOtherNumber() throws Exception {
        JsonFormat.Value format = JsonFormat.Value.fromShape(JsonFormat.Shape.STRING);
        SerializerProvider provider = mockSerializerProviderWithFormat(format);
        BeanProperty property = null;

        NumberSerializer serializer = new NumberSerializer(Integer.class); // Using Integer as an example other number
        JsonSerializer<?> contextualSerializer = serializer.createContextual(provider, property);

        assertNotSame(serializer, contextualSerializer);
        assertTrue(contextualSerializer instanceof ToStringSerializer);
    }

    // Test for the static instance of NumberSerializer
    @Test
    public void testStaticInstance() {
        // The static instance is intended for Number.class
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
        // Enable WRITE_BIGDECIMAL_AS_PLAIN
        // Need to cast to a concrete implementation that has enable method
        if (generator instanceof com.fasterxml.jackson.core.json.UTF8JsonGenerator) {
            ((com.fasterxml.jackson.core.json.UTF8JsonGenerator) generator).enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        }
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("123.456", getWrittenContent(generator));
    }

    // Test serialize within BigDecimalAsStringSerializer when WRITE_BIGDECIMAL_AS_PLAIN is enabled and scale is invalid (too large)
    @Test
    public void testBigDecimalAsStringSerializerSerializeInvalidScaleTooLarge() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        // Create a BigDecimal with a scale larger than MAX_BIG_DECIMAL_SCALE (9999)
        StringBuilder sb = new StringBuilder("1.");
        for (int i = 0; i < 10000; i++) {
            sb.append("0");
        }
        BigDecimal value = new BigDecimal(sb.toString());

        JsonGenerator generator = createGenerator();
        if (generator instanceof com.fasterxml.jackson.core.json.UTF8JsonGenerator) {
            ((com.fasterxml.jackson.core.json.UTF8JsonGenerator) generator).enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        }
        SerializerProvider provider = mockSerializerProvider(); // Need a provider to reportMappingProblem

        // The serialization of BigDecimal with invalid scale when WRITE_BIGDECIMAL_AS_PLAIN is enabled
        // is supposed to call reportMappingProblem on the SerializerProvider.
        // We need to mock this behavior.
        try {
            serializer.serialize(value, generator, provider);
            fail("Expected reportMappingProblem to be called.");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("illegal scale"));
        } catch (Exception e) {
            // Catch other potential exceptions if reportMappingProblem doesn't throw JsonMappingException directly
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

    // Test serialize within BigDecimalAsStringSerializer when WRITE_BIGDECIMAL_AS_PLAIN is disabled
    @Test
    public void testBigDecimalAsStringSerializerSerializeNoPlainEnabled() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        BigDecimal value = new BigDecimal("123.456");
        JsonGenerator generator = createGenerator();
        // WRITE_BIGDECIMAL_AS_PLAIN is disabled by default
        serializer.serialize(value, generator, null);
        generator.flush();
        assertEquals("123.456", getWrittenContent(generator));
    }

    // Test isEmpty for BigDecimalAsStringSerializer
    @Test
    public void testBigDecimalAsStringSerializerIsEmpty() throws Exception {
        JsonSerializer<?> serializer = NumberSerializer.bigDecimalAsStringSerializer();
        // The isEmpty method in BigDecimalAsStringSerializer calls valueToString(value).isEmpty().
        // valueToString() is not meant to be called directly and throws IllegalStateException.
        // However, isEmpty checks the string representation.
        // BigDecimal.ZERO.toString() is "0", which is not empty.
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
            // The valueToString method is declared as abstract in ToStringSerializerBase
            // and the implementation in BigDecimalAsStringSerializer throws an exception.
            serializer.valueToString(BigDecimal.ONE); // Passing a BigDecimal as per the method signature in the superclass
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // Expected exception
        }
    }

    // Mock SerializerProvider to provide a dummy format value and other necessary mocks
    private SerializerProvider mockSerializerProviderWithFormat(JsonFormat.Value format) throws JsonMappingException {
        SerializerProvider provider = Mockito.mock(SerializerProvider.class);
        BeanProperty property = Mockito.mock(BeanProperty.class);

        // Mock findFormatOverrides to return the provided format for the property
        Mockito.when(property.findFormatOverrides(null)).thenReturn(format);

        // Mock getContextualType if needed by the serializer. In this case, it seems not directly used by createContextual logic.
        // However, to be safe and to avoid potential NPEs if other parts of SerializerProvider are implicitly called:
        JavaType dummyType = Mockito.mock(JavaType.class);
        Mockito.when(provider.getContextualType()).thenReturn(dummyType);

        // Mock other methods that might be called indirectly, like reportProblem
        // For this specific test, it seems not strictly necessary, but good practice for robust mocking.
        Mockito.doReturn(null).when(provider).reportProblem(Mockito.anyString());

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
```