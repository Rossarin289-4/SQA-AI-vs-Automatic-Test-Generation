package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import java.util.HashMap;

public class LookupTranslatorTest {
    @Test
    public void testExactSingleCharacterMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{"a", "X"}});
        StringWriter out = new StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("X", out.toString());
    }

    @Test
    public void testNoMatchingCharacter() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{"a", "X"}});
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("b", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testGreedyLongestMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"a", "S"}, {"ab", "L"}});
        StringWriter out = new StringWriter();
        assertEquals(2, translator.translate("ab", 0, out));
        assertEquals("L", out.toString());
    }

    @Test
    public void testShorterMatchWhenLongerDoesNotMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"a", "S"}, {"ab", "L"}});
        StringWriter out = new StringWriter();
        assertEquals(1, translator.translate("ac", 0, out));
        assertEquals("S", out.toString());
    }

    @Test
    public void testMatchBoundedByRemainingInput() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"abc", "Z"}});
        StringWriter out = new StringWriter();
        assertEquals(3, translator.translate("zabc", 1, out));
        assertEquals("Z", out.toString());
    }

    @Test
    public void testNoMatchAtEndOfInput() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"ab", "Z"}});
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("a", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testMatchStartingAtLastValidIndex() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"x", "Y"}});
        StringWriter out = new StringWriter();
        assertEquals(1, translator.translate("ax", 1, out));
        assertEquals("Y", out.toString());
    }

    @Test
    public void testNoMatchAtIndexPastEnd() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"x", "Y"}});
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("a", 1, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testZeroLengthKeyDoesNotMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"", "E"}});
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("a", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testNullLookupIsEmpty() throws Exception {
        LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("a", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testReplacementMayBeEmpty() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"a", ""}});
        StringWriter out = new StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testReplacementWritesMultipleCharacters() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"a", "XYZ"}});
        StringWriter out = new StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("XYZ", out.toString());
    }

    @Test
    public void testRepeatedKeyUsesLastMapping() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"a", "X"}, {"a", "Y"}});
        StringWriter out = new StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("Y", out.toString());
    }

    @Test
    public void testMatchAtIndexZeroWithTrailingInput() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"ab", "Q"}});
        StringWriter out = new StringWriter();
        assertEquals(2, translator.translate("abc", 0, out));
        assertEquals("Q", out.toString());
    }

    @Test
    public void testNoMatchLeavesExistingWriterContentUntouched() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[][] {{"x", "Y"}});
        StringWriter out = new StringWriter();
        out.write("pre");
        assertEquals(0, translator.translate("a", 0, out));
        assertEquals("pre", out.toString());
    }
}
