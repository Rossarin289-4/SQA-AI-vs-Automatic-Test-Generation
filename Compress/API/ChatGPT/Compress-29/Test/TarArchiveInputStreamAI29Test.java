package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TarArchiveInputStreamAI29Test {

    @Test
    public void testGetRecordSize() {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 512, 1024);
        assertEquals(1024, tais.getRecordSize());
    }

    @Test
    public void testConstructorWithEncoding() {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, "UTF-8");
        assertEquals("UTF-8", tais.encoding);
        assertNotNull(tais.getCurrentEntry() == null ? new Object() : null);
    }

    @Test(expected = IllegalStateException.class)
    public void testReadWithoutCurrentEntryThrowsException() throws IOException {
        byte[] data = new byte[10];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        byte[] buf = new byte[5];
        tais.read(buf, 0, 5);
    }
}
