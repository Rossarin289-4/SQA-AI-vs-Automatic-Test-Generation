package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.io.Closeable;
import java.io.Flushable;
import java.io.StringReader;
import java.sql.Statement; // Added for MockResultSet
import java.sql.Connection; // Added for MockResultSet
import java.sql.RowId; // Added for MockResultSet
import java.sql.Blob; // Added for MockResultSet
import java.sql.Clob; // Added for MockResultSet
import java.sql.NClob; // Added for MockResultSet
import java.sql.SQLXML; // Added for MockResultSet
import java.sql.Array; // Added for MockResultSet
import java.sql.Struct; // Added for MockResultSet
import java.sql.CallableStatement; // Added for MockResultSet
import java.sql.PreparedStatement; // Added for MockResultSet
import java.sql.Savepoint; // Added for MockResultSet
import java.sql.ParameterMetaData; // Added for MockResultSet
import java.sql.ResultSetMetaData; // Added for MockResultSet
import java.sql.ResultSetConcurrencyType; // Added for MockResultSet
import java.sql.ResultSetType; // Added for MockResultSet
import java.sql.SQLWarning; // Added for MockResultSet
import java.util.Calendar; // Added for MockResultSet
import java.util.Map; // Added for MockResultSet
import java.net.URL; // Added for MockResultSet

