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

public class DataUtilTest {
    @Test
    public void testUtf8FileAndBaseUri() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<title>Edge</title><p>ok</p>", "UTF-8");
            Document doc = DataUtil.load(file, "UTF-8", "https://example.test/path/");
            assertEquals("Edge", doc.title());
            assertEquals("https://example.test/path/", doc.baseUri());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testSingleByteCharset() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<p>caf\u00e9</p>", "ISO-8859-1");
            Document doc = DataUtil.load(file, "ISO-8859-1", "");
            assertEquals("caf\u00e9", doc.select("p").first().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testExplicitCharsetOverridesMeta() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<meta charset='UTF-8'><title>Chosen</title>", "UTF-8");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("Chosen", doc.title());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testEmptyFileLoadsDocument() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<title></title>", "UTF-8");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("", doc.title());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testBomAtStartIsIgnored() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "\ufeff<title>Bom</title>", "UTF-8");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("Bom", doc.title());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testInvalidFileCharsetThrows() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<p>x</p>", "UTF-8");
            try {
                DataUtil.load(file, "not-a-charset", "");
                fail("expected IllegalCharsetNameException or UnsupportedCharsetException");
            } catch (IllegalArgumentException expected) {
                assertTrue(expected instanceof IllegalArgumentException);
            }
        } finally {
            file.delete();
        }
    }

    @Test
    public void testFileContentsWithMultipleElements() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<p>one</p><p>two</p>", "UTF-8");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals(2, doc.select("p").size());
            assertEquals("two", doc.select("p").get(1).text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testFileLoadUsesHtmlParsing() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<title>x</title><p>y</p>", "UTF-8");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("y", doc.body().text());
        } finally {
            file.delete();
        }
    }

    private static void write(File file, String text, String charset) throws Exception {
        OutputStream out = new FileOutputStream(file);
        try {
            out.write(text.getBytes(charset));
        } finally {
            out.close();
        }
    }
}
