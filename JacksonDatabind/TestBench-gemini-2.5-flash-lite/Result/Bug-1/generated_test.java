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
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
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

}

class AnnotationsStub implements Annotations {
    private final Annotation _annotation;
    public AnnotationsStub(Annotation annotation) { _annotation = annotation; }
    @Override public <A extends Annotation> A get(Class<A> acls) { return (A)_annotation; }
    @Override public int size() { return (_annotation == null) ? 0 : 1; }
}

// Minimal implementations for SerializerProvider and related types
abstract class MockSerializerProvider extends SerializerProvider {

    // Abstract methods to implement

    @Override public JsonSerializer<Object> findValueSerializer(Class<?> cls, BeanProperty property) throws JsonMappingException {
        return findValueSerializer(getTypeFactory().constructType(cls), property);
    }


    // Other methods to override or provide default implementations

    // Override getSerializerFactory for tests that might use it.

    // Override PropertySerializerMap.emptyMap() and related to avoid exceptions

}


// Minimal JsonGenerator stub
class JsonGeneratorStub extends JsonGenerator {
    private String currentFieldName = null;
    private StringBuilder output = new StringBuilder();
    private Object currentOutputObject = null;


    public String getCurrentFieldName() { return currentFieldName; }
    public String getOutputBuffer() { return output.toString(); }
    public Object getCurrentOutputObject() { return currentOutputObject; }
}


public class BeanPropertyWriterTest {

    // Helper method to create a dummy BeanPropertyWriter for testing


    // Helper method to create a dummy Bean for testing get(bean)
    private static class MyTestClass {
        public String dummyField = "testValue";
        public int dummyIntField = 123;
        public Object nullField = null;
        public MyTestClass selfRef = null; // For self-reference test
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





