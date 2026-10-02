package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class X5455_ExtendedTimestampAI46Test {

    @Test
    public void testHeaderId() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        assertEquals(new ZipShort(0x5455), ext.getHeaderId());
    }

    @Test
    public void testModifyTimeAndLocalFileLength() {
        X5455_ExtendedTimestamp ext = new X5455_ExtendedTimestamp();
        assertEquals(1, ext.getLocalFileDataLength().getValue());

        ext.setModifyTime(new ZipLong(123456789));
        assertEquals(5, ext.getLocalFileDataLength().getValue());
    }

    @Test
    public void testEqualsAndClone() throws Exception {
        X5455_ExtendedTimestamp ext1 = new X5455_ExtendedTimestamp();
        ext1.setModifyTime(new ZipLong(1000));

        X5455_ExtendedTimestamp ext2 = (X5455_ExtendedTimestamp) ext1.clone();
        assertEquals(ext1, ext2);
        assertEquals(ext1.hashCode(), ext2.hashCode());
    }
}
