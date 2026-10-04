```java
package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.MultivariateOptimizer;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.MathArrays;

public class CMAESOptimizerTest {
    @Test
    public void testStatisticsHistoriesInitiallyEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testStatisticsHistoriesAreMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(2.0);
        assertEquals(Arrays.asList(2.0), optimizer.getStatisticsSigmaHistory());
    }

    @Test
    public void testStatisticsMeanHistoryInitiallyEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(1);
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
    }

    @Test
    public void testStatisticsFitnessHistoryInitiallyEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(1);
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test
    public void testStatisticsDHistoryInitiallyEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(1);
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testConstructorAcceptsZeroPopulationSetting() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(0);
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testConstructorAcceptsPositivePopulationSetting() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4);
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test
    public void testConstructorAcceptsInputSigma() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4, new double[] {1.0});
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testDeprecatedConstructorAcceptsNullSigmaAndRandom() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                4, null, 10, 0.0, true, 0, 0, null, false);
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
    }

    @Test
    public void testDefaultConstants() throws Exception {
        assertEquals(0, CMAESOptimizer.DEFAULT_CHECKFEASABLECOUNT);
        assertEquals(0.0, CMAESOptimizer.DEFAULT_STOPFITNESS, 0.0);
        assertTrue(CMAESOptimizer.DEFAULT_ISACTIVECMA);
        assertEquals(30000, CMAESOptimizer.DEFAULT_MAXITERATIONS);
        assertEquals(0, CMAESOptimizer.DEFAULT_DIAGONALONLY);
    }

    @Test
    public void testStatisticsSigmaHistoryCanHoldSeveralValues() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        List<Double> history = optimizer.getStatisticsSigmaHistory();
        history.add(0.5);
        history.add(1.0);
        assertEquals(2, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(1.0, optimizer.getStatisticsSigmaHistory().get(1), 0.0);
    }

    @Test
    public void testStatisticsHistoryListsAreIndependent() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(3.0);
        assertEquals(1, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test
    public void testSeparateOptimizersHaveIndependentStatistics() throws Exception {
        CMAESOptimizer first = new CMAESOptimizer();
        CMAESOptimizer second = new CMAESOptimizer();
        first.getStatisticsSigmaHistory().add(4.0);
        assertEquals(0, second.getStatisticsSigmaHistory().size());
    }
}
```