package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;

public class DateTimeParserBucketTest {
    @Test
    public void testConstructorAndSimpleGetters() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, Integer.valueOf(2040), 1999);
        assertEquals(Locale.US, bucket.getLocale());
        assertEquals(Integer.valueOf(2040), bucket.getPivotYear());
        assertEquals(0, bucket.getOffset());
        assertEquals(DateTimeZone.getDefault(), bucket.getZone());
        assertNotNull(bucket.getChronology());
    }

    @Test
    public void testNullLocaleUsesDefaultLocale() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, null, null, 2000);
        assertEquals(Locale.getDefault(), bucket.getLocale());
        assertNull(bucket.getPivotYear());
    }

    @Test
    public void testPivotYearCanBeResetToNull() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, 2000, 2000);
        bucket.setPivotYear(null);
        assertNull(bucket.getPivotYear());
    }

    @Test
    public void testSetOffsetAndZoneResetEachOther() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        bucket.setOffset(1234);
        assertEquals(1234, bucket.getOffset());
        assertNull(bucket.getZone());
        bucket.setZone(DateTimeZone.UTC);
        assertEquals(0, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testNonUtcZoneCanBeSet() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        bucket.setZone(zone);
        assertSame(zone, bucket.getZone());
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testOffsetAdjustsComputedMillis() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                10000L, null, Locale.US, null, 2000);
        bucket.setOffset(2500);
        assertEquals(7500L, bucket.computeMillis());
    }

    @Test
    public void testOffsetAtIntegerMaximum() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        bucket.setOffset(Integer.MAX_VALUE);
        assertEquals(-(long) Integer.MAX_VALUE, bucket.computeMillis());
    }

    @Test
    public void testOffsetAtIntegerMinimum() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        bucket.setOffset(Integer.MIN_VALUE);
        assertEquals(-(long) Integer.MIN_VALUE, bucket.computeMillis());
    }

    @Test
    public void testRestoreStateUndoesOffsetChange() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        bucket.setOffset(12);
        Object state = bucket.saveState();
        bucket.setOffset(30);
        assertTrue(bucket.restoreState(state));
        assertEquals(12, bucket.getOffset());
        assertEquals(-12L, bucket.computeMillis());
    }

    @Test
    public void testRestoreStateCanBeReused() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        Object state = bucket.saveState();
        bucket.setOffset(7);
        assertTrue(bucket.restoreState(state));
        assertEquals(0, bucket.getOffset());
        bucket.setOffset(9);
        assertTrue(bucket.restoreState(state));
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testNullIsNotAValidSavedState() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        assertFalse(bucket.restoreState(null));
    }

    @Test
    public void testSavedYearFieldSetsMillis() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2001);
        long actual = bucket.computeMillis();
        assertEquals(2001, bucket.getChronology().year().get(actual));
    }

    @Test
    public void testSavedMonthUsesDefaultYear() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2001);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 2);
        long actual = bucket.computeMillis();
        assertEquals(2001, bucket.getChronology().year().get(actual));
        assertEquals(2, bucket.getChronology().monthOfYear().get(actual));
    }

    @Test
    public void testRepeatedComputeMillisIsIdempotent() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2001);
        assertEquals(bucket.computeMillis(), bucket.computeMillis());
    }

    @Test
    public void testSavedStateRestoresSavedFields() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, null, Locale.US, null, 2000);
        bucket.saveField(DateTimeFieldType.year(), 2001);
        Object state = bucket.saveState();
        bucket.saveField(DateTimeFieldType.monthOfYear(), 2);
        assertTrue(bucket.restoreState(state));
        long actual = bucket.computeMillis();
        assertEquals(2001, bucket.getChronology().year().get(actual));
        assertEquals(1, bucket.getChronology().monthOfYear().get(actual));
    }

    @Test
    public void testComputeMillisWithNoSavedFieldsReturnsInitialMillis() throws Exception {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                123456L, null, Locale.US, null, 2000);
        assertEquals(123456L, bucket.computeMillis());
    }
}
