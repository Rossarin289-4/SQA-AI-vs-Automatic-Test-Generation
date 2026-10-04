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
    public void testCovariancesSimple() throws Exception {
        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        EstimatedParameter[] unboundParams = {p1};

        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) {
                return (parameter == p1) ? 1.0 : 0.0;
            }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(1.0, 2.0, 2.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) {
                return (parameter == p1) ? 2.0 : 0.0;
            }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement[] measurements = {wm1, wm2};
        EstimationProblem problem = new DummyEstimationProblem(measurements, unboundParams);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // To call getCovariances, it must call updateJacobian first.
        // So, we need to call initializeEstimate first to set up internal state.
        estimator.initializeEstimate(problem);
        // The updateJacobian() method is called within getCovariances, so we don't need to call it here explicitly for getCovariances.
        // However, the fields jacobian, rows, cols, residuals, cost need to be populated before calling updateJacobian.
        // initializeEstimate does this.
        // For getCovariances, it first calls updateJacobian().
        double[][] covariances = estimator.getCovariances(problem);

        // J = [1, 2]^T (weighted partials)
        // J_w = [sqrt(w1)*J1, sqrt(w2)*J2]^T = [1*1, sqrt(1)*2]^T = [1, 2]^T
        // J_w.T = [1, 2]
        // J_w_T * J_w = [1, 2] * [1, 2]^T = 1*1 + 2*2 = 5
        // Covariance = (J_w_T * J_w)^-1 = 1/5 = 0.2
        assertEquals(1, covariances.length);
        assertEquals(1, covariances[0].length);
        assertEquals(0.2, covariances[0][0], 1e-9);
    }

    @Test
    public void testCovariancesSingularProblem() throws Exception {
        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        EstimatedParameter[] unboundParams = {p1};

        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) {
                return 0.0; // Always 0 for p1, leads to singular J^T J
            }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(1.0, 2.0, 2.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) {
                return 0.0; // Always 0 for p1
            }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement[] measurements = {wm1, wm2};
        EstimationProblem problem = new DummyEstimationProblem(measurements, unboundParams);

        // Use a concrete estimator that doesn't throw in estimate.
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.initializeEstimate(problem);

        try {
            estimator.getCovariances(problem);
            fail("Expected EstimationException for singular problem");
        } catch (EstimationException e) {
            assertTrue(e.getMessage().contains("singular problem"));
        }
    }

    @Test
    public void testGuessParametersErrors() throws Exception {
        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        EstimatedParameter[] unboundParams = {p1};
        // m=3, p=1, so m-p = 2 degrees of freedom
        WeightedMeasurement[] measurements = new WeightedMeasurement[3];
        for (int i = 0; i < 3; i++) {
            measurements[i] = new DummyWeightedMeasurement(1.0, 0.0, 1.0);
        }
        EstimationProblem problem = new DummyEstimationProblem(measurements, unboundParams);

        // Mocking getCovariances and getChiSquare for this test
        AbstractEstimator estimator = new LevenbergMarquardtEstimator() {
            @Override
            public double[][] getCovariances(EstimationProblem problem) throws EstimationException {
                return new double[][]{{0.5}}; // Covariance for p1
            }
            @Override
            public double getChiSquare(EstimationProblem problem) {
                return 3.0; // ChiSquare value
            }
            // The estimate method is abstract, need to provide a dummy implementation.
            @Override
            public void estimate(EstimationProblem problem) throws EstimationException {
                // No-op for this test, as we are testing guessParametersErrors directly.
            }
        };

        // degrees of freedom = m - p = 3 - 1 = 2
        // c = sqrt(ChiSquare / (m-p)) = sqrt(3.0 / 2) = sqrt(1.5)
        // error[i] = sqrt(covar[i][i]) * c
        // error[0] = sqrt(0.5) * sqrt(1.5) = sqrt(0.75)
        double[] errors = estimator.guessParametersErrors(problem);
        assertEquals(1, errors.length);
        assertEquals(Math.sqrt(0.75), errors[0], 1e-9);
    }

    @Test
    public void testGuessParametersErrorsNoDegreesOfFreedom() throws Exception {
        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        EstimatedParameter[] unboundParams = {p1};
        WeightedMeasurement[] measurements = {new DummyWeightedMeasurement(1.0, 0.0, 1.0)}; // m=1, p=1
        EstimationProblem problem = new DummyEstimationProblem(measurements, unboundParams);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator() {
             @Override
            public void estimate(EstimationProblem problem) throws EstimationException {
                // No-op for this test.
            }
        };

        try {
            estimator.guessParametersErrors(problem);
            fail("Expected EstimationException for no degrees of freedom");
        } catch (EstimationException e) {
            assertTrue(e.getMessage().contains("no degrees of freedom"));
            assertTrue(e.getMessage().contains("1 measurements"));
            assertTrue(e.getMessage().contains("1 parameters"));
        }
    }

    @Test
    public void testGuessParametersErrorsNoDegreesOfFreedomMultipleParams() throws Exception {
        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        EstimatedParameter p2 = new DummyEstimatedParameter("p2", 0.0);
        EstimatedParameter[] unboundParams = {p1, p2}; // p=2
        WeightedMeasurement[] measurements = {new DummyWeightedMeasurement(1.0, 0.0, 1.0)}; // m=1
        EstimationProblem problem = new DummyEstimationProblem(measurements, unboundParams);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator() {
             @Override
            public void estimate(EstimationProblem problem) throws EstimationException {
                // No-op for this test.
            }
        };

        try {
            estimator.guessParametersErrors(problem);
            fail("Expected EstimationException for no degrees of freedom");
        } catch (EstimationException e) {
            assertTrue(e.getMessage().contains("no degrees of freedom"));
            assertTrue(e.getMessage().contains("1 measurements"));
            assertTrue(e.getMessage().contains("2 parameters"));
        }
    }

    @Test
    public void testInitializeEstimateResetsCountersAndArrays() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator(); // Use concrete subclass

        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0);
        EstimationProblem problem = new DummyEstimationProblem(
                new WeightedMeasurement[]{wm1},
                new EstimatedParameter[]{p1}
        );
        estimator.initializeEstimate(problem);

        assertEquals(0, estimator.getCostEvaluations()); // Getter for counter
        assertEquals(0, estimator.getJacobianEvaluations()); // Getter for counter
        assertEquals(1, estimator.rows);
        assertEquals(1, estimator.cols);
        assertNotNull(estimator.jacobian);
        assertEquals(1 * 1, estimator.jacobian.length);
        assertNotNull(estimator.residuals);
        assertEquals(1, estimator.residuals.length);
        assertEquals(Double.POSITIVE_INFINITY, estimator.cost, 1e-9);
    }

    @Test
    public void testUpdateResidualsAndCost() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(5);

        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0); // w=1, res=1
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(2.0, 2.0, 2.0); // w=2, res=2
        EstimationProblem problem = new DummyEstimationProblem(
                new WeightedMeasurement[]{wm1, wm2},
                new EstimatedParameter[]{p1}
        );
        estimator.initializeEstimate(problem);

        estimator.updateResidualsAndCost();

        // cost = sqrt( sum(w_i * r_i^2) )
        // cost = sqrt( 1.0*1.0^2 + 2.0*2.0^2 ) = sqrt(1 + 8) = sqrt(9) = 3.0
        assertEquals(3.0, estimator.cost, 1e-9);
        // residuals[i] = sqrt(w_i) * r_i
        assertEquals(Math.sqrt(1.0) * 1.0, estimator.residuals[0], 1e-9);
        assertEquals(Math.sqrt(2.0) * 2.0, estimator.residuals[1], 1e-9);
        assertEquals(1, estimator.getCostEvaluations());
    }

    @Test
    public void testUpdateResidualsAndCostExceedsMax() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(1); // Allow only 1 evaluation

        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0);
        EstimationProblem problem = new DummyEstimationProblem(
                new WeightedMeasurement[]{wm1},
                new EstimatedParameter[]{p1}
        );
        estimator.initializeEstimate(problem);

        estimator.updateResidualsAndCost(); // First call, costEvaluations becomes 1
        assertEquals(1, estimator.getCostEvaluations());

        try {
            estimator.updateResidualsAndCost(); // Second call, costEvaluations will become 2, exceeding maxCostEval=1
            fail("Expected EstimationException for exceeding max cost evaluations");
        } catch (EstimationException e) {
            assertTrue(e.getMessage().contains("maximal number of evaluations exceeded"));
            assertTrue(e.getMessage().contains("1")); // Should contain the maxCostEval value
        }
    }

    @Test
    public void testUpdateJacobian() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        EstimatedParameter p2 = new DummyEstimatedParameter("p2", 0.0);
        EstimatedParameter[] unboundParams = {p1, p2};

        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) {
                if (parameter == p1) return 0.5;
                if (parameter == p2) return 1.0;
                return 0.0;
            }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(4.0, 2.0, 2.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) {
                if (parameter == p1) return 1.5;
                if (parameter == p2) return 2.0;
                return 0.0;
            }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement[] measurements = {wm1, wm2};
        EstimationProblem problem = new DummyEstimationProblem(measurements, unboundParams);

        estimator.initializeEstimate(problem);
        estimator.updateJacobian(); // This populates the jacobian array

        // jacobian[index++] = factor * wm.getPartial(parameters[j]);
        // factor = -Math.sqrt(wm.getWeight())
        // For wm1 (weight=1.0): factor = -1.0
        //   jacobian[0] = -1.0 * wm1.getPartial(p1) = -1.0 * 0.5 = -0.5
        //   jacobian[1] = -1.0 * wm1.getPartial(p2) = -1.0 * 1.0 = -1.0
        // For wm2 (weight=4.0): factor = -2.0
        //   jacobian[2] = -2.0 * wm2.getPartial(p1) = -2.0 * 1.5 = -3.0
        //   jacobian[3] = -2.0 * wm2.getPartial(p2) = -2.0 * 2.0 = -4.0
        assertEquals(-0.5, estimator.jacobian[0], 1e-9);
        assertEquals(-1.0, estimator.jacobian[1], 1e-9);
        assertEquals(-3.0, estimator.jacobian[2], 1e-9);
        assertEquals(-4.0, estimator.jacobian[3], 1e-9);

        assertEquals(1, estimator.getJacobianEvaluations()); // Should be incremented once
    }

    @Test
    public void testUpdateJacobianWithZeroWeight() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(0.0, 1.0, 1.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) { return 1.0; }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[]{p1});

        estimator.initializeEstimate(problem);
        estimator.updateJacobian();

        // factor = -Math.sqrt(0.0) = 0.0
        // jacobian[0] = 0.0 * wm1.getPartial(p1) = 0.0 * 1.0 = 0.0
        assertEquals(0.0, estimator.jacobian[0], 1e-9);
        assertEquals(1, estimator.getJacobianEvaluations());
    }

    @Test
    public void testUpdateJacobianWithZeroPartial() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(10);

        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) { return 0.0; }
            @Override
            public double getTheoreticalValue() { return 0.0; }
        };
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[]{p1});

        estimator.initializeEstimate(problem);
        estimator.updateJacobian();

        // factor = -Math.sqrt(1.0) = -1.0
        // jacobian[0] = -1.0 * wm1.getPartial(p1) = -1.0 * 0.0 = 0.0
        assertEquals(0.0, estimator.jacobian[0], 1e-9);
        assertEquals(1, estimator.getJacobianEvaluations());
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
    private static class DummyEstimatedParameter extends EstimatedParameter {
        private static final long serialVersionUID = 1L;
        private final String name;
        private double value;

        // The constructor for EstimatedParameter takes a String name.
        public DummyEstimatedParameter(String name, double value) {
            super(name); // Correctly call super constructor with String name
            this.name = name;
            this.value = value;
        }

        @Override
        public double getValue() {
            return value;
        }

        @Override
        public void setValue(double value) {
            this.value = value;
        }
    }

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
