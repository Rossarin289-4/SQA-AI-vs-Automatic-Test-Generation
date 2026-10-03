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

/**
 * Unit tests for {@link Metaphone}.
 */
public class MetaphoneAI1Test {

    private Metaphone metaphone;

    @Before
    public void setUp() {
        this.metaphone = new Metaphone();
    }

    @Test
    public void testNullAndEmptyInput() {
        Assert.assertEquals("", this.metaphone.metaphone(null));
        Assert.assertEquals("", this.metaphone.metaphone(""));
        Assert.assertEquals("", this.metaphone.encode(""));
    }

    @Test
    public void testSingleCharacterInput() {
        Assert.assertEquals("A", this.metaphone.metaphone("a"));
        Assert.assertEquals("Z", this.metaphone.metaphone("z"));
        Assert.assertEquals("X", this.metaphone.metaphone("X"));
    }

    @Test
    public void testInitialCharacterTransformations() {
        Assert.assertEquals("NT", this.metaphone.metaphone("knight"));
        Assert.assertEquals("NM", this.metaphone.metaphone("gnome"));
        Assert.assertEquals("NMN", this.metaphone.metaphone("pneumonia"));
        Assert.assertEquals("EJS", this.metaphone.metaphone("aegis"));
        Assert.assertEquals("R0", this.metaphone.metaphone("wrath"));
        Assert.assertEquals("WL", this.metaphone.metaphone("whale"));
        Assert.assertEquals("SNN", this.metaphone.metaphone("xenon"));
    }

    @Test
    public void testDuplicateAndSilentLetters() {
        Assert.assertEquals("TM", this.metaphone.metaphone("dumb"));
        Assert.assertEquals("AKST", this.metaphone.metaphone("accidental"));
        Assert.assertEquals("SN", this.metaphone.metaphone("scene"));
        Assert.assertEquals("0K", this.metaphone.metaphone("thick"));
    }

    @Test
    public void testCAndTTransformations() {
        Assert.assertEquals("X", this.metaphone.metaphone("ciao"));
        Assert.assertEquals("ST", this.metaphone.metaphone("city"));
        Assert.assertEquals("SKL", this.metaphone.metaphone("school"));
        Assert.assertEquals("KRKT", this.metaphone.metaphone("character"));
        Assert.assertEquals("ARX", this.metaphone.metaphone("arch"));
        Assert.assertEquals("RX", this.metaphone.metaphone("ratio"));
        Assert.assertEquals("KX", this.metaphone.metaphone("catch"));
    }

    @Test
    public void testDAndGTransformations() {
        Assert.assertEquals("EJ", this.metaphone.metaphone("edge"));
        Assert.assertEquals("TJ", this.metaphone.metaphone("dodge"));
        Assert.assertEquals("NT", this.metaphone.metaphone("night"));
        Assert.assertEquals("PJ", this.metaphone.metaphone("page"));
        Assert.assertEquals("N", this.metaphone.metaphone("gnaw"));
    }

    @Test
    public void testPAndVAndZTransformations() {
        Assert.assertEquals("FN", this.metaphone.metaphone("phone"));
        Assert.assertEquals("FT", this.metaphone.metaphone("vote"));
        Assert.assertEquals("SBR", this.metaphone.metaphone("zebra"));
    }

    @Test
    public void testMaxCodeLength() {
        Assert.assertEquals(4, this.metaphone.getMaxCodeLen());
        Assert.assertEquals("WXNK", this.metaphone.metaphone("washington"));

        this.metaphone.setMaxCodeLen(6);
        Assert.assertEquals(6, this.metaphone.getMaxCodeLen());
        Assert.assertEquals("WXNKTN", this.metaphone.metaphone("washington"));

        this.metaphone.setMaxCodeLen(2);
        Assert.assertEquals("WX", this.metaphone.metaphone("washington"));
    }

    @Test
    public void testIsMetaphoneEqual() {
        Assert.assertTrue(this.metaphone.isMetaphoneEqual("knight", "night"));
        Assert.assertTrue(this.metaphone.isMetaphoneEqual("write", "right"));
        Assert.assertFalse(this.metaphone.isMetaphoneEqual("cat", "dog"));
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        Object result = this.metaphone.encode((Object) "test");
        Assert.assertEquals("TST", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeNonStringThrowsException() throws EncoderException {
        this.metaphone.encode(Integer.valueOf(12345));
    }
}
