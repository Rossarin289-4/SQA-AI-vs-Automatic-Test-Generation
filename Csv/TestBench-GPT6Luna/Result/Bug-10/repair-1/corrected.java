package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSVPrinterTest {
    @Test
    public void testGetOutReturnsSuppliedAppendable() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        assertSame(out, printer.getOut());
    }

    @Test
    public void testPrintPlainValue() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("abc");
        assertEquals("abc", out.toString());
    }

    @Test
    public void testPrintNullAsEmptyByDefault() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print(null);
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintNullUsingConfiguredNullString() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withNullString("NULL"));
        printer.print(null);
        assertEquals("NULL", out.toString());
    }

    @Test
    public void testPrintDelimitedValues() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("one");
        printer.print("two");
        assertEquals("one,two", out.toString());
    }

    @Test
    public void testPrintQuotesDelimiterContainingValue() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("a,b");
        assertEquals("\"a,b\"", out.toString());
    }

    @Test
    public void testPrintEscapesDelimiterAndNewline() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withEscape('\\').withQuoteChar((Character) null));
        printer.print("a,b\nc");
        assertEquals("a\\,b\\nc", out.toString());
    }

    @Test
    public void testPrintRecordAppendsRecordSeparator() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        printer.printRecord("a", "b");
        assertEquals("a,b\n", out.toString());
    }

    @Test
    public void testPrintEmptyRecordAppendsSeparator() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        printer.printRecord(new Object[0]);
        assertEquals("\n", out.toString());
    }

    @Test
    public void testPrintRecordIterable() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        printer.printRecord(java.util.Arrays.asList("x", "y"));
        assertEquals("x,y\n", out.toString());
    }

    @Test
    public void testPrintRecordsIterableOfValues() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        printer.printRecords(java.util.Arrays.asList("x", "y"));
        assertEquals("x\ny\n", out.toString());
    }

    @Test
    public void testPrintRecordsIterableOfRows() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        java.util.List<Object> rows = new java.util.ArrayList<Object>();
        rows.add(java.util.Arrays.asList("a", "b"));
        rows.add(new Object[] { "c", "d" });
        printer.printRecords(rows);
        assertEquals("a,b\nc,d\n", out.toString());
    }

    @Test
    public void testPrintCommentOnNewLine() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(',')
                .withCommentStart('#').withRecordSeparator("\n"));
        printer.printComment("note");
        assertEquals("# note\n", out.toString());
    }

    @Test
    public void testPrintCommentSplitsLines() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(',')
                .withCommentStart('#').withRecordSeparator("\n"));
        printer.printComment("a\nb\r\nc");
        assertEquals("# a\n# b\n# c\n", out.toString());
    }

    @Test
    public void testPrintCommentAfterValueStartsNewRecord() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(',')
                .withCommentStart('#').withRecordSeparator("\n"));
        printer.print("v");
        printer.printComment("note");
        assertEquals("v\n# note\n", out.toString());
    }

    @Test
    public void testDisabledCommentsDoNothing() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.printComment("note");
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintlnUsesConfiguredSeparator() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("!"));
        printer.println();
        assertEquals("!", out.toString());
    }

    @Test
    public void testPrintAfterPrintlnStartsWithoutDelimiter() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        printer.print("a");
        printer.println();
        printer.print("b");
        assertEquals("a\nb", out.toString());
    }

    @Test
    public void testFlushDoesNotChangeOutput() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("value");
        printer.flush();
        assertEquals("value", out.toString());
    }

    @Test
    public void testCloseDoesNotChangeOutput() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("value");
        printer.close();
        assertEquals("value", out.toString());
    }
}
