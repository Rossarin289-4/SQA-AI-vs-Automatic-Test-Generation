package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;

import java.util.Date; // Added for testing toString with custom object
import java.util.Locale;
import java.util.TimeZone;
import java.math.BigDecimal;
import java.lang.reflect.Type;

// Mock JsonGenerator for testing
class MockJsonGenerator implements JsonGenerator {
    public StringBuilder output = new StringBuilder();
    public boolean writeNullCalled = false;
    public Object writtenObject = null;
    public String fieldName = null;

    // Implement all abstract methods or remove them if not needed for the test
    // Feature enum is part of JsonGenerator, no need to import separately if JsonGenerator is imported.
}

// Mock SerializerProvider to satisfy the serialize method signature
// Inherit from SerializerProvider which is abstract and requires implementation of abstract methods.
abstract class MockSerializerProvider extends SerializerProvider {
    // Minimal implementation for testing POJONode's serialize method


    // Implementations for abstract methods from SerializerProvider.
    // These can be simplified for the purpose of this test.
    // Explicitly import missing types.
}


public class POJONodeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPojoNodeConstructorAndGetPojo() {
        Object pojo = new Object();
        POJONode node = new POJONode(pojo);
        assertSame(pojo, node.getPojo());
    }

    @Test
    public void testPojoNodeWithNullValue() {
        POJONode node = new POJONode(null);
        assertNull(node.getPojo());
    }

    @Test
    public void testGetNodeType() {
        POJONode node = new POJONode(new Object());
        assertEquals(JsonNodeType.POJO, node.getNodeType());
    }

    @Test
    public void testAsToken() {
        POJONode node = new POJONode(new Object());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    @Test
    public void testBinaryValueForByteArray() throws IOException {
        byte[] data = {1, 2, 3};
        POJONode node = new POJONode(data);
        assertArrayEquals(data, node.binaryValue());
    }

    @Test
    public void testBinaryValueForNonByteArray() throws IOException {
        Object data = new Object();
        POJONode node = new POJONode(data);
        // Default implementation in ValueNode is to throw exception
        try {
            node.binaryValue();
            fail("Expected IOException for non-byte array");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testAsTextForNonNullObject() {
        String text = "testString";
        POJONode node = new POJONode(text);
        assertEquals(text, node.asText());
    }

    @Test
    public void testAsTextForNull() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.asText());
    }

    @Test
    public void testAsTextWithDefaultForNonNullObject() {
        String text = "testString";
        POJONode node = new POJONode(text);
        assertEquals(text, node.asText("default"));
    }

    @Test
    public void testAsTextWithDefaultForNull() {
        POJONode node = new POJONode(null);
        assertEquals("default", node.asText("default"));
    }

    @Test
    public void testAsBooleanForTrueBoolean() {
        POJONode node = new POJONode(Boolean.TRUE);
        assertTrue(node.asBoolean(false));
    }

    @Test
    public void testAsBooleanForFalseBoolean() {
        POJONode node = new POJONode(Boolean.FALSE);
        assertFalse(node.asBoolean(true));
    }

    @Test
    public void testAsBooleanForNonBoolean() {
        POJONode node = new POJONode("true");
        assertFalse(node.asBoolean(false));
    }

    @Test
    public void testAsBooleanForNull() {
        POJONode node = new POJONode(null);
        assertFalse(node.asBoolean(false));
    }

    @Test
    public void testAsIntForInteger() {
        POJONode node = new POJONode(Integer.valueOf(123));
        assertEquals(123, node.asInt(0));
    }

    @Test
    public void testAsIntForDouble() {
        POJONode node = new POJONode(Double.valueOf(123.45));
        assertEquals(123, node.asInt(0));
    }

    @Test
    public void testAsIntForNonNumber() {
        POJONode node = new POJONode("123");
        assertEquals(0, node.asInt(0));
    }

    @Test
    public void testAsIntForNull() {
        POJONode node = new POJONode(null);
        assertEquals(0, node.asInt(0));
    }

    @Test
    public void testAsLongForInteger() {
        POJONode node = new POJONode(Integer.valueOf(123));
        assertEquals(123L, node.asLong(0L));
    }

    @Test
    public void testAsLongForLong() {
        POJONode node = new POJONode(Long.valueOf(456L));
        assertEquals(456L, node.asLong(0L));
    }

    @Test
    public void testAsLongForNonNumber() {
        POJONode node = new POJONode("456");
        assertEquals(0L, node.asLong(0L));
    }

    @Test
    public void testAsLongForNull() {
        POJONode node = new POJONode(null);
        assertEquals(0L, node.asLong(0L));
    }

    @Test
    public void testAsDoubleForInteger() {
        POJONode node = new POJONode(Integer.valueOf(123));
        assertEquals(123.0, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testAsDoubleForDouble() {
        POJONode node = new POJONode(Double.valueOf(456.789));
        assertEquals(456.789, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testAsDoubleForNonNumber() {
        POJONode node = new POJONode("456.789");
        assertEquals(0.0, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testAsDoubleForNull() {
        POJONode node = new POJONode(null);
        assertEquals(0.0, node.asDouble(0.0), 1e-9);
    }

    @Test
    public void testEqualsSameInstance() {
        POJONode node = new POJONode(new Object());
        assertTrue(node.equals(node));
    }

    @Test
    public void testEqualsDifferentInstanceSameValue() {
        Object value = new Object();
        POJONode node1 = new POJONode(value);
        POJONode node2 = new POJONode(value);
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEqualsDifferentInstanceDifferentValue() {
        POJONode node1 = new POJONode(new Object());
        POJONode node2 = new POJONode(new Object());
        assertFalse(node1.equals(node2));
    }

    @Test
    public void testEqualsWithNull() {
        POJONode node = new POJONode(new Object());
        assertFalse(node.equals(null));
    }

    @Test
    public void testEqualsWithDifferentType() {
        POJONode node = new POJONode(new Object());
        assertFalse(node.equals("POJONode"));
    }

    @Test
    public void testEqualsForNullPojo() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(null);
        assertTrue(node1.equals(node2));
    }

    @Test
    public void testEqualsForNullAndNonNullPojo() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(new Object());
        assertFalse(node1.equals(node2));
    }

    @Test
    public void testHashCodeForSameObject() {
        Object pojo = new Object();
        POJONode node1 = new POJONode(pojo);
        POJONode node2 = new POJONode(pojo);
        assertEquals(node1.hashCode(), node2.hashCode());
    }

    @Test
    public void testHashCodeForDifferentObject() {
        POJONode node1 = new POJONode(new Object());
        POJONode node2 = new POJONode(new Object());
        assertNotEquals(node1.hashCode(), node2.hashCode());
    }

    @Test
    public void testHashCodeForNull() {
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(null);
        // hashCode for null _value in POJONode uses Object.hashCode() which is not null-safe.
        // However, the reference source code uses _value.hashCode(), so we'll test that.
        // If _value is null, it will throw NullPointerException.
        // This test assumes _value.hashCode() is called.
        try {
            node1.hashCode(); // This will throw NPE if _value is null
            fail("Expected NullPointerException for null _value");
        } catch (NullPointerException e) {
            // Expected behavior for null _value
        }
    }

    @Test
    public void testToStringForSimpleObject() {
        String value = "test";
        POJONode node = new POJONode(value);
        assertEquals(value, node.toString());
    }

    @Test
    public void testToStringForNull() {
        POJONode node = new POJONode(null);
        assertEquals("null", node.toString());
    }

    @Test
    public void testToStringForByteArray() {
        byte[] data = {1, 2, 3};
        POJONode node = new POJONode(data);
        assertEquals("(binary value of 3 bytes)", node.toString());
    }

    @Test
    public void testToStringForRawValue() {
        RawValue rawValue = new RawValue("raw");
        POJONode node = new POJONode(rawValue);
        assertEquals("(raw value 'raw')", node.toString());
    }





    @Test
    public void testToStringWithDateObject() {
        Date date = new Date(1234567890123L); // A specific date for reproducibility
        POJONode node = new POJONode(date);
        assertEquals(date.toString(), node.toString());
    }
}


