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

public class DoubleMetaphoneAI3Test {

    private DoubleMetaphone doubleMetaphone;

    @Before
    public void setUp() {
        this.doubleMetaphone = new DoubleMetaphone();
    }

    @Test
    public void testCleanInputNullAndEmpty() {
        Assert.assertNull(this.doubleMetaphone.doubleMetaphone(null));
        Assert.assertNull(this.doubleMetaphone.doubleMetaphone(""));
        Assert.assertNull(this.doubleMetaphone.doubleMetaphone("   "));
        Assert.assertNull(this.doubleMetaphone.doubleMetaphone(null, true));
        Assert.assertNull(this.doubleMetaphone.doubleMetaphone(" ", true));
    }

    @Test
    public void testEncodeStringAndObject() throws EncoderException {
        Assert.assertEquals("TSTN", this.doubleMetaphone.encode("testing"));
        Object encodedObj = this.doubleMetaphone.encode((Object) "testing");
        Assert.assertEquals("TSTN", encodedObj);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeNonStringThrowsException() throws EncoderException {
        this.doubleMetaphone.encode(Integer.valueOf(12345));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        Assert.assertTrue(this.doubleMetaphone.isDoubleMetaphoneEqual("Knight", "night"));
        Assert.assertTrue(this.doubleMetaphone.isDoubleMetaphoneEqual("Wasserman", "Vasserman", true));
        Assert.assertFalse(this.doubleMetaphone.isDoubleMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testSilentStartCombinations() {
        Assert.assertEquals("NT", this.doubleMetaphone.doubleMetaphone("Gnat"));
        Assert.assertEquals("NT", this.doubleMetaphone.doubleMetaphone("Knight"));
        Assert.assertEquals("NMN", this.doubleMetaphone.doubleMetaphone("Pneumonia"));
        Assert.assertEquals("RK", this.doubleMetaphone.doubleMetaphone("Wreck"));
        Assert.assertEquals("SLM", this.doubleMetaphone.doubleMetaphone("Psalm"));
    }

    @Test
    public void testMaxCodeLength() {
        Assert.assertEquals(4, this.doubleMetaphone.getMaxCodeLen());
        this.doubleMetaphone.setMaxCodeLen(8);
        Assert.assertEquals(8, this.doubleMetaphone.getMaxCodeLen());

        String resultLong = this.doubleMetaphone.doubleMetaphone("Washington");
        Assert.assertEquals("AXNK", resultLong.substring(0, 4));
        Assert.assertTrue(resultLong.length() > 4);

        this.doubleMetaphone.setMaxCodeLen(2);
        Assert.assertEquals(2, this.doubleMetaphone.getMaxCodeLen());
        Assert.assertEquals("AX", this.doubleMetaphone.doubleMetaphone("Washington"));
    }

    @Test
    public void testPrimaryAndAlternateEncodings() {
        // Michael: Primary "MKL", Alternate "MXL"
        Assert.assertEquals("MKL", this.doubleMetaphone.doubleMetaphone("Michael", false));
        Assert.assertEquals("MXL", this.doubleMetaphone.doubleMetaphone("Michael", true));

        // Wasserman: Primary "ASRM", Alternate "FSRM"
        Assert.assertEquals("ASRM", this.doubleMetaphone.doubleMetaphone("Wasserman", false));
        Assert.assertEquals("FSRM", this.doubleMetaphone.doubleMetaphone("Wasserman", true));
    }

    @Test
    public void testHelperCharAt() {
        String test = "TEST";
        Assert.assertEquals('T', this.doubleMetaphone.charAt(test, 0));
        Assert.assertEquals('E', this.doubleMetaphone.charAt(test, 1));
        Assert.assertEquals(Character.MIN_VALUE, this.doubleMetaphone.charAt(test, -1));
        Assert.assertEquals(Character.MIN_VALUE, this.doubleMetaphone.charAt(test, 4));
    }

    @Test
    public void testHelperContains() {
        Assert.assertTrue(DoubleMetaphone.contains("ALASKA", 0, 4, new String[] { "ALAS" }));
        Assert.assertTrue(DoubleMetaphone.contains("ALASKA", 2, 2, new String[] { "AS", "AK" }));
        Assert.assertFalse(DoubleMetaphone.contains("ALASKA", 2, 2, new String[] { "XX", "YY" }));
        Assert.assertFalse(DoubleMetaphone.contains("ALASKA", -1, 3, new String[] { "ALA" }));
        Assert.assertFalse(DoubleMetaphone.contains("ALASKA", 5, 3, new String[] { "KA" }));
    }

    @Test
    public void testDoubleMetaphoneResultDirectly() {
        DoubleMetaphone.DoubleMetaphoneResult result = this.doubleMetaphone.new DoubleMetaphoneResult(4);
        Assert.assertFalse(result.isComplete());

        result.append('A', 'B');
        Assert.assertEquals("A", result.getPrimary());
        Assert.assertEquals("B", result.getAlternate());

        result.append("CDE", "FGH");
        Assert.assertEquals("ACDE", result.getPrimary());
        Assert.assertEquals("BFGH", result.getAlternate());
        Assert.assertTrue(result.isComplete());

        // Should not exceed maximum length
        result.append('X');
        Assert.assertEquals("ACDE", result.getPrimary());
        Assert.assertEquals("BFGH", result.getAlternate());
    }
}
