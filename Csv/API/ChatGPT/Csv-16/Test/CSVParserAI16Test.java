package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CSVParserAI16Test {

    @Test
    public void testParseStringWithDefaultFormat() throws IOException {
        final String source = "a,b,c\n1,2,3";
        final CSVParser parser = CSVParser.parse(source, CSVFormat.DEFAULT);
        assertNotNull(parser);
        
        final Iterator<CSVRecord> iterator = parser.iterator();
        assertTrue(iterator.hasNext());
        final CSVRecord record1 = iterator.next();
        assertEquals("a", record1.get(0));
        assertEquals("b", record1.get(1));
        assertEquals("c", record1.get(2));
        
        assertTrue(iterator.hasNext());
        final CSVRecord record2 = iterator.next();
        assertEquals("1", record2.get(0));
        assertEquals("2", record2.get(1));
        assertEquals("3", record2.get(2));
        
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testHeaderMapInitialization() throws IOException {
        final String source = "header1,header2\nval1,val2";
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("header1", "header2");
        final CSVParser parser = new CSVParser(new StringReader(source), format);
        
        final Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
        assertEquals(Integer.valueOf(0), headerMap.get("header1"));
        assertEquals(Integer.valueOf(1), headerMap.get("header2"));
        
        parser.close();
    }

    @Test
    public void testGetRecords() throws IOException {
        final String source = "x,y\n1,2\n3,4";
        final CSVParser parser = CSVParser.parse(source, CSVFormat.DEFAULT.withSkipHeaderRecord(true).withHeader("x", "y"));
        final java.util.List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("1", records.get(0).get("x"));
        assertEquals("2", records.get(0).get("y"));
        assertEquals("3", records.get(1).get("x"));
        assertEquals("4", records.get(1).get("y"));
        parser.close();
    }
}
