package org.apache.commons.compress.archivers.ar;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class ArArchiveInputStreamAI2Test {

    @Test
    public void testMatchesNullOrShort() {
        byte[] shortSig = new byte[] { 0x21, 0x3c, 0x61, 0x72 };
        Assert.assertFalse(ArArchiveInputStream.matches(shortSig, 4));
    }

    @Test
    public void testMatchesValidSignature() {
        // ArArchiveEntry.HEADER is "!<arch>\n"
        byte[] validSig = ArArchiveEntry.HEADER.getBytes();
        Assert.assertTrue(ArArchiveInputStream.matches(validSig, validSig.length));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] invalidSig = "INVALID!\n".getBytes();
        Assert.assertFalse(ArArchiveInputStream.matches(invalidSig, invalidSig.length));
    }

    @Test(expected = IOException.class)
    public void testInvalidHeader() throws IOException {
        byte[] badData = "NOT_AR_HEADER".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(badData);
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        try {
            ais.getNextArEntry();
        } finally {
            ais.close();
        }
    }

    @Test
    public void testEmptyArchiveAfterHeader() throws IOException {
        // Just the header, then no more bytes available (available() == 0)
        byte[] header = ArArchiveEntry.HEADER.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(header);
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        try {
            ArArchiveEntry entry = ais.getNextArEntry();
            Assert.assertNull(entry);
        } finally {
            ais.close();
        }
    }

    @Test
    public void testCloseIdempotency() throws IOException {
        byte[] header = ArArchiveEntry.HEADER.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(header);
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        ais.close();
        // Closing again should not throw an exception
        ais.close();
    }

    @Test
    public void testReadWithoutCurrentEntry() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        try {
            int val = ais.read();
            Assert.assertEquals(1, val);
            
            byte[] buf = new byte[2];
            int readCount = ais.read(buf, 0, 2);
            Assert.assertEquals(2, readCount);
            Assert.assertEquals(2, buf[0]);
            Assert.assertEquals(3, buf[1]);
        } finally {
            ais.close();
        }
    }

    @Test
    public void testReadWithCurrentEntryBounds() throws IOException {
        // Construct a valid ar archive with one entry
        // Header (8 bytes) + Entry Header (60 bytes) + Content (4 bytes)
        StringBuilder sb = new StringBuilder();
        sb.append(ArArchiveEntry.HEADER);
        // Name (16), LastModified (12), UserId (6), GroupId (6), FileMode (8), Length (10), Trailer (2)
        sb.append(String.format("%-16s", "test.txt"));
        sb.append(String.format("%-12s", "123456789"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-8s", "100644"));
        sb.append(String.format("%-10s", "4")); // length = 4
        sb.append(ArArchiveEntry.TRAILER);
        
        byte[] headerAndEntry = sb.toString().getBytes("US-ASCII");
        byte[] content = new byte[] { 'A', 'B', 'C', 'D' };
        
        byte[] full = new byte[headerAndEntry.length + content.length];
        System.arraycopy(headerAndEntry, 0, full, 0, headerAndEntry.length);
        System.arraycopy(content, 0, full, headerAndEntry.length, content.length);

        ByteArrayInputStream bais = new ByteArrayInputStream(full);
        ArArchiveInputStream ais = new ArArchiveInputStream(bais);
        try {
            ArArchiveEntry entry = ais.getNextArEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("test.txt", entry.getName());
            Assert.assertEquals(4L, entry.getLength());

            int r1 = ais.read();
            Assert.assertEquals('A', r1);

            byte[] buf = new byte[10];
            int read = ais.read(buf, 0, 10);
            // Should be limited by entry length (only 3 bytes left)
            Assert.assertEquals(3, read);
            Assert.assertEquals('B', buf[0]);
            Assert.assertEquals('C', buf[1]);
            Assert.assertEquals('D', buf[2]);

            // Reading further within the same entry should return -1
            int rEof = ais.read();
            Assert.assertEquals(-1, rEof);
        } finally {
            ais.close();
        }
    }
}
