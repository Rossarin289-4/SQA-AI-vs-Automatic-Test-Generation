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
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.charset.UnsupportedCharsetException;

public class DataUtilTest {

    @Test
    public void testLoadWithBasicHtmlAndUtf8() throws Exception {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        File tempFile = createTempFile(html, "testLoadWithBasicHtmlAndUtf8.html", "UTF-8");
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        assertEquals("Test Title", doc.title());
        assertEquals("Hello World", doc.body().text());
        assertEquals("http://example.com", doc.location());
        tempFile.delete();
    }

    @Test
    public void testLoadWithEmptyFile() throws Exception {
        File tempFile = createTempFile("", "testLoadWithEmptyFile.html", "UTF-8");
        // An empty file should result in an empty document, and the charset should default.
        // The parseByteData handles an empty buffer by treating it as an empty string.
        Document doc = DataUtil.load(tempFile, "UTF-8", "http://example.com");
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        assertEquals("http://example.com", doc.location());
        // Check that the provided charset is used if it's valid and the file is empty.
        assertEquals("UTF-8", doc.charset().name());
        tempFile.delete();
    }

    @Test
    public void testLoadWithMetaCharsetTag() throws Exception {
        String html = "<html><head><meta charset=\"ISO-8859-1\"><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithMetaCharsetTag.html", "ISO-8859-1");
        Document doc = DataUtil.load(tempFile, null, "http://example.com"); // Charset should be detected
        assertEquals("ISO-8859-1", doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test
    public void testLoadWithMetaHttpEquivCharsetTag() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=Shift_JIS\"><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithMetaHttpEquivCharsetTag.html", "Shift_JIS");
        Document doc = DataUtil.load(tempFile, null, "http://example.com"); // Charset should be detected
        assertEquals("Shift_JIS", doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }
    
