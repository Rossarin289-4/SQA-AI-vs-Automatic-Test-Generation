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

public class BeanDeserializerFactoryTest {
    @Test
    public void testWithSameConfigReturnsSameFactory() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        assertSame(factory, factory.withConfig(config));
    }

    @Test
    public void testWithDifferentConfigReturnsNewFactory() throws Exception {
        BeanDeserializerFactory factory =
                new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory result =
                factory.withConfig(new DeserializerFactoryConfig());
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test
    public void testSharedInstanceWithSameConfig() throws Exception {
        assertSame(BeanDeserializerFactory.instance,
                BeanDeserializerFactory.instance.withConfig(
                        new DeserializerFactoryConfig()));
    }

    @Test
    public void testCreateBeanDeserializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<Object> result = BeanDeserializerFactory.instance
                .createBeanDeserializer(null, type, desc);
        assertNull(result);
    }

    @Test
    public void testCreateBeanDeserializerForThrowable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalArgumentException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        assertNotNull(BeanDeserializerFactory.instance.createBeanDeserializer(
                mapper.getDeserializationContext(), type, desc));
    }

    @Test
    public void testBuildThrowableDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalArgumentException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        assertNotNull(BeanDeserializerFactory.instance.buildThrowableDeserializer(
                mapper.getDeserializationContext(), type, desc));
    }

    @Test
    public void testBuildThrowableDeserializerForExceptionSubtype() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(IllegalStateException.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        assertNotNull(BeanDeserializerFactory.instance.buildThrowableDeserializer(
                mapper.getDeserializationContext(), type, desc));
    }

    @Test
    public void testWithConfigDoesNotChangeOriginalFactory() throws Exception {
        DeserializerFactoryConfig original = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(original);
        DeserializerFactory result = factory.withConfig(new DeserializerFactoryConfig());
        assertSame(factory, factory.withConfig(original));
        assertNotSame(factory, result);
    }
}
