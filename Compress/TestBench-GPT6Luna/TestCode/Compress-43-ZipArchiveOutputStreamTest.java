package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveOutputStreamTest {
    @Test
    public void testNonSeekableOutput() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        assertFalse(out.isSeekable());
        out.close();
    }

    @Test
    public void testSeekableOutput() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(
                new org.apache.commons.compress.utils.SeekableInMemoryByteChannel());
        assertTrue(out.isSeekable());
        out.close();
    }

    @Test
    public void testEncodingGetterAndSetter() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        assertEquals("UTF8", out.getEncoding());
        out.setEncoding("US-ASCII");
        assertEquals("US-ASCII", out.getEncoding());
        out.close();
    }

    @Test
    public void testNullEncoding() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.setEncoding(null);
        assertNull(out.getEncoding());
        out.close();
    }

    @Test
    public void testLanguageEncodingFlagConfiguration() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.setUseLanguageEncodingFlag(false);
        out.setUseLanguageEncodingFlag(true);
        assertEquals("UTF8", out.getEncoding());
        out.close();
    }

    @Test
    public void testUnicodeExtraFieldPolicyConfiguration() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        out.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
        assertFalse(out.isSeekable());
        out.close();
    }

    @Test
    public void testFallbackConfiguration() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.setFallbackToUTF8(true);
        out.setFallbackToUTF8(false);
        assertEquals("UTF8", out.getEncoding());
        out.close();
    }

    @Test
    public void testZip64ModeConfiguration() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.setUseZip64(Zip64Mode.Never);
        out.setUseZip64(Zip64Mode.AsNeeded);
        assertFalse(out.isSeekable());
        out.close();
    }

    @Test
    public void testFinishEmptyArchive() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.finish();
        assertTrue(out.finished);
    }

    @Test
    public void testFinishRejectsSecondCall() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.finish();
        try {
            out.finish();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testCloseEntryWithoutCurrentEntry() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        try {
            out.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) { }
        out.close();
    }

    @Test
    public void testDefaultDeflatedEntryCanBeWritten() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        out.putArchiveEntry(entry);
        out.write(new byte[] {1, 2}, 0, 2);
        out.closeArchiveEntry();
        assertEquals(2L, entry.getSize());
        out.close();
    }

    @Test
    public void testRawEntryCopiedAndClosed() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        out.addRawArchiveEntry(entry, new java.io.ByteArrayInputStream(new byte[] {3, 4, 5}));
        assertEquals(3L, entry.getSize());
        out.close();
    }

    @Test
    public void testSetCommentAndFinish() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(bytes);
        out.setComment("ok");
        out.finish();
        assertTrue(bytes.size() > 0);
        out.close();
    }

    @Test
    public void testSetCompressionLevelMinimum() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.setLevel(Deflater.DEFAULT_COMPRESSION);
        assertFalse(out.isSeekable());
        out.close();
    }

    @Test
    public void testSetCompressionLevelMaximum() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.setLevel(Deflater.BEST_COMPRESSION);
        assertFalse(out.isSeekable());
        out.close();
    }

    @Test
    public void testCompressionLevelBelowMinimumRejected() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        try {
            out.setLevel(Deflater.DEFAULT_COMPRESSION - 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        out.close();
    }

    @Test
    public void testCompressionLevelAboveMaximumRejected() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        try {
            out.setLevel(Deflater.BEST_COMPRESSION + 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        out.close();
    }

    @Test
    public void testCanWriteDeflatedEntry() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        assertTrue(out.canWriteEntryData(entry));
        out.close();
    }

    @Test
    public void testCanWriteRejectsNonZipEntry() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        assertFalse(out.canWriteEntryData(null));
        out.close();
    }

    @Test
    public void testWriteWithoutEntryRejected() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        try {
            out.write(new byte[] {1}, 0, 1);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
        out.close();
    }

    @Test
    public void testWriteAfterPutEntry() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.putArchiveEntry(new ZipArchiveEntry("a"));
        out.write(new byte[] {7}, 0, 1);
        out.closeArchiveEntry();
        out.finish();
        assertTrue(out.finished);
    }

    @Test
    public void testFlushAndClose() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.flush();
        out.close();
        assertTrue(out.finished);
    }

    @Test
    public void testCreateArchiveEntry() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ArchiveEntry entry = out.createArchiveEntry(new File("unused"), "name");
        assertEquals("name", entry.getName());
        out.close();
    }

    @Test
    public void testCreateArchiveEntryAfterFinishRejected() throws Exception {
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        out.finish();
        try {
            out.createArchiveEntry(new File("unused"), "name");
            fail("expected IOException");
        } catch (IOException expected) { }
    }
}
