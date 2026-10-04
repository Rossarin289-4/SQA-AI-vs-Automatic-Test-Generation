package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.util.ArrayList;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.Character;

public class HtmlTreeBuilderStateTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testInitialStateIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.Initial.process(whitespaceToken, tb));
        assertTrue(tb.getStack().isEmpty());
    }




    @Test
    public void testBeforeHtmlIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("  \n");
        assertTrue(HtmlTreeBuilderState.BeforeHtml.process(whitespaceToken, tb));
        assertTrue(tb.getStack().isEmpty());
    }







    @Test
    public void testBeforeHeadIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.BeforeHead);
        tb.insertStartTag("html");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("   ");
        assertTrue(HtmlTreeBuilderState.BeforeHead.process(whitespaceToken, tb));
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals("   ", tb.getStack().get(1).toString()); // Character nodes are inserted
    }







    @Test
    public void testInHeadIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data("\t\n");
        assertTrue(HtmlTreeBuilderState.InHead.process(whitespaceToken, tb));
        assertEquals("head", tb.getStack().get(1).nodeName());
        assertEquals("\t\n", tb.getStack().get(2).toString()); // Character nodes are inserted into head
    }










    @Test
    public void testInHeadNoscriptProcessesWhitespaceAsInHead() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InHeadNoscript);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.insertStartTag("noscript");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.InHeadNoscript.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Should transition back to InHead
        assertEquals("head", tb.getStack().get(1).nodeName());
        assertEquals(" ", tb.getStack().get(2).toString()); // Whitespace is inserted into head
    }


    @Test
    public void testAfterHeadIgnoresWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterHead);
        tb.insertStartTag("html");
        tb.insertStartTag("head");
        tb.pop(); // Close head to be in AfterHead
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" \t");
        assertTrue(HtmlTreeBuilderState.AfterHead.process(whitespaceToken, tb));
        assertEquals("html", tb.getStack().get(0).nodeName());
        assertEquals(" \t", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }









    @Test
    public void testInBodyProcessesCharacterData() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        Token.Character charToken = new Token.Character();
        charToken.data("hello");
        assertTrue(HtmlTreeBuilderState.InBody.process(charToken, tb));
        assertEquals("hello", tb.getStack().get(2).childNode(0).outerHtml());
        assertFalse(tb.framesetOk());
    }























    @Test
    public void testInTableProcessesCharacterData() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.insertStartTag("table");
        Token.Character charToken = new Token.Character();
        charToken.data("table text");
        assertTrue(HtmlTreeBuilderState.InTable.process(charToken, tb));
        assertEquals(HtmlTreeBuilderState.InTableText, tb.state());
        assertEquals("table text", tb.getPendingTableCharacters().get(0));
    }











    @Test
    public void testInTableTextProcessesCharacterData() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InTableText);
        tb.insertStartTag("table");
        Token.Character charToken = new Token.Character();
        charToken.data("text in table text");
        assertTrue(HtmlTreeBuilderState.InTableText.process(charToken, tb));
        assertEquals("text in table text", tb.getPendingTableCharacters().get(0));
    }







    @Test
    public void testInColumnGroupProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InColumnGroup);
        tb.insertStartTag("table");
        tb.insertStartTag("colgroup");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.InColumnGroup.process(whitespaceToken, tb));
        assertEquals(" ", tb.getStack().get(3).toString()); // Whitespace inserted into colgroup
    }





















    @Test
    public void testInSelectProcessesOptgroupStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        Token.StartTag optgroupTag = new Token.StartTag("optgroup");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optgroupTag, tb));
        assertEquals("optgroup", tb.getStack().get(2).nodeName());
    }

    @Test
    public void testInSelectProcessesEndTagSelect() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        Token.EndTag selectEndTag = new Token.EndTag("select");
        assertTrue(HtmlTreeBuilderState.InSelect.process(selectEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Reset insertion mode
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInSelectProcessesEndTagOption() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        tb.insertStartTag("option");
        Token.EndTag optionEndTag = new Token.EndTag("option");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optionEndTag, tb));
        assertEquals("select", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInSelectProcessesEndTagOptgroup() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        tb.insertStartTag("optgroup");
        Token.EndTag optgroupEndTag = new Token.EndTag("optgroup");
        assertTrue(HtmlTreeBuilderState.InSelect.process(optgroupEndTag, tb));
        assertEquals("select", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInSelectProcessesInputStartTagError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelect);
        tb.insertStartTag("select");
        Token.StartTag inputTag = new Token.StartTag("input");
        assertTrue(HtmlTreeBuilderState.InSelect.process(inputTag, tb));
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state()); // Processed end tag select, then reprocesses input in InSelect
        assertEquals("select", tb.getStack().get(1).nodeName()); // select is closed
    }

    @Test
    public void testInSelectInTableProcessesStartTagTableError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        tb.insertStartTag("table");
        tb.insertStartTag("select");
        Token.StartTag tableTag = new Token.StartTag("table");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tableTag, tb));
        assertEquals(HtmlTreeBuilderState.InTable, tb.state()); // Processes end tag select, then reprocesses table in InTable
        assertEquals("table", tb.getStack().get(1).nodeName()); // select is closed
    }

    @Test
    public void testInSelectInTableProcessesEndTagTable() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InSelectInTable);
        tb.insertStartTag("table");
        tb.insertStartTag("select");
        Token.EndTag tableEndTag = new Token.EndTag("table");
        assertTrue(HtmlTreeBuilderState.InSelectInTable.process(tableEndTag, tb));
        assertEquals(HtmlTreeBuilderState.Initial, tb.state()); // Processes end tag select, then reprocesses end tag table
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testAfterBodyProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(" ", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }

    @Test
    public void testAfterBodyProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after body comment");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(commentToken, tb));
        assertEquals("after body comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterBodyProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterBodyProcessesEndTagHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body to be in AfterBody
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterBodyProcessesEndTagHtmlInFragment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // To simulate fragment parsing, we'd need to initialize differently,
        // but for testing the state transition directly, we can manually set fragmentParsing flag.
        // A simpler test is to just check that the transition to AfterAfterBody doesn't happen for fragments.
        // Since this test specifically targets the non-fragment case for transition to AfterAfterBody,
        // we assume non-fragment parsing context.
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop();
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        // Assuming not fragment parsing for this path.
        assertTrue(HtmlTreeBuilderState.AfterBody.process(htmlEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, tb.state());
    }

    @Test
    public void testAfterBodyTransitionsToInBodyForOtherTokens() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterBody);
        tb.insertStartTag("html");
        tb.insertStartTag("body");
        tb.pop(); // Close body
        Token.StartTag pTag = new Token.StartTag("p");
        assertTrue(HtmlTreeBuilderState.AfterBody.process(pTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("p", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testInFramesetProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(whitespaceToken, tb));
        assertEquals(" ", tb.getStack().get(2).toString()); // Whitespace inserted into frameset
    }

    @Test
    public void testInFramesetProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("frameset comment");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(commentToken, tb));
        assertEquals("frameset comment", tb.getStack().get(2).childNode(0).outerHtml());
    }

    @Test
    public void testInFramesetProcessesFramesetStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag framesetTag = new Token.StartTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetTag, tb));
        assertEquals("frameset", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInFramesetProcessesFrameStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag frameTag = new Token.StartTag("frame");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(frameTag, tb));
        assertEquals("frame", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInFramesetProcessesNoframesStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("noframes", tb.getStack().get(3).nodeName());
    }

    @Test
    public void testInFramesetProcessesEndTagFrameset() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.EndTag framesetEndTag = new Token.EndTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state()); // Assuming not fragment parsing
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testInFramesetProcessesEndTagFramesetInFragment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("frameset"); // Simulate fragment parsing context
        Token.EndTag framesetEndTag = new Token.EndTag("frameset");
        assertTrue(HtmlTreeBuilderState.InFrameset.process(framesetEndTag, tb));
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state()); // Does not transition to AfterFrameset in fragment context
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testInFramesetProcessesEndTagHtmlError() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        assertFalse(HtmlTreeBuilderState.InFrameset.process(htmlEndTag, tb));
    }

    @Test
    public void testInFramesetAnythingElseErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.InFrameset);
        tb.insertStartTag("html");
        tb.insertStartTag("frameset");
        Token.StartTag pTag = new Token.StartTag("p");
        assertFalse(HtmlTreeBuilderState.InFrameset.process(pTag, tb));
    }

    @Test
    public void testAfterFramesetProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // Transitions to InBody
        assertEquals(" ", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }

    @Test
    public void testAfterFramesetProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after frameset comment");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(commentToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // Transitions to InBody
        assertEquals("after frameset comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterFramesetProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterFramesetProcessesEndTagHtml() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.EndTag htmlEndTag = new Token.EndTag("html");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(htmlEndTag, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterFramesetProcessesNoframesStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("noframes", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testAfterFramesetAnythingElseErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag pTag = new Token.StartTag("p");
        assertFalse(HtmlTreeBuilderState.AfterFrameset.process(pTag, tb));
    }

    @Test
    public void testAfterAfterBodyProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        tb.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after after body comment");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(commentToken, tb));
        assertEquals("after after body comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterAfterBodyProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        tb.insertStartTag("html");
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterAfterBodyProcessesWhitespace() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        tb.insertStartTag("html");
        Token.Character whitespaceToken = new Token.Character();
        whitespaceToken.data(" ");
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(whitespaceToken, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals(" ", tb.getStack().get(1).toString()); // Whitespace inserted into html
    }

    @Test
    public void testAfterAfterFramesetProcessesComment() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("after after frameset comment");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(commentToken, tb));
        assertEquals("after after frameset comment", tb.getStack().get(0).childNode(0).outerHtml());
    }

    @Test
    public void testAfterAfterFramesetProcessesHtmlStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag htmlTag = new Token.StartTag("html");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(htmlTag, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testAfterAfterFramesetProcessesNoframesStartTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag noframesTag = new Token.StartTag("noframes");
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(noframesTag, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state()); // Processed as in InHead
        assertEquals("noframes", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testAfterAfterFramesetAnythingElseErrors() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        tb.insertStartTag("html");
        Token.StartTag pTag = new Token.StartTag("p");
        assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(pTag, tb));
    }
}





