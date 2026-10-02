package org.apache.commons.compress.archivers.dump;

import org.apache.commons.compress.archivers.ArchiveException;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class DumpArchiveInputStreamAI29Test {

    @Test
    public void testMatchesWithShortBuffer() {
        byte[] buffer = new byte[10];
        assertFalse(DumpArchiveInputStream.matches(buffer, buffer.length));
    }

    @Test
    public void testConstructorWithInvalidHeaderThrowsArchiveException() {
        byte[] invalidHeader = new byte[DumpArchiveConstants.TP_SIZE];
        InputStream is = new ByteArrayInputStream(invalidHeader);
        try {
            new DumpArchiveInputStream(is);
            fail("Expected ArchiveException due to invalid header");
        } catch (ArchiveException e) {
            // Expected
        }
    }

    @Test
    public void testMatchesWithInsufficientLength() {
        byte[] buffer = new byte[31];
        assertFalse(DumpArchiveInputStream.matches(buffer, 31));
    }
}
