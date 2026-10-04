package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.util.HashMap;

// Mock implementations for dependencies that are hard to create
class MockSerializerProvider extends SerializerProvider {
    protected MockSerializerProvider() {
        super(null, null, null); // Simplified constructor call
    }

    @Override
    public JsonSerializer<?> serializerInstance(Annotated a, Object serDef) throws JsonMappingException {
        // For simplicity, return a placeholder.
        return new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                // No-op
            }
        };
    }
}

// BeanPropertyDefinition is an abstract class, needs to be extended.
class MockBeanPropertyDefinition extends BeanPropertyDefinition {
    private final String _name;
    private final PropertyName _wrapperName;
    private final JsonInclude.Value _inclusion;
    private final AnnotatedMember _primaryMember;
    private final JavaType _declaredType;

    public MockBeanPropertyDefinition(String name, PropertyName wrapperName, JsonInclude.Value inclusion, AnnotatedMember primaryMember, JavaType declaredType) {
        super(null, null, null, null, null); // Dummy arguments for abstract super constructor
        _name = name;
        _wrapperName = wrapperName;
        _inclusion = inclusion;
        _primaryMember = primaryMember;
        _declaredType = declaredType;
    }

    @Override public String getName() { return _name; }
    @Override public PropertyName getWrapperName() { return _wrapperName; }
    @Override public boolean isRequired() { return false; }
    @Override public JsonInclude.Value findInclusion() { return _inclusion; }
    @Override public AnnotatedMember getPrimaryMember() { return _primaryMember; }
    @Override public JavaType getType() { return _declaredType; } // Provide declared type
    @Override public void addFieldType(JavaType type, TypeResolutionContext context) { }
    @Override public JavaType getType(TypeResolutionContext context) { return _declaredType; }
    @Override public String getInternalName() { return _name; }
    @Override public boolean isVirtual() { return false; }
    @Override public PropertyName getFullName() { return PropertyName.construct(_name); }
    @Override public PropertyName[] findExplicitNames() { return null; }
    @Override public String getPropertyName() { return _name; }
    @Override public JavaType getRawPrimaryType() { return _declaredType; }
    @Override public boolean isExplicitlyIncluded() { return false; }
    @Override public boolean isIgnored() { return false; }
    @Override public boolean isTransient() { return false; }
    @Override public void rename(java.util.concurrent.atomic.AtomicReference<PropertyName> name) { }
    @Override public BeanProperty build(BeanPropertyDefinition src, JavaType type, TypeSerializer typeSer, JsonSerializer<?> ser) { return null; }
    // Need to implement other abstract methods if they are called by the framework,
    // but the current test paths don't seem to require them.
    // For BeanPropertyDefinition, `getNonConstructorMutator` is abstract. If not called, we can omit it.
    // Based on usage in PropertyBuilder, it seems only `getName`, `findInclusion`, `getPrimaryMember`, `getType` are relevant.
    // However, to compile, all abstract methods must be implemented.
    @Override
    public BeanPropertyDefinition withSimpleName(String name) {
        return new MockBeanPropertyDefinition(name, _wrapperName, _inclusion, _primaryMember, _declaredType);
    }

    @Override
    public BeanPropertyDefinition withName(PropertyName newName) {
        return new MockBeanPropertyDefinition(newName.getSimpleName(), _wrapperName, _inclusion, _primaryMember, _declaredType);
    }

    @Override
    public BeanPropertyDefinition withSimpleName(PropertyName newName) {
        return new MockBeanPropertyDefinition(newName.getSimpleName(), _wrapperName, _inclusion, _primaryMember, _declaredType);
    }

    @Override
    public BeanPropertyDefinition withAppendedName(PropertyName suffix) {
        return new MockBeanPropertyDefinition(_name + suffix.getSimpleName(), _wrapperName, _inclusion, _primaryMember, _declaredType);
    }

