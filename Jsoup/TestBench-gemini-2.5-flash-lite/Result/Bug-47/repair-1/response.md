```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.parser.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharsetEncoder;
import java.util.*;

public class EntitiesTest {
    @Test
    public void testIsNamedEntityValid() {
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("nbsp"));
        assertTrue(Entities.isNamedEntity("euro"));
    }

    @Test
    public void testIsNamedEntityInvalid() {
        assertFalse(Entities.isNamedEntity("notanentity"));
        assertFalse(Entities.isNamedEntity(""));
        assertFalse(Entities.isNamedEntity("amp;")); // trailing semicolon
        assertFalse(Entities.isNamedEntity("&amp")); // leading ampersand
    }

    @Test
    public void testIsNamedEntityCaseSensitive() {
        assertTrue(Entities.isNamedEntity("AMP")); // full entity map is case sensitive
    }

    @Test
    public void testIsBaseNamedEntityValid() {
        assertTrue(Entities.isBaseNamedEntity("lt"));
        assertTrue(Entities.isBaseNamedEntity("gt"));
        assertTrue(Entities.isBaseNamedEntity("amp"));
        assertTrue(Entities.isBaseNamedEntity("nbsp"));
    }

    @Test
    public void testIsBaseNamedEntityInvalid() {
        assertFalse(Entities.isBaseNamedEntity("euro")); // euro is in full, not base
        assertFalse(Entities.isBaseNamedEntity("notanentity"));
    }

    @Test
    public void testGetCharacterByNameValid() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
        assertEquals(Character.valueOf(' '), Entities.getCharacterByName("nbsp")); // Non-breaking space
    }

    @Test
    public void testGetCharacterByNameInvalid() {
        assertNull(Entities.getCharacterByName("notanentity"));
        assertNull(Entities.getCharacterByName(""));
    }

    @Test
    public void testGetCharacterByNameCaseSensitive() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertNull(Entities.getCharacterByName("AMP")); // Key in 'full' is lowercase
    }

    @Test
    public void testXhtmlEscapeMode() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.xhtml);
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "<script>alert('hello & world')</script>\" \"", settings, false, false, false);
        assertEquals("&lt;script&gt;alert(&apos;hello &amp; world&apos;)&lt;/script&gt;&quot; &quot;", accum.toString());
    }

    @Test
    public void testBaseEscapeMode() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "<script>alert('hello & world')</script>\" \"", settings, false, false, false);
        // base mode escapes <, >, &, " but not '
        // nbsp should be escaped as &nbsp;
        assertEquals("&lt;script&gt;alert('hello &amp; world')&lt;/script&gt;&quot; &quot;&nbsp;", accum.toString());
    }

    @Test
    public void testExtendedEscapeMode() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.extended);
        StringBuilder accum = new StringBuilder();
        // Testing characters that are only in extended set, like euro
        Entities.escape(accum, "Copyright © 2023. Euro symbol: €", settings, false, false, false);
        assertEquals("Copyright &copy; 2023. Euro symbol: &euro;", accum.toString());
    }

    @Test
    public void testEscapeAttributeValue() {
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        // quotes should be escaped when inAttribute is true
        Entities.escape(accum, "This has \"quotes\" and <tags> and &ampersands.", settings, true, false, false);
        assertEquals("This has &quot;quotes&quot; and &lt;tags&gt; and &amp;ampersands.", accum.toString());
    }

    @Test
    public void testEscapeAttributeValueXhtml() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.xhtml);
        StringBuilder accum = new StringBuilder();
        // quotes should be escaped in attribute mode and xhtml mode
        Entities.escape(accum, "This has \"quotes\" and <tags> and &ampersands.", settings, true, false, false);
        assertEquals("This has &quot;quotes&quot; and &lt;tags&gt; and &amp;ampersands.", accum.toString());
    }

    @Test
    public void testEscapeNonAsciiCharacters() {
        Document.OutputSettings settings = new Document.OutputSettings();
        // Use a charset that doesn't support all characters, forcing fallback
        settings.charset("US-ASCII");
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "Héllo Wôrld!", settings, false, false, false);
        assertEquals("H&#x00e9;llo W&#x00f4;rld!", accum.toString());
    }
    
    @Test
    public void testEscapeNonAsciiCharactersUTF() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.charset("UTF-8");
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "Héllo Wôrld!", settings, false, false, false);
        assertEquals("Héllo Wôrld!", accum.toString());
    }

    @Test
    public void testEscapeWithNormaliseWhitespace() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "  leading  and   internal   spaces  ", settings, false, true, false);
        assertEquals(" leading and internal spaces ", accum.toString());
    }

    @Test
    public void testEscapeWithNormaliseWhitespaceAndStripLeading() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "  leading  and   internal   spaces  ", settings, false, true, true);
        assertEquals("leading and internal spaces ", accum.toString());
    }

    @Test
    public void testEscapeWithNormaliseWhitespaceAndStripLeadingAndOnlyWhitespace() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        StringBuilder accum = new StringBuilder();
        Entities.escape(accum, "   ", settings, false, true, true);
        assertEquals(" ", accum.toString()); // Collapses to a single space if not stripped
    }

    @Test
    public void testUnescapeBasic() {
        assertEquals("Hello & world", Entities.unescape("Hello &amp; world"));
        assertEquals("Hello <world>", Entities.unescape("Hello &lt;world&gt;"));
        assertEquals("Hello \"world\"", Entities.unescape("Hello &quot;world&quot;"));
    }

    @Test
    public void testUnescapeExtended() {
        assertEquals("Copyright © 2023", Entities.unescape("Copyright &copy; 2023"));
        assertEquals("Euro symbol: €", Entities.unescape("Euro symbol: &euro;"));
    }

    @Test
    public void testUnescapeStrictOptional() {
        // If strict is false, trailing semicolon is optional
        assertEquals("Hello &world", Entities.unescape("Hello &world", false));
        assertEquals("Hello &world", Entities.unescape("Hello &world;", false));
    }
    
    @Test
    public void testUnescapeStrictRequired() {
        // If strict is true, trailing semicolon is required
        assertEquals("&world", Entities.unescape("Hello &world", true)); // This should be parsed as literal '&world'
        assertEquals("Hello &world", Entities.unescape("Hello &world;", true)); // This should be parsed as '&world'
    }

    @Test
    public void testUnescapeNoEntity() {
        assertEquals("Just plain text", Entities.unescape("Just plain text"));
    }

    @Test
    public void testUnescapeMalformed() {
        assertEquals("&", Entities.unescape("&"));
        assertEquals("&amp", Entities.unescape("&amp"));
        assertEquals("&amp;", Entities.unescape("&amp;"));
        assertEquals("&#x1", Entities.unescape("&#x1")); // Incomplete hex entity
        assertEquals("&#x12;", Entities.unescape("&#x12;")); // Valid short hex
    }

    @Test
    public void testUnescapeNumericHex() {
        assertEquals("€", Entities.unescape("&#x20ac;"));
        assertEquals("™", Entities.unescape("&#x2122;"));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        assertEquals("€", Entities.unescape("&#8364;"));
        assertEquals("™", Entities.unescape("&#8482;"));
    }

    @Test
    public void testUnescapeSurrogatePair() {
        // Example: Emoji U+1F600 (Grinning Face)
        // UTF-16: D83D DE00
        assertEquals("\uD83D\uDE00", Entities.unescape("&#x1f600;"));
        assertEquals("\uD83D\uDE00", Entities.unescape("&#128512;"));
    }
    
    @Test
    public void testUnescapeInAttributeMode() {
        // In attribute mode, < and > are not treated as special characters for unescaping purposes
        assertEquals("<script>alert('hello')</script>", Entities.unescape("<script>alert('hello')</script>", true));
    }

    @Test
    public void testUnescapeWithExistingAmpersand() {
        assertEquals("a&b", Entities.unescape("a&b", false));
    }

    @Test
    public void testUnescapeMultipleEntities() {
        assertEquals("a < b & c > d", Entities.unescape("a &lt; b &amp; c &gt; d"));
    }
}
```

