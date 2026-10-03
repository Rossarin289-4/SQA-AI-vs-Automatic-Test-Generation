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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link Base64InputStream}.
 */
public class Base64InputStreamAI8Test {

    private static final String HELLO_WORLD = "Hello World";
    private static final String HELLO_WORLD_BASE64 = "SGVsbG8gV29ybGQ=";

    @Test
    public void testMarkSupportedIsFalse() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BASE64.getBytes("UTF-8"));
        Base64InputStream in = new Base64InputStream(bais);
        try {
            Assert.assertFalse(in.markSupported());
        } finally {
            in.close();
        }
    }

    @Test
    public void testDecodeDefaultConstructor() throws Exception {
        byte[] encodedData = HELLO_WORLD_BASE64.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(encodedData);
        Base64InputStream in = new Base64InputStream(bais);
        try {
            byte[] result = readAllBytes(in);
            Assert.assertArrayEquals(HELLO_WORLD.getBytes("UTF-8"), result);
        } finally {
            in.close();
        }
    }

    @Test
    public void testEncodeSingleByteRead() throws Exception {
        byte[] rawData = HELLO_WORLD.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(rawData);
        Base64InputStream in = new Base64InputStream(bais, true);
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b;
            while ((b = in.read()) != -1) {
                baos.write(b);
            }
            String expected = HELLO_WORLD_BASE64 + "\r\n";
            Assert.assertEquals(expected, new String(baos.toByteArray(), "UTF-8"));
        } finally {
            in.close();
        }
    }

    @Test
    public void testEncodeNoChunking() throws Exception {
        byte[] rawData = HELLO_WORLD.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(rawData);
        Base64InputStream in = new Base64InputStream(bais, true, 0, null);
        try {
            byte[] encoded = readAllBytes(in);
            Assert.assertEquals(HELLO_WORLD_BASE64, new String(encoded, "UTF-8"));
        } finally {
            in.close();
        }
    }

    @Test
    public void testDecodeSingleByteRead() throws Exception {
        byte[] encodedData = HELLO_WORLD_BASE64.getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(encodedData);
        Base64InputStream in = new Base64InputStream(bais, false);
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b;
            while ((b = in.read()) != -1) {
                baos.write(b);
            }
            Assert.assertArrayEquals(HELLO_WORLD.getBytes("UTF-8"), baos.toByteArray());
        } finally {
            in.close();
        }
    }

    @Test
    public void testEncodeWithCustomChunking() throws Exception {
        byte[] rawData = "12345678901234567890".getBytes("UTF-8");
        byte[] lineSeparator = new byte[] { '\n' };
        ByteArrayInputStream bais = new ByteArrayInputStream(rawData);
        Base64InputStream in = new Base64InputStream(bais, true, 8, lineSeparator);
        try {
            byte[] encoded = readAllBytes(in);
            String expected = "MTIzNDU2\nNzg5MDEy\nMzQ1Njc4\nOTA=\n";
            Assert.assertEquals(expected, new String(encoded, "UTF-8"));
        } finally {
            in.close();
        }
    }

    @Test
    public void testDecodeWithIgnoredWhitespace() throws Exception {
        String base64WithSpaces = " SGVs  bG8g\r\n  V29y   bGQ= \n";
        ByteArrayInputStream bais = new ByteArrayInputStream(base64WithSpaces.getBytes("UTF-8"));
        Base64InputStream in = new Base64InputStream(bais);
        try {
            byte[] result = readAllBytes(in);
            Assert.assertArrayEquals(HELLO_WORLD.getBytes("UTF-8"), result);
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadZeroLength() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BASE64.getBytes("UTF-8"));
        Base64InputStream in = new Base64InputStream(bais);
        try {
            byte[] buffer = new byte[10];
            int read = in.read(buffer, 0, 0);
            Assert.assertEquals(0, read);
        } finally {
            in.close();
        }
    }

    @Test
    public void testReadEmptyStream() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream inDecode = new Base64InputStream(bais, false);
        try {
            Assert.assertEquals(-1, inDecode.read());
            Assert.assertEquals(-1, inDecode.read(new byte[10], 0, 10));
        } finally {
            inDecode.close();
        }

        ByteArrayInputStream baisEncode = new ByteArrayInputStream(new byte[0]);
        Base64InputStream inEncode = new Base64InputStream(baisEncode, true);
        try {
            Assert.assertEquals(-1, inEncode.read());
            Assert.assertEquals(-1, inEncode.read(new byte[10], 0, 10));
        } finally {
            inEncode.close();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testReadNullBuffer() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BASE64.getBytes("UTF-8"));
        Base64InputStream in = new Base64InputStream(bais);
        try {
            in.read(null, 0, 1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeOffset() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BASE64.getBytes("UTF-8"));
        Base64InputStream in = new Base64InputStream(bais);
        try {
            byte[] buffer = new byte[10];
            in.read(buffer, -1, 1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeLength() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BASE64.getBytes("UTF-8"));
        Base64InputStream in = new Base64InputStream(bais);
        try {
            byte[] buffer = new byte[10];
            in.read(buffer, 0, -1);
        } finally {
            in.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetPlusLenOutOfBounds() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(HELLO_WORLD_BASE64.getBytes("UTF-8"));
        Base64InputStream in = new Base64InputStream(bais);
        try {
            byte[] buffer = new byte[10];
            in.read(buffer, 5, 6);
        } finally {
            in.close();
        }
    }

    private byte[] readAllBytes(InputStream in) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[8];
        int count;
        while ((count = in.read(buffer, 0, buffer.length)) != -1) {
            baos.write(buffer, 0, count);
        }
        return baos.toByteArray();
    }
}
