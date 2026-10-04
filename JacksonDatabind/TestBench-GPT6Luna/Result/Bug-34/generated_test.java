package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

public class NumberSerializerTest {
    @Test
    public void testSchemaForBigInteger() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        assertEquals("integer", serializer.getSchema(null, (Type) null).get("type").asText());
    }

    @Test
    public void testSchemaForBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        assertEquals("number", serializer.getSchema(null, (Type) null).get("type").asText());
    }

    @Test
    public void testSchemaForNumber() throws Exception {
        assertEquals("number", NumberSerializer.instance.getSchema(null, (Type) null).get("type").asText());
    }

    @Test
    public void testBigIntegerAtIntMaximumSchema() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        assertEquals("integer", serializer.getSchema(null, Integer.class).get("type").asText());
    }

    @Test
    public void testBigIntegerAboveIntMaximumSchema() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        assertEquals("integer", serializer.getSchema(null, BigInteger.valueOf(2147483648L).getClass()).get("type").asText());
    }

    @Test
    public void testBigIntegerAtIntMinimumSchema() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        assertEquals("integer", serializer.getSchema(null, BigInteger.valueOf(Integer.MIN_VALUE).getClass()).get("type").asText());
    }

    @Test
    public void testBigIntegerBelowIntMinimumSchema() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        assertEquals("integer", serializer.getSchema(null, BigInteger.valueOf(-2147483649L).getClass()).get("type").asText());
    }

    @Test
    public void testSchemaIgnoresTypeHint() throws Exception {
        assertEquals("number", NumberSerializer.instance.getSchema(null, String.class).get("type").asText());
    }

    @Test
    public void testBigIntegerVisitorAcceptsIntegerFormat() throws Exception {
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base();
        new NumberSerializer(BigInteger.class).acceptJsonFormatVisitor(visitor, null);
        assertNull(visitor.getProvider());
    }

    @Test
    public void testBigDecimalVisitorAcceptsNumberFormat() throws Exception {
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base();
        new NumberSerializer(BigDecimal.class).acceptJsonFormatVisitor(visitor, null);
        assertNull(visitor.getProvider());
    }

    @Test
    public void testNumberVisitorAcceptsNumberFormat() throws Exception {
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base();
        NumberSerializer.instance.acceptJsonFormatVisitor(visitor, null);
        assertNull(visitor.getProvider());
    }

    @Test
    public void testByteAndShortIntBoundaryValues() throws Exception {
        assertEquals(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
