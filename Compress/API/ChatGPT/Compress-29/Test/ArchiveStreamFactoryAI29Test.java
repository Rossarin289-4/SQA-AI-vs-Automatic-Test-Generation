package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class ArchiveStreamFactoryAI29Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNullStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveInputStream(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateArchiveInputStreamNoMark() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        factory.createArchiveInputStream(bais);
    }

    @Test(expected = ArchiveException.class)
    public void testCreateArchiveOutputStreamUnknown() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        factory.createArchiveOutputStream("unknown-format", null);
    }
}
