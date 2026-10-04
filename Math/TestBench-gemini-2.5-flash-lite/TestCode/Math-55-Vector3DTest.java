package org.apache.commons.math.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.FastMath;
import java.text.NumberFormat; // Added import for NumberFormat
import java.text.FieldPosition; // Added import for FieldPosition
import java.util.Locale; // Added import for Locale

public class Vector3DTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorXYZ() {
        Vector3D v = new Vector3D(1.0, 2.0, 3.0);
        assertEquals(1.0, v.getX(), 1e-15);
        assertEquals(2.0, v.getY(), 1e-15);
        assertEquals(3.0, v.getZ(), 1e-15);
    }

    @Test
    public void testConstructorSpherical() {
        // Test with common angles
        Vector3D v1 = new Vector3D(0, 0); // Should be (1, 0, 0)
        assertEquals(1.0, v1.getX(), 1e-15);
        assertEquals(0.0, v1.getY(), 1e-15);
        assertEquals(0.0, v1.getZ(), 1e-15);

        Vector3D v2 = new Vector3D(FastMath.PI / 2, 0); // Should be (0, 1, 0)
        assertEquals(0.0, v2.getX(), 1e-15);
        assertEquals(1.0, v2.getY(), 1e-15);
        assertEquals(0.0, v2.getZ(), 1e-15);

        Vector3D v3 = new Vector3D(FastMath.PI, 0); // Should be (-1, 0, 0)
        assertEquals(-1.0, v3.getX(), 1e-15);
        assertEquals(0.0, v3.getY(), 1e-15);
        assertEquals(0.0, v3.getZ(), 1e-15);

        Vector3D v4 = new Vector3D(0, FastMath.PI / 2); // Should be (0, 0, 1)
        assertEquals(0.0, v4.getX(), 1e-15);
        assertEquals(0.0, v4.getY(), 1e-15);
        assertEquals(1.0, v4.getZ(), 1e-15);

        Vector3D v5 = new Vector3D(FastMath.PI / 4, FastMath.PI / 4);
        double cosDelta = FastMath.cos(FastMath.PI / 4);
        double expectedX = FastMath.cos(FastMath.PI / 4) * cosDelta;
        double expectedY = FastMath.sin(FastMath.PI / 4) * cosDelta;
        double expectedZ = FastMath.sin(FastMath.PI / 4);
        assertEquals(expectedX, v5.getX(), 1e-15);
        assertEquals(expectedY, v5.getY(), 1e-15);
        assertEquals(expectedZ, v5.getZ(), 1e-15);
    }

    @Test
    public void testConstructorScaleVector() {
        Vector3D u = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v = new Vector3D(2.0, u);
        assertEquals(2.0, v.getX(), 1e-15);
        assertEquals(4.0, v.getY(), 1e-15);
        assertEquals(6.0, v.getZ(), 1e-15);
    }

    @Test
    public void testConstructorLinear2() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D v = new Vector3D(2.0, u1, 3.0, u2);
        assertEquals(2.0, v.getX(), 1e-15);
        assertEquals(3.0, v.getY(), 1e-15);
        assertEquals(0.0, v.getZ(), 1e-15);
    }

    @Test
    public void testConstructorLinear3() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D u3 = new Vector3D(0, 0, 1);
        Vector3D v = new Vector3D(2.0, u1, 3.0, u2, 4.0, u3);
        assertEquals(2.0, v.getX(), 1e-15);
        assertEquals(3.0, v.getY(), 1e-15);
        assertEquals(4.0, v.getZ(), 1e-15);
    }

    @Test
    public void testConstructorLinear4() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D u3 = new Vector3D(0, 0, 1);
        Vector3D u4 = new Vector3D(1, 1, 1);
        Vector3D v = new Vector3D(1.0, u1, 2.0, u2, 3.0, u3, 4.0, u4);
        assertEquals(1.0 + 4.0, v.getX(), 1e-15);
        assertEquals(2.0 + 4.0, v.getY(), 1e-15);
        assertEquals(3.0 + 4.0, v.getZ(), 1e-15);
    }

    @Test
    public void testGetters() {
        Vector3D v = new Vector3D(5.0, -2.0, 1.5);
        assertEquals(5.0, v.getX(), 1e-15);
        assertEquals(-2.0, v.getY(), 1e-15);
        assertEquals(1.5, v.getZ(), 1e-15);
    }

    @Test
    public void testNorm1() {
        Vector3D v = new Vector3D(1.0, -2.0, 3.0);
        assertEquals(1.0 + 2.0 + 3.0, v.getNorm1(), 1e-15);
    }

    @Test
    public void testNorm() {
        Vector3D v = new Vector3D(1.0, 2.0, 2.0); // 3-4-5 triangle scaled
        assertEquals(3.0, v.getNorm(), 1e-15);
    }

    @Test
    public void testNormSq() {
        Vector3D v = new Vector3D(1.0, 2.0, 3.0);
        assertEquals(1.0 * 1.0 + 2.0 * 2.0 + 3.0 * 3.0, v.getNormSq(), 1e-15);
    }

    @Test
    public void testNormInf() {
        Vector3D v = new Vector3D(1.0, -3.0, 2.0);
        assertEquals(3.0, v.getNormInf(), 1e-15);
    }

    @Test
    public void testAlpha() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0); // +X
        assertEquals(0.0, v1.getAlpha(), 1e-15);

        Vector3D v2 = new Vector3D(0.0, 1.0, 0.0); // +Y
        assertEquals(FastMath.PI / 2.0, v2.getAlpha(), 1e-15);

        Vector3D v3 = new Vector3D(-1.0, 0.0, 0.0); // -X
        assertEquals(FastMath.PI, v3.getAlpha(), 1e-15);

        Vector3D v4 = new Vector3D(0.0, -1.0, 0.0); // -Y
        assertEquals(-FastMath.PI / 2.0, v4.getAlpha(), 1e-15);

        Vector3D v5 = new Vector3D(1.0, 1.0, 0.0);
        assertEquals(FastMath.PI / 4.0, v5.getAlpha(), 1e-15);
    }

    @Test
    public void testDelta() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0); // XY plane
        assertEquals(0.0, v1.getDelta(), 1e-15);

        Vector3D v2 = new Vector3D(0.0, 0.0, 1.0); // +Z
        assertEquals(FastMath.PI / 2.0, v2.getDelta(), 1e-15);

        Vector3D v3 = new Vector3D(0.0, 0.0, -1.0); // -Z
        assertEquals(-FastMath.PI / 2.0, v3.getDelta(), 1e-15);

        Vector3D v4 = new Vector3D(1.0, 0.0, 1.0);
        double norm = FastMath.sqrt(2.0);
        assertEquals(FastMath.asin(1.0 / norm), v4.getDelta(), 1e-15);
    }

    @Test
    public void testAdd() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D sum = v1.add(v2);
        assertEquals(5.0, sum.getX(), 1e-15);
        assertEquals(7.0, sum.getY(), 1e-15);
        assertEquals(9.0, sum.getZ(), 1e-15);
    }

    @Test
    public void testAddScaled() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D sum = v1.add(2.0, v2);
        assertEquals(1.0 + 2.0 * 4.0, sum.getX(), 1e-15);
        assertEquals(2.0 + 2.0 * 5.0, sum.getY(), 1e-15);
        assertEquals(3.0 + 2.0 * 6.0, sum.getZ(), 1e-15);
    }

    @Test
    public void testSubtract() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D diff = v1.subtract(v2);
        assertEquals(-3.0, diff.getX(), 1e-15);
        assertEquals(-3.0, diff.getY(), 1e-15);
        assertEquals(-3.0, diff.getZ(), 1e-15);
    }

    @Test
    public void testSubtractScaled() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D diff = v1.subtract(2.0, v2);
        assertEquals(1.0 - 2.0 * 4.0, diff.getX(), 1e-15);
        assertEquals(2.0 - 2.0 * 5.0, diff.getY(), 1e-15);
        assertEquals(3.0 - 2.0 * 6.0, diff.getZ(), 1e-15);
    }

    @Test
    public void testNormalize() {
        Vector3D v = new Vector3D(3.0, 4.0, 0.0);
        Vector3D normalized = v.normalize();
        assertEquals(3.0 / 5.0, normalized.getX(), 1e-15);
        assertEquals(4.0 / 5.0, normalized.getY(), 1e-15);
        assertEquals(0.0, normalized.getZ(), 1e-15);
        assertEquals(1.0, normalized.getNorm(), 1e-15);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeZeroVector() {
        Vector3D.ZERO.normalize();
    }

    @Test
    public void testOrthogonal() {
        Vector3D v = new Vector3D(3.0, 4.0, 5.0);
        Vector3D ortho = v.orthogonal();
        // Check if it's orthogonal to v
        assertEquals(0.0, Vector3D.dotProduct(v, ortho), 1e-15);
        // Check if it's normalized
        assertEquals(1.0, ortho.getNorm(), 1e-15);

        // Test a case where x is small
        Vector3D vSmallX = new Vector3D(1e-10, 1.0, 0.0);
        Vector3D orthoSmallX = vSmallX.orthogonal();
        assertEquals(0.0, Vector3D.dotProduct(vSmallX, orthoSmallX), 1e-15);
        assertEquals(1.0, orthoSmallX.getNorm(), 1e-15);

        // Test a case where y is small
        Vector3D vSmallY = new Vector3D(1.0, 1e-10, 0.0);
        Vector3D orthoSmallY = vSmallY.orthogonal();
        assertEquals(0.0, Vector3D.dotProduct(vSmallY, orthoSmallY), 1e-15);
        assertEquals(1.0, orthoSmallY.getNorm(), 1e-15);

        // Test a case where z is small
        Vector3D vSmallZ = new Vector3D(1.0, 0.0, 1e-10);
        Vector3D orthoSmallZ = vSmallZ.orthogonal();
        assertEquals(0.0, Vector3D.dotProduct(vSmallZ, orthoSmallZ), 1e-15);
        assertEquals(1.0, orthoSmallZ.getNorm(), 1e-15);
    }

    @Test(expected = MathArithmeticException.class)
    public void testOrthogonalZeroVector() {
        Vector3D.ZERO.orthogonal();
    }

    @Test
    public void testAngle() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v2 = new Vector3D(0.0, 1.0, 0.0);
        assertEquals(FastMath.PI / 2.0, Vector3D.angle(v1, v2), 1e-15);

        Vector3D v3 = new Vector3D(1.0, 1.0, 0.0);
        Vector3D v4 = new Vector3D(1.0, 0.0, 0.0);
        assertEquals(FastMath.PI / 4.0, Vector3D.angle(v3, v4), 1e-15);

        Vector3D v5 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v6 = new Vector3D(1.0, 0.0, 0.0);
        assertEquals(0.0, Vector3D.angle(v5, v6), 1e-15);

        Vector3D v7 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v8 = new Vector3D(-1.0, 0.0, 0.0);
        assertEquals(FastMath.PI, Vector3D.angle(v7, v8), 1e-15);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAngleZeroVector1() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D.angle(Vector3D.ZERO, v1);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAngleZeroVector2() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D.angle(v1, Vector3D.ZERO);
    }

    @Test
    public void testNegate() {
        Vector3D v = new Vector3D(1.0, -2.0, 3.0);
        Vector3D negated = v.negate();
        assertEquals(-1.0, negated.getX(), 1e-15);
        assertEquals(2.0, negated.getY(), 1e-15);
        assertEquals(-3.0, negated.getZ(), 1e-15);
    }

    @Test
    public void testScalarMultiply() {
        Vector3D v = new Vector3D(1.0, 2.0, 3.0);
        Vector3D scaled = v.scalarMultiply(2.0);
        assertEquals(2.0, scaled.getX(), 1e-15);
        assertEquals(4.0, scaled.getY(), 1e-15);
        assertEquals(6.0, scaled.getZ(), 1e-15);
    }

    @Test
    public void testIsNaN() {
        assertTrue(Vector3D.NaN.isNaN());
        assertFalse(Vector3D.ZERO.isNaN());
        assertFalse(new Vector3D(1.0, 2.0, 3.0).isNaN());
        assertTrue(new Vector3D(Double.NaN, 1.0, 2.0).isNaN());
        assertTrue(new Vector3D(1.0, Double.NaN, 2.0).isNaN());
        assertTrue(new Vector3D(1.0, 2.0, Double.NaN).isNaN());
    }

    @Test
    public void testIsInfinite() {
        // The isInfinite() method checks for infinity *and* ensures no NaN is present.
        // A vector with only infinities is infinite.
        assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
        assertTrue(Vector3D.NEGATIVE_INFINITY.isInfinite());
        // A vector with mixed finite and infinite values is infinite.
        assertTrue(new Vector3D(Double.POSITIVE_INFINITY, 1.0, 2.0).isInfinite());
        assertTrue(new Vector3D(1.0, Double.POSITIVE_INFINITY, 2.0).isInfinite());
        assertTrue(new Vector3D(1.0, 2.0, Double.POSITIVE_INFINITY).isInfinite());
        // A vector with NaN is not infinite, even if it also has infinity.
        assertFalse(new Vector3D(Double.NaN, Double.POSITIVE_INFINITY, 2.0).isInfinite());
        assertFalse(new Vector3D(Double.POSITIVE_INFINITY, Double.NaN, 2.0).isInfinite());
        assertFalse(new Vector3D(Double.POSITIVE_INFINITY, 2.0, Double.NaN).isInfinite());
        assertFalse(Vector3D.ZERO.isInfinite());
        assertFalse(new Vector3D(1.0, 2.0, 3.0).isInfinite());
    }

    @Test
    public void testEquals() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v3 = new Vector3D(1.0, 2.0, 4.0);

        assertTrue(v1.equals(v2));
        assertFalse(v1.equals(v3));
        assertFalse(v1.equals(null));
        assertFalse(v1.equals(new Object()));
        assertTrue(Vector3D.NaN.equals(Vector3D.NaN));
        assertTrue(Vector3D.NaN.equals(new Vector3D(Double.NaN, Double.NaN, Double.NaN)));
        assertFalse(Vector3D.NaN.equals(Vector3D.ZERO));
    }

    @Test
    public void testHashCode() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v3 = new Vector3D(1.0, 2.0, 4.0);

        assertEquals(v1.hashCode(), v2.hashCode());
        assertNotEquals(v1.hashCode(), v3.hashCode());
        assertEquals(Vector3D.NaN.hashCode(), new Vector3D(Double.NaN, Double.NaN, Double.NaN).hashCode());
        assertEquals(8, Vector3D.NaN.hashCode()); // Explicitly check NaN hash code
    }

    @Test
    public void testDotProduct() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        assertEquals(1.0 * 4.0 + 2.0 * 5.0 + 3.0 * 6.0, Vector3D.dotProduct(v1, v2), 1e-15);
    }

    @Test
    public void testCrossProduct() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0); // I
        Vector3D v2 = new Vector3D(0.0, 1.0, 0.0); // J
        Vector3D cross = Vector3D.crossProduct(v1, v2);
        assertEquals(0.0, cross.getX(), 1e-15);
        assertEquals(0.0, cross.getY(), 1e-15);
        assertEquals(1.0, cross.getZ(), 1e-15); // K

        // Test J x I = -K
        cross = Vector3D.crossProduct(v2, v1);
        assertEquals(0.0, cross.getX(), 1e-15);
        assertEquals(0.0, cross.getY(), 1e-15);
        assertEquals(-1.0, cross.getZ(), 1e-15);

        // Test with non-canonical vectors
        Vector3D v3 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v4 = new Vector3D(4.0, 5.0, 6.0);
        // Expected cross product:
        // (2*6 - 3*5)i - (1*6 - 3*4)j + (1*5 - 2*4)k
        // (12 - 15)i - (6 - 12)j + (5 - 8)k
        // -3i + 6j - 3k
        cross = Vector3D.crossProduct(v3, v4);
        assertEquals(-3.0, cross.getX(), 1e-15);
        assertEquals(6.0, cross.getY(), 1e-15);
        assertEquals(-3.0, cross.getZ(), 1e-15);
    }

    @Test
    public void testCrossProductZero() {
        // Cross product with zero vector should be zero vector
        assertEquals(Vector3D.ZERO, Vector3D.crossProduct(Vector3D.PLUS_I, Vector3D.ZERO));
        assertEquals(Vector3D.ZERO, Vector3D.crossProduct(Vector3D.ZERO, Vector3D.PLUS_I));
        assertEquals(Vector3D.ZERO, Vector3D.crossProduct(Vector3D.ZERO, Vector3D.ZERO));
    }

    @Test
    public void testDistance1() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        assertEquals(FastMath.abs(4.0 - 1.0) + FastMath.abs(5.0 - 2.0) + FastMath.abs(6.0 - 3.0), Vector3D.distance1(v1, v2), 1e-15);
    }

    @Test
    public void testDistance() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        double dx = 4.0 - 1.0;
        double dy = 5.0 - 2.0;
        double dz = 6.0 - 3.0;
        assertEquals(FastMath.sqrt(dx * dx + dy * dy + dz * dz), Vector3D.distance(v1, v2), 1e-15);
    }

    @Test
    public void testDistanceInf() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        assertEquals(FastMath.max(FastMath.abs(4.0 - 1.0), FastMath.max(FastMath.abs(5.0 - 2.0), FastMath.abs(6.0 - 3.0))), Vector3D.distanceInf(v1, v2), 1e-15);
    }

    @Test
    public void testDistanceSq() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);
        double dx = 4.0 - 1.0;
        double dy = 5.0 - 2.0;
        double dz = 6.0 - 3.0;
        assertEquals(dx * dx + dy * dy + dz * dz, Vector3D.distanceSq(v1, v2), 1e-15);
    }

    @Test
    public void testToString() {
        // Vector3D.DEFAULT_FORMAT uses a specific format. We need to replicate it for assertion.
        Vector3DFormat formatter = Vector3DFormat.getInstance(Locale.US); // Use a fixed locale for consistency
        Vector3D v = new Vector3D(1.23, 4.56, 7.89);
        assertEquals("(1.23, 4.56, 7.89)", formatter.format(v));

        Vector3D v2 = new Vector3D(1.0, 2.0, 3.0);
        assertEquals("(1.0, 2.0, 3.0)", formatter.format(v2));
    }

    @Test
    public void testToStringZero() {
        Vector3DFormat formatter = Vector3DFormat.getInstance(Locale.US);
        String s = Vector3D.ZERO.toString();
        assertEquals("(0.0, 0.0, 0.0)", formatter.format(Vector3D.ZERO));
    }

    @Test
    public void testToStringNaN() {
        Vector3DFormat formatter = Vector3DFormat.getInstance(Locale.US);
        String s = Vector3D.NaN.toString();
        assertEquals("(NaN, NaN, NaN)", formatter.format(Vector3D.NaN));
    }
}
