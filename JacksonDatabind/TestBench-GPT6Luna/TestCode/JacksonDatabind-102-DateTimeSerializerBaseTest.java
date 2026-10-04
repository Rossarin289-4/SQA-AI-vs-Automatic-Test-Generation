package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class DateTimeSerializerBaseTest {
    @Test
    public void testIsEmptyForEpochDate() throws Exception {
        assertFalse(new DateSerializer().isEmpty(null, new Date(0L)));
    }

    @Test
    public void testIsEmptyForNonzeroDate() throws Exception {
        assertFalse(new DateSerializer().isEmpty(null, new Date(1L)));
    }

    @Test
    public void testIsEmptyForNullDate() throws Exception {
        assertFalse(new DateSerializer().isEmpty(null, null));
    }

    @Test
    public void testDateSchemaWithDefaultProvider() throws Exception {
        JsonNode schema = new DateSerializer().getSchema(null, null);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testDateSchemaWithTimestampProvider() throws Exception {
        JsonNode schema = new DateSerializer().getSchema(null, null);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testDateSchemaWithoutProviderUsesString() throws Exception {
        JsonNode schema = new DateSerializer().getSchema(null, null);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testWithFormatDefaultDateSerializer() throws Exception {
        DateSerializer serializer = new DateSerializer();
        DateTimeSerializerBase<?> formatted = serializer.withFormat(Boolean.TRUE, null);
        assertEquals("number", formatted.getSchema(null, null).get("type").asText());
    }

    @Test
    public void testWithFormatCustomPatternSchemaIsString() throws Exception {
        DateSerializer serializer = new DateSerializer();
        DateTimeSerializerBase<?> formatted = serializer.withFormat(Boolean.FALSE,
                new SimpleDateFormat("yyyy"));
        assertEquals("string", formatted.getSchema(null, null).get("type").asText());
    }

    @Test
    public void testWithFormatExplicitFalseOverridesProvider() throws Exception {
        DateTimeSerializerBase<?> formatted =
                new DateSerializer().withFormat(Boolean.FALSE, null);
        assertEquals("string", formatted.getSchema(null, null).get("type").asText());
    }

    @Test
    public void testWithFormatExplicitTrueOverridesCustomFormat() throws Exception {
        DateTimeSerializerBase<?> formatted =
                new DateSerializer().withFormat(Boolean.TRUE, new SimpleDateFormat("yyyy"));
        assertEquals("number", formatted.getSchema(null, null).get("type").asText());
    }

    @Test
    public void testTimestampEnabledWithoutProviderThrows() throws Exception {
        try {
            new DateSerializer().withFormat(null, null).getSchema(null, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(true, expected.getMessage().contains("SerializerProvider"));
        }
    }

    @Test
    public void testSqlDateIsNotEmptyAtEpoch() throws Exception {
        assertFalse(new SqlDateSerializer().isEmpty(null, new java.sql.Date(0L)));
    }

    @Test
    public void testCalendarSerializerSchemaDefault() throws Exception {
        assertEquals("string", new CalendarSerializer()
                .withFormat(Boolean.FALSE, null).getSchema(null, null).get("type").asText());
    }

    @Test
    public void testCalendarSerializerSchemaTimestamp() throws Exception {
        assertEquals("number", new CalendarSerializer()
                .withFormat(Boolean.TRUE, null).getSchema(null, null).get("type").asText());
    }
}
