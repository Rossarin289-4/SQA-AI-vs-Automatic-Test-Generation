package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveInputStreamTest {
    @Test
    public void testMatchesLocalHeader() throws Exception {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x03, 0x04}, 4));
    }

    @Test
    public void testMatchesEmptyArchiveSignature() throws Exception {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x05, 0x06}, 4));
    }

    @Test
    public void testMatchesSplitArchiveSignature() throws Exception {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x07, 0x08}, 4));
    }

    @Test
    public void testMatchesSingleSegmentMarker() throws Exception {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x07, 0x08}, 4));
    }

    @Test
    public void testMatchesRejectsShortLength() throws Exception {
        assertFalse(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x03, 0x04}, 3));
    }

    @Test
    public void testMatchesRejectsUnknownSignature() throws Exception {
        assertFalse(ZipArchiveInputStream.matches(new byte[] {0, 0, 0, 0}, 4));
    }

    @Test
    public void testMatchesUsesOnlySignaturePrefix() throws Exception {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x03, 0x04, 0}, 5));
    }

    @Test
    public void testEmptyInputHasNoNextEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testEmptyInputGetNextEntryIsNull() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextEntry());
    }

    @Test
    public void testEmptyStreamReadReturnsEndOfStream() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, 1));
    }

    @Test
    public void testEmptyStreamSkipReturnsZero() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(1));
    }

    @Test
    public void testSkipZeroReturnsZero() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(0));
    }

    @Test
    public void testNegativeSkipThrows() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.skip(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testCanReadRejectsNonZipArchiveEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ArchiveEntry entry = new ArchiveEntry() {
            public String getName() { return "x"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() { return new java.util.Date(0); }
        };
        assertFalse(in.canReadEntryData(entry));
    }

    @Test
    public void testClosedStreamReadThrows() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        try {
            in.read(new byte[1], 0, 1);
            fail("expected IOException");
        } catch (IOException expected) {
        }
    }

    @Test
    public void testClosedStreamHasNoNextEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testCloseMayBeCalledTwice() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
        assertNull(in.getNextEntry());
    }

    @Test
    public void testReadRejectsNegativeLength() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.read(new byte[1], 0, -1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testReadRejectsOffsetPastBuffer() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.read(new byte[1], 2, 0);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
        }
    }
}
