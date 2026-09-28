package org.jfree.chart.imagemap.junit;

import junit.framework.TestCase;
import org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator;

public class Chart10ChatGPTTest extends TestCase {
    public void testTooltipTextIsHtmlEscaped() {
        StandardToolTipTagFragmentGenerator g = new StandardToolTipTagFragmentGenerator();
        String s = g.generateToolTipFragment("A & \"B\"");
        assertFalse(s.indexOf("A & \"B\"") >= 0);
        assertTrue(s.indexOf("&amp;") >= 0);
    }
}
