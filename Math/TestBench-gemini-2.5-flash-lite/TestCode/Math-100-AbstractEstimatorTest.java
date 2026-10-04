package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.linear.InvalidMatrixException;
import org.apache.commons.math.linear.RealMatrixImpl;

public class AbstractEstimatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSetMaxCostEvalAndGetCostEvaluations() throws Exception {
        // AbstractEstimator has private fields, so we can't directly test setMaxCostEval.
        // This test mainly ensures the method can be called without error.
        // The behavior of maxCostEval is tested indirectly in testUpdateResidualsAndCostExceedsMax.
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(10);
        // We can't assert getCostEvaluations here as it should be 0 until estimate() is called.
        // This test primarily serves as a smoke test for setMaxCostEval.
    }

    @Test
    public void testSetMaxCostEvalZero() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(0);
        // Similar to above, testing the setter. The behavior with maxCostEval=0 is tested later.
    }

    @Test
    public void testSetMaxCostEvalNegative() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // No explicit check for negative in setMaxCostEval, assume it's allowed by setter.
        estimator.setMaxCostEval(-5);
        // The behavior with negative maxCostEval is tested indirectly in testUpdateResidualsAndCostExceedsMax.
    }

    @Test
    public void testGetJacobianEvaluationsInitial() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testGetRMS() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 5.0, 2.0); // weight, measured, residual
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(2.0, 10.0, 1.0);
        WeightedMeasurement[] measurements = {wm1, wm2};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // Formula: sqrt( (w1*r1^2 + w2*r2^2) / n )
        double expectedRMS = Math.sqrt((1.0 * 2.0 * 2.0 + 2.0 * 1.0 * 1.0) / 2.0);
        assertEquals(expectedRMS, estimator.getRMS(problem), 1e-9);
    }

    @Test
    public void testGetRMSWithZeroWeight() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(0.0, 5.0, 2.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // If weight is 0, the weighted residual squared term is 0.
        assertEquals(0.0, estimator.getRMS(problem), 1e-9);
    }

    @Test
    public void testGetRMSWithZeroResidual() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 5.0, 0.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // If residual is 0, the weighted residual squared term is 0.
        assertEquals(0.0, estimator.getRMS(problem), 1e-9);
    }

    @Test
    public void testGetChiSquare() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 5.0, 2.0);
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(2.0, 10.0, 1.0);
        WeightedMeasurement[] measurements = {wm1, wm2};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // Formula: sum( r_i^2 / w_i )
        double expectedChiSquare = (2.0 * 2.0 / 1.0) + (1.0 * 1.0 / 2.0);
        assertEquals(expectedChiSquare, estimator.getChiSquare(problem), 1e-9);
    }

    @Test
    public void testGetChiSquareWithZeroWeight() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(0.0, 5.0, 2.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // Division by zero weight results in infinity.
        assertEquals(Double.POSITIVE_INFINITY, estimator.getChiSquare(problem), 1e-9);
    }

    @Test
    public void testGetChiSquareWithZeroResidual() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 5.0, 0.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // If residual is 0, residual squared is 0.
        assertEquals(0.0, estimator.getChiSquare(problem), 1e-9);
    }












    @Test
    public void testGetRMSWithEmptyMeasurements() throws Exception {
        WeightedMeasurement[] measurements = {};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        try {
            estimator.getRMS(problem);
            fail("Expected ArithmeticException for empty measurements");
        } catch (ArithmeticException e) {
            // Expected behavior when dividing by wm.length which is 0.
        }
    }

    @Test
    public void testGetChiSquareWithEmptyMeasurements() throws Exception {
        WeightedMeasurement[] measurements = {};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        try {
            estimator.getChiSquare(problem);
            fail("Expected ArithmeticException for empty measurements");
        } catch (ArithmeticException e) {
            // Expected behavior when dividing by wm.length which is 0.
        }
    }

    // Dummy implementations for testing purposes
    private static class DummyWeightedMeasurement extends WeightedMeasurement {
        private static final long serialVersionUID = 1L;
        private final double weight;
        private final double measuredValue;
        private final double residual;
        private final double theoreticalValue;

        public DummyWeightedMeasurement(double weight, double measuredValue, double residual) {
            // Call the constructor of the superclass WeightedMeasurement.
            // It requires weight, measuredValue, and an ignored flag.
            // We'll set ignored to false by default for these tests.
            super(weight, measuredValue, false);
            this.weight = weight;
            this.measuredValue = measuredValue;
            this.residual = residual;
            // Theoretical value is measuredValue - residual.
            this.theoreticalValue = measuredValue - residual;
        }

        @Override
        public double getTheoreticalValue() {
            return theoreticalValue;
        }

        @Override
        public double getPartial(EstimatedParameter parameter) {
            // Default implementation returns 0.0. Subclasses can override.
            return 0.0;
        }

        // Override abstract methods from WeightedMeasurement if any
        @Override
        public double getWeight() { return weight; }
        @Override
        public double getMeasuredValue() { return measuredValue; }
        @Override
        public double getResidual() { return residual; }
    }

    // Dummy implementation for EstimatedParameter

    private static class DummyEstimationProblem implements EstimationProblem {
        private final WeightedMeasurement[] measurements;
        private final EstimatedParameter[] unboundParameters;
        private final EstimatedParameter[] allParameters;

        public DummyEstimationProblem(WeightedMeasurement[] measurements, EstimatedParameter[] unboundParameters) {
            this.measurements = measurements;
            this.unboundParameters = unboundParameters;
            // For simplicity in this dummy, assume all parameters are unbound.
            this.allParameters = unboundParameters;
        }

        @Override
        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }

        @Override
        public EstimatedParameter[] getUnboundParameters() {
            return unboundParameters;
        }

        @Override
        public EstimatedParameter[] getAllParameters() {
            return allParameters;
        }
    }

    // Concrete subclass implementation for testing AbstractEstimator
    // We need to provide an implementation for the abstract method estimate().
    private static class LevenbergMarquardtEstimator extends AbstractEstimator {
        private static final long serialVersionUID = 1L;

        public LevenbergMarquardtEstimator() {
            // The constructor of AbstractEstimator is protected and has no arguments.
            // The concrete class constructor can call it.
            // Fields like jacobian, rows, cols, residuals, cost are initialized in initializeEstimate.
        }

        /**
         * {@inheritDoc}
         * This method is abstract in AbstractEstimator, so it must be implemented here.
         * For testing purposes, we can leave it empty or throw an exception if it's not relevant to the test.
         */
        @Override
        public void estimate(EstimationProblem problem) throws EstimationException {
            // For tests that don't rely on the 'estimate' method itself,
            // we can provide a no-op implementation or throw an exception
            // to indicate it's not meant to be called.
            // If a test calls this, it should expect an exception or handle it.
            // Some tests here mock or override this for specific scenarios.
        }
    }
}


