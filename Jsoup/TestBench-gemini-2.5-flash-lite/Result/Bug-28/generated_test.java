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
import org.jsoup.parser.XmlTreeBuilder; // Added import for XmlTreeBuilder

public class EntitiesTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testIsNamedEntity() {
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("quot"));
        assertTrue(Entities.isNamedEntity("apos"));
        assertFalse(Entities.isNamedEntity("invalid"));
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsBaseNamedEntity() {
        assertTrue(Entities.isBaseNamedEntity("lt"));
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("gt"));
        assertTrue(Entities.isBaseNamedEntity("quot"));
        assertTrue(Entities.isBaseNamedEntity("apos"));
        assertFalse(Entities.isBaseNamedEntity("nbsp")); // nbsp is in extended, not base
        assertFalse(Entities.isBaseNamedEntity("invalid"));
        assertFalse(Entities.isBaseNamedEntity(""));
    }

    @Test
    public void testGetCharacterByName_base() {
        assertEquals((Character)'<', Entities.getCharacterByName("lt"));
        assertEquals((Character)'&', Entities.getCharacterByName("amp"));
        assertEquals((Character)'>', Entities.getCharacterByName("gt"));
        assertEquals((Character)'"', Entities.getCharacterByName("quot"));
        assertEquals((Character)'\'', Entities.getCharacterByName("apos"));
        assertNull(Entities.getCharacterByName("nbsp")); // Not in base
    }

    @Test
    public void testGetCharacterByName_extended() {
        assertEquals((Character)' ', Entities.getCharacterByName("nbsp"));
        assertEquals((Character)'©', Entities.getCharacterByName("copy"));
        assertEquals((Character)'€', Entities.getCharacterByName("euro"));
        assertEquals((Character)'™', Entities.getCharacterByName("trade"));
        assertNull(Entities.getCharacterByName("invalid"));
    }

    @Test
    public void testGetCharacterByName_caseInsensitive() {
        assertEquals((Character)'<', Entities.getCharacterByName("Lt"));
        assertEquals((Character)'&', Entities.getCharacterByName("AMP"));
        assertEquals((Character)'>', Entities.getCharacterByName("Gt"));
    }


    


    @Test
    public void testUnescape_basic() {
        assertEquals("String with < tags", Entities.unescape("String with &lt; tags"));
        assertEquals("String with \"quotes\"", Entities.unescape("String with &quot;quotes&quot;"));
        assertEquals("String with & and '", Entities.unescape("String with &amp; and &apos;"));
    }

    @Test
    public void testUnescape_numericDecimal() {
        assertEquals("String with <", Entities.unescape("String with &#60;"));
        assertEquals("String with €", Entities.unescape("String with &#8364;"));
    }

    @Test
    public void testUnescape_numericHex() {
        assertEquals("String with <", Entities.unescape("String with &#x3C;"));
        assertEquals("String with €", Entities.unescape("String with &#x20AC;"));
        assertEquals("String with <", Entities.unescape("String with &#X3c;"));
    }

    @Test
    public void testUnescape_strict() {
        assertEquals("No semicolon", Entities.unescape("No semicolon", true)); // strict, no semicolon should not parse
        assertEquals("<tag", Entities.unescape("&lt;tag", true)); // strict, with semicolon
        assertEquals("<tag", Entities.unescape("&lt;tag;", true)); // strict, with semicolon
    }

    @Test
    public void testUnescape_nonStrict() {
        assertEquals("No semicolon", Entities.unescape("No semicolon", false)); // non-strict, no semicolon should parse
        assertEquals("<tag", Entities.unescape("&lt;tag", false)); // non-strict, no semicolon should parse
        assertEquals("<tag", Entities.unescape("&lt;tag;", false)); // non-strict, with semicolon
    }

    @Test
    public void testUnescape_invalidNumeric() {
        assertEquals("Invalid &#invalid;", Entities.unescape("Invalid &#invalid;")); // This case should not unescape
        assertEquals("Invalid numeric ref with no numerals &#;", Entities.unescape("Invalid numeric ref with no numerals &#;"));
        assertEquals("Invalid numeric ref with no numerals &#X;", Entities.unescape("Invalid numeric ref with no numerals &#X;"));
        assertEquals("Invalid &#xD800;", Entities.unescape("Invalid &#xD800;")); // Surrogate range
        assertEquals("Invalid &#x110000;", Entities.unescape("Invalid &#x110000;")); // Out of range
    }

    @Test
    public void testUnescape_invalidNamed() {
        assertEquals("Invalid &invalid;", Entities.unescape("Invalid &invalid;")); // This case should not unescape
        assertEquals("Invalid &invalidref;", Entities.unescape("Invalid &invalidref;")); // This case should not unescape
    }

    @Test
    public void testUnescape_doubleEncoded() {
        assertEquals("&lt;", Entities.unescape("&amp;lt;")); // &amp;lt; should decode to &lt;
        assertEquals("&amp;lt;", Entities.unescape("&amp;amp;lt;")); // &amp;amp;lt; should decode to &amp;lt;
    }

    @Test
    public void testUnescape_edgeCases() {
        assertEquals("&", Entities.unescape("&")); // Lone ampersand
        assertEquals("String;", Entities.unescape("String;")); // String with semicolon, not an entity
        assertEquals("&", Entities.unescape("&")); // Ampersand only
        assertEquals("", Entities.unescape("")); // Empty string
    }

    @Test
    public void testUnescape_withCharsThatCouldBePartOfEntity() {
        assertEquals("<", Entities.unescape("&lt;"));
        assertEquals("notanentity", Entities.unescape("notanentity"));
        assertEquals("<abc", Entities.unescape("&#60;abc")); // Numeric entity followed by text
        assertEquals("<abc", Entities.unescape("&#x3C;abc")); // Hex entity followed by text
        assertEquals("&lt;abc", Entities.unescape("&lt;abc")); // Named entity followed by text, no semicolon
    }
    
    @Test
    public void testUnescape_namedWithTrailingChars() {
        assertEquals("<abc", Entities.unescape("&lt;abc", false)); // Non-strict, named entity with text
        assertEquals("<def", Entities.unescape("&#x3C;def", false)); // Non-strict, hex entity with text
        assertEquals("<ghi", Entities.unescape("&#60;ghi", false)); // Non-strict, decimal entity with text
    }

    @Test
    public void testGetMap_xhtml() {
        Map<Character, String> map = Entities.EscapeMode.xhtml.getMap();
        assertEquals(5, map.size());
        assertEquals("&quot;", "&" + map.get('"') + ";");
        assertEquals("&amp;", "&" + map.get('&') + ";");
        assertEquals("&apos;", "&" + map.get('\'') + ";");
        assertEquals("&lt;", "&" + map.get('<') + ";");
        assertEquals("&gt;", "&" + map.get('>') + ";");
    }

    @Test
    public void testGetMap_base() {
        Map<Character, String> map = Entities.EscapeMode.base.getMap();
        assertTrue(map.size() > 5); // Should contain more than xhtml
        assertEquals("&quot;", "&" + map.get('"') + ";");
        assertEquals("&amp;", "&" + map.get('&') + ";");
        assertEquals("&apos;", "&" + map.get('\'') + ";");
        assertEquals("&lt;", "&" + map.get('<') + ";");
        assertEquals("&gt;", "&" + map.get('>') + ";");
        assertEquals("&nbsp;", "&" + map.get((char) 160) + ";"); // Non-breaking space
    }

    @Test
    public void testGetMap_extended() {
        Map<Character, String> map = Entities.EscapeMode.extended.getMap();
        assertTrue(map.size() > Entities.EscapeMode.base.getMap().size()); // Should contain more than base
        assertEquals("&nbsp;", "&" + map.get((char) 160) + ";");
        assertEquals("&euro;", "&" + map.get((char) 8364) + ";"); // Euro sign
        assertEquals("&copy;", "&" + map.get((char) 169) + ";"); // Copyright sign
        assertEquals("&trade;", "&" + map.get((char) 8482) + ";"); // Trade mark sign
    }


    @Test
    public void testUnescape_handlesNullInput() {
        String unescaped = Entities.unescape(null);
        assertNull(unescaped);
    }

    @Test
    public void testUnescape_handlesEmptyString() {
        assertEquals("", Entities.unescape(""));
        assertEquals("", Entities.unescape("", true));
        assertEquals("", Entities.unescape("", false));
    }
    

    // Tests for methods from Parser class







    @Test
    public void testParse_simpleHtml() {
        Document doc = Parser.parse("<div>Just text</div>", "http://example.com/page");
        assertNotNull(doc);
        assertEquals("http://example.com/page", doc.baseUri());
        assertEquals("Just text", doc.body().text());
    }

    @Test
    public void testParseFragment_simple() {
        Element body = Document.createShell("http://example.com").body();
        List<Node> nodes = Parser.parseFragment("<span>Fragment</span>", body, "http://example.com");
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("span", nodes.get(0).nodeName());
        assertEquals("Fragment", nodes.get(0).childNode(0).outerHtml()); 
    }

    @Test
    public void testParseBodyFragment_simple() {
        Document doc = Parser.parseBodyFragment("<p>Body content</p>", "http://example.com/doc");
        assertNotNull(doc);
        assertEquals("http://example.com/doc", doc.baseUri());
        assertEquals("Body content", doc.body().text());
        assertTrue(doc.head().childNodes().isEmpty());
    }

    @Test
    public void testUnescapeEntities_attribute() {
        String escaped = "&lt;";
        String unescaped = Parser.unescapeEntities(escaped, true);
        assertEquals("<", unescaped);
    }

    @Test
    public void testUnescapeEntities_html() {
        String escaped = "&lt;";
        String unescaped = Parser.unescapeEntities(escaped, false);
        assertEquals("<", unescaped);
    }
    
    @Test
    public void testParseBodyFragmentRelaxed_simple() {
        Document doc = Parser.parseBodyFragmentRelaxed("<p>Relaxed body content</p>", "http://example.com/relaxed");
        assertNotNull(doc);
        assertEquals("http://example.com/relaxed", doc.baseUri());
        assertEquals("Relaxed body content", doc.body().text());
    }


    @Test
    public void testXmlParser() {
        Parser parser = Parser.xmlParser();
        assertNotNull(parser);
        assertTrue(parser.getTreeBuilder() instanceof XmlTreeBuilder); 
    }
    

    @Test
    public void testUnescape_boundaryNumericHex() {
        assertEquals("\u0000", Entities.unescape("&#x0;", false));
        assertEquals("\uD7FF", Entities.unescape("&#xD7FF;", false)); // Max value before surrogates
        assertEquals("\uE000", Entities.unescape("&#xE000;", false)); // Min value after surrogates
        assertEquals("\u10FFFF", Entities.unescape("&#x10FFFF;", false)); // Max unicode value
    }

    @Test
    public void testUnescape_boundaryNumericDecimal() {
        assertEquals("\u0000", Entities.unescape("&#0;", false));
        assertEquals("\uD7FF", Entities.unescape("&#21503;", false)); // Max value before surrogates
        assertEquals("\uE000", Entities.unescape("&#57344;", false)); // Min value after surrogates
        assertEquals("\u10FFFF", Entities.unescape("&#1114111;", false)); // Max unicode value
    }
}


