```java
package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator;
import org.apache.commons.math.util.FastMath;

public class OpenMapRealVectorTest {

    @Test
    public void testConstructorArray() throws Exception {
        double[] values = {1.0, 0.0, 3.0};
        OpenMapRealVector vector = new OpenMapRealVector(values);
        assertEquals(1.0, vector.getEntry(0), 1e-9);
        assertEquals(0.0, vector.getEntry(1), 1e-9);
        assertEquals(3.0, vector.getEntry(2), 1e-9);
        assertEquals(3, vector.getDimension());
        assertEquals(2, vector.entries.size()); // Accessing package-private field
    }

    @Test
    public void testConstructorArrayDouble() throws Exception {
        double[] values = {1.0, 0.0, 3.0};
        OpenMapRealVector vector = new OpenMapRealVector(values, 1e-5);
        assertEquals(1.0, vector.getEntry(0), 1e-9);
        assertEquals(0.0, vector.getEntry(1), 1e-9);
        assertEquals(3.0, vector.getEntry(2), 1e-9);
        assertEquals(3, vector.getDimension());
        assertEquals(2, vector.entries.size()); // Accessing package-private field
    }

    @Test
    public void testConstructorNullArray() {
        try {
            new OpenMapRealVector((double[]) null);
            fail("Expected NullArgumentException");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorEmptyArray() throws Exception {
        double[] values = {};
        OpenMapRealVector vector = new OpenMapRealVector(values);
        assertEquals(0, vector.getDimension());
        assertEquals(0, vector.entries.size()); // Accessing package-private field
    }

    @Test
    public void testConstructorDoubleArray() throws Exception {
        Double[] values = {1.0, null, 3.0};
        OpenMapRealVector vector = new OpenMapRealVector(values);
        assertEquals(1.0, vector.getEntry(0), 1e-9);
        assertEquals(0.0, vector.getEntry(1), 1e-9); // null entry becomes 0.0
        assertEquals(3.0, vector.getEntry(2), 1e-9);
        assertEquals(3, vector.getDimension());
        assertEquals(2, vector.entries.size()); // Accessing package-private field
    }

    @Test
    public void testConstructorDoubleArrayDouble() throws Exception {
        Double[] values = {1.0, null, 3.0};
        OpenMapRealVector vector = new OpenMapRealVector(values, 1e-5);
        assertEquals(1.0, vector.getEntry(0), 1e-9);
        assertEquals(0.0, vector.getEntry(1), 1e-9); // null entry becomes 0.0
        assertEquals(3.0, vector.getEntry(2), 1e-9);
        assertEquals(3, vector.getDimension());
        assertEquals(2, vector.entries.size()); // Accessing package-private field
    }

    @Test
    public void testConstructorNullDoubleArray() {
        try {
            new OpenMapRealVector((Double[]) null);
            fail("Expected NullArgumentException");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorEmptyDoubleArray() throws Exception {
        Double[] values = {};
        OpenMapRealVector vector = new OpenMapRealVector(values);
        assertEquals(0, vector.getDimension());
        assertEquals(0, vector.entries.size()); // Accessing package-private field
    }


    @Test
    public void testAdd() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector result = v1.add(v2);
        assertTrue(result instanceof OpenMapRealVector);
        assertEquals(5.0, result.getEntry(0), 1e-9);
        assertEquals(7.0, result.getEntry(1), 1e-9);
        assertEquals(9.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testAddWithZeroTolerance() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0}, 1e-15);
        RealVector result = v1.add(v2);
        assertTrue(result instanceof OpenMapRealVector);
        assertEquals(1.0, result.getEntry(0), 1e-9);
        assertEquals(5.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testSubtract() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        OpenMapRealVector result = v1.subtract(v2);
        assertEquals(-3.0, result.getEntry(0), 1e-9);
        assertEquals(-3.0, result.getEntry(1), 1e-9);
        assertEquals(-3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testSubtractWithZeroTolerance() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0}, 1e-15);
        OpenMapRealVector result = v1.subtract(v2);
        assertEquals(1.0, result.getEntry(0), 1e-9);
        assertEquals(-5.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testDotProduct() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        assertEquals(4.0 + 10.0 + 18.0, v1.dotProduct(v2), 1e-9);
    }

    @Test
    public void testDotProductWithZero() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 0.0});
        assertEquals(4.0, v1.dotProduct(v2), 1e-9);
    }

    @Test
    public void testDotProductWithZeroTolerance() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 0.0}, 1e-15);
        assertEquals(4.0, v1.dotProduct(v2), 1e-9);
    }

    @Test
    public void testEbeMultiply() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        OpenMapRealVector result = v1.ebeMultiply(v2);
        assertEquals(4.0, result.getEntry(0), 1e-9);
        assertEquals(10.0, result.getEntry(1), 1e-9);
        assertEquals(18.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testEbeMultiplyWithZero() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 0.0});
        OpenMapRealVector result = v1.ebeMultiply(v2);
        assertEquals(4.0, result.getEntry(0), 1e-9);
        assertEquals(0.0, result.getEntry(1), 1e-9);
        assertEquals(0.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testEbeDivide() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{4.0, 10.0, 18.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 5.0, 6.0});
        OpenMapRealVector result = v1.ebeDivide(v2);
        assertEquals(2.0, result.getEntry(0), 1e-9);
        assertEquals(2.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testEbeDivideByZero() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{4.0, 10.0, 18.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{2.0, 0.0, 6.0});
        OpenMapRealVector result = v1.ebeDivide(v2);
        assertEquals(2.0, result.getEntry(0), 1e-9);
        assertTrue(Double.isInfinite(result.getEntry(1))); // Division by zero
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testGetSubVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        OpenMapRealVector sub = v.getSubVector(1, 3);
        assertEquals(3, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), 1e-9);
        assertEquals(3.0, sub.getEntry(1), 1e-9);
        assertEquals(4.0, sub.getEntry(2), 1e-9);
    }

    @Test
    public void testGetSubVectorOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        try {
            v.getSubVector(0, 4);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            v.getSubVector(3, 1);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testGetData() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        double[] data = v.getData();
        assertArrayEquals(new double[]{1.0, 0.0, 3.0}, data, 1e-9);
    }

    @Test
    public void testGetDimension() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertEquals(3, v.getDimension());
        OpenMapRealVector empty = new OpenMapRealVector(0);
        assertEquals(0, empty.getDimension());
    }

    @Test
    public void testGetDistance() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        // sqrt((4-1)^2 + (5-2)^2 + (6-3)^2) = sqrt(9 + 9 + 9) = sqrt(27)
        assertEquals(FastMath.sqrt(27.0), v1.getDistance(v2), 1e-9);
    }

    @Test
    public void testGetDistanceWithZeros() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        // sqrt((0-1)^2 + (5-0)^2 + (0-3)^2) = sqrt(1 + 25 + 9) = sqrt(35)
        assertEquals(FastMath.sqrt(35.0), v1.getDistance(v2), 1e-9);
    }

    @Test
    public void testGetEntry() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(0.0, v.getEntry(3), 1e-9); // Out of bounds, default is 0
    }

    @Test
    public void testGetEntryOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        try {
            v.getEntry(-1);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            v.getEntry(3); // Dimension is 3, so index 3 is out of bounds
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }


    @Test
    public void testGetL1Distance() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        assertEquals(3.0 + 3.0 + 3.0, v1.getL1Distance(v2), 1e-9);
    }

    @Test
    public void testGetL1DistanceWithZeros() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        assertEquals(1.0 + 5.0 + 3.0, v1.getL1Distance(v2), 1e-9);
    }

    @Test
    public void testGetLInfDistance() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        assertEquals(3.0, v1.getLInfDistance(v2), 1e-9);
    }

    @Test
    public void testGetLInfDistanceWithZeros() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        assertEquals(5.0, v1.getLInfDistance(v2), 1e-9);
    }

    @Test
    public void testIsInfinite() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, Double.POSITIVE_INFINITY, 3.0});
        assertTrue(v1.isInfinite());
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertFalse(v2.isInfinite());
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, Double.NaN, 3.0});
        assertFalse(v3.isInfinite()); // NaN is not infinite
    }

    @Test
    public void testIsNaN() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, Double.NaN, 3.0});
        assertTrue(v1.isNaN());
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertFalse(v2.isNaN());
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, Double.POSITIVE_INFINITY, 3.0});
        assertFalse(v3.isNaN()); // Infinite is not NaN
    }

    @Test
    public void testMapAdd() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector result = v.mapAdd(5.0);
        assertTrue(result instanceof OpenMapRealVector);
        assertEquals(6.0, result.getEntry(0), 1e-9);
        assertEquals(7.0, result.getEntry(1), 1e-9);
        assertEquals(8.0, result.getEntry(2), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9); // Original vector unchanged
    }

    @Test
    public void testMapAddToSelf() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        v.mapAddToSelf(5.0);
        assertEquals(6.0, v.getEntry(0), 1e-9);
        assertEquals(7.0, v.getEntry(1), 1e-9);
        assertEquals(8.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testOuterProduct() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        double[] v2 = {3.0, 4.0, 5.0};
        RealMatrix result = v1.outerProduct(v2);
        assertEquals(2, result.getRowDimension());
        assertEquals(3, result.getColumnDimension());
        assertEquals(3.0, result.getEntry(0, 0), 1e-9);
        assertEquals(4.0, result.getEntry(0, 1), 1e-9);
        assertEquals(5.0, result.getEntry(0, 2), 1e-9);
        assertEquals(6.0, result.getEntry(1, 0), 1e-9);
        assertEquals(8.0, result.getEntry(1, 1), 1e-9);
        assertEquals(10.0, result.getEntry(1, 2), 1e-9);
    }

    @Test
    public void testProjection() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        // Projection of v1 onto v2
        // dot(v1, v2) = 4 + 10 + 18 = 32
        // dot(v2, v2) = 16 + 25 + 36 = 77
        // scalar = 32 / 77
        // projection = scalar * v2
        double scalar = 32.0 / 77.0;
        RealVector proj = v1.projection(v2);
        assertEquals(scalar * 4.0, proj.getEntry(0), 1e-9);
        assertEquals(scalar * 5.0, proj.getEntry(1), 1e-9);
        assertEquals(scalar * 6.0, proj.getEntry(2), 1e-9);
    }

    @Test
    public void testSetEntry() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, 1.0);
        v.setEntry(1, 2.0);
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(0.0, v.getEntry(2), 1e-9);
        assertEquals(2, v.entries.size()); // Accessing package-private field
    }

    @Test
    public void testSetEntryToZero() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        v.setEntry(1, 0.0);
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(0.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
        assertEquals(2, v.entries.size()); // entry 1 should be removed
    }

    @Test
    public void testSetEntryToNearZero() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        v.setEntry(1, 1e-15); // below default tolerance
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(0.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
        assertEquals(2, v.entries.size()); // entry 1 should be removed
    }

    @Test
    public void testSetEntryOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        try {
            v.setEntry(-1, 5.0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            v.setEntry(2, 5.0); // Dimension is 2, so index 2 is out of bounds
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testSetSubVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        OpenMapRealVector sub = new OpenMapRealVector(new double[]{10.0, 20.0});
        v.setSubVector(1, sub);
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(10.0, v.getEntry(1), 1e-9);
        assertEquals(20.0, v.getEntry(2), 1e-9);
        assertEquals(4.0, v.getEntry(3), 1e-9);
        assertEquals(5.0, v.getEntry(4), 1e-9);
    }

    @Test
    public void testSetSubVectorOutOfBounds() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector sub = new OpenMapRealVector(new double[]{10.0, 20.0});
        try {
            v.setSubVector(-1, sub);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
        try {
            v.setSubVector(2, sub); // would write to index 3 and 4, which are out of bounds
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testSet() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        v.set(5.0);
        assertEquals(5.0, v.getEntry(0), 1e-9);
        assertEquals(5.0, v.getEntry(1), 1e-9);
        assertEquals(5.0, v.getEntry(2), 1e-9);
        assertEquals(3, v.entries.size()); // Accessing package-private field
    }

    @Test
    public void testSetToZero() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        v.set(0.0);
        assertEquals(0.0, v.getEntry(0), 1e-9);
        assertEquals(0.0, v.getEntry(1), 1e-9);
        assertEquals(0.0, v.getEntry(2), 1e-9);
        assertEquals(0, v.entries.size()); // All entries should be removed
    }

    @Test
    public void testUnitVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        RealVector unit = v.unitVector();
        // norm = sqrt(3^2 + 4^2) = sqrt(9 + 16) = sqrt(25) = 5
        assertEquals(3.0 / 5.0, unit.getEntry(0), 1e-9);
        assertEquals(4.0 / 5.0, unit.getEntry(1), 1e-9);
    }

    @Test
    public void testUnitize() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        v.unitize();
        // norm = sqrt(3^2 + 4^2) = sqrt(9 + 16) = sqrt(25) = 5
        assertEquals(3.0 / 5.0, v.getEntry(0), 1e-9);
        assertEquals(4.0 / 5.0, v.getEntry(1), 1e-9);
    }

    @Test
    public void testUnitizeZeroNorm() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 0.0});
        try {
            v.unitize();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // Expected
            assertEquals(LocalizedFormats.ZERO_NORM, e.getPattern());
        }
    }

    @Test
    public void testToArray() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        double[] data = v.toArray();
        assertArrayEquals(new double[]{1.0, 0.0, 3.0}, data, 1e-9);
    }

    @Test
    public void testHashCode() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertEquals(v1.hashCode(), v2.hashCode());

        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 3.0}); // Different dimension implicitly
        assertNotEquals(v3.hashCode(), v4.hashCode()); // Should be different if dimensions differ

        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0}, 1e-15);
        assertNotEquals(v1.hashCode(), v5.hashCode()); // Different epsilon
    }

    @Test
    public void testEquals() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertTrue(v1.equals(v2));

        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0, 0.0}); // Same values, different dimension
        assertFalse(v1.equals(v3));

        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 2.0, 4.0});
        assertFalse(v1.equals(v4));

        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0}, 1e-15); // Different epsilon
        assertFalse(v1.equals(v5));

        OpenMapRealVector v6 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0}); // Same as v1
        assertTrue(v1.equals(v6));

        OpenMapRealVector v7 = new OpenMapRealVector(new double[]{1.0, Double.NaN, 3.0});
        OpenMapRealVector v8 = new OpenMapRealVector(new double[]{1.0, Double.NaN, 3.0});
        assertTrue(v7.equals(v8)); // NaN equals NaN in this context

        OpenMapRealVector v9 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertFalse(v1.equals(null));
        assertFalse(v1.equals("not a vector"));
    }

    @Test
    public void testGetSparsity() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0, 0.0, 5.0}); // 3 non-zero, dimension 5
        assertEquals(3.0 / 5.0, v1.getSparsity(), 1e-9);
        OpenMapRealVector v2 = new OpenMapRealVector(5); // all zeros
        assertEquals(0.0 / 5.0, v2.getSparsity(), 1e-9);
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0}); // no zeros
        assertEquals(3.0 / 3.0, v3.getSparsity(), 1e-9);
        OpenMapRealVector v4 = new OpenMapRealVector(0); // zero dimension
        assertEquals(Double.NaN, v4.getSparsity()); // 0/0 is NaN
    }

    @Test
    public void testSparseIterator() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 1.0, 0.0, 3.0, 0.0});
        java.util.Iterator<RealVector.Entry> iter = v.sparseIterator();
        assertTrue(iter.hasNext());
        RealVector.Entry entry = iter.next();
        assertEquals(1.0, entry.getValue(), 1e-9);
        assertEquals(1, entry.getIndex());

        assertTrue(iter.hasNext());
        entry = iter.next();
        assertEquals(3.0, entry.getValue(), 1e-9);
        assertEquals(3, entry.getIndex());

        assertFalse(iter.hasNext());
    }

    @Test
    public void testSparseIteratorEmpty() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        java.util.Iterator<RealVector.Entry> iter = v.sparseIterator();
        assertFalse(iter.hasNext());
    }

    @Test
    public void testSparseIteratorModify() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        java.util.Iterator<RealVector.Entry> iter = v.sparseIterator();
        iter.next(); // advances to first entry (index 0, value 1.0)
        RealVector.Entry entry = iter.next(); // advances to second entry (index 1, value 2.0)
        entry.setValue(20.0);
        assertEquals(20.0, v.getEntry(1), 1e-9);
        assertEquals(3, v.entries.size()); // Should still have 3 entries
    }

    @Test
    public void testSparseIteratorRemove() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        java.util.Iterator<RealVector.Entry> iter = v.sparseIterator();
        try {
            iter.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testCopy() throws Exception {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = v1.copy();
        assertNotSame(v1, v2);
        assertEquals(v1.getDimension(), v2.getDimension());
        assertEquals(v1.epsilon, v2.epsilon, 1e-9); // Accessing package-private field
        assertEquals(v1.entries.size(), v2.entries.size()); // Accessing package-private field
        // Check entries manually
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(2.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
    }

    @Test
    public void testAppendDouble() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = v1.append(3.0);
        assertEquals(3, v2.getDimension());
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(2.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
    }

    @Test
    public void testAppendDoubleArray() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        double[] a = {3.0, 4.0};
        OpenMapRealVector v2 = v1.append(a);
        assertEquals(4, v2.getDimension());
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(2.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
        assertEquals(4.0, v2.getEntry(3), 1e-9);
    }

    @Test
    public void testAppendOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{3.0, 4.0, 5.0});
        OpenMapRealVector v3 = v1.append(v2);
        assertEquals(5, v3.getDimension());
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
        assertEquals(4.0, v3.getEntry(3), 1e-9);
        assertEquals(5.0, v3.getEntry(4), 1e-9);
    }

    // Added a test for constructor with dimension and epsilon
    @Test
    public void testConstructorDimensionEpsilon() {
        OpenMapRealVector v = new OpenMapRealVector(5, 1e-10);
        assertEquals(5, v.getDimension());
        assertEquals(1e-10, v.epsilon, 1e-12); // Accessing package-private field
        for (int i = 0; i < 5; i++) {
            assertEquals(0.0, v.getEntry(i), 1e-9);
        }
    }

    // Added a test for constructor with dimension, expected size, and epsilon
    @Test
    public void testConstructorDimensionExpectedSizeEpsilon() {
        OpenMapRealVector v = new OpenMapRealVector(10, 5, 1e-10);
        assertEquals(10, v.getDimension());
        assertEquals(1e-10, v.epsilon, 1e-12); // Accessing package-private field
        assertEquals(0, v.entries.size()); // Expected size is for map capacity, not actual elements initially.
        for (int i = 0; i < 10; i++) {
            assertEquals(0.0, v.getEntry(i), 1e-9);
        }
    }

    // Added a test for constructor with OpenMapRealVector copy
    @Test
    public void testConstructorOpenMapRealVectorCopy() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(v1);
        assertNotSame(v1, v2);
        assertEquals(v1.getDimension(), v2.getDimension());
        assertEquals(v1.epsilon, v2.epsilon, 1e-9); // Accessing package-private field
        assertEquals(v1.entries.size(), v2.entries.size()); // Accessing package-private field
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(0.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
    }

    // Added a test for constructor with RealVector
    @Test
    public void testConstructorRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v3 = new OpenMapRealVector(v2);
        assertEquals(v1.getDimension(), v3.getDimension());
        assertEquals(v1.epsilon, v3.epsilon, 1e-9); // Accessing package-private field
        assertEquals(v1.entries.size(), v3.entries.size()); // Accessing package-private field
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
    }
}
```