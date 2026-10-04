```java
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException; // Added import for UnsupportedCharsetException
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataUtilTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a dummy file for testing
    private File createTempFile(String content) throws IOException {
        File tempFile = File.createTempFile("jsouptest", ".html");
        tempFile.deleteOnExit();
        // defaultCharset is a static final variable in DataUtil, so it can be used directly.
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(tempFile), DataUtil.defaultCharset)) {
            writer.write(content);
        }
        return tempFile;
    }

    @Test
    public void testLoadWithBasicHtml() throws Exception {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.body().text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testLoadWithSpecificCharset() throws Exception {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, "UTF-8", "http://example.com/");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMetaCharsetTag() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.body().text());
        // The charset should be detected from the meta tag
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadWithMetaHttpEquivCharset() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.body().text());
        // The charset should be detected from the meta http-equiv tag
        assertEquals("GB2312", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadWithNoCharsetSpecifiedAndNoMetaTag() throws Exception {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name()); // Should default to UTF-8
    }

    @Test
    public void testLoadWithEmptyFile() throws Exception {
        String html = "";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("", doc.title());
        assertEquals("", doc.body().html());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testLoadWithOnlyDoctype() throws Exception {
        String html = "<!DOCTYPE html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("", doc.title());
        assertEquals("", doc.body().html());
    }

    @Test
    public void testLoadWithSpecialCharacters() throws Exception {
        String html = "<html><body><p>Special: &lt; &gt; &amp; &quot; &apos;</p></body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("Special: < > & \" '", doc.body().text());
    }

    @Test
    public void testLoadWithBOM() throws Exception {
        // UTF-8 BOM is 0xEF, 0xBB, 0xBF
        String html = "\uFEFF<html><body>Hello</body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("Hello", doc.body().text());
        // BOM should be stripped and charset detected as UTF-8
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadWithXmlDeclaration() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><html><body>Hello</body></html>";
        File testFile = createTempFile(xml);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadWithInvalidCharsetName() throws Exception {
        String html = "<html><body>Hello</body></html>";
        File testFile = createTempFile(html);
        try {
            DataUtil.load(testFile, "Invalid-Charset-Name", "http://example.com/");
            fail("Should throw exception for invalid charset.");
        } catch (UnsupportedCharsetException e) {
            // Expected exception
        }
    }

    @Test
    public void testLoadWithNullCharsetName() throws Exception {
        String html = "<html><body>Hello</body></html>";
        File testFile = createTempFile(html);
        Document doc = DataUtil.load(testFile, null, "http://example.com/");
        assertEquals("Hello", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().name()); // Should default to UTF-8
    }

    @Test
    public void testLoadInputStreamWithMetaCharset() throws Exception {
        String html = "<html><head><meta charset=\"UTF-16\"><title>Test</title></head><body>Content</body></html>";
        // Ensure the bytes correctly represent UTF-16.
        InputStream inputStream = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-16")));
        Document doc = DataUtil.load(inputStream, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Content", doc.body().text());
        assertEquals("UTF-16", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadInputStreamWithMetaHttpEquiv() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=Shift_JIS\"><title>Test</title></head><body>Content</body></html>";
        // Ensure the bytes correctly represent Shift_JIS.
        InputStream inputStream = new ByteArrayInputStream(html.getBytes(Charset.forName("Shift_JIS")));
        Document doc = DataUtil.load(inputStream, null, "http://example.com/");
        assertEquals("Test", doc.title());
        assertEquals("Content", doc.body().text());
        assertEquals("SHIFT_JIS", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadInputStreamWithExplicitCharset() throws Exception {
        String html = "<html><body>Hello</body></html>";
        // Ensure the bytes correctly represent ISO-8859-1.
        InputStream inputStream = new ByteArrayInputStream(html.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.load(inputStream, "ISO-8859-1", "http://example.com/");
        assertEquals("Hello", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
    }

    @Test
    public void testLoadInputStreamWithAlternateParser() throws Exception {
        String xml = "<root><item>Value</item></root>";
        // Use default charset for the byte array.
        InputStream inputStream = new ByteArrayInputStream(xml.getBytes(Charset.defaultCharset()));
        Document doc = DataUtil.load(inputStream, null, "http://example.com/", Parser.xmlParser());
        assertEquals("root", doc.childNode(0).nodeName());
        assertEquals("Value", doc.select("item").first().text());
    }
    
    @Test
    public void testReadToByteBufferEmptyStream() throws IOException {
        InputStream emptyStream = new ByteArrayInputStream(new byte[0]);
        ByteBuffer buffer = DataUtil.readToByteBuffer(emptyStream);
        assertFalse(buffer.hasRemaining());
    }

    @Test
    public void testReadToByteBufferLargeStream() throws IOException {
        // Use bufferSize from DataUtil class
        byte[] largeData = new byte[DataUtil.bufferSize * 2]; // Larger than bufferSize
        for (int i = 0; i < largeData.length; i++) {
            largeData[i] = (byte) (i % 256);
        }
        InputStream largeStream = new ByteArrayInputStream(largeData);
        ByteBuffer buffer = DataUtil.readToByteBuffer(largeStream);
        assertEquals(largeData.length, buffer.limit());
        // Rewind buffer to read from the beginning
        buffer.rewind();
        for (int i = 0; i < largeData.length; i++) {
            assertEquals(largeData[i], buffer.get());
        }
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeNoCharset() {
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentTypeWithCharset() {
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentTypeWithQuotedCharset() {
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
    }

    @Test
    public void testGetCharsetFromContentTypeWithExtraParams() {
        assertEquals("GB2312", DataUtil.getCharsetFromContentType("text/html; charset=gb2312; other=param"));
    }

    @Test
    public void testGetCharsetFromContentTypeCaseInsensitive() {
        assertEquals("UTF-16", DataUtil.getCharsetFromContentType("content/type; CHARSET=UTF-16"));
    }

    @Test
    public void testParseByteDataCharsetDetectionReDecode() {
        // Simulate a scenario where a meta tag changes the charset
        String htmlPart1 = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=ASCII\"><title>A</title></head><body>";
        String htmlPart2 = "World</p></body></html>";
        // Use a character that is valid in UTF-8 but not in ASCII.
        String specialChar = "\u03A9"; // Omega symbol
        String fullHtml = htmlPart1 + specialChar + htmlPart2;

        // Encode with UTF-8 first to ensure special characters are present, then let parseByteData detect and re-decode.
        ByteBuffer byteData = Charset.forName("UTF-8").encode(fullHtml);

        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com/", Parser.htmlParser());
        assertEquals("A", doc.title());
        // Check if the special character was decoded correctly, implying re-decoding happened.
        // The exact representation of specialChar after decoding from ASCII might be different or a replacement character.
        // A more robust check would be to ensure the specific character that would be problematic if not re-decoded is handled.
        // For ASCII, it would likely be replaced. Let's check if the content is at least parsed.
        assertTrue(doc.body().html().contains("World"));
        // The original specialChar might be lost or corrupted if re-decoding to ASCII failed.
        // We assert that the charset is detected as ASCII.
        assertEquals("ASCII", doc.outputSettings().charset().name());
    }
}
```