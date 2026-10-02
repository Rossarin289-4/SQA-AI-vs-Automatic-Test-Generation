package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class TarArchiveInputStreamAI28Test {

    @Test
    public void testDefaultConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertNotNull(tais);
        Assert.assertEquals(512, tais.getRecordSize());
    }

    @Test
    public void testEncodingConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, "UTF-8");
        Assert.assertNotNull(tais);
        Assert.assertEquals(512, tais.getRecordSize());
    }

    @Test
    public void testBlockSizeConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 1024);
        Assert.assertNotNull(tais);
        Assert.assertEquals(512, tais.getRecordSize());
    }

    @Test
    public void testBlockSizeAndEncodingConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 1024, "UTF-8");
        Assert.assertNotNull(tais);
        Assert.assertEquals(512, tais.getRecordSize());
    }

    @Test
    public void testFullParamsConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 1024, 512, "UTF-8");
        Assert.assertNotNull(tais);
        Assert.assertEquals(512, tais.getRecordSize());
    }

    @Test
    public void testMatchesNullSignature() {
        boolean matches = TarArchiveInputStream.matches(null, 0);
        Assert.assertFalse(matches);
    }

    @Test
    public void testMatchesShortSignature() {
        byte[] sig = new byte[10];
        boolean matches = TarArchiveInputStream.matches(sig, sig.length);
        Assert.assertFalse(matches);
    }

    @Test
    public void testCanReadEntryDataWithNullOrNonTarEntry() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        
        Assert.assertFalse(tais.canReadEntryData(null));
        
        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            public String getName() { return "test"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public Date getLastModifiedDate() { return new Date(); }
        };
        Assert.assertFalse(tais.canReadEntryData(nonTarEntry));
    }

    @Test
    public void testResetMethodDoesNothing() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.reset(); // Should execute without throwing any exception
        Assert.assertTrue(true);
    }

    @Test
    public void testAvailableWithZeroEntry() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(0, tais.available());
    }
}
