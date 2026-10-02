package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

import org.junit.Assert;
import org.junit.Test;

public class Zip64ExtendedInformationExtraFieldAI19Test {

    @Test
    public void testHeaderId() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        Assert.assertEquals(new ZipShort(0x0001), field.getHeaderId());
    }

    @Test
    public void testGettersAndSetters() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compSize = new ZipEightByteInteger(50);
        ZipEightByteInteger rho = new ZipEightByteInteger(200);
        ZipLong disk = new ZipLong(5);

        field.setSize(size);
        field.setCompressedSize(compSize);
        field.setRelativeHeaderOffset(rho);
        field.setDiskStartNumber(disk);

        Assert.assertEquals(size, field.getSize());
        Assert.assertEquals(compSize, field.getCompressedSize());
        Assert.assertEquals(rho, field.getRelativeHeaderOffset());
        Assert.assertEquals(disk, field.getDiskStartNumber());
    }

    @Test
    public void testLengthsWithNulls() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        Assert.assertEquals(0, field.getLocalFileDataLength().getValue());
        Assert.assertEquals(0, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testLengthsWithSizes() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(10), new ZipEightByteInteger(5)
        );
        Assert.assertEquals(16, field.getLocalFileDataLength().getValue());
        Assert.assertEquals(16, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testLengthsAllFields() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(10),
            new ZipEightByteInteger(5),
            new ZipEightByteInteger(2),
            new ZipLong(1)
        );
        Assert.assertEquals(16, field.getLocalFileDataLength().getValue());
        // 3 DWORDs (8 bytes each) + 1 WORD (4 bytes) = 28 bytes
        Assert.assertEquals(28, field.getCentralDirectoryLength().getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataDataNullCompressedSize() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(10), null
        );
        field.getLocalFileDataData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataDataNullSize() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            null, new ZipEightByteInteger(5)
        );
        field.getLocalFileDataData();
    }

    @Test
    public void testParseFromLocalFileDataEmpty() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(new byte[0], 0, 0);
        Assert.assertNull(field.getSize());
        Assert.assertNull(field.getCompressedSize());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileDataTooShort() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buf = new byte[10];
        field.parseFromLocalFileData(buf, 0, 10);
    }

    @Test
    public void testParseAndGetLocalFileDataData() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(123456);
        ZipEightByteInteger compSize = new ZipEightByteInteger(654321);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compSize);

        byte[] data = field.getLocalFileDataData();
        Zip64ExtendedInformationExtraField parsed = new Zip64ExtendedInformationExtraField();
        parsed.parseFromLocalFileData(data, 0, data.length);

        Assert.assertEquals(size, parsed.getSize());
        Assert.assertEquals(compSize, parsed.getCompressedSize());
    }

    @Test
    public void testParseFromCentralDirectoryData3Dwords() throws ZipException {
        byte[] data = new byte[24];
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, 24);
        Assert.assertNotNull(field.getSize());
        Assert.assertNotNull(field.getCompressedSize());
        Assert.assertNotNull(field.getRelativeHeaderOffset());
    }

    @Test
    public void testParseFromCentralDirectoryDataDiskStartOnly() throws ZipException {
        // length % DWORD == WORD (e.g., length = 4)
        byte[] data = new byte[4];
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(data, 0, 4);
        Assert.assertNotNull(field.getDiskStartNumber());
    }

    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryDataLengthMismatch() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] data = new byte[8];
        field.parseFromCentralDirectoryData(data, 0, 8);
        // Expecting 16 bytes (two DWORDs) but data has only 8
        field.reparseCentralDirectoryData(true, true, false, false);
    }

    @Test
    public void testReparseCentralDirectoryDataSuccess() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(111);
        ZipEightByteInteger compSize = new ZipEightByteInteger(222);
        Zip64ExtendedInformationExtraField original = new Zip64ExtendedInformationExtraField(size, compSize);
        byte[] cdData = original.getCentralDirectoryData();

        Zip64ExtendedInformationExtraField parsed = new Zip64ExtendedInformationExtraField();
        parsed.parseFromCentralDirectoryData(cdData, 0, cdData.length);
        parsed.reparseCentralDirectoryData(true, true, false, false);

        Assert.assertEquals(size, parsed.getSize());
        Assert.assertEquals(compSize, parsed.getCompressedSize());
    }
}
