package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;

public class CSVParserAI11Test {

    @Test
    public void testParseStringAndGetRecords() throws IOException {
        String csv = "a,b,c\n1,2,3";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertNotNull(records);
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("3", records.get(1).get(2));
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIteratorAndClose() throws IOException {
        CSVParser parser = new CSVParser(new StringReader("x,y\n4,5"), CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        assertTrue(iterator.hasNext());
        CSVRecord record = iterator.next();
        assertNotNull(record);
        assertEquals("x", record.get(0));

        parser.close();
        assertTrue(parser.isClosed());
        assertFalse(iterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNoSuchElement() throws IOException {
        CSVParser parser = CSVParser.parse("onlyone", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        assertTrue(iterator.hasNext());
        iterator.next();
        iterator.next();
    }
}
