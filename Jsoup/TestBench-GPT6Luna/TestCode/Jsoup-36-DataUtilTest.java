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
    public void testLoadUtf8HtmlFromFile() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<p>hello</p>");
            Document doc = DataUtil.load(file, "UTF-8", "http://example.test/");
            assertEquals("hello", doc.select("p").first().text());
            assertEquals("http://example.test/", doc.baseUri());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadUsesExplicitCharset() throws Exception {
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
    public void testLoadDetectsMetaCharset() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<meta charset=ISO-8859-1><p>caf\u00e9</p>", "ISO-8859-1");
            Document doc = DataUtil.load(file, null, "");
            assertEquals("caf\u00e9", doc.select("p").first().text());
            assertEquals("ISO-8859-1", doc.outputSettings().charset().name());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadWithoutCharsetUsesUtf8() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<p>caf\u00e9</p>", "UTF-8");
            Document doc = DataUtil.load(file, null, "");
            assertEquals("caf\u00e9", doc.select("p").first().text());
            assertEquals("UTF-8", doc.outputSettings().charset().name());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadEmptyFile() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("", doc.body().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadRemovesUtf8Bom() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            FileOutputStream out = new FileOutputStream(file);
            try {
                out.write(new byte[] {(byte) 0xef, (byte) 0xbb, (byte) 0xbf});
                out.write("<p>hello</p>".getBytes("UTF-8"));
            } finally {
                out.close();
            }
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("hello", doc.select("p").first().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadPreservesBaseUri() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<a href='child'>x</a>");
            Document doc = DataUtil.load(file, "UTF-8", "http://example.test/root/");
            assertEquals("http://example.test/root/", doc.baseUri());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadAcceptsEmptyBaseUri() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "<p>x</p>");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("", doc.baseUri());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadSingleCharacterDocument() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            write(file, "x");
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("x", doc.body().text());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadContentAtLargeInputBufferBoundary() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            StringBuilder html = new StringBuilder("<p>");
            for (int i = 0; i < 131072; i++) html.append('x');
            html.append("</p>");
            write(file, html.toString());
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals(131072, doc.select("p").first().text().length());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadContentJustOverLargeInputBufferBoundary() throws Exception {
        File file = File.createTempFile("jsoup", ".html");
        try {
            StringBuilder html = new StringBuilder("<p>");
            for (int i = 0; i < 131073; i++) html.append('x');
            html.append("</p>");
            write(file, html.toString());
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals(131073, doc.select("p").first().text().length());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadMissingFileThrowsIOException() throws Exception {
        File file = new File("missing-jsoup-data-file.html");
        try {
            DataUtil.load(file, "UTF-8", "");
            fail("expected IOException");
        } catch (IOException expected) {
            assertTrue(true);
        }
    }

    private static void write(File file, String value) throws Exception {
        write(file, value, "UTF-8");
    }

    private static void write(File file, String value, String charset) throws Exception {
        FileOutputStream out = new FileOutputStream(file);
        try {
            out.write(value.getBytes(charset));
        } finally {
            out.close();
        }
    }
}
