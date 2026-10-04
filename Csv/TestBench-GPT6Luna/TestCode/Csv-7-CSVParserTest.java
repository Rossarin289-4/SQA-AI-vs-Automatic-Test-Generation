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
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {
    @Test
    public void testGetRecordsAcrossSeveralRows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.newFormat(','));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("d", records.get(1).get(1));
        assertEquals(2L, parser.getRecordNumber());
    }

    @Test
    public void testGetRecordsConsumesFromCurrentPosition() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> it = parser.iterator();
        assertEquals("a", it.next().get(0));
        List<CSVRecord> remaining = parser.getRecords();
        assertEquals(2, remaining.size());
        assertEquals("b", remaining.get(0).get(0));
        assertEquals("c", remaining.get(1).get(0));
    }

    @Test
    public void testHeaderMapUsesHeaderOrderAndIndices() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x,y\n1,2"),
                CSVFormat.newFormat(',').withHeader());
        Map<String, Integer> headers = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), headers.get("x"));
        assertEquals(Integer.valueOf(1), headers.get("y"));
        CSVRecord record = parser.getRecords().get(0);
        assertEquals("2", record.get("y"));
    }

    @Test
    public void testExplicitHeaderCanSkipInputHeader() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("discarded,header\nv,w"),
                CSVFormat.newFormat(',').withHeader("left", "right").withSkipHeaderRecord(true));
        assertEquals("v", parser.getRecords().get(0).get("left"));
        assertEquals(Integer.valueOf(1), parser.getHeaderMap().get("right"));
        assertEquals(2L, parser.getRecordNumber());
    }

    @Test
    public void testGetHeaderMapReturnsIndependentCopy() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b"), CSVFormat.newFormat(',').withHeader("a", "b"));
        Map<String, Integer> copy = parser.getHeaderMap();
        copy.clear();
        assertEquals(Integer.valueOf(1), parser.getHeaderMap().get("b"));
    }

    @Test
    public void testHeaderMapIsNullWithoutConfiguredHeader() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a"), CSVFormat.newFormat(','));
        assertNull(parser.getHeaderMap());
    }

    @Test
    public void testRecordNumbersIncreaseForRecords() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb"), CSVFormat.newFormat(','));
        List<CSVRecord> records = parser.getRecords();
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
    public void testIteratorHasNextAndNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next().get(0));
        assertTrue(it.hasNext());
        assertEquals("b", it.next().get(0));
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorNextWithoutHasNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("first"), CSVFormat.newFormat(','));
        assertEquals("first", parser.iterator().next().get(0));
    }

    @Test
    public void testIteratorNextAfterExhaustionThrows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> it = parser.iterator();
        assertEquals("a", it.next().get(0));
        try {
            it.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testIteratorRemoveThrows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> it = parser.iterator();
        try {
            it.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals("a", it.next().get(0));
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
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        assertFalse(it.hasNext());
    }

    @Test
    public void testClosedIteratorNextThrows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> it = parser.iterator();
        parser.close();
        try {
            it.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testCurrentLineNumberAfterParsing() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb"), CSVFormat.newFormat(','));
        parser.getRecords();
        assertEquals(1L, parser.getCurrentLineNumber());
    }

    @Test
    public void testExplicitHeaderWithoutSkippingKeepsFirstRowAsData() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x,y\nv,w"),
                CSVFormat.newFormat(',').withHeader("first", "second"));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("x", records.get(0).get("first"));
        assertEquals("v", records.get(1).get("first"));
    }

    @Test
    public void testNullStringIsConvertedToNullCaseInsensitively() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("NULL,keep"),
                CSVFormat.newFormat(',').withNullString("null"));
        CSVRecord record = parser.getRecords().get(0);
        assertNull(record.get(0));
        assertEquals("keep", record.get(1));
    }

    @Test
    public void testCommentsDoNotCreateRecords() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("#note\na,b"),
                CSVFormat.newFormat(',').withCommentStart('#'));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals(1L, parser.getRecordNumber());
    }

    @Test
    public void testEmptyLinesCanBeIgnored() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\n\nb"),
                CSVFormat.newFormat(',').withIgnoreEmptyLines(true));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("b", records.get(1).get(0));
    }

    @Test
    public void testDuplicateHeaderNamesAreRejected() throws Exception {
        try {
            new CSVParser(new StringReader(""), CSVFormat.newFormat(',').withHeader("x", "x"));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }
}
