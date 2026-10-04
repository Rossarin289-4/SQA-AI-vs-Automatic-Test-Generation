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
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory result = factory.withConfig(new DeserializerFactoryConfig());
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test
    public void testCreateStdDeserializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBeanDeserializer(
                mapper.getDeserializationContext(), type, desc);
        assertNull(deser);
    }

    @Test
    public void testCreateDeserializerForPrimitiveType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(int.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> deser = BeanDeserializerFactory.instance.createBeanDeserializer(
                mapper.getDeserializationContext(), type, desc);
        assertNull(deser);
    }

    @Test
    public void testCreateDeserializerForBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateThrowableDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalArgumentException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testCreateDeserializerForArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String[].class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(mapper.getDeserializationContext(), type, desc);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCreateDeserializerForEnum() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleEnum.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType valueType = mapper.constructType(SampleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(valueType);
        try {
            BeanDeserializerFactory.instance.createBuilderBasedDeserializer(
                    mapper.getDeserializationContext(), valueType, desc, SampleBuilder.class);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testBuildBeanDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SampleBean.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.buildBeanDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testBuildThrowableDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalStateException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.buildThrowableDeserializer(
                    mapper.getDeserializationContext(), type, desc);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testFactoryInstanceAvailable() throws Exception {
        assertNotNull(BeanDeserializerFactory.instance);
    }

    public static class SampleBean {
        public int value;
        public SampleBean() { }
    }

    public static class SampleBuilder {
        private int value;
        public SampleBuilder withValue(int value) { this.value = value; return this; }
        public SampleBean build() {
            SampleBean bean = new SampleBean();
            bean.value = value;
            return bean;
        }
    }

    public enum SampleEnum { FIRST, SECOND }
}
