package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TarArchiveInputStreamAI37Test {

    @Test
    public void testDefaultConstructorAndRecordSize() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        Assert.assertNull(tais.getCurrentEntry());
    }

    @Test
    public void testConstructorsWithParameters() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais1 = new TarArchiveInputStream(bais, 512);
        Assert.assertEquals(512, tais1.getRecordSize());

        TarArchiveInputStream tais2 = new TarArchiveInputStream(bais, "UTF-8");
        Assert.assertEquals("UTF-8", tais2.encoding);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais2.getRecordSize());

        TarArchiveInputStream tais3 = new TarArchiveInputStream(bais, 1024, "UTF-8");
        Assert.assertEquals("UTF-8", tais3.encoding);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais3.getRecordSize());

        TarArchiveInputStream tais4 = new TarArchiveInputStream(bais, 1024, 512);
        Assert.assertEquals(512, tais4.getRecordSize());

        TarArchiveInputStream tais5 = new TarArchiveInputStream(bais, 1024, 512, "UTF-8");
        Assert.assertEquals("UTF-8", tais5.encoding);
        Assert.assertEquals(512, tais5.getRecordSize());
    }

    @Test
    public void testMarkSupportedAndMarkReset() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertFalse(tais.markSupported());
        tais.mark(100);
        tais.reset();
    }

    @Test
    public void testSkipNegativeOrZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(0L, tais.skip(0L));
        Assert.assertEquals(0L, tais.skip(-5L));
    }

    @Test
    public void testAvailableWithNoCurrentEntry() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(0, tais.available());
    }

    @Test
    public void testCanReadEntryDataWithTarArchiveEntry() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        TarArchiveEntry normalEntry = new TarArchiveEntry("test.txt");
        Assert.assertTrue(tais.canReadEntryData(normalEntry));
    }

    @Test
    public void testCanReadEntryDataWithNull() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void testMatchesWithTooShortSignature() {
        byte[] sig = new byte[10];
        Assert.assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesWithInvalidSignature() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        Assert.assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testClose() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.close();
        // verify no exception thrown on close
    }
}
