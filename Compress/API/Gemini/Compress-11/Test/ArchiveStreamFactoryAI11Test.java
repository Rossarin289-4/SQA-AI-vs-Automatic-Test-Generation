package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class ArchiveStreamFactoryAI11Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStreamNullName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream(null, in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInputStreamNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateInputStreamUnknownFormat() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream("unknown-format", in);
    }

    @Test
    public void testCreateInputStreamValidFormats() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();

        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.AR, new ByteArrayInputStream(new byte[1024])) instanceof ArArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, new ByteArrayInputStream(new byte[1024])) instanceof ZipArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.TAR, new ByteArrayInputStream(new byte[1024])) instanceof TarArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.JAR, new ByteArrayInputStream(new byte[1024])) instanceof JarArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, new ByteArrayInputStream(new byte[1024])) instanceof CpioArchiveInputStream);
        // DUMP input stream requires proper block headers during construction, skip explicit instance check here or test via valid signature.

        // Test case-insensitivity
        Assert.assertTrue(factory.createArchiveInputStream("ZiP", new ByteArrayInputStream(new byte[1024])) instanceof ZipArchiveInputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStreamNullName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        factory.createArchiveOutputStream(null, out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateOutputStreamNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateOutputStreamUnknownFormat() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        factory.createArchiveOutputStream("unknown-format", out);
    }

    @Test
    public void testCreateOutputStreamValidFormats() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.AR, out) instanceof ArArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, out) instanceof ZipArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, out) instanceof TarArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, out) instanceof JarArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, out) instanceof CpioArchiveOutputStream);

        // Test case-insensitivity
        Assert.assertTrue(factory.createArchiveOutputStream("tAr", out) instanceof TarArchiveOutputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetectInputStreamNull() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetectInputStreamNoMark() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream plainStream = new InputStream() {
            @Override
            public int read() {
                return -1;
            }
        };
        factory.createArchiveInputStream(plainStream);
    }

    @Test(expected = ArchiveException.class)
    public void testAutoDetectInputStreamNoArchiverFound() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        // A tiny array of random bytes that doesn't match any archive header or COMPRESS-117 heuristic
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5 });
        factory.createArchiveInputStream(in);
    }
}
