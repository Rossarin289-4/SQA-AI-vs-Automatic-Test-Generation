package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TarArchiveInputStreamAI32Test {

    @Test
    public void testGetRecordSize() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, 512, 1024);
        Assert.assertEquals(1024, tais.getRecordSize());
    }

    @Test
    public void testDefaultConstructorsAndEncoding() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais1 = new TarArchiveInputStream(is);
        Assert.assertNull(tais1.encoding);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais1.getRecordSize());

        TarArchiveInputStream tais2 = new TarArchiveInputStream(is, "UTF-8");
        Assert.assertEquals("UTF-8", tais2.encoding);

        TarArchiveInputStream tais3 = new TarArchiveInputStream(is, 1024, "UTF-8");
        Assert.assertEquals("UTF-8", tais3.encoding);
    }

    @Test
    public void testMarkSupported() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        Assert.assertFalse(tais.markSupported());
    }

    @Test
    public void testMarkAndResetDoesNothing() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.mark(10);
        tais.reset();
        // Just ensuring no exceptions are thrown
    }

    @Test
    public void testSkipNegativeOrZero() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        Assert.assertEquals(0L, tais.skip(0));
        Assert.assertEquals(0L, tais.skip(-5));
    }

    @Test
    public void testAvailableWithNoCurrentEntry() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        // entrySize and entryOffset are both 0 initially
        Assert.assertEquals(0, tais.available());
    }

    @Test
    public void testCanReadEntryDataWithNullOrNonTar() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        Assert.assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void testMatchesInvalidLength() {
        byte[] signature = new byte[10];
        Assert.assertFalse(TarArchiveInputStream.matches(signature, 5));
    }

    @Test
    public void testMatchesValidPosix() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        
        boolean matches = TarArchiveInputStream.matches(signature, signature.length);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMatchesValidGnuSpace() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        
        boolean matches = TarArchiveInputStream.matches(signature, signature.length);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMatchesValidAnt() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        
        boolean matches = TarArchiveInputStream.matches(signature, signature.length);
        Assert.assertTrue(matches);
    }
}
