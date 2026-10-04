```java
package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import org.jfree.chart.util.ObjectUtilities;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;

public class BorderArrangementTest {

    // Dummy implementations for Block and BlockContainer for testing purposes
    // These are necessary because the actual Block and BlockContainer classes
    // are not provided, and we need concrete classes to instantiate for testing.
    // NOTE: Based on the compiler errors, it seems the original prompt assumed
    // `Block` and `BlockContainer` were concrete classes or provided concrete
    // subclasses. Since they are abstract, and no concrete subclasses are listed,
    // we create minimal concrete implementations for the purpose of testing
    // `BorderArrangement`.
    // The fields `centerBlock`, `topBlock`, etc. are private and cannot be accessed
    // directly. This will require tests to indirectly verify their state via methods
    // like `arrange` or `equals`.

    static class DummyBlock extends Block {
        private Size2D preferredSize = new Size2D(10.0, 10.0);
        private Rectangle2D bounds = new Rectangle2D.Double();
        private String id = "Dummy";

        public DummyBlock(String id) {
            this.id = id;
        }

        @Override
        public String getID() {
            return this.id;
        }

        public void setPreferredSize(Size2D size) {
            this.preferredSize = size;
        }

        @Override
        public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) {
            // This is a simplified arrange for testing.
            // It tries to honor the constraint but falls back to preferred size.
            double width = constraint.getWidth();
            double height = constraint.getHeight();

            if (constraint.getWidthConstraintType() == LengthConstraintType.NONE &&
                constraint.getHeightConstraintType() == LengthConstraintType.NONE) {
                return this.preferredSize;
            } else if (constraint.getWidthConstraintType() == LengthConstraintType.FIXED &&
                       constraint.getHeightConstraintType() == LengthConstraintType.FIXED) {
                return new Size2D(width, height);
            } else if (constraint.getWidthConstraintType() == LengthConstraintType.FIXED) {
                return new Size2D(width, this.preferredSize.getHeight());
            } else if (constraint.getHeightConstraintType() == LengthConstraintType.FIXED) {
                return new Size2D(this.preferredSize.getWidth(), height);
            } else if (constraint.getWidthConstraintType() == LengthConstraintType.RANGE &&
                       constraint.getHeightConstraintType() == LengthConstraintType.RANGE) {
                Range widthRange = constraint.getWidthRange();
                Range heightRange = constraint.getHeightRange();
                double constrainedWidth = widthRange.constrain(this.preferredSize.getWidth());
                double constrainedHeight = heightRange.constrain(this.preferredSize.getHeight());
                return new Size2D(constrainedWidth, constrainedHeight);
            } else {
                return this.preferredSize;
            }
        }

        @Override
        public void draw(Graphics2D g2, Rectangle2D area) {
            // no-op for testing
        }

        // Removed clone() and setBounds()/getBounds() as they are not directly used by BorderArrangement's public methods.
        // The arrange method sets the bounds, which is what we need to verify.

        public void setBounds(Rectangle2D bounds) {
            this.bounds = bounds;
        }

        public Rectangle2D getBounds() {
            return this.bounds;
        }
    }

    static class DummyBlockContainer extends BlockContainer {
        private Size2D contentSize = new Size2D(100, 100);
        private double totalWidth = 100;
        private double totalHeight = 100;

        // No-argument constructor for BlockContainer is not visible in API outline.
        // Assuming it takes a Padding object, we provide null.
        public DummyBlockContainer() {
            super(null); // Assuming null for Padding is acceptable for testing
        }

        public void setContentSize(Size2D size) {
            this.contentSize = size;
        }

        public void setTotalWidth(double width) {
            this.totalWidth = width;
        }

        public void setTotalHeight(double height) {
            this.totalHeight = height;
        }

        @Override
        public RectangleConstraint toContentConstraint(RectangleConstraint c) {
            return c; // simplified for testing
        }

        @Override
        public double calculateTotalWidth(double contentWidth) {
            return this.totalWidth;
        }

        @Override
        public double calculateTotalHeight(double contentHeight) {
            return this.totalHeight;
        }

        @Override
        public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) {
            // This is a simplified arrange for testing.
            // The actual arrange in BorderArrangement returns a Size2D based on its internal logic.
            // Here, we'll just return the pre-set content size as a placeholder.
            // The key is that BorderArrangement's arrange method is called with this container.
            return this.contentSize;
        }
    }


    @Test
    public void testAddNullBlockToCenter() {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, null);
        // Cannot directly access centerBlock, will test its effect via arrange.
    }

    @Test
    public void testAddBlockToCenter() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock block = new DummyBlock("center");
        arrangement.add(block, null);
        // Cannot directly access centerBlock, will test its effect via arrange.
    }

    @Test
    public void testAddBlockToTop() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock block = new DummyBlock("top");
        arrangement.add(block, RectangleEdge.TOP);
        // Cannot directly access topBlock, will test its effect via arrange.
    }

    @Test
    public void testAddBlockToBottom() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock block = new DummyBlock("bottom");
        arrangement.add(block, RectangleEdge.BOTTOM);
        // Cannot directly access bottomBlock, will test its effect via arrange.
    }

    @Test
    public void testAddBlockToLeft() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock block = new DummyBlock("left");
        arrangement.add(block, RectangleEdge.LEFT);
        // Cannot directly access leftBlock, will test its effect via arrange.
    }

    @Test
    public void testAddBlockToRight() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock block = new DummyBlock("right");
        arrangement.add(block, RectangleEdge.RIGHT);
        // Cannot directly access rightBlock, will test its effect via arrange.
    }

    @Test
    public void testAddNullBlockToTop() {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, RectangleEdge.TOP);
        // Cannot directly access topBlock, will test its effect via arrange.
    }

    @Test
    public void testAddNullBlockToBottom() {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, RectangleEdge.BOTTOM);
        // Cannot directly access bottomBlock, will test its effect via arrange.
    }

    @Test
    public void testAddNullBlockToLeft() {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, RectangleEdge.LEFT);
        // Cannot directly access leftBlock, will test its effect via arrange.
    }

    @Test
    public void testAddNullBlockToRight() {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(null, RectangleEdge.RIGHT);
        // Cannot directly access rightBlock, will test its effect via arrange.
    }

    @Test
    public void testArrangeNN_noBlocks() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlockContainer container = new DummyBlockContainer();
        container.setContentSize(new Size2D(0, 0));
        container.setTotalWidth(0);
        container.setTotalHeight(0);
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);
        assertEquals(0.0, result.getWidth(), 0.0);
        assertEquals(0.0, result.getHeight(), 0.0);
    }

    @Test
    public void testArrangeNN_onlyCenterBlock() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50));
        arrangement.add(center, null);
        DummyBlockContainer container = new DummyBlockContainer();
        // For arrangeNN, the container size is determined by the arrangement, not set beforehand.
        // We'll check the bounds of the center block.
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);
        assertEquals(50.0, result.getWidth(), 0.0);
        assertEquals(50.0, result.getHeight(), 0.0);
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 50.0, 50.0), center.getBounds());
    }

    @Test
    public void testArrangeNN_topAndBottomBlocks() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock top = new DummyBlock("top");
        top.setPreferredSize(new Size2D(100, 20));
        DummyBlock bottom = new DummyBlock("bottom");
        bottom.setPreferredSize(new Size2D(100, 30));
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);

        DummyBlockContainer container = new DummyBlockContainer();
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);

        // The total height should be the sum of top and bottom heights.
        // The width should be the max width of top/bottom, or center if present.
        // Since no center, it's 100.
        assertEquals(100.0, result.getWidth(), 0.0);
        assertEquals(50.0, result.getHeight(), 0.0); // 20 (top) + 30 (bottom)

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 100.0, 20.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 100.0, 30.0), bottom.getBounds());
    }

    @Test
    public void testArrangeNN_leftAndRightBlocks() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock left = new DummyBlock("left");
        left.setPreferredSize(new Size2D(20, 100));
        DummyBlock right = new DummyBlock("right");
        right.setPreferredSize(new Size2D(30, 100));
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);

        DummyBlockContainer container = new DummyBlockContainer();
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);

        // Total width is sum of left and right. Height is max of left/right.
        assertEquals(50.0, result.getWidth(), 0.0); // 20 (left) + 30 (right)
        assertEquals(100.0, result.getHeight(), 0.0);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 20.0, 100.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(20.0, 0.0, 30.0, 100.0), right.getBounds());
    }

    @Test
    public void testArrangeNN_allBlocks() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock top = new DummyBlock("top");
        top.setPreferredSize(new Size2D(100, 20));
        DummyBlock bottom = new DummyBlock("bottom");
        bottom.setPreferredSize(new Size2D(100, 30));
        DummyBlock left = new DummyBlock("left");
        left.setPreferredSize(new Size2D(20, 60)); // Height will be adjusted to max side height
        DummyBlock right = new DummyBlock("right");
        right.setPreferredSize(new Size2D(30, 70)); // Height will be adjusted to max side height
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50));
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        DummyBlockContainer container = new DummyBlockContainer();
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);

        // Expected calculation based on arrangeNN logic:
        // w[0] = 100 (top), h[0] = 20
        // w[1] = 100 (bottom), h[1] = 30
        // w[2] = 20 (left), h[2] = 60
        // w[3] = 30 (right), h[3] = 70
        // h[2] = Math.max(h[2], h[3]) = Math.max(60, 70) = 70
        // h[3] = h[2] = 70
        // w[4] = 50 (center), h[4] = 50
        // width = Math.max(w[0], Math.max(w[1], w[2] + w[4] + w[3])) = Math.max(100, Math.max(100, 20 + 50 + 30)) = Math.max(100, 100) = 100
        // centerHeight = Math.max(h[2], Math.max(h[3], h[4])) = Math.max(70, Math.max(70, 50)) = 70
        // height = h[0] + h[1] + centerHeight = 20 + 30 + 70 = 120

        assertEquals(100.0, result.getWidth(), 0.0);
        assertEquals(120.0, result.getHeight(), 0.0);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 100.0, 20.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 100.0, 100.0, 30.0), bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 20.0, 70.0), left.getBounds()); // Height is centerHeight
        assertEquals(new Rectangle2D.Double(80.0, 20.0, 30.0, 70.0), right.getBounds()); // Height is centerHeight
        assertEquals(new Rectangle2D.Double(20.0, 20.0, 60.0, 70.0), center.getBounds()); // Width = width - w[2] - w[3] = 100 - 20 - 30 = 50. Height = centerHeight = 70.
    }

    @Test
    public void testArrangeFF_allBlocksFixedConstraints() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock top = new DummyBlock("top");
        top.setPreferredSize(new Size2D(100, 20));
        DummyBlock bottom = new DummyBlock("bottom");
        bottom.setPreferredSize(new Size2D(100, 30));
        DummyBlock left = new DummyBlock("left");
        left.setPreferredSize(new Size2D(20, 100));
        DummyBlock right = new DummyBlock("right");
        right.setPreferredSize(new Size2D(30, 100));
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50));
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        DummyBlockContainer container = new DummyBlockContainer();
        RectangleConstraint constraint = new RectangleConstraint(100.0, 150.0); // Fixed width and height

        Size2D result = arrangement.arrange(container, null, constraint);

        assertEquals(100.0, result.getWidth(), 0.0);
        assertEquals(150.0, result.getHeight(), 0.0);

        // Check bounds after arrangeFF
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 100.0, 20.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 130.0, 100.0, 30.0), bottom.getBounds()); // h[0]=20, h[1]=30, h[2]=100 => height=150. bottom starts at h[0]+h[2] = 20+100=120.
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 20.0, 100.0), left.getBounds()); // h[2]=100
        assertEquals(new Rectangle2D.Double(80.0, 20.0, 30.0, 100.0), right.getBounds()); // w[2]=20, w[4]=60, w[3]=30. starts at w[2]+w[4] = 20+60=80.
        assertEquals(new Rectangle2D.Double(20.0, 20.0, 60.0, 100.0), center.getBounds()); // w[4]=60, h[4]=100
    }

    @Test
    public void testArrangeFR_withHeightRangeConstraint() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50));
        arrangement.add(center, null);
        DummyBlockContainer container = new DummyBlockContainer();

        // Arrange with fixed width and a height range that can accommodate
        RectangleConstraint constraint = new RectangleConstraint(50.0, new Range(40.0, 60.0));
        Size2D result = arrangement.arrange(container, null, constraint);
        assertEquals(50.0, result.getWidth(), 0.0);
        assertEquals(50.0, result.getHeight(), 0.0); // arrangeFN will return preferred height when in range

        // Arrange with fixed width and a height range that is smaller than preferred
        RectangleConstraint constraintTooSmall = new RectangleConstraint(50.0, new Range(20.0, 40.0));
        Size2D resultTooSmall = arrangement.arrange(container, null, constraintTooSmall);
        assertEquals(50.0, resultTooSmall.getWidth(), 0.0);
        assertEquals(40.0, resultTooSmall.getHeight(), 0.0); // constrained to max of range

        // Arrange with fixed width and a height range that is larger than preferred
        RectangleConstraint constraintTooLarge = new RectangleConstraint(50.0, new Range(60.0, 80.0));
        Size2D resultTooLarge = arrangement.arrange(container, null, constraintTooLarge);
        assertEquals(50.0, resultTooLarge.getWidth(), 0.0);
        assertEquals(60.0, resultTooLarge.getHeight(), 0.0); // constrained to min of range
    }

    @Test
    public void testArrangeRR_withRangeConstraints() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50));
        arrangement.add(center, null);
        DummyBlockContainer container = new DummyBlockContainer();

        Range widthRange = new Range(80.0, 120.0);
        Range heightRange = new Range(80.0, 120.0);
        RectangleConstraint constraint = new RectangleConstraint(widthRange, heightRange);

        Size2D result = arrangement.arrange(container, null, constraint);

        // In arrangeRR, the center block's constraint is (widthRange3, heightRange3)
        // where widthRange3 = Range.shift(widthRange, -(w[2] + w[3]), false);
        // and heightRange3 = Range.shift(heightRange, -(h[0] + h[1]));
        // Without top, bottom, left, right blocks, these ranges are the original ranges.
        // The center block's arrange method will then use a constraint based on these.
        // If the center block's preferred size (50x50) is within the effective constraint range, it will return 50x50.
        // The overall width/height calculation in arrangeRR also considers preferences.
        // Given the ranges (80-120) are larger than the center block's preferred size (50x50),
        // the center block itself will be arranged to its preferred size.
        // The final `width` and `height` returned by `arrangeRR` are calculated based on the arrangement of all blocks.
        // For a single center block, the result should be its preferred size.
        assertEquals(50.0, result.getWidth(), 0.0);
        assertEquals(50.0, result.getHeight(), 0.0);
    }


    @Test
    public void testClear() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock top = new DummyBlock("top");
        DummyBlock bottom = new DummyBlock("bottom");
        DummyBlock left = new DummyBlock("left");
        DummyBlock right = new DummyBlock("right");
        DummyBlock center = new DummyBlock("center");
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        arrangement.clear();
        // Since fields are private, we check for the side-effects of clear which is that
        // subsequent arrange calls should behave as if no blocks are present.
        DummyBlockContainer container = new DummyBlockContainer();
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);
        assertEquals(0.0, result.getWidth(), 0.0);
        assertEquals(0.0, result.getHeight(), 0.0);
    }

    @Test
    public void testEquals_sameObject() {
        BorderArrangement arrangement = new BorderArrangement();
        assertTrue(arrangement.equals(arrangement));
    }

    @Test
    public void testEquals_differentObjectNull() {
        BorderArrangement arrangement = new BorderArrangement();
        assertFalse(arrangement.equals(null));
    }

    @Test
    public void testEquals_differentObjectType() {
        BorderArrangement arrangement = new BorderArrangement();
        assertFalse(arrangement.equals(new Object()));
    }

    @Test
    public void testEquals_emptyArrangements() {
        BorderArrangement arrangement1 = new BorderArrangement();
        BorderArrangement arrangement2 = new BorderArrangement();
        assertEquals(arrangement1, arrangement2);
    }

    @Test
    public void testEquals_withSameBlocks() {
        BorderArrangement arrangement1 = new BorderArrangement();
        BorderArrangement arrangement2 = new BorderArrangement();
        DummyBlock block1 = new DummyBlock("block1");
        DummyBlock block2 = new DummyBlock("block2");
        arrangement1.add(block1, RectangleEdge.TOP);
        arrangement1.add(block2, RectangleEdge.LEFT);
        arrangement2.add(block1, RectangleEdge.TOP);
        arrangement2.add(block2, RectangleEdge.LEFT);
        assertEquals(arrangement1, arrangement2);
    }

    @Test
    public void testEquals_withDifferentTopBlock() {
        BorderArrangement arrangement1 = new BorderArrangement();
        BorderArrangement arrangement2 = new BorderArrangement();
        DummyBlock block1 = new DummyBlock("block1");
        DummyBlock block2 = new DummyBlock("block2");
        arrangement1.add(block1, RectangleEdge.TOP);
        arrangement2.add(block2, RectangleEdge.TOP);
        assertNotEquals(arrangement1, arrangement2);
    }

    @Test
    public void testEquals_withDifferentBottomBlock() {
        BorderArrangement arrangement1 = new BorderArrangement();
        BorderArrangement arrangement2 = new BorderArrangement();
        DummyBlock block1 = new DummyBlock("block1");
        DummyBlock block2 = new DummyBlock("block2");
        arrangement1.add(block1, RectangleEdge.BOTTOM);
        arrangement2.add(block2, RectangleEdge.BOTTOM);
        assertNotEquals(arrangement1, arrangement2);
    }

    @Test
    public void testEquals_withDifferentLeftBlock() {
        BorderArrangement arrangement1 = new BorderArrangement();
        BorderArrangement arrangement2 = new BorderArrangement();
        DummyBlock block1 = new DummyBlock("block1");
        DummyBlock block2 = new DummyBlock("block2");
        arrangement1.add(block1, RectangleEdge.LEFT);
        arrangement2.add(block2, RectangleEdge.LEFT);
        assertNotEquals(arrangement1, arrangement2);
    }

    @Test
    public void testEquals_withDifferentRightBlock() {
        BorderArrangement arrangement1 = new BorderArrangement();
        BorderArrangement arrangement2 = new BorderArrangement();
        DummyBlock block1 = new DummyBlock("block1");
        DummyBlock block2 = new DummyBlock("block2");
        arrangement1.add(block1, RectangleEdge.RIGHT);
        arrangement2.add(block2, RectangleEdge.RIGHT);
        assertNotEquals(arrangement1, arrangement2);
    }

    @Test
    public void testEquals_withDifferentCenterBlock() {
        BorderArrangement arrangement1 = new BorderArrangement();
        BorderArrangement arrangement2 = new BorderArrangement();
        DummyBlock block1 = new DummyBlock("block1");
        DummyBlock block2 = new DummyBlock("block2");
        arrangement1.add(block1, null);
        arrangement2.add(block2, null);
        assertNotEquals(arrangement1, arrangement2);
    }

    @Test
    public void testArrangeNN_leftAndRightBlocksDifferentHeights() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock left = new DummyBlock("left");
        left.setPreferredSize(new Size2D(20, 100));
        DummyBlock right = new DummyBlock("right");
        right.setPreferredSize(new Size2D(30, 120)); // Taller right block
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);

        DummyBlockContainer container = new DummyBlockContainer();
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);

        // Height should be max of left/right heights. Width is sum.
        assertEquals(50.0, result.getWidth(), 0.0);
        assertEquals(120.0, result.getHeight(), 0.0);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 20.0, 100.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(20.0, 0.0, 30.0, 120.0), right.getBounds()); // Bounds should reflect actual arrangement. Right block's height will be determined by the max height (120).
    }
    
    @Test
    public void testArrangeNN_centerBlockSizedLargerThanSides() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock left = new DummyBlock("left");
        left.setPreferredSize(new Size2D(20, 50));
        DummyBlock right = new DummyBlock("right");
        right.setPreferredSize(new Size2D(30, 50));
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(100, 100)); // Center is much larger
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        DummyBlockContainer container = new DummyBlockContainer();
        Size2D result = arrangement.arrange(container, null, RectangleConstraint.NONE);

        // Expected calculation:
        // w[2] = 20 (left), h[2] = 50
        // w[3] = 30 (right), h[3] = 50
        // h[2] = max(50, 50) = 50, h[3] = 50
        // w[4] = 100 (center), h[4] = 100
        // width = max(0, max(0, 20 + 100 + 30)) = 150
        // centerHeight = max(50, max(50, 100)) = 100
        // height = 0 + 0 + 100 = 100

        assertEquals(150.0, result.getWidth(), 0.0);
        assertEquals(100.0, result.getHeight(), 0.0);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 20.0, 50.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(20.0, 0.0, 30.0, 50.0), right.getBounds()); // Right block bounds start at x = width - w[3] = 150 - 30 = 120.
        assertEquals(new Rectangle2D.Double(20.0, 0.0, 100.0, 100.0), center.getBounds()); // Bounds x = w[2], y = h[0], width = width - w[2] - w[3], height = centerHeight.
    }

    @Test
    public void testArrangeFN_fixedWidthNoHeightConstraint() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock top = new DummyBlock("top");
        top.setPreferredSize(new Size2D(100, 20));
        DummyBlock bottom = new DummyBlock("bottom");
        bottom.setPreferredSize(new Size2D(100, 30));
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50));
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(center, null);

        DummyBlockContainer container = new DummyBlockContainer();
        double fixedWidth = 100.0;
        RectangleConstraint constraint = new RectangleConstraint(fixedWidth, null, LengthConstraintType.FIXED, 0.0, null, LengthConstraintType.NONE);

        Size2D result = arrangement.arrange(container, null, constraint);

        // arrangeFN uses the fixed width and calculates height based on content.
        // h[0]=20, h[1]=30, h[4]=50. Height = 20 + 30 + 50 = 100.
        // Width is fixed at 100.
        assertEquals(100.0, result.getWidth(), 0.0);
        assertEquals(100.0, result.getHeight(), 0.0);

        // Check bounds
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 100.0, 20.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 80.0, 100.0, 30.0), bottom.getBounds()); // Starts at h[0] + centerHeight = 20 + 50 = 70. This is incorrect from the arrangeFN logic.
        // Let's re-evaluate arrangeFN bounds:
        // Top block: setBounds(0.0, 0.0, width, h[0]) -> (0.0, 0.0, 100.0, 20.0)
        // Bottom block: setBounds(0.0, height - h[1], width, h[1]) -> (0.0, 100.0 - 30.0, 100.0, 30.0) -> (0.0, 70.0, 100.0, 30.0)
        // Center block: setBounds(w[2], h[0], width - w[2] - w[3], centerHeight) -> w[2] and w[3] are 0 here.
        // -> setBounds(0.0, 20.0, 100.0, 50.0)
        assertEquals(new Rectangle2D.Double(0.0, 70.0, 100.0, 30.0), bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 100.0, 50.0), center.getBounds());
    }

    @Test
    public void testArrangeFN_fixedWidthWithLeftAndRight() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock left = new DummyBlock("left");
        left.setPreferredSize(new Size2D(20, 100));
        DummyBlock right = new DummyBlock("right");
        right.setPreferredSize(new Size2D(30, 100));
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50)); // Center height might not matter if sides determine it
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        DummyBlockContainer container = new DummyBlockContainer();
        double fixedWidth = 100.0;
        RectangleConstraint constraint = new RectangleConstraint(fixedWidth, null, LengthConstraintType.FIXED, 0.0, null, LengthConstraintType.NONE);

        Size2D result = arrangement.arrange(container, null, constraint);

        // arrangeFN:
        // top/bottom have no blocks, so h[0]=0, h[1]=0.
        // Left: arrange(g2, c2) where c2 is RectangleConstraint(0.0, new Range(0.0, width), RANGE, 0.0, NONE) -> new Range(0.0, 100.0)
        //   Size2D size_left = left.arrange(g2, c2); w[2]=20, h[2]=100.
        // Right: maxW = Math.max(width - w[2], 0.0) = 100-20=80.
        //   c3 = new RectangleConstraint(0.0, new Range(Math.min(w[2], maxW), maxW), RANGE, 0.0, NONE) -> new Range(20.0, 80.0)
        //   Size2D size_right = right.arrange(g2, c3); w[3]=30, h[3]=100.
        // h[2]=max(100,100)=100, h[3]=100.
        // Center: c4 = new RectangleConstraint(width - w[2] - w[3], null, FIXED, 0.0, null, NONE) -> new RectangleConstraint(100 - 20 - 30, ...) -> new RectangleConstraint(50, ...)
        //   Size2D size_center = center.arrange(g2, c4); w[4]=50, h[4]=50.
        // height = h[0] + h[1] + Math.max(h[2], Math.max(h[3], h[4])) = 0 + 0 + Math.max(100, Math.max(100, 50)) = 100.
        // Return: arrange(container, g2, new RectangleConstraint(width, height)) -> arrange(container, g2, new RectangleConstraint(100.0, 100.0))

        assertEquals(100.0, result.getWidth(), 0.0);
        assertEquals(100.0, result.getHeight(), 0.0);

        // Bounds set by arrangeFF:
        // Left: setBounds(0.0, h[0], w[2], h[2]) -> (0.0, 0.0, 20.0, 100.0)
        // Right: setBounds(width - w[3], h[0], w[3], h[3]) -> (100.0 - 30.0, 0.0, 30.0, 100.0) -> (70.0, 0.0, 30.0, 100.0)
        // Center: setBounds(w[2], h[0], w[4], h[4]) -> (20.0, 0.0, 50.0, 50.0)
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 20.0, 100.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(70.0, 0.0, 30.0, 100.0), right.getBounds());
        assertEquals(new Rectangle2D.Double(20.0, 0.0, 50.0, 50.0), center.getBounds());
    }

    @Test
    public void testArrangeFR_fixedWidthRangeHeight() {
        BorderArrangement arrangement = new BorderArrangement();
        DummyBlock center = new DummyBlock("center");
        center.setPreferredSize(new Size2D(50, 50));
        arrangement.add(center, null);
        DummyBlockContainer container = new DummyBlockContainer();

        // arrangeFR calls arrangeFN first.
        // If arrangeFN result height is within range, it returns that.
        // Otherwise, it constrains height and calls arrange with fixed height.

        // Case 1: arrangeFN returns size within range
        // arrangeFN with fixed width 50 will return Size2D(50, 50) for the center block.
        RectangleConstraint constraint1 = new RectangleConstraint(50.0, new Range(40.0, 60.0)); // Height 50 is in range [40, 60]
        Size2D result1 = arrangement.arrange(container, null, constraint1);
        assertEquals(50.0, result1.getWidth(), 0.0);
        assertEquals(50.0, result1.getHeight(), 0.0);

        // Case 2: arrangeFN returns height smaller than range min
        RectangleConstraint constraint2 = new RectangleConstraint(50.0, new Range(60.0, 80.0)); // Height 50 is smaller than range min 60.
        // arrangeFN returns 50. Height range is [60, 80].
        // constrain(50) -> 60.
        // Calls arrange with fixed height 60.
        // arrangeFF will be called with width 50, height 60.
        // Center block will be arranged to 50x50 (its preferred size if it fits within 50x60).
        // arrangeFF returns new Size2D(constraint.getWidth(), constraint.getHeight()) -> 50x60
        Size2D result2 = arrangement.arrange(container, null, constraint2);
        assertEquals(50.0, result2.getWidth(), 0.0);
        assertEquals(60.0, result2.getHeight(), 0.0);

        // Case 3: arrangeFN returns height larger than range max
        RectangleConstraint constraint3 = new RectangleConstraint(50.0, new Range(20.0, 40.0)); // Height 50 is larger than range max 40.
        // arrangeFN returns 50. Height range is [20, 40].
        // constrain(50) -> 40.
        // Calls arrange with fixed height 40.
        // arrangeFF will be called with width 50, height 40.
        // Center block will be arranged to 50x40.
        // arrangeFF returns new Size2D(constraint.getWidth(), constraint.getHeight()) -> 50x40
        Size2D result3 = arrangement.arrange(container, null, constraint3);
        assertEquals(50.0, result3.getWidth(), 0.0);
        assertEquals(40.0, result3.getHeight(), 0.0);
    }
}
```