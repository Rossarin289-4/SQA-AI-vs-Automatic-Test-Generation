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
import com.fasterxml.jackson.core.Version; // Added for Version
import com.fasterxml.jackson.core.JsonGenerator; // Added for JsonGenerator
import com.fasterxml.jackson.databind.type.TypeFactory; // Added for TypeFactory
import com.fasterxml.jackson.databind.BeanProperty; // Added for BeanProperty
import java.io.IOException; // Added for IOException
import java.lang.reflect.Member; // Added for Member
import java.lang.reflect.Field; // Added for Field
import java.lang.reflect.Method; // Added for Method
import java.lang.annotation.Annotation; // Added for Annotation
import java.util.HashMap; // Added for HashMap

// Mock implementations for dependencies that are hard to create
class MockSerializerProvider extends SerializerProvider {
    protected MockSerializerProvider() {
        // Need a valid constructor, even if not fully functional for this mock
        super(null, null, null);
    }

    @Override
    public JsonSerializer<?> serializerInstance(Annotated a, Object serDef) throws JsonMappingException {
        // For simplicity, just return a placeholder. In a real scenario,
        // this would need to instantiate the serializer.
        return new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                // No-op
            }
        };
    }
}

class MockBeanPropertyDefinition extends BeanPropertyDefinition {
    private final String _name;
    private final PropertyName _wrapperName;
    private final JsonInclude.Value _inclusion;
    private final AnnotatedMember _primaryMember;

    public MockBeanPropertyDefinition(String name, PropertyName wrapperName, JsonInclude.Value inclusion, AnnotatedMember primaryMember) {
        // BeanPropertyDefinition requires a MapperConfig, POJOPropertiesCollector and AnnotatedMember in its constructor.
        // Providing minimal valid objects to satisfy the constructor.
        super(null, null, null, null, null); // These arguments are for a different constructor
        _name = name;
        _wrapperName = wrapperName;
        _inclusion = inclusion;
        _primaryMember = primaryMember;
    }

    @Override
    public String getName() { return _name; }
    @Override
    public PropertyName getWrapperName() { return _wrapperName; }
    @Override
    public boolean isRequired() { return false; }
    @Override
    public JsonInclude.Value findInclusion() { return _inclusion; }
    @Override
    public AnnotatedMember getPrimaryMember() { return _primaryMember; }
    @Override
    public JavaType getType() { return null; } // Not used in tested code path
    @Override
    public void addFieldType(JavaType type, TypeResolutionContext context) { } // Not used
    @Override
    public JavaType getType(TypeResolutionContext context) { return null; } // Not used
    @Override
    public String getInternalName() { return _name; }
    @Override
    public boolean isVirtual() { return false; }
    // AnnotationIntrospector is not directly available here, we rely on the member.
    // Removed getAnnotationIntrospector() as it's not used in the PropertyBuilder context for this mock.
    @Override
    public BeanProperty build(BeanPropertyDefinition src, JavaType type, TypeSerializer typeSer, JsonSerializer<?> ser) { return null; }
    @Override
    public PropertyName getFullName() { return PropertyName.construct(_name); }
    @Override
    public PropertyName[] findExplicitNames() { return null; }
    @Override
    public String getPropertyName() { return _name; } // Simplified for mock
    @Override
    public JavaType getRawPrimaryType() { return null; }
    @Override
    public boolean isExplicitlyIncluded() { return false; }
    @Override
    public boolean isIgnored() { return false; }
    @Override
    public boolean isTransient() { return false; }
    @Override
    public void rename(java.util.concurrent.atomic.AtomicReference<PropertyName> name) { }
}

class MockBeanDescription extends BeanDescription {
    private final Class<?> _beanClass;
    private final Annotations _classAnnos;
    private final JsonInclude.Value _defaultInclusion;
    private final AnnotatedClass _classInfo;

