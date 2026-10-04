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
    public void testInvertedCoefficientSumPositiveEntries() throws Exception {
        assertEquals(-6.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {1.0, 2.0, 3.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumNegativeEntries() throws Exception {
        assertEquals(6.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {-1.0, -2.0, -3.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumMixedEntries() throws Exception {
        assertEquals(-2.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {4.0, -3.0, 1.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumZeroEntries() throws Exception {
        assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {0.0, 0.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumSinglePositiveEntry() throws Exception {
        assertEquals(-5.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {5.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumSingleNegativeEntry() throws Exception {
        assertEquals(5.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {-5.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumFractionalEntries() throws Exception {
        assertEquals(-1.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {0.25, 0.75})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumCancellation() throws Exception {
        assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {7.0, -7.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumLeadingZero() throws Exception {
        assertEquals(-3.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {0.0, 3.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumTrailingZero() throws Exception {
        assertEquals(3.0, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {-3.0, 0.0})), 0.0);
    }

    @Test
    public void testInvertedCoefficientSumSmallFractions() throws Exception {
        assertEquals(-0.5, SimplexTableau.getInvertedCoeffiecientSum(
                MatrixUtils.createRealVector(new double[] {0.125, 0.375})), 0.0);
    }

    @Test
    public void testConstructorWithNullObjectiveThrows() throws Exception {
        try {
            new SimplexTableau(null, new ArrayList<LinearConstraint>(),
                    GoalType.MAXIMIZE, true, 1.0e-6);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testGetNumVariablesOneCoefficient() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {2.0}, 3.0);
        SimplexTableau tableau = new SimplexTableau(objective,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        assertEquals(1, tableau.getNumVariables());
    }

    @Test
    public void testGetNumVariablesSeveralCoefficients() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0, 0.0, -1.0}, 0.0);
        SimplexTableau tableau = new SimplexTableau(objective,
                new ArrayList<LinearConstraint>(), GoalType.MINIMIZE, true, 1.0e-6);
        assertEquals(3, tableau.getNumVariables());
    }

    @Test
    public void testGetNormalizedConstraintsPositiveRightHandSide() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {2.0}, Relationship.LEQ, 5.0));
        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(new LinearConstraint(new double[] {2.0}, Relationship.LEQ, 5.0),
                normalized.get(0));
    }

    @Test
    public void testGetNormalizedConstraintsNegativeRightHandSide() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {2.0}, Relationship.LEQ, -5.0));
        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(new LinearConstraint(new double[] {-2.0}, Relationship.GEQ, 5.0),
                normalized.get(0));
    }

    @Test
    public void testGetNormalizedConstraintsZeroRightHandSide() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {-3.0}, Relationship.GEQ, 0.0));
        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MINIMIZE, true, 1.0e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(new LinearConstraint(new double[] {-3.0}, Relationship.GEQ, 0.0),
                normalized.get(0));
    }

    @Test
    public void testGetNormalizedConstraintsPreservesOrder() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {2.0}, Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(new double[] {3.0}, Relationship.EQ, -6.0));
        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(2, normalized.size());
        assertEquals(new LinearConstraint(new double[] {2.0}, Relationship.LEQ, 4.0),
                normalized.get(0));
        assertEquals(new LinearConstraint(new double[] {-3.0}, Relationship.EQ, 6.0),
                normalized.get(1));
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        SimplexTableau tableau = new SimplexTableau(objective,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        assertTrue(tableau.equals(tableau));
    }

    @Test
    public void testEqualsEquivalentInstances() throws Exception {
        LinearObjectiveFunction objective1 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        LinearObjectiveFunction objective2 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        SimplexTableau first = new SimplexTableau(objective1,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau second = new SimplexTableau(objective2,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        assertTrue(first.equals(second));
    }

    @Test
    public void testEqualsNull() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        SimplexTableau tableau = new SimplexTableau(objective,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        assertFalse(tableau.equals(null));
    }

    @Test
    public void testEqualsDifferentType() throws Exception {
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        SimplexTableau tableau = new SimplexTableau(objective,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        assertFalse(tableau.equals("tableau"));
    }

    @Test
    public void testEqualsDifferentEpsilon() throws Exception {
        LinearObjectiveFunction objective1 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        LinearObjectiveFunction objective2 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        SimplexTableau first = new SimplexTableau(objective1,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau second = new SimplexTableau(objective2,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 2.0e-6);
        assertFalse(first.equals(second));
    }

    @Test
    public void testHashCodeEqualForEquivalentInstances() throws Exception {
        LinearObjectiveFunction objective1 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        LinearObjectiveFunction objective2 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        SimplexTableau first = new SimplexTableau(objective1,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau second = new SimplexTableau(objective2,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testHashCodeChangesWithEpsilon() throws Exception {
        LinearObjectiveFunction objective1 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        LinearObjectiveFunction objective2 =
                new LinearObjectiveFunction(new double[] {1.0}, 0.0);
        SimplexTableau first = new SimplexTableau(objective1,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau second = new SimplexTableau(objective2,
                new ArrayList<LinearConstraint>(), GoalType.MAXIMIZE, true, 2.0e-6);
        assertFalse(first.hashCode() == second.hashCode());
    }
}
