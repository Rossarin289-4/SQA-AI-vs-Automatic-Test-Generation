package org.apache.commons.lang;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lang42EntitiesEscapeTest {

    @Test
    public void testMinimumSupplementaryCodePointIsEscapedAsOneEntity() {
        String input = new String(Character.toChars(0x10000));

        Entities entities = new Entities();

        assertEquals("&#65536;", entities.escape(input));
    }

    @Test
    public void testSupplementaryCodePointInsideTextIsEscapedAsOneEntity() {
        String input = "A" + new String(Character.toChars(0x1F642)) + "B";

        Entities entities = new Entities();

        assertEquals("A&#128578;B", entities.escape(input));
    }

    @Test
    public void testTwoConsecutiveSupplementaryCodePointsRemainTwoCodePoints() {
        String input =
                new String(Character.toChars(0x1F680)) +
                new String(Character.toChars(0x1F4A9));

        Entities entities = new Entities();

        assertEquals("&#128640;&#128169;", entities.escape(input));
    }

    @Test
    public void testMaximumUnicodeCodePointIsEscapedAsOneEntity() {
        String input = new String(Character.toChars(0x10FFFF));

        Entities entities = new Entities();

        assertEquals("&#1114111;", entities.escape(input));
    }

    @Test
    public void testBmpBoundaryCharacterRetainsExistingBehavior() {
        String input = new String(new char[] { '\uFFFF' });

        Entities entities = new Entities();

        assertEquals("&#65535;", entities.escape(input));
    }
}
