package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class TarArchiveOutputStreamAI9Test {

    @Test(expected = IOException.class)
    public void testFinishTwiceThrowsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut = new TarArchiveOutputStream(out);
        tarOut.finish();
        tarOut.finish();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutOpenThrowsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut = new TarArchiveOutputStream(out);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testGetRecordSize() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut = new TarArchiveOutputStream(out, 512, 512);
        assertEquals(512, tarOut.getRecordSize());
    }
}
