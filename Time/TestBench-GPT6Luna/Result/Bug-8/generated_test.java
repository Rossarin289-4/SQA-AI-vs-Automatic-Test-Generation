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
    public void testUtcIDAndString() throws Exception {
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testHoursOffsetEdges() throws Exception {
        assertEquals("-23:00", DateTimeZone.forOffsetHours(-23).getID());
        assertEquals("+23:00", DateTimeZone.forOffsetHours(23).getID());
    }

    @Test
    public void testHoursOffsetBelowRange() throws Exception {
        try { DateTimeZone.forOffsetHours(-24); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testHoursOffsetAboveRange() throws Exception {
        try { DateTimeZone.forOffsetHours(24); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCombinedPositiveOffset() throws Exception {
        assertEquals("+02:15", DateTimeZone.forOffsetHoursMinutes(2, 15).getID());
    }

    @Test
    public void testCombinedNegativeOffset() throws Exception {
        assertEquals("-02:15", DateTimeZone.forOffsetHoursMinutes(-2, -15).getID());
    }

    @Test
    public void testMinuteRangeEdges() throws Exception {
        assertEquals("+00:59", DateTimeZone.forOffsetHoursMinutes(0, 59).getID());
        assertEquals("-00:59", DateTimeZone.forOffsetHoursMinutes(0, -59).getID());
    }

    @Test
    public void testMinutesOutsideRange() throws Exception {
        try { DateTimeZone.forOffsetHoursMinutes(0, 60); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOpposingSignsRejected() throws Exception {
        try { DateTimeZone.forOffsetHoursMinutes(1, -1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testZeroOffsetCanonicalUtc() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testMillisecondOffsetLimit() throws Exception {
        assertEquals("+23:59:59.999", DateTimeZone.forOffsetMillis(86399999).getID());
        assertEquals("-23:59:59.999", DateTimeZone.forOffsetMillis(-86399999).getID());
    }

    @Test
    public void testMillisecondOffsetOutsideLimit() throws Exception {
        try { DateTimeZone.forOffsetMillis(86400000); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testForIdUtc() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForIdFixedOffset() throws Exception {
        assertEquals("+03:30", DateTimeZone.forID("+03:30").getID());
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testUnknownIdRejected() throws Exception {
        try { DateTimeZone.forID("not-a-zone"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAvailableIDsContainUtc() throws Exception {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testDefaultCanBeSetAndRead() throws Exception {
        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.getDefault());
        DateTimeZone.setDefault(original);
    }

    @Test
    public void testNullDefaultRejected() throws Exception {
        try { DateTimeZone.setDefault(null); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFixedZoneOffsetsAndStatus() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("Test/Zone", null, 3600000, 3600000);
        assertEquals(3600000, zone.getOffset(0L));
        assertEquals(3600000, zone.getStandardOffset(0L));
        assertTrue(zone.isStandardOffset(0L));
    }

    @Test
    public void testFixedZoneLocalOffsetConversion() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("Test/Zone", null, -3600000, -3600000);
        assertEquals(-3600000, zone.getOffsetFromLocal(123L));
    }

    @Test
    public void testUtcToLocalAndBackToTimeZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7200123L, zone.convertUTCToLocal(123L));
        assertEquals("GMT+02:00", zone.toTimeZone().getID());
    }

    @Test
    public void testLocalToUtcWithOriginalOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(123L, zone.convertLocalToUTC(7200123L, true, 123L));
    }

    @Test
    public void testKeepLocalWithSameZone() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals(123456L, zone.getMillisKeepLocal(zone, 123456L));
    }

    @Test
    public void testFixedZoneTransitionsAndAdjustment() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("Test/Zone", null, 0, 0);
        assertTrue(zone.isFixed());
        assertEquals(100L, zone.nextTransition(100L));
        assertEquals(100L, zone.previousTransition(100L));
        assertEquals(100L, zone.adjustOffset(100L, true));
    }

    @Test
    public void testFixedZoneNameAndHash() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("Test/Zone", null, 0, 0);
        assertNull(zone.getNameKey(0L));
        assertEquals(57 + zone.getID().hashCode(), zone.hashCode());
    }

    @Test
    public void testFixedZoneNoGap() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testForTimeZoneUTC() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZoneFixedGMTOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+02:30"));
        assertEquals("+02:30", zone.getID());
        assertEquals(9000000, zone.getOffset(0L));
    }

    @Test
    public void testProviderGetterReturnsConfiguredProvider() throws Exception {
        Provider provider = DateTimeZone.getProvider();
        assertNotNull(provider);
        assertTrue(provider.getAvailableIDs().contains("UTC"));
        assertSame(DateTimeZone.UTC, provider.getZone("UTC"));
    }

    @Test
    public void testSettingNullProviderRestoresDefaultProvider() throws Exception {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        assertSame(DateTimeZone.UTC, DateTimeZone.getProvider().getZone("UTC"));
    }

    @Test
    public void testNameProviderGetter() throws Exception {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSettingNullNameProviderRestoresDefault() throws Exception {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testChronologyZoneAccessors() throws Exception {
        Chronology chronology = new BaseChronology() {
            public DateTimeZone getZone() { return DateTimeZone.UTC; }
            public Chronology withUTC() { return this; }
            public Chronology withZone(DateTimeZone zone) { return this; }
            public String toString() { return "test"; }
        };
        assertSame(DateTimeZone.UTC, chronology.getZone());
        assertSame(chronology, chronology.withUTC());
        assertSame(chronology, chronology.withZone(DateTimeZone.forOffsetHours(1)));
    }

    @Test
    public void testShortAndLongNamesUseIDWhenNameKeyIsNull() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("Named/Fixed", null, 0, 0);
        assertEquals("Named/Fixed", zone.getShortName(0L));
        assertEquals("Named/Fixed", zone.getName(0L));
    }

    @Test
    public void testEqualsAndHashForEqualFixedZones() throws Exception {
        DateTimeZone first = new FixedDateTimeZone("Equal/Zone", null, 1000, 1000);
        DateTimeZone second = new FixedDateTimeZone("Equal/Zone", null, 1000, 1000);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEqualsDistinguishesDifferentOffsets() throws Exception {
        DateTimeZone first = new FixedDateTimeZone("Compare/Zone", null, 1000, 1000);
        DateTimeZone second = new FixedDateTimeZone("Compare/Zone", null, 2000, 2000);
        assertFalse(first.equals(second));
    }
}
