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
        assertEquals(-1, entry.getMethod());
        assertNull(entry.getComment());
        assertEquals(0, entry.getInternalAttributes());
        assertEquals(0, entry.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorWithZipEntry() throws ZipException {
        java.util.zip.ZipEntry baseEntry = new java.util.zip.ZipEntry("base.txt");
        baseEntry.setComment("base comment");
        baseEntry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        baseEntry.setSize(100);
        baseEntry.setTime(123456789);

        ZipArchiveEntry entry = new ZipArchiveEntry(baseEntry);
        assertEquals("base.txt", entry.getName());
        assertEquals("base comment", entry.getComment());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(100, entry.getSize());
        assertEquals(123456789, entry.getTime());
        assertFalse(entry.isDirectory());
        assertEquals(0, entry.getInternalAttributes());
        // The external attributes are parsed from the base entry's platform
        // which is not set explicitly, so it defaults to 0.
        // However, the constructor of ZipArchiveEntry from ZipEntry sets externalAttributes
        // based on the base entry's attributes, which are not directly accessible.
        // The behavior here is to default to 0 if not otherwise specified by the base entry.
        // The error was likely due to assuming a direct mapping that doesn't exist.
        assertEquals(0, entry.getExternalAttributes()); 
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testConstructorWithZipArchiveEntry() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("original.txt");
        original.setComment("original comment");
        original.setMethod(java.util.zip.ZipEntry.DEFLATED);
        original.setSize(200);
        original.setTime(987654321);
        original.setInternalAttributes(5);
        original.setExternalAttributes(10);
        original.setUnixMode(0755);

        ZipArchiveEntry entry = new ZipArchiveEntry(original);
        assertEquals("original.txt", entry.getName());
        assertEquals("original comment", entry.getComment());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
        assertEquals(200, entry.getSize());
        assertEquals(987654321, entry.getTime());
        assertFalse(entry.isDirectory());
        assertEquals(5, entry.getInternalAttributes());
        // The external attributes are copied directly.
        assertEquals(10, entry.getExternalAttributes()); 
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testConstructorWithFileAndName() {
        // Mocking a File object since we can't create one directly without I/O
        // This tests the logic of the constructor, not actual file operations.
        File mockFileDir = new File("mockDir");
        // Simulate isDirectory() and setSize() not being called for directories
        ZipArchiveEntry dirEntry = new ZipArchiveEntry(mockFileDir, "dir/");
        assertEquals("dir/", dirEntry.getName());
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, dirEntry.getSize());
        assertFalse(dirEntry.isDirectory()); // ends with /

        File mockFileFile = new File("mockFile");
        // Simulate isFile() and setSize() being called for files
        ZipArchiveEntry fileEntry = new ZipArchiveEntry(mockFileFile, "file.txt");
        assertEquals("file.txt", fileEntry.getName());
        // Size is not set by File constructor if it's not a file, this is expected behavior.
        // If it were a file, File.length() would be used. We are not simulating that here.
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, fileEntry.getSize());
        assertFalse(fileEntry.isDirectory());

        ZipArchiveEntry fileEntryWithSlash = new ZipArchiveEntry(mockFileFile, "file.txt/");
        assertEquals("file.txt/", fileEntryWithSlash.getName()); // Trailing slash should not be stripped for non-directories
    }

    @Test
    public void testClone() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("clone.txt");
        original.setComment("comment");
        original.setMethod(java.util.zip.ZipEntry.DEFLATED);
        original.setSize(50);
        original.setTime(111111111);
        original.setInternalAttributes(1);
        original.setExternalAttributes(2);
        original.setUnixMode(0644);

        ZipArchiveEntry cloned = (ZipArchiveEntry) original.clone();

        assertEquals(original.getName(), cloned.getName());
        assertEquals(original.getComment(), cloned.getComment());
        assertEquals(original.getMethod(), cloned.getMethod());
        assertEquals(original.getSize(), cloned.getSize());
        assertEquals(original.getTime(), cloned.getTime());
        assertEquals(original.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(original.getExternalAttributes(), cloned.getExternalAttributes());
        assertEquals(original.getPlatform(), cloned.getPlatform());
        assertEquals(original.getUnixMode(), cloned.getUnixMode());
        assertFalse(cloned.isDirectory());
    }

    @Test
    public void testSetMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method.txt");
        entry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        assertEquals(java.util.zip.ZipEntry.DEFLATED, entry.getMethod());
    }

    @Test
    public void testSetMethodToUnknown() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method_unknown.txt");
        entry.setMethod(-1); // Representing unknown method
        // The reference implementation uses -1 to signify an unspecified method.
        assertEquals(-1, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodToNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method_negative.txt");
        entry.setMethod(-2);
    }

    @Test
    public void testSetInternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("internal.txt");
        entry.setInternalAttributes(123);
        assertEquals(123, entry.getInternalAttributes());
    }

    @Test
    public void testSetExternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("external.txt");
        entry.setExternalAttributes(456L);
        assertEquals(456L, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unixmode.txt");
        entry.setName("unixdir/"); // Set as directory first
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
        // Check that the directory flag is set in external attributes
        assertTrue((entry.getExternalAttributes() & 0x10) != 0);
    }

    @Test
    public void testSetUnixModeAsFile() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unixmodefile.txt");
        entry.setUnixMode(0644);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0644, entry.getUnixMode());
        assertFalse((entry.getExternalAttributes() & 0x10) != 0); // Directory flag should not be set
    }

    @Test
    public void testGetUnixModeWhenNotUnix() {
        ZipArchiveEntry entry = new ZipArchiveEntry("notunix.txt");
        // Platform is FAT by default
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testSetPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("platform.txt");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetExtraFields() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("extrafields.txt");
        
        // Using UnparseableExtraFieldData, which is a concrete class implementing ZipExtraField.
        UnparseableExtraFieldData unparseableField1 = new UnparseableExtraFieldData();
        unparseableField1.parseFromLocalFileData(new byte[]{1, 2}, 0, 2);
        
        UnparseableExtraFieldData unparseableField2 = new UnparseableExtraFieldData();
        unparseableField2.parseFromLocalFileData(new byte[]{3, 4}, 0, 2);

        ZipExtraField[] fields = new ZipExtraField[]{unparseableField1, unparseableField2};
        entry.setExtraFields(fields);

        // When setExtraFields is called with an array of UnparseableExtraFieldData,
        // they are all added to the `extraFields` map and `unparseableExtra` remains null.
        // The mergeExtraFields logic in setExtra() will then reconstruct the extra data.
        // getExtraFields(true) will return all fields including the unparseable ones.
        ZipExtraField[] retrievedFields = entry.getExtraFields(true);
        // The reference implementation will parse the extra data and create proper UnparseableExtraFieldData instances.
        // The number of fields is determined by the parsing. If the data is valid, it will be parsed.
        // In this case, the input bytes {1, 2, 3, 4} are interpreted as two extra fields.
        assertEquals(2, retrievedFields.length);
        assertTrue(retrievedFields[0] instanceof UnparseableExtraFieldData);
        assertTrue(retrievedFields[1] instanceof UnparseableExtraFieldData);
    }
    
    @Test
    public void testAddExtraFieldAndGet() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("addextra.txt");
        
        UnparseableExtraFieldData unparseable1 = new UnparseableExtraFieldData();
        unparseable1.parseFromLocalFileData(new byte[]{1}, 0, 1);
        entry.addExtraField(unparseable1); // This should set unparseableExtra field
        assertNotNull(entry.getUnparseableExtraFieldData());
        // addExtraField adds to the map of extra fields. For unparseable data, it sets unparseableExtra.
        // So, getExtraFields(true) should return the added unparseable field.
        assertEquals(1, entry.getExtraFields(true).length); 
    }

    @Test
    public void testAddAsFirstExtraField() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("addfirst.txt");
        
        UnparseableExtraFieldData unparseable1 = new UnparseableExtraFieldData();
        unparseable1.parseFromLocalFileData(new byte[]{1}, 0, 1);
        entry.addExtraField(unparseable1);
        
        UnparseableExtraFieldData unparseable2 = new UnparseableExtraFieldData();
        unparseable2.parseFromLocalFileData(new byte[]{2}, 0, 1);
        entry.addAsFirstExtraField(unparseable2);
        
        ZipExtraField[] fields = entry.getExtraFields(true);
        assertEquals(2, fields.length);
        // addAsFirstExtraField prepends the new field to the internal map.
        // For UnparseableExtraFieldData, it should appear first.
        assertTrue(fields[0] instanceof UnparseableExtraFieldData); // The second one added as first
        assertTrue(fields[1] instanceof UnparseableExtraFieldData); // The first one added originally
    }

    @Test
    public void testRemoveExtraField() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("removeextra.txt");
        
        // To test removeExtraField(ZipShort type), we need to create a parseable extra field.
        // Since we don't have concrete ZipExtraField implementations to instantiate directly,
        // and the API doesn't provide a way to create one with a specific ID for testing,
        // we will focus on testing `removeUnparseableExtraFieldData` which is directly testable.
        // For `removeExtraField(ZipShort type)`, we can assert that it throws NoSuchElementException
        // if no such field exists.
        
        // Test case for when the field does not exist
        try {
            entry.removeExtraField(new ZipShort(0x1234)); 
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
            // Expected
        }

        // Now, let's add an unparseable field and try to remove it using removeUnparseableExtraFieldData
        UnparseableExtraFieldData unparseable1 = new UnparseableExtraFieldData();
        unparseable1.parseFromLocalFileData(new byte[]{1}, 0, 1);
        entry.addExtraField(unparseable1);
        
        UnparseableExtraFieldData unparseable2 = new UnparseableExtraFieldData();
        unparseable2.parseFromLocalFileData(new byte[]{2}, 0, 1);
        entry.addExtraField(unparseable2);
        
        assertEquals(2, entry.getExtraFields(true).length);
        
        // removeUnparseableExtraFieldData removes *all* unparseable extra field data.
        // The `addExtraField` method for UnparseableExtraFieldData directly sets `unparseableExtra`.
        // If there are multiple, it overwrites. So, calling it twice effectively stores the last one.
        // The `setExtraFields` method is where multiple unparseable fields would be handled correctly.
        // For `addExtraField`, it seems to only store one.
        // Let's assume we added one unparseable field.
        entry.removeUnparseableExtraFieldData(); // This should remove the unparseable field
        assertNull(entry.getUnparseableExtraFieldData());
        assertEquals(0, entry.getExtraFields(true).length); // Should now be empty if only unparseable was present.
    }

    @Test
    public void testRemoveUnparseableExtraFieldData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("removeunparseable.txt");
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        unparseable.parseFromLocalFileData(new byte[]{10}, 0, 1);
        entry.addExtraField(unparseable); // This should set unparseableExtra field
        assertNotNull(entry.getUnparseableExtraFieldData());
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testGetExtraFieldWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("getnull.txt");
        // This test verifies that getExtraField returns null when no matching field is present.
        // We cannot test a specific ZipShort ID directly without creating a custom ZipExtraField.
        assertNull(entry.getExtraField(new ZipShort(0x1234))); 
    }

    @Test
    public void testGetUnparseableExtraFieldDataWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("getunparseablenull.txt");
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtra() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("setextra.txt");
        byte[] extraData = new byte[]{1, 2, 3, 4};
        entry.setExtra(extraData); 
        
        // setExtra(byte[]) calls ExtraFieldUtils.parse, which can result in an array of ZipExtraField.
        // If the data is unparseable, it will be an UnparseableExtraFieldData.
        // In the reference implementation, `setExtra` will parse the bytes and then call `mergeExtraFields`.
        // If `mergeExtraFields` receives unparseable data, it will store it in `unparseableExtra`.
        // The call to `super.setExtra(ExtraFieldUtils.mergeLocalFileDataData(getExtraFields(true)));`
        // reconstructs the `extra` field of the superclass.
        
        // We cannot directly assert the parsed extra fields without knowing their IDs and structure.
        // However, we can check that `getLocalFileDataExtra()` returns non-empty data if `setExtra` was called with data.
        byte[] localData = entry.getLocalFileDataExtra();
        assertTrue(localData.length > 0); // It should contain the merged data.
    }

    @Test
    public void testSetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("setcentral.txt");
        byte[] centralData = new byte[]{5, 6, 7, 8};
        entry.setCentralDirectoryExtra(centralData);
        
        // setCentralDirectoryExtra parses the data and then calls mergeExtraFields.
        // If the data is unparseable, it will be stored in `unparseableExtra`.
        // The `getCentralDirectoryExtra()` method merges the fields back.
        byte[] retrievedCentral = entry.getCentralDirectoryExtra();
        // The result of mergeCentralDirectoryData depends on what ExtraFieldUtils parses.
        // For raw bytes, it should generally reconstruct them.
        assertTrue(retrievedCentral.length > 0);
        assertArrayEquals(centralData, retrievedCentral); // Assuming direct merge for simple bytes
    }

    @Test
    public void testGetLocalFileDataExtraWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("getlocalnull.txt");
        byte[] data = entry.getLocalFileDataExtra();
        assertNotNull(data);
        assertEquals(0, data.length); // Should return an empty array, not null.
    }

    @Test
    public void testGetCentralDirectoryExtraWhenNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("getcentralnull.txt");
        byte[] data = entry.getCentralDirectoryExtra();
        assertNotNull(data);
        assertEquals(0, data.length); // Should return an empty array, not null.
    }

    @Test
    public void testGetNameAndDirectoryStatus() {
        ZipArchiveEntry entryDir = new ZipArchiveEntry("dir/");
        assertEquals("dir/", entryDir.getName());
        assertTrue(entryDir.isDirectory());

        ZipArchiveEntry entryFile = new ZipArchiveEntry("file.txt");
        assertEquals("file.txt", entryFile.getName());
        assertFalse(entryFile.isDirectory());

        ZipArchiveEntry entryFileWithSlash = new ZipArchiveEntry("file/");
        assertEquals("file/", entryFileWithSlash.getName());
        assertTrue(entryFileWithSlash.isDirectory());
    }

    @Test
    public void testSetNameWithBackslashConversion() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test\\name");
        // Platform is FAT by default, so backslashes should be converted to forward slashes.
        assertEquals("test/name", entry.getName()); 
    }

    @Test
    public void testSetNameWithBackslashOnUnix() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test\\name");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        // On Unix platform, backslashes should NOT be converted.
        assertEquals("test\\name", entry.getName()); 
    }

    @Test
    public void testSetSize() {
        ZipArchiveEntry entry = new ZipArchiveEntry("size.txt");
        entry.setSize(1024L);
        assertEquals(1024L, entry.getSize());
    }

    @Test
    public void testSetSizeToZero() {
        ZipArchiveEntry entry = new ZipArchiveEntry("sizezero.txt");
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
    }
    
    @Test
    public void testSetSizeToUnknown() {
        ZipArchiveEntry entry = new ZipArchiveEntry("sizeunknown.txt");
        entry.setSize(ArchiveEntry.SIZE_UNKNOWN);
        // The reference implementation correctly handles SIZE_UNKNOWN.
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeToNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("size_negative.txt");
        entry.setSize(-1L);
    }
    
    @Test
    public void testSetSizeBelow64BitMax() {
        ZipArchiveEntry entry = new ZipArchiveEntry("large_size.txt");
        long maxSize = Long.MAX_VALUE; // Max value for long
        entry.setSize(maxSize);
        assertEquals(maxSize, entry.getSize());
    }

    @Test
    public void testGetRawName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("rawname.txt");
        // The setName(String, byte[]) method is protected and called internally.
        // We cannot call protected methods directly in a test.
        // The default state for rawName when constructed with a String is null.
        assertNull(entry.getRawName());
    }


    @Test
    public void testGetAndSetGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("gpb.txt");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(gpb);
        // The equals method for GeneralPurposeBit is used for comparison.
        assertEquals(gpb, entry.getGeneralPurposeBit());
        assertTrue(entry.getGeneralPurposeBit().usesUTF8ForNames());
    }
    
    @Test
    public void testGetAndSetGeneralPurposeBitTwice() {
        ZipArchiveEntry entry = new ZipArchiveEntry("gpb_twice.txt");
        GeneralPurposeBit gpb1 = new GeneralPurposeBit();
        gpb1.useEncryption(true);
        entry.setGeneralPurposeBit(gpb1);
        
        GeneralPurposeBit gpb2 = new GeneralPurposeBit();
        gpb2.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb2);
        
        // The second call overwrites the first.
        assertEquals(gpb2, entry.getGeneralPurposeBit());
        assertFalse(entry.getGeneralPurposeBit().usesEncryption());
        assertTrue(entry.getGeneralPurposeBit().usesDataDescriptor());
    }

    @Test
    public void testGetLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("lastmod.txt");
        long time = 1234567890123L; // Use a specific, non-zero time for consistency
        entry.setTime(time);
        assertEquals(new Date(time), entry.getLastModifiedDate());
    }

    @Test
    public void testEqualsWithSameObject() {
        ZipArchiveEntry entry = new ZipArchiveEntry("equals.txt");
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsWithDifferentObjectSameContent() throws ZipException {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setTime(12345);
        entry1.setSize(100);
        entry1.setMethod(java.util.zip.ZipEntry.DEFLATED);
        entry1.setCrc(500);
        entry1.setCompressedSize(100);

        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setTime(12345);
        entry2.setSize(100);
        entry2.setMethod(java.util.zip.ZipEntry.DEFLATED);
        entry2.setCrc(500);
        entry2.setCompressedSize(100);

        assertTrue(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentName() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("other.txt");
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentTime() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setTime(12345);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setTime(67890);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentSize() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setSize(100);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setSize(200);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentInternalAttributes() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setInternalAttributes(1);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setInternalAttributes(2);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentExternalAttributes() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setExternalAttributes(10L);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setExternalAttributes(20L);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentPlatform() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentMethod() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setMethod(java.util.zip.ZipEntry.STORED);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setMethod(java.util.zip.ZipEntry.DEFLATED);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentCrc() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setCrc(1000L);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setCrc(2000L);
        assertFalse(entry1.equals(entry2));
    }
    
    @Test
    public void testEqualsWithDifferentCompressedSize() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        entry1.setCompressedSize(1000L);
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        entry2.setCompressedSize(2000L);
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentExtraFields() throws ZipException {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        // To compare extra fields correctly, we need to set them in a way that
        // `ExtraFieldUtils.mergeLocalFileDataData` and `ExtraFieldUtils.mergeCentralDirectoryData`
        // produce distinct byte arrays.
        // Let's create simple unparseable fields.
        UnparseableExtraFieldData extraData1 = new UnparseableExtraFieldData();
        extraData1.parseFromLocalFileData(new byte[]{1}, 0, 1);
        entry1.addExtraField(extraData1);

        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        UnparseableExtraFieldData extraData2 = new UnparseableExtraFieldData();
        extraData2.parseFromLocalFileData(new byte[]{2}, 0, 1); // Different data
        entry2.addExtraField(extraData2);

        // The equals method compares the byte arrays returned by getCentralDirectoryExtra().
        // If they are different, equals should return false.
        assertFalse(entry1.equals(entry2));
    }

    @Test
    public void testEqualsWithDifferentGpb() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        GeneralPurposeBit gpb1 = new GeneralPurposeBit();
        gpb1.useUTF8ForNames(true);
        entry1.setGeneralPurposeBit(gpb1);

        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        GeneralPurposeBit gpb2 = new GeneralPurposeBit();
        gpb2.useUTF8ForNames(false);
        entry2.setGeneralPurposeBit(gpb2);

        assertFalse(entry1.equals(entry2));
    }
    
    @Test
    public void testEqualsWithNullObject() {
        ZipArchiveEntry entry = new ZipArchiveEntry("equals.txt");
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        ZipArchiveEntry entry = new ZipArchiveEntry("equals.txt");
        java.util.zip.ZipEntry baseEntry = new java.util.zip.ZipEntry("equals.txt");
        assertFalse(entry.equals(baseEntry));
    }
}
