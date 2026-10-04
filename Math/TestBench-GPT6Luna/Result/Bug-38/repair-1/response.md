```java
package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.MultivariateOptimizer;

public class BOBYQAOptimizerTest {
    @Test
    public void testMinimumInterpolationCountOptimizesQuadratic() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return (point[0] - 1) * (point[0] - 1)
                                + (point[1] + 2) * (point[1] + 2);
                    }
                },
                GoalType.MINIMIZE, new double[] {0, 0},
                new double[] {-5, -5}, new double[] {5, 5});
        assertEquals(0, result.getValue(), 1e-6);
    }

    @Test
    public void testInterpolationCountAtUpperLimit() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return point[0] * point[0] + point[1] * point[1];
                    }
                },
                GoalType.MINIMIZE, new double[] {1, 1},
                new double[] {-5, -5}, new double[] {5, 5});
        assertEquals(0, result.getValue(), 1e-6);
    }

    @Test
    public void testMinimizationReturnsBestPointAndValue() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return (point[0] - 2) * (point[0] - 2)
                                + (point[1] - 1) * (point[1] - 1);
                    }
                },
                GoalType.MINIMIZE, new double[] {0, 0},
                new double[] {-4, -4}, new double[] {4, 4});
        assertEquals(0, result.getValue(), 1e-6);
        assertEquals(2, result.getPoint()[0], 1e-4);
        assertEquals(1, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testMaximizationReturnsObjectiveValue() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return -((point[0] - 1) * (point[0] - 1)
                                + (point[1] + 1) * (point[1] + 1));
                    }
                },
                GoalType.MAXIMIZE, new double[] {0, 0},
                new double[] {-4, -4}, new double[] {4, 4});
        assertEquals(0, result.getValue(), 1e-6);
        assertEquals(1, result.getPoint()[0], 1e-4);
        assertEquals(-1, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testMinimumProblemDimensionIsAccepted() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return point[0] * point[0] + point[1] * point[1];
                    }
                },
                GoalType.MINIMIZE, new double[] {1, -1},
                new double[] {-4, -4}, new double[] {4, 4});
        assertEquals(0, result.getValue(), 1e-6);
    }

    @Test
    public void testTooSmallProblemDimensionThrows() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        try {
            optimizer.optimize(20, new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0] * point[0];
                }
            }, GoalType.MINIMIZE, new double[] {0},
                    new double[] {-2}, new double[] {2});
            fail("expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testInterpolationCountAtLowerLimitIsAccepted() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return point[0] * point[0] + point[1] * point[1];
                    }
                },
                GoalType.MINIMIZE, new double[] {1, 1},
                new double[] {-4, -4}, new double[] {4, 4});
        assertEquals(0, result.getValue(), 1e-6);
    }

    @Test
    public void testInterpolationCountBelowLowerLimitThrows() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(3);
        try {
            optimizer.optimize(20, new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0] * point[0] + point[1] * point[1];
                }
            }, GoalType.MINIMIZE, new double[] {0, 0},
                    new double[] {-4, -4}, new double[] {4, 4});
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testInterpolationCountAboveUpperLimitThrows() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(7);
        try {
            optimizer.optimize(20, new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0] * point[0] + point[1] * point[1];
                }
            }, GoalType.MINIMIZE, new double[] {0, 0},
                    new double[] {-4, -4}, new double[] {4, 4});
            fail("expected OutOfRangeException");
        } catch (OutOfRangeException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testUnequalBoundsReduceInitialRadiusAndOptimize() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4, 10, 1e-7);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return (point[0] - 0.5) * (point[0] - 0.5)
                                + (point[1] - 0.5) * (point[1] - 0.5);
                    }
                },
                GoalType.MINIMIZE, new double[] {0.5, 0.5},
                new double[] {0, 0}, new double[] {3, 3});
        assertEquals(0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimumAtLowerBounds() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return point[0] + point[1];
                    }
                },
                GoalType.MINIMIZE, new double[] {1, 1},
                new double[] {0, 0}, new double[] {4, 4});
        assertEquals(0, result.getValue(), 1e-6);
        assertEquals(0, result.getPoint()[0], 1e-6);
        assertEquals(0, result.getPoint()[1], 1e-6);
    }

    @Test
    public void testOptimumAtUpperBounds() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return point[0] + point[1];
                    }
                },
                GoalType.MAXIMIZE, new double[] {1, 1},
                new double[] {0, 0}, new double[] {4, 4});
        assertEquals(8, result.getValue(), 1e-6);
        assertEquals(4, result.getPoint()[0], 1e-6);
        assertEquals(4, result.getPoint()[1], 1e-6);
    }

    @Test
    public void testStartingPointOutsideBoundsIsHandled() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return point[0] * point[0] + point[1] * point[1];
                    }
                },
                GoalType.MINIMIZE, new double[] {8, -8},
                new double[] {-3, -3}, new double[] {3, 3});
        assertEquals(0, result.getValue(), 1e-6);
        assertEquals(0, result.getPoint()[0], 1e-4);
        assertEquals(0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testTightBoundsWithReducedRadius() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4, 2, 1e-7);
        RealPointValuePair result = optimizer.optimize(
                100, new MultivariateFunction() {
                    public double value(double[] point) {
                        return (point[0] - 0.2) * (point[0] - 0.2)
                                + (point[1] + 0.2) * (point[1] + 0.2);
                    }
                },
                GoalType.MINIMIZE, new double[] {0, 0},
                new double[] {-0.5, -0.5}, new double[] {0.5, 0.5});
        assertEquals(0, result.getValue(), 1e-6);
    }

    @Test
    public void testConstantObjectiveReturnsItsValue() throws Exception {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        RealPointValuePair result = optimizer.optimize(
                50, new MultivariateFunction() {
                    public double value(double[] point) {
                        return 3;
                    }
                },
                GoalType.MINIMIZE, new double[] {0, 0},
                new double[] {-3, -3}, new double[] {3, 3});
        assertEquals(3, result.getValue(), 1e-12);
    }
}
```