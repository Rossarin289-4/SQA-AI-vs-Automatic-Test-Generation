package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import java.io.EOFException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CharsetNames;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.io.ByteArrayOutputStream;
import java.util.Map.Entry;
import java.io.StringWriter;
import java.util.Date;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class ArchiveStreamFactoryTest {
    @Test
    public void testDefaultEncodingSetter() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertNull(factory.getEntryEncoding());
        factory.setEntryEncoding("UTF-8");
        assertEquals("UTF-8", factory.getEntryEncoding());
        factory.setEntryEncoding(null);
        assertNull(factory.getEntryEncoding());
    }

    @Test
    public void testConstructorEncodingCannotBeOverridden() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        assertEquals("UTF-8", factory.getEntryEncoding());
        try {
            factory.setEntryEncoding("ASCII");
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
        assertEquals("UTF-8", factory.getEntryEncoding());
    }

    @Test
    public void testCreateArInputCaseInsensitive() throws Exception {
        ArchiveInputStream stream = new ArchiveStreamFactory().createArchiveInputStream(
                "AR", new ByteArrayInputStream(new byte[0]));
        assertTrue(stream instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateZipInputWithEncoding() throws Exception {
        ArchiveInputStream stream = new ArchiveStreamFactory("UTF-8")
                .createArchiveInputStream("zip", new ByteArrayInputStream(new byte[0]));
        assertTrue(stream instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateSevenZInputIsUnsupported() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("7z", new ByteArrayInputStream(new byte[0]));
            fail("expected StreamingNotSupportedException");
        } catch (StreamingNotSupportedException expected) { }
    }

    @Test
    public void testCreateUnknownInputIsRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("bad", new ByteArrayInputStream(new byte[0]));
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testCreateNullInputNameIsRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCreateNullInputStreamIsRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("zip", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCreateArOutput() throws Exception {
        ArchiveOutputStream stream = new ArchiveStreamFactory().createArchiveOutputStream(
                "AR", new ByteArrayOutputStream());
        assertTrue(stream instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateZipOutputWithEncoding() throws Exception {
        ArchiveOutputStream stream = new ArchiveStreamFactory("UTF-8")
                .createArchiveOutputStream("zip", new ByteArrayOutputStream());
        assertTrue(stream instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testSevenZOutputIsUnsupported() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("7z", new ByteArrayOutputStream());
            fail("expected StreamingNotSupportedException");
        } catch (StreamingNotSupportedException expected) { }
    }

    @Test
    public void testUnknownOutputIsRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("bad", new ByteArrayOutputStream());
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testNullOutputNameIsRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream(null, new ByteArrayOutputStream());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNullOutputStreamIsRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("zip", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAutodetectRejectsNullAndUnmarkedStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream((InputStream) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        InputStream unmarked = new InputStream() {
            public int read() { return -1; }
        };
        try {
            factory.createArchiveInputStream(unmarked);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAutodetectZipSignature() throws Exception {
        byte[] zip = { 'P', 'K', 3, 4 };
        ArchiveInputStream stream = new ArchiveStreamFactory().createArchiveInputStream(
                new ByteArrayInputStream(zip));
        assertTrue(stream instanceof ZipArchiveInputStream);
    }

    @Test
    public void testAutodetectUnknownSignature() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream(
                    new ByteArrayInputStream(new byte[] { 1, 2, 3, 4 }));
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testCpioMatchesMinimumLength() throws Exception {
        byte[] signature = { '0', '7', '0', '7', '0', '1' };
        assertFalse(CpioArchiveInputStream.matches(signature, 5));
        assertTrue(CpioArchiveInputStream.matches(signature, 6));
    }

    @Test
    public void testCpioMatchesAcceptedAsciiMagicValues() throws Exception {
        assertTrue(CpioArchiveInputStream.matches(new byte[] { '0', '7', '0', '7', '0', '1' }, 6));
        assertTrue(CpioArchiveInputStream.matches(new byte[] { '0', '7', '0', '7', '0', '2' }, 6));
        assertTrue(CpioArchiveInputStream.matches(new byte[] { '0', '7', '0', '7', '0', '7' }, 6));
        assertFalse(CpioArchiveInputStream.matches(new byte[] { '0', '7', '0', '7', '0', '3' }, 6));
    }

    @Test
    public void testCpioMatchesBinaryMagicInBothOrders() throws Exception {
        assertTrue(CpioArchiveInputStream.matches(new byte[] { 0x71, (byte) 0xc7, 0, 0, 0, 0 }, 6));
        assertTrue(CpioArchiveInputStream.matches(new byte[] { (byte) 0xc7, 0x71, 0, 0, 0, 0 }, 6));
    }

    @Test
    public void testDumpMatchesNeedsThirtyTwoBytes() throws Exception {
        byte[] bytes = new byte[512];
        assertFalse(DumpArchiveInputStream.matches(bytes, 31));
        assertFalse(DumpArchiveInputStream.matches(bytes, 32));
    }

    @Test
    public void testTarInputRecordSizeAndMarkSupport() throws Exception {
        TarArchiveInputStream input = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(512, input.getRecordSize());
        assertFalse(input.markSupported());
        input.mark(1);
        input.reset();
        assertNull(input.getNextTarEntry());
    }

    @Test
    public void testTarCanReadEntryOnlyForTarEntries() throws Exception {
        TarArchiveInputStream input = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("file");
        assertTrue(input.canReadEntryData(entry));
        assertFalse(input.canReadEntryData(null));
    }

    @Test
    public void testZipInputReturnsNoEntryForEmptyStream() throws Exception {
        ZipArchiveInputStream input = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(input.getNextZipEntry());
    }

    @Test
    public void testTarOutputRecordSizeAndFinishWritesEndRecords() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        TarArchiveOutputStream output = new TarArchiveOutputStream(bytes);
        assertEquals(512, output.getRecordSize());
        output.finish();
        assertEquals(10240L, output.getBytesWritten());
    }

    @Test
    public void testCpioOutputFinishesEmptyArchive() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        CpioArchiveOutputStream output = new CpioArchiveOutputStream(bytes);
        output.finish();
        assertTrue(output.getBytesWritten() > 0);
    }

    @Test
    public void testCpioAvailableBeforeAndAfterEntryEof() throws Exception {
        CpioArchiveInputStream input = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(1, input.available());
        try {
            input.getNextCPIOEntry();
            fail("expected EOFException");
        } catch (EOFException expected) { }
        input.close();
    }

    @Test
    public void testCpioReadZeroLengthAndNegativeSkip() throws Exception {
        CpioArchiveInputStream input = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0, input.read(new byte[1], 0, 0));
        try {
            input.skip(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCpioGetNextEntryUsesCpioEntryReader() throws Exception {
        CpioArchiveInputStream input = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            input.getNextEntry();
            fail("expected EOFException");
        } catch (EOFException expected) { }
    }

    @Test
    public void testCpioOutputPutWriteAndCloseEntry() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        CpioArchiveOutputStream output = new CpioArchiveOutputStream(bytes);
        CpioArchiveEntry entry = new CpioArchiveEntry("f", 1);
        entry.setMode(0100644);
        output.putArchiveEntry(entry);
        output.write(new byte[] { 7 }, 0, 1);
        output.closeArchiveEntry();
        assertEquals(6L, output.getBytesWritten() - 110L);
    }

    @Test
    public void testCpioOutputRejectsWritingWithoutCurrentEntry() throws Exception {
        CpioArchiveOutputStream output = new CpioArchiveOutputStream(new ByteArrayOutputStream());
        try {
            output.write(new byte[] { 1 }, 0, 1);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testCpioOutputCreateArchiveEntry() throws Exception {
        CpioArchiveOutputStream output = new CpioArchiveOutputStream(new ByteArrayOutputStream());
        ArchiveEntry entry = output.createArchiveEntry(new File("."), "entry");
        assertEquals("entry", entry.getName());
    }

    @Test
    public void testTarCurrentEntryBeforeEntryIsNull() throws Exception {
        TarArchiveInputStream input = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(input.getCurrentEntry());
    }

    @Test
    public void testTarSkipAtEmptyInputReturnsZero() throws Exception {
        TarArchiveInputStream input = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertEquals(0L, input.skip(1));
        assertEquals(0L, input.skip(-1));
    }

    @Test
    public void testTarOutputFlushAndCloseEntryBranches() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        TarArchiveOutputStream output = new TarArchiveOutputStream(bytes);
        output.flush();
        try {
            output.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) { }
        assertEquals(0L, output.getBytesWritten());
    }

    @Test
    public void testTarOutputEntryMustWriteExpectedBytes() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        TarArchiveOutputStream output = new TarArchiveOutputStream(bytes);
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setSize(0);
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        assertEquals(512L, output.getBytesWritten());
    }

    @Test
    public void testTarOutputRejectsWriteWithoutEntry() throws Exception {
        TarArchiveOutputStream output = new TarArchiveOutputStream(new ByteArrayOutputStream());
        try {
            output.write(new byte[] { 1 }, 0, 1);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testTarOutputSetLongFileAndBigNumberModes() throws Exception {
        TarArchiveOutputStream output = new TarArchiveOutputStream(new ByteArrayOutputStream());
        output.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        output.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        output.setAddPaxHeadersForNonAsciiNames(true);
        assertEquals(0L, output.getBytesWritten());
    }

    @Test
    public void testTarOutputCreateArchiveEntry() throws Exception {
        TarArchiveOutputStream output = new TarArchiveOutputStream(new ByteArrayOutputStream());
        ArchiveEntry entry = output.createArchiveEntry(new File("."), "entry");
        assertEquals("entry", entry.getName());
    }

    @Test
    public void testTarOutputWriteAndByteCount() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        TarArchiveOutputStream output = new TarArchiveOutputStream(bytes);
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setSize(1);
        output.putArchiveEntry(entry);
        output.write(new byte[] { 9 }, 0, 1);
        output.closeArchiveEntry();
        assertEquals(1024L, output.getBytesWritten());
    }

    @Test
    public void testCpioOutputCloseFinishesAndCloses() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        CpioArchiveOutputStream output = new CpioArchiveOutputStream(bytes);
        output.close();
        assertEquals(512L, output.getBytesWritten());
    }

    @Test
    public void testCpioOutputCloseEntryRejectsNoEntry() throws Exception {
        CpioArchiveOutputStream output = new CpioArchiveOutputStream(new ByteArrayOutputStream());
        try {
            output.closeArchiveEntry();
            fail("expected IOException");
        } catch (IOException expected) { }
        assertEquals(0L, output.getBytesWritten());
    }

    @Test
    public void testCpioInputCloseAndReadAfterClose() throws Exception {
        CpioArchiveInputStream input = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        input.close();
        try {
            input.available();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testCpioOutputRejectsEntryOverrun() throws Exception {
        CpioArchiveOutputStream output = new CpioArchiveOutputStream(new ByteArrayOutputStream());
        CpioArchiveEntry entry = new CpioArchiveEntry("f", 0);
        entry.setMode(0100644);
        output.putArchiveEntry(entry);
        try {
            output.write(new byte[] { 1 }, 0, 1);
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testTarOutputFinishRejectsUnclosedEntry() throws Exception {
        TarArchiveOutputStream output = new TarArchiveOutputStream(new ByteArrayOutputStream());
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setSize(0);
        output.putArchiveEntry(entry);
        try {
            output.finish();
            fail("expected IOException");
        } catch (IOException expected) { }
    }

    @Test
    public void testTarOutputFinishWritesExpectedBlockAfterEntry() throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        TarArchiveOutputStream output = new TarArchiveOutputStream(bytes);
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setSize(0);
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        output.finish();
        assertEquals(10240L, output.getBytesWritten());
    }
}
