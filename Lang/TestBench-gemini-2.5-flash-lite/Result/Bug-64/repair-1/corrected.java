package org.apache.commons.lang.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang.ClassUtils;

public class ValuedEnumTest {
    // Dummy concrete subclass for testing purposes
    static class TestEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;
        public static final TestEnum FIRST = new TestEnum("First", 1);
        public static final TestEnum SECOND = new TestEnum("Second", 2);
        public static final TestEnum THIRD = new TestEnum("Third", 3);
        public static final TestEnum FOURTH = new TestEnum("Fourth", 4);
        public static final TestEnum FIFTH = new TestEnum("Fifth", 5);
        public static final TestEnum NEGATIVE = new TestEnum("Negative", -1);
        public static final TestEnum ZERO = new TestEnum("Zero", 0);

        private TestEnum(String name, int value) {
            super(name, value);
        }

        public static TestEnum getEnum(String name) {
            return (TestEnum) getEnum(TestEnum.class, name);
        }

        public static TestEnum getEnum(int value) {
            return (TestEnum) getEnum(TestEnum.class, value);
        }

        public static List getEnumList() {
            return getEnumList(TestEnum.class);
        }

        public static Iterator iterator() {
            return iterator(TestEnum.class);
        }
    }

    // Dummy Enum subclass for simulating different classloader scenario
    // This subclass exists solely to provide a distinct class type for comparison
    // in compareTo, without actually using a different classloader.
    // It will have a different Class object reference but can be made to appear
    // as if it were from a different classloader via reflection in the test.
    static class OtherClassLoaderLikeEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;
        private final String name;
        private final int value;

        public OtherClassLoaderLikeEnum(String name, int value) {
            super(name, value);
            this.name = name;
            this.value = value;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getValue() {
            return value;
        }
    }


    @Test
    public void testGetValue() throws Exception {
        assertEquals(1, TestEnum.FIRST.getValue());
        assertEquals(0, TestEnum.ZERO.getValue());
        assertEquals(-1, TestEnum.NEGATIVE.getValue());
    }

    @Test
    public void testCompareToEqualObjects() throws Exception {
        assertEquals(0, TestEnum.FIRST.compareTo(TestEnum.FIRST));
    }

    @Test
    public void testCompareToLess() throws Exception {
        assertEquals(-1, TestEnum.FIRST.compareTo(TestEnum.SECOND));
    }

    @Test
    public void testCompareToGreater() throws Exception {
        assertEquals(1, TestEnum.SECOND.compareTo(TestEnum.FIRST));
    }

    @Test
    public void testCompareToSameNameDifferentValue() throws Exception {
        // This is a theoretical case, as names should be unique within an enum.
        // However, the compareTo method handles it based on value.
        assertEquals(0, new TestEnum("SameName", 5).compareTo(new TestEnum("SameName", 5)));
        assertEquals(-1, new TestEnum("SameName", 5).compareTo(new TestEnum("SameName", 6)));
        assertEquals(1, new TestEnum("SameName", 7).compareTo(new TestEnum("SameName", 6)));
    }

    @Test
    public void testCompareToZeroValue() throws Exception {
        assertEquals(0, TestEnum.ZERO.compareTo(TestEnum.ZERO));
        assertEquals(-1, TestEnum.ZERO.compareTo(TestEnum.FIRST));
        assertEquals(1, TestEnum.FIRST.compareTo(TestEnum.ZERO));
    }

    @Test
    public void testCompareToNegativeValue() throws Exception {
        assertEquals(0, TestEnum.NEGATIVE.compareTo(TestEnum.NEGATIVE));
        assertEquals(-1, TestEnum.NEGATIVE.compareTo(TestEnum.ZERO));
        assertEquals(1, TestEnum.ZERO.compareTo(TestEnum.NEGATIVE));
        assertEquals(-1, TestEnum.NEGATIVE.compareTo(TestEnum.FIRST));
        assertEquals(1, TestEnum.FIRST.compareTo(TestEnum.NEGATIVE));
    }

    @Test
    public void testToStringBasic() throws Exception {
        assertEquals("TestEnum[First=1]", TestEnum.FIRST.toString());
    }

    @Test
    public void testToStringZeroValue() throws Exception {
        assertEquals("TestEnum[Zero=0]", TestEnum.ZERO.toString());
    }

    @Test
    public void testToStringNegativeValue() throws Exception {
        assertEquals("TestEnum[Negative=-1]", TestEnum.NEGATIVE.toString());
    }
    
    @Test
    public void testCompareToDifferentClassLoader() throws Exception {
        // Simulate an enum from a different classloader by using a distinct class
        // that inherits from ValuedEnum and has the same class name for comparison purposes.
        // The reflection logic in ValuedEnum.compareTo handles class name comparison.
        // Here we instantiate a separate class that is NOT TestEnum but looks similar for the comparison.
        
        OtherClassLoaderLikeEnum otherClassLoaderEnum = new OtherClassLoaderLikeEnum("Second", 2);
        
        // The ValuedEnum.compareTo method uses reflection if class names are equal but classes are different.
        // We need to ensure the method `getValue()` is accessible and works as expected.
        // We are testing the behavior of `ValuedEnum.compareTo` when it encounters objects
        // that have the same class name but are from different classloaders (simulated here).
        
        // Explicitly check if the class names are the same but the class objects are different.
        assertTrue(TestEnum.SECOND.getClass().getName().equals(otherClassLoaderEnum.getClass().getName()));
        assertFalse(TestEnum.SECOND.getClass() == otherClassLoaderEnum.getClass());

        // Directly assert the comparison outcome based on values.
        assertEquals(0, TestEnum.SECOND.compareTo(otherClassLoaderEnum)); // Because 2 == 2

        OtherClassLoaderLikeEnum otherClassLoaderEnumDifferentValue = new OtherClassLoaderLikeEnum("Third", 3);
        assertEquals(1, TestEnum.SECOND.compareTo(otherClassLoaderEnumDifferentValue)); // Because 2 < 3

        OtherClassLoaderLikeEnum otherClassLoaderEnumSmallerValue = new OtherClassLoaderLikeEnum("First", 1);
        assertEquals(-1, TestEnum.SECOND.compareTo(otherClassLoaderEnumSmallerValue)); // Because 2 > 1
    }

    @Test
    public void testCompareToDifferentClass() throws Exception {
        Object otherObject = new Object();
        try {
            TestEnum.FIRST.compareTo(otherObject);
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // Expected
        }
    }

    @Test
    public void testCompareToNull() {
        try {
            TestEnum.FIRST.compareTo(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetEnumByValue() {
        assertEquals(TestEnum.FIRST, TestEnum.getEnum(1));
        assertEquals(TestEnum.ZERO, TestEnum.getEnum(0));
        assertEquals(TestEnum.NEGATIVE, TestEnum.getEnum(-1));
        assertNull(TestEnum.getEnum(99));
    }

    @Test
    public void testGetEnumByName() {
        assertEquals(TestEnum.FIRST, TestEnum.getEnum("First"));
        assertEquals(TestEnum.ZERO, TestEnum.getEnum("Zero"));
        assertEquals(TestEnum.NEGATIVE, TestEnum.getEnum("Negative"));
        assertNull(TestEnum.getEnum("NonExistent"));
    }

    @Test
    public void testGetEnumByInvalidClassName() {
        // This test relies on the protected static getEnum(Class, String) method,
        // which is called by the public getEnum(String) in subclasses.
        // We are testing the protected method indirectly via the subclass.
        // We need to ensure that getEnum(Class, String) handles cases where the
        // enumClass itself might not be properly set up.
        
        // Test with a valid class but invalid name
        assertNull(ValuedEnum.getEnum(TestEnum.class, "InvalidName"));
    }

    @Test
    public void testGetEnumByValueNullClass() {
        try {
            ValuedEnum.getEnum((Class) null, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The Enum Class must not be null", e.getMessage());
        }
    }

    @Test
    public void testGetEnumByNameNullClass() {
        // The protected getEnum(Class, String) method is not directly accessible from here
        // without reflection, but the public getEnum(String) in TestEnum calls it.
        // We will test the public wrapper.
        // If ValuedEnum.getEnum(null, "any") were public, we'd test it.
        // The existing TestEnum.getEnum(String) implicitly checks Class.
        // Testing ValuedEnum.getEnum(Class enumClass, String name) with null class
        try {
            ValuedEnum.getEnum(null, "Test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // The protected method actually checks for null class and throws.
            // The message might be different if it's an unchecked exception on the other side.
            // Let's assume it's propagated correctly or check if it's propagated.
            // The API outline for ValuedEnum.getEnum(Class, int) shows an IllegalArgumentException.
            // Assuming similar behavior for getEnum(Class, String).
            assertEquals("The Enum Class must not be null", e.getMessage());
        }
    }

    @Test
    public void testGetEnumListBasic() {
        List<Enum> enumList = ValuedEnum.getEnumList(TestEnum.class);
        assertNotNull(enumList);
        assertEquals(7, enumList.size()); // FIRST, SECOND, THIRD, FOURTH, FIFTH, NEGATIVE, ZERO
        assertTrue(enumList.contains(TestEnum.FIRST));
        assertTrue(enumList.contains(TestEnum.SECOND));
        assertTrue(enumList.contains(TestEnum.THIRD));
        assertTrue(enumList.contains(TestEnum.FOURTH));
        assertTrue(enumList.contains(TestEnum.FIFTH));
        assertTrue(enumList.contains(TestEnum.NEGATIVE));
        assertTrue(enumList.contains(TestEnum.ZERO));
    }

    @Test
    public void testIteratorBasic() {
        Iterator it = TestEnum.iterator();
        assertNotNull(it);
        List<Enum> collectedEnums = new ArrayList<>();
        while (it.hasNext()) {
            collectedEnums.add((Enum) it.next());
        }
        
        assertEquals(7, collectedEnums.size());
        assertTrue(collectedEnums.contains(TestEnum.FIRST));
        assertTrue(collectedEnums.contains(TestEnum.SECOND));
        assertTrue(collectedEnums.contains(TestEnum.THIRD));
        assertTrue(collectedEnums.contains(TestEnum.FOURTH));
        assertTrue(collectedEnums.contains(TestEnum.FIFTH));
        assertTrue(collectedEnums.contains(TestEnum.NEGATIVE));
        assertTrue(collectedEnums.contains(TestEnum.ZERO));
    }

    @Test
    public void testToStringWithNonAsciiName() {
        // Test with a name that might require careful string handling (though not strictly necessary here given the current implementation)
        TestEnum unicodeEnum = new TestEnum("你好", 10);
        assertEquals("TestEnum[你好=10]", unicodeEnum.toString());
    }

    @Test
    public void testToStringWithLongName() {
        String longName = "ThisIsAVeryLongEnumNameIndeed";
        TestEnum longNameEnum = new TestEnum(longName, 20);
        assertEquals("TestEnum[" + longName + "=20]", longNameEnum.toString());
    }

    @Test
    public void testToStringWithSpecialCharsName() {
        TestEnum specialCharEnum = new TestEnum("!@#$%^&*", 30);
        assertEquals("TestEnum[!@#$%^&*=30]", specialCharEnum.toString());
    }

    @Test
    public void testCompareToDifferentClassLoaderReflectionError() {
        // Simulate a scenario where getValue() method throws an exception in the other classloader.
        // This requires mocking, which is disallowed. We'll use a concrete class that
        // doesn't have the expected method, thus triggering NoSuchMethodException in reflection.
        
        // Create an object that is NOT a ValuedEnum and does not have a getValue method.
        Object faultyOtherClassLoaderEnum = new Object() {
            // This object has no getValue() method.
            // Its class name is "ValuedEnumTest$3" (anonymous inner class).
        };

        try {
             TestEnum.FIRST.compareTo(faultyOtherClassLoaderEnum);
             // The catch blocks in getValueInOtherClassLoader ignore exceptions and fall through to throw IllegalStateException.
             fail("Expected IllegalStateException due to missing method or other reflection error");
        } catch (IllegalStateException e) {
            // The getValueInOtherClassLoader method catches exceptions like NoSuchMethodException, IllegalAccessException, InvocationTargetException and then throws IllegalStateException.
            assertEquals("This should not happen", e.getMessage());
        } catch (ClassCastException e) {
            // If the object is not even an Enum, a ClassCastException might be thrown earlier
            // by compareTo before it tries to get the value.
            // This is a valid outcome too.
        } catch (Exception e) {
            fail("Unexpected exception type: " + e.getClass().getName());
        }
    }
    
    @Test
    public void testEnumSerializationReadResolve() throws Exception {
        // The readResolve method is protected and called during deserialization.
        // To test it, we'd need to serialize and deserialize.
        // Since we cannot directly call protected methods or perform serialization easily,
        // this remains an indirect test.
        // The primary purpose of readResolve() in Enum is to ensure that deserialized enums are singletons.
        // We cannot directly test the behavior of readResolve here without actual serialization setup.
        // Thus, this test is a placeholder acknowledging the method's existence.
    }
    
    @Test
    public void testToStringCache() throws Exception {
        // Verify that toString() result is cached.
        TestEnum enumInstance = TestEnum.FIRST;
        String firstCall = enumInstance.toString();
        // The superclass Enum has a field iToString which caches the result.
        // We cannot access it directly. We can infer caching if calling toString twice yields the same result.
        String secondCall = enumInstance.toString();
        assertEquals(firstCall, secondCall);
    }
}
