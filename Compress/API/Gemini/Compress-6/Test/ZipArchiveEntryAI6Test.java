package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;

public class ZipArchiveEntryAI6Test {

    @Test
    public void testConstructorsAndName() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test.txt");
        Assert.assertEquals("test.txt", entry1.getName());
        Assert.assertFalse(entry1.isDirectory());

        ZipArchiveEntry entry2 = new ZipArchiveEntry("folder/");
        Assert.assertEquals("folder/", entry2.getName());
        Assert.assertTrue(entry2.isDirectory());

        ZipArchiveEntry entry3 = new ZipArchiveEntry();
        Assert.assertEquals("", entry3.getName());
    }

    @Test
    public void testCopyConstructorFromZipEntry() throws ZipException {
        java.util.zip.ZipEntry base = new java.util.zip.ZipEntry("base.txt");
        base.setMethod(ZipArchiveEntry.STORED);
        ZipArchiveEntry entry = new ZipArchiveEntry(base);
        Assert.assertEquals("base.txt", entry.getName());
        Assert.assertEquals(ZipArchiveEntry.STORED, entry.getMethod());
    }

    @Test
    public void testCopyConstructorFromZipArchiveEntry() throws ZipException {
        ZipArchiveEntry source = new ZipArchiveEntry("source.txt");
        source.setMethod(ZipArchiveEntry.STORED);
        source.setInternalAttributes(5);
        source.setExternalAttributes(10L);
        ZipArchiveEntry copy = new ZipArchiveEntry(source);
        Assert.assertEquals("source.txt", copy.getName());
        Assert.assertEquals(5, copy.getInternalAttributes());
        Assert.assertEquals(10L, copy.getExternalAttributes());
    }

    @Test
    public void testFileConstructor() {
        File fakeFile = new File("");
        ZipArchiveEntry entry = new ZipArchiveEntry(fakeFile, "dummyFile.txt");
        Assert.assertEquals("dummyFile.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());

        File fakeDir = new File("");
        ZipArchiveEntry entryDir = new ZipArchiveEntry(fakeDir, "dummyDir");
        Assert.assertEquals("dummyDir/", entryDir.getName());
        Assert.assertTrue(entryDir.isDirectory());
    }

    @Test
    public void testMethodSupportAndValidation() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method.txt");
        Assert.assertEquals(-1, entry.getMethod());
        Assert.assertFalse(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipArchiveEntry.STORED);
        Assert.assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(ZipArchiveEntry.DEFLATED);
        Assert.assertTrue(entry.isSupportedCompressionMethod());

        entry.setMethod(8); // Custom method (ZipEntry.DEFLATED is usually 8, let's use 99)
        entry.setMethod(99);
        Assert.assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeMethodThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("neg.txt");
        entry.setMethod(-2);
    }

    @Test
    public void testAttributesAndPlatformAndUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("attr.txt");
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        
        entry.setInternalAttributes(123);
        Assert.assertEquals(123, entry.getInternalAttributes());

        entry.setExternalAttributes(456L);
        Assert.assertEquals(456L, entry.getExternalAttributes());

        entry.setUnixMode(0755);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testExtraFieldsManagement() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra.txt");
        Assert.assertEquals(0, entry.getExtraFields().length);
        Assert.assertNotNull(entry.getLocalFileDataExtra());
        Assert.assertNotNull(entry.getCentralDirectoryExtra());

        AsiExtraField asi = new AsiExtraField();
        asi.setUserId(1000);

        entry.addExtraField(asi);
        ZipExtraField[] fields = entry.getExtraFields();
        Assert.assertEquals(1, fields.length);
        Assert.assertEquals(asi.getHeaderId(), fields[0].getHeaderId());

        Assert.assertNotNull(entry.getExtraField(asi.getHeaderId()));

        // Add as first extra field
        AsiExtraField asi2 = new AsiExtraField();
        asi2.setUserId(2000);
        entry.addAsFirstExtraField(asi2);
        Assert.assertEquals(asi2.getHeaderId(), entry.getExtraFields()[0].getHeaderId());

        // Remove extra field
        entry.removeExtraField(asi2.getHeaderId());
        Assert.assertEquals(1, entry.getExtraFields().length);

        entry.removeExtraField(asi.getHeaderId());
        Assert.assertEquals(0, entry.getExtraFields().length);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistentExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra2.txt");
        entry.removeExtraField(new ZipShort(1234));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraFieldFromNullMap() {
        ZipArchiveEntry entry = new ZipArchiveEntry("extra3.txt");
        // No extra fields added yet, extraFields is null
        entry.removeExtraField(new ZipShort(1234));
    }

    @Test
    public void testSetExtraBytes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("bytes.txt");
        // Passing null or empty bytes should parse fine
        entry.setExtra(new byte[0]);
        Assert.assertEquals(0, entry.getExtraFields().length);

        entry.setCentralDirectoryExtra(new byte[0]);
        Assert.assertEquals(0, entry.getExtraFields().length);
    }

    @Test(expected = RuntimeException.class)
    public void testSetInvalidExtraBytesThrowsRuntimeException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("badbytes.txt");
        // An extra field with invalid header/length format that triggers parse exception wrapped in RuntimeException
        byte[] badData = new byte[] { 0x01, 0x00, 0x05, 0x00 }; 
        entry.setExtra(badData);
    }

    @Test
    public void testCloneAndEqualsAndHashCode() throws ZipException {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("compare.txt");
        entry1.setMethod(ZipArchiveEntry.STORED);
        entry1.setInternalAttributes(1);

        ZipArchiveEntry cloned = (ZipArchiveEntry) entry1.clone();
        Assert.assertEquals(entry1, cloned);
        Assert.assertEquals(entry1.hashCode(), cloned.hashCode());
        Assert.assertNotSame(entry1, cloned);

        ZipArchiveEntry entry2 = new ZipArchiveEntry("other.txt");
        Assert.assertFalse(entry1.equals(entry2));
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("NotAZipEntry"));
        Assert.assertTrue(entry1.equals(entry1));

        ZipArchiveEntry nullNameEntry = new ZipArchiveEntry();
        Assert.assertNotNull(nullNameEntry.getName());
    }

    @Test
    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("date.txt");
        entry.setTime(1000L);
        Assert.assertNotNull(entry.getLastModifiedDate());
        Assert.assertEquals(1000L, entry.getLastModifiedDate().getTime());
    }
}
