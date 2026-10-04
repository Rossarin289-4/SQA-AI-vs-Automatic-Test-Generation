package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

public class HashCodeBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testHashCodeBuilderConstructorDefault() {
        assertEquals(17, new HashCodeBuilder().toHashCode());
    }

    @Test
    public void testHashCodeBuilderConstructorWithArgs() {
        assertEquals(37, new HashCodeBuilder(37, 17).toHashCode());
    }

    @Test
    public void testHashCodeBuilderConstructorWithArgsOdd() {
        assertEquals(37, new HashCodeBuilder(37, 17).toHashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHashCodeBuilderConstructorWithArgsEvenInitial() {
        new HashCodeBuilder(18, 37);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHashCodeBuilderConstructorWithArgsEvenMultiplier() {
        new HashCodeBuilder(37, 18);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHashCodeBuilderConstructorWithArgsZeroInitial() {
        new HashCodeBuilder(0, 37);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHashCodeBuilderConstructorWithArgsZeroMultiplier() {
        new HashCodeBuilder(37, 0);
    }

    @Test
    public void testHashCodeBuilderAppendBoolean() {
        assertEquals(37 * 17 + 1, new HashCodeBuilder(17, 37).append(true).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendBooleanFalse() {
        assertEquals(37 * 17 + 0, new HashCodeBuilder(17, 37).append(false).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendBooleanArray() {
        boolean[] array = {true, false, true};
        int expected = 17;
        expected = expected * 37 + (array[0] ? 1 : 0);
        expected = expected * 37 + (array[1] ? 1 : 0);
        expected = expected * 37 + (array[2] ? 1 : 0);
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendBooleanArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((boolean[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendByte() {
        assertEquals(37 * 17 + 10, new HashCodeBuilder(17, 37).append((byte) 10).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendByteArray() {
        byte[] array = {10, 20, 30};
        int expected = 17;
        expected = expected * 37 + array[0];
        expected = expected * 37 + array[1];
        expected = expected * 37 + array[2];
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendByteArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendChar() {
        assertEquals(37 * 17 + 'A', new HashCodeBuilder(17, 37).append('A').toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendCharArray() {
        char[] array = {'A', 'B', 'C'};
        int expected = 17;
        expected = expected * 37 + array[0];
        expected = expected * 37 + array[1];
        expected = expected * 37 + array[2];
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendCharArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendDouble() {
        double value = 1.234;
        // The hashCode for double is derived from its long bits
        assertEquals(37 * 17 + (int) Double.doubleToLongBits(value), new HashCodeBuilder(17, 37).append(value).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendDoubleArray() {
        double[] array = {1.234, 5.678};
        int expected = 17;
        expected = expected * 37 + (int) Double.doubleToLongBits(array[0]);
        expected = expected * 37 + (int) Double.doubleToLongBits(array[1]);
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendDoubleArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendFloat() {
        float value = 1.234f;
        assertEquals(37 * 17 + Float.floatToIntBits(value), new HashCodeBuilder(17, 37).append(value).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendFloatArray() {
        float[] array = {1.234f, 5.678f};
        int expected = 17;
        expected = expected * 37 + Float.floatToIntBits(array[0]);
        expected = expected * 37 + Float.floatToIntBits(array[1]);
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendFloatArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendInt() {
        assertEquals(37 * 17 + 12345, new HashCodeBuilder(17, 37).append(12345).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendIntArray() {
        int[] array = {1, 2, 3};
        int expected = 17;
        expected = expected * 37 + array[0];
        expected = expected * 37 + array[1];
        expected = expected * 37 + array[2];
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendIntArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((int[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendLong() {
        // Note: The actual calculation is iTotal = iTotal * iConstant + ((int) (value ^ (value >> 32)));
        long value = 1234567890123L;
        int expected = 17 * 37 + (int) (value ^ (value >> 32));
        assertEquals(expected, new HashCodeBuilder(17, 37).append(value).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendLongArray() {
        long[] array = {1L, 2L, 3L};
        int expected = 17;
        expected = expected * 37 + (int) (array[0] ^ (array[0] >> 32));
        expected = expected * 37 + (int) (array[1] ^ (array[1] >> 32));
        expected = expected * 37 + (int) (array[2] ^ (array[2] >> 32));
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendLongArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((long[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendObjectNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((Object) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendObject() {
        Object obj = "test";
        assertEquals(37 * 17 + obj.hashCode(), new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendObjectArray() {
        Object[] array = {"a", "b", "c"};
        int expected = 17;
        expected = expected * 37 + "a".hashCode();
        expected = expected * 37 + "b".hashCode();
        expected = expected * 37 + "c".hashCode();
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendObjectArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((Object[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendShort() {
        assertEquals(37 * 17 + 100, new HashCodeBuilder(17, 37).append((short) 100).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendShortArray() {
        short[] array = {10, 20, 30};
        int expected = 17;
        expected = expected * 37 + array[0];
        expected = expected * 37 + array[1];
        expected = expected * 37 + array[2];
        assertEquals(expected, new HashCodeBuilder(17, 37).append(array).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendShortArrayNull() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short[]) null).toHashCode());
    }

    @Test
    public void testHashCodeBuilderAppendSuper() {
        assertEquals(37 * 17 + 12345, new HashCodeBuilder(17, 37).appendSuper(12345).toHashCode());
    }

    @Test
    public void testHashCodeBuilderToHashCode() {
        assertEquals(17, new HashCodeBuilder().toHashCode());
    }

    @Test
    public void testHashCodeBuilderHashCode() {
        assertEquals(17, new HashCodeBuilder().hashCode());
    }

    // Helper class to test reflectionHashCode without transient fields and no inheritance
    private static class TestObject {
        private int id;
        private String name;
        private boolean smoker;

        TestObject(int id, String name, boolean smoker) {
            this.id = id;
            this.name = name;
            this.smoker = smoker;
        }
    }

    // Helper class to test reflectionHashCode with transient fields
    private static class TestObjectWithTransient {
        private int id;
        private String name;
        private boolean smoker;
        private transient String transientField;

        TestObjectWithTransient(int id, String name, boolean smoker) {
            this.id = id;
            this.name = name;
            this.smoker = smoker;
            this.transientField = "transient";
        }
    }
    
    // Helper classes for inheritance tests
    private static class SuperClass {
        private int superClassField;
        
        SuperClass(int superClassField) {
            this.superClassField = superClassField;
        }
    }
    
    private static class SubClass extends SuperClass {
        private String subClassField1;
        private boolean subClassField2;
        
        SubClass(int superClassField, String subClassField1, boolean subClassField2) {
            super(superClassField);
            this.subClassField1 = subClassField1;
            this.subClassField2 = subClassField2;
        }
    }

    private static class SubClassWithTransient extends SuperClass {
        private String subClassField1;
        private boolean subClassField2;
        private transient double transientDoubleField;
        
        SubClassWithTransient(int superClassField, String subClassField1, boolean subClassField2, double transientDoubleField) {
            super(superClassField);
            this.subClassField1 = subClassField1;
            this.subClassField2 = subClassField2;
            this.transientDoubleField = transientDoubleField;
        }
    }

    @Test
    public void testReflectionHashCodeWithObject() {
        Object obj = new TestObject(1, "test", true);
        // Calculate expected hash code manually for TestObject
        int expected = 17; // initial value for HashCodeBuilder
        expected = expected * 37; // multiplier
        expected += 1; // id
        expected = expected * 37;
        expected += "test".hashCode(); // name
        expected = expected * 37;
        expected += (true ? 1 : 0); // smoker (using 1 for true, 0 for false as in append(boolean))
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(obj));
    }

    @Test
    public void testReflectionHashCodeWithObjectAndTransients() {
        Object obj = new TestObjectWithTransient(1, "test", true);
        // When testTransients is false (default), transient fields are ignored.
        // Calculate expected hash code manually for TestObjectWithTransient without transientField
        int expected = 17; // initial value for HashCodeBuilder
        expected = expected * 37; // multiplier
        expected += 1; // id
        expected = expected * 37;
        expected += "test".hashCode(); // name
        expected = expected * 37;
        expected += (true ? 1 : 0); // smoker (using 1 for true, 0 for false)
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(obj, false));
    }

    @Test
    public void testReflectionHashCodeWithObjectAndTransientsTrue() {
        Object obj = new TestObjectWithTransient(1, "test", true);
        // Calculate expected hash code manually for TestObjectWithTransient including transientField
        int expected = 17; // initial value for HashCodeBuilder
        expected = expected * 37; // multiplier
        expected += 1; // id
        expected = expected * 37;
        expected += "test".hashCode(); // name
        expected = expected * 37;
        expected += (true ? 1 : 0); // smoker
        expected = expected * 37;
        expected += "transient".hashCode(); // transientField
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(obj, true));
    }

    @Test
    public void testReflectionHashCodeWithInitialAndMultiplier() {
        Object obj = new TestObject(1, "test", true);
        int initial = 101;
        int multiplier = 211;
        // Calculate expected hash code manually
        int expected = initial;
        expected = expected * multiplier;
        expected += 1; // id
        expected = expected * multiplier;
        expected += "test".hashCode(); // name
        expected = expected * multiplier;
        expected += (true ? 1 : 0); // smoker
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(initial, multiplier, obj));
    }

    @Test
    public void testReflectionHashCodeWithInitialAndMultiplierAndTransients() {
        Object obj = new TestObjectWithTransient(1, "test", true);
        int initial = 101;
        int multiplier = 211;
        // Calculate expected hash code manually, without transient field (testTransients = false)
        int expected = initial;
        expected = expected * multiplier;
        expected += 1; // id
        expected = expected * multiplier;
        expected += "test".hashCode(); // name
        expected = expected * multiplier;
        expected += (true ? 1 : 0); // smoker
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(initial, multiplier, obj, false));
    }
    
    @Test
    public void testReflectionHashCodeWithObjectAndExcludeFields() {
        Object obj = new TestObject(1, "test", true);
        String[] excludeFields = {"name"};
        // Calculate expected hash code manually, excluding 'name'
        int expected = 17;
        expected = expected * 37;
        expected += 1; // id
        expected = expected * 37;
        // name is excluded
        expected = expected * 37;
        expected += (true ? 1 : 0); // smoker
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(obj, excludeFields));
    }

    @Test
    public void testReflectionHashCodeWithObjectAndExcludeFieldsCollection() {
        Object obj = new TestObject(1, "test", true);
        Collection<String> excludeFields = new HashSet<>();
        excludeFields.add("name");
        // Calculate expected hash code manually, excluding 'name'
        int expected = 17;
        expected = expected * 37;
        expected += 1; // id
        expected = expected * 37;
        // name is excluded
        expected = expected * 37;
        expected += (true ? 1 : 0); // smoker
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(obj, excludeFields));
    }

    @Test
    public void testReflectionHashCodeWithObjectAndExcludeFieldsAndTransients() {
        Object obj = new TestObjectWithTransient(1, "test", true);
        String[] excludeFields = {"name"};
        boolean testTransients = true;
        // Calculate expected hash code manually, excluding 'name' and including transient field
        int expected = 17;
        expected = expected * 37;
        expected += 1; // id
        expected = expected * 37;
        // name is excluded
        expected = expected * 37;
        expected += (true ? 1 : 0); // smoker
        expected = expected * 37;
        expected += "transient".hashCode(); // transientField
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(17, 37, obj, testTransients, null, excludeFields));
    }
    
    @Test
    public void testReflectionHashCodeWithSuperClass() {
        SuperClass obj = new SubClass(1, "sub", true); // Corrected constructor call
        // Calculate expected hash code manually for SubClass, reflecting up to SuperClass.class
        int expected = 17;
        expected = expected * 37;
        expected += 1; // superClassField
        expected = expected * 37;
        expected += "sub".hashCode(); // subClassField1
        expected = expected * 37;
        expected += (true ? 1 : 0); // subClassField2
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(17, 37, obj, false, SuperClass.class, null));
    }
    
    @Test
    public void testReflectionHashCodeWithSuperClassAndTransients() {
        SuperClass obj = new SubClassWithTransient(1, "sub", true, 2.0);
        // Calculate expected hash code manually for SubClassWithTransient, reflecting up to SuperClass.class, including transients
        int expected = 17;
        expected = expected * 37;
        expected += 1; // superClassField
        expected = expected * 37;
        expected += "sub".hashCode(); // subClassField1
        expected = expected * 37;
        expected += (true ? 1 : 0); // subClassField2
        expected = expected * 37;
        expected += (int) Double.doubleToLongBits(2.0); // transientDoubleField
        assertEquals(expected, HashCodeBuilder.reflectionHashCode(17, 37, obj, true, SuperClass.class, null));
    }

    @Test
    public void testReflectionHashCodeWithNullObject() {
        try {
            HashCodeBuilder.reflectionHashCode(null);
            fail("Expected IllegalArgumentException for null object");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAppendArrayWithPrimitiveArray() {
        int[] intArray = {1, 2, 3};
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(intArray);
        assertEquals(builder.toHashCode(), new HashCodeBuilder().append(1).append(2).append(3).toHashCode());
    }

    @Test
    public void testAppendArrayWithObjectArray() {
        String[] stringArray = {"a", "b", "c"};
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(stringArray);
        assertEquals(builder.toHashCode(), new HashCodeBuilder().append("a").append("b").append("c").toHashCode());
    }

    @Test
    public void testAppendArrayWithMultiDimensionalArray() {
        int[][] multiDimArray = {{1, 2}, {3, 4}};
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(multiDimArray);
        // The append(Object) method handles multi-dimensional arrays by iterating through elements
        // For int[][], it will eventually call append(int[]) for each inner array, which then calls append(int) for each element.
        assertEquals(builder.toHashCode(), new HashCodeBuilder().append(1).append(2).append(3).append(4).toHashCode());
    }

    @Test
    public void testAppendArrayWithMultiDimensionalArrayNull() {
        int[][] multiDimArray = null;
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(multiDimArray); // Should treat null array as empty, resulting in no change to hash code
        assertEquals(builder.toHashCode(), new HashCodeBuilder().toHashCode());
    }

    // Test for internal registration/unregistration for cyclic references
    // This is hard to directly test with simple inputs as it requires a cyclic structure.
    // We can test a simple case where no cycle occurs.
    @Test
    public void testAppendObjectWithoutCycle() throws Exception {
        Object obj = new Object();
        HashCodeBuilder builder = new HashCodeBuilder(17, 37);
        int initialHash = builder.toHashCode();
        builder.append(obj);
        int hashAfterAppend = builder.toHashCode();
        // Ensure hash code changed as expected if obj.hashCode() is not 0 or builder.iTotal
        assertEquals(initialHash * 37 + obj.hashCode(), hashAfterAppend);
    }
}
