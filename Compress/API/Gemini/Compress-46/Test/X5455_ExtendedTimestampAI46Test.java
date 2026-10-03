package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.zip.ZipException;

public class X5455_ExtendedTimestampAI46Test {

    @Test
    public void testHeaderId() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        Assert.assertEquals(0x5455, ext.getHeaderId().getValue());
    }

    @Test
    public void testDefaultLengthsAndData() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        Assert.assertEquals(1, ext.getLocalFileDataLength().getValue());
        Assert.assertEquals(1, ext.getCentralDirectoryLength().getValue());
        
        byte[] localData = ext.getLocalFileDataData();
        Assert.assertNotNull(localData);
        Assert.assertEquals(1, localData.length);
        Assert.assertEquals(0, localData[0]);

        byte[] centralData = ext.getCentralDirectoryData();
        Assert.assertNotNull(centralData);
        Assert.assertEquals(1, centralData.length);
        Assert.assertEquals(0, centralData[0]);
    }

    @Test
    public void testSetModifyTime() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        ZipLong time = new ZipLong(123456789L);
        ext.setModifyTime(time);

        Assert.assertTrue(ext.isBit0_modifyTimePresent());
        Assert.assertEquals(time, ext.getModifyTime());
        Assert.assertEquals(5, ext.getLocalFileDataLength().getValue());
        Assert.assertEquals(5, ext.getCentralDirectoryLength().getValue());

        byte[] localData = ext.getLocalFileDataData();
        Assert.assertEquals(5, localData.length);
        Assert.assertEquals(X5455_ExtendedTimestamp.MODIFY_TIME_BIT, localData[0]);

        ext.setModifyTime(null);
        Assert.assertFalse(ext.isBit0_modifyTimePresent());
        Assert.assertNull(ext.getModifyTime());
        Assert.assertEquals(1, ext.getLocalFileDataLength().getValue());
    }

    @Test
    public void testSetAccessAndCreateTimes() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        ZipLong modTime = new ZipLong(100L);
        ZipLong accTime = new ZipLong(200L);
        ZipLong creTime = new ZipLong(300L);

        ext.setModifyTime(modTime);
        ext.setAccessTime(accTime);
        ext.setCreateTime(creTime);

        Assert.assertTrue(ext.isBit0_modifyTimePresent());
        Assert.assertTrue(ext.isBit1_accessTimePresent());
        Assert.assertTrue(ext.isBit2_createTimePresent());

        // Local length: 1 (flags) + 4 (mod) + 4 (acc) + 4 (cre) = 13
        Assert.assertEquals(13, ext.getLocalFileDataLength().getValue());
        // Central length: 1 (flags) + 4 (mod) = 5 (access and create are omitted in central)
        Assert.assertEquals(5, ext.getCentralDirectoryLength().getValue());

        byte[] localData = ext.getLocalFileDataData();
        Assert.assertEquals(13, localData.length);
        int expectedFlags = X5455_ExtendedTimestamp.MODIFY_TIME_BIT 
                | X5455_ExtendedTimestamp.ACCESS_TIME_BIT 
                | X5455_ExtendedTimestamp.CREATE_TIME_BIT;
        Assert.assertEquals(expectedFlags, localData[0]);

        byte[] centralData = ext.getCentralDirectoryData();
        Assert.assertEquals(5, centralData.length);
    }

    @Test
    public void testJavaDateSettersAndGetters() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        Date date = new Date(1000000L); // 1000 seconds since epoch
        ext.setModifyJavaTime(date);
        ext.setAccessJavaTime(date);
        ext.setCreateJavaTime(date);

        Assert.assertEquals(new Date(1000000L), ext.getModifyJavaTime());
        Assert.assertEquals(new Date(1000000L), ext.getAccessJavaTime());
        Assert.assertEquals(new Date(1000000L), ext.getCreateJavaTime());

        ext.setModifyJavaTime(null);
        Assert.assertNull(ext.getModifyJavaTime());
        ext.setAccessJavaTime(null);
        Assert.assertNull(ext.getAccessJavaTime());
        ext.setCreateJavaTime(null);
        Assert.assertNull(ext.getCreateJavaTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateToZipLongTooLarge() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        // Exceeds Integer.MAX_VALUE seconds
        ext.setModifyJavaTime(new Date((((long) Integer.MAX_VALUE) + 10L) * 1000L));
    }

    @Test
    public void testParseFromLocalFileData() throws ZipException {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        // Flags byte with modify time bit set (1), followed by 4 bytes of time (value 50)
        byte[] data = new byte[] { 0x01, 0x32, 0x00, 0x00, 0x00 };
        ext.parseFromLocalFileData(data, 0, data.length);

        Assert.assertTrue(ext.isBit0_modifyTimePresent());
        Assert.assertNotNull(ext.getModifyTime());
        Assert.assertEquals(50, ext.getModifyTime().getValue());
    }

    @Test
    public void testParseFromCentralDirectoryData() throws ZipException {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        byte[] data = new byte[] { 0x01, 0x64, 0x00, 0x00, 0x00 };
        ext.parseFromCentralDirectoryData(data, 0, data.length);

        Assert.assertTrue(ext.isBit0_modifyTimePresent());
        Assert.assertEquals(100, ext.getModifyTime().getValue());
    }

    @Test
    public void testEqualsAndHashCode() {
        X5455_ExtendedTimestamp ext1 = new X5455_ExtendedTimestamp();
        X5455_ExtendedTimestamp ext2 = new X5455_ExtendedTimestamp();

        Assert.assertTrue(ext1.equals(ext2));
        Assert.assertEquals(ext1.hashCode(), ext2.hashCode());

        ZipLong time = new ZipLong(555L);
        ext1.setModifyTime(time);
        Assert.assertFalse(ext1.equals(ext2));

        ext2.setModifyTime(time);
        Assert.assertTrue(ext1.equals(ext2));
        Assert.assertEquals(ext1.hashCode(), ext2.hashCode());

        Assert.assertFalse(ext1.equals(new Object()));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        ext.setModifyTime(new ZipLong(999L));
        X5455_ExtendedTimestamp clone = (X5455_ExtendedTimestamp) ext.clone();

        Assert.assertNotSame(ext, clone);
        Assert.assertEquals(ext, clone);
    }

    @Test
    public void testToString() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        ext.setModifyTime(new ZipLong(1000L));
        ext.setAccessTime(new ZipLong(2000L));
        ext.setCreateTime(new ZipLong(3000L));

        String str = ext.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("0x5455 Zip Extra Field"));
        Assert.assertTrue(str.contains("Modify:"));
        Assert.assertTrue(str.contains("Access:"));
        Assert.assertTrue(str.contains("Create:"));
    }
}
