package org.apache.commons.lang.text;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StrBuilderLang60Test {

    @Test
    public void testContainsCharacterPresentInLogicalContent() {
        StrBuilder builder = new StrBuilder("cat");

        assertTrue(builder.contains('a'));
    }

    @Test
    public void testContainsIgnoresCharacterRemovedByShrinking() {
        StrBuilder builder = new StrBuilder("abc");
        builder.setLength(1);

        assertFalse(builder.contains('b'));
    }

    @Test
    public void testContainsIgnoresStaleCharacterAfterClear() {
        StrBuilder builder = new StrBuilder("xyz");
        builder.clear();

        assertFalse(builder.contains('y'));
    }

    @Test
    public void testContainsCharacterAtLastLogicalPosition() {
        StrBuilder builder = new StrBuilder("dog");

        assertTrue(builder.contains('g'));
    }

    @Test
    public void testContainsReturnsFalseForAbsentCharacter() {
        StrBuilder builder = new StrBuilder("hello");

        assertFalse(builder.contains('z'));
    }
}
