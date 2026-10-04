package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;

public class NumberSerializersTest {
    @Test
    public void testAddAllRegistersNumericNames() throws Exception {
        Map<String, JsonSerializer<?>> serializers =
                new java.util.HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(serializers);

        assertEquals(12, serializers.size());
        assertNotNull(serializers.get(Integer.class.getName()));
        assertNotNull(serializers.get(Integer.TYPE.getName()));
        assertNotNull(serializers.get(Long.class.getName()));
        assertNotNull(serializers.get(Long.TYPE.getName()));
        assertNotNull(serializers.get(Byte.class.getName()));
        assertNotNull(serializers.get(Byte.TYPE.getName()));
        assertNotNull(serializers.get(Short.class.getName()));
        assertNotNull(serializers.get(Short.TYPE.getName()));
        assertNotNull(serializers.get(Float.class.getName()));
        assertNotNull(serializers.get(Float.TYPE.getName()));
        assertNotNull(serializers.get(Double.class.getName()));
        assertNotNull(serializers.get(Double.TYPE.getName()));
    }

    @Test
    public void testAddAllUsesOneSerializerForIntegerPrimitiveAndWrapper() throws Exception {
        Map<String, JsonSerializer<?>> serializers =
                new java.util.HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(serializers);
        assertSame(serializers.get(Integer.class.getName()),
                serializers.get(Integer.TYPE.getName()));
    }

    @Test
    public void testAddAllReplacesPriorMapping() throws Exception {
        Map<String, JsonSerializer<?>> serializers =
                new java.util.HashMap<String, JsonSerializer<?>>();
        JsonSerializer<?> previous = new NumberSerializers.IntegerSerializer();
        serializers.put(Integer.class.getName(), previous);

        NumberSerializers.addAll(serializers);
        assertNotSame(previous, serializers.get(Integer.class.getName()));
        assertEquals(12, serializers.size());
    }

    @Test
    public void testIntegerIsEmptyAtZero() throws Exception {
        NumberSerializers.IntegerSerializer serializer =
                new NumberSerializers.IntegerSerializer();
        assertTrue(serializer.isEmpty(null, Integer.valueOf(0)));
    }

    @Test
    public void testIntegerIsNotEmptyAtOne() throws Exception {
        NumberSerializers.IntegerSerializer serializer =
                new NumberSerializers.IntegerSerializer();
        assertFalse(serializer.isEmpty(null, Integer.valueOf(1)));
    }

    @Test
    public void testShortIsEmptyAtZero() throws Exception {
        NumberSerializers.ShortSerializer serializer =
                new NumberSerializers.ShortSerializer();
        assertTrue(serializer.isEmpty(null, Short.valueOf((short) 0)));
    }

    @Test
    public void testShortIsNotEmptyAtNegativeOne() throws Exception {
        NumberSerializers.ShortSerializer serializer =
                new NumberSerializers.ShortSerializer();
        assertFalse(serializer.isEmpty(null, Short.valueOf((short) -1)));
    }

    @Test
    public void testIntLikeIsEmptyForNonzeroNumberTruncatedToZero() throws Exception {
        NumberSerializers.IntLikeSerializer serializer =
                new NumberSerializers.IntLikeSerializer();
        assertTrue(serializer.isEmpty(null, Long.valueOf(4294967296L)));
    }

    @Test
    public void testIntLikeIsNotEmptyForOne() throws Exception {
        NumberSerializers.IntLikeSerializer serializer =
                new NumberSerializers.IntLikeSerializer();
        assertFalse(serializer.isEmpty(null, Integer.valueOf(1)));
    }

    @Test
    public void testLongIsEmptyAtZero() throws Exception {
        NumberSerializers.LongSerializer serializer =
                new NumberSerializers.LongSerializer();
        assertTrue(serializer.isEmpty(null, Long.valueOf(0L)));
    }

    @Test
    public void testLongIsNotEmptyAtMinimumValue() throws Exception {
        NumberSerializers.LongSerializer serializer =
                new NumberSerializers.LongSerializer();
        assertFalse(serializer.isEmpty(null, Long.valueOf(Long.MIN_VALUE)));
    }

    @Test
    public void testFloatIsEmptyAtPositiveZero() throws Exception {
        NumberSerializers.FloatSerializer serializer =
                new NumberSerializers.FloatSerializer();
        assertTrue(serializer.isEmpty(null, Float.valueOf(0.0f)));
    }

    @Test
    public void testFloatNegativeZeroIsNotEmpty() throws Exception {
        NumberSerializers.FloatSerializer serializer =
                new NumberSerializers.FloatSerializer();
        assertFalse(serializer.isEmpty(null, Float.valueOf(-0.0f)));
    }

    @Test
    public void testDoubleIsEmptyAtPositiveZero() throws Exception {
        NumberSerializers.DoubleSerializer serializer =
                new NumberSerializers.DoubleSerializer();
        assertTrue(serializer.isEmpty(null, Double.valueOf(0.0d)));
    }

    @Test
    public void testDoubleNegativeZeroIsNotEmpty() throws Exception {
        NumberSerializers.DoubleSerializer serializer =
                new NumberSerializers.DoubleSerializer();
        assertFalse(serializer.isEmpty(null, Double.valueOf(-0.0d)));
    }

    @Test
    public void testIntegerSchemaDeclaresInteger() throws Exception {
        NumberSerializers.IntegerSerializer serializer =
                new NumberSerializers.IntegerSerializer();
        JsonNode schema = serializer.getSchema(null, (Type) null);
        assertEquals("integer", schema.get("type").textValue());
    }

    @Test
    public void testShortSchemaDeclaresNumber() throws Exception {
        NumberSerializers.ShortSerializer serializer =
                new NumberSerializers.ShortSerializer();
        JsonNode schema = serializer.getSchema(null, (Type) null);
        assertEquals("number", schema.get("type").textValue());
    }

    @Test
    public void testLongSchemaDeclaresNumber() throws Exception {
        NumberSerializers.LongSerializer serializer =
                new NumberSerializers.LongSerializer();
        JsonNode schema = serializer.getSchema(null, (Type) null);
        assertEquals("number", schema.get("type").textValue());
    }

    @Test
    public void testIntegerSerializerAcceptsNullContextualProperty() throws Exception {
        NumberSerializers.IntegerSerializer serializer =
                new NumberSerializers.IntegerSerializer();
        JsonSerializer<?> contextual = serializer.createContextual(null, null);
        assertSame(serializer, contextual);
    }

    @Test
    public void testShortSerializerAcceptsNullContextualProperty() throws Exception {
        NumberSerializers.ShortSerializer serializer =
                new NumberSerializers.ShortSerializer();
        JsonSerializer<?> contextual = serializer.createContextual(null, null);
        assertSame(serializer, contextual);
    }
}
