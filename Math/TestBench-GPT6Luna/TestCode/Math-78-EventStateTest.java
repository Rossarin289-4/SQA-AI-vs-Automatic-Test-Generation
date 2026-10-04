package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.sampling.StepInterpolator;

public class EventStateTest {
    @Test
    public void testConstructorAndConfiguration() throws Exception {
        EventHandler handler = new EventHandler() {
            public double g(double t, double[] y) { return 1.0; }
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }
            public void resetState(double t, double[] y) { }
        };
        EventState state = new EventState(handler, 2.0, -0.25, 7);
        assertSame(handler, state.getEventHandler());
        assertEquals(2.0, state.getMaxCheckInterval(), 0.0);
        assertEquals(0.25, state.getConvergence(), 0.0);
        assertEquals(7, state.getMaxIterationCount());
        assertTrue(Double.isNaN(state.getEventTime()));
        assertFalse(state.stop());
    }

    @Test
    public void testReinitializeAndNoEventStep() throws Exception {
        EventHandler handler = new EventHandler() {
            public double g(double t, double[] y) { return 1.0; }
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.CONTINUE;
            }
            public void resetState(double t, double[] y) { }
        };
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        state.reinitializeBegin(0.0, new double[0]);
        assertFalse(state.reset(2.0, new double[0]));
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test
    public void testStepAcceptedWithoutPendingEvent() throws Exception {
        EventHandler handler = new EventHandler() {
            public double g(double t, double[] y) { return -1.0; }
            public int eventOccurred(double t, double[] y, boolean increasing) {
                return EventHandler.STOP;
            }
            public void resetState(double t, double[] y) { }
        };
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        state.stepAccepted(3.0, new double[0]);
        assertFalse(state.stop());
        assertFalse(state.reset(3.0, new double[0]));
        assertTrue(Double.isNaN(state.getEventTime()));
    }
}
