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
    public void testEntityLookupForAddedEntry() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("foo", 161);
        assertEquals("foo", entities.entityName(161));
        assertEquals(161, entities.entityValue("foo"));
    }

    @Test
    public void testMissingEntityLookup() throws Exception {
        Entities entities = new Entities();
        assertNull(entities.entityName(999));
        assertEquals(-1, entities.entityValue("missing"));
    }

    @Test
    public void testAddEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(new String[][] {{"one", "1"}, {"two", "2"}});
        assertEquals("one", entities.entityName(1));
        assertEquals(2, entities.entityValue("two"));
    }

    @Test
    public void testEntityValueAtZero() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("zero", 0);
        assertEquals("zero", entities.entityName(0));
        assertEquals(0, entities.entityValue("zero"));
    }

    @Test
    public void testEntityAtLookupTableUpperBoundary() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("edge", 255);
        assertEquals("edge", entities.entityName(255));
    }

    @Test
    public void testEntityAboveLookupTableBoundary() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("edge", 256);
        assertEquals("edge", entities.entityName(256));
    }

    @Test
    public void testEscapeNamedAndUnmappedCharacters() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("foo", 161);
        assertEquals("A&foo;!", entities.escape("A\u00A1!"));
    }

    @Test
    public void testEscapeBuiltInAsciiEntities() throws Exception {
        assertEquals("&lt;&amp;&gt;&quot;", Entities.XML.escape("<&>\""));
    }

    @Test
    public void testEscapeUnmappedAsciiRemainsLiteral() throws Exception {
        assertEquals("plain 7", Entities.XML.escape("plain 7"));
    }

    @Test
    public void testEscapeUnmappedNonAsciiAsDecimalReference() throws Exception {
        assertEquals("&#256;", Entities.XML.escape("\u0100"));
    }

    @Test
    public void testEscapeSupplementaryCharacterAsOneReference() throws Exception {
        assertEquals("&#128512;", Entities.XML.escape("\uD83D\uDE00"));
    }

    @Test
    public void testUnescapeNamedAndNumericEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("foo", 161);
        assertEquals("\u00A1A", entities.unescape("&foo;&#65;"));
    }

    @Test
    public void testUnescapeHexadecimalNumericEntity() throws Exception {
        assertEquals("\u00A1", Entities.XML.unescape("&#xA1;"));
    }

    @Test
    public void testUnescapeUppercaseHexPrefix() throws Exception {
        assertEquals("\u00A1", Entities.XML.unescape("&#XA1;"));
    }

    @Test
    public void testUnescapeUnknownEntityPreserved() throws Exception {
        assertEquals("&unknown;", Entities.XML.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeMissingSemicolonPreserved() throws Exception {
        assertEquals("&amp", Entities.XML.unescape("&amp"));
    }

    @Test
    public void testUnescapeNestedAmpersandBeforeSemicolon() throws Exception {
        assertEquals("&a&b;", Entities.XML.unescape("&a&b;"));
    }

    @Test
    public void testUnescapeDecimalMaximumBmpValue() throws Exception {
        assertEquals("\uFFFF", Entities.XML.unescape("&#65535;"));
    }

    @Test
    public void testUnescapeDecimalValueAboveBmpPreserved() throws Exception {
        assertEquals("&#65536;", Entities.XML.unescape("&#65536;"));
    }

    @Test
    public void testUnescapeIntegerOverflowPreserved() throws Exception {
        assertEquals("&#2147483648;", Entities.XML.unescape("&#2147483648;"));
    }

    @Test
    public void testUnescapeNegativeNumericReferencePreserved() throws Exception {
        assertEquals("&#-1;", Entities.XML.unescape("&#-1;"));
    }

    @Test
    public void testUnescapeWithoutAmpersandReturnsInput() throws Exception {
        String input = "plain";
        assertSame(input, Entities.XML.unescape(input));
    }
}
