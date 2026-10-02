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
 * Unit tests for {@link DoubleMetaphone}.
 */
public class DoubleMetaphoneAI13Test {

    @Test
    public void testNullAndEmptyInput() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        Assert.assertNull(dm.doubleMetaphone(null));
        Assert.assertNull(dm.doubleMetaphone(""));
        Assert.assertNull(dm.doubleMetaphone("   "));
        Assert.assertNull(dm.encode((String) null));
    }

    @Test
    public void testEncodeObjectValid() throws EncoderException {
        final DoubleMetaphone dm = new DoubleMetaphone();
        final Object result = dm.encode("testing");
        Assert.assertTrue(result instanceof String);
        Assert.assertEquals("TSTN", result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalid() throws EncoderException {
        final DoubleMetaphone dm = new DoubleMetaphone();
        dm.encode(Integer.valueOf(42));
    }

    @Test
    public void testMaxCodeLength() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        Assert.assertEquals(4, dm.getMaxCodeLen());

        dm.setMaxCodeLen(6);
        Assert.assertEquals(6, dm.getMaxCodeLen());
        final String encoded6 = dm.doubleMetaphone("Alexander");
        Assert.assertEquals("ALKSNT", encoded6);

        dm.setMaxCodeLen(2);
        Assert.assertEquals(2, dm.getMaxCodeLen());
        final String encoded2 = dm.doubleMetaphone("Alexander");
        Assert.assertEquals("AL", encoded2);
    }

    @Test
    public void testSilentStartCombinations() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        // GN, KN, PN, WR, PS all have their first letter silent
        Assert.assertEquals("NT", dm.doubleMetaphone("Gnat"));
        Assert.assertEquals("NT", dm.doubleMetaphone("Knight"));
        Assert.assertEquals("NMN", dm.doubleMetaphone("Pneumonia"));
        Assert.assertEquals("RT", dm.doubleMetaphone("Write"));
        Assert.assertEquals("SXK", dm.doubleMetaphone("Psychic", false));
        Assert.assertEquals("SKK", dm.doubleMetaphone("Psychic", true));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        Assert.assertTrue(dm.isDoubleMetaphoneEqual("John", "Jon"));
        Assert.assertTrue(dm.isDoubleMetaphoneEqual("John", "Jon", false));
        Assert.assertTrue(dm.isDoubleMetaphoneEqual("John", "Jon", true));
        Assert.assertFalse(dm.isDoubleMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testHandleCCases() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        Assert.assertEquals("SSR", dm.doubleMetaphone("Caesar"));
        Assert.assertEquals("K", dm.doubleMetaphone("Chia"));
        Assert.assertEquals("SRN", dm.doubleMetaphone("Czerny", false));
        Assert.assertEquals("XRN", dm.doubleMetaphone("Czerny", true));
        Assert.assertEquals("FKX", dm.doubleMetaphone("Focaccia"));
        Assert.assertEquals("AKST", dm.doubleMetaphone("Accident"));
        Assert.assertEquals("PKS", dm.doubleMetaphone("Bacchus"));
    }

    @Test
    public void testHandleSpecialSounds() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        // Cedilla C
        Assert.assertEquals("S", dm.doubleMetaphone("\u00C7"));
        // Spanish ene
        Assert.assertEquals("N", dm.doubleMetaphone("\u00D1"));
        // 'TH' primary vs alternate
        Assert.assertEquals("0", dm.doubleMetaphone("The", false));
        Assert.assertEquals("T", dm.doubleMetaphone("The", true));
        // Spanish Jose / San
        Assert.assertEquals("HS", dm.doubleMetaphone("Jose"));
        Assert.assertEquals("SNHS", dm.doubleMetaphone("San Jose"));
    }

    @Test
    public void testHandleWAndX() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        // Initial W before vowel
        Assert.assertEquals("ASRM", dm.doubleMetaphone("Wasserman", false));
        Assert.assertEquals("FSRM", dm.doubleMetaphone("Wasserman", true));
        // Initial X
        Assert.assertEquals("SF", dm.doubleMetaphone("Xavier", false));
        Assert.assertEquals("SFR", dm.doubleMetaphone("Xavier", true));
        // French -eaux ending
        Assert.assertEquals("PR", dm.doubleMetaphone("Breaux"));
    }

    @Test
    public void testHelperCharAtAndContains() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        Assert.assertEquals(Character.MIN_VALUE, dm.charAt("abc", -1));
        Assert.assertEquals(Character.MIN_VALUE, dm.charAt("abc", 3));
        Assert.assertEquals('b', dm.charAt("abc", 1));

        Assert.assertTrue(DoubleMetaphone.contains("TESTING", 0, 4, "TEST", "TOST"));
        Assert.assertFalse(DoubleMetaphone.contains("TESTING", 0, 4, "TOST"));
        Assert.assertFalse(DoubleMetaphone.contains("TESTING", -1, 4, "TEST"));
        Assert.assertFalse(DoubleMetaphone.contains("TESTING", 5, 4, "TEST"));
    }

    @Test
    public void testDoubleMetaphoneResultInnerClass() {
        final DoubleMetaphone dm = new DoubleMetaphone();
        final DoubleMetaphone.DoubleMetaphoneResult result = dm.new DoubleMetaphoneResult(4);
        result.append('A', 'B');
        result.append("CDE", "FGH");
        Assert.assertEquals("ACDE", result.getPrimary());
        Assert.assertEquals("BFGH", result.getAlternate());
        Assert.assertTrue(result.isComplete());

        result.append('Z');
        Assert.assertEquals("ACDE", result.getPrimary());
        Assert.assertEquals("BFGH", result.getAlternate());
    }
}
