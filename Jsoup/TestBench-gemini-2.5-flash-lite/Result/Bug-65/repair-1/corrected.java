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
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jsoup.nodes.*;
import org.jsoup.Connection;

public class HtmlTreeBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseFragmentNoContext() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(0, nodes.size());
    }

    @Test
    public void testParseFragmentWithContext() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element div = new Element("div");
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<span>test</span>", div, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("span", nodes.get(0).nodeName());
        assertEquals("test", nodes.get(0).childNode(0).outerHtml());
    }

    @Test
    public void testParseFragmentWithBaseUri() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element div = new Element("div");
        tb.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<a href='/path'>link</a>", div, "http://example.com", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element link = (Element) nodes.get(0);
        assertEquals("http://example.com/path", link.absUrl("href"));
    }

    @Test
    public void testParseFragmentWithFormContext() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        // Mock the document to return the form element
        Document mockDoc = new Document("");
        mockDoc.formElement = form;
        tb.doc = mockDoc;

        List<Node> nodes = tb.parseFragment("<input type='text'>", form, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element input = (Element) nodes.get(0);
        assertEquals("input", input.nodeName());
        // The form element should be associated with the input
        assertEquals(form, input.ownerDocument().formElement);
    }

    @Test
    public void testParseFragmentWithFormInAncestor() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element div = new Element("div");
        form.appendChild(div);
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        // Mock the document to return the form element
        Document mockDoc = new Document("");
        mockDoc.formElement = form;
        tb.doc = mockDoc;

        List<Node> nodes = tb.parseFragment("<input type='text'>", div, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element input = (Element) nodes.get(0);
        assertEquals("input", input.nodeName());
        // The form element should be associated with the input, found via ancestor
        assertEquals(form, input.ownerDocument().formElement);
    }

    @Test
    public void testParseFragmentWithNestedForms() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        FormElement outerForm = new FormElement(Tag.valueOf("form"), "", new Attributes());
        FormElement innerForm = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element div = new Element("div");
        outerForm.appendChild(div);
        div.appendChild(innerForm);
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        // Mock the document to return the form element
        Document mockDoc = new Document("");
        mockDoc.formElement = innerForm; // The innermost form should be detected
        tb.doc = mockDoc;

        List<Node> nodes = tb.parseFragment("<input type='text'>", div, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element input = (Element) nodes.get(0);
        assertEquals("input", input.nodeName());
        // Should associate with the innermost form
        assertEquals(innerForm, input.ownerDocument().formElement);
    }

    @Test
    public void testParseFragmentWithDoctype() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<!DOCTYPE html><html><body>Hello</body></html>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element html = (Element) nodes.get(0);
        assertEquals("html", html.nodeName());
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof DocumentType);
    }

    @Test
    public void testParseFragmentWithComment() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<!-- comment --><div>Hi</div>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(2, nodes.size());
        assertTrue(nodes.get(0) instanceof Comment);
        assertEquals("<!-- comment -->", nodes.get(0).outerHtml());
        assertEquals("<div>Hi</div>", nodes.get(1).outerHtml());
    }

    @Test
    public void testParseFragmentWithScriptData() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<script>var a = 1;</script>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element script = (Element) nodes.get(0);
        assertEquals("script", script.nodeName());
        assertEquals("var a = 1;", script.data());
    }

    @Test
    public void testParseFragmentWithStyleData() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<style>body { color: red; }</style>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element style = (Element) nodes.get(0);
        assertEquals("style", style.nodeName());
        assertEquals("body { color: red; }", style.data());
    }

    @Test
    public void testParseFragmentWithEmptyTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<br>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        assertEquals("br", nodes.get(0).nodeName());
        assertTrue(nodes.get(0) instanceof Element);
        assertTrue(((Element) nodes.get(0)).tag().isSelfClosing());
    }

    @Test
    public void testParseFragmentWithUnknownSelfClosingTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<my-custom-tag/>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element customTag = (Element) nodes.get(0);
        assertEquals("my-custom-tag", customTag.nodeName());
        assertTrue(customTag.tag().isSelfClosing()); // Tag should be marked self-closing
    }

    @Test
    public void testParseFragmentWithAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<div id='main' class='container'>Content</div>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element div = (Element) nodes.get(0);
        assertEquals("main", div.id());
        assertEquals("container", div.className());
        assertEquals("Content", div.ownText());
    }

    @Test
    public void testParseFragmentWithQuotedAttributes() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<a href=\"/page\" title='Tooltip'>Link</a>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element a = (Element) nodes.get(0);
        assertEquals("/page", a.attr("href"));
        assertEquals("Tooltip", a.attr("title"));
    }

    @Test
    public void testParseFragmentWithSpecialCharacters() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<div>&lt; &amp; &gt;</div>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element div = (Element) nodes.get(0);
        assertEquals("< & >", div.ownText());
    }

    @Test
    public void testParseFragmentWithUnescapedSpecialCharacters() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<div>< & ></div>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element div = (Element) nodes.get(0);
        // The parser should correctly handle unescaped characters
        assertEquals("< & >", div.childNode(0).outerHtml());
    }

    @Test
    public void testParseFragmentWithImpliedTags() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<tr><td>Cell</td></tr>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element tr = (Element) nodes.get(0);
        assertEquals("tr", tr.nodeName());
        Element td = (Element) tr.childNode(0);
        assertEquals("td", td.nodeName());
        assertEquals("Cell", td.ownText());
        // Implied tbody should be created
        assertEquals(1, tb.getDocument().body().children().size());
        assertEquals("tbody", tb.getDocument().body().child(0).nodeName());
        assertEquals(1, tb.getDocument().body().child(0).children().size());
        assertEquals("tr", tb.getDocument().body().child(0).child(0).nodeName());
    }

    @Test
    public void testParseFragmentWithNestedImpliedTags() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<table><tr><td>Cell</td></tr></table>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        Element tbody = (Element) table.childNode(0);
        assertEquals("tbody", tbody.nodeName());
        Element tr = (Element) tbody.childNode(0);
        assertEquals("tr", tr.nodeName());
        Element td = (Element) tr.childNode(0);
        assertEquals("td", td.nodeName());
        assertEquals("Cell", td.ownText());
    }

    @Test
    public void testParseFragmentWithFormInBody() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<body><form><input></form></body>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element body = (Element) nodes.get(0);
        assertEquals("body", body.nodeName());
        assertEquals(1, body.children().size());
        assertTrue(body.child(0) instanceof FormElement);
        assertEquals(1, body.child(0).children().size());
        assertEquals("input", body.child(0).child(0).nodeName());
    }

    @Test
    public void testParseFragmentWithBaseTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://base.com", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<head><base href='http://newbase.com'></head><body>Hi</body>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element head = (Element) nodes.get(0);
        assertEquals("head", head.nodeName());
        Element base = (Element) head.child(0);
        assertEquals("base", base.nodeName());
        assertEquals("http://newbase.com", tb.getBaseUri());
        assertEquals("http://newbase.com", tb.getDocument().getBaseUri()); // Document should also be updated
    }

    @Test
    public void testParseFragmentWithMultipleBaseTags() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://base.com", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<head><base href='http://first.com'><base href='http://second.com'></head><body>Hi</body>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element head = (Element) nodes.get(0);
        assertEquals("head", head.nodeName());
        Element firstBase = (Element) head.child(0);
        Element secondBase = (Element) head.child(1);
        // Only the first base tag should set the base URI
        assertEquals("http://first.com", tb.getBaseUri());
        assertEquals("http://first.com", tb.getDocument().getBaseUri());
        assertEquals("http://second.com", secondBase.absUrl("href")); // Abs url on second base should be resolved against first base
    }

    @Test
    public void testParseFragmentWithNoscriptInHead() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<head><noscript>No script</noscript></head>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element head = (Element) nodes.get(0);
        assertEquals("head", head.nodeName());
        assertEquals(1, head.children().size());
        assertEquals("noscript", head.child(0).nodeName());
        assertEquals("No script", head.child(0).ownText());
    }

    @Test
    public void testParseFragmentWithTableAndImpliedTbody() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<table><tr><td>Data</td></tr></table>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        assertEquals(1, table.children().size());
        assertEquals("tbody", table.child(0).nodeName());
        assertEquals(1, table.child(0).children().size());
        assertEquals("tr", table.child(0).child(0).nodeName());
        assertEquals(1, table.child(0).child(0).children().size());
        assertEquals("td", table.child(0).child(0).child(0).nodeName());
        assertEquals("Data", table.child(0).child(0).child(0).ownText());
    }

    @Test
    public void testParseFragmentWithTableAndExplicitTbody() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<table><tbody><tr><td>Data</td></tr></tbody></table>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        assertEquals(1, table.children().size());
        assertEquals("tbody", table.child(0).nodeName());
        assertEquals(1, table.child(0).children().size());
        assertEquals("tr", table.child(0).child(0).nodeName());
        assertEquals(1, table.child(0).child(0).children().size());
        assertEquals("td", table.child(0).child(0).child(0).nodeName());
        assertEquals("Data", table.child(0).child(0).child(0).ownText());
    }

    @Test
    public void testParseFragmentWithTableAndColgroup() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<table><colgroup><col></colgroup><tr><td>Data</td></tr></table>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        assertEquals(2, table.children().size()); // colgroup and tbody
        assertEquals("colgroup", table.child(0).nodeName());
        assertEquals(1, table.child(0).children().size());
        assertEquals("col", table.child(0).child(0).nodeName());
        assertEquals("tbody", table.child(1).nodeName());
    }

    @Test
    public void testParseFragmentWithTableAndCaption() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<table><caption>Caption</caption><tr><td>Data</td></tr></table>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        assertEquals(2, table.children().size()); // caption and tbody
        assertEquals("caption", table.child(0).nodeName());
        assertEquals("Caption", table.child(0).ownText());
        assertEquals("tbody", table.child(1).nodeName());
    }

    @Test
    public void testParseFragmentWithSelectAndOption() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<select><option value='1'>One</option><option value='2'>Two</option></select>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element select = (Element) nodes.get(0);
        assertEquals("select", select.nodeName());
        assertEquals(2, select.children().size());
        assertEquals("option", select.child(0).nodeName());
        assertEquals("1", select.child(0).attr("value"));
        assertEquals("One", select.child(0).ownText());
        assertEquals("option", select.child(1).nodeName());
        assertEquals("2", select.child(1).attr("value"));
        assertEquals("Two", select.child(1).ownText());
    }

    @Test
    public void testParseFragmentWithSelectAndOptgroup() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<select><optgroup label='Group1'><option>A</option></optgroup></select>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element select = (Element) nodes.get(0);
        assertEquals("select", select.nodeName());
        assertEquals(1, select.children().size());
        assertEquals("optgroup", select.child(0).nodeName());
        assertEquals("Group1", select.child(0).attr("label"));
        assertEquals(1, select.child(0).children().size());
        assertEquals("option", select.child(0).child(0).nodeName());
        assertEquals("A", select.child(0).child(0).ownText());
    }

    @Test
    public void testParseFragmentWithSelfClosingStyleTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<style/>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element style = (Element) nodes.get(0);
        assertEquals("style", style.nodeName());
        assertTrue(style.tag().isEmpty()); // Should be considered an empty tag
    }

    @Test
    public void testParseFragmentWithEmptyTableBody() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<table><tbody></tbody></table>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        assertEquals(1, table.children().size());
        assertEquals("tbody", table.child(0).nodeName());
        assertEquals(0, table.child(0).children().size());
    }

    @Test
    public void testParseFragmentWithIncompleteTableStructure() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        // This should still parse without errors due to implied tags
        List<Node> nodes = tb.parseFragment("<table><tr><td>Data</td>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        assertEquals(1, table.children().size());
        assertEquals("tbody", table.child(0).nodeName());
        assertEquals(1, table.child(0).children().size());
        assertEquals("tr", table.child(0).child(0).nodeName());
        assertEquals(1, table.child(0).child(0).children().size());
        assertEquals("td", table.child(0).child(0).child(0).nodeName());
        assertEquals("Data", table.child(0).child(0).child(0).ownText());
    }

    @Test
    public void testParseFragmentWithIncompleteTableStructure2() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        // This should still parse without errors due to implied tags
        List<Node> nodes = tb.parseFragment("<table><tr><td>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element table = (Element) nodes.get(0);
        assertEquals("table", table.nodeName());
        assertEquals(1, table.children().size());
        assertEquals("tbody", table.child(0).nodeName());
        assertEquals(1, table.child(0).children().size());
        assertEquals("tr", table.child(0).child(0).nodeName());
        assertEquals(1, table.child(0).child(0).children().size());
        assertEquals("td", table.child(0).child(0).child(0).nodeName());
        assertEquals(0, table.child(0).child(0).child(0).childNodes().size());
    }

    @Test
    public void testParseFragmentWithFormattingElements() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        List<Node> nodes = tb.parseFragment("<b><i>BoldItalic</i></b>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());
        assertEquals(1, nodes.size());
        Element b = (Element) nodes.get(0);
        assertEquals("b", b.nodeName());
        assertEquals(1, b.children().size());
        Element i = (Element) b.child(0);
        assertEquals("i", i.nodeName());
        assertEquals("BoldItalic", i.ownText());
        // Test that formatting elements are correctly handled and removed from active formatting elements
        assertTrue(tb.formattingElements.isEmpty());
    }

    @Test
    public void testParseFragmentWithReconstructionOfFormattingElements() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        // Simulate a scenario where formatting elements are on the stack but not yet closed
        Element b = new Element("b");
        Element i = new Element("i");
        tb.pushActiveFormattingElements(b);
        tb.pushActiveFormattingElements(i);
        tb.push(b); // Add to stack
        tb.push(i); // Add to stack

        List<Node> nodes = tb.parseFragment("<b>Bold</b><i>Italic</i>", null, "", ParseErrorList.noTracking(), tb.defaultSettings());

        // The initial <b> should be closed, and a new <b> should be created and inserted.
        // Then <i> should be created and inserted.
        assertEquals(1, nodes.size());
        Element firstB = (Element) nodes.get(0);
        assertEquals("b", firstB.nodeName());
        assertEquals("Bold", firstB.ownText());

        // Check the stack and formatting elements after parsing
        assertTrue(tb.formattingElements.isEmpty()); // Should be empty after reconstruction
        assertEquals(3, tb.getStack().size()); // html, body, b
        assertEquals("b", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testFosterInsertsTableWithinTable() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        tb.setFosterInserts(true); // Simulate foster inserts
        Element table = new Element("table");
        tb.insert(table);
        Element nestedTable = new Element("table");
        tb.insertNode(nestedTable); // This should be inserted correctly because fosterInserts is true
        // The foster parent logic would normally insert outside the current table
        // However, given the current limited state, we check if it's inserted at all
        assertEquals(1, table.childNodes().size());
        assertEquals("table", table.child(0).nodeName());
    }

    @Test
    public void testFosterInsertsWithTrInTd() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        tb.setFosterInserts(true); // Simulate foster inserts
        Element td = new Element("td");
        tb.insert(td);
        Element tr = new Element("tr");
        tb.insertNode(tr); // This should be inserted correctly
        assertEquals(1, td.childNodes().size());
        assertEquals("tr", td.child(0).nodeName());
    }

    @Test
    public void testInsertElementIntoDocWhenStackEmpty() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element div = new Element("div");
        tb.insertNode(div); // Stack is empty, should insert into doc
        assertEquals(1, tb.getDocument().childNodes().size());
        assertEquals(div, tb.getDocument().childNodes().get(0));
    }

    @Test
    public void testInsertElementIntoCurrentElementWhenStackNotEmpty() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element html = new Element("html");
        tb.insert(html);
        Element body = new Element("body");
        tb.insertNode(body); // Stack has html, should insert into html
        assertEquals(1, html.childNodes().size());
        assertEquals(body, html.child(0));
    }

    @Test
    public void testInsertEmptyKnownTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "br";
        startTag.selfClosing = true; // Mark as self-closing
        Element el = tb.insertEmpty(startTag);
        assertEquals("br", el.nodeName());
        assertTrue(el.tag().isEmpty());
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testInsertEmptyUnknownTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "my-unknown";
        startTag.selfClosing = true; // Mark as self-closing
        Element el = tb.insertEmpty(startTag);
        assertEquals("my-unknown", el.nodeName());
        assertTrue(el.tag().isSelfClosing()); // Should be marked self-closing
        assertFalse(el.tag().isKnownTag());
    }

    @Test
    public void testInsertFormElementOnStack() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "form";
        FormElement form = tb.insertForm(startTag, true);
        assertEquals("form", form.nodeName());
        assertTrue(tb.onStack(form));
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testInsertFormElementNotOnStack() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "form";
        FormElement form = tb.insertForm(startTag, false);
        assertEquals("form", form.nodeName());
        assertFalse(tb.onStack(form)); // Not on stack
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testInsertComment() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element html = new Element("html");
        tb.push(html);
        Token.Comment commentToken = new Token.Comment();
        commentToken.data = "This is a comment"; // Direct assignment for Comment token data
        tb.insert(commentToken);
        assertEquals(1, html.childNodes().size());
        assertTrue(html.child(0) instanceof Comment);
        assertEquals("<!--This is a comment-->", html.child(0).outerHtml()); // outerHtml includes comment tags
    }

    @Test
    public void testInsertCharacterAsTextNode() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element div = new Element("div");
        tb.push(div);
        Token.Character characterToken = new Token.Character();
        characterToken.data = "Some text";
        tb.insert(characterToken);
        assertEquals(1, div.childNodes().size());
        assertTrue(div.child(0) instanceof TextNode);
        assertEquals("Some text", div.child(0).outerHtml());
    }

    @Test
    public void testInsertCharacterAsDataNodeInScript() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element script = new Element("script");
        tb.push(script);
        Token.Character characterToken = new Token.Character();
        characterToken.data = "Script content";
        tb.insert(characterToken);
        assertEquals(1, script.childNodes().size());
        assertTrue(script.child(0) instanceof DataNode);
        assertEquals("Script content", script.child(0).outerHtml());
    }

    @Test
    public void testInsertCharacterAsDataNodeInStyle() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element style = new Element("style");
        tb.push(style);
        Token.Character characterToken = new Token.Character();
        characterToken.data = "Style content";
        tb.insert(characterToken);
        assertEquals(1, style.childNodes().size());
        assertTrue(style.child(0) instanceof DataNode);
        assertEquals("Style content", style.child(0).outerHtml());
    }

    @Test
    public void testPushAndPopStack() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertEquals(2, tb.getStack().size());
        assertEquals(el2, tb.pop());
        assertEquals(1, tb.getStack().size());
        assertEquals(el1, tb.pop());
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertTrue(tb.onStack(el1));
        assertTrue(tb.onStack(el2));
        assertFalse(tb.onStack(new Element("p")));
    }

    @Test
    public void testGetFromStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertEquals(el2, tb.getFromStack("span"));
        assertEquals(el1, tb.getFromStack("div"));
        assertNull(tb.getFromStack("p"));
    }

    @Test
    public void testRemoveFromStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        tb.push(el1);
        tb.push(el2);
        assertTrue(tb.removeFromStack(el2));
        assertEquals(1, tb.getStack().size());
        assertFalse(tb.removeFromStack(new Element("p")));
    }

    @Test
    public void testPopStackToCloseSingleTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        tb.popStackToClose("span");
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el2, tb.getStack().get(1));
    }

    @Test
    public void testPopStackToCloseMultipleTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        Element el4 = new Element("a");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        tb.push(el4);
        tb.popStackToClose("span", "a");
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el2, tb.getStack().get(1));
    }

    @Test
    public void testPopStackToBefore() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        tb.popStackToBefore("span");
        assertEquals(2, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(el2, tb.getStack().get(1));
    }

    @Test
    public void testClearStackToTableContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element table = new Element("table");
        Element tr = new Element("tr");
        tb.push(html);
        tb.push(body);
        tb.push(table);
        tb.push(tr);
        tb.clearStackToTableContext();
        assertEquals(3, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(body, tb.getStack().get(1));
        assertEquals(table, tb.getStack().get(2));
    }

    @Test
    public void testClearStackToTableBodyContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element tbody = new Element("tbody");
        Element tr = new Element("tr");
        tb.push(table);
        tb.push(tbody);
        tb.push(tr);
        tb.clearStackToTableBodyContext();
        assertEquals(2, tb.getStack().size());
        assertEquals(table, tb.getStack().get(0));
        assertEquals(tbody, tb.getStack().get(1));
    }

    @Test
    public void testClearStackToTableRowContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element tbody = new Element("tbody");
        Element tr = new Element("tr");
        Element td = new Element("td");
        tb.push(tbody);
        tb.push(tr);
        tb.push(td);
        tb.clearStackToTableRowContext();
        assertEquals(2, tb.getStack().size());
        assertEquals(tbody, tb.getStack().get(0));
        assertEquals(tr, tb.getStack().get(1));
    }

    @Test
    public void testAboveOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        assertEquals(el2, tb.aboveOnStack(el3));
        assertEquals(el1, tb.aboveOnStack(el2));
        assertNull(tb.aboveOnStack(el1)); // No element above html
    }

    @Test
    public void testReplaceOnStack() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("div");
        Element el2 = new Element("span");
        Element el3 = new Element("p");
        tb.push(el1);
        tb.push(el2);
        tb.push(el3);
        Element newEl2 = new Element("a");
        tb.replaceOnStack(el2, newEl2);
        assertEquals(3, tb.getStack().size());
        assertEquals(el1, tb.getStack().get(0));
        assertEquals(newEl2, tb.getStack().get(1));
        assertEquals(el3, tb.getStack().get(2));
    }

    @Test
    public void testResetInsertionModeInBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        tb.push(html);
        tb.push(body);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInHead() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element head = new Element("head");
        tb.push(html);
        tb.push(head);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // head is in body insertion mode for fragments
    }

    @Test
    public void testResetInsertionModeInTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element table = new Element("table");
        tb.push(html);
        tb.push(table);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionModeInSelect() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element select = new Element("select");
        tb.push(html);
        tb.push(select);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionModeInCell() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element tr = new Element("tr");
        Element td = new Element("td");
        tb.push(table);
        tb.push(tr);
        tb.push(td);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionModeInRow() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element tbody = new Element("tbody");
        Element tr = new Element("tr");
        tb.push(table);
        tb.push(tbody);
        tb.push(tr);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionModeInTableBody() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element tbody = new Element("tbody");
        tb.push(table);
        tb.push(tbody);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionModeInCaption() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element caption = new Element("caption");
        tb.push(table);
        tb.push(caption);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionModeInColumnGroup() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element colgroup = new Element("colgroup");
        tb.push(table);
        tb.push(colgroup);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionModeInFrameset() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element frameset = new Element("frameset");
        tb.push(html);
        tb.push(frameset);
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element div = new Element("div");
        Element p = new Element("p");
        tb.push(html);
        tb.push(body);
        tb.push(div);
        tb.push(p);
        assertTrue(tb.inScope("p"));
        assertTrue(tb.inScope("div"));
        assertTrue(tb.inScope("body"));
        assertTrue(tb.inScope("html"));
        assertFalse(tb.inScope("table")); // not in scope
    }

    @Test
    public void testInScopeWithExtras() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element ul = new Element("ul");
        Element li = new Element("li");
        tb.push(html);
        tb.push(body);
        tb.push(ul);
        tb.push(li);
        assertTrue(tb.inScope("li"));
        assertTrue(tb.inScope("ul"));
        assertTrue(tb.inScope("body"));
        assertTrue(tb.inScope("html"));
        assertFalse(tb.inScope("table", new String[]{"ul"})); // table is not in scope, even with ul
        assertTrue(tb.inScope("ol", new String[]{"ul"})); // ol is in scope due to extras
    }

    @Test
    public void testInListItemScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element ul = new Element("ul");
        Element li = new Element("li");
        tb.push(html);
        tb.push(body);
        tb.push(ul);
        tb.push(li);
        assertTrue(tb.inListItemScope("li"));
        assertTrue(tb.inListItemScope("ul"));
        assertTrue(tb.inListItemScope("ol")); // ol is in ListItemScope
        assertFalse(tb.inListItemScope("div"));
    }

    @Test
    public void testInButtonScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element button = new Element("button");
        tb.push(html);
        tb.push(body);
        tb.push(button);
        assertTrue(tb.inButtonScope("button"));
        assertTrue(tb.inButtonScope("a")); // a is in button scope
        assertFalse(tb.inButtonScope("div"));
    }

    @Test
    public void testInTableScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element table = new Element("table");
        tb.push(html);
        tb.push(table);
        assertTrue(tb.inTableScope("table"));
        assertTrue(tb.inTableScope("html"));
        assertFalse(tb.inTableScope("body"));
    }

    @Test
    public void testInSelectScope() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element select = new Element("select");
        Element option = new Element("option");
        tb.push(html);
        tb.push(select);
        tb.push(option);
        assertTrue(tb.inSelectScope("option"));
        assertTrue(tb.inSelectScope("select"));
        assertFalse(tb.inSelectScope("body"));
    }

    @Test
    public void testSetAndGetHeadElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element head = new Element("head");
        tb.setHeadElement(head);
        assertEquals(head, tb.getHeadElement());
    }

    @Test
    public void testSetAndGetFormElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        tb.setFormElement(form);
        assertEquals(form, tb.getFormElement());
    }

    @Test
    public void testNewPendingTableCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.newPendingTableCharacters();
        assertNotNull(tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void testSetPendingTableCharacters() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<String> chars = new ArrayList<>();
        chars.add("a");
        chars.add("b");
        tb.setPendingTableCharacters(chars);
        assertEquals(chars, tb.getPendingTableCharacters());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element p = new Element("p");
        Element div = new Element("div");
        tb.push(html);
        tb.push(body);
        tb.push(p);
        tb.push(div);
        tb.generateImpliedEndTags(); // Should close div and p
        assertEquals(2, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(body, tb.getStack().get(1));
    }

    @Test
    public void testGenerateImpliedEndTagsExcludeTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element p = new Element("p");
        Element div = new Element("div");
        tb.push(html);
        tb.push(body);
        tb.push(p);
        tb.push(div);
        tb.generateImpliedEndTags("p"); // Should close div but not p
        assertEquals(3, tb.getStack().size());
        assertEquals(html, tb.getStack().get(0));
        assertEquals(body, tb.getStack().get(1));
        assertEquals(p, tb.getStack().get(2));
    }

    @Test
    public void testIsSpecialTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        Element body = new Element("body");
        Element applet = new Element("applet");
        Element div = new Element("div");
        tb.push(html);
        tb.push(body);
        assertTrue(tb.isSpecial(body));
        assertTrue(tb.isSpecial(applet));
        assertFalse(tb.isSpecial(div));
    }

    @Test
    public void testLastFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.lastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
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
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        Element el3 = new Element("u");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.pushActiveFormattingElements(el3);
        assertEquals(3, tb.formattingElements.size());
        assertEquals(el1, tb.formattingElements.get(0));
        assertEquals(el2, tb.formattingElements.get(1));
        assertEquals(el3, tb.formattingElements.get(2));
    }

    @Test
    public void testPushActiveFormattingElementsWithDuplicate() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        Element el3 = new Element("b"); // Duplicate of el1
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.pushActiveFormattingElements(el3);
        assertEquals(3, tb.formattingElements.size());
        assertEquals(el1, tb.formattingElements.get(0)); // el1 should be gone
        assertEquals(el2, tb.formattingElements.get(1));
        assertEquals(el3, tb.formattingElements.get(2));
    }

    @Test
    public void testPushActiveFormattingElementsWithThreeDuplicates() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("b");
        Element el3 = new Element("b");
        Element el4 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.pushActiveFormattingElements(el3);
        tb.pushActiveFormattingElements(el4); // This should remove el1
        assertEquals(3, tb.formattingElements.size());
        assertEquals(el2, tb.formattingElements.get(0));
        assertEquals(el3, tb.formattingElements.get(1));
        assertEquals(el4, tb.formattingElements.get(2));
    }

    @Test
    public void testReconstructFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element b = new Element("b");
        Element i = new Element("i");
        tb.pushActiveFormattingElements(b);
        tb.pushActiveFormattingElements(i);
        tb.push(b); // Add to stack
        tb.push(i); // Add to stack
        tb.reconstructFormattingElements(); // Should create new b and i, and insert them.
        assertEquals(2, tb.formattingElements.size());
        assertTrue(tb.formattingElements.get(0) instanceof Element);
        assertTrue(tb.formattingElements.get(1) instanceof Element);
        assertEquals("b", tb.formattingElements.get(0).nodeName());
        assertEquals("i", tb.formattingElements.get(1).nodeName());
        assertEquals(3, tb.getStack().size()); // html, body, b (new b)
        assertEquals("b", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        tb.pushActiveFormattingElements(el1);
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(el2);
        tb.clearFormattingElementsToLastMarker();
        assertTrue(tb.formattingElements.isEmpty());
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.removeFromActiveFormattingElements(el1);
        assertEquals(1, tb.formattingElements.size());
        assertEquals(el2, tb.formattingElements.get(0));
    }

    @Test
    public void testIsInActiveFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        tb.pushActiveFormattingElements(el1);
        assertTrue(tb.isInActiveFormattingElements(el1));
        assertFalse(tb.isInActiveFormattingElements(el2));
    }

    @Test
    public void testGetActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        assertEquals(el2, tb.getActiveFormattingElement("i"));
        assertEquals(el1, tb.getActiveFormattingElement("b"));
        assertNull(tb.getActiveFormattingElement("u"));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        Element el2 = new Element("i");
        Element newEl1 = new Element("strong");
        tb.pushActiveFormattingElements(el1);
        tb.pushActiveFormattingElements(el2);
        tb.replaceActiveFormattingElement(el1, newEl1);
        assertEquals(2, tb.formattingElements.size());
        assertEquals(newEl1, tb.formattingElements.get(0));
        assertEquals(el2, tb.formattingElements.get(1));
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element el1 = new Element("b");
        tb.pushActiveFormattingElements(el1);
        tb.insertMarkerToFormattingElements();
        assertEquals(2, tb.formattingElements.size());
        assertEquals(el1, tb.formattingElements.get(0));
        assertNull(tb.formattingElements.get(1));
    }

    @Test
    public void testInsertInFosterParent() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element table = new Element("table");
        Element parent = new Element("div");
        parent.appendChild(table);
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        tb.push(parent); // Parent on stack
        tb.setFosterInserts(true);
        Element newNode = new Element("p");
        tb.insertNode(newNode); // Should insert into parent due to fosterInserts
        assertEquals(2, parent.childNodes().size());
        assertEquals(table, parent.child(0));
        assertEquals(newNode, parent.child(1));
    }

    @Test
    public void testInsertInFosterParent_noTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element html = new Element("html");
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        tb.push(html);
        tb.setFosterInserts(true); // Foster inserts should default to appending to current element if no table context
        Element newNode = new Element("p");
        tb.insertNode(newNode);
        assertEquals(1, html.childNodes().size());
        assertEquals(newNode, html.child(0));
    }

    @Test
    public void testToString() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        String expected = "TreeBuilder{currentToken=null, state=Initial, currentElement=null}";
        assertEquals(expected, tb.toString());
    }

    @Test
    public void testProcessUnknownStartTag() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "div";
        startTag.attributes.put("id", "test");
        tb.process(startTag);
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        Element div = tb.getDocument().getElementById("test");
        assertNotNull(div);
        assertEquals("div", div.nodeName());
    }

    @Test
    public void testProcessCommentToken() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.Comment comment = new Token.Comment();
        comment.data = "My Comment";
        tb.process(comment);
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof Comment);
        assertEquals("<!--My Comment-->", tb.getDocument().childNodes().get(0).outerHtml());
    }

    @Test
    public void testProcessDoctypeToken() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.Doctype doctype = new Token.Doctype();
        doctype.name = "html";
        doctype.publicIdentifier = "-//W3C//DTD XHTML 1.0 Strict//EN";
        doctype.systemIdentifier = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd";
        doctype.quirksMode = false;
        tb.process(doctype);
        assertEquals(HtmlTreeBuilderState.BeforeHtml, tb.state());
        assertEquals(1, tb.getDocument().childNodes().size());
        assertTrue(tb.getDocument().childNodes().get(0) instanceof DocumentType);
        DocumentType dt = (DocumentType) tb.getDocument().childNodes().get(0);
        assertEquals("html", dt.name());
        assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", dt.publicId());
        assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", dt.systemId());
    }

    @Test
    public void testProcessDoctypeTokenQuirksMode() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.Doctype doctype = new Token.Doctype();
        doctype.name = "html";
        doctype.publicIdentifier = "-//W3C//DTD HTML 4.01 Transitional//EN";
        doctype.systemIdentifier = "http://www.w3.org/TR/html4/loose.dtd";
        doctype.quirksMode = true; // Force quirks mode
        tb.process(doctype);
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void testProcessStartTagCreatesNewElement() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "div";
        startTag.attributes.put("class", "test");
        Element element = tb.insert(startTag);
        assertEquals("div", element.tagName());
        assertEquals("test", element.className());
        assertTrue(tb.onStack(element));
    }

    @Test
    public void testProcessStartTagInFragmentMode() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        tb.fragmentParsing = true;
        Element context = new Element("body");
        tb.contextElement = context;
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "span";
        Element element = tb.insert(startTag);
        assertEquals("span", element.tagName());
        assertEquals(context, element.parent()); // Should be child of context element
        assertTrue(tb.onStack(element));
    }

    @Test
    public void testProcessEndTagRemovesElementFromStack() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element div = new Element("div");
        tb.push(div);
        Token.EndTag endTag = new Token.EndTag();
        endTag.name = "div";
        tb.process(endTag);
        assertFalse(tb.onStack(div));
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testProcessEndTagNotOnStack() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), tb.defaultSettings());
        Element div = new Element("div");
        Token.EndTag endTag = new Token.EndTag();
        endTag.name = "div";
        // Process end tag without div on stack, should not crash
        tb.process(endTag);
        assertEquals(0, tb.getStack().size());
    }
}
