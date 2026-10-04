package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;

public class POJONodeTest {
    @Test
    public void testNodeTypeAndToken() throws Exception {
        POJONode node = new POJONode("x");
        assertEquals(JsonNodeType.POJO, node.getNodeType());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    @Test
    public void testBinaryValueReturnsWrappedBytes() throws Exception {
        byte[] bytes = new byte[] { 1, 2 };
        POJONode node = new POJONode(bytes);
        assertSame(bytes, node.binaryValue());
    }

    @Test
    public void testBinaryValueForNonBytes() throws Exception {
        assertNull(new POJONode("x").binaryValue());
    }

    @Test
    public void testAsTextForNull() throws Exception {
        assertEquals("null", new POJONode(null).asText());
    }

    @Test
    public void testAsTextUsesWrappedValueText() throws Exception {
        assertEquals("17", new POJONode(Integer.valueOf(17)).asText());
    }

    @Test
    public void testAsTextDefaultForNull() throws Exception {
        assertEquals("fallback", new POJONode(null).asText("fallback"));
    }

    @Test
    public void testAsTextDefaultIgnoredForNonNull() throws Exception {
        assertEquals("17", new POJONode(Integer.valueOf(17)).asText("fallback"));
    }

    @Test
    public void testAsBooleanForTrue() throws Exception {
        assertEquals(true, new POJONode(Boolean.TRUE).asBoolean(false));
    }

    @Test
    public void testAsBooleanForFalse() throws Exception {
        assertEquals(false, new POJONode(Boolean.FALSE).asBoolean(true));
    }

    @Test
    public void testAsBooleanDefaultForNonBoolean() throws Exception {
        assertEquals(true, new POJONode("true").asBoolean(true));
    }

    @Test
    public void testAsIntAtIntegerMaximum() throws Exception {
        assertEquals(Integer.MAX_VALUE,
                new POJONode(Integer.valueOf(Integer.MAX_VALUE)).asInt(0));
    }

    @Test
    public void testAsIntBeyondIntegerRange() throws Exception {
        assertEquals(Integer.MIN_VALUE,
                new POJONode(Long.valueOf(2147483648L)).asInt(0));
    }

    @Test
    public void testAsIntUsesDefaultForNonNumber() throws Exception {
        assertEquals(9, new POJONode("9").asInt(9));
    }

    @Test
    public void testAsLongAtLongMaximum() throws Exception {
        assertEquals(Long.MAX_VALUE,
                new POJONode(Long.valueOf(Long.MAX_VALUE)).asLong(0L));
    }

    @Test
    public void testAsLongAtLongMinimum() throws Exception {
        assertEquals(Long.MIN_VALUE,
                new POJONode(Long.valueOf(Long.MIN_VALUE)).asLong(0L));
    }

    @Test
    public void testAsLongUsesDefaultForNonNumber() throws Exception {
        assertEquals(9L, new POJONode("9").asLong(9L));
    }

    @Test
    public void testAsDoubleForNumber() throws Exception {
        assertEquals(1.5, new POJONode(Double.valueOf(1.5)).asDouble(0.0), 1e-9);
    }

    @Test
    public void testAsDoubleUsesDefaultForNonNumber() throws Exception {
        assertEquals(2.5, new POJONode("2.5").asDouble(2.5), 1e-9);
    }

    @Test
    public void testGetPojoReturnsWrappedReference() throws Exception {
        Object value = new Object();
        assertSame(value, new POJONode(value).getPojo());
    }

    @Test
    public void testEqualsForEqualWrappedValues() throws Exception {
        assertEquals(new POJONode("same"), new POJONode("same"));
    }

    @Test
    public void testEqualsForDifferentWrappedValues() throws Exception {
        assertNotEquals(new POJONode("left"), new POJONode("right"));
    }

    @Test
    public void testEqualsForNullWrappedValues() throws Exception {
        assertEquals(new POJONode(null), new POJONode(null));
    }

    @Test
    public void testHashCodeUsesWrappedValue() throws Exception {
        assertEquals("abc".hashCode(), new POJONode("abc").hashCode());
    }

    @Test
    public void testToStringForOrdinaryValue() throws Exception {
        assertEquals("value", new POJONode("value").toString());
    }

    @Test
    public void testToStringForByteArray() throws Exception {
        assertEquals("(binary value of 2 bytes)",
                new POJONode(new byte[] { 1, 2 }).toString());
    }
}
