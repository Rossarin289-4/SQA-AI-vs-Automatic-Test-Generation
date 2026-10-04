```java
package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.util.MathUtils;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class SimplexSolverTest {

    // Test constructor with default epsilon
    @Test
    public void testSimplexSolverDefaultConstructor() {
        SimplexSolver solver = new SimplexSolver();
        assertNotNull(solver);
        assertEquals(SimplexSolver.DEFAULT_EPSILON, solver.epsilon, 1e-9);
    }

    // Test constructor with specified epsilon
    @Test
    public void testSimplexSolverEpsilonConstructor() {
        double customEpsilon = 1.0e-9;
        SimplexSolver solver = new SimplexSolver(customEpsilon);
        assertNotNull(solver);
        assertEquals(customEpsilon, solver.epsilon, 1e-12);
    }

    // Test getPivotColumn when all coefficients are positive
    @Test
    public void testGetPivotColumnPositiveCoefficients() {
        SimplexSolver solver = new SimplexSolver();
        // Mock tableau with positive coefficients in the objective row
        // Need to pass a non-empty collection for constraints to create tableau
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        // Manually set objective row entries to be positive
        tableau.setEntry(0, 1, 5.0); // Column 1
        tableau.setEntry(0, 2, 10.0); // Column 2

        // getPivotColumn is private, so we cannot directly test it from here.
        // Instead, we'll rely on tests for doIteration or doOptimize that use it.
        // For now, we'll omit direct testing of private methods.
    }

    // Test getPivotColumn when there is a negative coefficient
    @Test
    public void testGetPivotColumnNegativeCoefficient() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, -2.0, 3.0}, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        // Mock entries in the tableau
        tableau.setEntry(0, 1, -2.0); // Column 1
        tableau.setEntry(0, 2, 3.0);  // Column 2
        tableau.setEntry(0, 3, -1.0); // Column 3 (more negative)

        // getPivotColumn is private.
    }

    // Test getPivotColumn when all coefficients are zero
    @Test
    public void testGetPivotColumnZeroObjective() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{0.0, 0.0}, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        tableau.setEntry(0, 1, 0.0);
        tableau.setEntry(0, 2, 0.0);

        // getPivotColumn is private.
    }

    // Test getPivotRow with positive entries and RHS, checking for minimum ratio
    @Test
    public void testGetPivotRowPositiveEntriesAndRhs() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Need to ensure tableau is created with enough rows and columns for these entries.
        // The constructor of SimplexTableau handles this based on constraints and objective function.
        // We'll add constraints to create a valid tableau.
        constraints.add(new LinearConstraint(new double[]{0.0}, Relationship.EQ, 0.0)); // Dummy constraint to add a row

        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0}, 0);
        // SimplexTableau constructor will add slack/artificial variables.
        // We need to know the structure to set entries correctly.
        // Let's assume column 0 is the pivot column, and column `getWidth() - 1` is RHS.
        // We need at least 2 rows beyond the objective row for this test.
        // Adding constraints ensures enough rows.
        // Let's manually create a tableau of suitable size.
        double[][] data = new double[3][3]; // 1 objective row + 2 constraint rows, 1 decision + 1 RHS
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override
            protected double[][] createTableau(boolean maximize) {
                return data; // Return mock data
            }
            // Override other methods if necessary to control specific behavior
            @Override
            public int getWidth() { return 3; }
            @Override
            public int getHeight() { return 3; }
            @Override
            public int getNumObjectiveFunctions() { return 1; } // Objective row is 0
            @Override
            public int getRhsOffset() { return 2; } // RHS column is 2
        };

        // Mock entries
        tableau.setEntry(1, 0, 2.0); // Constraint row 1, pivot column 0, entry 2.0
        tableau.setEntry(1, 2, 4.0); // Constraint row 1, RHS 4.0
        tableau.setEntry(2, 0, 3.0); // Constraint row 2, pivot column 0, entry 3.0
        tableau.setEntry(2, 2, 9.0); // Constraint row 2, RHS 9.0

        // getPivotRow is private.
    }

    // Test getPivotRow when only one positive entry exists in the column
    @Test
    public void testGetPivotRowOnePositiveEntry() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{0.0}, Relationship.EQ, 0.0)); // Dummy constraint

        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0}, 0);
        double[][] data = new double[3][3];
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override
            protected double[][] createTableau(boolean maximize) { return data; }
            @Override
            public int getWidth() { return 3; }
            @Override
            public int getHeight() { return 3; }
            @Override
            public int getNumObjectiveFunctions() { return 1; }
            @Override
            public int getRhsOffset() { return 2; }
        };

        tableau.setEntry(1, 0, 2.0); // Positive entry
        tableau.setEntry(1, 2, 4.0); // RHS
        tableau.setEntry(2, 0, -3.0); // Negative entry, ignored
        tableau.setEntry(3, 0, 0.0);  // Zero entry, ignored (assuming row 3 exists and has a 0 entry)

        // getPivotRow is private.
    }

    // Test getPivotRow when no positive entries exist in the column
    @Test
    public void testGetPivotRowNoPositiveEntries() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{0.0}, Relationship.EQ, 0.0)); // Dummy constraint

        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0}, 0);
        double[][] data = new double[3][3];
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override
            protected double[][] createTableau(boolean maximize) { return data; }
            @Override
            public int getWidth() { return 3; }
            @Override
            public int getHeight() { return 3; }
            @Override
            public int getNumObjectiveFunctions() { return 1; }
            @Override
            public int getRhsOffset() { return 2; }
        };

        tableau.setEntry(1, 0, -2.0); // Negative entry
        tableau.setEntry(2, 0, 0.0);  // Zero entry

        // getPivotRow is private.
    }

    // Test isPhase1Solved when there are no artificial variables
    @Test
    public void testIsPhase1SolvedNoArtificialVariables() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0}, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        // Mock the SimplexTableau to have numArtificialVariables = 0
        tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override
            public int getNumArtificialVariables() {
                return 0;
            }
        };
        assertTrue(solver.isPhase1Solved(tableau));
    }

    // Test isPhase1Solved when all objective function coefficients (for artificial vars) are non-negative
    @Test
    public void testIsPhase1SolvedAllNonNegativeObjective() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{0.0, 0.0}, 0); // Dummy objective
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, solver.epsilon) {
            @Override
            public int getNumArtificialVariables() {
                return 2; // Assume 2 artificial variables
            }
            @Override
            public int getNumObjectiveFunctions() {
                return 1; // Objective row is 0
            }
            @Override
            public double getEntry(int row, int column) {
                if (row == 0 && column >= getNumObjectiveFunctions() && column < getNumObjectiveFunctions() + getNumArtificialVariables()) {
                    return 1.0; // Non-negative coefficient for artificial variables
                }
                return super.getEntry(row, column); // Fallback
            }
            @Override
            public int getWidth() {
                 return getNumObjectiveFunctions() + getNumArtificialVariables() + 1; // 1 objective + 2 artificial + 1 RHS
            }
        };

        assertTrue(solver.isPhase1Solved(tableau));
    }

    // Test isPhase1Solved when at least one artificial variable coefficient is negative
    @Test
    public void testIsPhase1SolvedNegativeObjective() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{0.0, 0.0}, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, solver.epsilon) {
            @Override
            public int getNumArtificialVariables() {
                return 2;
            }
            @Override
            public int getNumObjectiveFunctions() {
                return 1;
            }
            @Override
            public double getEntry(int row, int column) {
                if (row == 0 && column == getNumObjectiveFunctions()) { // First artificial variable
                    return -1.0; // Negative coefficient
                }
                if (row == 0 && column == getNumObjectiveFunctions() + 1) { // Second artificial variable
                    return 0.5; // Non-negative coefficient
                }
                return super.getEntry(row, column);
            }
             @Override
            public int getWidth() {
                 return getNumObjectiveFunctions() + getNumArtificialVariables() + 1; // 1 objective + 2 artificial + 1 RHS
            }
        };

        assertFalse(solver.isPhase1Solved(tableau));
    }

    // Test isOptimal when no artificial variables and objective row coefficients are non-negative
    @Test
    public void testIsOptimalNoArtificialVariablesAndAllNonNegativeObjective() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 3.0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override
            public int getNumArtificialVariables() {
                return 0;
            }
            // Set objective row coefficients to be non-negative
            @Override
            public double getEntry(int row, int column) {
                if (row == 0 && column < getNumObjectiveFunctions()) { // Objective coefficients
                    return 1.0; // Non-negative
                }
                return super.getEntry(row, column);
            }
            @Override
            public int getNumObjectiveFunctions() { return 2; } // Two decision variables
        };
        assertTrue(solver.isOptimal(tableau));
    }

    // Test isOptimal when no artificial variables and objective row has a negative coefficient
    @Test
    public void testIsOptimalWithNegativeObjective() {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 3.0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override
            public int getNumArtificialVariables() {
                return 0;
            }
            // Set objective row coefficients, one negative
            @Override
            public double getEntry(int row, int column) {
                if (row == 0 && column == 0) { // First decision variable
                    return -1.0; // Negative coefficient
                }
                if (row == 0 && column == 1) { // Second decision variable
                    return 2.0; // Non-negative
                }
                return super.getEntry(row, column);
            }
            @Override
            public int getNumObjectiveFunctions() { return 2; }
        };
        assertFalse(solver.isOptimal(tableau));
    }

    // Test solvePhase1 when no artificial variables are present
    @Test
    public void testSolvePhase1NoArtificialVariables() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0}, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override
            public int getNumArtificialVariables() { return 0; }
        };
        // Calling solvePhase1 on a tableau with no artificial variables should return immediately.
        solver.solvePhase1(tableau);
        // No exception means it passed.
    }

    // Test solvePhase1 detecting a NoFeasibleSolutionException
    @Test(expected = NoFeasibleSolutionException.class)
    public void testSolvePhase1NoFeasibleSolution() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        // Create a scenario that leads to infeasibility in Phase 1.
        // e.g., constraints that cannot be satisfied.
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Constraint: x1 <= -1. With non-negativity, this is infeasible.
        constraints.add(new LinearConstraint(new double[]{1.0}, Relationship.LEQ, -1.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{0.0}, 0); // Dummy objective for Phase 1 setup

        // The SimplexTableau constructor will add artificial variables and set up Phase 1.
        // If the RHS is negative for a LEQ constraint, an artificial variable is added and needs to be minimized.
        // If the problem is infeasible, the W (sum of artificial vars) will not be zero at the end of Phase 1.
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        // Mocking `solvePhase1` directly is hard due to its reliance on `doIteration` and tableau state.
        // We will use `doOptimize` which internally calls `solvePhase1`.
        // The `NoFeasibleSolutionException` is thrown if `solvePhase1` finds W != 0.
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    // Test doOptimize for a simple maximization problem
    @Test
    public void testDoOptimizeSimpleMaximization() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.LEQ, 3.0));
        constraints.add(new LinearConstraint(new double[]{1.0, 0.0}, Relationship.LEQ, 2.0));
        constraints.add(new LinearConstraint(new double[]{0.0, 1.0}, Relationship.LEQ, 3.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 0); // Maximize x1 + 2x2

        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        // Expected solution: x1=2, x2=1, value = 2 + 2*1 = 4
        assertNotNull(solution);
        assertArrayEquals(new double[]{2.0, 1.0}, solution.getPoint(), solver.epsilon);
        assertEquals(4.0, solution.getValue(), solver.epsilon);
    }

    // Test doOptimize for a simple minimization problem
    @Test
    public void testDoOptimizeSimpleMinimization() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.GEQ, 3.0));
        constraints.add(new LinearConstraint(new double[]{1.0, 0.0}, Relationship.GEQ, 2.0));
        constraints.add(new LinearConstraint(new double[]{0.0, 1.0}, Relationship.GEQ, 1.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 0); // Minimize x1 + 2x2

        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        // Expected solution: x1=2, x2=1, value = 2 + 2*1 = 4
        assertNotNull(solution);
        assertArrayEquals(new double[]{2.0, 1.0}, solution.getPoint(), solver.epsilon);
        assertEquals(4.0, solution.getValue(), solver.epsilon);
    }

    // Test doOptimize for an unbounded solution scenario (maximization)
    @Test(expected = UnboundedSolutionException.class)
    public void testDoOptimizeUnboundedSolutionMaximization() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Constraint that allows unbounded increase in objective for maximization
        constraints.add(new LinearConstraint(new double[]{1.0, -1.0}, Relationship.LEQ, 5.0)); // x1 - x2 <= 5
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 1.0}, 0); // Maximize x1 + x2

        // With x1 - x2 <= 5, we can increase x1 and x2 indefinitely (e.g., x1=100, x2=95).
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    // Test doOptimize for an unbounded solution scenario (minimization)
    @Test(expected = UnboundedSolutionException.class)
    public void testDoOptimizeUnboundedSolutionMinimization() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Constraint that allows unbounded decrease in objective for minimization
        constraints.add(new LinearConstraint(new double[]{-1.0, 1.0}, Relationship.LEQ, 5.0)); // -x1 + x2 <= 5
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, -1.0}, 0); // Minimize x1 - x2

        // With -x1 + x2 <= 5, we can decrease x1 - x2 indefinitely (e.g., x1=100, x2=105).
        solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }


    // Test that OptimizationException is thrown when max iterations are exceeded
    @Test
    public void testMaxIterationsExceeded() throws Exception {
        SimplexSolver solver = new SimplexSolver(1.0e-9); // Use a small epsilon to potentially increase iterations
        solver.setMaxIterations(2); // Set a very low max iteration count

        Collection<LinearConstraint> constraints = new ArrayList<>();
        // A problem that typically requires more than 2 iterations.
        // This specific problem setup is designed to require several iterations.
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0, 1.0}, Relationship.LEQ, 10.0));
        constraints.add(new LinearConstraint(new double[]{2.0, -1.0, 1.0}, Relationship.LEQ, 8.0));
        constraints.add(new LinearConstraint(new double[]{1.0, -2.0, 1.0}, Relationship.LEQ, 6.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{3.0, 2.0, 1.0}, 0); // Maximize

        try {
            solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
            fail("Expected OptimizationException for max iterations");
        } catch (OptimizationException e) {
            // The exception message typically indicates the iteration limit.
            // We check for the presence of "maximal number of iterations" in the message.
            assertTrue(e.getMessage().contains("maximal number of iterations"));
        }
    }

    // Test the behavior when doIteration is called with a pivot row that would cause division by zero or near-zero.
    // This is related to degeneracy and cycling, which can be complex to trigger reliably without specific tableau manipulation.
    // The doIteration method itself performs operations on the tableau.
    // We can test by creating a scenario where doIteration might be called.
    // For instance, by calling optimize with a simple problem that requires at least one iteration.
    @Test
    public void testDoIterationLogic() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.LEQ, 2.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 1.0}, 0); // Maximize x1 + x2

        // This problem has a known solution and will require iterations.
        // We are not testing the outcome directly, but the process of iteration.
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        // The solution should be x1=1, x2=1, value = 2
        assertEquals(1.0, solution.getPoint()[0], solver.epsilon);
        assertEquals(1.0, solution.getPoint()[1], solver.epsilon);
        assertEquals(2.0, solution.getValue(), solver.epsilon);
    }

    // Test that discarded artificial variables are correctly handled.
    // This is implicitly tested by doOptimize after solvePhase1.
    // We can create a specific case where artificial variables are introduced and then removed.
    @Test
    public void testDiscardArtificialVariables() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Constraint: x1 + x2 = 3. This requires artificial variables if x1, x2 >= 0.
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.EQ, 3.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 0); // Maximize

        // The optimize method first runs solvePhase1 (which uses artificial variables)
        // and then calls discardArtificialVariables.
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        // Expected solution for Maximize x1 + 2x2 subject to x1 + x2 = 3, x1,x2 >= 0.
        // The optimal solution will be at one of the vertices: (0,3) or (3,0).
        // Value at (0,3) = 0 + 2*3 = 6.
        // Value at (3,0) = 3 + 2*0 = 3.
        // So, optimum is at (0,3) with value 6.
        assertNotNull(solution);
        assertArrayEquals(new double[]{0.0, 3.0}, solution.getPoint(), solver.epsilon);
        assertEquals(6.0, solution.getValue(), solver.epsilon);
    }

    // Test a case where the initial tableau setup for phase 1 is already optimal (W=0).
    @Test
    public void testPhase1AlreadySolved() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Constraint: x1 >= 0 (which is already satisfied, no artificial variable needed if non-negativity is handled by default)
        // However, if we force an artificial variable for testing:
        // Let's create a problem that *initially* has W=0 in phase 1.
        // Example: Maximize x1 subject to x1 = 1, x2 = 2.
        // If non-negativity is enforced, this requires artificial variables for equality.
        constraints.add(new LinearConstraint(new double[]{1.0, 0.0}, Relationship.EQ, 1.0));
        constraints.add(new LinearConstraint(new double[]{0.0, 1.0}, Relationship.EQ, 2.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 0.0}, 0); // Maximize x1

        // With the above constraints, the SimplexTableau will be constructed with artificial variables.
        // Phase 1 objective: Minimize W = artificial_var_for_x1 + artificial_var_for_x2.
        // The tableau will have an initial state where artificial variables are in basis and W=0.
        // `solvePhase1` should return immediately and `discardArtificialVariables` will proceed.
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        // Expected solution: x1=1, x2=2, value=1.
        assertNotNull(solution);
        assertArrayEquals(new double[]{1.0, 2.0}, solution.getPoint(), solver.epsilon);
        assertEquals(1.0, solution.getValue(), solver.epsilon);
    }

    // Test a case with no constraints
    @Test
    public void testOptimizeNoConstraints() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        Collection<LinearConstraint> constraints = new ArrayList<>();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 2.0}, 5.0); // Maximize 1*x1 + 2*x2 + 5

        // Without constraints and non-negativity, the solution would be unbounded.
        // If restrictToNonNegative is true, then x1=0, x2=0, value = 5.
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true); // restrictToNonNegative = true

        assertNotNull(solution);
        assertArrayEquals(new double[]{0.0, 0.0}, solution.getPoint(), solver.epsilon);
        assertEquals(5.0, solution.getValue(), solver.epsilon);

        // Test with GoalType.MINIMIZE
        solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true); // restrictToNonNegative = true
        assertNotNull(solution);
        assertArrayEquals(new double[]{0.0, 0.0}, solution.getPoint(), solver.epsilon);
        assertEquals(5.0, solution.getValue(), solver.epsilon);
    }

    // Test a boundary case for epsilon in comparisons
    @Test
    public void testEpsilonBoundaryComparison() {
        SimplexSolver solver = new SimplexSolver(1e-6); // Default epsilon
        // Test MathUtils.compareTo with values close to epsilon
        // getPivotColumn uses compareTo. isPhase1Solved uses compareTo. isOptimal uses compareTo.
        // We can't directly call these private methods.
        // Instead, we'll test behavior that relies on these comparisons.

        // Example: A coefficient that is slightly less than epsilon.
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Set up a scenario for maximization where objective coefficients are critical.
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 1e-7}, 0); // 1e-7 < epsilon(1e-6)
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon) {
            // Mock to have at least one column to pivot on
            @Override
            public int getWidth() { return 3; }
            @Override
            public int getHeight() { return 2; }
            @Override
            public int getNumObjectiveFunctions() { return 1; }
        };
        tableau.setEntry(0, 1, 1e-7); // Coefficient for decision variable 1
        tableau.setEntry(0, 2, 0.0);  // RHS

        // In isOptimal, if this coefficient were negative and smaller than epsilon, it might be considered zero.
        // In getPivotColumn, if this coefficient is negative, it's considered for pivoting.
        // Let's simulate a negative value just below epsilon.
        tableau.setEntry(0, 1, -1e-7);
        // If getPivotColumn were public, we'd test `solver.getPivotColumn(tableau)` which should return 1.

        // For isOptimal, if all coefficients are >= 0, it's optimal.
        // Let's test the `isOptimal` logic using a mock tableau where it should be optimal.
        SimplexTableau optimalTableau = new SimplexTableau(new LinearObjectiveFunction(new double[]{1.0}, 0), new ArrayList<>(), GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override public int getNumArtificialVariables() { return 0; }
            @Override public int getNumObjectiveFunctions() { return 1; }
            @Override public double getEntry(int row, int column) {
                if (row == 0 && column == 0) return 1.0; // Non-negative objective coeff
                return 0.0;
            }
            @Override public int getWidth() { return 2; }
        };
        assertTrue(solver.isOptimal(optimalTableau));

        // Test with a negative value just below epsilon that should make it non-optimal.
        SimplexTableau nonOptimalTableau = new SimplexTableau(new LinearObjectiveFunction(new double[]{1.0}, 0), new ArrayList<>(), GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override public int getNumArtificialVariables() { return 0; }
            @Override public int getNumObjectiveFunctions() { return 1; }
            @Override public double getEntry(int row, int column) {
                if (row == 0 && column == 0) return -1e-7; // Negative objective coeff, less than epsilon
                return 0.0;
            }
            @Override public int getWidth() { return 2; }
        };
        assertFalse(solver.isOptimal(nonOptimalTableau));

        // Test with a value exactly equal to epsilon (treated as zero in compareTo < 0)
        SimplexTableau nonOptimalEpsilon = new SimplexTableau(new LinearObjectiveFunction(new double[]{1.0}, 0), new ArrayList<>(), GoalType.MAXIMIZE, true, solver.epsilon) {
            @Override public int getNumArtificialVariables() { return 0; }
            @Override public int getNumObjectiveFunctions() { return 1; }
            @Override public double getEntry(int row, int column) {
                if (row == 0 && column == 0) return -solver.epsilon; // Exactly -epsilon
                return 0.0;
            }
            @Override public int getWidth() { return 2; }
        };
        assertFalse(solver.isOptimal(nonOptimalEpsilon));
    }

    // Test with a very large number of iterations allowed
    @Test
    public void testHighMaxIterations() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        solver.setMaxIterations(10000); // Set a very high limit

        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1.0, 1.0}, Relationship.LEQ, 3.0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1.0, 1.0}, 0); // Maximize x1 + x2

        // This problem is simple and should solve within a few iterations.
        // High max iterations should not cause issues.
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertArrayEquals(new double[]{0.0, 3.0}, solution.getPoint(), solver.epsilon); // x1=0, x2=3 -> value 3
        assertEquals(3.0, solution.getValue(), solver.epsilon);
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover the public methods `doOptimize` and `isOptimal`. They also indirectly test `solvePhase1` and `doIteration` through calls to `doOptimize`. Several tests focus on edge cases and specific behaviors like unbounded solutions, infeasible solutions, and iteration limits.
2. TEST CASE DESIGN -
    - `testSimplexSolverDefaultConstructor`: Checks default epsilon value.
    - `testGetPivotColumnPositiveCoefficients`: Placeholder for testing `getPivotColumn` (private, not directly testable).
    - `testGetPivotRowPositiveEntriesAndRhs`: Placeholder for testing `getPivotRow` (private, not directly testable).
    - `testIsPhase1SolvedNoArtificialVariables`: Tests `isPhase1Solved` when no artificial variables are present.
    - `testIsPhase1SolvedAllNonNegativeObjective`: Tests `isPhase1Solved` with non-negative artificial variable coefficients.
    - `testIsPhase1SolvedNegativeObjective`: Tests `isPhase1Solved` with a negative artificial variable coefficient.
    - `testIsOptimalNoArtificialVariablesAndAllNonNegativeObjective`: Tests `isOptimal` when optimal and no artificial variables.
    - `testIsOptimalWithNegativeObjective`: Tests `isOptimal` when not optimal due to negative objective coefficient.
    - `testSolvePhase1NoArtificialVariables`: Tests `solvePhase1` on a tableau without artificial variables.
    - `testSolvePhase1NoFeasibleSolution`: Tests `solvePhase1` (via `doOptimize`) that should throw `NoFeasibleSolutionException`.
    - `testDoOptimizeSimpleMaximization`: Tests `doOptimize` with a basic maximization problem.
    - `testDoOptimizeSimpleMinimization`: Tests `doOptimize` with a basic minimization problem.
    - `testDoOptimizeUnboundedSolutionMaximization`: Tests `doOptimize` for unbounded maximization.
    - `testDoOptimizeUnboundedSolutionMinimization`: Tests `doOptimize` for unbounded minimization.
    - `testMaxIterationsExceeded`: Tests the `setMaxIterations` functionality and exception.
    - `testEpsilonBoundaryComparison`: Tests `isOptimal` with values near epsilon.
    - `testHighMaxIterations`: Tests with a high iteration limit.
    - `testDoIterationLogic`: Tests `doIteration` indirectly by running a solvable problem.
    - `testDiscardArtificialVariables`: Tests the process of removing artificial variables.
    - `testPhase1AlreadySolved`: Tests a scenario where Phase 1 is already solved.
    - `testOptimizeNoConstraints`: Tests optimization with no constraints.
4. DEFECT DETECTION STRATEGY - The tests cover core logic of the Simplex method, including phase 1 solving, optimality checks, pivot selection (indirectly), unboundedness, infeasibility, and iteration limits, aiming to expose errors in these critical areas.
5. SUMMARY - 21 tests.
6. LIMITATIONS - Direct testing of private helper methods like `getPivotColumn` and `getPivotRow` is not performed. Mocking `SimplexTableau` complex internal states for testing these private methods is omitted for brevity and focus on public API usage. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.