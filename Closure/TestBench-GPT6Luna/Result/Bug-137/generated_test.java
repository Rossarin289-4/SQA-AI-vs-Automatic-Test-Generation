package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;

public class MakeDeclaredNamesUniqueTest {
    @Test
    public void testOriginalNameWithoutSeparator() throws Exception {
        assertEquals("alpha", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("alpha"));
    }

    @Test
    public void testOriginalNameWithSuffix() throws Exception {
        assertEquals("alpha", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("alpha$$1"));
    }

    @Test
    public void testOriginalNameUsesLastSeparator() throws Exception {
        assertEquals("alpha$$2", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("alpha$$2$$3"));
    }

    @Test
    public void testEmptyOriginalName() throws Exception {
        assertEquals("", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(""));
    }

    @Test
    public void testContextualGlobalDeclarationIsReserved() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer root = new MakeDeclaredNamesUnique.ContextualRenamer();
        root.addDeclaredName("item");
        MakeDeclaredNamesUnique.Renamer child = root.forChildScope();
        child.addDeclaredName("item");
        assertEquals("item$$1", child.getReplacementName("item"));
    }

    @Test
    public void testFirstChildDeclarationKeepsOriginalName() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer root = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = root.forChildScope();
        child.addDeclaredName("item");
        assertNull(child.getReplacementName("item"));
    }

    @Test
    public void testRepeatedNameInOneScopeIsCountedOnce() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer root = new MakeDeclaredNamesUnique.ContextualRenamer();
        root.addDeclaredName("item");
        MakeDeclaredNamesUnique.Renamer child = root.forChildScope();
        child.addDeclaredName("item");
        child.addDeclaredName("item");
        assertEquals("item$$1", child.getReplacementName("item"));
    }

    @Test
    public void testArgumentsIsNotRenamedContextually() throws Exception {
        MakeDeclaredNamesUnique.ContextualRenamer root = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.Renamer child = root.forChildScope();
        child.addDeclaredName("arguments");
        assertNull(child.getReplacementName("arguments"));
    }

    @Test
    public void testInlineRenamerAddsConfiguredSuffix() throws Exception {
        Supplier<String> supplier = new Supplier<String>() {
            public String get() { return "7"; }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
            new MakeDeclaredNamesUnique.InlineRenamer(supplier, "in", false);
        renamer.addDeclaredName("item");
        assertEquals("item$$in7", renamer.getReplacementName("item"));
    }

    @Test
    public void testInlineRenamerStripsPreviousSuffix() throws Exception {
        Supplier<String> supplier = new Supplier<String>() {
            public String get() { return "8"; }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
            new MakeDeclaredNamesUnique.InlineRenamer(supplier, "in", false);
        renamer.addDeclaredName("item$$old");
        assertEquals("item$$in8", renamer.getReplacementName("item$$old"));
    }

    @Test
    public void testInlineRenamerPreservesEmptyName() throws Exception {
        Supplier<String> supplier = new Supplier<String>() {
            public String get() { return "9"; }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
            new MakeDeclaredNamesUnique.InlineRenamer(supplier, "in", false);
        renamer.addDeclaredName("");
        assertEquals("", renamer.getReplacementName(""));
    }

    @Test
    public void testInlineRenamerCanStripConstness() throws Exception {
        Supplier<String> supplier = new Supplier<String>() {
            public String get() { return "1"; }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
            new MakeDeclaredNamesUnique.InlineRenamer(supplier, "x", true);
        assertTrue(renamer.stripConstIfReplaced());
    }

    @Test
    public void testInlineRenamerDoesNotStripConstnessWhenDisabled() throws Exception {
        Supplier<String> supplier = new Supplier<String>() {
            public String get() { return "1"; }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
            new MakeDeclaredNamesUnique.InlineRenamer(supplier, "x", false);
        assertFalse(renamer.stripConstIfReplaced());
    }

    @Test
    public void testInlineChildRenamerHasIndependentDeclarations() throws Exception {
        Supplier<String> supplier = new Supplier<String>() {
            public String get() { return "2"; }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
            new MakeDeclaredNamesUnique.InlineRenamer(supplier, "x", false);
        renamer.addDeclaredName("item");
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        assertNull(child.getReplacementName("item"));
    }

    @Test
    public void testInlineRenamerUnknownNameReturnsNull() throws Exception {
        Supplier<String> supplier = new Supplier<String>() {
            public String get() { return "3"; }
        };
        MakeDeclaredNamesUnique.InlineRenamer renamer =
            new MakeDeclaredNamesUnique.InlineRenamer(supplier, "x", false);
        assertNull(renamer.getReplacementName("missing"));
    }

    @Test
    public void testNewExprWrapsChild() throws Exception {
        Node child = Node.newNumber(4);
        Node expr = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(child, expr.getFirstChild());
    }

    @Test
    public void testNewQualifiedNameNodeSinglePart() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode("alpha", 0, 0);
        assertEquals(Token.NAME, name.getType());
        assertEquals("alpha", name.getString());
    }

    @Test
    public void testNewQualifiedNameNodeDottedName() throws Exception {
        Node name = NodeUtil.newQualifiedNameNode("alpha.beta", 0, 0);
        assertEquals(Token.GETPROP, name.getType());
        assertEquals("alpha.beta", name.getQualifiedName());
    }

    @Test
    public void testGetVarsDeclaredInBranchCollectsVarsInOrder() throws Exception {
        Node branch = new Node(Token.BLOCK);
        branch.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "first")));
        branch.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "last")));
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(2, vars.size());
        assertEquals("first", vars.iterator().next().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchExcludesNestedFunction() throws Exception {
        Node branch = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION,
            Node.newString(Token.NAME, "f"),
            new Node(Token.LP),
            new Node(Token.BLOCK,
                new Node(Token.VAR, Node.newString(Token.NAME, "inside"))));
        branch.addChildToBack(fn);
        assertEquals(0, NodeUtil.getVarsDeclaredInBranch(branch).size());
    }

    @Test
    public void testGetVarsDeclaredInBranchDeduplicatesNames() throws Exception {
        Node branch = new Node(Token.BLOCK);
        branch.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "same")));
        branch.addChildToBack(new Node(Token.VAR, Node.newString(Token.NAME, "same")));
        assertEquals(1, NodeUtil.getVarsDeclaredInBranch(branch).size());
    }

    @Test
    public void testGetVarsDeclaredInBranchEmpty() throws Exception {
        assertEquals(0, NodeUtil.getVarsDeclaredInBranch(new Node(Token.BLOCK)).size());
    }

    @Test
    public void testNewFunctionNodeBuildsFunctionWithNameAndBody() throws Exception {
        Node body = new Node(Token.BLOCK);
        FunctionNode function = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), body, 0, 0);
        assertEquals(Token.FUNCTION, function.getType());
        assertEquals("f", function.getFirstChild().getString());
        assertSame(body, function.getLastChild());
    }

    @Test
    public void testNewFunctionNodeIncludesParametersInOrder() throws Exception {
        List<Node> params = Lists.newArrayList(
            Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
        FunctionNode function = NodeUtil.newFunctionNode("f", params, new Node(Token.BLOCK), 0, 0);
        Node first = function.getFirstChild().getNext().getFirstChild();
        assertEquals("a", first.getString());
        assertEquals("b", first.getNext().getString());
        assertNull(first.getNext().getNext());
    }

    @Test
    public void testShouldTraverseAllowsNameNode() throws Exception {
        MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
        Node name = Node.newString(Token.NAME, "x");
        assertTrue(pass.shouldTraverse(null, name, null));
    }

    @Test
    public void testVisitWithEmptyNameStackLeavesUnknownNameUnchanged() throws Exception {
        MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
        Node name = Node.newString(Token.NAME, "x");
        pass.visit(null, name, null);
        assertEquals("x", name.getString());
    }

    @Test
    public void testExitGlobalScopeWithoutPoppingRoot() throws Exception {
        NodeTraversal traversal = new NodeTraversal(null, new NodeTraversal.Callback() {
            public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
                return true;
            }
            public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
        pass.enterScope(traversal);
        pass.exitScope(traversal);
        assertTrue(pass.shouldTraverse(traversal, Node.newString(Token.NAME, "x"), null));
    }
}
