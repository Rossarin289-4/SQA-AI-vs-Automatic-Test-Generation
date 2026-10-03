package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CSVFormatAI13Test {

    @Test
    public void testPredefinedFormats() {
        assertNotNull(CSVFormat.Predefined.Default.getFormat());
        assertNotNull(CSVFormat.Predefined.Excel.getFormat());
        assertNotNull(CSVFormat.Predefined.MySQL.getFormat());
        assertNotNull(CSVFormat.Predefined.RFC4180.getFormat());
        assertNotNull(CSVFormat.Predefined.TDF.getFormat());
    }

    @Test
    public void testWithMethodsImmutabilityAndChaining() {
        CSVFormat format = CSVFormat.DEFAULT
                .withNullString("NULL")
                .withSkipHeaderRecord(true)
                .withQuoteMode(QuoteMode.ALL);

        assertNotNull(format);
        assertEquals("NULL", format.getNullString());
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreakThrowsException() {
        CSVFormat.DEFAULT.withQuote('\n');
    }
}
