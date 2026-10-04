package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.List;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CountingOutputStream;

public class SevenZOutputFileTest {
    @Test
    public void testCreateArchiveEntryCopiesNameAndFileMetadata() throws Exception {
        File input = new File(".");
        SevenZOutputFile output = new SevenZOutputFile(new File("seven-test.tmp"));
        try {
            SevenZArchiveEntry entry = output.createArchiveEntry(input, "entry");
            assertEquals("entry", entry.getName());
            assertEquals(input.isDirectory(), entry.isDirectory());
            assertEquals(input.lastModified(), entry.getLastModifiedDate().getTime());
        } finally {
            output.close();
        }
    }

    @Test
    public void testFinishWritesSignatureAndVersion() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.finish();
        output.close();
        RandomAccessFile input = new RandomAccessFile(file, "r");
        try {
            byte[] signature = new byte[6];
            input.readFully(signature);
            assertEquals(0x37, signature[0] & 0xff);
            assertEquals(0x7a, signature[1] & 0xff);
            assertEquals(0xbc, signature[2] & 0xff);
            assertEquals(0x02, signature[5] & 0xff);
        } finally {
            input.close();
            file.delete();
        }
    }

    @Test
    public void testFinishProducesNonemptyArchiveHeader() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.finish();
        output.close();
        assertTrue(file.length() > 32);
        file.delete();
    }

    @Test
    public void testFinishCannotBeCalledTwice() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.finish();
        try {
            output.finish();
            fail("expected IOException");
        } catch (IOException expected) {
            assertTrue(true);
        } finally {
            output.close();
            file.delete();
        }
    }

    @Test
    public void testCloseFinishesArchive() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.close();
        assertTrue(file.length() > 0);
        file.delete();
    }

    @Test
    public void testSetContentCompressionAcceptsCopy() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.setContentCompression(SevenZMethod.COPY);
        output.finish();
        output.close();
        assertTrue(file.length() > 0);
        file.delete();
    }

    @Test
    public void testAddEmptyEntryAndFinish() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("empty");
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        output.finish();
        output.close();
        assertTrue(file.length() > 0);
        file.delete();
    }

    @Test
    public void testEmptyEntryHasNoStreamAndZeroSize() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("empty");
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        assertFalse(entry.hasStream());
        assertEquals(0L, entry.getSize());
        output.close();
        file.delete();
    }

    @Test
    public void testWriteOneByteRecordsEntryContent() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.setContentCompression(SevenZMethod.COPY);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("one");
        output.putArchiveEntry(entry);
        output.write(65);
        output.closeArchiveEntry();
        assertTrue(entry.hasStream());
        assertEquals(1L, entry.getSize());
        assertEquals(1L, entry.getCompressedSize());
        output.close();
        file.delete();
    }

    @Test
    public void testWriteByteArrayAndFinish() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.setContentCompression(SevenZMethod.COPY);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("bytes");
        output.putArchiveEntry(entry);
        output.write(new byte[] { 1, 2, 3 });
        output.closeArchiveEntry();
        assertEquals(3L, entry.getSize());
        assertEquals(3L, entry.getCompressedSize());
        output.close();
        file.delete();
    }

    @Test
    public void testZeroLengthWriteDoesNotCreateStream() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("zero");
        output.putArchiveEntry(entry);
        output.write(new byte[] { 1 }, 0, 0);
        output.closeArchiveEntry();
        assertFalse(entry.hasStream());
        assertEquals(0L, entry.getSize());
        output.close();
        file.delete();
    }

    @Test
    public void testWriteSelectedByteArrayRange() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.setContentCompression(SevenZMethod.COPY);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("range");
        output.putArchiveEntry(entry);
        output.write(new byte[] { 7, 8, 9, 10 }, 1, 2);
        output.closeArchiveEntry();
        assertEquals(2L, entry.getSize());
        assertEquals(2L, entry.getCompressedSize());
        output.close();
        file.delete();
    }

    @Test
    public void testWriteSingleByteUpdatesCrc() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.setContentCompression(SevenZMethod.COPY);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("crc");
        output.putArchiveEntry(entry);
        output.write(65);
        output.closeArchiveEntry();
        CRC32 crc = new CRC32();
        crc.update(65);
        assertEquals(crc.getValue(), entry.getCrcValue());
        output.close();
        file.delete();
    }

    @Test
    public void testFinishWithWrittenEntry() throws Exception {
        File file = new File("seven-test.tmp");
        SevenZOutputFile output = new SevenZOutputFile(file);
        output.setContentCompression(SevenZMethod.COPY);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("data");
        output.putArchiveEntry(entry);
        output.write(new byte[] { 1, 2 });
        output.closeArchiveEntry();
        output.finish();
        output.close();
        assertTrue(file.length() > 32);
        file.delete();
    }
}
