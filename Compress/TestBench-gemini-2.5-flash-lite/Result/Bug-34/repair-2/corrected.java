package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.zip.ZipException;

public class X7875_NewUnixTest {

    @Test
    public void testDefaultConstructor() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Default UID=1000, GID=1000. Version is implicitly 1.
        assertEquals("Default UID", 1000L, xf.getUID());
        assertEquals("Default GID", 1000L, xf.getGID());
    }

    @Test
    public void testSetGetUID() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(1234567890L);
        assertEquals("Set UID", 1234567890L, xf.getUID());
    }

    @Test
    public void testSetGetGID() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setGID(9876543210L);
        assertEquals("Set GID", 9876543210L, xf.getGID());
    }

    @Test
    public void testSetGetUIDAndGID() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(123L);
        xf.setGID(456L);
        assertEquals("Set UID", 123L, xf.getUID());
        assertEquals("Set GID", 456L, xf.getGID());
    }

    @Test
    public void testGetHeaderId() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        assertEquals("Header ID", new ZipShort(0x7875), xf.getHeaderId());
    }

    @Test
    public void testLocalFileDataLengthForDefault() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Default UID=1000, GID=1000
        // UID 1000 (0x3E8) takes 2 bytes after reverse. GID 1000 takes 2 bytes.
        // Total length = 1 (version) + 1 (uidSize) + 2 (uid) + 1 (gidSize) + 2 (gid) = 7
        assertEquals("Local file data length for default", new ZipShort(7), xf.getLocalFileDataLength());
    }

    @Test
    public void testLocalFileDataLengthForLargerValues() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(0xFFFFFFFFL); // 4 bytes
        xf.setGID(0xFFFFFFFFL); // 4 bytes
        // Total length = 1 (version) + 1 (uidSize) + 4 (uid) + 1 (gidSize) + 4 (gid) = 11
        assertEquals("Local file data length for 0xFFFFFFFF", new ZipShort(11), xf.getLocalFileDataLength());
    }

    @Test
    public void testLocalFileDataLengthForZeroUID() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(0L);
        xf.setGID(1000L);
        // UID 0 has size 1. GID 1000 has size 2.
        // Total length = 1 (version) + 1 (uidSize) + 1 (uid) + 1 (gidSize) + 2 (gid) = 6
        assertEquals("Local file data length for UID 0", new ZipShort(6), xf.getLocalFileDataLength());
    }

    @Test
    public void testCentralDirectoryLength() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        assertEquals("Central directory length", new ZipShort(0), xf.getCentralDirectoryLength());
    }

    @Test
    public void testGetLocalFileDataDataDefault() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Default UID=1000, GID=1000
        // UID 1000 (0x3E8) reversed bytes: {-40, 3} which is {0xE8, 0x03} little-endian. Size 2.
        // GID 1000 reversed bytes: {-40, 3} which is {0xE8, 0x03} little-endian. Size 2.
        // data = [version=1, uidSize=2, uidBytes={0xE8, 0x03}, gidSize=2, gidBytes={0xE8, 0x03}]
        byte[] expected = {1, 2, (byte)0xE8, (byte)0x03, 2, (byte)0xE8, (byte)0x03};
        assertArrayEquals("Local file data default", expected, xf.getLocalFileDataData());
    }

    @Test
    public void testGetLocalFileDataDataLargerValues() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(0xFFFFFFFFL); // 4 bytes: {-1, -1, -1, -1} reversed
        xf.setGID(0x10000L); // 5 bytes: {0, 0, 1, 0, 0} reversed
        // data = [version=1, uidSize=4, uidBytes={-1,-1,-1,-1}, gidSize=5, gidBytes={0,0,1,0,0}]
        byte[] uidBytesExpected = {(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF};
        byte[] gidBytesExpected = {(byte)0x00, (byte)0x00, (byte)0x01, (byte)0x00, (byte)0x00};
        byte[] expected = new byte[1 + 1 + 4 + 1 + 5];
        expected[0] = 1; // version
        expected[1] = 4; // uidSize
        System.arraycopy(uidBytesExpected, 0, expected, 2, 4);
        expected[6] = 5; // gidSize
        System.arraycopy(gidBytesExpected, 0, expected, 7, 5);
        assertArrayEquals("Local file data larger values", expected, xf.getLocalFileDataData());
    }

    @Test
    public void testGetLocalFileDataDataZeroUID() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(0L);
        xf.setGID(1000L);
        // UID 0 has size 1: {0}. GID 1000 has size 2: {0xE8, 0x03}.
        // data = [version=1, uidSize=1, uidBytes={0}, gidSize=2, gidBytes={0xE8, 0x03}]
        byte[] uidBytesExpected = {0};
        byte[] gidBytesExpected = {(byte)0xE8, (byte)0x03};
        byte[] expected = new byte[1 + 1 + 1 + 1 + 2];
        expected[0] = 1; // version
        expected[1] = 1; // uidSize
        System.arraycopy(uidBytesExpected, 0, expected, 2, 1);
        expected[3] = 2; // gidSize
        System.arraycopy(gidBytesExpected, 0, expected, 4, 2);
        assertArrayEquals("Local file data zero UID", expected, xf.getLocalFileDataData());
    }

    @Test
    public void testGetCentralDirectoryData() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        byte[] data = xf.getCentralDirectoryData();
        assertNotNull("Central directory data should not be null", data);
        assertEquals("Central directory data length", 0, data.length);
    }

    @Test
    public void testParseFromLocalFileDataDefault() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Data from testGetLocalFileDataDataDefault: {1, 2, 0xE8, 0x03, 2, 0xE8, 0x03}
        byte[] data = {1, 2, (byte)0xE8, (byte)0x03, 2, (byte)0xE8, (byte)0x03};
        xf.parseFromLocalFileData(data, 0, data.length);
        assertEquals("Parsed UID", 1000L, xf.getUID());
        assertEquals("Parsed GID", 1000L, xf.getGID());
    }

    @Test
    public void testParseFromLocalFileDataLargerValues() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Data from testGetLocalFileDataDataLargerValues: {1, 4, -1, -1, -1, -1, 5, 0, 0, 1, 0, 0}
        byte[] data = {1, 4, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, 5, 0, 0, 1, 0, 0};
        xf.parseFromLocalFileData(data, 0, data.length);
        assertEquals("Parsed UID", 0xFFFFFFFFL, xf.getUID());
        assertEquals("Parsed GID", 0x10000L, xf.getGID());
    }

    @Test
    public void testParseFromLocalFileDataZeroUID() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Data from testGetLocalFileDataDataZeroUID: {1, 1, 0, 2, 0xE8, 0x03}
        byte[] data = {1, 1, 0, 2, (byte)0xE8, (byte)0x03};
        xf.parseFromLocalFileData(data, 0, data.length);
        assertEquals("Parsed UID", 0L, xf.getUID());
        assertEquals("Parsed GID", 1000L, xf.getGID());
    }

    @Test
    public void testParseFromLocalFileDataWithOffset() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        byte[] data = {0x00, 0x00, 1, 2, (byte)0xE8, (byte)0x03, 2, (byte)0xE8, (byte)0x03};
        xf.parseFromLocalFileData(data, 2, data.length - 2);
        assertEquals("Parsed UID with offset", 1000L, xf.getUID());
        assertEquals("Parsed GID with offset", 1000L, xf.getGID());
    }

    @Test
    public void testParseFromCentralDirectoryData() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // This method should do nothing.
        xf.setUID(123L);
        xf.setGID(456L);
        byte[] data = {1, 2, 3};
        xf.parseFromCentralDirectoryData(data, 0, data.length);
        assertEquals("Parsed UID from central dir", 123L, xf.getUID());
        assertEquals("Parsed GID from central dir", 456L, xf.getGID());
    }

    @Test
    public void testToString() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(123L);
        xf.setGID(456L);
        String expected = "0x7875 Zip Extra Field: UID=123 GID=456";
        assertEquals("toString output", expected, xf.toString());
    }

    @Test
    public void testClone() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        xf.setUID(123L);
        xf.setGID(456L);
        X7875_NewUnix cloned = (X7875_NewUnix) xf.clone();
        assertNotSame("Cloned object should be different instance", xf, cloned);
        assertEquals("Cloned UID", xf.getUID(), cloned.getUID());
        assertEquals("Cloned GID", xf.getGID(), cloned.getGID());
        assertEquals("Cloned object should be equal to original", xf, cloned);
    }

    @Test
    public void testEquals() throws Exception {
        X7875_NewUnix xf1 = new X7875_NewUnix();
        X7875_NewUnix xf2 = new X7875_NewUnix();
        assertTrue("Identical objects should be equal", xf1.equals(xf2));

        xf1.setUID(123L);
        xf1.setGID(456L);
        xf2.setUID(123L);
        xf2.setGID(456L);
        assertTrue("Objects with same UID/GID should be equal", xf1.equals(xf2));

        xf2.setUID(789L);
        assertFalse("Objects with different UID should not be equal", xf1.equals(xf2));

        xf1.setUID(123L); // reset
        xf2.setUID(123L); // reset
        xf2.setGID(987L);
        assertFalse("Objects with different GID should not be equal", xf1.equals(xf2));

        assertFalse("Different object types should not be equal", xf1.equals(new Object()));
    }

    @Test
    public void testHashCode() throws Exception {
        X7875_NewUnix xf1 = new X7875_NewUnix();
        X7875_NewUnix xf2 = new X7875_NewUnix();
        assertEquals("Identical objects should have same hash code", xf1.hashCode(), xf2.hashCode());

        xf1.setUID(123L);
        xf1.setGID(456L);
        xf2.setUID(123L);
        xf2.setGID(456L);
        assertEquals("Objects with same UID/GID should have same hash code", xf1.hashCode(), xf2.hashCode());

        xf2.setUID(789L);
        assertNotEquals("Objects with different UID should have different hash code", xf1.hashCode(), xf2.hashCode());

        xf1.setUID(123L); // reset
        xf2.setUID(123L); // reset
        xf2.setGID(987L);
        assertNotEquals("Objects with different GID should have different hash code", xf1.hashCode(), xf2.hashCode());
    }

    @Test
    public void testUIDBoundaries() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Max value for a 32-bit unsigned int
        long maxUint = 0xFFFFFFFFL;
        xf.setUID(maxUint);
        assertEquals("Max UID", maxUint, xf.getUID());

        // Value just above max 32-bit unsigned int, should still fit in long/BigInteger
        long aboveMaxUint = maxUint + 1L;
        xf.setUID(aboveMaxUint);
        assertEquals("UID above max unsigned int", aboveMaxUint, xf.getUID());

        // Min value for UID is typically 0
        xf.setUID(0L);
        assertEquals("Min UID", 0L, xf.getUID());
    }

    @Test
    public void testGIDBoundaries() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        // Max value for a 32-bit unsigned int
        long maxUint = 0xFFFFFFFFL;
        xf.setGID(maxUint);
        assertEquals("Max GID", maxUint, xf.getGID());

        // Value just above max 32-bit unsigned int
        long aboveMaxUint = maxUint + 1L;
        xf.setGID(aboveMaxUint);
        assertEquals("GID above max unsigned int", aboveMaxUint, xf.getGID());

        // Min value for GID is typically 0
        xf.setGID(0L);
        assertEquals("Min GID", 0L, xf.getGID());
    }

    @Test
    public void testUIDAndGIDSameLargerValue() throws Exception {
        X7875_NewUnix xf = new X7875_NewUnix();
        long largeValue = 0x123456789L; // This value will require more than 4 bytes.
        xf.setUID(largeValue);
        xf.setGID(largeValue);
        assertEquals("Large UID", largeValue, xf.getUID());
        assertEquals("Large GID", largeValue, xf.getGID());

        // Check local file data length
        // BigInteger.valueOf(largeValue).toByteArray() -> {18, 52, 86, 120, 9}. Reverse: {9, 120, 86, 52, 18}. Size 5.
        // Length = 1 (version) + 1 (uidSize) + 5 (uid) + 1 (gidSize) + 5 (gid) = 13
        assertEquals("Local file data length for large equal UID/GID", new ZipShort(13), xf.getLocalFileDataLength());

        // Check data
        byte[] data = xf.getLocalFileDataData();
        byte[] expectedUidBytes = {(byte)0x09, (byte)0x78, (byte)0x56, (byte)0x34, (byte)0x12}; // Reversed
        byte[] expectedGidBytes = {(byte)0x09, (byte)0x78, (byte)0x56, (byte)0x34, (byte)0x12}; // Reversed
        byte[] expected = new byte[1 + 1 + 5 + 1 + 5];
        expected[0] = 1; // version
        expected[1] = 5; // uidSize
        System.arraycopy(expectedUidBytes, 0, expected, 2, 5);
        expected[7] = 5; // gidSize
        System.arraycopy(expectedGidBytes, 0, expected, 8, 5);
        assertArrayEquals("Local file data for large equal UID/GID", expected, data);

        // Parse it back
        X7875_NewUnix parsedXf = new X7875_NewUnix();
        parsedXf.parseFromLocalFileData(data, 0, data.length);
        assertEquals("Parsed large UID", largeValue, parsedXf.getUID());
        assertEquals("Parsed large GID", largeValue, parsedXf.getGID());
    }
}
