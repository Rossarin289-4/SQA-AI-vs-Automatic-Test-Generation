package org.jfree.chart.imagemap.junit;

import junit.framework.TestCase;
import org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator;

public class Chart10GeminiTest extends TestCase {

    public Chart10GeminiTest(String name) {
        super(name);
    }

    public void testGenerateToolTipFragmentEscaping() {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("Series & \"Title\"");
        
        assertEquals(" title=\"Series &amp; &quot;Title&quot;\" alt=\"\"", result);
    }
}
