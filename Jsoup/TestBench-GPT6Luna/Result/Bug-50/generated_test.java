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

public class DataUtilTest {
    @Test
    public void testLoadUtf8Document() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<p>hello</p>".getBytes("UTF-8")), "UTF-8", "http://example.test/");
        assertEquals("hello", doc.select("p").first().text());
        assertEquals("http://example.test/", doc.location());
    }

    @Test
    public void testLoadEmptyInput() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream(" ".getBytes("UTF-8")), "UTF-8", "base");
        assertEquals("", doc.body().text());
        assertEquals("base", doc.location());
    }

    @Test
    public void testLoadDoesNotRequireCharsetWhenBomPresent() throws Exception {
        byte[] text = "<p>x</p>".getBytes("UTF-8");
        byte[] bytes = new byte[text.length + 3];
        bytes[0] = (byte) 0xEF;
        bytes[1] = (byte) 0xBB;
        bytes[2] = (byte) 0xBF;
        System.arraycopy(text, 0, bytes, 3, text.length);
        Document doc = DataUtil.load(new ByteArrayInputStream(bytes), null, "");
        assertEquals("x", doc.select("p").first().text());
    }

    @Test
    public void testLoadHonorsSpecifiedCharset() throws Exception {
        String html = "<p>café</p>";
        Document doc = DataUtil.load(new ByteArrayInputStream(html.getBytes("UTF-8")), "UTF-8", "");
        assertEquals("café", doc.select("p").first().text());
    }

    @Test
    public void testLoadUsesSpecifiedParser() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<root><item>x</item></root>".getBytes("UTF-8")),
                "UTF-8", "", Parser.xmlParser());
        assertEquals("x", doc.select("item").first().text());
    }

    @Test
    public void testLoadSpecifiedCharsetSetsDocumentOutputCharset() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<p>x</p>".getBytes("UTF-8")), "UTF-8", "");
        assertEquals(Charset.forName("UTF-8"), doc.outputSettings().charset());
    }

    @Test
    public void testLoadResolvesRelativeLinkAgainstBaseUri() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<a href='next'>x</a>".getBytes("UTF-8")),
                "UTF-8", "http://example.test/path/");
        assertEquals("next", doc.select("a").first().attr("href"));
        assertEquals("http://example.test/path/", doc.location());
    }

    @Test
    public void testLoadWithNullCharsetDetectsMetaCharset() throws Exception {
        String html = "<meta charset='UTF-8'><p>value</p>";
        Document doc = DataUtil.load(new ByteArrayInputStream(html.getBytes("UTF-8")), null, "");
        assertEquals("value", doc.select("p").first().text());
    }

    @Test
    public void testLoadWithoutCharsetOrMetaUsesUtf8() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<p>plain</p>".getBytes("UTF-8")), null, "");
        assertEquals("plain", doc.select("p").first().text());
    }

    @Test
    public void testLoadUtf16BomOverridesProvidedCharset() throws Exception {
        byte[] content = "<p>hi</p>".getBytes("UTF-16");
        Document doc = DataUtil.load(new ByteArrayInputStream(content), "UTF-8", "");
        assertEquals("hi", doc.select("p").first().text());
    }

    @Test
    public void testLoadUtf8BomDoesNotAppearInText() throws Exception {
        byte[] text = "<p>clean</p>".getBytes("UTF-8");
        byte[] bytes = new byte[text.length + 3];
        bytes[0] = (byte) 0xEF;
        bytes[1] = (byte) 0xBB;
        bytes[2] = (byte) 0xBF;
        System.arraycopy(text, 0, bytes, 3, text.length);
        Document doc = DataUtil.load(new ByteArrayInputStream(bytes), "UTF-8", "");
        assertEquals("clean", doc.select("p").first().text());
    }

    @Test
    public void testLoadDecodesMoreThanBufferSize() throws Exception {
        StringBuilder html = new StringBuilder("<p>");
        for (int i = 0; i < 140000; i++) html.append('a');
        html.append("</p>");
        Document doc = DataUtil.load(new ByteArrayInputStream(html.toString().getBytes("UTF-8")), "UTF-8", "");
        assertEquals(140000, doc.select("p").first().text().length());
    }

    @Test
    public void testLoadWithXmlParserPreservesRoot() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream("<root><child/></root>".getBytes("UTF-8")),
                "UTF-8", "", Parser.xmlParser());
        assertEquals(1, doc.select("root").size());
        assertEquals(1, doc.select("child").size());
    }

    @Test
    public void testLoadEmptyHtmlHasBody() throws Exception {
        Document doc = DataUtil.load(new ByteArrayInputStream(" ".getBytes("UTF-8")), null, "origin");
        assertEquals("origin", doc.location());
        assertEquals("", doc.body().text());
    }
}
