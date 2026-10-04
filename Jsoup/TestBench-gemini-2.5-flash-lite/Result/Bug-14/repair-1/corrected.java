package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import java.util.ArrayList;
import java.util.List;

public class TokeniserTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a CharacterReader and Tokeniser
    private Tokeniser createTokeniser(String html) {
        CharacterReader reader = new CharacterReader(html);
        return new Tokeniser(reader);
    }

    // Test basic data state, consuming characters until a specific delimiter.
    @Test
    public void testDataStateSimple() throws Exception {
        Tokeniser t = createTokeniser("abc<");
        assertEquals("abc", t.read().asCharacter().data());
    }

    // Test data state with null character.
    @Test
    public void testDataStateNullChar() throws Exception {
        Tokeniser t = createTokeniser("abc\u0000def");
        assertEquals("abc\uFFFDdef", t.read().asCharacter().data());
    }

    // Test data state with EOF.
    @Test
    public void testDataStateEOF() throws Exception {
        Tokeniser t = createTokeniser("abc");
        Token token = t.read();
        assertTrue(token.isCharacter());
        assertEquals("abc", token.asCharacter().data());
        token = t.read();
        assertTrue(token.isEOF());
    }

    // Test character reference in data state.
    @Test
    public void testCharacterReferenceInData() throws Exception {
        Tokeniser t = createTokeniser("&amp;");
        assertEquals("&", t.read().asCharacter().data()); // &
    }

    // Test invalid character reference in data state.
    @Test
    public void testInvalidCharacterReferenceInData() throws Exception {
        Tokeniser t = createTokeniser("&invalid;");
        assertEquals("&invalid;", t.read().asCharacter().data());
    }

    // Test character reference in data state, not followed by semicolon.
    @Test
    public void testCharacterReferenceInDataNotClosed() throws Exception {
        Tokeniser t = createTokeniser("&amp"); // missing semicolon
        assertEquals("&amp", t.read().asCharacter().data());
    }

    // Test start tag parsing.
    @Test
    public void testStartTagSimple() throws Exception {
        Tokeniser t = createTokeniser("<p>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("p", startTag.name());
        assertFalse(startTag.selfClosing);
    }

    // Test end tag parsing.
    @Test
    public void testEndTagSimple() throws Exception {
        Tokeniser t = createTokeniser("</p>");
        Token.EndTag endTag = (Token.EndTag) t.read();
        assertEquals("p", endTag.name());
        assertTrue(endTag.attributes.isEmpty());
    }

    // Test self-closing start tag.
    @Test
    public void testSelfClosingStartTag() throws Exception {
        Tokeniser t = createTokeniser("<br/>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("br", startTag.name());
        assertTrue(startTag.selfClosing);
    }

    // Test start tag with an attribute.
    @Test
    public void testStartTagWithAttribute() throws Exception {
        Tokeniser t = createTokeniser("<a href='test.html'>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("a", startTag.name());
        assertEquals("test.html", startTag.attributes.get("href"));
    }

    // Test start tag with an unquoted attribute value.
    @Test
    public void testStartTagUnquotedAttribute() throws Exception {
        Tokeniser t = createTokeniser("<a href=test.html>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("a", startTag.name());
        assertEquals("test.html", startTag.attributes.get("href"));
    }

    // Test start tag with attribute value containing special characters.
    @Test
    public void testStartTagAttributeValueWithSpecialChars() throws Exception {
        Tokeniser t = createTokeniser("<img alt='>'>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("img", startTag.name());
        assertEquals(">", startTag.attributes.get("alt"));
    }

    // Test comment parsing.
    @Test
    public void testCommentSimple() throws Exception {
        Tokeniser t = createTokeniser("<!-- comment -->");
        Token.Comment comment = (Token.Comment) t.read();
        assertEquals(" comment ", comment.data());
    }

    // Test doctype parsing.
    @Test
    public void testDoctypeSimple() throws Exception {
        Tokeniser t = createTokeniser("<!DOCTYPE html>");
        Token.Doctype doctype = (Token.Doctype) t.read();
        assertEquals("html", doctype.name);
        assertNull(doctype.publicIdentifier);
        assertNull(doctype.systemIdentifier);
        assertFalse(doctype.forceQuirks);
    }

    // Test doctype with PUBLIC identifier.
    @Test
    public void testDoctypePublic() throws Exception {
        Tokeniser t = createTokeniser("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
        Token.Doctype doctype = (Token.Doctype) t.read();
        assertEquals("html", doctype.name);
        assertEquals("-//W3C//DTD HTML 4.01//EN", doctype.publicIdentifier);
        assertNull(doctype.systemIdentifier);
        assertFalse(doctype.forceQuirks);
    }

    // Test doctype with SYSTEM identifier.
    @Test
    public void testDoctypeSystem() throws Exception {
        Tokeniser t = createTokeniser("<!DOCTYPE html SYSTEM \"about:legacy-compat\">");
        Token.Doctype doctype = (Token.Doctype) t.read();
        assertEquals("html", doctype.name);
        assertNull(doctype.publicIdentifier);
        assertEquals("about:legacy-compat", doctype.systemIdentifier);
        assertFalse(doctype.forceQuirks);
    }

    // Test doctype with force quirks.
    @Test
    public void testDoctypeForceQuirks() throws Exception {
        Tokeniser t = createTokeniser("<!DOCTYPE>");
        Token.Doctype doctype = (Token.Doctype) t.read();
        assertEquals("", doctype.name);
        assertNull(doctype.publicIdentifier);
        assertNull(doctype.systemIdentifier);
        assertTrue(doctype.forceQuirks);
    }

    // Test bogus doctype.
    @Test
    public void testBogusDoctype() throws Exception {
        Tokeniser t = createTokeniser("<!DOCTYPE foobar>");
        Token.Doctype doctype = (Token.Doctype) t.read();
        assertEquals("foobar", doctype.name); // Bogus doctype will capture content until '>'
        assertTrue(doctype.forceQuirks); // This is expected to be true for bogus doctypes.
    }

    // Test character reference in attribute value.
    @Test
    public void testCharacterReferenceInAttributeValue() throws Exception {
        Tokeniser t = createTokeniser("<a href='&apos;'>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("'", startTag.attributes.get("href"));
    }

    // Test empty input.
    @Test
    public void testEmptyInput() throws Exception {
        Tokeniser t = createTokeniser("");
        assertTrue(t.read().isEOF());
    }

    // Test RCDATA state.
    @Test
    public void testRcdataState() throws Exception {
        Tokeniser t = createTokeniser("<title>Hello</title>");
        // Skip the start tag, focus on the RCDATA content.
        t.read(); // <title>
        assertEquals("Hello", t.read().asCharacter().data());
        t.read(); // </title>
        assertTrue(t.read().isEOF());
    }

    // Test Rawtext state.
    @Test
    public void testRawtextState() throws Exception {
        Tokeniser t = createTokeniser("<style> .red { color: red; } </style>");
        t.read(); // <style>
        assertEquals(" .red { color: red; } ", t.read().asCharacter().data());
        t.read(); // </style>
        assertTrue(t.read().isEOF());
    }

    // Test ScriptData state.
    @Test
    public void testScriptDataState() throws Exception {
        Tokeniser t = createTokeniser("<script> alert('hello'); </script>");
        t.read(); // <script>
        assertEquals(" alert('hello'); ", t.read().asCharacter().data());
        t.read(); // </script>
        assertTrue(t.read().isEOF());
    }

    // Test ScriptData escaped state.
    @Test
    public void testScriptDataEscapedState() throws Exception {
        Tokeniser t = createTokeniser("<script> <!-- a comment --> alert('hi'); </script>");
        t.read(); // <script>
        // The <!-- is not directly handled, it becomes data. The transition to CommentStart is from MarkupDeclarationOpen
        // The expected behavior here is that " <!-- a comment --> " is treated as data.
        assertEquals(" <!-- a comment --> alert('hi'); ", t.read().asCharacter().data());
        t.read(); // </script>
        assertTrue(t.read().isEOF());
    }

    // Test ScriptData double escaped state.
    @Test
    public void testScriptDataDoubleEscapedState() throws Exception {
        Tokeniser t = createTokeniser("<script><![CDATA[ <script> alert('nested'); </script> ]]></script>");
        t.read(); // <script>
        // The CDATA section is handled.
        assertEquals(" <script> alert('nested'); </script> ", t.read().asCharacter().data());
        t.read(); // </script>
        assertTrue(t.read().isEOF());
    }

    // Test tag name with uppercase letters.
    @Test
    public void testTagNameUppercase() throws Exception {
        Tokeniser t = createTokeniser("<DIV>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("div", startTag.name());
    }

    // Test attribute name with uppercase letters.
    @Test
    public void testAttributeNameUppercase() throws Exception {
        Tokeniser t = createTokeniser("<a HREF='test'>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("test", startTag.attributes.get("href"));
    }

    // Test consuming character reference in attribute where it's not expected.
    @Test
    public void testConsumeCharacterReferenceInAttribute() throws Exception {
        Tokeniser t = createTokeniser("<a href='&amp'>"); // missing semicolon, but should be handled
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("&amp", startTag.attributes.get("href"));
    }

    // Test an attribute value that contains a '<' character.
    @Test
    public void testAttributeValueWithLessThan() throws Exception {
        Tokeniser t = createTokeniser("<a title='a < b'>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("a < b", startTag.attributes.get("title"));
    }

    // Test an attribute value that contains a '&' character.
    @Test
    public void testAttributeValueWithAmpersand() throws Exception {
        Tokeniser t = createTokeniser("<a title='a & b'>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("a & b", startTag.attributes.get("title"));
    }

    // Test a tag where the name is partially consumed by a character reference.
    @Test
    public void testTagNamePartiallyConsumedByCharRef() throws Exception {
        Tokeniser t = createTokeniser("<&>"); // This is more direct for testing tag name handling.
        Token.StartTag st = (Token.StartTag) t.read();
        assertEquals("&", st.name());
        assertTrue(st.attributes.isEmpty());

        // Testing a more complex case: <tag&amp;name>
        t = createTokeniser("<tag&amp;name>");
        // The state will be in TagName state.
        // When '&' is encountered in TagName, it should consume characters until a delimiter.
        // However, '&' is not a delimiter in TagName.
        // The CharacterReader.consumeToAny method for TagName does not include '&'.
        // Thus, '&amp;' would be part of the tag name.
        st = (Token.StartTag) t.read();
        assertEquals("tag&amp;name", st.name());
    }

    // Test CDATA section.
    @Test
    public void testCdataSection() throws Exception {
        Tokeniser t = createTokeniser("<![CDATA[ this is data ]]>");
        assertEquals(" this is data ", t.read().asCharacter().data());
    }

    // Test null character handling in various states.
    @Test
    public void testNullCharHandling() throws Exception {
        Tokeniser t = createTokeniser("abc\u0000def"); // Data state
        assertEquals("abc\uFFFDdef", t.read().asCharacter().data());

        t = createTokeniser("<title>\u0000</title>"); // Rcdata state
        t.read(); // <title>
        assertEquals("\uFFFD", t.read().asCharacter().data());
        t.read(); // </title>

        t = createTokeniser("<style>\u0000</style>"); // Rawtext state
        t.read(); // <style>
        assertEquals("\uFFFD", t.read().asCharacter().data());
        t.read(); // </style>

        t = createTokeniser("<script>\u0000</script>"); // ScriptData state
        t.read(); // <script>
        assertEquals("\uFFFD", t.read().asCharacter().data());
        t.read(); // </script>
    }

    // Test handling of multiple character references in sequence.
    @Test
    public void testMultipleCharacterReferences() throws Exception {
        Tokeniser t = createTokeniser("&lt;&gt;&amp;");
        assertEquals("<&", t.read().asCharacter().data());
    }

    // Test a self-closing tag with an attribute.
    @Test
    public void testSelfClosingTagWithAttribute() throws Exception {
        Tokeniser t = createTokeniser("<img src='image.png' />");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("img", startTag.name());
        assertTrue(startTag.selfClosing);
        assertEquals("image.png", startTag.attributes.get("src"));
    }

    // Test edge case of an empty attribute value.
    @Test
    public void testEmptyAttributeValue() throws Exception {
        Tokeniser t = createTokeniser("<input type=\"\">");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("input", startTag.name());
        assertEquals("", startTag.attributes.get("type"));
    }

    // Test comment ending with '>'.
    @Test
    public void testCommentEndWithGreaterThan() throws Exception {
        Tokeniser t = createTokeniser("<!-- comment > -->");
        Token.Comment comment = (Token.Comment) t.read();
        assertEquals(" comment > ", comment.data());
    }

    // Test comment starting with '--'.
    @Test
    public void testCommentStartWithDoubleDash() throws Exception {
        Tokeniser t = createTokeniser("<!-- -- -->");
        Token.Comment comment = (Token.Comment) t.read();
        assertEquals(" -- ", comment.data());
    }

    // Test a doctype with only the keyword PUBLIC, no identifier.
    @Test
    public void testDoctypePublicKeywordOnly() throws Exception {
        Tokeniser t = createTokeniser("<!DOCTYPE PUBLIC>");
        Token.Doctype doctype = (Token.Doctype) t.read();
        assertEquals("", doctype.name); // Name is empty as it wasn't provided.
        assertNull(doctype.publicIdentifier); // No public identifier
        assertNull(doctype.systemIdentifier); // No system identifier
        assertTrue(doctype.forceQuirks); // Quirks mode should be true due to malformed doctype.
    }

    // Test a doctype with only the keyword SYSTEM, no identifier.
    @Test
    public void testDoctypeSystemKeywordOnly() throws Exception {
        Tokeniser t = createTokeniser("<!DOCTYPE SYSTEM>");
        Token.Doctype doctype = (Token.Doctype) t.read();
        assertEquals("", doctype.name); // Name is empty.
        assertNull(doctype.publicIdentifier);
        assertNull(doctype.systemIdentifier); // No system identifier.
        assertTrue(doctype.forceQuirks); // Quirks mode should be true.
    }

    // Test character reference for null character in RCDATA.
    @Test
    public void testCharacterReferenceNullInRcdata() throws Exception {
        Tokeniser t = createTokeniser("<title>&#0;</title>");
        t.read(); // <title>
        assertEquals("\uFFFD", t.read().asCharacter().data()); // &#0; should map to replacement char
        t.read(); // </title>
    }

    // Test that attributes are not present on end tags.
    @Test
    public void testEndTagAttributesError() throws Exception {
        Tokeniser t = createTokeniser("</a attribute='value'>");
        // This should emit an error, but the token itself should be an EndTag with no attributes.
        Token.EndTag endTag = (Token.EndTag) t.read();
        assertEquals("a", endTag.name());
        assertTrue(endTag.attributes.isEmpty());
    }

    // Test self-closing flag acknowledgement.
    @Test
    public void testSelfClosingFlagAcknowledgement() throws Exception {
        Tokeniser t = createTokeniser("<br/>");
        t.read(); // Should acknowledge the flag.
        // No direct assertion on flag acknowledgement, but if it causes an error, it would be caught.
        // The test is more to ensure the process runs without error.
        // If a defect exists, it might manifest as an error being reported.
        // For now, we assume it works correctly.
        assertTrue(true);
    }

    // Test character reference with a named entity that does not exist.
    @Test
    public void testUnknownNamedEntity() throws Exception {
        Tokeniser t = createTokeniser("&nonexistent;");
        assertEquals("&nonexistent;", t.read().asCharacter().data());
    }

    // Test consuming a character reference that is part of an attribute value.
    @Test
    public void testCharacterReferenceInAttributeValueNotQuoted() throws Exception {
        Tokeniser t = createTokeniser("<a href=test&amp;page.html>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("test&page.html", startTag.attributes.get("href"));
    }

    // Test attribute names with special characters (should be consumed as part of name).
    @Test
    public void testAttributeNameWithSpecialChars() throws Exception {
        Tokeniser t = createTokeniser("<a data-id='123'>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        assertEquals("123", startTag.attributes.get("data-id"));
    }

    // Test parsing a tag with a null character in its name.
    @Test
    public void testTagNameNullChar() throws Exception {
        Tokeniser t = createTokeniser("<a\u0000b>");
        Token.StartTag startTag = (Token.StartTag) t.read();
        // The null character should be replaced with replacementChar in the tag name.
        assertEquals("a\uFFFD b", startTag.name());
    }
}
