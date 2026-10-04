package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.CountingOutputStream;

public class TarArchiveOutputStreamTest {

    @Test
    public void testRecordSize() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        assertEquals(512, stream.getRecordSize());
    }

    @Test
    public void testEmptyStreamCanFinishAndWritesTwoRecords() throws Exception {
        java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
        TarArchiveOutputStream stream = new TarArchiveOutputStream(bytes);
        stream.finish();
        assertEquals(10240L, stream.getBytesWritten());
        assertEquals(10240, bytes.size());
    }

    @Test
    public void testFinishIsNotRepeatable() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.finish();
        try {
            stream.finish();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(10240L, stream.getBytesWritten());
        }
    }

    @Test
    public void testFinishRejectsAnUnclosedEntry() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        try {
            stream.finish();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(0L, stream.getBytesWritten());
        }
    }

    @Test
    public void testCloseArchiveEntryRejectsMissingEntry() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        try {
            stream.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(0L, stream.getBytesWritten());
        }
    }

    @Test
    public void testCloseEntryRejectsIncompleteContent() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(1);
        stream.putArchiveEntry(entry);
        try {
            stream.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(0L, stream.getBytesWritten());
        }
    }

    @Test
    public void testWritePastDeclaredSizeIsRejected() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(1);
        stream.putArchiveEntry(entry);
        try {
            stream.write(new byte[] {1, 2}, 0, 2);
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(0L, stream.getBytesWritten());
        }
    }

    @Test
    public void testWritesExactlyDeclaredSizeAndClosesEntry() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(1);
        stream.putArchiveEntry(entry);
        stream.write(new byte[] {7}, 0, 1);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testWriteZeroBytesDoesNotOverrunEmptyEntry() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.write(new byte[0], 0, 0);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testFragmentedWritesArePaddedOnEntryClose() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(3);
        stream.putArchiveEntry(entry);
        stream.write(new byte[] {1}, 0, 1);
        stream.write(new byte[] {2, 3}, 0, 2);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testFullRecordWriteCountsHeaderAndData() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(512);
        stream.putArchiveEntry(entry);
        stream.write(new byte[512], 0, 512);
        assertEquals(0L, stream.getBytesWritten());
        stream.closeArchiveEntry();
    }

    @Test
    public void testRecordBoundaryWriteCountsOnlyCompletedRecord() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(513);
        stream.putArchiveEntry(entry);
        stream.write(new byte[512], 0, 512);
        assertEquals(0L, stream.getBytesWritten());
        stream.write(new byte[1], 0, 1);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testGetCountMatchesBytesWrittenWhileWithinIntRange() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.finish();
        assertEquals(10240, stream.getCount());
        assertEquals(10240L, stream.getBytesWritten());
    }

    @Test
    public void testCreateArchiveEntryUsesRequestedName() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        ArchiveEntry entry = stream.createArchiveEntry(new File("unused"), "chosen");
        assertEquals("chosen", entry.getName());
    }

    @Test
    public void testCreateArchiveEntryRejectedAfterFinish() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.finish();
        try {
            stream.createArchiveEntry(new File("unused"), "chosen");
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(10240L, stream.getBytesWritten());
        }
    }

    @Test
    public void testPutEntryRejectedAfterFinish() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.finish();
        try {
            stream.putArchiveEntry(new TarArchiveEntry("x"));
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals(10240L, stream.getBytesWritten());
        }
    }

    @Test
    public void testCloseFinishesEmptyArchive() throws Exception {
        java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
        TarArchiveOutputStream stream = new TarArchiveOutputStream(bytes);
        stream.close();
        assertEquals(10240L, stream.getBytesWritten());
        assertEquals(10240, bytes.size());
    }

    @Test
    public void testLongFileModeTruncateAcceptsNameAtLimit() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry("1234567890123456789012345678901");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testLongFileModeErrorRejectsNameOverLimit() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("12345678901234567890123456789012");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testLongFileModePosixWritesPaxPathRecord() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("12345678901234567890123456789012");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testLongFileModeGnuWritesLongLinkAndEntry() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry("12345678901234567890123456789012");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testBigNumberStarModeAcceptsZeroSize() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testBigNumberPosixModeAcceptsZeroSize() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testBigNumberErrorModeAcceptsZeroSize() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("x");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testFlushDoesNotAddBytes() throws Exception {
        java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
        TarArchiveOutputStream stream = new TarArchiveOutputStream(bytes);
        stream.flush();
        assertEquals(0L, stream.getBytesWritten());
        assertEquals(0, bytes.size());
    }

    @Test
    public void testNonAsciiNamePaxOptionAddsHeader() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        stream.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("é");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }

    @Test
    public void testNonAsciiNamePaxOptionDisabledOmitsHeader() throws Exception {
        TarArchiveOutputStream stream =
                new TarArchiveOutputStream(new java.io.ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("é");
        entry.setSize(0);
        stream.putArchiveEntry(entry);
        stream.closeArchiveEntry();
        assertEquals(0L, stream.getBytesWritten());
    }
}
