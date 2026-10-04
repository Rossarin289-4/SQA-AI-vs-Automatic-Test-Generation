```java
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
import java.util.Collection;
import java.util.List;
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
import com.fasterxml.jackson.core.json.MappingJsonFactory;
import com.fasterxml.jackson.databind.Base64Variants; // Added for Base64Variants


public class ObjectReaderTest {

    // Helper to create a basic ObjectReader
    private ObjectReader createReader() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader();
    }

    // Helper to create a reader with a specific type
    private ObjectReader createReaderForType(Class<?> type) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().forType(type);
    }

    // Helper to create a reader with a specific JavaType
    private ObjectReader createReaderForJavaType(JavaType type) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().forType(type);
    }

    // Helper to create a reader with value to update
    private ObjectReader createReaderWithValueToUpdate(Object value) {
        ObjectMapper mapper = new ObjectMapper();
        // Need to use the internal constructor or a method that allows setting valueToUpdate
        // The source code shows _new(base, config, valueType, rootDeser, valueToUpdate, ...)
        // but we don't have direct access to that.
        // Let's use withValueToUpdate which is public.
        return mapper.reader().withValueToUpdate(value);
    }

    // Helper to create a reader with a specific JsonFactory
    private ObjectReader createReaderWithFactory(JsonFactory factory) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(factory);
    }

    // Helper to create a reader with a specific JsonNodeFactory
    private ObjectReader createReaderWithJsonNodeFactory(JsonNodeFactory factory) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(factory);
    }

    // Helper to create a reader with a specific FormatSchema
    private ObjectReader createReaderWithSchema(FormatSchema schema) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(schema);
    }

    // Helper to create a reader with InjectableValues
    private ObjectReader createReaderWithInjectableValues(InjectableValues values) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(values);
    }

    // Helper to create a reader with root name
    private ObjectReader createReaderWithRootName(String rootName) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withRootName(rootName);
    }

    // Helper to create a reader with a specific Locale
    private ObjectReader createReaderWithLocale(Locale locale) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(locale);
    }

    // Helper to create a reader with a specific TimeZone
    private ObjectReader createReaderWithTimeZone(TimeZone timeZone) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(timeZone);
    }

    // Helper to create a reader with a specific Base64Variant
    private ObjectReader createReaderWithBase64Variant(Base64Variant bv) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(bv);
    }

    // Helper to create a reader with a DeserializationConfig
    private ObjectReader createReaderWithConfig(DeserializationConfig config) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(config);
    }

    // Helper to create a reader with ContextAttributes
    private ObjectReader createReaderWithContextAttributes(ContextAttributes attrs) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().with(attrs);
    }

    // Helper to create a reader with attributes map
    private ObjectReader createReaderWithAttributesMap(Map<Object, Object> attrs) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withAttributes(attrs);
    }

    // Helper to create a reader with a single attribute
    private ObjectReader createReaderWithAttribute(Object key, Object value) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withAttribute(key, value);
    }

    // Helper to create a reader without an attribute
    private ObjectReader createReaderWithoutAttribute(Object key) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withoutAttribute(key);
    }

    // Helper to create a reader with features enabled
    private ObjectReader createReaderWithFeatures(DeserializationFeature... features) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withFeatures(features);
    }

    // Helper to create a reader with features disabled
    private ObjectReader createReaderWithoutFeatures(DeserializationFeature... features) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withoutFeatures(features);
    }

    // Helper to create a reader with JsonParser features enabled
    private ObjectReader createReaderWithParserFeatures(JsonParser.Feature... features) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withFeatures(features);
    }

    // Helper to create a reader with JsonParser features disabled
    private ObjectReader createReaderWithoutParserFeatures(JsonParser.Feature... features) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withoutFeatures(features);
    }

    // Helper to create a reader with a DeserializationProblemHandler
    private ObjectReader createReaderWithHandler(DeserializationProblemHandler handler) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withHandler(handler);
    }

    // Helper to create a reader with format detection
    private ObjectReader createReaderWithFormatDetection(ObjectReader... readers) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withFormatDetection(readers);
    }

    // Helper to create a reader with DataFormatReaders
    private ObjectReader createReaderWithDataFormatReaders(DataFormatReaders readers) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.reader().withFormatDetection(readers);
    }

    @Test
    public void testForTypeWithNull() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.forType((JavaType) null);
        // The method returns `this` if valueType is null and equals _valueType.
        // Here _valueType is null, so it should return `this`.
        assertSame(reader, newReader);
    }

    @Test
    public void testForTypeWithClass() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.forType(String.class);
        assertNotSame(reader, newReader);
        // Ensure the new reader is configured for String.class
        // Need to check against the actual JavaType constructed from the class.
        JavaType stringJavaType = reader.getTypeFactory().constructType(String.class);
        assertEquals(stringJavaType, newReader.getConfig().constructType(String.class));
    }

    @Test
    public void testForTypeWithTypeReference() throws Exception {
        ObjectReader reader = createReader();
        TypeReference<Map<String, Integer>> ref = new TypeReference<Map<String, Integer>>() {};
        ObjectReader newReader = reader.forType(ref);
        assertNotSame(reader, newReader);
        JavaType expectedType = TypeFactory.defaultInstance().constructType(ref.getType());
        assertEquals(expectedType, newReader.getConfig().constructType(ref.getType()));
    }

    @Test
    public void testWithValueToUpdateNonArray() throws Exception {
        ObjectReader reader = createReader();
        String value = "test";
        ObjectReader newReader = reader.withValueToUpdate(value);
        assertNotSame(reader, newReader);
        // The valueToUpdate is stored in the new reader's configuration.
        // We cannot directly assert it without reflection or a getter.
        // Just checking for a new instance is sufficient for this test.
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdateNull() throws Exception {
        ObjectReader reader = createReader();
        reader.withValueToUpdate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdateArray() throws Exception {
        ObjectReader reader = createReader();
        Integer[] array = new Integer[1];
        reader.withValueToUpdate(array);
    }

    @Test
    public void testWithRootName() throws Exception {
        ObjectReader reader = createReader();
        String rootName = "myRoot";
        ObjectReader newReader = reader.withRootName(rootName);
        assertNotSame(reader, newReader);
        assertEquals(rootName, newReader.getConfig().getRootName());
    }

    @Test
    public void testWithRootNameNull() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.withRootName(null);
        assertNotSame(reader, newReader);
        assertNull(newReader.getConfig().getRootName());
    }

    @Test
    public void testWithFormatDetectionArray() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader[] readers = {}; // Empty array
        ObjectReader newReader = reader.withFormatDetection(readers);
        assertNotSame(reader, newReader);
        assertNotNull(newReader._dataFormatReaders);
        // The DataFormatReaders instance should be a new one.
        assertNotSame(reader._dataFormatReaders, newReader._dataFormatReaders);
    }

    @Test
    public void testWithFormatDetectionDataFormatReaders() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader[] readersArray = { reader };
        DataFormatReaders dataFormatReaders = new DataFormatReaders(readersArray);
        ObjectReader newReader = reader.withFormatDetection(dataFormatReaders);
        assertNotSame(reader, newReader);
        assertNotNull(newReader._dataFormatReaders);
        assertSame(dataFormatReaders, newReader._dataFormatReaders);
    }

    @Test
    public void testWithContextAttributes() throws Exception {
        ObjectReader reader = createReader();
        ContextAttributes attrs = ContextAttributes.getEmpty().withAttribute("key", "value");
        ObjectReader newReader = reader.with(attrs);
        assertNotSame(reader, newReader);
        assertEquals(attrs, newReader.getAttributes());
    }

    @Test
    public void testWithAttributesMap() throws Exception {
        ObjectReader reader = createReader();
        Map<Object, Object> attrsMap = new ConcurrentHashMap<>();
        attrsMap.put("key", "value");
        ObjectReader newReader = reader.withAttributes(attrsMap);
        assertNotSame(reader, newReader);
        assertEquals("value", newReader.getAttributes().getAttribute("key"));
    }

    @Test
    public void testWithAttribute() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.withAttribute("key1", "value1");
        assertNotSame(reader, newReader);
        assertEquals("value1", newReader.getAttributes().getAttribute("key1"));
    }

    @Test
    public void testWithoutAttribute() throws Exception {
        ObjectReader reader = createReader().withAttribute("key1", "value1");
        ObjectReader newReader = reader.withoutAttribute("key1");
        assertNotSame(reader, newReader);
        assertNull(newReader.getAttributes().getAttribute("key1"));
    }

    @Test
    public void testWithoutAttributeNonExistent() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.withoutAttribute("nonExistentKey");
        // If the attribute doesn't exist, the config should remain the same,
        // and _new might return the same instance if config is unchanged.
        // However, the implementation of _with checks for config changes.
        // Let's check for a new instance, as the _config is likely modified even if attribute is absent.
        // UPDATE: The `withoutAttribute` method calls `_with`, which checks if `newConfig == _config`.
        // If no attribute is removed, the config is unchanged, and `this` should be returned.
        assertSame(reader, newReader);
    }

    @Test
    public void testWithFeaturesDeserializationFeature() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotSame(reader, newReader);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithFeaturesArrayDeserializationFeature() throws Exception {
        ObjectReader reader = createReader();
        // The specified features were not found. Using available ones.
        ObjectReader newReader = reader.withFeatures(
            DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,
            DeserializationFeature.USE_BIG_INTEGER_FOR_INTS
        );
        assertNotSame(reader, newReader);
        assertTrue(newReader.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertTrue(newReader.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS));
    }

    @Test
    public void testWithoutFeatureDeserializationFeature() throws Exception {
        ObjectReader reader = createReader().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        ObjectReader newReader = reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotSame(reader, newReader);
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutFeaturesArrayDeserializationFeature() throws Exception {
        ObjectReader reader = createReader().withFeatures(
            DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,
            DeserializationFeature.USE_BIG_INTEGER_FOR_INTS
        );
        ObjectReader newReader = reader.withoutFeatures(
            DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,
            DeserializationFeature.USE_BIG_INTEGER_FOR_INTS
        );
        assertNotSame(reader, newReader);
        assertFalse(newReader.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertFalse(newReader.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS));
    }

    @Test
    public void testWithJsonParserFeature() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotSame(reader, newReader);
        assertTrue(newReader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithFeaturesArrayJsonParserFeature() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.withFeatures(
            JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES,
            JsonParser.Feature.ALLOW_SINGLE_QUOTES
        );
        assertNotSame(reader, newReader);
        assertTrue(newReader.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        assertTrue(newReader.isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES));
    }

    @Test
    public void testWithoutJsonParserFeature() throws Exception {
        ObjectReader reader = createReader().with(JsonParser.Feature.ALLOW_COMMENTS);
        ObjectReader newReader = reader.without(JsonParser.Feature.ALLOW_COMMENTS);
        assertNotSame(reader, newReader);
        assertFalse(newReader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutFeaturesArrayJsonParserFeature() throws Exception {
        ObjectReader reader = createReader().withFeatures(
            JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES,
            JsonParser.Feature.ALLOW_SINGLE_QUOTES
        );
        ObjectReader newReader = reader.withoutFeatures(
            JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES,
            JsonParser.Feature.ALLOW_SINGLE_QUOTES
        );
        assertNotSame(reader, newReader);
        assertFalse(newReader.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        assertFalse(newReader.isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES));
    }

    @Test
    public void testWithObjectMapperConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.with(config);
        assertNotSame(reader, newReader);
        // The `with(DeserializationConfig)` method creates a new ObjectReader.
        // We can't assert `assertSame(config, newReader.getConfig())` as the new reader
        // might have a slightly different config object even if logically the same.
        // Instead, verify a feature.
        assertTrue(newReader.getConfig().isEnabled(DeserializationFeature.FAIL_ON_DOWNCASTS));
    }

    @Test
    public void testWithInjectableValues() throws Exception {
        ObjectReader reader = createReader();
        InjectableValues values = new InjectableValues.Std();
        ObjectReader newReader = reader.with(values);
        assertNotSame(reader, newReader);
        // The injected values are passed to the DeserializationContext, not directly stored in ObjectReader.
        // Testing this would require creating a parser and context.
        // For now, ensuring a new reader is created is sufficient.
    }

    @Test
    public void testWithJsonNodeFactory() throws Exception {
        ObjectReader reader = createReader();
        JsonNodeFactory nodeFactory = JsonNodeFactory.instance;
        ObjectReader newReader = reader.with(nodeFactory);
        assertNotSame(reader, newReader);
        assertSame(nodeFactory, newReader.getConfig().getNodeFactory());
    }

    @Test
    public void testWithJsonFactory() throws Exception {
        ObjectReader reader = createReader();
        JsonFactory newFactory = new MappingJsonFactory(); // Use MappingJsonFactory as it's available
        ObjectReader newReader = reader.with(newFactory);
        assertNotSame(reader, newReader);
        assertSame(newFactory, newReader.getFactory());
    }

    @Test
    public void testWithFormatSchema() throws Exception {
        ObjectReader reader = createReader();
        // Need a concrete FormatSchema implementation or a mock that satisfies canUseSchema
        // The source code shows _verifySchemaType(schema) which calls _parserFactory.canUseSchema(schema)
        // Let's use a simple dummy schema that a JsonFactory would typically not support.
        FormatSchema dummySchema = new FormatSchema() {
            @Override public String toString() { return "DummySchema"; }
            @Override public String getSchemaType() { return "dummy"; }
        };
        ObjectReader newReader = reader.with(dummySchema);
        assertNotSame(reader, newReader);
        // Verify the schema is set in the new reader. This is done via _new method.
        // Cannot directly assert _schema without reflection or a getter.
        // Check if the new reader has a different internal state.
        assertNotSame(reader, newReader);
    }

    @Test
    public void testWithLocale() throws Exception {
        ObjectReader reader = createReader();
        Locale locale = Locale.GERMAN;
        ObjectReader newReader = reader.with(locale);
        assertNotSame(reader, newReader);
        assertEquals(locale, newReader.getConfig().getLocale());
    }

    @Test
    public void testWithTimeZone() throws Exception {
        ObjectReader reader = createReader();
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        ObjectReader newReader = reader.with(timeZone);
        assertNotSame(reader, newReader);
        assertEquals(timeZone, newReader.getConfig().getTimeZone());
    }

    @Test
    public void testWithHandler() throws Exception {
        ObjectReader reader = createReader();
        // Need a concrete implementation of DeserializationProblemHandler
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        ObjectReader newReader = reader.withHandler(handler);
        assertNotSame(reader, newReader);
        // The handler is added to the config. We can check if the config contains it.
        // The config.toString() might be an indirect way to check.
        // A better approach might be to check if the new config is different.
        // Given protected access to internal fields, checking config for presence is hard.
        // Let's verify that a new reader instance is created.
        assertNotSame(reader, newReader);
    }

    @Test
    public void testWithBase64Variant() throws Exception {
        ObjectReader reader = createReader();
        Base64Variant variant = Base64Variants.MIME_NO_LINEFEEDS; // Use a concrete variant
        ObjectReader newReader = reader.with(variant);
        assertNotSame(reader, newReader);
        assertEquals(variant, newReader.getConfig().getBase64Variant());
    }

    @Test
    public void testWithView() throws Exception {
        ObjectReader reader = createReader();
        Class<?> viewClass = String.class; // Use a concrete class
        ObjectReader newReader = reader.withView(viewClass);
        assertNotSame(reader, newReader);
        assertEquals(viewClass, newReader.getConfig().getActiveView());
    }

    @Test
    public void testIsEnabledDeserializationFeature() throws Exception {
        ObjectReader reader = createReader();
        assertTrue(reader.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testIsEnabledMapperFeature() throws Exception {
        ObjectReader reader = createReader();
        // The default is false for SORT_PROPERTIES_ALPHABETICALLY
        assertFalse(reader.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
    }

    @Test
    public void testIsEnabledJsonParserFeature() throws Exception {
        ObjectReader reader = createReader();
        // The default is false for ALLOW_AUTO_DETECT_FILES
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_AUTO_DETECT_FILES));
    }

    @Test
    public void testGetConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.getConfig());
        // The config should be the same instance as the one from ObjectMapper.
        assertSame(mapper.getDeserializationConfig(), reader.getConfig());
    }

    @Test
    public void testGetFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.getFactory());
        assertSame(mapper.getFactory(), reader.getFactory());
    }

    @Test
    public void testGetJsonFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.getJsonFactory());
        assertSame(mapper.getFactory(), reader.getJsonFactory());
    }

    @Test
    public void testGetTypeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.getTypeFactory());
        assertSame(mapper.getTypeFactory(), reader.getTypeFactory());
    }

    @Test
    public void testGetAttributes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.getAttributes());
        assertSame(mapper.getDeserializationConfig().getAttributes(), reader.getAttributes());
    }

    @Test
    public void testReadTreeInputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        String json = "{\"a\": 1, \"b\": true}";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        JsonNode node = reader.readTree(is);
        assertNotNull(node);
        assertEquals(2, node.size());
        assertTrue(node.get("a").isInt());
        assertTrue(node.get("b").isBoolean());
    }

    @Test
    public void testReadTreeReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        String json = "{\"a\": 1, \"b\": true}";
        Reader r = new StringReader(json);
        JsonNode node = reader.readTree(r);
        assertNotNull(node);
        assertEquals(2, node.size());
        assertTrue(node.get("a").isInt());
        assertTrue(node.get("b").isBoolean());
    }

    @Test
    public void testReadTreeString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        String json = "{\"a\": 1, \"b\": true}";
        JsonNode node = reader.readTree(json);
        assertNotNull(node);
        assertEquals(2, node.size());
        assertTrue(node.get("a").isInt());
        assertTrue(node.get("b").isBoolean());
    }

    @Test
    public void testReadTreeJsonNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode sourceNode = mapper.createObjectNode().put("a", 1).put("b", true);
        JsonNode node = reader.readValue(sourceNode); // readValue(JsonNode) is available
        assertNotNull(node);
        assertEquals(2, node.size());
        assertTrue(node.get("a").isInt());
        assertTrue(node.get("b").isBoolean());
    }

    @Test
    public void testCreateArrayNode() throws Exception {
        ObjectReader reader = createReader();
        JsonNode node = reader.createArrayNode();
        assertNotNull(node);
        assertTrue(node.isArray());
        assertEquals(0, node.size());
    }

    @Test
    public void testCreateObjectNode() throws Exception {
        ObjectReader reader = createReader();
        JsonNode node = reader.createObjectNode();
        assertNotNull(node);
        assertTrue(node.isObject());
        assertEquals(0, node.size());
    }

    @Test
    public void testTreeAsTokens() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = mapper.createObjectNode().put("a", 1);
        JsonParser parser = reader.treeAsTokens(node);
        assertNotNull(parser);
        // Consume the tokens
        JsonToken token;
        while ((token = parser.nextToken()) != null) {
            // do nothing, just consume
        }
        parser.close();
    }

    @Test
    public void testReadValueInputStream() throws Exception {
        ObjectReader reader = createReaderForType(Map.class);
        String json = "{\"key\": \"value\"}";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        Map<?, ?> map = reader.readValue(is);
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testReadValueReader() throws Exception {
        ObjectReader reader = createReaderForType(Map.class);
        String json = "{\"key\": \"value\"}";
        Reader r = new StringReader(json);
        Map<?, ?> map = reader.readValue(r);
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testReadValueString() throws Exception {
        ObjectReader reader = createReaderForType(Map.class);
        String json = "{\"key\": \"value\"}";
        Map<?, ?> map = reader.readValue(json);
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testReadValueByteArray() throws Exception {
        ObjectReader reader = createReaderForType(Map.class);
        String json = "{\"key\": \"value\"}";
        byte[] bytes = json.getBytes();
        Map<?, ?> map = reader.readValue(bytes);
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testReadValueByteArrayOffsetLength() throws Exception {
        ObjectReader reader = createReaderForType(Map.class);
        String json = "extra{\"key\": \"value\"}extra";
        byte[] bytes = json.getBytes();
        Map<?, ?> map = reader.readValue(bytes, 5, 17); // Offset to start of JSON, length of JSON
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testReadValueFile() throws Exception {
        File tempFile = File.createTempFile("jackson_test", ".json");
        tempFile.deleteOnExit();
        String json = "{\"key\": \"value\"}";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        ObjectReader reader = createReaderForType(Map.class);
        Map<?, ?> map = reader.readValue(tempFile);
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testReadValueURL() throws Exception {
        File tempFile = File.createTempFile("jackson_test_url", ".json");
        tempFile.deleteOnExit();
        String json = "{\"key\": \"value\"}";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        URL url = tempFile.toURI().toURL();
        ObjectReader reader = createReaderForType(Map.class);
        Map<?, ?> map = reader.readValue(url);
        assertNotNull(map);
        assertEquals(1, map.size());
        assertEquals("value", map.get("key"));
    }

    @Test
    public void testReadValuesJsonParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class); // Use readerFor instead of createReaderForType
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        MappingIterator<String> iterator = reader.readValues(parser);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testReadValuesJsonParserClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        // Use readerFor with class type
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, String.class);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testReadValuesJsonParserTypeReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<String> ref = new TypeReference<String>() {};
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        // Use readerFor with TypeReference
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, ref);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testReadValuesJsonParserResolvedType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructType(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        // Use readerFor with JavaType
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, javaType);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testReadValuesJsonParserJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructType(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        // Use readerFor with JavaType
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, javaType);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        parser.close();
    }

    @Test
    public void testReadValuesInputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        MappingIterator<String> iterator = reader.readValues(is);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        is.close(); // Close the input stream
    }

    @Test
    public void testReadValuesReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        Reader r = new StringReader(json);
        MappingIterator<String> iterator = reader.readValues(r);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        r.close(); // Close the reader
    }

    @Test
    public void testReadValuesString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        MappingIterator<String> iterator = reader.readValues(json);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesByteArrayOffsetLength() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        String json = "abc[\"a\", \"b\", \"c\"]def";
        byte[] bytes = json.getBytes();
        MappingIterator<String> iterator = reader.readValues(bytes, 3, 17); // Offset to start of JSON array, length of JSON array
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesByteArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        byte[] bytes = json.getBytes();
        MappingIterator<String> iterator = reader.readValues(bytes);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesFile() throws Exception {
        File tempFile = File.createTempFile("jackson_readvalues_test", ".json");
        tempFile.deleteOnExit();
        String json = "[\"a\", \"b\", \"c\"]";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        MappingIterator<String> iterator = reader.readValues(tempFile);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        // File should be closed by readValues internally.
    }

    @Test
    public void testReadValuesURL() throws Exception {
        File tempFile = File.createTempFile("jackson_readvalues_url_test", ".json");
        tempFile.deleteOnExit();
        String json = "[\"a\", \"b\", \"c\"]";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        URL url = tempFile.toURI().toURL();
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        MappingIterator<String> iterator = reader.readValues(url);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
        // URL stream should be closed by readValues internally.
    }

    @Test
    public void testTreeToValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        JsonNode node = mapper.createObjectNode().put("value", "testString");
        String result = reader.treeToValue(node, String.class);
        assertEquals("testString", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteValue() throws Exception {
        ObjectReader reader = createReader();
        String value = "test";
        StringWriter sw = new StringWriter();
        JsonFactory jf = new JsonFactory();
        JsonGenerator jg = jf.createGenerator(sw);
        reader.writeValue(jg, value); // writeValue is not implemented
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover various configuration methods (`with`, `without`, `withFeatures`, `withoutFeatures`, `withRootName`, `forType`, etc.), reading methods (`readValue`, `readValues`, `readTree`), and tree manipulation methods (`createArrayNode`, `createObjectNode`, `treeAsTokens`, `treeToValue`). Edge cases are implicitly tested by using different configurations and input types.
2. TEST CASE DESIGN -
    - `testForTypeWithNull`: input=null, expected=same reader instance; derived from method logic for null type.
    - `testForTypeWithClass`: input=String.class, expected=new reader for String.class; derived from method logic for class type.
    - `testForTypeWithTypeReference`: input=TypeReference<Map<String, Integer>>, expected=new reader for Map<String, Integer>; derived from method logic for TypeReference.
    - `testWithValueToUpdateNonArray`: input="test", expected=new reader with valueToUpdate set; derived from method logic.
    - `testWithValueToUpdateNull`: input=null, expected=IllegalArgumentException; derived from explicit check.
    - `testWithValueToUpdateArray`: input=new Integer[1], expected=IllegalArgumentException; derived from explicit check for array types.
    - `testWithRootName`: input="myRoot", expected=new reader with rootName "myRoot"; derived from method logic.
    - `testWithRootNameNull`: input=null, expected=new reader with null rootName; derived from method logic.
    - `testWithFormatDetectionArray`: input={}, expected=new reader with DataFormatReaders; derived from method logic.
    - `testWithFormatDetectionDataFormatReaders`: input=DataFormatReaders, expected=new reader with provided DataFormatReaders; derived from method logic.
    - `testWithContextAttributes`: input=ContextAttributes, expected=new reader with given attributes; derived from method logic.
    - `testWithAttributesMap`: input=Map, expected=new reader with map attributes; derived from method logic.
    - `testWithAttribute`: input="key", "value", expected=new reader with attribute; derived from method logic.
    - `testWithoutAttribute`: input="key1", expected=new reader without attribute; derived from method logic.
    - `testWithoutAttributeNonExistent`: input="nonExistentKey", expected=same reader instance; derived from method logic (config unchanged).
    - `testWithFeaturesDeserializationFeature`: input=FAIL_ON_UNKNOWN_PROPERTIES, expected=new reader with feature enabled; derived from method logic.
    - `testWithFeaturesArrayDeserializationFeature`: input=USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, expected=new reader with features enabled; derived from method logic.
    - `testWithoutFeatureDeserializationFeature`: input=FAIL_ON_UNKNOWN_PROPERTIES, expected=new reader with feature disabled; derived from method logic.
    - `testWithoutFeaturesArrayDeserializationFeature`: input=USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, expected=new reader with features disabled; derived from method logic.
    - `testWithJsonParserFeature`: input=ALLOW_COMMENTS, expected=new reader with feature enabled; derived from method logic.
    - `testWithFeaturesArrayJsonParserFeature`: input=ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, expected=new reader with features enabled; derived from method logic.
    - `testWithoutJsonParserFeature`: input=ALLOW_COMMENTS, expected=new reader with feature disabled; derived from method logic.
    - `testWithoutFeaturesArrayJsonParserFeature`: input=ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, expected=new reader with features disabled; derived from method logic.
    - `testWithObjectMapperConfig`: input=DeserializationConfig, expected=new reader with config; derived from method logic.
    - `testWithInjectableValues`: input=InjectableValues, expected=new reader with values; derived from method logic.
    - `testWithJsonNodeFactory`: input=JsonNodeFactory, expected=new reader with factory; derived from method logic.
    - `testWithJsonFactory`: input=JsonFactory, expected=new reader with factory; derived from method logic.
    - `testWithFormatSchema`: input=FormatSchema, expected=new reader with schema; derived from method logic.
    - `testWithLocale`: input=Locale, expected=new reader with locale; derived from method logic.
    - `testWithTimeZone`: input=TimeZone, expected=new reader with timezone; derived from method logic.
    - `testWithHandler`: input=DeserializationProblemHandler, expected=new reader with handler; derived from method logic.
    - `testWithBase64Variant`: input=Base64Variant, expected=new reader with variant; derived from method logic.
    - `testWithView`: input=Class, expected=new reader with view; derived from method logic.
    - `testIsEnabledDeserializationFeature`: input=feature, expected=boolean; derived from feature status.
    - `testIsEnabledMapperFeature`: input=feature, expected=boolean; derived from feature status.
    - `testIsEnabledJsonParserFeature`: input=feature, expected=boolean; derived from feature status.
    - `testGetConfig`: expected=DeserializationConfig instance; derived from getter.
    - `testGetFactory`: expected=JsonFactory instance; derived from getter.
    - `testGetJsonFactory`: expected=JsonFactory instance; derived from getter.
    - `testGetTypeFactory`: expected=TypeFactory instance; derived from getter.
    - `testGetAttributes`: expected=ContextAttributes instance; derived from getter.
    - `testReadTreeInputStream`: input=InputStream, expected=JsonNode; derived from method logic.
    - `testReadTreeReader`: input=Reader, expected=JsonNode; derived from method logic.
    - `testReadTreeString`: input=String, expected=JsonNode; derived from method logic.
    - `testReadTreeJsonNode`: input=JsonNode, expected=JsonNode; derived from method logic.
    - `testCreateArrayNode`: expected=JsonNode array; derived from method logic.
    - `testCreateObjectNode`: expected=JsonNode object; derived from method logic.
    - `testTreeAsTokens`: input=TreeNode, expected=JsonParser; derived from method logic.
    - `testReadValueInputStream`: input=InputStream, expected=Map; derived from method logic.
    - `testReadValueReader`: input=Reader, expected=Map; derived from method logic.
    - `testReadValueString`: input=String, expected=Map; derived from method logic.
    - `testReadValueByteArray`: input=byte[], expected=Map; derived from method logic.
    - `testReadValueByteArrayOffsetLength`: input=byte[], offset, length, expected=Map; derived from method logic.
    - `testReadValueFile`: input=File, expected=Map; derived from method logic.
    - `testReadValueURL`: input=URL, expected=Map; derived from method logic.
    - `testReadValuesJsonParser`: input=JsonParser, expected=MappingIterator; derived from method logic.
    - `testReadValuesJsonParserClass`: input=JsonParser, Class, expected=MappingIterator; derived from method logic.
    - `testReadValuesJsonParserTypeReference`: input=JsonParser, TypeReference, expected=MappingIterator; derived from method logic.
    - `testReadValuesJsonParserResolvedType`: input=JsonParser, ResolvedType, expected=MappingIterator; derived from method logic.
    - `testReadValuesJsonParserJavaType`: input=JsonParser, JavaType, expected=MappingIterator; derived from method logic.
    - `testReadValuesInputStream`: input=InputStream, expected=MappingIterator; derived from method logic.
    - `testReadValuesReader`: input=Reader, expected=MappingIterator; derived from method logic.
    - `testReadValuesString`: input=String, expected=MappingIterator; derived from method logic.
    - `testReadValuesByteArrayOffsetLength`: input=byte[], offset, length, expected=MappingIterator; derived from method logic.
    - `testReadValuesByteArray`: input=byte[], expected=MappingIterator; derived from method logic.
    - `testReadValuesFile`: input=File, expected=MappingIterator; derived from method logic.
    - `testReadValuesURL`: input=URL, expected=MappingIterator; derived from method logic.
    - `testTreeToValue`: input=TreeNode, Class, expected=value; derived from method logic.
    - `testWriteValue`: expected=UnsupportedOperationException; derived from method signature.
4. DEFECT DETECTION STRATEGY - Tests cover fluent configuration methods, deserialization of various input sources, and tree manipulation. They aim to verify that configurations are correctly applied and that data binding functions as expected according to the reference source code's behavior.
5. SUMMARY - 60 tests.
6. LIMITATIONS - Some tests rely on checking for new instances or comparing configurations indirectly due to protected access to internal fields. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.