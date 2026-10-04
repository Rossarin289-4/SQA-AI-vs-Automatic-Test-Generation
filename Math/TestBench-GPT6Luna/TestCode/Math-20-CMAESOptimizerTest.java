package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NotPositiveException;
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
    public void testSigmaHistoryStartsEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testMeanHistoryStartsEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
    }

    @Test
    public void testFitnessHistoryStartsEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test
    public void testDHistoryStartsEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testSigmaHistoryIsMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(2.5);
        assertEquals(Double.valueOf(2.5), optimizer.getStatisticsSigmaHistory().get(0));
    }

    @Test
    public void testMeanHistoryReturnsSameList() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        List<RealMatrix> history = optimizer.getStatisticsMeanHistory();
        history.add(new Array2DRowRealMatrix(new double[][] {{3.0}}));
        assertEquals(3.0, optimizer.getStatisticsMeanHistory().get(0).getEntry(0, 0), 0.0);
    }

    @Test
    public void testFitnessHistoryIsMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsFitnessHistory().add(-4.0);
        assertEquals(Double.valueOf(-4.0), optimizer.getStatisticsFitnessHistory().get(0));
    }

    @Test
    public void testDHistoryIsMutable() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        RealMatrix value = new Array2DRowRealMatrix(new double[][] {{7.0}});
        optimizer.getStatisticsDHistory().add(value);
        assertEquals(value, optimizer.getStatisticsDHistory().get(0));
    }

    @Test
    public void testDefaultConstructorHistoryListsAreIndependent() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(1.0);
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test
    public void testIntegerConstructorHistoryListsAreIndependent() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4);
        optimizer.getStatisticsMeanHistory().add(new Array2DRowRealMatrix(new double[][] {{1.0}}));
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testInputSigmaConstructorHistoryStartsEmpty() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4, new double[] {0.5});
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testSigmaHistoryCanHoldMultipleValues() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(0.0);
        optimizer.getStatisticsSigmaHistory().add(1.0);
        assertEquals(Arrays.asList(0.0, 1.0), optimizer.getStatisticsSigmaHistory());
    }

    @Test
    public void testOptimizerConstructionWithSigmaDoesNotChangeHistories() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer(4, new double[] {0.0});
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test
    public void testStatisticsListsAreDistinct() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(3.0);
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test
    public void testStatisticsMeanListAcceptsMultipleMatrices() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsMeanHistory().add(new Array2DRowRealMatrix(new double[][] {{0.0}}));
        optimizer.getStatisticsMeanHistory().add(new Array2DRowRealMatrix(new double[][] {{1.0}}));
        assertEquals(2, optimizer.getStatisticsMeanHistory().size());
    }

    @Test
    public void testStatisticsDListCanBeCleared() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsDHistory().add(new Array2DRowRealMatrix(new double[][] {{2.0}}));
        optimizer.getStatisticsDHistory().clear();
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testSigmaHistoryCanBeCleared() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsSigmaHistory().add(1.0);
        optimizer.getStatisticsSigmaHistory().clear();
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testFitnessHistoryCanStoreNegativeValues() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        optimizer.getStatisticsFitnessHistory().add(-1.0);
        assertEquals(Double.valueOf(-1.0), optimizer.getStatisticsFitnessHistory().get(0));
    }

    @Test
    public void testMeanHistoryStoresMatrixEntries() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {{-2.0, 4.0}});
        optimizer.getStatisticsMeanHistory().add(matrix);
        assertEquals(4.0, optimizer.getStatisticsMeanHistory().get(0).getEntry(0, 1), 0.0);
    }

    @Test
    public void testDElementHistoryStoresExactReference() throws Exception {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {{-3.0}});
        optimizer.getStatisticsDHistory().add(matrix);
        assertSame(matrix, optimizer.getStatisticsDHistory().get(0));
    }

    @Test
    public void testSeparateOptimizerHasIndependentSigmaHistory() throws Exception {
        CMAESOptimizer first = new CMAESOptimizer();
        CMAESOptimizer second = new CMAESOptimizer();
        first.getStatisticsSigmaHistory().add(1.0);
        assertEquals(0, second.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testSeparateOptimizerHasIndependentMeanHistory() throws Exception {
        CMAESOptimizer first = new CMAESOptimizer();
        CMAESOptimizer second = new CMAESOptimizer();
        first.getStatisticsMeanHistory().add(new Array2DRowRealMatrix(new double[][] {{1.0}}));
        assertEquals(0, second.getStatisticsMeanHistory().size());
    }
}
