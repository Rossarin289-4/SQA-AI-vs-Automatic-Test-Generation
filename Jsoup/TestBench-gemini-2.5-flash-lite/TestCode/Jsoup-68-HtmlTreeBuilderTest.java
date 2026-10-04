package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.Connection; // Added for Connection.KeyVal
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HtmlTreeBuilderTest {










    
































































    @Test
    public void testNewAndGetPendingTableCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.newPendingTableCharacters();
        assertNotNull(tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters() instanceof ArrayList);
    }

    @Test
    public void testSetPendingTableCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        List<String> chars = new ArrayList<>();
        chars.add("a");
        chars.add("b");
        tb.setPendingTableCharacters(chars);
        assertEquals(chars, tb.getPendingTableCharacters());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element p = tb.insertStartTag("p");
        Element li = tb.insertStartTag("li");
        tb.generateImpliedEndTags(); 
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testGenerateImpliedEndTagsWithExclude() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element p = tb.insertStartTag("p");
        Element li = tb.insertStartTag("li");
        tb.generateImpliedEndTags("p"); 
        assertEquals(1, tb.getStack().size());
        assertEquals(p, tb.getStack().get(0));
    }

    @Test
    public void testIsSpecial() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertTrue(tb.isSpecial(new Element(Tag.valueOf("script"), "", new Attributes())));
        assertTrue(tb.isSpecial(new Element(Tag.valueOf("table"), "", new Attributes())));
        assertFalse(tb.isSpecial(new Element(Tag.valueOf("div"), "", new Attributes())));
    }

    @Test
    public void testLastFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        assertNull(tb.lastFormattingElement());
        Element el = new Element(Tag.valueOf("b"), "", new Attributes());
        tb.pushActiveFormattingElements(el);
        assertEquals(el, tb.lastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.removeLastFormattingElement());
        assertEquals(el1, tb.lastFormattingElement());
        assertEquals(el1, tb.removeLastFormattingElement());
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        el1.attr("href", "test");
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        Element el3 = new Element(Tag.valueOf("b"), "", new Attributes()); 
        el3.attr("href", "test");
        
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.pushActiveFormattingElements(el3);

        assertEquals(3, tb.formattingElements.size());
        assertEquals(el1, tb.formattingElements.get(0));
        assertEquals(el2, tb.formattingElements.get(1));
        assertEquals(el3, tb.formattingElements.get(2));
    }

    @Test
    public void testIsSameFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("a"), "", new Attributes());
        el1.attr("href", "link1");
        Element el2 = new Element(Tag.valueOf("a"), "", new Attributes());
        el2.attr("href", "link1");
        Element el3 = new Element(Tag.valueOf("a"), "", new Attributes());
        el3.attr("href", "link2");
        Element el4 = new Element(Tag.valueOf("b"), "", new Attributes());
        assertTrue(tb.isSameFormattingElement(el1, el2));
        assertFalse(tb.isSameFormattingElement(el1, el3));
        assertFalse(tb.isSameFormattingElement(el1, el4));
    }

    @Test
    public void testReconstructFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        
        // Test case where element is not on stack:
        tb.formattingElements.clear();
        tb.stack.clear();
        Element formattingB = new Element(Tag.valueOf("b"), "", new Attributes());
        tb.formattingElements.add(formattingB);
        // Element is NOT on stack.
        tb.reconstructFormattingElements(); 
        assertEquals(1, tb.formattingElements.size()); 
        assertEquals(formattingB, tb.formattingElements.get(0));
        assertEquals(1, tb.stack.size()); 
        assertEquals("b", tb.stack.get(0).tagName());
        assertNotEquals(formattingB, tb.stack.get(0));
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(null); // Marker
        tb.pushActiveFormattingElements(el2);
        tb.clearFormattingElementsToLastMarker();
        assertEquals(1, tb.formattingElements.size());
        assertNull(tb.formattingElements.get(0)); 
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.removeFromActiveFormattingElements(el1);
        assertEquals(1, tb.formattingElements.size());
        assertEquals(el2, tb.formattingElements.get(0));
    }

    @Test
    public void testIsInActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        assertTrue(tb.isInActiveFormattingElements(el1));
        assertFalse(tb.isInActiveFormattingElements(el2));
    }

    @Test
    public void testGetActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.getActiveFormattingElement("i"));
        assertEquals(el1, tb.getActiveFormattingElement("b"));
        assertNull(tb.getActiveFormattingElement("p"));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element el1 = new Element(Tag.valueOf("b"), "", new Attributes());
        Element el2 = new Element(Tag.valueOf("i"), "", new Attributes());
        Element el3 = new Element(Tag.valueOf("u"), "", new Attributes());
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.replaceActiveFormattingElement(el2, el3);
        assertEquals(2, tb.formattingElements.size());
        assertEquals(el1, tb.formattingElements.get(0));
        assertEquals(el3, tb.formattingElements.get(1));
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        tb.insertMarkerToFormattingElements();
        assertEquals(1, tb.formattingElements.size());
        assertNull(tb.formattingElements.get(0));
    }

    @Test
    public void testInsertInFosterParentTableCase() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        Element body = tb.insertStartTag("body");
        Element table = tb.insertStartTag("table");
        Element p = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.setFosterInserts(true);
        tb.insertInFosterParent(p);
        assertEquals(body, p.parent()); 
    }

    @Test
    public void testInsertInFosterParentFragmentCase() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = new Element(Tag.valueOf("div"), "", new Attributes());
        tb.contextElement = context;
        tb.fragmentParsing = true;
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault); 
        Element p = new Element(Tag.valueOf("p"), "", new Attributes());
        tb.setFosterInserts(true);
        tb.insertInFosterParent(p);
        assertTrue(p.parent() != null);
    }

    @Test
    public void testToString() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noParseError(), ParseSettings.htmlDefault);
        String stateString = tb.toString();
        assertTrue(stateString.contains("currentToken=null"));
        assertTrue(stateString.contains("state=Initial"));
        assertTrue(stateString.contains("currentElement=null"));

        tb.transition(HtmlTreeBuilderState.InBody);
        Element el = tb.insertStartTag("div");
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "p";
        tb.currentToken = startTag;
        stateString = tb.toString();
        assertTrue(stateString.contains("currentToken=start tag: p"));
        assertTrue(stateString.contains("state=InBody"));
        assertTrue(stateString.contains("currentElement=div"));
    }
}





