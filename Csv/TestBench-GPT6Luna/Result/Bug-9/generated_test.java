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
    public void testEnumLookupUsesEnumString() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("NEW", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"alpha"}, mapping, null, 1L);
        assertEquals("alpha", record.get(Thread.State.NEW));
    }

    @Test
    public void testCommentAndRecordNumber() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"x"}, null, "note", 42L);
        assertEquals("note", record.getComment());
        assertEquals(42L, record.getRecordNumber());
    }

    @Test
    public void testNullValuesBecomeEmptyRecord() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 0L);
        assertEquals(0, record.size());
        assertEquals("[]", record.toString());
    }

    @Test
    public void testSizeAtZeroAndOneValue() throws Exception {
        CSVRecord empty = new CSVRecord(new String[0], null, null, 0L);
        CSVRecord one = new CSVRecord(new String[] {"v"}, null, null, 0L);
        assertEquals(0, empty.size());
        assertEquals(1, one.size());
    }

    @Test
    public void testIsConsistentWithoutMapping() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 0L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentMatchingHeaderSize() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, mapping, null, 0L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsInconsistentWhenHeaderHasMoreColumns() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 0L);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsMappedWithAndWithoutMapping() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 0L);
        assertTrue(record.isMapped("A"));
        assertFalse(record.isMapped("B"));
        assertFalse(new CSVRecord(new String[] {"a"}, null, null, 0L).isMapped("A"));
    }

    @Test
    public void testIsMappedNullName() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 0L);
        assertFalse(record.isMapped(null));
    }

    @Test
    public void testIsSetAtLastAvailableIndex() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("LAST", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, mapping, null, 0L);
        assertTrue(record.isSet("LAST"));
    }

    @Test
    public void testIsSetAtFirstIndex() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("FIRST", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 0L);
        assertTrue(record.isSet("FIRST"));
    }

    @Test
    public void testIsNotSetAtIndexEqualToSize() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("NEXT", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 0L);
        assertFalse(record.isSet("NEXT"));
    }

    @Test
    public void testIsNotSetWhenNameIsUnmapped() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"a"}, mapping, null, 0L);
        assertFalse(record.isSet("MISSING"));
    }

    @Test
    public void testIteratorPreservesValuesAndOrder() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b", "c"}, null, null, 0L);
        Iterator<String> iterator = record.iterator();
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorForEmptyRecord() throws Exception {
        Iterator<String> iterator = new CSVRecord(null, null, null, 0L).iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testToMapUsesMappedColumns() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("B", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"x", "y"}, mapping, null, 0L);
        Map<String, String> result = record.toMap();
        assertEquals(2, result.size());
        assertEquals("x", result.get("A"));
        assertEquals("y", result.get("B"));
    }

    @Test
    public void testToMapEmptyWithoutMapping() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"x"}, null, null, 0L);
        assertEquals(0, record.toMap().size());
    }

    @Test
    public void testToMapOmitsMappedIndexAtSize() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        mapping.put("MISSING", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"x"}, mapping, null, 0L);
        Map<String, String> result = record.toMap();
        assertEquals(1, result.size());
        assertEquals("x", result.get("A"));
        assertFalse(result.containsKey("MISSING"));
    }

    @Test
    public void testToStringFormatsValues() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"a", "b"}, null, null, 0L);
        assertEquals("[a, b]", record.toString());
    }

    @Test
    public void testToStringIncludesNullValue() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {null}, null, null, 0L);
        assertEquals("[null]", record.toString());
    }

    @Test
    public void testGetByNameWithoutMappingThrows() throws Exception {
        CSVRecord record = new CSVRecord(new String[] {"x"}, null, null, 0L);
        try {
            record.get("A");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testGetByNameUnmappedThrows() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", Integer.valueOf(0));
        CSVRecord record = new CSVRecord(new String[] {"x"}, mapping, null, 0L);
        try {
            record.get("B");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetByNameMappedIndexAtSizeThrows() throws Exception {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("NEXT", Integer.valueOf(1));
        CSVRecord record = new CSVRecord(new String[] {"x"}, mapping, null, 0L);
        try {
            record.get("NEXT");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
