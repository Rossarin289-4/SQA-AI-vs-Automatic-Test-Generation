package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class TarArchiveInputStreamAI28Test {

    @Test
    public void testGetRecordSize() {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 512, 1024);
        assertEquals(1024, tais.getRecordSize());
    }

    @Test
    public void testCanReadEntryDataWithTarArchiveEntry() {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        assertTrue(tais.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryDataWithNonTarArchiveEntry() {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        assertFalse(tais.canReadEntryData(null));
    }
}
