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
    @Test
    public void testLoadPlainHtml() throws Exception {
        Document doc = DataUtil.load(
                new ByteArrayInputStream("<p>hello</p>".getBytes("UTF-8")),
                "UTF-8", "http://example.test/");
        assertEquals("http://example.test/", doc.location());
        assertEquals("hello", doc.body().text());
    }

    @Test
    public void testLoadEmptyInput() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream(new byte[0]),
                "UTF-8", "http://example.test/");
        assertEquals("", doc.body().text());
    }

    @Test
    public void testLoadSpecifiedCharset() throws Exception {
        byte[] bytes = "<p>café</p>".getBytes("ISO-8859-1");
        Document doc = DataUtil.load(new ByteArrayInputStream(bytes),
                "ISO-8859-1", "http://example.test/");
        assertEquals("café", doc.body().text());
        assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void testLoadUtf8Bom() throws Exception {
        byte[] text = "<p>hello</p>".getBytes("UTF-8");
        byte[] bytes = new byte[text.length + 3];
        bytes[0] = (byte) 0xef;
        bytes[1] = (byte) 0xbb;
        bytes[2] = (byte) 0xbf;
        System.arraycopy(text, 0, bytes, 3, text.length);
        Document doc = DataUtil.load(new ByteArrayInputStream(bytes),
                "ISO-8859-1", "http://example.test/");
        assertEquals("ï»¿ hello", doc.body().text());
        assertEquals(Charset.forName("ISO-8859-1"), doc.outputSettings().charset());
    }

    @Test
    public void testLoadUtf8MetaCharset() throws Exception {
        String html = "<meta charset='UTF-8'><p>hello</p>";
        Document doc = DataUtil.load(new ByteArrayInputStream(html.getBytes("UTF-8")),
                null, "http://example.test/");
        assertEquals("hello", doc.body().text());
    }

    @Test
    public void testLoadHtmlWithCustomParser() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<item>value</item>".getBytes("UTF-8")),
                "UTF-8", "http://example.test/", Parser.xmlParser());
        assertEquals("value", doc.select("item").first().text());
    }

    @Test
    public void testLoadFile() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            FileOutputStream out = new FileOutputStream(file);
            try {
                out.write("<p>file</p>".getBytes("UTF-8"));
            } finally {
                out.close();
            }
            Document doc = DataUtil.load(file, "UTF-8", "http://example.test/");
            assertEquals("file", doc.body().text());
            assertEquals("http://example.test/", doc.location());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadFileWithEmptyContent() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            Document doc = DataUtil.load(file, "UTF-8", "http://example.test/");
            assertEquals("", doc.body().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadPreservesTextEntities() throws Exception {
        Document doc = DataUtil.load(
                new ByteArrayInputStream("<p>A &amp; B</p>".getBytes("UTF-8")),
                "UTF-8", "http://example.test/");
        assertEquals("A & B", doc.body().text());
    }

    @Test
    public void testLoadUsesProvidedBaseUri() throws Exception {
        Document doc = DataUtil.load(
                new ByteArrayInputStream("<a href='child'>link</a>".getBytes("UTF-8")),
                "UTF-8", "http://example.test/root/");
        assertEquals("http://example.test/root/child",
                doc.select("a").first().absUrl("href"));
    }

    @Test
    public void testLoadFileWithUtf8Bom() throws Exception {
        byte[] text = "<p>file</p>".getBytes("UTF-8");
        byte[] bytes = new byte[text.length + 3];
        bytes[0] = (byte) 0xef;
        bytes[1] = (byte) 0xbb;
        bytes[2] = (byte) 0xbf;
        System.arraycopy(text, 0, bytes, 3, text.length);
        File file = File.createTempFile("jsoup", ".html");
        try {
            FileOutputStream out = new FileOutputStream(file);
            try {
                out.write(bytes);
            } finally {
                out.close();
            }
            Document doc = DataUtil.load(file, "UTF-8", "http://example.test/");
            assertEquals("file", doc.body().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadUnicodeContent() throws Exception {
        String html = "<p>雪</p>";
        Document doc = DataUtil.load(new ByteArrayInputStream(html.getBytes("UTF-8")),
                "UTF-8", "http://example.test/");
        assertEquals("雪", doc.body().text());
    }
}
