package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
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
    @Test
    public void testMatchesLocalHeaderAtMinimumLength() throws Exception {
        byte[] sig = { 'P', 'K', 3, 4 };
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesEndOfCentralDirectoryAtMinimumLength() throws Exception {
        byte[] sig = { 'P', 'K', 5, 6 };
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesRejectsLengthBelowSignatureSize() throws Exception {
        byte[] sig = { 'P', 'K', 3, 4 };
        assertFalse(ZipArchiveInputStream.matches(sig, 3));
    }

    @Test
    public void testMatchesRejectsIncorrectSignature() throws Exception {
        byte[] sig = { 'P', 'K', 3, 5 };
        assertFalse(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesDoesNotExamineBytesAfterSignature() throws Exception {
        byte[] sig = { 'P', 'K', 3, 4, 0 };
        assertTrue(ZipArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void testMatchesUsesLengthRatherThanArrayLength() throws Exception {
        byte[] sig = { 'P', 'K', 3, 4 };
        assertFalse(ZipArchiveInputStream.matches(sig, 0));
    }

    @Test
    public void testEmptyInputHasNoNextEntry() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testEmptyInputGenericNextEntryIsNull() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        ArchiveEntry entry = in.getNextEntry();
        assertNull(entry);
    }

    @Test
    public void testNonZipHeaderReturnsNoEntry() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[30]));
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testReadWithoutEntryReturnsEndOfStream() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, 1));
    }

    @Test
    public void testReadZeroLengthWithoutEntryReturnsEndOfStream() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[0], 0, 0));
    }

    @Test
    public void testReadNegativeStartWithoutEntryReturnsEndOfStream() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], -1, 1));
    }

    @Test
    public void testReadNegativeLengthWithoutEntryReturnsEndOfStream() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, -1));
    }

    @Test
    public void testReadRangeBeyondBufferWithoutEntryReturnsEndOfStream() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, 2));
    }

    @Test
    public void testSkipZeroWithoutEntryReturnsZero() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(0));
    }

    @Test
    public void testSkipPositiveWithoutEntryReturnsZero() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(1));
    }

    @Test
    public void testSkipNegativeThrowsIllegalArgumentException() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        try {
            in.skip(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testCloseIsIdempotent() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testReadAfterCloseThrowsIOException() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.close();
        try {
            in.read(new byte[1], 0, 1);
            fail("expected IOException");
        } catch (IOException expected) {
        }
    }

    @Test
    public void testNextEntryAfterCloseReturnsNull() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.close();
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testReadAllowsExactBufferEndRangeWhenNoEntry() throws Exception {
        ZipArchiveInputStream in =
            new ZipArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 1, 0));
    }
}
