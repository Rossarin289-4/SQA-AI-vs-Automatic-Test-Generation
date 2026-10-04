package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;
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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.*;

public class ObjectMapperTest {
    @Test
    public void testObjectTypingRecognizesObject() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Object.class)));
    }

    @Test
    public void testObjectTypingExcludesConcreteString() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testObjectAndNonConcreteRecognizesAbstractNumber() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Number.class)));
    }

    @Test
    public void testObjectAndNonConcreteExcludesConcreteNumberWrapper() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(Integer.class)));
    }

    @Test
    public void testNonConcreteArraysUnwrapsArrayType() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Number[][].class)));
    }

    @Test
    public void testNonConcreteArraysDoNotTypeConcreteArrayContents() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String[][].class)));
    }

    @Test
    public void testNonFinalExcludesFinalNaturalType() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertFalse(b.useForType(TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testNonFinalIncludesNonFinalConcreteType() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Number.class)));
    }

    @Test
    public void testNonFinalUnwrapsArrayBeforeCheckingContents() throws Exception {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertTrue(b.useForType(TypeFactory.defaultInstance().constructType(Number[][].class)));
    }

    @Test
    public void testBuildDeserializerIsNullForExcludedString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertNull(b.buildTypeDeserializer(mapper.getDeserializationConfig(),
                mapper.constructType(String.class), Collections.<NamedType>emptyList()));
    }

    @Test
    public void testBuildSerializerIsNullForExcludedString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertNull(b.buildTypeSerializer(mapper.getSerializationConfig(),
                mapper.constructType(String.class), Collections.<NamedType>emptyList()));
    }

    @Test
    public void testCopyReturnsMapperWithEquivalentFeatureSetting() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.AUTO_DETECT_FIELDS);
        ObjectMapper copy = mapper.copy();
        assertTrue(copy.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testCopyIsDistinctInstance() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotSame(mapper, mapper.copy());
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        assertNotNull(new ObjectMapper().version());
    }

    @Test
    public void testAddMixInAndFindIt() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(String.class, Integer.class);
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
    }

    @Test
    public void testMixInCountTracksAddedDefinition() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(String.class, Integer.class);
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testSettingMixInsReplacesLocalDefinitions() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(String.class, Integer.class);
        Map<Class<?>, Class<?>> definitions = new HashMap<Class<?>, Class<?>>();
        definitions.put(Number.class, Long.class);
        mapper.setMixIns(definitions);
        assertEquals(Long.class, mapper.findMixInClassFor(Number.class));
    }

    @Test
    public void testSetMixInsUpdatesDefinitionCount() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<Class<?>, Class<?>> definitions = new HashMap<Class<?>, Class<?>>();
        definitions.put(Number.class, Long.class);
        mapper.setMixIns(definitions);
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testFeatureConfigurationCanEnableAndDisable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, true);
        assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, false);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testDefaultTypingRejectsExternalPropertyInclusion() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL,
                    JsonTypeInfo.As.EXTERNAL_PROPERTY);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testDefaultTypingCanBeDisabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();
        mapper.disableDefaultTyping();
        assertNull(mapper.getSerializationConfig().getDefaultTyper(mapper.constructType(Object.class)));
    }

    @Test
    public void testConstructTypePreservesRequestedRawClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(String.class, mapper.constructType(String.class).getRawClass());
    }

    @Test
    public void testSetTypeFactoryUpdatesMapperAccessor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory factory = TypeFactory.defaultInstance().withClassLoader(null);
        mapper.setTypeFactory(factory);
        assertSame(factory, mapper.getTypeFactory());
    }

    @Test
    public void testCreatedObjectNodeUsesConfiguredFactory() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory factory = JsonNodeFactory.withExactBigDecimals(true);
        mapper.setNodeFactory(factory);
        assertSame(factory, mapper.getNodeFactory());
    }

    @Test
    public void testMapperVersionMatchesVersionMethod() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper.version());
        assertSame(mapper, mapper.registerModules(new Module[0]));
    }

    @Test
    public void testEmptyModuleDiscoveryReturnsList() throws Exception {
        assertNotNull(ObjectMapper.findModules());
    }

    @Test
    public void testFindAndRegisterModulesReturnsMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.findAndRegisterModules());
    }

    @Test
    public void testDeserializationContextAvailable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper.getDeserializationContext());
    }

    @Test
    public void testSetSerializerFactoryUpdatesAccessor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerFactory factory = mapper.getSerializerFactory();
        assertSame(mapper, mapper.setSerializerFactory(factory));
        assertSame(factory, mapper.getSerializerFactory());
    }

    @Test
    public void testSetSerializerProviderUpdatesAccessor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider provider =
                (DefaultSerializerProvider) mapper.getSerializerProvider();
        assertSame(mapper, mapper.setSerializerProvider(provider));
        assertSame(provider, mapper.getSerializerProvider());
    }

    @Test
    public void testSetMixInResolverRetainsLocalMapping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(String.class, Integer.class);
        mapper.setMixInResolver(null);
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
    }

    @Test
    public void testDeprecatedAddMixInAnnotationsAddsMapping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(String.class, Integer.class);
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
    }

    @Test
    public void testVisibilitySetterReturnsConfiguredVisibility() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        VisibilityChecker<?> checker = mapper.getVisibilityChecker();
        assertSame(mapper, mapper.setVisibility(checker));
        assertEquals(checker, mapper.getVisibilityChecker());
    }

    @Test
    public void testSubtypeResolverSetterUpdatesAccessor() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SubtypeResolver resolver = mapper.getSubtypeResolver();
        assertSame(mapper, mapper.setSubtypeResolver(resolver));
        assertSame(resolver, mapper.getSubtypeResolver());
    }

    @Test
    public void testAnnotationIntrospectorSetterKeepsConfigurationUsable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ai = mapper.getSerializationConfig().getAnnotationIntrospector();
        assertSame(mapper, mapper.setAnnotationIntrospector(ai));
        assertSame(ai, mapper.getSerializationConfig().getAnnotationIntrospector());
    }

    @Test
    public void testSetSeparateAnnotationIntrospectors() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector ser = mapper.getSerializationConfig().getAnnotationIntrospector();
        AnnotationIntrospector deser = mapper.getDeserializationConfig().getAnnotationIntrospector();
        assertSame(mapper, mapper.setAnnotationIntrospectors(ser, deser));
        assertSame(ser, mapper.getSerializationConfig().getAnnotationIntrospector());
        assertSame(deser, mapper.getDeserializationConfig().getAnnotationIntrospector());
    }

    @Test
    public void testSetSerializationInclusionPreservesMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertSame(mapper, mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL));
    }

    @Test
    public void testDefaultPrettyPrinterSetterPreservesMapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        PrettyPrinter printer = new DefaultPrettyPrinter();
        assertSame(mapper, mapper.setDefaultPrettyPrinter(printer));
    }

    @Test
    public void testRegisterSubtypesClassOverload() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerSubtypes(String.class);
        assertNotNull(mapper.getSubtypeResolver());
    }

    @Test
    public void testRegisterSubtypesNamedTypeOverload() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        NamedType subtype = new NamedType(String.class, "text");
        mapper.registerSubtypes(subtype);
        assertNotNull(mapper.getSubtypeResolver());
    }

    @Test
    public void testLegacySetMixInAnnotationsReplacesMappings() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<Class<?>, Class<?>> definitions = new HashMap<Class<?>, Class<?>>();
        definitions.put(Number.class, Long.class);
        mapper.setMixInAnnotations(definitions);
        assertEquals(Long.class, mapper.findMixInClassFor(Number.class));
    }

    @Test
    public void testLegacyVisibilityCheckerSetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        VisibilityChecker<?> checker = mapper.getVisibilityChecker();
        mapper.setVisibilityChecker(checker);
        assertEquals(checker, mapper.getVisibilityChecker());
    }

    @Test
    public void testNodeFactoryGetterRemainsAvailableAfterSet() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNodeFactory factory = JsonNodeFactory.instance;
        mapper.setNodeFactory(factory);
        assertSame(factory, mapper.getNodeFactory());
    }
}
