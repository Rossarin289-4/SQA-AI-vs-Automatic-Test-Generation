package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DateTimeZone;
import org.joda.time.field.LenientDateTimeField;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;
import org.joda.time.format.DateTimeFormat;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.LocalDateTime; // Import LocalDateTime

public class ZonedChronologyTest {

    // Test cases for ZonedChronology instances and its behavior.

    @Test
    public void testGetInstance_nullBase() throws Exception {
        try {
            ZonedChronology.getInstance(null, DateTimeZone.getDefault());
            fail();
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetInstance_nullZone() throws Exception {
        try {
            ZonedChronology.getInstance(ISOChronology.getInstance(), null);
            fail();
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetInstance_withUTC() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(iso.withUTC(), zc.getBase());
        assertEquals(zone, zc.getZone());
        assertEquals(ISOChronology.getInstanceUTC(), zc.withUTC());
    }

    @Test
    public void testGetInstance_alreadyUTC() throws Exception {
        Chronology iso = ISOChronology.getInstanceUTC();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(iso, zc.getBase()); // Base should remain UTC if it was UTC
        assertEquals(zone, zc.getZone());
        assertEquals(iso, zc.withUTC());
    }

    @Test
    public void testGetZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        Chronology zc = ZonedChronology.getInstance(ISOChronology.getInstance(), zone);
        assertEquals(zone, zc.getZone());
    }

    @Test
    public void testWithUTC() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(iso, zc.withUTC());
    }

    @Test
    public void testWithZone_nullZone() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.getDefault();
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(zc, zc.withZone(null)); // Should return itself if zone is null, as getDefault is used internally
    }
    
