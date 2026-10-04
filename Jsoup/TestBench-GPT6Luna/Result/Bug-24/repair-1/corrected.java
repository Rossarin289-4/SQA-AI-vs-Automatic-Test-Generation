package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }
    @Test
    public void testDataEmitsText() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), ParseErrorList.noTracking());
        assertTrue(t.read().isCharacter());
        assertEquals("abc", t.read().asCharacter().getData());
    }

    @Test
    public void testDataEmitsEof() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertTrue(t.read().isEOF());
    }

    @Test
    public void testDataStartsTag() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<x>"), ParseErrorList.noTracking());
        assertTrue(t.read().isStartTag());
        assertEquals("x", t.read().asCharacter().getData());
    }

    @Test
    public void testDataRecognizesCharacterReference() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("&amp;"), ParseErrorList.noTracking());
        assertTrue(t.read().isCharacter());
        assertEquals("&", t.read().asCharacter().getData());
    }

    @Test
    public void testInvalidTagOpenEmitsLessThan() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<1"), ParseErrorList.noTracking());
        assertTrue(t.read().isCharacter());
        assertEquals("<", t.read().asCharacter().getData());
    }

    @Test
    public void testUnclosedTagDoesNotEmitTag() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<x"), ParseErrorList.noTracking());
        assertTrue(t.read().isEOF());
    }

    @Test
    public void testTagNameIsLowercased() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<ABC>"), ParseErrorList.noTracking());
        assertTrue(t.read().isStartTag());
        assertEquals("abc", t.read().asCharacter().getData());
    }

    @Test
    public void testEndTagIsRecognized() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("</x>"), ParseErrorList.noTracking());
        assertTrue(t.read().isEndTag());
        assertEquals("x", t.read().asEndTag().name());
    }

    @Test
    public void testCommentData() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<!--abc-->"), ParseErrorList.noTracking());
        assertTrue(t.read().isComment());
        assertEquals("abc", t.read().asComment().getData());
    }

    @Test
    public void testDoctypeNameIsLowercased() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<!DOCTYPE HTML>"), ParseErrorList.noTracking());
        assertTrue(t.read().isDoctype());
        assertEquals("html", t.read().asDoctype().getName());
    }

    @Test
    public void testQuotedAttributeValue() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<x a=\"b\">"), ParseErrorList.noTracking());
        assertTrue(t.read().isStartTag());
    }

    @Test
    public void testUnquotedAttributeValue() throws Exception {
        Tokeniser t = new Tokeniser(new CharacterReader("<x a=b>"), ParseErrorList.noTracking());
        assertTrue(t.read().isStartTag());
    }
}
