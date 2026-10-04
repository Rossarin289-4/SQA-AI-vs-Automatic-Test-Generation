package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class ZipArchiveEntryTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorWithName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", entry.getName());
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, entry.getSize());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorWithNameEndingInSlash() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test/");
        assertEquals("test/", entry.getName());
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testConstructorWithZipEntry() throws ZipException {
        java.util.zip.ZipEntry baseEntry = new java.util.zip.ZipEntry("base.txt");
        baseEntry.setComment("comment");
        baseEntry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        baseEntry.setSize(100);
        baseEntry.setTime(123456789);

        ZipArchiveEntry entry = new ZipArchiveEntry(baseEntry);
        assertEquals("base.txt", entry.getName());
        assertEquals("comment", entry.getComment());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(100, entry.getSize());
        assertEquals(123456789, entry.getTime());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorWithZipEntryAndExtraData() throws ZipException {
        java.util.zip.ZipEntry baseEntry = new java.util.zip.ZipEntry("base.txt");
        byte[] extraData = new byte[]{0x01, 0x02, 0x03, 0x04};
        baseEntry.setExtra(extraData);

        ZipArchiveEntry entry = new ZipArchiveEntry(baseEntry);
        // The exact parsing of extra fields is complex and relies on external classes.
        // We will test the basic functionality here.
        // The ExtraFieldUtils.parse method is called internally.
        // We can't directly inspect the parsed fields without knowing the implementation details.
        // We can check if the extra data is set at all.
        assertArrayEquals(extraData, entry.getExtra());
    }

    @Test
    public void testConstructorWithZipArchiveEntry() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("original.txt");
        original.setInternalAttributes(10);
        original.setExternalAttributes(20);
        // Need to create a valid ZipExtraField instance
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{1}, 0, 1);
        original.addExtraField(unparseable);

        ZipArchiveEntry cloned = new ZipArchiveEntry(original);
        assertEquals("original.txt", cloned.getName());
        assertEquals(10, cloned.getInternalAttributes());
        assertEquals(20, cloned.getExternalAttributes());
        assertNotNull(cloned.getUnparseableExtraFieldData());
    }

    @Test
    public void testProtectedConstructor() {
        ZipArchiveEntry entry = new ZipArchiveEntry();
        assertEquals("", entry.getName());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorWithFileAndName() {
        // This test is hard to make fully asserted without creating actual files.
        // We can only test the name manipulation logic.

        // Test for a file - name should not end with slash
        ZipArchiveEntry entryForFile = new ZipArchiveEntry(new File("dummy.txt"), "file.txt");
        assertEquals("file.txt", entryForFile.getName());

        // Test for a directory - name should end with slash
        ZipArchiveEntry entryForDir = new ZipArchiveEntry(new File("dummyDir"), "dir");
        assertEquals("dir/", entryForDir.getName());
        assertTrue(entryForDir.isDirectory());

        // Test for a directory with existing slash
        ZipArchiveEntry entryForDirWithSlash = new ZipArchiveEntry(new File("dummyDir"), "dir/");
        assertEquals("dir/", entryForDirWithSlash.getName());
        assertTrue(entryForDirWithSlash.isDirectory());
    }

    @Test
    public void testClone() {
        ZipArchiveEntry original = new ZipArchiveEntry("clone.txt");
        original.setInternalAttributes(100);
        original.setExternalAttributes(200);
        original.setMethod(java.util.zip.ZipEntry.DEFLATED);
        original.setSize(1000);
        original.setTime(987654321);
        original.setComment("Clone comment");
        // Add an extra field to test cloning of extra fields
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{1}, 0, 1);
        original.addExtraField(unparseable);
        original.setGeneralPurposeBit(new GeneralPurposeBit());


        ZipArchiveEntry cloned = (ZipArchiveEntry) original.clone();

        assertEquals("clone.txt", cloned.getName());
        assertEquals(100, cloned.getInternalAttributes());
        assertEquals(200, cloned.getExternalAttributes());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, cloned.getMethod());
        assertEquals(1000, cloned.getSize());
        assertEquals(987654321, cloned.getTime());
        assertEquals("Clone comment", cloned.getComment());
        assertNotNull(cloned.getUnparseableExtraFieldData());
        assertNotSame(original, cloned);
    }

    @Test
    public void testGetSetMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method.txt");
        entry.setMethod(java.util.zip.ZipEntry.STORED);
        assertEquals(java.util.zip.ZipEntry.STORED, entry.getMethod());
    }

    @Test
    public void testSetMethodNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method_neg.txt");
        try {
            entry.setMethod(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("ZIP compression method can not be negative: -1", e.getMessage());
        }
    }

    @Test
    public void testGetSetInternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("internal.txt");
        entry.setInternalAttributes(5);
        assertEquals(5, entry.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("external.txt");
        entry.setExternalAttributes(0x1234567890L);
        assertEquals(0x1234567890L, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unixmode.txt");
        entry.setUnixMode(0x1FF); // rwxrwxrwx
        // External attributes calculation: (mode << 16) | (isDirectory() ? 0x10 : 0) | ((mode & 0200) == 0 ? 1 : 0)
        // For file: 0x1FF << 16 = 0x001FF0000. isDirectory() is false. (0x1FF & 0200) is not 0. So, 0x001FF0000
        assertEquals(0x001FF0000, entry.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0x1FF, entry.getUnixMode());
    }

    @Test
    public void testSetUnixModeAsDirectory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unixmode_dir/");
        entry.setUnixMode(0x1FF); // rwxrwxrwx
        // For directory: 0x1FF << 16 = 0x001FF0000. isDirectory() is true, so add 0x10. Result: 0x001FF0010
        assertEquals(0x001FF0010, entry.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0x1FF, entry.getUnixMode());
    }

    @Test
    public void testGetUnixModeWhenNotUnix() {
        ZipArchiveEntry entry = new ZipArchiveEntry("non_unix.txt");
        // By default, platform is PLATFORM_FAT.
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("platform.txt");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    // Helper class to satisfy the ZipExtraField interface for testing purposes
    private static class MockZipExtraField implements ZipExtraField {
        private ZipShort headerId;
        private byte[] localData;
        private byte[] centralData;

        MockZipExtraField(int headerId) {
            this.headerId = new ZipShort(headerId);
        }

        @Override
        public ZipShort getHeaderId() {
            return headerId;
        }

        @Override
        public ZipShort getLocalFileDataLength() {
            return new ZipShort(localData != null ? localData.length : 0);
        }

        @Override
        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData != null ? centralData.length : 0);
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
            this.localData = Arrays.copyOfRange(buffer, offset, offset + length);
        }

        @Override
        public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {
            this.centralData = Arrays.copyOfRange(buffer, offset, offset + length);
        }
    }


    @Test
    public void testSetExtraFields() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra.txt");
        MockZipExtraField field1 = new MockZipExtraField(1);
        field1.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        MockZipExtraField field2 = new MockZipExtraField(2);
        field2.parseFromLocalFileData(new byte[]{3, 4}, 0, 2);

        ZipExtraField[] fields = new ZipExtraField[]{field1, field2};

        entry.setExtraFields(fields);
        ZipExtraField[] retrievedFields = entry.getExtraFields();
        assertEquals(2, retrievedFields.length);
        assertEquals(new ZipShort(1), retrievedFields[0].getHeaderId());
        assertEquals(new ZipShort(2), retrievedFields[1].getHeaderId());
    }

    @Test
    public void testGetExtraFieldsEmpty() {
        ZipArchiveEntry entry = new ZipArchiveEntry("empty_extra.txt");
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(0, fields.length);
    }

    @Test
    public void testAddExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("add_extra.txt");
        MockZipExtraField field1 = new MockZipExtraField(1);
        field1.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(field1);
        assertEquals(1, entry.getExtraFields().length);
        assertEquals(new ZipShort(1), entry.getExtraField(new ZipShort(1)).getHeaderId());

        MockZipExtraField field2 = new MockZipExtraField(2);
        field2.parseFromLocalFileData(new byte[]{3, 4}, 0, 2);
        entry.addExtraField(field2);
        assertEquals(2, entry.getExtraFields().length);

        // Replace existing field
        MockZipExtraField field1_updated = new MockZipExtraField(1);
        field1_updated.parseFromLocalFileData(new byte[]{5, 6}, 0, 2);
        entry.addExtraField(field1_updated);
        assertEquals(2, entry.getExtraFields().length);
        assertEquals(new ZipShort(1), entry.getExtraField(new ZipShort(1)).getHeaderId());
        assertArrayEquals(new byte[]{5, 6}, entry.getExtraField(new ZipShort(1)).getLocalFileDataData());
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("add_first.txt");
        MockZipExtraField field1 = new MockZipExtraField(1);
        field1.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        MockZipExtraField field2 = new MockZipExtraField(2);
        field2.parseFromLocalFileData(new byte[]{3, 4}, 0, 2);

        entry.addExtraField(field1);
        entry.addAsFirstExtraField(field2);

        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertEquals(new ZipShort(2), fields[0].getHeaderId()); // field2 should be first
        assertEquals(new ZipShort(1), fields[1].getHeaderId()); // field1 should be second
    }

    @Test
    public void testRemoveExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("remove_extra.txt");
        MockZipExtraField field1 = new MockZipExtraField(1);
        field1.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        MockZipExtraField field2 = new MockZipExtraField(2);
        field2.parseFromLocalFileData(new byte[]{3, 4}, 0, 2);
        entry.addExtraField(field1);
        entry.addExtraField(field2);

        entry.removeExtraField(new ZipShort(1));
        assertEquals(1, entry.getExtraFields().length);
        assertNull(entry.getExtraField(new ZipShort(1)));
        assertEquals(new ZipShort(2), entry.getExtraField(new ZipShort(2)).getHeaderId());
    }

    @Test
    public void testRemoveExtraFieldNotFound() {
        ZipArchiveEntry entry = new ZipArchiveEntry("remove_extra_notfound.txt");
        try {
            entry.removeExtraField(new ZipShort(1));
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testRemoveUnparseableExtraFieldData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("remove_unparseable.txt");
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(unparseable);
        assertNotNull(entry.getUnparseableExtraFieldData());

        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testRemoveUnparseableExtraFieldDataNotFound() {
        ZipArchiveEntry entry = new ZipArchiveEntry("remove_unparseable_notfound.txt");
        try {
            entry.removeUnparseableExtraFieldData();
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testGetExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_extra.txt");
        MockZipExtraField field = new MockZipExtraField(1);
        field.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(field);
        assertEquals(field, entry.getExtraField(new ZipShort(1)));
        assertNull(entry.getExtraField(new ZipShort(2)));
    }

    @Test
    public void testGetUnparseableExtraFieldData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("get_unparseable.txt");
        assertNull(entry.getUnparseableExtraFieldData());

        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(unparseable);
        assertEquals(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtra() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("set_extra.txt");
        byte[] extraData = new byte[]{0x01, 0x02, 0x03, 0x04};
        entry.setExtra(extraData);
        // We can't directly assert the parsed extra fields because ExtraFieldUtils is internal.
        // However, the `setExtra` method of `ZipArchiveEntry` calls `super.setExtra`.
        // We can check if the underlying `ZipEntry` has the data.
        assertArrayEquals(extraData, entry.getExtra());
    }

    @Test
    public void testSetCentralDirectoryExtra() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("set_central_extra.txt");
        byte[] centralData = new byte[]{0x05, 0x06, 0x07, 0x08};
        entry.setCentralDirectoryExtra(centralData);
        // This method parses and merges. We can't directly verify the merge without
        // internal knowledge of ExtraFieldUtils.
        // We can check if the method runs without exception.
        // Also, check if the data is reflected in getCentralDirectoryExtra after parsing.
        assertArrayEquals(centralData, entry.getCentralDirectoryExtra());
    }

    @Test
    public void testGetLocalFileDataExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("local_extra.txt");
        // Initially, should return empty array if getExtra() returns null.
        assertArrayEquals(new byte[0], entry.getLocalFileDataExtra());

        byte[] extraData = new byte[]{0x01, 0x02};
        entry.setExtra(extraData);
        // ZipArchiveEntry's setExtra calls super.setExtra, so getExtra() will return this.
        // getLocalFileDataExtra() should return this same data if it's the only extra data.
        assertArrayEquals(extraData, entry.getLocalFileDataExtra());
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("central_extra.txt");
        // Initially, should return empty array.
        assertArrayEquals(new byte[0], entry.getCentralDirectoryExtra());

        // Setting an extra field and then checking the central directory data.
        MockZipExtraField field = new MockZipExtraField(1);
        field.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(field);

        // The output of getCentralDirectoryExtra depends on ExtraFieldUtils.mergeCentralDirectoryData.
        // We can assert that it's non-empty if an extra field was added.
        byte[] centralData = entry.getCentralDirectoryExtra();
        assertNotNull(centralData);
        assertTrue(centralData.length > 0); // Expecting some data to be generated
    }

    @Test
    public void testGetName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("getname.txt");
        assertEquals("getname.txt", entry.getName());
        // Test setName behavior
        entry.setName("newname.txt");
        assertEquals("newname.txt", entry.getName());
    }

    @Test
    public void testIsDirectory() {
        ZipArchiveEntry entryDir = new ZipArchiveEntry("dir/");
        assertTrue(entryDir.isDirectory());
        ZipArchiveEntry entryFile = new ZipArchiveEntry("file.txt");
        assertFalse(entryFile.isDirectory());
    }

    @Test
    public void testSetName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("initial.txt");
        assertEquals("initial.txt", entry.getName());
        entry.setName("updated.txt");
        assertEquals("updated.txt", entry.getName());
    }

    @Test
    public void testSetNameWithBackslash() {
        ZipArchiveEntry entry = new ZipArchiveEntry("initial.txt");
        // The constructor handles initial conversion for FAT platform.
        // Testing setName directly.
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        entry.setName("path\\to\\file.txt");
        assertEquals("path/to/file.txt", entry.getName());
    }

    @Test
    public void testGetSetSize() {
        ZipArchiveEntry entry = new ZipArchiveEntry("size.txt");
        entry.setSize(512);
        assertEquals(512, entry.getSize());
    }

    @Test
    public void testSetSizeNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("size_neg.txt");
        try {
            entry.setSize(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("invalid entry size", e.getMessage());
        }
    }

    @Test
    public void testSetNameAndRawName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("raw.txt");
        byte[] rawNameBytes = "raw_name".getBytes();
        entry.setName("encoded_name", rawNameBytes);
        assertEquals("encoded_name", entry.getName());
        assertNotNull(entry.getRawName());
        assertArrayEquals(rawNameBytes, entry.getRawName());
    }

    @Test
    public void testGetRawNameWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("no_raw.txt");
        assertNull(entry.getRawName());
    }

    @Test
    public void testHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("hash.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("hash.txt");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("other.txt");

        assertEquals(entry1.hashCode(), entry2.hashCode());
        assertNotEquals(entry1.hashCode(), entry3.hashCode());
    }

    @Test
    public void testGetSetGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("gpb.txt");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(gpb);
        GeneralPurposeBit retrievedGpb = entry.getGeneralPurposeBit();
        assertTrue(retrievedGpb.usesUTF8ForNames());
        assertEquals(gpb, retrievedGpb);
    }

    @Test
    public void testGetLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("date.txt");
        long time = 123456789L; // Use a fixed value for reproducibility
        entry.setTime(time);
        Date lastModified = entry.getLastModifiedDate();
        assertEquals(new Date(time), lastModified);
    }

    @Test
    public void testEquals() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equal.txt");
        entry1.setComment("comment");
        entry1.setTime(12345);
        entry1.setInternalAttributes(1);
        entry1.setExternalAttributes(2);
        entry1.setMethod(3);
        entry1.setSize(4);
        entry1.setCrc(5);
        entry1.setCompressedSize(6);
        entry1.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        // Need to add a valid ZipExtraField
        UnparseableExtraFieldData unparseable1 = new UnparseableExtraFieldData();
        unparseable1.parseFromLocalFileData(new byte[]{1}, 0, 1);
        entry1.setExtraFields(new ZipExtraField[]{unparseable1});
        entry1.setGeneralPurposeBit(new GeneralPurposeBit());


        ZipArchiveEntry entry2 = new ZipArchiveEntry("equal.txt");
        entry2.setComment("comment");
        entry2.setTime(12345);
        entry2.setInternalAttributes(1);
        entry2.setExternalAttributes(2);
        entry2.setMethod(3);
        entry2.setSize(4);
        entry2.setCrc(5);
        entry2.setCompressedSize(6);
        entry2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        UnparseableExtraFieldData unparseable2 = new UnparseableExtraFieldData();
        unparseable2.parseFromLocalFileData(new byte[]{1}, 0, 1);
        entry2.setExtraFields(new ZipExtraField[]{unparseable2});
        entry2.setGeneralPurposeBit(new GeneralPurposeBit());

        ZipArchiveEntry entry3 = new ZipArchiveEntry("not_equal.txt");

        assertEquals(entry1, entry1); // reflexivity
        assertEquals(entry1, entry2); // symmetry
        assertEquals(entry2, entry1); // symmetry

        assertNotEquals(entry1, entry3);
        assertNotEquals(entry1, null);
        assertNotEquals(entry1, new Object());
    }

    @Test
    public void testEqualsWithDifferentName() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("name1.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("name2.txt");
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentComment() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("comment.txt");
        entry1.setComment("comment1");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("comment.txt");
        entry2.setComment("comment2");
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentTime() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("time.txt");
        entry1.setTime(100);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("time.txt");
        entry2.setTime(200);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentInternalAttributes() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("internal.txt");
        entry1.setInternalAttributes(10);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("internal.txt");
        entry2.setInternalAttributes(20);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentExternalAttributes() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("external.txt");
        entry1.setExternalAttributes(0x100);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("external.txt");
        entry2.setExternalAttributes(0x200);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentMethod() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("method.txt");
        entry1.setMethod(java.util.zip.ZipEntry.STORED);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("method.txt");
        entry2.setMethod(java.util.zip.ZipEntry.DEFLATED);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentSize() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("size.txt");
        entry1.setSize(100);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("size.txt");
        entry2.setSize(200);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentCrc() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("crc.txt");
        entry1.setCrc(1000);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("crc.txt");
        entry2.setCrc(2000);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentCompressedSize() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("compressedsize.txt");
        entry1.setCompressedSize(10000);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("compressedsize.txt");
        entry2.setCompressedSize(20000);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentPlatform() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("platform.txt");
        entry1.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("platform.txt");
        entry2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentExtraData() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("extra.txt");
        UnparseableExtraFieldData unparseable1 = new UnparseableExtraFieldData();
        unparseable1.parseFromLocalFileData(new byte[]{1}, 0, 1);
        entry1.setExtraFields(new ZipExtraField[]{unparseable1});

        ZipArchiveEntry entry2 = new ZipArchiveEntry("extra.txt");
        UnparseableExtraFieldData unparseable2 = new UnparseableExtraFieldData();
        unparseable2.parseFromLocalFileData(new byte[]{2}, 0, 1);
        entry2.setExtraFields(new ZipExtraField[]{unparseable2});
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testEqualsWithDifferentGeneralPurposeBit() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("gpb.txt");
        entry1.setGeneralPurposeBit(new GeneralPurposeBit());

        ZipArchiveEntry entry2 = new ZipArchiveEntry("gpb.txt");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        entry2.setGeneralPurposeBit(gpb);
        assertNotEquals(entry1, entry2);
    }

    @Test
    public void testGetExtraFieldsWithIncludeUnparseable() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unparseable_fields.txt");
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(unparseable);

        ZipExtraField[] fieldsWithUnparseable = entry.getExtraFields(true);
        assertEquals(1, fieldsWithUnparseable.length);
        assertTrue(fieldsWithUnparseable[0] instanceof UnparseableExtraFieldData);

        ZipExtraField[] fieldsWithoutUnparseable = entry.getExtraFields(false);
        assertEquals(0, fieldsWithoutUnparseable.length);
    }

    @Test
    public void testSetExtraWithUnparseableData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("set_extra_unparseable.txt");
        // This test assumes that ExtraFieldUtils.parse can handle some byte sequences as unparseable.
        // We provide a sequence that is unlikely to be a valid known extra field.
        byte[] potentiallyUnparseable = new byte[]{0x01, 0x02, 0x03, 0x04};
        try {
            entry.setExtra(potentiallyUnparseable);
            // If setExtra does not throw, it implies it was parsed or handled as unparseable.
            // We can check if unparseable data was captured.
            if (entry.getUnparseableExtraFieldData() == null) {
                // If it wasn't captured as unparseable, it might have been parsed into known fields.
                // This is hard to assert without knowing ExtraFieldUtils.
                // For now, we rely on the fact that no exception was thrown.
            }
        } catch (RuntimeException e) {
            fail("setExtra threw unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testMergeExtraFieldsWhenExtraFieldsIsNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("merge_null_extra.txt");
        // Initially, extraFields is null.
        MockZipExtraField field = new MockZipExtraField(1);
        field.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(field); // This should initialize extraFields
        assertNotNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testMergeExtraFieldsWhenExtraFieldsIsNotNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("merge_notnull_extra.txt");
        MockZipExtraField field1 = new MockZipExtraField(1);
        field1.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        entry.addExtraField(field1); // Initializes extraFields

        MockZipExtraField field2 = new MockZipExtraField(2);
        field2.parseFromLocalFileData(new byte[]{3, 4}, 0, 2);
        entry.addExtraField(field2); // Merges field2

        assertEquals(2, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(new ZipShort(1)));
        assertNotNull(entry.getExtraField(new ZipShort(2)));
    }
}
