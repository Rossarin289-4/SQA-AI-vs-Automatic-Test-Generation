The error "method testMapAddToSelf() is already defined in class ArrayRealVectorTest" indicates a duplicate test method. I will remove the duplicate test method.

```java
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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorZeroLength() {
        ArrayRealVector v = new ArrayRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testConstructorSize() {
        ArrayRealVector v = new ArrayRealVector(5);
        assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            assertEquals(0.0, v.getEntry(i), 1e-9);
        }
    }

    @Test
    public void testConstructorSizePreset() {
        ArrayRealVector v = new ArrayRealVector(5, 3.14);
        assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            assertEquals(3.14, v.getEntry(i), 1e-9);
        }
    }

    @Test
    public void testConstructorDoubleArray() {
        double[] data = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(data);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
        // Ensure it's a copy
        data[0] = 99.0;
        assertEquals(1.0, v.getEntry(0), 1e-9);
    }

    @Test
    public void testConstructorDoubleArrayCopyArrayTrue() {
        double[] data = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(data, true);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
        // Ensure it's a copy
        data[0] = 99.0;
        assertEquals(1.0, v.getEntry(0), 1e-9);
    }

    @Test
    public void testConstructorDoubleArrayCopyArrayFalse() {
        double[] data = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(data, false);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
        // Ensure it's a reference
        data[0] = 99.0;
        assertEquals(99.0, v.getEntry(0), 1e-9);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullDoubleArray() {
        new ArrayRealVector((double[]) null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyDoubleArray() {
        new ArrayRealVector(new double[0], true);
    }

    @Test
    public void testConstructorDoubleArrayPosSize() {
        double[] data = {0.0, 1.0, 2.0, 3.0, 4.0};
        ArrayRealVector v = new ArrayRealVector(data, 1, 3);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
    }

    @Test(expected = MathRuntimeException.class)
    public void testConstructorDoubleArrayPosSizeInvalid() {
        double[] data = {1.0, 2.0};
        new ArrayRealVector(data, 1, 2); // pos + size > data.length
    }

    @Test
    public void testConstructorDoubleArrayPosSizeZeroSize() {
        double[] data = {1.0, 2.0};
        ArrayRealVector v = new ArrayRealVector(data, 1, 0);
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testConstructorDoubleArrayPosSizeZeroPos() {
        double[] data = {1.0, 2.0};
        ArrayRealVector v = new ArrayRealVector(data, 0, 2);
        assertEquals(2, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
    }


    @Test
    public void testConstructorDoubleArrayPosSizeZeroPosZeroSize() {
        double[] data = {1.0, 2.0};
        ArrayRealVector v = new ArrayRealVector(data, 0, 0);
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testConstructorDoubleArrayPosSizeMaxPos() {
        double[] data = {1.0, 2.0};
        ArrayRealVector v = new ArrayRealVector(data, 1, 1);
        assertEquals(1, v.getDimension());
        assertEquals(2.0, v.getEntry(0), 1e-9);
    }

    @Test
    public void testConstructorDoubleArrayPosSizeMaxPosZeroSize() {
        double[] data = {1.0, 2.0};
        ArrayRealVector v = new ArrayRealVector(data, 2, 0);
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testConstructorDoubleArrayPosSizeMaxPosInvalid() {
        double[] data = {1.0, 2.0};
        try {
            new ArrayRealVector(data, 3, 0); // pos > data.length
            fail("Expected MathRuntimeException");
        } catch (MathRuntimeException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorArrayOfDouble() {
        Double[] d = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(d);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testConstructorArrayOfDoublePosSize() {
        Double[] d = {0.0, 1.0, 2.0, 3.0, 4.0};
        ArrayRealVector v = new ArrayRealVector(d, 1, 3);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
    }

    @Test(expected = MathRuntimeException.class)
    public void testConstructorArrayOfDoublePosSizeInvalid() {
        Double[] d = {1.0, 2.0};
        new ArrayRealVector(d, 1, 2); // pos + size > d.length
    }

    @Test
    public void testConstructorRealVectorCopy() {
        double[] data = {1.0, 2.0, 3.0};
        RealVector v1 = new ArrayRealVector(data);
        ArrayRealVector v2 = new ArrayRealVector(v1);
        assertEquals(3, v2.getDimension());
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(2.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
        // Ensure it's a deep copy
        v1.setEntry(0, 99.0);
        assertEquals(1.0, v2.getEntry(0), 1e-9);
    }

    @Test
    public void testConstructorArrayRealVectorCopy() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(v1);
        assertEquals(3, v2.getDimension());
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(2.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
        // Ensure it's a deep copy
        v1.setEntry(0, 99.0);
        assertEquals(1.0, v2.getEntry(0), 1e-9);
    }

    @Test
    public void testConstructorArrayRealVectorDeepCopy() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(v1, true);
        assertEquals(3, v2.getDimension());
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(2.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
        // Ensure it's a deep copy
        v1.setEntry(0, 99.0);
        assertEquals(1.0, v2.getEntry(0), 1e-9);
    }

    @Test
    public void testConstructorArrayRealVectorShallowCopy() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(v1, false);
        assertEquals(3, v2.getDimension());
        assertEquals(1.0, v2.getEntry(0), 1e-9);
        assertEquals(2.0, v2.getEntry(1), 1e-9);
        assertEquals(3.0, v2.getEntry(2), 1e-9);
        // Ensure it's a shallow copy
        v1.setEntry(0, 99.0);
        assertEquals(99.0, v2.getEntry(0), 1e-9);
    }

    @Test
    public void testConstructorTwoArrayRealVectors() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        ArrayRealVector v3 = new ArrayRealVector(v1, v2);
        assertEquals(4, v3.getDimension());
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
        assertEquals(4.0, v3.getEntry(3), 1e-9);
    }

    @Test
    public void testConstructorArrayRealVectorRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        ArrayRealVector v3 = new ArrayRealVector(v1, v2);
        assertEquals(4, v3.getDimension());
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
        assertEquals(4.0, v3.getEntry(3), 1e-9);
    }

    @Test
    public void testConstructorRealVectorArrayRealVector() {
        RealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        ArrayRealVector v3 = new ArrayRealVector(v1, v2);
        assertEquals(4, v3.getDimension());
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
        assertEquals(4.0, v3.getEntry(3), 1e-9);
    }

    @Test
    public void testConstructorArrayRealVectorDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] v2 = {3.0, 4.0};
        ArrayRealVector v3 = new ArrayRealVector(v1, v2);
        assertEquals(4, v3.getDimension());
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
        assertEquals(4.0, v3.getEntry(3), 1e-9);
    }

    @Test
    public void testConstructorDoubleArrayArrayRealVector() {
        double[] v1 = {1.0, 2.0};
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        ArrayRealVector v3 = new ArrayRealVector(v1, v2);
        assertEquals(4, v3.getDimension());
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
        assertEquals(4.0, v3.getEntry(3), 1e-9);
    }

    @Test
    public void testConstructorTwoDoubleArrays() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {3.0, 4.0};
        ArrayRealVector v3 = new ArrayRealVector(v1, v2);
        assertEquals(4, v3.getDimension());
        assertEquals(1.0, v3.getEntry(0), 1e-9);
        assertEquals(2.0, v3.getEntry(1), 1e-9);
        assertEquals(3.0, v3.getEntry(2), 1e-9);
        assertEquals(4.0, v3.getEntry(3), 1e-9);
    }

    @Test
    public void testCopy() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = (ArrayRealVector) v1.copy();
        assertEquals(v1.getDimension(), v2.getDimension());
        assertEquals(v1.getEntry(0), v2.getEntry(0), 1e-9);
        assertEquals(v1.getEntry(1), v2.getEntry(1), 1e-9);
        assertEquals(v1.getEntry(2), v2.getEntry(2), 1e-9);
        assertNotSame(v1, v2); // Should be a different instance
    }

    @Test
    public void testAddRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector result = v1.add(v2);
        assertEquals(3, result.getDimension());
        assertEquals(5.0, result.getEntry(0), 1e-9);
        assertEquals(7.0, result.getEntry(1), 1e-9);
        assertEquals(9.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testAddDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        double[] v2 = {4.0, 5.0, 6.0};
        RealVector result = v1.add(v2);
        assertEquals(3, result.getDimension());
        assertEquals(5.0, result.getEntry(0), 1e-9);
        assertEquals(7.0, result.getEntry(1), 1e-9);
        assertEquals(9.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testAddArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        ArrayRealVector result = v1.add(v2);
        assertEquals(3, result.getDimension());
        assertEquals(5.0, result.getEntry(0), 1e-9);
        assertEquals(7.0, result.getEntry(1), 1e-9);
        assertEquals(9.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testSubtractRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector result = v1.subtract(v2);
        assertEquals(3, result.getDimension());
        assertEquals(3.0, result.getEntry(0), 1e-9);
        assertEquals(3.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testSubtractDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        double[] v2 = {1.0, 2.0, 3.0};
        RealVector result = v1.subtract(v2);
        assertEquals(3, result.getDimension());
        assertEquals(3.0, result.getEntry(0), 1e-9);
        assertEquals(3.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testSubtractArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector result = v1.subtract(v2);
        assertEquals(3, result.getDimension());
        assertEquals(3.0, result.getEntry(0), 1e-9);
        assertEquals(3.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testMapAddToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        v.mapAddToSelf(5.0);
        assertEquals(6.0, v.getEntry(0), 1e-9);
        assertEquals(7.0, v.getEntry(1), 1e-9);
        assertEquals(8.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapSubtractToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        v.mapSubtractToSelf(5.0);
        assertEquals(2.0, v.getEntry(0), 1e-9);
        assertEquals(3.0, v.getEntry(1), 1e-9);
        assertEquals(4.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapMultiplyToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        v.mapMultiplyToSelf(2.0);
        assertEquals(2.0, v.getEntry(0), 1e-9);
        assertEquals(4.0, v.getEntry(1), 1e-9);
        assertEquals(6.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapDivideToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{6.0, 8.0, 10.0});
        v.mapDivideToSelf(2.0);
        assertEquals(3.0, v.getEntry(0), 1e-9);
        assertEquals(4.0, v.getEntry(1), 1e-9);
        assertEquals(5.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapPowToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{2.0, 3.0, 4.0});
        v.mapPowToSelf(2.0); // Square each element
        assertEquals(4.0, v.getEntry(0), 1e-9);
        assertEquals(9.0, v.getEntry(1), 1e-9);
        assertEquals(16.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapExpToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapExpToSelf();
        assertEquals(Math.exp(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.exp(1.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapExpm1ToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapExpm1ToSelf();
        assertEquals(Math.expm1(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.expm1(1.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapLogToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, Math.E});
        v.mapLogToSelf();
        assertEquals(Math.log(1.0), v.getEntry(0), 1e-9);
        assertEquals(Math.log(Math.E), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapLog10ToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 10.0});
        v.mapLog10ToSelf();
        assertEquals(Math.log10(1.0), v.getEntry(0), 1e-9);
        assertEquals(Math.log10(10.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapLog1pToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapLog1pToSelf();
        assertEquals(Math.log1p(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.log1p(1.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapCoshToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapCoshToSelf();
        assertEquals(Math.cosh(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.cosh(1.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapSinhToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapSinhToSelf();
        assertEquals(Math.sinh(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.sinh(1.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapTanhToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapTanhToSelf();
        assertEquals(Math.tanh(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.tanh(1.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapCosToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, Math.PI});
        v.mapCosToSelf();
        assertEquals(Math.cos(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.cos(Math.PI), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapSinToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, Math.PI / 2.0});
        v.mapSinToSelf();
        assertEquals(Math.sin(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.sin(Math.PI / 2.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapTanToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, Math.PI / 4.0});
        v.mapTanToSelf();
        assertEquals(Math.tan(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.tan(Math.PI / 4.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapAcosToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 0.0});
        v.mapAcosToSelf();
        assertEquals(Math.acos(1.0), v.getEntry(0), 1e-9);
        assertEquals(Math.acos(0.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapAsinToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 0.0});
        v.mapAsinToSelf();
        assertEquals(Math.asin(1.0), v.getEntry(0), 1e-9);
        assertEquals(Math.asin(0.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapAtanToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapAtanToSelf();
        assertEquals(Math.atan(0.0), v.getEntry(0), 1e-9);
        assertEquals(Math.atan(1.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapInvToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 4.0});
        v.mapInvToSelf();
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(0.5, v.getEntry(1), 1e-9);
        assertEquals(0.25, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapAbsToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-1.0, 2.0, -3.0});
        v.mapAbsToSelf();
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapSqrtToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{4.0, 9.0, 16.0});
        v.mapSqrtToSelf();
        assertEquals(2.0, v.getEntry(0), 1e-9);
        assertEquals(3.0, v.getEntry(1), 1e-9);
        assertEquals(4.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapCbrtToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{8.0, 27.0});
        v.mapCbrtToSelf();
        assertEquals(2.0, v.getEntry(0), 1e-9);
        assertEquals(3.0, v.getEntry(1), 1e-9);
    }

    @Test
    public void testMapCeilToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.1, -2.2, 3.0});
        v.mapCeilToSelf();
        assertEquals(2.0, v.getEntry(0), 1e-9);
        assertEquals(-2.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapFloorToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.1, -2.2, 3.0});
        v.mapFloorToSelf();
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(-3.0, v.getEntry(1), 1e-9);
        assertEquals(3.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testMapRintToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.1, 1.9, -2.5, -1.5});
        v.mapRintToSelf();
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(-2.0, v.getEntry(2), 1e-9); // rint rounds to nearest even for .5
        assertEquals(-2.0, v.getEntry(3), 1e-9);
    }

    @Test
    public void testMapSignumToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-1.0, 0.0, 1.0, -5.5, 5.5});
        v.mapSignumToSelf();
        assertEquals(-1.0, v.getEntry(0), 1e-9);
        assertEquals(0.0, v.getEntry(1), 1e-9);
        assertEquals(1.0, v.getEntry(2), 1e-9);
        assertEquals(-1.0, v.getEntry(3), 1e-9);
        assertEquals(1.0, v.getEntry(4), 1e-9);
    }

    @Test
    public void testMapUlpToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 10.0});
        v.mapUlpToSelf();
        assertEquals(Math.ulp(1.0), v.getEntry(0), 1e-9);
        assertEquals(Math.ulp(10.0), v.getEntry(1), 1e-9);
    }

    @Test
    public void testEbeMultiplyRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector result = v1.ebeMultiply(v2);
        assertEquals(3, result.getDimension());
        assertEquals(4.0, result.getEntry(0), 1e-9);
        assertEquals(10.0, result.getEntry(1), 1e-9);
        assertEquals(18.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testEbeMultiplyDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        double[] v2 = {4.0, 5.0, 6.0};
        RealVector result = v1.ebeMultiply(v2);
        assertEquals(3, result.getDimension());
        assertEquals(4.0, result.getEntry(0), 1e-9);
        assertEquals(10.0, result.getEntry(1), 1e-9);
        assertEquals(18.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testEbeDivideRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{4.0, 10.0, 18.0});
        RealVector v2 = new ArrayRealVector(new double[]{2.0, 5.0, 6.0});
        RealVector result = v1.ebeDivide(v2);
        assertEquals(3, result.getDimension());
        assertEquals(2.0, result.getEntry(0), 1e-9);
        assertEquals(2.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testEbeDivideDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{4.0, 10.0, 18.0});
        double[] v2 = {2.0, 5.0, 6.0};
        RealVector result = v1.ebeDivide(v2);
        assertEquals(3, result.getDimension());
        assertEquals(2.0, result.getEntry(0), 1e-9);
        assertEquals(2.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testGetData() {
        double[] data = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(data);
        double[] result = v.getData();
        assertArrayEquals(data, result, 1e-9);
        // Ensure it's a copy
        result[0] = 99.0;
        assertEquals(1.0, v.getEntry(0), 1e-9);
    }

    @Test
    public void testGetDataRef() {
        double[] data = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(data);
        double[] result = v.getDataRef();
        assertArrayEquals(data, result, 1e-9);
        // Ensure it's a reference
        result[0] = 99.0;
        assertEquals(99.0, v.getEntry(0), 1e-9);
    }

    @Test
    public void testDotProductRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        double result = v1.dotProduct(v2);
        assertEquals(4.0 + 10.0 + 18.0, result, 1e-9); // 32.0
    }

    @Test
    public void testDotProductDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        double[] v2 = {4.0, 5.0, 6.0};
        double result = v1.dotProduct(v2);
        assertEquals(4.0 + 10.0 + 18.0, result, 1e-9); // 32.0
    }

    @Test
    public void testDotProductArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        double result = v1.dotProduct(v2);
        assertEquals(4.0 + 10.0 + 18.0, result, 1e-9); // 32.0
    }

    @Test
    public void testGetNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, 4.0});
        assertEquals(5.0, v.getNorm(), 1e-9); // sqrt(9 + 16)
    }

    @Test
    public void testGetL1Norm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-3.0, 4.0, -5.0});
        assertEquals(12.0, v.getL1Norm(), 1e-9); // 3 + 4 + 5
    }

    @Test
    public void testGetLInfNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{-3.0, 4.0, -5.0});
        assertEquals(5.0, v.getLInfNorm(), 1e-9); // max(3, 4, 5)
    }

    @Test
    public void testGetDistanceRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector v2 = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(5.0, v1.getDistance(v2), 1e-9); // sqrt((4-1)^2 + (6-2)^2) = sqrt(9 + 16) = 5
    }

    @Test
    public void testGetDistanceDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] v2 = {4.0, 6.0};
        assertEquals(5.0, v1.getDistance(v2), 1e-9); // sqrt((4-1)^2 + (6-2)^2) = sqrt(9 + 16) = 5
    }

    @Test
    public void testGetDistanceArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(5.0, v1.getDistance(v2), 1e-9); // sqrt((4-1)^2 + (6-2)^2) = sqrt(9 + 16) = 5
    }

    @Test
    public void testGetL1DistanceRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector v2 = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(7.0, v1.getL1Distance(v2), 1e-9); // |4-1| + |6-2| = 3 + 4 = 7
    }

    @Test
    public void testGetL1DistanceDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] v2 = {4.0, 6.0};
        assertEquals(7.0, v1.getL1Distance(v2), 1e-9); // |4-1| + |6-2| = 3 + 4 = 7
    }

    @Test
    public void testGetL1DistanceArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(7.0, v1.getL1Distance(v2), 1e-9); // |4-1| + |6-2| = 3 + 4 = 7
    }

    @Test
    public void testGetLInfDistanceRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector v2 = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(4.0, v1.getLInfDistance(v2), 1e-9); // max(|4-1|, |6-2|) = max(3, 4) = 4
    }

    @Test
    public void testGetLInfDistanceDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] v2 = {4.0, 6.0};
        assertEquals(4.0, v1.getLInfDistance(v2), 1e-9); // max(|4-1|, |6-2|) = max(3, 4) = 4
    }

    @Test
    public void testGetLInfDistanceArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{4.0, 6.0});
        assertEquals(4.0, v1.getLInfDistance(v2), 1e-9); // max(|4-1|, |6-2|) = max(3, 4) = 4
    }

    @Test
    public void testUnitVector() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector unit = v.unitVector();
        assertEquals(1.0, unit.getNorm(), 1e-9); // Norm should be 1
        assertEquals(0.6, unit.getEntry(0), 1e-9); // 3/5
        assertEquals(0.8, unit.getEntry(1), 1e-9); // 4/5
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitVectorZeroNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 0.0});
        v.unitVector();
    }

    @Test
    public void testUnitize() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, 4.0});
        v.unitize();
        assertEquals(1.0, v.getNorm(), 1e-9); // Norm should be 1
        assertEquals(0.6, v.getEntry(0), 1e-9); // 3/5
        assertEquals(0.8, v.getEntry(1), 1e-9); // 4/5
    }

    @Test(expected = ArithmeticException.class)
    public void testUnitizeZeroNorm() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 0.0});
        v.unitize();
    }

    @Test
    public void testProjectionRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector v2 = new ArrayRealVector(new double[]{3.0, 0.0});
        RealVector proj = v1.projection(v2);
        // projection of v1 onto v2 = (v1.v2 / v2.v2) * v2
        // v1.v2 = 3.0
        // v2.v2 = 9.0
        // proj = (3/9) * [3, 0] = (1/3) * [3, 0] = [1, 0]
        assertEquals(3, proj.getDimension());
        assertEquals(1.0, proj.getEntry(0), 1e-9);
        assertEquals(0.0, proj.getEntry(1), 1e-9);
    }

    @Test
    public void testProjectionDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] v2 = {3.0, 0.0};
        RealVector proj = v1.projection(v2);
        assertEquals(3, proj.getDimension());
        assertEquals(1.0, proj.getEntry(0), 1e-9);
        assertEquals(0.0, proj.getEntry(1), 1e-9);
    }

    @Test
    public void testProjectionArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 0.0});
        ArrayRealVector proj = v1.projection(v2);
        assertEquals(3, proj.getDimension());
        assertEquals(1.0, proj.getEntry(0), 1e-9);
        assertEquals(0.0, proj.getEntry(1), 1e-9);
    }

    @Test
    public void testOuterProductRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        RealMatrix result = v1.outerProduct(v2);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(3.0, result.getEntry(0, 0), 1e-9); // 1*3
        assertEquals(4.0, result.getEntry(0, 1), 1e-9); // 1*4
        assertEquals(6.0, result.getEntry(1, 0), 1e-9); // 2*3
        assertEquals(8.0, result.getEntry(1, 1), 1e-9); // 2*4
    }

    @Test
    public void testOuterProductArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        RealMatrix result = v1.outerProduct(v2);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(3.0, result.getEntry(0, 0), 1e-9);
        assertEquals(4.0, result.getEntry(0, 1), 1e-9);
        assertEquals(6.0, result.getEntry(1, 0), 1e-9);
        assertEquals(8.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testOuterProductDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] v2 = {3.0, 4.0};
        RealMatrix result = v1.outerProduct(v2);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(3.0, result.getEntry(0, 0), 1e-9);
        assertEquals(4.0, result.getEntry(0, 1), 1e-9);
        assertEquals(6.0, result.getEntry(1, 0), 1e-9);
        assertEquals(8.0, result.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testGetEntry() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        assertEquals(2.0, v.getEntry(1), 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryInvalidIndex() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.getEntry(2);
    }

    @Test
    public void testGetDimension() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        assertEquals(3, v.getDimension());
    }

    @Test
    public void testAppendRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        RealVector result = v1.append(v2);
        assertEquals(4, result.getDimension());
        assertEquals(1.0, result.getEntry(0), 1e-9);
        assertEquals(2.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
        assertEquals(4.0, result.getEntry(3), 1e-9);
    }

    @Test
    public void testAppendArrayRealVector() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{3.0, 4.0});
        ArrayRealVector result = v1.append(v2);
        assertEquals(4, result.getDimension());
        assertEquals(1.0, result.getEntry(0), 1e-9);
        assertEquals(2.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
        assertEquals(4.0, result.getEntry(3), 1e-9);
    }

    @Test
    public void testAppendDouble() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector result = v1.append(3.0);
        assertEquals(3, result.getDimension());
        assertEquals(1.0, result.getEntry(0), 1e-9);
        assertEquals(2.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
    }

    @Test
    public void testAppendDoubleArray() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] v2 = {3.0, 4.0};
        RealVector result = v1.append(v2);
        assertEquals(4, result.getDimension());
        assertEquals(1.0, result.getEntry(0), 1e-9);
        assertEquals(2.0, result.getEntry(1), 1e-9);
        assertEquals(3.0, result.getEntry(2), 1e-9);
        assertEquals(4.0, result.getEntry(3), 1e-9);
    }

    @Test
    public void testGetSubVector() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        RealVector sub = v.getSubVector(1, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), 1e-9);
        assertEquals(3.0, sub.getEntry(1), 1e-9);
    }

    @Test
    public void testGetSubVectorFromZero() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        RealVector sub = v.getSubVector(0, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(1.0, sub.getEntry(0), 1e-9);
        assertEquals(2.0, sub.getEntry(1), 1e-9);
    }

    @Test
    public void testGetSubVectorToEnd() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        RealVector sub = v.getSubVector(2, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(3.0, sub.getEntry(0), 1e-9);
        assertEquals(4.0, sub.getEntry(1), 1e-9);
    }

    @Test
    public void testGetSubVectorSingleElement() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        RealVector sub = v.getSubVector(1, 1);
        assertEquals(1, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVectorInvalidIndex() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.getSubVector(2, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVectorInvalidSize() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.getSubVector(0, 3);
    }

    @Test
    public void testSetEntry() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        v.setEntry(1, 5.0);
        assertEquals(5.0, v.getEntry(1), 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetEntryInvalidIndex() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.setEntry(2, 5.0);
    }

    @Test
    public void testSetSubVectorRealVector() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        RealVector sub = new ArrayRealVector(new double[]{5.0, 6.0});
        v.setSubVector(1, sub);
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(5.0, v.getEntry(1), 1e-9);
        assertEquals(6.0, v.getEntry(2), 1e-9);
        assertEquals(4.0, v.getEntry(3), 1e-9);
    }

    @Test
    public void testSetSubVectorDoubleArray() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        double[] sub = {5.0, 6.0};
        v.setSubVector(1, sub);
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(5.0, v.getEntry(1), 1e-9);
        assertEquals(6.0, v.getEntry(2), 1e-9);
        assertEquals(4.0, v.getEntry(3), 1e-9);
    }

    @Test
    public void testSetSubVectorFromEnd() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        double[] sub = {5.0, 6.0};
        v.setSubVector(2, sub);
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(2.0, v.getEntry(1), 1e-9);
        assertEquals(5.0, v.getEntry(2), 1e-9);
        assertEquals(6.0, v.getEntry(3), 1e-9);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVectorInvalidIndex() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] sub = {3.0, 4.0};
        v.setSubVector(1, sub); // index + sub.length > v.length
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVectorInvalidSize() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        double[] sub = {3.0, 4.0, 5.0};
        v.setSubVector(0, sub); // sub.length > v.length
    }

    @Test
    public void testSetDouble() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        v.set(5.0);
        assertEquals(5.0, v.getEntry(0), 1e-9);
        assertEquals(5.0, v.getEntry(1), 1e-9);
        assertEquals(5.0, v.getEntry(2), 1e-9);
    }

    @Test
    public void testSetDoubleForZeroVector() {
        ArrayRealVector v = new ArrayRealVector(0);
        v.set(5.0);
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testToArray() {
        double[] data = {1.0, 2.0, 3.0};
        ArrayRealVector v = new ArrayRealVector(data);
        double[] result = v.toArray();
        assertArrayEquals(data, result, 1e-9);
        // Ensure it's a copy
        result[0] = 99.0;
        assertEquals(1.0, v.getEntry(0), 1e-9);
    }

    @Test
    public void testToString() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        // Default format is typically "[1.0, 2.0, 3.0]" or similar.
        // The exact format depends on RealVectorFormat.getInstance(), which is not fully specified here.
        // We'll check for the presence of values.
        String str = v.toString();
        assertTrue(str.contains("1.0"));
        assertTrue(str.contains("2.0"));
        assertTrue(str.contains("3.0"));
    }

    @Test
    public void testIsNaN_noNaN() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        assertFalse(v.isNaN());
    }

    @Test
    public void testIsNaN_withNaN() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, Double.NaN, 3.0});
        assertTrue(v.isNaN());
    }

    @Test
    public void testIsNaN_emptyVector() {
        ArrayRealVector v = new ArrayRealVector();
        assertFalse(v.isNaN());
    }

    @Test
    public void testIsInfinite_noInfinite() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        assertFalse(v.isInfinite());
    }

    @Test
    public void testIsInfinite_withPositiveInfinity() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, Double.POSITIVE_INFINITY});
        assertTrue(v.isInfinite());
    }

    @Test
    public void testIsInfinite_withNegativeInfinity() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, Double.NEGATIVE_INFINITY});
        assertTrue(v.isInfinite());
    }

    @Test
    public void testIsInfinite_withNaN_shouldReturnFalse() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, Double.NaN});
        assertFalse(v.isInfinite()); // isNaN check happens first
    }

    @Test
    public void testIsInfinite_emptyVector() {
        ArrayRealVector v = new ArrayRealVector();
        assertFalse(v.isInfinite());
    }

    @Test
    public void testEquals_sameInstance() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        assertTrue(v.equals(v));
    }

    @Test
    public void testEquals_null() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        assertFalse(v.equals(null));
    }

    @Test
    public void testEquals_differentType() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        assertFalse(v.equals(new Object()));
    }

    @Test
    public void testEquals_sameContent() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0});
        assertTrue(v1.equals(v2));
    }

    @Test
    public void testEquals_differentContent() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 3.0});
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_differentDimension() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_withNaN() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        assertTrue(v1.equals(v2)); // NaN == NaN according to equals contract
    }

    @Test
    public void testEquals_withNaN_andDifferentValue() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0});
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_withNaN_vsNonNaN() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        assertTrue(v1.equals(v2));
    }

    @Test
    public void testHashCode_sameContent() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 2.0});
        assertEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testHashCode_differentContent() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, 3.0});
        assertNotEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testHashCode_withNaN() {
        ArrayRealVector v1 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        ArrayRealVector v2 = new ArrayRealVector(new double[]{1.0, Double.NaN});
        assertEquals(v1.hashCode(), v2.hashCode());
    }

    @Test
    public void testMapAdd() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector result = v.mapAdd(3.0);
        assertEquals(4.0, result.getEntry(0), 1e-9);
        assertEquals(5.0, result.getEntry(1), 1e-9);
        // Ensure original is unchanged
        assertEquals(1.0, v.getEntry(0), 1e-9);
    }

    @Test
    public void testSetSubVectorArrayRealVector() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        ArrayRealVector sub = new ArrayRealVector(new double[]{5.0, 6.0});
        v.set(1, sub); // Use the ArrayRealVector specific set method
        assertEquals(1.0, v.getEntry(0), 1e-9);
        assertEquals(5.0, v.getEntry(1), 1e-9);
        assertEquals(6.0, v.getEntry(2), 1e-9);
        assertEquals(4.0, v.getEntry(3), 1e-9);
    }
}
```