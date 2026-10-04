package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitor; // Added import
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver; // Added import
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory; // Added import
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.type.TypeFactory; // Added import
import com.fasterxml.jackson.databind.cfg.MapperConfig; // Added import
import com.fasterxml.jackson.databind.jsonschema.JsonSchema; // Added import


public class BeanPropertyWriterTest {

    // Helper method to create a basic BeanPropertyWriter for testing
    private BeanPropertyWriter createWriter(String name, JavaType type, AnnotatedMember member) throws Exception {
        // Dummy BeanPropertyDefinition
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override
            public PropertyName getFullName() { return PropertyName.construct(name); }
            @Override
            public PropertyName getSimpleName() { return PropertyName.construct(name); }
            @Override
            public String getName() { return name; }
            @Override
            public boolean isExplicitlyIncluded() { return true; }
            @Override
            public boolean isIgnored() { return false; }
            @Override
            public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override
            public void appendIds(java.util.HashSet<String> ids) { }
            @Override
            public BeanDefinition getPrimaryMember() { return null; } // Not used by BeanPropertyWriter constructor
            @Override
            public String findJavaName() { return name; }
            @Override
            public JavaType getType() { return type; }
            @Override
            public PropertyName getWrapperName() { return null; }
            @Override
            public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override
            public boolean isRequired() { return true; } // Defaulting to required for simplicity
            @Override
            public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override
            public AnnotatedMember getNonConstructorMutator() { return member; }
            @Override
            public AnnotatedMember getMutator() { return member; }
            @Override
            public AnnotatedMember getAccessor() { return member; }
            @Override
            public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override
            public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override
            public Class<?>[] findViews() { return null; }
            @Override
            public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override
            public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override
            public String findNamespace() { return null; }
            @Override
            public boolean couldSerialize() { return true; }
            @Override
            public boolean isInternalField() { return false; }
        };