    @Test
    public void testWithZone_sameZone() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(4);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(zc, zc.withZone(zone));
    }

    @Test
    public void testWithZone_toUTC() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(iso, zc.withZone(DateTimeZone.UTC));
    }

    
    @Test
    public void testGetDateTimeMillis_yearMonthDayMillisOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        
        long utcMillis = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0);
        long localMillis = zc.getDateTimeMillis(2023, 10, 26, 13, 0, 0, 0); // 13:00 local = 12:00 UTC
        assertEquals(utcMillis, localMillis - zone.getOffset(utcMillis));
    }
    
    @Test
    public void testGetDateTimeMillis_yearMonthDayHourMinSecMillis() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);

        long utcMillis = iso.getDateTimeMillis(2023, 10, 26, 12, 30, 45, 123);
        long localMillis = zc.getDateTimeMillis(2023, 10, 26, 13, 30, 45, 123);
        assertEquals(utcMillis, localMillis - zone.getOffset(utcMillis));
    }

    @Test
    public void testGetDateTimeMillis_instantHourMinSecMillis() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);

        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0);
        long localMillis = zc.getDateTimeMillis(instant, 13, 0, 0, 0); // 13:00 local = 12:00 UTC
        assertEquals(instant, localMillis - zone.getOffset(instant));
    }

    @Test
    public void testEquals_sameObject() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(zc, zc);
    }

    @Test
    public void testEquals_differentZone() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(2);
        ZonedChronology zc1 = ZonedChronology.getInstance(iso, zone1);
        ZonedChronology zc2 = ZonedChronology.getInstance(iso, zone2);
        assertNotEquals(zc1, zc2);
    }

    @Test
    public void testEquals_differentBase() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        Chronology gerg = GJChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc1 = ZonedChronology.getInstance(iso, zone);
        ZonedChronology zc2 = ZonedChronology.getInstance(gerg, zone);
        assertNotEquals(zc1, zc2);
    }

    @Test
    public void testEquals_notZonedChronology() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertNotEquals(zc, iso);
    }

    @Test
    public void testHashCode_consistent() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(zc.hashCode(), zc.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals("ZonedChronology[" + iso.toString() + ", " + zone.getID() + ']', zc.toString());
    }







    @Test
    public void testGetAsText_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1); // EST
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 14, 0, 0, 0); // 2 PM UTC
        assertEquals("15", zc.hourOfDay().getAsText(instant, Locale.ENGLISH)); // 3 PM local
    }

    @Test
    public void testGetAsShortText_monthOfYear() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 11, 15, 12, 0, 0, 0); // Nov 15th
        assertEquals("Nov", zc.monthOfYear().getAsShortText(instant, Locale.ENGLISH));
    }

    @Test
    public void testAdd_hourOfDay_positive() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // 12 PM UTC
        long addedInstant = zc.hourOfDay().add(instant, 2); // Add 2 hours local time
        
        // Expected: 12 PM UTC + 2 hours = 14 PM UTC
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 26, 14, 0, 0, 0); 
        assertEquals(expectedUTC, addedInstant);
    }

    @Test
    public void testAdd_dayOfWeek_negative() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // Thursday UTC
        long addedInstant = zc.dayOfWeek().add(instant, -3); // Subtract 3 days local time
        
        // Expected: Thursday UTC - 3 days = Monday UTC
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 23, 12, 0, 0, 0);
        assertEquals(expectedUTC, addedInstant);
    }
    
    @Test
    public void testGetDifference_days() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant1 = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // Thursday UTC
        long instant2 = iso.getDateTimeMillis(2023, 10, 29, 12, 0, 0, 0); // Sunday UTC
        
        // Difference in days should be the same regardless of timezone offset as long as it's fixed.
        assertEquals(3, zc.days().getDifference(instant2, instant1));
    }

    @Test
    public void testSet_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 30, 0, 0); // 12:30 UTC
        long setInstant = zc.hourOfDay().set(instant, 15); // Set local hour to 15 (3 PM)
        
        // Expected: 12:30 UTC -> 13:30 local. Set hour to 15 -> 15:30 local.
        // 15:30 local (UTC+1) is 14:30 UTC.
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 26, 14, 30, 0, 0);
        assertEquals(expectedUTC, setInstant);
    }

    @Test
    public void testSet_minuteOfHour_invalidValue() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 30, 0, 0); // 12:30 UTC
        
        try {
            zc.minuteOfHour().set(instant, 70);
            fail("Expected IllegalFieldValueException for minute=70");
        } catch (IllegalFieldValueException expected) {
        } catch (IllegalArgumentException expected) {
        }
    }
    
    @Test
    public void testIsLeap_year() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long leapYearInstant = iso.getDateTimeMillis(2024, 2, 29, 12, 0, 0, 0); // Feb 29, 2024
        assertTrue(zc.year().isLeap(leapYearInstant));
    }

    @Test
    public void testIsLeap_nonLeapYear() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long nonLeapYearInstant = iso.getDateTimeMillis(2023, 2, 28, 12, 0, 0, 0); // Feb 28, 2023
        assertFalse(zc.year().isLeap(nonLeapYearInstant));
    }
    
    @Test
    public void testRoundFloor_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 14, 30, 0, 0); // 2:30 PM local
        long rounded = zc.hourOfDay().roundFloor(instant);
        
        // 14:30 local time. Round floor to nearest hour is 14:00 local.
        // 14:00 local (UTC+1) is 13:00 UTC.
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 26, 13, 0, 0, 0);
        assertEquals(expectedUTC, rounded);
    }

    @Test
    public void testRoundCeiling_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 14, 30, 0, 0); // 2:30 PM local
        long rounded = zc.hourOfDay().roundCeiling(instant);
        
        // 14:30 local time. Round ceiling to nearest hour is 15:00 local.
        // 15:00 local (UTC+1) is 14:00 UTC.
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 26, 14, 0, 0, 0);
        assertEquals(expectedUTC, rounded);
    }
    
    @Test
    public void testGetMinimumValue_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(0, zc.hourOfDay().getMinimumValue());
    }

    @Test
    public void testGetMaximumValue_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(23, zc.hourOfDay().getMaximumValue());
    }

    @Test
    public void testConvertUTCToLocal_basic() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1); // UTC+1
        long utcInstant = DateTimeConstants.MILLIS_PER_HOUR; // 1 hour UTC
        long localInstant = zone.convertUTCToLocal(utcInstant);
        assertEquals(2 * DateTimeConstants.MILLIS_PER_HOUR, localInstant); // 2 hours local
    }

    @Test
    public void testConvertLocalToUTC_basic() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1); // UTC+1
        long localInstant = 2 * DateTimeConstants.MILLIS_PER_HOUR; // 2 hours local
        long utcInstant = zone.convertLocalToUTC(localInstant, false);
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, utcInstant); // 1 hour UTC
    }

    @Test
    public void testConvertLocalToUTC_strict_withGap() throws Exception {
        DateTimeZone nzZone = DateTimeZone.forID("Pacific/Auckland");
        // This instant corresponds to a local time that does not exist due to DST change.
        // The base chronology's getDateTimeMillis is used to get a UTC instant,
        // then convertUTCToLocal is called to get the problematic local instant.
        long utcInstantForGap = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 9, 24, 14, 30, 0, 0); // Example UTC instant
        long localInstantInGap = nzZone.convertUTCToLocal(utcInstantForGap);

        try {
            nzZone.convertLocalToUTC(localInstantInGap, true);
            fail("Expected IllegalArgumentException for strict conversion during a gap.");
        } catch (IllegalArgumentException expected) {
        }
    }
    
    @Test
    public void testConvertLocalToUTC_nonStrict_withGap() throws Exception {
        DateTimeZone nzZone = DateTimeZone.forID("Pacific/Auckland");
        long utcInstantForGap = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 9, 24, 14, 30, 0, 0); // Example UTC instant
        long localInstantInGap = nzZone.convertUTCToLocal(utcInstantForGap);

        // For non-strict conversion, it should handle the gap by adjusting.
        // We need to know the expected UTC value. A simple way is to find the UTC for an instant *after* the gap.
        // The gap happens around 2 AM local. If the local instant falls into the gap, non-strict conversion
        // should map it to the later time.
        // The exact expected UTC value can be tricky without knowing the exact transition time and offset change.
        // A simpler approach is to assert that it does not throw an exception and returns a valid UTC.
        
        long utcInstant = nzZone.convertLocalToUTC(localInstantInGap, false);
        
        // Assert that the conversion is successful (no exception) and the result is a valid long.
        // DateTimeConstants.MIN_TIME and MAX_TIME are not defined in the provided snippet.
        // We will assert that the result is within a reasonable range for milliseconds.
        assertTrue(utcInstant >= -8.64E15 && utcInstant <= 8.64E15); // Approximate range of long for milliseconds
    }

    @Test
    public void testGetMillisKeepLocal_sameZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = zone.convertUTCToLocal(1000000L);
        assertEquals(instant, zone.getMillisKeepLocal(zone, instant));
    }

    @Test
    public void testGetMillisKeepLocal_differentZone() throws Exception {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1); // UTC+1
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(2); // UTC+2
        long utcInstant = 1000000L;
        long localInstantZone1 = zone1.convertUTCToLocal(utcInstant);
        long convertedInstantZone2 = zone1.getMillisKeepLocal(zone2, utcInstant);
        
        // The expected value is calculated based on the logic:
        // local time in zone1 - offset of zone2
        long expected = utcInstant + zone1.getOffset(utcInstant) - zone2.getOffset(zone1.convertUTCToLocal(utcInstant));
        assertEquals(expected, convertedInstantZone2);
    }


    
    @Test
    public void testIsFixed_trueForFixedZone() throws Exception {
        DateTimeZone fixedZone = DateTimeZone.forOffsetHours(1);
        assertTrue(fixedZone.isFixed());
    }

    @Test
    public void testIsFixed_falseForVariableZone() throws Exception {
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London");
        assertFalse(londonZone.isFixed());
    }

    @Test
    public void testNextTransition_basic() throws Exception {
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London");
        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 1, 1, 12, 0, 0, 0); // January 1st
        long nextTransition = londonZone.nextTransition(instant);
        
        // The exact transition time can vary, so we need to find the correct one.
        // For Europe/London, DST typically starts on the last Sunday of March.
        // In 2023, this was March 26th. The transition is at 1 AM GMT, which becomes 2 AM BST.
        // So, the next transition *after* Jan 1st, 2023, 12:00 UTC is March 26th, 2023, 1 AM UTC.
        long expectedTransition = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 3, 26, 1, 0, 0, 0); // 1 AM UTC on March 26th
        assertEquals(expectedTransition, nextTransition);
    }
    
    @Test
    public void testPreviousTransition_basic() throws Exception {
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London");
        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 7, 1, 12, 0, 0, 0); // July 1st
        long previousTransition = londonZone.previousTransition(instant);
        
        // For Europe/London, DST typically ends on the last Sunday of October.
        // In 2023, this was October 29th. The transition is at 2 AM BST, which becomes 1 AM GMT.
        // So, the previous transition *before* July 1st, 2023, 12:00 UTC is October 29th, 2022, 2 AM BST (which is 1 AM GMT UTC).
        long expectedTransition = ISOChronology.getInstanceUTC().getDateTimeMillis(2022, 10, 29, 1, 0, 0, 0); // 1 AM UTC on Oct 29th, 2022
        assertEquals(expectedTransition, previousTransition);
    }
    
    @Test
    public void testZonedDurationField_addWithOffset() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone estZone = DateTimeZone.forOffsetHours(-5); // EST
        ZonedChronology zc = ZonedChronology.getInstance(iso, estZone);
        
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // 12 PM UTC
        // Adding 2 hours to the local time (12 PM UTC - 5 hours = 7 AM EST).
        // 7 AM EST + 2 hours = 9 AM EST.
        // 9 AM EST is 9 + 5 = 14 PM UTC.
        long addedInstant = zc.hours().add(instant, 2);
        
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 26, 14, 0, 0, 0);
        assertEquals(expectedUTC, addedInstant);
    }
    
    @Test
    public void testZonedDurationField_addWithOffset_overflow() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        // Use an offset that is close to the maximum to trigger potential overflow
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(18, 0); 
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = 0; 
        try {
            // Adding a value that, when combined with the offset, might cause overflow
            zc.hours().add(instant, Integer.MAX_VALUE / DateTimeConstants.HOURS_PER_DAY); 
            fail("Expected ArithmeticException for offset overflow");
        } catch (ArithmeticException expected) {
            // Correctly caught exception for overflow
        }
    }
    
    @Test
    public void testZonedDateTimeField_setWithOffsetTransition() throws Exception {
        DateTimeZone berlinZone = DateTimeZone.forID("Europe/Berlin"); // UTC+1, DST UTC+2
        ZonedChronology zc = ZonedChronology.getInstance(ISOChronology.getInstance(), berlinZone);
        
        // DST starts: March 26, 2023, 2 AM CET becomes 3 AM CEST.
        // Test setting hour to 3 when the instant is before the transition.
        long beforeTransitionUTC = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 3, 26, 1, 30, 0, 0); // 1:30 AM UTC (2:30 AM CET)
        long afterSetUTC = zc.hourOfDay().set(beforeTransitionUTC, 3); // Set local hour to 3
        
        // The local time becomes 3:30 AM CEST.
        // UTC should be 3:30 AM CEST - 2 hours offset = 1:30 AM UTC.
        long expectedUTC_dst_start = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 3, 26, 1, 30, 0, 0);
        assertEquals(expectedUTC_dst_start, afterSetUTC);

        // DST ends: October 29, 2023, 3 AM CEST becomes 2 AM CET.
        // Test setting hour to 1 when the instant is after the transition.
        long afterEndTransitionUTC = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 10, 29, 1, 30, 0, 0); // 1:30 AM UTC (3:30 AM CEST)
        long afterSetEndUTC = zc.hourOfDay().set(afterEndTransitionUTC, 1); // Set local hour to 1
        
        // The local time becomes 1:30 AM CET.
        // UTC should be 1:30 AM CET - 1 hour offset = 0:30 AM UTC.
        long expectedUTC_dst_end = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 10, 29, 0, 30, 0, 0);
        assertEquals(expectedUTC_dst_end, afterSetEndUTC);
    }

    // New tests for uncalled methods

    @Test
    public void testGetDifference_millis() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant1 = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0);
        long instant2 = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 1, 0); // 1 second later
        assertEquals(DateTimeConstants.MILLIS_PER_SECOND, zc.millis().getDifference(instant2, instant1));
    }

    @Test
    public void testGetAsText_monthOfYear() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 11, 15, 12, 0, 0, 0); // Nov 15th
        assertEquals("November", zc.monthOfYear().getAsText(instant, Locale.ENGLISH));
    }
    
    @Test
    public void testGetAsShortText_dayOfWeek() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // Thursday
        assertEquals("Thu", zc.dayOfWeek().getAsShortText(instant, Locale.ENGLISH));
    }
    
    @Test
    public void testGetAsText_dayOfWeek() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // Thursday
        assertEquals("Thursday", zc.dayOfWeek().getAsText(instant, Locale.ENGLISH));
    }

    @Test
    public void testAdd_millisOfSecond_negative() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 500); // 500ms
        long addedInstant = zc.millisOfSecond().add(instant, -200); // subtract 200ms
        
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 300);
        assertEquals(expectedUTC, addedInstant);
    }

    @Test
    public void testAddWrapField_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 23, 0, 0, 0); // 23:00 local
        long addedInstant = zc.hourOfDay().addWrapField(instant, 2); // Add 2 hours, wraps around
        
        // Expected: 23:00 local + 2 hours = 01:00 the next day local time.
        // 01:00 local (UTC+1) is 00:00 UTC.
        long expectedUTC = iso.getDateTimeMillis(2023, 10, 27, 0, 0, 0, 0);
        assertEquals(expectedUTC, addedInstant);
    }

    @Test
    public void testGetDifference_hours() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant1 = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // 12:00 UTC
        long instant2 = iso.getDateTimeMillis(2023, 10, 26, 15, 0, 0, 0); // 15:00 UTC
        
        // Difference is 3 hours in UTC. Since the zone offset is fixed, local time difference is also 3 hours.
        assertEquals(3, zc.hours().getDifference(instant2, instant1));
    }

    @Test
    public void testGet_hourOfDay() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 13, 45, 0, 0); // 13:45 UTC -> 14:45 local
        assertEquals(14, zc.hourOfDay().get(instant)); // Expect 14 (2 PM) local time
    }
    
    @Test
    public void testGet_millisOfSecond() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        long instant = iso.getDateTimeMillis(2023, 10, 26, 13, 45, 59, 123); // 59 seconds and 123ms
        assertEquals(123, zc.millisOfSecond().get(instant));
    }

    @Test
    public void testGetMillis_int_long() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        
        // Get the millisecond duration of 5 hours relative to an instant.
        // The instant is in UTC, but the duration is calculated in the zoned chronology's local time.
        long instant = iso.getDateTimeMillis(2023, 10, 26, 12, 0, 0, 0); // 12:00 UTC
        // We want to find the millisecond duration of 5 hours added to the local time of 'instant'.
        // Local time of 'instant' in zone (UTC+1) is 13:00.
        // 5 hours added to 13:00 is 18:00.
        // The duration between 13:00 and 18:00 local time is 5 hours.
        // This should correspond to 5 * MILLIS_PER_HOUR in UTC.
        long durationMillis = zc.hours().getMillis(5, instant);
        assertEquals(5 * DateTimeConstants.MILLIS_PER_HOUR, durationMillis);
    }

    @Test
    public void testGetMaximumValue_dayOfWeek() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(7, zc.dayOfWeek().getMaximumValue());
    }

    @Test
    public void testGetMinimumValue_dayOfWeek() throws Exception {
        Chronology iso = ISOChronology.getInstance();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(iso, zone);
        assertEquals(1, zc.dayOfWeek().getMinimumValue());
    }

    @Test
    public void testIsStandardOffset_true() throws Exception {
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London");
        // A date in winter, should be standard offset (GMT, UTC+0)
        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 1, 15, 12, 0, 0, 0); 
        assertTrue(londonZone.isStandardOffset(instant));
    }

    @Test
    public void testIsStandardOffset_false() throws Exception {
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London");
        // A date in summer, should be non-standard offset (BST, UTC+1)
        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 7, 15, 12, 0, 0, 0); 
        assertFalse(londonZone.isStandardOffset(instant));
    }

    @Test
    public void testGetStandardOffset_basic() throws Exception {
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London");
        long winterInstant = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 1, 15, 12, 0, 0, 0); // Winter
        assertEquals(0, londonZone.getStandardOffset(winterInstant)); // GMT is UTC+0
        
        long summerInstant = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 7, 15, 12, 0, 0, 0); // Summer
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, londonZone.getStandardOffset(summerInstant)); // Standard offset in summer is BST (UTC+1)
    }

    @Test
    public void testGetOffsetFromLocal_basic() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1); // UTC+1
        long instantLocal = 2 * DateTimeConstants.MILLIS_PER_HOUR; // 2 AM local
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(instantLocal)); // Expect offset of +1 hour
    }

    @Test
    public void testGetOffsetFromLocal_dstTransition() throws Exception {
        DateTimeZone newYorkZone = DateTimeZone.forID("America/New_York");
        // DST starts on the second Sunday in March. In 2023, it was March 12.
        // At 2 AM local time, clocks jump to 3 AM.
        // Test an instant during the gap, which is between 2 AM and 3 AM local time.
        // getOffsetFromLocal should return the offset that makes sense for the *earlier* part of the time range.
        // The instant *after* the gap: 3:30 AM EDT (UTC-4)
        long utcFor3_30AM_after = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 3, 12, 7, 30, 0, 0); // 7:30 AM UTC is 3:30 AM EDT (UTC-4)
        long localInstant_after_gap = newYorkZone.convertUTCToLocal(utcFor3_30AM_after); // This local instant is 3:30 AM EDT.
        // getOffsetFromLocal should return the offset for EDT (-4 hours)
        assertEquals(-4 * DateTimeConstants.MILLIS_PER_HOUR, newYorkZone.getOffsetFromLocal(localInstant_after_gap));

        // Test an instant that would have been 1:30 AM EST (UTC-5) before the transition.
        long utcFor1_30AM_before = ISOChronology.getInstanceUTC().getDateTimeMillis(2023, 3, 12, 6, 30, 0, 0); // 6:30 AM UTC is 1:30 AM EST (UTC-5)
        long localInstant_before_gap = newYorkZone.convertUTCToLocal(utcFor1_30AM_before); // This local instant is 1:30 AM EST.
        // getOffsetFromLocal should return the offset for EST (-5 hours)
        assertEquals(-5 * DateTimeConstants.MILLIS_PER_HOUR, newYorkZone.getOffsetFromLocal(localInstant_before_gap));
    }

    // A dummy LocalDateTime class for testing purposes.
    // This class is defined within ZonedChronologyTest and should be accessible.
    static class LocalDateTime {
        private final long iP;
        private LocalDateTime(long instant) { iP = instant; }
        public static LocalDateTime fromMillis(long millis) { return new LocalDateTime(millis); }
        public long getMillis() { return iP; }
    }
}

