package com.fasterxml.jackson.databind.struct;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBeanPropertyWriterNullColumn {

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class NullHolder {
        public String name = null;

        public NullHolder() {}
        public NullHolder(String name) {
            this.name = name;
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class MixedHolder {
        public String first = "hello";
        public String second = null;
        public Integer third = 123;

        public MixedHolder() {}
    }

    @Test
    public void testPojoAsArrayWithNullField() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        NullHolder holder = new NullHolder(null);
        String json = mapper.writeValueAsString(holder);
        assertEquals("[null]", json);
    }

    @Test
    public void testPojoAsArrayWithMixedFields() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        MixedHolder holder = new MixedHolder();
        String json = mapper.writeValueAsString(holder);
        assertEquals("[\"hello\",null,123]", json);
    }

    @Test
    public void testPojoAsArrayMultipleNulls() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        NullHolder holder = new NullHolder(null);
        // Serialize twice or verify consecutive null handling
        String json1 = mapper.writeValueAsString(holder);
        String json2 = mapper.writeValueAsString(holder);
        assertEquals("[null]", json1);
        assertEquals("[null]", json2);
    }
}
