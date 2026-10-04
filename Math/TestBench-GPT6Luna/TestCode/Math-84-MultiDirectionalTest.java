package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;

public class MultiDirectionalTest {
    @Test
    public void testConstructorWithDefaultCoefficientsAndConfiguredOptimization() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setStartConfiguration(new double[] {1.0, 1.0});
        optimizer.setConvergenceChecker(new RealConvergenceChecker() {
            public boolean converged(int iteration, RealPointValuePair previous,
                                     RealPointValuePair current) {
                return iteration >= 1;
            }
        });
        RealPointValuePair result = optimizer.optimize(
            new org.apache.commons.math.analysis.MultivariateRealFunction() {
                public double value(double[] point) {
                    return point[0] * point[0] + point[1] * point[1];
                }
            },
            org.apache.commons.math.optimization.GoalType.MINIMIZE,
            new double[] {0.0, 0.0});
        assertEquals(0.0, result.getValue(), 0.0);
        assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testExplicitCoefficientsWithConfiguredOptimization() throws Exception {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        optimizer.setStartConfiguration(new double[] {1.0});
        optimizer.setConvergenceChecker(new RealConvergenceChecker() {
            public boolean converged(int iteration, RealPointValuePair previous,
                                     RealPointValuePair current) {
                return iteration >= 1;
            }
        });
        RealPointValuePair result = optimizer.optimize(
            new org.apache.commons.math.analysis.MultivariateRealFunction() {
                public double value(double[] point) {
                    return point[0] * point[0];
                }
            },
            org.apache.commons.math.optimization.GoalType.MINIMIZE,
            new double[] {0.0});
        assertEquals(0.0, result.getValue(), 0.0);
        assertEquals(1, optimizer.getIterations());
    }
}
