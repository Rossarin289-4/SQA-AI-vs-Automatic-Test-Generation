package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TarArchiveInputStreamAI32Test {

    @Test
    public void testGetRecordSize() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 512, 1024, "UTF-8");
        assertEquals(1024, tais.getRecordSize());
        assertEquals("UTF-8", tais.encoding);
    }

    @Test
    public void testMatchesInvalidLength() {
        byte[] signature = new byte[10];
        boolean matches = TarArchiveInputStream.matches(signature, signature.length);
        assertTrue(!matches);
    }

    @Test
    public void testConstructorsDefaults() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        assertNotNull(tais);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
    }
}
