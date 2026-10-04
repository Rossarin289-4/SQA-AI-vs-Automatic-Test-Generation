package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.util.FastMath;

public class EmbeddedRungeKuttaIntegratorTest {
    @Test
    public void testDefaultControlParameters() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        assertEquals(0.9, integrator.getSafety(), 0.0);
        assertEquals(0.2, integrator.getMinReduction(), 0.0);
        assertEquals(10.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testSafetySetterAndGetter() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setSafety(0.5);
        assertEquals(0.5, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setSafety(0.0);
        assertEquals(0.0, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setSafety(-1.0);
        assertEquals(-1.0, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsValueAboveOne() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setSafety(2.0);
        assertEquals(2.0, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsNaN() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setSafety(Double.NaN);
        assertTrue(Double.isNaN(integrator.getSafety()));
    }

    @Test
    public void testMinReductionSetterAndGetter() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMinReduction(0.4);
        assertEquals(0.4, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMinReduction(0.0);
        assertEquals(0.0, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMinReduction(-1.0);
        assertEquals(-1.0, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionAcceptsValueAboveOne() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMinReduction(2.0);
        assertEquals(2.0, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMaxGrowthSetterAndGetter() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMaxGrowth(3.0);
        assertEquals(3.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMaxGrowth(0.0);
        assertEquals(0.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMaxGrowth(-1.0);
        assertEquals(-1.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthAcceptsNaN() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        integrator.setMaxGrowth(Double.NaN);
        assertTrue(Double.isNaN(integrator.getMaxGrowth()));
    }

    @Test
    public void testDormandPrince54Order() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        assertEquals(5, integrator.getOrder());
    }

    @Test
    public void testDormandPrince853Order() throws Exception {
        DormandPrince853Integrator integrator =
                new DormandPrince853Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        assertEquals(8, integrator.getOrder());
    }

    @Test
    public void testHighamHall54Order() throws Exception {
        HighamHall54Integrator integrator =
                new HighamHall54Integrator(1.0e-6, 1.0, 1.0e-6, 1.0e-6);
        assertEquals(5, integrator.getOrder());
    }
}
