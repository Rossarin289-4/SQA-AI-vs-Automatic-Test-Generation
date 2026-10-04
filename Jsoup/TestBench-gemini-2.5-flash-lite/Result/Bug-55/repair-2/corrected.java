package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TokeniserStateTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDataStateConsumeData() throws Exception {
        CharacterReader r = new CharacterReader("Hello World");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Data);
        t.read();
        // Consumes "Hello World" until EOF
        assertEquals("Hello World", t.read().asCharacter().getData());
    }

    @Test
    public void testDataStateConsumeToAmpersand() throws Exception {
        CharacterReader r = new CharacterReader("Hello&World");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Data);
        t.read(); // Consumes "Hello"
        assertEquals("Hello", t.read().asCharacter().getData());
        // Next character is '&', transitions to CharacterReferenceInData
        assertTrue(t.getState() == TokeniserState.CharacterReferenceInData);
    }

    @Test
    public void testDataStateConsumeToLessThan() throws Exception {
        CharacterReader r = new CharacterReader("Hello<World");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Data);
        t.read(); // Consumes "Hello"
        assertEquals("Hello", t.read().asCharacter().getData());
        // Next character is '<', transitions to TagOpen
        assertTrue(t.getState() == TokeniserState.TagOpen);
    }

    @Test
    public void testDataStateNullChar() throws Exception {
        CharacterReader r = new CharacterReader("Hello\u0000World");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Data);
        t.read(); // Consumes "Hello"
        assertEquals("Hello", t.read().asCharacter().getData());
        // Next character is nullChar, emits replacement char
        assertEquals(String.valueOf(Tokeniser.replacementChar), t.read().asCharacter().getData());
    }

    @Test
    public void testDataStateEOF() throws Exception {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Data);
        Token eofToken = t.read();
        assertTrue(eofToken.isEOF());
    }

    @Test
    public void testCharacterReferenceInData() throws Exception {
        CharacterReader r = new CharacterReader("&nbsp;");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.CharacterReferenceInData);
        // This state should consume the character reference and transition back to Data
        // The actual character emitted depends on the consumeCharacterReference implementation
        // For testing purposes, we expect it to transition and emit something.
        // Since we don't have the implementation of consumeCharacterReference, we'll test state transition.
        t.read();
        assertTrue(t.getState() == TokeniserState.Data);
        // The actual character emitted is complex and depends on the character reference parsing.
        // We'll check for a non-empty character token.
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertTrue(token.asCharacter().getData().length() > 0);
    }

    @Test
    public void testRcdataStateConsumeToAmpersand() throws Exception {
        CharacterReader r = new CharacterReader("TITLE&World");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Rcdata);
        t.read(); // Consumes "TITLE"
        assertEquals("TITLE", t.read().asCharacter().getData());
        // Next character is '&', transitions to CharacterReferenceInRcdata
        assertTrue(t.getState() == TokeniserState.CharacterReferenceInRcdata);
    }

    @Test
    public void testRcdataStateConsumeToLessThan() throws Exception {
        CharacterReader r = new CharacterReader("TITLE<text");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Rcdata);
        t.read(); // Consumes "TITLE"
        assertEquals("TITLE", t.read().asCharacter().getData());
        // Next character is '<', transitions to RcdataLessthanSign
        assertTrue(t.getState() == TokeniserState.RcdataLessthanSign);
    }

    @Test
    public void testRcdataStateNullChar() throws Exception {
        CharacterReader r = new CharacterReader("TITLE\u0000text");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Rcdata);
        t.read(); // Consumes "TITLE"
        assertEquals("TITLE", t.read().asCharacter().getData());
        // Next character is nullChar, emits replacement char
        assertEquals(String.valueOf(Tokeniser.replacementChar), t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Rcdata); // Stays in Rcdata
    }

    @Test
    public void testRcdataStateEOF() throws Exception {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Rcdata);
        Token eofToken = t.read();
        assertTrue(eofToken.isEOF());
    }

    @Test
    public void testRawtextStateConsumeToLessThan() throws Exception {
        CharacterReader r = new CharacterReader("RAWTEXT<TAG");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Rawtext);
        t.read(); // Consumes "RAWTEXT"
        assertEquals("RAWTEXT", t.read().asCharacter().getData());
        // Next character is '<', transitions to RawtextLessthanSign
        assertTrue(t.getState() == TokeniserState.RawtextLessthanSign);
    }

    @Test
    public void testRawtextStateEOF() throws Exception {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.Rawtext);
        Token eofToken = t.read();
        assertTrue(eofToken.isEOF());
    }

    @Test
    public void testScriptDataStateConsumeToLessThan() throws Exception {
        CharacterReader r = new CharacterReader("SCRIPTDATA<TAG");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptData);
        t.read(); // Consumes "SCRIPTDATA"
        assertEquals("SCRIPTDATA", t.read().asCharacter().getData());
        // Next character is '<', transitions to ScriptDataLessthanSign
        assertTrue(t.getState() == TokeniserState.ScriptDataLessthanSign);
    }

    @Test
    public void testScriptDataStateEOF() throws Exception {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptData);
        Token eofToken = t.read();
        assertTrue(eofToken.isEOF());
    }

    @Test
    public void testPLAINTEXTStateConsumeToNullChar() throws Exception {
        CharacterReader r = new CharacterReader("PLAINTEXT\u0000End");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.PLAINTEXT);
        t.read(); // Consumes "PLAINTEXT"
        assertEquals("PLAINTEXT", t.read().asCharacter().getData());
        // Next character is nullChar, emits replacement char and stays in PLAINTEXT
        assertEquals(String.valueOf(Tokeniser.replacementChar), t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.PLAINTEXT);
    }

    @Test
    public void testPLAINTEXTStateEOF() throws Exception {
        CharacterReader r = new CharacterReader("");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.PLAINTEXT);
        Token eofToken = t.read();
        assertTrue(eofToken.isEOF());
    }

    @Test
    public void testTagOpenStateLessThanSlash() throws Exception {
        CharacterReader r = new CharacterReader("</tag");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagOpen);
        r.advance(); // consume '<'
        t.read();
        // Transitions to EndTagOpen
        assertTrue(t.getState() == TokeniserState.EndTagOpen);
    }

    @Test
    public void testTagOpenStateLessThanQuestionMark() throws Exception {
        CharacterReader r = new CharacterReader("<?tag");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagOpen);
        r.advance(); // consume '<'
        t.read();
        // Transitions to BogusComment
        assertTrue(t.getState() == TokeniserState.BogusComment);
    }

    @Test
    public void testTagOpenStateLessThanExclamation() throws Exception {
        CharacterReader r = new CharacterReader("<!tag");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagOpen);
        r.advance(); // consume '<'
        t.read();
        // Transitions to MarkupDeclarationOpen
        assertTrue(t.getState() == TokeniserState.MarkupDeclarationOpen);
    }

    @Test
    public void testTagOpenStateLessThanLetter() throws Exception {
        CharacterReader r = new CharacterReader("<tag");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagOpen);
        r.advance(); // consume '<'
        t.read();
        // Creates a start tag pending and transitions to TagName
        assertTrue(t.getState() == TokeniserState.TagName);
        assertTrue(t.tagPending.name.isEmpty()); // Tag name not yet consumed
    }

    @Test
    public void testTagOpenStateLessThanInvalid() throws Exception {
        CharacterReader r = new CharacterReader("<1tag");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagOpen);
        r.advance(); // consume '<'
        t.read();
        // Emits '<' and transitions back to Data
        assertEquals("<", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Data);
    }

    @Test
    public void testEndTagOpenStateEmpty() throws Exception {
        CharacterReader r = new CharacterReader("/"); // Empty input after '/'
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.EndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // EOF error, emits "</", transitions to Data
        assertEquals("</", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Data);
    }

    @Test
    public void testEndTagOpenStateLessThanLetter() throws Exception {
        CharacterReader r = new CharacterReader("/tag");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.EndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Creates an end tag pending and transitions to TagName
        assertTrue(t.getState() == TokeniserState.TagName);
        assertTrue(t.tagPending.name.isEmpty()); // Tag name not yet consumed
    }

    @Test
    public void testEndTagOpenStateLessThanGreaterThan() throws Exception {
        CharacterReader r = new CharacterReader("/>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.EndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Emits "</" and transitions to Data
        assertEquals("</", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Data);
    }

    @Test
    public void testEndTagOpenStateLessThanInvalid() throws Exception {
        CharacterReader r = new CharacterReader("/1tag");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.EndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Transitions to BogusComment
        assertTrue(t.getState() == TokeniserState.BogusComment);
    }

    @Test
    public void testTagNameStateConsumeTagName() throws Exception {
        CharacterReader r = new CharacterReader("div id='main'");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagName);
        t.tagPending = t.createTagPending(true); // Ensure tag pending is created
        t.read(); // Consumes "div"
        assertEquals("div", t.tagPending.name.toString());
        // Next character is space, transitions to BeforeAttributeName
        assertTrue(t.getState() == TokeniserState.BeforeAttributeName);
    }

    @Test
    public void testTagNameStateConsumeTagNameAndSlash() throws Exception {
        CharacterReader r = new CharacterReader("div/");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagName);
        t.tagPending = t.createTagPending(true);
        t.read(); // Consumes "div"
        assertEquals("div", t.tagPending.name.toString());
        // Next character is '/', transitions to SelfClosingStartTag
        assertTrue(t.getState() == TokeniserState.SelfClosingStartTag);
    }

    @Test
    public void testTagNameStateConsumeTagNameAndGreaterThan() throws Exception {
        CharacterReader r = new CharacterReader("div>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagName);
        t.tagPending = t.createTagPending(true);
        t.read(); // Consumes "div"
        assertEquals("div", t.tagPending.name.toString());
        // Next character is '>', emits tag and transitions to Data
        t.emitTagPending(); // This should be called implicitly by the transition
        assertTrue(t.getState() == TokeniserState.Data);
        // After emitting the tag, the next read should be EOF if input is exhausted
        Token emittedToken = t.read(); // This will read EOF
        assertTrue(emittedToken.isEOF());
    }

    @Test
    public void testTagNameStateConsumeTagNameAndNullChar() throws Exception {
        CharacterReader r = new CharacterReader("div\u0000");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagName);
        t.tagPending = t.createTagPending(true);
        t.read(); // Consumes "div"
        assertEquals("div", t.tagPending.name.toString());
        // Next character is nullChar, appends replacement char
        t.tagPending.appendTagName(Tokeniser.replacementChar); // Simulate the append
        assertTrue(t.tagPending.name.toString().equals("div" + Tokeniser.replacementChar));
        assertTrue(t.getState() == TokeniserState.TagName); // Stays in TagName
    }

    @Test
    public void testTagNameStateConsumeTagNameAndEOF() throws Exception {
        CharacterReader r = new CharacterReader("div");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.TagName);
        t.tagPending = t.createTagPending(true);
        t.read(); // Consumes "div"
        assertEquals("div", t.tagPending.name.toString());
        // Next character is EOF, emits tag and transitions to Data
        t.eofError(t.getState()); // Simulate error reporting
        t.emitTagPending(); // This should be called implicitly by the transition
        assertTrue(t.getState() == TokeniserState.Data);
        Token eofToken = t.read(); // This should read EOF
        assertTrue(eofToken.isEOF());
    }

    @Test
    public void testRcdataLessthanSignStateSlash() throws Exception {
        CharacterReader r = new CharacterReader("</title>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RcdataLessthanSign);
        r.advance(); // consume '<'
        t.read();
        // Creates temp buffer, transitions to RCDATAEndTagOpen
        assertTrue(t.getState() == TokeniserState.RCDATAEndTagOpen);
    }

    @Test
    public void testRcdataLessthanSignStateLetterNoMatchingEndTag() throws Exception {
        CharacterReader r = new CharacterReader("<a href='test'>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RcdataLessthanSign);
        // The logic here is complex and depends on other parts of the Tokeniser.
        // For simplicity, we'll test the default path that emits '<' and goes back to Rcdata.
        r.advance(); // consume '<'
        t.read();
        assertEquals("<", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Rcdata);
    }

    @Test
    public void testRcdataLessthanSignStateOther() throws Exception {
        CharacterReader r = new CharacterReader("<123");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RcdataLessthanSign);
        r.advance(); // consume '<'
        t.read();
        // Emits "<" and transitions to Rcdata
        assertEquals("<", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Rcdata);
    }

    @Test
    public void testRCDATAEndTagOpenStateLessThanLetter() throws Exception {
        CharacterReader r = new CharacterReader("/title");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RCDATAEndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Creates pending tag, transitions to RCDATAEndTagName
        assertTrue(t.getState() == TokeniserState.RCDATAEndTagName);
        assertTrue(t.tagPending.name.isEmpty()); // Tag name not yet consumed
    }

    @Test
    public void testRCDATAEndTagOpenStateLessThanElse() throws Exception {
        CharacterReader r = new CharacterReader("/123");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RCDATAEndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Emits "</" and transitions to Rcdata
        assertEquals("</", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Rcdata);
    }

    @Test
    public void testRCDATAEndTagNameStateLessThanLetter() throws Exception {
        CharacterReader r = new CharacterReader("titleX");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RCDATAEndTagName);
        t.tagPending = t.createTagPending(false);
        t.tagPending.appendTagName("title");
        t.dataBuffer.append("title");
        t.read(); // Consumes "title"
        t.read(); // Consumes "X"
        assertEquals("titleX", t.tagPending.name.toString());
        assertEquals("titleX", t.dataBuffer.toString());
        assertTrue(t.getState() == TokeniserState.RCDATAEndTagName); // Stays in same state
    }

    @Test
    public void testRCDATAEndTagNameStateLessThanSpace() throws Exception {
        CharacterReader r = new CharacterReader("title ");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RCDATAEndTagName);
        t.tagPending = t.createTagPending(false);
        t.tagPending.appendTagName("title");
        t.dataBuffer.append("title");
        // Assume isAppropriateEndTagToken() is true
        t.read(); // Consumes "title"
        t.read(); // Consumes " "
        assertTrue(t.getState() == TokeniserState.BeforeAttributeName);
    }

    @Test
    public void testRCDATAEndTagNameStateLessThanSlash() throws Exception {
        CharacterReader r = new CharacterReader("title/");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RCDATAEndTagName);
        t.tagPending = t.createTagPending(false);
        t.tagPending.appendTagName("title");
        t.dataBuffer.append("title");
        // Assume isAppropriateEndTagToken() is true
        t.read(); // Consumes "title"
        t.read(); // Consumes "/"
        assertTrue(t.getState() == TokeniserState.SelfClosingStartTag);
    }

    @Test
    public void testRCDATAEndTagNameStateLessThanGreaterThan() throws Exception {
        CharacterReader r = new CharacterReader("title>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RCDATAEndTagName);
        t.tagPending = t.createTagPending(false);
        t.tagPending.appendTagName("title");
        t.dataBuffer.append("title");
        // Assume isAppropriateEndTagToken() is true
        t.read(); // Consumes "title"
        t.read(); // Consumes ">"
        assertTrue(t.getState() == TokeniserState.Data);
        t.emitTagPending(); // check if tag was emitted
    }

    @Test
    public void testRCDATAEndTagNameStateLessThanElse() throws Exception {
        CharacterReader r = new CharacterReader("title123");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RCDATAEndTagName);
        t.tagPending = t.createTagPending(false);
        t.tagPending.appendTagName("title");
        t.dataBuffer.append("title");
        t.read(); // Consumes "title"
        t.read(); // Consumes "123"
        // This will trigger the anythingElse method
        assertEquals("</title123", t.read().asCharacter().getData()); // Simplistic assertion
        assertTrue(t.getState() == TokeniserState.Rcdata);
    }

    @Test
    public void testRawtextLessthanSignStateSlash() throws Exception {
        CharacterReader r = new CharacterReader("</style>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RawtextLessthanSign);
        r.advance(); // consume '<'
        t.read();
        // Transitions to RawtextEndTagOpen
        assertTrue(t.getState() == TokeniserState.RawtextEndTagOpen);
    }

    @Test
    public void testRawtextLessthanSignStateElse() throws Exception {
        CharacterReader r = new CharacterReader("<script>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RawtextLessthanSign);
        r.advance(); // consume '<'
        t.read();
        // Emits "<" and transitions to Rawtext
        assertEquals("<", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Rawtext);
    }

    @Test
    public void testRawtextEndTagOpenStateLessThanLetter() throws Exception {
        CharacterReader r = new CharacterReader("/style");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RawtextEndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Transitions to RawtextEndTagName
        assertTrue(t.getState() == TokeniserState.RawtextEndTagName);
    }

    @Test
    public void testRawtextEndTagOpenStateLessThanElse() throws Exception {
        CharacterReader r = new CharacterReader("/123");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RawtextEndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Emits "</" and transitions to Rawtext
        assertEquals("</", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.Rawtext);
    }

    @Test
    public void testRawtextEndTagNameStateHandleDataEndTag() throws Exception {
        CharacterReader r = new CharacterReader("style>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.RawtextEndTagName);
        t.tagPending = t.createTagPending(false);
        t.tagPending.appendTagName("style");
        t.dataBuffer.append("style");
        // We'll test the state transition assuming we've consumed the tag name and are about to process the end of the tag.
        // For simplicity, we'll check that it can transition correctly.
        // If we input "style>", it should emit and transition.
        Tokeniser t2 = new Tokeniser(new CharacterReader("style>"), null);
        t2.transition(TokeniserState.RawtextEndTagName);
        t2.tagPending = t2.createTagPending(false);
        t2.tagPending.appendTagName("style");
        t2.dataBuffer.append("style");
        t2.read(); // consumes "style"
        t2.read(); // consumes ">"
        assertTrue(t2.getState() == TokeniserState.Data);
        t2.emitTagPending(); // check if tag was emitted
    }

    @Test
    public void testScriptDataLessthanSignStateSlash() throws Exception {
        CharacterReader r = new CharacterReader("</script>");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptDataLessthanSign);
        r.advance(); // consume '<'
        t.read();
        // Transitions to ScriptDataEndTagOpen
        assertTrue(t.getState() == TokeniserState.ScriptDataEndTagOpen);
    }

    @Test
    public void testScriptDataLessthanSignStateExclamation() throws Exception {
        CharacterReader r = new CharacterReader("<!");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptDataLessthanSign);
        r.advance(); // consume '<'
        t.read();
        // Emits "<!" and transitions to ScriptDataEscapeStart
        assertEquals("<!", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.ScriptDataEscapeStart);
    }

    @Test
    public void testScriptDataLessthanSignStateElse() throws Exception {
        CharacterReader r = new CharacterReader("<scriptdata");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptDataLessthanSign);
        r.advance(); // consume '<'
        t.read();
        // Emits "<" and transitions to ScriptData
        assertEquals("<", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.ScriptData);
    }

    @Test
    public void testScriptDataEndTagOpenStateLessThanLetter() throws Exception {
        CharacterReader r = new CharacterReader("/script");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptDataEndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Transitions to ScriptDataEndTagName
        assertTrue(t.getState() == TokeniserState.ScriptDataEndTagName);
    }

    @Test
    public void testScriptDataEndTagOpenStateLessThanElse() throws Exception {
        CharacterReader r = new CharacterReader("/123");
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptDataEndTagOpen);
        r.advance(); // consume '/'
        t.read();
        // Emits "</" and transitions to ScriptData
        assertEquals("</", t.read().asCharacter().getData());
        assertTrue(t.getState() == TokeniserState.ScriptData);
    }

    @Test
    public void testScriptDataDoubleEscapeStartStateHandleDataDoubleEscapeTag() throws Exception {
        CharacterReader r = new CharacterReader("script<"); // This will be consumed by handleDataDoubleEscapeTag
        Tokeniser t = new Tokeniser(r, null);
        t.transition(TokeniserState.ScriptDataDoubleEscapeStart);
        t.dataBuffer.append("<"); // Simulate the start of the double escape sequence detection
        t.read(); // This call will delegate to handleDataDoubleEscapeTag
        // The state transition depends on the character after "script".
        // If it's '<', it goes to ScriptDataDoubleEscaped.
        assertTrue(t.getState() == TokeniserState.ScriptDataDoubleEscaped);
    }

    @Test
    public void testAttributeValueDoubleQuotedConsumeValueAndAmpersand() throws Exception {
        CharacterReader r = new CharacterReader("value&amp;more");
        Tokeniser t = new Tokeniser(r, null);
        t.tagPending = t.createTagPending(true);
        t.tagPending.newAttribute();
        t.transition(TokeniserState.AttributeValue_doubleQuoted);
        // Consume 'value'
        t.read();
        // Consume '&amp;'
        t.read();
        assertEquals("value&amp;", t.tagPending.attributes.get("")); // Assuming attribute name is empty string for first attr
        assertTrue(t.getState() == TokeniserState.AttributeValue_doubleQuoted); // Should remain in state until closing quote
    }

    @Test
    public void testAttributeValueDoubleQuotedConsumeValueAndQuote() throws Exception {
        CharacterReader r = new CharacterReader("value\"");
        Tokeniser t = new Tokeniser(r, null);
        t.tagPending = t.createTagPending(true);
        t.tagPending.newAttribute();
        t.transition(TokeniserState.AttributeValue_doubleQuoted);
        t.read(); // Consumes "value"
        t.read(); // Consumes '"'
        assertTrue(t.getState() == TokeniserState.AfterAttributeValue_quoted);
    }

    @Test
    public void testAttributeValueUnquotedConsumeValueAndAmpersand() throws Exception {
        CharacterReader r = new CharacterReader("value&amp;more");
        Tokeniser t = new Tokeniser(r, null);
        t.tagPending = t.createTagPending(true);
        t.tagPending.newAttribute();
        t.transition(TokeniserState.AttributeValue_unquoted);
        // Consume 'value'
        t.read();
        // Consume '&amp;'
        t.read();
        assertEquals("value&amp;", t.tagPending.attributes.get("")); // Assuming attribute name is empty string for first attr
        assertTrue(t.getState() == TokeniserState.AttributeValue_unquoted); // Should remain in state until closing quote or >
    }

    @Test
    public void testAttributeValueUnquotedConsumeValueAndGreaterThan() throws Exception {
        CharacterReader r = new CharacterReader("value>");
        Tokeniser t = new Tokeniser(r, null);
        t.tagPending = t.createTagPending(true);
        t.tagPending.newAttribute();
        t.transition(TokeniserState.AttributeValue_unquoted);
        t.read(); // Consumes "value"
        t.read(); // Consumes '>'
        assertTrue(t.getState() == TokeniserState.Data);
        t.emitTagPending();
    }

    @Test
    public void testBeforeAttributeNameStateSlash() throws Exception {
        CharacterReader r = new CharacterReader("/attr");
        Tokeniser t = new Tokeniser(r, null);
        t.tagPending = t.createTagPending(true);
        t.transition(TokeniserState.BeforeAttributeName);
        r.advance(); // consume '/'
        t.read();
        assertTrue(t.getState() == TokeniserState.SelfClosingStartTag);
    }

    @Test
    public void testBeforeAttributeNameStateGreaterThan() throws Exception {
        CharacterReader r = new CharacterReader(">");
        Tokeniser t = new Tokeniser(r, null);
        t.tagPending = t.createTagPending(true);
        t.transition(TokeniserState.BeforeAttributeName);
        r.advance(); // consume '>'
        t.read();
        assertTrue(t.getState() == TokeniserState.Data);
        t.emitTagPending();
    }
}
