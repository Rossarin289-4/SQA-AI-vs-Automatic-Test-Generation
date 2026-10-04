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
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class ObjectReaderTest {
    @Test
    public void testVersion() throws Exception {
        assertEquals(com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION, new ObjectMapper().reader().version());
    }

    @Test
    public void testDefaultFeatureState() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithAndWithoutFeature() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        ObjectReader changed = reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(changed.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(changed.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithFeaturesVarargs() throws Exception {
        ObjectReader reader = new ObjectMapper().reader()
                .withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS));
    }

    @Test
    public void testWithoutFeaturesVarargs() throws Exception {
        ObjectReader reader = new ObjectMapper().reader()
                .withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS));
    }

    @Test
    public void testAtStringFiltersSelectedProperty() throws Exception {
        ObjectReader reader = new ObjectMapper().readerFor(JsonNode.class).at("/a");
        JsonNode node = reader.readValue("{\"a\":1,\"b\":2}");
        assertEquals(1, node.intValue());
    }

    @Test
    public void testAtPointerFiltersSelectedProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(JsonNode.class).at(JsonPointer.valueOf("/a"));
        JsonNode node = reader.readValue("{\"a\":3,\"b\":4}");
        assertEquals(3, node.intValue());
    }

    @Test
    public void testWithRootName() throws Exception {
        ObjectReader reader = new ObjectMapper().readerFor(Integer.class).withRootName("count");
        assertEquals(Integer.valueOf(5), reader.readValue("{\"count\":5}"));
    }

    @Test
    public void testWithoutRootName() throws Exception {
        ObjectReader reader = new ObjectMapper().readerFor(Integer.class)
                .withRootName("count").withoutRootName();
        assertEquals(Integer.valueOf(5), reader.readValue("5"));
    }

    @Test
    public void testForTypeJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        assertEquals(Integer.valueOf(7), mapper.reader().forType(type).readValue("7"));
    }

    @Test
    public void testWithTypeJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertEquals("x", mapper.reader().withType(type).readValue("\"x\""));
    }

    @Test
    public void testWithValueToUpdate() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Integer> original = new HashMap<String, Integer>();
        original.put("old", 1);
        Map<String, Integer> updated = mapper.readerFor(Map.class)
                .withValueToUpdate(original).readValue("{\"new\":2}");
        assertSame(original, updated);
        assertEquals(Integer.valueOf(2), updated.get("new"));
        assertEquals(Integer.valueOf(1), updated.get("old"));
    }

    @Test
    public void testWithValueToUpdateCanBeRemoved() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Integer> original = new HashMap<String, Integer>();
        ObjectReader reader = mapper.readerFor(Map.class).withValueToUpdate(original)
                .withValueToUpdate(null);
        Map<?, ?> result = reader.readValue("{\"new\":2}");
        assertNotSame(original, result);
        assertEquals(Integer.valueOf(2), result.get("new"));
    }

    @Test
    public void testWithView() throws Exception {
        ObjectReader reader = new ObjectMapper().readerFor(ViewBean.class).withView(PublicView.class);
        ViewBean bean = reader.readValue("{\"shown\":1,\"hidden\":2}");
        assertEquals(1, bean.shown);
        assertEquals(0, bean.hidden);
    }

    @Test
    public void testWithFormatDetection() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader detector = mapper.readerFor(Integer.class)
                .withFormatDetection(mapper.readerFor(Integer.class));
        assertEquals(Integer.valueOf(8), detector.readValue("8".getBytes("UTF-8")));
    }

    @Test
    public void testWithAttributes() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        Map<Object, Object> attrs = new HashMap<Object, Object>();
        attrs.put("key", "value");
        ObjectReader configured = reader.withAttributes(attrs);
        assertEquals("value", configured.getAttributes().getAttribute("key"));
        assertNull(reader.getAttributes().getAttribute("key"));
    }

    @Test
    public void testWithAndWithoutAttribute() throws Exception {
        ObjectReader reader = new ObjectMapper().reader().withAttribute("key", "value");
        assertEquals("value", reader.getAttributes().getAttribute("key"));
        assertNull(reader.withoutAttribute("key").getAttributes().getAttribute("key"));
    }

    @Test
    public void testIsEnabledParserFeature() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertEquals(reader.getFactory().isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE),
                reader.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE));
    }

    @Test
    public void testConfigFactoryAndTypeFactoryAccessors() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertSame(reader.getFactory(), reader.getConfig().getTypeFactory() == null
                ? null : reader.getFactory());
        assertSame(reader.getTypeFactory(), reader.getConfig().getTypeFactory());
    }

    @Test
    public void testInjectableValuesAccessor() throws Exception {
        InjectableValues values = new InjectableValues.Std();
        ObjectReader reader = new ObjectMapper().reader().with(values);
        assertSame(values, reader.getInjectableValues());
    }

    @Test
    public void testReadValueFromParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("2147483647");
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), mapper.readerFor(Integer.class).readValue(parser));
    }

    @Test
    public void testReadValuesFromParserWithClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("[1,2,3]");
        assertEquals(Arrays.asList(1, 2, 3), toList(mapper.reader().readValues(parser, Integer.class)));
    }

    @Test
    public void testCreateArrayNode() throws Exception {
        JsonNode node = new ObjectMapper().reader().createArrayNode();
        assertTrue(node.isArray());
        assertEquals(0, node.size());
    }

    @Test
    public void testCreateObjectNode() throws Exception {
        JsonNode node = new ObjectMapper().reader().createObjectNode();
        assertTrue(node.isObject());
        assertEquals(0, node.size());
    }

    @Test
    public void testTreeAsTokens() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode source = mapper.readTree("{\"v\":9}");
        JsonParser parser = mapper.reader().treeAsTokens(source);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("v", parser.getCurrentName());
        parser.close();
    }

    @Test
    public void testReadTreeFromParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("{\"x\":1}");
        JsonNode tree = mapper.reader().readTree(parser);
        assertEquals(1, tree.get("x").intValue());
    }

    @Test
    public void testTreeToValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree("{\"x\":6}");
        ValueBean bean = mapper.reader().treeToValue(node, ValueBean.class);
        assertEquals(6, bean.x);
    }

    @Test
    public void testWriteTreeIsUnsupported() throws Exception {
        try {
            new ObjectMapper().reader().writeTree(null, null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testWriteValueIsUnsupported() throws Exception {
        try {
            new ObjectMapper().reader().writeValue(null, null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    private static <T> List<T> toList(Iterator<T> iterator) {
        List<T> result = new ArrayList<T>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    public static class PublicView { }

    public static class ViewBean {
        @com.fasterxml.jackson.annotation.JsonView(PublicView.class)
        public int shown;
        public int hidden;
    }

    public static class ValueBean {
        public int x;
    }
}
