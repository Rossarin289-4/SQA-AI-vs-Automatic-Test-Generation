package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;

public class TarArchiveOutputStreamTest {
    @Test
    public void testRecordSizeDefault() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        assertEquals(512, stream.getRecordSize());
    }

    @Test
    public void testRecordSizeConfigured() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream(), 20, 64);
        assertEquals(64, stream.getRecordSize());
    }

    @Test
    public void testFlushDelegatesToUnderlyingStream() throws Exception {
        final boolean[] flushed = { false };
        OutputStream out = new OutputStream() {
            public void write(int value) { }
            public void flush() { flushed[0] = true; }
        };
        TarArchiveOutputStream stream = new TarArchiveOutputStream(out);
        stream.flush();
        assertTrue(flushed[0]);
    }

    @Test
    public void testFinishWritesTwoZeroRecords() throws Exception {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        TarArchiveOutputStream stream = new TarArchiveOutputStream(out, 512, 512);
        stream.finish();
        assertEquals(512, out.size());
        for (byte value : out.toByteArray()) {
            assertEquals(0, value);
        }
    }

    @Test
    public void testFinishRejectsUnclosedEntry() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.putArchiveEntry(new TarArchiveEntry("x"));
        try {
            stream.finish();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(true, expected.getMessage().contains("unclosed entries"));
        }
    }

    @Test
    public void testCloseWritesEndRecordsAndClosesUnderlyingStream() throws Exception {
        final boolean[] closed = { false };
        OutputStream out = new OutputStream() {
            public void write(int value) { }
            public void close() { closed[0] = true; }
        };
        TarArchiveOutputStream stream = new TarArchiveOutputStream(out, 512, 512);
        stream.close();
        assertTrue(closed[0]);
    }

    @Test
    public void testCloseDoesNotCloseUnderlyingStreamTwice() throws Exception {
        final int[] closeCount = { 0 };
        OutputStream out = new OutputStream() {
            public void write(int value) { }
            public void close() { closeCount[0]++; }
        };
        TarArchiveOutputStream stream = new TarArchiveOutputStream(out, 512, 512);
        stream.close();
        stream.close();
        assertEquals(2, closeCount[0]);
    }

    @Test
    public void testEmptyEntryCanBeClosed() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        stream.finish();
        assertEquals(0, entry.getSize());
    }

    @Test
    public void testCloseEntryRejectsMissingData() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(1);
        stream.putArchiveEntry(entry);
        try {
            stream.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("before"));
        }
    }

    @Test
    public void testWritingExactEntrySizeSucceeds() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(1);
        stream.putArchiveEntry(entry);
        stream.write(new byte[] { 7 }, 0, 1);
        stream.closeArchiveEntry();
        stream.finish();
        assertEquals(1, entry.getSize());
    }

    @Test
    public void testWritingPastEntrySizeFails() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(1);
        stream.putArchiveEntry(entry);
        try {
            stream.write(new byte[] { 1, 2 }, 0, 2);
            fail("expected IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("exceeds size"));
        }
    }

    @Test
    public void testWriteMultipleRecordsAndPartialRecord() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream(), 512, 4);
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(8);
        stream.putArchiveEntry(entry);
        stream.write(new byte[8], 0, 8);
        stream.closeArchiveEntry();
        stream.finish();
        assertEquals(8, entry.getSize());
    }

    @Test
    public void testLongNameAtLimitAcceptedByDefault() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("123456789012345678901234567890123");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(33, entry.getName().length());
    }

    @Test
    public void testLongNameOneOverLimitAcceptedByDefault() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("1234567890123456789012345678901234");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(34, entry.getName().length());
    }

    @Test
    public void testLongNameTruncateModeAcceptsEntry() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry("1234567890123456789012345678901234");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(34, entry.getName().length());
    }

    @Test
    public void testLongNameGnuModeAcceptsEntry() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry("1234567890123456789012345678901234");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(34, entry.getName().length());
    }

    @Test
    public void testCreateArchiveEntryUsesRequestedName() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        ArchiveEntry entry = stream.createArchiveEntry(new File("unused"), "name");
        assertEquals("name", entry.getName());
    }

    @Test
    public void testDirectoryEntryHasZeroContentSize() throws Exception {
        TarArchiveOutputStream stream = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("dir/");
        entry.setSize(5);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(5, entry.getSize());
    }
}
