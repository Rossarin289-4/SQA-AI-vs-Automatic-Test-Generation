===== COMPILER ERRORS =====
DataUtilTest.java:273: error: cannot find symbol
        assertNotEquals(boundary1, boundary2);
        ^
  symbol:   method assertNotEquals(String,String)
  location: class DataUtilTest
1 error
===== END COMPILER ERRORS =====
```java
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import java.util.List;
// Removed import for Token as it is not accessible from outside the package and not used directly.

public class DataUtilTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testLoadFileWithUTF8Charset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String htmlContent = "<html><head><meta charset=\"UTF-8\"><title>Test</title></head><body>Hello World</body></html>";
        java.nio.file.Files.write(tempFile.toPath(), htmlContent.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        assertEquals("Test", doc.title());
        assertEquals("Hello World", doc.body().text());
        tempFile.deleteOnExit();
    }

    @Test
    public void testLoadFileWithGB2312Charset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        // Content in GB2312, encoded as UTF-8
        byte[] gb2312Bytes = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=gb2312\"><title>测试</title></head><body>你好世界</body></html>".getBytes(Charset.forName("GB2312"));
        java.nio.file.Files.write(tempFile.toPath(), gb2312Bytes);
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("测试", doc.title());
        assertEquals("你好世界", doc.body().text());
        tempFile.deleteOnExit();
    }

    @Test
    public void testLoadFileWithXmlDeclarationCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".xml");
        String xmlContent = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><root>Test</root>";
        java.nio.file.Files.write(tempFile.toPath(), xmlContent.getBytes(Charset.forName("ISO-8859-1")));
        // Corrected call: load takes InputStream, not File for this overload
        Document doc = DataUtil.load(new java.io.FileInputStream(tempFile), null, "http://example.com", Parser.xmlParser());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) doc.childNode(0);
        assertEquals("xml", declaration.name());
        assertEquals("ISO-8859-1", declaration.attr("encoding"));
        // In XML mode, the content of the root element is treated as text if it's a simple text node.
        // For the given XML "<?xml ...?><root>Test</root>", the text "Test" is a child of the root.
        // `doc.body()` is an HTML concept, so accessing text directly from the root or first child element is more appropriate for XML.
        // Assuming the first child element's text is desired.
        assertEquals("Test", ((Element)doc.childNode(1)).text()); 
        tempFile.deleteOnExit();
    }

    @Test
    public void testLoadInputStreamWithBomUTF8() throws IOException {
        String htmlContent = "\uFEFF<html><head><title>Test BOM</title></head><body>Hello BOM</body></html>";
        InputStream stream = new java.io.ByteArrayInputStream(htmlContent.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertEquals("Test BOM", doc.title());
        assertEquals("Hello BOM", doc.body().text());
    }

    @Test
    public void testLoadInputStreamWithBomUTF16BE() throws IOException {
        String htmlContent = "<html><head><title>Test BOM</title></head><body>Hello BOM</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0xFE, (byte) 0xFF}); // UTF-16 BE BOM
        baos.write(htmlContent.getBytes(Charset.forName("UTF-16BE")));
        InputStream stream = new java.io.ByteArrayInputStream(baos.toByteArray());
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertEquals("Test BOM", doc.title());
        assertEquals("Hello BOM", doc.body().text());
    }

    @Test
    public void testLoadInputStreamWithBomUTF16LE() throws IOException {
        String htmlContent = "<html><head><title>Test BOM</title></head><body>Hello BOM</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0xFF, (byte) 0xFE}); // UTF-16 LE BOM
        baos.write(htmlContent.getBytes(Charset.forName("UTF-16LE")));
        InputStream stream = new java.io.ByteArrayInputStream(baos.toByteArray());
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertEquals("Test BOM", doc.title());
        assertEquals("Hello BOM", doc.body().text());
    }

    @Test
    public void testLoadInputStreamWithBomUTF32BE() throws IOException {
        String htmlContent = "<html><head><title>Test BOM</title></head><body>Hello BOM</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0xFE, (byte) 0xFF}); // UTF-32 BE BOM
        baos.write(htmlContent.getBytes(Charset.forName("UTF-32BE")));
        InputStream stream = new java.io.ByteArrayInputStream(baos.toByteArray());
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertEquals("Test BOM", doc.title());
        assertEquals("Hello BOM", doc.body().text());
    }

    @Test
    public void testLoadInputStreamWithBomUTF32LE() throws IOException {
        String htmlContent = "<html><head><title>Test BOM</title></head><body>Hello BOM</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0xFF, (byte) 0xFE, (byte) 0x00, (byte) 0x00}); // UTF-32 LE BOM
        baos.write(htmlContent.getBytes(Charset.forName("UTF-32LE")));
        InputStream stream = new java.io.ByteArrayInputStream(baos.toByteArray());
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertEquals("Test BOM", doc.title());
        assertEquals("Hello BOM", doc.body().text());
    }

    @Test
    public void testLoadInputStreamWithContentTypeHeader() throws IOException {
        String htmlContent = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=SHIFT_JIS\"><title>ShiftJIS Test</title></head><body></body></html>";
        InputStream stream = new java.io.ByteArrayInputStream(htmlContent.getBytes(Charset.forName("SHIFT_JIS")));
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertEquals("ShiftJIS Test", doc.title());
    }

    @Test
    public void testLoadInputStreamWithUnknownCharsetHeader() throws IOException {
        String htmlContent = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=UNKNOWN-CHARSET\"><title>Unknown Charset</title></head><body></body></html>";
        InputStream stream = new java.io.ByteArrayInputStream(htmlContent.getBytes(Charset.forName("UTF-8"))); // Use UTF-8 as fallback for writing
        Document doc = DataUtil.load(stream, null, "http://example.com");
        // It should fall back to defaultCharset (UTF-8) and not throw an exception.
        // The title will likely not parse correctly if the actual content was intended to be unknown-charset.
        // We assert that it doesn't crash and has a default charset.
        assertNotNull(doc);
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }
    
    @Test
    public void testLoadInputStreamWithMetaCharset() throws IOException {
        String htmlContent = "<html><head><meta charset=\"ISO-8859-1\"><title>Meta Charset</title></head><body></body></html>";
        InputStream stream = new java.io.ByteArrayInputStream(htmlContent.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.load(stream, null, "http://example.com");
        assertEquals("Meta Charset", doc.title());
    }

    @Test
    public void testLoadInputStreamWithMetaCharsetMalformed() throws IOException {
        String htmlContent = "<html><head><meta charset=\"invalid-charset\"><title>Invalid Meta Charset</title></head><body></body></html>";
        InputStream stream = new java.io.ByteArrayInputStream(htmlContent.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(stream, null, "http://example.com");
        // Should fall back to default charset and not crash.
        assertNotNull(doc);
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithEmptyContentType() throws IOException {
        String htmlContent = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;\"><title>Empty Content Type</title></head><body></body></html>";
        InputStream stream = new java.io.ByteArrayInputStream(htmlContent.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(stream, null, "http://example.com");
        // Should fall back to default charset.
        assertNotNull(doc);
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }
    
    @Test
    public void testLoadInputStreamWithNoContentType() throws IOException {
        String htmlContent = "<html><head><title>No Content Type</title></head><body></body></html>";
        InputStream stream = new java.io.ByteArrayInputStream(htmlContent.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(stream, null, "http://example.com");
        // Should fall back to default charset.
        assertNotNull(doc);
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }

    @Test
    public void testReadToByteBufferLimitedSize() throws IOException {
        String content = "This is a test string that is longer than the buffer size.";
        InputStream stream = new java.io.ByteArrayInputStream(content.getBytes(Charset.forName("UTF-8")));
        int maxSize = 20; // smaller than the content
        ByteBuffer buffer = DataUtil.readToByteBuffer(stream, maxSize);
        byte[] bytes = buffer.array();
        assertEquals(maxSize, bytes.length);
        assertEquals("This is a test str", new String(bytes, Charset.forName("UTF-8")));
    }

    @Test
    public void testReadToByteBufferUnlimited() throws IOException {
        String content = "This is a test string.";
        InputStream stream = new java.io.ByteArrayInputStream(content.getBytes(Charset.forName("UTF-8")));
        ByteBuffer buffer = DataUtil.readToByteBuffer(stream, 0); // 0 means unlimited
        byte[] bytes = buffer.array();
        assertEquals(content.length(), bytes.length);
        assertEquals(content, new String(bytes, Charset.forName("UTF-8")));
    }

    @Test
    public void testReadFileToByteBuffer() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".txt");
        String content = "Content for file read.";
        java.nio.file.Files.write(tempFile.toPath(), content.getBytes(Charset.forName("UTF-8")));
        ByteBuffer buffer = DataUtil.readFileToByteBuffer(tempFile);
        byte[] bytes = buffer.array();
        assertEquals(content.length(), bytes.length);
        assertEquals(content, new String(bytes, Charset.forName("UTF-8")));
        tempFile.deleteOnExit();
    }

    @Test
    public void testEmptyByteBuffer() {
        ByteBuffer buffer = DataUtil.emptyByteBuffer();
        assertNotNull(buffer);
        assertEquals(0, buffer.capacity());
        assertEquals(0, buffer.limit());
    }

    @Test
    public void testGetCharsetFromContentTypeBasic() {
        String contentType = "text/html; charset=UTF-8";
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeWithQuotes() {
        String contentType = "text/html; charset=\"ISO-8859-1\"";
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeNoCharset() {
        String contentType = "text/html";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeEmpty() {
        String contentType = "text/html; charset=";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testGetCharsetFromContentTypeInvalid() {
        String contentType = "text/html; charset=invalid-charset";
        assertNull(DataUtil.getCharsetFromContentType(contentType));
    }

    @Test
    public void testMimeBoundaryGeneration() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        assertNotNull(boundary1);
        assertEquals(32, boundary1.length());
        // assertNotEquals requires JUnit 4.3 or later.
        assertFalse(boundary1.equals(boundary2)); 
        assertTrue(boundary1.matches("^[a-zA-Z0-9-_]+$"));
    }

    @Test
    public void testParseByteData_OverrideCharsetWithMeta() throws IOException {
        String htmlContent = "<html><head><meta charset=\"ISO-8859-1\"><title>Override Test</title></head><body>Hello overridden</body></html>";
        // First parse as UTF-8, then detect meta charset and re-parse
        ByteBuffer byteData = ByteBuffer.wrap(htmlContent.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
        assertEquals("Override Test", doc.title());
        assertEquals("Hello overridden", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testParseByteData_XmlDeclarationOverride() throws IOException {
        String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-16BE\"?><root>Test XML Declaration</root>";
        ByteBuffer byteData = ByteBuffer.wrap(xmlContent.getBytes(Charset.forName("UTF-16BE")));
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.xmlParser());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) doc.childNode(0);
        assertEquals("xml", declaration.name());
        assertEquals("UTF-16BE", declaration.attr("encoding"));
        // In XML mode, body() is not meaningful in the same way as HTML.
        // Accessing the text content of the root element instead.
        assertEquals("Test XML Declaration", ((Element)doc.childNode(1)).text());
    }
    
    @Test
    public void testParseByteData_NoMetaNoBom_FallbackToDefault() throws IOException {
        String htmlContent = "<html><head><title>No Meta or BOM</title></head><body>Default Charset</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(htmlContent.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertEquals("No Meta or BOM", doc.title());
        assertEquals("Default Charset", doc.body().text());
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }

    @Test
    public void testParseByteData_UserSuppliedCharset() throws IOException {
        String htmlContent = "<html><head><title>User Supplied</title></head><body>User Supplied Content</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(htmlContent.getBytes(Charset.forName("ISO-8859-1")));
        // User explicitly supplies the charset, it should be used directly.
        Document doc = DataUtil.parseByteData(byteData, "ISO-8859-1", "http://example.com", Parser.htmlParser());
        assertEquals("User Supplied", doc.title());
        assertEquals("User Supplied Content", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }
}
```