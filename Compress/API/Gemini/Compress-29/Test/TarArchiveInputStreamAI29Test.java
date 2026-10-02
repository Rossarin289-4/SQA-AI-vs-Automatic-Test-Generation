package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TarArchiveInputStreamAI29Test {

    @Test
    public void testGetRecordSizeDefault() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
    }

    @Test
    public void testGetRecordSizeCustom() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 1024, 512);
        Assert.assertEquals(512, tais.getRecordSize());
    }

    @Test
    public void testMarkSupported() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertFalse(tais.markSupported());
    }

    @Test
    public void testMarkAndResetDoesNothing() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.mark(100);
        tais.reset();
        // Should not throw any exception
    }

    @Test
    public void testAvailableWithZeroEntrySize() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(0, tais.available());
    }

    @Test
    public void testSkipNegativeOrZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(0, tais.skip(0));
        Assert.assertEquals(0, tais.skip(-5));
    }

    @Test
    public void testCanReadEntryDataWithNullOrNonTarEntry() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertFalse(tais.canReadEntryData(null));
        
        org.apache.commons.compress.archivers.ArchiveEntry nonTarEntry = new org.apache.commons.compress.archivers.ArchiveEntry() {
            public String getName() { return "test"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
        };
        Assert.assertFalse(tais.canReadEntryData(nonTarEntry));
    }

    @Test
    public void testMatchesNullOrShortSignature() {
        Assert.assertFalse(TarArchiveInputStream.matches(null, 0));
        Assert.assertFalse(TarArchiveInputStream.matches(new byte[10], 10));
    }

    @Test
    public void testMatchesValidTarSignatures() {
        byte[] sigPosix = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, sigPosix, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, sigPosix, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sigPosix, sigPosix.length));

        byte[] sigGnuSpace = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, sigGnuSpace, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, sigGnuSpace, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sigGnuSpace, sigGnuSpace.length));

        byte[] sigAnt = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, sigAnt, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, sigAnt, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sigAnt, sigAnt.length));
    }
}
