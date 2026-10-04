package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.beans.ConstructorProperties;
import java.beans.Transient;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.BeanDescription;
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
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TypeResolutionContext;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;

// Dummy enum and classes for testing purposes, defined outside of test methods to avoid "local enum" error.
@JsonRootName("MyRoot")
class TestClassWithRootName {}

@JsonIgnoreProperties(value = {"field1", "field2"})
class TestClassWithIgnoreProperties {
    public String field1;
    public String field2;
    public String field3;
}

@JsonIgnoreProperties(value = {"field1"}, allowGetters = true)
class TestClassWithIgnorePropertiesAllowGetters {
    public String field1;
}

@JsonIgnoreProperties(value = {"field1"}, allowSetters = true)
class TestClassWithIgnorePropertiesAllowSetters {
    public String field1;
}

@JsonIgnoreProperties(ignoreUnknown = true)
class TestClassWithIgnoreUnknownTrue {}

@JsonIgnoreProperties(ignoreUnknown = false)
class TestClassWithIgnoreUnknownFalse {}

@JsonIgnoreType
class TestClassIgnorableType {}

@JsonFilter("myFilter")
class TestClassWithFilter {}

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class TestClassWithNamingStrategy {}

@JsonClassDescription("A simple class")
class TestClassWithClassDescription {}

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE,
                isGetterVisibility = JsonAutoDetect.Visibility.NONE,
                creatorVisibility = JsonAutoDetect.Visibility.NONE)
class TestClassWithAutoDetect {}

class TestClassWithIgnoreMarker {
    @JsonIgnore
    public String fieldToIgnore;
}

class TestClassWithTransientMarker {
    @Transient
    public String transientField;
}

class TestClassWithRequiredMarker {
    @JsonProperty(required = true)
    public String requiredField;
}

class TestClassWithPropertyAccess {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public String readOnlyField;
}

class TestClassWithPropertyDescription {
    @JsonPropertyDescription("This is a description")
    public String describedField;
}

class TestClassWithPropertyIndex {
    @JsonProperty(index = 5)
    public String indexedField;
}

class TestClassWithPropertyDefaultValue {
    @JsonProperty(defaultValue = "defaultVal")
    public String fieldWithDefault;
}

@JsonFormat(shape = JsonFormat.Shape.STRING)
class TestClassWithFormatShape {}

@JsonFormat(pattern = "yyyy-MM-dd")
class TestClassWithFormatPattern {}

class TestClassWithManagedReference {
    @JsonManagedReference("ref")
    public List<String> list;
}

class TestClassWithBackReference {
    @JsonBackReference("ref")
    public List<String> list;
}

class TestClassWithUnwrapped {
    @JsonUnwrapped(enabled = true, prefix = "pre_", suffix = "_suf")
    public String inner;
}

class TestClassWithJacksonInject {
    @JacksonInject("myId")
    public String value;
}

class TestClassWithView {
    @JsonView(MyView.class)
    public String viewField;
}

class TestClassWithMultipleViews {
    @JsonView({View1.class, View2.class})
    public String viewField;
}
class MyView {}
class View1 {}
class View2 {}


class TestClassWithSetterConflict {
    public void setVal(int x) {}
    public void setVal(String x) {}
}