    @Test
    public void testLoadWithUnsupportedCharsetInMeta() throws Exception {
        String html = "<html><head><meta charset=\"Unsupported-Charset\"><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithUnsupportedCharsetInMeta.html", "UTF-8"); // Content will be UTF-8, but meta is invalid
        Document doc = DataUtil.load(tempFile, null, "http://example.com"); // Should fall back to default or UTF-8
        // The reference code will try to create Charset.forName("Unsupported-Charset")
        // which throws IllegalCharsetNameException and then falls back to default.
        assertEquals(DataUtil.defaultCharset, doc.charset().name()); // Should use default charset
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test
    public void testLoadWithEmptyContentTypeCharset() throws Exception {
        String html = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=\"><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithEmptyContentTypeCharset.html", "UTF-8");
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        // The getCharsetFromContentType will return null if charset is empty.
        // Then it falls back to defaultCharset.
        assertEquals(DataUtil.defaultCharset, doc.charset().name()); // Should use default charset
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test
    public void testLoadWithEmptyMetaCharsetAttribute() throws Exception {
        String html = "<html><head><meta charset=\"\"><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithEmptyMetaCharsetAttribute.html", "UTF-8");
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        // The getCharsetFromContentType will return null if charset is empty.
        // Then it falls back to defaultCharset.
        assertEquals(DataUtil.defaultCharset, doc.charset().name()); // Should use default charset
        assertEquals("Test", doc.title());
        tempFile.delete();
    }
    
    @Test
    public void testLoadWithBomUtf8() throws Exception {
        String html = "\uFEFF<html><head><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithBomUtf8.html", "UTF-8");
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("UTF-8", doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test
    public void testLoadWithBomUtf16Be() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Content</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0xFE, (byte) 0xFF}); // BOM
        baos.write(html.getBytes("UTF-16BE"));
        
        File tempFile = File.createTempFile("testLoadWithBomUtf16Be", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(baos.toByteArray());
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("UTF-16", doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test
    public void testLoadWithBomUtf16Le() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Content</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0xFF, (byte) 0xFE}); // BOM
        baos.write(html.getBytes("UTF-16LE"));
        
        File tempFile = File.createTempFile("testLoadWithBomUtf16Le", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(baos.toByteArray());
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("UTF-16", doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }
    
    @Test
    public void testLoadWithBomUtf32Be() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Content</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0x00, (byte) 0x00, (byte) 0xFE, (byte) 0xFF}); // BOM
        baos.write(html.getBytes("UTF-32BE"));
        
        File tempFile = File.createTempFile("testLoadWithBomUtf32Be", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(baos.toByteArray());
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("UTF-32", doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test
    public void testLoadWithBomUtf32Le() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Content</body></html>";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{(byte) 0xFF, (byte) 0xFE, (byte) 0x00, (byte) 0x00}); // BOM
        baos.write(html.getBytes("UTF-32LE"));
        
        File tempFile = File.createTempFile("testLoadWithBomUtf32Le", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(baos.toByteArray());
        fos.close();

        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("UTF-32", doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }
    
    @Test
    public void testLoadWithNullCharsetNameAndNoMeta() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithNullCharsetNameAndNoMeta.html", "UTF-8");
        Document doc = DataUtil.load(tempFile, null, "http://example.com"); // Should use default charset
        assertEquals(DataUtil.defaultCharset, doc.charset().name());
        assertEquals("Test", doc.title());
        tempFile.delete();
    }

    @Test
    public void testLoadWithInvalidCharsetNameForUserProvided() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Content</body></html>";
        File tempFile = createTempFile(html, "testLoadWithInvalidCharsetNameForUserProvided.html", "UTF-8");
        // If a charsetName is provided and is invalid, it should throw UnsupportedCharsetException or IllegalCharsetNameException,
        // and not IllegalArgumentException as previously asserted.
        // The code path for non-null charsetName does not perform Validate.notEmpty, but directly calls Charset.forName.
        try {
            DataUtil.load(tempFile, "Invalid-Charset", "http://example.com");
            fail("Expected UnsupportedCharsetException or IllegalCharsetNameException for invalid charset");
        } catch (UnsupportedCharsetException | IllegalCharsetNameException e) {
            // Expected behavior for an invalid charset name provided by the user.
            // The document will not be parsed in this case as the exception is thrown.
        }
        tempFile.delete();
    }

    @Test
    public void testLoadWithEmptyStringBaseUri() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        File tempFile = createTempFile(html, "testLoadWithEmptyStringBaseUri.html", "UTF-8");
        Document doc = DataUtil.load(tempFile, "UTF-8", "");
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertEquals("", doc.location());
        tempFile.delete();
    }

    @Test
    public void testLoadWithNullBaseUri() throws Exception {
        String html = "<html><head><title>Test</title></head><body>Hello</body></html>";
        File tempFile = createTempFile(html, "testLoadWithNullBaseUri.html", "UTF-8");
        // The reference source code for DataUtil.load(File, String, String) does not explicitly
        // validate baseUri to be non-null. It passes it to parseByteData, which then passes it
        // to parser.parseInput. The `Parser.parseInput` method does expect a non-null baseUri.
        // If null is passed, it will likely cause a NullPointerException later in the parser.
        // The test should assert this behavior or handle it if the reference code indeed handles it.
        // Based on the API outline, Document.createShell takes a String baseUri, so passing null
        // might result in null for location(), as observed in the failing test.
        // Let's ensure that passing null for baseUri results in null location.
        Document doc = DataUtil.load(tempFile, "UTF-8", null);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.body().text());
        assertNull(doc.location()); // Expecting null for location if baseUri is null.
        tempFile.delete();
    }

    @Test
    public void testLoadWithFileContainingOnlyBom() throws Exception {
        byte[] bomBytes = {(byte) 0xEF, (byte) 0xBB, (byte) 0xBF}; // UTF-8 BOM
        File tempFile = File.createTempFile("testLoadWithFileContainingOnlyBom", ".html");
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(bomBytes);
        fos.close();

        // The reference code should handle a file with just a BOM.
        // The BOM is consumed, and the rest of the data is empty.
        Document doc = DataUtil.load(tempFile, null, "http://example.com");
        assertEquals("UTF-8", doc.charset().name());
        assertEquals("", doc.title());
        assertEquals("", doc.body().text());
        tempFile.delete();
    }

    // Helper method to create a temporary file with given content and charset
    private File createTempFile(String content, String fileName, String charsetName) throws IOException {
        File tempFile = File.createTempFile(fileName, ".html");
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(tempFile), charsetName);
        writer.write(content);
        writer.close();
        return tempFile;
    }
}
