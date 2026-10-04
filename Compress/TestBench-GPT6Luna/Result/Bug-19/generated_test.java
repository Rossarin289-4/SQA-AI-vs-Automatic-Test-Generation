package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.zip.ZipException;

public class Zip64ExtendedInformationExtraFieldTest {
    @Test
    public void testHeaderId() throws Exception {
        assertEquals(1, new Zip64ExtendedInformationExtraField().getHeaderId().getValue());
    }

    @Test
    public void testEmptyLengthsAndData() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(0, field.getLocalFileDataLength().getValue());
        assertEquals(0, field.getCentralDirectoryLength().getValue());
        assertEquals(0, field.getLocalFileDataData().length);
        assertEquals(0, field.getCentralDirectoryData().length);
    }

    @Test
    public void testSizesOnlyLengthsAndSerialization() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger compressed = new ZipEightByteInteger(2L);
        Zip64ExtendedInformationExtraField field =
            new Zip64ExtendedInformationExtraField(size, compressed);
        assertEquals(16, field.getLocalFileDataLength().getValue());
        assertEquals(16, field.getCentralDirectoryLength().getValue());
        assertArrayEquals(field.getLocalFileDataData(), field.getCentralDirectoryData());
        assertEquals(1L, ZipEightByteInteger.getLongValue(field.getLocalFileDataData(), 0));
        assertEquals(2L, ZipEightByteInteger.getLongValue(field.getLocalFileDataData(), 8));
    }

    @Test
    public void testAllFieldsCentralDirectorySerialization() throws Exception {
        Zip64ExtendedInformationExtraField field =
            new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L),
                new ZipEightByteInteger(2L), new ZipEightByteInteger(3L),
                new ZipLong(4L));
        byte[] data = field.getCentralDirectoryData();
        assertEquals(28, data.length);
        assertEquals(1L, ZipEightByteInteger.getLongValue(data, 0));
        assertEquals(2L, ZipEightByteInteger.getLongValue(data, 8));
        assertEquals(3L, ZipEightByteInteger.getLongValue(data, 16));
        assertEquals(4L, ZipLong.getValue(data, 24));
    }

    @Test
    public void testLocalDataRequiresBothSizesWhenOnlySizeSet() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setSize(new ZipEightByteInteger(1L));
        assertEquals(8, field.getCentralDirectoryLength().getValue());
        try {
            field.getLocalFileDataData();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testLocalDataRequiresBothSizesWhenOnlyCompressedSizeSet() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setCompressedSize(new ZipEightByteInteger(2L));
        assertEquals(8, field.getCentralDirectoryLength().getValue());
        try {
            field.getLocalFileDataData();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testLocalParseRejectsLengthBelowBothSizes() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        try {
            field.parseFromLocalFileData(new byte[15], 0, 15);
            fail("expected ZipException");
        } catch (ZipException expected) { }
        assertNull(field.getSize());
    }

    @Test
    public void testLocalParseAcceptsExactTwoSizes() throws Exception {
        byte[] data = new byte[16];
        System.arraycopy(new ZipEightByteInteger(11L).getBytes(), 0, data, 0, 8);
        System.arraycopy(new ZipEightByteInteger(12L).getBytes(), 0, data, 8, 8);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(data, 0, 16);
        assertEquals(11L, field.getSize().getLongValue());
        assertEquals(12L, field.getCompressedSize().getLongValue());
        assertNull(field.getRelativeHeaderOffset());
    }

    @Test
    public void testLocalParseAddsOffsetAndDiskAtTheirLengths() throws Exception {
        byte[] data = new byte[28];
        System.arraycopy(new ZipEightByteInteger(1L).getBytes(), 0, data, 0, 8);
        System.arraycopy(new ZipEightByteInteger(2L).getBytes(), 0, data, 8, 8);
        System.arraycopy(new ZipEightByteInteger(3L).getBytes(), 0, data, 16, 8);
        System.arraycopy(new ZipLong(4L).getBytes(), 0, data, 24, 4);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(data, 0, 28);
        assertEquals(3L, field.getRelativeHeaderOffset().getLongValue());
        assertEquals(4L, field.getDiskStartNumber().getValue());
    }

    @Test
    public void testCentralParseLengthTwentyFourReadsSizesAndOffset() throws Exception {
        byte[] data = new byte[24];
        System.arraycopy(new ZipEightByteInteger(5L).getBytes(), 0, data, 0, 8);
        System.arraycopy(new ZipEightByteInteger(6L).getBytes(), 0, data, 8, 8);
        System.arraycopy(new ZipEightByteInteger(7L).getBytes(), 0, data, 16, 8);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, 24);
        assertEquals(5L, field.getSize().getLongValue());
        assertEquals(6L, field.getCompressedSize().getLongValue());
        assertEquals(7L, field.getRelativeHeaderOffset().getLongValue());
    }

    @Test
    public void testCentralParseDiskOnlyLength() throws Exception {
        byte[] data = { 9, 0, 0, 0 };
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, 4);
        assertEquals(9L, field.getDiskStartNumber().getValue());
        assertNull(field.getSize());
    }

    @Test
    public void testCentralParseCompleteFieldsThenReparseSelectedFields() throws Exception {
        byte[] data = new byte[28];
        System.arraycopy(new ZipEightByteInteger(10L).getBytes(), 0, data, 0, 8);
        System.arraycopy(new ZipEightByteInteger(20L).getBytes(), 0, data, 8, 8);
        System.arraycopy(new ZipEightByteInteger(30L).getBytes(), 0, data, 16, 8);
        System.arraycopy(new ZipLong(40L).getBytes(), 0, data, 24, 4);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, data.length);
        assertEquals(10L, field.getSize().getLongValue());
        field.reparseCentralDirectoryData(false, true, false, true);
        assertEquals(10L, field.getCompressedSize().getLongValue());
        assertEquals(30L, field.getDiskStartNumber().getValue());
        assertEquals(30L, field.getRelativeHeaderOffset().getLongValue());
    }

    @Test
    public void testReparseRejectsInsufficientRawDataLength() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(new byte[8], 0, 8);
        try {
            field.reparseCentralDirectoryData(true, true, false, false);
            fail("expected ZipException");
        } catch (ZipException expected) { }
    }

    @Test
    public void testReparseCanSelectOnlyDiskStart() throws Exception {
        byte[] data = { 7, 0, 0, 0 };
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, data.length);
        field.reparseCentralDirectoryData(false, false, false, true);
        assertEquals(7L, field.getDiskStartNumber().getValue());
    }

    @Test
    public void testSettersAndGetters() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(1L);
        ZipEightByteInteger compressed = new ZipEightByteInteger(2L);
        ZipEightByteInteger offset = new ZipEightByteInteger(3L);
        ZipLong disk = new ZipLong(4L);
        field.setSize(size);
        field.setCompressedSize(compressed);
        field.setRelativeHeaderOffset(offset);
        field.setDiskStartNumber(disk);
        assertSame(size, field.getSize());
        assertSame(compressed, field.getCompressedSize());
        assertSame(offset, field.getRelativeHeaderOffset());
        assertSame(disk, field.getDiskStartNumber());
    }

    @Test
    public void testSettersToNullRemoveCentralData() throws Exception {
        Zip64ExtendedInformationExtraField field =
            new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L),
                new ZipEightByteInteger(2L), new ZipEightByteInteger(3L),
                new ZipLong(4L));
        field.setSize(null);
        field.setCompressedSize(null);
        field.setRelativeHeaderOffset(null);
        field.setDiskStartNumber(null);
        assertEquals(0, field.getCentralDirectoryLength().getValue());
        assertEquals(0, field.getCentralDirectoryData().length);
    }
}
