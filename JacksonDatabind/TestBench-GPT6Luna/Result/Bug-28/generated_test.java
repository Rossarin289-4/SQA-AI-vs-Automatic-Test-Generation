package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.util.RawValue;

public class JsonNodeDeserializerTest {
    @Test
    public void testDeserializerSelectionForObject() throws Exception {
        assertEquals(ObjectNode.class, JsonNodeDeserializer.getDeserializer(ObjectNode.class).handledType());
    }

    @Test
    public void testDeserializerSelectionForArray() throws Exception {
        assertEquals(ArrayNode.class, JsonNodeDeserializer.getDeserializer(ArrayNode.class).handledType());
    }

    @Test
    public void testDeserializerSelectionForScalarAndNullClass() throws Exception {
        assertEquals(JsonNode.class, JsonNodeDeserializer.getDeserializer(TextNode.class).handledType());
        assertEquals(JsonNode.class, JsonNodeDeserializer.getDeserializer(null).handledType());
    }

    @Test
    public void testObjectDeserializerSingleton() throws Exception {
        assertSame(JsonNodeDeserializer.getDeserializer(ObjectNode.class),
                JsonNodeDeserializer.getDeserializer(ObjectNode.class));
    }

    @Test
    public void testGenericNullValue() throws Exception {
        JsonDeserializer<? extends JsonNode> deserializer =
                JsonNodeDeserializer.getDeserializer(TextNode.class);
        assertSame(NullNode.getInstance(), deserializer.getNullValue(null));
    }

    @Test
    public void testGenericDeserializerIsCachable() throws Exception {
        assertTrue(JsonNodeDeserializer.getDeserializer(TextNode.class).isCachable());
    }

    @Test
    public void testEmptyObjectDeserialization() throws Exception {
        JsonNode node = new ObjectMapper().readTree("{}");
        assertTrue(node.isObject());
        assertEquals(0, node.size());
    }

    @Test
    public void testNestedObjectAndArrayDeserialization() throws Exception {
        JsonNode node = new ObjectMapper().readTree("{\"a\":[1,true,null]}");
        assertEquals(3, node.get("a").size());
        assertEquals(1, node.get("a").get(0).intValue());
        assertTrue(node.get("a").get(1).booleanValue());
        assertTrue(node.get("a").get(2).isNull());
    }

    @Test
    public void testDuplicateFieldUsesLastValue() throws Exception {
        JsonNode node = new ObjectMapper().readTree("{\"a\":1,\"a\":2}");
        assertEquals(2, node.get("a").intValue());
    }

    @Test
    public void testIntegerNarrowRangeEdges() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Integer.MAX_VALUE,
                mapper.readTree("2147483647").intValue());
        assertEquals(2147483648L,
                mapper.readTree("2147483648").longValue());
        assertEquals(Integer.MIN_VALUE,
                mapper.readTree("-2147483648").intValue());
        assertEquals(-2147483649L,
                mapper.readTree("-2147483649").longValue());
    }

    @Test
    public void testLongRangeEdges() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Long.MAX_VALUE,
                mapper.readTree("9223372036854775807").longValue());
        assertEquals(Long.MIN_VALUE,
                mapper.readTree("-9223372036854775808").longValue());
        assertEquals("9223372036854775808",
                mapper.readTree("9223372036854775808").bigIntegerValue().toString());
    }

    @Test
    public void testFloatingPointDeserialization() throws Exception {
        JsonNode node = new ObjectMapper().readTree("1.25");
        assertEquals(1.25, node.doubleValue(), 1e-9);
    }

    @Test
    public void testBooleanAndStringDeserialization() throws Exception {
        JsonNode node = new ObjectMapper().readTree("[false,\"x\"]");
        assertFalse(node.get(0).booleanValue());
        assertEquals("x", node.get(1).textValue());
    }
}
