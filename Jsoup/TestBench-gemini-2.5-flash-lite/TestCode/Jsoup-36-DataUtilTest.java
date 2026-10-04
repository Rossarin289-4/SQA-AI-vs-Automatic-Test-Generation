package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Locale;

public class DataUtilTest {

    // Helper method to create a temporary file with content
    private File createTempFileWithContent(String content) throws IOException {
        File tempFile = File.createTempFile("jsouptest", ".html");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(content.getBytes(Charset.forName("UTF-8")));
        }
        return tempFile;
    }

    // Helper method to create a temporary file with specific charset
    private File createTempFileWithCharset(String content, String charset) throws IOException {
        File tempFile = File.createTempFile("jsouptest", ".html");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(content.getBytes(Charset.forName(charset)));
        }
        return tempFile;
    }

    // Helper method to create a file with UTF-8 BOM
    private File createTempFileWithBom(String content) throws IOException {
        File tempFile = File.createTempFile("jsouptest", ".html");
        tempFile.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            // UTF-8 BOM
            fos.write(0xEF);
            fos.write(0xBB);
            fos.write(0xBF);
            fos.write(content.getBytes(Charset.forName("UTF-8")));
        }
        return tempFile;
    }

    // Helper method to get bytes from a string with a specific charset
    private byte[] getBytes(String str, String charset) throws UnsupportedEncodingException {
        return str.getBytes(Charset.forName(charset));
    }


    @Test
    public void testLoadWithNullCharsetAndMetaCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"gb2312\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation parses "gb2312" correctly, no need to normalize to uppercase.
        assertEquals("gb2312", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithNullCharsetAndMetaHttpEquivCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=gb2312\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation parses "gb2312" correctly.
        assertEquals("gb2312", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithSpecifiedCharset() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello World</body></html>";
        File tempFile = createTempFileWithCharset(html, "ISO-8859-1");
        Document doc = DataUtil.load(tempFile, "ISO-8859-1", "http://example.com/");
        assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithUnsupportedCharsetInMeta() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"unsupported-charset\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        // Should fall back to default UTF-8. The reference code indeed falls back.
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithEmptyCharsetInMeta() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        // Should fall back to default UTF-8.
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithNullCharsetAndNoMeta() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello World</body></html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name()); // Should default to UTF-8
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithBOMAndNoCharsetSpecified() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello World</body></html>";
        File tempFile = createTempFileWithBom(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The BOM should be stripped, and it should default to UTF-8.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithBOMAndSpecifiedCharset() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello World</body></html>";
        File tempFile = createTempFileWithBom(html);
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/"); // BOM should be handled
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadHandlesEmptyFile() throws Exception {
        String html = "";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("", doc.body().text());
    }

    @Test
    public void testLoadHandlesFileWithOnlyWhitespace() throws Exception {
        String html = "   \n\t ";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("", doc.body().text().trim()); // Body text should be empty after normalization
    }

    @Test
    public void testLoadWithInvalidContentTypeCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=invalid-charset\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // Should fall back to default.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithCharsetInContentTypeButNotSpecified() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ascii\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation correctly detects "ascii" and uses it.
        assertEquals("ASCII", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithCharsetInMetaButNotContentType() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"Shift_JIS\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("Shift_JIS", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithEmptyContentTypeHeader() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // Should fall back to default UTF-8.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithContentTypeHeaderContainingOnlyCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"charset=utf-16\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation handles this and uses UTF-16.
        assertEquals("UTF-16", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithContentTypeHeaderContainingSpacesAndQuotes() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=  \"UTF-8\" \">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation correctly strips quotes and spaces.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithDoubleEncodedCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8%20with%20some%20stuff\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The getCharsetFromContentType method will return "UTF-8%20with%20some%20stuff" which is not a valid charset.
        // It should fall back to default UTF-8.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMultipleMetaTags() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-16\">\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=gb2312\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The http-equiv tag should take precedence and be parsed correctly.
        assertEquals("gb2312", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMetaTagAfterContent() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<title>Test</title>\n<meta charset=\"gb2312\">\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation correctly finds the charset meta tag even if it's not at the very beginning of head.
        assertEquals("gb2312", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithEmptyMetaTagContent() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // Should fall back to default.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMetaTagAndNoCharsetValue() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // Should fall back to default.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMalformedMetaTag() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html charset=UTF-8\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The malformed content type should be ignored by getCharsetFromContentType and it falls back to default.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithNonAsciiCharactersInBody() throws Exception {
        String html = "<html><head><title>Test</title></head><body>你好世界</body></html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("你好世界", doc.body().text());
    }

    @Test
    public void testLoadWithDifferentCharsetAndNonAsciiCharacters() throws Exception {
        String html = "<html><head><title>Test</title></head><body>你好世界</body></html>";
        File tempFile = createTempFileWithCharset(html, "GBK");
        Document doc = DataUtil.load(tempFile, "GBK", "http://example.com/");
        assertEquals("GBK", doc.outputSettings().charset().name());
        assertEquals("你好世界", doc.body().text());
    }

    @Test
    public void testLoadWithSpecifiedCharsetAndMetaSpecifiedDifferentCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-16\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com/");
        // The specified charset in the load method should take precedence.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMetaTagWithUppercaseCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"GB2312\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation correctly handles uppercase charset names.
        assertEquals("GB2312", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMetaTagWithMixedCaseCharset() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"gB2312\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The reference implementation correctly handles mixed-case charset names that are supported.
        assertEquals("gB2312", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithNullBaseUri() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello World</body></html>";
        File tempFile = createTempFileWithContent(html);
        // The reference implementation's `parseByteData` method directly calls `parser.parseInput(docData, baseUri)`.
        // The `Parser.parseInput` method (from the API outline) does not explicitly validate `baseUri` for null.
        // Therefore, `DataUtil.load` should not throw an IllegalArgumentException for a null baseUri.
        Document doc = DataUtil.load(tempFile, "UTF-8", null);
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
        assertNull(doc.baseUri()); // The baseUri passed to parser.parseInput is null.
    }

    @Test
    public void testLoadWithEmptyBaseUri() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello World</body></html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, "UTF-8", "");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
        assertEquals("", doc.baseUri());
    }

    @Test
    public void testLoadWithMetaTagAndEmptyContentType() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n<meta http-equiv=\"Content-Type\" content=\"\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        // The meta charset should be used as content-type is empty.
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMetaTagAndNoContentTypeAttribute() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }

    @Test
    public void testLoadWithMetaTagAndNoCharsetAttributeInContentType() throws Exception {
        String html = "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n<title>Test</title>\n</head>\n<body>Hello World</body>\n</html>";
        File tempFile = createTempFileWithContent(html);
        Document doc = DataUtil.load(tempFile, null, "http://example.com/");
        assertEquals("UTF-8", doc.outputSettings().charset().name());
        assertEquals("Hello World", doc.body().text());
    }
}
