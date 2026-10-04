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
import java.util.ArrayList;
import java.util.List;

public class TreeTraversingParserTest {

    // Helper method to create a simple JSON tree
    private JsonNode createSimpleTree() {
        // {"name": "test", "value": 123, "nested": {"flag": true, "items": [1, "a"]}}
        ObjectNode root = JsonNodeFactory.instance.objectNode();
        root.put("name", "test");
        root.put("value", 123);
        ObjectNode nested = JsonNodeFactory.instance.objectNode();
        nested.put("flag", true);
        ArrayNode items = JsonNodeFactory.instance.arrayNode();
        items.add(1);
        items.add("a");
        nested.set("items", items);
        root.set("nested", nested);
        return root;
    }

    // Helper method to create a JSON tree with various number types
    private JsonNode createNumericTree() {
        ObjectNode root = JsonNodeFactory.instance.objectNode();
        root.put("intVal", 10);
        root.put("longVal", 10000000000L);
        root.put("doubleVal", 123.456);
        root.put("bigIntVal", new BigInteger("12345678901234567890"));
        root.put("bigDecVal", new BigDecimal("9876543210.123456789"));
        root.put("floatVal", (float) 98.765);
        root.put("bigIntMax", BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE));
        root.put("bigDecMax", new BigDecimal("1.0E308")); // Max double
        root.put("bigDecMin", new BigDecimal("-1.0E308")); // Min double
        return root;
    }
    
    // Helper method to create a JSON tree with edge case numbers
    private JsonNode createNumericEdgeCasesTree() {
        ObjectNode root = JsonNodeFactory.instance.objectNode();
        // Values that fit within int but might be represented as long/double if not careful
        root.put("intMax", Integer.MAX_VALUE);
        root.put("intMin", Integer.MIN_VALUE);
        // Values that fit within long but might be represented as double if not careful
        root.put("longMax", Long.MAX_VALUE);
        root.put("longMin", Long.MIN_VALUE);
        // Values that exceed long
        root.put("exceedsLongMax", BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE));
        root.put("exceedsLongMin", BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE));
        // Values that are exactly at the boundary of float/double representation
        root.put("floatMax", Float.MAX_VALUE);
        root.put("floatMin", Float.MIN_VALUE);
        root.put("doubleMax", Double.MAX_VALUE);
        root.put("doubleMin", Double.MIN_VALUE);
        // NaN and Infinity
        root.put("nan", Double.NaN);
        root.put("posInf", Double.POSITIVE_INFINITY);
        root.put("negInf", Double.NEGATIVE_INFINITY);
        return root;
    }

    // Helper method to create a JSON tree with binary and POJO nodes
    private JsonNode createBinaryAndPojoTree() {
        ObjectNode root = JsonNodeFactory.instance.objectNode();
        root.put("binary", new byte[]{1, 2, 3});
        root.putPOJO("pojo", new MyPojo("data"));
        return root;
    }

    // Helper method to create an empty object and array
    private JsonNode createEmptyContainerTree() {
        ObjectNode root = JsonNodeFactory.instance.objectNode();
        root.set("emptyArray", JsonNodeFactory.instance.arrayNode());
        root.set("emptyObject", JsonNodeFactory.instance.objectNode());
        return root;
    }

    @Test
    public void testNextTokenOnRootValueNode() throws Exception {
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnRootArray() throws Exception {
        ArrayNode arr = JsonNodeFactory.instance.arrayNode();
        arr.add(1).add("two").addNull();
        TreeTraversingParser parser = new TreeTraversingParser(arr);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("two", parser.getText());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenOnRootObject() throws Exception {
        ObjectNode obj = JsonNodeFactory.instance.objectNode();
        obj.put("field1", 10);
        obj.put("field2", "value2");
        TreeTraversingParser parser = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field1", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(10, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field2", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value2", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNestedObjectsAndArrays() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken()); // {
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // "name"
        assertEquals("name", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken()); // "test"
        assertEquals("test", parser.getText());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // "value"
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // 123
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // "nested"
        assertEquals("nested", parser.getText());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken()); // {
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // "flag"
        assertEquals("flag", parser.getText());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken()); // true
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // "items"
        assertEquals("items", parser.getText());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken()); // [
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken()); // 1
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken()); // "a"
        assertEquals("a", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken()); // ]
        assertEquals(JsonToken.END_OBJECT, parser.nextToken()); // }
        assertEquals(JsonToken.END_OBJECT, parser.nextToken()); // }
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testSkipChildren() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME: "name"
        parser.nextToken(); // VALUE_STRING: "test"
        
        // Skip the "value" field and its value
        parser.nextToken(); // FIELD_NAME: "value"
        parser.skipChildren(); // Should advance past the VALUE_NUMBER_INT
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken()); // _currToken is updated by skipChildren
        parser.nextToken(); // Advance past VALUE_NUMBER_INT
        
        // Skip the "nested" object
        parser.nextToken(); // FIELD_NAME: "nested"
        parser.skipChildren(); // Should advance past the entire nested object (START_OBJECT ... END_OBJECT)
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken()); // _currToken is updated by skipChildren
        parser.nextToken(); // Advance past END_OBJECT
        
        assertNull(parser.nextToken());
    }

    @Test
    public void testIsClosed() throws Exception {
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetCurrentName() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertNull(parser.getCurrentName());
        
        parser.nextToken(); // FIELD_NAME: "name"
        assertEquals("name", parser.getCurrentName());
        
        parser.nextToken(); // VALUE_STRING: "test"
        assertNull(parser.getCurrentName()); // Current name is for fields, not values
        
        parser.nextToken(); // FIELD_NAME: "value"
        assertEquals("value", parser.getCurrentName());
        
        parser.nextToken(); // VALUE_NUMBER_INT: 123
        assertNull(parser.getCurrentName());
        
        parser.nextToken(); // FIELD_NAME: "nested"
        assertEquals("nested", parser.getCurrentName());

        parser.nextToken(); // START_OBJECT
        assertNull(parser.getCurrentName());
        
        parser.nextToken(); // FIELD_NAME: "flag"
        assertEquals("flag", parser.getCurrentName());
    }
    
    @Test
    public void testOverrideCurrentName() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        parser.overrideCurrentName("overridden"); // Should not affect if not in object context
        assertNull(parser.getCurrentName());

        parser.nextToken(); // FIELD_NAME: "name"
        assertEquals("name", parser.getCurrentName());
        parser.overrideCurrentName("newName");
        assertEquals("newName", parser.getCurrentName());
        
        parser.nextToken(); // VALUE_STRING: "test"
        parser.overrideCurrentName("anotherName"); // Should not affect if not in object context
        assertNull(parser.getCurrentName());
    }


    @Test
    public void testGetTokenLocationAndGetCurrentLocation() throws Exception {
        // These methods are expected to return NA
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        parser.nextToken();
        assertEquals(JsonLocation.NA, parser.getTokenLocation());
        assertEquals(JsonLocation.NA, parser.getCurrentLocation());
    }

    @Test
    public void testGetText() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT.asString(), parser.getText());

        parser.nextToken(); // FIELD_NAME: "name"
        assertEquals("name", parser.getText());
        
        parser.nextToken(); // VALUE_STRING: "test"
        assertEquals("test", parser.getText());
        
        parser.nextToken(); // FIELD_NAME: "value"
        assertEquals("value", parser.getText());
        
        parser.nextToken(); // VALUE_NUMBER_INT: 123
        assertEquals("123", parser.getText());
        
        parser.nextToken(); // FIELD_NAME: "nested"
        assertEquals("nested", parser.getText());
        
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT.asString(), parser.getText());
        
        parser.nextToken(); // FIELD_NAME: "flag"
        assertEquals("flag", parser.getText());
        
        parser.nextToken(); // VALUE_TRUE
        assertEquals("true", parser.getText());
        
        parser.nextToken(); // FIELD_NAME: "items"
        assertEquals("items", parser.getText());
        
        parser.nextToken(); // START_ARRAY
        assertEquals(JsonToken.START_ARRAY.asString(), parser.getText());
        
        parser.nextToken(); // VALUE_NUMBER_INT: 1
        assertEquals("1", parser.getText());
        
        parser.nextToken(); // VALUE_STRING: "a"
        assertEquals("a", parser.getText());
        
        parser.nextToken(); // END_ARRAY
        assertEquals(JsonToken.END_ARRAY.asString(), parser.getText());
        
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT.asString(), parser.getText());
        
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT.asString(), parser.getText());
        
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetTextCharactersAndLength() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertNull(parser.getTextCharacters());
        assertEquals(0, parser.getTextLength());

        parser.nextToken(); // FIELD_NAME: "name"
        assertNotNull(parser.getTextCharacters());
        assertEquals("name".length(), parser.getTextLength());
        assertArrayEquals("name".toCharArray(), parser.getTextCharacters());
        
        parser.nextToken(); // VALUE_STRING: "test"
        assertNotNull(parser.getTextCharacters());
        assertEquals("test".length(), parser.getTextLength());
        assertArrayEquals("test".toCharArray(), parser.getTextCharacters());

        parser.nextToken(); // FIELD_NAME: "value"
        assertNotNull(parser.getTextCharacters());
        assertEquals("value".length(), parser.getTextLength());
        assertArrayEquals("value".toCharArray(), parser.getTextCharacters());

        parser.nextToken(); // VALUE_NUMBER_INT: 123
        assertNotNull(parser.getTextCharacters());
        assertEquals("123".length(), parser.getTextLength());
        assertArrayEquals("123".toCharArray(), parser.getTextCharacters());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        // getTextOffset always returns 0 for TreeTraversingParser
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testHasTextCharacters() {
        // hasTextCharacters always returns false for TreeTraversingParser
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetNumberType() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertNull(parser.getNumberType());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertNull(parser.getNumberType());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertNull(parser.getNumberType());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        assertEquals(JsonParser.NumberType.LONG, parser.getNumberType());
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertNull(parser.getNumberType());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(JsonParser.NumberType.DOUBLE, parser.getNumberType());

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertNull(parser.getNumberType());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());

        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertNull(parser.getNumberType());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, parser.getNumberType());

        parser.nextToken(); // FIELD_NAME: "floatVal"
        assertNull(parser.getNumberType());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (float)
        assertEquals(JsonParser.NumberType.FLOAT, parser.getNumberType());
    }

    @Test
    public void testGetIntValue() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to the integer value
        for(int i=0; i<5; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME("name"), VALUE_STRING("test"), FIELD_NAME("value"), VALUE_NUMBER_INT(123)
        
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to the long value
        for(int i=0; i<5; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME("intVal"), VALUE_NUMBER_INT(10), FIELD_NAME("longVal"), VALUE_NUMBER_INT(10000000000L)
        
        assertEquals(10000000000L, parser.getLongValue());
    }
    
    @Test
    public void testGetDoubleValueEdgeCases() throws Exception {
        JsonNode tree = createNumericEdgeCasesTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to numbers
        for (int i = 0; i < 2; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME: "intMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((double)Integer.MAX_VALUE, parser.getDoubleValue(), 1e-9);
        
        parser.nextToken(); // FIELD_NAME: "intMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((double)Integer.MIN_VALUE, parser.getDoubleValue(), 1e-9);
        
        parser.nextToken(); // FIELD_NAME: "longMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((double)Long.MAX_VALUE, parser.getDoubleValue(), 1e-9);
        
        parser.nextToken(); // FIELD_NAME: "longMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((double)Long.MIN_VALUE, parser.getDoubleValue(), 1e-9);
        
        // Values exceeding long should still be convertible to double, potentially with loss of precision
        parser.nextToken(); // FIELD_NAME: "exceedsLongMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigDecimal(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)).doubleValue(), parser.getDoubleValue(), 1e-9);

        parser.nextToken(); // FIELD_NAME: "exceedsLongMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigDecimal(BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE)).doubleValue(), parser.getDoubleValue(), 1e-9);

        parser.nextToken(); // FIELD_NAME: "floatMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals((double)Float.MAX_VALUE, parser.getDoubleValue(), 1e-9);

        parser.nextToken(); // FIELD_NAME: "floatMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals((double)Float.MIN_VALUE, parser.getDoubleValue(), 1e-9);
        
        parser.nextToken(); // FIELD_NAME: "doubleMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Double.MAX_VALUE, parser.getDoubleValue(), 1e-9);

        parser.nextToken(); // FIELD_NAME: "doubleMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Double.MIN_VALUE, parser.getDoubleValue(), 1e-9);
        
        // NaN and Infinity
        parser.nextToken(); // FIELD_NAME: "nan"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (NaN)
        assertTrue(Double.isNaN(parser.getDoubleValue()));

        parser.nextToken(); // FIELD_NAME: "posInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 1e-9);

        parser.nextToken(); // FIELD_NAME: "negInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testGetFloatValueEdgeCases() throws Exception {
        JsonNode tree = createNumericEdgeCasesTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to numbers
        for (int i = 0; i < 2; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME: "intMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((float)Integer.MAX_VALUE, parser.getFloatValue(), 1e-5);
        
        parser.nextToken(); // FIELD_NAME: "intMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((float)Integer.MIN_VALUE, parser.getFloatValue(), 1e-5);
        
        parser.nextToken(); // FIELD_NAME: "longMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((float)Long.MAX_VALUE, parser.getFloatValue(), 1e-5); // Loses precision
        
        parser.nextToken(); // FIELD_NAME: "longMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((float)Long.MIN_VALUE, parser.getFloatValue(), 1e-5); // Loses precision
        
        // Values exceeding long should still be convertible to float, with potential precision loss
        parser.nextToken(); // FIELD_NAME: "exceedsLongMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigDecimal(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)).floatValue(), parser.getFloatValue(), 1e-5);

        parser.nextToken(); // FIELD_NAME: "exceedsLongMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigDecimal(BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE)).floatValue(), parser.getFloatValue(), 1e-5);

        parser.nextToken(); // FIELD_NAME: "floatMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Float.MAX_VALUE, parser.getFloatValue(), 1e-5);

        parser.nextToken(); // FIELD_NAME: "floatMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Float.MIN_VALUE, parser.getFloatValue(), 1e-5);
        
        // Double values are converted to float, losing precision
        parser.nextToken(); // FIELD_NAME: "doubleMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals((float)Double.MAX_VALUE, parser.getFloatValue(), 1e-5);

        parser.nextToken(); // FIELD_NAME: "doubleMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals((float)Double.MIN_VALUE, parser.getFloatValue(), 1e-5);
        
        // NaN and Infinity
        parser.nextToken(); // FIELD_NAME: "nan"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (NaN)
        assertTrue(Float.isNaN(parser.getFloatValue()));

        parser.nextToken(); // FIELD_NAME: "posInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertEquals(Float.POSITIVE_INFINITY, parser.getFloatValue(), 1e-5);

        parser.nextToken(); // FIELD_NAME: "negInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertEquals(Float.NEGATIVE_INFINITY, parser.getFloatValue(), 1e-5);
    }

    @Test
    public void testGetBigIntegerValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to the BigInteger value
        for(int i=0; i<7; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME("intVal")... FIELD_NAME("bigIntVal")
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        
        assertEquals(new BigInteger("12345678901234567890"), parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to the BigDecimal value
        for(int i=0; i<9; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME("intVal")... FIELD_NAME("bigDecVal")
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        
        assertEquals(new BigDecimal("9876543210.123456789"), parser.getDecimalValue());
    }

    @Test
    public void testGetEmbeddedObject() throws Exception {
        JsonNode tree = createBinaryAndPojoTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertNull(parser.getEmbeddedObject());

        parser.nextToken(); // FIELD_NAME: "binary"
        assertNull(parser.getEmbeddedObject());
        parser.nextToken(); // VALUE_EMBEDDED_OBJECT (BinaryNode)
        assertArrayEquals(new byte[]{1, 2, 3}, (byte[]) parser.getEmbeddedObject());
        
        parser.nextToken(); // FIELD_NAME: "pojo"
        assertNull(parser.getEmbeddedObject());
        parser.nextToken(); // VALUE_EMBEDDED_OBJECT (POJONode)
        assertTrue(parser.getEmbeddedObject() instanceof MyPojo);
        assertEquals("data", ((MyPojo)parser.getEmbeddedObject()).getData());
    }

    @Test
    public void testIsNaN() throws Exception {
        JsonNode tree = createNumericEdgeCasesTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to NaN
        for(int i=0; i<14; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME("intMax")... FIELD_NAME("nan")
        
        parser.nextToken(); // VALUE_NUMBER_FLOAT (NaN)
        assertTrue(parser.isNaN());
        
        // Move to Infinity
        parser.nextToken(); // FIELD_NAME: "posInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertFalse(parser.isNaN());

        // Move to a normal number
        parser.nextToken(); // FIELD_NAME: "negInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertFalse(parser.isNaN());
        
        parser.nextToken(); // FIELD_NAME: "intMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertFalse(parser.isNaN());
    }

    @Test
    public void testReadBinaryValue() throws Exception {
        JsonNode tree = createBinaryAndPojoTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to binary node
        for(int i=0; i<3; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME("binary"), VALUE_EMBEDDED_OBJECT
        
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        int bytesRead = parser.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(3, bytesRead);
        assertArrayEquals(new byte[]{1, 2, 3}, baos.toByteArray());
        
        // Test with empty binary data
        ObjectNode root = JsonNodeFactory.instance.objectNode();
        root.put("emptyBinary", new byte[]{});
        
        TreeTraversingParser parser2 = new TreeTraversingParser(root);
        parser2.nextToken(); // START_OBJECT
        parser2.nextToken(); // FIELD_NAME: "emptyBinary"
        parser2.nextToken(); // VALUE_EMBEDDED_OBJECT
        
        baos = new java.io.ByteArrayOutputStream();
        bytesRead = parser2.readBinaryValue(Base64Variants.MIME, baos);
        assertEquals(0, bytesRead);
        assertArrayEquals(new byte[]{}, baos.toByteArray());
    }

    @Test
    public void testClose() throws Exception {
        JsonNode node = JsonNodeFactory.instance.textNode("hello");
        TreeTraversingParser parser = new TreeTraversingParser(node);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        assertNull(parser.currentNode()); // Cursor should be null after close
        assertNull(parser.nextToken()); // Should return null after close
    }
    
    @Test
    public void testIteratorEmptyArray() throws Exception {
        JsonNode tree = createEmptyContainerTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Navigate to empty array
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME: "emptyArray"
        parser.nextToken(); // START_ARRAY
        assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken());
        
        // Now advance to check if it correctly handles empty array
        parser.nextToken(); // END_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        
        assertNull(parser.nextToken()); // End of stream
    }
    
    @Test
    public void testIteratorEmptyObject() throws Exception {
        JsonNode tree = createEmptyContainerTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Navigate to empty object
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME: "emptyArray"
        parser.nextToken(); // START_ARRAY
        parser.nextToken(); // END_ARRAY
        parser.nextToken(); // FIELD_NAME: "emptyObject"
        parser.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
        
        // Now advance to check if it correctly handles empty object
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        
        assertNull(parser.nextToken()); // End of stream
    }

    // Dummy POJO for testing getEmbeddedObject
    private static class MyPojo {
        private String data;
        
        public MyPojo(String data) {
            this.data = data;
        }
        
        public String getData() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyPojo myPojo = (MyPojo) o;
            return java.util.Objects.equals(data, myPojo.data);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(data);
        }
    }
}
