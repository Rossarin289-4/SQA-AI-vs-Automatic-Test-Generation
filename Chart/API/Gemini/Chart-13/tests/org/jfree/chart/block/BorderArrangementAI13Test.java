package org.jfree.chart.block;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for the {@link BorderArrangement} class.
 */
public class BorderArrangementAI13Test {

    private static final double EPSILON = 0.000000001;

    @Test
    public void testEqualsAndClear() {
        BorderArrangement arr1 = new BorderArrangement();
        BorderArrangement arr2 = new BorderArrangement();
        Assert.assertEquals(arr1, arr2);
        Assert.assertEquals(arr1, arr1);
        Assert.assertFalse(arr1.equals(null));
        Assert.assertFalse(arr1.equals("Not a BorderArrangement"));

        EmptyBlock b1 = new EmptyBlock(10.0, 10.0);
        arr1.add(b1, RectangleEdge.TOP);
        Assert.assertFalse(arr1.equals(arr2));

        arr2.add(b1, RectangleEdge.TOP);
        Assert.assertEquals(arr1, arr2);

        arr1.add(new EmptyBlock(20.0, 20.0), RectangleEdge.BOTTOM);
        arr2.add(new EmptyBlock(20.0, 20.0), RectangleEdge.BOTTOM);
        arr1.add(new EmptyBlock(15.0, 15.0), RectangleEdge.LEFT);
        arr2.add(new EmptyBlock(15.0, 15.0), RectangleEdge.LEFT);
        arr1.add(new EmptyBlock(12.0, 12.0), RectangleEdge.RIGHT);
        arr2.add(new EmptyBlock(12.0, 12.0), RectangleEdge.RIGHT);
        arr1.add(new EmptyBlock(5.0, 5.0), null);
        arr2.add(new EmptyBlock(5.0, 5.0), null);
        Assert.assertEquals(arr1, arr2);

        arr1.clear();
        Assert.assertFalse(arr1.equals(arr2));

        arr2.clear();
        Assert.assertEquals(arr1, arr2);
    }

    @Test
    public void testArrangeNN() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(100.0, 25.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(15.0, 50.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(25.0, 60.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(40.0, 30.0), null);

        Size2D size = container.arrange(null, RectangleConstraint.NONE);
        // left(15) + center(40) + right(25) = 80; max(top=100, bottom=100, 80) = 100
        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        // top(20) + bottom(25) + max(left(50), right(60), center(30)) = 20 + 25 + 60 = 105
        Assert.assertEquals(105.0, size.getHeight(), EPSILON);
    }

    @Test
    public void testArrangeNNEmpty() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        Size2D size = container.arrange(null, RectangleConstraint.NONE);
        Assert.assertEquals(0.0, size.getWidth(), EPSILON);
        Assert.assertEquals(0.0, size.getHeight(), EPSILON);
    }

    @Test
    public void testArrangeFF() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        EmptyBlock top = new EmptyBlock(10.0, 20.0);
        EmptyBlock bottom = new EmptyBlock(10.0, 30.0);
        EmptyBlock left = new EmptyBlock(15.0, 10.0);
        EmptyBlock right = new EmptyBlock(25.0, 10.0);
        EmptyBlock center = new EmptyBlock(10.0, 10.0);

        container.add(top, RectangleEdge.TOP);
        container.add(bottom, RectangleEdge.BOTTOM);
        container.add(left, RectangleEdge.LEFT);
        container.add(right, RectangleEdge.RIGHT);
        container.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(200.0, 150.0);
        Size2D size = container.arrange(null, constraint);

        Assert.assertEquals(200.0, size.getWidth(), EPSILON);
        Assert.assertEquals(150.0, size.getHeight(), EPSILON);

        Assert.assertEquals(0.0, top.getBounds().getX(), EPSILON);
        Assert.assertEquals(0.0, top.getBounds().getY(), EPSILON);
        Assert.assertEquals(200.0, top.getBounds().getWidth(), EPSILON);
        Assert.assertEquals(20.0, top.getBounds().getHeight(), EPSILON);

        Assert.assertEquals(0.0, bottom.getBounds().getX(), EPSILON);
        Assert.assertEquals(120.0, bottom.getBounds().getY(), EPSILON);
        Assert.assertEquals(200.0, bottom.getBounds().getWidth(), EPSILON);
        Assert.assertEquals(30.0, bottom.getBounds().getHeight(), EPSILON);

        // Center height is 150 - 20 - 30 = 100
        Assert.assertEquals(0.0, left.getBounds().getX(), EPSILON);
        Assert.assertEquals(20.0, left.getBounds().getY(), EPSILON);
        Assert.assertEquals(15.0, left.getBounds().getWidth(), EPSILON);
        Assert.assertEquals(100.0, left.getBounds().getHeight(), EPSILON);

