package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.*;

public class JacksonAnnotationIntrospectorTest {
    enum EnumCases {
        @JsonProperty("renamed") FIRST,
        @JsonProperty("") EMPTY,
        THIRD
    }

    @JsonRootName(value = "root", namespace = "urn:test")
    static class RootAnnotated { }

    @JsonFilter("filter-id")
    static class FilterAnnotated { }

    @JsonClassDescription("class description")
    static class Described { }

    static class Plain { }

    enum DefaultEnum {
        @JsonEnumDefaultValue FALLBACK, OTHER
    }

    @JacksonAnnotationsInside
    @JsonProperty("bundled")
    @interface Bundle { }

    @JsonIgnoreType
    static class IgnoredType { }

    static class Members {
        @JsonProperty(value = "required-name", required = true, index = 0, defaultValue = "fallback")
        public String required;

        @JsonProperty(index = 1)
        public String indexed;

        @JsonAlias({"old", "older"})
        public String aliased;

        @JsonIgnore
        public String ignored;

        @JsonPropertyDescription("member description")
        public String described;

        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        public String readOnly;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public String formatted;

        @JsonView({String.class})
        public String viewed;

        @JsonTypeId
        public String typeId;

        @JsonUnwrapped(prefix = "pre", suffix = "post")
        public String unwrapped;

        @JsonValue
        public String asValue() { return ""; }

        @JsonAnyGetter
        public Map<String, Object> anyGetter() { return Collections.emptyMap(); }

        @JsonGetter("getter-name")
        public String getter() { return ""; }

        @JsonSetter("setter-name")
        public void setter(String value) { }
    }

