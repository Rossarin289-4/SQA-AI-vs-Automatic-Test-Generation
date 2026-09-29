package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import junit.framework.TestCase;
import org.jfree.chart.plot.ValueMarker;

public class Chart20GeminiTest extends TestCase {

    public Chart20GeminiTest(String name) {
        super(name);
    }

    public void testValueMarkerConstructorOutline() {
        Paint paint = Color.red;
        Stroke stroke = new BasicStroke(1.0f);
        Paint outlinePaint = Color.blue;
        Stroke outlineStroke = new BasicStroke(2.0f);

        ValueMarker marker = new ValueMarker(1.0, paint, stroke, outlinePaint, outlineStroke, 0.5f);

        assertEquals(outlinePaint, marker.getOutlinePaint());
        assertEquals(outlineStroke, marker.getOutlineStroke());
    }
}
