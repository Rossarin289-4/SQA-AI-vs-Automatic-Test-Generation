package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class NumericEntityUnescaperCustomTest {

    @Test
    public void testSupplementaryDecimalEntity() throws Exception {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        
        // &#128512; corresponds to code point 0x1F600 (Grinning Face emoji)
        String input = "&#128512;";
        int consumed = unescaper.translate(input, 0, writer);
        
        assertEquals("Should consume the entire entity string", input.length(), consumed);
        
        String expected = new String(Character.toChars(128512));
        assertEquals("Should correctly translate supplementary character via surrogate pair", expected, writer.toString());
    }

    @Test
    public void testSupplementaryHexEntity() throws Exception {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        
        // &#x1F600; corresponds to hex 1F600 (Grinning Face emoji)
        String input = "&#x1F600;";
        int consumed = unescaper.translate(input, 0, writer);
        
        assertEquals("Should consume the entire hex entity string", input.length(), consumed);
        
        String expected = new String(Character.toChars(0x1F600));
        assertEquals("Should correctly translate hex supplementary character via surrogate pair", expected, writer.toString());
    }

    @Test
    public void testBoundaryCodePointBeyondBMP() throws Exception {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        StringWriter writer = new StringWriter();
        
        // &#65536; is 0x10000, the very first code point outside BMP
        String input = "&#65536;";
        int consumed = unescaper.translate(input, 0, writer);
        
        assertEquals("Should consume entity", input.length(), consumed);
        
        String expected = new String(Character.toChars(65536));
        assertEquals("Should correctly translate code point 65536", expected, writer.toString());
    }
}
