package org.apache.commons.lang;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BooleanUtilsLang51Test {

    @Test
    public void testThreeCharacterInvalidStringStartingWithLowercaseT() {
        assertFalse(BooleanUtils.toBoolean("taz"));
    }

    @Test
    public void testThreeCharacterInvalidStringStartingWithUppercaseT() {
        assertFalse(BooleanUtils.toBoolean("Tzz"));
    }

    @Test
    public void testThreeCharacterInvalidStringNotStartingWithT() {
        assertFalse(BooleanUtils.toBoolean("abc"));
    }

    @Test
    public void testThreeCharacterYesWithMixedCase() {
        assertTrue(BooleanUtils.toBoolean("YeS"));
    }

    @Test
    public void testTwoCharacterTrueValue() {
        assertTrue(BooleanUtils.toBoolean("on"));
    }

    @Test
    public void testFourCharacterTrueValue() {
        assertTrue(BooleanUtils.toBoolean("TRUE"));
    }
}
