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

public class ZonedChronologyTest {
    @Test
    public void testConstructionZoneAndUtcBase() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        ZonedChronology zoned = ZonedChronology.getInstance(base, zone);
        assertSame(zone, zoned.getZone());
        assertSame(base, zoned.withUTC());
    }

    @Test
    public void testNullBaseRejected() throws Exception {
        try {
            ZonedChronology.getInstance(null, DateTimeZone.UTC);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNullZoneRejected() throws Exception {
        try {
            ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithZoneIdentityAndUtc() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        ZonedChronology zoned = ZonedChronology.getInstance(base, zone);
        assertSame(zoned, zoned.withZone(zone));
        assertSame(base, zoned.withZone(DateTimeZone.UTC));
    }

    @Test
    public void testWithZoneDifferentZone() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(1));
        Chronology changed = zoned.withZone(DateTimeZone.forOffsetHours(2));
        assertEquals(DateTimeZone.forOffsetHours(2), changed.getZone());
        assertEquals(base, changed.withUTC());
    }

    @Test
    public void testWithZoneNullUsesDefault() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(1));
        Chronology changed = zoned.withZone(null);
        assertEquals(DateTimeZone.getDefault(), changed.getZone());
    }

    @Test
    public void testGetDateTimeMillisUsesLocalOffset() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        ZonedChronology zoned = ZonedChronology.getInstance(base, zone);
        long expected = base.getDateTimeMillis(2000, 1, 2, 0) - 2L * DateTimeConstants.MILLIS_PER_HOUR;
        assertEquals(expected, zoned.getDateTimeMillis(2000, 1, 2, 0));
    }

    @Test
    public void testEqualityAndHashCode() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        ZonedChronology first = ZonedChronology.getInstance(base, zone);
        ZonedChronology second = ZonedChronology.getInstance(base, zone);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
        assertFalse(first.equals(base));
    }

    @Test
    public void testToStringIncludesBaseAndZone() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(2));
        assertEquals("ZonedChronology[" + base + ", +02:00]", zoned.toString());
    }

    @Test
    public void testZonedDurationFieldUnitAndPrecision() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(2));
        assertEquals(1000L, zoned.seconds().getUnitMillis());
        assertTrue(zoned.seconds().isPrecise());
    }

    @Test
    public void testZonedDurationAddAndDifference() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(2));
        long start = 0L;
        long end = zoned.seconds().add(start, 3);
        assertEquals(3000L, end);
        assertEquals(3, zoned.seconds().getDifference(end, start));
        assertEquals(3L, zoned.seconds().getDifferenceAsLong(end, start));
    }

    @Test
    public void testZonedDurationValueAndMillis() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(2));
        assertEquals(3, zoned.seconds().getValue(3000L, 0L));
        assertEquals(3L, zoned.seconds().getValueAsLong(3000L, 0L));
        assertEquals(3000L, zoned.seconds().getMillis(3, 0L));
    }

    @Test
    public void testDateTimeFieldReadsLocalHour() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(2));
        assertEquals(2, zoned.hourOfDay().get(0L));
    }

    @Test
    public void testDateTimeFieldAddAndWrap() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR,
                     zoned.hourOfDay().add(0L, 2));
        assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR,
                     zoned.hourOfDay().addWrapField(23L * DateTimeConstants.MILLIS_PER_HOUR, 2));
    }

    @Test
    public void testDateTimeFieldSetAndMinimumMaximum() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        DateTimeField hour = zoned.hourOfDay();
        long set = hour.set(0L, 5);
        assertEquals(5, hour.get(set));
        assertEquals(0, hour.getMinimumValue());
        assertEquals(23, hour.getMaximumValue());
    }

    @Test
    public void testDateTimeFieldRoundingAndRemainder() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        DateTimeField hour = zoned.hourOfDay();
        long instant = 5L * DateTimeConstants.MILLIS_PER_HOUR + 1234L;
        assertEquals(5L * DateTimeConstants.MILLIS_PER_HOUR, hour.roundFloor(instant));
        assertEquals(6L * DateTimeConstants.MILLIS_PER_HOUR, hour.roundCeiling(instant));
        assertEquals(1234L, hour.remainder(instant));
    }

    @Test
    public void testDateTimeFieldMetadataAndText() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        DateTimeField hour = zoned.hourOfDay();
        assertTrue(hour.isSupported());
        assertEquals("5", hour.getAsText(5L * DateTimeConstants.MILLIS_PER_HOUR, Locale.US));
        assertEquals(hour.getDurationField(), hour.getDurationField());
    }

    @Test
    public void testNonUtcZonedHourSetPreservesLocalValue() throws Exception {
        Chronology base = ISOChronology.getInstanceUTC();
        Chronology zoned = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(2));
        DateTimeField hour = zoned.hourOfDay();
        long result = hour.set(0L, 5);
        assertEquals(5, hour.get(result));
        assertEquals(3L * DateTimeConstants.MILLIS_PER_HOUR, result);
    }

    @Test
    public void testDateTimeFieldLeniencyShortTextAndRangeDuration() throws Exception {
        Chronology zoned = ZonedChronology.getInstance(
            ISOChronology.getInstanceUTC(), DateTimeZone.UTC);
        DateTimeField hour = zoned.hourOfDay();
        assertFalse(hour.isLenient());
        assertEquals("5", hour.getAsShortText(5L * DateTimeConstants.MILLIS_PER_HOUR, Locale.US));
        assertEquals(24, hour.getRangeDurationField().getUnitMillis()
                     / DateTimeConstants.MILLIS_PER_HOUR);
    }

    @Test
    public void testDateTimeFieldLeapAndLeapDuration() throws Exception {
        Chronology zoned = ZonedChronology.getInstance(
            ISOChronology.getInstanceUTC(), DateTimeZone.UTC);
        DateTimeField day = zoned.dayOfYear();
        assertFalse(day.isLeap(0L));
        assertEquals(0, day.getLeapAmount(0L));
        assertNull(day.getLeapDurationField());
    }

    @Test
    public void testDateTimeFieldTextLengthMetadata() throws Exception {
        Chronology zoned = ZonedChronology.getInstance(
            ISOChronology.getInstanceUTC(), DateTimeZone.UTC);
        DateTimeField hour = zoned.hourOfDay();
        assertEquals(2, hour.getMaximumTextLength(Locale.US));
        assertEquals(2, hour.getMaximumShortTextLength(Locale.US));
    }

    @Test
    public void testZoneFixedOffsetAndConversionEdges() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertEquals("-02:30", zone.getID());
        assertEquals(-9000000, zone.getOffset(0L));
        assertEquals(-9000000, zone.getStandardOffset(0L));
        assertTrue(zone.isFixed());
        assertTrue(zone.isStandardOffset(0L));
        assertEquals(-9000000L, zone.convertUTCToLocal(0L));
        assertEquals(0L, zone.convertLocalToUTC(-9000000L, true, 0L));
        assertEquals(0L, zone.nextTransition(0L));
    }

    @Test
    public void testZoneFactoryBoundariesAndTimeZoneConversion() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
        assertEquals("+23:59", DateTimeZone.forOffsetHoursMinutes(23, 59).getID());
        assertEquals("+00:00:01", DateTimeZone.forOffsetMillis(1000).getID());
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
        try {
            DateTimeZone.forOffsetHoursMinutes(0, 60);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testZoneDefaultAndProviderAccessors() throws Exception {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(defaultZone.getID(), DateTimeZone.forID(defaultZone.getID()).getID());
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testZoneLocalOffsetAndKeepLocalConversions() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7200000, zone.getOffsetFromLocal(0L));
        assertEquals(7200000L, zone.getMillisKeepLocal(DateTimeZone.UTC, 0L));
        assertEquals(0L, zone.getMillisKeepLocal(zone, 0L));
    }

    @Test
    public void testZoneNamesAndFixedZoneGap() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals("+02:00", zone.getShortName(0L));
        assertEquals("+02:00", zone.getName(0L));
        assertFalse(zone.isLocalDateTimeGap(new org.joda.time.LocalDateTime(2000, 1, 1, 0, 0)));
    }

    @Test
    public void testSetDefaultRejectsNull() throws Exception {
        try {
            DateTimeZone.setDefault(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }
}
