package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.beans.ConstructorProperties;
import java.beans.Transient;
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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import java.io.IOException;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;

public class JacksonAnnotationIntrospectorTest {
    @JsonPropertyOrder(value = {"first", "second"}, alphabetic = true)
    static class OrderedBean { }

    @JsonRootName(value = "root", namespace = "urn:test")
    static class RootBean { }

    @JsonFilter("filter")
    static class FilteredBean { }

    @JsonIgnoreProperties(value = {"hidden"}, allowGetters = true)
    static class IgnoredBean { }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class UnknownBean { }

    @JsonIgnoreType
    static class IgnoredType { }

    @JsonTypeName("named")
    static class NamedBean { }

    @JsonSubTypes({@JsonSubTypes.Type(value = String.class, name = "text"),
            @JsonSubTypes.Type(value = Integer.class, name = "number")})
    static class SubtypedBean { }

    enum SampleEnum {
        @JsonProperty("first-name") FIRST,
        SECOND
    }

    static class Members {
        @JsonProperty(value = "requiredName", required = true, index = 2, defaultValue = "fallback")
        @JsonPropertyDescription("description")
        public String annotated;

        @JsonIgnore
        public String ignored;

        @JsonProperty("serialized")
        public String ordinary;

        @JsonSetter("setterName")
        public void setValue(String value) { }

        @JsonValue
        public String value() { return ""; }
    }

    @JacksonAnnotationsInside
    @JsonProperty("bundled")
    @interface Bundle { }

    static class BundleBean {
        @Bundle public String bundled;
    }

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class NamingBean { }

    @JsonClassDescription("class note")
    static class DescribedBean { }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class VisibleBean { }

    static class MoreMembers {
        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        public String readOnly;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public String formatted;

        @JsonManagedReference("link")
        public Object managed;

        @JsonBackReference("back")
        public Object back;

        @JsonUnwrapped(prefix = "pre", suffix = "post")
        public Object unwrapped;

        @JacksonInject("token")
        public String injected;

        @JsonView({String.class, Integer.class})
        public String viewed;

        @JsonTypeId
        public String typeId;
    }

