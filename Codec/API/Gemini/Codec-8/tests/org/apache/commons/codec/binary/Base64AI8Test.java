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

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import static org.junit.Assert.*;

public class Base64AI8Test {

    @Test
    public void testBasicEncodeDecode() throws UnsupportedEncodingException {
        byte[] input = "Hello World!".getBytes("UTF-8");
        byte[] encoded = Base64.encodeBase64(input);
        String encodedStr = Base64.encodeBase64String(input);
        assertEquals("SGVsbG8gV29ybGQh", new String(encoded, "UTF-8"));
        assertEquals("SGVsbG8gV29ybGQh", encodedStr);

        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(input, decoded);

        byte[] decodedFromStr = Base64.decodeBase64("SGVsbG8gV29ybGQh");
        assertArrayEquals(input, decodedFromStr);
    }

    @Test
    public void testModulusPaddingVariants() throws UnsupportedEncodingException {
        // 1 byte -> 4 base64 chars (2 pad chars)
        byte[] one = "a".getBytes("UTF-8");
        assertEquals("YQ==", Base64.encodeBase64String(one));
        assertArrayEquals(one, Base64.decodeBase64("YQ=="));
        // optional padding decoding
        assertArrayEquals(one, Base64.decodeBase64("YQ"));

        // 2 bytes -> 4 base64 chars (1 pad char)
        byte[] two = "ab".getBytes("UTF-8");
        assertEquals("YWI=", Base64.encodeBase64String(two));
        assertArrayEquals(two, Base64.decodeBase64("YWI="));
        assertArrayEquals(two, Base64.decodeBase64("YWI"));

        // 3 bytes -> 4 base64 chars (0 pad chars)
        byte[] three = "abc".getBytes("UTF-8");
        assertEquals("YWJj", Base64.encodeBase64String(three));
        assertArrayEquals(three, Base64.decodeBase64("YWJj"));
    }

    @Test
    public void testUrlSafeEncoding() {
        byte[] binaryData = new byte[]{(byte) 0xFB, (byte) 0xFF, (byte) 0xFE};
        byte[] standard = Base64.encodeBase64(binaryData);
        byte[] urlSafe = Base64.encodeBase64URLSafe(binaryData);
        String urlSafeString = Base64.encodeBase64URLSafeString(binaryData);

        String standardStr = StringUtils.newStringUtf8(standard);
        String urlSafeStr = StringUtils.newStringUtf8(urlSafe);

        assertTrue("Standard encoding should contain '+' or '/'", standardStr.contains("+") || standardStr.contains("/"));
        assertFalse("URL safe should not contain '+'", urlSafeStr.contains("+"));
        assertFalse("URL safe should not contain '/'", urlSafeStr.contains("/"));
        assertFalse("URL safe should omit padding '='", urlSafeStr.contains("="));
        assertEquals(urlSafeStr, urlSafeString);

        Base64 b64Url = new Base64(true);
        assertTrue(b64Url.isUrlSafe());
        Base64 b64Std = new Base64(false);
        assertFalse(b64Std.isUrlSafe());

        assertArrayEquals(binaryData, Base64.decodeBase64(urlSafe));
        assertArrayEquals(binaryData, Base64.decodeBase64(standard));
    }

    @Test
    public void testChunkedEncoding() throws UnsupportedEncodingException {
        byte[] input = "123456789012345678901234567890123456789012345678901234567890".getBytes("UTF-8"); // 60 bytes -> 80 chars
        byte[] chunked = Base64.encodeBase64Chunked(input);
        String chunkedStr = new String(chunked, "UTF-8");

        assertTrue("Chunked output should contain CRLF", chunkedStr.contains("\r\n"));
        assertTrue("Chunked output should end with CRLF", chunkedStr.endsWith("\r\n"));
        assertEquals(84, chunked.length);

        assertArrayEquals(input, Base64.decodeBase64(chunked));
    }

    @Test
    public void testIsBase64AndIsArrayByteBase64() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '-'));
        assertTrue(Base64.isBase64((byte) '_'));
        assertTrue(Base64.isBase64((byte) '='));

        assertFalse(Base64.isBase64((byte) '$'));
        assertFalse(Base64.isBase64((byte) -5));
        assertFalse(Base64.isBase64((byte) 127));

        assertTrue(Base64.isArrayByteBase64(new byte[]{'A', 'B', 'C', ' ', '\t', '\r', '\n'}));
        assertFalse(Base64.isArrayByteBase64(new byte[]{'A', 'B', '$'}));
        assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] input = StringUtils.getBytesUtf8(" S G\tV s\r\n b G 8 = ");
        byte[] groomed = Base64.discardWhitespace(input);
        assertEquals("SGVsbG8=", StringUtils.newStringUtf8(groomed));
    }

    @Test
    public void testObjectEncodeDecode() throws Exception {
        Base64 b64 = new Base64();
        byte[] input = "CodecTest".getBytes("UTF-8");

        Object encoded = b64.encode((Object) input);
        assertTrue(encoded instanceof byte[]);
        assertEquals("Q29kZWNUZXN0", StringUtils.newStringUtf8((byte[]) encoded));

        Object decodedFromBytes = b64.decode(encoded);
        assertTrue(decodedFromBytes instanceof byte[]);
        assertArrayEquals(input, (byte[]) decodedFromBytes);

        Object decodedFromString = b64.decode((Object) "Q29kZWNUZXN0");
        assertTrue(decodedFromString instanceof byte[]);
        assertArrayEquals(input, (byte[]) decodedFromString);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws Exception {
        Base64 b64 = new Base64();
        b64.encode("StringNotAllowedForEncodeObject");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws Exception {
        Base64 b64 = new Base64();
        b64.decode(Integer.valueOf(12345));
    }

    @Test
    public void testBigIntegerEncodeDecode() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        assertNotNull(encoded);
        assertTrue(encoded.length > 0);

        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(bigInt, decoded);

        byte[] toBytes = Base64.toIntegerBytes(BigInteger.ZERO);
        assertEquals(0, toBytes.length);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator() {
        new Base64(76, new byte[]{'A', 'B'});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64ExceedsMaxResultSize() {
        byte[] binaryData = new byte[100];
        Base64.encodeBase64(binaryData, false, false, 50);
    }

    @Test
    public void testNullAndEmptyInputs() {
        assertNull(Base64.encodeBase64(null));
        assertNull(Base64.decodeBase64((byte[]) null));
        assertNull(Base64.decodeBase64((String) null));

        assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        assertArrayEquals(new byte[0], Base64.decodeBase64(""));
    }
}
