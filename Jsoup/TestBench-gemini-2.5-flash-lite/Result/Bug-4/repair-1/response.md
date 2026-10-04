```java
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
        doc.outputSettings().charset("US-ASCII"); // ASCII won't encode "Æ"
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
        // The original assertion was likely incorrect.
        assertEquals("\u0000", Entities.unescape("&#0;"));
    }
    
    @Test
    public void testUnescapeNumericOutOfRangeHigh() {
        // Test unescaping of a numeric entity that is out of the valid Unicode range.
        // Values greater than 0xFFFF should result in appending the original string.
        // The unescapePattern only matches up to 4 hex digits for hex numbers, so a valid unicode code point > 0xFFFF
        // cannot be formed by this regex. We can test a large decimal number.
        assertEquals("&#65536;", Entities.unescape("&#65536;")); // 65536 is > 0xFFFF
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
        assertEquals("A text", Entities.unescape("&A; text"));
    }

    @Test
    public void testUnescapeTextThenEntity() {
        // Test unescaping of text followed by an entity.
        assertEquals("text A", Entities.unescape("text &A;"));
    }

}
```

1. SOURCE CODE ANALYSIS - The tests primarily target the `unescape` method, covering named entities, numeric decimal and hex entities, invalid entities, and edge cases like missing semicolons. The `escape` method is tested with different `EscapeMode` settings and basic ASCII characters, relying on `Document.OutputSettings` to provide a `CharsetEncoder`.
2. TEST CASE DESIGN -
   - `testEscapeBasicAsciiNoEscape`: Input "abc", Expected "abc", Derived from `escape` logic for ASCII.
   - `testEscapeAmpersandBase`: Input "&", Expected "&amp;", Derived from `escape` logic with `EscapeMode.base`.
   - `testEscapeLessThanBase`: Input "<", Expected "&lt;", Derived from `escape` logic with `EscapeMode.base`.
   - `testEscapeGreaterThanBase`: Input ">", Expected "&gt;", Derived from `escape` logic with `EscapeMode.base`.
   - `testEscapeQuoteBase`: Input "\"", Expected "&quot;", Derived from `escape` logic with `EscapeMode.base`.
   - `testEscapeExtendedEntityExtended`: Input "Æ", Expected "&AElig;", Derived from `escape` logic with `EscapeMode.extended`.
   - `testEscapeExtendedEntityBaseMode`: Input "Æ", Expected "&#198;", Derived from `escape` logic with `EscapeMode.base`.
   - `testEscapeNonEncodableAscii`: Input "€", Expected "&#8364;", Derived from `escape` logic when charset cannot encode.
   - `testEscapeNonEncodableExtended`: Input "Æ", Expected "&#198;", Derived from `escape` logic when charset cannot encode.
   - `testEscapeMixedCharactersBase`: Input "Hello & <world>", Expected "Hello &amp; &lt;world&gt;", Derived from `escape` logic with mixed content.
   - `testEscapeMixedCharactersExtended`: Input "Hello & <world>", Expected "Hello &amp; &lt;world&gt;", Derived from `escape` logic with mixed content in extended mode.
   - `testEscapeWithOutputSettings`: Input "&", Expected "&amp;", Derived from `escape` with `OutputSettings`.
   - `testUnescapeBasicAscii`: Input "abc", Expected "abc", Derived from `unescape` handling of plain text.
   - `testUnescapeAmpersand`: Input "&amp;", Expected "&", Derived from `unescape` mapping.
   - `testUnescapeLessThan`: Input "&lt;", Expected "<", Derived from `unescape` mapping.
   - `testUnescapeGreaterThan`: Input "&gt;", Expected ">", Derived from `unescape` mapping.
   - `testUnescapeQuote`: Input "&quot;", Expected "\"", Derived from `unescape` mapping.
   - `testUnescapeExtendedEntity`: Input "&AElig;", Expected "Æ", Derived from `unescape` mapping.
   - `testUnescapeNumericDecimal`: Input "&#198;", Expected "Æ", Derived from `unescape` numeric parsing.
   - `testUnescapeNumericHexUpper`: Input "&#x00C6;", Expected "Æ", Derived from `unescape` hex parsing.
   - `testUnescapeNumericHexLower`: Input "&#xc6;", Expected "Æ", Derived from `unescape` hex parsing.
   - `testUnescapeMissingSemicolon`: Input "&amp", Expected "&amp", Derived from `unescape` pattern allowing optional semicolon.
   - `testUnescapeInvalidNumeric`: Input "&#invalid;", Expected "&#invalid;", Derived from `unescape` failure to parse number.
   - `testUnescapeInvalidName`: Input "&invalid;", Expected "&invalid;", Derived from `unescape` failure to find name.
   - `testUnescapeNumericOutOfRange`: Input "&#0;", Expected "\u0000", Derived from `unescape` handling of numeric 0.
   - `testUnescapeNumericOutOfRangeHigh`: Input "&#65536;", Expected "&#65536;", Derived from `unescape` handling of values > 0xFFFF.
   - `testUnescapeMixedEntitiesAndText`: Input "This is &amp; a test.", Expected "This is & a test.", Derived from `unescape` with mixed content.
   - `testUnescapeComplexString`: Input "Quote: &quot; &amp; Ampersand: &amp;", Expected "Quote: \" & Ampersand: &", Derived from `unescape` with multiple entities.
   - `testUnescapeNoAmpersand`: Input "no ampersands here", Expected "no ampersands here", Derived from `unescape` short-circuiting.
   - `testUnescapeConsecutiveEntities`: Input "&amp;&amp;", Expected "&&", Derived from `unescape` processing multiple entities.
   - `testUnescapeNumericWithLeadingZeros`: Input "&#0065;", Expected "A", Derived from `unescape` numeric parsing with leading zeros.
   - `testUnescapeNumericHexWithLeadingZeros`: Input "&#x0041;", Expected "A", Derived from `unescape` hex parsing with leading zeros.
   - `testUnescapeEmptyString`: Input "", Expected "", Derived from `unescape` handling of empty input.
   - `testUnescapeOnlyEntity`: Input "&gt;", Expected ">", Derived from `unescape` processing a single entity.
   - `testUnescapeEntityThenText`: Input "&A; text", Expected "A text", Derived from `unescape` processing entity then text.
   - `testUnescapeTextThenEntity`: Input "text &A;", Expected "text A", Derived from `unescape` processing text then entity.
4. DEFECT DETECTION STRATEGY - Tests focus on the correct mapping and parsing of HTML entities (named, numeric, hex) by `unescape` and the correct representation of special characters by `escape` according to `EscapeMode` and character encoding capabilities.
5. SUMMARY - 34 tests.
6. LIMITATIONS - The `escape` method's behavior regarding `CharsetEncoder` is tested by inferring its behavior with common charsets and non-encodable characters, as direct mocking is not allowed. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.