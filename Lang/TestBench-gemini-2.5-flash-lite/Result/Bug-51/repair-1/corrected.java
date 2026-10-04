package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.math.NumberUtils;

public class BooleanUtilsTest {

    @Test
    public void testNegateTrue() throws Exception {
        assertEquals(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
    }

    @Test
    public void testNegateFalse() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
    }

    @Test
    public void testNegateNull() throws Exception {
        assertNull(BooleanUtils.negate(null));
    }

    @Test
    public void testIsTrueTrue() throws Exception {
        assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
    }

    @Test
    public void testIsTrueFalse() throws Exception {
        assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
    }

    @Test
    public void testIsTrueNull() throws Exception {
        assertFalse(BooleanUtils.isTrue(null));
    }

    @Test
    public void testIsNotTrueTrue() throws Exception {
        assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
    }

    @Test
    public void testIsNotTrueFalse() throws Exception {
        assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
    }

    @Test
    public void testIsNotTrueNull() throws Exception {
        assertTrue(BooleanUtils.isNotTrue(null));
    }

    @Test
    public void testIsFalseTrue() throws Exception {
        assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
    }

    @Test
    public void testIsFalseFalse() throws Exception {
        assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
    }

    @Test
    public void testIsFalseNull() throws Exception {
        assertFalse(BooleanUtils.isFalse(null));
    }

    @Test
    public void testIsNotFalseTrue() throws Exception {
        assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
    }

    @Test
    public void testIsNotFalseFalse() throws Exception {
        assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
    }

    @Test
    public void testIsNotFalseNull() throws Exception {
        assertTrue(BooleanUtils.isNotFalse(null));
    }

