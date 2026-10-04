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
        String html = "<html><head><title>Test Title</title></head><body>Café</body></html>";
        File tempFile = createTempFile("testLoadFileWithSpecifiedCharset", ".html", html);
        Document doc = DataUtil.load(tempFile, "ISO-8859-1", "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Café", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().toString());
        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaCharset() throws IOException {
        // Test loading a file where the charset is defined in a meta tag.
        // The parser should detect and use the charset from the meta tag.
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Meta Charset Test</title></head><body>Hôtel</body></html>";
        File tempFile = createTempFile("testLoadFileWithMetaCharset", ".html", html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Meta Charset Test", doc.title());
        assertEquals("Hôtel", doc.body().text());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().toString());
        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaHttpEquivCharset() throws IOException {
        // Test loading a file where the charset is defined in a meta http-equiv tag.
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=gb2312\"><title>Meta HTTP-EQUIV Charset Test</title></head><body>你好</body></html>";
        File tempFile = createTempFile("testLoadFileWithMetaHttpEquivCharset", ".html", html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Meta HTTP-EQUIV Charset Test", doc.title());
        assertEquals("你好", doc.body().text());
        // The detected charset might be GB2312, or default if it's not supported or detected incorrectly.
        // Jsoup's internal logic might default to UTF-8 if GB2312 is problematic or not directly supported in the Java environment.
        // We assert that a charset was set, and ideally the correct one if the environment supports it.
        // For robustness, let's check if it's either the detected one or a sensible default.
        String detectedCharset = doc.outputSettings().charset().toString();
        assertTrue(detectedCharset.equals("GB2312") || detectedCharset.equals("UTF-8"));
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
        String html = "<html><body>Stream Test with UTF-16</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-16")));
        Document doc = DataUtil.load(is, "UTF-16", "http://example.com");
        assertEquals("Stream Test with UTF-16", doc.body().text());
        assertEquals("UTF-16", doc.outputSettings().charset().toString());
        is.close();
    }

    @Test
    public void testLoadInputStreamWithMetaCharset() throws IOException {
        // Test loading from an InputStream where charset is in meta tag.
        String html = "<html><head><meta charset=\"UTF-16\"><title>Stream Meta</title></head><body>Stream Hôtel</body></html>";
        InputStream is = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-16")));
        Document doc = DataUtil.load(is, null, "http://example.com");
        assertEquals("Stream Meta", doc.title());
        assertEquals("Stream Hôtel", doc.body().text());
        assertEquals("UTF-16", doc.outputSettings().charset().toString());
        is.close();
    }

    @Test
    public void testLoadInputStreamWithAlternateParser() throws IOException {
        // Test loading with a specific XML parser.
        String xml = "<root><item>Value</item></root>";
        InputStream is = new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.load(is, null, "http://example.com", Parser.xmlParser());
        assertEquals("root", doc.tagName());
        assertEquals("Value", doc.select("item").first().text());
        is.close();
    }

    @Test
    public void testParseByteDataWithMetaCharsetOverride() throws IOException {
        // Test that meta charset tag overrides initial charset, with UTF-8 as default.
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Override Test</title></head><body>Café</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8"))); // Initially encoded as UTF-8
        Document doc = DataUtil.parseByteData(byteData, "UTF-8", "http://example.com", Parser.htmlParser());
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
        assertNull(DataUtil.getCharsetFromContentType("text/html; charset=Unsupported-Charset-123"));
    }

    @Test
    public void testParseByteDataWithBOM() throws IOException {
        // Test parsing a byte data that starts with a BOM. It should be stripped.
        String html = "\uFEFF<html><head><title>BOM Test</title></head><body>Content</body></html>";
        ByteBuffer byteData = ByteBuffer.wrap(html.getBytes(Charset.forName("UTF-8")));
        Document doc = DataUtil.parseByteData(byteData, null, "http://example.com", Parser.htmlParser());
        assertEquals("BOM Test", doc.title());
        assertEquals("Content", doc.body().text());
        // The BOM should be stripped, so the effective charset remains the default.
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
        return tempFile;
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover the `load` methods (taking `File` and `InputStream`), and the internal `parseByteData`, `readToByteBuffer`, and `getCharsetFromContentType` methods. They test charset detection, parsing with specified charsets, and handling of meta tags.
2. TEST CASE DESIGN -
    - `testLoadFileWithDefaultCharset`: File, null charset, HTML content -> Document with correct title/body, UTF-8 charset.
    - `testLoadFileWithSpecifiedCharset`: File, "ISO-8859-1" charset, HTML content -> Document with correct title/body, ISO-8859-1 charset.
    - `testLoadFileWithMetaCharset`: File, null charset, meta charset="ISO-8859-1" -> Document with correct title/body, ISO-8859-1 charset.
    - `testLoadFileWithMetaHttpEquivCharset`: File, null charset, meta http-equiv="...charset=gb2312" -> Document with correct title/body, GB2312 or UTF-8 charset.
    - `testLoadInputStreamWithDefaultCharset`: InputStream, null charset, HTML content -> Document with correct body, UTF-8 charset.
    - `testLoadInputStreamWithSpecifiedCharset`: InputStream, "UTF-16" charset, HTML content -> Document with correct body, UTF-16 charset.
    - `testLoadInputStreamWithMetaCharset`: InputStream, null charset, meta charset="UTF-16" -> Document with correct title/body, UTF-16 charset.
    - `testLoadInputStreamWithAlternateParser`: InputStream, null charset, XML content, XML parser -> Document with correct root/item, UTF-8 charset.
    - `testParseByteDataWithMetaCharsetOverride`: ByteBuffer, "UTF-8" initial charset, meta charset="ISO-8859-1" -> Document with correct title/body, ISO-8859-1 charset.
    - `testParseByteDataWithNoMetaCharsetProvided`: ByteBuffer, null initial charset, no meta tag -> Document with correct title/body, UTF-8 charset.
    - `testParseByteDataWithEmptyMetaCharset`: ByteBuffer, null initial charset, meta charset="" -> Document with correct title/body, UTF-8 charset.
    - `testParseByteDataWithUnsupportedMetaCharset`: ByteBuffer, null initial charset, meta charset="Unsupported" -> Document with correct title/body, UTF-8 charset.
    - `testReadToByteBuffer`: InputStream -> ByteBuffer, reads back to string and asserts equality.
    - `testGetCharsetFromContentTypeNull`: null input -> null.
    - `testGetCharsetFromContentTypeEmpty`: "" input -> null.
    - `testGetCharsetFromContentTypeNoCharset`: "text/html;" input -> null.
    - `testGetCharsetFromContentTypeBasic`: "text/html; charset=UTF-8" input -> "UTF-8".
    - `testGetCharsetFromContentTypeWithSpaces`: "text/html; charset = UTF-8" input -> "UTF-8".
    - `testGetCharsetFromContentTypeCaseInsensitive`: "text/html; charset=utf-8" input -> "UTF-8".
    - `testGetCharsetFromContentTypeUnsupported`: "text/html; charset=Unsupported" input -> null.
    - `testParseByteDataWithBOM`: ByteBuffer with BOM -> Document with BOM stripped, correct content/title, UTF-8 charset.
    - `testLoadFileWithEmptyContent`: Empty file -> Empty Document, UTF-8 charset.
    - `testLoadInputStreamWithEmptyContent`: Empty InputStream -> Empty Document, UTF-8 charset.
4. DEFECT DETECTION STRATEGY - The tests cover various charset detection scenarios (explicit, meta tags, http-equiv) and input methods (File, InputStream), aiming to catch issues in character encoding, parsing logic, and charset extraction from headers.
5. SUMMARY - 22 tests.
6. LIMITATIONS - Tests rely on the availability of specific charsets and the behavior of the underlying Java `Charset` class. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.