public class CSVFormatTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultFormat() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
    }

    @Test
    public void testRFC4180Format() {
        CSVFormat format = CSVFormat.RFC4180;
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
    }

    @Test
    public void testExcelFormat() {
        CSVFormat format = CSVFormat.EXCEL;
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertTrue(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
    }

    @Test
    public void testTDFFormat() {
        CSVFormat format = CSVFormat.TDF;
        assertEquals('\t', format.getDelimiter());
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getIgnoreEmptyLines());
        assertEquals("\r\n", format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
    }

    @Test
    public void testMySQLFormat() {
        CSVFormat format = CSVFormat.MYSQL;
        assertEquals('\t', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertEquals("\n", format.getRecordSeparator());
        assertEquals("\\N", format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
    }

    @Test
    public void testCustomFormat() {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getIgnoreEmptyLines());
        assertNull(format.getRecordSeparator());
        assertNull(format.getNullString());
        assertNull(format.getHeader());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
    }

    @Test
    public void testFormatWithDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter('|');
        assertEquals('|', format.getDelimiter());
    }

    @Test
    public void testFormatWithQuoteCharacter() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
    }

    @Test
    public void testFormatWithCommentMarker() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
    }

    @Test
    public void testFormatWithEscapeCharacter() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
    }

    @Test
    public void testFormatWithNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NA");
        assertEquals("NA", format.getNullString());
    }

    @Test
    public void testFormatWithRecordSeparator() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        assertEquals("\n", format.getRecordSeparator());
    }

    @Test
    public void testFormatWithIgnoreSurroundingSpaces() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
        assertTrue(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testFormatWithIgnoreEmptyLines() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines();
        assertTrue(format.getIgnoreEmptyLines());
    }

    @Test
    public void testFormatWithSkipHeaderRecord() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord();
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testFormatWithHeader() {
        String[] header = {"col1", "col2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        assertArrayEquals(header, format.getHeader());
    }

    @Test
    public void testFormatWithHeaderComments() {
        Object[] comments = {"comment1", "comment2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments(comments);
        assertArrayEquals(comments, format.getHeaderComments());
    }
    
    @Test
    public void testFormatWithAllowMissingColumnNames() {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();
        assertTrue(format.getAllowMissingColumnNames());
    }

    @Test
    public void testFormatWithIgnoreHeaderCase() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase();
        assertTrue(format.getIgnoreHeaderCase());
    }

    @Test
    public void testFormatEqualsSelf() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(format, format);
    }

    @Test
    public void testFormatEqualsDifferentDelimiter() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter('|');
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatEqualsDifferentQuoteCharacter() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withQuote('\'');
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatEqualsDifferentCommentMarker() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withCommentMarker('#');
        assertNotEquals(format1, format2);
    }
    
    @Test
    public void testFormatEqualsDifferentEscapeCharacter() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withEscape('\\');
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatEqualsDifferentNullString() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withNullString("NA");
        assertNotEquals(format1, format2);
    }
    
    @Test
    public void testFormatEqualsDifferentRecordSeparator() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withRecordSeparator("\n");
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatEqualsDifferentIgnoreSurroundingSpaces() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
        assertNotEquals(format1, format2);
    }
    
    @Test
    public void testFormatEqualsDifferentIgnoreEmptyLines() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withIgnoreEmptyLines();
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatEqualsDifferentSkipHeaderRecord() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withSkipHeaderRecord();
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatEqualsDifferentHeader() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withHeader("col1");
        assertNotEquals(format1, format2);
    }
    
    @Test
    public void testFormatEqualsDifferentAllowMissingColumnNames() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withAllowMissingColumnNames();
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatEqualsDifferentIgnoreHeaderCase() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withIgnoreHeaderCase();
        assertNotEquals(format1, format2);
    }

    @Test
    public void testFormatToString() {
        String formatString = CSVFormat.DEFAULT.toString();
        assertTrue(formatString.contains("Delimiter=<,>"));
        assertTrue(formatString.contains("RecordSeparator=<\r\n>"));
        assertTrue(formatString.contains("EmptyLines:ignored"));
        assertTrue(formatString.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testFormatToStringWithAllSettings() {
        CSVFormat format = CSVFormat.newFormat('|')
            .withQuote('"')
            .withCommentMarker('#')
            .withEscape('\\')
            .withNullString("NULL")
            .withRecordSeparator("\n")
            .withIgnoreSurroundingSpaces()
            .withIgnoreEmptyLines()
            .withSkipHeaderRecord()
            .withHeader("H1", "H2")
            .withAllowMissingColumnNames()
            .withIgnoreHeaderCase();
        String formatString = format.toString();
        assertTrue(formatString.contains("Delimiter=<|>"));
        assertTrue(formatString.contains("QuoteChar=<\">"));
        assertTrue(formatString.contains("CommentStart=<#>"));
        assertTrue(formatString.contains("Escape=<\\>"));
        assertTrue(formatString.contains("NullString=<NULL>"));
        assertTrue(formatString.contains("RecordSeparator=<\n>"));
        assertTrue(formatString.contains("SurroundingSpaces:ignored"));
        assertTrue(formatString.contains("EmptyLines:ignored"));
        assertTrue(formatString.contains("SkipHeaderRecord:true"));
        assertTrue(formatString.contains("Header:[H1, H2]"));
        assertTrue(formatString.contains("AllowMissingColumnNames:true"));
        assertTrue(formatString.contains("IgnoreHeaderCase:ignored"));
    }
    
    @Test
    public void testFormatHashcode() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        assertEquals(format1.hashCode(), format2.hashCode());

        CSVFormat format3 = CSVFormat.DEFAULT.withDelimiter('|');
        assertNotEquals(format1.hashCode(), format3.hashCode());
    }

    @Test
    public void testFormatWithHeaderValidation() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("col1", "col2", "col1");
        try {
            format.validate();
            fail("Expected IllegalArgumentException for duplicate header");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The header contains a duplicate entry"));
        }
    }

    @Test
    public void testFormatWithQuoteAndDelimiterSame() {
        try {
            CSVFormat.newFormat(',').withQuote(',').validate();
            fail("Expected IllegalArgumentException for quote and delimiter same");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The quoteChar character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testFormatWithEscapeAndDelimiterSame() {
        try {
            CSVFormat.newFormat(',').withEscape(',').validate();
            fail("Expected IllegalArgumentException for escape and delimiter same");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The escape character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testFormatWithCommentAndDelimiterSame() {
        try {
            CSVFormat.newFormat(',').withCommentMarker(',').validate();
            fail("Expected IllegalArgumentException for comment and delimiter same");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The comment start character and the delimiter cannot be the same"));
        }
    }
    
    @Test
    public void testFormatWithQuoteAndCommentSame() {
        try {
            CSVFormat.newFormat(',').withQuote('"').withCommentMarker('"').validate();
            fail("Expected IllegalArgumentException for quote and comment same");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The comment start character and the quoteChar cannot be the same"));
        }
    }

    @Test
    public void testFormatWithEscapeAndCommentSame() {
        try {
            CSVFormat.newFormat(',').withEscape('\\').withCommentMarker('\\').validate();
            fail("Expected IllegalArgumentException for escape and comment same");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The comment start and the escape character cannot be the same"));
        }
    }

    @Test
    public void testFormatWithNullQuoteModeAndNoEscape() {
        try {
            CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE).validate();
            fail("Expected IllegalArgumentException for QuoteMode.NONE and no escape character");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("No quotes mode set but no escape character is set"));
        }
    }

    @Test
    public void testFormatWithDelimiterAsLineBreak() {
        try {
            CSVFormat.newFormat('\n');
            fail("Expected IllegalArgumentException for delimiter as line break");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The delimiter cannot be a line break"));
        }
    }
    
    @Test
    public void testFormatWithCommentMarkerAsLineBreak() {
        try {
            CSVFormat.DEFAULT.withCommentMarker('\n');
            fail("Expected IllegalArgumentException for comment marker as line break");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The comment start marker character cannot be a line break"));
        }
    }

    @Test
    public void testFormatWithEscapeAsLineBreak() {
        try {
            CSVFormat.DEFAULT.withEscape('\n');
            fail("Expected IllegalArgumentException for escape character as line break");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The escape character cannot be a line break"));
        }
    }
    
    @Test
    public void testFormatWithQuoteAsLineBreak() {
        try {
            CSVFormat.DEFAULT.withQuote('\n');
            fail("Expected IllegalArgumentException for quote character as line break");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("The quoteChar cannot be a line break"));
        }
    }

    @Test
    public void testFormatBuilderMethodsReturnNewInstance() {
        CSVFormat original = CSVFormat.DEFAULT;
        assertNotSame(original, original.withDelimiter(','));
        assertNotSame(original, original.withQuote('"'));
        assertNotSame(original, original.withCommentMarker('#'));
        assertNotSame(original, original.withEscape('\\'));
        assertNotSame(original, original.withNullString("NA"));
        assertNotSame(original, original.withRecordSeparator("\n"));
        assertNotSame(original, original.withIgnoreSurroundingSpaces());
        assertNotSame(original, original.withIgnoreEmptyLines());
        assertNotSame(original, original.withSkipHeaderRecord());
        assertNotSame(original, original.withHeader("H1"));
        assertNotSame(original, original.withHeaderComments("C1"));
        assertNotSame(original, original.withAllowMissingColumnNames());
        assertNotSame(original, original.withIgnoreHeaderCase());
    }
    
    @Test
    public void testFormatParsing() throws IOException {
        String csv = "a,b,c\n1,2,3";
        Reader reader = new StringReader(csv);
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVParser parser = format.parse(reader)) {
            assertEquals(1, parser.getRecordNumber());
            CSVRecord record1 = parser.nextRecord();
            assertEquals("a", record1.get(0));
            assertEquals("b", record1.get(1));
            assertEquals("c", record1.get(2));
            
            assertEquals(2, parser.getRecordNumber());
            CSVRecord record2 = parser.nextRecord();
            assertEquals("1", record2.get(0));
            assertEquals("2", record2.get(1));
            assertEquals("3", record2.get(2));

            assertNull(parser.nextRecord());
        }
    }

    @Test
    public void testFormatFormatting() {
        CSVFormat format = CSVFormat.DEFAULT;
        String formatted = format.format("value1", "value2", "value3");
        assertEquals("value1,value2,value3", formatted);
    }
    
    @Test
    public void testFormatWithQuoteModeAll() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }
    
    @Test
    public void testFormatWithQuoteModeNonNumeric() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        assertEquals(QuoteMode.NON_NUMERIC, format.getQuoteMode());
    }
    
    @Test
    public void testFormatWithQuoteModeMinimal() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
        assertEquals(QuoteMode.MINIMAL, format.getQuoteMode());
    }

    @Test
    public void testFormatWithQuoteModeNone() {
        CSVFormat format = CSVFormat.MYSQL.withQuoteMode(QuoteMode.NONE); // MYSQL has escape char
        assertEquals(QuoteMode.NONE, format.getQuoteMode());
    }

    @Test
    public void testGetFormat() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertSame(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertSame(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertSame(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
        assertSame(CSVFormat.RFC4180, CSVFormat.Predefined.RFC4180.getFormat());
        assertSame(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
    }

    @Test
    public void testIsCommentMarkerSet() {
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
        assertTrue(CSVFormat.DEFAULT.withCommentMarker('#').isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet() {
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
        assertTrue(CSVFormat.MYSQL.isEscapeCharacterSet());
        assertTrue(CSVFormat.DEFAULT.withEscape('!').isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet() {
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
        assertTrue(CSVFormat.MYSQL.isNullStringSet());
        assertTrue(CSVFormat.DEFAULT.withNullString("N/A").isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
        assertFalse(CSVFormat.MYSQL.isQuoteCharacterSet());
        assertTrue(CSVFormat.DEFAULT.withQuote('\'').isQuoteCharacterSet());
    }

    @Test
    public void testPrintToAppendable() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(sw)) {
            assertNotNull(printer);
            printer.printRecord("a", "b", "c");
        }
        assertEquals("a,b,c\r\n", sw.toString());
    }

    @Test
    public void testCloseOnPrinter() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = format.print(sw);
        assertTrue(printer instanceof Flushable); 
        assertTrue(printer instanceof Closeable); 
        printer.close();
    }

    @Test
    public void testFlushOnPrinter() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        CSVPrinter printer = format.print(sw);
        printer.flush();
    }

    @Test
    public void testPrintComment() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVPrinter printer = format.print(sw)) {
            printer.printComment("This is a comment.");
        }
        assertEquals("# This is a comment.\r\n", sw.toString());
    }

    @Test
    public void testPrintCommentWithMultipleLines() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVPrinter printer = format.print(sw)) {
            printer.printComment("Line 1\nLine 2\r\nLine 3");
        }
        assertEquals("# Line 1\r\n# Line 2\r\n# Line 3\r\n", sw.toString());
    }

    @Test
    public void testPrintCommentDisabled() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT; // No comment marker
        try (CSVPrinter printer = format.print(sw)) {
            printer.printComment("This comment should not be printed.");
        }
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintln() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(sw)) {
            printer.println();
        }
        assertEquals("\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordIterable() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(sw)) {
            printer.printRecord(Arrays.asList("a", "b", "c"));
        }
        assertEquals("a,b,c\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordsIterable() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(sw)) {
            printer.printRecords(Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("1", "2")));
        }
        assertEquals("a,b\r\n1,2\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordsArray() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(sw)) {
            printer.printRecords(new Object[]{"a", "b", "c"});
        }
        assertEquals("a,b,c\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordsWithNestedArray() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(sw)) {
            printer.printRecords(new Object[]{new String[]{"a", "b"}, new String[]{"1", "2"}});
        }
        assertEquals("a,b\r\n1,2\r\n", sw.toString());
    }

    // Mocking ResultSet and ResultSetMetaData for testing printRecords(ResultSet)
    private static class MockResultSet implements ResultSet {
        private String[][] data;
        private int currentRow = -1;
        private int columnCount;
        private ResultSetMetaData metaData;

        MockResultSet(String[][] data) {
            this.data = data;
            this.columnCount = data.length > 0 ? data[0].length : 0;
            this.metaData = new MockResultSetMetaData(columnCount);
        }

        @Override
        public boolean next() throws SQLException {
            currentRow++;
            return currentRow < data.length;
        }

        @Override
        public Object getObject(int columnIndex) throws SQLException {
            if (columnIndex < 1 || columnIndex > columnCount) {
                throw new SQLException("Column index out of bounds");
            }
            return data[currentRow][columnIndex - 1];
        }

        @Override public int getColumnCount() throws SQLException { return columnCount; }
        @Override public boolean isClosed() throws SQLException { return false; }
        @Override public void close() throws SQLException { }
        @Override public ResultSetMetaData getMetaData() throws SQLException { return metaData; }

        // --- Unimplemented methods ---
        @Override public <T> T unwrap(Class<T> iface) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isWrapperFor(Class<?> iface) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Statement getStatement() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public ResultSetConcurrencyType getConcurrency() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public ResultSetType getType() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getFetchDirection() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getFetchSize() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getHoldability() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Connection getConnection() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public RowId getRowId(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public RowId getRowId(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getRow() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public void moveToInsertRow() throws SQLException {}
        @Override public void moveToCurrentRow() throws SQLException {}
        @Override public java.io.InputStream getAsciiStream(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.io.InputStream getAsciiStream(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.io.InputStream getBinaryStream(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.io.InputStream getBinaryStream(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.math.BigDecimal getBigDecimal(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.math.BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.math.BigDecimal getBigDecimal(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.math.BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean getBoolean(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean getBoolean(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public byte getByte(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public byte getByte(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public byte[] getBytes(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public byte[] getBytes(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.io.Reader getCharacterStream(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.io.Reader getCharacterStream(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Clob getClob(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Clob getClob(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Date getDate(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Date getDate(int columnIndex, Calendar cal) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Date getDate(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Date getDate(String columnLabel, Calendar cal) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public double getDouble(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public double getDouble(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public float getFloat(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public float getFloat(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.io.InputStream getUnicodeStream(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.io.InputStream getUnicodeStream(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getInt(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getInt(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getString(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getString(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public long getLong(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public long getLong(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Ref getRef(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Ref getRef(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public SQLXML getSQLXML(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public SQLXML getSQLXML(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public short getShort(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public short getShort(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Time getTime(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Time getTime(int columnIndex, Calendar cal) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Time getTime(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Time getTime(String columnLabel, Calendar cal) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Timestamp getTimestamp(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Timestamp getTimestamp(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.sql.Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public URL getURL(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public URL getURL(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public void cancelRowUpdates() throws SQLException {}
        @Override public void deleteRow() throws SQLException {}
        @Override public void insertRow() throws SQLException {}
        @Override public void updateAsciiStream(int columnIndex, java.io.InputStream x) throws SQLException {}
        @Override public void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateAsciiStream(String columnLabel, java.io.InputStream x) throws SQLException {}
        @Override public void updateAsciiStream(String columnLabel, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateAsciiStream(String columnLabel, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateBigDecimal(int columnIndex, java.math.BigDecimal x) throws SQLException {}
        @Override public void updateBigDecimal(String columnLabel, java.math.BigDecimal x) throws SQLException {}
        @Override public void updateBinaryStream(int columnIndex, java.io.InputStream x) throws SQLException {}
        @Override public void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateBinaryStream(String columnLabel, java.io.InputStream x) throws SQLException {}
        @Override public void updateBinaryStream(String columnLabel, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateBinaryStream(String columnLabel, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateBlob(int columnIndex, Blob x) throws SQLException {}
        @Override public void updateBlob(int columnIndex, java.io.InputStream inputStream) throws SQLException {}
        @Override public void updateBlob(int columnIndex, java.io.InputStream inputStream, long length) throws SQLException {}
        @Override public void updateBlob(String columnLabel, Blob x) throws SQLException {}
        @Override public void updateBlob(String columnLabel, java.io.InputStream inputStream) throws SQLException {}
        @Override public void updateBlob(String columnLabel, java.io.InputStream inputStream, long length) throws SQLException {}
        @Override public void updateBoolean(int columnIndex, boolean x) throws SQLException {}
        @Override public void updateBoolean(String columnLabel, boolean x) throws SQLException {}
        @Override public void updateByte(int columnIndex, byte x) throws SQLException {}
        @Override public void updateByte(String columnLabel, byte x) throws SQLException {}
        @Override public void updateBytes(int columnIndex, byte[] x) throws SQLException {}
        @Override public void updateBytes(String columnLabel, byte[] x) throws SQLException {}
        @Override public void updateCharacterStream(int columnIndex, java.io.Reader x) throws SQLException {}
        @Override public void updateCharacterStream(int columnIndex, java.io.Reader x, int length) throws SQLException {}
        @Override public void updateCharacterStream(int columnIndex, java.io.Reader x, long length) throws SQLException {}
        @Override public void updateCharacterStream(String columnLabel, java.io.Reader x) throws SQLException {}
        @Override public void updateCharacterStream(String columnLabel, java.io.Reader x, int length) throws SQLException {}
        @Override public void updateCharacterStream(String columnLabel, java.io.Reader x, long length) throws SQLException {}
        @Override public void updateClob(int columnIndex, Clob x) throws SQLException {}
        @Override public void updateClob(int columnIndex, java.io.Reader reader) throws SQLException {}
        @Override public void updateClob(int columnIndex, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateClob(String columnLabel, Clob x) throws SQLException {}
        @Override public void updateClob(String columnLabel, java.io.Reader reader) throws SQLException {}
        @Override public void updateClob(String columnLabel, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateDate(int columnIndex, java.sql.Date x) throws SQLException {}
        @Override public void updateDate(String columnLabel, java.sql.Date x) throws SQLException {}
        @Override public void updateDouble(int columnIndex, double x) throws SQLException {}
        @Override public void updateDouble(String columnLabel, double x) throws SQLException {}
        @Override public void updateFloat(int columnIndex, float x) throws SQLException {}
        @Override public void updateFloat(String columnLabel, float x) throws SQLException {}
        @Override public void updateInt(int columnIndex, int x) throws SQLException {}
        @Override public void updateInt(String columnLabel, int x) throws SQLException {}
        @Override public void updateLong(int columnIndex, long x) throws SQLException {}
        @Override public void updateLong(String columnLabel, long x) throws SQLException {}
        @Override public void updateNull(int columnIndex) throws SQLException {}
        @Override public void updateNull(String columnLabel) throws SQLException {}
        @Override public void updateObject(int columnIndex, Object x) throws SQLException {}
        @Override public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {}
        @Override public void updateObject(String columnLabel, Object x) throws SQLException {}
        @Override public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {}
        @Override public void updateRef(int columnIndex, java.sql.Ref x) throws SQLException {}
        @Override public void updateRef(String columnLabel, java.sql.Ref x) throws SQLException {}
        @Override public void updateRowId(int columnIndex, RowId x) throws SQLException {}
        @Override public void updateRowId(String columnLabel, RowId x) throws SQLException {}
        @Override public void updateShort(int columnIndex, short x) throws SQLException {}
        @Override public void updateShort(String columnLabel, short x) throws SQLException {}
        @Override public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {}
        @Override public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {}
        @Override public void updateString(int columnIndex, String x) throws SQLException {}
        @Override public void updateString(String columnLabel, String x) throws SQLException {}
        @Override public void updateTime(int columnIndex, java.sql.Time x) throws SQLException {}
        @Override public void updateTime(String columnLabel, java.sql.Time x) throws SQLException {}
        @Override public void updateTimestamp(int columnIndex, java.sql.Timestamp x) throws SQLException {}
        @Override public void updateTimestamp(String columnLabel, java.sql.Timestamp x) throws SQLException {}
        @Override public void updateURL(int columnIndex, URL x) throws SQLException {}
        @Override public void updateURL(String columnLabel, URL x) throws SQLException {}
        @Override public void updateNClob(int columnIndex, NClob nClob) throws SQLException {}
        @Override public void updateNClob(String columnLabel, NClob nClob) throws SQLException {}
        @Override public void updateNString(int columnIndex, String nString) throws SQLException {}
        @Override public void updateNString(String columnLabel, String nString) throws SQLException {}
        @Override public NClob getNClob(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public NClob getNClob(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getNString(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getNString(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Array getArray(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Array getArray(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Blob getBlob(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Blob getBlob(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Struct getStruct(int columnIndex) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Struct getStruct(String columnLabel) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public java.util.stream.Stream<Map.Entry<String, Class<?>>> mapNVARCHAR(Map<String, Class<?>> map) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getCursorName() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public ResultSet getGeneratedKeys() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getResultSetHoldability() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getSQLKeywords() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getTransactionIsolation() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public Map<String, Class<?>> getTypeMap() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean rowDeleted() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean rowInserted() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean rowUpdated() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public void cancelRowUpdates() throws SQLException {}
        @Override public void deleteRow() throws SQLException {}
        @Override public void insertRow() throws SQLException {}
        @Override public void moveToInsertRow() throws SQLException {}
        @Override public void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) throws SQLException {}
        @Override public void updateBlob(int columnIndex, Blob x, long pos, long length) throws SQLException {}
        @Override public void updateClob(int columnIndex, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateBlob(String columnLabel, Blob x, long pos, long length) throws SQLException {}
        @Override public void updateClob(String columnLabel, Blob x, long pos, long length) throws SQLException {}
        @Override public void updateNClob(int columnIndex, NClob nClob) throws SQLException {}
        @Override public void updateNClob(String columnLabel, NClob nClob) throws SQLException {}
        @Override public void updateNClob(int columnIndex, java.io.Reader reader) throws SQLException {}
        @Override public void updateNClob(int columnIndex, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateNClob(String columnLabel, java.io.Reader reader) throws SQLException {}
        @Override public void updateNClob(String columnLabel, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateArray(int columnIndex, Array x) throws SQLException {}
        @Override public void updateArray(String columnLabel, Array x) throws SQLException {}
        @Override public CallableStatement prepareCall(String sql) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public PreparedStatement prepareStatement(String sql) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean getMoreResults() throws SQLException { throw new UnsupportedOperationException(); }
        @Override public void setFetchDirection(int direction) throws SQLException {}
        @Override public void setFetchSize(int rows) throws SQLException {}
        @Override public void setHoldability(int holdability) throws SQLException {}
        @Override public void updateArray(int columnIndex, java.sql.Array x) throws SQLException {}
        @Override public void updateArray(String columnLabel, java.sql.Array x) throws SQLException {}
        @Override public void updateBlob(int columnIndex, Blob x) throws SQLException {}
        @Override public void updateBlob(String columnLabel, Blob x) throws SQLException {}
        @Override public void updateClob(int columnIndex, Clob x) throws SQLException {}
        @Override public void updateClob(String columnLabel, Clob x) throws SQLException {}
        @Override public void updateNClob(int columnIndex, NClob nClob) throws SQLException {}
        @Override public void updateNClob(String columnLabel, NClob nClob) throws SQLException {}
        @Override public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {}
        @Override public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {}
        @Override public void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateBlob(int columnIndex, java.io.InputStream inputStream, long length) throws SQLException {}
        @Override public void updateCharacterStream(int columnIndex, java.io.Reader x, long length) throws SQLException {}
        @Override public void updateClob(int columnIndex, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateAsciiStream(String columnLabel, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateBinaryStream(String columnLabel, java.io.InputStream x, long length) throws SQLException {}
        @Override public void updateBlob(String columnLabel, java.io.InputStream inputStream, long length) throws SQLException {}
        @Override public void updateCharacterStream(String columnLabel, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateClob(String columnLabel, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateNClob(int columnIndex, java.io.Reader reader, long length) throws SQLException {}
        @Override public void updateNClob(String columnLabel, java.io.Reader reader, long length) throws SQLException {}
    }

    private static class MockResultSetMetaData implements ResultSetMetaData {
        private int columnCount;

        MockResultSetMetaData(int columnCount) {
            this.columnCount = columnCount;
        }

        @Override
        public int getColumnCount() throws SQLException {
            return columnCount;
        }

        @Override
        public String getColumnLabel(int column) throws SQLException {
            return "Column" + column;
        }

        // --- Unimplemented methods ---
        @Override public int getSchemaName(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getColumnClassName(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getColumnName(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getTableName(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getCatalogName(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getColumnDisplaySize(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getPrecision(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getScale(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public int getColumnType(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public String getColumnTypeName(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isAutoIncrement(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isCaseSensitive(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isCurrency(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isDefinitelyWritable(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isNullable(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isReadOnly(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isSearchable(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isSigned(int column) throws SQLException { throw new UnsupportedOperationException(); }
        @Override public boolean isWritable(int column) throws SQLException { throw new UnsupportedOperationException(); }
    }

    @Test
    public void testPrintRecordsResultSet() throws SQLException, IOException {
        String[][] data = {
                {"a", "b"},
                {"1", "2"}
        };
        MockResultSet rs = new MockResultSet(data);
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        try (CSVPrinter printer = format.print(sw)) {
            printer.printRecords(rs);
        }
        assertEquals("a,b\r\n1,2\r\n", sw.toString());
    }

    @Test
    public void testFormatWithHeaderFromResultSet() throws SQLException {
        String[][] data = {
                {"col1_data", "col2_data"},
                {"val1", "val2"}
        };
        MockResultSet rs = new MockResultSet(data);
        CSVFormat format = CSVFormat.DEFAULT.withHeader(rs);
        assertArrayEquals(new String[]{"Column1", "Column2"}, format.getHeader());
    }

    @Test
    public void testFormatWithHeaderFromResultSetMetaData() throws SQLException {
        String[][] data = {
                {"col1_data", "col2_data"},
                {"val1", "val2"}
        };
        MockResultSet rs = new MockResultSet(data);
        CSVFormat format = CSVFormat.DEFAULT.withHeader(rs.getMetaData());
        assertArrayEquals(new String[]{"Column1", "Column2"}, format.getHeader());
    }

    @Test
    public void testToStringWithNulls() {
        CSVFormat format = new CSVFormat(
                ',', null, null, null, null, false, false, "\n", null, null, null, false, false, false);
        String formatString = format.toString();
        assertTrue(formatString.contains("Delimiter=<,>"));
        assertTrue(formatString.contains("RecordSeparator=<\n>"));
        assertFalse(formatString.contains("QuoteChar"));
        assertFalse(formatString.contains("CommentStart"));
        assertFalse(formatString.contains("Escape"));
        assertFalse(formatString.contains("NullString"));
    }
}
