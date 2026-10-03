package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

public class ZipArchiveEntryAI15Test {

    @Test
    public void testSetNamePlatformFatConvertsBackslashes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("foo\\bar");
        assertEquals("foo/bar", entry.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeSizeThrowsException() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(-1);
    }

    @Test
    public void testIsDirectory() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("folder/");
        ZipArchiveEntry fileEntry = new ZipArchiveEntry("folder/file.txt");
        assertTrue(dirEntry.isDirectory());
        assertFalse(fileEntry.isDirectory());
    }
}
