package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

public class ZipArchiveEntryAI42Test {

    @Test
    public void testConstructorAndName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test/file.txt");
        assertEquals("test/file.txt", entry.getName());
        assertEquals("test/file.txt".hashCode(), entry.hashCode());
    }

    @Test
    public void testEqualsAndHashCode() throws Exception {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("entry1");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("entry1");
        ZipArchiveEntry entry3 = new ZipArchiveEntry("entry2");

        assertTrue(entry1.equals(entry2));
        assertFalse(entry1.equals(entry3));
        assertFalse(entry1.equals(null));
        assertFalse(entry1.equals("some string"));
    }

    @Test
    public void testVersionAndAttributesGettersSetters() {
        ZipArchiveEntry entry = new ZipArchiveEntry("attr.txt");
        entry.setVersionMadeBy(20);
        entry.setVersionRequired(10);
        entry.setRawFlag(5);

        assertEquals(20, entry.getVersionMadeBy());
        assertEquals(10, entry.getVersionRequired());
        assertEquals(5, entry.getRawFlag());
        assertNotNull(entry.getGeneralPurposeBit());
    }
}
