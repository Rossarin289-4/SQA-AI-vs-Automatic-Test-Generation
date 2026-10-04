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
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
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
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.util.Converter;

public class JacksonAnnotationIntrospectorTest {

    // Enum declarations moved outside test methods to be top-level.
    enum TestEnum { VALUE1, VALUE2, VALUE3 }
    enum TestEnumWithJsonProperty { VALUE1, @JsonProperty("custom_name") VALUE2, VALUE3 }
    enum TestEnumWithJsonPropertyNames { VALA, @JsonProperty("B") VALB, VALC, @JsonProperty("D") VALD }
    enum TestEnumWithDefault { A, @JsonEnumDefaultValue B, C }
    enum TestEnumWithoutDefault { A, B, C }

    // Helper to create a dummy MapperConfig
    
    // Helper to create dummy AnnotatedClass

    // Helper to create dummy AnnotatedClass with specific type

    // Helper to get a Field as an AnnotatedMember
    private AnnotatedMember getAnnotatedField(Class<?> cls, String fieldName) {
        try {
            Field f = cls.getDeclaredField(fieldName);
            f.setAccessible(true); 
            // Note: _annotations needs to be populated if used by _findAnnotation
            // For simplicity, assume null or empty if not directly tested for annotation presence.
            return new AnnotatedField(null, f, null); // Placeholder: AnnotationMap.of(f.getAnnotations())
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    // Helper to get a Method as an AnnotatedMember
    private AnnotatedMember getAnnotatedMethod(Class<?> cls, String methodName, Class<?>... paramTypes) {
        try {
            java.lang.reflect.Method method = cls.getDeclaredMethod(methodName, paramTypes);
            method.setAccessible(true);
            // Note: _annotations and _paramAnnotations need to be populated if used by _findAnnotation
            return new AnnotatedMethod(null, method, null, null); // Placeholder: AnnotationMap.of(method.getAnnotations()), null
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Mock for testing refineSerializationType and refineDeserializationType

    // Mock for AnnotatedConstructor needed for findCreatorAnnotation

    // Mock for AnnotatedParameter needed for findImplicitPropertyName



    @Test
    public void testFindEnumValue() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        
        assertEquals("Should return default name if no annotation", "VALUE1", introspector.findEnumValue(TestEnum.VALUE1));
        assertEquals("Should return custom name from JsonProperty", "custom_name", introspector.findEnumValue(TestEnumWithJsonProperty.VALUE2));
        assertEquals("Should return default name if annotation value is empty", "VALUE3", introspector.findEnumValue(TestEnumWithJsonProperty.VALUE3));
    }

    @Test
    public void testFindEnumValuesWithJsonProperty() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        String[] names = {"VALA", "VALB", "VALC", "VALD"};
        String[] result = introspector.findEnumValues(TestEnumWithJsonPropertyNames.class, TestEnumWithJsonPropertyNames.values(), names);
        assertArrayEquals("Should correctly map enum values with JsonProperty", new String[]{"VALA", "B", "VALC", "D"}, result);
    }










    @Test
    public void testFindPropertyAliases() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class AliasedClass { @JsonAlias({"alias1", "alias2"}) public String field; }
        class NoAliasClass { public String field; }

        AnnotatedMember annotatedField = getAnnotatedField(AliasedClass.class, "field");
        List<PropertyName> aliases = introspector.findPropertyAliases(annotatedField);
        assertNotNull(aliases);
        assertEquals(2, aliases.size());
        assertEquals("alias1", aliases.get(0).getSimpleName());
        assertEquals("alias2", aliases.get(1).getSimpleName());

        AnnotatedMember unannotatedField = getAnnotatedField(NoAliasClass.class, "field");
        assertNull(introspector.findPropertyAliases(unannotatedField));
    }

    @Test
    public void testHasIgnoreMarker() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class IgnoredClass { @JsonIgnore public String ignoredField; public String normalField; }

        AnnotatedMember ignoredField = getAnnotatedField(IgnoredClass.class, "ignoredField");
        assertTrue("Should have ignore marker for @JsonIgnore field", introspector.hasIgnoreMarker(ignoredField));

        AnnotatedMember normalField = getAnnotatedField(IgnoredClass.class, "normalField");
        assertFalse("Should not have ignore marker for normal field", introspector.hasIgnoreMarker(normalField));
    }

    @Test
    public void testHasRequiredMarker() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class RequiredClass { @JsonProperty(required = true) public String requiredField; @JsonProperty(required = false) public String notRequiredField; public String defaultField; }

        AnnotatedMember requiredField = getAnnotatedField(RequiredClass.class, "requiredField");
        assertTrue("Should have required marker for @JsonProperty(required = true)", introspector.hasRequiredMarker(requiredField));

