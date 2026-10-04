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
    
    // Test the protected method setStateInitialized directly
}


