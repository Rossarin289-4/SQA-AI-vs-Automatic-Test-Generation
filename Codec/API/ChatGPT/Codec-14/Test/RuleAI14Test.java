package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RuleAI14Test {

    @Test
    public void testPhonemeComparison() {
        Languages.LanguageSet langSet = Languages.AnyLanguageSet.getInstance();
        Rule.Phoneme p1 = new Rule.Phoneme("abc", langSet);
        Rule.Phoneme p2 = new Rule.Phoneme("abd", langSet);
        Rule.Phoneme p3 = new Rule.Phoneme("ab", langSet);

        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p2) < 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p2, p1) > 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p3) > 0);
        assertEquals(0, Rule.Phoneme.COMPARATOR.compare(p1, p1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPatternAndContextMatchesNegativeIndex() {
        Rule rule = new Rule("a", "", "", new Rule.Phoneme("b", Languages.AnyLanguageSet.getInstance()));
        rule.patternAndContextMatches("input", -1);
    }

    @Test
    public void testPatternAndContextMatchesValid() {
        Rule rule = new Rule("at", "c", "s", new Rule.Phoneme("o", Languages.AnyLanguageSet.getInstance()));
        assertTrue(rule.patternAndContextMatches("cats", 1));
        assertFalse(rule.patternAndContextMatches("bats", 1));
    }
}
