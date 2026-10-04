package org.jfree.chart.imagemap;

import org.junit.Test;
import static org.junit.Assert.*;

public class StandardToolTipTagFragmentGeneratorTest {
    @Test
    public void testNullTooltip() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        try {
            generator.generateToolTipFragment(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testEmptyTooltip() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"\" alt=\"\"",
                generator.generateToolTipFragment(""));
    }

    @Test
    public void testPlainTooltip() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"hello\" alt=\"\"",
                generator.generateToolTipFragment("hello"));
    }

    @Test
    public void testAmpersandEscaping() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"A&amp;B\" alt=\"\"",
                generator.generateToolTipFragment("A&B"));
    }

    @Test
    public void testLessThanEscaping() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"&lt;\" alt=\"\"",
                generator.generateToolTipFragment("<"));
    }

    @Test
    public void testGreaterThanEscaping() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"&gt;\" alt=\"\"",
                generator.generateToolTipFragment(">"));
    }

    @Test
    public void testDoubleQuoteEscaping() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"&quot;\" alt=\"\"",
                generator.generateToolTipFragment("\""));
    }

    @Test
    public void testApostropheEscaping() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"&#39;\" alt=\"\"",
                generator.generateToolTipFragment("'"));
    }

    @Test
    public void testEscapesMultipleSpecialCharacters() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"&lt;&amp;&gt;\" alt=\"\"",
                generator.generateToolTipFragment("<&>"));
    }

    @Test
    public void testEscapesSpecialCharacterWithinText() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"left &amp; right\" alt=\"\"",
                generator.generateToolTipFragment("left & right"));
    }

    @Test
    public void testPreservesLineBreak() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"a\nb\" alt=\"\"",
                generator.generateToolTipFragment("a\nb"));
    }

    @Test
    public void testPreservesUnicodeCharacter() throws Exception {
        StandardToolTipTagFragmentGenerator generator =
                new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"café\" alt=\"\"",
                generator.generateToolTipFragment("café"));
    }
}
