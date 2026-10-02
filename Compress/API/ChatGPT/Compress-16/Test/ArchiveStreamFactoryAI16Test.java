package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class ArchiveStreamFactoryAI16Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullName() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamUnknown() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream("unknown", new ByteArrayOutputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullStream() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream((java.io.InputStream) null);
    }
}
