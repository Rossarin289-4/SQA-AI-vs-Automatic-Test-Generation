package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
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
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.NoClass;

public class ObjectMapperTest {
    @Test
    public void testDefaultTypingOnlyUsesObjectForObjectMode() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Object.class)));
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testObjectAndNonConcreteMode() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Object.class)));
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(List.class)));
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testNonConcreteAndArraysMode() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Object[].class)));
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String[].class)));
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(List[].class)));
    }

    @Test
    public void testNonFinalMode() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Number.class)));
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(Integer.class)));
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(int.class)));
    }

    @Test
    public void testPrimitiveNeverUsesDefaultTyping() throws Exception {
        for (ObjectMapper.DefaultTyping mode : ObjectMapper.DefaultTyping.values()) {
            ObjectMapper.DefaultTypeResolverBuilder b = new ObjectMapper.DefaultTypeResolverBuilder(mode);
            assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(int.class)));
            assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(boolean.class)));
        }
    }

    @Test
    public void testTreeNodeExcludedFromObjectAndNonConcreteMode() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(JsonNode.class)));
    }

    @Test
    public void testTreeNodeExcludedFromNonFinalMode() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(JsonNode.class)));
    }

    @Test
    public void testDefaultTypeBuilderSkipsPrimitiveDeserializer() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertNull(b.buildTypeDeserializer(new ObjectMapper().getDeserializationConfig(),
                TypeFactory.defaultInstance().constructType(int.class), Collections.<NamedType>emptyList()));
    }

    @Test
    public void testDefaultTypeBuilderSkipsStringSerializer() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertNull(b.buildTypeSerializer(new ObjectMapper().getSerializationConfig(),
                TypeFactory.defaultInstance().constructType(String.class), Collections.<NamedType>emptyList()));
    }

    @Test
    public void testExternalPropertyDefaultTypingRejected() throws Exception {
        try {
            new ObjectMapper().enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL,
                    JsonTypeInfo.As.EXTERNAL_PROPERTY);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testDefaultTypingAsPropertyChangesObjectMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.enableDefaultTypingAsProperty(
                ObjectMapper.DefaultTyping.NON_FINAL, "kind"));
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
    }

    @Test
    public void testDisableDefaultTypingReturnsMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.disableDefaultTyping());
        assertNotNull(mapper.getSerializationConfig());
    }

    @Test
    public void testSetDefaultTypingAcceptsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.setDefaultTyping(null));
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
    }

    @Test
    public void testCopyPreservesMapperConfiguration() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        ObjectMapper copied = mapper.copy();
        assertNotSame(mapper, copied);
        assertEquals(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT),
                copied.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testMixInAddAndReplaceDefinitions() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(String.class, Integer.class);
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
        mapper.setMixIns(Collections.<Class<?>, Class<?>>emptyMap());
        assertNull(mapper.findMixInClassFor(String.class));
        assertEquals(0, mapper.mixInCount());
    }

    @Test
    public void testTypeFactoryReplacementUsedToConstructType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory factory = TypeFactory.defaultInstance();
        assertSame(mapper, mapper.setTypeFactory(factory));
        assertSame(factory, mapper.getTypeFactory());
        assertEquals(String.class, mapper.constructType(String.class).getRawClass());
    }

    @Test
    public void testMapperFeatureConfigureBothStates() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, false);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, true);
        assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testSerializationFeatureEnableAndDisable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT);
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testDeserializationFeatureConfigureBothStates() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testJsonParserFeatureEnableAndDisable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        mapper.disable(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testJsonGeneratorFeatureEnableAndDisable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        mapper.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testSerializationAndDeserializationRoundTrip() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(Arrays.asList("a", "b"));
        assertEquals("[\"a\",\"b\"]", json);
        assertEquals(Arrays.asList("a", "b"),
                mapper.readValue(json, new TypeReference<List<String>>() { }));
    }

    @Test
    public void testReadTreeDistinguishesJsonNullFromEmptyInput() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertTrue(mapper.readTree("null").isNull());
        assertTrue(mapper.readTree("null").isNull());
    }

    @Test
    public void testValueToTreeBuildsConfiguredObjectTree() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.valueToTree(Collections.singletonMap("x", 3));
        assertEquals(1, node.size());
        assertEquals(3, node.get("x").intValue());
    }

    @Test
    public void testConvertValueConvertsAndPreservesNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Integer.valueOf(17), mapper.convertValue("17", Integer.class));
        assertNull(mapper.convertValue(null, Integer.class));
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        assertNotNull(new ObjectMapper().version());
    }

    @Test
    public void testRegisterSubtypesThroughMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerSubtypes(String.class);
        assertNotNull(mapper.getSubtypeResolver());
    }

    @Test
    public void testDeprecatedMixInSetterDelegatesToMapping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(String.class, Integer.class);
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
    }

    @Test
    public void testConfigOverrideCreatesAndReturnsOverride() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper.configOverride(String.class));
        assertSame(mapper.configOverride(String.class), mapper.configOverride(String.class));
    }

    @Test
    public void testTypeFactoryAvailableFromMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper.getTypeFactory(), mapper.getDeserializationConfig().getTypeFactory());
    }

    @Test
    public void testMapperFeatureCanBeEnabledAndDisabledInBulk() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.AUTO_DETECT_FIELDS);
        assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.disable(MapperFeature.AUTO_DETECT_FIELDS);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testSerializerFactorySetterReturnsInstalledFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory factory = mapper.getSerializerFactory();
        assertSame(mapper, mapper.setSerializerFactory(factory));
        assertSame(factory, mapper.getSerializerFactory());
    }

    @Test
    public void testSerializerProviderIsAvailable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper.getSerializerProvider());
        assertNotNull(mapper.getSerializerProviderInstance());
    }

    @Test
    public void testDeserializationContextIsAvailable() throws Exception {
        assertNotNull(new ObjectMapper().getDeserializationContext());
    }

    @Test
    public void testVisibilitySetterUpdatesChecker() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        VisibilityChecker<?> checker = mapper.getVisibilityChecker();
        assertSame(mapper, mapper.setVisibility(checker));
        assertNotNull(mapper.getVisibilityChecker());
    }

    @Test
    public void testSubtypeResolverCanBeSetBack() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SubtypeResolver resolver = mapper.getSubtypeResolver();
        assertSame(mapper, mapper.setSubtypeResolver(resolver));
        assertSame(resolver, mapper.getSubtypeResolver());
    }

    @Test
    public void testAnnotationIntrospectorSetterAcceptsCurrentIntrospector() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = mapper.getSerializationConfig().getAnnotationIntrospector();
        assertSame(mapper, mapper.setAnnotationIntrospector(ai));
        assertSame(ai, mapper.getSerializationConfig().getAnnotationIntrospector());
    }

    @Test
    public void testPropertyNamingStrategyRoundTripsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.setPropertyNamingStrategy(null));
        assertNull(mapper.getPropertyNamingStrategy());
    }

    @Test
    public void testEmptyModuleRegistrationBatchReturnsMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.registerModules(new Module[0]));
    }

    @Test
    public void testFindModulesReturnsList() throws Exception {
        assertNotNull(ObjectMapper.findModules());
    }

    @Test
    public void testFindAndRegisterModulesReturnsMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.findAndRegisterModules());
    }
}
