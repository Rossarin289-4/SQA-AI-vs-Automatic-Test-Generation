package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.TimeZone;

public class DefaultDateTypeAdapterTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testWriteNull() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        // The JsonWriter expects to be in a JSON structure.
        // For simplicity, we'll write a JSON object and the null value inside it.
        jsonWriter.beginObject();
        adapter.write(jsonWriter, null);
        jsonWriter.endObject();
        // The output will be {"null"} if serializeNulls is true.
        // However, the write method directly writes "null" for null values.
        // Let's assume a minimal JSON context.
        stringWriter = new StringWriter(); // Reset writer
        jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, null); // Direct call to write the value
        jsonWriter.close(); // Close to flush
        assertEquals("null", stringWriter.toString().trim());
    }

    @Test
    public void testWriteDateNotNull() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        // The write method writes a JSON primitive (string).
        // For it to be a valid JSON, it should be enclosed in quotes.
        // The test needs to simulate how JsonWriter.value(String) would behave.
        jsonWriter.beginObject(); // Wrap in an object to simulate a valid JSON structure
        adapter.write(jsonWriter, date); // This writes the formatted date as a string value
        jsonWriter.endObject();
        // The output is like {"formattedDate"}. We need to extract the formatted date part.
        // Or, we can directly test the formatted date string.
        // The write method directly uses enUsFormat.format(value) and then out.value().
        // out.value() will quote the string.
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        jw.value(enUsFormat.format(date));
        jw.close();
        assertEquals("\"" + enUsFormat.format(date) + "\"", sw.toString().trim());

        // To test the adapter's write method, we need to construct a scenario.
        // The adapter's write method formats the date and writes it as a JSON string value.
        // A JSON string value is quoted.
        sw = new StringWriter();
        jw = new JsonWriter(sw);
        adapter.write(jw, date); // This internally calls enUsFormat.format and then out.value()
        jw.close();
        // The `out.value()` method in JsonWriter will add quotes around strings.
        assertEquals("\"" + enUsFormat.format(date) + "\"", sw.toString().trim());
    }

    @Test
    public void testWriteDateNotNullUSLocale() throws Exception {
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        DateFormat localFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUsFormat, localFormat);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        jsonWriter.beginObject();
        adapter.write(jsonWriter, date);
        jsonWriter.endObject();
        // The write method uses enUsFormat.format(value) and then out.value()
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        jw.value(enUsFormat.format(date));
        jw.close();
        assertEquals("\"" + enUsFormat.format(date) + "\"", sw.toString().trim());
    }

    @Test
    public void testReadNull() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        StringReader stringReader = new StringReader("null");
        JsonReader jsonReader = new JsonReader(stringReader);
        assertNull(adapter.read(jsonReader));
    }

    @Test
    public void testReadDateUSFormat() throws Exception {
        // The adapter has a constructor DefaultDateTypeAdapter(Class<? extends Date> dateType, String datePattern)
        // and DefaultDateTypeAdapter(Class<? extends Date> dateType, int style)
        // The constructor DefaultDateTypeAdapter(Class<? extends Date> dateType) uses US format and default style.
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        Date expectedDate = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        StringReader stringReader = new StringReader("\"" + enUsFormat.format(expectedDate) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testReadDateLocalFormat() throws Exception {
        // Use a specific locale for localFormat that might differ from US
        Locale customLocale = new Locale("fr", "FR");
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        DateFormat localFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, customLocale);
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUsFormat, localFormat);
        Date expectedDate = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        StringReader stringReader = new StringReader("\"" + localFormat.format(expectedDate) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testReadDateISO8601Format() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String dateString = "2023-03-15T12:00:00Z"; // ISO8601 format
        StringReader stringReader = new StringReader("\"" + dateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        Date expectedDate = ISO8601Utils.parse(dateString, new ParsePosition(0));
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testReadDateWithMilliseconds() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String dateString = "2023-03-15T12:00:00.123Z"; // ISO8601 format with milliseconds
        StringReader stringReader = new StringReader("\"" + dateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        Date expectedDate = ISO8601Utils.parse(dateString, new ParsePosition(0));
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testReadDateWithTimeZoneOffset() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String dateString = "2023-03-15T12:00:00+02:00"; // ISO8601 format with timezone offset
        StringReader stringReader = new StringReader("\"" + dateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        Date expectedDate = ISO8601Utils.parse(dateString, new ParsePosition(0));
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testReadDateWithMillisecondsAndTimeZoneOffset() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String dateString = "2023-03-15T12:00:00.456+02:00"; // ISO8601 format with milliseconds and timezone offset
        StringReader stringReader = new StringReader("\"" + dateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        Date expectedDate = ISO8601Utils.parse(dateString, new ParsePosition(0));
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testReadDateInvalidFormatThrowsJsonSyntaxException() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String invalidDateString = "This is not a date";
        StringReader stringReader = new StringReader("\"" + invalidDateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            adapter.read(jsonReader);
            fail("Expected JsonSyntaxException for invalid date format");
        } catch (JsonSyntaxException e) {
            // Expected exception
        }
    }

    @Test
    public void testReadTimestampType() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class);
        Date expectedDate = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        StringReader stringReader = new StringReader("\"" + enUsFormat.format(expectedDate) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        Date readDate = adapter.read(jsonReader);
        assertTrue(readDate instanceof Timestamp);
        assertEquals(expectedDate.getTime(), readDate.getTime());
    }

    @Test
    public void testReadSqlDateType() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class);
        Date expectedDate = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        StringReader stringReader = new StringReader("\"" + enUsFormat.format(expectedDate) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        Date readDate = adapter.read(jsonReader);
        assertTrue(readDate instanceof java.sql.Date);
        assertEquals(expectedDate.getTime(), readDate.getTime());
    }

    @Test
    public void testToString() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        assertTrue(adapter.toString().contains("DefaultDateTypeAdapter"));
        // The toString() method includes the simple name of the localFormat's class.
        // It uses DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT) by default.
        DateFormat localFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
        assertTrue(adapter.toString().contains(localFormat.getClass().getSimpleName()));
    }

    @Test
    public void testConstructorWithDatePattern() {
        String pattern = "yyyy-MM-dd";
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, pattern);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        try {
            // write() method formats using enUsFormat, not the pattern provided to the constructor
            // unless the constructor is DefaultDateTypeAdapter(Class<? extends Date>, String, String)
            // The constructor DefaultDateTypeAdapter(Class<? extends Date> dateType, String datePattern)
            // passes the same pattern to both enUsFormat and localFormat.
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
            jsonWriter.beginObject();
            adapter.write(jsonWriter, date);
            jsonWriter.endObject();
            // The write method uses enUsFormat, which is initialized with the given pattern.
            StringWriter sw = new StringWriter();
            JsonWriter jw = new JsonWriter(sw);
            jw.value(sdf.format(date));
            jw.close();
            assertEquals("\"" + sdf.format(date) + "\"", sw.toString().trim());

            // Read test
            StringReader stringReader = new StringReader("\"" + sdf.format(date) + "\"");
            JsonReader jsonReader = new JsonReader(stringReader);
            assertEquals(date, adapter.read(jsonReader));

        } catch (IOException e) {
            fail("IOException during write/read: " + e.getMessage());
        }
    }

    @Test
    public void testConstructorWithDateStyle() {
        int style = DateFormat.SHORT;
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, style);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        try {
            jsonWriter.beginObject();
            adapter.write(jsonWriter, date);
            jsonWriter.endObject();
        } catch (IOException e) {
            fail("IOException during write");
        }
        // The write method uses enUsFormat, which is initialized with the given style.
        DateFormat df = DateFormat.getDateInstance(style, Locale.US);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        jw.value(df.format(date));
        jw.close();
        assertEquals("\"" + df.format(date) + "\"", sw.toString().trim());

        // Read test
        StringReader stringReader = new StringReader("\"" + df.format(date) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            assertEquals(date, adapter.read(jsonReader));
        } catch (IOException e) {
            fail("IOException during read");
        }
    }

    @Test
    public void testConstructorWithDateStyleAndTimeStyle() {
        int dateStyle = DateFormat.SHORT;
        int timeStyle = DateFormat.SHORT;
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(dateStyle, timeStyle);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        try {
            jsonWriter.beginObject();
            adapter.write(jsonWriter, date);
            jsonWriter.endObject();
        } catch (IOException e) {
            fail("IOException during write");
        }
        // The write method uses enUsFormat, which is initialized with the given styles.
        DateFormat df = DateFormat.getDateTimeInstance(dateStyle, timeStyle, Locale.US);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        jw.value(df.format(date));
        jw.close();
        assertEquals("\"" + df.format(date) + "\"", sw.toString().trim());

        // Read test
        StringReader stringReader = new StringReader("\"" + df.format(date) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            assertEquals(date, adapter.read(jsonReader));
        } catch (IOException e) {
            fail("IOException during read");
        }
    }

    @Test
    public void testConstructorWithDateTypeAndDateStyleAndTimeStyle() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, DateFormat.MEDIUM, DateFormat.MEDIUM);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        try {
            jsonWriter.beginObject();
            adapter.write(jsonWriter, date);
            jsonWriter.endObject();
        } catch (IOException e) {
            fail("IOException during write");
        }
        // The write method uses enUsFormat, which is initialized with the given styles.
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.US);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        jw.value(df.format(date));
        jw.close();
        assertEquals("\"" + df.format(date) + "\"", sw.toString().trim());

        // Read test
        StringReader stringReader = new StringReader("\"" + df.format(date) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            Date readDate = adapter.read(jsonReader);
            assertTrue(readDate instanceof Timestamp);
            assertEquals(date.getTime(), readDate.getTime());
        } catch (IOException e) {
            fail("IOException during read");
        }
    }

    @Test
    public void testConstructorWithInvalidDateType() {
        // Using a class that is not Date, Timestamp, or java.sql.Date.
        // String.class is a good candidate as it's a common type and not a Date subclass.
        try {
            new DefaultDateTypeAdapter(String.class);
            fail("Expected IllegalArgumentException for invalid date type");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testReadDateWithTimeOnly() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        // The current implementation of read() uses localFormat.parse(s) first, then enUsFormat.parse(s),
        // then ISO8601Utils.parse(s). If none of these succeed, it throws JsonSyntaxException.
        // Simple date formats like "HH:mm:ss" might not be parsed directly as a full date by default
        // DateFormat.DEFAULT. If they are parsed, they might default to the current date.
        // The most robust test here is to check if an invalid/ambiguous format throws an exception,
        // or if a specific format *is* parseable.
        String timeString = "12:00:00"; // A time-only string.
        StringReader stringReader = new StringReader("\"" + timeString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);

        // Depending on the exact DateFormat configuration, this might parse or throw.
        // The `deserializeToDate` method tries `localFormat.parse(s)` and `enUsFormat.parse(s)`.
        // For default `DateFormat.DEFAULT` styles, parsing a time-only string might result in
        // a date set to the current date or a default date like Jan 1, 1970.
        // It's safer to test a format that is known to be parsed.
        // Let's test a full date format that doesn't include time.
        String dateOnlyString = "2023-03-15";
        StringReader stringReaderDateOnly = new StringReader("\"" + dateOnlyString + "\"");
        JsonReader jsonReaderDateOnly = new JsonReader(stringReaderDateOnly);
        try {
            Date parsedDate = adapter.read(jsonReaderDateOnly);
            // ISO8601Utils.parse("2023-03-15", new ParsePosition(0)) should work.
            // It will parse the date part and assume time is 00:00:00.
            Date expectedDate = ISO8601Utils.parse(dateOnlyString, new ParsePosition(0));
            assertEquals(expectedDate, parsedDate);
        } catch (JsonSyntaxException e) {
            fail("Expected parsing of 'YYYY-MM-DD' format, but got JsonSyntaxException: " + e.getMessage());
        } catch (IOException e) {
            fail("IOException during read: " + e.getMessage());
        }
    }

    @Test
    public void testReadDateWithDifferentOffset() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String dateString = "2023-03-15T12:00:00-05:00"; // ISO8601 format with different timezone offset
        StringReader stringReader = new StringReader("\"" + dateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        Date expectedDate = ISO8601Utils.parse(dateString, new ParsePosition(0));
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testWriteDateWithLeadingZero() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        // Date with a day that might be formatted with a leading zero (e.g., 05)
        Date date = new Date(1678800000000L); // March 14, 2023 12:00:00 PM GMT
        // The write method uses enUsFormat.format() and then out.value().
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        String formattedDate = enUsFormat.format(date);

        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        jw.value(formattedDate);
        jw.close();
        assertEquals("\"" + formattedDate + "\"", sw.toString().trim());

        // To test the adapter's write method
        sw = new StringWriter();
        jw = new JsonWriter(sw);
        adapter.write(jw, date);
        jw.close();
        assertEquals("\"" + formattedDate + "\"", sw.toString().trim());
    }

    @Test
    public void testWriteDateWithDefaultLocale() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class); // Uses default locale
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT

        // The write method uses enUsFormat.format(value)
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        String expectedFormattedDate = enUsFormat.format(date);

        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        jw.value(expectedFormattedDate);
        jw.close();
        assertEquals("\"" + expectedFormattedDate + "\"", sw.toString().trim());

        // Test the adapter's write method directly
        sw = new StringWriter();
        jw = new JsonWriter(sw);
        adapter.write(jw, date);
        jw.close();
        assertEquals("\"" + expectedFormattedDate + "\"", sw.toString().trim());
    }

    @Test
    public void testReadDateWithCommaSeparator() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        // Some locale formats might use comma as separator.
        // The ISO8601Utils.parse is strict. Let's see if local/enUs format can handle it.
        // The deserializeToDate method first tries localFormat.parse(s), then enUsFormat.parse(s).
        // If the current locale uses comma, localFormat might parse it.
        // For simplicity, let's craft a string that is likely to be parsed by one of the formats.
        // A common format is "MMM dd, yyyy HH:mm:ss" which uses a comma.
        String dateString = "Mar 15, 2023 12:00:00"; // This format is often parsed by DateFormat.DEFAULT
        StringReader stringReader = new StringReader("\"" + dateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);

        try {
            Date parsedDate = adapter.read(jsonReader);
            // We need to know what the expected date is.
            // The adapter tries localFormat and enUsFormat. Let's assume enUsFormat might parse it.
            // If enUsFormat (Locale.US) is used, it should parse "Mar 15, 2023 12:00:00".
            DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
            Date expectedDate = enUsFormat.parse(dateString); // Parse it using the same format.
            assertEquals(expectedDate, parsedDate);
        } catch (ParseException e) {
            fail("ParseException while trying to parse a common date format: " + e.getMessage());
        } catch (JsonSyntaxException e) {
            fail("JsonSyntaxException while trying to parse a common date format: " + e.getMessage());
        } catch (IOException e) {
            fail("IOException during read: " + e.getMessage());
        }
    }
}
