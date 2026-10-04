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
    public void testRecordSize() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 512, 128);
        assertEquals(128, in.getRecordSize());
    }

    @Test
    public void testAvailableBeforeEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.available());
    }

    @Test
    public void testSkipBeforeEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(1));
    }

    @Test
    public void testSkipNegative() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(-1));
    }

    @Test
    public void testResetDoesNotThrow() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.reset();
        assertEquals(0, in.available());
    }

    @Test
    public void testEmptyArchiveHasNoNextTarEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextTarEntry());
    }

    @Test
    public void testEmptyArchiveHasNoNextEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextEntry());
    }

    @Test
    public void testEmptyArchiveReadReturnsEnd() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, 1));
    }

    @Test
    public void testCurrentEntryInitiallyNull() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getCurrentEntry());
    }

    @Test
    public void testCannotReadNonTarEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        ArchiveEntry entry = new ArchiveEntry() {
            public String getName() { return "x"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() { return new java.util.Date(0); }
        };
        assertFalse(in.canReadEntryData(entry));
    }

    @Test
    public void testCanReadOrdinaryTarEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("x");
        assertTrue(in.canReadEntryData(entry));
    }

    @Test
    public void testMatchesTooShortSignature() throws Exception {
        assertFalse(TarArchiveInputStream.matches(new byte[8], 8));
    }

    @Test
    public void testMatchesEmptySignature() throws Exception {
        assertFalse(TarArchiveInputStream.matches(new byte[0], 0));
    }

    @Test
    public void testCloseClosesUnderlyingStream() throws Exception {
        final boolean[] closed = new boolean[1];
        InputStream input = new java.io.ByteArrayInputStream(new byte[0]) {
            @Override
            public void close() throws IOException {
                closed[0] = true;
            }
        };
        TarArchiveInputStream in = new TarArchiveInputStream(input);
        in.close();
        assertTrue(closed[0]);
    }
}
