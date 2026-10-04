```java
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

public class PropertyBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock helper classes to satisfy constructor requirements without full implementation.

    // Mock Implementation of AnnotatedMember
    static class MockAnnotatedMember extends AnnotatedMember {
        @Override
        public int getModifiers() { return 0; }
        @Override
        public String getName() { return "mockMember"; }
        @Override
        public Class<?> getRawType() { return Object.class; }
        @Override
        public JavaType getType() { return null; }
        @Override
        public Annotated getAnnotation(Class<java.lang.annotation.Annotation> a) { return null; }
        @Override
        public int getAnnotationCount() { return 0; }
        @Override
        public Class<?> getDeclaringClass() { return Object.class; }
        @Override
        public BeanPropertyDefinition getPropertyDefinition() { return null; }
        @Override
        public Object getValue(Object obj) throws Exception { return null; }
        @Override
        public void fixAccess(boolean value) { }
        @Override
        public Annotated withAnnotations(AnnotationMap annotations) { return this; }
        @Override
        public boolean isStatic() { return false; }
        @Override
        public AnnotatedParameter getParameter(int index) { return null; }
    }

    // Mock Implementation of BeanPropertyDefinition
    static class MockBeanPropertyDefinition extends BeanPropertyDefinition {
        private final String _name;
        private final Annotations _memberAnnotations;
        private final JavaType _type;

        public MockBeanPropertyDefinition(String name, Annotations memberAnnotations, JavaType type) {
            _name = name;
            _memberAnnotations = memberAnnotations;
            _type = type;
        }

        @Override
        public String getName() { return _name; }
        @Override
        public PropertyName getWrapperName() { return null; }
        @Override
        public boolean couldDeserialize() { return false; }
        @Override
        public boolean couldSerialize() { return false; }
        @Override
        public AnnotatedMember getPrimaryMember() { return new MockAnnotatedMember(); }
        @Override
        public JavaType getType() { return _type; }
        @Override
        public String getInternalName() { return _name; }
        @Override
        public com.fasterxml.jackson.annotation.JsonInclude.Value findInclusion() { return com.fasterxml.jackson.annotation.JsonInclude.Value.empty(); }
        @Override
        public JavaType getVirtualExpression(SerializerProvider prov, BeanDescription beanDesc) { return null; }
        @Override
        public BeanPropertyWriter build() throws Exception { return null; } // Not to be called
        @Override
        public BeanPropertyWriter build(BeanPropertyDefinition init) throws Exception { return null; } // Not to be called
        @Override
        public void add(com.fasterxml.jackson.databind.util.Annotations valid) { }
        @Override
        public void add(com.fasterxml.jackson.databind.util.Annotations valid, AnnotatedMember member) { }
        @Override
        public void addSetter(com.fasterxml.jackson.databind.util.Annotations valid, AnnotatedMethod setter) { }
        @Override
        public void addGetter(com.fasterxml.jackson.databind.util.Annotations valid, AnnotatedMethod getter) { }
        @Override
        public void addField(com.fasterxml.jackson.databind.util.Annotations valid, AnnotatedField field) { }
        @Override
        public void addReference(String name) { }
        @Override
        public void setNonVisible(Boolean b) { }
        @Override
        public void setInternalName(String s) { }
        @Override
        public void setAccessor(AnnotatedMember m) { }
        @Override
        public void setMetadata(PropertyMetadata md) { }
        @Override
        public PropertyMetadata getMetadata() { return null; }
        @Override
        public JavaType getWrapperPayloadClass() { return null; }
        @Override
        public boolean isExplicitlyIncluded() { return false; }
        @Override
        public boolean isExplicitlyExcluded() { return false; }
        @Override
        public JavaType getRawPrimaryType() { return null; }
    }

    // Mock Implementation of SerializationConfig
    static class MockSerializationConfig extends SerializationConfig {
        public MockSerializationConfig(com.fasterxml.jackson.databind.cfg.MapperConfigBase<?, ?> base) {
            super(base, 0, 0);
        }
        // Override methods that are called by PropertyBuilder
        @Override
        public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
            return JsonInclude.Value.empty();
        }
        @Override
        public JsonInclude.Value getDefaultPropertyInclusion() {
            return JsonInclude.Value.empty();
        }
        @Override
        public boolean canOverrideAccessModifiers() { return true; }
        @Override
        public boolean isEnabled(MapperFeature f) { return true; }
    }

    // Mock Implementation of BeanDescription
    static class MockBeanDescription extends BeanDescription {
        private final AnnotatedClass _classInfo;
        private final JavaType _type;
        private final Annotations _classAnnotations;

        protected MockBeanDescription(JavaType type, AnnotatedClass classInfo, Annotations classAnnotations) {
            super(null, type); // Base constructor
            _classInfo = classInfo;
            _type = type;
            _classAnnotations = classAnnotations;
        }

        @Override
        public AnnotatedClass getClassInfo() { return _classInfo; }
        @Override
        public JavaType getBeanClass() { return _type; }
        @Override
        public Annotations getClassAnnotations() { return _classAnnotations; }
        @Override
        public JsonInclude.Value findPropertyInclusion(JsonInclude.Value defaultValue) { return JsonInclude.Value.empty(); }
        @Override
        public Object instantiateBean(boolean fixAccess) {
            try {
                // Attempt to instantiate a default constructor, or return null
                Object instance = getBeanClass().getRawClass().getDeclaredConstructor().newInstance();
                if (fixAccess) {
                    // no-op for mock, real implementation would call fixAccess on member
                }
                return instance;
            } catch (Exception e) {
                return null; // Can't instantiate
            }
        }
    }

    // Mock Implementation of BeanPropertyWriter
    static class MockBeanPropertyWriter extends BeanPropertyWriter {
        // Constructor needs to match one of the base constructors
        public MockBeanPropertyWriter(BeanPropertyDefinition propDef, AnnotatedMember member, Annotations contextAnnotations, JavaType declaredType, JsonSerializer<?> ser, TypeSerializer typeSer, JavaType serType, boolean suppressNulls, Object suppressableValue) {
            super(propDef, member, contextAnnotations, declaredType, ser, typeSer, serType, suppressNulls, suppressableValue);
        }
    }

    // Mock SerializerProvider
    static class MockSerializerProvider extends SerializerProvider {
        public MockSerializerProvider() {
            super(null);
        }

        @Override
        public BeanPropertyWriter reportBadPropertyDefinition(BeanDescription beanDesc, BeanPropertyDefinition propDef, String message) throws JsonMappingException {
            throw new JsonMappingException(null, String.format("Bad property definition for %s: %s", propDef.getName(), message));
        }
    }

    // Mock TypeFactory
    static class MockTypeFactory extends com.fasterxml.jackson.databind.type.TypeFactory {
        // Simplified implementation for basic type creation
        @Override
        public JavaType constructType(java.lang.reflect.Type ref) {
            if (ref instanceof Class) {
                return new com.fasterxml.jackson.databind.type.SimpleType((Class<?>) ref);
            }
            return null;
        }

        @Override
        public JavaType constructFromCanonical(String canonical) throws IllegalArgumentException {
            return null;
        }

        @Override
        public JavaType constructParametricType(Class<?> rawType, JavaType... parameterTypes) {
            return new com.fasterxml.jackson.databind.type.ParametricType(rawType, parameterTypes);
        }

        @Override
        public JavaType constructType(java.lang.reflect.Type ref, com.fasterxml.jackson.databind.type.TypeBindings bindings) {
            if (ref instanceof Class) {
                return new com.fasterxml.jackson.databind.type.SimpleType((Class<?>) ref);
            }
            return null;
        }

        @Override
        public JavaType constructSpecializedType(JavaType baseType, Class<?> specializedClass) {
            return new com.fasterxml.jackson.databind.type.SimpleType(specializedClass);
        }
    }

    // Mock JavaType
    static class MockJavaType extends JavaType {
        private final Class<?> _rawClass;
        private final boolean _staticTyping;
        private JavaType _contentType;

        protected MockJavaType(Class<?> rawClass, boolean staticTyping, JavaType contentType) {
            super(rawClass, 0, 0, null, null, null, false, null, null, false);
            _rawClass = rawClass;
            _staticTyping = staticTyping;
            _contentType = contentType;
        }

        @Override
        public Class<?> getRawClass() { return _rawClass; }
        @Override
        public JavaType withStaticTyping() { return new MockJavaType(_rawClass, true, _contentType); }
        @Override
        public boolean isStaticTyping() { return _staticTyping; }
        @Override
        public boolean isContainerType() { return _contentType != null; }
        @Override
        public JavaType getContentType() { return _contentType; }
        @Override
        public JavaType withContentTypeHandler(Object handler) {
             // In a real scenario, this would apply a TypeSerializer
             // For this mock, we just return a modified type.
             return new MockJavaType(_rawClass, _staticTyping, _contentType); // Keep _contentType same for simplicity
        }
        @Override
        public boolean isReferenceType() { return false; } // Simplify for mock
        @Override
        public JavaType withValueHandler(Object h) { return this; }
        @Override
        public JavaType withContentValueHandler(Object h) { return this; }
        @Override
        public boolean hasHandlers() { return false; }
        @Override
        public boolean hasValueHandler() { return false; }
        @Override
        public boolean hasContentTypeHandler() { return false; }
        @Override
        public JavaType getSuperClass() { return null; }
        @Override
        public JavaType[] getInterfaces() { return new JavaType[0]; }
        @Override
        public boolean isAbstract() { return false; }
        @Override
        public boolean isConcrete() { return true; }
        @Override
        public boolean isThrowable() { return false; }
        @Override
        public boolean isArrayType() { return false; }
        @Override
        public boolean isMapType() { return false; }
        @Override
        public boolean isCollectionType() { return false; }
        @Override
        public boolean isPrimitive() { return false; }
        @Override
        public boolean isFinal() { return false; }
        @Override
        public boolean isJavaLangObject() { return _rawClass == Object.class; }
        @Override
        public boolean hasGenericTypes() { return false; }
        @Override
        public boolean hasRawClass(Class<?> clz) { return _rawClass == clz; }
        @Override
        public boolean isArray() { return false; }
        @Override
        public boolean isAbstract() { return false; }
        @Override
        public boolean isConcrete() { return true; }
        @Override
        public boolean isPrimitive() { return false; }
        @Override
        public boolean isFinal() { return false; }
        @Override
        public boolean isJavaLangObject() { return _rawClass == Object.class; }
        @Override
        public boolean isContainerType() { return _contentType != null; }
        @Override
        public boolean isMapType() { return false; }
        @Override
        public boolean isCollectionType() { return false; }
        @Override
        public boolean isReferenceType() { return false; }
        @Override
        public boolean isEnumType() { return false; }
        @Override
        public boolean isInterface() { return false; }
        @Override
        public boolean isThrowable() { return false; }
        @Override
        public boolean isArrayType() { return false; }
        @Override
        public boolean isAny() { return false; }
        @Override
        public boolean isVoid() { return false; }
        @Override
        public boolean isIgnoredType() { return false; }
        @Override
        public boolean isObject() { return _rawClass == Object.class; }
        @Override
        public boolean isPresent() { return true; }
        @Override
        public JavaType getContentType() { return _contentType; }
        @Override
        public JavaType getContentValueHandler() { return null; }
        @Override
        public JavaType getValueHandler() { return null; }
        @Override
        public JavaType getReferencedType() { return null; }
        @Override
        public JavaType getParameterSource() { return null; }
        @Override
        public JavaType containedType(int index) { return null; }
        @Override
        public int containedTypeCount() { return 0; }
        @Override
        public String containedTypeName(int index) { return null; }
        @Override
        public JavaType[] findTypeParameters(Class<?> expType) { return null; }
        @Override
        public JavaType getRawClass() { return _rawClass; }
        @Override
        public boolean isConcrete() { return true; }
        @Override
        public boolean isAbstract() { return false; }
        @Override
        public boolean isThrowable() { return false; }
        @Override
        public boolean isPrimitive() { return false; }
        @Override
        public boolean isFinal() { return false; }
        @Override
        public boolean isJavaLangObject() { return _rawClass == Object.class; }
        @Override
        public boolean isContainerType() { return _contentType != null; }
        @Override
        public boolean isMapType() { return false; }
        @Override
        public boolean isCollectionType() { return false; }
        @Override
        public boolean isReferenceType() { return false; }
        @Override
        public boolean isEnumType() { return false; }
        @Override
        public boolean isInterface() { return false; }
        @Override
        public boolean isArrayType() { return false; }
        @Override
        public boolean isAny() { return false; }
        @Override
        public boolean isVoid() { return false; }
        @Override
        public boolean isIgnoredType() { return false; }
        @Override
        public boolean isObject() { return _rawClass == Object.class; }
        @Override
        public boolean isPresent() { return true; }
        @Override
        public JavaType withStaticTyping() { return new MockJavaType(_rawClass, true, _contentType); }
        @Override
        public JavaType withValueHandler(Object h) { return this; }
        @Override
        public JavaType withContentValueHandler(Object h) { return this; }
        @Override
        public boolean hasHandlers() { return false; }
        @Override
        public boolean hasValueHandler() { return false; }
        @Override
        public boolean hasContentTypeHandler() { return false; }
        @Override
        public JavaType withContentType(JavaType contentType) {
            return new MockJavaType(_rawClass, _staticTyping, contentType);
        }
        @Override
        public String getFieldId() { return null; }
        @Override
        public JavaType getSuperClass() { return null; }
        // Corrected: JavaType has no getInterfaces() returning array; fixed to return JavaType[]
        @Override
        public JavaType[] getInterfaces() { return new JavaType[0]; }
        @Override
        public JavaType containedType(int index) { return null; }
        @Override
        public int containedTypeCount() { return 0; }
        @Override
        public String containedTypeName(int index) { return null; }
        @Override
        public JavaType[] findTypeParameters(Class<?> expType) { return null; }
        @Override
        public JavaType getContentType() { return _contentType; }
        @Override
        public JavaType getReferencedType() { return null; }
        @Override
        public JavaType getParameterSource() { return null; }
        @Override
        public boolean isReferenceType() { return false; }
        @Override
        public JavaType withContentTypeHandler(Object handler) { return this; }
        @Override
        public JavaType withContentValueHandler(Object h) { return this; }
        @Override
        public JavaType withValueHandler(Object h) { return this; }
    }

    // Mock Annotations
    static class MockAnnotations extends Annotations {
        @Override
        public <A extends java.lang.annotation.Annotation> A get(Class<A> cls) { return null; }
        @Override
        public int size() { return 0; }
    }

    // Mock Field
    static class MockField extends java.lang.reflect.Field {
        @Override
        public String getName() { return "mockFieldName"; }
        @Override
        public int getModifiers() { return 0; }
        @Override
        public Class<?> getDeclaringClass() { return Object.class; }
        @Override
        public Class<?> getType() { return Object.class; }
        @Override
        public boolean isSynthetic() { return false; }
        @Override
        public boolean isEnumConstant() { return false; }
        @Override
        public java.lang.annotation.Annotation[] getDeclaredAnnotations() { return new java.lang.annotation.Annotation[0]; }
        @Override
        public java.lang.annotation.Annotation getAnnotation(Class<? extends java.lang.annotation.Annotation> annotationClass) { return null; }
        @Override
        public java.lang.annotation.Annotation[] getAnnotations() { return new java.lang.annotation.Annotation[0]; }
        @Override
        public java.lang.annotation.Annotation getDeclaredAnnotation(Class<? extends java.lang.annotation.Annotation> annotationClass) { return null; }
        @Override
        public <T extends java.lang.annotation.Annotation> T getAnnotation(Class<T> annotationClass) { return null; }
        @Override
        public <T extends java.lang.annotation.Annotation> T getDeclaredAnnotation(Class<T> annotationClass) { return null; }
        @Override
        public boolean isAnnotationPresent(Class<? extends java.lang.annotation.Annotation> annotationClass) { return false; }
        @Override
        public void setAccessible(boolean flag) throws SecurityException { }
        @Override
        public boolean isAccessible() { return false; }
        @Override
        public Object get(Object obj) throws IllegalAccessException { return null; }
        @Override
        public boolean getBoolean(Object obj) throws IllegalAccessException { return false; }
        @Override
        public byte getByte(Object obj) throws IllegalAccessException { return 0; }
        @Override
        public short getShort(Object obj) throws IllegalAccessException { return 0; }
        @Override
        public char getChar(Object obj) throws IllegalAccessException { return 0; }
        @Override
        public int getInt(Object obj) throws IllegalAccessException { return 0; }
        @Override
        public long getLong(Object obj) throws IllegalAccessException { return 0; }
        @Override
        public float getFloat(Object obj) throws IllegalAccessException { return 0; }
        @Override
        public double getDouble(Object obj) throws IllegalAccessException { return 0; }
        @Override
        public Object get(Object obj, java.lang.reflect.Field.CacheField cacheField) throws IllegalAccessException { return null; }
        @Override
        public void set(Object obj, Object value) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setBoolean(Object obj, boolean z) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setByte(Object obj, byte b) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setShort(Object obj, short s) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setChar(Object obj, char c) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setInt(Object obj, int i) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setLong(Object obj, long l) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setFloat(Object obj, float f) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void setDouble(Object obj, double d) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public Object get(Object obj, java.lang.reflect.Field.CacheField cacheField, boolean z) throws IllegalAccessException { return null; }
        @Override
        public void set(Object obj, Object value, java.lang.reflect.Field.CacheField cacheField) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public void set(Object obj, Object value, java.lang.reflect.Field.CacheField cacheField, boolean z) throws IllegalArgumentException, IllegalAccessException { }
        @Override
        public String toString() { return "MockField"; }
        @Override
        public boolean equals(Object obj) { return false; }
        @Override
        public int hashCode() { return 0; }
        @Override
        public void setAccessible(Object obj, boolean flag) throws SecurityException { }
        @Override
        public Object getAnnotation(Class<java.lang.annotation.Annotation> annotationClass, boolean checkAncestors) { return null; }
        @Override
        public Object getDeclaredAnnotation(Class<java.lang.annotation.Annotation> annotationClass, boolean checkAncestors) { return null; }
        @Override
        public Object[] getAnnotations(boolean checkAncestors) { return new Object[0]; }
        @Override
        public Object[] getDeclaredAnnotations(boolean checkAncestors) { return new Object[0]; }
        @Override
        public boolean isAnnotationPresent(Class<? extends java.lang.annotation.Annotation> annotationClass, boolean checkAncestors) { return false; }
    }

    // Helper to create a PropertyBuilder instance with mock dependencies
    private PropertyBuilder createPropertyBuilder(Class<?> beanClass) {
        JavaType javaType = new MockJavaType(beanClass, false, null);
        AnnotatedClass annotatedClass = new AnnotatedClass(new MockAnnotations(), javaType, null, null, null);
        BeanDescription beanDesc = new MockBeanDescription(javaType, annotatedClass, new MockAnnotations());
        SerializationConfig config = new MockSerializationConfig(null); // Pass null to mock base config

        // Ensure static TypeFactory is set for PropertyBuilder's constructor if it calls it.
        // In this case, PropertyBuilder does not directly call TypeFactory.
        // However, we will use MockTypeFactory for internal calls.
        com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance = new MockTypeFactory();

        return new PropertyBuilder(config, beanDesc);
    }

    // Helper to create a mock AnnotatedMember
    private AnnotatedMember createMockAnnotatedMember() {
        return new MockAnnotatedMember() {
            @Override
            public Object getValue(Object obj) throws Exception {
                // For NON_DEFAULT tests, if obj is the defaultBean, return a default value.
                if (obj != null && obj.getClass().getName().contains("DefaultBean")) {
                    return 0; // Default value for a numeric property
                }
                return null; // Default return
            }

            @Override
            public AnnotatedField getField() {
                return new AnnotatedField(null, new MockField());
            }

            @Override
            public AnnotatedMethod getMethod() {
                return new AnnotatedMethod(null, null);
            }
        };
    }

    @Test
    public void testConstructorInitializesFields() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(Object.class);

        // Check initial state of fields that are set in constructor
        assertNotNull("SerializationConfig should be initialized", builder._config);
        assertNotNull("BeanDescription should be initialized", builder._beanDesc);
        assertNotNull("AnnotationIntrospector should be initialized", builder._annotationIntrospector);

        // _defaultInclusion and _useRealPropertyDefaults are derived from config and beanDesc
        // Their exact values are complex to mock, so we'll focus on behavior in other tests.
    }

    @Test
    public void testGetClassAnnotationsReturnsBeanAnnotations() throws Exception {
        // Mock Annotations to be returned by BeanDescription
        Annotations mockAnnotations = new MockAnnotations() {
            @Override
            public int size() {
                return 1;
            }
        };
        JavaType javaType = new MockJavaType(Object.class, false, null);
        AnnotatedClass annotatedClass = new AnnotatedClass(mockAnnotations, javaType, null, null, null);
        BeanDescription beanDesc = new MockBeanDescription(javaType, annotatedClass, mockAnnotations);
        SerializationConfig config = new MockSerializationConfig(null);

        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);

        Annotations result = builder.getClassAnnotations();
        assertNotNull("Should return annotations", result);
        assertEquals("Should return the mocked annotations", mockAnnotations, result);
        assertEquals("Should reflect the size of the mocked annotations", 1, result.size());
    }

    @Test
    public void testBuildWriter_Always_WritesAllProperties() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(SampleBean.class);
        SerializerProvider prov = new MockSerializerProvider();
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testProp", new MockAnnotations(), declaredType);

        // Case: inclusion is ALWAYS
        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.ALWAYS);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null));

        // We cannot fully build a BeanPropertyWriter without a real SerializerProvider and Serializer.
        // Instead, we'll assert that the method does not throw an unexpected exception and that
        // some basic property is set correctly based on the logic.
        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        assertEquals("Property name should be set", "testProp", writer.getName());
        // Check if suppressNulls is false for ALWAYS
        assertFalse("suppressNulls should be false for ALWAYS inclusion", writer._suppressNulls);
    }


    @Test
    public void testBuildWriter_NonNull_SuppressesNulls() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(SampleBean.class);
        SerializerProvider prov = new MockSerializerProvider();
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testProp", new MockAnnotations(), declaredType);

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.NON_NULL);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null));

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        // Check if suppressNulls is true for NON_NULL
        assertTrue("suppressNulls should be true for NON_NULL inclusion", writer._suppressNulls);
        assertNull("valueToSuppress should be null for NON_NULL inclusion", writer._suppressableValue);
    }

    @Test
    public void testBuildWriter_NonAbsent_SuppressesNullsAndEmptyReferences() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(SampleBean.class);
        SerializerProvider prov = new MockSerializerProvider();
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testProp", new MockAnnotations(), declaredType);

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.NON_ABSENT);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null));

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        // Check if suppressNulls is true for NON_ABSENT
        assertTrue("suppressNulls should be true for NON_ABSENT inclusion", writer._suppressNulls);
        // Check if valueToSuppress is MARKER_FOR_EMPTY for NON_ABSENT
        assertEquals("valueToSuppress should be MARKER_FOR_EMPTY for NON_ABSENT inclusion on reference type",
                BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testBuildWriter_NonEmpty_SuppressesNullsAndEmpty() throws Exception {
        PropertyBuilder builder = createPropertyBuilder(SampleBean.class);
        SerializerProvider prov = new MockSerializerProvider();
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testProp", new MockAnnotations(), declaredType);

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.NON_EMPTY);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null));

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        // Check if suppressNulls is true for NON_EMPTY
        assertTrue("suppressNulls should be true for NON_EMPTY inclusion", writer._suppressNulls);
        // Check if valueToSuppress is MARKER_FOR_EMPTY for NON_EMPTY
        assertEquals("valueToSuppress should be MARKER_FOR_EMPTY for NON_EMPTY inclusion",
                BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testBuildWriter_NonDefault_SuppressesDefaultValue() throws Exception {
        // This test is complex because it requires a default bean instance and access to its properties.
        // We'll mock getDefaultBean and its value retrieval.

        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(Integer.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("intProp", new MockAnnotations(), declaredType);

        // Mock PropertyBuilder to return a default bean with a specific value
        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.NON_DEFAULT);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null)) {
            @Override
            protected Object getDefaultBean() {
                // Simulate a default bean instance that has a property value of 0
                return new Object() {
                    public int getIntProp() { return 0; }
                };
            }
            @Override
            protected Object getDefaultValue(JavaType type) {
                // This should not be called if getDefaultBean() returns non-null
                return null;
            }
        };

        // Mock SerializerProvider to reportBadPropertyDefinition if needed
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        assertTrue("suppressNulls should be true for NON_DEFAULT inclusion", writer._suppressNulls);
        // The valueToSuppress should be the default value obtained from the default bean
        assertEquals("valueToSuppress should be the default value for NON_DEFAULT inclusion",
                Integer.valueOf(0), writer._suppressableValue);
    }

    @Test
    public void testBuildWriter_NonDefault_WhenDefaultBeanIsNull() throws Exception {
        // Test case where getDefaultBean() returns null, so getDefaultValue is used.

        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("stringProp", new MockAnnotations(), declaredType);

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.NON_DEFAULT);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null)) {
            @Override
            protected Object getDefaultBean() {
                return null; // Simulate no default bean instance available
            }
            @Override
            protected Object getDefaultValue(JavaType type) {
                // Return empty string as default for String type
                return "";
            }
        };

        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        assertTrue("suppressNulls should be true for NON_DEFAULT inclusion", writer._suppressNulls);
        // The valueToSuppress should be the default value obtained from getDefaultValue
        assertEquals("valueToSuppress should be the default value from getDefaultValue",
                "", writer._suppressableValue);
    }


    @Test
    public void testBuildWriter_NonDefault_PrimitiveDefaultValue() throws Exception {
        // Test case for primitive types where getDefaultValue should return primitive default.

        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(int.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("intProp", new MockAnnotations(), declaredType);

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.NON_DEFAULT);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null)) {
            @Override
            protected Object getDefaultBean() {
                return null; // No default bean
            }
            // Override getDefaultValue to ensure it correctly returns primitive default
            @Override
            protected Object getDefaultValue(JavaType type) {
                return ClassUtil.defaultValue(type.getRawClass());
            }
        };

        SerializerProvider prov = new MockSerializerProvider();
        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        assertTrue("suppressNulls should be true for NON_DEFAULT inclusion", writer._suppressNulls);
        assertEquals("valueToSuppress should be 0 for int primitive", Integer.valueOf(0), writer._suppressableValue);
    }

    @Test
    public void testBuildWriter_NonDefault_ContainerDefaultValue() throws Exception {
        // Test case for container types, where valueToSuppress should be MARKER_FOR_EMPTY.

        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(java.util.List.class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("listProp", new MockAnnotations(), declaredType);

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> forType, JsonInclude.Value defaultValue) {
                return JsonInclude.Value.from(JsonInclude.Include.NON_DEFAULT);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null)) {
            @Override
            protected Object getDefaultBean() {
                return null; // No default bean
            }
            @Override
            protected Object getDefaultValue(JavaType type) {
                return JsonInclude.Include.NON_EMPTY; // Special case for containers
            }
        };

        SerializerProvider prov = new MockSerializerProvider();
        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        assertTrue("suppressNulls should be true for NON_DEFAULT inclusion", writer._suppressNulls);
        // When default is NON_EMPTY for containers, it should result in MARKER_FOR_EMPTY
        assertEquals("valueToSuppress should be MARKER_FOR_EMPTY for container NON_DEFAULT",
                BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testFindSerializationType_RefineSerializationTypeOverride() throws Exception {
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(java.util.List.class);
        JavaType refinedType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(java.util.ArrayList.class);

        AnnotatedMember am = new MockAnnotatedMember() {
            @Override
            public JavaType getType() { return declaredType; } // Mock generic type
            @Override
            public Class<?> getRawType() { return java.util.List.class; } // Mock raw type

            @Override
            public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> a) {
                // Simulate a @JsonSerialize(as = ArrayList.class) annotation
                return (A) new JsonSerialize() {
                    @Override public Class<? extends java.lang.annotation.Annotation> annotationType() { return JsonSerialize.class; }
                    @Override public Class<?> handledType() { return ArrayList.class; }
                    @Override public JsonSerialize.Typing typing() { return JsonSerialize.Typing.DEFAULT_TYPING; }
                    @Override public Class<?> contentConverter() { return null; }
                    @Override public String contentConverterid() { return null; }
                    @Override public Class<?> converter() { return null; }
                    @Override public String converterid() { return null; }
                    @Override public Class<?> using() { return null; }
                    @Override public Class<?> as() { return ArrayList.class; }
                    @Override public Class<?> contentUsing() { return null; }
                    @Override public String contentUsingid() { return null; }
                    @Override public Class<?> keyUsing() { return null; }
                    @Override public String keyUsingid() { return null; }
                    @Override public Class<?> valueUsing() { return null; }
                    @Override public String valueUsingid() { return null; }
                };
            }
        };

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null), new MockBeanDescription(null, null, null)) {
            @Override
            protected JavaType findSerializationType(Annotated a, boolean useStaticTyping, JavaType declaredType) throws JsonMappingException {
                // Call the super method, which will use the annotation introspection
                return super.findSerializationType(a, useStaticTyping, declaredType);
            }
        };

        // Mock AnnotationIntrospector to return the refined type
        pb._annotationIntrospector = new AnnotationIntrospector() {
            @Override
            public JavaType refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, Annotated am, JavaType type) throws JsonMappingException {
                if (am.getAnnotation(JsonSerialize.class) != null) {
                    return com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(ArrayList.class);
                }
                return super.refineSerializationType(config, am, type);
            }
            // Need to provide other abstract methods or a more complete mock
            @Override
            public Version version() { return Version.unknownVersion(); }
            @Override
            public JsonInclude.Value findPropertyInclusion(Annotated a) { return JsonInclude.Value.empty(); }
            @Override
            public JsonIgnoreProperties.Value findIgnoredProperties(Annotated a) { return null; }
            @Override
            public Boolean findIgnoreUnknown(Annotated a) { return null; }
            @Override
            public PropertyName findNameForSerialization(Annotated a) { return null; }
            @Override
            public PropertyName findNameForDeserialization(Annotated a) { return null; }
            @Override
            public String findNamespace(Annotated a) { return null; }
            @Override
            public String findEnumValue(Enum<?> e) { return null; }
            @Override
            public String[] findProperties(Annotated a) { return null; }
            @Override
            public JacksonInject.Value findInjectableValue(Annotated a) { return null; }
            @Override
            public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) { return null; }
            @Override
            public TypeSerializer findTypeSerializer(MapperConfig<?> config, AnnotatedClass ac) { return null; }
            @Override
            public Class<?> findPOJOBuilder(AnnotatedClass ac) { return null; }
            @Override
            public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass ac) { return null; }
            @Override
            public Object findDefaultValue(Annotated a) { return null; }
            @Override
            public String findPropertyDescription(Annotated a) { return null; }
            @Override
            public Integer findPropertyIndex(Annotated a) { return null; }
            @Override
            public String findPropertyDefaultValue(Annotated a) { return null; }
            @Override
            public String findGetterSignature(AnnotatedMethod am) { return null; }
            @Override
            public String findSetterSignature(AnnotatedMethod am) { return null; }
            @Override
            public com.fasterxml.jackson.annotation.JsonProperty.Access findPropertyAccess(Annotated a) { return null; }
            @Override
            public Object findSerializer(Annotated a) { return null; }
            @Override
            public Object findKeySerializer(Annotated a) { return null; }
            @Override
            public Object findContentSerializer(Annotated a) { return null; }
            @Override
            public Object findNullSerializer(Annotated a) { return null; }
            @Override
            public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated a) { return null; }
            @Override
            public Object findDeserializer(Annotated a) { return null; }
            @Override
            public Object findKeyDeserializer(Annotated a) { return null; }
            @Override
            public Object findContentDeserializer(Annotated a) { return null; }
            @Override
            public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override
            public Object findValueInstantiator(AnnotatedClass ac) { return null; }
            @Override
            public Class<?> findPOJOSequences(Annotated a) { return null; }
            @Override
            public PropertyName findRootName(AnnotatedClass ac) { return null; }
            @Override
            public JsonFormat.Value findFormat(Annotated a) { return null; }
            @Override
            public PropertyNamingStrategy.PropertyNamingInsideAccessible findNamingStrategy(AnnotatedClass ac) { return null; }
            @Override
            public Boolean findProblemHandler(Annotated a) { return null; }
            @Override
            public Boolean findMergeInfo(Annotated a) { return null; }
            @Override
            public Boolean findIgnoredProperties(AnnotatedClass ac) { return null; }
            @Override
            public String findFilterId(Annotated a) { return null; }
            @Override
            public String findTypeIdResolver(MapperConfig<?> config, AnnotatedClass ac) { return null; }
            @Override
            public AnnotationIntrospector.ReferenceProperty findReferenceType(Annotated a) { return null; }
            @Override
            public Object findUnrecognizedProperty (Annotated a) { return null; }
            @Override
            public Boolean findIsIgnoredType(AnnotatedClass ac) { return null; }
            @Override
            public Boolean findTransient(Annotated a) { return null; }
            @Override
            public Boolean findRequired(Annotated a) { return null; }
            @Override
            public Enum[] findEnumValues(Class<Enum> enumClass, Enum[] values) { return null; }
            @Override
            public String findClassDescription(AnnotatedClass ac) { return null; }
        };

        JavaType result = pb.findSerializationType(am, false, declaredType);
        assertNotNull("Should return a serialization type", result);
        assertEquals("Should return the refined type (ArrayList)", refinedType.getRawClass(), result.getRawClass());
        assertTrue("Should indicate static typing", result.isStaticTyping());
    }

    @Test
    public void testFindSerializationType_StaticTypingEnabled() throws Exception {
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        AnnotatedMember am = createMockAnnotatedMember();

        // PropertyBuilder created with a config where isEnabled(MapperFeature.USE_STATIC_TYPING) is true
        SerializationConfig config = new MockSerializationConfig(null) {
            @Override
            public boolean isEnabled(MapperFeature f) {
                if (f == MapperFeature.USE_STATIC_TYPING) {
                    return true;
                }
                return super.isEnabled(f);
            }
        };
        BeanDescription beanDesc = new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null);
        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        JavaType result = pb.findSerializationType(am, true, declaredType); // explicit true for useStaticTyping

        assertNotNull("Should return a serialization type when static typing is enabled", result);
        assertEquals("Should return the declared type", declaredType, result);
        assertTrue("Should indicate static typing", result.isStaticTyping());
    }

    @Test
    public void testFindSerializationType_DynamicTyping() throws Exception {
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        AnnotatedMember am = createMockAnnotatedMember();

        // PropertyBuilder created with a config where isEnabled(MapperFeature.USE_STATIC_TYPING) is false
        SerializationConfig config = new MockSerializationConfig(null) {
            @Override
            public boolean isEnabled(MapperFeature f) {
                if (f == MapperFeature.USE_STATIC_TYPING) {
                    return false;
                }
                return super.isEnabled(f);
            }
        };
        BeanDescription beanDesc = new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null);
        PropertyBuilder pb = new PropertyBuilder(config, beanDesc);

        JavaType result = pb.findSerializationType(am, false, declaredType); // explicit false for useStaticTyping

        assertNull("Should return null when static typing is disabled and no annotation overrides", result);
    }


    @Test
    public void testGetDefaultBean_InstantiatesDefaultConstructor() throws Exception {
        // Mock BeanDescription to return a class with a default constructor
        JavaType javaType = new MockJavaType(DefaultConstructorBean.class, false, null);
        AnnotatedClass annotatedClass = new AnnotatedClass(new MockAnnotations(), javaType, null, null, null);
        BeanDescription beanDesc = new MockBeanDescription(javaType, annotatedClass, new MockAnnotations());
        SerializationConfig config = new MockSerializationConfig(null);

        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);

        Object defaultBean = builder.getDefaultBean();
        assertNotNull("Should instantiate the default constructor", defaultBean);
        assertTrue("Should be an instance of DefaultConstructorBean", defaultBean instanceof DefaultConstructorBean);
    }

    @Test
    public void testGetDefaultBean_ReturnsNullIfNoDefaultConstructor() throws Exception {
        // Mock BeanDescription to return a class with no default constructor
        JavaType javaType = new MockJavaType(NoDefaultConstructorBean.class, false, null);
        AnnotatedClass annotatedClass = new AnnotatedClass(new MockAnnotations(), javaType, null, null, null);
        BeanDescription beanDesc = new MockBeanDescription(javaType, annotatedClass, new MockAnnotations());
        SerializationConfig config = new MockSerializationConfig(null);

        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);

        Object defaultBean = builder.getDefaultBean();
        assertNull("Should return null if no default constructor is available", defaultBean);
    }

    @Test
    public void testGetDefaultBean_CachesInstance() throws Exception {
        JavaType javaType = new MockJavaType(DefaultConstructorBean.class, false, null);
        AnnotatedClass annotatedClass = new AnnotatedClass(new MockAnnotations(), javaType, null, null, null);
        BeanDescription beanDesc = new MockBeanDescription(javaType, annotatedClass, new MockAnnotations());
        SerializationConfig config = new MockSerializationConfig(null);

        PropertyBuilder builder = new PropertyBuilder(config, beanDesc);

        Object firstCall = builder.getDefaultBean();
        Object secondCall = builder.getDefaultBean();

        assertNotNull("Should return an instance", firstCall);
        assertSame("Should return the same cached instance on subsequent calls", firstCall, secondCall);
    }

    @Test
    public void testGetDefaultValue_PrimitiveInt() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType intType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(int.class);
        Object defaultValue = builder.getDefaultValue(intType);
        assertEquals("Default value for int should be 0", Integer.valueOf(0), defaultValue);
    }

    @Test
    public void testGetDefaultValue_PrimitiveBoolean() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType booleanType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(boolean.class);
        Object defaultValue = builder.getDefaultValue(booleanType);
        assertEquals("Default value for boolean should be false", Boolean.FALSE, defaultValue);
    }

    @Test
    public void testGetDefaultValue_String() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType stringType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String.class);
        Object defaultValue = builder.getDefaultValue(stringType);
        assertEquals("Default value for String should be empty string", "", defaultValue);
    }

    @Test
    public void testGetDefaultValue_Collection() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType listType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(java.util.List.class);
        Object defaultValue = builder.getDefaultValue(listType);
        assertEquals("Default value for collection should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_Map() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType mapType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(java.util.Map.class);
        Object defaultValue = builder.getDefaultValue(mapType);
        assertEquals("Default value for map should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_Array() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType arrayType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String[].class);
        Object defaultValue = builder.getDefaultValue(arrayType);
        assertEquals("Default value for array should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_ReferenceType() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType refType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(java.util.Optional.class);
        Object defaultValue = builder.getDefaultValue(refType);
        assertEquals("Default value for reference type should be NON_EMPTY", JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValue_Object() {
        PropertyBuilder builder = createPropertyBuilder(Object.class);
        JavaType objectType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(Object.class);
        Object defaultValue = builder.getDefaultValue(objectType);
        assertNull("Default value for general Object should be null", defaultValue);
    }

    @Test
    public void testBuildWriter_HandlesContainerWriteEmptyJsonArraysFalse() throws Exception {
        // Test for SerializationFeature.WRITE_EMPTY_JSON_ARRAYS when false
        JavaType declaredType = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance.constructType(String[].class);
        AnnotatedMember am = createMockAnnotatedMember();
        BeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testArray", new MockAnnotations(), declaredType);

        PropertyBuilder pb = new PropertyBuilder(new MockSerializationConfig(null) {
            @Override
            public boolean isEnabled(SerializationFeature f) {
                if (f == SerializationFeature.WRITE_EMPTY_JSON_ARRAYS) {
                    return false; // Feature is disabled
                }
                return super.isEnabled(f);
            }
        }, new MockBeanDescription(new MockJavaType(SampleBean.class, false, null), null, null));

        SerializerProvider prov = new MockSerializerProvider();
        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        assertNotNull("BeanPropertyWriter should be created", writer);
        // If WRITE_EMPTY_JSON_ARRAYS is false, and inclusion is ALWAYS, valueToSuppress should be MARKER_FOR_EMPTY
        // for container types.
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
```