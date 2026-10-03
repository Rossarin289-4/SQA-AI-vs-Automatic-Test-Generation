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

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class Base64AI2Test {

    @Test
    public void testBasicEncodeDecode() {
        byte[] input1 = "f".getBytes();
        byte[] input2 = "fo".getBytes();
        byte[] input3 = "foo".getBytes();

        byte[] enc1 = Base64.encodeBase64(input1);
        byte[] enc2 = Base64.encodeBase64(input2);
        byte[] enc3 = Base64.encodeBase64(input3);

        Assert.assertArrayEquals("Zg==".getBytes(), enc1);
        Assert.assertArrayEquals("Zm8=".getBytes(), enc2);
        Assert.assertArrayEquals("Zm9v".getBytes(), enc3);

        Assert.assertArrayEquals(input1, Base64.decodeBase64(enc1));
        Assert.assertArrayEquals(input2, Base64.decodeBase64(enc2));
        Assert.assertArrayEquals(input3, Base64.decodeBase64(enc3));
    }

    @Test
    public void testNullAndEmptyInputs() {
        Assert.assertNull(Base64.encodeBase64(null));
        Assert.assertNull(Base64.decodeBase64(null));
        Assert.assertArrayEquals(new byte[0], Base64.encodeBase64(new byte[0]));
        Assert.assertArrayEquals(new byte[0], Base64.decodeBase64(new byte[0]));
    }

    @Test
    public void testUrlSafeEncodingDecoding() {
        // 0xFB, 0xFF, 0xBF encodes to "+/+/" in standard and "-_-_" in URL-safe
        byte[] binaryData = new byte[]{(byte) 0xFB, (byte) 0xFF, (byte) 0xBF};
        byte[] standardEncoded = Base64.encodeBase64(binaryData, false, false);
        byte[] urlSafeEncoded = Base64.encodeBase64URLSafe(binaryData);

        Assert.assertArrayEquals("+/+/".getBytes(), standardEncoded);
        Assert.assertArrayEquals("-_-_".getBytes(), urlSafeEncoded);

        Base64 b64UrlSafe = new Base64(true);
        Assert.assertTrue(b64UrlSafe.isUrlSafe());
        Assert.assertArrayEquals(binaryData, Base64.decodeBase64(urlSafeEncoded));
        Assert.assertArrayEquals(binaryData, Base64.decodeBase64(standardEncoded));
    }

    @Test
    public void testChunkedEncoding() {
        // 60 bytes raw produces 80 Base64 characters.
        // Chunk size is 76, so output has 76 chars + CRLF + 4 chars + CRLF = 84 bytes.
        byte[] raw = new byte[60];
        for (int i = 0; i < 60; i++) {
            raw[i] = (byte) ('a' + (i % 26));
        }
        byte[] chunked = Base64.encodeBase64Chunked(raw);
        Assert.assertEquals(84, chunked.length);
        Assert.assertEquals('\r', chunked[76]);
        Assert.assertEquals('\n', chunked[77]);
        Assert.assertEquals('\r', chunked[82]);
        Assert.assertEquals('\n', chunked[83]);

        // Decoding chunked data should restore the exact original bytes
        Assert.assertArrayEquals(raw, Base64.decodeBase64(chunked));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsBase64InSeparator() {
        byte[] invalidSeparator = new byte[]{'A', '\n'};
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
        Assert.assertFalse(Base64.isBase64((byte) -5));

        byte[] valid = "Zm9v\r\n\t ".getBytes();
        byte[] invalid = "Zm9v$".getBytes();
        Assert.assertTrue(Base64.isArrayByteBase64(valid));
        Assert.assertFalse(Base64.isArrayByteBase64(invalid));
        Assert.assertTrue(Base64.isArrayByteBase64(new byte[0]));
    }

    @Test
    public void testObjectEncodeDecode() throws Exception {
        Base64 base64 = new Base64();
        byte[] raw = "Test Message".getBytes();
        Object encodedObj = base64.encode((Object) raw);
        Assert.assertTrue(encodedObj instanceof byte[]);
        Object decodedObj = base64.decode(encodedObj);
        Assert.assertTrue(decodedObj instanceof byte[]);
        Assert.assertArrayEquals(raw, (byte[]) decodedObj);
    }

    @Test(expected = EncoderException.class)
    public void testObjectEncodeInvalidType() throws Exception {
        Base64 base64 = new Base64();
        base64.encode("StringNotByteArray");
    }

    @Test(expected = DecoderException.class)
    public void testObjectDecodeInvalidType() throws Exception {
        Base64 base64 = new Base64();
        base64.decode("StringNotByteArray");
    }

    @Test
    public void testBigIntegerEncodeDecode() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        byte[] encoded = Base64.encodeInteger(bigInt);
        BigInteger decoded = Base64.decodeInteger(encoded);
        Assert.assertEquals(bigInt, decoded);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNullThrowsNpe() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testDiscardWhitespaceAndDiscardNonBase64() {
        byte[] withWhitespace = " Z m\r\n 9 v \t".getBytes();
        byte[] groomedWhitespace = Base64.discardWhitespace(withWhitespace);
        Assert.assertArrayEquals("Zm9v".getBytes(), groomedWhitespace);

        byte[] withNonBase64 = "Z#m$9%v!".getBytes();
        byte[] groomedNonBase64 = Base64.discardNonBase64(withNonBase64);
        Assert.assertArrayEquals("Zm9v".getBytes(), groomedNonBase64);
    }
}
