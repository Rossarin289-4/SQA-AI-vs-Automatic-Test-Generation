package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

public class ZipArchiveEntryAI6Test {

    @Test
    public void testMethodSettingAndSupport() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals(-1, entry.getMethod());
        assertFalse(entry.isSupportedCompressionMethod());

        entry.setMethod(java.util.zip.ZipEntry.STORED);
        assertEquals(java.util.zip.ZipEntry.STORED, entry.getMethod());
        assertTrue(entry.isSupportedCompressionMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeMethodThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(-2);
    }

    @Test
    public void testDirectoryAndNameBehavior() {
        ZipArchiveEntry entry = new ZipArchiveEntry("folder/");
        assertTrue(entry.isDirectory());
        assertEquals("folder/", entry.getName());

        ZipArchiveEntry fileEntry = new ZipArchiveEntry("folder/file.txt");
        assertFalse(fileEntry.isDirectory());
        assertEquals("folder/file.txt", fileEntry.getName());
    }
}
