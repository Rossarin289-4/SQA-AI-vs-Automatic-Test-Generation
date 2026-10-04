package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;

public class TypeAdaptersTest {
    @Test
    public void testBitSetReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = adapter.read(reader);
        assertNull(bitset);
    }

    @Test
    public void testBitSetReadEmptyArray() throws Exception {
        String json = "[]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = adapter.read(reader);
        assertNotNull(bitset);
        assertEquals(0, bitset.length());
    }

    @Test
    public void testBitSetReadBooleanArray() throws Exception {
        String json = "[true, false, true, true]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = adapter.read(reader);
        assertNotNull(bitset);
        assertTrue(bitset.get(0));
        assertFalse(bitset.get(1));
        assertTrue(bitset.get(2));
        assertTrue(bitset.get(3));
        assertEquals(4, bitset.length());
    }

    @Test
    public void testBitSetReadNumberArray() throws Exception {
        String json = "[1, 0, 1, 0, 1]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = adapter.read(reader);
        assertNotNull(bitset);
        assertTrue(bitset.get(0));
        assertFalse(bitset.get(1));
        assertTrue(bitset.get(2));
        assertFalse(bitset.get(3));
        assertTrue(bitset.get(4));
        assertEquals(5, bitset.length());
    }

    @Test
    public void testBitSetReadMixedArray() throws Exception {
        String json = "[true, 0, 1, false]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = adapter.read(reader);
        assertNotNull(bitset);
        assertTrue(bitset.get(0));
        assertFalse(bitset.get(1));
        assertTrue(bitset.get(2));
        assertFalse(bitset.get(3));
        assertEquals(4, bitset.length());
    }

    @Test
    public void testBitSetReadStringArray() throws Exception {
        String json = "[\"1\", \"0\", \"1\"]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = adapter.read(reader);
        assertNotNull(bitset);
        assertTrue(bitset.get(0));
        assertFalse(bitset.get(1));
        assertTrue(bitset.get(2));
        assertEquals(3, bitset.length());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadStringArrayInvalid() throws Exception {
        String json = "[\"abc\"]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        adapter.read(reader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadInvalidType() throws Exception {
        String json = "[{}]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        adapter.read(reader);
    }

    @Test
    public void testBitSetWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testBitSetWriteEmpty() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = new BitSet();
        adapter.write(jsonWriter, bitset);
        assertEquals("[]", writer.toString());
    }

    @Test
    public void testBitSetWriteBasic() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet bitset = new BitSet();
        bitset.set(0);
        bitset.set(2);
        bitset.set(3);
        adapter.write(jsonWriter, bitset);
        assertEquals("[1,0,1,1]", writer.toString());
    }

    @Test
    public void testBooleanReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        Boolean value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testBooleanReadTrue() throws Exception {
        String json = "true";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        Boolean value = adapter.read(reader);
        assertTrue(value);
    }

    @Test
    public void testBooleanReadFalse() throws Exception {
        String json = "false";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        Boolean value = adapter.read(reader);
        assertFalse(value);
    }

    @Test
    public void testBooleanReadStringTrue() throws Exception {
        String json = "\"true\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        Boolean value = adapter.read(reader);
        assertTrue(value);
    }

    @Test
    public void testBooleanReadStringFalse() throws Exception {
        String json = "\"false\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        Boolean value = adapter.read(reader);
        assertFalse(value);
    }

    @Test
    public void testBooleanWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testBooleanWriteTrue() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        adapter.write(jsonWriter, true);
        assertEquals("true", writer.toString());
    }

    @Test
    public void testBooleanWriteFalse() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        adapter.write(jsonWriter, false);
        assertEquals("false", writer.toString());
    }

    @Test
    public void testBooleanAsStringWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testBooleanAsStringWriteTrue() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        adapter.write(jsonWriter, true);
        assertEquals("\"true\"", writer.toString());
    }

    @Test
    public void testBooleanAsStringWriteFalse() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        adapter.write(jsonWriter, false);
        assertEquals("\"false\"", writer.toString());
    }

    @Test
    public void testBooleanAsStringReadStringTrue() throws Exception {
        String json = "\"true\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        Boolean value = adapter.read(reader);
        assertTrue(value);
    }

    @Test
    public void testBooleanAsStringReadStringFalse() throws Exception {
        String json = "\"false\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        Boolean value = adapter.read(reader);
        assertFalse(value);
    }

    @Test
    public void testBooleanAsStringReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        Boolean value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testByteReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        Number value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testByteReadNumber() throws Exception {
        String json = "123";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        Number value = adapter.read(reader);
        assertEquals((byte) 123, value.byteValue());
    }

    @Test
    public void testByteReadMax() throws Exception {
        String json = "127";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        Number value = adapter.read(reader);
        assertEquals((byte) 127, value.byteValue());
    }

    @Test
    public void testByteReadMin() throws Exception {
        String json = "-128";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        Number value = adapter.read(reader);
        assertEquals((byte) -128, value.byteValue());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testByteReadTooLarge() throws Exception {
        String json = "128";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        adapter.read(reader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testByteReadTooSmall() throws Exception {
        String json = "-129";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        adapter.read(reader);
    }

    @Test
    public void testShortReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        Number value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testShortReadNumber() throws Exception {
        String json = "12345";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        Number value = adapter.read(reader);
        assertEquals((short) 12345, value.shortValue());
    }

    @Test
    public void testShortReadMax() throws Exception {
        String json = "32767";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        Number value = adapter.read(reader);
        assertEquals((short) 32767, value.shortValue());
    }

    @Test
    public void testShortReadMin() throws Exception {
        String json = "-32768";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        Number value = adapter.read(reader);
        assertEquals((short) -32768, value.shortValue());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testShortReadTooLarge() throws Exception {
        String json = "32768";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        adapter.read(reader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testShortReadTooSmall() throws Exception {
        String json = "-32769";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        adapter.read(reader);
    }

    @Test
    public void testIntegerReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        Number value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testIntegerReadNumber() throws Exception {
        String json = "123456789";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        Number value = adapter.read(reader);
        assertEquals(123456789, value.intValue());
    }

    @Test
    public void testIntegerReadMax() throws Exception {
        String json = "2147483647";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        Number value = adapter.read(reader);
        assertEquals(Integer.MAX_VALUE, value.intValue());
    }

    @Test
    public void testIntegerReadMin() throws Exception {
        String json = "-2147483648";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        Number value = adapter.read(reader);
        assertEquals(Integer.MIN_VALUE, value.intValue());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testIntegerReadTooLarge() throws Exception {
        String json = "2147483648";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        adapter.read(reader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testIntegerReadTooSmall() throws Exception {
        String json = "-2147483649";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        adapter.read(reader);
    }

    @Test
    public void testLongReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        Number value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testLongReadNumber() throws Exception {
        String json = "9223372036854775807";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        Number value = adapter.read(reader);
        assertEquals(Long.MAX_VALUE, value.longValue());
    }

    @Test
    public void testLongReadMin() throws Exception {
        String json = "-9223372036854775808";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        Number value = adapter.read(reader);
        assertEquals(Long.MIN_VALUE, value.longValue());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testLongReadTooLarge() throws Exception {
        String json = "9223372036854775808";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        adapter.read(reader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testLongReadTooSmall() throws Exception {
        String json = "-9223372036854775809";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        adapter.read(reader);
    }

    @Test
    public void testFloatReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        Number value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testFloatReadNumber() throws Exception {
        String json = "123.456";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        Number value = adapter.read(reader);
        assertEquals(123.456f, value.floatValue(), 1e-6f);
    }

    @Test
    public void testFloatReadMax() throws Exception {
        String json = "3.4028235E38";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        Number value = adapter.read(reader);
        assertEquals(Float.MAX_VALUE, value.floatValue(), 1e-6f);
    }

    @Test
    public void testFloatReadMinPositive() throws Exception {
        String json = "1.4E-45";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        Number value = adapter.read(reader);
        assertEquals(Float.MIN_VALUE, value.floatValue(), 1e-6f);
    }

    @Test
    public void testDoubleReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        Number value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testDoubleReadNumber() throws Exception {
        String json = "123.4567890123";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        Number value = adapter.read(reader);
        assertEquals(123.4567890123, value.doubleValue(), 1e-9);
    }

    @Test
    public void testDoubleReadMax() throws Exception {
        String json = "1.7976931348623157E308";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        Number value = adapter.read(reader);
        assertEquals(Double.MAX_VALUE, value.doubleValue(), 1e-9);
    }

    @Test
    public void testDoubleReadMinPositive() throws Exception {
        String json = "4.9E-324";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        Number value = adapter.read(reader);
        assertEquals(Double.MIN_VALUE, value.doubleValue(), 1e-9);
    }

    @Test
    public void testNumberReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        Number value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testNumberReadInteger() throws Exception {
        String json = "123";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        Number value = adapter.read(reader);
        assertEquals(123, value.intValue());
        assertTrue(value instanceof LazilyParsedNumber);
    }

    @Test
    public void testNumberReadDouble() throws Exception {
        String json = "123.456";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        Number value = adapter.read(reader);
        assertEquals(123.456, value.doubleValue(), 1e-9);
        assertTrue(value instanceof LazilyParsedNumber);
    }

    @Test
    public void testNumberReadLong() throws Exception {
        String json = "9223372036854775807";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        Number value = adapter.read(reader);
        assertEquals(Long.MAX_VALUE, value.longValue());
        assertTrue(value instanceof LazilyParsedNumber);
    }

    @Test
    public void testNumberReadBigInteger() throws Exception {
        String json = "9223372036854775808"; // larger than Long.MAX_VALUE
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        Number value = adapter.read(reader);
        assertEquals(new BigInteger("9223372036854775808"), value);
        assertTrue(value instanceof LazilyParsedNumber);
    }

    @Test
    public void testNumberReadBigDecimal() throws Exception {
        String json = "123.45678901234567890123456789";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        Number value = adapter.read(reader);
        assertEquals(new BigDecimal("123.45678901234567890123456789"), value);
        assertTrue(value instanceof LazilyParsedNumber);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testNumberReadInvalid() throws Exception {
        String json = "abc";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        adapter.read(reader);
    }

    @Test
    public void testCharacterReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        Character value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testCharacterReadSingleChar() throws Exception {
        String json = "\"a\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        Character value = adapter.read(reader);
        assertEquals('a', (char) value);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testCharacterReadEmptyString() throws Exception {
        String json = "\"\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        adapter.read(reader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testCharacterReadMultiCharString() throws Exception {
        String json = "\"abc\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        adapter.read(reader);
    }

    @Test
    public void testStringReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        String value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testStringReadString() throws Exception {
        String json = "\"hello\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        String value = adapter.read(reader);
        assertEquals("hello", value);
    }

    @Test
    public void testStringReadEmptyString() throws Exception {
        String json = "\"\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        String value = adapter.read(reader);
        assertEquals("", value);
    }

    @Test
    public void testStringReadBooleanTrue() throws Exception {
        String json = "true";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        String value = adapter.read(reader);
        assertEquals("true", value);
    }

    @Test
    public void testStringReadBooleanFalse() throws Exception {
        String json = "false";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        String value = adapter.read(reader);
        assertEquals("false", value);
    }

    @Test
    public void testBigDecimalReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        BigDecimal value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testBigDecimalReadNumber() throws Exception {
        String json = "123.4567890123456789";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        BigDecimal value = adapter.read(reader);
        assertEquals(new BigDecimal("123.4567890123456789"), value);
    }

    @Test
    public void testBigDecimalReadInteger() throws Exception {
        String json = "12345";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        BigDecimal value = adapter.read(reader);
        assertEquals(new BigDecimal("12345"), value);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBigDecimalReadInvalid() throws Exception {
        String json = "abc";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        adapter.read(reader);
    }

    @Test
    public void testBigIntegerReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        BigInteger value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testBigIntegerReadNumber() throws Exception {
        String json = "9223372036854775808";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        BigInteger value = adapter.read(reader);
        assertEquals(new BigInteger("9223372036854775808"), value);
    }

    @Test
    public void testBigIntegerReadInteger() throws Exception {
        String json = "12345";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        BigInteger value = adapter.read(reader);
        assertEquals(new BigInteger("12345"), value);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBigIntegerReadInvalid() throws Exception {
        String json = "abc";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        adapter.read(reader);
    }

    @Test
    public void testStringBuilderReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        StringBuilder value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testStringBuilderReadString() throws Exception {
        String json = "\"hello\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        StringBuilder value = adapter.read(reader);
        assertEquals("hello", value.toString());
    }

    @Test
    public void testStringBuilderWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testStringBuilderWriteString() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        adapter.write(jsonWriter, new StringBuilder("world"));
        assertEquals("\"world\"", writer.toString());
    }

    @Test
    public void testStringBufferReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        StringBuffer value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testStringBufferReadString() throws Exception {
        String json = "\"hello\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        StringBuffer value = adapter.read(reader);
        assertEquals("hello", value.toString());
    }

    @Test
    public void testStringBufferWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testStringBufferWriteString() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        adapter.write(jsonWriter, new StringBuffer("world"));
        assertEquals("\"world\"", writer.toString());
    }

    @Test
    public void testURLReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        URL value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testURLReadString() throws Exception {
        String json = "\"http://example.com\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        URL value = adapter.read(reader);
        assertEquals("http://example.com", value.toExternalForm());
    }

    @Test
    public void testURLReadStringNull() throws Exception {
        String json = "\"null\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        URL value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testURLWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testURLWriteString() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        adapter.write(jsonWriter, new URL("http://example.com"));
        assertEquals("\"http://example.com\"", writer.toString());
    }

    @Test
    public void testURIReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        URI value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testURIReadString() throws Exception {
        String json = "\"/path/to/resource\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        URI value = adapter.read(reader);
        assertEquals("/path/to/resource", value.toASCIIString());
    }

    @Test
    public void testURIReadStringNull() throws Exception {
        String json = "\"null\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        URI value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testURIWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testURIWriteString() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        adapter.write(jsonWriter, new URI("http://example.com"));
        assertEquals("\"http://example.com\"", writer.toString());
    }

    @Test
    public void testInetAddressReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        InetAddress value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testInetAddressReadString() throws Exception {
        String json = "\"127.0.0.1\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        InetAddress value = adapter.read(reader);
        assertEquals("127.0.0.1", value.getHostAddress());
    }

    @Test
    public void testInetAddressWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testInetAddressWriteString() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        adapter.write(jsonWriter, InetAddress.getByName("192.168.1.1"));
        assertEquals("\"192.168.1.1\"", writer.toString());
    }

    @Test
    public void testUUIDReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        UUID value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testUUIDReadString() throws Exception {
        String json = "\"a1b2c3d4-e5f6-7890-1234-567890abcdef\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        UUID value = adapter.read(reader);
        assertEquals("a1b2c3d4-e5f6-7890-1234-567890abcdef", value.toString());
    }

    @Test
    public void testUUIDWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testUUIDWriteString() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        UUID uuid = UUID.fromString("a1b2c3d4-e5f6-7890-1234-567890abcdef");
        adapter.write(jsonWriter, uuid);
        assertEquals("\"a1b2c3d4-e5f6-7890-1234-567890abcdef\"", writer.toString());
    }

    @Test
    public void testTimestampReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        Gson gson = new Gson(); // Need a Gson instance to get Date adapter
        TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        Timestamp value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testTimestampReadDate() throws Exception {
        // Test with a known date representation that Gson's Date adapter can handle.
        // The exact format depends on Gson's default Date handling, which is typically
        // an epoch long or an ISO 8601 string. Let's use epoch long.
        long epochMillis = System.currentTimeMillis();
        String json = String.valueOf(epochMillis);
        JsonReader reader = new JsonReader(new StringReader(json));
        Gson gson = new Gson(); // Need a Gson instance to get Date adapter
        TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        Timestamp value = adapter.read(reader);
        assertNotNull(value);
        assertEquals(epochMillis, value.getTime());
    }

    @Test
    public void testTimestampWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        Gson gson = new Gson();
        TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testTimestampWriteDate() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        Gson gson = new Gson();
        TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        // Use the same mechanism as read to ensure consistency
        long epochMillis = timestamp.getTime();
        adapter.write(jsonWriter, timestamp);
        //Gson writes Dates as numbers (epoch millis) by default
        assertEquals(String.valueOf(epochMillis), writer.toString());
    }

    @Test
    public void testCalendarReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        Calendar value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testCalendarReadObject() throws Exception {
        String json = "{\"year\":2023,\"month\":10,\"dayOfMonth\":27,\"hourOfDay\":15,\"minute\":30,\"second\":0}";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        Calendar value = adapter.read(reader);
        assertNotNull(value);
        assertEquals(2023, value.get(Calendar.YEAR));
        assertEquals(10, value.get(Calendar.MONTH)); // Note: GregorianCalendar month is 0-indexed
        assertEquals(27, value.get(Calendar.DAY_OF_MONTH));
        assertEquals(15, value.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, value.get(Calendar.MINUTE));
        assertEquals(0, value.get(Calendar.SECOND));
    }

    @Test
    public void testCalendarWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testCalendarWriteObject() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        Calendar calendar = new GregorianCalendar(2023, Calendar.NOVEMBER, 15, 10, 5, 0); // Month is 0-indexed, so November is 10
        adapter.write(jsonWriter, calendar);
        // The order of fields in the output JSON might not be guaranteed, but the content should match.
        // We will check for the presence of all fields and their values.
        String output = writer.toString();
        assertTrue(output.contains("\"year\":2023"));
        assertTrue(output.contains("\"month\":10")); // November is month 10
        assertTrue(output.contains("\"dayOfMonth\":15"));
        assertTrue(output.contains("\"hourOfDay\":10"));
        assertTrue(output.contains("\"minute\":5"));
        assertTrue(output.contains("\"second\":0"));
        assertTrue(output.startsWith("{"));
        assertTrue(output.endsWith("}"));
    }

    @Test
    public void testLocaleReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        Locale value = adapter.read(reader);
        assertNull(value);
    }

    @Test
    public void testLocaleReadLanguage() throws Exception {
        String json = "\"en\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        Locale value = adapter.read(reader);
        assertEquals("en", value.getLanguage());
        assertEquals("", value.getCountry());
        assertEquals("", value.getVariant());
    }

    @Test
    public void testLocaleReadLanguageCountry() throws Exception {
        String json = "\"en_US\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        Locale value = adapter.read(reader);
        assertEquals("en", value.getLanguage());
        assertEquals("US", value.getCountry());
        assertEquals("", value.getVariant());
    }

    @Test
    public void testLocaleReadLanguageCountryVariant() throws Exception {
        String json = "\"en_US_POSIX\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        Locale value = adapter.read(reader);
        assertEquals("en", value.getLanguage());
        assertEquals("US", value.getCountry());
        assertEquals("POSIX", value.getVariant());
    }

    @Test
    public void testLocaleWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testLocaleWriteLanguage() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        adapter.write(jsonWriter, new Locale("fr"));
        assertEquals("\"fr\"", writer.toString());
    }

    @Test
    public void testLocaleWriteLanguageCountry() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        adapter.write(jsonWriter, new Locale("fr", "CA"));
        assertEquals("\"fr_CA\"", writer.toString());
    }

    @Test
    public void testLocaleWriteLanguageCountryVariant() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        adapter.write(jsonWriter, new Locale("fr", "CA", "POSIX"));
        assertEquals("\"fr_CA_POSIX\"", writer.toString());
    }

    @Test
    public void testJsonElementReadNull() throws Exception {
        String json = "null";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement value = adapter.read(reader);
        assertTrue(value.isJsonNull());
    }

    @Test
    public void testJsonElementReadPrimitiveString() throws Exception {
        String json = "\"hello\"";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement value = adapter.read(reader);
        assertTrue(value.isJsonPrimitive());
        assertEquals("hello", value.getAsString());
    }

    @Test
    public void testJsonElementReadPrimitiveNumber() throws Exception {
        String json = "123.45";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement value = adapter.read(reader);
        assertTrue(value.isJsonPrimitive());
        assertEquals(123.45, value.getAsDouble(), 1e-9);
        assertTrue(value.getAsNumber() instanceof LazilyParsedNumber);
    }

    @Test
    public void testJsonElementReadPrimitiveBooleanTrue() throws Exception {
        String json = "true";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement value = adapter.read(reader);
        assertTrue(value.isJsonPrimitive());
        assertTrue(value.getAsBoolean());
    }

    @Test
    public void testJsonElementReadPrimitiveBooleanFalse() throws Exception {
        String json = "false";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement value = adapter.read(reader);
        assertTrue(value.isJsonPrimitive());
        assertFalse(value.getAsBoolean());
    }

    @Test
    public void testJsonElementReadArray() throws Exception {
        String json = "[1, \"a\", true, null, {}]";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement value = adapter.read(reader);
        assertTrue(value.isJsonArray());
        JsonArray array = value.getAsJsonArray();
        assertEquals(5, array.size());
        assertTrue(array.get(0).isJsonPrimitive());
        assertTrue(array.get(0).getAsNumber() instanceof LazilyParsedNumber);
        assertEquals(1, array.get(0).getAsInt());
        assertTrue(array.get(1).isJsonPrimitive());
        assertEquals("a", array.get(1).getAsString());
        assertTrue(array.get(2).isJsonPrimitive());
        assertTrue(array.get(2).getAsBoolean());
        assertTrue(array.get(3).isJsonNull());
        assertTrue(array.get(4).isJsonObject());
    }

    @Test
    public void testJsonElementReadObject() throws Exception {
        String json = "{\"name\":\"test\",\"value\":123}";
        JsonReader reader = new JsonReader(new StringReader(json));
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonElement value = adapter.read(reader);
        assertTrue(value.isJsonObject());
        JsonObject object = value.getAsJsonObject();
        assertEquals(2, object.entrySet().size()); // Changed from size() to entrySet().size()
        assertTrue(object.has("name"));
        assertTrue(object.get("name").isJsonPrimitive());
        assertEquals("test", object.get("name").getAsString());
        assertTrue(object.has("value"));
        assertTrue(object.get("value").isJsonPrimitive());
        assertEquals(123, object.get("value").getAsInt());
    }

    @Test
    public void testJsonElementWriteNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        adapter.write(jsonWriter, JsonNull.INSTANCE);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveString() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        adapter.write(jsonWriter, new JsonPrimitive("hello"));
        assertEquals("\"hello\"", writer.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveNumber() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        adapter.write(jsonWriter, new JsonPrimitive(new BigDecimal("123.45")));
        assertEquals("123.45", writer.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveBooleanTrue() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        adapter.write(jsonWriter, new JsonPrimitive(true));
        assertEquals("true", writer.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveBooleanFalse() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        adapter.write(jsonWriter, new JsonPrimitive(false));
        assertEquals("false", writer.toString());
    }

    @Test
    public void testJsonElementWriteArray() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive("a"));
        array.add(new JsonPrimitive(1));
        array.add(JsonNull.INSTANCE);
        adapter.write(jsonWriter, array);
        assertEquals("[\"a\",1,null]", writer.toString());
    }

    @Test
    public void testJsonElementWriteObject() throws Exception {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        JsonObject object = new JsonObject();
        object.addProperty("key1", "value1");
        object.addProperty("key2", 2);
        object.add("key3", JsonNull.INSTANCE);
        adapter.write(jsonWriter, object);
        // Order of keys is not guaranteed in JSON objects, so check for presence of key-value pairs
        String output = writer.toString();
        assertTrue(output.contains("\"key1\":\"value1\""));
        assertTrue(output.contains("\"key2\":2"));
        assertTrue(output.contains("\"key3\":null"));
        assertTrue(output.startsWith("{"));
        assertTrue(output.endsWith("}"));
    }

    @Test
    public void testNewFactoryWithNullAdapter() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, null);
        Gson gson = new Gson();
        TypeAdapter<String> adapter = factory.create(gson, TypeToken.get(String.class));
        assertNull(adapter);
    }

    @Test
    public void testNewFactoryWithNullType() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactory((TypeToken<String>) null, TypeAdapters.STRING);
        Gson gson = new Gson();
        TypeAdapter<String> adapter = factory.create(gson, TypeToken.get(String.class));
        assertNull(adapter);
    }

    @Test
    public void testNewFactoryForClassAndAdapter() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);
        Gson gson = new Gson();
        TypeAdapter<String> adapter = factory.create(gson, TypeToken.get(String.class));
        assertNotNull(adapter);
        assertTrue(adapter instanceof TypeAdapter); // TypeAdapters.STRING is a TypeAdapter
    }

    @Test
    public void testNewFactoryForMultipleTypes() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);
        Gson gson = new Gson();
        TypeAdapter<Calendar> calendarAdapter = factory.create(gson, TypeToken.get(Calendar.class));
        assertNotNull(calendarAdapter);
        TypeAdapter<GregorianCalendar> gregorianAdapter = factory.create(gson, TypeToken.get(GregorianCalendar.class));
        assertNotNull(gregorianAdapter);
        TypeAdapter<Date> dateAdapter = factory.create(gson, TypeToken.get(Date.class));
        assertNull(dateAdapter); // Should not create adapter for Date
    }

    @Test
    public void testNewTypeHierarchyFactoryCreatesAdapterForAssignableFrom() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.NUMBER);
        Gson gson = new Gson();
        TypeAdapter<Integer> integerAdapter = factory.create(gson, TypeToken.get(Integer.class));
        assertNotNull(integerAdapter); // Integer is assignable from Number
        TypeAdapter<Double> doubleAdapter = factory.create(gson, TypeToken.get(Double.class));
        assertNotNull(doubleAdapter); // Double is assignable from Number
    }

    @Test
    public void testNewTypeHierarchyFactoryDoesNotCreateAdapterForNonAssignableFrom() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.NUMBER);
        Gson gson = new Gson();
        TypeAdapter<String> stringAdapter = factory.create(gson, TypeToken.get(String.class));
        assertNull(stringAdapter); // String is not assignable from Number
    }

    @Test
    public void testNewTypeHierarchyFactoryReadChecksInstance() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.NUMBER);
        Gson gson = new Gson();
        TypeAdapter<Integer> adapter = (TypeAdapter<Integer>) factory.create(gson, TypeToken.get(Integer.class));

        // This test checks the behavior when the read object is not an instance of the requested type.
        // The adapter is for Number, but we are requesting an Integer.
        // The underlying adapter.read will produce a LazilyParsedNumber.
        // The newTypeHierarchyFactory wraps this, and its read method should check if the result is an Integer.
        // However, since the factory is for Number, and the adapter is for Number,
        // the read method should check if the *result* is an instance of the *requested* type (Integer).
        // The actual TypeAdapter<T1> in newTypeHierarchyFactory is of type T1.
        // So, if T1 is Number, it will read a Number.
        // The check `!requestedType.isInstance(result)` will then compare the read Number with Integer.class.
        // A LazilyParsedNumber is not an instance of Integer.
        String jsonNumber = "123";
        JsonReader reader = new JsonReader(new StringReader(jsonNumber));
        try {
            adapter.read(reader);
            fail("Expected JsonSyntaxException because Integer.class is not assignable from Number.class when deserializing.");
        } catch (JsonSyntaxException e) {
            // The error message indicates what was expected and what was found.
            // LazilyParsedNumber is returned as a String by default when read as a Number.
            assertTrue(e.getMessage().contains("Expected a java.lang.Integer but was java.lang.String"));
        }
    }
}
