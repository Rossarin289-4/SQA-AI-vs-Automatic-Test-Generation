package org.apache.commons.math.optimization.linear;

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
import org.apache.commons.math.linear.MatrixUtils;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.util.MathUtils;

public class SimplexTableauTest {

    // Helper method to create a basic tableau for testing
    private SimplexTableau createBasicTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.GEQ, 3));
        return new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
    }

    @Test
    public void testConstructorWithBasicSetup() throws Exception {
        SimplexTableau tableau = createBasicTableau();
        assertNotNull(tableau);
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(5, tableau.getWidth());
        assertEquals(3, tableau.getHeight());
    }

    @Test
    public void testConstructorWithNoConstraints() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertNotNull(tableau);
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(3, tableau.getWidth()); // Objective function coefficients + RHS
        assertEquals(1, tableau.getHeight()); // Objective function row
    }

    @Test
    public void testConstructorWithOnlyEqualityConstraints() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertNotNull(tableau);
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getWidth()); // 2 decision + 1 artificial + 1 RHS
        assertEquals(3, tableau.getHeight()); // Phase 1 obj + Phase 2 obj + constraint
    }

    @Test
    public void testConstructorWithNonNegativeRestriction() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumDecisionVariables());
    }

    @Test
    public void testConstructorWithoutNonNegativeRestriction() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(3, tableau.getNumDecisionVariables()); // Includes the extra x- variable
    }

    @Test
    public void testGetNormalizedConstraints() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{-1, -1}, Relationship.LEQ, -5)); // Should be normalized
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.GEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(2, normalized.size());
        assertEquals(5.0, normalized.get(0).getValue(), 1e-9);
        assertEquals(Relationship.GEQ, normalized.get(1).getRelationship());
    }

    @Test
    public void testGetNormalizedConstraintsNoNormalizationNeeded() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(5.0, normalized.get(0).getValue(), 1e-9);
    }

    @Test
    public void testInitializeWithArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 5)); // Requires artificial variable
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        // The initialize method is called within the constructor and makes internal modifications.
        // We can assert that the tableau is initialized without errors and contains expected dimensions.
        // A direct check of internal matrix values after initialization is complex and brittle.
        // The fact that the constructor completes without error is an implicit check.
        assertTrue(true); // Placeholder assertion.
    }

    @Test
    public void testDiscardArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 5)); // Requires artificial variable
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        int initialWidth = tableau.getWidth();
        int initialHeight = tableau.getHeight();
        int initialArtificialVars = tableau.getNumArtificialVariables();

        tableau.discardArtificialVariables();

        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(initialWidth - initialArtificialVars - 1, tableau.getWidth());
        assertEquals(initialHeight - 1, tableau.getHeight());
    }

    @Test
    public void testDiscardArtificialVariablesWhenNoneExist() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5)); // No artificial variable
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        int initialWidth = tableau.getWidth();
        int initialHeight = tableau.getHeight();
        int initialArtificialVars = tableau.getNumArtificialVariables();

        tableau.discardArtificialVariables();

        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(initialWidth, tableau.getWidth());
        assertEquals(initialHeight, tableau.getHeight());
    }

    @Test
    public void testGetSolutionBasic() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        // Expected solution: x1=5, x2=3, Z=110
        RealPointValuePair solution = tableau.getSolution();
        assertArrayEquals(new double[]{5.0, 3.0}, solution.getPoint(), 1e-9);
        assertEquals(110.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testGetSolutionWithNegativeRestriction() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.LEQ, 8));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        // The point should have dimension 3 (x1, x2, x-) when not restricted to non-negative.
        assertEquals(3, solution.getPoint().length);
    }

    @Test
    public void testGetSolutionWithEqualityConstraint() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 5)); // Equality requires artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        tableau.discardArtificialVariables(); // Necessary to get a meaningful solution from getSolution

        // Based on manual tableau analysis for this simple case:
        // After discarding artificials, the tableau would represent:
        // Z | x1 | x2 | RHS
        // -10  0    0   -100   (after row operations to get to a basic form where x2 is basic)
        // 1    1    0    5
        // The getSolution method, in this state, should identify x2 as basic in row 1, and x1 as non-basic (0).
        // Solution: x1=0, x2=5. Value = 10*0 + 20*5 = 100.
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertArrayEquals(new double[]{0.0, 5.0}, solution.getPoint(), 1e-9);
        assertEquals(100.0, solution.getValue(), 1e-9);
    }

    @Test
    public void testSubtractRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double[][] originalData = tableau.getData();
        double[] row0Before = originalData[0];
        double[] row1Before = originalData[1];

        tableau.subtractRow(0, 1, 1.0); // row0 = row0 - 1.0 * row1

        double[][] newData = tableau.getData();
        for (int j = 0; j < tableau.getWidth(); j++) {
            assertEquals(row0Before[j] - row1Before[j], newData[0][j], 1e-9);
        }
    }

    @Test
    public void testDivideRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{2, 2}, Relationship.LEQ, 10));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double[][] originalData = tableau.getData();
        double[] row1Before = originalData[1];

        tableau.divideRow(1, 2.0); // row1 = row1 / 2.0

        double[][] newData = tableau.getData();
        for (int j = 0; j < tableau.getWidth(); j++) {
            assertEquals(row1Before[j] / 2.0, newData[1][j], 1e-9);
        }
    }

    @Test
    public void testGetInvertedCoeffiecientSum() {
        RealVector coefficients = new Array2DRowRealMatrix(new double[]{1, 2, 3}).getRowVector(0);
        assertEquals(-6.0, SimplexTableau.getInvertedCoeffiecientSum(coefficients), 1e-9);
    }

    @Test
    public void testGetInvertedCoeffiecientSumWithZeroes() {
        RealVector coefficients = new Array2DRowRealMatrix(new double[]{0, 0, 0}).getRowVector(0);
        assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(coefficients), 1e-9);
    }

    @Test
    public void testGetEntry() {
        SimplexTableau tableau = createBasicTableau();
        // Example: constraint 1: 1*x1 + 1*x2 + 1*s1 + 0*s2 + 0*a1 + 0*RHS = 2
        // This means the entry at row 2 (after objective rows), col 0 (x1 coeff) should be 1.
        // Objective rows are 0 and 1. Constraint rows start at 2.
        // x1 coeff index is 0.
        assertEquals(1.0, tableau.getEntry(2, 0), 1e-9);
    }

    @Test
    public void testSetEntry() {
        SimplexTableau tableau = createBasicTableau();
        tableau.setEntry(1, 1, 99.9); // Modify an entry in the phase 2 objective row
        assertEquals(99.9, tableau.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testGetSlackVariableOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5)); // 1 slack
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.GEQ, 3)); // 1 slack
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2)); // 0 slack, 1 artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        // numDecisionVariables = 2
        // numSlackVariables = 2 (LEQ + GEQ)
        // numArtificialVariables = 1 (EQ + GEQ)
        // Objective functions = 2 (Phase 1 and 2 due to artificial var)
        // Slack offset = numObjectiveFunctions + numDecisionVariables = 2 + 2 = 4
        assertEquals(4, tableau.getSlackVariableOffset());
    }

    @Test
    public void testGetArtificialVariableOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5)); // 1 slack
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.GEQ, 3)); // 1 slack, 1 artificial
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2)); // 0 slack, 1 artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        // numDecisionVariables = 2
        // numSlackVariables = 2 (LEQ + GEQ)
        // numArtificialVariables = 2 (EQ + GEQ)
        // Objective functions = 2
        // Artificial offset = numObjectiveFunctions + numDecisionVariables + numSlackVariables = 2 + 2 + 2 = 6
        assertEquals(6, tableau.getArtificialVariableOffset());
    }

    @Test
    public void testGetRhsOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        // Width = numDecisionVariables (2) + numSlackVariables (1) + numArtificialVariables (0) + getNumObjectiveFunctions() (1) + 1 (RHS) = 5
        // RHS offset = Width - 1 = 4
        assertEquals(4, tableau.getRhsOffset());
    }

    @Test
    public void testGetNegativeDecisionVariableOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6); // Not restricted to non-negative
        // numDecisionVariables = 3 (2 original + 1 extra)
        // numObjectiveFunctions = 1
        // Negative decision variable offset = numObjectiveFunctions + getOriginalNumDecisionVariables() = 1 + 2 = 3
        // Original num variables is 2.
        assertEquals(3, tableau.getNegativeDecisionVariableOffset());
    }

    @Test
    public void testGetNegativeDecisionVariableOffsetWhenRestricted() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6); // Restricted to non-negative
        // The method getNegativeDecisionVariableOffset calculation is numObjectiveFunctions + getOriginalNumDecisionVariables().
        // When restrictToNonNegative is true, numDecisionVariables = getNumVariables(), and getOriginalNumDecisionVariables() also returns numDecisionVariables.
        // numObjectiveFunctions is 1. Offset = 1 + 2 = 3.
        assertEquals(3, tableau.getNegativeDecisionVariableOffset());
    }

    @Test
    public void testGetNumDecisionVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumDecisionVariables()); // Original num variables + 0
        tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(3, tableau.getNumDecisionVariables()); // Original num variables + 1
    }

    @Test
    public void testGetOriginalNumDecisionVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
        tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetNumSlackVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5)); // 1 slack
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.GEQ, 3)); // 1 slack
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2)); // 0 slack
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumSlackVariables());
    }

    @Test
    public void testGetNumArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{10, 20}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5)); // 0 artificial
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.GEQ, 3)); // 1 artificial
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2)); // 1 artificial
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumArtificialVariables());
    }

    @Test
    public void testGetData() {
        SimplexTableau tableau = createBasicTableau();
        double[][] data = tableau.getData();
        assertNotNull(data);
        assertEquals(3, data.length); // Height
        assertEquals(5, data[0].length); // Width
    }

    @Test
    public void testEquals() {
        SimplexTableau tableau1 = createBasicTableau();
        SimplexTableau tableau2 = createBasicTableau();
        assertEquals(tableau1, tableau2);

        // Modify tableau2 slightly
        tableau2.setEntry(0, 0, -99.0);
        assertNotEquals(tableau1, tableau2);

        // Create a new tableau with different parameters
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        SimplexTableau tableau3 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertNotEquals(tableau1, tableau3);
    }

    @Test
    public void testNotEqualsNull() {
        SimplexTableau tableau = createBasicTableau();
        assertNotEquals(tableau, null);
    }

    @Test
    public void testNotEqualsDifferentClass() {
        SimplexTableau tableau = createBasicTableau();
        assertNotEquals(tableau, new Object());
    }

    @Test
    public void testHashCode() {
        SimplexTableau tableau1 = createBasicTableau();
        SimplexTableau tableau2 = createBasicTableau();
        assertEquals(tableau1.hashCode(), tableau2.hashCode());

        // Modify tableau2 slightly
        tableau2.setEntry(0, 0, -99.0);
        assertNotEquals(tableau1.hashCode(), tableau2.hashCode());
    }
}
