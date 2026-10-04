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
    @Test
    public void testNumVariablesOneCoefficient() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3 }, 0);
        SimplexTableau tableau = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(1, tableau.getNumVariables());
    }

    @Test
    public void testNumVariablesSeveralCoefficients() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, -1, 4 }, 0);
        SimplexTableau tableau = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                GoalType.MINIMIZE, true, 1e-6);
        assertEquals(3, tableau.getNumVariables());
    }

    @Test
    public void testNormalizedConstraintKeepsPositiveRightHandSide() throws Exception {
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2, -3 }, Relationship.LEQ, 5));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        LinearConstraint normalized = tableau.getNormalizedConstraints().get(0);
        assertEquals(5.0, normalized.getValue(), 0.0);
        assertEquals(Relationship.LEQ, normalized.getRelationship());
        assertEquals(2.0, normalized.getCoefficients().getEntry(0), 0.0);
        assertEquals(-3.0, normalized.getCoefficients().getEntry(1), 0.0);
    }

    @Test
    public void testNormalizedConstraintNegatesNegativeRightHandSide() throws Exception {
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2, -3 }, Relationship.LEQ, -5));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        LinearConstraint normalized = tableau.getNormalizedConstraints().get(0);
        assertEquals(5.0, normalized.getValue(), 0.0);
        assertEquals(Relationship.GEQ, normalized.getRelationship());
        assertEquals(-2.0, normalized.getCoefficients().getEntry(0), 0.0);
        assertEquals(3.0, normalized.getCoefficients().getEntry(1), 0.0);
    }

    @Test
    public void testNormalizedConstraintAtZeroKeepsRelationship() throws Exception {
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.EQ, 0));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2 }, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6);
        LinearConstraint normalized = tableau.getNormalizedConstraints().get(0);
        assertEquals(0.0, normalized.getValue(), 0.0);
        assertEquals(Relationship.EQ, normalized.getRelationship());
        assertEquals(1.0, normalized.getCoefficients().getEntry(0), 0.0);
    }

    @Test
    public void testNormalizationRetainsEveryConstraintInOrder() throws Exception {
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 3 }, Relationship.GEQ, -4));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 0);
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(2, normalized.size());
        assertEquals(2.0, normalized.get(0).getValue(), 0.0);
        assertEquals(Relationship.LEQ, normalized.get(0).getRelationship());
        assertEquals(4.0, normalized.get(1).getValue(), 0.0);
        assertEquals(Relationship.LEQ, normalized.get(1).getRelationship());
    }

    @Test
    public void testEqualTableauxCompareEqual() throws Exception {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 2, 1 }, 3);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 2, 1 }, 3);
        List<LinearConstraint> c1 = new ArrayList<LinearConstraint>();
        List<LinearConstraint> c2 = new ArrayList<LinearConstraint>();
        c1.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 4));
        c2.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 4));
        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(f2, c2, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(t1.equals(t2));
    }

    @Test
    public void testTableauEqualsItself() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 2);
        SimplexTableau tableau = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                GoalType.MINIMIZE, true, 1e-6);
        assertTrue(tableau.equals(tableau));
    }

    @Test
    public void testTableauNotEqualToNull() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 2);
        SimplexTableau tableau = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                GoalType.MINIMIZE, true, 1e-6);
        assertFalse(tableau.equals(null));
    }

    @Test
    public void testTableauNotEqualToOtherType() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 2);
        SimplexTableau tableau = new SimplexTableau(f, new ArrayList<LinearConstraint>(),
                GoalType.MINIMIZE, true, 1e-6);
        assertFalse(tableau.equals("tableau"));
    }

    @Test
    public void testTableauxDifferingObjectiveAreNotEqual() throws Exception {
        SimplexTableau t1 = new SimplexTableau(
                new LinearObjectiveFunction(new double[] { 1 }, 0),
                new ArrayList<LinearConstraint>(), GoalType.MINIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(
                new LinearObjectiveFunction(new double[] { 2 }, 0),
                new ArrayList<LinearConstraint>(), GoalType.MINIMIZE, true, 1e-6);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testTableauxDifferingConstraintAreNotEqual() throws Exception {
        List<LinearConstraint> c1 = new ArrayList<LinearConstraint>();
        List<LinearConstraint> c2 = new ArrayList<LinearConstraint>();
        c1.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 2));
        c2.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 3));
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 0);
        SimplexTableau t1 = new SimplexTableau(f, c1, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(f, c2, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testTableauxDifferingRestrictionAreNotEqual() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        SimplexTableau t1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEqualTableauxHaveEqualHashCodes() throws Exception {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1, 3 }, 2);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 1, 3 }, 2);
        SimplexTableau t1 = new SimplexTableau(f1, new ArrayList<LinearConstraint>(),
                GoalType.MINIMIZE, true, 1e-6);
        SimplexTableau t2 = new SimplexTableau(f2, new ArrayList<LinearConstraint>(),
                GoalType.MINIMIZE, true, 1e-6);
        assertEquals(t1.hashCode(), t2.hashCode());
    }
}
