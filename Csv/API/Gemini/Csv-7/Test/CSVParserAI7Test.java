package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class CSVParserAI7Test {

    @Test
    public void testParseStringBasic() throws IOException {
        final String csv = "a,b,c\n1,2,3";
        final CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        assertNotNull(parser);
        
        final List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("3", records.get(1).get(2));
    }

    @Test
    public void testParseEmptyString() throws IOException {
        final CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        assertNotNull(parser);
        final CSVRecord record = parser.nextRecord();
        assertNull(record);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }
}
