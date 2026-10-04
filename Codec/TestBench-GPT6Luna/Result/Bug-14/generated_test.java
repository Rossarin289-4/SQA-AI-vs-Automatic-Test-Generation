package org.apache.commons.codec.language.bm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.apache.commons.codec.language.bm.Rule.Phoneme;
import java.util.Comparator;
import java.util.HashMap;
import java.util.regex.Matcher;

public class LangTest {
    @Test
    public void testInstanceProvidesLangForEachNameType() throws Exception {
        assertNotNull(Lang.instance(NameType.GENERIC));
        assertNotNull(Lang.instance(NameType.ASHKENAZI));
        assertNotNull(Lang.instance(NameType.SEPHARDIC));
    }

    @Test
    public void testUnknownResourceThrows() throws Exception {
        try {
            Lang.loadFromResource("not-a-resource", Languages.getInstance(NameType.GENERIC));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testMissingLanguageRulesCanReturnAny() throws Exception {
        assertEquals(Languages.ANY, Lang.instance(NameType.GENERIC).guessLanguage("xyzq"));
    }

    @Test
    public void testGuessLanguageIsCaseInsensitive() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        assertEquals(lang.guessLanguage("smith"), lang.guessLanguage("SMITH"));
    }

    @Test
    public void testGuessLanguagesForEmptyInputIsNonNull() throws Exception {
        assertNotNull(Lang.instance(NameType.GENERIC).guessLanguages(""));
    }

    @Test
    public void testGuessLanguagesForCaseVariantsAgree() throws Exception {
        Lang lang = Lang.instance(NameType.SEPHARDIC);
        assertEquals(lang.guessLanguages("garcia").toString(), lang.guessLanguages("GARCIA").toString());
    }

    @Test
    public void testGuessLanguageMatchesSingletonLanguageSet() throws Exception {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        LanguageSet set = lang.guessLanguages("smith");
        assertEquals(set.isSingleton() ? set.getAny() : Languages.ANY, lang.guessLanguage("smith"));
    }

    @Test
    public void testGuessLanguageAmbiguousSetReturnsAny() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        assertEquals(Languages.ANY, lang.guessLanguage("xyzq"));
    }

    @Test
    public void testGuessLanguagesRepeatDeterministically() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        assertEquals(lang.guessLanguages("smith").toString(), lang.guessLanguages("smith").toString());
    }

    @Test
    public void testGuessLanguagesInputCaseUsesEnglishLowercase() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        assertEquals(lang.guessLanguages("I").toString(), lang.guessLanguages("i").toString());
    }

    @Test
    public void testInstanceReturnsSameCachedLanguageObject() throws Exception {
        assertSame(Lang.instance(NameType.GENERIC), Lang.instance(NameType.GENERIC));
    }

    @Test
    public void testGuessLanguageAndGuessLanguagesConsistent() throws Exception {
        Lang lang = Lang.instance(NameType.SEPHARDIC);
        LanguageSet set = lang.guessLanguages("smith");
        assertEquals(set.isSingleton() ? set.getAny() : Languages.ANY, lang.guessLanguage("smith"));
    }

    @Test
    public void testPhonemeBuilderEmptyAndAppend() throws Exception {
        LanguageSet languages = Lang.instance(NameType.GENERIC).guessLanguages("xyzq");
        PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(languages);
        assertEquals("", builder.makeString());
        builder.append("ab");
        assertEquals("ab", builder.makeString());
        assertEquals(1, builder.getPhonemes().size());
    }

    @Test
    public void testPhonemeAppendAndAccessors() throws Exception {
        LanguageSet languages = Lang.instance(NameType.GENERIC).guessLanguages("xyzq");
        Phoneme phoneme = new Phoneme("a", languages);
        phoneme.append("b");
        assertEquals("ab", phoneme.getPhonemeText().toString());
        assertSame(languages, phoneme.getLanguages());
        assertEquals(2, phoneme.getPhonemeText().length());
    }

    @Test
    public void testPhonemeJoinAndMergeLanguage() throws Exception {
        LanguageSet languages = Lang.instance(NameType.GENERIC).guessLanguages("xyzq");
        Phoneme left = new Phoneme("a", languages);
        Phoneme right = new Phoneme("b", languages);
        assertEquals("ab", left.join(right).getPhonemeText().toString());
        assertEquals("a", left.mergeWithLanguage(languages).getPhonemeText().toString());
        assertEquals("a", left.toString().substring(0, 1));
    }

    @Test
    public void testPhonemeComparatorOrdersText() throws Exception {
        LanguageSet languages = Lang.instance(NameType.GENERIC).guessLanguages("xyzq");
        Phoneme a = new Phoneme("a", languages);
        Phoneme ab = new Phoneme("ab", languages);
        assertTrue(Phoneme.COMPARATOR.compare(a, ab) < 0);
        assertEquals(0, Phoneme.COMPARATOR.compare(a, new Phoneme("a", languages)));
        assertTrue(Phoneme.COMPARATOR.compare(ab, a) > 0);
    }

    @Test
    public void testRulePatternAndContextsAtBoundaries() throws Exception {
        Rule rule = new Rule("ab", "", "", new Phoneme("x",
                Lang.instance(NameType.GENERIC).guessLanguages("xyzq")));
        assertTrue(rule.patternAndContextMatches("ab", 0));
        assertFalse(rule.patternAndContextMatches("a", 0));
        assertFalse(rule.patternAndContextMatches("zab", 0));
        try {
            rule.patternAndContextMatches("ab", -1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testRulePatternAndContextChecksLeftAndRight() throws Exception {
        LanguageSet languages = Lang.instance(NameType.GENERIC).guessLanguages("xyzq");
        Rule rule = new Rule("b", "a", "c", new Phoneme("x", languages));
        assertTrue(rule.patternAndContextMatches("abc", 1));
        assertFalse(rule.patternAndContextMatches("xbc", 1));
        assertFalse(rule.patternAndContextMatches("abx", 1));
    }

    @Test
    public void testRuleGettersAndContextMatchers() throws Exception {
        LanguageSet languages = Lang.instance(NameType.GENERIC).guessLanguages("xyzq");
        Rule rule = new Rule("a", "", "", new Phoneme("x", languages));
        assertEquals("a", rule.getPattern());
        assertTrue(rule.getLContext().isMatch(""));
        assertTrue(rule.getRContext().isMatch(""));
        assertEquals("x", rule.getPhoneme().getPhonemes().iterator().next().getPhonemeText().toString());
    }

    @Test
    public void testRuleInstanceMapIsAvailable() throws Exception {
        LanguageSet languages = Lang.instance(NameType.GENERIC).guessLanguages("xyzq");
        Map<String, List<Rule>> rules = Rule.getInstanceMap(NameType.GENERIC, RuleType.RULES, languages);
        assertNotNull(rules);
        assertTrue(rules.size() > 0);
    }

    @Test
    public void testEngineConfigurationAndEncoding() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        assertSame(Lang.instance(NameType.GENERIC), engine.getLang());
        assertEquals(NameType.GENERIC, engine.getNameType());
        assertEquals(RuleType.EXACT, engine.getRuleType());
        assertTrue(engine.isConcat());
        assertEquals(20, engine.getMaxPhonemes());
        assertEquals(engine.encode("smith"), engine.encode("SMITH"));
    }
}
