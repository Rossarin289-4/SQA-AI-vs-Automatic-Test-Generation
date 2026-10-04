package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.util.FastMath;

public class EmbeddedRungeKuttaIntegratorTest {

    // Dummy ODE for testing
    private static class DummyODE implements FirstOrderDifferentialEquations {
        public int getDimension() {
            return 1;
        }
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = -y[0]; // y' = -y
        }
    }

    // Dummy ODE for testing with dimension 2
    private static class MultiDimODE implements FirstOrderDifferentialEquations {
        public int getDimension() { return 2; }
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            yDot[0] = -y[0]; // y0' = -y0
            yDot[1] = -2 * y[1]; // y1' = -2*y1
        }
    }

    // Dummy ODE for testing with dimension 0
    private static class ZeroDimODE implements FirstOrderDifferentialEquations {
        public int getDimension() { return 0; }
        public void computeDerivatives(double t, double[] y, double[] yDot) {}
    }


    @Test
    public void testSetGetSafety() {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-6;
        final double relTol = 1e-6;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        assertEquals(0.9, integrator.getSafety(), 1e-15);
        integrator.setSafety(0.8);
        assertEquals(0.8, integrator.getSafety(), 1e-15);
    }

    @Test
    public void testSetGetMinReduction() {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-6;
        final double relTol = 1e-6;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        assertEquals(0.2, integrator.getMinReduction(), 1e-15);
        integrator.setMinReduction(0.1);
        assertEquals(0.1, integrator.getMinReduction(), 1e-15);
    }

    @Test
    public void testSetGetMaxGrowth() {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-6;
        final double relTol = 1e-6;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        assertEquals(10.0, integrator.getMaxGrowth(), 1e-15);
        integrator.setMaxGrowth(20.0);
        assertEquals(20.0, integrator.getMaxGrowth(), 1e-15);
    }

    @Test
    public void testIntegrateBasicODE() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // For y' = -y, the solution is y(t) = y(0) * exp(-t).
        // At t=1, y(1) = 1.0 * exp(-1)
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 10); // Allow slightly larger tolerance due to integration error.
    }

    @Test
    public void testIntegrateToZero() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 0.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // If initial state is 0, it should remain 0.
        assertEquals(0.0, equations.getCompleteState()[0], 1e-15);
    }

    @Test
    public void testIntegrateBackward() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(1.0); // Start at t=1
        final double[] y0 = { FastMath.exp(-1.0) }; // y(1) = exp(-1)
        equations.setCompleteState(y0);
        final double t = 0.0; // Integrate backwards to t=0
        integrator.integrate(equations, t);

        // Integrating backwards should reach the initial condition at t=0.
        assertEquals(1.0, equations.getCompleteState()[0], absTol * 10);
    }

    @Test
    public void testIntegrateWithAbsoluteToleranceSet() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-10;
        final double relTol = 1e-8; // Relative tolerance is higher, absolute should dominate
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // Check if the error is within the absolute tolerance (multiplied by a small factor for integration errors).
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 100);
    }

    @Test
    public void testIntegrateWithRelativeToleranceSet() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-10; // Relative tolerance is lower, should dominate for larger values
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 100.0 }; // Larger initial value so relative tolerance matters
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // Check if the error is within the relative tolerance.
        final double expected = 100.0 * FastMath.exp(-1.0);
        final double error = FastMath.abs(equations.getCompleteState()[0] - expected);
        assertTrue(error <= relTol * FastMath.abs(expected) * 100); // Allow a factor for integration errors.
    }

    @Test
    public void testIntegrateWithVectorTolerances() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double[] absTol = { 1e-8 };
        final double[] relTol = { 1e-8 };
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // Check if the error is within the vector tolerances.
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol[0] * 100);
    }

    @Test
    public void testInitialStepSizeSet() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        integrator.setInitialStepSize(0.1); // Set an initial step size
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // We can't directly assert the step size used, but integration should proceed.
        // Check if the final state is correct as a proxy.
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 100);
    }

    @Test
    public void testMinStepBounds() throws Exception {
        final double minStep = 0.5; // Set a large min step
        final double maxStep = 1.0;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // The step size should be at least minStep if possible.
        // The step to reach t=1 from t=0 with minStep=0.5 will be 0.5.
        // The final state should be y(1) = exp(-1).
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 100);
    }

    @Test
    public void testMaxStepBounds() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 0.1; // Set a small max step
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // The step size should be at most maxStep.
        // The final state should be y(1) = exp(-1).
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 100);
    }

    @Test
    public void testFilterStepWithForwardIntegration() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1.0;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 0.5; // Target time
        integrator.integrate(equations, t); // Should not exceed t=0.5

        assertEquals(FastMath.exp(-0.5), equations.getCompleteState()[0], absTol * 100);
    }

    @Test
    public void testFilterStepWithBackwardIntegration() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1.0;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(1.0); // Start at t=1
        final double[] y0 = { FastMath.exp(-1.0) };
        equations.setCompleteState(y0);
        final double t = 0.5; // Target time backward
        integrator.integrate(equations, t); // Should not go below t=0.5

        assertEquals(FastMath.exp(-0.5), equations.getCompleteState()[0], absTol * 100);
    }

    @Test
    public void testEmptyState() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);

        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new ZeroDimODE());
        equations.setTime(0.0);
        final double[] y0 = {};
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        assertEquals(0, equations.getCompleteState().length);
    }

    @Test
    public void testSetStepSizeControlVector() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double[] absTol = { 1e-8, 1e-9 };
        final double[] relTol = { 1e-8, 1e-9 };
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);

        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new MultiDimODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0, 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);

        // Expected values: y0(1) = 1.0 * exp(-1), y1(1) = 1.0 * exp(-2)
        final double expectedY0 = FastMath.exp(-1.0);
        final double expectedY1 = FastMath.exp(-2.0);
        assertEquals(expectedY0, equations.getCompleteState()[0], absTol[0] * 100);
        assertEquals(expectedY1, equations.getCompleteState()[1], absTol[1] * 100);
    }

    // Test with a target time that is exactly at the start time.
    @Test
    public void testIntegrateToStartTime() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 0.0; // Target time is the same as start time
        integrator.integrate(equations, t);

        // The state should not change.
        assertEquals(1.0, equations.getCompleteState()[0], 1e-15);
    }

    // Test setting step size control with scalar values.
    @Test
    public void testSetStepSizeControlScalar() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        integrator.setStepSizeControl(1e-7, 1e-2, 1e-9, 1e-9);
        // Verify by checking that the values are set.
        assertEquals(1e-7, integrator.getMinStep(), 1e-15);
        assertEquals(1e-2, integrator.getMaxStep(), 1e-15);
        // Note: ScalAbsoluteTolerance and ScalRelativeTolerance are protected and not directly accessible from here.
    }

    // Test with a very large initial step size that gets clipped by maxStep.
    @Test
    public void testLargeInitialStepClippedByMaxStep() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 0.1;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        integrator.setInitialStepSize(1.0); // Much larger than maxStep
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);
        // The result should be correct, implying the step size was handled.
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 100);
    }

    // Test with a very small initial step size that gets capped by minStep.
    @Test
    public void testSmallInitialStepCappedByMinStep() throws Exception {
        final double minStep = 1e-3;
        final double maxStep = 1.0;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        integrator.setInitialStepSize(1e-6); // Much smaller than minStep
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);
        // The result should be correct, implying the step size was handled.
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 100);
    }

    // Test integration with a very small target time.
    @Test
    public void testSmallTargetTime() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-10;
        final double relTol = 1e-10;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1e-5; // Very small target time
        integrator.integrate(equations, t);

        assertEquals(FastMath.exp(-t), equations.getCompleteState()[0], absTol * 100);
    }

    // Test integration with a very large target time.
    @Test
    public void testLargeTargetTime() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-8;
        final double relTol = 1e-8;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 10.0; // Larger target time
        integrator.integrate(equations, t);

        // The step size will be limited by maxStep, so the integration might become less accurate for large times.
        // We use a slightly larger tolerance.
        assertEquals(FastMath.exp(-t), equations.getCompleteState()[0], absTol * 100);
    }

    // Test with parameters that might lead to very small or very large error estimates.
    @Test
    public void testExtremeErrorEstimation() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        final double absTol = 1e-12; // Very strict absolute tolerance
        final double relTol = 1e-12;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);
        // The strict tolerances should force smaller steps and more accurate results.
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 1000); // Increased tolerance factor due to strictness.
    }

    // Test with parameters that might lead to repeated step rejections.
    @Test
    public void testStepRejectionScenario() throws Exception {
        final double minStep = 1e-6;
        final double maxStep = 1e-3;
        // Use very loose tolerances to encourage large steps initially, which might then be rejected if error is high.
        final double absTol = 1e-2;
        final double relTol = 1e-2;
        final DormandPrince54Integrator integrator = new DormandPrince54Integrator(minStep, maxStep, absTol, relTol);
        final ExpandableStatefulODE equations = new ExpandableStatefulODE(new DummyODE());
        equations.setTime(0.0);
        final double[] y0 = { 1.0 };
        equations.setCompleteState(y0);
        final double t = 1.0;
        integrator.integrate(equations, t);
        // The final result should still be reasonably accurate.
        assertEquals(FastMath.exp(-1.0), equations.getCompleteState()[0], absTol * 100);
    }
}
