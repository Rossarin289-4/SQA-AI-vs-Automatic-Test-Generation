package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.FastMath;

public class Vector3DTest {
    @Test
    public void testCoordinatesAndNorms() throws Exception {
        Vector3D v = new Vector3D(-2, 3, -6);
        assertEquals(-2.0, v.getX(), 0.0);
        assertEquals(3.0, v.getY(), 0.0);
        assertEquals(-6.0, v.getZ(), 0.0);
        assertEquals(11.0, v.getNorm1(), 0.0);
        assertEquals(7.0, v.getNorm(), 0.0);
        assertEquals(49.0, v.getNormSq(), 0.0);
        assertEquals(6.0, v.getNormInf(), 0.0);
    }

    @Test
    public void testPolarCoordinates() throws Exception {
        Vector3D v = new Vector3D(FastMath.PI / 2, 0);
        assertEquals(0.0, v.getX(), 1e-15);
        assertEquals(1.0, v.getY(), 1e-15);
        assertEquals(0.0, v.getZ(), 1e-15);
        assertEquals(FastMath.PI / 2, v.getAlpha(), 1e-15);
        assertEquals(0.0, v.getDelta(), 1e-15);
    }

    @Test
    public void testNormsOfZeroVector() throws Exception {
        Vector3D v = Vector3D.ZERO;
        assertEquals(0.0, v.getNorm1(), 0.0);
        assertEquals(0.0, v.getNorm(), 0.0);
        assertEquals(0.0, v.getNormSq(), 0.0);
        assertEquals(0.0, v.getNormInf(), 0.0);
    }

    @Test
    public void testAddAndSubtract() throws Exception {
        Vector3D a = new Vector3D(1, -2, 4);
        Vector3D b = new Vector3D(3, 5, -1);
        Vector3D sum = a.add(b);
        Vector3D difference = a.subtract(b);
        assertEquals(4.0, sum.getX(), 0.0);
        assertEquals(3.0, sum.getY(), 0.0);
        assertEquals(3.0, sum.getZ(), 0.0);
        assertEquals(-2.0, difference.getX(), 0.0);
        assertEquals(-7.0, difference.getY(), 0.0);
        assertEquals(5.0, difference.getZ(), 0.0);
    }