        // Dummy Annotations
        Annotations contextAnnotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> cls) { return null; }
            @Override
            public int size() { return 0; }
        };

        // Dummy SerializerProvider and JsonSerializer for constructor
        SerializerProvider dummyProvider = new MockSerializerProvider();
        JsonSerializer<Object> dummySerializer = new MockUnknownSerializer();
        TypeSerializer dummyTypeSerializer = null; // Not used in constructor

        return new BeanPropertyWriter(propDef, member, contextAnnotations, type, dummySerializer, dummyTypeSerializer, type, false, null);
    }

    // Mock classes for dependencies
    private static class MockSerializerProvider extends SerializerProvider {
        protected MockSerializerProvider() { super(null, null); }
        @Override public JsonSerializer<Object> findValueSerializer(Class<?> cls, BeanProperty property) throws JsonMappingException { return new MockUnknownSerializer(); }
        @Override public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty property) throws JsonMappingException { return new MockUnknownSerializer(); }
        @Override public boolean isEnabled(SerializationFeature f) { return false; }
        // Needed for _findAndAddDynamic
        public JavaType constructSpecializedType(JavaType baseType, Class<?> specificType) throws JsonMappingException { return baseType; }
        @Override public SchemaAware getSchemaVisitor() { return null; } // Required by SchemaAware interface
        @Override public JsonFormatVisitor expectFormatGrowth(JavaType type) throws JsonMappingException { return null; } // Required by JsonFormatVisitable
        @Override public JsonSchemaFactory getSchemaFactory() { return JsonSchemaFactory.instance; } // Required by SchemaAware
    }
    private static class MockUnknownSerializer extends JsonSerializer<Object> {
        @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException { gen.writeString("unknown"); }
        @Override public boolean isEmpty(SerializerProvider provider, Object value) { return false; }
    }

    // Mock AnnotatedMember - cannot extend final AnnotatedMember directly
    // Instead, we provide a concrete implementation that holds the member.
    private static class TestAnnotatedMember extends AnnotatedMember {
        private final java.lang.reflect.Member _member;
        private final Annotation[] _annotations;
        private final JavaType _type; // Added to provide type information

        protected TestAnnotatedMember(java.lang.reflect.Member member, JavaType type, Annotation... annotations) {
            // Default constructor for AnnotatedMember needs context, which we don't have.
            // Provide nulls for now, as they are not strictly required for our test scenarios.
            super(null, null);
            _member = member;
            _annotations = annotations;
            _type = type;
        }
        @Override public int getAnnotationCount() { return _annotations.length; }
        @Override public <A extends Annotation> A getAnnotation(Class<A> acls) {
            for (Annotation a : _annotations) {
                if (acls.isInstance(a)) return acls.cast(a);
            }
            return null;
        }
        @Override public java.lang.reflect.AnnotatedElement getRawMember() { return null; } // Not strictly needed
        @Override public Class<?> getDeclaringClass() { return _member != null ? _member.getDeclaringClass() : null; }
        @Override public String getFullName() { return null; }
        @Override public Field getField() { return (_member instanceof Field) ? (Field)_member : null; }
        @Override public Method getMethod() { return (_member instanceof Method) ? (Method)_member : null; }
        @Override public boolean isField() { return _member instanceof Field; }
        @Override public boolean isMethod() { return _member instanceof Method; }
        @Override public boolean isContainer() { return false; }
        @Override public JavaType getType() { return _type; } // Return the provided type
        @Override public void setValue(Object obj, Object value) { /* no-op */ }
        @Override public Object getValue(Object obj) throws Exception { return null; } // Not used in this context
        @Override public int getMinNumberOfArguments() { return 0; }
        @Override public int getMaxNumberOfArguments() { return 0; }
        @Override public Object call(Object[] args) throws Exception { return null; } // Not used
        @Override public Object call1(Object arg) throws Exception { return null; } // Not used
        @Override public String getSelfType() { return null; }
        @Override public Type getGenericType() { // For getGenericPropertyType test
            if (_member instanceof Field) return ((Field)_member).getGenericType();
            if (_member instanceof Method) return ((Method)_member).getGenericReturnType();
            return null;
        }
    }

    // Mock Field and Method for AnnotatedMember
    private static class MockField extends Field {
        private final Class<?> _type;
        private final String _name;
        private final Type _genericType;
        MockField(Class<?> type, String name, Type genericType) {
            super(null, null, 0, 0, name, type, null, null, null, null, null); // Mock constructor
            _type = type;
            _name = name;
            _genericType = genericType;
        }
        @Override public Class<?> getType() { return _type; }
        @Override public String getName() { return _name; }
        @Override public Type getGenericType() { return _genericType; }
        @Override public Object get(Object obj) throws IllegalAccessException { return null; } // Default no-op for test
        @Override public boolean equals(Object o) { return false; } // Prevent accidental matches
        @Override public int hashCode() { return 0; }
    }
    private static class MockMethod extends Method {
        private final Class<?> _returnType;
        private final String _name;
        private final Type _genericReturnType;
        MockMethod(Class<?> returnType, String name, Type genericReturnType) {
            super(null, null, name, null, null, null, null, null, null, null, null); // Mock constructor
            _returnType = returnType;
            _name = name;
            _genericReturnType = genericReturnType;
        }
        @Override public Class<?> getReturnType() { return _returnType; }
        @Override public String getName() { return _name; }
        @Override public Type getGenericReturnType() { return _genericReturnType; }
        @Override public Object invoke(Object obj, Object... args) throws IllegalAccessException, java.lang.reflect.InvocationTargetException { return null; } // Default no-op for test
        @Override public boolean equals(Object o) { return false; } // Prevent accidental matches
        @Override public int hashCode() { return 0; }
    }

    @Test
    public void testBeanPropertyWriter_ConstructorAndInitialState() throws Exception {
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };
        AnnotatedMember member = new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null));
        JavaType javaType = TypeFactory.defaultInstance().constructSimpleType(String.class, null);
        Annotations contextAnnotations = new Annotations() {
            @Override public <A extends Annotation> A get(Class<A> cls) { return null; }
            @Override public int size() { return 0; }
        };
        SerializerProvider provider = new MockSerializerProvider();
        JsonSerializer<Object> serializer = new MockUnknownSerializer();

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, contextAnnotations, javaType, serializer, null, javaType, false, null);

        assertNotNull("BeanPropertyWriter should not be null", writer);
        assertEquals("Property name should be set correctly", "testProp", writer.getName());
        assertEquals("Declared type should be String.class", String.class, writer.getType().getRawClass());
        assertTrue("Serializer should be assigned", writer.hasSerializer());
        assertNull("Null serializer should be null initially", writer.getNullSerializer());
        assertFalse("Should not suppress nulls by default", writer.willSuppressNulls());
        assertNull("Wrapper name should be null", writer.getWrapperName());
    }

    @Test
    public void testBeanPropertyWriter_assignSerializer() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(Integer.class, null), new TestAnnotatedMember(new MockMethod(Integer.class, "getVal", Integer.class), TypeFactory.defaultInstance().constructSimpleType(Integer.class, null)));
        assertFalse("Has serializer should be false initially", writer.hasSerializer());
        JsonSerializer<Object> newSerializer = new MockUnknownSerializer();
        writer.assignSerializer(newSerializer);
        assertTrue("Has serializer should be true after assignment", writer.hasSerializer());
        assertEquals("Assigned serializer should be the one set", newSerializer, writer.getSerializer());
    }

    @Test
    public void testBeanPropertyWriter_assignNullSerializer() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(Integer.class, null), new TestAnnotatedMember(new MockMethod(Integer.class, "getVal", Integer.class), TypeFactory.defaultInstance().constructSimpleType(Integer.class, null)));
        assertFalse("Has null serializer should be false initially", writer.hasNullSerializer());
        JsonSerializer<Object> newNullSerializer = new MockUnknownSerializer();
        writer.assignNullSerializer(newNullSerializer);
        assertTrue("Has null serializer should be true after assignment", writer.hasNullSerializer());
        assertEquals("Assigned null serializer should be the one set", newNullSerializer, writer.getNullSerializer());
    }

    @Test
    public void testBeanPropertyWriter_assignTypeSerializer() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(Integer.class, null), new TestAnnotatedMember(new MockMethod(Integer.class, "getVal", Integer.class), TypeFactory.defaultInstance().constructSimpleType(Integer.class, null)));
        assertNull("Type serializer should be null initially", writer.getTypeSerializer());
        TypeSerializer newTypeSerializer = new MockTypeSerializer();
        writer.assignTypeSerializer(newTypeSerializer);
        assertEquals("Assigned type serializer should be the one set", newTypeSerializer, writer.getTypeSerializer());
    }

    @Test
    public void testBeanPropertyWriter_rename_simple() throws Exception {
        BeanPropertyWriter writer = createWriter("oldName", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        NameTransformer transformer = NameTransformer.simpleTransformer("prefix_", "_suffix");
        BeanPropertyWriter renamedWriter = writer.rename(transformer);

        assertNotSame("rename should return a new instance if name changes", writer, renamedWriter);
        assertEquals("Renamed writer should have the new name", "prefix_oldName_suffix", renamedWriter.getName());
        assertEquals("Original writer should remain unchanged", "oldName", writer.getName());
    }

    @Test
    public void testBeanPropertyWriter_rename_noChange() throws Exception {
        BeanPropertyWriter writer = createWriter("name", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        NameTransformer transformer = NameTransformer.simpleTransformer("", ""); // No actual change
        BeanPropertyWriter renamedWriter = writer.rename(transformer);

        if (writer != renamedWriter) {
            assertEquals("Renamed writer should have the same name", "name", renamedWriter.getName());
        }
        assertEquals("Property name should remain unchanged", "name", writer.getName());
    }

    @Test
    public void testBeanPropertyWriter_getAnnotation_present() throws Exception {
        class MockAnnotation implements Annotation {
            @Override public Class<? extends Annotation> annotationType() { return MockAnnotation.class; }
        }
        Annotation mockAnn = new MockAnnotation();
        AnnotatedMember memberWithAnn = new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null), mockAnn);
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), memberWithAnn);

        Annotation found = writer.getAnnotation(MockAnnotation.class);
        assertNotNull("Annotation should be found", found);
        assertEquals("Found annotation should be the mock annotation", mockAnn, found);
    }

    @Test
    public void testBeanPropertyWriter_getAnnotation_absent() throws Exception {
        AnnotatedMember memberWithoutAnn = new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null));
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), memberWithoutAnn);

        Annotation found = writer.getAnnotation(JsonFormat.class);
        assertNull("Annotation should not be found", found);
    }

    @Test
    public void testBeanPropertyWriter_getContextAnnotation_present() throws Exception {
        class MockContextAnnotation implements Annotation {
            @Override public Class<? extends Annotation> annotationType() { return MockContextAnnotation.class; }
        }
        Annotation mockAnn = new MockContextAnnotation();
        Annotations contextAnnotations = new Annotations() {
            @Override public <A extends Annotation> A get(Class<A> cls) {
                if (cls.equals(MockContextAnnotation.class)) {
                    return cls.cast(mockAnn);
                }
                return null;
            }
            @Override public int size() { return 1; }
        };

        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };
        JavaType javaType = TypeFactory.defaultInstance().constructSimpleType(String.class, null);
        AnnotatedMember member = new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), javaType);

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, contextAnnotations, javaType, null, null, javaType, false, null);

        Annotation found = writer.getContextAnnotation(MockContextAnnotation.class);
        assertNotNull("Context annotation should be found", found);
        assertEquals("Found context annotation should be the mock annotation", mockAnn, found);
    }

    @Test
    public void testBeanPropertyWriter_getContextAnnotation_absent() throws Exception {
        Annotations contextAnnotations = new Annotations() {
            @Override public <A extends Annotation> A get(Class<A> cls) { return null; }
            @Override public int size() { return 0; }
        };
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };
        JavaType javaType = TypeFactory.defaultInstance().constructSimpleType(String.class, null);
        AnnotatedMember member = new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), javaType);

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, contextAnnotations, javaType, null, null, javaType, false, null);

        Annotation found = writer.getContextAnnotation(JsonFormat.class);
        assertNull("Context annotation should not be found", found);
    }

    @Test
    public void testBeanPropertyWriter_getInternalSetting_and_setInternalSetting() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        Object key = "myKey";
        Object value = "myValue";
        assertNull("Internal setting should be null initially", writer.getInternalSetting(key));

        writer.setInternalSetting(key, value);
        assertEquals("Internal setting should be set", value, writer.getInternalSetting(key));

        Object newValue = "newValue";
        writer.setInternalSetting(key, newValue);
        assertEquals("Internal setting should be updated", newValue, writer.getInternalSetting(key));
    }

    @Test
    public void testBeanPropertyWriter_removeInternalSetting() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        Object key = "myKey";
        Object value = "myValue";
        writer.setInternalSetting(key, value);
        assertEquals("Setting should be present", value, writer.getInternalSetting(key));

        Object removedValue = writer.removeInternalSetting(key);
        assertEquals("Removed value should match set value", value, removedValue);
        assertNull("Setting should be removed", writer.getInternalSetting(key));
        assertNull("Removing non-existent setting should return null", writer.removeInternalSetting("nonExistentKey"));
    }

    @Test
    public void testBeanPropertyWriter_getSerializedName() throws Exception {
        BeanPropertyWriter writer = createWriter("customName", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        SerializableString serializedName = writer.getSerializedName();
        assertNotNull("Serialized name should not be null", serializedName);
        assertEquals("Serialized name value should match property name", "customName", serializedName.getValue());
    }

    @Test
    public void testBeanPropertyWriter_willSuppressNulls() throws Exception {
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writerSuppressNulls = new BeanPropertyWriter(propDef, propDef.getAccessor(), null, null, null, null, null, true, null);
        assertTrue("Will suppress nulls should be true when configured", writerSuppressNulls.willSuppressNulls());

        BeanPropertyWriter writerNoSuppressNulls = new BeanPropertyWriter(propDef, propDef.getAccessor(), null, null, null, null, null, false, null);
        assertFalse("Will suppress nulls should be false when configured", writerNoSuppressNulls.willSuppressNulls());
    }

    @Test
    public void testBeanPropertyWriter_wouldConflictWithName_wrapperNamePresent() throws Exception {
        BeanPropertyDefinition propDefWithWrapper = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("prop"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("prop"); }
            @Override public String getName() { return "prop"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return PropertyName.construct("wrapped"); }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "prop"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writerWithWrapper = new BeanPropertyWriter(propDefWithWrapper, propDefWithWrapper.getAccessor(), null, propDefWithWrapper.getType(), null, null, propDefWithWrapper.getType(), false, null);

        assertTrue("Should conflict with wrapper name", writerWithWrapper.wouldConflictWithName(PropertyName.construct("wrapped")));
        assertFalse("Should not conflict with property name if wrapper name exists", writerWithWrapper.wouldConflictWithName(PropertyName.construct("prop")));
    }

    @Test
    public void testBeanPropertyWriter_wouldConflictWithName_noWrapperName() throws Exception {
        BeanPropertyWriter writer = createWriter("prop", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));

        assertFalse("Should not conflict with a different name", writer.wouldConflictWithName(PropertyName.construct("otherName")));
        assertTrue("Should conflict with its own name", writer.wouldConflictWithName(PropertyName.construct("prop")));
        assertFalse("Should not conflict with a namespaced name if it's not namespaced", writer.wouldConflictWithName(PropertyName.construct("http://example.com", "prop")));
    }

    @Test
    public void testBeanPropertyWriter_get_fromField() throws Exception {
        Field testField = new MockField(String.class, "testField", String.class);
        AnnotatedMember annotatedField = new TestAnnotatedMember(testField, TypeFactory.defaultInstance().constructSimpleType(String.class, null));

        class DummyBean {
            public String testField = "fieldValue";
        }
        DummyBean bean = new DummyBean();

        BeanPropertyDefinition propDefField = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testField"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testField"); }
            @Override public String getName() { return "testField"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return annotatedField; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testField"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDefField, annotatedField, null, TypeFactory.defaultInstance().constructSimpleType(String.class, null), null, null, null, false, null);

        try {
            testField.setAccessible(true); // Make field accessible for the mock get()
            Object value = writer.get(bean);
            assertEquals("Value from field should be retrieved", "fieldValue", value);
        } catch (Exception e) {
            fail("Failed to get value from field: " + e.getMessage());
        }
    }

    @Test
    public void testBeanPropertyWriter_get_fromMethod() throws Exception {
        Method testMethod = new MockMethod(String.class, "getTestValue", String.class);
        AnnotatedMember annotatedMethod = new TestAnnotatedMember(testMethod, TypeFactory.defaultInstance().constructSimpleType(String.class, null));

        class DummyBean {
            public String getTestValue() { return "methodValue"; }
        }
        DummyBean bean = new DummyBean();

        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return annotatedMethod; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedMethod, null, null, null, null, null, false, null);

        try {
            Object value = writer.get(bean);
            assertEquals("Value from method should be retrieved", "methodValue", value);
        } catch (Exception e) {
            fail("Failed to get value from method: " + e.getMessage());
        }
    }

    @Test
    public void testBeanPropertyWriter_unwrappingWriter() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        NameTransformer transformer = NameTransformer.simpleTransformer("prefix_", "_suffix");
        BeanPropertyWriter unwrapping = writer.unwrappingWriter(transformer);

        assertNotNull("Unwrapping writer should be created", unwrapping);
        assertEquals("Name should be preserved for unwrapping writer", "test", unwrapping.getName());
    }

    @Test
    public void testBeanPropertyWriter_setNonTrivialBaseType() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        assertNull("Non-trivial base type should be null initially", writer._nonTrivialBaseType); // Accessing protected field for test

        JavaType baseType = TypeFactory.defaultInstance().constructParametricType(java.util.List.class, String.class);
        writer.setNonTrivialBaseType(baseType);
        assertNotNull("Non-trivial base type should be set", writer._nonTrivialBaseType);
        assertEquals("Non-trivial base type should be set correctly", baseType, writer._nonTrivialBaseType);
    }

    @Test
    public void testBeanPropertyWriter_getSerializationType() throws Exception {
        JavaType expectedType = TypeFactory.defaultInstance().constructSimpleType(Integer.class, null);
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return expectedType; }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(Integer.class, "getValue", Integer.class), TypeFactory.defaultInstance().constructSimpleType(Integer.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        JsonSerializer<Object> mockSerializer = new MockUnknownSerializer();
        JavaType cfgSerializationType = TypeFactory.defaultInstance().constructSimpleType(Long.class, null);

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, propDef.getAccessor(), null, propDef.getType(), mockSerializer, null, cfgSerializationType, false, null);

        assertEquals("Serialization type should match configured type", cfgSerializationType, writer.getSerializationType());
    }

    @Test
    public void testBeanPropertyWriter_getRawSerializationType() throws Exception {
        JavaType serializationType = TypeFactory.defaultInstance().constructSimpleType(Long.class, null);
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, propDef.getAccessor(), null, null, null, null, serializationType, false, null);

        assertNotNull("Raw serialization type should not be null", writer.getRawSerializationType());
        assertEquals("Raw serialization type should be Long.class", Long.class, writer.getRawSerializationType());
    }

    @Test
    public void testBeanPropertyWriter_getPropertyType_fromField() throws Exception {
        Field testField = new MockField(Integer.class, "intField", Integer.class);
        AnnotatedMember annotatedField = new TestAnnotatedMember(testField, TypeFactory.defaultInstance().constructSimpleType(Integer.class, null));
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("intField"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("intField"); }
            @Override public String getName() { return "intField"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(Integer.class, null); }
            @Override public AnnotatedMember getAccessor() { return annotatedField; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "intField"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedField, null, null, null, null, null, false, null);
        assertEquals("Property type should be Integer.class for field", Integer.class, writer.getPropertyType());
    }

    @Test
    public void testBeanPropertyWriter_getPropertyType_fromMethod() throws Exception {
        Method testMethod = new MockMethod(Boolean.class, "isBool", Boolean.class);
        AnnotatedMember annotatedMethod = new TestAnnotatedMember(testMethod, TypeFactory.defaultInstance().constructSimpleType(Boolean.class, null));
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("isBool"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("isBool"); }
            @Override public String getName() { return "isBool"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(Boolean.class, null); }
            @Override public AnnotatedMember getAccessor() { return annotatedMethod; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "isBool"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedMethod, null, null, null, null, null, false, null);
        assertEquals("Property type should be Boolean.class for method", Boolean.class, writer.getPropertyType());
    }

    @Test
    public void testBeanPropertyWriter_getGenericPropertyType_fromMethod() throws Exception {
        Type genericType = new com.fasterxml.jackson.databind.type.SimpleType(java.util.List.class, null, null, null, null, false); // Mock generic type
        Method testMethod = new MockMethod(java.util.List.class, "getList", genericType);
        AnnotatedMember annotatedMethod = new TestAnnotatedMember(testMethod, TypeFactory.defaultInstance().constructParametricType(java.util.List.class, String.class));
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("getList"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("getList"); }
            @Override public String getName() { return "getList"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructParametricType(java.util.List.class, String.class); }
            @Override public AnnotatedMember getAccessor() { return annotatedMethod; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "getList"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedMethod, null, null, null, null, null, false, null);
        Type returnedGenericType = writer.getGenericPropertyType();
        assertNotNull("Generic property type should not be null", returnedGenericType);
        assertEquals("Generic property type should match mock method's generic return type", genericType, returnedGenericType);
    }

    @Test
    public void testBeanPropertyWriter_getGenericPropertyType_fromField() throws Exception {
        Type genericType = new com.fasterxml.jackson.databind.type.SimpleType(java.util.Map.class, null, null, new JavaType[]{ TypeFactory.defaultInstance().constructSimpleType(String.class, null), TypeFactory.defaultInstance().constructSimpleType(Integer.class, null) }, null, false); // Mock generic type
        Field testField = new MockField(java.util.Map.class, "mapField", genericType);
        AnnotatedMember annotatedField = new TestAnnotatedMember(testField, TypeFactory.defaultInstance().constructParametricType(java.util.Map.class, String.class, Integer.class));
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("mapField"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("mapField"); }
            @Override public String getName() { return "mapField"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructParametricType(java.util.Map.class, String.class, Integer.class); }
            @Override public AnnotatedMember getAccessor() { return annotatedField; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "mapField"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedField, null, null, null, null, null, false, null);
        Type returnedGenericType = writer.getGenericPropertyType();
        assertNotNull("Generic property type should not be null", returnedGenericType);
        assertEquals("Generic property type should match mock field's generic type", genericType, returnedGenericType);
    }

    @Test
    public void testBeanPropertyWriter_getViews() throws Exception {
        Class<?>[] expectedViews = new Class<?>[] { Object.class, Integer.class };
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public Class<?>[] findViews() { return expectedViews; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, propDef.getAccessor(), null, null, null, null, null, false, null);
        Class<?>[] views = writer.getViews();
        assertNotNull("Views array should not be null", views);
        assertEquals("Should have the correct number of views", expectedViews.length, views.length);
        assertArrayEquals("Views array should match expected views", expectedViews, views);
    }

    // Mock implementation of TypeSerializer for testing
    private static class MockTypeSerializer extends TypeSerializer {
        @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
        @Override public JsonTypeInfo.As getTypeInclusion() { return JsonTypeInfo.As.PROPERTY; }
        @Override public String getPropertyName() { return "type"; }
        @Override public TypeIdResolver getTypeIdResolver() { return null; }
        @Override public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) throws IOException { }
        @Override public void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException { }
        @Override public void writeTypePrefixForArray(Object value, JsonGenerator jgen) throws IOException { }
        @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) throws IOException { }
        @Override public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException { }
        @Override public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) throws IOException { }
    }

    // Mock implementation of JsonObjectFormatVisitor for testing
    private static class MockJsonObjectFormatVisitor implements JsonObjectFormatVisitor {
        public BeanPropertyWriter lastVisitedProperty = null;
        @Override public void property(BeanProperty writer) throws JsonMappingException {
            if (writer instanceof BeanPropertyWriter) {
                this.lastVisitedProperty = (BeanPropertyWriter) writer;
            }
        }
        @Override public void optionalProperty(BeanProperty writer) throws JsonMappingException {
            if (writer instanceof BeanPropertyWriter) {
                this.lastVisitedProperty = (BeanPropertyWriter) writer;
            }
        }
        @Override public void keyFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable f, JavaType type) {}
        @Override public void valueFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable f, JavaType type) {}
        @Override public void propertyFormat(BeanProperty writer) {}
        @Override public void optionalPropertyFormat(BeanProperty writer) {}
        @Override public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable getSchemaVisitor() { return null; }
        @Override public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable getArrayVisitor() { return null; }
        @Override public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable getObjectVisitor() { return null; }
        @Override public com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable getMapVisitor() { return null; }
        @Override public JsonObjectFormatVisitor object() { return this; }
        @Override public JsonObjectFormatVisitor array() { return this; }
        @Override public JsonObjectFormatVisitor map() { return this; }
    }

    @Test
    public void testBeanPropertyWriter_depositSchemaProperty_required() throws Exception {
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.with(true, null, null); }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, propDef.getAccessor(), null, null, null, null, null, false, null);
        MockJsonObjectFormatVisitor visitor = new MockJsonObjectFormatVisitor();
        writer.depositSchemaProperty(visitor);

        assertNotNull("Last visited property should not be null", visitor.lastVisitedProperty);
        assertEquals("Visitor should have received the required property", writer, visitor.lastVisitedProperty);
    }

    @Test
    public void testBeanPropertyWriter_depositSchemaProperty_optional() throws Exception {
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return false; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.with(false, null, null); }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, propDef.getAccessor(), null, null, null, null, null, false, null);
        MockJsonObjectFormatVisitor visitor = new MockJsonObjectFormatVisitor();
        writer.depositSchemaProperty(visitor);

        assertNotNull("Last visited property should not be null", visitor.lastVisitedProperty);
        assertEquals("Visitor should have received the optional property", writer, visitor.lastVisitedProperty);
    }

    @Test
    public void testBeanPropertyWriter_toString_methodBased() throws Exception {
        Method testMethod = new MockMethod(String.class, "getValue", String.class);
        AnnotatedMember annotatedMethod = new TestAnnotatedMember(testMethod, TypeFactory.defaultInstance().constructSimpleType(String.class, null));
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return annotatedMethod; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedMethod, null, null, new MockUnknownSerializer(), null, null, false, null);
        String toString = writer.toString();
        assertTrue("toString should contain property name", toString.contains("property 'testProp'"));
        assertTrue("toString should indicate method access", toString.contains("via method"));
        assertTrue("toString should indicate serializer class", toString.contains("static serializer of type com.fasterxml.jackson.databind.ser.BeanPropertyWriterTest$MockUnknownSerializer"));
    }

    @Test
    public void testBeanPropertyWriter_toString_fieldBased() throws Exception {
        Field testField = new MockField(String.class, "testField", String.class);
        AnnotatedMember annotatedField = new TestAnnotatedMember(testField, TypeFactory.defaultInstance().constructSimpleType(String.class, null));
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override public PropertyName getFullName() { return PropertyName.construct("testField"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testField"); }
            @Override public String getName() { return "testField"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return annotatedField; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testField"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, annotatedField, null, null, new MockUnknownSerializer(), null, null, false, null);
        String toString = writer.toString();
        assertTrue("toString should contain property name", toString.contains("property 'testField'"));
        assertTrue("toString should indicate field access", toString.contains("field \""));
        assertTrue("toString should indicate serializer class", toString.contains("static serializer of type com.fasterxml.jackson.databind.ser.BeanPropertyWriterTest$MockUnknownSerializer"));
    }

    // --- Tests for methods not covered by previous answer ---

    @Test
    public void testBeanPropertyWriter_findFormatOverrides_nullIntrospector() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        JsonFormat.Value format = writer.findFormatOverrides(null); // Pass null introspector
        assertNull("Should return null if introspector is null", format);
    }

    @Test
    public void testBeanPropertyWriter_findFormatOverrides_noMember() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), null); // Member is null
        JsonFormat.Value format = writer.findFormatOverrides(new MockAnnotationIntrospector());
        assertNull("Should return null if member is null", format);
    }

    @Test
    public void testBeanPropertyWriter_findFormatOverrides_found() throws Exception {
        AnnotationIntrospector ai = new MockAnnotationIntrospector();
        JsonFormat.Value expectedFormat = new JsonFormat.Value();
        AnnotatedMember member = new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)) {
            @Override public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; } // Ensure no annotation interferes
        };

        BeanPropertyWriter writer = new BeanPropertyWriter(new BeanPropertyDefinition() { // Minimal for constructor
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return true; }
            @Override public JavaType getType() { return TypeFactory.defaultInstance().constructSimpleType(String.class, null); }
            @Override public AnnotatedMember getAccessor() { return member; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return ai; } // Provide the mock AI
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return expectedFormat; } // Return expected format
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        }, member, null, TypeFactory.defaultInstance().constructSimpleType(String.class, null), null, null, null, false, null);

        JsonFormat.Value format = writer.findFormatOverrides(ai);
        assertNotNull("Should return format if found", format);
        assertEquals("Format should be the one returned by introspector", expectedFormat, format);
    }

    @Test
    public void testBeanPropertyWriter_isVirtual() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        assertFalse("isVirtual should return false by default", writer.isVirtual());
    }

    @Test
    public void testBeanPropertyWriter_serializeAsOmittedField_noOmit() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        MockJsonGenerator gen = new MockJsonGenerator();
        MockSerializerProvider prov = new MockSerializerProvider();
        writer.serializeAsOmittedField(new Object(), gen, prov);
        assertFalse("Should not write omitted field if canOmitFields is false", gen.hasWrittenOmittedField());
    }

    @Test
    public void testBeanPropertyWriter_serializeAsOmittedField_canOmit() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        MockJsonGenerator gen = new MockJsonGenerator() {
            @Override public boolean canOmitFields() { return true; }
        };
        MockSerializerProvider prov = new MockSerializerProvider();
        writer.serializeAsOmittedField(new Object(), gen, prov);
        assertTrue("Should write omitted field if canOmitFields is true", gen.hasWrittenOmittedField());
        assertEquals("Omitted field name should be correct", "test", gen.getOmittedFieldName());
    }

    // Helper for serializeAsPlaceholder
    private static class MockJsonGenerator extends JsonGenerator {
        private String writtenFieldName = null;
        private String omittedFieldName = null;
        private boolean wroteNull = false;

        @Override public void writeFieldName(String name) throws IOException { this.writtenFieldName = name; }
        @Override public void writeFieldName(SerializableString name) throws IOException { this.writtenFieldName = name.getValue(); }
        @Override public void writeOmittedField(String name) throws IOException { this.omittedFieldName = name; }
        @Override public void writeNull() throws IOException { this.wroteNull = true; }

        // Mock implementations for other abstract methods
        @Override public void writeString(String text) throws IOException {}
        @Override public void writeString(SerializableString text) throws IOException {}
        @Override public void writeRaw(String text) throws IOException {}
        @Override public void writeRaw(SerializableString text) throws IOException {}
        @Override public void writeRaw(char[] cbuf, int offset, int len) throws IOException {}
        @Override public void writeBinary(byte[] data, int offset, int len) throws IOException {}
        @Override public void writeNumber(String encodedNumber) throws IOException {}
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeStartObject(Object forValue) throws IOException { writeStartObject(); }
        @Override public void writeStartArray(Object forValue) throws IOException { writeStartArray(); }
        @Override public void writeObjectRef(String reference) throws IOException {}
        @Override public void writeTypeId(Object value) throws IOException {}
        @Override public void writeRawValue(String raw) throws IOException {}
        @Override public void writeRawValue(char[] cbuf, int offset, int len) throws IOException {}
        @Override public void writeRawValue(SerializableString raw) throws IOException {}
        @Override public void flush() throws IOException {}
        @Override public void close() throws IOException {}
        @Override public boolean isClosed() { return false; }
        @Override public JsonGenerator enable(Feature f) { return this; }
        @Override public JsonGenerator disable(Feature f) { return this; }
        @Override public boolean isEnabled(Feature f) { return false; }
        @Override public JsonGenerator.Feature[] getFeaturesAsArray() { return new JsonGenerator.Feature[0]; }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public void setPrettyPrinter(com.fasterxml.jackson.core.PrettyPrinter pp) {}
        @Override public com.fasterxml.jackson.core.Version version() { return null; }

        public boolean hasWrittenOmittedField() { return omittedFieldName != null; }
        public String getOmittedFieldName() { return omittedFieldName; }
        public boolean hasWrittenNull() { return wroteNull; }
    }

    @Test
    public void testBeanPropertyWriter_serializeAsPlaceholder_withNullSerializer() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        writer.assignNullSerializer(new MockUnknownSerializer()); // Assign a null serializer

        MockJsonGenerator gen = new MockJsonGenerator();
        MockSerializerProvider prov = new MockSerializerProvider();
        writer.serializeAsPlaceholder(new Object(), gen, prov);

        // The MockUnknownSerializer writes "unknown" and doesn't call gen.writeNull().
        // We need to check if the null serializer was *attempted* to be called.
        // The implementation of serializeAsPlaceholder calls _nullSerializer.serialize.
        // If _nullSerializer is not null, it should be invoked.
        // The test for writeNull() on gen is a proxy for the null serializer being invoked.
        assertTrue("Null serializer should have been called (indicated by gen.writeNull)", gen.hasWrittenNull());
    }

    @Test
    public void testBeanPropertyWriter_serializeAsPlaceholder_withoutNullSerializer() throws Exception {
        BeanPropertyWriter writer = createWriter("test", TypeFactory.defaultInstance().constructSimpleType(String.class, null), new TestAnnotatedMember(new MockMethod(String.class, "getVal", String.class), TypeFactory.defaultInstance().constructSimpleType(String.class, null)));
        // No null serializer assigned

        MockJsonGenerator gen = new MockJsonGenerator();
        MockSerializerProvider prov = new MockSerializerProvider();
        writer.serializeAsPlaceholder(new Object(), gen, prov);

        assertTrue("Should write null if no null serializer", gen.hasWrittenNull());
    }

    // Mock for AnnotationIntrospector for findFormatOverrides
    private static class MockAnnotationIntrospector extends AnnotationIntrospector {
        @Override
        public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.introspect.Annotated m) {
            if (m instanceof AnnotatedMember) {
                AnnotatedMember am = (AnnotatedMember) m;
                // Check for a specific annotation type if needed, or just return a default
                return new JsonFormat.Value(); // Returning a non-null value
            }
            return null;
        }
    }

    // Mock implementations for depositSchemaProperty
    static class MockSchemaAwareSerializer extends MockUnknownSerializer implements SchemaAware {
        @Override public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException { return JsonSchema.getDefaultSchemaNode(); }
        @Override public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) throws JsonMappingException { return JsonSchema.getDefaultSchemaNode(); }
    }

    @Test
    public void testBeanPropertyWriter_depositSchemaProperty_legacy() throws Exception {
        JavaType javaType = TypeFactory.defaultInstance().constructSimpleType(String.class, null);
        AnnotatedMember member = new TestAnnotatedMember(new MockMethod(String.class, "getValue", String.class), javaType);
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() { // Minimal for constructor
            @Override public PropertyName getFullName() { return PropertyName.construct("testProp"); }
            @Override public PropertyName getSimpleName() { return PropertyName.construct("testProp"); }
            @Override public String getName() { return "testProp"; }
            @Override public boolean isRequired() { return false; } // Make it optional for variety
            @Override public JavaType getType() { return javaType; }
            @Override public AnnotatedMember getAccessor() { return member; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.with(false, null, null); }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public boolean isExplicitlyIncluded() { return true; }
            @Override public boolean isIgnored() { return false; }
            @Override public boolean isIgnored(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return false; }
            @Override public void appendIds(java.util.HashSet<String> ids) {}
            @Override public BeanDefinition getPrimaryMember() { return null; }
            @Override public String findJavaName() { return "testProp"; }
            @Override public JavaType getContainerType(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotatedMember getNonConstructorMutator() { return getAccessor(); }
            @Override public AnnotatedMember getMutator() { return getAccessor(); }
            @Override public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public JsonFormat.Value findFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public JsonInclude.Value findInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config) { return null; }
            @Override public String findNamespace() { return null; }
            @Override public boolean couldSerialize() { return true; }
            @Override public boolean isInternalField() { return false; }
        };
        
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, null, javaType, null, null, javaType, false, null);
        // Assign a SchemaAware serializer
        writer.assignSerializer(new MockSchemaAwareSerializer());

        MockSerializerProvider provider = new MockSerializerProvider() {
            @Override public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty property) {
                return new MockSchemaAwareSerializer(); // Ensure we get a SchemaAware serializer
            }
            @Override public boolean isEnabled(SerializationFeature f) { return false; } // Disable features that might interfere
        };

        // Using the deprecated method for this test
        ObjectNode propertiesNode = JsonNodeFactory.instance.objectNode();
        writer.depositSchemaProperty(propertiesNode, provider);

        assertNotNull("Properties node should contain the property", propertiesNode.get("testProp"));
        // We expect the default schema node since MockSchemaAwareSerializer returns it.
        assertNotNull("Schema node should not be null", propertiesNode.get("testProp"));
    }
}
