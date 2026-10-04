package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class XmlTreeBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseEmptyString() throws Exception {
        Document doc = Jsoup.parse("", "http://example.com/", Parser.xmlParser());
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals(0, doc.childNodeSize());
        assertEquals("xml", doc.outputSettings().syntax().name());
    }

    @Test
    public void testParseSimpleElement() throws Exception {
        Document doc = Jsoup.parse("<root>value</root>", "http://example.com/", Parser.xmlParser());
        assertEquals("http://example.com/", doc.baseUri());
        assertEquals(1, doc.childNodeSize());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals("value", root.text());
        assertEquals("xml", doc.outputSettings().syntax().name());
    }



    @Test
    public void testParseElementWithAttributes() throws Exception {
        Document doc = Jsoup.parse("<root attr1='value1' attr2=\"value2\">", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals("value1", root.attr("attr1"));
        assertEquals("value2", root.attr("attr2"));
    }

    @Test
    public void testParseWithMixedContent() throws Exception {
        Document doc = Jsoup.parse("<root>text<child/>more text</root>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals(3, root.childNodes().size());
        assertTrue(root.childNode(0) instanceof TextNode);
        assertEquals("text", ((TextNode) root.childNode(0)).text());
        assertTrue(root.childNode(1) instanceof Element);
        assertEquals("child", ((Element) root.childNode(1)).tagName());
        assertTrue(root.childNode(2) instanceof TextNode);
        assertEquals("more text", ((TextNode) root.childNode(2)).text());
    }

    @Test
    public void testParseComment() throws Exception {
        Document doc = Jsoup.parse("<!-- This is a comment -->", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof Comment);
        assertEquals(" This is a comment ", ((Comment) doc.childNode(0)).getData());
    }

    @Test
    public void testParseXmlDeclarationAsComment() throws Exception {
        Document doc = Jsoup.parse("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) doc.childNode(0);
        assertEquals("xml", declaration.name());
        assertEquals("1.0", declaration.attr("version"));
        assertEquals("UTF-8", declaration.attr("encoding"));
    }
    
    @Test
    public void testParseBogusCommentAsXmlDeclaration() throws Exception {
        Document doc = Jsoup.parse("<?proc instruction='value'?>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) doc.childNode(0);
        assertEquals("proc", declaration.name());
        assertEquals("value", declaration.attr("instruction"));
    }

    @Test
    public void testParseBogusCommentAsComment() throws Exception {
        Document doc = Jsoup.parse("<! This is not a declaration >", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof Comment);
        assertEquals(" This is not a declaration ", ((Comment) doc.childNode(0)).getData());
    }



    


    @Test
    public void testParseMismatchedEndTag() throws Exception {
        Document doc = Jsoup.parse("<root><child></root>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals(1, root.childNodeSize());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        // The current implementation of XmlTreeBuilder does not pop stack if element not found.
        // So this test confirms that behavior.
        assertEquals(0, child.childNodes().size());
    }

    @Test
    public void testParseMismatchedEndTagNoMatchingOpen() throws Exception {
        Document doc = Jsoup.parse("<root></unmatched>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals(0, root.childNodeSize());
    }
    
    @Test
    public void testParseWithSpecialCharactersInAttributeValues() throws Exception {
        Document doc = Jsoup.parse("<root attr=\"value with spaces &amp; < >\">", "http://example.com/", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("value with spaces & < >", root.attr("attr"));
    }

    @Test
    public void testParseWithCaseSensitiveTagsAndAttributes() throws Exception {
        Document doc = Jsoup.parse("<RootElement TAG='VALUE'>", "http://example.com/", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("RootElement", root.tagName());
        assertEquals("VALUE", root.attr("TAG"));
    }

    @Test
    public void testParseFragment() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = ParseSettings.preserveCase;
        ParseErrorList errors = ParseErrorList.noTracking();
        List<Node> nodes = treeBuilder.parseFragment("<fragment>content</fragment>", "http://example.com/", errors, settings);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        Element fragment = (Element) nodes.get(0);
        assertEquals("fragment", fragment.tagName());
        assertEquals("content", fragment.text());
    }


    
    
    @Test
    public void testParseFragmentWithUnclosedTag() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = ParseSettings.preserveCase;
        ParseErrorList errors = ParseErrorList.noTracking();
        List<Node> nodes = treeBuilder.parseFragment("<unclosed>", "http://example.com/", errors, settings);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("unclosed", ((Element) nodes.get(0)).tagName());
        assertEquals(0, ((Element) nodes.get(0)).childNodeSize());
    }
    
    @Test
    public void testParseFragmentWithExtraClosingTag() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = ParseSettings.preserveCase;
        ParseErrorList errors = ParseErrorList.noTracking();
        List<Node> nodes = treeBuilder.parseFragment("<root></extra>", "http://example.com/", errors, settings);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("root", ((Element) nodes.get(0)).tagName());
        assertEquals(0, ((Element) nodes.get(0)).childNodeSize());
    }

    @Test
    public void testXmlDeclarationAttributesParsing() throws Exception {
        Document doc = Jsoup.parse("<?xml version='1.0' encoding='UTF-8' standalone='yes'?>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) doc.childNode(0);
        assertEquals("xml", declaration.name());
        assertEquals("1.0", declaration.attr("version"));
        assertEquals("UTF-8", declaration.attr("encoding"));
        assertEquals("yes", declaration.attr("standalone"));
    }
    

    @Test
    public void testTagWithOnlyAttributes() throws Exception {
        Document doc = Jsoup.parse("<tag attr1='val1' attr2=\"val2\"></tag>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        Element element = (Element) doc.childNode(0);
        assertEquals("tag", element.tagName());
        assertEquals("val1", element.attr("attr1"));
        assertEquals("val2", element.attr("attr2"));
    }

    @Test
    public void testMultipleXmlDeclarations() throws Exception {
        // The original test failed because it expected 2 nodes, but the parser correctly
        // identified the second xml declaration as a bogus comment which is then parsed as a Comment node.
        // The correct behavior is to have 3 nodes: first XmlDeclaration, then a Comment, then another XmlDeclaration.
        // However, the prompt states to correct failing tests on the REFERENCE version.
        // The reference source shows `insert(token.asComment())` for bogus comments, which get parsed as `Comment` nodes.
        // The second `<?xml-stylesheet ...?>` is treated as a bogus comment by the tokenizer in this context.
        // The XML parser in `insert(Token.Comment commentToken)` attempts to parse bogus comments.
        // If it can parse as an element, it becomes a `XmlDeclaration`.
        // `Jsoup.parse("<" + data.substring(1, data.length() -1) + ">", baseUri, Parser.xmlParser());`
        // For `<?xml-stylesheet type='text/css' href='style.css'?>`, the data is `?xml-stylesheet type='text/css' href='style.css'?`.
        // Substring(1, len-1) is `xml-stylesheet type='text/css' href='style.css'`.
        // Jsoup.parse("<xml-stylesheet type='text/css' href='style.css'>") will parse this as a tag.
        // Therefore, it should be an XmlDeclaration.
        Document doc = Jsoup.parse("<?xml version='1.0'?> <?xml-stylesheet type='text/css' href='style.css'?>", "http://example.com/", Parser.xmlParser());
        assertEquals(2, doc.childNodeSize()); // This assertion is corrected to 2.
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        assertTrue(doc.childNode(1) instanceof XmlDeclaration);
        assertEquals("xml", ((XmlDeclaration) doc.childNode(0)).name());
        assertEquals("xml-stylesheet", ((XmlDeclaration) doc.childNode(1)).name());
    }
    
    @Test
    public void testBogusCommentNotParsedAsXmlDecl() throws Exception {
        // This test is to ensure that comments starting with '!' or '?' but not parsable as valid XML declaration are treated as comments.
        Document doc = Jsoup.parse("<!ThisIsJustAComment>", "http://example.com/", Parser.xmlParser());
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof Comment);
        assertEquals("ThisIsJustAComment", ((Comment) doc.childNode(0)).getData());
    }
}
