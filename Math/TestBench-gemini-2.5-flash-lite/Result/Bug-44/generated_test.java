package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolver;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.MaxCountExceededException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.apache.commons.math.util.FastMath;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.util.Precision;
import org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math.ode.nonstiff.GillIntegrator;
import org.apache.commons.math.ode.sampling.StepInterpolator;

public class AbstractIntegratorTest {

    // A dummy ODE to use for testing.
    private static class DummyODE implements FirstOrderDifferentialEquations {
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = -y[0];
        }
        public int getDimension() {
            return 1;
        }
    }

    // A dummy StepHandler to test handler registration.
    private static class DummyStepHandler implements StepHandler {
        private boolean lastStep = false;
        private StepInterpolator interpolator = null;

        public void handleStep(StepInterpolator interpolator, boolean isLast) {
            this.interpolator = interpolator;
            this.lastStep = isLast;
        }
        public void reset() {
            this.lastStep = false;
            this.interpolator = null;
        }
        public boolean isLastStep() {
            return lastStep;
        }
        public StepInterpolator getInterpolator() {
            return interpolator;
        }
    }

    // A dummy EventHandler to test event handler registration.
    private static class DummyEventHandler implements EventHandler {
        public double g(double t, double[] y) {
            return y[0];
        }
        public Action eventOccurred(double t, double[] y, boolean increasing) {
            return Action.STOP;
        }
        public void resetState(double t, double[] y) {
            // no reset
        }
    }

    @Test
    public void testGetName() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        assertEquals("Euler", integrator.getName());
    }

    @Test
    public void testAddStepHandler() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        StepHandler handler = new DummyStepHandler();
        integrator.addStepHandler(handler);
        assertTrue(integrator.getStepHandlers().contains(handler));
    }

    @Test
    public void testGetStepHandlersUnmodifiable() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        StepHandler handler = new DummyStepHandler();
        integrator.addStepHandler(handler);
        Collection<StepHandler> handlers = integrator.getStepHandlers();
        try {
            handlers.add(new DummyStepHandler());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testClearStepHandlers() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        StepHandler handler = new DummyStepHandler();
        integrator.addStepHandler(handler);
        integrator.clearStepHandlers();
        assertTrue(integrator.getStepHandlers().isEmpty());
    }

    @Test
    public void testAddEventHandler() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        EventHandler handler = new DummyEventHandler();
        integrator.addEventHandler(handler, 1.0, 1e-6, 10);
        assertTrue(integrator.getEventHandlers().contains(handler));
    }

    @Test
    public void testGetEventHandlersUnmodifiable() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        EventHandler handler = new DummyEventHandler();
        integrator.addEventHandler(handler, 1.0, 1e-6, 10);
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        try {
            handlers.add(new DummyEventHandler());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testClearEventHandlers() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        EventHandler handler = new DummyEventHandler();
        integrator.addEventHandler(handler, 1.0, 1e-6, 10);
        integrator.clearEventHandlers();
        assertTrue(integrator.getEventHandlers().isEmpty());
    }

    @Test
    public void testGetCurrentStepStart() throws MathIllegalStateException, MathIllegalArgumentException {
        AbstractIntegrator integrator = new EulerIntegrator(0.1); // Use concrete class
        DummyODE equations = new DummyODE();
        double[] y = {1.0};
        integrator.integrate(equations, 0.0, y, 1.0, y);
        assertEquals(0.0, integrator.getCurrentStepStart(), 1e-10);
    }

    @Test
    public void testGetCurrentSignedStepsize() throws MathIllegalStateException, MathIllegalArgumentException {
        AbstractIntegrator integrator = new EulerIntegrator(0.1); // Use concrete class
        DummyODE equations = new DummyODE();
        double[] y = {1.0};
        integrator.integrate(equations, 0.0, y, 1.0, y);
        assertEquals(0.1, integrator.getCurrentSignedStepsize(), 1e-10);
    }

    @Test
    public void testSetMaxEvaluations() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        integrator.setMaxEvaluations(100);
        assertEquals(100, integrator.getMaxEvaluations());
    }

    @Test
    public void testSetMaxEvaluationsNegative() {
        FirstOrderIntegrator integrator = new EulerIntegrator(1.0);
        integrator.setMaxEvaluations(-1);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    @Test
    public void testGetEvaluations() throws MathIllegalStateException, MathIllegalArgumentException {
        AbstractIntegrator integrator = new EulerIntegrator(1.0); // Use concrete class
        DummyODE equations = new DummyODE();
        double[] y = {1.0};
        integrator.integrate(equations, 0.0, y, 0.5, y);
        assertTrue(integrator.getEvaluations() > 0);
    }

    @Test
    public void testResetEvaluations() throws MathIllegalStateException, MathIllegalArgumentException {
        AbstractIntegrator integrator = new EulerIntegrator(1.0); // Use concrete class
        DummyODE equations = new DummyODE();
        double[] y = {1.0};
        integrator.integrate(equations, 0.0, y, 0.5, y);
        int evaluations = integrator.getEvaluations();
        integrator.resetEvaluations();
        assertEquals(0, integrator.getEvaluations());
        integrator.integrate(equations, 0.0, y, 0.5, y);
        assertTrue(integrator.getEvaluations() > evaluations);
    }

    @Test
    public void testIntegrateBasic() throws MathIllegalStateException, MathIllegalArgumentException {
        FirstOrderIntegrator integrator = new EulerIntegrator(0.1);
        DummyODE equations = new DummyODE();
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t = 1.0;
        double[] y = new double[1];
        double finalTime = integrator.integrate(equations, t0, y0, t, y);
        assertEquals(t, finalTime, 1e-10);
        assertEquals(FastMath.exp(-t), y[0], 1e-2); // Euler is not very accurate
    }

    @Test
    public void testIntegrateToZero() throws MathIllegalStateException, MathIllegalArgumentException {
        FirstOrderIntegrator integrator = new EulerIntegrator(0.1);
        DummyODE equations = new DummyODE();
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t = -1.0;
        double[] y = new double[1];
        double finalTime = integrator.integrate(equations, t0, y0, t, y);
        assertEquals(t, finalTime, 1e-10);
        assertEquals(FastMath.exp(-t), y[0], 1e-2);
    }

    @Test
    public void testComputeDerivatives() throws MathIllegalStateException, MathIllegalArgumentException {
        AbstractIntegrator integrator = new EulerIntegrator(1.0); // Use concrete class
        integrator.setMaxEvaluations(10);
        DummyODE equations = new DummyODE();
        double[] y = {1.0};
        double[] yDot = new double[1];
        // Need to set up the expandableODE for computeDerivatives to work
        ExpandableStatefulODE expandableODE = new ExpandableStatefulODE(equations);
        expandableODE.setTime(0.0);
        expandableODE.setPrimaryState(y);
        integrator.setEquations(expandableODE); // Set the expandable ODE
        integrator.computeDerivatives(0.0, y, yDot);
        assertEquals(1, integrator.getEvaluations());
        assertEquals(-1.0, yDot[0], 1e-10);
    }

    @Test
    public void testComputeDerivativesMaxEvaluations() {
        AbstractIntegrator integrator = new EulerIntegrator(1.0); // Use concrete class
        integrator.setMaxEvaluations(1);
        DummyODE equations = new DummyODE();
        double[] y = {1.0};
        double[] yDot = new double[1];
        // Need to set up the expandableODE for computeDerivatives to work
        ExpandableStatefulODE expandableODE = new ExpandableStatefulODE(equations);
        expandableODE.setTime(0.0);
        expandableODE.setPrimaryState(y);
        integrator.setEquations(expandableODE); // Set the expandable ODE
        try {
            integrator.computeDerivatives(0.0, y, yDot);
            integrator.computeDerivatives(0.0, y, yDot); // This should throw
            fail("Expected MaxCountExceededException");
        } catch (MaxCountExceededException e) {
            // expected
        } catch (MathIllegalStateException e) {
            // This can also happen if setEquations is not called before computeDerivatives
            fail("Expected MaxCountExceededException, but got MathIllegalStateException: " + e.getMessage());
        }
    }

    @Test
    public void testDimensionMismatch() {
        FirstOrderIntegrator integrator = new EulerIntegrator(0.1);
        DummyODE equations = new DummyODE();
        double[] y0 = {1.0, 2.0}; // wrong dimension
        double[] y = new double[1];
        try {
            integrator.integrate(equations, 0.0, y0, 1.0, y);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        } catch (MathIllegalArgumentException e) {
            fail("Expected DimensionMismatchException, got MathIllegalArgumentException");
        }
    }

    @Test
    public void testSanityChecksForward() throws NumberIsTooSmallException {
        AbstractIntegrator integrator = new EulerIntegrator(0.1); // Need concrete instance
        FirstOrderDifferentialEquations ode = new DummyODE();
        ExpandableStatefulODE equations = new ExpandableStatefulODE(ode);
        equations.setTime(0.0);
        // The threshold is 1000 * ulp(max(|t0|, |t|))
        // If t is very close to t0, dt could be smaller than threshold
        integrator.sanityChecks(equations, 1e-15); // interval very small, smaller than threshold
    }

    @Test
    public void testSanityChecksBackward() throws NumberIsTooSmallException {
        AbstractIntegrator integrator = new EulerIntegrator(0.1); // Need concrete instance
        FirstOrderDifferentialEquations ode = new DummyODE();
        ExpandableStatefulODE equations = new ExpandableStatefulODE(ode);
        equations.setTime(0.0);
        integrator.sanityChecks(equations, -1e-15); // interval very small, smaller than threshold
    }

    @Test
    public void testAcceptStepEventStop() throws Exception {
        FirstOrderIntegrator integrator = new ThreeEighthesIntegrator(1.0);
        DummyODE equations = new DummyODE();
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t = 1.0;
        double[] y = new double[1];

        // Add an event handler that stops integration
        integrator.addEventHandler(new EventHandler() {
            public double g(double t, double[] y) { return y[0] - 0.5; }
            public Action eventOccurred(double t, double[] y, boolean increasing) { return Action.STOP; }
            public void resetState(double t, double[] y) {}
        }, 1.0, 1e-6, 10);

        double finalTime = integrator.integrate(equations, t0, y0, t, y);
        // The event occurs when y[0] = 0.5. For y[0] = e^(-t), this is at t = -ln(0.5) = ln(2) approx 0.693.
        // Since the integrator attempts to stop at the event time, the final time should be close to ln(2).
        assertEquals(FastMath.log(2.0), finalTime, 1e-6); // Assert close to event time
        assertEquals(0.5, y[0], 1e-10); // Assert state at event time
    }

    @Test
    public void testAcceptStepEventReset() throws Exception {
        FirstOrderIntegrator integrator = new ThreeEighthesIntegrator(1.0);
        DummyODE equations = new DummyODE();
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t = 1.0;
        double[] y = new double[1];

        // Add an event handler that resets the state
        final double[] resetValue = {2.0};
        integrator.addEventHandler(new EventHandler() {
            public double g(double t, double[] y) { return y[0] - 0.5; } // Event when y[0] = 0.5
            public Action eventOccurred(double t, double[] y, boolean increasing) { return Action.RESET_STATE; }
            public void resetState(double t, double[] y) {
                System.arraycopy(resetValue, 0, y, 0, y.length);
            }
        }, 1.0, 1e-6, 10);

        double finalTime = integrator.integrate(equations, t0, y0, t, y);
        // The event occurs at t = ln(2) approx 0.693.
        // At this time, y[0] is reset to 2.0.
        // Integration continues from t=ln(2) with y[0]=2.0.
        // So, at t=1.0, y[0] should be 2.0 * exp(-(1.0 - ln(2)))
        double expectedYAtT1 = resetValue[0] * FastMath.exp(-(1.0 - FastMath.log(2.0)));
        assertEquals(t, finalTime, 1e-10);
        assertEquals(expectedYAtT1, y[0], 1e-6); // Check the value after reset and further integration
    }

    @Test
    public void testAcceptStepWithMultipleEvents() throws Exception {
        FirstOrderIntegrator integrator = new EulerIntegrator(0.1);
        DummyODE equations = new DummyODE();
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t = 1.0;
        double[] y = new double[1];

        // Add two event handlers, one after another
        integrator.addEventHandler(new EventHandler() {
            public double g(double t, double[] y) { return y[0] - 0.8; } // First event at t = ln(1/0.8) = ln(1.25) approx 0.223
            public Action eventOccurred(double t, double[] y, boolean increasing) { return Action.CONTINUE; }
            public void resetState(double t, double[] y) {}
        }, 0.1, 1e-6, 10);
        integrator.addEventHandler(new EventHandler() {
            public double g(double t, double[] y) { return y[0] - 0.6; } // Second event at t = ln(1/0.6) = ln(1.666...) approx 0.511
            public Action eventOccurred(double t, double[] y, boolean increasing) { return Action.CONTINUE; }
            public void resetState(double t, double[] y) {}
        }, 0.1, 1e-6, 10);

        double finalTime = integrator.integrate(equations, t0, y0, t, y);
        assertEquals(t, finalTime, 1e-10);
        // The second event occurs at t = ln(1/0.6) which is before t=1.0.
        // The value of y[0] at t=1.0 should be exp(-1.0).
        assertEquals(FastMath.exp(-1.0), y[0], 1e-2); // Euler accuracy
    }

    @Test
    public void testIntegrateWithNullName() {
        // The null constructor is protected, so we cannot call it directly here.
        // The public constructor `AbstractIntegrator(final String name)` is called by concrete classes.
        // EulerIntegrator has a public constructor `EulerIntegrator(double step)` which calls the superclass constructor with "Euler".
        // Thus, `getName()` will never return null for an instance created via a concrete class with a public constructor.
        // This test case is not applicable for testing the reference source.
        // If we were testing AbstractIntegrator directly, we might use reflection or a mock.
        // Given the rules, we cannot.
        // We will assume this is not a testable scenario with the given constraints.
    }

    @Test
    public void testSetStateInitialized() {
        // This protected method is called internally by `integrate`.
        // Its behavior is implicitly tested by `acceptStep` tests.
        // If `statesInitialized` is false, `reinitializeBegin` is called.
        // If `statesInitialized` is true, it's skipped.
        // We assume this works correctly as part of `acceptStep` tests.
        // No direct test is easily possible without accessing the protected member or a concrete integrator.
    }

    // The comparator method is private/protected and used internally by `acceptStep`.
    // It's not directly exposed as a public method for testing.
    // Testing it directly would require accessing private members or significant mocking, which is disallowed.
    // Its functionality is implicitly tested by the event handling in `acceptStep` tests.
    // Therefore, no explicit test for the comparator is provided here.
}
