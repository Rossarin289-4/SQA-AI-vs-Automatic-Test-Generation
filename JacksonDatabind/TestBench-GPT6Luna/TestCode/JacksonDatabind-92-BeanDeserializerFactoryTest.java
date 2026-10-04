package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;

public class BeanDeserializerFactoryTest {
    @Test
    public void testWithSameConfigReturnsSameFactory() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        assertSame(factory, factory.withConfig(config));
    }

    @Test
    public void testWithDifferentConfigReturnsFactory() throws Exception {
        BeanDeserializerFactory factory = BeanDeserializerFactory.instance;
        DeserializerFactory result = factory.withConfig(new DeserializerFactoryConfig());
        assertNotNull(result);
        assertNotSame(factory, result);
        assertSame(factory, BeanDeserializerFactory.instance);
    }

    @Test
    public void testCreateStandardStringDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance
                .createBeanDeserializer(mapper.getDeserializationContext(), type, desc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateBeanDeserializerForOrdinaryBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testCreateBeanDeserializerForIntegerStandardType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(Integer.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance
                .createBeanDeserializer(mapper.getDeserializationContext(), type, desc);
        assertNotNull(deser);
    }

    @Test
    public void testBuildBeanDeserializerForBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.buildBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testBuildThrowableDeserializerForException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalArgumentException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.buildThrowableDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testCreateBeanDeserializerForThrowable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalArgumentException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testCreateBeanDeserializerForPrimitiveReturnsDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(int.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBeanDeserializer(
                mapper.getDeserializationContext(), type, desc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateBeanDeserializerForArrayFailsAsBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean[].class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testBuildDeserializerHasBeanProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.buildBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testBuiltBeanDeserializerKeepsDefaultPropertyWhenMissing() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.buildBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testBuildThrowableDeserializerWithMessage() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalArgumentException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.buildThrowableDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType valueType = mapper.constructType(BuiltBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(valueType);
        try {
            BeanDeserializerFactory.instance.createBuilderBasedDeserializer(
                    mapper.getDeserializationContext(), valueType, desc, BuiltBean.Builder.class);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    public static class SampleBean {
        private int value;

        public SampleBean() {
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static class BuiltBean {
        private final int value;

        public BuiltBean(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static class Builder {
            private int value;

            public Builder withValue(int value) {
                this.value = value;
                return this;
            }

            public BuiltBean build() {
                return new BuiltBean(value);
            }
        }
    }
}
