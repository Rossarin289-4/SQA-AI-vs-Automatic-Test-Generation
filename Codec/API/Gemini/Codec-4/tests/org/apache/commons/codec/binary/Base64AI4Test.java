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

import java.math.BigInteger;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class Base64AI4Test {

    @Test
    public void testEncodeDecodeNullAndEmpty() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertNull(Base64.decodeBase64((String) null));

        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(""));
    }

    @Test
    public void testStandardEncodingDecoding() {
        Base64 b64 = new Base64();

        byte[] b9 = StringUtils.getBytesUtf8("light wor");
        byte[] b10 = StringUtils.getBytesUtf8("light work");
        byte[] b11 = StringUtils.getBytesUtf8("light work.");

        Assert.assertEquals("bGlnaHQgd29y", b64.encodeToString(b9));
        Assert.assertEquals("bGlnaHQgd29yaw==", b64.encodeToString(b10));
        Assert.assertEquals("bGlnaHQgd29yay4=", b64.encodeToString(b11));

        Assert.assertEquals("light wor", StringUtils.newStringUtf8(Base64.decodeBase64("bGlnaHQgd29y")));
        Assert.assertEquals("light work", StringUtils.newStringUtf8(Base64.decodeBase64("bGlnaHQgd29yaw==")));
        Assert.assertEquals("light work.", StringUtils.newStringUtf8(Base64.decodeBase64("bGlnaHQgd29yay4=")));

        // Decoder should handle base64 without padding characters
        Assert.assertEquals("light work", StringUtils.newStringUtf8(Base64.decodeBase64("bGlnaHQgd29yaw")));
        Assert.assertEquals("light work.", StringUtils.newStringUtf8(Base64.decodeBase64("bGlnaHQgd29yay4")));
    }

    @Test
    public void testUrlSafe() {
        byte[] data = new byte[]{(byte) 0xfb, (byte) 0xff, (byte) 0xbf};
        byte[] std = Base64.encodeBase64(data);
        byte[] url = Base64.encodeBase64URLSafe(data);

        Assert.assertEquals("+/+/", StringUtils.newStringUtf8(std));
        Assert.assertEquals("-_-_", StringUtils.newStringUtf8(url));

        Assert.assertArrayEquals(data, Base64.decodeBase64(std));
        Assert.assertArrayEquals(data, Base64.decodeBase64(url));

        byte[] twoBytes = new byte[]{(byte) 0xfb, (byte) 0xff};
        String urlTwo = Base64.encodeBase64URLSafeString(twoBytes);
        Assert.assertFalse(urlTwo.contains("="));
        Assert.assertArrayEquals(twoBytes, Base64.decodeBase64(urlTwo));
    }

    @Test
    public void testChunkedEncoding() {
        byte[] data = new byte[76];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) ('A' + (i % 26));
        }

        byte[] chunked = Base64.encodeBase64Chunked(data);
        String chunkedStr = StringUtils.newStringUtf8(chunked);
        Assert.assertTrue(chunkedStr.contains("\r\n"));
        Assert.assertTrue(chunkedStr.endsWith("\r\n"));

        byte[] decoded = Base64.decodeBase64(chunked);
        Assert.assertArrayEquals(data, decoded);
    }

    @Test
    public void testIsBase64() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) '$'));
        Assert.assertFalse(Base64.isBase64((byte) -1));

        byte[] validWithWhitespace = StringUtils.getBytesUtf8("A B\r\nC\tD==");
        Assert.assertTrue(Base64.isArrayByteBase64(validWithWhitespace));

        byte[] invalid = StringUtils.getBytesUtf8("AB#D");
        Assert.assertFalse(Base64.isArrayByteBase64(invalid));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidSeparator() {
        new Base64(76, new byte[]{'A'});
    }

    @Test
    public void testObjectEncodeDecode() throws Exception {
        Base64 b64 = new Base64();
        byte[] input = StringUtils.getBytesUtf8("Hello World");
        Object encoded = b64.encode((Object) input);
        Assert.assertTrue(encoded instanceof byte[]);
        Object decoded = b64.decode(encoded);
        Assert.assertTrue(decoded instanceof byte[]);
        Assert.assertArrayEquals(input, (byte[]) decoded);

        Object decodedFromString = b64.decode((Object) "SGVsbG8gV29ybGQ=");
        Assert.assertArrayEquals(input, (byte[]) decodedFromString);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws Exception {
        Base64 b64 = new Base64();
        b64.encode("Strings are not accepted by encode(Object)");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws Exception {
        Base64 b64 = new Base64();
        b64.decode(Integer.valueOf(12345));
    }

    @Test
    public void testBigInteger() {
        BigInteger bigInt = new BigInteger("12345678901234567890987654321");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(bigInt, decoded);

        BigInteger zero = BigInteger.ZERO;
        byte[] zeroEncoded = Base64.encodeInteger(zero);
        BigInteger zeroDecoded = Base64.decodeInteger(zeroEncoded);
        Assert.assertEquals(zero, zeroDecoded);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64MaxSizeLimit() {
        byte[] data = new byte[100];
        Base64.encodeBase64(data, false, false, 10);
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] withWs = StringUtils.getBytesUtf8(" a\t b \r\n c ");
        byte[] groomed = Base64.discardWhitespace(withWs);
        Assert.assertEquals("abc", StringUtils.newStringUtf8(groomed));
    }
}
