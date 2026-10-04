package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import java.util.ArrayList;
import java.util.List;

public class TokeniserTest {
    @Test
    public void testPlainDataEmitsCharacterThenEof() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("abc"));
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals("abc", token.asCharacter().getData());
        assertTrue(t.read().isEOF());
    }

    @Test
    public void testEmptyInputEmitsEof() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader(""));
        assertTrue(t.read().isEOF());
    }

    @Test
    public void testDataCharacterReference() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("&amp;"));
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals("&", token.asCharacter().getData());
    }

    @Test
    public void testUnknownNamedReferenceRemainsLiteral() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("&zzzz;"));
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals("&zzzz;", token.asCharacter().getData());
    }

    @Test
    public void testDecimalReferenceAtCharUpperBoundary() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("&#65535;"));
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals(String.valueOf((char) 65535), token.asCharacter().getData());
    }

    @Test
    public void testDecimalReferenceAboveUnicodeRangeUsesReplacement() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("&#1114112;"));
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals(String.valueOf(Tokeniser.replacementChar), token.asCharacter().getData());
    }

    @Test
    public void testHexadecimalReference() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("&#x41;"));
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals("A", token.asCharacter().getData());
    }

    @Test
    public void testTagNameIsLowercased() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<DIV>"));
        Token token = t.read();
        assertTrue(token.isStartTag());
        assertEquals("div", token.asStartTag().tagName);
    }

    @Test
    public void testTagWithAttributeValue() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<a href=x>"));
        Token token = t.read();
        assertTrue(token.isStartTag());
        assertEquals("a", token.asStartTag().tagName);
        assertEquals("x", token.asStartTag().attributes.get("href"));
    }

    @Test
    public void testSelfClosingStartTag() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<x/>"));
        Token token = t.read();
        assertTrue(token.isStartTag());
        assertTrue(token.asStartTag().selfClosing);
    }

    @Test
    public void testCommentToken() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<!--hi-->"));
        Token token = t.read();
        assertTrue(token.isComment());
        assertEquals("hi", token.asComment().getData());
    }

    @Test
    public void testDoctypeNameIsLowercased() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<!DOCTYPE HTML>"));
        Token token = t.read();
        assertTrue(token.isDoctype());
        assertEquals("html", token.asDoctype().name.toString());
    }

    @Test
    public void testBogusCommentFromQuestionMark() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<?abc>"));
        Token token = t.read();
        assertTrue(token.isComment());
        assertEquals("?abc", token.asComment().getData());
    }

    @Test
    public void testStateTransition() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader(""));
        t.transition(TokeniserState.Rcdata);
        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void testAdvanceTransitionConsumesOneCharacter() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("ab"));
        t.advanceTransition(TokeniserState.Rcdata);
        assertEquals(TokeniserState.Rcdata, t.getState());
        assertEquals('b', t.read().asCharacter().getData().charAt(0));
    }

    @Test
    public void testEmitBuffersMultipleCharacterPiecesIntoOneToken() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader(""));
        t.emit("a");
        t.emit('b');
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals("ab", token.asCharacter().getData());
    }

    @Test
    public void testCurrentNodeIsInHtmlNamespace() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader(""));
        assertTrue(t.currentNodeInHtmlNS());
    }

    @Test
    public void testErrorTrackingCanBeDisabled() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader(""));
        t.setTrackErrors(false);
        assertFalse(t.isTrackErrors());
    }
}
