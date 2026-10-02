/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.codec.binary;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Base64InputStreamAI6Test {

    private static final String ENCODING = "UTF-8";

    private byte[] getBytes(String str) {
        try {
            return str.getBytes(ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private String getString(byte[] bytes) {
        try {
            return new String(bytes, ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testMarkSupportedIsFalse() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream b64In = new Base64InputStream(in);
        Assert.assertFalse(b64In.markSupported());
    }

    @Test
    public void testDecodeDefaultConstructor() throws IOException {
        byte[] encoded = getBytes("SGVsbG8gV29ybGQh");
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8];
        int n;
        while ((n = in.read(buf)) != -1) {
            out.write(buf, 0, n);
        }
        in.close();
        Assert.assertEquals("Hello World!", getString(out.toByteArray()));
    }

    @Test
    public void testEncodeBooleanConstructor() throws IOException {
        byte[] raw = getBytes("Hello World!");
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(raw), true);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8];
        int n;
        while ((n = in.read(buf)) != -1) {
            out.write(buf, 0, n);
        }
        in.close();
        Assert.assertEquals("SGVsbG8gV29ybGQh", getString(out.toByteArray()));
    }

    @Test
    public void testEncodeCustomChunking() throws IOException {
        byte[] raw = getBytes("12345678901234567890");
        byte[] separator = new byte[]{'\n'};
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(raw), true, 4, separator);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        in.close();
        String expected = "MTIz\nNDU2\nNzg5\nMDEy\nMzQ1\nNjc4\nOTA=\n";
        Assert.assertEquals(expected, getString(out.toByteArray()));
    }

    @Test
    public void testEncodeNoChunkingWhenLineLengthZeroOrLess() throws IOException {
        byte[] raw = getBytes("Hello World!");
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(raw), true, 0, null);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        in.close();
        Assert.assertEquals("SGVsbG8gV29ybGQh", getString(out.toByteArray()));
    }

    @Test
    public void testSingleByteRead() throws IOException {
        byte[] encoded = getBytes("AQID"); // bytes 1, 2, 3
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        Assert.assertEquals(1, in.read());
        Assert.assertEquals(2, in.read());
        Assert.assertEquals(3, in.read());
        Assert.assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void testReadZeroLength() throws IOException {
        byte[] encoded = getBytes("SGVsbG8=");
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] buf = new byte[10];
        int read = in.read(buf, 0, 0);
        Assert.assertEquals(0, read);
        in.close();
    }

    @Test(expected = NullPointerException.class)
    public void testReadNullBuffer() throws IOException {
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.read(null, 0, 1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeOffset() throws IOException {
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.read(new byte[10], -1, 1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeLength() throws IOException {
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.read(new byte[10], 0, -1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadBufferOverflow() throws IOException {
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        try {
            in.read(new byte[10], 5, 6);
        } finally {
            in.close();
        }
    }

    @Test
    public void testDecodeWithWhitespaceAndIgnoredChars() throws IOException {
        // Base64 decoding should ignore spaces, newlines, and other non-base64 characters
        String inputWithSpaces = " SG V  sb\r\n\tG8g V29   ybGQh ";
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(getBytes(inputWithSpaces)));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[4];
        int n;
        while ((n = in.read(buf, 0, buf.length)) != -1) {
            out.write(buf, 0, n);
        }
        in.close();
        Assert.assertEquals("Hello World!", getString(out.toByteArray()));
    }

    @Test
    public void testReadWithOffsetAndLengthInTargetBuffer() throws IOException {
        byte[] encoded = getBytes("QUJD"); // "ABC"
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] buf = new byte[10];
        Arrays.fill(buf, (byte) 0);
        int read = in.read(buf, 2, 3);
        Assert.assertEquals(3, read);
        Assert.assertEquals(0, buf[0]);
        Assert.assertEquals(0, buf[1]);
        Assert.assertEquals('A', buf[2]);
        Assert.assertEquals('B', buf[3]);
        Assert.assertEquals('C', buf[4]);
        Assert.assertEquals(0, buf[5]);
        in.close();
    }
}
