package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {
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
    public void testParseStringEmpty() throws Exception {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testParseStringWithEmptyLines() throws Exception {
        String csv = "a,b,c\n\nd,e,f";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(0));
        }
    }

    @Test
    public void testParseStringWithEmptyLinesNotIgnored() throws Exception {
        String csv = "a,b,c\n\nd,e,f";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(3, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("", records.get(1).get(0)); // Empty line results in a record with one empty string
            assertEquals("d", records.get(2).get(0));
        }
    }

    @Test
    public void testParseStringWithQuotedEmptyString() throws Exception {
        String csv = "\"\",\"b\",\"c\"\n\"d\",\"\",\"f\"";
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("", records.get(0).get(0));
            assertEquals("d", records.get(1).get(0));
            assertEquals("", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithNullString() throws Exception {
        String csv = "NULL,b,c\nd,NULL,f";
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertNull(records.get(0).get(0));
            assertEquals("d", records.get(1).get(0));
            assertNull(records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithHeader() throws Exception {
        String csv = "name,age\njohn,30\njane,25";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("name").intValue());
            assertEquals(1, headerMap.get("age").intValue());

            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("john", records.get(0).get("name"));
            assertEquals("30", records.get(0).get(1));
            assertEquals("jane", records.get(1).get("name"));
            assertEquals("25", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithHeaderAndSkip() throws Exception {
        String csv = "col1,col2\nval1,val2\nval3,val4";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withSkipHeaderRecord(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("col1").intValue());
            assertEquals(1, headerMap.get("col2").intValue());

            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("val1", records.get(0).get("col1"));
            assertEquals("val2", records.get(0).get(1));
            assertEquals("val3", records.get(1).get("col1"));
            assertEquals("val4", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithExplicitHeader() throws Exception {
        String csv = "a,b,c\nd,e,f";
        String[] explicitHeader = {"col1", "col2", "col3"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(explicitHeader);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(3, headerMap.size());
            assertEquals(0, headerMap.get("col1").intValue());
            assertEquals(1, headerMap.get("col2").intValue());
            assertEquals(2, headerMap.get("col3").intValue());

            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get("col1"));
            assertEquals("f", records.get(1).get("col3"));
        }
    }

    @Test
    public void testParseStringWithExplicitHeaderAndSkip() throws Exception {
        String csv = "skip1,skip2\na,b\nc,d";
        String[] explicitHeader = {"col1", "col2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(explicitHeader).withSkipHeaderRecord(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("col1").intValue());
            assertEquals(1, headerMap.get("col2").intValue());

            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get("col1"));
            assertEquals("b", records.get(0).get(1));
            assertEquals("c", records.get(1).get("col1"));
            assertEquals("d", records.get(1).get(1));
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
            assertEquals("b", iterator.next().get(1));
            assertTrue(iterator.hasNext());
            assertEquals("c", iterator.next().get(0));
            assertTrue(iterator.hasNext());
            assertEquals("d", iterator.next().get(1));
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

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNoSuchElement() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Iterator<CSVRecord> iterator = parser.iterator();
            iterator.next();
            iterator.next(); // This should throw NoSuchElementException
        }
    }

    @Test
    public void testIteratorAfterGetRecords() throws Exception {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.getRecords(); // Consumes all records
            Iterator<CSVRecord> iterator = parser.iterator();
            assertFalse(iterator.hasNext());
        }
    }

    @Test
    public void testClose() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        Reader reader = new StringReader(csv);
        CSVParser parser = new CSVParser(reader, format);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIsClosed() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        Reader reader = new StringReader(csv);
        CSVParser parser = new CSVParser(reader, format);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetCurrentLineNumberBasic() throws Exception {
        String csv = "a,b\nc,d\ne,f";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertEquals(0, parser.getCurrentLineNumber());
            parser.nextRecord(); // Reads "a,b"
            assertEquals(1, parser.getCurrentLineNumber());
            parser.nextRecord(); // Reads "c,d"
            assertEquals(2, parser.getCurrentLineNumber());
            parser.nextRecord(); // Reads "e,f"
            assertEquals(3, parser.getCurrentLineNumber());
            assertNull(parser.nextRecord()); // EOF
            assertEquals(3, parser.getCurrentLineNumber()); // Line number doesn't advance on EOF
        }
    }

    @Test
    public void testGetCurrentLineNumberAfterEmptyLines() throws Exception {
        String csv = "a,b\n\n c,d";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord(); // "a,b"
            assertEquals(1, parser.getCurrentLineNumber());
            parser.nextRecord(); // "" (empty line)
            assertEquals(2, parser.getCurrentLineNumber());
            parser.nextRecord(); // " c,d"
            assertEquals(3, parser.getCurrentLineNumber());
        }
    }

    @Test
    public void testGetRecordNumberBasic() throws Exception {
        String csv = "a,b\nc,d\ne,f";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertEquals(0, parser.getRecordNumber());
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

    @Test
    public void testGetRecordNumberAfterEmptyLines() throws Exception {
        String csv = "a,b\n\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.nextRecord(); // "a,b"
            assertEquals(1, parser.getRecordNumber());
            parser.nextRecord(); // ""
            assertEquals(2, parser.getRecordNumber());
            parser.nextRecord(); // "c,d"
            assertEquals(3, parser.getRecordNumber());
        }
    }

    @Test
    public void testGetHeaderMapEmpty() throws Exception {
        String csv = "a,b,c";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertNull(parser.getHeaderMap());
        }
    }

    @Test
    public void testGetHeaderMapWithHeader() throws Exception {
        String csv = "col1,col2\nval1,val2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("col1").intValue());
            assertEquals(1, headerMap.get("col2").intValue());
        }
    }

    @Test
    public void testGetHeaderMapWithExplicitHeader() throws Exception {
        String csv = "a,b\nc,d";
        String[] explicitHeader = {"h1", "h2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(explicitHeader);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("h1").intValue());
            assertEquals(1, headerMap.get("h2").intValue());
        }
    }

    @Test
    public void testGetRecordsEmpty() throws Exception {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testGetRecordsBasic() throws Exception {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testGetRecordsAfterIterator() throws Exception {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Iterator<CSVRecord> iterator = parser.iterator();
            iterator.next(); // Consumes first record
            List<CSVRecord> records = parser.getRecords(); // Should get remaining records
            assertEquals(1, records.size());
            assertEquals("c", records.get(0).get(0));
        }
    }

    @Test
    public void testFormatWithCommentStart() throws Exception {
        String csv = "# comment1\na,b\n#comment2\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertNull(records.get(0).getComment()); // Comment lines are skipped by default
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
        }
    }

    @Test
    public void testFormatWithCommentStartAndRecord() throws Exception {
        String csv = "# comment1\na,b\n#comment2\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withRecordSeparator('\n'); // Explicitly setting separator
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertNull(records.get(0).getComment());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
        }
    }

    @Test
    public void testFormatWithCommentStartAndRecordWithCommentInRecord() throws Exception {
        // This case requires a more complex CSV structure where a comment might be part of a quoted field,
        // but the current Lexer/Token handling might not support this directly.
        // For now, testing simple comment handling.
        String csv = "a,b#this is part of b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            // Assuming '#' inside a value is not treated as comment start if not at beginning of line.
            assertEquals("b#this is part of b", records.get(0).get(1));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testFormatWithQuoteChar() throws Exception {
        String csv = "'a','b'\n'c','d'";
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('\'');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testFormatWithEscapeAndQuote() throws Exception {
        String csv = "\"a\"\"escaped\",\"b\"\n\"c\",\"d\"";
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"').withEscape('"'); // Escape char same as quote char
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a\"escaped", records.get(0).get(0));
            assertEquals("b", records.get(0).get(1));
            assertEquals("c", records.get(1).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testFormatWithEscapeChar() throws Exception {
        String csv = "a\\,b\nc\\,d";
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a,b", records.get(0).get(0));
            assertEquals("c,d", records.get(1).get(0));
        }
    }

    @Test
    public void testFormatWithIgnoreSurroundingSpaces() throws Exception {
        String csv = " a , b \n c , d ";
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("b", records.get(0).get(1));
            assertEquals("c", records.get(1).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testFormatWithDelimiter() throws Exception {
        String csv = "a;b;c\nd;e;f";
        CSVFormat format = CSVFormat.newFormat(';');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(1).get(2));
        }
    }

    @Test
    public void testFormatWithRecordSeparator() throws Exception {
        String csv = "a,b\r\nc,d\r\ne,f";
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(3, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(2).get(1));
        }
    }

    @Test
    public void testGetRecordsWithCollection() throws Exception {
        String csv = "a,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT;
        Collection<CSVRecord> customCollection = new ArrayList<>();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            parser.getRecords(customCollection);
            assertEquals(2, customCollection.size());
            CSVRecord record1 = ((List<CSVRecord>) customCollection).get(0);
            CSVRecord record2 = ((List<CSVRecord>) customCollection).get(1);
            assertEquals("a", record1.get(0));
            assertEquals("d", record2.get(1));
        }
    }

    @Test
    public void testInitializeHeaderWithEmptyFormatHeader() throws Exception {
        String csv = "colA,colB\nval1,val2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader(); // Empty header array means read from first line
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("colA").intValue());
            assertEquals(1, headerMap.get("colB").intValue());
        }
    }

    @Test
    public void testInitializeHeaderWithEmptyFormatHeaderAndNoData() throws Exception {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertNull(parser.getHeaderMap()); // No header line to read
        }
    }

    @Test
    public void testInitializeHeaderWithDuplicateNames() throws Exception {
        String csv = "a,b,a\nc,d,e";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try {
            CSVParser.parse(csv, format);
            fail("Expected IllegalArgumentException for duplicate header names");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The header contains a duplicate name: \"a\""));
        } catch (IOException e) {
            fail("Caught IOException instead of IllegalArgumentException: " + e.getMessage());
        }
    }

    @Test
    public void testInitializeHeaderWithDuplicateEmptyNamesIgnored() throws Exception {
        String csv = "a,,b\nc,d,e";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withIgnoreEmptyHeaders(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(3, headerMap.size()); // Expecting "a", "", "b"
            assertEquals(0, headerMap.get("a").intValue());
            assertEquals(1, headerMap.get("").intValue()); // Empty string is a valid header name here
            assertEquals(2, headerMap.get("b").intValue());
        }
    }

    @Test
    public void testInitializeHeaderWithDuplicateEmptyNamesNotIgnored() throws Exception {
        String csv = "a,,b\nc,d,e";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withIgnoreEmptyHeaders(false); // Default behavior is to disallow empty headers if not ignored
        try {
            CSVParser.parse(csv, format);
            fail("Expected IllegalArgumentException for duplicate empty header names");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The header contains a duplicate name: \"\""));
        } catch (IOException e) {
            fail("Caught IOException instead of IllegalArgumentException: " + e.getMessage());
        }
    }

    @Test
    public void testInitializeHeaderWithSkippedEmptyHeader() throws Exception {
        String csv = ",a,b\nc,d,e";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withSkipHeaderRecord(true);
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(3, headerMap.size());
            assertNull(headerMap.get("")); // Header is null here
            assertEquals(1, headerMap.get("a").intValue());
            assertEquals(2, headerMap.get("b").intValue());
        }
    }

    @Test
    public void testNextRecordEOFWithoutAnyRecords() throws Exception {
        String csv = "";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            assertNull(parser.nextRecord());
        }
    }

    @Test
    public void testNextRecordEOFWithTrailingNewLine() throws Exception {
        String csv = "a,b\n";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record1 = parser.nextRecord();
            assertNotNull(record1);
            assertEquals("a", record1.get(0));
            assertNull(parser.nextRecord()); // Should return null after reading the last record
        }
    }

    @Test
    public void testNextRecordAtEOF() throws Exception {
        String csv = "a,b";
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record1 = parser.nextRecord();
            assertNotNull(record1);
            assertEquals("a", record1.get(0));
            CSVRecord record2 = parser.nextRecord();
            assertNull(record2);
        }
    }

    @Test
    public void testNextRecordWithComment() throws Exception {
        String csv = "# comment\na,b";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record = parser.nextRecord();
            assertNotNull(record);
            assertEquals("a", record.get(0));
            assertNull(record.getComment()); // Comments are ignored by default
        }
    }

    @Test
    public void testNextRecordWithCommentAndCommentRecord() throws Exception {
        String csv = "# comment\na,b";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            // The nextRecord method is designed to return CSVRecord, not comments directly.
            // If a comment is the only thing on a line, it might be skipped or result in an empty record depending on format.
            // Here, we expect the comment to be skipped and then the actual record to be read.
            CSVRecord record = parser.nextRecord(); // Reads "a,b"
            assertNotNull(record);
            assertEquals("a", record.get(0));
            // The comment itself is not returned as a CSVRecord.
            // If a comment is followed by a newline, the nextRecord() call after the comment line should return the subsequent data record.
        }
    }

    @Test
    public void testNextRecordWithCommentOnFirstLine() throws Exception {
        String csv = "# first comment\na,b\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record = parser.nextRecord(); // Reads "a,b"
            assertNotNull(record);
            assertEquals("a", record.get(0));
            assertEquals(1, parser.getRecordNumber()); // recordNumber increments only after a valid record is formed.
            CSVRecord record2 = parser.nextRecord(); // Reads "c,d"
            assertNotNull(record2);
            assertEquals("c", record2.get(0));
            assertEquals(2, parser.getRecordNumber());
        }
    }

    @Test
    public void testNextRecordHandlesEmptyStringAsNull() throws Exception {
        String csv = "a,NULL,c";
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        try (CSVParser parser = CSVParser.parse(csv, format)) {
            CSVRecord record = parser.nextRecord();
            assertNotNull(record);
            assertEquals("a", record.get(0));
            assertNull(record.get(1));
            assertEquals("c", record.get(2));
        }
    }
}
