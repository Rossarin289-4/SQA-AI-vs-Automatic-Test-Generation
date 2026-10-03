package org.jfree.chart.block.junit;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import junit.framework.TestCase;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.block.RectangleEdge;

public class Chart13GeminiTest extends TestCase {

    public Chart13GeminiTest(String name) {
        super(name);
    }

    public void testArrangeRightBlockWidthUnderflow() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        // Add left block with width 100
        container.add(new EmptyBlock(100.0, 50.0), RectangleEdge.LEFT);
        // Add right block
        container.add(new EmptyBlock(10.0, 50.0), RectangleEdge.RIGHT);

        Graphics2D g2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).createGraphics();
        
        // Constraint width is 50, which is smaller than left block width (100)
        RectangleConstraint constraint = new RectangleConstraint(
            50.0, new org.jfree.data.Range(0.0, 50.0), LengthConstraintType.RANGE,
            50.0, new org.jfree.data.Range(0.0, 50.0), LengthConstraintType.RANGE
        );

        try {
            container.arrange(g2, constraint);
        } catch (IllegalArgumentException e) {
            fail("arrange() threw IllegalArgumentException due to negative Range width");
        }
    }
}
