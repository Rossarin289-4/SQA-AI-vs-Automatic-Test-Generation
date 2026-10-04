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

public class CSVFormatTest {
    @Test
    public void testNewFormatRejectsLineBreakDelimiters() throws Exception {
        try {
            CSVFormat.newFormat('\n');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        try {
            CSVFormat.newFormat('\r');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNewFormatAcceptsOrdinaryDelimiter() throws Exception {
        CSVFormat f = CSVFormat.newFormat(';');
        assertEquals(';', f.getDelimiter());
        assertNull(f.getQuoteCharacter());
    }

    @Test
    public void testValueOfPredefinedFormats() throws Exception {
        assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertSame(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
        assertSame(CSVFormat.RFC4180, CSVFormat.valueOf("RFC4180"));
        assertSame(CSVFormat.TDF, CSVFormat.valueOf("TDF"));
    }

    @Test
    public void testValueOfRejectsUnknownName() throws Exception {
        try {
            CSVFormat.valueOf("unknown");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEqualsAndHashCodeForEquivalentFormats() throws Exception {
        CSVFormat a = CSVFormat.DEFAULT.withNullString("NA");
        CSVFormat b = CSVFormat.DEFAULT.withNullString("NA");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEqualsDistinguishesDelimiterAndNull() throws Exception {
        assertFalse(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT.withDelimiter(';')));
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testFormatQuotesDelimiterAndUsesNullString() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withNullString("NA");
        assertEquals("\"a,b\",NA", f.format("a,b", null));
    }

    @Test
    public void testHeadersAreCopiedOnInputAndOutput() throws Exception {
        String[] header = { "first", "second" };
        CSVFormat f = CSVFormat.DEFAULT.withHeader(header);
        header[0] = "changed";
        assertEquals("first", f.getHeader()[0]);
        String[] copy = f.getHeader();
        copy[1] = "changed";
        assertEquals("second", f.getHeader()[1]);
    }

    @Test
    public void testHeaderCommentsConvertObjectsAndCopyArray() throws Exception {
        Object[] comments = { "one", Integer.valueOf(2), null };
        CSVFormat f = CSVFormat.DEFAULT.withHeaderComments(comments);
        comments[0] = "changed";
        assertEquals(Arrays.asList("one", "2", null), Arrays.asList(f.getHeaderComments()));
    }

    @Test
    public void testHeaderRejectsDuplicateNames() throws Exception {
        try {
            CSVFormat.DEFAULT.withHeader("x", "x");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCommentMarkerNullAndSetStates() throws Exception {
        CSVFormat base = CSVFormat.DEFAULT;
        assertNull(base.getCommentMarker());
        assertFalse(base.isCommentMarkerSet());
        CSVFormat f = base.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), f.getCommentMarker());
        assertTrue(f.isCommentMarkerSet());
    }

    @Test
    public void testDelimiterChangePreservesOriginalFormat() throws Exception {
        CSVFormat changed = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(';', changed.getDelimiter());
    }

    @Test
    public void testEscapeCharacterAndValidation() throws Exception {
        CSVFormat f = CSVFormat.newFormat(';').withEscape('\\');
        assertEquals(Character.valueOf('\\'), f.getEscapeCharacter());
        assertTrue(f.isEscapeCharacterSet());
        try {
            CSVFormat.newFormat(';').withEscape(';');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConfigurationBooleanWithMethods() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withAllowMissingColumnNames()
                .withIgnoreEmptyLines().withIgnoreSurroundingSpaces()
                .withIgnoreHeaderCase().withSkipHeaderRecord();
        assertTrue(f.getAllowMissingColumnNames());
        assertTrue(f.getIgnoreEmptyLines());
        assertTrue(f.getIgnoreSurroundingSpaces());
        assertTrue(f.getIgnoreHeaderCase());
        assertTrue(f.getSkipHeaderRecord());
    }

    @Test
    public void testNullStringSetAndClear() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withNullString("NA");
        assertEquals("NA", f.getNullString());
        assertTrue(f.isNullStringSet());
        CSVFormat cleared = f.withNullString(null);
        assertNull(cleared.getNullString());
        assertFalse(cleared.isNullStringSet());
    }

    @Test
    public void testQuoteConfigurationAndQuoteMode() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withQuote('\'').withQuoteMode(QuoteMode.ALL);
        assertEquals(Character.valueOf('\''), f.getQuoteCharacter());
        assertEquals(QuoteMode.ALL, f.getQuoteMode());
        assertTrue(f.isQuoteCharacterSet());
    }

    @Test
    public void testQuoteCannotEqualDelimiter() throws Exception {
        try {
            CSVFormat.DEFAULT.withQuote(',');
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRecordSeparatorAndSkipHeader() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withRecordSeparator("|").withSkipHeaderRecord();
        assertEquals("|", f.getRecordSeparator());
        assertTrue(f.getSkipHeaderRecord());
    }

    @Test
    public void testToStringIncludesConfiguredOptions() throws Exception {
        CSVFormat f = CSVFormat.DEFAULT.withEscape('\\').withCommentMarker('#')
                .withNullString("NA").withHeader("a");
        String text = f.toString();
        assertTrue(text.contains("Escape=<\\>"));
        assertTrue(text.contains("CommentStart=<#>"));
        assertTrue(text.contains("NullString=<NA>"));
        assertTrue(text.contains("Header:[a]"));
    }

    @Test
    public void testPrintWritesRecordAndReturnsSameAppendable() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.printRecord(Arrays.asList("a", "b"));
        assertSame(out, printer.getOut());
        assertEquals("a,b\r\n", out.toString());
    }

    @Test
    public void testPrintCommentSplitsLines() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.withCommentMarker('#').print(out);
        printer.printComment("a\nb");
        assertEquals("# a\r\n# b\r\n", out.toString());
    }

    @Test
    public void testParseReaderProducesRecords() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.parse(new java.io.StringReader("a,b\n"));
        assertEquals(1, parser.getRecords().size());
        assertEquals(1, parser.getRecordNumber());
    }

    @Test
    public void testParseNullInputRejected() throws Exception {
        try {
            CSVFormat.DEFAULT.parse((Reader) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testPredefinedGetFormat() throws Exception {
        assertSame(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertSame(CSVFormat.MYSQL, CSVFormat.Predefined.MySQL.getFormat());
    }

    @Test
    public void testPrinterPrintRecordsHandlesArrayIterableAndScalar() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.printRecords(Arrays.<Object>asList(
                new String[] { "a", "b" }, Arrays.asList("c", "d"), "e"));
        assertEquals("a,b\r\nc,d\r\ne\r\n", out.toString());
    }

    @Test
    public void testPrinterPrintRecordsEmptyIterable() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.printRecords(Arrays.<Object>asList());
        assertEquals("", out.toString());
    }

    @Test
    public void testPrinterPrintlnAddsSeparatorAndStartsNextRecord() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.println();
        printer.print("x");
        printer.println();
        assertEquals("\r\nx\r\n", out.toString());
    }

    @Test
    public void testPrinterPrintlnWithNoRecordSeparator() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat.newFormat(';').print(out).println();
        assertEquals("", out.toString());
    }

    @Test
    public void testPrinterFlushPreservesWrittenOutput() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.printRecord("x");
        printer.flush();
        assertEquals("x\r\n", out.toString());
    }

    @Test
    public void testPrinterCloseDoesNotChangeStringWriterContent() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.printRecord("x");
        printer.close();
        assertEquals("x\r\n", out.toString());
    }

    @Test
    public void testPrinterCanContinueAfterStringWriterClose() throws Exception {
        StringWriter out = new StringWriter();
        CSVPrinter printer = CSVFormat.DEFAULT.print(out);
        printer.close();
        printer.printRecord("y");
        assertEquals("y\r\n", out.toString());
    }
}
