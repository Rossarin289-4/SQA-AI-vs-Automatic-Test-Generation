```java
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {
    @Test
    public void testParseDelimitedValues() throws Exception {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.newFormat(','));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals(2, records.get(0).size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
    }

    @Test
    public void testParseMultipleRecordsAndRecordNumbers() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.newFormat(','));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals(1L, records.get(0).getRecordNumber());
        assertEquals(2L, records.get(1).getRecordNumber());
        assertEquals(2L, parser.getRecordNumber());
    }

    @Test
    public void testEmptyInputHasNoRecords() throws Exception {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.newFormat(','));
        assertEquals(0, parser.getRecords().size());
        assertEquals(0L, parser.getRecordNumber());
    }

    @Test
    public void testHeaderReadFromInput() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withHeader();
        CSVParser parser = new CSVParser(new StringReader("name,age\nAda,7"), format);
        Map<String, Integer> header = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), header.get("name"));
        assertEquals(Integer.valueOf(1), header.get("age"));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("Ada", records.get(0).get("name"));
    }

    @Test
    public void testExplicitHeaderAndSkipHeaderRecord() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withHeader("x", "y").withSkipHeaderRecord(true);
        CSVParser parser = new CSVParser(new StringReader("x,y\n1,2"), format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get("x"));
        assertEquals(Integer.valueOf(1), parser.getHeaderMap().get("y"));
    }

    @Test
    public void testHeaderMapIsCopy() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b\n1,2"),
                CSVFormat.newFormat(',').withHeader());
        Map<String, Integer> copy = parser.getHeaderMap();
        copy.clear();
        assertEquals(Integer.valueOf(0), parser.getHeaderMap().get("a"));
        assertEquals(2, parser.getHeaderMap().size());
    }

    @Test
    public void testNoHeaderMapWithoutConfiguredHeader() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.newFormat(','));
        assertEquals(null, parser.getHeaderMap());
    }

    @Test
    public void testIteratorHasNextAndNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> iterator = parser.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next().get(0));
        assertEquals("b", iterator.next().get(0));
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorNextWithoutHasNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("v"), CSVFormat.newFormat(','));
        assertEquals("v", parser.iterator().next().get(0));
    }

    @Test
    public void testIteratorExhaustionThrows() throws Exception {
        Iterator<CSVRecord> iterator =
                new CSVParser(new StringReader(""), CSVFormat.newFormat(',')).iterator();
        try {
            iterator.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testIteratorRemoveThrows() throws Exception {
        Iterator<CSVRecord> iterator =
                new CSVParser(new StringReader("a"), CSVFormat.newFormat(',')).iterator();
        try {
            iterator.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals("a", iterator.next().get(0));
    }

    @Test
    public void testCloseChangesClosedState() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a"), CSVFormat.newFormat(','));
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testClosedIteratorHasNoNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testClosedIteratorNextThrows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> iterator = parser.iterator();
        parser.close();
        try {
            iterator.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testCurrentLineAfterReadingRecord() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> iterator = parser.iterator();
        assertEquals("a", iterator.next().get(0));
        assertEquals(1L, parser.getCurrentLineNumber());
        assertEquals("b", iterator.next().get(0));
        assertEquals(2L, parser.getCurrentLineNumber());
    }

    @Test
    public void testGetRecordsStartsAtCurrentPosition() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> iterator = parser.iterator();
        assertEquals("a", iterator.next().get(0));
        List<CSVRecord> remaining = parser.getRecords();
        assertEquals(2, remaining.size());
        assertEquals("b", remaining.get(0).get(0));
        assertEquals("c", remaining.get(1).get(0));
        assertEquals(3L, parser.getRecordNumber());
    }

    @Test
    public void testNullStringMapsMatchingValueToNull() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withNullString("NULL");
        CSVParser parser = new CSVParser(new StringReader("NULL,value"), format);
        CSVRecord record = parser.getRecords().get(0);
        assertEquals(null, record.get(0));
        assertEquals("value", record.get(1));
    }

    @Test
    public void testNullStringMatchingIgnoresCase() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withNullString("NULL");
        CSVRecord record = new CSVParser(new StringReader("null"), format).getRecords().get(0);
        assertEquals(null, record.get(0));
    }

    @Test
    public void testNullStringDoesNotChangeNonmatchingValue() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withNullString("NULL");
        CSVRecord record = new CSVParser(new StringReader("Nullish"), format).getRecords().get(0);
        assertEquals("Nullish", record.get(0));
    }

    @Test
    public void testEmptyFieldsAreRetained() throws Exception {
        CSVParser parser = new CSVParser(new StringReader(",x,"), CSVFormat.newFormat(','));
        CSVRecord record = parser.getRecords().get(0);
        assertEquals(3, record.size());
        assertEquals("", record.get(0));
        assertEquals("x", record.get(1));
        assertEquals("", record.get(2));
    }

    @Test
    public void testQuotedDelimiterIsWithinValue() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withQuoteChar('"');
        CSVRecord record = new CSVParser(new StringReader("\"a,b\",c"), format)
                .getRecords().get(0);
        assertEquals("a,b", record.get(0));
        assertEquals("c", record.get(1));
    }
}
```