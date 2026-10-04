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
    public void testDefaultStatisticsHistoriesAreEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testIntegerConstructorStatisticsHistoriesAreEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4);
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
    }

    @Test
    public void testSigmaHistoryIsMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(2.5);
        assertEquals(Arrays.asList(2.5), optimizer.getStatisticsSigmaHistory());
    }

    @Test
    public void testMeanHistoryIsMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {{3.0}});
        optimizer.getStatisticsMeanHistory().add(matrix);
        assertEquals(1, optimizer.getStatisticsMeanHistory().size());
        assertEquals(3.0, optimizer.getStatisticsMeanHistory().get(0).getEntry(0, 0), 0.0);
    }

    @Test
    public void testFitnessHistoryIsMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsFitnessHistory().add(-1.0);
        assertEquals(Arrays.asList(-1.0), optimizer.getStatisticsFitnessHistory());
    }

    @Test
    public void testDHistoryIsMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {{4.0}});
        optimizer.getStatisticsDHistory().add(matrix);
        assertEquals(1, optimizer.getStatisticsDHistory().size());
        assertEquals(4.0, optimizer.getStatisticsDHistory().get(0).getEntry(0, 0), 0.0);
    }

    @Test
    public void testOptimizerAcceptsConfiguredConstructorValues() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4, new double[] {0.5},
                10, 0.0, false, 0, 0, new MersenneTwister(1), true, null);
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testStatisticsRemainEmptyWhenNotRun() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4, new double[] {1.0},
                1, 0.0, false, 0, 0, new MersenneTwister(2), false, null);
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testHistoriesAreIndependentBetweenOptimizers() throws Exception {
        CMAESOptimizer first = new CMAESOptimizer();
        CMAESOptimizer second = new CMAESOptimizer();
        first.getStatisticsSigmaHistory().add(1.0);
        assertEquals(1, first.getStatisticsSigmaHistory().size());
        assertEquals(0, second.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testFourStatisticsCollectionsCanHoldDifferentSizes() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(1.0);
        optimizer.getStatisticsMeanHistory().add(new Array2DRowRealMatrix(new double[][] {{2.0}}));
        optimizer.getStatisticsMeanHistory().add(new Array2DRowRealMatrix(new double[][] {{3.0}}));
        optimizer.getStatisticsFitnessHistory().add(4.0);
        assertEquals(1, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(2, optimizer.getStatisticsMeanHistory().size());
        assertEquals(1, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testDefaultOptimizerStatisticsCollectionsAreDistinct() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(7.0);
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testFreshOptimizerHasEmptyMeanAndDHistories() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(2);
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }
}
