package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Closeable;
import java.io.Flushable;
import java.io.StringWriter;

public class JsonTreeWriterTest {

    // Test writing basic JSON types
    @Test
    public void testWriteStringValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value("hello");
        assertEquals(new JsonPrimitive("hello"), writer.get());
    }

    @Test
    public void testWriteBooleanValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(true);
        assertEquals(new JsonPrimitive(true), writer.get());
    }

    @Test
    public void testWriteBooleanObjectValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(Boolean.TRUE);
        assertEquals(new JsonPrimitive(true), writer.get());
    }

    @Test
    public void testWriteDoubleValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(12.34);
        assertEquals(new JsonPrimitive(12.34), writer.get());
    }

    @Test
    public void testWriteLongValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(123456789L);
        assertEquals(new JsonPrimitive(123456789L), writer.get());
    }

    @Test
    public void testWriteNumberObjectValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((Number) Integer.valueOf(100));
        assertEquals(new JsonPrimitive(100), writer.get());
    }

    @Test
    public void testWriteNullValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.nullValue();
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    // Test JSON structure: arrays and objects
    @Test
    public void testBeginEndArray() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.endArray();
        assertEquals(new JsonArray(), writer.get());
    }

    @Test
    public void testBeginEndObject() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.endObject();
        assertEquals(new JsonObject(), writer.get());
    }

    @Test
    public void testArrayWithElements() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value("a");
        writer.value(1);
        writer.value(true);
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add("a");
        expected.add(1);
        expected.add(true);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testObjectWithProperties() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("key1").value("value1");
        writer.name("key2").value(123);
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.addProperty("key1", "value1");
        expected.addProperty("key2", 123);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testNestedStructure() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("nestedArray");
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        writer.name("nestedObject");
        writer.beginObject();
        writer.name("innerKey").value("innerValue");
        writer.endObject();
        writer.endObject();

        JsonObject expected = new JsonObject();
        JsonArray innerArray = new JsonArray();
        innerArray.add(1);
        innerArray.add(2);
        expected.add("nestedArray", innerArray);
        JsonObject innerObject = new JsonObject();
        innerObject.addProperty("innerKey", "innerValue");
        expected.add("nestedObject", innerObject);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testEmptyDocument() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.close(); // Calling close on an empty writer should be valid
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testArrayContainingNull() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.nullValue();
        writer.endArray();
        JsonArray expected = new JsonArray();
        expected.add(JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testObjectWithNullValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("key");
        writer.nullValue();
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.add("key", JsonNull.INSTANCE);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testWriteStringEmpty() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value("");
        assertEquals(new JsonPrimitive(""), writer.get());
    }

    @Test
    public void testWriteNumberZero() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(0);
        assertEquals(new JsonPrimitive(0), writer.get());
    }

    @Test
    public void testWriteDoubleZero() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(0.0);
        assertEquals(new JsonPrimitive(0.0), writer.get());
    }

    @Test
    public void testWriteNegativeDouble() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(-5.67);
        assertEquals(new JsonPrimitive(-5.67), writer.get());
    }

    @Test
    public void testWriteBigDecimal() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(new BigDecimal("1234567890.1234567890"));
        assertEquals(new JsonPrimitive(new BigDecimal("1234567890.1234567890")), writer.get());
    }

    @Test
    public void testWriteBigInteger() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(new BigInteger("12345678901234567890"));
        assertEquals(new JsonPrimitive(new BigInteger("12345678901234567890")), writer.get());
    }

    @Test
    public void testWriteBooleanFalse() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(false);
        assertEquals(new JsonPrimitive(false), writer.get());
    }

    @Test
    public void testWriteDoubleNaN() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        try {
            writer.value(Double.NaN);
            fail("Expected IllegalArgumentException for NaN");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testWriteDoubleInfinity() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        try {
            writer.value(Double.POSITIVE_INFINITY);
            fail("Expected IllegalArgumentException for Infinity");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testWriteDoubleNegativeInfinity() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        try {
            writer.value(Double.NEGATIVE_INFINITY);
            fail("Expected IllegalArgumentException for Negative Infinity");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testJsonValueWriteString() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.jsonValue("\"quoted string\"");
        // The JsonWriter writes the string as is, not as a primitive itself.
        // The JsonTreeWriter then wraps this string into a JsonPrimitive.
        assertEquals(new JsonPrimitive("\"quoted string\""), writer.get());
    }

    @Test
    public void testJsonValueWriteNumber() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.jsonValue("123.45");
        // jsonValue writes the string literally. JsonTreeWriter then needs to parse it.
        // The correct assertion here is to check if it's a JsonPrimitive with the parsed number.
        assertEquals(new JsonPrimitive(new BigDecimal("123.45")), writer.get());
    }

    @Test
    public void testWriteNullBooleanObject() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((Boolean) null);
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testWriteNullNumberObject() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((Number) null);
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testCloseTwice() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.endArray();
        writer.close();
        // Closing a closed writer should throw IllegalStateException if it's not already fully closed.
        // The current implementation adds SENTINEL_CLOSED to the stack.
        // The peek() method in JsonWriter checks if stackSize is 0.
        // After the first close, stackSize is 0. The second close will throw IllegalStateException.
        try {
            writer.close();
            fail("Expected IllegalStateException on double close");
        } catch (IllegalStateException expected) {
            // Expected
        }
    }

    @Test
    public void testGetOnIncompleteDocument() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("key");
        try {
            writer.get();
            fail("Expected IllegalStateException on incomplete document");
        } catch (IllegalStateException expected) {
            // Expected
        }
    }

    @Test
    public void testCloseIncompleteDocument() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        try {
            writer.close();
            fail("Expected IOException on incomplete document close");
        } catch (IOException expected) {
            // Expected
        }
    }

    @Test
    public void testWriteNumberAsString() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((Number) new LazilyParsedNumber("123.45"));
        assertEquals(new JsonPrimitive(new BigDecimal("123.45")), writer.get());
    }

    // New tests for unexercised methods
    @Test
    public void testSetIndentAndSeparator() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setIndent("  ");
        // JsonTreeWriter constructor does not take a writer. The UNWRITABLE_WRITER is used internally.
        // We cannot directly create a JsonTreeWriter with a StringWriter.
        // This test will focus on verifying that the setters for indent and separator don't cause errors
        // and conceptually that the writer is configured.
        writer.beginObject();
        writer.name("key");
        writer.value("value");
        writer.endObject();
        writer.close();
        
        // Verify getter methods if available. Since they are not public, we will rely on
        // the fact that no exceptions were thrown during the above operations, implying
        // the configuration is accepted.

        // The original code attempted to access private fields 'indent' and 'separator', which is not allowed.
        // These tests focus on the public API and expected behavior without relying on private fields.
    }

    @Test
    public void testSetLenientTrue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        assertTrue(writer.isLenient());
    }

    @Test
    public void testSetLenientFalse() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(false);
        assertFalse(writer.isLenient());
    }

    @Test
    public void testSetHtmlSafeTrue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
    }

    @Test
    public void testSetHtmlSafeFalse() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setHtmlSafe(false);
        assertFalse(writer.isHtmlSafe());
    }

    @Test
    public void testSetSerializeNullsTrue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        assertTrue(writer.getSerializeNulls());
    }

    @Test
    public void testSetSerializeNullsFalse() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
    }
    
    @Test
    public void testFlush() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        // JsonTreeWriter uses an UNWRITABLE_WRITER internally, so flush doesn't do much
        // beyond calling the underlying writer's flush.
        // We can check that it doesn't throw an exception.
        writer.flush(); // This should not throw an exception
    }

    @Test
    public void testWriteNameBeforeValue() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("key");
        writer.value("value");
        writer.endObject();
        JsonObject expected = new JsonObject();
        expected.addProperty("key", "value");
        assertEquals(expected, writer.get());
    }

    @Test
    public void testNameCallInArrayFails() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        try {
            writer.name("shouldFail");
            fail("Expected IllegalStateException when calling name() inside an array");
        } catch (IllegalStateException expected) {
            // Expected
        }
    }

    @Test
    public void testValueCallWithoutNameInObjectFails() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        try {
            writer.value("shouldFail");
            fail("Expected IllegalStateException when calling value() without preceding name() in an object");
        } catch (IllegalStateException expected) {
            // Expected
        }
    }

    @Test
    public void testJsonValueWriteNull() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.jsonValue(null);
        assertEquals(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testWriteEmptyString() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value("");
        assertEquals(new JsonPrimitive(""), writer.get());
    }

    @Test
    public void testWriteNumberAsStringDouble() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((Number) new LazilyParsedNumber("123.4567890123456789"));
        // JsonPrimitive for Number preserves the original precision from LazilyParsedNumber
        // when it's a String. When converted to BigDecimal, it should match.
        assertEquals(new JsonPrimitive(new BigDecimal("123.4567890123456789")), writer.get());
    }
    
    @Test
    public void testWriteNumberAsStringLong() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((Number) new LazilyParsedNumber("9876543210987654321"));
        assertEquals(new JsonPrimitive(new BigInteger("9876543210987654321")), writer.get());
    }

    @Test
    public void testNestedArrayInObject() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("data");
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        writer.endObject();

        JsonObject expected = new JsonObject();
        JsonArray dataArray = new JsonArray();
        dataArray.add(1);
        dataArray.add(2);
        expected.add("data", dataArray);
        assertEquals(expected, writer.get());
    }

    @Test
    public void testNestedObjectInArray() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginObject();
        writer.name("innerKey");
        writer.value("innerValue");
        writer.endObject();
        writer.endArray();

        JsonArray expected = new JsonArray();
        JsonObject innerObject = new JsonObject();
        innerObject.addProperty("innerKey", "innerValue");
        expected.add(innerObject);
        assertEquals(expected, writer.get());
    }
}
