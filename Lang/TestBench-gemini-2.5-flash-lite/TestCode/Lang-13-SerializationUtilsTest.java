package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SerializationUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // --- clone tests ---

    @Test
    public void testCloneNull() {
        assertNull(SerializationUtils.clone(null));
    }

    @Test
    public void testCloneSerializable() {
        String original = "hello";
        String cloned = SerializationUtils.clone(original);
        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertEquals(original, cloned);
    }

    @Test
    public void testCloneSerializableWithFields() {
        TestSerializableObject obj = new TestSerializableObject("test", 123);
        TestSerializableObject cloned = SerializationUtils.clone(obj);
        assertNotNull(cloned);
        assertNotSame(obj, cloned);
        assertEquals(obj.getName(), cloned.getName());
        assertEquals(obj.getValue(), cloned.getValue());
    }

    @Test
    public void testCloneSerializableWithSerializableFields() {
        TestSerializableObjectWithSerializableField obj = new TestSerializableObjectWithSerializableField("outer", new TestSerializableObject("inner", 456));
        TestSerializableObjectWithSerializableField cloned = SerializationUtils.clone(obj);
        assertNotNull(cloned);
        assertNotSame(obj, cloned);
        assertEquals(obj.getOuterName(), cloned.getOuterName());
        assertNotNull(cloned.getInnerObject());
        assertNotSame(obj.getInnerObject(), cloned.getInnerObject());
        assertEquals(obj.getInnerObject().getName(), cloned.getInnerObject().getName());
        assertEquals(obj.getInnerObject().getValue(), cloned.getInnerObject().getValue());
    }
    
    @Test
    public void testCloneSerializableWithCollection() {
        TestSerializableObjectWithCollection obj = new TestSerializableObjectWithCollection("collectionTest");
        obj.addValue("one");
        obj.addValue("two");
        TestSerializableObjectWithCollection cloned = SerializationUtils.clone(obj);
        assertNotNull(cloned);
        assertNotSame(obj, cloned);
        assertEquals(obj.getName(), cloned.getName());
        assertNotNull(cloned.getValues());
        assertNotSame(obj.getValues(), cloned.getValues());
        assertEquals(obj.getValues().size(), cloned.getValues().size());
        assertEquals("one", cloned.getValues().get(0));
        assertEquals("two", cloned.getValues().get(1));
    }

    // --- serialize tests ---

    @Test
    public void testSerializeNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize(null, baos);
        byte[] data = baos.toByteArray();
        // A null object when serialized will still result in some data being written.
        // The exact content is not critical, just that it's not empty.
        assertTrue(data.length > 0);
    }

    @Test
    public void testSerializeAndDeserializeSerializable() throws IOException, ClassNotFoundException {
        String original = "test string";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize(original, baos);
        byte[] data = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        Object deserialized = SerializationUtils.deserialize(bais);

        assertNotNull(deserialized);
        assertEquals(original, deserialized);
        assertTrue(deserialized instanceof String);
    }

    @Test
    public void testSerializeAndDeserializeSerializableWithFields() throws IOException, ClassNotFoundException {
        TestSerializableObject original = new TestSerializableObject("fieldTest", 42);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize(original, baos);
        byte[] data = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        Object deserialized = SerializationUtils.deserialize(bais);

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof TestSerializableObject);
        TestSerializableObject casted = (TestSerializableObject) deserialized;
        assertEquals(original.getName(), casted.getName());
        assertEquals(original.getValue(), casted.getValue());
    }

    @Test
    public void testSerializeAndDeserializeEmptyByteArray() throws IOException {
        byte[] emptyData = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(emptyData);
        // Deserializing an empty byte array should likely throw an exception or return null depending on ObjectInputStream behavior.
        // Based on ObjectInputStream, it should throw an EOFException wrapped in SerializationException.
        try {
            SerializationUtils.deserialize(bais);
            fail("Expected SerializationException for empty byte array");
        } catch (SerializationException e) {
            // Expected exception
            assertTrue(e.getCause() instanceof IOException);
        }
    }

    @Test
    public void testSerializeAndDeserializeByteArrayTooShort() throws IOException {
        byte[] shortData = {1, 2, 3}; // Not enough data for a valid object stream
        ByteArrayInputStream bais = new ByteArrayInputStream(shortData);
        try {
            SerializationUtils.deserialize(bais);
            fail("Expected SerializationException for short byte array");
        } catch (SerializationException e) {
            // Expected exception
            assertTrue(e.getCause() instanceof IOException);
        }
    }

    @Test
    public void testSerializeAndDeserializeByteArray() throws IOException, ClassNotFoundException {
        TestSerializableObject original = new TestSerializableObject("arrayTest", 99);
        byte[] data = SerializationUtils.serialize(original);
        Object deserialized = SerializationUtils.deserialize(data);

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof TestSerializableObject);
        TestSerializableObject casted = (TestSerializableObject) deserialized;
        assertEquals(original.getName(), casted.getName());
        assertEquals(original.getValue(), casted.getValue());
    }

    @Test
    public void testSerializeAndDeserializeNullByteArray() {
        try {
            SerializationUtils.deserialize((byte[]) null);
            fail("Expected IllegalArgumentException for null byte array");
        } catch (IllegalArgumentException e) {
            // Expected exception
            assertEquals("The byte[] must not be null", e.getMessage());
        }
    }

    @Test
    public void testSerializeOutputStreamNull() {
        try {
            // Use a Serializable object, e.g., a String
            SerializationUtils.serialize("test", null);
            fail("Expected IllegalArgumentException for null OutputStream");
        } catch (IllegalArgumentException e) {
            // Expected exception
            assertEquals("The OutputStream must not be null", e.getMessage());
        }
    }

    @Test
    public void testDeserializeInputStreamNull() {
        try {
            SerializationUtils.deserialize((InputStream) null);
            fail("Expected IllegalArgumentException for null InputStream");
        } catch (IllegalArgumentException e) {
            // Expected exception
            assertEquals("The InputStream must not be null", e.getMessage());
        }
    }
    
    // Test case for ClassLoaderAwareObjectInputStream's resolveClass with a specific classloader
    @Test
    public void testClassLoaderAwareObjectInputStreamResolveClassWithProvidedLoader() throws IOException, ClassNotFoundException {
        // Create a dummy stream and a custom classloader
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject("SomeObject"); // Writing a simple object
        oos.close();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ClassLoader customClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("java.lang.String")) { // This should be resolved by the custom loader
                    return String.class;
                }
                return super.loadClass(name);
            }
        };

        SerializationUtils.ClassLoaderAwareObjectInputStream ois = new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, customClassLoader);
        Object obj = ois.readObject();
        ois.close();
        
        assertNotNull(obj);
        assertEquals("SomeObject", obj);
        assertTrue(obj instanceof String);
    }
    
    // Test case for ClassLoaderAwareObjectInputStream's resolveClass with context classloader
    @Test
    public void testClassLoaderAwareObjectInputStreamResolveClassWithContextLoader() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new Integer(10)); // Writing an Integer
        oos.close();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        // Use the current thread's context classloader, which should be able to load Integer
        SerializationUtils.ClassLoaderAwareObjectInputStream ois = new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, null);
        Object obj = ois.readObject();
        ois.close();
        
        assertNotNull(obj);
        assertEquals(Integer.valueOf(10), obj);
        assertTrue(obj instanceof Integer);
    }

    // Test case for primitive type resolution
    @Test
    public void testClassLoaderAwareObjectInputStreamResolvePrimitiveType() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeInt(123); // Writing an int
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        // Custom classloader that won't load 'int'
        ClassLoader customClassLoader = new ClassLoader() {
             @Override
             public Class<?> loadClass(String name) throws ClassNotFoundException {
                 if (name.equals("int")) {
                     throw new ClassNotFoundException("int not found by custom loader");
                 }
                 return super.loadClass(name);
             }
        };

        // The resolveClass method in ClassLoaderAwareObjectInputStream correctly handles primitive types
        // by checking its internal primitiveTypes map. This test should not throw ClassNotFoundException
        // if the map contains "int". The original code that failed was likely due to an expectation
        // that Class.forName("int", ...) would succeed without a specific ClassLoader, or the primitiveTypes map
        // was not populated correctly or accessed.
        // Based on the reference source, `primitiveTypes.put("int", int.class);` exists.
        // Therefore, ClassLoaderAwareObjectInputStream should return `int.class` when `desc.getName()` is "int".
        // The actual deserialization of an `int` written by `writeInt` results in an `Integer` object.
        
        SerializationUtils.ClassLoaderAwareObjectInputStream ois = new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, customClassLoader);
        Object obj = ois.readObject();
        ois.close();

        assertNotNull(obj);
        // ObjectInputStream deserializes primitive ints as Integer objects
        assertEquals(Integer.valueOf(123), obj); 
        assertTrue(obj instanceof Integer);
    }
    
    // Helper class for testing serialization of objects with fields
    private static class TestSerializableObject implements Serializable {
        private static final long serialVersionUID = 1L; // Good practice
        private String name;
        private int value;

        public TestSerializableObject(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestSerializableObject that = (TestSerializableObject) o;
            if (value != that.value) return false;
            return java.util.Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + value;
            return result;
        }
    }

    // Helper class for testing serialization of objects with Serializable fields
    private static class TestSerializableObjectWithSerializableField implements Serializable {
        private static final long serialVersionUID = 1L;
        private String outerName;
        private TestSerializableObject innerObject;

        public TestSerializableObjectWithSerializableField(String outerName, TestSerializableObject innerObject) {
            this.outerName = outerName;
            this.innerObject = innerObject;
        }

        public String getOuterName() {
            return outerName;
        }

        public TestSerializableObject getInnerObject() {
            return innerObject;
        }
    }
    
    // Helper class for testing serialization of objects with Collections
    private static class TestSerializableObjectWithCollection implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private java.util.List<String> values = new java.util.ArrayList<>();

        public TestSerializableObjectWithCollection(String name) {
            this.name = name;
        }

        public void addValue(String value) {
            this.values.add(value);
        }

        public String getName() {
            return name;
        }

        public java.util.List<String> getValues() {
            return values;
        }
    }
}
