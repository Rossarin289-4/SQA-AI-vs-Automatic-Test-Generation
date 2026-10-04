package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.util.MathUtils;

public class SimplexSolverTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConfiguredMaximumWithNoConstraints() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 3.0 }, 0.0);
        RealPointValuePair result = solver.optimize(objective,
                java.util.Collections.<LinearConstraint>emptyList(),
                org.apache.commons.math.optimization.GoalType.MAXIMIZE, true);
        assertEquals(0.0, result.getValue(), 0.0);
        assertEquals(0.0, result.getPoint()[0], 0.0);
    }

    @Test
    public void testMinimumWithNonnegativeVariable() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 2.0 }, 1.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Collections.singletonList(
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.GEQ, 4.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MINIMIZE, true);
        assertEquals(9.0, result.getValue(), 1e-9);
        assertEquals(4.0, result.getPoint()[0], 1e-9);
    }

    @Test
    public void testMaximumAtConstraintBoundary() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 5.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Collections.singletonList(
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.LEQ, 7.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MAXIMIZE, true);
        assertEquals(35.0, result.getValue(), 1e-9);
        assertEquals(7.0, result.getPoint()[0], 1e-9);
    }

    @Test
    public void testTwoVariableMaximum() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 3.0, 2.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Arrays.asList(
                        new LinearConstraint(new double[] { 1.0, 1.0 },
                                Relationship.LEQ, 4.0),
                        new LinearConstraint(new double[] { 1.0, 0.0 },
                                Relationship.LEQ, 2.0),
                        new LinearConstraint(new double[] { 0.0, 1.0 },
                                Relationship.LEQ, 3.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MAXIMIZE, true);
        assertEquals(10.0, result.getValue(), 1e-9);
        assertEquals(2.0, result.getPoint()[0], 1e-9);
        assertEquals(2.0, result.getPoint()[1], 1e-9);
    }

    @Test
    public void testNegativeRightHandSideConstraint() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Collections.singletonList(
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.GEQ, -3.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MINIMIZE, true);
        assertEquals(0.0, result.getValue(), 1e-9);
        assertEquals(0.0, result.getPoint()[0], 1e-9);
    }

    @Test
    public void testUnrestrictedVariableCanBeNegative() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Collections.singletonList(
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.GEQ, -2.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MINIMIZE, false);
        assertEquals(-2.0, result.getValue(), 1e-9);
        assertEquals(-2.0, result.getPoint()[0], 1e-9);
    }

    @Test
    public void testEqualityConstraint() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 2.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Collections.singletonList(
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.EQ, 3.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MAXIMIZE, true);
        assertEquals(6.0, result.getValue(), 1e-9);
        assertEquals(3.0, result.getPoint()[0], 1e-9);
    }

    @Test
    public void testArtificialVariablePhaseOneFeasibleCase() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Collections.singletonList(
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.EQ, 2.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MINIMIZE, true);
        assertEquals(2.0, result.getValue(), 1e-9);
        assertEquals(2.0, result.getPoint()[0], 1e-9);
    }

    @Test
    public void testMinimizeAtZeroBoundary() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 4.0 }, 6.0);
        RealPointValuePair result = solver.optimize(objective,
                java.util.Collections.<LinearConstraint>emptyList(),
                org.apache.commons.math.optimization.GoalType.MINIMIZE, true);
        assertEquals(6.0, result.getValue(), 1e-9);
        assertEquals(0.0, result.getPoint()[0], 1e-9);
    }

    @Test
    public void testMaximumWithFractionalIntersection() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Arrays.asList(
                        new LinearConstraint(new double[] { 2.0, 1.0 },
                                Relationship.LEQ, 4.0),
                        new LinearConstraint(new double[] { 1.0, 2.0 },
                                Relationship.LEQ, 4.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MAXIMIZE, true);
        assertEquals(8.0 / 3.0, result.getValue(), 1e-9);
        assertEquals(4.0 / 3.0, result.getPoint()[0], 1e-9);
        assertEquals(4.0 / 3.0, result.getPoint()[1], 1e-9);
    }

    @Test
    public void testZeroObjectiveHasZeroValue() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 0.0 }, 5.0);
        RealPointValuePair result = solver.optimize(objective,
                java.util.Collections.<LinearConstraint>emptyList(),
                org.apache.commons.math.optimization.GoalType.MAXIMIZE, true);
        assertEquals(5.0, result.getValue(), 0.0);
        assertEquals(0.0, result.getPoint()[0], 0.0);
    }

    @Test
    public void testTightConstraintIsUsed() throws Exception {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction objective =
                new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        java.util.Collection<LinearConstraint> constraints =
                java.util.Arrays.asList(
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.LEQ, 5.0),
                        new LinearConstraint(new double[] { 1.0 },
                                Relationship.LEQ, 2.0));
        RealPointValuePair result = solver.optimize(objective, constraints,
                org.apache.commons.math.optimization.GoalType.MAXIMIZE, true);
        assertEquals(2.0, result.getValue(), 1e-9);
        assertEquals(2.0, result.getPoint()[0], 1e-9);
    }
}
