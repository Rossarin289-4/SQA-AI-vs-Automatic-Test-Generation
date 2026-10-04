package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.internal.util.Primitives;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockName;
import org.mockito.stubbing.Answer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.lang.reflect.Method;

public class ReturnsEmptyValuesTest {

    private static final String MOCK_NAME = "MockName";
    private static final String TYPE_NAME = "SomeType";

    private ReturnsEmptyValues returnsEmptyValues = new ReturnsEmptyValues();

    @Test
    public void testToStringWithDefaultMockName() throws Exception {
        // Mockito's MockUtil doesn't expose a simple way to create a mock for testing purposes directly.
        // We will mock the necessary components to simulate the behavior.
        Object mock = new Object(); // A simple object to represent the mock.

        MockUtil mockUtil = new MockUtil() {
            @Override
            public MockName getMockName(Object o) {
                return new MockName() {
                    @Override
                    public String toString() { return MOCK_NAME; }
                    @Override
                    public boolean isDefault() { return true; }
                };
            }

            @Override
            public ObjectMethodsGuru getObjectMethodsGuru() {
                return new ObjectMethodsGuru() {
                    @Override
                    public boolean isToString(Method method) {
                        return "toString".equals(method.getName());
                    }
                    @Override
                    public boolean isCompareToMethod(Method method) {
                        return false; // Not testing compareTo here
                    }
                };
            }

            @Override
            public ObjectMethodsGuru getObjectMethodsGuru(Object o) {
                 return getObjectMethodsGuru();
            }

            @Override
            public ObjectMethodsGuru getObjectMethodsGuru() {
                return new ObjectMethodsGuru() {
                    @Override
                    public boolean isToString(Method method) {
                        return "toString".equals(method.getName());
                    }

                    @Override
                    public boolean isCompareToMethod(Method method) {
                        return false; // Not testing compareTo here
                    }
                };
            }

            @Override
            public ObjectMethodsGuru getObjectMethodsGuru(Object o) {
                 return getObjectMethodsGuru();
            }
        };
        returnsEmptyValues.mockUtil = mockUtil;

        InvocationOnMock invocation = createInvocation(mock, mock.getClass().getMethod("toString"));

        String result = (String) returnsEmptyValues.answer(invocation);

        assertTrue(result.startsWith("Mock for " + TYPE_NAME + ", hashCode:"));
        assertTrue(result.contains(Integer.toString(mock.hashCode())));
    }

    @Test
    public void testToStringWithNamedMock() throws Exception {
        Object mock = new Object(); // A simple object to represent the mock.

        MockUtil mockUtil = new MockUtil() {
            @Override
            public MockName getMockName(Object o) {
                return new MockName() {
                    @Override
                    public String toString() { return MOCK_NAME; }
                    @Override
                    public boolean isDefault() { return false; }
                };
            }
             @Override
             public ObjectMethodsGuru getObjectMethodsGuru() {
                return new ObjectMethodsGuru() {
                    @Override
                    public boolean isToString(Method method) {
                        return "toString".equals(method.getName());
                    }
                    @Override
                    public boolean isCompareToMethod(Method method) {
                        return false; // Not testing compareTo here
                    }
                };
            }
        };
        returnsEmptyValues.mockUtil = mockUtil;

        InvocationOnMock invocation = createInvocation(mock, mock.getClass().getMethod("toString"));

        String result = (String) returnsEmptyValues.answer(invocation);
        assertEquals(MOCK_NAME, result);
    }

    @Test
    public void testCompareToSameReference() throws Exception {
        Object mock = new Object(); // Any object can be a mock for this test
        Method compareToMethod = findMethod(Object.class, "compareTo", Object.class); // Mocking compareTo for Object
        InvocationOnMock invocation = createInvocation(mock, compareToMethod, mock);
        assertEquals(0, returnsEmptyValues.answer(invocation));
    }

    @Test
    public void testCompareToDifferentReference() throws Exception {
        Object mock = new Object();
        Object otherObject = new Object();
        Method compareToMethod = findMethod(Object.class, "compareTo", Object.class); // Mocking compareTo for Object
        InvocationOnMock invocation = createInvocation(mock, compareToMethod, otherObject);
        assertEquals(1, returnsEmptyValues.answer(invocation));
    }

    @Test
    public void testBooleanPrimitiveReturn() throws Exception {
        assertEquals(false, returnsEmptyValues.returnValueFor(boolean.class));
    }

