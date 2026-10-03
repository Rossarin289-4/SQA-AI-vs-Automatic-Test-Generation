package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import java.io.StringWriter;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.junit.Test;

public class Lang4GeneratedTestSA {

    @Test
    public void test01_string_key_baseline() throws Exception {
        assertTranslation(new CharSequence[] {"abc", "X"}, "abc", 3, "X");
    }

    @Test
    public void test02_string_builder_key() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuilder("abc"), "X"}, "abc", 3, "X");
    }

    @Test
    public void test03_string_buffer_key() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuffer("abc"), "X"}, "abc", 3, "X");
    }

    @Test
    public void test04_string_builder_single_char() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuilder("a"), "X"}, "a", 1, "X");
    }

    @Test
    public void test05_string_buffer_single_char() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuffer("z"), "Y"}, "z", 1, "Y");
    }

    @Test
    public void test06_builder_long_key() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuilder("abcdef"), "VALUE"}, "abcdef", 6, "VALUE");
    }

    @Test
    public void test07_buffer_long_key() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuffer("wxyz"), "VALUE"}, "wxyz", 4, "VALUE");
    }

    @Test
    public void test08_builder_overlap_longest() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuilder("ab"), "SHORT", new StringBuilder("abc"), "LONG"}, "abc", 3, "LONG");
    }

    @Test
    public void test09_buffer_overlap_longest() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuffer("xy"), "SHORT", new StringBuffer("xyz"), "LONG"}, "xyz", 3, "LONG");
    }

    @Test
    public void test10_unicode_builder_key() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuilder("\u0E01\u0E02"), "TH"}, "\u0E01\u0E02", 2, "TH");
    }

    @Test
    public void test11_unicode_buffer_key() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuffer("\u03B1\u03B2"), "GREEK"}, "\u03B1\u03B2", 2, "GREEK");
    }

    @Test
    public void test12_unmatched_baseline() throws Exception {
        assertTranslation(new CharSequence[] {new StringBuilder("abc"), "X"}, "abd", 0, "");
    }

    private void assertTranslation(CharSequence[] lookup, String input, int expectedConsumed, String expectedOutput) throws Exception {
        CharSequence[][] table = new CharSequence[lookup.length / 2][2];
        for (int i = 0; i < lookup.length; i += 2) {
            table[i / 2][0] = lookup[i];
            table[i / 2][1] = lookup[i + 1];
        }
        LookupTranslator translator = new LookupTranslator(table);
        StringWriter writer = new StringWriter();
        int consumed = translator.translate(input, 0, writer);
        assertEquals(expectedConsumed, consumed);
        assertEquals(expectedOutput, writer.toString());
    }

}
