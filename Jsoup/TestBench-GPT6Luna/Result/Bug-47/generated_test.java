package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.parser.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharsetEncoder;
import java.util.*;

public class EntitiesTest {
    @Test
    public void testAmpIsNamed() throws Exception {
        assertTrue(Entities.isNamedEntity("amp"));
    }

    @Test
    public void testAmpIsBaseNamed() throws Exception {
        assertTrue(Entities.isBaseNamedEntity("amp"));
    }

    @Test
    public void testAmpCharacter() throws Exception {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
    }

    @Test
    public void testLtCharacter() throws Exception {
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
    }

    @Test
    public void testGtCharacter() throws Exception {
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
    }

    @Test
    public void testQuotCharacter() throws Exception {
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
    }

    @Test
    public void testUnknownNameIsNotNamed() throws Exception {
        assertFalse(Entities.isNamedEntity("not-an-entity"));
    }

    @Test
    public void testUnknownNameIsNotBaseNamed() throws Exception {
        assertFalse(Entities.isBaseNamedEntity("not-an-entity"));
    }

    @Test
    public void testUnknownNameHasNoCharacter() throws Exception {
        assertNull(Entities.getCharacterByName("not-an-entity"));
    }

    @Test
    public void testBaseOnlyName() throws Exception {
        assertTrue(Entities.isBaseNamedEntity("nbsp"));
    }

    @Test
    public void testBaseOnlyCharacter() throws Exception {
        assertEquals(Character.valueOf('\u00a0'), Entities.getCharacterByName("nbsp"));
    }

    @Test
    public void testExtendedEntityIsNamed() throws Exception {
        assertTrue(Entities.isNamedEntity("euro"));
    }

    @Test
    public void testExtendedEntityIsNotBaseNamed() throws Exception {
        assertFalse(Entities.isBaseNamedEntity("euro"));
    }

    @Test
    public void testExtendedEntityCharacter() throws Exception {
        assertEquals(Character.valueOf('\u20ac'), Entities.getCharacterByName("euro"));
    }

    @Test
    public void testNameMatchingIsCaseSensitive() throws Exception {
        assertTrue(Entities.isNamedEntity("AMP"));
    }

    @Test
    public void testCaseMismatchHasNoCharacter() throws Exception {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("AMP"));
    }

    @Test
    public void testNullNameIsNotNamed() throws Exception {
        assertFalse(Entities.isNamedEntity(null));
    }

    @Test
    public void testNullNameIsNotBaseNamed() throws Exception {
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    @Test
    public void testNullNameHasNoCharacter() throws Exception {
        assertNull(Entities.getCharacterByName(null));
    }

    @Test
    public void testXhtmlEscapeMap() throws Exception {
        Map<Character, String> map = Entities.EscapeMode.xhtml.getMap();
        assertEquals("lt", map.get(Character.valueOf('<')));
        assertEquals("gt", map.get(Character.valueOf('>')));
        assertEquals("amp", map.get(Character.valueOf('&')));
        assertEquals("quot", map.get(Character.valueOf('"')));
        assertEquals(4, map.size());
    }

    @Test
    public void testBaseEscapeMapHasAmp() throws Exception {
        assertEquals("amp", Entities.EscapeMode.base.getMap().get(Character.valueOf('&')));
    }

    @Test
    public void testExtendedEscapeMapHasEuro() throws Exception {
        assertEquals("euro", Entities.EscapeMode.extended.getMap().get(Character.valueOf('\u20ac')));
    }
}
