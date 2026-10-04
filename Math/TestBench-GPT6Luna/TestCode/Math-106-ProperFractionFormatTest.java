package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import org.apache.commons.math.util.MathUtils;

public class ProperFractionFormatTest {
    @Test
    public void testGetWholeFormatReturnsConfiguredFormat() throws Exception {
        NumberFormat whole = NumberFormat.getIntegerInstance();
        ProperFractionFormat format = new ProperFractionFormat(
                whole, NumberFormat.getIntegerInstance(),
                NumberFormat.getIntegerInstance());
        assertSame(whole, format.getWholeFormat());
    }

    @Test
    public void testSetWholeFormatUpdatesGetter() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        NumberFormat whole = NumberFormat.getIntegerInstance();
        format.setWholeFormat(whole);
        assertSame(whole, format.getWholeFormat());
    }

    @Test
    public void testSetWholeFormatRejectsNull() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        try {
            format.setWholeFormat(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testFormatProperPositiveFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        assertEquals("1 1 / 2", format.format(new Fraction(3, 2),
                new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatProperNegativeFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        assertEquals("-1 1 / 2", format.format(new Fraction(-3, 2),
                new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatFractionLessThanOne() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        assertEquals("1 / 2", format.format(new Fraction(1, 2),
                new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatIntegralFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        assertEquals("2 0 / 1", format.format(new Fraction(2, 1),
                new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatZeroFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        assertEquals("0 / 1", format.format(new Fraction(0, 1),
                new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatAppendsAndReturnsSuppliedBuffer() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        StringBuffer buffer = new StringBuffer("x");
        StringBuffer result = format.format(new Fraction(1, 2), buffer,
                new FieldPosition(0));
        assertSame(buffer, result);
        assertEquals("x1 / 2", buffer.toString());
    }

    @Test
    public void testFormatResetsFieldPosition() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        FieldPosition position = new FieldPosition(0);
        position.setBeginIndex(4);
        position.setEndIndex(6);
        format.format(new Fraction(1, 2), new StringBuffer(), position);
        assertEquals(4, position.getBeginIndex());
        assertEquals(6, position.getEndIndex());
    }

    @Test
    public void testParseImproperFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertEquals(new Fraction(3, 2), format.parse("3 / 2", position));
        assertEquals(5, position.getIndex());
    }

    @Test
    public void testParsePositiveProperFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertEquals(new Fraction(7, 2), format.parse("3 1/2", position));
    }

    @Test
    public void testParseNegativeProperFraction() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertEquals(new Fraction(-7, 2), format.parse("-3 1/2", position));
    }

    @Test
    public void testParseWholeNumberAndNumeratorWithoutDenominator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertEquals(new Fraction(3, 1), format.parse("3 0", position));
    }

    @Test
    public void testParseWholeAndNumeratorWithoutSlash() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertEquals(new Fraction(10, 1), format.parse("3 7", position));
    }

    @Test
    public void testParseRejectsNegativeNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertNull(format.parse("3 -1/2", position));
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testParseRejectsNegativeDenominator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertNull(format.parse("3 1/-2", position));
        assertEquals(0, position.getIndex());
    }

    @Test
    public void testParseInvalidCharacterAfterNumerator() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertEquals(new Fraction(3, 1), format.parse("3 1x", position));
    }

    @Test
    public void testParseRestoresInitialIndexWhenWholeIsInvalid() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(1);
        assertNull(format.parse("xabc", position));
        assertEquals(1, position.getIndex());
    }

    @Test
    public void testParseWhitespaceAroundParts() throws Exception {
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition position = new ParsePosition(0);
        assertEquals(new Fraction(7, 2),
                format.parse(" 3 1 / 2", position));
    }
}