    @Test
    public void testAddAndSubtractScaledVector() throws Exception {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, -2, 3);
        Vector3D sum = a.add(2, b);
        Vector3D difference = a.subtract(2, b);
        assertEquals(4.0, sum.getX(), 0.0);
        assertEquals(-1.0, sum.getY(), 0.0);
        assertEquals(10.0, sum.getZ(), 0.0);
        assertEquals(0.0, difference.getX(), 0.0);
        assertEquals(7.0, difference.getY(), 0.0);
        assertEquals(-2.0, difference.getZ(), 0.0);
    }

    @Test
    public void testNormalizeNonzeroVector() throws Exception {
        Vector3D v = new Vector3D(3, 0, 4).normalize();
        assertEquals(0.6, v.getX(), 1e-15);
        assertEquals(0.0, v.getY(), 0.0);
        assertEquals(0.8, v.getZ(), 1e-15);
        assertEquals(1.0, v.getNorm(), 1e-15);
    }

    @Test
    public void testNormalizeZeroVectorThrows() throws Exception {
        try {
            Vector3D.ZERO.normalize();
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) {
        }
    }

    @Test
    public void testOrthogonalUsesFirstBranch() throws Exception {
        Vector3D v = new Vector3D(0, 3, 4);
        Vector3D o = v.orthogonal();
        assertEquals(0.0, o.getX(), 0.0);
        assertEquals(0.8, o.getY(), 1e-15);
        assertEquals(-0.6, o.getZ(), 1e-15);
        assertEquals(0.0, Vector3D.dotProduct(v, o), 1e-15);
        assertEquals(1.0, o.getNorm(), 1e-15);
    }

    @Test
    public void testOrthogonalUsesSecondBranch() throws Exception {
        Vector3D v = new Vector3D(3, 0, 4);
        Vector3D o = v.orthogonal();
        assertEquals(0.0, o.getX(), 0.0);
        assertEquals(0.0, o.getY(), 0.0);
        assertEquals(1.0, o.getZ(), 0.0);
        assertEquals(0.0, Vector3D.dotProduct(v, o), 1e-15);
    }

    @Test
    public void testOrthogonalUsesThirdBranch() throws Exception {
        Vector3D v = new Vector3D(3, 4, 0);
        Vector3D o = v.orthogonal();
        assertEquals(0.0, o.getX(), 0.0);
        assertEquals(-1.0, o.getY(), 0.0);
        assertEquals(0.0, o.getZ(), 0.0);
        assertEquals(0.0, Vector3D.dotProduct(v, o), 1e-15);
    }

    @Test
    public void testOrthogonalZeroVectorThrows() throws Exception {
        try {
            Vector3D.ZERO.orthogonal();
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) {
        }
    }

    @Test
    public void testAngleAlignedOpposedAndSeparated() throws Exception {
        assertEquals(0.0, Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_I), 0.0);
        assertEquals(FastMath.PI, Vector3D.angle(Vector3D.PLUS_I, Vector3D.MINUS_I), 1e-15);
        assertEquals(FastMath.PI / 2, Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_J), 1e-15);
    }

    @Test
    public void testAngleWithZeroVectorThrows() throws Exception {
        try {
            Vector3D.angle(Vector3D.ZERO, Vector3D.PLUS_I);
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) {
        }
    }

    @Test
    public void testNegateAndScalarMultiply() throws Exception {
        Vector3D v = new Vector3D(2, -3, 4);
        Vector3D n = v.negate();
        Vector3D s = v.scalarMultiply(-2);
        assertEquals(-2.0, n.getX(), 0.0);
        assertEquals(3.0, n.getY(), 0.0);
        assertEquals(-4.0, n.getZ(), 0.0);
        assertEquals(-4.0, s.getX(), 0.0);
        assertEquals(6.0, s.getY(), 0.0);
        assertEquals(-8.0, s.getZ(), 0.0);
    }

    @Test
    public void testNaNAndInfinityClassification() throws Exception {
        assertTrue(Vector3D.NaN.isNaN());
        assertFalse(Vector3D.NaN.isInfinite());
        assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
        assertFalse(Vector3D.POSITIVE_INFINITY.isNaN());
        assertFalse(Vector3D.ZERO.isNaN());
        assertFalse(Vector3D.ZERO.isInfinite());
    }

    @Test
    public void testEqualityIncludingNaNAndNonVector() throws Exception {
        assertTrue(new Vector3D(1, 2, 3).equals(new Vector3D(1, 2, 3)));
        assertFalse(new Vector3D(1, 2, 3).equals(new Vector3D(1, 2, 4)));
        assertTrue(Vector3D.NaN.equals(new Vector3D(Double.NaN, 7, 8)));
        assertFalse(new Vector3D(1, 2, 3).equals(null));
        assertFalse(new Vector3D(1, 2, 3).equals("vector"));
    }

    @Test
    public void testNaNHashCodeIsCanonical() throws Exception {
        assertEquals(8, Vector3D.NaN.hashCode());
        assertEquals(8, new Vector3D(1, Double.NaN, 2).hashCode());
    }

    @Test
    public void testDotAndCrossProducts() throws Exception {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);
        assertEquals(32.0, Vector3D.dotProduct(a, b), 0.0);
        Vector3D cross = Vector3D.crossProduct(a, b);
        assertEquals(-3.0, cross.getX(), 1e-14);
        assertEquals(6.0, cross.getY(), 1e-14);
        assertEquals(-3.0, cross.getZ(), 1e-14);
    }

    @Test
    public void testCrossProductWithTinyNormReturnsZero() throws Exception {
        Vector3D tiny = new Vector3D(1e-160, 0, 0);
        Vector3D cross = Vector3D.crossProduct(tiny, Vector3D.PLUS_J);
        assertEquals(0.0, cross.getX(), 0.0);
        assertEquals(0.0, cross.getY(), 0.0);
        assertEquals(0.0, cross.getZ(), 0.0);
    }

    @Test
    public void testDistances() throws Exception {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 6, 3);
        assertEquals(7.0, Vector3D.distance1(a, b), 0.0);
        assertEquals(5.0, Vector3D.distance(a, b), 0.0);
        assertEquals(4.0, Vector3D.distanceInf(a, b), 0.0);
        assertEquals(25.0, Vector3D.distanceSq(a, b), 0.0);
    }

    @Test
    public void testDistanceIdenticalVectors() throws Exception {
        Vector3D a = new Vector3D(-2, 0, 5);
        assertEquals(0.0, Vector3D.distance1(a, a), 0.0);
        assertEquals(0.0, Vector3D.distance(a, a), 0.0);
        assertEquals(0.0, Vector3D.distanceInf(a, a), 0.0);
        assertEquals(0.0, Vector3D.distanceSq(a, a), 0.0);
    }

    @Test
    public void testToStringUsesVectorFormat() throws Exception {
        assertEquals("{1; 2; 3}", new Vector3D(1, 2, 3).toString());
    }
}
