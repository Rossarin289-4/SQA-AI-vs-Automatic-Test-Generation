package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

public class NumericEntityUnescaperTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testBasicDecimal() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("abc&#10;", 0, sw); // Replaced CharSet.join with string concatenation
        assertEquals("abc\n", sw.toString());
    }

    @Test
    public void testBasicHex() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("abc&#x41;", 0, sw); // Replaced CharSet.join with string concatenation
        assertEquals("abcA", sw.toString());
    }

    @Test
    public void testNoMatch() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("No match here", 0, sw);
        assertEquals("No match here", sw.toString());
    }

    @Test
    public void testEmptyInput() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("", 0, sw);
        assertEquals("", sw.toString());
    }

    @Test
    public void testPartialEntityStart() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&", 0, sw);
        assertEquals("&", sw.toString());
    }

    @Test
    public void testPartialEntityHash() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#", 0, sw);
        assertEquals("&#", sw.toString());
    }

    @Test
    public void testPartialEntityHex() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x", 0, sw);
        assertEquals("&#x", sw.toString());
    }

    @Test
    public void testInvalidNumberFormatDecimal() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#abc;", 0, sw);
        assertEquals("&#abc;", sw.toString()); // NumberFormatException caught, returns 0
    }

    @Test
    public void testInvalidNumberFormatHex() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#xabc;", 0, sw);
        assertEquals("&#xabc;", sw.toString()); // NumberFormatException caught, returns 0
    }

    @Test
    public void testEntityWithNoSemicolonDecimal() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        // Input ends before ';' is found, will cause index out of bounds if not handled
        // The current implementation would throw an exception if not for the while loop condition.
        // Assuming the while loop stops at the end of the string if ';' is not found,
        // and Integer.parseInt would throw NumberFormatException.
        unescaper.translate("&#123", 0, sw);
        assertEquals("&#123", sw.toString()); // NumberFormatException caught, returns 0
    }

    @Test
    public void testEntityWithNoSemicolonHex() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x123", 0, sw);
        assertEquals("&#x123", sw.toString()); // NumberFormatException caught, returns 0
    }

    @Test
    public void testLargeDecimalEntity() throws IOException {
        // Value 0x10FFFF is a valid Unicode code point, but it's composed of two chars.
        // The NumericEntityUnescaper handles values > 0xFFFF.
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        // &#1114111; is decimal for 0x10FFFF
        unescaper.translate("&#1114111;", 0, sw);
        assertEquals("\uD800\uDFFF", sw.toString()); // Represents U+10FFFF
    }
    
    @Test
    public void testHexEntityWithLowerX() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x42;", 0, sw); // 'B'
        assertEquals("B", sw.toString());
    }

    @Test
    public void testHexEntityWithUpperX() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#X43;", 0, sw); // 'C'
        assertEquals("C", sw.toString());
    }

    @Test
    public void testDecimalEntityOutsideAscii() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#200;", 0, sw); // character with code 200
        assertEquals("\u00C8", sw.toString());
    }

    @Test
    public void testHexEntityOutsideAscii() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x00C9;", 0, sw); // 'É'
        assertEquals("É", sw.toString());
    }
    
    @Test
    public void testSurroundingTextDecimal() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("Start &#97; End", 0, sw);
        assertEquals("Start a End", sw.toString());
    }

    @Test
    public void testSurroundingTextHex() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("Start &#x62; End", 0, sw);
        assertEquals("Start b End", sw.toString());
    }

    @Test
    public void testMultipleEntities() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#97;&#98;&#99;", 0, sw);
        assertEquals("abc", sw.toString());
    }

    @Test
    public void testMultipleHexEntities() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x61;&#x62;&#x63;", 0, sw);
        assertEquals("abc", sw.toString());
    }

    @Test
    public void testMixedEntities() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#97;&#x62;&#99;", 0, sw);
        assertEquals("abc", sw.toString());
    }
    
    @Test
    public void testEntityAtStart() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#65;bc", 0, sw);
        assertEquals("Abc", sw.toString());
    }

    @Test
    public void testEntityAtEnd() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("ab&#67;", 0, sw);
        assertEquals("abC", sw.toString());
    }

    @Test
    public void testHexEntityAtStart() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x44;ef", 0, sw);
        assertEquals("Def", sw.toString());
    }

    @Test
    public void testHexEntityAtEnd() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("de&#x45;", 0, sw);
        assertEquals("deE", sw.toString());
    }
    
    @Test
    public void testMaxUnicodeCodepoint() throws IOException {
        // U+10FFFF is the largest Unicode code point. It requires two char surrogates.
        // Its decimal value is 1114111.
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#1114111;", 0, sw);
        // Character.toChars(1114111) returns {'\uD800', '\uDFFF'}
        assertEquals("\uD800\uDFFF", sw.toString());
    }

    @Test
    public void testCodepointJustBelowMax() throws IOException {
        // U+10FFFE is just below the max Unicode code point.
        // Its decimal value is 1114110.
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#1114110;", 0, sw);
        // Character.toChars(1114110) returns {'\uD7FF', '\uDFFE'}
        assertEquals("\uD7FF\uDFFE", sw.toString());
    }
    
    @Test
    public void testCodepointJustAboveMax() throws IOException {
        // A value greater than 0x10FFFF is invalid as a Unicode code point.
        // The Character.toChars method would throw an IllegalArgumentException.
        // The NumericEntityUnescaper itself does not explicitly handle this,
        // but the Character.toChars method does.
        // The current implementation of NumericEntityUnescaper doesn't return 0 or anything.
        // Let's test for the exception thrown by Character.toChars.
        try {
            StringWriter sw = new StringWriter();
            NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
            unescaper.translate("&#1114112;", 0, sw); // 0x10FFFF + 1
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (IOException e) {
            fail("Caught unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testHexCodepointJustAboveMax() throws IOException {
        try {
            StringWriter sw = new StringWriter();
            NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
            unescaper.translate("&#x110000;", 0, sw); // 0x10FFFF + 1
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (IOException e) {
            fail("Caught unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testHexEntityWithLeadingZeros() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x000041;", 0, sw); // 'A'
        assertEquals("A", sw.toString());
    }
    
    @Test
    public void testDecimalEntityWithLeadingZeros() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#000097;", 0, sw); // 'a'
        assertEquals("a", sw.toString());
    }
    
    @Test
    public void testEntityWithNonHexCharsAfterX() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#xG;", 0, sw); // G is not a hex digit
        assertEquals("&#xG;", sw.toString()); // NumberFormatException caught, returns 0
    }

    @Test
    public void testEntityWithNonDecimalCharsAfterHash() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#1a;", 0, sw); // a is not a decimal digit
        assertEquals("&#1a;", sw.toString()); // NumberFormatException caught, returns 0
    }

    @Test
    public void testEntityWithJustXAndSemicolon() throws IOException {
        StringWriter sw = new StringWriter();
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        unescaper.translate("&#x;", 0, sw); // no digits after x
        assertEquals("&#x;", sw.toString()); // NumberFormatException caught, returns 0
    }
}
