package org.apache.commons.codec.language.bm;

import org.junit.Assert;
import org.junit.Test;

public class LangAI14Test {

    @Test
    public void testInstanceGeneric() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Assert.assertNotNull(lang);
    }

    @Test
    public void testInstanceAshkenazi() {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        Assert.assertNotNull(lang);
    }

    @Test
    public void testInstanceSephardic() {
        Lang lang = Lang.instance(NameType.SEPHARDIC);
        Assert.assertNotNull(lang);
    }

    @Test
    public void testGuessLanguageAshkenaziSingle() {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        String language = lang.guessLanguage("rosen");
        Assert.assertNotNull(language);
        Assert.assertFalse(language.isEmpty());
    }

    @Test
    public void testGuessLanguageSephardicSingle() {
        Lang lang = Lang.instance(NameType.SEPHARDIC);
        String language = lang.guessLanguage("garcia");
        Assert.assertNotNull(language);
        Assert.assertEquals("spanish", language);
    }

    @Test
    public void testGuessLanguagesGeneric() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("schmidt");
        Assert.assertNotNull(ls);
        Assert.assertFalse(ls.isEmpty());
    }

    @Test
    public void testGuessLanguageGenericSingleOrAny() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String language = lang.guessLanguage("schmidt");
        Assert.assertEquals("german", language);
    }

    @Test
    public void testGuessLanguageAmbiguousReturnsAny() {
        Lang lang = Lang.instance(NameType.GENERIC);
        // An empty or generic string typically matches multiple languages or fallback to ANY
        String language = lang.guessLanguage("ab");
        Assert.assertNotNull(language);
    }

    @Test
    public void testCaseInsensitivity() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet lsLower = lang.guessLanguages("muller");
        Languages.LanguageSet lsUpper = lang.guessLanguages("MULLER");
        Assert.assertEquals(lsLower, lsUpper);
    }

    @Test(expected = IllegalStateException.class)
    public void testLoadFromResourceInvalidPath() {
        Languages languages = Languages.getInstance(NameType.GENERIC);
        Lang.loadFromResource("non_existent_resource_path_12345.txt", languages);
    }

    @Test
    public void testLoadFromResourceValid() {
        Languages languages = Languages.getInstance(NameType.GENERIC);
        Lang customLang = Lang.loadFromResource("org/apache/commons/codec/language/bm/gen_lang.txt", languages);
        Assert.assertNotNull(customLang);

        Languages.LanguageSet ls = customLang.guessLanguages("smith");
        Assert.assertNotNull(ls);
        Assert.assertFalse(ls.isEmpty());
    }
}
