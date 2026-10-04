package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TypeInferenceTest {
    @Test
    public void testBooleanOutcomesAndWhenConditionTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testBooleanOutcomesAndWhenConditionFalse() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.get(true), false));
    }

    @Test
    public void testBooleanOutcomesOrWhenConditionTrue() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.get(false), true));
    }

    @Test
    public void testBooleanOutcomesOrWhenConditionFalse() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testBooleanOutcomesEmptyLeftAnd() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.EMPTY,
                        BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testBooleanOutcomesEmptyLeftOr() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.EMPTY,
                        BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testBooleanOutcomesSingletonFalseAnd() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testBooleanOutcomesSingletonTrueOr() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(true),
                        BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testBooleanOutcomesSingletonTrueAnd() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(true),
                        BooleanLiteralSet.get(false), true));
    }

    @Test
    public void testBooleanOutcomesSingletonFalseOr() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(true), false));
    }

    @Test
    public void testBooleanOutcomesBothAndBoth() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesBothOrBoth() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, false));
    }
}
