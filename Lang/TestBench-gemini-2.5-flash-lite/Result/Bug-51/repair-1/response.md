```java
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
```
1. SOURCE CODE ANALYSIS - The tests cover most public methods of `BooleanUtils`, including `negate`, `isTrue`, `isFalse`, `toBooleanObject` (primitive and Integer), `toBoolean` (Boolean, int, Integer, String), `toInteger` (primitive and Boolean), `toString` (Boolean and primitive), and `xor` (primitive and Boolean arrays). The tests focus on the core logic and edge cases like null inputs and specific string values.
2. TEST CASE DESIGN -
- `testNegateTrue`: Input: `Boolean.TRUE`, Expected: `Boolean.FALSE`, Derivation: Direct call to `negate`.
- `testNegateFalse`: Input: `Boolean.FALSE`, Expected: `Boolean.TRUE`, Derivation: Direct call to `negate`.
- `testNegateNull`: Input: `null`, Expected: `null`, Derivation: Direct call to `negate`.
- `testIsTrueTrue`: Input: `Boolean.TRUE`, Expected: `true`, Derivation: Direct call to `isTrue`.
- `testIsTrueFalse`: Input: `Boolean.FALSE`, Expected: `false`, Derivation: Direct call to `isTrue`.
- `testIsTrueNull`: Input: `null`, Expected: `false`, Derivation: Direct call to `isTrue`.
- `testIsNotTrueTrue`: Input: `Boolean.TRUE`, Expected: `false`, Derivation: Direct call to `isNotTrue`.
- `testIsNotTrueFalse`: Input: `Boolean.FALSE`, Expected: `true`, Derivation: Direct call to `isNotTrue`.
- `testIsNotTrueNull`: Input: `null`, Expected: `true`, Derivation: Direct call to `isNotTrue`.
- `testIsFalseTrue`: Input: `Boolean.TRUE`, Expected: `false`, Derivation: Direct call to `isFalse`.
- `testIsFalseFalse`: Input: `Boolean.FALSE`, Expected: `true`, Derivation: Direct call to `isFalse`.
- `testIsFalseNull`: Input: `null`, Expected: `false`, Derivation: Direct call to `isFalse`.
- `testIsNotFalseTrue`: Input: `Boolean.TRUE`, Expected: `true`, Derivation: Direct call to `isNotFalse`.
- `testIsNotFalseFalse`: Input: `Boolean.FALSE`, Expected: `false`, Derivation: Direct call to `isNotFalse`.
- `testIsNotFalseNull`: Input: `null`, Expected: `true`, Derivation: Direct call to `isNotFalse`.
- `testToBooleanObjectPrimitiveTrue`: Input: `true`, Expected: `Boolean.TRUE`, Derivation: Direct call to `toBooleanObject(boolean)`.
- `testToBooleanObjectPrimitiveFalse`: Input: `false`, Expected: `Boolean.FALSE`, Derivation: Direct call to `toBooleanObject(boolean)`.
- `testToBooleanBooleanTrue`: Input: `Boolean.TRUE`, Expected: `true`, Derivation: Direct call to `toBoolean(Boolean)`.
- `testToBooleanBooleanFalse`: Input: `Boolean.FALSE`, Expected: `false`, Derivation: Direct call to `toBoolean(Boolean)`.
- `testToBooleanBooleanNull`: Input: `null`, Expected: `false`, Derivation: Direct call to `toBoolean(Boolean)`.
- `testToBooleanDefaultIfNullTrueTrue`: Input: `Boolean.TRUE`, `true`, Expected: `true`, Derivation: Direct call to `toBooleanDefaultIfNull`.
- `testToBooleanDefaultIfNullFalseTrue`: Input: `Boolean.FALSE`, `true`, Expected: `false`, Derivation: Direct call to `toBooleanDefaultIfNull`.
- `testToBooleanDefaultIfNullNullTrue`: Input: `null`, `true`, Expected: `true`, Derivation: Direct call to `toBooleanDefaultIfNull`.
- `testToBooleanDefaultIfNullTrueFalse`: Input: `Boolean.TRUE`, `false`, Expected: `true`, Derivation: Direct call to `toBooleanDefaultIfNull`.
- `testToBooleanDefaultIfNullFalseFalse`: Input: `Boolean.FALSE`, `false`, Expected: `false`, Derivation: Direct call to `toBooleanDefaultIfNull`.
- `testToBooleanDefaultIfNullNullFalse`: Input: `null`, `false`, Expected: `false`, Derivation: Direct call to `toBooleanDefaultIfNull`.
- `testToBooleanIntZero`: Input: `0`, Expected: `false`, Derivation: Direct call to `toBoolean(int)`.
- `testToBooleanIntNonZero`: Inputs: `1`, `-1`, `Integer.MAX_VALUE`, `Integer.MIN_VALUE`, Expected: `true`, Derivation: Direct call to `toBoolean(int)`.
- `testToBooleanObjectIntZero`: Input: `0`, Expected: `Boolean.FALSE`, Derivation: Direct call to `toBooleanObject(int)`.
- `testToBooleanObjectIntNonZero`: Inputs: `1`, `-1`, `Integer.MAX_VALUE`, `Integer.MIN_VALUE`, Expected: `Boolean.TRUE`, Derivation: Direct call to `toBooleanObject(int)`.
- `testToBooleanObjectIntegerZero`: Input: `Integer.valueOf(0)`, Expected: `Boolean.FALSE`, Derivation: Direct call to `toBooleanObject(Integer)`.
- `testToBooleanObjectIntegerNonZero`: Inputs: `Integer.valueOf(1)`, `Integer.valueOf(-1)`, `Integer.valueOf(Integer.MAX_VALUE)`, `Integer.valueOf(Integer.MIN_VALUE)`, Expected: `Boolean.TRUE`, Derivation: Direct call to `toBooleanObject(Integer)`.
- `testToBooleanObjectIntegerNull`: Input: `null`, Expected: `null`, Derivation: Direct call to `toBooleanObject(Integer)`.
- `testToBooleanIntTrueValueFalseValueMatch`: Inputs: `(1, 1, 0)` and `(0, 1, 0)`, Expected: `true` and `false`, Derivation: Direct call to `toBoolean(int, int, int)`.
- `testToBooleanIntTrueValueFalseValueNoMatch`: Input: `(2, 1, 0)`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBoolean(int, int, int)`.
- `testToBooleanIntegerTrueValueFalseValueMatch`: Inputs: `(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0))` and `(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0))`, Expected: `true` and `false`, Derivation: Direct call to `toBoolean(Integer, Integer, Integer)`.
- `testToBooleanIntegerTrueValueFalseValueNullMatch`: Inputs: `(null, null, Integer.valueOf(0))` and `(null, Integer.valueOf(1), null)`, Expected: `true` and `false`, Derivation: Direct call to `toBoolean(Integer, Integer, Integer)`.
- `testToBooleanIntegerTrueValueFalseValueNoMatch`: Input: `(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0))`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBoolean(Integer, Integer, Integer)`.
- `testToBooleanIntegerTrueValueFalseValueNullNoMatch`: Input: `(Integer.valueOf(2), null, null)`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBoolean(Integer, Integer, Integer)`.
- `testToBooleanObjectIntTrueValueFalseValueNullValueMatch`: Inputs: `(0, 0, 2, 3)`, `(2, 1, 2, 3)`, `(3, 1, 2, 3)`, Expected: `Boolean.TRUE`, `Boolean.FALSE`, `null`, Derivation: Direct call to `toBooleanObject(int, int, int, int)`.
- `testToBooleanObjectIntTrueValueFalseValueNullValueNoMatch`: Input: `(4, 1, 2, 3)`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBooleanObject(int, int, int, int)`.
- `testToBooleanObjectIntegerTrueValueFalseValueNullValueMatch`: Inputs: `(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3))`, `(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3))`, `(Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3))`, Expected: `Boolean.TRUE`, `Boolean.FALSE`, `null`, Derivation: Direct call to `toBooleanObject(Integer, Integer, Integer, Integer)`.
- `testToBooleanObjectIntegerTrueValueFalseValueNullValueNullMatch`: Inputs: `(null, null, Integer.valueOf(0), Integer.valueOf(1))`, `(null, Integer.valueOf(1), null, Integer.valueOf(0))`, `(null, Integer.valueOf(1), Integer.valueOf(0), null)`, Expected: `Boolean.TRUE`, `Boolean.FALSE`, `null`, Derivation: Direct call to `toBooleanObject(Integer, Integer, Integer, Integer)`.
- `testToBooleanObjectIntegerTrueValueFalseValueNullValueNoMatch`: Input: `(Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3))`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBooleanObject(Integer, Integer, Integer, Integer)`.
- `testToBooleanObjectIntegerTrueValueFalseValueNullValueNullNoMatch`: Input: `(Integer.valueOf(4), null, null, null)`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBooleanObject(Integer, Integer, Integer, Integer)`.
- `testToIntegerPrimitiveTrue`: Input: `true`, Expected: `1`, Derivation: Direct call to `toInteger(boolean)`.
- `testToIntegerPrimitiveFalse`: Input: `false`, Expected: `0`, Derivation: Direct call to `toInteger(boolean)`.
- `testToIntegerObjectPrimitiveTrue`: Input: `true`, Expected: `NumberUtils.INTEGER_ONE`, Derivation: Direct call to `toIntegerObject(boolean)`.
- `testToIntegerObjectPrimitiveFalse`: Input: `false`, Expected: `NumberUtils.INTEGER_ZERO`, Derivation: Direct call to `toIntegerObject(boolean)`.
- `testToIntegerObjectBooleanTrue`: Input: `Boolean.TRUE`, Expected: `NumberUtils.INTEGER_ONE`, Derivation: Direct call to `toIntegerObject(Boolean)`.
- `testToIntegerObjectBooleanFalse`: Input: `Boolean.FALSE`, Expected: `NumberUtils.INTEGER_ZERO`, Derivation: Direct call to `toIntegerObject(Boolean)`.
- `testToIntegerObjectBooleanNull`: Input: `null`, Expected: `null`, Derivation: Direct call to `toIntegerObject(Boolean)`.
- `testToIntegerPrimitiveTrueValueFalseValue`: Inputs: `(true, 1, 0)` and `(false, 1, 0)`, Expected: `1` and `0`, Derivation: Direct call to `toInteger(boolean, int, int)`.
- `testToIntegerPrimitiveTrueValueFalseValueDifferent`: Inputs: `(true, 5, 10)` and `(false, 5, 10)`, Expected: `5` and `10`, Derivation: Direct call to `toInteger(boolean, int, int)`.
- `testToIntegerBooleanTrueValueFalseValueNullValue`: Inputs: `(Boolean.TRUE, 1, 0, 2)`, `(Boolean.FALSE, 1, 0, 2)`, `(null, 1, 0, 2)`, Expected: `1`, `0`, `2`, Derivation: Direct call to `toInteger(Boolean, int, int, int)`.
- `testToIntegerBooleanTrueValueFalseValueNullValueDifferent`: Inputs: `(Boolean.TRUE, 5, 10, 15)`, `(Boolean.FALSE, 5, 10, 15)`, `(null, 5, 10, 15)`, Expected: `5`, `10`, `15`, Derivation: Direct call to `toInteger(Boolean, int, int, int)`.
- `testToIntegerObjectBooleanTrueValueFalseValue`: Inputs: `(true, Integer.valueOf(1), Integer.valueOf(0))` and `(false, Integer.valueOf(1), Integer.valueOf(0))`, Expected: `Integer.valueOf(1)` and `Integer.valueOf(0)`, Derivation: Direct call to `toIntegerObject(boolean, Integer, Integer)`.
- `testToIntegerObjectBooleanTrueValueFalseValueDifferent`: Inputs: `(true, Integer.valueOf(5), Integer.valueOf(10))` and `(false, Integer.valueOf(5), Integer.valueOf(10))`, Expected: `Integer.valueOf(5)` and `Integer.valueOf(10)`, Derivation: Direct call to `toIntegerObject(boolean, Integer, Integer)`.
- `testToIntegerObjectBooleanTrueValueFalseValueNullValue`: Inputs: `(Boolean.TRUE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))`, `(Boolean.FALSE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))`, `(null, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))`, Expected: `Integer.valueOf(1)`, `Integer.valueOf(0)`, `Integer.valueOf(2)`, Derivation: Direct call to `toIntegerObject(Boolean, Integer, Integer, Integer)`.
- `testToIntegerObjectBooleanTrueValueFalseValueNullValueDifferent`: Inputs: `(Boolean.TRUE, Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(15))`, `(Boolean.FALSE, Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(15))`, `(null, Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(15))`, Expected: `Integer.valueOf(5)`, `Integer.valueOf(10)`, `Integer.valueOf(15)`, Derivation: Direct call to `toIntegerObject(Boolean, Integer, Integer, Integer)`.
- `testToBooleanObjectStringTrue`: Inputs: `"true"`, `"TRUE"`, `"On"`, `"ON"`, `"yes"`, `"YES"`, Expected: `Boolean.TRUE`, Derivation: Direct call to `toBooleanObject(String)`.
- `testToBooleanObjectStringFalse`: Inputs: `"false"`, `"FALSE"`, `"Off"`, `"OFF"`, `"no"`, `"NO"`, Expected: `Boolean.FALSE`, Derivation: Direct call to `toBooleanObject(String)`.
- `testToBooleanObjectStringNull`: Inputs: `null`, `"blue"`, `""`, Expected: `null`, Derivation: Direct call to `toBooleanObject(String)`.
- `testToBooleanObjectStringTrueStringFalseStringNullStringMatch`: Inputs: `("true", "true", "false", "null")`, `("false", "true", "false", "null")`, `("null", "true", "false", "null")`, Expected: `Boolean.TRUE`, `Boolean.FALSE`, `null`, Derivation: Direct call to `toBooleanObject(String, String, String, String)`.
- `testToBooleanObjectStringTrueStringFalseStringNullStringNullMatch`: Inputs: `(null, null, "false", "null")`, `(null, "true", null, "null")`, `(null, "true", "false", null)`, Expected: `Boolean.TRUE`, `Boolean.FALSE`, `null`, Derivation: Direct call to `toBooleanObject(String, String, String, String)`.
- `testToBooleanObjectStringTrueStringFalseStringNullStringNoMatch`: Input: `("other", "true", "false", "null")`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBooleanObject(String, String, String, String)`.
- `testToBooleanObjectStringTrueStringFalseStringNullStringNullNoMatch`: Input: `("other", null, null, null)`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBooleanObject(String, String, String, String)`.
- `testToBooleanStringTrue`: Inputs: `"true"`, `"TRUE"`, `"tRuE"`, `"on"`, `"ON"`, `"yes"`, `"YES"`, Expected: `true`, Derivation: Direct call to `toBoolean(String)`.
- `testToBooleanStringFalse`: Inputs: `"false"`, `"FALSE"`, `"off"`, `"OFF"`, `"no"`, `"NO"`, Expected: `false`, Derivation: Direct call to `toBoolean(String)`.
- `testToBooleanStringNull`: Input: `null`, Expected: `false`, Derivation: Direct call to `toBoolean(String)`.
- `testToBooleanStringNonMatch`: Inputs: `"blue"`, `""`, `"tru"`, `"yesa"`, `"onm"`, Expected: `false`, Derivation: Direct call to `toBoolean(String)`.
- `testToBooleanStringTrueStringFalseStringMatch`: Inputs: `("true", "true", "false")` and `("false", "true", "false")`, Expected: `true` and `false`, Derivation: Direct call to `toBoolean(String, String, String)`.
- `testToBooleanStringTrueStringFalseStringNullMatch`: Inputs: `(null, null, "false")` and `(null, "true", null)`, Expected: `true` and `false`, Derivation: Direct call to `toBoolean(String, String, String)`.
- `testToBooleanStringTrueStringFalseStringNoMatch`: Input: `("other", "true", "false")`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBoolean(String, String, String)`.
- `testToBooleanStringTrueStringFalseStringNullNoMatch`: Input: `("other", null, null)`, Expected: `IllegalArgumentException`, Derivation: Direct call to `toBoolean(String, String, String)`.
- `testToStringTrueFalseBooleanTrue`: Input: `Boolean.TRUE`, Expected: `"true"`, Derivation: Direct call to `toStringTrueFalse(Boolean)`.
- `testToStringTrueFalseBooleanFalse`: Input: `Boolean.FALSE`, Expected: `"false"`, Derivation: Direct call to `toStringTrueFalse(Boolean)`.
- `testToStringTrueFalseBooleanNull`: Input: `null`, Expected: `null`, Derivation: Direct call to `toStringTrueFalse(Boolean)`.
- `testToStringOnOffBooleanTrue`: Input: `Boolean.TRUE`, Expected: `"on"`, Derivation: Direct call to `toStringOnOff(Boolean)`.
- `testToStringOnOffBooleanFalse`: Input: `Boolean.FALSE`, Expected: `"off"`, Derivation: Direct call to `toStringOnOff(Boolean)`.
- `testToStringOnOffBooleanNull`: Input: `null`, Expected: `null`, Derivation: Direct call to `toStringOnOff(Boolean)`.
- `testToStringYesNoBooleanTrue`: Input: `Boolean.TRUE`, Expected: `"yes"`, Derivation: Direct call to `toStringYesNo(Boolean)`.
- `testToStringYesNoBooleanFalse`: Input: `Boolean.FALSE`, Expected: `"no"`, Derivation: Direct call to `toStringYesNo(Boolean)`.
- `testToStringYesNoBooleanNull`: Input: `null`, Expected: `null`, Derivation: Direct call to `toStringYesNo(Boolean)`.
- `testToStringBooleanStringTrueStringFalseStringNullString`: Inputs: `(Boolean.TRUE, "true", "false", null)`, `(Boolean.FALSE, "true", "false", null)`, `(null, "true", "false", null)`, Expected: `"true"`, `"false"`, `null`, Derivation: Direct call to `toString(Boolean, String, String, String)`.
- `testToStringBooleanStringTrueStringFalseStringNullStringDifferent`: Inputs: `(Boolean.TRUE, "yes", "no", "maybe")`, `(Boolean.FALSE, "yes", "no", "maybe")`, `(null, "yes", "no", "maybe")`, Expected: `"yes"`, `"no"`, `"maybe"`, Derivation: Direct call to `toString(Boolean, String, String, String)`.
- `testToStringBooleanStringTrueStringFalseStringNullStringNulls`: Inputs: `(Boolean.TRUE, "true", null, null)`, `(Boolean.FALSE, "true", null, null)`, `(null, "true", null, null)`, Expected: `"true"`, `null`, `null`, Derivation: Direct call to `toString(Boolean, String, String, String)`.
- `testToStringPrimitiveTrue`: Input: `true`, Expected: `"true"`, Derivation: Direct call to `toStringTrueFalse(boolean)`.
- `testToStringPrimitiveFalse`: Input: `false`, Expected: `"false"`, Derivation: Direct call to `toStringTrueFalse(boolean)`.
- `testToStringOnOffPrimitiveTrue`: Input: `true`, Expected: `"on"`, Derivation: Direct call to `toStringOnOff(boolean)`.
- `testToStringOnOffPrimitiveFalse`: Input: `false`, Expected: `"off"`, Derivation: Direct call to `toStringOnOff(boolean)`.
- `testToStringYesNoPrimitiveTrue`: Input: `true`, Expected: `"yes"`, Derivation: Direct call to `toStringYesNo(boolean)`.
- `testToStringYesNoPrimitiveFalse`: Input: `false`, Expected: `"no"`, Derivation: Direct call to `toStringYesNo(boolean)`.
- `testToStringPrimitiveTrueStringFalseString`: Inputs: `(true, "true", "false")` and `(false, "true", "false")`, Expected: `"true"` and `"false"`, Derivation: Direct call to `toString(boolean, String, String)`.
- `testToStringPrimitiveTrueStringFalseStringDifferent`: Inputs: `(true, "yes", "no")` and `(false, "yes", "no")`, Expected: `"yes"` and `"no"`, Derivation: Direct call to `toString(boolean, String, String)`.
- `testXorBooleanArrayEmpty`: Input: `new boolean[0]`, Expected: `IllegalArgumentException`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayNull`: Input: `null`, Expected: `IllegalArgumentException`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayTrueTrue`: Input: `{true, true}`, Expected: `false`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayFalseFalse`: Input: `{false, false}`, Expected: `false`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayTrueFalse`: Input: `{true, false}`, Expected: `true`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayFalseTrue`: Input: `{false, true}`, Expected: `true`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayThreeTrues`: Input: `{true, true, true}`, Expected: `false`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayTwoTruesOneFalse`: Input: `{true, true, false}`, Expected: `false`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayOneTrueThreeFalses`: Input: `{true, false, false, false}`, Expected: `true`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanArrayOnlyFalses`: Input: `{false, false, false}`, Expected: `false`, Derivation: Direct call to `xor(boolean[])`.
- `testXorBooleanObjectArrayEmpty`: Input: `new Boolean[0]`, Expected: `IllegalArgumentException`, Derivation: Direct call to `xor(Boolean[])`.
- `testXorBooleanObjectArrayNull`: Input: `null`, Expected: `IllegalArgumentException`, Derivation: Direct call to `xor(Boolean[])`.
- `testXorBooleanObjectArrayTrueTrue`: Input: `{Boolean.TRUE, Boolean.TRUE}`, Expected: `Boolean.FALSE`, Derivation: Direct call to `xor(Boolean[])`.
- `testXorBooleanObjectArrayFalseFalse`: Input: `{Boolean.FALSE, Boolean.FALSE}`, Expected: `Boolean.FALSE`, Derivation: Direct call to `xor(Boolean[])`.
- `testXorBooleanObjectArrayTrueFalse`: Input: `{Boolean.TRUE, Boolean.FALSE}`, Expected: `Boolean.TRUE`, Derivation: Direct call to `xor(Boolean[])`.
- `testXorBooleanObjectArrayFalseTrue`: Input: `{Boolean.FALSE, Boolean.TRUE}`, Expected: `Boolean.TRUE`, Derivation: Direct call to `xor(Boolean[])`.
- `testXorBooleanObjectArrayNullElement`: Input: `{Boolean.TRUE, null}`, Expected: `IllegalArgumentException`, Derivation: Direct call to `xor(Boolean[])`.
4. DEFECT DETECTION STRATEGY - Tests cover null handling, specific string to boolean conversions, and edge cases for integer and string inputs to ensure accurate boolean interpretation. The XOR tests verify the logic for different combinations of true and false values.
5. SUMMARY - 87 tests.
6. LIMITATIONS - The tests do not cover all possible combinations of inputs for methods with multiple parameters that involve custom true/false/null values, focusing instead on representative cases and documented examples. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.