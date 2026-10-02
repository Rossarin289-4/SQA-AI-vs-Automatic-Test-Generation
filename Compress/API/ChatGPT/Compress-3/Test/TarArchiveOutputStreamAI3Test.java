package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TarArchiveOutputStreamAI3Test {

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntryThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.finish();
    }

    @Test
    public void testGetRecordSize() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos, 512, 1024);
        org.junit.Assert.assertEquals(1024, taos.getRecordSize());
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileErrorMode() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        
        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            longName.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        taos.putArchiveEntry(entry);
    }
}
