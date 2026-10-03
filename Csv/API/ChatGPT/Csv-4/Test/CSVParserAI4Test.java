package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.List;
import org.junit.Test;

public class CSVParserAI4Test {

    @Test
    public void testParseStringBasic() throws IOException {
        final String input = "a,b,c\n1,2,3";
        final CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();
        
        assertNotNull(records);
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("3", records.get(1).get(2));
    }

    @Test
    public void testGetHeaderMap() throws IOException {
        final String input = "header1,header2\nval1,val2";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("header1", "header2");
        final CSVParser parser = CSVParser.parse(input, format);
        
        assertNotNull(parser.getHeaderMap());
        assertEquals(Integer.valueOf(0), parser.getHeaderMap().get("header1"));
        assertEquals(Integer.valueOf(1), parser.getHeaderMap().get("header2"));
    }

    @Test
    public void testParseEmptyString() throws IOException {
        final CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        final List<CSVRecord> records = parser.getRecords();
        
        assertNotNull(records);
        assertEquals(0, records.size());
        assertEquals(0, parser.getRecordNumber());
    }
}
