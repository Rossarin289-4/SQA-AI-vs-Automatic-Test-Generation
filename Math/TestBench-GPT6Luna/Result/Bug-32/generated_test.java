package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree;
import org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple;
import org.apache.commons.math3.util.FastMath;

public class PolygonsSetTest {
    @Test
    public void testEmptyTreeHasNoVertices() throws Exception {
        PolygonsSet set = new PolygonsSet();
        assertEquals(0, set.getVertices().length);
    }

    @Test
    public void testWholeSpaceTreeHasNoVertices() throws Exception {
        PolygonsSet set = new PolygonsSet(new BSPTree<Euclidean2D>(Boolean.TRUE));
        assertEquals(0, set.getVertices().length);
    }

    @Test
    public void testBoxVerticesFormOneLoop() throws Exception {
        PolygonsSet set = new PolygonsSet(0, 2, 0, 1);
        Vector2D[][] vertices = set.getVertices();
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
    }

    @Test
    public void testBoxVerticesHaveExpectedCoordinates() throws Exception {
        PolygonsSet set = new PolygonsSet(0, 2, 0, 1);
        Vector2D[] vertices = set.getVertices()[0];
        assertEquals(0.0, vertices[0].getX(), 1e-12);
        assertEquals(0.0, vertices[0].getY(), 1e-12);
        assertEquals(2.0, vertices[1].getX(), 1e-12);
        assertEquals(0.0, vertices[1].getY(), 1e-12);
        assertEquals(2.0, vertices[2].getX(), 1e-12);
        assertEquals(1.0, vertices[2].getY(), 1e-12);
        assertEquals(0.0, vertices[3].getX(), 1e-12);
        assertEquals(1.0, vertices[3].getY(), 1e-12);
    }

    @Test
    public void testBoxVerticesReturnDistinctOuterArrays() throws Exception {
        PolygonsSet set = new PolygonsSet(0, 2, 0, 1);
        Vector2D[][] first = set.getVertices();
        Vector2D[][] second = set.getVertices();
        assertNotSame(first, second);
        assertSame(first[0], second[0]);
    }

    @Test
    public void testBuildNewFromWholeSpaceTree() throws Exception {
        PolygonsSet original = new PolygonsSet();
        PolygonsSet built = original.buildNew(new BSPTree<Euclidean2D>(Boolean.TRUE));
        assertEquals(0, built.getVertices().length);
    }

    @Test
    public void testBuildNewFromBoxTree() throws Exception {
        PolygonsSet original = new PolygonsSet();
        PolygonsSet built = original.buildNew(new PolygonsSet(0, 2, 0, 1).getTree(false));
        assertEquals(1, built.getVertices().length);
        assertEquals(4, built.getVertices()[0].length);
    }

    @Test
    public void testGetVerticesForZeroWidthBox() throws Exception {
        PolygonsSet set = new PolygonsSet(1, 1, 0, 1);
        assertEquals(0, set.getVertices().length);
    }

    @Test
    public void testGetVerticesForNegativeWidthBounds() throws Exception {
        PolygonsSet set = new PolygonsSet(2, 0, 0, 1);
        assertEquals(0, set.getVertices().length);
    }

    @Test
    public void testGetVerticesForUnitBox() throws Exception {
        PolygonsSet set = new PolygonsSet(0, 1, 0, 1);
        assertEquals(1, set.getVertices().length);
        assertEquals(4, set.getVertices()[0].length);
    }

    @Test
    public void testGetVerticesForTranslatedBox() throws Exception {
        PolygonsSet set = new PolygonsSet(-2, 3, -1, 4);
        Vector2D[][] vertices = set.getVertices();
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
        assertEquals(-2.0, vertices[0][0].getX(), 1e-12);
        assertEquals(-1.0, vertices[0][0].getY(), 1e-12);
    }

    @Test
    public void testWholeSpaceBoxBoundsHasNoVertices() throws Exception {
        PolygonsSet set = new PolygonsSet();
        assertEquals(0, set.getVertices().length);
    }

    @Test
    public void testWholeSpaceBspTreeHasNoCut() throws Exception {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        assertNull(tree.getCut());
        assertEquals(Boolean.TRUE, tree.getAttribute());
    }

    @Test
    public void testBoxBspTreeContainsCut() throws Exception {
        BSPTree<Euclidean2D> tree = new PolygonsSet(0, 2, 0, 1).getTree(false);
        assertNotNull(tree.getCut());
    }

