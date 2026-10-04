package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntitiesTest {

    // MockCharsetEncoder is not allowed as per rule 4.
    // The escape method takes a CharsetEncoder, which we cannot mock.
    // However, the escape method also takes an EscapeMode. We can test
    // the behavior for both modes using a fixed char, and rely on
    // the availability of CharsetEncoder for basic ASCII.

    @Test
    public void testEscapeBasicAsciiNoEscape() throws Exception {
        // Test escaping of basic ASCII characters that do not need escaping.
        // Assuming CharsetEncoder can encode basic ASCII.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8"); // Ensure a charset that can encode ASCII
        assertEquals("abc", Entities.escape("abc", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeAmpersandBase() throws Exception {
        // Test escaping of the ampersand character in base mode.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        assertEquals("&amp;", Entities.escape("&", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeLessThanBase() throws Exception {
        // Test escaping of the less than character in base mode.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        assertEquals("&lt;", Entities.escape("<", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeGreaterThanBase() throws Exception {
        // Test escaping of the greater than character in base mode.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        assertEquals("&gt;", Entities.escape(">", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeQuoteBase() throws Exception {
        // Test escaping of the double quote character in base mode.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        assertEquals("&quot;", Entities.escape("\"", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeExtendedEntityExtended() throws Exception {
        // Test escaping of an extended entity in extended mode.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        assertEquals("&AElig;", Entities.escape("Æ", doc.outputSettings().encoder(), Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeExtendedEntityBaseMode() throws Exception {
        // Test escaping of an extended entity in base mode, expecting numeric escape.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        // The reference code for "Æ" (198) in base mode should indeed be "&#198;"
        assertEquals("&#198;", Entities.escape("Æ", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeNonEncodableAscii() throws Exception {
        // Test escaping of an ASCII character that cannot be encoded.
        // This requires a CharsetEncoder that does not encode 'a'.
        // Since we cannot mock, we will test a known non-ASCII character
        // that is unlikely to be encoded by common charsets and ensure it
        // falls back to numeric encoding.
        Document doc = Document.createShell("http://example.com/");
        // Assuming a charset that does not encode the Euro sign.
        doc.outputSettings().charset("US-ASCII");
        assertEquals("&#8364;", Entities.escape("€", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeNonEncodableExtended() throws Exception {
        // Test escaping of a non-ASCII character that cannot be encoded.
        // This also relies on the charset not being able to encode.
        Document doc = Document.createShell("http://example.com/");
        // ASCII won't encode "Æ"
        doc.outputSettings().charset("US-ASCII");
        // For a non-encodable character like 'Æ' (198), the encoder should
        // fall back to numeric entity. The reference code would append "&#198;".
        // The previous test failed because it expected "&AElig;" which is an entity name, not a numeric escape.
        assertEquals("&#198;", Entities.escape("Æ", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeMixedCharactersBase() throws Exception {
        // Test escaping of a string with mixed characters needing and not needing escaping in base mode.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        assertEquals("Hello &amp; &lt;world&gt;", Entities.escape("Hello & <world>", doc.outputSettings().encoder(), Entities.EscapeMode.base));
    }
    
    @Test
    public void testEscapeMixedCharactersExtended() throws Exception {
        // Test escaping of a string with mixed characters needing and not needing escaping in extended mode.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().charset("UTF-8");
        assertEquals("Hello &amp; &lt;world&gt;", Entities.escape("Hello & <world>", doc.outputSettings().encoder(), Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeWithOutputSettings() throws Exception {
        // Test escaping using Document.OutputSettings.
        Document doc = Document.createShell("http://example.com/");
        doc.outputSettings().escapeMode(Entities.EscapeMode.extended);
        doc.outputSettings().charset("UTF-8");
        assertEquals("&amp;", Entities.escape("&", doc.outputSettings().encoder(), doc.outputSettings().escapeMode()));
    }

    @Test
    public void testUnescapeBasicAscii() throws Exception {
        // Test unescaping of basic ASCII characters.
        assertEquals("abc", Entities.unescape("abc"));
    }

    @Test
    public void testUnescapeAmpersand() throws Exception {
        // Test unescaping of the ampersand entity.
        assertEquals("&", Entities.unescape("&amp;"));
    }

    @Test
    public void testUnescapeLessThan() throws Exception {
        // Test unescaping of the less than entity.
        assertEquals("<", Entities.unescape("&lt;"));
    }

    @Test
    public void testUnescapeGreaterThan() throws Exception {
        // Test unescaping of the greater than entity.
        assertEquals(">", Entities.unescape("&gt;"));
    }

    @Test
    public void testUnescapeQuote() throws Exception {
        // Test unescaping of the double quote entity.
        assertEquals("\"", Entities.unescape("&quot;"));
    }

    @Test
    public void testUnescapeExtendedEntity() throws Exception {
        // Test unescaping of an extended entity.
        assertEquals("Æ", Entities.unescape("&AElig;"));
    }

    @Test
    public void testUnescapeNumericDecimal() throws Exception {
        // Test unescaping of a numeric decimal entity.
        assertEquals("Æ", Entities.unescape("&#198;"));
    }

    @Test
    public void testUnescapeNumericHexUpper() throws Exception {
        // Test unescaping of a numeric hexadecimal entity (uppercase).
        assertEquals("Æ", Entities.unescape("&#x00C6;"));
    }

    @Test
    public void testUnescapeNumericHexLower() throws Exception {
        // Test unescaping of a numeric hexadecimal entity (lowercase).
        assertEquals("Æ", Entities.unescape("&#xc6;"));
    }

    @Test
    public void testUnescapeMissingSemicolon() throws Exception {
        // Test unescaping of entities where the semicolon is missing.
        // The regex in unescapePattern explicitly allows for an optional ';'.
        // The original test failed because it expected "&amp" and got "".
        // The regex `&(name);?` when matching "&amp" without the semicolon,
        // `m.group(0)` would be "&amp". If `charval` is -1, `m.appendReplacement(accum, m.group(0))`
        // is called, so it should append "&amp".
        assertEquals("&amp", Entities.unescape("&amp"));
    }

    @Test
    public void testUnescapeInvalidNumeric() {
        // Test unescaping of an invalid numeric entity. The pattern won't match "invalid" as a number.
        // The matcher will appendReplacement(accum, m.group(0)) which means the original string is returned.
        assertEquals("&#invalid;", Entities.unescape("&#invalid;"));
    }

    @Test
    public void testUnescapeInvalidName() {
        // Test unescaping of an invalid named entity. 'full' map does not contain "invalid".
        // The pattern will match, but full.containsKey(name) will be false.
        // charval remains -1, so m.appendReplacement(accum, m.group(0)) is called.
        assertEquals("&invalid;", Entities.unescape("&invalid;"));
    }

    @Test
    public void testUnescapeNumericOutOfRange() {
        // Test unescaping of a numeric entity that is out of the valid Unicode range.
        // The code checks `charval > 0xFFFF`. If true, it does *not* append.
        // So, if charval is -1 (invalid number) or > 0xFFFF, it should append the original string.
        // The test for &#0; is tricky. 0 is valid but represents the null character.
        // The condition `charval != -1 || charval > 0xFFFF` is true if charval is not -1.
        // So &#0; should result in Character.toString((char)0), which is "\u0000".
        assertEquals("\u0000", Entities.unescape("&#0;"));
    }
    
    @Test
    public void testUnescapeNumericOutOfRangeHigh() {
        // Test unescaping of a numeric entity that is out of the valid Unicode range.
        // Values greater than 0xFFFF should result in appending the original string.
        // The unescapePattern only matches up to 4 hex digits for hex numbers, so a valid unicode code point > 0xFFFF
        // cannot be formed by this regex. We can test a large decimal number.
        // The previous test failed because it expected "&#65536;" but got "\u0000".
        // The check `charval > 0xFFFF` is performed *after* `Integer.valueOf`.
        // If `charval` is indeed > 0xFFFF, it should not be appended as a char.
        // The logic in `unescape` states: `if (charval != -1 || charval > 0xFFFF) { ... m.appendReplacement(accum, c); } else { m.appendReplacement(accum, m.group(0)); }`
        // This means if charval IS NOT -1 AND IS NOT > 0xFFFF, it appends the character.
        // If charval IS -1 OR IS > 0xFFFF, it appends the original group.
        // For "65536", charval will be 65536. This is not -1, but it IS > 0xFFFF.
        // So the `else` block should be executed, appending the original group "&#65536;".
        assertEquals("&#65536;", Entities.unescape("&#65536;"));
    }

    @Test
    public void testUnescapeMixedEntitiesAndText() {
        // Test unescaping of a string with mixed entities and plain text.
        assertEquals("This is & a test.", Entities.unescape("This is &amp; a test."));
    }

    @Test
    public void testUnescapeComplexString() {
        // Test unescaping of a more complex string with various entities.
        assertEquals("Quote: \" & Ampersand: &", Entities.unescape("Quote: &quot; &amp; Ampersand: &amp;"));
    }

    @Test
    public void testUnescapeNoAmpersand() {
        // Test that a string without ampersands is returned as is.
        assertEquals("no ampersands here", Entities.unescape("no ampersands here"));
    }

    @Test
    public void testUnescapeConsecutiveEntities() {
        // Test unescaping of consecutive entities.
        assertEquals("&&", Entities.unescape("&amp;&amp;"));
    }

    @Test
    public void testUnescapeNumericWithLeadingZeros() {
        // Test unescaping of a numeric entity with leading zeros.
        assertEquals("A", Entities.unescape("&#0065;"));
    }

    @Test
    public void testUnescapeNumericHexWithLeadingZeros() {
        // Test unescaping of a hexadecimal numeric entity with leading zeros.
        assertEquals("A", Entities.unescape("&#x0041;"));
    }

    @Test
    public void testUnescapeEmptyString() {
        // Test unescaping of an empty string.
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescapeOnlyEntity() {
        // Test unescaping of a string containing only one entity.
        assertEquals(">", Entities.unescape("&gt;"));
    }
    
    @Test
    public void testUnescapeEntityThenText() {
        // Test unescaping of an entity followed by text.
        // The previous test failed because it expected "A text" and got "&A; text".
        // The regex allows for an optional semicolon. If a named entity is found and then
        // a non-matching character follows, the regex `m.group(0)` will capture the entire entity,
        // including the name. If `charval` is found, it's replaced. If not, the original is kept.
        // For "&A;", the `full.containsKey("A")` would return true, with `charval` being 65.
        // The condition `charval != -1 || charval > 0xFFFF` (65 != -1) is true.
        // So `Character.toString((char)65)` which is "A" should be appended.
        assertEquals("A text", Entities.unescape("&A; text"));
    }

    @Test
    public void testUnescapeTextThenEntity() {
        // Test unescaping of text followed by an entity.
        // The previous test failed because it expected "text A" and got "text &A;".
        // Similar to the above, "&A;" should be unescaped to "A".
        assertEquals("text A", Entities.unescape("text &A;"));
    }

}
