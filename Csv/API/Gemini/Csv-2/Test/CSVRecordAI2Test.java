package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CSVRecordAI2Test {

    @Test
    public void testGetByIndexAndProperties() {
        String[] values = new String[] { "A", "B", "C" };
        CSVRecord record = new CSVRecord(values, null, "comment", 10L);

        assertEquals("A", record.get(0));
        assertEquals("comment", record.getComment());
        assertEquals(10L, record.getRecordNumber());
        assertEquals(3, record.size());
        assertTrue(record.toString().contains("A"));
    }

    @Test
    public void testGetByNameWithMapping() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", 0);
        mapping.put("col2", 1);

        String[] values = new String[] { "Val1", "Val2" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        assertEquals("Val1", record.get("col1"));
        assertNull(record.get("nonexistent"));
        assertTrue(record.isMapped("col1"));
        assertFalse(record.isMapped("nonexistent"));
        assertTrue(record.isSet("col1"));
        assertTrue(record.isConsistent());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByNameWithoutMappingThrowsException() {
        String[] values = new String[] { "Val1" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("col1");
    }
}
