package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.util.JsonParserSequence; // Added import for JsonParserSequence
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeTraversingParserTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNextTokenOnRootArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode root = mapper.createArrayNode();
        root.add(mapper.getNodeFactory().textNode("hello"));
        TreeTraversingParser parser = new TreeTraversingParser(root);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnRootObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("key", "value");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnValueNode() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("single value");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("single value", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnNullNode() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().nullNode();
        TreeTraversingParser parser = new TreeTraversingParser(root);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnNumberNode() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(123);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // consume START_OBJECT or START_ARRAY if it were one, or VALUE_NUMBER_INT directly
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getParsingContext().getCurrentToken()); // Check token after nextToken
        assertEquals("123", parser.getText());
        assertEquals(123, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnFloatingPointNode() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(123.45);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // consume START_OBJECT or START_ARRAY if it were one, or VALUE_NUMBER_FLOAT directly
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.getParsingContext().getCurrentToken()); // Check token after nextToken
        assertEquals("123.45", parser.getText());
        assertEquals(123.45, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnBooleanNodeTrue() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().booleanNode(true);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals("true", parser.getText());
        assertTrue(parser.getBooleanValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnBooleanNodeFalse() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().booleanNode(false);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals("false", parser.getText());
        assertFalse(parser.getBooleanValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetTextForFieldName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("test_key", "test_value");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("test_key", parser.getText());
    }

    @Test
    public void testGetTextForNumericValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("test_key", 987);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals("987", parser.getText());
    }

    @Test
    public void testGetTextForFloatingPointValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("test_key", 123.456);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals("123.456", parser.getText());
    }

    @Test
    public void testGetTextForNullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.set("test_key", mapper.getNodeFactory().nullNode());
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_NULL
        assertEquals("null", parser.getText());
    }

    @Test
    public void testGetCurrentNameAfterField() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("my_field", "some_value");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("my_field", parser.getCurrentName());
    }

    @Test
    public void testGetParsingContextForRoot() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("test");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_STRING
        assertNotNull(parser.getParsingContext());
        // JsonStreamContext.TYPE_ROOT is protected. Use its integer value.
        assertEquals(JsonStreamContext.TYPE_ROOT, parser.getParsingContext().getType());
    }

    @Test
    public void testGetParsingContextForArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode root = mapper.createArrayNode();
        root.add("a");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_ARRAY
        assertNotNull(parser.getParsingContext());
        // JsonStreamContext.TYPE_ARRAY is protected. Use its integer value.
        assertEquals(JsonStreamContext.TYPE_ARRAY, parser.getParsingContext().getType());
    }

    @Test
    public void testGetParsingContextForObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("a", 1);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        assertNotNull(parser.getParsingContext());
        // JsonStreamContext.TYPE_OBJECT is protected. Use its integer value.
        assertEquals(JsonStreamContext.TYPE_OBJECT, parser.getParsingContext().getType());
    }

    @Test
    public void testGetBigIntegerValue() throws Exception {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(bigInt);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(bigInt, parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws Exception {
        BigDecimal bigDec = new BigDecimal("123.45678901234567890");
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(bigDec);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(bigDec, parser.getDecimalValue());
    }

    @Test
    public void testGetIntValue() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(Integer.MAX_VALUE);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
    }

    @Test
    public void testGetIntValueOverflow() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(new BigInteger("2147483648")); // Integer.MAX_VALUE + 1
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_INT
        // Current behavior of Jackson is to return the value truncated or wrapped.
        // For BigInteger > Integer.MAX_VALUE, intValue() typically returns Integer.MAX_VALUE.
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(Long.MAX_VALUE);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
    }

    @Test
    public void testGetLongValueOverflow() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(new BigInteger("9223372036854775808")); // Long.MAX_VALUE + 1
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_INT
        // Current behavior of Jackson is to return the value truncated or wrapped.
        // For BigInteger > Long.MAX_VALUE, longValue() typically returns Long.MAX_VALUE.
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
    }

    @Test
    public void testGetFloatValue() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(Float.MAX_VALUE);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Float.MAX_VALUE, parser.getFloatValue(), 1e-9);
    }

    @Test
    public void testGetFloatValueTruncation() throws Exception {
        // A value with more precision than a float can hold
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(123.4567890123456789);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // The doubleValue will be more precise, casting to float will truncate.
        // We test against the result of casting the double value to float.
        assertEquals((float) 123.4567890123456789, parser.getFloatValue(), 0);
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(Double.MAX_VALUE);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Double.MAX_VALUE, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testGetEmbeddedObjectPojo() throws Exception {
        Object pojo = new Object();
        JsonNode root = new ObjectMapper().getNodeFactory().pojoNode(pojo);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_EMBEDDED_OBJECT
        assertSame(pojo, parser.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObjectBinary() throws Exception {
        byte[] data = {1, 2, 3};
        JsonNode root = new ObjectMapper().getNodeFactory().binaryNode(data);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_EMBEDDED_OBJECT
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
    }

    @Test
    public void testIsNaNForNaN() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(Double.NaN);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertTrue(parser.isNaN());
    }

    @Test
    public void testIsNaNForNonNaN() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(123.45);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertFalse(parser.isNaN());
    }

    @Test
    public void testGetBinaryValue() throws Exception {
        byte[] data = {10, 20, 30, 40};
        JsonNode root = new ObjectMapper().getNodeFactory().binaryNode(data);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_EMBEDDED_OBJECT
        // Base64Variant constructor from string literals is not public, use default variant.
        // The class com.fasterxml.jackson.core.Base64Variants provides static accessors.
        com.fasterxml.jackson.core.Base64Variant b64Variant = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
        assertArrayEquals(data, parser.getBinaryValue(b64Variant));
    }

    @Test
    public void testReadBinaryValue() throws Exception {
        byte[] data = {5, 6, 7, 8};
        JsonNode root = new ObjectMapper().getNodeFactory().binaryNode(data);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_EMBEDDED_OBJECT
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        com.fasterxml.jackson.core.Base64Variant b64Variant = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
        int bytesRead = parser.readBinaryValue(b64Variant, baos);
        assertEquals(data.length, bytesRead);
        assertArrayEquals(data, baos.toByteArray());
    }

    @Test
    public void testSkipChildrenOnObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("a", 1);
        ObjectNode nestedObject = mapper.createObjectNode().put("c", 2);
        root.set("b", nestedObject);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME "a"
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.nextToken(); // FIELD_NAME "b"
        parser.skipChildren(); // Should skip the nested object
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testSkipChildrenOnArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode root = mapper.createArrayNode();
        root.add(1);
        ArrayNode nestedArray = mapper.createArrayNode().add(2);
        root.add(nestedArray);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.skipChildren(); // Should skip the nested array
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testClose() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("test");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.close();
        assertTrue(parser.isClosed());
        assertNull(parser.nextToken());
    }

    @Test
    public void testIsClosedAfterClose() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("test");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testgetTextOffsetAlwaysZero() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("some long text");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testgetTextCharacters() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("test_chars");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        char[] expected = "test_chars".toCharArray();
        assertArrayEquals(expected, parser.getTextCharacters());
    }

    @Test
    public void testgetTextLength() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("test_length");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals("test_length".length(), parser.getTextLength());
    }

    @Test
    public void testHasTextCharactersFalse() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().textNode("test");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetNumberTypeForInt() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(123);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeForLong() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(1234567890L);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeForFloat() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(123.45f);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals(JsonParser.NumberType.FLOAT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeForDouble() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(123.456789);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeForBigInteger() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(new BigInteger("9999999999999999999999"));
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeForBigDecimal() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(new BigDecimal("12345.678901234567890"));
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken();
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        root.put("original_name", "value");
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.overrideCurrentName("new_name");
        assertEquals("new_name", parser.getCurrentName());
        assertEquals("new_name", parser.getText()); // getText also uses getCurrentName for FIELD_NAME
    }

    @Test
    public void testSetAndGetCodec() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(new ObjectMapper().getNodeFactory().textNode("test"));
        ObjectCodec codec = new ObjectMapper();
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testVersion() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(new ObjectMapper().getNodeFactory().textNode("test"));
        // Assuming PackageVersion.VERSION is accessible and has a specific value,
        // or we can just check it's not null.
        assertNotNull(parser.version());
    }

    @Test
    public void testGetNumberValue() throws Exception {
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(12345);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_INT
        Number number = parser.getNumberValue();
        assertNotNull(number);
        assertEquals(12345, number.intValue());
    }

    @Test
    public void testGetNumberValueForBigDecimal() throws Exception {
        BigDecimal bigDec = new BigDecimal("123.45678901234567890");
        JsonNode root = new ObjectMapper().getNodeFactory().numberNode(bigDec);
        TreeTraversingParser parser = new TreeTraversingParser(root);
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        Number number = parser.getNumberValue();
        assertNotNull(number);
        assertEquals(bigDec, number);
    }

    @Test
    public void testGetTokenLocationNA() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(new ObjectMapper().getNodeFactory().textNode("test"));
        parser.nextToken();
        assertEquals(JsonLocation.NA, parser.getTokenLocation());
    }

    @Test
    public void testGetCurrentLocationNA() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(new ObjectMapper().getNodeFactory().textNode("test"));
        parser.nextToken();
        assertEquals(JsonLocation.NA, parser.getCurrentLocation());
    }

    @Test
    public void testBinaryValueWithTextNode() throws Exception {
        TextNode textNode = TextNode.valueOf("SGVsbG8="); // "Hello" base64 encoded
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        com.fasterxml.jackson.core.Base64Variant b64Variant = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
        byte[] decoded = parser.getBinaryValue(b64Variant);
        assertArrayEquals("Hello".getBytes(), decoded);
    }

    @Test
    public void testReadBinaryValueWithTextNode() throws Exception {
        TextNode textNode = TextNode.valueOf("V29ybGQ="); // "World" base64 encoded
        TreeTraversingParser parser = new TreeTraversingParser(textNode);
        parser.nextToken();
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        com.fasterxml.jackson.core.Base64Variant b64Variant = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
        parser.readBinaryValue(b64Variant, baos);
        assertArrayEquals("World".getBytes(), baos.toByteArray());
    }
}
