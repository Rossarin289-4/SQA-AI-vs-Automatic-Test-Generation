package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.lang.reflect.Modifier;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;

public class BasicDeserializerFactoryTest {
    @Test
    public void testMapAbstractTypeLeavesConcreteUnchanged() throws Exception {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        JavaType type = config.constructType(String.class);
        assertSame(type, factory.mapAbstractType(config, type));
    }

    @Test
    public void testConfiguredAbstractTypeMapping() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, LinkedList.class);
        BeanDeserializerFactory factory = (BeanDeserializerFactory)
                new BeanDeserializerFactory(new DeserializerFactoryConfig()).withAbstractTypeResolver(resolver);
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        JavaType mapped = factory.mapAbstractType(config, config.constructType(List.class));
        assertEquals(LinkedList.class, mapped.getRawClass());
    }

    @Test
    public void testAbstractTypeMappingRejectsSelf() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        try {
            resolver.addMapping(List.class, List.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertNull(resolver.findTypeMapping(new ObjectMapper().getDeserializationConfig(),
                new ObjectMapper().getTypeFactory().constructType(List.class)));
    }


    @Test
    public void testAbstractTypeMappingRejectsConcreteSupertype() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        try {
            resolver.addMapping(String.class, String.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertNull(resolver.findTypeMapping(new ObjectMapper().getDeserializationConfig(),
                new ObjectMapper().getTypeFactory().constructType(String.class)));
    }

    @Test
    public void testFactoryConfigIsRetained() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        assertSame(config, factory.getFactoryConfig());
    }

    @Test
    public void testStringDefaultDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(factory.findDefaultDeserializer(ctxt, type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testObjectDefaultDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Object.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testIntegerDefaultDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        assertNotNull(factory.findDefaultDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testStringArrayDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String[].class);
        assertNotNull(factory.createArrayDeserializer(mapper.getDeserializationContext(),
                (ArrayType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testPrimitiveArrayDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(int[].class);
        assertNotNull(factory.createArrayDeserializer(mapper.getDeserializationContext(),
                (ArrayType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testListDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        assertNotNull(factory.createCollectionDeserializer(mapper.getDeserializationContext(),
                (CollectionType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testStringMapDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructMapType(Map.class, String.class, String.class);
        assertNotNull(factory.createMapDeserializer(mapper.getDeserializationContext(),
                (MapType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testNoDefaultTypeDeserializerWithoutTypeMetadata() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNull(factory.findTypeDeserializer(mapper.getDeserializationConfig(),
                mapper.getTypeFactory().constructType(String.class)));
    }

    @Test
    public void testEnumKeyDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(factory.createKeyDeserializer(mapper.getDeserializationContext(),
                mapper.getTypeFactory().constructType(Thread.State.class)));
    }

    @Test
    public void testSimpleAbstractResolverReturnsNoMaterialization() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, LinkedList.class);
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        JavaType type = config.constructType(List.class);
        assertNull(resolver.resolveAbstractType(config, type));
    }

    @Test
    public void testFactoryConfigCopyAddsAbstractResolver() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, LinkedList.class);
        BeanDeserializerFactory original = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory copy = original.withAbstractTypeResolver(resolver);
        assertEquals(LinkedList.class, copy.mapAbstractType(new ObjectMapper().getDeserializationConfig(),
                new ObjectMapper().getTypeFactory().constructType(List.class)).getRawClass());
    }

    @Test
    public void testFactoryConfigCopyAddsDeserializerProvider() throws Exception {
        BeanDeserializerFactory original = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(original.withAdditionalDeserializers(null));
    }

    @Test
    public void testFactoryConfigCopyAddsKeyDeserializerProvider() throws Exception {
        BeanDeserializerFactory original = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(original.withAdditionalKeyDeserializers(null));
    }

    @Test
    public void testFactoryConfigCopyAddsModifier() throws Exception {
        BeanDeserializerFactory original = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(original.withDeserializerModifier(null));
    }

    @Test
    public void testFactoryConfigCopyAddsValueInstantiators() throws Exception {
        BeanDeserializerFactory original = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertNotNull(original.withValueInstantiators(null));
    }

    @Test
    public void testFindValueInstantiatorForJsonLocation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(JsonLocation.class);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(type);
        ValueInstantiator inst = factory.findValueInstantiator(mapper.getDeserializationContext(), desc);
        assertNotNull(inst);
    }

    @Test
    public void testValueInstantiatorInstanceReturnsProvidedInstance() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        ValueInstantiator inst = factory.findValueInstantiator(mapper.getDeserializationContext(),
                mapper.getDeserializationConfig().introspect(mapper.getTypeFactory().constructType(JsonLocation.class)));
        assertSame(inst, factory._valueInstantiatorInstance(mapper.getDeserializationConfig(), null, inst));
    }

    @Test
    public void testCollectionLikeDeserializerWithoutProviderReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructCollectionLikeType(Iterable.class, String.class);
        assertNull(factory.createCollectionLikeDeserializer(mapper.getDeserializationContext(),
                (CollectionLikeType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testMapLikeDeserializerWithoutProviderReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructMapLikeType(HashMap.class, String.class, String.class);
        assertNull(factory.createMapLikeDeserializer(mapper.getDeserializationContext(),
                (MapLikeType) type, mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testEnumDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(Thread.State.class);
        assertNotNull(factory.createEnumDeserializer(mapper.getDeserializationContext(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testTreeDeserializerExists() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(JsonNode.class);
        assertNotNull(factory.createTreeDeserializer(mapper.getDeserializationConfig(), type,
                mapper.getDeserializationConfig().introspect(type)));
    }

    @Test
    public void testPropertyTypeDeserializerUsesNoDefaultWithoutAnnotations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        AnnotatedMember member = mapper.getDeserializationConfig()
                .introspect(mapper.getTypeFactory().constructType(JsonLocation.class))
                .findProperties().get(0).getPrimaryMember();
        assertNull(factory.findPropertyTypeDeserializer(mapper.getDeserializationConfig(),
                mapper.getTypeFactory().constructType(String.class), member));
    }

    @Test
    public void testPropertyContentTypeDeserializerUsesNoDefaultWithoutAnnotations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        AnnotatedMember member = mapper.getDeserializationConfig()
                .introspect(mapper.getTypeFactory().constructType(JsonLocation.class))
                .findProperties().get(0).getPrimaryMember();
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        assertNull(factory.findPropertyContentTypeDeserializer(mapper.getDeserializationConfig(), type, member));
    }

    @Test
    public void testDeserializerCacheStartsEmptyAndFlushes() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        assertEquals(0, cache.cachedDeserializersCount());
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializerCache cache = new DeserializerCache();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(cache.findValueDeserializer(mapper.getDeserializationContext(), factory, type));
    }

    @Test
    public void testHasValueDeserializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializerCache cache = new DeserializerCache();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertTrue(cache.hasValueDeserializerFor(mapper.getDeserializationContext(), factory, type));
    }

    @Test
    public void testFindKeyDeserializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializerCache cache = new DeserializerCache();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(cache.findKeyDeserializer(mapper.getDeserializationContext(), factory, type));
    }

    @Test
    public void testTypeDeserializerAccessors() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType base = mapper.getTypeFactory().constructType(Object.class);
        AsArrayTypeDeserializer td = new AsArrayTypeDeserializer(base, null, "kind", false, null);
        assertEquals(Object.class.getName(), td.baseTypeName());
        assertEquals("kind", td.getPropertyName());
        assertNull(td.getTypeIdResolver());
        assertNull(td.getDefaultImpl());
        assertEquals(JsonTypeInfo.As.WRAPPER_ARRAY, td.getTypeInclusion());
        assertTrue(td.toString().contains(Object.class.getName()));
    }

    @Test
    public void testTypeDeserializerForPropertyKeepsConfiguredName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AsWrapperTypeDeserializer td = new AsWrapperTypeDeserializer(
                mapper.getTypeFactory().constructType(Object.class), null, "kind", true, null);
        TypeDeserializer copy = td.forProperty(null);
        assertEquals("kind", copy.getPropertyName());
    }
}

