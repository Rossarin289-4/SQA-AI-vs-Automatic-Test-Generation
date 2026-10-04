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

    /**
     * Represents an enum that could be used with get(Enum).
     * This is a mock enum for testing purposes.
     */
    private enum MockEnum {
        FIELD1, FIELD2
    }

    @Test
    public void testConstructorWithNullValues() throws Exception {
        // A CSVRecord constructed with null values should use an empty array for values.
        CSVRecord record = new CSVRecord(null, null, null, 0);
        assertEquals(0, record.size());
        assertEquals("[]", record.toString());
    }

    @Test
    public void testConstructorWithEmptyValues() throws Exception {
        // A CSVRecord constructed with an empty array for values.
        CSVRecord record = new CSVRecord(new String[]{}, null, null, 1);
        assertEquals(0, record.size());
        assertEquals("[]", record.toString());
    }

    @Test
    public void testConstructorWithValuesAndMapping() throws Exception {
        // A CSVRecord constructed with values and a mapping.
        String[] values = {"value1", "value2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        mapping.put("col2", 1);
        CSVRecord record = new CSVRecord(values, mapping, "comment1", 2);
        assertEquals(2, record.size());
        assertEquals("value1", record.get(0));
        assertEquals("value2", record.get(1));
        assertEquals("value1", record.get("col1"));
        assertEquals("value2", record.get("col2"));
        assertEquals("comment1", record.getComment());
        assertEquals(2, record.getRecordNumber());
        assertTrue(record.isConsistent());
    }

    @Test
    public void testGetByIndexOutOfBounds() throws Exception {
        // Accessing an index beyond the record's values should throw an exception.
        String[] values = {"value1"};
        CSVRecord record = new CSVRecord(values, null, null, 3);
        try {
            record.get(1);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void testGetByNameWhenMappingIsNull() throws Exception {
        // Accessing a value by name when no mapping is provided should throw IllegalStateException.
        String[] values = {"value1"};
        CSVRecord record = new CSVRecord(values, null, null, 4);
        try {
            record.get("col1");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected exception
        }
    }

    @Test
    public void testGetByNameWhenNameNotFound() throws Exception {
        // Accessing a value by a name not present in the mapping should throw IllegalArgumentException.
        String[] values = {"value1", "value2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 5);
        try {
            record.get("col2");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testGetByNameWhenIndexOutOfBounds() throws Exception {
        // Accessing a value by name where the mapped index is out of bounds for the values array.
        String[] values = {"value1"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("col1", 0);
        mapping.put("col2", 1); // Index 1 is out of bounds for values array of size 1.
        CSVRecord record = new CSVRecord(values, mapping, null, 6);
        try {
            record.get("col2");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testGetByEnum() throws Exception {
        // Test retrieving a value using an Enum.
        String[] values = {"enum_val1", "enum_val2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("FIELD1", 0);
        mapping.put("FIELD2", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 7);
        assertEquals("enum_val1", record.get(MockEnum.FIELD1));
        assertEquals("enum_val2", record.get(MockEnum.FIELD2));
    }

    @Test
    public void testGetComment() throws Exception {
        // Test retrieving the comment associated with the record.
        String[] values = {"v1"};
        CSVRecord record = new CSVRecord(values, null, "my comment", 8);
        assertEquals("my comment", record.getComment());
    }

    @Test
    public void testGetRecordNumber() throws Exception {
        // Test retrieving the record number.
        String[] values = {"v1"};
        CSVRecord record = new CSVRecord(values, null, null, 9);
        assertEquals(9, record.getRecordNumber());
    }

    @Test
    public void testIsConsistentWhenMappingIsNull() throws Exception {
        // A record with no mapping is always considered consistent.
        String[] values = {"v1", "v2"};
        CSVRecord record = new CSVRecord(values, null, null, 10);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentWhenMappingSizeMatchesValuesLength() throws Exception {
        // A record is consistent if the mapping size equals the values length.
        String[] values = {"v1", "v2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("c1", 0);
        mapping.put("c2", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 11);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentWhenMappingSizeDoesNotMatchValuesLength() throws Exception {
        // A record is inconsistent if the mapping size does not equal the values length.
        String[] values = {"v1", "v2"}; // values.length = 2
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("c1", 0);
        mapping.put("c2", 1);
        mapping.put("c3", 2); // mapping.size() = 3
        CSVRecord record = new CSVRecord(values, mapping, null, 12);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsMappedWhenMappingIsNull() throws Exception {
        // isMapped should return false if mapping is null.
        String[] values = {"v1"};
        CSVRecord record = new CSVRecord(values, null, null, 13);
        assertFalse(record.isMapped("some_name"));
    }

    @Test
    public void testIsMappedWhenNameExists() throws Exception {
        // isMapped should return true if the name is in the mapping.
        String[] values = {"v1", "v2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("header1", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 14);
        assertTrue(record.isMapped("header1"));
    }

    @Test
    public void testIsMappedWhenNameDoesNotExist() throws Exception {
        // isMapped should return false if the name is not in the mapping.
        String[] values = {"v1"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("header1", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 15);
        assertFalse(record.isMapped("header2"));
    }

    @Test
    public void testIsSetWhenMappingIsNull() throws Exception {
        // isSet should return false if mapping is null.
        String[] values = {"v1"};
        CSVRecord record = new CSVRecord(values, null, null, 16);
        assertFalse(record.isSet("some_name"));
    }

    @Test
    public void testIsSetWhenMappedAndIndexIsWithinBounds() throws Exception {
        // isSet should return true if the name is mapped and its index is within values bounds.
        String[] values = {"v1", "v2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("header1", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 17);
        assertTrue(record.isSet("header1"));
    }

    @Test
    public void testIsSetWhenMappedAndIndexIsOutOfBounds() throws Exception {
        // isSet should return false if the name is mapped but its index is out of values bounds.
        String[] values = {"v1"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("header1", 0);
        mapping.put("header2", 1); // Index 1 is out of bounds for values array of size 1.
        CSVRecord record = new CSVRecord(values, mapping, null, 18);
        assertFalse(record.isSet("header2"));
    }

    @Test
    public void testIsSetWhenNameIsNotMapped() throws Exception {
        // isSet should return false if the name is not mapped.
        String[] values = {"v1"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("header1", 0);
        CSVRecord record = new CSVRecord(values, mapping, null, 19);
        assertFalse(record.isSet("header2"));
    }

    @Test
    public void testIterator() throws Exception {
        // Test the iterator over the record's values.
        String[] values = {"iter1", "iter2", "iter3"};
        CSVRecord record = new CSVRecord(values, null, null, 20);
        Iterator<String> iterator = record.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("iter1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("iter2", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("iter3", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSize() throws Exception {
        // Test the size method.
        String[] values = {"s1", "s2", "s3", "s4"};
        CSVRecord record = new CSVRecord(values, null, null, 21);
        assertEquals(4, record.size());
    }

    @Test
    public void testSizeForEmptyRecord() throws Exception {
        // Test the size method for a record with no values.
        CSVRecord record = new CSVRecord(new String[]{}, null, null, 22);
        assertEquals(0, record.size());
    }

    @Test
    public void testToMapWhenMappingIsNull() throws Exception {
        // toMap should throw NullPointerException if mapping is null, due to current implementation.
        String[] values = {"v1", "v2"};
        CSVRecord record = new CSVRecord(values, null, null, 23);
        try {
            record.toMap();
            fail("Expected NullPointerException when mapping is null");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Test
    public void testToMapWhenMappingExists() throws Exception {
        // Test converting the record to a map.
        String[] values = {"map_v1", "map_v2"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("key1", 0);
        mapping.put("key2", 1);
        CSVRecord record = new CSVRecord(values, mapping, null, 24);
        Map<String, String> map = record.toMap();
        assertEquals(2, map.size());
        assertEquals("map_v1", map.get("key1"));
        assertEquals("map_v2", map.get("key2"));
    }

    @Test
    public void testToMapWithInconsistentMapping() throws Exception {
        // Test toMap when the mapping has more entries than values.
        String[] values = {"v1"};
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("key1", 0);
        mapping.put("key2", 1); // This mapping is inconsistent with values length.
        CSVRecord record = new CSVRecord(values, mapping, null, 25);
        Map<String, String> map = record.toMap();
        assertEquals(1, map.size()); // Only key1 should be present.
        assertEquals("v1", map.get("key1"));
        assertNull(map.get("key2"));
    }

    @Test
    public void testToString() throws Exception {
        // Test the toString method.
        String[] values = {"str1", "str2"};
        CSVRecord record = new CSVRecord(values, null, null, 26);
        assertEquals("[str1, str2]", record.toString());
    }

    @Test
    public void testToStringForEmptyRecord() throws Exception {
        // Test the toString method for a record with no values.
        CSVRecord record = new CSVRecord(new String[]{}, null, null, 27);
        assertEquals("[]", record.toString());
    }

    @Test
    public void testValuesMethod() throws Exception {
        // Test the internal values() method.
        String[] values = {"valA", "valB"};
        CSVRecord record = new CSVRecord(values, null, null, 28);
        assertArrayEquals(values, record.values());
    }

    @Test
    public void testGetByNameWithEmptyMapping() throws Exception {
        // Accessing a value by name when the mapping is an empty map.
        String[] values = {"value1"};
        Map<String, Integer> mapping = new HashMap<>();
        CSVRecord record = new CSVRecord(values, mapping, null, 29);
        try {
            record.get("col1");
            fail("Expected IllegalArgumentException for empty mapping");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
