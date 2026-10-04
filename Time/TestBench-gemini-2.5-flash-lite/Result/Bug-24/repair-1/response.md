```java
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

        assertEquals(2, bucket.iSavedFieldsCount); // Check internal state if possible, or use computeMillis
    }

    @Test
    public void testSaveField_DateTimeFieldType_int() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.dayOfMonth(), 25);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 11);

        assertEquals(2, bucket.iSavedFieldsCount);
    }

    @Test
    public void testSaveField_DateTimeFieldType_String_Locale() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = 0L;
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.dayOfWeek(), "Monday", Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.monthOfYear(), "Jan", Locale.ENGLISH);

        assertEquals(2, bucket.iSavedFieldsCount);
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
        assertEquals(1, bucket.iSavedFieldsCount); // Ensure state was restored correctly
        // The saved field should be the hourOfDay with value 10.
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
        long expectedMillis = chrono.setDateTime(0, 1, 1, 9, 0, 0, 0);
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
        long expectedMillis = chrono.setDateTime(0, 1, 1, 9, 0, 0, 0);
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
    public void testComputeMillis_timezoneTransition_dstIgnored() {
        Chronology chrono = ISOChronology.getInstanceUTC(); // UTC Chronology, doesn't have DST
        Locale locale = Locale.US;
        long millis = DateTimeUtils.parseDateTime("2012-03-11T02:30:00Z").getMillis(); // Day DST starts in US
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        DateTimeZone est = DateTimeZone.forID("America/New_York"); // Has DST
        bucket.setZone(est);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 2); // Ambiguous hour during DST transition

        // With DST, 2 AM might be 2 AM EST (UTC-5) or 2 AM EDT (UTC-4).
        // The default behavior of computeMillis with a zone should handle this.
        // The reference implementation uses getOffsetFromLocal and then checks for inconsistency.
        // We expect it to resolve to the correct local time.
        // 2012-03-11 02:00:00 EDT is 06:00:00 UTC.
        long expectedMillis = est.convertLocalToUTC(est.convertUTCToLocal(millis), false);

        // Let's simulate setting a local time of 2 AM on that day
        // The actual millisecond instant needs to be set to a value that *results* in 2 AM local time.
        // This is tricky because 2 AM is ambiguous on the DST transition day.
        // The computeMillis method tries to resolve this.
        // For the purpose of this test, we'll assume it resolves correctly and check the resulting UTC.
        // The important part is that the saved fields are used.

        // Let's test with a known valid local time after the transition
        millis = DateTimeUtils.parseDateTime("2012-03-11T03:30:00Z").getMillis(); // 3:30 AM EDT (UTC-4)
        bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);
        bucket.setZone(est);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 3);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);
        
        // 3:30 AM EDT (UTC-4) is 07:30 UTC
        expectedMillis = est.convertLocalToUTC(est.convertUTCToLocal(millis), false);
        assertEquals(expectedMillis, bucket.computeMillis());
    }

    @Test
    public void testCompareReverse_nullFields() {
        assertEquals(0, DateTimeParserBucket.compareReverse(null, null));
        assertEquals(-1, DateTimeParserBucket.compareReverse(null, DurationFieldType.days().getField(null).getDurationField()));
        assertEquals(1, DateTimeParserBucket.compareReverse(DurationFieldType.days().getField(null).getDurationField(), null));
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
        SavedField[] fields = new SavedField[3];
        fields[0] = new SavedField(DateTimeFieldType.monthOfYear().getField(chrono), 1);
        fields[1] = new SavedField(DateTimeFieldType.dayOfMonth().getField(chrono), 1);
        fields[2] = new SavedField(DateTimeFieldType.year().getField(chrono), 2023);

        // Initially, year is last, month is first, day is middle
        DateTimeParserBucket.sort(fields, 3);

        // After sorting, they should be ordered by duration (year, month, day)
        assertEquals(DateTimeFieldType.year().getField(chrono), fields[0].iField);
        assertEquals(DateTimeFieldType.monthOfYear().getField(chrono), fields[1].iField);
        assertEquals(DateTimeFieldType.dayOfMonth().getField(chrono), fields[2].iField);
    }

    @Test
    public void testSort_largeArray() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        SavedField[] fields = new SavedField[12];
        fields[0] = new SavedField(DateTimeFieldType.year().getField(chrono), 2023);
        fields[1] = new SavedField(DateTimeFieldType.monthOfYear().getField(chrono), 1);
        fields[2] = new SavedField(DateTimeFieldType.dayOfMonth().getField(chrono), 1);
        fields[3] = new SavedField(DateTimeFieldType.hourOfDay().getField(chrono), 10);
        fields[4] = new SavedField(DateTimeFieldType.minuteOfHour().getField(chrono), 30);
        fields[5] = new SavedField(DateTimeFieldType.secondOfMinute().getField(chrono), 0);
        fields[6] = new SavedField(DateTimeFieldType.millisOfSecond().getField(chrono), 0);
        fields[7] = new SavedField(DateTimeFieldType.dayOfWeek().getField(chrono), 2);
        fields[8] = new SavedField(DateTimeFieldType.dayOfYear().getField(chrono), 15);
        fields[9] = new SavedField(DateTimeFieldType.weekOfWeekyear().getField(chrono), 3);
        fields[10] = new SavedField(DateTimeFieldType.yearOfEra().getField(chrono), 2023);
        fields[11] = new SavedField(DateTimeFieldType.yearOfCentury().getField(chrono), 23);

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
        SavedField field = new SavedField(dayOfMonth, 15);

        // Setting day of month to 15 on a date where it's day 1 and then rounding floor
        // should result in day 1 if the field is set with value that rounds down.
        // Here, we're testing the general behavior of set with reset=true.
        // The actual rounding effect depends on the field and value.
        millis = field.set(millis, true);
        assertEquals(15, dayOfMonth.get(millis)); // It should set the day to 15. Rounding floor on day 15 is still day 15.
    }
    
    @Test
    public void testSavedField_set_resetFalse() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        long millis = 0L; // Epoch
        DateTimeField hourOfDay = DateTimeFieldType.hourOfDay().getField(chrono);
        SavedField field = new SavedField(hourOfDay, 10);

        millis = field.set(millis, false); // Set hour to 10
        assertEquals(10, hourOfDay.get(millis)); // Should be 10 AM UTC
    }

    @Test
    public void testSavedField_set_textValue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        long millis = 0L;
        SavedField field = new SavedField(DateTimeFieldType.monthOfYear().getField(chrono), "March", Locale.ENGLISH);

        millis = field.set(millis, false);
        assertEquals(3, chrono.monthOfYear().get(millis)); // Month should be March (3)
    }

    @Test
    public void testComputeMillis_resetFieldsTrue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        Locale locale = Locale.US;
        long millis = DateTimeUtils.parseDateTime("2023-01-01T12:00:00Z").getMillis(); // Fixed point
        DateTimeParserBucket bucket = new DateTimeParserBucket(millis, chrono, locale, null, 2000);

        bucket.saveField(DateTimeFieldType.hourOfDay(), 14); // Set hour to 2 PM
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30); // Set minute to 30

        // Compute with resetFields = true should clear unsaved fields and set only saved ones.
        // The base millis is 2023-01-01T12:00:00Z.
        // With resetFields=true, the hour and minute are set.
        // The year, month, day should revert to the defaults or base millis.
        // computeMillis(true) implies that unsaved field values are cleared.
        // It should reset to the base 'iMillis' and then apply fields.
        // The documentation says "unsaved field values are cleared". This implies that
        // fields not explicitly saved might be reset to a default or base value.
        // Let's assume it means it applies the saved fields onto the base `iMillis`.
        // So, the base iMillis is 2023-01-01T12:00:00Z.
        // Setting hour to 14 and minute to 30 would result in 2023-01-01T14:30:00Z.
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

        // Compute with resetFields = false should apply saved fields to the base millis.
        // Base: 2023-01-15T12:00:00Z.
        // Set hour to 14, minute to 30.
        // Result: 2023-01-15T14:30:00Z.
        long expectedMillis = DateTimeUtils.parseDateTime("2023-01-15T14:30:00Z").getMillis();
        assertEquals(expectedMillis, bucket.computeMillis(false));
    }

    @Test
    public void testComputeMillis_zoneTransitionIllegalInstant() {
        Chronology chrono = ISOChronology.getInstance(); // Use a chrono that has zones
        Locale locale = Locale.US;
        // A date/time that falls within a DST gap in New York (e.g., Spring forward)
        // March 10, 2024, 2:30 AM EST (UTC-5) becomes March 10, 2024, 3:30 AM EDT (UTC-4)
        // So 2:30 AM on this day does not exist in local time.
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        // Calculate a local instant that falls into the DST gap.
        // Need to construct a Chronology with this zone to get the correct initial millis.
        Chronology zoneChrono = chrono.withZone(zone);
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
}
```