package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.util.BufferRecycler; // Added import for BufferRecycler
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter; // Added import for DefaultPrettyPrinter
import com.fasterxml.jackson.core.util.TextBuffer; // Added import for TextBuffer

public class UTF8JsonGeneratorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a basic UTF8JsonGenerator
    private UTF8JsonGenerator createGenerator() throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), "", false); // Provide a BufferRecycler
        OutputStream stream = new ByteArrayOutputStream();
        return new UTF8JsonGenerator(ctxt, 0, null, stream);
    }

    // Helper method to create a UTF8JsonGenerator with a specific feature enabled
    private UTF8JsonGenerator createGenerator(int features) throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), "", false); // Provide a BufferRecycler
        OutputStream stream = new ByteArrayOutputStream();
        return new UTF8JsonGenerator(ctxt, features, null, stream);
    }

    // Helper method to get the output as a String
    private String getOutput(UTF8JsonGenerator generator) throws IOException {
        generator.flush();
        // Safely cast to ByteArrayOutputStream
        ByteArrayOutputStream baos = (ByteArrayOutputStream) generator.getOutputTarget();
        if (baos == null) {
            throw new IllegalStateException("Output stream is null after flush.");
        }
        return baos.toString("UTF-8");
    }

    @Test
    public void testWriteFieldNameWithSimpleName() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeFieldName("test");
        assertEquals("\"test\"", getOutput(generator));
    }

    @Test
    public void testWriteFieldNameWithEmptyName() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeFieldName("");
        assertEquals("\"\"", getOutput(generator));
    }

    @Test
    public void testWriteFieldNameWithSpecialChars() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeFieldName("field\tname");
        assertEquals("\"field\\tname\"", getOutput(generator));
    }

    @Test
    public void testWriteFieldNameWithNonAsciiChars() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        // Enable ASCII escaping by setting highest non-escaped char to 127
        generator.setHighestNonEscapedChar(127);
        generator.writeFieldName("你好");
        assertEquals("\"\\u4f60\\u597d\"", getOutput(generator));
    }

    @Test
    public void testWriteStartArray() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeStartArray();
        assertEquals("[", getOutput(generator));
    }

    @Test
    public void testWriteEndArray() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeStartArray();
        generator.writeEndArray();
        assertEquals("[]", getOutput(generator));
    }

    @Test
    public void testWriteStartObject() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeStartObject();
        assertEquals("{", getOutput(generator));
    }

    @Test
    public void testWriteEndObject() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeStartObject();
        generator.writeEndObject();
        assertEquals("{}", getOutput(generator));
    }

    @Test
    public void testWriteStringSimple() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("hello");
        assertEquals("\"hello\"", getOutput(generator));
    }

    @Test
    public void testWriteStringEmpty() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("");
        assertEquals("\"\"", getOutput(generator));
    }

    @Test
    public void testWriteStringWithEscapedChars() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("line1\nline2");
        assertEquals("\"line1\\nline2\"", getOutput(generator));
    }

    @Test
    public void testWriteStringWithQuotes() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("He said \"Hello\"");
        assertEquals("\"He said \\\"Hello\\\"\"", getOutput(generator));
    }
    
    @Test
    public void testWriteStringWithBackslash() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("path\\to\\file");
        assertEquals("\"path\\\\to\\\\file\"", getOutput(generator));
    }

    @Test
    public void testWriteStringWithNonAscii() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.setHighestNonEscapedChar(127); // Enable ASCII escaping
        generator.writeString("你好世界");
        assertEquals("\"\\u4f60\\u597d\\u4e16\\u754c\"", getOutput(generator));
    }

    @Test
    public void testWriteStringWithLongString() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        String longString = sb.toString();
        generator.writeString(longString);
        // Ensure the output is correctly quoted and contains the string
        String output = getOutput(generator);
        assertTrue(output.startsWith("\""));
        assertTrue(output.endsWith("\""));
        assertEquals(longString.length() + 2, output.length());
    }
    
    @Test
    public void testWriteRawUTF8String() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        byte[] data = {(byte) 'a', (byte) 'b', (byte) 'c'};
        generator.writeRawUTF8String(data, 0, 3);
        assertEquals("\"abc\"", getOutput(generator));
    }
    
    @Test
    public void testWriteUTF8String() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        byte[] data = {(byte) 'a', (byte) 'b', (byte) 'c'};
        generator.writeUTF8String(data, 0, 3);
        assertEquals("\"abc\"", getOutput(generator));
    }

    @Test
    public void testWriteRawSimpleString() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeRaw("raw data");
        assertEquals("raw data", getOutput(generator));
    }

    @Test
    public void testWriteRawEmptyString() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeRaw("");
        assertEquals("", getOutput(generator));
    }
    

    @Test
    public void testWriteNumberShort() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber((short) 123);
        assertEquals("123", getOutput(generator));
    }

    @Test
    public void testWriteNumberShortMax() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Short.MAX_VALUE);
        assertEquals(String.valueOf(Short.MAX_VALUE), getOutput(generator));
    }

    @Test
    public void testWriteNumberShortMin() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Short.MIN_VALUE);
        assertEquals(String.valueOf(Short.MIN_VALUE), getOutput(generator));
    }

    @Test
    public void testWriteNumberInt() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(12345);
        assertEquals("12345", getOutput(generator));
    }

    @Test
    public void testWriteNumberIntMax() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Integer.MAX_VALUE);
        assertEquals(String.valueOf(Integer.MAX_VALUE), getOutput(generator));
    }

    @Test
    public void testWriteNumberIntMin() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Integer.MIN_VALUE);
        assertEquals(String.valueOf(Integer.MIN_VALUE), getOutput(generator));
    }

    @Test
    public void testWriteNumberLong() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(1234567890L);
        assertEquals("1234567890", getOutput(generator));
    }

    @Test
    public void testWriteNumberLongMax() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Long.MAX_VALUE);
        assertEquals(String.valueOf(Long.MAX_VALUE), getOutput(generator));
    }

    @Test
    public void testWriteNumberLongMin() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Long.MIN_VALUE);
        assertEquals(String.valueOf(Long.MIN_VALUE), getOutput(generator));
    }

    @Test
    public void testWriteNumberBigInteger() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        BigInteger bigInt = new BigInteger("12345678901234567890");
        generator.writeNumber(bigInt);
        assertEquals("12345678901234567890", getOutput(generator));
    }

    @Test
    public void testWriteNumberBigIntegerZero() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(BigInteger.ZERO);
        assertEquals("0", getOutput(generator));
    }

    @Test
    public void testWriteNumberDouble() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(123.456);
        assertEquals("123.456", getOutput(generator));
    }

    @Test
    public void testWriteNumberDoubleNaN() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        // QUOTE_NON_NUMERIC_NUMBERS is enabled by default
        generator.writeNumber(Double.NaN);
        assertEquals("\"NaN\"", getOutput(generator));
    }
    
    @Test
    public void testWriteNumberDoublePositiveInfinity() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Double.POSITIVE_INFINITY);
        assertEquals("\"Infinity\"", getOutput(generator));
    }

    @Test
    public void testWriteNumberDoubleNegativeInfinity() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Double.NEGATIVE_INFINITY);
        assertEquals("\"-Infinity\"", getOutput(generator));
    }

    @Test
    public void testWriteNumberFloat() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(123.456f);
        assertEquals("123.456", getOutput(generator));
    }

    @Test
    public void testWriteNumberFloatNaN() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber(Float.NaN);
        assertEquals("\"NaN\"", getOutput(generator));
    }

    @Test
    public void testWriteNumberBigDecimal() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        BigDecimal bigDec = new BigDecimal("123.45678901234567890");
        generator.writeNumber(bigDec);
        assertEquals("123.45678901234567890", getOutput(generator));
    }

    @Test
    public void testWriteNumberBigDecimalPlain() throws Exception {
        // Use Feature.WRITE_BIGDECIMAL_AS_PLAIN directly
        UTF8JsonGenerator generator = createGenerator(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask());
        BigDecimal bigDec = new BigDecimal("1.23E+2"); // Same as 123
        generator.writeNumber(bigDec);
        assertEquals("123", getOutput(generator));
    }

    @Test
    public void testWriteNumberStringEncoded() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNumber("98765");
        assertEquals("98765", getOutput(generator));
    }

    @Test
    public void testWriteNumberStringEncodedQuoted() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        // Feature.QUOTE_NON_NUMERIC_NUMBERS is enabled by default
        generator.writeNumber("98765");
        assertEquals("\"98765\"", getOutput(generator));
    }

    @Test
    public void testWriteBooleanTrue() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeBoolean(true);
        assertEquals("true", getOutput(generator));
    }

    @Test
    public void testWriteBooleanFalse() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeBoolean(false);
        assertEquals("false", getOutput(generator));
    }

    @Test
    public void testWriteNull() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeNull();
        assertEquals("null", getOutput(generator));
    }

    @Test
    public void testFlush() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("test flush");
        generator.flush();
        // The ByteArrayOutputStream will now contain the data
        assertEquals("\"test flush\"", ((ByteArrayOutputStream) generator.getOutputTarget()).toString("UTF-8"));
    }
    
    @Test
    public void testClose() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("test close");
        generator.close();
        // Closing should flush the buffer and potentially close the stream
        assertEquals("\"test close\"", ((ByteArrayOutputStream) generator.getOutputTarget()).toString("UTF-8"));
    }


    @Test
    public void testGetOutputBufferedZeroInitially() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        assertEquals(0, generator.getOutputBuffered());
    }

    @Test
    public void testGetOutputBufferedAfterWriting() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("hello"); // Writes to buffer
        // The length of "\"hello\"" is 7.
        assertEquals(7, generator.getOutputBuffered());
    }

    @Test
    public void testGetOutputBufferedAfterFlush() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeString("hello");
        generator.flush(); // Flushes buffer to stream
        assertEquals(0, generator.getOutputBuffered()); // Buffer is now empty
    }

    @Test
    public void testFieldNameAndValueSeparation() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeStartObject();
        generator.writeFieldName("key1");
        generator.writeString("value1");
        generator.writeFieldName("key2");
        generator.writeString("value2");
        generator.writeEndObject();
        assertEquals("{\"key1\":\"value1\",\"key2\":\"value2\"}", getOutput(generator));
    }

    @Test
    public void testArrayElementsSeparation() throws Exception {
        UTF8JsonGenerator generator = createGenerator();
        generator.writeStartArray();
        generator.writeString("item1");
        generator.writeNumber(123);
        generator.writeBoolean(true);
        generator.writeEndArray();
        assertEquals("[\"item1\",123,true]", getOutput(generator));
    }
    
    @Test
    public void testMaxBytesToBuffer() throws Exception {
        // Create a generator with a small buffer to force flushing
        IOContext ctxt = new IOContext(new BufferRecycler(), "", false);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Manually create a generator with a small buffer size
        byte[] buffer = new byte[16]; // Small buffer to trigger flush
        UTF8JsonGenerator generator = new UTF8JsonGenerator(ctxt, 0, null, baos, buffer, 0, true);

        String testString = "abcdefghijklmnopqrstuvwxyz0123456789"; // > 16 bytes
        generator.writeString(testString);
        generator.flush(); // Ensure all data is written

        String output = baos.toString("UTF-8");
        assertEquals("\"" + testString + "\"", output);
    }

}
