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
    @Test
    public void testSingleRootElement() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<root/>", "");
        assertEquals(1, doc.childNodeSize());
        assertEquals("root", doc.child(0).nodeName());
    }

    @Test
    public void testNestedElements() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<root><child/></root>", "");
        assertEquals("root", doc.child(0).nodeName());
        assertEquals(1, doc.child(0).childNodeSize());
    }

    @Test
    public void testSiblingElements() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<a/><b/>", "");
        assertEquals(2, doc.childNodeSize());
        assertEquals("b", doc.child(1).nodeName());
    }

    @Test
    public void testUnmatchedEndTagIsSkipped() throws Exception {
        Document doc = new XmlTreeBuilder().parse("</missing><root/>", "");
        assertEquals(1, doc.childNodeSize());
        assertEquals("root", doc.child(0).nodeName());
    }

    @Test
    public void testEndTagClosesMatchingNestedElement() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<root><child></child><next/></root>", "");
        assertEquals("root", doc.child(0).nodeName());
        assertEquals(2, doc.child(0).childNodeSize());
    }

    @Test
    public void testEndTagPopsThroughNestedElements() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<root><child></root><next/>", "");
        assertEquals(2, doc.childNodeSize());
        assertEquals("next", doc.child(1).nodeName());
    }

    @Test
    public void testNamesPreserveCase() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<Root><Child/></Root>", "");
        assertEquals("Root", doc.child(0).nodeName());
        assertEquals("Child", doc.child(0).child(0).nodeName());
    }

    @Test
    public void testSelfClosingRootAllowsFollowingSibling() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<first/><second/>", "");
        assertEquals(2, doc.childNodeSize());
        assertEquals("second", doc.child(1).nodeName());
    }

    @Test
    public void testExplicitlyClosedRootAllowsFollowingSibling() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<first></first><second/>", "");
        assertEquals(2, doc.childNodeSize());
        assertEquals("second", doc.child(1).nodeName());
    }

    @Test
    public void testEmptyInputHasNoChildren() throws Exception {
        Document doc = new XmlTreeBuilder().parse("", "");
        assertEquals(0, doc.childNodeSize());
    }

    @Test
    public void testDeclarationAndRootAreInserted() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<?xml version='1.0'?><root/>", "");
        assertEquals(1, doc.childNodeSize());
        assertEquals("root", doc.child(0).nodeName());
    }

    @Test
    public void testDoctypeAndRootAreInserted() throws Exception {
        Document doc = new XmlTreeBuilder().parse("<!DOCTYPE root><root/>", "");
        assertEquals(1, doc.childNodeSize());
        assertEquals("root", doc.child(0).nodeName());
    }
}
