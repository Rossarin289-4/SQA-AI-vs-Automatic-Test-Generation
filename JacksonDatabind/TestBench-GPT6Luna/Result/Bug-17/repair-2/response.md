```java
package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.*;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class ObjectMapperTest {
    @Test
    public void testDefaultTypingObjectAndConcreteObjects() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Object.class)));
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testDefaultTypingObjectAndConcreteInterfaces() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(List.class)));
    }

    @Test
    public void testDefaultTypingObjectAndConcreteTreeExclusion() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(JsonNode.class)));
    }

    @Test
    public void testDefaultTypingArraysOfInterfaces() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(List[].class)));
    }

    @Test
    public void testDefaultTypingArraysOfConcreteTypes() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String[].class)));
    }

    @Test
    public void testDefaultTypingNonFinalNaturalAndOrdinaryTypes() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String.class)));
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Number.class)));
    }

    @Test
    public void testDefaultTypingNonFinalArrayOfNonFinal() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Number[].class)));
    }

    @Test
    public void testDefaultTypingNonFinalTreeArrayExclusion() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(JsonNode[].class)));
    }

    @Test
    public void testDefaultTypingJavaLangObjectOnly() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Object.class)));
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(List.class)));
    }

    @Test
    public void testDefaultTypingBuildMethodsUseApplicability() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertNull(b.buildTypeDeserializer(mapper.getDeserializationConfig(),
                TypeFactory.defaultInstance().constructType(String.class), Collections.<NamedType>emptyList()));
        assertNull(b.buildTypeSerializer(mapper.getSerializationConfig(),
                TypeFactory.defaultInstance().constructType(String.class), Collections.<NamedType>emptyList()));
    }

    @Test
    public void testDefaultTypingBuildMethodsForObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertNotNull(b.buildTypeDeserializer(mapper.getDeserializationConfig(),
                TypeFactory.defaultInstance().constructType(Object.class), Collections.<NamedType>emptyList()));
        assertNotNull(b.buildTypeSerializer(mapper.getSerializationConfig(),
                TypeFactory.defaultInstance().constructType(Object.class), Collections.<NamedType>emptyList()));
    }

    @Test
    public void testCopyHasEquivalentDefaultConfigurations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper copy = mapper.copy();
        assertEquals(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT),
                copy.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertEquals(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES),
                copy.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testRegisterModulesVarargsReturnsMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.registerModules(new Module[0]));
    }

    @Test
    public void testRegisterModulesIterableReturnsMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.registerModules(Collections.<Module>emptyList()));
    }

    @Test
    public void testFindModulesWithExplicitClassLoader() throws Exception {
        assertNotNull(ObjectMapper.findModules(ObjectMapperTest.class.getClassLoader()));
    }

    @Test
    public void testFindAndRegisterModulesReturnsMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.findAndRegisterModules());
    }

    @Test
    public void testMixInAddFindAndReplace() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(String.class, Integer.class);
        assertSame(Integer.class, mapper.findMixInClassFor(String.class));
        assertEquals(1, mapper.mixInCount());
        mapper.addMixIn(String.class, Long.class);
        assertSame(Long.class, mapper.findMixInClassFor(String.class));
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testSetMixInAnnotationsClearsWhenNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(String.class, Integer.class);
        mapper.setMixInAnnotations(null);
        assertEquals(0, mapper.mixInCount());
        assertNull(mapper.findMixInClassFor(String.class));
    }

    @Test
    public void testSetMixInAnnotationsCopiesEntries() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(String.class, Integer.class);
        mapper.setMixInAnnotations(mixins);
        mixins.clear();
        assertSame(Integer.class, mapper.findMixInClassFor(String.class));
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testSetTypeFactoryUpdatesMapperAndConfigs() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory factory = TypeFactory.defaultInstance();
        assertSame(mapper, mapper.setTypeFactory(factory));
        assertSame(factory, mapper.getTypeFactory());
        assertSame(factory, mapper.getSerializationConfig().getTypeFactory());
        assertSame(factory, mapper.getDeserializationConfig().getTypeFactory());
    }

    @Test
    public void testConstructTypeForStringClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(String.class, mapper.constructType(String.class).getRawClass());
    }

    @Test
    public void testEnableAndDisableDefaultTyping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.enableDefaultTyping());
        assertNotNull(mapper.getSerializationConfig().getDefaultTyper(
                TypeFactory.defaultInstance().constructType(Object.class)));
        assertSame(mapper, mapper.disableDefaultTyping());
        assertNull(mapper.getSerializationConfig().getDefaultTyper(
                TypeFactory.defaultInstance().constructType(Object.class)));
    }

    @Test
    public void testSetAndGetSerializationFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory original = mapper.getSerializerFactory();
        assertNotNull(original);
        assertSame(original, mapper.setSerializerFactory(original).getSerializerFactory());
    }

    @Test
    public void testSetAndGetSerializerProvider() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider provider = mapper.getSerializerProvider();
        assertNotNull(provider);
        assertSame(provider, mapper.setSerializerProvider((DefaultSerializerProvider) provider)
                .getSerializerProvider());
    }

    @Test
    public void testSetAndGetNodeFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory factory = JsonNodeFactory.instance;
        assertSame(mapper, mapper.setNodeFactory(factory));
        assertSame(factory, mapper.getNodeFactory());
        assertEquals(0, mapper.createObjectNode().size());
        assertEquals(0, mapper.createArrayNode().size());
    }

    @Test
    public void testMapperFeatureStateChanges() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, false);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.enable(MapperFeature.AUTO_DETECT_FIELDS);
        assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.disable(MapperFeature.AUTO_DETECT_FIELDS);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testSerializationAndDeserializationFeatureStateChanges() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT);
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        assertNotNull(new ObjectMapper().version());
    }

    @Test
    public void testMapperContextAccessors() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper.getSerializationConfig(), mapper.getSerializationConfig());
        assertSame(mapper.getDeserializationConfig(), mapper.getDeserializationConfig());
        assertNotNull(mapper.getDeserializationContext());
    }

    @Test
    public void testAddMixInAnnotationsAddsAndReplacesEntry() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(String.class, Integer.class);
        assertSame(Integer.class, mapper.findMixInClassFor(String.class));
        mapper.addMixInAnnotations(String.class, Long.class);
        assertSame(Long.class, mapper.findMixInClassFor(String.class));
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testVisibilityConfigurationReturnsConfiguredChecker() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        VisibilityChecker<?> original = mapper.getVisibilityChecker();
        assertNotNull(original);
        mapper.setVisibilityChecker(original);
        assertNotNull(mapper.getVisibilityChecker());
        assertSame(mapper, mapper.setVisibility(PropertyAccessor.FIELD,
                JsonAutoDetect.Visibility.ANY));
    }

    @Test
    public void testSubtypeResolverCanBeSetAndRetrieved() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SubtypeResolver resolver = mapper.getSubtypeResolver();
        assertNotNull(resolver);
        assertSame(mapper, mapper.setSubtypeResolver(resolver));
        assertSame(resolver, mapper.getSubtypeResolver());
    }

    @Test
    public void testAnnotationIntrospectorConfiguration() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertSame(mapper, mapper.setAnnotationIntrospector(ai));
        assertSame(mapper, mapper.setAnnotationIntrospectors(ai, ai));
    }

    @Test
    public void testNamingAndInclusionConfiguration() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PropertyNamingStrategy naming = PropertyNamingStrategy.LOWER_CAMEL_CASE;
        assertSame(mapper, mapper.setPropertyNamingStrategy(naming));
        assertSame(mapper, mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL));
    }

    @Test
    public void testDefaultTypingAsPropertyAndExplicitTyper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.enableDefaultTypingAsProperty(
                ObjectMapper.DefaultTyping.NON_FINAL, "kind"));
        assertNotNull(mapper.getSerializationConfig().getDefaultTyper(
                TypeFactory.defaultInstance().constructType(Object.class)));
        assertSame(mapper, mapper.setDefaultTyping(null));
        assertNull(mapper.getSerializationConfig().getDefaultTyper(
                TypeFactory.defaultInstance().constructType(Object.class)));
    }

    @Test
    public void testClearProblemHandlersAndSetDeserializationConfig() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.clearProblemHandlers());
        DeserializationConfig config = mapper.getDeserializationConfig();
        assertSame(mapper, mapper.setConfig(config));
        assertSame(config, mapper.getDeserializationConfig());
    }

    @Test
    public void testSetFiltersDoesNotChangeMapperSerializationConfigAccess() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setFilters(null);
        assertNotNull(mapper.getSerializationConfig());
        assertSame(mapper.getSerializationConfig(), mapper.getSerializationConfig());
    }

    @Test
    public void testRegisterSubtypeClassDoesNotDiscardResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SubtypeResolver resolver = mapper.getSubtypeResolver();
        mapper.registerSubtypes(String.class);
        assertSame(resolver, mapper.getSubtypeResolver());
    }

    @Test
    public void testRegisterModulesEmptyDoesNotChangeMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.registerModules());
        assertNotNull(mapper.getSerializationConfig());
    }
}
```