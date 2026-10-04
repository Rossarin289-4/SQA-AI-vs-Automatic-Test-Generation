package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
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
    @Test
    public void testClassAdapterWritesNull() throws Exception {
        assertEquals("null", TypeAdapters.CLASS.toJson(null));
    }

    @Test
    public void testClassAdapterReadsNull() throws Exception {
        assertNull(TypeAdapters.CLASS.fromJson("null"));
    }

    @Test
    public void testClassAdapterRejectsWritingClass() throws Exception {
        try {
            TypeAdapters.CLASS.toJson(String.class);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testClassAdapterRejectsReadingNonNull() throws Exception {
        try {
            TypeAdapters.CLASS.fromJson("\"text\"");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testTypeTokenFactoryMatchesExactToken() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactory(
                TypeToken.get(String.class), TypeAdapters.STRING);
        Gson gson = new Gson();
        assertSame(TypeAdapters.STRING, factory.create(gson, TypeToken.get(String.class)));
        assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    }

    @Test
    public void testMultipleTypesFactoryMatchesBaseAndSubtype() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
                Number.class, Integer.class, TypeAdapters.NUMBER);
        Gson gson = new Gson();
        assertSame(TypeAdapters.NUMBER, factory.create(gson, TypeToken.get(Number.class)));
        assertSame(TypeAdapters.NUMBER, factory.create(gson, TypeToken.get(Integer.class)));
        assertNull(factory.create(gson, TypeToken.get(Long.class)));
    }

    @Test
    public void testMultipleTypesFactoryDoesNotMatchUnlistedSubtype() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
                Number.class, Integer.class, TypeAdapters.NUMBER);
        assertNull(factory.create(new Gson(), TypeToken.get(Double.class)));
    }

    @Test
    public void testHierarchyFactoryMatchesRequestedSubtype() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, TypeAdapters.JSON_ELEMENT);
        assertNotNull(factory.create(new Gson(), TypeToken.get(JsonArray.class)));
    }

    @Test
    public void testHierarchyFactoryRejectsUnrelatedType() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, TypeAdapters.JSON_ELEMENT);
        assertNull(factory.create(new Gson(), TypeToken.get(String.class)));
    }

    @Test
    public void testHierarchyFactoryReadsAssignableResult() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonArray> adapter = factory.create(new Gson(), TypeToken.get(JsonArray.class));
        JsonArray result = adapter.fromJson("[1]");
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).getAsInt());
    }

    @Test
    public void testHierarchyFactoryRejectsResultNotRequestedSubtype() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonArray> adapter = factory.create(new Gson(), TypeToken.get(JsonArray.class));
        try {
            adapter.fromJson("{}");
            fail("expected JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test
    public void testHierarchyFactoryAllowsJsonNullResult() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonElement> adapter = factory.create(new Gson(), TypeToken.get(JsonElement.class));
        assertSame(JsonNull.INSTANCE, adapter.fromJson("null"));
    }

    @Test
    public void testHierarchyFactoryWritesValueThroughDelegate() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(
                JsonElement.class, TypeAdapters.JSON_ELEMENT);
        TypeAdapter<JsonArray> adapter = factory.create(new Gson(), TypeToken.get(JsonArray.class));
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(3));
        assertEquals("[3]", adapter.toJson(array));
    }
}
