package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import junit.framework.TestCase;
import org.jfree.chart.plot.ValueMarker;

public class Chart20ChatGPTTest extends TestCase {
    public void testConstructorKeepsOutlineArguments() {
        BasicStroke s1 = new BasicStroke(1.0f); BasicStroke s2 = new BasicStroke(2.0f);
        ValueMarker m = new ValueMarker(1.0, Color.RED, s1, Color.BLUE, s2, 0.5f);
        assertEquals(Color.BLUE, m.getOutlinePaint());
        assertEquals(s2, m.getOutlineStroke());
    }
}
