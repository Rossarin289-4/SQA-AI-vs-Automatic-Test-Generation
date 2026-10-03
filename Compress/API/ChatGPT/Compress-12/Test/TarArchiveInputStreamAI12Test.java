package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveInputStreamAI12Test {

    @Test
    public void testGetRecordSize() {
        byte[] dummy = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(dummy);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 512, 1024);
        Assert.assertEquals(1024, tais.getRecordSize());
    }

    @Test
    public void testResetDoesNotThrow() {
        byte[] dummy = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(dummy);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.reset();
    }

    @Test
    public void testMatchesInvalidLength() {
        byte[] signature = new byte[10];
        boolean matches = TarArchiveInputStream.matches(signature, signature.length);
        Assert.assertFalse(matches);
    }
}
