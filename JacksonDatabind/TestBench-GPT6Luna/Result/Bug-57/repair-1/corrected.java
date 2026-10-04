package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.JsonPointerBasedFilter;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectReaderTest {
    @Test
    public void testVersion() throws Exception {
        assertNotNull(new ObjectMapper().reader().version());
    }

    @Test
    public void testFeatureEnableDisable() throws Exception {
        ObjectReader base = new ObjectMapper().reader();
        ObjectReader enabled = base.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(enabled.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(base.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(enabled.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testMultipleFeatureUpdates() throws Exception {
        ObjectReader base = new ObjectMapper().reader();
        ObjectReader changed = base.withFeatures(
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        assertTrue(changed.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        assertTrue(changed.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        assertFalse(base.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        assertFalse(changed.withoutFeatures(
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
                .isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
    }

    @Test
    public void testRootNameConfiguration() throws Exception {
        ObjectReader base = new ObjectMapper().reader();
        ObjectReader named = base.withRootName("data");
        assertEquals("data", named.getConfig().getRootName());
        assertEquals("", named.withoutRootName().getConfig().getRootName());
    }

    @Test
    public void testForTypeClass() throws Exception {
        ObjectReader base = new ObjectMapper().reader();
        ObjectReader typed = base.forType(String.class);
        assertEquals(String.class, typed.getConfig().constructType(String.class).getRawClass());
        assertEquals(String.class, typed.getConfig().constructType(String.class).getRawClass());
    }

    @Test
    public void testForTypeJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(Integer.class);
        ObjectReader reader = mapper.reader().forType(type);
        assertEquals(Integer.class, reader.getConfig().constructType(Integer.class).getRawClass());
        assertEquals(7, (int) reader.readValue("7"));
    }

    @Test
    public void testWithValueToUpdate() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Integer> value = new HashMap<String, Integer>();
        value.put("before", 1);
        ObjectReader reader = mapper.readerFor(Map.class).withValueToUpdate(value);
        assertSame(value, reader.readValue("{\"after\":2}"));
        assertEquals(Integer.valueOf(1), value.get("before"));
        assertEquals(Integer.valueOf(2), value.get("after"));
    }

    @Test
    public void testNullUpdateRejected() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        try {
            reader.withValueToUpdate(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertNotNull(reader.getConfig());
    }

    @Test
    public void testWithView() throws Exception {
        ObjectReader reader = new ObjectMapper().reader().withView(String.class);
        assertSame(String.class, reader.getConfig().getActiveView());
    }

    @Test
    public void testWithHandler() throws Exception {
        ObjectReader base = new ObjectMapper().reader();
        assertSame(base, base.withHandler(null));
    }

    @Test
    public void testAttributesSetAndRemoved() throws Exception {
        ObjectReader base = new ObjectMapper().reader();
        ObjectReader set = base.withAttribute("key", "value");
        assertEquals("value", set.getAttributes().getAttribute("key"));
        assertNull(base.getAttributes().getAttribute("key"));
        assertNull(set.withoutAttribute("key").getAttributes().getAttribute("key"));
    }

    @Test
    public void testWithAttributesMap() throws Exception {
        Map<Object, Object> attrs = new HashMap<Object, Object>();
        attrs.put("a", "b");
        ObjectReader reader = new ObjectMapper().reader().withAttributes(attrs);
        assertEquals("b", reader.getAttributes().getAttribute("a"));
    }

    @Test
    public void testFactoryAndTypeFactoryAccessors() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertSame(reader.getFactory(), reader.getFactory());
        assertSame(reader.getTypeFactory(), reader.getConfig().getTypeFactory());
    }

    @Test
    public void testCreateTreeNodes() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertTrue(reader.createArrayNode().isArray());
        assertTrue(reader.createObjectNode().isObject());
    }

    @Test
    public void testReadValueFromParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("\"hello\"");
        assertEquals("hello", (String) mapper.readerFor(String.class).readValue(parser));
    }

    @Test
    public void testReadValuesFromParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("[1,2]");
        parser.nextToken();
        parser.nextToken();
        Iterator<Integer> values = mapper.reader().readValues(parser, Integer.class);
        assertEquals(Integer.valueOf(1), values.next());
        assertEquals(Integer.valueOf(2), values.next());
        assertFalse(values.hasNext());
    }

    @Test
    public void testTreeTokensAndReadTree() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode input = mapper.readTree("{\"n\":3}");
        JsonParser parser = mapper.reader().treeAsTokens(input);
        JsonNode result = mapper.reader().readTree(parser);
        assertEquals(3, result.get("n").intValue());
    }

    @Test
    public void testTreeToValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree("\"value\"");
        assertEquals("value", mapper.reader().treeToValue(node, String.class));
    }

    @Test
    public void testWriteTreeUnsupported() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        try {
            reader.writeTree(null, null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertNotNull(reader.getFactory());
    }

    @Test
    public void testWriteValueUnsupported() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        try {
            reader.writeValue(null, null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertNotNull(reader.getConfig());
    }

    @Test
    public void testPointerReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(Integer.class).at("/n");
        assertEquals(Integer.valueOf(4), reader.readValue("{\"n\":4,\"x\":9}"));
    }

    @Test
    public void testGetInjectableValuesDefault() throws Exception {
        assertNull(new ObjectMapper().reader().getInjectableValues());
    }

    @Test
    public void testFormatDetectionReaderConfiguration() throws Exception {
        ObjectReader base = new ObjectMapper().reader();
        ObjectReader result = base.withFormatDetection(base);
        assertNotSame(base, result);
        assertEquals(base.getFactory(), result.getFactory());
    }
}
