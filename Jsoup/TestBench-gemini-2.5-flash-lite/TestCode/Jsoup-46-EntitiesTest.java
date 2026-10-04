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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testIsNamedEntityTrue() {
        assertTrue(Entities.isNamedEntity("amp"));
    }

    @Test
    public void testIsNamedEntityFalse() {
        assertFalse(Entities.isNamedEntity("not-an-entity"));
    }

    @Test
    public void testIsNamedEntityEmpty() {
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsNamedEntityNull() {
        assertFalse(Entities.isNamedEntity(null));
    }

    @Test
    public void testIsBaseNamedEntityTrue() {
        assertTrue(Entities.isBaseNamedEntity("lt"));
    }

    @Test
    public void testIsBaseNamedEntityFalse() {
        // nbsp is in full, not base
        assertFalse(Entities.isBaseNamedEntity("nbsp"));
    }

    @Test
    public void testIsBaseNamedEntityEmpty() {
        assertFalse(Entities.isBaseNamedEntity(""));
    }

    @Test
    public void testIsBaseNamedEntityNull() {
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    @Test
    public void testGetCharacterByNameAmp() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
    }

    @Test
    public void testGetCharacterByNameLt() {
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
    }

    @Test
    public void testGetCharacterByNameGt() {
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
    }

    @Test
    public void testGetCharacterByNameQuot() {
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
    }

    @Test
    public void testGetCharacterByNameNbsp() {
        assertEquals(Character.valueOf((char) 0xA0), Entities.getCharacterByName("nbsp"));
    }

    @Test
    public void testGetCharacterByNameUnknown() {
        assertNull(Entities.getCharacterByName("unknownentity"));
    }

    @Test
    public void testGetCharacterByNameEmpty() {
        assertNull(Entities.getCharacterByName(""));
    }

    @Test
    public void testGetCharacterByNameNull() {
        assertNull(Entities.getCharacterByName(null));
    }

    @Test
    public void testEscapeModeXhtml() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.xhtml);
        // &lt; should be &lt; in xhtml, not <
        assertEquals("&lt;", Entities.escape("<", settings));
    }

    @Test
    public void testEscapeModeBase() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        // &nbsp; should be &nbsp; in base, not 0xA0
        assertEquals("&nbsp;", Entities.escape(String.valueOf((char) 0xA0), settings));
    }

    @Test
    public void testEscapeModeExtended() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.extended);
        // &nbsp; should be &nbsp; in extended, not 0xA0
        assertEquals("&nbsp;", Entities.escape(String.valueOf((char) 0xA0), settings));
    }

    @Test
    public void testEscapeSpecialCharactersBase() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        assertEquals("&amp;&lt;&gt;&quot;", Entities.escape("&<>\"", settings));
    }

    @Test
    public void testEscapeSpecialCharactersXhtml() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.xhtml);
        assertEquals("&amp;&lt;&gt;&quot;", Entities.escape("&<>\"", settings));
    }

    @Test
    public void testEscapeUnencodableChar() {
        // A character that cannot be encoded by UTF-8, forcing fallback to entity
        // For example, a character in a private use area, or a specific control character.
        // Let's assume character 0xFFFF is not directly encodable by default encoder for demonstration.
        // In reality, this depends on the specific CharsetEncoder implementation.
        // We'll use a character that is less likely to be in common encodings if not UTF.
        // Based on the logic, any character not in map and not directly encodable will become a numeric entity.
        char unencodableChar = '\uE000'; // A character in the Private Use Area.

        Document.OutputSettings settings = new Document.OutputSettings();
        // The integer value of \uE000 is 57344.
        // The hex representation is E000.
        assertEquals("&#x" + Integer.toHexString(unencodableChar) + ";", Entities.escape(String.valueOf(unencodableChar), settings));
    }

    @Test
    public void testUnescapeBasic() {
        assertEquals("Hello & World", Entities.unescape("Hello &amp; World"));
    }

    @Test
    public void testUnescapeNoStrict() {
        // Missing semicolon, but strict is false
        assertEquals("Hello < World", Entities.unescape("Hello &lt World", false));
    }

    @Test
    public void testUnescapeStrict() {
        // Missing semicolon, strict is true, so it should not unescape
        assertEquals("Hello &lt", Entities.unescape("Hello &lt", true));
    }

    @Test
    public void testUnescapeMultiple() {
        assertEquals("Quotes \" and '", Entities.unescape("Quotes &quot; and &apos;"));
    }

    @Test
    public void testUnescapeNumericHex() {
        assertEquals("€", Entities.unescape("&#x20AC;"));
    }

    @Test
    public void testUnescapeNumericDecimal() {
        assertEquals("€", Entities.unescape("&#8364;"));
    }

    @Test
    public void testUnescapeWithInvalidNamedEntity() {
        // An invalid named entity should remain as is.
        assertEquals("Invalid &invalid;", Entities.unescape("Invalid &invalid;"));
    }

    @Test
    public void testUnescapeWithNumericHexTruncated() {
        // Malformed hex entity, should remain as is regardless of strict
        assertEquals("&#x", Entities.unescape("&#x", true));
        assertEquals("&#x", Entities.unescape("&#x", false));
    }

    @Test
    public void testUnescapeWithNumericDecimalTruncated() {
        // Malformed decimal entity, should remain as is regardless of strict
        assertEquals("&#", Entities.unescape("&#", true));
        assertEquals("&#", Entities.unescape("&#", false));
    }

    @Test
    public void testUnescapeWithPartialNumeric() {
        assertEquals("Test&#", Entities.unescape("Test&#", false));
        assertEquals("Test&#", Entities.unescape("Test&#", true));
    }

    @Test
    public void testGetMapXhtml() {
        Map<Character, String> map = Entities.EscapeMode.xhtml.getMap();
        assertEquals("quot", map.get((char) 0x0022));
        assertEquals("amp", map.get((char) 0x0026));
        assertEquals("lt", map.get((char) 0x003C));
        assertEquals("gt", map.get((char) 0x003E));
        // nbsp not in xhtml map
        assertNull(map.get((char) 0x00A0));
    }

    @Test
    public void testGetMapBase() {
        Map<Character, String> map = Entities.EscapeMode.base.getMap();
        assertEquals("nbsp", map.get((char) 0x00A0));
        assertEquals("quot", map.get((char) 0x0022));
        assertEquals("amp", map.get((char) 0x0026));
        assertEquals("lt", map.get((char) 0x003C));
        assertEquals("gt", map.get((char) 0x003E));
    }

    @Test
    public void testGetMapExtended() {
        Map<Character, String> map = Entities.EscapeMode.extended.getMap();
        // Check a few from the extended set that are not in base
        assertEquals("copy", map.get((char) 0x00A9)); // Copyright sign
        assertEquals("reg", map.get((char) 0x00AE)); // Registered sign
        assertEquals("trade", map.get((char) 0x2122)); // Trade mark sign
    }

    @Test
    public void testEscapeModeEnumBaseDirect() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.base);
        assertEquals("&nbsp;", Entities.escape(String.valueOf((char) 0xA0), settings));
    }

    @Test
    public void testEscapeModeEnumExtendedDirect() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.extended);
        assertEquals("&nbsp;", Entities.escape(String.valueOf((char) 0xA0), settings));
    }

    @Test
    public void testEscapeModeEnumXhtmlDirect() {
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.escapeMode(Entities.EscapeMode.xhtml);
        assertEquals("&#xa0;", Entities.escape(String.valueOf((char) 0xA0), settings));
    }
}
