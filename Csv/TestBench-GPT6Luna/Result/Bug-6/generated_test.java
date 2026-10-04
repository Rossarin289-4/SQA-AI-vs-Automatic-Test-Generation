package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CSVRecordTest {
    @Test
    public void testGetEnumUsesEnumString() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("ALPHA", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"first"}, mapping, null, 1L);
        assertEquals("first", record.get(TestColumn.ALPHA));
    }

    @Test
    public void testGetCommentReturnsComment() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"v"}, null, "note", 2L);
        assertEquals("note", record.getComment());
    }

    @Test
    public void testGetCommentCanBeNull() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"v"}, null, null, 2L);
        assertEquals(null, record.getComment());
    }

    @Test
    public void testGetRecordNumberReturnsLong() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"v"}, null, null, 2147483648L);
        assertEquals(2147483648L, record.getRecordNumber());
    }

    @Test
    public void testUnmappedRecordIsConsistent() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testMappedRecordWithMatchingSizeIsConsistent() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testMappedRecordWithDifferentSizeIsInconsistent() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsMappedDistinguishesPresentAndMissingNames() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 1L);
        assertTrue(record.isMapped("A"));
        assertFalse(record.isMapped("B"));
    }

    @Test
    public void testIsMappedWithoutMappingIsFalse() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a"}, null, null, 1L);
        assertFalse(record.isMapped("A"));
    }

    @Test
    public void testIsSetForPresentValue() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 1L);
        assertTrue(record.isSet("A"));
    }

    @Test
    public void testIsSetFalseForUnmappedName() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 1L);
        assertFalse(record.isSet("B"));
    }

    @Test
    public void testIsSetFalseForMappedIndexAtRecordLength() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 1L);
        assertFalse(record.isSet("A"));
    }

    @Test
    public void testIteratorReturnsValuesInOrder() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 1L);
        Iterator<String> iterator = record.iterator();
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorForEmptyValuesHasNoElements() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertFalse(record.iterator().hasNext());
    }

    @Test
    public void testSizeReturnsNumberOfValues() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b", "c"}, null, null, 1L);
        assertEquals(3, record.size());
    }

    @Test
    public void testNullValuesProduceZeroSize() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
    }

    @Test
    public void testToMapUsesMappedColumns() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, mapping, null, 1L);
        Map<String, String> result = record.toMap();
        assertEquals(2, result.size());
        assertEquals("a", result.get("A"));
        assertEquals("b", result.get("B"));
    }

    @Test
    public void testToMapSkipsMappedIndexAtRecordLength() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 1L);
        Map<String, String> result = record.toMap();
        assertEquals(1, result.size());
        assertEquals("a", result.get("A"));
        assertFalse(result.containsKey("B"));
    }

    @Test
    public void testToMapWithoutMappingIsEmpty() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 1L);
        assertTrue(record.toMap().isEmpty());
    }

    @Test
    public void testToStringFormatsValuesAsArray() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 1L);
        assertEquals("[a, b]", record.toString());
    }

    @Test
    public void testToStringForEmptyRecord() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals("[]", record.toString());
    }

    private enum TestColumn {
        ALPHA
    }
}
