package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.zip.ZipException;

public class X7875_NewUnixTest {
    @Test
    public void testDefaultsAndHeader() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        assertEquals(0x7875, field.getHeaderId().getValue());
        assertEquals(1000L, field.getUID());
        assertEquals(1000L, field.getGID());
    }

    @Test
    public void testSetZeroValuesAndMinimumEncoding() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(0);
        field.setGID(0);
        assertEquals(0, field.getUID());
        assertEquals(0, field.getGID());
        assertArrayEquals(new byte[] {1, 1, 0, 1, 0}, field.getLocalFileDataData());
        assertEquals(5, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testEncodeOneByteValues() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(1);
        field.setGID(2);
        assertArrayEquals(new byte[] {1, 1, 1, 1, 2}, field.getLocalFileDataData());
        assertEquals(5, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testEncodeAtOneByteUnsignedMaximum() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(255);
        field.setGID(255);
        assertArrayEquals(new byte[] {1, 1, -1, 1, -1}, field.getLocalFileDataData());
        assertEquals(5, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testEncodeFirstTwoByteValue() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(256);
        field.setGID(256);
        assertArrayEquals(new byte[] {1, 2, 0, 1, 2, 1, 2}, field.getLocalFileDataData());
        assertEquals(7, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testEncodePositiveSignBoundary() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(127);
        field.setGID(128);
        assertArrayEquals(new byte[] {1, 1, 127, 1, -128}, field.getLocalFileDataData());
        assertEquals(5, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testEncodeUnsignedIntMaximumAndFirstAbove() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(4294967295L);
        field.setGID(4294967296L);
        assertArrayEquals(new byte[] {
            1, 4, -1, -1, -1, -1, 1, 5, 0, 0, 0, 1
        }, field.getLocalFileDataData());
        assertEquals(12, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testEncodeLongMaximum() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, field.getUID());
        assertEquals(9, field.getLocalFileDataLength().getValue());
        assertArrayEquals(new byte[] {
            1, 8, -1, -1, -1, -1, -1, -1, -1, 127, 1, 1, 0
        }, field.getLocalFileDataData());
    }

    @Test
    public void testNegativeSetterValueRoundTrips() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(-1);
        field.setGID(-128);
        assertEquals(4294967295L, field.getUID());
        assertEquals(4294967168L, field.getGID());
    }

    @Test
    public void testCentralDirectoryIsEmptyAndLengthZero() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        assertArrayEquals(new byte[0], field.getCentralDirectoryData());
        assertEquals(0, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testParseLocalDataWithOffset() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        byte[] data = {99, 1, 2, 0, 1, 1, 1, 42, 99};
        field.parseFromLocalFileData(data, 1, 7);
        assertEquals(256, field.getUID());
        assertEquals(42, field.getGID());
        assertArrayEquals(new byte[] {1, 2, 0, 1, 1, 1, 42}, field.getLocalFileDataData());
    }

    @Test
    public void testParseLittleEndianUnsignedBytes() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.parseFromLocalFileData(new byte[] {1, 2, 0, 1, 1, -1}, 0, 6);
        assertEquals(256, field.getUID());
        assertEquals(255, field.getGID());
    }

    @Test
    public void testParseEmptyUidAndGidSizes() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.parseFromLocalFileData(new byte[] {1, 0, 0}, 0, 3);
        assertEquals(0, field.getUID());
        assertEquals(0, field.getGID());
        assertArrayEquals(new byte[] {1, 1, 0, 1, 0}, field.getLocalFileDataData());
    }

    @Test
    public void testParseResetsValuesBeforeReplacingThem() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(99);
        field.setGID(88);
        field.parseFromLocalFileData(new byte[] {1, 1, 7, 1, 8}, 0, 5);
        assertEquals(7, field.getUID());
        assertEquals(8, field.getGID());
    }

    @Test
    public void testCentralParseLeavesValuesUnchanged() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(12);
        field.setGID(34);
        field.parseFromCentralDirectoryData(new byte[] {1, 2}, 0, 2);
        assertEquals(12, field.getUID());
        assertEquals(34, field.getGID());
    }

    @Test
    public void testEqualFieldsHaveEqualHashes() throws Exception {
        X7875_NewUnix first = new X7875_NewUnix();
        X7875_NewUnix second = new X7875_NewUnix();
        first.setUID(123);
        first.setGID(456);
        second.setUID(123);
        second.setGID(456);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEqualityChangesWithUidOrGid() throws Exception {
        X7875_NewUnix first = new X7875_NewUnix();
        X7875_NewUnix second = new X7875_NewUnix();
        first.setUID(7);
        first.setGID(8);
        second.setUID(7);
        second.setGID(9);
        assertFalse(first.equals(second));
        second.setUID(6);
        second.setGID(8);
        assertFalse(first.equals(second));
    }

    @Test
    public void testNotEqualToNullOrOtherType() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        assertFalse(field.equals(null));
        assertFalse(field.equals("not a field"));
    }

    @Test
    public void testCloneIsEqualAndIndependentAfterMutation() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(41);
        field.setGID(42);
        X7875_NewUnix copy = (X7875_NewUnix) field.clone();
        assertEquals(field, copy);
        copy.setUID(43);
        assertEquals(41, field.getUID());
        assertEquals(43, copy.getUID());
        assertFalse(field.equals(copy));
    }

    @Test
    public void testToStringShowsHeaderUidAndGid() throws Exception {
        X7875_NewUnix field = new X7875_NewUnix();
        field.setUID(12);
        field.setGID(34);
        assertEquals("0x7875 Zip Extra Field: UID=12 GID=34", field.toString());
    }

    @Test
    public void testTrimLeadingZerosToMinimumLength() throws Exception {
        assertArrayEquals(new byte[] {0}, X7875_NewUnix.trimLeadingZeroesForceMinLength(new byte[] {0, 0}));
        assertArrayEquals(new byte[] {1}, X7875_NewUnix.trimLeadingZeroesForceMinLength(new byte[] {0, 1}));
    }

    @Test
    public void testTrimPreservesNonzeroTail() throws Exception {
        assertArrayEquals(new byte[] {1, 2}, X7875_NewUnix.trimLeadingZeroesForceMinLength(new byte[] {0, 1, 2}));
    }

    @Test
    public void testTrimNullReturnsNull() throws Exception {
        assertNull(X7875_NewUnix.trimLeadingZeroesForceMinLength(null));
    }
}
