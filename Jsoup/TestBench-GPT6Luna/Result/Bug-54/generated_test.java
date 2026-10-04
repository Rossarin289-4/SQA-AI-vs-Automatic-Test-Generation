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

public class W3CDomTest {
    @Test
    public void testFromJsoupConvertsDocumentRoot() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>Hi</p></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        assertEquals("html", output.getDocumentElement().getTagName());
        assertEquals("Hi", output.getElementsByTagName("p").item(0).getTextContent());
    }

    @Test
    public void testFromJsoupPreservesLocation() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<p>x</p>", "http://example.com/a");
        Document output = new W3CDom().fromJsoup(input);
        assertEquals("http://example.com/a", output.getDocumentURI());
    }

    @Test
    public void testFromJsoupRejectsNull() throws Exception {
        try {
            new W3CDom().fromJsoup(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConvertUsesExistingDocument() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>x</p></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("html", output.getDocumentElement().getTagName());
        assertEquals("x", output.getElementsByTagName("p").item(0).getTextContent());
    }

    @Test
    public void testConvertLeavesBlankLocationUnset() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body>x</body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertNull(output.getDocumentURI());
    }

    @Test
    public void testConvertRecordsNonblankLocation() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html></html>", "http://example.com");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("http://example.com", output.getDocumentURI());
    }

    @Test
    public void testConvertCopiesValidAttributes() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p id='v' title='t'>x</p></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element p = (Element) output.getElementsByTagName("p").item(0);
        assertEquals("v", p.getAttribute("id"));
        assertEquals("t", p.getAttribute("title"));
    }

    @Test
    public void testConvertStripsInvalidAttributeNameCharacters() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p a!b='v'>x</p></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element p = (Element) output.getElementsByTagName("p").item(0);
        assertEquals("v", p.getAttribute("ab"));
    }

    @Test
    public void testConvertPreservesTextAndComment() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body>before<!-- note --><b>after</b></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element body = (Element) output.getElementsByTagName("body").item(0);
        assertEquals("beforeafter", body.getTextContent());
        assertEquals(3, body.getChildNodes().getLength());
        assertEquals(" note ", body.getChildNodes().item(1).getNodeValue());
    }

    @Test
    public void testConvertKeepsNestedElementStructure() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><div><span>x</span></div></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element div = (Element) output.getElementsByTagName("div").item(0);
        assertEquals("span", div.getFirstChild().getNodeName());
        assertEquals("x", div.getTextContent());
    }

    @Test
    public void testConvertMapsDefaultNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html xmlns='urn:test'><body><p>x</p></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        assertEquals("urn:test", output.getDocumentElement().getNamespaceURI());
        assertEquals("urn:test", output.getElementsByTagNameNS("urn:test", "p").item(0).getNamespaceURI());
    }

    @Test
    public void testConvertMapsPrefixedNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html xmlns:x='urn:test'><x:item>v</x:item></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element item = (Element) output.getElementsByTagName("x:item").item(0);
        assertEquals("urn:test", item.getNamespaceURI());
    }

    @Test
    public void testConvertIgnoresAttributeWithEmptySanitizedName() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>v</p></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element p = (Element) output.getElementsByTagName("p").item(0);
        assertEquals(0, p.getAttributes().getLength());
    }

    @Test
    public void testAsStringContainsDocumentContent() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>hello</p></body></html>");
        String serialized = new W3CDom().asString(new W3CDom().fromJsoup(input));
        assertTrue(serialized.contains("<p>hello</p>"));
    }

    @Test
    public void testAsStringEscapesTextMarkup() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>a &amp; b</p></body></html>");
        String serialized = new W3CDom().asString(new W3CDom().fromJsoup(input));
        assertTrue(serialized.contains("a &amp; b"));
    }

    @Test
    public void testConvertProducesDocumentElement() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<main>x</main>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("html", output.getDocumentElement().getTagName());
    }
}
