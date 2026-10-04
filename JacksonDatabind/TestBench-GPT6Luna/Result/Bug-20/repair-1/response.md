```java
package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ObjectNodeTest {
    @Test
    public void testNodeTypeSizeAndToken() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        assertEquals(JsonNodeType.OBJECT, node.getNodeType());
        assertEquals(0, node.size());
        node.put("x", 1);
        assertEquals(1, node.size());
        assertEquals(JsonToken.START_OBJECT, node.asToken());
    }

    @Test
    public void testGetIndexAndPathIndex() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("x", 1);
        assertNull(node.get(0));
        assertTrue(node.path(0).isMissingNode());
    }

    @Test
    public void testFieldAndElementIteration() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("a", 1);
        node.put("b", 2);
        Iterator<String> names = node.fieldNames();
        assertEquals("a", names.next());
        assertEquals("b", names.next());
        assertFalse(names.hasNext());
        Iterator<JsonNode> values = node.elements();
        assertEquals(1, values.next().intValue());
        assertEquals(2, values.next().intValue());
        assertFalse(values.hasNext());
    }

    @Test
    public void testFieldsIteration() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("key", 7);
        Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
        Map.Entry<String, JsonNode> entry = fields.next();
        assertEquals("key", entry.getKey());
        assertEquals(7, entry.getValue().intValue());
        assertFalse(fields.hasNext());
    }

    @Test
    public void testWithCreatesAndReusesChildObject() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        ObjectNode child = node.with("child");
        assertSame(child, node.get("child"));
        assertSame(child, node.with("child"));
        assertEquals(1, node.size());
    }

    @Test
    public void testWithRejectsExistingNonObject() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("child", 1);
        try {
            node.with("child");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals(1, node.get("child").intValue());
        }
    }

    @Test
    public void testWithArrayCreatesAndReusesChildArray() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        ArrayNode child = node.withArray("items");
        assertSame(child, node.get("items"));
        assertSame(child, node.withArray("items"));
        assertEquals(1, node.size());
    }

    @Test
    public void testWithArrayRejectsExistingNonArray() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("items", 1);
        try {
            node.withArray("items");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals(1, node.get("items").intValue());
        }
    }

    @Test
    public void testFindValueAndPathForPresentAndMissingFields() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        ObjectNode child = node.putObject("child");
        child.put("value", "yes");
        assertEquals("yes", node.findValue("value").textValue());
        assertNull(node.findValue("absent"));
        assertTrue(node.path("absent").isMissingNode());
    }

    @Test
    public void testFindValuesAndTextAcrossNestedObjects() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("match", "first");
        node.putObject("nested").put("match", "second");
        List<JsonNode> found = node.findValues("match", null);
        assertEquals(2, found.size());
        assertEquals("first", found.get(0).textValue());
        assertEquals("second", found.get(1).textValue());
        List<String> text = node.findValuesAsText("match", null);
        assertEquals(Arrays.asList("first", "second"), text);
    }

    @Test
    public void testFindValuesAppendsToProvidedList() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("match", 3);
        List<JsonNode> found = new ArrayList<JsonNode>();
        JsonNode original = JsonNodeFactory.instance.textNode("old");
        found.add(original);
        List<JsonNode> result = node.findValues("match", found);
        assertSame(found, result);
        assertEquals(2, result.size());
        assertSame(original, result.get(0));
        assertEquals(3, result.get(1).intValue());
    }

    @Test
    public void testFindParentAndParents() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        ObjectNode child = node.putObject("nested");
        child.put("target", 1);
        assertSame(child, node.findParent("target"));
        List<JsonNode> parents = node.findParents("target", null);
        assertEquals(1, parents.size());
        assertSame(child, parents.get(0));
        assertNull(node.findParent("absent"));
        assertNull(node.findParents("absent", null));
    }

    @Test
    public void testSetReplacesAndConvertsNullToNullNode() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        assertSame(node, node.set("v", JsonNodeFactory.instance.numberNode(2)));
        assertEquals(2, node.get("v").intValue());
        assertSame(node, node.set("v", null));
        assertTrue(node.get("v").isNull());
        assertEquals(1, node.size());
    }

    @Test
    public void testSetAllMapOverwritesAndConvertsNull() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("old", 1);
        Map<String, JsonNode> values = new LinkedHashMap<String, JsonNode>();
        values.put("old", JsonNodeFactory.instance.numberNode(4));
        values.put("nil", null);
        assertSame(node, node.setAll(values));
        assertEquals(4, node.get("old").intValue());
        assertTrue(node.get("nil").isNull());
        assertEquals(2, node.size());
    }

    @Test
    public void testReplaceReturnsPreviousValueAndStoresNullNode() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        assertNull(node.replace("v", JsonNodeFactory.instance.numberNode(1)));
        JsonNode previous = node.replace("v", null);
        assertEquals(1, previous.intValue());
        assertTrue(node.get("v").isNull());
    }

    @Test
    public void testWithoutAndRemoveCollectionAndRetain() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("a", 1);
        node.put("b", 2);
        node.put("c", 3);
        assertSame(node, node.without("a"));
        assertEquals(2, node.size());
        assertSame(node, node.remove(Arrays.asList("b")));
        assertEquals(1, node.size());
        assertSame(node, node.retain("c", "missing"));
        assertEquals(1, node.size());
        assertEquals(3, node.get("c").intValue());
    }

    @Test
    public void testRemoveReturnsRemovedNodeAndRemoveAllClears() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("x", 8);
        assertEquals(8, node.remove("x").intValue());
        assertNull(node.remove("x"));
        node.put("y", 9);
        assertSame(node, node.removeAll());
        assertEquals(0, node.size());
    }

    @Test
    public void testPutArrayAndPutObjectReplaceExistingFields() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("arr", 5);
        ArrayNode array = node.putArray("arr");
        array.add(6);
        assertSame(array, node.get("arr"));
        assertEquals(6, node.get("arr").get(0).intValue());
        ObjectNode child = node.putObject("obj");
        child.put("n", 7);
        assertSame(child, node.get("obj"));
        assertEquals(7, node.get("obj").get("n").intValue());
    }

    @Test
    public void testPutNullAndPutPojoReturnThis() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        assertSame(node, node.putNull("nil"));
        assertTrue(node.get("nil").isNull());
        Object value = new Object();
        assertSame(node, node.putPOJO("pojo", value));
        assertTrue(node.get("pojo").isPojo());
        assertEquals(2, node.size());
    }

    @Test
    public void testPutNullValuesForCommonOverloads() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("text", (String) null);
        node.put("integer", (Integer) null);
        node.put("long", (Long) null);
        node.put("flag", (Boolean) null);
        node.put("decimal", (BigDecimal) null);
        assertTrue(node.get("text").isNull());
        assertTrue(node.get("integer").isNull());
        assertTrue(node.get("long").isNull());
        assertTrue(node.get("flag").isNull());
        assertTrue(node.get("decimal").isNull());
        assertEquals(5, node.size());
    }

    @Test
    public void testIntegerBoundariesAndLongValue() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("max", Integer.MAX_VALUE);
        node.put("min", Integer.MIN_VALUE);
        node.put("long", (long) Integer.MAX_VALUE + 1L);
        assertEquals(Integer.MAX_VALUE, node.get("max").intValue());
        assertEquals(Integer.MIN_VALUE, node.get("min").intValue());
        assertEquals((long) Integer.MAX_VALUE + 1L, node.get("long").longValue());
    }

    @Test
    public void testEqualityHashCodeAndStringOrder() throws Exception {
        ObjectNode left = new ObjectNode(JsonNodeFactory.instance);
        left.put("a", 1);
        left.put("b", "x");
        ObjectNode right = new ObjectNode(JsonNodeFactory.instance);
        right.put("a", 1);
        right.put("b", "x");
        assertEquals(left, right);
        assertEquals(left.hashCode(), right.hashCode());
        assertEquals("{\"a\":1,\"b\":\"x\"}", left.toString());
        right.put("b", "y");
        assertNotEquals(left, right);
    }

    @Test
    public void testDeepCopyHasEqualContentsAndIndependentChildren() throws Exception {
        ObjectNode original = new ObjectNode(JsonNodeFactory.instance);
        original.putObject("child").put("value", 1);
        ObjectNode copy = original.deepCopy();
        assertEquals(original, copy);
        assertNotSame(original, copy);
        copy.with("child").put("value", 2);
        assertEquals(1, original.get("child").get("value").intValue());
        assertEquals(2, copy.get("child").get("value").intValue());
    }

    @Test
    public void testPutAllMapCopiesAndOverwritesFields() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("keep", 1);
        node.put("replace", 2);
        Map<String, JsonNode> values = new LinkedHashMap<String, JsonNode>();
        JsonNode replacement = JsonNodeFactory.instance.numberNode(7);
        values.put("replace", replacement);
        values.put("added", JsonNodeFactory.instance.textNode("new"));
        assertSame(node, node.putAll(values));
        assertEquals(3, node.size());
        assertEquals(1, node.get("keep").intValue());
        assertSame(replacement, node.get("replace"));
        assertEquals("new", node.get("added").textValue());
    }

    @Test
    public void testPutAllMapConvertsNullValuesToNullNodes() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        Map<String, JsonNode> values = new LinkedHashMap<String, JsonNode>();
        values.put("nullValue", null);
        assertSame(node, node.putAll(values));
        assertEquals(1, node.size());
        assertTrue(node.get("nullValue").isNull());
    }

    @Test
    public void testEqualsRejectsNullAndDifferentType() throws Exception {
        ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
        node.put("x", 1);
        assertFalse(node.equals(null));
        assertFalse(node.equals(JsonNodeFactory.instance.numberNode(1)));
        assertTrue(node.equals(node));
    }

    @Test
    public void testEqualsIgnoresInsertionOrder() throws Exception {
        ObjectNode first = new ObjectNode(JsonNodeFactory.instance);
        first.put("a", 1);
        first.put("b", 2);
        ObjectNode second = new ObjectNode(JsonNodeFactory.instance);
        second.put("b", 2);
        second.put("a", 1);
        assertTrue(first.equals(second));
        assertEquals(first.hashCode(), second.hashCode());
    }
}
```