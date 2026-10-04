package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.LatticeElement;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MaybeReachingVariableUseTest {

    @Test
    public void testEmptyValuesAreEqual() throws Exception {
        MaybeReachingVariableUse.ReachingUses a =
                new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses b =
                new MaybeReachingVariableUse.ReachingUses();
        assertEquals(a, b);
    }

    @Test
    public void testEmptyValuesHaveEqualHashCodes() throws Exception {
        MaybeReachingVariableUse.ReachingUses a =
                new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses b =
                new MaybeReachingVariableUse.ReachingUses();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testNotEqualToNull() throws Exception {
        MaybeReachingVariableUse.ReachingUses value =
                new MaybeReachingVariableUse.ReachingUses();
        assertFalse(value.equals(null));
    }

    @Test
    public void testNotEqualToAnotherType() throws Exception {
        MaybeReachingVariableUse.ReachingUses value =
                new MaybeReachingVariableUse.ReachingUses();
        assertFalse(value.equals("other"));
    }

    @Test
    public void testCopyOfEmptyValueIsEqual() throws Exception {
        MaybeReachingVariableUse.ReachingUses original =
                new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses copy =
                new MaybeReachingVariableUse.ReachingUses(original);
        assertEquals(original, copy);
    }

    @Test
    public void testCopyHasSameHashCode() throws Exception {
        MaybeReachingVariableUse.ReachingUses original =
                new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses copy =
                new MaybeReachingVariableUse.ReachingUses(original);
        assertEquals(original.hashCode(), copy.hashCode());
    }

    @Test
    public void testEmptyJoinProducesEmptyValue() throws Exception {
        MaybeReachingVariableUse.ReachingUses result =
                new MaybeReachingVariableUse.ReachingUses();
        assertTrue(result.mayUseMap.isEmpty());
    }

    @Test
    public void testEmptyJoinResultEqualsNewValue() throws Exception {
        MaybeReachingVariableUse.ReachingUses result =
                new MaybeReachingVariableUse.ReachingUses();
        assertEquals(new MaybeReachingVariableUse.ReachingUses(), result);
    }

    @Test
    public void testMapInitiallyHasSizeZero() throws Exception {
        MaybeReachingVariableUse.ReachingUses value =
                new MaybeReachingVariableUse.ReachingUses();
        assertEquals(0, value.mayUseMap.size());
    }

    @Test
    public void testIndependentEmptyValuesRemainEqual() throws Exception {
        MaybeReachingVariableUse.ReachingUses first =
                new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses second =
                new MaybeReachingVariableUse.ReachingUses();
        assertTrue(first.equals(second) && second.equals(first));
    }

    @Test
    public void testCopyConstructionPreservesEqualityAfterSourceUnchanged() throws Exception {
        MaybeReachingVariableUse.ReachingUses source =
                new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses copy =
                new MaybeReachingVariableUse.ReachingUses(source);
        assertTrue(source.equals(copy));
    }

    @Test
    public void testEmptyValuesHaveSameHashCodeRepeatedly() throws Exception {
        MaybeReachingVariableUse.ReachingUses value =
                new MaybeReachingVariableUse.ReachingUses();
        assertEquals(value.hashCode(), value.hashCode());
    }
}
