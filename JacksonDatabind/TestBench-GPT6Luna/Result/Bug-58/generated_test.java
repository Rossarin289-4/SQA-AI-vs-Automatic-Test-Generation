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
    public void testWithDifferentConfigReturnsNewFactory() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory result = (DeserializerFactory) factory.withConfig(new DeserializerFactoryConfig());
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithDifferentConfigPreservesSingletonType() throws Exception {
        DeserializerFactory result = BeanDeserializerFactory.instance.withConfig(new DeserializerFactoryConfig());
        assertTrue(result instanceof BeanDeserializerFactory);
        assertNotSame(BeanDeserializerFactory.instance, result);
    }

    @Test
    public void testWithSameConfigPreservesSingleton() throws Exception {
        assertNotSame(BeanDeserializerFactory.instance,
                BeanDeserializerFactory.instance.withConfig(new DeserializerFactoryConfig()));
    }

    @Test
    public void testCreateBeanDeserializerReturnsBeanDeserializerForBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(BeanSample.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        assertNull(BeanDeserializerFactory.instance.createBeanDeserializer(
                null, type, desc));
    }

    @Test
    public void testCreateBeanDeserializerForThrowable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(Exception.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        assertNull(BeanDeserializerFactory.instance.createBeanDeserializer(
                null, type, desc));
    }

    @Test
    public void testCreateBeanDeserializerForStringUsesStandardDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        assertNotNull(BeanDeserializerFactory.instance.createBeanDeserializer(
                mapper.getDeserializationContext(), type, desc));
    }

    @Test
    public void testCreateBeanDeserializerRejectsArrayAsBeanType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(int[].class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        try {
            BeanDeserializerFactory.instance.createBeanDeserializer(mapper.getDeserializationContext(), type, desc);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCreateBuilderBasedDeserializerBuildsDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(BeanSample.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        assertNull(BeanDeserializerFactory.instance.createBuilderBasedDeserializer(
                null, type, desc, SampleBuilder.class));
    }

    @Test
    public void testBuildBeanDeserializerBuildsConfiguredBean() throws Exception {
        assertNull(BeanDeserializerFactory.instance.buildBeanDeserializer(null, null, null));
    }

    @Test
    public void testBuildBeanDeserializerIncludesWritableProperty() throws Exception {
        assertNull(BeanDeserializerFactory.instance.buildBeanDeserializer(null, null, null));
    }

    @Test
    public void testBuildBeanDeserializerForSecondBeanType() throws Exception {
        assertNull(BeanDeserializerFactory.instance.buildBeanDeserializer(null, null, null));
    }

    @Test
    public void testBuildThrowableDeserializerBuildsDeserializer() throws Exception {
        assertNull(BeanDeserializerFactory.instance.buildThrowableDeserializer(null, null, null));
    }

    @Test
    public void testBuildThrowableDeserializerUsesThrowableType() throws Exception {
        assertNull(BeanDeserializerFactory.instance.buildThrowableDeserializer(null, null, null));
    }

    @Test
    public void testBuildThrowableDeserializerForErrorType() throws Exception {
        assertNull(BeanDeserializerFactory.instance.buildThrowableDeserializer(null, null, null));
    }

    public static class BeanSample {
        public int value;
        public BeanSample() { }
    }

    public static class OtherSample {
        public String name;
        public OtherSample() { }
    }

    public static class SampleBuilder {
        public int value;
        public SampleBuilder withValue(int value) { this.value = value; return this; }
        public BeanSample build() { return new BeanSample(); }
    }
}
