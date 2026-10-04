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
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class DateTimeSerializerBaseTest {
    @Test
    public void testSqlDateSerializerNullIsEmpty() throws Exception {
        assertTrue(new SqlDateSerializer().isEmpty((java.sql.Date) null));
    }

    @Test
    public void testSqlDateSerializerEpochIsEmpty() throws Exception {
        assertTrue(new SqlDateSerializer().isEmpty(new java.sql.Date(0L)));
    }

    @Test
    public void testSqlDateSerializerNonEpochIsNotEmpty() throws Exception {
        assertFalse(new SqlDateSerializer().isEmpty(new java.sql.Date(1L)));
    }

    @Test
    public void testDateSerializerNullIsEmptyWithProvider() throws Exception {
        assertTrue(new DateSerializer().isEmpty(null, (java.util.Date) null));
    }

    @Test
    public void testDateSerializerEpochIsEmptyWithProvider() throws Exception {
        assertTrue(new DateSerializer().isEmpty(null, new java.util.Date(0L)));
    }

    @Test
    public void testDateSerializerNonEpochIsNotEmptyWithProvider() throws Exception {
        assertFalse(new DateSerializer().isEmpty(null, new java.util.Date(-1L)));
    }

    @Test
    public void testTimestampConfigurationSchemaIsNumber() throws Exception {
        DateSerializer serializer = new DateSerializer();
        DateTimeSerializerBase<?> configured = serializer.withFormat(Boolean.TRUE, null);
        JsonNode schema = configured.getSchema(null, null);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testCustomFormatSchemaIsString() throws Exception {
        DateSerializer serializer = new DateSerializer();
        DateTimeSerializerBase<?> configured = serializer.withFormat(null,
                new SimpleDateFormat("yyyy-MM-dd", Locale.US));
        JsonNode schema = configured.getSchema(null, null);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testExplicitFalseTimestampSchemaIsString() throws Exception {
        DateSerializer serializer = new DateSerializer();
        DateTimeSerializerBase<?> configured = serializer.withFormat(Boolean.FALSE, null);
        JsonNode schema = configured.getSchema(null, null);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testNullProviderWithoutFormatThrows() throws Exception {
        DateSerializer serializer = new DateSerializer();
        try {
            serializer.getSchema(null, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testNullPropertyReturnsSameSerializer() throws Exception {
        DateSerializer serializer = new DateSerializer();
        assertSame(serializer, serializer.createContextual(null, null));
    }

    @Test
    public void testSqlDateTimestampConfigurationSchemaIsString() throws Exception {
        SqlDateSerializer serializer = new SqlDateSerializer();
        DateTimeSerializerBase<?> configured = serializer.withFormat(Boolean.TRUE, null);
        assertEquals("string", configured.getSchema(null, null).get("type").asText());
    }
}
