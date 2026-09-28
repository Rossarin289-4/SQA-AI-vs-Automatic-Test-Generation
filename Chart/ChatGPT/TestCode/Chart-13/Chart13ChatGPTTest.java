package org.jfree.chart.block.junit;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.block.*;
import org.jfree.data.Range;

public class Chart13ChatGPTTest extends TestCase {
    public void testArrangeDoesNotCreateNegativeWidthRange() {
        BorderArrangement a = new BorderArrangement();
        BlockContainer c = new BlockContainer(a);
        c.add(new EmptyBlock(20, 10), RectangleEdge.LEFT);
        c.add(new EmptyBlock(10, 10), RectangleEdge.RIGHT);
        Graphics2D g = new BufferedImage(50,50,BufferedImage.TYPE_INT_ARGB).createGraphics();
        try { c.arrange(g, new RectangleConstraint(new Range(0, 5), new Range(0, 20))); }
        catch (IllegalArgumentException e) { fail("Arrangement should clamp remaining width to zero"); }
        finally { g.dispose(); }
    }
}
