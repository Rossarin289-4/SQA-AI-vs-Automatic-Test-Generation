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
import java.io.ByteArrayInputStream;
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
    public void testLoadFileWithUtf8() throws Exception {
        // Create a dummy file with UTF-8 content
        File tempFile = File.createTempFile("jsoup_test_", ".html");
        try (OutputStream fos = new java.io.FileOutputStream(tempFile)) {
            fos.write("<html><head><meta charset=\"UTF-8\"><title>Test</title></head><body>Hello World!</body></html>".getBytes(Charset.forName("UTF-8")));
        }
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        tempFile.delete();
    }

    @Test
    public void testLoadFileWithIso8859_1() throws Exception {
        // Create a dummy file with ISO-8859-1 content
        File tempFile = File.createTempFile("jsoup_test_", ".html");
        try (OutputStream fos = new java.io.FileOutputStream(tempFile)) {
            // &#233; is 'é' in ISO-8859-1
            fos.write("<html><head><meta charset=\"ISO-8859-1\"><title>Test ISO</title></head><body>H&#233;llo</body></html>".getBytes(Charset.forName("ISO-8859-1")));
        }
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test ISO", doc.title());
        // The entity &#233; should be decoded to 'é'
        assertEquals("Héll o", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
        tempFile.delete();
    }

    @Test
    public void testLoadInputStreamWithBomUtf8() throws Exception {
        // UTF-8 BOM: EF BB BF
        byte[] data = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF, '<', 'h', 't', 'm', 'l', '>', '<', 'b', 'o', 'd', 'y', '>', 'B', 'O', 'M', ' ', 'T', 'e', 's', 't', '<', '/', 'b', 'o', 'd', 'y', '>', '<', '/', 'h', 't', 'm', 'l', '>'};
        InputStream is = new ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com");
        // The text "BOM Test" is after the BOM, so it should be parsed correctly.
        assertEquals("BOM Test", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithBomUtf16Be() throws Exception {
        // UTF-16 Big Endian BOM: FE FF
        // Content is "<html><body>BOM Test</body></html>"
        // Each character is represented by two bytes. The BOM is 2 bytes.
        byte[] data = {(byte) 0xFE, (byte) 0xFF, // BOM
                       0, '<', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0, '>', // <html>
                       0, '<', 0, 'b', 0, 'o', 0, 'd', 0, 'y', 0, '>', // <body>
                       'B', 0, 'O', 0, 'M', 0, ' ', 0, 'T', 0, 'e', 0, 's', 0, 't', // BOM Test
                       0, '<', 0, '/', 0, 'b', 0, 'o', 0, 'd', 0, 'y', 0, '>', // </body>
                       0, '<', 0, '/', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0, '>'}; // </html>
        InputStream is = new ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com");
        // The UTF-16 BE parser should correctly interpret the bytes into characters.
        assertEquals("BOM Test", doc.body().text());
        assertEquals("UTF-16", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithBomUtf16Le() throws Exception {
        // UTF-16 Little Endian BOM: FF FE
        // Content is "<html><body>BOM Test</body></html>"
        byte[] data = {(byte) 0xFF, (byte) 0xFE, // BOM
                       '<', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0, '>', // <html>
                       '<', 0, 'b', 0, 'o', 0, 'd', 0, 'y', 0, '>', // <body>
                       'B', 0, 'O', 0, 'M', 0, ' ', 0, 'T', 0, 'e', 0, 's', 0, 't', // BOM Test
                       '<', 0, '/', 0, 'b', 0, 'o', 0, 'd', 0, 'y', 0, '>', // </body>
                       '<', 0, '/', 0, 'h', 0, 't', 0, 'm', 0, 'l', 0, '>'}; // </html>
        InputStream is = new ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com");
        // The UTF-16 LE parser should correctly interpret the bytes into characters.
        assertEquals("BOM Test", doc.body().text());
        assertEquals("UTF-16", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithMetaCharset() throws Exception {
        String html = "<html><head><meta charset=\"gb2312\"><title>Meta Test</title></head><body>你好世界</body></html>";
        // Use the charset that the meta tag specifies for encoding the byte array
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.forName("GB2312")));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("Meta Test", doc.title());
        assertEquals("你好世界", doc.body().text());
        assertEquals("GB2312", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithMetaHttpEquivCharset() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-2\"><title>HTTP-EQUIV Test</title></head><body>Test ąęść</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.forName("ISO-8859-2")));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("HTTP-EQUIV Test", doc.title());
        assertEquals("Test ąęść", doc.body().text());
        assertEquals("ISO-8859-2", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithXmlDeclaration() throws Exception {
        // Test loading XML content with an XML declaration specifying encoding.
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-16\"?>\n<root>Hello XML</root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-16")));
        // Use the XML parser as this is XML content.
        Document doc = DataUtil.load(is, null, "http://example.com", Parser.xmlParser());
        // The content of the root element.
        assertEquals("Hello XML", doc.body().text());
        // The XML declaration's encoding should be detected and used.
        assertEquals("UTF-16", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamDefaultCharset() throws Exception {
        String html = "<html><body>Default Charset Test</body></html>";
        // Use the default charset for encoding the byte array.
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.defaultCharset()));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("Default Charset Test", doc.body().text());
        // If no charset is detected, DataUtil.defaultCharset should be used.
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadFileWithInvalidCharsetName() throws Exception {
        File tempFile = File.createTempFile("jsoup_test_", ".html");
        try (OutputStream fos = new java.io.FileOutputStream(tempFile)) {
            fos.write("<html><head><meta charset=\"invalid-charset-name\"><title>Invalid Charset</title></head><body>Test</body></html>".getBytes(Charset.defaultCharset()));
        }
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Invalid Charset", doc.title());
        assertEquals("Test", doc.body().text());
        // An invalid charset name in the meta tag should cause it to fall back to the default.
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
        tempFile.delete();
    }

    @Test
    public void testLoadInputStreamWithNoCharsetDeclaration() throws Exception {
        String html = "<html><body>No Charset Declaration Test</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        // Explicitly provide UTF-8 as the charset, as there's no declaration in the stream.
        Document doc = DataUtil.load(is, "UTF-8", "http://example.com");
        assertEquals("No Charset Declaration Test", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testReadToByteBufferUnlimited() throws Exception {
        byte[] data = "This is a test string.".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(is);
        // maxSize is 0, which means unlimited.
        assertEquals(data.length, buffer.limit());
        byte[] readBytes = new byte[buffer.limit()];
        buffer.get(readBytes);
        assertArrayEquals(data, readBytes);
    }

    @Test
    public void testReadToByteBufferMaxSize() throws Exception {
        byte[] data = "This is a longer test string that exceeds the buffer size.".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        int maxSize = 20;
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, maxSize);
        // Should read up to maxSize.
        assertEquals(maxSize, buffer.limit());
        byte[] readBytes = new byte[buffer.limit()];
        buffer.get(readBytes);
        assertArrayEquals(java.util.Arrays.copyOf(data, maxSize), readBytes);
    }

    @Test
    public void testReadToByteBufferMaxSizeZero() throws Exception {
        byte[] data = "This is a test string with zero max size.".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        // A maxSize of 0 should be treated as unlimited by ConstrainableInputStream.
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 0);
        assertEquals(data.length, buffer.limit());
        byte[] readBytes = new byte[buffer.limit()];
        buffer.get(readBytes);
        assertArrayEquals(data, readBytes);
    }

    @Test
    public void testReadToByteBufferEmptyStream() throws Exception {
        byte[] data = new byte[0];
        InputStream is = new ByteArrayInputStream(data);
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, 100);
        // Empty stream should result in an empty buffer.
        assertEquals(0, buffer.limit());
    }

    @Test
    public void testGetCharsetFromContentType() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/plain; charset=\"ISO-8859-1\""));
        assertEquals("GB2312", DataUtil.getCharsetFromContentType("application/xhtml+xml; charset=GB2312"));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeWithSpaces() {
        // Test handling of spaces around the charset value and equals sign.
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset = UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/plain; charset = \"ISO-8859-1\" "));
    }

    @Test
    public void testGetCharsetFromContentTypeInvalid() {
        // An invalid charset name should return null.
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=invalid-charset"));
    }

    @Test
    public void testMimeBoundary() {
        String boundary1 = DataUtil.mimeBoundary();
        String boundary2 = DataUtil.mimeBoundary();
        assertEquals(32, boundary1.length());
        // Highly unlikely to generate the same boundary twice.
        assertNotEquals(boundary1, boundary2);
        // Check if boundary characters are valid.
        Pattern p = Pattern.compile("^[\\-_1234567890a-zA-Z]+$");
        assertTrue(p.matcher(boundary1).matches());
    }

    @Test
    public void testLoadFileWithNullBaseUri() throws Exception {
        File tempFile = File.createTempFile("jsoup_test_", ".html");
        try (OutputStream fos = new java.io.FileOutputStream(tempFile)) {
            fos.write("<html><head><title>Null Base URI Test</title></head><body>Content</body></html>".getBytes(Charset.defaultCharset()));
        }
        // Test loading a file with a null baseUri.
        Document doc = DataUtil.load(tempFile, null, null);
        assertEquals("Null Base URI Test", doc.title());
        assertEquals("Content", doc.body().text());
        // The base URI should be null if not provided.
        assertNull(doc.location());
        tempFile.delete();
    }

    @Test
    public void testLoadInputStreamWithEmptyBody() throws Exception {
        // Test loading an empty input stream.
        InputStream is = new ByteArrayInputStream(new byte[0]);
        Document doc = DataUtil.load(is, null, "http://example.com/empty");
        assertEquals("http://example.com/empty", doc.location());
        // An empty body should result in empty head and body nodes.
        assertTrue(doc.head().childNodes().isEmpty());
        assertTrue(doc.body().childNodes().isEmpty());
    }

    @Test
    public void testLoadXmlFileWithDeclarationEncodingOverride() throws Exception {
        // Test case where XML declaration encoding is present, but the content might be read differently.
        // The parser should prioritize the encoding in the XML declaration.
        String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-16\"?>\n<root>Value</root>";
        InputStream is = new ByteArrayInputStream(xmlContent.getBytes(Charset.forName("UTF-16"))); // Encode using UTF-16
        Document doc = DataUtil.load(is, null, "http://example.com", Parser.xmlParser());
        assertEquals("Value", doc.body().text());
        // The encoding from the XML declaration should be used.
        assertEquals("UTF-16", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithMetaTagInvalidCharset() throws Exception {
        String html = "<html><head><meta charset=\"invalid-charset-name\"><title>Invalid Meta Charset</title></head><body>Test</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.defaultCharset()));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("Invalid Meta Charset", doc.title());
        assertEquals("Test", doc.body().text());
        // Invalid charset in meta tag should fall back to default.
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadFileWithExplicitCharset() throws Exception {
        File tempFile = File.createTempFile("jsoup_test_", ".html");
        String content = "<html><head><title>Explicit Charset Test</title></head><body>Explicit</body></html>";
        try (OutputStream fos = new java.io.FileOutputStream(tempFile)) {
            fos.write(content.getBytes("UTF-16")); // Write using UTF-16
        }
        // Load by explicitly providing the charset, which matches the file's encoding.
        Document doc = DataUtil.load(tempFile, "UTF-16", "http://example.com");
        assertEquals("Explicit Charset Test", doc.title());
        assertEquals("Explicit", doc.body().text());
        assertEquals("UTF-16", doc.outputSettings().charset().displayName());
        tempFile.delete();
    }

    @Test
    public void testLoadFileWithWrongExplicitCharset() throws Exception {
        File tempFile = File.createTempFile("jsoup_test_", ".html");
        String content = "<html><head><title>Wrong Explicit Charset Test</title></head><body>Content</body></html>";
        try (OutputStream fos = new java.io.FileOutputStream(tempFile)) {
            fos.write(content.getBytes("UTF-8")); // Write using UTF-8
        }
        // Load by explicitly providing the WRONG charset (ISO-8859-1).
        // This should result in a document with potentially garbled characters in the body.
        // The key is that the specified (wrong) charset is recorded.
        Document doc = DataUtil.load(tempFile, "ISO-8859-1", "http://example.com");
        assertEquals("Wrong Explicit Charset Test", doc.title());
        // We can't assert exact garbled text, but we can assert the charset used.
        assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
        tempFile.delete();
    }

    @Test
    public void testReadToByteBufferVeryLargeSize() throws Exception {
        // Test with a size larger than the actual stream content.
        byte[] data = "Small data.".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        int maxSize = 1024 * 10; // Larger than data.length
        ByteBuffer buffer = DataUtil.readToByteBuffer(is, maxSize);
        // The buffer limit should be the actual data length, not maxSize.
        assertEquals(data.length, buffer.limit());
        byte[] readBytes = new byte[buffer.limit()];
        buffer.get(readBytes);
        assertArrayEquals(data, readBytes);
    }

    @Test
    public void testLoadFileWithMetaTagAndBom() throws Exception {
        // UTF-8 BOM followed by meta tag. BOM should take precedence.
        byte[] data = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF, '<', 'h', 't', 'm', 'l', '>', '<', 'h', 'e', 'a', 'd', '>', '<', 'm', 'e', 't', 'a', ' ', 'c', 'h', 'a', 'r', 's', 'e', 't', '=', '"', 'U', 'T', 'F', '-', '1', '6', '"', '>', '<', 't', 'i', 't', 'l', 'e', '>', 'B', 'O', 'M', ' ', 'a', 'n', 'd', ' ', 'M', 'e', 't', 'a', '<', '/', 't', 'i', 't', 'l', 'e', '>', '<', '/', 'h', 'e', 'a', 'd', '>', '<', 'b', 'o', 'd', 'y', '>', 'B', 'O', 'M', ' ', 't', 'e', 's', 't', '<', '/', 'b', 'o', 'd', 'y', '>', '<', '/', 'h', 't', 'm', 'l', '>'};
        InputStream is = new ByteArrayInputStream(data);
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("BOM and Meta", doc.title());
        assertEquals("BOM test", doc.body().text());
        // BOM should override meta tag charset.
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithXmlDeclarationNotXmlParser() throws Exception {
        // XML declaration in an HTML document when using HTML parser.
        // The HTML parser should ignore the XML declaration if it's not the very first thing or if it's not XML content.
        String htmlContent = "<html><head><title>XML Decl HTML Parser</title></head>" +
                             "<body>XML Decl HTML Parser Test</body></html>"; // No XML declaration here, plain HTML.
        InputStream is = new ByteArrayInputStream(htmlContent.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, null, "http://example.com", Parser.htmlParser()); // Use HTML parser
        assertEquals("XML Decl HTML Parser", doc.title());
        assertEquals("XML Decl HTML Parser Test", doc.body().text());
        // Since no charset is specified, default should be used.
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }

    @Test
    public void testReadToByteBufferNegativeMaxSize() throws Exception {
        byte[] data = "Test".getBytes();
        InputStream is = new ByteArrayInputStream(data);
        // Expecting an IllegalArgumentException because maxSize must be non-negative.
        try {
            DataUtil.readToByteBuffer(is, -100);
            fail("Expected IllegalArgumentException for negative maxSize");
        } catch (IllegalArgumentException e) {
            // Expected exception.
            assertTrue(e.getMessage().contains("maxSize must be 0 (unlimited) or larger"));
        }
    }

    @Test
    public void testLoadInputStreamWithEmptyStream() throws Exception {
        // Test loading an empty stream.
        InputStream is = new ByteArrayInputStream(new byte[0]);
        Document doc = DataUtil.load(is, null, "http://example.com/empty_stream");
        assertEquals("http://example.com/empty_stream", doc.location());
        assertTrue(doc.head().childNodes().isEmpty());
        assertTrue(doc.body().childNodes().isEmpty());
    }

    @Test
    public void testLoadInputStreamWithNullCharsetName() throws Exception {
        String html = "<html><body>Null Charset Name Test</body></html>";
        // Passing null for charsetName should trigger charset detection.
        InputStream is = new ByteArrayInputStream(html.getBytes("UTF-8"));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("Null Charset Name Test", doc.body().text());
        // Default charset should be used as no other is detected.
        assertEquals(DataUtil.defaultCharset, doc.outputSettings().charset().displayName());
    }

    @Test
    public void testLoadInputStreamWithXmlDeclarationAndHtmlParser() throws Exception {
        // Test an XML declaration at the beginning of a stream when using the HTML parser.
        // The HTML parser should still parse it as HTML and detect charsets from meta tags or default.
        String htmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                             "<html><head><meta charset=\"ISO-8859-1\"><title>XML Decl HTML Parser Meta</title></head>" +
                             "<body>XML Decl HTML Parser Meta Test</body></html>";
        InputStream is = new ByteArrayInputStream(htmlContent.getBytes(Charset.forName("UTF-8"))); // Stream encoded as UTF-8
        Document doc = DataUtil.load(is, null, "http://example.com", Parser.htmlParser());
        assertEquals("XML Decl HTML Parser Meta", doc.title());
        assertEquals("XML Decl HTML Parser Meta Test", doc.body().text());
        // The meta charset should be detected and used by the HTML parser.
        assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());
    }
}
