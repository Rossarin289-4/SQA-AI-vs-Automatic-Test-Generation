package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class CSVPrinterAI13Test {

    @Test
    public void testGetOut() throws IOException {
        StringBuilder sw = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        assertEquals(sw, printer.getOut());
    }

    @Test
    public void testPrintNullDefault() throws IOException {
        StringBuilder sw = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.print(null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintln() throws IOException {
        StringBuilder sw = new StringBuilder();
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.println();
        assertEquals("\n", sw.toString());
    }
}
