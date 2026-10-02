package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class LangAI14Test {

    @Test
    public void testInstanceNotNull() {
        for (final NameType nameType : NameType.values()) {
            final Lang lang = Lang.instance(nameType);
            assertNotNull(lang);
        }
    }

    @Test
    public void testInstanceCaching() {
        for (final NameType nameType : NameType.values()) {
            final Lang lang1 = Lang.instance(nameType);
            final Lang lang2 = Lang.instance(nameType);
            assertNotNull(lang1);
            assertNotNull(lang2);
            org.junit.Assert.assertSame(lang1, lang2);
        }
    }

    @Test
    public void testGuessLanguagesBasic() {
        final Lang lang = Lang.instance(NameType.ASHKENAZI);
        assertNotNull(lang);
        final Languages.LanguageSet languageSet = lang.guessLanguages("test");
        assertNotNull(languageSet);
    }
}
