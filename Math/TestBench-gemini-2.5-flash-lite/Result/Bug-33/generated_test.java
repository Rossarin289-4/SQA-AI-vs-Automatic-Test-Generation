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

    @Test
    public void testGetBasicRowSimple() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.EQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);

        // The artificial variable 'a0' is at column index 4.
        // In the tableau, the artificial variable 'a0' is basic in the constraint row (row 2).
        // The W row (row 0) is adjusted such that 'a0' is basic.
        assertEquals(2, tableau.getBasicRow(4).intValue());
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
    public void testDropPhase1ObjectiveSimple() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.EQ, 5));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);

        // Initial state: W, Z, constraint row. 7 columns: W, Z, x0, a0, RHS.
        assertEquals(2, tableau.getNumObjectiveFunctions());
        assertEquals(3, tableau.getHeight());
        assertEquals(7, tableau.getWidth());

        tableau.dropPhase1Objective();

        // After drop: Z, constraint row. 5 columns: Z, x0, RHS.
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
        // For MAXIMIZE, optimality means all coefficients in the objective row (row 0) are >= 0.
        // The initial tableau for MAXIMIZE has -1 and -2 in the objective row for x0 and x1.
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
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
        // For MINIMIZE, optimality means all coefficients in the objective row (row 0) are <= 0.
        // The initial tableau for MINIMIZE has 1 and -2 in the objective row for x0 and x1.
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1.0);
        assertFalse(tableau.isOptimal());

        // Modify the tableau to make it optimal for MINIMIZE
        tableau.setEntry(0, 1, -1.0); // x0 coefficient becomes negative
        tableau.setEntry(0, 2, -2.0); // x1 coefficient becomes negative
        assertTrue(tableau.isOptimal());
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 3);
        Collection<LinearConstraint> constraints = new ArrayList<>();
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 5));
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
        SimplexTableau tableau3 = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1.0);

        assertEquals(tableau1, tableau2);
        assertNotEquals(tableau1, tableau3);
        assertEquals(tableau1.hashCode(), tableau2.hashCode());
        assertNotEquals(tableau1.hashCode(), tableau3.hashCode());
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
        // Width = 6 (Z, x0, x1, s0, RHS) if numObjectiveFunctions is 1.
        // With numObjectiveFunctions = 2 (W, Z):
        // Width = numObjFuncs + numDecVars + numSlackVars + numArtVars + 1 (RHS)
        // Width = 2 + 2 + 1 + 0 + 1 = 6
        // RHS offset = Width - 1 = 6 - 1 = 5
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0);
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
        // W row, Z row, constraint row.
        // Column labels: W, Z, x0, x1, s0, RHS.
        // The tableau matrix is populated as follows:
        // Row 0 (W): -1, 0, 0, 0, 0, 0 (phase 1 objective)
        // Row 1 (Z): -1, 1, -1, -2, 0, 3 (phase 2 objective, coefficients * -1 for maximize)
        // Row 2 (Constraint): 0, 0, 3, 4, 1, 5
        double[][] expected = {
            {-1.0, 0.0, 0.0, 0.0, 0.0, 0.0}, // W row
            {-1.0, 1.0, -1.0, -2.0, 0.0, 3.0}, // Z row
            { 0.0, 0.0,  3.0,  4.0, 1.0, 5.0}  // constraint row
        };
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
