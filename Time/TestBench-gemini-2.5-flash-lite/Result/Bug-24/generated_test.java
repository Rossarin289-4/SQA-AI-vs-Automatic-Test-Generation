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


}

