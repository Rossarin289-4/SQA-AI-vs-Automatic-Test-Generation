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
    /**
     * test imaginary character.
     */
    @Test
    public void testImaginaryCharacter() {
        ComplexFormat cf = new ComplexFormat();
        assertEquals("i", cf.getImaginaryCharacter());
        cf.setImaginaryCharacter("j");
        assertEquals("j", cf.getImaginaryCharacter());
    }

    /**
     * test imaginary format.
     */
    @Test
    public void testImaginaryFormat() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        nf.setMaximumFractionDigits(3);
        ComplexFormat cf = new ComplexFormat(nf);
        assertEquals(nf.getMaximumFractionDigits(), cf.getImaginaryFormat().getMaximumFractionDigits());
        assertEquals(nf.getMaximumFractionDigits(), cf.getRealFormat().getMaximumFractionDigits());
        nf.setMaximumFractionDigits(5);
        cf.setImaginaryFormat(nf);
        assertEquals(5, cf.getImaginaryFormat().getMaximumFractionDigits());
    }

    /**
     * test real format.
     */
    @Test
    public void testRealFormat() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        nf.setMaximumFractionDigits(3);
        ComplexFormat cf = new ComplexFormat(nf);
        assertEquals(nf.getMaximumFractionDigits(), cf.getRealFormat().getMaximumFractionDigits());
        assertEquals(nf.getMaximumFractionDigits(), cf.getImaginaryFormat().getMaximumFractionDigits());
        nf.setMaximumFractionDigits(5);
        cf.setRealFormat(nf);
        assertEquals(5, cf.getRealFormat().getMaximumFractionDigits());
    }

    /**
     * test default instance.
     */
    @Test
    public void testGetInstance() {
        ComplexFormat cf = ComplexFormat.getInstance();
        assertEquals("i", cf.getImaginaryCharacter());
        assertEquals(2, cf.getRealFormat().getMaximumFractionDigits());
        assertEquals(2, cf.getImaginaryFormat().getMaximumFractionDigits());
    }

    /**
     * test default instance with locale.
     */
    @Test
    public void testGetInstanceLocale() {
        ComplexFormat cf = ComplexFormat.getInstance(Locale.FRANCE);
        assertEquals("i", cf.getImaginaryCharacter());
        assertEquals(2, cf.getRealFormat().getMaximumFractionDigits());
        assertEquals(2, cf.getImaginaryFormat().getMaximumFractionDigits());
    }

    /**
     * test available locales.
     */
    @Test
    public void testAvailableLocales() {
        Locale[] locales = ComplexFormat.getAvailableLocales();
        assertNotNull(locales);
        assertTrue(locales.length > 0);
    }

    /**
     * test format complex object.
     */
    @Test
    public void testFormatComplex() {
        Complex c = new Complex(1.23, 4.56);
        assertEquals("1.23 + 4.56i", ComplexFormat.formatComplex(c));
    }

    /**
     * test format complex object with custom imaginary char.
     */
    @Test
    public void testFormatComplexCustomImaginaryChar() {
        Complex c = new Complex(1.23, 4.56);
        ComplexFormat cf = new ComplexFormat("j");
        assertEquals("1.23 + 4.56j", cf.format(c));
    }

    /**
     * test format complex object with custom formats.
     */
    @Test
    public void testFormatComplexCustomFormats() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        nf.setMaximumFractionDigits(4);
        Complex c = new Complex(1.23456, 4.56789);
        ComplexFormat cf = new ComplexFormat(nf);
        assertEquals("1.2346 + 4.5679i", cf.format(c));
    }

    /**
     * test format complex object with custom real and imaginary formats.
     */
    @Test
    public void testFormatComplexCustomRealImaginaryFormats() {
        NumberFormat realNf = NumberFormat.getNumberInstance(Locale.US);
        realNf.setMaximumFractionDigits(4);
        NumberFormat imaginaryNf = NumberFormat.getNumberInstance(Locale.US);
        imaginaryNf.setMaximumFractionDigits(3);
        Complex c = new Complex(1.23456, 4.56789);
        ComplexFormat cf = new ComplexFormat(realNf, imaginaryNf);
        assertEquals("1.2346 + 4.568i", cf.format(c));
    }

    /**
     * test format complex object with negative imaginary part.
     */
    @Test
    public void testFormatComplexNegativeImaginary() {
        Complex c = new Complex(1.23, -4.56);
        assertEquals("1.23 - 4.56i", ComplexFormat.formatComplex(c));
    }

    /**
     * test format complex object with zero imaginary part.
     */
    @Test
    public void testFormatComplexZeroImaginary() {
        Complex c = new Complex(1.23, 0.0);
        assertEquals("1.23 + 0.00i", ComplexFormat.formatComplex(c));
    }
    
    /**
     * test format complex object with zero real and imaginary parts.
     */
    @Test
    public void testFormatComplexZeroRealImaginary() {
        Complex c = new Complex(0.0, 0.0);
        assertEquals("0.00 + 0.00i", ComplexFormat.formatComplex(c));
    }

    /**
     * test format complex object with NaN.
     */
    @Test
    public void testFormatComplexNaN() {
        Complex c = new Complex(Double.NaN, 1.23);
        assertEquals("(NaN) + 1.23i", ComplexFormat.formatComplex(c));
        c = new Complex(1.23, Double.NaN);
        assertEquals("1.23 + (NaN)i", ComplexFormat.formatComplex(c));
        c = new Complex(Double.NaN, Double.NaN);
        assertEquals("(NaN) + (NaN)i", ComplexFormat.formatComplex(c));
    }

    /**
     * test format complex object with Infinity.
     */
    @Test
    public void testFormatComplexInfinity() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.23);
        assertEquals("(Infinity) + 1.23i", ComplexFormat.formatComplex(c));
        c = new Complex(1.23, Double.NEGATIVE_INFINITY);
        assertEquals("1.23 + (-Infinity)i", ComplexFormat.formatComplex(c));
        c = new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        assertEquals("(Infinity) + (-Infinity)i", ComplexFormat.formatComplex(c));
    }

    /**
     * test format complex object with large numbers.
     */
    @Test
    public void testFormatComplexLargeNumbers() {
        Complex c = new Complex(1.23456789E10, 9.87654321E-10);
        assertEquals("1.23456789E10 + 9.87654321E-10i", ComplexFormat.formatComplex(c));
    }
    
    /**
     * test format complex object with small numbers.
     */
    @Test
    public void testFormatComplexSmallNumbers() {
        Complex c = new Complex(1.23456789E-10, 9.87654321E10);
        assertEquals("1.23456789E-10 + 9.87654321E10i", ComplexFormat.formatComplex(c));
    }


    /**
     * test format object of type Number.
     */
    @Test
    public void testFormatNumber() {
        ComplexFormat cf = new ComplexFormat();
        Number n = Double.valueOf(1.23);
        StringBuffer sb = new StringBuffer();
        cf.format(n, sb, new FieldPosition(0));
        assertEquals("1.23 + 0.00i", sb.toString());
    }

    /**
     * test format object of type Number with custom format.
     */
    @Test
    public void testFormatNumberCustomFormat() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        nf.setMaximumFractionDigits(4);
        ComplexFormat cf = new ComplexFormat(nf);
        Number n = Double.valueOf(1.23456);
        StringBuffer sb = new StringBuffer();
        cf.format(n, sb, new FieldPosition(0));
        assertEquals("1.2346 + 0.0000i", sb.toString());
    }

    /**
     * test format object of invalid type.
     */
    @Test
    public void testFormatInvalidObject() {
        ComplexFormat cf = new ComplexFormat();
        try {
            cf.format("1.23 + 4.56i", new StringBuffer(), new FieldPosition(0));
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    /**
     * test parse complex number.
     */
    @Test
    public void testParseComplex() {
        Complex c = new ComplexFormat().parse("1.23 + 4.56i");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(4.56, c.getImaginary(), 1e-9);
    }
    
    /**
     * test parse complex number with custom imaginary char.
     */
    @Test
    public void testParseComplexCustomImaginaryChar() {
        ComplexFormat cf = new ComplexFormat("j");
        Complex c = cf.parse("1.23 + 4.56j");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(4.56, c.getImaginary(), 1e-9);
    }

    /**
     * test parse complex number with custom formats.
     */
    @Test
    public void testParseComplexCustomFormats() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        nf.setMaximumFractionDigits(4);
        ComplexFormat cf = new ComplexFormat(nf);
        Complex c = cf.parse("1.2346 + 4.5679i");
        assertEquals(1.2346, c.getReal(), 1e-9);
        assertEquals(4.5679, c.getImaginary(), 1e-9);
    }

    /**
     * test parse complex number with custom real and imaginary formats.
     */
    @Test
    public void testParseComplexCustomRealImaginaryFormats() {
        NumberFormat realNf = NumberFormat.getNumberInstance(Locale.US);
        realNf.setMaximumFractionDigits(4);
        NumberFormat imaginaryNf = NumberFormat.getNumberInstance(Locale.US);
        imaginaryNf.setMaximumFractionDigits(3);
        ComplexFormat cf = new ComplexFormat(realNf, imaginaryNf);
        Complex c = cf.parse("1.2346 + 4.568i");
        assertEquals(1.2346, c.getReal(), 1e-9);
        assertEquals(4.568, c.getImaginary(), 1e-9);
    }

    /**
     * test parse complex number with negative imaginary part.
     */
    @Test
    public void testParseComplexNegativeImaginary() {
        Complex c = new ComplexFormat().parse("1.23 - 4.56i");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(-4.56, c.getImaginary(), 1e-9);
    }

    /**
     * test parse complex number with zero imaginary part.
     */
    @Test
    public void testParseComplexZeroImaginary() {
        Complex c = new ComplexFormat().parse("1.23 + 0.00i");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(0.00, c.getImaginary(), 1e-9);
    }
    
    /**
     * test parse complex number with only real part.
     */
    @Test
    public void testParseComplexOnlyReal() {
        Complex c = new ComplexFormat().parse("1.23");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(0.0, c.getImaginary(), 1e-9);
    }

    /**
     * test parse complex number with NaN.
     */
    @Test
    public void testParseComplexNaN() {
        Complex c = new ComplexFormat().parse("(NaN) + 1.23i");
        assertTrue(Double.isNaN(c.getReal()));
        assertEquals(1.23, c.getImaginary(), 1e-9);
        c = new ComplexFormat().parse("1.23 + (NaN)i");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertTrue(Double.isNaN(c.getImaginary()));
        c = new ComplexFormat().parse("(NaN) + (NaN)i");
        assertTrue(Double.isNaN(c.getReal()));
        assertTrue(Double.isNaN(c.getImaginary()));
    }

    /**
     * test parse complex number with Infinity.
     */
    @Test
    public void testParseComplexInfinity() {
        Complex c = new ComplexFormat().parse("(Infinity) + 1.23i");
        assertEquals(Double.POSITIVE_INFINITY, c.getReal(), 0.0);
        assertEquals(1.23, c.getImaginary(), 1e-9);
        c = new ComplexFormat().parse("1.23 + (-Infinity)i");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(Double.NEGATIVE_INFINITY, c.getImaginary(), 0.0);
        c = new ComplexFormat().parse("(Infinity) + (-Infinity)i");
        assertEquals(Double.POSITIVE_INFINITY, c.getReal(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, c.getImaginary(), 0.0);
    }

    /**
     * test parse complex number with whitespace.
     */
    @Test
    public void testParseComplexWhitespace() {
        Complex c = new ComplexFormat().parse("  1.23  +  4.56i  ");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(4.56, c.getImaginary(), 1e-9);
    }

    /**
     * test parse complex number with invalid input.
     */
    @Test
    public void testParseComplexInvalid() throws ParseException {
        try {
            new ComplexFormat().parse("1.23 + 4.56k");
            fail("ParseException");
        } catch (ParseException e) {
            // Expected
        }
        try {
            new ComplexFormat().parse("abc");
            fail("ParseException");
        } catch (ParseException e) {
            // Expected
        }
    }
    
    /**
     * test parse complex number with only imaginary part.
     */
    @Test
    public void testParseComplexOnlyImaginary() {
        Complex c = new ComplexFormat().parse("+4.56i");
        assertEquals(0.0, c.getReal(), 1e-9);
        assertEquals(4.56, c.getImaginary(), 1e-9);
        c = new ComplexFormat().parse("-4.56i");
        assertEquals(0.0, c.getReal(), 1e-9);
        assertEquals(-4.56, c.getImaginary(), 1e-9);
    }

    /**
     * test parseObject method.
     */
    @Test
    public void testParseObject() throws ParseException {
        ComplexFormat cf = new ComplexFormat();
        ParsePosition pos = new ParsePosition(0);
        Object obj = cf.parseObject("1.23 + 4.56i", pos);
        assertTrue(obj instanceof Complex);
        Complex c = (Complex) obj;
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(4.56, c.getImaginary(), 1e-9);
        assertEquals(13, pos.getIndex());
    }
    
    /**
     * Test with a NumberFormat that uses a comma as a decimal separator.
     */
    @Test
    public void testParseWithCommaDecimalSeparator() throws ParseException {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMANY);
        ComplexFormat cf = new ComplexFormat(nf);
        Complex c = cf.parse("1,23 + 4,56i");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(4.56, c.getImaginary(), 1e-9);
    }
    
    /**
     * Test with a NumberFormat that uses a comma as a decimal separator and custom imaginary character.
     */
    @Test
    public void testParseWithCommaDecimalSeparatorAndCustomImaginary() throws ParseException {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMANY);
        ComplexFormat cf = new ComplexFormat("j", nf);
        Complex c = cf.parse("1,23 + 4,56j");
        assertEquals(1.23, c.getReal(), 1e-9);
        assertEquals(4.56, c.getImaginary(), 1e-9);
    }

    /**
     * Test edge case where imaginary part is very close to zero.
     */
    @Test
    public void testFormatImaginaryCloseToZero() {
        Complex c = new Complex(1.0, 1e-15);
        // With default format (2 decimal places), this should be 0.00
        assertEquals("1.00 + 0.00i", ComplexFormat.formatComplex(c));
    }

    /**
     * Test edge case where imaginary part is very close to zero (negative).
     */
    @Test
    public void testFormatImaginaryCloseToZeroNegative() {
        Complex c = new Complex(1.0, -1e-15);
        // With default format (2 decimal places), this should be -0.00
        assertEquals("1.00 - 0.00i", ComplexFormat.formatComplex(c));
    }

    /**
     * Test with a complex number where real part is NaN and imaginary part is 0.
     */
    @Test
    public void testFormatRealNaNImaginaryZero() {
        Complex c = new Complex(Double.NaN, 0.0);
        assertEquals("(NaN) + 0.00i", ComplexFormat.formatComplex(c));
    }

    /**
     * Test with a complex number where real part is infinity and imaginary part is 0.
     */
    @Test
    public void testFormatRealInfinityImaginaryZero() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 0.0);
        assertEquals("(Infinity) + 0.00i", ComplexFormat.formatComplex(c));
    }

    /**
     * Test with a complex number where real part is 0 and imaginary part is NaN.
     */
    @Test
    public void testFormatRealZeroImaginaryNaN() {
        Complex c = new Complex(0.0, Double.NaN);
        assertEquals("0.00 + (NaN)i", ComplexFormat.formatComplex(c));
    }

    /**
     * Test with a complex number where real part is 0 and imaginary part is infinity.
     */
    @Test
    public void testFormatRealZeroImaginaryInfinity() {
        Complex c = new Complex(0.0, Double.NEGATIVE_INFINITY);
        assertEquals("0.00 + (-Infinity)i", ComplexFormat.formatComplex(c));
    }
}
