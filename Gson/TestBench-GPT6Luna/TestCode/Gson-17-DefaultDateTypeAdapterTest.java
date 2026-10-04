package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class DefaultDateTypeAdapterTest {
    @Test
    public void testReadNull() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new java.io.StringReader("null"));
        assertNull(adapter.read(reader));
    }

    @Test
    public void testReadPatternDate() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new java.io.StringReader("\"1970-01-02\""));
        assertEquals(86400000L, adapter.read(reader).getTime());
    }

    @Test
    public void testReadEpochDate() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new java.io.StringReader("\"1970-01-01\""));
        assertEquals(0L, adapter.read(reader).getTime());
    }

    @Test
    public void testReadSqlDate() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new java.io.StringReader("\"1970-01-03\""));
        assertEquals(172800000L, adapter.read(reader).getTime());
    }

    @Test
    public void testReadTimestamp() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new java.io.StringReader("\"1970-01-04\""));
        assertEquals(259200000L, adapter.read(reader).getTime());
    }

    @Test
    public void testReadIsoDate() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new java.io.StringReader("\"1970-01-01T00:00:00Z\""));
        assertEquals(0L, adapter.read(reader).getTime());
    }

    @Test
    public void testReadInvalidDate() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new java.io.StringReader("\"not-a-date\""));
        try {
            adapter.read(reader);
            fail("expected JsonSyntaxException");
        } catch (JsonSyntaxException expected) {
        }
    }

    @Test
    public void testWriteDate() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        java.io.StringWriter output = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(output);
        adapter.write(writer, new Date(0L));
        writer.close();
        assertEquals("\"1970-01-01\"", output.toString());
    }

    @Test
    public void testWriteNull() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        java.io.StringWriter output = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(output);
        adapter.write(writer, null);
        writer.close();
        assertEquals("null", output.toString());
    }

    @Test
    public void testToStringPatternFormat() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        assertEquals("DefaultDateTypeAdapter(SimpleDateFormat)", adapter.toString());
    }

    @Test
    public void testToStringStyleFormat() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, DateFormat.SHORT);
        assertEquals("DefaultDateTypeAdapter(SimpleDateFormat)", adapter.toString());
    }

    @Test
    public void testReadConfiguredDateTimePattern() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd HH:mm:ss");
        JsonReader reader = new JsonReader(new java.io.StringReader("\"1970-01-01 00:00:01\""));
        assertEquals(1000L, adapter.read(reader).getTime());
    }
}
