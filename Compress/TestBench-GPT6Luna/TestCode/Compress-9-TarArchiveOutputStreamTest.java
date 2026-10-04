package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CountingOutputStream;

public class TarArchiveOutputStreamTest {
    @Test
    public void testInitialCountsAndRecordSize() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        assertEquals(0L, tar.getBytesWritten());
        assertEquals(0, tar.getCount());
        assertEquals(512, tar.getRecordSize());
    }

    @Test
    public void testWriteExactEntrySizeAndFinish() throws Exception {
        java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
        TarArchiveOutputStream tar = new TarArchiveOutputStream(bytes);
        TarArchiveEntry entry = new TarArchiveEntry("a");
        entry.setSize(3);
        tar.putArchiveEntry(entry);
        tar.write(new byte[] {1, 2, 3}, 0, 3);
        tar.closeArchiveEntry();
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testWriteZeroLengthEntry() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("zero");
        entry.setSize(0);
        tar.putArchiveEntry(entry);
        tar.closeArchiveEntry();
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testWriteEntryInSeveralChunks() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("chunks");
        entry.setSize(3);
        tar.putArchiveEntry(entry);
        tar.write(new byte[] {1}, 0, 1);
        tar.write(new byte[] {2, 3}, 0, 2);
        tar.closeArchiveEntry();
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testWriteExactlyOneRecord() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("record");
        entry.setSize(512);
        tar.putArchiveEntry(entry);
        tar.write(new byte[512], 0, 512);
        tar.closeArchiveEntry();
        assertEquals(0L, tar.getBytesWritten());
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testRejectWritePastDeclaredSize() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("limit");
        entry.setSize(1);
        tar.putArchiveEntry(entry);
        try {
            tar.write(new byte[] {1, 2}, 0, 2);
            fail("expected IOException");
        } catch (IOException expected) { }
        tar.write(new byte[] {1}, 0, 1);
        tar.closeArchiveEntry();
        assertEquals(0L, tar.getBytesWritten());
    }

    @Test
    public void testRejectClosingShortEntry() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("short");
        entry.setSize(2);
        tar.putArchiveEntry(entry);
        tar.write(new byte[] {1}, 0, 1);
        try {
            tar.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) { }
        assertEquals(0L, tar.getBytesWritten());
    }

    @Test
    public void testRejectClosingWithoutEntry() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        try {
            tar.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) { }
        assertEquals(0L, tar.getBytesWritten());
    }

    @Test
    public void testLongNameAtLimitWithDefaultMode() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry(repeat('n', 100));
        try {
            tar.putArchiveEntry(entry);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) { }
        assertEquals(0L, tar.getBytesWritten());
    }

    @Test
    public void testLongNameTruncateMode() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(repeat('n', 100));
        entry.setSize(0);
        tar.putArchiveEntry(entry);
        tar.closeArchiveEntry();
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testLongNameGnuMode() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(repeat('n', 100));
        entry.setSize(0);
        tar.putArchiveEntry(entry);
        tar.closeArchiveEntry();
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testSetLongFileModeBackToError() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        try {
            tar.putArchiveEntry(new TarArchiveEntry(repeat('x', 100)));
            fail("expected RuntimeException");
        } catch (RuntimeException expected) { }
        assertEquals(0L, tar.getBytesWritten());
    }

    @Test
    public void testFinishRejectsUnclosedEntry() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("open");
        entry.setSize(0);
        tar.putArchiveEntry(entry);
        try {
            tar.finish();
            fail("expected IOException");
        } catch (IOException expected) { }
        tar.closeArchiveEntry();
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testFinishCanOnlyBeCalledOnce() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.finish();
        try {
            tar.finish();
            fail("expected IOException");
        } catch (IOException expected) { }
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testEntryCannotBeAddedAfterFinish() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.finish();
        try {
            tar.putArchiveEntry(new TarArchiveEntry("late"));
            fail("expected IOException");
        } catch (IOException expected) { }
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testCreateArchiveEntryBeforeFinish() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        ArchiveEntry entry = tar.createArchiveEntry(new File("x"), "entry");
        assertEquals("entry", entry.getName());
        assertEquals(0L, tar.getBytesWritten());
    }

    @Test
    public void testCreateArchiveEntryAfterFinish() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.finish();
        try {
            tar.createArchiveEntry(new File("x"), "entry");
            fail("expected IOException");
        } catch (IOException expected) { }
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testFlushDoesNotFinishArchive() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.flush();
        assertEquals(0L, tar.getBytesWritten());
    }

    @Test
    public void testCloseFinishesArchive() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        tar.close();
        assertEquals(10240L, tar.getBytesWritten());
    }

    @Test
    public void testDirectorySizeIsTreatedAsZero() throws Exception {
        TarArchiveOutputStream tar = new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry directory = new TarArchiveEntry("dir/");
        directory.setSize(12);
        tar.putArchiveEntry(directory);
        tar.closeArchiveEntry();
        tar.finish();
        assertEquals(10240L, tar.getBytesWritten());
    }

    private static String repeat(char c, int count) {
        StringBuilder value = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            value.append(c);
        }
        return value.toString();
    }
}
