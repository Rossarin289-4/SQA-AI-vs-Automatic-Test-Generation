package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class ZipArchiveEntryTest {

    // Helper method to create a dummy ZipExtraField for testing
    private static ZipExtraField createDummyExtraField() {
        return new ZipExtraField() {
            private ZipShort headerId = new ZipShort(0x1234);
            private byte[] localData = {1, 2, 3};
            private byte[] centralData = {4, 5, 6};

            @Override
            public ZipShort getHeaderId() {
                return headerId;
            }

            @Override
            public ZipShort getLocalFileDataLength() {
                return new ZipShort(localData.length);
            }

            @Override
            public ZipShort getCentralDirectoryLength() {
                return new ZipShort(centralData.length);
            }

            @Override
            public byte[] getLocalFileDataData() {
                return localData;
            }

            @Override
            public byte[] getCentralDirectoryData() {
                return centralData;
            }

            @Override
            public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {
                localData = new byte[length];
                System.arraycopy(buffer, offset, localData, 0, length);
            }

            @Override
            public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {
                centralData = new byte[length];
                System.arraycopy(buffer, offset, centralData, 0, length);
            }
        };
    }

    // Helper method to create a ZipExtraField with specific ID and data
    private static ZipExtraField createExtraFieldWithData(ZipShort id, byte[] data) {
        return new ZipExtraField() {
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(data.length); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(data.length); }
            @Override public byte[] getLocalFileDataData() { return data; }
            @Override public byte[] getCentralDirectoryData() { return data; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
    }

    // Helper method to create a ZipExtraField that can update its data
    private static ZipExtraField createUpdatableExtraField(ZipShort id, byte[] initialData) {
        return new ZipExtraField() {
            private ZipShort headerId = id;
            private byte[] data = initialData;

            @Override public ZipShort getHeaderId() { return headerId; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(data.length); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(data.length); }
            @Override public byte[] getLocalFileDataData() { return data; }
            @Override public byte[] getCentralDirectoryData() { return data; }

            @Override
            public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {
                byte[] newData = new byte[length];
                System.arraycopy(buffer, offset, newData, 0, length);
                this.data = newData;
            }

            @Override
            public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {
                // Not used in tests, but required by interface
            }
        };
    }

    @Test
    public void testConstructorWithName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", entry.getName());
        assertEquals("test.txt", entry.getName()); // Double check
    }

    @Test
    public void testConstructorWithZipEntry() throws ZipException {
        java.util.zip.ZipEntry baseEntry = new java.util.zip.ZipEntry("base.txt");
        byte[] extraData = {1, 2, 3};
        baseEntry.setExtra(extraData);
        baseEntry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        baseEntry.setTime(123456789);

        ZipArchiveEntry entry = new ZipArchiveEntry(baseEntry);
        assertEquals("base.txt", entry.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(123456789, entry.getTime());
        assertArrayEquals(extraData, entry.getLocalFileDataExtra()); // Check extra data
    }

    @Test
    public void testConstructorWithZipArchiveEntry() throws ZipException {
        ZipArchiveEntry originalEntry = new ZipArchiveEntry("original.txt");
        originalEntry.setInternalAttributes(10);
        originalEntry.setExternalAttributes(20);
        originalEntry.addExtraField(createDummyExtraField());

        ZipArchiveEntry entry = new ZipArchiveEntry(originalEntry);
        assertEquals("original.txt", entry.getName());
        assertEquals(10, entry.getInternalAttributes());
        assertEquals(20, entry.getExternalAttributes());
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(new ZipShort(0x1234), entry.getExtraField(new ZipShort(0x1234)).getHeaderId());
    }

    @Test
    public void testConstructorWithFileAndDirectoryName() {
        File dir = new File("my_dir/");
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "my_dir/");
        assertTrue(entry.isDirectory());
        assertEquals("my_dir/", entry.getName());
    }

    @Test
    public void testConstructorWithFileAndFileName() {
        File file = new File("my_file.txt");
        ZipArchiveEntry entry = new ZipArchiveEntry(file, "my_file.txt");
        assertFalse(entry.isDirectory());
        assertEquals("my_file.txt", entry.getName());
        assertEquals(file.lastModified(), entry.getTime()); // Check time set from file
        assertEquals(file.length(), entry.getSize()); // Check size set from file
    }
    
    @Test
    public void testClone() throws ZipException {
        ZipArchiveEntry originalEntry = new ZipArchiveEntry("clone_test.txt");
        originalEntry.setMethod(ZipArchiveEntry.DEFLATED);
        originalEntry.setInternalAttributes(100);
        originalEntry.setExternalAttributes(200L);
        ZipExtraField dummyField = createDummyExtraField();
        originalEntry.addExtraField(dummyField);

        ZipArchiveEntry clonedEntry = (ZipArchiveEntry) originalEntry.clone();

        assertNotSame(originalEntry, clonedEntry);
        assertEquals(originalEntry.getName(), clonedEntry.getName());
        assertEquals(originalEntry.getMethod(), clonedEntry.getMethod());
        assertEquals(originalEntry.getInternalAttributes(), clonedEntry.getInternalAttributes());
        assertEquals(originalEntry.getExternalAttributes(), clonedEntry.getExternalAttributes());

        ZipExtraField[] originalFields = originalEntry.getExtraFields();
        ZipExtraField[] clonedFields = clonedEntry.getExtraFields();
        assertEquals(originalFields.length, clonedFields.length);
        assertNotSame(originalFields[0], clonedFields[0]); // Should be cloned
        assertEquals(originalFields[0].getHeaderId(), clonedFields[0].getHeaderId());
    }

    @Test
    public void testIsSupportedCompressionMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("supported.txt");
        entry.setMethod(ZipArchiveEntry.STORED);
        assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(0); // Some other method
        assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testGetSetMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method_test.txt");
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("negative_method.txt");
        entry.setMethod(-1);
    }

    @Test
    public void testGetSetInternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("internal_attrs.txt");
        entry.setInternalAttributes(123);
        assertEquals(123, entry.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("external_attrs.txt");
        entry.setExternalAttributes(456789L);
        assertEquals(456789L, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unix_mode.txt");
        entry.setUnixMode(0755); // rwxr-xr-x
        // External attributes calculation: (mode << 16) | (readonly if not set? 0) | (isDirectory? 0)
        // (0755 << 16) = 0b1111010101 << 16 = 50331648
        // The readonly bit check is (mode & 0200) == 0, for 0755, 0200 is set, so (0755 & 0200) is not 0, so the bit is 0.
        // The directory flag is 0 because isDirectory() is false.
        assertEquals(50331648, entry.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testGetUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_unix_mode.txt");
        entry.setUnixMode(0644); // rw-r--r--
        assertEquals(0644, entry.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testGetUnixModeWhenNotSet() {
        ZipArchiveEntry entry = new ZipArchiveEntry("no_unix_mode.txt");
        assertEquals(0, entry.getUnixMode()); // Default platform is FAT
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("platform_test.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetGetExtraFields() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra_fields.txt");
        ZipExtraField[] fields = new ZipExtraField[]{createDummyExtraField()};
        entry.setExtraFields(fields);
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(new ZipShort(0x1234), entry.getExtraFields()[0].getHeaderId());
    }

    @Test
    public void testGetExtraFieldsWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("null_extra.txt");
        assertEquals(0, entry.getExtraFields().length); // Should return empty array if null
    }

    @Test
    public void testAddExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("add_extra.txt");
        ZipExtraField field1 = createExtraFieldWithData(new ZipShort(1), new byte[0]);
        ZipExtraField field2 = createExtraFieldWithData(new ZipShort(2), new byte[0]);
        entry.addExtraField(field1);
        assertEquals(1, entry.getExtraFields().length);
        entry.addExtraField(field2);
        assertEquals(2, entry.getExtraFields().length);
    }
    
    @Test
    public void testAddExtraFieldReplacingExisting() {
        ZipArchiveEntry entry = new ZipArchiveEntry("replace_extra.txt");
        ZipExtraField field1 = createDummyExtraField(); // ID 0x1234
        entry.addExtraField(field1);
        assertEquals(1, entry.getExtraFields().length);

        ZipExtraField field2 = createExtraFieldWithData(new ZipShort(0x1234), new byte[]{7, 8, 9});
        entry.addExtraField(field2); // Should replace field1
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(new ZipShort(0x1234), entry.getExtraFields()[0].getHeaderId());
        assertArrayEquals(new byte[]{7, 8, 9}, entry.getExtraFields()[0].getLocalFileDataData());
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("add_first_extra.txt");
        ZipExtraField field1 = createExtraFieldWithData(new ZipShort(1), new byte[0]);
        ZipExtraField field2 = createExtraFieldWithData(new ZipShort(2), new byte[0]);
        entry.addExtraField(field1);
        entry.addAsFirstExtraField(field2); // field2 should be first
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(field2.getHeaderId(), fields[0].getHeaderId());
        assertEquals(field1.getHeaderId(), fields[1].getHeaderId());
    }

    @Test
    public void testRemoveExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("remove_extra.txt");
        ZipExtraField field1 = createDummyExtraField(); // ID 0x1234
        entry.addExtraField(field1);
        assertEquals(1, entry.getExtraFields().length);
        entry.removeExtraField(new ZipShort(0x1234));
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveNonExistingExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("remove_non_existing.txt");
        entry.removeExtraField(new ZipShort(0x5678));
    }

    @Test
    public void testGetExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_extra.txt");
        ZipExtraField field = createDummyExtraField(); // ID 0x1234
        entry.addExtraField(field);
        ZipExtraField foundField = entry.getExtraField(new ZipShort(0x1234));
        assertNotNull(foundField);
        assertEquals(new ZipShort(0x1234), foundField.getHeaderId());
    }

    @Test
    public void testGetExtraFieldWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_null_extra.txt");
        assertNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testSetExtraWithValidData() throws RuntimeException {
        ZipArchiveEntry entry = new ZipArchiveEntry("set_extra_valid.txt");
        // Header ID: 0x0102, Length: 3, Data: {1, 2, 3}
        byte[] extraData = {0x01, 0x02, 0x03, 0x00, 0x01, 0x02, 0x03};
        entry.setExtra(extraData);
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(1, fields.length);
        assertEquals(new ZipShort(0x0102), fields[0].getHeaderId());
        assertArrayEquals(new byte[]{1, 2, 3}, fields[0].getLocalFileDataData());
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtraWithInvalidData() throws RuntimeException {
        ZipArchiveEntry entry = new ZipArchiveEntry("set_extra_invalid.txt");
        // Header ID: 0x0102, Length: 5, Data: {1, 2, 3} (only 3 bytes provided)
        byte[] invalidData = {0x01, 0x02, 0x05, 0x00, 0x01, 0x02, 0x03};
        entry.setExtra(invalidData);
    }

    @Test
    public void testSetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("set_central_extra.txt");
        // Central directory data structure: Header ID (2 bytes), Data Length (2 bytes), Data.
        // Header ID: 0x0304, Length: 2, Data: {5, 6}
        byte[] centralData = {0x03, 0x04, 0x02, 0x00, 0x05, 0x06};
        entry.setCentralDirectoryExtra(centralData);
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(1, fields.length);
        assertEquals(new ZipShort(0x0304), fields[0].getHeaderId());
        assertArrayEquals(new byte[]{5, 6}, fields[0].getCentralDirectoryData());
    }

    @Test
    public void testGetLocalFileDataExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_local_extra.txt");
        assertArrayEquals(new byte[0], entry.getLocalFileDataExtra()); // Initially empty

        ZipExtraField field = createExtraFieldWithData(new ZipShort(1), new byte[]{10, 20});
        entry.addExtraField(field);
        entry.setExtra(); // Update super.setExtra() to reflect added fields
        assertArrayEquals(new byte[]{10, 20}, entry.getLocalFileDataExtra());
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_central_extra.txt");
        assertArrayEquals(new byte[0], entry.getCentralDirectoryExtra()); // Initially empty

        ZipExtraField field = createExtraFieldWithData(new ZipShort(2), new byte[]{30, 40});
        entry.addExtraField(field);
        // getCentralDirectoryExtra relies on ExtraFieldUtils.mergeCentralDirectoryData
        byte[] centralData = entry.getCentralDirectoryExtra();
        // We can't assert exact content without knowing ExtraFieldUtils's output format for central dir data,
        // but we can assert that data is generated when fields exist.
        assertTrue(centralData.length > 0); 
    }

    @Test
    public void testGetName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("custom_name.txt");
        entry.setName("overridden_name.txt");
        assertEquals("overridden_name.txt", entry.getName());
        
        ZipArchiveEntry entry2 = new ZipArchiveEntry("original_name.txt");
        assertEquals("original_name.txt", entry2.getName()); // Test super.getName() fallback
    }

    @Test
    public void testIsDirectory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("directory/");
        assertTrue(entry.isDirectory());
        ZipArchiveEntry entry2 = new ZipArchiveEntry("file.txt");
        assertFalse(entry2.isDirectory());
    }

    @Test
    public void testHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("hash_test.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("hash_test.txt");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("different.txt");

        assertEquals(entry1.hashCode(), entry2.hashCode());
        assertNotEquals(entry1.hashCode(), entry3.hashCode());
    }

    @Test
    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("date_test.txt");
        long time = 1234567890123L; // Use a specific long value
        entry.setTime(time);
        Date expectedDate = new Date(time);
        assertEquals(expectedDate, entry.getLastModifiedDate());
    }

    @Test
    public void testEqualsSameInstance() {
        ZipArchiveEntry entry = new ZipArchiveEntry("equal_same.txt");
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsDifferentInstanceSameName() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equal_diff_name.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equal_diff_name.txt");
        assertTrue(entry1.equals(entry2));
        assertTrue(entry2.equals(entry1));
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equal_diff1.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equal_diff2.txt");
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsDifferentClass() {
        ZipArchiveEntry entry = new ZipArchiveEntry("equal_class.txt");
        java.util.zip.ZipEntry baseEntry = new java.util.zip.ZipEntry("equal_class.txt");
        assertFalse(entry.equals(baseEntry));
    }

    @Test
    public void testEqualsNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("equal_null.txt");
        assertFalse(entry.equals(null));
    }
    
    // These tests use private members, which is not allowed.
    // They are removed.
    // @Test
    // public void testMergeExtraFieldsWhenExistingIsNull() throws ZipException {
    //     ZipArchiveEntry entry = new ZipArchiveEntry("merge_null_existing.txt");
    //     ZipExtraField[] fieldsToMerge = new ZipExtraField[]{createDummyExtraField()};
    //     entry.extraFields = null; 
    //     entry.mergeExtraFields(fieldsToMerge, true);
        
    //     assertEquals(1, entry.getExtraFields().length);
    //     assertEquals(new ZipShort(0x1234), entry.getExtraFields()[0].getHeaderId());
    // }

    // @Test
    // public void testMergeExtraFieldsWhenExistingIsNotNullAndNewFieldIsAbsent() throws ZipException {
    //     ZipArchiveEntry entry = new ZipArchiveEntry("merge_existing_new_absent.txt");
    //     ZipExtraField existingField = createExtraFieldWithData(new ZipShort(0x5678), new byte[]{1, 2});
    //     entry.addExtraField(existingField);

    //     ZipExtraField[] fieldsToMerge = new ZipExtraField[]{createDummyExtraField()}; // Different ID
    //     entry.mergeExtraFields(fieldsToMerge, true);

    //     assertEquals(2, entry.getExtraFields().length);
    //     assertTrue(entry.getExtraField(new ZipShort(0x5678)) != null);
    //     assertTrue(entry.getExtraField(new ZipShort(0x1234)) != null);
    // }

    // @Test
    // public void testMergeExtraFieldsWhenExistingIsNotNullAndNewFieldIsPresent() throws ZipException {
    //     ZipArchiveEntry entry = new ZipArchiveEntry("merge_existing_new_present.txt");
    //     ZipExtraField existingField = createUpdatableExtraField(new ZipShort(0x1234), new byte[]{1, 2});
    //     entry.addExtraField(existingField);

    //     ZipExtraField[] fieldsToMerge = new ZipExtraField[]{createExtraFieldWithData(new ZipShort(0x1234), new byte[]{3, 4, 5})};
    //     entry.mergeExtraFields(fieldsToMerge, true); // true means parseFromLocalFileData

    //     assertEquals(1, entry.getExtraFields().length);
    //     assertArrayEquals(new byte[]{3, 4, 5}, entry.getExtraField(new ZipShort(0x1234)).getLocalFileDataData());
    // }
}
