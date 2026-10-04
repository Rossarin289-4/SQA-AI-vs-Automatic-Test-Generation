package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.databind.JsonSerializable; // Added import for JsonSerializable
import com.fasterxml.jackson.databind.node.BaseNode; // Added import for BaseNode

public class JsonNodeDeserializerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    /**
     * Helper method to create a JsonParser from a string.
     * This is a simplified approach for testing purposes.
     */
    private JsonParser createParser(String content) throws IOException {
        JsonFactory factory = new JsonFactory();
        return factory.createParser(content);
    }

    /**
     * Helper method to create a DeserializationContext.
     * This is a simplified approach for testing purposes.
     */
    private DeserializationContext createDeserializationContext() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getDeserializationContext();
    }

    @Test
    public void testDeserializeEmptyObject() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertTrue(((BaseNode) result).isEmpty()); // Changed isEmpty() call
    }

    @Test
    public void testDeserializeObjectWithFields() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{\"name\":\"test\", \"value\":123}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertEquals("test", result.get("name").asText());
        assertEquals(123, result.get("value").asInt());
    }

    @Test
    public void testDeserializeEmptyArray() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("[]");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ArrayNode);
        assertTrue(((BaseNode) result).isEmpty()); // Changed isEmpty() call
    }

    @Test
    public void testDeserializeArrayWithElements() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("[1, \"hello\", true]");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ArrayNode);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).asInt());
        assertEquals("hello", result.get(1).asText());
        assertTrue(result.get(2).asBoolean());
    }

    @Test
    public void testDeserializeNullValue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.getNullValue(ctxt);
        assertTrue(result instanceof NullNode);
    }

    @Test
    public void testDeserializeStringValue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("\"a string\"");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof TextNode);
        assertEquals("a string", result.asText());
    }

    @Test
    public void testDeserializeIntValue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("42");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof IntNode);
        assertEquals(42, result.asInt());
    }

    @Test
    public void testDeserializeLongValue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("1234567890123");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        // The source code uses _fromInt, which can return BigIntegerNode if configured,
        // so checking for NumericNode is more general.
        assertTrue(result instanceof NumericNode);
        assertEquals(1234567890123L, result.asLong());
    }

    @Test
    public void testDeserializeDoubleValue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("3.14159");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof DoubleNode);
        assertEquals(3.14159, result.asDouble(), 1e-9);
    }

    @Test
    public void testDeserializeBooleanTrue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("true");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof BooleanNode);
        assertTrue(result.asBoolean());
    }

    @Test
    public void testDeserializeBooleanFalse() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("false");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof BooleanNode);
        assertFalse(result.asBoolean());
    }

    @Test
    public void testDeserializeNestedObject() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{\"outer\": {\"inner\": 1}}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertTrue(result.has("outer"));
        assertTrue(result.get("outer").isObject());
        assertEquals(1, result.get("outer").get("inner").asInt());
    }

    @Test
    public void testDeserializeNestedArray() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("[[1, 2], [3, 4]]");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ArrayNode);
        assertTrue(result.get(0).isArray());
        assertEquals(2, result.get(0).size());
        assertEquals(2, result.size()); // Changed from 4 to 2 based on input "[ [1,2], [3,4] ]"
        assertEquals(4, result.get(1).get(1).asInt());
    }

    @Test
    public void testDeserializeArrayWithObject() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("[1, {\"key\": \"value\"}]");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ArrayNode);
        assertTrue(result.get(1).isObject());
        assertEquals("value", result.get(1).get("key").asText());
    }

    @Test
    public void testDeserializeObjectWithArray() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{\"data\": [1, 2, 3]}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertTrue(result.get("data").isArray());
        assertEquals(3, result.get("data").size());
        assertEquals(2, result.get("data").get(1).asInt());
    }

    @Test
    public void testGetObjectDeserializer() throws Exception {
        JsonDeserializer<? extends JsonNode> deserializer = JsonNodeDeserializer.getDeserializer(ObjectNode.class);
        assertTrue(deserializer instanceof JsonNodeDeserializer.ObjectDeserializer);
    }

    @Test
    public void testGetArrayDeserializer() throws Exception {
        JsonDeserializer<? extends JsonNode> deserializer = JsonNodeDeserializer.getDeserializer(ArrayNode.class);
        assertTrue(deserializer instanceof JsonNodeDeserializer.ArrayDeserializer);
    }

    @Test
    public void testGetGenericDeserializer() throws Exception {
        JsonDeserializer<? extends JsonNode> deserializer = JsonNodeDeserializer.getDeserializer(TextNode.class);
        assertTrue(deserializer instanceof JsonNodeDeserializer);
        assertFalse(deserializer instanceof JsonNodeDeserializer.ObjectDeserializer);
        assertFalse(deserializer instanceof JsonNodeDeserializer.ArrayDeserializer);
    }

    @Test
    public void testDeserializeAnyString() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("\"any string\"");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserializeAny(parser, ctxt, ctxt.getNodeFactory());
        assertTrue(result instanceof TextNode);
        assertEquals("any string", result.asText());
    }

    @Test
    public void testDeserializeAnyInt() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("100");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserializeAny(parser, ctxt, ctxt.getNodeFactory());
        assertTrue(result instanceof IntNode);
        assertEquals(100, result.asInt());
    }

    @Test
    public void testDeserializeAnyBooleanTrue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("true");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserializeAny(parser, ctxt, ctxt.getNodeFactory());
        assertTrue(result instanceof BooleanNode);
        assertTrue(result.asBoolean());
    }

    @Test
    public void testDeserializeAnyNull() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("null");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserializeAny(parser, ctxt, ctxt.getNodeFactory());
        assertTrue(result instanceof NullNode);
    }

    @Test
    public void testDeserializeAnyFloat() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("2.718");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserializeAny(parser, ctxt, ctxt.getNodeFactory());
        assertTrue(result instanceof DoubleNode);
        assertEquals(2.718, result.asDouble(), 1e-9);
    }

    @Test
    public void testDeserializeObjectWithDuplicateField() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        // Default behavior: last value wins. Test that the last value is kept.
        JsonParser parser = createParser("{\"key\": \"first\", \"key\": \"second\"}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertEquals("second", result.get("key").asText());
    }

    @Test
    public void testDeserializeArrayWithNulls() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("[null, 1, null]");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ArrayNode);
        assertTrue(result.get(0).isNull());
        assertEquals(1, result.get(1).asInt());
        assertTrue(result.get(2).isNull());
    }

    @Test
    public void testDeserializeObjectWithNull() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{\"key\": null}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertTrue(result.get("key").isNull());
    }

    @Test
    public void testDeserializeObjectWithEmptyObject() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{\"empty\": {}}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertTrue(result.get("empty").isObject());
        assertTrue(result.get("empty").isEmpty());
    }

    @Test
    public void testDeserializeObjectWithEmptyArray() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{\"empty\": []}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertTrue(result.get("empty").isArray());
        assertTrue(result.get("empty").isEmpty());
    }

    @Test
    public void testDeserializeArrayWithObjectNode() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("[{\"id\": 1}]");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ArrayNode);
        assertTrue(result.get(0).isObject());
        assertEquals(1, result.get(0).get("id").asInt());
    }

    @Test
    public void testDeserializeObjectWithVariousTypes() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("{\"string\": \"val\", \"number\": 123, \"boolean\": true, \"null\": null}");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ObjectNode);
        assertEquals("val", result.get("string").asText());
        assertEquals(123, result.get("number").asInt());
        assertTrue(result.get("boolean").asBoolean());
        assertTrue(result.get("null").isNull());
    }
    
    @Test
    public void testDeserializeArrayWithVariousTypes() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("[\"val\", 123, true, null]");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof ArrayNode);
        assertEquals("val", result.get(0).asText());
        assertEquals(123, result.get(1).asInt());
        assertTrue(result.get(2).asBoolean());
        assertTrue(result.get(3).isNull());
    }

    @Test
    public void testDeserializeBigIntValue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        // A value that exceeds max int and max long
        String largeNumber = "92233720368547758070"; // 2^63 - 1, then times 10
        JsonParser parser = createParser(largeNumber);
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof NumericNode);
        assertEquals(largeNumber, result.asText()); // Check as text for exact value
    }

    @Test
    public void testDeserializeBigDecimalValue() throws Exception {
        JsonNodeDeserializer deserializer = new JsonNodeDeserializer();
        JsonParser parser = createParser("12345.67890123456789");
        DeserializationContext ctxt = createDeserializationContext();
        JsonNode result = deserializer.deserialize(parser, ctxt);
        assertTrue(result instanceof NumericNode);
        assertEquals("12345.67890123456789", result.asText()); // Check as text for exact value
    }
}
