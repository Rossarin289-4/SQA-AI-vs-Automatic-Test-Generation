package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.CopySideEffectSubexpressions;
import com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NameAnalyzerTest {

    @Test
    public void testProcessKeepsDefaultGlobalReference() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(IR.var(IR.name("window"), IR.objectlit()));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessRemovesUnreferencedVariable() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(IR.var(IR.name("unused"), IR.number(1)));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessKeepsExportedName() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node root = IR.script(IR.var(IR.name("local"), IR.number(1)));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessHandlesEmptyScript() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script();
        analyzer.process(IR.script(), root);
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testProcessPreservesReferencedDeclaration() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.var(IR.name("used"), IR.number(1)),
            IR.exprResult(IR.name("used")));
        analyzer.process(IR.script(), root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessRemovesUnreferencedFunction() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node fn = IR.function(IR.name("unusedFn"), IR.paramList(), IR.block());
        Node root = IR.script(fn);
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessKeepsFunctionReferencedByWindow() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node fn = IR.function(IR.name("keepFn"), IR.paramList(), IR.block());
        Node root = IR.script(
            fn,
            IR.exprResult(IR.assign(IR.getprop(IR.name("window"), IR.string("entry")),
                                    IR.name("keepFn"))));
        analyzer.process(IR.script(), root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessKeepsExternDeclaration() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node externs = IR.script(IR.var(IR.name("externalName")));
        Node root = IR.script(IR.var(IR.name("externalName"), IR.number(1)));
        analyzer.process(externs, root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessDoesNotRemoveWhenRemovalDisabled() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node root = IR.script(IR.var(IR.name("unused"), IR.number(1)));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessHandlesSeveralUnreferencedDeclarations() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.var(IR.name("first"), IR.number(1)),
            IR.var(IR.name("last"), IR.number(2)));
        analyzer.process(IR.script(), root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessTracksQualifiedGlobalProperty() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("window"), IR.string("api")), IR.number(1))));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessHandlesExternFunctionDeclaration() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node externs = IR.script(
            IR.function(IR.name("externalFn"), IR.paramList(), IR.block()));
        Node root = IR.script(
            IR.function(IR.name("externalFn"), IR.paramList(), IR.block()));
        analyzer.process(externs, root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessRemovesUnusedInitializerButKeepsSideEffect() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.var(IR.name("unused"), IR.call(IR.name("effect"))));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessRetainsWindowPropertyAndValueDependency() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.var(IR.name("Factory"), IR.number(1)),
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("window"), IR.string("entry")),
                IR.name("Factory"))));
        analyzer.process(IR.script(), root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessRetainsReferencedFunctionDependency() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node fn = IR.function(
            IR.name("caller"), IR.paramList(),
            IR.block(IR.exprResult(IR.call(IR.name("callee")))));
        Node callee = IR.function(IR.name("callee"), IR.paramList(), IR.block());
        Node root = IR.script(
            fn, callee,
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("window"), IR.string("entry")),
                IR.name("caller"))));
        analyzer.process(IR.script(), root);
        assertEquals(3, root.getChildCount());
    }

    @Test
    public void testProcessRetainsExternDeclaredGlobalReference() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node externs = IR.script(
            IR.function(IR.name("externalFn"), IR.paramList(), IR.block()));
        Node root = IR.script(
            IR.function(IR.name("externalFn"), IR.paramList(), IR.block()),
            IR.var(IR.name("unused"), IR.number(1)));
        analyzer.process(externs, root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessKeepsReferencedPrototypeClass() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.var(IR.name("Widget"), IR.objectlit()),
            IR.exprResult(IR.assign(
                IR.getprop(IR.getprop(IR.name("Widget"), IR.string("prototype")), IR.string("run")),
                IR.function(IR.name(""), IR.paramList(), IR.block()))),
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("window"), IR.string("entry")),
                IR.name("Widget"))));
        analyzer.process(IR.script(), root);
        assertEquals(3, root.getChildCount());
    }

    @Test
    public void testProcessRemovesUnreferencedQualifiedAssignment() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(IR.exprResult(IR.assign(
            IR.getprop(IR.name("unused"), IR.string("property")), IR.number(1))));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessPreservesDeclarationWhenItHasDescendantReference() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.var(IR.name("namespace"), IR.objectlit()),
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("namespace"), IR.string("property")), IR.number(1))),
            IR.exprResult(IR.getprop(IR.name("window"), IR.string("namespace"))));
        analyzer.process(IR.script(), root);
        assertEquals(3, root.getChildCount());
    }

    @Test
    public void testProcessRemovesUnusedFunctionContainingLocalReference() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node fn = IR.function(
            IR.name("unusedFn"), IR.paramList(),
            IR.block(IR.exprResult(IR.name("unresolved"))));
        Node root = IR.script(fn);
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessKeepsRootReferencedThroughQualifiedName() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.var(IR.name("root"), IR.objectlit()),
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("root"), IR.string("child")), IR.number(1))),
            IR.exprResult(IR.getprop(IR.name("window"), IR.string("root"))));
        analyzer.process(IR.script(), root);
        assertEquals(3, root.getChildCount());
    }

    @Test
    public void testProcessTracksExternVariableAndUnrelatedUnusedName() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node externs = IR.script(IR.var(IR.name("host")));
        Node root = IR.script(
            IR.var(IR.name("host"), IR.number(1)),
            IR.var(IR.name("spare"), IR.number(2)));
        analyzer.process(externs, root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessKeepsDeclarationUsedByCallInWindowProperty() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.function(IR.name("launch"), IR.paramList(), IR.block()),
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("window"), IR.string("entry")),
                IR.call(IR.name("launch")))));
        analyzer.process(IR.script(), root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessLeavesUnreferencedCodeWhenRemovalOff() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node root = IR.script(
            IR.var(IR.name("a"), IR.number(1)),
            IR.function(IR.name("b"), IR.paramList(), IR.block()));
        analyzer.process(IR.script(), root);
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testProcessRetainsGlobalObjectQualifiedDefinition() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node root = IR.script(
            IR.exprResult(IR.assign(
                IR.getprop(IR.name("window"), IR.string("api")),
                IR.objectlit(IR.propdef(IR.string("value"), IR.number(1))))));
        analyzer.process(IR.script(), root);
        assertEquals(1, root.getChildCount());
    }
}