    @Test
    public void testEnumExplicitNameAndFallback() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals("renamed", ai.findEnumValue(EnumCases.FIRST));
        assertEquals("EMPTY", ai.findEnumValue(EnumCases.EMPTY));
        assertEquals("THIRD", ai.findEnumValue(EnumCases.THIRD));
    }

    @Test
    public void testEnumValuesUpdatesOnlyNonEmptyExplicitName() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        String[] names = {"a", "b", "c"};
        String[] result = ai.findEnumValues(EnumCases.class, EnumCases.values(), names);
        assertSame(names, result);
        assertArrayEquals(new String[]{"renamed", "b", "c"}, result);
    }

    @Test
    public void testRootNameAndNamespace() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(RootAnnotated.class,
                new ObjectMapper().getSerializationConfig());
        PropertyName name = ai.findRootName(ac);
        assertEquals("root", name.getSimpleName());
        assertEquals("urn:test", name.getNamespace());
    }

    @Test
    public void testUnannotatedRootNameIsNull() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Plain.class,
                new ObjectMapper().getSerializationConfig());
        assertNull(ai.findRootName(ac));
    }

    @Test
    public void testFilterId() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(FilterAnnotated.class,
                new ObjectMapper().getSerializationConfig());
        assertEquals("filter-id", ai.findFilterId(ac));
    }

    @Test
    public void testClassDescription() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Described.class,
                new ObjectMapper().getSerializationConfig());
        assertEquals("class description", ai.findClassDescription(ac));
    }

    @Test
    public void testPropertyNameIndexDefaultAndRequired() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Members.class,
                new ObjectMapper().getSerializationConfig());
        AnnotatedField field = findField(ac, "required");
        assertEquals("required-name", ai.findNameForSerialization(field).getSimpleName());
        assertEquals(Integer.valueOf(0), ai.findPropertyIndex(field));
        assertEquals("fallback", ai.findPropertyDefaultValue(field));
        assertEquals(Boolean.TRUE, ai.hasRequiredMarker(field));
    }

    @Test
    public void testUnknownPropertyIndexAndEmptyDefaultAreNull() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Members.class,
                new ObjectMapper().getSerializationConfig());
        AnnotatedField field = findField(ac, "indexed");
        assertEquals(Integer.valueOf(1), ai.findPropertyIndex(field));
        assertNull(ai.findPropertyDefaultValue(field));
        assertNull(ai.hasRequiredMarker(field));
    }

    @Test
    public void testAliasesAndIgnoreMarker() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        List<PropertyName> aliases = ai.findPropertyAliases(findField(ac, "aliased"));
        assertEquals(2, aliases.size());
        assertEquals("old", aliases.get(0).getSimpleName());
        assertEquals("older", aliases.get(1).getSimpleName());
        assertTrue(ai.hasIgnoreMarker(findField(ac, "ignored")));
    }

    @Test
    public void testDescriptionAccessFormatAndViews() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        assertEquals("member description", ai.findPropertyDescription(findField(ac, "described")));
        assertEquals(JsonProperty.Access.READ_ONLY, ai.findPropertyAccess(findField(ac, "readOnly")));
        assertEquals(JsonFormat.Shape.STRING, ai.findFormat(findField(ac, "formatted")).getShape());
        assertArrayEquals(new Class<?>[]{String.class}, ai.findViews(findField(ac, "viewed")));
    }

    @Test
    public void testNameForSerializationAndDeserializationPrecedence() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedMethod getter = ac.findMethod("getter", new Class<?>[0]);
        AnnotatedMethod setter = ac.findMethod("setter", new Class<?>[]{String.class});
        assertEquals("getter-name", ai.findNameForSerialization(getter).getSimpleName());
        assertEquals("setter-name", ai.findNameForDeserialization(setter).getSimpleName());
    }

    @Test
    public void testAsValueAndAnyGetterMarkers() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedMethod value = ac.findMethod("asValue", new Class<?>[0]);
        AnnotatedMethod any = ac.findMethod("anyGetter", new Class<?>[0]);
        assertEquals(Boolean.TRUE, ai.hasAsValue(value));
        assertEquals(Boolean.TRUE, ai.hasAnyGetter(any));
        assertTrue(ai.hasAsValueAnnotation(value));
        assertTrue(ai.hasAnyGetterAnnotation(any));
    }

    @Test
    public void testTypeIdAndUnwrappingTransformer() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedField typeId = findField(ac, "typeId");
        assertEquals(Boolean.TRUE, ai.isTypeId(typeId));
        NameTransformer transformer = ai.findUnwrappingNameTransformer(findField(ac, "unwrapped"));
        assertEquals("prevaluepost", transformer.transform("value"));
        assertEquals("value", transformer.reverse("prevaluepost"));
    }

    @Test
    public void testIncludeAndSerializationTypingDefaults() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedField plain = findField(ac, "aliased");
        assertEquals(JsonInclude.Include.USE_DEFAULTS,
                ai.findPropertyInclusion(plain).getValueInclusion());
        assertNull(ai.findSerializationTyping(plain));
        assertNull(ai.findSerializer(plain));
    }

    @Test
    public void testSetConstructorPropertiesFlagIsFluent() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertSame(ai, ai.setConstructorPropertiesImpliesCreator(false));
    }

    @Test
    public void testVersionMatchesPackageVersion() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals(com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION, ai.version());
    }

    @Test
    public void testAnnotationBundleDetection() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        Annotation bundle = Bundle.class.getAnnotation(JsonProperty.class);
        assertTrue(ai.isAnnotationBundle(Bundle.class.getAnnotation(JacksonAnnotationsInside.class)));
        assertFalse(ai.isAnnotationBundle(Members.class.getDeclaredField("aliased")
                .getAnnotation(JsonAlias.class)));
    }

    @Test
    public void testDefaultEnumValueFromAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        @SuppressWarnings("unchecked")
        Class<Enum<?>> enumClass = (Class<Enum<?>>) (Class<?>) DefaultEnum.class;
        assertEquals(DefaultEnum.FALLBACK, ai.findDefaultEnumValue(enumClass));
    }

    @Test
    public void testIgnorableTypeAnnotationAndAbsentAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ignored = AnnotatedClass.constructWithoutSuperTypes(IgnoredType.class,
                mapper.getSerializationConfig());
        AnnotatedClass plain = AnnotatedClass.constructWithoutSuperTypes(Plain.class,
                mapper.getSerializationConfig());
        assertEquals(Boolean.TRUE, ai.isIgnorableType(ignored));
        assertNull(ai.isIgnorableType(plain));
    }

    @Test
    public void testPropertyIgnoralsForAnnotatedAndPlainMembers() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedField field = findField(ac, "ignored");
        assertFalse(ai.findPropertyIgnorals(field).equals(JsonIgnoreProperties.Value.empty()));
        assertEquals(JsonIgnoreProperties.Value.empty(),
                ai.findPropertyIgnorals(findField(ac, "aliased")));
    }

    @Test
    public void testReferenceTypesManagedAndBackReference() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(ReferenceMembers.class,
                new ObjectMapper().getSerializationConfig());
        assertNotNull(ai.findReferenceType(findField(ac, "managed")));
        assertNotNull(ai.findReferenceType(findField(ac, "back")));
        assertNull(ai.findReferenceType(findField(ac, "ordinary")));
    }

    @Test
    public void testNamingStrategyAndTypeNameWhenUnannotated() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Plain.class,
                new ObjectMapper().getSerializationConfig());
        assertNull(ai.findNamingStrategy(ac));
        assertNull(ai.findTypeName(ac));
    }

    @Test
    public void testPropertyOrderAndAlphabeticSortAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Ordered.class,
                mapper.getSerializationConfig());
        assertArrayEquals(new String[]{"z", "a"}, ai.findSerializationPropertyOrder(ac));
        assertEquals(Boolean.TRUE, ai.findSerializationSortAlphabetically(ac));
        assertNull(ai.findSerializationSortAlphabetically(
                AnnotatedClass.constructWithoutSuperTypes(Plain.class, mapper.getSerializationConfig())));
    }

    @Test
    public void testDeprecatedTypeRefinementMethodsReturnNull() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedField field = findField(ac, "aliased");
        JavaType base = new ObjectMapper().constructType(String.class);
        assertNull(ai.findSerializationType(field));
        assertNull(ai.findSerializationKeyType(field, base));
        assertNull(ai.findSerializationContentType(field, base));
    }

    @Test
    public void testDeserializerAndConverterDefaults() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedField field = findField(ac, "aliased");
        assertNull(ai.findDeserializer(field));
        assertNull(ai.findKeyDeserializer(field));
        assertNull(ai.findContentDeserializer(field));
        assertNull(ai.findDeserializationConverter(field));
    }

    @Test
    public void testSerializationConvertersAndSerializersDefaultToNull() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = annotatedMembers();
        AnnotatedField field = findField(ac, "aliased");
        assertNull(ai.findKeySerializer(field));
        assertNull(ai.findContentSerializer(field));
        assertNull(ai.findNullSerializer(field));
        assertNull(ai.findSerializationConverter(field));
        assertNull(ai.findSerializationContentConverter(field));
    }

    private static AnnotatedClass annotatedMembers() {
        return AnnotatedClass.constructWithoutSuperTypes(Members.class,
                new ObjectMapper().getSerializationConfig());
    }

    private static AnnotatedField findField(AnnotatedClass ac, String name) {
        for (AnnotatedField field : ac.fields()) {
            if (name.equals(field.getName())) {
                return field;
            }
        }
        throw new AssertionError("missing field: " + name);
    }

    static class ReferenceMembers {
        @JsonManagedReference("link")
        public Object managed;

        @JsonBackReference("link")
        public Object back;

        public Object ordinary;
    }

    @JsonPropertyOrder(value = {"z", "a"}, alphabetic = true)
    static class Ordered { }
}