    @Test
    public void testBytePrimitiveReturn() throws Exception {
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(byte.class));
    }

    @Test
    public void testShortPrimitiveReturn() throws Exception {
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(short.class));
    }

    @Test
    public void testIntPrimitiveReturn() throws Exception {
        assertEquals(0, returnsEmptyValues.returnValueFor(int.class));
    }

    @Test
    public void testLongPrimitiveReturn() throws Exception {
        assertEquals(0L, returnsEmptyValues.returnValueFor(long.class));
    }

    @Test
    public void testFloatPrimitiveReturn() throws Exception {
        assertEquals(0.0f, returnsEmptyValues.returnValueFor(float.class), 1e-9f);
    }

    @Test
    public void testDoublePrimitiveReturn() throws Exception {
        assertEquals(0.0d, returnsEmptyValues.returnValueFor(double.class), 1e-9d);
    }

    @Test
    public void testCharPrimitiveReturn() throws Exception {
        assertEquals('\u0000', returnsEmptyValues.returnValueFor(char.class));
    }

    @Test
    public void testBooleanWrapperReturn() throws Exception {
        assertEquals(false, returnsEmptyValues.returnValueFor(Boolean.class));
    }

    @Test
    public void testByteWrapperReturn() throws Exception {
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(Byte.class));
    }

    @Test
    public void testShortWrapperReturn() throws Exception {
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(Short.class));
    }

    @Test
    public void testIntWrapperReturn() throws Exception {
        assertEquals(0, returnsEmptyValues.returnValueFor(Integer.class));
    }

    @Test
    public void testLongWrapperReturn() throws Exception {
        assertEquals(0L, returnsEmptyValues.returnValueFor(Long.class));
    }

    @Test
    public void testFloatWrapperReturn() throws Exception {
        assertEquals(0.0f, returnsEmptyValues.returnValueFor(Float.class), 1e-9f);
    }

    @Test
    public void testDoubleWrapperReturn() throws Exception {
        assertEquals(0.0d, returnsEmptyValues.returnValueFor(Double.class), 1e-9d);
    }

    @Test
    public void testCharWrapperReturn() throws Exception {
        assertEquals('\u0000', returnsEmptyValues.returnValueFor(Character.class));
    }

    @Test
    public void testStringReturn() throws Exception {
        assertNull(returnsEmptyValues.returnValueFor(String.class));
    }

    @Test
    public void testObjectReturn() throws Exception {
        assertNull(returnsEmptyValues.returnValueFor(Object.class));
    }

    @Test
    public void testCollectionReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(Collection.class);
        assertNotNull(result);
        assertTrue(result instanceof LinkedList);
        assertEquals(0, ((Collection<?>) result).size());
    }

    @Test
    public void testSetReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(Set.class);
        assertNotNull(result);
        assertTrue(result instanceof HashSet);
        assertEquals(0, ((Set<?>) result).size());
    }

    @Test
    public void testHashSetReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(HashSet.class);
        assertNotNull(result);
        assertTrue(result instanceof HashSet);
        assertEquals(0, ((HashSet<?>) result).size());
    }

    @Test
    public void testSortedSetReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(SortedSet.class);
        assertNotNull(result);
        assertTrue(result instanceof TreeSet);
        assertEquals(0, ((SortedSet<?>) result).size());
    }

    @Test
    public void testTreeSetReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(TreeSet.class);
        assertNotNull(result);
        assertTrue(result instanceof TreeSet);
        assertEquals(0, ((TreeSet<?>) result).size());
    }

    @Test
    public void testLinkedHashSetReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashSet.class);
        assertNotNull(result);
        assertTrue(result instanceof LinkedHashSet);
        assertEquals(0, ((LinkedHashSet<?>) result).size());
    }

    @Test
    public void testListReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(List.class);
        assertNotNull(result);
        assertTrue(result instanceof LinkedList);
        assertEquals(0, ((List<?>) result).size());
    }

    @Test
    public void testLinkedListReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(LinkedList.class);
        assertNotNull(result);
        assertTrue(result instanceof LinkedList);
        assertEquals(0, ((LinkedList<?>) result).size());
    }

    @Test
    public void testArrayListReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(ArrayList.class);
        assertNotNull(result);
        assertTrue(result instanceof ArrayList);
        assertEquals(0, ((ArrayList<?>) result).size());
    }

    @Test
    public void testMapReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(Map.class);
        assertNotNull(result);
        assertTrue(result instanceof HashMap);
        assertEquals(0, ((Map<?, ?>) result).size());
    }

    @Test
    public void testHashMapReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(HashMap.class);
        assertNotNull(result);
        assertTrue(result instanceof HashMap);
        assertEquals(0, ((HashMap<?, ?>) result).size());
    }

    @Test
    public void testSortedMapReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(SortedMap.class);
        assertNotNull(result);
        assertTrue(result instanceof TreeMap);
        assertEquals(0, ((SortedMap<?, ?>) result).size());
    }

    @Test
    public void testTreeMapReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(TreeMap.class);
        assertNotNull(result);
        assertTrue(result instanceof TreeMap);
        assertEquals(0, ((TreeMap<?, ?>) result).size());
    }

    @Test
    public void testLinkedHashMapReturn() throws Exception {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashMap.class);
        assertNotNull(result);
        assertTrue(result instanceof LinkedHashMap);
        assertEquals(0, ((LinkedHashMap<?, ?>) result).size());
    }

    // Helper method to create an InvocationOnMock
    private InvocationOnMock createInvocation(final Object mock, final Method method, final Object... args) {
        return new InvocationOnMock() {
            @Override
            public Object getMock() {
                return mock;
            }

            @Override
            public Method getMethod() {
                return method;
            }

            @Override
            public Object[] getArguments() {
                return args;
            }

            @Override
            public Object callRealMethod() throws Throwable {
                throw new UnsupportedOperationException("Not implemented for test");
            }
        };
    }

    // Helper method to find a method by name and argument types
    private Method findMethod(Class<?> clazz, String methodName, Class<?>... argTypes) throws NoSuchMethodException {
        return clazz.getMethod(methodName, argTypes);
    }
}
