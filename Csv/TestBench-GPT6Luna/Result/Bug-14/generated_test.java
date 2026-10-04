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

public class CSVFormatTest {
    @Test
    public void testDefaultFormatSettings() throws Exception {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());
    }

    @Test
    public void testNewFormatDelimiterAndNullOptions() throws Exception {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteCharacter());
        assertNull(format.getRecordSeparator());
        assertFalse(format.isQuoteCharacterSet());
    }

    @Test
    public void testNewFormatRejectsLineBreakEdges() throws Exception {
        try {
            CSVFormat.newFormat('\n');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            CSVFormat.newFormat('\r');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(';', CSVFormat.newFormat(';').getDelimiter());
    }

    @Test
    public void testPredefinedValueLookup() throws Exception {
        assertEquals(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertEquals(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
    }

    @Test
    public void testValueOfUnknownNameThrows() throws Exception {
        try {
            CSVFormat.valueOf("unknown");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEqualityAndHashCode() throws Exception {
        CSVFormat first = CSVFormat.DEFAULT.withDelimiter(';');
        CSVFormat second = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
        assertNotEquals(first, CSVFormat.DEFAULT);
    }

    @Test
    public void testEqualityRejectsNullAndDifferentType() throws Exception {
        assertFalse(CSVFormat.DEFAULT.equals(null));
        assertFalse(CSVFormat.DEFAULT.equals("format"));
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT));
    }

    @Test
    public void testFormatValues() throws Exception {
        assertEquals("one,two", CSVFormat.DEFAULT.format("one", "two"));
        assertEquals("\"a,b\"", CSVFormat.DEFAULT.format("a,b"));
    }

    @Test
    public void testWithDelimiterAndPreservesOriginal() throws Exception {
        CSVFormat changed = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', changed.getDelimiter());
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
    }

    @Test
    public void testWithDelimiterRejectsBothLineBreaks() throws Exception {
        try {
            CSVFormat.DEFAULT.withDelimiter('\n');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            CSVFormat.DEFAULT.withDelimiter('\r');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testHeaderIsCopiedOnInputAndOutput() throws Exception {
        String[] names = {"first", "second"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(names);
        names[0] = "changed";
        assertArrayEquals(new String[] {"first", "second"}, format.getHeader());
        String[] returned = format.getHeader();
        returned[1] = "changed";
        assertArrayEquals(new String[] {"first", "second"}, format.getHeader());
    }

    @Test
    public void testDuplicateHeaderRejected() throws Exception {
        try {
            CSVFormat.DEFAULT.withHeader("same", "same");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertArrayEquals(new String[0], CSVFormat.DEFAULT.withHeader().getHeader());
    }

    @Test
    public void testHeaderCommentsConvertedAndCopied() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("note", null);
        assertArrayEquals(new String[] {"note", null}, format.getHeaderComments());
        String[] comments = format.getHeaderComments();
        comments[0] = "changed";
        assertArrayEquals(new String[] {"note", null}, format.getHeaderComments());
    }

    @Test
    public void testBooleanWithMethodsSetAndClearFlags() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames()
                .withIgnoreEmptyLines(false).withIgnoreHeaderCase()
                .withIgnoreSurroundingSpaces().withSkipHeaderRecord()
                .withTrailingDelimiter().withTrim();
        assertTrue(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreHeaderCase());
        assertTrue(format.getIgnoreSurroundingSpaces());
        assertTrue(format.getSkipHeaderRecord());
        assertTrue(format.getTrailingDelimiter());
        assertTrue(format.getTrim());
    }

    @Test
    public void testWithNullAndCharacterOptions() throws Exception {
        CSVFormat format = CSVFormat.newFormat(';').withCommentMarker('#')
                .withEscape('\\').withQuote('"').withNullString("NA");
        assertEquals(Character.valueOf('#'), format.getCommentMarker());
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
        assertEquals("NA", format.getNullString());
        assertTrue(format.isCommentMarkerSet());
        assertTrue(format.isEscapeCharacterSet());
        assertTrue(format.isQuoteCharacterSet());
        assertTrue(format.isNullStringSet());
    }

    @Test
    public void testNullStringCanBeDisabled() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NA").withNullString(null);
        assertNull(format.getNullString());
        assertFalse(format.isNullStringSet());
    }

    @Test
    public void testRecordSeparatorAndPrinterOutput() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator('|');
        format.printRecord(out, "a", "b");
        assertEquals("a,b|", out.toString());
        assertEquals("|", format.getRecordSeparator());
    }

    @Test
    public void testPrintRecordWithTrailingDelimiter() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.DEFAULT.withTrailingDelimiter().printRecord(out, "x");
        assertEquals("x,\r\n", out.toString());
    }

    @Test
    public void testPrintRecordEscapesWithEscapeMode() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.newFormat(',').withEscape('\\').withRecordSeparator("\n")
                .printRecord(out, "a,b");
        assertEquals("a\\,b\n", out.toString());
    }

    @Test
    public void testQuoteModeAllAndNonNumeric() throws Exception {
        StringBuilder all = new StringBuilder();
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).printRecord(all, "x", 2);
        assertEquals("\"x\",\"2\"\r\n", all.toString());

        StringBuilder nonNumeric = new StringBuilder();
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC).printRecord(nonNumeric, "x", 2);
        assertEquals("\"x\",2\r\n", nonNumeric.toString());
    }

    @Test
    public void testWithFirstRecordAsHeader() throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        assertArrayEquals(new String[0], format.getHeader());
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testToStringReflectsConfiguredOptions() throws Exception {
        String text = CSVFormat.DEFAULT.withDelimiter(';').withNullString("NA")
                .withHeader("id").toString();
        assertTrue(text.contains("Delimiter=<;>"));
        assertTrue(text.contains("NullString=<NA>"));
        assertTrue(text.contains("Header:[id]"));
    }

    @Test
    public void testFormatWithNullString() throws Exception {
        assertEquals("NA,x", CSVFormat.DEFAULT.withNullString("NA").format(null, "x"));
    }

    @Test
    public void testPredefinedEnumReturnsItsFormat() throws Exception {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
    }

    @Test
    public void testGetQuoteModeDefaultAndConfigured() throws Exception {
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
        assertEquals(QuoteMode.ALL, CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).getQuoteMode());
    }

    @Test
    public void testParseReaderReturnsRecords() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.parse(new java.io.StringReader("a,b\nc,d"));
        assertEquals(2, parser.getRecords().size());
    }

    @Test
    public void testParseReaderWithConfiguredDelimiter() throws Exception {
        CSVParser parser = CSVFormat.newFormat(';').parse(new java.io.StringReader("a;b"));
        assertEquals(2, parser.getRecords().get(0).size());
    }

    @Test
    public void testPrintReturnsPrinterWithConfiguredOutput() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = CSVFormat.DEFAULT.withRecordSeparator("\n").print(out);
        printer.printRecord("a", "b");
        printer.close();
        assertEquals("a,b\n", out.toString());
    }

    @Test
    public void testPrintCanEmitMultipleRecords() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = CSVFormat.DEFAULT.withRecordSeparator("|").print(out);
        printer.print("a");
        printer.println();
        printer.printRecord("b");
        printer.close();
        assertEquals("a|\nb|\n", out.toString());
    }

    @Test
    public void testPrintlnAddsTrailingDelimiterAndSeparator() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.DEFAULT.withTrailingDelimiter().withRecordSeparator("|").println(out);
        assertEquals(",|", out.toString());
    }

    @Test
    public void testPrintlnWithoutTrailingDelimiter() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.newFormat(';').println(out);
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintlnWithSeparatorOnly() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat.newFormat(';').withRecordSeparator('\n').println(out);
        assertEquals("\n", out.toString());
    }
}
