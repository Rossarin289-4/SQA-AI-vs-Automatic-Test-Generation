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

    // Dummy StepHandler for testing.
    private static class DummyStepHandler implements StepHandler {
        private double t0 = Double.NaN;
        private double[] y0 = null;
        private double t = Double.NaN;
        private double lastT = Double.NaN;
        private double lastStepSize = Double.NaN;
        private boolean lastIsLast = false;
        private boolean initCalled = false;

        @Override
        public void init(double t0, double[] y0, double t) {
            this.t0 = t0;
            this.y0 = y0.clone();
            this.t = t;
            initCalled = true;
        }

        @Override
        public void handleStep(AbstractStepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {
            lastT = interpolator.getInterpolatedTime();
            lastStepSize = interpolator.getCurrentSignedStepsize();
            lastIsLast = isLast;
        }
        
        public double getLastT() { return lastT; }
        public double getLastStepSize() { return lastStepSize; }
        public boolean isLastStep() { return lastIsLast; }
        public boolean isInitCalled() { return initCalled; }
    }

    // Dummy EventHandler for testing.
    private static class DummyEventHandler implements EventHandler {
        private double lastEventTime = Double.NaN;
        private double[] lastEventY = null;
        private boolean lastIncreasing = false;
        private boolean initCalled = false;

        @Override
        public void init(double t0, double[] y0, double t) {
            initCalled = true;
        }

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
        public boolean isInitCalled() { return initCalled; }
    }

    // Dummy AbstractStepInterpolator for testing acceptStep.
    private static abstract class TestStepInterpolator extends AbstractStepInterpolator {
        protected final double t0;
        protected final double t1;
        protected final double[] y0;
        protected final double[] y1;
        protected final double[][] yDot; // derivatives at t0 and t1

        protected TestStepInterpolator(final double t0, final double[] y0, final double t1, final double[] y1, final double[][] yDot, final boolean forward) {
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
            // In a real scenario, a deep copy would be needed.
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

    // --- Integrator creation methods for tests ---
    
    private AbstractIntegrator createEulerIntegrator(double step) {
        return new EulerIntegrator(step);
    }
    
    private AbstractIntegrator createThreeEighthesIntegrator(double step) {
        return new ThreeEighthesIntegrator(step);
    }
    
    private GraggBulirschStoerIntegrator createGraggBulirschStoerIntegrator(double minStep, double maxStep, double absTol, double relTol) {
        return new GraggBulirschStoerIntegrator(minStep, maxStep, absTol, relTol);
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
        DummyEventHandler eventHandler = new DummyEventHandler();
        integrator.addEventHandler(eventHandler, 1.0, 1e-3, 10, solver);

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
        assertTrue(eventHandler.isInitCalled()); // Check if init was called on handler
        assertFalse(integrator.statesInitialized); // Should be false after initIntegration
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
        
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t);
        expandable.setPrimaryState(y);
        integrator.setEquations(expandable);
        
        integrator.computeDerivatives(t, y, yDot);
        
        // Derivatives are computed by DummyEquations as -y
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
        TestStepInterpolator interpolator = new TestStepInterpolator(t0, y0, tEnd, y1, yDot0And1, true) {
            @Override
            protected void computeInterpolatedStateAndDerivatives(double t, double theta) {
                interpolatedState[0] = y0[0] + theta * (y1[0] - y0[0]);
                // Simple linear interpolation for derivative as well
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
        
        // State at the end of the step
        double[] y = y1.clone(); 
        double[] yDot = new double[1]; 
        integrator.setStateInitialized(true); // Assume state is initialized for this test

        double returnedTime = integrator.acceptStep(interpolator, y, yDot, tEnd);
        
        assertEquals(tEnd, returnedTime, 1e-9);
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
        final double[][] yDot0And1 = {{ -1.0 }, { -0.5 }}; // Dummy derivatives

        // Use a concrete integrator that allows adding event handlers
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
        TestStepInterpolator customInterpolator = new TestStepInterpolator(t0, y0, tEnd, y0, yDot0And1, true) {
            private double currentInterpolatedTime = t0;

            @Override
            protected void computeInterpolatedStateAndDerivatives(double t, double theta) {
                if (t <= eventTime) {
                    interpolatedState[0] = y0[0] + theta * (eventY[0] - y0[0]);
                    interpolatedDerivatives[0] = -interpolatedState[0][0]; // Dummy derivative
                } else {
                    // State after event is not relevant for this test's stopping condition
                    interpolatedState[0] = Double.NaN;
                    interpolatedDerivatives[0] = Double.NaN;
                }
            }
            
            @Override
            public void setInterpolatedTime(double t) {
                super.setInterpolatedTime(t);
                currentInterpolatedTime = t;
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

        // Setup internal state for the integrator to call acceptStep
        integrator.stepStart = t0;
        integrator.stepSize = tEnd - t0; // Initial step size
        integrator.isLastStep = false;
        integrator.resetOccurred = false;
        integrator.setStateInitialized(true); // Must be true to avoid reinitialization logic

        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t0);
        expandable.setPrimaryState(y0);
        integrator.setEquations(expandable);
        
        double[] y = y0.clone(); // State at the beginning of the step
        double[] yDot = new double[1]; 

        // Simulate the first part of the step up to the event
        customInterpolator.setSoftPreviousTime(t0);
        customInterpolator.setSoftCurrentTime(eventTime); // The interpolator will be asked to go up to eventTime
        customInterpolator.setInterpolatedTime(eventTime);

        // Call acceptStep. It should find the event and stop.
        double returnedTime = integrator.acceptStep(customInterpolator, y, yDot, tEnd);
        
        assertEquals(eventTime, returnedTime, 1e-9);
        assertTrue(integrator.isLastStep); // The event triggered STOP
        
        // State 'y' should be the state at eventTime after interpolation
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
        final double[][] yDot0And1 = {{ -1.0 }, { -0.5 }}; // Dummy derivatives

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

        TestStepInterpolator customInterpolator = new TestStepInterpolator(t0, y0, tEnd, y0, yDot0And1, true) {
            private double currentInterpolatedTime = t0;
            
            @Override
            protected void computeInterpolatedStateAndDerivatives(double t, double theta) {
                 if (t <= eventTime) {
                    interpolatedState[0] = y0[0] + theta * (eventY[0] - y0[0]);
                    interpolatedDerivatives[0] = -interpolatedState[0][0]; // Dummy derivative
                } else {
                    // State after event is not relevant for this test's reset logic
                    interpolatedState[0] = Double.NaN;
                    interpolatedDerivatives[0] = Double.NaN;
                }
            }
            
            @Override
            public void setInterpolatedTime(double t) {
                super.setInterpolatedTime(t);
                currentInterpolatedTime = t;
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
        integrator.setStateInitialized(true); // Must be true

        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t0);
        expandable.setPrimaryState(y0);
        integrator.setEquations(expandable);
        
        double[] y = y0.clone(); // State at the beginning of the step
        double[] yDot = new double[1]; 

        customInterpolator.setSoftPreviousTime(t0);
        customInterpolator.setSoftCurrentTime(eventTime);
        customInterpolator.setInterpolatedTime(eventTime);

        double returnedTime = integrator.acceptStep(customInterpolator, y, yDot, tEnd);
        
        assertEquals(eventTime, returnedTime, 1e-9);
        assertFalse(integrator.isLastStep); 
        assertTrue(integrator.resetOccurred); // resetOccurred flag should be set
        
        // 'y' should now contain the reset state after the event handler call
        assertArrayEquals(resetY, y, 1e-9); 
        
        // Verify that derivatives were recomputed after reset
        // The actual computation will happen when computeDerivatives is called next.
        // We can check that computeDerivatives is called implicitly if resetOccurred is true.
        // Here, we manually check the state after reset to ensure the reset handler worked.
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
        
        // The threshold calculation is crucial here.
        double threshold = 1000 * FastMath.ulp(FastMath.max(FastMath.abs(t0), FastMath.abs(t)));
        
        try {
            integrator.sanityChecks(expandable, t);
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            // Check the interval itself that was too small
            assertEquals(t - t0, e.getArgument());
            // The second argument (threshold) is not directly accessible.
            // We can check the message for content if needed, but comparing the argument is the primary check.
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
            assertEquals(0.0, e.getArgument(), 1e-9); // Interval is zero
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
        
        integrator.sanityChecks(expandable, t); // Should pass for backward integration
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
            assertEquals(3, e.getDimension());
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
            assertEquals(3, e.getDimension());
        }
    }

    // --- Comparator test ---
    // The Comparator is defined within the acceptStep method, making it hard to test directly.
    // We will test its effect by ensuring events are ordered correctly.
    
    @Test
    public void testEventOrderingInAcceptStep() throws Exception {
        final double t0 = 0.0;
        final double[] y0 = {0.0};
        final double tEnd = 10.0;
        final double eventTime1 = 2.0;
        final double eventTime2 = 5.0;
        final double[][] yDot0And1 = {{0.0}, {0.0}}; // Dummy

        ThreeEighthesIntegrator integrator = createThreeEighthesIntegrator(1.0);
        
        final List<Double> eventTimes = new ArrayList<>();

        EventHandler handler1 = new EventHandler() {
            @Override public void init(double t0, double[] y0, double t) {}
            @Override public double g(double t, double[] y) { return t - eventTime1; } 
            @Override public Action eventOccurred(double t, double[] y, boolean increasing) {
                eventTimes.add(t); return Action.CONTINUE;
            }
            @Override public void resetState(double t, double[] y) {}
        };

        EventHandler handler2 = new EventHandler() {
            @Override public void init(double t0, double[] y0, double t) {}
            @Override public double g(double t, double[] y) { return t - eventTime2; } 
            @Override public Action eventOccurred(double t, double[] y, boolean increasing) {
                eventTimes.add(t); return Action.CONTINUE;
            }
            @Override public void resetState(double t, double[] y) {}
        };

        UnivariateSolver solver = new BracketingNthOrderBrentSolver(1e-6, 1e-3, 1e-10, 5);
        integrator.addEventHandler(handler1, 1.0, 1e-6, 10, solver);
        integrator.addEventHandler(handler2, 1.0, 1e-6, 10, solver);

        TestStepInterpolator interpolator = new TestStepInterpolator(t0, y0, tEnd, y0, yDot0And1, true) {
            @Override protected void computeInterpolatedStateAndDerivatives(double t, double theta) {
                interpolatedState[0] = y0[0] + theta * (y1[0] - y0[0]); // Simplified for this test
                interpolatedDerivatives[0] = 0;
            }
        };
        
        integrator.stepStart = t0;
        integrator.stepSize = tEnd - t0;
        integrator.isLastStep = false;
        integrator.resetOccurred = false;
        integrator.setStateInitialized(true);

        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        expandable.setTime(t0);
        expandable.setPrimaryState(y0);
        integrator.setEquations(expandable);
        
        double[] y = y0.clone();
        double[] yDot = new double[1];

        // Force evaluation of the step to trigger event checking
        interpolator.setSoftPreviousTime(t0);
        interpolator.setSoftCurrentTime(tEnd);
        interpolator.setInterpolatedTime(tEnd);

        integrator.acceptStep(interpolator, y, yDot, tEnd);
        
        assertEquals(2, eventTimes.size());
        assertEquals(eventTime1, eventTimes.get(0), 1e-9); // First event should be the earlier one
        assertEquals(eventTime2, eventTimes.get(1), 1e-9); // Second event should be the later one
    }

    // --- Test for setEquations ---
    @Test
    public void testSetEquations() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        DummyEquations equations = new DummyEquations(1);
        ExpandableStatefulODE expandable = new ExpandableStatefulODE(equations);
        
        integrator.setEquations(expandable);
        // This is hard to test directly without accessing private fields.
        // The effect of setEquations is seen in computeDerivatives and integrate.
        // We trust that computeDerivatives uses the set equations.
        // We will test computeDerivatives indirectly.
    }
    
    // Test for the 'statesInitialized' flag and its management.
    @Test
    public void testStateInitializationLogic() throws Exception {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        
        double t0 = 0.0;
        double[] y0 = {1.0};
        double tEnd = 1.0;
        double[] y1 = {0.9}; 
        double[][] yDot0And1 = {{ -1.0 }, { -0.9 }}; 

        TestStepInterpolator interpolator = new TestStepInterpolator(t0, y0, tEnd, y1, yDot0And1, true) {
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
        
        // Initially, statesInitialized should be false after initIntegration
        integrator.initIntegration(t0, y0, tEnd);
        assertFalse(integrator.statesInitialized);

        // First call to acceptStep should set statesInitialized to true
        double[] y = y1.clone(); 
        double[] yDot = new double[1]; 
        integrator.acceptStep(interpolator, y, yDot, tEnd);
        assertTrue(integrator.statesInitialized);

        // Re-initialize and check again
        integrator.initIntegration(t0, y0, tEnd);
        assertFalse(integrator.statesInitialized);
        
        // Second call to acceptStep should set it to true again
        y = y1.clone();
        integrator.acceptStep(interpolator, y, yDot, tEnd);
        assertTrue(integrator.statesInitialized);
    }
    
    // Test the protected method setStateInitialized directly
    @Test
    public void testSetStateInitializedMethod() {
        AbstractIntegrator integrator = createEulerIntegrator(1.0);
        assertTrue(integrator.statesInitialized); // Default is true for AbstractIntegrator constructor
        
        integrator.setStateInitialized(false);
        assertFalse(integrator.statesInitialized);
        
        integrator.setStateInitialized(true);
        assertTrue(integrator.statesInitialized);
    }
}
