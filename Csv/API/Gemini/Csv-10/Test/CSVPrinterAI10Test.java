package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import org.junit.Test;

public class CSVPrinterAI10Test {

    @Test
    public void testPrintSingleValue() throws IOException {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        printer.print("value");
        assertEquals("value", out.toString());
    }

    @Test
    public void testPrintRecord() throws IOException {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        printer.printRecord("a", "b", "c");
        assertEquals("a,b,c\r\n", out.toString());
    }

    @Test
    public void testPrintComment() throws IOException {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        printer.printComment("test comment");
        assertEquals("# test comment\r\n", out.toString());
    }
}
