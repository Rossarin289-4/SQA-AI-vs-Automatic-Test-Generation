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
    public void testParseSimpleXml() throws Exception {
        String xml = "<root>Some text</root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals("root", doc.child(0).nodeName());
        assertEquals("Some text", ((TextNode) doc.child(0).childNode(0)).text());
    }

    @Test
    public void testParseXmlWithAttributes() throws Exception {
        String xml = "<root attr1='value1' attr2=\"value2\">Text</root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("value1", root.attr("attr1"));
        assertEquals("value2", root.attr("attr2"));
        assertEquals("Text", ((TextNode) root.childNode(0)).text());
    }

    @Test
    public void testParseXmlWithNestedElements() throws Exception {
        String xml = "<root><child1><child2>Text</child2></child1></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Element child1 = (Element) root.childNode(0);
        Element child2 = (Element) child1.childNode(0);
        assertEquals("child1", child1.nodeName());
        assertEquals("child2", child2.nodeName());
        assertEquals("Text", ((TextNode) child2.childNode(0)).text());
    }

    @Test
    public void testParseXmlSelfClosingTag() throws Exception {
        String xml = "<root><child/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Element child = (Element) root.childNode(0);
        // isSelfClosing() is a method on Tag, not Element. Check the Tag.
        assertTrue(child.tag().isSelfClosing());
        assertEquals("child", child.nodeName());
    }

    @Test
    public void testParseXmlSelfClosingTagWithAttributes() throws Exception {
        String xml = "<root><child attr='value'/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Element child = (Element) root.childNode(0);
        // isSelfClosing() is a method on Tag, not Element. Check the Tag.
        assertTrue(child.tag().isSelfClosing());
        assertEquals("child", child.nodeName());
        assertEquals("value", child.attr("attr"));
    }

    @Test
    public void testParseXmlComment() throws Exception {
        String xml = "<root><!-- This is a comment --></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Comment comment = (Comment) root.childNode(0);
        assertEquals(" This is a comment ", comment.getData());
    }




    @Test
    public void testParseXmlDeclaration() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root/>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Node firstNode = doc.childNode(0);
        assertTrue(firstNode instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) firstNode;
        assertEquals("1.0", declaration.attr("version"));
        assertEquals("UTF-8", declaration.attr("encoding"));
        assertEquals("xml", declaration.name()); // name() is available on XmlDeclaration
    }


    @Test
    public void testParseXmlWithNamespace() throws Exception {
        String xml = "<root xmlns='http://example.com'><child xmlns:ns='http://ns.example.com' ns:attr='value'/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("http://example.com", root.attr("xmlns"));
        Element child = (Element) root.childNode(0);
        assertEquals("http://ns.example.com", child.attr("xmlns:ns"));
        assertEquals("value", child.attr("ns:attr"));
    }

    @Test
    public void testParseXmlWithMixedContent() throws Exception {
        String xml = "<root>Text1<child/>Text2</root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("Text1", ((TextNode) root.childNode(0)).text());
        assertTrue(root.childNode(1) instanceof Element);
        assertEquals("child", ((Element) root.childNode(1)).nodeName());
        assertEquals("Text2", ((TextNode) root.childNode(2)).text());
    }

    @Test
    public void testParseXmlWithEmptyRoot() throws Exception {
        String xml = "<root></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals("root", doc.child(0).nodeName());
        assertEquals(0, doc.child(0).childNodes().size());
    }

    @Test
    public void testParseXmlWithEmptyRootSelfClosing() throws Exception {
        String xml = "<root/>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        // isSelfClosing() is a method on Tag, not Element. Check the Tag.
        assertTrue(root.tag().isSelfClosing());
        assertEquals("root", root.nodeName());
    }

    @Test
    public void testParseXmlWhitespacePreservation() throws Exception {
        String xml = "<root>\n  <child>\n    Text\n  </child>\n</root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("\n  ", ((TextNode) root.childNode(0)).text());
        Element child = (Element) root.childNode(1);
        assertEquals("\n    ", ((TextNode) child.childNode(0)).text());
        assertEquals("\n  ", ((TextNode) child.childNode(1)).text());
    }

    @Test
    public void testParseFragmentWithOneElement() throws Exception {
        String fragment = "<item>Value</item>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        List<Node> nodes = tb.parseFragment(fragment, "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(1, nodes.size());
        Element item = (Element) nodes.get(0);
        assertEquals("item", item.nodeName());
        assertEquals("Value", ((TextNode) item.childNode(0)).text());
    }

    @Test
    public void testParseFragmentWithMultipleElements() throws Exception {
        String fragment = "<item1>Val1</item1><item2>Val2</item2>";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        List<Node> nodes = tb.parseFragment(fragment, "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(2, nodes.size());
        Element item1 = (Element) nodes.get(0);
        Element item2 = (Element) nodes.get(1);
        assertEquals("item1", item1.nodeName());
        assertEquals("Val1", ((TextNode) item1.childNode(0)).text());
        assertEquals("item2", item2.nodeName());
        assertEquals("Val2", ((TextNode) item2.childNode(0)).text());
    }

    @Test
    public void testParseFragmentWithText() throws Exception {
        String fragment = "Some text";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        List<Node> nodes = tb.parseFragment(fragment, "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(1, nodes.size());
        assertEquals("Some text", ((TextNode) nodes.get(0)).text());
    }

    @Test
    public void testParseFragmentWithMixedContent() throws Exception {
        String fragment = "Before<data>Value</data>After";
        XmlTreeBuilder tb = new XmlTreeBuilder();
        List<Node> nodes = tb.parseFragment(fragment, "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(3, nodes.size());
        assertEquals("Before", ((TextNode) nodes.get(0)).text());
        Element data = (Element) nodes.get(1);
        assertEquals("data", data.nodeName());
        assertEquals("Value", ((TextNode) data.childNode(0)).text());
        assertEquals("After", ((TextNode) nodes.get(2)).text());
    }





    @Test
    public void testParseUnknownTagAsSelfClosing() throws Exception {
        String xml = "<unknown/>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element unknown = doc.child(0);
        assertEquals("unknown", unknown.nodeName());
        // isSelfClosing() is a method on Tag, not Element. Check the Tag.
        assertTrue(unknown.tag().isSelfClosing());
        assertTrue(unknown.tag().isSelfClosing()); // Tag should be marked as self-closing
    }

    @Test
    public void testParseUnknownTagNotSelfClosing() throws Exception {
        String xml = "<unknown></unknown>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element unknown = doc.child(0);
        assertEquals("unknown", unknown.nodeName());
        // isSelfClosing() is a method on Tag, not Element. Check the Tag.
        assertFalse(unknown.tag().isSelfClosing());
        assertFalse(unknown.tag().isSelfClosing()); // Tag should NOT be marked as self-closing
    }

    @Test
    public void testParseWithEmptyStringInput() throws Exception {
        String xml = "";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals(0, doc.childNodes().size());
    }

    @Test
    public void testParseWithWhitespaceInput() throws Exception {
        String xml = "   \n ";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertEquals(1, doc.childNodes().size());
        assertEquals("   \n ", ((TextNode) doc.childNode(0)).text());
    }

    @Test
    public void testParseXmlWithBogusCommentData() throws Exception {
        String xml = "<root><!-- ? This is not an XML declaration --></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Comment comment = (Comment) root.childNode(0);
        assertEquals(" ? This is not an XML declaration ", comment.getData());
    }

    @Test
    public void testParseXmlWithValidXmlDeclarationAsComment() throws Exception {
        String xml = "<root><?xml version=\"1.0\"?></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Node declarationNode = root.childNode(0);
        assertTrue(declarationNode instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) declarationNode;
        assertEquals("xml", declaration.name());
        assertEquals("1.0", declaration.attr("version"));
    }

}
