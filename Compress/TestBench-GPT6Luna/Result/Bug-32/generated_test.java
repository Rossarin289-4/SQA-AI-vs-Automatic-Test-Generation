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
    public void testRecordSizeConstructorValue() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]), 512, 128);
        assertEquals(128, in.getRecordSize());
    }

    @Test
    public void testDefaultRecordSize() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(TarConstants.DEFAULT_RCDSIZE, in.getRecordSize());
    }

    @Test
    public void testInitialAvailableIsZero() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.available());
    }

    @Test
    public void testSkipNonpositiveValues() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(0));
        assertEquals(0L, in.skip(-1));
    }

    @Test
    public void testMarkNotSupported() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertFalse(in.markSupported());
    }

    @Test
    public void testMarkAndResetDoNotAlterEmptyStream() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        in.mark(1);
        in.reset();
        assertEquals(0, in.available());
    }

    @Test
    public void testNextEntryAtEmptyInput() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextTarEntry());
    }

    @Test
    public void testGenericNextEntryAtEmptyInput() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        ArchiveEntry entry = in.getNextEntry();
        assertNull(entry);
    }

    @Test
    public void testReadAtEmptyInput() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, 1));
    }

    @Test
    public void testCanReadTarEntryData() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("file");
        assertTrue(in.canReadEntryData(entry));
    }

    @Test
    public void testCannotReadNonTarEntryData() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        ArchiveEntry entry = new ArchiveEntry() {
            public String getName() { return "entry"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() {
                return new java.util.Date(0);
            }
        };
        assertFalse(in.canReadEntryData(entry));
    }

    @Test
    public void testCurrentEntryInitiallyNull() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(
                new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getCurrentEntry());
    }

    @Test
    public void testMatchesRejectsTooShortLength() throws Exception {
        assertFalse(TarArchiveInputStream.matches(new byte[16], 0));
    }

    @Test
    public void testMatchesRejectsNonTarSignature() throws Exception {
        assertFalse(TarArchiveInputStream.matches(new byte[512], 512));
    }

    @Test
    public void testMatchesRejectsLengthJustBelowRequiredVersion() throws Exception {
        int required = TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN;
        assertFalse(TarArchiveInputStream.matches(new byte[512], required - 1));
    }

    @Test
    public void testMatchesAcceptsPosixSignature() throws Exception {
        byte[] signature = new byte[512];
        byte[] magic = ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_POSIX);
        byte[] version = ArchiveUtils.toAsciiBytes(TarConstants.VERSION_POSIX);
        System.arraycopy(magic, 0, signature, TarConstants.MAGIC_OFFSET, magic.length);
        System.arraycopy(version, 0, signature, TarConstants.VERSION_OFFSET, version.length);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testCloseClosesUnderlyingStream() throws Exception {
        final boolean[] closed = new boolean[1];
        InputStream input = new InputStream() {
            public int read() { return -1; }
            public void close() { closed[0] = true; }
        };
        TarArchiveInputStream in = new TarArchiveInputStream(input);
        in.close();
        assertTrue(closed[0]);
    }
}
