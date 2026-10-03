package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PhoneticEngineAI14Test {

    @Test
    public void testPhonemeBuilderEmptyAndMakeString() {
        final Languages.LanguageSet langSet = Languages.LanguageSet.from(new java.util.HashSet<String>(java.util.Arrays.asList("en")));
        final PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);
        assertNotNull(builder);
        assertTrue(builder.getPhonemes().size() > 0);
        assertNotNull(builder.makeString());
    }

    @Test
    public void testPhonemeBuilderAppend() {
        final Languages.LanguageSet langSet = Languages.LanguageSet.from(new java.util.HashSet<String>(java.util.Arrays.asList("en")));
        final PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);
        builder.append("test");
        assertTrue(builder.makeString().contains("test"));
    }

    @Test
    public void testPhonemeBuilderApply() {
        final Languages.LanguageSet langSet = Languages.LanguageSet.from(new java.util.HashSet<String>(java.util.Arrays.asList("en")));
        final PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);
        final Rule.Phoneme phoneme = new Rule.Phoneme("abc", langSet);
        final Rule.PhonemeExpr expr = new Rule.Phoneme(phoneme.getPhonemeText(), phoneme.getLanguages());
        builder.apply(expr, 10);
        assertNotNull(builder.makeString());
    }
}
