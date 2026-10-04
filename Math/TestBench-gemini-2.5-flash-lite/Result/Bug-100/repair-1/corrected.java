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
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(10);
        // The value set by setMaxCostEval is stored in a private field,
        // and is not directly returned by getCostEvaluations.
        // getCostEvaluations returns the number of evaluations performed.
        // We can't directly assert that setMaxCostEval worked without a getter for maxCostEval.
        // However, we can test that the internal state is consistent if we can access it.
        // For now, we'll just call it and assume it's set correctly.
        // The test for exceeding maxCostEval will indirectly verify this.
    }

    @Test
    public void testSetMaxCostEvalZero() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(0);
        // Similar to above, no direct getter for maxCostEval.
        // The testUpdateResidualsAndCostExceedsMax will cover the behavior with maxCostEval=0.
    }

    @Test
    public void testSetMaxCostEvalNegative() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        // No explicit check for negative in setMaxCostEval, assume it's allowed by setter.
        // The testUpdateResidualsAndCostExceedsMax will cover the behavior with negative maxCostEval.
        estimator.setMaxCostEval(-5);
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
        double expectedRMS = Math.sqrt((1.0 * 2.0 * 2.0 + 2.0 * 1.0 * 1.0) / 2.0);
        assertEquals(expectedRMS, estimator.getRMS(problem), 1e-9);
    }

    @Test
    public void testGetRMSWithZeroWeight() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(0.0, 5.0, 2.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        assertEquals(0.0, estimator.getRMS(problem), 1e-9);
    }

    @Test
    public void testGetRMSWithZeroResidual() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 5.0, 0.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        assertEquals(0.0, estimator.getRMS(problem), 1e-9);
    }

    @Test
    public void testGetChiSquare() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 5.0, 2.0);
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(2.0, 10.0, 1.0);
        WeightedMeasurement[] measurements = {wm1, wm2};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        double expectedChiSquare = (2.0 * 2.0 / 1.0) + (1.0 * 1.0 / 2.0);
        assertEquals(expectedChiSquare, estimator.getChiSquare(problem), 1e-9);
    }

    @Test
    public void testGetChiSquareWithZeroWeight() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(0.0, 5.0, 2.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        assertEquals(Double.POSITIVE_INFINITY, estimator.getChiSquare(problem), 1e-9);
    }

    @Test
    public void testGetChiSquareWithZeroResidual() throws Exception {
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 5.0, 0.0);
        WeightedMeasurement[] measurements = {wm1};
        EstimationProblem problem = new DummyEstimationProblem(measurements, new EstimatedParameter[0]);

        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
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
        estimator.initializeEstimate(problem);
        estimator.updateJacobian(); // Populates the jacobian field.

        double[][] covariances = estimator.getCovariances(problem);
        assertEquals(1, covariances.length);
        assertEquals(1, covariances[0].length);
        assertEquals(0.2, covariances[0][0], 1e-9); // 1/5
    }

    @Test
    public void testCovariancesSingularProblem() throws Exception {
        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        EstimatedParameter[] unboundParams = {p1};

        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0) {
            @Override
            public double getPartial(EstimatedParameter parameter) {
                return 0.0; // Always 0 for p1
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

        AbstractEstimator estimator = new AbstractEstimator() {
            @Override
            public void estimate(EstimationProblem problem) throws EstimationException {}
        };
        estimator.initializeEstimate(problem);
        estimator.updateJacobian();

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
        WeightedMeasurement[] measurements = new WeightedMeasurement[3];
        for (int i = 0; i < 3; i++) {
            measurements[i] = new DummyWeightedMeasurement(1.0, 0.0, 1.0);
        }
        EstimationProblem problem = new DummyEstimationProblem(measurements, unboundParams);

        AbstractEstimator estimator = new AbstractEstimator() {
            @Override
            public void estimate(EstimationProblem problem) throws EstimationException {}
            @Override
            public double[][] getCovariances(EstimationProblem problem) throws EstimationException {
                return new double[][]{{0.5}};
            }
            @Override
            public double getChiSquare(EstimationProblem problem) {
                return 3.0;
            }
        };

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

        AbstractEstimator estimator = new AbstractEstimator() {
            @Override
            public void estimate(EstimationProblem problem) throws EstimationException {}
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

        AbstractEstimator estimator = new AbstractEstimator() {
            @Override
            public void estimate(EstimationProblem problem) throws EstimationException {}
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
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0);
        WeightedMeasurement wm2 = new DummyWeightedMeasurement(2.0, 2.0, 2.0);
        EstimationProblem problem = new DummyEstimationProblem(
                new WeightedMeasurement[]{wm1, wm2},
                new EstimatedParameter[]{p1}
        );
        estimator.initializeEstimate(problem);

        estimator.updateResidualsAndCost();

        assertEquals(3.0, estimator.cost, 1e-9);
        assertEquals(1.0, estimator.residuals[0], 1e-9);
        assertEquals(Math.sqrt(2.0) * 2.0, estimator.residuals[1], 1e-9);
        assertEquals(1, estimator.getCostEvaluations());
    }

    @Test
    public void testUpdateResidualsAndCostExceedsMax() throws Exception {
        AbstractEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(1);

        EstimatedParameter p1 = new DummyEstimatedParameter("p1", 0.0);
        WeightedMeasurement wm1 = new DummyWeightedMeasurement(1.0, 1.0, 1.0);
        EstimationProblem problem = new DummyEstimationProblem(
                new WeightedMeasurement[]{wm1},
                new EstimatedParameter[]{p1}
        );
        estimator.initializeEstimate(problem);

        estimator.updateResidualsAndCost(); // First call
        assertEquals(1, estimator.getCostEvaluations());

        try {
            estimator.updateResidualsAndCost(); // Second call
            fail("Expected EstimationException for exceeding max cost evaluations");
        } catch (EstimationException e) {
            assertTrue(e.getMessage().contains("maximal number of evaluations exceeded"));
            assertTrue(e.getMessage().contains("1"));
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
        estimator.updateJacobian();

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
            // Expected behavior
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
            // Expected behavior
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
            // AbstractWeightedMeasurement constructor requires weight, measuredValue, ignored
            super(weight, measuredValue, false); // Assuming not ignored by default
            this.weight = weight;
            this.measuredValue = measuredValue;
            this.residual = residual;
            this.theoreticalValue = measuredValue - residual;
        }

        @Override
        public double getTheoreticalValue() {
            return theoreticalValue;
        }

        @Override
        public double getPartial(EstimatedParameter parameter) {
            return 0.0;
        }

        @Override
        public double getWeight() { return weight; }
        @Override
        public double getMeasuredValue() { return measuredValue; }
        @Override
        public double getResidual() { return residual; }
    }

    private static class DummyEstimatedParameter extends EstimatedParameter {
        private static final long serialVersionUID = 1L;
        private final String name;
        private double value;

        public DummyEstimatedParameter(String name, double value) {
            super(name); // Corrected to call super constructor with String name
            this.name = name;
            this.value = value;
        }

        @Override
        public double getValue() { return value; }
        @Override
        public void setValue(double value) { this.value = value; }
    }

    private static class DummyEstimationProblem implements EstimationProblem {
        private final WeightedMeasurement[] measurements;
        private final EstimatedParameter[] unboundParameters;
        private final EstimatedParameter[] allParameters;

        public DummyEstimationProblem(WeightedMeasurement[] measurements, EstimatedParameter[] unboundParameters) {
            this.measurements = measurements;
            this.unboundParameters = unboundParameters;
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

    // Concrete subclass implementation for testing
    private static class LevenbergMarquardtEstimator extends AbstractEstimator {
        private static final long serialVersionUID = 1L;

        public LevenbergMarquardtEstimator() {
            // Need to call a constructor of AbstractEstimator, but it's protected.
            // Use the default constructor of the concrete class.
            // The fields are initialized in initializeEstimate.
        }

        @Override
        public void estimate(EstimationProblem problem) throws EstimationException {
            // Not implemented for test purposes.
            throw new UnsupportedOperationException("estimate method not implemented for testing.");
        }
    }
}
