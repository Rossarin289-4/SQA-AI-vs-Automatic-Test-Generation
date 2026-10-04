package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TypeInferenceTest {
    @Test
    public void testBooleanOutcomesAndTrueCondition() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH,
                BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesAndFalseCondition() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testBooleanOutcomesOrFalseCondition() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH,
                BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testBooleanOutcomesOrTrueCondition() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true),
                BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testBooleanOutcomesEmptyLeftAnd() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.EMPTY,
                BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testBooleanOutcomesEmptyRightOr() throws Exception {
        assertEquals(BooleanLiteralSet.EMPTY,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                BooleanLiteralSet.EMPTY, false));
    }

    @Test
    public void testBooleanOutcomesSingletonFalseLeftAnd() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesSingletonTrueLeftOr() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true),
                BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testBooleanOutcomesSingletonTrueAnd() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true),
                BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testBooleanOutcomesSingletonFalseOr() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false),
                BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testBooleanOutcomesBothRightEmptyAnd() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH,
                BooleanLiteralSet.EMPTY, true));
    }

    @Test
    public void testBooleanOutcomesBothRightEmptyOr() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH,
                BooleanLiteralSet.EMPTY, false));
    }
}
