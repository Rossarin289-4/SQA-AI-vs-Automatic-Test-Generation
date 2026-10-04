package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.*;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;

public class DeserializationConfigTest {
    private DeserializationConfig newConfig() {
        BaseSettings base = new BaseSettings(
                new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector(),
                new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector(),
                VisibilityChecker.Std.defaultInstance(),
                com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder(),
                TypeFactory.defaultInstance(),
                null, Locale.ROOT, TimeZone.getTimeZone("UTC"),
                Base64Variants.getDefaultVariant(), null);
        return new DeserializationConfig(base,
                new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver(),
                new SimpleMixInResolver(null), new RootNameLookup());
    }

    @Test
    public void testEnabledDefaultFeature() throws Exception {
        DeserializationConfig c = newConfig();
        assertTrue(c.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(c.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
    }

    @Test
    public void testEnableFeaturesTogether() throws Exception {
        DeserializationConfig c = newConfig().withFeatures(
                DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
                DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        assertTrue(c.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
        assertTrue(c.hasDeserializationFeatures(
                DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY.getMask()
                | DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask()));
    }

    @Test
    public void testDisableFeaturesTogether() throws Exception {
        DeserializationConfig c = newConfig().withoutFeatures(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
        assertFalse(c.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(c.hasSomeOfFeatures(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES.getMask()
                | DeserializationFeature.FAIL_ON_INVALID_SUBTYPE.getMask()));
    }

    @Test
    public void testFeatureMasksExposeConfiguredBits() throws Exception {
        DeserializationConfig c = newConfig().withFeatures(
                DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        int mask = DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY.getMask();
        assertEquals(mask, c.getDeserializationFeatures() & mask);
        assertTrue(c.hasDeserializationFeatures(mask));
        assertFalse(c.hasDeserializationFeatures(mask | 1));
    }

    @Test
    public void testMapperFeaturesEnableAndDisable() throws Exception {
        DeserializationConfig c = newConfig();
        DeserializationConfig enabled = c.with(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        assertTrue(enabled.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        assertFalse(c.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        assertFalse(enabled.without(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
                .isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
    }

    @Test
    public void testRootWrappingFeatureAndNameOverride() throws Exception {
        DeserializationConfig c = newConfig().with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(c.useRootWrapping());
        assertFalse(c.withRootName(PropertyName.construct("")).useRootWrapping());
        assertTrue(c.withRootName(PropertyName.construct("root")).useRootWrapping());
        assertFalse(newConfig().withRootName((PropertyName) null).useRootWrapping());
    }

    @Test
    public void testRootNameNullAndEmptyNames() throws Exception {
        DeserializationConfig c = newConfig();
        assertFalse(c.withRootName((PropertyName) null).useRootWrapping());
        assertFalse(c.withRootName(PropertyName.construct("")).useRootWrapping());
        assertTrue(c.withRootName(PropertyName.construct("x")).useRootWrapping());
    }

    @Test
    public void testNodeFactoryCanBeReplaced() throws Exception {
        DeserializationConfig c = newConfig();
        JsonNodeFactory factory = new JsonNodeFactory(false);
        DeserializationConfig changed = c.with(factory);
        assertSame(factory, changed.getNodeFactory());
        assertSame(changed, changed.with(factory));
    }

    @Test
    public void testDefaultPropertyInclusionAndFormat() throws Exception {
        DeserializationConfig c = newConfig();
        assertSame(c.getDefaultPropertyInclusion(), c.getDefaultPropertyInclusion(String.class));
        assertSame(JsonInclude.Value.empty(), c.getDefaultPropertyInclusion());
        assertSame(JsonFormat.Value.empty(), c.getDefaultPropertyFormat(String.class));
    }

    @Test
    public void testAnnotationIntrospectorFeatureSwitch() throws Exception {
        DeserializationConfig c = newConfig();
        assertNotNull(c.getAnnotationIntrospector());
        assertNotSame(c.getAnnotationIntrospector(),
                c.without(MapperFeature.USE_ANNOTATIONS).getAnnotationIntrospector());
    }

    @Test
    public void testViewCanBeSetAndCleared() throws Exception {
        DeserializationConfig c = newConfig();
        assertSame(c, c.withView(null));
        assertNotSame(c, c.withView(String.class));
        assertSame(c, c.withView(String.class).withView(null).withView(null));
    }

    @Test
    public void testNoDefaultTypeDeserializerWithoutTypeMetadata() throws Exception {
        DeserializationConfig c = newConfig();
        assertNull(c.findTypeDeserializer(TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testEmptyFeatureMaskSemantics() throws Exception {
        DeserializationConfig c = newConfig();
        assertTrue(c.hasDeserializationFeatures(0));
        assertFalse(c.hasSomeOfFeatures(0));
    }

    @Test
    public void testVisibilityOverrideForFields() throws Exception {
        DeserializationConfig c = newConfig().withVisibility(
                PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NONE);
        assertFalse(c.getDefaultVisibilityChecker().isFieldVisible((java.lang.reflect.Field) null));
    }

    @Test
    public void testInsertedAnnotationIntrospector() throws Exception {
        AnnotationIntrospector ai = NopAnnotationIntrospector.instance;
        DeserializationConfig c = newConfig().withInsertedAnnotationIntrospector(ai);
        assertNotNull(c.getAnnotationIntrospector());
        assertNotSame(newConfig().getAnnotationIntrospector(), c.getAnnotationIntrospector());
    }

    @Test
    public void testAppendedAnnotationIntrospector() throws Exception {
        AnnotationIntrospector ai = NopAnnotationIntrospector.instance;
        DeserializationConfig c = newConfig().withAppendedAnnotationIntrospector(ai);
        assertNotNull(c.getAnnotationIntrospector());
        assertNotSame(newConfig().getAnnotationIntrospector(), c.getAnnotationIntrospector());
    }

    @Test
    public void testInitializeParserWithFeatureOverride() throws Exception {
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("null");
        try {
            DeserializationConfig c = newConfig().with(JsonParser.Feature.ALLOW_COMMENTS);
            c.initialize(parser);
            assertTrue(parser.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        } finally {
            parser.close();
        }
    }

    @Test
    public void testClassAnnotationIntrospection() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = newConfig().introspectClassAnnotations(type);
        assertEquals(String.class, desc.getBeanClass());
    }

    @Test
    public void testDirectClassAnnotationIntrospection() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription desc = newConfig().introspectDirectClassAnnotations(type);
        assertEquals(String.class, desc.getBeanClass());
    }

    @Test
    public void testDefaultVisibilityCheckerDisablesAutoDetection() throws Exception {
        DeserializationConfig c = newConfig().without(
                MapperFeature.AUTO_DETECT_FIELDS, MapperFeature.AUTO_DETECT_GETTERS,
                MapperFeature.AUTO_DETECT_IS_GETTERS, MapperFeature.AUTO_DETECT_SETTERS,
                MapperFeature.AUTO_DETECT_CREATORS);
        VisibilityChecker<?> checker = c.getDefaultVisibilityChecker();
        assertFalse(checker.isFieldVisible((java.lang.reflect.Field) null));
        assertFalse(checker.isGetterVisible((java.lang.reflect.Method) null));
    }

    @Test
    public void testBeanIntrospectionMethods() throws Exception {
        DeserializationConfig c = newConfig();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals(String.class, c.<BeanDescription>introspect(type).getBeanClass());
        assertEquals(String.class, c.<BeanDescription>introspectForCreation(type).getBeanClass());
        assertEquals(String.class, c.<BeanDescription>introspectForBuilder(type).getBeanClass());
    }

    @Test
    public void testDefaultPropertyMethodsRemainEmpty() throws Exception {
        DeserializationConfig c = newConfig();
        assertSame(JsonInclude.Value.empty(), c.getDefaultPropertyInclusion());
        assertSame(JsonFormat.Value.empty(), c.getDefaultPropertyFormat(Object.class));
    }

    @Test
    public void testConfigStringIncludesFeatureFlags() throws Exception {
        DeserializationConfig c = newConfig();
        assertEquals("[SerializationConfig: flags=0x" +
                Integer.toHexString(c.getDeserializationFeatures()) + "]", c.toString());
    }
}
