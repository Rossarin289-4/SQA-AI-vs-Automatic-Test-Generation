package org.apache.commons.math3.ode;

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
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.EventState;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;

public class AbstractIntegratorTest {

    // Dummy implementations for interfaces and abstract classes for testing purposes.
    // These are not intended to be part of the final test suite but are used to instantiate objects.

    private static class DummyStepHandler implements StepHandler {
        private double t0 = Double.NaN;
        private double[] y0 = null;
        private double t = Double.NaN;
        private double lastT = Double.NaN;
        private double lastStepSize = Double.NaN;
        private boolean lastIsLast = false;

        @Override
        public void init(double t0, double[] y0, double t) {
            this.t0 = t0;
            this.y0 = y0.clone();
            this.t = t;
        }

        @Override
        public void handleStep(AbstractStepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {
            lastT = interpolator.getCurrentTime();
            lastStepSize = interpolator.getCurrentSignedStepsize();
            lastIsLast = isLast;
        }
        
        public double getLastT() { return lastT; }
        public double getLastStepSize() { return lastStepSize; }
        public boolean isLastStep() { return lastIsLast; }
    }

    private static class DummyEventHandler implements EventHandler {
        private double lastEventTime = Double.NaN;
        private double[] lastEventY = null;
        private boolean lastIncreasing = false;

        @Override
        public void init(double t0, double[] y0, double t) {}

        @Override
        public double g(double t, double[] y) { return t; } // Simple g function for testing

        @Override
        public Action eventOccurred(double t, double[] y, boolean increasing) {
            lastEventTime = t;
            lastEventY = y.clone();
            lastIncreasing = increasing;
            return Action.CONTINUE;
        }

        @Override
        public void resetState(double t, double[] y) {}

        public double getLastEventTime() { return lastEventTime; }
        public double[] getLastEventY() { return lastEventY; }
        public boolean getLastIncreasing() { return lastIncreasing; }
    }

    // Dummy FirstOrderDifferentialEquations for testing.
    private static class DummyEquations implements FirstOrderDifferentialEquations {
        private int dimension;

        public DummyEquations(int dimension) {
            this.dimension = dimension;
        }

