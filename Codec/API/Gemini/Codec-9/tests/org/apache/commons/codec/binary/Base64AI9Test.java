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

/**
 * Unit tests for {@link Base64}.
 */
public class Base64AI9Test {

    @Test
    public void testEncodeDecodeStandard() {
        byte[] raw = StringUtils.getBytesUtf8("Hello World!");
        String encoded = Base64.encodeBase64String(raw);
        Assert.assertEquals("SGVsbG8gV29ybGQh", encoded);

        byte[] decoded = Base64.decodeBase64(encoded);
        Assert.assertArrayEquals(raw, decoded);
    }

    @Test
    public void testEncodeDecodeUrlSafe() {
        byte[] raw = new byte[]{(byte) 0xfb, (byte) 0xff};
        String standard = Base64.encodeBase64String(raw);
        Assert.assertEquals("+/8=", standard);

        String urlSafe = Base64.encodeBase64URLSafeString(raw);
        Assert.assertEquals("-_8", urlSafe);

        byte[] decodedFromStandard = Base64.decodeBase64(standard);
        byte[] decodedFromUrlSafe = Base64.decodeBase64(urlSafe);
        Assert.assertArrayEquals(raw, decodedFromStandard);
        Assert.assertArrayEquals(raw, decodedFromUrlSafe);

        Base64 b64UrlSafe = new Base64(true);
        Assert.assertTrue(b64UrlSafe.isUrlSafe());
        Base64 b64Standard = new Base64(false);
        Assert.assertFalse(b64Standard.isUrlSafe());
    }

    @Test
    public void testChunkedEncoding() {
        byte[] raw = StringUtils.getBytesUtf8("123456789012345678901234567890123456789012345678901234567890");
        byte[] chunked = Base64.encodeBase64Chunked(raw);
        String chunkedStr = StringUtils.newStringUtf8(chunked);

        Assert.assertTrue(chunkedStr.endsWith("\r\n"));
        byte[] decoded = Base64.decodeBase64(chunked);
        Assert.assertArrayEquals(raw, decoded);
    }

    @Test
    public void testDecodeWithWhitespaceAndPaddingVariations() {
        byte[] expected = StringUtils.getBytesUtf8("Hello World");
        
        // "Hello World" in base64 is "SGVsbG8gV29ybGQ="
        byte[] decodedWithPadding = Base64.decodeBase64("SGVsbG8gV29ybGQ=");
        Assert.assertArrayEquals(expected, decodedWithPadding);

        // Without padding
        byte[] decodedNoPadding = Base64.decodeBase64("SGVsbG8gV29ybGQ");
        Assert.assertArrayEquals(expected, decodedNoPadding);

        // With whitespaces
        byte[] decodedWithSpaces = Base64.decodeBase64(" SGVs bG8g\r\n V29y bGQ= \t");
        Assert.assertArrayEquals(expected, decodedWithSpaces);
    }

    @Test
    public void testIsBase64() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) '@'));
        Assert.assertFalse(Base64.isBase64((byte) -1));

        Assert.assertTrue(Base64.isBase64("SGVsbG8g V29ybGQ=\r\n"));
        Assert.assertFalse(Base64.isBase64("SGVsbG8g@V29ybGQ="));

        byte[] validArray = StringUtils.getBytesUtf8("SGVsbG8=");
        byte[] invalidArray = StringUtils.getBytesUtf8("SGVsbG8@");
        Assert.assertTrue(Base64.isBase64(validArray));
        Assert.assertTrue(Base64.isArrayByteBase64(validArray));
        Assert.assertFalse(Base64.isBase64(invalidArray));
    }

    @Test
    public void testObjectEncodeDecode() throws Exception {
        Base64 b64 = new Base64();
        byte[] raw = StringUtils.getBytesUtf8("Testing Object methods");

        Object encodedObj = b64.encode((Object) raw);
        Assert.assertTrue(encodedObj instanceof byte[]);
        byte[] encodedBytes = (byte[]) encodedObj;

        Object decodedFromBytes = b64.decode((Object) encodedBytes);
        Assert.assertArrayEquals(raw, (byte[]) decodedFromBytes);

        Object decodedFromString = b64.decode((Object) StringUtils.newStringUtf8(encodedBytes));
        Assert.assertArrayEquals(raw, (byte[]) decodedFromString);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws Exception {
        Base64 b64 = new Base64();
        b64.encode("String input should fail for encode(Object)");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws Exception {
        Base64 b64 = new Base64();
        b64.decode(Integer.valueOf(12345));
    }

    @Test
    public void testBigIntegerCodec() {
        BigInteger bigInt = new BigInteger("987654321098765432109876543210");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(bigInt, decoded);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidLineSeparator() {
        new Base64(76, new byte[]{'A', 'B'});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeMaxResultSizeExceeded() {
        byte[] raw = new byte[]{1, 2, 3, 4, 5, 6};
        Base64.encodeBase64(raw, false, false, 4);
    }

    @Test
    public void testNullAndEmptyInputs() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertNull(Base64.decodeBase64((String) null));

        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        Assert.assertEquals("", Base64.encodeBase64String(new byte[0]));
    }
}