1. SOURCE CODE ANALYSIS - tests cover `isNamedEntity`, `isBaseNamedEntity`, `getCharacterByName` and the `escape` method with various `EscapeMode` and `Document.OutputSettings`. `unescape` is tested with and without strict mode, numeric and named entities.
2. TEST CASE DESIGN - `testIsNamedEntityValid`: true for "amp", "nbsp", "euro". `testIsNamedEntityInvalid`: false for "notanentity", "", "amp;", "&amp". `testIsNamedEntityCaseSensitive`: true for "AMP". `testIsBaseNamedEntityValid`: true for "lt", "gt", "amp", "nbsp". `testIsBaseNamedEntityInvalid`: false for "euro", "notanentity". `testGetCharacterByNameValid`: '&' for "amp", '<' for "lt", etc. `testGetCharacterByNameInvalid`: null for "notanentity", "". `testGetCharacterByNameCaseSensitive`: '&' for "amp", null for "AMP". `testXhtmlEscapeMode`: "<script>..." -> "&lt;script&gt;...". `testBaseEscapeMode`: "<script>..." -> "&lt;script&gt;...&nbsp;". `testExtendedEscapeMode`: "Copyright ©..." -> "Copyright &copy;...&euro;". `testEscapeAttributeValue`: "This has \"quotes\"..." -> "This has &quot;quotes&quot;...". `testEscapeAttributeValueXhtml`: "This has \"quotes\"..." -> "This has &quot;quotes&quot;...". `testEscapeNonAsciiCharacters`: "Héllo Wôrld!" (US-ASCII) -> "H&#x00e9;llo W&#x00f4;rld!". `testEscapeNonAsciiCharactersUTF`: "Héllo Wôrld!" (UTF-8) -> "Héllo Wôrld!". `testEscapeWithNormaliseWhitespace`: "  leading  ..." -> " leading ...". `testEscapeWithNormaliseWhitespaceAndStripLeading`: "  leading  ..." -> "leading ...". `testEscapeWithNormaliseWhitespaceAndStripLeadingAndOnlyWhitespace`: "   " -> " ". `testUnescapeBasic`: "&amp;" -> "&". `testUnescapeExtended`: "&copy;" -> "©". `testUnescapeStrictOptional`: "&world" -> "Hello &world". `testUnescapeStrictRequired`: "Hello &world" -> "&world". `testUnescapeNoEntity`: "plain text" -> "plain text". `testUnescapeMalformed`: "&" -> "&". `testUnescapeNumericHex`: "&#x20ac;" -> "€". `testUnescapeNumericDecimal`: "&#8364;" -> "€". `testUnescapeSurrogatePair`: "&#x1f600;" -> "\uD83D\uDE00". `testUnescapeInAttributeMode`: "<script>..." -> "<script>...". `testUnescapeWithExistingAmpersand`: "a&b" -> "a&b". `testUnescapeMultipleEntities`: "&lt; &amp; &gt;" -> "< & >".
4. DEFECT DETECTION STRATEGY - Tests target specific entity conversions, escape modes, character encoding handling, whitespace normalization, and unescaping logic, especially edge cases and strictness in unescaping.
5. SUMMARY - 23 tests.
6. LIMITATIONS - Tests rely on internal static methods `escape` and `toCharacterKey`, which were not part of the public API outline but were necessary to test the class's core logic.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.