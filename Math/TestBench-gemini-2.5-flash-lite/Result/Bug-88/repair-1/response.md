```java
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
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.util.MathUtils;

public class SimplexTableauTest {

    private static final double EPSILON = 1.0e-9;

    @Test
    public void testConstructorMaximizationWithNonNegative() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2
        assertEquals(3, tableau.getNumSlackVariables()); // s1, s2, s3
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getHeight()); // Objective row + 3 constraints
        assertEquals(7, tableau.getWidth());  // 2 decision + 3 slack + 1 RHS + 1 objective
    }

    @Test
    public void testConstructorMinimizationWithNonNegative() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2
        assertEquals(3, tableau.getNumSlackVariables()); // s1, s2, s3
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getHeight()); // Objective row + 3 constraints
        assertEquals(7, tableau.getWidth());  // 2 decision + 3 slack + 1 RHS + 1 objective
    }

    @Test
    public void testConstructorMaximizationWithoutNonNegative() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2
        assertEquals(3, tableau.getNumSlackVariables()); // s1, s2, s3
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getHeight()); // Objective row + 3 constraints
        assertEquals(8, tableau.getWidth());  // 2 original + 1 x- + 3 slack + 1 RHS + 1 objective
    }

    @Test
    public void testConstructorMinimizationWithoutNonNegative() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2
        assertEquals(3, tableau.getNumSlackVariables()); // s1, s2, s3
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(4, tableau.getHeight()); // Objective row + 3 constraints
        assertEquals(8, tableau.getWidth());  // 2 original + 1 x- + 3 slack + 1 RHS + 1 objective
    }

    @Test
    public void testConstructorWithEqualityAndGeqConstraintsMaximization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2
        assertEquals(1, tableau.getNumSlackVariables()); // s1 for GEQ
        assertEquals(2, tableau.getNumArtificialVariables()); // a1 for EQ, a2 for GEQ
        assertEquals(3, tableau.getHeight()); // Phase 1 obj + Phase 2 obj + 2 constraints
        assertEquals(7, tableau.getWidth()); // 2 decision + 1 slack + 2 artificial + 1 RHS + 2 objective
    }

    @Test
    public void testConstructorWithEqualityAndGeqConstraintsMinimization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2
        assertEquals(1, tableau.getNumSlackVariables()); // s1 for GEQ
        assertEquals(2, tableau.getNumArtificialVariables()); // a1 for EQ, a2 for GEQ
        assertEquals(3, tableau.getHeight()); // Phase 1 obj + Phase 2 obj + 2 constraints
        assertEquals(7, tableau.getWidth()); // 2 decision + 1 slack + 2 artificial + 1 RHS + 2 objective
    }

    @Test
    public void testGetNormalizedConstraintsPositiveRhs() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(2.0, normalized.get(0).getValue(), EPSILON);
    }

    @Test
    public void testGetNormalizedConstraintsNegativeRhs() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, -2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(2.0, normalized.get(0).getValue(), EPSILON);
        assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
    }

    @Test
    public void testGetInvertedCoeffiecientSum() {
        RealVector coefficients = new RealMatrixImpl(new double[][]{{1, 2, 3}}).getRowVector(0);
        assertEquals(-6.0, SimplexTableau.getInvertedCoeffiecientSum(coefficients), EPSILON);
    }

    @Test
    public void testGetInvertedCoeffiecientSumWithZeros() {
        RealVector coefficients = new RealMatrixImpl(new double[][]{{0, 2, 0}}).getRowVector(0);
        assertEquals(-2.0, SimplexTableau.getInvertedCoeffiecientSum(coefficients), EPSILON);
    }

    @Test
    public void testGetInvertedCoeffiecientSumEmpty() {
        RealVector coefficients = new RealMatrixImpl(new double[][]{{}}).getRowVector(0);
        assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(coefficients), EPSILON);
    }
    
    // initialize() is private, so we cannot test it directly.
    // Its effects are tested indirectly by tests that rely on proper initialization.

    @Test
    public void testDiscardArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int initialWidth = tableau.getWidth();
        int initialHeight = tableau.getHeight();
        int initialArtificialVars = tableau.getNumArtificialVariables();
        
        tableau.discardArtificialVariables();
        
        assertEquals(initialArtificialVars - 2, tableau.getNumArtificialVariables());
        assertEquals(initialWidth - 2, tableau.getWidth());
        assertEquals(initialHeight - 1, tableau.getHeight());
    }

    @Test
    public void testDiscardArtificialVariablesNoArtificialVars() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int initialWidth = tableau.getWidth();
        int initialHeight = tableau.getHeight();
        int initialArtificialVars = tableau.getNumArtificialVariables();

        tableau.discardArtificialVariables();

        assertEquals(initialArtificialVars, tableau.getNumArtificialVariables());
        assertEquals(initialWidth, tableau.getWidth());
        assertEquals(initialHeight, tableau.getHeight());
    }

    @Test
    public void testGetSolutionBasicNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        
        // Manually set up a basic feasible solution for testing purposes
        // x1 = 2, x2 = 0, s1 = 0, s2 = 3
        tableau.setEntry(1, 1, 2.0); // x1 basic in row 1
        tableau.setEntry(2, 2, 3.0); // x2 basic in row 2
        tableau.setEntry(0, 3, 100.0); // Objective value
        tableau.setEntry(1, 3, 2.0); // RHS for x1
        tableau.setEntry(2, 3, 3.0); // RHS for x2

        RealPointValuePair solution = tableau.getSolution();
        // The solution should reflect the original decision variables
        assertEquals(2.0, solution.getPoint()[0], EPSILON); // x1
        assertEquals(3.0, solution.getPoint()[1], EPSILON); // x2
        assertEquals(50.0, solution.getValue(), EPSILON); // 15*2 + 10*3 = 30+30=60, but the objective is negated for maximization in createTableau
    }

    @Test
    public void testGetSolutionBasicWithXMinus() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON); // restrictToNonNegative = false

        // Manually set up a basic feasible solution for testing purposes
        // x1 = 2, x2 = 0, x- = 0, s1 = 0
        tableau.setEntry(1, 1, 2.0); // x1 basic in row 1
        tableau.setEntry(0, 3, 100.0); // Objective value
        tableau.setEntry(1, 3, 2.0); // RHS for x1

        RealPointValuePair solution = tableau.getSolution();
        assertEquals(2.0, solution.getPoint()[0], EPSILON); // x1
        assertEquals(0.0, solution.getPoint()[1], EPSILON); // x2
        // x- is not an original variable, so it's not in the solution point.
        assertEquals(100.0, solution.getValue(), EPSILON); // 15*2 + 10*0 = 30. Negated in createTableau.
    }

    @Test
    public void testSubtractRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        
        double[][] initialData = tableau.getData();
        int width = tableau.getWidth();
        
        // Subtract row 1 from row 0
        tableau.subtractRow(0, 1, 1.0);
        
        double[][] newData = tableau.getData();
        
        // Check a few entries
        assertEquals(initialData[0][0] - initialData[1][0], newData[0][0], EPSILON);
        assertEquals(initialData[0][1] - initialData[1][1], newData[0][1], EPSILON);
        assertEquals(initialData[0][width-1] - initialData[1][width-1], newData[0][width-1], EPSILON);
    }

    @Test
    public void testDivideRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        
        double initialEntry = tableau.getEntry(1, 1);
        
        // Divide row 1 by 2.0
        tableau.divideRow(1, 2.0);
        
        assertEquals(initialEntry / 2.0, tableau.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testGetWidth() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // numDecisionVariables (original) = 2, numSlackVariables = 1, numArtificialVariables = 0, getNumObjectiveFunctions() = 1
        // Width = 2 + 1 + 0 + 1 + 1 = 5
        assertEquals(5, tableau.getWidth());
    }

    @Test
    public void testGetHeight() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // 1 objective row + 3 constraint rows = 4
        assertEquals(4, tableau.getHeight());
    }
    
    @Test
    public void testGetEntry() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // Objective row (row 0): coefficients for x1, x2, s1, RHS
        // Constraint row (row 1): coefficients for x1, x2, s1, RHS
        // From createTableau: objectiveCoefficients are multiplied by -1 for maximization.
        assertEquals(-15.0, tableau.getEntry(0, 0), EPSILON); // Objective coeff for x1
        assertEquals(-10.0, tableau.getEntry(0, 1), EPSILON); // Objective coeff for x2
        assertEquals(0.0, tableau.getEntry(0, 2), EPSILON);   // Slack s1 coeff in objective
        assertEquals(0.0, tableau.getEntry(0, 4), EPSILON);   // RHS for objective
        
        // Constraint row 1: x1 + s1 = 2
        assertEquals(1.0, tableau.getEntry(1, 0), EPSILON); // x1 coeff
        assertEquals(0.0, tableau.getEntry(1, 1), EPSILON); // x2 coeff
        assertEquals(1.0, tableau.getEntry(1, 2), EPSILON); // s1 coeff
        assertEquals(2.0, tableau.getEntry(1, 3), EPSILON); // RHS
    }

    @Test
    public void testSetEntry() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        
        tableau.setEntry(0, 0, 99.0);
        assertEquals(99.0, tableau.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testGetSlackVariableOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // numObjectiveFunctions = 1, numDecisionVariables = 2 (original)
        // Offset = 1 (obj) + 2 (dec) = 3
        assertEquals(3, tableau.getSlackVariableOffset());
    }

    @Test
    public void testGetArtificialVariableOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // numObjectiveFunctions = 1, numDecisionVariables = 2 (original), numSlackVariables = 0
        // Offset = 1 (obj) + 2 (dec) + 0 (slack) = 3
        assertEquals(3, tableau.getArtificialVariableOffset());
    }

    @Test
    public void testGetRhsOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // Width = 5
        // Offset = 5 - 1 = 4
        assertEquals(4, tableau.getRhsOffset());
    }

    @Test
    public void testGetNumDecisionVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(2, tableau.getNumDecisionVariables()); // x1, x2
    }

    @Test
    public void testGetNumDecisionVariablesWithXMinus() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON); // restrictToNonNegative = false
        assertEquals(3, tableau.getNumDecisionVariables()); // x1, x2, x-
    }

    @Test
    public void testGetOriginalNumDecisionVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2
    }

    @Test
    public void testGetOriginalNumDecisionVariablesWithXMinus() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON); // restrictToNonNegative = false
        assertEquals(2, tableau.getOriginalNumDecisionVariables()); // x1, x2 (x- is not an original variable)
    }

    @Test
    public void testGetNumSlackVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // LEQ introduces a slack variable. GEQ introduces an excess variable (treated as slack here).
        assertEquals(2, tableau.getNumSlackVariables()); // s1 for LEQ, excess for GEQ
    }

    @Test
    public void testGetNumArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // EQ introduces an artificial variable. GEQ introduces an artificial variable.
        assertEquals(2, tableau.getNumArtificialVariables()); // a1 for EQ, a2 for GEQ
    }

    @Test
    public void testEqualsSameInstance() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertTrue(tableau.equals(tableau));
    }

    @Test
    public void testEqualsNull() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertFalse(tableau.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertFalse(tableau.equals("not a tableau"));
    }

    @Test
    public void testEqualsDifferentParameters() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints1 = new ArrayList<LinearConstraint>();
        constraints1.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau1 = new SimplexTableau(f1, constraints1, GoalType.MAXIMIZE, true, EPSILON);

        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[]{10, 15}, 0);
        Collection<LinearConstraint> constraints2 = new ArrayList<LinearConstraint>();
        constraints2.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 2));
        SimplexTableau tableau2 = new SimplexTableau(f2, constraints2, GoalType.MINIMIZE, false, EPSILON);

        assertFalse(tableau1.equals(tableau2));
    }
    
    @Test
    public void testHashCode() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{15, 10}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Use public getter methods to access fields for hashCode calculation
        int expectedHashCode = Boolean.valueOf(tableau.restrictToNonNegative).hashCode() ^
                               tableau.getNumDecisionVariables() ^
                               tableau.getNumSlackVariables() ^
                               tableau.getNumArtificialVariables() ^
                               Double.valueOf(tableau.epsilon).hashCode() ^
                               f.hashCode() ^
                               constraints.hashCode() ^
                               tableau.getData().hashCode(); // Accessing data directly as tableau.tableau is private
        assertEquals(expectedHashCode, tableau.hashCode());
    }
}
```