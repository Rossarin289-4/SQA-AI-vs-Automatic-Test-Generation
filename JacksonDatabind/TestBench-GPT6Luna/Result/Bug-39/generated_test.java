package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class NullifyingDeserializerTest {
    @Test
    public void testSingletonAndConstructorHandleObject() throws Exception {
        assertNull(NullifyingDeserializer.instance.deserialize(parser("{}"), null));
        assertNull(new NullifyingDeserializer().deserialize(parser("{}"), null));
    }

    @Test
    public void testScalarContentReturnsNull() throws Exception {
        assertNull(NullifyingDeserializer.instance.deserialize(parser("17"), null));
    }

    @Test
    public void testStringContentReturnsNull() throws Exception {
        assertNull(NullifyingDeserializer.instance.deserialize(parser("\"text\""), null));
    }

    @Test
    public void testNullContentReturnsNull() throws Exception {
        assertNull(NullifyingDeserializer.instance.deserialize(parser("null"), null));
    }

    @Test
    public void testArrayContentReturnsNull() throws Exception {
        assertNull(NullifyingDeserializer.instance.deserialize(parser("[1,{\"a\":2}]"), null));
    }

    @Test
    public void testStartObjectSkipsNestedChildren() throws Exception {
        JsonParser p = parser("{\"a\":{\"b\":[1,2]},\"c\":3}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertNull(NullifyingDeserializer.instance.deserialize(p, null));
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testFieldNameSkipsFieldsAndNestedChildren() throws Exception {
        JsonParser p = parser("{\"a\":{\"b\":[1,2]},\"c\":3}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(NullifyingDeserializer.instance.deserialize(p, null));
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testFieldNameAtEndOfInputReturnsNull() throws Exception {
        JsonParser p = parser("{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(NullifyingDeserializer.instance.deserialize(p, null));
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testFieldNameWithEmptyObjectValue() throws Exception {
        JsonParser p = parser("{\"a\":{}}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(NullifyingDeserializer.instance.deserialize(p, null));
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testFieldNameWithEmptyArrayValue() throws Exception {
        JsonParser p = parser("{\"a\":[]}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(NullifyingDeserializer.instance.deserialize(p, null));
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testTypedDeserializationScalarReturnsNull() throws Exception {
        assertNull(NullifyingDeserializer.instance.deserializeWithType(
                parser("1"), null, null));
    }

    @Test
    public void testTypedDeserializationNullReturnsNull() throws Exception {
        assertNull(NullifyingDeserializer.instance.deserializeWithType(
                parser("null"), null, null));
    }

    @Test
    public void testTypedDeserializationEndArrayReturnsNull() throws Exception {
        JsonParser p = parser("[]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(NullifyingDeserializer.instance.deserializeWithType(p, null, null));
    }

    @Test
    public void testTypedDeserializationEndObjectReturnsNull() throws Exception {
        JsonParser p = parser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(NullifyingDeserializer.instance.deserializeWithType(p, null, null));
    }

    private JsonParser parser(String json) throws IOException {
        return new JsonFactory().createParser(json);
    }
}
