package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharsetEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import java.util.ArrayList;

public class EntitiesTest {
    @Test
    public void testKnownBaseEntity() throws Exception {
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
    }

    @Test
    public void testUnknownName() throws Exception {
        assertFalse(Entities.isNamedEntity("notAName"));
        assertFalse(Entities.isBaseNamedEntity("notAName"));
        assertNull(Entities.getCharacterByName("notAName"));
    }

    @Test
    public void testExtendedEntity() throws Exception {
        assertTrue(Entities.isNamedEntity("Alpha"));
        assertFalse(Entities.isBaseNamedEntity("Alpha"));
        assertEquals(Character.valueOf('\u0391'), Entities.getCharacterByName("Alpha"));
    }

    @Test
    public void testEntityNameCaseSensitive() throws Exception {
        assertTrue(Entities.isNamedEntity("AMP"));
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("AMP"));
    }

    @Test
    public void testEntityEscapeModesExposeExpectedMappings() throws Exception {
        assertEquals("amp", Entities.EscapeMode.xhtml.getMap().get('&'));
        assertEquals("amp", Entities.EscapeMode.base.getMap().get('&'));
        assertEquals("amp", Entities.EscapeMode.extended.getMap().get('&'));
    }

    @Test
    public void testXhtmlEscapeMapHasFiveEntries() throws Exception {
        assertEquals(5, Entities.EscapeMode.xhtml.getMap().size());
    }

    @Test
    public void testBaseEscapeMapIncludesLessThan() throws Exception {
        assertEquals("lt", Entities.EscapeMode.base.getMap().get('<'));
    }

    @Test
    public void testExtendedEscapeMapIncludesLessThan() throws Exception {
        assertEquals("lt", Entities.EscapeMode.extended.getMap().get('<'));
    }

    @Test
    public void testExtendedEscapeMapContainsMoreThanXhtml() throws Exception {
        assertTrue(Entities.EscapeMode.extended.getMap().size() > Entities.EscapeMode.xhtml.getMap().size());
    }

    @Test
    public void testUnescapeSemicolonEntity() throws Exception {
        assertEquals("&", Parser.unescapeEntities("&amp;", false));
    }

    @Test
    public void testUnescapeOptionalSemicolon() throws Exception {
        assertEquals("&", Parser.unescapeEntities("&amp", false));
    }

    @Test
    public void testStrictUnescapeRequiresSemicolon() throws Exception {
        assertEquals("", Parser.unescapeEntities("&amp", true));
    }

    @Test
    public void testUnescapeDecimalCharacterReference() throws Exception {
        assertEquals("A", Parser.unescapeEntities("&#65;", false));
    }

    @Test
    public void testUnescapeHexCharacterReference() throws Exception {
        assertEquals("A", Parser.unescapeEntities("&#x41;", false));
    }

    @Test
    public void testUnescapePreservesUnknownEntity() throws Exception {
        assertEquals("&notAName;", Parser.unescapeEntities("&notAName;", false));
    }

    @Test
    public void testUnescapeOrdinaryText() throws Exception {
        assertEquals("plain text", Parser.unescapeEntities("plain text", false));
    }

    @Test
    public void testUnescapeNamedEntityInAttributeWithFollowingLetter() throws Exception {
        assertEquals("&ampx", Parser.unescapeEntities("&ampx", true));
    }

    @Test
    public void testUnescapeNamedEntityInAttributeWithoutFollowingLetter() throws Exception {
        assertEquals("&", Parser.unescapeEntities("&amp;", true));
    }

    @Test
    public void testHtmlParserInitiallyDoesNotTrackErrors() throws Exception {
        Parser parser = Parser.htmlParser();
        assertFalse(parser.isTrackErrors());
        assertNotNull(parser.getTreeBuilder());
    }

    @Test
    public void testSetTrackErrorsEnablesTracking() throws Exception {
        Parser parser = Parser.htmlParser();
        assertSame(parser, parser.setTrackErrors(1));
        assertTrue(parser.isTrackErrors());
        parser.parseInput("<p>", "");
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testSetTrackErrorsZeroDisablesTracking() throws Exception {
        Parser parser = Parser.htmlParser();
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
        parser.parseInput("<p>", "");
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testParseReturnsDocumentWithBodyText() throws Exception {
        Document doc = Parser.parse("<p>A</p>", "");
        assertEquals("A", doc.body().text());
    }

    @Test
    public void testParseFragmentReturnsOneNode() throws Exception {
        List<Node> nodes = Parser.parseFragment("plain", null, "");
        assertEquals(1, nodes.size());
        assertEquals("<html>\n <head></head>\n <body>plain</body>\n</html>", nodes.get(0).toString());
    }

    @Test
    public void testParseBodyFragmentPlacesContentInBody() throws Exception {
        Document doc = Parser.parseBodyFragment("<p>A</p>", "");
        assertEquals("A", doc.body().text());
    }

    @Test
    public void testRelaxedBodyFragmentParsesDocumentBody() throws Exception {
        Document doc = Parser.parseBodyFragmentRelaxed("<p>A</p>", "");
        assertEquals("A", doc.body().text());
    }

    @Test
    public void testXmlParserDoesNotTrackErrors() throws Exception {
        Parser parser = Parser.xmlParser();
        assertFalse(parser.isTrackErrors());
    }
}
