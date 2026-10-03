package org.jfree.chart.imagemap;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StandardToolTipTagFragmentGeneratorAI10Test {

    @Test
    public void testGenerateToolTipFragment() {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("Tooltip");
        assertEquals(" title=\"Tooltip\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragmentWithSpecialCharacters() {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("A & B");
        assertEquals(" title=\"A &amp; B\" alt=\"\"", result);
    }

}
