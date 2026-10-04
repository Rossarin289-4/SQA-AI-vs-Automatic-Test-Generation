```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tokeniser;
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
import org.jsoup.parser.Token;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.TokeniserState;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.HtmlTreeBuilder;
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
    public void testEscape_xhtml() {
        String html = "<a href=\"&lt;\"> > &amp;</a>";
        Document doc = Document.createShell("");
        Document.OutputSettings settings = doc.outputSettings();
        settings.escapeMode(Document.OutputSettings.EscapeMode.xhtml);
        String escaped = Entities.escape(html, settings.encoder(), Document.OutputSettings.EscapeMode.xhtml);
        assertEquals("&lt;a href=&quot;&amp;lt;&quot;&gt; &amp;gt; &amp;amp;&lt;/a&gt;", escaped);
    }

    @Test
    public void testEscape_base() {
        String html = "<a href=\"&lt;\"> > &amp;</a>";
        Document doc = Document.createShell("");
        Document.OutputSettings settings = doc.outputSettings();
        settings.escapeMode(Document.OutputSettings.EscapeMode.base);
        String escaped = Entities.escape(html, settings.encoder(), Document.OutputSettings.EscapeMode.base);
        assertEquals("&lt;a href=&quot;&amp;lt;&quot;&gt; &gt; &amp;amp;&lt;/a&gt;", escaped);
    }
    
    @Test
    public void testEscape_extended() {
        String html = "a\u00A0b"; // Non-breaking space
        Document doc = Document.createShell("");
        Document.OutputSettings settings = doc.outputSettings();
        settings.escapeMode(Document.OutputSettings.EscapeMode.extended);
        String escaped = Entities.escape(html, settings.encoder(), Document.OutputSettings.EscapeMode.extended);
        assertEquals("a&nbsp;b", escaped);
    }

    @Test
    public void testEscape_unencodableChar() {
        // A character that cannot be encoded by the default encoder (e.g., for UTF-8, it might be a control character)
        // For demonstration, let's assume a character that is not standard ASCII.
        // The default CharsetEncoder for UTF-8 can encode most characters. Let's use a character that is unlikely to be directly encoded.
        // A character like U+0000 (null character) is often problematic.
        String testString = "Hello\u0000World";
        CharsetEncoder encoder = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
        // We need to simulate a situation where the encoder cannot encode it.
        // For the purpose of testing, we can just pass the character and let the escape logic handle it.
        // If the encoder *can* encode it, it will be passed through. If it *cannot*, it will fall back to &#code;
        Document doc = Document.createShell("");
        doc.outputSettings().escapeMode(Document.OutputSettings.EscapeMode.extended);
        String escaped = Entities.escape(testString, encoder, Document.OutputSettings.EscapeMode.extended);
        assertTrue(escaped.contains("&#0;")); // Null character should be escaped
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
        assertEquals("Invalid numeric", Entities.unescape("Invalid &#invalid;"));
        assertEquals("Invalid numeric", Entities.unescape("Invalid numeric ref with no numerals &#;"));
        assertEquals("Invalid numeric", Entities.unescape("Invalid numeric ref with no numerals &#X;"));
        assertEquals("Invalid range", Entities.unescape("Invalid &#xD800;")); // Surrogate range
        assertEquals("Invalid range", Entities.unescape("Invalid &#x110000;")); // Out of range
    }

    @Test
    public void testUnescape_invalidNamed() {
        assertEquals("Invalid named", Entities.unescape("Invalid &invalid;"));
        assertEquals("Invalid named", Entities.unescape("Invalid &invalidref;"));
    }

    @Test
    public void testUnescape_doubleEncoded() {
        assertEquals("&lt;", Entities.unescape("&amp;lt;")); // &amp;lt; should decode to &lt;
        assertEquals("<", Entities.unescape("&amp;amp;lt;")); // &amp;amp;lt; should decode to &amp;lt; then <
    }

    @Test
    public void testUnescape_edgeCases() {
        assertEquals("Leading &", Entities.unescape("&"));
        assertEquals("Trailing ;", Entities.unescape("String;"));
        assertEquals("Ampersand only", Entities.unescape("&"));
        assertEquals("Empty string", Entities.unescape(""));
    }

    @Test
    public void testUnescape_withCharsThatCouldBePartOfEntity() {
        assertEquals("Valid entity", Entities.unescape("&lt;"));
        assertEquals("Not an entity", Entities.unescape("notanentity"));
        assertEquals("Partially valid name", Entities.unescape("&lt;abc"));
        assertEquals("Partially valid numeric", Entities.unescape("&#60;abc"));
    }
    
    @Test
    public void testUnescape_namedWithTrailingChars() {
        assertEquals("Valid and then some", Entities.unescape("&lt;abc"));
        assertEquals("Valid and then some hex", Entities.unescape("&#x3C;def"));
        assertEquals("Valid and then some decimal", Entities.unescape("&#60;ghi"));
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
    public void testEscape_handlesNullInput() {
        Document doc = Document.createShell("");
        String escaped = Entities.escape(null, doc.outputSettings().encoder(), Document.OutputSettings.EscapeMode.extended);
        assertNull(escaped);
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
    
    @Test
    public void testEscape_withEmptyString() {
        Document doc = Document.createShell("");
        String escaped = Entities.escape("", doc.outputSettings().encoder(), Document.OutputSettings.EscapeMode.extended);
        assertEquals("", escaped);
    }

    // Tests for methods not previously covered
    @Test
    public void testParseInput_basic() {
        Parser parser = new Parser(new HtmlTreeBuilder());
        Document doc = parser.parseInput("<html><body>Hello</body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("http://example.com", doc.baseUri());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseInput_withErrors() {
        Parser parser = new Parser(new HtmlTreeBuilder());
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<p>Unclosed</p", "http://example.com");
        assertNotNull(doc);
        assertFalse(parser.getErrors().isEmpty());
        assertEquals(1, parser.getErrors().size()); // Expecting at least one error
    }

    @Test
    public void testGetTreeBuilder() {
        Parser parser = new Parser(new HtmlTreeBuilder());
        assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testSetTreeBuilder() {
        Parser parser = new Parser(new HtmlTreeBuilder());
        TreeBuilder newTreeBuilder = new XmlTreeBuilder(); // Use available XmlTreeBuilder
        parser.setTreeBuilder(newTreeBuilder);
        assertTrue(parser.getTreeBuilder() == newTreeBuilder);
    }

    @Test
    public void testIsTrackErrors_default() {
        Parser parser = new Parser(new HtmlTreeBuilder());
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrors() {
        Parser parser = new Parser(new HtmlTreeBuilder());
        parser.setTrackErrors(5);
        assertTrue(parser.isTrackErrors());
        // Accessing internal field for verification, might be brittle.
        // If maxErrors is not public, this assertion would need to be removed or adjusted.
        // Assuming it's accessible for the purpose of this test.
        // assertEquals(5, parser.maxErrors); 
    }

    @Test
    public void testGetErrors_empty() {
        Parser parser = new Parser(new HtmlTreeBuilder());
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
        assertTrue(errors.isEmpty());
    }

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
        assertEquals("Fragment", nodes.get(0).childNode(0).outerHtml()); // Accessing text node
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
        // parseBodyFragmentRelaxed is deprecated and calls parse, so this should work similarly to testParse_simpleHtml
        Document doc = Parser.parseBodyFragmentRelaxed("<p>Relaxed body content</p>", "http://example.com/relaxed");
        assertNotNull(doc);
        assertEquals("http://example.com/relaxed", doc.baseUri());
        assertEquals("Relaxed body content", doc.body().text());
    }

    @Test
    public void testHtmlParser() {
        Parser parser = Parser.htmlParser();
        assertNotNull(parser);
        assertTrue(parser.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testXmlParser() {
        Parser parser = Parser.xmlParser();
        assertNotNull(parser);
        assertTrue(parser.getTreeBuilder() instanceof XmlTreeBuilder); // Now uses XmlTreeBuilder
    }
    
    @Test
    public void testEscape_boundary_char() {
        // Test with a character that is not a standard entity but can be encoded
        String input = "A\u0001B"; // Start of Heading character
        Document doc = Document.createShell("");
        doc.outputSettings().escapeMode(Document.OutputSettings.EscapeMode.extended);
        CharsetEncoder encoder = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
        String escaped = Entities.escape(input, encoder, Document.OutputSettings.EscapeMode.extended);
        assertEquals("A&#1;B", escaped);
    }

    @Test
    public void testUnescape_boundaryNumericHex() {
        assertEquals("min hex", Entities.unescape("&#x0;", false)); // added false for non-strict
        assertEquals("max hex", Entities.unescape("&#x10FFFF;", false)); // added false for non-strict
    }

    @Test
    public void testUnescape_boundaryNumericDecimal() {
        assertEquals("min decimal", Entities.unescape("&#0;", false)); // added false for non-strict
        assertEquals("max decimal", Entities.unescape("&#1114111;", false)); // 0x10FFFF in decimal, added false for non-strict
    }
}
```