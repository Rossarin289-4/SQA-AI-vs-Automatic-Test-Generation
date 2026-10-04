```java
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.math.NumberUtils;

public class BooleanUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNegate() throws Exception {
        assertEquals(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
        assertEquals(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
        assertNull(BooleanUtils.negate(null));
    }

    @Test
    public void testIsTrue() throws Exception {
        assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
        assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
        assertFalse(BooleanUtils.isTrue(null));
    }

    @Test
    public void testIsNotTrue() throws Exception {
        assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
        assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
        assertTrue(BooleanUtils.isNotTrue(null));
    }

    @Test
    public void testIsFalse() throws Exception {
        assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
        assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
        assertFalse(BooleanUtils.isFalse(null));
    }

    @Test
    public void testIsNotFalse() throws Exception {
        assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
        assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
        assertTrue(BooleanUtils.isNotFalse(null));
    }

    @Test
    public void testToBooleanObjectFromPrimitive() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(true));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(false));
    }

    @Test
    public void testToBooleanFromBoolean() throws Exception {
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
        assertFalse(BooleanUtils.toBoolean((Boolean) null));
    }

    @Test
    public void testToBooleanDefaultIfNull() throws Exception {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
    }

    @Test
    public void testToBooleanObjectIntegerZeroBoundary() throws Exception {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(0)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(1)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(-1)));
        assertNull(BooleanUtils.toBooleanObject((Integer) null));
    }

    @Test
    public void testToInteger() throws Exception {
        assertEquals(1, BooleanUtils.toInteger(true));
        assertEquals(0, BooleanUtils.toInteger(false));
    }

    @Test
    public void testToIntegerObject() throws Exception {
        assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(true));
        assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(false));
    }

    @Test
    public void testToStringTrueFalse() throws Exception {
        assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
        assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
        assertNull(BooleanUtils.toStringTrueFalse(null));
    }

    @Test
    public void testToStringOnOff() throws Exception {
        assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
        assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
        assertNull(BooleanUtils.toStringOnOff(null));
    }

    @Test
    public void testToStringYesNo() throws Exception {
        assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
        assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
        assertNull(BooleanUtils.toStringYesNo(null));
    }

    @Test
    public void testToStringWithCustomValues() throws Exception {
        assertEquals("yes", BooleanUtils.toString(Boolean.TRUE, "yes", "no", "nil"));
        assertEquals("no", BooleanUtils.toString(Boolean.FALSE, "yes", "no", "nil"));
        assertEquals("nil", BooleanUtils.toString(null, "yes", "no", "nil"));
        assertNull(BooleanUtils.toString(Boolean.TRUE, null, "no", "nil"));
    }

    @Test
    public void testXorSingleElementEdges() throws Exception {
        assertTrue(BooleanUtils.xor(new boolean[] { true }));
        assertFalse(BooleanUtils.xor(new boolean[] { false }));
    }

    @Test
    public void testXorMultipleElements() throws Exception {
        assertTrue(BooleanUtils.xor(new boolean[] { false, true, false }));
        assertFalse(BooleanUtils.xor(new boolean[] { false, false }));
        assertFalse(BooleanUtils.xor(new boolean[] { true, true }));
    }

    @Test
    public void testXorRejectsNullArray() throws Exception {
        try {
            BooleanUtils.xor((boolean[]) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testXorRejectsEmptyArray() throws Exception {
        try {
            BooleanUtils.xor(new boolean[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
```