package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class DateTimeSerializerBaseTest {
    @Test
    public void testEmptyNullDate() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertTrue(serializer.isEmpty((java.util.Date) null));
    }

    @Test
    public void testEpochDateIsEmpty() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertTrue(serializer.isEmpty(new java.util.Date(0L)));
    }

    @Test
    public void testPositiveTimestampIsNotEmpty() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertFalse(serializer.isEmpty(new java.util.Date(1L)));
    }

    @Test
    public void testNegativeTimestampIsNotEmpty() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertFalse(serializer.isEmpty(new java.util.Date(-1L)));
    }

    @Test
    public void testZeroTimestampCalendarIsEmpty() throws Exception {
        CalendarSerializer serializer = new CalendarSerializer();
        java.util.Calendar value = java.util.Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        value.setTimeInMillis(0L);
        assertTrue(serializer.isEmpty(value));
    }

    @Test
    public void testNonzeroTimestampCalendarIsNotEmpty() throws Exception {
        CalendarSerializer serializer = new CalendarSerializer();
        java.util.Calendar value = java.util.Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        value.setTimeInMillis(Long.MIN_VALUE);
        assertFalse(serializer.isEmpty(value));
    }

    @Test
    public void testZeroSqlDateIsEmpty() throws Exception {
        SqlDateSerializer serializer = new SqlDateSerializer();
        assertTrue(serializer.isEmpty(new java.sql.Date(0L)));
    }

    @Test
    public void testOneMillisecondSqlDateIsNotEmpty() throws Exception {
        SqlDateSerializer serializer = new SqlDateSerializer();
        assertFalse(serializer.isEmpty(new java.sql.Date(1L)));
    }

    @Test
    public void testEmptyWithProviderNullDate() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertTrue(serializer.isEmpty(null, (java.util.Date) null));
    }

    @Test
    public void testEmptyWithProviderEpochDate() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertTrue(serializer.isEmpty(null, new java.util.Date(0L)));
    }

    @Test
    public void testEmptyWithProviderNonzeroDate() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertFalse(serializer.isEmpty(null, new java.util.Date(-1L)));
    }

    @Test
    public void testSchemaWithExplicitTimestampFalse() throws Exception {
        DateSerializer serializer = (DateSerializer) new DateSerializer()
                .withFormat(Boolean.FALSE, null);
        JsonNode schema = serializer.getSchema(null, (Type) java.util.Date.class);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testSchemaWithExplicitTimestampTrue() throws Exception {
        DateSerializer serializer = (DateSerializer) new DateSerializer()
                .withFormat(Boolean.TRUE, null);
        JsonNode schema = serializer.getSchema(null, (Type) java.util.Date.class);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testSchemaWithCustomFormatUsesString() throws Exception {
        DateSerializer serializer = (DateSerializer) new DateSerializer()
                .withFormat(null, new SimpleDateFormat("yyyy", Locale.US));
        JsonNode schema = serializer.getSchema(null, (Type) java.util.Date.class);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testSchemaUsesProviderTimestampFeature() throws Exception {
        DateSerializer serializer = new DateSerializer();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        JsonNode schema = serializer.getSchema(mapper.getSerializerProvider(), (Type) java.util.Date.class);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testSchemaUsesProviderStringFeature() throws Exception {
        DateSerializer serializer = new DateSerializer();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        JsonNode schema = serializer.getSchema(mapper.getSerializerProvider(), (Type) java.util.Date.class);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testDefaultTimestampWithoutProviderThrows() throws Exception {
        DateSerializer serializer = new DateSerializer();
        try {
            serializer.getSchema(null, (Type) java.util.Date.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testFormatTrueOverridesCustomFormatForSchema() throws Exception {
        DateSerializer serializer = (DateSerializer) new DateSerializer()
                .withFormat(Boolean.TRUE, new SimpleDateFormat("yyyy", Locale.US));
        JsonNode schema = serializer.getSchema(null, (Type) java.util.Date.class);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testFormatFalseOverridesCustomFormatForSchema() throws Exception {
        DateSerializer serializer = (DateSerializer) new DateSerializer()
                .withFormat(Boolean.FALSE, new SimpleDateFormat("yyyy", Locale.US));
        JsonNode schema = serializer.getSchema(null, (Type) java.util.Date.class);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testSimpleDateTimeTimestampBoundary() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertTrue(serializer.isEmpty(new java.util.Date(Long.MIN_VALUE)));
        assertFalse(serializer.isEmpty(new java.util.Date(Long.MAX_VALUE)));
    }
}
