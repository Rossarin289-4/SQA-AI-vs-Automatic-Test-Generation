```java
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EntitiesTest {
    @Test
    public void testEntityMapNameAndValue() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("name", 42);
        assertEquals("name", entities.entityName(42));
        assertEquals(42, entities.entityValue("name"));
    }

    @Test
    public void testEntityMapMissingEntries() throws Exception {
        Entities entities = new Entities();
        assertNull(entities.entityName(42));
        assertEquals(-1, entities.entityValue("missing"));
    }

    @Test
    public void testAddEntitiesArray() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(new String[][] {{"first", "10"}, {"second", "20"}});
        assertEquals("first", entities.entityName(10));
        assertEquals(20, entities.entityValue("second"));
    }

    @Test
    public void testXmlStandardEntities() throws Exception {
        assertEquals("amp", Entities.XML.entityName('&'));
        assertEquals(39, Entities.XML.entityValue("apos"));
        assertNull(Entities.XML.entityName(160));
    }

    @Test
    public void testHtml32AndHtml40EntitySets() throws Exception {
        assertEquals("nbsp", Entities.HTML32.entityName(160));
        assertEquals(-1, Entities.HTML32.entityValue("euro"));
        assertEquals(8364, Entities.HTML40.entityValue("euro"));
    }

    @Test
    public void testEscapeNamedAndPlainCharacters() throws Exception {
        assertEquals("&amp;&lt;A", Entities.HTML32.escape("&<A"));
    }

    @Test
    public void testEscapeUnmappedNonAsciiCharacter() throws Exception {
        assertEquals("&#256;", new Entities().escape("\u0100"));
    }

    @Test
    public void testEscapeHighLatinEntity() throws Exception {
        assertEquals("&nbsp;", Entities.HTML32.escape("\u00A0"));
    }

    @Test
    public void testEscapeWriterMatchesStringEscape() throws Exception {
        StringWriter writer = new StringWriter();
        Entities.HTML32.escape(writer, "&\u00A0");
        assertEquals("&amp;&nbsp;", writer.toString());
    }

    @Test
    public void testUnescapeNamedAndNumericEntities() throws Exception {
        assertEquals("&A", Entities.HTML32.unescape("&amp;&#65;"));
    }

    @Test
    public void testUnescapeDecimalAndHexadecimalForms() throws Exception {
        assertEquals("AA", Entities.XML.unescape("&#65;&#x41;"));
        assertEquals("A", Entities.XML.unescape("&#X41;"));
    }

    @Test
    public void testUnescapeMaximumCharacterValue() throws Exception {
        assertEquals("\uFFFF", Entities.XML.unescape("&#65535;"));
        assertEquals("\uFFFF", Entities.XML.unescape("&#xFFFF;"));
    }

    @Test
    public void testUnescapeTooLargeAndInvalidNumericEntities() throws Exception {
        assertEquals("&#65536;", Entities.XML.unescape("&#65536;"));
        assertEquals("&#x10000;", Entities.XML.unescape("&#x10000;"));
        assertEquals("&#x;", Entities.XML.unescape("&#x;"));
    }

    @Test
    public void testUnescapeUnknownAndEmptyEntities() throws Exception {
        assertEquals("&unknown;&;", Entities.XML.unescape("&unknown;&;"));
    }

    @Test
    public void testUnescapeWithoutAmpersandReturnsSameString() throws Exception {
        String input = "plain";
        assertSame(input, Entities.XML.unescape(input));
    }

    @Test
    public void testUnescapeNestedAmpersandPreservesText() throws Exception {
        assertEquals("&bad&name;", Entities.XML.unescape("&bad&name;"));
    }

    @Test
    public void testUnescapeWriterOutput() throws Exception {
        StringWriter writer = new StringWriter();
        Entities.XML.unescape(writer, "&amp;&#65;");
        assertEquals("&A", writer.toString());
    }

    @Test
    public void testUnescapeWriterPreservesInvalidReference() throws Exception {
        StringWriter writer = new StringWriter();
        Entities.XML.unescape(writer, "x&nope;");
        assertEquals("x&nope;", writer.toString());
    }

    @Test
    public void testUnescapeIncompleteReference() throws Exception {
        assertEquals("x&name", Entities.XML.unescape("x&name"));
    }

    @Test
    public void testDuplicateValueUsesMostRecentlyAddedName() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("old", 65);
        entities.addEntity("new", 65);
        assertEquals("new", entities.entityName(65));
        assertEquals(65, entities.entityValue("old"));
    }
}
```