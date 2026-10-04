```java
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;

public class BasicDeserializerFactoryTest {
    @Test
    public void testFactoryConfig() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.getFactoryConfig());
        assertSame(factory.getFactoryConfig(), factory.getFactoryConfig());
    }

    @Test
    public void testAbstractCollectionFallbacks() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(List.class);
        assertEquals(ArrayList.class, new BeanDeserializerFactory(new DeserializerFactoryConfig())
                .mapAbstractType(mapper.getDeserializationConfig(), type).getRawClass());
    }

    @Test
    public void testAbstractMapFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Map.class);
        assertEquals(LinkedHashMap.class, new BeanDeserializerFactory(new DeserializerFactoryConfig())
                .mapAbstractType(mapper.getDeserializationConfig(), type).getRawClass());
    }

    @Test
    public void testSortedMapFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(SortedMap.class);
        assertEquals(TreeMap.class, new BeanDeserializerFactory(new DeserializerFactoryConfig())
                .mapAbstractType(mapper.getDeserializationConfig(), type).getRawClass());
    }

    @Test
    public void testConcreteTypeRemainsUnchanged() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(HashMap.class);
        assertSame(type, new BeanDeserializerFactory(new DeserializerFactoryConfig())
                .mapAbstractType(mapper.getDeserializationConfig(), type));
    }

    @Test
    public void testDefaultStringDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testDefaultIntegerDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testDefaultUntypedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Object.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testDefaultIterableDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Iterable.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testCreateArrayDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String[].class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createArrayDeserializer(mapper.getDeserializationContext(),
                (ArrayType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testCreateListDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createCollectionDeserializer(mapper.getDeserializationContext(),
                (CollectionType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testCreateMapDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructMapType(Map.class, String.class, Integer.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createMapDeserializer(mapper.getDeserializationContext(),
                (MapType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testCreateEnumDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Thread.State.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createEnumDeserializer(mapper.getDeserializationContext(),
                type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testCreateTreeDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(JsonNode.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createTreeDeserializer(mapper.getDeserializationConfig(),
                type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testFindKeyDeserializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createKeyDeserializer(mapper.getDeserializationContext(),
                mapper.getTypeFactory().constructType(String.class)));
    }

    @Test
    public void testCreateReferenceDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructReferenceType(AtomicReference.class,
                mapper.getTypeFactory().constructType(String.class));
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createReferenceDeserializer(mapper.getDeserializationContext(),
                (ReferenceType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testNoTypeDeserializerWithoutPolymorphicConfiguration() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory.findTypeDeserializer(mapper.getDeserializationConfig(),
                mapper.getTypeFactory().constructType(String.class)));
    }

    @Test
    public void testCollectionLikeDeserializerWithoutCustomHandler() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(ArrayList.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory.createCollectionLikeDeserializer(mapper.getDeserializationContext(),
                (CollectionLikeType) mapper.getTypeFactory().constructCollectionLikeType(ArrayList.class, String.class),
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testMapLikeDeserializerWithoutCustomHandler() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructMapLikeType(HashMap.class, String.class, Integer.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory.createMapLikeDeserializer(mapper.getDeserializationContext(),
                (MapLikeType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testFindValueInstantiatorForHashMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(HashMap.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.findValueInstantiator(mapper.getDeserializationContext(),
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testPropertyTypeDeserializerWithoutAnnotation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory.findPropertyTypeDeserializer(mapper.getDeserializationConfig(), type, null));
    }

    @Test
    public void testPropertyContentTypeDeserializerWithoutAnnotation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory.findPropertyContentTypeDeserializer(mapper.getDeserializationConfig(), type, null));
    }

    @Test
    public void testAdditionalDeserializersReturnsNewFactory() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory updated = factory.withAdditionalDeserializers(new Deserializers.Base());
        assertNotNull(updated);
        assertNotSame(factory, updated);
    }

    @Test
    public void testAdditionalKeyDeserializersReturnsNewFactory() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.withAdditionalKeyDeserializers(null));
    }

    @Test
    public void testDeserializerModifierReturnsNewFactory() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.withDeserializerModifier(null));
    }

    @Test
    public void testAbstractTypeResolverReturnsNewFactory() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.withAbstractTypeResolver(null));
    }

    @Test
    public void testValueInstantiatorsReturnsNewFactory() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.withValueInstantiators(new ValueInstantiators.Base()));
    }

    @Test
    public void testValueInstantiatorInstanceNullDefinition() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory._valueInstantiatorInstance(mapper.getDeserializationConfig(), null, null));
    }

    @Test
    public void testValueInstantiatorInstanceRejectsNonClassDefinition() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        try {
            factory._valueInstantiatorInstance(mapper.getDeserializationConfig(), null, "invalid");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testValueInstantiatorInstanceRejectsWrongClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        try {
            factory._valueInstantiatorInstance(mapper.getDeserializationConfig(), null, String.class);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testValueInstantiatorInstanceBogusClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory._valueInstantiatorInstance(mapper.getDeserializationConfig(), null, Void.class));
    }
}
```