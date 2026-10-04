package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.Minutes;
import org.joda.time.Weeks;
import org.joda.time.Days;
import org.joda.time.Years;
import org.joda.time.Months;
import org.joda.time.Hours;
import org.joda.time.Seconds;

public class BaseSingleFieldPeriodTest {
    @Test
    public void testSize() throws Exception {
        assertEquals(1, Days.days(3).size());
    }

    @Test
    public void testGetValueAtZero() throws Exception {
        assertEquals(7, Days.days(7).getValue(0));
    }

    @Test
    public void testGetValueAtNegativeIndex() throws Exception {
        try { Days.days(1).getValue(-1); fail("expected IndexOutOfBoundsException"); }
        catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testGetValueAtIndexOne() throws Exception {
        try { Days.days(1).getValue(1); fail("expected IndexOutOfBoundsException"); }
        catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testGetMatchingField() throws Exception {
        assertEquals(4, Days.days(4).get(DurationFieldType.days()));
    }

    @Test
    public void testGetDifferentField() throws Exception {
        assertEquals(0, Days.days(4).get(DurationFieldType.hours()));
    }

    @Test
    public void testGetNullField() throws Exception {
        assertEquals(0, Days.days(4).get(null));
    }

    @Test
    public void testSupportedMatchingField() throws Exception {
        assertTrue(Days.days(1).isSupported(DurationFieldType.days()));
    }

    @Test
    public void testUnsupportedDifferentField() throws Exception {
        assertFalse(Days.days(1).isSupported(DurationFieldType.hours()));
    }

    @Test
    public void testUnsupportedNullField() throws Exception {
        assertFalse(Days.days(1).isSupported(null));
    }

    @Test
    public void testToPeriodPreservesPositiveValue() throws Exception {
        Period result = Days.days(5).toPeriod();
        assertEquals(5, result.getDays());
    }

    @Test
    public void testToPeriodPreservesNegativeValue() throws Exception {
        Period result = Days.days(-2).toPeriod();
        assertEquals(-2, result.getDays());
    }

    @Test
    public void testToMutablePeriodPreservesValue() throws Exception {
        MutablePeriod result = Days.days(6).toMutablePeriod();
        assertEquals(6, result.get(DurationFieldType.days()));
    }

    @Test
    public void testToMutablePeriodZero() throws Exception {
        MutablePeriod result = Days.days(0).toMutablePeriod();
        assertEquals(0, result.get(DurationFieldType.days()));
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        Days value = Days.days(3);
        assertTrue(value.equals(value));
    }

    @Test
    public void testEqualsMatchingPeriod() throws Exception {
        assertTrue(Days.days(3).equals(Days.days(3)));
    }

    @Test
    public void testEqualsDifferentValue() throws Exception {
        assertFalse(Days.days(3).equals(Days.days(4)));
    }

    @Test
    public void testEqualsDifferentPeriodType() throws Exception {
        assertFalse(Days.days(3).equals(Hours.hours(3)));
    }

    @Test
    public void testEqualsNull() throws Exception {
        assertFalse(Days.days(3).equals(null));
    }

    @Test
    public void testEqualsUnrelatedObject() throws Exception {
        assertFalse(Days.days(3).equals("days"));
    }

    @Test
    public void testHashCodeFormula() throws Exception {
        Days value = Days.days(3);
        int expected = 27 * (27 * 17 + 3) + DurationFieldType.days().hashCode();
        assertEquals(expected, value.hashCode());
    }

    @Test
    public void testCompareToGreater() throws Exception {
        assertEquals(1, Days.days(2).compareTo(Days.days(1)));
    }

    @Test
    public void testCompareToLess() throws Exception {
        assertEquals(-1, Days.days(1).compareTo(Days.days(2)));
    }

    @Test
    public void testCompareToEqual() throws Exception {
        assertEquals(0, Days.days(2).compareTo(Days.days(2)));
    }

    @Test
    public void testCompareToDifferentConcreteClass() throws Exception {
        try { Days.days(1).compareTo(Weeks.weeks(1)); fail("expected ClassCastException"); }
        catch (ClassCastException expected) { }
    }
}
