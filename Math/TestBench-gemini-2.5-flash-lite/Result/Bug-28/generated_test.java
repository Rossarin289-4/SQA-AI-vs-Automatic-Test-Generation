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
        // The optimal solution for Max 5x1 + 3x2 s.t. 2x1 + x2 <= 4 and x1 + 3x2 <= 5 is (1.4, 2.2).
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
        // The optimal solution for Min -5x1 - 3x2 s.t. 2x1 + x2 <= 4 and x1 + 3x2 <= 5 is (1.4, 2.2).
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
        // Expected solution for Max 2x1 + 3x2 + 4x3 subject to constraints.
        // The solution is (15.0, 15.0, 0.0) with value 105.0.
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
        // Expected solution for Min -2x1 - 3x2 - 4x3 subject to constraints.
        // The solution is (15.0, 15.0, 0.0) with value -105.0.
        assertArrayEquals(new double[]{15.0, 15.0, 0.0}, solution.getPoint(), 1e-9);
        assertEquals(-105.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testMaxProblemWithMultipleOptimalSolutions() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{2, 2}, Relationship.LEQ, 2)); // Redundant constraint
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Max 2x1 + x2 s.t. x1 + x2 <= 1. Optimal solutions lie on the edge between (1,0) and (0,1).
        // For example, (1,0) gives value 2, (0,1) gives value 1. (0.5, 0.5) gives value 1.5.
        // The solver should find one of the optimal points. The value should be 2.
        // The specific point can vary. We will assert the value.
        assertEquals(2.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testMinProblemWithMultipleOptimalSolutions() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-2, -1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 1));
        constraints.add(new LinearConstraint(new double[]{2, 2}, Relationship.LEQ, 2)); // Redundant constraint
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Min -2x1 - x2 s.t. x1 + x2 <= 1. Optimal solutions lie on the edge between (1,0) and (0,1).
        // For example, (1,0) gives value -2, (0,1) gives value -1. (0.5, 0.5) gives value -1.5.
        // The solver should find one of the optimal points. The value should be -2.
        // The specific point can vary. We will assert the value.
        assertEquals(-2.0, solution.getValue(), 1e-9);
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
        constraints.add(new LinearConstraint(new double[]{-1, -1}, Relationship.LEQ, -2)); // Infeasible: x1+x2 <= 1 and x1+x2 >= 2
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
        // Create a problem known to cycle or take many iterations
        constraints.add(new LinearConstraint(new double[]{100, 1}, Relationship.LEQ, 100));
        constraints.add(new LinearConstraint(new double[]{1, 100}, Relationship.LEQ, 100));
        // Set a low max iterations to trigger the exception
        SimplexSolver solver = new SimplexSolver(1e-6, 10);
        solver.setMaxIterations(3); // Small number of iterations to force exception

        try {
            solver.doOptimize();
            fail("Max iterations should have been exceeded.");
        } catch (MaxCountExceededException e) {
            // Expected exception
            assertEquals(3, e.getMax());
        }
    }


    @Test
    public void testGetPivotColumnNoNegative() {
        // Test getPivotColumn when there are no negative coefficients in the objective row.
        // This means the problem should be optimal immediately.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1, 1}, Relationship.LEQ, 10));
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Max 1x1 + 2x2 + 3x3 subject to x1+x2+x3 <= 10.
        // Since all objective coefficients are positive, the max is at the boundary with largest coefficient.
        // With positive coefficients, the solver should recognize optimality or move towards non-basic variables.
        // The most likely solution is (0, 0, 10) with value 30.
        assertArrayEquals(new double[]{0.0, 0.0, 10.0}, solution.getPoint(), 1e-9);
        assertEquals(30.0, solution.getValue(), 1e-9);
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
        constraints_phase1.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 1)); // x1 + x2 >= 1
        SimplexSolver solver_phase1 = new SimplexSolver();
        PointValuePair solution_phase1 = solver_phase1.doOptimize(); // This implicitly calls dropPhase1Objective
        assertNotNull(solution_phase1);
        // Expected solution for Min x1+x2 s.t. x1+x2 >= 1. The minimum value is 1, achieved anywhere on the line x1+x2=1.
        // For example, (1,0) or (0,1) or (0.5, 0.5).
        // The solver will find one of these. The value of the objective function is 1.
        assertEquals(1.0, solution_phase1.getValue(), 1e-9);
        // We can also check that the point satisfies the constraint.
        assertTrue(solution_phase1.getPoint()[0] + solution_phase1.getPoint()[1] >= 1.0 - 1e-9);
    }

    @Test
    public void testGetSolution() {
        // Test getSolution method indirectly by asserting the result of doOptimize.
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
        // Test scenarios where Precision.equals in getPivotRow might be relevant.
        // This test focuses on a scenario that could lead to ties in the Minimum Ratio Test (MRT),
        // and how the tie-breaking rules (including those involving artificial variables) are handled.
        // Maximize x1
        // Subject to:
        // x1 + 2x2 <= 2
        // x1 - x2 <= 1
        // 2x1 + x2 <= 2
        // x1, x2 >= 0

        // If we change constraint 3 to EQ, it may introduce artificial variables.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 0}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 2}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{1, -1}, Relationship.LEQ, 1));
        // Using EQ relationship requires an artificial variable if the RHS is non-zero.
        // This setup might lead to a tie in MRT.
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.EQ, 2));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // The optimal solution for Max x1 subject to the constraints.
        // The constraints are: x1+2x2<=2, x1-x2<=1, 2x1+x2=2.
        // From 2x1+x2=2, x2=2-2x1.
        // Substituting into x1+2x2<=2: x1+2(2-2x1)<=2 => x1+4-4x1<=2 => -3x1<=-2 => x1>=2/3.
        // Substituting into x1-x2<=1: x1-(2-2x1)<=1 => x1-2+2x1<=1 => 3x1<=3 => x1<=1.
        // So, 2/3 <= x1 <= 1. To maximize x1, we want x1=1.
        // If x1=1, then x2=2-2(1)=0.
        // Check constraints: 1+2(0)=1<=2 (ok), 1-0=1<=1 (ok), 2(1)+0=2 (ok).
        // Solution (1,0) with value 1.
        assertArrayEquals(new double[]{1.0, 0.0}, solution.getPoint(), 1e-9);
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
        // x1=1, x2=3.
        // x1+x2 = 1+3 = 4 <= 4
        // 2x1+x2 = 2(1)+3 = 5 <= 5
        // Objective: 3(1)+2(3) = 3+6 = 9.
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
        // Check constraints:
        // 1+0 = 1 <= 1 (ok)
        // 1-0 = 1 <= 1 (ok)
        // Objective: 1.
        assertArrayEquals(new double[]{1.0, 0.0}, solution.getPoint(), 1e-9);
        assertEquals(1.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testLargeCoefficientsAndRHS() {
        // Test with large coefficients and RHS values to check for potential overflow or precision issues.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1e6, 2e6}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1e5, 1e5}, Relationship.LEQ, 1e8)); // x1 + x2 <= 1000
        constraints.add(new LinearConstraint(new double[]{2e5, 3e5}, Relationship.LEQ, 3e8)); // 2x1 + 3x2 <= 3000
        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.doOptimize();
        assertNotNull(solution);
        // Maximize 1e6*x1 + 2e6*x2 subject to:
        // x1 + x2 <= 1000
        // 2x1 + 3x2 <= 3000
        // If x1=0, then x2<=1000 and 3x2<=3000 => x2<=1000. Max value 2e6 * 1000 = 2e9.
        // If x2=0, then x1<=1000 and 2x1<=3000 => x1<=1000. Max value 1e6 * 1000 = 1e9.
        // Intersection of x1+x2=1000 and 2x1+3x2=3000:
        // From first: x1 = 1000 - x2
        // Substitute into second: 2(1000 - x2) + 3x2 = 3000
        // 2000 - 2x2 + 3x2 = 3000
        // x2 = 1000
        // x1 = 1000 - 1000 = 0
        // The optimal solution is indeed (0, 1000) with value 2e9.
        assertArrayEquals(new double[]{0.0, 1000.0}, solution.getPoint(), 1e-9);
        assertEquals(2e9, solution.getValue(), 1e-9);
    }
}
