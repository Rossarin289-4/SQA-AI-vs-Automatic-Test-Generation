package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataUtilTest {
    @Test
    public void testReadEmptyStreamUnlimited() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[0]), 0);
        assertEquals(0, result.remaining());
    }

    @Test
    public void testReadOneByteUnlimited() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {7}), 0);
        assertEquals(1, result.remaining());
        assertEquals(7, result.get() & 255);
    }

    @Test
    public void testReadSeveralBytesUnlimited() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {1, 2, 3}), 0);
        assertEquals(3, result.remaining());
        assertEquals(1, result.get() & 255);
        assertEquals(2, result.get() & 255);
        assertEquals(3, result.get() & 255);
    }

    @Test
    public void testReadAtMaximumSize() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {4, 5, 6}), 3);
        assertEquals(3, result.remaining());
        assertEquals(4, result.get() & 255);
        assertEquals(5, result.get() & 255);
        assertEquals(6, result.get() & 255);
    }

    @Test
    public void testReadOnePastMaximumSize() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {4, 5, 6}), 2);
        assertEquals(2, result.remaining());
        assertEquals(4, result.get() & 255);
        assertEquals(5, result.get() & 255);
    }

    @Test
    public void testMaximumSizeZeroIsUnlimited() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {8, 9}), 0);
        assertEquals(2, result.remaining());
    }

    @Test
    public void testMaximumSizeOne() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {8, 9}), 1);
        assertEquals(1, result.remaining());
        assertEquals(8, result.get() & 255);
    }

    @Test
    public void testMaximumSizeGreaterThanInput() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {3, 2}), 4);
        assertEquals(2, result.remaining());
    }

    @Test
    public void testNegativeMaximumSizeThrows() throws Exception {
        try {
            DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {1}), -1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaximumSizeIntegerBoundary() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(new byte[] {1}), Integer.MAX_VALUE);
        assertEquals(1, result.remaining());
    }

    @Test
    public void testReadDoesNotAlterSourceBytes() throws Exception {
        byte[] bytes = new byte[] {11, 12};
        DataUtil.readToByteBuffer(new java.io.ByteArrayInputStream(bytes), 0);
        assertEquals(11, bytes[0]);
        assertEquals(12, bytes[1]);
    }

    @Test
    public void testLoadFileWithExplicitCharset() throws Exception {
        File file = File.createTempFile("dtu", ".html");
        try {
            java.io.FileOutputStream out = new java.io.FileOutputStream(file);
            out.write("<p>ok</p>".getBytes("UTF-8"));
            out.close();
            Document doc = DataUtil.load(file, "UTF-8", "http://example.com/");
            assertEquals("ok", doc.select("p").text());
            assertEquals("http://example.com/", doc.location());
        } finally {
            file.delete();
        }
    }

    @Test
    public void testLoadFilePreservesDocumentText() throws Exception {
        File file = File.createTempFile("dtu", ".html");
        try {
            java.io.FileOutputStream out = new java.io.FileOutputStream(file);
            out.write("<title>T</title><p>x</p>".getBytes("UTF-8"));
            out.close();
            Document doc = DataUtil.load(file, "UTF-8", "");
            assertEquals("T", doc.title());
            assertEquals("x", doc.select("p").text());
        } finally {
            file.delete();
        }
    }
}
