package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
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

public class TypeAdaptersTest {

    // Test cases for CLASS adapter
    @Test
    public void testClassWriteNull() throws Exception {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        // The Class adapter explicitly throws an exception for non-null values.
        // For null, it should write "null".
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testClassReadNull() throws Exception {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassWriteNonNull() throws Exception {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, String.class); // Should throw exception
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassReadNonNull() throws Exception {
        TypeAdapter<Class> adapter = TypeAdapters.CLASS;
        StringReader sr = new StringReader("\"java.lang.String\"");
        JsonReader reader = new JsonReader(sr);
        adapter.read(reader); // Should throw exception
    }

    // Test cases for BIT_SET adapter
    @Test
    public void testBitSetWriteNull() throws Exception {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBitSetReadNull() throws Exception {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testBitSetWriteAndRead() throws Exception {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        BitSet original = new BitSet();
        original.set(0);
        original.set(2);
        original.set(5);

        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, original);
        writer.close();

        String json = sw.toString();
        StringReader sr = new StringReader(json);
        JsonReader reader = new JsonReader(sr);
        BitSet decoded = adapter.read(reader);

        assertEquals(original, decoded);
    }

    @Test
    public void testBitSetReadEmptyArray() throws Exception {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        StringReader sr = new StringReader("[]");
        JsonReader reader = new JsonReader(sr);
        BitSet decoded = adapter.read(reader);
        assertTrue(decoded.isEmpty());
    }

    @Test
    public void testBitSetReadBooleanValues() throws Exception {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        StringReader sr = new StringReader("[true, false, true]");
        JsonReader reader = new JsonReader(sr);
        BitSet decoded = adapter.read(reader);
        assertTrue(decoded.get(0));
        assertFalse(decoded.get(1));
        assertTrue(decoded.get(2));
        assertEquals(3, decoded.length());
    }

    @Test
    public void testBitSetReadStringValues() throws Exception {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        StringReader sr = new StringReader("[\"1\", \"0\", \"1\"]");
        JsonReader reader = new JsonReader(sr);
        BitSet decoded = adapter.read(reader);
        assertTrue(decoded.get(0));
        assertFalse(decoded.get(1));
        assertTrue(decoded.get(2));
        assertEquals(3, decoded.length());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadInvalidStringValue() throws Exception {
        TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;
        StringReader sr = new StringReader("[\"abc\"]");
        JsonReader reader = new JsonReader(sr);
        adapter.read(reader);
    }

    // Test cases for BOOLEAN adapter
    @Test
    public void testBooleanWriteNull() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBooleanReadNull() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testBooleanReadTrue() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringReader sr = new StringReader("true");
        JsonReader reader = new JsonReader(sr);
        assertTrue(adapter.read(reader));
    }

    @Test
    public void testBooleanReadFalse() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringReader sr = new StringReader("false");
        JsonReader reader = new JsonReader(sr);
        assertFalse(adapter.read(reader));
    }

    @Test
    public void testBooleanReadStringTrue() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringReader sr = new StringReader("\"true\"");
        JsonReader reader = new JsonReader(sr);
        assertTrue(adapter.read(reader));
    }

    @Test
    public void testBooleanReadStringFalse() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringReader sr = new StringReader("\"false\"");
        JsonReader reader = new JsonReader(sr);
        assertFalse(adapter.read(reader));
    }

