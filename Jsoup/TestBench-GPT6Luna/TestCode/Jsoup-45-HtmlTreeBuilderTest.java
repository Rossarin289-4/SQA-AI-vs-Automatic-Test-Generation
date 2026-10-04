package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }
    @Test
    public void testToStringNewBuilder() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertEquals("TreeBuilder{currentToken=null, state=null, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringShowsAssignedState() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.transition(HtmlTreeBuilderState.Initial);
        assertEquals("TreeBuilder{currentToken=null, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringChangesWithTransition() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.transition(HtmlTreeBuilderState.Initial);
        String initial = builder.toString();
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals("TreeBuilder{currentToken=null, state=InBody, currentElement=null}", builder.toString());
        assertFalse(initial.equals(builder.toString()));
    }

    @Test
    public void testToStringIncludesCurrentElementAfterPush() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element div = new Element(Tag.valueOf("div"), "");
        builder.push(div);
        assertEquals("TreeBuilder{currentToken=null, state=null, currentElement=<div></div>}", builder.toString());
    }

    @Test
    public void testToStringReflectsTopOfStack() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.push(new Element(Tag.valueOf("div"), ""));
        Element span = new Element(Tag.valueOf("span"), "");
        builder.push(span);
        assertEquals("TreeBuilder{currentToken=null, state=null, currentElement=<span></span>}", builder.toString());
    }

    @Test
    public void testToStringReflectsPop() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element div = new Element(Tag.valueOf("div"), "");
        builder.push(div);
        builder.push(new Element(Tag.valueOf("span"), ""));
        builder.pop();
        assertEquals("TreeBuilder{currentToken=null, state=null, currentElement=<div></div>}", builder.toString());
    }

    @Test
    public void testToStringReflectsAssignedToken() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.transition(HtmlTreeBuilderState.Initial);
        builder.process(new Token.Character().data("x"));
        assertEquals("TreeBuilder{currentToken=x, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringShowsLatestToken() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.transition(HtmlTreeBuilderState.Initial);
        builder.process(new Token.Character().data("a"));
        builder.process(new Token.Character().data("b"));
        assertEquals("TreeBuilder{currentToken=b, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringReflectsStateAfterProcessing() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.transition(HtmlTreeBuilderState.Initial);
        builder.process(new Token.Character().data("x"), HtmlTreeBuilderState.InBody);
        assertEquals("TreeBuilder{currentToken=x, state=Initial, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringWithNestedCurrentElement() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element outer = new Element(Tag.valueOf("div"), "");
        Element inner = new Element(Tag.valueOf("p"), "");
        outer.appendChild(inner);
        builder.push(outer);
        builder.push(inner);
        assertEquals("TreeBuilder{currentToken=null, state=null, currentElement=<p></p>}", builder.toString());
    }

    @Test
    public void testToStringAfterRemovingCurrentElement() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element div = new Element(Tag.valueOf("div"), "");
        builder.push(div);
        builder.removeFromStack(div);
        assertEquals("TreeBuilder{currentToken=null, state=null, currentElement=null}", builder.toString());
    }

    @Test
    public void testToStringIncludesCurrentElementAndToken() throws Exception {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.transition(HtmlTreeBuilderState.Initial);
        builder.push(new Element(Tag.valueOf("table"), ""));
        builder.process(new Token.Character().data("q"));
        assertEquals("TreeBuilder{currentToken=q, state=Initial, currentElement=<table></table>}", builder.toString());
    }
}
