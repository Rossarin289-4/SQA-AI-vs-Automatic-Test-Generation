package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class CSVRecordTest {
    @Test
    public void testGetFirstValue() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"first", "last"}, null, null, 1);
        assertEquals("first", record.get(0));
    }

    @Test
    public void testGetLastValue() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"first", "last"}, null, null, 1);
        assertEquals("last", record.get(1));
    }

    @Test
    public void testGetAtLengthThrows() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"only"}, null, null, 1);
        try {
            record.get(1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testIsConsistentWithoutMapping() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 1);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentMatchingMappingSize() throws Exception {
        Map<String, Integer> mapping = new java.util.HashMap<String, Integer>();
        mapping.put("a", 0);
        mapping.put("b", 1);
        CSVRecord record = new CSVRecord(new String[] {"x", "y"}, mapping, null, 1);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentDifferentMappingSize() throws Exception {
        Map<String, Integer> mapping = new java.util.HashMap<String, Integer>();
        mapping.put("a", 0);
        CSVRecord record = new CSVRecord(new String[] {"x", "y"}, mapping, null, 1);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsMappedPresentAndAbsent() throws Exception {
        Map<String, Integer> mapping = new java.util.HashMap<String, Integer>();
        mapping.put("a", 0);
        CSVRecord record = new CSVRecord(new String[] {"x"}, mapping, null, 1);
        assertTrue(record.isMapped("a"));
        assertFalse(record.isMapped("b"));
    }

    @Test
    public void testIsMappedWithoutMapping() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"x"}, null, null, 1);
        assertFalse(record.isMapped("x"));
    }

    @Test
    public void testIsSetMappedValueInRange() throws Exception {
        Map<String, Integer> mapping = new java.util.HashMap<String, Integer>();
        mapping.put("a", 0);
        CSVRecord record = new CSVRecord(new String[] {"x"}, mapping, null, 1);
        assertTrue(record.isSet("a"));
    }

    @Test
    public void testIsSetIndexAtLength() throws Exception {
        Map<String, Integer> mapping = new java.util.HashMap<String, Integer>();
        mapping.put("a", 1);
        CSVRecord record = new CSVRecord(new String[] {"x"}, mapping, null, 1);
        assertFalse(record.isSet("a"));
    }

    @Test
    public void testIsSetUnmappedName() throws Exception {
        Map<String, Integer> mapping = new java.util.HashMap<String, Integer>();
        mapping.put("a", 0);
        CSVRecord record = new CSVRecord(new String[] {"x"}, mapping, null, 1);
        assertFalse(record.isSet("b"));
    }

    @Test
    public void testIteratorValuesAndOrder() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 1);
        Iterator<String> iterator = record.iterator();
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorEmptyRecord() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1);
        assertFalse(record.iterator().hasNext());
    }

    @Test
    public void testGetComment() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"x"}, null, "note", 1);
        assertEquals("note", record.getComment());
    }

    @Test
    public void testGetNullComment() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"x"}, null, null, 1);
        assertEquals(null, record.getComment());
    }

    @Test
    public void testGetRecordNumber() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"x"}, null, null, 27);
        assertEquals(27L, record.getRecordNumber());
    }

    @Test
    public void testSize() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b", "c"}, null, null, 1);
        assertEquals(3, record.size());
    }

    @Test
    public void testSizeForNullValues() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1);
        assertEquals(0, record.size());
    }

    @Test
    public void testToString() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 1);
        assertEquals("[a, b]", record.toString());
    }

    @Test
    public void testToStringForEmptyRecord() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1);
        assertEquals("[]", record.toString());
    }
}
