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
    @Test
    public void testEnumValueUsesAnnotatedName() throws Exception {
        assertEquals("wire", new JacksonAnnotationIntrospector().findEnumValue(SampleEnum.NAMED));
    }

    @Test
    public void testEnumValueFallsBackToConstantName() throws Exception {
        assertEquals("PLAIN", new JacksonAnnotationIntrospector().findEnumValue(SampleEnum.PLAIN));
    }

    @Test
    public void testRootNameAndEmptyNamespace() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        PropertyName name = ai.findRootName(AnnotatedClass.construct(Root.class, ai, null));
        assertEquals("root", name.getSimpleName());
        assertNull(name.getNamespace());
    }

    @Test
    public void testIgnoreProperties() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        String[] ignored = ai.findPropertiesToIgnore(AnnotatedClass.construct(Ignored.class, ai, null));
        assertArrayEquals(new String[] { "old" }, ignored);
    }

    @Test
    public void testIgnoreUnknownAndIgnorableType() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(Ignored.class, ai, null);
        assertEquals(Boolean.TRUE, ai.findIgnoreUnknownProperties(ac));
        assertEquals(Boolean.TRUE, ai.isIgnorableType(AnnotatedClass.construct(IgnoredType.class, ai, null)));
    }

    @Test
    public void testFilterEmptyIsAbsentAndNonemptyIsReturned() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertNull(ai.findFilterId(AnnotatedClass.construct(EmptyFilter.class, ai, null)));
        assertEquals("items", ai.findFilterId(AnnotatedClass.construct(Filtered.class, ai, null)));
    }

    @Test
    public void testImplicitPropertyNameAndUnannotatedRequiredMarker() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(MemberBean.class, ai, null);
        AnnotatedField field = ac.fields().iterator().next();
        assertNull(ai.findImplicitPropertyName(field));
        assertNull(ai.hasRequiredMarker(field));
        assertFalse(ai.hasIgnoreMarker(field));
    }

    @Test
    public void testPropertyMetadataAnnotations() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(MemberBean.class, ai, null);
        AnnotatedField field = ac.fields().iterator().next();
        assertEquals(Integer.valueOf(2), ai.findPropertyIndex(field));
        assertEquals("fallback", ai.findPropertyDefaultValue(field));
        assertEquals("description", ai.findPropertyDescription(field));
        assertEquals(JsonProperty.Access.READ_ONLY, ai.findPropertyAccess(field));
    }

    @Test
    public void testPropertyWithoutDescriptionOrIndex() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(MemberBean.class, ai, null);
        AnnotatedField field = ac.fields().iterator().next();
        assertNull(ai.findPropertyDescription(field));
    }

    @Test
    public void testFindNameForSerializationAndDeserialization() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(MemberBean.class, ai, null);
        AnnotatedField field = ac.fields().iterator().next();
        assertEquals("out", ai.findNameForSerialization(field).getSimpleName());
        assertEquals("in", ai.findNameForDeserialization(field).getSimpleName());
    }

    @Test
    public void testPropertyNameAnnotationPrecedenceForGetter() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(MemberBean.class, ai, null);
        AnnotatedMethod method = ac.findMethod("getValue", new Class<?>[0]);
        assertEquals("getter", ai.findNameForSerialization(method).getSimpleName());
    }

    @Test
    public void testTypeNameAndSubtypeList() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(Typed.class, ai, null);
        assertEquals("typed", ai.findTypeName(ac));
        List<NamedType> subtypes = ai.findSubtypes(ac);
        assertEquals(1, subtypes.size());
        assertEquals(Sub.class, subtypes.get(0).getType());
        assertEquals("sub", subtypes.get(0).getName());
    }

    @Test
    public void testSerializationInclusionAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(Included.class, ai, null);
        assertEquals(JsonInclude.Include.NON_NULL,
                ai.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testSerializationInclusionUsesDefaultWhenUnspecified() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(MemberBean.class, ai, null);
        assertEquals(JsonInclude.Include.ALWAYS,
                ai.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testSerializationPropertyOrderAndAlphabeticFlag() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(Ordered.class, ai, null);
        assertArrayEquals(new String[] { "z", "a" }, ai.findSerializationPropertyOrder(ac));
        assertEquals(Boolean.TRUE, ai.findSerializationSortAlphabetically(ac));
    }

    @Test
    public void testCreatorBindingAndDisabledCreator() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(Creators.class, ai, null);
        AnnotatedMethod enabled = ac.findMethod("create", new Class<?>[0]);
        AnnotatedMethod disabled = ac.findMethod("disabled", new Class<?>[0]);
        assertTrue(ai.hasCreatorAnnotation(enabled));
        assertEquals(JsonCreator.Mode.DEFAULT, ai.findCreatorBinding(enabled));
        assertFalse(ai.hasCreatorAnnotation(disabled));
        assertEquals(JsonCreator.Mode.DISABLED, ai.findCreatorBinding(disabled));
    }

    @Test
    public void testDefaultNameForJsonDeserializeProperty() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(MemberBean.class, ai, null);
        AnnotatedField field = ac.fields().iterator().next();
        assertEquals("in", ai.findNameForDeserialization(field).getSimpleName());
    }

    @Test
    public void testVersionIsAvailable() throws Exception {
        assertNotNull(new JacksonAnnotationIntrospector().version());
    }

    @Test
    public void testAnnotationBundleRecognition() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertTrue(ai.isAnnotationBundle(Bundle.class.getAnnotation(Bundle.class)));
    }

    @Test
    public void testFindFormatFromAnnotatedField() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(FormatBean.class, ai, null);
        JsonFormat.Value value = ai.findFormat(ac.fields().iterator().next());
        assertNotNull(value);
        assertEquals(JsonFormat.Shape.STRING, value.getShape());
    }

    @Test
    public void testReferencePropertyManagedAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(ReferenceBean.class, ai, null);
        assertTrue(ai.findReferenceType(ac.fields().iterator().next()).isManagedReference());
    }

    @Test
    public void testUnwrappingTransformerPrefixesAndSuffixesNames() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(UnwrappedBean.class, ai, null);
        NameTransformer transformer = ai.findUnwrappingNameTransformer(ac.fields().iterator().next());
        assertEquals("preNamepost", transformer.transform("Name"));
    }

    @Test
    public void testInjectableValueExplicitId() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(InjectBean.class, ai, null);
        assertEquals("token", ai.findInjectableValueId(ac.fields().iterator().next()));
    }

    @Test
    public void testFindViewsReturnsAnnotatedView() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(ViewBean.class, ai, null);
        assertArrayEquals(new Class<?>[] { PublicView.class }, ai.findViews(ac.fields().iterator().next()));
    }

    @Test
    public void testTypeResolverCreatedForExplicitTypeInfo() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(TypeInfoBean.class, ai, null);
        JavaType base = new ObjectMapper().constructType(Object.class);
        assertNotNull(ai.findTypeResolver(null, ac, base));
    }

    @Test
    public void testContainerTypeSkipsPropertyTypeResolver() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(TypeInfoMember.class, ai, null);
        AnnotatedField field = ac.fields().iterator().next();
        JavaType container = new ObjectMapper().constructType(List.class);
        assertNull(ai.findPropertyTypeResolver(null, field, container));
    }

    @Test
    public void testPropertyContentResolverRejectsNonContainerType() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(TypeInfoMember.class, ai, null);
        AnnotatedField field = ac.fields().iterator().next();
        JavaType scalar = new ObjectMapper().constructType(String.class);
        try {
            ai.findPropertyContentTypeResolver(null, field, scalar);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testTypeIdMarkerOnAnnotatedMember() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(TypeIdBean.class, ai, null);
        assertEquals(Boolean.TRUE, ai.isTypeId(ac.fields().iterator().next()));
    }

    @Test
    public void testObjectIdentityInfoFromAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(IdentityBean.class, ai, null);
        assertNotNull(ai.findObjectIdInfo(ac));
    }

    @Test
    public void testRawValueCreatesSerializerMarker() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(RawBean.class, ai, null);
        assertNotNull(ai.findSerializer(ac.fields().iterator().next()));
    }

    @Test
    public void testContentInclusionUsesExplicitContentValue() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(ContentIncluded.class, ai, null);
        assertEquals(JsonInclude.Include.NON_EMPTY,
                ai.findSerializationInclusionForContent(ac, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testPropertyInclusionValuesAndContent() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(ContentIncluded.class, ai, null);
        JsonInclude.Value value = ai.findPropertyInclusion(ac);
        assertEquals(JsonInclude.Include.NON_NULL, value.getValueInclusion());
        assertEquals(JsonInclude.Include.NON_EMPTY, value.getContentInclusion());
    }

    @Test
    public void testSerializationTypingFromAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(TypingBean.class, ai, null);
        assertEquals(JsonSerialize.Typing.STATIC, ai.findSerializationTyping(ac));
    }

    @Test
    public void testAsValueAnnotationOnMethod() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(ValueBean.class, ai, null);
        assertTrue(ai.hasAsValueAnnotation(ac.findMethod("value", new Class<?>[0])));
    }

    @Test
    public void testDeserializerFromAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(DeserializerBean.class, ai, null);
        assertEquals(StringDeserializer.class, ai.findDeserializer(ac.fields().iterator().next()));
    }

    @Test
    public void testPojoBuilderClassFromDeserializeAnnotation() throws Exception {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(BuilderTarget.class, ai, null);
        assertEquals(Builder.class, ai.findPOJOBuilder(ac));
    }

    enum SampleEnum {
        @JsonProperty("wire") NAMED,
        PLAIN
    }

    @JacksonAnnotationsInside
    @interface Bundle { }

    @JsonRootName("root")
    static class Root { }

    @JsonIgnoreProperties(value = { "old" }, ignoreUnknown = true)
    static class Ignored { }

    @JsonIgnoreType
    static class IgnoredType { }

    @JsonFilter("")
    static class EmptyFilter { }

    @JsonFilter("items")
    static class Filtered { }

    static class MemberBean {
        @JsonProperty(value = "out", index = 2, defaultValue = "fallback",
                access = JsonProperty.Access.READ_ONLY)
        @JsonPropertyDescription("description")
        public String value;

        @JsonGetter("getter")
        public String getValue() { return value; }
    }

    @JsonTypeName("typed")
    @JsonSubTypes(@JsonSubTypes.Type(value = Sub.class, name = "sub"))
    static class Typed { }

    static class Sub { }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class Included { }

    @JsonPropertyOrder(value = { "z", "a" }, alphabetic = true)
    static class Ordered { }

    static class Creators {
        @JsonCreator
        public static Creators create() { return new Creators(); }

        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public static Creators disabled() { return new Creators(); }
    }

    static class FormatBean {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public String value;
    }

    static class ReferenceBean {
        @JsonManagedReference
        public String value;
    }

    static class UnwrappedBean {
        @JsonUnwrapped(prefix = "pre", suffix = "post")
        public String value;
    }

    static class InjectBean {
        @JacksonInject("token")
        public String value;
    }

    static class PublicView { }

    static class ViewBean {
        @JsonView(PublicView.class)
        public String value;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
    static class TypeInfoBean { }

    static class TypeInfoMember {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
        public String value;
    }

    static class TypeIdBean {
        @JsonTypeId
        public String value;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    static class IdentityBean { }

    static class RawBean {
        @JsonRawValue
        public String value;
    }

    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY)
    static class ContentIncluded { }

    @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
    static class TypingBean { }

    static class ValueBean {
        @JsonValue
        public String value() { return "x"; }
    }

    static class StringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(com.fasterxml.jackson.core.JsonParser p,
                DeserializationContext ctxt) { return ""; }
    }

    @JsonDeserialize(using = StringDeserializer.class)
    static class DeserializerBean {
        public String value;
    }

    @JsonDeserialize(builder = Builder.class)
    static class BuilderTarget { }

    static class Builder { }
}
```