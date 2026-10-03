package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class ArchiveStreamFactoryAI16Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullName() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullStream() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamUnknownName() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream("unknown-format", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveInputStreamValidNames() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[512]);

        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.AR, bais) instanceof ArArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, bais) instanceof ZipArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.TAR, bais) instanceof TarArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.JAR, bais) instanceof JarArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, bais) instanceof CpioArchiveInputStream);

        // Test case-insensitivity
        Assert.assertTrue(factory.createArchiveInputStream("ZiP", bais) instanceof ZipArchiveInputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullName() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullStream() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamUnknownName() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream("unknown-format", new ByteArrayOutputStream());
    }

    @Test
    public void testCreateArchiveOutputStreamValidNames() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.AR, baos) instanceof ArArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, baos) instanceof ZipArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, baos) instanceof TarArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, baos) instanceof JarArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, baos) instanceof CpioArchiveOutputStream);

        // Test case-insensitivity
        Assert.assertTrue(factory.createArchiveOutputStream("tAr", baos) instanceof TarArchiveOutputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetectNullStream() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutoDetectMarkNotSupported() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream noMarkStream = new InputStream() {
            @Override
            public int read() {
                return -1;
            }
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createArchiveInputStream(noMarkStream);
    }

    @Test(expected = ArchiveException.class)
    public void testAutoDetectNoArchiverFound() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 });
        factory.createArchiveInputStream(bais);
    }
}
