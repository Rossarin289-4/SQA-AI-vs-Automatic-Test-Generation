package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.ParseException;
import java.util.Locale;
import org.apache.commons.math.util.MathUtils;

public class ProperFractionFormatTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testFormatPositiveFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(7, 2); // 3 1/2
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("3 / 2", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatPositiveFractionWithWholePart() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(10, 3); // 3 1/3
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("3 1 / 3", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatPositiveFractionWithZeroNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(0, 5); // 0
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("0 / 5", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatPositiveFractionWithWholeAndZeroNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(15, 5); // 3
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("3 / 5", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatNegativeFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(-7, 2); // -3 1/2
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("-3 1 / 2", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatNegativeFractionWithWholePart() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(-10, 3); // -3 1/3
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("-3 1 / 3", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatNegativeFractionWithZeroNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(0, -5); // 0
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("0 / -5", buffer.toString()); // Denominator sign retained
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatNegativeFractionWithWholeAndZeroNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(-15, 5); // -3
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("-3 / 5", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatWithCustomWholeFormat() throws Exception {
        NumberFormat customWholeFormat = NumberFormat.getNumberInstance(Locale.US);
        customWholeFormat.setMinimumIntegerDigits(3);
        ProperFractionFormat format = new ProperFractionFormat(customWholeFormat, NumberFormat.getIntegerInstance(), NumberFormat.getIntegerInstance());
        Fraction fraction = new Fraction(7, 2); // 3 1/2
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("003 1 / 2", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testFormatWithCustomNumeratorDenominatorFormat() throws Exception {
        NumberFormat customNumeratorFormat = NumberFormat.getNumberInstance(Locale.US);
        customNumeratorFormat.setMaximumFractionDigits(0);
        NumberFormat customDenominatorFormat = NumberFormat.getNumberInstance(Locale.US);
        customDenominatorFormat.setMaximumFractionDigits(0);
        ProperFractionFormat format = new ProperFractionFormat(NumberFormat.getIntegerInstance(), customNumeratorFormat, customDenominatorFormat);
        Fraction fraction = new Fraction(10, 3); // 3 1/3
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("3 1 / 3", buffer.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testParseProperFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "3 1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(7, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
        assertEquals(3, pos.getIndex());
    }

    @Test
    public void testParseImproperFractionViaSuper() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "7/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(7, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
        assertEquals(3, pos.getIndex()); // Superclass parses until end
    }

    @Test
    public void testParseNegativeProperFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "-3 1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(-7, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
        assertEquals(6, pos.getIndex());
    }

    @Test
    public void testParseFractionWithZeroNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "0/5";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(0, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
        assertEquals(3, pos.getIndex());
    }

    @Test
    public void testParseFractionWithWholeAndZeroNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "3 0/5";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(3, fraction.getNumerator()); // Treated as 3/1 * 5 + 0
        assertEquals(5, fraction.getDenominator());
        assertEquals(5, pos.getIndex());
    }

    @Test
    public void testParseFractionWithWholeNumberOnly() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "5";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(5, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
        assertEquals(1, pos.getIndex());
    }

    @Test
    public void testParseFractionWithNegativeWholeNumberOnly() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "-5";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(-5, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
        assertEquals(2, pos.getIndex());
    }

    @Test
    public void testParseFractionWithWhitespace() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "  3  1 / 2  ";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(7, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
        assertEquals(12, pos.getIndex()); // Should parse trailing whitespace
    }

    @Test
    public void testParseInvalidFractionNoSlash() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "3 1";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNull(fraction);
        assertEquals(0, pos.getIndex()); // Should not advance
        assertEquals(2, pos.getErrorIndex()); // Error at '1'
    }

    @Test
    public void testParseInvalidFractionNegativeNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "3 -1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNull(fraction);
        assertEquals(0, pos.getIndex()); // Should reset
        assertEquals(2, pos.getErrorIndex()); // Error at '-'
    }

    @Test
    public void testParseInvalidFractionNegativeDenominator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "3 1/-2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNull(fraction);
        assertEquals(0, pos.getIndex()); // Should reset
        assertEquals(4, pos.getErrorIndex()); // Error at '-'
    }

    @Test
    public void testParseInvalidFractionDoubleSlash() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "3 1//2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNull(fraction);
        assertEquals(0, pos.getIndex()); // Should reset
        assertEquals(4, pos.getErrorIndex()); // Error at second '/'
    }

    @Test
    public void testParseEmptyString() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNull(fraction);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testParseNullString() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(null, pos);
        assertNull(fraction);
        assertEquals(0, pos.getIndex());
    }

    @Test
    public void testGetSetWholeFormat() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        NumberFormat newFormat = NumberFormat.getCurrencyInstance();
        format.setWholeFormat(newFormat);
        assertEquals(newFormat, format.getWholeFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWholeFormatNull() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        format.setWholeFormat(null);
    }

    @Test
    public void testFormatEdgeCaseNumeratorOne() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(1, 2); // 0 1/2
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("0 1 / 2", buffer.toString());
    }

    @Test
    public void testFormatEdgeCaseDenominatorOne() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = new Fraction(3, 1); // 3
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("3 / 1", buffer.toString());
    }

    @Test
    public void testParseEdgeCaseNumeratorOne() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "0 1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
        assertEquals(5, pos.getIndex());
    }

    @Test
    public void testParseEdgeCaseDenominatorOne() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "3/1";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(3, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
        assertEquals(3, pos.getIndex());
    }

    @Test
    public void testParseWithZeroAsWhole() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "0 1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
        assertEquals(5, pos.getIndex());
    }

    @Test
    public void testFormatZeroValue() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = Fraction.getReducedFraction(0, 1);
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("0 / 1", buffer.toString());
    }

    @Test
    public void testFormatProperFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        Fraction fraction = Fraction.getReducedFraction(1, 2);
        StringBuffer buffer = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(fraction, buffer, pos);
        assertEquals("0 1 / 2", buffer.toString());
    }

    @Test
    public void testParseFractionWithNoWholePart() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        String source = "1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction fraction = format.parse(source, pos);
        assertNotNull(fraction);
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
        assertEquals(3, pos.getIndex());
    }
}
