package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import org.junit.Test;

public class TarArchiveOutputStreamAI29Test {

    @Test
    public void testDefaultConstructor() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        org.junit.Assert.assertNotNull(tos);
    }

    @Test
    public void testConstructorWithEncoding() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, "UTF-8");
        org.junit.Assert.assertEquals("UTF-8", tos.encoding);
    }

    @Test(expected = RuntimeException.class)
    public void testBigNumberErrorModeThrowsException() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tos.putArchiveEntry(entry);
    }
}
