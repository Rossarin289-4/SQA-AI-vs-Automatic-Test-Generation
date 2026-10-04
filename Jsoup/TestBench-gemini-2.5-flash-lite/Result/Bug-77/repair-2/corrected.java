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
        assertEquals("Some text", doc.child(0).childNode(0).outerHtml());
    }

    @Test
    public void testParseXmlWithAttributes() throws Exception {
        String xml = "<root attr1='value1' attr2=\"value2\">Text</root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        assertEquals("value1", root.attr("attr1"));
        assertEquals("value2", root.attr("attr2"));
        assertEquals("Text", root.childNode(0).outerHtml());
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
        assertEquals("Text", child2.childNode(0).outerHtml());
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
    public void testParseXmlCData() throws Exception {
        String xml = "<root><![CDATA[<p>CDATA content</p>]]></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        CDataNode cdata = (CDataNode) root.childNode(0);
        // getData() is a valid method on CDataNode.
        assertEquals("<p>CDATA content</p>", cdata.getData());
    }

    @Test
    public void testParseXmlDoctype() throws Exception {
        String xml = "<!DOCTYPE html SYSTEM \"about:legacy-compat\"><html><body></body></html>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        DocumentType doctype = (DocumentType) doc.childNode(0);
        // Use getname(), getPublicIdentifier(), getSystemIdentifier(), getPubSysKey()
        assertEquals("html", doctype.getname());
        assertEquals("about:legacy-compat", doctype.getSystemIdentifier());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("SYSTEM", doctype.getPubSysKey());
    }

    @Test
    public void testParseXmlDoctypeNoSystem() throws Exception {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"><html><body></body></html>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        DocumentType doctype = (DocumentType) doc.childNode(0);
        // Use getname(), getPublicIdentifier(), getSystemIdentifier(), getPubSysKey()
        assertEquals("html", doctype.getname());
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertEquals("PUBLIC", doctype.getPubSysKey());
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
        assertTrue(root.childNode(0) instanceof TextNode);
        assertEquals("\n  ", ((TextNode) root.childNode(0)).text());
        assertTrue(root.childNode(1) instanceof Element);
        Element child = (Element) root.childNode(1);
        assertTrue(child.childNode(0) instanceof TextNode);
        assertEquals("\n    ", ((TextNode) child.childNode(0)).text());
        assertTrue(child.childNode(1) instanceof TextNode);
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
        assertEquals("Value", item.childNode(0).outerHtml());
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
        assertEquals("Val1", item1.childNode(0).outerHtml());
        assertEquals("item2", item2.nodeName());
        assertEquals("Val2", item2.childNode(0).outerHtml());
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
        assertEquals("Value", data.childNode(0).outerHtml());
        assertEquals("After", ((TextNode) nodes.get(2)).text());
    }

    @Test
    public void testPopStackToCloseMatchingTag() throws Exception {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        tb.initialiseParse(new StringReader("<root><child>Text</child></root>"), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        
        Token.StartTag rootStart = new Token.StartTag().nameAttr("root", new Attributes());
        tb.process(rootStart);
        Token.StartTag childStart = new Token.StartTag().nameAttr("child", new Attributes());
        tb.process(childStart);
        Token.Character text = new Token.Character();
        text.data("Text");
        tb.process(text);
        // EndTag has no nameAttr method, use name setter
        Token.EndTag childEnd = new Token.EndTag(); childEnd.nameAttr("child");
        tb.process(childEnd);

        Element root = (Element) tb.doc.childNode(0);
        assertEquals(1, root.childNodes().size());
        Element child = (Element) root.childNode(0);
        assertEquals("child", child.nodeName());
        assertEquals("Text", child.childNode(0).outerHtml());
    }

    @Test
    public void testPopStackToCloseNonMatchingTag() throws Exception {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        tb.initialiseParse(new StringReader("<root><child></root>"), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.StartTag rootStart = new Token.StartTag().nameAttr("root", new Attributes());
        tb.process(rootStart);
        Token.StartTag childStart = new Token.StartTag().nameAttr("child", new Attributes());
        tb.process(childStart);
        // EndTag has no nameAttr method, use name setter
        Token.EndTag wrongEnd = new Token.EndTag(); wrongEnd.nameAttr("wrong");
        tb.process(wrongEnd);
        Token.EndTag rootEnd = new Token.EndTag(); rootEnd.nameAttr("root");
        tb.process(rootEnd);

        assertEquals(1, tb.doc.childNodes().size());
        Element root = (Element) tb.doc.childNode(0);
        assertEquals("root", root.nodeName());
        assertEquals(0, root.childNodes().size()); // child should not have been closed.
    }

    @Test
    public void testPopStackToCloseNestedMatchingTag() throws Exception {
        XmlTreeBuilder tb = new XmlTreeBuilder();
        tb.initialiseParse(new StringReader("<root><parent><child>Text</child></parent></root>"), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.StartTag rootStart = new Token.StartTag().nameAttr("root", new Attributes());
        tb.process(rootStart);
        Token.StartTag parentStart = new Token.StartTag().nameAttr("parent", new Attributes());
        tb.process(parentStart);
        Token.StartTag childStart = new Token.StartTag().nameAttr("child", new Attributes());
        tb.process(childStart);
        Token.Character text = new Token.Character();
        text.data("Text");
        tb.process(text);
        // EndTag has no nameAttr method, use name setter
        Token.EndTag childEnd = new Token.EndTag(); childEnd.nameAttr("child");
        tb.process(childEnd);
        Token.EndTag parentEnd = new Token.EndTag(); parentEnd.nameAttr("parent");
        tb.process(parentEnd);
        Token.EndTag rootEnd = new Token.EndTag(); rootEnd.nameAttr("root");
        tb.process(rootEnd);

        Element root = (Element) tb.doc.childNode(0);
        Element parent = (Element) root.childNode(0);
        Element child = (Element) parent.childNode(0);
        assertEquals("parent", parent.nodeName());
        assertEquals("child", child.nodeName());
        assertEquals("Text", child.childNode(0).outerHtml());
    }

    @Test
    public void testInsertNode_whenStackHasDocument() throws Exception {
        XmlTreeBuilder tbForDocAppend = new XmlTreeBuilder();
        tbForDocAppend.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        
        // Test case: insert a node directly into the document when it's the current element
        // This is usually done by inserting a comment or text directly at the root level.
        // The process method handles this. Let's simulate that.
        Token.Comment comment = new Token.Comment();
        comment.data("Test comment");
        // We need to ensure that `currentElement()` returns the document.
        // `initialiseParse` adds the document to the stack, but then the first StartTag would make it `currentElement`.
        // If we add a comment *before* any start tag, it should go to the document.
        
        // Re-initialize to ensure clean state
        tbForDocAppend = new XmlTreeBuilder();
        tbForDocAppend.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        
        // The `process` method is called from the public `parse` methods.
        // To test `insertNode` when `currentElement()` is `doc`, we need a scenario where no elements are on the stack above `doc`.
        // However, the `XmlTreeBuilder`'s `process` method specifically calls `insert` which uses `currentElement().appendChild(node)`.
        // If the stack is just `[doc]`, `currentElement()` will be `doc`.
        // Let's try to parse just a comment.
        Document doc = Jsoup.parse("<!-- Test comment -->", "", Parser.xmlParser());
        assertEquals(1, doc.childNodes().size());
        assertTrue(doc.childNode(0) instanceof Comment);
        assertEquals("Test comment", ((Comment) doc.childNode(0)).getData());
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

    @Test
    public void testParseXmlWithDtdDeclarationAsComment() throws Exception {
        String xml = "<root><!DOCTYPE html></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        Element root = doc.child(0);
        Node declarationNode = root.childNode(0);
        assertTrue(declarationNode instanceof DocumentType); // It's a DocumentType, not XmlDeclaration
        DocumentType doctype = (DocumentType) declarationNode;
        assertEquals("html", doctype.getname());
    }
}
