package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class PrimitivesTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPrimitiveTypeOfBoolean() throws Exception {
        assertEquals(Boolean.TYPE, Primitives.primitiveTypeOf(Boolean.class));
    }

    @Test
    public void testPrimitiveTypeOfCharacter() throws Exception {
        assertEquals(Character.TYPE, Primitives.primitiveTypeOf(Character.class));
    }

    @Test
    public void testPrimitiveTypeOfByte() throws Exception {
        assertEquals(Byte.TYPE, Primitives.primitiveTypeOf(Byte.class));
    }

    @Test
    public void testPrimitiveTypeOfShort() throws Exception {
        assertEquals(Short.TYPE, Primitives.primitiveTypeOf(Short.class));
    }

    @Test
    public void testPrimitiveTypeOfInteger() throws Exception {
        assertEquals(Integer.TYPE, Primitives.primitiveTypeOf(Integer.class));
    }

    @Test
    public void testPrimitiveTypeOfLong() throws Exception {
        assertEquals(Long.TYPE, Primitives.primitiveTypeOf(Long.class));
    }

    @Test
    public void testPrimitiveTypeOfFloat() throws Exception {
        assertEquals(Float.TYPE, Primitives.primitiveTypeOf(Float.class));
    }

    @Test
    public void testPrimitiveTypeOfDouble() throws Exception {
        assertEquals(Double.TYPE, Primitives.primitiveTypeOf(Double.class));
    }

    @Test
    public void testPrimitiveTypeOfNonPrimitive() throws Exception {
        assertNull(Primitives.primitiveTypeOf(String.class));
    }

    @Test
    public void testPrimitiveTypeOfPrimitiveItself() throws Exception {
        assertEquals(int.class, Primitives.primitiveTypeOf(int.class));
    }

    @Test
    public void testIsPrimitiveWrapperBoolean() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
    }

    @Test
    public void testIsPrimitiveWrapperCharacter() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Character.class));
    }

    @Test
    public void testIsPrimitiveWrapperByte() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Byte.class));
    }

    @Test
    public void testIsPrimitiveWrapperShort() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Short.class));
    }

    @Test
    public void testIsPrimitiveWrapperInteger() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
    }

    @Test
    public void testIsPrimitiveWrapperLong() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Long.class));
    }

    @Test
    public void testIsPrimitiveWrapperFloat() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Float.class));
    }

    @Test
    public void testIsPrimitiveWrapperDouble() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Double.class));
    }

    @Test
    public void testIsPrimitiveWrapperNonWrapper() throws Exception {
        assertFalse(Primitives.isPrimitiveWrapper(String.class));
    }

    @Test
    public void testIsPrimitiveWrapperPrimitiveType() throws Exception {
        assertFalse(Primitives.isPrimitiveWrapper(int.class));
    }

    @Test
    public void testPrimitiveWrapperOfBoolean() throws Exception {
        assertEquals(false, Primitives.primitiveWrapperOf(Boolean.class));
    }

    @Test
    public void testPrimitiveWrapperOfCharacter() throws Exception {
        assertEquals('\u0000', Primitives.primitiveWrapperOf(Character.class));
    }

    @Test
    public void testPrimitiveWrapperOfByte() throws Exception {
        assertEquals((byte) 0, Primitives.primitiveWrapperOf(Byte.class));
    }

    @Test
    public void testPrimitiveWrapperOfShort() throws Exception {
        assertEquals((short) 0, Primitives.primitiveWrapperOf(Short.class));
    }

    @Test
    public void testPrimitiveWrapperOfInteger() throws Exception {
        assertEquals(0, Primitives.primitiveWrapperOf(Integer.class));
    }

    @Test
    public void testPrimitiveWrapperOfLong() throws Exception {
        assertEquals(0L, Primitives.primitiveWrapperOf(Long.class));
    }

    @Test
    public void testPrimitiveWrapperOfFloat() throws Exception {
        assertEquals(0F, Primitives.primitiveWrapperOf(Float.class));
    }

    @Test
    public void testPrimitiveWrapperOfDouble() throws Exception {
        assertEquals(0D, Primitives.primitiveWrapperOf(Double.class));
    }

    @Test
    public void testPrimitiveWrapperOfNonWrapper() throws Exception {
        assertNull(Primitives.primitiveWrapperOf(String.class));
    }

    @Test
    public void testPrimitiveValueOrNullForBoolean() throws Exception {
        assertEquals(false, Primitives.primitiveValueOrNullFor(boolean.class));
    }

    @Test
    public void testPrimitiveValueOrNullForChar() throws Exception {
        assertEquals('\u0000', Primitives.primitiveValueOrNullFor(char.class));
    }

    @Test
    public void testPrimitiveValueOrNullForByte() throws Exception {
        assertEquals((byte) 0, Primitives.primitiveValueOrNullFor(byte.class));
    }

    @Test
    public void testPrimitiveValueOrNullForShort() throws Exception {
        assertEquals((short) 0, Primitives.primitiveValueOrNullFor(short.class));
    }

    @Test
    public void testPrimitiveValueOrNullForInt() throws Exception {
        assertEquals(0, Primitives.primitiveValueOrNullFor(int.class));
    }

    @Test
    public void testPrimitiveValueOrNullForLong() throws Exception {
        assertEquals(0L, Primitives.primitiveValueOrNullFor(long.class));
    }

    @Test
    public void testPrimitiveValueOrNullForFloat() throws Exception {
        assertEquals(0F, Primitives.primitiveValueOrNullFor(float.class));
    }

    @Test
    public void testPrimitiveValueOrNullForDouble() throws Exception {
        assertEquals(0D, Primitives.primitiveValueOrNullFor(double.class));
    }

    @Test
    public void testPrimitiveValueOrNullForNonPrimitive() throws Exception {
        assertNull(Primitives.primitiveValueOrNullFor(String.class));
    }
}
