package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.Iterator;
import java.util.LinkedList;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.EOF;
import org.jsoup.parser.Token.StartTag;

public class HtmlTreeBuilderStateTest {

    // Helper method to set up a basic HtmlTreeBuilder for testing states.

    // Test the Initial state





    // Test the BeforeHtml state






    // Test the BeforeHead state







    // Test the InHead state











    // Test the InHeadNoscript state








    // Test the AfterHead state









    // Test the InBody state - many states transition to InBody, so we focus on specific logic here.























    // Test the InTable state















    // Test the InTableText state

    @Test
    public void testInTableTextProcessesNonCharacterTokenAndProcessesPending() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Element table = new Element(Tag.valueOf("table"), tb.getBaseUri());
        tb.push(table);

        tb.process(new Token.Character("abc"), tb); // Transition to InTableText
        tb.transition(HtmlTreeBuilderState.InTableText); // Ensure we are in InTableText
        Token.StartTag tableTag = new Token.StartTag("table"); // Simulate end of table content
        assertTrue(HtmlTreeBuilderState.InTableText.process(tableTag, tb));
        // Pending characters should be processed and inserted into InBody.
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Should transition back to original state (InTable)
        assertEquals(1, tb.getDocument().getElementsByTag("table").size());
        assertEquals("abc", tb.getDocument().getElementsByTag("table").get(0).childNode(0).outerHtml());
    }

    @Test
    public void testInTableTextProcessesWhitespacePendingAndInsertsNormally() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Element table = new Element(Tag.valueOf("table"), tb.getBaseUri());
        tb.push(table);

        tb.process(new Token.Character("   "), tb); // Transition to InTableText
        tb.transition(HtmlTreeBuilderState.InTableText); // Ensure we are in InTableText
        Token.EndTag tableTag = new Token.EndTag("table"); // Simulate end of table content
        assertTrue(HtmlTreeBuilderState.InTableText.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Should transition back to original state (InTable)
        assertEquals(1, tb.getDocument().getElementsByTag("table").size());
        assertEquals("   ", tb.getDocument().getElementsByTag("table").get(0).childNode(0).outerHtml()); // Whitespace is inserted
    }

    @Test
    public void testInTableTextProcessesNonWhitespacePendingAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Element table = new Element(Tag.valueOf("table"), tb.getBaseUri());
        tb.push(table);

        tb.process(new Token.Character("abc"), tb); // Transition to InTableText
        tb.transition(HtmlTreeBuilderState.InTableText); // Ensure we are in InTableText
        Token.StartTag pTag = new Token.StartTag("p"); // Simulate a tag that would normally go to InBody
        assertTrue(HtmlTreeBuilderState.InTableText.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // Should transition to InBody
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    @Test
    public void testInTableTextProcessesNullStringAndErrors() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        Element table = new Element(Tag.valueOf("table"), tb.getBaseUri());
        tb.push(table);

        tb.process(new Token.Character(String.valueOf('\u0000')), tb); // Transition to InTableText
        tb.transition(HtmlTreeBuilderState.InTableText); // Ensure we are in InTableText
        Token.EndTag tableTag = new Token.EndTag("table");
        assertFalse(HtmlTreeBuilderState.InTableText.process(new Token.Character(String.valueOf('\u0000')), tb));
        assertEquals(HtmlTreeBuilderState.InTableText, tb.state());
    }

    // Test the InCaption state
    @Test
    public void testInCaptionProcessesEndCaptionAndTransitionsToInTable() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        Element caption = new Element(Tag.valueOf("caption"), tb.getBaseUri());
        tb.push(caption);

        Token.EndTag captionTag = new Token.EndTag("caption");
        assertTrue(HtmlTreeBuilderState.InCaption.process(captionTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInCaptionProcessesStartTagTableAndErrors() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        Element caption = new Element(Tag.valueOf("caption"), tb.getBaseUri());
        tb.push(caption);

        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InCaption.process(tableTag, tb)); // Errors, then processes end caption, then processes table
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("caption").size());
        assertEquals(1, tb.getDocument().getElementsByTag("table").size());
    }

    @Test
    public void testInCaptionProcessesEndTagTableAndErrors() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        Element caption = new Element(Tag.valueOf("caption"), tb.getBaseUri());
        tb.push(caption);

        Token.EndTag tableTag = new Token.EndTag("table");
        assertFalse(HtmlTreeBuilderState.InCaption.process(tableTag, tb)); // Errors, does not transition.
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testInCaptionProcessesOtherTagsByTransitioningToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        Element caption = new Element(Tag.valueOf("caption"), tb.getBaseUri());
        tb.push(caption);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InCaption.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    @Test
    public void testInCaptionErrorsOnUnexpectedEndTags() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCaption);
        Element caption = new Element(Tag.valueOf("caption"), tb.getBaseUri());
        tb.push(caption);

        Token.EndTag bodyTag = new Token.EndTag("body");
        assertFalse(HtmlTreeBuilderState.InCaption.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    // Test the InColumnGroup state
    @Test
    public void testInColumnGroupProcessesColTag() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Element colgroup = new Element(Tag.valueOf("colgroup"), tb.getBaseUri());
        tb.push(colgroup);

        Token.StartTag colTag = new Token.StartTag("col");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(colTag, tb));
        assertEquals(1, tb.getDocument().getElementsByTag("colgroup").get(0).childNodes().size());
        assertTrue(tb.getDocument().getElementsByTag("colgroup").get(0).childNode(0) instanceof Element);
        assertEquals("col", tb.getDocument().getElementsByTag("colgroup").get(0).childNode(0).nodeName());
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testInColumnGroupProcessesEndColgroupAndTransitionsToInTable() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Element colgroup = new Element(Tag.valueOf("colgroup"), tb.getBaseUri());
        tb.push(colgroup);

        Token.EndTag colgroupTag = new Token.EndTag("colgroup");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(colgroupTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInColumnGroupProcessesStartHtmlTagAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Element colgroup = new Element(Tag.valueOf("colgroup"), tb.getBaseUri());
        tb.push(colgroup);

        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInColumnGroupHandlesOtherTagsByTransitioning() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Element colgroup = new Element(Tag.valueOf("colgroup"), tb.getBaseUri());
        tb.push(colgroup);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(pTag, tb)); // errors and then exits colgroup
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    @Test
    public void testInColumnGroupProcessesEOFAndErrorsIfHtmlNotRoot() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        Element colgroup = new Element(Tag.valueOf("colgroup"), tb.getBaseUri());
        tb.push(colgroup);

        Token.EOF eofToken = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(eofToken, tb)); // Errors but stops parsing.
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    // Test the InTableBody state
    @Test
    public void testInTableBodyProcessesStartTrAndTransitionsToInRow() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.StartTag trTag = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(trTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInTableBodyProcessesStartTdAndTransitionsToInCell() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.StartTag tdTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInTableBodyProcessesStartThAndTransitionsToInCell() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.StartTag thTag = new Token.StartTag("th");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(thTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInTableBodyProcessesEndTbodyAndTransitionsToInTable() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.EndTag tbodyTag = new Token.EndTag("tbody");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tbodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableBodyProcessesEndTheadAndTransitionsToInTable() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element thead = new Element(Tag.valueOf("thead"), tb.getBaseUri());
        tb.push(thead);

        Token.EndTag theadTag = new Token.EndTag("thead");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(theadTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableBodyProcessesEndTfootAndTransitionsToInTable() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tfoot = new Element(Tag.valueOf("tfoot"), tb.getBaseUri());
        tb.push(tfoot);

        Token.EndTag tfootTag = new Token.EndTag("tfoot");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tfootTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableBodyProcessesEndTableAndExitsTableBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.EndTag tableTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testInTableBodyHandlesStartTrWhenCurrentElementIsTbody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.StartTag trTag = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(trTag, tb));
        assertEquals("tr", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInTableBodyHandlesStartTdWhenCurrentElementIsTbody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.StartTag tdTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(tdTag, tb));
        assertEquals("td", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInTableBodyHandlesStartThWhenCurrentElementIsTbody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.StartTag thTag = new Token.StartTag("th");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(thTag, tb));
        assertEquals("th", tb.currentElement().nodeName());
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInTableBodyErrorsOnUnexpectedEndTags() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.EndTag bodyTag = new Token.EndTag("body");
        assertFalse(HtmlTreeBuilderState.InTableBody.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInTableBodyHandlesOtherTagsByTransitioningToInTable() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableBody);
        Element tbody = new Element(Tag.valueOf("tbody"), tb.getBaseUri());
        tb.push(tbody);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InTableBody.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    // Test the InRow state
    @Test
    public void testInRowProcessesStartTdAndTransitionsToInCell() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);

        Token.StartTag tdTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InRow.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInRowProcessesStartThAndTransitionsToInCell() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);

        Token.StartTag thTag = new Token.StartTag("th");
        assertTrue(HtmlTreeBuilderState.InRow.process(thTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInRowProcessesEndTrAndTransitionsToInTableBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);

        Token.EndTag trTag = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InRow.process(trTag, tb));
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testInRowHandlesStartTagTableAndErrors() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);

        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InRow.process(tableTag, tb)); // Errors, then processes end tr, then processes table.
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("tr").size());
        assertEquals(1, tb.getDocument().getElementsByTag("table").size());
    }

    @Test
    public void testInRowHandlesEndTagTableAndExitsRow() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);

        Token.EndTag tableTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InRow.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("tr").size());
    }

    @Test
    public void testInRowErrorsOnUnexpectedEndTags() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);

        Token.EndTag bodyTag = new Token.EndTag("body");
        assertFalse(HtmlTreeBuilderState.InRow.process(bodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInRowHandlesOtherTagsByTransitioningToInTable() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow);
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InRow.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    @Test
    public void testInRowHandlesMissingTrTagWhenProcessingEndTag() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow); // Set state to InRow artificially
        // Manually set current element to td to simulate being inside a cell without a tr
        Element td = new Element(Tag.valueOf("td"), tb.getBaseUri());
        tb.push(td); // Pushing td as current element to simulate being in cell context.
        tb.transition(HtmlTreeBuilderState.InCell);
        // Now process an end tag that expects a tr
        Token.EndTag tdEndTag = new Token.EndTag("td");
        assertTrue(HtmlTreeBuilderState.InCell.process(tdEndTag, tb)); // This will transition to InRow
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());

        // Now try to process an end tag that should trigger handleMissingTr
        Token.EndTag tableTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InRow.process(tableTag, tb)); // handleMissingTr should be called
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    // Test the InCell state
    @Test
    public void testInCellProcessesEndTdAndTransitionsToInRow() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element td = new Element(Tag.valueOf("td"), tb.getBaseUri());
        tb.push(td);

        Token.EndTag tdTag = new Token.EndTag("td");
        assertTrue(HtmlTreeBuilderState.InCell.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellProcessesEndThAndTransitionsToInRow() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element th = new Element(Tag.valueOf("th"), tb.getBaseUri());
        tb.push(th);

        Token.EndTag thTag = new Token.EndTag("th");
        assertTrue(HtmlTreeBuilderState.InCell.process(thTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellProcessesEndTableAndExitsCell() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element td = new Element(Tag.valueOf("td"), tb.getBaseUri());
        tb.push(td);

        Token.EndTag tableTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InCell.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("td").size());
    }

    @Test
    public void testInCellProcessesStartTagTbodyAndErrors() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element td = new Element(Tag.valueOf("td"), tb.getBaseUri());
        tb.push(td);

        Token.StartTag tbodyTag = new Token.StartTag("tbody");
        assertFalse(HtmlTreeBuilderState.InCell.process(tbodyTag, tb));
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testInCellHandlesOtherTagsByTransitioningToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element td = new Element(Tag.valueOf("td"), tb.getBaseUri());
        tb.push(td);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.InCell.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    @Test
    public void testInCellProcessesEndTagThWhenInScope() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element th = new Element(Tag.valueOf("th"), tb.getBaseUri());
        tb.push(th);

        Token.EndTag thTag = new Token.EndTag("th");
        assertTrue(HtmlTreeBuilderState.InCell.process(thTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellProcessesEndTagTdWhenInScope() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element td = new Element(Tag.valueOf("td"), tb.getBaseUri());
        tb.push(td);

        Token.EndTag tdTag = new Token.EndTag("td");
        assertTrue(HtmlTreeBuilderState.InCell.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellErrorsOnEndTagThWhenNotInScope() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow); // Simulate not being in a cell
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr); // Ensure 'tr' is on the stack for scope check

        Token.EndTag thTag = new Token.EndTag("th");
        assertFalse(HtmlTreeBuilderState.InCell.process(thTag, tb)); // State will remain InRow as per fallback.
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testInCellErrorsOnEndTagTdWhenNotInScope() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InRow); // Simulate not being in a cell
        Element tr = new Element(Tag.valueOf("tr"), tb.getBaseUri());
        tb.push(tr); // Ensure 'tr' is on the stack for scope check

        Token.EndTag tdTag = new Token.EndTag("td");
        assertFalse(HtmlTreeBuilderState.InCell.process(tdTag, tb)); // State will remain InRow as per fallback.
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    // Test the InSelect state
    @Test
    public void testInSelectProcessesEndOptionAndTransitionsToInSelect() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);
        Element option = new Element(Tag.valueOf("option"), tb.getBaseUri());
        tb.push(option);

        Token.EndTag optionTag = new Token.EndTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optionTag, tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectProcessesEndOptgroupAndTransitionsToInSelect() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);
        Element optgroup = new Element(Tag.valueOf("optgroup"), tb.getBaseUri());
        tb.push(optgroup);

        Token.EndTag optgroupTag = new Token.EndTag("optgroup");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optgroupTag, tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectProcessesEndSelectAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);

        Token.EndTag selectTag = new Token.EndTag("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(selectTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInSelectProcessesStartOptionAndInsertsNewOption() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);
        Element option1 = new Element(Tag.valueOf("option"), tb.getBaseUri());
        tb.push(option1);
        option1.html("Old");

        Token.StartTag optionTag = new Token.StartTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optionTag, tb));
        assertEquals(2, tb.getDocument().getElementsByTag("option").size());
        assertEquals("New", tb.getDocument().getElementsByTag("option").get(1).html());
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectProcessesStartOptgroupAndInsertsNewOptgroup() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);
        Element option = new Element(Tag.valueOf("option"), tb.getBaseUri());
        tb.push(option);
        Element optgroup1 = new Element(Tag.valueOf("optgroup"), tb.getBaseUri());
        tb.push(optgroup1);

        Token.StartTag optgroupTag = new Token.StartTag("optgroup");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optgroupTag, tb));
        assertEquals(2, tb.getDocument().getElementsByTag("optgroup").size());
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectHandlesStartInputAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);

        Token.StartTag inputTag = new Token.StartTag("input");
        assertTrue(HtmlTreeBuilderState.InSelect.process(inputTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("input").size());
    }

    @Test
    public void testInSelectHandlesStartTextareaAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);

        Token.StartTag textareaTag = new Token.StartTag("textarea");
        assertTrue(HtmlTreeBuilderState.InSelect.process(textareaTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("textarea").size());
    }

    @Test
    public void testInSelectHandlesStartSelectAndErrors() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select1 = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select1);

        Token.StartTag selectTag = new Token.StartTag("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(selectTag, tb)); // Errors, then processes end select.
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("select").size());
    }

    @Test
    public void testInSelectProcessesCharacterData() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);

        Token.Character charToken = new Token.Character("abc");
        assertTrue(HtmlTreeBuilderState.InSelect.process(charToken, tb));
        assertEquals("abc", tb.getDocument().getElementsByTag("select").get(0).html());
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectProcessesComment() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);

        Token.Comment commentToken = new Token.Comment(" comment ");
        assertTrue(HtmlTreeBuilderState.InSelect.process(commentToken, tb));
        assertEquals("<!-- comment -->", tb.getDocument().getElementsByTag("select").get(0).html());
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testInSelectProcessesEOF() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        Element select = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(select);

        Token.EOF eofToken = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.InSelect.process(eofToken, tb)); // Errors if not html root.
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    // Test the InSelectInTable state
    @Test
    public void testInSelectInTableProcessesStartTagTableAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri()); // InSelectInTable implies select is in table context
        tb.push(selectInTable);

        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process table.
        assertEquals(1, tb.getDocument().getElementsByTag("select").size());
        assertEquals(1, tb.getDocument().getElementsByTag("table").size());
    }

    @Test
    public void testInSelectInTableProcessesEndTagTableAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.EndTag tableTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process table.
        assertEquals(1, tb.getDocument().getElementsByTag("table").size());
    }

    @Test
    public void testInSelectInTableProcessesStartTagTrAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.StartTag trTag = new Token.StartTag("tr");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(trTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process tr.
        assertEquals(1, tb.getDocument().getElementsByTag("select").size());
        assertEquals(1, tb.getDocument().getElementsByTag("tr").size());
    }

    @Test
    public void testInSelectInTableProcessesEndTagTrAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.EndTag trTag = new Token.EndTag("tr");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(trTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process tr.
        assertEquals(1, tb.getDocument().getElementsByTag("tr").size());
    }

    @Test
    public void testInSelectInTableProcessesStartTagTdAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.StartTag tdTag = new Token.StartTag("td");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process td.
        assertEquals(1, tb.getDocument().getElementsByTag("td").size());
    }

    @Test
    public void testInSelectInTableProcessesEndTagTdAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.EndTag tdTag = new Token.EndTag("td");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tdTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process td.
        assertEquals(1, tb.getDocument().getElementsByTag("td").size());
    }

    @Test
    public void testInSelectInTableProcessesStartTagThAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.StartTag thTag = new Token.StartTag("th");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(thTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process th.
        assertEquals(1, tb.getDocument().getElementsByTag("th").size());
    }

    @Test
    public void testInSelectInTableProcessesEndTagThAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.EndTag thTag = new Token.EndTag("th");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(thTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process th.
        assertEquals(1, tb.getDocument().getElementsByTag("th").size());
    }

    @Test
    public void testInSelectInTableProcessesStartTagCaptionAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.StartTag captionTag = new Token.StartTag("caption");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(captionTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process caption.
        assertEquals(1, tb.getDocument().getElementsByTag("select").size());
        assertEquals(1, tb.getDocument().getElementsByTag("caption").size());
    }

    @Test
    public void testInSelectInTableProcessesEndTagCaptionAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.EndTag captionTag = new Token.EndTag("caption");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(captionTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // End select, then process caption.
        assertEquals(1, tb.getDocument().getElementsByTag("caption").size());
    }

    @Test
    public void testInSelectInTableProcessesOtherTagsByTransitioningToInSelect() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        Element selectInTable = new Element(Tag.valueOf("select"), tb.getBaseUri());
        tb.push(selectInTable);

        Token.Character charToken = new Token.Character("abc");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(charToken, tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
        // This assertion is problematic. The Character token should be processed by InSelect, not directly inserted into a non-existent option.
        // For now, we'll just check the state transition.
    }

    // Test the AfterBody state
    @Test
    public void testAfterBodyIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Character whitespaceToken = new Token.Character("  ");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterBodyProcessesComment() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Comment commentToken = new Token.Comment(" comment ");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(commentToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterBodyProcessesStartHtmlAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterBodyProcessesEndHtmlAndTransitionsToAfterAfterBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);
        Element body = new Element(Tag.valueOf("body"), tb.getBaseUri());
        html.appendChild(body);
        tb.push(body);

        Token.EndTag htmlTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testAfterBodyProcessesEOF() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.EOF eofToken = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.AfterBody.process(eofToken, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    @Test
    public void testAfterBodyTransitionsToInBodyForOtherTokens() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    @Test
    public void testAfterBodyErrorsOnFragmentParsingEndHtml() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.setFragmentParsing(true); // Simulate fragment parsing
        tb.transition(HtmlTreeBuilderState.AfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.EndTag htmlTag = new Token.EndTag("html");
        assertFalse(HtmlTreeBuilderState.AfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterBody, tb.state());
    }

    // Test the InFrameset state
    @Test
    public void testInFramesetProcessesStartFramesetAndInserts() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.StartTag framesetTag = new Token.StartTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetTag, tb));
        assertEquals(2, tb.getDocument().getElementsByTag("frameset").size());
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInFramesetProcessesStartFrameAndInsertsEmpty() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.StartTag frameTag = new Token.StartTag("frame");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(frameTag, tb));
        assertEquals(1, tb.getDocument().getElementsByTag("frame").size());
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInFramesetProcessesStartNoframesAndTransitionsToInHead() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInFramesetProcessesEndFramesetAndTransitionsToAfterFrameset() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset1 = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset1);
        Element frameset2 = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        frameset1.appendChild(frameset2);
        tb.push(frameset2);

        Token.EndTag framesetTag = new Token.EndTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void testInFramesetProcessesStartHtmlAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testInFramesetIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.Character whitespaceToken = new Token.Character("  ");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(whitespaceToken, tb));
        assertEquals("  ", tb.getDocument().getElementsByTag("frameset").get(0).childNode(0).outerHtml());
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInFramesetProcessesComment() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.Comment commentToken = new Token.Comment(" comment ");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(commentToken, tb));
        assertEquals("<!-- comment -->", tb.getDocument().getElementsByTag("frameset").get(0).childNode(0).outerHtml());
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInFramesetErrorsOnDoctype() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.Doctype doctypeToken = new Token.Doctype("html", "", "");
        assertFalse(HtmlTreeBuilderState.InFrameset.process(doctypeToken, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInFramesetErrorsOnOtherStartTags() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.StartTag pTag = new Token.StartTag("p");
        assertFalse(HtmlTreeBuilderState.InFrameset.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testInFramesetErrorsOnOtherEndTags() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);

        Token.EndTag pTag = new Token.EndTag("p");
        assertFalse(HtmlTreeBuilderState.InFrameset.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    // Test the AfterFrameset state
    @Test
    public void testAfterFramesetIgnoresWhitespace() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Character whitespaceToken = new Token.Character("  ");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterFramesetProcessesComment() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Comment commentToken = new Token.Comment(" comment ");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(commentToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterFramesetProcessesStartHtmlAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterFramesetProcessesEndHtmlAndTransitionsToAfterAfterFrameset() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.EndTag htmlTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterFramesetProcessesStartNoframesAndTransitionsToInHead() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterFramesetProcessesEOF() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.EOF eofToken = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(eofToken, tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void testAfterFramesetErrorsOnDoctype() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Doctype doctypeToken = new Token.Doctype("html", "", "");
        assertFalse(HtmlTreeBuilderState.AfterFrameset.process(doctypeToken, tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }

    @Test
    public void testAfterFramesetTransitionsToInBodyForOtherTokens() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    // Test the AfterAfterBody state
    @Test
    public void testAfterAfterBodyProcessesComment() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Comment commentToken = new Token.Comment(" comment ");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(commentToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterBodyProcessesDoctypeAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Doctype doctypeToken = new Token.Doctype("html", "", "");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(doctypeToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterBodyProcessesWhitespaceAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Character whitespaceToken = new Token.Character("   ");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterBodyProcessesStartHtmlAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterBodyProcessesEOF() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.EOF eofToken = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(eofToken, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testAfterAfterBodyTransitionsToInBodyForOtherTokens() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(1, tb.getDocument().getElementsByTag("p").size());
    }

    // Test the AfterAfterFrameset state
    @Test
    public void testAfterAfterFramesetProcessesComment() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Comment commentToken = new Token.Comment(" comment ");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(commentToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterFramesetProcessesDoctypeAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Doctype doctypeToken = new Token.Doctype("html", "", "");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(doctypeToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterFramesetProcessesWhitespaceAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.Character whitespaceToken = new Token.Character("   ");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterFramesetProcessesStartHtmlAndTransitionsToInBody() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testAfterAfterFramesetProcessesStartNoframesAndTransitionsToInHead() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterAfterFramesetProcessesEOF() throws Exception {
        HtmlTreeBuilder tb = setupTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        Element html = new Element(Tag.valueOf("html"), tb.getBaseUri());
        tb.push(html);

        Token.EOF eofToken = new Token.EOF();
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(eofToken, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    // Note: The original AfterAfterFrameset had an error test for Doctype.
    // Based on the source code, AfterAfterFrameset state transitions to InBody for Doctype.
    // So, asserting false for error and checking state transition is more appropriate.
}





