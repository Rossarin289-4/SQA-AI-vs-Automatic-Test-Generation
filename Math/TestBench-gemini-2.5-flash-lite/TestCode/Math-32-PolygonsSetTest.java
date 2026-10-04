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
    public void testConstructorEmpty() {
        PolygonsSet ps = new PolygonsSet();
        assertNotNull(ps);
        assertEquals(0.0, ps.getSize(), 1.0e-9);
        assertTrue(ps.isEmpty());
    }

    @Test
    public void testConstructorWithTreeFullSpace() {
        BSPTree<Euclidean2D> tree = new BSPTree<>(true);
        PolygonsSet ps = new PolygonsSet(tree);
        assertNotNull(ps);
        assertEquals(Double.POSITIVE_INFINITY, ps.getSize(), 1.0e-9);
        assertFalse(ps.isEmpty());
    }

    @Test
    public void testConstructorWithTreeEmptySpace() {
        BSPTree<Euclidean2D> tree = new BSPTree<>(false);
        PolygonsSet ps = new PolygonsSet(tree);
        assertNotNull(ps);
        assertEquals(0.0, ps.getSize(), 1.0e-9);
        assertTrue(ps.isEmpty());
    }

    @Test
    public void testConstructorWithBoundaryEmpty() {
        Collection<SubHyperplane<Euclidean2D>> boundary = new ArrayList<>();
        PolygonsSet ps = new PolygonsSet(boundary);
        assertNotNull(ps);
        assertEquals(Double.POSITIVE_INFINITY, ps.getSize(), 1.0e-9); // Whole space if boundary is empty
        assertFalse(ps.isEmpty());
    }

    @Test
    public void testConstructorWithBox() {
        PolygonsSet ps = new PolygonsSet(0.0, 1.0, 2.0, 3.0);
        assertNotNull(ps);
        assertEquals(1.0, ps.getSize(), 1.0e-9);
        assertFalse(ps.isEmpty());
    }

    @Test
    public void testBuildNew() {
        BSPTree<Euclidean2D> tree = new BSPTree<>(true);
        PolygonsSet ps1 = new PolygonsSet(tree);
        PolygonsSet ps2 = ps1.buildNew(tree);
        assertNotNull(ps2);
        assertEquals(ps1.getSize(), ps2.getSize(), 1.0e-9);
    }

    @Test
    public void testComputeGeometricalPropertiesFullSpace() {
        BSPTree<Euclidean2D> tree = new BSPTree<>(true);
        PolygonsSet ps = new PolygonsSet(tree);
        ps.computeGeometricalProperties();
        assertEquals(Double.POSITIVE_INFINITY, ps.getSize(), 1.0e-9);
        assertTrue(ps.getBarycenter().isNaN());
    }

    @Test
    public void testComputeGeometricalPropertiesEmptySpace() {
        BSPTree<Euclidean2D> tree = new BSPTree<>(false);
        PolygonsSet ps = new PolygonsSet(tree);
        ps.computeGeometricalProperties();
        assertEquals(0.0, ps.getSize(), 1.0e-9);
        assertEquals(new Vector2D(0, 0), ps.getBarycenter());
    }




    @Test
    public void testGetVerticesEmpty() {
        PolygonsSet ps = new PolygonsSet();
        Vector2D[][] verts = ps.getVertices();
        assertNotNull(verts);
        assertEquals(0, verts.length);
    }

    @Test
    public void testGetVerticesFullSpace() {
        BSPTree<Euclidean2D> tree = new BSPTree<>(true);
        PolygonsSet ps = new PolygonsSet(tree);
        Vector2D[][] verts = ps.getVertices();
        assertNotNull(verts);
        assertEquals(0, verts.length);
    }

    @Test
    public void testGetVerticesBox() {
        PolygonsSet ps = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        Vector2D[][] verts = ps.getVertices();
        assertNotNull(verts);
        assertEquals(1, verts.length); // One loop for a box
        assertEquals(4, verts[0].length); // 4 vertices for a square
        assertEquals(new Vector2D(0.0, 0.0), verts[0][0]);
        assertEquals(new Vector2D(1.0, 0.0), verts[0][1]);
        assertEquals(new Vector2D(1.0, 1.0), verts[0][2]);
        assertEquals(new Vector2D(0.0, 1.0), verts[0][3]);
    }








    @Test
    public void testGetVerticesFromBSP() {
        // Create a simple box and use its boundary to build a BSP tree
        PolygonsSet box = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        BSPTree<Euclidean2D> tree = box.getTree(false);

        PolygonsSet ps = new PolygonsSet(tree);
        Vector2D[][] verts = ps.getVertices();
        assertNotNull(verts);
        assertEquals(1, verts.length); // Expecting one loop for the box
        assertEquals(4, verts[0].length);
    }
}


