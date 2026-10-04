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
    public void testLoadExplicitUtf8() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<p>hello</p>".getBytes("UTF-8")), "UTF-8", "base");
        assertEquals("hello", doc.select("p").first().text());
    }

    @Test
    public void testLoadExplicitCharset() throws Exception {
        byte[] data = "<p>café</p>".getBytes("ISO-8859-1");
        Document doc = DataUtil.load(new ByteArrayInputStream(data), "ISO-8859-1", "base");
        assertEquals("café", doc.select("p").first().text());
    }

    @Test
    public void testLoadDetectedMetaCharset() throws Exception {
        String html = "<meta charset=\"ISO-8859-1\"><p>café</p>";
        byte[] data = html.getBytes("ISO-8859-1");
        Document doc = DataUtil.load(new ByteArrayInputStream(data), null, "base");
        assertEquals("café", doc.select("p").first().text());
    }

    @Test
    public void testLoadDetectedContentTypeCharset() throws Exception {
        String html = "<meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\"><p>café</p>";
        byte[] data = html.getBytes("ISO-8859-1");
        Document doc = DataUtil.load(new ByteArrayInputStream(data), null, "base");
        assertEquals("café", doc.select("p").first().text());
    }

    @Test
    public void testLoadUtf8WhenCharsetNotDeclared() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<p>hello</p>".getBytes("UTF-8")), null, "base");
        assertEquals("hello", doc.select("p").first().text());
    }

    @Test
    public void testLoadPreservesBaseUri() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<p>x</p>".getBytes("UTF-8")), "UTF-8", "http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testLoadStripsUtf8Bom() throws Exception {
        byte[] text = "<p>x</p>".getBytes("UTF-8");
        byte[] data = new byte[text.length + 3];
        data[0] = (byte) 0xef;
        data[1] = (byte) 0xbb;
        data[2] = (byte) 0xbf;
        System.arraycopy(text, 0, data, 3, text.length);
        Document doc = DataUtil.load(new ByteArrayInputStream(data), "UTF-8", "base");
        assertEquals("x", doc.select("p").first().text());
    }

    @Test
    public void testLoadWithHtmlParser() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<title>T</title>".getBytes("UTF-8")), "UTF-8", "base", Parser.htmlParser());
        assertEquals("T", doc.title());
    }

    @Test
    public void testLoadWithXmlParser() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<root><item>v</item></root>".getBytes("UTF-8")), "UTF-8", "base", Parser.xmlParser());
        assertEquals("v", doc.select("item").first().text());
    }

    @Test
    public void testLoadFile() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write("<p>file</p>".getBytes("UTF-8"));
            out.close();
            Document doc = DataUtil.load(file, "UTF-8", "base");
            assertEquals("file", doc.select("p").first().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadEmptyInput() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream(new byte[0]), null, "base");
        assertEquals("", doc.body().text());
    }

    @Test
    public void testLoadRejectsEmptyCharset() throws Exception {
        try {
            DataUtil.load(new ByteArrayInputStream("<p>x</p>".getBytes("UTF-8")), "", "base");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
