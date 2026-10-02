package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class ArchiveStreamFactoryAI11Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullName() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveInputStreamUnknownName() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream("unknown", new ByteArrayInputStream(new byte[0]));
    }

    @Test
    public void testCreateArchiveOutputStreamValid() throws ArchiveException {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream out = factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, new java.io.ByteArrayOutputStream());
        assertNotNull(out);
    }
}
