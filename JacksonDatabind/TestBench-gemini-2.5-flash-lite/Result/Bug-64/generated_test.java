package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.io.IOException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class PropertyBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock helper classes to satisfy constructor requirements without full implementation.

    // Mock Implementation of AnnotatedMember

    // Mock Implementation of BeanPropertyDefinition

    // Mock Implementation of SerializationConfig (not final as of Jackson 2.9.7, so inheritance is possible)
    // Assuming the version used here allows extension. If not, a wrapper or composition would be needed.

    // Mock Implementation of BeanDescription

    // Mock Implementation of BeanPropertyWriter
    static class MockBeanPropertyWriter extends BeanPropertyWriter {
        // Constructor needs to match one of the base constructors
        public MockBeanPropertyWriter(BeanPropertyDefinition propDef, AnnotatedMember member, Annotations contextAnnotations, JavaType declaredType, JsonSerializer<?> ser, TypeSerializer typeSer, JavaType serType, boolean suppressNulls, Object suppressableValue) throws java.io.IOException {
            super(propDef, member, contextAnnotations, declaredType, ser, typeSer, serType, suppressNulls, suppressableValue);
        }
    }

    // Mock SerializerProvider

    // Mock JavaType
    
    // Simple concrete JavaType for testing

    // Mock Annotations

    // Mock AnnotatedClass

    // Mock Field (java.lang.reflect.Field is final, so needs wrapper or composition)

    // Mock TypeFactory

    // Helper to create a PropertyBuilder instance with mock dependencies

    // Helper to create a mock AnnotatedMember












    @Test
    public void testBuildWriter_NonDefault_ContainerDefaultValue() throws Exception {
        JavaType declaredType = new MockSimpleJavaType(java.util.List.class, false, null);
        AnnotatedMember am = createMockAnnotatedMember(null, declaredType, null, null);
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition() {
            @Override public String getName() { return "listProp"; }
            @Override public JavaType getType() { return declaredType; }
        };

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null, false, true, JsonInclude.Value.from(JsonInclude.Include.NON_DEFAULT)),
            new MockBeanDescription(null, declaredType) {
                @Override
                protected Object instantiateBean(boolean fixAccess) { return null; }
            }) {
            @Override
            protected Object getDefaultBean() { return null; }
            @Override
            protected Object getDefaultValue(JavaType type) {
                return JsonInclude.Include.NON_EMPTY; // Special case for containers
            }
        };

        SerializerProvider prov = new MockSerializerProvider();
        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        assertTrue("suppressNulls should be true for NON_DEFAULT inclusion", writer._suppressNulls);
        assertEquals("valueToSuppress should be MARKER_FOR_EMPTY for container NON_DEFAULT",
                BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testFindSerializationType_RefineSerializationTypeOverride() throws Exception {
        JavaType declaredType = new MockSimpleJavaType(java.util.List.class, false, null);
        JavaType refinedType = new MockSimpleJavaType(java.util.ArrayList.class, true, null); // with static typing

        // Mock AnnotatedMember to simulate annotation
        AnnotatedMember am = new MockAnnotatedMember() {
            @Override
            public JavaType getType() { return declaredType; }
            @Override
            public Class<?> getRawType() { return java.util.List.class; }
            
            @SuppressWarnings("unchecked")
            @Override
            public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> a) {
                if (a == JsonSerialize.class) {
                    return (A) new JsonSerialize() {
                        @Override public Class<? extends java.lang.annotation.Annotation> annotationType() { return JsonSerialize.class; }
                        @Override public Class<?> handledType() { return ArrayList.class; } // This is what refineSerializationType checks
                        @Override public JsonSerialize.Typing typing() { return JsonSerialize.Typing.DEFAULT_TYPING; }
                        // Other methods return defaults
                        @Override public Class<?> contentConverter() { return null; }
                        @Override public String contentConverterid() { return null; }
                        @Override public Class<?> converter() { return null; }
                        @Override public String converterid() { return null; }
                        @Override public Class<?> using() { return null; }
                        @Override public Class<?> as() { return ArrayList.class; } // This is also checked by default implementation
                        @Override public Class<?> contentUsing() { return null; }
                        @Override public String contentUsingid() { return null; }
                        @Override public Class<?> keyUsing() { return null; }
                        @Override public String keyUsingid() { return null; }
                        @Override public Class<?> valueUsing() { return null; }
                        @Override public String valueUsingid() { return null; }
                    };
                }
                return null;
            }
        };

        // Mock TypeFactory to handle construction of expected type
        TypeFactory mockTypeFactory = new TypeFactory() {
            @Override
            public JavaType constructType(java.lang.reflect.Type ref) {
                if (ref == java.util.ArrayList.class) {
                    return new MockSimpleJavaType(java.util.ArrayList.class, true, null);
                }
                return new MockSimpleJavaType((Class<?>) ref, false, null); // Default
            }
            // Provide minimal implementations for other abstract methods
            @Override public JavaType constructFromCanonical(String canonical) throws IllegalArgumentException { return null; }
            @Override public JavaType constructParametricType(Class<?> rawType, JavaType... parameterTypes) { return null; }
            @Override public JavaType constructType(java.lang.reflect.Type ref, TypeBindings bindings) { return constructType(ref); }
            @Override public JavaType constructSpecializedType(JavaType baseType, Class<?> specializedClass) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və) throws IllegalArgumentException { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings, Object valueHandler, Object typeHandler) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings, Object valueHandler, Object typeHandler, boolean addTyping) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings, Object valueHandler, Object typeHandler, boolean addTyping, Object /* Jackson28 */ type) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings, Object valueHandler, Object typeHandler, boolean addTyping, Object /* Jackson28 */ type, Object /* Jackson28 */ concrete) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings, Object valueHandler, Object typeHandler, boolean addTyping, Object /* Jackson28 */ type, Object /* Jackson28 */ concrete, Object /* Jackson28 */ typeId) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings, Object valueHandler, Object typeHandler, boolean addTyping, Object /* Jackson28 */ type, Object /* Jackson28 */ concrete, Object /* Jackson28 */ typeId, Object /* Jackson28 */ containerType) { return null; }
            @Override public JavaType constructFromCanonical(String canonical, String və, TypeBindings bindings, Object valueHandler, Object typeHandler, boolean addTyping, Object /* Jackson28 */ type, Object /* Jackson28 */ concrete, Object /* Jackson28 */ typeId, Object /* Jackson28 */ containerType, Object /* Jackson28 */ containedType) { return null; }
        };
        
        // Need to set this mock TypeFactory as default for the test scope
        TypeFactory.defaultInstance = mockTypeFactory;

        PropertyBuilder pb = new PropertyBuilder(
            new MockSerializationConfig(null, false, true, JsonInclude.Value.empty()),
            new MockBeanDescription(null, declaredType) {
                @Override
                protected Object instantiateBean(boolean fixAccess) { return null; }
            }
        );
        // Override the annotation introspector to use our custom logic
        pb._annotationIntrospector = new AnnotationIntrospector() {
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return JsonInclude.Value.empty(); }
            @Override public JsonIgnoreProperties.Value findIgnoredProperties(Annotated a) { return null; }
            @Override public Boolean findIgnoreUnknown(Annotated a) { return null; }
            @Override public PropertyName findNameForSerialization(Annotated a) { return null; }
            @Override public PropertyName findNameForDeserialization(Annotated a) { return null; }
            @Override public String findNamespace(Annotated a) { return null; }
            @Override public String findEnumValue(Enum<?> e) { return null; }
            @Override public String[] findProperties(Annotated a) { return null; }
            @Override public JacksonInject.Value findInjectableValue(Annotated a) { return null; }
            @Override public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            @Override public TypeSerializer findTypeSerializer(MapperConfig<?> config, AnnotatedClass ac) { return null; }
            @Override public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            @Override public Object findDefaultValue(Annotated a) { return null; }
            @Override public String findPropertyDescription(Annotated a) { return null; }
            @Override public Integer findPropertyIndex(Annotated a) { return null; }
            @Override public String findPropertyDefaultValue(Annotated a) { return null; }
            @Override public String findGetterSignature(AnnotatedMethod am) { return null; }
            @Override public String findSetterSignature(AnnotatedMethod am) { return null; }
            @Override public com.fasterxml.jackson.annotation.JsonProperty.Access findPropertyAccess(Annotated a) { return null; }
            @Override public Object findSerializer(Annotated a) { return null; }
            @Override public Object findKeySerializer(Annotated a) { return null; }
            @Override public Object findContentSerializer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; } // Important for static typing
            @Override public Object findDeserializer(Annotated a) { return null; }
            @Override public Object findKeyDeserializer(Annotated a) { return null; }
            @Override public Object findContentDeserializer(Annotated a) { return null; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            @Override public Class<?> findPOJOSequences(Annotated a) { return null; }
            @Override public PropertyName findRootName(AnnotatedClass ac) { return null; }
            @Override public JsonFormat.Value findFormat(Annotated a) { return null; }
            @Override public PropertyNamingStrategy.PropertyNamingInsideAccessible findNamingStrategy(AnnotatedClass ac) { return null; }
            @Override public Boolean findProblemHandler(Annotated a) { return null; }
            @Override public Boolean findMergeInfo(Annotated a) { return null; }
            @Override public Boolean findIgnoredProperties(AnnotatedClass ac) { return null; }
            @Override public String findFilterId(Annotated a) { return null; }
            @Override public String findTypeIdResolver(MapperConfig<?> config, AnnotatedClass ac) { return null; }
            @Override public AnnotationIntrospector.ReferenceProperty findReferenceType(Annotated a) { return null; }
            @Override public Object findUnrecognizedProperty (Annotated a) { return null; }
            @Override public Boolean findIsIgnoredType(AnnotatedClass ac) { return null; }
            @Override public Boolean findTransient(Annotated a) { return null; }
            @Override public Boolean findRequired(Annotated a) { return null; }
            @Override public Enum[] findEnumValues(Class<Enum> enumClass, Enum[] values) { return null; }
            @Override public String findClassDescription(AnnotatedClass ac) { return null; }
            // The crucial override:
            @Override
            public JavaType refineSerializationType(MapperConfig<?> config, Annotated am, JavaType type) throws JsonMappingException {
                 return mockTypeFactory.refineSerializationType(config, am, type);
            }
        };
        
        JavaType result = pb.findSerializationType(am, false, declaredType);
        assertNotNull("Should return a serialization type", result);
        assertEquals("Should return the refined type (ArrayList)", refinedType.getRawClass(), result.getRawClass());
        assertTrue("Should indicate static typing", result.isStaticTyping());
    }

    @Test
    public void testFindSerializationType_StaticTypingEnabled() throws Exception {
        JavaType declaredType = new MockSimpleJavaType(String.class, false, null);
        AnnotatedMember am = createMockAnnotatedMember(null, declaredType, null, null);

        // PropertyBuilder created with a config where isEnabled(MapperFeature.USE_STATIC_TYPING) is true
        BaseSettings baseSettings = new BaseSettings(null, null, null, TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null);
        MockSerializationConfig config = new MockSerializationConfig(baseSettings, true, true, JsonInclude.Value.empty()); // useStaticTyping = true

        BeanDescription beanDesc = new MockBeanDescription(config, declaredType) {
            @Override protected Object instantiateBean(boolean fixAccess) { return null; }
        };
        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        JavaType result = pb.findSerializationType(am, true, declaredType); // explicit true for useStaticTyping

        assertNotNull("Should return a serialization type when static typing is enabled", result);
        assertEquals("Should return the declared type", declaredType, result);
        assertTrue("Should indicate static typing", result.isStaticTyping());
    }

    @Test
    public void testFindSerializationType_DynamicTyping() throws Exception {
        JavaType declaredType = new MockSimpleJavaType(String.class, false, null);
        AnnotatedMember am = createMockAnnotatedMember(null, declaredType, null, null);

        BaseSettings baseSettings = new BaseSettings(null, null, null, TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null);
        MockSerializationConfig config = new MockSerializationConfig(baseSettings, false, true, JsonInclude.Value.empty()); // useStaticTyping = false

        BeanDescription beanDesc = new MockBeanDescription(config, declaredType) {
            @Override protected Object instantiateBean(boolean fixAccess) { return null; }
        };
        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        JavaType result = pb.findSerializationType(am, false, declaredType); // explicit false for useStaticTyping

        assertNull("Should return null when static typing is disabled and no annotation overrides", result);
    }


    @Test
    public void testGetDefaultBean_InstantiatesDefaultConstructor() throws Exception {
        // Mock BeanDescription to return a class with a default constructor
        JavaType javaType = new MockSimpleJavaType(DefaultConstructorBean.class, false, null);
        BaseSettings baseSettings = new BaseSettings(null, null, null, TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null);
        SerializationConfig config = new MockSerializationConfig(baseSettings, false, true, JsonInclude.Value.empty());

        BeanDescription beanDesc = new MockBeanDescription(config, javaType) {
            @Override
            protected Object instantiateBean(boolean fixAccess) {
                try {
                    return new DefaultConstructorBean();
                } catch (Exception e) {
                    return null;
                }
            }
        };

        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);

        Object defaultBean = builder.getDefaultBean();
        assertNotNull("Should instantiate the default constructor", defaultBean);
        assertTrue("Should be an instance of DefaultConstructorBean", defaultBean instanceof DefaultConstructorBean);
    }

    @Test
    public void testGetDefaultBean_ReturnsNullIfNoDefaultConstructor() throws Exception {
        // Mock BeanDescription to return a class with no default constructor
        JavaType javaType = new MockSimpleJavaType(NoDefaultConstructorBean.class, false, null);
        BaseSettings baseSettings = new BaseSettings(null, null, null, TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null);
        SerializationConfig config = new MockSerializationConfig(baseSettings, false, true, JsonInclude.Value.empty());

        BeanDescription beanDesc = new MockBeanDescription(config, javaType) {
            @Override
            protected Object instantiateBean(boolean fixAccess) {
                return null; // Simulate no default constructor
            }
        };

        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);

        Object defaultBean = builder.getDefaultBean();
        assertNull("Should return null if no default constructor is available", defaultBean);
    }

    @Test
    public void testGetDefaultBean_CachesInstance() throws Exception {
        JavaType javaType = new MockSimpleJavaType(DefaultConstructorBean.class, false, null);
        BaseSettings baseSettings = new BaseSettings(null, null, null, TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null);
        SerializationConfig config = new MockSerializationConfig(baseSettings, false, true, JsonInclude.Value.empty());

        BeanDescription beanDesc = new MockBeanDescription(config, javaType) {
            @Override
            protected Object instantiateBean(boolean fixAccess) {
                return new DefaultConstructorBean();
            }
        };

        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);

        Object firstCall = builder.getDefaultBean();
        Object secondCall = builder.getDefaultBean();

        assertNotNull("Should return an instance", firstCall);
        assertSame("Should return the same cached instance on subsequent calls", firstCall, secondCall);
    }

    @Test
    public void testGetDefaultValue_PrimitiveInt() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType intType = TypeFactory.defaultInstance().constructType(int.class);
        Object defaultValue = builder.getDefaultValue(intType);
        assertEquals("Default value for int should be 0", Integer.valueOf(0), defaultValue);
    }

    @Test
    public void testGetDefaultValue_PrimitiveBoolean() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType booleanType = TypeFactory.defaultInstance().constructType(boolean.class);
        Object defaultValue = builder.getDefaultValue(booleanType);
        assertEquals("Default value for boolean should be false", Boolean.FALSE, defaultValue);
    }

    @Test
    public void testGetDefaultValue_String() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        Object defaultValue = builder.getDefaultValue(stringType);
        assertEquals("Default value for String should be empty string", "", defaultValue);
    }

    @Test
    public void testGetDefaultValue_Collection() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType listType = TypeFactory.defaultInstance().constructType(java.util.List.class);
        Object defaultValue = builder.getDefaultValue(listType);
        assertEquals("Default value for collection should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_Map() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType mapType = TypeFactory.defaultInstance().constructType(java.util.Map.class);
        Object defaultValue = builder.getDefaultValue(mapType);
        assertEquals("Default value for map should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_Array() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType arrayType = TypeFactory.defaultInstance().constructType(String[].class);
        Object defaultValue = builder.getDefaultValue(arrayType);
        assertEquals("Default value for array should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_ReferenceType() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType refType = TypeFactory.defaultInstance().constructType(java.util.Optional.class);
        Object defaultValue = builder.getDefaultValue(refType);
        assertEquals("Default value for reference type should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_Object() {
        PropertyBuilder builder = createPropertyBuilder(Object.class, null, false, true, JsonInclude.Value.empty());
        JavaType objectType = TypeFactory.defaultInstance().constructType(Object.class);
        Object defaultValue = builder.getDefaultValue(objectType);
        assertNull("Default value for general Object should be null", defaultValue);
    }

    @Test
    public void testBuildWriter_HandlesContainerWriteEmptyJsonArraysFalse() throws Exception {
        JavaType declaredType = new MockSimpleJavaType(String[].class, false, null);
        AnnotatedMember am = createMockAnnotatedMember(null, declaredType, null, null);
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition() {
            @Override public String getName() { return "testArray"; }
            @Override public JavaType getType() { return declaredType; }
        };

        // Mock config to disable WRITE_EMPTY_JSON_ARRAYS
        BaseSettings baseSettings = new BaseSettings(null, null, null, TypeFactory.defaultInstance(), null, null, null, null, null, null, null, null, null);
        MockSerializationConfig config = new MockSerializationConfig(baseSettings, false, true, JsonInclude.Value.from(JsonInclude.Include.ALWAYS)) {
            @Override
            public boolean isEnabled(SerializationFeature f) {
                if (f == SerializationFeature.WRITE_EMPTY_JSON_ARRAYS) {
                    return false; // Feature is disabled
                }
                return super.isEnabled(f);
            }
        };
        BeanDescription beanDesc = new MockBeanDescription(config, declaredType) {
            @Override protected Object instantiateBean(boolean fixAccess) { return null; }
        };
        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);
        SerializerProvider prov = new MockSerializerProvider();
        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        assertEquals("valueToSuppress should be MARKER_FOR_EMPTY when WRITE_EMPTY_JSON_ARRAYS is false",
                BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    // Helper classes for tests
    public static class SampleBean {
        public String getTestProp() { return "value"; }
        public int getIntProp() { return 123; }
        public String getStringProp() { return "default"; }
        public java.util.List<String> getListProp() { return java.util.Collections.emptyList(); }
    }

    public static class DefaultConstructorBean {
        public DefaultConstructorBean() {}
        public int getSomeField() { return 42; }
    }

    public static class NoDefaultConstructorBean {
        private NoDefaultConstructorBean() {}
        public NoDefaultConstructorBean(String dummy) {}
        public int getSomeField() { return 42; }
    }
}





