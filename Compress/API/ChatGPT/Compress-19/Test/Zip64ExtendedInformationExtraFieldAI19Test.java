package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.util.zip.ZipException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class Zip64ExtendedInformationExtraFieldAI19Test {

    @Test
    public void testGetHeaderId() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(Zip64ExtendedInformationExtraField.HEADER_ID, field.getHeaderId());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileDataThrowsExceptionWhenLengthTooSmall() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] data = new byte[10];
        field.parseFromLocalFileData(data, 0, 10);
    }

    @Test
    public void testSettersAndGetters() {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compSize = new ZipEightByteInteger(50);
        ZipEightByteInteger offset = new ZipEightByteInteger(10);
        ZipLong disk = new ZipLong(1);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compSize, offset, disk);
        assertEquals(size, field.getSize());
        assertEquals(compSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertEquals(disk, field.getDiskStartNumber());
    }
}
