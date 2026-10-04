```java
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
    public void testLangInstanceGERMAN() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        assertNotNull(lang);
        assertEquals("org.apache.commons.codec.language.bm.Lang", lang.getClass().getName());
    }

    @Test
    public void testLangInstanceASHKENAZI() throws Exception {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        assertNotNull(lang);
        assertEquals("org.apache.commons.codec.language.bm.Lang", lang.getClass().getName());
    }

    @Test
    public void testLangInstanceSEPHARDIC() throws Exception {
        Lang lang = Lang.instance(NameType.SEPHARDIC);
        assertNotNull(lang);
        assertEquals("org.apache.commons.codec.language.bm.Lang", lang.getClass().getName());
    }

    @Test
    public void testLoadFromResourceGERMAN() throws Exception {
        Languages languages = Languages.getInstance(NameType.GENERIC);
        // Constructing the expected resource name manually as Lang.LANGUAGE_RULES_RN is private.
        String resourceName = String.format("org/apache/commons/codec/language/bm/%s_lang.txt", NameType.GENERIC.getName());
        Lang lang = Lang.loadFromResource(resourceName, languages);
        assertNotNull(lang);
    }

    @Test
    public void testLoadFromResourceASHKENAZI() throws Exception {
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        String resourceName = String.format("org/apache/commons/codec/language/bm/%s_lang.txt", NameType.ASHKENAZI.getName());
        Lang lang = Lang.loadFromResource(resourceName, languages);
        assertNotNull(lang);
    }

    @Test
    public void testLoadFromResourceSEPHARDIC() throws Exception {
        Languages languages = Languages.getInstance(NameType.SEPHARDIC);
        String resourceName = String.format("org/apache/commons/codec/language/bm/%s_lang.txt", NameType.SEPHARDIC.getName());
        Lang lang = Lang.loadFromResource(resourceName, languages);
        assertNotNull(lang);
    }

    @Test(expected = IllegalStateException.class)
    public void testLoadFromResourceNullStream() throws Exception {
        Lang.loadFromResource("non_existent_resource.txt", Languages.getInstance(NameType.GENERIC));
    }

    @Test
    public void testGuessLanguageEmptyString() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        assertEquals(Languages.ANY, lang.guessLanguage(""));
    }

    @Test
    public void testGuessLanguageSingleWord() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        // Based on common language rules, "smith" is likely generic.
        assertEquals("generic", lang.guessLanguage("smith"));
    }

    @Test
    public void testGuessLanguageMultiWord() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        // "van der waals" is a common surname structure, likely generic.
        assertEquals("generic", lang.guessLanguage("van der waals"));
    }

    @Test
    public void testGuessLanguageUnknownWord() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        // A highly unusual word that doesn't match any rules.
        assertEquals(Languages.ANY, lang.guessLanguage("zxqwertyuio"));
    }

    @Test
    public void testGuessLanguagesEmptyString() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("");
        // The expected outcome for an empty string might be broader than just 'generic' depending on rules.
        // For a general test, asserting that it's not an empty set and doesn't exclusively mean 'NO_LANGUAGES' is reasonable.
        assertTrue(!ls.equals(Languages.NO_LANGUAGES));
    }

    @Test
    public void testGuessLanguagesSingleWord() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("smith");
        assertTrue(ls.contains("generic"));
    }

    @Test
    public void testGuessLanguagesMultiWord() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("van der waals");
        assertTrue(ls.contains("generic"));
    }

    @Test
    public void testGuessLanguagesUnknownWord() throws Exception {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("zxqwertyuio");
        assertTrue(ls.equals(Languages.ANY_LANGUAGE)); // Expecting no specific language
    }

    // Tests for PhonemeBuilder (now accessible as Rule.PhonemeBuilder)
    @Test
    public void testPhonemeBuilderEmpty() throws Exception {
        Languages.LanguageSet ls = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        // PhonemeBuilder is an inner class of Rule, so access it via Rule.PhonemeBuilder
        Rule.PhonemeBuilder pb = Rule.PhonemeBuilder.empty(ls);
        assertNotNull(pb);
        assertEquals(1, pb.getPhonemes().size());
        assertEquals("", pb.getPhonemes().iterator().next().getPhonemeText());
        assertEquals(ls, pb.getPhonemes().iterator().next().getLanguages());
    }

    @Test
    public void testPhonemeBuilderAppend() throws Exception {
        Languages.LanguageSet ls = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        Rule.PhonemeBuilder pb = Rule.PhonemeBuilder.empty(ls);
        pb.append("abc");
        assertEquals("abc", pb.getPhonemes().iterator().next().getPhonemeText());
    }

    @Test
    public void testPhonemeBuilderMakeString() throws Exception {
        Languages.LanguageSet ls1 = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        Rule.PhonemeBuilder pb = Rule.PhonemeBuilder.empty(ls1);
        pb.append("abc");

        Languages.LanguageSet ls2 = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("fr")));
        Rule.PhonemeBuilder pb2 = Rule.PhonemeBuilder.empty(ls2);
        pb2.append("def");

        Set<Rule.Phoneme> phonemes = new LinkedHashSet<>();
        phonemes.add(new Rule.Phoneme("abc", ls1));
        phonemes.add(new Rule.Phoneme("def", ls2));
        Rule.PhonemeBuilder combinedPb = new Rule.PhonemeBuilder(phonemes);

        assertEquals("abc|def", combinedPb.makeString());
    }

    // Tests for RulesApplication
    // RulesApplication is a private inner class of PhoneticEngine and cannot be instantiated directly or tested separately
    // without significant refactoring or making it accessible, which is not allowed.
    // Its functionality is indirectly tested through PhoneticEngine.encode.

    // Tests for PhoneticEngine
    @Test
    public void testPhoneticEngineEncode() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        // This test is highly dependent on the content of the resource files.
        // A simple case that should not throw an exception and produce some output.
        String encoded = engine.encode("test");
        assertNotNull(encoded);
        assertTrue(encoded.length() > 0);
    }

    @Test
    public void testPhoneticEngineEncodeWithLanguageSet() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        Languages.LanguageSet ls = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        String encoded = engine.encode("test", ls);
        assertNotNull(encoded);
        assertTrue(encoded.length() > 0);
    }

    @Test
    public void testPhoneticEngineGetters() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true, 15);
        assertEquals(NameType.ASHKENAZI, engine.getNameType());
        assertEquals(RuleType.EXACT, engine.getRuleType());
        assertTrue(engine.isConcat());
        assertEquals(15, engine.getMaxPhonemes());
        assertNotNull(engine.getLang());
    }

    // Tests for Rule.Phoneme
    @Test
    public void testPhonemeConstructorAndGetters() throws Exception {
        Languages.LanguageSet ls = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en", "fr")));
        Rule.Phoneme p = new Rule.Phoneme("test", ls);
        assertEquals("test", p.getPhonemeText());
        assertEquals(ls, p.getLanguages());
    }

    @Test
    public void testPhonemeAppend() throws Exception {
        Languages.LanguageSet ls = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        Rule.Phoneme p = new Rule.Phoneme("start", ls);
        p.append("end");
        assertEquals("startend", p.getPhonemeText());
    }

    @Test
    public void testPhonemeMergeWithLanguage() throws Exception {
        Languages.LanguageSet ls1 = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        Languages.LanguageSet ls2 = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("fr")));
        Rule.Phoneme p = new Rule.Phoneme("test", ls1);
        Rule.Phoneme merged = p.mergeWithLanguage(ls2);
        assertEquals("test", merged.getPhonemeText());
        // The LanguageSet returned by mergeWithLanguage should contain both languages.
        // LanguageSet.getLanguages() is the correct method to retrieve the set.
        assertEquals(2, merged.getLanguages().getLanguages().size());
        assertTrue(merged.getLanguages().contains("en"));
        assertTrue(merged.getLanguages().contains("fr"));
    }

    @Test
    public void testPhonemeComparator() throws Exception {
        Comparator<Phoneme> comparator = Rule.Phoneme.COMPARATOR;
        Languages.LanguageSet ls = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        Phoneme p1 = new Phoneme("apple", ls);
        Phoneme p2 = new Phoneme("apply", ls);
        Phoneme p3 = new Phoneme("apple", ls);
        Phoneme p4 = new Rule.Phoneme("apples", ls); // Ensure Phoneme is accessed via Rule

        assertTrue(comparator.compare(p1, p2) < 0); // apple < apply
        assertEquals(0, comparator.compare(p1, p3)); // apple == apple
        assertTrue(comparator.compare(p1, p4) < 0); // apple < apples
    }

    // Tests for Rule.PhonemeList and Rule.PhonemeExpr
    @Test
    public void testPhonemeListGetPhonemes() throws Exception {
        Languages.LanguageSet ls = Languages.LanguageSet.from(new HashSet<>(Arrays.asList("en")));
        Phoneme p1 = new Phoneme("a", ls);
        Phoneme p2 = new Phoneme("b", ls);
        List<Phoneme> phonemeList = Arrays.asList(p1, p2);
        Rule.PhonemeList pl = new Rule.PhonemeList(phonemeList);
        assertEquals(phonemeList, pl.getPhonemes());
    }

    // Tests for Rule
    @Test
    public void testRulePatternAndContextMatches() throws Exception {
        // Create a rule: pattern="b", left="a", right="c"
        Rule rule = new Rule("b", "a", "c", new Rule.Phoneme("X", Languages.ANY_LANGUAGE));
        assertTrue(rule.patternAndContextMatches("abc", 1)); // matches "abc" at index 1
        assertFalse(rule.patternAndContextMatches("axc", 1)); // pattern "b" does not match
        assertFalse(rule.patternAndContextMatches("abd", 1)); // right context "c" does not match
        assertFalse(rule.patternAndContextMatches("xbc", 1)); // left context "a" does not match
    }

    @Test
    public void testRulePatternAndContextMatchesEdgeCases() throws Exception {
        // Rule: pattern="a", left="", right=""
        Rule rule1 = new Rule("a", "", "", new Rule.Phoneme("X", Languages.ANY_LANGUAGE));
        assertTrue(rule1.patternAndContextMatches("a", 0));
        assertTrue(rule1.patternAndContextMatches("ba", 1));
        assertFalse(rule1.patternAndContextMatches("b", 0));

        // Rule: pattern="a", left="b", right=""
        Rule rule2 = new Rule("a", "b", "", new Rule.Phoneme("X", Languages.ANY_LANGUAGE));
        assertTrue(rule2.patternAndContextMatches("ba", 1));
        assertFalse(rule2.patternAndContextMatches("a", 0));

        // Rule: pattern="a", left="", right="b"
        Rule rule3 = new Rule("a", "", "b", new Rule.Phoneme("X", Languages.ANY_LANGUAGE));
        assertTrue(rule3.patternAndContextMatches("ab", 0));
        assertFalse(rule3.patternAndContextMatches("a", 0));

        // Rule: pattern="abc", left="x", right="y"
        Rule rule4 = new Rule("abc", "x", "y", new Rule.Phoneme("X", Languages.ANY_LANGUAGE));
        assertTrue(rule4.patternAndContextMatches("xabcy", 1));
        assertFalse(rule4.patternAndContextMatches("abc", 0)); // no context
        assertFalse(rule4.patternAndContextMatches("xabcz", 1)); // wrong right context
    }

    @Test
    public void testRuleGetters() throws Exception {
        Rule rule = new Rule("test", "left", "right", new Rule.Phoneme("X", Languages.ANY_LANGUAGE));
        assertEquals("test", rule.getPattern());
        assertNotNull(rule.getLContext());
        assertNotNull(rule.getRContext());
        assertEquals("X", rule.getPhoneme().getPhonemes().iterator().next().getPhonemeText());
    }

    @Test
    public void testRulePatternMethod() throws Exception {
        // The pattern() method is private and cannot be accessed directly from test methods.
        // Instead, we test the behavior of Rule construction which uses pattern() internally.
        // The testRulePatternAndContextMatches covers the usage of RPattern.
        Rule rule = new Rule("test", "abc", "def", new Rule.Phoneme("X", Languages.ANY_LANGUAGE));
        assertNotNull(rule.getLContext());
        assertNotNull(rule.getRContext());
    }

    @Test
    public void testRuleGetInstanceMap() throws Exception {
        // Test with a known resource
        Map<String, List<Rule>> rules = Rule.getInstanceMap(NameType.GENERIC, RuleType.RULES, "en");
        assertNotNull(rules);
        assertTrue(!rules.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRuleGetInstanceMapNonExistent() throws Exception {
        Rule.getInstanceMap(NameType.GENERIC, RuleType.RULES, "nonexistentlang");
    }
}
```