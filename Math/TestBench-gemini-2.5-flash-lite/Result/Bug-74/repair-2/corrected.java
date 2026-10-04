package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.IntegratorException;
import org.apache.commons.math.ode.events.CombinedEventsManager;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;

public class EmbeddedRungeKuttaIntegratorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSetGetSafety() {
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        double initialSafety = integrator.getSafety();
        integrator.setSafety(0.8);
        assertEquals(0.8, integrator.getSafety(), 1e-9);
        integrator.setSafety(initialSafety);
        assertEquals(initialSafety, integrator.getSafety(), 1e-9);
    }

    @Test
    public void testSetGetMinReduction() {
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        double initialMinReduction = integrator.getMinReduction();
        integrator.setMinReduction(0.3);
        assertEquals(0.3, integrator.getMinReduction(), 1e-9);
        integrator.setMinReduction(initialMinReduction);
        assertEquals(initialMinReduction, integrator.getMinReduction(), 1e-9);
    }

    @Test
    public void testSetGetMaxGrowth() {
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        double initialMaxGrowth = integrator.getMaxGrowth();
        integrator.setMaxGrowth(12.0);
        assertEquals(12.0, integrator.getMaxGrowth(), 1e-9);
        integrator.setMaxGrowth(initialMaxGrowth);
        assertEquals(initialMaxGrowth, integrator.getMaxGrowth(), 1e-9);
    }

    @Test
    public void testIntegrateSimpleODEForward() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 1;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = -y[0];
            }
        };
        double[] y0 = {1.0};
        double t0 = 0.0;
        double t = 1.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        integrator.addStepHandler(new StepHandler() {
            @Override
            public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast) throws DerivativeException {
            }
            @Override
            public void reset() {}
            @Override
            public boolean requiresDenseOutput() { return false; }
        });

        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-5);
        assertEquals(Math.exp(-t), y[0], 1e-5);
    }

    @Test
    public void testIntegrateSimpleODEBackward() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 1;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = -y[0];
            }
        };
        double[] y0 = {Math.exp(-1.0)};
        double t0 = 1.0;
        double t = 0.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        integrator.addStepHandler(new StepHandler() {
            @Override
            public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast) throws DerivativeException {
            }
            @Override
            public void reset() {}
            @Override
            public boolean requiresDenseOutput() { return false; }
        });

        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-5);
        assertEquals(1.0, y[0], 1e-5);
    }

    @Test
    public void testIntegrateTwoBodyProblemForward() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 4;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                double r2 = y[0] * y[0] + y[2] * y[2];
                double r3 = r2 * Math.sqrt(r2);
                yDot[0] = y[1];
                yDot[1] = -y[0] / r3;
                yDot[2] = y[3];
                yDot[3] = -y[2] / r3;
            }
        };

        double[] y0 = {1.0, 0.0, 0.0, 1.0};
        double t0 = 0.0;
        double t = 2.0 * Math.PI;
        double[] y = new double[4];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-8, 1e-8);
        integrator.addStepHandler(new StepHandler() {
            @Override
            public void handleStep(org.apache.commons.math.ode.sampling.StepInterpolator interpolator, boolean isLast) throws DerivativeException {
            }
            @Override
            public void reset() {}
            @Override
            public boolean requiresDenseOutput() { return false; }
        });

        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-4);
        assertEquals(y0[0], y[0], 1e-4);
        assertEquals(y0[1], y[1], 1e-4);
        assertEquals(y0[2], y[2], 1e-4);
        assertEquals(y0[3], y[3], 1e-4);
        double finalEnergy = 0.5 * (y[1]*y[1] + y[3]*y[3]) - 1.0 / Math.sqrt(y[0]*y[0] + y[2]*y[2]);
        assertEquals(-0.5, finalEnergy, 1e-4);
    }

    @Test
    public void testIntegrateZeroInitialState() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 1;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = t;
            }
        };
        double[] y0 = {0.0};
        double t0 = 0.0;
        double t = 1.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-5);
        assertEquals(0.5, y[0], 1e-5);
    }

    @Test
    public void testIntegrateWithEvent() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 1;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = 1.0;
            }
        };
        double[] y0 = {0.0};
        double t0 = 0.0;
        double t = 10.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);

        integrator.addEventHandler(new EventHandler() {
            @Override
            public void reset() {}
            @Override
            public double g(double t, double[] y) throws DerivativeException {
                return y[0] - 5.0;
            }
            @Override
            public EventHandler.Action eventOccurred(double t, double[] y, boolean increasing) throws DerivativeException {
                return EventHandler.Action.STOP;
            }
        }, 0.1, 1e-6, 100);

        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(5.0, stopTime, 1e-5);
        assertEquals(5.0, y[0], 1e-5);
    }

    @Test
    public void testIntegrateWithEventAndRecompute() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 1;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = t > 5.0 ? -1.0 : 1.0;
            }
        };
        double[] y0 = {0.0};
        double t0 = 0.0;
        double t = 10.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);

        integrator.addEventHandler(new EventHandler() {
            @Override
            public void reset() {}
            @Override
            public double g(double t, double[] y) throws DerivativeException {
                return y[0] - 5.0;
            }
            @Override
            public EventHandler.Action eventOccurred(double t, double[] y, boolean increasing) throws DerivativeException {
                return EventHandler.Action.RESET_DERIVATIVES;
            }
        }, 0.1, 1e-6, 100);

        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-4);
        assertEquals(0.0, y[0], 1e-4);
    }


    @Test
    public void testIntegratorExceptionOnNullEquations() {
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        try {
            integrator.integrate(null, 0.0, new double[]{1.0}, 1.0, new double[1]);
            fail("Expected IntegratorException for null equations");
        } catch (IntegratorException expected) {
            // Expected
        } catch (DerivativeException e) {
            fail("Unexpected DerivativeException");
        }
    }

    @Test
    public void testIntegratorExceptionOnNullY0() {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 1; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException { yDot[0] = 1; }
        };
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        try {
            integrator.integrate(equations, 0.0, null, 1.0, new double[1]);
            fail("Expected IntegratorException for null y0");
        } catch (IntegratorException expected) {
            // Expected
        } catch (DerivativeException e) {
            fail("Unexpected DerivativeException");
        }
    }

    @Test
    public void testIntegratorExceptionOnNullY() {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 1; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException { yDot[0] = 1; }
        };
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        try {
            integrator.integrate(equations, 0.0, new double[]{1.0}, 1.0, null);
            fail("Expected IntegratorException for null y");
        } catch (IntegratorException expected) {
            // Expected
        } catch (DerivativeException e) {
            fail("Unexpected DerivativeException");
        }
    }

    @Test
    public void testIntegratorExceptionOnInconsistentDimensions() {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 2; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException { yDot[0] = y[0]; yDot[1] = y[1]; }
        };
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        try {
            integrator.integrate(equations, 0.0, new double[]{1.0}, 1.0, new double[1]);
            fail("Expected IntegratorException for inconsistent dimensions");
        } catch (IntegratorException expected) {
            // Expected
        } catch (DerivativeException e) {
            fail("Unexpected DerivativeException");
        }
    }

    @Test
    public void testSetMinReductionEdgeCases() {
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        integrator.setMinReduction(0.1);
        assertEquals(0.1, integrator.getMinReduction(), 1e-9);
        integrator.setMinReduction(1.0);
        assertEquals(1.0, integrator.getMinReduction(), 1e-9);
    }

    @Test
    public void testMaxGrowthEdgeCases() {
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        integrator.setMaxGrowth(10.0);
        assertEquals(10.0, integrator.getMaxGrowth(), 1e-9);
        integrator.setMaxGrowth(1.0);
        assertEquals(1.0, integrator.getMaxGrowth(), 1e-9);
    }

    @Test
    public void testSafetyFactorRange() {
        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        integrator.setSafety(0.9);
        assertEquals(0.9, integrator.getSafety(), 1e-9);
        integrator.setSafety(1.0);
        assertEquals(1.0, integrator.getSafety(), 1e-9);
        integrator.setSafety(0.0);
        assertEquals(0.0, integrator.getSafety(), 1e-9);
    }

    @Test
    public void testIntegrateWithZeroStepSize() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 1; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = 0.0;
            }
        };
        double[] y0 = {0.0};
        double t0 = 0.0;
        double t = 1.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-10, 1e-10, 1e-10, 1e-10);
        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t0, stopTime, 1e-10);
        assertEquals(0.0, y[0], 1e-10);
    }

    @Test
    public void testIntegrateWithVerySmallTimeSpan() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 1; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = -y[0];
            }
        };
        double[] y0 = {1.0};
        double t0 = 0.0;
        double t = 1e-9;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-10, 1.0, 1e-10, 1e-10);
        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-12);
        assertEquals(Math.exp(-t), y[0], 1e-12);
    }


    @Test
    public void testHighamHall54() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 1;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = -y[0];
            }
        };
        double[] y0 = {1.0};
        double t0 = 0.0;
        double t = 1.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new HighamHall54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-5);
        assertEquals(Math.exp(-t), y[0], 1e-5);
    }

    @Test
    public void testDormandPrince853() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() {
                return 1;
            }

            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = -y[0];
            }
        };
        double[] y0 = {1.0};
        double t0 = 0.0;
        double t = 1.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince853Integrator(1e-6, 1.0, 1e-6, 1e-6);
        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-6);
        assertEquals(Math.exp(-t), y[0], 1e-6);
    }

    @Test
    public void testMaximalStepSizeLimit() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 1; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = 1.0;
            }
        };
        double[] y0 = {0.0};
        double t0 = 0.0;
        double t = 10.0;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 0.5, 1e-6, 1e-6);
        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-5);
        assertEquals(10.0, y[0], 1e-5);
    }

    @Test
    public void testMinimalStepSizeLimit() throws Exception {
        FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {
            @Override
            public int getDimension() { return 1; }
            @Override
            public void computeDerivatives(double t, double[] y, double[] yDot) throws DerivativeException {
                yDot[0] = 1.0;
            }
        };
        double[] y0 = {0.0};
        double t0 = 0.0;
        double t = 1e-8;
        double[] y = new double[1];

        EmbeddedRungeKuttaIntegrator integrator = new DormandPrince54Integrator(1e-6, 1.0, 1e-6, 1e-6);
        double stopTime = integrator.integrate(equations, t0, y0, t, y);

        assertEquals(t, stopTime, 1e-10);
        assertEquals(t, y[0], 1e-10);
    }
}