    @Test
    public void testBooleanWriteTrue() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, true);
        writer.close();
        assertEquals("true", sw.toString());
    }

    @Test
    public void testBooleanWriteFalse() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, false);
        writer.close();
        assertEquals("false", sw.toString());
    }

    // Test cases for BOOLEAN_AS_STRING adapter
    @Test
    public void testBooleanAsStringWriteNull() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        // The BOOLEAN_AS_STRING adapter writes "null" for null values.
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBooleanAsStringReadNull() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testBooleanAsStringReadStringTrue() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        StringReader sr = new StringReader("\"true\"");
        JsonReader reader = new JsonReader(sr);
        assertTrue(adapter.read(reader));
    }

    @Test
    public void testBooleanAsStringWriteTrue() throws Exception {
        TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, true);
        writer.close();
        assertEquals("\"true\"", sw.toString());
    }

    // Test cases for BYTE adapter
    @Test
    public void testByteWriteNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testByteReadNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testByteReadValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringReader sr = new StringReader("123");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertEquals((byte) 123, value.byteValue());
    }

    @Test
    public void testByteWriteValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, (byte) 123);
        writer.close();
        assertEquals("123", sw.toString());
    }

    @Test
    public void testByteReadBoundaryMax() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringReader sr = new StringReader("127");
        JsonReader reader = new JsonReader(sr);
        assertEquals((byte) 127, adapter.read(reader));
    }

    @Test
    public void testByteReadBoundaryMin() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringReader sr = new StringReader("-128");
        JsonReader reader = new JsonReader(sr);
        assertEquals((byte) -128, adapter.read(reader));
    }

    @Test
    public void testByteReadOverflow() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringReader sr = new StringReader("128"); // Should be parsed as int, then cast to byte
        JsonReader reader = new JsonReader(sr);
        assertEquals((byte) 128, adapter.read(reader)); // Expected to wrap around
    }

    @Test
    public void testByteReadUnderflow() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.BYTE;
        StringReader sr = new StringReader("-129"); // Should be parsed as int, then cast to byte
        JsonReader reader = new JsonReader(sr);
        assertEquals((byte) -129, adapter.read(reader)); // Expected to wrap around
    }


    // Test cases for SHORT adapter
    @Test
    public void testShortWriteNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testShortReadNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testShortReadValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        StringReader sr = new StringReader("12345");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertEquals((short) 12345, value.shortValue());
    }

    @Test
    public void testShortWriteValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, (short) 12345);
        writer.close();
        assertEquals("12345", sw.toString());
    }

    @Test
    public void testShortReadBoundaryMax() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        StringReader sr = new StringReader("32767");
        JsonReader reader = new JsonReader(sr);
        assertEquals((short) 32767, adapter.read(reader));
    }

    @Test
    public void testShortReadBoundaryMin() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.SHORT;
        StringReader sr = new StringReader("-32768");
        JsonReader reader = new JsonReader(sr);
        assertEquals((short) -32768, adapter.read(reader));
    }

    // Test cases for INTEGER adapter
    @Test
    public void testIntegerWriteNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testIntegerReadNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testIntegerReadValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        StringReader sr = new StringReader("123456789");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertEquals(123456789, value.intValue());
    }

    @Test
    public void testIntegerWriteValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, 123456789);
        writer.close();
        assertEquals("123456789", sw.toString());
    }

    @Test
    public void testIntegerReadBoundaryMax() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        StringReader sr = new StringReader("2147483647");
        JsonReader reader = new JsonReader(sr);
        assertEquals(Integer.MAX_VALUE, adapter.read(reader));
    }

    @Test
    public void testIntegerReadBoundaryMin() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.INTEGER;
        StringReader sr = new StringReader("-2147483648");
        JsonReader reader = new JsonReader(sr);
        assertEquals(Integer.MIN_VALUE, adapter.read(reader));
    }

    // Test cases for ATOMIC_INTEGER adapter
    @Test
    public void testAtomicIntegerWriteNull() throws Exception {
        TypeAdapter<AtomicInteger> adapter = TypeAdapters.ATOMIC_INTEGER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testAtomicIntegerReadValue() throws Exception {
        TypeAdapter<AtomicInteger> adapter = TypeAdapters.ATOMIC_INTEGER;
        StringReader sr = new StringReader("123");
        JsonReader reader = new JsonReader(sr);
        AtomicInteger value = adapter.read(reader);
        assertEquals(123, value.get());
    }

    @Test
    public void testAtomicIntegerWriteValue() throws Exception {
        TypeAdapter<AtomicInteger> adapter = TypeAdapters.ATOMIC_INTEGER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new AtomicInteger(123));
        writer.close();
        assertEquals("123", sw.toString());
    }

    // Test cases for ATOMIC_BOOLEAN adapter
    @Test
    public void testAtomicBooleanWriteNull() throws Exception {
        TypeAdapter<AtomicBoolean> adapter = TypeAdapters.ATOMIC_BOOLEAN;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testAtomicBooleanReadTrue() throws Exception {
        TypeAdapter<AtomicBoolean> adapter = TypeAdapters.ATOMIC_BOOLEAN;
        StringReader sr = new StringReader("true");
        JsonReader reader = new JsonReader(sr);
        assertTrue(adapter.read(reader).get());
    }

    @Test
    public void testAtomicBooleanReadFalse() throws Exception {
        TypeAdapter<AtomicBoolean> adapter = TypeAdapters.ATOMIC_BOOLEAN;
        StringReader sr = new StringReader("false");
        JsonReader reader = new JsonReader(sr);
        assertFalse(adapter.read(reader).get());
    }

    @Test
    public void testAtomicBooleanWriteTrue() throws Exception {
        TypeAdapter<AtomicBoolean> adapter = TypeAdapters.ATOMIC_BOOLEAN;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new AtomicBoolean(true));
        writer.close();
        assertEquals("true", sw.toString());
    }

    // Test cases for ATOMIC_INTEGER_ARRAY adapter
    @Test
    public void testAtomicIntegerArrayWriteNull() throws Exception {
        TypeAdapter<AtomicIntegerArray> adapter = TypeAdapters.ATOMIC_INTEGER_ARRAY;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testAtomicIntegerArrayReadEmptyArray() throws Exception {
        TypeAdapter<AtomicIntegerArray> adapter = TypeAdapters.ATOMIC_INTEGER_ARRAY;
        StringReader sr = new StringReader("[]");
        JsonReader reader = new JsonReader(sr);
        AtomicIntegerArray array = adapter.read(reader);
        assertEquals(0, array.length());
    }

    @Test
    public void testAtomicIntegerArrayReadValues() throws Exception {
        TypeAdapter<AtomicIntegerArray> adapter = TypeAdapters.ATOMIC_INTEGER_ARRAY;
        StringReader sr = new StringReader("[1, 2, 3]");
        JsonReader reader = new JsonReader(sr);
        AtomicIntegerArray array = adapter.read(reader);
        assertEquals(3, array.length());
        assertEquals(1, array.get(0));
        assertEquals(2, array.get(1));
        assertEquals(3, array.get(2));
    }

    @Test
    public void testAtomicIntegerArrayWriteValues() throws Exception {
        TypeAdapter<AtomicIntegerArray> adapter = TypeAdapters.ATOMIC_INTEGER_ARRAY;
        AtomicIntegerArray original = new AtomicIntegerArray(new int[]{1, 2, 3});
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, original);
        writer.close();
        assertEquals("[1,2,3]", sw.toString());
    }

    // Test cases for LONG adapter
    @Test
    public void testLongWriteNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testLongReadNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testLongReadValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        StringReader sr = new StringReader("1234567890123");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertEquals(1234567890123L, value.longValue());
    }

    @Test
    public void testLongWriteValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, 1234567890123L);
        writer.close();
        assertEquals("1234567890123", sw.toString());
    }

    @Test
    public void testLongReadBoundaryMax() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        StringReader sr = new StringReader("9223372036854775807");
        JsonReader reader = new JsonReader(sr);
        assertEquals(Long.MAX_VALUE, adapter.read(reader));
    }

    @Test
    public void testLongReadBoundaryMin() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.LONG;
        StringReader sr = new StringReader("-9223372036854775808");
        JsonReader reader = new JsonReader(sr);
        assertEquals(Long.MIN_VALUE, adapter.read(reader));
    }

    // Test cases for FLOAT adapter
    @Test
    public void testFloatWriteNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testFloatReadNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testFloatReadValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        StringReader sr = new StringReader("123.456");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertEquals(123.456f, value.floatValue(), 1e-6f);
    }

    @Test
    public void testFloatWriteValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, 123.456f);
        writer.close();
        assertEquals("123.456", sw.toString());
    }

    @Test
    public void testFloatReadBoundary() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.FLOAT;
        StringReader sr = new StringReader("3.4028235E38"); // Float.MAX_VALUE
        JsonReader reader = new JsonReader(sr);
        assertEquals(Float.MAX_VALUE, adapter.read(reader).floatValue(), 1e-6f);
    }

    // Test cases for DOUBLE adapter
    @Test
    public void testDoubleWriteNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testDoubleReadNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testDoubleReadValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        StringReader sr = new StringReader("123.4567890123");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertEquals(123.4567890123, value.doubleValue(), 1e-9);
    }

    @Test
    public void testDoubleWriteValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, 123.4567890123);
        writer.close();
        assertEquals("123.4567890123", sw.toString());
    }

    @Test
    public void testDoubleReadBoundaryMax() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;
        StringReader sr = new StringReader("1.7976931348623157E308"); // Double.MAX_VALUE
        JsonReader reader = new JsonReader(sr);
        assertEquals(Double.MAX_VALUE, adapter.read(reader).doubleValue(), 1e-12);
    }

    // Test cases for NUMBER adapter
    @Test
    public void testNumberWriteNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testNumberReadNull() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testNumberReadNumberValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        StringReader sr = new StringReader("12345");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertTrue(value instanceof LazilyParsedNumber);
        assertEquals("12345", value.toString());
    }

    @Test
    public void testNumberReadStringValue() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        StringReader sr = new StringReader("\"123.45\"");
        JsonReader reader = new JsonReader(sr);
        Number value = adapter.read(reader);
        assertTrue(value instanceof LazilyParsedNumber);
        assertEquals("123.45", value.toString());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testNumberReadInvalid() throws Exception {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        StringReader sr = new StringReader("true");
        JsonReader reader = new JsonReader(sr);
        adapter.read(reader);
    }

    // Test cases for CHARACTER adapter
    @Test
    public void testCharacterWriteNull() throws Exception {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testCharacterReadNull() throws Exception {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testCharacterReadValue() throws Exception {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        StringReader sr = new StringReader("\"a\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(Character.valueOf('a'), adapter.read(reader));
    }

    @Test
    public void testCharacterWriteValue() throws Exception {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, 'a');
        writer.close();
        assertEquals("\"a\"", sw.toString());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testCharacterReadInvalidLength() throws Exception {
        TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;
        StringReader sr = new StringReader("\"abc\"");
        JsonReader reader = new JsonReader(sr);
        adapter.read(reader);
    }

    // Test cases for STRING adapter
    @Test
    public void testStringWriteNull() throws Exception {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testStringReadNull() throws Exception {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testStringReadValue() throws Exception {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        StringReader sr = new StringReader("\"hello\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals("hello", adapter.read(reader));
    }

    @Test
    public void testStringWriteValue() throws Exception {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, "hello");
        writer.close();
        assertEquals("\"hello\"", sw.toString());
    }

    @Test
    public void testStringReadBooleanValue() throws Exception {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        StringReader sr = new StringReader("true");
        JsonReader reader = new JsonReader(sr);
        assertEquals("true", adapter.read(reader));
    }

    // Test cases for BIG_DECIMAL adapter
    @Test
    public void testBigDecimalWriteNull() throws Exception {
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBigDecimalReadNull() throws Exception {
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testBigDecimalReadValue() throws Exception {
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        StringReader sr = new StringReader("123.4567890123456789");
        JsonReader reader = new JsonReader(sr);
        assertEquals(new BigDecimal("123.4567890123456789"), adapter.read(reader));
    }

    @Test
    public void testBigDecimalWriteValue() throws Exception {
        TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new BigDecimal("123.4567890123456789"));
        writer.close();
        assertEquals("123.4567890123456789", sw.toString());
    }

    // Test cases for BIG_INTEGER adapter
    @Test
    public void testBigIntegerWriteNull() throws Exception {
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBigIntegerReadNull() throws Exception {
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testBigIntegerReadValue() throws Exception {
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        StringReader sr = new StringReader("123456789012345678901234567890");
        JsonReader reader = new JsonReader(sr);
        assertEquals(new BigInteger("123456789012345678901234567890"), adapter.read(reader));
    }

    @Test
    public void testBigIntegerWriteValue() throws Exception {
        TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new BigInteger("123456789012345678901234567890"));
        writer.close();
        assertEquals("123456789012345678901234567890", sw.toString());
    }


    // Test cases for STRING_BUILDER adapter
    @Test
    public void testStringBuilderWriteNull() throws Exception {
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testStringBuilderReadNull() throws Exception {
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testStringBuilderReadValue() throws Exception {
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        StringReader sr = new StringReader("\"hello\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals("hello", adapter.read(reader).toString());
    }

    @Test
    public void testStringBuilderWriteValue() throws Exception {
        TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new StringBuilder("hello"));
        writer.close();
        assertEquals("\"hello\"", sw.toString());
    }

    // Test cases for STRING_BUFFER adapter
    @Test
    public void testStringBufferWriteNull() throws Exception {
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testStringBufferReadNull() throws Exception {
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testStringBufferReadValue() throws Exception {
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        StringReader sr = new StringReader("\"world\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals("world", adapter.read(reader).toString());
    }

    @Test
    public void testStringBufferWriteValue() throws Exception {
        TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new StringBuffer("world"));
        writer.close();
        assertEquals("\"world\"", sw.toString());
    }

    // Test cases for URL adapter
    @Test
    public void testURLWriteNull() throws Exception {
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testURLReadNull() throws Exception {
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testURLReadValue() throws Exception {
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        StringReader sr = new StringReader("\"http://www.example.com\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(new URL("http://www.example.com"), adapter.read(reader));
    }

    @Test
    public void testURLWriteValue() throws Exception {
        TypeAdapter<URL> adapter = TypeAdapters.URL;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new URL("http://www.example.com"));
        writer.close();
        assertEquals("\"http://www.example.com\"", sw.toString());
    }

    // Test cases for URI adapter
    @Test
    public void testURIWriteNull() throws Exception {
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testURIReadNull() throws Exception {
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testURIReadValue() throws Exception {
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        StringReader sr = new StringReader("\"/path/to/resource\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(new URI("/path/to/resource"), adapter.read(reader));
    }

    @Test
    public void testURIWriteValue() throws Exception {
        TypeAdapter<URI> adapter = TypeAdapters.URI;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new URI("/path/to/resource"));
        writer.close();
        assertEquals("\"/path/to/resource\"", sw.toString());
    }

    // Test cases for INET_ADDRESS adapter
    @Test
    public void testInetAddressWriteNull() throws Exception {
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testInetAddressReadValue() throws Exception {
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        StringReader sr = new StringReader("\"127.0.0.1\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(InetAddress.getByName("127.0.0.1"), adapter.read(reader));
    }

    @Test
    public void testInetAddressWriteValue() throws Exception {
        TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, InetAddress.getByName("127.0.0.1"));
        writer.close();
        assertEquals("\"127.0.0.1\"", sw.toString());
    }

    // Test cases for UUID adapter
    @Test
    public void testUUIDWriteNull() throws Exception {
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testUUIDReadValue() throws Exception {
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        StringReader sr = new StringReader("\"a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11"), adapter.read(reader));
    }

    @Test
    public void testUUIDWriteValue() throws Exception {
        TypeAdapter<UUID> adapter = TypeAdapters.UUID;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11"));
        writer.close();
        assertEquals("\"a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11\"", sw.toString());
    }

    // Test cases for CURRENCY adapter
    @Test
    public void testCurrencyReadValue() throws Exception {
        TypeAdapter<Currency> adapter = TypeAdapters.CURRENCY;
        StringReader sr = new StringReader("\"USD\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(Currency.getInstance("USD"), adapter.read(reader));
    }

    @Test
    public void testCurrencyWriteValue() throws Exception {
        TypeAdapter<Currency> adapter = TypeAdapters.CURRENCY;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, Currency.getInstance("USD"));
        writer.close();
        assertEquals("\"USD\"", sw.toString());
    }


    // Test cases for CALENDAR adapter
    @Test
    public void testCalendarWriteNull() throws Exception {
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testCalendarReadNull() throws Exception {
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testCalendarReadValue() throws Exception {
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        StringReader sr = new StringReader("{\"year\":2023,\"month\":10,\"dayOfMonth\":26,\"hourOfDay\":15,\"minute\":30,\"second\":0}");
        JsonReader reader = new JsonReader(sr);
        Calendar calendar = adapter.read(reader);
        assertEquals(2023, calendar.get(Calendar.YEAR));
        assertEquals(10, calendar.get(Calendar.MONTH)); // Month is 0-indexed
        assertEquals(26, calendar.get(Calendar.DAY_OF_MONTH));
        assertEquals(15, calendar.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, calendar.get(Calendar.MINUTE));
        assertEquals(0, calendar.get(Calendar.SECOND));
    }

    @Test
    public void testCalendarWriteValue() throws Exception {
        TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        Calendar calendar = new GregorianCalendar(2023, 10, 26, 15, 30, 0); // Month is 0-indexed
        adapter.write(writer, calendar);
        writer.close();
        assertEquals("{\"year\":2023,\"month\":10,\"dayOfMonth\":26,\"hourOfDay\":15,\"minute\":30,\"second\":0}", sw.toString());
    }

    // Test cases for LOCALE adapter
    @Test
    public void testLocaleWriteNull() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testLocaleReadNull() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertNull(adapter.read(reader));
    }

    @Test
    public void testLocaleReadSinglePart() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        StringReader sr = new StringReader("\"en\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(new Locale("en"), adapter.read(reader));
    }

    @Test
    public void testLocaleReadTwoParts() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        StringReader sr = new StringReader("\"en_US\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(new Locale("en", "US"), adapter.read(reader));
    }

    @Test
    public void testLocaleReadThreeParts() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        StringReader sr = new StringReader("\"en_US_POSIX\"");
        JsonReader reader = new JsonReader(sr);
        assertEquals(new Locale("en", "US", "POSIX"), adapter.read(reader));
    }

    @Test
    public void testLocaleWriteValue() throws Exception {
        TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new Locale("en", "US", "POSIX"));
        writer.close();
        assertEquals("\"en_US_POSIX\"", sw.toString());
    }

    // Test cases for JSON_ELEMENT adapter
    @Test
    public void testJsonElementWriteNull() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, JsonNull.INSTANCE);
        writer.close();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testJsonElementReadNull() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringReader sr = new StringReader("null");
        JsonReader reader = new JsonReader(sr);
        assertTrue(adapter.read(reader).isJsonNull());
    }

    @Test
    public void testJsonElementReadPrimitiveString() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringReader sr = new StringReader("\"hello\"");
        JsonReader reader = new JsonReader(sr);
        JsonPrimitive primitive = adapter.read(reader).getAsJsonPrimitive();
        assertTrue(primitive.isString());
        assertEquals("hello", primitive.getAsString());
    }

    @Test
    public void testJsonElementReadPrimitiveNumber() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringReader sr = new StringReader("123.45");
        JsonReader reader = new JsonReader(sr);
        JsonPrimitive primitive = adapter.read(reader).getAsJsonPrimitive();
        assertTrue(primitive.isNumber());
        assertEquals(new LazilyParsedNumber("123.45"), primitive.getAsNumber());
    }

    @Test
    public void testJsonElementReadPrimitiveBoolean() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringReader sr = new StringReader("true");
        JsonReader reader = new JsonReader(sr);
        JsonPrimitive primitive = adapter.read(reader).getAsJsonPrimitive();
        assertTrue(primitive.isBoolean());
        assertTrue(primitive.getAsBoolean());
    }

    @Test
    public void testJsonElementReadArray() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringReader sr = new StringReader("[1, \"a\", true]");
        JsonReader reader = new JsonReader(sr);
        JsonArray array = adapter.read(reader).getAsJsonArray();
        assertEquals(3, array.size());
        assertTrue(array.get(0).getAsJsonPrimitive().isNumber());
        assertEquals(new LazilyParsedNumber("1"), array.get(0).getAsNumber());
        assertTrue(array.get(1).getAsJsonPrimitive().isString());
        assertEquals("a", array.get(1).getAsString());
        assertTrue(array.get(2).getAsJsonPrimitive().isBoolean());
        assertTrue(array.get(2).getAsBoolean());
    }

    @Test
    public void testJsonElementReadObject() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringReader sr = new StringReader("{\"name\":\"test\", \"value\":123}");
        JsonReader reader = new JsonReader(sr);
        JsonObject object = adapter.read(reader).getAsJsonObject();
        assertEquals("test", object.get("name").getAsString());
        assertEquals(new LazilyParsedNumber("123"), object.get("value").getAsNumber());
    }

    @Test
    public void testJsonElementWritePrimitive() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, new JsonPrimitive("test"));
        writer.close();
        assertEquals("\"test\"", sw.toString());
    }

    @Test
    public void testJsonElementWriteArray() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        JsonArray array = new JsonArray();
        array.add("a");
        array.add(1);
        adapter.write(writer, array);
        writer.close();
        assertEquals("[\"a\",1]", sw.toString());
    }

    @Test
    public void testJsonElementWriteObject() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        JsonObject object = new JsonObject();
        object.addProperty("key", "value");
        object.addProperty("number", 123);
        adapter.write(writer, object);
        writer.close();
        assertEquals("{\"key\":\"value\",\"number\":123}", sw.toString());
    }
}
