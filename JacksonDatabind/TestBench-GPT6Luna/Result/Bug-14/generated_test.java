package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.core.*;
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
import com.fasterxml.jackson.databind.util.RootNameLookup;

public class ObjectReaderTest {
    @Test
    public void testReaderFromMapperAndFeatureToggle() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        boolean original = reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader changed = original
                ? reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                : reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertEquals(!original, changed.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertEquals(original, reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testFeatureVarargsEnable() throws Exception {
        ObjectReader reader = new ObjectMapper().reader()
                .withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(reader.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
    }

    @Test
    public void testFeatureVarargsDisable() throws Exception {
        ObjectReader reader = new ObjectMapper().reader()
                .withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(reader.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
    }

    @Test
    public void testWithSameTypeReturnsEquivalentReader() throws Exception {
        ObjectReader reader = new ObjectMapper().reader().forType(Integer.class);
        ObjectReader configured = reader.forType(Integer.class);
        assertEquals(reader.getConfig(), configured.getConfig());
        assertEquals(17, (int) configured.readValue("17"));
    }

    @Test
    public void testForTypeChangesBindingType() throws Exception {
        ObjectReader reader = new ObjectMapper().reader().forType(Integer.class);
        ObjectReader strings = reader.forType(String.class);
        assertEquals("17", strings.readValue("\"17\""));
        assertEquals(17, (int) reader.readValue("17"));
    }

    @Test
    public void testDeprecatedWithTypeBindsRequestedType() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertEquals(23, (int) reader.withType(Integer.class).readValue("23"));
    }

    @Test
    public void testWithValueToUpdatePreservesUpdateTarget() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Integer> target = new java.util.HashMap<String, Integer>();
        target.put("old", 1);
        ObjectReader reader = mapper.reader().forType(Map.class).withValueToUpdate(target);
        Object result = reader.readValue("{\"new\":2}");
        assertSame(target, result);
        assertEquals(Integer.valueOf(2), target.get("new"));
        assertEquals(Integer.valueOf(1), target.get("old"));
    }

    @Test
    public void testWithNullUpdateValueIsUnchangedReader() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertSame(reader, reader.withValueToUpdate(null));
    }

    @Test
    public void testWithRootNameAndRootUnwrapping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(Integer.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName("n");
        assertEquals(6, (int) reader.readValue("{\"n\":6}"));
    }

    @Test
    public void testWithAttributesAndAttributeRemoval() throws Exception {
        ObjectReader reader = new ObjectMapper().reader().withAttribute("key", "value");
        assertEquals("value", reader.getAttributes().getAttribute("key"));
        ObjectReader removed = reader.withoutAttribute("key");
        assertNull(removed.getAttributes().getAttribute("key"));
        assertEquals("value", reader.getAttributes().getAttribute("key"));
    }

    @Test
    public void testWithAttributesMap() throws Exception {
        Map<Object, Object> attrs = new java.util.HashMap<Object, Object>();
        attrs.put("key", "value");
        ObjectReader reader = new ObjectMapper().reader().withAttributes(attrs);
        assertEquals("value", reader.getAttributes().getAttribute("key"));
    }

    @Test
    public void testAccessorFactoriesAndVersion() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertSame(reader.getFactory(), reader.getJsonFactory());
        assertNotNull(reader.getTypeFactory());
        assertNotNull(reader.getConfig());
        assertNotNull(reader.version());
    }

    @Test
    public void testCreateArrayAndObjectNodes() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        assertTrue(reader.createArrayNode().isArray());
        assertTrue(reader.createObjectNode().isObject());
    }

    @Test
    public void testReadValueFromParser() throws Exception {
        ObjectReader reader = new ObjectMapper().reader().forType(Integer.class);
        JsonParser parser = reader.getFactory().createParser("31");
        assertEquals(31, (int) reader.readValue(parser));
    }

    @Test
    public void testReadValuesFromParserWithType() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        JsonParser parser = reader.getFactory().createParser("2 5");
        Iterator<Integer> values = reader.readValues(parser, Integer.class);
        assertEquals(Integer.valueOf(2), values.next());
        assertEquals(Integer.valueOf(5), values.next());
        assertFalse(values.hasNext());
    }

    @Test
    public void testReadTreeFromParser() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        JsonParser parser = reader.getFactory().createParser("{\"a\":4}");
        JsonNode tree = reader.readTree(parser);
        assertEquals(4, tree.get("a").intValue());
    }

    @Test
    public void testTreeAsTokensAndTreeToValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode tree = mapper.readTree("{\"a\":8}");
        JsonParser parser = reader.treeAsTokens(tree);
        assertEquals(8, (int) reader.treeToValue(tree.get("a"), Integer.class));
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testWriteTreeUnsupported() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        JsonGenerator generator = reader.getFactory().createGenerator(new StringWriter());
        try {
            reader.writeTree(generator, reader.createObjectNode());
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testWriteValueUnsupported() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();
        JsonGenerator generator = reader.getFactory().createGenerator(new StringWriter());
        try {
            reader.writeValue(generator, "value");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }
}
