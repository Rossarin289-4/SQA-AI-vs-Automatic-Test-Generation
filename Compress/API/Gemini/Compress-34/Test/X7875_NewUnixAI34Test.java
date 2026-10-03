package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.util.zip.ZipException;

public class X7875_NewUnixAI34Test {

    @Test
    public void testGetHeaderId() {
        X7875_NewUnix x = new X7875_NewUnix();
        Assert.assertEquals(0x7875, x.getHeaderId().getValue());
    }

    @Test
    public void testGetAndSetUIDAndGID() {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(12345L);
        x.setGID(67890L);
        Assert.assertEquals(12345L, x.getUID());
        Assert.assertEquals(67890L, x.getGID());
    }

    @Test
    public void testGetCentralDirectoryLengthAndData() {
        X7875_NewUnix x = new X7875_NewUnix();
        Assert.assertEquals(0, x.getCentralDirectoryLength().getValue());
        Assert.assertNotNull(x.getCentralDirectoryData());
        Assert.assertEquals(0, x.getCentralDirectoryData().length);
    }

    @Test
    public void testGetLocalFileDataLengthAndData() {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(0L);
        x.setGID(0L);
        ZipShort len = x.getLocalFileDataLength();
        Assert.assertNotNull(len);
        byte[] data = x.getLocalFileDataData();
        Assert.assertNotNull(data);
        Assert.assertEquals(len.getValue(), data.length);
    }

    @Test
    public void testParseFromLocalFileData() throws ZipException {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(1001L);
        x.setGID(1002L);
        byte[] data = x.getLocalFileDataData();

        X7875_NewUnix x2 = new X7875_NewUnix();
        x2.parseFromLocalFileData(data, 0, data.length);
        Assert.assertEquals(1001L, x2.getUID());
        Assert.assertEquals(1002L, x2.getGID());
    }

    @Test
    public void testParseFromCentralDirectoryDataDoesNothing() throws ZipException {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(1000L);
        x.parseFromCentralDirectoryData(new byte[10], 0, 10);
        Assert.assertEquals(1000L, x.getUID());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(500L);
        x.setGID(600L);
        X7875_NewUnix clone = (X7875_NewUnix) x.clone();
        Assert.assertNotSame(x, clone);
        Assert.assertEquals(x, clone);
        Assert.assertEquals(500L, clone.getUID());
        Assert.assertEquals(600L, clone.getGID());
    }

    @Test
    public void testEqualsAndHashCode() {
        X7875_NewUnix x1 = new X7875_NewUnix();
        x1.setUID(100L);
        x1.setGID(200L);

        X7875_NewUnix x2 = new X7875_NewUnix();
        x2.setUID(100L);
        x2.setGID(200L);

        X7875_NewUnix x3 = new X7875_NewUnix();
        x3.setUID(101L);
        x3.setGID(200L);

        Assert.assertTrue(x1.equals(x2));
        Assert.assertEquals(x1.hashCode(), x2.hashCode());
        Assert.assertFalse(x1.equals(x3));
        Assert.assertFalse(x1.equals(null));
        Assert.assertFalse(x1.equals("some string"));
        Assert.assertTrue(x1.equals(x1));
    }

    @Test
    public void testToString() {
        X7875_NewUnix x = new X7875_NewUnix();
        x.setUID(1000L);
        x.setGID(1000L);
        String str = x.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("0x7875"));
        Assert.assertTrue(str.contains("UID=1000"));
        Assert.assertTrue(str.contains("GID=1000"));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength() {
        Assert.assertNull(X7875_NewUnix.trimLeadingZeroesForceMinLength(null));

        byte[] input1 = new byte[]{0, 0, 5, 6};
        byte[] trimmed1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(input1);
        Assert.assertNotNull(trimmed1);
        Assert.assertArrayEquals(new byte[]{5, 6}, trimmed1);

        byte[] input2 = new byte[]{0, 0, 0};
        byte[] trimmed2 = X7875_NewUnix.trimLeadingZeroesForceMinLength(input2);
        Assert.assertNotNull(trimmed2);
        Assert.assertEquals(1, trimmed2.length);
        Assert.assertEquals(0, trimmed2[0]);
    }
}
