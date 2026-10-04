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

public class OpenMapRealVectorTest {
    @Test
    public void testDimensionAndValidIndexEdges() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2, 0, -3});
        assertEquals(3, v.getDimension());
        assertEquals(2.0, v.getEntry(0), 0.0);
        assertEquals(-3.0, v.getEntry(2), 0.0);
    }

    @Test
    public void testSetEntryToleranceBoundaryAndRemoval() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(2, 1.0);
        v.setEntry(0, 1.0);
        v.setEntry(1, Math.nextDown(1.0));
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);
        v.setEntry(0, 0.0);
        assertEquals(0.0, v.getEntry(0), 0.0);
    }

    @Test
    public void testAddWithEntriesOnBothSides() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {2, 0, 4});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {0, 3, -4});
        assertArrayEquals(new double[] {2, 3, 0}, a.add(b).toArray(), 0.0);
    }

    @Test
    public void testAppendVectorAndDouble() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2, 0});
        assertArrayEquals(new double[] {2, 0, 0, -3},
                          v.append(new OpenMapRealVector(new double[] {0, -3})).toArray(), 0.0);
        assertArrayEquals(new double[] {2, 0, 5}, v.append(5).toArray(), 0.0);
    }

    @Test
    public void testCopyIsIndependent() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1, 2});
        OpenMapRealVector copy = v.copy();
        copy.setEntry(0, 9);
        assertArrayEquals(new double[] {1, 2}, v.toArray(), 0.0);
        assertArrayEquals(new double[] {9, 2}, copy.toArray(), 0.0);
    }

    @Test
    public void testDotProductIncludesOverlap() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {2, 0, -3});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {4, 5, 2});
        assertEquals(2.0, a.dotProduct(b), 0.0);
    }

    @Test
    public void testElementwiseDivisionIncludingZeroOverZero() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {6, 0, -8});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {2, 0, 4});
        OpenMapRealVector result = a.ebeDivide(b);
        assertEquals(3.0, result.getEntry(0), 0.0);
        assertTrue(Double.isNaN(result.getEntry(1)));
        assertEquals(-2.0, result.getEntry(2), 0.0);
    }

    @Test
    public void testElementwiseMultiplyHandlesNonfiniteValuesAtZeroEntry() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {0, 2, 0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {Double.POSITIVE_INFINITY, 3, Double.NaN});
        OpenMapRealVector result = a.ebeMultiply(b);
        assertTrue(Double.isNaN(result.getEntry(0)));
        assertEquals(6.0, result.getEntry(1), 0.0);
        assertTrue(Double.isNaN(result.getEntry(2)));
    }

    @Test
    public void testGetSubVectorFirstAndLastIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2, 0, 5});
        assertArrayEquals(new double[] {2, 0}, v.getSubVector(0, 2).toArray(), 0.0);
        assertArrayEquals(new double[] {5}, v.getSubVector(2, 1).toArray(), 0.0);
    }

    @Test
    public void testDistancesAccountForEntriesUniqueToEachVector() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1, 0, 4});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {0, 3, 0});
        assertEquals(Math.sqrt(26), a.getDistance(b), 1e-12);
        assertEquals(8.0, a.getL1Distance(b), 0.0);
        assertEquals(4.0, a.getLInfDistance(b), 0.0);
    }

    @Test
    public void testNaNAndInfinityPredicates() throws Exception {
        OpenMapRealVector infinite = new OpenMapRealVector(new double[] {0, Double.POSITIVE_INFINITY});
        OpenMapRealVector nan = new OpenMapRealVector(new double[] {Double.POSITIVE_INFINITY, Double.NaN});
        assertTrue(infinite.isInfinite());
        assertFalse(infinite.isNaN());
        assertTrue(nan.isNaN());
        assertFalse(nan.isInfinite());
    }

    @Test
    public void testMapAddReturnsChangedCopyAndSelfChanges() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0, 2});
        OpenMapRealVector result = v.mapAdd(3);
        assertArrayEquals(new double[] {3, 5}, result.toArray(), 0.0);
        assertArrayEquals(new double[] {0, 2}, v.toArray(), 0.0);
        v.mapAddToSelf(-1);
        assertArrayEquals(new double[] {-1, 1}, v.toArray(), 0.0);
    }

    @Test
    public void testProjectionOntoVector() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2, 2});
        OpenMapRealVector direction = new OpenMapRealVector(new double[] {1, 0});
        assertArrayEquals(new double[] {2, 0}, v.projection(direction).toArray(), 0.0);
    }

    @Test
    public void testSetSubVectorAndSetAll() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(4);
        v.setSubVector(1, new OpenMapRealVector(new double[] {3, 0}));
        assertArrayEquals(new double[] {0, 3, 0, 0}, v.toArray(), 0.0);
        v.set(-2);
        assertArrayEquals(new double[] {-2, -2, -2, -2}, v.toArray(), 0.0);
    }

    @Test
    public void testSubtractOverlappingAndUniqueEntries() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {5, 0, -2});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {3, 4, 0});
        assertArrayEquals(new double[] {2, -4, -2}, a.subtract(b).toArray(), 0.0);
    }

    @Test
    public void testUnitVectorAndUnitize() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {3, 4});
        assertArrayEquals(new double[] {0.6, 0.8}, v.unitVector().toArray(), 1e-12);
        v.unitize();
        assertArrayEquals(new double[] {0.6, 0.8}, v.toArray(), 1e-12);
    }

    @Test
    public void testZeroVectorCannotBeUnitized() throws Exception {
        try {
            new OpenMapRealVector(2).unitize();
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) {
        }
    }

    @Test
    public void testArrayConversionAndSparseIteration() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0, 7, 0, -2});
        assertArrayEquals(new double[] {0, 7, 0, -2}, v.toArray(), 0.0);
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();
        int count = 0;
        double sum = 0;
        while (it.hasNext()) {
            RealVector.Entry entry = it.next();
            sum += entry.getValue();
            count++;
        }
        assertEquals(2, count);
        assertEquals(5.0, sum, 0.0);
    }

    @Test
    public void testEqualityAndHashCodeIncludeDimensionAndValues() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {2, 0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {2, 0});
        OpenMapRealVector c = new OpenMapRealVector(new double[] {2});
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(c));
    }

    @Test
    public void testSparsityAtEmptyAndFullyPopulatedCases() throws Exception {
        assertEquals(0.0, new OpenMapRealVector(2).getSparsity(), 0.0);
        assertEquals(1.0, new OpenMapRealVector(new double[] {1, 2}).getSparsity(), 0.0);
    }
}
