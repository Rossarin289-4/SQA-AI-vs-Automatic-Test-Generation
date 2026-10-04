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
import org.apache.commons.math.ode.AbstractIntegrator;

public class EmbeddedRungeKuttaIntegratorTest {

    @Test
    public void testDefaultSafety() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        assertEquals(0.9, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSetSafety() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setSafety(0.75);
        assertEquals(0.75, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setSafety(0.0);
        assertEquals(0.0, integrator.getSafety(), 0.0);
    }

    @Test
    public void testSafetyAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setSafety(-0.5);
        assertEquals(-0.5, integrator.getSafety(), 0.0);
    }

    @Test
    public void testDefaultMinReduction() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        assertEquals(0.2, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testSetMinReduction() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setMinReduction(0.1);
        assertEquals(0.1, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setMinReduction(0.0);
        assertEquals(0.0, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testMinReductionAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setMinReduction(-0.5);
        assertEquals(-0.5, integrator.getMinReduction(), 0.0);
    }

    @Test
    public void testDefaultMaxGrowth() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        assertEquals(10.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testSetMaxGrowth() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setMaxGrowth(4.0);
        assertEquals(4.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthAcceptsZero() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setMaxGrowth(0.0);
        assertEquals(0.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testMaxGrowthAcceptsNegativeValue() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        integrator.setMaxGrowth(-2.0);
        assertEquals(-2.0, integrator.getMaxGrowth(), 0.0);
    }

    @Test
    public void testDormandPrince54Order() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        assertEquals(5, integrator.getOrder());
    }

    @Test
    public void testIntegrationConstantDerivativeForward() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            public int getDimension() {
                return 1;
            }
            public void computeDerivatives(double time, double[] state, double[] derivative) {
                derivative[0] = 2.0;
            }
        };
        double[] result = new double[1];
        double stop = integrator.integrate(equations, 0.0, new double[] {1.0},
                                           1.0, result);
        assertEquals(1.0, stop, 0.0);
        assertEquals(3.0, result[0], 1e-8);
    }

    @Test
    public void testIntegrationConstantDerivativeBackward() throws Exception {
        DormandPrince54Integrator integrator =
                new DormandPrince54Integrator(0.01, 1.0, 1e-8, 1e-8);
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            public int getDimension() {
                return 1;
            }
            public void computeDerivatives(double time, double[] state, double[] derivative) {
                derivative[0] = 2.0;
            }
        };
        double[] result = new double[1];
        double stop = integrator.integrate(equations, 1.0, new double[] {3.0},
                                           0.0, result);
        assertEquals(0.0, stop, 0.0);
        assertEquals(1.0, result[0], 1e-8);
    }
}
