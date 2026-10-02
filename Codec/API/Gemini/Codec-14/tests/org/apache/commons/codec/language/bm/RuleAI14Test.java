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

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class RuleAI14Test {

    @Test
    public void testPhonemeComparator() {
        final Rule.Phoneme p1 = new Rule.Phoneme("abc", Languages.ANY_LANGUAGE);
        final Rule.Phoneme p2 = new Rule.Phoneme("abcd", Languages.ANY_LANGUAGE);
        final Rule.Phoneme p3 = new Rule.Phoneme("abd", Languages.ANY_LANGUAGE);
        final Rule.Phoneme p4 = new Rule.Phoneme("abc", Languages.ANY_LANGUAGE);

        Assert.assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p2) < 0);
        Assert.assertTrue(Rule.Phoneme.COMPARATOR.compare(p2, p1) > 0);
        Assert.assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p3) < 0);
        Assert.assertTrue(Rule.Phoneme.COMPARATOR.compare(p3, p1) > 0);
        Assert.assertEquals(0, Rule.Phoneme.COMPARATOR.compare(p1, p4));
    }

    @Test
    public void testPhonemeConstructorsAndAppend() {
        final Set<String> langSet1 = new HashSet<String>(Arrays.asList("english", "french"));
        final Languages.LanguageSet langs1 = Languages.LanguageSet.from(langSet1);

        final Set<String> langSet2 = new HashSet<String>(Arrays.asList("french", "german"));
        final Languages.LanguageSet langs2 = Languages.LanguageSet.from(langSet2);

        final Rule.Phoneme p1 = new Rule.Phoneme("foo", langs1);
        Assert.assertEquals("foo", p1.getPhonemeText().toString());
        Assert.assertEquals(langs1, p1.getLanguages());

        p1.append("bar");
        Assert.assertEquals("foobar", p1.getPhonemeText().toString());

        final Rule.Phoneme p2 = new Rule.Phoneme("baz", langs2);
        final Rule.Phoneme combined = new Rule.Phoneme(p1, p2);
        Assert.assertEquals("foobarbaz", combined.getPhonemeText().toString());
        Assert.assertEquals(langs1, combined.getLanguages());

        final Rule.Phoneme combinedWithLangs = new Rule.Phoneme(p1, p2, langs2);
        Assert.assertEquals("foobarbaz", combinedWithLangs.getPhonemeText().toString());
        Assert.assertEquals(langs2, combinedWithLangs.getLanguages());

        final Rule.Phoneme merged = p1.mergeWithLanguage(langs2);
        Assert.assertEquals("foobar", merged.getPhonemeText().toString());
        Assert.assertTrue(merged.getLanguages().contains("english"));
        Assert.assertTrue(merged.getLanguages().contains("french"));
        Assert.assertTrue(merged.getLanguages().contains("german"));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testPhonemeJoinAndToString() {
        final Set<String> langSet1 = new HashSet<String>(Arrays.asList("english", "french"));
        final Languages.LanguageSet langs1 = Languages.LanguageSet.from(langSet1);

        final Set<String> langSet2 = new HashSet<String>(Arrays.asList("french", "german"));
        final Languages.LanguageSet langs2 = Languages.LanguageSet.from(langSet2);

        final Rule.Phoneme p1 = new Rule.Phoneme("abc", langs1);
        final Rule.Phoneme p2 = new Rule.Phoneme("def", langs2);

        final Rule.Phoneme joined = p1.join(p2);
        Assert.assertEquals("abcdef", joined.getPhonemeText().toString());
        Assert.assertTrue(joined.getLanguages().contains("french"));
        Assert.assertFalse(joined.getLanguages().contains("english"));
        Assert.assertFalse(joined.getLanguages().contains("german"));

        final String str = p1.toString();
        Assert.assertTrue(str.startsWith("abc["));
        Assert.assertTrue(str.endsWith("]"));
    }

    @Test
    public void testPhonemeList() {
        final Rule.Phoneme p1 = new Rule.Phoneme("a", Languages.ANY_LANGUAGE);
        final Rule.Phoneme p2 = new Rule.Phoneme("b", Languages.ANY_LANGUAGE);
        final List<Rule.Phoneme> list = Arrays.asList(p1, p2);
        final Rule.PhonemeList phonemeList = new Rule.PhonemeList(list);

        Assert.assertEquals(list, phonemeList.getPhonemes());
        Assert.assertEquals(Collections.singleton(p1), p1.getPhonemes());
    }

    @Test
    public void testRuleCreationAndGetters() {
        final Rule.Phoneme phoneme = new Rule.Phoneme("ph", Languages.ANY_LANGUAGE);
        final Rule rule = new Rule("pat", "l", "r", phoneme);

        Assert.assertEquals("pat", rule.getPattern());
        Assert.assertEquals(phoneme, rule.getPhoneme());
        Assert.assertNotNull(rule.getLContext());
        Assert.assertNotNull(rule.getRContext());
    }

    @Test
    public void testPatternAndContextMatches() {
        final Rule.Phoneme phoneme = new Rule.Phoneme("out", Languages.ANY_LANGUAGE);
        final Rule rule = new Rule("b", "a", "c", phoneme);

        Assert.assertTrue(rule.patternAndContextMatches("abc", 1));
        Assert.assertFalse(rule.patternAndContextMatches("zbc", 1));
        Assert.assertFalse(rule.patternAndContextMatches("abz", 1));
        Assert.assertFalse(rule.patternAndContextMatches("adc", 1));
        Assert.assertFalse(rule.patternAndContextMatches("abc", 0));
        Assert.assertFalse(rule.patternAndContextMatches("abc", 2));
    }

    @Test
    public void testPatternAndContextMatchesWithRegex() {
        final Rule.Phoneme phoneme = new Rule.Phoneme("out", Languages.ANY_LANGUAGE);
        final Rule rule = new Rule("b", "[aeiou]", "[0-9]", phoneme);

        Assert.assertTrue(rule.patternAndContextMatches("eb5", 1));
        Assert.assertTrue(rule.patternAndContextMatches("ub9", 1));
        Assert.assertFalse(rule.patternAndContextMatches("xb5", 1));
        Assert.assertFalse(rule.patternAndContextMatches("eba", 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPatternAndContextMatchesNegativeIndex() {
        final Rule.Phoneme phoneme = new Rule.Phoneme("out", Languages.ANY_LANGUAGE);
        final Rule rule = new Rule("b", "a", "c", phoneme);
        rule.patternAndContextMatches("abc", -1);
    }

    @Test
    public void testGetInstanceAndGetInstanceMap() {
        final List<Rule> rulesList = Rule.getInstance(NameType.GENERIC, RuleType.APPROX, "english");
        Assert.assertNotNull(rulesList);
        Assert.assertFalse(rulesList.isEmpty());

        final Map<String, List<Rule>> ruleMap = Rule.getInstanceMap(NameType.GENERIC, RuleType.APPROX, "english");
        Assert.assertNotNull(ruleMap);
        Assert.assertFalse(ruleMap.isEmpty());

        final Languages.LanguageSet langSet = Languages.LanguageSet.from(
                new HashSet<String>(Collections.singletonList("english")));
        final List<Rule> rulesFromSet = Rule.getInstance(NameType.GENERIC, RuleType.APPROX, langSet);
        Assert.assertNotNull(rulesFromSet);
        Assert.assertEquals(rulesList.size(), rulesFromSet.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceMapInvalidLanguage() {
        Rule.getInstanceMap(NameType.GENERIC, RuleType.APPROX, "unknown_lang_invalid");
    }

    @Test
    public void testAllStringsRMature() {
        Assert.assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch(""));
        Assert.assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch("hello"));
        Assert.assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch("12345"));
    }
}
