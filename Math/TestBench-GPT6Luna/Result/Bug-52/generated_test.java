package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.FastMath;

public class RotationTest {
    @Test
    public void testIdentityQuaternionAndAngle() throws Exception {
        assertEquals(1.0, Rotation.IDENTITY.getQ0(), 0.0);
        assertEquals(0.0, Rotation.IDENTITY.getQ1(), 0.0);
        assertEquals(0.0, Rotation.IDENTITY.getQ2(), 0.0);
        assertEquals(0.0, Rotation.IDENTITY.getQ3(), 0.0);
        assertEquals(0.0, Rotation.IDENTITY.getAngle(), 0.0);
    }

    @Test
    public void testIdentityAxisAndMatrix() throws Exception {
        Vector3D axis = Rotation.IDENTITY.getAxis();
        assertEquals(1.0, axis.getX(), 0.0);
        assertEquals(0.0, axis.getY(), 0.0);
        assertEquals(0.0, axis.getZ(), 0.0);
        double[][] matrix = Rotation.IDENTITY.getMatrix();
        assertEquals(1.0, matrix[0][0], 0.0);
        assertEquals(1.0, matrix[1][1], 0.0);
        assertEquals(1.0, matrix[2][2], 0.0);
        assertEquals(0.0, matrix[0][1], 0.0);
    }

