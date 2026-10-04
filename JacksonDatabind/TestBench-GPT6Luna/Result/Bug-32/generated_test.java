package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

public class UntypedObjectDeserializerTest {
    @Test
    public void testCachable() throws Exception {
        assertTrue(new UntypedObjectDeserializer().isCachable());
    }

    @Test
    public void testContextualVanilla() throws Exception {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer();
        assertSame(UntypedObjectDeserializer.Vanilla.std,
                deser.createContextual(null, null));
    }

    @Test
    public void testContextualRetainsCustomInstance() throws Exception {
        UntypedObjectDeserializer deser = new UntypedObjectDeserializer();
        assertSame(deser.createContextual(null, null),
                deser.createContextual(null, null));
    }

    @Test
    public void testDeserializeString() throws Exception {
        Object value = read("\"abc\"");
        assertEquals("abc", value);
    }

    @Test
    public void testDeserializeTrue() throws Exception {
        assertEquals(Boolean.TRUE, read("true"));
    }

    @Test
    public void testDeserializeFalse() throws Exception {
        assertEquals(Boolean.FALSE, read("false"));
    }

    @Test
    public void testDeserializeNull() throws Exception {
        assertNull(read("null"));
    }

    @Test
    public void testDeserializeInteger() throws Exception {
        assertEquals(Integer.valueOf(17), read("17"));
    }

    @Test
    public void testDeserializeFloat() throws Exception {
        assertEquals(Double.valueOf(1.25), read("1.25"));
    }

    @Test
    public void testDeserializeEmptyArray() throws Exception {
        Object value = read("[]");
        assertEquals(Collections.emptyList(), value);
    }

    @Test
    public void testDeserializeOneElementArray() throws Exception {
        Object value = read("[7]");
        assertEquals(Collections.singletonList(7), value);
    }

    @Test
    public void testDeserializeMultipleElementArray() throws Exception {
        Object value = read("[1,\"x\",false]");
        assertEquals(Arrays.<Object>asList(1, "x", Boolean.FALSE), value);
    }

    @Test
    public void testDeserializeEmptyObject() throws Exception {
        Object value = read("{}");
        assertEquals(Collections.emptyMap(), value);
    }

    @Test
    public void testDeserializeSingleEntryObject() throws Exception {
        Object value = read("{\"a\":1}");
        Map<?, ?> map = (Map<?, ?>) value;
        assertEquals(1, map.size());
        assertEquals(1, map.get("a"));
    }

    @Test
    public void testDeserializeTwoEntryObject() throws Exception {
        Object value = read("{\"a\":1,\"b\":2}");
        Map<?, ?> map = (Map<?, ?>) value;
        assertEquals(2, map.size());
        assertEquals(Arrays.asList("a", "b"), new ArrayList<Object>(map.keySet()));
        assertEquals(2, map.get("b"));
    }

    @Test
    public void testDeserializeSeveralEntryObject() throws Exception {
        Object value = read("{\"a\":1,\"b\":2,\"c\":3}");
        Map<?, ?> map = (Map<?, ?>) value;
        assertEquals(3, map.size());
        assertEquals(Arrays.asList("a", "b", "c"), new ArrayList<Object>(map.keySet()));
        assertEquals(3, map.get("c"));
    }

    @Test
    public void testJavaArrayFeature() throws Exception {
        Object value = new com.fasterxml.jackson.databind.ObjectMapper()
                .enable(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)
                .readValue("[1,2]", Object.class);
        assertTrue(value instanceof Object[]);
        assertEquals(Arrays.<Object>asList(1, 2), Arrays.asList((Object[]) value));
    }

    @Test
    public void testDeserializeWithTypeString() throws Exception {
        assertEquals("abc", readWithType("\"abc\""));
    }

    @Test
    public void testDeserializeWithTypeBoolean() throws Exception {
        assertEquals(Boolean.TRUE, readWithType("true"));
    }

    private Object read(String json) throws IOException {
        return new com.fasterxml.jackson.databind.ObjectMapper().readValue(json, Object.class);
    }

    private Object readWithType(String json) throws IOException {
        return new com.fasterxml.jackson.databind.ObjectMapper().readValue(json, Object.class);
    }
}
