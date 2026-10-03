package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CSVRecordAI9Test {

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
        assertTrue(record.isConsistent());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByNameWithoutMapping() {
        final String[] values = new String[] { "A" };
        final CSVRecord record = new CSVRecord(values, null, null, 2L);
        record.get("Col1");
    }

    @Test
    public void testMappingAndIsSet() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", Integer.valueOf(0));
        mapping.put("Col2", Integer.valueOf(1));

        final String[] values = new String[] { "Val1" };
        final CSVRecord record = new CSVRecord(values, mapping, null, 3L);

        assertTrue(record.isMapped("Col1"));
        assertTrue(record.isMapped("Col2"));
        assertFalse(record.isMapped("Col3"));

        assertTrue(record.isSet("Col1"));
        assertFalse(record.isSet("Col2"));
        assertFalse(record.isConsistent());
    }
}
