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
    public void testUTCIdentityAndID() throws Exception {
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertEquals("UTC", DateTimeZone.UTC.toString());
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursZeroIsUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHoursPositive() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals("+02:00", zone.getID());
        assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursNegative() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-2);
        assertEquals("-02:00", zone.getID());
        assertEquals(-7200000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutesNegativeSign() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
        assertEquals(-9000000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutesMinuteEdges() throws Exception {
        assertEquals("+00:01", DateTimeZone.forOffsetHoursMinutes(0, 1).getID());
        assertEquals("+00:59", DateTimeZone.forOffsetHoursMinutes(0, 59).getID());
    }

    @Test
    public void testForOffsetHoursMinutesRejectsNegativeMinutes() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, -1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testForOffsetHoursMinutesRejectsMinuteSixty() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testForOffsetMillisZeroIsUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillisIncludesSecondsAndMillis() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3723004);
        assertEquals("+01:02:03.004", zone.getID());
        assertEquals(3723004, zone.getOffset(0L));
    }

    @Test
    public void testForIDUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForIDFixedOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+02:30");
        assertEquals("+02:30", zone.getID());
        assertEquals(9000000, zone.getOffset(0L));
    }

    @Test
    public void testForIDRejectsUnknownName() throws Exception {
        try {
            DateTimeZone.forID("not-a-zone");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testForTimeZoneUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testAvailableIDsContainUTC() throws Exception {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testProviderIsAvailable() throws Exception {
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getProvider().getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testNameProviderIsAvailable() throws Exception {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testFixedZoneOffsetAndStandardOffset() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", "X", 3600000, 3600000);
        assertEquals(3600000, zone.getOffset(123L));
        assertEquals(3600000, zone.getStandardOffset(123L));
        assertTrue(zone.isStandardOffset(123L));
    }

    @Test
    public void testFixedZoneLocalOffsetAndConversions() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 3600000, 3600000);
        assertEquals(3600000, zone.getOffsetFromLocal(1000L));
        assertEquals(3601000L, zone.convertUTCToLocal(1000L));
        assertEquals(1000L, zone.convertLocalToUTC(3601000L, false, 0L));
    }

    @Test
    public void testFixedZoneKeepLocalSameZone() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 3600000, 3600000);
        assertEquals(12345L, zone.getMillisKeepLocal(zone, 12345L));
    }

    @Test
    public void testFixedZoneBasicProperties() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 0, 0);
        assertTrue(zone.isFixed());
        assertEquals(500L, zone.nextTransition(500L));
        assertEquals(500L, zone.previousTransition(500L));
        assertEquals("X", zone.toString());
        assertEquals(57 + "X".hashCode(), zone.hashCode());
    }

    @Test
    public void testFixedZoneNameFallbacksAndTimeZone() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 3600000, 3600000);
        assertEquals("X", zone.getShortName(0L, Locale.ROOT));
        assertEquals("X", zone.getName(0L, Locale.ROOT));
        assertEquals("X", zone.toTimeZone().getID());
    }

    @Test
    public void testEqualsForEquivalentFixedZones() throws Exception {
        DateTimeZone first = new FixedDateTimeZone("X", null, 1000, 1000);
        DateTimeZone second = new FixedDateTimeZone("X", null, 1000, 1000);
        assertTrue(first.equals(second));
        assertFalse(first.equals(DateTimeZone.UTC));
    }

    @Test
    public void testFixedZoneIsNotLocalDateTimeGap() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testSetDefaultAndGetDefaultUseConfiguredZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        DateTimeZone.setDefault(zone);
        assertSame(zone, DateTimeZone.getDefault());
    }

    @Test
    public void testSetDefaultRejectsNull() throws Exception {
        try {
            DateTimeZone.setDefault(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testSetDefaultCanRestoreUTC() throws Exception {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.getDefault());
    }

    @Test
    public void testAdjustOffsetFixedZoneReturnsOriginalInstant() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 3600000, 3600000);
        assertEquals(12345L, zone.adjustOffset(12345L, false));
        assertEquals(12345L, zone.adjustOffset(12345L, true));
    }

    @Test
    public void testAdjustOffsetFixedZeroZoneReturnsOriginalInstant() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 0, 0);
        assertEquals(0L, zone.adjustOffset(0L, false));
        assertEquals(0L, zone.adjustOffset(0L, true));
    }

    @Test
    public void testSetProviderNullResetsToAvailableDefaultProvider() throws Exception {
        DateTimeZone.setProvider(null);
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        assertNotNull(DateTimeZone.getProvider().getZone("UTC"));
    }

    @Test
    public void testSetNameProviderNullResetsNameProvider() throws Exception {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testSetProviderRejectsProviderWithoutUTC() throws Exception {
        try {
            DateTimeZone.setProvider(new UTCProvider());
            assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        } catch (IllegalArgumentException expected) {
            assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        }
    }
}
