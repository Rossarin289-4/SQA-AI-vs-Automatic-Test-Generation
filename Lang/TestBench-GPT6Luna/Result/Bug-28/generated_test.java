package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;

public class NumericEntityUnescaperTest {
    @Test
    public void testDecimalEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(5, t.translate("&#65;", 0, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testHexLowercasePrefix() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, t.translate("&#x41;", 0, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testHexUppercasePrefix() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, t.translate("&#X42;", 0, out));
        assertEquals("B", out.toString());
    }

    @Test
    public void testNonEntityDoesNotTranslate() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, t.translate("plain", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testWrongEntityMarkerDoesNotTranslate() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, t.translate("&a65;", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testZeroEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(4, t.translate("&#0;", 0, out));
        assertEquals("\u0000", out.toString());
    }

    @Test
    public void testLargestBmpEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(8, t.translate("&#65535;", 0, out));
        assertEquals("\uffff", out.toString());
    }

    @Test
    public void testFirstSupplementaryEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(8, t.translate("&#65536;", 0, out));
        assertEquals("\ud800\udc00", out.toString());
    }

    @Test
    public void testSupplementaryHexEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(9, t.translate("&#x10000;", 0, out));
        assertEquals("\ud800\udc00", out.toString());
    }

    @Test
    public void testMaximumSignedIntDecimal() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        try {
            t.translate("&#2147483647;", 0, out);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testDecimalAboveSignedIntReturnsZero() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, t.translate("&#2147483648;", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testNegativeDecimalEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(5, t.translate("&#-1;", 0, out));
        assertEquals(Character.toString((char) -1), out.toString());
    }

    @Test
    public void testNegativeHexEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, t.translate("&#x-1;", 0, out));
        assertEquals(Character.toString((char) -1), out.toString());
    }

    @Test
    public void testHexLettersAreCaseInsensitive() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(6, t.translate("&#xAf;", 0, out));
        assertEquals(Character.toString((char) 175), out.toString());
    }

    @Test
    public void testInvalidDigitReturnsZero() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(0, t.translate("&#12a;", 0, out));
        assertEquals("", out.toString());
    }

    @Test
    public void testMissingTerminatorReturnsZero() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        try {
            t.translate("&#12", 0, out);
            fail("expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) { }
    }

    @Test
    public void testTranslateAtNonzeroIndex() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(5, t.translate("z&#65;", 1, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testTranslateAppendsToWriter() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        out.write("X");
        assertEquals(5, t.translate("&#66;", 0, out));
        assertEquals("XB", out.toString());
    }

    @Test
    public void testZeroPaddedDecimalEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(8, t.translate("&#00065;", 0, out));
        assertEquals("A", out.toString());
    }

    @Test
    public void testZeroPaddedHexEntity() throws Exception {
        NumericEntityUnescaper t = new NumericEntityUnescaper();
        StringWriter out = new StringWriter();
        assertEquals(9, t.translate("&#x00041;", 0, out));
        assertEquals("A", out.toString());
    }
}
