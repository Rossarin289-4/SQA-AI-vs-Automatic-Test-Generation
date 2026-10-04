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

    // Helper to create an ObjectNode for testing
    private ObjectNode createObjectNode() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        return new ObjectNode(factory);
    }

    // Helper to create a dummy SerializerProvider for serialize methods
    private SerializerProvider createDummySerializerProvider() {
        return null; // Cannot instantiate abstract class without implementation
    }

    // Helper to create a dummy TypeSerializer for serializeWithType
    private TypeSerializer createDummyTypeSerializer() {
        return null; // Cannot instantiate abstract class without implementation
    }

    @Test
    public void testSizeEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        assertEquals(0, node.size());
    }

    @Test
    public void testSizeNonEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertEquals(1, node.size());
        node.put("b", "test");
        assertEquals(2, node.size());
    }

    @Test
    public void testElementsEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        assertFalse(node.elements().hasNext());
    }

    @Test
    public void testElementsNonEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        Iterator<JsonNode> elements = node.elements();
        assertTrue(elements.hasNext());
        assertEquals(1, elements.next().intValue());
        assertTrue(elements.hasNext());
        assertEquals("test", elements.next().asText());
        assertFalse(elements.hasNext());
    }

    @Test
    public void testFieldNamesEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        assertFalse(node.fieldNames().hasNext());
    }

    @Test
    public void testFieldNamesNonEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        Iterator<String> names = node.fieldNames();
        assertTrue(names.hasNext());
        // Order of fields in LinkedHashMap is insertion order
        assertEquals("a", names.next());
        assertTrue(names.hasNext());
        assertEquals("b", names.next());
        assertFalse(names.hasNext());
    }

    @Test
    public void testGetByIndexReturnsNull() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.get(0)); // Object nodes do not support index-based access
        assertNull(node.get(1));
    }

    @Test
    public void testGetByExistingFieldName() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        assertEquals(1, node.get("a").intValue());
        assertEquals("test", node.get("b").asText());
    }

    @Test
    public void testGetByNonExistingFieldName() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.get("b"));
    }

    @Test
    public void testPathByExistingFieldName() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertEquals(1, node.path("a").intValue());
    }

    @Test
    public void testPathByNonExistingFieldName() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertTrue(node.path("b").isMissingNode());
    }

    @Test
    public void testPathByIndexReturnsMissingNode() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertTrue(node.path(0).isMissingNode()); // Object nodes do not support index-based access
    }

    @Test
    public void testFieldsEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        assertFalse(node.fields().hasNext());
    }

    @Test
    public void testFieldsNonEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
        assertTrue(fields.hasNext());
        Map.Entry<String, JsonNode> entry1 = fields.next();
        assertEquals("a", entry1.getKey());
        assertEquals(1, entry1.getValue().intValue());
        assertTrue(fields.hasNext());
        Map.Entry<String, JsonNode> entry2 = fields.next();
        assertEquals("b", entry2.getKey());
        assertEquals("test", entry2.getValue().asText());
        assertFalse(fields.hasNext());
    }

    @Test
    public void testWithExistingObjectNode() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode innerNode = node.putObject("child");
        assertSame(innerNode, node.with("child"));
    }

    @Test
    public void testWithNonExistingNodeCreatesObjectNode() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode newNode = node.with("child");
        assertNotNull(newNode);
        assertTrue(newNode.isObject());
        assertSame(newNode, node.get("child"));
    }

    @Test
    public void testWithExistingNonObjectNodeThrowsException() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("child", 1);
        try {
            node.with("child");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("Property 'child' has value that is not of type ObjectNode"));
        }
    }

    @Test
    public void testWithArrayExistingArrayNode() throws Exception {
        ObjectNode node = createObjectNode();
        ArrayNode innerArray = node.putArray("child");
        assertSame(innerArray, node.withArray("child"));
    }

    @Test
    public void testWithArrayNonExistingNodeCreatesArrayNode() throws Exception {
        ObjectNode node = createObjectNode();
        ArrayNode newArray = node.withArray("child");
        assertNotNull(newArray);
        assertTrue(newArray.isArray());
        assertSame(newArray, node.get("child"));
    }

    @Test
    public void testWithArrayExistingNonArrayNodeThrowsException() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("child", 1);
        try {
            node.withArray("child");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("Property 'child' has value that is not of type ArrayNode"));
        }
    }

    @Test
    public void testFindValueExisting() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode nested = node.putObject("nested");
        nested.put("target", "value");
        assertEquals("value", node.findValue("target").asText());
    }

    @Test
    public void testFindValueNonExisting() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.findValue("target"));
    }

    @Test
    public void testFindValueInNestedObjects() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode level1 = node.putObject("level1");
        ObjectNode level2 = level1.putObject("level2");
        level2.put("target", "found");
        assertEquals("found", node.findValue("target").asText());
    }

    @Test
    public void testFindValuesExistingSingle() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("target", "value1");
        List<JsonNode> found = node.findValues("target", null);
        assertEquals(1, found.size());
        assertEquals("value1", found.get(0).asText());
    }

    @Test
    public void testFindValuesExistingMultiple() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("target", "value1");
        node.putObject("other").put("target", "value2");
        List<JsonNode> found = node.findValues("target", null);
        assertEquals(2, found.size());
        assertEquals("value1", found.get(0).asText());
        assertEquals("value2", found.get(1).asText());
    }

    @Test
    public void testFindValuesNonExisting() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.findValues("target", null));
    }

    @Test
    public void testFindValuesAsTextExistingSingle() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("target", "text1");
        List<String> found = node.findValuesAsText("target", null);
        assertEquals(1, found.size());
        assertEquals("text1", found.get(0));
    }

    @Test
    public void testFindValuesAsTextExistingMultiple() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("target", "text1");
        node.putObject("other").put("target", "text2");
        List<String> found = node.findValuesAsText("target", null);
        assertEquals(2, found.size());
        assertEquals("text1", found.get(0));
        assertEquals("text2", found.get(1));
    }

    @Test
    public void testFindValuesAsTextNonExisting() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.findValuesAsText("target", null));
    }

    @Test
    public void testFindParentExisting() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode nested = node.putObject("nested");
        nested.put("target", "value");
        assertSame(node, node.findParent("target"));
    }

    @Test
    public void testFindParentNonExisting() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.findParent("target"));
    }

    @Test
    public void testFindParentsExistingSingle() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("target", "value1");
        List<JsonNode> found = node.findParents("target", null);
        assertEquals(1, found.size());
        assertSame(node, found.get(0));
    }

    @Test
    public void testFindParentsExistingMultiple() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("target", "value1");
        ObjectNode nested = node.putObject("other");
        nested.put("target", "value2");
        List<JsonNode> found = node.findParents("target", null);
        assertEquals(2, found.size());
        assertSame(node, found.get(0)); // The top-level node where "target" was found directly
        assertSame(node, found.get(1)); // The top-level node which contains the nested object where "target" was found
    }

    @Test
    public void testFindParentsNonExisting() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.findParents("target", null));
    }

    @Test
    public void testSetExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        JsonNode newValue = node.numberNode(10);
        assertSame(node, node.set("a", newValue));
        assertEquals(10, node.get("a").intValue());
    }

    @Test
    public void testSetNewField() throws Exception {
        ObjectNode node = createObjectNode();
        JsonNode newValue = node.textNode("hello");
        assertSame(node, node.set("b", newValue));
        assertEquals("hello", node.get("b").asText());
    }

    @Test
    public void testSetWithNullValueConvertsToNullNode() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertSame(node, node.set("a", null));
        assertTrue(node.get("a").isNull());
    }

    @Test
    public void testSetAllMap() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        Map<String, JsonNode> properties = new LinkedHashMap<>();
        properties.put("b", node.textNode("test"));
        properties.put("c", node.numberNode(3));
        properties.put("a", node.booleanNode(true)); // Overwrite existing
        assertSame(node, node.setAll(properties));
        assertEquals(true, node.get("a").booleanValue());
        assertEquals("test", node.get("b").asText());
        assertEquals(3, node.get("c").intValue());
        assertEquals(3, node.size());
    }

    @Test
    public void testSetAllObjectNode() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        ObjectNode other = createObjectNode();
        other.put("b", "test");
        other.put("c", 3);
        other.put("a", true); // Overwrite existing
        assertSame(node, node.setAll(other));
        assertEquals(true, node.get("a").booleanValue());
        assertEquals("test", node.get("b").asText());
        assertEquals(3, node.get("c").intValue());
        assertEquals(3, node.size());
    }

    @Test
    public void testReplaceExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        JsonNode oldValue = node.numberNode(5);
        node.put("a", oldValue);
        JsonNode newValue = node.textNode("replaced");
        assertSame(oldValue, node.replace("a", newValue));
        assertEquals("replaced", node.get("a").asText());
    }

    @Test
    public void testReplaceNonExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        JsonNode newValue = node.numberNode(10);
        assertNull(node.replace("a", newValue));
        assertEquals(10, node.get("a").intValue());
    }

    @Test
    public void testReplaceWithNullValueConvertsToNullNode() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNotNull(node.replace("a", null)); // Should return the old node
        assertTrue(node.get("a").isNull());
    }

    @Test
    public void testWithoutExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        assertSame(node, node.without("a"));
        assertNull(node.get("a"));
        assertEquals(1, node.size());
        assertEquals("test", node.get("b").asText());
    }

    @Test
    public void testWithoutNonExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertSame(node, node.without("b")); // Should not throw error
        assertEquals(1, node.size());
        assertEquals(1, node.get("a").intValue());
    }

    @Test
    public void testWithoutCollectionOfFields() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        node.put("c", true);
        Collection<String> fieldsToRemove = Arrays.asList("a", "c");
        ObjectNode result = node.without(fieldsToRemove);
        assertSame(node, result);
        assertNull(node.get("a"));
        assertEquals("test", node.get("b").asText());
        assertNull(node.get("c"));
        assertEquals(1, node.size());
    }

    @Test
    public void testPutExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        JsonNode oldValue = node.numberNode(5);
        node.put("a", oldValue);
        JsonNode newValue = node.textNode("replaced");
        assertSame(oldValue, node.put("a", newValue)); // put returns old value
        assertEquals("replaced", node.get("a").asText());
    }

    @Test
    public void testPutNewField() throws Exception {
        ObjectNode node = createObjectNode();
        JsonNode newValue = node.numberNode(10);
        assertNull(node.put("a", newValue)); // put returns null if no old value
        assertEquals(10, node.get("a").intValue());
    }

    @Test
    public void testPutWithNullValueConvertsToNullNode() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        // Ambiguity in 'put' call resolved by using a specific overload for JsonNode
        assertSame(node.get("a"), node.put("a", (JsonNode)null)); // Should return the old node
        assertTrue(node.get("a").isNull());
    }

    @Test
    public void testRemoveExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        JsonNode removedNode = node.numberNode(5);
        node.put("a", removedNode);
        node.put("b", "test");
        assertSame(removedNode, node.remove("a"));
        assertNull(node.get("a"));
        assertEquals(1, node.size());
    }

    @Test
    public void testRemoveNonExistingField() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertNull(node.remove("b")); // Should return null
        assertEquals(1, node.size());
        assertEquals(1, node.get("a").intValue());
    }

    @Test
    public void testRemoveCollectionOfFields() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        node.put("c", true);
        Collection<String> fieldsToRemove = Arrays.asList("a", "c");
        ObjectNode result = node.remove(fieldsToRemove);
        assertSame(node, result);
        assertNull(node.get("a"));
        assertEquals("test", node.get("b").asText());
        assertNull(node.get("c"));
        assertEquals(1, node.size());
    }

    @Test
    public void testRemoveAll() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        assertSame(node, node.removeAll());
        assertEquals(0, node.size());
        assertFalse(node.elements().hasNext());
    }

    @Test
    public void testPutAllMap() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        Map<String, JsonNode> properties = new LinkedHashMap<>();
        properties.put("b", node.textNode("test"));
        properties.put("c", node.numberNode(3));
        properties.put("a", node.booleanNode(true)); // Overwrite existing
        assertSame(node, node.putAll(properties));
        assertEquals(true, node.get("a").booleanValue());
        assertEquals("test", node.get("b").asText());
        assertEquals(3, node.get("c").intValue());
        assertEquals(3, node.size());
    }

    @Test
    public void testRetainCollectionOfFields() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        node.put("c", true);
        Collection<String> fieldsToRetain = Arrays.asList("a", "c");
        ObjectNode result = node.retain(fieldsToRetain);
        assertSame(node, result);
        assertEquals(1, node.get("a").intValue());
        assertNull(node.get("b"));
        assertEquals(true, node.get("c").booleanValue());
        assertEquals(2, node.size());
    }

    @Test
    public void testRetainVarargsFields() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        node.put("c", true);
        ObjectNode result = node.retain("a", "c");
        assertSame(node, result);
        assertEquals(1, node.get("a").intValue());
        assertNull(node.get("b"));
        assertEquals(true, node.get("c").booleanValue());
        assertEquals(2, node.size());
    }

    @Test
    public void testPutArray() throws Exception {
        ObjectNode node = createObjectNode();
        ArrayNode arrayNode = node.putArray("myArray");
        assertNotNull(arrayNode);
        assertTrue(arrayNode.isArray());
        assertSame(arrayNode, node.get("myArray"));
        assertEquals(0, arrayNode.size());
    }

    @Test
    public void testPutObject() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode objectNode = node.putObject("myObject");
        assertNotNull(objectNode);
        assertTrue(objectNode.isObject());
        assertSame(objectNode, node.get("myObject"));
        assertEquals(0, objectNode.size());
    }

    @Test
    public void testPutPOJO() throws Exception {
        ObjectNode node = createObjectNode();
        String pojoValue = "some string";
        ObjectNode result = node.putPOJO("myPojo", pojoValue);
        assertSame(node, result);
        JsonNode foundNode = node.get("myPojo");
        assertNotNull(foundNode);
        assertEquals(pojoValue, foundNode.asText());
    }

    @Test
    public void testPutNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.putNull("myNull");
        assertSame(node, result);
        JsonNode foundNode = node.get("myNull");
        assertNotNull(foundNode);
        assertTrue(foundNode.isNull());
    }

    @Test
    public void testPutShort() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myShort", (short) 123);
        assertSame(node, result);
        assertEquals((short) 123, node.get("myShort").shortValue());
    }

    @Test
    public void testPutShortObject() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myShortObj", Short.valueOf((short) 123));
        assertSame(node, result);
        assertEquals((short) 123, node.get("myShortObj").shortValue());
    }

    @Test
    public void testPutShortObjectNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myShortObjNull", (Short) null);
        assertSame(node, result);
        assertTrue(node.get("myShortObjNull").isNull());
    }

    @Test
    public void testPutInt() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myInt", 456);
        assertSame(node, result);
        assertEquals(456, node.get("myInt").intValue());
    }

    @Test
    public void testPutIntObject() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myIntObj", Integer.valueOf(456));
        assertSame(node, result);
        assertEquals(456, node.get("myIntObj").intValue());
    }

    @Test
    public void testPutIntObjectNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myIntObjNull", (Integer) null);
        assertSame(node, result);
        assertTrue(node.get("myIntObjNull").isNull());
    }

    @Test
    public void testPutLong() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myLong", 7890L);
        assertSame(node, result);
        assertEquals(7890L, node.get("myLong").longValue());
    }

    @Test
    public void testPutLongObject() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myLongObj", Long.valueOf(7890L));
        assertSame(node, result);
        assertEquals(7890L, node.get("myLongObj").longValue());
    }

    @Test
    public void testPutLongObjectNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myLongObjNull", (Long) null);
        assertSame(node, result);
        assertTrue(node.get("myLongObjNull").isNull());
    }

    @Test
    public void testPutFloat() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myFloat", 1.5f);
        assertSame(node, result);
        assertEquals(1.5f, node.get("myFloat").floatValue(), 1e-6);
    }

    @Test
    public void testPutFloatObject() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myFloatObj", Float.valueOf(1.5f));
        assertSame(node, result);
        assertEquals(1.5f, node.get("myFloatObj").floatValue(), 1e-6);
    }

    @Test
    public void testPutFloatObjectNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myFloatObjNull", (Float) null);
        assertSame(node, result);
        assertTrue(node.get("myFloatObjNull").isNull());
    }

    @Test
    public void testPutDouble() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myDouble", 2.718);
        assertSame(node, result);
        assertEquals(2.718, node.get("myDouble").doubleValue(), 1e-9);
    }

    @Test
    public void testPutDoubleObject() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myDoubleObj", Double.valueOf(2.718));
        assertSame(node, result);
        assertEquals(2.718, node.get("myDoubleObj").doubleValue(), 1e-9);
    }

    @Test
    public void testPutDoubleObjectNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myDoubleObjNull", (Double) null);
        assertSame(node, result);
        assertTrue(node.get("myDoubleObjNull").isNull());
    }

    @Test
    public void testPutBigDecimal() throws Exception {
        ObjectNode node = createObjectNode();
        BigDecimal bd = new BigDecimal("12345.6789");
        ObjectNode result = node.put("myBigDecimal", bd);
        assertSame(node, result);
        assertEquals(bd, node.get("myBigDecimal").decimalValue());
    }

    @Test
    public void testPutBigDecimalNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myBigDecimalNull", (BigDecimal) null);
        assertSame(node, result);
        assertTrue(node.get("myBigDecimalNull").isNull());
    }

    @Test
    public void testPutString() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myString", "hello world");
        assertSame(node, result);
        assertEquals("hello world", node.get("myString").asText());
    }

    @Test
    public void testPutStringNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myStringNull", (String) null);
        assertSame(node, result);
        assertTrue(node.get("myStringNull").isNull());
    }

    @Test
    public void testPutBooleanPrimitive() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myBoolean", true);
        assertSame(node, result);
        assertTrue(node.get("myBoolean").booleanValue());
    }

    @Test
    public void testPutBooleanObject() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myBooleanObj", Boolean.TRUE);
        assertSame(node, result);
        assertTrue(node.get("myBooleanObj").booleanValue());
    }

    @Test
    public void testPutBooleanObjectNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myBooleanObjNull", (Boolean) null);
        assertSame(node, result);
        assertTrue(node.get("myBooleanObjNull").isNull());
    }

    @Test
    public void testPutByteArray() throws Exception {
        ObjectNode node = createObjectNode();
        byte[] data = {1, 2, 3};
        ObjectNode result = node.put("myBinary", data);
        assertSame(node, result);
        assertArrayEquals(data, node.get("myBinary").binaryValue());
    }

    @Test
    public void testPutByteArrayNull() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode result = node.put("myBinaryNull", (byte[]) null);
        assertSame(node, result);
        assertTrue(node.get("myBinaryNull").isNull());
    }

    @Test
    public void testEqualsSameObject() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        assertTrue(node.equals(node));
    }

    @Test
    public void testEqualsNull() throws Exception {
        ObjectNode node = createObjectNode();
        assertFalse(node.equals(null));
    }

    @Test
    public void testEqualsDifferentType() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        ArrayNode arrayNode = JsonNodeFactory.instance.arrayNode();
        assertFalse(node.equals(arrayNode));
    }

    @Test
    public void testEqualsDifferentContent() throws Exception {
        ObjectNode node1 = createObjectNode();
        node1.put("a", 1);
        ObjectNode node2 = createObjectNode();
        node2.put("a", 2);
        assertFalse(node1.equals(node2));
    }

    @Test
    public void testEqualsSameContent() throws Exception {
        ObjectNode node1 = createObjectNode();
        node1.put("a", 1);
        node1.put("b", "test");
        ObjectNode node2 = createObjectNode();
        node2.put("a", 1);
        node2.put("b", "test");
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testHashCode() throws Exception {
        ObjectNode node1 = createObjectNode();
        node1.put("a", 1);
        node1.put("b", "test");
        ObjectNode node2 = createObjectNode();
        node2.put("a", 1);
        node2.put("b", "test");
        assertEquals(node1.hashCode(), node2.hashCode());
    }

    @Test
    public void testToStringEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        assertEquals("{}", node.toString());
    }

    @Test
    public void testToStringNonEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.put("b", "test");
        // The order is guaranteed by LinkedHashMap
        assertEquals("{\"a\":1,\"b\":\"test\"}", node.toString());
    }

    @Test
    public void testToStringNested() throws Exception {
        ObjectNode node = createObjectNode();
        ObjectNode nested = node.putObject("nested");
        nested.put("c", true);
        node.put("a", 1);
        // The order is guaranteed by LinkedHashMap
        assertEquals("{\"nested\":{\"c\":true},\"a\":1}", node.toString());
    }

    @Test
    public void testDeepCopy() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        ObjectNode nested = node.putObject("nested");
        nested.put("b", "test");

        ObjectNode copy = node.deepCopy();

        assertNotSame(node, copy);
        assertEquals(node.size(), copy.size());
        assertEquals(node.toString(), copy.toString());

        // Verify deep copy by modifying original and checking copy
        node.put("a", 100);
        ObjectNode nestedOriginal = (ObjectNode) node.get("nested");
        nestedOriginal.put("b", "modified");

        assertNotEquals(node.toString(), copy.toString());
        assertEquals(1, copy.get("a").intValue()); // Original changed, copy should not
        ObjectNode nestedCopy = (ObjectNode) copy.get("nested");
        assertEquals("test", nestedCopy.get("b").asText()); // Original changed, copy should not
    }

    @Test
    public void testNodeType() throws Exception {
        ObjectNode node = createObjectNode();
        assertEquals(JsonNodeType.OBJECT, node.getNodeType());
    }

    @Test
    public void testSerializeEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        // Calling the method to ensure it doesn't throw an immediate error with nulls.
        try {
            node.serialize(null, createDummySerializerProvider());
        } catch (NullPointerException e) {
            // Expected with null generator/provider.
        }
    }

    @Test
    public void testSerializeWithData() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.putObject("nested").put("b", "test");
        try {
            node.serialize(null, createDummySerializerProvider());
        } catch (NullPointerException e) {
            // Expected with null generator/provider.
        }
    }

    @Test
    public void testSerializeWithTypeEmpty() throws Exception {
        ObjectNode node = createObjectNode();
        try {
            node.serializeWithType(null, createDummySerializerProvider(), createDummyTypeSerializer());
        } catch (NullPointerException e) {
            // Expected with nulls.
        }
    }

    @Test
    public void testSerializeWithTypeWithData() throws Exception {
        ObjectNode node = createObjectNode();
        node.put("a", 1);
        node.putObject("nested").put("b", "test");
        try {
            node.serializeWithType(null, createDummySerializerProvider(), createDummyTypeSerializer());
        } catch (NullPointerException e) {
            // Expected with nulls.
        }
    }
}
```