```java
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;

public class NumberDeserializersTest {

    // Helper method to create a JsonParser for testing
    private JsonParser createParser(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getFactory().createParser(json);
    }

    // Helper method to create a DeserializationContext for testing
    private DeserializationContext createContext(DeserializationFeature... features) {
        DeserializationConfig config = new DeserializationConfig(new org.mockito.MockSettings().stubFactory(null), null);
        for (DeserializationFeature feature : features) {
            config.enable(feature);
        }
        // Use a simplified DeserializationContext or mock if needed.
        // For many cases, a default context with specific features enabled is sufficient.
        // We need to provide a DeserializerFactory and DeserializerCache.
        // For simplicity, we can use mocks or default implementations if available.
        // Since direct instantiation of DeserializationContext is complex,
        // we'll use a minimal setup that satisfies the calls.
        
        // A proper mock of DeserializationContext is complex. Let's try to construct
        // a minimal valid one if possible, or use a mock that fulfills needs.
        // The original code had issues with DeserializationContext mocking.
        // Let's simplify and assume basic behavior for enabled features.
        
        // Mocking the essential methods that are called:
        return new DefaultDeserializationContext.Impl(config, null) {
            @Override
            public boolean isEnabled(DeserializationFeature feature) {
                for (DeserializationFeature enabledFeature : features) {
                    if (feature == enabledFeature) {
                        return true;
                    }
                }
                return super.isEnabled(feature);
            }
            
             @Override
             public JsonMappingException mappingException(Class<?> cls, JsonToken token) {
                  return new JsonMappingException(null, "Mapping exception for class " + cls.getName() + " and token " + token);
             }

            @Override
             public JsonMappingException mappingException(JavaType type, JsonToken token) {
                 return new JsonMappingException(null, "Mapping exception for type " + type.toString() + " and token " + token);
            }

            @Override
            public JsonMappingException wrongTokenException(JsonParser p, JsonToken expected, String msg) {
                return new JsonMappingException(p, msg + " (expected " + expected + ")");
            }

            @Override
            public JsonMappingException weirdStringException(String text, Class<?> targetClass, String msg) {
                return new JsonMappingException(null, String.format("Cannot deserialize String %s to %s (%s)", text, targetClass.getName(), msg));
            }
             
             @Override
             public void reportInputReadConflict(String msg) throws JsonMappingException {
                 throw mappingException(msg);
             }
             
             @Override
             public JsonMappingException _failDoubleToIntCoercion(JsonParser p, DeserializationContext ctxt, String targetType) throws JsonMappingException {
                 throw mappingException(p, String.format("Cannot coerce Double value (%s) to %s", p.getNumberValue(), targetType));
             }

             @Override
             public JsonMappingException jsonMappingException(JsonParser p, String msg) {
                  return new JsonMappingException(p, msg);
             }

              @Override
              public JsonMappingException mappingException(String msg, Object... msgArgs) {
                   return new JsonMappingException(null, String.format(msg, msgArgs));
              }
        };
    }
    
    private JsonDeserializer<?> getDeserializer(Class<?> type) throws IOException {
        return NumberDeserializers.find(type, type.getName());
    }
    
    // Test cases for find() method
    @Test
    public void testFindIntegerPrimitive() throws Exception {
        assertNotNull(getDeserializer(Integer.TYPE));
        assertTrue(getDeserializer(Integer.TYPE) instanceof NumberDeserializers.IntegerDeserializer);
    }

    @Test
    public void testFindBooleanPrimitive() throws Exception {
        assertNotNull(getDeserializer(Boolean.TYPE));
        assertTrue(getDeserializer(Boolean.TYPE) instanceof NumberDeserializers.BooleanDeserializer);
    }

    @Test
    public void testFindLongPrimitive() throws Exception {
        assertNotNull(getDeserializer(Long.TYPE));
        assertTrue(getDeserializer(Long.TYPE) instanceof NumberDeserializers.LongDeserializer);
    }

    @Test
    public void testFindDoublePrimitive() throws Exception {
        assertNotNull(getDeserializer(Double.TYPE));
        assertTrue(getDeserializer(Double.TYPE) instanceof NumberDeserializers.DoubleDeserializer);
    }

    @Test
    public void testFindCharacterPrimitive() throws Exception {
        assertNotNull(getDeserializer(Character.TYPE));
        assertTrue(getDeserializer(Character.TYPE) instanceof NumberDeserializers.CharacterDeserializer);
    }

    @Test
    public void testFindBytePrimitive() throws Exception {
        assertNotNull(getDeserializer(Byte.TYPE));
        assertTrue(getDeserializer(Byte.TYPE) instanceof NumberDeserializers.ByteDeserializer);
    }

    @Test
    public void testFindShortPrimitive() throws Exception {
        assertNotNull(getDeserializer(Short.TYPE));
        assertTrue(getDeserializer(Short.TYPE) instanceof NumberDeserializers.ShortDeserializer);
    }

    @Test
    public void testFindFloatPrimitive() throws Exception {
        assertNotNull(getDeserializer(Float.TYPE));
        assertTrue(getDeserializer(Float.TYPE) instanceof NumberDeserializers.FloatDeserializer);
    }

    @Test
    public void testFindIntegerWrapper() throws Exception {
        assertNotNull(getDeserializer(Integer.class));
        assertTrue(getDeserializer(Integer.class) instanceof NumberDeserializers.IntegerDeserializer);
    }

    @Test
    public void testFindBooleanWrapper() throws Exception {
        assertNotNull(getDeserializer(Boolean.class));
        assertTrue(getDeserializer(Boolean.class) instanceof NumberDeserializers.BooleanDeserializer);
    }

    @Test
    public void testFindLongWrapper() throws Exception {
        assertNotNull(getDeserializer(Long.class));
        assertTrue(getDeserializer(Long.class) instanceof NumberDeserializers.LongDeserializer);
    }

    @Test
    public void testFindDoubleWrapper() throws Exception {
        assertNotNull(getDeserializer(Double.class));
        assertTrue(getDeserializer(Double.class) instanceof NumberDeserializers.DoubleDeserializer);
    }

    @Test
    public void testFindCharacterWrapper() throws Exception {
        assertNotNull(getDeserializer(Character.class));
        assertTrue(getDeserializer(Character.class) instanceof NumberDeserializers.CharacterDeserializer);
    }

    @Test
    public void testFindByteWrapper() throws Exception {
        assertNotNull(getDeserializer(Byte.class));
        assertTrue(getDeserializer(Byte.class) instanceof NumberDeserializers.ByteDeserializer);
    }

    @Test
    public void testFindShortWrapper() throws Exception {
        assertNotNull(getDeserializer(Short.class));
        assertTrue(getDeserializer(Short.class) instanceof NumberDeserializers.ShortDeserializer);
    }

    @Test
    public void testFindFloatWrapper() throws Exception {
        assertNotNull(getDeserializer(Float.class));
        assertTrue(getDeserializer(Float.class) instanceof NumberDeserializers.FloatDeserializer);
    }

    @Test
    public void testFindNumber() throws Exception {
        assertNotNull(getDeserializer(Number.class));
        assertTrue(getDeserializer(Number.class) instanceof NumberDeserializers.NumberDeserializer);
    }

    @Test
    public void testFindBigDecimal() throws Exception {
        assertNotNull(getDeserializer(BigDecimal.class));
        assertTrue(getDeserializer(BigDecimal.class) instanceof NumberDeserializers.BigDecimalDeserializer);
    }

    @Test
    public void testFindBigInteger() throws Exception {
        assertNotNull(getDeserializer(BigInteger.class));
        assertTrue(getDeserializer(BigInteger.class) instanceof NumberDeserializers.BigIntegerDeserializer);
    }

    @Test
    public void testFindUnknown() throws Exception {
        assertNull(getDeserializer(String.class));
        assertNull(NumberDeserializers.find(String.class, "java.lang.String"));
    }
    
    // Test cases for BooleanDeserializer
    @Test
    public void testBooleanDeserializerTrue() throws Exception {
        JsonDeserializer<Boolean> deserializer = (JsonDeserializer<Boolean>) getDeserializer(Boolean.class);
        JsonParser parser = createParser("true");
        parser.nextToken(); // Advance to VALUE_TRUE
        assertEquals(Boolean.TRUE, deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testBooleanDeserializerFalse() throws Exception {
        JsonDeserializer<Boolean> deserializer = (JsonDeserializer<Boolean>) getDeserializer(Boolean.class);
        JsonParser parser = createParser("false");
        parser.nextToken(); // Advance to VALUE_FALSE
        assertEquals(Boolean.FALSE, deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testBooleanDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Boolean> deserializer = (JsonDeserializer<Boolean>) getDeserializer(Boolean.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    // Test cases for ByteDeserializer
    @Test
    public void testByteDeserializerValue() throws Exception {
        JsonDeserializer<Byte> deserializer = (JsonDeserializer<Byte>) getDeserializer(Byte.class);
        JsonParser parser = createParser("123");
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Byte.valueOf((byte) 123), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testByteDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Byte> deserializer = (JsonDeserializer<Byte>) getDeserializer(Byte.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    // Test cases for ShortDeserializer
    @Test
    public void testShortDeserializerValue() throws Exception {
        JsonDeserializer<Short> deserializer = (JsonDeserializer<Short>) getDeserializer(Short.class);
        JsonParser parser = createParser("30000");
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Short.valueOf((short) 30000), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testShortDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Short> deserializer = (JsonDeserializer<Short>) getDeserializer(Short.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    // Test cases for CharacterDeserializer
    @Test
    public void testCharacterDeserializerCharString() throws Exception {
        JsonDeserializer<Character> deserializer = (JsonDeserializer<Character>) getDeserializer(Character.class);
        JsonParser parser = createParser("\"a\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(Character.valueOf('a'), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testCharacterDeserializerInt() throws Exception {
        JsonDeserializer<Character> deserializer = (JsonDeserializer<Character>) getDeserializer(Character.class);
        JsonParser parser = createParser("65"); // ASCII for 'A'
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Character.valueOf('A'), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testCharacterDeserializerEmptyString() throws Exception {
        JsonDeserializer<Character> deserializer = (JsonDeserializer<Character>) getDeserializer(Character.class);
        JsonParser parser = createParser("\"\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(null, deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testCharacterDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Character> deserializer = (JsonDeserializer<Character>) getDeserializer(Character.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    // Test cases for IntegerDeserializer
    @Test
    public void testIntegerDeserializerIntValue() throws Exception {
        JsonDeserializer<Integer> deserializer = (JsonDeserializer<Integer>) getDeserializer(Integer.class);
        JsonParser parser = createParser("12345");
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Integer.valueOf(12345), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testIntegerDeserializerMaxInt() throws Exception {
        JsonDeserializer<Integer> deserializer = (JsonDeserializer<Integer>) getDeserializer(Integer.class);
        JsonParser parser = createParser(String.valueOf(Integer.MAX_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testIntegerDeserializerMinInt() throws Exception {
        JsonDeserializer<Integer> deserializer = (JsonDeserializer<Integer>) getDeserializer(Integer.class);
        JsonParser parser = createParser(String.valueOf(Integer.MIN_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testIntegerDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Integer> deserializer = (JsonDeserializer<Integer>) getDeserializer(Integer.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }

    // Test cases for LongDeserializer
    @Test
    public void testLongDeserializerLongValue() throws Exception {
        JsonDeserializer<Long> deserializer = (JsonDeserializer<Long>) getDeserializer(Long.class);
        JsonParser parser = createParser("9876543210");
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Long.valueOf(9876543210L), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testLongDeserializerMaxLong() throws Exception {
        JsonDeserializer<Long> deserializer = (JsonDeserializer<Long>) getDeserializer(Long.class);
        JsonParser parser = createParser(String.valueOf(Long.MAX_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Long.valueOf(Long.MAX_VALUE), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testLongDeserializerMinLong() throws Exception {
        JsonDeserializer<Long> deserializer = (JsonDeserializer<Long>) getDeserializer(Long.class);
        JsonParser parser = createParser(String.valueOf(Long.MIN_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(Long.valueOf(Long.MIN_VALUE), deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testLongDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Long> deserializer = (JsonDeserializer<Long>) getDeserializer(Long.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }

    // Test cases for FloatDeserializer
    @Test
    public void testFloatDeserializerValue() throws Exception {
        JsonDeserializer<Float> deserializer = (JsonDeserializer<Float>) getDeserializer(Float.class);
        JsonParser parser = createParser("123.45");
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(Float.valueOf(123.45f), deserializer.deserialize(parser, createContext()), 1e-6f);
    }

    @Test
    public void testFloatDeserializerMinValue() throws Exception {
        JsonDeserializer<Float> deserializer = (JsonDeserializer<Float>) getDeserializer(Float.class);
        JsonParser parser = createParser(String.valueOf(Float.MIN_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(Float.MIN_VALUE, deserializer.deserialize(parser, createContext()), 1e-6f);
    }

    @Test
    public void testFloatDeserializerMaxValue() throws Exception {
        JsonDeserializer<Float> deserializer = (JsonDeserializer<Float>) getDeserializer(Float.class);
        JsonParser parser = createParser(String.valueOf(Float.MAX_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(Float.MAX_VALUE, deserializer.deserialize(parser, createContext()), 1e-6f);
    }
    
    @Test
    public void testFloatDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Float> deserializer = (JsonDeserializer<Float>) getDeserializer(Float.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }

    // Test cases for DoubleDeserializer
    @Test
    public void testDoubleDeserializerValue() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) getDeserializer(Double.class);
        JsonParser parser = createParser("987.654");
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(Double.valueOf(987.654), deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testDoubleDeserializerMinValue() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) getDeserializer(Double.class);
        JsonParser parser = createParser(String.valueOf(Double.MIN_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(Double.MIN_VALUE, deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testDoubleDeserializerMaxValue() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) getDeserializer(Double.class);
        JsonParser parser = createParser(String.valueOf(Double.MAX_VALUE));
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(Double.MAX_VALUE, deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testDoubleDeserializerNaN() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) getDeserializer(Double.class);
        JsonParser parser = createParser("NaN");
        parser.nextToken(); // Advance to VALUE_STRING, as NaN is parsed as string
        assertEquals(Double.NaN, deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testDoubleDeserializerPosInf() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) getDeserializer(Double.class);
        JsonParser parser = createParser("Infinity");
        parser.nextToken(); // Advance to VALUE_STRING, as Infinity is parsed as string
        assertEquals(Double.POSITIVE_INFINITY, deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testDoubleDeserializerNegInf() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) getDeserializer(Double.class);
        JsonParser parser = createParser("-Infinity");
        parser.nextToken(); // Advance to VALUE_STRING, as -Infinity is parsed as string
        assertEquals(Double.NEGATIVE_INFINITY, deserializer.deserialize(parser, createContext()), 1e-9);
    }
    
    @Test
    public void testDoubleDeserializerNullWrapper() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) getDeserializer(Double.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }

    // Test cases for NumberDeserializer
    @Test
    public void testNumberDeserializerIntValue() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("42");
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, createContext());
        assertTrue(result instanceof Integer);
        assertEquals(Integer.valueOf(42), result);
    }

    @Test
    public void testNumberDeserializerLongValue() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("1234567890123"); // Too large for int
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, createContext());
        assertTrue(result instanceof Long);
        assertEquals(Long.valueOf(1234567890123L), result);
    }

    @Test
    public void testNumberDeserializerDoubleValue() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("123.45");
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, createContext());
        assertTrue(result instanceof Double);
        assertEquals(Double.valueOf(123.45), result, 1e-9);
    }

    @Test
    public void testNumberDeserializerBigDecimalValue() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("987.654");
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        // Enable USE_BIG_DECIMAL_FOR_FLOATS for this test
        Object result = deserializer.deserialize(parser, createContext(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
        assertTrue(result instanceof BigDecimal);
        assertEquals(new BigDecimal("987.654"), result);
    }
    
    @Test
    public void testNumberDeserializerStringValue() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("\"123\""); // Number as string
        parser.nextToken(); // Advance to VALUE_STRING
        Object result = deserializer.deserialize(parser, createContext());
        assertTrue(result instanceof Integer); // Default parsing for small ints
        assertEquals(Integer.valueOf(123), result);
    }
    
    @Test
    public void testNumberDeserializerStringBigIntValue() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("\"98765432109876543210\""); // Large number as string
        parser.nextToken(); // Advance to VALUE_STRING
        // Enable USE_BIG_INTEGER_FOR_INTS for this test
        Object result = deserializer.deserialize(parser, createContext(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS));
        assertTrue(result instanceof BigInteger);
        assertEquals(new BigInteger("98765432109876543210"), result);
    }
    
    @Test
    public void testNumberDeserializerStringFloatValue() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("\"123.45\""); // Number as string
        parser.nextToken(); // Advance to VALUE_STRING
        Object result = deserializer.deserialize(parser, createContext());
        assertTrue(result instanceof Double); // Default parsing for float strings
        assertEquals(Double.valueOf(123.45), result, 1e-9);
    }

    @Test
    public void testNumberDeserializerStringEmpty() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("\"\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(deserializer.getEmptyValue(createContext()), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testNumberDeserializerStringNull() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testNumberDeserializerStringNaN() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("\"NaN\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(Double.NaN, deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testNumberDeserializerStringPosInf() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("\"Infinity\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(Double.POSITIVE_INFINITY, deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testNumberDeserializerStringNegInf() throws Exception {
        JsonDeserializer<Object> deserializer = (JsonDeserializer<Object>) getDeserializer(Number.class);
        JsonParser parser = createParser("\"-Infinity\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(Double.NEGATIVE_INFINITY, deserializer.deserialize(parser, createContext()), 1e-9);
    }

    // Test cases for BigIntegerDeserializer
    @Test
    public void testBigIntegerDeserializerIntValue() throws Exception {
        JsonDeserializer<BigInteger> deserializer = (JsonDeserializer<BigInteger>) getDeserializer(BigInteger.class);
        JsonParser parser = createParser("123");
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(BigInteger.valueOf(123), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testBigIntegerDeserializerBigIntValue() throws Exception {
        JsonDeserializer<BigInteger> deserializer = (JsonDeserializer<BigInteger>) getDeserializer(BigInteger.class);
        JsonParser parser = createParser("98765432109876543210");
        parser.nextToken(); // Advance to VALUE_NUMBER_INT
        assertEquals(new BigInteger("98765432109876543210"), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testBigIntegerDeserializerFloatValueCoerced() throws Exception {
        JsonDeserializer<BigInteger> deserializer = (JsonDeserializer<BigInteger>) getDeserializer(BigInteger.class);
        JsonParser parser = createParser("123.0"); // Float value that can be coerced
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        // Enable ACCEPT_FLOAT_AS_INT for this test
        assertEquals(BigInteger.valueOf(123), deserializer.deserialize(parser, createContext(DeserializationFeature.ACCEPT_FLOAT_AS_INT)));
    }
    
    @Test
    public void testBigIntegerDeserializerStringValue() throws Exception {
        JsonDeserializer<BigInteger> deserializer = (JsonDeserializer<BigInteger>) getDeserializer(BigInteger.class);
        JsonParser parser = createParser("\"12345\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(new BigInteger("12345"), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testBigIntegerDeserializerStringEmpty() throws Exception {
        JsonDeserializer<BigInteger> deserializer = (JsonDeserializer<BigInteger>) getDeserializer(BigInteger.class);
        JsonParser parser = createParser("\"\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testBigIntegerDeserializerNull() throws Exception {
        JsonDeserializer<BigInteger> deserializer = (JsonDeserializer<BigInteger>) getDeserializer(BigInteger.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }

    // Test cases for BigDecimalDeserializer
    @Test
    public void testBigDecimalDeserializerValue() throws Exception {
        JsonDeserializer<BigDecimal> deserializer = (JsonDeserializer<BigDecimal>) getDeserializer(BigDecimal.class);
        JsonParser parser = createParser("123.456");
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal("123.456"), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testBigDecimalDeserializerBigValue() throws Exception {
        JsonDeserializer<BigDecimal> deserializer = (JsonDeserializer<BigDecimal>) getDeserializer(BigDecimal.class);
        JsonParser parser = createParser("12345678901234567890.12345678901234567890");
        parser.nextToken(); // Advance to VALUE_NUMBER_FLOAT
        assertEquals(new BigDecimal("12345678901234567890.12345678901234567890"), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testBigDecimalDeserializerStringValue() throws Exception {
        JsonDeserializer<BigDecimal> deserializer = (JsonDeserializer<BigDecimal>) getDeserializer(BigDecimal.class);
        JsonParser parser = createParser("\"-987.654\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertEquals(new BigDecimal("-987.654"), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testBigDecimalDeserializerStringEmpty() throws Exception {
        JsonDeserializer<BigDecimal> deserializer = (JsonDeserializer<BigDecimal>) getDeserializer(BigDecimal.class);
        JsonParser parser = createParser("\"\"");
        parser.nextToken(); // Advance to VALUE_STRING
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testBigDecimalDeserializerNull() throws Exception {
        JsonDeserializer<BigDecimal> deserializer = (JsonDeserializer<BigDecimal>) getDeserializer(BigDecimal.class);
        JsonParser parser = createParser("null");
        parser.nextToken(); // Advance to VALUE_NULL
        assertNull(deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testPrimitiveIntegerDeserializer() throws Exception {
        JsonDeserializer<Integer> deserializer = (JsonDeserializer<Integer>) NumberDeserializers.find(Integer.TYPE, Integer.TYPE.getName());
        JsonParser parser = createParser("5");
        parser.nextToken();
        assertEquals(Integer.valueOf(5), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testPrimitiveBooleanDeserializer() throws Exception {
        JsonDeserializer<Boolean> deserializer = (JsonDeserializer<Boolean>) NumberDeserializers.find(Boolean.TYPE, Boolean.TYPE.getName());
        JsonParser parser = createParser("true");
        parser.nextToken();
        assertEquals(Boolean.TRUE, deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testPrimitiveLongDeserializer() throws Exception {
        JsonDeserializer<Long> deserializer = (JsonDeserializer<Long>) NumberDeserializers.find(Long.TYPE, Long.TYPE.getName());
        JsonParser parser = createParser("10000000000");
        parser.nextToken();
        assertEquals(Long.valueOf(10000000000L), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testPrimitiveDoubleDeserializer() throws Exception {
        JsonDeserializer<Double> deserializer = (JsonDeserializer<Double>) NumberDeserializers.find(Double.TYPE, Double.TYPE.getName());
        JsonParser parser = createParser("1.2345");
        parser.nextToken();
        assertEquals(Double.valueOf(1.2345), deserializer.deserialize(parser, createContext()), 1e-9);
    }

    @Test
    public void testPrimitiveCharacterDeserializer() throws Exception {
        JsonDeserializer<Character> deserializer = (JsonDeserializer<Character>) NumberDeserializers.find(Character.TYPE, Character.TYPE.getName());
        JsonParser parser = createParser("99"); // ASCII for 'c'
        parser.nextToken();
        assertEquals(Character.valueOf('c'), deserializer.deserialize(parser, createContext()));
    }
    
    @Test
    public void testPrimitiveByteDeserializer() throws Exception {
        JsonDeserializer<Byte> deserializer = (JsonDeserializer<Byte>) NumberDeserializers.find(Byte.TYPE, Byte.TYPE.getName());
        JsonParser parser = createParser("10");
        parser.nextToken();
        assertEquals(Byte.valueOf((byte) 10), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testPrimitiveShortDeserializer() throws Exception {
        JsonDeserializer<Short> deserializer = (JsonDeserializer<Short>) NumberDeserializers.find(Short.TYPE, Short.TYPE.getName());
        JsonParser parser = createParser("1000");
        parser.nextToken();
        assertEquals(Short.valueOf((short) 1000), deserializer.deserialize(parser, createContext()));
    }

    @Test
    public void testPrimitiveFloatDeserializer() throws Exception {
        JsonDeserializer<Float> deserializer = (JsonDeserializer<Float>) NumberDeserializers.find(Float.TYPE, Float.TYPE.getName());
        JsonParser parser = createParser("3.14159");
        parser.nextToken();
        assertEquals(Float.valueOf(3.14159f), deserializer.deserialize(parser, createContext()), 1e-6f);
    }
}
```