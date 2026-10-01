package org.joda.time.format;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class TestDateTimeFormatterBuilderTime20 {

    @Test
    public void testMatchingParserStopsAtFirstMatch() {
        final DateTimeZone shortZone = DateTimeZone.forID("GMT+01:00");
        final DateTimeZone longZone = DateTimeZone.forID("GMT+02:00");

        DateTimeParser shortParser = new DateTimeParser() {
            public int estimateParsedLength() {
                return 2;
            }

            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                if (text.startsWith("AB", position)) {
                    bucket.setZone(shortZone);
                    return position + 2;
                }
                return ~position;
            }
        };

        DateTimeParser longParser = new DateTimeParser() {
            public int estimateParsedLength() {
                return 3;
            }

            public int parseInto(DateTimeParserBucket bucket, String text, int position) {
                if (text.startsWith("ABC", position)) {
                    bucket.setZone(longZone);
                    return position + 3;
                }
                return ~position;
            }
        };

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .append(new DateTimeParser[] {shortParser, longParser})
                .toFormatter();

        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, ISOChronology.getInstanceUTC(), Locale.ENGLISH);

        formatter.parseInto(bucket, "ABC", 0);

        assertEquals(shortZone, bucket.getZone());
    }
}
