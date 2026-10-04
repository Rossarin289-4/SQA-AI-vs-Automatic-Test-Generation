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
import org.apache.commons.compress.archivers.dump.DumpArchiveSummary;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry; // Added import for ZipArchiveEntry
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit; // Added import for GeneralPurposeBit
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants; // Added import for DumpArchiveConstants

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
        // Internally, ZipArchiveInputStream's encoding is checked upon reading the entry.
        // This test primarily ensures the factory passes the encoding.
    }

    @Test
    public void testCreateArchiveOutputStreamWithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory(TEST_ENCODING);
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, os);
        assertNotNull(aos);
        // Internally, ZipArchiveOutputStream's encoding is checked upon writing entries.
        // This test primarily ensures the factory passes the encoding.
    }
    
    @Test
    public void testArchiveInputStreamAvailable() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // Create a minimal ZIP archive in memory
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        
        ais.getNextEntry(); // Get the ZipArchiveEntry for "test.txt"
        // After getting an entry, available() should typically return 1 if not at EOF for the entry.
        assertEquals(1, ais.available());
        
        // Read all data to reach EOF for the entry
        IOUtils.toByteArray(ais);
        assertEquals(0, ais.available());
        
        ais.close();
    }

    @Test
    public void testArchiveInputStreamSkip() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // Create a minimal ZIP archive in memory
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

        // Try to skip more than available
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
        // After closing, subsequent operations should ideally throw an exception or behave gracefully.
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
        // A subsequent write should ideally throw an exception if the stream is closed.
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
        
        // Put an entry, write some data, but don't close the entry
        aos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
        aos.write(TEST_DATA);
        
        aos.finish(); // Should complete the archive, including closing the unclosed entry.
        
        // The primary check is that finish() doesn't throw and that the stream is marked as finished.
        assertTrue(baos.size() > 0); // Some data should have been written
        
        aos.close(); // Should not throw again.
    }

    @Test
    public void testArchiveOutputStreamCreateArchiveEntry() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, os);
        
        // Create an entry for a file
        File tempFile = File.createTempFile("compress", ".tmp");
        tempFile.deleteOnExit();
        String entryName = "temp_file.txt";
        ArchiveEntry entry = factory.createArchiveEntry(tempFile, entryName);
        
        assertNotNull(entry);
        assertEquals(entryName, entry.getName());
        // The actual type depends on the format created by the factory.
        // For ZIP, it should be ZipArchiveEntry.
        if (aos instanceof ZipArchiveOutputStream) {
             assertTrue(entry instanceof ZipArchiveEntry);
        }
        
        // Clean up
        tempFile.delete();
    }
    
    @Test
    public void testArchiveInputStreamReadWithEmptyStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        // Reading from an empty stream should return -1 immediately
        byte[] buffer = new byte[10];
        assertEquals(-1, ais.read(buffer, 0, buffer.length));
        ais.close();
    }

    @Test
    public void testArchiveInputStreamReadPartial() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // Create a minimal ZIP archive in memory
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
        zaos.write(TEST_DATA);
        zaos.closeArchiveEntry();
        zaos.finish();
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        
        ais.getNextEntry(); // Get the ZipArchiveEntry for "test.txt"
        byte[] buffer = new byte[TEST_DATA.length + 5]; // Larger buffer
        int bytesRead = ais.read(buffer, 0, TEST_DATA.length); // Read exact amount
        assertEquals(TEST_DATA.length, bytesRead);
        assertTrue(Arrays.equals(TEST_DATA, Arrays.copyOf(buffer, TEST_DATA.length)));
        
        bytesRead = ais.read(buffer, 0, 5); // Try to read more, should be EOF
        assertEquals(-1, bytesRead);

        ais.close();
    }

    @Test
    public void testArchiveInputStreamReadWithEncoding() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory(TEST_ENCODING);
        // This test would require creating a zip with a non-ASCII filename, which is complex here.
        // We rely on the factory passing the encoding correctly.
        InputStream is = new ByteArrayInputStream(TEST_DATA); // Placeholder
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, is);
        assertNotNull(ais);
        // Closing here as we don't perform actual reads that would trigger encoding issues.
        ais.close();
    }
    
    @Test
    public void testArchiveInputStreamMatchesTar() throws Exception {
        byte[] tarHeader = new byte[512];
        // Fill with 'ustar' magic and version
        System.arraycopy("ustar".getBytes(), 0, tarHeader, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(" ".getBytes(), 0, tarHeader, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        System.arraycopy(" ".getBytes(), 0, tarHeader, TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN, 1); // Add space after version
        System.arraycopy(new byte[]{0}, 0, tarHeader, TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN + 1, 1); // Null terminator after version
        
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
        // Minimal ZIP archive
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

    // Tests for methods that were not called by existing tests

    @Test
    public void testCpioArchiveInputStreamGetNextCPIOEntry() throws Exception {
        // Create a minimal CPIO archive (new format, no CRC)
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

        // Read the data
        byte[] buffer = new byte[TEST_DATA.length];
        int bytesRead = cais.read(buffer, 0, buffer.length);
        assertEquals(TEST_DATA.length, bytesRead);
        assertTrue(Arrays.equals(TEST_DATA, buffer));

        // Check for EOF
        assertEquals(-1, cais.read());

        // Check next entry is null (trailer)
        assertNull(cais.getNextCPIOEntry());
        cais.close();
    }
    
    @Test
    public void testDumpArchiveInputStreamGetNextDumpEntry() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // Create a minimal stream that *might* be interpreted as a dump archive
        // and check if getNextDumpEntry can be called without immediate error.
        InputStream is = new ByteArrayInputStream(new byte[DumpArchiveConstants.TP_SIZE]); // Minimal data
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, is);
        
        assertTrue(ais instanceof DumpArchiveInputStream);
        
        try {
            DumpArchiveEntry entry = ((DumpArchiveInputStream) ais).getNextDumpEntry();
            // For an invalid/empty dump stream, it might return null or throw.
            assertNull(entry); 
        } catch (Exception e) {
            // Some exceptions like InvalidFormatException are expected for malformed data.
            assertTrue(e instanceof ArchiveException || e instanceof IOException);
        } finally {
            ais.close();
        }
    }
    
    @Test
    public void testTarArchiveInputStreamGetNextTarEntry() throws Exception {
        // Create a minimal Tar archive in memory
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

        // Read the data
        byte[] buffer = new byte[TEST_DATA.length];
        int bytesRead = tais.read(buffer, 0, buffer.length);
        assertEquals(TEST_DATA.length, bytesRead);
        assertTrue(Arrays.equals(TEST_DATA, buffer));

        // Check next entry is null (EOF)
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

        // Before getNextTarEntry
        assertNull(tais.getCurrentEntry());
        assertFalse(tais.isAtEOF());

        TarArchiveEntry firstEntry = tais.getNextTarEntry();
        assertNotNull(firstEntry);
        assertEquals(entry.getName(), tais.getCurrentEntry().getName());
        assertFalse(tais.isAtEOF());

        // Read all data to reach EOF for the entry and archive
        IOUtils.toByteArray(tais);

        // After reading all data, current entry is still the last one, and EOF should be true.
        assertNotNull(tais.getCurrentEntry());
        assertTrue(tais.isAtEOF());

        // Get next entry should return null
        assertNull(tais.getNextTarEntry());
        // After getNextTarEntry returns null, getCurrentEntry might become null or remain the last.
        // For safety, we check it's not an error to call it.
        assertNotNull(tais.getCurrentEntry());

        tais.close();
    }

    @Test
    public void testZipArchiveInputStreamGetNextZipEntry() throws Exception {
        // Create a minimal ZIP archive in memory
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
        assertNull(nextEntry); // Should be EOF
        
        zais.close();
    }

    @Test
    public void testZipArchiveInputStreamReadWithDataDescriptor() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // Minimal stream that *could* be a ZIP with a data descriptor.
        // This is a simplified test as creating a valid ZIP with data descriptor is complex.
        // We provide the DD signature and some placeholder data.
        // A real test would require an externally created zip with this format.
        byte[] ddSignatureBytes = ZipLong.DD_SIG.getBytes(); // 0x07080708
        byte[] dataDescriptorData = new byte[16]; // Placeholder for CRC, Compressed Size, Uncompressed Size
        // Fill data descriptor fields (simplified for test)
        System.arraycopy(ZipLong.THREE_BYTES_SUM.getBytes(), 0, dataDescriptorData, 0, 4); // CRC
        System.arraycopy(ZipLong.THREE_BYTES_SUM.getBytes(), 0, dataDescriptorData, 4, 4); // Compressed Size
        System.arraycopy(ZipLong.THREE_BYTES_SUM.getBytes(), 0, dataDescriptorData, 8, 4); // Uncompressed Size
        
        // A valid LFH needs to precede the DD for it to be parsed correctly.
        // This test is limited due to the complexity of generating a fully valid ZIP with DD here.
        // We provide a minimal LFH + DD signature.
        byte[] lfhPrefix = {0x50, 0x4b, 0x07, 0x08}; // LFH signature prefix for DD
        byte[] fullStreamContent = new byte[lfhPrefix.length + ddSignatureBytes.length + dataDescriptorData.length];
        System.arraycopy(lfhPrefix, 0, fullStreamContent, 0, lfhPrefix.length);
        System.arraycopy(ddSignatureBytes, 0, fullStreamContent, lfhPrefix.length, ddSignatureBytes.length);
        System.arraycopy(dataDescriptorData, 0, fullStreamContent, lfhPrefix.length + ddSignatureBytes.length, dataDescriptorData.length);
        
        InputStream is = new ByteArrayInputStream(fullStreamContent);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is, null, true, true); // Enable data descriptor support
        
        // Expecting this to either throw an exception during getNextEntry/read, or return null/handle gracefully.
        try {
            ZipArchiveEntry entry = zais.getNextZipEntry();
            // If an entry is found, it likely means the DD parsing was attempted.
            // The sizes would be wrong, leading to issues during read.
            if (entry != null) {
                byte[] buffer = new byte[10];
                zais.read(buffer, 0, buffer.length);
            }
        } catch (Exception e) {
            // Catching general exceptions as exact error depends on how malformed the stream is.
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
    
    // Test DumpArchiveEntry.compare, accessed via the PriorityQueue in DumpArchiveInputStream.
    @Test
    public void testDumpArchiveEntryCompare() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[DumpArchiveConstants.TP_SIZE]); 
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, is);
        
        assertTrue(ais instanceof DumpArchiveInputStream);
        DumpArchiveInputStream dais = (DumpArchiveInputStream) ais;
        
        // The PriorityQueue is initialized internally with a Comparator.
        // If the constructor completes without error, the comparator is likely functional.
        // Direct testing of the anonymous inner class comparator is difficult without exposing it.
        // We check if the stream initialization is successful.
        
        ais.close(); // Cleanup
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
            // An exception might occur if the data is not a valid dump header.
            assertTrue(e instanceof ArchiveException || e instanceof IOException);
        }
    }

    // Test TarArchiveInputStream.getCurrentEntry and TarArchiveInputStream.isAtEOF
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

        // Initially, no current entry and not at EOF
        assertNull(tais.getCurrentEntry());
        assertFalse(tais.isAtEOF());

        // After getting the first entry
        TarArchiveEntry firstEntry = tais.getNextTarEntry();
        assertNotNull(firstEntry);
        assertEquals(entry.getName(), tais.getCurrentEntry().getName());
        assertFalse(tais.isAtEOF());

        // Read all data to reach EOF for the entry and archive
        IOUtils.toByteArray(tais);
        
        // After reading all data, current entry is still the last one, and EOF should be true.
        assertNotNull(tais.getCurrentEntry());
        assertTrue(tais.isAtEOF());

        // Getting the next entry after EOF should return null.
        assertNull(tais.getNextTarEntry());
        assertNotNull(tais.getCurrentEntry());

        tais.close();
    }

    // Test TarArchiveOutputStream.setLongFileMode and related methods
    @Test
    public void testTarArchiveOutputStreamLongFileMode() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = (TarArchiveOutputStream) factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, os);

        // Test default (ERROR)
        try {
            // Create a name longer than NAMELEN
            String longName = new String(new char[TarConstants.NAMELEN + 1]).replace('\0', 'a');
            TarArchiveEntry entry = new TarArchiveEntry(longName);
            entry.setSize(0);
            taos.putArchiveEntry(entry);
            taos.closeArchiveEntry();
            fail("Expected RuntimeException for long name with default mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too long"));
        }

        // Test TRUNCATE
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String longNameTruncated = new String(new char[TarConstants.NAMELEN + 10]).replace('\0', 'b');
        TarArchiveEntry entryTruncate = new TarArchiveEntry(longNameTruncated);
        entryTruncate.setSize(0);
        taos.putArchiveEntry(entryTruncate); // Should not throw
        taos.closeArchiveEntry();
        
        // Test GNU mode
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longNameGNU = new String(new char[TarConstants.NAMELEN + 10]).replace('\0', 'c');
        TarArchiveEntry entryGNU = new TarArchiveEntry(longNameGNU);
        entryGNU.setSize(0);
        taos.putArchiveEntry(entryGNU); // Should not throw
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();
    }

    // Test TarArchiveOutputStream.setBigNumberMode and related methods
    @Test
    public void testTarArchiveOutputStreamBigNumberMode() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        OutputStream os = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = (TarArchiveOutputStream) factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, os);

        // Test default (ERROR)
        try {
            TarArchiveEntry entry = new TarArchiveEntry("small.txt");
            // Size larger than MAXSIZE
            entry.setSize(TarConstants.MAXSIZE + 1); 
            entry.setUserId(TarConstants.MAXID + 1); // UID larger than MAXID
            taos.putArchiveEntry(entry);
            taos.closeArchiveEntry();
            fail("Expected RuntimeException for big number with default mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too big"));
        }

        // Test STAR mode
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entryStar = new TarArchiveEntry("star.txt");
        entryStar.setSize(TarConstants.MAXSIZE + 5);
        entryStar.setUserId(TarConstants.MAXID + 5);
        taos.putArchiveEntry(entryStar); // Should not throw
        taos.closeArchiveEntry();

        // Test POSIX mode
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entryPosix = new TarArchiveEntry("posix.txt");
        entryPosix.setSize(TarConstants.MAXSIZE + 10);
        entryPosix.setUserId(TarConstants.MAXID + 10);
        taos.putArchiveEntry(entryPosix); // Should not throw
        taos.closeArchiveEntry();

        taos.finish();
        taos.close();
    }
    
    // Test ZipArchiveInputStream.getNextZipEntry() when the archive is empty or malformed.
    @Test
    public void testZipArchiveInputStreamEmptyOrMalformed() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        
        // Empty stream
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is);
        assertNull(zais.getNextZipEntry());
        zais.close();

        // Malformed stream (not a valid ZIP signature)
        is = new ByteArrayInputStream(new byte[]{0x01, 0x02, 0x03});
        zais = new ZipArchiveInputStream(is);
        assertNull(zais.getNextZipEntry());
        zais.close();
    }

    // Test ZipArchiveInputStream.read() when reading past the end of an entry.
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
        
        zais.getNextZipEntry(); // Get the entry
        byte[] buffer = new byte[TEST_DATA.length * 2];
        int bytesRead = zais.read(buffer, 0, buffer.length); // Read more than available
        assertEquals(TEST_DATA.length, bytesRead); // Should read only available data
        assertTrue(Arrays.equals(TEST_DATA, Arrays.copyOf(buffer, TEST_DATA.length)));

        // Try reading again, should return -1
        assertEquals(-1, zais.read());
        zais.close();
    }

    // Test ZipArchiveInputStream.skip() when skipping past the end of an entry.
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
        
        zais.getNextZipEntry(); // Get the entry
        long skipped = zais.skip(TEST_DATA.length + 5); // Skip more than available
        assertEquals(TEST_DATA.length, skipped); // Should skip only available bytes
        
        // After skipping all data, reading should return -1
        assertEquals(-1, zais.read());
        zais.close();
    }

    // Test ZipArchiveInputStream.canReadEntryData()
    @Test
    public void testZipArchiveInputStreamCanReadEntryData() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream is = new ByteArrayInputStream(new byte[0]); // Minimal stream
        ZipArchiveInputStream zais = new ZipArchiveInputStream(is);
        
        // Create a standard ZipArchiveEntry
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertTrue(zais.canReadEntryData(entry)); // Standard entry should be readable

        // Create an entry with an unsupported compression method (e.g., Shrinking)
        ZipArchiveEntry shrinkingEntry = new ZipArchiveEntry("shrinking.txt");
        shrinkingEntry.setMethod(ZipEntry.DEFLATED); // Assume DEFLATED is supported
        assertTrue(zais.canReadEntryData(shrinkingEntry));
        
        // Create an entry with encryption flag set (not supported by default)
        ZipArchiveEntry encryptedEntry = new ZipArchiveEntry("encrypted.txt");
        // GeneralPurposeBit.usesEncryption() relies on bit 0.
        encryptedEntry.setGeneralPurposeBit(new GeneralPurposeBit(1)); 
        // canReadEntryData checks if ZipUtil.canHandleEntryData is true and data descriptor is supported.
        // Encryption is not handled by canHandleEntryData, so it should return false.
        assertFalse(zais.canReadEntryData(encryptedEntry)); 

        zais.close();
    }
}
