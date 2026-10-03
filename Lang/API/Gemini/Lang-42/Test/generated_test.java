package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

public class Lang42IndependentTest {

    @Test
    public void testEscapeSupplementaryUnicodeCharacter() {
        // A supplementary character represented as a surrogate pair in Java (e.g., U+1D300 or similar)
        // \ud834\udf00 represents U+1D300 (Tetragram for Centre)
        String input = "\ud834\udf00";
        String escaped = StringEscapeUtils.escapeHtml(input);
        
        // In the fixed version, this is treated as a single code point (119552) and escaped as &#119552;
        // In the buggy version, it splits into two separate entities: &#55348;&#57600;
        assertEquals("&#119552;", escaped);
    }

    @Test
    public void testEscapeHighBmpCharacterBoundary() {
        // Character just below surrogate range / high BMP
        String input = "\uFFFF";
        String escaped = StringEscapeUtils.escapeHtml(input);
        assertEquals("&#65535;", escaped);
    }

    @Test
    public void testEscapeMixedSupplementaryAndAscii() {
        // Mixing ASCII and a supplementary character to test index shifting
        String input = "A\ud834\udf00B";
        String escaped = StringEscapeUtils.escapeHtml(input);
        assertEquals("A&#119552;B", escaped);
    }
}
