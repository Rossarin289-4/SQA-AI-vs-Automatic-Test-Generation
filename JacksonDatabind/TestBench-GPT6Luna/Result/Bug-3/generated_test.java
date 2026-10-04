package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

public class StringArrayDeserializerTest {
    @Test
    public void testHandledType() throws Exception {
        assertEquals(String[].class, StringArrayDeserializer.instance.handledType());
    }

    @Test
    public void testEmptyArray() throws Exception {
        String[] result = new ObjectMapper().readValue("[]", String[].class);
        assertArrayEquals(new String[0], result);
    }

    @Test
    public void testSingleStringInArray() throws Exception {
        String[] result = new ObjectMapper().readValue("[\"oak\"]", String[].class);
        assertArrayEquals(new String[] {"oak"}, result);
    }

    @Test
    public void testMultipleStringsInArray() throws Exception {
        String[] result = new ObjectMapper().readValue("[\"oak\",\"elm\"]", String[].class);
        assertArrayEquals(new String[] {"oak", "elm"}, result);
    }

    @Test
    public void testNullInsideArray() throws Exception {
        String[] result = new ObjectMapper().readValue("[\"oak\",null]", String[].class);
        assertArrayEquals(new String[] {"oak", null}, result);
    }

    @Test
    public void testEmptyStringInsideArray() throws Exception {
        String[] result = new ObjectMapper().readValue("[\"\"]", String[].class);
        assertArrayEquals(new String[] {""}, result);
    }

    @Test
    public void testBooleanCoercedInsideArray() throws Exception {
        String[] result = new ObjectMapper().readValue("[true]", String[].class);
        assertArrayEquals(new String[] {"true"}, result);
    }

    @Test
    public void testIntegerCoercedInsideArray() throws Exception {
        String[] result = new ObjectMapper().readValue("[7]", String[].class);
        assertArrayEquals(new String[] {"7"}, result);
    }

    @Test
    public void testArrayObjectTokenRejected() throws Exception {
        try {
            new ObjectMapper().readValue("[{}]", String[].class);
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
        }
    }

    @Test
    public void testSingleValueAcceptedAsArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertArrayEquals(new String[] {"birch"}, mapper.readValue("\"birch\"", String[].class));
    }

    @Test
    public void testSingleNullAcceptedAsArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertNull(mapper.readValue("null", String[].class));
    }

    @Test
    public void testSingleValueDisabledByDefault() throws Exception {
        try {
            new ObjectMapper().readValue("\"birch\"", String[].class);
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
        }
    }

    @Test
    public void testEmptyStringAsNullWhenEnabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertNull(mapper.readValue("\"\"", String[].class));
    }

    @Test
    public void testEmptyStringNotNullWhenFeatureDisabled() throws Exception {
        try {
            new ObjectMapper().readValue("\"\"", String[].class);
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
        }
    }

    @Test
    public void testLongArrayAcrossBufferChunks() throws Exception {
        String json = "[\"a\",\"b\",\"c\",\"d\",\"e\",\"f\",\"g\",\"h\",\"i\",\"j\",\"k\",\"l\",\"m\",\"n\",\"o\",\"p\",\"q\",\"r\",\"s\",\"t\",\"u\",\"v\",\"w\",\"x\",\"y\"]";
        String[] expected = new String[25];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = String.valueOf((char) ('a' + i));
        }
        assertArrayEquals(expected, new ObjectMapper().readValue(json, String[].class));
    }

    @Test
    public void testContextualDeserializerReturnsDefaultInstance() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonDeserializer<?> result =
                StringArrayDeserializer.instance.createContextual(mapper.getDeserializationContext(), null);
        assertSame(StringArrayDeserializer.instance, result);
    }
}
