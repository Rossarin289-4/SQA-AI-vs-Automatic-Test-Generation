```java
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
import java.io.StringReader;
import java.io.StringWriter;

public class TypeAdaptersTest {
    @Test
    public void testClassWriteNull() throws Exception {
        StringWriter text = new StringWriter();
        TypeAdapters.CLASS.write(new JsonWriter(text), null);
        assertEquals("null", text.toString());
    }

    @Test
    public void testClassWriteNonnullThrows() throws Exception {
        try {
            TypeAdapters.CLASS.write(new JsonWriter(new StringWriter()), String.class);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testClassReadNull() throws Exception {
        assertNull(TypeAdapters.CLASS.read(new JsonReader(new StringReader("null"))));
    }

    @Test
    public void testClassReadValueThrows() throws Exception {
        try {
            TypeAdapters.CLASS.read(new JsonReader(new StringReader("\"x\"")));
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testTypeTokenFactoryMatchesExactType() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactory(
                TypeToken.get(String.class), TypeAdapters.STRING);
        assertSame(TypeAdapters.STRING, factory.create(new Gson(), TypeToken.get(String.class)));
        assertNull(factory.create(new Gson(), TypeToken.get(Integer.class)));
    }

    @Test
    public void testTypeTokenFactoryChecksParameterizedType() throws Exception {
        TypeToken<String> strings = TypeToken.get(String.class);
        TypeAdapterFactory factory = TypeAdapters.newFactory(strings, TypeAdapters.STRING);
        assertSame(TypeAdapters.STRING, factory.create(new Gson(), strings));
        assertNull(factory.create(new Gson(), TypeToken.get(Integer.class)));
    }

    @Test
    public void testMultipleTypesFactoryAcceptsBase() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
                Number.class, Integer.class, TypeAdapters.NUMBER);
        assertSame(TypeAdapters.NUMBER, factory.create(new Gson(), TypeToken.get(Number.class)));
    }

    @Test
    public void testMultipleTypesFactoryAcceptsListedSubtype() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
                Number.class, Integer.class, TypeAdapters.NUMBER);
        assertSame(TypeAdapters.NUMBER, factory.create(new Gson(), TypeToken.get(Integer.class)));
    }

    @Test
    public void testMultipleTypesFactoryRejectsOtherSubtype() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
                Number.class, Integer.class, TypeAdapters.NUMBER);
        assertNull(factory.create(new Gson(), TypeToken.get(Long.class)));
    }

    @Test
    public void testHierarchyFactoryRejectsUnrelatedType() throws Exception {
        TypeAdapterFactory factory =
                TypeAdapters.newTypeHierarchyFactory(JsonElement.class, TypeAdapters.JSON_ELEMENT);
        assertNull(factory.create(new Gson(), TypeToken.get(String.class)));
    }

    @Test
    public void testHierarchyFactoryReadsRequestedSubtype() throws Exception {
        TypeAdapterFactory factory =
                TypeAdapters.newTypeHierarchyFactory(JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonPrimitive> adapter =
                factory.create(new Gson(), TypeToken.get(JsonPrimitive.class));
        JsonPrimitive result = adapter.fromJson("\"value\"");
        assertEquals("value", result.getAsString());
    }

    @Test
    public void testHierarchyFactoryAllowsNullResult() throws Exception {
        TypeAdapterFactory factory =
                TypeAdapters.newTypeHierarchyFactory(JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonPrimitive> adapter =
                factory.create(new Gson(), TypeToken.get(JsonPrimitive.class));
        assertNull(adapter.fromJson("null"));
    }

    @Test
    public void testHierarchyFactoryDelegatesWrites() throws Exception {
        TypeAdapterFactory factory =
                TypeAdapters.newTypeHierarchyFactory(JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonElement> adapter =
                factory.create(new Gson(), TypeToken.get(JsonElement.class));
        assertEquals("\"value\"", adapter.toJson(new JsonPrimitive("value")));
    }

    @Test
    public void testHierarchyFactoryReadsArray() throws Exception {
        TypeAdapterFactory factory =
                TypeAdapters.newTypeHierarchyFactory(JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonElement> adapter =
                factory.create(new Gson(), TypeToken.get(JsonElement.class));
        JsonElement result = adapter.fromJson("[true,null]");
        assertTrue(result.isJsonArray());
        assertEquals(2, result.getAsJsonArray().size());
        assertTrue(result.getAsJsonArray().get(0).getAsBoolean());
        assertTrue(result.getAsJsonArray().get(1).isJsonNull());
    }
}
```