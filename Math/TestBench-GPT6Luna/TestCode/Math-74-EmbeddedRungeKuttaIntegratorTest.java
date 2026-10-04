package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.CombinedEventsManager;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;

public class EmbeddedRungeKuttaIntegratorTest {
    @Test
    public void testDefaultSafety() throws Exception {
        assertEquals(0.9, new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6).getSafety(), 0.0);
    }

    @Test
    public void testSafetyCanBeSet() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setSafety(0.75);
        assertEquals(0.75, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setSafety(0.0);
        assertEquals(0.0, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setSafety(-2.0);
        assertEquals(-2.0, integrator.getSafety(), 0.0);
    }

    @Test
    public void testDefaultMinReduction() throws Exception {
        assertEquals(0.2, new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6).getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionCanBeSet() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setMinReduction(0.4);
        assertEquals(0.4, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setMinReduction(0.0);
        assertEquals(0.0, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setMinReduction(-1.0);
        assertEquals(-1.0, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testDefaultMaxGrowth() throws Exception {
        assertEquals(10.0, new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6).getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthCanBeSet() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setMaxGrowth(3.0);
        assertEquals(3.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setMaxGrowth(0.0);
        assertEquals(0.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        integrator.setMaxGrowth(-4.0);
        assertEquals(-4.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testIntegrateConstantDerivativeForward() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            public int getDimension() { return 1; }
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = 1.0;
            }
        };
        double[] result = { 0.0 };
        assertEquals(1.0, integrator.integrate(equations, 0.0, new double[] { 2.0 }, 1.0, result), 0.0);
        assertEquals(3.0, result[0], 1e-9);
    }

    @Test
    public void testIntegrateConstantDerivativeBackward() throws Exception {
        DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.01, 1.0, 1e-6, 1e-6);
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            public int getDimension() { return 1; }
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = 1.0;
            }
        };
        double[] result = { 0.0 };
        assertEquals(0.0, integrator.integrate(equations, 1.0, new double[] { 3.0 }, 0.0, result), 0.0);
        assertEquals(2.0, result[0], 1e-9);
    }
}
