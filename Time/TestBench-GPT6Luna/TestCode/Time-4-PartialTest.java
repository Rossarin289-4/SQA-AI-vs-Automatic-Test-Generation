package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class PartialTest {
    @Test
    public void testEmptyPartial() throws Exception {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertEquals("[]", p.toStringList());
    }

    @Test
    public void testSingleFieldEdgesAndAccessors() throws Exception {
        Partial p = new Partial(DateTimeFieldType.dayOfMonth(), 31);
        assertEquals(1, p.size());
        assertEquals(31, p.getValue(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), p.getFieldType(0));
        assertArrayEquals(new int[] {31}, p.getValues());
    }

    @Test
    public void testArrayConstructionClonesInputs() throws Exception {
        DateTimeFieldType[] types = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()};
        int[] values = {23, 59};
        Partial p = new Partial(types, values);
        types[0] = DateTimeFieldType.secondOfMinute();
        values[0] = 0;
        assertArrayEquals(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, p.getFieldTypes());
        assertArrayEquals(new int[] {23, 59}, p.getValues());
    }

    @Test
    public void testReturnedArraysAreIndependent() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        p.getValues()[0] = 0;
        p.getFieldTypes()[0] = DateTimeFieldType.minuteOfHour();
        assertEquals(23, p.getValue(0));
        assertEquals(DateTimeFieldType.hourOfDay(), p.getFieldType(0));
    }

    @Test
    public void testWithInsertsFieldsInOrder() throws Exception {
        Partial p = new Partial().with(DateTimeFieldType.minuteOfHour(), 59)
                .with(DateTimeFieldType.hourOfDay(), 23);
        assertEquals(2, p.size());
        assertArrayEquals(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()}, p.getFieldTypes());
        assertArrayEquals(new int[] {23, 59}, p.getValues());
    }

    @Test
    public void testWithReplacesExistingValue() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        Partial changed = p.with(DateTimeFieldType.hourOfDay(), 0);
        assertEquals(0, changed.getValue(0));
        assertEquals(23, p.getValue(0));
    }

    @Test
    public void testWithSameValueReturnsSamePartial() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        assertSame(p, p.with(DateTimeFieldType.hourOfDay(), 23));
    }

    @Test
    public void testWithoutRemovesField() throws Exception {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
                new int[] {23, 59});
        Partial result = p.without(DateTimeFieldType.hourOfDay());
        assertEquals(1, result.size());
        assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(0));
        assertEquals(59, result.getValue(0));
    }

    @Test
    public void testWithoutUnsupportedFieldKeepsSamePartial() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        assertSame(p, p.without(DateTimeFieldType.minuteOfHour()));
    }

    @Test
    public void testWithFieldUpdatesSupportedField() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        Partial result = p.withField(DateTimeFieldType.hourOfDay(), 0);
        assertEquals(0, result.getValue(0));
        assertEquals(23, p.getValue(0));
    }

    @Test
    public void testWithFieldAddedCarriesIntoHour() throws Exception {
        Partial p = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
                new int[] {22, 59});
        Partial result = p.withFieldAdded(DurationFieldType.minutes(), 1);
        assertArrayEquals(new int[] {23, 0}, result.getValues());
    }

    @Test
    public void testWithFieldAddedZeroReturnsSamePartial() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        assertSame(p, p.withFieldAdded(DurationFieldType.hours(), 0));
    }

    @Test
    public void testWithFieldAddWrappedWrapsHour() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        Partial result = p.withFieldAddWrapped(DurationFieldType.hours(), 1);
        assertEquals(0, result.getValue(0));
    }

    @Test
    public void testWithFieldAddWrappedNegativeEdge() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 0);
        Partial result = p.withFieldAddWrapped(DurationFieldType.hours(), -1);
        assertEquals(23, result.getValue(0));
    }

    @Test
    public void testWithPeriodAddedIgnoresAbsentFields() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        Partial result = p.withPeriodAdded(new Period(0, 1, 0, 0), 1);
        assertEquals(23, result.getValue(0));
    }

    @Test
    public void testPlusAddsMatchingPeriodField() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 22);
        Partial result = p.plus(new Period(0, 0, 0, 2));
        assertEquals(22, result.getValue(0));
    }

    @Test
    public void testMinusSubtractsMatchingPeriodField() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 2);
        Partial result = p.minus(new Period(0, 0, 0, 1));
        assertEquals(2, result.getValue(0));
    }

    @Test
    public void testPropertySetAndCopy() throws Exception {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial.Property property = p.property(DateTimeFieldType.monthOfYear());
        Partial result = property.setCopy(1);
        assertEquals(12, property.get());
        assertEquals(1, result.getValue(0));
        assertSame(p, property.getPartial());
    }

    @Test
    public void testPropertyMaximumAndMinimum() throws Exception {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property property = p.property(DateTimeFieldType.monthOfYear());
        assertEquals(12, property.withMaximumValue().getValue(0));
        assertEquals(1, property.withMinimumValue().getValue(0));
    }

    @Test
    public void testPropertyAddAndWrapAtMonthBoundary() throws Exception {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial.Property property = p.property(DateTimeFieldType.monthOfYear());
        assertEquals(1, property.addToCopy(1).getValue(0));
        assertEquals(1, property.addWrapFieldToCopy(1).getValue(0));
    }

    @Test
    public void testIsMatchWithMatchingPartial() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        Partial other = new Partial(new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
                new int[] {23, 59});
        assertTrue(p.isMatch((ReadablePartial) other));
    }

    @Test
    public void testIsMatchWithDifferentValue() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        Partial other = new Partial(DateTimeFieldType.hourOfDay(), 0);
        assertFalse(p.isMatch((ReadablePartial) other));
    }

    @Test
    public void testFormatterAndStringOutput() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        assertNotNull(p.getFormatter());
        assertEquals("[hourOfDay=23]", p.toStringList());
        assertEquals("23", p.toString("H"));
    }

    @Test
    public void testRetainFieldsWithChronology() throws Exception {
        Partial p = new Partial(DateTimeFieldType.dayOfMonth(), 31);
        Partial result = p.withChronologyRetainFields(p.getChronology());
        assertSame(p, result);
        assertEquals(31, result.getValue(0));
    }

    @Test
    public void testNullTypeRejected() throws Exception {
        try {
            new Partial((DateTimeFieldType) null, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testHourFieldBoundaryValues() throws Exception {
        Partial p = new Partial(DateTimeFieldType.hourOfDay(), 23);
        assertEquals(23, p.getValue(0));
        assertEquals(0, p.withField(DateTimeFieldType.hourOfDay(), 0).getValue(0));
    }
}
