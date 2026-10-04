```java
package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.TypeResolution;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitor;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.StdConverter;

// Dummy implementations for required interfaces/classes
class PropertyDefinitionStub extends BeanPropertyDefinition {
    private final String _name;
    private final PropertyName _propertyName;
    private final boolean _required;
    private final Class<?>[] _views;

    public PropertyDefinitionStub(String name) {
        this(name, false, null, null);
    }

    public PropertyDefinitionStub(String name, boolean required, Class<?>[] views, PropertyName wrapperName) {
        _name = name;
        _propertyName = new PropertyName(name);
        _required = required;
        _views = views;
    }

    @Override public String getName() { return _name; }
    @Override public PropertyName getPropertyName() { return _propertyName; }
    @Override public boolean isRequired() { return _required; }
    @Override public Class<?>[] findViews() { return _views; }
    @Override public PropertyName getWrapperName() { return null; } // Simplified
    @Override public AnnotatedMember getPrimaryMember() { return null; }
    @Override public boolean isExplicitlyIncluded() { return false; }
    @Override public void addField(String name, JavaType type) { throw new UnsupportedOperationException(); }
    @Override public String getInternalName() { return _name; }
    @Override public JavaType getType() { return null; }
    @Override public void setNonTrivialBaseType(JavaType t) { throw new UnsupportedOperationException(); }
    @Override public JavaType getNonTrivialBaseType() { return null; }
    @Override public AnnotatedMember getAccessor() { return null; }
    @Override public AnnotatedMethod getMutator() { return null; }
    @Override public AnnotatedMember getBackReference() { return null; }
    @Override public boolean couldDeserialize() { return false; }
    @Override public boolean couldSerialize() { return false; }
    @Override public String getSimpleMetadata() { return null; }
    @Override public boolean hasField(Field f) { return false; }
    @Override public boolean hasGetter(Method m) { return false; }
    @Override public boolean hasSetter(Method m) { return false; }
    @Override public void depositSchemaProperty(JsonObjectFormatVisitor visitor) throws JsonMappingException { throw new UnsupportedOperationException(); }
    @Override public String getDevDesc() { return null; }
    @Override public boolean isIgnored() { return false; }
    @Override public boolean isVirtual() { return false; }
    @Override public boolean isInternalField() { return false; }
    @Override public String findNewName() { return null; }
    @Override public AnnotationMap getConstructorParameter() { return null; }
    @Override public AnnotationMap getClassAnnotations() { return null; }
    @Override public AnnotationMap getField() { return null; }
    @Override public AnnotationMap getGetter() { return null; }
    @Override public AnnotationMap getSetter() { return null; }
    @Override public String toString() { return "stub:"+_name; }
}

class AnnotationsStub implements Annotations {
    private final Annotation _annotation;
    public AnnotationsStub(Annotation annotation) { _annotation = annotation; }
    @Override public <A extends Annotation> A get(Class<A> acls) { return (A)_annotation; }
    @Override public int size() { return (_annotation == null) ? 0 : 1; }
}

// Minimal implementations for SerializerProvider and related types
abstract class MockSerializerProvider extends SerializerProvider {
    protected MockSerializerProvider(SerializerFactory sf, com.fasterxml.jackson.databind.type.TypeFactory tf) {
        super(sf, tf);
    }
    protected MockSerializerProvider(SerializerProvider src) {
        super(src);
    }

    // Abstract methods to implement
    @Override public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty property) throws JsonMappingException {
        // For simplicity, return null or a default serializer if needed.
        // For tests involving dynamic serializer lookup, more sophisticated mocking might be required.
        if (type != null && type.isTypeOrSubTypeOf(String.class)) {
            return (JsonSerializer<Object>) new StdScalarSerializer<Object>(Object.class){};
        }
        return null;
    }

    @Override public JsonSerializer<Object> findValueSerializer(Class<?> cls, BeanProperty property) throws JsonMappingException {
        return findValueSerializer(getTypeFactory().constructType(cls), property);
    }

    @Override public JsonSerializer<Object> findTreeDeserializer(JavaType type, BeanProperty property) { return null; }
    @Override public JsonSerializer<Object> findRootValueDeserializer(JavaType type) { return null; }
    @Override public BeanDeserializer findBeanDeserializer(JavaType type, AnnotatedClass ac) { return null; }
    @Override public BeanDeserializer findBeanDeserializer(JavaType type, AnnotatedClass ac, BeanProperty property) { return null; }
    @Override public KeyDeserializer findKeyDeserializer(JavaType keyType, BeanProperty property) { return null; }
    @Override public ValueInstantiator findValueInstantiator(JavaType type, BeanProperty property) { return null; }
    @Override public TypeDeserializer findTypeDeserializer(JavaType type, BeanProperty property) { return null; }
    @Override public NullValue findNullValue(BeanProperty property) { return null; }
    @Override public JsonDeserializer<?> findDefaultDeserializer(JavaType type) { return null; }
    @Override public Converter<Object, Object> findConverter(AnnotatedMember m, JavaType targetType) { return null; }
    @Override public Converter<Object, Object> findConverter(AnnotatedClass ac, JavaType targetType) { return null; }
    @Override public Converter<Object, Object> findContentConverter(AnnotatedMember m) { return null; }
    @Override public Converter<Object, Object> findContentConverter(AnnotatedClass ac) { return null; }
    @Override public Converter<Object, Object> findValueConverter(AnnotatedMember m) { return null; }
    @Override public Converter<Object, Object> findValueConverter(AnnotatedClass ac) { return null; }
    @Override public Converter<Object, Object> findKeyConverter(AnnotatedMember m) { return null; }
    @Override public Converter<Object, Object> findKeyConverter(AnnotatedClass ac) { return null; }
    @Override public JsonFormatVisitable findFormatVisitable(Object o) { return null; }
    @Override public JsonFormatVisitor findFormatVisitor(JavaType type, BeanProperty property) { return null; }
    @Override public BeanSerializerFactory getSerializerFactory() { return null; }
    @Override public SerializerProvider getSerializerProvider() { return this; }
    @Override public MapperConfig<?> getMapperConfig() { return null; }
    @Override public FilterProvider getFilterProvider() { return null; }
    @Override public Object findInjectableValue(Object key, BeanProperty forProperty) throws JsonMappingException { return null; }

    // Other methods to override or provide default implementations
    @Override public boolean isEnabled(SerializationFeature feature) { return false; }
    @Override public Object getAttribute(Object key) { return null; }
    @Override public void serializeValue(JsonGenerator jgen, Object value) throws IOException { }
    @Override public void defaultSerializeValue(Object value, JsonGenerator jgen) throws IOException { }
    @Override public void defaultSerializeDateValue(java.util.Date date, JsonGenerator jgen) throws IOException { }
    @Override public void defaultSerializeObjectValue(Object obj, JsonGenerator jgen) throws IOException { }
    @Override public ObjectNode createObjectNode() { return null; }
    @Override public ObjectNode createArrayNode() { return null; }
    @Override public boolean hasSerializerFor(Object value) { return false; }
    @Override public JavaType constructType(Type javaType) { return null; }
    @Override public JavaType constructType(Type javaType, TypeBindings bindings) { return TypeFactory.defaultInstance().constructType(javaType); } // Use default
    @Override public JavaType constructFromCanonical(String canonical) throws IllegalArgumentException { return null; }
    @Override public JavaType constructFromCanonical(String canonical, TypeBindings bindings) throws IllegalArgumentException { return null; }
    @Override public JavaType constructParametricType(Class<?> rawType, JavaType... params) { return null; }
    @Override public JavaType constructParametricType(Class<?> rawType, List<JavaType> params) { return null; }
    @Override public JavaType constructBasicType(Class<?> basicClass) { return TypeFactory.defaultInstance().constructType(basicClass); } // Use default
    @Override public JavaType constructReferenceType(Class<?> refType) { return null; }
    @Override public JavaType constructReferenceType(Class<?> refType, TypeBindings bindings) { return null; }
    @Override public JavaType constructSpecializedType(JavaType baseType, Class<?> specClass) throws JsonMappingException { return baseType; }
    @Override public JavaType constructGeneralizedType(JavaType specificType, Class<?> generalizedSuperclass) throws IllegalArgumentException { return null; }
    @Override public JavaType constructGeneralizedType(JavaType specificType, Class<?> generalizedSuperclass, TypeBindings bindings) throws IllegalArgumentException { return null; }
    @Override public JavaType constructArrayType(JavaType elementType) { return null; }
    @Override public JavaType constructArrayType(JavaType elementType, TypeBindings bindings) { return null; }
    @Override public JavaType constructMapType(Class<? extends Map> mapClass, JavaType keyType, JavaType valueType) { return null; }
    @Override public JavaType constructMapType(Class<? extends Map> mapClass, JavaType keyType, JavaType valueType, TypeBindings bindings) { return null; }
    @Override public JavaType constructMapKeyType(Class<?> mapKeyClass, JavaType contextType) { return null; }
    @Override public JavaType constructMapValueType(Class<?> mapValueClass, JavaType contextType) { return null; }
    @Override public JavaType constructCollectionType(Class<? extends Collection> collectionClass, JavaType elementType) { return null; }
    @Override public JavaType constructCollectionType(Class<? extends Collection> collectionClass, JavaType elementType, TypeBindings bindings) { return null; }
    @Override public JavaType constructCollectionLikeType(Class<?> collectionLikeClass, JavaType elementType) { return null; }
    @Override public JavaType constructCollectionLikeType(Class<?> collectionLikeClass, JavaType elementType, TypeBindings bindings) { return null; }
    @Override public JavaType constructIteratorType(JavaType iteratorType, JavaType valueType) { return null; }
    @Override public JavaType constructIterableType(JavaType iterableType, JavaType valueType) { return null; }
    @Override public JavaType constructListType(JavaType elementType) { return null; }
    @Override public JavaType constructListType(JavaType elementType, TypeBindings bindings) { return null; }
    @Override public JavaType constructListLikeType(Class<?> listLikeClass, JavaType elementType) { return null; }
    @Override public JavaType constructListLikeType(Class<?> listLikeClass, JavaType elementType, TypeBindings bindings) { return null; }
    @Override public JavaType constructTreeNodeType(Class<?> nodeClass, JavaType valueType) { return null; }
    @Override public JavaType constructBeanType(JavaType base, AnnotatedClass ac) { return null; }
    @Override public JavaType constructType(Type javaType, TypeBindings contextBindings) { return TypeFactory.defaultInstance().constructType(javaType); } // Use default
    @Override public JavaType constructEnumAsJavaType(Class<?> enumClass) { return null; }
    @Override public JavaType constructSpecializedType(JavaType baseType, Class<?> specClass, TypeBindings bindings) throws JsonMappingException { return baseType; }
    @Override public Date getRootType() { return null; }
    @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
    @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
    @Override public ObjectMapper getMapper() { return null; }
    @Override public void serializeValue(JsonGenerator jgen, Object value, JavaType rootType, JsonSerializer<Object> ser) throws IOException { }
    @Override public Date getFilterProvider() { return null; } // Kept for compatibility if called directly
    @Override public Date getAnnotations() { return null; } // Kept for compatibility if called directly
    @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
    @Override public ObjectMapper getMapper() { return null; }

    // Override getSerializerFactory for tests that might use it.
    @Override public BeanSerializerFactory getSerializerFactory() {
        // Provide a minimal SerializerFactory if needed.
        return BeanSerializerFactory.instance; // Default instance
    }

    // Override PropertySerializerMap.emptyMap() and related to avoid exceptions
    public static class EmptyMap extends PropertySerializerMap {
        public static final EmptyMap instance = new EmptyMap();
        private EmptyMap() { super(null, null, null); } // Superclass needs params

        @Override public JsonSerializer<Object> serializerFor(Class<?> type) { return null; }
        @Override public PropertySerializerMap newWith(Class<?> type, JsonSerializer<Object> serializer) { return null; }

        public static PropertySerializerMap emptyMap() {
            return instance;
        }
    }

    @Override
    public SerializerCache getSerializerCache() {
        return new SerializerCache(); // Provide a concrete instance
    }
}


// Minimal JsonGenerator stub
class JsonGeneratorStub extends JsonGenerator {
    private String currentFieldName = null;
    private StringBuilder output = new StringBuilder();
    private Object currentOutputObject = null;

    @Override public JsonGenerator writeFieldName(String name) throws IOException { this.currentFieldName = name; output.append("\"").append(name).append("\":"); return this; }
    @Override public JsonGenerator writeFieldName(SerializedString name) throws IOException { this.currentFieldName = name.getValue(); output.append("\"").append(name.getValue()).append("\":"); return this; }
    @Override public JsonGenerator writeNull() throws IOException { output.append("null"); currentOutputObject = null; return this; }
    @Override public JsonGenerator writeString(String text) throws IOException { output.append("\"").append(text).append("\""); currentOutputObject = text; return this; }
    @Override public JsonGenerator writeString(char[] text, int offset, int len) throws IOException { output.append("\"").append(new String(text, offset, len)).append("\""); currentOutputObject = new String(text, offset, len); return this; }
    @Override public JsonGenerator writeString(SerializedString text) throws IOException { output.append("\"").append(text.getValue()).append("\""); currentOutputObject = text.getValue(); return this; }
    @Override public JsonGenerator writeNumber(int v) throws IOException { output.append(v); currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumber(long v) throws IOException { output.append(v); currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumber(double v) throws IOException { output.append(v); currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumber(float v) throws IOException { output.append(v); currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumber(String encodedValue) throws IOException { output.append(encodedValue); currentOutputObject = encodedValue; return this; }
    @Override public JsonGenerator writeNumber(java.math.BigDecimal value) throws IOException { output.append(value); currentOutputObject = value; return this; }
    @Override public JsonGenerator writeNumber(java.math.BigInteger value) throws IOException { output.append(value); currentOutputObject = value; return this; }
    @Override public JsonGenerator writeBoolean(boolean v) throws IOException { output.append(v); currentOutputObject = v; return this; }
    @Override public JsonGenerator writeObjectRef(Object ref) throws IOException { currentOutputObject = ref; return this; }
    @Override public JsonGenerator writeObjectRef(String ref) throws IOException { currentOutputObject = ref; return this; }
    @Override public JsonGenerator writeArray(int[] value, int offset, int length) throws IOException { return this; }
    @Override public JsonGenerator writeArray(long[] value, int offset, int length) throws IOException { return this; }
    @Override public JsonGenerator writeArray(double[] value, int offset, int length) throws IOException { return this; }
    @Override public JsonGenerator writeArray(float[] value, int offset, int length) throws IOException { return this; }
    @Override public void writeStartArray() throws IOException {}
    @Override public void writeEndArray() throws IOException {}
    @Override public void writeStartObject() throws IOException {}
    @Override public void writeEndObject() throws IOException {}
    @Override public void writeRaw(String text) throws IOException {}
    @Override public void writeRaw(String text, int offset, int len) throws IOException {}
    @Override public void writeRaw(char[] c, int offset, int len) throws IOException {}
    @Override public void writeRaw(java.io.Reader reader, int charChunkSize) throws IOException {}
    @Override public void writeRaw(InputStream inputStream, int byteChunkSize) throws IOException {}
    @Override public void writeRawUTF8String(byte[] text, int offset, int len) throws IOException {}
    @Override public void writeUTF8String(byte[] text, int offset, int len) throws IOException {}
    @Override public void writeRawValue(String text) throws IOException {}
    @Override public void writeRawValue(String text, int offset, int len) throws IOException {}
    @Override public void writeRawValue(char[] c, int offset, int len) throws IOException {}
    @Override public void writeBinary(byte[] data, int offset, int length) throws IOException {}
    @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int length) throws IOException {}
    @Override public void writeBinary(InputStream data, int length) throws IOException {}
    @Override public void writeNumber(short v) throws IOException { output.append(v); currentOutputObject = v; }
    @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
    @Override public JsonGenerator setPrettyPrinter(PrettyPrinter pp) { return this; }
    @Override public JsonGenerator disable(Feature f) { return this; }
    @Override public JsonGenerator enable(Feature f) { return this; }
    @Override public JsonGenerator configure(Feature f, boolean state) { return this; }
    @Override public boolean isEnabled(Feature f) { return false; }
    @Override public JsonGenerator setCodec(ObjectCodec oc) { return this; }
    @Override public ObjectCodec getCodec() { return null; }
    @Override public void flush() throws IOException {}
    @Override public void close() throws IOException {}
    @Override public boolean isClosed() { return false; }
    @Override public Object getCurrentValue() { return null; }
    @Override public void setCurrentValue(Object v) { }
    @Override public JsonGenerator writeTypeId(Object id) throws IOException { currentOutputObject = id; return this; }
    @Override public JsonGenerator writeTypeId(SerializedString id) throws IOException { currentOutputObject = id.getValue(); return this; }
    @Override public void writeSchema(JsonNode schema) throws IOException { }
    @Override public void writeObject(Object value) throws IOException { currentOutputObject = value; }
    @Override public JsonGenerator writeObjectField(String fieldName, Object value) throws IOException { this.currentFieldName = fieldName; currentOutputObject = value; return this; }
    @Override public JsonGenerator writeArrayFieldStart(String fieldName) throws IOException { this.currentFieldName = fieldName; return this; }
    @Override public JsonGenerator writeObjectFieldStart(String fieldName) throws IOException { this.currentFieldName = fieldName; return this; }
    @Override public JsonGenerator writePOJOField(String fieldName, Object pojo) throws IOException { this.currentFieldName = fieldName; currentOutputObject = pojo; return this; }
    @Override public JsonGenerator writePOJOArrayField(String fieldName, Object pojo) throws IOException { this.currentFieldName = fieldName; currentOutputObject = pojo; return this; }
    @Override public JsonGenerator writeEmbeddedObject(Object object) throws IOException { currentOutputObject = object; return this; }
    @Override public JsonGenerator writeNumberField(String fieldName, short v) throws IOException { this.currentFieldName = fieldName; currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumberField(String fieldName, int v) throws IOException { this.currentFieldName = fieldName; currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumberField(String fieldName, long v) throws IOException { this.currentFieldName = fieldName; currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumberField(String fieldName, float v) throws IOException { this.currentFieldName = fieldName; currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumberField(String fieldName, double v) throws IOException { this.currentFieldName = fieldName; currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumberField(String fieldName, java.math.BigDecimal v) throws IOException { this.currentFieldName = fieldName; currentOutputObject = v; return this; }
    @Override public JsonGenerator writeNumberField(String fieldName, java.math.BigInteger v) throws IOException { this.currentFieldName = fieldName; currentOutputObject = v; return this; }
    @Override public JsonGenerator writeBooleanField(String fieldName, boolean value) throws IOException { this.currentFieldName = fieldName; currentOutputObject = value; return this; }
    @Override public JsonGenerator writeStringField(String fieldName, String value) throws IOException { this.currentFieldName = fieldName; currentOutputObject = value; return this; }
    @Override public JsonGenerator writeNullField(String fieldName) throws IOException { this.currentFieldName = fieldName; currentOutputObject = null; return this; }
    @Override public JsonGenerator writeBinaryField(String fieldName, byte[] value) throws IOException { this.currentFieldName = fieldName; currentOutputObject = value; return this; }
    @Override public JsonGenerator writeBinaryField(String fieldName, byte[] data, int offset, int length) throws IOException { this.currentFieldName = fieldName; currentOutputObject = data; return this; }
    @Override public JsonGenerator writeBinaryField(String fieldName, InputStream value, int length) throws IOException { this.currentFieldName = fieldName; currentOutputObject = value; return this; }
    @Override public JsonGenerator writeArrayFieldStart(String fieldName, int initialCapacity) throws IOException { this.currentFieldName = fieldName; return this; }
    @Override public JsonGenerator writeObjectFieldStart(String fieldName, int initialCapacity) throws IOException { this.currentFieldName = fieldName; return this; }
    @Override public JsonGenerator writeEmbeddedObjectField(String fieldName, Object object) throws IOException { this.currentFieldName = fieldName; currentOutputObject = object; return this; }
    @Override public JsonGenerator writePOJOField(String fieldName, Object value, String id) throws IOException { this.currentFieldName = fieldName; currentOutputObject = value; return this; }
    @Override public JsonGenerator writePOJOArrayField(String fieldName, Object value, String id) throws IOException { this.currentFieldName = fieldName; currentOutputObject = value; return this; }
    @Override public JsonGenerator writeString(char[] text, int offset, int len, java.util.function.Consumer<Object> release) throws IOException { output.append("\"").append(new String(text, offset, len)).append("\""); currentOutputObject = new String(text, offset, len); return this; }
    @Override public JsonGenerator writeBinary(byte[] data, int offset, int length, java.util.function.Consumer<Object> release) throws IOException { return this; }
    @Override public JsonGenerator writeBinary(Base64Variant b64variant, byte[] data, int offset, int length, java.util.function.Consumer<Object> release) throws IOException { return this; }
    @Override public JsonGenerator writeBinary(InputStream data, int length, java.util.function.Consumer<Object> release) throws IOException { return this; }
    @Override public JsonGenerator writeTypeId(Object id, java.util.function.Consumer<Object> release) throws IOException { currentOutputObject = id; return this; }
    @Override public JsonGenerator writeTypeId(SerializedString id, java.util.function.Consumer<Object> release) throws IOException { currentOutputObject = id.getValue(); return this; }

    public String getCurrentFieldName() { return currentFieldName; }
    public String getOutputBuffer() { return output.toString(); }
    public Object getCurrentOutputObject() { return currentOutputObject; }
}


public class BeanPropertyWriterTest {

    // Helper method to create a dummy BeanPropertyWriter for testing
    private BeanPropertyWriter createDummyWriter(String name, JavaType type) throws Exception {
        return createDummyWriter(name, type, null, null);
    }

    private BeanPropertyWriter createDummyWriter(String name, JavaType type, Annotations contextAnnotations, AnnotatedMember member) throws Exception {
        BeanPropertyDefinition propDef = new PropertyDefinitionStub(name);
        if (member == null) {
            Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
            member = new AnnotatedField(null, dummyField, null, null);
        }
        if (contextAnnotations == null) {
            contextAnnotations = new AnnotationsStub(null);
        }
        JsonSerializer<Object> serializer = null;
        TypeSerializer typeSer = null;
        JavaType serType = type;
        boolean suppressNulls = false;
        Object suppressableValue = null;

        return new BeanPropertyWriter(propDef, member, contextAnnotations, type, serializer, typeSer, serType, suppressNulls, suppressableValue);
    }

    // Helper method to create a dummy Bean for testing get(bean)
    private static class MyTestClass {
        public String dummyField = "testValue";
        public int dummyIntField = 123;
        public Object nullField = null;
        public MyTestClass selfRef = null; // For self-reference test
    }

    @Test
    public void testGetName() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        assertEquals("testName", writer.getName());
    }

    @Test
    public void testGetType() throws Exception {
        JavaType dummyType = TypeFactory.defaultInstance().constructType(String.class);
        BeanPropertyWriter writer = createDummyWriter("testName", dummyType);
        assertEquals(dummyType, writer.getType());
    }

    @Test
    public void testGetWrapperName() throws Exception {
        // Test with no wrapper name
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        assertNull(writer.getWrapperName());

        // Test with a wrapper name
        BeanPropertyDefinition propDefWithWrapper = new PropertyDefinitionStub("testName", false, null, new PropertyName("wrapper"));
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        BeanPropertyWriter writerWithWrapper = new BeanPropertyWriter(propDefWithWrapper, member, null, null, null, null, null, false, null);
        assertEquals("wrapper", writerWithWrapper.getWrapperName().getSimpleName());
    }

    @Test
    public void testIsRequired() throws Exception {
        // Test default (not required)
        BeanPropertyWriter writerFalse = createDummyWriter("testName", null);
        assertFalse(writerFalse.isRequired());

        // Test explicitly required
        BeanPropertyDefinition propDefRequired = new PropertyDefinitionStub("testName", true, null, null);
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        BeanPropertyWriter writerTrue = new BeanPropertyWriter(propDefRequired, member, null, null, null, null, null, false, null);
        assertTrue(writerTrue.isRequired());
    }

    @Test
    public void testGetAnnotation() throws Exception {
        class DummyAnnotation implements Annotation {
            @Override public Class<? extends Annotation> annotationType() { return DummyAnnotation.class; }
        }
        Annotations anns = new AnnotationsStub(new DummyAnnotation());
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);

        // Need to create a writer with specific annotations and member
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("testName");
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, anns, null, null, null, null, false, null);

        assertNotNull(writer.getAnnotation(DummyAnnotation.class));
        assertNull(writer.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetContextAnnotation() throws Exception {
        class DummyContextAnnotation implements Annotation {
            @Override public Class<? extends Annotation> annotationType() { return DummyContextAnnotation.class; }
        }
        Annotations anns = new AnnotationsStub(new DummyContextAnnotation());
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);

        BeanPropertyDefinition propDef = new PropertyDefinitionStub("testName");
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, anns, null, null, null, null, false, null);

        assertNotNull(writer.getContextAnnotation(DummyContextAnnotation.class));
        assertNull(writer.getContextAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMember() throws Exception {
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        BeanPropertyWriter writer = new BeanPropertyWriter(new PropertyDefinitionStub("testName"), member, null, null, null, null, null, false, null);
        assertEquals(member, writer.getMember());
    }

    @Test
    public void testDepositSchemaProperty() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        // Test with a null visitor, should not throw.
        writer.depositSchemaProperty(null);

        // Test with a visitor stub (can be more thorough if needed)
        JsonObjectFormatVisitor visitor = new JsonObjectFormatVisitor.Base(null) {}; // Dummy base implementation
        writer.depositSchemaProperty(visitor);
    }

    @Test
    public void testGetInternalSetting() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        assertNull(writer.getInternalSetting("someKey"));
    }

    @Test
    public void testSetInternalSettingAndGet() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        writer.setInternalSetting("someKey", "someValue");
        assertEquals("someValue", writer.getInternalSetting("someKey"));
        writer.setInternalSetting(123, 456);
        assertEquals(456, writer.getInternalSetting(123));
    }

    @Test
    public void testRemoveInternalSetting() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        writer.setInternalSetting("someKey", "someValue");
        assertEquals("someValue", writer.removeInternalSetting("someKey"));
        assertNull(writer.getInternalSetting("someKey"));
        assertNull(writer.removeInternalSetting("nonExistentKey"));
    }
    
    @Test
    public void testRemoveInternalSettingWhenMapIsEmpty() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        writer.setInternalSetting("someKey", "someValue");
        writer.removeInternalSetting("someKey");
        assertNull(writer.getInternalSetting("someKey"));
        assertNull(writer._internalSettings); // Should be cleared
    }

    @Test
    public void testGetSerializedName() {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        assertEquals("testName", writer.getSerializedName().getValue());
    }

    @Test
    public void testHasSerializer() {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        assertFalse(writer.hasSerializer()); // Default is null
        writer.assignSerializer(new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
        });
        assertTrue(writer.hasSerializer());
    }

    @Test
    public void testHasNullSerializer() {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        assertFalse(writer.hasNullSerializer()); // Default is null
        writer.assignNullSerializer(new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
        });
        assertTrue(writer.hasNullSerializer());
    }

    @Test
    public void testWillSuppressNulls() {
        // Test with suppressNulls = false (default)
        BeanPropertyWriter writerFalse = createDummyWriter("testName", null);
        assertFalse(writerFalse.willSuppressNulls());
        
        // Test with suppressNulls = true in constructor
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("testName");
        Field dummyField = null; 
        try {
            dummyField = MyTestClass.class.getDeclaredField("dummyField");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        Annotations contextAnnotations = new AnnotationsStub(null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        BeanPropertyWriter writerTrue = new BeanPropertyWriter(propDef, member, contextAnnotations, declaredType, null, null, null, true, null);
        assertTrue(writerTrue.willSuppressNulls());
    }

    @Test
    public void testGetSerializer() {
        JsonSerializer<Object> testSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
        };
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        writer.assignSerializer(testSer);
        assertEquals(testSer, writer.getSerializer());
    }

    @Test
    public void testGetSerializationType() {
        JavaType dummyType = TypeFactory.defaultInstance().constructType(String.class);
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("testName");
        Field dummyField = null; 
        try {
            dummyField = MyTestClass.class.getDeclaredField("dummyField");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        Annotations contextAnnotations = new AnnotationsStub(null);
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, contextAnnotations, null, null, null, dummyType, false, null);
        assertEquals(dummyType, writer.getSerializationType());
    }

    @Test
    public void testGetRawSerializationType() {
        JavaType dummyType = TypeFactory.defaultInstance().constructType(String.class);
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("testName");
        Field dummyField = null; 
        try {
            dummyField = MyTestClass.class.getDeclaredField("dummyField");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        Annotations contextAnnotations = new AnnotationsStub(null);
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, contextAnnotations, null, null, null, dummyType, false, null);
        assertEquals(String.class, writer.getRawSerializationType());

        // Test with null serialization type
        BeanPropertyWriter writerNull = new BeanPropertyWriter(propDef, member, contextAnnotations, null, null, null, null, false, null);
        assertNull(writerNull.getRawSerializationType());
    }

    @Test
    public void testGetPropertyType_viaField() throws Exception {
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        BeanPropertyWriter writer = new BeanPropertyWriter(new PropertyDefinitionStub("testName"), member, null, null, null, null, null, false, null);
        assertEquals(String.class, writer.getPropertyType());
    }
    
    @Test
    public void testGetPropertyType_viaMethod() throws Exception {
        class MyTestClassWithGetter {
            public String getMyProp() { return "myValue"; }
        }
        Method getterMethod = MyTestClassWithGetter.class.getMethod("getMyProp");
        AnnotatedMember member = new AnnotatedMethod(null, getterMethod, null, null);
        BeanPropertyWriter writer = new BeanPropertyWriter(new PropertyDefinitionStub("testName"), member, null, null, null, null, null, false, null);
        assertEquals(String.class, writer.getPropertyType());
    }

    @Test
    public void testGetGenericPropertyType_viaField() throws Exception {
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        BeanPropertyWriter writer = new BeanPropertyWriter(new PropertyDefinitionStub("testName"), member, null, null, null, null, null, false, null);
        assertEquals(String.class, writer.getGenericPropertyType());
    }

    @Test
    public void testGetGenericPropertyType_viaMethod() throws Exception {
        class MyTestClassWithGetter {
            public String getMyProp() { return "myValue"; }
        }
        Method getterMethod = MyTestClassWithGetter.class.getMethod("getMyProp");
        AnnotatedMember member = new AnnotatedMethod(null, getterMethod, null, null);
        BeanPropertyWriter writer = new BeanPropertyWriter(new PropertyDefinitionStub("testName"), member, null, null, null, null, null, false, null);
        assertEquals(String.class, writer.getGenericPropertyType());
    }

    @Test
    public void testGetViews() {
        Class<?>[] views = {Object.class};
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("testName", false, views, null);
        Field dummyField = null; 
        try {
            dummyField = MyTestClass.class.getDeclaredField("dummyField");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        Annotations contextAnnotations = new AnnotationsStub(null);
        BeanPropertyWriter writer = new BeanPropertyWriter(propDef, member, contextAnnotations, null, null, null, null, false, null);
        assertArrayEquals(views, writer.getViews());
    }

    @Test
    public void testSerializeAsField_nullValueNoNullSerializer() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("nullField", null);
        MyTestClass bean = new MyTestClass();
        bean.nullField = null;
        Field field = MyTestClass.class.getDeclaredField("nullField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("nullField"), member, null, null, null, null, null, false, null);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        bpw.serializeAsField(bean, jgen, prov);
        assertNull(jgen.getCurrentFieldName()); // Nothing should be written if value is null and no null serializer
        assertEquals("", jgen.getOutputBuffer());
    }

    @Test
    public void testSerializeAsField_nullValueWithNullSerializer() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.nullField = null;
        Field field = MyTestClass.class.getDeclaredField("nullField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);

        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                jgen.writeString("customNull");
            }
        };
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("nullField"), member, null, null, null, null, null, false, null);
        bpw.assignNullSerializer(nullSer);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        bpw.serializeAsField(bean, jgen, prov);
        assertEquals("nullField", jgen.getCurrentFieldName());
        assertTrue(jgen.getOutputBuffer().contains("customNull"));
    }

    @Test
    public void testSerializeAsField_nonNullValue() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.dummyField = "hello";
        Field field = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);

        JsonSerializer<Object> stringSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                jgen.writeString((String) value);
            }
        };
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("dummyField"), member, null, null, null, null, null, false, null);
        bpw.assignSerializer(stringSer);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        bpw.serializeAsField(bean, jgen, prov);
        assertEquals("dummyField", jgen.getCurrentFieldName());
        assertTrue(jgen.getOutputBuffer().contains("\"hello\""));
    }

    @Test
    public void testSerializeAsColumn_nullValueNoNullSerializer() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.nullField = null;
        Field field = MyTestClass.class.getDeclaredField("nullField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("nullField"), member, null, null, null, null, null, false, null);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        bpw.serializeAsColumn(bean, jgen, prov);
        assertTrue(jgen.getOutputBuffer().contains("null"));
    }

    @Test
    public void testSerializeAsColumn_nullValueWithNullSerializer() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.nullField = null;
        Field field = MyTestClass.class.getDeclaredField("nullField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);

        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                jgen.writeString("customNull");
            }
        };
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("nullField"), member, null, null, null, null, null, false, null);
        bpw.assignNullSerializer(nullSer);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        bpw.serializeAsColumn(bean, jgen, prov);
        assertTrue(jgen.getOutputBuffer().contains("customNull"));
    }

    @Test
    public void testSerializeAsColumn_nonNullValue() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.dummyField = "hello";
        Field field = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);

        JsonSerializer<Object> stringSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                jgen.writeString((String) value);
            }
        };
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("dummyField"), member, null, null, null, null, null, false, null);
        bpw.assignSerializer(stringSer);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        bpw.serializeAsColumn(bean, jgen, prov);
        assertTrue(jgen.getOutputBuffer().contains("hello"));
    }

    @Test
    public void testSerializeAsPlaceholder_withNullSerializer() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                jgen.writeString("placeholder");
            }
        };
        writer.assignNullSerializer(nullSer);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        writer.serializeAsPlaceholder(new Object(), jgen, prov);
        assertTrue(jgen.getOutputBuffer().contains("placeholder"));
    }

    @Test
    public void testSerializeAsPlaceholder_withoutNullSerializer() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();
        writer.serializeAsPlaceholder(new Object(), jgen, prov);
        assertTrue(jgen.getOutputBuffer().contains("null"));
    }

    @Test
    public void testGet_viaField() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.dummyField = "fieldValue";
        Field field = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("dummyField"), member, null, null, null, null, null, false, null);
        assertEquals("fieldValue", bpw.get(bean));
    }

    @Test
    public void testGet_viaMethod() throws Exception {
        class MyTestClassWithGetter {
            public String getMyProp() { return "methodValue"; }
        }
        Method getterMethod = MyTestClassWithGetter.class.getMethod("getMyProp");
        AnnotatedMember member = new AnnotatedMethod(null, getterMethod, null, null);
        BeanPropertyWriter bpw = new BeanPropertyWriter(new PropertyDefinitionStub("myProp"), member, null, null, null, null, null, false, null);
        MyTestClassWithGetter bean = new MyTestClassWithGetter();
        assertEquals("methodValue", bpw.get(bean));
    }

    @Test
    public void testToString() throws Exception {
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        BeanPropertyWriter writer = new BeanPropertyWriter(new PropertyDefinitionStub("testName"), member, null, null, null, null, null, false, null);
        String str = writer.toString();
        assertTrue(str.contains("property 'testName'"));
        assertTrue(str.contains("field \"com.fasterxml.jackson.databind.ser.BeanPropertyWriterTest$MyTestClass#dummyField\""));
        assertTrue(str.contains("no static serializer"));
    }

    @Test
    public void testToString_withStaticSerializer() throws Exception {
        Field dummyField = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
        };
        BeanPropertyWriter writer = new BeanPropertyWriter(new PropertyDefinitionStub("testName"), member, null, null, ser, null, null, false, null);
        String str = writer.toString();
        assertTrue(str.contains("property 'testName'"));
        assertTrue(str.contains("field \"com.fasterxml.jackson.databind.ser.BeanPropertyWriterTest$MyTestClass#dummyField\""));
        assertTrue(str.contains("static serializer of type com.fasterxml.jackson.databind.ser.BeanPropertyWriterTest$1"));
    }

    @Test
    public void testRename() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("originalName", null);
        NameTransformer transformer = NameTransformer.simpleTransformer("prefix_", "_suffix");
        BeanPropertyWriter renamedWriter = writer.rename(transformer);
        assertEquals("prefix_originalName_suffix", renamedWriter.getName());
        assertEquals("prefix_originalName_suffix", renamedWriter.getSerializedName().getValue());
        assertEquals("originalName", writer.getName()); // Original should be unchanged
    }

    @Test
    public void testAssignSerializer() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
        };
        writer.assignSerializer(ser);
        assertEquals(ser, writer.getSerializer());
    }

    @Test
    public void testAssignNullSerializer() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
        };
        writer.assignNullSerializer(nullSer);
        assertTrue(writer.hasNullSerializer());
    }

    @Test
    public void testUnwrappingWriter() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        NameTransformer unwrapper = NameTransformer.simpleTransformer("unwrap_", "");
        BeanPropertyWriter unwrappingWriter = writer.unwrappingWriter(unwrapper);
        assertNotSame(writer, unwrappingWriter);
        assertTrue(unwrappingWriter instanceof UnwrappingBeanPropertyWriter);
    }

    @Test
    public void testSetNonTrivialBaseType() throws Exception {
        BeanPropertyWriter writer = createDummyWriter("testName", null);
        JavaType baseType = TypeFactory.defaultInstance().constructType(java.util.List.class);
        writer.setNonTrivialBaseType(baseType);
        // Since _nonTrivialBaseType is protected, we can't directly assert its value from outside.
        // The existence of the method call without error is the test.
    }

    @Test
    public void testBeanPropertyWriterCopyConstructor() {
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("testName");
        Field dummyField = null;
        try {
            dummyField = MyTestClass.class.getDeclaredField("dummyField");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        AnnotatedMember member = new AnnotatedField(null, dummyField, null, null);
        Annotations contextAnnotations = new AnnotationsStub(null);
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { }
        };
        TypeSerializer typeSer = null;
        JavaType cfgSerializationType = declaredType;
        boolean suppressNulls = true;
        Object suppressableValue = BeanPropertyWriter.MARKER_FOR_EMPTY;

        BeanPropertyWriter original = new BeanPropertyWriter(propDef, member, contextAnnotations, declaredType, ser, typeSer, cfgSerializationType, suppressNulls, suppressableValue);
        
        BeanPropertyWriter copy = new BeanPropertyWriter(original); // Uses the copy constructor

        assertEquals(original.getName(), copy.getName());
        assertEquals(original._member, copy._member);
        assertEquals(original._contextAnnotations, copy._contextAnnotations);
        assertEquals(original._declaredType, copy._declaredType);
        assertEquals(original._accessorMethod, copy._accessorMethod);
        assertEquals(original._field, copy._field);
        assertEquals(original._serializer, copy._serializer);
        assertEquals(original._nullSerializer, copy._nullSerializer);
        assertEquals(original._cfgSerializationType, copy._cfgSerializationType);
        assertEquals(original._dynamicSerializers, copy._dynamicSerializers);
        assertEquals(original._suppressNulls, copy._suppressNulls);
        assertEquals(original._suppressableValue, copy._suppressableValue);
        assertArrayEquals(original._includeInViews, copy._includeInViews);
        assertEquals(original._typeSerializer, copy._typeSerializer);
        assertEquals(original._nonTrivialBaseType, copy._nonTrivialBaseType);
        assertEquals(original._isRequired, copy._isRequired);
    }

    @Test
    public void test_serializeAsField_suppressableValue() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.dummyField = "default";

        Field field = MyTestClass.class.getDeclaredField("dummyField");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("dummyField");

        // Test MARKER_FOR_EMPTY
        BeanPropertyWriter bpwEmpty = new BeanPropertyWriter(propDef, member, null, null, null, null, null, false, BeanPropertyWriter.MARKER_FOR_EMPTY);
        bpwEmpty.assignSerializer(new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { jgen.writeString(value.toString()); }
            @Override public boolean isEmpty(Object value) { return "default".equals(value); }
        });
        JsonGeneratorStub jgenEmpty = new JsonGeneratorStub();
        bpwEmpty.serializeAsField(bean, jgenEmpty, new SerializerProviderStub());
        assertEquals("", jgenEmpty.getOutputBuffer()); // Should be suppressed

        // Test specific value
        BeanPropertyWriter bpwValue = new BeanPropertyWriter(propDef, member, null, null, null, null, null, false, "default");
        bpwValue.assignSerializer(new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { jgen.writeString(value.toString()); }
        });
        JsonGeneratorStub jgenValue = new JsonGeneratorStub();
        bpwValue.serializeAsField(bean, jgenValue, new SerializerProviderStub());
        assertEquals("", jgenValue.getOutputBuffer()); // Should be suppressed
    }

    @Test
    public void test_serializeAsField_selfReference() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.selfRef = bean;

        Field field = MyTestClass.class.getDeclaredField("selfRef");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("selfRef");

        // Use a serializer that does NOT use ObjectId (so it should throw)
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { jgen.writeObject(value); }
            @Override public boolean usesObjectId() { return false; } // Crucial: does not use ObjectId
        };
        BeanPropertyWriter bpw = new BeanPropertyWriter(propDef, member, null, null, ser, null, null, false, null);
        bpw.assignSerializer(ser);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();

        try {
            bpw.serializeAsField(bean, jgen, prov);
            fail("Should have thrown JsonMappingException for self-reference");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Direct self-reference leading to cycle"));
        }
    }

    @Test
    public void test_serializeAsField_selfReference_withObjectId() throws Exception {
        MyTestClass bean = new MyTestClass();
        bean.selfRef = bean;

        Field field = MyTestClass.class.getDeclaredField("selfRef");
        AnnotatedMember member = new AnnotatedField(null, field, null, null);
        BeanPropertyDefinition propDef = new PropertyDefinitionStub("selfRef");

        // Use a serializer that uses ObjectId (should NOT throw)
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException { jgen.writeObject(value); }
            @Override public boolean usesObjectId() { return true; } // Crucial: uses ObjectId
        };
        BeanPropertyWriter bpw = new BeanPropertyWriter(propDef, member, null, null, ser, null, null, false, null);
        bpw.assignSerializer(ser);

        JsonGeneratorStub jgen = new JsonGeneratorStub();
        SerializerProviderStub prov = new SerializerProviderStub();

        // This should not throw an exception
        bpw.serializeAsField(bean, jgen, prov);
        assertEquals("selfRef", jgen.getCurrentFieldName()); // Field name should still be written
        // The actual output ofwriteObject(value) would depend on ObjectId serialization, which we aren't testing here.
    }
}
```

