package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EntitiesTest {
    @Test
    public void testEscapeBasic() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(new String[][]{{"amp", "38"}});
        assertEquals("&amp;", entities.escape("&"));
    }

    @Test
    public void testEscapeWithNumeric() throws Exception {
        Entities entities = new Entities();
        assertEquals("&#10;", entities.escape("\n"));
    }

    @Test
    public void testEscapeWithNumericHex() throws Exception {
        Entities entities = new Entities();
        assertEquals("&#x20AC;", entities.escape("\u20AC")); // Euro sign
    }

    @Test
    public void testEscapeWithExtendedNumeric() throws Exception {
        Entities entities = new Entities();
        assertEquals("&#338;", entities.escape("\u0152")); // OE ligature
    }
    
    @Test
    public void testEscapeExtendedNumericHex() throws Exception {
        Entities entities = new Entities();
        assertEquals("&#x0152;", entities.escape("\u0152")); // OE ligature
    }

    @Test
    public void testEscapeEmpty() throws Exception {
        Entities entities = new Entities();
        assertEquals("", entities.escape(""));
    }

    @Test
    public void testEscapeWithExistingEntity() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("euro", 8364);
        assertEquals("&euro;", entities.escape("\u20AC"));
    }

    @Test
    public void testEscapeWithMultipleEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(new String[][]{{"amp", "38"}, {"lt", "60"}, {"gt", "62"}});
        assertEquals("&lt;&amp;&gt;", entities.escape("<&>"));
    }

    @Test
    public void testEscapeWithMixedEntitiesAndChars() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(new String[][]{{"quot", "34"}, {"amp", "38"}});
        assertEquals("This is a &quot;quote&quot; &amp; needs escaping.", entities.escape("This is a \"quote\" & needs escaping."));
    }

    @Test
    public void testUnescapeBasic() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("amp", 38);
        assertEquals("&", entities.unescape("&amp;"));
    }

    @Test
    public void testUnescapeWithNumeric() throws Exception {
        Entities entities = new Entities();
        assertEquals("\n", entities.unescape("&#10;"));
    }

    @Test
    public void testUnescapeWithNumericHex() throws Exception {
        Entities entities = new Entities();
        assertEquals("\u20AC", entities.unescape("&#x20AC;")); // Euro sign
    }

    @Test
    public void testUnescapeWithExtendedNumeric() throws Exception {
        Entities entities = new Entities();
        assertEquals("\u0152", entities.unescape("&#338;")); // OE ligature
    }
    
    @Test
    public void testUnescapeExtendedNumericHex() throws Exception {
        Entities entities = new Entities();
        assertEquals("\u0152", entities.unescape("&#x152;")); // OE ligature
    }

    @Test
    public void testUnescapeEmpty() throws Exception {
        Entities entities = new Entities();
        assertEquals("", entities.unescape(""));
    }

    @Test
    public void testUnescapeWithExistingEntity() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("euro", 8364);
        assertEquals("\u20AC", entities.unescape("&euro;"));
    }

    @Test
    public void testUnescapeWithMultipleEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(new String[][]{{"lt", "60"}, {"amp", "38"}, {"gt", "62"}});
        assertEquals("<&>", entities.unescape("&lt;&amp;&gt;"));
    }

    @Test
    public void testUnescapeWithMixedEntitiesAndChars() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("quot", 34);
        entities.addEntity("amp", 38);
        assertEquals("This is a \"quote\" & needs escaping.", entities.unescape("This is a &quot;quote&quot; &amp; needs escaping."));
    }

    @Test
    public void testUnescapeWithInvalidEntity() throws Exception {
        Entities entities = new Entities();
        assertEquals("&invalid;", entities.unescape("&invalid;"));
    }

    @Test
    public void testUnescapeWithNumericInvalid() throws Exception {
        Entities entities = new Entities();
        assertEquals("&#;", entities.unescape("&#;"));
        assertEquals("&#abc;", entities.unescape("&#abc;"));
        assertEquals("&#x;", entities.unescape("&#x;"));
        assertEquals("&#X;", entities.unescape("&#X;"));
    }
    
    @Test
    public void testUnescapeWithNumericTooLarge() throws Exception {
        Entities entities = new Entities();
        // Value greater than 0xFFFF, should remain unescaped
        assertEquals("&#70000;", entities.unescape("&#70000;")); 
        assertEquals("&#xFFFF0;", entities.unescape("&#xFFFF0;"));
    }

    @Test
    public void testUnescapeWithDoubleAmpersand() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("amp", 38);
        assertEquals("&&", entities.unescape("&&amp;&amp;"));
    }
    
    @Test
    public void testUnescapeWriterBasic() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("amp", 38);
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&amp;");
        assertEquals("&", writer.toString());
    }

    @Test
    public void testUnescapeWriterWithNumeric() throws Exception {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#10;");
        assertEquals("\n", writer.toString());
    }

    @Test
    public void testUnescapeWriterWithNumericHex() throws Exception {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&#x20AC;");
        assertEquals("\u20AC", writer.toString());
    }
    
    @Test
    public void testUnescapeWriterWithInvalidEntity() throws Exception {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&invalid;");
        assertEquals("&invalid;", writer.toString());
    }

    @Test
    public void testUnescapeWriterWithDoubleAmpersand() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("amp", 38);
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&&amp;&amp;");
        assertEquals("&&", writer.toString());
    }

    @Test
    public void testUnescapeWriterEmpty() throws Exception {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "");
        assertEquals("", writer.toString());
    }
    
    @Test
    public void testEscapeWriterBasic() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("amp", 38);
        StringWriter writer = new StringWriter();
        entities.escape(writer, "&");
        assertEquals("&amp;", writer.toString());
    }

    @Test
    public void testEscapeWriterWithNumeric() throws Exception {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();
        entities.escape(writer, "\n");
        assertEquals("&#10;", writer.toString());
    }
    
    @Test
    public void testEscapeWriterWithNumericHex() throws Exception {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();
        entities.escape(writer, "\u20AC");
        assertEquals("&#x20AC;", writer.toString());
    }

    @Test
    public void testEscapeWriterEmpty() throws Exception {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();
        entities.escape(writer, "");
        assertEquals("", writer.toString());
    }

    // Tests for methods not covered by previous tests: addEntity, entityName, entityValue

    @Test
    public void testAddEntityAndGetValueAndName() {
        Entities entities = new Entities();
        entities.addEntity("test", 123);
        assertEquals(123, entities.entityValue("test"));
        assertEquals("test", entities.entityName(123));
    }

    @Test
    public void testAddEntityAndGetValueAndName_NonExistent() {
        Entities entities = new Entities();
        assertEquals(-1, entities.entityValue("nonexistent"));
        assertNull(entities.entityName(456));
    }

    @Test
    public void testAddEntityAndGetValueAndName_Overwrite() {
        Entities entities = new Entities();
        entities.addEntity("test", 123);
        assertEquals("test", entities.entityName(123)); // Verify initial mapping
        entities.addEntity("test", 456); // Overwrite
        assertEquals(456, entities.entityValue("test"));
        assertEquals("test", entities.entityName(456));
        assertNull(entities.entityName(123)); // Old value should be gone
    }

    @Test
    public void testAddEntitiesBasic() {
        Entities entities = new Entities();
        String[][] data = {{"lt", "60"}, {"gt", "62"}};
        entities.addEntities(data);
        assertEquals(60, entities.entityValue("lt"));
        assertEquals("lt", entities.entityName(60));
        assertEquals(62, entities.entityValue("gt"));
        assertEquals("gt", entities.entityName(62));
    }

    @Test
    public void testAddEntitiesEmptyArray() {
        Entities entities = new Entities();
        String[][] data = {};
        entities.addEntities(data);
        assertEquals(-1, entities.entityValue("any"));
        assertNull(entities.entityName(100));
    }

    @Test
    public void testAddEntitiesWithNumericValues() {
        Entities entities = new Entities();
        String[][] data = {{"val1", "123"}, {"val2", "456"}};
        entities.addEntities(data);
        assertEquals(123, entities.entityValue("val1"));
        assertEquals("val1", entities.entityName(123));
        assertEquals(456, entities.entityValue("val2"));
        assertEquals("val2", entities.entityName(456));
    }
    
    @Test
    public void testEscapeWithUnicodeChar() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("euro", 8364); // Euro sign
        assertEquals("&euro;", entities.escape("€")); // Using the actual Euro character
    }

    @Test
    public void testUnescapeWithNumericBoundary() throws Exception {
        Entities entities = new Entities();
        // Test the maximum character value that can be represented by a char
        assertEquals("\uFFFF", entities.unescape("&#65535;"));
        assertEquals("\uFFFF", entities.unescape("&#xFFFF;"));
    }

    @Test
    public void testEscapeWithCharOutsideBasicAscii() throws Exception {
        Entities entities = new Entities();
        // Character with code point 128 (e.g., '€' in some encodings, or control characters)
        // If not mapped, it should be escaped as &#128;
        assertEquals("&#128;", entities.escape("\u0080")); 
    }

    @Test
    public void testUnescapeWithNumericValueJustBelowFFFF() throws Exception {
        Entities entities = new Entities();
        assertEquals("\uFFFE", entities.unescape("&#65534;"));
        assertEquals("\uFFFE", entities.unescape("&#xFFFE;"));
    }
}
