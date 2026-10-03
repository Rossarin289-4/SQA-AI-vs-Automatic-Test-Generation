package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;

public class ZipFileAI10Test {

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullFile() throws IOException {
        File nullFile = null;
        new ZipFile(nullFile);
    }

    @Test(expected = ZipException.class)
    public void testConstructorWithNonZipFile() throws IOException {
        File tempFile = File.createTempFile("notazip", ".txt");
        tempFile.deleteOnExit();
        try {
            new ZipFile(tempFile);
        } finally {
            tempFile.delete();
        }
    }

    @Test
    public void testCloseQuietlyWithNull() {
        ZipFile.closeQuietly(null);
        // Should not throw any exception
        Assert.assertTrue(true);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullFileAndEncoding() throws IOException {
        File nullFile = null;
        new ZipFile(nullFile, "UTF8");
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullStringAndEncoding() throws IOException {
        String nullName = null;
        new ZipFile(nullName, "UTF8");
    }

    @Test(expected = IOException.class)
    public void testConstructorWithNonExistentFile() throws IOException {
        File nonExistent = new File("non-existent-file-123456.zip");
        new ZipFile(nonExistent);
    }
}
