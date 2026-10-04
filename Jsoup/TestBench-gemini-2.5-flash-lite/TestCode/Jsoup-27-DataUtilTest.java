package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Locale;

public class DataUtilTest {
    @Test
    public void testLoadFileWithDefaultCharset() throws IOException {
        // Test loading a file with the default charset (UTF-8) when no charset is specified.
        // The content will be parsed as UTF-8.
        File tempFile = createTempFile("testLoadFileWithDefaultCharset", ".html", "<html><head><title>Test Title</title></head><body>Hello World</body></html>");
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
        tempFile.delete();
    }

    @Test
    public void testLoadFileWithSpecifiedCharset() throws IOException {
        // Test loading a file with a specified charset (e.g., ISO-8859-1).
        // The content should be correctly decoded using the provided charset.
        // The character 'é' is represented differently in UTF-8 and ISO-8859-1.
        // When encoded with UTF-8 and decoded with ISO-8859-1, it might result in mojibake.
        // The test should reflect the actual decoding behavior.
        String html = "<html><head><title>Test Title</title></head><body>Café</body></html>";
        File tempFile = createTempFile("testLoadFileWithSpecifiedCharset", ".html", html);
        // If the input is UTF-8 encoded "Café" (C3 A9 for é) and parsed as ISO-8859-1,
        // the parser will try to interpret C3 as 'Ã' and A9 as '©' or similar.
        // The correct behavior is to encode the string using the specified charset.
        // For demonstration, let's use a string that is representable in ISO-8859-1.
        String isoHtml = "<html><head><title>Test Title</title></head><body>Caf\u00E9</body></html>"; // é in ISO-8859-1
        File isoTempFile = createTempFile("testLoadFileWithSpecifiedCharsetIso", ".html", isoHtml);
        Document doc = DataUtil.load(isoTempFile, "ISO-8859-1", "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Café", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().toString());
        isoTempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaCharset() throws IOException {
        // Test loading a file where the charset is defined in a meta tag.
        // The parser should detect and use the charset from the meta tag.
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Meta Charset Test</title></head><body>Hôtel</body></html>";
        File tempFile = createTempFile("testLoadFileWithMetaCharset", ".html", html);
        // The original "Hôtel" string encoded in UTF-8 will have its 'ô' as C3 B4.
        // If parsed as ISO-8859-1, C3 would be 'Ã' and B4 would be '´'.
        // To get 'Hôtel' correctly, the content should be encoded in ISO-8859-1.
        byte[] htmlBytes = "<html><head><meta charset=\"ISO-8859-1\"><title>Meta Charset Test</title></head><body>H\u00F4tel</body></html>".getBytes(Charset.forName("ISO-8859-1"));
        File isoTempFile = File.createTempFile("testLoadFileWithMetaCharsetIso", ".html");
        try (FileOutputStream fos = new FileOutputStream(isoTempFile)) {
            fos.write(htmlBytes);
        }
        Document doc = DataUtil.load(isoTempFile, null, "http://example.com");
        assertEquals("Meta Charset Test", doc.title());
        assertEquals("Hôtel", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().toString());
        isoTempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaHttpEquivCharset() throws IOException {
        // Test loading a file where the charset is defined in a meta http-equiv tag.
        // The original "你好" is in UTF-8. The charset specified is gb2312.
        // The reference code decodes UTF-8 bytes and then tries to parse.
        // If gb2312 is not directly supported, it might fall back to UTF-8.
        // The reference code attempts to detect charset from meta tags.
        // When it finds "gb2312", it should re-decode using that charset.
        // For this to work, the input byte data needs to be gb2312 encoded.
        // Let's assume the input file *is* gb2312 encoded.
        String htmlContent = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=gb2312\"><title>Meta HTTP-EQUIV Charset Test</title></head><body>你好</body></html>";
        byte[] gb2312Bytes = htmlContent.getBytes(Charset.forName("GB2312"));
        File tempFile = File.createTempFile("testLoadFileWithMetaHttpEquivCharset", ".html");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(gb2312Bytes);
        }
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Meta HTTP-EQUIV Charset Test", doc.title());
        assertEquals("你好", doc.body().text());
        assertEquals("GB2312", doc.outputSettings().charset().toString()); // Expecting GB2312 as it's supported and specified.
        tempFile.delete();
    }


    @Test
    public void testLoadInputStreamWithDefaultCharset() throws IOException {
        // Test loading from an InputStream with the default charset.
        String html = "<html><body>Default Stream Test</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("Default Stream Test", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
        is.close();
    }

    @Test
    public void testLoadInputStreamWithSpecifiedCharset() throws IOException {
        // Test loading from an InputStream with a specified charset.
        // The string "Café" encoded in UTF-8 is C3 A9 for é.
        // If parsed with "UTF-16", it will likely result in mojibake.
        // The correct approach is to provide the input stream already encoded in the specified charset.
        String html = "<html><body>Caf\u00E9</body></html>"; // é in ISO-8859-1
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.load(is, "ISO-8859-1", "http://example.com");
        assertEquals("Café", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().toString());
        is.close();
    }

    @Test
    public void testLoadInputStreamWithMetaCharset() throws IOException {
        // Test loading from an InputStream where charset is in meta tag.
        // The string "Hôtel" in ISO-8859-1 is H\u00F4tel.
        String htmlContent = "<html><head><meta charset=\"ISO-8859-1\"><title>Stream Meta</title></head><body>H\u00F4tel</body></html>";
        InputStream is = new ByteArrayInputStream(htmlContent.getBytes(Charset.forName("ISO-8859-1")));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("Stream Meta", doc.title());
        assertEquals("Hôtel", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().toString());
        is.close();
    }

    @Test
    public void testLoadInputStreamWithAlternateParser() throws IOException {
        // Test loading with a specific XML parser.
        String xml = "<root><item>Value</item></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com", Parser.xmlParser());
        // The XML parser will create a Document with a root element named "root", not a "html" element.
        // The tagName() method on Document returns the root element's tag name.
        assertEquals("root", doc.tagName());
        assertEquals("Value", doc.select("item").first().text());
        is.close();
    }

