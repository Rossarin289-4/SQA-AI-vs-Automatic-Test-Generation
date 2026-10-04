package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

public class LookupTranslatorTest {
    @Test
    public void testExactSingleCharacterMapping() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"a", "X"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("X", out.toString());
    }

    @Test
    public void testUnmatchedInputLeavesWriterUnchanged() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"a", "X"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(0, translator.translate("b", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testGreedyMatchChoosesLongestKey() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "S"},
                new CharSequence[] {"ab", "L"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(2, translator.translate("ab", 0, out));
        assertEquals("L", out.toString());
    }

    @Test
    public void testShorterMatchWhenLongerKeyDoesNotMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "S"},
                new CharSequence[] {"ab", "L"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(1, translator.translate("ac", 0, out));
        assertEquals("S", out.toString());
    }

    @Test
    public void testMatchAtNonzeroIndex() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"bc", "Y"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(2, translator.translate("abc", 1, out));
        assertEquals("Y", out.toString());
    }

    @Test
    public void testNoMatchAtNonzeroIndex() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"bc", "Y"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(0, translator.translate("abc", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testMatchEndingAtInputLength() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"bc", "Y"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(2, translator.translate("abc", 1, out));
        assertEquals("Y", out.toString());
    }

    @Test
    public void testOnlyOneCharacterRemainsAtEnd() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "S"},
                new CharSequence[] {"ab", "L"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(1, translator.translate("xa", 1, out));
        assertEquals("S", out.toString());
    }

    @Test
    public void testEmptyLookupDoesNotTranslate() throws Exception {
        LookupTranslator translator = new LookupTranslator();
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(0, translator.translate("abc", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testNullLookupDoesNotTranslate() throws Exception {
        LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(0, translator.translate("abc", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testReplacementMayBeEmpty() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"a", ""});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testReplacementMayContainSeveralCharacters() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"a", "XYZ"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("XYZ", out.toString());
    }

    @Test
    public void testDuplicateKeyUsesLastValue() throws Exception {
        LookupTranslator translator = new LookupTranslator(
                new CharSequence[] {"a", "first"},
                new CharSequence[] {"a", "last"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(1, translator.translate("a", 0, out));
        assertEquals("last", out.toString());
    }

    @Test
    public void testMultiCharacterKeyAtIndexZero() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"cat", "dog"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(3, translator.translate("cat!", 0, out));
        assertEquals("dog", out.toString());
    }

    @Test
    public void testIndexAtLastInputPosition() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"z", "Q"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(1, translator.translate("z", 0, out));
        assertEquals("Q", out.toString());
    }

    @Test
    public void testOneCharacterBeforeKeyDoesNotMatch() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"ab", "Q"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(0, translator.translate("a", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testNoOutputIsWrittenForPrefixOnly() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"abc", "Q"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(0, translator.translate("abx", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testTranslationDoesNotWriteUnmatchedSuffix() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[] {"ab", "Q"});
        java.io.StringWriter out = new java.io.StringWriter();
        assertEquals(2, translator.translate("abc", 0, out));
        assertEquals("Q", out.toString());
    }
}
