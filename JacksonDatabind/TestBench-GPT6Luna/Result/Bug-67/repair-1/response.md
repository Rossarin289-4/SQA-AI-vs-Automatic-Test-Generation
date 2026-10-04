```java
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
    public void testMapAbstractTypeUsesRegisteredMapFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Map.class);
        assertEquals(LinkedHashMap.class,
                factory.mapAbstractType(mapper.getDeserializationConfig(), type).getRawClass());
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
    public void testArrayDeserializerForPrimitiveContent() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        ArrayType type = mapper.getTypeFactory().constructArrayType(int.class);
        assertNotNull(factory.createArrayDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testArrayDeserializerForStringContent() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        ArrayType type = mapper.getTypeFactory().constructArrayType(String.class);
        assertNotNull(factory.createArrayDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testCollectionDeserializerForStringList() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        assertNotNull(factory.createCollectionDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testMapDeserializerForStringKeysAndValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        MapType type = mapper.getTypeFactory().constructMapType(Map.class, String.class, String.class);
        assertNotNull(factory.createMapDeserializer(mapper.getDeserializationContext(), type,
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
    public void testReferenceDeserializerForAtomicReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructReferenceType(AtomicReference.class,
                mapper.getTypeFactory().constructType(String.class));
        assertNotNull(factory.createReferenceDeserializer(mapper.getDeserializationContext(),
                (ReferenceType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testTypeDeserializerAbsentForOrdinaryString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNull(factory.findTypeDeserializer(mapper.getDeserializationConfig(), type));
    }

    @Test
    public void testPropertyTypeDeserializerFallsBackToClassType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNull(factory.findPropertyTypeDeserializer(mapper.getDeserializationConfig(), type, null));
    }

    @Test
    public void testPropertyContentTypeDeserializerFallsBackToContentType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        assertNull(factory.findPropertyContentTypeDeserializer(mapper.getDeserializationConfig(), type, null));
    }

    @Test
    public void testKeyDeserializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        KeyDeserializer deser = factory.createKeyDeserializer(mapper.getDeserializationContext(),
                mapper.getTypeFactory().constructType(String.class));
        assertNotNull(deser);
    }

    @Test
    public void testCollectionLikeDeserializerWithoutCustomHandlerIsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        CollectionLikeType type = mapper.getTypeFactory().constructCollectionLikeType(
                Iterable.class, String.class);
        assertNull(factory.createCollectionLikeDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testMapLikeDeserializerWithoutCustomHandlerIsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        MapLikeType type = mapper.getTypeFactory().constructMapLikeType(
                Properties.class, String.class, String.class);
        assertNull(factory.createMapLikeDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testEnumDeserializerIsCreated() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Thread.State.class);
        assertNotNull(factory.createEnumDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }
}
```