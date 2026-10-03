package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringWriter;
import java.io.IOException;

public class EntitiesCustomTest {

    @Test
    public void testUnescapeStringWithOverflowNumericEntity() {
        Entities entities = new Entities();
        // 65536 is 0x10000, which exceeds 0xFFFF (max char value)
        String input = "A&#65536;B";
        String result = entities.unescape(input);
        
        // Fixed version leaves out-of-range entities unescaped ("&#65536;"),
        // whereas the buggy version converts/truncates it into a character.
        assertEquals("A&#65536;B", result);
    }

    @Test
    public void testUnescapeWriterWithOverflowHexNumericEntity() throws IOException {
        Entities entities = new Entities();
        // 0x10000 exceeds 0xFFFF
        String input = "X&#x10000;Y";
        StringWriter writer = new StringWriter();
        entities.unescape(writer, input);
        
        // Fixed version preserves the literal invalid entity string
        assertEquals("X&#x10000;Y", writer.toString());
    }

    @Test
    public void testUnescapeStringValidBoundaryNumericEntity() {
        Entities entities = new Entities();
        // 65535 is 0xFFFF, which is the maximum valid BMP character
        String input = "&#65535;";
        String result = entities.unescape(input);
        
        assertEquals(String.valueOf((char) 65535), result);
    }

    @Test
    public void testUnescapeWriterValidHexBoundaryNumericEntity() throws IOException {
        Entities entities = new Entities();
        // 0xFFFF is the maximum valid BMP character
        String input = "&#xFFFF;";
        StringWriter writer = new StringWriter();
        entities.unescape(writer, input);
        
        assertEquals(String.valueOf((char) 0xFFFF), writer.toString());
    }
}