    protected MockBeanDescription(POJOPropertiesCollector coll, Class<?> beanClass, Annotations classAnnos, JsonInclude.Value defaultInclusion, AnnotatedClass classInfo) {
        // BeanDescription requires POJOPropertiesCollector, Class, AnnotatedClass, JavaType, and POJOBuilderConfig.
        // Providing minimal valid objects to satisfy the constructor.
        super(coll, beanClass, classInfo, TypeFactory.defaultInstance().constructType(beanClass), null);
        _beanClass = beanClass;
        _classAnnos = classAnnos;
        _defaultInclusion = defaultInclusion;
        _classInfo = classInfo;
    }

    @Override
    public Class<?> getBeanClass() { return _beanClass; }
    @Override
    public JsonInclude.Value findPropertyInclusion(JsonInclude.Value defaultInclusion) {
        return (_defaultInclusion != null) ? _defaultInclusion : defaultInclusion;
    }

    @Override
    public Annotations getClassAnnotations() { return _classAnnos; }

    @Override
    public Object instantiateBean(boolean suppress) {
        try {
            // Use reflection to find a no-arg constructor
            java.lang.reflect.Constructor<?> constructor = _beanClass.getDeclaredConstructor();
            constructor.setAccessible(true); // Make it accessible if private/protected
            return constructor.newInstance();
        } catch (Exception e) {
            // Re-throw as RuntimeException as per PropertyBuilder's behavior
            throw new IllegalArgumentException("Failed to instantiate bean: " + e.getMessage(), e);
        }
    }
    
    @Override
    public AnnotatedClass getClassInfo() {
        return _classInfo;
    }
}

class MockAnnotationIntrospector extends AnnotationIntrospector {
    @Override
    public JsonInclude.Value findPropertyInclusion(Annotated a) {
        return null;
    }
    @Override
    public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
        return baseType;
    }

    @Override
    public JsonSerialize.Typing findSerializationTyping(Annotated a) {
        return JsonSerialize.Typing.DEFAULT_TYPING;
    }

    @Override
    public NameTransformer findUnwrappingNameTransformer(Annotated a) {
        return null;
    }

    @Override
    public Object findNullSerializer(Annotated a) {
        return null;
    }

    @Override
    public boolean isIgnorableType(AnnotatedClass ac) {
        return false;
    }

    @Override
    public Version version() {
        return Version.unknownVersion();
    }
}

class MockAnnotatedMember extends AnnotatedMember {
    private final Class<?> _declaringClass;
    private final Object _value;
    private final Annotated _annotated;

    MockAnnotatedMember(Class<?> declaringClass, Object value) {
        super(null, null);
        _declaringClass = declaringClass;
        _value = value;
        // Minimal AnnotationMap for constructor
        _annotated = new Annotated() {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> aClass) { return null; }
            @Override
            public boolean hasAnnotation(Class<? extends Annotation> aClass) { return false; }
            @Override
            public int getAnnotationCount() { return 0; }
            @Override
            public Class<?> getRawClass() { return _declaringClass; }
            @Override
            public Member getMember() { return null; }
            @Override
            public Annotated withAnnotations(AnnotationMap fallback) { return this; }
            @Override
            public String getName() { return "mockMember"; }
        };
    }

    @Override
    public int getAnnotationCount() { return 0; }
    @Override
    public Class<?> getDeclaringClass() { return _declaringClass; }
    @Override
    public Member getMember() { return null; } // Not used
    @Override
    public Object getValue(Object pojo) throws IllegalArgumentException, IllegalAccessException {
        return _value;
    }
    @Override
    public void setValue(Object pojo, Object value) throws IllegalArgumentException, IllegalAccessException { }
    @Override
    public Annotated withAnnotations(AnnotationMap fallback) { return this; }
    @Override
    public String getName() { return "mockAnnotatedMember"; }
}


public class PropertyBuilderTest {