        // Center width is 200 - 15 - 25 = 160
        Assert.assertEquals(15.0, center.getBounds().getX(), EPSILON);
        Assert.assertEquals(20.0, center.getBounds().getY(), EPSILON);
        Assert.assertEquals(160.0, center.getBounds().getWidth(), EPSILON);
        Assert.assertEquals(100.0, center.getBounds().getHeight(), EPSILON);

        Assert.assertEquals(175.0, right.getBounds().getX(), EPSILON);
        Assert.assertEquals(20.0, right.getBounds().getY(), EPSILON);
        Assert.assertEquals(25.0, right.getBounds().getWidth(), EPSILON);
        Assert.assertEquals(100.0, right.getBounds().getHeight(), EPSILON);
    }

    @Test
    public void testArrangeFN() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        container.add(new EmptyBlock(50.0, 10.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(50.0, 15.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(20.0, 40.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(30.0, 30.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(10.0, 20.0), null);

        RectangleConstraint constraint = new RectangleConstraint(100.0, null,
                LengthConstraintType.FIXED, 0.0, null, LengthConstraintType.NONE);
        Size2D size = container.arrange(null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        // Height = top(10) + bottom(15) + max(left(40), right(40), center(20)) = 65
        Assert.assertEquals(65.0, size.getHeight(), EPSILON);
    }

    @Test
    public void testArrangeFRWithinRange() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        container.add(new EmptyBlock(50.0, 10.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(50.0, 15.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(20.0, 30.0), RectangleEdge.LEFT);

        RectangleConstraint constraint = new RectangleConstraint(100.0, new Range(40.0, 80.0));
        Size2D size = container.arrange(null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        // Height = 10 + 15 + 30 = 55 (within [40, 80])
        Assert.assertEquals(55.0, size.getHeight(), EPSILON);
    }

    @Test
    public void testArrangeFROutsideRange() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        container.add(new EmptyBlock(50.0, 10.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(50.0, 15.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(20.0, 30.0), RectangleEdge.LEFT);

        RectangleConstraint constraint = new RectangleConstraint(100.0, new Range(10.0, 40.0));
        Size2D size = container.arrange(null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        // Unconstrained height would be 55, constrained to max 40
        Assert.assertEquals(40.0, size.getHeight(), EPSILON);
    }

    @Test
    public void testArrangeRR() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        container.add(new EmptyBlock(50.0, 10.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(60.0, 15.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(20.0, 40.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(30.0, 30.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(25.0, 35.0), null);

        RectangleConstraint constraint = new RectangleConstraint(
                new Range(50.0, 200.0), new Range(40.0, 200.0));
        Size2D size = container.arrange(null, constraint);

        // Width = max(top=50, bottom=60, left(20) + center(25) + right(30) = 75) = 75
        Assert.assertEquals(75.0, size.getWidth(), EPSILON);
        // Height = top(10) + bottom(15) + max(left(40), right(40), center(35)) = 65
        Assert.assertEquals(65.0, size.getHeight(), EPSILON);
    }

    @Test(expected = RuntimeException.class)
    public void testArrangeUnsupportedNoneFixed() {
        BorderArrangement arrangement = new BorderArrangement();
        BlockContainer container = new BlockContainer(arrangement);
        RectangleConstraint constraint = new RectangleConstraint(0.0, null,
                LengthConstraintType.NONE, 50.0, null, LengthConstraintType.FIXED);
        arrangement.arrange(container, null, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrangeUnsupportedNoneRange() {
        BorderArrangement arrangement = new BorderArrangement();
        BlockContainer container = new BlockContainer(arrangement);
        RectangleConstraint constraint = new RectangleConstraint(0.0, null,
                LengthConstraintType.NONE, 0.0, new Range(10.0, 50.0), LengthConstraintType.RANGE);
        arrangement.arrange(container, null, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrangeUnsupportedRangeNone() {
        BorderArrangement arrangement = new BorderArrangement();
        BlockContainer container = new BlockContainer(arrangement);
        RectangleConstraint constraint = new RectangleConstraint(0.0, new Range(10.0, 50.0),
                LengthConstraintType.RANGE, 0.0, null, LengthConstraintType.NONE);
        arrangement.arrange(container, null, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrangeUnsupportedRangeFixed() {
        BorderArrangement arrangement = new BorderArrangement();
        BlockContainer container = new BlockContainer(arrangement);
        RectangleConstraint constraint = new RectangleConstraint(0.0, new Range(10.0, 50.0),
                LengthConstraintType.RANGE, 50.0, null, LengthConstraintType.FIXED);
        arrangement.arrange(container, null, constraint);
    }

    @Test
    public void testSerialization() throws Exception {
        BorderArrangement arr1 = new BorderArrangement();
        arr1.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        arr1.add(new EmptyBlock(30.0, 40.0), RectangleEdge.BOTTOM);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(arr1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        BorderArrangement arr2 = (BorderArrangement) in.readObject();
        in.close();

        Assert.assertEquals(arr1, arr2);
    }
}