class TestClassWithSetterConflict2 {
    public void setVal(String x) {}
    public void setVal(Integer x) {}
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
class TestClassWithTypeInfo {}

class TestClassWithSubtypes {
    @JsonSubTypes({
        @JsonSubTypes.Type(value = SubType1.class, name = "type1"),
        @JsonSubTypes.Type(value = SubType2.class, name = "type2")
    })
    static class AnnotatedBaseClass {}
}
class SubType1 extends TestClassWithSubtypes.AnnotatedBaseClass {}
class SubType2 extends TestClassWithSubtypes.AnnotatedBaseClass {}

@JsonTypeName("MyTypeName")
class TestClassWithTypeName {}

class TestClassWithTypeId {
    @JsonTypeId
    public String idField;
}

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
class TestClassWithObjectIdInfo {}

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id", scope = String.class)
class TestClassWithObjectIdInfoScope {}

@JsonIdentityReference(alwaysAsId = true)
class TestClassWithObjectReferenceInfo {}

class CustomSerializer extends JsonSerializer<Object> {}
class TestClassWithJsonSerializeUsing {
    @JsonSerialize(using = CustomSerializer.class)
    public String field;
}

class TestClassWithRawValue {
    @JsonRawValue
    public String rawField;
}

class CustomKeySerializer extends JsonSerializer<Object> {}
class TestClassWithKeySerializeUsing {
    @JsonSerialize(keyUsing = CustomKeySerializer.class)
    public Map<String, Integer> map;
}

class CustomContentSerializer extends JsonSerializer<Object> {}
class TestClassWithContentSerializeUsing {
    @JsonSerialize(contentUsing = CustomContentSerializer.class)
    public List<String> list;
}

class CustomNullSerializer extends JsonSerializer<Object> {}
class TestClassWithNullSerializeUsing {
    @JsonSerialize(nullsUsing = CustomNullSerializer.class)
    public String nullableField;
}

@JsonInclude(JsonInclude.Include.NON_EMPTY)
class TestClassWithSerializationInclusionValue {}

@SuppressWarnings("deprecation")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
class TestClassWithSerializationInclusionSerialize {}

@JsonInclude(content = JsonInclude.Include.NON_NULL)
class TestClassWithSerializationInclusionForContent {}

@JsonInclude(value = JsonInclude.Include.ALWAYS, content = JsonInclude.Include.NON_DEFAULT)
class TestClassWithPropertyInclusion {}

class TargetType {}
class TestClassWithSerializationType {
    @JsonSerialize(as = TargetType.class)
    public Object field;
}

class TargetKeyType {}
class TestClassWithSerializationKeyType {
    @JsonSerialize(keyAs = TargetKeyType.class)
    public Map<String, Integer> map;
}

class TargetContentType {}
class TestClassWithSerializationContentType {
    @JsonSerialize(contentAs = TargetContentType.class)
    public List<String> list;
}

@JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
class TestClassWithSerializationTyping {}

class CustomConverter extends Converter<Object, Object> {
    @Override public Object convert(Object value) { return value; }
    @Override public JavaType getInputType(TypeFactory typeFactory) { return null; }
    @Override public JavaType getOutputType(TypeFactory typeFactory) { return null; }
}
class TestClassWithSerializationConverter {
    @JsonSerialize(converter = CustomConverter.class)
    public Object field;
}

class CustomContentConverter extends Converter<Object, Object> {
    @Override public Object convert(Object value) { return value; }
    @Override public JavaType getInputType(TypeFactory typeFactory) { return null; }
    @Override public JavaType getOutputType(TypeFactory typeFactory) { return null; }
}
class TestClassWithSerializationContentConverter {
    @JsonSerialize(contentConverter = CustomContentConverter.class)
    public Object field;
}

@JsonPropertyOrder({"prop2", "prop1"})
class TestClassWithPropertyOrder {
    public String prop1;
    public String prop2;
}

@JsonPropertyOrder(alphabetic = true)
class TestClassWithSortAlphabeticallyTrue {}

@JsonPropertyOrder(alphabetic = false)
class TestClassWithSortAlphabeticallyFalse {}

class TestClassWithNameForSerialization {
    @JsonProperty("customName")
    public String field;
}

class TestClassWithJsonGetter {
    @JsonGetter("getterName")
    public String getField() { return "value"; }
}

class TestClassWithAsValue {
    @JsonValue
    public String getValue() { return "value"; }
}

class CustomDeserializer extends JsonDeserializer<Object> {}
class TestClassWithDeserializer {
    @JsonDeserialize(using = CustomDeserializer.class)
    public String field;
}

class CustomKeyDeserializer extends KeyDeserializer {}
class TestClassWithKeyDeserializer {
    @JsonDeserialize(keyUsing = CustomKeyDeserializer.class)
    public Map<String, Integer> map;
}

class CustomContentDeserializer extends JsonDeserializer<Object> {}
class TestClassWithContentDeserializer {
    @JsonDeserialize(contentUsing = CustomContentDeserializer.class)
    public List<String> list;
}

class CustomDeserializationConverter extends Converter<Object, Object> {
    @Override public Object convert(Object value) { return value; }
    @Override public JavaType getInputType(TypeFactory typeFactory) { return null; }
    @Override public JavaType getOutputType(TypeFactory typeFactory) { return null; }
}
class TestClassWithDeserializationConverter {
    @JsonDeserialize(converter = CustomDeserializationConverter.class)
    public Object field;
}

class CustomDeserializationContentConverter extends Converter<Object, Object> {
    @Override public Object convert(Object value) { return value; }
    @Override public JavaType getInputType(TypeFactory typeFactory) { return null; }
    @Override public JavaType getOutputType(TypeFactory typeFactory) { return null; }
}
class TestClassWithDeserializationContentConverter {
    @JsonDeserialize(contentConverter = CustomDeserializationContentConverter.class)
    public Object field;
}

class TargetDeserializationContentType {}
class TestClassWithDeserializationContentType {
    @JsonDeserialize(contentAs = TargetDeserializationContentType.class)
    public List<String> list;
}

class TargetDeserializationType {}
class TestClassWithDeserializationType {
    @JsonDeserialize(as = TargetDeserializationType.class)
    public Object field;
}

class TargetDeserializationKeyType {}
class TestClassWithDeserializationKeyType {
    @JsonDeserialize(keyAs = TargetDeserializationKeyType.class)
    public Map<String, Integer> map;
}

class CustomValueInstantiator extends ValueInstantiator {}
@JsonValueInstantiator(value = CustomValueInstantiator.class)
class TestClassWithValueInstantiator {}

class MyBuilder {}
class TestClassWithPOJOBuilder {
    @JsonDeserialize(builder = MyBuilder.class)
    public Object field;
}

@JsonPOJOBuilder(withPrefix = "with", buildMethodName = "buildIt")
class TestClassWithPOJOBuilderConfig {}

class TestClassWithSetterName {
    @JsonSetter("setterName")
    public void setField(String value) {}
}

class TestClassWithAnySetter {
    @JsonAnySetter
    public void setAny(String key, Object value) {}
}

class TestClassWithAnyGetter {
    @JsonAnyGetter
    public Map<String, Object> getAny() { return null; }
}

class TestClassWithCreatorAnnotation {
    @JsonCreator
    public TestClassWithCreatorAnnotation() {}
}

class TestClassWithConstructorPropertiesCreator {
    @ConstructorProperties({"param"})
    public TestClassWithConstructorPropertiesCreator(String param) {}
}

@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
class TestClassWithCreatorBindingProperties {
    @ConstructorProperties({"prop"})
    public TestClassWithCreatorBindingProperties(String prop) {}
}

@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
class TestClassWithCreatorBindingDelegating {
    public TestClassWithCreatorBindingDelegating(String value) {}
}

// Dummy Enum for findEnumValue tests
enum EnumWithJsonProperty {
    @JsonProperty("custom_value")
    NORMAL_VALUE;
}

// Dummy Enum for findEnumValues tests
enum MyEnum {
    VAL1, @JsonProperty("custom_val2") VAL2, VAL3
}

// Dummy Annotation for isAnnotationBundle test
@JacksonAnnotationsInside
@interface MyBundleAnnotation {}

// Dummy Inner Class for VirtualBeanPropertyWriter test
class StringBeanPropertyWriter extends VirtualBeanPropertyWriter {
    public StringBeanPropertyWriter(String name, PropertyMetadata md, JavaType type) { super(name, md, type); }
    public StringBeanPropertyWriter() {}
    @Override protected Object value(Object bean, JsonGenerator gen, SerializerProvider provider) throws IOException { return "virtual value"; }
}

// Dummy Inner Class for TypeResolverBuilder test
class CustomTypeResolverBuilder extends StdTypeResolverBuilder {}

// Dummy Inner Class for POJO Builder test
class DummyPOJOBuilder {}

// Dummy Class for ConstructorPropertiesImpliesCreator test
class TestClassForConstructorProperties {
    @ConstructorProperties({"param"})
    public TestClassForConstructorProperties(String param) {}
}


public class JacksonAnnotationIntrospectorTest {

    private final JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

    // Helper to create dummy AnnotatedClass for testing
    private AnnotatedClass createDummyAnnotatedClass(Class<?> cls) {
        MapperConfig<?> mockConfig = new MapperConfigBase<MapperConfig<?>>(new BaseSettings(null, null, null, TypeFactory.defaultInstance()), 0) {
            @Override public boolean isEnabled(MapperFeature f) { return false; }
            @Override public SubtypeResolver getSubtypeResolver() { return null; }
            @Override public boolean useRootWrapping() { return false; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return introspector; }
             @Override public JavaType constructType(Type a) { return TypeFactory.defaultInstance().constructType(a); }
             @Override
            public BeanDescription introspectClassAnnotations(JavaType type) {
                return BeanDescription.forBasic(this, type, null);
            }
            @Override
            public MapperConfig<?> with(MapperFeature... features) { return this; }
            @Override
            public MapperConfig<?> without(MapperFeature... features) { return this; }
            @Override
            public MapperConfig<?> with(MapperFeature feature, boolean state) { return this; }
        };
        return AnnotatedClass.construct(TypeFactory.defaultInstance().constructType(cls), mockConfig);
    }

