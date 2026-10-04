package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntitiesTest {

    // Helper method to create a valid Document.OutputSettings











    @Test
    public void testUnescapeSimpleEntity() {
        String input = "Hello &amp; World";
        assertEquals("Hello & World", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumericEntityDecimal() {
        String input = "Value: &#38;";
        assertEquals("Value: &", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNumericEntityHex() {
        String input = "Value: &#x26;";
        assertEquals("Value: &", Entities.unescape(input));
    }

    @Test
    public void testUnescapeMixedEntities() {
        String input = "A &amp; B &#61; C &#x3D;";
        assertEquals("A & B = C =", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNoAmpersand() {
        String input = "No entities here.";
        assertEquals("No entities here.", Entities.unescape(input));
    }

    @Test
    public void testUnescapeBaseEntityWithoutSemicolon() {
        // Base entities can be unescaped without a trailing ;
        String input = "amp"; // This should be treated as a valid entity if it's a base entity name
        // The pattern matches `[a-zA-Z]+` and `full.containsKey(name)`.
        // `amp` is a key in `full`.
        assertEquals("&", Entities.unescape(input));
    }

    @Test
    public void testUnescapeInvalidNumericEntity() {
        String input = "Invalid: &#999999;"; // Number too large for int value conversion, but Integer.valueOf handles it
        // The `charval > 0xFFFF` check is for compatibility.
        // The actual `Integer.valueOf` will succeed for this.
        // The code checks `charval != -1 || charval > 0xFFFF`.
        // If `charval` is `128522`, `charval > 0xFFFF` is true.
        // The code then appends `m.group(0)` because `charval != -1` is true.
        // So, it should append the original string.
        assertEquals("Invalid: &#999999;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeInvalidHexEntity() {
        String input = "Invalid: &#xGGGG;"; // Invalid hex characters
        assertEquals("Invalid: &#xGGGG;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeUnknownNamedEntity() {
        String input = "Unknown: &foobar;";
        assertEquals("Unknown: &foobar;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeEntityAtStart() {
        String input = "&lt;tag";
        assertEquals("<tag", Entities.unescape(input));
    }

    @Test
    public void testUnescapeEntityAtEnd() {
        String input = "tag&gt;";
        assertEquals("tag>", Entities.unescape(input));
    }

    @Test
    public void testUnescapeEntityWithTrailingSpace() {
        // The pattern `&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+);?` includes an optional semicolon.
        // Trailing spaces after the entity (even if it has a semicolon) are not part of the match.
        String input = "&amp; "; // Space after entity
        assertEquals("& ", Entities.unescape(input));
    }

    @Test
    public void testUnescapeMultipleConsecutiveEntities() {
        String input = "&lt;&lt;tag&gt;&gt;";
        assertEquals("<<tag>>", Entities.unescape(input));
    }

    @Test
    public void testUnescapeEntityWithOnlyNumber() {
        String input = "&#38"; // No semicolon, but number is valid
        // The pattern `(&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+);?)` matches an optional semicolon.
        // So "&#38" should be treated as "&#38;".
        assertEquals("&", Entities.unescape(input));
    }

    @Test
    public void testUnescapeEntityWithOnlyHexNumber() {
        String input = "&#x26"; // No semicolon, but hex number is valid
        assertEquals("&", Entities.unescape(input));
    }

    @Test
    public void testUnescapeLargeCharacterValue() {
        // Test a character that requires surrogate pairs in Java strings, but the code casts to char.
        // The `charval > 0xFFFF` check is intended to handle this.
        // If charval is > 0xFFFF, the code currently appends the original matched string `m.group(0)`.
        // This is correct behavior for values outside the BMP, as `(char)charval` would be incorrect.
        String input = "&#128522;"; // 😊 character (U+1F60A)
        assertEquals("&#128522;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeNullInput() {
        // assertThrows is not available without JUnit 5. Use try-catch.
        try {
            Entities.unescape(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }


    @Test
    public void testUnescapeEmptyString() {
        String input = "";
        assertEquals("", Entities.unescape(input));
    }




    @Test
    public void testUnescapeWithAmpersandNotFollowedByValidEntity() {
        String input = "Hello & world"; // Space after &
        assertEquals("Hello & world", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandFollowedByNonAlphanumeric() {
        String input = "Hello &*world;";
        assertEquals("Hello &*world;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithOnlyAmpersand() {
        String input = "&";
        assertEquals("&", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandAndSemicolonOnly() {
        String input = "&;";
        assertEquals("&;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandHexAndSemicolonOnly() {
        String input = "&#x;";
        assertEquals("&#x;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandNumericAndSemicolonOnly() {
        String input = "&#;";
        assertEquals("&#;", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandAndNumberThatIsZero() {
        String input = "&#0;";
        // Unicode code point 0 is the null character, which should be unescaped to an empty string or a null character.
        // The current implementation `Character.toString((char) charval)` for `charval = 0` results in `\u0000`.
        // If `appendReplacement` is used on `StringBuffer`, it should correctly insert the null character.
        // However, the prompt asks for `assertEquals` on the result.
        // Let's check the behavior: `Character.toString((char)0)` is `"\u0000"`.
        // `StringBuffer.appendReplacement(accum, Matcher.quoteReplacement(c))` will append this.
        // So the result should be a string containing a null character.
        // `assertEquals("", Entities.unescape(input));` might be incorrect if it produces `\u0000`.
        // For a plain string comparison, `\u0000` is not an empty string.
        // Let's check the common behavior for `&#0;`. Some parsers might ignore it or treat it as an empty string.
        // The prompt asked to derive from reference source. The reference source shows `String c = Character.toString((char) charval);`.
        // `Character.toString((char)0)` is indeed the null character `\u0000`.
        // Thus, the expected value should be `"\u0000"`.
        assertEquals("\u0000", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandHexNumberThatIsZero() {
        String input = "&#x0;";
        assertEquals("\u0000", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandLtSemicolon() {
        String input = "&lt;";
        assertEquals("<", Entities.unescape(input));
    }

    @Test
    public void testUnescapeWithAmpersandGtSemicolon() {
        String input = "&gt;";
        assertEquals(">", Entities.unescape(input));
    }

    // Helper method for Document.OutputSettings that was missing
}