    @Test
    public void testEnumNameUsesExplicitAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals("first-name", ai.findEnumValue(SampleEnum.FIRST));
    }

    @Test
    public void testEnumNameFallsBackToConstantName() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals("SECOND", ai.findEnumValue(SampleEnum.SECOND));
    }

    @Test
    public void testFindEnumValuesUpdatesOnlyExplicitName() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        String[] initial = {"old", "untouched"};
        String[] result = ai.findEnumValues(SampleEnum.class, SampleEnum.values(), initial);
        assertSame(initial, result);
        assertArrayEquals(new String[] {"first-name", "untouched"}, result);
    }

    @Test
    public void testRootNameCarriesValueAndNamespace() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(RootBean.class),
                mapper.getSerializationConfig());
        PropertyName name = new JacksonAnnotationIntrospector().findRootName(ac);
        assertEquals("root", name.getSimpleName());
        assertEquals("urn:test", name.getNamespace());
    }

    @Test
    public void testIgnorePropertiesHonorsGetterAllowanceForSerialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(IgnoredBean.class),
                mapper.getSerializationConfig());
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertNull(ai.findPropertiesToIgnore(ac, true));
        assertArrayEquals(new String[] {"hidden"}, ai.findPropertiesToIgnore(ac, false));
    }

    @Test
    public void testUnknownPropertiesFlag() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(UnknownBean.class),
                mapper.getDeserializationConfig());
        assertEquals(Boolean.TRUE, new JacksonAnnotationIntrospector().findIgnoreUnknownProperties(ac));
    }

    @Test
    public void testIgnorableTypeFlag() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(IgnoredType.class),
                mapper.getDeserializationConfig());
        assertEquals(Boolean.TRUE, new JacksonAnnotationIntrospector().isIgnorableType(ac));
    }

    @Test
    public void testFilterIdFromClassAnnotation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(FilteredBean.class),
                mapper.getSerializationConfig());
        assertEquals("filter", new JacksonAnnotationIntrospector().findFilterId(ac));
    }

    @Test
    public void testPropertyRequiredIndexAndDefaultValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(Members.class),
                mapper.getDeserializationConfig());
        AnnotatedField field = null;
        for (AnnotatedField f : ac.fields()) {
            if ("annotated".equals(f.getName())) field = f;
        }
        assertNotNull(field);
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals(Boolean.TRUE, ai.hasRequiredMarker(field));
        assertEquals(Integer.valueOf(2), ai.findPropertyIndex(field));
        assertEquals("fallback", ai.findPropertyDefaultValue(field));
        assertEquals("description", ai.findPropertyDescription(field));
    }

    @Test
    public void testExplicitIgnoreMarker() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(Members.class),
                mapper.getDeserializationConfig());
        AnnotatedField field = null;
        for (AnnotatedField f : ac.fields()) {
            if ("ignored".equals(f.getName())) field = f;
        }
        assertNotNull(field);
        assertTrue(new JacksonAnnotationIntrospector().hasIgnoreMarker(field));
    }

    @Test
    public void testPropertyAccessAndNamesForSerializationAndDeserialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(Members.class),
                mapper.getDeserializationConfig());
        AnnotatedField ordinary = null;
        AnnotatedMethod setter = ac.findMethod("setValue", new Class<?>[] {String.class});
        for (AnnotatedField f : ac.fields()) {
            if ("ordinary".equals(f.getName())) ordinary = f;
        }
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals("serialized", ai.findNameForSerialization(ordinary).getSimpleName());
        assertEquals("setterName", ai.findNameForDeserialization(setter).getSimpleName());
    }

    @Test
    public void testValueMethodAnnotation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(Members.class),
                mapper.getSerializationConfig());
        AnnotatedMethod method = ac.findMethod("value", new Class<?>[0]);
        assertTrue(new JacksonAnnotationIntrospector().hasAsValueAnnotation(method));
    }

    @Test
    public void testClassAnnotationsForTypeNameAndSubtypes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass named = AnnotatedClass.construct(mapper.constructType(NamedBean.class),
                mapper.getDeserializationConfig());
        assertEquals("named", ai.findTypeName(named));

        AnnotatedClass subtyped = AnnotatedClass.construct(mapper.constructType(SubtypedBean.class),
                mapper.getDeserializationConfig());
        List<NamedType> types = ai.findSubtypes(subtyped);
        assertEquals(2, types.size());
        assertEquals("text", types.get(0).getName());
        assertEquals("number", types.get(1).getName());
    }

    @Test
    public void testSerializationPropertyOrderAndAlphabeticFlag() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(OrderedBean.class),
                mapper.getSerializationConfig());
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertArrayEquals(new String[] {"first", "second"}, ai.findSerializationPropertyOrder(ac));
        assertEquals(Boolean.TRUE, ai.findSerializationSortAlphabetically(ac));
    }

    @Test
    public void testIgnoreConfigurationCanBeChangedFluently() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertSame(ai, ai.setConstructorPropertiesImpliesCreator(false));
    }

    @Test
    public void testMissingAnnotationResultsAreNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(Members.class),
                mapper.getSerializationConfig());
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertNull(ai.findRootName(ac));
        assertNull(ai.findTypeName(ac));
        assertNull(ai.findClassDescription(ac));
        assertNull(ai.findSerializationPropertyOrder(AnnotatedClass.construct(
                mapper.constructType(String.class), mapper.getSerializationConfig())));
    }

    @Test
    public void testPropertyDescriptionIsReadFromFieldAnnotation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(Members.class),
                mapper.getSerializationConfig());
        AnnotatedField field = null;
        for (AnnotatedField f : ac.fields()) {
            if ("annotated".equals(f.getName())) field = f;
        }
        assertEquals("description", new JacksonAnnotationIntrospector().findPropertyDescription(field));
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        Version version = new JacksonAnnotationIntrospector().version();
        assertNotNull(version);
        assertEquals(com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION, version);
    }

    @Test
    public void testBundleDetectionUsesMetaAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        Bundle bundle = BundleBean.class.getField("bundled").getAnnotation(Bundle.class);
        JsonProperty property = BundleBean.class.getField("bundled").getAnnotation(JsonProperty.class);
        assertTrue(ai.isAnnotationBundle(bundle));
        assertFalse(ai.isAnnotationBundle(property));
    }

    @Test
    public void testNamingStrategyAndClassDescription() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass named = AnnotatedClass.construct(mapper.constructType(NamingBean.class),
                mapper.getSerializationConfig());
        assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class, ai.findNamingStrategy(named));
        AnnotatedClass described = AnnotatedClass.construct(mapper.constructType(DescribedBean.class),
                mapper.getSerializationConfig());
        assertEquals("class note", ai.findClassDescription(described));
    }

    @Test
    public void testAutoDetectVisibilityUsesAnnotation() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(VisibleBean.class),
                mapper.getSerializationConfig());
        VisibilityChecker<?> checker = mapper.getSerializationConfig().getDefaultVisibilityChecker();
        VisibilityChecker<?> result = new JacksonAnnotationIntrospector().findAutoDetectVisibility(ac, checker);
        assertFalse(checker == result);
    }

    @Test
    public void testPropertyAccessFormatAndViews() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(MoreMembers.class),
                mapper.getSerializationConfig());
        AnnotatedField access = null, formatted = null, viewed = null;
        for (AnnotatedField f : ac.fields()) {
            if ("readOnly".equals(f.getName())) access = f;
            if ("formatted".equals(f.getName())) formatted = f;
            if ("viewed".equals(f.getName())) viewed = f;
        }
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals(JsonProperty.Access.READ_ONLY, ai.findPropertyAccess(access));
        assertEquals(JsonFormat.Shape.STRING, ai.findFormat(formatted).getShape());
        assertArrayEquals(new Class<?>[] {String.class, Integer.class}, ai.findViews(viewed));
    }

    @Test
    public void testReferenceUnwrappingAndTypeIdAnnotations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(MoreMembers.class),
                mapper.getSerializationConfig());
        AnnotatedField managed = null, back = null, unwrapped = null, typeId = null;
        for (AnnotatedField f : ac.fields()) {
            if ("managed".equals(f.getName())) managed = f;
            if ("back".equals(f.getName())) back = f;
            if ("unwrapped".equals(f.getName())) unwrapped = f;
            if ("typeId".equals(f.getName())) typeId = f;
        }
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertTrue(ai.findReferenceType(managed).isManagedReference());
        assertEquals("link", ai.findReferenceType(managed).getName());
        assertTrue(ai.findReferenceType(back).isBackReference());
        assertEquals("back", ai.findReferenceType(back).getName());
        assertTrue(ai.findUnwrappingNameTransformer(unwrapped).transform("x").startsWith("pre"));
        assertTrue(ai.findUnwrappingNameTransformer(unwrapped).transform("x").endsWith("post"));
        assertEquals(Boolean.TRUE, ai.isTypeId(typeId));
    }

    @Test
    public void testInjectableValueIdAndImplicitNameFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(MoreMembers.class),
                mapper.getDeserializationConfig());
        AnnotatedField injected = null;
        for (AnnotatedField f : ac.fields()) {
            if ("injected".equals(f.getName())) injected = f;
        }
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals("token", ai.findInjectableValueId(injected));
        assertNull(ai.findImplicitPropertyName(injected));
    }

    @Test
    public void testExplicitTypeResolverForAnnotatedClass() throws Exception {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
        class TypedLocal { }
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(TypedLocal.class),
                mapper.getDeserializationConfig());
        TypeResolverBuilder<?> builder = new JacksonAnnotationIntrospector().findTypeResolver(
                mapper.getDeserializationConfig(), ac, mapper.constructType(Object.class));
        assertNotNull(builder);
    }

    @Test
    public void testPropertyTypeResolverDoesNotApplyToContainer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(MoreMembers.class),
                mapper.getDeserializationConfig());
        AnnotatedField field = null;
        for (AnnotatedField f : ac.fields()) {
            if ("serialized".equals(f.getName())) field = f;
        }
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertNull(ai.findPropertyTypeResolver(mapper.getDeserializationConfig(), field,
                mapper.getTypeFactory().constructCollectionType(List.class, String.class)));
    }

    @Test
    public void testPropertyContentTypeResolverRejectsNonContainer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(MoreMembers.class),
                mapper.getDeserializationConfig());
        AnnotatedField field = null;
        for (AnnotatedField f : ac.fields()) {
            if ("serialized".equals(f.getName())) field = f;
        }
        try {
            new JacksonAnnotationIntrospector().findPropertyContentTypeResolver(
                    mapper.getDeserializationConfig(), field, mapper.constructType(String.class));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSerializationAndContentInclusionHonorExplicitAnnotation() throws Exception {
        @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY)
        class Included { }
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(Included.class),
                mapper.getSerializationConfig());
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertEquals(JsonInclude.Include.NON_NULL,
                ai.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
        assertEquals(JsonInclude.Include.NON_EMPTY,
                ai.findSerializationInclusionForContent(ac, JsonInclude.Include.ALWAYS));
        JsonInclude.Value value = ai.findPropertyInclusion(ac);
        assertEquals(JsonInclude.Include.NON_NULL, value.getValueInclusion());
        assertEquals(JsonInclude.Include.NON_EMPTY, value.getContentInclusion());
    }

    @Test
    public void testSerializationTypeAndDeserializationTypeDefaults() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = AnnotatedClass.construct(mapper.constructType(MoreMembers.class),
                mapper.getSerializationConfig());
        AnnotatedField field = null;
        for (AnnotatedField f : ac.fields()) {
            if ("typeId".equals(f.getName())) field = f;
        }
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertNull(ai.findSerializationType(field));
        assertNull(ai.findSerializationKeyType(field, field.getType()));
        assertNull(ai.findSerializationContentType(field, field.getType()));
        assertNull(ai.findDeserializationType(field, field.getType()));
        assertNull(ai.findDeserializationKeyType(field, field.getType()));
        assertNull(ai.findDeserializationContentType(field, field.getType()));
    }
}
