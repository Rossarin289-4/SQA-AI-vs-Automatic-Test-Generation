package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderStateTest {

    private HtmlTreeBuilder tb = new HtmlTreeBuilder();
    private ParseErrorList errors = ParseErrorList.noTracking();
    private ParseSettings settings = tb.defaultSettings();

    // Helper to initialize the tree builder
    private void setupBuilder(String html) {
        tb.initialiseParse(new StringReader(html), "", errors, settings);
        // Start in the Initial state, but the first token will transition it
    }

    // Helper to get a token from HTML without processing it into the tree
    
    // Helper to process a token with error checking
    private void processToken(Token token) {
        assertTrue(tb.process(token));
    }

    // Helper to process a token in a specific state with error checking
    private void processToken(Token token, HtmlTreeBuilderState state) {
        assertTrue(tb.process(token, state));
    }




































































































    @Test
    public void testInBodyStateEOF() {
        setupBuilder("");
        // Create an EOF token manually
        Token eofToken = new Token.EOF();
        tb.transition(HtmlTreeBuilderState.InBody);
        assertTrue(HtmlTreeBuilderState.InBody.process(eofToken, tb));
        // Nothing specific to assert, just checks it doesn't crash
    }








































    @Test
    public void testInFramesetStateStartTagFrameset() {
        setupBuilder("<frameset></frameset>");
        Token t = nextToken("<frameset></frameset>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals("frameset", tb.currentElement().nodeName());
    }

    @Test
    public void testInFramesetStateStartTagFrame() {
        setupBuilder("<frame></frame>");
        Token t = nextToken("<frame></frame>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals("frame", tb.currentElement().childNode(0).nodeName());
    }

    @Test
    public void testInFramesetStateStartTagNoframes() {
        setupBuilder("<noframes></noframes>");
        Token t = nextToken("<noframes></noframes>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testInFramesetStateEndTagFrameset() {
        setupBuilder("</frameset>");
        Token t = nextToken("</frameset>");
        tb.transition(HtmlTreeBuilderState.InFrameset);
        // Mock setup
        Element frameset = new Element(Tag.valueOf("frameset"), tb.getBaseUri());
        tb.push(frameset);
        assertTrue(HtmlTreeBuilderState.InFrameset.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // frameset popped
        assertEquals(HtmlTreeBuilderState.AfterFrameset, tb.state());
    }


    @Test
    public void testAfterFramesetStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        processToken(t, HtmlTreeBuilderState.InBody); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterFramesetStateEndTagHtml() {
        setupBuilder("</html>");
        Token t = nextToken("</html>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.AfterAfterFrameset, tb.state());
    }

    @Test
    public void testAfterFramesetStateStartTagNoframes() {
        setupBuilder("<noframes></noframes>");
        Token t = nextToken("<noframes></noframes>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterFramesetStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterFrameset);
        assertFalse(HtmlTreeBuilderState.AfterFrameset.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

    @Test
    public void testAfterAfterBodyStateComment() {
        setupBuilder("<!-- comment -->");
        Token t = nextToken("<!-- comment -->");
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(t, tb));
        assertEquals("html", tb.currentElement().nodeName()); // comment inserted into html
    }

    @Test
    public void testAfterAfterBodyStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        processToken(t, HtmlTreeBuilderState.InBody); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterAfterBodyStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertTrue(HtmlTreeBuilderState.AfterAfterBody.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        assertEquals("p", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterAfterFramesetStateStartTagHtml() {
        setupBuilder("<html>");
        Token t = nextToken("<html>");
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        processToken(t, HtmlTreeBuilderState.InBody); // re-process
        assertEquals("html", tb.currentElement().nodeName());
    }

    @Test
    public void testAfterAfterFramesetStateStartTagNoframes() {
        setupBuilder("<noframes></noframes>");
        Token t = nextToken("<noframes></noframes>");
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        assertTrue(HtmlTreeBuilderState.AfterAfterFrameset.process(t, tb));
        assertEquals(HtmlTreeBuilderState.InHead, tb.state());
    }

    @Test
    public void testAfterAfterFramesetStateAnythingElse() {
        setupBuilder("<p>");
        Token t = nextToken("<p>");
        tb.transition(HtmlTreeBuilderState.AfterAfterFrameset);
        assertFalse(HtmlTreeBuilderState.AfterAfterFrameset.process(t, tb));
        assertTrue(errors.getErrors().size() > 0);
    }

}





