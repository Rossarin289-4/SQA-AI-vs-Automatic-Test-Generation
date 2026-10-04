package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class LiveVariablesAnalysisTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testLatticeEqualsRejectsNull() throws Exception {
        try {
            new LiveVariablesAnalysis.LiveVariableLattice((LiveVariablesAnalysis.LiveVariableLattice) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testLatticeIsNotEqualToAnotherType() throws Exception {
        assertFalse(new LiveVariablesAnalysis.LiveVariableLattice(
                (LiveVariablesAnalysis.LiveVariableLattice) null).equals("other"));
    }

    @Test
    public void testEmptyLatticeString() throws Exception {
        LiveVariablesAnalysis.LiveVariableLattice lattice =
                new LiveVariablesAnalysis.LiveVariableLattice(
                        (LiveVariablesAnalysis.LiveVariableLattice) null);
        assertEquals("{}", lattice.toString());
    }

    @Test
    public void testEmptyLatticeHashCode() throws Exception {
        LiveVariablesAnalysis.LiveVariableLattice lattice =
                new LiveVariablesAnalysis.LiveVariableLattice(
                        (LiveVariablesAnalysis.LiveVariableLattice) null);
        assertEquals(0, lattice.hashCode());
    }

    @Test
    public void testEmptyLatticeIndexZeroIsNotLive() throws Exception {
        LiveVariablesAnalysis.LiveVariableLattice lattice =
                new LiveVariablesAnalysis.LiveVariableLattice(
                        (LiveVariablesAnalysis.LiveVariableLattice) null);
        assertFalse(lattice.isLive(0));
    }

    @Test
    public void testEmptyLatticeNegativeIndexIsNotLive() throws Exception {
        LiveVariablesAnalysis.LiveVariableLattice lattice =
                new LiveVariablesAnalysis.LiveVariableLattice(
                        (LiveVariablesAnalysis.LiveVariableLattice) null);
        assertFalse(lattice.isLive(-1));
    }
}
