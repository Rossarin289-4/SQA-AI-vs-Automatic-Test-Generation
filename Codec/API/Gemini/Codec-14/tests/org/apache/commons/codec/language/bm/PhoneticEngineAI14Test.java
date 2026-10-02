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

package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests for {@link PhoneticEngine}.
 */
public class PhoneticEngineAI14Test {

    @Test
    public void testConstructorAndGettersDefaultMaxPhonemes() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        assertEquals(NameType.GENERIC, engine.getNameType());
        assertEquals(RuleType.EXACT, engine.getRuleType());
        assertTrue(engine.isConcat());
        assertEquals(20, engine.getMaxPhonemes());
        assertNotNull(engine.getLang());
    }

    @Test
    public void testConstructorAndGettersCustomMaxPhonemes() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false, 5);
        assertEquals(NameType.ASHKENAZI, engine.getNameType());
        assertEquals(RuleType.APPROX, engine.getRuleType());
        assertFalse(engine.isConcat());
        assertEquals(5, engine.getMaxPhonemes());
        assertNotNull(engine.getLang());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsOnRuleTypeRules() {
        new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true);
    }

    @Test
    public void testEncodeSimpleWord() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        String encoded = engine.encode("smith");
        assertNotNull(encoded);
        assertTrue(encoded.length() > 0);
    }

    @Test
    public void testEncodeGenericPrefixDQuote() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        String encoded = engine.encode("d'angelo");
        assertNotNull(encoded);
        assertTrue(encoded.startsWith("("));
        assertTrue(encoded.contains(")-("));
    }

    @Test
    public void testEncodeGenericPrefixWithSpace() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        String encoded = engine.encode("van gogh");
        assertNotNull(encoded);
        assertTrue(encoded.startsWith("("));
        assertTrue(encoded.contains(")-("));
    }

    @Test
    public void testEncodeAshkenaziPrefixStripping() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true);
        String withPrefix = engine.encode("ben gurion");
        String withoutPrefix = engine.encode("gurion");
        assertEquals(withoutPrefix, withPrefix);
    }

    @Test
    public void testEncodeSephardicPrefixStripping() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, true);
        String withPrefix = engine.encode("da costa");
        String withoutPrefix = engine.encode("costa");
        assertEquals(withoutPrefix, withPrefix);
    }

    @Test
    public void testEncodeNonConcatMultiWord() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        String smith = engine.encode("smith");
        String jones = engine.encode("jones");
        String combined = engine.encode("smith jones");
        assertEquals(smith + "-" + jones, combined);
    }

    @Test
    public void testEncodeWithExplicitLanguageSet() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        String encoded = engine.encode("mueller", Languages.ANY_LANGUAGE);
        assertNotNull(encoded);
        assertTrue(encoded.length() > 0);
    }

    @Test
    public void testPhonemeBuilderOperations() {
        PhoneticEngine.PhonemeBuilder pb = PhoneticEngine.PhonemeBuilder.empty(Languages.ANY_LANGUAGE);
        assertNotNull(pb.getPhonemes());
        assertEquals(1, pb.getPhonemes().size());
        assertEquals("", pb.makeString());

        pb.append("test");
        assertEquals("test", pb.makeString());
    }

    @Test
    public void testMaxPhonemesConstraint() {
        PhoneticEngine engineLimited = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 1);
        PhoneticEngine engineUnconstrained = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 20);

        String encodedLimited = engineLimited.encode("alexandre");
        String encodedUnconstrained = engineUnconstrained.encode("alexandre");

        assertNotNull(encodedLimited);
        assertNotNull(encodedUnconstrained);

        String[] partsLimited = encodedLimited.split("\\|");
        String[] partsUnconstrained = encodedUnconstrained.split("\\|");

        assertTrue(partsLimited.length <= 1);
        assertTrue(partsLimited.length <= partsUnconstrained.length);
    }
}
