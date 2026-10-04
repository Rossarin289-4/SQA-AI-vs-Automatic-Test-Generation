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
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser._currToken); // _currToken is updated by skipChildren
        parser.nextToken(); // Advance past VALUE_NUMBER_INT
        
        // Skip the "nested" object
        parser.nextToken(); // FIELD_NAME: "nested"
        parser.skipChildren(); // Should advance past the entire nested object (START_OBJECT ... END_OBJECT)
        assertEquals(JsonToken.END_OBJECT, parser._currToken); // _currToken is updated by skipChildren
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
    public void testGetParsingContext() throws Exception {
        JsonNode tree = createSimpleTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        JsonStreamContext context;

        context = parser.getParsingContext();
        assertTrue(context.inRoot());
        assertEquals(JsonStreamContext.CONTEXT_TYPE_ROOT, context.getEntryType());
        assertNull(context.getCurrentName());
        assertEquals(-1, context.getStreamReadValueOffset()); // Not applicable

        parser.nextToken(); // START_OBJECT
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals(JsonStreamContext.CONTEXT_TYPE_OBJECT, context.getEntryType());
        assertNull(context.getCurrentName());
        assertEquals(0, context.getStreamReadValueOffset()); // Start of object

        parser.nextToken(); // FIELD_NAME: "name"
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("name", context.getCurrentName());
        assertEquals(0, context.getCurrentIndex()); // Index in array is not applicable for fields

        parser.nextToken(); // VALUE_STRING: "test"
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("name", context.getCurrentName()); // Current name persists until next field
        assertEquals(1, context.getStreamReadValueOffset()); // Value offset

        parser.nextToken(); // FIELD_NAME: "value"
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("value", context.getCurrentName());
        assertEquals(2, context.getStreamReadValueOffset()); // Value offset
        
        parser.nextToken(); // VALUE_NUMBER_INT: 123
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("value", context.getCurrentName());
        assertEquals(3, context.getStreamReadValueOffset()); // Value offset
        
        parser.nextToken(); // FIELD_NAME: "nested"
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("nested", context.getCurrentName());
        assertEquals(4, context.getStreamReadValueOffset()); // Value offset
        
        parser.nextToken(); // START_OBJECT
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("nested", context.getCurrentName()); // Name of the object being entered
        assertEquals(0, context.getStreamReadValueOffset()); // Start of nested object

        parser.nextToken(); // FIELD_NAME: "flag"
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("flag", context.getCurrentName());
        assertEquals(0, context.getStreamReadValueOffset()); // Value offset within nested object
        
        parser.nextToken(); // VALUE_TRUE
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("flag", context.getCurrentName());
        assertEquals(1, context.getStreamReadValueOffset()); // Value offset
        
        parser.nextToken(); // FIELD_NAME: "items"
        context = parser.getParsingContext();
        assertTrue(context.inObject());
        assertEquals("items", context.getCurrentName());
        assertEquals(2, context.getStreamReadValueOffset()); // Value offset

        parser.nextToken(); // START_ARRAY
        context = parser.getParsingContext();
        assertTrue(context.inArray());
        assertEquals("items", context.getCurrentName()); // Name of the array being entered
        assertEquals(0, context.getStreamReadValueOffset()); // Start of array
        assertEquals(0, context.getCurrentIndex()); // Index starts at 0

        parser.nextToken(); // VALUE_NUMBER_INT: 1
        context = parser.getParsingContext();
        assertTrue(context.inArray());
        assertEquals("items", context.getCurrentName());
        assertEquals(0, context.getCurrentIndex()); // Index of current element
        assertEquals(0, context.getStreamReadValueOffset()); // Value offset within array

        parser.nextToken(); // VALUE_STRING: "a"
        context = parser.getParsingContext();
        assertTrue(context.inArray());
        assertEquals("items", context.getCurrentName());
        assertEquals(1, context.getCurrentIndex()); // Index of current element
        assertEquals(1, context.getStreamReadValueOffset()); // Value offset within array
        
        parser.nextToken(); // END_ARRAY
        context = parser.getParsingContext();
        assertTrue(context.inObject()); // Back to the containing object
        assertEquals("items", context.getCurrentName()); // Name of the array just ended
        assertEquals(3, context.getStreamReadValueOffset()); // Value offset

        parser.nextToken(); // END_OBJECT
        context = parser.getParsingContext();
        assertTrue(context.inRoot()); // Back to the root object
        assertEquals("nested", context.getCurrentName()); // Name of the object just ended
        assertEquals(5, context.getStreamReadValueOffset()); // Value offset
        
        parser.nextToken(); // END_OBJECT
        context = parser.getParsingContext();
        assertTrue(context.inRoot()); // Still in root, but finished
        assertNull(context.getCurrentName());
        assertEquals(6, context.getStreamReadValueOffset()); // Total fields processed
        
        assertNull(parser.nextToken());
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
        assertNull(parser.getText());

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
        assertNull(parser.getText());
        
        parser.nextToken(); // FIELD_NAME: "flag"
        assertEquals("flag", parser.getText());
        
        parser.nextToken(); // VALUE_TRUE
        assertEquals("true", parser.getText());
        
        parser.nextToken(); // FIELD_NAME: "items"
        assertEquals("items", parser.getText());
        
        parser.nextToken(); // START_ARRAY
        assertNull(parser.getText());
        
        parser.nextToken(); // VALUE_NUMBER_INT: 1
        assertEquals("1", parser.getText());
        
        parser.nextToken(); // VALUE_STRING: "a"
        assertEquals("a", parser.getText());
        
        parser.nextToken(); // END_ARRAY
        assertNull(parser.getText());
        
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
        
        parser.nextToken(); // END_OBJECT
        assertNull(parser.getText());
        
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
    public void testGetBigIntegerValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(10), parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        assertEquals(BigInteger.valueOf(10000000000L), parser.getBigIntegerValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(BigInteger.valueOf(123), parser.getBigIntegerValue()); // doubleValue().toBigInteger() truncates

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        assertEquals(new BigInteger("12345678901234567890"), parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        assertEquals(new BigInteger("9876543210"), parser.getBigIntegerValue()); // decimalValue().toBigInteger() truncates
    }
    
    @Test
    public void testGetBigIntegerValueEdgeCases() throws Exception {
        JsonNode tree = createNumericEdgeCasesTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to numbers
        for (int i = 0; i < 2; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME: "intMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(Integer.MAX_VALUE), parser.getBigIntegerValue());
        
        parser.nextToken(); // FIELD_NAME: "intMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(Integer.MIN_VALUE), parser.getBigIntegerValue());
        
        parser.nextToken(); // FIELD_NAME: "longMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(Long.MAX_VALUE), parser.getBigIntegerValue());
        
        parser.nextToken(); // FIELD_NAME: "longMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(Long.MIN_VALUE), parser.getBigIntegerValue());
        
        parser.nextToken(); // FIELD_NAME: "exceedsLongMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE), parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "exceedsLongMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE), parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "floatMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(String.valueOf(Float.MAX_VALUE)).toBigInteger(), parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "floatMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(String.valueOf(Float.MIN_VALUE)).toBigInteger(), parser.getBigIntegerValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(Double.MAX_VALUE).toBigInteger(), parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "doubleMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(Double.MIN_VALUE).toBigInteger(), parser.getBigIntegerValue());
        
        // NaN and Infinity nodes are not numeric, should throw exception
        parser.nextToken(); // FIELD_NAME: "nan"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (NaN)
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "posInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());

        parser.nextToken(); // FIELD_NAME: "negInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getBigIntegerValue());
    }


    @Test
    public void testGetDecimalValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigDecimal.valueOf(10), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        assertEquals(BigDecimal.valueOf(10000000000L), parser.getDecimalValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(BigDecimal.valueOf(123.456), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        assertEquals(new BigDecimal("12345678901234567890"), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        assertEquals(new BigDecimal("9876543210.123456789"), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "floatVal"
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (float)
        assertEquals(BigDecimal.valueOf(98.765), parser.getDecimalValue());
    }
    
    @Test
    public void testGetDecimalValueEdgeCases() throws Exception {
        JsonNode tree = createNumericEdgeCasesTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to numbers
        for (int i = 0; i < 2; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME: "intMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigDecimal.valueOf(Integer.MAX_VALUE), parser.getDecimalValue());
        
        parser.nextToken(); // FIELD_NAME: "intMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigDecimal.valueOf(Integer.MIN_VALUE), parser.getDecimalValue());
        
        parser.nextToken(); // FIELD_NAME: "longMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigDecimal.valueOf(Long.MAX_VALUE), parser.getDecimalValue());
        
        parser.nextToken(); // FIELD_NAME: "longMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(BigDecimal.valueOf(Long.MIN_VALUE), parser.getDecimalValue());
        
        parser.nextToken(); // FIELD_NAME: "exceedsLongMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigDecimal(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "exceedsLongMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(new BigDecimal(BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE)), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "floatMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(String.valueOf(Float.MAX_VALUE)), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "floatMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(String.valueOf(Float.MIN_VALUE)), parser.getDecimalValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(Double.MAX_VALUE), parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "doubleMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal(Double.MIN_VALUE), parser.getDecimalValue());
        
        // NaN and Infinity nodes are not numeric, should throw exception
        parser.nextToken(); // FIELD_NAME: "nan"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (NaN)
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "posInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());

        parser.nextToken(); // FIELD_NAME: "negInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertThrows(JsonParseException.class, () -> parser.getDoubleValue());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertThrows(JsonParseException.class, () -> parser.getDoubleValue());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(10.0, parser.getDoubleValue(), 1e-9); // int value converted to double

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertThrows(JsonParseException.class, () -> parser.getDoubleValue());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        assertEquals(1.0E10, parser.getDoubleValue(), 1e-9); // long value converted to double
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertThrows(JsonParseException.class, () -> parser.getDoubleValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(123.456, parser.getDoubleValue(), 1e-9);

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertThrows(JsonParseException.class, () -> parser.getDoubleValue());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        assertEquals(1.2345678901234568E19, parser.getDoubleValue(), 1e-9); // BigInteger to double can lose precision

        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertThrows(JsonParseException.class, () -> parser.getDoubleValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        assertEquals(9.876543210123457E9, parser.getDoubleValue(), 1e-9); // BigDecimal to double can lose precision
        
        parser.nextToken(); // FIELD_NAME: "floatVal"
        assertThrows(JsonParseException.class, () -> parser.getDoubleValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (float)
        assertEquals(98.765, parser.getDoubleValue(), 1e-9);
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
    public void testGetFloatValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertThrows(JsonParseException.class, () -> parser.getFloatValue());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertThrows(JsonParseException.class, () -> parser.getFloatValue());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((float)10, parser.getFloatValue(), 1e-9);

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertThrows(JsonParseException.class, () -> parser.getFloatValue());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        // This will overflow float, should throw reportOverflowInt() or similar exception for float conversion
        assertThrows(JsonParseException.class, () -> parser.getFloatValue()); // Expecting an exception due to precision loss/overflow
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertThrows(JsonParseException.class, () -> parser.getFloatValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals((float)123.456, parser.getFloatValue(), 1e-5);

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertThrows(JsonParseException.class, () -> parser.getFloatValue());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        // BigInteger to float can lose precision or overflow
        assertThrows(JsonParseException.class, () -> parser.getFloatValue()); // Expecting an exception due to precision loss/overflow
        
        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertThrows(JsonParseException.class, () -> parser.getFloatValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        // BigDecimal to float can lose precision or overflow
        assertThrows(JsonParseException.class, () -> parser.getFloatValue()); // Expecting an exception due to precision loss/overflow
        
        parser.nextToken(); // FIELD_NAME: "floatVal"
        assertThrows(JsonParseException.class, () -> parser.getFloatValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (float)
        assertEquals((float)98.765, parser.getFloatValue(), 1e-5);
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
    public void testGetIntValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(10, parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        // This will overflow int, should throw reportOverflowInt() which is _constructError
        // The actual behavior is to throw JsonParseException if canConvertToInt is false.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(123, parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        // This will overflow int, should throw reportOverflowInt()
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        // This also overflows int, JsonNode's numberValue() might return a BigDecimal that can be truncated.
        // However, canConvertToInt should return false for values exceeding Integer.MAX_VALUE.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        
        parser.nextToken(); // FIELD_NAME: "floatVal"
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (float)
        assertEquals(98, parser.getIntValue());
    }
    
    @Test
    public void testGetIntValueEdgeCases() throws Exception {
        JsonNode tree = createNumericEdgeCasesTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to numbers
        for (int i = 0; i < 2; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME: "intMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
        
        parser.nextToken(); // FIELD_NAME: "intMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Integer.MIN_VALUE, parser.getIntValue());
        
        parser.nextToken(); // FIELD_NAME: "longMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        // This overflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        
        parser.nextToken(); // FIELD_NAME: "longMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        // This overflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        
        // Values exceeding long
        parser.nextToken(); // FIELD_NAME: "exceedsLongMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        // This overflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "exceedsLongMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        // This overflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "floatMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This overflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "floatMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This underflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This overflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "doubleMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This underflows int, should throw.
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
        
        // NaN and Infinity nodes are not numeric, should throw exception
        parser.nextToken(); // FIELD_NAME: "nan"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (NaN)
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "posInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getIntValue());

        parser.nextToken(); // FIELD_NAME: "negInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(10L, parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        assertEquals(10000000000L, parser.getLongValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(123L, parser.getLongValue()); // doubleValue().longValue() truncates

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        // This overflows long, should throw reportOverflowLong()
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        assertEquals(9876543210L, parser.getLongValue()); // decimalValue().longValue() truncates
        
        parser.nextToken(); // FIELD_NAME: "floatVal"
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (float)
        assertEquals(98L, parser.getLongValue()); // floatValue().longValue() truncates
    }
    
    @Test
    public void testGetLongValueEdgeCases() throws Exception {
        JsonNode tree = createNumericEdgeCasesTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to numbers
        for (int i = 0; i < 2; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME: "intMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((long)Integer.MAX_VALUE, parser.getLongValue());
        
        parser.nextToken(); // FIELD_NAME: "intMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals((long)Integer.MIN_VALUE, parser.getLongValue());
        
        parser.nextToken(); // FIELD_NAME: "longMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
        
        parser.nextToken(); // FIELD_NAME: "longMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Long.MIN_VALUE, parser.getLongValue());
        
        // Values exceeding long
        parser.nextToken(); // FIELD_NAME: "exceedsLongMax"
        parser.nextToken(); // VALUE_NUMBER_INT
        // This overflows long, should throw.
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "exceedsLongMin"
        parser.nextToken(); // VALUE_NUMBER_INT
        // This underflows long, should throw.
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "floatMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This overflows long, should throw.
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "floatMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This underflows long, should throw.
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleMax"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This overflows long, should throw.
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "doubleMin"
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        // This underflows long, should throw.
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
        
        // NaN and Infinity nodes are not numeric, should throw exception
        parser.nextToken(); // FIELD_NAME: "nan"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (NaN)
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "posInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getLongValue());

        parser.nextToken(); // FIELD_NAME: "negInf"
        parser.nextToken(); // VALUE_NUMBER_FLOAT (Infinity)
        assertThrows(JsonParseException.class, () -> parser.getLongValue());
    }

    @Test
    public void testGetNumberValue() throws Exception {
        JsonNode tree = createNumericTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        parser.nextToken(); // START_OBJECT
        assertThrows(JsonParseException.class, () -> parser.getNumberValue());

        parser.nextToken(); // FIELD_NAME: "intVal"
        assertThrows(JsonParseException.class, () -> parser.getNumberValue());
        parser.nextToken(); // VALUE_NUMBER_INT
        assertEquals(Integer.valueOf(10), parser.getNumberValue());

        parser.nextToken(); // FIELD_NAME: "longVal"
        assertThrows(JsonParseException.class, () -> parser.getNumberValue());
        parser.nextToken(); // VALUE_NUMBER_INT (long)
        assertEquals(Long.valueOf(10000000000L), parser.getNumberValue());
        
        parser.nextToken(); // FIELD_NAME: "doubleVal"
        assertThrows(JsonParseException.class, () -> parser.getNumberValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT
        assertEquals(Double.valueOf(123.456), parser.getNumberValue());

        parser.nextToken(); // FIELD_NAME: "bigIntVal"
        assertThrows(JsonParseException.class, () -> parser.getNumberValue());
        parser.nextToken(); // VALUE_NUMBER_INT (BigInteger)
        assertEquals(new BigInteger("12345678901234567890"), parser.getNumberValue());

        parser.nextToken(); // FIELD_NAME: "bigDecVal"
        assertThrows(JsonParseException.class, () -> parser.getNumberValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (BigDecimal)
        assertEquals(new BigDecimal("9876543210.123456789"), parser.getNumberValue());
        
        parser.nextToken(); // FIELD_NAME: "floatVal"
        assertThrows(JsonParseException.class, () -> parser.getNumberValue());
        parser.nextToken(); // VALUE_NUMBER_FLOAT (float)
        assertEquals(Float.valueOf((float)98.765), parser.getNumberValue()); // returned as Float, not Double
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
    public void testGetBinaryValue() throws Exception {
        JsonNode tree = createBinaryAndPojoTree();
        TreeTraversingParser parser = new TreeTraversingParser(tree);
        
        // Skip to binary node
        for(int i=0; i<3; i++) parser.nextToken(); // START_OBJECT, FIELD_NAME("binary"), VALUE_EMBEDDED_OBJECT
        
        // Assuming Base64Variant.getDefault() is used or not relevant for BinaryNode directly
        // The getText() method handles binary conversion for TextNode with Base64,
        // but getBinaryValue() is called directly on the node.
        // The default implementation of JsonNode.binaryValue() for BinaryNode returns its data.
        byte[] binaryData = parser.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(new byte[]{1, 2, 3}, binaryData);
        
        // Test with a TextNode containing base64
        ObjectNode root = JsonNodeFactory.instance.objectNode();
        // This is a simplified case, usually TextNode would be created differently.
        // For testing, we can simulate it.
        // Let's create a TextNode with base64 string
        String base64String = com.fasterxml.jackson.core.util.TextBuffer.encodeAsBase64(new byte[]{4, 5, 6}, Base64Variants.MIME);
        root.put("base64Text", base64String);
        
        TreeTraversingParser parser2 = new TreeTraversingParser(root);
        parser2.nextToken(); // START_OBJECT
        parser2.nextToken(); // FIELD_NAME: "base64Text"
        parser2.nextToken(); // VALUE_STRING
        
        binaryData = parser2.getBinaryValue(Base64Variants.MIME);
        assertArrayEquals(new byte[]{4, 5, 6}, binaryData);
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
        assertEquals(JsonToken.START_ARRAY, parser._currToken);
        
        // Now advance to check if it correctly handles empty array
        parser.nextToken(); // END_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser._currToken);
        
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
        assertEquals(JsonToken.START_OBJECT, parser._currToken);
        
        // Now advance to check if it correctly handles empty object
        parser.nextToken(); // END_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser._currToken);
        
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
