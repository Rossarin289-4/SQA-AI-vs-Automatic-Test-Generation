package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Stack;

public class W3CDomTest {
    @Test
    public void testFromJsoupBuildsDocumentTree() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p>hello</p>");
        Document result = new W3CDom().fromJsoup(input);
        assertEquals("html", result.getDocumentElement().getTagName());
        assertEquals("hello", result.getElementsByTagName("p").item(0).getTextContent());
    }

    @Test
    public void testFromJsoupRetainsDocumentLocation() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p>x</p>", "https://example.test/a");
        Document result = new W3CDom().fromJsoup(input);
        assertEquals("https://example.test/a", result.getDocumentURI());
    }

    @Test
    public void testFromJsoupRejectsNull() throws Exception {
        try {
            new W3CDom().fromJsoup(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConvertLeavesBlankLocationUnset() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p>x</p>");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        assertNull(out.getDocumentURI());
        assertEquals("html", out.getDocumentElement().getTagName());
    }

    @Test
    public void testConvertCopiesAttributesAndText() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p id='a'>hello</p>");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        Element p = (Element) out.getElementsByTagName("p").item(0);
        assertEquals("a", p.getAttribute("id"));
        assertEquals("hello", p.getTextContent());
    }

    @Test
    public void testConvertSkipsInvalidAttributeName() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p>");
        input.selectFirst("p").attr("bad name", "v");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        assertEquals("v", ((Element) out.getElementsByTagName("p").item(0)).getAttribute("badname"));
    }

    @Test
    public void testConvertPreservesComments() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p><!--note--></p>");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        Comment comment = (Comment) out.getElementsByTagName("p").item(0).getFirstChild();
        assertEquals("note", comment.getData());
    }

    @Test
    public void testConvertPreservesDataNodeText() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<script>var x=1;</script>");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        assertEquals("var x=1;", out.getElementsByTagName("script").item(0).getTextContent());
    }

    @Test
    public void testConvertSetsDocumentUriForNonblankLocation() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p>x</p>", "https://example.test/");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        assertEquals("https://example.test/", out.getDocumentURI());
    }

    @Test
    public void testConvertMapsDefaultNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<root xmlns='urn:x'><child/></root>");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        Element root = out.getDocumentElement();
        assertNull(root.getNamespaceURI());
        assertNull(((Element) root.getFirstChild()).getNamespaceURI());
    }

    @Test
    public void testConvertMapsPrefixedNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<x:root xmlns:x='urn:x'/>");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        assertNull(out.getDocumentElement().getNamespaceURI());
    }

    @Test
    public void testConvertCreatesUnboundPrefixedTagWithEmptyNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<x:root/>");
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, out);
        assertNull(out.getDocumentElement().getNamespaceURI());
    }

    @Test
    public void testAsStringSerializesDocumentContent() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p>hello</p>");
        String serialized = new W3CDom().asString(new W3CDom().fromJsoup(input));
        assertTrue(serialized.contains("hello"));
        assertTrue(serialized.contains("<p"));
    }

    @Test
    public void testAsStringIncludesElementAttribute() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p id='a'>x</p>");
        String serialized = new W3CDom().asString(new W3CDom().fromJsoup(input));
        assertTrue(serialized.contains("id=\"a\""));
    }

    @Test
    public void testAsStringSerializesEmptyDocument() throws Exception {
        Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        String serialized = new W3CDom().asString(out);
        assertNotNull(serialized);
    }
}
