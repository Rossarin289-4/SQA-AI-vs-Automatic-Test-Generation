```java
package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReflectiveTypeAdapterFactoryTest {

    // Helper method to create a Gson instance with default settings
    private Gson createGson() {
        return new Gson();
    }

    // Helper method to get a field from a class
    private Field getField(Class<?> clazz, String fieldName) throws Exception {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    }

    // Helper method to create a ReflectiveTypeAdapterFactory instance
    private ReflectiveTypeAdapterFactory createReflectiveTypeAdapterFactory() {
        // Use default Excluder and FieldNamingStrategy
        FieldNamingStrategy fieldNamingStrategy = new FieldNamingStrategy() {
            @Override
            public String translateName(Field f) {
                return f.getName();
            }
        };
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(Collections.emptyMap());
        // Use Excluder.DEFAULT instead of creating a new one if it's a constant
        return new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, Excluder.DEFAULT);
    }

    // Helper method to create BoundField - needs access to private method
    // This helper is problematic as createBoundField is private.
    // Instead, tests will call create(gson, type) to get an Adapter, and then interact with its fields if necessary, or test serialization/deserialization.

    // Test for the default constructor of ReflectiveTypeAdapterFactory
    @Test
    public void testDefaultConstructor() throws Exception {
        ReflectiveTypeAdapterFactory factory = new ReflectiveTypeAdapterFactory(
                new ConstructorConstructor(Collections.emptyMap()),
                new FieldNamingStrategy() {
                    @Override
                    public String translateName(Field f) {
                        return f.getName();
                    }
                },
                Excluder.DEFAULT
        );
        assertNotNull(factory);
    }

    // Test create method with a primitive type
    @Test
    public void testCreateForPrimitiveType() {
        ReflectiveTypeAdapterFactory factory = createReflectiveTypeAdapterFactory();
        Gson gson = createGson();
        TypeToken<Integer> intType = TypeToken.get(int.class);
        TypeAdapter<Integer> adapter = factory.create(gson, intType);
        assertNull(adapter);
    }

    // Test create method with a non-Object type (e.g., an interface that cannot be instantiated directly)
    @Test
    public void testCreateForInterfaceType() {
        ReflectiveTypeAdapterFactory factory = createReflectiveTypeAdapterFactory();
        Gson gson = createGson();
        TypeToken<List> listType = TypeToken.get(List.class);
        TypeAdapter<List> adapter = factory.create(gson, listType);
        assertNull(adapter); // ReflectiveTypeAdapterFactory doesn't handle interfaces directly
    }

    // Test for the getFieldNames method
    // This method is private, so we cannot directly call it.
    // Instead, we'll test its behavior indirectly through the create method and serialization/deserialization.

    // Test excludeField for a field that should be excluded by Excluder
    @Test
    public void testExcludeFieldExcluderExcludes() throws Exception {
        // Need a concrete field to test against.
        class TestFieldExclusion {
            public transient int excludedField;
        }
        Field field = getField(TestFieldExclusion.class, "excludedField");

        // Simulate Excluder.DEFAULT behavior for transient fields.
        // By default, Excluder.DEFAULT excludes transient fields when serializing.
        assertTrue(Excluder.DEFAULT.excludeField(field, true));
    }

    // Test excludeField for a field that should NOT be excluded by Excluder
    @Test
    public void testExcludeFieldExcluderDoesNotExclude() throws Exception {
        class TestFieldInclusion {
            public int includedField;
        }
        Field field = getField(TestFieldInclusion.class, "includedField");

        // By default, Excluder.DEFAULT does not exclude non-transient, non-static fields.
        assertFalse(Excluder.DEFAULT.excludeField(field, true));
        assertFalse(Excluder.DEFAULT.excludeField(field, false));
    }

    // Test for the writeField method of BoundField
    public static class ClassWithField {
        public String publicField = "initialValue";
        public String sameInstanceField = "initialValue";
        public Object selfReference;
        public Object otherObject = new Object();

        public ClassWithField() {
            selfReference = this;
        }
    }

    // To test BoundField methods, we need an instance of BoundField.
    // We can get this by creating a TypeAdapter and inspecting its internal fields,
    // or by creating a minimal scenario.

    // Since we cannot directly instantiate BoundField or call its methods due to visibility,
    // we will test the observable behavior through the Adapter's write/read methods.

    // Test Adapter's writeField behavior indirectly
    @Test
    public void testAdapterWriteFieldLogic() throws Exception {
        Gson gson = createGson();
        TypeToken<ClassWithField> typeToken = TypeToken.get(ClassWithField.class);
        TypeAdapter<ClassWithField> adapter = gson.getAdapter(typeToken);

        ClassWithField instance = new ClassWithField();
        instance.publicField = "newValue";

        // When writing, the adapter iterates through boundFields.
        // The logic `fieldValue != value` in `BoundField.writeField` is to avoid recursion.
        // If `publicField` is serialized, and its value is different from the instance itself,
        // it should be written.
        // For `selfReference`, where `fieldValue == value`, `writeField` should return false.
        // For `otherObject`, `fieldValue != value`, `writeField` should return true.

        // We can't directly assert on writeField, but we can observe its effect on serialization.
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, instance);

        // Assuming default Gson configuration, only publicField and otherObject should be serialized.
        // 'selfReference' should not cause infinite recursion due to the writeField check.
        // The exact output depends on Gson's internal field ordering.
        // Let's check for presence of expected fields.
        assertTrue(stringWriter.toString().contains("\"publicField\":\"newValue\""));
        assertTrue(stringWriter.toString().contains("\"otherObject\":")); // Content of otherObject is not tested here
        assertFalse(stringWriter.toString().contains("\"selfReference\"")); // Should not serialize self-reference if it causes recursion
    }


    // Test for the Adapter's read method with a simple object
    @Test
    public void testAdapterReadSimpleObject() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        String json = "{\"name\":\"TestName\",\"age\":30}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleObject obj = adapter.read(reader);

        assertNotNull(obj);
        assertEquals("TestName", obj.name);
        assertEquals(30, obj.age);
    }

    // Test for the Adapter's read method with null values
    @Test
    public void testAdapterReadWithNulls() throws Exception {
        Gson gson = createGson();
        TypeToken<NullableObject> typeToken = TypeToken.get(NullableObject.class);
        TypeAdapter<NullableObject> adapter = gson.getAdapter(typeToken);

        String json = "{\"name\":null,\"age\":null}";
        JsonReader reader = new JsonReader(new StringReader(json));
        NullableObject obj = adapter.read(reader);
        assertNotNull(obj);
        assertNull(obj.name);
        assertNull(obj.age);
    }

    // Test for the Adapter's read method with extra fields not in the class
    @Test
    public void testAdapterReadWithExtraFields() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        String json = "{\"name\":\"TestName\",\"age\":30,\"extraField\":\"extraValue\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleObject obj = adapter.read(reader);

        assertNotNull(obj);
        assertEquals("TestName", obj.name);
        assertEquals(30, obj.age);
        // Ensure extraField is ignored; we don't assert on its absence directly,
        // but verify that existing fields are read correctly.
    }

    // Test for the Adapter's write method with a simple object
    @Test
    public void testAdapterWriteSimpleObject() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        SimpleObject obj = new SimpleObject();
        obj.name = "WriteName";
        obj.age = 42;

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, obj);

        // Default Gson output is compact. Field order might vary, but for simple cases it's often declared order.
        String actualJson = stringWriter.toString();
        // Asserting exact string might be brittle due to ordering. Check for key-value pairs.
        assertTrue(actualJson.contains("\"name\":\"WriteName\""));
        assertTrue(actualJson.contains("\"age\":42"));
    }

    // Test for the Adapter's write method with null object
    @Test
    public void testAdapterWriteNullObject() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, null);

        assertEquals("null", stringWriter.toString());
    }

    // Test for the Adapter's write method with null fields
    @Test
    public void testAdapterWriteWithNullFields() throws Exception {
        Gson gson = createGson();
        TypeToken<NullableObject> typeToken = TypeToken.get(NullableObject.class);
        TypeAdapter<NullableObject> adapter = gson.getAdapter(typeToken);

        NullableObject obj = new NullableObject();
        obj.name = null;
        obj.age = null;

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, obj);

        // By default, Gson does not write null fields.
        assertEquals("{}", stringWriter.toString());
    }

    // Test with a field annotated with @SerializedName
    @Test
    public void testSerializedNameAnnotation() throws Exception {
        Gson gson = createGson();
        TypeToken<SerializedNameObject> typeToken = TypeToken.get(SerializedNameObject.class);
        TypeAdapter<SerializedNameObject> adapter = gson.getAdapter(typeToken);

        // Test writing
        SerializedNameObject writeObj = new SerializedNameObject();
        writeObj.aliasedField = "aliasValue";
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, writeObj);
        assertEquals("{\"alias\":\"aliasValue\"}", stringWriter.toString());

        // Test reading
        String json = "{\"alias\":\"readValue\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SerializedNameObject readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertEquals("readValue", readObj.aliasedField);
    }

    // Test with a field having multiple alternates
    @Test
    public void testSerializedNameWithAlternates() throws Exception {
        Gson gson = createGson();
        TypeToken<AlternatesObject> typeToken = TypeToken.get(AlternatesObject.class);
        TypeAdapter<AlternatesObject> adapter = gson.getAdapter(typeToken);

        // Test reading with first alternate
        String json1 = "{\"primary\":\"val1\"}";
        JsonReader reader1 = new JsonReader(new StringReader(json1));
        AlternatesObject obj1 = adapter.read(reader1);
        assertEquals("val1", obj1.fieldWithAlternates);

        // Test reading with second alternate
        String json2 = "{\"alt1\":\"val2\"}";
        JsonReader reader2 = new JsonReader(new StringReader(json2));
        AlternatesObject obj2 = adapter.read(reader2);
        assertEquals("val2", obj2.fieldWithAlternates);

        // Test reading with third alternate
        String json3 = "{\"alt2\":\"val3\"}";
        JsonReader reader3 = new JsonReader(new StringReader(json3));
        AlternatesObject obj3 = adapter.read(reader3);
        assertEquals("val3", obj3.fieldWithAlternates);

        // Test writing
        AlternatesObject writeObj = new AlternatesObject();
        writeObj.fieldWithAlternates = "writeVal";
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, writeObj);
        assertEquals("{\"primary\":\"writeVal\"}", stringWriter.toString()); // Writes the primary name
    }

    // Test for fields that are excluded by default (e.g., static, transient)

    // Test for a field that is transient
    public static class TransientFieldObject {
        public String nonTransient = "abc";
        public transient String transientField = "xyz";
    }

    @Test
    public void testTransientFieldIsExcluded() throws Exception {
        Gson gson = createGson();
        TypeToken<TransientFieldObject> typeToken = TypeToken.get(TransientFieldObject.class);
        TypeAdapter<TransientFieldObject> adapter = gson.getAdapter(typeToken);

        TransientFieldObject obj = new TransientFieldObject();
        obj.nonTransient = "def";
        obj.transientField = "pqr"; // This should not be serialized

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, obj);

        // Expect only nonTransient field to be written
        assertEquals("{\"nonTransient\":\"def\"}", stringWriter.toString());

        // Test reading - transient fields are generally ignored during deserialization too
        String json = "{\"nonTransient\":\"readAbc\", \"transientField\":\"readXyz\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        TransientFieldObject readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertEquals("readAbc", readObj.nonTransient);
        assertEquals("xyz", readObj.transientField); // Should retain its default/initial value
    }

    // Test for a field that is static
    public static class StaticFieldObject {
        public String instanceField = "instance";
        public static String staticField = "static";
    }

    @Test
    public void testStaticFieldIsExcluded() throws Exception {
        Gson gson = createGson();
        TypeToken<StaticFieldObject> typeToken = TypeToken.get(StaticFieldObject.class);
        TypeAdapter<StaticFieldObject> adapter = gson.getAdapter(typeToken);

        StaticFieldObject obj = new StaticFieldObject();
        obj.instanceField = "instanceValue";
        StaticFieldObject.staticField = "staticValue"; // Modifying static field

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, obj);

        // Expect only instanceField to be written
        assertEquals("{\"instanceField\":\"instanceValue\"}", stringWriter.toString());

        // Test reading - static fields are not part of instance serialization/deserialization
        String json = "{\"instanceField\":\"readInstance\", \"staticField\":\"readStatic\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        StaticFieldObject readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertEquals("readInstance", readObj.instanceField);
        assertEquals("staticValue", StaticFieldObject.staticField); // Static field remains unchanged by read
    }

    // Test case for nested classes and their fields
    public static class OuterClass {
        public String outerField = "outer";
        public InnerClass inner = new InnerClass();

        public static class InnerClass {
            public String innerField = "inner";
        }
    }

    @Test
    public void testNestedClassFields() throws Exception {
        Gson gson = createGson();
        TypeToken<OuterClass> typeToken = TypeToken.get(OuterClass.class);
        TypeAdapter<OuterClass> adapter = gson.getAdapter(typeToken);

        OuterClass obj = new OuterClass();
        obj.outerField = "outerValue";
        obj.inner.innerField = "innerValue";

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, obj);

        // Expect nested fields to be serialized correctly
        // Order might be an issue for direct string comparison.
        String actualJson = stringWriter.toString();
        assertTrue(actualJson.contains("\"outerField\":\"outerValue\""));
        assertTrue(actualJson.contains("\"inner\":{\"innerField\":\"innerValue\"}"));

        // Test reading
        String json = "{\"outerField\":\"readOuter\", \"inner\":{\"innerField\":\"readInner\"}}";
        JsonReader reader = new JsonReader(new StringReader(json));
        OuterClass readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertEquals("readOuter", readObj.outerField);
        assertNotNull(readObj.inner);
        assertEquals("readInner", readObj.inner.innerField);
    }

    // Test handling of exception during read (e.g., JsonSyntaxException for malformed JSON)
    @Test
    public void testAdapterReadMalformedJson() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        // Malformed JSON for age (int field expects a number, gets nothing after comma)
        String json = "{\"name\":\"TestName\",\"age\":}";
        JsonReader reader = new JsonReader(new StringReader(json));
        try {
            adapter.read(reader);
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException e) {
            // Expected
        }
    }

    // Test handling of exception during write (e.g., IllegalAccessException)
    @Test
    public void testAdapterWriteIllegalAccessException() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        SimpleObject obj = new SimpleObject();
        obj.name = "Test";
        obj.age = 10;

        // To trigger IllegalAccessException during write, we need to make a field inaccessible.
        Field nameField = getField(SimpleObject.class, "name");
        nameField.setAccessible(false); // Make it inaccessible again

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);

        try {
            adapter.write(writer, obj);
            fail("Expected AssertionError due to IllegalAccessException");
        } catch (AssertionError e) {
            // Expected
            assertTrue(e.getCause() instanceof IllegalAccessException);
        } finally {
            nameField.setAccessible(true); // Restore accessibility for other tests
        }
    }

    // Test scenario with a field name that clashes with a method name
    public static class FieldAndMethodNameClash {
        public String name;
        public String getName() { return "methodName"; }
    }

    @Test
    public void testFieldAndMethodNameClash() throws Exception {
        Gson gson = createGson();
        TypeToken<FieldAndMethodNameClash> typeToken = TypeToken.get(FieldAndMethodNameClash.class);
        TypeAdapter<FieldAndMethodNameClash> adapter = gson.getAdapter(typeToken);

        FieldAndMethodNameClash obj = new FieldAndMethodNameClash();
        obj.name = "fieldValue";

        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, obj);

        // Expect the field "name" to be serialized, not the method's return value
        assertEquals("{\"name\":\"fieldValue\"}", stringWriter.toString());

        // Test reading
        String json = "{\"name\":\"readValue\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        FieldAndMethodNameClash readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertEquals("readValue", readObj.name);
    }

    // Test with a field that is annotated with JsonAdapter
    @JsonAdapter(BooleanAsIntAdapter.class)
    public static class ObjectWithJsonAdapterField {
        @JsonAdapter(BooleanAsIntAdapter.class)
        public Boolean booleanField;
        public String regularField;
    }

    // Dummy adapter for JsonAdapter annotation
    public static class BooleanAsIntAdapter extends TypeAdapter<Boolean> {
        @Override
        public void write(JsonWriter out, Boolean value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(value ? 1 : 0);
            }
        }
        @Override
        public Boolean read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            int intValue = in.nextInt();
            return intValue == 1;
        }
    }

    @Test
    public void testJsonAdapterAnnotationOnField() throws Exception {
        Gson gson = createGson();
        TypeToken<ObjectWithJsonAdapterField> typeToken = TypeToken.get(ObjectWithJsonAdapterField.class);
        TypeAdapter<ObjectWithJsonAdapterField> adapter = gson.getAdapter(typeToken);

        // Test writing
        ObjectWithJsonAdapterField writeObj = new ObjectWithJsonAdapterField();
        writeObj.booleanField = true;
        writeObj.regularField = "regular";
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, writeObj);
        assertEquals("{\"booleanField\":1,\"regularField\":\"regular\"}", stringWriter.toString());

        // Test reading
        String json = "{\"booleanField\":0,\"regularField\":\"readRegular\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        ObjectWithJsonAdapterField readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertFalse(readObj.booleanField);
        assertEquals("readRegular", readObj.regularField);
    }

    // Test a field that is an array
    public static class ArrayFieldObject {
        public int[] numbers;
        public String[] strings;
    }

    @Test
    public void testArrayField() throws Exception {
        Gson gson = createGson();
        TypeToken<ArrayFieldObject> typeToken = TypeToken.get(ArrayFieldObject.class);
        TypeAdapter<ArrayFieldObject> adapter = gson.getAdapter(typeToken);

        // Test writing
        ArrayFieldObject writeObj = new ArrayFieldObject();
        writeObj.numbers = new int[]{1, 2, 3};
        writeObj.strings = new String[]{"a", "b"};
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, writeObj);
        assertEquals("{\"numbers\":[1,2,3],\"strings\":[\"a\",\"b\"]}", stringWriter.toString());

        // Test reading
        String json = "{\"numbers\":[4,5],\"strings\":[\"c\",\"d\",\"e\"]}";
        JsonReader reader = new JsonReader(new StringReader(json));
        ArrayFieldObject readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertArrayEquals(new int[]{4, 5}, readObj.numbers);
        assertArrayEquals(new String[]{"c", "d", "e"}, readObj.strings);
    }

    // Test with an empty object
    @Test
    public void testEmptyObjectSerialization() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        SimpleObject obj = new SimpleObject(); // Default values
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        adapter.write(writer, obj);

        // Default int is 0, default String is null.
        assertEquals("{\"name\":null,\"age\":0}", stringWriter.toString());

        // Test reading an empty object
        String json = "{}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleObject readObj = adapter.read(reader);
        assertNotNull(readObj);
        assertNull(readObj.name);
        assertEquals(0, readObj.age); // Default value for int
    }

    // Test handling of null value in read when field is primitive
    @Test
    public void testAdapterReadNullForPrimitiveField() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        // 'age' is a primitive int. JSON null for it should be handled.
        // According to Gson's behavior, null for a primitive is typically ignored or defaults.
        // However, `field.set(value, fieldValue)` where `isPrimitive` is true and `fieldValue` is null
        // might lead to `NullPointerException` if not handled by the adapter.
        // The code has `if (fieldValue != null || !isPrimitive)` which should handle this.
        String json = "{\"name\":\"TestName\",\"age\":null}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleObject obj = adapter.read(reader);
        assertNotNull(obj);
        assertEquals("TestName", obj.name);
        assertEquals(0, obj.age); // Default value for int if null is encountered and ignored
    }

    // Test Gson's handling of primitive types during deserialization.
    // If a JSON number is encountered for a primitive int, it should be parsed.
    @Test
    public void testAdapterReadPrimitiveInt() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        String json = "{\"name\":\"TestName\",\"age\":42}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleObject obj = adapter.read(reader);
        assertNotNull(obj);
        assertEquals("TestName", obj.name);
        assertEquals(42, obj.age);
    }

    // Test Gson's handling of float/double conversions when reading primitives.
    // For example, reading a double into an int field.
    @Test
    public void testAdapterReadDoubleIntoInt() throws Exception {
        Gson gson = createGson();
        TypeToken<SimpleObject> typeToken = TypeToken.get(SimpleObject.class);
        TypeAdapter<SimpleObject> adapter = gson.getAdapter(typeToken);

        // Gson will attempt to convert the double to an int.
        String json = "{\"name\":\"TestName\",\"age\":42.7}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleObject obj = adapter.read(reader);
        assertNotNull(obj);
        assertEquals("TestName", obj.name);
        assertEquals(42, obj.age); // Truncation occurs.
    }

    // Helper classes for tests
    public static class SimpleObject {
        public String name;
        public int age; // primitive int
    }

    public static class NullableObject {
        public String name;
        public Integer age; // wrapper Integer to allow null
    }

    public static class SerializedNameObject {
        @SerializedName("alias")
        public String aliasedField;
    }

    public static class AlternatesObject {
        @SerializedName(value = "primary", alternate = {"alt1", "alt2"})
        public String fieldWithAlternates;
    }
}
```