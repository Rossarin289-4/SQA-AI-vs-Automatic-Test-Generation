package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
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
import java.util.Set;

public class TypeInferenceTest {
    @Test
    public void testGetBooleanOutcomesAndTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testGetBooleanOutcomesAndFalse() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testGetBooleanOutcomesOrTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testGetBooleanOutcomesOrFalse() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(true),
                        BooleanLiteralSet.get(false), false));
    }

    @Test
    public void testGetBooleanOutcomesEmptyRight() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(false),
                        BooleanLiteralSet.EMPTY, true));
    }

    @Test
    public void testGetBooleanOutcomesBothSets() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH,
                        BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testGetBooleanOutcomesLeftAlreadyShortCircuits() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(true), false));
    }

    @Test
    public void testGetBooleanOutcomesRightOnly() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(true),
                        BooleanLiteralSet.get(true), true));
    }

    @Test
    public void testGetBooleanOutcomesEmptyInputs() throws Exception {
        assertEquals(BooleanLiteralSet.EMPTY,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.EMPTY,
                        BooleanLiteralSet.EMPTY, true));
    }

    @Test
    public void testGetBooleanOutcomesSingletonFalseRight() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(true), false));
    }

    @Test
    public void testGetBooleanOutcomesSingletonTrueRight() throws Exception {
        assertEquals(BooleanLiteralSet.get(true),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(true),
                        BooleanLiteralSet.get(true), false));
    }

    @Test
    public void testGetBooleanOutcomesSingletonFalseAnd() throws Exception {
        assertEquals(BooleanLiteralSet.get(false),
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.get(false),
                        BooleanLiteralSet.get(false), true));
    }
}
