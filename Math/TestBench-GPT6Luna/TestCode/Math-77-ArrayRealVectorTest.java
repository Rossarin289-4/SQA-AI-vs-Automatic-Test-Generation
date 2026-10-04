package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;

public class ArrayRealVectorTest {
    @Test
    public void testCopyPreservesValuesIndependently() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {1, 2});
        ArrayRealVector copy = (ArrayRealVector) v.copy();
        copy.setEntry(0, 9);
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(9.0, copy.getEntry(0), 0.0);
    }

    @Test
    public void testAddAndSubtract() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {1, -2});
        assertArrayEquals(new double[] {4, 2},
                ((ArrayRealVector) v.add(new ArrayRealVector(new double[] {3, 4}))).toArray(), 0.0);
        assertArrayEquals(new double[] {-2, -6},
                ((ArrayRealVector) v.subtract(new ArrayRealVector(new double[] {3, 4}))).toArray(), 0.0);
    }

    @Test
    public void testInPlaceArithmeticMaps() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {2, 4});
        v.mapAddToSelf(1);
        v.mapSubtractToSelf(1);
        v.mapMultiplyToSelf(2);
        v.mapDivideToSelf(2);
        v.mapPowToSelf(2);
        assertArrayEquals(new double[] {4, 16}, v.toArray(), 0.0);
    }

    @Test
    public void testExponentialMaps() throws Exception {
        ArrayRealVector exp = new ArrayRealVector(new double[] {0, 1});
        exp.mapExpToSelf();
        assertEquals(1.0, exp.getEntry(0), 0.0);
        assertEquals(Math.E, exp.getEntry(1), 1e-15);
        ArrayRealVector expm1 = new ArrayRealVector(new double[] {0, 1});
        expm1.mapExpm1ToSelf();
        assertEquals(0.0, expm1.getEntry(0), 0.0);
        assertEquals(Math.expm1(1), expm1.getEntry(1), 1e-15);
    }

    @Test
    public void testLogarithmMaps() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {1, Math.E});
        v.mapLogToSelf();
        assertEquals(0.0, v.getEntry(0), 0.0);
        assertEquals(1.0, v.getEntry(1), 1e-15);
        ArrayRealVector log10 = new ArrayRealVector(new double[] {1, 100});
        log10.mapLog10ToSelf();
        assertArrayEquals(new double[] {0, 2}, log10.toArray(), 1e-15);
        ArrayRealVector log1p = new ArrayRealVector(new double[] {0, 1});
        log1p.mapLog1pToSelf();
        assertEquals(Math.log1p(1), log1p.getEntry(1), 1e-15);
    }

    @Test
    public void testHyperbolicMaps() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {0, 1});
        v.mapCoshToSelf();
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(Math.cosh(1), v.getEntry(1), 1e-15);
        ArrayRealVector s = new ArrayRealVector(new double[] {0, 1});
        s.mapSinhToSelf();
        assertEquals(0.0, s.getEntry(0), 0.0);
        assertEquals(Math.sinh(1), s.getEntry(1), 1e-15);
        ArrayRealVector t = new ArrayRealVector(new double[] {0, 1});
        t.mapTanhToSelf();
        assertEquals(0.0, t.getEntry(0), 0.0);
        assertEquals(Math.tanh(1), t.getEntry(1), 1e-15);
    }

    @Test
    public void testTrigonometricMaps() throws Exception {
        ArrayRealVector s = new ArrayRealVector(new double[] {0, Math.PI / 2});
        s.mapSinToSelf();
        assertEquals(0.0, s.getEntry(0), 0.0);
        assertEquals(1.0, s.getEntry(1), 1e-15);
        ArrayRealVector c = new ArrayRealVector(new double[] {0, Math.PI});
        c.mapCosToSelf();
        assertEquals(1.0, c.getEntry(0), 0.0);
        assertEquals(-1.0, c.getEntry(1), 1e-15);
        ArrayRealVector t = new ArrayRealVector(new double[] {0, Math.PI / 4});
        t.mapTanToSelf();
        assertEquals(0.0, t.getEntry(0), 0.0);
        assertEquals(1.0, t.getEntry(1), 1e-15);
    }

    @Test
    public void testInverseTrigonometricMaps() throws Exception {
        ArrayRealVector a = new ArrayRealVector(new double[] {0, 1});
        a.mapAcosToSelf();
        assertEquals(Math.PI / 2, a.getEntry(0), 1e-15);
        assertEquals(0.0, a.getEntry(1), 0.0);
        ArrayRealVector b = new ArrayRealVector(new double[] {0, 1});
        b.mapAsinToSelf();
        assertEquals(0.0, b.getEntry(0), 0.0);
        assertEquals(Math.PI / 2, b.getEntry(1), 1e-15);
        ArrayRealVector c = new ArrayRealVector(new double[] {0, 1});
        c.mapAtanToSelf();
        assertEquals(0.0, c.getEntry(0), 0.0);
        assertEquals(Math.PI / 4, c.getEntry(1), 1e-15);
    }

    @Test
    public void testReciprocalAbsoluteAndRoots() throws Exception {
        ArrayRealVector inv = new ArrayRealVector(new double[] {2, 4});
        inv.mapInvToSelf();
        assertArrayEquals(new double[] {0.5, 0.25}, inv.toArray(), 0.0);
        ArrayRealVector abs = new ArrayRealVector(new double[] {-2, 0});
        abs.mapAbsToSelf();
        assertArrayEquals(new double[] {2, 0}, abs.toArray(), 0.0);
        ArrayRealVector sqrt = new ArrayRealVector(new double[] {0, 4});
        sqrt.mapSqrtToSelf();
        assertArrayEquals(new double[] {0, 2}, sqrt.toArray(), 0.0);
        ArrayRealVector cbrt = new ArrayRealVector(new double[] {-8, 27});
        cbrt.mapCbrtToSelf();
        assertArrayEquals(new double[] {-2, 3}, cbrt.toArray(), 0.0);
    }

    @Test
    public void testRoundingAndSignMaps() throws Exception {
        ArrayRealVector ceil = new ArrayRealVector(new double[] {-1.2, 1.2});
        ceil.mapCeilToSelf();
        assertArrayEquals(new double[] {-1, 2}, ceil.toArray(), 0.0);
        ArrayRealVector floor = new ArrayRealVector(new double[] {-1.2, 1.2});
        floor.mapFloorToSelf();
        assertArrayEquals(new double[] {-2, 1}, floor.toArray(), 0.0);
        ArrayRealVector rint = new ArrayRealVector(new double[] {1.5, 2.5});
        rint.mapRintToSelf();
        assertArrayEquals(new double[] {2, 2}, rint.toArray(), 0.0);
        ArrayRealVector sign = new ArrayRealVector(new double[] {-2, 0, 3});
        sign.mapSignumToSelf();
        assertArrayEquals(new double[] {-1, 0, 1}, sign.toArray(), 0.0);
    }

    @Test
    public void testUlpMapAtZeroAndOne() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {0, 1});
        v.mapUlpToSelf();
        assertEquals(Math.ulp(0.0), v.getEntry(0), 0.0);
        assertEquals(Math.ulp(1.0), v.getEntry(1), 0.0);
    }

    @Test
    public void testElementwiseMultiplyAndDivide() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {6, 8});
        assertArrayEquals(new double[] {12, 24},
                ((ArrayRealVector) v.ebeMultiply(new ArrayRealVector(new double[] {2, 3}))).toArray(), 0.0);
        assertArrayEquals(new double[] {3, 2},
                ((ArrayRealVector) v.ebeDivide(new ArrayRealVector(new double[] {2, 4}))).toArray(), 0.0);
    }

    @Test
    public void testDataCopyAndReference() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {1, 2});
        double[] copy = v.getData();
        copy[0] = 8;
        assertEquals(1.0, v.getEntry(0), 0.0);
        v.getDataRef()[1] = 7;
        assertEquals(7.0, v.getEntry(1), 0.0);
        assertArrayEquals(new double[] {1, 7}, v.toArray(), 0.0);
    }

    @Test
    public void testDotProductAndNorms() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {3, -4});
        assertEquals(-5.0, v.dotProduct(new ArrayRealVector(new double[] {1, 2})), 0.0);
        assertEquals(5.0, v.getNorm(), 0.0);
        assertEquals(7.0, v.getL1Norm(), 0.0);
        assertEquals(4.0, v.getLInfNorm(), 0.0);
    }

    @Test
    public void testDistances() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {1, 5});
        ArrayRealVector w = new ArrayRealVector(new double[] {4, 1});
        assertEquals(5.0, v.getDistance(w), 0.0);
        assertEquals(7.0, v.getL1Distance(w), 0.0);
        assertEquals(4.0, v.getLInfDistance(w), 0.0);
    }

    @Test
    public void testUnitVectorAndUnitize() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {3, 4});
        assertArrayEquals(new double[] {0.6, 0.8},
                ((ArrayRealVector) v.unitVector()).toArray(), 1e-15);
        v.unitize();
        assertArrayEquals(new double[] {0.6, 0.8}, v.toArray(), 1e-15);
    }

    @Test
    public void testProjectionAndOuterProduct() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {3, 4});
        ArrayRealVector axis = new ArrayRealVector(new double[] {2, 0});
        assertArrayEquals(new double[] {3, 0},
                ((ArrayRealVector) v.projection(axis)).toArray(), 0.0);
        RealMatrix matrix = v.outerProduct(new ArrayRealVector(new double[] {1, 2}));
        assertEquals(3.0, matrix.getEntry(0, 0), 0.0);
        assertEquals(6.0, matrix.getEntry(0, 1), 0.0);
        assertEquals(4.0, matrix.getEntry(1, 0), 0.0);
        assertEquals(8.0, matrix.getEntry(1, 1), 0.0);
    }

    @Test
    public void testDimensionEntryAndLastIndex() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {2, 5, 9});
        assertEquals(3, v.getDimension());
        assertEquals(2.0, v.getEntry(0), 0.0);
        assertEquals(9.0, v.getEntry(2), 0.0);
        v.setEntry(2, 7);
        assertEquals(7.0, v.getEntry(2), 0.0);
    }

    @Test
    public void testAppendAndSubVector() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {1, 2});
        assertArrayEquals(new double[] {1, 2, 3},
                ((ArrayRealVector) v.append(3)).toArray(), 0.0);
        assertArrayEquals(new double[] {1, 2, 4, 5},
                ((ArrayRealVector) v.append(new ArrayRealVector(new double[] {4, 5}))).toArray(), 0.0);
        assertArrayEquals(new double[] {2, 4},
                ((ArrayRealVector) new ArrayRealVector(new double[] {1, 2, 4, 5})
                        .getSubVector(1, 2)).toArray(), 0.0);
    }

    @Test
    public void testSetSubVectorAndFill() throws Exception {
        ArrayRealVector v = new ArrayRealVector(new double[] {1, 2, 3, 4});
        v.setSubVector(1, new ArrayRealVector(new double[] {8, 9}));
        assertArrayEquals(new double[] {1, 8, 9, 4}, v.toArray(), 0.0);
        v.set(6);
        assertArrayEquals(new double[] {6, 6, 6, 6}, v.toArray(), 0.0);
    }

    @Test
    public void testNaNAndInfinityPredicates() throws Exception {
        assertFalse(new ArrayRealVector(new double[] {1, Double.POSITIVE_INFINITY}).isNaN());
        assertTrue(new ArrayRealVector(new double[] {1, Double.POSITIVE_INFINITY}).isInfinite());
        assertTrue(new ArrayRealVector(new double[] {Double.NaN, Double.POSITIVE_INFINITY}).isNaN());
        assertFalse(new ArrayRealVector(new double[] {Double.NaN, Double.POSITIVE_INFINITY}).isInfinite());
    }

    @Test
    public void testEqualityAndHashForNaNVectors() throws Exception {
        ArrayRealVector a = new ArrayRealVector(new double[] {Double.NaN, 1});
        ArrayRealVector b = new ArrayRealVector(new double[] {Double.NaN, 9});
        assertTrue(a.equals(b));
        assertEquals(9, a.hashCode());
        assertFalse(a.equals(new ArrayRealVector(new double[] {1, 2})));
    }
}
