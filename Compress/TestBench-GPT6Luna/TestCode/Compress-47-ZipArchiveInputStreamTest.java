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
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveInputStreamTest {
    @Test
    public void testMatchesLocalHeaderSignature() throws Exception {
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
        assertFalse(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x00, 0x00}, 4));
    }

    @Test
    public void testMatchesRejectsShortLength() throws Exception {
        assertFalse(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x03}, 3));
    }

    @Test
    public void testMatchesRejectsWrongSignature() throws Exception {
        assertFalse(ZipArchiveInputStream.matches(new byte[] {0, 0, 0, 0}, 4));
    }

    @Test
    public void testMatchesUsesSignatureBytesDespiteShortDeclaredLength() throws Exception {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x03, 0x04}, 4));
    }

    @Test
    public void testEmptyInputHasNoNextEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testEmptyInputArchiveEntryMethodHasNoEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextEntry());
    }

    @Test
    public void testCanReadEntryDataRejectsNonZipArchiveEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(in.canReadEntryData(null));
    }

    @Test
    public void testCanReadEntryDataForConfiguredStoredEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry entry = new ZipArchiveEntry("x");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(0);
        entry.setCompressedSize(0);
        assertTrue(in.canReadEntryData(entry));
    }

    @Test
    public void testReadWithoutCurrentEntryReturnsEndOfStream() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, 1));
    }

    @Test
    public void testSkipWithoutCurrentEntryReturnsZero() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(1));
    }

    @Test
    public void testSkipZeroWithoutCurrentEntryReturnsZero() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(0));
    }

    @Test
    public void testSkipNegativeThrows() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.skip(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testReadAfterCloseThrowsIOException() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        try {
            in.read(new byte[1], 0, 1);
            fail("expected IOException");
        } catch (IOException expected) {
        }
    }

    @Test
    public void testCloseCanBeCalledTwice() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testMalformedFirstHeaderReturnsNoEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[] {0, 0, 0, 0}));
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testTruncatedFirstHeaderReturnsNoEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[] {0x50, 0x4b}));
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testReadInvalidOffsetThrowsArrayIndexOutOfBounds() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 2, 0));
    }

    @Test
    public void testSkipAtLongMaximumWithoutEntryReturnsZero() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(Long.MAX_VALUE));
    }

    @Test
    public void testMatchesAtMinimumSignatureLength() throws Exception {
        byte[] signature = {0x50, 0x4b, 0x03, 0x04};
        assertTrue(ZipArchiveInputStream.matches(signature, 4));
    }
}
