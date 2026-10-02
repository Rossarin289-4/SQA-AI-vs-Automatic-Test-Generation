package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarArchiveEntryAI38Test {

    @Test
    public void testConstructorWithName() {
        TarArchiveEntry entry = new TarArchiveEntry("testName");
        assertEquals("testName", entry.getName());
        assertNull(entry.getFile());
    }

    @Test
    public void testDefaultValues() {
        TarArchiveEntry entry = new TarArchiveEntry();
        assertNull(entry.getName());
        assertEquals(0, entry.getSize());
    }

    @Test
    public void testFileConstructorNullCheck() {
        try {
            new TarArchiveEntry((java.io.File) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }
}
