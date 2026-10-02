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

public class BaseNCodecInputStreamAI12Test {

    @Test
    public void testEncodeReadByteByByte() throws IOException {
        byte[] input = new byte[]{(byte) 'H', (byte) 'e', (byte) 'l', (byte) 'l', (byte) 'o'};
        ByteArrayInputStream in = new ByteArrayInputStream(input);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), true);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int b;
        while ((b = stream.read()) != -1) {
            out.write(b);
        }
        stream.close();

        byte[] expected = Base64.encodeBase64(input, false);
        Assert.assertArrayEquals(expected, out.toByteArray());
    }

    @Test
    public void testDecodeReadByteByByteAndUnsignedByteConversion() throws IOException {
        // Base64 for byte 0xFE (254) is "/g=="
        byte[] encoded = new byte[]{(byte) '/', (byte) 'g', (byte) '=', (byte) '='};
        ByteArrayInputStream in = new ByteArrayInputStream(encoded);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);

        int firstByte = stream.read();
        Assert.assertEquals(254, firstByte);

        int eof = stream.read();
        Assert.assertEquals(-1, eof);
        stream.close();
    }

    @Test
    public void testEncodeReadBuffer() throws IOException {
        byte[] input = new byte[]{(byte) 'F', (byte) 'o', (byte) 'o', (byte) 'B', (byte) 'a', (byte) 'r'};
        ByteArrayInputStream in = new ByteArrayInputStream(input);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), true);

        byte[] buffer = new byte[10];
        int readCount = stream.read(buffer, 1, 8);
        Assert.assertEquals(8, readCount);

        byte[] expected = Base64.encodeBase64(input, false);
        byte[] actual = new byte[8];
        System.arraycopy(buffer, 1, actual, 0, 8);
        Assert.assertArrayEquals(expected, actual);

        int eof = stream.read(buffer, 0, buffer.length);
        Assert.assertEquals(-1, eof);
        stream.close();
    }

    @Test
    public void testDecodeReadBuffer() throws IOException {
        byte[] input = new byte[]{(byte) 'R', (byte) 'm', (byte) '9', (byte) 'v', (byte) 'Q', (byte) 'm', (byte) 'F', (byte) 'y'};
        ByteArrayInputStream in = new ByteArrayInputStream(input);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);

        byte[] buffer = new byte[6];
        int readCount = stream.read(buffer, 0, buffer.length);
        Assert.assertEquals(6, readCount);

        byte[] expected = new byte[]{(byte) 'F', (byte) 'o', (byte) 'o', (byte) 'B', (byte) 'a', (byte) 'r'};
        Assert.assertArrayEquals(expected, buffer);

        int eof = stream.read(buffer, 0, buffer.length);
        Assert.assertEquals(-1, eof);
        stream.close();
    }

    @Test(expected = NullPointerException.class)
    public void testReadNullBufferThrowsNPE() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        try {
            stream.read(null, 0, 1);
        } finally {
            stream.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeOffsetThrowsIOOBE() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        try {
            stream.read(new byte[10], -1, 1);
        } finally {
            stream.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadNegativeLengthThrowsIOOBE() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        try {
            stream.read(new byte[10], 0, -1);
        } finally {
            stream.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadOffsetPlusLenExceedsLengthThrowsIOOBE() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        try {
            stream.read(new byte[10], 6, 5);
        } finally {
            stream.close();
        }
    }

    @Test
    public void testReadZeroLengthReturnsZero() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        int read = stream.read(new byte[10], 0, 0);
        Assert.assertEquals(0, read);
        stream.close();
    }

    @Test
    public void testMarkSupportedIsFalse() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        Assert.assertFalse(stream.markSupported());
        stream.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeThrowsIAE() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(), false);
        try {
            stream.skip(-1);
        } finally {
            stream.close();
        }
    }

    @Test
    public void testSkipAndAvailable() throws IOException {
        byte[] input = new byte[]{(byte) 'A', (byte) 'B', (byte) 'C', (byte) 'D'};
        ByteArrayInputStream in = new ByteArrayInputStream(input);
        BaseNCodecInputStream stream = new BaseNCodecInputStream(in, new Base64(0), true);

        Assert.assertEquals(1, stream.available());

        long skippedZero = stream.skip(0);
        Assert.assertEquals(0L, skippedZero);

        // Encoding 'ABCD' -> 'QUJDRA==' (8 bytes total)
        long skipped = stream.skip(4);
        Assert.assertEquals(4L, skipped);

        byte[] remaining = new byte[4];
        int count = stream.read(remaining, 0, remaining.length);
        Assert.assertEquals(4, count);
        Assert.assertArrayEquals(new byte[]{(byte) 'R', (byte) 'A', (byte) '=', (byte) '='}, remaining);

        int eof = stream.read();
        Assert.assertEquals(-1, eof);
        Assert.assertEquals(0, stream.available());

        long skippedAtEof = stream.skip(10);
        Assert.assertEquals(0L, skippedAtEof);
        stream.close();
    }
}
