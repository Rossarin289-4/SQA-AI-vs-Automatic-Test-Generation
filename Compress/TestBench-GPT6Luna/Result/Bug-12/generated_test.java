package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;

public class TarArchiveInputStreamTest {
    @Test
    public void testRecordSizeDefault() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(512, in.getRecordSize());
        in.close();
    }

    @Test
    public void testRecordSizeCustom() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 1024, 256);
        assertEquals(256, in.getRecordSize());
        in.close();
    }

    @Test
    public void testAvailableInitially() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.available());
        in.close();
    }

    @Test
    public void testNegativeSkip() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(-1));
        in.close();
    }

    @Test
    public void testZeroSkip() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(0));
        in.close();
    }

    @Test
    public void testResetDoesNotThrow() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.reset();
        assertEquals(0, in.available());
        in.close();
    }

    @Test
    public void testEmptyArchiveHasNoNextEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextTarEntry());
        in.close();
    }

    @Test
    public void testEmptyArchiveNextEntryAlias() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertNull(in.getNextEntry());
        in.close();
    }

    @Test
    public void testReadWithoutCurrentEntryReturnsEof() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, in.read(new byte[1], 0, 1));
        in.close();
    }

    @Test
    public void testCanReadNullEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertFalse(in.canReadEntryData(null));
        in.close();
    }

    @Test
    public void testCanReadNonTarEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        ArchiveEntry entry = new ArchiveEntry() {
            public String getName() { return "entry"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() { return new java.util.Date(0); }
        };
        assertFalse(in.canReadEntryData(entry));
        in.close();
    }

    @Test
    public void testCanReadOrdinaryTarEntry() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("entry");
        assertTrue(in.canReadEntryData(entry));
        in.close();
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
    public void testCloseEmptyStream() throws Exception {
        TarArchiveInputStream in = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.close();
        assertEquals(512, in.getRecordSize());
    }
}
