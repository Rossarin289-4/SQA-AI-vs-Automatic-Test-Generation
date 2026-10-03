package org.apache.commons.compress.archivers.zip;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class ZipArchiveOutputStreamAI43Test {

    @Test
    public void testCreateArchiveEntryWithFile() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        File tempFile = File.createTempFile("test", ".txt");
        try {
            var entry = zaos.createArchiveEntry(tempFile, "test.txt");
            assertNotNull(entry);
        } finally {
            tempFile.delete();
            zaos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryWhenFinished() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        File tempFile = File.createTempFile("test", ".txt");
        try {
            zaos.finish();
            zaos.createArchiveEntry(tempFile, "test.txt");
        } finally {
            tempFile.delete();
            zaos.close();
        }
    }

    @Test
    public void testDestroy() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.destroy();
        // Verifies destroy executes cleanly without throwing
    }
}