    @Test
    public void testParseByteDataWithMetaCharsetOverride() throws IOException {
        // Test that meta charset tag overrides initial charset, with UTF-8 as default.
        // The original content is encoded in ISO-8859-1 and contains 'é'.
        // The meta tag specifies ISO-8859-1.
        String htmlContent = "<html><head><meta charset=\"ISO-8859-1\"><title>Override Test</title></head><body>Caf\u00E9</body></html>"; // é in ISO-8859-1
        byte[] isoBytes = htmlContent.getBytes(Charset.forName("ISO-8859-1"));
        ByteBuffer byteData = ByteBuffer.wrap(isoBytes);
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser()); // Initial charset specified as UTF-8
        assertEquals("Override Test", doc.title());
        assertEquals("Café", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().toString());
    }

    @Test
    public void testParseByteDataWithNoMetaCharsetProvided() throws IOException {
        // Test parsing when no meta charset is present, defaulting to UTF-8.
        String html = "<html><head><title>No Meta Test</title></head><body>UTF-8 Content</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertEquals("No Meta Test", doc.title());
        assertEquals("UTF-8 Content", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
    }

    @Test
    public void testParseByteDataWithEmptyMetaCharset() throws IOException {
        // Test parsing when meta charset attribute is empty. Should default to UTF-8.
        String html = "<html><head><meta charset=\"\"><title>Empty Meta Test</title></head><body>Default Fallback</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertEquals("Empty Meta Test", doc.title());
        assertEquals("Default Fallback", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
    }

    @Test
    public void testParseByteDataWithUnsupportedMetaCharset() throws IOException {
        // Test parsing when meta charset is unsupported. Should default to UTF-8.
        String html = "<html><head><meta charset=\"Unsupported-Charset-123\"><title>Unsupported Meta Test</title></head><body>Fallback Content</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertEquals("Unsupported Meta Test", doc.title());
        assertEquals("Fallback Content", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
    }

    @Test
    public void testReadToByteBuffer() throws IOException {
        // Test reading data into a ByteBuffer.
        String text = "This is a test string to be read into a ByteBuffer.";
        InputStream is = new ByteArrayInputStream(text.getBytes(Charset.forName("UTF-8")));
        ByteBuffer buffer = DataUtil.readToByteBuffer(is);
        byte[] actualBytes = new byte[buffer.remaining()];
        buffer.get(actualBytes);
        assertEquals(text, new String(actualBytes, Charset.forName("UTF-8")));
        is.close();
    }

    @Test
    public void testGetCharsetFromContentTypeNull() {
        // Test getCharsetFromContentType with null input.
        assertNull(DataUtil.getCharsetFromContentType(null));
    }

    @Test
    public void testGetCharsetFromContentTypeEmpty() {
        // Test getCharsetFromContentType with empty input.
        assertNull(DataUtil.getCharsetFromContentType(""));
    }

    @Test
    public void testGetCharsetFromContentTypeNoCharset() {
        // Test getCharsetFromContentType when no charset is present.
        assertNull(DataUtil.getCharsetFromContentType("text/html;"));
        assertNull(DataUtil.getCharsetFromContentType("text/html"));
    }

    @Test
    public void testGetCharsetFromContentTypeBasic() {
        // Test getCharsetFromContentType with a standard charset.
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/plain; charset=ISO-8859-1"));
    }

    @Test
    public void testGetCharsetFromContentTypeWithSpaces() {
        // Test getCharsetFromContentType with spaces around charset.
        // The regex `\\s*` should handle spaces around the equals sign.
        // `m.group(1).trim()` handles spaces around the charset value.
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset = UTF-8"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=\"UTF-8\""));
    }

    @Test
    public void testGetCharsetFromContentTypeCaseInsensitive() {
        // Test getCharsetFromContentType with case variations.
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=utf-8"));
        assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
    }

    @Test
    public void testGetCharsetFromContentTypeUnsupported() {
        // Test getCharsetFromContentType with an unsupported charset.
        // The method should return null if Charset.isSupported(charset) is false.
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=Unsupported-Charset-123"));
    }

    @Test
    public void testParseByteDataWithBOM() throws IOException {
        // Test parsing a byte data that starts with a BOM. It should be stripped.
        // The BOM character is \uFEFF.
        String html = "\uFEFF<html><head><title>BOM Test</title></head><body>Content</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertEquals("BOM Test", doc.title());
        // The BOM should be stripped before parsing, so the text should be "Content"
        assertEquals("Content", doc.body().text());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
    }

    @Test
    public void testLoadFileWithEmptyContent() throws IOException {
        // Test loading an empty file.
        File tempFile = createTempFile("testLoadFileWithEmptyContent", ".html", "");
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        // An empty file should result in an empty document.
        assertTrue(doc.head().children().isEmpty());
        assertTrue(doc.body().children().isEmpty());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
        tempFile.delete();
    }

    @Test
    public void testLoadInputStreamWithEmptyContent() throws IOException {
        // Test loading an empty input stream.
        InputStream is = new ByteArrayInputStream(new byte[0]);
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertTrue(doc.head().children().isEmpty());
        assertTrue(doc.body().children().isEmpty());
        assertEquals("UTF-8", doc.outputSettings().charset().toString());
        is.close();
    }

    /**
     * Helper method to create a temporary file with given content.
     * @param prefix Prefix for the temp file name.
     * @param suffix Suffix for the temp file name.
     * @param content Content to write to the file.
     * @return The created temporary file.
     * @throws IOException if an I/O error occurs.
     */
    private File createTempFile(String prefix, String suffix, String content) throws IOException {
        File tempFile = File.createTempFile(prefix, suffix);
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(content);
        }
        // Ensure the file is deleted on exit, in case of test failures.
        tempFile.deleteOnExit();
        return tempFile;
    }
}
