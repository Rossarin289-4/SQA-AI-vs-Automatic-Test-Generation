package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.util.Map;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class NumberSerializerTest {
    @Test
    public void testSchemaForGenericNumber() throws Exception {
        JsonNode schema = NumberSerializer.instance.getSchema(null, (Type) null);
        assertEquals("number", schema.get("type").asText());
        assertTrue(schema.get("required").asBoolean());
    }

    @Test
    public void testSchemaForBigInteger() throws Exception {
        JsonNode schema = new NumberSerializer(BigInteger.class).getSchema(null, (Type) null);
        assertEquals("integer", schema.get("type").asText());
        assertTrue(schema.get("required").asBoolean());
    }

    @Test
    public void testSchemaForBigDecimal() throws Exception {
        JsonNode schema = new NumberSerializer(BigDecimal.class).getSchema(null, (Type) null);
        assertEquals("number", schema.get("type").asText());
        assertTrue(schema.get("required").asBoolean());
    }

    @Test
    public void testStaticBigDecimalStringSerializerIsStable() throws Exception {
        assertSame(NumberSerializer.bigDecimalAsStringSerializer(),
                NumberSerializer.bigDecimalAsStringSerializer());
    }

    @Test
    public void testStringSerializerEmptyValueForBigDecimal() throws Exception {
        JsonSerializer serializer = NumberSerializer.bigDecimalAsStringSerializer();
        assertFalse(serializer.isEmpty(null, new BigDecimal("0")));
    }

    @Test
    public void testStringSerializerNonemptyValueForBigDecimal() throws Exception {
        JsonSerializer serializer = NumberSerializer.bigDecimalAsStringSerializer();
        assertFalse(serializer.isEmpty(null, new BigDecimal("12.5")));
    }

    @Test
    public void testBigDecimalValueToStringThrows() throws Exception {
        try {
            NumberSerializer.BigDecimalAsStringSerializer serializer =
                    (NumberSerializer.BigDecimalAsStringSerializer)
                    NumberSerializer.bigDecimalAsStringSerializer();
            serializer.valueToString(new BigDecimal("1"));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testContextualGenericSerializerWithoutProvider() throws Exception {
        assertSame(NumberSerializer.instance, NumberSerializer.instance.createContextual(null, null));
    }

    @Test
    public void testContextualBigDecimalSerializerWithoutProvider() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        assertSame(serializer, serializer.createContextual(null, null));
    }

    @Test
    public void testNumberSerializersAddAllContainsIntegerEntries() throws Exception {
        Map<String, JsonSerializer<?>> serializers = new java.util.HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(serializers);
        assertEquals(10, serializers.size());
        assertNotNull(serializers.get(Integer.class.getName()));
        assertNotNull(serializers.get(Integer.TYPE.getName()));
    }

    @Test
    public void testNumberSerializersAddAllContainsFloatingEntries() throws Exception {
        Map<String, JsonSerializer<?>> serializers = new java.util.HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(serializers);
        assertNotNull(serializers.get(Double.class.getName()));
        assertNotNull(serializers.get(Double.TYPE.getName()));
        assertNotNull(serializers.get(Float.class.getName()));
        assertNotNull(serializers.get(Float.TYPE.getName()));
    }

    @Test
    public void testBigIntegerSchemaIsIntegerAtLargeValueType() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigInteger.class);
        JsonNode schema = serializer.getSchema(null, (Type) null);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testBigDecimalSchemaRemainsNumberAtScaleEdge() throws Exception {
        NumberSerializer serializer = new NumberSerializer(BigDecimal.class);
        assertEquals("number", serializer.getSchema(null, (Type) null).get("type").asText());
        assertEquals(9999, new BigDecimal("1E-9999").scale());
    }
}
