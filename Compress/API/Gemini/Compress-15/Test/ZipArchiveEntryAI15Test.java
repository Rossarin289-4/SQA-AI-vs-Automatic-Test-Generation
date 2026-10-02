package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;
import org.junit.Assert;
import org.junit.Test;

public class ZipArchiveEntryAI15Test {

    @Test
    public void testConstructorsAndBasicGetters() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test/dir/");
        Assert.assertEquals("test/dir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());

        ZipArchiveEntry entryFile = new ZipArchiveEntry("test/file.txt");
        Assert.assertEquals("test/file.txt", entryFile.getName());
        Assert.assertFalse(entryFile.isDirectory());
    }

    @Test
    public void testMethodGetterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        Assert.assertEquals(-1, entry.getMethod());
        entry.setMethod(8);
        Assert.assertEquals(8, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        entry.setMethod(-2);
    }

    @Test
    public void testSizeGetterSetter() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        Assert.assertEquals(-1L, entry.getSize());
        entry.setSize(1024L);
        Assert.assertEquals(1024L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        entry.setSize(-1L);
    }

    @Test
    public void testAttributesAndPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        Assert.assertEquals(0, entry.getInternalAttributes());
        entry.setInternalAttributes(5);
        Assert.assertEquals(5, entry.getInternalAttributes());

        Assert.assertEquals(0L, entry.getExternalAttributes());
        entry.setExternalAttributes(12345L);
        Assert.assertEquals(12345L, entry.getExternalAttributes());

        Assert.assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        entry.setUnixMode(0644);
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        Assert.assertEquals(0644, entry.getUnixMode());
    }

    @Test
    public void testNameAndPlatformFatBackslash() {
        ZipArchiveEntry entry = new ZipArchiveEntry("a\\b\\c");
        Assert.assertEquals("a/b/c", entry.getName());
    }

    @Test
    public void testCloneAndEquals() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo/bar");
        entry.setMethod(0);
        entry.setSize(50L);
        entry.setInternalAttributes(1);
        entry.setExternalAttributes(2L);

        ZipArchiveEntry clone = (ZipArchiveEntry) entry.clone();
        Assert.assertEquals(entry, clone);
        Assert.assertEquals(entry.hashCode(), clone.hashCode());

        ZipArchiveEntry other = new ZipArchiveEntry("other");
        Assert.assertNotEquals(entry, other);
        Assert.assertNotEquals(entry, null);
        Assert.assertNotEquals(entry, "some string");
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistentExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        entry.removeExtraField(new ZipShort(123));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistentUnparseableExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        entry.setTime(1000000L);
        Date date = entry.getLastModifiedDate();
        Assert.assertEquals(new Date(1000000L), date);
    }

    @Test
    public void testRawNameHandling() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo");
        Assert.assertNull(entry.getRawName());

        byte[] raw = new byte[] { (byte)'f', (byte)'o', (byte)'o' };
        entry.setName("foo", raw);
        Assert.assertArrayEquals(raw, entry.getRawName());
    }
}
