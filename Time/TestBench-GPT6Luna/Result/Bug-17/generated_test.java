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
    public void testUtcIdentityAndId() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testUnknownIdRejected() throws Exception {
        try {
            DateTimeZone.forID("not-a-zone");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNullIdUsesDefault() throws Exception {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testPositiveOffsetHours() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals("+05:00", zone.getID());
        assertEquals(18000000, zone.getOffset(0L));
        assertTrue(zone.isFixed());
    }

    @Test
    public void testNegativeOffsetHours() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals("-05:00", zone.getID());
        assertEquals(-18000000, zone.getOffset(0L));
    }

    @Test
    public void testHourMinuteOffsetAndNegativeSign() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
        assertEquals(-9000000, zone.getOffset(0L));
    }

    @Test
    public void testMinuteOffsetZeroReturnsUtc() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testMinuteOffsetAtUpperBound() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 59);
        assertEquals("+00:59", zone.getID());
        assertEquals(3540000, zone.getOffset(0L));
    }

    @Test
    public void testMinuteOffsetBelowRangeRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(0, -1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMinuteOffsetAboveRangeRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(0, 60);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOffsetHoursAtSupportedLimit() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(23);
        assertEquals("+23:00", zone.getID());
        assertEquals(82800000, zone.getOffset(0L));
    }

    @Test
    public void testOffsetMillisIncludesSecondsAndMillis() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(1234567);
        assertEquals("+00:20:34.567", zone.getID());
        assertEquals(1234567, zone.getOffset(0L));
    }

    @Test
    public void testForTimeZoneUtc() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testAvailableIdsIncludeUtc() throws Exception {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        assertSame(DateTimeZone.getProvider(), DateTimeZone.getProvider());
    }

    @Test
    public void testNameProviderPresent() throws Exception {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testFixedZoneNameAndOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals("+02:00", zone.getShortName(0L));
        assertEquals("+02:00", zone.getName(0L));
    }

    @Test
    public void testStandardOffsetForFixedZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-3);
        assertEquals(-10800000, zone.getStandardOffset(0L));
        assertTrue(zone.isStandardOffset(0L));
    }

    @Test
    public void testOffsetFromLocalForFixedZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000, zone.getOffsetFromLocal(10000L));
    }

    @Test
    public void testConvertUtcToLocal() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7201000L, zone.convertUTCToLocal(1000L));
    }

    @Test
    public void testConvertLocalToUtcWithOriginalOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(1000L, zone.convertLocalToUTC(7201000L, false, 1000L));
    }

    @Test
    public void testKeepLocalWithSameZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(1234L, zone.getMillisKeepLocal(zone, 1234L));
    }

    @Test
    public void testFixedZoneHasNoLocalGap() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2020, 1, 2, 3, 4)));
    }

    @Test
    public void testAdjustOffsetForFixedZoneIsUnchanged() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(123456L, zone.adjustOffset(123456L, true));
        assertEquals(123456L, zone.adjustOffset(123456L, false));
    }

    @Test
    public void testFixedZoneTransitionsAreUnchanged() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(123L, zone.nextTransition(123L));
        assertEquals(123L, zone.previousTransition(123L));
    }

    @Test
    public void testTimeZoneAndHashCode() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals("UTC", DateTimeZone.UTC.toTimeZone().getID());
        assertEquals(57 + "+02:00".hashCode(), zone.hashCode());
    }

    @Test
    public void testOffsetTextRoundTrip() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("-03:15");
        assertEquals("-03:15", zone.getID());
        assertEquals(-11700000, zone.getOffset(0L));
    }

    @Test
    public void testSetDefaultChangesDefaultAndNullIsRejected() throws Exception {
        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone selected = DateTimeZone.forOffsetHours(4);
        try {
            DateTimeZone.setDefault(selected);
            assertSame(selected, DateTimeZone.getDefault());
            assertSame(selected, DateTimeZone.forID(null));
            try {
                DateTimeZone.setDefault(null);
                fail("expected IllegalArgumentException");
            } catch (IllegalArgumentException expected) { }
            assertSame(selected, DateTimeZone.getDefault());
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void testSetProviderNullRestoresDefaultProvider() throws Exception {
        Provider before = DateTimeZone.getProvider();
        try {
            DateTimeZone.setProvider(null);
            assertNotNull(DateTimeZone.getProvider());
            assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
            assertEquals(DateTimeZone.UTC, DateTimeZone.getProvider().getZone("UTC"));
        } finally {
            DateTimeZone.setProvider(before);
        }
    }

    @Test
    public void testSetNameProviderNullRestoresProvider() throws Exception {
        NameProvider before = DateTimeZone.getNameProvider();
        try {
            DateTimeZone.setNameProvider(null);
            assertNotNull(DateTimeZone.getNameProvider());
            assertEquals("+02:00", DateTimeZone.forOffsetHours(2).getShortName(0L));
        } finally {
            DateTimeZone.setNameProvider(before);
        }
    }

    @Test
    public void testFixedZoneNameKeyIsNull() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertNull(zone.getNameKey(0L));
    }

    @Test
    public void testFixedZoneEqualityAndUnequalId() throws Exception {
        DateTimeZone first = DateTimeZone.forOffsetHours(2);
        DateTimeZone same = DateTimeZone.forOffsetHours(2);
        DateTimeZone different = DateTimeZone.forOffsetHours(3);
        assertEquals(first, same);
        assertEquals(first.hashCode(), same.hashCode());
        assertFalse(first.equals(different));
        assertFalse(first.equals(null));
    }
}
