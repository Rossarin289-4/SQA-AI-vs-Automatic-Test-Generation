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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testLoadFileWithDefaultCharsetAndBaseUri() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithSpecifiedCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("ISO-8859-1"));
        fos.close();

        Document doc = DataUtil.load(tempFile, "ISO-8859-1", "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta charset=\"ISO-8859-1\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("ISO-8859-1"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("ISO-8859-1", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaHttpEquivCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("gb2312"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaHttpEquivAndMetaCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        // The http-equiv content is processed first, so it should take precedence.
        String content = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><meta charset=\"utf-16\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        // Use a charset that's common and can be safely written, then let the parser detect.
        // The critical part is that the meta tags are present. The actual bytes written might be ignored if detection works.
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // http-equiv should take precedence if both are present
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }


    @Test
    public void testLoadFileWithUnsupportedCharsetInMeta() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta charset=\"unsupported-charset\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        // Use UTF-8 as a fallback for writing
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // Default charset should be used if meta charset is unsupported
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithEmptyMetaCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta charset=\"\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // Default charset should be used if meta charset is empty
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithEmptyMetaHttpEquivContent() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // Default charset should be used if charset in content type is empty
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithNoMetaCharsetTag() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // Default charset should be used if no meta charset tag is present
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithUTF8BOM() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        // UTF-8 BOM: EF BB BF
        byte[] bom = {(byte)0xEF, (byte)0xBB, (byte)0xBF};
        String content = new String(bom) + "<html><head><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // BOM should be handled and default charset should be used
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaCharsetAndUTF8BOM() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        // UTF-8 BOM: EF BB BF
        byte[] bom = {(byte)0xEF, (byte)0xBB, (byte)0xBF};
        String content = new String(bom) + "<html><head><meta charset=\"ISO-8859-1\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        // Write with UTF-8 as BOM takes precedence and requires re-decode
        // The actual content bytes are less important here, as the BOM should dictate the initial parsing.
        // The parser then checks for meta tags, but the BOM should override if present.
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        // The BOM is stripped, and the content is parsed with UTF-8.
        // The meta charset is then checked, but the BOM has already dictated UTF-8.
        // The code snippet `if (docData.length() > 0 && docData.charAt(0) == 65279)` handles the BOM.
        // It then rewinds and re-decodes with defaultCharset (UTF-8) and strips the BOM.
        // The subsequent logic might re-evaluate the charset from meta tags, but the BOM has already set the stage.
        // In this case, UTF-8 is correctly identified because of the BOM.
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMetaHttpEquivAndUTF8BOM() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        // UTF-8 BOM: EF BB BF
        byte[] bom = {(byte)0xEF, (byte)0xBB, (byte)0xBF};
        String content = new String(bom) + "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        // Write with UTF-8 as BOM takes precedence and requires re-decode
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        // Similar to the previous test, the BOM should take precedence over the http-equiv charset.
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("UTF-8", doc.outputSettings().charset().displayName()); // BOM dictates UTF-8

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithEmptyContent() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithOnlyHtmlTag() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithOnlyHeadTag() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<head></head>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithOnlyBodyTag() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<body></body>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithComplexHtml() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Complex Title</title></head><body><h1>Header</h1><p class=\"content\">Some text.</p></body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Complex Title", doc.title());
        assertEquals("Header Some text.", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("UTF-8", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithSpecialCharacters() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><title>Special Chars</title></head><body>&amp; &lt; &gt; &quot; &apos;</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Special Chars", doc.title());
        // Jsoup unescapes entities by default in text content
        assertEquals("& < > \" '", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithInvalidBaseUri() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><title>Test</title></head><body>Content</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        // Jsoup's Document constructor doesn't strictly validate baseUri, but it's good to check if it's used.
        Document doc = DataUtil.load(tempFile, null, "invalid-uri");
        assertEquals("Test", doc.title());
        assertEquals("Content", doc.body().text());
        assertEquals("invalid-uri", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWhenFileDoesNotExist() {
        File nonExistentFile = new File("non_existent_file.html");
        try {
            DataUtil.load(nonExistentFile, null, "http://example.com");
            fail("Expected IOException for non-existent file");
        } catch (IOException expected) {
            // Expected
        }
    }

    @Test
    public void testLoadFileWithEmptyStringContent() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        assertEquals("http://example.com", doc.location());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithNullCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><title>Test</title></head><body>Hello</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("UTF-8", doc.outputSettings().charset().displayName()); // Default charset

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithQuotedCharsetInMeta() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta charset=\"'gb2312'\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("gb2312"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithQuotedCharsetInHttpEquiv() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset='gb2312'\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("gb2312"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithCharsetAsUppercase() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta charset=\"GB2312\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("gb2312"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithCharsetAsUppercaseInHttpEquiv() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB2312\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("gb2312"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMixedCaseCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta charset=\"gB2312\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("gb2312"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // The getCharsetFromContentType logic handles case insensitivity for supported charsets.
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithMixedCaseCharsetInHttpEquiv() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gB2312\"><title>Test Title</title></head><body>Hello World!</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("gb2312"));
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World!", doc.body().text());
        assertEquals("http://example.com", doc.location());
        assertEquals("GB2312", doc.outputSettings().charset().displayName());

        tempFile.delete();
    }

    @Test
    public void testLoadFileWithNonAsciiInBaseUri() throws IOException {
        File tempFile = File.createTempFile("jsoup", ".html");
        String content = "<html><head><title>Test</title></head><body>Content</body></html>";
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(content.getBytes("UTF-8"));
        fos.close();

        // Test with a non-ASCII character in the base URI.
        Document doc = DataUtil.load(tempFile, null, "http://example.com/你好");
        assertEquals("Test", doc.title());
        assertEquals("Content", doc.body().text());
        assertEquals("http://example.com/你好", doc.location());

        tempFile.delete();
    }
}
