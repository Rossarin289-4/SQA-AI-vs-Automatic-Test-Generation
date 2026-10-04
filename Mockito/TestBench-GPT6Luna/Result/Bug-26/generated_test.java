package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class PrimitivesTest {
    @Test
    public void testPrimitiveTypeOfPrimitiveBoolean() throws Exception {
        assertEquals(boolean.class, Primitives.primitiveTypeOf(boolean.class));
    }

    @Test
    public void testPrimitiveTypeOfWrapperInteger() throws Exception {
        assertEquals(int.class, Primitives.primitiveTypeOf(Integer.class));
    }

    @Test
    public void testPrimitiveTypeOfWrapperCharacter() throws Exception {
        assertEquals(char.class, Primitives.primitiveTypeOf(Character.class));
    }

    @Test
    public void testPrimitiveTypeOfWrapperDouble() throws Exception {
        assertEquals(double.class, Primitives.primitiveTypeOf(Double.class));
    }

    @Test
    public void testPrimitiveTypeOfUnmappedClass() throws Exception {
        assertNull(Primitives.primitiveTypeOf(String.class));
    }

    @Test
    public void testIsPrimitiveWrapperBoolean() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
    }

    @Test
    public void testIsPrimitiveWrapperNumeric() throws Exception {
        assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
    }

    @Test
    public void testPrimitiveClassIsNotPrimitiveWrapper() throws Exception {
        assertFalse(Primitives.isPrimitiveWrapper(int.class));
    }

    @Test
    public void testUnmappedClassIsNotPrimitiveWrapper() throws Exception {
        assertFalse(Primitives.isPrimitiveWrapper(String.class));
    }

    @Test
    public void testPrimitiveWrapperOfBoolean() throws Exception {
        assertEquals(Boolean.FALSE, Primitives.primitiveWrapperOf(Boolean.class));
    }

    @Test
    public void testPrimitiveWrapperOfCharacter() throws Exception {
        assertEquals(Character.valueOf('\u0000'), Primitives.primitiveWrapperOf(Character.class));
    }

    @Test
    public void testPrimitiveWrapperOfInteger() throws Exception {
        assertEquals(Integer.valueOf(0), Primitives.primitiveWrapperOf(Integer.class));
    }

    @Test
    public void testPrimitiveWrapperOfLong() throws Exception {
        assertEquals(Long.valueOf(0L), Primitives.primitiveWrapperOf(Long.class));
    }

    @Test
    public void testPrimitiveWrapperOfUnmappedType() throws Exception {
        assertNull(Primitives.primitiveWrapperOf(String.class));
    }

    @Test
    public void testPrimitiveValueOrNullForBoolean() throws Exception {
        assertEquals(Boolean.FALSE, Primitives.primitiveValueOrNullFor(boolean.class));
    }

    @Test
    public void testPrimitiveValueOrNullForCharacter() throws Exception {
        assertEquals(Character.valueOf('\u0000'), Primitives.primitiveValueOrNullFor(char.class));
    }

    @Test
    public void testPrimitiveValueOrNullForInt() throws Exception {
        assertEquals(Integer.valueOf(0), Primitives.primitiveValueOrNullFor(int.class));
    }

    @Test
    public void testPrimitiveValueOrNullForDouble() throws Exception {
        assertEquals(Double.valueOf(0.0), Primitives.primitiveValueOrNullFor(double.class));
    }

    @Test
    public void testPrimitiveValueOrNullForWrapperClass() throws Exception {
        assertNull(Primitives.primitiveValueOrNullFor(Integer.class));
    }

    @Test
    public void testPrimitiveValueOrNullForUnmappedPrimitive() throws Exception {
        assertNull(Primitives.primitiveValueOrNullFor(void.class));
    }
}
