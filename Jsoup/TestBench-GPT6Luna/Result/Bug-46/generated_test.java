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
    public void testNamedAmpIsKnown() throws Exception {
        assertTrue(Entities.isNamedEntity("amp"));
    }

    @Test
    public void testNamedLtIsKnown() throws Exception {
        assertTrue(Entities.isNamedEntity("lt"));
    }

    @Test
    public void testNamedExtendedEntityIsKnown() throws Exception {
        assertTrue(Entities.isNamedEntity("euro"));
    }

    @Test
    public void testUnknownEntityIsNotKnown() throws Exception {
        assertFalse(Entities.isNamedEntity("notAnEntity"));
    }

    @Test
    public void testNameLookupCaseVariantIsKnown() throws Exception {
        assertTrue(Entities.isNamedEntity("AMP"));
    }

    @Test
    public void testBaseAmpIsKnown() throws Exception {
        assertTrue(Entities.isBaseNamedEntity("amp"));
    }

    @Test
    public void testBaseLtIsKnown() throws Exception {
        assertTrue(Entities.isBaseNamedEntity("lt"));
    }

    @Test
    public void testExtendedNameIsNotBaseEntity() throws Exception {
        assertFalse(Entities.isBaseNamedEntity("euro"));
    }

    @Test
    public void testUnknownNameIsNotBaseEntity() throws Exception {
        assertFalse(Entities.isBaseNamedEntity("notAnEntity"));
    }

    @Test
    public void testBaseEntityHasFullLookupValue() throws Exception {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
    }

    @Test
    public void testLessThanLookupValue() throws Exception {
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
    }

    @Test
    public void testGreaterThanLookupValue() throws Exception {
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
    }

    @Test
    public void testExtendedEntityLookupValue() throws Exception {
        assertEquals(Character.valueOf('\u20AC'), Entities.getCharacterByName("euro"));
    }

    @Test
    public void testUnknownNameLookupReturnsNull() throws Exception {
        assertNull(Entities.getCharacterByName("notAnEntity"));
    }

    @Test
    public void testCaseVariantLookupReturnsAmpersand() throws Exception {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("AMP"));
    }

    @Test
    public void testXhtmlMapContainsAmpMapping() throws Exception {
        assertEquals("amp", Entities.EscapeMode.xhtml.getMap().get(Character.valueOf('&')));
    }

    @Test
    public void testXhtmlMapContainsQuoteMapping() throws Exception {
        assertEquals("quot", Entities.EscapeMode.xhtml.getMap().get(Character.valueOf('"')));
    }

    @Test
    public void testXhtmlMapExcludesNbspCharacter() throws Exception {
        assertNull(Entities.EscapeMode.xhtml.getMap().get(Character.valueOf('\u00A0')));
    }

    @Test
    public void testBaseMapContainsAmpMapping() throws Exception {
        assertEquals("amp", Entities.EscapeMode.base.getMap().get(Character.valueOf('&')));
    }

    @Test
    public void testExtendedMapContainsEuroMapping() throws Exception {
        assertEquals("euro", Entities.EscapeMode.extended.getMap().get(Character.valueOf('\u20AC')));
    }

    @Test
    public void testEscapeModeMapsAreDistinct() throws Exception {
        assertNotSame(Entities.EscapeMode.xhtml.getMap(), Entities.EscapeMode.base.getMap());
        assertNotSame(Entities.EscapeMode.base.getMap(), Entities.EscapeMode.extended.getMap());
    }
}
