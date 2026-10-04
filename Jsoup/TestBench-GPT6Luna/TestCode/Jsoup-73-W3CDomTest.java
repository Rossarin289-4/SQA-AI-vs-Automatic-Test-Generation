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
    public void testConvertCreatesDocumentElement() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>Hi</p></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("html", output.getDocumentElement().getTagName());
    }

    @Test
    public void testFromJsoupBuildsDocument() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>Hi</p></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        assertEquals("html", output.getDocumentElement().getTagName());
        assertEquals("Hi", output.getElementsByTagName("p").item(0).getTextContent());
    }

    @Test
    public void testFromJsoupNullInputThrows() throws Exception {
        try {
            new W3CDom().fromJsoup(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConvertPreservesDocumentLocation() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body></body></html>", "https://example.org/page");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("https://example.org/page", output.getDocumentURI());
    }

    @Test
    public void testConvertBlankLocationLeavesUriUnset() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertNull(output.getDocumentURI());
    }

    @Test
    public void testConvertCopiesAttributes() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p id='x' title='t'>Hi</p></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        Element paragraph = (Element) output.getElementsByTagName("p").item(0);
        assertEquals("x", paragraph.getAttribute("id"));
        assertEquals("t", paragraph.getAttribute("title"));
    }

    @Test
    public void testConvertDropsInvalidCharactersFromAttributeName() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body></body></html>");
        input.select("body").first().attr("bad name", "value");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("value", output.getElementsByTagName("body").item(0).getAttributes().item(0).getNodeValue());
    }

    @Test
    public void testConvertCopiesTextAndComment() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><!--note-->text</body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        Element body = (Element) output.getElementsByTagName("body").item(0);
        assertEquals("note", body.getChildNodes().item(0).getNodeValue());
        assertEquals("text", body.getChildNodes().item(1).getNodeValue());
    }

    @Test
    public void testConvertCopiesDataNode() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><script>if (a < b) x();</script></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("if (a < b) x();", output.getElementsByTagName("script").item(0).getTextContent());
    }

    @Test
    public void testConvertAppliesDefaultNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><root xmlns='urn:sample'><child/></root></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertNull(output.getElementsByTagName("root").item(0).getNamespaceURI());
        assertEquals("urn:sample", ((Element) output.getElementsByTagName("root").item(0)).getAttribute("xmlns"));
    }

    @Test
    public void testConvertAppliesPrefixedNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p:root xmlns:p='urn:sample'><p:child/></p:root></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertNull(output.getElementsByTagName("p:root").item(0).getNamespaceURI());
        assertEquals("urn:sample", ((Element) output.getElementsByTagName("p:root").item(0)).getAttribute("xmlns:p"));
    }

    @Test
    public void testConvertUsesNestedNamespaceDeclaration() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><root><p:child xmlns:p='urn:nested'/></root></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals("urn:nested", ((Element) output.getElementsByTagName("p:child").item(0)).getAttribute("xmlns:p"));
    }

    @Test
    public void testConvertDoesNotLeakNestedNamespace() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><root><branch xmlns:p='urn:nested'><p:inside/></branch><p:outside/></root></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertNull(output.getElementsByTagName("p:outside").item(0).getNamespaceURI());
    }

    @Test
    public void testAsStringIncludesDocumentElementAndText() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><p>Hi</p></body></html>");
        String serialized = new W3CDom().asString(new W3CDom().fromJsoup(input));
        assertTrue(serialized.contains("<p>Hi</p>"));
    }

    @Test
    public void testAsStringSerializesEmptyElement() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><br></body></html>");
        String serialized = new W3CDom().asString(new W3CDom().fromJsoup(input));
        assertTrue(serialized.contains("br"));
    }

    @Test
    public void testConvertedChildIsNestedUnderParent() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><div><span>x</span></div></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element span = (Element) output.getElementsByTagName("span").item(0);
        assertEquals("div", span.getParentNode().getNodeName());
    }

    @Test
    public void testConversionPreservesSiblingOrder() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body><i>first</i><b>last</b></body></html>");
        Document output = new W3CDom().fromJsoup(input);
        Element body = (Element) output.getElementsByTagName("body").item(0);
        assertEquals("i", body.getChildNodes().item(0).getNodeName());
        assertEquals("b", body.getChildNodes().item(1).getNodeName());
    }

    @Test
    public void testConvertCreatesNoAdditionalDocumentRoots() throws Exception {
        org.jsoup.nodes.Document input = org.jsoup.Jsoup.parse("<html><body></body></html>");
        Document output = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(input, output);
        assertEquals(1, output.getChildNodes().getLength());
    }
}