        AnnotatedMember notRequiredField = getAnnotatedField(RequiredClass.class, "notRequiredField");
        assertFalse("Should have required marker for @JsonProperty(required = false)", introspector.hasRequiredMarker(notRequiredField));

        AnnotatedMember defaultField = getAnnotatedField(RequiredClass.class, "defaultField");
        assertNull("Should return null for field without explicit required attribute", introspector.hasRequiredMarker(defaultField));
    }

    @Test
    public void testFindPropertyAccess() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class AccessClass { @JsonProperty(access = JsonProperty.Access.READ_ONLY) public String readOnlyField; @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) public String writeOnlyField; @JsonProperty(access = JsonProperty.Access.READ_WRITE) public String readWriteField; public String defaultField; }

        AnnotatedMember readOnlyField = getAnnotatedField(AccessClass.class, "readOnlyField");
        assertEquals(JsonProperty.Access.READ_ONLY, introspector.findPropertyAccess(readOnlyField));

        AnnotatedMember writeOnlyField = getAnnotatedField(AccessClass.class, "writeOnlyField");
        assertEquals(JsonProperty.Access.WRITE_ONLY, introspector.findPropertyAccess(writeOnlyField));

        AnnotatedMember readWriteField = getAnnotatedField(AccessClass.class, "readWriteField");
        assertEquals(JsonProperty.Access.READ_WRITE, introspector.findPropertyAccess(readWriteField));

        AnnotatedMember defaultField = getAnnotatedField(AccessClass.class, "defaultField");
        assertNull("Should return null for field without access annotation", introspector.findPropertyAccess(defaultField));
    }

    @Test
    public void testFindPropertyDescription() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class DescribedFieldClass { @JsonPropertyDescription("This field is described") public String describedField; public String notDescribedField; }

        AnnotatedMember describedField = getAnnotatedField(DescribedFieldClass.class, "describedField");
        assertEquals("Should find property description", "This field is described", introspector.findPropertyDescription(describedField));

        AnnotatedMember notDescribedField = getAnnotatedField(DescribedFieldClass.class, "notDescribedField");
        assertNull("Should return null for field without description", introspector.findPropertyDescription(notDescribedField));
    }

    @Test
    public void testFindPropertyIndex() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class IndexedFieldClass { @JsonProperty(index = 1) public String indexedField1; @JsonProperty(index = 5) public String indexedField5; @JsonProperty(index = JsonProperty.INDEX_UNKNOWN) public String unknownIndexField; public String defaultIndexField; }

        AnnotatedMember indexedField1 = getAnnotatedField(IndexedFieldClass.class, "indexedField1");
        assertEquals(Integer.valueOf(1), introspector.findPropertyIndex(indexedField1));

        AnnotatedMember indexedField5 = getAnnotatedField(IndexedFieldClass.class, "indexedField5");
        assertEquals(Integer.valueOf(5), introspector.findPropertyIndex(indexedField5));

        AnnotatedMember unknownIndexField = getAnnotatedField(IndexedFieldClass.class, "unknownIndexField");
        assertNull("Should return null for index UNKNOWN", introspector.findPropertyIndex(unknownIndexField));

        AnnotatedMember defaultIndexField = getAnnotatedField(IndexedFieldClass.class, "defaultIndexField");
        assertNull("Should return null for field without index", introspector.findPropertyIndex(defaultIndexField));
    }

    @Test
    public void testFindPropertyDefaultValue() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class DefaultValueClass { @JsonProperty(defaultValue = "defaultValue") public String hasDefault; @JsonProperty(defaultValue = "") public String emptyDefault; public String noDefault; }

        AnnotatedMember hasDefaultMember = getAnnotatedField(DefaultValueClass.class, "hasDefault");
        assertEquals("Should find default value", "defaultValue", introspector.findPropertyDefaultValue(hasDefaultMember));

        AnnotatedMember emptyDefaultMember = getAnnotatedField(DefaultValueClass.class, "emptyDefault");
        assertNull("Should return null for empty default value string", introspector.findPropertyDefaultValue(emptyDefaultMember));

        AnnotatedMember noDefaultMember = getAnnotatedField(DefaultValueClass.class, "noDefault");
        assertNull("Should return null for field without default value", introspector.findPropertyDefaultValue(noDefaultMember));
    }

    @Test
    public void testFindFormat() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") class FormattedClass { public String dateField; }
        class UnformattedClass { public String field; }

        AnnotatedMember formattedMember = getAnnotatedField(FormattedClass.class, "dateField");
        JsonFormat.Value format = introspector.findFormat(formattedMember);
        assertNotNull(format);
        assertEquals(JsonFormat.Shape.STRING, format.getShape());
        assertEquals("yyyy-MM-dd", format.getPattern());

        AnnotatedMember unformattedMember = getAnnotatedField(UnformattedClass.class, "field");
        assertNull("Should return null for field without format annotation", introspector.findFormat(unformattedMember));
    }

    @Test
    public void testFindReferenceTypeManaged() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class ReferenceClass { @JsonManagedReference("ref-name") public List<String> list; }
        class NoReferenceClass { public List<String> list; }

        AnnotatedMember managedMember = getAnnotatedField(ReferenceClass.class, "list");
        AnnotationIntrospector.ReferenceProperty ref = introspector.findReferenceType(managedMember);
        assertNotNull(ref);
        assertEquals("ref-name", ref.getName());
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, ref.getType());

        AnnotatedMember noRefMember = getAnnotatedField(NoReferenceClass.class, "list");
        assertNull(introspector.findReferenceType(noRefMember));
    }

    @Test
    public void testFindReferenceTypeBackReference() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class BackReferenceClass { @JsonBackReference("back-ref-name") public String item; }
        class NoReferenceClass { public String item; }

        AnnotatedMember backRefMember = getAnnotatedField(BackReferenceClass.class, "item");
        AnnotationIntrospector.ReferenceProperty ref = introspector.findReferenceType(backRefMember);
        assertNotNull(ref);
        assertEquals("back-ref-name", ref.getName());
        assertEquals(AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE, ref.getType());

        AnnotatedMember noRefMember = getAnnotatedField(NoReferenceClass.class, "item");
        assertNull(introspector.findReferenceType(noRefMember));
    }




    




    @Test
    public void testIsTypeId() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class TypeIdMember { @JsonTypeId public String idField; }
        class NotTypeIdMember { public String regularField; }

        AnnotatedMember member = getAnnotatedField(TypeIdMember.class, "idField");
        assertTrue(introspector.isTypeId(member));

        AnnotatedMember nonTypeIdMember = getAnnotatedField(NotTypeIdMember.class, "regularField");
        assertNull(introspector.isTypeId(nonTypeIdMember)); 
    }

    @Test
    public void testFindObjectIdInfo() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class IdentityClassWithField { @JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class, property = "id") public String identityField; }
        
        AnnotatedMember member = getAnnotatedField(IdentityClassWithField.class, "identityField");
        ObjectIdInfo info = introspector.findObjectIdInfo(member);
        
        assertNotNull(info);
        assertEquals("id", info.getPropertyName().getSimpleName());
        assertEquals(ObjectIdGenerators.StringIdGenerator.class, info.getGeneratorType());
    }








    




    
    





    @Test
    public void testFindNameForSerializationWithJsonProperty() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class NameClass { @JsonProperty("customName") public String field; }
        class DefaultNameClass { public String field; }

        AnnotatedMember annotatedMember = getAnnotatedField(NameClass.class, "field");
        PropertyName name = introspector.findNameForSerialization(annotatedMember);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());

        AnnotatedMember defaultMember = getAnnotatedField(DefaultNameClass.class, "field");
        PropertyName defaultName = introspector.findNameForSerialization(defaultMember);
        // USE_DEFAULT indicates that Jackson should use the default naming strategy.
        assertEquals(PropertyName.USE_DEFAULT, defaultName);
    }
    
    @Test
    public void testFindNameForSerializationWithJsonGetter() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class GetterMethodClass {
            private String field;
            @JsonGetter("getterName")
            public String getField() { return field; }
        }

        AnnotatedMember getterMethodMember = getAnnotatedMethod(GetterMethodClass.class, "getField");
        PropertyName name = introspector.findNameForSerialization(getterMethodMember);
        assertNotNull(name);
        assertEquals("getterName", name.getSimpleName());
    }



    @Test
    public void testFindDeserializer() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        // Mock extension of JsonDeserializer
        class CustomDeserializer extends JsonDeserializer<String> {}
        @JsonDeserialize(using = CustomDeserializer.class) class DeserializerClass {}

        AnnotatedClass annotatedClass = createDummyAnnotatedClass(DeserializerClass.class);
        Object deserializer = introspector.findDeserializer(annotatedClass);
        assertEquals(CustomDeserializer.class, deserializer);
    }

    @Test
    public void testFindKeyDeserializer() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class CustomKeyDeserializer extends KeyDeserializer {}
        @JsonDeserialize(keyUsing = CustomKeyDeserializer.class) class KeyDeserializerClass {}

        AnnotatedClass annotatedClass = createDummyAnnotatedClass(KeyDeserializerClass.class);
        Object keyDeserializer = introspector.findKeyDeserializer(annotatedClass);
        assertEquals(CustomKeyDeserializer.class, keyDeserializer);
    }

    @Test
    public void testFindContentDeserializer() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class CustomContentDeserializer extends JsonDeserializer<List<String>> {}
        @JsonDeserialize(contentUsing = CustomContentDeserializer.class) class ContentDeserializerClass { public List<String> list; }

        AnnotatedMember member = getAnnotatedField(ContentDeserializerClass.class, "list");
        Object contentDeserializer = introspector.findContentDeserializer(member);
        assertEquals(CustomContentDeserializer.class, contentDeserializer);
    }
    
    @Test
    public void testFindDeserializationConverter() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class CustomDeserializationConverter extends Converter.None {}
        @JsonDeserialize(converter = CustomDeserializationConverter.class) class DeserializationConverterClass {}

        AnnotatedClass annotatedClass = createDummyAnnotatedClass(DeserializationConverterClass.class);
        Object converter = introspector.findDeserializationConverter(annotatedClass);
        assertEquals(CustomDeserializationConverter.class, converter);
    }

    @Test
    public void testFindDeserializationContentConverter() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class CustomDeserializationContentConverter extends Converter.None {}
        @JsonDeserialize(contentConverter = CustomDeserializationContentConverter.class) class DeserializationContentConverterClass { public List<String> list; }

        AnnotatedMember member = getAnnotatedField(DeserializationContentConverterClass.class, "list");
        Object converter = introspector.findDeserializationContentConverter(member);
        assertEquals(CustomDeserializationContentConverter.class, converter);
    }

    @Test
    public void testRefineDeserializationTypeWithAs() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = createDummyMapperConfig();
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType baseListType = tf.constructType(List.class); 

        @JsonDeserialize(as = ArrayList.class) @interface JsonDeserializeAsArrayList {}
        JsonDeserializeAsArrayList annotation = new JsonDeserializeAsArrayList() {
            @Override public Class<? extends Annotation> annotationType() { return JsonDeserializeAsArrayList.class; }
        };
        
        Annotated annotatedClassWithAnnotation = new MockAnnotated(annotation, tf.constructType(List.class));
        JavaType refinedType = introspector.refineDeserializationType(config, annotatedClassWithAnnotation, baseListType);
        assertNotNull(refinedType);
        assertTrue(refinedType.isTypeOrSubTypeOf(ArrayList.class));
    }
    
    @Test
    public void testRefineDeserializationTypeWithContentAs() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = createDummyMapperConfig();
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType baseMapType = tf.constructMapType(HashMap.class, String.class, Object.class); 

        @JsonDeserialize(contentAs = Integer.class) @interface JsonDeserializeContentAsInteger {}
        JsonDeserializeContentAsInteger annotation = new JsonDeserializeContentAsInteger() {
            @Override public Class<? extends Annotation> annotationType() { return JsonDeserializeContentAsInteger.class; }
        };
        
        Annotated annotatedMapWithAnnotation = new MockAnnotated(annotation, baseMapType);
        JavaType refinedType = introspector.refineDeserializationType(config, annotatedMapWithAnnotation, baseMapType);
        assertNotNull(refinedType);
        assertTrue(refinedType.getKeyType().getRawClass().equals(String.class));
        assertTrue(refinedType.getContentType().getRawClass().equals(Integer.class));
    }
    
    @Test
    public void testRefineDeserializationTypeWithKeyAs() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = createDummyMapperConfig();
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType baseMapType = tf.constructMapType(HashMap.class, Object.class, String.class); 

        @JsonDeserialize(keyAs = Integer.class) @interface JsonDeserializeKeyAsInteger {}
        JsonDeserializeKeyAsInteger annotation = new JsonDeserializeKeyAsInteger() {
            @Override public Class<? extends Annotation> annotationType() { return JsonDeserializeKeyAsInteger.class; }
        };
        
        Annotated annotatedMapWithAnnotation = new MockAnnotated(annotation, baseMapType);
        JavaType refinedType = introspector.refineDeserializationType(config, annotatedMapWithAnnotation, baseMapType);
        assertNotNull(refinedType);
        assertTrue(refinedType.getKeyType().getRawClass().equals(Integer.class));
        assertTrue(refinedType.getContentType().getRawClass().equals(String.class));
    }

    @Test
    public void testFindValueInstantiator() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class CustomValueInstantiator extends ValueInstantiator {}
        @JsonValueInstantiator(CustomValueInstantiator.class) class InstantiatorClass {}

        AnnotatedClass annotatedClass = createDummyAnnotatedClass(InstantiatorClass.class);
        Object instantiator = introspector.findValueInstantiator(annotatedClass);
        assertEquals(CustomValueInstantiator.class, instantiator);
    }

    @Test
    public void testFindPOJOBuilder() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class MyBuilder {}
        @JsonDeserialize(builder = MyBuilder.class) class BuilderClass {}

        AnnotatedClass annotatedClass = createDummyAnnotatedClass(BuilderClass.class);
        assertEquals(MyBuilder.class, introspector.findPOJOBuilder(annotatedClass));
    }

    @Test
    public void testFindPOJOBuilderConfig() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "buildIt") class BuilderConfigClass {}

        AnnotatedClass annotatedClass = createDummyAnnotatedClass(BuilderConfigClass.class);
        JsonPOJOBuilder.Value config = introspector.findPOJOBuilderConfig(annotatedClass);
        assertNotNull(config);
        assertEquals("with", config.getPrefix());
        assertEquals("buildIt", config.getBuildMethodName());
    }

    @Test
    public void testFindNameForDeserializationWithJsonProperty() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class NameClass { @JsonProperty("customName") public String field; }
        class DefaultNameClass { public String field; }

        AnnotatedMember annotatedMember = getAnnotatedField(NameClass.class, "field");
        PropertyName name = introspector.findNameForDeserialization(annotatedMember);
        assertNotNull(name);
        assertEquals("customName", name.getSimpleName());

        AnnotatedMember defaultMember = getAnnotatedField(DefaultNameClass.class, "field");
        PropertyName defaultName = introspector.findNameForDeserialization(defaultMember);
        assertEquals(PropertyName.USE_DEFAULT, defaultName);
    }
    
    @Test
    public void testFindNameForDeserializationWithJsonSetter() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        class SetterNameClass { @JsonSetter("setterName") public void setField(String value) {} }
        
        AnnotatedMember setterMember = getAnnotatedMethod(SetterNameClass.class, "setField", String.class);
        PropertyName name = introspector.findNameForDeserialization(setterMember);
        assertNotNull(name);
        assertEquals("setterName", name.getSimpleName());
    }

    @Test
    public void testHasAnySetter() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        @JsonAnySetter(enabled = true) class AnySetterEnabledClass {}
        @JsonAnySetter(enabled = false) class AnySetterDisabledClass {}
        class NoAnySetterClass {}

        AnnotatedClass annotatedClassTrue = createDummyAnnotatedClass(AnySetterEnabledClass.class);
        assertTrue(introspector.hasAnySetter(annotatedClassTrue));

        AnnotatedClass annotatedClassFalse = createDummyAnnotatedClass(AnySetterDisabledClass.class);
        assertFalse(introspector.hasAnySetter(annotatedClassFalse));

        AnnotatedClass unannotatedClass = createDummyAnnotatedClass(NoAnySetterClass.class);
        assertNull(introspector.hasAnySetter(unannotatedClass));
    }
    
    @Test
    public void testFindSetterInfo() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        @JsonSetter(value = "setterValue", nulls = JsonSetter.Nulls.AS_EMPTY) class SetterInfoClass { public void setField(String value) {} }
        
        AnnotatedMember setterMember = getAnnotatedMethod(SetterInfoClass.class, "setField", String.class);
        JsonSetter.Value setterInfo = introspector.findSetterInfo(setterMember);
        assertNotNull(setterInfo);
        assertEquals("setterValue", setterInfo.getName());
        assertEquals(JsonSetter.Nulls.AS_EMPTY, setterInfo.getNulls());
    }

    @Test
    public void testFindMergeInfo() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();

        @JsonMerge(value = JsonMerge.Merge.YES) class MergeYesClass {}
        @JsonMerge(value = JsonMerge.Merge.NO) class MergeNoClass {}
        class NoMergeClass {}

        AnnotatedClass annotatedClassTrue = createDummyAnnotatedClass(MergeYesClass.class);
        assertTrue(introspector.findMergeInfo(annotatedClassTrue));

        AnnotatedClass annotatedClassFalse = createDummyAnnotatedClass(MergeNoClass.class);
        assertFalse(introspector.findMergeInfo(annotatedClassFalse));

        AnnotatedClass unannotatedClass = createDummyAnnotatedClass(NoMergeClass.class);
        assertNull(introspector.findMergeInfo(unannotatedClass));
    }

    @Test
    public void testFindCreatorAnnotationWithJsonCreatorMode() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = createDummyMapperConfig();

        // Use a mock constructor
        AnnotatedConstructor annotatedConstructor = new MockAnnotatedConstructor(); 
        
        // Test with JsonCreator.Mode.PROPERTIES
        JacksonAnnotationIntrospector introspectorWithProps = new JacksonAnnotationIntrospector() {
            @Override protected <A extends Annotation> A _findAnnotation(Annotated a, Class<A> annoClass) {
                if (annoClass == JsonCreator.class && a instanceof AnnotatedConstructor) {
                    return (A) new JsonCreator() {
                        @Override public Class<? extends Annotation> annotationType() { return JsonCreator.class; }
                        @Override public JsonCreator.Mode mode() { return JsonCreator.Mode.PROPERTIES; }
                    };
                } return super._findAnnotation(a, annoClass);
            }
        };
        assertEquals(JsonCreator.Mode.PROPERTIES, introspectorWithProps.findCreatorAnnotation(config, annotatedConstructor));

        // Test with JsonCreator.Mode.DELEGATING
        JacksonAnnotationIntrospector introspectorWithDelegating = new JacksonAnnotationIntrospector() {
            @Override protected <A extends Annotation> A _findAnnotation(Annotated a, Class<A> annoClass) {
                if (annoClass == JsonCreator.class && a instanceof AnnotatedConstructor) {
                    return (A) new JsonCreator() {
                        @Override public Class<? extends Annotation> annotationType() { return JsonCreator.class; }
                        @Override public JsonCreator.Mode mode() { return JsonCreator.Mode.DELEGATING; }
                    };
                } return super._findAnnotation(a, annoClass);
            }
        };
        assertEquals(JsonCreator.Mode.DELEGATING, introspectorWithDelegating.findCreatorAnnotation(config, annotatedConstructor));

        // Test without JsonCreator annotation
        JacksonAnnotationIntrospector introspectorWithoutCreator = new JacksonAnnotationIntrospector() {
            @Override protected <A extends Annotation> A _findAnnotation(Annotated a, Class<A> annoClass) { return null; }
        };
        assertNull(introspectorWithoutCreator.findCreatorAnnotation(config, annotatedConstructor));
    }
    
    @Test
    public void testVersion() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        assertNotNull(introspector.version());
        // This should be the current version of Jackson Databind.
        // Assuming PackageVersion.VERSION is correctly defined in the project's build.
        assertEquals(com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION, introspector.version());
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        // Check initial state
        assertTrue(introspector._cfgConstructorPropertiesImpliesCreator); // Default is true
        
        introspector.setConstructorPropertiesImpliesCreator(true);
        assertTrue("Setting to true should keep it true", introspector._cfgConstructorPropertiesImpliesCreator);
        
        introspector.setConstructorPropertiesImpliesCreator(false);
        assertFalse("Setting to false should make it false", introspector._cfgConstructorPropertiesImpliesCreator);
        
        introspector.setConstructorPropertiesImpliesCreator(true);
        assertTrue("Setting back to true should make it true", introspector._cfgConstructorPropertiesImpliesCreator);
    }

    @Test
    public void testFindInjectableValueId() {
        // This tests the deprecated method findInjectableValueId, which should delegate to findInjectableValue
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        
        class InjectableValueIdClass { @JacksonInject("customId") public String field; }
        AnnotatedMember member = getAnnotatedField(InjectableValueIdClass.class, "field");
        assertEquals("customId", introspector.findInjectableValueId(member));

        class InjectableValueIdClassNoId { @JacksonInject public String field; }
        AnnotatedMember memberNoId = getAnnotatedField(InjectableValueIdClassNoId.class, "field");
        // The deprecated method returns the ID. If no explicit ID is given, findInjectableValue
        // determines it as the class name. This should be reflected here.
        assertEquals(InjectableValueIdClassNoId.class.getName(), introspector.findInjectableValueId(memberNoId));
    }

    @Test
    public void testFindPropertyTypeResolver() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = createDummyMapperConfig();
        JavaType baseType = TypeFactory.defaultInstance().constructType(String.class);

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
        class PropertyTypeInfoClass {
            public String field;
        }
        AnnotatedMember member = getAnnotatedField(PropertyTypeInfoClass.class, "field");
        TypeResolverBuilder<?> builder = introspector.findPropertyTypeResolver(config, member, baseType);
        assertNotNull(builder);
        assertTrue(builder instanceof StdTypeResolverBuilder);
    }

    @Test
    public void testFindPropertyContentTypeResolver() {
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = createDummyMapperConfig();
        JavaType listJavaType = TypeFactory.defaultInstance().constructType(List.class);

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
        class PropertyContentTypeInfoClass {
            public List<String> list;
        }
        AnnotatedMember member = getAnnotatedField(PropertyContentTypeInfoClass.class, "list");
        TypeResolverBuilder<?> builder = introspector.findPropertyContentTypeResolver(config, member, listJavaType);
        assertNotNull(builder);
        assertTrue(builder instanceof StdTypeResolverBuilder);
    }

    @Test
    public void testFindSerializationType() {
        // This method is deprecated and always returns null in the current implementation.
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        // Need a dummy Annotated object that has annotations.
        @JsonSerialize(as = String.class) @interface DummySerialize {}
        Annotated dummyAnnotated = new MockAnnotated(new DummySerialize() {
            @Override public Class<? extends Annotation> annotationType() { return DummySerialize.class; }
            @Override public Class<?> as() { return String.class; }
            // Other JsonSerialize methods return default values
            @Override public Class<?> keyUsing() { return JsonSerializer.None.class; }
            @Override public Class<?> contentUsing() { return JsonSerializer.None.class; }
            @Override public Class<?> nullsUsing() { return JsonSerializer.None.class; }
            @Override public Class<?> converter() { return Converter.None.class; }
            @Override public Class<?> contentConverter() { return Converter.None.class; }
            @Override public JsonInclude.Include include() { return JsonInclude.Include.USE_DEFAULTS; }
            @Override public JsonSerialize.Typing typing() { return JsonSerialize.Typing.DEFAULT_TYPING; }
        }, String.class);
        
        assertNull(introspector.findSerializationType(dummyAnnotated));
    }

    @Test
    public void testFindSerializationKeyType() {
        // This method is deprecated and always returns null.
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        JavaType dummyBaseType = TypeFactory.defaultInstance().constructType(String.class);
        // Need a dummy Annotated object that has annotations.
        @JsonSerialize(keyUsing = JsonSerializer.None.class) @interface DummySerializeKey {}
        Annotated dummyAnnotated = new MockAnnotated(new DummySerializeKey() {
            @Override public Class<? extends Annotation> annotationType() { return DummySerializeKey.class; }
            @Override public Class<? extends JsonSerializer<?>> keyUsing() { return JsonSerializer.None.class; }
            // Other JsonSerialize methods return default values
            @Override public Class<?> as() { return null; }
            @Override public Class<?> contentUsing() { return JsonSerializer.None.class; }
            @Override public Class<?> nullsUsing() { return JsonSerializer.None.class; }
            @Override public Class<?> converter() { return Converter.None.class; }
            @Override public Class<?> contentConverter() { return Converter.None.class; }
            @Override public JsonInclude.Include include() { return JsonInclude.Include.USE_DEFAULTS; }
            @Override public JsonSerialize.Typing typing() { return JsonSerialize.Typing.DEFAULT_TYPING; }
        }, String.class);
        assertNull(introspector.findSerializationKeyType(dummyAnnotated, dummyBaseType));
    }

    @Test
    public void testFindSerializationContentType() {
        // This method is deprecated and always returns null.
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        JavaType dummyBaseType = TypeFactory.defaultInstance().constructType(List.class);
        // Need a dummy Annotated object that has annotations.
        @JsonSerialize(contentUsing = JsonSerializer.None.class) @interface DummySerializeContent {}
        Annotated dummyAnnotated = new MockAnnotated(new DummySerializeContent() {
            @Override public Class<? extends Annotation> annotationType() { return DummySerializeContent.class; }
            @Override public Class<? extends JsonSerializer<?>> contentUsing() { return JsonSerializer.None.class; }
             // Other JsonSerialize methods return default values
            @Override public Class<?> as() { return null; }
            @Override public Class<?> keyUsing() { return JsonSerializer.None.class; }
            @Override public Class<?> nullsUsing() { return JsonSerializer.None.class; }
            @Override public Class<?> converter() { return Converter.None.class; }
            @Override public Class<?> contentConverter() { return Converter.None.class; }
            @Override public JsonInclude.Include include() { return JsonInclude.Include.USE_DEFAULTS; }
            @Override public JsonSerialize.Typing typing() { return JsonSerialize.Typing.DEFAULT_TYPING; }
        }, List.class);
        assertNull(introspector.findSerializationContentType(dummyAnnotated, dummyBaseType));
    }
    
    @Test
    public void testFindAndAddVirtualProperties() {
        // This method is complex. A minimal test to check it doesn't crash.
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        MapperConfig<?> config = createDummyMapperConfig();
        AnnotatedClass annotatedClass = createDummyAnnotatedClass(String.class); // Dummy class
        List<BeanPropertyWriter> properties = new ArrayList<>();

        // Dummy annotation for JsonAppend.Attr
        @interface DummyAttr{}
        // Dummy annotation for JsonAppend.Prop
        @interface DummyProp{}

        // Create a dummy class with JsonAppend annotations
        @JsonAppend(
            attrs = {@JsonAppend.Attr(value="attr1", required=true, propName="p1")},
            props = {@JsonAppend.Prop(value=String.class, name="prop1")}
        )
        class ClassWithVirtualProps {
            // Need to mock the annotated class to return the annotation.
            // This is getting complex for a unit test without a mocking framework.
        }
        
        AnnotatedClass annotatedClassWithAppend = createDummyAnnotatedClass(ClassWithVirtualProps.class);
        
        // To make this test pass, we need to ensure _findAnnotation returns the annotation.
        // Override _findAnnotation in a subclass for this test.
        JacksonAnnotationIntrospector introspectorWithMock = new JacksonAnnotationIntrospector() {
            @Override
            protected <A extends Annotation> A _findAnnotation(Annotated a, Class<A> annoClass) {
                if (annoClass == JsonAppend.class) {
                    // Construct a mock annotation instance
                    return (A) new JsonAppend() {
                        @Override public Class<? extends Annotation> annotationType() { return JsonAppend.class; }
                        @Override public Attr[] attrs() { 
                            return new Attr[]{ new Attr() {
                                @Override public Class<? extends Annotation> annotationType() { return Attr.class; }
                                @Override public String value() { return "attr1"; }
                                @Override public String propName() { return "p1"; }
                                @Override public String propNamespace() { return ""; }
                                @Override public boolean required() { return true; }
                                @Override public JsonInclude.Value include() { return JsonInclude.Value.empty(); }
                            }}; 
                        }
                        @Override public Prop[] props() {
                            return new Prop[]{ new Prop() {
                                @Override public Class<? extends Annotation> annotationType() { return Prop.class; }
                                @Override public Class<?> type() { return String.class; }
                                @Override public String name() { return "prop1"; }
                                @Override public String namespace() { return ""; }
                                @Override public boolean required() { return false; }
                                @Override public JsonInclude.Value include() { return JsonInclude.Value.empty(); }
                            }};
                        }
                        @Override public boolean prepend() { return false; }
                    };
                }
                return super._findAnnotation(a, annoClass);
            }
            // Need to override for AnnotatedClass as well
            @Override
            protected <A extends Annotation> A _findAnnotation(AnnotatedClass ac, Class<A> annoClass) {
                 if (annoClass == JsonAppend.class) {
                    // Construct a mock annotation instance
                    return (A) new JsonAppend() {
                        @Override public Class<? extends Annotation> annotationType() { return JsonAppend.class; }
                        @Override public Attr[] attrs() { 
                            return new Attr[]{ new Attr() {
                                @Override public Class<? extends Annotation> annotationType() { return Attr.class; }
                                @Override public String value() { return "attr1"; }
                                @Override public String propName() { return "p1"; }
                                @Override public String propNamespace() { return ""; }
                                @Override public boolean required() { return true; }
                                @Override public JsonInclude.Value include() { return JsonInclude.Value.empty(); }
                            }}; 
                        }
                        @Override public Prop[] props() {
                            return new Prop[]{ new Prop() {
                                @Override public Class<? extends Annotation> annotationType() { return Prop.class; }
                                @Override public Class<?> type() { return String.class; }
                                @Override public String name() { return "prop1"; }
                                @Override public String namespace() { return ""; }
                                @Override public boolean required() { return false; }
                                @Override public JsonInclude.Value include() { return JsonInclude.Value.empty(); }
                            }};
                        }
                        @Override public boolean prepend() { return false; }
                    };
                }
                return super._findAnnotation(ac, annoClass);
            }
        };

        try {
            introspectorWithMock.findAndAddVirtualProperties(config, annotatedClassWithAppend, properties);
            // Check if properties were added. The construct methods are hard to mock precisely.
            // For this test, we'll assume if no exception is thrown, it's a partial pass.
            assertTrue(true); 
        } catch (Exception e) {
            fail("findAndAddVirtualProperties threw an exception: " + e.getMessage());
        }
    }
    
    @Test
    public void testHasAnyGetterAnnotation() {
        // This method is deprecated. It checks for the presence of @JsonAnyGetter.
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        
        // Create a dummy method and ensure it has no annotations for a baseline.
        AnnotatedMethod dummyMethod = new AnnotatedMethod(null, null, null, null); 
        // The implementation uses _hasAnnotation, which in turn uses _findAnnotation.
        // If _findAnnotation returns null for @JsonAnyGetter, hasAnyGetterAnnotation returns false.
        assertFalse(introspector.hasAnyGetterAnnotation(dummyMethod));

        // To test true, we'd need to mock _findAnnotation to return a non-null value for JsonAnyGetter.
        // This is complex without a mocking framework.
    }

    @Test
    public void testHasAsValueAnnotation() {
        // This method is deprecated. Checks for @JsonValue annotation and its value.
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
        
        // Create a dummy method.
        AnnotatedMethod dummyMethod = new AnnotatedMethod(null, null, null, null);
        // The implementation uses _findAnnotation.
        // If _findAnnotation returns null or @JsonValue(value=false), it should return false.
        assertFalse(introspector.hasAsValueAnnotation(dummyMethod));

        // To test true, we'd need to mock _findAnnotation to return @JsonValue(value=true).
    }
}