    @Override
    public BeanPropertyDefinition withUnwrappingNameTransformer(NameTransformer unwrapper) {
        return this; // Not handling unwrapping in mock
    }

    @Override
    public BeanPropertyDefinition move(PropertyName newWrapper) {
        return new MockBeanPropertyDefinition(_name, newWrapper, _inclusion, _primaryMember, _declaredType);
    }

    @Override
    public BeanPropertyDefinition demethylize(PropertyName newName) {
        return new MockBeanPropertyDefinition(newName.getSimpleName(), _wrapperName, _inclusion, _primaryMember, _declaredType);
    }

    @Override
    public AnnotatedMember getMutator() {
        return _primaryMember;
    }

    @Override
    public boolean couldSerialize() {
        return true;
    }

    @Override
    public String getInternalName() {
        return _name;
    }

    @Override
    public JavaType getPrimaryType() {
        return _declaredType;
    }

    @Override
    public BeanPropertyDefinition rename(String newName) {
        return new MockBeanPropertyDefinition(newName, _wrapperName, _inclusion, _primaryMember, _declaredType);
    }

    @Override
    public BeanPropertyDefinition withValueTypeDeserializer(com.fasterxml.jackson.databind.deser.ValueInstantiator valueInstantiator) {
        return this; // Not handling value type deserializer in mock
    }
}

class MockBeanDescription extends BeanDescription {
    private final Class<?> _beanClass;
    private final Annotations _classAnnos;
    private final JsonInclude.Value _defaultInclusion;
    private final AnnotatedClass _classInfo;
    private final JavaType _type;

    protected MockBeanDescription(POJOPropertiesCollector coll, Class<?> beanClass, Annotations classAnnos, JsonInclude.Value defaultInclusion, AnnotatedClass classInfo, JavaType type) {
        super(coll, beanClass, classInfo, type, null); // Pass JavaType to super constructor
        _beanClass = beanClass;
        _classAnnos = classAnnos;
        _defaultInclusion = defaultInclusion;
        _classInfo = classInfo;
        _type = type;
    }

    @Override public Class<?> getBeanClass() { return _beanClass; }
    @Override public JsonInclude.Value findPropertyInclusion(JsonInclude.Value defaultInclusion) {
        return (_defaultInclusion != null) ? _defaultInclusion : defaultInclusion;
    }
    @Override public Annotations getClassAnnotations() { return _classAnnos; }
    @Override public AnnotatedClass getClassInfo() { return _classInfo; }
    @Override public JavaType getType() { return _type; }

    @Override
    public Object instantiateBean(boolean suppress) {
        try {
            java.lang.reflect.Constructor<?> constructor = _beanClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to instantiate bean: " + e.getMessage(), e);
        }
    }

    // Add implementations for other abstract methods if they are called by the framework
    // For example, findPOJOBuilderConfig() might be required.
    // Based on PropertyBuilder usage, these might not be critical for the tested paths.
    @Override
    public POJOBuilderConfig getPOJOBuilderConfig() {
        return new POJOBuilderConfig(); // Dummy implementation
    }
    @Override
    public com.fasterxml.jackson.databind.deser.ValueInstantiator getValueInstantiator() {
        return null; // Not used in PropertyBuilder context
    }
}

class MockAnnotationIntrospector extends AnnotationIntrospector {
    @Override public Version version() { return Version.unknownVersion(); }
    @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
    @Override public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) { return baseType; }
    @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
    @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
    @Override public Object findNullSerializer(Annotated a) { return null; }
    @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }

    // This method was missing and causing a compiler error
    @Override
    public boolean isIgnorableType(AnnotatedClass ac) {
        return false;
    }
}

abstract class MockAnnotatedMember extends AnnotatedMember {
    protected final Object _value;
    protected final Class<?> _declaringClass;
    protected final String _name;

