package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

public class CharSequenceTranslatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testTranslateCharSequenceWithNullInput() {
        CharSequenceTranslator translator = new AggregateTranslator(); // Use a concrete subclass
        assertNull(translator.translate((CharSequence) null));
    }

    @Test
    public void testTranslateCharSequenceWithEmptyInput() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(); // Use a concrete subclass
        StringWriter writer = new StringWriter();
        translator.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWithBasicInput() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator(new CharSequence[]{"AB"}, new CharSequence[]{"C"})); // A simple concrete translator
        assertEquals("C", translator.translate("AB"));
    }

    @Test
    public void testTranslateCharSequenceWithMultipleTranslators() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator(new CharSequence[]{"A"}, new CharSequence[]{"B"}),
                new LookupTranslator(new CharSequence[]{"B"}, new CharSequence[]{"C"}));
        assertEquals("C", translator.translate("A"));
    }

    @Test
    public void testTranslateCharSequenceWithNonTranslatingInput() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator(new CharSequence[]{"XY"}, new CharSequence[]{"Z"}));
        assertEquals("ABC", translator.translate("ABC"));
    }

    @Test
    public void testTranslateCharSequenceWithInputShorterThanConsumed() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator(new CharSequence[]{"ABC"}, new CharSequence[]{"D"}));
        assertEquals("D", translator.translate("ABC"));
    }

    @Test
    public void testTranslateCharSequenceWithInputLongerThanConsumed() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator(new CharSequence[]{"AB"}, new CharSequence[]{"C"}));
        assertEquals("CAB", translator.translate("ABC"));
    }

    @Test
    public void testTranslateCharSequenceWithSurrogatePairs() throws IOException {
        // A surrogate pair for a character outside BMP
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator(new CharSequence[]{"\uD83D\uDE00"}, new CharSequence[]{"Smile"})); // U+1F600
        assertEquals("Smile", translator.translate("\uD83D\uDE00"));
    }

    @Test
    public void testTranslateCharSequenceWithMixedCharacters() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator(new CharSequence[]{"A"}, new CharSequence[]{"B"}),
                new LookupTranslator(new CharSequence[]{"C"}, new CharSequence[]{"D"}));
        assertEquals("BD", translator.translate("AC"));
    }

    @Test
    public void testTranslateCharSequenceWithEmptyLookup() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(
                new LookupTranslator());
        assertEquals("ABC", translator.translate("ABC"));
    }

    @Test
    public void testTranslateCharSequenceWithNullOutputWriter() {
        CharSequenceTranslator translator = new AggregateTranslator();
        try {
            translator.translate("A", null);
            fail("Expected IllegalArgumentException for null Writer");
        } catch (IllegalArgumentException expected) {
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testTranslateCharSequenceWithNullInputForVoidMethod() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator();
        StringWriter writer = new StringWriter();
        // Calling the void translate method with null input should be a no-op.
        translator.translate(null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testWithMethodReturnsAggregateTranslator() {
        CharSequenceTranslator translator1 = new LookupTranslator(new CharSequence[]{"A"}, new CharSequence[]{"B"});
        CharSequenceTranslator translator2 = new LookupTranslator(new CharSequence[]{"C"}, new CharSequence[]{"D"});
        CharSequenceTranslator merged = translator1.with(translator2);
        assertTrue(merged instanceof AggregateTranslator);
    }

    @Test
    public void testHexMethodWithZero() {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHexMethodWithPositive() {
        assertEquals("A", CharSequenceTranslator.hex(10));
        assertEquals("1F", CharSequenceTranslator.hex(31));
    }

    @Test
    public void testHexMethodWithNegative() {
        // Integer.toHexString for negative numbers produces a 32-bit unsigned representation
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
        assertEquals("80000000", CharSequenceTranslator.hex(Integer.MIN_VALUE));
    }

    @Test
    public void testHexMethodWithMaxIntValue() {
        assertEquals("7FFFFFFF", CharSequenceTranslator.hex(Integer.MAX_VALUE));
    }

    @Test
    public void testHexMethodWithSurrogatePairCodePoint() {
        // U+1F600 is represented by two chars in UTF-16, but this method takes an int codepoint
        int codePoint = 0x1F600;
        assertEquals("1F600", CharSequenceTranslator.hex(codePoint));
    }

    @Test
    public void testHexMethodWithLargeCodepoint() {
        int codePoint = 0x10FFFF; // Maximum valid Unicode codepoint
        assertEquals("10FFFF", CharSequenceTranslator.hex(codePoint));
    }

    @Test
    public void testHexMethodWithOutOfRangeCodepoint() {
        // While Character.toChars would throw for values > 0x10FFFF, Integer.toHexString doesn't.
        // The API contract for hex is just to convert an int to hex string.
        assertEquals("110000", CharSequenceTranslator.hex(0x110000));
    }

    @Test
    public void testAggregateTranslatorWithNoTranslators() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("ABC", writer);
        assertEquals("ABC", writer.toString());
    }

    @Test
    public void testAggregateTranslatorWithOneTranslator() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(new LookupTranslator(new CharSequence[]{"A"}, new CharSequence[]{"B"}));
        assertEquals("BBC", translator.translate("ABC"));
    }

    @Test
    public void testTranslateWithConsumingZero() throws IOException {
        CharSequenceTranslator translator = new AggregateTranslator(new LookupTranslator(new CharSequence[]{"A"}, new CharSequence[]{"B"}));
        // If translate returns 0, the character should be written directly.
        // This case is implicitly tested when an input is not found in the lookup.
        assertEquals("B", translator.translate("A"));
        assertEquals("C", translator.translate("C")); // Consumed 0, wrote 'C'
    }
}