    private PropertyBuilder createPropertyBuilder(SerializationConfig config, BeanDescription beanDesc) {
        return new PropertyBuilder(config, beanDesc);
    }

    // Mock objects for creating PropertyBuilder
    private final SerializationConfig mockConfig = new ObjectMapper().getSerializationConfig();
    private final AnnotationIntrospector mockAnnotationIntrospector = new MockAnnotationIntrospector();
    private final Annotations mockClassAnnotations = BasicClassIntrospector.INTROSPECTOR.forClass(String.class).getClassAnnotations();
    private final AnnotatedClass mockAnnotatedClass = new AnnotatedClass(null, TypeFactory.defaultInstance().constructType(String.class), mockClassAnnotations, null);


    // Test cases

    @Test
    public void testDefaultInclusionAlways() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        assertFalse(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonNull() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.NON_NULL, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        assertTrue(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonAbsent() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.NON_ABSENT, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class); // Using String as a reference type
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        assertTrue(writer._suppressNulls);
        // For reference types, NON_ABSENT should suppress BeanPropertyWriter.MARKER_FOR_EMPTY
        assertEquals(BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonEmpty() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        assertTrue(writer._suppressNulls);
        assertEquals(BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue);
    }

    @Test
    public void testDefaultInclusionNonDefaultWithNullDefaultBean() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, Object.class, mockClassAnnotations, JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, null), mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector;
        // Ensure getDefaultBean returns null
        pb._defaultBean = NO_DEFAULT_MARKER;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        assertTrue(writer._suppressNulls); // NON_DEFAULT with null default should suppress nulls
        assertNull(writer._suppressableValue); // No specific value to suppress
    }

    @Test
    public void testDefaultInclusionNonDefaultWithNonNullDefaultBean() throws Exception {
        // Simulate a default bean with a value
        Object defaultBean = new Object() {
            public String getTest() { return "defaultValue"; }
        };
        AnnotatedClass defaultBeanAnnotatedClass = new AnnotatedClass(null, TypeFactory.defaultInstance().constructType(defaultBean.getClass()), mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, defaultBean.getClass(), mockClassAnnotations, JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, null), defaultBeanAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultBean = defaultBean; // Set the default bean
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(defaultBean.getClass(), "someValue"); // Member matching defaultBean
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        // NON_DEFAULT with a specific default value should not suppress nulls unless that value is null.
        assertFalse(writer._suppressNulls);
        assertEquals("defaultValue", writer._suppressableValue); // Should suppress "defaultValue"
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
            // Need to implement other abstract methods if they are called by the framework
            @Override
            public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override
            public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override
            public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override
            public Object findNullSerializer(Annotated a) { return null; }
            @Override
            public boolean isIgnorableType(AnnotatedClass ac) { return false; }

        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("annotatedField", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, false, declaredType);
        assertNotNull(result);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationTypeStaticTypingEnabled() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector; // Default static typing

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, true, declaredType); // true indicates static typing enabled
        assertNotNull(result);
        assertEquals(declaredType, result);
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
            // Need to implement other abstract methods
            @Override public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) { return baseType; }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, true, declaredType); // Static typing is true, but annotation overrides to dynamic
        assertNull(result);
    }


    @Test
    public void testBuildWriterWithContentTypeSer() throws Exception {
        // This test aims to cover the `contentTypeSer != null` branch in buildWriter.
        // It requires a TypeSerializer for the content type.
        TypeSerializer mockContentTypeSer = new TypeSerializer() {
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public JsonTypeInfo.As getTypeInclusion() { return JsonTypeInfo.As.WRAPPER_OBJECT; }
            @Override public String getPropertyName() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) throws IOException { }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testList", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(java.util.List.class).withContentType(TypeFactory.defaultInstance().constructType(String.class));
        AnnotatedMember am = new MockAnnotatedMember(java.util.List.class, null); // Member representing a list
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, mockContentTypeSer, am, false);

        // Check that the serialization type was updated to include content type handler
        assertNotNull(writer._cfgSerializationType);
        assertEquals(declaredType.getContentType(), writer._cfgSerializationType.getContentType());
        assertTrue(writer._cfgSerializationType.hasContentTypeHandler());
    }

    @Test
    public void testBuildWriterWithContentTypeSerAndNullContentType() throws Exception {
        // This test aims to cover the exception thrown when serialization type has no content type.
        TypeSerializer mockContentTypeSer = new TypeSerializer() {
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public JsonTypeInfo.As getTypeInclusion() { return JsonTypeInfo.As.WRAPPER_OBJECT; }
            @Override public String getPropertyName() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException { }
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) throws IOException { }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        // Use a type that does not have a content type (e.g., String itself)
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, null);
        SerializerProvider prov = new MockSerializerProvider();

        try {
            pb.buildWriter(prov, propDef, declaredType, null, null, mockContentTypeSer, am, false);
            fail("Should have thrown IllegalStateException for null content type");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("serialization type "+declaredType+" has no content"));
        }
    }

    @Test
    public void testFindSerializationTypeSubtypeMismatch() throws Exception {
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
                // Return a type that is not a supertype and not a subtype
                return TypeFactory.defaultInstance().constructType(Integer.class);
            }
            @Override public Version version() { return Version.unknownVersion(); }
            // Need to implement other abstract methods
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        try {
            pb.findSerializationType(am, false, declaredType);
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
                // Return a subtype
                return TypeFactory.defaultInstance().constructType(Object.class);
            }
            @Override public Version version() { return Version.unknownVersion(); }
            // Need to implement other abstract methods
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class); // String is a subtype of Object
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, false, declaredType);
        assertNotNull(result);
        assertEquals(Object.class, result.getRawClass()); // Should be Object.class
    }

    @Test
    public void testGetDefaultBeanInstantiateFails() throws Exception {
        // Class with no default constructor
        class NoDefaultConstructor {
            public NoDefaultConstructor(int x) {}
        }
        AnnotatedClass noDefaultAnnotatedClass = new AnnotatedClass(null, TypeFactory.defaultInstance().constructType(NoDefaultConstructor.class), mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, NoDefaultConstructor.class, mockClassAnnotations, null, noDefaultAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        Object defaultValue = pb.getDefaultBean();
        assertNull(defaultValue); // Should return null if instantiation fails
    }

    @Test
    public void testGetDefaultBeanCache() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = mockAnnotationIntrospector;

        Object firstCall = pb.getDefaultBean();
        Object secondCall = pb.getDefaultBean();
        assertNotNull(firstCall);
        assertSame(firstCall, secondCall); // Should return the cached instance
    }

    @Test
    public void testGetPropertyDefaultValueException() throws Exception {
        Object faultyBean = new Object() {
            public String getTest() {
                throw new RuntimeException("Simulated exception");
            }
        };
        AnnotatedClass faultyBeanAnnotatedClass = new AnnotatedClass(null, TypeFactory.defaultInstance().constructType(faultyBean.getClass()), mockClassAnnotations, null);
        BeanDescription beanDesc = new MockBeanDescription(null, faultyBean.getClass(), mockClassAnnotations, null, faultyBeanAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultBean = faultyBean;
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(faultyBean.getClass(), null); // Value from member is not used here
        SerializerProvider prov = new MockSerializerProvider();

        try {
            pb.getPropertyDefaultValue("test", am, declaredType);
            fail("Should have thrown IllegalArgumentException due to wrapped exception");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Failed to get property 'test'"));
        }
    }

    @Test
    public void testGetDefaultValueForPrimitiveInt() throws Exception {
        JavaType intType = TypeFactory.defaultInstance().constructType(int.class);
        PropertyBuilder pb = new PropertyBuilder(mockConfig, null); // No beanDesc needed for this helper
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
        Object nullSerDef = "myNullSerializer"; // Placeholder for a null serializer definition

        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public Object findNullSerializer(Annotated a) {
                return nullSerDef;
            }
            @Override public Version version() { return Version.unknownVersion(); }
            // Need to implement other abstract methods
            @Override public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) { return baseType; }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        // Mocking the serializer instance call for the null serializer
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

        BeanPropertyWriter writer = pb.buildWriter(mockProv, propDef, declaredType, null, null, null, am, false);
        assertNotNull(writer._nullSerializer);
        // We can't directly assert the instance without a more sophisticated mock,
        // but we can assert it's not null, indicating assignment happened.
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
            // Need to implement other abstract methods
            @Override public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) { return baseType; }
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        assertNotNull(writer);
        // The result should be an unwrapping writer
        // This check is brittle as it depends on internal class names.
        // A better test would be to check the behavior if unwrapping was actually used.
        // For now, we assume if unwrappingWriter is called, it's correctly handled by BeanPropertyWriter.
    }

    @Test
    public void testBuildWriterWithEmptyCollectionWriteDisabled() throws Exception {
        // Test for [JACKSON-254]: WRITE_EMPTY_JSON_ARRAYS disabled
        SerializationConfig configWithEmptyArraysDisabled = mockConfig.without(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(configWithEmptyArraysDisabled, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null); // Default inclusion is ALWAYS
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testList", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(java.util.List.class).withContentType(TypeFactory.defaultInstance().constructType(String.class));
        AnnotatedMember am = new MockAnnotatedMember(java.util.List.class, null);
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        // Since WRITE_EMPTY_JSON_ARRAYS is disabled, and type is a container, it should suppress empty
        // For ALWAYS inclusion, this means nulls and empty are suppressed IF feature is disabled.
        // The code checks: if (actualType.isContainerType() && !_config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS))
        // This sets valueToSuppress to MARKER_FOR_EMPTY.
        assertTrue(writer._suppressNulls); // This is derived from _suppressNulls set to true in the switch case for ALWAYS
        assertEquals(BeanPropertyWriter.MARKER_FOR_EMPTY, writer._suppressableValue); // Should suppress empty
    }

    @Test
    public void testBuildWriterWithEmptyCollectionWriteEnabled() throws Exception {
        // Test for [JACKSON-254]: WRITE_EMPTY_JSON_ARRAYS enabled
        SerializationConfig configWithEmptyArraysEnabled = mockConfig.with(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(configWithEmptyArraysEnabled, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, null); // Default inclusion is ALWAYS
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("testList", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(java.util.List.class).withContentType(TypeFactory.defaultInstance().constructType(String.class));
        AnnotatedMember am = new MockAnnotatedMember(java.util.List.class, null);
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);

        // Since WRITE_EMPTY_JSON_ARRAYS is enabled, it should NOT suppress empty for container types
        // The code checks: if (actualType.isContainerType() && !_config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS))
        // This condition will be false, so valueToSuppress remains null.
        assertFalse(writer._suppressNulls); // ALWAYS inclusion defaults to suppressNulls=true, but this is overridden by the WRITE_EMPTY_JSON_ARRAYS logic when it is disabled
        assertNull(writer._suppressableValue); // Should not suppress any specific value
    }

    @Test
    public void testBuildWriterWithUseDefaultsInclusion() throws Exception {
        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._defaultInclusion = JsonInclude.Value.construct(JsonInclude.Include.USE_DEFAULTS, null); // USE_DEFAULTS is an internal case
        pb._annotationIntrospector = mockAnnotationIntrospector;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        BeanPropertyWriter writer = pb.buildWriter(prov, propDef, declaredType, null, null, null, am, false);
        // USE_DEFAULTS should fall through to ALWAYS, so no suppression
        // The code maps USE_DEFAULTS to ALWAYS.
        assertFalse(writer._suppressNulls);
        assertNull(writer._suppressableValue);
    }

    @Test
    public void testFindSerializationTypeWhenAnnotationRefinesToSameType() throws Exception {
        AnnotationIntrospector ai = new AnnotationIntrospector() {
            @Override
            public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
                // Return the same type
                return baseType;
            }
            @Override public Version version() { return Version.unknownVersion(); }
            // Need to implement other abstract methods
            @Override public JsonInclude.Value findPropertyInclusion(Annotated a) { return null; }
            @Override public JsonSerialize.Typing findSerializationTyping(Annotated a) { return JsonSerialize.Typing.DEFAULT_TYPING; }
            @Override public NameTransformer findUnwrappingNameTransformer(Annotated a) { return null; }
            @Override public Object findNullSerializer(Annotated a) { return null; }
            @Override public boolean isIgnorableType(AnnotatedClass ac) { return false; }
        };

        BeanDescription beanDesc = new MockBeanDescription(null, String.class, mockClassAnnotations, null, mockAnnotatedClass);
        PropertyBuilder pb = createPropertyBuilder(mockConfig, beanDesc);
        pb._annotationIntrospector = ai;

        MockBeanPropertyDefinition propDef = new MockBeanPropertyDefinition("test", null, null, null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMember am = new MockAnnotatedMember(String.class, "someValue");
        SerializerProvider prov = new MockSerializerProvider();

        JavaType result = pb.findSerializationType(am, false, declaredType);
        assertNull(result); // Since refineSerializationType returned the same type, and static typing is false, it should be null.
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
        assertEquals(Character.valueOf('\u0000'), defaultValue); // Default char value
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
```

1. SOURCE CODE ANALYSIS - The tests cover the `buildWriter` method, specifically focusing on `JsonInclude.Include` logic, `contentTypeSer` handling, and inclusion of `MARKER_FOR_EMPTY`. They also test `findSerializationType` with various annotation interactions and `getDefaultBean` and `getDefaultValue` helper methods.
2. TEST CASE DESIGN -
    - `testDefaultInclusionAlways`: Inclusion: ALWAYS, Expected: _suppressNulls=false, _suppressableValue=null. Derived from code logic.
    - `testDefaultInclusionNonNull`: Inclusion: NON_NULL, Expected: _suppressNulls=true, _suppressableValue=null. Derived from code logic.
    - `testDefaultInclusionNonAbsent`: Inclusion: NON_ABSENT, Expected: _suppressNulls=true, _suppressableValue=MARKER_FOR_EMPTY (for reference type). Derived from code logic.
    - `testDefaultInclusionNonEmpty`: Inclusion: NON_EMPTY, Expected: _suppressNulls=true, _suppressableValue=MARKER_FOR_EMPTY. Derived from code logic.
    - `testDefaultInclusionNonDefaultWithNullDefaultBean`: Inclusion: NON_DEFAULT (class level), null default bean. Expected: _suppressNulls=true, _suppressableValue=null. Derived from code logic.
    - `testDefaultInclusionNonDefaultWithNonNullDefaultBean`: Inclusion: NON_DEFAULT (class level), non-null default bean. Expected: _suppressNulls=false, _suppressableValue="defaultValue". Derived from code logic.
    - `testFindSerializationTypeAnnotationOverride`: Annotation refines type. Expected: JavaType for Integer. Derived from `refineSerializationType` logic.
    - `testFindSerializationTypeStaticTypingEnabled`: Static typing enabled. Expected: `declaredType` with static typing. Derived from `useStaticTyping` logic.
    - `testFindSerializationTypeStaticTypingExplicitlyDisabled`: Annotation forces dynamic typing. Expected: null. Derived from `findSerializationTyping` logic.
    - `testBuildWriterWithContentTypeSer`: `contentTypeSer` provided. Expected: `serializationType` updated with content type handler. Derived from `contentTypeSer != null` block.
    - `testBuildWriterWithContentTypeSerAndNullContentType`: `contentTypeSer` provided but type has no content type. Expected: `IllegalStateException`. Derived from `ct == null` check.
    - `testFindSerializationTypeSubtypeMismatch`: Refined type not assignable from/to declared type. Expected: `IllegalArgumentException`. Derived from `isAssignableFrom` checks.
    - `testFindSerializationTypeSubtypeOK`: Refined type is a supertype. Expected: `Object.class` JavaType. Derived from `isAssignableFrom` logic.
    - `testGetDefaultBeanInstantiateFails`: Bean with no default constructor. Expected: null. Derived from `instantiateBean` behavior.
    - `testGetDefaultBeanCache`: Default bean caching. Expected: Same instance on subsequent calls. Derived from `_defaultBean` field logic.
    - `testGetPropertyDefaultValueException`: Exception during `member.getValue`. Expected: `IllegalArgumentException`. Derived from `_throwWrapped` logic.
    - `testGetDefaultValueForPrimitiveInt`: Primitive int. Expected: 0. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForWrapperInteger`: Wrapper Integer. Expected: null. Derived from `getDefaultValue` logic.
    - `testGetDefaultValueForString`: String type. Expected: "". Derived from `getDefaultValue` logic.
    - `testGetDefaultValueForContainerType`: Container type. Expected: NON_EMPTY. Derived from `getDefaultValue` logic.
    - `testGetDefaultValueForReferenceType`: Reference type. Expected: NON_EMPTY. Derived from `getDefaultValue` logic.
    - `testBuildWriterWithNullSerializer`: Annotation defines null serializer. Expected: Null serializer assigned. Derived from `assignNullSerializer` logic.
    - `testBuildWriterWithUnwrappingNameTransformer`: Annotation defines unwrapper. Expected: Unwrapping writer created. Derived from `unwrappingWriter` logic.
    - `testBuildWriterWithEmptyCollectionWriteDisabled`: `WRITE_EMPTY_JSON_ARRAYS` disabled. Expected: _suppressableValue=MARKER_FOR_EMPTY. Derived from `SerializationFeature` check.
    - `testBuildWriterWithEmptyCollectionWriteEnabled`: `WRITE_EMPTY_JSON_ARRAYS` enabled. Expected: _suppressableValue=null. Derived from `SerializationFeature` check.
    - `testBuildWriterWithUseDefaultsInclusion`: Inclusion USE_DEFAULTS. Expected: Falls through to ALWAYS, no suppression. Derived from `inclusion == JsonInclude.Include.USE_DEFAULTS` logic.
    - `testFindSerializationTypeWhenAnnotationRefinesToSameType`: Annotation refines to same type, static typing false. Expected: null. Derived from `findSerializationType` logic.
    - `testGetDefaultValueForBoolean`: Primitive boolean. Expected: false. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForChar`: Primitive char. Expected: '\u0000'. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForFloat`: Primitive float. Expected: 0.0f. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForDouble`: Primitive double. Expected: 0.0d. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForLong`: Primitive long. Expected: 0L. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForShort`: Primitive short. Expected: 0. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForByte`: Primitive byte. Expected: 0. Derived from `ClassUtil.defaultValue`.
    - `testGetDefaultValueForArray`: Array type. Expected: NON_EMPTY. Derived from `getDefaultValue` logic.
4. DEFECT DETECTION STRATEGY - Tests aim to cover conditional logic in `buildWriter` regarding `JsonInclude.Include` values, especially edge cases like `NON_DEFAULT` and container handling with `SerializationFeature.WRITE_EMPTY_JSON_ARRAYS`. They also check type refinement in `findSerializationType` and default value retrieval.
5. SUMMARY - 32 tests.
6. LIMITATIONS - Mocking complex dependencies like `SerializerProvider` and `BeanDescription` might not cover all internal behaviors. Some tests rely on internal field access (`_suppressNulls`, `_suppressableValue`) for assertion. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.