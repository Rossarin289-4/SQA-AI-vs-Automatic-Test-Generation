package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Date;

public class ZipArchiveEntryAI13Test {

    @Test
    public void testConstructorWithName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorWithDirectoryName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("testDir/");
        Assert.assertEquals("testDir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void testConstructorWithZipEntry() throws Exception {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("foo.txt");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(1234L);
        ZipArchiveEntry entry = new ZipArchiveEntry(ze);
        Assert.assertEquals("foo.txt", entry.getName());
        Assert.assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
        Assert.assertEquals(1234L, entry.getSize());
    }

    @Test
    public void testConstructorWithZipArchiveEntry() throws Exception {
        ZipArchiveEntry original = new ZipArchiveEntry("bar.txt");
        original.setInternalAttributes(5);
        original.setExternalAttributes(10L);
        original.setMethod(ZipArchiveEntry.STORED);
        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        Assert.assertEquals("bar.txt", copy.getName());
        Assert.assertEquals(5, copy.getInternalAttributes());
        Assert.assertEquals(10L, copy.getExternalAttributes());
        Assert.assertEquals(ZipArchiveEntry.STORED, copy.getMethod());
    }

    @Test
    public void testConstructorWithFileRegular() {
        File dummyFile = new File("pom.xml");
        ZipArchiveEntry entry = new ZipArchiveEntry(dummyFile, "pom.xml");
        Assert.assertEquals("pom.xml", entry.getName());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void testSetAndGetMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method.txt");
        entry.setMethod(ZipArchiveEntry.STORED);
        Assert.assertEquals(ZipArchiveEntry.STORED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeMethod() {
        ZipArchiveEntry entry = new ZipArchiveEntry("method.txt");
        entry.setMethod(-2);
    }

    @Test
    public void testSetAndGetSize() {
        ZipArchiveEntry entry = new ZipArchiveEntry("size.txt");
        entry.setSize(500L);
        Assert.assertEquals(500L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeSize() {
        ZipArchiveEntry entry = new ZipArchiveEntry("size.txt");
        entry.setSize(-1L);
    }

    @Test
    public void testUnixModeAndPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("unix.txt");
        entry.setUnixMode(0644);
        Assert.assertEquals(0644, entry.getUnixMode());
        Assert.assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testClone() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("clone.txt");
        entry.setInternalAttributes(7);
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        Assert.assertEquals(entry.getName(), cloned.getName());
        Assert.assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        Assert.assertNotSame(entry, cloned);
    }

    @Test
    public void testHashCodeAndEquals() throws Exception {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("equals.txt");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("equals.txt");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("other.txt");

        Assert.assertEquals(entry1, entry1);
        Assert.assertEquals(entry1, entry2);
        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
        Assert.assertFalse(entry1.equals(entry3));
        Assert.assertFalse(entry1.equals(null));
        Assert.assertFalse(entry1.equals("some string"));
    }

    @Test
    public void testGetLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("date.txt");
        entry.setTime(100000L);
        Date date = entry.getLastModifiedDate();
        Assert.assertEquals(new Date(100000L), date);
    }
}
