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
    public void testCachedInstanceAndType() throws Exception {
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField first = UnsupportedDurationField.getInstance(type);
        UnsupportedDurationField second = UnsupportedDurationField.getInstance(type);
        assertSame(first, second);
        assertSame(type, first.getType());
    }

    @Test
    public void testNameAndSupportFlags() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals("days", field.getName());
        assertFalse(field.isSupported());
        assertTrue(field.isPrecise());
    }

    @Test
    public void testUnitMillisIsZero() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testComparisonWithUnsupportedField() throws Exception {
        UnsupportedDurationField first =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField second =
                UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertEquals(0, first.compareTo(second));
    }

    @Test
    public void testEqualityUsesFieldName() throws Exception {
        UnsupportedDurationField first =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField second =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(first.equals(second));
        assertFalse(first.equals(null));
    }

    @Test
    public void testHashCodeMatchesName() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals("days".hashCode(), field.hashCode());
    }

    @Test
    public void testStringRepresentation() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals("UnsupportedDurationField[days]", field.toString());
    }

    @Test
    public void testGetValueThrows() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getValue(0L);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetValueAsLongThrows() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getValueAsLong(Long.MIN_VALUE);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGetMillisThrows() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getMillis(Integer.MAX_VALUE);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testAddThrows() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.add(Long.MAX_VALUE, 1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testDifferenceThrows() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getDifference(Long.MAX_VALUE, Long.MIN_VALUE);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testDifferenceAsLongThrows() throws Exception {
        UnsupportedDurationField field =
                UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getDifferenceAsLong(Long.MAX_VALUE, Long.MIN_VALUE);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testEmptyPartialState() throws Exception {
        Partial partial = new Partial();
        assertEquals(0, partial.size());
        assertEquals(0, partial.getValues().length);
        assertEquals(0, partial.getFieldTypes().length);
        assertNotNull(partial.getChronology());
        assertNull(partial.getFormatter());
        assertEquals("[]", partial.toStringList());
    }

    @Test
    public void testPartialFieldAndValueCopies() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        assertEquals(1, partial.size());
        assertSame(DateTimeFieldType.dayOfMonth(), partial.getFieldType(0));
        assertEquals(12, partial.getValue(0));
        DateTimeFieldType[] types = partial.getFieldTypes();
        int[] values = partial.getValues();
        types[0] = DateTimeFieldType.monthOfYear();
        values[0] = 1;
        assertSame(DateTimeFieldType.dayOfMonth(), partial.getFieldType(0));
        assertEquals(12, partial.getValue(0));
        assertEquals("[dayOfMonth=12]", partial.toStringList());
    }

    @Test
    public void testWithAddsAndOrdersField() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        Partial updated = partial.with(DateTimeFieldType.monthOfYear(), 3);
        assertEquals(2, updated.size());
        assertSame(DateTimeFieldType.monthOfYear(), updated.getFieldType(0));
        assertEquals(3, updated.getValue(0));
        assertSame(DateTimeFieldType.dayOfMonth(), updated.getFieldType(1));
        assertEquals(12, updated.getValue(1));
        assertEquals(1, partial.size());
    }

    @Test
    public void testWithoutRemovesExistingAndLeavesAbsentAlone() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        Partial empty = partial.without(DateTimeFieldType.dayOfMonth());
        assertEquals(0, empty.size());
        assertSame(partial, partial.without(DateTimeFieldType.monthOfYear()));
    }

    @Test
    public void testWithFieldChangesSupportedField() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        Partial updated = partial.withField(DateTimeFieldType.dayOfMonth(), 13);
        assertEquals(13, updated.getValue(0));
        assertEquals(12, partial.getValue(0));
    }

    @Test
    public void testWithFieldAddedZeroReturnsSamePartial() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        assertSame(partial, partial.withFieldAdded(DurationFieldType.days(), 0));
    }

    @Test
    public void testWithFieldAddWrappedZeroReturnsSamePartial() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        assertSame(partial, partial.withFieldAddWrapped(DurationFieldType.days(), 0));
    }

    @Test
    public void testPropertyCopiesAndValue() throws Exception {
        Partial partial = new Partial(DateTimeFieldType.dayOfMonth(), 12);
        Partial.Property property = partial.property(DateTimeFieldType.dayOfMonth());
        assertSame(partial, property.getPartial());
        assertEquals(12, property.get());
        assertEquals(13, property.setCopy(13).getValue(0));
        assertEquals(12, partial.getValue(0));
        assertEquals(31, property.withMaximumValue().getValue(0));
        assertEquals(1, property.withMinimumValue().getValue(0));
        assertEquals(13, property.addToCopy(1).getValue(0));
        assertEquals(13, property.addWrapFieldToCopy(1).getValue(0));
    }
}
