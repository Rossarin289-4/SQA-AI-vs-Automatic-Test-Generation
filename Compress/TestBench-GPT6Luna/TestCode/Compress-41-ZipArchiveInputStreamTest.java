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
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveInputStreamTest {

    private byte[] localStoredZip(String name, byte[] data) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CRC32 crc = new CRC32();
        crc.update(data);
        writeInt(out, 0x04034b50);
        writeShort(out, 20);
        writeShort(out, 0);
        writeShort(out, ZipEntry.STORED);
        writeInt(out, 0);
        writeInt(out, crc.getValue());
        writeInt(out, data.length);
        writeInt(out, data.length);
        byte[] nameBytes = name.getBytes("UTF-8");
        writeShort(out, nameBytes.length);
        writeShort(out, 0);
        out.write(nameBytes);
        out.write(data);
        return out.toByteArray();
    }

    private byte[] localUnknownMethodZip() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeInt(out, 0x04034b50);
        writeShort(out, 20);
        writeShort(out, 0);
        writeShort(out, 99);
        writeInt(out, 0);
        writeInt(out, 0);
        writeInt(out, 0);
        writeInt(out, 0);
        writeShort(out, 1);
        writeShort(out, 0);
        out.write('x');
        return out.toByteArray();
    }

    private void writeShort(ByteArrayOutputStream out, int value) {
        out.write(value & 255);
        out.write((value >>> 8) & 255);
    }

    private void writeInt(ByteArrayOutputStream out, long value) {
        out.write((int) value & 255);
        out.write((int) (value >>> 8) & 255);
        out.write((int) (value >>> 16) & 255);
        out.write((int) (value >>> 24) & 255);
    }

    @Test
    public void testMatchesLocalFileSignatureAtMinimumLength() throws Exception {
        byte[] sig = {0x50, 0x4b, 0x03, 0x04};
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesRejectsLengthBelowMinimum() throws Exception {
        byte[] sig = {0x50, 0x4b, 0x03, 0x04};
        assertFalse(ZipArchiveInputStream.matches(sig, 3));
    }

    @Test
    public void testMatchesEndOfCentralDirectorySignature() throws Exception {
        byte[] sig = {0x50, 0x4b, 0x05, 0x06};
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesSplitArchiveSignatures() throws Exception {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x07, 0x08}, 4));
        assertFalse(ZipArchiveInputStream.matches(new byte[] {0x50, 0x4b, 0x00, 0x00}, 4));
    }

    @Test
    public void testMatchesRejectsUnrecognizedSignature() throws Exception {
        assertFalse(ZipArchiveInputStream.matches(new byte[] {0, 0, 0, 0}, 4));
    }

    @Test
    public void testGetNextZipEntryReadsHeaderAndStoredData() throws Exception {
        byte[] data = {4, 5, 6};
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("a", data)));
        ZipArchiveEntry entry = in.getNextZipEntry();
        assertEquals("a", entry.getName());
        assertEquals(3L, entry.getSize());
        assertEquals(3L, entry.getCompressedSize());
        byte[] result = new byte[3];
        assertEquals(3, in.read(result, 0, result.length));
        assertArrayEquals(data, result);
    }

    @Test
    public void testGetNextEntryReturnsEntryAndThenEndOfInput() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("z", new byte[] {8})));
        ArchiveEntry entry = in.getNextEntry();
        assertEquals("z", entry.getName());
        assertNull(in.getNextEntry());
    }

    @Test
    public void testCanReadEntryDataForSupportedStoredEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("s", new byte[] {1})));
        ZipArchiveEntry entry = in.getNextZipEntry();
        assertTrue(in.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryDataRejectsNonZipArchiveEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ArchiveEntry other = new ZipArchiveEntry("other");
        assertFalse(in.canReadEntryData(other));
    }

    @Test
    public void testReadZeroLengthStoredEntryReturnsEndOfEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("e", new byte[0])));
        in.getNextZipEntry();
        assertEquals(-1, in.read(new byte[1], 0, 1));
    }

    @Test
    public void testReadStoredDataAcrossCalls() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("m", new byte[] {2, 3, 4})));
        in.getNextZipEntry();
        byte[] b = new byte[3];
        assertEquals(1, in.read(b, 0, 1));
        assertEquals(2, b[0]);
        assertEquals(2, in.read(b, 1, 2));
        assertEquals(3, b[1]);
        assertEquals(4, b[2]);
        assertEquals(-1, in.read(b, 0, 1));
    }

    @Test
    public void testReadRejectsNegativeOffset() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("a", new byte[] {1})));
        in.getNextZipEntry();
        try {
            in.read(new byte[1], -1, 1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testReadRejectsRangePastBufferEnd() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("a", new byte[] {1})));
        in.getNextZipEntry();
        try {
            in.read(new byte[1], 0, 2);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testReadUnknownCompressionMethodThrowsUnsupportedFeature() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(localUnknownMethodZip()));
        in.getNextZipEntry();
        try {
            in.read(new byte[1], 0, 1);
            fail("expected UnsupportedZipFeatureException");
        } catch (UnsupportedZipFeatureException expected) {
            assertEquals(99, expected.getEntry().getMethod());
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
            assertNotNull(expected);
        }
    }

    @Test
    public void testSkipStoredEntryAndReadRemainingData() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("k", new byte[] {1, 2, 3})));
        in.getNextZipEntry();
        assertEquals(2L, in.skip(2));
        byte[] b = new byte[2];
        assertEquals(1, in.read(b, 0, b.length));
        assertEquals(3, b[0]);
    }

    @Test
    public void testSkipZeroReturnsZero() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(0));
    }

    @Test
    public void testSkipNegativeThrowsIllegalArgumentException() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.skip(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testSkipStopsAtEndOfStoredEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(
                new ByteArrayInputStream(localStoredZip("q", new byte[] {9, 8})));
        in.getNextZipEntry();
        assertEquals(2L, in.skip(4));
    }

    @Test
    public void testCloseIsIdempotent() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
        assertNull(in.getNextZipEntry());
    }

    @Test
    public void testEmptyInputHasNoNextEntry() throws Exception {
        ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextZipEntry());
    }
}
