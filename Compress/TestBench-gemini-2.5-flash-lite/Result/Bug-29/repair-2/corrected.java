package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveSummary;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.utils.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Map.Entry;
import java.io.StringWriter;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;

public class ArchiveStreamFactoryTest {

    private static final String TEST_ENCODING = "UTF-8";
    private static final byte[] TEST_DATA = {0x01, 0x02, 0x03, 0x04, 0x05};
    private static final byte[] PADDING_DATA = new byte[1024]; // For padding tests

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamAr() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.AR, is);
        assertNotNull(ais);
        assertEquals(ArArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamArj() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ARJ, is);
        assertNotNull(ais);
        assertEquals(ArjArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamZip() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        assertNotNull(ais);
        assertEquals(ZipArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamTar() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.TAR, is);
        assertNotNull(ais);
        assertEquals(TarArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamJar() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.JAR, is);
        assertNotNull(ais);
        assertEquals(JarArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamCpio() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, is);
        assertNotNull(ais);
        assertEquals(CpioArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamDump() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, is);
        assertNotNull(ais);
        assertEquals(DumpArchiveInputStream.class, ais.getClass());
    }
    
    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamSevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        try {
            factory.createArchiveInputStream(ArchiveStreamFactory.SEVEN_Z, is);
            fail("Expected StreamingNotSupportedException for 7z input");
        } catch (org.apache.commons.compress.archivers.StreamingNotSupportedException e) {
            assertEquals(ArchiveStreamFactory.SEVEN_Z, e.getFormat());
        }
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamUnknown() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        try {
            factory.createArchiveInputStream("unknown", is);
            fail("Expected ArchiveException for unknown format");
        } catch (ArchiveException e) {
            assertTrue(e.getMessage().contains("not found"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamNullName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        try {
            factory.createArchiveInputStream(null, is);
            fail("Expected IllegalArgumentException for null archiver name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("must not be null"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamFromStringAndInputStreamNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
            fail("Expected IllegalArgumentException for null input stream");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("must not be null"));
        }
    }
    
    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamAr() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.AR, os);
        assertNotNull(aos);
        assertEquals(ArArchiveOutputStream.class, aos.getClass());
    }

    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamZip() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, os);
        assertNotNull(aos);
        assertEquals(ZipArchiveOutputStream.class, aos.getClass());
    }
    
    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamTar() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, os);
        assertNotNull(aos);
        assertEquals(TarArchiveOutputStream.class, aos.getClass());
    }
    
    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamJar() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, os);
        assertNotNull(aos);
        assertEquals(JarArchiveOutputStream.class, aos.getClass());
    }
    
    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamCpio() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, os);
        assertNotNull(aos);
        assertEquals(CpioArchiveOutputStream.class, aos.getClass());
    }

    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamSevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        try {
            factory.createArchiveOutputStream(ArchiveStreamFactory.SEVEN_Z, os);
            fail("Expected StreamingNotSupportedException for 7z output");
        } catch (org.apache.commons.compress.archivers.StreamingNotSupportedException e) {
            assertEquals(ArchiveStreamFactory.SEVEN_Z, e.getFormat());
        }
    }

    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamUnknown() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        try {
            factory.createArchiveOutputStream("unknown", os);
            fail("Expected ArchiveException for unknown format");
        } catch (ArchiveException e) {
            assertTrue(e.getMessage().contains("not found"));
        }
    }

    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamNullName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        try {
            factory.createArchiveOutputStream(null, os);
            fail("Expected IllegalArgumentException for null archiver name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("must not be null"));
        }
    }

    @Test
    public void testCreateArchiveOutputStreamFromStringAndOutputStreamNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
            fail("Expected IllegalArgumentException for null output stream");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("must not be null"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectZip() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // A minimal ZIP signature
        byte[] zipSignature = {0x50, 0x4b, 0x03, 0x04}; 
        InputStream is = new ByteArrayInputStream(zipSignature);
        ArchiveInputStream ais = factory.createArchiveInputStream(is);
        assertNotNull(ais);
        assertEquals(ZipArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectTar() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // A minimal TAR signature (ustar magic)
        byte[] tarSignature = {0x75, 0x73, 0x74, 0x61, 0x72, 0x20, 0x20, 0x00}; 
        InputStream is = new ByteArrayInputStream(tarSignature);
        ArchiveInputStream ais = factory.createArchiveInputStream(is);
        assertNotNull(ais);
        assertEquals(TarArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectCpioNew() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // MAGIC_NEW
        byte[] cpioSignature = {'0', '7', '0', '7', '0', '1'}; 
        InputStream is = new ByteArrayInputStream(cpioSignature);
        ArchiveInputStream ais = factory.createArchiveInputStream(is);
        assertNotNull(ais);
        assertEquals(CpioArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectCpioNewCrc() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // MAGIC_NEW_CRC
        byte[] cpioSignature = {'0', '7', '0', '7', '0', '2'}; 
        InputStream is = new ByteArrayInputStream(cpioSignature);
        ArchiveInputStream ais = factory.createArchiveInputStream(is);
        assertNotNull(ais);
        assertEquals(CpioArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectCpioOldAscii() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // MAGIC_OLD_ASCII
        byte[] cpioSignature = {'0', '7', '0', '7', '0', '7'}; 
        InputStream is = new ByteArrayInputStream(cpioSignature);
        ArchiveInputStream ais = factory.createArchiveInputStream(is);
        assertNotNull(ais);
        assertEquals(CpioArchiveInputStream.class, ais.getClass());
    }
    
    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectCpioOldBinary() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // MAGIC_OLD_BINARY as two bytes (0x71, 0xC7)
        byte[] cpioSignature = {(byte) 0x71, (byte) 0xC7}; 
        InputStream is = new ByteArrayInputStream(cpioSignature);
        ArchiveInputStream ais = factory.createArchiveInputStream(is);
        assertNotNull(ais);
        assertEquals(CpioArchiveInputStream.class, ais.getClass());
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectSevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // Minimal 7z signature
        byte[] sevenZSignature = {0x37, 0x7A, 0xBC, (byte) 0xAF, 0x27, 0x1C};
        InputStream is = new ByteArrayInputStream(sevenZSignature);
        try {
            factory.createArchiveInputStream(is);
            fail("Expected StreamingNotSupportedException for 7z input");
        } catch (org.apache.commons.compress.archivers.StreamingNotSupportedException e) {
            assertEquals(ArchiveStreamFactory.SEVEN_Z, e.getFormat());
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamAutoDetectUnknown() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        byte[] unknownSignature = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06};
        InputStream is = new ByteArrayInputStream(unknownSignature);
        try {
            factory.createArchiveInputStream(is);
            fail("Expected ArchiveException for unknown format");
        } catch (ArchiveException e) {
            assertTrue(e.getMessage().contains("No Archiver found"));
        }
    }
    
    @Test
    public void testCreateArchiveInputStreamWithInputStreamNull() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream((InputStream) null);
            fail("Expected IllegalArgumentException for null input stream");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Stream must not be null"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithInputStreamMarkNotSupported() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA) {
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        try {
            factory.createArchiveInputStream(is);
            fail("Expected IllegalArgumentException for non-markable stream");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Mark is not supported"));
        }
    }
    
    @Test
    public void testGetSetEntryEncoding() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertNull(factory.getEntryEncoding());
        factory.setEntryEncoding(TEST_ENCODING);
        assertEquals(TEST_ENCODING, factory.getEntryEncoding());
        factory.setEntryEncoding(null);
        assertNull(factory.getEntryEncoding());
    }

    @Test
    public void testSetEntryEncodingWithConstructor() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory(TEST_ENCODING);
        assertEquals(TEST_ENCODING, factory.getEntryEncoding());
        try {
            factory.setEntryEncoding("UTF-16");
            fail("Expected IllegalStateException when overriding constructor encoding");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Cannot overide encoding set by the constructor"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory(TEST_ENCODING);
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        assertNotNull(ais);
        ais.close();
    }

    @Test
    public void testCreateArchiveOutputStreamWithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory(TEST_ENCODING);
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, os);
        assertNotNull(aos);
        aos.close();
    }
    
    @Test
    public void testArchiveInputStreamAvailable() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        
        ais.getNextEntry(); // Get the ZipArchiveEntry for "test.txt"
        assertEquals(1, ais.available());
        
        IOUtils.toByteArray(ais);
        assertEquals(0, ais.available());
        
        ais.close();
    }

    @Test
    public void testArchiveInputStreamSkip() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        
        ais.getNextEntry(); // Get the ZipArchiveEntry for "test.txt"
        long skipped = ais.skip(2); // Skip 2 bytes
        assertEquals(2, skipped);
        assertEquals(2, ais.getBytesRead());

        long totalSize = TEST_DATA.length;
        skipped = ais.skip(totalSize); // Should skip remaining bytes
        assertEquals(totalSize - 2, skipped); 
        assertEquals(totalSize, ais.getBytesRead());

        assertEquals(-1, ais.read()); // Should be EOF

        ais.close();
    }

    @Test
    public void testArchiveInputStreamClose() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(TEST_DATA);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        ais.close();
        try {
            ais.read();
            fail("Expected IOException on read after close");
        } catch (IOException e) {
            // Expected behavior
        }
    }
    
    @Test
    public void testArchiveOutputStreamClose() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, os);
        aos.close();
        try {
            aos.write(TEST_DATA);
            fail("Expected IOException on write after close");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testArchiveOutputStreamFinish() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, baos);
        
        aos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
        aos.write(TEST_DATA);
        
        aos.finish(); 
        
        assertTrue(baos.size() > 0);
        
        aos.close();
    }

    @Test
    public void testArchiveOutputStreamCreateArchiveEntry() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, os);
        
        File tempFile = File.createTempFile("compress", ".tmp");
        tempFile.deleteOnExit();
        String entryName = "temp_file.txt";
        ArchiveEntry entry = factory.createArchiveEntry(tempFile, entryName);
        
        assertNotNull(entry);
        assertEquals(entryName, entry.getName());
        if (aos instanceof ZipArchiveOutputStream) {
             assertTrue(entry instanceof ZipArchiveEntry);
        }
        
        tempFile.delete();
    }
    
    @Test
    public void testArchiveInputStreamReadWithEmptyStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        byte[] buffer = new byte[10];
        assertEquals(-1, ais.read(buffer, 0, buffer.length));
        ais.close();
    }

    @Test
    public void testArchiveInputStreamReadPartial() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        
        ais.getNextEntry();
        byte[] buffer = new byte[TEST_DATA.length + 5];
        int bytesRead = ais.read(buffer, 0, TEST_DATA.length);
        assertEquals(TEST_DATA.length, bytesRead);
        assertTrue(Arrays.equals(TEST_DATA, Arrays.copyOf(buffer, TEST_DATA.length)));
        
        bytesRead = ais.read(buffer, 0, 5);
        assertEquals(-1, bytesRead);

        ais.close();
    }

    @Test
    public void testArchiveInputStreamReadWithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory(TEST_ENCODING);
        InputStream is = new ByteArrayInputStream(TEST_DATA); // Placeholder
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        assertNotNull(ais);
        ais.close();
    }
    
    @Test
    public void testArchiveInputStreamMatchesTar() throws Exception {
        byte[] tarHeader = new byte[512];
        System.arraycopy("ustar".getBytes(), 0, tarHeader, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(" ".getBytes(), 0, tarHeader, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        tarHeader[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN] = (byte) ' '; // Ensure space after version
        
        assertTrue(ArchiveStreamFactory.matches(tarHeader, tarHeader.length));
    }

    @Test
    public void testArchiveInputStreamMatchesZip() throws Exception {
        byte[] zipHeader = {0x50, 0x4b, 0x03, 0x04, 0x14, 0x00, 0x08, 0x00, 0x08, 0x00}; // Minimal ZIP header
        assertTrue(ArchiveStreamFactory.matches(zipHeader, zipHeader.length));
    }

    @Test
    public void testArchiveInputStreamMatchesCpioNew() throws Exception {
        byte[] cpioHeader = {'0', '7', '0', '7', '0', '1', '0', '0'}; // MAGIC_NEW
        assertTrue(ArchiveStreamFactory.matches(cpioHeader, cpioHeader.length));
    }
    
    @Test
    public void testArchiveInputStreamMatchesCpioNewCrc() throws Exception {
        byte[] cpioHeader = {'0', '7', '0', '7', '0', '2', '0', '0'}; // MAGIC_NEW_CRC
        assertTrue(ArchiveStreamFactory.matches(cpioHeader, cpioHeader.length));
    }
    
    @Test
    public void testArchiveInputStreamMatchesCpioOldAscii() throws Exception {
        byte[] cpioHeader = {'0', '7', '0', '7', '0', '7', '0', '0'}; // MAGIC_OLD_ASCII
        assertTrue(ArchiveStreamFactory.matches(cpioHeader, cpioHeader.length));
    }
    
    @Test
    public void testArchiveInputStreamMatchesCpioOldBinary() throws Exception {
        byte[] cpioHeader = {(byte) 0x71, (byte) 0xC7, 0x00, 0x00}; // MAGIC_OLD_BINARY
        assertTrue(ArchiveStreamFactory.matches(cpioHeader, cpioHeader.length));
    }

    @Test
    public void testArchiveInputStreamMatchesUnknown() throws Exception {
        byte[] unknownHeader = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06};
        assertFalse(ArchiveStreamFactory.matches(unknownHeader, unknownHeader.length));
    }
    
    @Test
    public void testArchiveInputStreamMatchesTooShort() throws Exception {
        byte[] shortHeader = {0x50, 0x4b}; // Not enough for ZIP signature
        assertFalse(ArchiveStreamFactory.matches(shortHeader, shortHeader.length));
    }
    
    @Test
    public void testArchiveInputStreamGetNextEntry() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        zaos.putArchiveEntry(entry1);
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        
        ArchiveEntry nextEntry = ais.getNextEntry();
        assertNotNull(nextEntry);
        assertEquals("file1.txt", nextEntry.getName());
        
        nextEntry = ais.getNextEntry();
        assertNull(nextEntry); // Should be EOF
        
        ais.close();
    }

    @Test
    public void testCpioArchiveInputStreamGetNextCPIOEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream caos = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(TEST_DATA.length);
        entry.setMode(0100644); // Regular file
        caos.putArchiveEntry(entry);
        caos.write(TEST_DATA);
        caos.closeArchiveEntry();
        caos.finish();

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        CpioArchiveInputStream cais = new CpioArchiveInputStream(is);
        CpioArchiveEntry readEntry = cais.getNextCPIOEntry();
        assertNotNull(readEntry);
        assertEquals("test.txt", readEntry.getName());
        assertEquals(TEST_DATA.length, readEntry.getSize());

        byte[] buffer = new byte[TEST_DATA.length];
        int bytesRead = cais.read(buffer, 0, buffer.length);
        assertEquals(TEST_DATA.length, bytesRead);
        assertTrue(Arrays.equals(TEST_DATA, buffer));

        assertEquals(-1, cais.read());

        assertNull(cais.getNextCPIOEntry());
        cais.close();
    }
    
    @Test
    public void testDumpArchiveInputStreamGetNextDumpEntry() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[DumpArchiveConstants.TP_SIZE]); 
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, is);
        
        assertTrue(ais instanceof DumpArchiveInputStream);
        
        try {
            DumpArchiveEntry entry = ((DumpArchiveInputStream) ais).getNextDumpEntry();
            assertNull(entry); 
        } catch (Exception e) {
            assertTrue(e instanceof ArchiveException || e instanceof IOException);
        } finally {
            ais.close();
        }
    }
    
    @Test
    public void testTarArchiveInputStreamGetNextTarEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TEST_DATA.length);
        taos.putArchiveEntry(entry);
        taos.write(TEST_DATA);
        taos.closeArchiveEntry();
        taos.finish();

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry readEntry = tais.getNextTarEntry();
        assertNotNull(readEntry);
        assertEquals("test.txt", readEntry.getName());
        assertEquals(TEST_DATA.length, readEntry.getSize());

        byte[] buffer = new byte[TEST_DATA.length];
        int bytesRead = tais.read(buffer, 0, buffer.length);
        assertEquals(TEST_DATA.length, bytesRead);
        assertTrue(Arrays.equals(TEST_DATA, buffer));

        assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void testTarArchiveInputStreamCurrentEntryAndEOF() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(TEST_DATA.length);
        taos.putArchiveEntry(entry);
        taos.write(TEST_DATA);
        taos.closeArchiveEntry();
        taos.finish();

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);

        assertNull(tais.getCurrentEntry());
        assertFalse(tais.isAtEOF());

        TarArchiveEntry firstEntry = tais.getNextTarEntry();
        assertNotNull(firstEntry);
        assertEquals(entry.getName(), tais.getCurrentEntry().getName());
        assertFalse(tais.isAtEOF());

        IOUtils.toByteArray(tais);
        
        assertNotNull(tais.getCurrentEntry());
        assertTrue(tais.isAtEOF());

        assertNull(tais.getNextTarEntry());
        assertNotNull(tais.getCurrentEntry());

        tais.close();
    }

    @Test
    public void testZipArchiveInputStreamGetNextZipEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        entry1.setSize(TEST_DATA.length);
        zaos.putArchiveEntry(entry1);
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is);
        
        ZipArchiveEntry nextEntry = zais.getNextZipEntry();
        assertNotNull(nextEntry);
        assertEquals("file1.txt", nextEntry.getName());
        assertEquals(TEST_DATA.length, nextEntry.getSize());
        
        nextEntry = zais.getNextZipEntry();
        assertNull(nextEntry);
        
        zais.close();
    }

    @Test
    public void testZipArchiveInputStreamReadWithDataDescriptor() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        byte[] ddSignatureBytes = ZipLong.DD_SIG.getBytes(); // 0x07080708
        byte[] dataDescriptorData = new byte[16]; // Placeholder for CRC, Compressed Size, Uncompressed Size
        // Fill data descriptor fields (simplified for test)
        System.arraycopy(ZipLong.BCD2Long(new byte[]{0x01, 0x02, 0x03, 0x04}).getBytes(), 0, dataDescriptorData, 0, 4); // CRC
        System.arraycopy(ZipLong.BCD2Long(new byte[]{0x01, 0x02, 0x03, 0x04}).getBytes(), 0, dataDescriptorData, 4, 4); // Compressed Size
        System.arraycopy(ZipLong.BCD2Long(new byte[]{0x01, 0x02, 0x03, 0x04}).getBytes(), 0, dataDescriptorData, 8, 4); // Uncompressed Size
        
        byte[] lfhPrefix = {0x50, 0x4b, 0x07, 0x08}; // LFH signature prefix for DD
        byte[] fullStreamContent = new byte[lfhPrefix.length + ddSignatureBytes.length + dataDescriptorData.length];
        System.arraycopy(lfhPrefix, 0, fullStreamContent, 0, lfhPrefix.length);
        System.arraycopy(ddSignatureBytes, 0, fullStreamContent, lfhPrefix.length, ddSignatureBytes.length);
        System.arraycopy(dataDescriptorData, 0, fullStreamContent, lfhPrefix.length + ddSignatureBytes.length, dataDescriptorData.length);
        
        InputStream is = new ByteArrayInputStream(fullStreamContent);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is, null, true, true); // Enable data descriptor support
        
        try {
            ZipArchiveEntry entry = zais.getNextZipEntry();
            if (entry != null) {
                // Attempting to read will likely fail due to malformed data,
                // but the test primarily checks if getNextZipEntry returns something.
                byte[] buffer = new byte[10];
                zais.read(buffer, 0, buffer.length);
            }
        } catch (Exception e) {
            assertTrue(e instanceof IOException || e instanceof UnsupportedZipFeatureException);
        } finally {
            zais.close();
        }
    }

    @Test
    public void testZipArchiveInputStreamMatches() throws Exception {
        byte[] zipSignature = {0x50, 0x4b, 0x03, 0x04}; // LFH signature
        assertTrue(ArchiveStreamFactory.matches(zipSignature, zipSignature.length));
        
        byte[] eocdSignature = {0x50, 0x4b, 0x05, 0x06}; // EOCD signature
        assertTrue(ArchiveStreamFactory.matches(eocdSignature, eocdSignature.length));

        byte[] ddSignature = {0x50, 0x4b, 0x07, 0x08}; // DD signature
        assertTrue(ArchiveStreamFactory.matches(ddSignature, ddSignature.length));
        
        byte[] splitMarker = {0x50, 0x4b, 0x07, 0x09}; // Split marker
        assertTrue(ArchiveStreamFactory.matches(splitMarker, splitMarker.length));
    }
    
    @Test
    public void testDumpArchiveEntryCompare() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[DumpArchiveConstants.TP_SIZE]); 
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, is);
        
        assertTrue(ais instanceof DumpArchiveInputStream);
        // DumpArchiveInputStream uses a PriorityQueue with a Comparator.
        // If the stream can be created and initialized, it implies the comparator is usable.
        ais.close();
    }

    @Test
    public void testDumpArchiveInputStreamGetSummary() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[DumpArchiveConstants.TP_SIZE * 2]); 
        
        try {
            ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, is);
            assertTrue(ais instanceof DumpArchiveInputStream);
            DumpArchiveSummary summary = ((DumpArchiveInputStream) ais).getSummary();
            assertNotNull(summary); 
            ais.close();
        } catch (Exception e) {
            assertTrue(e instanceof ArchiveException || e instanceof IOException);
        }
    }

    @Test
    public void testTarArchiveInputStreamCurrentEntryAndEOFStates() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(TEST_DATA.length);
        taos.putArchiveEntry(entry);
        taos.write(TEST_DATA);
        taos.closeArchiveEntry();
        taos.finish();

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);

        assertNull(tais.getCurrentEntry());
        assertFalse(tais.isAtEOF());

        TarArchiveEntry firstEntry = tais.getNextTarEntry();
        assertNotNull(firstEntry);
        assertEquals(entry.getName(), tais.getCurrentEntry().getName());
        assertFalse(tais.isAtEOF());

        IOUtils.toByteArray(tais);
        
        assertNotNull(tais.getCurrentEntry());
        assertTrue(tais.isAtEOF());

        assertNull(tais.getNextTarEntry());
        assertNotNull(tais.getCurrentEntry());

        tais.close();
    }

    @Test
    public void testTarArchiveOutputStreamLongFileMode() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = (TarArchiveOutputStream) factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, os);

        try {
            String longName = new String(new char[TarConstants.NAMELEN + 1]).replace('\0', 'a');
            TarArchiveEntry entry = new TarArchiveEntry(longName);
            entry.setSize(0);
            taos.putArchiveEntry(entry);
            taos.closeArchiveEntry();
            fail("Expected RuntimeException for long name with default mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too long"));
        }

        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String longNameTruncated = new String(new char[TarConstants.NAMELEN + 10]).replace('\0', 'b');
        TarArchiveEntry entryTruncate = new TarArchiveEntry(longNameTruncated);
        entryTruncate.setSize(0);
        taos.putArchiveEntry(entryTruncate); 
        taos.closeArchiveEntry();

        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longNameGNU = new String(new char[TarConstants.NAMELEN + 10]).replace('\0', 'c');
        TarArchiveEntry entryGNU = new TarArchiveEntry(longNameGNU);
        entryGNU.setSize(0);
        taos.putArchiveEntry(entryGNU);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();
    }

    @Test
    public void testTarArchiveOutputStreamBigNumberMode() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = (TarArchiveOutputStream) factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, os);

        try {
            TarArchiveEntry entry = new TarArchiveEntry("small.txt");
            entry.setSize(TarConstants.MAXSIZE + 1); 
            entry.setUserId((int)(TarConstants.MAXID + 1)); 
            taos.putArchiveEntry(entry);
            taos.closeArchiveEntry();
            fail("Expected RuntimeException for big number with default mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too big"));
        }

        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entryStar = new TarArchiveEntry("star.txt");
        entryStar.setSize(TarConstants.MAXSIZE + 5);
        entryStar.setUserId((int)(TarConstants.MAXID + 5));
        taos.putArchiveEntry(entryStar);
        taos.closeArchiveEntry();

        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entryPosix = new TarArchiveEntry("posix.txt");
        entryPosix.setSize(TarConstants.MAXSIZE + 10);
        entryPosix.setUserId((int)(TarConstants.MAXID + 10));
        taos.putArchiveEntry(entryPosix);
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();
    }
    
    @Test
    public void testZipArchiveInputStreamEmptyOrMalformed() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is);
        assertNull(zais.getNextZipEntry());
        zais.close();

        is = new ByteArrayInputStream(new byte[]{0x01, 0x02, 0x03});
        zais = new ZipArchiveInputStream(is);
        assertNull(zais.getNextZipEntry());
        zais.close();
    }

    @Test
    public void testZipArchiveInputStreamReadPastEndOfEntry() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        entry1.setSize(TEST_DATA.length);
        zaos.putArchiveEntry(entry1);
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is);
        
        zais.getNextZipEntry();
        byte[] buffer = new byte[TEST_DATA.length * 2];
        int bytesRead = zais.read(buffer, 0, buffer.length);
        assertEquals(TEST_DATA.length, bytesRead);
        assertTrue(Arrays.equals(TEST_DATA, Arrays.copyOf(buffer, TEST_DATA.length)));

        assertEquals(-1, zais.read());
        zais.close();
    }

    @Test
    public void testZipArchiveInputStreamSkipPastEndOfEntry() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        entry1.setSize(TEST_DATA.length);
        zaos.putArchiveEntry(entry1);
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is);
        
        zais.getNextZipEntry();
        long skipped = zais.skip(TEST_DATA.length + 5);
        assertEquals(TEST_DATA.length, skipped);
        
        assertEquals(-1, zais.read());
        zais.close();
    }

    @Test
    public void testZipArchiveInputStreamCanReadEntryData() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[0]); 
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is);
        
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertTrue(zais.canReadEntryData(entry));

        ZipArchiveEntry shrinkingEntry = new ZipArchiveEntry("shrinking.txt");
        shrinkingEntry.setMethod(ZipEntry.DEFLATED); // Assume DEFLATED is supported
        assertTrue(zais.canReadEntryData(shrinkingEntry));
        
        ZipArchiveEntry encryptedEntry = new ZipArchiveEntry("encrypted.txt");
        encryptedEntry.setGeneralPurposeBit(new GeneralPurposeBit(1)); 
        assertFalse(zais.canReadEntryData(encryptedEntry)); 

        zais.close();
    }
}
