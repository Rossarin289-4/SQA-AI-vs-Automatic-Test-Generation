```java
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
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.*;

public class JacksonAnnotationIntrospectorTest {
    @JsonRootName(value = "root", namespace = "")
    static class Root {}

    @JsonIgnoreProperties(value = {"first", "last"}, ignoreUnknown = true)
    static class IgnoreProps {}

    @JsonIgnoreType
    static class IgnoredType {}

    @JsonFilter("filter")
    static class Filtered {}

    @JsonTypeName("named")
    static class Typed {}

    @JacksonAnnotationsInside
    @interface Bundle {}

    @JsonNaming(PropertyNamingStrategy.LowerCaseStrategy.class)
    static class Naming {}

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class Visibility {}

    @JsonSubTypes({@JsonSubTypes.Type(value = String.class, name = "text")})
    static class WithSubtypes {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    static class Identified {}

    @JsonSerialize(using = JsonSerializer.None.class,
            keyUsing = JsonSerializer.None.class,
            contentUsing = JsonSerializer.None.class,
            nullsUsing = JsonSerializer.None.class,
            as = Void.class, keyAs = Void.class, contentAs = Void.class,
            include = JsonSerialize.Inclusion.DEFAULT_INCLUSION)
    static class SerializeDefaults {}

    enum Names {
        @JsonProperty("chosen") FIRST,
        SECOND
    }

    static class Properties {
        @JsonProperty(value = "field", required = true, index = Integer.MAX_VALUE, defaultValue = "short")
        public String configured;

        @JsonProperty(index = Integer.MIN_VALUE)
        public String minimum;

        @JsonProperty(index = Integer.MAX_VALUE)
        public String maximum;

        @JsonProperty
        public String unnamed;

        @JsonIgnore
        public String ignored;

        @JsonPropertyDescription("desc")
        public String described;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public String formatted;

        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        public String access;

        @JsonView(String.class)
        public String viewed;

        @JsonUnwrapped(prefix = "pre", suffix = "post")
        public String unwrapped;

        @JacksonInject
        public String injected;

        @JsonRawValue
        public String raw;

        @JsonSerialize(as = String.class, keyAs = String.class, contentAs = String.class,
                typing = JsonSerialize.Typing.STATIC)
        public Object typedForSerialization;

        @JsonDeserialize(as = String.class, keyAs = String.class, contentAs = String.class)
        public Object typedForDeserialization;
    }

    static class SetterTarget {
        @JsonSetter("specific")
        @JsonProperty("general")
        public void setValue(String value) {}

        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public SetterTarget() {}

        @JsonAnySetter
        public void any(String key, Object value) {}
    }

    static class Basic {}

    @JsonIgnoreProperties(value = {"x"}, allowGetters = true, allowSetters = true)
    static class IgnoreDirections {}

    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY)
    static class Included {}

    private JacksonAnnotationIntrospector introspector() {
        return new JacksonAnnotationIntrospector();
    }

    private AnnotatedClass annotatedClass(Class<?> type) {
        return AnnotatedClass.construct(type, introspector(), null);
    }

    private AnnotatedField field(String name) {
        for (AnnotatedField f : annotatedClass(Properties.class).fields()) {
            if (name.equals(f.getName())) return f;
        }
        throw new AssertionError("field not found");
    }

    private AnnotatedMethod method(String name, Class<?>... parameters) {
        return annotatedClass(SetterTarget.class).findMethod(name, parameters);
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        assertEquals(com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION, introspector().version());
    }

    @Test
    public void testEnumExplicitAndDefaultNames() throws Exception {
        assertEquals("chosen", introspector().findEnumValue(Names.FIRST));
        assertEquals("SECOND", introspector().findEnumValue(Names.SECOND));
    }

    @Test
    public void testRootNameAndEmptyNamespace() throws Exception {
        PropertyName name = introspector().findRootName(annotatedClass(Root.class));
        assertEquals("root", name.getSimpleName());
        assertNull(name.getNamespace());
    }

    @Test
    public void testIgnorePropertiesAndUnknownFlag() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        AnnotatedClass ac = annotatedClass(IgnoreProps.class);
        assertArrayEquals(new String[] {"first", "last"}, ai.findPropertiesToIgnore(ac));
        assertEquals(Boolean.TRUE, ai.findIgnoreUnknownProperties(ac));
    }

    @Test
    public void testIgnoredTypeValue() throws Exception {
        assertEquals(Boolean.TRUE, introspector().isIgnorableType(annotatedClass(IgnoredType.class)));
    }

    @Test
    public void testFilterIdentifier() throws Exception {
        assertEquals("filter", introspector().findFilterId(annotatedClass(Filtered.class)));
    }

    @Test
    public void testTypeName() throws Exception {
        assertEquals("named", introspector().findTypeName(annotatedClass(Typed.class)));
    }

    @Test
    public void testPropertyRequiredIndexAndDefault() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        AnnotatedField f = field("configured");
        assertEquals(Boolean.TRUE, ai.hasRequiredMarker(f));
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), ai.findPropertyIndex(f));
        assertEquals("short", ai.findPropertyDefaultValue(f));
    }

    @Test
    public void testPropertyIndexAtMinimumAndMaximumIntegerEdges() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals(Integer.valueOf(Integer.MIN_VALUE), ai.findPropertyIndex(field("minimum")));
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), ai.findPropertyIndex(field("maximum")));
    }

    @Test
    public void testPropertyDescriptionAndIgnoreMarker() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals("desc", ai.findPropertyDescription(field("described")));
        assertTrue(ai.hasIgnoreMarker(field("ignored")));
    }

    @Test
    public void testSerializationNameAndDeserializationSetterPrecedence() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        AnnotatedMethod setter = method("setValue", String.class);
        assertEquals("specific", ai.findNameForDeserialization(setter).getSimpleName());
    }

    @Test
    public void testCreatorDisabledAndAnySetter() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        AnnotatedMethod any = method("any", String.class, Object.class);
        assertTrue(ai.hasAnySetterAnnotation(any));
        assertFalse(ai.hasCreatorAnnotation(annotatedClass(SetterTarget.class).getDefaultConstructor()));
    }

    @Test
    public void testUnannotatedClassHasNoRootOrFilter() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        AnnotatedClass ac = annotatedClass(Basic.class);
        assertNull(ai.findRootName(ac));
        assertNull(ai.findFilterId(ac));
    }

    @Test
    public void testAnnotationBundleMarker() throws Exception {
        assertTrue(introspector().isAnnotationBundle(Bundle.class.getAnnotation(Bundle.class)));
        assertFalse(introspector().isAnnotationBundle(Root.class.getAnnotation(JsonRootName.class)));
    }

    @Test
    public void testNamingStrategyAndImplicitName() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals(PropertyNamingStrategy.LowerCaseStrategy.class,
                ai.findNamingStrategy(annotatedClass(Naming.class)));
        assertNull(ai.findImplicitPropertyName(field("configured")));
    }

    @Test
    public void testPropertyAccessAndFormat() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals(JsonProperty.Access.READ_ONLY, ai.findPropertyAccess(field("access")));
        assertEquals(JsonFormat.Shape.STRING, ai.findFormat(field("formatted")).getShape());
    }

    @Test
    public void testUnwrappingAndViews() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        NameTransformer transformer = ai.findUnwrappingNameTransformer(field("unwrapped"));
        assertEquals("preXpost", transformer.transform("X"));
        assertArrayEquals(new Class<?>[] {String.class}, ai.findViews(field("viewed")));
    }

    @Test
    public void testInjectableValueUsesFieldTypeWhenIdEmpty() throws Exception {
        assertEquals(String.class.getName(), introspector().findInjectableValueId(field("injected")));
    }

    @Test
    public void testSubtypesAreMappedToNamedTypes() throws Exception {
        List<NamedType> subtypes = introspector().findSubtypes(annotatedClass(WithSubtypes.class));
        assertEquals(1, subtypes.size());
        assertEquals(String.class, subtypes.get(0).getType());
        assertEquals("text", subtypes.get(0).getName());
    }

    @Test
    public void testObjectIdInfoAndReferenceInfo() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        ObjectIdInfo info = ai.findObjectIdInfo(annotatedClass(Identified.class));
        assertEquals("id", info.getPropertyName().getSimpleName());
        assertNull(ai.findObjectReferenceInfo(annotatedClass(Basic.class), info));
    }

    @Test
    public void testSerializerAndRawSerializerPaths() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertNotNull(ai.findSerializer(field("raw")));
        assertNull(ai.findSerializer(annotatedClass(SerializeDefaults.class)));
        assertNull(ai.findKeySerializer(annotatedClass(SerializeDefaults.class)));
        assertNull(ai.findContentSerializer(annotatedClass(SerializeDefaults.class)));
        assertNull(ai.findNullSerializer(annotatedClass(SerializeDefaults.class)));
    }

    @Test
    public void testSerializationTypeAndTyping() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals(String.class, ai.findSerializationType(field("typedForSerialization")));
        assertEquals(String.class, ai.findSerializationKeyType(field("typedForSerialization"), null));
        assertEquals(String.class, ai.findSerializationContentType(field("typedForSerialization"), null));
        assertEquals(JsonSerialize.Typing.STATIC, ai.findSerializationTyping(field("typedForSerialization")));
    }

    @Test
    public void testSerializationInclusionAndPropertyOrderDefaults() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals(JsonInclude.Include.NON_NULL,
                ai.findSerializationInclusion(annotatedClass(Included.class), JsonInclude.Include.ALWAYS));
        assertEquals(JsonInclude.Include.NON_EMPTY,
                ai.findSerializationInclusionForContent(annotatedClass(Included.class), JsonInclude.Include.ALWAYS));
        assertNull(ai.findSerializationPropertyOrder(annotatedClass(Basic.class)));
    }

    @Test
    public void testSerializationNameAndValueAnnotationDefaults() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertNull(ai.findNameForSerialization(field("configured")));
        assertFalse(ai.hasAsValueAnnotation(method("setValue", String.class)));
    }

    @Test
    public void testDeserializationTypesAndConvertersDefaults() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals(String.class, ai.findDeserializationType(field("typedForDeserialization"), null));
        assertEquals(String.class, ai.findDeserializationKeyType(field("typedForDeserialization"), null));
        assertEquals(String.class, ai.findDeserializationContentType(field("typedForDeserialization"), null));
        assertNull(ai.findDeserializationConverter(field("typedForDeserialization")));
        assertNull(ai.findDeserializationContentConverter(field("typedForDeserialization")));
    }

    @Test
    public void testIgnoreDirectionsAreDifferentForSerializationAndDeserialization() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        AnnotatedClass ac = annotatedClass(IgnoreDirections.class);
        assertNull(ai.findPropertiesToIgnore(ac, true));
        assertNull(ai.findPropertiesToIgnore(ac, false));
    }

    @Test
    public void testAutoDetectVisibilityUsesAnnotationConfiguration() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        assertNotNull(ai.findAutoDetectVisibility(annotatedClass(Visibility.class), checker));
    }

    @Test
    public void testTypeInfoAbsentReturnsNull() throws Exception {
        assertNull(introspector().findTypeResolver(null, annotatedClass(Basic.class), null));
    }

    @Test
    public void testPropertyTypeResolverForContainerIsSkipped() throws Exception {
        JavaType containerType = new com.fasterxml.jackson.databind.ObjectMapper()
                .getTypeFactory().constructType(List.class);
        assertNull(introspector().findPropertyTypeResolver(null, field("configured"), containerType));
    }

    @Test
    public void testPropertyContentResolverRejectsNonContainerType() throws Exception {
        JavaType nonContainer = new com.fasterxml.jackson.databind.ObjectMapper()
                .getTypeFactory().constructType(String.class);
        try {
            introspector().findPropertyContentTypeResolver(null, field("configured"), nonContainer);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testTypeIdAndObjectIdAbsentCases() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertEquals(Boolean.FALSE, ai.isTypeId(field("configured")));
        assertNull(ai.findObjectIdInfo(annotatedClass(Basic.class)));
    }

    @Test
    public void testSerializationConverterAndContentConverterDefaults() throws Exception {
        JacksonAnnotationIntrospector ai = introspector();
        assertNull(ai.findSerializationConverter(annotatedClass(SerializeDefaults.class)));
        assertNull(ai.findSerializationContentConverter(field("configured")));
    }
}
```