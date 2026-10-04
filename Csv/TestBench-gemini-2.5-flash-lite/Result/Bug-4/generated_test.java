package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseStringBasic() throws Exception {
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
    public void testParseStringWithHeader() throws Exception {
        String csv = "header1,header2\nval1,val2\nval3,val4";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("val1", records.get(0).get("header1"));
            assertEquals("val4", records.get(1).get("header2"));
        }
    }

    @Test
    public void testParseStringWithHeaderAndSkip() throws Exception {
        String csv = "header1,header2\nval1,val2\nval3,val4";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withSkipHeaderRecord(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            // With skipHeaderRecord true, the first data row is treated as records
            assertEquals("val1", records.get(0).get(0));
            assertEquals("val4", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithCustomDelimiter() throws Exception {
        String csv = "a;b;c\nd;e;f";
        CSVFormat format = CSVFormat.newFormat(';').withHeader(); // Header is irrelevant for this test
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(1).get(2));
        }
    }

    @Test
    public void testParseStringWithQuote() throws Exception {
        String csv = "\"a,b\",c\nd,e,f";
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a,b", records.get(0).get(0));
            assertEquals("c", records.get(0).get(1));
        }
    }

    @Test
    public void testParseStringWithEscape() throws Exception {
        String csv = "a,\"\"\"b\"\"\",c";
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\').withQuoteChar('"');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("\"b\"", records.get(0).get(1));
            assertEquals("c", records.get(0).get(2));
        }
    }

    @Test
    public void testParseStringWithNullString() throws Exception {
        String csv = "a,NULL,c\nd,e,f";
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertNull(records.get(0).get(1));
            assertNotNull(records.get(0).get(0));
        }
    }

    @Test
    public void testParseStringWithIgnoreEmptyLines() throws Exception {
        String csv = "a,b,c\n\nd,e,f";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(1).get(2));
        }
    }

    @Test
    public void testParseStringWithIgnoreSurroundingSpaces() throws Exception {
        String csv = " a , b , c \n d , e , f ";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(1).get(2));
        }
    }

    @Test
    public void testGetRecordsReturnsEmptyListForEmptyString() throws Exception {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testGetRecordsReturnsEmptyListForOnlyHeader() throws Exception {
        String csv = "header1,header2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testIteratorBasic() throws Exception {
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

    @Test
    public void testIteratorWithHeader() throws Exception {
        String csv = "h1,h2\nv1,v2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Iterator<CSVRecord> iterator = parser.iterator();
            assertTrue(iterator.hasNext());
            assertEquals("v1", iterator.next().get("h1"));
            assertFalse(iterator.hasNext());
        }
    }

    @Test
    public void testIteratorEmpty() throws Exception {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Iterator<CSVRecord> iterator = parser.iterator();
            assertFalse(iterator.hasNext());
        }
    }

    @Test
    public void testIteratorAfterClose() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        CSVParser parser = CSVParser.parse(csv, format);
        parser.close();
        assertFalse(parser.iterator().hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextAfterEnd() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Iterator<CSVRecord> iterator = parser.iterator();
            iterator.next(); // Consume the only record
            iterator.next(); // Should throw NoSuchElementException
        }
    }

    @Test
    public void testGetCurrentLineNumberEmptyString() throws Exception {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertEquals(0, parser.getCurrentLineNumber());
        }
    }

    @Test
    public void testGetCurrentLineNumberBasic() throws Exception {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord(); // Reads "a,b"
            assertEquals(1, parser.getCurrentLineNumber());
            parser.nextRecord(); // Reads "c,d"
            assertEquals(2, parser.getCurrentLineNumber());
        }
    }

    @Test
    public void testGetCurrentLineNumberWithMultiLineRecord() throws Exception {
        String csv = "a,\"b\nc\",d"; // Two lines for one record
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord();
            // The line counter is advanced by the ExtendedBufferedReader.
            // For a multi-line quoted string, it should reflect the lines read.
            assertTrue(parser.getCurrentLineNumber() >= 2);
        }
    }

    @Test
    public void testGetRecordNumberBasic() throws Exception {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertNotNull(parser.nextRecord());
            assertEquals(1, parser.getRecordNumber());
            assertNotNull(parser.nextRecord());
            assertEquals(2, parser.getRecordNumber());
            assertNull(parser.nextRecord());
            assertEquals(2, parser.getRecordNumber()); // Should not increment after EOF
        }
    }

    @Test
    public void testGetRecordNumberAfterGetRecords() throws Exception {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals(2, parser.getRecordNumber());
        }
    }

    @Test
    public void testGetHeaderMapEmpty() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertNull(parser.getHeaderMap());
        }
    }

    @Test
    public void testGetHeaderMapWithHeaderArray() throws Exception {
        String csv = "a,b";
        String[] headers = {"col1", "col2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(headers);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(Integer.valueOf(0), headerMap.get("col1"));
            assertEquals(Integer.valueOf(1), headerMap.get("col2"));
        }
    }

    @Test
    public void testGetHeaderMapWithAutoHeader() throws Exception {
        String csv = "col1,col2\na,b";
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
    public void testIsClosed() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        CSVParser parser = CSVParser.parse(csv, format);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testCloseMultipleTimesDoesNotThrowException() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        CSVParser parser = CSVParser.parse(csv, format);
        parser.close();
        parser.close(); // Call close again
        assertTrue(parser.isClosed());
    }

    @Test
    public void testParseStringWithComment() throws Exception {
        String csv = "#comment\na,b\n#another comment\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(1));
            assertNull(records.get(0).getComment());
            assertNull(records.get(1).getComment());
        }
    }

    @Test
    public void testParseStringWithCommentAndAttachedComment() throws Exception {
        String csv = "# This is a comment\na,b";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record = parser.nextRecord();
            assertNotNull(record);
            assertEquals("a", record.get(0));
            // The comment is attached to the *next* record, not the record that contains the comment line itself.
            // If the first line is a comment, and the next line is data, the comment belongs to the data record.
            assertEquals("This is a comment", record.getComment());
        }
    }

    @Test
    public void testNextRecordReturnsNullAtEndOfFile() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord(); // Read the first record
            assertNull(parser.nextRecord()); // Should be null at EOF
        }
    }

    @Test
    public void testNextRecordWithEmptyLinesIgnored() throws Exception {
        String csv = "a,b\n\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord r1 = parser.nextRecord();
            assertNotNull(r1);
            assertEquals("a", r1.get(0));
            CSVRecord r2 = parser.nextRecord();
            assertNotNull(r2);
            assertEquals("c", r2.get(0));
            assertNull(parser.nextRecord());
        }
    }

    @Test
    public void testNextRecordWithEmptyLinesNotIgnored() throws Exception {
        String csv = "a,b\n\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord r1 = parser.nextRecord();
            assertNotNull(r1);
            assertEquals("a", r1.get(0));
            CSVRecord r2 = parser.nextRecord();
            assertNotNull(r2);
            // When empty lines are not ignored, an empty line should result in an empty record.
            assertEquals(0, r2.size());
            CSVRecord r3 = parser.nextRecord();
            assertNotNull(r3);
            assertEquals("c", r3.get(0));
            assertNull(parser.nextRecord());
        }
    }

    @Test
    public void testGetRecordNumberAfterMultipleNextRecordCalls() throws Exception {
        String csv = "line1\nline2\nline3";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord();
            assertEquals(1, parser.getRecordNumber());
            parser.nextRecord();
            assertEquals(2, parser.getRecordNumber());
            parser.nextRecord();
            assertEquals(3, parser.getRecordNumber());
            assertNull(parser.nextRecord());
            assertEquals(3, parser.getRecordNumber());
        }
    }
}