```
1. SOURCE CODE ANALYSIS - The tests cover the `BeanPropertyWriter` class, focusing on its core functionalities like naming, type handling, annotation access, internal settings management, serializer assignment, and serialization methods (`serializeAsField`, `serializeAsColumn`, `serializeAsPlaceholder`). It also tests helper methods like `get` and `toString`, and configuration methods like `rename` and `unwrappingWriter`.
2. TEST CASE DESIGN -
    - testGetName: Checks if the property name is correctly retrieved.
    - testGetType: Verifies retrieval of the declared Java type.
    - testGetWrapperName: Tests retrieval of wrapper names, including null and defined cases.
    - testIsRequired: Checks the 'required' status of the property.
    - testGetAnnotation: Tests fetching annotations from the member.
    - testGetContextAnnotation: Tests fetching annotations from the context.
    - testGetMember: Verifies the underlying AnnotatedMember is returned.
    - testDepositSchemaProperty: Checks schema deposit functionality with null and stub visitor.
    - testGetInternalSetting: Tests retrieval of internal settings.
    - testSetInternalSettingAndGet: Tests setting and then retrieving internal settings.
    - testRemoveInternalSetting: Tests removing an internal setting.
    - testRemoveInternalSettingWhenMapIsEmpty: Tests clearing internal settings map when empty.
    - testGetSerializedName: Checks retrieval of the SerializedString name.
    - testHasSerializer: Tests if a serializer has been assigned.
    - testHasNullSerializer: Tests if a null serializer has been assigned.
    - testWillSuppressNulls: Checks the flag for suppressing nulls.
    - testGetSerializer: Verifies the assigned serializer is returned.
    - testGetSerializationType: Tests retrieval of the configured serialization type.
    - testGetRawSerializationType: Checks the raw class of the serialization type.
    - testGetPropertyType_viaField: Tests property type retrieval when accessed via a field.
    - testGetPropertyType_viaMethod: Tests property type retrieval when accessed via a method.
    - testGetGenericPropertyType_viaField: Tests generic property type retrieval via field.
    - testGetGenericPropertyType_viaMethod: Tests generic property type retrieval via method.
    - testGetViews: Verifies the inclusion-in-views configuration.
    - testSerializeAsField_nullValueNoNullSerializer: Tests field serialization with null value and no null serializer.
    - testSerializeAsField_nullValueWithNullSerializer: Tests field serialization with null value and a custom null serializer.
    - testSerializeAsField_nonNullValue: Tests field serialization with a non-null value.
    - testSerializeAsColumn_nullValueNoNullSerializer: Tests column serialization with null value and no null serializer.
    - testSerializeAsColumn_nullValueWithNullSerializer: Tests column serialization with null value and a custom null serializer.
    - testSerializeAsColumn_nonNullValue: Tests column serialization with a non-null value.
    - testSerializeAsPlaceholder_withNullSerializer: Tests placeholder serialization with a null serializer.
    - testSerializeAsPlaceholder_withoutNullSerializer: Tests placeholder serialization without a null serializer.
    - testGet_viaField: Tests accessing property value via field.
    - testGet_viaMethod: Tests accessing property value via getter method.
    - testToString: Checks the string representation of the writer.
    - testToString_withStaticSerializer: Checks string representation when a static serializer is present.
    - testRename: Tests renaming functionality.
    - testAssignSerializer: Tests assigning a serializer.
    - testAssignNullSerializer: Tests assigning a null serializer.
    - testUnwrappingWriter: Tests creating an unwrapping writer.
    - testSetNonTrivialBaseType: Tests setting the non-trivial base type.
    - testBeanPropertyWriterCopyConstructor: Verifies the functionality of the copy constructor.
    - test_serializeAsField_suppressableValue: Tests suppression of fields based on suppressable value (MARKER_FOR_EMPTY and specific value).
    - test_serializeAsField_selfReference: Tests self-reference handling without ObjectId (should throw).
    - test_serializeAsField_selfReference_withObjectId: Tests self-reference handling with ObjectId (should not throw).
4. DEFECT DETECTION STRATEGY - The tests target specific behaviors of `BeanPropertyWriter`, including edge cases like null handling, suppression of values, self-referential cycles, and the correct invocation of assigned serializers and type serializers.
5. SUMMARY - 36 tests.
6. LIMITATIONS - Dummy implementations are used for several dependencies (SerializerProvider, JsonGenerator, etc.), which might not perfectly replicate all behaviors of the real Jackson components. Some internal fields are not directly asserted due to their protected/private nature. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```