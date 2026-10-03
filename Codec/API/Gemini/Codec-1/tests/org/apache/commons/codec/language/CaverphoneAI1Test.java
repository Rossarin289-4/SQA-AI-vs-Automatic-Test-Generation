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
import org.junit.Test;

/**
 * Tests for the {@link Caverphone} class.
 */
public class CaverphoneAI1Test {

    @Test
    public void testNullAndEmptyInput() {
        Caverphone caverphone = new Caverphone();
        Assert.assertEquals("1111111111", caverphone.caverphone(null));
        Assert.assertEquals("1111111111", caverphone.caverphone(""));
        Assert.assertEquals("1111111111", caverphone.encode(null));
        Assert.assertEquals("1111111111", caverphone.encode(""));
    }

    @Test
    public void testSpecialPrefixes() {
        Caverphone caverphone = new Caverphone();
        Assert.assertEquals(caverphone.caverphone("cough"), caverphone.caverphone("couf"));
        Assert.assertEquals(caverphone.caverphone("rough"), caverphone.caverphone("rouf"));
        Assert.assertEquals(caverphone.caverphone("tough"), caverphone.caverphone("touf"));
        Assert.assertEquals(caverphone.caverphone("enough"), caverphone.caverphone("enouf"));
        Assert.assertEquals(caverphone.caverphone("trough"), caverphone.caverphone("trouf"));
        Assert.assertEquals(caverphone.caverphone("gnat"), caverphone.caverphone("nat"));
        Assert.assertEquals(caverphone.caverphone("mbappe"), caverphone.caverphone("mappe"));
    }

    @Test
    public void testIsCaverphoneEqual() {
        Caverphone caverphone = new Caverphone();
        Assert.assertTrue(caverphone.isCaverphoneEqual("Lee", "Leigh"));
        Assert.assertTrue(caverphone.isCaverphoneEqual("Peter", "Petre"));
        Assert.assertFalse(caverphone.isCaverphoneEqual("Peter", "Paul"));
        Assert.assertTrue(caverphone.isCaverphoneEqual("", ""));
        Assert.assertTrue(caverphone.isCaverphoneEqual(null, ""));
    }

    @Test
    public void testEncodeObjectValid() throws EncoderException {
        Caverphone caverphone = new Caverphone();
        Object result = caverphone.encode((Object) "Stevenson");
        Assert.assertTrue(result instanceof String);
        Assert.assertEquals(caverphone.caverphone("Stevenson"), result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidType() throws EncoderException {
        Caverphone caverphone = new Caverphone();
        caverphone.encode(new Integer(42));
    }

    @Test
    public void testNonAlphaFiltering() {
        Caverphone caverphone = new Caverphone();
        Assert.assertEquals(caverphone.caverphone("Stevenson"), caverphone.caverphone("123Steven-son!"));
        Assert.assertEquals("1111111111", caverphone.caverphone("123456!@#$%^&*()"));
    }

    @Test
    public void testFinalEHandling() {
        Caverphone caverphone = new Caverphone();
        Assert.assertEquals(caverphone.caverphone("Kate"), caverphone.caverphone("Kat"));
    }

    @Test
    public void testVariousCharacterMappings() {
        Caverphone caverphone = new Caverphone();
        Assert.assertEquals(caverphone.caverphone("cinema"), caverphone.caverphone("sinema"));
        Assert.assertEquals(caverphone.caverphone("center"), caverphone.caverphone("senter"));
        Assert.assertEquals(caverphone.caverphone("photo"), caverphone.caverphone("fhoto"));
        Assert.assertEquals(caverphone.caverphone("quick"), caverphone.caverphone("kuick"));
    }

    @Test
    public void testOutputLengthAlwaysTen() {
        Caverphone caverphone = new Caverphone();
        Assert.assertEquals(10, caverphone.caverphone("a").length());
        Assert.assertEquals(10, caverphone.caverphone("supercalifragilisticexpialidocious").length());
        Assert.assertEquals(10, caverphone.caverphone("Thompson").length());
        Assert.assertEquals(10, caverphone.caverphone("W").length());
    }

    @Test
    public void testKnownEncodings() {
        Caverphone caverphone = new Caverphone();
        Assert.assertEquals("K111111111", caverphone.caverphone("c"));
        Assert.assertEquals("APA1111111", caverphone.caverphone("aba"));
        Assert.assertEquals("TM11111111", caverphone.caverphone("Tom"));
    }
}
