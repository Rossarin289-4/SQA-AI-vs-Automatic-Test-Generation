package org.apache.commons.compress.archivers.ar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class ArArchiveInputStreamAI2Test {

    @Test
    public void testMatchesValidSignature() {
        byte[] validHeader = ArArchiveEntry.HEADER.getBytes();
        assertTrue(ArArchiveInputStream.matches(validHeader, validHeader.length));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] invalidHeader = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
        assertFalse(ArArchiveInputStream.matches(invalidHeader, invalidHeader.length));
    }

    @Test(expected = IOException.class)
    public void testGetNextArEntryInvalidHeader() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        try {
            ais.getNextArEntry();
        } finally {
            ais.close();
        }
    }

}
