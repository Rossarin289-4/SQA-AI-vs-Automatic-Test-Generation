package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;

public class ArrowTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testBooleanOutcomeIsTrue() throws Exception {
        ArrowType arrow = new ArrowType(null, null, null);
        assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testSubtypeRejectsNonArrow() throws Exception {
        ArrowType arrow = new ArrowType(null, null, null);
        assertFalse(arrow.isSubtype(null));
    }

    @Test
    public void testEquivalentRejectsNonArrow() throws Exception {
        ArrowType arrow = new ArrowType(null, null, null);
        assertFalse(arrow.isEquivalentTo(null));
    }

    @Test
    public void testLeastSupertypeUnsupported() throws Exception {
        ArrowType arrow = new ArrowType(null, null, null);
        try {
            arrow.getLeastSupertype(null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGreatestSubtypeUnsupported() throws Exception {
        ArrowType arrow = new ArrowType(null, null, null);
        try {
            arrow.getGreatestSubtype(null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testEqualityUnsupported() throws Exception {
        ArrowType arrow = new ArrowType(null, null, null);
        try {
            arrow.testForEquality(null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testVisitUnsupported() throws Exception {
        ArrowType arrow = new ArrowType(null, null, null);
        try {
            arrow.visit(null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }
}
