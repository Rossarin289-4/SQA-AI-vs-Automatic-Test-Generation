package org.jfree.chart.imagemap.junit;
import junit.framework.TestCase;
import org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator;
public class Chart10GeneratedTest extends TestCase {
    public void testTooltipEscapesHtmlQuotes() {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        assertEquals(" title=\"Series [&quot;A&quot;], 100.0\" alt=\"\"",
                generator.generateToolTipFragment("Series [\"A\"], 100.0"));
    }
}
