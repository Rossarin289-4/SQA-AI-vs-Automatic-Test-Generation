package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class ZipArchiveInputStreamAI47Test {

    @Test
    public void testConstructorWithDefaultEncoding() {
        byte[] empty = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(empty);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        assertNotNull(zais);
    }

    @Test
    public void testConstructorWithExplicitEncoding() {
        byte[] empty = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(empty);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais, "UTF8");
        assertNotNull(zais);
    }

    @Test
    public void testConstructorWithEncodingAndUnicodeFlag() {
        byte[] empty = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(empty);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais, "UTF8", true);
        assertNotNull(zais);
    }
}
