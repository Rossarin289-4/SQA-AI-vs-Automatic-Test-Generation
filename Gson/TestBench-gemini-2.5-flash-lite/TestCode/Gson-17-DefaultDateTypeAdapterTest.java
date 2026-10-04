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
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        
        // The write method formats the date and writes it as a JSON string value.
        // The JsonWriter.value() method handles quoting.
        adapter.write(jsonWriter, date); 
        jsonWriter.close(); 
        assertEquals("\"" + enUsFormat.format(date) + "\"", stringWriter.toString().trim());
    }

    @Test
    public void testWriteDateNotNullUSLocale() throws Exception {
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        DateFormat localFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUsFormat, localFormat);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, date); // This internally calls enUsFormat.format and then out.value()
        jw.close();
        // The `out.value()` method in JsonWriter will add quotes around strings.
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
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        Date expectedDate = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        StringReader stringReader = new StringReader("\"" + enUsFormat.format(expectedDate) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        assertEquals(expectedDate, adapter.read(jsonReader));
    }

    @Test
    public void testReadDateLocalFormat() throws Exception {
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
        DateFormat localFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
        assertTrue(adapter.toString().contains(localFormat.getClass().getSimpleName()));
    }

    @Test
    public void testConstructorWithDatePattern() {
        String pattern = "yyyy-MM-dd";
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, pattern);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
        
        // Test write
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        try {
            adapter.write(jw, date);
            jw.close();
        } catch (IOException e) {
            fail("IOException during write: " + e.getMessage());
        }
        // The adapter's write method uses enUsFormat, so we expect the US formatted date.
        // The expected date value in the failing test was an approximation based on default timezone.
        // We need to use the exact format string from the reference code.
        // The actual date represented by 1678886400000L is a specific point in time.
        // For "yyyy-MM-dd", the time part is lost.
        // The `enUsFormat.format(date)` in the original test was also incorrect.
        // The correct way to get the value is to format it with the specific pattern.
        assertEquals("\"" + new SimpleDateFormat(pattern, Locale.US).format(date) + "\"", sw.toString().trim());

        // Test read
        StringReader stringReader = new StringReader("\"" + sdf.format(date) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            // The expected date should be parsed from the string.
            // For "yyyy-MM-dd", the time defaults to 00:00:00.
            Date expectedDate = new SimpleDateFormat(pattern, Locale.US).parse(sdf.format(date));
            assertEquals(expectedDate, adapter.read(jsonReader));
        } catch (IOException e) {
            fail("IOException during read: " + e.getMessage());
        } catch (ParseException e) {
             fail("ParseException during read: " + e.getMessage());
        }
    }

    @Test
    public void testConstructorWithDateStyle() {
        int style = DateFormat.SHORT;
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, style);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat df = DateFormat.getDateInstance(style, Locale.US);
        
        // Test write
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        try {
            adapter.write(jw, date);
            jw.close();
        } catch (IOException e) {
            fail("IOException during write: " + e.getMessage());
        }
        // The write method uses enUsFormat, so we expect the US formatted date.
        // The failing test had an assertion that was incorrect. It expected a specific time which is not part of the "date only" format.
        // Using Locale.US format for consistency with the constructor.
        assertEquals("\"" + df.format(date) + "\"", sw.toString().trim());

        // Test read
        StringReader stringReader = new StringReader("\"" + df.format(date) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            // The date returned by read should match what was formatted.
            // For date-only formats, time components are typically set to midnight.
            Date expectedDate = df.parse(df.format(date));
            assertEquals(expectedDate, adapter.read(jsonReader));
        } catch (IOException e) {
            fail("IOException during read: " + e.getMessage());
        } catch (ParseException e) {
             fail("ParseException during read: " + e.getMessage());
        }
    }

    @Test
    public void testConstructorWithDateStyleAndTimeStyle() {
        int dateStyle = DateFormat.SHORT;
        int timeStyle = DateFormat.SHORT;
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(dateStyle, timeStyle);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat df = DateFormat.getDateTimeInstance(dateStyle, timeStyle, Locale.US);
        
        // Test write
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        try {
            adapter.write(jw, date);
            jw.close();
        } catch (IOException e) {
            fail("IOException during write: " + e.getMessage());
        }
        // The write method uses enUsFormat, so we expect the US formatted date.
        // The failing test had an assertion that was incorrect. It expected a specific time which was not aligned with the locale/style.
        assertEquals("\"" + df.format(date) + "\"", sw.toString().trim());

        // Test read
        StringReader stringReader = new StringReader("\"" + df.format(date) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            Date expectedDate = df.parse(df.format(date));
            assertEquals(expectedDate, adapter.read(jsonReader));
        } catch (IOException e) {
            fail("IOException during read: " + e.getMessage());
        } catch (ParseException e) {
             fail("ParseException during read: " + e.getMessage());
        }
    }

    @Test
    public void testConstructorWithDateTypeAndDateStyleAndTimeStyle() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, DateFormat.MEDIUM, DateFormat.MEDIUM);
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.US);
        
        // Test write
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        try {
            adapter.write(jw, date);
            jw.close();
        } catch (IOException e) {
            fail("IOException during write: " + e.getMessage());
        }
        assertEquals("\"" + df.format(date) + "\"", sw.toString().trim());

        // Test read
        StringReader stringReader = new StringReader("\"" + df.format(date) + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);
        try {
            Date readDate = adapter.read(jsonReader);
            assertTrue(readDate instanceof Timestamp);
            assertEquals(date.getTime(), readDate.getTime());
        } catch (IOException e) {
            fail("IOException during read: " + e.getMessage());
        }
    }


    @Test
    public void testReadDateOnlyFormat() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String dateOnlyString = "2023-03-15"; // A date-only string.
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
        Date date = new Date(1678800000000L); // March 14, 2023 12:00:00 PM GMT
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        String formattedDate = enUsFormat.format(date);

        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, date);
        jw.close();
        assertEquals("\"" + formattedDate + "\"", sw.toString().trim());
    }

    @Test
    public void testWriteDateWithDefaultLocale() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class); // Uses default locale
        Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM GMT

        // The write method uses enUsFormat.format(value)
        DateFormat enUsFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        String expectedFormattedDate = enUsFormat.format(date);

        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, date);
        jw.close();
        assertEquals("\"" + expectedFormattedDate + "\"", sw.toString().trim());
    }

    @Test
    public void testReadDateWithCommaSeparator() throws Exception {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        // Test a format that uses a comma, common in some locales.
        // The deserializeToDate method tries localFormat and enUsFormat.
        // Let's assume enUsFormat can parse this.
        String dateString = "Mar 15, 2023 12:00:00"; 
        StringReader stringReader = new StringReader("\"" + dateString + "\"");
        JsonReader jsonReader = new JsonReader(stringReader);

        try {
            Date parsedDate = adapter.read(jsonReader);
            // The failing test assumed enUsFormat.parse(dateString) would succeed.
            // However, "Mar 15, 2023 12:00:00" is a format that is NOT directly parsed by the default enUsFormat.
            // The deserializeToDate method has a fallback to ISO8601Utils.parse.
            // For this specific string, ISO8601Utils.parse will throw a ParseException.
            // The current implementation in deserializeToDate catches ParseException and tries the next parser.
            // If all fail, it throws JsonSyntaxException.
            // The expected behavior for this input is that it should fail to parse.
            fail("Expected JsonSyntaxException for date format 'Mar 15, 2023 12:00:00'");
        } catch (JsonSyntaxException e) {
            // Expected exception because the format is not parsed by any of the tried methods.
        } catch (IOException e) {
            fail("IOException during read: " + e.getMessage());
        }
    }
}
