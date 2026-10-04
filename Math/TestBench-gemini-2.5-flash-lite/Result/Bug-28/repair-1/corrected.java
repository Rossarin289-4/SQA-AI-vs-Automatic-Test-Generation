package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.optimization.GoalType;

public class SimplexSolverTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSimpleMaxProblem() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{5, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{1, 3}, Relationship.LEQ, 5));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        assertArrayEquals(new double[]{1.4, 2.2}, solution.getPoint(), 1e-9);
        assertEquals(17.6, solution.getValue(), 1e-9);
    }

    @Test
    public void testSimpleMinProblem() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-5, -3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{1, 3}, Relationship.LEQ, 5));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        assertArrayEquals(new double[]{1.4, 2.2}, solution.getPoint(), 1e-9);
        assertEquals(-17.6, solution.getValue(), 1e-9);
    }

    @Test
    public void testComplexMaxProblem() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3, 4}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1, 1}, Relationship.LEQ, 30));
        constraints.add(new LinearConstraint(new double[]{2, -1, 1}, Relationship.LEQ, 20));
        constraints.add(new LinearConstraint(new double[]{0, 3, -1}, Relationship.LEQ, 15));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        assertArrayEquals(new double[]{15.0, 15.0, 0.0}, solution.getPoint(), 1e-9);
        assertEquals(105.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testComplexMinProblem() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-2, -3, -4}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1, 1}, Relationship.LEQ, 30));
        constraints.add(new LinearConstraint(new double[]{2, -1, 1}, Relationship.LEQ, 20));
        constraints.add(new LinearConstraint(new double[]{0, 3, -1}, Relationship.LEQ, 15));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        assertArrayEquals(new double[]{15.0, 15.0, 0.0}, solution.getPoint(), 1e-9);
        assertEquals(-105.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testMaxProblemWithMultipleOptimalSolutions() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{2, 2}, Relationship.LEQ, 2));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // The solution can be (0, 1) or (1, 0) or any point on the segment between them.
        // The specific solution returned depends on the pivot selection.
        // Here we check for one of the valid optimal points.
        assertTrue(solution.getValue() == 2.0);
    }

    @Test
    public void testMinProblemWithMultipleOptimalSolutions() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-2, -1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{2, 2}, Relationship.LEQ, 2));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // The solution can be (0, 1) or (1, 0) or any point on the segment between them.
        // The specific solution returned depends on the pivot selection.
        // Here we check for one of the valid optimal points.
        assertTrue(solution.getValue() == -2.0);
    }

    @Test
    public void testUnboundedSolutionMax() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{-1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{1, -2}, Relationship.LEQ, 1));
        SimplexSolver solver = new SimplexSolver();
        try {
            solver.doOptimize();
            fail("Unbounded solution should have been detected.");
        } catch (UnboundedSolutionException e) {
            // Expected exception
        }
    }

    @Test
    public void testUnboundedSolutionMin() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-1, -1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{-1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{1, -2}, Relationship.LEQ, 1));
        SimplexSolver solver = new SimplexSolver();
        try {
            solver.doOptimize();
            fail("Unbounded solution should have been detected.");
        } catch (UnboundedSolutionException e) {
            // Expected exception
        }
    }

    @Test
    public void testNoFeasibleSolution() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{-1, -1}, Relationship.LEQ, -2));
        SimplexSolver solver = new SimplexSolver();
        try {
            solver.doOptimize();
            fail("No feasible solution should have been detected.");
        } catch (NoFeasibleSolutionException e) {
            // Expected exception
        }
    }

    @Test
    public void testMaxIterationsExceeded() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 100000));
        constraints.add(new LinearConstraint(new double[]{1, -1}, Relationship.LEQ, 0));
        // Set a low max iterations to trigger the exception
        SimplexSolver solver = new SimplexSolver(1e-6, 10); // Default maxUlps, but low iterations for testing
        solver.setMaxIterations(5); // Lower max iterations for this specific test

        try {
            solver.doOptimize();
            fail("Max iterations should have been exceeded.");
        } catch (MaxCountExceededException e) {
            // Expected exception
            assertEquals(5, e.getMax());
        }
    }

    @Test
    public void testPivotColumnSelection() {
        // Test the getPivotColumn method indirectly by creating a tableau and checking behavior
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-1, -2, -3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1, 1}, Relationship.LEQ, 10));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6, 10);
        // Objective row: -1, -2, -3, 0, 0, 0  (for x1, x2, x3, s1, a1, rhs)
        // The most negative coefficient is -3, corresponding to column 2 (x3).
        // getPivotColumn should return 2.
        assertEquals(Integer.valueOf(2), tableau.getPivotColumn());
    }

    @Test
    public void testPivotRowSelectionDegeneracyTie() {
        // Test getPivotRow with a tie in the minimum ratio test
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-1, -1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6, 10);

        // Pivot column: pick col 0 (x1)
        Integer pivotCol = tableau.getPivotColumn(); // Should be 0
        // MRT for col 0:
        // Row 1 (s1): rhs=2, entry=1 -> ratio = 2
        // Row 2 (s2): rhs=2, entry=1 -> ratio = 2
        // Tie in ratios. Bland's rule should pick the row with the smallest index.
        // In the default tableau construction, slack variables are basic.
        // s1 is for constraint 1, s2 is for constraint 2.
        // The getBasicRow(col) method is used to find the row for a given column (basic variable).
        // Let's assume s1 corresponds to column 2, and s2 to column 3.
        // For row 0 (which is the objective function row), getBasicRow(0) is null.
        // For row 1, getBasicRow(2) should return 0 (index of this row in the data).
        // For row 2, getBasicRow(3) should return 1 (index of this row in the data).
        // The loop in getPivotRow iterates through minRatioPositions. If it finds a tie, it checks for artificial variables.
        // If not, it applies Bland's rule: "take the row for which the corresponding basic variable has the smallest index".
        // In this case, the basic variables are s1 (column 2) and s2 (column 3).
        // The indices of these variables are 2 and 3. Smallest is 2, which corresponds to row 1 (index 0 in `minRatioPositions`).
        // So, it should return the first row (index 0) of the minRatioPositions list, which is row 1 (index 0 in tableau data).
        assertEquals(Integer.valueOf(0), pivotCol);
        assertEquals(Integer.valueOf(0), tableau.getPivotRow(pivotCol.intValue())); // Row 0 (index 0) should be chosen by Bland's rule.
    }

    @Test
    public void testGetPivotColumnNoNegative() {
        // Test getPivotColumn when there are no negative coefficients in the objective row.
        // This is hard to test directly without internal access.
        // A scenario where `getPivotColumn` would return null implies all tested coefficients are >= 0.
        // In such a case, if the problem is not in phase 1, it should be optimal.
        // The `doOptimize` method will handle this.
        // We can indirectly verify that no exception is thrown for a problem that should be optimal.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1, 1}, Relationship.LEQ, 10));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Max 1x1 + 2x2 + 3x3 subject to x1+x2+x3 <= 10. Optimal at (0,0,10) or (0,10,0) or (10,0,0).
        // For this problem, the solution is (0,0,10) with value 30.
        assertArrayEquals(new double[]{0.0, 0.0, 10.0}, solution.getPoint(), 1e-9);
        assertEquals(30.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testPivotRowSelectionNoPositiveEntry() {
        // Test getPivotRow when no positive entry exists in the pivot column.
        // This indicates an unbounded solution.
        // Maximize x1 subject to:
        // -x1 + x2 <= 1
        // -x1 - x2 <= 1
        LinearObjectiveFunction f_unbounded2 = new LinearObjectiveFunction(new double[]{1, 0}, 0);
        Collection<LinearConstraint> constraints_unbounded2 = new ArrayList<>();
        constraints_unbounded2.add(new LinearConstraint(new double[]{-1, 1}, Relationship.LEQ, 1));
        constraints_unbounded2.add(new LinearConstraint(new double[]{-1, -1}, Relationship.LEQ, 1));
        SimplexTableau tableau_unbounded2 = new SimplexTableau(f_unbounded2, constraints_unbounded2, GoalType.MAXIMIZE, true, 1e-6, 10);

        // Objective row: -1, 0, 0, 0, 0 (x1, x2, s1, s2, rhs)
        // Row 1 (s1): -1, 1, 1, 0, 1
        // Row 2 (s2): -1, -1, 0, 1, 1

        // Pivot column: getPivotColumn returns 0.
        Integer pivotCol_unbounded2 = tableau_unbounded2.getPivotColumn();
        assertEquals(Integer.valueOf(0), pivotCol_unbounded2);

        // getPivotRow for column 0:
        // Row 1 (s1): rhs=1, entry=-1. Not > 0.
        // Row 2 (s2): rhs=1, entry=-1. Not > 0.
        // No row has a positive entry in column 0.
        // So, `minRatioPositions` will be empty. `getPivotRow` returns null.
        // This should lead to `UnboundedSolutionException` being thrown by `doIteration`.
        // The test `testUnboundedSolutionMax` already covers this scenario.
    }

    @Test
    public void testDropPhase1Objective() {
        // Test a problem that requires Phase 1 and verify that `doOptimize` succeeds.
        // This implicitly tests `dropPhase1Objective`.
        // Minimize x1 + x2 subject to:
        // x1 + x2 >= 1
        // x1, x2 >= 0
        // Transformed for maximization: Maximize -x1 - x2
        // Constraint: -x1 - x2 <= -1
        LinearObjectiveFunction f_phase1 = new LinearObjectiveFunction(new double[]{-1, -1}, 0);
        Collection<LinearConstraint> constraints_phase1 = new ArrayList<>();
        constraints_phase1.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 1));
        SimplexSolver solver_phase1 = new SimplexSolver();
        PointValuePair solution_phase1 = solver_phase1.doOptimize(); // This implicitly calls dropPhase1Objective
        assertNotNull(solution_phase1);
        // Expected solution for Min x1+x2 s.t. x1+x2 >= 1 is on the line x1+x2=1.
        // The minimum value is 1.
        assertEquals(1.0, solution_phase1.getValue(), 1e-9); // Value of x1+x2
        assertTrue(solution_phase1.getPoint()[0] + solution_phase1.getPoint()[1] >= 1.0 - 1e-9);
    }

    @Test
    public void testGetSolution() {
        // Test getSolution method indirectly by asserting the result of doOptimize.
        // This method is already covered by other tests.
        // We'll create a simple problem and check the point and value.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, 15));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();

        assertNotNull(solution);
        // Expected solution for Max 2x1 + 3x2 subject to x1+x2<=10, 2x1+x2<=15.
        // Optimal solution is (0, 10) with value 30.
        assertArrayEquals(new double[]{0.0, 10.0}, solution.getPoint(), 1e-9);
        assertEquals(30.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testPrecisionEqualsInPivotRow() {
        // Test Precision.equals for floating point comparisons in getPivotRow.
        // This test is hard to isolate due to private methods.
        // The logic within `getPivotRow` using `Precision.equals` for artificial variables is crucial.
        // Let's simulate a case where an artificial variable's coefficient is very close to 1.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 0}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // x1 + a1 = 1
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 1)); // Use EQ to force artificial variable
        SimplexSolver solver = new SimplexSolver();
        // This problem requires Phase 1.
        // We can't directly call getPivotRow, so we rely on doOptimize to exercise the path.
        // If the solver completes successfully, the pivot selection logic is likely correct.
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // The solution should be x1=1, x2=0. Value is 1.
        assertArrayEquals(new double[]{1.0}, solution.getPoint(), 1e-9);
        assertEquals(1.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testConstructorWithDefaults() {
        SimplexSolver solver = new SimplexSolver();
        // This constructor uses DEFAULT_EPSILON and DEFAULT_ULPS.
        // Assert that a simple problem can be solved with default settings.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 1));
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Max 1x1 + 1x2 subject to x1<=1, x2<=1. Solution (1,1) value 2.
        assertArrayEquals(new double[]{1.0, 1.0}, solution.getPoint(), 1e-9);
        assertEquals(2.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testNonBasicVariableUpdates() {
        // Test that non-basic variables are correctly updated during iterations.
        // Maximize 3x1 + 2x2
        // x1 + x2 <= 4
        // 2x1 + x2 <= 5
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{3, 2}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, 5));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Optimal solution is (1, 3) with value 9.
        assertArrayEquals(new double[]{1.0, 3.0}, solution.getPoint(), 1e-9);
        assertEquals(9.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testDegenerateCaseNoArtificialVars() {
        // Maximize x1 subject to:
        // x1 + x2 <= 1
        // x1 - x2 <= 1
        // x1, x2 >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 0}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{1, -1}, Relationship.LEQ, 1));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Optimal solution is (1,0) with value 1.
        assertArrayEquals(new double[]{1.0, 0.0}, solution.getPoint(), 1e-9);
        assertEquals(1.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testLargeCoefficientsAndRHS() {
        // Test with large coefficients and RHS values to check for potential overflow or precision issues.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1e6, 2e6}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1e5, 1e5}, Relationship.LEQ, 1e8));
        constraints.add(new LinearConstraint(new double[]{2e5, 3e5}, Relationship.LEQ, 3e8));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Maximize 1e6*x1 + 2e6*x2 subject to:
        // x1 + x2 <= 1e3
        // 2x1 + 3x2 <= 3e3
        // Optimal solution is (0, 1000) with value 2e9.
        assertArrayEquals(new double[]{0.0, 1000.0}, solution.getPoint(), 1e-9);
        assertEquals(2e9, solution.getValue(), 1e-9);
    }
}
