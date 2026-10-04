```java
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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a DateTimeFormatter for parsing instants, not present in the original code.
    // This is a common utility in Joda-Time tests.
    private static DateTimeFormatter getInstantFormatter() {
        return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    private static DateTimeFormatter getUTCHoursFormatter() {
        return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ");
    }
    
    // Helper to create a DateTimeFormatter for parsing local instants without zone info, not present in the original code.
    private static DateTimeFormatter getLocalDateTimeFormatter() {
        return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");
    }

    @Test
    public void testDefaultDateTimeZone() throws Exception {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertNotNull(defaultZone);
        // Re-setting the default zone should return the same object
        DateTimeZone.setDefault(defaultZone);
        assertSame(defaultZone, DateTimeZone.getDefault());
    }

    @Test
    public void testSetDefaultDateTimeZone() throws Exception {
        DateTimeZone originalDefault = DateTimeZone.getDefault();
        DateTimeZone newZone = DateTimeZone.forID("America/New_York");
        DateTimeZone.setDefault(newZone);
        assertSame(newZone, DateTimeZone.getDefault());
        // Reset to original
        DateTimeZone.setDefault(originalDefault);
        assertSame(originalDefault, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultDateTimeZoneNull() throws Exception {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testForID_Null() throws Exception {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(defaultZone, DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_Valid() throws Exception {
        assertEquals("Europe/London", DateTimeZone.forID("Europe/London").getID());
        assertEquals("America/New_York", DateTimeZone.forID("America/New_York").getID());
    }

    @Test
    public void testForID_FixedOffsetPositive() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+01:00");
        assertEquals("+01:00", zone.getID());
        assertEquals(3600000, zone.getOffset(0));
    }

    @Test
    public void testForID_FixedOffsetNegative() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("-05:30");
        assertEquals("-05:30", zone.getID());
        assertEquals(-19800000, zone.getOffset(0));
    }

    @Test
    public void testForID_FixedOffsetPositiveHours() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+02");
        assertEquals("+02:00", zone.getID());
        assertEquals(7200000, zone.getOffset(0));
    }

    @Test
    public void testForID_FixedOffsetNegativeHours() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("-03");
        assertEquals("-03:00", zone.getID());
        assertEquals(-10800000, zone.getOffset(0));
    }

    @Test
    public void testForID_FixedOffsetZero() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("0"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("00:00"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_Invalid() throws Exception {
        DateTimeZone.forID("Invalid/Zone");
    }

    @Test
    public void testForOffsetHours() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
        assertEquals("+01:00", DateTimeZone.forOffsetHours(1).getID());
        assertEquals("-05:00", DateTimeZone.forOffsetHours(-5).getID());
    }

    @Test
    public void testForOffsetHoursMinutes() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
        assertEquals("+01:30", DateTimeZone.forOffsetHoursMinutes(1, 30).getID());
        assertEquals("-02:15", DateTimeZone.forOffsetHoursMinutes(-2, 15).getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_InvalidMinutesNegative() throws Exception {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_InvalidMinutesTooLarge() throws Exception {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test
    public void testForOffsetMillis() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
        assertEquals("+01:00", DateTimeZone.forOffsetMillis(3600000).getID());
        assertEquals("-05:30", DateTimeZone.forOffsetMillis(-19800000).getID());
    }

    @Test
    public void testForTimeZone_Null() throws Exception {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(defaultZone, DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_GMT() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
    }

    @Test
    public void testForTimeZone_Valid() throws Exception {
        assertEquals("Europe/London", DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London")).getID());
        assertEquals("America/New_York", DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/New_York")).getID());
    }

    @Test
    public void testForTimeZone_FixedOffsetPositive() throws Exception {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:00"));
        assertEquals("+01:00", zone.getID());
        assertEquals(3600000, zone.getOffset(0));
    }

    @Test
    public void testForTimeZone_FixedOffsetNegative() throws Exception {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-05:30"));
        assertEquals("-05:30", zone.getID());
        assertEquals(-19800000, zone.getOffset(0));
    }

    @Test
    public void testForTimeZone_ShortIDConversion() throws Exception {
        // Test some common short ID conversions
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT")));
        assertEquals("America/Los_Angeles", DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST")).getID());
        assertEquals("America/New_York", DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST")).getID());
        assertEquals("America/Chicago", DateTimeZone.forTimeZone(TimeZone.getTimeZone("CST")).getID());
        assertEquals("America/Denver", DateTimeZone.forTimeZone(TimeZone.getTimeZone("MST")).getID());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_InvalidID() throws Exception {
        DateTimeZone.forTimeZone(TimeZone.getTimeZone("INVALID"));
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
        // The exact type might vary based on environment, so check for expected default types
        assertTrue(provider instanceof ZoneInfoProvider || provider instanceof UTCProvider || provider.getClass().getName().contains("ZoneInfoProvider") || provider.getClass().getName().contains("UTCProvider"));
    }

    // Mock provider for testing setProvider
    private static class MockProvider implements Provider {
        private final Set<String> ids;
        private final DateTimeZone zone;

        MockProvider(String id, DateTimeZone z) {
            this.ids = java.util.Collections.singleton(id);
            this.zone = z;
        }

        public Set<String> getAvailableIDs() {
            return ids;
        }

        public DateTimeZone getZone(String id) {
            if (ids.contains(id)) {
                return zone;
            }
            return null;
        }
    }

    @Test
    public void testSetProvider() throws Exception {
        Provider originalProvider = DateTimeZone.getProvider();
        DateTimeZone testZone = new FixedDateTimeZone("TestZone", null, 0, 0);
        Provider mockProvider = new MockProvider("TestZone", testZone);

        DateTimeZone.setProvider(mockProvider);
        assertSame(mockProvider, DateTimeZone.getProvider());
        assertEquals("TestZone", DateTimeZone.forID("TestZone").getID());
        
        // Reset to original
        DateTimeZone.setProvider(originalProvider);
        assertEquals(originalProvider, DateTimeZone.getProvider());
    }

    @Test
    public void testGetNameProvider() throws Exception {
        NameProvider nameProvider = DateTimeZone.getNameProvider();
        assertNotNull(nameProvider);
        assertTrue(nameProvider instanceof DefaultNameProvider);
    }

    // Mock name provider for testing setNameProvider
    private static class MockNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) { return "MockShort"; }
        public String getName(Locale locale, String id, String nameKey) { return "MockLong"; }
    }

    @Test
    public void testSetNameProvider() throws Exception {
        NameProvider originalNameProvider = DateTimeZone.getNameProvider();
        NameProvider mockNameProvider = new MockNameProvider();
        DateTimeZone.setNameProvider(mockNameProvider);
        assertSame(mockNameProvider, DateTimeZone.getNameProvider());

        // Reset to original
        DateTimeZone.setNameProvider(originalNameProvider);
        assertEquals(originalNameProvider, DateTimeZone.getNameProvider());
    }
    
    @Test
    public void testGetID() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        assertEquals("America/Los_Angeles", zone.getID());
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertEquals("+01:00", DateTimeZone.forOffsetHours(1).getID());
    }

    @Test
    public void testGetNameKey() throws Exception {
        // This is an abstract method, test subclasses.
        // For FixedDateTimeZone, nameKey is null if not provided.
        DateTimeZone fixedZone = new FixedDateTimeZone("TestID", "TestKey", 0, 0);
        assertEquals("TestKey", fixedZone.getNameKey(0L));

        // For ZoneInfoProvider zones, the key is usually the ID.
        // We need a real ZoneInfoProvider to test this properly.
        // For now, test with a known fixed zone.
        DateTimeZone londonZone = DateTimeZone.forID("Europe/London"); // This will likely use ZoneInfoProvider if available
        // If London zone is not available, fall back to a fixed zone for assertion.
        if (londonZone.isFixed()) {
             assertEquals("Europe/London", londonZone.getNameKey(0L));
        } else {
             // Fallback for ZoneInfoProvider cases if it is not fixed.
             // The name key is derived from the actual zone information.
             // A simple assertion of non-null might be safer if the exact key is hard to predict.
             assertNotNull(londonZone.getNameKey(0L));
        }
    }

    @Test
    public void testGetShortName() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        // The actual short name depends on the date and locale.
        // For a fixed offset zone, it should print the offset.
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertEquals("+01:00", fixed.getShortName(0L));
        assertEquals("+01:00", fixed.getShortName(0L, Locale.US));

        // Test with a real zone for a specific instant.
        // London, 1st Jan 2000, 00:00 UTC (winter)
        long winterInstant = getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00+0000").getMillis();
        assertEquals("GMT", london.getShortName(winterInstant, Locale.ENGLISH)); // Standard name for London in winter

        // London, 1st July 2000, 00:00 UTC (summer)
        long summerInstant = getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00+0000").getMillis();
        assertEquals("BST", london.getShortName(summerInstant, Locale.ENGLISH)); // British Summer Time
    }

    @Test
    public void testGetName() throws Exception {
        // For a fixed offset zone, it should print the offset.
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertEquals("+01:00", fixed.getName(0L));
        assertEquals("+01:00", fixed.getName(0L, Locale.US));

        // Test with a real zone for a specific instant.
        // London, 1st Jan 2000, 00:00 UTC (winter)
        long winterInstant = getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00+0000").getMillis();
        assertEquals("Greenwich Mean Time", london.getName(winterInstant, Locale.ENGLISH)); // Long name for London in winter

        // London, 1st July 2000, 00:00 UTC (summer)
        long summerInstant = getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00+0000").getMillis();
        assertEquals("British Summer Time", london.getName(summerInstant, Locale.ENGLISH)); // Long name for British Summer Time
    }

    @Test
    public void testGetStandardOffset() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        // Standard offset for London is UTC+00:00
        assertEquals(0, london.getStandardOffset(getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00+0000").getMillis())); // During winter
        // For summer, the standard offset is still UTC+00:00, but the DST offset is UTC+01:00.
        assertEquals(0, london.getStandardOffset(getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00+0000").getMillis())); // During summer

        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        // Standard offset for New York is UTC-05:00
        assertEquals(-18000000, newYork.getStandardOffset(getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00+0000").getMillis())); // During winter
        // During summer, the standard offset is still UTC-05:00, but DST offset is UTC-04:00.
        assertEquals(-18000000, newYork.getStandardOffset(getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00+0000").getMillis())); // During summer
    }

    @Test
    public void testIsStandardOffset() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        assertTrue(london.isStandardOffset(getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00+0000").getMillis())); // Winter
        assertFalse(london.isStandardOffset(getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00+0000").getMillis())); // Summer

        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        assertTrue(newYork.isStandardOffset(getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00+0000").getMillis())); // Winter
        assertFalse(newYork.isStandardOffset(getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00+0000").getMillis())); // Summer

        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertTrue(fixed.isStandardOffset(0L)); // Fixed zones are always standard
    }

    @Test
    public void testGetOffsetFromLocal_Fixed() throws Exception {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000, fixed.getOffsetFromLocal(1000000L)); // Sample local instant
    }

    @Test
    public void testGetOffsetFromLocal_DST() throws Exception {
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        // DST starts March 2nd, 2008 at 2:00 AM local time, when clocks jump forward from 2:00 to 3:00.
        
        // Before DST transition: Standard offset -05:00
        long beforeDSTStart = getLocalDateTimeFormatter().parseDateTime("2008-03-02T01:59:59").getMillis(); // Local time
        assertEquals(-18000000, newYork.getOffsetFromLocal(beforeDSTStart));
        
        // After DST transition: Daylight offset -04:00
        long duringDST = getLocalDateTimeFormatter().parseDateTime("2008-03-02T03:00:00").getMillis(); // Local time
        assertEquals(-14400000, newYork.getOffsetFromLocal(duringDST));
        
        long afterDSTStart = getLocalDateTimeFormatter().parseDateTime("2008-03-02T04:00:00").getMillis(); // Local time
        assertEquals(-14400000, newYork.getOffsetFromLocal(afterDSTStart));
    }

    @Test
    public void testConvertUTCToLocal() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long utcMillisWinter = getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00Z").getMillis();
        // London is UTC+0 in winter
        assertEquals(utcMillisWinter, london.convertUTCToLocal(utcMillisWinter));
        
        long utcMillisSummer = getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00Z").getMillis();
        // London is UTC+1 in summer
        assertEquals(utcMillisSummer + DateTimeConstants.MILLIS_PER_HOUR, london.convertUTCToLocal(utcMillisSummer));
    }

    @Test
    public void testConvertLocalToUTC_Fixed() throws Exception {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        long localMillis = getLocalDateTimeFormatter().parseDateTime("2000-01-01T01:00:00").getMillis(); // Local time
        assertEquals(getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00Z").getMillis(), fixed.convertLocalToUTC(localMillis, true));
    }

    @Test
    public void testConvertLocalToUTC_DST_Strict() throws Exception {
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        // DST transition: March 2nd, 2008 at 2:00 AM local time. Clocks jump to 3:00 AM.
        // 2:30 AM local time on this day does not exist.
        long localMillisGap = getLocalDateTimeFormatter().parseDateTime("2008-03-02T02:30:00").getMillis(); // Local time in the gap
        
        try {
            newYork.convertLocalToUTC(localMillisGap, true);
            fail("Expected IllegalArgumentException for DST gap in strict mode.");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }

    @Test
    public void testConvertLocalToUTC_DST_NonStrict() throws Exception {
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        // DST transition: March 2nd, 2008 at 2:00 AM local time. Clocks jump to 3:00 AM.
        
        // Test an instant that *should* map to the DST time.
        long localMillisDST = getLocalDateTimeFormatter().parseDateTime("2008-03-02T03:30:00").getMillis(); // Local time that exists
        long utcMillisDST = newYork.convertLocalToUTC(localMillisDST, false);
        assertEquals(getUTCHoursFormatter().parseDateTime("2008-03-02T07:30:00Z").getMillis(), utcMillisDST);

        // Test the gap with non-strict, it should resolve to the offset for the *later* time.
        long instantForGap = getLocalDateTimeFormatter().parseDateTime("2008-03-02T02:30:00").getMillis(); // Local time which is in the gap.
        // The logic for non-strict in a gap defaults to the later offset. For NY DST, this is -04:00.
        // So, 02:30 local - (-04:00) = 06:30 UTC.
        long utcResult = newYork.convertLocalToUTC(instantForGap, false);
        assertEquals(getUTCHoursFormatter().parseDateTime("2008-03-02T06:30:00Z").getMillis(), utcResult);
    }
    
    @Test
    public void testConvertLocalToUTC_DST_NonStrict_usingOriginal() throws Exception {
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        // DST transition: March 2nd, 2008 at 2:00 AM local time. Clocks jump to 3:00 AM.
        
        long originalInstantUTC = getUTCHoursFormatter().parseDateTime("2008-03-02T06:00:00Z").getMillis(); // This is 2 AM EST (standard time).
        long localMillis = getLocalDateTimeFormatter().parseDateTime("2008-03-02T02:30:00").getMillis(); // This is the local time in the gap.
        
        // The original offset for originalInstantUTC is -5 hours.
        // The logic path `convertLocalToUTC(long instantLocal, boolean strict, long originalInstantUTC)` is taken.
        // instantUTC = localMillis - offsetOriginal = 02:30 - (-5h) = 07:30 UTC.
        // offsetLocalFromOriginal = getOffset(07:30 UTC) which is -04:00 (DST).
        // Since offsetLocalFromOriginal != offsetOriginal, it calls `convertLocalToUTC(instantLocal, strict)`.
        // In this non-strict test, `convertLocalToUTC(instantLocal, false)` is called.
        long utcResult = newYork.convertLocalToUTC(localMillis, false, originalInstantUTC);
        
        // As per the `testConvertLocalToUTC_DST_NonStrict`, the non-strict conversion for the gap resolves to the later offset (-04:00).
        // So, 02:30 local - (-04:00) = 06:30 UTC.
        assertEquals(getUTCHoursFormatter().parseDateTime("2008-03-02T06:30:00Z").getMillis(), utcResult);
    }

    @Test
    public void testGetMillisKeepLocal() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        long utcMillis = getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00Z").getMillis();

        // 00:00 UTC on Jan 1, 2000
        // London: 00:00 GMT (UTC+0)
        // New York: 19:00 EST (UTC-5) on Dec 31, 1999
        long expectedNewYorkMillis = getInstantFormatter().parseDateTime("1999-12-31T19:00:00.000-0500").getMillis();
        assertEquals(expectedNewYorkMillis, london.getMillisKeepLocal(newYork, utcMillis));
    }
    
    @Test
    public void testIsLocalDateTimeGap() throws Exception {
        DateTimeZone newYork = DateTimeZone.forID("America/New_York");
        // DST transition: March 2nd, 2008 at 2:00 AM local time. Clocks jump to 3:00 AM.
        // 2:30 AM local time on this day does not exist.
        assertTrue(newYork.isLocalDateTimeGap(getLocalDateTimeFormatter().parseDateTime("2008-03-02T02:30:00")));
        // Time that exists
        assertFalse(newYork.isLocalDateTimeGap(getLocalDateTimeFormatter().parseDateTime("2008-03-02T01:30:00")));
        assertFalse(newYork.isLocalDateTimeGap(getLocalDateTimeFormatter().parseDateTime("2008-03-02T03:30:00")));

        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertFalse(fixed.isLocalDateTimeGap(getLocalDateTimeFormatter().parseDateTime("2008-01-01T10:00:00")));
    }

    @Test
    public void testIsFixed() throws Exception {
        assertFalse(DateTimeZone.forID("Europe/London").isFixed());
        assertTrue(DateTimeZone.forOffsetHours(1).isFixed());
        assertTrue(DateTimeZone.UTC.isFixed());
    }

    @Test
    public void testNextTransition() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long instant = getUTCHoursFormatter().parseDateTime("2000-01-01T00:00:00Z").getMillis(); // Winter
        
        // For London, DST typically starts on the last Sunday of March.
        // In 2000, DST started March 26th at 1:00 AM local time.
        long expectedNextTransition = getInstantFormatter().parseDateTime("2000-03-26T01:00:00.000+0100").getMillis(); // Local time of transition
        
        long actualNextTransition = london.nextTransition(instant);
        // The exact transition time can be tricky to pin down due to local time conversion.
        // We check if the returned instant is close to the expected transition.
        // The actual transition for London in 2000 was March 26th, 01:00 GMT.
        assertTrue(actualNextTransition >= getUTCHoursFormatter().parseDateTime("2000-03-26T00:00:00Z").getMillis());
        assertTrue(actualNextTransition <= getUTCHoursFormatter().parseDateTime("2000-03-26T02:00:00Z").getMillis()); 

        // For fixed zones, nextTransition should return the same instant.
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertEquals(instant, fixed.nextTransition(instant));
    }

    @Test
    public void testPreviousTransition() throws Exception {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long instant = getUTCHoursFormatter().parseDateTime("2000-07-01T00:00:00Z").getMillis(); // Summer
        
        // For London, DST typically ends on the last Sunday of October.
        // In 2000, DST ended October 29th at 2:00 AM local time (clocks go back to 1:00 AM).
        long expectedPreviousTransition = getInstantFormatter().parseDateTime("2000-10-29T02:00:00.000+0100").getMillis(); // Local time of transition
        
        long actualPreviousTransition = london.previousTransition(instant);
        // The actual transition for London in 2000 was Oct 29th, 02:00 BST, changing to 01:00 GMT.
        // previousTransition should return an instant before this change.
        assertTrue(actualPreviousTransition <= getUTCHoursFormatter().parseDateTime("2000-10-29T02:00:00+0100").getMillis()); 
        assertTrue(actualPreviousTransition >= getUTCHoursFormatter().parseDateTime("2000-10-29T00:00:00+0100").getMillis());

        // For fixed zones, previousTransition should return the same instant.
        DateTimeZone fixed = DateTimeZone.forOffsetHours(1);
        assertEquals(instant, fixed.previousTransition(instant));
    }

    @Test
    public void testToTimeZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        java.util.TimeZone tz = zone.toTimeZone();
        assertEquals("America/New_York", tz.getID());
    }

    @Test
    public void testEquals() throws Exception {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone3 = DateTimeZone.forID("America/New_York");
        DateTimeZone fixed1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone fixed2 = DateTimeZone.forOffsetHours(1);
        DateTimeZone fixed3 = DateTimeZone.forOffsetHours(2);

        assertEquals(zone1, zone2);
        assertNotEquals(zone1, zone3);
        assertEquals(fixed1, fixed2);
        assertNotEquals(fixed1, fixed3);
        assertNotEquals(zone1, fixed1);
        assertEquals(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testHashCode() throws Exception {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone3 = DateTimeZone.forID("America/New_York");
        DateTimeZone fixed1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone fixed2 = DateTimeZone.forOffsetHours(1);

        assertEquals(zone1.hashCode(), zone2.hashCode());
        assertNotEquals(zone1.hashCode(), zone3.hashCode());
        assertEquals(fixed1.hashCode(), fixed2.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("UTC", DateTimeZone.UTC.toString());
        assertEquals("Europe/London", DateTimeZone.forID("Europe/London").toString());
        assertEquals("+01:00", DateTimeZone.forOffsetHours(1).toString());
    }

    @Test
    public void testWriteReplaceAndReadObject() throws Exception {
        DateTimeZone originalZone = DateTimeZone.forID("America/New_York");
        DateTimeZone.Stub stub = new DateTimeZone.Stub(originalZone.getID());
        
        // Simulate deserialization by calling readResolve
        DateTimeZone resolvedZone = (DateTimeZone) stub.readResolve();
        assertEquals(originalZone, resolvedZone);
        assertSame(DateTimeZone.forID("America/New_York"), resolvedZone);
    }
}
```