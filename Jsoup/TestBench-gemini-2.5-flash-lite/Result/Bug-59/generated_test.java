package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TokenTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDoctypeReset() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("test");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("id1");
        doctype.systemIdentifier.append("id2");
        doctype.forceQuirks = true;

        doctype.reset();

        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
        assertEquals("", doctype.getPublicIdentifier());
        assertEquals("", doctype.getSystemIdentifier());
        assertFalse(doctype.isForceQuirks());
    }

    @Test
    public void testDoctypeGetName() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("test");
        assertEquals("test", doctype.getName());
    }

    @Test
    public void testDoctypeGetPubSysKey() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.pubSysKey = "PUBLIC";
        assertEquals("PUBLIC", doctype.getPubSysKey());
    }

    @Test
    public void testDoctypeGetPublicIdentifier() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.publicIdentifier.append("test");
        assertEquals("test", doctype.getPublicIdentifier());
    }

    @Test
    public void testDoctypeGetSystemIdentifier() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.systemIdentifier.append("test");
        assertEquals("test", doctype.getSystemIdentifier());
    }

    @Test
    public void testDoctypeIsForceQuirks() throws Exception {
        Token.Doctype doctype = new Token.Doctype();
        doctype.forceQuirks = true;
        assertTrue(doctype.isForceQuirks());
    }


    

    


    @Test
    public void testTagAppendTagName() throws Exception {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName("div");
        assertEquals("div", tag.name());
        assertEquals("div", tag.normalName());

        tag.appendTagName("ing");
        assertEquals("diving", tag.name());
        assertEquals("diving", tag.normalName());
    }



    @Test
    public void testStartTagResetAttributes() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("p", new Attributes());
        startTag.getAttributes().put("id", "test");
        
        startTag.reset();
        
        assertNotNull(startTag.getAttributes());
        assertEquals(0, startTag.getAttributes().size());
    }

    @Test
    public void testStartTagToString() throws Exception {
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("a", new Attributes());
        assertEquals("<a>", startTag.toString());

        startTag.getAttributes().put("href", "http://example.com");
        assertEquals("<a href=\"http://example.com\">", startTag.toString());
    }

    @Test
    public void testEndTagToString() throws Exception {
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        assertEquals("</div>", endTag.toString());
    }

    @Test
    public void testCommentReset() throws Exception {
        Token.Comment comment = new Token.Comment();
        comment.data.append("some comment");
        comment.bogus = true;

        comment.reset();

        assertEquals("", comment.data.toString());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCommentGetData() throws Exception {
        Token.Comment comment = new Token.Comment();
        comment.data.append("test data");
        assertEquals("test data", comment.getData());
    }

    @Test
    public void testCommentToString() throws Exception {
        Token.Comment comment = new Token.Comment();
        comment.data.append("this is a comment");
        assertEquals("<!--this is a comment-->", comment.toString());
    }

    @Test
    public void testCharacterReset() throws Exception {
        Token.Character character = new Token.Character();
        character.data("test data");
        character.reset();
        assertNull(character.getData());
    }

    @Test
    public void testCharacterData() throws Exception {
        Token.Character character = new Token.Character();
        character.data("test");
        assertEquals("test", character.getData());
    }

    @Test
    public void testCharacterToString() throws Exception {
        Token.Character character = new Token.Character();
        character.data("text content");
        assertEquals("text content", character.toString());
    }

    @Test
    public void testEOFReset() throws Exception {
        Token.EOF eof = new Token.EOF();
        // EOF has no state to reset, but reset should return itself and not crash.
        Token resetEof = eof.reset();
        assertNotNull(resetEof);
        assertTrue(resetEof instanceof Token.EOF);
        assertSame(eof, resetEof);
    }

    @Test
    public void testIsDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        Token.StartTag startTag = new Token.StartTag();
        assertFalse(startTag.isDoctype());
    }

    @Test
    public void testAsDoctype() {
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.asDoctype() instanceof Token.Doctype);
    }

    @Test
    public void testIsStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        assertTrue(startTag.isStartTag());
        Token.EndTag endTag = new Token.EndTag();
        assertFalse(endTag.isStartTag());
    }

    @Test
    public void testAsStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        assertTrue(startTag.asStartTag() instanceof Token.StartTag);
    }

    @Test
    public void testIsEndTag() {
        Token.EndTag endTag = new Token.EndTag();
        assertTrue(endTag.isEndTag());
        Token.Comment comment = new Token.Comment();
        assertFalse(comment.isEndTag());
    }

    @Test
    public void testAsEndTag() {
        Token.EndTag endTag = new Token.EndTag();
        assertTrue(endTag.asEndTag() instanceof Token.EndTag);
    }

    @Test
    public void testIsComment() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        Token.Character character = new Token.Character();
        assertFalse(character.isComment());
    }

    @Test
    public void testAsComment() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.asComment() instanceof Token.Comment);
    }

    @Test
    public void testIsCharacter() {
        Token.Character character = new Token.Character();
        assertTrue(character.isCharacter());
        Token.EOF eof = new Token.EOF();
        assertFalse(eof.isCharacter());
    }

    @Test
    public void testAsCharacter() {
        Token.Character character = new Token.Character();
        assertTrue(character.asCharacter() instanceof Token.Character);
    }

    @Test
    public void testIsEOF() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        Token.Doctype doctype = new Token.Doctype();
        assertFalse(doctype.isEOF());
    }

    @Test
    public void testTagAppendTagNameChar() {
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName('h');
        tag.appendTagName('1');
        assertEquals("h1", tag.name());
        assertEquals("h1", tag.normalName());
    }


    




}


