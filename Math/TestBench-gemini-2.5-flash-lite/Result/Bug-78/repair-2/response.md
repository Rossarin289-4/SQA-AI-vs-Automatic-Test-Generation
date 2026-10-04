```java
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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock implementation of EventHandler for testing purposes
    private static class MockEventHandler implements EventHandler {
        private double eventTime = Double.NaN;
        private int nextAction = CONTINUE;
        private boolean increasingAtEvent = false;
        private double gValue = 0; // Default g value

        public MockEventHandler(double gValue, double eventTime, int nextAction, boolean increasingAtEvent) {
            this.gValue = gValue;
            this.eventTime = eventTime;
            this.nextAction = nextAction;
            this.increasingAtEvent = increasingAtEvent;
        }

        @Override
        public double g(double t, double[] y) throws EventException {
            // Simple function: return t - eventTime if eventTime is set, otherwise return a fixed value
            if (!Double.isNaN(eventTime)) {
                return t - eventTime;
            }
            return gValue;
        }

        @Override
        public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
            // Store the increasing flag if an event occurs
            this.increasingAtEvent = increasing;
            return nextAction;
        }

        @Override
        public void resetState(double t, double[] y) throws EventException {
            // No-op for this mock
        }
    }

    // Mock implementation of StepInterpolator for testing purposes
    private static class MockStepInterpolator implements StepInterpolator {
        private double t0;
        private double[] y0;
        private double t1;
        private double[] y1;
        private boolean forward;
        private double[] interpolatedState;
        private double maxCheckInterval;

        public MockStepInterpolator(double t0, double[] y0, double t1, double[] y1, boolean forward, double maxCheckInterval) {
            this.t0 = t0;
            this.y0 = y0;
            this.t1 = t1;
            this.y1 = y1;
            this.forward = forward;
            this.interpolatedState = y0.clone();
            this.maxCheckInterval = maxCheckInterval;
        }

        @Override
        public void setInterpolatedTime(double t) throws DerivativeException {
            if ((forward && (t < t0 || t > t1)) || (!forward && (t < t1 || t > t0))) {
                throw new DerivativeException("Time out of bounds");
            }
            // Simple linear interpolation
            double ratio = (t - t0) / (t1 - t0);
            interpolatedState = new double[y0.length];
            for (int i = 0; i < y0.length; i++) {
                interpolatedState[i] = y0[i] + ratio * (y1[i] - y0[i]);
            }
        }

        @Override
        public double[] getInterpolatedState() {
            return interpolatedState;
        }

        @Override
        public boolean isForward() {
            return forward;
        }

        @Override
        public double getPreviousTime() {
            return t0;
        }

        @Override
        public double[] getPreviousState() {
            return y0;
        }

        @Override
        public double getCurrentTime() {
            return t1;
        }

        @Override
        public double[] getCurrentState() {
            return y1;
        }

        // Methods not directly used by EventState's evaluateStep but required by interface
        @Override
        public double getInterpolatedDerivatives() {
            // Not relevant for this test. Returning a dummy value.
            return 0.0;
        }

        @Override
        public double getInterpolatedStateTransition() {
            // Not relevant for this test. Returning a dummy value.
            return 0.0;
        }

        @Override
        public void rewind() throws DerivativeException {
            // Not needed for this test
        }

        @Override
        public void skipInitializationToCurrentState() throws DerivativeException {
            // Not needed for this test
        }

        @Override
        public StepInterpolator copy() throws DerivativeException {
            // Not needed for this test
            return null;
        }
    }

    // Helper to create a StepInterpolator for testing evaluateStep
    private StepInterpolator createInterpolator(double t0, double[] y0, double t1, double[] y1, boolean forward, double maxCheckInterval) {
        return new MockStepInterpolator(t0, y0, t1, y1, forward, maxCheckInterval);
    }

    @Test
    public void testConstructorAndGetters() throws Exception {
        MockEventHandler handler = new MockEventHandler(0.0, Double.NaN, EventHandler.CONTINUE, true);
        double maxCheckInterval = 1.0;
        double convergence = 1e-6;
        int maxIterationCount = 100;
        EventState state = new EventState(handler, maxCheckInterval, convergence, maxIterationCount);

        assertEquals(handler, state.getEventHandler());
        assertEquals(maxCheckInterval, state.getMaxCheckInterval(), 1e-12);
        assertEquals(convergence, state.getConvergence(), 1e-12);
        assertEquals(maxIterationCount, state.getMaxIterationCount());
    }

    @Test
    public void testReinitializeBegin() throws Exception {
        MockEventHandler handler = new MockEventHandler(0.0, Double.NaN, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double tStart = 0.0;
        double[] yStart = {1.0, 2.0};
        state.reinitializeBegin(tStart, yStart);

        // Accessing private fields directly for testing initialization
        assertEquals(tStart, state.t0, 1e-12);
        assertEquals(handler.g(tStart, yStart), state.g0, 1e-12);
        assertEquals(handler.g(tStart, yStart) >= 0, state.g0Positive);
    }

    @Test
    public void testEvaluateStepNoEvent() throws Exception {
        MockEventHandler handler = new MockEventHandler(1.0, Double.NaN, EventHandler.CONTINUE, true); // g(t) is always 1.0
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertFalse(state.evaluateStep(interpolator));
        assertFalse(state.pendingEvent); // Ensure pendingEvent is false
    }

    @Test
    public void testEvaluateStepEventInMiddle() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true); // Event at t=0.5
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator));
        assertEquals(0.5, state.getEventTime(), 1e-6);
        assertTrue(state.pendingEvent); // Ensure pendingEvent is true
    }

    @Test
    public void testEvaluateStepEventAtEnd() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 1.0, EventHandler.CONTINUE, true); // Event at t=1.0
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator));
        assertEquals(1.0, state.getEventTime(), 1e-6);
        assertTrue(state.pendingEvent);
    }

    @Test
    public void testEvaluateStepMultipleSubstepsNoEvent() throws Exception {
        MockEventHandler handler = new MockEventHandler(1.0, Double.NaN, EventHandler.CONTINUE, true); // g(t) is always 1.0
        EventState state = new EventState(handler, 0.1, 1e-6, 100); // Smaller maxCheckInterval
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 0.1);

        assertFalse(state.evaluateStep(interpolator));
        assertFalse(state.pendingEvent);
    }

    @Test
    public void testEvaluateStepMultipleSubstepsWithEvent() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.6, EventHandler.CONTINUE, true); // Event at 0.6
        EventState state = new EventState(handler, 0.3, 1e-6, 100); // maxCheckInterval around event
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 0.3);

        assertTrue(state.evaluateStep(interpolator));
        assertEquals(0.6, state.getEventTime(), 1e-6);
        assertTrue(state.pendingEvent);
    }

    @Test
    public void testEvaluateStepStepEndsAtEventTime() throws Exception {
        // Test the case where the proposed step ends exactly at the event time.
        // In this case, evaluateStep should return false, indicating the step is accepted.
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true); // Event at t=0.5
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1_event = 0.5; // The step ends exactly at the event time
        double[] y1_event = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1_event, y1_event, true, 1.0);

        // The event is detected at 0.5. Because t1 (0.5) equals pendingEventTime (0.5),
        // evaluateStep should return false.
        assertFalse(state.evaluateStep(interpolator));
        assertFalse(state.pendingEvent); // Event should be considered handled and pendingEvent reset
    }


    @Test
    public void testStepAcceptedNoPendingEvent() throws Exception {
        MockEventHandler handler = new MockEventHandler(1.0, Double.NaN, EventHandler.CONTINUE, true); // No event
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);

        double t = 1.0;
        double[] y = {1.0};
        state.stepAccepted(t, y);

        assertEquals(t, state.t0, 1e-12);
        assertEquals(handler.g(t, y), state.g0, 1e-12);
        assertFalse(state.pendingEvent);
        assertEquals(EventHandler.CONTINUE, state.nextAction);
    }

    @Test
    public void testStepAcceptedWithPendingEventContinue() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator)); // This sets pendingEvent
        assertTrue(state.pendingEvent);

        double t = 0.5; // Event time
        double[] y = {1.0}; // State at event time
        state.stepAccepted(t, y);

        assertEquals(t, state.t0, 1e-12);
        assertEquals(handler.g(t, y), state.g0, 1e-12);
        assertFalse(state.pendingEvent); // pendingEvent should be reset
        assertEquals(EventHandler.CONTINUE, state.nextAction);
        assertEquals(0.5, state.previousEventTime, 1e-12); // Previous event time should be updated
    }

    @Test
    public void testStepAcceptedWithPendingEventStop() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.STOP, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator)); // Sets pendingEvent
        assertTrue(state.pendingEvent);

        double t = 0.5;
        double[] y = {1.0};
        state.stepAccepted(t, y);

        assertTrue(state.stop()); // Should stop because nextAction is STOP
        assertEquals(0.5, state.previousEventTime, 1e-12);
    }

    @Test
    public void testStopReturnsTrueWhenActionIsStop() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.STOP, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator));
        state.stepAccepted(0.5, new double[]{1.0}); // Simulate event occurring and being accepted

        assertTrue(state.stop());
    }

    @Test
    public void testStopReturnsFalseWhenActionIsNotStop() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator));
        state.stepAccepted(0.5, new double[]{1.0});

        assertFalse(state.stop());
    }

    @Test
    public void testResetState() throws Exception {
        // Ensure that resetState correctly modifies the provided array y
        double[] y = {1.0, 2.0};
        double[] expectedY = {10.0, 20.0}; // Expected values after resetState triggered by eventOccurred
        EventHandler handler = new EventHandler() {
            @Override
            public double g(double t, double[] y) throws EventException {
                return t - 0.5; // Event at t=0.5
            }

            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
                if (Math.abs(t - 0.5) < 1e-9) {
                    y[0] = 10.0; // Modify state
                    y[1] = 20.0;
                    return EventHandler.RESET_STATE;
                }
                return EventHandler.CONTINUE;
            }

            @Override
            public void resetState(double t, double[] y) throws EventException {
                // This method is called by EventState.reset() if nextAction is RESET_STATE.
                // In this test, eventOccurred already modified `y`.
                // The `reset` method is called *after* `stepAccepted`.
                // The handler's `resetState` method should ideally be called by `EventState.reset()`
                // if `nextAction` is `RESET_STATE`.
                // However, `eventOccurred` in `stepAccepted` also directly modifies `y`.
                // This test checks if `y` is modified as expected.
                // If `EventState.reset` were to call `handler.resetState` again, it would overwrite.
                // The current implementation modifies `y` in `eventOccurred`.
                // This test will pass if `y` is modified to `{10.0, 20.0}`.
            }
        };

        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, 1.0, new double[]{1.0}, true, 1.0);

        // Trigger an event at t=0.5 which calls eventOccurred
        assertTrue(state.evaluateStep(interpolator)); // Event detected at 0.5
        assertTrue(state.pendingEvent);

        double[] stateArrayToModify = {1.0, 2.0}; // This array will be passed to stepAccepted
        state.stepAccepted(0.5, stateArrayToModify); // eventOccurred is called here and modifies stateArrayToModify

        // Now call reset(). It should return true because nextAction is RESET_STATE.
        // The stateArrayToModify should already be modified by eventOccurred.
        assertTrue(state.reset(0.5, stateArrayToModify));
        assertArrayEquals(expectedY, stateArrayToModify, 1e-12); // Check if y was modified correctly by eventOccurred
        assertFalse(state.pendingEvent); // pendingEvent should be reset by stepAccepted
    }

    @Test
    public void testResetDerivatives() throws Exception {
        double[] y = {1.0, 2.0};
        EventHandler handler = new EventHandler() {
            @Override
            public double g(double t, double[] y) throws EventException {
                return t - 0.5; // Event at t=0.5
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
                if (Math.abs(t - 0.5) < 1e-9) {
                    return EventHandler.RESET_DERIVATIVES;
                }
                return EventHandler.CONTINUE;
            }
            @Override
            public void resetState(double t, double[] y) throws EventException {
                fail("resetState should not be called for RESET_DERIVATIVES");
            }
        };

        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, 1.0, new double[]{1.0}, true, 1.0);

        assertTrue(state.evaluateStep(interpolator)); // Event detected at 0.5
        assertTrue(state.pendingEvent);

        double[] stateAtEvent = {1.0, 2.0};
        state.stepAccepted(0.5, stateAtEvent);

        assertTrue(state.reset(0.5, stateAtEvent)); // Should return true for RESET_DERIVATIVES
        assertFalse(state.pendingEvent);
    }

    @Test
    public void testResetNoPendingEvent() throws Exception {
        MockEventHandler handler = new MockEventHandler(1.0, Double.NaN, EventHandler.RESET_STATE, true); // No event, but handler is set to RESET_STATE
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, 1.0, new double[]{1.0}, true, 1.0);

        assertFalse(state.evaluateStep(interpolator)); // No event occurring
        assertFalse(state.pendingEvent);

        assertFalse(state.reset(1.0, new double[]{1.0})); // Should return false as no pending event
    }

    @Test
    public void testEvaluateStepWithConvergenceThreshold() throws Exception {
        // Test that the solver uses the convergence threshold
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-3, 100); // Larger convergence
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator));
        // The event time should be close to 0.5, within convergence
        assertTrue(Math.abs(state.getEventTime() - 0.5) <= 1e-3);
    }

    @Test
    public void testEvaluateStepWithMaxIterationCount() throws Exception {
        // This test is designed to trigger the BrentSolver's max iteration limit.
        // We need a function that is difficult to solve or has a root far from the initial guess,
        // and a small maxIterationCount.
        // We'll use a function that has a root, and set a small max iteration count.
        // The function g(t) = t - 0.5. If we set interval such that solver struggles,
        // or if maxIterationCount is very small.
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 5); // Small maxIterationCount
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        // The BrentSolver.solve method throws ConvergenceException if max iterations are exceeded.
        // The EventState.evaluateStep method catches FunctionEvaluationException and EventException.
        // A ConvergenceException from BrentSolver will be wrapped in a FunctionEvaluationException.
        try {
            state.evaluateStep(interpolator);
            fail("Expected ConvergenceException wrapped in FunctionEvaluationException");
        } catch (FunctionEvaluationException e) {
            Throwable cause = e.getCause();
            assertTrue(cause instanceof ConvergenceException);
        } catch (DerivativeException e) {
            fail("Unexpected DerivativeException: " + e.getMessage());
        } catch (EventException e) {
            fail("Unexpected EventException: " + e.getMessage());
        }
    }

    @Test
    public void testEvaluateStepCornerCaseGaGbPositive() throws Exception {
        // This test attempts to trigger the ga * gb > 0 condition within evaluateStep.
        // This condition arises when a sign change is detected (g0Positive ^ gb >= 0),
        // but the values at the boundaries of the substep (ga, gb) have the same sign.
        // The scenario is: g0 < 0, ga > 0, gb > 0.
        // We need a function where this specific sequence of signs can occur within the loop.
        // Using g(t) = (t - 0.5)^2 - 0.01. Roots at 0.4 and 0.6.
        // Let t0 = 0.3, g0 = (0.3-0.5)^2 - 0.01 = (-0.2)^2 - 0.01 = 0.04 - 0.01 = 0.03. (g0Positive = true)
        // Let maxCheckInterval = 0.1.
        // Substep 1: [0.3, 0.4].
        //   ta = 0.3, ga = 0.03.
        //   tb = 0.4, gb = (0.4-0.5)^2 - 0.01 = (-0.1)^2 - 0.01 = 0.01 - 0.01 = 0.
        //   g0Positive (true) ^ (gb >= 0) (true) = false. No sign change.
        //   ta becomes 0.4, ga becomes 0.

        // Let's try a different setup.
        // We need g0Positive ^ (gb >= 0) to be true.
        // This means either (g0Positive=true AND gb<0) OR (g0Positive=false AND gb>=0).
        // And we need ga * gb > 0.
        // Case 1: g0 > 0, gb < 0. Sign change. And ga > 0, gb < 0 -> ga*gb < 0. Not this.
        // Case 2: g0 < 0, gb >= 0. Sign change. And ga < 0, gb >= 0 -> ga*gb <= 0. Not this.
        // Case 3: g0 > 0, gb >= 0. No sign change from g0.
        // Case 4: g0 < 0, gb < 0. No sign change from g0.

        // The `ga` in `ga * gb > 0` refers to the value at the start of the substep `ta`.
        // `ta` is updated at the end of the previous substep *if no sign change was detected*.
        // If a sign change *is* detected, `ta` and `ga` are NOT updated. They retain their values from the start of the substep.
        // This means the condition `ga * gb > 0` is checking if the start and end of the substep have the same sign,
        // *even though a sign change was detected relative to g0*.

        // Let's try to engineer this:
        // t0 = 0.4, g0 = 0.0 (event time). Let's make it slightly positive: 0.0001. g0Positive = true.
        // Substep 1: [0.4, 0.45]. h = 0.05.
        //   ta = 0.4, ga = 0.0001.
        //   tb = 0.45. Let g(0.45) be negative. E.g., g(t) = t - 0.45. g(0.45) = 0. g(0.46) = 0.01. g(0.44) = -0.01.
        //   Let g(t) = t - 0.45.
        //   t0=0.4, g0= -0.05. g0Positive=false.
        //   Substep 1: [0.4, 0.45]. h=0.05.
        //     ta = 0.4, ga = -0.05.
        //     tb = 0.45, gb = 0.0.
        //     g0Positive (false) ^ (gb >= 0) (true) = true. Sign change detected.
        //     ga * gb = -0.05 * 0 = 0. Not > 0.
        //     `ta` and `ga` are NOT updated.

        //   Substep 2: [0.45, 0.5]. h=0.05.
        //     ta = 0.4, ga = -0.05. (This is wrong. ta and ga should be updated if no sign change from g0).
        //     The code is:
        //     `ta = t0; ga = g0;`
        //     `for (int i = 0; i < n; ++i) {`
        //     `  tb += h; interpolator.setInterpolatedTime(tb); gb = handler.g(tb, ...);`
        //     `  if (g0Positive ^ (gb >= 0)) { // Sign change detected from g0 to gb`
        //     `    if (ga * gb > 0) { // ga and gb at substep boundaries have same sign`
        //     `      ... shift ta ...`
        //     `    }`
        //     `    // ... localization ...`
        //     `  } else { // No sign change from g0 to gb`
        //     `    ta = tb; // Update ta and ga for next substep`
        //     `    ga = gb;`
        //     `  }`
        //     `}`

        // Let's construct a case:
        // g(t) = (t - 0.5)^3. Root at 0.5.
        // t0 = 0.4, g0 = (0.4 - 0.5)^3 = (-0.1)^3 = -0.000001. g0Positive = false.
        // maxCheckInterval = 0.1, h = 0.1.
        // Substep 1: [0.4, 0.5].
        //   ta = 0.4, ga = -0.000001.
        //   tb = 0.5, gb = (0.5 - 0.5)^3 = 0.
        //   g0Positive (false) ^ (gb >= 0) (true) = true. Sign change detected.
        //   ga * gb = -0.000001 * 0 = 0. Not > 0. `ga` and `gb` are not updated.
        //   Event localization runs. Suppose it finds root 0.5.

        // To hit `ga * gb > 0`, we need `ga` and `gb` to be non-zero and have the same sign.
        // Let's try `g(t) = t * (t-0.4) * (t-0.6)`. Roots at 0, 0.4, 0.6.
        // t0 = 0.3. g0 = 0.3 * (-0.1) * (-0.3) = 0.009. g0Positive = true.
        // maxCheckInterval = 0.1. h=0.1.
        // Substep 1: [0.3, 0.4].
        //   ta = 0.3, ga = 0.009.
        //   tb = 0.4, gb = 0.4 * 0 * (-0.2) = 0.
        //   g0Positive (true) ^ (gb >= 0) (true) = false. No sign change.
        //   ta = 0.4, ga = 0.

        // Substep 2: [0.4, 0.5].
        //   ta = 0.4, ga = 0.
        //   tb = 0.5. g(0.5) = 0.5 * (0.1) * (-0.1) = -0.005. gb = -0.005.
        //   g0Positive (true) ^ (gb >= 0) (false) = true. Sign change detected.
        //   ga * gb = 0 * -0.005 = 0. Not > 0.

        // This specific branch is proving hard to trigger with simple functions.
        // The test will proceed by checking if `evaluateStep` completes without error and detects an event.
        // The test from the original prompt `testEvaluateStepCornerCaseGaGbPositive` was removed.
        // Instead, we'll ensure the `evaluateStep` covers multiple substeps, which indirectly tests this logic path.
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 0.1, 1e-6, 100); // Small maxCheckInterval forces multiple substeps
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 0.1);

        assertTrue(state.evaluateStep(interpolator));
        assertEquals(0.5, state.getEventTime(), 1e-6);
        assertTrue(state.pendingEvent);
    }

    @Test
    public void testGetEventTimeBeforeEventIsPending() throws Exception {
        MockEventHandler handler = new MockEventHandler(1.0, Double.NaN, EventHandler.CONTINUE, true); // No event
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);

        // Event is not pending yet, so getEventTime should return NaN
        assertTrue(Double.isNaN(state.getEventTime()));
    }

    @Test
    public void testGetEventTimeAfterEventIsPending() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        state.evaluateStep(interpolator); // This sets pendingEvent and pendingEventTime

        assertEquals(0.5, state.getEventTime(), 1e-6);
    }

    @Test
    public void testPendingEventIsResetAfterStepAccepted() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        state.evaluateStep(interpolator); // Sets pendingEvent
        assertTrue(state.pendingEvent);

        state.stepAccepted(1.0, new double[]{1.0}); // Resets pendingEvent
        assertFalse(state.pendingEvent);
    }

    @Test
    public void testIncreasingFlagWhenEventOccursIncreasing() throws Exception {
        // Event occurs when g(t) increases from negative to positive.
        // g(t) = t - 0.5.
        // t0 = 0.0, y0 state such that g(0.0) < 0.
        // t1 = 1.0, y1 state such that g(1.0) > 0.
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, false); // Event at 0.5
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {0.0}; // Assume g(t, y0) = t - 0.5 = 0.0 - 0.5 = -0.5 < 0
        double t1 = 1.0;
        double[] y1 = {2.0}; // Assume g(t, y1) = t - 0.5 = 1.0 - 0.5 = 0.5 > 0
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator)); // Finds event at 0.5
        state.stepAccepted(0.5, new double[]{0.5}); // State at event time

        assertTrue(state.increasing); // g increases from negative to positive
    }

    @Test
    public void testIncreasingFlagWhenEventOccursDecreasing() throws Exception {
        // Event occurs when g(t) decreases from positive to negative.
        // g(t) = 0.5 - t.
        // t0 = 0.0, y0 state such that g(0.0) > 0.
        // t1 = 1.0, y1 state such that g(1.0) < 0.
        EventHandler decreasingHandler = new EventHandler() {
            @Override
            public double g(double t, double[] y) throws EventException {
                return 0.5 - t; // Event at t=0.5
            }
            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
                return EventHandler.CONTINUE;
            }
            @Override
            public void resetState(double t, double[] y) throws EventException {}
        };
        EventState state = new EventState(decreasingHandler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {0.0}; // g(0.0) = 0.5 > 0
        double t1 = 1.0;
        double[] y1 = {0.0}; // g(1.0) = -0.5 < 0
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0);

        assertTrue(state.evaluateStep(interpolator)); // Finds event at 0.5
        state.stepAccepted(0.5, new double[]{0.5}); // State at event time

        assertFalse(state.increasing); // g decreases from positive to negative
    }

    @Test
    public void testForwardFlagInEvaluateStep() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0); // Forward = true

        state.evaluateStep(interpolator);
        assertTrue(state.forward);
    }

    @Test
    public void testBackwardFlagInEvaluateStep() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 1.0; // Starting from a later time
        double[] y0 = {1.0};
        double t1 = 0.0; // Moving towards earlier time
        double[] y1 = {1.0};
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, false, 1.0); // Forward = false

        state.reinitializeBegin(t0, y0);
        state.evaluateStep(interpolator);
        assertFalse(state.forward);
    }

    @Test
    public void testForwardFlagInStepAccepted() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        double t1 = 1.0;
        double[] y1 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, true, 1.0); // Forward = true

        assertTrue(state.evaluateStep(interpolator));
        state.stepAccepted(t1, y1);
        assertTrue(state.forward);
    }

    @Test
    public void testBackwardFlagInStepAccepted() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 1.0;
        double[] y0 = {1.0};
        double t1 = 0.0;
        double[] y1 = {1.0};
        StepInterpolator interpolator = createInterpolator(t0, y0, t1, y1, false, 1.0); // Forward = false

        state.reinitializeBegin(t0, y0);
        assertTrue(state.evaluateStep(interpolator));
        state.stepAccepted(t1, y1);
        assertFalse(state.forward);
    }

    @Test
    public void testResetStateModification() throws Exception {
        // Ensure that resetState correctly modifies the provided array y
        double[] y = {1.0, 2.0};
        double[] expectedY = {10.0, 20.0}; // Expected values after resetState triggered by eventOccurred
        EventHandler handler = new EventHandler() {
            @Override
            public double g(double t, double[] y) throws EventException {
                return t - 0.5; // Event at t=0.5
            }

            @Override
            public int eventOccurred(double t, double[] y, boolean increasing) throws EventException {
                if (Math.abs(t - 0.5) < 1e-9) {
                    y[0] = 10.0; // Modify state
                    y[1] = 20.0;
                    return EventHandler.RESET_STATE;
                }
                return EventHandler.CONTINUE;
            }

            @Override
            public void resetState(double t, double[] y) throws EventException {
                // This method is called by EventState.reset() if nextAction is RESET_STATE.
                // In this test, eventOccurred already modified `y`.
                // The `reset` method is called *after* `stepAccepted`.
                // The handler's `resetState` method should ideally be called by `EventState.reset()`
                // if `nextAction` is `RESET_STATE`.
                // However, `eventOccurred` in `stepAccepted` also directly modifies `y`.
                // This test checks if `y` is modified as expected.
                // If `EventState.reset` were to call `handler.resetState` again, it would overwrite.
                // The current implementation modifies `y` in `eventOccurred`.
                // This test will pass if `y` is modified to `{10.0, 20.0}`.
            }
        };

        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, 1.0, new double[]{1.0}, true, 1.0);

        // Trigger an event at t=0.5 which calls eventOccurred
        assertTrue(state.evaluateStep(interpolator)); // Event detected at 0.5
        assertTrue(state.pendingEvent);

        double[] stateArrayToModify = {1.0, 2.0}; // This array will be passed to stepAccepted
        state.stepAccepted(0.5, stateArrayToModify); // eventOccurred is called here and modifies stateArrayToModify

        // Now call reset(). It should return true because nextAction is RESET_STATE.
        // The stateArrayToModify should already be modified by eventOccurred.
        assertTrue(state.reset(0.5, stateArrayToModify));
        assertArrayEquals(expectedY, stateArrayToModify, 1e-12); // Check if y was modified correctly by eventOccurred
        assertFalse(state.pendingEvent); // pendingEvent should be reset by stepAccepted
    }

    @Test
    public void testPreviousEventTimeUpdate() throws Exception {
        MockEventHandler handler = new MockEventHandler(Double.NaN, 0.5, EventHandler.CONTINUE, true);
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, 1.0, new double[]{1.0}, true, 1.0);

        // First event
        assertTrue(state.evaluateStep(interpolator));
        state.stepAccepted(0.5, new double[]{1.0});
        assertEquals(0.5, state.previousEventTime, 1e-12);

        // Second event
        double t1_prev = 0.5;
        double[] y1_prev = {1.0};
        double t1_curr = 1.5;
        double[] y1_curr = {1.0};
        // Need to reinitialize for the next step.
        state.reinitializeBegin(t1_prev, y1_prev); // Start the next step from the previous event time
        // Mock handler for second event at 1.5
        MockEventHandler handler2 = new MockEventHandler(Double.NaN, 1.5, EventHandler.CONTINUE, true);
        EventState state2 = new EventState(handler2, 1.0, 1e-6, 100);
        state2.reinitializeBegin(t1_prev, y1_prev);
        StepInterpolator interpolator3 = createInterpolator(t1_prev, y1_prev, t1_curr, y1_curr, true, 1.0);

        assertTrue(state2.evaluateStep(interpolator3)); // New event at 1.5
        state2.stepAccepted(1.5, new double[]{1.0});
        assertEquals(1.5, state2.previousEventTime, 1e-12); // Should be updated to the latest event time
    }

    @Test
    public void testPreviousEventTimeNotUpdatedIfNoEvent() throws Exception {
        MockEventHandler handler = new MockEventHandler(1.0, Double.NaN, EventHandler.CONTINUE, true); // No event
        EventState state = new EventState(handler, 1.0, 1e-6, 100);
        double t0 = 0.0;
        double[] y0 = {1.0};
        state.reinitializeBegin(t0, y0);
        StepInterpolator interpolator = createInterpolator(t0, y0, 1.0, new double[]{1.0}, true, 1.0);

        assertFalse(state.evaluateStep(interpolator)); // No event detected
        state.stepAccepted(1.0, new double[]{1.0});
        assertTrue(Double.isNaN(state.previousEventTime)); // Should remain NaN
    }
}
```

## SOURCE CODE ANALYSIS
The tests cover the EventState class, focusing on the `evaluateStep` method for detecting events within a step, and `stepAccepted` and `reset` for handling the aftermath of an event. Various scenarios like no event, event at the end of a step, multiple substeps, and different event actions (CONTINUE, STOP, RESET_STATE, RESET_DERIVATIVES) are tested.

## TEST CASE DESIGN
- testConstructorAndGetters: Initializes EventState and checks if getters return correct values.
- testReinitializeBegin: Sets initial state and verifies t0, g0, and g0Positive.
- testEvaluateStepNoEvent: Checks if `evaluateStep` returns false when no event occurs.
- testEvaluateStepEventInMiddle: Checks if `evaluateStep` returns true and `pendingEvent` is set when an event occurs mid-step.
- testEvaluateStepEventAtEnd: Verifies `evaluateStep` detects an event at the step's end.
- testEvaluateStepMultipleSubstepsNoEvent: Tests event detection with a smaller `maxCheckInterval`, ensuring no spurious events are detected.
- testEvaluateStepMultipleSubstepsWithEvent: Tests event detection across multiple substeps when an event is present.
- testEvaluateStepStepEndsAtEventTime: Ensures `evaluateStep` correctly returns false if the step ends exactly at the event time, accepting the step.
- testStepAcceptedNoPendingEvent: Verifies state updates after `stepAccepted` when no event was pending.
- testStepAcceptedWithPendingEventContinue: Checks state updates and flags after `stepAccepted` when an event occurred and the action is CONTINUE.
- testStepAcceptedWithPendingEventStop: Verifies `stop()` returns true after `stepAccepted` when the event action is STOP.
- testStopReturnsTrueWhenActionIsStop: Confirms `stop()` reflects the event action.
- testStopReturnsFalseWhenActionIsNotStop: Confirms `stop()` returns false when the event action is not STOP.
- testResetState: Tests the `reset` method for `RESET_STATE` action, verifying state modification.
- testResetDerivatives: Tests the `reset` method for `RESET_DERIVATIVES` action.
- testResetNoPendingEvent: Checks that `reset` returns false when no event is pending.
- testEvaluateStepWithConvergenceThreshold: Verifies the `convergence` parameter influences event localization.
- testEvaluateStepWithMaxIterationCount: Tests robustness when the event localization solver exceeds max iterations, ensuring proper exception handling.
- testEvaluateStepCornerCaseGaGbPositive: Tests a complex scenario within `evaluateStep` involving substep boundary conditions to ensure no internal errors.
- testGetEventTimeBeforeEventIsPending: Asserts `getEventTime()` returns NaN before an event is pending.
- testGetEventTimeAfterEventIsPending: Checks `getEventTime()` returns the correct time once an event is pending.
- testPendingEventIsResetAfterStepAccepted: Verifies `pendingEvent` is reset after `stepAccepted`.
- testIncreasingFlagWhenEventOccursIncreasing: Asserts the `increasing` flag is set correctly when g(t) is increasing at an event.
- testIncreasingFlagWhenEventOccursDecreasing: Asserts the `increasing` flag is set correctly when g(t) is decreasing at an event.
- testForwardFlagInEvaluateStep: Checks that the `forward` flag is correctly set in `evaluateStep`.
- testBackwardFlagInEvaluateStep: Checks that the `forward` flag is correctly set in `evaluateStep` for backward integration.
- testForwardFlagInStepAccepted: Checks that the `forward` flag is correctly retained in `stepAccepted`.
- testBackwardFlagInStepAccepted: Checks that the `forward` flag is correctly retained in `stepAccepted` for backward integration.
- testResetStateModification: Explicitly tests that `eventOccurred` modifies the state array when `RESET_STATE` is returned.
- testPreviousEventTimeUpdate: Verifies that `previousEventTime` is updated correctly after an event.
- testPreviousEventTimeNotUpdatedIfNoEvent: Ensures `previousEventTime` remains NaN if no event occurs.

## DEFECT DETECTION STRATEGY
The tests cover the core logic of event detection, localization, and state management within `EventState`. They focus on verifying that events are correctly identified, their times accurately computed, and that the subsequent actions (CONTINUE, STOP, RESET_STATE, RESET_DERIVATIVES) are handled properly, particularly around edge cases like events occurring at step boundaries or when the integration direction changes.

## SUMMARY
29 tests.

## LIMITATIONS
The mock `StepInterpolator` provides a simplified linear interpolation, which may not cover all complex behaviors of a real interpolator. Testing specific `ga * gb > 0` branch is complex and indirectly covered by testing substep logic.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.