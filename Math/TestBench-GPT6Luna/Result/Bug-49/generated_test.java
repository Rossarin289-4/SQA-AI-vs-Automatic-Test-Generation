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
    public void testSparseStorageAndTolerance() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0.0, 1.0e-13, 2.0}, 1.0e-12);
        assertArrayEquals(new double[] {0.0, 0.0, 2.0}, v.getData(), 0.0);
        assertEquals(1.0 / 3.0, v.getSparsity(), 1e-12);
        v.setEntry(2, 1.0e-12);
        assertEquals(1.0e-12, v.getEntry(2), 0.0);
    }

    @Test
    public void testSetEntryZeroAndExactTolerance() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(2, 1.0);
        v.setEntry(0, 1.0);
        v.setEntry(0, 0.5);
        assertEquals(0.0, v.getEntry(0), 0.0);
        v.setEntry(1, -1.0);
        assertEquals(-1.0, v.getEntry(1), 0.0);
    }

    @Test
    public void testAdditionAcrossStoredEntries() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {2.0, 0.0, 4.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {0.0, 3.0, -1.0});
        assertArrayEquals(new double[] {2.0, 3.0, 3.0}, a.add(b).getData(), 0.0);
    }

    @Test
    public void testAppendVectorPreservesOffsetAndValues() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {0.0, 3.0});
        assertArrayEquals(new double[] {1.0, 0.0, 0.0, 3.0}, a.append(b).getData(), 0.0);
    }

    @Test
    public void testCopyIsIndependent() throws Exception {
        OpenMapRealVector original = new OpenMapRealVector(new double[] {2.0, 0.0});
        OpenMapRealVector copy = original.copy();
        copy.setEntry(0, 5.0);
        assertEquals(2.0, original.getEntry(0), 0.0);
        assertEquals(5.0, copy.getEntry(0), 0.0);
    }

    @Test
    public void testDotProductUsesSharedAndUnsharedEntries() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {2.0, 0.0, 4.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {3.0, 5.0, 0.0});
        assertEquals(6.0, a.dotProduct(b), 0.0);
    }

    @Test
    public void testElementwiseDivideAndMultiply() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {6.0, 0.0, 8.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {2.0, 4.0, 2.0});
        assertArrayEquals(new double[] {3.0, 0.0, 4.0}, a.ebeDivide(b).getData(), 0.0);
        assertArrayEquals(new double[] {12.0, 0.0, 16.0}, a.ebeMultiply(b).getData(), 0.0);
    }

    @Test
    public void testSubVectorAtFirstAndLastIndices() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0.0, 2.0, 0.0, 4.0});
        assertArrayEquals(new double[] {0.0, 2.0}, v.getSubVector(0, 2).getData(), 0.0);
        assertArrayEquals(new double[] {4.0}, v.getSubVector(3, 1).getData(), 0.0);
    }

    @Test
    public void testDistanceMetrics() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1.0, 0.0, -2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {0.0, 3.0, -2.0});
        assertEquals(Math.sqrt(10.0), a.getDistance(b), 1e-12);
        assertEquals(4.0, a.getL1Distance(b), 0.0);
        assertEquals(3.0, a.getLInfDistance(b), 0.0);
    }

    @Test
    public void testNaNAndInfinityFlags() throws Exception {
        assertFalse(new OpenMapRealVector(new double[] {0.0, 2.0}).isInfinite());
        assertFalse(new OpenMapRealVector(new double[] {0.0, 2.0}).isNaN());
        assertTrue(new OpenMapRealVector(new double[] {Double.POSITIVE_INFINITY}).isInfinite());
        OpenMapRealVector nan = new OpenMapRealVector(new double[] {Double.POSITIVE_INFINITY, Double.NaN});
        assertTrue(nan.isNaN());
        assertFalse(nan.isInfinite());
    }

    @Test
    public void testMapAddReturnsModifiedCopy() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0});
        OpenMapRealVector result = v.mapAdd(2.0);
        assertArrayEquals(new double[] {3.0, 2.0}, result.getData(), 0.0);
        assertArrayEquals(new double[] {1.0, 0.0}, v.getData(), 0.0);
    }

    @Test
    public void testMapAddToSelfIncludesZeros() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0, -2.0});
        assertSame(v, v.mapAddToSelf(2.0));
        assertArrayEquals(new double[] {3.0, 2.0, 0.0}, v.getData(), 0.0);
    }

    @Test
    public void testOuterProduct() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2.0, 0.0, -1.0});
        RealMatrix product = v.outerProduct(new double[] {3.0, 4.0});
        assertEquals(6.0, product.getEntry(0, 0), 0.0);
        assertEquals(8.0, product.getEntry(0, 1), 0.0);
        assertEquals(0.0, product.getEntry(1, 0), 0.0);
        assertEquals(-3.0, product.getEntry(2, 0), 0.0);
    }

    @Test
    public void testProjectionOntoCoordinateAxis() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2.0, 3.0});
        OpenMapRealVector projected = (OpenMapRealVector) v.projection(new double[] {1.0, 0.0});
        assertArrayEquals(new double[] {2.0, 0.0}, projected.getData(), 0.0);
    }

    @Test
    public void testSetSubVectorAndSetAll() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(4);
        v.setSubVector(1, new double[] {2.0, 3.0});
        assertArrayEquals(new double[] {0.0, 2.0, 3.0, 0.0}, v.getData(), 0.0);
        v.set(-1.0);
        assertArrayEquals(new double[] {-1.0, -1.0, -1.0, -1.0}, v.getData(), 0.0);
    }

    @Test
    public void testSubtractAndSetArray() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {4.0, 0.0, 2.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {1.0, 3.0, 0.0});
        assertArrayEquals(new double[] {3.0, -3.0, 2.0}, a.subtract(b).getData(), 0.0);
        assertArrayEquals(new double[] {3.0, -3.0, 2.0}, a.subtract(new double[] {1.0, 3.0, 0.0}).getData(), 0.0);
    }

    @Test
    public void testUnitVectorAndUnitize() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {3.0, 4.0});
        assertArrayEquals(new double[] {0.6, 0.8}, v.unitVector().getData(), 1e-12);
        v.unitize();
        assertArrayEquals(new double[] {0.6, 0.8}, v.getData(), 1e-12);
    }

    @Test
    public void testUnitizeRejectsZeroNorm() throws Exception {
        try {
            new OpenMapRealVector(2).unitize();
            fail("expected MathArithmeticException");
        } catch (MathArithmeticException expected) {
        }
    }

    @Test
    public void testEqualityAndHashCode() throws Exception {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {1.0, 0.0});
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(new OpenMapRealVector(new double[] {1.0}, 1.0e-6)));
    }

    @Test
    public void testSparsityWithEmptyAndFullVectors() throws Exception {
        assertEquals(0.0, new OpenMapRealVector(3).getSparsity(), 0.0);
        assertEquals(1.0, new OpenMapRealVector(new double[] {1.0, 2.0}).getSparsity(), 0.0);
    }

    @Test
    public void testSparseIteratorVisitsStoredValues() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0.0, 2.0, 0.0, -3.0});
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();
        double sum = 0.0;
        int count = 0;
        while (it.hasNext()) {
            RealVector.Entry entry = it.next();
            sum += entry.getValue();
            count++;
        }
        assertEquals(2, count);
        assertEquals(-1.0, sum, 0.0);
    }

    @Test
    public void testGetDimensionAndArrayAtIndexBoundaries() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {7.0, 0.0, 9.0});
        assertEquals(3, v.getDimension());
        assertEquals(7.0, v.getEntry(0), 0.0);
        assertEquals(9.0, v.getEntry(2), 0.0);
        assertArrayEquals(new double[] {7.0, 0.0, 9.0}, v.toArray(), 0.0);
    }

    @Test
    public void testSetSubVectorEndingAtLastIndex() throws Exception {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setSubVector(1, new double[] {5.0, 6.0});
        assertArrayEquals(new double[] {0.0, 5.0, 6.0}, v.getData(), 0.0);
    }
}
