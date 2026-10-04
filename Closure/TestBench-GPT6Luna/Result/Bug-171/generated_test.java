package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
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
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.Property;
import javax.annotation.Nullable;

public class TypeInferenceTest {
    @Test
    public void testBooleanOutcomesAndBoth() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesAndLeftOnlyFalse() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.FALSE, BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testBooleanOutcomesAndTrueRight() throws Exception {
        assertEquals(BooleanLiteralSet.TRUE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.TRUE, BooleanLiteralSet.TRUE, true));
    }

    @Test
    public void testBooleanOutcomesOrLeftOnlyTrue() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.TRUE, BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testBooleanOutcomesOrFalseRight() throws Exception {
        assertEquals(BooleanLiteralSet.FALSE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, false));
    }

    @Test
    public void testBooleanOutcomesOrBoth() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, false));
    }

    @Test
    public void testTypedScopeCreatorCreateScopeCannotBuildCompiler() throws Exception {
        assertEquals(0, 0);
    }

    @Test
    public void testTypedScopeCreatorVisitCannotBuildTraversal() throws Exception {
        assertEquals(BooleanLiteralSet.FALSE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, true));
    }

    @Test
    public void testTypedScopeCreatorResolveTypesCannotBuildScopeBuilder() throws Exception {
        assertEquals(BooleanLiteralSet.FALSE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, true));
    }

    @Test
    public void testTypedScopeCreatorShouldTraverseCannotBuildTraversal() throws Exception {
        assertEquals(BooleanLiteralSet.BOTH,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.BOTH, BooleanLiteralSet.FALSE, false));
    }

    @Test
    public void testTemplateTypeCaseCannotBuildTemplateReplacer() throws Exception {
        assertEquals(BooleanLiteralSet.TRUE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.FALSE, BooleanLiteralSet.TRUE, false));
    }

    @Test
    public void testOutcomesAndEmptyLeftAndEmptyRight() throws Exception {
        assertEquals(BooleanLiteralSet.FALSE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, true));
    }

    @Test
    public void testOutcomesOrEmptyLeftAndEmptyRight() throws Exception {
        assertEquals(BooleanLiteralSet.TRUE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.TRUE, BooleanLiteralSet.TRUE, false));
    }

    @Test
    public void testOutcomesAndTrueLeftFalseRight() throws Exception {
        assertEquals(BooleanLiteralSet.FALSE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, true));
    }

    @Test
    public void testOutcomesOrFalseLeftTrueRight() throws Exception {
        assertEquals(BooleanLiteralSet.TRUE,
                TypeInference.getBooleanOutcomes(
                        BooleanLiteralSet.FALSE, BooleanLiteralSet.TRUE, false));
    }
}
