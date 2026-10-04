package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class JsonWriterTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    private static final String JAVASCRIPT_ESCAPED_NEWLINE = "\\u2028";
    private static final String JAVASCRIPT_ESCAPED_PARAGRAPH = "\\u2029";

    // Helper method to create a JsonWriter with a StringWriter
    private static JsonWriter createWriter() {
        return new JsonWriter(new StringWriter());
    }

    // Helper method to create a JsonWriter with a StringWriter and indent
    private static JsonWriter createWriter(String indent) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setIndent(indent);
        return writer;
    }

    @Test
    public void testBeginArrayEndArray() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testBeginObjectEndObject() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testBeginArrayEndArrayNested() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginArray();
        writer.endArray();
        writer.endArray();
        assertEquals("[[]]", stringWriter.toString());
    }

    @Test
    public void testBeginObjectEndObjectNested() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.beginObject();
        writer.endObject();
        writer.endObject();
        // The nested object should be within the outer object, so "{}" inside "{}"
        assertEquals("{{}}", stringWriter.toString());
    }

    @Test
    public void testNameValue() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").value("b");
        writer.endObject();
        assertEquals("{\"a\":\"b\"}", stringWriter.toString());
    }

    @Test
    public void testMultipleNamesValues() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").value("b");
        writer.name("c").value("d");
        writer.endObject();
        assertEquals("{\"a\":\"b\",\"c\":\"d\"}", stringWriter.toString());
    }

    @Test
    public void testNameNullValue() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").nullValue();
        writer.endObject();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test
    public void testNameBooleanValue() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").value(true);
        writer.name("b").value(false);
        writer.endObject();
        assertEquals("{\"a\":true,\"b\":false}", stringWriter.toString());
    }

    @Test
    public void testNameNumberValue() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").value(123);
        writer.name("b").value(45.67);
        writer.endObject();
        assertEquals("{\"a\":123,\"b\":45.67}", stringWriter.toString());
    }

    @Test
    public void testNameNumberValueLong() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").value(123456789012345678L);
        writer.endObject();
        assertEquals("{\"a\":123456789012345678}", stringWriter.toString());
    }

    @Test
    public void testEmptyArray() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.endArray();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testArrayWithOneString() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.value("hello");
        writer.endArray();
        assertEquals("[\"hello\"]", stringWriter.toString());
    }

    @Test
    public void testArrayWithMultipleStrings() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.value("a");
        writer.value("b");
        writer.endArray();
        assertEquals("[\"a\",\"b\"]", stringWriter.toString());
    }

    @Test
    public void testArrayWithMixedTypes() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.value("string");
        writer.value(123);
        writer.value(true);
        writer.nullValue();
        writer.endArray();
        assertEquals("[\"string\",123,true,null]", stringWriter.toString());
    }

    @Test
    public void testObjectWithOneProperty() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("key").value("value");
        writer.endObject();
        assertEquals("{\"key\":\"value\"}", stringWriter.toString());
    }

    @Test
    public void testObjectWithMultipleProperties() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("key1").value("value1");
        writer.name("key2").value(2);
        writer.endObject();
        assertEquals("{\"key1\":\"value1\",\"key2\":2}", stringWriter.toString());
    }

    @Test
    public void testNullValueInObject() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("key").nullValue();
        writer.endObject();
        assertEquals("{\"key\":null}", stringWriter.toString());
    }

    @Test
    public void testEmptyObject() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testStringEscapes() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("quotes").value("\"");
        writer.name("backspace").value("\b");
        writer.name("newline").value("\n");
        writer.name("carriage").value("\r");
        writer.name("tab").value("\t");
        writer.name("formfeed").value("\f");
        writer.name("backslash").value("\\");
        writer.name("control").value("\u0000");
        // The reference source escapes unicode characters like \u1234 directly.
        writer.name("unicode").value("\u1234");
        writer.endObject();
        assertEquals("{\"quotes\":\"\\\"\",\"backspace\":\"\\b\",\"newline\":\"\\n\",\"carriage\":\"\\r\",\"tab\":\"\\t\",\"formfeed\":\"\\f\",\"backslash\":\"\\\\\",\"control\":\"\\u0000\",\"unicode\":\"\\u1234\"}", stringWriter.toString());
    }

    @Test
    public void testHtmlEscapes() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setHtmlSafe(true);
        writer.beginObject();
        writer.name("lt").value("<");
        writer.name("gt").value(">");
        writer.name("amp").value("&");
        writer.name("equals").value("=");
        writer.name("apostrophe").value("'");
        writer.endObject();
        assertEquals("{\"lt\":\"\\u003c\",\"gt\":\"\\u003e\",\"amp\":\"\\u0026\",\"equals\":\"\\u003d\",\"apostrophe\":\"\\u0027\"}", stringWriter.toString());
    }

    @Test
    public void testLenientNumbers() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginObject();
        writer.name("nan").value(Double.NaN);
        writer.name("infinity").value(Double.POSITIVE_INFINITY);
        writer.name("negativeInfinity").value(Double.NEGATIVE_INFINITY);
        writer.endObject();
        assertEquals("{\"nan\":NaN,\"infinity\":Infinity,\"negativeInfinity\":-Infinity}", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonLenientNaN() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonLenientInfinity() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testPrettyPrintArray() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setIndent("  ");
        writer.beginArray();
        writer.value("a");
        writer.value("b");
        writer.endArray();
        assertEquals("[\n  \"a\",\n  \"b\"\n]", stringWriter.toString());
    }

    @Test
    public void testPrettyPrintObject() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("key1").value("value1");
        writer.name("key2").value(2);
        writer.endObject();
        assertEquals("{\n  \"key1\": \"value1\",\n  \"key2\": 2\n}", stringWriter.toString());
    }

    @Test
    public void testNullsSerializedByDefault() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").nullValue();
        writer.endObject();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test
    public void testNullsNotSerializedWhenDisabled() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("a").nullValue();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testFlush() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.value("a");
        writer.flush();
        // The flush operation doesn't write the closing bracket.
        assertEquals("[\"a\"", stringWriter.toString());
    }

    @Test
    public void testCloseWithIncompleteArray() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.value("a");
        try {
            writer.close();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals("Incomplete document", expected.getMessage());
        }
    }

    @Test
    public void testCloseWithIncompleteObject() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a").value("b");
        try {
            writer.close();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals("Incomplete document", expected.getMessage());
        }
    }

    @Test
    public void testCloseWithDanglingName() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a");
        // The close() method should correctly detect and report a dangling name.
        try {
            writer.close();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals("Dangling name: a", expected.getMessage());
        }
    }

    @Test
    public void testSetIndentToEmptyString() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setIndent("");
        writer.beginObject();
        writer.name("a").value("b");
        writer.endObject();
        assertEquals("{\"a\":\"b\"}", stringWriter.toString());
    }

    @Test
    public void testJsonValue() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("rawJson").jsonValue("1, 2, 3");
        writer.endObject();
        assertEquals("{\"rawJson\":1, 2, 3}", stringWriter.toString());
    }

    @Test
    public void testJsonValueWithNull() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("nullValue").jsonValue(null);
        writer.endObject();
        assertEquals("{\"nullValue\":null}", stringWriter.toString());
    }

    @Test
    public void testLenientTopLevelArray() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginArray();
        writer.value("a");
        writer.endArray();
        // A top-level array is valid in lenient mode.
        assertEquals("[\"a\"]", stringWriter.toString());
    }

    @Test
    public void testLenientTopLevelObject() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setLenient(true);
        writer.beginObject();
        writer.name("a").value("b");
        writer.endObject();
        assertEquals("{\"a\":\"b\"}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testNonLenientTopLevelArrayThrowsException() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.value("a");
        writer.endArray();
        // Closing a document that was just a single array is not allowed in non-lenient mode.
        writer.close();
    }

    @Test
    public void testArrayWithNestedObject() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginArray();
        writer.beginObject();
        writer.name("a").value(1);
        writer.endObject();
        writer.endArray();
        assertEquals("[{\"a\":1}]", stringWriter.toString());
    }

    @Test
    public void testObjectWithNestedArray() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a");
        writer.beginArray();
        writer.value(1);
        writer.endArray();
        writer.endObject();
        assertEquals("{\"a\":[1]}", stringWriter.toString());
    }

    @Test
    public void testStringWithJavascriptEscapedChars() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        // The source code correctly escapes \u2028 and \u2029.
        writer.name("chars").value("\u2028\u2029");
        writer.endObject();
        assertEquals("{\"chars\":\"\\u2028\\u2029\"}", stringWriter.toString());
    }

    @Test
    public void testSetIndentNull() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        // Setting indent to null should disable pretty printing and reset separator to ":".
        writer.setIndent(null);
        writer.beginObject();
        writer.name("a").value("b");
        writer.endObject();
        assertEquals("{\"a\":\"b\"}", stringWriter.toString());
    }

    @Test
    public void testNameCalledTwice() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("a");
        try {
            writer.name("b");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // This is expected behavior: a name must be followed by a value.
        }
    }

    @Test
    public void testValueBeforeName() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        try {
            writer.value("a");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // This is expected behavior: a value cannot be written directly after an object opening.
        }
    }

    @Test
    public void testSerializeNullsGetterSetter() throws Exception {
        JsonWriter writer = createWriter();
        assertTrue(writer.getSerializeNulls());
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
        writer.setSerializeNulls(true);
        assertTrue(writer.getSerializeNulls());
    }

    @Test
    public void testIsLenientGetterSetter() throws Exception {
        JsonWriter writer = createWriter();
        assertFalse(writer.isLenient());
        writer.setLenient(true);
        assertTrue(writer.isLenient());
        writer.setLenient(false);
        assertFalse(writer.isLenient());
    }

    @Test
    public void testIsHtmlSafeGetterSetter() throws Exception {
        JsonWriter writer = createWriter();
        assertFalse(writer.isHtmlSafe());
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
        writer.setHtmlSafe(false);
        assertFalse(writer.isHtmlSafe());
    }

    @Test
    public void testSetIndentWithSpaces() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.setIndent("    ");
        writer.beginObject();
        writer.name("a").value("b");
        writer.endObject();
        assertEquals("{\n    \"a\": \"b\"\n}", stringWriter.toString());
    }

    @Test
    public void testPrimitiveDoubleValues() throws Exception {
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject();
        writer.name("double").value(1.23456789);
        // Double.toString() for a float value that is exactly representable as a double will not lose precision.
        writer.name("float").value(Float.valueOf("1.23456789"));
        writer.endObject();
        assertEquals("{\"double\":1.23456789,\"float\":1.23456789}", stringWriter.toString());
    }
}
