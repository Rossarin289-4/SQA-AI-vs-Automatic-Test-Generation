package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TarArchiveInputStreamAI12Test {

    @Test
    public void testMatchesNullAndShortSignature() {
        Assert.assertFalse(TarArchiveInputStream.matches(null, 0));
        byte[] shortSig = new byte[10];
        Assert.assertFalse(TarArchiveInputStream.matches(shortSig, shortSig.length));
    }

    @Test
    public void testMatchesPosix() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        byte[] magic = TarConstants.MAGIC_POSIX.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, Math.min(magic.length, TarConstants.MAGICLEN));
        byte[] version = TarConstants.VERSION_POSIX.getBytes();
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, Math.min(version.length, TarConstants.VERSIONLEN));

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuSpace() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        byte[] magic = TarConstants.MAGIC_GNU.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, Math.min(magic.length, TarConstants.MAGICLEN));
        byte[] version = TarConstants.VERSION_GNU_SPACE.getBytes();
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, Math.min(version.length, TarConstants.VERSIONLEN));

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuZero() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        byte[] magic = TarConstants.MAGIC_GNU.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, Math.min(magic.length, TarConstants.MAGICLEN));
        byte[] version = TarConstants.VERSION_GNU_ZERO.getBytes();
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, Math.min(version.length, TarConstants.VERSIONLEN));

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesAnt() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        byte[] magic = TarConstants.MAGIC_ANT.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, Math.min(magic.length, TarConstants.MAGICLEN));
        byte[] version = TarConstants.VERSION_ANT.getBytes();
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, Math.min(version.length, TarConstants.VERSIONLEN));

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testConstructorsAndGetters() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais1 = new TarArchiveInputStream(bais);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais1.getRecordSize());

        ByteArrayInputStream bais2 = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais2 = new TarArchiveInputStream(bais2, 1024);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais2.getRecordSize());

        ByteArrayInputStream bais3 = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais3 = new TarArchiveInputStream(bais3, 1024, 512);
        Assert.assertEquals(512, tais3.getRecordSize());
    }

    @Test
    public void testResetDoesNothing() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.reset();
        Assert.assertTrue(true);
    }

    @Test
    public void testCanReadEntryDataNull() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void testGetNextTarEntryEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        Assert.assertNull(tais.getCurrentEntry());
        Assert.assertTrue(tais.isAtEOF());
    }

    @Test
    public void testAvailableWithNoCurrentEntry() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        Assert.assertEquals(0, tais.available());
    }
}
