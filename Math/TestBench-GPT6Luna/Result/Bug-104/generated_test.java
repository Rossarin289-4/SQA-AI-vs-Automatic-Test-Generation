package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.util.ContinuedFraction;

public class GammaTest {
    @Test
    public void testLogGammaAtOne() throws Exception {
        assertEquals(0.0, Gamma.logGamma(1.0), 1e-14);
    }

    @Test
    public void testLogGammaAtTwo() throws Exception {
        assertEquals(0.0, Gamma.logGamma(2.0), 1e-14);
    }

    @Test
    public void testLogGammaAtThree() throws Exception {
        assertEquals(Math.log(2.0), Gamma.logGamma(3.0), 1e-14);
    }

    @Test
    public void testLogGammaAtHalf() throws Exception {
        assertEquals(0.5 * Math.log(Math.PI), Gamma.logGamma(0.5), 1e-14);
    }

    @Test
    public void testLogGammaZeroIsNaN() throws Exception {
        assertTrue(Double.isNaN(Gamma.logGamma(0.0)));
    }

    @Test
    public void testLogGammaNegativeIsNaN() throws Exception {
        assertTrue(Double.isNaN(Gamma.logGamma(-1.0)));
    }

    @Test
    public void testLogGammaNaNIsNaN() throws Exception {
        assertTrue(Double.isNaN(Gamma.logGamma(Double.NaN)));
    }

    @Test
    public void testGammaPAtZero() throws Exception {
        assertEquals(0.0, Gamma.regularizedGammaP(2.0, 0.0), 0.0);
    }

    @Test
    public void testGammaQAtZero() throws Exception {
        assertEquals(1.0, Gamma.regularizedGammaQ(2.0, 0.0), 0.0);
    }

    @Test
    public void testGammaPRejectsInvalidParametersWithNaN() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(0.0, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(2.0, -1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(Double.NaN, 1.0)));
    }

    @Test
    public void testGammaQRejectsInvalidParametersWithNaN() throws Exception {
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(0.0, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(2.0, -1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(2.0, Double.NaN)));
    }

    @Test
    public void testGammaPForShapeOne() throws Exception {
        assertEquals(1.0 - Math.exp(-1.0),
                     Gamma.regularizedGammaP(1.0, 1.0), 1e-14);
    }

    @Test
    public void testGammaQForShapeOne() throws Exception {
        assertEquals(Math.exp(-1.0),
                     Gamma.regularizedGammaQ(1.0, 1.0), 1e-14);
    }

    @Test
    public void testGammaPUsesComplementWhenXExceedsShape() throws Exception {
        assertEquals(1.0 - Math.exp(-3.0),
                     Gamma.regularizedGammaP(1.0, 3.0), 1e-14);
    }

    @Test
    public void testGammaQUsesComplementBelowShape() throws Exception {
        assertEquals(Math.exp(-1.0),
                     Gamma.regularizedGammaQ(1.0, 1.0), 1e-14);
    }

    @Test
    public void testGammaPForShapeTwoAtOne() throws Exception {
        assertEquals(1.0 - 2.0 * Math.exp(-1.0),
                     Gamma.regularizedGammaP(2.0, 1.0), 1e-14);
    }

    @Test
    public void testGammaQForShapeTwoAtTwo() throws Exception {
        assertEquals(3.0 * Math.exp(-2.0),
                     Gamma.regularizedGammaQ(2.0, 2.0), 1e-14);
    }

    @Test
    public void testGammaPAtShapeBoundaryOne() throws Exception {
        assertEquals(1.0 - Math.exp(-1.0),
                     Gamma.regularizedGammaP(1.0, 1.0), 1e-14);
    }

    @Test
    public void testGammaQForShapeBelowOne() throws Exception {
        assertEquals(1.0 - Gamma.regularizedGammaP(0.5, 1.0),
                     Gamma.regularizedGammaQ(0.5, 1.0), 1e-14);
    }
}
