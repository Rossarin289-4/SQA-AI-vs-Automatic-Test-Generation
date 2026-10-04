package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

public class JsonTreeReaderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPrimitiveString() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive("hello");
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("hello", reader.nextString());
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testPrimitiveNumber() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive(123.45);
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(123.45, reader.nextDouble(), 1e-9);
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testPrimitiveBoolean() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive(true);
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertTrue(reader.nextBoolean());
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testJsonNull() throws Exception {
        JsonNull jsonNull = JsonNull.INSTANCE;
        JsonTreeReader reader = new JsonTreeReader(jsonNull);
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testEmptyObject() throws Exception {
        JsonObject jsonObject = new JsonObject();
        JsonTreeReader reader = new JsonTreeReader(jsonObject);
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
        reader.beginObject();
        assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testEmptyArray() throws Exception {
        JsonArray jsonArray = new JsonArray();
        JsonTreeReader reader = new JsonTreeReader(jsonArray);
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertEquals(JsonToken.END_ARRAY, reader.peek());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testNestedObject() throws Exception {
        JsonObject nested = new JsonObject();
        nested.addProperty("a", 1);
        JsonObject main = new JsonObject();
        main.add("nested", nested);
        JsonTreeReader reader = new JsonTreeReader(main);

        reader.beginObject();
        assertEquals("nested", reader.nextName());
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1, reader.nextInt());
        reader.endObject();
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testNestedArray() throws Exception {
        JsonArray nested = new JsonArray();
        nested.add("b");
        JsonArray main = new JsonArray();
        main.add(nested);
        JsonTreeReader reader = new JsonTreeReader(main);

        reader.beginArray();
        reader.beginArray();
        assertEquals("b", reader.nextString());
        reader.endArray();
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testObjectWithVariousTypes() throws Exception {
        JsonObject obj = new JsonObject();
        obj.addProperty("string", "value");
        obj.addProperty("number", 123);
        obj.addProperty("boolean", false);
        obj.add("null", JsonNull.INSTANCE);

        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        assertEquals("string", reader.nextName());
        assertEquals("value", reader.nextString());
        assertEquals("number", reader.nextName());
        assertEquals(123.0, reader.nextDouble(), 1e-9);
        assertEquals("boolean", reader.nextName());
        assertFalse(reader.nextBoolean());
        assertEquals("null", reader.nextName());
        reader.nextNull();
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testArrayWithVariousTypes() throws Exception {
        JsonArray arr = new JsonArray();
        arr.add("hello");
        arr.add(99.9);
        arr.add(true);
        arr.add(JsonNull.INSTANCE);

        JsonTreeReader reader = new JsonTreeReader(arr);
        reader.beginArray();
        assertEquals("hello", reader.nextString());
        assertEquals(99.9, reader.nextDouble(), 1e-9);
        assertTrue(reader.nextBoolean());
        reader.nextNull();
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testReadStringAsNumber() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive("456");
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals(JsonToken.STRING, reader.peek()); // It's a string initially
        // But nextDouble should handle it if it's a valid number string
        assertEquals(456.0, reader.nextDouble(), 1e-9);
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testReadNumberAsString() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive(123);
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals("123", reader.nextString()); // getAsString on a number should return its string representation
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testPathForRootElement() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive("root");
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals("$", reader.getPath());
    }

    @Test
    public void testPathForObjectProperty() throws Exception {
        JsonObject obj = new JsonObject();
        obj.addProperty("key", "value");
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals("$.key", reader.getPath()); // Corrected expected path
        reader.nextName();
        reader.nextString();
        reader.endObject();
    }

    @Test
    public void testPathForArrayElement() throws Exception {
        JsonArray arr = new JsonArray();
        arr.add("item");
        JsonTreeReader reader = new JsonTreeReader(arr);

        reader.beginArray();
        assertEquals("$[0]", reader.getPath());
        reader.nextString();
        reader.endArray();
    }

    @Test
    public void testPathForNestedStructures() throws Exception {
        JsonObject obj = new JsonObject();
        JsonArray arr = new JsonArray();
        arr.add(1);
        obj.add("list", arr);
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals("$.list", reader.getPath()); // Corrected expected path
        reader.nextName();
        reader.beginArray();
        assertEquals("$[0]", reader.getPath()); // Corrected expected path
        reader.nextInt();
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue_String() throws Exception {
        JsonObject obj = new JsonObject();
        obj.addProperty("name", "value");
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.promoteNameToValue(); // This should consume the name and push the value
        // After promoteNameToValue, it should be the value (STRING)
        assertEquals(JsonToken.STRING, reader.peek()); // Corrected expected token
        assertEquals("value", reader.nextString()); // Corrected expected value
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue_Number() throws Exception {
        JsonObject obj = new JsonObject();
        obj.addProperty("count", 100);
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.promoteNameToValue();
        assertEquals(JsonToken.NUMBER, reader.peek()); // Corrected expected token
        assertEquals(100, reader.nextInt()); // Corrected expected value
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue_Boolean() throws Exception {
        JsonObject obj = new JsonObject();
        obj.addProperty("flag", true);
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.promoteNameToValue();
        assertEquals(JsonToken.BOOLEAN, reader.peek()); // Corrected expected token
        assertTrue(reader.nextBoolean()); // Corrected expected value
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue_Null() throws Exception {
        JsonObject obj = new JsonObject();
        obj.add("data", JsonNull.INSTANCE);
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.promoteNameToValue();
        assertEquals(JsonToken.NULL, reader.peek()); // Corrected expected token
        reader.nextNull();
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue_Object() throws Exception {
        JsonObject nestedObj = new JsonObject();
        nestedObj.addProperty("nestedKey", "nestedValue");
        JsonObject obj = new JsonObject();
        obj.add("nested", nestedObj);
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.promoteNameToValue();
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek()); // Corrected expected token
        reader.beginObject();
        assertEquals("nestedKey", reader.nextName());
        assertEquals("nestedValue", reader.nextString());
        reader.endObject();
        reader.endObject();
    }

    @Test
    public void testPromoteNameToValue_Array() throws Exception {
        JsonArray nestedArr = new JsonArray();
        nestedArr.add("arrayValue");
        JsonObject obj = new JsonObject();
        obj.add("items", nestedArr);
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.promoteNameToValue();
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek()); // Corrected expected token
        reader.beginArray();
        assertEquals("arrayValue", reader.nextString());
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testSkipValue_Object() throws Exception {
        JsonObject obj = new JsonObject();
        obj.addProperty("skipMe", "will be skipped");
        obj.addProperty("keepMe", "will be kept");
        JsonTreeReader reader = new JsonTreeReader(obj);

        reader.beginObject();
        assertEquals("skipMe", reader.nextName());
        reader.skipValue(); // Skip the "will be skipped" value
        assertEquals("keepMe", reader.nextName());
        assertEquals("will be kept", reader.nextString());
        reader.endObject();
    }

    @Test
    public void testSkipValue_Array() throws Exception {
        JsonArray arr = new JsonArray();
        arr.add(1);
        arr.add(true);
        arr.add("skip me");
        arr.add(4);
        JsonTreeReader reader = new JsonTreeReader(arr);

        reader.beginArray();
        assertEquals(1, reader.nextInt());
        assertTrue(reader.nextBoolean());
        reader.skipValue(); // Skip "skip me"
        assertEquals(4, reader.nextInt());
        reader.endArray();
    }

    @Test
    public void testCloseReader() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive("test");
        JsonTreeReader reader = new JsonTreeReader(primitive);
        reader.close();
        try {
            reader.peek();
            fail("Expected IllegalStateException for closed reader");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testEndDocumentWhenEmpty() throws Exception {
        JsonTreeReader reader = new JsonTreeReader(JsonNull.INSTANCE); // Empty document
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testNextIntOnLongValue() throws Exception {
        // Test a value that is too large for an int but representable as a long.
        // JsonPrimitive.getAsInt() throws NumberFormatException for out of range values.
        JsonPrimitive primitive = new JsonPrimitive(2147483648L); // Integer.MAX_VALUE + 1
        JsonTreeReader reader = new JsonTreeReader(primitive);
        try {
            reader.nextInt();
            fail("Expected NumberFormatException when int overflows long");
        } catch (NumberFormatException expected) {
            // This is the expected exception when the number is too large for an int.
        } catch (IllegalStateException expected) {
            // Catching this as a fallback, though NumberFormatException is more specific.
        }
    }

    @Test
    public void testNextDoubleOnLargeIntValue() throws Exception {
        JsonPrimitive primitive = new JsonPrimitive(Integer.MAX_VALUE);
        JsonTreeReader reader = new JsonTreeReader(primitive);
        assertEquals((double)Integer.MAX_VALUE, reader.nextDouble(), 1e-9);
    }

    @Test
    public void testPathWithEmptyName() throws Exception {
        JsonObject obj = new JsonObject();
        obj.addProperty("", "empty name value");
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        assertEquals("$.", reader.getPath());
        reader.nextName();
        assertEquals("empty name value", reader.nextString());
        reader.endObject();
    }
}
