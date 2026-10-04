package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;

public class BasicDeserializerFactoryTest {
    @Test
    public void testFactoryConfigIsAvailable() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.getFactoryConfig());
    }

    @Test
    public void testConfigCopyForAdditionalDeserializers() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory copy = factory.withAdditionalDeserializers(new Deserializers.Base());
        assertNotNull(copy);
        assertNotSame(factory, copy);
    }

    @Test
    public void testConfigCopyForAdditionalKeyDeserializers() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory copy = factory.withAdditionalKeyDeserializers(new KeyDeserializers() {
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type, DeserializationConfig config,
                    BeanDescription beanDesc) {
                return null;
            }
        });
        assertNotNull(copy);
        assertNotSame(factory, copy);
    }

    @Test
    public void testConfigCopyForDeserializerModifier() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory copy = factory.withDeserializerModifier(new BeanDeserializerModifier() { });
        assertNotNull(copy);
        assertNotSame(factory, copy);
    }

    @Test
    public void testConfigCopyForAbstractTypeResolver() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory copy = factory.withAbstractTypeResolver(new AbstractTypeResolver() { });
        assertNotNull(copy);
        assertNotSame(factory, copy);
    }

    @Test
    public void testConfigCopyForValueInstantiators() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory copy = factory.withValueInstantiators(new ValueInstantiators.Base() { });
        assertNotNull(copy);
        assertNotSame(factory, copy);
    }

    @Test
    public void testMapAbstractTypeLeavesConcreteTypeUnchanged() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(LinkedHashMap.class);
        assertSame(type, factory.mapAbstractType(mapper.getDeserializationConfig(), type));
    }

    @Test
    public void testDefaultStringDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testDefaultIntegerDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testDefaultObjectDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Object.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testTreeDeserializerForJsonNode() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(JsonNode.class);
        assertNotNull(factory.createTreeDeserializer(mapper.getDeserializationConfig(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testTypeDeserializerAbsentForOrdinaryString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNull(factory.findTypeDeserializer(mapper.getDeserializationConfig(), type));
    }
}
