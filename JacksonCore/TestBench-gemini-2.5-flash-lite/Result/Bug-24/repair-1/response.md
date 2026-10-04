```java
package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;

public class ParserBaseTest {

    // Helper method to create a dummy IOContext
    private IOContext createIOContext() {
        return new IOContext(null, null, false);
    }

    // Helper method to create a dummy ReaderBasedJsonParser for testing
    private ReaderBasedJsonParser createReaderBasedJsonParser(String json) throws IOException {
        Reader reader = new StringReader(json);
        IOContext ctxt = createIOContext();
        ObjectCodec codec = null; // Not needed for these tests
        CharsToNameCanonicalizer st = CharsToNameCanonicalizer.createRoot(false);
        return new ReaderBasedJsonParser(ctxt, 0, reader, codec, st);
    }
    
    // Helper method to create a dummy UTF8StreamJsonParser for testing
    private UTF8StreamJsonParser createUTF8StreamJsonParser(byte[] jsonBytes) throws IOException {
        InputStream is = new ByteArrayInputStream(jsonBytes);
        IOContext ctxt = createIOContext();
        ObjectCodec codec = null; // Not needed for these tests
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        byte[] buffer = new byte[1024]; // Dummy buffer
        return new UTF8StreamJsonParser(ctxt, 0, is, codec, sym, buffer, 0, buffer.length, false);
    }

    @Test
    public void testGetCurrentValueAndSetCurrentValue() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{}");
        Object currentValue = new Object();
        parser.setCurrentValue(currentValue);
        assertEquals(currentValue, parser.getCurrentValue());
    }

    @Test
    public void testEnableAndDisableFeatures() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{}");
        parser.enable(Feature.ALLOW_COMMENTS);
        assertTrue(parser.isEnabled(Feature.ALLOW_COMMENTS));
        parser.disable(Feature.ALLOW_COMMENTS);
        assertFalse(parser.isEnabled(Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testSetFeatureMask() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{}");
        int initialMask = parser.getFeatureMask();
        int newMask = initialMask | Feature.ALLOW_SINGLE_QUOTES.getMask();
        parser.setFeatureMask(newMask);
        assertTrue(parser.isEnabled(Feature.ALLOW_SINGLE_QUOTES));
    }

    @Test
    public void testOverrideStdFeatures() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{}");
        int mask = Feature.ALLOW_JAVA_COMMENTS.getMask() | Feature.ALLOW_YAML_COMMENTS.getMask();
        int values = Feature.ALLOW_YAML_COMMENTS.getMask();
        parser.overrideStdFeatures(values, mask);
        assertTrue(parser.isEnabled(Feature.ALLOW_YAML_COMMENTS));
        assertFalse(parser.isEnabled(Feature.ALLOW_JAVA_COMMENTS));
    }
    
    @Test
    public void testGetTokenLocationForSimpleObject() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
        assertEquals(1, loc.getLineNr()); // Line numbers are 1-based.
        assertEquals(2, loc.getColumnNr()); // Column numbers are 1-based.
    }

    @Test
    public void testGetCurrentLocationForSimpleObject() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
        assertEquals(1, loc.getLineNr());
        assertEquals(2, loc.getColumnNr()); // After "{" and the opening quote of "a"
    }
    
    @Test
    public void testHasTextCharactersForFieldName() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"key\":\"value\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        assertTrue(parser.hasTextCharacters());
    }

    @Test
    public void testHasTextCharactersForValueString() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"key\":\"value\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        parser.nextToken(); // VALUE_STRING "value"
        assertTrue(parser.hasTextCharacters());
    }

    @Test
    public void testHasTextCharactersForNumber() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"key\":123}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        parser.nextToken(); // VALUE_NUMBER_INT 123
        assertFalse(parser.hasTextCharacters()); // Numbers don't typically expose text characters directly
    }

    @Test
    public void testGetBinaryValueUnsupported() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"key\":123}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        parser.nextToken(); // VALUE_NUMBER_INT 123
        try {
            parser.getBinaryValue(null); // Base64Variant not relevant here
            fail("Should throw exception for non-string token");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Current token (VALUE_NUMBER_INT) not VALUE_STRING"));
        }
    }
    
    @Test
    public void testGetTokenCharacterOffset() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        assertEquals(0, parser.getTokenCharacterOffset()); // Offset for the start of the token
    }

    @Test
    public void testGetTokenLineNr() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        assertEquals(1, parser.getTokenLineNr()); // Line number for the start of the token
    }

    @Test
    public void testGetTokenColumnNr() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        assertEquals(2, parser.getTokenColumnNr()); // Column number for the start of the token (1-based)
    }
    
    @Test
    public void testGetByteArrayBuilder() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        ByteArrayBuilder builder = parser._getByteArrayBuilder();
        assertNotNull(builder);
        assertEquals(0, builder.size());
    }
    
    @Test
    public void testIsNaN() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":NaN}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT NaN
        assertTrue(parser.isNaN());
    }

    @Test
    public void testGetNumberValueAsInt() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":123}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 123
        assertEquals(123, parser.getNumberValue());
    }

    @Test
    public void testGetNumberValueAsLong() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":9876543210}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 9876543210
        assertEquals(9876543210L, parser.getNumberValue());
    }

    @Test
    public void testGetNumberValueAsBigInteger() throws Exception {
        String bigNumStr = "98765432101234567890";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + bigNumStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigInteger(bigNumStr), parser.getNumberValue());
    }

    @Test
    public void testGetNumberValueAsDouble() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":123.45}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT 123.45
        assertEquals(123.45, (Double) parser.getNumberValue(), 1e-9);
    }

    @Test
    public void testGetNumberValueAsBigDecimal() throws Exception {
        String bigDecStr = "12345.67890123456789";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + bigDecStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(bigDecStr), parser.getNumberValue());
    }

    @Test
    public void testGetNumberTypeInt() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":123}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 123
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeLong() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":9876543210}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 9876543210
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeBigInteger() throws Exception {
        String bigNumStr = "98765432101234567890";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + bigNumStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeDouble() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":123.45}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT 123.45
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeBigDecimal() throws Exception {
        String bigDecStr = "12345.67890123456789";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + bigDecStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
    }

    @Test
    public void testGetIntValueExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":42}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 42
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testGetIntValueOverflow() throws Exception {
        String largeIntStr = "2147483648"; // Integer.MAX_VALUE + 1
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + largeIntStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT
        try {
            parser.getIntValue();
            fail("Should throw InputCoercionException for overflow");
        } catch (InputCoercionException e) {
            assertTrue(e.getMessage().contains("out of range of int"));
        }
    }
    
    @Test
    public void testGetLongValueExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":9223372036854775807}"); // Long.MAX_VALUE
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
    }

    @Test
    public void testGetLongValueOverflow() throws Exception {
        String tooLargeLongStr = "9223372036854775808"; // Long.MAX_VALUE + 1
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + tooLargeLongStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT
        try {
            parser.getLongValue();
            fail("Should throw InputCoercionException for overflow");
        } catch (InputCoercionException e) {
            assertTrue(e.getMessage().contains("out of range of long"));
        }
    }

    @Test
    public void testGetBigIntegerValueExact() throws Exception {
        String bigIntStr = "123456789012345678901234567890";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + bigIntStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigInteger(bigIntStr), parser.getBigIntegerValue());
    }

    @Test
    public void testGetFloatValueExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":3.14159}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(3.14159f, parser.getFloatValue(), 1e-9f);
    }
    
    @Test
    public void testGetDoubleValueExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1.7976931348623157E308}"); // Double.MAX_VALUE
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Double.MAX_VALUE, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testGetDoubleValueNaN() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":NaN}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT NaN
        assertTrue(Double.isNaN(parser.getDoubleValue()));
    }

    @Test
    public void testGetDecimalValueExact() throws Exception {
        String bigDecStr = "0.123456789012345678901234567890123456789";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + bigDecStr + "}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(bigDecStr), parser.getDecimalValue());
    }

    @Test
    public void testNextValueSkipsFieldName() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"key\":\"value\"}");
        parser.nextToken(); // START_OBJECT
        JsonToken next = parser.nextValue(); // Should be VALUE_STRING "value"
        assertEquals(JsonToken.VALUE_STRING, next);
        assertEquals("value", parser.getText());
    }

    @Test
    public void testSkipChildrenOnObject() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1, \"b\":{\"c\":2}}");
        parser.nextToken(); // START_OBJECT
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildrenOnArray() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("[1, [2, 3], 4]");
        parser.nextToken(); // START_ARRAY
        parser.skipChildren();
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testGetValueAsBooleanTrue() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":true}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_TRUE
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanFalse() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":false}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_FALSE
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanStringTrue() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":\"true\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_STRING "true"
        assertTrue(parser.getValueAsBoolean(false));
    }
    
    @Test
    public void testGetValueAsBooleanStringFalse() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":\"false\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_STRING "false"
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanNumericZero() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":0}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 0
        assertFalse(parser.getValueAsBoolean(true));
    }
    
    @Test
    public void testGetValueAsBooleanNumericNonZero() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 1
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsIntExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":123}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 123
        assertEquals(123, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntDefault() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":null}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NULL
        assertEquals(0, parser.getValueAsInt()); // Default is 0
        assertEquals(99, parser.getValueAsInt(99)); // Custom default
    }

    @Test
    public void testGetValueAsLongExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":9876543210}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 9876543210
        assertEquals(9876543210L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongDefault() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":false}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_FALSE
        assertEquals(0L, parser.getValueAsLong()); // Default is 0
        assertEquals(12345L, parser.getValueAsLong(12345L)); // Custom default
    }

    @Test
    public void testGetValueAsDoubleExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":123.45}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_FLOAT 123.45
        assertEquals(123.45, parser.getValueAsDouble(0.0), 1e-9);
    }

    @Test
    public void testGetValueAsDoubleDefault() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":\"hello\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_STRING "hello"
        assertEquals(0.0, parser.getValueAsDouble(0.0), 1e-9); // Default is 0.0
        assertEquals(5.5, parser.getValueAsDouble(5.5), 1e-9); // Custom default
    }
    
    @Test
    public void testGetValueAsStringExact() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":\"hello\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_STRING "hello"
        assertEquals("hello", parser.getValueAsString());
    }
    
    @Test
    public void testGetValueAsStringFieldName() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"key\":\"value\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "key"
        assertEquals("key", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringDefault() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":123}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_NUMBER_INT 123
        assertNull(parser.getValueAsString()); // Default is null
        assertEquals("default", parser.getValueAsString("default")); // Custom default
    }

    @Test
    public void testCloseInputStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        UTF8StreamJsonParser parser = createUTF8StreamJsonParser("{}".getBytes());
        parser.close();
        assertTrue(parser.isClosed());
    }
    
    @Test
    public void testReleaseBuffers() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1}");
        parser.close(); // Should release buffers
        assertTrue(parser.isClosed());
    }
    
    @Test
    public void testHandleEOFInRootContext() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("");
        try {
            parser.nextToken(); 
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            // Expected
        }
    }

    @Test
    public void testHandleEOFInArrayContext() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("[");
        parser.nextToken(); // START_ARRAY
        try {
            parser.nextToken(); // Should trigger _handleEOF
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            assertTrue(e.getMessage().contains("Unexpected end-of-input"));
            assertTrue(e.getMessage().contains("expected close marker for Array"));
        }
    }
    
    @Test
    public void testHandleEOFInObjectContext() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{");
        parser.nextToken(); // START_OBJECT
        try {
            parser.nextToken(); // Should trigger _handleEOF
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            assertTrue(e.getMessage().contains("Unexpected end-of-input"));
            assertTrue(e.getMessage().contains("expected close marker for Object"));
        }
    }

    @Test
    public void testParseNumericValue_MaxInt() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":2147483647}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(2147483647, parser.getIntValue());
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testParseNumericValue_MaxIntPlusOne() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":2147483648}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(2147483648L, parser.getLongValue()); // Should parse as long
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
    }

    @Test
    public void testParseNumericValue_MinLong() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":-9223372036854775808}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Long.MIN_VALUE, parser.getLongValue());
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
    }

    @Test
    public void testParseNumericValue_FloatValue() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1.23e-5}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(1.23e-5, parser.getDoubleValue(), 1e-15);
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testParseNumericValue_FloatNaN() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":NaN}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertTrue(parser.isNaN());
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }
    
    @Test
    public void testParseNumericValue_FloatInfinity() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":Infinity}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertTrue(parser.isNaN()); // Infinity is considered NaN by isNaN()
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0);
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }
    
    @Test
    public void testParseNumericValue_FloatNegativeInfinity() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":-Infinity}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertTrue(parser.isNaN()); // -Infinity is considered NaN by isNaN()
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0);
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testParseSlowFloat_BigDecimalRequest() throws Exception {
        String preciseNum = "1234567890.1234567890";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + preciseNum + "}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(preciseNum), parser.getDecimalValue());
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
    }

    @Test
    public void testParseSlowInt_BigIntegerRequest() throws Exception {
        String veryLargeNum = "1234567890123456789012345678901234567890";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + veryLargeNum + "}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigInteger(veryLargeNum), parser.getBigIntegerValue());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
    }

    @Test
    public void testConvertNumberToInt_Overflow() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":2147483648}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_INT
        try {
            parser.getIntValue(); // This will trigger convertNumberToInt
            fail("Should throw InputCoercionException");
        } catch (InputCoercionException e) {
            assertTrue(e.getMessage().contains("out of range of int"));
        }
    }

    @Test
    public void testConvertNumberToLong_Overflow() throws Exception {
        String tooLargeLongStr = "9223372036854775808"; // Long.MAX_VALUE + 1
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + tooLargeLongStr + "}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_INT
        try {
            parser.getLongValue(); // This will trigger convertNumberToLong
            fail("Should throw InputCoercionException");
        } catch (InputCoercionException e) {
            assertTrue(e.getMessage().contains("out of range of long"));
        }
    }

    @Test
    public void testConvertNumberToDouble_fromBigInteger() throws Exception {
        String largeNumStr = "12345678901234567890";
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":" + largeNumStr + "}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_INT
        // Requesting double value should trigger conversion
        double doubleValue = parser.getDoubleValue();
        assertEquals(new BigInteger(largeNumStr).doubleValue(), doubleValue, 1e-9);
    }
    
    @Test
    public void testConvertNumberToBigDecimal_fromDouble() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":1.234567890123456789E10}");
        parser.nextToken(); 
        parser.nextToken(); 
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        BigDecimal decimalValue = parser.getDecimalValue();
        assertEquals(parser.getDoubleValue(), decimalValue.doubleValue(), 1e-9);
    }
    
    @Test
    public void testReportMismatchedEndMarker() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("[1,"); // Incomplete array
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_NUMBER_INT 1
        try {
            parser.nextToken(); 
            fail("Should throw exception for mismatched end marker");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unexpected close marker"));
            assertTrue(e.getMessage().contains("expected ']'"));
        }
    }

    @Test
    public void testHandleUnrecognizedCharacterEscape_AllowAny() throws Exception {
        ReaderBasedJsonParser parser = createReaderBasedJsonParser("{\"a\":\"\\x\"}");
        parser.enable(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        parser.nextToken(); // VALUE_STRING "x"
        assertEquals("\\x", parser.getText()); // The escaped character should be preserved
    }

    // Test for _throwUnquotedSpace - Difficult to trigger directly and reliably without internal access or mocks.
    // The method itself is protected and its invocation depends on parsing state that's complex to set up.
    // We'll omit this test for now.

    // Test for _decodeBase64 - This is a protected helper.
    // To test it, we'd need to call it from a concrete subclass or mock it.
    // Given the constraints, we'll rely on tests that implicitly use it if possible,
    // or omit direct testing of this protected method.
}
```