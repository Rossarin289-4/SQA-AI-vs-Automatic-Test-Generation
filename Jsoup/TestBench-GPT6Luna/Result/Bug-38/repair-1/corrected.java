package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.Iterator;
import java.util.LinkedList;

public class HtmlTreeBuilderStateTest {
    @Test
    public void testInitialWhitespace() throws Exception {
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Character(" "), new HtmlTreeBuilder()));
    }

    @Test
    public void testBeforeHtmlWhitespace() throws Exception {
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(new Token.Character("\t"), new HtmlTreeBuilder()));
    }

    @Test
    public void testBeforeHtmlUnexpectedEndTag() throws Exception {
        assertFalse(HtmlTreeBuilderState.BeforeHtml.process(new Token.EndTag("div"), new HtmlTreeBuilder()));
    }

    @Test
    public void testInBodyNullCharacter() throws Exception {
        assertFalse(HtmlTreeBuilderState.InBody.process(new Token.Character("\u0000"), new HtmlTreeBuilder()));
    }

    @Test
    public void testInBodyDoctype() throws Exception {
        assertFalse(HtmlTreeBuilderState.InBody.process(new Token.Doctype(), new HtmlTreeBuilder()));
    }

    @Test
    public void testForeignContentLeavesTokenUnprocessed() throws Exception {
        assertTrue(HtmlTreeBuilderState.ForeignContent.process(new Token.Character("x"), new HtmlTreeBuilder()));
    }

    @Test
    public void testInitialComment() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Initial.process(new Token.Comment(), builder));
    }

    @Test
    public void testInitialDoctypeTransitionsToBeforeHtml() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(HtmlTreeBuilderState.Initial.process(doctype, builder));
        assertEquals(HtmlTreeBuilderState.BeforeHtml, builder.state());
    }

    @Test
    public void testInBodyCreatesParagraphForUnmatchedEndTag() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.parse("<p></p>", "", null);
        assertEquals(1, builder.getDocument().select("body > p").size());
    }

    @Test
    public void testInBodyClosesParagraphBeforeDivision() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<p>a<div>b</div>", "");
        assertEquals(1, document.select("body > p").size());
        assertEquals("a", document.select("p").text());
        assertEquals("b", document.select("div").text());
    }

    @Test
    public void testInBodyClosesEarlierListItem() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<ul><li>a<li>b</ul>", "");
        assertEquals(2, document.select("ul > li").size());
        assertEquals("a", document.select("li").get(0).text());
        assertEquals("b", document.select("li").get(1).text());
    }

    @Test
    public void testInBodyHiddenInputDoesNotAddContent() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<input type=hidden>", "");
        assertEquals(1, document.select("input[type=hidden]").size());
    }

    @Test
    public void testInBodyImageIsParsedAsImg() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<image>", "");
        assertEquals(1, document.select("img").size());
        assertEquals(0, document.select("image").size());
    }

    @Test
    public void testInTableCreatesTableSectionsAndCells() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<table><tr><td>x</table>", "");
        assertEquals(1, document.select("table > tbody > tr > td").size());
        assertEquals("x", document.select("td").text());
    }

    @Test
    public void testInSelectClosesPriorOption() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = builder.parse("<select><option>a<option>b</select>", "");
        assertEquals(2, document.select("select > option").size());
        assertEquals("a", document.select("option").get(0).text());
        assertEquals("b", document.select("option").get(1).text());
    }

    @Test
    public void testTextStateInsertsCharacters() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertTrue(HtmlTreeBuilderState.Text.process(new Token.Character("text"), builder));
    }

    @Test
    public void testInTableTextQueuesCharacters() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.newPendingTableCharacters();
        assertTrue(HtmlTreeBuilderState.InTableText.process(new Token.Character("x"), builder));
        assertEquals(1, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testInTableTextRejectsNullCharacter() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.newPendingTableCharacters();
        assertFalse(HtmlTreeBuilderState.InTableText.process(new Token.Character("\u0000"), builder));
    }
}
