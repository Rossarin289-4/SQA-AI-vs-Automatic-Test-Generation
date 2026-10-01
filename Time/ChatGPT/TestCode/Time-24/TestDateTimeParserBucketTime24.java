package org.joda.time.format;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class TestDateTimeParserBucketTime24 {

    @Test
    public void testComputeMillisWithResetFields() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, ISOChronology.getInstanceUTC(), null);

        bucket.saveField(DateTimeFieldType.year(), 2000);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 2);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 29);

        long millis = bucket.computeMillis(true);

        assertEquals(2000, ISOChronology.getInstanceUTC().year().get(millis));
        assertEquals(2, ISOChronology.getInstanceUTC().monthOfYear().get(millis));
        assertEquals(29, ISOChronology.getInstanceUTC().dayOfMonth().get(millis));
    }
}
