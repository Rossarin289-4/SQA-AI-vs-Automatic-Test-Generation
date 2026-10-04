package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TokeniserStateTest {
    @Test
    public void testDataEmitsText() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), ParseErrorList.noTracking());
        assertTrue(t.read().isCharacter());
        assertEquals("abc", t.read().asCharacter().getData());
    }

    @Test
    public void testDataEmitsEndOfInput() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertTrue(t.read().isEOF());
    }

    @Test
    public void testTagOpenStartTag() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<p>"), ParseErrorList.noTracking());
        Token token = t.read();
        assertTrue(token.isStartTag());
        assertEquals("p", token.asStartTag().name());
    }

    @Test
    public void testEndTag() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("</p>"), ParseErrorList.noTracking());
        Token token = t.read();
        assertTrue(token.isEndTag());
        assertEquals("p", token.asEndTag().name());
    }

    @Test
    public void testTagNameLowercasesAscii() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<P>"), ParseErrorList.noTracking());
        assertEquals("p", t.read().asStartTag().name());
    }

    @Test
    public void testAttributeValue() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<p a='x'>"), ParseErrorList.noTracking());
        assertEquals("x", t.read().asStartTag().attributes.get("a"));
    }

    @Test
    public void testEmptyQuotedAttributeValue() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<p a=\"\">"), ParseErrorList.noTracking());
        assertEquals("", t.read().asStartTag().attributes.get("a"));
    }

    @Test
    public void testUnquotedAttributeValue() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<p a=x>"), ParseErrorList.noTracking());
        assertEquals("x", t.read().asStartTag().attributes.get("a"));
    }

    @Test
    public void testSelfClosingTag() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<p/>"), ParseErrorList.noTracking());
        Token.Tag token = t.read().asStartTag();
        assertTrue(token.isSelfClosing());
    }

    @Test
    public void testBogusCommentFromQuestionMark() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<?x>"), ParseErrorList.noTracking());
        Token token = t.read();
        assertTrue(token.isComment());
        assertEquals("?x", token.asComment().getData());
    }

    @Test
    public void testMarkupComment() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<!--x-->"), ParseErrorList.noTracking());
        assertEquals("x", t.read().asComment().getData());
    }

    @Test
    public void testDoctypeName() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<!DOCTYPE html>"), ParseErrorList.noTracking());
        Token token = t.read();
        assertTrue(token.isDoctype());
        assertEquals("html", token.asDoctype().getName());
    }

    @Test
    public void testCdataSectionEmitsText() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<![CDATA[x]]>"), ParseErrorList.noTracking());
        assertEquals("x", t.read().asCharacter().getData());
    }

    @Test
    public void testPlainCharacterReference() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("&amp;"), ParseErrorList.noTracking());
        assertEquals("&", t.read().asCharacter().getData());
    }

    @Test
    public void testRcdataCharacterReference() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<textarea>&amp;</textarea>"), ParseErrorList.noTracking());
        assertNotNull(t);
    }

    @Test
    public void testEofAfterText() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("x"), ParseErrorList.noTracking());
        assertEquals("x", t.read().asCharacter().getData());
        assertTrue(t.read().isEOF());
    }

    @Test
    public void testAttributeEntity() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<p a=\"&amp;\">"), ParseErrorList.noTracking());
        assertEquals("&", t.read().asStartTag().attributes.get("a"));
    }

    @Test
    public void testWhitespaceBetweenAttributes() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<p a=x b=y>"), ParseErrorList.noTracking());
        Token.Tag tag = t.read().asStartTag();
        assertEquals("x", tag.attributes.get("a"));
        assertEquals("y", tag.attributes.get("b"));
    }
}
