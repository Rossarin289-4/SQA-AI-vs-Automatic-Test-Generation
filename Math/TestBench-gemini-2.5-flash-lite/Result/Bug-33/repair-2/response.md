```java
package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.util.Precision;

public class SimplexTableauTest {

    // Mock SimplexTableau for accessing private/protected members for testing purposes.
    // This is a common practice when testing classes that have complex internal state
    // and direct access is needed for setting up specific test scenarios.
    private static class MockSimplexTableau extends SimplexTableau {
        public MockSimplexTableau(LinearObjectiveFunction f, Collection<LinearConstraint> constraints, GoalType goalType, boolean restrictToNonNegative, double epsilon, int maxUlps) {
            super(f, constraints, goalType, restrictToNonNegative, epsilon, maxUlps);
        }

        public List<String> getColumnLabels() {
            return this.columnLabels;
        }

        public void setTableau(RealMatrix tableau) {
            this.tableau = tableau;
        }

        public void setColumnLabels(List<String> columnLabels) {
            this.columnLabels = columnLabels;
        }

        public void setNumDecisionVariables(int numDecisionVariables) {
            this.numDecisionVariables = numDecisionVariables;
        }

        public void setNumSlackVariables(int numSlackVariables) {
            this.numSlackVariables = numSlackVariables;
        }

        public void setRestrictToNonNegative(boolean restrictToNonNegative) {
            this.restrictToNonNegative = restrictToNonNegative;
        }

        public LinearObjectiveFunction getObjectiveFunction() {
            return this.f;
        }

        public Collection<LinearConstraint> getConstraints() {
            return this.constraints;
        }

        public boolean isRestrictedToNonNegative() {
            return this.restrictToNonNegative;
        }

        public double getEpsilon() {
            return this.epsilon;
        }

        public int getMaxUlps() {
            return this.maxUlps;
        }

        public int getOriginalNumDecisionVariables() {
            return super.getOriginalNumDecisionVariables();
        }

        public int getNumSlackVariables() {
            return super.getNumSlackVariables();
        }

        public int getNumArtificialVariables() {
            return super.getNumArtificialVariables();
        }

        public int getNumObjectiveFunctions() {
            return super.getNumObjectiveFunctions();
        }

        public int getWidth() {
            return super.getWidth();
        }

        public int getHeight() {
            return super.getHeight();
        }

        public double getEntry(int row, int column) {
            return super.getEntry(row, column);
        }

        public void setEntry(int row, int column, double value) {
            super.setEntry(row, column, value);
        }

        public void addToEntry(int row, int column, double increment) {
            super.addToEntry(row, column, increment);
        }

        public void multiplyEntry(int row, int column, double factor) {
            super.multiplyEntry(row, column, factor);
        }

        public double[] getData() {
            return super.getData()[0]; // Simplified for basic data access
        }
        
        // Override to use the internal tableau directly for easier modification in tests
        @Override
        protected RealMatrix createTableau(boolean maximize) {
            // This is a placeholder, actual tableau creation is done in the constructor.
            // Tests that need to manipulate tableau data will use setTableau.
            return new Array2DRowRealMatrix(super.getHeight(), super.getWidth());
        }
    }

    @Test
    public void testConstructorBasic() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);

        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // Original num decision variables
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(5, tableau.getWidth()); // 2 decision + 0 slack + 0 artificial + 1 objective + 1 RHS
        assertEquals(1, tableau.getHeight()); // 1 objective
    }

    @Test
    public void testConstructorWithSlack() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);

        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // Original num decision variables
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(6, tableau.getWidth()); // 2 decision + 1 slack + 0 artificial + 1 objective + 1 RHS
        assertEquals(2, tableau.getHeight()); // 1 objective + 1 constraint
    }

    @Test
    public void testConstructorWithArtificial() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.EQ, 5));
        MockSimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0); // Use actual class here as no internal access needed

        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // Original num decision variables
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions()); // Phase 1 and Phase 2
        assertEquals(7, tableau.getWidth()); // 2 decision + 0 slack + 1 artificial + 2 objectives + 1 RHS
        assertEquals(3, tableau.getHeight()); // 2 objective + 1 constraint
    }

    @Test
    public void testConstructorWithNegativeVar() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0, 10);

        assertEquals(3, tableau.getNumDecisionVariables()); // 2 original + 1 for negative
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(6, tableau.getWidth()); // 3 decision + 0 slack + 0 artificial + 1 objective + 1 RHS
        assertEquals(1, tableau.getHeight()); // 1 objective
    }

    @Test
    public void testInitializeColumnLabelsBasic() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        List<String> labels = new ArrayList<>();
        labels.add("Z");
        labels.add("x0");
        labels.add("x1");
        labels.add("RHS");
        assertEquals(labels, tableau.getColumnLabels());
    }

    @Test
    public void testInitializeColumnLabelsWithSlack() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        List<String> labels = new ArrayList<>();
        labels.add("Z");
        labels.add("x0");
        labels.add("x1");
        labels.add("s0");
        labels.add("RHS");
        assertEquals(labels, tableau.getColumnLabels());
    }

    @Test
    public void testInitializeColumnLabelsWithArtificial() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.EQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        List<String> labels = new ArrayList<>();
        labels.add("W");
        labels.add("Z");
        labels.add("x0");
        labels.add("x1");
        labels.add("a0");
        labels.add("RHS");
        assertEquals(labels, tableau.getColumnLabels());
    }

    @Test
    public void testInitializeColumnLabelsWithNegativeVar() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0, 10);
        List<String> labels = new ArrayList<>();
        labels.add("Z");
        labels.add("x0");
        labels.add("x1");
        labels.add("x-");
        labels.add("RHS");
        assertEquals(labels, tableau.getColumnLabels());
    }

    @Test
    public void testCreateObjectiveRowMaximize() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        // Z row: -c, coeffs, RHS
        // For maximize: Z row is at index 0. Width is 5 (Z, x0, x1, RHS)
        // Objective coefficients are copied starting from numObjectiveFunctions column (0 for max).
        // -c is copied to matrix.getDataRef()[zIndex]
        // f.getConstantTerm() is copied to width-1
        double[][] expectedData = {
            {-1.0, -1.0, -2.0, 3.0},
        };
        RealMatrix expectedMatrix = new Array2DRowRealMatrix(expectedData);
        // Compare row by row, considering the objective row's position
        for (int j = 0; j < expectedMatrix.getColumnDimension(); ++j) {
            assertEquals(expectedMatrix.getEntry(0, j), tableau.getEntry(0, j), Precision.EPSILON);
        }
    }

    @Test
    public void testCreateObjectiveRowMinimize() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1.0, 10);
        // Z row: c, coeffs, RHS
        // 1.0 for obj coeff, -1.0, -2.0 for x0, x1, -3.0 for constant term
        double[][] expectedData = {
            {1.0, 1.0, -2.0, -3.0},
        };
        RealMatrix expectedMatrix = new Array2DRowRealMatrix(expectedData);
        for (int j = 0; j < expectedMatrix.getColumnDimension(); ++j) {
            assertEquals(expectedMatrix.getEntry(0, j), tableau.getEntry(0, j), Precision.EPSILON);
        }
    }

    @Test
    public void testCreateConstraintRowLEQ() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        // Z row is at index 0. Constraint row is at index 1.
        // Constraint row: coeffs, slack, RHS
        // Decision vars: x0, x1. Slack var: s0. RHS.
        // Width: 6 (Z, x0, x1, s0, RHS)
        double[][] expectedData = {
            {-1.0, -1.0, -2.0, 0.0, 3.0}, // Z row
            { 0.0,  3.0,  4.0, 1.0, 5.0}  // constraint row
        };
        RealMatrix expectedMatrix = new Array2DRowRealMatrix(expectedData);
        for (int j = 0; j < expectedMatrix.getColumnDimension(); ++j) {
            assertEquals(expectedMatrix.getEntry(1, j), tableau.getEntry(1, j), Precision.EPSILON);
        }
    }

    @Test
    public void testCreateConstraintRowGEQ() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.GEQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        // Constraint row: coeffs, surplus, RHS. Surplus is -1.
        double[][] expectedData = {
            {-1.0, -1.0, -2.0, 0.0, 3.0}, // Z row
            { 0.0,  3.0,  4.0, -1.0, 5.0}  // constraint row
        };
        RealMatrix expectedMatrix = new Array2DRowRealMatrix(expectedData);
        for (int j = 0; j < expectedMatrix.getColumnDimension(); ++j) {
            assertEquals(expectedMatrix.getEntry(1, j), tableau.getEntry(1, j), Precision.EPSILON);
        }
    }

    @Test
    public void testCreateConstraintRowEQ() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.EQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        // Constraint row: coeffs, RHS. No slack/surplus/artificial added by default for EQ.
        double[][] expectedData = {
            {-1.0, -1.0, -2.0, 3.0}, // Z row
            { 0.0,  3.0,  4.0, 5.0}  // constraint row
        };
        RealMatrix expectedMatrix = new Array2DRowRealMatrix(expectedData);
        for (int j = 0; j < expectedMatrix.getColumnDimension(); ++j) {
            assertEquals(expectedMatrix.getEntry(1, j), tableau.getEntry(1, j), Precision.EPSILON);
        }
    }

    @Test
    public void testCreateConstraintRowWithArtificial() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.EQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        // numArtificialVariables = 1, so getNumObjectiveFunctions() = 2 (W, Z).
        // Tableau height = 3 (W, Z, constraint). Width = 7 (W, Z, x0, x1, a0, RHS).
        // W row initialization: matrix.setEntry(0, 0, -1);
        // Objective coeffs: matrix.setEntry(0, getArtificialVariableOffset() + artificialVar, 1);
        // matrix.setRowVector(0, matrix.getRowVector(0).subtract(matrix.getRowVector(row)));
        // With EQ, W row is set to -1 at W column, then subtracts constraint row.
        // Constraint row: [0, 0, 3, 4, 1, 5] (W, Z, x0, x1, a0, RHS)
        // W row: [-1, 0, 0, 0, 0, 0] initially.
        // Subtracting constraint row: [-1, 0, -3, -4, -1, -5]
        double[][] expectedData = {
            {-1.0, 0.0, -3.0, -4.0, -1.0, -5.0}, // W row
            { 0.0, 1.0, -1.0, -2.0, 0.0,  3.0}, // Z row
            { 0.0, 0.0,  3.0,  4.0, 1.0,  5.0}  // constraint row
        };
        RealMatrix expectedMatrix = new Array2DRowRealMatrix(expectedData);
        for (int i = 0; i < expectedMatrix.getRowDimension(); ++i) {
            for (int j = 0; j < expectedMatrix.getColumnDimension(); ++j) {
                assertEquals(expectedMatrix.getEntry(i, j), tableau.getEntry(i, j), Precision.EPSILON);
            }
        }
    }

    @Test
    public void testNormalizeConstraintsPositiveRHS() {
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(new LinearObjectiveFunction(new double[]{1}, 0), constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        List<LinearConstraint> normalized = tableau.normalizeConstraints(constraints);
        assertEquals(1, normalized.size());
        assertEquals(5, normalized.get(0).getValue(), Precision.EPSILON);
        assertEquals(Relationship.LEQ, normalized.get(0).getRelationship());
    }

    @Test
    public void testNormalizeConstraintsNegativeRHS() {
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, -5));
        MockSimplexTableau tableau = new MockSimplexTableau(new LinearObjectiveFunction(new double[]{1}, 0), constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        List<LinearConstraint> normalized = tableau.normalizeConstraints(constraints);
        assertEquals(1, normalized.size());
        assertEquals(5.0, normalized.get(0).getValue(), Precision.EPSILON); // -1 * -5 = 5
        assertEquals(Relationship.GEQ, normalized.get(0).getRelationship()); // LEQ becomes GEQ
    }

    @Test
    public void testNormalizeConstraintsNegativeRHS_OppositeRelationship() {
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, -5));
        MockSimplexTableau tableau = new MockSimplexTableau(new LinearObjectiveFunction(new double[]{1}, 0), constraints, GoalType.MAXIMIZE, true, 1.0, 10);
        List<LinearConstraint> normalized = tableau.normalizeConstraints(constraints);
        assertEquals(1, normalized.size());
        assertEquals(5.0, normalized.get(0).getValue(), Precision.EPSILON); // -1 * -5 = 5
        assertEquals(Relationship.LEQ, normalized.get(0).getRelationship()); // GEQ becomes LEQ
    }

    @Test
    public void testGetBasicRowSimple() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.EQ, 5)); // This will introduce an artificial variable 'a0'
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);

        // After constructor: W row, Z row, constraint row. 'a0' is in col 4.
        // Constraint row is row 2.
        // getBasicRow(col) checks for a single 1 and the rest 0s.
        // Column 'a0' is at index 4.
        // After `createTableau`, 'a0' is basic in row 2 (constraint row).
        assertEquals(2, tableau.getBasicRow(4).intValue()); // 'a0' column index is 4
    }

    @Test
    public void testGetBasicRowNotBasic() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 5)); // s0 is basic in row 1
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 10)); // s1 is basic in row 2
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // x0 column (index 1) is not basic.
        assertNull(tableau.getBasicRow(1));
    }

    @Test
    public void testGetBasicRowMultipleNonZero() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        // Create a tableau where a column is not basic due to multiple non-zero entries.
        double[][] data = {
                {-1.0, -1.0, 1.0, 1.0, 5.0}, // Z row
                { 0.0,  1.0, 1.0, 0.0, 5.0}, // Constraint row 1, x0 has 1, s0 has 1
                { 0.0,  0.0, 1.0, 1.0, 10.0} // Constraint row 2, s0 has 1, s1 has 1
        };
        MockSimplexTableau testTableau = new MockSimplexTableau(
                new LinearObjectiveFunction(new double[]{1}, 0),
                new ArrayList<>(),
                GoalType.MAXIMIZE, true, 1.0, 10);
        testTableau.setTableau(new Array2DRowRealMatrix(data));
        testTableau.setColumnLabels(new ArrayList<>(List.of("Z", "x0", "s0", "s1", "RHS")));
        testTableau.setNumDecisionVariables(1); // x0
        testTableau.numSlackVariables = 2; // s0, s1

        // Column x0 (index 1) is not basic as its entry in Z row is -1, not 0.
        assertNull(testTableau.getBasicRow(1));
        // Column s0 (index 2) is not basic as it has 1 in row 1 and 1 in row 2.
        assertNull(testTableau.getBasicRow(2));
        // Column s1 (index 3) is basic in row 2.
        assertEquals(2, testTableau.getBasicRow(3).intValue());
    }

    @Test
    public void testDropPhase1ObjectiveSimple() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.EQ, 5)); // Introduces artificial variable
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // Before drop: 2 objective functions (W, Z), 3 rows (W, Z, constraint), 7 columns (W, Z, x0, a0, RHS)
        assertEquals(2, tableau.getNumObjectiveFunctions());
        assertEquals(3, tableau.getHeight());
        assertEquals(7, tableau.getWidth());

        tableau.dropPhase1Objective();

        // After drop: 1 objective function (Z), 2 rows (Z, constraint), 5 columns (Z, x0, RHS)
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(2, tableau.getHeight());
        assertEquals(5, tableau.getWidth());
    }

    @Test
    public void testDropPhase1ObjectiveNoArtificialVars() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 5)); // Only slack variable
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // No artificial variables, so dropPhase1Objective should do nothing.
        int initialHeight = tableau.getHeight();
        int initialWidth = tableau.getWidth();
        assertEquals(1, tableau.getNumObjectiveFunctions());
        tableau.dropPhase1Objective();
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(initialHeight, tableau.getHeight());
        assertEquals(initialWidth, tableau.getWidth());
    }

    @Test
    public void testIsOptimalMaximize() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // For MAXIMIZE, optimality means all coefficients in the objective row (row 0) are >= 0
        // The initial Z row (objective function) for MAXIMIZE has entries: -1 (for c), -1 (for x0), -2 (for x1), 3 (for RHS).
        // Coefficients for variables are -1 and -2.
        assertFalse(tableau.isOptimal());

        // Modify the tableau to make it optimal for MAXIMIZE
        tableau.setEntry(0, 1, 1.0); // x0 coefficient becomes positive
        tableau.setEntry(0, 2, 2.0); // x1 coefficient becomes positive
        assertTrue(tableau.isOptimal());
    }

    @Test
    public void testIsOptimalMinimize() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1.0);
        // For MINIMIZE, optimality means all coefficients in the objective row (row 0) are <= 0
        // The initial Z row (objective function) for MINIMIZE has entries: 1 (for c), 1 (for x0), -2 (for x1), -3 (for RHS).
        // Coefficients for variables are 1 and -2.
        assertFalse(tableau.isOptimal());

        // Modify the tableau to make it optimal for MINIMIZE
        tableau.setEntry(0, 1, -1.0); // x0 coefficient becomes negative
        tableau.setEntry(0, 2, -2.0); // x1 coefficient becomes negative
        assertTrue(tableau.isOptimal());
    }

    @Test
    public void testGetSolutionBasic() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 5)); // x0 = 5
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.EQ, 10)); // x1 = 10
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);

        // Setup tableau such that x0 and x1 are basic variables and the solution is optimal.
        // Row 0: Objective row (Z)
        // Row 1: Constraint 1 (x0 = 5)
        // Row 2: Constraint 2 (x1 = 10)
        double[][] data = {
            {-1.0, -1.0, -2.0, 0.0, 0.0, -3.0}, // Z row: c, coeffs, RHS. For maximize, it's -c.  Value = f.getValue(coeffs)
            { 0.0,  1.0,  0.0, 0.0, 0.0,  5.0}, // x0 = 5
            { 0.0,  0.0,  1.0, 0.0, 0.0, 10.0}  // x1 = 10
        };
        tableau.setEntry(0, 0, -1.0); // Ensure Z row is correctly initialized for MAXIMIZE
        tableau.setEntry(0, 1, -1.0);
        tableau.setEntry(0, 2, -2.0);
        tableau.setEntry(0, 5, -3.0); // RHS

        tableau.setEntry(1, 1, 1.0); // x0 basic in row 1
        tableau.setEntry(1, 5, 5.0); // RHS for x0

        tableau.setEntry(2, 2, 1.0); // x1 basic in row 2
        tableau.setEntry(2, 5, 10.0); // RHS for x1

        // The tableau's internal data needs to reflect this setup, the constructor does not set this up directly.
        // We need to set the tableau data manually for getSolution to work correctly in this test context.
        double[][] tableauData = new double[3][6];
        tableauData[0] = new double[]{-1.0, -1.0, -2.0, 0.0, 0.0, -3.0}; // Z
        tableauData[1] = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 5.0};    // x0 = 5
        tableauData[2] = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 10.0};   // x1 = 10
        ((MockSimplexTableau) tableau).setTableau(new Array2DRowRealMatrix(tableauData));
        ((MockSimplexTableau) tableau).setColumnLabels(new ArrayList<>(List.of("Z", "x0", "x1", "s0", "s1", "RHS")));
        ((MockSimplexTableau) tableau).setNumDecisionVariables(2);

        PointValuePair solution = tableau.getSolution();
        assertArrayEquals(new double[]{5.0, 10.0}, solution.getPoint(), Precision.EPSILON);
        assertEquals(25.0, solution.getValue(), Precision.EPSILON); // 1*5 + 2*10 + 3 = 25
    }

    @Test
    public void testGetSolutionWithNegativeVar() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0); // Objective: x0
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.EQ, -5)); // x0 = -5
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0, 10); // restrictToNonNegative = false

        // numDecisionVariables = 2 (x0, x-)
        // The constraint x0 = -5 implies that x- = 5 is used to satisfy non-negativity.
        // The tableau will have columns: Z, x0, x-, RHS.
        // The solution should be x0 = -5.
        // The objective value should be f.getValue(new double[]{-5.0}) = 1 * -5 + 0 = -5.
        double[][] data = {
            {-1.0, -1.0, 0.0, -5.0}, // Z row. For MAXIMIZE: -c, coeffs, RHS. c=1, RHS=0.
            { 0.0,  1.0, 0.0, -5.0}, // x0 = -5. Basic in row 1.
            { 0.0, -1.0, 1.0,  5.0}  // Artificial constraint related to x- being basic.
        };
        tableau.setTableau(new Array2DRowRealMatrix(data));
        tableau.setColumnLabels(new ArrayList<>(List.of("Z", "x0", "x-", "RHS")));
        tableau.setNumDecisionVariables(2); // including x-
        tableau.setRestrictToNonNegative(false);

        PointValuePair solution = tableau.getSolution();
        // Original decision variable is x0. Its value is -5.
        assertArrayEquals(new double[]{-5.0}, solution.getPoint(), Precision.EPSILON);
        assertEquals(-5.0, solution.getValue(), Precision.EPSILON); // Objective value = 1 * -5 + 0 = -5
    }

    @Test
    public void testDivideRow() {
        double[][] data = {{1.0, 2.0, 3.0}};
        MockSimplexTableau testTableau = new MockSimplexTableau(
                new LinearObjectiveFunction(new double[]{1}, 0),
                new ArrayList<>(),
                GoalType.MAXIMIZE, true, 1.0, 10);
        testTableau.setTableau(new Array2DRowRealMatrix(data));
        testTableau.divideRow(0, 2.0);
        assertArrayEquals(new double[]{0.5, 1.0, 1.5}, testTableau.tableau.getRow(0), Precision.EPSILON);
    }

    @Test
    public void testSubtractRow() {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        MockSimplexTableau testTableau = new MockSimplexTableau(
                new LinearObjectiveFunction(new double[]{1}, 0),
                new ArrayList<>(),
                GoalType.MAXIMIZE, true, 1.0, 10);
        testTableau.setTableau(new Array2DRowRealMatrix(data));
        testTableau.subtractRow(0, 1, 2.0); // row0 = row0 - 2*row1
        // row0 = [1, 2, 3] - 2*[4, 5, 6] = [1-8, 2-10, 3-12] = [-7, -8, -9]
        assertArrayEquals(new double[]{-7.0, -8.0, -9.0}, testTableau.tableau.getRow(0), Precision.EPSILON);
    }

    @Test
    public void testGetSetEntry() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        MockSimplexTableau testTableau = new MockSimplexTableau(
                new LinearObjectiveFunction(new double[]{1}, 0),
                new ArrayList<>(),
                GoalType.MAXIMIZE, true, 1.0, 10);
        testTableau.setTableau(new Array2DRowRealMatrix(data));
        assertEquals(4.0, testTableau.getEntry(1, 1), Precision.EPSILON);
        testTableau.setEntry(1, 1, 5.0);
        assertEquals(5.0, testTableau.getEntry(1, 1), Precision.EPSILON);
    }

    @Test
    public void testAddToEntry() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        MockSimplexTableau testTableau = new MockSimplexTableau(
                new LinearObjectiveFunction(new double[]{1}, 0),
                new ArrayList<>(),
                GoalType.MAXIMIZE, true, 1.0, 10);
        testTableau.setTableau(new Array2DRowRealMatrix(data));
        testTableau.addToEntry(1, 1, 1.5);
        assertEquals(5.5, testTableau.getEntry(1, 1), Precision.EPSILON);
    }

    @Test
    public void testMultiplyEntry() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        MockSimplexTableau testTableau = new MockSimplexTableau(
                new LinearObjectiveFunction(new double[]{1}, 0),
                new ArrayList<>(),
                GoalType.MAXIMIZE, true, 1.0, 10);
        testTableau.setTableau(new Array2DRowRealMatrix(data));
        testTableau.multiplyEntry(1, 1, 2.0);
        assertEquals(8.0, testTableau.getEntry(1, 1), Precision.EPSILON);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // Different goal type should result in different tableau structure (e.g., objective row)
        SimplexTableau tableau3 = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1.0);

        assertEquals(tableau1, tableau2);
        assertNotEquals(tableau1, tableau3);
        assertEquals(tableau1.hashCode(), tableau2.hashCode());
        assertNotEquals(tableau1.hashCode(), tableau3.hashCode());
    }

    @Test
    public void testGetters() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        MockSimplexTableau tableau = new MockSimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0, 10);

        assertEquals(f, tableau.getObjectiveFunction());
        assertEquals(constraints, tableau.getConstraints());
        assertEquals(true, tableau.isRestrictedToNonNegative());
        assertEquals(1.0, tableau.getEpsilon(), Precision.EPSILON);
        assertEquals(10, tableau.getMaxUlps());
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x0, x1
        assertEquals(1, tableau.getNumSlackVariables()); // s0 from LEQ constraint
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumObjectiveFunctions());
        assertEquals(6, tableau.getWidth()); // Z, x0, x1, s0, RHS
        assertEquals(2, tableau.getHeight()); // Z, constraint
    }

    @Test
    public void testGetSlackVariableOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5)); // 1 slack
        constraints.add(new LinearConstraint(new double[]{5, 6}, Relationship.EQ, 7)); // 1 artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // numDecisionVariables = 2 (x0, x1)
        // numSlackVariables = 1
        // numArtificialVariables = 1
        // getNumObjectiveFunctions() = 2 (W, Z)
        // Slack offset = numObjFuncs + numDecisionVariables = 2 + 2 = 4
        assertEquals(4, tableau.getSlackVariableOffset());
    }

    @Test
    public void testGetArtificialVariableOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5)); // 1 slack
        constraints.add(new LinearConstraint(new double[]{5, 6}, Relationship.EQ, 7)); // 1 artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // numDecisionVariables = 2
        // numSlackVariables = 1
        // numArtificialVariables = 1
        // getNumObjectiveFunctions() = 2 (W, Z)
        // Artificial offset = numObjFuncs + numDecVars + numSlackVars = 2 + 2 + 1 = 5
        assertEquals(5, tableau.getArtificialVariableOffset());
    }

    @Test
    public void testGetRhsOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        // Width = 6 (Z, x0, x1, s0, RHS)
        // Offset = Width - 1 = 6 - 1 = 5
        assertEquals(5, tableau.getRhsOffset());
    }

    @Test
    public void testGetOriginalNumDecisionVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2, 3}, 4);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        assertEquals(3, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetNumSlackVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5)); // slack
        constraints.add(new LinearConstraint(new double[]{5, 6}, Relationship.GEQ, 7)); // surplus (treated as slack)
        constraints.add(new LinearConstraint(new double[]{8, 9}, Relationship.EQ, 10)); // artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        assertEquals(2, tableau.getNumSlackVariables()); // LEQ and GEQ constraints contribute slack/surplus variables.
    }

    @Test
    public void testGetNumArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5)); // slack
        constraints.add(new LinearConstraint(new double[]{5, 6}, Relationship.GEQ, 7)); // artificial
        constraints.add(new LinearConstraint(new double[]{8, 9}, Relationship.EQ, 10)); // artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        assertEquals(2, tableau.getNumArtificialVariables()); // GEQ and EQ constraints contribute artificial variables.
    }

    @Test
    public void testGetData() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        double[][] expected = {
            {-1.0, -1.0, -2.0, 0.0, 3.0}, // Z row
            { 0.0,  3.0,  4.0, 1.0, 5.0}  // constraint row
        };
        // getData() returns double[][], so we need to compare row by row.
        double[][] actualData = tableau.getData();
        assertEquals(expected.length, actualData.length);
        for(int i=0; i<expected.length; ++i) {
            assertArrayEquals(expected[i], actualData[i], Precision.EPSILON);
        }
    }

    @Test
    public void testGetInvertedCoefficientSum() {
        RealVector coefficients = MatrixUtils.createRealVector(new double[]{1, 2, 3});
        // sum = 1 + 2 + 3 = 6
        // -1 * sum = -6
        assertEquals(-6.0, SimplexTableau.getInvertedCoefficientSum(coefficients), Precision.EPSILON);
    }

    @Test
    public void testGetInvertedCoefficientSumZero() {
        RealVector coefficients = MatrixUtils.createRealVector(new double[]{0, 0, 0});
        assertEquals(0.0, SimplexTableau.getInvertedCoefficientSum(coefficients), Precision.EPSILON);
    }

    @Test
    public void testGetInvertedCoefficientSumNegative() {
        RealVector coefficients = MatrixUtils.createRealVector(new double[]{-1, -2, -3});
        // sum = -1 - 2 - 3 = -6
        // -1 * sum = 6
        assertEquals(6.0, SimplexTableau.getInvertedCoefficientSum(coefficients), Precision.EPSILON);
    }
}
```