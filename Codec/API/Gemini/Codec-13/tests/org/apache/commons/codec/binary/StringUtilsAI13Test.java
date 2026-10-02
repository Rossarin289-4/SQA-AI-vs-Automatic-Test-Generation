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

/**
 * Tests for {@link StringUtils}.
 */
public class StringUtilsAI13Test {

    @Test
    public void testConstructor() {
        Assert.assertNotNull(new StringUtils());
    }

    @Test
    public void testEquals() {
        Assert.assertTrue(StringUtils.equals(null, null));
        Assert.assertFalse(StringUtils.equals(null, "abc"));
        Assert.assertFalse(StringUtils.equals("abc", null));
        Assert.assertTrue(StringUtils.equals("abc", "abc"));
        Assert.assertFalse(StringUtils.equals("abc", "ABC"));
        Assert.assertFalse(StringUtils.equals("abc", "abcd"));
        Assert.assertFalse(StringUtils.equals("abcd", "abc"));

        final StringBuilder sb1 = new StringBuilder("test");
        final StringBuilder sb2 = new StringBuilder("test");
        Assert.assertTrue(StringUtils.equals(sb1, sb2));
        Assert.assertTrue(StringUtils.equals("test", sb1));
        Assert.assertTrue(StringUtils.equals(sb1, "test"));
    }

    @Test
    public void testIso8859_1() {
        final String input = "Hello World! \u00e9";
        final byte[] bytes = StringUtils.getBytesIso8859_1(input);
        Assert.assertNotNull(bytes);
        Assert.assertEquals(input, StringUtils.newStringIso8859_1(bytes));

        Assert.assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testUsAscii() {
        final String input = "US-ASCII String";
        final byte[] bytes = StringUtils.getBytesUsAscii(input);
        Assert.assertNotNull(bytes);
        Assert.assertEquals(input, StringUtils.newStringUsAscii(bytes));

        Assert.assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testUtf8() {
        final String input = "UTF-8 \u00e9\u20ac\u00a3";
        final byte[] bytes = StringUtils.getBytesUtf8(input);
        Assert.assertNotNull(bytes);
        Assert.assertEquals(input, StringUtils.newStringUtf8(bytes));

        Assert.assertNull(StringUtils.getBytesUtf8(null));
        Assert.assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testUtf16() {
        final String input = "UTF-16 \u00e9\u20ac\u00a3";
        final byte[] bytes = StringUtils.getBytesUtf16(input);
        Assert.assertNotNull(bytes);
        Assert.assertEquals(input, StringUtils.newStringUtf16(bytes));

        Assert.assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testUtf16BeAndLe() {
        final String input = "UTF-16 BE and LE \u00e9";
        final byte[] bytesBe = StringUtils.getBytesUtf16Be(input);
        final byte[] bytesLe = StringUtils.getBytesUtf16Le(input);

        Assert.assertNotNull(bytesBe);
        Assert.assertNotNull(bytesLe);
        Assert.assertEquals(input, StringUtils.newStringUtf16Be(bytesBe));
        Assert.assertEquals(input, StringUtils.newStringUtf16Le(bytesLe));

        Assert.assertNull(StringUtils.getBytesUtf16Be(null));
        Assert.assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUncheckedAndNewString() {
        final String input = "Commons Codec";
        final byte[] bytes = StringUtils.getBytesUnchecked(input, "UTF-8");
        Assert.assertNotNull(bytes);
        Assert.assertEquals(input, StringUtils.newString(bytes, "UTF-8"));

        Assert.assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
        Assert.assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUncheckedInvalidCharset() {
        StringUtils.getBytesUnchecked("test", "INVALID_CHARSET_NAME");
    }

    @Test(expected = IllegalStateException.class)
    public void testNewStringInvalidCharset() {
        StringUtils.newString(new byte[] { 0, 1, 2 }, "INVALID_CHARSET_NAME");
    }
}
