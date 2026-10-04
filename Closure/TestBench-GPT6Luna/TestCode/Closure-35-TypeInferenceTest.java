package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
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
    public void testBooleanOutcomesAndTrueShortCircuit() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                        BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesAndFalseCanBeFromRight() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesAndAlwaysTrueRight() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true),
                        BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesOrShortCircuitTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true),
                        BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testBooleanOutcomesOrAlwaysFalseRight() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                        BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testBooleanOutcomesEmptyInputs() throws Exception {
        assertEquals(BooleanLiteralSet.EMPTY,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.EMPTY,
                        BooleanLiteralSet.EMPTY, true));
    }

    @Test
    public void testBooleanOutcomesBothValuesAndOr() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testBooleanOutcomesLeftFalseAndRightTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testBooleanOutcomesOrLeftTrueAndRightFalse() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true),
                        BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testBooleanOutcomesAndRightFalse() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true),
                        BooleanLiteralSet.get(false), true));
    }

    @Test
    public void testBooleanOutcomesOrRightTrue() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(true), false));
    }

    @Test
    public void testBooleanOutcomesAndLeftBothRightFalse() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
                TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.get(false), true));
    }
}
