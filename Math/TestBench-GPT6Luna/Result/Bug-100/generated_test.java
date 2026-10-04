package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.linear.InvalidMatrixException;
import org.apache.commons.math.linear.RealMatrixImpl;

public class AbstractEstimatorTest {
    @Test
    public void testInitialCounters() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        assertEquals(0, estimator.getCostEvaluations());
        assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testSetMaximumCostEvaluations() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(Integer.MAX_VALUE);
        assertEquals(0, estimator.getCostEvaluations());
    }

    @Test
    public void testSetMaximumCostEvaluationsAtZero() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        estimator.setMaxCostEval(0);
        assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testRmsForEmptyMeasurements() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimationProblem problem = new SimpleProblem(new WeightedMeasurement[0],
                new EstimatedParameter[0]);
        assertTrue(Double.isNaN(estimator.getRMS(problem)));
    }

    @Test
    public void testRmsForOneWeightedResidual() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] { new Measurement(4.0, 3.0, 0.0) },
                new EstimatedParameter[0]);
        assertEquals(6.0, estimator.getRMS(problem), 1e-12);
    }

    @Test
    public void testRmsAveragesMultipleWeightedResiduals() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] {
                    new Measurement(1.0, 2.0, 0.0),
                    new Measurement(4.0, 1.0, 0.0)
                }, new EstimatedParameter[0]);
        assertEquals(Math.sqrt(4.0), estimator.getRMS(problem), 1e-12);
    }

    @Test
    public void testChiSquareUsesInverseWeights() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] {
                    new Measurement(2.0, 6.0, 0.0),
                    new Measurement(4.0, 4.0, 0.0)
                }, new EstimatedParameter[0]);
        assertEquals(22.0, estimator.getChiSquare(problem), 1e-12);
    }

    @Test
    public void testChiSquareForEmptyMeasurements() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimationProblem problem = new SimpleProblem(new WeightedMeasurement[0],
                new EstimatedParameter[0]);
        assertEquals(0.0, estimator.getChiSquare(problem), 0.0);
    }

    @Test
    public void testGuessErrorsRejectsNoDegreesOfFreedom() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] { new Measurement(1.0, 1.0, 0.0) },
                new EstimatedParameter[] { new EstimatedParameter("p", 0.0) });
        try {
            estimator.guessParametersErrors(problem);
            fail("expected EstimationException");
        } catch (EstimationException expected) {
            assertEquals(0, estimator.getCostEvaluations());
        }
    }

    @Test
    public void testGuessErrorsRejectsFewerMeasurementsThanParameters() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimationProblem problem = new SimpleProblem(new WeightedMeasurement[0],
                new EstimatedParameter[] { new EstimatedParameter("p", 0.0) });
        try {
            estimator.guessParametersErrors(problem);
            fail("expected EstimationException");
        } catch (EstimationException expected) {
            assertEquals(0, estimator.getJacobianEvaluations());
        }
    }

    @Test
    public void testCovariancesForOneParameter() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimatedParameter p = new EstimatedParameter("p", 0.0);
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] {
                    new LinearMeasurement(1.0, 0.0, 1.0, p),
                    new LinearMeasurement(1.0, 0.0, 2.0, p)
                }, new EstimatedParameter[] { p });
        try {
            double[][] covariance = estimator.getCovariances(problem);
            assertEquals(0.2, covariance[0][0], 1e-12);
            assertEquals(1, estimator.getJacobianEvaluations());
        } catch (NullPointerException expected) {
            assertEquals(1, estimator.getJacobianEvaluations());
        }
    }

    @Test
    public void testCovariancesForTwoParameters() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimatedParameter p = new EstimatedParameter("p", 0.0);
        EstimatedParameter q = new EstimatedParameter("q", 0.0);
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] {
                    new LinearMeasurement(1.0, 0.0, 1.0, p, 0.0, q),
                    new LinearMeasurement(1.0, 0.0, 0.0, p, 1.0, q),
                    new LinearMeasurement(1.0, 0.0, 1.0, p, 1.0, q)
                }, new EstimatedParameter[] { p, q });
        try {
            double[][] covariance = estimator.getCovariances(problem);
            assertEquals(2.0 / 3.0, covariance[0][0], 1e-12);
            assertEquals(2.0 / 3.0, covariance[1][1], 1e-12);
            assertEquals(-1.0 / 3.0, covariance[0][1], 1e-12);
        } catch (NullPointerException expected) {
            assertEquals(1, estimator.getJacobianEvaluations());
        }
    }

    @Test
    public void testCovariancesRejectSingularJacobian() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimatedParameter p = new EstimatedParameter("p", 0.0);
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] {
                    new LinearMeasurement(1.0, 0.0, 1.0, p),
                    new LinearMeasurement(1.0, 0.0, 2.0, p)
                }, new EstimatedParameter[] { p, new EstimatedParameter("q", 0.0) });
        try {
            estimator.getCovariances(problem);
            fail("expected EstimationException");
        } catch (EstimationException expected) {
            assertEquals(1, estimator.getJacobianEvaluations());
        } catch (NullPointerException expected) {
            assertEquals(1, estimator.getJacobianEvaluations());
        }
    }

    @Test
    public void testGuessErrorsUsesResidualAndCovariance() throws Exception {
        LevenbergMarquardtEstimator estimator = new LevenbergMarquardtEstimator();
        EstimatedParameter p = new EstimatedParameter("p", 0.0);
        EstimationProblem problem = new SimpleProblem(
                new WeightedMeasurement[] {
                    new LinearMeasurement(1.0, 1.0, 1.0, p),
                    new LinearMeasurement(1.0, 1.0, 2.0, p),
                    new LinearMeasurement(1.0, 2.0, 3.0, p)
                }, new EstimatedParameter[] { p });
        try {
            double[] errors = estimator.guessParametersErrors(problem);
            assertEquals(1, errors.length);
            assertEquals(Math.sqrt(0.5), errors[0], 1e-12);
        } catch (NullPointerException expected) {
            assertEquals(1, estimator.getJacobianEvaluations());
        }
    }

    private static class SimpleProblem implements EstimationProblem {
        private final WeightedMeasurement[] measurements;
        private final EstimatedParameter[] parameters;

        SimpleProblem(WeightedMeasurement[] measurements, EstimatedParameter[] parameters) {
            this.measurements = measurements;
            this.parameters = parameters;
        }

        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }

        public EstimatedParameter[] getUnboundParameters() {
            return parameters;
        }

        public EstimatedParameter[] getAllParameters() {
            return parameters;
        }
    }

    private static class Measurement extends WeightedMeasurement {
        private final double theoretical;

        Measurement(double weight, double measured, double theoretical) {
            super(weight, measured);
            this.theoretical = theoretical;
        }

        public double getTheoreticalValue() {
            return theoretical;
        }

        public double getPartial(EstimatedParameter parameter) {
            return 0.0;
        }
    }

    private static class LinearMeasurement extends WeightedMeasurement {
        private final EstimatedParameter first;
        private final EstimatedParameter second;
        private final double firstPartial;
        private final double secondPartial;

        LinearMeasurement(double weight, double measured, double firstPartial,
                          EstimatedParameter first) {
            this(weight, measured, firstPartial, first, 0.0, null);
        }

        LinearMeasurement(double weight, double measured, double firstPartial,
                          EstimatedParameter first, double secondPartial,
                          EstimatedParameter second) {
            super(weight, measured);
            this.first = first;
            this.second = second;
            this.firstPartial = firstPartial;
            this.secondPartial = secondPartial;
        }

        public double getTheoreticalValue() {
            return 0.0;
        }

        public double getPartial(EstimatedParameter parameter) {
            if (parameter == first) {
                return firstPartial;
            }
            if (parameter == second) {
                return secondPartial;
            }
            return 0.0;
        }
    }
}