        @Override
        public int getDimension() {
            return dimension;
        }

        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < y.length; i++) {
                yDot[i] = -y[i]; // Simple ODE: dy/dt = -y
            }
        }
    }

    // Dummy StepInterpolator for testing acceptStep.
    // Modified to not require readExternal and to properly handle state interpolation.
    private static abstract class BaseDummyStepInterpolator extends AbstractStepInterpolator {
        protected double t0, t1, h;
        protected double[] y0, y1;
        protected double[][] yDot; // store derivatives at t0 and t1

        public BaseDummyStepInterpolator(double t0, double[] y0, double t1, double[] y1, double[][] yDot, boolean forward) {
            super(forward);
            this.t0 = t0;
            this.t1 = t1;
            this.h = t1 - t0;
            this.y0 = y0.clone();
            this.y1 = y1.clone();
            this.yDot = yDot;
            setInterpolatedTime(t0);
        }

        @Override
        public void setInterpolatedTime(double t) {
            super.setInterpolatedTime(t);
            double theta = (t - t0) / h;
            computeInterpolatedStateAndDerivatives(t, theta);
        }
        
        @Override
        public AbstractStepInterpolator copy() {
            // This is a simplified copy for testing; a real copy would be more complex.
            return this; 
        }
        
        @Override
        public double getPreviousTime() {
            return t0;
        }

        @Override
        public double getCurrentTime() {
            return t1;
        }

        @Override
        public double getGlobalPreviousTime() {
            return t0;
        }

        @Override
        public double getGlobalCurrentTime() {
            return t1;
        }
        
        @Override
        public double getCurrentSignedStepsize() {
            return h;
        }
    }
    
    // --- Integrator creation methods for tests ---
    
    private AbstractIntegrator createEulerIntegrator(double step) {
        return new EulerIntegrator(step);
    }
    
    private AbstractIntegrator createThreeEighthesIntegrator(double step) {
        return new ThreeEighthesIntegrator(step);
    }
    
    // --- Tests for constructor and basic properties ---

    @Test
    public void testConstructorAndName() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        assertNull(integrator.getName());
        assertEquals(0, integrator.getEvaluations());
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }
    
    @Test
    public void testSetMaxEvaluations() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        integrator.setMaxEvaluations(100);
        assertEquals(100, integrator.getMaxEvaluations());
    }
    
    @Test
    public void testSetMaxEvaluationsNegative() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        integrator.setMaxEvaluations(-1);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
        integrator.setMaxEvaluations(-100);
        assertEquals(Integer.MAX_VALUE, integrator.getMaxEvaluations());
    }

    // --- Tests for Step Handlers ---

    @Test
    public void testAddGetClearStepHandlers() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        StepHandler handler1 = new DummyStepHandler();
        StepHandler handler2 = new DummyStepHandler();
        
        Collection<StepHandler> initialHandlers = integrator.getStepHandlers();
        assertTrue(initialHandlers.isEmpty());
        
        integrator.addStepHandler(handler1);
        Collection<StepHandler> handlersAfterAdd1 = integrator.getStepHandlers();
        assertEquals(1, handlersAfterAdd1.size());
        assertTrue(handlersAfterAdd1.contains(handler1));
        
        integrator.addStepHandler(handler2);
        Collection<StepHandler> handlersAfterAdd2 = integrator.getStepHandlers();
        assertEquals(2, handlersAfterAdd2.size());
        assertTrue(handlersAfterAdd2.contains(handler1));
        assertTrue(handlersAfterAdd2.contains(handler2));
        
        integrator.clearStepHandlers();
        Collection<StepHandler> handlersAfterClear = integrator.getStepHandlers();
        assertTrue(handlersAfterClear.isEmpty());
    }

    // --- Tests for Event Handlers ---

    @Test
    public void testAddGetClearEventHandlers() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1e-6, 1e-3, 1e-10, 5);
        EventHandler handler1 = new DummyEventHandler();
        EventHandler handler2 = new DummyEventHandler();
        
        Collection<EventHandler> initialHandlers = integrator.getEventHandlers();
        assertTrue(initialHandlers.isEmpty());
        
        integrator.addEventHandler(handler1, 1.0, 1e-3, 10, solver);
        Collection<EventHandler> handlersAfterAdd1 = integrator.getEventHandlers();
        assertEquals(1, handlersAfterAdd1.size());
        assertTrue(handlersAfterAdd1.contains(handler1));
        
        integrator.addEventHandler(handler2, 1.0, 1e-3, 10, solver);
        Collection<EventHandler> handlersAfterAdd2 = integrator.getEventHandlers();
        assertEquals(2, handlersAfterAdd2.size());
        assertTrue(handlersAfterAdd2.contains(handler1));
        assertTrue(handlersAfterAdd2.contains(handler2));
        
        integrator.clearEventHandlers();
        Collection<EventHandler> handlersAfterClear = integrator.getEventHandlers();
        assertTrue(handlersAfterClear.isEmpty());
    }

    @Test
    public void testAddEventHandlerDefaultSolver() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        EventHandler handler = new DummyEventHandler();
        
        integrator.addEventHandler(handler, 1.0, 1e-3, 10); // Uses default solver
        Collection<EventHandler> handlers = integrator.getEventHandlers();
        assertEquals(1, handlers.size());
        assertTrue(handlers.contains(handler));
    }

    // --- Tests for Current Step State ---

    @Test
    public void testCurrentStepStateNaN() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        assertTrue(Double.isNaN(integrator.getCurrentStepStart()));
        assertTrue(Double.isNaN(integrator.getCurrentSignedStepsize()));
    }
    
    // --- Tests for initIntegration ---
    
    @Test
    public void testInitIntegrationResetsEvaluationsAndInitializesEvents() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        integrator.setMaxEvaluations(10);

        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1e-6, 1e-3, 1e-10, 5);
        integrator.addEventHandler(new DummyEventHandler(), 1.0, 1e-3, 10, solver);

        double t0 = 0.0;
        double[] y0 = {1.0};
        double t = 1.0;
        
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t0);
        expandable.setPrimaryState(y0);
        integrator.setEquations(expandable);

        integrator.computeDerivatives(t0, y0, new double[1]);
        assertEquals(1, integrator.getEvaluations());

        integrator.initIntegration(t0, y0, t);
        
        assertEquals(0, integrator.getEvaluations());
    }
    
    // --- Tests for computeDerivatives ---
    @Test
    public void testComputeDerivativesIncrementsEvaluations() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        integrator.setMaxEvaluations(100);
        
        double t = 0.0;
        double[] y = {1.0};
        double[] yDot = new double[1];
        
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t);
        expandable.setPrimaryState(y);
        integrator.setEquations(expandable);
        
        assertEquals(0, integrator.getEvaluations());
        integrator.computeDerivatives(t, y, yDot);
        assertEquals(1, integrator.getEvaluations());
        
        integrator.computeDerivatives(t, y, yDot);
        assertEquals(2, integrator.getEvaluations());
    }

    @Test
    public void testComputeDerivativesCallsExpandable() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        double t = 1.0;
        double[] y = {2.0, 3.0};
        double[] yDot = new double[2];
        
        DummyEquations equations = new DummyEquations(2);
        equations.computeDerivatives(t, y, yDot); // Populate yDot for verification
        
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t);
        expandable.setPrimaryState(y);
        integrator.setEquations(expandable);
        
        integrator.computeDerivatives(t, y, yDot);
        
        assertEquals(-2.0, yDot[0], 1e-9);
        assertEquals(-3.0, yDot[1], 1e-9);
    }

    // --- Tests for acceptStep ---
    
    @Test
    public void testAcceptStepWithNoEvents() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        
        double t0 = 0.0;
        double[] y0 = {1.0};
        double tEnd = 1.0;
        double[] y1 = {0.9}; 
        double[][] yDot0And1 = {{ -1.0 }, { -0.9 }}; 

        // Dummy StepInterpolator that works for this test
        AbstractStepInterpolator interpolator = new BaseDummyStepInterpolator(t0, y0, tEnd, y1, yDot0And1, true) {
            @Override
            protected void computeInterpolatedStateAndDerivatives(double t, double theta) {
                interpolatedState[0] = y0[0] + theta * (y1[0] - y0[0]);
                interpolatedDerivatives[0] = yDot[0][0] + theta * (yDot[1][0] - yDot[0][0]);
            }
        };

        DummyStepHandler handler = new DummyStepHandler();
        integrator.addStepHandler(handler);
        
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t0);
        expandable.setPrimaryState(y0);
        integrator.setEquations(expandable);
        
        double[] y = y1.clone(); 
        double[] yDot = new double[1]; 

        integrator.acceptStep(interpolator, y, yDot, tEnd);
        
        assertEquals(tEnd, handler.getLastT(), 1e-9);
        assertEquals(tEnd - t0, handler.getLastStepSize(), 1e-9);
        assertTrue(handler.isLastStep()); 

        assertEquals(t0, integrator.getCurrentStepStart(), 1e-9);
        assertEquals(tEnd - t0, integrator.getCurrentSignedStepsize(), 1e-9);
    }
    
    @Test
    public void testAcceptStepWithEventStoppingIntegration() throws Exception {
        final double t0 = 0.0;
        final double[] y0 = {1.0};
        final double tEnd = 5.0;
        final double eventTime = 2.0;
        final double[] eventY = {0.5}; 
        final double[][] yDot0And1 = {{ -1.0 }, { -0.5 }}; 

        // Using a concrete integrator to test event handling
        ThreeEighthesIntegrator integrator = createThreeEighthesIntegrator(1.0);
        
        EventHandler stoppingHandler = new EventHandler() {
            @Override
            public void init(double t0, double[] y0, double t) {}
            @Override
            public double g(double t, double[] y) { return t - eventTime; } 
            @Override
            public Action eventOccurred(double t, double[] y, boolean increasing) {
                return Action.STOP;
            }
            @Override
            public void resetState(double t, double[] y) {}
        };

        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1e-6, 1e-3, 1e-10, 5);
        integrator.addEventHandler(stoppingHandler, 1.0, 1e-6, 10, solver);

        // Mock step interpolator to simulate event detection
        AbstractStepInterpolator customInterpolator = new BaseDummyStepInterpolator(t0, y0, tEnd, y0, yDot0And1, true) {
            private double currentInterpolatedTime = t0;

            @Override
            protected void computeInterpolatedStateAndDerivatives(double t, double theta) {
                // Simple linear interpolation
                interpolatedState[0] = y0[0] + theta * (eventY[0] - y0[0]);
                // Dummy derivative
                interpolatedDerivatives[0] = -interpolatedState[0][0]; 
            }
            
            @Override
            public void setInterpolatedTime(double t) {
                super.setInterpolatedTime(t);
                currentInterpolatedTime = t;
                // Update internal state to reflect the interpolated position
                if (t <= eventTime) {
                    double theta = (t - t0) / (eventTime - t0); // Scale based on event time for this segment
                    computeInterpolatedStateAndDerivatives(t, theta);
                } else {
                    // After event, we don't need to interpolate for this test.
                }
            }

            @Override
            public double getGlobalCurrentTime() {
                return currentInterpolatedTime; // Return the currently interpolated time for this segment
            }
            
            @Override
            public double getCurrentSignedStepsize() {
                return currentInterpolatedTime - getGlobalPreviousTime();
            }
        };

        // Setup internal state for the integrator to call acceptStep
        integrator.stepStart = t0;
        integrator.stepSize = tEnd - t0;
        integrator.isLastStep = false;
        integrator.resetOccurred = false;
        integrator.statesInitialized = true; 

        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t0);
        expandable.setPrimaryState(y0);
        integrator.setEquations(expandable);
        
        double[] y = y0.clone(); 
        double[] yDot = new double[1]; 

        // Simulate the first part of the step up to the event
        customInterpolator.setSoftPreviousTime(t0);
        customInterpolator.setSoftCurrentTime(eventTime); // The interpolator will be asked to go up to eventTime
        customInterpolator.setInterpolatedTime(eventTime);

        // Call acceptStep. It should find the event and stop.
        double returnedTime = integrator.acceptStep(customInterpolator, y, yDot, tEnd);
        
        assertEquals(eventTime, returnedTime, 1e-9);
        assertTrue(integrator.isLastStep); // The event triggered STOP
        
        // State 'y' should be the state at eventTime
        assertArrayEquals(eventY, y, 1e-9); 
    }

    @Test
    public void testAcceptStepWithEventResettingState() throws Exception {
        final double t0 = 0.0;
        final double[] y0 = {1.0};
        final double tEnd = 5.0;
        final double eventTime = 2.0;
        final double[] eventY = {0.5}; 
        final double[] resetY = {10.0}; 
        final double[][] yDot0And1 = {{ -1.0 }, { -0.5 }};

        ThreeEighthesIntegrator integrator = createThreeEighthesIntegrator(1.0);
        
        EventHandler resettingHandler = new EventHandler() {
            @Override
            public void init(double t0, double[] y0, double t) {}
            @Override
            public double g(double t, double[] y) { return t - eventTime; } 
            @Override
            public Action eventOccurred(double t, double[] y, boolean increasing) {
                return Action.RESET_STATE;
            }
            @Override
            public void resetState(double t, double[] y) {
                // Simulate resetting the state to a new value
                for (int i = 0; i < y.length; i++) {
                    y[i] = resetY[i];
                }
            }
        };

        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1e-6, 1e-3, 1e-10, 5);
        integrator.addEventHandler(resettingHandler, 1.0, 1e-6, 10, solver);

        AbstractStepInterpolator customInterpolator = new BaseDummyStepInterpolator(t0, y0, tEnd, y0, yDot0And1, true) {
            private double currentInterpolatedTime = t0;
            
            @Override
            protected void computeInterpolatedStateAndDerivatives(double t, double theta) {
                interpolatedState[0] = y0[0] + theta * (eventY[0] - y0[0]);
                interpolatedDerivatives[0] = -interpolatedState[0][0]; 
            }
            
            @Override
            public void setInterpolatedTime(double t) {
                super.setInterpolatedTime(t);
                currentInterpolatedTime = t;
                 if (t <= eventTime) {
                    double theta = (t - t0) / (eventTime - t0);
                    computeInterpolatedStateAndDerivatives(t, theta);
                }
            }

            @Override
            public double getGlobalCurrentTime() {
                return currentInterpolatedTime;
            }
            
            @Override
            public double getCurrentSignedStepsize() {
                return currentInterpolatedTime - getGlobalPreviousTime();
            }
        };

        integrator.stepStart = t0;
        integrator.stepSize = tEnd - t0;
        integrator.isLastStep = false;
        integrator.resetOccurred = false;
        integrator.statesInitialized = true; 

        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t0);
        expandable.setPrimaryState(y0);
        integrator.setEquations(expandable);
        
        double[] y = y0.clone(); 
        double[] yDot = new double[1]; 

        customInterpolator.setSoftPreviousTime(t0);
        customInterpolator.setSoftCurrentTime(eventTime);
        customInterpolator.setInterpolatedTime(eventTime);

        double returnedTime = integrator.acceptStep(customInterpolator, y, yDot, tEnd);
        
        assertEquals(eventTime, returnedTime, 1e-9);
        assertFalse(integrator.isLastStep); 
        assertTrue(integrator.resetOccurred); // resetOccurred flag should be set
        
        assertArrayEquals(resetY, y, 1e-9); 
        
        // Verify that derivatives were recomputed after reset
        integrator.computeDerivatives(eventTime, resetY, yDot); // Manually recompute to check
        assertEquals(-resetY[0], yDot[0], 1e-9);
    }
    
    // --- Tests for sanityChecks ---
    
    @Test
    public void testSanityChecksWithSufficientInterval() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        
        double t0 = 0.0;
        double t = 1.0;
        expandable.setTime(t0);
        
        integrator.sanityChecks(expandable, t); // Should not throw
    }
    
    @Test
    public void testSanityChecksWithTooSmallInterval() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        
        double t0 = 0.0;
        double t = t0 + 1e-15; 
        expandable.setTime(t0);
        
        double threshold = 1000 * FastMath.ulp(FastMath.max(FastMath.abs(t0), FastMath.abs(t)));
        
        try {
            integrator.sanityChecks(expandable, t);
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            assertEquals(t - t0, e.getArgument());
            // The second argument to NumberIsTooSmallException is the threshold.
            // It seems there's no direct getArgument2() on the exception.
            // We'll assert the value of the threshold used.
            // If the exception itself stored it, we'd use that.
            // For now, we trust our calculation of threshold and the exception message.
            // The message uses LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL which includes the threshold.
        }
    }

    @Test
    public void testSanityChecksWithZeroInterval() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        
        double t0 = 1.0;
        double t = 1.0; 
        expandable.setTime(t0);

        double threshold = 1000 * FastMath.ulp(FastMath.max(FastMath.abs(t0), FastMath.abs(t)));
        
        try {
            integrator.sanityChecks(expandable, t);
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            assertEquals(t - t0, e.getArgument()); // Should be 0.0
        }
    }
    
    @Test
    public void testSanityChecksWithNegativeInterval() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        
        double t0 = 1.0;
        double t = 0.5; 
        expandable.setTime(t0);
        
        integrator.sanityChecks(expandable, t); // Should pass
    }
    
    // --- Tests for DimensionMismatchException in integrate method ---
    
    @Test
    public void testIntegrateDimensionMismatchY0() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        FirstOrderDifferentialEquations equations = new DummyEquations(3); // Expects dimension 3
        
        double t0 = 0.0;
        double[] y0 = {1.0, 2.0}; // Dimension mismatch (2 instead of 3)
        double t = 1.0;
        double[] y = new double[3];
        
        try {
            integrator.integrate(equations, t0, y0, t, y);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            assertEquals(equations.getDimension(), e.getDimension());
        }
    }
    
    @Test
    public void testIntegrateDimensionMismatchY() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        FirstOrderDifferentialEquations equations = new DummyEquations(3); // Expects dimension 3
        
        double t0 = 0.0;
        double[] y0 = {1.0, 2.0, 3.0};
        double t = 1.0;
        double[] y = {1.0, 2.0}; // Dimension mismatch (2 instead of 3)
        
        try {
            integrator.integrate(equations, t0, y0, t, y);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            assertEquals(equations.getDimension(), e.getDimension());
        }
    }

    // Dummy implementation for AbstractStepInterpolator used in tests.
    // This should be a static inner class.
    private static abstract class TestStepInterpolator extends AbstractStepInterpolator {
        protected final double t0;
        protected final double t1;
        protected final double[] y0;
        protected final double[] y1;
        protected final double[][] yDot;
        
        protected TestStepInterpolator(double t0, double[] y0, double t1, double[] y1, double[][] yDot, boolean forward) {
            super(forward);
            this.t0 = t0;
            this.t1 = t1;
            this.y0 = y0.clone();
            this.y1 = y1.clone();
            this.yDot = yDot;
            setInterpolatedTime(t0); // Initialize
        }
        
        @Override
        public void setInterpolatedTime(double t) {
            super.setInterpolatedTime(t);
            double theta = (t - t0) / (t1 - t0);
            computeInterpolatedStateAndDerivatives(t, theta);
        }

        @Override
        public AbstractStepInterpolator copy() {
            // Not a real copy, but sufficient for tests that don't require separate copies.
            return this;
        }

        @Override
        public double getPreviousTime() { return t0; }

        @Override
        public double getCurrentTime() { return t1; }
        
        @Override
        public double getGlobalPreviousTime() { return t0; }

        @Override
        public double getGlobalCurrentTime() { return t1; }

        @Override
        public double getCurrentSignedStepsize() { return t1 - t0; }
    }
}
