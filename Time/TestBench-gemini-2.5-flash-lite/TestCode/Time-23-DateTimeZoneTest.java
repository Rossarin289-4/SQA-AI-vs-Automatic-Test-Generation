package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
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

public class DateTimeZoneTest {
    @Test
    public void testGetDefault_nullSystemProperty() throws Exception {
        // Test case designed to simulate a null user.timezone property.
        // Expecting fallback to TimeZone.getDefault().
        // We can't directly control system properties here, so we'll rely on
        // the fact that getDefault() handles null and falls back.
        // Since the exact fallback is hard to assert without setting system properties,
        // we assert that it returns a DateTimeZone object.
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertNotNull("Default DateTimeZone should not be null", defaultZone);
    }

    @Test
    public void testSetDefault_null() throws Exception {
        try {
            DateTimeZone.setDefault(null);
            fail("Should throw IllegalArgumentException for null zone");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testForID_null() throws Exception {
        // Test null ID, should return default zone
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(defaultZone, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_fixedOffsetPositive() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+01:00");
        assertEquals("+01:00", zone.getID());
        assertEquals(3600000, zone.getOffset(0));
    }

    @Test
    public void testForID_fixedOffsetNegative() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("-08:00");
        assertEquals("-08:00", zone.getID());
        assertEquals(-28800000, zone.getOffset(0));
    }

    @Test
    public void testForID_fixedOffsetHoursOnly() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+02");
        assertEquals("+02:00", zone.getID());
        assertEquals(2 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }
    
    @Test
    public void testForID_fixedOffsetNegativeHoursOnly() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("-05");
        assertEquals("-05:00", zone.getID());
        assertEquals(-5 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }

    @Test
    public void testForID_nonexistent() throws Exception {
        try {
            DateTimeZone.forID("NonExistentZone123");
            fail("Should throw IllegalArgumentException for non-existent ID");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testForOffsetHours_zero() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_positive() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals("+02:00", zone.getID());
        assertEquals(2 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }

    @Test
    public void testForOffsetHours_negative() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals("-05:00", zone.getID());
        assertEquals(-5 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetHours_maxPositive() throws Exception {
        // The maximum valid offset hours should be 18 (as per common DST rules).
        DateTimeZone zone = DateTimeZone.forOffsetHours(18);
        assertEquals("+18:00", zone.getID());
        assertEquals(18 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }

    @Test
    public void testForOffsetHours_minNegative() throws Exception {
        // The minimum valid offset hours should be -18.
        DateTimeZone zone = DateTimeZone.forOffsetHours(-18);
        assertEquals("-18:00", zone.getID());
        assertEquals(-18 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetHours_tooLarge() throws Exception {
        try {
            DateTimeZone.forOffsetHours(19); // Exceeds max valid offset
            fail("Should throw IllegalArgumentException for offset too large");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }
    
    @Test
    public void testForOffsetHours_tooSmall() throws Exception {
        try {
            DateTimeZone.forOffsetHours(-19); // Exceeds min valid offset
            fail("Should throw IllegalArgumentException for offset too small");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testForOffsetHoursMinutes_zero() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_positive() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(3, 30);
        assertEquals("+03:30", zone.getID());
        assertEquals(3 * DateTimeConstants.MILLIS_PER_HOUR + 30 * DateTimeConstants.MILLIS_PER_MINUTE, zone.getOffset(0));
    }

    @Test
    public void testForOffsetHoursMinutes_negative() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-10, 15);
        assertEquals("-10:15", zone.getID());
        assertEquals(-10 * DateTimeConstants.MILLIS_PER_HOUR - 15 * DateTimeConstants.MILLIS_PER_MINUTE, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetHoursMinutes_maxMinutes() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 59);
        assertEquals("+00:59", zone.getID());
        assertEquals(59 * DateTimeConstants.MILLIS_PER_MINUTE, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetHoursMinutes_minMinutes() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertEquals(DateTimeZone.UTC, zone);
    }

    @Test
    public void testForOffsetHoursMinutes_invalidMinutesAbove() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail("Should throw IllegalArgumentException for minutes >= 60");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testForOffsetHoursMinutes_invalidMinutesBelow() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, -1);
            fail("Should throw IllegalArgumentException for minutes < 0");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }
    
    @Test
    public void testForOffsetMillis_zero() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_positive() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(DateTimeConstants.MILLIS_PER_HOUR);
        assertEquals("+01:00", zone.getID());
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }

    @Test
    public void testForOffsetMillis_negative() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-DateTimeConstants.MILLIS_PER_MINUTE * 30);
        assertEquals("-00:30", zone.getID());
        assertEquals(-DateTimeConstants.MILLIS_PER_MINUTE * 30, zone.getOffset(0));
    }

    @Test
    public void testForOffsetMillis_maxPositive() throws Exception {
        // The maximum valid offset in milliseconds (18 hours)
        DateTimeZone zone = DateTimeZone.forOffsetMillis(18 * DateTimeConstants.MILLIS_PER_HOUR);
        assertEquals("+18:00", zone.getID());
        assertEquals(18 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetMillis_minNegative() throws Exception {
        // The minimum valid offset in milliseconds (-18 hours)
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-18 * DateTimeConstants.MILLIS_PER_HOUR);
        assertEquals("-18:00", zone.getID());
        assertEquals(-18 * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(0));
    }

    @Test
    public void testForTimeZone_null() throws Exception {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(defaultZone, DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_GMT() throws Exception {
        // GMT is an alias for UTC in java.util.TimeZone, and should be converted.
        assertEquals(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testForTimeZone_fixedOffset() throws Exception {
        // The reference code converts GMT+hh:mm to "+hh:mm" ID.
        DateTimeZone dtz = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+05:30"));
        assertEquals("+05:30", dtz.getID()); // Expected ID after conversion
        assertEquals(5 * DateTimeConstants.MILLIS_PER_HOUR + 30 * DateTimeConstants.MILLIS_PER_MINUTE, dtz.getOffset(0));
    }

    @Test
    public void testForTimeZone_fixedOffsetNegative() throws Exception {
        // The reference code converts GMT-hh:mm to "-hh:mm" ID.
        DateTimeZone dtz = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00"));
        assertEquals("-02:00", dtz.getID()); // Expected ID after conversion
        assertEquals(-2 * DateTimeConstants.MILLIS_PER_HOUR, dtz.getOffset(0));
    }

    @Test
    public void testForTimeZone_knownID() throws Exception {
        // Assuming "America/New_York" is a valid ID provided by the default provider.
        DateTimeZone dtz = DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/New_York"));
        assertEquals("America/New_York", dtz.getID());
    }

    @Test
    public void testForTimeZone_unknownID() throws Exception {
        try {
            // This test requires that the default provider does NOT have "NonExistentZoneXYZ".
            // If it does, this test should be modified or removed.
            DateTimeZone.forTimeZone(TimeZone.getTimeZone("NonExistentZoneXYZ"));
            fail("Should throw IllegalArgumentException for unknown TimeZone ID");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }
    
    @Test
    public void testGetAvailableIDs() throws Exception {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.size() > 0);
        assertTrue(ids.contains("UTC"));
    }

    @Test
    public void testGetProvider() throws Exception {
        Provider provider = DateTimeZone.getProvider();
        assertNotNull(provider);
        // The exact type might vary based on system properties, so we just check for non-null.
    }

    @Test
    public void testSetProvider_null() throws Exception {
        try {
            DateTimeZone.setProvider(null);
            fail("Should throw IllegalArgumentException for null provider");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testGetNameProvider() throws Exception {
        NameProvider nameProvider = DateTimeZone.getNameProvider();
        assertNotNull(nameProvider);
    }

    @Test
    public void testSetProvider_noUTC() throws Exception {
        Provider dummyProvider = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> ids = new java.util.HashSet<>();
                ids.add("Some/OtherID");
                return ids;
            }
            public DateTimeZone getZone(String id) {
                if ("Some/OtherID".equals(id)) {
                    return new FixedDateTimeZone("Some/OtherID", null, 0, 0);
                }
                return null;
            }
        };
        try {
            DateTimeZone.setProvider(dummyProvider);
            fail("Should throw IllegalArgumentException if provider does not support UTC");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testSetProvider_invalidUTC() throws Exception {
        Provider dummyProvider = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> ids = new java.util.HashSet<>();
                ids.add("UTC");
                return ids;
            }
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    // Invalid UTC zone (non-zero offset)
                    return new FixedDateTimeZone("UTC", null, 3600000, 3600000);
                }
                return null;
            }
        };
        try {
            DateTimeZone.setProvider(dummyProvider);
            fail("Should throw IllegalArgumentException for invalid UTC zone");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testGetNameProvider_null() throws Exception {
        // Setting to null should reset to the default provider.
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
        assertTrue(DateTimeZone.getNameProvider() instanceof DefaultNameProvider);
    }

    @Test
    public void testGetID() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void testGetNameKey_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0); // UTC
        assertEquals("UTC", zone.getNameKey(0));
    }
    
    @Test
    public void testGetNameKey_nonFixed() throws Exception {
        // This test depends on the default provider having a zone with DST.
        // Europe/London is a common one. We just check for a non-null key.
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone.getNameKey(DateTimeUtils.currentTimeMillis()));
    }

    @Test
    public void testGetShortName_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0); // UTC
        assertEquals("+00:00", zone.getShortName(0));
    }
    
    @Test
    public void testGetShortName_fixed_positiveOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", zone.getShortName(0));
    }
    
    @Test
    public void testGetShortName_fixed_negativeOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 15);
        assertEquals("-05:15", zone.getShortName(0));
    }

    @Test
    public void testGetName_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0); // UTC
        assertEquals("+00:00", zone.getName(0));
    }
    
    @Test
    public void testGetName_fixed_positiveOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals("+02:30", zone.getName(0));
    }
    
    @Test
    public void testGetName_fixed_negativeOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 15);
        assertEquals("-05:15", zone.getName(0));
    }

    @Test
    public void testGetStandardOffset_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(0));
    }
    
    @Test
    public void testGetStandardOffset_nonFixed() throws Exception {
        // Test standard offset for a zone with DST. Europe/London is UTC+0 in winter.
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long winterInstant = new org.joda.time.DateTime(2000, 1, 1, 12, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(0, zone.getStandardOffset(winterInstant));
    }
    
    @Test
    public void testIsStandardOffset_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertTrue(zone.isStandardOffset(0)); // Fixed zones are always standard
    }

    @Test
    public void testIsStandardOffset_nonFixed_standardTime() throws Exception {
        // Test for a time when standard time is active (winter).
        DateTimeZone zone = DateTimeZone.forID("Europe/London"); // UTC+0 in winter
        long winterInstant = new org.joda.time.DateTime(2000, 1, 1, 12, 0, 0, DateTimeZone.UTC).getMillis();
        assertTrue(zone.isStandardOffset(winterInstant));
    }
    
    @Test
    public void testIsStandardOffset_nonFixed_dst() throws Exception {
        // Test for a time when DST is active (summer).
        DateTimeZone zone = DateTimeZone.forID("Europe/London"); // UTC+1 in summer
        long summerInstant = new org.joda.time.DateTime(2000, 7, 1, 12, 0, 0, DateTimeZone.UTC).getMillis();
        assertFalse(zone.isStandardOffset(summerInstant));
    }

    @Test
    public void testGetOffsetFromLocal_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000, zone.getOffsetFromLocal(1000000L));
    }
    
    @Test
    public void testGetOffsetFromLocal_dst_transition_overlap() throws Exception {
        // Test for an ambiguous local time during DST end (overlap).
        // Europe/London, 2023-10-29 01:30:00 occurs twice.
        // The first is BST (UTC+1), the second is GMT (UTC+0).
        // getOffsetFromLocal should return the standard offset (UTC+0) for ambiguous times.
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long localMillis_ambiguous = new org.joda.time.DateTime(2023, 10, 29, 1, 30, 0, london).getMillis();
        int offset = london.getOffsetFromLocal(localMillis_ambiguous);
        assertEquals(0, offset); // Expecting standard offset during overlap
    }

    @Test
    public void testGetOffsetFromLocal_dst_transition_gap() throws Exception {
        // Test for a non-existent local time during DST start (gap).
        // Europe/London, 2023-03-26 01:30:00 did not exist.
        // getOffsetFromLocal should return the offset of the hour *after* the gap.
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long localMillis_gap = new org.joda.time.DateTime(2023, 3, 26, 1, 30, 0, london).getMillis();
        // The offset after the gap is +1 hour (BST).
        int offset = london.getOffsetFromLocal(localMillis_gap);
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, offset);
    }

    @Test
    public void testConvertUTCToLocal_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long utcMillis = 1000000L;
        assertEquals(utcMillis + DateTimeConstants.MILLIS_PER_HOUR, zone.convertUTCToLocal(utcMillis));
    }

    @Test
    public void testConvertUTCToLocal_overflow() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(10);
        long largeUtcMillis = Long.MAX_VALUE - DateTimeConstants.MILLIS_PER_HOUR + 1;
        try {
            zone.convertUTCToLocal(largeUtcMillis);
            fail("Should throw ArithmeticException on overflow");
        } catch (ArithmeticException expected) {
            // Expected
        }
    }
    
    @Test
    public void testConvertUTCToLocal_overflow_negative() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-10);
        long smallUtcMillis = Long.MIN_VALUE + DateTimeConstants.MILLIS_PER_HOUR - 1;
        try {
            zone.convertUTCToLocal(smallUtcMillis);
            fail("Should throw ArithmeticException on overflow");
        } catch (ArithmeticException expected) {
            // Expected
        }
    }

    @Test
    public void testConvertLocalToUTC_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long localMillis = 1000000L;
        assertEquals(localMillis - DateTimeConstants.MILLIS_PER_HOUR, zone.convertLocalToUTC(localMillis, false));
    }

    @Test
    public void testConvertLocalToUTC_strict_gap() throws Exception {
        // Test strict mode during a DST gap.
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        // 2023-03-26 01:30:00 in London did not exist.
        long nonExistentLocalMillis = new org.joda.time.DateTime(2023, 3, 26, 1, 30, 0, london).getMillis();
        
        try {
            // The reference code's logic for convertLocalToUTC(local, strict)
            // throws IllegalArgumentException for gaps when strict is true.
            london.convertLocalToUTC(nonExistentLocalMillis, true);
            fail("Should throw IllegalArgumentException in strict mode for a gap");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testConvertLocalToUTC_nonStrict_gap() throws Exception {
        // Test non-strict mode during a DST gap.
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        // 2023-03-26 01:30:00 in London did not exist.
        long nonExistentLocalMillis = new org.joda.time.DateTime(2023, 3, 26, 1, 30, 0, london).getMillis();
        
        // In non-strict mode, the converter should pick the offset that makes sense.
        // For a gap, it should pick the later offset (which is +1 hour for London's summer time).
        long utcMillis = london.convertLocalToUTC(nonExistentLocalMillis, false);
        
        // The local instant 2023-03-26 01:30:00 (non-existent) corresponds to 2023-03-26 00:30:00 UTC
        // because the converter picks the offset *after* the gap (UTC+1).
        long expectedUtcMillis = new org.joda.time.DateTime(2023, 3, 26, 0, 30, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expectedUtcMillis, utcMillis);
    }

    @Test
    public void testConvertLocalToUTC_overflow() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-10);
        long largeLocalMillis = Long.MAX_VALUE - DateTimeConstants.MILLIS_PER_HOUR + 1;
        try {
            zone.convertLocalToUTC(largeLocalMillis, false);
            fail("Should throw ArithmeticException on overflow");
        } catch (ArithmeticException expected) {
            // Expected
        }
    }
    
    @Test
    public void testConvertLocalToUTC_overflow_negative() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(10);
        long smallLocalMillis = Long.MIN_VALUE + DateTimeConstants.MILLIS_PER_HOUR - 1;
        try {
            zone.convertLocalToUTC(smallLocalMillis, false);
            fail("Should throw ArithmeticException on overflow");
        } catch (ArithmeticException expected) {
            // Expected
        }
    }

    @Test
    public void testConvertLocalToUTC_overlap_preferLater() throws Exception {
        // Test that during an overlap, the later instant is chosen (non-strict).
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // 2023-10-29 01:30:00 GMT occurs twice.
        // First occurrence (BST): UTC 00:30.
        // Second occurrence (GMT): UTC 01:30.
        // convertLocalToUTC should return the UTC corresponding to the GMT time (later).
        long localMillis = new org.joda.time.DateTime(2023, 10, 29, 1, 30, 0, zone).getMillis();
        
        long utcMillis = zone.convertLocalToUTC(localMillis, false);
        
        // The expected UTC instant is 2023-10-29 01:30:00 UTC.
        long expectedUtcMillis = new org.joda.time.DateTime(2023, 10, 29, 1, 30, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expectedUtcMillis, utcMillis);
    }

    @Test
    public void testGetMillisKeepLocal_sameZone() throws Exception {
        DateTimeZone zone = DateTimeZone.getDefault();
        long instant = System.currentTimeMillis(); // Use current time for a realistic test
        assertEquals(instant, zone.getMillisKeepLocal(zone, instant));
    }

    @Test
    public void testGetMillisKeepLocal_differentZones() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        
        // An instant in London time during BST (UTC+1).
        // 2023-07-15 11:00:00 UTC is 2023-07-15 12:00:00 BST in London.
        long londonInstantUTC = new org.joda.time.DateTime(2023, 7, 15, 11, 0, 0, DateTimeZone.UTC).getMillis();
        
        // Convert this UTC instant to New York local time.
        // New York is UTC-4 in summer (EDT).
        // 2023-07-15 11:00:00 UTC should be 2023-07-15 07:00:00 EDT in New York.
        long newYorkInstantUTC = newYork.getMillisKeepLocal(london, londonInstantUTC);
        
        long expectedNewYorkMillis = new org.joda.time.DateTime(2023, 7, 15, 7, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expectedNewYorkMillis, newYorkInstantUTC);
    }
    
    @Test
    public void testIsLocalDateTimeGap_fixedZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        LocalDateTime localDateTime = new LocalDateTime(2023, 1, 1, 12, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(localDateTime));
    }

    @Test
    public void testIsLocalDateTimeGap_nonFixedZone_noGap() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // A time that exists and is not a DST gap.
        LocalDateTime localDateTime = new LocalDateTime(2023, 7, 15, 12, 0, 0); // Summer
        assertFalse(zone.isLocalDateTimeGap(localDateTime));
    }
    
    @Test
    public void testIsLocalDateTimeGap_nonFixedZone_isGap() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // A time that does not exist due to DST spring forward (gap).
        // 2023-03-26 01:30:00 in London did not exist.
        LocalDateTime localDateTime = new LocalDateTime(2023, 3, 26, 1, 30, 0);
        assertTrue(zone.isLocalDateTimeGap(localDateTime));
    }

    @Test
    public void testAdjustOffset_noTransition() throws Exception {
        // Test adjustment when there's no transition nearby. For fixed zones, it should return the same instant.
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = 1000000L;
        assertEquals(instant, zone.adjustOffset(instant, true));
        assertEquals(instant, zone.adjustOffset(instant, false));
    }

    @Test
    public void testAdjustOffset_overlap_later() throws Exception {
        // Test adjustment during an overlap, choosing the later instant.
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // 2023-10-29 01:30:00 GMT occurs twice.
        // First occurrence (BST): UTC 00:30.
        // Second occurrence (GMT): UTC 01:30.
        // We want the later one (GMT).
        long localMillis = new org.joda.time.DateTime(2023, 10, 29, 1, 30, 0, zone).getMillis();
        
        // Adjust to later: should give the UTC instant corresponding to the second occurrence.
        long adjustedLater = zone.adjustOffset(localMillis, true);
        long expectedLaterUTC = new org.joda.time.DateTime(2023, 10, 29, 1, 30, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expectedLaterUTC, adjustedLater);
    }

    @Test
    public void testAdjustOffset_overlap_earlier() throws Exception {
        // Test adjustment during an overlap, choosing the earlier instant.
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // 2023-10-29 01:30:00 GMT occurs twice.
        // First occurrence (BST): UTC 00:30.
        // Second occurrence (GMT): UTC 01:30.
        // We want the earlier one (BST).
        long localMillis = new org.joda.time.DateTime(2023, 10, 29, 1, 30, 0, zone).getMillis();
        
        // Adjust to earlier: should give the UTC instant corresponding to the first occurrence.
        long adjustedEarlier = zone.adjustOffset(localMillis, false);
        long expectedEarlierUTC = new org.joda.time.DateTime(2023, 10, 29, 0, 30, 0, DateTimeZone.UTC).getMillis();
        assertEquals(expectedEarlierUTC, adjustedEarlier);
    }

    @Test
    public void testIsFixed_fixedZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertTrue(zone.isFixed());
    }

    @Test
    public void testIsFixed_nonFixedZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertFalse(zone.isFixed());
    }

    @Test
    public void testNextTransition_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = 1000000L;
        // For fixed zones, nextTransition should return the same instant.
        assertEquals(instant, zone.nextTransition(instant));
    }

    @Test
    public void testNextTransition_nonFixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = new org.joda.time.DateTime(2023, 1, 1, 12, 0, 0, DateTimeZone.UTC).getMillis();
        long nextTrans = zone.nextTransition(instant);
        assertTrue(nextTrans > instant);
        // The exact value depends on the historical data, so we assert that it's in the future.
    }

    @Test
    public void testPreviousTransition_fixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = 1000000L;
        // For fixed zones, previousTransition should return the same instant.
        assertEquals(instant, zone.previousTransition(instant));
    }

    @Test
    public void testPreviousTransition_nonFixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = new org.joda.time.DateTime(2023, 7, 1, 12, 0, 0, DateTimeZone.UTC).getMillis();
        long prevTrans = zone.previousTransition(instant);
        assertTrue(prevTrans < instant);
        // The exact value depends on the historical data, so we assert that it's in the past.
    }

    @Test
    public void testToTimeZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        java.util.TimeZone tz = zone.toTimeZone();
        assertEquals("America/Los_Angeles", tz.getID());
    }

    @Test
    public void testEquals_sameObject() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        assertEquals(zone, zone);
    }

    @Test
    public void testEquals_fixedZonesDifferentOffsets() throws Exception {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(2);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    public void testEquals_fixedZonesSameOffsets() throws Exception {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHoursMinutes(1, 0);
        assertEquals(zone1, zone2);
    }

    @Test
    public void testEquals_nonFixedZonesSameID() throws Exception {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        assertEquals(zone1, zone2);
    }

    @Test
    public void testEquals_nonFixedZonesDifferentID() throws Exception {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("America/New_York");
        assertFalse(zone1.equals(zone2));
    }

    @Test
    public void testEquals_fixedAndNonFixedSameID() throws Exception {
        // UTC is a special case where FixedDateTimeZone and the provider's UTC zone are equal.
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(0); // FixedDateTimeZone("UTC", null, 0, 0)
        DateTimeZone zone2 = DateTimeZone.forID("UTC"); // Provider's UTC zone
        assertEquals(zone1, zone2); // Should be equal
    }

    @Test
    public void testHashCode() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals(zone.hashCode(), DateTimeZone.forID("Europe/London").hashCode());
        assertNotEquals(zone.hashCode(), DateTimeZone.forID("America/New_York").hashCode());
    }

    @Test
    public void testToString() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertEquals("Europe/London", zone.toString());
    }

    @Test
    public void testWriteReplace_readObject() throws Exception {
        // This tests the Stub serialization mechanism.
        DateTimeZone originalZone = DateTimeZone.forID("America/Los_Angeles");
        
        // Simulate serialization
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(originalZone);
        oos.flush();
        oos.close();
        
        // Simulate deserialization
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserializedObject = ois.readObject();
        ois.close();
        
        assertTrue(deserializedObject instanceof DateTimeZone);
        DateTimeZone deserializedZone = (DateTimeZone) deserializedObject;
        
        assertEquals(originalZone, deserializedZone);
        assertEquals(originalZone.getID(), deserializedZone.getID());
    }
}
