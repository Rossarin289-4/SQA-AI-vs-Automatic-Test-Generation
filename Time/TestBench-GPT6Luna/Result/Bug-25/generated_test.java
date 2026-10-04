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
    public void testUTCIdentifierAndZeroOffset() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testOffsetHoursPositiveAndNegative() throws Exception {
        assertEquals("+05:00", DateTimeZone.forOffsetHours(5).getID());
        assertEquals("-05:00", DateTimeZone.forOffsetHours(-5).getID());
    }

    @Test
    public void testHoursMinutesOffsetSignAndCarry() throws Exception {
        assertEquals("-02:30", DateTimeZone.forOffsetHoursMinutes(-2, 30).getID());
        assertEquals("+02:30", DateTimeZone.forOffsetHoursMinutes(2, 30).getID());
    }

    @Test
    public void testMinuteBoundaries() throws Exception {
        assertEquals("+01:00", DateTimeZone.forOffsetHoursMinutes(1, 0).getID());
        assertEquals("+01:59", DateTimeZone.forOffsetHoursMinutes(1, 59).getID());
    }

    @Test
    public void testInvalidMinutes() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, -1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOffsetMillisIncludesSecondsAndMillis() throws Exception {
        assertEquals("+00:00:01.234", DateTimeZone.forOffsetMillis(1234).getID());
        assertEquals("-00:00:01.234", DateTimeZone.forOffsetMillis(-1234).getID());
    }

    @Test
    public void testOffsetMillisZero() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testParsePositiveAndNegativeOffsetIDs() throws Exception {
        assertEquals("+02:30", DateTimeZone.forID("+02:30").getID());
        assertEquals("-02:30", DateTimeZone.forID("-02:30").getID());
    }

    @Test
    public void testParseZeroOffsetIDReturnsUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testUnknownIDRejected() throws Exception {
        try {
            DateTimeZone.forID("No/Such_Zone");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFixedZoneOffsetAndStandardOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(3, 15);
        assertEquals(11700000, zone.getOffset(0L));
        assertEquals(11700000, zone.getStandardOffset(0L));
    }

    @Test
    public void testFixedZoneIsStandardAndFixed() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-4);
        assertTrue(zone.isFixed());
        assertTrue(zone.isStandardOffset(123L));
    }

    @Test
    public void testFixedZoneTransitionsDoNotChange() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(123L, zone.nextTransition(123L));
        assertEquals(123L, zone.previousTransition(123L));
    }

    @Test
    public void testUTCToLocalConversion() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals(9300000L, zone.convertUTCToLocal(300000L));
    }

    @Test
    public void testLocalToUTCConversionWithOriginalOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(2, 30);
        assertEquals(-8700000L, zone.convertLocalToUTC(300000L, false, 0L));
    }

    @Test
    public void testLocalOffsetConversionForFixedZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-3, 30);
        assertEquals(-12600000, zone.getOffsetFromLocal(123456L));
    }

    @Test
    public void testKeepLocalSameZoneReturnsOriginalInstant() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(4);
        assertEquals(-123456L, zone.getMillisKeepLocal(zone, -123456L));
    }

    @Test
    public void testKeepLocalAcrossFixedZones() throws Exception {
        DateTimeZone source = DateTimeZone.forOffsetHours(2);
        DateTimeZone target = DateTimeZone.forOffsetHours(-3);
        assertEquals(18000000L, source.getMillisKeepLocal(target, 0L));
    }

    @Test
    public void testFixedZoneIsNotLocalDateTimeGap() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        LocalDateTime local = new LocalDateTime(2000, 1, 1, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(local));
    }

    @Test
    public void testFixedZoneIdentityAndHashCode() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals(zone.getID(), zone.toString());
        assertEquals(57 + " +03:00".hashCode(), zone.hashCode());
    }

    @Test
    public void testAvailableIDsContainUTC() throws Exception {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testProviderSuppliesUTC() throws Exception {
        assertEquals(DateTimeZone.UTC, DateTimeZone.getProvider().getZone("UTC"));
    }

    @Test
    public void testTimeZoneUTCConversion() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testDefaultAndExplicitDefault() throws Exception {
        DateTimeZone original = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.UTC);
            assertSame(DateTimeZone.UTC, DateTimeZone.getDefault());
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void testNameProviderGetterAndReset() throws Exception {
        NameProvider original = DateTimeZone.getNameProvider();
        try {
            DateTimeZone.setNameProvider(null);
            assertNotNull(DateTimeZone.getNameProvider());
        } finally {
            DateTimeZone.setNameProvider(original);
        }
    }

    @Test
    public void testSetProviderToDefaultAndUTCLookup() throws Exception {
        Provider original = DateTimeZone.getProvider();
        try {
            DateTimeZone.setProvider(null);
            assertEquals(DateTimeZone.UTC, DateTimeZone.getProvider().getZone("UTC"));
        } finally {
            DateTimeZone.setProvider(original);
        }
    }

    @Test
    public void testFixedZoneNameKeyAndDisplayNames() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", "KEY", 3600000, 3600000);
        assertEquals("KEY", zone.getNameKey(0L));
        assertEquals("+01:00", zone.getShortName(0L, Locale.US));
        assertEquals("+01:00", zone.getName(0L, Locale.US));
    }

    @Test
    public void testFixedZoneDisplayNamesUseOffsetWhenKeyIsNull() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, -3600000, -3600000);
        assertNull(zone.getNameKey(0L));
        assertEquals("X", zone.getShortName(0L, Locale.US));
        assertEquals("X", zone.getName(0L, Locale.US));
    }

    @Test
    public void testFixedZoneToTimeZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals("GMT" + zone.getID(), zone.toTimeZone().getID());
    }

    @Test
    public void testEqualFixedZonesCompareEqual() throws Exception {
        DateTimeZone first = new FixedDateTimeZone("X", "KEY", 3600000, 3600000);
        DateTimeZone second = new FixedDateTimeZone("X", "KEY", 3600000, 3600000);
        assertTrue(first.equals(second));
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testDifferentFixedZoneIdsCompareUnequal() throws Exception {
        DateTimeZone first = new FixedDateTimeZone("X", null, 0, 0);
        DateTimeZone second = new FixedDateTimeZone("Y", null, 0, 0);
        assertFalse(first.equals(second));
        assertFalse(first.equals(null));
    }

    @Test
    public void testUTCProviderResetKeepsUTCAvailable() throws Exception {
        DateTimeZone.setProvider(new UTCProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testSetNameProviderNullUsesDefaultProvider() throws Exception {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
        assertEquals("+00:00", DateTimeZone.UTC.getName(0L, Locale.US));
    }
}
