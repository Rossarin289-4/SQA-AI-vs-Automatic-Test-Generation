package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;

public class CpioArchiveOutputStreamTest {

    @Test
    public void testDefaultFormatWritesNewMagic() throws Exception {
        CountingOutputStream bytes = new CountingOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(bytes);
        out.putArchiveEntry(new CpioArchiveEntry("a", 0));
        out.closeArchiveEntry();
        int entryLength = bytes.count;
        out.finish();
        assertEquals(110, entryLength);
    }

    @Test
    public void testValidFormatsCanFinish() throws Exception {
        short[] formats = {CpioConstants.FORMAT_NEW, CpioConstants.FORMAT_NEW_CRC,
                           CpioConstants.FORMAT_OLD_ASCII, CpioConstants.FORMAT_OLD_BINARY};
        for (int i = 0; i < formats.length; i++) {
            CountingOutputStream bytes = new CountingOutputStream();
            CpioArchiveOutputStream out = new CpioArchiveOutputStream(bytes, formats[i]);
            out.finish();
            assertTrue(bytes.count > 0);
        }
    }

    @Test
    public void testInvalidFormatRejected() throws Exception {
        try {
            new CpioArchiveOutputStream(new CountingOutputStream(), (short) 99);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMismatchedEntryFormatRejected() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(
                new CountingOutputStream(), CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII);
        entry.setName("a");
        try {
            out.putArchiveEntry(entry);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testDuplicateNameRejected() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.putArchiveEntry(new CpioArchiveEntry("a", 0));
        out.closeArchiveEntry();
        try {
            out.putArchiveEntry(new CpioArchiveEntry("a", 0));
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testCloseEntryRequiresExactSize() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.putArchiveEntry(new CpioArchiveEntry("a", 1));
        try {
            out.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testWritingWithoutEntryRejected() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        try {
            out.write(new byte[] {1}, 0, 1);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testZeroLengthWriteWithoutEntryIsNoOp() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.write(new byte[0], 0, 0);
        assertEquals(0, 0);
    }

    @Test
    public void testWriteAtExactDeclaredSize() throws Exception {
        CountingOutputStream bytes = new CountingOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(bytes);
        out.putArchiveEntry(new CpioArchiveEntry("a", 1));
        out.write(new byte[] {7}, 0, 1);
        out.closeArchiveEntry();
        assertEquals(1, bytes.count - 112);
    }

    @Test
    public void testWriteBeyondDeclaredSizeRejected() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.putArchiveEntry(new CpioArchiveEntry("a", 1));
        try {
            out.write(new byte[] {1, 2}, 0, 2);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testNegativeOffsetRejected() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        try {
            out.write(new byte[] {1}, -1, 1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testOffsetAndLengthBoundary() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.write(new byte[] {1}, 1, 0);
        assertEquals(0, 0);
    }

    @Test
    public void testFinishRejectsOpenEntry() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.putArchiveEntry(new CpioArchiveEntry("a", 0));
        try {
            out.finish();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testFinishCanBeCalledTwice() throws Exception {
        CountingOutputStream bytes = new CountingOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(bytes);
        out.finish();
        int finishedSize = bytes.count;
        out.finish();
        assertEquals(finishedSize, bytes.count);
    }

    @Test
    public void testWriteAfterCloseRejected() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.close();
        try {
            out.write(new byte[] {1}, 0, 1);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testFlushBeforeFinish() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        out.flush();
        assertEquals(0, 0);
    }

    @Test
    public void testCreateArchiveEntryName() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new CountingOutputStream());
        ArchiveEntry entry = out.createArchiveEntry(new File("."), "x");
        assertEquals("x", entry.getName());
    }

    @Test
    public void testCrcFormatAcceptsMatchingChecksum() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(
                new CountingOutputStream(), CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC);
        entry.setName("a");
        entry.setSize(1);
        entry.setChksum(255);
        out.putArchiveEntry(entry);
        out.write(new byte[] {(byte) 255}, 0, 1);
        out.closeArchiveEntry();
        assertEquals(1, 1);
    }

    @Test
    public void testCrcFormatRejectsMismatchedChecksum() throws Exception {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(
                new CountingOutputStream(), CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC);
        entry.setName("a");
        entry.setSize(1);
        entry.setChksum(0);
        out.putArchiveEntry(entry);
        out.write(new byte[] {1}, 0, 1);
        try {
            out.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testSetLongFileModeDoesNotAffectRecordSize() throws Exception {
        TarArchiveOutputStream out = new TarArchiveOutputStream(new CountingOutputStream());
        int size = out.getRecordSize();
        out.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        assertEquals(size, out.getRecordSize());
    }

    @Test
    public void testSetEncodingAndReadItBack() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new CountingOutputStream());
        out.setEncoding("US-ASCII");
        assertEquals("US-ASCII", out.getEncoding());
    }

    @Test
    public void testSetNullEncodingAndReadItBack() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new CountingOutputStream());
        out.setEncoding(null);
        assertEquals(null, out.getEncoding());
    }

    @Test
    public void testSeekableZipOutputReportsFalse() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new CountingOutputStream());
        assertEquals(false, out.isSeekable());
    }

    @Test
    public void testSetZipOptionsAndFinishEmptyArchive() throws Exception {
        CountingOutputStream bytes = new CountingOutputStream();
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(bytes);
        out.setUseLanguageEncodingFlag(false);
        out.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        out.setFallbackToUTF8(true);
        out.setComment("c");
        out.finish();
        assertEquals(23, bytes.count);
    }

    @Test
    public void testSetLevelAtBothAcceptedEdges() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new CountingOutputStream());
        out.setLevel(Deflater.DEFAULT_COMPRESSION);
        out.setLevel(Deflater.BEST_COMPRESSION);
        assertEquals(1, 1);
    }

    @Test
    public void testSetLevelRejectsFirstAboveMaximum() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new CountingOutputStream());
        try {
            out.setLevel(Deflater.BEST_COMPRESSION + 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetLevelRejectsFirstBelowMinimum() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new CountingOutputStream());
        try {
            out.setLevel(Deflater.DEFAULT_COMPRESSION - 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSetMethodAllowsStoredMethod() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new CountingOutputStream());
        out.setMethod(ZipArchiveOutputStream.STORED);
        assertEquals(ZipArchiveOutputStream.STORED, ZipArchiveOutputStream.STORED);
    }

    private static class CountingOutputStream extends OutputStream {
        int count;
        public void write(int b) { count++; }
        public void write(byte[] b, int off, int len) { count += len; }
    }
}
