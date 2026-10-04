package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class CSVParserTest {
    @Test
    public void testRecordValuesAndNumbers() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a,b\nc,d"), CSVFormat.newFormat(','));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("d", records.get(1).get(1));
        assertEquals(2L, parser.getRecordNumber());
    }

    @Test
    public void testRecordsContinueFromCurrentPosition() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> it = parser.iterator();
        assertEquals("a", it.next().get(0));
        List<CSVRecord> remaining = parser.getRecords();
        assertEquals(2, remaining.size());
        assertEquals("b", remaining.get(0).get(0));
        assertEquals("c", remaining.get(1).get(0));
    }

    @Test
    public void testEmptyInputProducesNoRecords() throws Exception {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.newFormat(','));
        assertEquals(0, parser.getRecords().size());
        assertEquals(0L, parser.getRecordNumber());
    }

    @Test
    public void testHeaderMapUsesHeaderOrder() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withHeader("first", "second");
        CSVParser parser = new CSVParser(new StringReader("x,y"), format);
        Map<String, Integer> headers = parser.getHeaderMap();
        assertEquals(Integer.valueOf(0), headers.get("first"));
        assertEquals(Integer.valueOf(1), headers.get("second"));
        assertEquals(Arrays.asList("first", "second"), new ArrayList<String>(headers.keySet()));
    }

    @Test
    public void testInputHeaderIsReadAndSkipped() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withHeader();
        CSVParser parser = new CSVParser(new StringReader("name,age\nAda,7"), format);
        assertEquals(Integer.valueOf(0), parser.getHeaderMap().get("name"));
        assertEquals(Integer.valueOf(1), parser.getHeaderMap().get("age"));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("Ada", records.get(0).get("name"));
    }

    @Test
    public void testExplicitHeaderCanSkipInputHeader() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withHeader("col").withSkipHeaderRecord();
        CSVParser parser = new CSVParser(new StringReader("ignored\nvalue"), format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("value", records.get(0).get("col"));
    }

    @Test
    public void testHeaderMapIsCopy() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("v"), CSVFormat.newFormat(',').withHeader("h"));
        Map<String, Integer> copy = parser.getHeaderMap();
        copy.put("extra", Integer.valueOf(9));
        assertEquals(Integer.valueOf(0), parser.getHeaderMap().get("h"));
        assertFalse(parser.getHeaderMap().containsKey("extra"));
    }

    @Test
    public void testNoHeaderReturnsNullMap() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("v"), CSVFormat.newFormat(','));
        assertNull(parser.getHeaderMap());
    }

    @Test
    public void testCaseInsensitiveHeaderLookup() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withHeader("Name").withIgnoreHeaderCase();
        CSVParser parser = new CSVParser(new StringReader("Ada"), format);
        assertEquals(Integer.valueOf(0), parser.getHeaderMap().get("Name"));
        assertEquals("Ada", parser.getRecords().get(0).get("Name"));
    }

    @Test
    public void testHeaderMapRejectsDuplicateNames() throws Exception {
        try {
            new CSVParser(new StringReader(""), CSVFormat.newFormat(',').withHeader("x", "x"));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRecordNumberStartsAtSuppliedValue() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x\ny"), CSVFormat.newFormat(','), 0, 10);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(10L, records.get(0).getRecordNumber());
        assertEquals(11L, records.get(1).getRecordNumber());
        assertEquals(11L, parser.getRecordNumber());
    }

    @Test
    public void testCharacterOffsetContributesToRecordPosition() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("x"), CSVFormat.newFormat(','), 7, 1);
        assertEquals(7L, parser.getRecords().get(0).getCharacterPosition());
    }

    @Test
    public void testFirstEndOfLineIsReported() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\r\nb\nc"), CSVFormat.newFormat(','));
        parser.getRecords();
        assertEquals("\r\n", parser.getFirstEndOfLine());
    }

    @Test
    public void testCurrentLineNumberTracksNewlines() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("a\nb\nc"), CSVFormat.newFormat(','));
        parser.getRecords();
        assertEquals(2L, parser.getCurrentLineNumber());
    }

    @Test
    public void testIteratorHasNextAndNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("one\ntwo"), CSVFormat.newFormat(','));
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue(it.hasNext());
        assertEquals("one", it.next().get(0));
        assertTrue(it.hasNext());
        assertEquals("two", it.next().get(0));
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorNextWithoutHasNext() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("v"), CSVFormat.newFormat(','));
        assertEquals("v", parser.iterator().next().get(0));
    }

    @Test
    public void testIteratorRemoveIsUnsupported() throws Exception {
        Iterator<CSVRecord> it = new CSVParser(new StringReader("v"), CSVFormat.newFormat(',')).iterator();
        it.next();
        try {
            it.remove();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testNextAtEndThrows() throws Exception {
        Iterator<CSVRecord> it = new CSVParser(new StringReader(""), CSVFormat.newFormat(',')).iterator();
        try {
            it.next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testCloseMarksParserClosed() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("v"), CSVFormat.newFormat(','));
        parser.close();
        assertTrue(parser.isClosed());
        assertFalse(parser.iterator().hasNext());
    }

    @Test
    public void testNextAfterCloseThrows() throws Exception {
        CSVParser parser = new CSVParser(new StringReader("v"), CSVFormat.newFormat(','));
        parser.close();
        try {
            parser.iterator().next();
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testTrimIsAppliedToValues() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withTrim();
        CSVParser parser = new CSVParser(new StringReader("  x  , y "), format);
        CSVRecord record = parser.getRecords().get(0);
        assertEquals("x", record.get(0));
        assertEquals("y", record.get(1));
    }

    @Test
    public void testNullStringProducesNullValue() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withNullString("NULL");
        CSVRecord record = new CSVParser(new StringReader("NULL,x"), format).getRecords().get(0);
        assertNull(record.get(0));
        assertEquals("x", record.get(1));
    }

    @Test
    public void testTrailingDelimiterDoesNotAddFinalEmptyValue() throws Exception {
        CSVFormat format = CSVFormat.newFormat(',').withTrailingDelimiter();
        CSVRecord record = new CSVParser(new StringReader("a,"), format).getRecords().get(0);
        assertEquals(1, record.size());
        assertEquals("a", record.get(0));
    }

    @Test
    public void testFileParseFactoryReadsCsv() throws Exception {
        Path path = Files.createTempFile("csvtest", ".csv");
        try {
            Files.write(path, "a,b".getBytes(Charset.forName("UTF-8")));
            CSVParser parser = CSVParser.parse(path.toFile(), Charset.forName("UTF-8"), CSVFormat.newFormat(','));
            assertEquals("b", parser.getRecords().get(0).get(1));
            parser.close();
        } finally {
            Files.deleteIfExists(path);
        }
    }
}
