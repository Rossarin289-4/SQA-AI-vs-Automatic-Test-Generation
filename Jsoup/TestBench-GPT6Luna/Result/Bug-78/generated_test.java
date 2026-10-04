package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataUtilTest {
    @Test
    public void testReadBufferUnlimited() throws Exception {
        byte[] data = {1, 2, 3};
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(data), 0);
        assertEquals(3, result.remaining());
        assertEquals(1, result.get());
        assertEquals(2, result.get());
        assertEquals(3, result.get());
    }

    @Test
    public void testReadBufferZeroLimit() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {1, 2}), 0);
        assertEquals(2, result.remaining());
    }

    @Test
    public void testReadBufferLimitOne() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {4, 5}), 1);
        assertEquals(1, result.remaining());
        assertEquals(4, result.get());
    }

    @Test
    public void testReadBufferAtExactLimit() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {4, 5}), 2);
        assertEquals(2, result.remaining());
    }

    @Test
    public void testReadBufferLimitAboveInputLength() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {7}), 3);
        assertEquals(1, result.remaining());
        assertEquals(7, result.get());
    }

    @Test
    public void testReadBufferEmptyInput() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[0]), 0);
        assertEquals(0, result.remaining());
    }

    @Test
    public void testReadBufferRejectsNegativeLimit() throws Exception {
        try {
            DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {1}), -1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testReadBufferPreservesHighBitBytes() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {(byte) 0x80, (byte) 0xff}), 0);
        assertEquals((byte) 0x80, result.get());
        assertEquals((byte) 0xff, result.get());
    }

    @Test
    public void testReadBufferLimitOneDoesNotIncludeSecondByte() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {9, 8}), 1);
        assertEquals(1, result.remaining());
        assertEquals(9, result.get());
        assertEquals(0, result.remaining());
    }

    @Test
    public void testLoadFileWithExplicitCharset() throws Exception {
        File file = File.createTempFile("dju", ".html");
        try {
            java.nio.file.Files.write(file.toPath(), "<p>ok</p>".getBytes(Charset.forName("UTF-8")));
            Document doc = DataUtil.load(file, "UTF-8", "http://example/");
            assertEquals("ok", doc.select("p").first().text());
            assertEquals("http://example/", doc.location());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadFileWithEmptyContent() throws Exception {
        File file = File.createTempFile("dju", ".html");
        try {
            java.nio.file.Files.write(file.toPath(), new byte[0]);
            Document doc = DataUtil.load(file, "UTF-8", "base");
            assertEquals("base", doc.location());
            assertEquals(0, doc.select("p").size());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadFileUsesSuppliedBaseUri() throws Exception {
        File file = File.createTempFile("dju", ".html");
        try {
            java.nio.file.Files.write(file.toPath(), "<a href='/x'>x</a>".getBytes(Charset.forName("UTF-8")));
            Document doc = DataUtil.load(file, "UTF-8", "http://host/path");
            assertEquals("http://host/path", doc.location());
            assertEquals("/x", doc.select("a").first().attr("href"));
        } finally {
            file.delete();
        }
    }
}
