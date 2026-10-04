```java
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.net.URL;
import org.mockito.Mockito; // Added for mock objects

public class CSVFormatTest {

    @Test
    public void testDefaultFormat() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        assertEquals("\r\n", format.getRecordSeparator());
        assertTrue(format.getIgnoreEmptyLines());
        assertFalse(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testExcelFormat() throws Exception {
        CSVFormat format = CSVFormat.EXCEL; // Corrected typo: CSVEL to CSVFormat
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        assertEquals("\r\n", format.getRecordSeparator());
        assertFalse(format.getIgnoreEmptyLines());
        assertTrue(format.getAllowMissingColumnNames());
    }

    @Test
    public void testMySqlFormat() throws Exception {
        CSVFormat format = CSVFormat.MYSQL;
        assertEquals('\t', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertEquals('\n', format.getRecordSeparator());
        assertFalse(format.getIgnoreEmptyLines());
        assertTrue(format.isEscapeCharacterSet());
        assertEquals("\\N", format.getNullString());
    }

    @Test
    public void testRfc4180Format() throws Exception {
        CSVFormat format = CSVFormat.RFC4180;
        assertEquals(',', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        assertEquals("\r\n", format.getRecordSeparator());
        assertFalse(format.getIgnoreEmptyLines());
    }

    @Test
    public void testTdfFormat() throws Exception {
        CSVFormat format = CSVFormat.TDF;
        assertEquals('\t', format.getDelimiter());
        assertEquals('"', format.getQuoteCharacter().charValue());
        assertEquals("\r\n", format.getRecordSeparator());
        assertTrue(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testNewFormatWithDelimiter() throws Exception {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getRecordSeparator());
        assertFalse(format.getIgnoreEmptyLines());
    }

    @Test
    public void testNewFormatWithDelimiterAndQuote() throws Exception {
        // The newFormat method only takes one char argument. This test needs to be removed or adapted.
        // Adapting to use withDelimiter and withQuote separately.
        CSVFormat format = CSVFormat.newFormat(';').withQuote('\'');
        assertEquals(';', format.getDelimiter());
        assertEquals('\'', format.getQuoteCharacter().charValue());
        assertNull(format.getRecordSeparator());
        assertFalse(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithDelimiter() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter('|');
        assertEquals('|', format.getDelimiter());
    }

    @Test
    public void testWithQuoteCharacter() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('\'');
        assertEquals('\'', format.getQuoteCharacter().charValue());
    }

    @Test
    public void testWithEscapeCharacter() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals('\\', format.getEscapeCharacter().charValue());
    }

    @Test
    public void testWithRecordSeparator() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        assertEquals("\n", format.getRecordSeparator());
    }

    @Test
    public void testWithNullString() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", format.getNullString());
    }

    @Test
    public void testWithIgnoreEmptyLines() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithCommentMarker() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals('#', format.getCommentMarker().charValue());
    }

    @Test
    public void testWithHeader() throws Exception {
        String[] header = {"col1", "col2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        assertArrayEquals(header, format.getHeader());
    }

    @Test
    public void testWithHeaderEnum() throws Exception {
        // Moved enum outside the method to fix compilation error
        CSVFormat format = CSVFormat.DEFAULT.withHeader(MyHeader.class);
        assertArrayEquals(new String[]{"ID", "Name"}, format.getHeader());
    }

    @Test
    public void testWithSkipHeaderRecord() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testWithTrailingDelimiter() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true);
        assertTrue(format.getTrailingDelimiter());
    }

    @Test
    public void testWithTrim() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withTrim(true);
        assertTrue(format.getTrim());
    }

    @Test
    public void testWithQuoteMode() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }

    @Test
    public void testWithAllowMissingColumnNames() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        assertTrue(format.getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreHeaderCase() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);
        assertTrue(format.getIgnoreHeaderCase());
    }

    @Test
    public void testWithHeaderComments() throws Exception {
        String[] comments = {"comment1", "comment2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments(comments);
        assertArrayEquals(comments, format.getHeaderComments());
    }

    @Test
    public void testFormatWithVariousTypes() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("a", 1, 2.5, true);
        assertEquals("\"a\",1,2.5,true", formatted);
    }

    @Test
    public void testFormatWithNull() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        String formatted = format.format("a", null, "b");
        assertEquals("\"a\",NULL,\"b\"", formatted);
    }

    @Test
    public void testFormatWithQuoteEscaping() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"').withEscape('\\');
        String formatted = format.format("a \"quoted\" string");
        assertEquals("\"a \\\"quoted\\\" string\"", formatted);
    }

    @Test
    public void testFormatWithCommaInValue() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("value,with,comma");
        assertEquals("\"value,with,comma\"", formatted);
    }
    
    @Test
    public void testFormatWithLineBreakInValue() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("value\nwith\nlinebreak");
        assertEquals("\"value\nwith\nlinebreak\"", formatted);
    }

    @Test
    public void testFormatWithOnlyDelimiter() throws Exception {
        CSVFormat format = CSVFormat.newFormat(';');
        String formatted = format.format(CSVFormat.DEFAULT.getDelimiter());
        assertEquals("\",\"", formatted); // The default delimiter is ','
    }

    @Test
    public void testFormatWithEmptyString() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("");
        assertEquals("\"\"", formatted);
    }

    @Test
    public void testFormatWithEmptyValues() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("", "");
        assertEquals("\"\",\"\"", formatted);
    }

    @Test
    public void testEqualsAndHashCode() throws Exception {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        CSVFormat format3 = CSVFormat.EXCEL;
        CSVFormat format4 = CSVFormat.DEFAULT.withDelimiter('|');

        assertTrue(format1.equals(format2));
        assertEquals(format1.hashCode(), format2.hashCode());
        assertFalse(format1.equals(format3));
        assertFalse(format1.hashCode() == format3.hashCode());
        assertFalse(format1.equals(format4));
        assertFalse(format1.hashCode() == format4.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        String expected = "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false";
        assertTrue(format.toString().startsWith("Delimiter=<,>"));
        assertTrue(format.toString().contains("QuoteChar=<\">"));
        assertTrue(format.toString().contains("RecordSeparator=<\\r\\n>"));
        assertTrue(format.toString().contains("EmptyLines:ignored"));
        assertTrue(format.toString().contains("SkipHeaderRecord:false"));
    }
    
    @Test
    public void testValueOf() throws Exception {
        CSVFormat format = CSVFormat.valueOf("Excel");
        assertEquals(CSVFormat.EXCEL, format);
    }

    @Test
    public void testGetFormat() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT;
        assertSame(format, format.getFormat());
    }

    @Test
    public void testParseReader() throws Exception {
        String csvData = "a,b,c\nd,e,f";
        Reader reader = new StringReader(csvData);
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = format.parse(reader)) {
            assertNotNull(parser);
            assertEquals(2, parser.getRecords().size());
        }
    }

    @Test
    public void testPrintAppendable() throws Exception {
        StringWriter stringWriter = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(stringWriter)) {
            assertNotNull(printer);
            printer.printRecord("a", "b", "c");
        }
        assertEquals("a,b,c\r\n", stringWriter.toString());
    }

    @Test
    public void testPrintRecordAppendable() throws Exception {
        StringWriter stringWriter = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        format.printRecord(stringWriter, "a", "b", "c");
        assertEquals("a,b,c\r\n", stringWriter.toString());
    }

    @Test
    public void testWithFirstRecordAsHeader() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertTrue(format.getSkipHeaderRecord());
        assertNull(format.getHeader()); // Header will be read from the first record
    }

    @Test
    public void testWithHeaderResultSet() throws Exception {
        // Mock ResultSet and ResultSetMetaData for testing
        ResultSet mockResultSet = Mockito.mock(ResultSet.class);
        ResultSetMetaData mockMetaData = Mockito.mock(ResultSetMetaData.class);
        Mockito.when(mockResultSet.getMetaData()).thenReturn(mockMetaData);
        Mockito.when(mockMetaData.getColumnCount()).thenReturn(2);
        Mockito.when(mockMetaData.getColumnLabel(1)).thenReturn("ID");
        Mockito.when(mockMetaData.getColumnLabel(2)).thenReturn("Name");

        CSVFormat format = CSVFormat.DEFAULT.withHeader(mockResultSet);
        assertArrayEquals(new String[]{"ID", "Name"}, format.getHeader());
    }
    
    @Test
    public void testWithHeaderResultSetMetaData() throws Exception {
        // Mock ResultSetMetaData for testing
        ResultSetMetaData mockMetaData = Mockito.mock(ResultSetMetaData.class);
        Mockito.when(mockMetaData.getColumnCount()).thenReturn(3);
        Mockito.when(mockMetaData.getColumnLabel(1)).thenReturn("ColA");
        Mockito.when(mockMetaData.getColumnLabel(2)).thenReturn("ColB");
        Mockito.when(mockMetaData.getColumnLabel(3)).thenReturn("ColC");

        CSVFormat format = CSVFormat.DEFAULT.withHeader(mockMetaData);
        assertArrayEquals(new String[]{"ColA", "ColB", "ColC"}, format.getHeader());
    }
    
    @Test
    public void testFormatWithQuoteModeNonNumeric() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        String formattedNumber = format.format(123);
        assertEquals("123", formattedNumber);
        String formattedString = format.format("abc");
        assertEquals("\"abc\"", formattedString);
    }

    @Test
    public void testFormatWithQuoteModeAll() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        String formatted = format.format("a", 1, 2.5, true);
        assertEquals("\"a\",\"1\",\"2.5\",\"true\"", formatted);
    }
    
    @Test
    public void testFormatWithEscapeCharacterAndQuoteCharacter() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('!').withQuote('"');
        String formatted = format.format("a!\"b"); // Escaped quote and escape character
        assertEquals("\"a!!\\\"b\"", formatted); // Expecting escaped quote to be doubled, and escape char to be escaped
    }

    @Test
    public void testFormatWithNullStringAndQuote() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL").withQuote('"');
        String formatted = format.format(null);
        assertEquals("\"NULL\"", formatted);
    }

    @Test
    public void testPrintFileCharset() throws Exception {
        File tempFile = File.createTempFile("csvtest", ".csv");
        tempFile.deleteOnExit();
        Charset utf8 = Charset.forName("UTF-8");
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(tempFile, utf8)) {
            assertNotNull(printer);
            printer.printRecord("hello", "world");
        }
        // Verify content (basic check)
        String content = new String(java.nio.file.Files.readAllBytes(tempFile.toPath()), utf8);
        assertEquals("hello,world\r\n", content);
    }

    @Test
    public void testPrintPathCharset() throws Exception {
        Path tempPath = java.nio.file.Files.createTempFile("csvtest", ".csv");
        tempPath.toFile().deleteOnExit();
        Charset utf8 = Charset.forName("UTF-8");
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(tempPath, utf8)) {
            assertNotNull(printer);
            printer.printRecord("path", "test");
        }
        // Verify content (basic check)
        String content = new String(java.nio.file.Files.readAllBytes(tempPath), utf8);
        assertEquals("path,test\r\n", content);
    }
    
    @Test
    public void testIsCommentMarkerSet() {
        assertTrue(CSVFormat.DEFAULT.withCommentMarker('#').isCommentMarkerSet());
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet() {
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscapeCharacterSet());
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet() {
        assertTrue(CSVFormat.DEFAULT.withNullString("NULL").isNullStringSet());
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet() {
        assertTrue(CSVFormat.DEFAULT.withQuote('"').isQuoteCharacterSet());
        assertFalse(CSVFormat.DEFAULT.isQuoteCharacterSet());
    }
    
    @Test
    public void testFormatWithEmptyStringForNull() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("");
        String formatted = format.format(null);
        assertEquals("", formatted); // Empty string for null
    }

    @Test
    public void testFormatWithTrimmedValue() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withTrim(true);
        String formatted = format.format("  value  ");
        assertEquals("value", formatted);
    }

    @Test
    public void testFormatWithTrailingDelimiter() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true);
        StringWriter sw = new StringWriter();
        try (CSVPrinter printer = format.print(sw)) {
            printer.printRecord("a", "b");
        }
        assertEquals("a,b,\r\n", sw.toString());
    }

    @Test
    public void testParseWithTrailingDelimiter() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true);
        String csvData = "a,b,\r\nc,d,";
        Reader reader = new StringReader(csvData);
        try (CSVParser parser = format.parse(reader)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals(3, records.get(0).size());
            assertEquals("", records.get(0).get(2)); // Last field should be empty
        }
    }
    
    @Test
    public void testFormatWithCommentMarker() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        StringWriter sw = new StringWriter();
        try (CSVPrinter printer = format.print(sw)) {
            printer.printComment("This is a comment");
        }
        assertEquals("#This is a comment\r\n", sw.toString());
    }
    
    @Test
    public void testFormatWithQuoteModeNoneAndEscape() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE).withEscape('!');
        StringWriter sw = new StringWriter();
        try (CSVPrinter printer = format.print(sw)) {
            printer.printRecord("a!b", "c");
        }
        assertEquals("a!b,c\r\n", sw.toString()); // Escape character should handle special chars
    }
    
    // Enum declared outside the method
    private enum MyHeader { ID, Name }
}
```
