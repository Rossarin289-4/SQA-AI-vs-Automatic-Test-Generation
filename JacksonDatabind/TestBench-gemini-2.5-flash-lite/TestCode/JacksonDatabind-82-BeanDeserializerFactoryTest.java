package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
// Added imports for types used in dummy implementations
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;

public class BeanDeserializerFactoryTest {

    // Dummy enum for testing
    private enum TestEnum { A, B }

    // Helper method to create a minimal DeserializationContext

    // Helper method to create a dummy BeanDescription
    private BeanDescription createDummyBeanDescription(JavaType type) {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        return config.introspect(type);
    }

    @Test
    public void testInstanceCreation() throws Exception {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        assertNotNull(factory);
        assertSame(BeanDeserializerFactory.instance, factory);
    }


    @Test
    public void testWithConfigReturnsSameInstanceWhenSame() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        BeanDeserializerFactory factory2 = (BeanDeserializerFactory) factory.withConfig(config);
        assertSame(factory, factory2);
    }





    // --- Dummy classes for testing ---
    private static class SimpleBean {
        public String name;
        public int age;
        public SimpleBean() {}
        public SimpleBean(String name, int age) { this.name = name; this.age = age; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    private static class ComplexBean {
        public Map<String, Integer> mapField;
        private List<SimpleBean> listField;
        public ComplexBean() {}
        public Map<String, Integer> getMapField() { return mapField; }
        public void setMapField(Map<String, Integer> mapField) { this.mapField = mapField; }
        public List<SimpleBean> getListField() { return listField; }
        public void setListField(List<SimpleBean> listField) { this.listField = listField; }
    }

    private static class BeanWithIgnored {
        public String visible;
        @JsonIgnore public String ignored;
    }

    private static class BeanWithPOJOBuilder {
        public String field1;
        public int field2;
        @JsonPOJOBuilder(buildMethodName = "buildMyBean")
        public static class Builder {
            private String field1;
            private int field2;
            public Builder field1(String value) { this.field1 = value; return this; }
            public Builder field2(int value) { this.field2 = value; return this; }
            // Simplified build method return type to match the context
            public Object buildMyBean() { return new Object(); }
        }
    }

    private static class BeanWithAnySetter {
        private Map<String, Object> unknownProperties = new HashMap<>();
        @JsonAnySetter
        public void setUnknown(String key, Object value) { unknownProperties.put(key, value); }
        public Map<String, Object> getUnknownProperties() { return unknownProperties; }
    }

    // --- Tests for helper methods ---









    @Test
    public void testIsPotentialBeanType_Valid() {
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(SimpleBean.class));
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(Object.class));
    }

    @Test
    public void testIsPotentialBeanType_Primitive() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(int.class);
            fail("Should throw IllegalArgumentException for primitive types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class int"));
        }
    }

    @Test
    public void testIsPotentialBeanType_Array() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(String[].class);
            fail("Should throw IllegalArgumentException for array types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class [Ljava.lang.String"));
        }
    }

    @Test
    public void testIsPotentialBeanType_Enum() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(TestEnum.class); // Use the top-level dummy enum
            fail("Should throw IllegalArgumentException for enum types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class .*TestEnum")); // Using regex for flexibility
        }
    }

    @Test
    public void testIsPotentialBeanType_ProxyOrInterface() {
        try {
            BeanDeserializerFactory.instance.isPotentialBeanType(List.class);
            fail("Should throw IllegalArgumentException for interface types");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Class java.util.List"));
        }
    }












}




