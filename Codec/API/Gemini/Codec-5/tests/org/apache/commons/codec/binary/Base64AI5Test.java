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

public class Base64AI5Test {

    @Test
    public void testEncodeDecodeBasic() {
        byte[] input = StringUtils.getBytesUtf8("Hello, World!");
        byte[] encoded = Base64.encodeBase64(input);
        String encodedStr = StringUtils.newStringUtf8(encoded);
        Assert.assertEquals("SGVsbG8sIFdvcmxkIQ==", encodedStr);

        byte[] decoded = Base64.decodeBase64(encoded);
        Assert.assertArrayEquals(input, decoded);

        byte[] decodedFromStr = Base64.decodeBase64("SGVsbG8sIFdvcmxkIQ==");
        Assert.assertArrayEquals(input, decodedFromStr);
    }

    @Test
    public void testEncodeDecodeUrlSafe() {
        // Construct bytes that produce '+' and '/' in standard base64 (e.g. 0xFB, 0xEF, 0xBE) -> ++-- / ++/+
        byte[] binaryData = new byte[]{(byte) 0xFB, (byte) 0xEF, (byte) 0xBE, (byte) 0xFF};
        byte[] standardEncoded = Base64.encodeBase64(binaryData);
        byte[] urlSafeEncoded = Base64.encodeBase64URLSafe(binaryData);

        String standardStr = StringUtils.newStringUtf8(standardEncoded);
        String urlSafeStr = StringUtils.newStringUtf8(urlSafeEncoded);

        Assert.assertTrue(standardStr.contains("+") || standardStr.contains("/") || standardStr.contains("="));
        Assert.assertFalse(urlSafeStr.contains("+"));
        Assert.assertFalse(urlSafeStr.contains("/"));
        Assert.assertFalse(urlSafeStr.contains("="));

        // Decoder should decode both standard and URL-safe seamlessly
        Assert.assertArrayEquals(binaryData, Base64.decodeBase64(standardStr));
        Assert.assertArrayEquals(binaryData, Base64.decodeBase64(urlSafeStr));

        Base64 urlSafeCodec = new Base64(true);
        Assert.assertTrue(urlSafeCodec.isUrlSafe());
    }

    @Test
    public void testChunkedEncoding() {
        byte[] input = StringUtils.getBytesUtf8(
            "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog."
        );
        byte[] chunked = Base64.encodeBase64Chunked(input);
        String chunkedStr = StringUtils.newStringUtf8(chunked);

        Assert.assertTrue(chunkedStr.contains("\r\n"));
        Assert.assertArrayEquals(input, Base64.decodeBase64(chunked));

        // Custom line length and separator
        byte[] customSeparator = new byte[]{';'};
        Base64 customCodec = new Base64(8, customSeparator);
        byte[] encodedCustom = customCodec.encode(StringUtils.getBytesUtf8("12345678"));
        String customStr = StringUtils.newStringUtf8(encodedCustom);
        Assert.assertTrue(customStr.endsWith(";"));
        Assert.assertArrayEquals(StringUtils.getBytesUtf8("12345678"), customCodec.decode(encodedCustom));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidLineSeparator() {
        // 'A' is a valid base64 character, so it cannot be used as a separator
        byte[] invalidSeparator = new byte[]{'A'};
        new Base64(76, invalidSeparator);
    }

    @Test
    public void testIsBase64AndIsArrayByteBase64() {
        Assert.assertTrue(Base64.isBase64((byte) 'A'));
        Assert.assertTrue(Base64.isBase64((byte) 'z'));
        Assert.assertTrue(Base64.isBase64((byte) '0'));
        Assert.assertTrue(Base64.isBase64((byte) '+'));
        Assert.assertTrue(Base64.isBase64((byte) '/'));
        Assert.assertTrue(Base64.isBase64((byte) '='));
        Assert.assertFalse(Base64.isBase64((byte) '$'));
        Assert.assertFalse(Base64.isBase64((byte) -1));

        byte[] validArray = StringUtils.getBytesUtf8("SGVsbG8g \r\n\t V29ybGQ=");
        Assert.assertTrue(Base64.isArrayByteBase64(validArray));

        byte[] invalidArray = StringUtils.getBytesUtf8("SGVsbG8#V29ybGQ=");
        Assert.assertFalse(Base64.isArrayByteBase64(invalidArray));
    }

    @Test
    public void testEncodeDecodeObject() throws Exception {
        Base64 base64 = new Base64();
        byte[] original = StringUtils.getBytesUtf8("Object encode test");

        Object encoded = base64.encode((Object) original);
        Assert.assertTrue(encoded instanceof byte[]);

        Object decodedFromBytes = base64.decode(encoded);
        Assert.assertArrayEquals(original, (byte[]) decodedFromBytes);

        String base64Str = StringUtils.newStringUtf8((byte[]) encoded);
        Object decodedFromStr = base64.decode((Object) base64Str);
        Assert.assertArrayEquals(original, (byte[]) decodedFromStr);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeInvalidObjectThrowsException() throws Exception {
        Base64 base64 = new Base64();
        base64.encode(Integer.valueOf(123));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeInvalidObjectThrowsException() throws Exception {
        Base64 base64 = new Base64();
        base64.decode(Integer.valueOf(123));
    }

    @Test
    public void testBigIntegerEncodingAndDecoding() {
        BigInteger bigInt = new BigInteger("987654321098765432109876543210");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(bigInt, decoded);

        BigInteger zero = BigInteger.ZERO;
        byte[] encodedZero = Base64.encodeInteger(zero);
        BigInteger decodedZero = Base64.decodeInteger(encodedZero);
        Assert.assertEquals(zero, decodedZero);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNullThrowsException() {
        Base64.encodeInteger(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeWithMaxResultSizeExceeded() {
        byte[] input = new byte[100];
        // Request encoding with a maxResultSize smaller than required output size
        Base64.encodeBase64(input, false, false, 10);
    }

    @Test
    public void testNullAndEmptyInputs() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertNull(Base64.decodeBase64((byte[]) null));
        Assert.assertNull(Base64.decodeBase64((String) null));

        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(""));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] inputWithWhitespace = StringUtils.getBytesUtf8(" S G V s \r\n b G 8 = \t ");
        byte[] cleaned = Base64.discardWhitespace(inputWithWhitespace);
        Assert.assertEquals("SGVsbG8=", StringUtils.newStringUtf8(cleaned));
    }
}
