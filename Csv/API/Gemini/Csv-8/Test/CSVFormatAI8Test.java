package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CSVFormatAI8Test {

    @Test
    public void testDefaultFormat() {
        assertNotNull(CSVFormat.DEFAULT);
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharLineBreak() {
        CSVFormat.DEFAULT.withQuoteChar('\n');
    }
}
