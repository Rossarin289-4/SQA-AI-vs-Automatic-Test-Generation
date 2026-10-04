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
    public void testPrintSeparatesValues() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("a");
        printer.print("b");
        assertEquals("a,b", out.toString());
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
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(',').withNullString("NA"));
        printer.print(null);
        assertEquals("NA", out.toString());
    }

    @Test
    public void testPrintQuotesDelimiter() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("a,b");
        assertEquals("a,b", out.toString());
    }

    @Test
    public void testPrintDoublesEmbeddedQuote() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("a\"b");
        assertEquals("a\"b", out.toString());
    }

    @Test
    public void testPrintQuotesEmptyFirstValue() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("");
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintQuotesValueEndingInSpace() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.print("a ");
        assertEquals("a ", out.toString());
    }

    @Test
    public void testPrintQuotePolicyAll() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withQuotePolicy(Quote.ALL));
        printer.print("abc");
        assertEquals("abc", out.toString());
    }

    @Test
    public void testPrintQuotePolicyNonNumeric() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withQuotePolicy(Quote.NON_NUMERIC));
        printer.print("12");
        printer.print(Integer.valueOf(12));
        assertEquals("12,12", out.toString());
    }

    @Test
    public void testPrintQuotePolicyNoneEscapesDelimiter() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withQuotePolicy(Quote.NONE).withEscape('\\'));
        printer.print("a,b");
        assertEquals("a\\,b", out.toString());
    }

    @Test
    public void testPrintRecordIterableAndRecordSeparator() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        printer.printRecord(java.util.Arrays.asList("a", "b"));
        assertEquals("a,b\n", out.toString());
    }

    @Test
    public void testPrintRecordEmptyIterable() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        printer.printRecord(java.util.Collections.emptyList());
        assertEquals("\n", out.toString());
    }

    @Test
    public void testPrintRecordsIterableOfRecordsAndValues() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        java.util.List<Object> rows = new java.util.ArrayList<Object>();
        rows.add(new Object[] {"a", "b"});
        rows.add("c");
        printer.printRecords(rows);
        assertEquals("a,b\nc\n", out.toString());
    }

    @Test
    public void testPrintRecordsIterableOfIterableRows() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("\n"));
        java.util.List<Object> rows = new java.util.ArrayList<Object>();
        rows.add(java.util.Arrays.asList("a", "b"));
        printer.printRecords(rows);
        assertEquals("a,b\n", out.toString());
    }

    @Test
    public void testPrintCommentDisabledDoesNothing() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.printComment("note");
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintCommentAtRecordStartAndOnMultipleLines() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withCommentStart('#').withRecordSeparator("\n"));
        printer.printComment("a\nb");
        assertEquals("# a\n# b\n", out.toString());
    }

    @Test
    public void testPrintCommentFinishesExistingRecordBeforeComment() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withCommentStart('#').withRecordSeparator("\n"));
        printer.print("v");
        printer.printComment("x");
        assertEquals("v\n# x\n", out.toString());
    }

    @Test
    public void testPrintlnResetsRecordForNextValue() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withRecordSeparator("|"));
        printer.print("a");
        printer.println();
        printer.print("b");
        assertEquals("a|b", out.toString());
    }

    @Test
    public void testPrintEscapesLineBreakAndDelimiter() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out,
                CSVFormat.newFormat(',').withQuoteChar((Character) null).withEscape('\\'));
        printer.print("a,b\nc");
        assertEquals("a\\,b\\nc", out.toString());
    }

    @Test
    public void testFlushAndCloseAreSafeForStringBuilder() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.newFormat(','));
        printer.flush();
        printer.close();
        assertEquals("", out.toString());
    }
}
