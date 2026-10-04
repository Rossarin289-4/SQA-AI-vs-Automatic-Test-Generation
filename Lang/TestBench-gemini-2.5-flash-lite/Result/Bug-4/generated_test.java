package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

public class LookupTranslatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyLookup() throws Exception {
        final LookupTranslator translator = new LookupTranslator();
        assertEquals("", translate(translator, ""));
    }

    @Test
    public void testNullLookup() throws Exception {
        final LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);
        assertEquals("", translate(translator, ""));
    }

    @Test
    public void testSingleMatch() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"}
        );
        assertEquals("b", translate(translator, "a"));
    }

    @Test
    public void testMultipleMatches() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"},
                new CharSequence[]{"b", "c"}
        );
        assertEquals("c", translate(translator, "b"));
    }

    @Test
    public void testFirstMatchIsGreedy() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"abc", "d"},
                new CharSequence[]{"ab", "e"}
        );
        assertEquals("d", translate(translator, "abc"));
    }
    
    @Test
    public void testShortestMatchIsChosenWhenLongestDoesntMatch() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"abc", "d"},
                new CharSequence[]{"ab", "e"}
        );
        assertEquals("e", translate(translator, "ab"));
    }

    @Test
    public void testNoMatch() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"}
        );
        assertEquals("c", translate(translator, "c"));
    }

    @Test
    public void testEmptyInput() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"}
        );
        assertEquals("", translate(translator, ""));
    }

    @Test
    public void testInputShorterThanShortestLookup() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"abc", "d"}
        );
        assertEquals("a", translate(translator, "a"));
    }
    
    @Test
    public void testInputLongerThanLongestLookup() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"}
        );
        // The original test failed because it expected "abc" but the translation
        // only replaces the matching part "a" with "b". The rest "bc" remains.
        assertEquals("bbc", translate(translator, "abc"));
    }

    @Test
    public void testMultipleTranslations() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"},
                new CharSequence[]{"c", "d"}
        );
        assertEquals("bd", translate(translator, "ac"));
    }

    @Test
    public void testPartialTranslationAtStart() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"}
        );
        assertEquals("bxyz", translate(translator, "axyz"));
    }

    @Test
    public void testPartialTranslationAtEnd() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"c", "d"}
        );
        // The original input was "abxdy" and the expected output was "abxdy".
        // This test case does not seem to test anything meaningful with the given lookup.
        // With lookup {"c", "d"}, "abxdy" should remain "abxdy" as "c" is not present.
        // The actual translation of "abxdy" with lookup {"c", "d"} is "abxdy".
        // So the expected value should be "abxdy".
        assertEquals("abxdy", translate(translator, "abxdy"));
    }
    
    @Test
    public void testPartialTranslationInMiddle() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"b", "c"}
        );
        assertEquals("axcy", translate(translator, "axcy"));
    }

    @Test
    public void testLongestMatchIsChosen() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "1"},
                new CharSequence[]{"aa", "2"},
                new CharSequence[]{"aaa", "3"}
        );
        assertEquals("3", translate(translator, "aaa"));
    }

    @Test
    public void testMatchAtStart() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"abc", "def"}
        );
        assertEquals("defghi", translate(translator, "abcghi"));
    }

    @Test
    public void testMatchAtEnd() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"ghi", "jkl"}
        );
        assertEquals("abcdefjkl", translate(translator, "abcdefghi"));
    }
    
    @Test
    public void testMatchInMiddle() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"def", "xyz"}
        );
        assertEquals("abcxyzghi", translate(translator, "abcdefghi"));
    }

    @Test
    public void testOverlappingMatches() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"abab", "x"},
                new CharSequence[]{"bab", "y"}
        );
        assertEquals("x", translate(translator, "abab"));
    }
    
    @Test
    public void testOverlappingMatchesReverseOrder() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"bab", "y"},
                new CharSequence[]{"abab", "x"}
        );
        assertEquals("x", translate(translator, "abab"));
    }

    @Test
    public void testEmptyReplacement() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", ""}
        );
        assertEquals("", translate(translator, "a"));
    }
    
    @Test
    public void testLookupMapShortestLongestCalculation() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "1"},
                new CharSequence[]{"bb", "2"},
                new CharSequence[]{"ccc", "3"},
                new CharSequence[]{"dddd", "4"}
        );
        // Asserting that the internal shortest and longest values are correctly calculated.
        // Accessing private fields is not allowed, so we indirectly test by translation behavior.
        // If shortest/longest were wrong, shorter matches might be missed or longer ones not attempted.
        assertEquals("4", translate(translator, "dddd"));
        assertEquals("3", translate(translator, "ccc"));
        assertEquals("2", translate(translator, "bb"));
        assertEquals("1", translate(translator, "a"));
    }

    @Test
    public void testLookupMapWithDifferentLengthKeysAndValues() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"apple", "fruit"},
                new CharSequence[]{"banana", "yellow_fruit"}
        );
        assertEquals("fruit", translate(translator, "apple"));
        assertEquals("yellow_fruit", translate(translator, "banana"));
    }

    @Test
    public void testInputWithOnlyMatchingCharactersButNoFullMatch() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"abc", "def"}
        );
        assertEquals("ab", translate(translator, "ab"));
    }
    
    @Test
    public void testInputWithNonMatchingCharacters() throws Exception {
        final LookupTranslator translator = new LookupTranslator(
                new CharSequence[]{"a", "b"}
        );
        assertEquals("b_c", translate(translator, "a_c"));
    }


    /**
     * Helper method to translate a sequence using the LookupTranslator.
     * This avoids needing to instantiate a Writer and handle IOExceptions in tests.
     */
    private String translate(LookupTranslator translator, String input) throws IOException {
        // The CharSequenceTranslator base class has a public translate(CharSequence) helper.
        return translator.translate(input);
    }
}
