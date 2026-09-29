package org.jfree.chart.block.junit;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.ui.RectangleEdge;
public class Chart13GeneratedTest extends TestCase {
    public void testSizingWithTooSmallWidthDoesNotCreateInvalidRange() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        container.add(new EmptyBlock(20.0, 10.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(20.0, 10.0), RectangleEdge.RIGHT);
        BufferedImage image = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();
        try { container.arrange(graphics, new RectangleConstraint(10.0, 10.0)); }
        finally { graphics.dispose(); }
    }
}
