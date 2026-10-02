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

package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Test;

public class QuotedPrintableCodecAI11Test {

    @Test
    public void testBasicEncodeDecode() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String plain = "Hello World!";
        String encoded = codec.encode(plain);
        Assert.assertEquals("Hello World!", encoded);
        Assert.assertEquals(plain, codec.decode(encoded));
    }

    @Test
    public void testSpecialCharsEncodeDecode() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String plain = "1 + 1 = 2 & 2 + 2 = 4";
        String encoded = codec.encode(plain);
        Assert.assertEquals("1 + 1 =3D 2 & 2 + 2 =3D 4", encoded);
        Assert.assertEquals(plain, codec.decode(encoded));
    }

    @Test
    public void testCustomCharset() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(CharEncoding.UTF_16BE);
        Assert.assertEquals(CharEncoding.UTF_16BE, codec.getDefaultCharset());

        String plain = "ABC";
        String encoded = codec.encode(plain);
        // In UTF-16BE: 'A' -> 0x00 0x41, 'B' -> 0x00 0x42, 'C' -> 0x00 0x43
        Assert.assertEquals("=00A=00B=00C", encoded);
        Assert.assertEquals(plain, codec.decode(encoded));
    }

    @Test
    public void testNullInputs() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Assert.assertNull(codec.encode((String) null));
        Assert.assertNull(codec.decode((String) null));
        Assert.assertNull(codec.encode((byte[]) null));
        Assert.assertNull(codec.decode((byte[]) null));
        Assert.assertNull(codec.encode((Object) null));
        Assert.assertNull(codec.decode((Object) null));
        Assert.assertNull(QuotedPrintableCodec.encodeQuotedPrintable(null, null));
        Assert.assertNull(QuotedPrintableCodec.decodeQuotedPrintable(null));
    }

    @Test
    public void testObjectEncodeDecode() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String plain = "Test Object Encoding=";
        Object encodedStr = codec.encode((Object) plain);
        Assert.assertTrue(encodedStr instanceof String);
        Assert.assertEquals("Test Object Encoding=3D", encodedStr);
        Assert.assertEquals(plain, codec.decode(encodedStr));

        byte[] plainBytes = plain.getBytes(CharEncoding.UTF_8);
        Object encodedBytes = codec.encode((Object) plainBytes);
        Assert.assertTrue(encodedBytes instanceof byte[]);
        Assert.assertArrayEquals(codec.encode(plainBytes), (byte[]) encodedBytes);

        Object decodedBytes = codec.decode(encodedBytes);
        Assert.assertTrue(decodedBytes instanceof byte[]);
        Assert.assertArrayEquals(plainBytes, (byte[]) decodedBytes);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeInvalidObjectType() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.encode(Double.valueOf(3.14));
    }

    @Test(expected = DecoderException.class)
    public void testDecodeInvalidObjectType() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        codec.decode(Integer.valueOf(42));
    }

    @Test
    public void testSoftLineBreakDecoding() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String softBreakEncoded = "Soft line=\r\n break test";
        String decoded = codec.decode(softBreakEncoded);
        Assert.assertEquals("Soft line break test", decoded);
    }

    @Test(expected = DecoderException.class)
    public void testDecodeInvalidTruncatedSequence() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        // '=' followed by only one character
        codec.decode("Invalid=A");
    }

    @Test(expected = DecoderException.class)
    public void testDecodeInvalidHexDigit() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        // 'Z' is not a valid hex character
        codec.decode("Invalid=AZ");
    }

    @Test(expected = DecoderException.class)
    public void testDecodeInvalidDefaultCharset() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("INVALID-CHARSET-NAME");
        codec.decode("abc");
    }

    @Test
    public void testEncodeWithCustomBitSetAndTrailingWhitespace() throws Exception {
        BitSet bitSet = new BitSet();
        bitSet.set('a');
        byte[] input = new byte[] { 'a', 'b', ' ' };
        // 'a' is printable; 'b' is not in bitSet -> =62; trailing space -> =20
        byte[] encoded = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, input);
        Assert.assertEquals("a=62=20", new String(encoded, CharEncoding.US_ASCII));
    }
}
