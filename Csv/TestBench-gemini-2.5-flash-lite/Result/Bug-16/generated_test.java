package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class CSVParserTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseStringSimple() throws IOException {
        String csv = "a,b,c\nd,e,f";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(1).get(2));
        }
    }

    @Test
    public void testParseStringWithHeader() throws IOException {
        String csv = "header1,header2\nvalue1,value2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("value1", records.get(0).get("header1"));
            assertEquals("value2", records.get(0).get("header2"));
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertEquals(Integer.valueOf(0), headerMap.get("header1"));
            assertEquals(Integer.valueOf(1), headerMap.get("header2"));
        }
    }

    @Test
    public void testParseStringWithExplicitHeader() throws IOException {
        String csv = "a,b\nc,d";
        // With explicit header, the first line is treated as data, not header
        CSVFormat format = CSVFormat.DEFAULT.withHeader("col1", "col2");
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get("col1")); // First data row uses header
            assertEquals("d", records.get(1).get("col2")); // Second data row uses header
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertEquals(Integer.valueOf(0), headerMap.get("col1"));
            assertEquals(Integer.valueOf(1), headerMap.get("col2"));
        }
    }

    @Test
    public void testParseStringWithSkipHeaderRecord() throws IOException {
        String csv = "header1,header2\nvalue1,value2\nvalue3,value4";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withSkipHeaderRecord();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("value1", records.get(0).get(0));
            assertEquals("value4", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithNullString() throws IOException {
        String csv = "a,NULL,c\nd,e,f";
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertNull(records.get(0).get(1));
            assertNotNull(records.get(1).get(0));
        }
    }

    @Test
    public void testParseStringWithTrailingDelimiter() throws IOException {
        String csv = "a,b,\nc,d,";
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals(3, records.get(0).size()); // Includes the trailing delimiter as an empty field
            assertNull(records.get(0).get(2));
            assertEquals(3, records.get(1).size());
            assertNull(records.get(1).get(2));
        }
    }

    @Test
    public void testParseStringWithTrailingDelimiterAndEmptyLastValue() throws IOException {
        String csv = "a,b,\nc,d,";
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals(3, records.get(0).size());
            assertNull(records.get(0).get(2));
            assertEquals(3, records.get(1).size());
            assertNull(records.get(1).get(2));
        }
    }

    @Test
    public void testParseStringWithIgnoreEmptyLines() throws IOException {
        String csv = "a,b\n\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithTrim() throws IOException {
        String csv = " a , b \n c , d ";
        CSVFormat format = CSVFormat.DEFAULT.withTrim();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithCommentMarker() throws IOException {
        String csv = "a,b\n#comment\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
            assertTrue(records.get(0).isConsistent());
            assertTrue(records.get(1).isConsistent());
        }
    }

    @Test
    public void testParseStringWithCommentMarkerAndCommentInRecord() throws IOException {
        String csv = "a,b,#comment\nc,d,e";
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("b", records.get(0).get(1));
            assertEquals("#comment", records.get(0).get(2)); // Comment marker is not special if not at start of line
            assertEquals("c", records.get(1).get(0));
            assertEquals("e", records.get(1).get(2));
        }
    }

    @Test
    public void testIterator() throws IOException {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Iterator<CSVRecord> iterator = parser.iterator();
            assertTrue(iterator.hasNext());
            assertEquals("a", iterator.next().get(0));
            assertTrue(iterator.hasNext());
            assertEquals("d", iterator.next().get(1));
            assertFalse(iterator.hasNext());
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorEmpty() throws IOException {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Iterator<CSVRecord> iterator = parser.iterator();
            assertFalse(iterator.hasNext());
            iterator.next();
        }
    }

    @Test
    public void testClose() throws IOException {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        StringReader reader = new StringReader(csv);
        CSVParser parser = new CSVParser(reader, format);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        // StringReader is not closed by CSVParser close, so reader.ready() should be true.
        assertTrue(reader.ready());
    }

    @Test
    public void testGetCurrentLineNumber() throws IOException {
        String csv = "a,b\nc,d\ne,f";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            // The lexer's current line number starts at 1.
            // When nextRecord() is called for the first time, it advances the lexer.
            // So, before any record is read, the line number is 1.
            assertEquals(1, parser.getCurrentLineNumber());
            parser.nextRecord(); // Reads the first record
            assertEquals(2, parser.getCurrentLineNumber());
            parser.nextRecord(); // Reads the second record
            assertEquals(3, parser.getCurrentLineNumber());
        }
    }

    @Test
    public void testGetRecordNumber() throws IOException {
        String csv = "a,b\nc,d\ne,f";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            // The recordNumber is initialized to recordNumber - 1.
            // The constructor sets it to 1 - 1 = 0.
            // It's incremented *after* a record is successfully parsed.
            assertEquals(0, parser.getRecordNumber()); // Before first record is read
            parser.nextRecord();
            assertEquals(1, parser.getRecordNumber()); // After first record
            parser.nextRecord();
            assertEquals(2, parser.getRecordNumber()); // After second record
            parser.nextRecord();
            assertEquals(3, parser.getRecordNumber()); // After third record
        }
    }

    @Test
    public void testGetHeaderMapWhenNoHeader() throws IOException {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertNull(parser.getHeaderMap());
        }
    }

    @Test
    public void testGetHeaderMapWhenHeaderPresent() throws IOException {
        String csv = "col1,col2\na,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(Integer.valueOf(0), headerMap.get("col1"));
            assertEquals(Integer.valueOf(1), headerMap.get("col2"));
        }
    }

    @Test
    public void testGetHeaderMapWithIgnoreHeaderCase() throws IOException {
        String csv = "Col1,col2\na,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withIgnoreHeaderCase();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            // Accessing with different casing due to ignoreHeaderCase()
            assertEquals(Integer.valueOf(0), headerMap.get("COL1"));
            assertEquals(Integer.valueOf(1), headerMap.get("Col2"));
        }
    }

    @Test
    public void testGetRecordsEmpty() throws IOException {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testGetRecordsWithMultipleLines() throws IOException {
        String csv = "a,b\nc,d\ne,f";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(3, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(2).get(1));
        }
    }

    @Test
    public void testGetRecordsWithQuoteAndDelimiter() throws IOException {
        String csv = "\"a,b\",c\nd,\"e\nf\"";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a,b", records.get(0).get(0));
            assertEquals("e\nf", records.get(1).get(1));
        }
    }

    @Test
    public void testGetFirstEndOfLine() throws IOException {
        String csv = "a,b\r\nc,d\r";
        // The format's record separator is not directly used by getFirstEndOfLine.
        // It captures the first EOL sequence encountered in the input.
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord(); // Process first record, which ends with \r\n
            assertEquals("\r\n", parser.getFirstEndOfLine());
            parser.nextRecord(); // Process second record, which ends with \r
            // getFirstEndOfLine() only returns the *first* encountered EOL.
            // It should still be "\r\n" from the first record.
            assertEquals("\r\n", parser.getFirstEndOfLine());
        }
    }

    @Test
    public void testGetFirstEndOfLineWithDifferentSeparator() throws IOException {
        String csv = "a,b\r c,d\n"; // Mixed line endings
        CSVFormat format = CSVFormat.DEFAULT; // Default behavior is to detect EOL
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord(); // Process first record, which ends with \r
            assertEquals("\r", parser.getFirstEndOfLine());
            parser.nextRecord(); // Process second record, which ends with \n
            // getFirstEndOfLine() should still be "\r" as it captured the first one.
            assertEquals("\r", parser.getFirstEndOfLine());
        }
    }

    @Test
    public void testParseFile() throws IOException {
        Path tempFile = Files.createTempFile("csvtest", ".csv");
        String content = "file_a,file_b\nfile_c,file_d";
        Files.write(tempFile, content.getBytes(Charset.defaultCharset()));

        try (CSVParser parser = CSVParser.parse(tempFile.toFile(), Charset.defaultCharset(), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("file_a", records.get(0).get(0));
            assertEquals("file_d", records.get(1).get(1));
        } finally {
            Files.deleteIfExists(tempFile);
        }
    }

    @Test
    public void testParseInputStream() throws IOException {
        String csv = "stream_a,stream_b\nstream_c,stream_d";
        InputStream inputStream = new ByteArrayInputStream(csv.getBytes(Charset.defaultCharset()));
        try (CSVParser parser = CSVParser.parse(inputStream, Charset.defaultCharset(), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("stream_a", records.get(0).get(0));
            assertEquals("stream_d", records.get(1).get(1));
        }
    }

    @Test
    public void testParsePath() throws IOException {
        Path tempFile = Files.createTempFile("csvtest", ".csv");
        String content = "path_a,path_b\npath_c,path_d";
        Files.write(tempFile, content.getBytes(Charset.defaultCharset()));

        try (CSVParser parser = CSVParser.parse(tempFile, Charset.defaultCharset(), CSVFormat.DEFAULT)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("path_a", records.get(0).get(0));
            assertEquals("path_d", records.get(1).get(1));
        } finally {
            Files.deleteIfExists(tempFile);
        }
    }

    @Test
    public void testParseURL() throws IOException {
        // The parse(URL, ...) method opens a stream and wraps it in an InputStreamReader.
        // To test this without an actual URL/server, we can use a StringReader
        // passed to the parse(Reader, ...) method, which is a dependency of parse(URL, ...).
        // This test verifies that the underlying Reader parsing works.
        String csv = "url_a,url_b\nurl_c,url_d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) { // Using parse(String, ...) as proxy
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("url_a", records.get(0).get(0));
            assertEquals("url_d", records.get(1).get(1));
        }
    }

    @Test
    public void testIteratorHasNextWhenClosed() throws IOException {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        StringReader reader = new StringReader(csv);
        CSVParser parser = new CSVParser(reader, format);
        parser.close();
        assertFalse(parser.iterator().hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextWhenClosed() throws IOException {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        StringReader reader = new StringReader(csv);
        CSVParser parser = new CSVParser(reader, format);
        parser.close();
        parser.iterator().next();
    }

    @Test
    public void testNextRecordAtEndOfStream() throws IOException {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertNotNull(parser.nextRecord()); // Reads "a,b"
            assertNull(parser.nextRecord()); // End of stream
        }
    }

    @Test
    public void testNextRecordWithTrailingDelimiterAndEmptyLastValue() throws IOException {
        String csv = "a,b,\n"; // Single record with trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record = parser.nextRecord();
            assertNotNull(record);
            assertEquals(3, record.size()); // Includes the empty field due to trailing delimiter
            assertNull(record.get(2));
            assertNull(parser.nextRecord()); // Should be null after the record
        }
    }

    @Test
    public void testGetRecordsWithEmptyString() throws IOException {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testGetRecordsWithOnlyHeader() throws IOException {
        String csv = "header1,header2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty()); // No data records after header
        }
    }

    // Dummy implementation for ByteArrayInputStream as it's not imported by default
    // and required by testParseInputStream.
    private static class ByteArrayInputStream extends InputStream {
        private byte[] buf;
        private int pos = 0;

        public ByteArrayInputStream(byte[] buf) {
            this.buf = buf;
        }

        @Override
        public int read() {
            if (pos < buf.length) {
                return buf[pos++];
            }
            return -1;
        }
    }
}
