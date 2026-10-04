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
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.ext.CoreXMLSerializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

// Mock JsonGenerator
public class NumberSerializerTest {

    // Mock JsonGenerator

    // Mock SerializerProvider

    // Mock JsonFormatVisitorWrapper

























    @Test
    public void testSerializeBigDecimalMax() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigDecimal value = new BigDecimal("12345678901234567890.1234567890");
        serializer.serialize(value, g, provider);
        assertEquals("12345678901234567890.1234567890", g.writtenValue);
        assertEquals(value, g.bigDecimalValue);
    }

    @Test
    public void testSerializeBigIntegerMax() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigInteger value = new BigInteger("123456789012345678901234567890");
        serializer.serialize(value, g, provider);
        assertEquals("123456789012345678901234567890", g.writtenValue);
        assertEquals(value, g.bigIntegerValue);
    }

    @Test
    public void testSerializeBigIntegerMin() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockJsonGenerator g = new MockJsonGenerator();
        MockSerializerProvider provider = new MockSerializerProvider();
        BigInteger value = new BigInteger("-123456789012345678901234567890");
        serializer.serialize(value, g, provider);
        assertEquals("-123456789012345678901234567890", g.writtenValue);
        assertEquals(value, g.bigIntegerValue);
    }

    @Test
    public void testGetSchemaForInt() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockSerializerProvider provider = new MockSerializerProvider();
        Type typeHint = String.class; // Not used by the method
        JsonNode schema = serializer.getSchema(provider, typeHint);
        assertEquals("integer", schema.textValue());
        assertTrue(schema.path("type").isTextual());
    }

    @Test
    public void testGetSchemaForNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        MockSerializerProvider provider = new MockSerializerProvider();
        Type typeHint = String.class; // Not used by the method
        JsonNode schema = serializer.getSchema(provider, typeHint);
        assertEquals("number", schema.textValue());
        assertTrue(schema.path("type").isTextual());
    }

    @Test
    public void testAcceptJsonFormatVisitorForInt() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper();
        JavaType typeHint = null; // Not used by the method
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertTrue(visitor.visitedInt);
        assertEquals(JsonParser.NumberType.BIG_INTEGER, visitor.numberType);
    }

    @Test
    public void testAcceptJsonFormatVisitorForBigDecimal() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper();
        JavaType typeHint = null; // Not used by the method
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertFalse(visitor.visitedInt);
        assertTrue(visitor.visitedFloat);
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, visitor.numberType);
    }

    @Test
    public void testAcceptJsonFormatVisitorForOtherNumber() throws Exception {
        NumberSerializer serializer = new NumberSerializer(Number.class); // Default case
        MockJsonFormatVisitorWrapper visitor = new MockJsonFormatVisitorWrapper();
        JavaType typeHint = null; // Not used by the method
        serializer.acceptJsonFormatVisitor(visitor, typeHint);
        assertFalse(visitor.visitedInt);
        assertFalse(visitor.visitedFloat);
        // The method expects numberFormat and passes null if not BigInteger/BigDecimal
        assertNull(visitor.numberType);
    }
}





