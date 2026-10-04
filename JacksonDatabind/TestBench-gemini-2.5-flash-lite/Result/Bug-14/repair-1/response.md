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
import java.util.List; // Added for DataFormatReaders constructor
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
import com.fasterxml.jackson.core.json.MappingJsonFactory; // Added for MappingJsonFactory

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
        // ObjectMapper.builder() is not available in this version. Use default constructor.
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
        assertSame(reader, newReader);
    }

    @Test
    public void testForTypeWithClass() throws Exception {
        ObjectReader reader = createReader();
        ObjectReader newReader = reader.forType(String.class);
        assertNotSame(reader, newReader);
        assertEquals(String.class, newReader.getConfig().constructType(String.class).getRawClass());
    }

    @Test
    public void testForTypeWithTypeReference() throws Exception {
        ObjectReader reader = createReader();
        TypeReference<Map<String, Integer>> ref = new TypeReference<Map<String, Integer>>() {};
        ObjectReader newReader = reader.forType(ref);
        assertNotSame(reader, newReader);
        JavaType expectedType = TypeFactory.defaultInstance().constructType(ref.getType());
        assertEquals(expectedType, newReader.getConfig().constructType(expectedType.getRawClass()));
    }

    @Test
    public void testWithValueToUpdateNonArray() throws Exception {
        ObjectReader reader = createReader();
        String value = "test";
        ObjectReader newReader = reader.withValueToUpdate(value);
        assertNotSame(reader, newReader);
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
    }

    @Test
    public void testWithFormatDetectionDataFormatReaders() throws Exception {
        ObjectReader reader = createReader();
        // DataFormatReaders constructor takes Collection<ObjectReader> or ObjectReader...
        // Use the constructor that takes ObjectReader array.
        ObjectReader[] readers = { reader }; // Pass a dummy reader
        DataFormatReaders dataFormatReaders = new DataFormatReaders(readers);
        ObjectReader newReader = reader.withFormatDetection(dataFormatReaders);
        assertNotSame(reader, newReader);
        assertNotNull(newReader._dataFormatReaders);
        assertSame(dataFormatReaders, newReader._dataFormatReaders);
    }

    @Test
    public void testWithContextAttributes() throws Exception {
        ObjectReader reader = createReader();
        ContextAttributes attrs = ContextAttributes.getEmpty();
        ObjectReader newReader = reader.with(attrs);
        assertNotSame(reader, newReader);
        assertSame(attrs, newReader.getAttributes());
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
        // Assuming no change means same instance.
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
        ObjectReader newReader = reader.withFeatures(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVE_VALUES, DeserializationFeature.FAIL_ON_READING_PRIMITIVE_TYPE_FOR_STRING);
        assertNotSame(reader, newReader);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVE_VALUES));
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_READING_PRIMITIVE_TYPE_FOR_STRING));
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
        ObjectReader reader = createReader().withFeatures(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVE_VALUES, DeserializationFeature.FAIL_ON_READING_PRIMITIVE_TYPE_FOR_STRING);
        ObjectReader newReader = reader.withoutFeatures(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVE_VALUES, DeserializationFeature.FAIL_ON_READING_PRIMITIVE_TYPE_FOR_STRING);
        assertNotSame(reader, newReader);
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVE_VALUES));
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_READING_PRIMITIVE_TYPE_FOR_STRING));
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
        ObjectReader newReader = reader.withFeatures(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
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
        ObjectReader reader = createReader().withFeatures(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        ObjectReader newReader = reader.withoutFeatures(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
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
        assertSame(config, newReader.getConfig());
    }

    @Test
    public void testWithInjectableValues() throws Exception {
        ObjectReader reader = createReader();
        InjectableValues values = new InjectableValues.Std();
        ObjectReader newReader = reader.with(values);
        assertNotSame(reader, newReader);
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
        JsonFactory newFactory = new MappingJsonFactory();
        ObjectReader newReader = reader.with(newFactory);
        assertNotSame(reader, newReader);
        assertSame(newFactory, newReader.getFactory());
    }

    @Test
    public void testWithFormatSchema() throws Exception {
        ObjectReader reader = createReader();
        FormatSchema dummySchema = new FormatSchema() {
            @Override public String toString() { return "DummySchema"; }
            @Override public String getSchemaType() { return "dummy"; }
        };
        ObjectReader newReader = reader.with(dummySchema);
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
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        ObjectReader newReader = reader.withHandler(handler);
        assertNotSame(reader, newReader);
        // The config.hasDeserializationProblemHandler method is protected.
        // We can check for the presence of the handler by comparing the configuration.
        assertTrue(newReader.getConfig().toString().contains(handler.getClass().getName()));
    }

    @Test
    public void testWithBase64Variant() throws Exception {
        ObjectReader reader = createReader();
        Base64Variant variant = Base64Variants.MIME_NO_LINEFEEDS;
        ObjectReader newReader = reader.with(variant);
        assertNotSame(reader, newReader);
        assertEquals(variant, newReader.getConfig().getBase64Variant());
    }

    @Test
    public void testWithView() throws Exception {
        ObjectReader reader = createReader();
        Class<?> viewClass = Object.class; // Use a simple class
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
        assertFalse(reader.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
    }

    @Test
    public void testIsEnabledJsonParserFeature() throws Exception {
        ObjectReader reader = createReader();
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_AUTO_DETECT_FILES));
    }

    @Test
    public void testGetConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader.getConfig());
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
        JsonNode node = reader.readValue(sourceNode);
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
        assertTrue(parser.nextToken().isStructStart()); // START_OBJECT
        assertEquals("a", parser.nextFieldName());
        assertEquals(1, parser.nextIntValue(-1));
        assertTrue(parser.nextToken().isStructEnd()); // END_OBJECT
        assertNull(parser.nextToken());
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
        ObjectReader reader = mapper.readerFor(String.class);
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
    }

    @Test
    public void testReadValuesJsonParserClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, String.class);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesJsonParserTypeReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<String> ref = new TypeReference<String>() {};
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, ref);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesJsonParserResolvedType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructType(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, javaType);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesJsonParserJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructType(String.class);
        String json = "[\"a\", \"b\", \"c\"]";
        JsonParser parser = mapper.getFactory().createParser(json);
        MappingIterator<String> iterator = mapper.readerFor(String.class).readValues(parser, javaType);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
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
        reader.writeValue(jg, value);
    }
}
```