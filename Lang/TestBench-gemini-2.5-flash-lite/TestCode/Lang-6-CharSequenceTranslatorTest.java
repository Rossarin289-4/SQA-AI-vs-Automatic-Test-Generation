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
    public void testTranslateCharSequenceNull() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0;
            }
        };
        assertNull(translator.translate((CharSequence) null));
    }

    @Test
    public void testTranslateCharSequenceEmpty() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0;
            }
        };
        assertEquals("", translator.translate(""));
    }

    @Test
    public void testTranslateCharSequence() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'a') {
                    out.write("apple");
                    return 1;
                }
                return 0;
            }
        };
        assertEquals("apple", translator.translate("a"));
    }

    @Test
    public void testTranslateCharSequenceMultipleCharacters() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'a') {
                    out.write("apple");
                    return 1;
                }
                if (input.charAt(index) == 'b') {
                    out.write("banana");
                    return 1;
                }
                return 0;
            }
        };
        assertEquals("applebanana", translator.translate("ab"));
    }

    @Test
    public void testTranslateCharSequenceWithNonTranslatingCharacters() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'a') {
                    out.write("apple");
                    return 1;
                }
                return 0;
            }
        };
        assertEquals("applec", translator.translate("ac"));
    }

    @Test
    public void testTranslateCharSequenceWithZeroConsumed() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0; // Always consume 0 characters
            }
        };
        assertEquals("abc", translator.translate("abc"));
    }

    @Test
    public void testTranslateCharSequenceWithSurrogatePair() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                // Simulate translating a surrogate pair to something else
                if (Character.codePointAt(input, index) == 0x1F600) { // Grinning Face emoji
                    out.write("GRIN");
                    return Character.charCount(0x1F600);
                }
                return 0;
            }
        };
        // Unicode character U+1F600 represented by two char values
        CharSequence input = new StringBuilder().appendCodePoint(0x1F600).toString();
        assertEquals("GRIN", translator.translate(input));
    }

    @Test
    public void testTranslateCharSequenceWriterNull() throws Exception {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0;
            }
        };
        try {
            translator.translate((CharSequence) null, null);
            fail("Expected IllegalArgumentException for null writer");
        } catch (IllegalArgumentException e) {
            assertEquals("The Writer must not be null", e.getMessage());
        }
    }

    @Test
    public void testTranslateCharSequenceWriter() throws Exception {
        StringWriter writer = new StringWriter();
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'x') {
                    out.write("X");
                    return 1;
                }
                return 0;
            }
        };
        translator.translate("xyz", writer);
        assertEquals("Xyz", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriterEmpty() throws Exception {
        StringWriter writer = new StringWriter();
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0;
            }
        };
        translator.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriterNullInput() throws Exception {
        StringWriter writer = new StringWriter();
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0;
            }
        };
        translator.translate(null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriterWithZeroConsumed() throws Exception {
        StringWriter writer = new StringWriter();
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                return 0; // Always consume 0 characters
            }
        };
        translator.translate("abc", writer);
        assertEquals("abc", writer.toString());
    }

    @Test
    public void testTranslateCharSequenceWriterWithSurrogatePair() throws Exception {
        StringWriter writer = new StringWriter();
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                // Simulate translating a surrogate pair to something else
                if (Character.codePointAt(input, index) == 0x1F600) { // Grinning Face emoji
                    out.write("GRIN");
                    return Character.charCount(0x1F600);
                }
                return 0;
            }
        };
        CharSequence input = new StringBuilder().appendCodePoint(0x1F600).toString();
        translator.translate(input, writer);
        assertEquals("GRIN", writer.toString());
    }

    @Test
    public void testWithMethodChaining() throws Exception {
        CharSequenceTranslator t1 = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'a') {
                    out.write("A");
                    return 1;
                }
                return 0;
            }
        };
        CharSequenceTranslator t2 = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (input.charAt(index) == 'b') {
                    out.write("B");
                    return 1;
                }
                return 0;
            }
        };

        CharSequenceTranslator merged = t1.with(t2);
        assertTrue(merged instanceof AggregateTranslator);
        assertEquals("AB", merged.translate("ab"));
    }

    @Test
    public void testHexMethodBasic() throws Exception {
        assertEquals("0", CharSequenceTranslator.hex(0));
        assertEquals("A", CharSequenceTranslator.hex(10));
        assertEquals("FF", CharSequenceTranslator.hex(255));
    }

    @Test
    public void testHexMethodUpperCase() throws Exception {
        assertEquals("10", CharSequenceTranslator.hex(16));
        assertEquals("1A", CharSequenceTranslator.hex(26));
        assertEquals("ABCDEF", CharSequenceTranslator.hex(11259375));
    }

    @Test
    public void testHexMethodNegative() throws Exception {
        // Integer.toHexString handles negative numbers differently,
        // representing them using two's complement. This test verifies that behavior.
        assertEquals("FFFFFFFF", CharSequenceTranslator.hex(-1));
        assertEquals("80000000", CharSequenceTranslator.hex(Integer.MIN_VALUE));
    }

    @Test
    public void testHexMethodBoundary() throws Exception {
        assertEquals("7FFFFFFF", CharSequenceTranslator.hex(Integer.MAX_VALUE));
    }

    @Test
    public void testHexMethodCodepointZero() throws Exception {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHexMethodLargeCodepoint() throws Exception {
        // A codepoint that requires more than 16 bits.
        assertEquals("10FFFF", CharSequenceTranslator.hex(0x10FFFF));
    }

    @Test
    public void testHexMethodWithCombinedSurrogates() throws Exception {
        // Testing a value that would be represented by a surrogate pair if it were a char
        // but here is directly an int codepoint.
        assertEquals("1F600", CharSequenceTranslator.hex(0x1F600));
    }
}
