package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.*;
import java.util.Iterator;

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
    public void testDoctypeSystemIdentifierAppendsCharactersExactly() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.systemIdentifier.append('a').append('b');
        assertEquals("ab", token.getSystemIdentifier());
    }

    @Test
    public void testDoctypeForceQuirksDefaultsFalse() throws Exception {
        Token.Doctype token = new Token.Doctype();
        assertFalse(token.isForceQuirks());
    }

    @Test
    public void testDoctypeForceQuirksCanBeSetTrue() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.forceQuirks = true;
        assertTrue(token.isForceQuirks());
    }

    @Test
    public void testDoctypeForceQuirksCanBeResetFalse() throws Exception {
        Token.Doctype token = new Token.Doctype();
        token.forceQuirks = true;
        token.forceQuirks = false;
        assertFalse(token.isForceQuirks());
    }

    @Test
    public void testCommentStringRepresentationEmpty() throws Exception {
        Token.Comment token = new Token.Comment();
        assertEquals("<!---->", token.toString());
    }

    @Test
    public void testCommentStringRepresentationWithData() throws Exception {
        Token.Comment token = new Token.Comment();
        token.data.append("note");
        assertEquals("<!--note-->", token.toString());
    }

    @Test
    public void testCommentStringRepresentationPreservesDashes() throws Exception {
        Token.Comment token = new Token.Comment();
        token.data.append("--");
        assertEquals("<!--" + "--" + "-->", token.toString());
    }

    @Test
    public void testCharacterStringRepresentation() throws Exception {
        Token.Character token = new Token.Character("text");
        assertEquals("text", token.toString());
    }

    @Test
    public void testCharacterDataEmpty() throws Exception {
        Token.Character token = new Token.Character("");
        assertEquals("", token.getData());
    }

    @Test
    public void testCharacterDataPreservesMarkupCharacters() throws Exception {
        Token.Character token = new Token.Character("<x>");
        assertEquals("<x>", token.getData());
    }

    @Test
    public void testStartTagStringWithoutAttributes() throws Exception {
        Token.StartTag token = new Token.StartTag("x");
        assertEquals("<x>", token.toString());
    }

    @Test
    public void testStartTagStringWithAttribute() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("id", "v");
        Token.StartTag token = new Token.StartTag("x", attrs);
        assertEquals("<x " + attrs.toString() + ">", token.toString());
    }

    @Test
    public void testEndTagStringRepresentation() throws Exception {
        Token.EndTag token = new Token.EndTag("x");
        assertEquals("</x>", token.toString());
    }
}
