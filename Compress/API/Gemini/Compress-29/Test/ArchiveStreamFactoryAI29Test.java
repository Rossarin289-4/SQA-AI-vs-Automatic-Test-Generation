package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
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

public class ArchiveStreamFactoryAI29Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamUnknown() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream("unknown_format", new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateArchiveInputStreamSevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveInputStreamsValid() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1024]);

        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.AR, bais) instanceof ArArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.ARJ, bais) instanceof ArjArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, bais) instanceof ZipArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.TAR, bais) instanceof TarArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.JAR, bais) instanceof JarArchiveInputStream);
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.CPIO, bais) instanceof CpioArchiveInputStream);
        // DUMP is not supported as a stream input directly via name because DumpArchiveInputStream expects specific headers, but let's check DUMP via name if allowed or expect ArchiveException if constructor validates further.
        // Actually factory.createArchiveInputStream("dump", bais) creates a DumpArchiveInputStream.
        Assert.assertTrue(factory.createArchiveInputStream(ArchiveStreamFactory.DUMP, bais) instanceof DumpArchiveInputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullName() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveOutputStreamNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamUnknown() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream("unknown_format", new ByteArrayOutputStream());
    }

    @Test(expected = StreamingNotSupportedException.class)
    public void testCreateArchiveOutputStreamSevenZ() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayOutputStream());
    }

    @Test
    public void testCreateArchiveOutputStreamsValid() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.AR, baos) instanceof ArArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, baos) instanceof ZipArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.TAR, baos) instanceof TarArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, baos) instanceof JarArchiveOutputStream);
        Assert.assertTrue(factory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, baos) instanceof CpioArchiveOutputStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetectNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAutodetectMarkNotSupported() throws Exception {
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
    public void testAutodetectNoArchiverFound() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        byte[] emptyBytes = new byte[100];
        InputStream bais = new ByteArrayInputStream(emptyBytes);
        factory.createArchiveInputStream(bais);
    }

    @Test
    public void testEncodingGetAndSet() {
        ArchiveStreamFactory factory1 = new ArchiveStreamFactory();
        Assert.assertNull(factory1.getEntryEncoding());
        factory1.setEntryEncoding("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", factory1.getEntryEncoding());

        ArchiveStreamFactory factory2 = new ArchiveStreamFactory("UTF-8");
        Assert.assertEquals("UTF-8", factory2.getEntryEncoding());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetEntryEncodingThrowsWhenConstructorEncodingSet() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        factory.setEntryEncoding("ISO-8859-1");
    }
}
