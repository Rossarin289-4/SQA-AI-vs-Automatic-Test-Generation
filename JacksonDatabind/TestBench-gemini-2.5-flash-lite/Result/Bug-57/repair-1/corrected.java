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
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectReaderTest {

    // Helper method to create a basic ObjectReader with necessary ObjectMapper fields
    private ObjectReader createReader(ObjectMapper mapper) {
        // The ObjectReader constructor needs a valid DeserializationConfig.
        // We can get a default one from ObjectMapper.
        DeserializationConfig config = mapper.getDeserializationConfig();
        return new ObjectReader(mapper, config);
    }

    // Helper method to create a basic ObjectMapper with essential fields for ObjectReader
    private ObjectMapper createMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // These fields are accessed by the ObjectReader constructor.
        // We need to provide valid instances, even if they are default ones.
        mapper._deserializationContext = new DefaultDeserializationContext.Impl(null); // null factory is acceptable for a basic context
        mapper._rootDeserializers = new ConcurrentHashMap<>();
        mapper._jsonFactory = new JsonFactory();
        return mapper;
    }

    // Helper to create a base DeserializationConfig
    private DeserializationConfig createConfig() {
        // DeserializationConfig has a protected constructor. We need a way to create one.
        // The easiest way is to get it from an ObjectMapper.
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getDeserializationConfig();
    }

    @Test
    public void testDefaultConstructor() throws Exception {
        ObjectMapper mapper = createMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        ObjectReader reader = new ObjectReader(mapper, config);
        assertNotNull(reader);
        // Check some default values
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertNotNull(reader.getFactory());
        assertNotNull(reader.getTypeFactory());
    }

    @Test
    public void testWithDeserializationFeatureEnabled() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader newReader = reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); // original should be unchanged
    }

    @Test
    public void testWithDeserializationFeaturesEnabled() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader newReader = reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES));
    }

    @Test
    public void testWithFeaturesEnabled() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader newReader = reader.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES);
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES));
    }

    @Test
    public void testWithoutDeserializationFeature() throws Exception {
        ObjectMapper mapper = createMapper();
        // Enable a feature first to test disabling it
        ObjectReader reader = createReader(mapper).with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader newReader = reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); // original should be unchanged
    }

    @Test
    public void testWithoutDeserializationFeatures() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper)
                .with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .with(DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES));

        ObjectReader newReader = reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES);
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES));
    }

    @Test
    public void testWithoutFeatures() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper)
                .withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES));

        ObjectReader newReader = reader.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES);
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PROPERTIES));
    }

    @Test
    public void testWithRootNameString() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader newReader = reader.withRootName("myRoot");
        assertEquals("myRoot", newReader.getConfig().getRootName());
        // Original reader's config should not be affected.
        assertNotEquals("myRoot", reader.getConfig().getRootName());
    }

    @Test
    public void testWithoutRootName() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).withRootName("myRoot");
        assertEquals("myRoot", reader.getConfig().getRootName());

        ObjectReader newReader = reader.withoutRootName();
        // Check against PropertyName.NO_NAME, which is the default and expected result for withoutRootName()
        assertEquals(PropertyName.NO_NAME, newReader.getConfig().getRootName());
        assertNotEquals(PropertyName.NO_NAME, reader.getConfig().getRootName());
    }

    @Test
    public void testForTypeJavaType() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        ObjectReader newReader = reader.forType(stringType);
        assertEquals(stringType, newReader._valueType);
        assertNotEquals(stringType, reader._valueType); // Original should not be changed
    }

    @Test
    public void testForTypeClass() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader newReader = reader.forType(String.class);
        assertEquals(TypeFactory.defaultInstance().constructType(String.class), newReader._valueType);
        assertNotEquals(TypeFactory.defaultInstance().constructType(String.class), reader._valueType);
    }

    @Test
    public void testForTypeTypeReference() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        TypeReference<List<String>> ref = new TypeReference<List<String>>() {};
        ObjectReader newReader = reader.forType(ref);
        assertEquals(TypeFactory.defaultInstance().constructType(ref.getType()), newReader._valueType);
        assertNotEquals(TypeFactory.defaultInstance().constructType(ref.getType()), reader._valueType);
    }

    @Test
    public void testWithValueToUpdate() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        Object value = new Object();
        ObjectReader newReader = reader.withValueToUpdate(value);
        assertEquals(value, newReader._valueToUpdate);
        assertNull(reader._valueToUpdate); // Original should not be changed
    }

    @Test
    public void testWithView() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader newReader = reader.withView(Object.class); // Use a dummy view class
        assertEquals(Object.class, newReader.getConfig().getActiveView());
        assertNull(reader.getConfig().getActiveView()); // Original should not be changed
    }

    @Test
    public void testWithHandler() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        // DeserializationProblemHandler is abstract, need an implementation.
        // Using an anonymous inner class is fine here.
        DeserializationProblemHandler handler = new DeserializationProblemHandler() { };
        ObjectReader newReader = reader.withHandler(handler);
        // The DeserializationConfig does not directly expose handlers,
        // but it's part of the configuration that 'withHandler' modifies.
        // For a simple check, we can verify that a new reader is returned.
        assertNotSame(reader, newReader);
        // A more thorough test would involve checking if the handler is actually used during deserialization,
        // but that's beyond the scope of testing the 'withHandler' method itself.
    }

    @Test
    public void testWithFormatDetectionReaders() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader[] readers = {}; // Empty array for testing
        ObjectReader newReader = reader.withFormatDetection(readers);
        assertNotNull(newReader._dataFormatReaders);
        assertNull(reader._dataFormatReaders); // Original should not be changed
    }

    @Test
    public void testWithFormatDetectionDataFormatReaders() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        // DataFormatReaders needs a JsonFactory or an array of readers.
        DataFormatReaders dataFormatReaders = new DataFormatReaders(new JsonFactory());
        ObjectReader newReader = reader.withFormatDetection(dataFormatReaders);
        assertNotNull(newReader._dataFormatReaders);
        assertNull(reader._dataFormatReaders); // Original should not be changed
    }

    @Test
    public void testWithAttributes() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        Map<Object, Object> attrs = new HashMap<>();
        attrs.put("key", "value");
        ObjectReader newReader = reader.withAttributes(attrs);
        assertEquals("value", newReader.getAttributes().getAttribute("key"));
        assertNull(reader.getAttributes().getAttribute("key")); // Original should not be changed
    }

    @Test
    public void testWithAttribute() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader newReader = reader.withAttribute("key", "value");
        assertEquals("value", newReader.getAttributes().getAttribute("key"));
        assertNull(reader.getAttributes().getAttribute("key")); // Original should not be changed
    }

    @Test
    public void testWithoutAttribute() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).withAttribute("key", "value");
        assertEquals("value", reader.getAttributes().getAttribute("key"));

        ObjectReader newReader = reader.withoutAttribute("key");
        assertNull(newReader.getAttributes().getAttribute("key"));
        assertEquals("value", reader.getAttributes().getAttribute("key")); // Original should not be changed
    }

    @Test
    public void testIsEnabledDeserializationFeature() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        ObjectReader readerEnabled = reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(readerEnabled.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testGetConfig() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        DeserializationConfig config = reader.getConfig();
        assertNotNull(config);
        // We need to compare with the config that the reader was initialized with.
        assertEquals(mapper.getDeserializationConfig(), config);
    }

    @Test
    public void testGetFactory() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonFactory factory = reader.getFactory();
        assertNotNull(factory);
        assertEquals(mapper._jsonFactory, factory);
    }

    @Test
    public void testGetTypeFactory() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        TypeFactory typeFactory = reader.getTypeFactory();
        assertNotNull(typeFactory);
        assertEquals(mapper.getDeserializationConfig().getTypeFactory(), typeFactory);
    }

    @Test
    public void testGetAttributes() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ContextAttributes attributes = reader.getAttributes();
        assertNotNull(attributes);
        assertEquals(mapper.getDeserializationConfig().getAttributes(), attributes);
    }

    @Test
    public void testGetInjectableValues() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        InjectableValues injectableValues = reader.getInjectableValues();
        assertNull(injectableValues); // Default is null
        
        // Test with custom injectable values
        InjectableValues customInjectableValues = new InjectableValues.Std();
        ObjectReader newReader = reader.with(customInjectableValues);
        assertEquals(customInjectableValues, newReader.getInjectableValues());
    }

    @Test
    public void testReadValueWithParser() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("\"testString\"");
        String result = reader.readValue(parser);
        assertEquals("testString", result);
    }

    @Test
    public void testReadValuesWithParserAndClass() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("[ \"a\", \"b\", \"c\" ]");
        Iterator<String> iter = reader.readValues(parser, String.class);
        assertTrue(iter.hasNext());
        assertEquals("a", iter.next());
        assertTrue(iter.hasNext());
        assertEquals("b", iter.next());
        assertTrue(iter.hasNext());
        assertEquals("c", iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testCreateArrayNode() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonNode node = reader.createArrayNode();
        assertNotNull(node);
        assertTrue(node.isArray());
    }

    @Test
    public void testCreateObjectNode() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonNode node = reader.createObjectNode();
        assertNotNull(node);
        assertTrue(node.isObject());
    }

    @Test
    public void testTreeAsTokens() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectNode node = reader.createObjectNode(); // Use ObjectNode, a concrete implementation
        node.put("test", "value");
        JsonParser parser = reader.treeAsTokens(node);
        assertNotNull(parser);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("test", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testReadTreeWithParser() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("{ \"data\": 123 }");
        JsonNode tree = reader.readTree(parser);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertEquals(123, tree.get("data").asInt());
    }

    @Test
    public void testReadValueWithInputStream() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        String json = "\"inputStreamTest\"";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        String result = reader.readValue(is);
        assertEquals("inputStreamTest", result);
    }

    @Test
    public void testReadValueWithReader() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        String json = "\"readerTest\"";
        Reader r = new StringReader(json);
        String result = reader.readValue(r);
        assertEquals("readerTest", result);
    }

    @Test
    public void testReadValueWithString() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        String json = "\"stringTest\"";
        String result = reader.readValue(json);
        assertEquals("stringTest", result);
    }

    @Test
    public void testReadValueWithByteArray() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        String json = "\"byteArrayTest\"";
        byte[] bytes = json.getBytes();
        String result = reader.readValue(bytes);
        assertEquals("byteArrayTest", result);
    }

    @Test
    public void testReadValueWithByteArraySlice() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        String json = "prefix\"byteArraySliceTest\"suffix";
        byte[] bytes = json.getBytes();
        // Read only the "byteArraySliceTest" part
        String result = reader.readValue(bytes, 6, 20);
        assertEquals("byteArraySliceTest", result);
    }

    @Test
    public void testReadValueWithFile() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        // Create a temporary file
        File tempFile = File.createTempFile("jacksonTest", ".json");
        tempFile.deleteOnExit();
        String json = "\"fileTest\"";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        String result = reader.readValue(tempFile);
        assertEquals("fileTest", result);
    }

    @Test
    public void testReadValueWithURL() throws Exception {
        // This test requires a running web server or a resource that can be accessed via URL.
        // For a unit test, we can use a mock or a known local file if available.
        // Since we can't rely on external resources, this test is commented out or a placeholder.
        // To make it compile, we'll create a dummy URL pointing to a non-existent file.
        // This test might fail during execution if not properly set up.
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        URL url = new File("test_url_resource.json").toURI().toURL();
        try {
            reader.readValue(url);
            fail("Expected IOException for non-existent URL");
        } catch (IOException expected) {
            // Expected exception
        }
    }

    @Test
    public void testReadValueWithJsonNode() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper).forType(String.class);
        JsonNode node = mapper.createObjectNode().put("testNode", "jsonNodeTest");
        String result = reader.readValue(node);
        assertEquals("jsonNodeTest", result);
    }

    @Test
    public void testReadTreeWithInputStream() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "{ \"treeStream\": true }";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        JsonNode tree = reader.readTree(is);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertTrue(tree.get("treeStream").asBoolean());
    }

    @Test
    public void testReadTreeWithReader() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "{ \"treeReader\": true }";
        Reader r = new StringReader(json);
        JsonNode tree = reader.readTree(r);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertTrue(tree.get("treeReader").asBoolean());
    }

    @Test
    public void testReadTreeWithString() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "{ \"treeString\": true }";
        JsonNode tree = reader.readTree(json);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertTrue(tree.get("treeString").asBoolean());
    }

    @Test
    public void testReadValuesWithParser() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("[ \"val1\", \"val2\" ]");
        MappingIterator<String> iterator = reader.readValues(parser);
        assertTrue(iterator.hasNext());
        assertEquals("val1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("val2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithInputStream() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "[ \"streamVal1\", \"streamVal2\" ]";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        MappingIterator<String> iterator = reader.readValues(is);
        assertTrue(iterator.hasNext());
        assertEquals("streamVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("streamVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithReader() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "[ \"readerVal1\", \"readerVal2\" ]";
        Reader r = new StringReader(json);
        MappingIterator<String> iterator = reader.readValues(r);
        assertTrue(iterator.hasNext());
        assertEquals("readerVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("readerVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithString() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "[ \"stringVal1\", \"stringVal2\" ]";
        MappingIterator<String> iterator = reader.readValues(json);
        assertTrue(iterator.hasNext());
        assertEquals("stringVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("stringVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithByteArray() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "[ \"byteArrVal1\", \"byteArrVal2\" ]";
        byte[] bytes = json.getBytes();
        MappingIterator<String> iterator = reader.readValues(bytes);
        assertTrue(iterator.hasNext());
        assertEquals("byteArrVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("byteArrVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithByteArraySlice() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        String json = "data: [ \"sliceVal1\", \"sliceVal2\" ]";
        byte[] bytes = json.getBytes();
        MappingIterator<String> iterator = reader.readValues(bytes, 5, json.length() - 5);
        assertTrue(iterator.hasNext());
        assertEquals("sliceVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("sliceVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithFile() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        File tempFile = File.createTempFile("jacksonTestValues", ".json");
        tempFile.deleteOnExit();
        String json = "[ \"fileVal1\", \"fileVal2\" ]";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        MappingIterator<String> iterator = reader.readValues(tempFile);
        assertTrue(iterator.hasNext());
        assertEquals("fileVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("fileVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithURL() throws Exception {
        // Placeholder test for readValues(URL). Similar to readValue(URL), it might fail if the URL is invalid.
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        URL url = new File("test_url_resource_values.json").toURI().toURL();
        try {
            reader.readValues(url);
            fail("Expected IOException for non-existent URL");
        } catch (IOException expected) {
            // Expected exception
        }
    }
    
    @Test
    public void testTreeToValue() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonNode node = mapper.createObjectNode().put("age", 30);
        
        // Mock class to deserialize into. Must be accessible.
        class Person {
            public int age;
            // Default constructor is needed for deserialization
            public Person() {}
        }
        Person person = reader.treeToValue(node, Person.class);
        assertNotNull(person);
        assertEquals(30, person.age);
    }

    @Test
    public void testAtString() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        ObjectReader atReader = reader.at("/data/field");
        // This method configures a filter, actual parsing would be needed to test its effect.
        // We can check if the filter is set and is the correct type.
        assertNotNull(atReader._filter);
        assertTrue(atReader._filter instanceof JsonPointerBasedFilter);
        assertEquals("/data/field", ((JsonPointerBasedFilter) atReader._filter)._pointer.toString());
    }

    @Test
    public void testAtJsonPointer() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        JsonPointer pointer = JsonPointer.compile("/config/setting");
        ObjectReader atReader = reader.at(pointer);
        assertNotNull(atReader._filter);
        assertTrue(atReader._filter instanceof JsonPointerBasedFilter);
        assertEquals(pointer, ((JsonPointerBasedFilter) atReader._filter)._pointer);
    }

    @Test
    public void testVersion() throws Exception {
        ObjectMapper mapper = createMapper();
        ObjectReader reader = createReader(mapper);
        Version version = reader.version();
        assertNotNull(version);
        // A minimal check for a valid Version object.
        assertTrue(version.getMajorVersion() >= 2); // Assuming Jackson versions start at 2.x
        assertTrue(version.getMinorVersion() >= 0);
    }
}
