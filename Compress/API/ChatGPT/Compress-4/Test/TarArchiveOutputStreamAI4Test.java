package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TarArchiveOutputStreamAI4Test {

    @Test
    public void testGetRecordSize() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut = new TarArchiveOutputStream(out);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarOut.getRecordSize());
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntryThrowsException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut = new TarArchiveOutputStream(out);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        tarOut.finish();
    }

    @Test
    public void testSetLongFileModeErrorThrowsRuntimeException() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TarArchiveOutputStream tarOut = new TarArchiveOutputStream(out);
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        
        StringBuilder longName = new StringBuilder();
        for (int i = 0; i <= TarConstants.NAMELEN; i++) {
            longName.append("a");
        }
        
        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        try {
            tarOut.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name in ERROR mode");
        } catch (RuntimeException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }
}
