package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.io.IOException;

import org.junit.Test;

public class EntitiesLang62Test {

    @Test
    public void testUnescapeKeepsDecimalValueJustAboveCharMaximum() {
        Entities entities = new Entities();

        String input = "start&#65536;end";

        assertEquals("start&#65536;end", entities.unescape(input));
    }

    @Test
    public void testUnescapeKeepsHexValueJustAboveCharMaximum() {
        Entities entities = new Entities();

        String input = "left&#x10000;right";

        assertEquals("left&#x10000;right", entities.unescape(input));
    }

    @Test
    public void testUnescapeKeepsLargerDecimalValue() {
        Entities entities = new Entities();

        String input = "A&#70000;B";

        assertEquals("A&#70000;B", entities.unescape(input));
    }

    @Test
    public void testUnescapeAcceptsMaximumCharValue() {
        Entities entities = new Entities();

        String input = "X&#65535;Y";

        assertEquals("X\uFFFFY", entities.unescape(input));
    }

    @Test
    public void testUnescapeWriterKeepsHexValueAboveCharMaximum()
            throws IOException {
        Entities entities = new Entities();
        StringWriter writer = new StringWriter();

        String input = "before&#x10001;after";

        entities.unescape(writer, input);

        assertEquals("before&#x10001;after", writer.toString());
    }
}
