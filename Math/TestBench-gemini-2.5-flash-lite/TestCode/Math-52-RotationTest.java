package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.FastMath;

public class RotationTest {

    // Tolerance for floating-point comparisons
    private static final double EPSILON = 1e-15;

    @Test
    public void testIdentityRotation() throws Exception {
        // Test the identity rotation
        Rotation identity = Rotation.IDENTITY;
        assertEquals(1.0, identity.getQ0(), EPSILON);
        assertEquals(0.0, identity.getQ1(), EPSILON);
        assertEquals(0.0, identity.getQ2(), EPSILON);
        assertEquals(0.0, identity.getQ3(), EPSILON);
        assertEquals(0.0, identity.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), identity.getAxis());
        assertEquals(new Vector3D(1.0, 0.0, 0.0), identity.applyTo(new Vector3D(1.0, 0.0, 0.0)));
        assertEquals(new Vector3D(0.0, 1.0, 0.0), identity.applyTo(new Vector3D(0.0, 1.0, 0.0)));
        assertEquals(new Vector3D(0.0, 0.0, 1.0), identity.applyTo(new Vector3D(0.0, 0.0, 1.0)));
    }

    @Test
    public void testRotationConstructorAxisAngle() throws Exception {
        // Test rotation around X-axis by PI/2
        Rotation rotX = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        // Quaternion for this rotation should be {cos(PI/4), sin(PI/4), 0, 0} = {sqrt(2)/2, sqrt(2)/2, 0, 0}
        double expectedQ0 = FastMath.sqrt(2.0) / 2.0;
        double expectedQ1 = FastMath.sqrt(2.0) / 2.0;
        assertEquals(expectedQ0, rotX.getQ0(), EPSILON);
        assertEquals(expectedQ1, rotX.getQ1(), EPSILON);
        assertEquals(0.0, rotX.getQ2(), EPSILON);
        assertEquals(0.0, rotX.getQ3(), EPSILON);
        assertEquals(FastMath.PI / 2.0, rotX.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), rotX.getAxis());
        // Apply to Y, should result in Z
        assertEquals(new Vector3D(0.0, 0.0, 1.0), rotX.applyTo(new Vector3D(0.0, 1.0, 0.0)));
        // Apply to Z, should result in -Y
        assertEquals(new Vector3D(0.0, -1.0, 0.0), rotX.applyTo(new Vector3D(0.0, 0.0, 1.0)));
    }

    @Test
    public void testRotationConstructorAxisAngleNegativeAngle() throws Exception {
        // Test rotation around Y-axis by -PI/2
        Rotation rotY = new Rotation(new Vector3D(0.0, 1.0, 0.0), -FastMath.PI / 2.0);
        // Quaternion for this rotation should be {cos(PI/4), 0, sin(PI/4), 0} = {sqrt(2)/2, 0, sqrt(2)/2, 0}
        double expectedQ0 = FastMath.sqrt(2.0) / 2.0;
        double expectedQ1 = FastMath.sqrt(2.0) / 2.0;
        assertEquals(expectedQ0, rotY.getQ0(), EPSILON);
        assertEquals(0.0, rotY.getQ1(), EPSILON);
        assertEquals(expectedQ1, rotY.getQ2(), EPSILON);
        assertEquals(0.0, rotY.getQ3(), EPSILON);
        assertEquals(FastMath.PI / 2.0, rotY.getAngle(), EPSILON); // Angle is always positive
        assertEquals(new Vector3D(0.0, 1.0, 0.0), rotY.getAxis());
        // Apply to X, should result in -Z
        assertEquals(new Vector3D(0.0, 0.0, -1.0), rotY.applyTo(new Vector3D(1.0, 0.0, 0.0)));
        // Apply to Z, should result in X
        assertEquals(new Vector3D(1.0, 0.0, 0.0), rotY.applyTo(new Vector3D(0.0, 0.0, 1.0)));
    }

    @Test
    public void testRotationConstructorQuaternionNormalized() throws Exception {
        // Test a rotation with normalized quaternion directly
        // Corresponds to a PI/2 rotation around Z axis
        double q0 = FastMath.cos(FastMath.PI / 4.0);
        double q3 = FastMath.sin(FastMath.PI / 4.0);
        Rotation rotZ = new Rotation(q0, 0.0, 0.0, q3, false);
        assertEquals(q0, rotZ.getQ0(), EPSILON);
        assertEquals(0.0, rotZ.getQ1(), EPSILON);
        assertEquals(0.0, rotZ.getQ2(), EPSILON);
        assertEquals(q3, rotZ.getQ3(), EPSILON);
        assertEquals(FastMath.PI / 2.0, rotZ.getAngle(), EPSILON);
        assertEquals(new Vector3D(0.0, 0.0, 1.0), rotZ.getAxis());
        // Apply to X, should result in Y
        assertEquals(new Vector3D(0.0, 1.0, 0.0), rotZ.applyTo(new Vector3D(1.0, 0.0, 0.0)));
        // Apply to Y, should result in -X
        assertEquals(new Vector3D(-1.0, 0.0, 0.0), rotZ.applyTo(new Vector3D(0.0, 1.0, 0.0)));
    }

    @Test
    public void testRotationConstructorQuaternionNeedsNormalization() throws Exception {
        // Test a rotation with unnormalized quaternion
        // Should be normalized to a PI/2 rotation around Z axis
        double factor = 5.0;
        double q0 = factor * FastMath.cos(FastMath.PI / 4.0);
        double q3 = factor * FastMath.sin(FastMath.PI / 4.0);
        Rotation rotZ = new Rotation(q0, 0.0, 0.0, q3, true);
        double expectedQ0 = FastMath.cos(FastMath.PI / 4.0);
        double expectedQ3 = FastMath.sin(FastMath.PI / 4.0);
        assertEquals(expectedQ0, rotZ.getQ0(), EPSILON);
        assertEquals(0.0, rotZ.getQ1(), EPSILON);
        assertEquals(0.0, rotZ.getQ2(), EPSILON);
        assertEquals(expectedQ3, rotZ.getQ3(), EPSILON);
        assertEquals(FastMath.PI / 2.0, rotZ.getAngle(), EPSILON);
        assertEquals(new Vector3D(0.0, 0.0, 1.0), rotZ.getAxis());
    }

    @Test
    public void testRevertRotation() throws Exception {
        Rotation original = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 4.0);
        Rotation reverted = original.revert();

        // The reverted rotation should have the opposite angle and the same axis
        assertEquals(original.getAxis(), reverted.getAxis());
        assertEquals(original.getAngle(), reverted.getAngle(), EPSILON); // Angle is always positive

        // Reverting the reverted rotation should give the original one
        Rotation revertedReverted = reverted.revert();
        assertEquals(original.getQ0(), revertedReverted.getQ0(), EPSILON);
        assertEquals(original.getQ1(), revertedReverted.getQ1(), EPSILON);
        assertEquals(original.getQ2(), revertedReverted.getQ2(), EPSILON);
        assertEquals(original.getQ3(), revertedReverted.getQ3(), EPSILON);

        // Check that applying original then reverted results in identity
        // The comparison needs to use getAngle() and getAxis() or check with a small tolerance
        Rotation identity = original.applyTo(reverted);
        assertEquals(0.0, identity.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), identity.getAxis());
    }

    @Test
    public void testApplyToVector() throws Exception {
        Rotation rot = new Rotation(new Vector3D(0.0, 0.0, 1.0), FastMath.PI / 2.0);
        Vector3D original = new Vector3D(1.0, 0.0, 0.0);
        Vector3D transformed = rot.applyTo(original);
        // Applying PI/2 rotation around Z to (1,0,0) should yield (0,1,0)
        assertEquals(new Vector3D(0.0, 1.0, 0.0), transformed);

        // Applying again should yield (-1,0,0)
        assertEquals(new Vector3D(-1.0, 0.0, 0.0), rot.applyTo(transformed));
    }

    @Test
    public void testApplyInverseToVector() throws Exception {
        Rotation rot = new Rotation(new Vector3D(0.0, 0.0, 1.0), FastMath.PI / 2.0);
        Vector3D original = new Vector3D(0.0, 1.0, 0.0);
        Vector3D transformed = rot.applyInverseTo(original);
        // Applying inverse PI/2 rotation around Z to (0,1,0) should yield (1,0,0)
        assertEquals(new Vector3D(1.0, 0.0, 0.0), transformed);
    }

    @Test
    public void testApplyToRotation() throws Exception {
        Rotation r1 = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        Rotation r2 = new Rotation(new Vector3D(0.0, 1.0, 0.0), FastMath.PI / 2.0);
        Rotation r12 = r1.applyTo(r2);

        // For non-commuting rotations, r12 should not be equal to r21
        Rotation r21 = r2.applyTo(r1);
        assertFalse(r12.equals(r21));

        // Check composition of r1 and r2 applied to a vector
        Vector3D v = new Vector3D(1.0, 0.0, 0.0);
        // r2(v) = (1,0,0) since r2 rotates around Y
        // r1(r2(v)) = r1(1,0,0) = (1,0,0) since r1 rotates around X
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r12.applyTo(v));
    }

    @Test
    public void testApplyInverseToRotation() throws Exception {
        Rotation r1 = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        Rotation r1Inv = r1.revert();
        Rotation r1Inv_r1 = r1Inv.applyTo(r1);
        assertEquals(0.0, r1Inv_r1.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r1Inv_r1.getAxis());

        Rotation r1_r1Inv = r1.applyTo(r1Inv);
        assertEquals(0.0, r1_r1Inv.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r1_r1Inv.getAxis());

        Rotation r2 = r1.applyInverseTo(Rotation.IDENTITY);
        assertEquals(r1.revert(), r2);
    }

    @Test
    public void testGetMatrix() throws Exception {
        Rotation rot = new Rotation(new Vector3D(0.0, 0.0, 1.0), FastMath.PI / 2.0);
        double[][] matrix = rot.getMatrix();

        // Expected matrix for PI/2 rotation around Z:
        // [[0, -1, 0],
        //  [1,  0, 0],
        //  [0,  0, 1]]
        assertEquals(0.0, matrix[0][0], EPSILON);
        assertEquals(-1.0, matrix[0][1], EPSILON);
        assertEquals(0.0, matrix[0][2], EPSILON);

        assertEquals(1.0, matrix[1][0], EPSILON);
        assertEquals(0.0, matrix[1][1], EPSILON);
        assertEquals(0.0, matrix[1][2], EPSILON);

        assertEquals(0.0, matrix[2][0], EPSILON);
        assertEquals(0.0, matrix[2][1], EPSILON);
        assertEquals(1.0, matrix[2][2], EPSILON);

        // Test with identity
        double[][] identityMatrix = Rotation.IDENTITY.getMatrix();
        assertEquals(1.0, identityMatrix[0][0], EPSILON);
        assertEquals(0.0, identityMatrix[0][1], EPSILON);
        assertEquals(0.0, identityMatrix[0][2], EPSILON);
        assertEquals(0.0, identityMatrix[1][0], EPSILON);
        assertEquals(1.0, identityMatrix[1][1], EPSILON);
        assertEquals(0.0, identityMatrix[1][2], EPSILON);
        assertEquals(0.0, identityMatrix[2][0], EPSILON);
        assertEquals(0.0, identityMatrix[2][1], EPSILON);
        assertEquals(1.0, identityMatrix[2][2], EPSILON);
    }

    @Test
    public void testGetAnglesXYZ() throws Exception {
        // Test Cardan angles for XYZ order
        RotationOrder order = RotationOrder.XYZ;
        // Create a rotation: PI/4 around X, then PI/3 around Y, then PI/2 around Z
        Rotation rot = new Rotation(order, FastMath.PI / 4.0, FastMath.PI / 3.0, FastMath.PI / 2.0);
        double[] angles = rot.getAngles(order);

        // Verify that constructing a new rotation with these angles yields the same rotation
        Rotation reconstructedRot = new Rotation(order, angles[0], angles[1], angles[2]);
        assertEquals(rot.getQ0(), reconstructedRot.getQ0(), EPSILON);
        assertEquals(rot.getQ1(), reconstructedRot.getQ1(), EPSILON);
        assertEquals(rot.getQ2(), reconstructedRot.getQ2(), EPSILON);
        assertEquals(rot.getQ3(), reconstructedRot.getQ3(), EPSILON);

        // Specific check for a known rotation: PI/2 rotation around Z axis
        Rotation rotZ = new Rotation(new Vector3D(0.0, 0.0, 1.0), FastMath.PI / 2.0);
        double[] anglesZ = rotZ.getAngles(order);
        // The reference implementation for XYZ with PI/2 Z rotation results in:
        // alpha1 = 0
        // alpha2 = 0
        // alpha3 = -PI/2
        assertEquals(0.0, anglesZ[0], EPSILON);
        assertEquals(0.0, anglesZ[1], EPSILON);
        assertEquals(-FastMath.PI / 2.0, anglesZ[2], EPSILON);
    }

    @Test
    public void testGetAnglesZYX() throws Exception {
        // Test Cardan angles for ZYX order
        RotationOrder order = RotationOrder.ZYX;
        Rotation rot = new Rotation(order, FastMath.PI / 4.0, FastMath.PI / 3.0, FastMath.PI / 2.0);
        double[] angles = rot.getAngles(order);

        // Verify that constructing a new rotation with these angles yields the same rotation
        Rotation reconstructedRot = new Rotation(order, angles[0], angles[1], angles[2]);
        assertEquals(rot.getQ0(), reconstructedRot.getQ0(), EPSILON);
        assertEquals(rot.getQ1(), reconstructedRot.getQ1(), EPSILON);
        assertEquals(rot.getQ2(), reconstructedRot.getQ2(), EPSILON);
        assertEquals(rot.getQ3(), reconstructedRot.getQ3(), EPSILON);

        // Specific check for a known rotation: PI/2 rotation around X axis
        Rotation rotX = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        double[] anglesX = rotX.getAngles(order);
        // The reference implementation for ZYX with PI/2 X rotation results in:
        // alpha1 = 0
        // alpha2 = 0
        // alpha3 = PI/2
        assertEquals(0.0, anglesX[0], EPSILON);
        assertEquals(0.0, anglesX[1], EPSILON);
        assertEquals(FastMath.PI / 2.0, anglesX[2], EPSILON);
    }

    @Test
    public void testGetAnglesXYX() throws Exception {
        // Test Euler angles for XYX order
        RotationOrder order = RotationOrder.XYX;
        Rotation rot = new Rotation(order, FastMath.PI / 4.0, FastMath.PI / 3.0, FastMath.PI / 2.0);
        double[] angles = rot.getAngles(order);

        // Verify that constructing a new rotation with these angles yields the same rotation
        Rotation reconstructedRot = new Rotation(order, angles[0], angles[1], angles[2]);
        assertEquals(rot.getQ0(), reconstructedRot.getQ0(), EPSILON);
        assertEquals(rot.getQ1(), reconstructedRot.getQ1(), EPSILON);
        assertEquals(rot.getQ2(), reconstructedRot.getQ2(), EPSILON);
        assertEquals(rot.getQ3(), reconstructedRot.getQ3(), EPSILON);

        // Specific check for a known rotation: PI/2 rotation around Y axis
        Rotation rotY = new Rotation(new Vector3D(0.0, 1.0, 0.0), FastMath.PI / 2.0);
        double[] anglesY = rotY.getAngles(order);
        // The reference implementation for XYX with PI/2 Y rotation results in:
        // alpha1 = 0
        // alpha2 = PI/2
        // alpha3 = PI
        assertEquals(0.0, anglesY[0], EPSILON);
        assertEquals(FastMath.PI / 2.0, anglesY[1], EPSILON);
        assertEquals(FastMath.PI, anglesY[2], EPSILON);
    }

    @Test
    public void testGetAnglesZXZ() throws Exception {
        // Test Euler angles for ZXZ order
        RotationOrder order = RotationOrder.ZXZ;
        Rotation rot = new Rotation(order, FastMath.PI / 4.0, FastMath.PI / 3.0, FastMath.PI / 2.0);
        double[] angles = rot.getAngles(order);

        // Verify that constructing a new rotation with these angles yields the same rotation
        Rotation reconstructedRot = new Rotation(order, angles[0], angles[1], angles[2]);
        assertEquals(rot.getQ0(), reconstructedRot.getQ0(), EPSILON);
        assertEquals(rot.getQ1(), reconstructedRot.getQ1(), EPSILON);
        assertEquals(rot.getQ2(), reconstructedRot.getQ2(), EPSILON);
        assertEquals(rot.getQ3(), reconstructedRot.getQ3(), EPSILON);

        // Specific check for a known rotation: PI/2 rotation around X axis
        Rotation rotX = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        double[] anglesX = rotX.getAngles(order);
        // The reference implementation for ZXZ with PI/2 X rotation results in:
        // alpha1 = 0
        // alpha2 = PI/2
        // alpha3 = 0
        assertEquals(0.0, anglesX[0], EPSILON);
        assertEquals(FastMath.PI / 2.0, anglesX[1], EPSILON);
        assertEquals(0.0, anglesX[2], EPSILON);
    }

    @Test
    public void testGetAnglesZYXSingularity() {
        // Test for singularity in ZYX order
        RotationOrder order = RotationOrder.ZYX;
        // For ZYX, singularity occurs when the second angle is +/- PI/2
        // Rotation around Y by PI/2
        Rotation rotY = new Rotation(new Vector3D(0.0, 1.0, 0.0), FastMath.PI / 2.0);
        try {
            rotY.getAngles(order);
            fail("Expected CardanEulerSingularityException for ZYX order with angle PI/2");
        } catch (CardanEulerSingularityException e) {
            // Expected exception
        }
    }

    @Test
    public void testGetAnglesXYXSingularity() {
        // Test for singularity in XYX order
        RotationOrder order = RotationOrder.XYX;
        // For XYX, singularity occurs when the second angle is 0 or PI.
        // Rotation around X by PI
        Rotation rotX = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI);
        try {
            rotX.getAngles(order);
            fail("Expected CardanEulerSingularityException for XYX order with angle PI");
        } catch (CardanEulerSingularityException e) {
            // Expected exception
        }
    }

    @Test
    public void testDistanceIdentity() {
        Rotation r1 = Rotation.IDENTITY;
        Rotation r2 = Rotation.IDENTITY;
        assertEquals(0.0, Rotation.distance(r1, r2), EPSILON);
    }

    @Test
    public void testDistanceSameRotation() {
        Rotation r1 = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 4.0);
        Rotation r2 = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 4.0);
        assertEquals(0.0, Rotation.distance(r1, r2), EPSILON);
    }

    @Test
    public void testDistanceOppositeRotation() {
        Rotation r1 = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 4.0);
        Rotation r2 = r1.revert();
        // distance(r1, r2) = r1.applyInverseTo(r2).getAngle()
        // r1.applyInverseTo(r2) = r1.applyInverseTo(r1.revert()) which should be identity rotation
        Rotation diff = r1.applyInverseTo(r2);
        assertEquals(0.0, diff.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), diff.getAxis());
    }

    @Test
    public void testDistanceBetweenDifferentRotations() {
        Rotation r1 = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        Rotation r2 = new Rotation(new Vector3D(0.0, 1.0, 0.0), FastMath.PI / 2.0);
        // distance(r1, r2) = r1.applyInverseTo(r2).getAngle()
        Rotation diff = r1.applyInverseTo(r2);
        assertEquals(Rotation.distance(r1, r2), diff.getAngle(), EPSILON);
    }

    @Test
    public void testRotationConstructorFromTwoVectors() {
        Vector3D u = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v = new Vector3D(0.0, 1.0, 0.0);
        Rotation rot = new Rotation(u, v);
        // This should be a rotation by PI/2 around Z
        assertEquals(new Vector3D(0.0, 0.0, 1.0), rot.getAxis());
        assertEquals(FastMath.PI / 2.0, rot.getAngle(), EPSILON);
        assertEquals(v, rot.applyTo(u));
    }

    @Test
    public void testRotationConstructorFromTwoVectorsCollinear() {
        Vector3D u = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v = new Vector3D(2.0, 0.0, 0.0); // Collinear
        Rotation rot = new Rotation(u, v);
        // For collinear vectors with same direction, it should be identity.
        assertEquals(0.0, rot.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), rot.getAxis());
        assertEquals(v, rot.applyTo(u));
    }

    @Test
    public void testRotationConstructorFromTwoVectorsOppositeCollinear() {
        Vector3D u = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v = new Vector3D(-1.0, 0.0, 0.0); // Opposite collinear
        Rotation rot = new Rotation(u, v);
        // The code handles this as a special case for PI angle rotation.
        assertEquals(FastMath.PI, rot.getAngle(), EPSILON);
        // Axis should be orthogonal to u, e.g. (0,1,0)
        assertEquals(new Vector3D(0.0, 1.0, 0.0), rot.getAxis());
        assertEquals(v, rot.applyTo(u)); // Should be opposite direction
    }

    @Test
    public void testRotationConstructorFromThreeVectors() {
        Vector3D u1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D u2 = new Vector3D(0.0, 1.0, 0.0);
        Vector3D v1 = new Vector3D(0.0, 1.0, 0.0);
        Vector3D v2 = new Vector3D(-1.0, 0.0, 0.0);
        Rotation rot = new Rotation(u1, u2, v1, v2);
        // This should be a rotation by PI/2 around Z
        assertEquals(new Vector3D(0.0, 0.0, 1.0), rot.getAxis());
        assertEquals(FastMath.PI / 2.0, rot.getAngle(), EPSILON);
        assertEquals(v1, rot.applyTo(u1));
        assertEquals(v2, rot.applyTo(u2));
    }


    @Test
    public void testRotationConstructorFromMatrix() throws NotARotationMatrixException {
        // Identity matrix
        double[][] idMatrix = {{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        Rotation rotId = new Rotation(idMatrix, EPSILON);
        assertEquals(0.0, rotId.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), rotId.getAxis());

        // Rotation matrix for PI/2 around Z
        double[][] rotZMatrix = {{0.0, -1.0, 0.0}, {1.0, 0.0, 0.0}, {0.0, 0.0, 1.0}};
        Rotation rotZ = new Rotation(rotZMatrix, EPSILON);
        assertEquals(new Vector3D(0.0, 0.0, 1.0), rotZ.getAxis());
        assertEquals(FastMath.PI / 2.0, rotZ.getAngle(), EPSILON);
        assertEquals(new Vector3D(0.0, 1.0, 0.0), rotZ.applyTo(new Vector3D(1.0, 0.0, 0.0)));
    }

    @Test
    public void testRotationConstructorFromMatrixNearSingularity() throws NotARotationMatrixException {
        // Matrix very close to identity
        double[][] nearlyIdMatrix = {{1.0 - 1e-10, 0.0, 0.0}, {0.0, 1.0 - 1e-10, 0.0}, {0.0, 0.0, 1.0 - 1e-10}};
        Rotation rot = new Rotation(nearlyIdMatrix, 1e-9);
        assertEquals(0.0, rot.getAngle(), 1e-5); // Should be close to identity
        assertEquals(new Vector3D(1.0, 0.0, 0.0), rot.getAxis());
    }

    @Test
    public void testRotationConstructorFromMatrixSingular() {
        // Matrix that cannot be orthogonalized
        double[][] singularMatrix = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        try {
            new Rotation(singularMatrix, 1e-10);
            fail("Expected NotARotationMatrixException");
        } catch (NotARotationMatrixException e) {
            // Expected
        }
    }

    @Test
    public void testRotationConstructorFromMatrixNegativeDeterminant() {
        // Matrix with negative determinant (a reflection)
        double[][] reflectionMatrix = {{-1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        try {
            new Rotation(reflectionMatrix, EPSILON);
            fail("Expected NotARotationMatrixException for negative determinant");
        } catch (NotARotationMatrixException e) {
            // Expected
        }
    }

    @Test
    public void testGetQ0EdgeCase() {
        // Rotation with q0 close to 1 (identity)
        Rotation r1 = new Rotation(1.0, 1e-15, 0.0, 0.0, false);
        assertEquals(1.0, r1.getQ0(), EPSILON);
        // Rotation with q0 close to -1 (PI rotation)
        Rotation r2 = new Rotation(-1.0, 0.0, 0.0, 0.0, false); // Rotation by PI around X
        assertEquals(-1.0, r2.getQ0(), EPSILON);
    }

    @Test
    public void testGetAngleEdgeCase() {
        // Rotation with angle close to 0 (identity)
        Rotation r1 = new Rotation(1.0, 0.0, 0.0, 0.0, false);
        assertEquals(0.0, r1.getAngle(), EPSILON);
        // Rotation with angle close to PI
        Rotation r2 = new Rotation(0.0, 1.0, 0.0, 0.0, false); // Rotation by PI around X
        assertEquals(FastMath.PI, r2.getAngle(), EPSILON);
    }

    @Test
    public void testGetAxisEdgeCase() {
        // Identity rotation, axis is arbitrary (defaults to +X)
        Rotation r1 = Rotation.IDENTITY;
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r1.getAxis());

        // Rotation where q1, q2, q3 are zero (q0=1 or q0=-1)
        Rotation r2 = new Rotation(1.0, 0.0, 0.0, 0.0, false); // Identity
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r2.getAxis());
        Rotation r3 = new Rotation(-1.0, 0.0, 0.0, 0.0, false); // PI rotation around X
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r3.getAxis());

        // Rotation where q0 is close to zero, but q1, q2, q3 form a unit vector
        Rotation r4 = new Rotation(0.0, 1.0, 0.0, 0.0, false); // PI rotation around X
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r4.getAxis());
    }

    @Test
    public void testApplyToVectorZero() {
        Rotation rot = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        Vector3D zeroVector = Vector3D.ZERO;
        assertEquals(Vector3D.ZERO, rot.applyTo(zeroVector));
        assertEquals(Vector3D.ZERO, rot.applyInverseTo(zeroVector));
    }

    @Test
    public void testApplyToRotationIdentity() {
        Rotation r1 = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 2.0);
        Rotation r2 = Rotation.IDENTITY;
        Rotation r1_r2 = r1.applyTo(r2);
        assertEquals(r1.getAngle(), r1_r2.getAngle(), EPSILON);
        assertEquals(r1.getAxis(), r1_r2.getAxis());

        Rotation r1_inv_r2 = r1.applyInverseTo(r2);
        assertEquals(r1.getAngle(), r1_inv_r2.getAngle(), EPSILON);
        assertEquals(r1.getAxis(), r1_inv_r2.getAxis());
    }

    @Test
    public void testApplyToRotationItself() {
        Rotation r = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 4.0);
        Rotation r2 = r.applyTo(r);
        // This should be a rotation by PI/2 around X
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r2.getAxis());
        assertEquals(FastMath.PI / 2.0, r2.getAngle(), EPSILON);
    }

    @Test
    public void testApplyInverseToRotationItself() {
        Rotation r = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI / 4.0);
        Rotation r2 = r.applyInverseTo(r);
        // This should be the identity rotation
        assertEquals(0.0, r2.getAngle(), EPSILON);
        assertEquals(new Vector3D(1.0, 0.0, 0.0), r2.getAxis());
    }

    @Test
    public void testGetMatrixIdentity() {
        double[][] matrix = Rotation.IDENTITY.getMatrix();
        assertEquals(1.0, matrix[0][0], EPSILON);
        assertEquals(0.0, matrix[0][1], EPSILON);
        assertEquals(0.0, matrix[0][2], EPSILON);
        assertEquals(0.0, matrix[1][0], EPSILON);
        assertEquals(1.0, matrix[1][1], EPSILON);
        assertEquals(0.0, matrix[1][2], EPSILON);
        assertEquals(0.0, matrix[2][0], EPSILON);
        assertEquals(0.0, matrix[2][1], EPSILON);
        assertEquals(1.0, matrix[2][2], EPSILON);
    }

    @Test
    public void testGetMatrixRotationByPi() {
        // Rotation by PI around X axis
        Rotation rot = new Rotation(new Vector3D(1.0, 0.0, 0.0), FastMath.PI);
        double[][] matrix = rot.getMatrix();
        // Expected matrix: [[1, 0, 0], [0, -1, 0], [0, 0, -1]]
        assertEquals(1.0, matrix[0][0], EPSILON);
        assertEquals(0.0, matrix[0][1], EPSILON);
        assertEquals(0.0, matrix[0][2], EPSILON);
        assertEquals(0.0, matrix[1][0], EPSILON);
        assertEquals(-1.0, matrix[1][1], EPSILON);
        assertEquals(0.0, matrix[1][2], EPSILON);
        assertEquals(0.0, matrix[2][0], EPSILON);
        assertEquals(0.0, matrix[2][1], EPSILON);
        assertEquals(-1.0, matrix[2][2], EPSILON);
    }


    @Test
    public void testGetAnglesYZYSingularity() {
        RotationOrder order = RotationOrder.YZY;
        // For YZY, singularity occurs when the second angle (phi) is 0 or PI.
        // Let's try a rotation of PI around Y.
        Rotation rotY = new Rotation(new Vector3D(0.0, 1.0, 0.0), FastMath.PI);
        try {
            rotY.getAngles(order);
            fail("Expected CardanEulerSingularityException for YZY order with angle PI");
        } catch (CardanEulerSingularityException e) {
            // Expected exception
        }
    }

}
