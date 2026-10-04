package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;
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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;


public class ObjectMapperTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSimpleStringRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"hello\"";
        String result = mapper.readValue(json, String.class);
        assertEquals("hello", result);
    }

    @Test
    public void testSimpleIntRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "123";
        Integer result = mapper.readValue(json, Integer.class);
        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void testSimpleBooleanTrueRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "true";
        Boolean result = mapper.readValue(json, Boolean.class);
        assertTrue(result);
    }

    @Test
    public void testSimpleBooleanFalseRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "false";
        Boolean result = mapper.readValue(json, Boolean.class);
        assertFalse(result);
    }

    @Test
    public void testSimpleNullRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "null";
        String result = mapper.readValue(json, String.class);
        assertNull(result);
    }

    @Test
    public void testSimpleDoubleRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "123.45";
        Double result = mapper.readValue(json, Double.class);
        assertEquals(Double.valueOf(123.45), result, 1e-9);
    }

    @Test
    public void testSimpleFloatRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "123.45";
        Float result = mapper.readValue(json, Float.class);
        assertEquals(Float.valueOf(123.45f), result, 1e-9f);
    }

    @Test
    public void testSimpleBigDecimalRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "123.4567890123456789";
        BigDecimal result = mapper.readValue(json, BigDecimal.class);
        assertEquals(new BigDecimal("123.4567890123456789"), result);
    }
    
    @Test
    public void testSimpleBigIntegerRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "12345678901234567890";
        BigInteger result = mapper.readValue(json, BigInteger.class);
        assertEquals(new BigInteger("12345678901234567890"), result);
    }

    @Test
    public void testEmptyArrayRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[]";
        List<String> result = mapper.readValue(json, List.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testEmptyObjectRead() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{}";
        Map<String, String> result = mapper.readValue(json, Map.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testReadTreeSimpleString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"test\"";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isTextual());
        assertEquals("test", node.textValue());
    }

    @Test
    public void testReadTreeSimpleNumber() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "123";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isIntegralNumber());
        assertEquals(123, node.intValue());
    }

    @Test
    public void testReadTreeSimpleBoolean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "true";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isBoolean());
        assertTrue(node.booleanValue());
    }

    @Test
    public void testReadTreeSimpleNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "null";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isNull());
    }

    @Test
    public void testReadTreeArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[1, \"two\", false]";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isArray());
        assertEquals(3, node.size());
        assertEquals(1, node.get(0).intValue());
        assertEquals("two", node.get(1).textValue());
        assertFalse(node.get(2).booleanValue());
    }

    @Test
    public void testReadTreeObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\": 1, \"b\": \"two\"}";
        JsonNode node = mapper.readTree(json);
        assertTrue(node.isObject());
        assertEquals(2, node.size());
        assertEquals(1, node.get("a").intValue());
        assertEquals("two", node.get("b").textValue());
    }
    
    @Test
    public void testWriteValueAsStringSimple() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString("test");
        assertEquals("\"test\"", result);
    }

    @Test
    public void testWriteValueAsStringInteger() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(123);
        assertEquals("123", result);
    }
    
    @Test
    public void testWriteValueAsStringBoolean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(true);
        assertEquals("true", result);
    }

    @Test
    public void testWriteValueAsStringNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(null);
        assertEquals("null", result);
    }

    @Test
    public void testWriteValueAsStringDouble() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(123.45);
        assertEquals("123.45", result);
    }

    @Test
    public void testWriteValueAsStringEmptyList() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(new ArrayList<String>());
        assertEquals("[]", result);
    }

    @Test
    public void testWriteValueAsStringEmptyMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(new HashMap<String, String>());
        assertEquals("{}", result);
    }

    @Test
    public void testCreateObjectNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        assertNotNull(node);
        assertTrue(node.isObject());
    }

    @Test
    public void testCreateArrayNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode node = mapper.createArrayNode();
        assertNotNull(node);
        assertTrue(node.isArray());
    }

    @Test
    public void testTypeFactoryDefaultInstance() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory factory = mapper.getTypeFactory();
        assertNotNull(factory);
        // Check if it's the default instance
        assertSame(TypeFactory.defaultInstance(), factory);
    }

    @Test
    public void testConstructTypeString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.constructType(String.class);
        assertNotNull(javaType);
        assertEquals(String.class, javaType.getRawClass());
    }


    @Test
    public void testSimpleSerializationWithBytes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] data = {1, 2, 3};
        byte[] resultBytes = mapper.writeValueAsBytes(data);
        assertArrayEquals(data, resultBytes);
    }
    
    @Test
    public void testSimpleDeserializationWithBytes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] data = {1, 2, 3};
        byte[] result = mapper.readValue(data, byte[].class);
        assertArrayEquals(data, result);
    }

    @Test
    public void testEmptyByteArraySerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] data = {};
        byte[] resultBytes = mapper.writeValueAsBytes(data);
        assertArrayEquals(data, resultBytes);
    }
    
    @Test
    public void testEmptyByteArrayDeserialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        byte[] data = {};
        byte[] result = mapper.readValue(data, byte[].class);
        assertArrayEquals(data, result);
    }

    @Test
    public void testWriteValueToFile() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = "test content";
        File tempFile = File.createTempFile("jacksonTest", ".txt");
        tempFile.deleteOnExit();
        mapper.writeValue(tempFile, content);

        BufferedReader reader = new BufferedReader(new FileReader(tempFile));
        String line = reader.readLine();
        reader.close();

        assertEquals("\"" + content + "\"", line);
    }

    @Test
    public void testReadValueFromFile() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = "test content to read";
        File tempFile = File.createTempFile("jacksonTest", ".txt");
        tempFile.deleteOnExit();
        mapper.writeValue(tempFile, content);

        String result = mapper.readValue(tempFile, String.class);
        assertEquals(content, result);
    }

    @Test
    public void testWriteStringValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"some string\"";
        String result = mapper.readValue(json, String.class);
        assertEquals("some string", result);
    }

    @Test
    public void testWriteStringValueWithEscapes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"string with \\\"quotes\\\" and \\\\ backslashes\"";
        String result = mapper.readValue(json, String.class);
        assertEquals("string with \"quotes\" and \\ backslashes", result);
    }

    @Test
    public void testWriteIntValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "42";
        Integer result = mapper.readValue(json, Integer.class);
        assertEquals(Integer.valueOf(42), result);
    }

    @Test
    public void testWriteLongValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "9223372036854775807"; // Long.MAX_VALUE
        Long result = mapper.readValue(json, Long.class);
        assertEquals(Long.valueOf(9223372036854775807L), result);
    }

    @Test
    public void testWriteMaxValueLong() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "9223372036854775807"; // Long.MAX_VALUE
        Long result = mapper.readValue(json, Long.class);
        assertEquals(Long.MAX_VALUE, result.longValue());
    }

    @Test
    public void testWriteMinValueLong() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "-9223372036854775808"; // Long.MIN_VALUE
        Long result = mapper.readValue(json, Long.class);
        assertEquals(Long.MIN_VALUE, result.longValue());
    }

    @Test
    public void testWriteDoubleValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "3.14159";
        Double result = mapper.readValue(json, Double.class);
        assertEquals(Double.valueOf(3.14159), result, 1e-9);
    }

    @Test
    public void testWriteDoubleValueEdgePositiveInfinity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"Infinity\""; // Jackson serializes Double.POSITIVE_INFINITY to "Infinity"
        Double result = mapper.readValue(json, Double.class);
        assertEquals(Double.POSITIVE_INFINITY, result.doubleValue());
    }

    @Test
    public void testWriteDoubleValueEdgeNegativeInfinity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"-Infinity\""; // Jackson serializes Double.NEGATIVE_INFINITY to "-Infinity"
        Double result = mapper.readValue(json, Double.class);
        assertEquals(Double.NEGATIVE_INFINITY, result.doubleValue());
    }
    
    @Test
    public void testWriteDoubleValueEdgeNaN() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"NaN\""; // Jackson serializes Double.NaN to "NaN"
        Double result = mapper.readValue(json, Double.class);
        assertTrue(Double.isNaN(result.doubleValue()));
    }

    @Test
    public void testWriteFloatValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "2.71828f"; // JSON usually doesn't specify 'f'
        Float result = mapper.readValue(json, Float.class);
        assertEquals(Float.valueOf(2.71828f), result, 1e-6f);
    }
    
    @Test
    public void testWriteFloatValueEdgePositiveInfinity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"Infinity\""; // Jackson serializes Float.POSITIVE_INFINITY to "Infinity"
        Float result = mapper.readValue(json, Float.class);
        assertEquals(Float.POSITIVE_INFINITY, result.floatValue());
    }

    @Test
    public void testWriteFloatValueEdgeNegativeInfinity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"-Infinity\""; // Jackson serializes Float.NEGATIVE_INFINITY to "-Infinity"
        Float result = mapper.readValue(json, Float.class);
        assertEquals(Float.NEGATIVE_INFINITY, result.floatValue());
    }
    
    @Test
    public void testWriteFloatValueEdgeNaN() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"NaN\""; // Jackson serializes Float.NaN to "NaN"
        Float result = mapper.readValue(json, Float.class);
        assertTrue(Float.isNaN(result.floatValue()));
    }

    @Test
    public void testWriteBooleanValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "false";
        Boolean result = mapper.readValue(json, Boolean.class);
        assertFalse(result);
    }

    @Test
    public void testWriteNullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "null";
        String result = mapper.readValue(json, String.class);
        assertNull(result);
    }

    @Test
    public void testWriteObjectValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", "test");
        String json = mapper.writeValueAsString(map);
        assertEquals("{\"a\":1,\"b\":\"test\"}", json);
    }

    @Test
    public void testReadObjectValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"a\":1,\"b\":\"test\"}";
        Map<String, Object> result = mapper.readValue(json, Map.class);
        assertEquals(1, result.get("a"));
        assertEquals("test", result.get("b"));
    }

    @Test
    public void testWriteArrayValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Object> list = Arrays.asList(1, "test", true);
        String json = mapper.writeValueAsString(list);
        assertEquals("[1,\"test\",true]", json);
    }

    @Test
    public void testReadArrayValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "[1,\"test\",true]";
        List<Object> result = mapper.readValue(json, List.class);
        assertEquals(1, result.get(0));
        assertEquals("test", result.get(1));
        assertEquals(true, result.get(2));
    }
    
    @Test
    public void testWriteBigDecimalValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigDecimal bd = new BigDecimal("12345.67890123456789");
        String json = mapper.writeValueAsString(bd);
        assertEquals("12345.67890123456789", json);
    }

    @Test
    public void testReadBigDecimalValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "98765.43210987654321";
        BigDecimal result = mapper.readValue(json, BigDecimal.class);
        assertEquals(new BigDecimal("98765.43210987654321"), result);
    }

    @Test
    public void testWriteBigIntegerValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BigInteger bi = new BigInteger("98765432109876543210");
        String json = mapper.writeValueAsString(bi);
        assertEquals("98765432109876543210", json);
    }

    @Test
    public void testReadBigIntegerValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "11223344556677889900";
        BigInteger result = mapper.readValue(json, BigInteger.class);
        assertEquals(new BigInteger("11223344556677889900"), result);
    }

    @Test
    public void testDefaultPrettyPrinter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        String json = mapper.writeValueAsString(map);
        String expected = "{\n  \"a\" : 1,\n  \"b\" : 2\n}";
        assertEquals(expected, json);
    }

    @Test
    public void testTokenBufferSerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer tb = new TokenBuffer(mapper);
        tb.writeStartObject();
        tb.writeFieldName("field");
        tb.writeString("value");
        tb.writeEndObject();

        String json = mapper.writeValueAsString(tb);
        assertEquals("{\"field\":\"value\"}", json);
    }

    @Test
    public void testTokenBufferDeserialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"field\":\"value\"}";
        TokenBuffer tb = mapper.readValue(json, TokenBuffer.class);
        assertNotNull(tb);
        JsonParser parser = tb.asParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("field", parser.nextFieldName());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }
    
    @Test
    public void testMapperCopy() throws Exception {
        ObjectMapper originalMapper = new ObjectMapper();
        originalMapper.enable(SerializationFeature.INDENT_OUTPUT);
        originalMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        ObjectMapper copiedMapper = originalMapper.copy();
        
        assertTrue(copiedMapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertTrue(copiedMapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertNotSame(originalMapper, copiedMapper);
    }
    
    @Test
    public void testEmptyConstructor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper);
        assertTrue(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testConstructorWithJsonFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        assertNotNull(mapper);
    }

    @Test
    public void testDefaultTypingJavaLangObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        
        Map<String, Object> obj = new HashMap<>();
        obj.put("a", 1);
        obj.put("b", "hello");

        String json = mapper.writeValueAsString(obj);
        assertEquals("{\"a\":1,\"b\":\"hello\"}", json);
    }
    
    @Test
    public void testDefaultTypingObjectAndNonConcrete() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        
        Map<String, Object> obj = new HashMap<>();
        obj.put("a", 1);
        obj.put("b", "hello");
        obj.put("c", new ArrayList<String>());

        String json = mapper.writeValueAsString(obj);
        assertEquals("{\"a\":1,\"b\":\"hello\",\"c\":[]}", json);
    }

    @Test
    public void testDefaultTypingNonConcreteAndArrays() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        
        Map<String, Object> obj = new HashMap<>();
        obj.put("a", 1);
        obj.put("b", new ArrayList<String>());
        obj.put("c", new String[]{"x", "y"});

        String json = mapper.writeValueAsString(obj);
        assertEquals("{\"a\":1,\"b\":[],\"c\":[\"x\",\"y\"]}", json);
    }

    @Test
    public void testDefaultTypingNonFinal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        
        Map<String, Object> obj = new HashMap<>();
        obj.put("a", 1);
        obj.put("b", new ArrayList<String>());

        String json = mapper.writeValueAsString(obj);
        // Expected JSON with type information for ArrayList
        assertTrue(json.contains("\"@class\""));
        assertTrue(json.contains("ArrayList"));
    }

    @Test
    public void testSetDateFormat() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // SimpleDateFormat is available in java.text
        DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        
        Date now = new Date();
        String json = mapper.writeValueAsString(now);
        assertNotNull(json);
    }

    @Test
    public void testSetInjectableValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("testKey", "testValue");
        mapper.setInjectableValues(injectables);
        assertNotNull(mapper.getInjectableValues());
    }

    @Test
    public void testSetLocale() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setLocale(Locale.FRANCE);
    }

    @Test
    public void testSetTimeZone() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    @Test
    public void testGetSerializationConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        assertNotNull(config);
        assertTrue(config.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testGetDeserializationConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        assertNotNull(config);
        assertTrue(config.isEnabled(MapperFeature.USE_ANNOTATIONS));
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
        // BeanSerializerFactory is a concrete implementation
        SerializerFactory factory = BeanSerializerFactory.instance;
        mapper.setSerializerFactory(factory);
        assertNotNull(mapper.getSerializerFactory());
        assertSame(factory, mapper.getSerializerFactory());
    }
    
    @Test
    public void testGetSerializerFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory factory = mapper.getSerializerFactory();
        assertNotNull(factory);
        assertTrue(factory instanceof BeanSerializerFactory);
    }

    @Test
    public void testSetSerializerProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider provider = new DefaultSerializerProvider.Impl();
        mapper.setSerializerProvider(provider);
        assertNotNull(mapper.getSerializerProvider());
        assertSame(provider, mapper.getSerializerProvider());
    }

    @Test
    public void testGetSerializerProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof DefaultSerializerProvider.Impl);
    }

    @Test
    public void testAddMixIn() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(Map.class, MyMixinForMap.class);
        assertEquals(1, mapper.mixInCount());
    }
    
    private static class MyMixinForMap {
        @JsonAnyGetter
        public Map<String, Object> getAsMap() { return null; }
    }

    @Test
    public void testFindMixInClassFor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(Map.class, MyMixinForMap.class);
        assertEquals(MyMixinForMap.class, mapper.findMixInClassFor(Map.class));
        assertNull(mapper.findMixInClassFor(List.class));
    }
    
    @Test
    public void testSetVisibilityChecker() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        VisibilityChecker<?> stdChecker = VisibilityChecker.Std.defaultInstance();
        mapper.setVisibilityChecker(stdChecker);
        assertNotNull(mapper.getVisibilityChecker());
    }

    @Test
    public void testSetVisibilityByAccessor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    @Test
    public void testGetSubtypeResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SubtypeResolver resolver = mapper.getSubtypeResolver();
        assertNotNull(resolver);
        assertTrue(resolver instanceof StdSubtypeResolver);
    }

    @Test
    public void testSetSubtypeResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StdSubtypeResolver customResolver = new StdSubtypeResolver();
        mapper.setSubtypeResolver(customResolver);
        assertSame(customResolver, mapper.getSubtypeResolver());
    }
    
    @Test
    public void testSetAnnotationIntrospector() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospector(introspector);
    }

    @Test
    public void testSetAnnotationIntrospectors() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector serializerAI = new JacksonAnnotationIntrospector();
        AnnotationIntrospector deserializerAI = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospectors(serializerAI, deserializerAI);
    }



    @Test
    public void testSetSerializationInclusion() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testSetDefaultPrettyPrinter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PrettyPrinter pp = new DefaultPrettyPrinter();
        mapper.setDefaultPrettyPrinter(pp);
    }
    
    @Test
    public void testEnableDefaultTypingAsProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTypingAsProperty(ObjectMapper.DefaultTyping.NON_FINAL, "typeInfo");
    }

    @Test
    public void testDisableDefaultTyping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();
        mapper.disableDefaultTyping();
    }

    @Test
    public void testSetDefaultTyping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeResolverBuilder<?> typer = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        mapper.setDefaultTyping(typer);
    }

    @Test
    public void testSetTypeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory newFactory = TypeFactory.defaultInstance().withModifier(new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type javaType, TypeBindings bindings, TypeFactory typeFactory) {
                return typeFactory.constructParametricType(List.class, String.class);
            }
        });
        mapper.setTypeFactory(newFactory);
        assertSame(newFactory, mapper.getTypeFactory());
    }

    @Test
    public void testGetNodeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory factory = mapper.getNodeFactory();
        assertNotNull(factory);
        assertTrue(factory instanceof JsonNodeFactory);
    }
    
    @Test
    public void testSetNodeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory newFactory = JsonNodeFactory.instance;
        mapper.setNodeFactory(newFactory);
        assertSame(newFactory, mapper.getNodeFactory());
    }

    @Test
    public void testAddHandler() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addHandler(new DeserializationProblemHandler() {});
    }

    @Test
    public void testClearProblemHandlers() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addHandler(new DeserializationProblemHandler() {});
        mapper.clearProblemHandlers();
    }

    @Test
    public void testSetConfigDeserialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig originalConfig = mapper.getDeserializationConfig();
        DeserializationConfig newConfig = originalConfig.with(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.setConfig(newConfig);
        assertTrue(mapper.getDeserializationConfig().isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
    }

    @Test
    public void testSetFilterProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        FilterProvider filters = new SimpleFilterProvider();
        mapper.setFilterProvider(filters);
    }

    @Test
    public void testSetBase64Variant() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Base64Variant variant = Base64Variants.MODIFIED_FOR_URL;
        mapper.setBase64Variant(variant);
    }
    
    @Test
    public void testSetConfigSerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig originalConfig = mapper.getSerializationConfig();
        SerializationConfig newConfig = originalConfig.with(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        mapper.setConfig(newConfig);
        assertTrue(mapper.getSerializationConfig().isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING));
    }

    @Test
    public void testGetFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory factory = mapper.getFactory();
        assertNotNull(factory);
        assertTrue(factory instanceof MappingJsonFactory);
    }

    @Test
    public void testIsEnabledJsonParserFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }
    
    @Test
    public void testEnableDisableJsonParserFeatures() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        assertTrue(mapper.isEnabled(JsonParser.Feature.STRICT_DUPLICATE_DETECTION));
        mapper.disable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        assertFalse(mapper.isEnabled(JsonParser.Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testIsEnabledJsonGeneratorFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }
    
    @Test
    public void testEnableDisableJsonGeneratorFeatures() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
        mapper.disable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN));
    }

    @Test
    public void testIsEnabledJsonFactoryFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.getFactory().enable(JsonFactory.Feature.INTERN_FIELD_NAMES);
        assertTrue(mapper.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
    }

    @Test
    public void testReadValueFromInputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"input stream test\"";
        InputStream is = new ByteArrayInputStream(json.getBytes());
        String result = mapper.readValue(is, String.class);
        assertEquals("input stream test", result);
        is.close();
    }
    
    @Test
    public void testReadValueFromReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "\"reader test\"";
        Reader reader = new StringReader(json);
        String result = mapper.readValue(reader, String.class);
        assertEquals("reader test", result);
        reader.close();
    }
    
    @Test
    public void testReadValueFromBytesWithOffsetAndLength() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String jsonPrefix = "IGNORED_";
        String json = "\"offset length test\"";
        String jsonSuffix = "_IGNORED";
        byte[] data = (jsonPrefix + json + jsonSuffix).getBytes();
        
        int offset = jsonPrefix.length();
        int length = json.length();
        
        String result = mapper.readValue(data, offset, length, String.class);
        assertEquals("offset length test", result);
    }

    @Test
    public void testReadValueFromBytesWithOffsetAndLengthAndTypeRef() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String jsonPrefix = "IGNORED_";
        String json = "\"offset length test ref\"";
        String jsonSuffix = "_IGNORED";
        byte[] data = (jsonPrefix + json + jsonSuffix).getBytes();
        
        int offset = jsonPrefix.length();
        int length = json.length();
        
        TypeReference<String> typeRef = new TypeReference<String>() {};
        String result = mapper.readValue(data, offset, length, typeRef);
        assertEquals("offset length test ref", result);
    }

    @Test
    public void testWriteValueOutputStream() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = "output stream test";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        mapper.writeValue(baos, content);
        String result = baos.toString();
        assertEquals("\"" + content + "\"", result);
    }

    @Test
    public void testWriteValueWriter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = "writer test";
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, content);
        String result = sw.toString();
        assertEquals("\"" + content + "\"", result);
    }

    @Test
    public void testWriterWithSerializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(SerializationFeature.INDENT_OUTPUT);
        assertNotNull(writer);
    }

    @Test
    public void testWriterWithMultipleSerializationFeatures() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(SerializationFeature.WRAP_ROOT_VALUE, SerializationFeature.INDENT_OUTPUT);
        assertNotNull(writer);
    }

    @Test
    public void testWriterWithDateFormat() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        ObjectWriter writer = mapper.writer(df);
        assertNotNull(writer);
        Date now = new Date();
        String json = writer.writeValueAsString(now);
        assertNotNull(json);
    }

    @Test
    public void testWriterWithView() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writerWithView(MyView.class);
        assertNotNull(writer);
    }
    
    private static class MyView {}

    @Test
    public void testWriterForClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writerFor(String.class);
        assertNotNull(writer);
        String json = writer.writeValueAsString("test");
        assertEquals("\"test\"", json);
    }

    @Test
    public void testWriterForTypeReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<String>> typeRef = new TypeReference<List<String>>() {};
        ObjectWriter writer = mapper.writerFor(typeRef);
        assertNotNull(writer);
        String json = writer.writeValueAsString(Arrays.asList("a", "b"));
        assertEquals("[\"a\",\"b\"]", json);
    }

    @Test
    public void testWriterForJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType listStringType = mapper.getTypeFactory().constructParametricType(List.class, String.class);
        ObjectWriter writer = mapper.writerFor(listStringType);
        assertNotNull(writer);
        String json = writer.writeValueAsString(Arrays.asList("a", "b"));
        assertEquals("[\"a\",\"b\"]", json);
    }

    @Test
    public void testWriterWithPrettyPrinter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PrettyPrinter pp = new DefaultPrettyPrinter();
        ObjectWriter writer = mapper.writer(pp);
        assertNotNull(writer);
        String json = writer.writeValueAsString(Collections.singletonMap("key", "value"));
        assertTrue(json.contains("{\n"));
        assertTrue(json.contains("  \"key\" : \"value\"\n"));
        assertTrue(json.contains("}"));
    }

    @Test
    public void testWriterWithDefaultPrettyPrinter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
        assertNotNull(writer);
        String json = writer.writeValueAsString(Collections.singletonMap("key", "value"));
        assertTrue(json.contains("{\n"));
        assertTrue(json.contains("  \"key\" : \"value\"\n"));
        assertTrue(json.contains("}"));
    }

    @Test
    public void testWriterWithFilterProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        FilterProvider filters = new SimpleFilterProvider().addFilter("myFilter", SimpleBeanPropertyFilter.serializeAll());
        ObjectWriter writer = mapper.writer(filters);
        assertNotNull(writer);
    }


    @Test
    public void testWriterWithBase64Variant() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Base64Variant variant = Base64Variants.PEM;
        ObjectWriter writer = mapper.writer(variant);
        assertNotNull(writer);
    }


    
    @Test
    public void testReader() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader();
        assertNotNull(reader);
    }

    @Test
    public void testReaderWithDeserializationFeature() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.reader(DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        assertNotNull(reader);
        assertTrue(reader.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT));
    }

    
    @Test
    public void testReaderForUpdating() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Integer> map = new HashMap<>();
        map.put("initial", 0);
        ObjectReader reader = mapper.readerForUpdating(map);
        assertNotNull(reader);
        // To properly test this, we'd need to deserialize into the map
        String json = "{\"initial\": 5, \"newField\": 10}";
        Map<String, Integer> updatedMap = reader.readValue(json);
        assertEquals(5, updatedMap.get("initial").intValue());
        assertEquals(10, updatedMap.get("newField").intValue());
    }

    @Test
    public void testReaderForJavaType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType listStringType = mapper.getTypeFactory().constructParametricType(List.class, String.class);
        ObjectReader reader = mapper.readerFor(listStringType);
        assertNotNull(reader);
        String json = "[\"a\", \"b\"]";
        List<String> result = reader.readValue(json);
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
    }
    
    @Test
    public void testReaderForClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(String.class);
        assertNotNull(reader);
        String json = "\"simple string\"";
        String result = reader.readValue(json);
        assertEquals("simple string", result);
    }

    @Test
    public void testReaderForTypeReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<Map<String, Integer>> typeRef = new TypeReference<Map<String, Integer>>() {};
        ObjectReader reader = mapper.readerFor(typeRef);
        assertNotNull(reader);
        String json = "{\"count\": 5}";
        Map<String, Integer> result = reader.readValue(json);
        assertEquals(5, result.get("count").intValue());
    }

    @Test
    public void testReaderWithJsonNodeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectReader reader = mapper.reader(factory);
        assertNotNull(reader);
    }


    @Test
    public void testReaderWithInjectableValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("testKey", "testValue");
        ObjectReader reader = mapper.reader(injectables);
        assertNotNull(reader);
    }

    @Test
    public void testReaderWithView() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerWithView(MyView.class);
        assertNotNull(reader);
    }



    @Test
    public void testConvertValueToString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Integer input = 123;
        String output = mapper.convertValue(input, String.class);
        assertEquals("123", output);
    }

    @Test
    public void testConvertValueToList() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String input = "[\"a\", \"b\"]";
        TypeReference<List<String>> typeRef = new TypeReference<List<String>>() {};
        List<String> output = mapper.convertValue(input, typeRef);
        assertEquals("a", output.get(0));
        assertEquals("b", output.get(1));
    }
    
    @Test
    public void testConvertValueToMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String input = "{\"key\":\"value\"}";
        TypeReference<Map<String, String>> typeRef = new TypeReference<Map<String, String>>() {};
        Map<String, String> output = mapper.convertValue(input, typeRef);
        assertEquals("value", output.get("key"));
    }

    @Test
    public void testConvertValueToBigDecimal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String input = "123.456";
        BigDecimal output = mapper.convertValue(input, BigDecimal.class);
        assertEquals(new BigDecimal("123.456"), output);
    }
    
    @Test
    public void testConvertValueToBigInteger() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String input = "9876543210";
        BigInteger output = mapper.convertValue(input, BigInteger.class);
        assertEquals(new BigInteger("9876543210"), output);
    }

    @Test
    public void testConvertValueToNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String output = mapper.convertValue(null, String.class);
        assertNull(output);
    }
}

