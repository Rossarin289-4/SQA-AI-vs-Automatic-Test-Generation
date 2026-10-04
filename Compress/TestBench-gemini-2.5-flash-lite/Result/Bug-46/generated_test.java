package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Date;
import java.util.zip.ZipException;
import java.util.Calendar; // Added import for Calendar
import java.util.Arrays;

public class X5455_ExtendedTimestampTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetHeaderId() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        assertEquals(new ZipShort(0x5455), ts.getHeaderId());
    }

    @Test
    public void testDefaultConstructor() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        assertEquals(new ZipShort(0), ts.getLocalFileDataLength());
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength()); // Central directory always has at least the flags byte
        assertFalse(ts.isBit0_modifyTimePresent());
        assertFalse(ts.isBit1_accessTimePresent());
        assertFalse(ts.isBit2_createTimePresent());
        assertNull(ts.getModifyTime());
        assertNull(ts.getAccessTime());
        assertNull(ts.getCreateTime());
        assertNull(ts.getModifyJavaTime());
        assertNull(ts.getAccessJavaTime());
        assertNull(ts.getCreateJavaTime());
        assertEquals(0, ts.getFlags());
    }

    @Test
    public void testSetFlagsAndGetters() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0x07); // All bits set
        assertTrue(ts.isBit0_modifyTimePresent());
        assertTrue(ts.isBit1_accessTimePresent());
        assertTrue(ts.isBit2_createTimePresent());
        assertEquals(0x07, ts.getFlags());

        ts.setFlags((byte) 0x00); // All bits clear
        assertFalse(ts.isBit0_modifyTimePresent());
        assertFalse(ts.isBit1_accessTimePresent());
        assertFalse(ts.isBit2_createTimePresent());
        assertEquals(0, ts.getFlags());

        ts.setFlags((byte) 0x01); // Only modify time bit
        assertTrue(ts.isBit0_modifyTimePresent());
        assertFalse(ts.isBit1_accessTimePresent());
        assertFalse(ts.isBit2_createTimePresent());
        assertEquals(0x01, ts.getFlags());

        ts.setFlags((byte) 0x02); // Only access time bit
        assertFalse(ts.isBit0_modifyTimePresent());
        assertTrue(ts.isBit1_accessTimePresent());
        assertFalse(ts.isBit2_createTimePresent());
        assertEquals(0x02, ts.getFlags());

        ts.setFlags((byte) 0x04); // Only create time bit
        assertFalse(ts.isBit0_modifyTimePresent());
        assertFalse(ts.isBit1_accessTimePresent());
        assertTrue(ts.isBit2_createTimePresent());
        assertEquals(0x04, ts.getFlags());
    }

    @Test
    public void testSetModifyTimeAndGetters() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final ZipLong time = new ZipLong(1234567890);
        ts.setModifyTime(time);
        assertTrue(ts.isBit0_modifyTimePresent());
        assertEquals(time, ts.getModifyTime());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // 1 (flags) + 4 (modify time)
        assertEquals(new ZipShort(5), ts.getCentralDirectoryLength()); // Central dir also has modify time
        assertEquals(0x01, ts.getFlags()); // MODIFY_TIME_BIT

        final Date date = ts.getModifyJavaTime();
        assertNotNull(date);
        assertEquals(1234567890000L, date.getTime());
    }

    @Test
    public void testSetAccessTimeAndGetters() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final ZipLong time = new ZipLong(987654321);
        ts.setAccessTime(time);
        assertTrue(ts.isBit1_accessTimePresent());
        assertEquals(time, ts.getAccessTime());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // 1 (flags) + 4 (access time)
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength()); // Central dir only has flags
        assertEquals(0x02, ts.getFlags()); // ACCESS_TIME_BIT

        final Date date = ts.getAccessJavaTime();
        assertNotNull(date);
        assertEquals(987654321000L, date.getTime());
    }

    @Test
    public void testSetCreateTimeAndGetters() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final ZipLong time = new ZipLong(1122334455);
        ts.setCreateTime(time);
        assertTrue(ts.isBit2_createTimePresent());
        assertEquals(time, ts.getCreateTime());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // 1 (flags) + 4 (create time)
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength()); // Central dir only has flags
        assertEquals(0x04, ts.getFlags()); // CREATE_TIME_BIT

        final Date date = ts.getCreateJavaTime();
        assertNotNull(date);
        assertEquals(1122334455000L, date.getTime());
    }

    @Test
    public void testSetModifyJavaTime() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final Date date = new Date(1678886400000L); // March 15, 2023 12:00:00 PM UTC
        ts.setModifyJavaTime(date);
        assertTrue(ts.isBit0_modifyTimePresent());
        assertEquals(new ZipLong(1678886400), ts.getModifyTime());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // 1 (flags) + 4 (modify time)
        assertEquals(new ZipShort(5), ts.getCentralDirectoryLength()); // Central dir also has modify time
        assertEquals(0x01, ts.getFlags()); // MODIFY_TIME_BIT
    }

    @Test
    public void testSetAccessJavaTime() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final Date date = new Date(1678886520000L); // March 15, 2023 12:02:00 PM UTC
        ts.setAccessJavaTime(date);
        assertTrue(ts.isBit1_accessTimePresent());
        assertEquals(new ZipLong(1678886520), ts.getAccessTime());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // 1 (flags) + 4 (access time)
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength()); // Central dir does not have access time
        assertEquals(0x02, ts.getFlags()); // ACCESS_TIME_BIT
    }

    @Test
    public void testSetCreateJavaTime() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final Date date = new Date(1678886340000L); // March 15, 2023 11:59:00 AM UTC
        ts.setCreateJavaTime(date);
        assertTrue(ts.isBit2_createTimePresent());
        assertEquals(new ZipLong(1678886340), ts.getCreateTime());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // 1 (flags) + 4 (create time)
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength()); // Central dir does not have create time
        assertEquals(0x04, ts.getFlags()); // CREATE_TIME_BIT
    }

    @Test
    public void testParseFromLocalFileData_AllPresent() throws ZipException {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        // This byte array represents the local file data with all three timestamps.
        // Flags: 0x07 (all bits set)
        // Modify Time: 1234567890 (0x00499602)
        // Access Time: 987654321 (0x3ACF7995)
        // Create Time: 1122334455 (0x410E0F30)
        final byte[] data = {
                (byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT | X5455_ExtendedTimestamp.ACCESS_TIME_BIT | X5455_ExtendedTimestamp.CREATE_TIME_BIT),
                0x00, 0x49, (byte) 0x96, 0x02, // modifyTime = 1234567890
                0x3A, (byte) 0xCF, (byte) 0x79, (byte) 0x95, // accessTime = 987654321
                0x41, (byte) 0x0E, (byte) 0x0F, (byte) 0x30  // createTime = 1122334455
        };
        ts.parseFromLocalFileData(data, 0, data.length);

        assertTrue(ts.isBit0_modifyTimePresent());
        assertEquals(new ZipLong(1234567890), ts.getModifyTime());
        assertTrue(ts.isBit1_accessTimePresent());
        assertEquals(new ZipLong(987654321), ts.getAccessTime());
        assertTrue(ts.isBit2_createTimePresent());
        assertEquals(new ZipLong(1122334455), ts.getCreateTime());
        assertEquals(0x07, ts.getFlags());
        assertEquals(new ZipShort(13), ts.getLocalFileDataLength());
        assertEquals(new ZipShort(5), ts.getCentralDirectoryLength()); // Central dir only has modify time
    }

    @Test
    public void testParseFromLocalFileData_ModifyOnly() throws ZipException {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final byte[] data = {
                X5455_ExtendedTimestamp.MODIFY_TIME_BIT,
                0x00, 0x49, (byte) 0x96, 0x02 // modifyTime = 1234567890
        };
        ts.parseFromLocalFileData(data, 0, data.length);

        assertTrue(ts.isBit0_modifyTimePresent());
        assertEquals(new ZipLong(1234567890), ts.getModifyTime());
        assertFalse(ts.isBit1_accessTimePresent());
        assertNull(ts.getAccessTime());
        assertFalse(ts.isBit2_createTimePresent());
        assertNull(ts.getCreateTime());
        assertEquals(0x01, ts.getFlags());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // 1 (flags) + 4 (modify)
        assertEquals(new ZipShort(5), ts.getCentralDirectoryLength()); // Central dir also has modify time
    }

    @Test
    public void testParseFromLocalFileData_NoTimestamps() throws ZipException {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final byte[] data = { 0x00 }; // No flags, no timestamps
        ts.parseFromLocalFileData(data, 0, data.length);

        assertFalse(ts.isBit0_modifyTimePresent());
        assertNull(ts.getModifyTime());
        assertFalse(ts.isBit1_accessTimePresent());
        assertNull(ts.getAccessTime());
        assertFalse(ts.isBit2_createTimePresent());
        assertNull(ts.getCreateTime());
        assertEquals(0, ts.getFlags());
        assertEquals(new ZipShort(1), ts.getLocalFileDataLength());
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength());
    }

    @Test
    public void testParseFromLocalFileData_ExtraBytesIgnored() throws ZipException {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final byte[] data = {
                X5455_ExtendedTimestamp.MODIFY_TIME_BIT,
                0x00, 0x49, (byte) 0x96, 0x02, // modifyTime = 1234567890
                0x01, 0x02, 0x03, 0x04 // extra bytes
        };
        ts.parseFromLocalFileData(data, 0, data.length);

        assertTrue(ts.isBit0_modifyTimePresent());
        assertEquals(new ZipLong(1234567890), ts.getModifyTime());
        assertEquals(0x01, ts.getFlags());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // Only the defined fields
        assertEquals(new ZipShort(5), ts.getCentralDirectoryLength()); // Central dir also has modify time
    }

    @Test
    public void testParseFromCentralDirectoryData_ModifyOnly() throws ZipException {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        // Central directory data only contains the flags and modify time
        final byte[] data = {
                X5455_ExtendedTimestamp.MODIFY_TIME_BIT,
                0x00, 0x49, (byte) 0x96, 0x02 // modifyTime = 1234567890
        };
        ts.parseFromCentralDirectoryData(data, 0, data.length);

        assertTrue(ts.isBit0_modifyTimePresent());
        assertEquals(new ZipLong(1234567890), ts.getModifyTime());
        assertFalse(ts.isBit1_accessTimePresent());
        assertNull(ts.getAccessTime());
        assertFalse(ts.isBit2_createTimePresent());
        assertNull(ts.getCreateTime());
        assertEquals(0x01, ts.getFlags());
        assertEquals(new ZipShort(5), ts.getLocalFileDataLength()); // Local should reflect what's present
        assertEquals(new ZipShort(5), ts.getCentralDirectoryLength());
    }

    @Test
    public void testParseFromCentralDirectoryData_NoTimestamps() throws ZipException {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final byte[] data = { 0x00 }; // No flags, no timestamps
        ts.parseFromCentralDirectoryData(data, 0, data.length);

        assertFalse(ts.isBit0_modifyTimePresent());
        assertNull(ts.getModifyTime());
        assertFalse(ts.isBit1_accessTimePresent());
        assertNull(ts.getAccessTime());
        assertFalse(ts.isBit2_createTimePresent());
        assertNull(ts.getCreateTime());
        assertEquals(0, ts.getFlags());
        assertEquals(new ZipShort(1), ts.getLocalFileDataLength());
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength());
    }

    @Test
    public void testGetLocalFileDataData_AllPresent() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT | X5455_ExtendedTimestamp.ACCESS_TIME_BIT | X5455_ExtendedTimestamp.CREATE_TIME_BIT));
        ts.setModifyTime(new ZipLong(1234567890));
        ts.setAccessTime(new ZipLong(987654321));
        ts.setCreateTime(new ZipLong(1122334455));

        final byte[] data = ts.getLocalFileDataData();
        assertEquals(13, data.length);
        assertEquals(0x07, data[0]);
        assertArrayEquals(new ZipLong(1234567890).getBytes(), Arrays.copyOfRange(data, 1, 5));
        assertArrayEquals(new ZipLong(987654321).getBytes(), Arrays.copyOfRange(data, 5, 9));
        assertArrayEquals(new ZipLong(1122334455).getBytes(), Arrays.copyOfRange(data, 9, 13));
    }

    @Test
    public void testGetLocalFileDataData_ModifyOnly() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags(X5455_ExtendedTimestamp.MODIFY_TIME_BIT);
        ts.setModifyTime(new ZipLong(1234567890));

        final byte[] data = ts.getLocalFileDataData();
        assertEquals(5, data.length);
        assertEquals(0x01, data[0]);
        assertArrayEquals(new ZipLong(1234567890).getBytes(), Arrays.copyOfRange(data, 1, 5));
    }

    @Test
    public void testGetLocalFileDataData_NoTimestamps() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0);

        final byte[] data = ts.getLocalFileDataData();
        assertEquals(1, data.length);
        assertEquals(0, data[0]);
    }

    @Test
    public void testGetCentralDirectoryData_AllPresentInLocal() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT | X5455_ExtendedTimestamp.ACCESS_TIME_BIT | X5455_ExtendedTimestamp.CREATE_TIME_BIT));
        ts.setModifyTime(new ZipLong(1234567890));
        ts.setAccessTime(new ZipLong(987654321));
        ts.setCreateTime(new ZipLong(1122334455));

        final byte[] data = ts.getCentralDirectoryData();
        assertEquals(5, data.length); // Should only contain modify time and flags
        assertEquals(0x01, data[0]); // Only modify time bit is set in central directory
        assertArrayEquals(new ZipLong(1234567890).getBytes(), Arrays.copyOfRange(data, 1, 5));
    }

    @Test
    public void testGetCentralDirectoryData_ModifyOnly() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags(X5455_ExtendedTimestamp.MODIFY_TIME_BIT);
        ts.setModifyTime(new ZipLong(1234567890));

        final byte[] data = ts.getCentralDirectoryData();
        assertEquals(5, data.length);
        assertEquals(0x01, data[0]);
        assertArrayEquals(new ZipLong(1234567890).getBytes(), Arrays.copyOfRange(data, 1, 5));
    }

    @Test
    public void testToString() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setModifyJavaTime(new Date(1678886400000L)); // March 15, 2023 12:00:00 PM UTC
        ts.setAccessJavaTime(new Date(1678886520000L)); // March 15, 2023 12:02:00 PM UTC
        ts.setCreateJavaTime(new Date(1678886340000L)); // March 15, 2023 11:59:00 AM UTC

        final String s = ts.toString();
        assertTrue(s.contains("0x5455 Zip Extra Field"));
        assertTrue(s.contains("Flags=111")); // Binary for 7
        // The Date object's toString() representation can vary slightly based on Locale and JVM version.
        // We will check for the key components of the date.
        assertTrue(s.contains("Modify:[Wed Mar 15"));
        assertTrue(s.contains("12:00:00 UTC 2023]"));
        assertTrue(s.contains("Access:[Wed Mar 15"));
        assertTrue(s.contains("12:02:00 UTC 2023]"));
        assertTrue(s.contains("Create:[Wed Mar 15"));
        assertTrue(s.contains("11:59:00 UTC 2023]"));
    }

    @Test
    public void testToString_ModifyOnly() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setModifyJavaTime(new Date(1678886400000L)); // March 15, 2023 12:00:00 PM UTC
        final String s = ts.toString();
        assertTrue(s.contains("0x5455 Zip Extra Field"));
        assertTrue(s.contains("Flags=1")); // Binary for 1
        assertTrue(s.contains("Modify:[Wed Mar 15"));
        assertTrue(s.contains("12:00:00 UTC 2023]"));
        assertFalse(s.contains("Access"));
        assertFalse(s.contains("Create"));
    }

    @Test
    public void testToString_NoTimestamps() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        final String s = ts.toString();
        assertTrue(s.contains("0x5455 Zip Extra Field"));
        assertTrue(s.contains("Flags=0"));
        assertFalse(s.contains("Modify"));
        assertFalse(s.contains("Access"));
        assertFalse(s.contains("Create"));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        final X5455_ExtendedTimestamp ts1 = new X5455_ExtendedTimestamp();
        ts1.setModifyTime(new ZipLong(12345));
        ts1.setAccessTime(new ZipLong(67890));
        ts1.setFlags((byte) 0x03); // Modify and Access bits set

        final X5455_ExtendedTimestamp ts2 = (X5455_ExtendedTimestamp) ts1.clone();

        assertNotSame(ts1, ts2);
        assertEquals(ts1.getFlags(), ts2.getFlags());
        assertEquals(ts1.getModifyTime(), ts2.getModifyTime());
        assertEquals(ts1.getAccessTime(), ts2.getAccessTime());
        assertNull(ts2.getCreateTime()); // Should not be cloned if not set
        assertEquals(new ZipShort(5), ts2.getLocalFileDataLength()); // 1 (flags) + 4 (modify) + 4 (access)
        assertEquals(new ZipShort(1), ts2.getCentralDirectoryLength()); // Central directory only has flags
    }

    @Test
    public void testEquals() {
        final X5455_ExtendedTimestamp ts1 = new X5455_ExtendedTimestamp();
        final X5455_ExtendedTimestamp ts2 = new X5455_ExtendedTimestamp();

        // Equal by default (both have flags=0, all times=null)
        assertTrue(ts1.equals(ts2));
        assertTrue(ts2.equals(ts1));

        // Add modify time to ts1
        ts1.setModifyTime(new ZipLong(1000));
        assertFalse(ts1.equals(ts2));
        assertFalse(ts2.equals(ts1));

        // Add modify time to ts2
        ts2.setModifyTime(new ZipLong(1000));
        assertTrue(ts1.equals(ts2));
        assertTrue(ts2.equals(ts1));

        // Different modify time
        ts1.setModifyTime(new ZipLong(1001));
        assertFalse(ts1.equals(ts2));
        assertFalse(ts2.equals(ts1));

        // Add access time
        ts1.setAccessTime(new ZipLong(2000));
        ts2.setAccessTime(new ZipLong(2000));
        assertTrue(ts1.equals(ts2));
        assertTrue(ts2.equals(ts1));

        // Different access time
        ts1.setAccessTime(new ZipLong(2001));
        assertFalse(ts1.equals(ts2));
        assertFalse(ts2.equals(ts1));

        // Add create time
        ts1.setCreateTime(new ZipLong(3000));
        ts2.setCreateTime(new ZipLong(3000));
        assertTrue(ts1.equals(ts2));
        assertTrue(ts2.equals(ts1));

        // Different create time
        ts1.setCreateTime(new ZipLong(3001));
        assertFalse(ts1.equals(ts2));
        assertFalse(ts2.equals(ts1));

        // Equal timestamps, check flags
        ts1.setModifyTime(new ZipLong(1000));
        ts1.setAccessTime(new ZipLong(2000));
        ts1.setCreateTime(new ZipLong(3000));
        ts2.setModifyTime(new ZipLong(1000));
        ts2.setAccessTime(new ZipLong(2000));
        ts2.setCreateTime(new ZipLong(3000));
        ts1.setFlags((byte) 0x07); // All bits set
        ts2.setFlags((byte) 0x07);
        assertTrue(ts1.equals(ts2));

        // Different flags (only last 3 bits matter for equals)
        ts1.setFlags((byte) 0x01); // Modify only
        ts2.setFlags((byte) 0x07); // All set
        assertFalse(ts1.equals(ts2));

        // Test with null values
        final X5455_ExtendedTimestamp ts3 = new X5455_ExtendedTimestamp();
        final X5455_ExtendedTimestamp ts4 = new X5455_ExtendedTimestamp();
        ts3.setModifyTime(null);
        ts4.setModifyTime(null);
        assertTrue(ts3.equals(ts4));
    }

    @Test
    public void testHashCode() {
        final X5455_ExtendedTimestamp ts1 = new X5455_ExtendedTimestamp();
        final X5455_ExtendedTimestamp ts2 = new X5455_ExtendedTimestamp();

        assertEquals(ts1.hashCode(), ts2.hashCode());

        ts1.setModifyTime(new ZipLong(1000));
        ts2.setModifyTime(new ZipLong(1000));
        assertEquals(ts1.hashCode(), ts2.hashCode());

        ts1.setAccessTime(new ZipLong(2000));
        ts2.setAccessTime(new ZipLong(2000));
        assertEquals(ts1.hashCode(), ts2.hashCode());

        ts1.setCreateTime(new ZipLong(3000));
        ts2.setCreateTime(new ZipLong(3000));
        assertEquals(ts1.hashCode(), ts2.hashCode());

        ts1.setFlags((byte) 0x05); // Flags only affect first 3 bits for equals/hashCode
        ts2.setFlags((byte) 0x05);
        assertEquals(ts1.hashCode(), ts2.hashCode());
    }

    @Test
    public void testZipLongToIntConversion() {
        final ZipLong zipLong = new ZipLong(12345);
        assertEquals(12345, zipLong.getIntValue());
    }

    @Test
    public void testZipLongGetValue() {
        final ZipLong zipLong = new ZipLong(1234567890);
        assertEquals(1234567890L, zipLong.getValue());
    }

    @Test
    public void testGetLocalFileDataLength_WithAllTimestamps() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0x07); // All flags set
        ts.setModifyTime(new ZipLong(1));
        ts.setAccessTime(new ZipLong(2));
        ts.setCreateTime(new ZipLong(3));
        assertEquals(new ZipShort(1 + 4 + 4 + 4), ts.getLocalFileDataLength());
    }

    @Test
    public void testGetLocalFileDataLength_WithModifyOnly() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0x01); // Modify flag set
        ts.setModifyTime(new ZipLong(1));
        assertEquals(new ZipShort(1 + 4), ts.getLocalFileDataLength());
    }

    @Test
    public void testGetCentralDirectoryLength_WithModifyOnly() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0x01); // Modify flag set
        ts.setModifyTime(new ZipLong(1));
        assertEquals(new ZipShort(1 + 4), ts.getCentralDirectoryLength());
    }

    @Test
    public void testGetCentralDirectoryLength_WithAccessTimePresentButNotSet() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0x02); // Access flag set
        // Access time is not set, so it should not be included in the central directory length.
        // However, the flag itself is present, so length is 1 (for flags).
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength());
        // Local file data length calculation is correct:
        assertEquals(new ZipShort(1 + 4), ts.getLocalFileDataLength());
    }

    @Test
    public void testGetCentralDirectoryLength_WithCreateTimePresentButNotSet() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0x04); // Create flag set
        // Create time is not set, so it should not be included in the central directory length.
        // However, the flag itself is present, so length is 1 (for flags).
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength());
        // Local file data length calculation is correct:
        assertEquals(new ZipShort(1 + 4), ts.getLocalFileDataLength());
    }

    @Test
    public void testGetCentralDirectoryLength_NoFlagsSet() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        ts.setFlags((byte) 0x00);
        assertEquals(new ZipShort(1), ts.getCentralDirectoryLength()); // Only flags byte
    }

    @Test
    public void testSettersUpdateFlagsCorrectly() {
        final X5455_ExtendedTimestamp ts = new X5455_ExtendedTimestamp();
        assertEquals(0, ts.getFlags());

        ts.setModifyTime(new ZipLong(1000));
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, ts.getFlags());

        ts.setAccessTime(new ZipLong(2000));
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT | X5455_ExtendedTimestamp.ACCESS_TIME_BIT, ts.getFlags());

        ts.setCreateTime(new ZipLong(3000));
        assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT | X5455_ExtendedTimestamp.ACCESS_TIME_BIT | X5455_ExtendedTimestamp.CREATE_TIME_BIT, ts.getFlags());

        ts.setModifyTime(null); // Clear modify time
        assertEquals(X5455_ExtendedTimestamp.ACCESS_TIME_BIT | X5455_ExtendedTimestamp.CREATE_TIME_BIT, ts.getFlags());

        ts.setAccessTime(null); // Clear access time
        assertEquals(X5455_ExtendedTimestamp.CREATE_TIME_BIT, ts.getFlags());

        ts.setCreateTime(null); // Clear create time
        assertEquals(0, ts.getFlags());
    }
}
