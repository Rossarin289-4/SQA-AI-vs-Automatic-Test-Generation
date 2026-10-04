package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.linear.RealVector.Entry;

public class OpenMapRealVectorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorWithDimensionAndEpsilon() {
        OpenMapRealVector vector = new OpenMapRealVector(5, 1e-5);
        assertEquals(5, vector.getDimension());
        // Epsilon is implicitly tested by behavior of isDefaultValue.
        // We can test that entries is initially empty using toArray.
        assertEquals(0.0, vector.getEntry(0), 1e-15);
        assertEquals(0.0, vector.getEntry(4), 1e-15);
    }

    @Test
    public void testConstructorWithZeroSize() {
        OpenMapRealVector v = new OpenMapRealVector(0);
        assertEquals(0, v.getDimension());
        // Default epsilon is used.
        // Accessing an index of a zero-sized vector should throw an exception.
        try {
            v.getEntry(0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorWithZeroSizeAndEpsilon() {
        OpenMapRealVector v = new OpenMapRealVector(0, 1e-5);
        assertEquals(0, v.getDimension());
        // Epsilon is part of the object's state, implicitly tested by behavior.
        // Accessing an index of a zero-sized vector should throw an exception.
        try {
            v.getEntry(0);
            fail("Expected OutOfRangeException");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected
        }
    }


    @Test
    public void testAddOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        OpenMapRealVector sum = v1.add(v2);
        assertEquals(3, sum.getDimension());
        assertEquals(1.0 + 4.0, sum.getEntry(0), 1e-15);
        assertEquals(2.0 + 5.0, sum.getEntry(1), 1e-15);
        assertEquals(3.0 + 6.0, sum.getEntry(2), 1e-15);
    }


    @Test
    public void testAppendOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector appended = v1.append(v2);
        assertEquals(4, appended.getDimension());
        assertEquals(1.0, appended.getEntry(0), 1e-15);
        assertEquals(2.0, appended.getEntry(1), 1e-15);
        assertEquals(3.0, appended.getEntry(2), 1e-15);
        assertEquals(4.0, appended.getEntry(3), 1e-15);
    }

    @Test
    public void testAppendDouble() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector appended = v1.append(3.0);
        assertEquals(3, appended.getDimension());
        assertEquals(1.0, appended.getEntry(0), 1e-15);
        assertEquals(2.0, appended.getEntry(1), 1e-15);
        assertEquals(3.0, appended.getEntry(2), 1e-15);
    }


    @Test
    public void testDotProductOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
        double dot = v1.dotProduct(v2);
        assertEquals(1.0 * 4.0 + 2.0 * 5.0 + 3.0 * 6.0, dot, 1e-15);
    }

    @Test
    public void testDotProductOpenMapRealVectorWithZeros() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 0.0});
        double dot = v1.dotProduct(v2);
        assertEquals(1.0 * 4.0 + 0.0 * 5.0 + 3.0 * 0.0, dot, 1e-15);
    }

    @Test
    public void testEbeDivide() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        // No concrete subclasses of RealVector are provided. We can only use OpenMapRealVector.
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.5, 1.0, 2.0});
        OpenMapRealVector result = v1.ebeDivide(v2);
        assertEquals(3, result.getDimension());
        assertEquals(1.0 / 0.5, result.getEntry(0), 1e-15);
        assertEquals(2.0 / 1.0, result.getEntry(1), 1e-15);
        assertEquals(3.0 / 2.0, result.getEntry(2), 1e-15);
    }

    @Test
    public void testEbeMultiply() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.5, 1.0, 2.0});
        OpenMapRealVector result = v1.ebeMultiply(v2);
        assertEquals(3, result.getDimension());
        assertEquals(1.0 * 0.5, result.getEntry(0), 1e-15);
        assertEquals(2.0 * 1.0, result.getEntry(1), 1e-15);
        assertEquals(3.0 * 2.0, result.getEntry(2), 1e-15);
    }

    @Test
    public void testEbeMultiplyWithZero() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.5, 1.0, 2.0});
        OpenMapRealVector result = v1.ebeMultiply(v2);
        assertEquals(3, result.getDimension());
        assertEquals(1.0 * 0.5, result.getEntry(0), 1e-15);
        assertEquals(0.0 * 1.0, result.getEntry(1), 1e-15); // This should be 0.0
        assertEquals(3.0 * 2.0, result.getEntry(2), 1e-15);
    }

    @Test
    public void testGetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0, 1, 2, 3, 4, 5});
        OpenMapRealVector sub = v.getSubVector(2, 3);
        assertEquals(3, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), 1e-15);
        assertEquals(3.0, sub.getEntry(1), 1e-15);
        assertEquals(4.0, sub.getEntry(2), 1e-15);
    }

    @Test
    public void testGetDimension() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        assertEquals(5, v.getDimension());
    }

    @Test
    public void testGetDistanceOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 6.0});
        double dist = v1.getDistance(v2);
        double expected = FastMath.sqrt(FastMath.pow(1.0 - 4.0, 2) + FastMath.pow(2.0 - 6.0, 2));
        assertEquals(expected, dist, 1e-15);
    }

    @Test
    public void testGetDistanceOpenMapRealVectorWithZeros() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        double dist = v1.getDistance(v2);
        double expected = FastMath.sqrt(FastMath.pow(1.0 - 0.0, 2) + FastMath.pow(0.0 - 5.0, 2) + FastMath.pow(3.0 - 0.0, 2));
        assertEquals(expected, dist, 1e-15);
    }

    @Test
    public void testGetEntry() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 0.0, 4.0});
        assertEquals(1.0, v.getEntry(0), 1e-15);
        assertEquals(0.0, v.getEntry(2), 1e-15);
        assertEquals(4.0, v.getEntry(3), 1e-15);
    }

    @Test
    public void testGetL1DistanceOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 1.0});
        double dist = v1.getL1Distance(v2);
        assertEquals(FastMath.abs(1.0 - 4.0) + FastMath.abs(2.0 - 5.0) + FastMath.abs(3.0 - 1.0), dist, 1e-15);
    }

    @Test
    public void testGetL1DistanceOpenMapRealVectorWithZeros() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{0.0, 5.0, 0.0});
        double dist = v1.getL1Distance(v2);
        assertEquals(FastMath.abs(1.0 - 0.0) + FastMath.abs(0.0 - 5.0) + FastMath.abs(3.0 - 0.0), dist, 1e-15);
    }

    @Test
    public void testGetLInfDistance() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        // No concrete subclasses of RealVector are provided. We can only use OpenMapRealVector.
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 1.0, 5.0});
        double dist = v1.getLInfDistance(v2);
        assertEquals(FastMath.max(FastMath.abs(1.0 - 4.0), FastMath.max(FastMath.abs(2.0 - 1.0), FastMath.abs(3.0 - 5.0))), dist, 1e-15);
    }

    @Test
    public void testIsInfinite() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, Double.POSITIVE_INFINITY});
        assertTrue(v1.isInfinite());
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, Double.NaN});
        assertFalse(v2.isInfinite());
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertFalse(v3.isInfinite());
    }

    @Test
    public void testIsNaN() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, Double.NaN, 3.0});
        assertTrue(v1.isNaN());
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, Double.POSITIVE_INFINITY});
        assertFalse(v2.isNaN());
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertFalse(v3.isNaN());
    }

    @Test
    public void testMapAdd() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector mapped = v.mapAdd(5.0);
        assertEquals(6.0, mapped.getEntry(0), 1e-15);
        assertEquals(7.0, mapped.getEntry(1), 1e-15);
        assertEquals(8.0, mapped.getEntry(2), 1e-15);
        assertNotSame(v, mapped); // ensure it's a new vector
    }

    @Test
    public void testMapAddToSelf() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        v.mapAddToSelf(5.0);
        assertEquals(6.0, v.getEntry(0), 1e-15);
        assertEquals(7.0, v.getEntry(1), 1e-15);
        assertEquals(8.0, v.getEntry(2), 1e-15);
    }

    @Test
    public void testProjection() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        // No concrete subclasses of RealVector are provided. We can only use OpenMapRealVector.
        OpenMapRealVector onto = new OpenMapRealVector(new double[]{3.0, 4.0});
        RealVector proj = v.projection(onto);
        double dot_v_onto = v.dotProduct(onto);
        double dot_onto_onto = onto.dotProduct(onto);
        double scalar = dot_v_onto / dot_onto_onto;
        assertEquals(3.0 * scalar, proj.getEntry(0), 1e-15);
        assertEquals(4.0 * scalar, proj.getEntry(1), 1e-15);
    }


    @Test
    public void testSetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        // No concrete subclasses of RealVector are provided. We can only use OpenMapRealVector.
        OpenMapRealVector sub = new OpenMapRealVector(new double[]{1.1, 2.2});
        v.setSubVector(1, sub);
        assertEquals(1.1, v.getEntry(1), 1e-15);
        assertEquals(2.2, v.getEntry(2), 1e-15);
        assertEquals(0.0, v.getEntry(0), 1e-15);
        assertEquals(0.0, v.getEntry(3), 1e-15);
    }

    @Test
    public void testSet() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.set(5.0);
        assertEquals(5.0, v.getEntry(0), 1e-15);
        assertEquals(5.0, v.getEntry(1), 1e-15);
        assertEquals(5.0, v.getEntry(2), 1e-15);
        // For a vector of all same values, OpenMapRealVector may store it efficiently.
        // We can't assert size directly without knowing internal implementation details.
        // The key is that getEntry returns correct values.
    }

    @Test
    public void testSubtractOpenMapRealVector() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{4.0, 1.0, 5.0});
        OpenMapRealVector diff = v1.subtract(v2);
        assertEquals(3, diff.getDimension());
        assertEquals(1.0 - 4.0, diff.getEntry(0), 1e-15);
        assertEquals(2.0 - 1.0, diff.getEntry(1), 1e-15);
        assertEquals(3.0 - 5.0, diff.getEntry(2), 1e-15);
    }


    @Test
    public void testUnitVector() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        RealVector unit = v.unitVector();
        double norm = FastMath.sqrt(3.0 * 3.0 + 4.0 * 4.0);
        assertEquals(3.0 / norm, unit.getEntry(0), 1e-15);
        assertEquals(4.0 / norm, unit.getEntry(1), 1e-15);
    }

    @Test
    public void testUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        v.unitize();
        double norm = FastMath.sqrt(3.0 * 3.0 + 4.0 * 4.0);
        assertEquals(3.0 / norm, v.getEntry(0), 1e-15);
        assertEquals(4.0 / norm, v.getEntry(1), 1e-15);
    }

    @Test
    public void testToArray() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        double[] arr = v.toArray();
        assertEquals(3, arr.length);
        assertEquals(1.0, arr[0], 1e-15);
        assertEquals(0.0, arr[1], 1e-15);
        assertEquals(3.0, arr[2], 1e-15);
    }

    @Test
    public void testHashCode() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertEquals(v1.hashCode(), v2.hashCode());

        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0}, 1e-10);
        assertNotEquals(v1.hashCode(), v3.hashCode()); // different epsilon

        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 2.0, 4.0});
        assertNotEquals(v1.hashCode(), v4.hashCode()); // different value
    }

    @Test
    public void testEquals() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertTrue(v1.equals(v2));

        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0}, 1e-10);
        assertFalse(v1.equals(v3)); // different epsilon

        OpenMapRealVector v4 = new OpenMapRealVector(new double[]{1.0, 2.0, 4.0});
        assertFalse(v1.equals(v4)); // different value

        OpenMapRealVector v5 = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertFalse(v1.equals(v5)); // different dimension
    }

    @Test
    public void testGetSparsity() {
        OpenMapRealVector v = new OpenMapRealVector(10);
        v.setEntry(1, 1.0);
        v.setEntry(5, 2.0);
        v.setEntry(9, 3.0);
        assertEquals(3.0 / 10.0, v.getSparsity(), 1e-15);

        OpenMapRealVector empty = new OpenMapRealVector(5);
        assertEquals(0.0 / 5.0, empty.getSparsity(), 1e-15);
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0, 0.0, 5.0});
        java.util.Iterator<Entry> iter = v.sparseIterator();
        assertTrue(iter.hasNext());
        Entry entry1 = iter.next();
        assertEquals(0, entry1.getIndex());
        assertEquals(1.0, entry1.getValue(), 1e-15);

        assertTrue(iter.hasNext());
        Entry entry2 = iter.next();
        assertEquals(2, entry2.getIndex());
        assertEquals(3.0, entry2.getValue(), 1e-15);

        assertTrue(iter.hasNext());
        Entry entry3 = iter.next();
        assertEquals(4, entry3.getIndex());
        assertEquals(5.0, entry3.getValue(), 1e-15);

        assertFalse(iter.hasNext());
    }

    @Test
    public void testEntrySetValue() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        java.util.Iterator<Entry> iter = v.sparseIterator();
        assertTrue(iter.hasNext());
        Entry e = iter.next();
        e.setValue(10.0);
        assertEquals(10.0, v.getEntry(1), 1e-15);
    }

    @Test
    public void testEntryGetValue() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        java.util.Iterator<Entry> iter = v.sparseIterator();
        assertTrue(iter.hasNext());
        Entry e = iter.next();
        assertEquals(5.0, e.getValue(), 1e-15);
    }

    @Test
    public void testEntryGetIndex() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        java.util.Iterator<Entry> iter = v.sparseIterator();
        assertTrue(iter.hasNext());
        Entry e = iter.next();
        assertEquals(1, e.getIndex());
    }

    @Test
    public void testSparseIteratorHasNext() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        java.util.Iterator<Entry> iter = v.sparseIterator();
        assertTrue(iter.hasNext());
        iter.next(); // consume first
        assertTrue(iter.hasNext());
        iter.next(); // consume second
        assertFalse(iter.hasNext());
    }

    @Test
    public void testSparseIteratorNext() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        java.util.Iterator<Entry> iter = v.sparseIterator();
        Entry entry1 = iter.next();
        assertEquals(0, entry1.getIndex());
        assertEquals(1.0, entry1.getValue(), 1e-15);

        Entry entry2 = iter.next();
        assertEquals(2, entry2.getIndex());
        assertEquals(3.0, entry2.getValue(), 1e-15);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIteratorRemove() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        java.util.Iterator<Entry> iter = v.sparseIterator();
        iter.remove(); // Should throw exception
    }

    // Test for epsilon implicitly checked by isDefaultValue
    @Test
    public void testIsDefaultValue() {
        OpenMapRealVector v = new OpenMapRealVector(5, 1e-5);
        assertTrue(v.isDefaultValue(0.0));
        assertTrue(v.isDefaultValue(1e-6));
        assertTrue(v.isDefaultValue(-1e-6));
        assertFalse(v.isDefaultValue(1e-4));
        assertFalse(v.isDefaultValue(-1e-4));
    }

    // Test for constructor epsilon
    @Test
    public void testConstructorEpsilonValue() {
        OpenMapRealVector v = new OpenMapRealVector(5, 1.23e-7);
        // Direct access to epsilon is not allowed. We can only test behavior.
        // The value is part of the object's configuration.
        // We can check if isDefaultValue behaves correctly with this epsilon.
        assertTrue(v.isDefaultValue(1e-8));
        assertFalse(v.isDefaultValue(1e-6));
    }
}
