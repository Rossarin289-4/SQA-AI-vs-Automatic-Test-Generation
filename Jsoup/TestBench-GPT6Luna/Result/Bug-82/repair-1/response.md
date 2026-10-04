```java
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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), 0);
        assertEquals(0, result.remaining());
    }

    @Test
    public void testReadEmptyStreamWithLimit() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[0]), 1);
        assertEquals(0, result.remaining());
    }

    @Test
    public void testReadOneByteUnlimited() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {7}), 0);
        assertEquals(1, result.remaining());
        assertEquals(7, result.get() & 0xff);
    }

    @Test
    public void testReadSeveralBytesUnlimited() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {1, 2, 3}), 0);
        assertEquals(3, result.remaining());
        assertEquals(1, result.get() & 0xff);
        assertEquals(2, result.get() & 0xff);
        assertEquals(3, result.get() & 0xff);
    }

    @Test
    public void testReadAtLimit() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {4, 5, 6}), 3);
        assertEquals(3, result.remaining());
        assertEquals(4, result.get() & 0xff);
        assertEquals(5, result.get() & 0xff);
        assertEquals(6, result.get() & 0xff);
    }

    @Test
    public void testReadOneByteBeyondLimit() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {4, 5, 6}), 2);
        assertEquals(2, result.remaining());
        assertEquals(4, result.get() & 0xff);
        assertEquals(5, result.get() & 0xff);
    }

    @Test
    public void testReadLimitOne() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {8, 9}), 1);
        assertEquals(1, result.remaining());
        assertEquals(8, result.get() & 0xff);
    }

    @Test
    public void testReadSingleInputByteWithLargerLimit() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {10}), 5);
        assertEquals(1, result.remaining());
        assertEquals(10, result.get() & 0xff);
    }

    @Test
    public void testReadPreservesHighBitByte() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {(byte) 0xff}), 0);
        assertEquals(255, result.get() & 0xff);
        assertEquals(0, result.remaining());
    }

    @Test
    public void testRejectNegativeLimit() throws Exception {
        try {
            DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {1}), -1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testZeroLimitMeansUnlimited() throws Exception {
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(new byte[] {11, 12}), 0);
        assertEquals(2, result.remaining());
        assertEquals(11, result.get() & 0xff);
        assertEquals(12, result.get() & 0xff);
    }

    @Test
    public void testReadExactBufferBoundary() throws Exception {
        byte[] bytes = new byte[1024];
        bytes[0] = 13;
        bytes[1023] = 14;
        ByteBuffer result = DataUtil.readToByteBuffer(new ByteArrayInputStream(bytes), 1024);
        assertEquals(1024, result.remaining());
        assertEquals(13, result.get() & 0xff);
        result.position(1023);
        assertEquals(14, result.get() & 0xff);
    }
}
```