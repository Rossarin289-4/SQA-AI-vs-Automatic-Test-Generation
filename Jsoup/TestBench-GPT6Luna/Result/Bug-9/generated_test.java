package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntitiesTest {
    @Test
    public void xhtmlMapContainsFiveEscapingEntities() throws Exception {
        Map<Character, String> map = Entities.EscapeMode.xhtml.getMap();
        assertEquals(5, map.size());
        assertEquals("amp", map.get(Character.valueOf('&')));
        assertEquals("lt", map.get(Character.valueOf('<')));
        assertEquals("gt", map.get(Character.valueOf('>')));
        assertEquals("quot", map.get(Character.valueOf('"')));
        assertEquals("apos", map.get(Character.valueOf('\'')));
    }

    @Test
    public void xhtmlMapDoesNotContainUnconfiguredCharacters() throws Exception {
        assertFalse(Entities.EscapeMode.xhtml.getMap().containsKey(Character.valueOf('A')));
    }

    @Test
    public void baseMapHasExpectedSizeAndAmpersandName() throws Exception {
        Map<Character, String> map = Entities.EscapeMode.base.getMap();
        assertEquals(100, map.size());
        assertEquals("amp", map.get(Character.valueOf('&')));
    }

    @Test
    public void baseMapContainsLatinAndPunctuationMappings() throws Exception {
        Map<Character, String> map = Entities.EscapeMode.base.getMap();
        assertEquals("nbsp", map.get(Character.valueOf('\u00A0')));
        assertEquals("copy", map.get(Character.valueOf('\u00A9')));
        assertEquals("frac12", map.get(Character.valueOf('\u00BD')));
    }

    @Test
    public void baseMapDoesNotIncludeExtendedOnlyCharacter() throws Exception {
        assertFalse(Entities.EscapeMode.base.getMap().containsKey(Character.valueOf('\u03B1')));
    }

    @Test
    public void extendedMapHasExpectedSize() throws Exception {
        assertEquals(1446, Entities.EscapeMode.extended.getMap().size());
    }

    @Test
    public void extendedMapContainsGreekEntityMappings() throws Exception {
        Map<Character, String> map = Entities.EscapeMode.extended.getMap();
        assertEquals("alpha", map.get(Character.valueOf('\u03B1')));
        assertEquals("ohm", map.get(Character.valueOf('\u03A9')));
    }

    @Test
    public void extendedMapUsesLastNameForDuplicateCharacter() throws Exception {
        assertEquals("not", Entities.EscapeMode.extended.getMap().get(Character.valueOf('\u00AC')));
    }

    @Test
    public void extendedMapContainsLowestAsciiEntityCharacter() throws Exception {
        assertEquals("Tab", Entities.EscapeMode.extended.getMap().get(Character.valueOf('\t')));
    }

    @Test
    public void extendedMapContainsHighestBmpEntityCharacter() throws Exception {
        assertEquals("zwnj", Entities.EscapeMode.extended.getMap().get(Character.valueOf('\u200C')));
    }

    @Test
    public void modeMapsAreSeparateMutableMaps() throws Exception {
        Map<Character, String> xhtml = Entities.EscapeMode.xhtml.getMap();
        Map<Character, String> base = Entities.EscapeMode.base.getMap();
        Map<Character, String> extended = Entities.EscapeMode.extended.getMap();
        assertNotSame(xhtml, base);
        assertNotSame(base, extended);
        assertNotSame(xhtml, extended);
    }

    @Test
    public void getMapReturnsSameMapInstance() throws Exception {
        assertSame(Entities.EscapeMode.xhtml.getMap(), Entities.EscapeMode.xhtml.getMap());
    }
}
