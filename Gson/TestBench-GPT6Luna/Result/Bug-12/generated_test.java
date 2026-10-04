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
    @Test
    public void promotesStringPropertyNameToValue() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("key", "value");
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals("key", reader.nextString());
        assertEquals("value", reader.nextString());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void promotesNumericPropertyNameToStringValue() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("37", 12);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("37", reader.nextString());
        assertEquals(12, reader.nextInt());
    }

    @Test
    public void promotesBooleanPropertyNameToStringValue() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("true", false);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals("true", reader.nextString());
        assertEquals(false, reader.nextBoolean());
    }

    @Test
    public void promotesFirstOfSeveralNamesAndContinuesIteration() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("first", 1);
        object.addProperty("second", 2);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals("first", reader.nextString());
        assertEquals(1, reader.nextInt());
        assertEquals(JsonToken.NAME, reader.peek());
        assertEquals("second", reader.nextName());
        assertEquals(2, reader.nextInt());
    }

    @Test
    public void promotedNameCanBeReadAsNumber() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("2147483647", 0);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals(2147483647, reader.nextInt());
        assertEquals(0, reader.nextInt());
    }

    @Test
    public void promotedNameCanBeReadAtMinimumIntegerBoundary() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("-2147483648", 0);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals(-2147483648, reader.nextInt());
        assertEquals(0, reader.nextInt());
    }

    @Test
    public void promotedNameCanBeReadAsLongAtMaximumBoundary() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("9223372036854775807", 0);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals(9223372036854775807L, reader.nextLong());
        assertEquals(0, reader.nextInt());
    }

    @Test
    public void promotedNameCanBeReadAsDouble() throws Exception {
        JsonObject object = new JsonObject();
        object.addProperty("1.25", 0);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals(1.25, reader.nextDouble(), 1e-9);
        assertEquals(0, reader.nextInt());
    }

    @Test
    public void promotesNameFromNestedObject() throws Exception {
        JsonObject nested = new JsonObject();
        nested.addProperty("inside", "ok");
        JsonArray array = new JsonArray();
        array.add(nested);
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals("inside", reader.nextString());
        assertEquals("ok", reader.nextString());
        reader.endObject();
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void promotesNameAndPreservesNullPropertyValue() throws Exception {
        JsonObject object = new JsonObject();
        object.add("n", JsonNull.INSTANCE);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals("n", reader.nextString());
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertEquals(JsonToken.END_OBJECT, reader.peek());
    }

    @Test
    public void promotesNameAndPreservesArrayPropertyValue() throws Exception {
        JsonArray value = new JsonArray();
        value.add(3);
        JsonObject object = new JsonObject();
        object.add("items", value);
        JsonTreeReader reader = new JsonTreeReader(object);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals("items", reader.nextString());
        reader.beginArray();
        assertEquals(3, reader.nextInt());
        reader.endArray();
        assertEquals(JsonToken.END_OBJECT, reader.peek());
    }

    @Test
    public void promotionRequiresCurrentTokenToBeName() throws Exception {
        JsonTreeReader reader = new JsonTreeReader(new JsonObject());
        reader.beginObject();
        try {
            reader.promoteNameToValue();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(JsonToken.END_OBJECT, reader.peek());
        }
    }
}
