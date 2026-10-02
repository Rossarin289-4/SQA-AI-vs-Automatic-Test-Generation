package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CSVRecordAI6Test {

    @Test
    public void testGetByIndexAndSize() {
        final String[] values = new String[] { "A", "B", "C" };
        final CSVRecord record = new CSVRecord(values, null, "comment", 1L);

        assertEquals("A", record.get(0));
        assertEquals("B", record.get(1));
        assertEquals("C", record.get(2));
        assertEquals(3, record.size());
        assertEquals("comment", record.getComment());
        assertEquals(1L, record.getRecordNumber());
        assertEquals("[A, B, C]", record.toString());
    }

    @Test
    public void testGetByName() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.get("col1");
        mapping.put("col1", Integer.valueOf(0));
        mapping.put("col2", Integer.valueOf(1));

        final String[] values = new String[] { "Val1", "Val2" };
        final CSVRecord record = new CSVRecord(values, mapping, null, 2L);

        assertTrue(record.isMapped("col1"));
        assertFalse(record.isMapped("col3"));
        assertTrue(record.isSet("col1"));
        assertEquals("Val1", record.get("col1"));
        assertEquals("Val2", record.get("col2"));
        assertTrue(record.isConsistent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByNameOutOfBounds() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", Integer.valueOf(5));

        final String[] values = new String[] { "Val1" };
        final CSVRecord record = new CSVRecord(values, mapping, null, 3L);

        assertFalse(record.isConsistent());
        assertFalse(record.isSet("col1"));
        record.get("col1");
    }
}
