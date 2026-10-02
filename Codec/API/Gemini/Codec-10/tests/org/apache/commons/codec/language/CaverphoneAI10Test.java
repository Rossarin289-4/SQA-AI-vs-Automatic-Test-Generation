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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaverphoneAI10Test {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        caverphone = new Caverphone();
    }

    @Test
    public void testCaverphoneNullAndEmpty() {
        Assert.assertEquals("1111111111", caverphone.caverphone(null));
        Assert.assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphoneNonAlphaCharacters() {
        Assert.assertEquals("1111111111", caverphone.caverphone("1234567890"));
        Assert.assertEquals("1111111111", caverphone.caverphone("!@#$%^&*()"));
    }

    @Test
    public void testEncodeString() {
        String result = caverphone.encode("Peter");
        Assert.assertNotNull(result);
        Assert.assertEquals(10, result.length());
        Assert.assertEquals(caverphone.caverphone("Peter"), result);
    }

    @Test
    public void testEncodeObjectString() throws EncoderException {
        Object result = caverphone.encode((Object) "Thompson");
        Assert.assertTrue(result instanceof String);
        Assert.assertEquals(caverphone.caverphone("Thompson"), result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectNonStringThrowsException() throws EncoderException {
        caverphone.encode(Integer.valueOf(42));
    }

    @Test
    public void testIsCaverphoneEqualTrue() {
        Assert.assertTrue(caverphone.isCaverphoneEqual("Stevenson", "Stephenson"));
        Assert.assertTrue(caverphone.isCaverphoneEqual("Smith", "Smyth"));
        Assert.assertTrue(caverphone.isCaverphoneEqual("Peter", "Peter"));
    }

    @Test
    public void testIsCaverphoneEqualFalse() {
        Assert.assertFalse(caverphone.isCaverphoneEqual("Peter", "Bob"));
        Assert.assertFalse(caverphone.isCaverphoneEqual("Lee", "Thompson"));
    }

    @Test
    public void testPrefixVariations() {
        Assert.assertEquals(caverphone.caverphone("cough"), caverphone.caverphone("COUGH"));
        Assert.assertEquals(caverphone.caverphone("rough"), caverphone.caverphone("ROUGH"));
        Assert.assertEquals(caverphone.caverphone("tough"), caverphone.caverphone("TOUGH"));
        Assert.assertEquals(caverphone.caverphone("enough"), caverphone.caverphone("ENOUGH"));
        Assert.assertEquals(caverphone.caverphone("trough"), caverphone.caverphone("TROUGH"));
        Assert.assertEquals(caverphone.caverphone("gnome"), caverphone.caverphone("GNOME"));
    }

    @Test
    public void testOutputLengthAlwaysTen() {
        String[] words = {"a", "ab", "abc", "caverphone", "supercalifragilisticexpialidocious"};
        for (String word : words) {
            String encoded = caverphone.caverphone(word);
            Assert.assertNotNull(encoded);
            Assert.assertEquals("Output should be exactly 10 characters for: " + word, 10, encoded.length());
        }
    }
}
