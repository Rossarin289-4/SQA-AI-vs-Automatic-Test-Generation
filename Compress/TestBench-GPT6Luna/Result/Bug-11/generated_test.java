package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

public class ArchiveStreamFactoryTest {
    @Test
    public void testCreateArInput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveInputStream("ar",
                new ByteArrayInputStream(new byte[0])) instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateZipInputCaseInsensitive() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveInputStream("ZiP",
                new ByteArrayInputStream(new byte[0])) instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateTarInput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveInputStream("tar",
                new ByteArrayInputStream(new byte[0])) instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateJarInput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveInputStream("jar",
                new ByteArrayInputStream(new byte[0])) instanceof JarArchiveInputStream);
    }

    @Test
    public void testCreateCpioInput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveInputStream("cpio",
                new ByteArrayInputStream(new byte[0])) instanceof CpioArchiveInputStream);
    }

    @Test
    public void testCreateDumpInput() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("dump",
                    new ByteArrayInputStream(new byte[0]));
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testNullInputNameRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream(null,
                    new ByteArrayInputStream(new byte[0]));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNullInputStreamRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("zip", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUnknownInputNameRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("unknown",
                    new ByteArrayInputStream(new byte[0]));
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testCreateArOutput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveOutputStream("ar",
                new java.io.ByteArrayOutputStream()) instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateZipOutputCaseInsensitive() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveOutputStream("ZiP",
                new java.io.ByteArrayOutputStream()) instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateTarOutput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveOutputStream("tar",
                new java.io.ByteArrayOutputStream()) instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateJarOutput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveOutputStream("jar",
                new java.io.ByteArrayOutputStream()) instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateCpioOutput() throws Exception {
        assertTrue(new ArchiveStreamFactory().createArchiveOutputStream("cpio",
                new java.io.ByteArrayOutputStream()) instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testNullOutputNameRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream(null,
                    new java.io.ByteArrayOutputStream());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNullOutputStreamRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("zip", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUnknownOutputNameRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("dump",
                    new java.io.ByteArrayOutputStream());
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testAutodetectNullStreamRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream((InputStream) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAutodetectRejectsUnmarkedStream() throws Exception {
        InputStream in = new InputStream() {
            public int read() { return -1; }
        };
        try {
            new ArchiveStreamFactory().createArchiveInputStream(in);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAutodetectZipSignature() throws Exception {
        byte[] signature = new byte[] { 'P', 'K', 3, 4 };
        assertTrue(new ArchiveStreamFactory().createArchiveInputStream(
                new ByteArrayInputStream(signature)) instanceof ZipArchiveInputStream);
    }

    @Test
    public void testAutodetectArSignature() throws Exception {
        byte[] signature = new byte[] { '!', '<', 'a', 'r', 'c', 'h', '>', '\n' };
        assertTrue(new ArchiveStreamFactory().createArchiveInputStream(
                new ByteArrayInputStream(signature)) instanceof ArArchiveInputStream);
    }

    @Test
    public void testAutodetectUnknownSignatureRejected() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream(
                    new ByteArrayInputStream(new byte[] { 1, 2, 3 }));
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }
}
