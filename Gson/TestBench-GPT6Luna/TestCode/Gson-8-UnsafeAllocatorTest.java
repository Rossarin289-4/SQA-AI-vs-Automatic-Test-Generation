package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class UnsafeAllocatorTest {
    @Test
    public void testCreateAllocatorIsNonNull() throws Exception {
        assertNotNull(UnsafeAllocator.create());
    }

    @Test
    public void testAllocatesClassWithPrivateConstructor() throws Exception {
        PrivateConstructor value = UnsafeAllocator.create().newInstance(PrivateConstructor.class);
        assertNotNull(value);
        assertEquals(0, value.value);
    }

    @Test
    public void testDoesNotInvokeConstructor() throws Exception {
        ConstructorCounter.count = 0;
        UnsafeAllocator.create().newInstance(ConstructorCounter.class);
        assertEquals(0, ConstructorCounter.count);
    }

    @Test
    public void testAllocatesClassWithArgumentsOnlyConstructor() throws Exception {
        ArgumentConstructor value = UnsafeAllocator.create().newInstance(ArgumentConstructor.class);
        assertEquals(0, value.value);
    }

    @Test
    public void testAllocatesClassWithNoExplicitConstructor() throws Exception {
        ImplicitConstructor value = UnsafeAllocator.create().newInstance(ImplicitConstructor.class);
        assertEquals(0, value.value);
    }

    @Test
    public void testAllocatesClassWithPrimitiveFieldsAtDefaults() throws Exception {
        PrimitiveFields value = UnsafeAllocator.create().newInstance(PrimitiveFields.class);
        assertEquals(false, value.flag);
        assertEquals((byte) 0, value.byteValue);
        assertEquals((short) 0, value.shortValue);
        assertEquals(0, value.intValue);
        assertEquals(0L, value.longValue);
        assertEquals(0.0f, value.floatValue, 0.0f);
        assertEquals(0.0, value.doubleValue, 0.0);
        assertEquals((char) 0, value.charValue);
    }

    @Test
    public void testAllocatesClassWithReferenceFieldsAtNull() throws Exception {
        ReferenceFields value = UnsafeAllocator.create().newInstance(ReferenceFields.class);
        assertNull(value.text);
        assertNull(value.object);
    }

    @Test
    public void testEachAllocationReturnsNewObject() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        PrivateConstructor first = allocator.newInstance(PrivateConstructor.class);
        PrivateConstructor second = allocator.newInstance(PrivateConstructor.class);
        assertNotSame(first, second);
    }

    @Test
    public void testRejectsInterface() throws Exception {
        try {
            UnsafeAllocator.create().newInstance(Runnable.class);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertTrue(expected.getMessage().contains(Runnable.class.getName()));
        }
    }

    @Test
    public void testRejectsAbstractClass() throws Exception {
        try {
            UnsafeAllocator.create().newInstance(AbstractValue.class);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertTrue(expected.getMessage().contains(AbstractValue.class.getName()));
        }
    }

    @Test
    public void testAllocatesEnumClass() throws Exception {
        EnumValue value = UnsafeAllocator.create().newInstance(EnumValue.class);
        assertNull(value.name);
    }

    private static class PrivateConstructor {
        int value = 7;
        private PrivateConstructor() {
        }
    }

    private static class ConstructorCounter {
        static int count;
        int value = 9;
        ConstructorCounter() {
            count++;
        }
    }

    private static class ArgumentConstructor {
        int value;
        ArgumentConstructor(int value) {
            this.value = value;
        }
    }

    private static class ImplicitConstructor {
        int value;
    }

    private static class PrimitiveFields {
        boolean flag = true;
        byte byteValue = 1;
        short shortValue = 1;
        int intValue = 1;
        long longValue = 1;
        float floatValue = 1;
        double doubleValue = 1;
        char charValue = 1;
    }

    private static class ReferenceFields {
        String text = "set";
        Object object = new Object();
    }

    private abstract static class AbstractValue {
        int value;
    }

    private enum EnumValue {
        VALUE;
        String name = "set";
    }
}
