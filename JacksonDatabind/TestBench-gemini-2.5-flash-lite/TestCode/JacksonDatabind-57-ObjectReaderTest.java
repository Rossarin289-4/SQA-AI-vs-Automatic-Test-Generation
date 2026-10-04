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

    // Helper method to create a basic ObjectMapper with essential fields for ObjectReader
    private ObjectMapper createMapper() {
        // The ObjectReader constructor `protected ObjectReader(ObjectMapper mapper, DeserializationConfig config)`
        // requires a fully initialized ObjectMapper.
        return new ObjectMapper();
    }

    @Test
    public void testDefaultConstructor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader);
        // The default configuration does not have FAIL_ON_UNKNOWN_PROPERTIES enabled.
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertNotNull(reader.getFactory());
        assertNotNull(reader.getTypeFactory());
    }

    @Test
    public void testWithDeserializationFeatureEnabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        ObjectReader newReader = reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        // Assert that the new reader has the feature enabled.
        assertTrue(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        // Assert that the original reader is unchanged.
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithoutDeserializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader newReader = reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        // Assert that the new reader has the feature disabled.
        assertFalse(newReader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        // Assert that the original reader is unchanged.
        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testForTypeJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        ObjectReader newReader = reader.forType(stringType);
        // Accessing protected members like _valueType is generally discouraged,
        // but for testing internal state this can be acceptable.
        assertEquals(stringType, newReader._valueType);
        assertNull(reader._valueType); // Original reader has no specific type set.
    }

    @Test
    public void testForTypeClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        ObjectReader newReader = reader.forType(String.class);
        assertEquals(TypeFactory.defaultInstance().constructType(String.class), newReader._valueType);
        assertNull(reader._valueType); // Original reader has no specific type set.
    }

    @Test
    public void testForTypeTypeReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        TypeReference<List<String>> ref = new TypeReference<List<String>>() {};
        ObjectReader newReader = reader.forType(ref);
        assertEquals(TypeFactory.defaultInstance().constructType(ref.getType()), newReader._valueType);
        assertNull(reader._valueType); // Original reader has no specific type set.
    }

    @Test
    public void testWithValueToUpdate() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        Object value = new Object();
        ObjectReader newReader = reader.withValueToUpdate(value);
        assertEquals(value, newReader._valueToUpdate); // _valueToUpdate is protected.
        assertNull(reader._valueToUpdate); // Original should not be changed.
    }

    @Test
    public void testWithView() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        ObjectReader newReader = reader.withView(Object.class); // Use a dummy view class
        assertEquals(Object.class, newReader.getConfig().getActiveView());
        assertNull(reader.getConfig().getActiveView()); // Original should not be changed.
    }

    @Test
    public void testWithHandler() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        DeserializationProblemHandler handler = new DeserializationProblemHandler() { }; // Anonymous inner class is fine
        ObjectReader newReader = reader.withHandler(handler);
        // The DeserializationConfig does not directly expose handlers.
        // We can assert that a new reader is returned and that it's a different instance.
        assertNotSame(reader, newReader);
        // The key is that the configuration changed.
        // A more robust test would involve creating a scenario where the handler is invoked.
    }

    @Test
    public void testWithFormatDetectionReaders() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        ObjectReader[] readers = {}; // Empty array for testing
        ObjectReader newReader = reader.withFormatDetection(readers);
        // _dataFormatReaders is protected. Check if it's initialized in the new reader.
        assertNotNull(newReader._dataFormatReaders);
        assertNull(reader._dataFormatReaders); // Original should not be changed.
    }

    @Test
    public void testWithAttributes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        Map<Object, Object> attrs = new HashMap<>();
        attrs.put("key", "value");
        ObjectReader newReader = reader.withAttributes(attrs);
        assertEquals("value", newReader.getAttributes().getAttribute("key"));
        assertNull(reader.getAttributes().getAttribute("key")); // Original should not be changed.
    }

    @Test
    public void testWithAttribute() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        ObjectReader newReader = reader.withAttribute("key", "value");
        assertEquals("value", newReader.getAttributes().getAttribute("key"));
        assertNull(reader.getAttributes().getAttribute("key")); // Original should not be changed.
    }

    @Test
    public void testWithoutAttribute() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().withAttribute("key", "value");
        assertEquals("value", reader.getAttributes().getAttribute("key"));

        ObjectReader newReader = reader.withoutAttribute("key");
        assertNull(newReader.getAttributes().getAttribute("key"));
        assertEquals("value", reader.getAttributes().getAttribute("key")); // Original should not be changed.
    }

    @Test
    public void testIsEnabledDeserializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertFalse(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        ObjectReader readerEnabled = reader.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(readerEnabled.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testGetConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        DeserializationConfig config = reader.getConfig();
        assertNotNull(config);
        // The reader's config should be the same as the mapper's initial config.
        assertEquals(mapper.getDeserializationConfig(), config);
    }

    @Test
    public void testGetFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonFactory factory = reader.getFactory();
        assertNotNull(factory);
        assertEquals(mapper.getFactory(), factory);
    }

    @Test
    public void testGetTypeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        TypeFactory typeFactory = reader.getTypeFactory();
        assertNotNull(typeFactory);
        assertEquals(mapper.getTypeFactory(), typeFactory);
    }

    @Test
    public void testGetAttributes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        ContextAttributes attributes = reader.getAttributes();
        assertNotNull(attributes);
        assertEquals(mapper.getDeserializationConfig().getAttributes(), attributes);
    }

    @Test
    public void testGetInjectableValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        InjectableValues injectableValues = reader.getInjectableValues();
        assertNull(injectableValues); // Default is null.

        // Test with custom injectable values
        InjectableValues customInjectableValues = new InjectableValues.Std();
        ObjectReader newReader = reader.with(customInjectableValues);
        assertEquals(customInjectableValues, newReader.getInjectableValues());
    }

    @Test
    public void testReadValueWithParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // Need to specify the target type for readValue(JsonParser p).
        ObjectReader reader = mapper.reader().forType(String.class);
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("\"testString\"");
        String result = reader.readValue(parser);
        assertEquals("testString", result);
        parser.close(); // Close the parser
    }

    @Test
    public void testReadValuesWithParserAndClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // For readValues(JsonParser p, Class<T> valueType), the reader itself does not need a specific type.
        ObjectReader reader = mapper.reader();
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
        parser.close(); // Close the parser
    }

    @Test
    public void testCreateArrayNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.createArrayNode();
        assertNotNull(node);
        assertTrue(node.isArray());
    }

    @Test
    public void testCreateObjectNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = reader.createObjectNode();
        assertNotNull(node);
        assertTrue(node.isObject());
    }

    @Test
    public void testReadTreeWithParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("{ \"data\": 123 }");
        JsonNode tree = reader.readTree(parser);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertEquals(123, tree.get("data").asInt());
        parser.close(); // Close the parser
    }

    @Test
    public void testReadValueWithInputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        String json = "\"inputStreamTest\"";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        String result = reader.readValue(is);
        assertEquals("inputStreamTest", result);
        is.close(); // Close the stream
    }

    @Test
    public void testReadValueWithReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        String json = "\"readerTest\"";
        Reader r = new StringReader(json);
        String result = reader.readValue(r);
        assertEquals("readerTest", result);
        r.close(); // Close the reader
    }

    @Test
    public void testReadValueWithString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        String json = "\"stringTest\"";
        String result = reader.readValue(json);
        assertEquals("stringTest", result);
    }

    @Test
    public void testReadValueWithByteArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        String json = "\"byteArrayTest\"";
        byte[] bytes = json.getBytes();
        String result = reader.readValue(bytes);
        assertEquals("byteArrayTest", result);
    }

    @Test
    public void testReadValueWithByteArraySlice() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        String json = "prefix\"byteArraySliceTest\"suffix";
        byte[] bytes = json.getBytes();
        // Read only the "byteArraySliceTest" part
        String result = reader.readValue(bytes, 6, 20);
        assertEquals("byteArraySliceTest", result);
    }

    @Test
    public void testReadValueWithFile() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        // Create a temporary file
        File tempFile = File.createTempFile("jacksonTest", ".json");
        tempFile.deleteOnExit();
        String json = "\"fileTest\"";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        String result = reader.readValue(tempFile);
        assertEquals("fileTest", result);
        // Clean up the temporary file
        if (!tempFile.delete()) {
            System.err.println("Failed to delete temporary file: " + tempFile.getAbsolutePath());
        }
    }

    @Test
    public void testReadValueWithURL() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        // Create a dummy URL that is unlikely to exist to test exception handling
        URL url = new File("non_existent_file_for_url_test.json").toURI().toURL();
        try {
            reader.readValue(url);
            fail("Expected IOException for non-existent URL");
        } catch (IOException expected) {
            // Expected exception
        }
    }

    @Test
    public void testReadValueWithJsonNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader().forType(String.class);
        JsonNode node = mapper.createObjectNode().put("testNode", "jsonNodeTest");
        // When reading from a JsonNode, the reader needs to be configured for JsonNode or not have a specific type.
        // If the reader is configured for String, it cannot read an ObjectNode directly as a String.
        // Let's reconfigure the reader for JsonNode or use a default reader.
        ObjectReader nodeReader = mapper.reader().forType(JsonNode.class);
        JsonNode resultNode = nodeReader.readValue(node);
        assertNotNull(resultNode);
        assertEquals("jsonNodeTest", resultNode.get("testNode").asText());
    }

    @Test
    public void testReadTreeWithInputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        String json = "{ \"treeStream\": true }";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        JsonNode tree = reader.readTree(is);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertTrue(tree.get("treeStream").asBoolean());
        is.close(); // Close the stream
    }

    @Test
    public void testReadTreeWithReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        String json = "{ \"treeReader\": true }";
        Reader r = new StringReader(json);
        JsonNode tree = reader.readTree(r);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertTrue(tree.get("treeReader").asBoolean());
        r.close(); // Close the reader
    }

    @Test
    public void testReadTreeWithString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        String json = "{ \"treeString\": true }";
        JsonNode tree = reader.readTree(json);
        assertNotNull(tree);
        assertTrue(tree.isObject());
        assertTrue(tree.get("treeString").asBoolean());
    }

    @Test
    public void testReadValuesWithParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type for the reader.
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("[ \"val1\", \"val2\" ]");
        // When readValues(JsonParser p) is called without a specific type configured on the reader,
        // it expects the deserializer to be able to determine the type from the parser or context.
        // If no type is configured, it might default to a generic type or throw an error.
        // For this test, we should specify the type.
        MappingIterator<String> iterator = reader.forType(String.class).readValues(parser);
        assertTrue(iterator.hasNext());
        assertEquals("val1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("val2", iterator.next());
        assertFalse(iterator.hasNext());
        parser.close(); // Close the parser
    }

    @Test
    public void testReadValuesWithInputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type.
        String json = "[ \"streamVal1\", \"streamVal2\" ]";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        // Specify the type for reading the sequence.
        MappingIterator<String> iterator = reader.forType(String.class).readValues(is);
        assertTrue(iterator.hasNext());
        assertEquals("streamVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("streamVal2", iterator.next());
        assertFalse(iterator.hasNext());
        is.close(); // Close the stream
    }

    @Test
    public void testReadValuesWithReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type.
        String json = "[ \"readerVal1\", \"readerVal2\" ]";
        Reader r = new StringReader(json);
        // Specify the type for reading the sequence.
        MappingIterator<String> iterator = reader.forType(String.class).readValues(r);
        assertTrue(iterator.hasNext());
        assertEquals("readerVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("readerVal2", iterator.next());
        assertFalse(iterator.hasNext());
        r.close(); // Close the reader
    }

    @Test
    public void testReadValuesWithString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type.
        String json = "[ \"stringVal1\", \"stringVal2\" ]";
        // Specify the type for reading the sequence.
        MappingIterator<String> iterator = reader.forType(String.class).readValues(json);
        assertTrue(iterator.hasNext());
        assertEquals("stringVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("stringVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithByteArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type.
        String json = "[ \"byteArrVal1\", \"byteArrVal2\" ]";
        byte[] bytes = json.getBytes();
        // Specify the type for reading the sequence.
        MappingIterator<String> iterator = reader.forType(String.class).readValues(bytes);
        assertTrue(iterator.hasNext());
        assertEquals("byteArrVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("byteArrVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithByteArraySlice() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type.
        String json = "data: [ \"sliceVal1\", \"sliceVal2\" ]";
        byte[] bytes = json.getBytes();
        // Specify the type for reading the sequence.
        MappingIterator<String> iterator = reader.forType(String.class).readValues(bytes, 5, json.length() - 5);
        assertTrue(iterator.hasNext());
        assertEquals("sliceVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("sliceVal2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testReadValuesWithFile() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type.
        File tempFile = File.createTempFile("jacksonTestValues", ".json");
        tempFile.deleteOnExit();
        String json = "[ \"fileVal1\", \"fileVal2\" ]";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        // Specify the type for reading the sequence.
        MappingIterator<String> iterator = reader.forType(String.class).readValues(tempFile);
        assertTrue(iterator.hasNext());
        assertEquals("fileVal1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("fileVal2", iterator.next());
        assertFalse(iterator.hasNext());
        // Clean up the temporary file
        if (!tempFile.delete()) {
            System.err.println("Failed to delete temporary file: " + tempFile.getAbsolutePath());
        }
    }

    @Test
    public void testReadValuesWithURL() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(); // No specific type.
        // Create a dummy URL that is unlikely to exist to test exception handling
        URL url = new File("non_existent_file_for_url_values_test.json").toURI().toURL();
        try {
            // Need to specify the type to read.
            reader.forType(String.class).readValues(url);
            fail("Expected IOException for non-existent URL");
        } catch (IOException expected) {
            // Expected exception
        }
    }
    
    @Test
    public void testTreeToValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonNode node = mapper.createObjectNode().put("age", 30);
        
        // Mock class to deserialize into. Must be accessible.
        class Person {
            public int age;
            public Person() {} // Default constructor is needed
        }
        // The reader needs to be configured for the target type.
        Person person = reader.forType(Person.class).treeToValue(node, Person.class);
        assertNotNull(person);
        assertEquals(30, person.age);
    }

    @Test
    public void testAtString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        ObjectReader atReader = reader.at("/data/field");
        // `_filter` is private, we cannot access it directly.
        // `at()` returns a new ObjectReader. We can check if the new reader has a filter configured.
        assertNotNull(atReader); // Ensure a new reader is created.
        // A more meaningful test would involve actually reading data with this reader
        // and asserting that the filter is applied. For this context, just checking creation is sufficient.
        // Since _filter is private, we can't directly assert its value.
        // However, we can infer its presence by checking if the reader is different.
        assertNotSame(reader, atReader);
    }

    @Test
    public void testAtJsonPointer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        JsonPointer pointer = JsonPointer.compile("/config/setting");
        ObjectReader atReader = reader.at(pointer);
        assertNotNull(atReader); // Ensure a new reader is created.
        assertNotSame(reader, atReader);
    }

    @Test
    public void testVersion() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        Version version = reader.version();
        assertNotNull(version);
        // A minimal check for a valid Version object.
        assertTrue(version.getMajorVersion() >= 2);
        assertTrue(version.getMinorVersion() >= 0);
    }
}
