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

package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.junit.Assert;
import org.junit.Test;

public class SoundexUtilsAI1Test {

    @Test
    public void testCleanNullAndEmpty() {
        Assert.assertNull(SoundexUtils.clean(null));
        Assert.assertEquals("", SoundexUtils.clean(""));
    }

    @Test
    public void testCleanAllLetters() {
        Assert.assertEquals("HELLO", SoundexUtils.clean("hello"));
        Assert.assertEquals("WORLD", SoundexUtils.clean("WORLD"));
        Assert.assertEquals("APACHECOMMONS", SoundexUtils.clean("ApacheCommons"));
    }

    @Test
    public void testCleanMixedCharacters() {
        Assert.assertEquals("HELLO", SoundexUtils.clean("h e-l_l1o!"));
        Assert.assertEquals("TEST", SoundexUtils.clean("123T45e67s89t0"));
        Assert.assertEquals("ABC", SoundexUtils.clean(" A-B-C "));
    }

    @Test
    public void testCleanNonLetterOnly() {
        Assert.assertEquals("", SoundexUtils.clean("12345!@#$%^&*()_+-="));
        Assert.assertEquals("", SoundexUtils.clean("   "));
    }

    @Test
    public void testDifferenceEncodedNullInputs() {
        Assert.assertEquals(0, SoundexUtils.differenceEncoded(null, null));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded(null, "T400"));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("T400", null));
    }

    @Test
    public void testDifferenceEncodedExactMatch() {
        Assert.assertEquals(4, SoundexUtils.differenceEncoded("T400", "T400"));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("", ""));
    }

    @Test
    public void testDifferenceEncodedPartialMatchAndLengthMismatch() {
        Assert.assertEquals(1, SoundexUtils.differenceEncoded("A123", "A456"));
        Assert.assertEquals(3, SoundexUtils.differenceEncoded("A123", "B123"));
        Assert.assertEquals(0, SoundexUtils.differenceEncoded("ABCD", "WXYZ"));
        Assert.assertEquals(3, SoundexUtils.differenceEncoded("T46", "T4620"));
        Assert.assertEquals(3, SoundexUtils.differenceEncoded("T4620", "T46"));
        Assert.assertEquals(2, SoundexUtils.differenceEncoded("AB", "ABCDEF"));
    }

    @Test
    public void testDifferenceWithEncoder() throws EncoderException {
        StringEncoder encoder = new Soundex();
        // Smith -> S530, Smythe -> S530 (4 matching chars)
        Assert.assertEquals(4, SoundexUtils.difference(encoder, "Smith", "Smythe"));
        // Smith -> S530, Albert -> A416 (0 matching chars)
        Assert.assertEquals(0, SoundexUtils.difference(encoder, "Smith", "Albert"));
        // Smith -> S530, Snell -> S540 (matches at index 0 'S', 1 '5', 3 '0' -> 3)
        Assert.assertEquals(3, SoundexUtils.difference(encoder, "Smith", "Snell"));
    }

    @Test(expected = EncoderException.class)
    public void testDifferenceWithEncoderException() throws EncoderException {
        StringEncoder throwingEncoder = new StringEncoder() {
            @Override
            public Object encode(Object source) throws EncoderException {
                throw new EncoderException("Encoding failure");
            }

            @Override
            public String encode(String source) throws EncoderException {
                throw new EncoderException("Encoding failure");
            }
        };
        SoundexUtils.difference(throwingEncoder, "test1", "test2");
    }

    @Test
    public void testSoundexUtilsInstantiation() {
        SoundexUtils utils = new SoundexUtils();
        Assert.assertNotNull(utils);
    }
}
