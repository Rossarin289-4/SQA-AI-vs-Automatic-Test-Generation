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
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache;


public class NumberDeserializersTest {

    // Helper method to create a JsonParser for testing
    private JsonParser createParser(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getFactory().createParser(json);
    }

    // Helper method to create a DeserializationContext for testing
    
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

    
    
    // Test cases for ByteDeserializer

    
    // Test cases for ShortDeserializer

    
    // Test cases for CharacterDeserializer



    
    // Test cases for IntegerDeserializer


    

    // Test cases for LongDeserializer


    

    // Test cases for FloatDeserializer


    

    // Test cases for DoubleDeserializer





    

    // Test cases for NumberDeserializer



    
    
    


    



    // Test cases for BigIntegerDeserializer


    

    

    // Test cases for BigDecimalDeserializer



    
    




    


}




