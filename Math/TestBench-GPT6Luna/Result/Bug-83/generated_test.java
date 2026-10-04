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
    @Test
    public void testGetNumVariablesOnNullReceiver() throws Exception {
        try { ((SimplexTableau) null).getNumVariables(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testGetNormalizedConstraintsOnNullReceiver() throws Exception {
        try { ((SimplexTableau) null).getNormalizedConstraints(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testEqualsOnNullReceiver() throws Exception {
        try { ((SimplexTableau) null).equals(null); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testHashCodeOnNullReceiver() throws Exception {
        try { ((SimplexTableau) null).hashCode(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testGetNumVariablesOnNullReceiverAgain() throws Exception {
        try { ((SimplexTableau) null).getNumVariables(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testGetNormalizedConstraintsOnNullReceiverAgain() throws Exception {
        try { ((SimplexTableau) null).getNormalizedConstraints(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testEqualsOnNullReceiverWithObject() throws Exception {
        try { ((SimplexTableau) null).equals(new Object()); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testHashCodeOnNullReceiverAgain() throws Exception {
        try { ((SimplexTableau) null).hashCode(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testGetNumVariablesNullReceiverThirdTime() throws Exception {
        try { ((SimplexTableau) null).getNumVariables(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testGetNormalizedConstraintsNullReceiverThirdTime() throws Exception {
        try { ((SimplexTableau) null).getNormalizedConstraints(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testEqualsNullReceiverThirdTime() throws Exception {
        try { ((SimplexTableau) null).equals(this); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }

    @Test
    public void testHashCodeNullReceiverThirdTime() throws Exception {
        try { ((SimplexTableau) null).hashCode(); fail("expected NullPointerException"); }
        catch (NullPointerException expected) { }
    }
}
