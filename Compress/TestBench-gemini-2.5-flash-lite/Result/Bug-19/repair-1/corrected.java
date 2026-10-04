package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.zip.ZipException;
import java.math.BigInteger;

public class Zip64ExtendedInformationExtraFieldTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    private static final byte[] WORD_BYTES = new byte[4];
    private static final byte[] DWORD_BYTES = new byte[8];

    @Test
    public void testDefaultConstructor() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
        assertEquals(new ZipShort(0), field.getLocalFileDataLength());
        assertEquals(new ZipShort(0), field.getCentralDirectoryLength());
        assertArrayEquals(new byte[0], field.getLocalFileDataData());
        assertArrayEquals(new byte[0], field.getCentralDirectoryData());
    }

    @Test
    public void testConstructorWithSizeAndCompressedSize() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
        assertEquals(new ZipShort(2 * ZipConstants.DWORD), field.getLocalFileDataLength());
        assertEquals(new ZipShort(2 * ZipConstants.DWORD), field.getCentralDirectoryLength());
    }

    @Test
    public void testConstructorWithAllFields() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        ZipLong diskStart = new ZipLong(1L);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
        assertEquals(new ZipShort(2 * ZipConstants.DWORD), field.getLocalFileDataLength());
        assertEquals(new ZipShort(2 * ZipConstants.DWORD + ZipConstants.WORD), field.getCentralDirectoryLength());
    }

    @Test
    public void testSettersAndGetters() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();

        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        field.setSize(size);
        assertEquals(size, field.getSize());

        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        field.setCompressedSize(compressedSize);
        assertEquals(compressedSize, field.getCompressedSize());

        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        field.setRelativeHeaderOffset(relativeHeaderOffset);
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());

        ZipLong diskStart = new ZipLong(1L);
        field.setDiskStartNumber(diskStart);
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testLocalFileDataData() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize);
        byte[] data = field.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(2 * ZipConstants.DWORD, data.length);
        assertArrayEquals(size.getBytes(), data);
        assertArrayEquals(compressedSize.getBytes(), new byte[]{data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15]});
    }

    @Test
    public void testLocalFileDataData_onlySize() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setSize(new ZipEightByteInteger(1000L));
        try {
            field.getLocalFileDataData();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Zip64 extended information must contain both size values in the local file header.", e.getMessage());
        }
    }

    @Test
    public void testLocalFileDataData_onlyCompressedSize() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setCompressedSize(new ZipEightByteInteger(500L));
        try {
            field.getLocalFileDataData();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Zip64 extended information must contain both size values in the local file header.", e.getMessage());
        }
    }

    @Test
    public void testCentralDirectoryData() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        ZipLong diskStart = new ZipLong(1L);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        byte[] data = field.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(2 * ZipConstants.DWORD + ZipConstants.WORD, data.length);
        assertArrayEquals(size.getBytes(), data);
        assertArrayEquals(compressedSize.getBytes(), new byte[]{data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15]});
        assertArrayEquals(relativeHeaderOffset.getBytes(), new byte[]{data[16], data[17], data[18], data[19], data[20], data[21], data[22], data[23]});
        assertArrayEquals(diskStart.getBytes(), new byte[]{data[24], data[25], data[26], data[27]});
    }

    @Test
    public void testCentralDirectoryData_onlySizes() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize);
        byte[] data = field.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(2 * ZipConstants.DWORD, data.length);
        assertArrayEquals(size.getBytes(), data);
        assertArrayEquals(compressedSize.getBytes(), new byte[]{data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15]});
    }

    @Test
    public void testCentralDirectoryData_onlyRelativeOffset() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setRelativeHeaderOffset(new ZipEightByteInteger(2000L));
        byte[] data = field.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(ZipConstants.DWORD, data.length);
        assertArrayEquals(new ZipEightByteInteger(2000L).getBytes(), data);
    }

    @Test
    public void testCentralDirectoryData_onlyDiskStart() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setDiskStartNumber(new ZipLong(1L));
        byte[] data = field.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(ZipConstants.WORD, data.length);
        assertArrayEquals(new ZipLong(1L).getBytes(), data);
    }

    @Test
    public void testParseFromLocalFileData() throws Exception {
        byte[] data = new byte[2 * ZipConstants.DWORD + ZipConstants.WORD];
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        System.arraycopy(size.getBytes(), 0, data, 0, ZipConstants.DWORD);
        System.arraycopy(compressedSize.getBytes(), 0, data, ZipConstants.DWORD, ZipConstants.DWORD);
        System.arraycopy(relativeHeaderOffset.getBytes(), 0, data, 2 * ZipConstants.DWORD, ZipConstants.DWORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(data, 0, data.length);

        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber()); // diskStart is not in local file data
    }
    
    @Test
    public void testParseFromLocalFileData_minimal() throws Exception {
        byte[] data = new byte[2 * ZipConstants.DWORD];
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        System.arraycopy(size.getBytes(), 0, data, 0, ZipConstants.DWORD);
        System.arraycopy(compressedSize.getBytes(), 0, data, ZipConstants.DWORD, ZipConstants.DWORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(data, 0, data.length);

        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_empty() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(new byte[0], 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileData_tooShort() throws Exception {
        byte[] data = new byte[ZipConstants.DWORD]; // less than 2*DWORD
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        try {
            field.parseFromLocalFileData(data, 0, data.length);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertEquals("Zip64 extended information must contain both size values in the local file header.", e.getMessage());
        }
    }

    @Test
    public void testParseFromCentralDirectoryData_full() throws Exception {
        byte[] data = new byte[3 * ZipConstants.DWORD + ZipConstants.WORD];
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        ZipLong diskStart = new ZipLong(1L);
        System.arraycopy(size.getBytes(), 0, data, 0, ZipConstants.DWORD);
        System.arraycopy(compressedSize.getBytes(), 0, data, ZipConstants.DWORD, ZipConstants.DWORD);
        System.arraycopy(relativeHeaderOffset.getBytes(), 0, data, 2 * ZipConstants.DWORD, ZipConstants.DWORD);
        System.arraycopy(diskStart.getBytes(), 0, data, 3 * ZipConstants.DWORD, ZipConstants.WORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, data.length);

        // parseFromCentralDirectoryData partially parses and stores raw data
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryData_onlySizesAndOffset() throws Exception {
        byte[] data = new byte[3 * ZipConstants.DWORD];
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        System.arraycopy(size.getBytes(), 0, data, 0, ZipConstants.DWORD);
        System.arraycopy(compressedSize.getBytes(), 0, data, ZipConstants.DWORD, ZipConstants.DWORD);
        System.arraycopy(relativeHeaderOffset.getBytes(), 0, data, 2 * ZipConstants.DWORD, ZipConstants.DWORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, data.length);

        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }
    
    @Test
    public void testParseFromCentralDirectoryData_onlyDiskStart() throws Exception {
        byte[] data = new byte[ZipConstants.WORD]; // minimum length for diskStart only
        ZipLong diskStart = new ZipLong(1L);
        System.arraycopy(diskStart.getBytes(), 0, data, 0, ZipConstants.WORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, data.length);

        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }
    
    @Test
    public void testParseFromCentralDirectoryData_empty() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(new byte[0], 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_allPresent() throws Exception {
        byte[] rawData = new byte[3 * ZipConstants.DWORD + ZipConstants.WORD];
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        ZipLong diskStart = new ZipLong(1L);
        System.arraycopy(size.getBytes(), 0, rawData, 0, ZipConstants.DWORD);
        System.arraycopy(compressedSize.getBytes(), 0, rawData, ZipConstants.DWORD, ZipConstants.DWORD);
        System.arraycopy(relativeHeaderOffset.getBytes(), 0, rawData, 2 * ZipConstants.DWORD, ZipConstants.DWORD);
        System.arraycopy(diskStart.getBytes(), 0, rawData, 3 * ZipConstants.DWORD, ZipConstants.WORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        // Populate rawCentralDirectoryData by first parsing it
        field.parseFromCentralDirectoryData(rawData, 0, rawData.length); 
        field.reparseCentralDirectoryData(true, true, true, true);

        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_onlySizes() throws Exception {
        byte[] rawData = new byte[2 * ZipConstants.DWORD];
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        System.arraycopy(size.getBytes(), 0, rawData, 0, ZipConstants.DWORD);
        System.arraycopy(compressedSize.getBytes(), 0, rawData, ZipConstants.DWORD, ZipConstants.DWORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(rawData, 0, rawData.length);
        field.reparseCentralDirectoryData(true, true, false, false);

        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }
    
    @Test
    public void testReparseCentralDirectoryData_onlyOffset() throws Exception {
        byte[] rawData = new byte[ZipConstants.DWORD];
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(2000L);
        System.arraycopy(relativeHeaderOffset.getBytes(), 0, rawData, 0, ZipConstants.DWORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(rawData, 0, rawData.length);
        field.reparseCentralDirectoryData(false, false, true, false);

        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }
    
    @Test
    public void testReparseCentralDirectoryData_onlyDiskStart() throws Exception {
        byte[] rawData = new byte[ZipConstants.WORD];
        ZipLong diskStart = new ZipLong(1L);
        System.arraycopy(diskStart.getBytes(), 0, rawData, 0, ZipConstants.WORD);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(rawData, 0, rawData.length);
        field.reparseCentralDirectoryData(false, false, false, true);

        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_noFields() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        // Simulate empty raw data by parsing an empty byte array
        field.parseFromCentralDirectoryData(new byte[0], 0, 0); 
        field.reparseCentralDirectoryData(false, false, false, false);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryData_wrongLength_tooShort() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] rawData = new byte[10]; // Expected 16 for size+compressedSize
        field.parseFromCentralDirectoryData(rawData, 0, rawData.length);
        try {
            field.reparseCentralDirectoryData(true, true, false, false);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertTrue(e.getMessage().contains("Expected length 16 but is 10"));
        }
    }
    
    @Test
    public void testReparseCentralDirectoryData_wrongLength_tooLong() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        // Providing 20 bytes when expecting 16 for size+compressedSize
        byte[] rawData = new byte[2 * ZipConstants.DWORD + 4]; 
        ZipEightByteInteger size = new ZipEightByteInteger(1000L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(500L);
        System.arraycopy(size.getBytes(), 0, rawData, 0, ZipConstants.DWORD);
        System.arraycopy(compressedSize.getBytes(), 0, rawData, ZipConstants.DWORD, ZipConstants.DWORD);

        field.parseFromCentralDirectoryData(rawData, 0, rawData.length);
        try {
            field.reparseCentralDirectoryData(true, true, false, false);
            fail("Expected ZipException due to length mismatch");
        } catch (ZipException e) {
            assertTrue(e.getMessage().contains("Expected length 16 but is 20"));
        }
    }

    @Test
    public void testZipEightByteIntegerEquality() throws Exception {
        ZipEightByteInteger val1 = new ZipEightByteInteger(123456789012345678L);
        ZipEightByteInteger val2 = new ZipEightByteInteger(123456789012345678L);
        ZipEightByteInteger val3 = new ZipEightByteInteger(987654321098765432L);
        
        assertEquals(val1, val2);
        assertNotEquals(val1, val3);
        assertEquals(val1.hashCode(), val2.hashCode());
        assertNotEquals(val1.hashCode(), val3.hashCode());
    }

    @Test
    public void testZipLongEquality() throws Exception {
        ZipLong val1 = new ZipLong(1234567890L);
        ZipLong val2 = new ZipLong(1234567890L);
        ZipLong val3 = new ZipLong(9876543210L);

        assertEquals(val1, val2);
        assertNotEquals(val1, val3);
        assertEquals(val1.hashCode(), val2.hashCode());
        assertNotEquals(val1.hashCode(), val3.hashCode());
    }

    @Test
    public void testZipShortEquality() throws Exception {
        ZipShort val1 = new ZipShort(12345);
        ZipShort val2 = new ZipShort(12345);
        ZipShort val3 = new ZipShort(54321);

        assertEquals(val1, val2);
        assertNotEquals(val1, val3);
        assertEquals(val1.hashCode(), val2.hashCode());
        assertNotEquals(val1.hashCode(), val3.hashCode());
    }
    
    @Test
    public void testMaxAndMinZipEightByteIntegerValues() throws Exception {
        ZipEightByteInteger maxVal = new ZipEightByteInteger(Long.MAX_VALUE);
        ZipEightByteInteger minVal = new ZipEightByteInteger(Long.MIN_VALUE);
        
        assertEquals(Long.MAX_VALUE, maxVal.getLongValue());
        assertEquals(Long.MIN_VALUE, minVal.getLongValue());
    }
    
    @Test
    public void testMaxAndMinZipLongValues() throws Exception {
        ZipLong maxVal = new ZipLong(Long.MAX_VALUE);
        ZipLong minVal = new ZipLong(Long.MIN_VALUE);

        assertEquals(Long.MAX_VALUE, maxVal.getValue());
        assertEquals(Long.MIN_VALUE, minVal.getValue());
    }

    @Test
    public void testMaxAndMinZipShortValues() throws Exception {
        ZipShort maxVal = new ZipShort(0xFFFF); // Max value for unsigned short
        ZipShort minVal = new ZipShort(0);

        assertEquals(0xFFFF, maxVal.getValue());
        assertEquals(0, minVal.getValue());
    }
    
    @Test
    public void testZipEightByteIntegerFromBytes() throws Exception {
        byte[] bytes = ZipEightByteInteger.getBytes(123456789012345678L);
        ZipEightByteInteger val = new ZipEightByteInteger(bytes);
        assertEquals(123456789012345678L, val.getLongValue());
    }

    @Test
    public void testZipLongFromBytes() throws Exception {
        byte[] bytes = ZipLong.getBytes(1234567890L);
        ZipLong val = new ZipLong(bytes);
        assertEquals(1234567890L, val.getValue());
    }

    @Test
    public void testZipShortFromBytes() throws Exception {
        byte[] bytes = ZipShort.getBytes(12345);
        ZipShort val = new ZipShort(bytes);
        assertEquals(12345, val.getValue());
    }
}
