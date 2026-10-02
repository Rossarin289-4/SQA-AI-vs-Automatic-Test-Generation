package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import org.junit.Test;

public class CSVPrinterAI5Test {

    @Test
    public void testClose() throws IOException {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        printer.close();
        assertEquals("", out.toString());
    }

    @Test
    public void testFlush() throws IOException {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        printer.flush();
        assertEquals("", out.toString());
    }

    @Test
    public void testGetOut() {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
        assertEquals(out, printer.getOut());
    }
}
