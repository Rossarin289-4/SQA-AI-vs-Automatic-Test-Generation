package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

public class ZipArchiveEntryAI13Test {

    @Test
    public void testSetNamePlatformFatBackslashes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("a\\b\\c");
        assertEquals("a/b/c", entry.getName());
    }

    @Test
    public void testSetSizeValidAndInvalid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(100L);
        assertEquals(100L, entry.getSize());

        try {
            entry.setSize(-1L);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsDirectory() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("folder/");
        assertTrue(dirEntry.isDirectory());

        ZipArchiveEntry fileEntry = new ZipArchiveEntry("folder/file");
        assertFalse(fileEntry.isDirectory());
    }
}
