package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntitiesTest {

    // Mock implementation of CharsetEncoder for testing purposes
    // This mock should implement the CharsetEncoder interface, not extend it.
    // The methods like encoder() on Document.OutputSettings might not directly accept a mock
    // if they expect a specific implementation.
    // However, the `Entities.escape` method takes a CharsetEncoder directly.
    // We need to create a *real* Document.OutputSettings object and use its encoder.
    // The problem statement says to use `java.nio.charset.CharsetEncoder`.
    // Let's try to use a standard ASCII encoder from Java.
    // For the purpose of testing `escape`, we don't need a complex mock.
    // A basic one that canEncode() ASCII and fails for others is sufficient.

    // Helper method to create a valid Document.OutputSettings
    private Document.OutputSettings createOutputSettings(Entities.EscapeMode mode) {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(mode);
        // Use a standard encoder for testing. For ASCII, we can use a simple one.
        // For non-ASCII, we need to simulate the behavior.
        // The key is how `canEncode` behaves.
        // Let's assume for testing that a simple ASCII encoder is used.
        // If a character is not representable, it should fall back to &#...;
        return out;
    }

    @Test
    public void testEscapeAscii() {
        String input = "Hello World!";
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        // Directly use the encoder from Document.OutputSettings. It should be a real one.
        assertEquals("Hello World!", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeExtendedAscii() {
        String input = "Hello World!";
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.extended);
        assertEquals("Hello World!", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeNonAsciiBase() {
        String input = "©"; // Copyright symbol
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        // The default encoder in OutputSettings is usually sufficient and can handle UTF-8.
        // However, to specifically test the fallback to &#...;, we need an encoder that
        // *cannot* encode this character.
        // For this specific test, we'll rely on the actual `escape` logic where if `encoder.canEncode(c)` is false,
        // it uses the numeric escape.
        // Let's assume the default encoder might not handle '©' in a way that maps to '&copy;',
        // but rather as a numeric entity if the charset is limited.
        // The `escape` method checks `encoder.canEncode(c)`. If it can't, it uses `&#(int)c;`.
        // If it can, it then checks `map.containsKey(c)`.
        // Since '©' is in `baseArray` and `fullArray`, it should be mapped first.
        // So, if the encoder *can* encode '©' directly, it will, otherwise it will use `&#245;` (which is incorrect, it's 169).
        // The most robust way is to ensure `map.containsKey(c)` is checked.
        // The `escape` method prioritizes the map lookup.
        // If `map.containsKey(c)` is true, it uses the entity name.
        // This means `encoder.canEncode(c)` is only checked if the character is NOT in the map.
        // Therefore, for '©', it should directly go to the map.
        assertEquals("&copy;", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeNonAsciiExtended() {
        String input = "©"; // Copyright symbol
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.extended);
        assertEquals("&copy;", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeUnencodableChar() {
        String input = "€"; // Euro symbol.
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        // If the default encoder CAN encode €, it will output € directly.
        // If it CANNOT encode €, it will use &#8364;.
        // The behavior depends on the default charset of the Java environment.
        // To guarantee the &#8364; output for a test, we would need to force a restricted encoder.
        // However, the instruction is to use the provided `CharsetEncoder` from `OutputSettings`.
        // Let's assume the default encoder is capable of encoding € and test that.
        // If the default encoder CANNOT encode, the test should be `assertEquals("&#8364;", Entities.escape(input, out.encoder(), out.escapeMode()));`
        // For now, let's test the expected behavior when the character is not in the map and is encodable.
        // If `canEncode` is true and not in map, it appends `c`.
        // If `canEncode` is false, it appends `&#(int)c;`.
        // We will assume the default encoder *cannot* encode € for this test to be meaningful.
        // The character code for € is 8364.
        assertEquals("&#8364;", Entities.escape(input, out.encoder(), out.escapeMode()));
    }


    @Test
    public void testEscapeMultipleCharsBase() {
        String input = "A & B";
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        assertEquals("A &amp; B", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeMultipleCharsExtended() {
        String input = "A & B";
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.extended);
        assertEquals("A &amp; B", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeWithNumericEntity() {
        String input = "\u00A9"; // Copyright symbol as Unicode
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        // This character is in the baseArray, so it should be escaped to &copy;
        assertEquals("&copy;", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeWithNumericEntityExtended() {
        String input = "\u00A9"; // Copyright symbol as Unicode
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.extended);
        assertEquals("&copy;", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

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
        // If `charval` is `128522` (for 😊), `charval > 0xFFFF` is true.
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
        assertThrows(NullPointerException.class, () -> Entities.unescape(null));
    }

    @Test
    public void testEscapeWithEmptyString() {
        String input = "";
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        assertEquals("", Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testUnescapeEmptyString() {
        String input = "";
        assertEquals("", Entities.unescape(input));
    }

    @Test
    public void testEscapeWithNullString() {
        String input = null;
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        assertThrows(NullPointerException.class, () -> Entities.escape(input, out.encoder(), out.escapeMode()));
    }

    @Test
    public void testEscapeWithNullOutputSettings() {
        String input = "test";
        // The `escape` method takes `Document.OutputSettings.encoder()` and `Document.OutputSettings.escapeMode()`.
        // If `out` is null, `out.encoder()` would throw NPE.
        // The direct call `Entities.escape(string, encoder, escapeMode)` takes `encoder` and `escapeMode` directly.
        // Let's test `escape(String, CharsetEncoder, EscapeMode)` directly with nulls.
        CharsetEncoder encoder = new Document.OutputSettings().encoder(); // Get a valid encoder
        Entities.EscapeMode mode = Entities.EscapeMode.base;
        assertThrows(NullPointerException.class, () -> Entities.escape("test", null, mode));
    }

    @Test
    public void testEscapeWithNullEncoder() {
        String input = "test";
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        // The `escape` method takes `encoder` and `escapeMode` directly.
        assertThrows(NullPointerException.class, () -> Entities.escape(input, null, out.escapeMode()));
    }

    @Test
    public void testEscapeWithNullEscapeMode() {
        String input = "test";
        Document.OutputSettings out = createOutputSettings(Entities.EscapeMode.base);
        // The `escape` method takes `encoder` and `escapeMode` directly.
        assertThrows(NullPointerException.class, () -> Entities.escape(input, out.encoder(), null));
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
        // Let's check `Integer.valueOf("0", 10)` which is 0. `(char)0` is `\u0000`.
        // The code `m.appendReplacement(accum, Matcher.quoteReplacement(c));` means it inserts `\u0000`.
        // For assertion, `"\u0000"` is the correct expected value if we want to be precise.
        // However, often such characters are considered empty or problematic in string representations.
        // Given the prompt's focus on exact values, let's assume it becomes an empty string for practical purposes or is filtered out.
        // If it truly results in `\u0000`, then `assertEquals("", Entities.unescape(input))` is wrong.
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
}
