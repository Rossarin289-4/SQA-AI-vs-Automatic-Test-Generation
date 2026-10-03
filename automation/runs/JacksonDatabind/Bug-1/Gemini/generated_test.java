package com.fasterxml.jackson.databind.struct;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBeanPropertyWriterNullColumnDefect {

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class SingleNullBean {
        public String name = null;
        public int id = 42;

        public SingleNullBean() {}
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class MultipleNullsBean {
        public Integer boxedInt = null;
        public String text = null;
        public Boolean active = null;

        public MultipleNullsBean() {}
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class MixedValuesBean {
        public String first = "start";
        public String middle = null;
        public String last = "end";

        public MixedValuesBean() {}
    }

    @Test
    public void testSerializePojoAsArrayWithNullStringProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SingleNullBean bean = new SingleNullBean();
        String json = mapper.writeValueAsString(bean);
        assertEquals("[null,42]", json);
    }

    @Test
    public void testSerializePojoAsArrayWithMultipleNullProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        MultipleNullsBean bean = new MultipleNullsBean();
        String json = mapper.writeValueAsString(bean);
        assertEquals("[null,null,null]", json);
    }

    @Test
    public void testSerializePojoAsArrayWithNullAndNonNullMixed() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        MixedValuesBean bean = new MixedValuesBean();
        String json = mapper.writeValueAsString(bean);
        assertEquals("[\"start\",null,\"end\"]", json);
    }
}
