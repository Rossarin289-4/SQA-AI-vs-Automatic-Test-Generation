package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;

public class TokenTest {
    @Test
    public void testDoctypeSystemIdentifierInitiallyEmpty() throws Exception {
        Token.Doctype token = new Token.Doctype();
        assertEquals("", token.getSystemIdentifier());
    }

    @Test
    public void testDoctypeSystemIdentifierAfterAppend() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.systemIdentifier.append("sys");
        assertEquals("sys", token.getSystemIdentifier());
    }

    @Test
    public void testDoctypeSystemIdentifierPreservesAppendedSequence() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.systemIdentifier.append("a");
        token.systemIdentifier.append("b");
        assertEquals("ab", token.getSystemIdentifier());
    }

    @Test
    public void testDoctypeResetClearsSystemIdentifier() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.systemIdentifier.append("sys");
        token.reset();
        assertEquals("", token.getSystemIdentifier());
    }

    @Test
    public void testDoctypeForceQuirksInitiallyFalse() throws Exception {
        Token.Doctype token = new Token.Doctype();
        assertEquals(false, token.isForceQuirks());
    }

    @Test
    public void testDoctypeForceQuirksAfterSetTrue() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.forceQuirks = true;
        assertEquals(true, token.isForceQuirks());
    }

    @Test
    public void testDoctypeResetClearsForceQuirks() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.forceQuirks = true;
        token.reset();
        assertEquals(false, token.isForceQuirks());
    }

    @Test
    public void testDoctypeToStringUsesObjectString() throws Exception {
        Token.Doctype token = new Token.Doctype();
        assertTrue(token.toString().startsWith("org.jsoup.parser.Token$Doctype@"));
    }

    @Test
    public void testStartTagToStringWithoutNameThrows() throws Exception {
        Token.StartTag token = new Token.StartTag();
        try { token.toString(); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testStartTagToStringWithName() throws Exception {
        Token.StartTag token = new Token.StartTag();
        token.name("div");
        assertEquals("<div>", token.toString());
    }

    @Test
    public void testStartTagToStringWithAttributes() throws Exception {
        Token.StartTag token = new Token.StartTag();
        token.name("div");
        token.attributes.put("id", "x");
        assertEquals("<div  id=\"x\">", token.toString());
    }

    @Test
    public void testEndTagToStringWithName() throws Exception {
        Token.EndTag token = new Token.EndTag();
        token.name("div");
        assertEquals("</div>", token.toString());
    }

    @Test
    public void testEndTagToStringWithoutNameThrows() throws Exception {
        Token.EndTag token = new Token.EndTag();
        try { token.toString(); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCommentToStringEmpty() throws Exception {
        Token.Comment token = new Token.Comment();
        assertEquals("<!---->", token.toString());
    }

    @Test
    public void testCommentToStringWithData() throws Exception {
        Token.Comment token = new Token.Comment();
        token.data.append("hello");
        assertEquals("<!--hello-->", token.toString());
    }

    @Test
    public void testCommentToStringAfterReset() throws Exception {
        Token.Comment token = new Token.Comment();
        token.data.append("x");
        token.reset();
        assertEquals("<!---->", token.toString());
    }

    @Test
    public void testCharacterToStringReturnsData() throws Exception {
        Token.Character token = new Token.Character();
        token.data("text");
        assertEquals("text", token.toString());
    }

    @Test
    public void testCharacterToStringReturnsEmptyData() throws Exception {
        Token.Character token = new Token.Character();
        token.data("");
        assertEquals("", token.toString());
    }

    @Test
    public void testCharacterResetClearsToStringValue() throws Exception {
        Token.Character token = new Token.Character();
        token.data("text");
        token.reset();
        assertEquals(null, token.toString());
    }

    @Test
    public void testEofToStringUsesObjectString() throws Exception {
        Token.EOF token = new Token.EOF();
        assertTrue(token.toString().startsWith("org.jsoup.parser.Token$EOF@"));
    }
}