    protected MockAnnotatedMember(Class<?> declaringClass, Object value, String name) {
        super(null, null); // Dummy arguments for abstract super constructor
        _declaringClass = declaringClass;
        _value = value;
        _name = name;
    }

    @Override public int getAnnotationCount() { return 0; }
    @Override public Class<?> getDeclaringClass() { return _declaringClass; }
    @Override public java.lang.reflect.Member getMember() { return null; }
    @Override public Object getValue(Object pojo) throws IllegalAccessException { // Removed IllegalArgumentException
        if (pojo == null) return _value; // Simple mock logic
        return _value;
    }
    @Override public void setValue(Object pojo, Object value) throws IllegalAccessException { } // Removed IllegalArgumentException
    @Override public Annotated withAnnotations(AnnotationMap fallback) { return this; }
    @Override public String getName() { return _name; }
}

// Concrete implementation for MockAnnotatedMember to represent a field
class MockAnnotatedField extends MockAnnotatedMember {
    public MockAnnotatedField(Class<?> declaringClass, Object value, String name) {
        super(declaringClass, value, name);
    }

    @Override
    public java.lang.reflect.Field getMember() {
        try {
            java.lang.reflect.Field field = _declaringClass.getDeclaredField(_name);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

// Concrete implementation for MockAnnotatedMember to represent a method
class MockAnnotatedMethod extends MockAnnotatedMember {
    public MockAnnotatedMethod(Class<?> declaringClass, Object value, String name) {
        super(declaringClass, value, name);
    }

    @Override
    public java.lang.reflect.Method getMember() {
        try {
            // Assuming no-arg method for simplicity, adjust if needed.
            java.lang.reflect.Method method = _declaringClass.getDeclaredMethod(_name);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}


public class PropertyBuilderTest {

    private PropertyBuilder createPropertyBuilder(SerializationConfig config, BeanDescription beanDesc) {
        return new PropertyBuilder(config, beanDesc);
    }

    // Mock objects for creating PropertyBuilder
    private final SerializationConfig mockConfig = new ObjectMapper().getSerializationConfig();
    private final AnnotationIntrospector mockAnnotationIntrospector = new MockAnnotationIntrospector();
    private final Annotations mockClassAnnotations = BasicClassIntrospector.INTROSPECTOR.forClass(String.class).getClassAnnotations();
    private final JavaType mockStringJavaType = TypeFactory.defaultInstance().constructType(String.class);
    private final AnnotatedClass mockAnnotatedClass = new AnnotatedClass(null, mockStringJavaType, mockClassAnnotations, null);


    // Test cases

    @Test
    public void testDefaultInclusionAlways() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertFalse(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonNull() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.NON_NULL, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertTrue(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonAbsent() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.NON_ABSENT, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertTrue(writer._suppressNulls);
        assertEquals(BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonEmpty() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertTrue(writer._suppressNulls);
        assertEquals(BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonDefaultWithNullDefaultBean() throws Exception {
        JavaType objectJavaType = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedClass emptyAnnotatedClass = new AnnotatedClass(null, objectJavaType, mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, Object.class, mockClassAnnotations, JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, null), emptyAnnotatedClass, objectJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector;
        pb._defaultBean = NO_DEFAULT_MARKER; // Simulate NO_DEFAULT_MARKER

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertTrue(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonDefaultWithNonNullDefaultBean() throws Exception {
        Object defaultBean = new Object() {
            public String getTest() { return "defaultValue"; }
        };
        JavaType defaultBeanJavaType = TypeFactory.defaultInstance().constructType(defaultBean.getClass());
        AnnotatedClass defaultBeanAnnotatedClass = new AnnotatedClass(null, defaultBeanJavaType, mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, defaultBean.getClass(), mockClassAnnotations, JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, null), defaultBeanAnnotatedClass, defaultBeanJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultBean = defaultBean; // Set the default bean
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedMethod(defaultBean.getClass(), "defaultValue", "getTest"); // Use method accessor
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertFalse(writer._suppressNulls);
        assertEquals("defaultValue", writer._suppressableValue);
    }

    @Test
    public void testFindSerializationTypeAnnotationOverride() throws Exception {
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
                if (a instanceof AnnotatedMember && ((AnnotatedMember) a).getName().equals("annotatedField")) {
                    return TypeFactory.defaultInstance().constructType(Integer.class);
                }
                return baseType;
            }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("annotatedField", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "annotatedField");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, false, mockStringJavaType);
        assertNotNull(result);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationTypeStaticTypingEnabled() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, true, mockStringJavaType);
        assertNotNull(result);
        assertEquals(mockStringJavaType, result);
        assertTrue(result.isStaticTyping());
    }

    @Test
    public void testFindSerializationTypeStaticTypingExplicitlyDisabled() throws Exception {
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public JsonSerialize.Typing findSerializationTyping(Annotated a) {
                return JsonSerialize.Typing.DYNAMIC;
            }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) { return baseType; }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, true, mockStringJavaType);
        assertNull(result);
    }


    @Test
    public void testBuildWriterWithContentTypeSer() throws Exception {
        TypeSerializer mockContentTypeSer = new TypeSerializer() {
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public JsonTypeInfo.As getTypeInclusion() { return JsonTypeInfo.As.WRAPPER_OBJECT; }
            @Override public String getPropertyName() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) { }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator jgen) { }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator jgen) { }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) { }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) { }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) { }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        JavaType listStringType = TypeFactory.defaultInstance().constructType(java.util.List.class).withContentType(mockStringJavaType);
        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testList", null, null, null, listStringType);
        AnnotatedMember am = new MockAnnotatedField(java.util.List.class, null, "testList");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, listStringType, null, null, mockContentTypeSer, am, false);

        assertNotNull(writer._cfgSerializationType);
        assertEquals(mockStringJavaType, writer._cfgSerializationType.getContentType());
        assertTrue(writer._cfgSerializationType.hasContentTypeHandler());
    }

