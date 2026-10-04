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
    public void testUTCFactoryAndIdentity() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    @Test
    public void testOffsetHoursAtPositiveLimit() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(23);
        assertEquals("+23:00", zone.getID());
        assertEquals(23 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testOffsetHoursAtNegativeLimit() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-23);
        assertEquals("-23:00", zone.getID());
        assertEquals(-23 * 60 * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void testOffsetHoursAboveLimitRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHours(24);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOffsetHoursBelowLimitRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHours(-24);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOffsetHoursMinutesBoundaryAndSign() throws Exception {
        assertEquals("+23:59", DateTimeZone.forOffsetHoursMinutes(23, 59).getID());
        assertEquals("-02:30", DateTimeZone.forOffsetHoursMinutes(-2, 30).getID());
    }

    @Test
    public void testOffsetMinutesOutOfRangeRejected() throws Exception {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOffsetMillisAtLargestPositiveValue() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(86399999);
        assertEquals("+23:59:59.999", zone.getID());
        assertEquals(86399999, zone.getOffset(0L));
    }

    @Test
    public void testOffsetMillisAtLargestNegativeValue() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-86399999);
        assertEquals("-23:59:59.999", zone.getID());
        assertEquals(-86399999, zone.getOffset(0L));
    }

    @Test
    public void testOffsetMillisOneBeyondLimitRejected() throws Exception {
        try {
            DateTimeZone.forOffsetMillis(86400000);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testForIdParsesFixedOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+02:30");
        assertEquals("+02:30", zone.getID());
        assertEquals(9000000, zone.getOffset(0L));
    }

    @Test
    public void testForIdNormalizesZeroOffset() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test
    public void testForIdRejectsUnknownIdentifier() throws Exception {
        try {
            DateTimeZone.forID("not/a-zone");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFixedZoneOffsetAndStandardOffset() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", "key", 3600000, 1800000);
        assertEquals("key", zone.getNameKey(12L));
        assertEquals(3600000, zone.getOffset(12L));
        assertEquals(1800000, zone.getStandardOffset(12L));
        assertFalse(zone.isStandardOffset(12L));
    }

    @Test
    public void testFixedZoneOffsetFromLocal() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, -3600000, -3600000);
        assertEquals(-3600000, zone.getOffsetFromLocal(123L));
        assertTrue(zone.isStandardOffset(123L));
    }

    @Test
    public void testConvertUTCToLocalAddsOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7200123L, zone.convertUTCToLocal(123L));
    }

    @Test
    public void testConvertUTCToLocalDetectsOverflow() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        try {
            zone.convertUTCToLocal(Long.MAX_VALUE);
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { }
    }

    @Test
    public void testConvertLocalToUTCUsingOriginalOffset() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(123L, zone.convertLocalToUTC(7200123L, true, 0L));
    }

    @Test
    public void testGetMillisKeepLocalSameZoneReturnsInput() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals(123456L, zone.getMillisKeepLocal(zone, 123456L));
    }

    @Test
    public void testFixedZoneHasNoTransitions() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertTrue(zone.isFixed());
        assertEquals(123L, zone.nextTransition(123L));
        assertEquals(123L, zone.previousTransition(123L));
    }

    @Test
    public void testAdjustOffsetForFixedZoneDoesNotChangeInstant() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(123456L, zone.adjustOffset(123456L, true));
        assertEquals(123456L, zone.adjustOffset(123456L, false));
    }

    @Test
    public void testFixedZoneGapCheckIsFalse() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertFalse(zone.isLocalDateTimeGap(null));
    }

    @Test
    public void testZoneStringAndHashCode() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-3);
        assertEquals("-03:00", zone.toString());
        assertEquals(57 + zone.getID().hashCode(), zone.hashCode());
    }

    @Test
    public void testForTimeZoneUtc() throws Exception {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testProviderAndAvailableIDsExposeUTC() throws Exception {
        assertNotNull(DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testSetDefaultAndGetDefault() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(4);
        DateTimeZone.setDefault(zone);
        assertSame(zone, DateTimeZone.getDefault());
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @Test
    public void testSetDefaultRejectsNull() throws Exception {
        try {
            DateTimeZone.setDefault(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNameProviderAvailable() throws Exception {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetProviderNullRestoresUsableDefault() throws Exception {
        DateTimeZone.setProvider(null);
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testSetNameProviderNullRestoresProvider() throws Exception {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testGetZoneFromBaseChronologyIsNull() throws Exception {
        Chronology chronology = new BaseChronology() {
            public DateTimeZone getZone() {
                return null;
            }
            public Chronology withUTC() {
                return this;
            }
            public Chronology withZone(DateTimeZone zone) {
                return this;
            }
            public String toString() {
                return getClass().getName();
            }
        };
        assertNull(chronology.getZone());
    }

    @Test
    public void testWithUTCReturnsSameChronologyWhenAlreadyUtc() throws Exception {
        Chronology chronology = new BaseChronology() {
            public DateTimeZone getZone() {
                return DateTimeZone.UTC;
            }
            public Chronology withUTC() {
                return this;
            }
            public Chronology withZone(DateTimeZone zone) {
                return this;
            }
            public String toString() {
                return getClass().getName();
            }
        };
        assertSame(chronology, chronology.withUTC());
    }

    @Test
    public void testWithZoneReturnsSameChronologyForSameZone() throws Exception {
        DateTimeZone zone = DateTimeZone.UTC;
        Chronology chronology = new BaseChronology() {
            public DateTimeZone getZone() {
                return zone;
            }
            public Chronology withUTC() {
                return this;
            }
            public Chronology withZone(DateTimeZone requested) {
                return this;
            }
            public String toString() {
                return getClass().getName();
            }
        };
        assertSame(chronology, chronology.withZone(zone));
    }

    @Test
    public void testShortNameUsesIdWhenNameKeyIsNull() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 1000, 1000);
        assertEquals("X", zone.getShortName(0L));
    }

    @Test
    public void testLongNameUsesIdWhenNameKeyIsNull() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 1000, 1000);
        assertEquals("X", zone.getName(0L));
    }

    @Test
    public void testToTimeZoneForUtc() throws Exception {
        assertEquals("UTC", DateTimeZone.UTC.toTimeZone().getID());
        assertEquals(0, DateTimeZone.UTC.toTimeZone().getRawOffset());
    }

    @Test
    public void testEqualsSameAndDifferentFixedZones() throws Exception {
        DateTimeZone first = new FixedDateTimeZone("X", null, 1000, 1000);
        DateTimeZone same = new FixedDateTimeZone("X", null, 1000, 1000);
        DateTimeZone different = new FixedDateTimeZone("Y", null, 1000, 1000);
        assertTrue(first.equals(same));
        assertFalse(first.equals(different));
        assertFalse(first.equals(null));
    }

    @Test
    public void testEqualsRejectsUnrelatedObject() throws Exception {
        DateTimeZone zone = new FixedDateTimeZone("X", null, 1000, 1000);
        assertFalse(zone.equals("X"));
    }
}