    @Test
    public void testBuildNewPreservesSuppliedEmptyTree() throws Exception {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.FALSE);
        PolygonsSet built = new PolygonsSet().buildNew(tree);
        assertEquals(0, built.getVertices().length);
    }

    @Test
    public void testBoundaryConstructorWithEmptyCollection() throws Exception {
        Collection<SubHyperplane<Euclidean2D>> boundary =
            new ArrayList<SubHyperplane<Euclidean2D>>();
        PolygonsSet set = new PolygonsSet(boundary);
        assertEquals(0, set.getVertices().length);
    }

    @Test
    public void testBoxGetVerticesIsRepeatable() throws Exception {
        PolygonsSet set = new PolygonsSet(-1, 1, -1, 1);
        Vector2D[][] first = set.getVertices();
        Vector2D[][] second = set.getVertices();
        assertEquals(first.length, second.length);
        assertEquals(first[0].length, second[0].length);
        for (int i = 0; i < first[0].length; ++i) {
            assertEquals(first[0][i].getX(), second[0][i].getX(), 1e-12);
            assertEquals(first[0][i].getY(), second[0][i].getY(), 1e-12);
        }
    }

    @Test
    public void testBuildNewUsesTreeWithSingleLeaf() throws Exception {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        PolygonsSet built = new PolygonsSet(0, 1, 0, 1).buildNew(tree);
        assertEquals(0, built.getVertices().length);
    }

    @Test
    public void testBoxBoundaryHasFourVertices() throws Exception {
        PolygonsSet set = new PolygonsSet(0, 3, 0, 2);
        Vector2D[][] loops = set.getVertices();
        assertEquals(1, loops.length);
        assertEquals(4, loops[0].length);
    }

    @Test
    public void testBoxOppositeVertices() throws Exception {
        Vector2D[] vertices = new PolygonsSet(0, 3, 0, 2).getVertices()[0];
        assertEquals(0.0, vertices[0].getX(), 1e-12);
        assertEquals(0.0, vertices[0].getY(), 1e-12);
        assertEquals(3.0, vertices[2].getX(), 1e-12);
        assertEquals(2.0, vertices[2].getY(), 1e-12);
    }

    @Test
    public void testEmptyBoundaryProducesNoLoopsRepeatedly() throws Exception {
        PolygonsSet set = new PolygonsSet(new ArrayList<SubHyperplane<Euclidean2D>>());
        assertEquals(0, set.getVertices().length);
        assertEquals(0, set.getVertices().length);
    }

    @Test
    public void testBoxTreeUsedAsBuildNewInput() throws Exception {
        BSPTree<Euclidean2D> tree = new PolygonsSet(-2, 2, -1, 1).getTree(false);
        PolygonsSet built = new PolygonsSet().buildNew(tree);
        assertEquals(1, built.getVertices().length);
        assertEquals(4, built.getVertices()[0].length);
    }

    @Test
    public void testWholeSpaceTreeBuildNewIsDistinctRegion() throws Exception {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        PolygonsSet source = new PolygonsSet();
        PolygonsSet built = source.buildNew(tree);
        assertNotSame(source, built);
        assertEquals(0, built.getVertices().length);
    }

    @Test
    public void testBoxVerticesFirstAndLastAreDistinctCorners() throws Exception {
        Vector2D[] vertices = new PolygonsSet(0, 2, 0, 1).getVertices()[0];
        assertEquals(0.0, vertices[0].getX(), 1e-12);
        assertEquals(1.0, vertices[3].getY(), 1e-12);
    }

    @Test
    public void testNegativeHeightBoundsHaveNoVertices() throws Exception {
        PolygonsSet set = new PolygonsSet(0, 1, 2, 0);
        assertEquals(1, set.getVertices().length);
        assertTrue(set.getVertices()[0][0] == null);
    }

    @Test
    public void testZeroHeightBoundsHaveNoVertices() throws Exception {
        PolygonsSet set = new PolygonsSet(0, 1, 1, 1);
        assertEquals(1, set.getVertices().length);
        assertTrue(set.getVertices()[0][0] == null);
    }

    @Test
    public void testUnitBoxCornerOrder() throws Exception {
        Vector2D[] vertices = new PolygonsSet(0, 1, 0, 1).getVertices()[0];
        assertEquals(0.0, vertices[0].getX(), 1e-12);
        assertEquals(0.0, vertices[0].getY(), 1e-12);
        assertEquals(1.0, vertices[1].getX(), 1e-12);
        assertEquals(1.0, vertices[2].getY(), 1e-12);
        assertEquals(0.0, vertices[3].getX(), 1e-12);
    }
}
