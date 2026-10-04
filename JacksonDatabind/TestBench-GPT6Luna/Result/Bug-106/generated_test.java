package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;

public class TreeTraversingParserTest {
    @Test
    public void testCodecAndVersion() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(TextNode.valueOf("x"));
        assertNull(parser.getCodec());
        assertNotNull(parser.version());
        parser.setCodec(null);
        assertNull(parser.getCodec());
    }

    @Test
    public void testScalarTokenAndText() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(TextNode.valueOf("hello"));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertEquals(5, parser.getTextLength());
        assertEquals("hello", new String(parser.getTextCharacters()));
        assertEquals(0, parser.getTextOffset());
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testScalarTraversalEndAndClose() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(TextNode.valueOf("x"));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNull(parser.nextToken());
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testArrayTraversal() throws Exception {
        ArrayNode array = JsonNodeFactory.instance.arrayNode();
        array.add(3);
        array.add("z");
        TreeTraversingParser parser = new TreeTraversingParser(array);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(3, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("z", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testEmptyArrayTokens() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.arrayNode());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNestedArrayTraversal() throws Exception {
        ArrayNode outer = JsonNodeFactory.instance.arrayNode();
        ArrayNode inner = JsonNodeFactory.instance.arrayNode();
        inner.add(7);
        outer.add(inner);
        TreeTraversingParser parser = new TreeTraversingParser(outer);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(7, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testSkipArrayChildren() throws Exception {
        ArrayNode array = JsonNodeFactory.instance.arrayNode();
        array.add(1);
        array.add(2);
        TreeTraversingParser parser = new TreeTraversingParser(array);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertSame(parser, parser.skipChildren());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testObjectFieldsAndOverrideName() throws Exception {
        ObjectNode object = JsonNodeFactory.instance.objectNode();
        object.put("a", 2);
        TreeTraversingParser parser = new TreeTraversingParser(object);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals("a", parser.getText());
        parser.overrideCurrentName("b");
        assertEquals("b", parser.getCurrentName());
        assertEquals("b", parser.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParsingContextAndLocations() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(TextNode.valueOf("q"));
        assertNotNull(parser.getParsingContext());
        assertEquals(JsonLocation.NA, parser.getTokenLocation());
        assertEquals(JsonLocation.NA, parser.getCurrentLocation());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testNumberAccessorsAtIntUpperBoundary() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.numberNode(2147483647));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        assertEquals(2147483647, parser.getIntValue());
        assertEquals(2147483647L, parser.getLongValue());
        assertEquals(BigInteger.valueOf(2147483647L), parser.getBigIntegerValue());
        assertEquals(new BigDecimal("2147483647"), parser.getDecimalValue());
        assertEquals(2147483647, parser.getNumberValue().intValue());
    }

    @Test
    public void testNumberAccessorsAtIntLowerBoundary() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.numberNode(-2147483648));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-2147483648, parser.getIntValue());
        assertEquals(-2147483648L, parser.getLongValue());
    }

    @Test
    public void testIntOverflowJustAboveBoundary() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.numberNode(2147483648L));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.getIntValue();
            fail("expected InputCoercionException");
        } catch (JsonParseException expected) { }
        assertEquals(2147483648L, parser.getLongValue());
    }

    @Test
    public void testIntOverflowJustBelowBoundary() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.numberNode(-2147483649L));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.getIntValue();
            fail("expected InputCoercionException");
        } catch (JsonParseException expected) { }
        assertEquals(-2147483649L, parser.getLongValue());
    }

    @Test
    public void testFloatingNumberAccessors() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.numberNode(1.5));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
        assertEquals(1.5, parser.getDoubleValue(), 1e-9);
        assertEquals(1.5f, parser.getFloatValue(), 1e-6f);
        assertEquals(new BigDecimal("1.5"), parser.getDecimalValue());
        assertEquals(BigInteger.valueOf(1), parser.getBigIntegerValue());
    }

    @Test
    public void testBooleanText() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.booleanNode(true));
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());
        assertEquals(4, parser.getTextLength());
    }

    @Test
    public void testBinaryEmbeddedValueAndRead() throws Exception {
        byte[] bytes = new byte[] { 1, 2, 3 };
        TreeTraversingParser parser = new TreeTraversingParser(new BinaryNode(bytes));
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(bytes, parser.getEmbeddedObject() == null ? null : parser.getBinaryValue(Base64Variants.getDefaultVariant()));
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        assertEquals(3, parser.readBinaryValue(Base64Variants.getDefaultVariant(), out));
        assertArrayEquals(bytes, out.toByteArray());
    }

    @Test
    public void testPojoEmbeddedObject() throws Exception {
        Object value = "payload";
        TreeTraversingParser parser = new TreeTraversingParser(new POJONode(value));
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertSame(value, parser.getEmbeddedObject());
    }

    @Test
    public void testTextBase64BinaryAccess() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(TextNode.valueOf("AQI="));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertArrayEquals(new byte[] { 1, 2 }, parser.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testClosedParserTextAndEmbeddedObject() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(TextNode.valueOf("x"));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.close();
        assertNull(parser.getText());
        assertNull(parser.getEmbeddedObject());
        assertTrue(parser.isClosed());
    }

    @Test
    public void testNonNumericNumberTypeAndNaN() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(TextNode.valueOf("x"));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertFalse(parser.isNaN());
        try {
            parser.getNumberType();
            fail("expected JsonParseException");
        } catch (JsonParseException expected) { }
    }

    @Test
    public void testReadBinaryEmptyContent() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(JsonNodeFactory.instance.nullNode());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        assertEquals(0, parser.readBinaryValue(Base64Variants.getDefaultVariant(), out));
        assertEquals(0, out.size());
    }
}
