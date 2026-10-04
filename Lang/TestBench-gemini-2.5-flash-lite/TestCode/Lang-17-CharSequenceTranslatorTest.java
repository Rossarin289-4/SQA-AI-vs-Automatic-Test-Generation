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
    public void testTranslateCharSequenceNullInput() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator(); // Use a concrete implementation for testing
        assertNull(translator.translate((CharSequence) null));
    }

    @Test
    public void testTranslateCharSequenceEmptyInput() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        assertEquals("", translator.translate(""));
    }

    @Test
    public void testTranslateCharSequenceBasic() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        assertEquals("test", translator.translate("test"));
    }

    @Test
    public void testTranslateCharSequenceWithSpecialChars() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        assertEquals("test\\n", translator.translate("test\n"));
    }

    @Test
    public void testTranslateCharSequenceWithMultipleSpecialChars() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        assertEquals("test\\n\\t", translator.translate("test\n\t"));
    }

    @Test
    public void testTranslateCharSequenceWithSurrogatePair() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        // A surrogate pair representing a character outside the BMP
        String input = new String(Character.toChars(0x1F600)); // Grinning Face emoji
        assertEquals(input, translator.translate(input));
    }

    @Test
    public void testTranslateCharSequenceWithMixedChars() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        assertEquals("abc\\n123\\t", translator.translate("abc\n123\t"));
    }

    @Test
    public void testTranslateCharSequenceWithOnlySpecialChars() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        assertEquals("\\n\\t\\r", translator.translate("\n\t\r"));
    }

    @Test
    public void testTranslateCharSequenceWithUnicodeChars() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        assertEquals("你好", translator.translate("你好"));
    }

    @Test
    public void testTranslateCharSequenceWithHighSurrogateOnly() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        // High surrogate without a low surrogate
        char highSurrogate = '\uD800';
        assertEquals(String.valueOf(highSurrogate), translator.translate(String.valueOf(highSurrogate)));
    }

    @Test
    public void testTranslateCharSequenceWithLowSurrogateOnly() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        // Low surrogate without a high surrogate
        char lowSurrogate = '\uDC00';
        assertEquals(String.valueOf(lowSurrogate), translator.translate(String.valueOf(lowSurrogate)));
    }

    @Test
    public void testTranslateCharSequenceWithBoundaryNonBMP() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        // Code point just below the first surrogate
        int codePoint = Character.MAX_CODE_POINT - 1;
        String input = new String(Character.toChars(codePoint));
        assertEquals(input, translator.translate(input));
    }

    @Test
    public void testTranslateCharSequenceWithBoundaryBMP() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        // Code point just above the first surrogate
        int codePoint = Character.MIN_SUPPLEMENTARY_CODE_POINT - 1;
        String input = new String(Character.toChars(codePoint));
        assertEquals(input, translator.translate(input));
    }

    @Test
    public void testTranslateWriterNullInput() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        try {
            translator.translate((CharSequence) null, new StringWriter());
        } catch (IllegalArgumentException e) {
            fail("Should not throw IllegalArgumentException for null input CharSequence");
        }
    }

    @Test
    public void testTranslateWriterNullWriter() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        try {
            translator.translate("test", null);
            fail("Expected IllegalArgumentException for null Writer");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testTranslateWriterBasic() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("test", writer);
        assertEquals("test", writer.toString());
    }

    @Test
    public void testTranslateWriterWithSpecialChars() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("test\n", writer);
        assertEquals("test\\n", writer.toString());
    }

    @Test
    public void testTranslateWriterWithSurrogatePair() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        StringWriter writer = new StringWriter();
        String input = new String(Character.toChars(0x1F600)); // Grinning Face emoji
        translator.translate(input, writer);
        assertEquals(input, writer.toString());
    }

    @Test
    public void testWithMethodChaining() throws Exception {
        CharSequenceTranslator translator1 = new ConcreteCharSequenceTranslator();
        CharSequenceTranslator translator2 = new ConcreteCharSequenceTranslator();
        CharSequenceTranslator merged = translator1.with(translator2);
        assertTrue(merged instanceof AggregateTranslator);
        // In a real scenario, we'd need to ensure the aggregate translator works as expected
        // but for this test, we just check the type.
        assertEquals("test", merged.translate("test")); // Assuming ConcreteCharSequenceTranslator does not translate
    }

    @Test
    public void testWithMethodEmptyArray() throws Exception {
        CharSequenceTranslator translator = new ConcreteCharSequenceTranslator();
        CharSequenceTranslator merged = translator.with();
        assertTrue(merged instanceof AggregateTranslator);
        assertEquals("test", merged.translate("test"));
    }

    @Test
    public void testHexMethodBasic() throws Exception {
        assertEquals("41", CharSequenceTranslator.hex(65)); // 'A'
    }

    @Test
    public void testHexMethodZero() throws Exception {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHexMethodMaxInt() throws Exception {
        assertEquals("7FFFFFFF", CharSequenceTranslator.hex(Integer.MAX_VALUE));
    }

    @Test
    public void testHexMethodMinInt() throws Exception {
        // Integer.MIN_VALUE is -2147483648. Its hex representation is -80000000.
        // Integer.toHexString returns a string representation of the two's complement value.
        // For negative numbers, it appends the two's complement representation.
        assertEquals("80000000", CharSequenceTranslator.hex(Integer.MIN_VALUE));
    }

    @Test
    public void testHexMethodLargeCodepoint() throws Exception {
        // A codepoint outside the BMP
        int codePoint = 0x1F600; // Grinning Face emoji
        assertEquals("1F600", CharSequenceTranslator.hex(codePoint));
    }

    @Test
    public void testHexMethodMaxCodepoint() throws Exception {
        assertEquals("10FFFF", CharSequenceTranslator.hex(Character.MAX_CODE_POINT));
    }

    // Dummy concrete implementation of CharSequenceTranslator for testing purposes
    private static class ConcreteCharSequenceTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            // This is a simplified dummy implementation.
            // It only handles basic characters and common escape sequences for testing.
            // A real translator would have more complex logic.
            // For testing purposes, we'll assume it doesn't translate most things,
            // but we can simulate some behavior for specific tests.

            final int codePoint = Character.codePointAt(input, index);
            final int consumed;

            if (codePoint == '\n') {
                out.write("\\n");
                consumed = 1;
            } else if (codePoint == '\t') {
                out.write("\\t");
                consumed = 1;
            } else if (codePoint == '\r') {
                out.write("\\r");
                consumed = 1;
            } else if (codePoint == '\\') {
                // Handle escaped backslash - needs to check the next character
                if (index + Character.charCount(codePoint) < input.length()) {
                    char nextChar = input.charAt(index + Character.charCount(codePoint));
                    if (nextChar == '\\') {
                        out.write("\\\\");
                        consumed = 2; // Consumed the original '\' and the escaped '\'
                    } else {
                        // If it's not an escaped backslash, write the backslash and continue
                        out.write('\\');
                        consumed = 1;
                    }
                } else {
                    // Backslash at the end of the input
                    out.write('\\');
                    consumed = 1;
                }
            } else if (Character.isSupplementaryCodePoint(codePoint)) {
                // Handle surrogate pairs - simply write them as is
                char[] c = Character.toChars(codePoint);
                out.write(c);
                consumed = c.length; // Consumed both characters of the surrogate pair
            } else if (codePoint < 32 || codePoint > 127) {
                // For non-ASCII printable characters, we might represent them differently
                // but for this simple test, we'll just write them.
                // A real translator might escape them.
                char[] c = Character.toChars(codePoint);
                out.write(c);
                consumed = c.length;
            }
            else {
                // Default behavior: consume one codepoint and write it as is.
                // The abstract method's default implementation in CharSequenceTranslator
                // already handles this, but we need to return a consumed count.
                // The `translate(CharSequence, Writer)` method calls this `translate(CharSequence, int, Writer)`
                // and if it returns 0, it writes the character.
                // To ensure our loop in `translate(CharSequence, Writer)` progresses, we need to return a non-zero count
                // if we wrote something. If we didn't write anything, we should return 0.
                // For this dummy, if it's not a special char, we let the outer loop handle it.
                // Returning 0 here will cause the outer loop to write the character.
                return 0; // Let the default logic handle it
            }
            return consumed;
        }
    }
}