    // Helper to create dummy AnnotatedMember for testing
    private AnnotatedMember createDummyAnnotatedMember(Class<?> cls, String fieldName) {
        try {
            Field f = cls.getDeclaredField(fieldName);
            TypeResolutionContext mockCtxt = new TypeResolutionContext() {
                @Override public JavaType resolveType(Type type) {
                    return TypeFactory.defaultInstance().constructType(type);
                }
            };
            return new AnnotatedField(mockCtxt, f, AnnotationMap.of(f.getAnnotations()));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    // Helper to create dummy AnnotatedMethod for testing
    private AnnotatedMethod createDummyAnnotatedMethod(Class<?> cls, String methodName, Class<?>... paramTypes) {
        try {
            Method m = cls.getDeclaredMethod(methodName, paramTypes);
            TypeResolutionContext mockCtxt = new TypeResolutionContext() {
                @Override public JavaType resolveType(Type type) {
                    return TypeFactory.defaultInstance().constructType(type);
                }
            };
            // Simplified: assuming no class or parameter annotations for basic tests
            return new AnnotatedMethod(mockCtxt, m, AnnotationMap.of(m.getDeclaringClass().getAnnotations()), new AnnotationMap[m.getParameterCount()]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    // Helper to create dummy AnnotatedConstructor for testing
    private AnnotatedConstructor createDummyAnnotatedConstructor(Class<?> cls, Class<?>... paramTypes) {
        try {
            Constructor<?> c = cls.getDeclaredConstructor(paramTypes);
            TypeResolutionContext mockCtxt = new TypeResolutionContext() {
                @Override public JavaType resolveType(Type type) {
                    return TypeFactory.defaultInstance().constructType(type);
                }
            };
            AnnotationMap[] paramAnnotations = new AnnotationMap[c.getParameterCount()];
            for (int i = 0; i < c.getParameterCount(); i++) {
                paramAnnotations[i] = AnnotationMap.of(c.getParameterAnnotations()[i]);
            }
            return new AnnotatedConstructor(mockCtxt, c, AnnotationMap.of(c.getDeclaringClass().getAnnotations()), paramAnnotations);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testFindEnumValue_withJsonProperty() throws Exception {
        assertEquals("custom_value", introspector.findEnumValue(EnumWithJsonProperty.NORMAL_VALUE));
    }

    @Test
    public void testFindEnumValues_withJsonProperty() throws Exception {
        MyEnum[] values = MyEnum.values();
        String[] names = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            names[i] = values[i].name();
        }
        String[] resultNames = introspector.findEnumValues(MyEnum.class, values, names);
        assertNotNull(resultNames);
        assertEquals(3, resultNames.length);
        assertEquals("VAL1", resultNames[0]);
        assertEquals("custom_val2", resultNames[1]);
        assertEquals("VAL3", resultNames[2]);
    }

    @Test
    public void testFindRootName_withJsonRootName() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithRootName.class);
        PropertyName rootName = introspector.findRootName(ac);
        assertNotNull(rootName);
        assertEquals("MyRoot", rootName.getSimpleName());
        assertNull(rootName.getNamespace());
    }

    @Test
    public void testFindPropertiesToIgnore_JsonIgnorePropertiesValue() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithIgnoreProperties.class);
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithIgnoreProperties.class, "field1");
        String[] ignored = introspector.findPropertiesToIgnore((Annotated) member);
        assertNotNull(ignored);
        assertArrayEquals(new String[]{"field1", "field2"}, ignored);
    }

    @Test
    public void testFindPropertiesToIgnore_JsonIgnorePropertiesAllowGetters() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithIgnorePropertiesAllowGetters.class);
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithIgnorePropertiesAllowGetters.class, "field1");
        String[] ignored = introspector.findPropertiesToIgnore((Annotated) member, true);
        assertNull(ignored);
    }

    @Test
    public void testFindPropertiesToIgnore_JsonIgnorePropertiesAllowSetters() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithIgnorePropertiesAllowSetters.class);
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithIgnorePropertiesAllowSetters.class, "field1");
        String[] ignored = introspector.findPropertiesToIgnore((Annotated) member, false);
        assertNull(ignored);
    }

    @Test
    public void testFindIgnoreUnknownProperties_true() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithIgnoreUnknownTrue.class);
        Boolean ignoreUnknown = introspector.findIgnoreUnknownProperties(ac);
        assertNotNull(ignoreUnknown);
        assertTrue(ignoreUnknown);
    }

    @Test
    public void testFindIgnoreUnknownProperties_false() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithIgnoreUnknownFalse.class);
        Boolean ignoreUnknown = introspector.findIgnoreUnknownProperties(ac);
        assertNotNull(ignoreUnknown);
        assertFalse(ignoreUnknown);
    }

    @Test
    public void testIsIgnorableType_true() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassIgnorableType.class);
        Boolean ignorable = introspector.isIgnorableType(ac);
        assertNotNull(ignorable);
        assertTrue(ignorable);
    }

    @Test
    public void testIsIgnorableType_false() throws Exception {
        class NonIgnorableType {}
        AnnotatedClass ac = createDummyAnnotatedClass(NonIgnorableType.class);
        Boolean ignorable = introspector.isIgnorableType(ac);
        assertNull(ignorable);
    }

    @Test
    public void testFindFilterId_withValue() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithFilter.class);
        Object filterId = introspector.findFilterId(ac);
        assertNotNull(filterId);
        assertEquals("myFilter", filterId);
    }

    @Test
    public void testFindFilterId_withEmptyValue() throws Exception {
        @JsonFilter("")
        class MyClassWithEmptyFilter {}
        AnnotatedClass ac = createDummyAnnotatedClass(MyClassWithEmptyFilter.class);
        Object filterId = introspector.findFilterId(ac);
        assertNull(filterId);
    }

    @Test
    public void testFindNamingStrategy_withValue() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithNamingStrategy.class);
        String namingStrategy = (String) introspector.findNamingStrategy(ac);
        assertNotNull(namingStrategy);
        assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class.getName(), namingStrategy);
    }

    @Test
    public void testFindClassDescription() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithClassDescription.class);
        String description = introspector.findClassDescription(ac);
        assertNotNull(description);
        assertEquals("A simple class", description);
    }

    @Test
    public void testFindAutoDetectVisibility_withAnnotated() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithAutoDetect.class);
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> newChecker = introspector.findAutoDetectVisibility(ac, checker);
        assertNotNull(newChecker);
        assertEquals(JsonAutoDetect.Visibility.ANY, newChecker.findAutoDetectVisibility(null, null, false, false, false, false));
        assertEquals(JsonAutoDetect.Visibility.NONE, newChecker.findAutoDetectVisibility(null, null, true, false, false, false));
        assertEquals(JsonAutoDetect.Visibility.NONE, newChecker.findAutoDetectVisibility(null, null, false, true, false, false));
        assertEquals(JsonAutoDetect.Visibility.NONE, newChecker.findAutoDetectVisibility(null, null, false, false, true, false));
        assertEquals(JsonAutoDetect.Visibility.NONE, newChecker.findAutoDetectVisibility(null, null, false, false, false, true));
    }

    @Test
    public void testHasIgnoreMarker_JsonIgnoreField() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithIgnoreMarker.class, "fieldToIgnore");
        assertTrue(introspector.hasIgnoreMarker(member));
    }

    @Test
    public void testHasIgnoreMarker_TransientField() throws Exception {
        if (introspector._jdk7Helper != null) {
             AnnotatedMember member = createDummyAnnotatedMember(TestClassWithTransientMarker.class, "transientField");
             assertTrue(introspector.hasIgnoreMarker(member));
        }
    }

    @Test
    public void testHasRequiredMarker_JsonPropertyRequiredTrue() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithRequiredMarker.class, "requiredField");
        Boolean required = introspector.hasRequiredMarker(member);
        assertNotNull(required);
        assertTrue(required);
    }

    @Test
    public void testHasRequiredMarker_JsonPropertyRequiredFalse() throws Exception {
        class MyClass { @JsonProperty(required = false) public String notRequiredField; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "notRequiredField");
        Boolean required = introspector.hasRequiredMarker(member);
        assertNotNull(required);
        assertFalse(required);
    }

    @Test
    public void testHasRequiredMarker_NoAnnotation() throws Exception {
        class MyClass { public String field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        Boolean required = introspector.hasRequiredMarker(member);
        assertNull(required);
    }

    @Test
    public void testFindPropertyAccess_readOnly() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithPropertyAccess.class, "readOnlyField");
        JsonProperty.Access access = introspector.findPropertyAccess(member);
        assertNotNull(access);
        assertEquals(JsonProperty.Access.READ_ONLY, access);
    }

    @Test
    public void testFindPropertyAccess_writeOnly() throws Exception {
        class MyClass { @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) public String writeOnlyField; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "writeOnlyField");
        JsonProperty.Access access = introspector.findPropertyAccess(member);
        assertNotNull(access);
        assertEquals(JsonProperty.Access.WRITE_ONLY, access);
    }

    @Test
    public void testFindPropertyAccess_auto() throws Exception {
        class MyClass { @JsonProperty(access = JsonProperty.Access.AUTO) public String autoField; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "autoField");
        JsonProperty.Access access = introspector.findPropertyAccess(member);
        assertNotNull(access);
        assertEquals(JsonProperty.Access.AUTO, access);
    }

    @Test
    public void testFindPropertyDescription() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithPropertyDescription.class, "describedField");
        String description = introspector.findPropertyDescription(member);
        assertNotNull(description);
        assertEquals("This is a description", description);
    }

    @Test
    public void testFindPropertyIndex_positive() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithPropertyIndex.class, "indexedField");
        Integer index = introspector.findPropertyIndex(member);
        assertNotNull(index);
        assertEquals(Integer.valueOf(5), index);
    }

    @Test
    public void testFindPropertyIndex_unknown() throws Exception {
        class MyClass { @JsonProperty(index = JsonProperty.INDEX_UNKNOWN) public String indexedField; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "indexedField");
        Integer index = introspector.findPropertyIndex(member);
        assertNull(index);
    }

    @Test
    public void testFindPropertyDefaultValue_nonEmpty() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithPropertyDefaultValue.class, "fieldWithDefault");
        String defaultValue = introspector.findPropertyDefaultValue(member);
        assertNotNull(defaultValue);
        assertEquals("defaultVal", defaultValue);
    }

    @Test
    public void testFindPropertyDefaultValue_empty() throws Exception {
        class MyClass { @JsonProperty(defaultValue = "") public String fieldWithEmptyDefault; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "fieldWithEmptyDefault");
        String defaultValue = introspector.findPropertyDefaultValue(member);
        assertNull(defaultValue);
    }

    @Test
    public void testFindFormat_shape() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithFormatShape.class);
        JsonFormat.Value format = introspector.findFormat(ac);
        assertNotNull(format);
        assertEquals(JsonFormat.Shape.STRING, format.getShape());
    }

    @Test
    public void testFindFormat_pattern() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithFormatPattern.class);
        JsonFormat.Value format = introspector.findFormat(ac);
        assertNotNull(format);
        assertEquals("yyyy-MM-dd", format.getPattern());
    }

    @Test
    public void testFindReferenceType_managed() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithManagedReference.class, "list");
        ReferenceProperty ref = introspector.findReferenceType(member);
        assertNotNull(ref);
        assertEquals("ref", ref.getName());
        assertTrue(ref.isManaged());
    }

    @Test
    public void testFindReferenceType_back() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithBackReference.class, "list");
        ReferenceProperty ref = introspector.findReferenceType(member);
        assertNotNull(ref);
        assertEquals("ref", ref.getName());
        assertFalse(ref.isManaged());
    }

    @Test
    public void testFindUnwrappingNameTransformer_enabled() throws Exception {
        class InnerClass {} // Dummy inner class for the field
        class MyClass { @JsonUnwrapped(enabled = true, prefix = "pre_", suffix = "_suf") public InnerClass inner; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "inner");
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(member);
        assertNotNull(transformer);
        assertEquals("pre_", transformer.prefix(""));
        assertEquals("_suf", transformer.suffix(""));
        assertEquals("pre_inner_suf", transformer.transform("inner"));
    }

    @Test
    public void testFindUnwrappingNameTransformer_disabled() throws Exception {
        class InnerClass {}
        class MyClass { @JsonUnwrapped(enabled = false) public InnerClass inner; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "inner");
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(member);
        assertNull(transformer);
    }

    @Test
    public void testFindInjectableValueId_withValue() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithJacksonInject.class, "value");
        Object id = introspector.findInjectableValueId(member);
        assertNotNull(id);
        assertEquals("myId", id);
    }

    @Test
    public void testFindInjectableValueId_emptyValue() throws Exception {
        class MyClass { @JacksonInject("") public String value; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "value");
        Object id = introspector.findInjectableValueId(member);
        assertNotNull(id);
        assertEquals(String.class.getName(), id);
    }

    @Test
    public void testFindViews_singleView() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithView.class, "viewField");
        Class<?>[] views = introspector.findViews(member);
        assertNotNull(views);
        assertEquals(1, views.length);
        assertEquals(MyView.class, views[0]);
    }

    @Test
    public void testFindViews_multipleViews() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithMultipleViews.class, "viewField");
        Class<?>[] views = introspector.findViews(member);
        assertNotNull(views);
        assertEquals(2, views.length);
        assertTrue(Arrays.asList(views).contains(View1.class));
        assertTrue(Arrays.asList(views).contains(View2.class));
    }

    @Test
    public void testResolveSetterConflict_preferPrimitive() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSetterConflict.class);
        AnnotatedMethod setter1 = null, setter2 = null;
        for (AnnotatedMethod am : ac.memberMethods()) {
            if ("setVal".equals(am.getName())) {
                if (am.getParameterCount() == 1) {
                    if (am.getRawParameterType(0).isPrimitive()) {
                        setter1 = am;
                    } else {
                        setter2 = am;
                    }
                }
            }
        }
        assertNotNull(setter1); assertNotNull(setter2);
        AnnotatedMethod preferred = introspector.resolveSetterConflict(null, setter1, setter2);
        assertNotNull(preferred); assertSame(setter1, preferred);
    }

    @Test
    public void testResolveSetterConflict_preferString() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSetterConflict2.class);
        AnnotatedMethod setter1 = null, setter2 = null;
        for (AnnotatedMethod am : ac.memberMethods()) {
            if ("setVal".equals(am.getName())) {
                if (am.getParameterCount() == 1) {
                    if (am.getRawParameterType(0) == String.class) {
                        setter1 = am;
                    } else {
                        setter2 = am;
                    }
                }
            }
        }
        assertNotNull(setter1); assertNotNull(setter2);
        AnnotatedMethod preferred = introspector.resolveSetterConflict(null, setter1, setter2);
        assertNotNull(preferred); assertSame(setter1, preferred);
    }

    @Test
    public void testFindTypeResolver_JsonTypeInfo() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithTypeInfo.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeResolverBuilder<?> builder = introspector.findTypeResolver(null, ac, baseType);
        assertNotNull(builder);
    }

    @Test
    public void testFindSubtypes_JsonSubTypes() throws Exception {
        List<NamedType> subtypes = introspector.findSubtypes(createDummyAnnotatedClass(TestClassWithSubtypes.class));
        assertNotNull(subtypes);
        assertEquals(2, subtypes.size());
        NamedType nt1 = subtypes.get(0);
        assertEquals("type1", nt1.getName());
        assertEquals(SubType1.class, nt1.getType());
        NamedType nt2 = subtypes.get(1);
        assertEquals("type2", nt2.getName());
        assertEquals(SubType2.class, nt2.getType());
    }

    @Test
    public void testFindTypeName_JsonTypeName() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithTypeName.class);
        String typeName = introspector.findTypeName(ac);
        assertNotNull(typeName);
        assertEquals("MyTypeName", typeName);
    }

    @Test
    public void testIsTypeId_JsonTypeId() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithTypeId.class, "idField");
        Boolean isTypeId = introspector.isTypeId(member);
        assertNotNull(isTypeId);
        assertTrue(isTypeId);
    }

    @Test
    public void testFindObjectIdInfo_withGenerator() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithObjectIdInfo.class);
        ObjectIdInfo objectIdInfo = introspector.findObjectIdInfo(ac);
        assertNotNull(objectIdInfo);
        assertEquals(ObjectIdGenerators.IntSequenceGenerator.class, objectIdInfo.getGeneratorType());
        assertEquals("id", objectIdInfo.getPropertyName().getSimpleName());
    }

    @Test
    public void testFindObjectIdInfo_withScope() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithObjectIdInfoScope.class);
        ObjectIdInfo objectIdInfo = introspector.findObjectIdInfo(ac);
        assertNotNull(objectIdInfo);
        assertEquals(String.class, objectIdInfo.getScope());
    }

    @Test
    public void testFindObjectIdInfo_noGenerator() throws Exception {
        @JsonIdentityInfo(generator = ObjectIdGenerators.None.class, property = "id")
        class MyClass {}
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        ObjectIdInfo objectIdInfo = introspector.findObjectIdInfo(ac);
        assertNull(objectIdInfo);
    }

    @Test
    public void testFindObjectReferenceInfo_alwaysAsId() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithObjectReferenceInfo.class);
        ObjectIdInfo initialInfo = ObjectIdInfo.empty();
        ObjectIdInfo resultInfo = introspector.findObjectReferenceInfo(ac, initialInfo);
        assertNotNull(resultInfo);
        assertTrue(resultInfo.getAlwaysAsId());
    }

    @Test
    public void testFindSerializer_JsonSerializeUsing() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithJsonSerializeUsing.class, "field");
        Object serializer = introspector.findSerializer(member);
        assertNotNull(serializer);
        assertEquals(CustomSerializer.class, serializer);
    }

    @Test
    public void testFindSerializer_JsonRawValue() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithRawValue.class, "rawField");
        Object serializer = introspector.findSerializer(member);
        assertNotNull(serializer);
        assertTrue(serializer instanceof RawSerializer);
        assertEquals(String.class, ((RawSerializer<?>) serializer).handledType());
    }

    @Test
    public void testFindKeySerializer_JsonSerializeKeyUsing() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithKeySerializeUsing.class, "map");
        Object keySerializer = introspector.findKeySerializer(member);
        assertNotNull(keySerializer);
        assertEquals(CustomKeySerializer.class, keySerializer);
    }

    @Test
    public void testFindContentSerializer_JsonSerializeContentUsing() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithContentSerializeUsing.class, "list");
        Object contentSerializer = introspector.findContentSerializer(member);
        assertNotNull(contentSerializer);
        assertEquals(CustomContentSerializer.class, contentSerializer);
    }

    @Test
    public void testFindNullSerializer_JsonSerializeNullsUsing() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithNullSerializeUsing.class, "nullableField");
        Object nullSerializer = introspector.findNullSerializer(member);
        assertNotNull(nullSerializer);
        assertEquals(CustomNullSerializer.class, nullSerializer);
    }

    @Test
    public void testFindSerializationInclusion_JsonIncludeValue() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSerializationInclusionValue.class);
        JsonInclude.Include inclusion = introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS);
        assertNotNull(inclusion);
        assertEquals(JsonInclude.Include.NON_EMPTY, inclusion);
    }

    @Test
    public void testFindSerializationInclusion_JsonSerializeInclude() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSerializationInclusionSerialize.class);
        JsonInclude.Include inclusion = introspector.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS);
        assertNotNull(inclusion);
        assertEquals(JsonInclude.Include.NON_DEFAULT, inclusion);
    }

    @Test
    public void testFindSerializationInclusionForContent_JsonIncludeContent() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSerializationInclusionForContent.class);
        JsonInclude.Include inclusion = introspector.findSerializationInclusionForContent(ac, JsonInclude.Include.USE_DEFAULTS);
        assertNotNull(inclusion);
        assertEquals(JsonInclude.Include.NON_NULL, inclusion);
    }

    @Test
    public void testFindPropertyInclusion_JsonInclude() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithPropertyInclusion.class);
        JsonInclude.Value inclusion = introspector.findPropertyInclusion(ac);
        assertNotNull(inclusion);
        assertEquals(JsonInclude.Include.ALWAYS, inclusion.getValueInclusion());
        assertEquals(JsonInclude.Include.NON_DEFAULT, inclusion.getContentInclusion());
    }

    @Test
    public void testFindSerializationType_JsonSerializeAs() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithSerializationType.class, "field");
        Class<?> type = introspector.findSerializationType(member);
        assertNotNull(type);
        assertEquals(TargetType.class, type);
    }

    @Test
    public void testFindSerializationKeyType_JsonSerializeKeyAs() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithSerializationKeyType.class, "map");
        JavaType baseType = TypeFactory.defaultInstance().constructType(Map.class);
        Class<?> type = introspector.findSerializationKeyType(member, baseType);
        assertNotNull(type);
        assertEquals(TargetKeyType.class, type);
    }

    @Test
    public void testFindSerializationContentType_JsonSerializeContentAs() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithSerializationContentType.class, "list");
        JavaType baseType = TypeFactory.defaultInstance().constructType(List.class);
        Class<?> type = introspector.findSerializationContentType(member, baseType);
        assertNotNull(type);
        assertEquals(TargetContentType.class, type);
    }

    @Test
    public void testFindSerializationTyping_JsonSerializeTyping() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSerializationTyping.class);
        JsonSerialize.Typing typing = introspector.findSerializationTyping(ac);
        assertNotNull(typing);
        assertEquals(JsonSerialize.Typing.DYNAMIC, typing);
    }

    @Test
    public void testFindSerializationConverter_JsonSerializeConverter() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithSerializationConverter.class, "field");
        Object converter = introspector.findSerializationConverter(member);
        assertNotNull(converter);
        assertEquals(CustomConverter.class, converter);
    }

    @Test
    public void testFindSerializationContentConverter_JsonSerializeContentConverter() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithSerializationContentConverter.class, "field");
        Object converter = introspector.findSerializationContentConverter(member);
        assertNotNull(converter);
        assertEquals(CustomContentConverter.class, converter);
    }

    @Test
    public void testFindSerializationPropertyOrder_value() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithPropertyOrder.class);
        String[] order = introspector.findSerializationPropertyOrder(ac);
        assertNotNull(order);
        assertArrayEquals(new String[]{"prop2", "prop1"}, order);
    }

    @Test
    public void testFindSerializationSortAlphabetically_true() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSortAlphabeticallyTrue.class);
        Boolean sort = introspector.findSerializationSortAlphabetically(ac);
        assertNotNull(sort);
        assertTrue(sort);
    }

    @Test
    public void testFindSerializationSortAlphabetically_false() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSortAlphabeticallyFalse.class);
        Boolean sort = introspector.findSerializationSortAlphabetically(ac);
        assertNull(sort);
    }

    @Test
    public void testFindNameForSerialization_JsonProperty() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithNameForSerialization.class, "field");
        PropertyName name = introspector.findNameForSerialization(member);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());
    }

    @Test
    public void testFindNameForSerialization_JsonGetter() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithJsonGetter.class);
        AnnotatedMethod getter = createDummyAnnotatedMethod(TestClassWithJsonGetter.class, "getField");
        PropertyName name = introspector.findNameForSerialization(getter);
        assertNotNull(name);
        assertEquals("getterName", name.getSimpleName());
    }

    @Test
    public void testHasAsValueAnnotation_true() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithAsValue.class);
        AnnotatedMethod getter = createDummyAnnotatedMethod(TestClassWithAsValue.class, "getValue");
        assertTrue(introspector.hasAsValueAnnotation(getter));
    }

    @Test
    public void testHasAsValueAnnotation_false() throws Exception {
        class MyClass { public Object getValue() { return null; } }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        AnnotatedMethod getter = createDummyAnnotatedMethod(MyClass.class, "getValue");
        assertFalse(introspector.hasAsValueAnnotation(getter));
    }

    @Test
    public void testFindDeserializer_JsonDeserializeUsing() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithDeserializer.class, "field");
        Object deserializer = introspector.findDeserializer(member);
        assertNotNull(deserializer);
        assertEquals(CustomDeserializer.class, deserializer);
    }

    @Test
    public void testFindKeyDeserializer_JsonDeserializeKeyUsing() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithKeyDeserializer.class, "map");
        Object keyDeserializer = introspector.findKeyDeserializer(member);
        assertNotNull(keyDeserializer);
        assertEquals(CustomKeyDeserializer.class, keyDeserializer);
    }

    @Test
    public void testFindContentDeserializer_JsonDeserializeContentUsing() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithContentDeserializer.class, "list");
        Object contentDeserializer = introspector.findContentDeserializer(member);
        assertNotNull(contentDeserializer);
        assertEquals(CustomContentDeserializer.class, contentDeserializer);
    }

    @Test
    public void testFindDeserializationConverter_JsonDeserializeConverter() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithDeserializationConverter.class, "field");
        Object converter = introspector.findDeserializationConverter(member);
        assertNotNull(converter);
        assertEquals(CustomDeserializationConverter.class, converter);
    }

    @Test
    public void testFindDeserializationContentConverter_JsonDeserializeContentConverter() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithDeserializationContentConverter.class, "field");
        Object converter = introspector.findDeserializationContentConverter(member);
        assertNotNull(converter);
        assertEquals(CustomDeserializationContentConverter.class, converter);
    }

    @Test
    public void testFindDeserializationContentType_JsonDeserializeContentAs() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithDeserializationContentType.class, "list");
        JavaType baseContentType = TypeFactory.defaultInstance().constructType(List.class);
        Class<?> type = introspector.findDeserializationContentType(member, baseContentType);
        assertNotNull(type);
        assertEquals(TargetDeserializationContentType.class, type);
    }

    @Test
    public void testFindDeserializationType_JsonDeserializeAs() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithDeserializationType.class, "field");
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        Class<?> type = introspector.findDeserializationType(member, baseType);
        assertNotNull(type);
        assertEquals(TargetDeserializationType.class, type);
    }

    @Test
    public void testFindDeserializationKeyType_JsonDeserializeKeyAs() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithDeserializationKeyType.class, "map");
        JavaType baseKeyType = TypeFactory.defaultInstance().constructType(Map.class);
        Class<?> type = introspector.findDeserializationKeyType(member, baseKeyType);
        assertNotNull(type);
        assertEquals(TargetDeserializationKeyType.class, type);
    }

    @Test
    public void testFindValueInstantiator_JsonValueInstantiator() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithValueInstantiator.class);
        Object instantiator = introspector.findValueInstantiator(ac);
        assertNotNull(instantiator);
        assertEquals(CustomValueInstantiator.class, instantiator);
    }

    @Test
    public void testFindPOJOBuilder_JsonDeserializeBuilder() throws Exception {
        AnnotatedMember member = createDummyAnnotatedMember(TestClassWithPOJOBuilder.class, "field");
        Class<?> builderClass = introspector.findPOJOBuilder(member);
        assertNotNull(builderClass);
        assertEquals(DummyPOJOBuilder.class, builderClass);
    }

    @Test
    public void testFindPOJOBuilderConfig_JsonPOJOBuilder() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithPOJOBuilderConfig.class);
        JsonPOJOBuilder.Value config = introspector.findPOJOBuilderConfig(ac);
        assertNotNull(config);
        assertEquals("with", config.withPrefix);
        assertEquals("buildIt", config.buildMethodName);
    }

    @Test
    public void testFindNameForDeserialization_JsonProperty() throws Exception {
        class MyClass { @JsonProperty("customName") public String field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        PropertyName name = introspector.findNameForDeserialization(member);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());
    }

    @Test
    public void testFindNameForDeserialization_JsonSetter() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithSetterName.class);
        AnnotatedMethod setter = createDummyAnnotatedMethod(TestClassWithSetterName.class, "setField", String.class);
        PropertyName name = introspector.findNameForDeserialization(setter);
        assertNotNull(name);
        assertEquals("setterName", name.getSimpleName());
    }

    @Test
    public void testHasAnySetterAnnotation() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithAnySetter.class);
        AnnotatedMethod setter = createDummyAnnotatedMethod(TestClassWithAnySetter.class, "setAny", String.class, Object.class);
        assertTrue(introspector.hasAnySetterAnnotation(setter));
    }

    @Test
    public void testHasAnyGetterAnnotation() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithAnyGetter.class);
        AnnotatedMethod getter = createDummyAnnotatedMethod(TestClassWithAnyGetter.class, "getAny");
        assertTrue(introspector.hasAnyGetterAnnotation(getter));
    }

    @Test
    public void testHasCreatorAnnotation_JsonCreator() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithCreatorAnnotation.class);
        AnnotatedConstructor constructor = createDummyAnnotatedConstructor(TestClassWithCreatorAnnotation.class);
        assertTrue(introspector.hasCreatorAnnotation(constructor));
    }

    @Test
    public void testHasCreatorAnnotation_ConstructorPropertiesImpliesCreatorTrue() throws Exception {
        if (introspector._jdk7Helper != null) {
            AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithConstructorPropertiesCreator.class);
            AnnotatedConstructor constructor = createDummyAnnotatedConstructor(TestClassWithConstructorPropertiesCreator.class, String.class);
            assertTrue(introspector.hasCreatorAnnotation(constructor));
        }
    }

    @Test
    public void testFindCreatorBinding_properties() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithCreatorBindingProperties.class);
        AnnotatedConstructor constructor = createDummyAnnotatedConstructor(TestClassWithCreatorBindingProperties.class, String.class);
        JsonCreator.Mode mode = introspector.findCreatorBinding(constructor);
        assertNotNull(mode);
        assertEquals(JsonCreator.Mode.PROPERTIES, mode);
    }

    @Test
    public void testFindCreatorBinding_delegating() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithCreatorBindingDelegating.class);
        AnnotatedConstructor constructor = createDummyAnnotatedConstructor(TestClassWithCreatorBindingDelegating.class, String.class);
        JsonCreator.Mode mode = introspector.findCreatorBinding(constructor);
        assertNotNull(mode);
        assertEquals(JsonCreator.Mode.DELEGATING, mode);
    }

    // Tests for methods not previously covered or with more edge cases

    @Test
    public void testVersion() throws Exception {
        Version version = introspector.version();
        assertNotNull(version);
        assertTrue(version.getMajorVersion() >= 0);
        assertTrue(version.getMinorVersion() >= 0);
        assertTrue(version.getPatchLevel() >= 0);
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator_true() {
        assertSame(introspector, introspector.setConstructorPropertiesImpliesCreator(true));
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator_false() {
        assertSame(introspector, introspector.setConstructorPropertiesImpliesCreator(false));
    }

    @Test
    public void testIsAnnotationBundle_true() {
         assertTrue(introspector.isAnnotationBundle(new Annotation() {
             @Override public Class<? extends Annotation> annotationType() { return MyBundleAnnotation.class; }
         }));
    }

    @Test
    public void testIsAnnotationBundle_false() {
         assertTrue(!introspector.isAnnotationBundle(new Annotation() {
             @Override public Class<? extends Annotation> annotationType() { return Override.class; }
         }));
    }

    @Test
    public void testFindTypeResolver_JsonTypeResolver() throws Exception {
        @JsonTypeResolver(value = CustomTypeResolverBuilder.class)
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
        class MyClass {}
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        TypeResolverBuilder<?> builder = introspector.findTypeResolver(null, ac, baseType);
        assertNotNull(builder);
        assertTrue(builder instanceof CustomTypeResolverBuilder);
    }

    @Test
    public void testFindPropertyTypeResolver_JsonTypeInfo() throws Exception {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
        class MyClass { public String field; }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);
        TypeResolverBuilder<?> builder = introspector.findPropertyTypeResolver(null, member, baseType);
        assertNull(builder);
    }

    @Test
    public void testFindPropertyContentTypeResolver_JsonTypeInfo() throws Exception {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
        class MyClass { public List<String> list; }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "list");
        JavaType containerType = TypeFactory.defaultInstance().constructType(List.class);
        TypeResolverBuilder<?> builder = introspector.findPropertyContentTypeResolver(null, member, containerType);
        assertNotNull(builder);
    }

    @Test
    public void testFindAndAddVirtualProperties_Attr() throws Exception {
        class MyClass { @JsonAppend(attrs = {@JsonAppend.Attr(value="attr1", required=true, propName="p1")}) public String field; }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        List<BeanPropertyWriter> properties = new ArrayList<>();
        MapperConfig<?> mockConfig = new MapperConfigBase<MapperConfig<?>>(new BaseSettings(null, null, null, TypeFactory.defaultInstance()), 0) {
            @Override public boolean isEnabled(MapperFeature f) { return false; }
            @Override public SubtypeResolver getSubtypeResolver() { return null; }
            @Override public boolean useRootWrapping() { return false; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return introspector; }
            @Override public JavaType constructType(Type a) { return TypeFactory.defaultInstance().constructType(a); }
            @Override public BeanDescription introspectClassAnnotations(JavaType type) { return BeanDescription.forBasic(this, type, null); }
            @Override public MapperConfig<?> with(MapperFeature... features) { return this; }
            @Override public MapperConfig<?> without(MapperFeature... features) { return this; }
            @Override public MapperConfig<?> with(MapperFeature feature, boolean state) { return this; }
        };
        introspector.findAndAddVirtualProperties(mockConfig, ac, properties);
        assertEquals(1, properties.size());
        assertTrue(properties.get(0) instanceof AttributePropertyWriter);
        assertEquals("attr1", properties.get(0).getName());
    }

    @Test
    public void testFindAndAddVirtualProperties_Prop() throws Exception {
        class MyClass { @JsonAppend(props = {@JsonAppend.Prop(value=StringBeanPropertyWriter.class, type=String.class, name="prop1")}) public String field; }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        List<BeanPropertyWriter> properties = new ArrayList<>();
        MapperConfig<?> mockConfig = new MapperConfigBase<MapperConfig<?>>(new BaseSettings(null, null, null, TypeFactory.defaultInstance()), 0) {
            @Override public boolean isEnabled(MapperFeature f) { return false; }
            @Override public SubtypeResolver getSubtypeResolver() { return null; }
            @Override public boolean useRootWrapping() { return false; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return introspector; }
            @Override public JavaType constructType(Type a) { return TypeFactory.defaultInstance().constructType(a); }
            @Override public BeanDescription introspectClassAnnotations(JavaType type) { return BeanDescription.forBasic(this, type, null); }
            @Override public HandlerInstantiator getHandlerInstantiator() { return null; }
            @Override public MapperConfig<?> with(MapperFeature... features) { return this; }
            @Override public MapperConfig<?> without(MapperFeature... features) { return this; }
            @Override public MapperConfig<?> with(MapperFeature feature, boolean state) { return this; }
        };
        introspector.findAndAddVirtualProperties(mockConfig, ac, properties);
        assertEquals(1, properties.size());
        assertTrue(properties.get(0) instanceof VirtualBeanPropertyWriter);
        assertEquals("prop1", properties.get(0).getName());
    }

     @Test
    public void testFindNameForSerialization_Default() throws Exception {
        class MyClass { public String field; } // No annotation, should use default name
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        PropertyName name = introspector.findNameForSerialization(member);
        assertEquals(PropertyName.USE_DEFAULT, name);
    }

    @Test
    public void testHasAsValueAnnotation_true_AnnotatedMethod() throws Exception {
        AnnotatedClass ac = createDummyAnnotatedClass(TestClassWithAsValue.class);
        AnnotatedMethod getter = createDummyAnnotatedMethod(TestClassWithAsValue.class, "getValue");
        assertTrue(introspector.hasAsValueAnnotation(getter));
    }

    @Test
    public void testFindDeserializer_noAnnotation() throws Exception {
        class MyClass { public String field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        Object deserializer = introspector.findDeserializer(member);
        assertNull(deserializer);
    }

    @Test
    public void testFindKeyDeserializer_noAnnotation() throws Exception {
        class MyMapClass { public Map<String, Integer> map; }
        AnnotatedMember member = createDummyAnnotatedMember(MyMapClass.class, "map");
        Object keyDeserializer = introspector.findKeyDeserializer(member);
        assertNull(keyDeserializer);
    }

    @Test
    public void testFindContentDeserializer_noAnnotation() throws Exception {
        class MyListClass { public List<String> list; }
        AnnotatedMember member = createDummyAnnotatedMember(MyListClass.class, "list");
        Object contentDeserializer = introspector.findContentDeserializer(member);
        assertNull(contentDeserializer);
    }

    @Test
    public void testFindDeserializationConverter_noAnnotation() throws Exception {
        class MyClass { public Object field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        Object converter = introspector.findDeserializationConverter(member);
        assertNull(converter);
    }

    @Test
    public void testFindDeserializationContentConverter_noAnnotation() throws Exception {
        class MyClass { public Object field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        Object converter = introspector.findDeserializationContentConverter(member);
        assertNull(converter);
    }

    @Test
    public void testFindDeserializationContentType_noAnnotation() throws Exception {
        class MyListClass { public List<String> list; }
        AnnotatedMember member = createDummyAnnotatedMember(MyListClass.class, "list");
        JavaType baseContentType = TypeFactory.defaultInstance().constructType(List.class);
        Class<?> type = introspector.findDeserializationContentType(member, baseContentType);
        assertNull(type);
    }

    @Test
    public void testFindDeserializationType_noAnnotation() throws Exception {
        class MyClass { public Object field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        JavaType baseType = TypeFactory.defaultInstance().constructType(Object.class);
        Class<?> type = introspector.findDeserializationType(member, baseType);
        assertNull(type);
    }

    @Test
    public void testFindDeserializationKeyType_noAnnotation() throws Exception {
        class MyMapClass { public Map<String, Integer> map; }
        AnnotatedMember member = createDummyAnnotatedMember(MyMapClass.class, "map");
        JavaType baseKeyType = TypeFactory.defaultInstance().constructType(Map.class);
        Class<?> type = introspector.findDeserializationKeyType(member, baseKeyType);
        assertNull(type);
    }

    @Test
    public void testFindValueInstantiator_noAnnotation() throws Exception {
        class MyClass {}
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        Object instantiator = introspector.findValueInstantiator(ac);
        assertNull(instantiator);
    }

    @Test
    public void testFindPOJOBuilder_noAnnotation() throws Exception {
        class MyClass { public Object field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        Class<?> builderClass = introspector.findPOJOBuilder(member);
        assertNull(builderClass);
    }

    @Test
    public void testFindPOJOBuilderConfig_noAnnotation() throws Exception {
        class MyClass {}
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        JsonPOJOBuilder.Value config = introspector.findPOJOBuilderConfig(ac);
        assertNull(config);
    }

    @Test
    public void testFindNameForDeserialization_noAnnotation() throws Exception {
        class MyClass { public String field; }
        AnnotatedMember member = createDummyAnnotatedMember(MyClass.class, "field");
        PropertyName name = introspector.findNameForDeserialization(member);
        assertNull(name);
    }

    @Test
    public void testHasAnySetterAnnotation_false() throws Exception {
        class MyClass { public void setField(String value) {} }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        AnnotatedMethod setter = createDummyAnnotatedMethod(MyClass.class, "setField", String.class);
        assertFalse(introspector.hasAnySetterAnnotation(setter));
    }

    @Test
    public void testHasAnyGetterAnnotation_false() throws Exception {
        class MyClass { public String getField() { return null; } }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        AnnotatedMethod getter = createDummyAnnotatedMethod(MyClass.class, "getField");
        assertFalse(introspector.hasAnyGetterAnnotation(getter));
    }

    @Test
    public void testHasCreatorAnnotation_noAnnotation() throws Exception {
        class MyClass { public MyClass() {} }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        AnnotatedConstructor constructor = createDummyAnnotatedConstructor(MyClass.class);
        assertFalse(introspector.hasCreatorAnnotation(constructor));
    }

    @Test
    public void testFindCreatorBinding_noAnnotation() throws Exception {
        class MyClass { public MyClass(String value) {} }
        AnnotatedClass ac = createDummyAnnotatedClass(MyClass.class);
        AnnotatedConstructor constructor = createDummyAnnotatedConstructor(MyClass.class, String.class);
        JsonCreator.Mode mode = introspector.findCreatorBinding(constructor);
        assertNull(mode);
    }
}
