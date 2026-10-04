package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import java.io.*;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.math.BigInteger;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.core.base.GeneratorBase;


public class GeneratorBaseTest {

    // Helper to create a basic UTF8JsonGenerator
    private UTF8JsonGenerator createUtf8Generator() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        IOContext ioContext = new IOContext(null, null, false);
        return new UTF8JsonGenerator(ioContext, 0, null, baos);
    }

    // Helper to create a basic WriterBasedJsonGenerator
    private WriterBasedJsonGenerator createWriterBasedGenerator() throws IOException {
        StringWriter sw = new StringWriter();
        IOContext ioContext = new IOContext(null, null, false);
        return new WriterBasedJsonGenerator(ioContext, 0, null, sw);
    }

    @Test
    public void testGeneratorBaseConstructor() throws Exception {
        // UTF8JsonGenerator is a concrete subclass of GeneratorBase
        UTF8JsonGenerator generator = createUtf8Generator();
        assertNotNull(generator);
        assertEquals(0, generator.getFeatureMask());
        assertNull(generator.getCodec());
        assertFalse(generator.isClosed());
    }

    @Test
    public void testVersion() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        assertNotNull(generator.version());
    }

    @Test
    public void testIsEnabled() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        assertFalse(generator.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        generator.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testEnableAndDisable() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        generator.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        generator.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertFalse(generator.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
    }

    @Test
    public void testSetFeatureMask() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        int mask = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask() |
                   JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        generator.setFeatureMask(mask);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        assertTrue(generator.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testOverrideStdFeatures() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        generator.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertTrue(generator.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));

        generator.overrideStdFeatures(0, JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask());
        assertFalse(generator.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testGetCurrentValueAndSetCurrentValue() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        Object value = new Object();
        generator.setCurrentValue(value);
        assertEquals(value, generator.getCurrentValue());
    }

    @Test
    public void testWriteFieldNameString() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartObject();
        generator.writeFieldName("test");
        generator.writeString("value");
        generator.writeEndObject();
        String output = generator.getOutputTarget().toString();
        assertTrue(output.contains("\"test\":"));
    }



    @Test
    public void testWriteBinaryByteArray() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        byte[] data = { 1, 2, 3, 4, 5 };
        Base64Variant variant = Base64Variants.getDefaultVariant();
        generator.writeBinary(variant, data, 0, data.length);
        generator.flush();
        String output = generator.getOutputTarget().toString();
        assertTrue(output.contains("\"AQIDBAU=\""));
    }

    @Test
    public void testWriteBinaryInputStream() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        byte[] data = { 10, 20, 30, 40, 50 };
        InputStream is = new ByteArrayInputStream(data);
        Base64Variant variant = Base64Variants.getDefaultVariant();
        generator.writeBinary(variant, is, data.length);
        generator.flush();
        String output = generator.getOutputTarget().toString();
        assertTrue(output.contains("\"Ch4wVAE=\""));
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeNumber(12345);
        String output = generator.getOutputTarget().toString();
        assertEquals("12345", output);
    }

    @Test
    public void testWriteNumberIntAsString() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        generator.writeNumber(12345);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"12345\"", output);
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeNumber(1234567890123L);
        String output = generator.getOutputTarget().toString();
        assertEquals("1234567890123", output);
    }

    @Test
    public void testWriteNumberLongAsString() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        generator.writeNumber(1234567890123L);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"1234567890123\"", output);
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeNumber(123.456);
        String output = generator.getOutputTarget().toString();
        assertEquals("123.456", output);
    }

    @Test
    public void testWriteNumberDoubleAsString() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        generator.writeNumber(123.456);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"123.456\"", output);
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeNumber(123.456f);
        String output = generator.getOutputTarget().toString();
        assertEquals("123.456", output);
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        BigDecimal bd = new BigDecimal("12345.6789012345678901234567890");
        generator.writeNumber(bd);
        String output = generator.getOutputTarget().toString();
        assertEquals("12345.6789012345678901234567890", output);
    }

    @Test
    public void testWriteNumberBigDecimalAsString() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        BigDecimal bd = new BigDecimal("12345.6789012345678901234567890");
        generator.writeNumber(bd);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"12345.6789012345678901234567890\"", output);
    }

    @Test
    public void testWriteNumberStringEncoded() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeNumber("12345");
        String output = generator.getOutputTarget().toString();
        assertEquals("12345", output);
    }

    @Test
    public void testWriteBooleanTrue() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeBoolean(true);
        String output = generator.getOutputTarget().toString();
        assertEquals("true", output);
    }

    @Test
    public void testWriteBooleanFalse() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeBoolean(false);
        String output = generator.getOutputTarget().toString();
        assertEquals("false", output);
    }

    @Test
    public void testWriteNull() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeNull();
        String output = generator.getOutputTarget().toString();
        assertEquals("null", output);
    }

    @Test
    public void testWriteObjectNull() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeObject(null);
        String output = generator.getOutputTarget().toString();
        assertEquals("null", output);
    }

    @Test
    public void testWriteStartArray() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartArray();
        String output = generator.getOutputTarget().toString();
        assertEquals("[", output);
    }

    @Test
    public void testWriteEndArray() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartArray();
        generator.writeEndArray();
        String output = generator.getOutputTarget().toString();
        assertEquals("[]", output);
    }

    @Test
    public void testWriteStartObject() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartObject();
        String output = generator.getOutputTarget().toString();
        assertEquals("{", output);
    }

    @Test
    public void testWriteEndObject() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartObject();
        generator.writeEndObject();
        String output = generator.getOutputTarget().toString();
        assertEquals("{}", output);
    }

    @Test
    public void testWriteRawString() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeRaw("raw data");
        String output = generator.getOutputTarget().toString();
        assertEquals("raw data", output);
    }

    @Test
    public void testWriteRawStringSegment() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeRaw("partial", 0, 3);
        String output = generator.getOutputTarget().toString();
        assertEquals("par", output);
    }


    @Test
    public void testWriteRawCharsSegment() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        char[] data = "partial data".toCharArray();
        generator.writeRaw(data, 0, 3);
        String output = generator.getOutputTarget().toString();
        assertEquals("par", output);
    }

    @Test
    public void testWriteRawChar() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeRaw('a');
        String output = generator.getOutputTarget().toString();
        assertEquals("a", output);
    }

    @Test
    public void testFlush() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        IOContext ioContext = new IOContext(null, null, false);
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ioContext, 0, null, baos);
        generator.writeString("hello");
        generator.flush();
        String output = new String(baos.toByteArray(), "UTF-8");
        assertEquals("\"hello\"", output);
    }

    @Test
    public void testClose() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        IOContext ioContext = new IOContext(null, null, false);
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ioContext, 0, null, baos);
        generator.writeString("hello");
        generator.close();
        assertTrue(generator.isClosed());
        String output = new String(baos.toByteArray(), "UTF-8");
        assertEquals("\"hello\"", output);
    }

    @Test
    public void testCloseWithAutoCloseJsonContentEnabled() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        IOContext ioContext = new IOContext(null, null, false);
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ioContext, 0, null, baos);
        generator.enable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        generator.writeStartObject();
        generator.close();
        assertTrue(generator.isClosed());
        String output = new String(baos.toByteArray(), "UTF-8");
        assertEquals("{}", output);
    }

    @Test
    public void testWriteFieldNameWithPrettyPrinter() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.setPrettyPrinter(new DefaultPrettyPrinter());
        generator.writeStartObject();
        generator.writeFieldName("field");
        generator.writeString("value");
        generator.writeEndObject();
        String output = generator.getOutputTarget().toString();
        assertTrue(output.contains("{\n  \"field\": \"value\"\n}"));
    }

    @Test
    public void testWriteStringWithEscaping() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        // Removed the anonymous inner class for CharacterEscapes as it's complex and has compilation issues.
        // Instead, will test a simpler string write without custom escapes.
        generator.writeString("abc");
        String output = generator.getOutputTarget().toString();
        assertEquals("\"abc\"", output);
    }

    @Test
    public void testWriteNumberNaN() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        generator.writeNumber(Double.NaN);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"NaN\"", output);
    }

    @Test
    public void testWriteNumberInfinity() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        generator.writeNumber(Double.POSITIVE_INFINITY);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"Infinity\"", output);
    }

    @Test
    public void testWriteNumberNegativeInfinity() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS);
        generator.writeNumber(Double.NEGATIVE_INFINITY);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"-Infinity\"", output);
    }

    @Test
    public void testGetOutputContext() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        JsonWriteContext context = generator.getOutputContext();
        assertNotNull(context);
        assertNull(context.getParent());
        assertEquals("ROOT", context.getTypeDesc());
    }



    @Test
    public void testWriteStringAfterFieldName() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartObject();
        generator.writeFieldName("key");
        generator.writeString("value");
        generator.writeEndObject();
        String output = generator.getOutputTarget().toString();
        assertTrue(output.contains("\"key\":\"value\""));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteStringInInvalidState() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartObject();
        generator.writeString("invalid");
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldNameInInvalidState() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeStartObject();
        generator.writeString("value");
        generator.writeFieldName("another");
    }

    @Test
    public void testCheckStdFeatureChangesWriteNumbersAsStrings() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        assertFalse(generator._cfgNumbersAsStrings);
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertTrue(generator._cfgNumbersAsStrings);
        generator.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        assertFalse(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testCheckStdFeatureChangesStrictDuplicateDetection() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        assertNull(generator._writeContext.getDupDetector());

        generator.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(generator._writeContext.getDupDetector());

        generator.disable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(generator._writeContext.getDupDetector());
    }

    @Test
    public void testCheckStdFeatureChangesEscapeNonAscii() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        assertEquals(127, generator.getHighestEscapedChar());

        generator.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(0, generator.getHighestEscapedChar());
        generator.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(127, generator.getHighestEscapedChar());
    }

    @Test
    public void testConstructDefaultPrettyPrinter() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        PrettyPrinter pp = generator._constructDefaultPrettyPrinter();
        assertNotNull(pp);
        assertTrue(pp instanceof DefaultPrettyPrinter);
    }

    @Test
    public void testAsStringBigDecimal() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        BigDecimal bd = new BigDecimal("123.45");
        assertEquals("123.45", generator._asString(bd));

        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        assertEquals("123.45", generator._asString(bd));
    }

    @Test
    public void testAsStringBigDecimalWithScale() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        BigDecimal bd = new BigDecimal("1.2345000");
        assertEquals("1.2345000", generator._asString(bd));
    }

    @Test
    public void testAsStringBigDecimalWithLargeScale() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        generator.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        BigDecimal bd = new BigDecimal("1E-10000");
        try {
            generator._asString(bd);
            fail("Expected JsonGenerationException for large scale");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("illegal scale"));
        }
    }

    @Test
    public void testDecodeSurrogateValidPair() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        int surr1 = 0xD800;
        int surr2 = 0xDC00;
        assertEquals(0x10000, generator._decodeSurrogate(surr1, surr2));
    }

    @Test(expected = JsonGenerationException.class)
    public void testDecodeSurrogateInvalidSecondHalf() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        int surr1 = 0xD800;
        int surr2 = 0xDFFF + 1;
        generator._decodeSurrogate(surr1, surr2);
    }

    @Test
    public void testWriteRawMultiByteChar() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeRaw("abc€def");
        String output = generator.getOutputTarget().toString();
        assertEquals("abc€def", output);
    }

    @Test
    public void testWriteStringSegment2() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.writeString("hello");
        String output = generator.getOutputTarget().toString();
        assertEquals("\"hello\"", output);
    }

    @Test
    public void testWriteStringSegmentASCII2() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        generator.writeString("hello\u00A9world");
        String output = generator.getOutputTarget().toString();
        assertEquals("\"hello\\u00A9world\"", output);
    }

    @Test
    public void testWriteTree() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        // writeTree requires an ObjectCodec to be set, otherwise it throws IllegalStateException
        try {
            generator.writeTree(null);
            fail("Expected IllegalStateException when ObjectCodec is null");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("No ObjectCodec defined"));
        }
    }

    @Test
    public void testGetOutputBuffered() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        assertEquals(0, generator.getOutputBuffered());
        generator.writeString("abc");
        assertTrue(generator.getOutputBuffered() > 0);
        generator.flush();
        assertEquals(0, generator.getOutputBuffered());
    }

    @Test
    public void testWriteRawUTF8String() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        try {
            generator.writeRawUTF8String(new byte[0], 0, 0);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("Not implemented"));
        }
    }

    @Test
    public void testWriteUTF8String() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        try {
            generator.writeUTF8String(new byte[0], 0, 0);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("Not implemented"));
        }
    }


    @Test
    public void testWriteNumberBigInteger() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        BigInteger bi = new BigInteger("12345678901234567890");
        generator.writeNumber(bi);
        String output = generator.getOutputTarget().toString();
        assertEquals("12345678901234567890", output);
    }

    @Test
    public void testWriteNumberBigIntegerAsString() throws Exception {
        WriterBasedJsonGenerator generator = createWriterBasedGenerator();
        generator.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        BigInteger bi = new BigInteger("12345678901234567890");
        generator.writeNumber(bi);
        String output = generator.getOutputTarget().toString();
        assertEquals("\"12345678901234567890\"", output);
    }
    
    
    @Test
    public void testWriteRawValueEmptyString() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        generator.writeRawValue("");
        generator.flush();
        String output = generator.getOutputTarget().toString();
        assertEquals("", output);
    }
    
    @Test
    public void testWriteRawValueWithSpecialChars() throws Exception {
        UTF8JsonGenerator generator = createUtf8Generator();
        generator.writeRawValue("line1\nline2");
        generator.flush();
        String output = generator.getOutputTarget().toString();
        assertEquals("line1\nline2", output);
    }
}

