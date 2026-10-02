package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CSVFormatAI14Test {

    @Test
    public void testPredefinedFormats() {
        assertNotNull(CSVFormat.Predefined.Default.getFormat());
        assertNotNull(CSVFormat.Predefined.Excel.getFormat());
        assertNotNull(CSVFormat.Predefined.MySQL.getFormat());
    }

    @Test
    public void testWithMethods() {
        CSVFormat format = CSVFormat.DEFAULT
                .withTrim(true)
                .withTrailingDelimiter(true)
                .withSkipHeaderRecord(true);

        assertNotNull(format);
    }

    @Test
    public void testWithQuoteCharValidation() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('"');
        assertNotNull(format);
    }
}
