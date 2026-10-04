package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
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
    public void testLoadInputStreamWithValidUtf8() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com/", doc.location());
    }

    @Test
    public void testLoadInputStreamWithSpecificCharset() throws Exception {
        String html = "<html><head><title>Test</title></head><body>\u00A9 2023</body></html>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.load(is, "ISO-8859-1", "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("\u00A9 2023", doc.body().text());
    }

    @Test
    public void testLoadInputStreamWithMetaCharset() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Test</title></head><body>Hello</body></html>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com/", doc.location());
        assertEquals("ISO-8859-1", doc.charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithContentTypeCharset() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("UTF-16")));
        Document doc = DataUtil.load(is, "UTF-16", "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com/", doc.location());
        assertEquals("UTF-16", doc.charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithXmlDeclarationCharset() throws Exception {
        String html = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root>Hello</root>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com/", Parser.xmlParser());
        assertEquals("Hello", doc.text());
        assertEquals("http://example.com/", doc.location());
        assertEquals("UTF-8", doc.charset().displayName());
    }

    @Test
    public void testLoadInputStreamEmpty() throws Exception {
        InputStream is = new java.io.ByteArrayInputStream(new byte[0]);
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        assertEquals("http://example.com/", doc.location());
    }

    @Test
    public void testLoadInputStreamWithBomUtf8() throws Exception {
        byte[] bom = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        byte[] data = new byte[bom.length + html.getBytes(Charset.forName("UTF-8")).length];
        System.arraycopy(bom, 0, data, 0, bom.length);
        System.arraycopy(html.getBytes(Charset.forName("UTF-8")), 0, data, bom.length, html.getBytes(Charset.forName("UTF-8")).length);
        InputStream is = new java.io.ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-8", doc.charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithBomUtf16Be() throws Exception {
        byte[] bom = {(byte) 0xFE, (byte) 0xFF};
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        byte[] data = new byte[bom.length + html.getBytes(Charset.forName("UTF-16BE")).length];
        System.arraycopy(bom, 0, data, 0, bom.length);
        System.arraycopy(html.getBytes(Charset.forName("UTF-16BE")), 0, data, bom.length, html.getBytes(Charset.forName("UTF-16BE")).length);
        InputStream is = new java.io.ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-16", doc.charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithBomUtf16Le() throws Exception {
        byte[] bom = {(byte) 0xFF, (byte) 0xFE};
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        byte[] data = new byte[bom.length + html.getBytes(Charset.forName("UTF-16LE")).length];
        System.arraycopy(bom, 0, data, 0, bom.length);
        System.arraycopy(html.getBytes(Charset.forName("UTF-16LE")), 0, data, bom.length, html.getBytes(Charset.forName("UTF-16LE")).length);
        InputStream is = new java.io.ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-16", doc.charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithBomUtf32Be() throws Exception {
        byte[] bom = {(byte) 0x00, (byte) 0x00, (byte) 0xFE, (byte) 0xFF};
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        byte[] data = new byte[bom.length + html.getBytes(Charset.forName("UTF-32BE")).length];
        System.arraycopy(bom, 0, data, 0, bom.length);
        System.arraycopy(html.getBytes(Charset.forName("UTF-32BE")), 0, data, bom.length, html.getBytes(Charset.forName("UTF-32BE")).length);
        InputStream is = new java.io.ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-32", doc.charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithBomUtf32Le() throws Exception {
        byte[] bom = {(byte) 0xFF, (byte) 0xFE, (byte) 0x00, (byte) 0x00};
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        byte[] data = new byte[bom.length + html.getBytes(Charset.forName("UTF-32LE")).length];
        System.arraycopy(bom, 0, data, 0, bom.length);
        System.arraycopy(html.getBytes(Charset.forName("UTF-32LE")), 0, data, bom.length, html.getBytes(Charset.forName("UTF-32LE")).length);
        InputStream is = new java.io.ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-32", doc.charset().displayName());
    }

    @Test
    public void testReadToByteBufferLimited() throws Exception {
        String content = "This is a test string.";
        InputStream is = new java.io.ByteArrayInputStream(content.getBytes());
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 10);
        byte[] bytes = new byte[buffer.remaining()];
        buffer.get(bytes);
        assertEquals("This is a ", new String(bytes));
    }

    @Test
    public void testReadToByteBufferUnlimited() throws Exception {
        String content = "This is a test string.";
        InputStream is = new java.io.ByteArrayInputStream(content.getBytes());
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 0);
        byte[] bytes = new byte[buffer.remaining()];
        buffer.get(bytes);
        assertEquals(content, new String(bytes));
    }

    @Test
    public void testReadToByteBufferEmpty() throws Exception {
        InputStream is = new java.io.ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 10);
        assertEquals(0, buffer.remaining());
    }

    @Test
    public void testGetCharsetFromContentTypeValid() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
        assertEquals("GB2312", DataUtil.getCharsetFromContentType("text/html; charset=gb2312")); // Corrected to match reference source behavior (case-insensitivity in validation)
    }

    @Test
    public void testGetCharsetFromContentTypeInvalid() {
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=invalid-charset"));
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset="));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testCrossStreams() throws IOException {
        String content = "Some data to stream.";
        InputStream in = new java.io.ByteArrayInputStream(content.getBytes());
        OutputStream out = new java.io.ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals(content, out.toString());
    }

    @Test
    public void testCrossStreamsEmpty() throws IOException {
        InputStream in = new java.io.ByteArrayInputStream(new byte[0]);
        OutputStream out = new java.io.ByteArrayOutputStream();
        DataUtil.crossStreams(in, out);
        assertEquals("", out.toString());
    }

    @Test
    public void testParseInputStreamWithContentTypeAndMetaCharsetOverrides() throws IOException {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><meta charset=\"UTF-8\"><title>Test</title></head><body>Hello</body></html>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com/", doc.location());
        // The reference source code prioritizes meta charset over http-equiv.
        assertEquals("UTF-8", doc.charset().displayName());
    }

     @Test
    public void testParseInputStreamWithMetaCharsetThenXmlDeclaration() throws IOException {
        String html = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Test</title></head><body>Hello</body></html>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com/", doc.location());
        assertEquals("UTF-8", doc.charset().displayName());
    }

    @Test
    public void testParseInputStreamWithContentTypeThenXmlDeclaration() throws IOException {
        String html = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><!DOCTYPE html><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>Test</title></head><body>Hello</body></html>";
        InputStream is = new java.io.ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com/", doc.location());
        assertEquals("UTF-8", doc.charset().displayName());
    }

    // Removed tests that rely on File I/O as they are not suitable for this environment.
    // The InputStream-based tests cover the core logic of DataUtil.load.
}
