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
    public void testUTCIdentityAndId() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    @Test
    public void testFixedZeroOffset() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testPositiveHourOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals("+01:00", zone.getID());
        assertEquals(3600000, zone.getOffset(0));
    }

    @Test
    public void testNegativeHourOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-1);
        assertEquals("-01:00", zone.getID());
        assertEquals(-3600000, zone.getOffset(0));
    }

    @Test
    public void testHoursMinutesCombinedSign() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
        assertEquals(-9000000, zone.getOffset(0));
    }

    @Test
    public void testMinuteLowerBoundary() throws Exception {
        assertEquals("+01:00", DateTimeZone.forOffsetHoursMinutes(1, 0).getID());
    }

    @Test
    public void testMinuteUpperBoundary() throws Exception {
        assertEquals("+01:59", DateTimeZone.forOffsetHoursMinutes(1, 59).getID());
    }

    @Test
    public void testMinuteBelowRangeRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, -1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMinuteAboveRangeRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testHourOffsetOutOfRangeRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHours(Integer.MAX_VALUE);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMillisOffsetIncludesSecondsAndMillis() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3723004);
        assertEquals("+01:02:03.004", zone.getID());
        assertEquals(3723004, zone.getOffset(0));
    }

    @Test
    public void testIDOffsetParsing() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("-02:30");
        assertEquals("-02:30", zone.getID());
        assertEquals(-9000000, zone.getOffset(0));
    }

    @Test
    public void testZeroIDOffsetMapsToUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
    }

    @Test
    public void testUnknownIDRejected() throws Exception {
        try {
            DateTimeZone.forID("No/Such_Zone");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testStandardOffsetAndFixedState() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 1234, 567);
        assertEquals(1234, zone.getOffset(0));
        assertEquals(567, zone.getStandardOffset(0));
        assertFalse(zone.isStandardOffset(0));
        assertTrue(zone.isFixed());
    }

    @Test
    public void testStandardOffsetMatchesWallOffset() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 1234, 1234);
        assertTrue(zone.isStandardOffset(Long.MIN_VALUE));
    }

    @Test
    public void testUTCToLocalAddsOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(60000);
        assertEquals(1060000L, zone.convertUTCToLocal(1000000L));
    }

    @Test
    public void testLocalToUTCUsesFixedOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(60000);
        assertEquals(940000L, zone.convertLocalToUTC(1000000L, true, 0L));
    }

    @Test
    public void testKeepLocalWithSameZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(123456L, zone.getMillisKeepLocal(zone, 123456L));
    }

    @Test
    public void testKeepLocalAcrossFixedZones() throws Exception {
        DateTimeZone east = DateTimeZone.forOffsetHours(2);
        DateTimeZone west = DateTimeZone.forOffsetHours(-3);
        assertEquals(18000000L, east.getMillisKeepLocal(west, 0L));
    }

    @Test
    public void testGapFalseForFixedZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testFixedZoneTransitionsReturnInput() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(1000);
        assertEquals(12345L, zone.nextTransition(12345L));
        assertEquals(12345L, zone.previousTransition(12345L));
    }

    @Test
    public void testTimeZoneConversionUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
        assertEquals("UTC", DateTimeZone.UTC.toTimeZone().getID());
    }

    @Test
    public void testIDStringAndHashCode() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 1);
        assertEquals("+00:01", zone.toString());
        assertEquals(57 + zone.getID().hashCode(), zone.hashCode());
    }

    @Test
    public void testAvailableIDsContainUTC() throws Exception {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testProviderAndNameProviderAvailable() throws Exception {
        assertNotNull(DateTimeZone.getProvider());
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testDefaultZoneCanBeSetAndRetrieved() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        DateTimeZone.setDefault(zone);
        assertSame(zone, DateTimeZone.getDefault());
    }

    @Test
    public void testSettingNullDefaultRejected() throws Exception {
        try {
            DateTimeZone.setDefault(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetProviderNullRestoresDefaultProvider() throws Exception {
        DateTimeZone.setProvider(null);
        assertSame(DateTimeZone.getProvider().getZone("UTC"), DateTimeZone.UTC);
    }

    @Test
    public void testSetNameProviderNullRestoresDefaultNameProvider() throws Exception {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testFixedZoneLocalOffsetMatchesItsOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7200000, zone.getOffsetFromLocal(10000000L));
    }

    @Test
    public void testFixedZoneLocalOffsetNegative() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-3);
        assertEquals(-10800000, zone.getOffsetFromLocal(-10000000L));
    }

    @Test
    public void testFixedZoneAdjustOffsetReturnsInstantForEitherChoice() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(123456L, zone.adjustOffset(123456L, false));
        assertEquals(123456L, zone.adjustOffset(123456L, true));
    }

    @Test
    public void testFixedZoneNameKeyIsAbsentAndNamesUseId() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertNull(zone.getNameKey(0L));
        assertEquals("+01:00", zone.getShortName(0L));
        assertEquals("+01:00", zone.getName(0L));
    }

    @Test
    public void testFixedZoneEqualityAndUnequalID() throws Exception {
        DateTimeZone first = DateTimeZone.forOffsetHours(1);
        DateTimeZone same = DateTimeZone.forOffsetHours(1);
        DateTimeZone different = DateTimeZone.forOffsetHours(2);
        assertTrue(first.equals(same));
        assertFalse(first.equals(different));
    }
}
