package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CSVFormatAI12Test {

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertNotNull(format);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreak() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test
    public void testWithNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertNotNull(format);
    }
}
