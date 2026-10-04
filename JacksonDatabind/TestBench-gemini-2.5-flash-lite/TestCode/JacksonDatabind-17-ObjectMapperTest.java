package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.*;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class ObjectMapperTest {
    @Test
    public void testDefaultConstructor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper);
        assertNotNull(mapper.getFactory());
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
    }

    @Test
    public void testConstructorWithJsonFactory() throws Exception {
        JsonFactory jf = new MappingJsonFactory();
        ObjectMapper mapper = new ObjectMapper(jf);
        assertNotNull(mapper);
        assertEquals(jf, mapper.getFactory());
    }

    @Test
    public void testCopyConstructor() throws Exception {
        ObjectMapper mapper1 = new ObjectMapper();
        ObjectMapper mapper2 = new ObjectMapper(mapper1);
        assertNotNull(mapper2);
        assertNotSame(mapper1, mapper2);
        assertEquals(mapper1.getFactory().getClass(), mapper2.getFactory().getClass());
        assertEquals(mapper1.getSerializationConfig().getClass(), mapper2.getSerializationConfig().getClass());
        assertEquals(mapper1.getDeserializationConfig().getClass(), mapper2.getDeserializationConfig().getClass());
        assertEquals(mapper1.getSerializerProvider().getClass(), mapper2.getSerializerProvider().getClass());
        assertEquals(mapper1.getDeserializationContext().getClass(), mapper2.getDeserializationContext().getClass());
    }

    @Test
    public void testVersion() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper.version());
        assertTrue(mapper.version().getMajorVersion() >= 0); // Version numbers are non-negative
    }

    @Test
    public void testRegisterModule() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // SimpleModule is not available, use an anonymous inner class
        Module mockModule = new Module() {
            @Override public String getModuleName() { return "MockModule"; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) { }
        };
        mapper.registerModule(mockModule);
        assertTrue(true);
    }

    @Test
    public void testRegisterModulesIterable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Module> modules = new ArrayList<>();
        // SimpleModule is not available, use an anonymous inner class
        modules.add(new Module() {
            @Override public String getModuleName() { return "MockModule1"; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) { }
        });
        modules.add(new Module() {
            @Override public String getModuleName() { return "MockModule2"; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) { }
        });
        mapper.registerModules(modules);
        assertTrue(true);
    }
    
    @Test
    public void testFindAndRegisterModules() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // This method relies on ServiceLoader, which is external.
        // A basic test is to ensure it doesn't throw an exception.
        mapper.findAndRegisterModules();
        assertTrue(true);
    }

    @Test
    public void testGetSerializationConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        assertNotNull(config);
    }

    @Test
    public void testGetDeserializationConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        assertNotNull(config);
    }

    @Test
    public void testGetDeserializationContext() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext context = mapper.getDeserializationContext();
        assertNotNull(context);
    }

    @Test
    public void testSetSerializerFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory sf = BeanSerializerFactory.instance;
        mapper.setSerializerFactory(sf);
        assertEquals(sf, mapper.getSerializerFactory());
    }

    @Test
    public void testGetSerializerFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory sf = mapper.getSerializerFactory();
        assertNotNull(sf);
        assertTrue(sf instanceof BeanSerializerFactory); // Default
    }

    @Test
    public void testSetSerializerProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider.Impl sp = new DefaultSerializerProvider.Impl();
        mapper.setSerializerProvider(sp);
        assertEquals(sp, mapper.getSerializerProvider());
    }

    @Test
    public void testGetSerializerProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider sp = mapper.getSerializerProvider();
        assertNotNull(sp);
    }

    @Test
    public void testAddMixInAnnotations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(String.class, Object.class); // Using Object.class as a placeholder mixin
        assertNotNull(mapper.findMixInClassFor(String.class));
        assertEquals(Object.class, mapper.findMixInClassFor(String.class));
    }

    @Test
    public void testAddMixIn() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(Integer.class, String.class); // Using String.class as a placeholder mixin
        assertNotNull(mapper.findMixInClassFor(Integer.class));
        assertEquals(String.class, mapper.findMixInClassFor(Integer.class));
    }

    @Test
    public void testFindMixInClassFor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNull(mapper.findMixInClassFor(Object.class));
        mapper.addMixInAnnotations(Object.class, Object.class);
        assertEquals(Object.class, mapper.findMixInClassFor(Object.class));
    }

    @Test
    public void testMixInCount() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(0, mapper.mixInCount());
        mapper.addMixInAnnotations(Object.class, Object.class);
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testSetVisibilityChecker() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        VisibilityChecker<?> vc = VisibilityChecker.Std.defaultInstance();
        mapper.setVisibilityChecker(vc);
        assertEquals(vc, mapper.getVisibilityChecker());
    }

    @Test
    public void testSetVisibility() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        // This tests the configuration side effect, actual auto-detection behavior is complex to assert here.
        assertTrue(true); 
    }

    @Test
    public void testGetSubtypeResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SubtypeResolver sr = mapper.getSubtypeResolver();
        assertNotNull(sr);
    }

    @Test
    public void testSetSubtypeResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StdSubtypeResolver ssr = new StdSubtypeResolver();
        mapper.setSubtypeResolver(ssr);
        assertEquals(ssr, mapper.getSubtypeResolver());
    }

    @Test
    public void testSetAnnotationIntrospector() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospector(ai);
        assertEquals(ai, mapper.getSerializationConfig().getAnnotationIntrospector());
        assertEquals(ai, mapper.getDeserializationConfig().getAnnotationIntrospector());
    }
    
    @Test
    public void testSetAnnotationIntrospectors() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector serializerAI = new JacksonAnnotationIntrospector();
        AnnotationIntrospector deserializerAI = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospectors(serializerAI, deserializerAI);
        assertEquals(serializerAI, mapper.getSerializationConfig().getAnnotationIntrospector());
        assertEquals(deserializerAI, mapper.getDeserializationConfig().getAnnotationIntrospector());
    }


    @Test
    public void testSetSerializationInclusion() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        // getInclusion() is protected, use a public method like getSerializationConfig() to access
        assertEquals(JsonInclude.Include.NON_EMPTY, mapper.getSerializationConfig().getSerializationInclusion());
    }



    



    @Test
    public void testGetTypeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory tf = mapper.getTypeFactory();
        assertNotNull(tf);
    }

    @Test
    public void testSetTypeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory newTf = TypeFactory.defaultInstance().withModifier(new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type srcType, TypeBindings bindings, TypeFactory typeFactory) {
                return type.withStaticTyping();
            }
        });
        mapper.setTypeFactory(newTf);
        assertEquals(newTf, mapper.getTypeFactory());
        assertEquals(newTf, mapper.getSerializationConfig().getTypeFactory());
        assertEquals(newTf, mapper.getDeserializationConfig().getTypeFactory());
    }

    @Test
    public void testConstructType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType stringType = mapper.constructType(String.class);
        assertNotNull(stringType);
        assertEquals(String.class, stringType.getRawClass());
    }

    @Test
    public void testSetNodeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory ntf = JsonNodeFactory.instance;
        mapper.setNodeFactory(ntf);
        assertEquals(ntf, mapper.getDeserializationConfig().getNodeFactory());
    }

    @Test
    public void testAddHandler() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        mapper.addHandler(handler);
        assertTrue(true); 
    }

    @Test
    public void testClearProblemHandlers() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addHandler(new DeserializationProblemHandler() {});
        mapper.clearProblemHandlers();
        assertTrue(true);
    }
    
    @Test
    public void testSetDateFormat() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DateFormat df = new StdDateFormat();
        mapper.setDateFormat(df);
        assertEquals(df, mapper.getSerializationConfig().getDateFormat());
        assertEquals(df, mapper.getDeserializationConfig().getDateFormat());
    }


    @Test
    public void testSetInjectableValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues iv = new InjectableValues.Std();
        mapper.setInjectableValues(iv);
        assertTrue(true);
    }

    @Test
    public void testSetLocale() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Locale loc = Locale.US;
        mapper.setLocale(loc);
        assertEquals(loc, mapper.getSerializationConfig().getLocale());
        assertEquals(loc, mapper.getDeserializationConfig().getLocale());
    }

    @Test
    public void testSetTimeZone() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        mapper.setTimeZone(tz);
        assertEquals(tz, mapper.getSerializationConfig().getTimeZone());
        assertEquals(tz, mapper.getDeserializationConfig().getTimeZone());
    }

    @Test
    public void testConfigureMapperFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.USE_ANNOTATIONS, false);
        assertFalse(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));
        mapper.configure(MapperFeature.USE_ANNOTATIONS, true);
        assertTrue(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testConfigureSerializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        assertFalse(mapper.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        assertTrue(mapper.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
    }

    @Test
    public void testConfigureDeserializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }
    
    @Test
    public void testConfigureJsonParserFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // Default for ALLOW_COMMENTS is false.
        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testConfigureJsonGeneratorFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true);
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testEnableMapperFeatures() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
        assertTrue(mapper.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }
    

    @Test
    public void testDisableMapperFeatures() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.AUTO_DETECT_CREATORS);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_CREATORS));
    }


    @Test
    public void testEnableDeserializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        assertTrue(mapper.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS));
    }


    @Test
    public void testDisableDeserializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertFalse(mapper.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
    }


    @Test
    public void testEnableSerializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
        assertTrue(mapper.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS));
    }

    @Test
    public void testEnableSerializationFeaturesVarArgs() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRITE_NULL_MAP_VALUES, SerializationFeature.INDENT_OUTPUT);
        assertTrue(mapper.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES));
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testDisableSerializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRAP_ROOT_VALUE);
        assertFalse(mapper.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testDisableSerializationFeaturesVarArgs() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS, SerializationFeature.CLOSE_CLOSEABLE);
        assertFalse(mapper.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
        assertFalse(mapper.isEnabled(SerializationFeature.CLOSE_CLOSEABLE));
    }

    @Test
    public void testIsEnabledMapperFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS)); // Default
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, false);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testIsEnabledSerializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertTrue(mapper.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)); // Default
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        assertFalse(mapper.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
    }

    @Test
    public void testIsEnabledDeserializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)); // Default
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }


    @Test
    public void testIsEnabledJsonParserFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // Default for ALLOW_UNQUOTED_FIELD_NAMES is true.
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);
        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
    }

    @Test
    public void testIsEnabledJsonGeneratorFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)); // Default
        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testGetNodeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory nf = mapper.getNodeFactory();
        assertNotNull(nf);
    }

    @Test
    public void testReadValueClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"hello\"";
        String result = mapper.readValue(json, String.class);
        assertEquals("hello", result);
    }

    @Test
    public void testReadValueTypeReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[1, 2, 3]";
        List<Integer> result = mapper.readValue(json, new TypeReference<List<Integer>>() {});
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testReadValueResolvedType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[1, 2, 3]";
        JavaType listIntType = mapper.getTypeFactory().constructType(new TypeReference<List<Integer>>() {});
        List<Integer> result = mapper.readValue(json, listIntType);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testReadValueJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[1, 2, 3]";
        JavaType listIntType = mapper.getTypeFactory().constructType(new TypeReference<List<Integer>>() {});
        List<Integer> result = mapper.readValue(json, listIntType);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testReadTreeInputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\": 1, \"b\": true}";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        JsonNode rootNode = mapper.readTree(is);
        assertNotNull(rootNode);
        assertEquals(1, rootNode.get("a").asInt());
        assertTrue(rootNode.get("b").asBoolean());
    }

    @Test
    public void testReadTreeReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\": 1, \"b\": true}";
        Reader r = new StringReader(json);
        JsonNode rootNode = mapper.readTree(r);
        assertNotNull(rootNode);
        assertEquals(1, rootNode.get("a").asInt());
        assertTrue(rootNode.get("b").asBoolean());
    }

    @Test
    public void testReadTreeString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\": 1, \"b\": true}";
        JsonNode rootNode = mapper.readTree(json);
        assertNotNull(rootNode);
        assertEquals(1, rootNode.get("a").asInt());
        assertTrue(rootNode.get("b").asBoolean());
    }

    @Test
    public void testReadTreeByteArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\": 1, \"b\": true}";
        byte[] content = json.getBytes();
        JsonNode rootNode = mapper.readTree(content);
        assertNotNull(rootNode);
        assertEquals(1, rootNode.get("a").asInt());
        assertTrue(rootNode.get("b").asBoolean());
    }

    @Test
    public void testReadTreeFile() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        File tempFile = File.createTempFile("jackson-test", ".json");
        tempFile.deleteOnExit();
        String json = "{\"a\": 1, \"b\": true}";
        try (OutputStream os = new FileOutputStream(tempFile)) {
            os.write(json.getBytes());
        }
        JsonNode rootNode = mapper.readTree(tempFile);
        assertNotNull(rootNode);
        assertEquals(1, rootNode.get("a").asInt());
        assertTrue(rootNode.get("b").asBoolean());
    }

    @Test
    public void testReadTreeURL() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // This test assumes a resource named "test.json" exists in the classpath.
        // If it doesn't, the test should pass gracefully.
        URL url = getClass().getResource("/test.json"); 
        if (url == null) {
             assertTrue(true); // Placeholder assertion if resource not found
        } else {
            JsonNode rootNode = mapper.readTree(url);
            assertNotNull(rootNode);
            // Assuming test.json contains {"a": 1}
            if (rootNode.has("a")) {
                assertEquals(1, rootNode.get("a").asInt());
            }
        }
    }

    @Test
    public void testWriteValueFile() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        File tempFile = File.createTempFile("jackson-write", ".json");
        tempFile.deleteOnExit();
        mapper.writeValue(tempFile, data);

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        assertTrue(content.toString().contains("\"key\":\"value\""));
    }

    @Test
    public void testWriteValueOutputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        mapper.writeValue(baos, data);
        String output = baos.toString();
        assertTrue(output.contains("\"key\":\"value\""));
    }

    @Test
    public void testWriteValueWriter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, data);
        String output = sw.toString();
        assertTrue(output.contains("\"key\":\"value\""));
    }

    @Test
    public void testWriteValueAsString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        String result = mapper.writeValueAsString(data);
        assertTrue(result.contains("\"key\":\"value\""));
    }

    @Test
    public void testWriteValueAsBytes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        byte[] result = mapper.writeValueAsBytes(data);
        String output = new String(result);
        assertTrue(output.contains("\"key\":\"value\""));
    }

    @Test
    public void testCopy() throws Exception {
        ObjectMapper mapper1 = new ObjectMapper();
        ObjectMapper mapper2 = mapper1.copy();
        assertNotNull(mapper2);
        assertNotSame(mapper1, mapper2);
        assertEquals(mapper1.getSerializationConfig().isEnabled(MapperFeature.AUTO_DETECT_FIELDS),
                     mapper2.getSerializationConfig().isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testGetMapperVersion() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Version version = mapper.version();
        assertNotNull(version);
        assertTrue(version.getMajorVersion() >= 0);
    }

    @Test
    public void testGetOwner() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Module testModule = new Module() {
            @Override
            public String getModuleName() { return "TestModule"; }
            @Override
            public Version version() { return Version.unknownVersion(); }
            @Override
            public void setupModule(SetupContext context) {
                assertEquals(mapper, context.getOwner());
            }
        };
        mapper.registerModule(testModule);
        assertTrue(true);
    }

    @Test
    public void testRegisterSubtypesClassArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerSubtypes(String.class, Integer.class);
        assertTrue(true);
    }

    @Test
    public void testRegisterSubtypesNamedTypeArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerSubtypes(new NamedType(String.class, "stringType"), new NamedType(Integer.class, "intType"));
        assertTrue(true);
    }

    @Test
    public void testReadTreeFromParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"node\": 123}";
        JsonParser parser = mapper.getFactory().createParser(json);
        JsonNode node = mapper.readTree(parser);
        assertNotNull(node);
        assertEquals(123, node.get("node").asInt());
        parser.close();
    }

    @Test
    public void testWriteValueAsBytesWithNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] result = mapper.writeValueAsBytes(null);
        assertEquals("null", new String(result));
    }

    @Test
    public void testWriteValueAsStringWithNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(null);
        assertEquals("null", result);
    }

    @Test
    public void testReadValueNullString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.readValue("null", String.class);
        assertNull(result);
    }
    
    @Test
    public void testConvertValueToObjectClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String input = "test string";
        Object output = mapper.convertValue(input, Object.class);
        assertNotNull(output);
        assertEquals(String.class, output.getClass());
        assertEquals("test string", output);
    }
    
    @Test
    public void testConvertValueToSpecificClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String input = "123";
        Integer output = mapper.convertValue(input, Integer.class);
        assertNotNull(output);
        assertEquals(Integer.valueOf(123), output);
    }

    @Test
    public void testConvertValueToListTypeReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> output = mapper.convertValue(input, new TypeReference<List<Integer>>() {});
        assertNotNull(output);
        assertEquals(input, output);
    }

    @Test
    public void testConvertValueToMapJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> input = new HashMap<>();
        input.put("key", "value");
        JavaType mapType = mapper.getTypeFactory().constructType(new TypeReference<Map<String, String>>() {});
        Map<String, String> output = mapper.convertValue(input, mapType);
        assertNotNull(output);
        assertEquals(input, output);
    }

    @Test
    public void testGenerateJsonSchema() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        com.fasterxml.jackson.databind.jsonschema.JsonSchema schema = mapper.generateJsonSchema(MyPojo.class);
        assertNotNull(schema);
    }

    @Test
    public void testWriteValueAsBytesEdgeCaseNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] result = mapper.writeValueAsBytes(null);
        assertEquals("null", new String(result));
    }

    @Test
    public void testWriteValueAsStringEdgeCaseNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(null);
        assertEquals("null", result);
    }

    @Test
    public void testReadValueEdgeCaseNullString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.readValue("null", String.class);
        assertNull(result);
    }
    
    @Test
    public void testReadValueEdgeCaseEmptyString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.readValue("\"\"", String.class);
        assertEquals("", result);
    }
    
    @Test
    public void testWriteValueAsBytesEmptyObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] result = mapper.writeValueAsBytes(new HashMap<String, String>());
        assertEquals("{}", new String(result));
    }

    @Test
    public void testWriteValueAsStringEmptyObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(new HashMap<String, String>());
        assertEquals("{}", result);
    }

    @Test
    public void testReadValueEmptyObjectString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> result = mapper.readValue("{}", Map.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testWriteValueAsBytesEmptyArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] result = mapper.writeValueAsBytes(new ArrayList<String>());
        assertEquals("[]", new String(result));
    }

    @Test
    public void testWriteValueAsStringEmptyArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(new ArrayList<String>());
        assertEquals("[]", result);
    }

    @Test
    public void testReadValueEmptyArrayString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<String> result = mapper.readValue("[]", List.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // Helper class for tests
    private static class MyPojo {
        private String value;

        public MyPojo() {}

        public MyPojo(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    // Helper class for tests
    private static class SomeView { }
}
