package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;

public class CSVRecordTest {

    @Test
    public void testGetByIndexValid() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("a", record.get(0));
        assertEquals("b", record.get(1));
        assertEquals("c", record.get(2));
    }

    @Test
    public void testGetByIndexEmpty() throws Exception {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        // Accessing an empty array by index should throw ArrayIndexOutOfBoundsException
        try {
            record.get(0);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetByIndexNullValues() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
        // Accessing an empty array by index should throw ArrayIndexOutOfBoundsException
        try {
            record.get(0);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }


    @Test
    public void testGetByNameValid() throws Exception {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1, "col3", 2);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("a", record.get("col1"));
        assertEquals("b", record.get("col2"));
        assertEquals("c", record.get("col3"));
    }

    @Test
    public void testGetByNameNotFound() throws Exception {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1, "col3", 2);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertNull(record.get("nonexistent"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByNameNoMapping() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("col1");
    }

    @Test
    public void testGetByNameArrayIndexOutOfBounds() throws Exception {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1, "col3", 2); // col3 index is out of bounds
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        try {
            record.get("col3");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Index for header 'col3' is 2 but CSVRecord only has 2 values!"));
        }
    }

    @Test
    public void testIsConsistentTrue() throws Exception {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1, "col3", 2);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentFalse() throws Exception {
        String[] values = {"a", "b"}; // Fewer values than mapping
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1, "col3", 2);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }
    
    @Test
    public void testIsConsistentFalseMoreValues() throws Exception {
        String[] values = {"a", "b", "c", "d"}; // More values than mapping
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1, "col3", 2);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsConsistentTrueNoMapping() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentTrueEmptyValuesNoMapping() throws Exception {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertTrue(record.isConsistent());
    }
    
    @Test
    public void testIsConsistentTrueNullValuesNoMapping() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertTrue(record.isConsistent());
    }


    @Test
    public void testIsMappedTrue() throws Exception {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isMapped("col1"));
        assertTrue(record.isMapped("col2"));
    }

    @Test
    public void testIsMappedFalse() throws Exception {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isMapped("col3"));
    }

    @Test
    public void testIsMappedNoMapping() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isMapped("col1"));
    }

    @Test
    public void testIsSetTrue() throws Exception {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isSet("col1"));
        assertTrue(record.isSet("col2"));
    }

    @Test
    public void testIsSetFalseMappedButIndexOutOfBounds() throws Exception {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1, "col3", 2); // col3 index is out of bounds
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("col3"));
    }

    @Test
    public void testIsSetFalseNotMapped() throws Exception {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = Map.of("col1", 0, "col2", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("col3"));
    }
    
    @Test
    public void testIsSetFalseNoMapping() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isSet("col1"));
    }


    @Test
    public void testIteratorEmpty() throws Exception {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.iterator().hasNext());
    }

    @Test
    public void testIteratorWithValues() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
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
    public void testIteratorWithNullValues() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertFalse(record.iterator().hasNext());
    }

    @Test
    public void testGetCommentPresent() throws Exception {
        String comment = "# This is a comment";
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, comment, 1L);
        assertEquals(comment, record.getComment());
    }

    @Test
    public void testGetCommentNull() throws Exception {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertNull(record.getComment());
    }

    @Test
    public void testGetRecordNumber() throws Exception {
        CSVRecord record1 = new CSVRecord(new String[]{"a"}, null, null, 1L);
        CSVRecord record2 = new CSVRecord(new String[]{"b"}, null, null, 5L);
        assertEquals(1L, record1.getRecordNumber());
        assertEquals(5L, record2.getRecordNumber());
    }

    @Test
    public void testSizeZero() throws Exception {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(0, record.size());
    }

    @Test
    public void testSizeWithValues() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(3, record.size());
    }
    
    @Test
    public void testSizeWithNullValues() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
    }

    @Test
    public void testToStringEmpty() throws Exception {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[]", record.toString());
    }

    @Test
    public void testToStringWithValues() throws Exception {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[a, b, c]", record.toString());
    }

    @Test
    public void testToStringWithNullValues() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals("[]", record.toString());
    }

    @Test
    public void testToStringWithNullElements() throws Exception {
        String[] values = {"a", null, "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[a, null, c]", record.toString());
    }
    
    @Test
    public void testValuesMethod() throws Exception {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertArrayEquals(values, record.values());
    }
    
    @Test
    public void testValuesMethodNull() throws Exception {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertArrayEquals(new String[0], record.values());
    }

}