    @Test
    public void testToBooleanObjectPrimitiveTrue() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(true));
    }

    @Test
    public void testToBooleanObjectPrimitiveFalse() throws Exception {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(false));
    }

    @Test
    public void testToBooleanBooleanTrue() throws Exception {
        assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
    }

    @Test
    public void testToBooleanBooleanFalse() throws Exception {
        assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
    }

    @Test
    public void testToBooleanBooleanNull() throws Exception {
        assertFalse(BooleanUtils.toBoolean((Boolean) null));
    }

    @Test
    public void testToBooleanDefaultIfNullTrueTrue() throws Exception {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, true));
    }

    @Test
    public void testToBooleanDefaultIfNullFalseTrue() throws Exception {
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
    }

    @Test
    public void testToBooleanDefaultIfNullNullTrue() throws Exception {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(null, true));
    }

    @Test
    public void testToBooleanDefaultIfNullTrueFalse() throws Exception {
        assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
    }

    @Test
    public void testToBooleanDefaultIfNullFalseFalse() throws Exception {
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, false));
    }

    @Test
    public void testToBooleanDefaultIfNullNullFalse() throws Exception {
        assertFalse(BooleanUtils.toBooleanDefaultIfNull(null, false));
    }

    @Test
    public void testToBooleanIntZero() throws Exception {
        assertFalse(BooleanUtils.toBoolean(0));
    }

    @Test
    public void testToBooleanIntNonZero() throws Exception {
        assertTrue(BooleanUtils.toBoolean(1));
        assertTrue(BooleanUtils.toBoolean(-1));
        assertTrue(BooleanUtils.toBoolean(Integer.MAX_VALUE));
        assertTrue(BooleanUtils.toBoolean(Integer.MIN_VALUE));
    }

    @Test
    public void testToBooleanObjectIntZero() throws Exception {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
    }

    @Test
    public void testToBooleanObjectIntNonZero() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(-1));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.MAX_VALUE));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.MIN_VALUE));
    }

    @Test
    public void testToBooleanObjectIntegerZero() throws Exception {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(0)));
    }

    @Test
    public void testToBooleanObjectIntegerNonZero() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(1)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(-1)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(Integer.MAX_VALUE)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(Integer.MIN_VALUE)));
    }

    @Test
    public void testToBooleanObjectIntegerNull() throws Exception {
        assertNull(BooleanUtils.toBooleanObject((Integer) null));
    }

    @Test
    public void testToBooleanIntTrueValueFalseValueMatch() throws Exception {
        assertTrue(BooleanUtils.toBoolean(1, 1, 0));
        assertFalse(BooleanUtils.toBoolean(0, 1, 0));
    }

    @Test
    public void testToBooleanIntTrueValueFalseValueNoMatch() throws Exception {
        try {
            BooleanUtils.toBoolean(2, 1, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToBooleanIntegerTrueValueFalseValueMatch() throws Exception {
        assertTrue(BooleanUtils.toBoolean(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0)));
        assertFalse(BooleanUtils.toBoolean(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0)));
    }

    @Test
    public void testToBooleanIntegerTrueValueFalseValueNullMatch() throws Exception {
        assertTrue(BooleanUtils.toBoolean(null, null, Integer.valueOf(0)));
        assertFalse(BooleanUtils.toBoolean(null, Integer.valueOf(1), null));
    }

    @Test
    public void testToBooleanIntegerTrueValueFalseValueNoMatch() throws Exception {
        try {
            BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
    
    @Test
    public void testToBooleanIntegerTrueValueFalseValueNullNoMatch() throws Exception {
        try {
            BooleanUtils.toBoolean(Integer.valueOf(2), null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToBooleanObjectIntTrueValueFalseValueNullValueMatch() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(0, 0, 2, 3));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(2, 1, 2, 3));
        assertNull(BooleanUtils.toBooleanObject(3, 1, 2, 3));
    }

    @Test
    public void testToBooleanObjectIntTrueValueFalseValueNullValueNoMatch() throws Exception {
        try {
            BooleanUtils.toBooleanObject(4, 1, 2, 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToBooleanObjectIntegerTrueValueFalseValueNullValueMatch() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3)));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)));
        assertNull(BooleanUtils.toBooleanObject(Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)));
    }

    @Test
    public void testToBooleanObjectIntegerTrueValueFalseValueNullValueNullMatch() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, Integer.valueOf(0), Integer.valueOf(1)));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(null, Integer.valueOf(1), null, Integer.valueOf(0)));
        assertNull(BooleanUtils.toBooleanObject(null, Integer.valueOf(1), Integer.valueOf(0), null));
    }

    @Test
    public void testToBooleanObjectIntegerTrueValueFalseValueNullValueNoMatch() throws Exception {
        try {
            BooleanUtils.toBooleanObject(Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
    
    @Test
    public void testToBooleanObjectIntegerTrueValueFalseValueNullValueNullNoMatch() throws Exception {
        try {
            BooleanUtils.toBooleanObject(Integer.valueOf(4), null, null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToIntegerPrimitiveTrue() throws Exception {
        assertEquals(1, BooleanUtils.toInteger(true));
    }

    @Test
    public void testToIntegerPrimitiveFalse() throws Exception {
        assertEquals(0, BooleanUtils.toInteger(false));
    }

    @Test
    public void testToIntegerObjectPrimitiveTrue() throws Exception {
        assertEquals(NumberUtils.INTEGER_ONE, BooleanUtils.toIntegerObject(true));
    }

    @Test
    public void testToIntegerObjectPrimitiveFalse() throws Exception {
        assertEquals(NumberUtils.INTEGER_ZERO, BooleanUtils.toIntegerObject(false));
    }

    @Test
    public void testToIntegerObjectBooleanTrue() throws Exception {
        assertEquals(NumberUtils.INTEGER_ONE, BooleanUtils.toIntegerObject(Boolean.TRUE));
    }

    @Test
    public void testToIntegerObjectBooleanFalse() throws Exception {
        assertEquals(NumberUtils.INTEGER_ZERO, BooleanUtils.toIntegerObject(Boolean.FALSE));
    }

    @Test
    public void testToIntegerObjectBooleanNull() throws Exception {
        assertNull(BooleanUtils.toIntegerObject((Boolean) null));
    }

    @Test
    public void testToIntegerPrimitiveTrueValueFalseValue() throws Exception {
        assertEquals(1, BooleanUtils.toInteger(true, 1, 0));
        assertEquals(0, BooleanUtils.toInteger(false, 1, 0));
    }

    @Test
    public void testToIntegerPrimitiveTrueValueFalseValueDifferent() throws Exception {
        assertEquals(5, BooleanUtils.toInteger(true, 5, 10));
        assertEquals(10, BooleanUtils.toInteger(false, 5, 10));
    }

    @Test
    public void testToIntegerBooleanTrueValueFalseValueNullValue() throws Exception {
        assertEquals(1, BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2));
        assertEquals(0, BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2));
        assertEquals(2, BooleanUtils.toInteger(null, 1, 0, 2));
    }

    @Test
    public void testToIntegerBooleanTrueValueFalseValueNullValueDifferent() throws Exception {
        assertEquals(5, BooleanUtils.toInteger(Boolean.TRUE, 5, 10, 15));
        assertEquals(10, BooleanUtils.toInteger(Boolean.FALSE, 5, 10, 15));
        assertEquals(15, BooleanUtils.toInteger(null, 5, 10, 15));
    }

    @Test
    public void testToIntegerObjectBooleanTrueValueFalseValue() throws Exception {
        assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(true, Integer.valueOf(1), Integer.valueOf(0)));
        assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(false, Integer.valueOf(1), Integer.valueOf(0)));
    }

    @Test
    public void testToIntegerObjectBooleanTrueValueFalseValueDifferent() throws Exception {
        assertEquals(Integer.valueOf(5), BooleanUtils.toIntegerObject(true, Integer.valueOf(5), Integer.valueOf(10)));
        assertEquals(Integer.valueOf(10), BooleanUtils.toIntegerObject(false, Integer.valueOf(5), Integer.valueOf(10)));
    }

    @Test
    public void testToIntegerObjectBooleanTrueValueFalseValueNullValue() throws Exception {
        assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(Boolean.TRUE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)));
        assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(Boolean.FALSE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)));
        assertEquals(Integer.valueOf(2), BooleanUtils.toIntegerObject(null, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)));
    }

    @Test
    public void testToIntegerObjectBooleanTrueValueFalseValueNullValueDifferent() throws Exception {
        assertEquals(Integer.valueOf(5), BooleanUtils.toIntegerObject(Boolean.TRUE, Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(15)));
        assertEquals(Integer.valueOf(10), BooleanUtils.toIntegerObject(Boolean.FALSE, Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(15)));
        assertEquals(Integer.valueOf(15), BooleanUtils.toIntegerObject(null, Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(15)));
    }

    @Test
    public void testToBooleanObjectStringTrue() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TRUE"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("On"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("ON"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("YES"));
    }

    @Test
    public void testToBooleanObjectStringFalse() throws Exception {
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("FALSE"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("Off"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("OFF"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("NO"));
    }

    @Test
    public void testToBooleanObjectStringNull() throws Exception {
        assertNull(BooleanUtils.toBooleanObject((String) null));
        assertNull(BooleanUtils.toBooleanObject("blue"));
        assertNull(BooleanUtils.toBooleanObject(""));
    }

    @Test
    public void testToBooleanObjectStringTrueStringFalseStringNullStringMatch() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true", "true", "false", "null"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false", "true", "false", "null"));
        assertNull(BooleanUtils.toBooleanObject("null", "true", "false", "null"));
    }

    @Test
    public void testToBooleanObjectStringTrueStringFalseStringNullStringNullMatch() throws Exception {
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(null, null, "false", "null"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(null, "true", null, "null"));
        assertNull(BooleanUtils.toBooleanObject(null, "true", "false", null));
    }

    @Test
    public void testToBooleanObjectStringTrueStringFalseStringNullStringNoMatch() throws Exception {
        try {
            BooleanUtils.toBooleanObject("other", "true", "false", "null");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToBooleanObjectStringTrueStringFalseStringNullStringNullNoMatch() throws Exception {
        try {
            BooleanUtils.toBooleanObject("other", null, null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToBooleanStringTrue() throws Exception {
        assertTrue(BooleanUtils.toBoolean("true"));
        assertTrue(BooleanUtils.toBoolean("TRUE"));
        assertTrue(BooleanUtils.toBoolean("tRuE"));
        assertTrue(BooleanUtils.toBoolean("on"));
        assertTrue(BooleanUtils.toBoolean("ON"));
        assertTrue(BooleanUtils.toBoolean("yes"));
        assertTrue(BooleanUtils.toBoolean("YES"));
    }

    @Test
    public void testToBooleanStringFalse() throws Exception {
        assertFalse(BooleanUtils.toBoolean("false"));
        assertFalse(BooleanUtils.toBoolean("FALSE"));
        assertFalse(BooleanUtils.toBoolean("off"));
        assertFalse(BooleanUtils.toBoolean("OFF"));
        assertFalse(BooleanUtils.toBoolean("no"));
        assertFalse(BooleanUtils.toBoolean("NO"));
    }

    @Test
    public void testToBooleanStringNull() throws Exception {
        assertFalse(BooleanUtils.toBoolean((String) null));
    }

    @Test
    public void testToBooleanStringNonMatch() throws Exception {
        assertFalse(BooleanUtils.toBoolean("blue"));
        assertFalse(BooleanUtils.toBoolean(""));
        assertFalse(BooleanUtils.toBoolean("tru"));
        assertFalse(BooleanUtils.toBoolean("yesa"));
        assertFalse(BooleanUtils.toBoolean("onm"));
    }

    @Test
    public void testToBooleanStringTrueStringFalseStringMatch() throws Exception {
        assertTrue(BooleanUtils.toBoolean("true", "true", "false"));
        assertFalse(BooleanUtils.toBoolean("false", "true", "false"));
    }

    @Test
    public void testToBooleanStringTrueStringFalseStringNullMatch() throws Exception {
        assertTrue(BooleanUtils.toBoolean(null, null, "false"));
        assertFalse(BooleanUtils.toBoolean(null, "true", null));
    }

    @Test
    public void testToBooleanStringTrueStringFalseStringNoMatch() throws Exception {
        try {
            BooleanUtils.toBoolean("other", "true", "false");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToBooleanStringTrueStringFalseStringNullNoMatch() throws Exception {
        try {
            BooleanUtils.toBoolean("other", null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToStringTrueFalseBooleanTrue() throws Exception {
        assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
    }

    @Test
    public void testToStringTrueFalseBooleanFalse() throws Exception {
        assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
    }

    @Test
    public void testToStringTrueFalseBooleanNull() throws Exception {
        assertNull(BooleanUtils.toStringTrueFalse(null));
    }

    @Test
    public void testToStringOnOffBooleanTrue() throws Exception {
        assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
    }

    @Test
    public void testToStringOnOffBooleanFalse() throws Exception {
        assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
    }

    @Test
    public void testToStringOnOffBooleanNull() throws Exception {
        assertNull(BooleanUtils.toStringOnOff(null));
    }

    @Test
    public void testToStringYesNoBooleanTrue() throws Exception {
        assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
    }

    @Test
    public void testToStringYesNoBooleanFalse() throws Exception {
        assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
    }

    @Test
    public void testToStringYesNoBooleanNull() throws Exception {
        assertNull(BooleanUtils.toStringYesNo(null));
    }

    @Test
    public void testToStringBooleanStringTrueStringFalseStringNullString() throws Exception {
        assertEquals("true", BooleanUtils.toString(Boolean.TRUE, "true", "false", null));
        assertEquals("false", BooleanUtils.toString(Boolean.FALSE, "true", "false", null));
        assertNull(BooleanUtils.toString(null, "true", "false", null));
    }

    @Test
    public void testToStringBooleanStringTrueStringFalseStringNullStringDifferent() throws Exception {
        assertEquals("yes", BooleanUtils.toString(Boolean.TRUE, "yes", "no", "maybe"));
        assertEquals("no", BooleanUtils.toString(Boolean.FALSE, "yes", "no", "maybe"));
        assertEquals("maybe", BooleanUtils.toString(null, "yes", "no", "maybe"));
    }

    @Test
    public void testToStringBooleanStringTrueStringFalseStringNullStringNulls() throws Exception {
        assertEquals("true", BooleanUtils.toString(Boolean.TRUE, "true", null, null));
        assertEquals(null, BooleanUtils.toString(Boolean.FALSE, "true", null, null));
        assertEquals(null, BooleanUtils.toString(null, "true", null, null));
    }

    @Test
    public void testToStringPrimitiveTrue() throws Exception {
        assertEquals("true", BooleanUtils.toStringTrueFalse(true));
    }

    @Test
    public void testToStringPrimitiveFalse() throws Exception {
        assertEquals("false", BooleanUtils.toStringTrueFalse(false));
    }

    @Test
    public void testToStringOnOffPrimitiveTrue() throws Exception {
        assertEquals("on", BooleanUtils.toStringOnOff(true));
    }

    @Test
    public void testToStringOnOffPrimitiveFalse() throws Exception {
        assertEquals("off", BooleanUtils.toStringOnOff(false));
    }

    @Test
    public void testToStringYesNoPrimitiveTrue() throws Exception {
        assertEquals("yes", BooleanUtils.toStringYesNo(true));
    }

    @Test
    public void testToStringYesNoPrimitiveFalse() throws Exception {
        assertEquals("no", BooleanUtils.toStringYesNo(false));
    }

    @Test
    public void testToStringPrimitiveTrueStringFalseString() throws Exception {
        assertEquals("true", BooleanUtils.toString(true, "true", "false"));
        assertEquals("false", BooleanUtils.toString(false, "true", "false"));
    }

    @Test
    public void testToStringPrimitiveTrueStringFalseStringDifferent() throws Exception {
        assertEquals("yes", BooleanUtils.toString(true, "yes", "no"));
        assertEquals("no", BooleanUtils.toString(false, "yes", "no"));
    }

    @Test
    public void testXorBooleanArrayEmpty() {
        try {
            BooleanUtils.xor(new boolean[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testXorBooleanArrayNull() {
        try {
            BooleanUtils.xor((boolean[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testXorBooleanArrayTrueTrue() {
        assertFalse(BooleanUtils.xor(new boolean[]{true, true}));
    }

    @Test
    public void testXorBooleanArrayFalseFalse() {
        assertFalse(BooleanUtils.xor(new boolean[]{false, false}));
    }

    @Test
    public void testXorBooleanArrayTrueFalse() {
        assertTrue(BooleanUtils.xor(new boolean[]{true, false}));
    }

    @Test
    public void testXorBooleanArrayFalseTrue() {
        assertTrue(BooleanUtils.xor(new boolean[]{false, true}));
    }

    @Test
    public void testXorBooleanArrayThreeTrues() {
        assertFalse(BooleanUtils.xor(new boolean[]{true, true, true}));
    }

    @Test
    public void testXorBooleanArrayTwoTruesOneFalse() {
        assertFalse(BooleanUtils.xor(new boolean[]{true, true, false}));
    }
    
    @Test
    public void testXorBooleanArrayOneTrueThreeFalses() {
        assertTrue(BooleanUtils.xor(new boolean[]{true, false, false, false}));
    }

    @Test
    public void testXorBooleanArrayOnlyFalses() {
        assertFalse(BooleanUtils.xor(new boolean[]{false, false, false}));
    }

    @Test
    public void testXorBooleanObjectArrayEmpty() {
        try {
            BooleanUtils.xor(new Boolean[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testXorBooleanObjectArrayNull() {
        try {
            BooleanUtils.xor((Boolean[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testXorBooleanObjectArrayTrueTrue() {
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[]{Boolean.TRUE, Boolean.TRUE}));
    }

    @Test
    public void testXorBooleanObjectArrayFalseFalse() {
        assertEquals(Boolean.FALSE, BooleanUtils.xor(new Boolean[]{Boolean.FALSE, Boolean.FALSE}));
    }

    @Test
    public void testXorBooleanObjectArrayTrueFalse() {
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[]{Boolean.TRUE, Boolean.FALSE}));
    }

    @Test
    public void testXorBooleanObjectArrayFalseTrue() {
        assertEquals(Boolean.TRUE, BooleanUtils.xor(new Boolean[]{Boolean.FALSE, Boolean.TRUE}));
    }

    @Test
    public void testXorBooleanObjectArrayNullElement() {
        try {
            BooleanUtils.xor(new Boolean[]{Boolean.TRUE, null});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
