package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

public class ComplexFormatTest {
    @Test
    public void testFormatPositiveImaginary() throws Exception {
        ComplexFormat f = new ComplexFormat();
        assertEquals("2 + 3i", f.format(new Complex(2, 3)));
    }

    @Test
    public void testFormatNegativeImaginary() throws Exception {
        ComplexFormat f = new ComplexFormat();
        assertEquals("2 - 3i", f.format(new Complex(2, -3)));
    }

    @Test
    public void testFormatZeroImaginary() throws Exception {
        ComplexFormat f = new ComplexFormat();
        assertEquals("2", f.format(new Complex(2, 0)));
    }

    @Test
    public void testFormatNaNImaginary() throws Exception {
        ComplexFormat f = new ComplexFormat();
        assertEquals("2 + (NaN)i", f.format(new Complex(2, Double.NaN)));
    }

    @Test
    public void testFormatInfiniteComponents() throws Exception {
        ComplexFormat f = new ComplexFormat();
        assertEquals("(Infinity) + (Infinity)i",
                f.format(new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testFormatAppendsAndReturnsBuffer() throws Exception {
        ComplexFormat f = new ComplexFormat();
        StringBuffer b = new StringBuffer("x");
        FieldPosition p = new FieldPosition(0);
        StringBuffer result = f.format(new Complex(1, 2), b, p);
        assertSame(b, result);
        assertEquals("x1 + 2i", b.toString());
        assertEquals(0, p.getBeginIndex());
        assertEquals(5, p.getEndIndex());
    }

    @Test
    public void testFormatCustomImaginaryCharacter() throws Exception {
        ComplexFormat f = new ComplexFormat("j");
        assertEquals("1 + 2j", f.format(new Complex(1, 2)));
    }

    @Test
    public void testFormatComplexStaticMethod() throws Exception {
        assertEquals("1 + 2i", ComplexFormat.formatComplex(new Complex(1, 2)));
    }

    @Test
    public void testAvailableLocalesMatchesNumberFormat() throws Exception {
        assertArrayEquals(NumberFormat.getAvailableLocales(), ComplexFormat.getAvailableLocales());
    }

    @Test
    public void testGetInstanceForLocaleUsesLocaleFormat() throws Exception {
        ComplexFormat f = ComplexFormat.getInstance(Locale.US);
        assertEquals("1.5", f.format(new Complex(1.5, 0)));
        assertEquals(2, f.getRealFormat().getMaximumFractionDigits());
    }

    @Test
    public void testSetImaginaryCharacter() throws Exception {
        ComplexFormat f = new ComplexFormat();
        f.setImaginaryCharacter("j");
        assertEquals("j", f.getImaginaryCharacter());
        assertEquals("1 + 2j", f.format(new Complex(1, 2)));
    }

    @Test
    public void testRejectNullImaginaryCharacter() throws Exception {
        ComplexFormat f = new ComplexFormat();
        try {
            f.setImaginaryCharacter(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("i", f.getImaginaryCharacter());
    }

    @Test
    public void testRejectEmptyImaginaryCharacter() throws Exception {
        ComplexFormat f = new ComplexFormat();
        try {
            f.setImaginaryCharacter("");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("i", f.getImaginaryCharacter());
    }

    @Test
    public void testSetFormats() throws Exception {
        ComplexFormat f = new ComplexFormat();
        NumberFormat n = NumberFormat.getIntegerInstance(Locale.US);
        f.setRealFormat(n);
        f.setImaginaryFormat(n);
        assertSame(n, f.getRealFormat());
        assertSame(n, f.getImaginaryFormat());
        assertEquals("2 + 3i", f.format(new Complex(2.4, 3.4)));
    }

    @Test
    public void testRejectNullRealFormat() throws Exception {
        ComplexFormat f = new ComplexFormat();
        try {
            f.setRealFormat(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("2", f.format(new Complex(2, 0)));
    }

    @Test
    public void testRejectNullImaginaryFormat() throws Exception {
        ComplexFormat f = new ComplexFormat();
        try {
            f.setImaginaryFormat(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals("1 + 2i", f.format(new Complex(1, 2)));
    }

    @Test
    public void testParseRealOnly() throws Exception {
        Complex c = new ComplexFormat().parse("12");
        assertEquals(12.0, c.getReal(), 0.0);
        assertEquals(0.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testParseSignedImaginaryParts() throws Exception {
        ComplexFormat f = new ComplexFormat();
        Complex plus = f.parse("1 + 2i");
        Complex minus = f.parse("1 - 2i");
        assertEquals(2.0, plus.getImaginary(), 0.0);
        assertEquals(-2.0, minus.getImaginary(), 0.0);
    }

    @Test
    public void testParseLeadingWhitespace() throws Exception {
        Complex c = new ComplexFormat().parse(" 1 + 2i");
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testParseCustomImaginaryCharacter() throws Exception {
        Complex c = new ComplexFormat("xy").parse("1 + 2xy");
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testParseSpecialNaN() throws Exception {
        Complex c = new ComplexFormat().parse("(NaN) + 2i");
        assertTrue(Double.isNaN(c.getReal()));
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testParseSpecialInfinity() throws Exception {
        Complex c = new ComplexFormat().parse("(Infinity) - 2i");
        assertEquals(Double.POSITIVE_INFINITY, c.getReal(), 0.0);
        assertEquals(-2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testParsePositionConsumesComplexPrefix() throws Exception {
        ParsePosition p = new ParsePosition(0);
        Complex c = new ComplexFormat().parse("1 + 2i tail", p);
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(6, p.getIndex());
    }

    @Test
    public void testParsePositionFailureRestoresIndex() throws Exception {
        ParsePosition p = new ParsePosition(0);
        Complex c = new ComplexFormat().parse("1 * 2i", p);
        assertNull(c);
        assertEquals(0, p.getIndex());
        assertEquals(1, p.getErrorIndex());
    }

    @Test
    public void testParseThrowsOnUnparseableInput() throws Exception {
        try {
            new ComplexFormat().parse("x");
            fail("expected ParseException");
        } catch (ParseException expected) { }
    }

    @Test
    public void testParseObject() throws Exception {
        ParsePosition p = new ParsePosition(0);
        Object result = new ComplexFormat().parseObject("3 + 4i", p);
        assertEquals(3.0, ((Complex) result).getReal(), 0.0);
        assertEquals(4.0, ((Complex) result).getImaginary(), 0.0);
        assertEquals(6, p.getIndex());
    }
}
