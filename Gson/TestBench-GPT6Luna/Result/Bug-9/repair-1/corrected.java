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

public class JsonTreeWriterTest {
    @Test
    public void testInitiallyProducesJsonNull() throws Exception {
        assertSame(JsonNull.INSTANCE, new JsonTreeWriter().get());
    }

    @Test
    public void testTopLevelStringAndNullString() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value("abc");
        assertEquals("abc", writer.get().getAsString());

        JsonTreeWriter nullWriter = new JsonTreeWriter();
        nullWriter.value((String) null);
        assertTrue(nullWriter.get().isJsonNull());
    }

    @Test
    public void testBooleanValues() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(true);
        writer.value(Boolean.FALSE);
        writer.endArray();
        assertEquals("[true,false]", writer.get().toString());
    }

    @Test
    public void testLongEdgeValues() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(Long.MAX_VALUE);
        writer.value(Long.MIN_VALUE);
        writer.endArray();
        assertEquals("9223372036854775807", writer.get().getAsJsonArray().get(0).getAsString());
        assertEquals("-9223372036854775808", writer.get().getAsJsonArray().get(1).getAsString());
    }

    @Test
    public void testFiniteDoubleAndNumber() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1.5);
        writer.value((Number) new BigDecimal("2.25"));
        writer.endArray();
        assertEquals(1.5, writer.get().getAsJsonArray().get(0).getAsDouble(), 1e-9);
        assertEquals(2.25, writer.get().getAsJsonArray().get(1).getAsDouble(), 1e-9);
    }

    @Test
    public void testNonFiniteDoubleRejectedInStrictMode() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        try {
            writer.value(Double.NaN);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertSame(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testNonFiniteNumberRejectedInStrictMode() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        try {
            writer.value((Number) Double.POSITIVE_INFINITY);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertSame(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testLenientAllowsNonFiniteValues() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.NaN);
        writer.value((Number) Double.POSITIVE_INFINITY);
        writer.endArray();
        assertTrue(Double.isNaN(writer.get().getAsJsonArray().get(0).getAsDouble()));
        assertEquals(Double.POSITIVE_INFINITY,
                writer.get().getAsJsonArray().get(1).getAsDouble(), 0.0);
    }

    @Test
    public void testNestedArrayAndObjectValues() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.beginObject();
        writer.name("items");
        writer.beginArray();
        writer.value("first");
        writer.endArray();
        writer.endObject();
        writer.endArray();

        JsonElement item = writer.get().getAsJsonArray().get(0)
                .getAsJsonObject().get("items").getAsJsonArray().get(0);
        assertEquals("first", item.getAsString());
    }

    @Test
    public void testNullObjectMemberIncludedByDefault() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("n");
        writer.nullValue();
        writer.endObject();
        assertTrue(writer.get().getAsJsonObject().has("n"));
        assertTrue(writer.get().getAsJsonObject().get("n").isJsonNull());
    }

    @Test
    public void testNullObjectMemberOmittedWhenConfigured() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("n");
        writer.nullValue();
        writer.endObject();
        assertFalse(writer.get().getAsJsonObject().has("n"));
    }

    @Test
    public void testNullArrayEntryIsPreservedWhenNullSerializationDisabled() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(false);
        writer.beginArray();
        writer.nullValue();
        writer.endArray();
        assertEquals(1, writer.get().getAsJsonArray().size());
        assertTrue(writer.get().getAsJsonArray().get(0).isJsonNull());
    }

    @Test
    public void testNameAndEndWithPendingNameRejected() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("pending");
        try {
            writer.endObject();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
        assertTrue(writer.get() == null || writer.get().isJsonNull());
    }

    @Test
    public void testNameOutsideObjectRejected() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        try {
            writer.name("x");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
        assertSame(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testMismatchedEndRejected() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        try {
            writer.endObject();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testGetRejectsIncompleteContainer() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        try {
            writer.get();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testCloseRejectsIncompleteDocument() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        try {
            writer.close();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testClosePreventsSubsequentWrites() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.close();
        try {
            writer.value("x");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testFlushIsAllowed() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.flush();
        writer.endArray();
        assertEquals(0, writer.get().getAsJsonArray().size());
    }

    @Test
    public void testArrayAppendsSeveralValuesInOrder() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(0L);
        writer.value(1L);
        writer.value(-1L);
        writer.endArray();
        JsonArray array = writer.get().getAsJsonArray();
        assertEquals(3, array.size());
        assertEquals(0L, array.get(0).getAsLong());
        assertEquals(1L, array.get(1).getAsLong());
        assertEquals(-1L, array.get(2).getAsLong());
    }

    @Test
    public void testNullBooleanAndNumberOverloads() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value((Boolean) null);
        writer.value((Number) null);
        writer.endArray();
        assertEquals(2, writer.get().getAsJsonArray().size());
        assertTrue(writer.get().getAsJsonArray().get(0).isJsonNull());
        assertTrue(writer.get().getAsJsonArray().get(1).isJsonNull());
    }

    @Test
    public void testClassAdapterWritesNull() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        TypeAdapters.CLASS.write(writer, null);
        assertTrue(writer.get().isJsonNull());
    }

    @Test
    public void testClassAdapterRejectsNonNullClass() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        try {
            TypeAdapters.CLASS.write(writer, String.class);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertSame(JsonNull.INSTANCE, writer.get());
    }

    @Test
    public void testClassAdapterReadsNull() throws Exception {
        assertNull(TypeAdapters.CLASS.read(new JsonReader(new java.io.StringReader("null"))));
    }

    @Test
    public void testTypeTokenFactoryMatchesExactType() throws Exception {
        TypeAdapter<String> adapter = new TypeAdapter<String>() {
            @Override public void write(JsonWriter out, String value) throws IOException {
                out.value(value);
            }
            @Override public String read(JsonReader in) throws IOException {
                return in.nextString();
            }
        };
        TypeAdapterFactory factory = TypeAdapters.newFactory(
                TypeToken.get(String.class), adapter);
        Gson gson = new Gson();
        assertSame(adapter, factory.create(gson, TypeToken.get(String.class)));
        assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    }

    @Test
    public void testMultipleTypesFactoryMatchesBaseAndSubtype() throws Exception {
        TypeAdapter<Number> adapter = new TypeAdapter<Number>() {
            @Override public void write(JsonWriter out, Number value) throws IOException {
                out.value(value);
            }
            @Override public Number read(JsonReader in) throws IOException {
                return in.nextInt();
            }
        };
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
                Number.class, Integer.class, adapter);
        Gson gson = new Gson();
        assertSame(adapter, factory.create(gson, TypeToken.get(Number.class)));
        assertSame(adapter, factory.create(gson, TypeToken.get(Integer.class)));
        assertNull(factory.create(gson, TypeToken.get(Long.class)));
    }

    @Test
    public void testTypeHierarchyFactoryAcceptsSubtypeAndRejectsUnrelatedType() throws Exception {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, adapter);
        Gson gson = new Gson();
        TypeAdapter<JsonArray> arrayAdapter =
                factory.create(gson, TypeToken.get(JsonArray.class));
        assertNotNull(arrayAdapter);
        assertNull(factory.create(gson, TypeToken.get(String.class)));
        assertEquals("[]", arrayAdapter.toJson(new JsonArray()));
    }

    @Test
    public void testTypeHierarchyFactoryRejectsReadResultNotRequestedSubtype() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonArray> arrayAdapter =
                factory.create(new Gson(), TypeToken.get(JsonArray.class));
        try {
            arrayAdapter.fromJson("\"x\"");
            fail("expected JsonSyntaxException");
        } catch (JsonSyntaxException expected) { }
    }

    @Test
    public void testLenientGetterReflectsSetting() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        assertFalse(writer.isLenient());
        writer.setLenient(true);
        assertTrue(writer.isLenient());
    }

    @Test
    public void testHtmlSafeGetterReflectsSetting() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        assertFalse(writer.isHtmlSafe());
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
    }

    @Test
    public void testSerializeNullsGetterReflectsSetting() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        assertTrue(writer.getSerializeNulls());
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
    }

    @Test
    public void testJsonValueWritesValueIntoArray() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.jsonValue("raw");
        writer.endArray();
        assertEquals("raw", writer.get().getAsJsonArray().get(0).getAsString());
    }

    @Test
    public void testJsonValueNullWritesNullElement() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.jsonValue(null);
        writer.endArray();
        assertTrue(writer.get().getAsJsonArray().get(0).isJsonNull());
    }
}
