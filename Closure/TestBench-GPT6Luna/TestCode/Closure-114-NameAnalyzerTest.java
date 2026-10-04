package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions;
import com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
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
    public void testEmptyScriptReport() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        analyzer.process(null, IR.script());
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("Total Names: 0"));
        assertTrue(report.contains("Referenced Names: 0"));
    }

    @Test
    public void testUnreferencedGlobalDeclarationIsReported() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        analyzer.process(null, IR.script(IR.var(IR.name("alpha"), IR.number(1))));
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("Total Names: 1"));
        assertTrue(report.contains("Referenced Names: 0"));
        assertTrue(report.contains("alpha"));
    }

    @Test
    public void testUsedNameIsReportedAsReferenced() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node use = IR.exprResult(IR.name("alpha"));
        Node declaration = IR.var(IR.name("alpha"), IR.number(1));
        analyzer.process(null, IR.script(declaration, use));
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("Total Names: 1"));
        assertTrue(report.contains("Referenced Names: 1"));
    }

    @Test
    public void testWindowPropertyIsExternallyReferenced() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node property = IR.getprop(IR.name("window"), IR.string("alpha"));
        analyzer.process(null, IR.script(IR.exprResult(property)));
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("alpha"));
        assertTrue(report.contains("Referenced Names: 1"));
    }

    @Test
    public void testQualifiedNameCreatesParentNames() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node lhs = IR.getprop(IR.getprop(IR.name("alpha"), IR.string("beta")),
                IR.string("gamma"));
        analyzer.process(null, IR.script(IR.exprResult(IR.assign(lhs, IR.number(1)))));
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("alpha.beta.gamma"));
        assertTrue(report.contains("alpha.beta"));
        assertTrue(report.contains("alpha"));
        assertTrue(report.contains("Total Names: 3"));
    }

    @Test
    public void testDotPropertyNameIsRenderedAsLink() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node lhs = IR.getprop(IR.name("window"), IR.string("alpha"));
        analyzer.process(null, IR.script(IR.exprResult(IR.assign(lhs, IR.number(1)))));
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("<a name=\"window.alpha\">window.alpha</a>"));
    }

    @Test
    public void testTwoIndependentNamesCountSeparately() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node first = IR.var(IR.name("alpha"), IR.number(1));
        Node second = IR.var(IR.name("beta"), IR.number(2));
        analyzer.process(null, IR.script(first, second));
        assertTrue(analyzer.getHtmlReport().contains("Total Names: 2"));
    }

    @Test
    public void testFunctionDeclarationIsCollected() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node function = IR.function(IR.name("alpha"), IR.paramList(), IR.block());
        analyzer.process(null, IR.script(function));
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("alpha"));
        assertTrue(report.contains("Total Names: 1"));
    }

    @Test
    public void testExternallyDeclaredNameIsExcludedFromCounts() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node externs = IR.script(IR.var(IR.name("alpha")));
        analyzer.process(externs, IR.script());
        assertTrue(analyzer.getHtmlReport().contains("Total Names: 0"));
    }

    @Test
    public void testReferencedWindowDescendantIsCounted() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node read = IR.exprResult(IR.getprop(IR.name("window"), IR.string("alpha")));
        analyzer.process(null, IR.script(read));
        assertTrue(analyzer.getHtmlReport().contains("Referenced Names: 1"));
    }

    @Test
    public void testPrototypeAssignmentMarksClass() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node prototype = IR.getprop(IR.name("alpha"), IR.string("prototype"));
        Node lhs = IR.getprop(prototype, IR.string("method"));
        analyzer.process(null, IR.script(IR.exprResult(IR.assign(lhs, IR.number(1)))));
        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("Total Classes: 1"));
        assertTrue(report.contains("PROTOTYPES: method"));
    }

    @Test
    public void testNestedQualifiedAssignmentAppearsInReport() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node lhs = IR.getprop(IR.name("alpha"), IR.string("beta"));
        analyzer.process(null, IR.script(IR.exprResult(IR.assign(lhs, IR.number(3)))));
        assertTrue(analyzer.getHtmlReport().contains("alpha.beta"));
        assertTrue(analyzer.getHtmlReport().contains("REFERS TO"));
    }

    @Test
    public void testRemovalDisabledPreservesUnreferencedDeclaration() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node declaration = IR.var(IR.name("alpha"), IR.number(1));
        Node script = IR.script(declaration);
        analyzer.process(null, script);
        assertSame(declaration, script.getFirstChild());
    }

    @Test
    public void testExternsDoNotAppearInAllNames() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node externs = IR.script(IR.var(IR.name("alpha")));
        analyzer.process(externs, IR.script(IR.var(IR.name("beta"))));
        String report = analyzer.getHtmlReport();
        assertFalse(report.contains("<a name=\"alpha\">"));
        assertTrue(report.contains("<a name=\"beta\">"));
    }

    @Test
    public void testNameReportIncludesOverallStatsSection() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        analyzer.process(null, IR.script());
        String report = analyzer.getHtmlReport();
        assertTrue(report.startsWith("<html><body><style"));
        assertTrue(report.endsWith("</body></html>"));
    }

    @Test
    public void testReferencePropagationCallbackCanBeExercisedByProcess() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        analyzer.process(null, IR.script(IR.var(IR.name("alpha"), IR.number(1))));
        assertTrue(analyzer.getHtmlReport().contains("Total Names: 1"));
    }

    @Test
    public void testJsNameStringRepresentationWithoutPrototypeNames() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        analyzer.process(null, IR.script(IR.var(IR.name("alpha"))));
        assertTrue(analyzer.getHtmlReport().contains("alpha"));
    }

    @Test
    public void testJsNameOrderingAppearsInSortedReport() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        analyzer.process(null, IR.script(IR.var(IR.name("beta")), IR.var(IR.name("alpha"))));
        String report = analyzer.getHtmlReport();
        assertTrue(report.indexOf("<a name=\"alpha\">") < report.indexOf("<a name=\"beta\">"));
    }

    @Test
    public void testNameReferenceNodeRemovalViaRemovalPass() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), true);
        Node declaration = IR.var(IR.name("alpha"), IR.number(1));
        Node script = IR.script(declaration);
        analyzer.process(null, script);
        assertNull(script.getFirstChild());
    }

    @Test
    public void testProcessWithExternAndGlobalName() throws Exception {
        NameAnalyzer analyzer = new NameAnalyzer(new Compiler(), false);
        Node externs = IR.script(IR.var(IR.name("alpha")));
        Node root = IR.script(IR.var(IR.name("alpha"), IR.number(1)));
        analyzer.process(externs, root);
        assertTrue(analyzer.getHtmlReport().contains("alpha"));
    }

    @Test
    public void testGlobalNamesDefaultIncludesWindow() throws Exception {
        assertTrue(NameAnalyzer.DEFAULT_GLOBAL_NAMES.contains("window"));
    }

    @Test
    public void testGlobalNamesDefaultIncludesGoogGlobal() throws Exception {
        assertTrue(NameAnalyzer.DEFAULT_GLOBAL_NAMES.contains("goog.global"));
    }

    @Test
    public void testCallbackAccumulatorCanReceiveSubtree() throws Exception {
        Node original = IR.name("alpha");
        assertEquals(Token.NAME, original.getType());
    }

    @Test
    public void testShortCircuitTreeIsBuiltFromTwoChildren() throws Exception {
        Node original = IR.or(IR.name("alpha"), IR.name("beta"));
        assertEquals(Token.OR, original.getType());
        assertEquals("alpha", original.getFirstChild().getString());
        assertEquals("beta", original.getLastChild().getString());
    }

    @Test
    public void testHookTreeIsBuiltFromThreeChildren() throws Exception {
        Node hook = IR.hook(IR.name("condition"), IR.number(1), IR.number(2));
        assertEquals(Token.HOOK, hook.getType());
        assertEquals(3, hook.getChildCount());
    }
}
