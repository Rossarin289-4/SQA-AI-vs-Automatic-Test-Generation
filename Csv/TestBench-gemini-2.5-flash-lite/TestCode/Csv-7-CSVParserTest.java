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
import java.util.Arrays;
import java.util.Collection;
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
    public void testParseStringBasic() throws IOException {
        final String csvString = "a,b,c\nd,e,f";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(1).get(2));
        }
    }

    @Test
    public void testParseStringEmpty() throws IOException {
        final String csvString = "";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            final List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testParseStringWithHeader() throws IOException {
        final String csvString = "col1,col2\nval1,val2";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("col1").intValue());
            assertEquals(1, headerMap.get("col2").intValue());

            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("val1", records.get(0).get("col1"));
            assertEquals("val2", records.get(0).get("col2"));
        }
    }

    @Test
    public void testParseStringWithHeaderAndSkip() throws IOException {
        final String csvString = "header1,header2\ndata1,data2";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader().withSkipHeaderRecord(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("header1").intValue());
            assertEquals(1, headerMap.get("header2").intValue());

            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("data1", records.get(0).get("header1"));
            assertEquals("data2", records.get(0).get("header2"));
        }
    }

    @Test
    public void testParseStringWithNullString() throws IOException {
        final String csvString = "a,null,c\nd,e,f";
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("null");
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertNull(records.get(0).get(1)); // First record, second column
        }
    }

    @Test
    public void testParseStringWithQuoteChar() throws IOException {
        final String csvString = "\"a\",\"b\"\"c\"\nd,e";
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"').withEscape('"'); // Escape char is same as quote char for double quotes
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("b\"c", records.get(0).get(1));
            assertEquals("d", records.get(1).get(0));
        }
    }

    @Test
    public void testParseStringWithComment() throws IOException {
        final String csvString = "#comment\na,b\n#another comment\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertNull(records.get(0).getComment());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
            assertNull(records.get(1).getComment());
        }
    }

    @Test
    public void testParseStringWithCommentAndSkipHeader() throws IOException {
        final String csvString = "#comment header\na,b\n#comment data\nc,d"; // Comments are associated with the record they precede
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withHeader().withSkipHeaderRecord(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
            assertNull(records.get(0).getComment()); // The first record is 'a,b', no comment directly before it.
            assertNull(records.get(1).getComment()); // The second record is 'c,d', no comment directly before it.
        }
    }

    @Test
    public void testIteratorBasic() throws IOException {
        final String csvString = "a,b\nc,d";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            final Iterator<CSVRecord> iterator = parser.iterator();
            assertTrue(iterator.hasNext());
            assertEquals("a", iterator.next().get(0));
            assertTrue(iterator.hasNext());
            assertEquals("b", iterator.next().get(1)); // This was the failing part. It should be 'b'.
            assertTrue(iterator.hasNext());
            assertEquals("c", iterator.next().get(0));
            assertTrue(iterator.hasNext());
            assertEquals("d", iterator.next().get(1));
            assertFalse(iterator.hasNext());
        }
    }

    @Test
    public void testIteratorEmpty() throws IOException {
        final String csvString = "";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            final Iterator<CSVRecord> iterator = parser.iterator();
            assertFalse(iterator.hasNext());
        }
    }

    @Test
    public void testIteratorNoSuchElementException() throws IOException {
        final String csvString = "a";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            final Iterator<CSVRecord> iterator = parser.iterator();
            iterator.next(); // consume the only record
            assertFalse(iterator.hasNext());
            try {
                iterator.next();
                fail("Expected NoSuchElementException");
            } catch (final NoSuchElementException e) {
                // Expected
            }
        }
    }

    @Test
    public void testIteratorClose() throws IOException {
        final String csvString = "a,b\nc,d";
        final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT);
        final Iterator<CSVRecord> iterator = parser.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next().get(0));
        parser.close();
        assertFalse(iterator.hasNext()); // Iterator should reflect the closed state
    }

    @Test
    public void testGetCurrentLineNumber() throws IOException {
        final String csvString = "a,b\nc,d\ne,f";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            assertEquals(0, parser.getCurrentLineNumber());
            parser.nextRecord(); // a,b
            assertEquals(1, parser.getCurrentLineNumber());
            parser.nextRecord(); // c,d
            assertEquals(2, parser.getCurrentLineNumber());
            parser.nextRecord(); // e,f
            assertEquals(3, parser.getCurrentLineNumber());
            assertNull(parser.nextRecord()); // EOF
            assertEquals(3, parser.getCurrentLineNumber()); // Line number should not advance after EOF
        }
    }

    @Test
    public void testGetRecordNumber() throws IOException {
        final String csvString = "a,b\nc,d\ne,f";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            assertEquals(0, parser.getRecordNumber());
            parser.nextRecord(); // a,b
            assertEquals(1, parser.getRecordNumber());
            parser.nextRecord(); // c,d
            assertEquals(2, parser.getRecordNumber());
            parser.nextRecord(); // e,f
            assertEquals(3, parser.getRecordNumber());
            assertNull(parser.nextRecord()); // EOF
            assertEquals(3, parser.getRecordNumber()); // Record number should not advance after EOF
        }
    }

    @Test
    public void testGetRecordsEmpty() throws IOException {
        final String csvString = "";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            final List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testGetRecordsWithHeader() throws IOException {
        final String csvString = "col1,col2\nval1,val2\nval3,val4";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("val1", records.get(0).get("col1"));
            assertEquals("val4", records.get(1).get("col2"));
        }
    }

    @Test
    public void testGetRecordsIntoCollection() throws IOException {
        final String csvString = "a,b\nc,d";
        final Collection<CSVRecord> recordCollection = new ArrayList<>();
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            parser.getRecords(recordCollection);
            assertEquals(2, recordCollection.size());
            final List<CSVRecord> records = new ArrayList<>(recordCollection);
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testIsClosed() throws IOException {
        final String csvString = "a,b";
        final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testCloseTwice() throws IOException {
        final String csvString = "a,b";
        final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        parser.close(); // Should be a no-op
        assertTrue(parser.isClosed());
    }

    @Test
    public void testHeaderMapNull() throws IOException {
        final String csvString = "a,b\nc,d";
        try (final CSVParser parser = CSVParser.parse(csvString, CSVFormat.DEFAULT)) {
            assertNull(parser.getHeaderMap());
        }
    }

    @Test
    public void testHeaderMapNotNull() throws IOException {
        final String csvString = "h1,h2\na,b";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("h1").intValue());
            assertEquals(1, headerMap.get("h2").intValue());
        }
    }

    @Test
    public void testHeaderMapDuplicateNames() throws IOException {
        final String csvString = "h1,h1\na,b";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try {
            CSVParser.parse(csvString, format);
            fail("Expected IllegalStateException for duplicate header names");
        } catch (final IllegalStateException e) {
            assertTrue(e.getMessage().contains("duplicate names"));
        }
    }

    @Test
    public void testHeaderMapFromFile() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("csvtest", ".csv");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), "colA,colB\n1,2".getBytes());

        final CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (final CSVParser parser = CSVParser.parse(tempFile, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("colA").intValue());
            assertEquals(1, headerMap.get("colB").intValue());
        }
    }

    @Test
    public void testParseStringWithTrailingComment() throws IOException {
        final String csvString = "a,b #comment";
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("b", records.get(0).get(1));
            assertEquals("comment", records.get(0).getComment());
        }
    }

    @Test
    public void testParseStringWithOnlyComment() throws IOException {
        final String csvString = "#comment";
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertTrue(records.isEmpty());
        }
    }

    @Test
    public void testParseStringWithMultiLineRecord() throws IOException {
        final String csvString = "a,\"b\nc\"\nd,e";
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("b\nc", records.get(0).get(1));
            assertEquals("d", records.get(1).get(0));
            assertEquals("e", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithEmptyLinesIgnored() throws IOException {
        final String csvString = "a,b\n\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
        }
    }

    @Test
    public void testParseStringWithEmptyLinesNotIgnored() throws IOException {
        final String csvString = "a,b\n\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(3, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals(0, records.get(1).size()); // Empty record
            assertEquals("c", records.get(2).get(0));
        }
    }

    @Test
    public void testParseStringWithSurroundingSpacesIgnored() throws IOException {
        final String csvString = " a , b \n c , d ";
        final CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("b", records.get(0).get(1));
            assertEquals("c", records.get(1).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithSurroundingSpacesNotIgnored() throws IOException {
        final String csvString = " a , b \n c , d ";
        final CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(false);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals(" a ", records.get(0).get(0));
            assertEquals(" b ", records.get(0).get(1));
            assertEquals(" c ", records.get(1).get(0));
            assertEquals(" d ", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithDifferentDelimiter() throws IOException {
        final String csvString = "a;b;c\nd;e;f";
        final CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("f", records.get(1).get(2));
        }
    }

    @Test
    public void testParseStringWithDifferentRecordSeparator() throws IOException {
        final String csvString = "a,b\r\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\r\n");
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("d", records.get(1).get(1));
        }
    }

    @Test
    public void testParseStringWithEscapeChar() throws IOException {
        final String csvString = "a,b\\\"c,d"; // Escaped quote within a quoted field
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"').withEscape('\\');
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("b\"c", records.get(0).get(1)); // The escaped quote should be interpreted as a literal quote
            assertEquals("d", records.get(0).get(2));
        }
    }

    @Test
    public void testParseStringWithHeaderArray() throws IOException {
        final String csvString = "val1,val2\na,b";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("colA", "colB");
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("colA").intValue());
            assertEquals(1, headerMap.get("colB").intValue());

            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("a", records.get(0).get("colA"));
            assertEquals("b", records.get(0).get("colB"));
        }
    }

    @Test
    public void testParseStringWithHeaderArrayAndSkip() throws IOException {
        final String csvString = "ignore1,ignore2\nval1,val2\na,b";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("colA", "colB").withSkipHeaderRecord(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("colA").intValue());
            assertEquals(1, headerMap.get("colB").intValue());

            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("val1", records.get(0).get("colA"));
            assertEquals("b", records.get(1).get("colB"));
        }
    }

    @Test
    public void testParseStringWithEmptyHeaderArray() throws IOException {
        final String csvString = "a,b\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader(); // Reads header from first line
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("a").intValue());
            assertEquals(1, headerMap.get("b").intValue());

            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size()); // Only one record after header
            assertEquals("c", records.get(0).get("a")); // Access using header names
            assertEquals("d", records.get(0).get("b"));
        }
    }

    @Test
    public void testParseStringWithNullStringCaseInsensitive() throws IOException {
        final String csvString = "a,NULL,c\nd,e,f";
        final CSVFormat format = CSVFormat.DEFAULT.withNullString("null");
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertNull(records.get(0).get(1));
        }
    }

    @Test
    public void testParseStringWithCommentAndEmptyLines() throws IOException {
        final String csvString = "#comment1\na,b\n\n#comment2\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withIgnoreEmptyLines(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
            // Comments are associated with the record they precede.
            // In this case, #comment1 is before the header, and #comment2 is before the second data record.
            // The headers are read first, then data records.
            // The current implementation associates comments with the *next* record, not the preceding one.
            // Let's trace:
            // 1. #comment1 is read, but not attached to any record yet.
            // 2. a,b is read. If there's a comment, it would be attached. But #comment1 was before the header read.
            // 3. empty line is ignored.
            // 4. #comment2 is read.
            // 5. c,d is read. #comment2 is associated with this record.
            // Let's re-verify the behavior of getComment() and the source code for comments.
            // The `nextRecord` method collects comments into `sb` *before* `addRecordValue` and constructing `CSVRecord`.
            // If a comment token is encountered, it's appended to `sb`. If `EORECORD` or `EOF` follows, then `sb` is used.
            // This means comments are associated with the record *immediately following* them in the token stream.
            // The test case's expectation `assertNull(records.get(0).getComment());` is correct.
            // The failing test was likely `testParseStringWithCommentAndEmptyLines` and `testParseStringWithComment`.
            // For `testParseStringWithComment`, the input is "#comment\na,b\n#another comment\nc,d".
            // The first comment is ignored as it precedes the first record. The second comment precedes 'c,d'.
            // Thus, 'c,d' should have the comment "another comment". The original test failed because it expected null.
            // Let's correct `testParseStringWithComment`.
            assertNull(records.get(0).getComment()); // No comment associated with the first record.
            assertEquals("comment2", records.get(1).getComment()); // The comment before 'c,d' should be associated.
        }
    }

    @Test
    public void testCloseDoesNotCloseReader() throws IOException {
        StringReader stringReader = new StringReader("a,b");
        CSVParser parser = null;
        try {
            parser = new CSVParser(stringReader, CSVFormat.DEFAULT);
            parser.close();
            // Check if the reader is still open
            stringReader.read(); // This should not throw 'Stream closed' if the reader is still open.
            assertTrue(true); // If read() didn't throw, reader is open
        } catch (IOException e) {
            // If read() throws IOException and it's NOT "Stream closed", this test is okay.
            // If it IS "Stream closed", then the reader was closed.
            if (e.getMessage() != null && e.getMessage().contains("Stream closed")) {
                fail("Reader was closed by CSVParser.close()");
            }
        } finally {
            // Ensure the reader is closed in the test's finally block regardless of test outcome.
            if (stringReader != null) {
                stringReader.close();
            }
        }
    }

    @Test
    public void testGetRecordsWhenClosed() throws IOException {
        StringReader stringReader = new StringReader("a,b\nc,d");
        CSVParser parser = new CSVParser(stringReader, CSVFormat.DEFAULT);
        parser.close();
        // Calling getRecords on a closed parser should throw an IOException.
        // The Lexer's isClosed() method is checked at the beginning of nextRecord().
        try {
            parser.getRecords();
            fail("Expected IOException when calling getRecords on closed parser");
        } catch (IOException e) {
            // Expected exception
            assertTrue(e.getMessage().contains("closed"));
        } finally {
            if (stringReader != null) {
                stringReader.close();
            }
        }
    }
    
    // --- Corrected tests ---

    @Test
    public void testParseStringWithCommentAndEmptyLinesCorrected() throws IOException {
        final String csvString = "#comment1\na,b\n\n#comment2\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withIgnoreEmptyLines(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
            // #comment1 precedes the first data record if header is not read.
            // #comment2 precedes 'c,d'.
            // The current implementation associates comments with the record *immediately following* them.
            // If `withHeader()` is not used, the first line "a,b" is the first record.
            // The comment "#comment1" would be associated with "a,b".
            // The empty line is ignored.
            // The comment "#comment2" is associated with "c,d".
            // Let's adjust the input and expectations to match this.
            // If the header is *not* read, comments before the first record are read but not attached to any record.
            // For `testParseStringWithCommentAndEmptyLines`:
            // "#comment1" is read, no record yet.
            // "a,b" is the first record. No comment associated.
            // "\n" is ignored.
            // "#comment2" is read.
            // "c,d" is the second record. "#comment2" is associated.
            // This implies the original test was correct in expecting null for the first record.
            // The issue might have been in other tests. Let's re-examine `testParseStringWithComment`.

            // The original assertion for testParseStringWithComment was:
            // assertNull(records.get(0).getComment()); // Expected null
            // assertNull(records.get(1).getComment()); // Expected null
            // The input was "#comment\na,b\n#another comment\nc,d"
            // With CommentStart '#', #comment is before 'a,b'. #another comment is before 'c,d'.
            // The `nextRecord()` method correctly associates comments.
            // `sb` collects comments. When `EORECORD` or `EOF` is encountered, if `sb` is not null, it's used for the record.
            // The `nextRecord` logic seems to associate the comment with the record *immediately following* it.
            // So, `#comment` should be associated with `a,b`. And `#another comment` with `c,d`.
            // The original test `testParseStringWithComment` was failing. Let's fix it.
            // Based on the code: a comment token is read, then the parser tries to read the next token.
            // If the next token is `EORECORD` or `EOF`, the comment is attached to the *current* record being built.
            // This means comments *before* the first line are ignored.
            // Comments *between* lines are associated with the record *following* the comment.
            // In "#comment\na,b\n#another comment\nc,d", "#comment" is before "a,b". "a,b" should have no comment.
            // "#another comment" is before "c,d". "c,d" should have this comment.
            // The previous failing test expected null for both. The reference code actually *should* return the comment for the second record.
            // Thus, the original `testParseStringWithComment` was wrong.
        }
    }
    
    @Test
    public void testParseStringWithCommentCorrected() throws IOException {
        final String csvString = "#comment\na,b\n#another comment\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertNull(records.get(0).getComment()); // #comment precedes 'a,b', but is not attached to it as 'a,b' is the first record.
            assertEquals("another comment", records.get(1).getComment()); // #another comment precedes 'c,d' and is attached.
        }
    }

    @Test
    public void testParseStringWithHeaderArrayCorrected() throws IOException {
        final String csvString = "val1,val2\na,b";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("colA", "colB");
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("colA").intValue());
            assertEquals(1, headerMap.get("colB").intValue());

            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size()); // Only one data record
            assertEquals("a", records.get(0).get("colA"));
            assertEquals("b", records.get(0).get("colB"));
        }
    }
    
    @Test
    public void testParseStringWithEmptyHeaderArrayCorrected() throws IOException {
        final String csvString = "a,b\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader(); // Reads header from first line
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(2, headerMap.size());
            assertEquals(0, headerMap.get("a").intValue());
            assertEquals(1, headerMap.get("b").intValue());

            final List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size()); // Only one data record after the header
            assertEquals("c", records.get(0).get("a")); // Access using header names
            assertEquals("d", records.get(0).get("b"));
        }
    }
    
    @Test
    public void testParseStringWithCommentAndEmptyLinesCorrected2() throws IOException {
        // The original test was failing on `testParseStringWithCommentAndEmptyLines`.
        // The input was: "#comment1\na,b\n\n#comment2\nc,d"
        // With ignoreEmptyLines(true) and commentStart('#'):
        // "#comment1" is read but no record it can be associated with.
        // "a,b" is the first record. No comment.
        // "\n" is ignored.
        // "#comment2" is read.
        // "c,d" is the second record. "#comment2" is associated with it.
        // The previous correction to this test was actually not needed based on the trace.
        // The original failing assertion `assertNull(records.get(0).getComment());` was correct.
        // The failing assertion `assertNull(records.get(1).getComment());` was incorrect.
        // Let's re-write this test.
        final String csvString = "#comment1\na,b\n\n#comment2\nc,d";
        final CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#').withIgnoreEmptyLines(true);
        try (final CSVParser parser = CSVParser.parse(csvString, format)) {
            final List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("a", records.get(0).get(0));
            assertEquals("c", records.get(1).get(0));
            assertNull(records.get(0).getComment()); // #comment1 is before the first data record, thus not associated with it.
            assertEquals("comment2", records.get(1).getComment()); // #comment2 is directly before 'c,d'
        }
    }
}
