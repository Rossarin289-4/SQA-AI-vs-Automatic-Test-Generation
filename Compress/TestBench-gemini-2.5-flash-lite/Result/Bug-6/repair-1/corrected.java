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

    @Test
    public void testConstructorWithName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", entry.getName());
        // The superclass method getName() is called internally when no explicit name is set on ZipArchiveEntry.
        // Here, we test the name set by the constructor.
        assertEquals("test.txt", entry.getName());
    }

    @Test
    public void testConstructorWithZipEntry() throws ZipException {
        java.util.zip.ZipEntry baseEntry = new java.util.zip.ZipEntry("base.txt");
        baseEntry.setExtra(new byte[]{1, 2, 3});
        baseEntry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        baseEntry.setTime(123456789);

        ZipArchiveEntry entry = new ZipArchiveEntry(baseEntry);
        assertEquals("base.txt", entry.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(123456789, entry.getTime());
        assertEquals(3, entry.getLocalFileDataExtra().length); // Content of extra data
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
        // The File constructor is not directly tested for its size/time properties due to mocking complexity.
        // We focus on name and directory status, which are directly set or derived from the name.
        File file = new File("my_file.txt");
        ZipArchiveEntry entry = new ZipArchiveEntry(file, "my_file.txt");
        assertFalse(entry.isDirectory());
        assertEquals("my_file.txt", entry.getName());
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
        // External attributes: (mode << 16) | (readonly if not set? 0) | (isDirectory? 0)
        // (0755 << 16) | 0 | 0 = 49152
        // The mask used for the readonly bit is (mode & 0200), so if the owner has write permission, the bit is 0.
        // If the owner does not have write permission (mode & 0200 == 0), the readonly bit is set to 1.
        // For 0755, the owner *does* have write permission (0200 is set), so the readonly bit is 0.
        // The directory flag is 0 because isDirectory() is false.
        assertEquals(0b1111010101 << 16, entry.getExternalAttributes());
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
        // Default platform is FAT, so getUnixMode should return 0
        assertEquals(0, entry.getUnixMode());
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
        assertEquals(1, entry.getExtraFields().length); // Ensure it's correctly set
    }

    @Test
    public void testGetExtraFieldsWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("null_extra.txt");
        // Initially extraFields is null
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testAddExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("add_extra.txt");
        ZipExtraField field1 = new ZipExtraField() {
            private ZipShort id = new ZipShort(1);
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(0); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return new byte[0]; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
        ZipExtraField field2 = new ZipExtraField() {
            private ZipShort id = new ZipShort(2);
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(0); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return new byte[0]; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
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

        ZipExtraField field2 = new ZipExtraField() { // Same ID 0x1234 but different data
            private ZipShort id = new ZipShort(0x1234);
            private byte[] data = {7, 8, 9};
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(data.length); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(data.length); }
            @Override public byte[] getLocalFileDataData() { return data; }
            @Override public byte[] getCentralDirectoryData() { return data; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
        entry.addExtraField(field2); // Should replace field1
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(new ZipShort(0x1234), entry.getExtraFields()[0].getHeaderId());
        assertArrayEquals(new byte[]{7, 8, 9}, entry.getExtraFields()[0].getLocalFileDataData());
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("add_first_extra.txt");
        ZipExtraField field1 = new ZipExtraField() {
            private ZipShort id = new ZipShort(1);
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(0); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return new byte[0]; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
        ZipExtraField field2 = new ZipExtraField() {
            private ZipShort id = new ZipShort(2);
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(0); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return new byte[0]; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
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
        // This test relies on the behavior of ExtraFieldUtils.parse.
        // We provide data that, if parsed correctly, would result in a known extra field.
        // The structure of the extra data is: Header ID (2 bytes), Data Length (2 bytes), Data.
        // We are using a simplified example here.
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
        // Providing data that might cause ExtraFieldUtils.parse to throw a ZipException.
        // A common cause is insufficient data for the declared length.
        // Header ID: 0x0102, Length: 5, Data: {1, 2, 3} (only 3 bytes provided)
        byte[] invalidData = {0x01, 0x02, 0x05, 0x00, 0x01, 0x02, 0x03};
        entry.setExtra(invalidData);
    }

    @Test
    public void testSetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("set_central_extra.txt");
        // Similar to setExtra, this relies on ExtraFieldUtils.parse.
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

        ZipExtraField field = new ZipExtraField() {
            private ZipShort id = new ZipShort(1);
            private byte[] data = {10, 20};
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(data.length); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return data; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
        entry.addExtraField(field);
        entry.setExtra(); // Update super.setExtra()
        assertArrayEquals(new byte[]{10, 20}, entry.getLocalFileDataExtra());
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_central_extra.txt");
        // Initially, there are no extra fields, so this should be empty.
        assertArrayEquals(new byte[0], entry.getCentralDirectoryExtra());

        ZipExtraField field = new ZipExtraField() {
            private ZipShort id = new ZipShort(2);
            private byte[] data = {30, 40};
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(0); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(data.length); }
            @Override public byte[] getLocalFileDataData() { return new byte[0]; }
            @Override public byte[] getCentralDirectoryData() { return data; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
        entry.addExtraField(field);
        // The getCentralDirectoryExtra() method relies on ExtraFieldUtils.mergeCentralDirectoryData.
        // We cannot fully assert the output without knowing its implementation details or mocking it.
        // However, we can assert that it produces output when fields are present.
        // The exact structure depends on mergeCentralDirectoryData.
        byte[] centralData = entry.getCentralDirectoryExtra();
        assertTrue(centralData.length > 0); // Should contain data if a field was added
    }

    @Test
    public void testGetName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("custom_name.txt");
        entry.setName("overridden_name.txt");
        assertEquals("overridden_name.txt", entry.getName());
        // Test that super.getName() is still accessible if custom name is not set
        ZipArchiveEntry entry2 = new ZipArchiveEntry("original_name.txt");
        assertEquals("original_name.txt", entry2.getName());
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
        long time = System.currentTimeMillis(); // Using current time for a test value
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
    
    @Test
    public void testMergeExtraFieldsWhenExistingIsNull() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("merge_null_existing.txt");
        ZipExtraField[] fieldsToMerge = new ZipExtraField[]{createDummyExtraField()};
        // Manually set extraFields to null to test this branch.
        entry.extraFields = null; 
        entry.mergeExtraFields(fieldsToMerge, true);
        
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(new ZipShort(0x1234), entry.getExtraFields()[0].getHeaderId());
    }

    @Test
    public void testMergeExtraFieldsWhenExistingIsNotNullAndNewFieldIsAbsent() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("merge_existing_new_absent.txt");
        ZipExtraField existingField = new ZipExtraField() {
            private ZipShort id = new ZipShort(0x5678);
            private byte[] data = {1, 2};
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(data.length); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return data; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
        entry.addExtraField(existingField);

        ZipExtraField[] fieldsToMerge = new ZipExtraField[]{createDummyExtraField()}; // Different ID
        entry.mergeExtraFields(fieldsToMerge, true);

        assertEquals(2, entry.getExtraFields().length);
        assertTrue(entry.getExtraField(new ZipShort(0x5678)) != null);
        assertTrue(entry.getExtraField(new ZipExtraField() { @Override public ZipShort getHeaderId() { return new ZipShort(0x1234); } /* dummy */ }) != null);
    }

    @Test
    public void testMergeExtraFieldsWhenExistingIsNotNullAndNewFieldIsPresent() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("merge_existing_new_present.txt");
        ZipExtraField existingField = new ZipExtraField() {
            private ZipShort id = new ZipShort(0x1234);
            private byte[] data = {1, 2};
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(data.length); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return data; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {
                 // Mock parsing to update the existing data
                 byte[] newData = new byte[length];
                 System.arraycopy(buffer, offset, newData, 0, length);
                 this.data = newData;
            }
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        };
        entry.addExtraField(existingField);

        ZipExtraField[] fieldsToMerge = new ZipExtraField[]{new ZipExtraField() {
            private ZipShort id = new ZipShort(0x1234);
            private byte[] newData = {3, 4, 5};
            @Override public ZipShort getHeaderId() { return id; }
            @Override public ZipShort getLocalFileDataLength() { return new ZipShort(newData.length); }
            @Override public ZipShort getCentralDirectoryLength() { return new ZipShort(0); }
            @Override public byte[] getLocalFileDataData() { return newData; }
            @Override public byte[] getCentralDirectoryData() { return new byte[0]; }
            @Override public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {}
            @Override public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {}
        }};
        entry.mergeExtraFields(fieldsToMerge, true); // true means parseFromLocalFileData

        assertEquals(1, entry.getExtraFields().length);
        assertArrayEquals(new byte[]{3, 4, 5}, entry.getExtraField(new ZipShort(0x1234)).getLocalFileDataData());
    }
}
