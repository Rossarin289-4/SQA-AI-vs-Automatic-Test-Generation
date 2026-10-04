```java
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBase;

public class StdKeyDeserializerTest {

    // Mock DeserializationContext for testing purposes
    // Need to provide required arguments for the constructor
    private final DeserializationContext mockContext = new DeserializationContext(new DeserializerFactory() {
        @Override
        public KeyDeserializer findKeyDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc, KeyDeserializer defaultImpl) throws JsonMappingException {
            return null; // Not needed for this test
        }
        // Other abstract methods need to be implemented or mocked if called
        @Override
        public JsonDeserializer<?> findValueDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc) throws JsonMappingException { return null; }
        @Override
        public JavaType materializeAbstractType(DeserializationConfig config, JavaType type, BeanDescription beanDesc) throws JsonMappingException { return null; }
        @Override
        public JavaType resolveAbstractType(DeserializationConfig config, JavaType type) throws JsonMappingException { return null; }
        @Override
        public JavaType findTypeResolver(MapperConfig<?> config, JavaType type, com.fasterxml.jackson.databind.introspect.AnnotatedClass ac) throws JsonMappingException { return null; }
        @Override
        public Class<?> findDefaultImpl(com.fasterxml.jackson.databind.introspect.AnnotatedClass ac) throws JsonMappingException { return null; }
        @Override
        public com.fasterxml.jackson.databind.deser.ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException { return null; }
        @Override
        public KeyDeserializer replaceKeyDeserializer(DeserializationConfig config, BeanDescription beanDesc, KeyDeserializer keyDeser) { return null; }
        @Override
        public JsonDeserializer<?> replaceValueDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> valueDeser) { return null; }
    }, new DeserializerCache(null), new ObjectMapper().getDeserializationConfig(), new ObjectMapper().getFactory().createParser(""), new ObjectMapper().getInjectableValues()) {

        @Override
        public boolean isEnabled(DeserializationFeature feature) {
            // For simplicity, assume features are not enabled unless explicitly needed.
            return false; 
        }

        @Override
        public JavaType findClass(String className) throws ClassNotFoundException {
            if ("java.lang.String".equals(className)) return new SimpleType(String.class);
            if ("java.lang.Integer".equals(className)) return new SimpleType(Integer.class);
            if ("java.lang.Long".equals(className)) return new SimpleType(Long.class);
            if ("java.util.Date".equals(className)) return new SimpleType(Date.class);
            if ("java.util.Calendar".equals(className)) return new SimpleType(Calendar.class);
            if ("java.lang.Boolean".equals(className)) return new SimpleType(Boolean.class);
            if ("java.lang.Byte".equals(className)) return new SimpleType(Byte.class);
            if ("java.lang.Character".equals(className)) return new SimpleType(Character.class);
            if ("java.lang.Short".equals(className)) return new SimpleType(Short.class);
            if ("java.lang.Float".equals(className)) return new SimpleType(Float.class);
            if ("java.lang.Double".equals(className)) return new SimpleType(Double.class);
            if ("java.util.UUID".equals(className)) return new SimpleType(UUID.class);
            if ("java.net.URI".equals(className)) return new SimpleType(URI.class);
            if ("java.net.URL".equals(className)) return new SimpleType(URL.class);
            if ("java.util.Locale".equals(className)) return new SimpleType(Locale.class);
            if ("java.util.Currency".equals(className)) return new SimpleType(Currency.class);
            
            // This part needs to return a TypeBase, not a Class<?>
            throw new ClassNotFoundException("Class not mocked: " + className);
        }

        @Override
        public Object handleWeirdKey(Class<?> keyClass, String keyValue, String format, Object... params) throws IOException {
            throw new IllegalArgumentException(String.format(format, params));
        }
        
        @Override
        public java.util.Date parseDate(String str) throws IOException {
            try {
                // Mocking a simple date format for testing
                return new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str);
            } catch (java.text.ParseException e) {
                throw new IOException(e);
            }
        }

        @Override
        public Calendar constructCalendar(java.util.Date date) {
            if (date == null) return null; // Handle null date case
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal;
        }
        
        @Override
        public JsonParser getParser() {
            // Return a dummy parser if needed for TokenBuffer
            try {
                return new TokenBuffer(null, this).asParser();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        
        // Mocking findDeserializer to return a default for Locale and Currency for testing _deser.
        @Override
        protected FromStringDeserializer<?> findDeserializer(Class<?> type) throws JsonMappingException {
            if (type == Locale.class) {
                return new FromStringDeserializer.Locale();
            }
            if (type == Currency.class) {
                return new FromStringDeserializer.Currency();
            }
            return null; // Return null if not found to test handleWeirdKey
        }
    };

    @Test
    public void testStdKeyDeserializerForStringType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(String.class);
        assertNotNull(kd);
        assertEquals("abc", kd.deserializeKey("abc", mockContext));
        assertEquals("", kd.deserializeKey("", mockContext));
        assertNull(kd.deserializeKey(null, mockContext));
    }

    @Test
    public void testStdKeyDeserializerForObjectType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Object.class);
        assertNotNull(kd);
        assertEquals("abc", kd.deserializeKey("abc", mockContext));
        assertEquals("", kd.deserializeKey("", mockContext));
        assertNull(kd.deserializeKey(null, mockContext));
    }

    @Test
    public void testStdKeyDeserializerForBooleanType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Boolean.class);
        assertNotNull(kd);
        assertEquals(Boolean.TRUE, kd.deserializeKey("true", mockContext));
        assertEquals(Boolean.FALSE, kd.deserializeKey("false", mockContext));
        try {
            kd.deserializeKey("True", mockContext); // Case sensitivity
            fail("Expected exception for invalid boolean value");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
    }

    @Test
    public void testStdKeyDeserializerForByteType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        assertNotNull(kd);
        assertEquals(Byte.valueOf((byte) 123), kd.deserializeKey("123", mockContext));
        assertEquals(Byte.valueOf((byte) 0), kd.deserializeKey("0", mockContext));
        assertEquals(Byte.valueOf((byte) -1), kd.deserializeKey("-1", mockContext));
        assertEquals(Byte.valueOf((byte) 255), kd.deserializeKey("255", mockContext)); // Test unsigned byte range
        try {
            kd.deserializeKey("256", mockContext); // Overflow
            fail("Expected exception for byte overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("overflow"));
        }
        try {
            kd.deserializeKey("-129", mockContext); // Underflow
            fail("Expected exception for byte underflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("overflow"));
        }
        try {
            kd.deserializeKey("abc", mockContext); // Invalid number
            fail("Expected exception for invalid byte value");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
    }

    @Test
    public void testStdKeyDeserializerForShortType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        assertNotNull(kd);
        assertEquals(Short.valueOf((short) 12345), kd.deserializeKey("12345", mockContext));
        assertEquals(Short.valueOf((short) -32768), kd.deserializeKey("-32768", mockContext)); // MIN_VALUE
        assertEquals(Short.valueOf((short) 32767), kd.deserializeKey("32767", mockContext)); // MAX_VALUE
        try {
            kd.deserializeKey("32768", mockContext); // Overflow
            fail("Expected exception for short overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("overflow"));
        }
        try {
            kd.deserializeKey("-32769", mockContext); // Underflow
            fail("Expected exception for short underflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("overflow"));
        }
    }

    @Test
    public void testStdKeyDeserializerForCharType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        assertNotNull(kd);
        assertEquals(Character.valueOf('a'), kd.deserializeKey("a", mockContext));
        assertEquals(Character.valueOf(' '), kd.deserializeKey(" ", mockContext));
        try {
            kd.deserializeKey("abc", mockContext); // Too long
            fail("Expected exception for char with more than one character");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("can only convert 1-character"));
        }
        try {
            kd.deserializeKey("", mockContext); // Too short
            fail("Expected exception for char with no character");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("can only convert 1-character"));
        }
    }

    @Test
    public void testStdKeyDeserializerForIntType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        assertNotNull(kd);
        assertEquals(Integer.valueOf(12345), kd.deserializeKey("12345", mockContext));
        assertEquals(Integer.valueOf(0), kd.deserializeKey("0", mockContext));
        assertEquals(Integer.valueOf(-1), kd.deserializeKey("-1", mockContext));
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), kd.deserializeKey(String.valueOf(Integer.MAX_VALUE), mockContext));
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), kd.deserializeKey(String.valueOf(Integer.MIN_VALUE), mockContext));
        try {
            kd.deserializeKey("2147483648", mockContext); // Overflow
            fail("Expected exception for int overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
        try {
            kd.deserializeKey("-2147483649", mockContext); // Underflow
            fail("Expected exception for int underflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
    }

    @Test
    public void testStdKeyDeserializerForLongType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        assertNotNull(kd);
        assertEquals(Long.valueOf(1234567890123L), kd.deserializeKey("1234567890123", mockContext));
        assertEquals(Long.valueOf(0L), kd.deserializeKey("0", mockContext));
        assertEquals(Long.valueOf(-1L), kd.deserializeKey("-1", mockContext));
        assertEquals(Long.valueOf(Long.MAX_VALUE), kd.deserializeKey(String.valueOf(Long.MAX_VALUE), mockContext));
        assertEquals(Long.valueOf(Long.MIN_VALUE), kd.deserializeKey(String.valueOf(Long.MIN_VALUE), mockContext));
        try {
            kd.deserializeKey("9223372036854775808", mockContext); // Overflow
            fail("Expected exception for long overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
        try {
            kd.deserializeKey("-9223372036854775809", mockContext); // Underflow
            fail("Expected exception for long underflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
    }

    @Test
    public void testStdKeyDeserializerForFloatType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Float.class);
        assertNotNull(kd);
        assertEquals(Float.valueOf(123.45f), kd.deserializeKey("123.45", mockContext));
        assertEquals(Float.valueOf(0.0f), kd.deserializeKey("0.0", mockContext));
        assertEquals(Float.valueOf(-1.5f), kd.deserializeKey("-1.5", mockContext));
        assertEquals(Float.valueOf(Float.MAX_VALUE), kd.deserializeKey(String.valueOf(Float.MAX_VALUE), mockContext));
        assertEquals(Float.valueOf(Float.MIN_VALUE), kd.deserializeKey(String.valueOf(Float.MIN_VALUE), mockContext));
        assertEquals(Float.valueOf(Float.NEGATIVE_INFINITY), kd.deserializeKey("-Infinity", mockContext));
        assertEquals(Float.valueOf(Float.POSITIVE_INFINITY), kd.deserializeKey("Infinity", mockContext));
        // Note: NumberInput.parseDouble handles scientific notation
        assertEquals(Float.valueOf(1.23e4f), kd.deserializeKey("1.23e4", mockContext));
    }

    @Test
    public void testStdKeyDeserializerForDoubleType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        assertNotNull(kd);
        assertEquals(Double.valueOf(123.456789), kd.deserializeKey("123.456789", mockContext));
        assertEquals(Double.valueOf(0.0), kd.deserializeKey("0.0", mockContext));
        assertEquals(Double.valueOf(-1.5e-10), kd.deserializeKey("-1.5e-10", mockContext));
        assertEquals(Double.valueOf(Double.MAX_VALUE), kd.deserializeKey(String.valueOf(Double.MAX_VALUE), mockContext));
        assertEquals(Double.valueOf(Double.MIN_VALUE), kd.deserializeKey(String.valueOf(Double.MIN_VALUE), mockContext));
        assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), kd.deserializeKey("-Infinity", mockContext));
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), kd.deserializeKey("Infinity", mockContext));
    }
    
    @Test
    public void testStdKeyDeserializerForUUIDType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(UUID.class);
        assertNotNull(kd);
        UUID uuid = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        assertEquals(uuid, kd.deserializeKey(uuid.toString(), mockContext));
        try {
            kd.deserializeKey("invalid-uuid", mockContext);
            fail("Expected exception for invalid UUID");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("problem: "));
        }
    }

    @Test
    public void testStdKeyDeserializerForURIType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URI.class);
        assertNotNull(kd);
        URI uri = URI.create("http://example.com/path?query=value");
        assertEquals(uri, kd.deserializeKey(uri.toString(), mockContext));
        try {
            // Some strings are not valid URIs
            kd.deserializeKey("http://[:::1]", mockContext); 
            fail("Expected exception for invalid URI");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("problem: "));
        }
    }

    @Test
    public void testStdKeyDeserializerForURLType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        assertNotNull(kd);
        URL url = new URL("http://example.com");
        assertEquals(url, kd.deserializeKey(url.toString(), mockContext));
        try {
            kd.deserializeKey("http://invalid url", mockContext);
            fail("Expected exception for invalid URL");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("problem: "));
        }
    }
    
    @Test
    public void testStdKeyDeserializerForClassType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Class.class);
        assertNotNull(kd);
        assertEquals(String.class, kd.deserializeKey("java.lang.String", mockContext));
        assertEquals(Integer.class, kd.deserializeKey("java.lang.Integer", mockContext));
        try {
            kd.deserializeKey("non.existent.Class", mockContext);
            fail("Expected exception for non-existent class");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("unable to parse key as Class"));
        }
    }

    @Test
    public void testStdKeyDeserializerForLocaleType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Locale.class);
        assertNotNull(kd);
        assertEquals(Locale.US, kd.deserializeKey("en_US", mockContext));
        assertEquals(Locale.CANADA, kd.deserializeKey("en_CA", mockContext));
        assertEquals(Locale.FRANCE, kd.deserializeKey("fr_FR", mockContext));
        // Note: FromStringDeserializer.Locale handles "en", "fr", etc.
        assertEquals(Locale.ENGLISH, kd.deserializeKey("en", mockContext));
        try {
            kd.deserializeKey("invalid-locale", mockContext);
            fail("Expected exception for invalid locale");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("unable to parse key as locale"));
        }
    }
    
    @Test
    public void testStdKeyDeserializerForCurrencyType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Currency.class);
        assertNotNull(kd);
        assertEquals(Currency.getInstance("USD"), kd.deserializeKey("USD", mockContext));
        assertEquals(Currency.getInstance("EUR"), kd.deserializeKey("EUR", mockContext));
        try {
            kd.deserializeKey("XYZ", mockContext); // Invalid currency code
            fail("Expected exception for invalid currency");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("unable to parse key as currency"));
        }
    }

    @Test
    public void testStdKeyDeserializerForDateType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Date.class);
        assertNotNull(kd);
        // Mock context uses "yyyy-MM-dd" format
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 26).getTime(); 
        // Note: Calendar months are 0-indexed, so October is 9. The input "2023-11-26" corresponds to November 26, 2023.
        // The reference source uses ctxt.parseDate which is mocked here.
        // The mock uses SimpleDateFormat("yyyy-MM-dd").
        // A date like "2023-11-26" parsed by this mock should yield November 26, 2023.
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.setTime(new GregorianCalendar(2023, Calendar.NOVEMBER, 26).getTime()); // November is month 10 (0-indexed)
        
        assertEquals(expectedCal.getTime(), kd.deserializeKey("2023-11-26", mockContext)); 
        
        try {
            kd.deserializeKey("invalid-date", mockContext);
            fail("Expected exception for invalid date");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("unable to parse key as Date"));
        }
    }

    @Test
    public void testStdKeyDeserializerForCalendarType() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Calendar.class);
        assertNotNull(kd);
        Calendar expectedCal = Calendar.getInstance();
        expectedCal.setTime(new GregorianCalendar(2023, Calendar.NOVEMBER, 26).getTime()); // November is month 10 (0-indexed)
        
        // Mock context uses "yyyy-MM-dd" format
        Calendar actualCal = (Calendar) kd.deserializeKey("2023-11-26", mockContext); 
        assertNotNull(actualCal);
        assertEquals(expectedCal.getTimeInMillis(), actualCal.getTimeInMillis());
        
        // Test null date
        // If parseDate returns null, constructCalendar is called with null.
        // The mock parseDate doesn't return null for invalid input, it throws IOException.
        // So, this path is covered by the exception handling in _parse.
        try {
            kd.deserializeKey("not-a-date", mockContext);
            fail("Expected exception for unparseable date");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("unable to parse key as Date"));
        }
    }
    
    // Test for StringKD
    @Test
    public void testStringKD() throws Exception {
        StdKeyDeserializer.StringKD kd = StdKeyDeserializer.StringKD.forType(String.class);
        assertNotNull(kd);
        assertEquals("test", kd.deserializeKey("test", mockContext));
        assertEquals("", kd.deserializeKey("", mockContext));
        assertNull(kd.deserializeKey(null, mockContext));
    }

    // Test for StringKD for Object.class
    @Test
    public void testStringKDForObject() throws Exception {
        StdKeyDeserializer.StringKD kd = StdKeyDeserializer.StringKD.forType(Object.class);
        assertNotNull(kd);
        assertEquals("test", kd.deserializeKey("test", mockContext));
        assertEquals("", kd.deserializeKey("", mockContext));
        assertNull(kd.deserializeKey(null, mockContext));
    }

    // Test for DelegatingKD (requires a mock JsonDeserializer)
    @Test
    public void testDelegatingKD() throws Exception {
        // Mock JsonDeserializer that just returns the string itself
        JsonDeserializer<String> mockDelegate = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
                // The TokenBuffer will write the string as JSON, so p.getText() should work
                return p.getText();
            }
        };
        StdKeyDeserializer.DelegatingKD kd = new StdKeyDeserializer.DelegatingKD(String.class, mockDelegate);
        assertEquals("delegateTest", kd.deserializeKey("delegateTest", mockContext));
    }

    // Test for EnumKD (requires a more complex setup, typically with EnumResolver and AnnotatedMethod)
    // This test will be simplified, focusing on the _parse method call.
    @Test
    public void testEnumKD_simple() throws Exception {
        // Mock EnumResolver
        EnumResolver mockEnumResolver = new EnumResolver(TestEnum.class, TestEnum.values(), getEnumMap(TestEnum.values()), null) {
            @Override
            public Enum<?> findEnum(String key) {
                if ("VALUE1".equals(key)) {
                    return TestEnum.VALUE1;
                }
                return null;
            }
            @Override public Class<Enum<?>> getEnumClass() { return (Class<Enum<?>>) (Class<?>) TestEnum.class; }
            @Override public Collection<String> getEnumIds() { return Arrays.asList("VALUE1"); }
        };

        // Create a mock EnumKD using the protected constructor
        StdKeyDeserializer kd = new StdKeyDeserializer.EnumKD(mockEnumResolver, null);

        // Test deserializing a valid enum name
        Enum<?> result = (Enum<?>) kd.deserializeKey("VALUE1", mockContext);
        assertNotNull(result);
        assertEquals(TestEnum.VALUE1, result);

        // Test deserializing an unknown enum name (with READ_UNKNOWN_ENUM_VALUES_AS_NULL disabled)
        try {
            // mockContext has isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) as false
            kd.deserializeKey("UNKNOWN_VALUE", mockContext);
            fail("Expected exception for unknown enum value");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not one of values"));
        }
    }
    
    // Helper enum for testing EnumKD
    private enum TestEnum {
        VALUE1, VALUE2;
    }

    // Helper to create enum map
    private HashMap<String, Enum<?>> getEnumMap(Enum<?>[] enums) {
        HashMap<String, Enum<?>> map = new HashMap<>();
        for (Enum<?> e : enums) {
            map.put(e.name(), e);
        }
        return map;
    }

    // Test for StringCtorKeyDeserializer
    @Test
    public void testStringCtorKeyDeserializer() throws Exception {
        Constructor<?> ctor = String.class.getConstructor(String.class);
        StdKeyDeserializer.StringCtorKeyDeserializer kd = new StdKeyDeserializer.StringCtorKeyDeserializer(ctor);
        assertEquals("test", kd.deserializeKey("test", mockContext));
    }

    // Test for StringFactoryKeyDeserializer
    @Test
    public void testStringFactoryKeyDeserializer() throws Exception {
        Method factoryMethod = String.class.getMethod("valueOf", String.class);
        StdKeyDeserializer.StringFactoryKeyDeserializer kd = new StdKeyDeserializer.StringFactoryKeyDeserializer(factoryMethod);
        assertEquals("factoryTest", kd.deserializeKey("factoryTest", mockContext));
    }

    // Test _parse for byte overflow boundary
    @Test
    public void testParseByteOverflow() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Byte.class);
        // Value just above 255
        try {
            kd._parse("256", mockContext);
            fail("Expected exception for byte overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("overflow"));
        }
    }

    // Test _parse for short overflow boundary
    @Test
    public void testParseShortOverflow() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Short.class);
        // Value just above Short.MAX_VALUE
        try {
            kd._parse("32768", mockContext);
            fail("Expected exception for short overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("overflow"));
        }
    }
    
    // Test _parse for int overflow boundary
    @Test
    public void testParseIntOverflow() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Integer.class);
        // Value just above Integer.MAX_VALUE
        try {
            kd._parse("2147483648", mockContext);
            fail("Expected exception for int overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
    }
    
    // Test _parse for long overflow boundary
    @Test
    public void testParseLongOverflow() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Long.class);
        // Value just above Long.MAX_VALUE
        try {
            kd._parse("9223372036854775808", mockContext);
            fail("Expected exception for long overflow");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a valid representation"));
        }
    }
    
    // Test _parse for char with length 1
    @Test
    public void testParseCharSingleCharacter() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Character.class);
        assertEquals(Character.valueOf('x'), kd._parse("x", mockContext));
    }
    
    // Test _parse for Date parsing edge case (if mock supports it)
    @Test
    public void testParseDateEdgeCase() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Date.class);
        // Assuming mockContext parses dates in yyyy-MM-dd format
        Date date = new GregorianCalendar(1970, Calendar.JANUARY, 1).getTime();
        assertEquals(date, kd.deserializeKey("1970-01-01", mockContext));
    }

    // Test _parse for URL with MalformedURLException
    @Test
    public void testParseURLEdgeCase() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(URL.class);
        try {
            kd._parse("http://", mockContext); // This might be valid depending on URL implementation
            // Let's try something more likely to fail
            kd._parse("invalid_url", mockContext);
            fail("Expected exception for invalid URL");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("problem: "));
        }
    }

    // Test for Double.NEGATIVE_INFINITY
    @Test
    public void testDoubleNegativeInfinity() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Double.class);
        assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), kd.deserializeKey("-Infinity", mockContext));
    }

    // Test for Float.NEGATIVE_INFINITY
    @Test
    public void testFloatNegativeInfinity() throws Exception {
        StdKeyDeserializer kd = StdKeyDeserializer.forType(Float.class);
        assertEquals(Float.valueOf(Float.NEGATIVE_INFINITY), kd.deserializeKey("-Infinity", mockContext));
    }
}
```