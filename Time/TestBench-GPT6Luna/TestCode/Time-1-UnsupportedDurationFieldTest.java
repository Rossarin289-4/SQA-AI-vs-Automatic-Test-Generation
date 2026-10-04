package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.Partial;
import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.Chronology;

public class UnsupportedDurationFieldTest {
    @Test
    public void testCachedInstanceForSameType() throws Exception {
        UnsupportedDurationField first = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField second = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertSame(first, second);
    }

    @Test
    public void testDifferentTypesHaveExpectedNames() throws Exception {
        assertEquals("days", UnsupportedDurationField.getInstance(DurationFieldType.days()).getName());
        assertEquals("hours", UnsupportedDurationField.getInstance(DurationFieldType.hours()).getName());
    }

    @Test
    public void testTypeIsPreserved() throws Exception {
        DurationFieldType type = DurationFieldType.minutes();
        assertSame(type, UnsupportedDurationField.getInstance(type).getType());
    }

    @Test
    public void testUnsupportedAndPreciseFlags() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertFalse(field.isSupported());
        assertTrue(field.isPrecise());
    }

    @Test
    public void testUnitMillisIsZero() throws Exception {
        assertEquals(0L, UnsupportedDurationField.getInstance(DurationFieldType.millis()).getUnitMillis());
    }

    @Test
    public void testCompareToReturnsZero() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        DurationField other = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertEquals(0, field.compareTo(other));
    }

    @Test
    public void testEqualsByFieldName() throws Exception {
        UnsupportedDurationField days = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField hours = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertTrue(days.equals(days));
        assertFalse(days.equals(hours));
        assertFalse(days.equals(null));
    }

    @Test
    public void testHashCodeUsesNameHash() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals("days".hashCode(), field.hashCode());
    }

    @Test
    public void testToStringIncludesName() throws Exception {
        assertEquals("UnsupportedDurationField[days]",
                UnsupportedDurationField.getInstance(DurationFieldType.days()).toString());
    }

    @Test
    public void testGetValueThrows() throws Exception {
        try {
            UnsupportedDurationField.getInstance(DurationFieldType.seconds()).getValue(0L);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetValueAsLongThrows() throws Exception {
        try {
            UnsupportedDurationField.getInstance(DurationFieldType.seconds()).getValueAsLong(1L);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetMillisThrowsAtZero() throws Exception {
        try {
            UnsupportedDurationField.getInstance(DurationFieldType.seconds()).getMillis(0);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testAddThrowsAtZero() throws Exception {
        try {
            UnsupportedDurationField.getInstance(DurationFieldType.seconds()).add(0L, 0);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testDifferenceThrowsAtEqualInstants() throws Exception {
        try {
            UnsupportedDurationField.getInstance(DurationFieldType.seconds()).getDifference(5L, 5L);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testDifferenceAsLongThrows() throws Exception {
        try {
            UnsupportedDurationField.getInstance(DurationFieldType.seconds()).getDifferenceAsLong(1L, 0L);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testPartialEmptyAndArrays() throws Exception {
        Partial partial = new Partial();
        assertEquals(0, partial.size());
        assertEquals(0, partial.getValues().length);
        assertEquals(0, partial.getFieldTypes().length);
        assertNotNull(partial.getChronology());
        assertNull(partial.getFormatter());
        assertEquals("[]", partial.toStringList());
    }

    @Test
    public void testPartialSingleFieldAccessors() throws Exception {
        DateTimeFieldType type = DateTimeFieldType.monthOfYear();
        Partial partial = new Partial(type, 6);
        assertEquals(1, partial.size());
        assertSame(type, partial.getFieldType(0));
        assertArrayEquals(new DateTimeFieldType[] {type}, partial.getFieldTypes());
        assertArrayEquals(new int[] {6}, partial.getValues());
        assertEquals(6, partial.getValue(0));
        assertEquals("[monthOfYear=6]", partial.toStringList());
    }

    @Test
    public void testPartialWithAddsFieldAndPreservesOriginal() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 6)
                .with(DateTimeFieldType.dayOfMonth(), 12);
        assertEquals(2, partial.size());
        assertEquals(6, partial.getValue(0));
        assertEquals(12, partial.getValue(1));
        assertEquals("[monthOfYear=6, dayOfMonth=12]", partial.toStringList());
    }

    @Test
    public void testPartialWithUpdatesAndWithoutRemoves() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 6)
                .with(DateTimeFieldType.dayOfMonth(), 12);
        Partial updated = partial.withField(DateTimeFieldType.monthOfYear(), 7);
        assertEquals(6, partial.getValue(0));
        assertEquals(7, updated.getValue(0));
        Partial removed = updated.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, removed.size());
        assertSame(DateTimeFieldType.dayOfMonth(), removed.getFieldType(0));
        assertEquals(12, removed.getValue(0));
    }

    @Test
    public void testPartialWithZeroAdditionReturnsSameInstance() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        assertSame(partial, partial.withFieldAdded(DurationFieldType.days(), 0));
        assertSame(partial, partial.withFieldAddWrapped(DurationFieldType.days(), 0));
        assertSame(partial, partial.withPeriodAdded(null, 1));
        assertSame(partial, partial.plus(null));
        assertSame(partial, partial.minus(null));
    }

    @Test
    public void testPartialPropertyGetAndSetCopy() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property property = partial.property(DateTimeFieldType.monthOfYear());
        assertSame(partial, property.getPartial());
        assertEquals(6, property.get());
        Partial changed = property.setCopy(9);
        assertEquals(6, partial.getValue(0));
        assertEquals(9, changed.getValue(0));
    }

    @Test
    public void testPartialPropertyMaximumAndMinimumValues() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property property = partial.property(DateTimeFieldType.monthOfYear());
        assertEquals(12, property.withMaximumValue().getValue(0));
        assertEquals(1, property.withMinimumValue().getValue(0));
        assertEquals(6, partial.getValue(0));
    }

    @Test
    public void testPartialMatchingAnotherPartial() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.monthOfYear(), 6);
        assertTrue(partial.isMatch((org.joda.time.ReadablePartial)
                new Partial(DateTimeFieldType.monthOfYear(), 6)));
        assertFalse(partial.isMatch((org.joda.time.ReadablePartial)
                new Partial(DateTimeFieldType.monthOfYear(), 7)));
    }
}
