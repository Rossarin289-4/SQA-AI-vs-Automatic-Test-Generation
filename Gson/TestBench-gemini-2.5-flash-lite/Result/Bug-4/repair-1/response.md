JsonReaderTest.java:631: error: indent has private access in JsonWriter
        assertEquals("  ", writer.indent); // Accessing protected field for test verification.
                                 ^
JsonReaderTest.java:632: error: separator has private access in JsonWriter
        assertEquals(": ", writer.separator); // Accessing protected field for test verification.
                                 ^
JsonReaderTest.java:645: error: indent has private access in JsonWriter
        assertNull(writer.indent); // Accessing protected field for test verification.
                         ^
JsonReaderTest.java:646: error: separator has private access in JsonWriter
        assertEquals(":", writer.separator); // Accessing protected field for test verification.
                                ^
4 errors

The compiler errors indicate that `indent` and `separator` are private fields in `JsonWriter` and cannot be accessed directly for testing.

To fix this, I will remove the direct access to these fields and test their effect indirectly by inspecting the output of `JsonWriter`. The tests `testSetIndentAndSeparator` and `testSetIndentEmptyString` will be modified to assert the generated JSON string instead of the private fields.

```java
package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Flushable;
import java.io.Writer;
import java.io.StringWriter;

public class JsonReaderTest {

    private static final String NL = "\n";
    private static final String EMPTY_STRING = "";
    private static final String JSON_WITH_COMMENTS = "/* comment */ { }";

    @Test
    public void testSimpleObject() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        assertTrue(reader.hasNext());
        reader.beginObject();
        assertFalse(reader.hasNext());
        reader.endObject();
        assertFalse(reader.hasNext());
        reader.close();
    }

    @Test
    public void testEmptyObject() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        reader.beginObject();
        assertFalse(reader.hasNext());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testSimpleArray() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        assertTrue(reader.hasNext());
        reader.beginArray();
        assertFalse(reader.hasNext());
        reader.endArray();
        assertFalse(reader.hasNext());
        reader.close();
    }

    @Test
    public void testEmptyArray() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        reader.beginArray();
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testArrayWithOneString() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"a\"]"));
        reader.beginArray();
        assertTrue(reader.hasNext());
        assertEquals("a", reader.nextString());
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testArrayWithTwoStrings() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"a\", \"b\"]"));
        reader.beginArray();
        assertTrue(reader.hasNext());
        assertEquals("a", reader.nextString());
        assertTrue(reader.hasNext());
        assertEquals("b", reader.nextString());
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testObjectWithOneNameValue() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{\"a\": 1}"));
        reader.beginObject();
        assertTrue(reader.hasNext());
        assertEquals("a", reader.nextName());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        assertFalse(reader.hasNext());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testObjectWithTwoNameValues() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{\"a\": 1, \"b\": 2}"));
        reader.beginObject();
        assertTrue(reader.hasNext());
        assertEquals("a", reader.nextName());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        assertTrue(reader.hasNext());
        assertEquals("b", reader.nextName());
        assertEquals(2.0, reader.nextDouble(), 0.0);
        assertFalse(reader.hasNext());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testNextStringAsNumber() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1]"));
        reader.beginArray();
        assertEquals("1", reader.nextString());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testNextNumberAsString() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"1\"]"));
        reader.beginArray();
        assertEquals(1.0, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testNextLongAsString() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"9223372036854775807\"]"));
        reader.beginArray();
        assertEquals(Long.MAX_VALUE, reader.nextLong());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testNextIntAsString() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"2147483647\"]"));
        reader.beginArray();
        assertEquals(Integer.MAX_VALUE, reader.nextInt());
        reader.endArray();
        reader.close();
    }
    
    @Test
    public void testNextLongAsDouble() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[9223372036854775807]"));
        reader.beginArray();
        assertEquals((double)Long.MAX_VALUE, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testNextDoubleAsLong() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1.0]"));
        reader.beginArray();
        assertEquals(1L, reader.nextLong());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testNextDoubleAsInt() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1.0]"));
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        reader.endArray();
        reader.close();
    }
    
    @Test
    public void testPeekBoolean() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[true, false]"));
        reader.beginArray();
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertEquals(true, reader.nextBoolean());
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertEquals(false, reader.nextBoolean());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testPeekNull() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[null]"));
        reader.beginArray();
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testPeekNumber() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[123]"));
        reader.beginArray();
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(123.0, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testPeekString() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"abc\"]"));
        reader.beginArray();
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("abc", reader.nextString());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testPeekObject() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[{}]"));
        reader.beginArray();
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
        reader.beginObject();
        assertFalse(reader.hasNext());
        reader.endObject();
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testPeekArray() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[[]]"));
        reader.beginArray();
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertFalse(reader.hasNext());
        reader.endArray();
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testSkipValueInObject() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{\"a\": 1, \"b\": [2, 3], \"c\": {}}"));
        reader.beginObject();
        assertEquals("a", reader.nextName());
        reader.skipValue(); // Skip 1
        assertEquals("b", reader.nextName());
        reader.skipValue(); // Skip [2, 3]
        assertEquals("c", reader.nextName());
        reader.skipValue(); // Skip {}
        assertFalse(reader.hasNext());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testSkipValueInArray() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1, {\"a\": 2}, [3]]"));
        reader.beginArray();
        reader.skipValue(); // Skip 1
        reader.skipValue(); // Skip {"a": 2}
        reader.skipValue(); // Skip [3]
        assertFalse(reader.hasNext());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLenientDoubleQuotesInNames() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{'a': 1}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        reader.endObject();
        reader.close();
    }

    @Test
    public void testLenientSingleQuotesInStrings() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\'a\']"));
        reader.setLenient(true);
        reader.beginArray();
        assertEquals("a", reader.nextString());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLenientUnquotedNames() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{a: 1}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        reader.endObject();
        reader.close();
    }
    
    @Test
    public void testLenientUnquotedStrings() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[a]"));
        reader.setLenient(true);
        reader.beginArray();
        assertEquals("a", reader.nextString());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLenientNumbers() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[NaN, Infinity, -Infinity]"));
        reader.setLenient(true);
        reader.beginArray();
        assertTrue(Double.isNaN(reader.nextDouble()));
        assertTrue(Double.isInfinite(reader.nextDouble()));
        assertTrue(Double.isInfinite(reader.nextDouble()));
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLenientComments() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("/* comment */ { /* another */ \"a\": 1 /* end */ }"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        reader.endObject();
        reader.close();
    }

    @Test
    public void testLenientSemicolonSeparatorsInArray() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1; 2; 3]"));
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1.0, reader.nextDouble(), 0.0);
        assertEquals(2.0, reader.nextDouble(), 0.0);
        assertEquals(3.0, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLenientSemicolonSeparatorsInObject() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{a:1; b:2}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        assertEquals("b", reader.nextName());
        assertEquals(2.0, reader.nextDouble(), 0.0);
        reader.endObject();
        reader.close();
    }

    @Test
    public void testLenientEqualsInsteadOfColon() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{a=1, b=>2}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        assertEquals("b", reader.nextName());
        assertEquals(2.0, reader.nextDouble(), 0.0);
        reader.endObject();
        reader.close();
    }
    
    @Test
    public void testCloseIsIdempotent() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        reader.close();
        reader.close();
    }

    @Test
    public void testGetPath() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[1, {\"b\":2}]}"));
        assertEquals("$", reader.getPath());
        reader.beginObject();
        assertEquals("$.", reader.getPath());
        assertEquals("a", reader.nextName());
        assertEquals("$.a", reader.getPath());
        reader.beginArray();
        assertEquals("$.a[0]", reader.getPath());
        reader.nextDouble();
        assertEquals("$.a[1]", reader.getPath());
        reader.beginObject();
        assertEquals("$.a[1].", reader.getPath());
        assertEquals("b", reader.nextName());
        assertEquals("$.a[1].b", reader.getPath());
        reader.nextLong();
        reader.endObject();
        reader.endArray();
        reader.endObject();
        assertEquals("$", reader.getPath());
        reader.close();
    }
    
    @Test
    public void testPathInEmptyObject() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        reader.beginObject();
        assertEquals("$.", reader.getPath());
        reader.endObject();
        assertEquals("$", reader.getPath());
        reader.close();
    }

    @Test
    public void testPathInEmptyArray() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        reader.beginArray();
        assertEquals("$[0]", reader.getPath());
        reader.endArray();
        assertEquals("$", reader.getPath());
        reader.close();
    }

    @Test(expected = EOFException.class)
    public void testEofException() throws Exception {
        JsonReader reader = new JsonReader(new StringReader(""));
        reader.hasNext();
    }

    @Test(expected = MalformedJsonException.class)
    public void testUnexpectedEndOfInput() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1, 2"));
        reader.beginArray();
        reader.nextDouble();
        reader.nextDouble();
        reader.endArray(); // This should throw
    }
    
    @Test
    public void testEmptyStringAsValue() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"\"]"));
        reader.beginArray();
        assertEquals("", reader.nextString());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testEscapeCharacters() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"\\\"\\\\\\b\\f\\n\\r\\t\\u0000\"]"));
        reader.beginArray();
        assertEquals("\"\\b\f\n\r\t\u0000", reader.nextString());
        reader.endArray();
        reader.close();
    }
    
    @Test
    public void testNumberWithExponent() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1.2e3]"));
        reader.beginArray();
        assertEquals(1200.0, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testNumberWithNegativeExponent() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1.2e-3]"));
        reader.beginArray();
        assertEquals(0.0012, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testNumberWithPlusSign() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1.2e+3]"));
        reader.beginArray();
        assertEquals(1200.0, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLongMinValue() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[-9223372036854775808]"));
        reader.beginArray();
        assertEquals(Long.MIN_VALUE, reader.nextLong());
        reader.endArray();
        reader.close();
    }
    
    @Test
    public void testLongMinValueAsDouble() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[-9223372036854775808]"));
        reader.beginArray();
        assertEquals((double)Long.MIN_VALUE, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLongMaxValue() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[9223372036854775807]"));
        reader.beginArray();
        assertEquals(Long.MAX_VALUE, reader.nextLong());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testLongMaxValueAsDouble() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[9223372036854775807]"));
        reader.beginArray();
        assertEquals((double)Long.MAX_VALUE, reader.nextDouble(), 0.0);
        reader.endArray();
        reader.close();
    }
    
    @Test
    public void testIntegerLimits() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[2147483647, -2147483648]"));
        reader.beginArray();
        assertEquals(Integer.MAX_VALUE, reader.nextInt());
        assertEquals(Integer.MIN_VALUE, reader.nextInt());
        reader.endArray();
        reader.close();
    }

    @Test
    public void testEmptyDocument() throws Exception {
        JsonReader reader = new JsonReader(new StringReader(""));
        assertFalse(reader.hasNext());
        reader.close();
    }
    
    @Test
    public void testLenientMultipleTopLevelValues() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[1] [2]"));
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1.0, reader.nextDouble(), 0.0);
        reader.endArray();
        assertTrue(reader.hasNext());
        reader.beginArray();
        assertEquals(2.0, reader.nextDouble(), 0.0);
        reader.endArray();
        assertFalse(reader.hasNext());
        reader.close();
    }

    @Test
    public void testLenientTopLevelValue() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("1"));
        reader.setLenient(true);
        assertEquals(1.0, reader.nextDouble(), 0.0);
        assertFalse(reader.hasNext());
        reader.close();
    }

    @Test
    public void testNonExecutePrefix() throws Exception {
        JsonReader reader = new JsonReader(new StringReader(")]}'\n{}"));
        reader.setLenient(true);
        reader.beginObject();
        assertFalse(reader.hasNext());
        reader.endObject();
        reader.close();
    }

    @Test
    public void testPeekedBufferNonExecutePrefix() throws Exception {
        JsonReader reader = new JsonReader(new StringReader(")]}'\n1"));
        reader.setLenient(true);
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(1.0, reader.nextDouble(), 0.0);
        assertFalse(reader.hasNext());
        reader.close();
    }

    @Test
    public void testPeekedLongWithLeadingZero() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[01]"));
        reader.setLenient(true);
        reader.beginArray();
        assertEquals(1.0, reader.nextDouble(), 0.0); // Should be parsed as a double
        reader.endArray();
        reader.close();
    }

    @Test
    public void testPeekedLongWithLeadingZeroNotLenient() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[01]"));
        reader.beginArray();
        try {
            reader.nextLong();
            fail();
        } catch (NumberFormatException expected) {
        }
        reader.endArray();
        reader.close();
    }

    @Test
    public void testPeekedLongWithLeadingZeroAsString() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("[\"01\"]"));
        reader.beginArray();
        assertEquals("01", reader.nextString());
        reader.endArray();
        reader.close();
    }

    // New tests for uncovered methods

    @Test
    public void testIsLenient() throws Exception {
        JsonReader reader = new JsonReader(new StringReader("{}"));
        assertFalse(reader.isLenient());
        reader.setLenient(true);
        assertTrue(reader.isLenient());
        reader.close();
    }

    @Test
    public void testSetIndentAndSeparator() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setIndent("  ");
        // Removed direct access to private fields 'indent' and 'separator'
        writer.beginObject();
        writer.name("a").value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\n  \"a\": 1\n}", sw.toString());
    }

    @Test
    public void testSetIndentEmptyString() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setIndent("");
        // Removed direct access to private fields 'indent' and 'separator'
        writer.beginObject();
        writer.name("a").value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":1}", sw.toString());
    }

    @Test
    public void testSetHtmlSafe() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe()); 
        writer.value("<script>");
        writer.close();
        assertEquals("\"\\u003cscript\\u003e\"", sw.toString());
    }

    @Test
    public void testIsHtmlSafe() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        assertFalse(writer.isHtmlSafe()); 
        writer.setHtmlSafe(false);
        assertFalse(writer.isHtmlSafe()); 
        writer.close();
    }

    @Test
    public void testSetSerializeNulls() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls()); 
        writer.beginObject();
        writer.name("a");
        writer.nullValue(); // Should be skipped
        writer.name("b");
        writer.value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\"b\":1}", sw.toString());
    }

    @Test
    public void testGetSerializeNulls() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        assertTrue(writer.getSerializeNulls()); 
        writer.setSerializeNulls(true);
        assertTrue(writer.getSerializeNulls()); 
        writer.close();
    }
    
    @Test
    public void testNameMethod() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginObject();
        writer.name("testName");
        writer.value("testValue");
        writer.endObject();
        writer.close();
        assertEquals("{\"testName\":\"testValue\"}", sw.toString());
    }

    @Test
    public void testValueStringMethod() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginArray();
        writer.value("someString");
        writer.endArray();
        writer.close();
        assertEquals("[\"someString\"]", sw.toString());
    }

    @Test
    public void testJsonValueMethod() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginArray();
        writer.jsonValue("{\"nested\": true}");
        writer.endArray();
        writer.close();
        assertEquals("[{\"nested\": true}]", sw.toString());
    }

    @Test
    public void testNullValueMethod() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginArray();
        writer.nullValue();
        writer.endArray();
        writer.close();
        assertEquals("[null]", sw.toString());
    }

    @Test
    public void testFlushMethod() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("a").value(1);
        writer.flush(); // Ensure it writes immediately
        assertEquals("{\n  \"a\": 1", sw.toString());
        writer.endObject();
        writer.close();
        assertEquals("{\n  \"a\": 1\n}", sw.toString());
    }

    @Test
    public void testJsonWriterEscapes() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginArray();
        writer.value("\n\t\"\\\u0000");
        writer.endArray();
        writer.close();
        assertEquals("[\"\\n\\t\\\"\\\\\\u0000\"]", sw.toString());
    }

    @Test
    public void testJsonWriterHtmlSafeEscapes() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setHtmlSafe(true);
        writer.beginArray();
        writer.value("<>&=\"'");
        writer.endArray();
        writer.close();
        assertEquals("[\"\\u003c\\u003e\\u0026\\u003d\\u0027\"]", sw.toString());
    }
    
    @Test
    public void testDoubleNaN() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.NaN);
        writer.endArray();
        writer.close();
        assertEquals("[NaN]", sw.toString());
    }

    @Test
    public void testDoubleInfinity() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
        writer.endArray();
        writer.close();
        assertEquals("[Infinity]", sw.toString());
    }

    @Test
    public void testDoubleNegativeInfinity() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.NEGATIVE_INFINITY);
        writer.endArray();
        writer.close();
        assertEquals("[-Infinity]", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleNaNStrict() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginArray();
        writer.value(Double.NaN);
        writer.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleInfinityStrict() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
        writer.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleNegativeInfinityStrict() throws Exception {
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        writer.beginArray();
        writer.value(Double.NEGATIVE_INFINITY);
        writer.close();
    }
}
```