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
    public void testInputNamesAreCaseInsensitive() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveInputStream("ZIP",
                new ByteArrayInputStream(new byte[0])) instanceof ZipArchiveInputStream);
    }

    @Test
    public void testInputArName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveInputStream("ar",
                new ByteArrayInputStream(new byte[0])) instanceof ArArchiveInputStream);
    }

    @Test
    public void testInputCpioName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveInputStream("cpio",
                new ByteArrayInputStream(new byte[0])) instanceof CpioArchiveInputStream);
    }

    @Test
    public void testInputDumpName() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("dump",
                    new ByteArrayInputStream(new byte[0]));
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testInputJarName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveInputStream("jar",
                new ByteArrayInputStream(new byte[0])) instanceof JarArchiveInputStream);
    }

    @Test
    public void testInputTarName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveInputStream("tar",
                new ByteArrayInputStream(new byte[0])) instanceof TarArchiveInputStream);
    }

    @Test
    public void testInputNullName() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream(null,
                    new ByteArrayInputStream(new byte[0]));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testInputNullStream() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("zip", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testInputUnknownName() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveInputStream("unknown",
                    new ByteArrayInputStream(new byte[0]));
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testOutputNamesAreCaseInsensitive() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveOutputStream("ZIP",
                new java.io.ByteArrayOutputStream()) instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testOutputArName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveOutputStream("ar",
                new java.io.ByteArrayOutputStream()) instanceof ArArchiveOutputStream);
    }

    @Test
    public void testOutputCpioName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveOutputStream("cpio",
                new java.io.ByteArrayOutputStream()) instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testOutputJarName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveOutputStream("jar",
                new java.io.ByteArrayOutputStream()) instanceof JarArchiveOutputStream);
    }

    @Test
    public void testOutputTarName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        assertTrue(factory.createArchiveOutputStream("tar",
                new java.io.ByteArrayOutputStream()) instanceof TarArchiveOutputStream);
    }

    @Test
    public void testOutputNullName() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream(null,
                    new java.io.ByteArrayOutputStream());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOutputNullStream() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("zip", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOutputUnknownName() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("unknown",
                    new java.io.ByteArrayOutputStream());
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }

    @Test
    public void testOutputDumpIsUnsupported() throws Exception {
        try {
            new ArchiveStreamFactory().createArchiveOutputStream("dump",
                    new java.io.ByteArrayOutputStream());
            fail("expected ArchiveException");
        } catch (ArchiveException expected) { }
    }
}
