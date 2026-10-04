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
    public void testEmptyArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertArrayEquals(new String[0], mapper.readValue("[]", String[].class));
    }

    @Test
    public void testSingleStringArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertArrayEquals(new String[] {"x"}, mapper.readValue("[\"x\"]", String[].class));
    }

    @Test
    public void testMultipleStrings() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertArrayEquals(new String[] {"a", "b", "c"},
                mapper.readValue("[\"a\",\"b\",\"c\"]", String[].class));
    }

    @Test
    public void testNullElement() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertArrayEquals(new String[] {"a", null, "b"},
                mapper.readValue("[\"a\",null,\"b\"]", String[].class));
    }

    @Test
    public void testNonStringScalarElementsAreParsedAsStrings() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertArrayEquals(new String[] {"1", "true"},
                mapper.readValue("[1,true]", String[].class));
    }

    @Test
    public void testArrayLargerThanInitialBuffer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertArrayEquals(new String[] {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
                "30", "31", "32", "33", "34", "35", "36", "37", "38", "39"
        }, mapper.readValue("[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\","
                + "\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\","
                + "\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\","
                + "\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\"]",
                String[].class));
    }

    @Test
    public void testSingleValueAsArrayEnabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertArrayEquals(new String[] {"x"}, mapper.readValue("\"x\"", String[].class));
    }

    @Test
    public void testNullSingleValueAsArrayEnabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertNull(mapper.readValue("null", String[].class));
    }

    @Test
    public void testSingleValueArrayFeatureDisabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("\"x\"", String[].class);
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
        }
    }

    @Test
    public void testEmptyStringAsNullObjectEnabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertNull(mapper.readValue("\"\"", String[].class));
    }

    @Test
    public void testEmptyStringAsNullObjectDisabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("\"\"", String[].class);
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
        }
    }

    @Test
    public void testSingleValueFeatureTakesPrecedenceForEmptyString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        assertArrayEquals(new String[] {""}, mapper.readValue("\"\"", String[].class));
    }

    @Test
    public void testDeserializerHandlesStringArrayType() throws Exception {
        assertEquals(String[].class, StringArrayDeserializer.instance.handledType());
    }

    @Test
    public void testContextualDeserializerUsesDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(StringArrayDeserializer.instance,
                StringArrayDeserializer.instance.createContextual(null, null));
    }
}
