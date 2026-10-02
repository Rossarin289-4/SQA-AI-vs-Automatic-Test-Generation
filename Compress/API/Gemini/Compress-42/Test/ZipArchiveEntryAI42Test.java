package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.zip.ZipException;

public class ZipArchiveEntryAI42Test {

    @Test
    public void testConstructorAndName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test/path/file.txt");
        Assert.assertEquals("test/path/file.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void testDirectoryDetection() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test/dir/");
        Assert.assertEquals("test/dir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void testFatPlatformBackslashConversion() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test\\path\\file.txt");
        Assert.assertEquals("test/path/file.txt", entry.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeMethodThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(-1);
    }

    @Test
    public void testValidMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(8);
        Assert.assertEquals(8, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSizeThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(-5L);
    }

    @Test
    public void testValidSize() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(1024L);
        Assert.assertEquals(1024L, entry.getSize());
    }

    @Test
    public void testAttributesAndUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setInternalAttributes(123);
        entry.setExternalAttributes(456L);
        Assert.assertEquals(123, entry.getInternalAttributes());
        Assert.assertEquals(456L, entry.getExternalAttributes());

        entry.setUnixMode(0644);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0644, entry.getUnixMode());
    }

    @Test
    public void testVersionAndRawFlag() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setVersionMadeBy(20);
        entry.setVersionRequired(10);
        entry.setRawFlag(4);

        Assert.assertEquals(20, entry.getVersionMadeBy());
        Assert.assertEquals(10, entry.getVersionRequired());
        Assert.assertEquals(4, entry.getRawFlag());
    }

    @Test
    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setTime(1000000L);
        Date date = entry.getLastModifiedDate();
        Assert.assertNotNull(date);
        Assert.assertEquals(1000000L, date.getTime());
    }

    @Test
    public void testClone() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(0);
        entry.setSize(100L);
        entry.setInternalAttributes(5);
        entry.setExternalAttributes(10L);

        ZipArchiveEntry clone = (ZipArchiveEntry) entry.clone();
        Assert.assertEquals(entry.getName(), clone.getName());
        Assert.assertEquals(entry.getMethod(), clone.getMethod());
        Assert.assertEquals(entry.getSize(), clone.getSize());
        Assert.assertEquals(entry.getInternalAttributes(), clone.getInternalAttributes());
        Assert.assertEquals(entry.getExternalAttributes(), clone.getExternalAttributes());
        Assert.assertEquals(entry, clone);
    }

    @Test
    public void testEqualsAndHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("test.txt");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("other.txt");

        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
        Assert.assertFalse(entry1.equals(entry3));
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("some string"));
    }
}
