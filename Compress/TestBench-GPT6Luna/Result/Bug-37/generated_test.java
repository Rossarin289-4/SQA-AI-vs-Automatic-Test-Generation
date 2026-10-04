package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.IOUtils;

public class TarArchiveInputStreamTest {
    @Test
    public void testDefaultRecordSize() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, in.getRecordSize());
    }

    @Test
    public void testConfiguredRecordSize() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 1024, 128);
        assertEquals(128, in.getRecordSize());
    }

    @Test
    public void testMarkUnsupported() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertFalse(in.markSupported());
    }

    @Test
    public void testMarkAndResetAreNoOps() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.mark(10);
        in.reset();
        assertFalse(in.markSupported());
    }

    @Test
    public void testEmptyStreamHasNoEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextTarEntry());
        assertNull(in.getCurrentEntry());
    }

    @Test
    public void testReadAfterEndOfArchive() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextEntry());
        assertEquals(-1, in.read(new byte[1], 0, 1));
    }

    @Test
    public void testCanReadRejectsNonTarEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertFalse(in.canReadEntryData(null));
    }

    @Test
    public void testCanReadRegularEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("file");
        assertTrue(in.canReadEntryData(entry));
    }

    @Test
    public void testAvailableWithoutCurrentEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.available());
    }

    @Test
    public void testSkipWithoutCurrentEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(1));
    }

    @Test
    public void testNegativeSkipWithoutCurrentEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(-1));
    }

    @Test
    public void testCloseClosesUnderlyingStream() throws Exception {
        final boolean[] closed = new boolean[1];
        InputStream source = new InputStream() {
            public int read() { return -1; }
            public void close() { closed[0] = true; }
        };
        TarArchiveInputStream in = new TarArchiveInputStream(source);
        in.close();
        assertTrue(closed[0]);
    }

    @Test
    public void testMatchesRejectsShortSignature() throws Exception {
        assertFalse(TarArchiveInputStream.matches(new byte[10], 10));
    }

    @Test
    public void testMatchesRejectsZeroFilledSignature() throws Exception {
        assertFalse(TarArchiveInputStream.matches(new byte[512], 512));
    }

    @Test
    public void testMatchesRejectsNegativeLength() throws Exception {
        assertFalse(TarArchiveInputStream.matches(new byte[512], -1));
    }

    @Test
    public void testReadRecordSizeAtRecordBoundary() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 512, 24);
        assertEquals(24, in.getRecordSize());
    }

    @Test
    public void testGetNextEntryEmptyInput() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextEntry());
    }

    @Test
    public void testAvailableAfterEndOfArchive() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.getNextTarEntry();
        assertEquals(0, in.available());
    }
}
