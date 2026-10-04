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
    public void testParseXmlPreservesElementCase() throws Exception {
        Document doc = Jsoup.parse("<Root><Child/></Root>", "", Parser.xmlParser());
        assertEquals("Root", doc.child(0).tagName());
        assertEquals("Child", doc.child(0).child(0).tagName());
    }

    @Test
    public void testParseXmlPreservesAttributeCase() throws Exception {
        Document doc = Jsoup.parse("<Root MixedCase='v'/>", "", Parser.xmlParser());
        assertEquals("v", doc.child(0).attr("MixedCase"));
        assertEquals("v", doc.child(0).attr("mixedcase"));
    }

    @Test
    public void testParseXmlUsesXmlOutputSyntax() throws Exception {
        Document doc = Jsoup.parse("<Root/>", "", Parser.xmlParser());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void testParseXmlKeepsText() throws Exception {
        Document doc = Jsoup.parse("<root>text</root>", "", Parser.xmlParser());
        assertEquals("text", doc.child(0).text());
    }

    @Test
    public void testParseXmlKeepsAdjacentText() throws Exception {
        Document doc = Jsoup.parse("<root>a&amp;b</root>", "", Parser.xmlParser());
        assertEquals("a&b", doc.child(0).text());
    }

    @Test
    public void testParseXmlKeepsComment() throws Exception {
        Document doc = Jsoup.parse("<root><!--note--></root>", "", Parser.xmlParser());
        assertEquals("#comment", doc.child(0).childNode(0).nodeName());
        assertEquals("note", ((Comment) doc.child(0).childNode(0)).getData());
    }

    @Test
    public void testParseXmlKeepsDoctype() throws Exception {
        Document doc = Jsoup.parse("<!DOCTYPE root><root/>", "", Parser.xmlParser());
        assertEquals("#doctype", doc.childNode(0).nodeName());
    }

    @Test
    public void testUnmatchedEndTagDoesNotRemoveRoot() throws Exception {
        Document doc = Jsoup.parse("<root></missing><child/></root>", "", Parser.xmlParser());
        assertEquals("child", doc.child(0).child(0).tagName());
    }

    @Test
    public void testEndTagClosesMatchingElement() throws Exception {
        Document doc = Jsoup.parse("<root><a></a><b/></root>", "", Parser.xmlParser());
        assertEquals(2, doc.child(0).children().size());
        assertEquals("b", doc.child(0).child(1).tagName());
    }

    @Test
    public void testNestedEndTagPopsThroughMatchingElement() throws Exception {
        Document doc = Jsoup.parse("<root><a><b></a><c/></root>", "", Parser.xmlParser());
        assertEquals(2, doc.child(0).children().size());
        assertEquals("c", doc.child(0).child(1).tagName());
    }

    @Test
    public void testSelfClosingUnknownTagHasNoChildren() throws Exception {
        Document doc = Jsoup.parse("<root><custom/></root>", "", Parser.xmlParser());
        assertEquals(0, doc.child(0).child(0).children().size());
    }

    @Test
    public void testSelfClosingElementDoesNotCaptureFollowingSibling() throws Exception {
        Document doc = Jsoup.parse("<root><a/><b/></root>", "", Parser.xmlParser());
        assertEquals(0, doc.child(0).child(0).children().size());
        assertEquals("b", doc.child(0).child(1).tagName());
    }

    @Test
    public void testEmptyInputHasNoElementChildren() throws Exception {
        Document doc = Jsoup.parse("", "", Parser.xmlParser());
        assertEquals(0, doc.children().size());
    }

    @Test
    public void testCdataContentIsPreserved() throws Exception {
        Document doc = Jsoup.parse("<root><![CDATA[a<b]]></root>", "", Parser.xmlParser());
        assertEquals("a<b", doc.child(0).text());
    }

    @Test
    public void testDeclarationIsParsedAsXmlDeclaration() throws Exception {
        Document doc = Jsoup.parse("<?xml version='1.0'?><root/>", "", Parser.xmlParser());
        assertEquals("#declaration", doc.childNode(0).nodeName());
    }
}
