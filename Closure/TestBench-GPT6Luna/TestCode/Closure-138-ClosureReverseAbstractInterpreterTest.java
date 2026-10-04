package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.Node;
import java.util.Map;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ClosureReverseAbstractInterpreterTest {
    @Test
    public void testBooleanOutcomeAndTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.TRUE, true));
    }

    @Test
    public void testBooleanOutcomeAndFalse() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomeOrTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testBooleanOutcomeOrFalse() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.FALSE, false));
    }

    @Test
    public void testBooleanOutcomeLeftSetDoesNotContainShortCircuitValue()
            throws Exception {
        assertEquals(BooleanLiteralSet.EMPTY,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.TRUE, BooleanLiteralSet.EMPTY, true));
    }

    @Test
    public void testBooleanOutcomeEmptyInputs() throws Exception {
        assertEquals(BooleanLiteralSet.EMPTY,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.EMPTY, BooleanLiteralSet.EMPTY, false));
    }

    @Test
    public void testUnrecognizedConditionReturnsBlindScope() throws Exception {
        ClosureReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, null);
        FlowScope scope = null;
        Node condition = new Node(Token.TRUE);
        try {
            interpreter.getPreciserScopeKnowingConditionOutcome(
                    condition, scope, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testCallWithWrongChildCountReturnsBlindScope() throws Exception {
        ClosureReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, null);
        FlowScope scope = null;
        Node condition = new Node(Token.CALL, Node.newString("callee"));
        try {
            interpreter.getPreciserScopeKnowingConditionOutcome(
                    condition, scope, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testCallWithNonQualifiedParameterReturnsBlindScope()
            throws Exception {
        ClosureReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, null);
        FlowScope scope = null;
        Node callee = new Node(Token.GETPROP,
                Node.newString("goog"), Node.newString("isDef"));
        Node condition = new Node(Token.CALL, callee, Node.newNumber(1));
        try {
            interpreter.getPreciserScopeKnowingConditionOutcome(
                    condition, scope, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testNonGoogPropertyCallReturnsBlindScope() throws Exception {
        ClosureReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, null);
        FlowScope scope = null;
        Node callee = new Node(Token.GETPROP,
                Node.newString("other"), Node.newString("isDef"));
        Node condition = new Node(Token.CALL, callee, Node.newString("x"));
        try {
            interpreter.getPreciserScopeKnowingConditionOutcome(
                    condition, scope, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testUnsupportedGoogPredicateReturnsBlindScope() throws Exception {
        ClosureReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, null);
        FlowScope scope = null;
        Node callee = new Node(Token.GETPROP,
                Node.newString("goog"), Node.newString("unknown"));
        Node condition = new Node(Token.CALL, callee, Node.newString("x"));
        try {
            interpreter.getPreciserScopeKnowingConditionOutcome(
                    condition, scope, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testWrongCalleeShapeReturnsBlindScope() throws Exception {
        ClosureReverseAbstractInterpreter interpreter =
                new ClosureReverseAbstractInterpreter(null, null);
        FlowScope scope = null;
        Node condition = new Node(Token.CALL,
                Node.newString("isDef"), Node.newString("x"));
        try {
            interpreter.getPreciserScopeKnowingConditionOutcome(
                    condition, scope, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
