package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;

public class ZipArchiveInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a ZipArchiveInputStream with a specific InputStream
    private ZipArchiveInputStream createZipArchiveInputStream(InputStream is) {
        return new ZipArchiveInputStream(is);
    }

    @Test
    public void testMatchesWithLFHSignature() throws IOException {
        byte[] signature = {0x50, 0x4b, 0x03, 0x04}; // LFH_SIG
        assertTrue(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWithEOCDSignature() throws IOException {
        byte[] signature = {0x50, 0x4b, 0x05, 0x06}; // EOCD_SIG
        assertTrue(ZipArchiveInputStream.matches(signature, signature.length));
    }
    
    @Test
    public void testMatchesWithShortSignature() throws IOException {
        byte[] signature = {0x50, 0x4b};
        assertFalse(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWithInvalidSignature() throws IOException {
        byte[] signature = {0x01, 0x02, 0x03, 0x04};
        assertFalse(ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testGetNextZipEntryWhenEmpty() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        assertNull(zip.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryWhenOnlyEOCD() throws IOException {
        byte[] eocd = {0x50, 0x4b, 0x05, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        InputStream is = new ByteArrayInputStream(eocd);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        assertNull(zip.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryAfterClosing() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        zip.close();
        assertNull(zip.getNextZipEntry());
    }
    
    @Test
    public void testGetNextZipEntryWhenHitCentralDirectory() throws IOException {
        byte[] lfh = {0x50, 0x4b, 0x03, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        byte[] cfh = {0x50, 0x4b, 0x01, 0x02}; // Central File Header Signature
        byte[] eocd = {0x50, 0x4b, 0x05, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(lfh);
        baos.write(cfh);
        baos.write(eocd);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        zip.getNextZipEntry(); // Read the LFH
        assertNull(zip.getNextZipEntry()); // Should be null because hitCentralDirectory is true
    }

    @Test
    public void testReadWhenClosed() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        zip.close();
        byte[] buffer = new byte[10];
        try {
            zip.read(buffer, 0, buffer.length);
            fail("Expected IOException");
        } catch (IOException expected) {
            // Expected
        }
    }

    @Test
    public void testReadWhenInflaterFinished() throws IOException {
        byte[] lfh = {0x50, 0x4b, 0x03, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        byte[] eocd = {0x50, 0x4b, 0x05, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(lfh); // Empty entry
        baos.write(eocd);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        zip.getNextZipEntry(); // Should return null as it hits EOCD
        assertEquals(-1, zip.read(new byte[10], 0, 10));
    }

    @Test
    public void testReadWhenCurrentIsNull() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        assertEquals(-1, zip.read(new byte[10], 0, 10));
    }
    
    @Test
    public void testReadWithSTOREDMethodAndNoData() throws IOException {
        // LFH for an empty STORED entry
        byte[] lfh = {0x50, 0x4b, 0x03, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        byte[] eocd = {0x50, 0x4b, 0x05, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(lfh);
        baos.write(eocd);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        zip.getNextZipEntry();
        assertEquals(-1, zip.read(new byte[10], 0, 10));
    }

    @Test
    public void testReadWithSTOREDMethodAndSomeData() throws IOException {
        // LFH for a STORED entry of size 5
        byte[] lfh = {0x50, 0x4b, 0x03, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x00, 0x00, 0x05, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        byte[] data = {1, 2, 3, 4, 5};
        byte[] eocd = {0x50, 0x4b, 0x05, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(lfh);
        baos.write(data);
        baos.write(eocd);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        zip.getNextZipEntry();

        byte[] buffer = new byte[10];
        int bytesRead = zip.read(buffer, 0, 5);
        assertEquals(5, bytesRead);
        assertArrayEquals(data, java.util.Arrays.copyOf(buffer, 5));

        assertEquals(-1, zip.read(buffer, 0, 10));
    }


    @Test
    public void testReadWhenNeedsInputAndStreamIsExhausted() throws IOException {
        byte[] lfh = {0x50, 0x4b, 0x03, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        byte[] eocd = {0x50, 0x4b, 0x05, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(lfh);
        baos.write(eocd);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        zip.getNextZipEntry(); // Should return null
        assertEquals(-1, zip.read(new byte[10], 0, 10));
    }


    

    @Test
    public void testSkipWhenNegative() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        try {
            zip.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testSkipZero() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        assertEquals(0, zip.skip(0));
    }
    
    @Test
    public void testSkipSomeBytes() throws IOException {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        InputStream is = new ByteArrayInputStream(data);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        // Skip 5 bytes
        assertEquals(5, zip.skip(5));
        // Read the remaining bytes
        byte[] buffer = new byte[10];
        int read = zip.read(buffer, 0, 10);
        assertEquals(5, read);
        assertArrayEquals(new byte[]{6, 7, 8, 9, 10}, java.util.Arrays.copyOf(buffer, 5));
    }

    @Test
    public void testSkipMoreBytesThanAvailable() throws IOException {
        byte[] data = {1, 2, 3};
        InputStream is = new ByteArrayInputStream(data);
        ZipArchiveInputStream zip = createZipArchiveInputStream(is);
        // Skip 5 bytes
        assertEquals(3, zip.skip(5));
        // Reading after skipping should yield -1
        byte[] buffer = new byte[10];
        assertEquals(-1, zip.read(buffer, 0, 10));
    }
    


    

    


    

}



