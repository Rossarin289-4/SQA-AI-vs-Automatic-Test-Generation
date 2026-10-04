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

// Enum for testing get(Enum<?>) method
enum CSVRecordTestEnum { COL1, COL2, COL3 }

public class CSVRecordTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    // Helper to create a CSVRecord for testing
    private CSVRecord createRecord(String[] values, Map<String, Integer> mapping, String comment, long recordNumber) {
        return new CSVRecord(values, mapping, comment, recordNumber);
    }

    // Helper to create a CSVRecord with default mapping
    private CSVRecord createRecordWithMapping(String[] values, List<String> headers, String comment, long recordNumber) {
        Map<String, Integer> mapping = new HashMap<>();
        for (int i = 0; i < headers.size(); i++) {
            mapping.put(headers.get(i), i);
        }
        return new CSVRecord(values, mapping, comment, recordNumber);
    }

    @Test
    public void testGetByIndex_ValidIndex() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        assertEquals("b", record.get(1));
    }

    @Test
    public void testGetByIndex_FirstElement() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        assertEquals("a", record.get(0));
    }

    @Test
    public void testGetByIndex_LastElement() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        assertEquals("c", record.get(2));
    }

    @Test
    public void testGetByIndex_EmptyRecord() throws Exception {
        CSVRecord record = createRecord(EMPTY_STRING_ARRAY, null, null, 1L);
        try {
            record.get(0);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetByIndex_IndexOutOfBounds() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b"}, null, null, 1L);
        try {
            record.get(2);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetByName_ValidName() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b", "c"}, Arrays.asList("col1", "col2", "col3"), null, 1L);
        assertEquals("b", record.get("col2"));
    }

    @Test
    public void testGetByName_FirstColumn() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b", "c"}, Arrays.asList("col1", "col2", "col3"), null, 1L);
        assertEquals("a", record.get("col1"));
    }

    @Test
    public void testGetByName_LastColumn() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b", "c"}, Arrays.asList("col1", "col2", "col3"), null, 1L);
        assertEquals("c", record.get("col3"));
    }

    @Test
    public void testGetByName_MappingNotFound() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b", "c"}, Arrays.asList("col1", "col2", "col3"), null, 1L);
        try {
            record.get("col4");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Mapping for col4 not found"));
        }
    }

    @Test
    public void testGetByName_NoMapping() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        try {
            record.get("col1");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("No header mapping was specified"));
        }
    }

    @Test
    public void testGetByName_IndexOutOfBoundsInMapping() throws Exception {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        mapping.put("col2", 5); // Index out of bounds for values array
        CSVRecord record = createRecord(new String[]{"a", "b"}, mapping, null, 1L);
        try {
            record.get("col2");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("CSVRecord only has 2 values!"));
        }
    }

    @Test
    public void testGetByName_Enum() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b", "c"}, Arrays.asList("COL1", "COL2", "COL3"), null, 1L);
        assertEquals("b", record.get(CSVRecordTestEnum.COL2));
    }

    @Test
    public void testGetComment_HasComment() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b"}, null, "# This is a comment", 1L);
        assertEquals("# This is a comment", record.getComment());
    }

    @Test
    public void testGetComment_NoComment() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b"}, null, null, 1L);
        assertNull(record.getComment());
    }

    @Test
    public void testGetRecordNumber_ValidNumber() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b"}, null, null, 42L);
        assertEquals(42L, record.getRecordNumber());
    }

    @Test
    public void testGetRecordNumber_Zero() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b"}, null, null, 0L);
        assertEquals(0L, record.getRecordNumber());
    }

    @Test
    public void testIsConsistent_ConsistentWithMapping() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b", "c"}, Arrays.asList("col1", "col2", "col3"), null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_ConsistentWithoutMapping() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_InconsistentSize() throws Exception {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        mapping.put("col2", 1);
        CSVRecord record = createRecord(new String[]{"a"}, mapping, null, 1L); // Mapping size 2, values size 1
        assertFalse(record.isConsistent());
    }
    
    @Test
    public void testIsConsistent_InconsistentSizeLargerValues() throws Exception {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        CSVRecord record = createRecord(new String[]{"a", "b"}, mapping, null, 1L); // Mapping size 1, values size 2
        assertTrue(record.isConsistent()); // This is considered consistent in current implementation
    }

    @Test
    public void testIsMapped_True() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b"}, Arrays.asList("col1", "col2"), null, 1L);
        assertTrue(record.isMapped("col1"));
    }

    @Test
    public void testIsMapped_False() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b"}, Arrays.asList("col1", "col2"), null, 1L);
        assertFalse(record.isMapped("col3"));
    }

    @Test
    public void testIsMapped_NoMapping() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b"}, null, null, 1L);
        assertFalse(record.isMapped("col1"));
    }

    @Test
    public void testIsSet_MappedAndSet() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b"}, Arrays.asList("col1", "col2"), null, 1L);
        assertTrue(record.isSet("col1"));
    }

    @Test
    public void testIsSet_MappedButNotSet_IndexOutOfBounds() throws Exception {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        mapping.put("col2", 5); // Index out of bounds
        CSVRecord record = createRecord(new String[]{"a"}, mapping, null, 1L);
        assertFalse(record.isSet("col2"));
    }

    @Test
    public void testIsSet_NotMapped() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b"}, Arrays.asList("col1", "col2"), null, 1L);
        assertFalse(record.isSet("col3"));
    }

    @Test
    public void testIsSet_NoMapping() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b"}, null, null, 1L);
        assertFalse(record.isSet("col1"));
    }
    
    @Test
    public void testIsSet_MappedButValueIsEmptyString() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", ""}, Arrays.asList("col1", "col2"), null, 1L);
        assertTrue(record.isSet("col2"));
    }

    @Test
    public void testIterator_HasElements() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        Iterator<String> iterator = record.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIterator_EmptyRecord() throws Exception {
        CSVRecord record = createRecord(EMPTY_STRING_ARRAY, null, null, 1L);
        Iterator<String> iterator = record.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSize_NonEmptyRecord() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        assertEquals(3, record.size());
    }

    @Test
    public void testSize_EmptyRecord() throws Exception {
        CSVRecord record = createRecord(EMPTY_STRING_ARRAY, null, null, 1L);
        assertEquals(0, record.size());
    }

    @Test
    public void testToMap_WithMapping() throws Exception {
        CSVRecord record = createRecordWithMapping(new String[]{"a", "b", "c"}, Arrays.asList("col1", "col2", "col3"), null, 1L);
        Map<String, String> map = record.toMap();
        assertEquals("a", map.get("col1"));
        assertEquals("b", map.get("col2"));
        assertEquals("c", map.get("col3"));
        assertEquals(3, map.size());
    }

    @Test
    public void testToMap_WithoutMapping() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        Map<String, String> map = record.toMap();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testToMap_MappingHasMoreEntriesThanValues() throws Exception {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        mapping.put("col2", 5); // Out of bounds
        CSVRecord record = createRecord(new String[]{"a"}, mapping, null, 1L);
        Map<String, String> map = record.toMap();
        assertEquals("a", map.get("col1"));
        assertNull(map.get("col2")); // Should not be added as it's out of bounds
        assertEquals(1, map.size());
    }

    @Test
    public void testToString_NonEmptyRecord() throws Exception {
        CSVRecord record = createRecord(new String[]{"a", "b", "c"}, null, null, 1L);
        assertEquals("[a, b, c]", record.toString());
    }

    @Test
    public void testToString_EmptyRecord() throws Exception {
        CSVRecord record = createRecord(EMPTY_STRING_ARRAY, null, null, 1L);
        assertEquals("[]", record.toString());
    }
}