    @Test
    public void testBuildWriterWithContentTypeSerAndNullContentType() throws Exception {
        TypeSerializer mockContentTypeSer = new TypeSerializer() {
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public JsonTypeInfo.As getTypeInclusion() { return JsonTypeInfo.As.WRAPPER_OBJECT; }
            @Override public String getPropertyName() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) { }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator jgen) { }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator jgen) { }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) { }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) { }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) { }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, null, "test");
        SerializerProvider prov = new MockSerializerProvider();

        try {
            pb.buildWriter(prov, propDef, mockStringJavaType, null, null, mockContentTypeSer, am, false);
            fail("Should have thrown IllegalStateException for null content type");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("serialization type "+mockStringJavaType+" has no content"));
        }
    }

    @Test
    public void testFindSerializationTypeSubtypeMismatch() throws Exception {
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
                return TypeFactory.defaultInstance().constructType(Integer.class);
            }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");

        try {
            pb.findSerializationType(am, false, mockStringJavaType);
            fail("Should have thrown IllegalArgumentException for subtype mismatch");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Illegal concrete-type annotation"));
        }
    }

    @Test
    public void testFindSerializationTypeSubtypeOK() throws Exception {
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
                return TypeFactory.defaultInstance().constructType(Object.class);
            }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");

        JavaType result = pb.findSerializationType(am, false, mockStringJavaType);
        assertNotNull(result);
        assertEquals(Object.class, result.getRawClass());
    }

    @Test
    public void testGetDefaultBeanInstantiateFails() throws Exception {
        class NoDefaultConstructor {
            public NoDefaultConstructor(int x) {}
        }
        JavaType noDefaultJavaType = TypeFactory.defaultInstance().constructType(NoDefaultConstructor.class);
        AnnotatedClass noDefaultAnnotatedClass = new AnnotatedClass(null, noDefaultJavaType, mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, NoDefaultConstructor.class, mockClassAnnotations, null, noDefaultAnnotatedClass, noDefaultJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        Object defaultValue = pb.getDefaultBean();
        assertNull(defaultValue);
    }

    @Test
    public void testGetDefaultBeanCache() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        Object firstCall = pb.getDefaultBean();
        Object secondCall = pb.getDefaultBean();
        assertNotNull(firstCall);
        assertSame(firstCall, secondCall);
    }

    @Test
    public void testGetPropertyDefaultValueException() throws Exception {
        Object faultyBean = new Object() {
            public String getTest() {
                throw new RuntimeException("Simulated exception");
            }
        };
        JavaType faultyBeanJavaType = TypeFactory.defaultInstance().constructType(faultyBean.getClass());
        AnnotatedClass faultyBeanAnnotatedClass = new AnnotatedClass(null, faultyBeanJavaType, mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, faultyBean.getClass(), mockClassAnnotations, null, faultyBeanAnnotatedClass, faultyBeanJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultBean = faultyBean;
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedMethod(faultyBean.getClass(), null, "getTest");
        SerializerProvider prov = new MockSerializerProvider();

        try {
            pb.getPropertyDefaultValue("test", am, mockStringJavaType);
            fail("Should have thrown IllegalArgumentException due to wrapped exception");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Failed to get property 'test'"));
        }
    }

    @Test
    public void testGetDefaultValueForPrimitiveInt() throws Exception {
        JavaType intType = TypeFactory.defaultInstance().constructType(int.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(intType);
        assertEquals(Integer.valueOf(0), defaultValue);
    }

    @Test
    public void testGetDefaultValueForWrapperInteger() throws Exception {
        JavaType integerType = TypeFactory.defaultInstance().constructType(Integer.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(integerType);
        assertNull(defaultValue);
    }

    @Test
    public void testGetDefaultValueForString() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(stringType);
        assertEquals("", defaultValue);
    }

    @Test
    public void testGetDefaultValueForContainerType() throws Exception {
        JavaType listType = TypeFactory.defaultInstance().constructType(java.util.List.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(listType);
        assertEquals(JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testGetDefaultValueForReferenceType() throws Exception {
        JavaType optionalType = TypeFactory.defaultInstance().constructType(java.util.Optional.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(optionalType);
        assertEquals(JsonInclude.Include.NON_EMPTY, defaultValue);
    }

    @Test
    public void testBuildWriterWithNullSerializer() throws Exception {
        Object nullSerDef = "myNullSerializer";

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Object findNullSerializer(Annotated a) {
                return nullSerDef;
            }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) { return baseType; }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider mockProv = new MockSerializerProvider() {
            @Override
            public JsonSerializer<?> serializerInstance(Annotated a, Object serDef) throws JsonMappingException {
                if (serDef == nullSerDef) {
                    return new JsonSerializer<Object>() {
                        @Override
                        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
                    };
                }
                return super.serializerInstance(a, serDef);
            }
        };

        BeanPropertyWriter writer = pb.buildWriter(mockProv, propDef, mockStringJavaType, null, null, null, am, false);
        assertNotNull(writer._nullSerializer);
    }

    @Test
    public void testBuildWriterWithUnwrappingNameTransformer() throws Exception {
        NameTransformer unwrapper = NameTransformer.simpleTransformer("prefix", null);

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public NameTransformer findUnwrappingNameTransformer(Annotated a) {
                return unwrapper;
            }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) { return baseType; }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertNotNull(writer);
        // BeanPropertyWriter's unwrappingWriter method is called internally.
        // We can't directly assert on the type of writer due to it being internal,
        // but the call itself is what we are testing.
    }

    @Test
    public void testBuildWriterWithEmptyCollectionWriteDisabled() throws Exception {
        SerializationConfig configWithEmptyArraysDisabled = mockConfig.without(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);

        JavaType listStringType = TypeFactory.defaultInstance().constructType(java.util.List.class).withContentType(mockStringJavaType);
        AnnotatedClass listAnnotatedClass = new AnnotatedClass(null, listStringType, mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, java.util.List.class, mockClassAnnotations, null, listAnnotatedClass, listStringType);

        PropertyBuilder pb = createPropertyBuilder(configWithEmptyArraysDisabled, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testList", null, null, null, listStringType);
        AnnotatedMember am = new MockAnnotatedField(java.util.List.class, null, "testList");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, listStringType, null, null, null, am, false);

        assertTrue(writer._suppressNulls);
        assertEquals(BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testBuildWriterWithEmptyCollectionWriteEnabled() throws Exception {
        SerializationConfig configWithEmptyArraysEnabled = mockConfig.with(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);

        JavaType listStringType = TypeFactory.defaultInstance().constructType(java.util.List.class).withContentType(mockStringJavaType);
        AnnotatedClass listAnnotatedClass = new AnnotatedClass(null, listStringType, mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, java.util.List.class, mockClassAnnotations, null, listAnnotatedClass, listStringType);

        PropertyBuilder pb = createPropertyBuilder(configWithEmptyArraysEnabled, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testList", null, null, null, listStringType);
        AnnotatedMember am = new MockAnnotatedField(java.util.List.class, null, "testList");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, listStringType, null, null, null, am, false);

        assertFalse(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testBuildWriterWithUseDefaultsInclusion() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.USE_DEFAULTS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, mockStringJavaType, null, null, null, am, false);
        assertFalse(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testFindSerializationTypeWhenAnnotationRefinesToSameType() throws Exception {
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
                return baseType;
            }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass, mockStringJavaType);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null, mockStringJavaType);
        AnnotatedMember am = new MockAnnotatedField(String.class, "someValue", "test");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, false, mockStringJavaType);
        assertNull(result);
    }

     @Test
    public void testGetDefaultValueForBoolean() throws Exception {
        JavaType booleanType = TypeFactory.defaultInstance().constructType(boolean.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(booleanType);
        assertEquals(Boolean.FALSE, defaultValue);
    }

    @Test
    public void testGetDefaultValueForChar() throws Exception {
        JavaType charType = TypeFactory.defaultInstance().constructType(char.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(charType);
        assertEquals(Character.valueOf('\u0000'), defaultValue);
    }

    @Test
    public void testGetDefaultValueForFloat() throws Exception {
        JavaType floatType = TypeFactory.defaultInstance().constructType(float.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(floatType);
        assertEquals(Float.valueOf(0.0f), defaultValue);
    }

    @Test
    public void testGetDefaultValueForDouble() throws Exception {
        JavaType doubleType = TypeFactory.defaultInstance().constructType(double.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(doubleType);
        assertEquals(Double.valueOf(0.0d), defaultValue);
    }

    @Test
    public void testGetDefaultValueForLong() throws Exception {
        JavaType longType = TypeFactory.defaultInstance().constructType(long.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(longType);
        assertEquals(Long.valueOf(0L), defaultValue);
    }

    @Test
    public void testGetDefaultValueForShort() throws Exception {
        JavaType shortType = TypeFactory.defaultInstance().constructType(short.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(shortType);
        assertEquals(Short.valueOf((short) 0), defaultValue);
    }

    @Test
    public void testGetDefaultValueForByte() throws Exception {
        JavaType byteType = TypeFactory.defaultInstance().constructType(byte.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(byteType);
        assertEquals(Byte.valueOf((byte) 0), defaultValue);
    }

    @Test
    public void testGetDefaultValueForArray() throws Exception {
        JavaType arrayType = TypeFactory.defaultInstance().constructType(String[].class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null);
        Object defaultValue = pb.getDefaultValue(arrayType);
        assertEquals(JsonInclude.Include.NON_EMPTY, defaultValue);
    }
}