    @Test
    public void testAxisAngleRotationOfQuarterTurn() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_K, FastMath.PI / 2.0);
        Vector3D v = r.applyTo(Vector3D.PLUS_I);
        assertEquals(0.0, v.getX(), 1e-12);
        assertEquals(1.0, v.getY(), 1e-12);
        assertEquals(0.0, v.getZ(), 1e-12);
        assertEquals(FastMath.PI / 2.0, r.getAngle(), 1e-12);
    }

    @Test
    public void testAxisAngleQuaternionComponents() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_K, FastMath.PI);
        assertEquals(0.0, r.getQ0(), 1e-12);
        assertEquals(0.0, r.getQ1(), 0.0);
        assertEquals(0.0, r.getQ2(), 0.0);
        assertEquals(-1.0, r.getQ3(), 1e-12);
    }

    @Test
    public void testInverseVectorApplication() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_K, FastMath.PI / 2.0);
        Vector3D v = r.applyTo(Vector3D.PLUS_I);
        Vector3D back = r.applyInverseTo(v);
        assertEquals(1.0, back.getX(), 1e-12);
        assertEquals(0.0, back.getY(), 1e-12);
        assertEquals(0.0, back.getZ(), 1e-12);
    }

    @Test
    public void testRevertUndoesRotation() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_J, 0.7);
        Vector3D v = new Vector3D(2.0, -1.0, 3.0);
        Vector3D back = r.revert().applyTo(r.applyTo(v));
        assertEquals(v.getX(), back.getX(), 1e-12);
        assertEquals(v.getY(), back.getY(), 1e-12);
        assertEquals(v.getZ(), back.getZ(), 1e-12);
    }

    @Test
    public void testRevertQuaternionConvention() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_I, 0.6);
        Rotation inverse = r.revert();
        assertEquals(-r.getQ0(), inverse.getQ0(), 0.0);
        assertEquals(r.getQ1(), inverse.getQ1(), 0.0);
        assertEquals(r.getQ2(), inverse.getQ2(), 0.0);
        assertEquals(r.getQ3(), inverse.getQ3(), 0.0);
    }

    @Test
    public void testApplyRotationComposition() throws Exception {
        Rotation first = new Rotation(Vector3D.PLUS_K, 0.4);
        Rotation second = new Rotation(Vector3D.PLUS_I, -0.3);
        Vector3D v = new Vector3D(1.0, 2.0, -1.0);
        Vector3D composed = first.applyTo(second).applyTo(v);
        Vector3D sequential = first.applyTo(second.applyTo(v));
        assertEquals(sequential.getX(), composed.getX(), 1e-12);
        assertEquals(sequential.getY(), composed.getY(), 1e-12);
        assertEquals(sequential.getZ(), composed.getZ(), 1e-12);
    }

    @Test
    public void testApplyInverseRotationComposition() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_K, 0.8);
        Rotation other = new Rotation(Vector3D.PLUS_I, -0.5);
        Vector3D v = new Vector3D(1.0, 2.0, 3.0);
        Vector3D viaComposition = r.applyInverseTo(other).applyTo(v);
        Vector3D sequential = r.applyInverseTo(other.applyTo(v));
        assertEquals(sequential.getX(), viaComposition.getX(), 1e-12);
        assertEquals(sequential.getY(), viaComposition.getY(), 1e-12);
        assertEquals(sequential.getZ(), viaComposition.getZ(), 1e-12);
    }

    @Test
    public void testDistanceOfSameRotationIsZero() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_J, 1.1);
        assertEquals(0.0, Rotation.distance(r, r), 1e-12);
    }

    @Test
    public void testDistanceToIdentityEqualsAngle() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_K, 0.9);
        assertEquals(r.getAngle(), Rotation.distance(Rotation.IDENTITY, r), 1e-12);
    }

    @Test
    public void testCardanAnglesRoundTripXYZ() throws Exception {
        Rotation r = new Rotation(RotationOrder.XYZ, 0.2, -0.3, 0.4);
        double[] angles = r.getAngles(RotationOrder.XYZ);
        assertEquals(0.2, angles[0], 1e-12);
        assertEquals(-0.3, angles[1], 1e-12);
        assertEquals(0.4, angles[2], 1e-12);
    }

    @Test
    public void testEulerAnglesRoundTripZXZ() throws Exception {
        Rotation r = new Rotation(RotationOrder.ZXZ, 0.2, 0.8, -0.4);
        double[] angles = r.getAngles(RotationOrder.ZXZ);
        assertEquals(0.2, angles[0], 1e-12);
        assertEquals(0.8, angles[1], 1e-12);
        assertEquals(-0.4, angles[2], 1e-12);
    }

    @Test
    public void testCardanSingularityAtQuarterTurn() throws Exception {
        Rotation r = new Rotation(RotationOrder.XYZ, 0.1, FastMath.PI / 2.0, 0.2);
        try {
            r.getAngles(RotationOrder.XYZ);
            fail("expected CardanEulerSingularityException");
        } catch (CardanEulerSingularityException expected) {
            assertEquals(true, true);
        }
    }

    @Test
    public void testMatrixConstructorIdentity() throws Exception {
        double[][] matrix = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        Rotation r = new Rotation(matrix, 1e-12);
        assertEquals(1.0, r.getQ0(), 1e-12);
        assertEquals(0.0, r.getQ1(), 1e-12);
        assertEquals(0.0, r.getQ2(), 1e-12);
        assertEquals(0.0, r.getQ3(), 1e-12);
    }

    @Test
    public void testMatrixConstructorQuarterTurn() throws Exception {
        double[][] matrix = {
            {0.0, -1.0, 0.0},
            {1.0, 0.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        Rotation r = new Rotation(matrix, 1e-12);
        Vector3D v = r.applyTo(Vector3D.PLUS_I);
        assertEquals(0.0, v.getX(), 1e-12);
        assertEquals(1.0, v.getY(), 1e-12);
        assertEquals(0.0, v.getZ(), 1e-12);
    }

    @Test
    public void testPairVectorConstructorMapsBasis() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_I, Vector3D.PLUS_J,
                                 Vector3D.PLUS_J, Vector3D.MINUS_I);
        Vector3D image = r.applyTo(Vector3D.PLUS_I);
        assertEquals(0.0, image.getX(), 1e-12);
        assertEquals(1.0, image.getY(), 1e-12);
        assertEquals(0.0, image.getZ(), 1e-12);
    }

    @Test
    public void testTwoVectorConstructorMapsDirection() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_I, Vector3D.PLUS_J);
        Vector3D image = r.applyTo(Vector3D.PLUS_I);
        assertEquals(0.0, image.getX(), 1e-12);
        assertEquals(1.0, image.getY(), 1e-12);
        assertEquals(0.0, image.getZ(), 1e-12);
    }

    @Test
    public void testOppositeVectorConstructorUsesHalfTurn() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_I, Vector3D.MINUS_I);
        Vector3D image = r.applyTo(Vector3D.PLUS_I);
        assertEquals(-1.0, image.getX(), 1e-12);
        assertEquals(0.0, image.getY(), 1e-12);
        assertEquals(0.0, image.getZ(), 1e-12);
        assertEquals(FastMath.PI, r.getAngle(), 1e-12);
    }

    @Test
    public void testNormalizedQuaternionConstructor() throws Exception {
        Rotation r = new Rotation(2.0, 0.0, 0.0, 0.0, true);
        assertEquals(1.0, r.getQ0(), 0.0);
        assertEquals(0.0, r.getQ1(), 0.0);
        assertEquals(0.0, r.getQ2(), 0.0);
        assertEquals(0.0, r.getQ3(), 0.0);
    }

    @Test
    public void testUnnormalizedQuaternionMatrixFormula() throws Exception {
        Rotation r = new Rotation(2.0, 0.0, 0.0, 0.0, false);
        double[][] matrix = r.getMatrix();
        assertEquals(7.0, matrix[0][0], 0.0);
        assertEquals(7.0, matrix[1][1], 0.0);
        assertEquals(7.0, matrix[2][2], 0.0);
    }

    @Test
    public void testNegativeScalarAxisConvention() throws Exception {
        Rotation r = new Rotation(-0.5, 0.0, 0.0, -Math.sqrt(0.75), false);
        Vector3D axis = r.getAxis();
        assertEquals(0.0, axis.getX(), 1e-12);
        assertEquals(0.0, axis.getY(), 1e-12);
        assertEquals(-1.0, axis.getZ(), 1e-12);
        assertEquals(2.0 * FastMath.acos(0.5), r.getAngle(), 1e-12);
    }

    @Test
    public void testGeneralRotationMatrixMatchesAppliedBasis() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_J, 0.7);
        double[][] m = r.getMatrix();
        Vector3D image = r.applyTo(Vector3D.PLUS_I);
        assertEquals(m[0][0], image.getX(), 1e-12);
        assertEquals(m[1][0], image.getY(), 1e-12);
        assertEquals(m[2][0], image.getZ(), 1e-12);
    }

    @Test
    public void testQuarterTurnMatrixEntries() throws Exception {
        double[][] m = new Rotation(Vector3D.PLUS_K, FastMath.PI / 2.0).getMatrix();
        assertEquals(0.0, m[0][0], 1e-12);
        assertEquals(-1.0, m[0][1], 1e-12);
        assertEquals(1.0, m[1][0], 1e-12);
        assertEquals(1.0, m[2][2], 1e-12);
    }

    @Test
    public void testZeroAngleAxisDefaultsToPositiveX() throws Exception {
        Rotation r = new Rotation(Vector3D.PLUS_K, 0.0);
        Vector3D axis = r.getAxis();
        assertEquals(1.0, axis.getX(), 0.0);
        assertEquals(0.0, axis.getY(), 0.0);
        assertEquals(0.0, axis.getZ(), 0.0);
    }
}
