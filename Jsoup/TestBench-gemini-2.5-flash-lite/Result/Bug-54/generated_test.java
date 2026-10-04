package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.DOMException;
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

    // Test cases for W3CDom.fromJsoup












    // Test cases for W3CDom.convert

    // Test cases for W3CDom.asString




    // Test edge cases for attribute key sanitization in W3CBuilder.copyAttributes

    // Test for valid attribute name starting with a colon

    // Test for valid attribute name starting with an underscore
    
    // Test for valid attribute name with dots

    // Test for attribute names that are entirely numeric (invalid in XML)
    // The regex [a-zA-Z_:][-a-zA-Z0-9_:.]* requires it to start with a letter, _, or :

    // Test for handling of empty attribute value
    
    // Test for attribute key sanitization with special characters like '&' and '<'

    // Test for updateNamespaces method with default namespace and prefixed namespace
    
    // Test for handling of multiple attributes with the same key (last one should win in Jsoup)
    
    // Test for attribute key starting with a number (invalid in XML, should be filtered)
    @Test
    public void testCopyAttributes_attributeKeyStartsWithNumber() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        Element jsoupEl = new Element("div");
        jsoupEl.attr("1invalid", "value");
        
        jsoupDoc.appendChild(jsoupEl);
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Element w3cEl = (Element) w3cDoc.getChildNodes().item(0);
        
        // The regex `key.matches("[a-zA-Z_:]{1}[-a-zA-Z0-9_:.]*")` ensures the key starts with a letter, underscore or colon.
        assertFalse(w3cEl.hasAttribute("1invalid"));
    }

    // Test for Jsoup's `asString` method with a complex document structure
    @Test
    public void testAsString_complexDocument() throws TransformerException, ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("http://example.com");
        Element htmlEl = new Element("html");
        Element bodyEl = new Element("body");
        Element pEl = new Element("p");
        pEl.attr("id", "intro");
        pEl.appendChild(new TextNode("This is "));
        pEl.appendChild(new Element("strong").text("important"));
        pEl.appendChild(new TextNode("."));
        
        bodyEl.appendChild(pEl);
        htmlEl.appendChild(bodyEl);
        jsoupDoc.appendChild(htmlEl);

        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);

        // Check for presence of key elements and structure. Exact output might vary.
        assertTrue(result.contains("<html"));
        assertTrue(result.contains("<body"));
        assertTrue(result.contains("<p id=\"intro\">"));
        assertTrue(result.contains("This is "));
        assertTrue(result.contains("<strong>important</strong>"));
        assertTrue(result.contains("."));
    }
    
    // Test for handling of XML comments within elements
    @Test
    public void testFromJsoup_elementWithComment() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        Element parentEl = new Element("parent");
        parentEl.appendChild(new org.jsoup.nodes.Comment("Inner comment"));
        parentEl.appendChild(new TextNode(" some text"));
        jsoupDoc.appendChild(parentEl);
        
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        
        Element w3cParent = (Element) w3cDoc.getChildNodes().item(0);
        assertEquals(2, w3cParent.getChildNodes().getLength());
        assertTrue(w3cParent.getChildNodes().item(0) instanceof org.w3c.dom.Comment);
        assertEquals("Inner comment", w3cParent.getChildNodes().item(0).getNodeValue());
        assertTrue(w3cParent.getChildNodes().item(1) instanceof org.w3c.dom.Text);
        assertEquals(" some text", ((org.w3c.dom.Text) w3cParent.getChildNodes().item(1)).getData());
    }
}





