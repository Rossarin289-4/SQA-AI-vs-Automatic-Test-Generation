package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

public class NumericEntityUnescaperTest {
    @Test
    public void testDecimalEntityWithSemicolon() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(5, translator.translate("&#65;", 0, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testDecimalEntityWithoutSemicolon() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(4, translator.translate("&#65", 0, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testHexLowercasePrefix() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, translator.translate("&#x41;", 0, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testHexUppercasePrefix() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, translator.translate("&#X41;", 0, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testLowercaseHexDigits() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, translator.translate("&#x4a;", 0, out));
        assertEquals("J", out.toString());
    }

    @Test
    public void testUppercaseHexDigits() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, translator.translate("&#x4A;", 0, out));
        assertEquals("J", out.toString());
    }

    @Test
    public void testEntityAtNonzeroIndex() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(5, translator.translate("z&#66;", 1, out));
        assertEquals("B", out.toString());
    }

    @Test
    public void testLeadingAmpersandAtIndexZeroDoesNotTranslate() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("&", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testNonEntityDoesNotTranslate() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("abc", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testInvalidDecimalDigitsDoNotTranslate() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("&#q;", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testInvalidHexDigitsDoNotTranslate() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("&#xg;", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testDecimalZero() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(4, translator.translate("&#0;", 0, out));
        assertEquals("\u0000", out.toString());
    }

    @Test
    public void testLargestDecimalBmpValue() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(8, translator.translate("&#65535;", 0, out));
        assertEquals(1, out.toString().length());
        assertEquals(65535, out.toString().charAt(0));
    }

    @Test
    public void testFirstDecimalSupplementaryValue() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(8, translator.translate("&#65536;", 0, out));
        assertEquals(2, out.toString().length());
        assertEquals(65536, Character.toCodePoint(out.toString().charAt(0), out.toString().charAt(1)));
    }

    @Test
    public void testFirstValueAboveIntegerRangeIsRejected() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, translator.translate("&#2147483648;", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testLargestHexBmpValue() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(8, translator.translate("&#xFFFF;", 0, out));
        assertEquals(1, out.toString().length());
        assertEquals(65535, out.toString().charAt(0));
    }

    @Test
    public void testFirstHexSupplementaryValue() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(9, translator.translate("&#x10000;", 0, out));
        assertEquals(2, out.toString().length());
        assertEquals(65536, Character.toCodePoint(out.toString().charAt(0), out.toString().charAt(1)));
    }

    @Test
    public void testHexValueBeyondUnicodeRangeThrows() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        try {
            translator.translate("&#x110000;", 0, out);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("", out.toString());
        }
    }

    @Test
    public void testSemicolonAfterDigitsIsConsumed() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(4, translator.translate("&#7;z", 0, out));
        assertEquals("\u0007", out.toString());
    }

    @Test
    public void testNoSemicolonBeforeTrailingCharacter() throws Exception {
        NumericEntityUnescaper translator = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(3, translator.translate("&#7z", 0, out));
        assertEquals("\u0007", out.toString());
    }
}
