package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatLang56Test {

    private FastDateFormat serializeAndDeserialize(FastDateFormat formatter)
            throws Exception {

        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();

        ObjectOutputStream output = new ObjectOutputStream(byteOutput);
        output.writeObject(formatter);
        output.close();

        ObjectInputStream input = new ObjectInputStream(
                new ByteArrayInputStream(byteOutput.toByteArray()));

        FastDateFormat restored = (FastDateFormat) input.readObject();
        input.close();

        return restored;
    }

    @Test
    public void testSerializeAndDeserializeDateFormatter()
            throws Exception {

        FastDateFormat formatter =
                FastDateFormat.getInstance("yyyy-MM-dd");

        Date date = new Date(1234567890000L);

        String before = formatter.format(date);

        FastDateFormat restored =
                serializeAndDeserialize(formatter);

        String after = restored.format(date);

        assertEquals(before, after);
    }

    @Test
    public void testSerializeFormatterWithTextAndTimeFields()
            throws Exception {

        FastDateFormat formatter =
                FastDateFormat.getInstance(
                        "EEEE, MMMM dd yyyy HH:mm:ss",
                        TimeZone.getTimeZone("GMT"),
                        Locale.US);

        Date date = new Date(1300000000000L);

        String before = formatter.format(date);

        FastDateFormat restored =
                serializeAndDeserialize(formatter);

        String after = restored.format(date);

        assertEquals(before, after);
    }

    @Test
    public void testSerializeFormatterWithTimezone()
            throws Exception {

        TimeZone zone = TimeZone.getTimeZone("GMT+07:00");

        FastDateFormat formatter =
                FastDateFormat.getInstance(
                        "yyyy/MM/dd HH:mm Z",
                        zone,
                        Locale.US);

        Date date = new Date(1357924680000L);

        String before = formatter.format(date);

        FastDateFormat restored =
                serializeAndDeserialize(formatter);

        String after = restored.format(date);

        assertEquals(before, after);
        assertEquals(zone, restored.getTimeZone());
    }

    @Test
    public void testSerializeFormatterWithLiteralPattern()
            throws Exception {

        FastDateFormat formatter =
                FastDateFormat.getInstance(
                        "yyyy-MM-dd 'at' HH:mm:ss",
                        TimeZone.getTimeZone("UTC"),
                        Locale.US);

        Date date = new Date(1400000000000L);

        String before = formatter.format(date);

        FastDateFormat restored =
                serializeAndDeserialize(formatter);

        String after = restored.format(date);

        assertEquals(before, after);
    }

    @Test
    public void testNormalFormattingStillWorks()
            throws Exception {

        FastDateFormat formatter =
                FastDateFormat.getInstance(
                        "MM/dd/yyyy",
                        TimeZone.getTimeZone("UTC"),
                        Locale.US);

        Date date = new Date(1500000000000L);

        String result = formatter.format(date);

        assertEquals("07/14/2017", result);
    }

    @Test
    public void testRoundTripPreservesFormattedResult()
            throws Exception {

        FastDateFormat formatter =
                FastDateFormat.getInstance(
                        "HH:mm:ss.SSS",
                        TimeZone.getTimeZone("GMT+05:30"),
                        Locale.US);

        Date date = new Date(1600000000123L);

        String expected = formatter.format(date);

        FastDateFormat restored =
                serializeAndDeserialize(formatter);

        assertEquals(expected, restored.format(date));
    }
}
