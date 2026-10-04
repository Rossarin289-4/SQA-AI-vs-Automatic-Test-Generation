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
import org.joda.time.chrono.ISOChronology;

public class DateTimeParserBucketTest {

    // Helper method to create a Chronology with a specific zone
    private Chronology getChronologyWithZone(DateTimeZone zone) {
        return ISOChronology.getInstance(zone);
    }

    @Test
    public void testConstructorBasic() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);
        assertEquals(chrono.withUTC(), bucket.getChronology());
        assertEquals(locale, bucket.getLocale());
        assertNull(bucket.getPivotYear());
        assertEquals(0, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testConstructorWithPivotYear() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        Integer pivotYear = 2050;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, pivotYear, 2000);
        assertEquals(chrono.withUTC(), bucket.getChronology());
        assertEquals(locale, bucket.getLocale());
        assertEquals(pivotYear, bucket.getPivotYear());
        assertEquals(0, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testGettersSettersZone() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        bucket.setZone(zone);
        assertEquals(zone, bucket.getZone());
        assertEquals(0, bucket.getOffset());

        bucket.setZone(null); // Should revert to UTC
        assertNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());
    }

    @Test
    public void testGettersSettersOffset() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        int offset = 3600000; // 1 hour in milliseconds
        bucket.setOffset(offset);
        assertEquals(offset, bucket.getOffset());
        assertNull(bucket.getZone());

        bucket.setOffset(0);
        assertEquals(0, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testGettersSettersPivotYear() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        assertNull(bucket.getPivotYear());

        Integer pivotYear = 2030;
        bucket.setPivotYear(pivotYear);
        assertEquals(pivotYear, bucket.getPivotYear());

        bucket.setPivotYear(null);
        assertNull(bucket.getPivotYear());
    }

    @Test
    public void testSaveField_DateTimeField_int() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L; // Start at epoch
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        DateTimeField yearField = DateTimeFieldType.year().getField(chrono);
        bucket.saveField(yearField, 2023);

        DateTimeField monthField = DateTimeFieldType.monthOfYear().getField(chrono);
        bucket.saveField(monthField, 10);

        // This test is checking side effects of saveField.
        // The actual assertion on the number of saved fields is not possible without reflection
        // or a public getter for iSavedFieldsCount, which is not provided.
        // We'll rely on computeMillis for testing the functional correctness.
    }

    @Test
    public void testSaveField_DateTimeFieldType_int() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.dayOfMonth(), 25);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 11);
        
        // Similar to testSaveField_DateTimeField_int, checking internal state directly is not feasible.
    }

    @Test
    public void testSaveField_DateTimeFieldType_String_Locale() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.dayOfWeek(), "Monday", Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.monthOfYear(), "Jan", Locale.ENGLISH);
        
        // Similar to testSaveField_DateTimeField_int, checking internal state directly is not feasible.
    }

    @Test
    public void testSaveStateAndRestoreState() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.setZone(DateTimeZone.forOffsetHours(2));
        bucket.saveField(DateTimeFieldType.hourOfDay(), 10);

        Object savedState = bucket.saveState();
        assertNotNull(savedState);

        bucket.setZone(DateTimeZone.forOffsetHours(3));
        bucket.saveField(DateTimeFieldType.hourOfDay(), 12); // Overwrite

        assertTrue(bucket.restoreState(savedState));

        assertEquals(DateTimeZone.forOffsetHours(2), bucket.getZone());
        // Cannot directly assert the number of saved fields without reflection or public access.
        // The functional correctness is tested via computeMillis.
    }

    @Test
    public void testRestoreState_invalid() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);
        assertFalse(bucket.restoreState(new Object())); // Invalid state object
        assertFalse(bucket.restoreState(null)); // Null state object
    }

    @Test
    public void testComputeMillis_noFieldsSaved() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 123456789L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);
        assertEquals(millis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_withZone() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L; // Epoch
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        DateTimeZone zone = DateTimeZone.forOffsetHours(1); // UTC+1
        bucket.setZone(zone);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 10); // 10 AM local time

        // Expected: 10 AM UTC+1 = 9 AM UTC
        Chronology utcChrono = ISOChronology.getInstanceUTC();
        long expectedMillis = utcChrono.setDateTime(1970, 1, 1, 9, 0, 0, 0);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_withOffset() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L; // Epoch
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        int offset = 3600000; // UTC+1
        bucket.setOffset(offset);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 10); // 10 AM local time

        // Expected: 10 AM local time - 1 hour offset = 9 AM UTC
        Chronology utcChrono = ISOChronology.getInstanceUTC();
        long expectedMillis = utcChrono.setDateTime(1970, 1, 1, 9, 0, 0, 0);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_setYearBeforeMonthDay() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.year(), 2024);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);

        // Expected: 2024-03-15
        long expectedMillis = chrono.setDateTime(2024, 3, 15, 0, 0, 0, 0);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_setMonthDayBeforeYear() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        // Default year is 2000, but we expect it to be overridden by the logic
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.year(), 2024); // This should be set correctly due to sorting

        // Expected: 2024-03-15
        long expectedMillis = chrono.setDateTime(2024, 3, 15, 0, 0, 0, 0);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_monthDayWithoutYearDefaultsToDefaultYear() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        int defaultYear = 2025;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, defaultYear);

        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);

        // Expected: 2025-03-15 (using default year)
        long expectedMillis = chrono.setDateTime(defaultYear, 3, 15, 0, 0, 0, 0);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_dayOfYear_ordering() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.year(), 2024);
        bucket.saveField(DateTimeFieldType.dayOfYear(), 75); // March 15th in a leap year

        // Expected: 2024-03-15
        long expectedMillis = chrono.setDateTime(2024, 3, 15, 0, 0, 0, 0);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_withTextValue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.monthOfYear(), "May", Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.year(), 2021);

        // Expected: 2021-05-01
        long expectedMillis = chrono.setDateTime(2021, 5, 1, 0, 0, 0, 0);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testComputeMillis_invalidHour() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.hourOfDay(), 25); // Invalid hour

        try {
            bucket.computeMillis();
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            // Expected exception
        }
    }

    @Test
    public void testComputeMillis_invalidMonth() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.year(), 2023);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13); // Invalid month

        try {
            bucket.computeMillis();
            fail("Expected IllegalFieldValueException");
        } catch (IllegalFieldValueException e) {
            // Expected exception
        }
    }

    @Test
    public void testComputeMillis_zoneTransitionIllegalInstant() {
        Chronology chrono = ISOChronology.getInstance(); // Use a chrono that has zones
        Locale locale = Locale.US;
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        Chronology zoneChrono = getChronologyWithZone(zone);

        // A local instant that falls into the DST gap (e.g., Spring forward)
        // March 10, 2024, 2:30 AM EST (UTC-5) becomes March 10, 2024, 3:30 AM EDT (UTC-4)
        // So 2:30 AM on this day does not exist in local time.
        long instantLocal = zoneChrono.setDateTime(2024, 3, 10, 2, 30, 0, 0);
        
        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, zoneChrono, locale, null, 2000);
        bucket.setZone(zone); // Use the DST zone
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);

        try {
            bucket.computeMillis(false, "Test String");
            fail("Expected IllegalArgumentException for illegal instant due to time zone offset transition");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Illegal instant due to time zone offset transition"));
            assertTrue(e.getMessage().contains("Cannot parse \"Test String\""));
        }
    }

    @Test
    public void testCompareReverse_nullFields() {
        assertEquals(0, DateTimeParserBucket.compareReverse(null, null));
        DurationField daysField = DurationFieldType.days().getField(null); // Provide a context for getDurationField()
        assertEquals(-1, DateTimeParserBucket.compareReverse(null, daysField));
        assertEquals(1, DateTimeParserBucket.compareReverse(daysField, null));
    }

    @Test
    public void testCompareReverse_supportedFields() {
        DurationField hours = DurationFieldType.hours().getField(null);
        DurationField minutes = DurationFieldType.minutes().getField(null);
        DurationField seconds = DurationFieldType.seconds().getField(null);

        // Longer duration comes first (reversed order)
        assertEquals(-1, DateTimeParserBucket.compareReverse(hours, minutes));
        assertEquals(1, DateTimeParserBucket.compareReverse(minutes, hours));
        assertEquals(0, DateTimeParserBucket.compareReverse(hours, hours));
        assertEquals(-1, DateTimeParserBucket.compareReverse(minutes, seconds));
    }

    @Test
    public void testSort_smallArray() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        // SavedField is an inner class of DateTimeParserBucket, but it's static.
        // We can instantiate it directly.
        DateTimeParserBucket.SavedField[] fields = new DateTimeParserBucket.SavedField[3];
        fields[0] = new DateTimeParserBucket.SavedField(DateTimeFieldType.monthOfYear().getField(chrono), 1);
        fields[1] = new DateTimeParserBucket.SavedField(DateTimeFieldType.dayOfMonth().getField(chrono), 1);
        fields[2] = new DateTimeParserBucket.SavedField(DateTimeFieldType.year().getField(chrono), 2023);

        DateTimeParserBucket.sort(fields, 3);

        assertEquals(DateTimeFieldType.year().getField(chrono), fields[0].iField);
        assertEquals(DateTimeFieldType.monthOfYear().getField(chrono), fields[1].iField);
        assertEquals(DateTimeFieldType.dayOfMonth().getField(chrono), fields[2].iField);
    }

    @Test
    public void testSort_largeArray() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket.SavedField[] fields = new DateTimeParserBucket.SavedField[12];
        fields[0] = new DateTimeParserBucket.SavedField(DateTimeFieldType.year().getField(chrono), 2023);
        fields[1] = new DateTimeParserBucket.SavedField(DateTimeFieldType.monthOfYear().getField(chrono), 1);
        fields[2] = new DateTimeParserBucket.SavedField(DateTimeFieldType.dayOfMonth().getField(chrono), 1);
        fields[3] = new DateTimeParserBucket.SavedField(DateTimeFieldType.hourOfDay().getField(chrono), 10);
        fields[4] = new DateTimeParserBucket.SavedField(DateTimeFieldType.minuteOfHour().getField(chrono), 30);
        fields[5] = new DateTimeParserBucket.SavedField(DateTimeFieldType.secondOfMinute().getField(chrono), 0);
        fields[6] = new DateTimeParserBucket.SavedField(DateTimeFieldType.millisOfSecond().getField(chrono), 0);
        fields[7] = new DateTimeParserBucket.SavedField(DateTimeFieldType.dayOfWeek().getField(chrono), 2);
        fields[8] = new DateTimeParserBucket.SavedField(DateTimeFieldType.dayOfYear().getField(chrono), 15);
        fields[9] = new DateTimeParserBucket.SavedField(DateTimeFieldType.weekOfWeekyear().getField(chrono), 3);
        fields[10] = new DateTimeParserBucket.SavedField(DateTimeFieldType.yearOfEra().getField(chrono), 2023);
        fields[11] = new DateTimeParserBucket.SavedField(DateTimeFieldType.yearOfCentury().getField(chrono), 23);

        DateTimeParserBucket.sort(fields, 12);

        // Check if the largest fields (year-related) come first
        assertTrue(fields[0].iField.getType() == DateTimeFieldType.year() ||
                   fields[0].iField.getType() == DateTimeFieldType.yearOfEra() ||
                   fields[0].iField.getType() == DateTimeFieldType.yearOfCentury());
        // Check if smallest fields (millis) come last
        assertEquals(DateTimeFieldType.millisOfSecond().getField(chrono), fields[11].iField);
    }

    @Test
    public void testSavedField_set_resetTrue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        long millis = 0L;
        DateTimeField dayOfMonth = DateTimeFieldType.dayOfMonth().getField(chrono);
        DateTimeParserBucket.SavedField field = new DateTimeParserBucket.SavedField(dayOfMonth, 15);
        
        millis = field.set(millis, true);
        assertEquals(15, dayOfMonth.get(millis));
    }
    
    @Test
    public void testSavedField_set_resetFalse() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        long millis = 0L; // Epoch
        DateTimeField hourOfDay = DateTimeFieldType.hourOfDay().getField(chrono);
        DateTimeParserBucket.SavedField field = new DateTimeParserBucket.SavedField(hourOfDay, 10);

        millis = field.set(millis, false);
        assertEquals(10, hourOfDay.get(millis));
    }

    @Test
    public void testSavedField_set_textValue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        long millis = 0L;
        DateTimeParserBucket.SavedField field = new DateTimeParserBucket.SavedField(DateTimeFieldType.monthOfYear().getField(chrono), "March", Locale.ENGLISH);

        millis = field.set(millis, false);
        assertEquals(3, chrono.monthOfYear().get(millis)); // Month should be March (3)
    }

    @Test
    public void testComputeMillis_resetFieldsTrue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = DateTimeUtils.parseDateTime("2023-01-01T12:00:00Z").getMillis();
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.hourOfDay(), 14); // Set hour to 2 PM
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30); // Set minute to 30

        long expectedMillis = DateTimeUtils.parseDateTime("2023-01-01T14:30:00Z").getMillis();
        assertEquals(expectedMillis, bucket.computeMillis(true));
    }

    @Test
    public void testComputeMillis_resetFieldsFalse() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = DateTimeUtils.parseDateTime("2023-01-15T12:00:00Z").getMillis(); // Base millis
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.hourOfDay(), 14); // Set hour to 2 PM
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30); // Set minute to 30

        long expectedMillis = DateTimeUtils.parseDateTime("2023-01-15T14:30:00Z").getMillis();
        assertEquals(expectedMillis, bucket.computeMillis(false));
    }
}
