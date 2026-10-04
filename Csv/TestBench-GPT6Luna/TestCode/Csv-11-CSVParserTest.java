package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {
    @Test
    public void testGetRecordsReadsMultipleRows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.newFormat(','));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("d", records.get(1).get(1));
        assertEquals(2L, parser.getRecordNumber());
    }

    @Test
    public void testGetRecordsReturnsEmptyForEmptyInput() throws Exception {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.newFormat(','));
        assertEquals(0, parser.getRecords().size());
        assertEquals(0L, parser.getRecordNumber());
    }

    @Test
    public void testGetRecordsContinuesAtCurrentPosition() throws Exception {
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
    public void testGetHeaderMapFromFirstRecord() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("name,age\nAda,7"),
                CSVFormat.newFormat(',').withHeader());
        Map<String, Integer> header = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), header.get("name"));
        assertEquals(Integer.valueOf(1), header.get("age"));
        assertEquals("Ada", parser.getRecords().get(0).get("name"));
    }

    @Test
    public void testGetHeaderMapForExplicitHeader() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x,y\n1,2"),
                CSVFormat.newFormat(',').withHeader("first", "second"));
        assertEquals(Integer.valueOf(0), parser.getHeaderMap().get("first"));
        assertEquals(Integer.valueOf(1), parser.getHeaderMap().get("second"));
        assertEquals("x", parser.getRecords().get(0).get("first"));
    }

    @Test
    public void testHeaderMapIsCopy() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b\n1,2"),
                CSVFormat.newFormat(',').withHeader());
        Map<String, Integer> copy = parser.getHeaderMap();
        copy.put("added", Integer.valueOf(3));
        assertFalse(parser.getHeaderMap().containsKey("added"));
        assertEquals(2, parser.getHeaderMap().size());
    }

    @Test
    public void testGetHeaderMapIsNullWithoutHeader() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.newFormat(','));
        assertNull(parser.getHeaderMap());
    }

    @Test
    public void testRecordNumberAfterEachIteration() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("first\nsecond"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> iterator = parser.iterator();
        assertEquals(0L, parser.getRecordNumber());
        assertEquals("first", iterator.next().get(0));
        assertEquals(1L, parser.getRecordNumber());
        assertEquals("second", iterator.next().get(0));
        assertEquals(2L, parser.getRecordNumber());
    }

    @Test
    public void testIteratorHasNextAndNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> iterator = parser.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next().get(0));
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next().get(0));
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorNextWithoutHasNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("value"), CSVFormat.newFormat(','));
        assertEquals("value", parser.iterator().next().get(0));
    }

    @Test
    public void testIteratorNextAtEndThrows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.newFormat(','));
        try {
            parser.iterator().next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testIteratorRemoveThrows() throws Exception {
        Iterator<CSVRecord> iterator =
                new CSVParser(new StringReader("x"), CSVFormat.newFormat(',')).iterator();
        try {
            iterator.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testCloseMarksParserClosed() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x"), CSVFormat.newFormat(','));
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testIteratorAfterCloseHasNoNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x"), CSVFormat.newFormat(','));
        parser.close();
        assertFalse(parser.iterator().hasNext());
    }

    @Test
    public void testIteratorNextAfterCloseThrows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x"), CSVFormat.newFormat(','));
        parser.close();
        try {
            parser.iterator().next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testCurrentLineNumberAcrossRecords() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc"), CSVFormat.newFormat(','));
        assertEquals(0L, parser.getCurrentLineNumber());
        Iterator<CSVRecord> iterator = parser.iterator();
        assertEquals("a", iterator.next().get(0));
        assertEquals(1L, parser.getCurrentLineNumber());
        assertEquals("b", iterator.next().get(0));
        assertEquals(2L, parser.getCurrentLineNumber());
    }

    @Test
    public void testGetRecordsUsesNullStringCaseInsensitively() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("NULL,nullish"),
                CSVFormat.newFormat(',').withNullString("null"));
        CSVRecord record = parser.getRecords().get(0);
        assertNull(record.get(0));
        assertEquals("nullish", record.get(1));
    }

    @Test
    public void testExplicitHeaderCanSkipInputHeader() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("old,header\nv,w"),
                CSVFormat.newFormat(',').withHeader("left", "right").withSkipHeaderRecord(true));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("v", records.get(0).get("left"));
        assertEquals("w", records.get(0).get("right"));
    }

    @Test
    public void testParseFileReadsWithSpecifiedCharset() throws Exception {
        File file = File.createTempFile("csv", ".txt");
        try {
            java.nio.file.Files.write(file.toPath(), "a,b".getBytes(Charset.forName("UTF-8")));
            CSVParser parser = CSVParser.parse(file, Charset.forName("UTF-8"), CSVFormat.newFormat(','));
            CSVRecord record = parser.getRecords().get(0);
            assertEquals(2, record.size());
            assertEquals("b", record.get(1));
            parser.close();
        } finally {
            file.delete();
        }
    }
}
