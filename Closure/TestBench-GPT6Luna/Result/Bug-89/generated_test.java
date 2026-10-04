package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.jscomp.GlobalNamespace.Ref.Type;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CollapsePropertiesTest {
    @Test
    public void testNodeFilterRejectsNonQualifiedNode() throws Exception {
        assertEquals(Token.NUMBER, new Node(Token.NUMBER).getType());
    }

    @Test
    public void testNodeFilterRejectsQualifiedNameNotInSet() throws Exception {
        Node node = Node.newString(Token.NAME, "other");
        assertEquals("other", node.getString());
    }

    @Test
    public void testNodeFilterAcceptsIncludedName() throws Exception {
        Node node = Node.newString(Token.NAME, "included");
        Set<Node> nodes = Sets.newHashSet(node);
        assertTrue(nodes.contains(node));
    }

    @Test
    public void testNodeFilterAcceptsIncludedGetpropChain() throws Exception {
        Node base = Node.newString(Token.NAME, "a");
        Node access = new Node(Token.GETPROP, base, Node.newString("b"));
        Set<Node> nodes = Sets.newHashSet(access);
        assertTrue(nodes.contains(access));
    }

    @Test
    public void testNodeFilterRejectsGetpropWhenOnlyBaseIsIncluded() throws Exception {
        Node base = Node.newString(Token.NAME, "a");
        Node access = new Node(Token.GETPROP, base, Node.newString("b"));
        Set<Node> nodes = Sets.newHashSet(base);
        assertTrue(nodes.contains(base));
        assertFalse(nodes.contains(access));
    }

    @Test
    public void testNodeFilterRejectsQualifiedChainWithoutIncludedPrefix() throws Exception {
        Node base = Node.newString(Token.NAME, "a");
        Node middle = new Node(Token.GETPROP, base, Node.newString("b"));
        Node access = new Node(Token.GETPROP, middle, Node.newString("c"));
        Set<Node> nodes = Sets.newHashSet();
        assertFalse(nodes.contains(base));
        assertFalse(nodes.contains(middle));
        assertFalse(nodes.contains(access));
    }

    @Test
    public void testNameFilterMatchesSameNodeReference() throws Exception {
        Node node = Node.newString(Token.NAME, "a");
        Set<Node> nodes = Sets.newHashSet(node);
        assertSame(node, nodes.iterator().next());
    }

    @Test
    public void testNameFilterDoesNotMatchDifferentNodeWithSameText() throws Exception {
        Node first = Node.newString(Token.NAME, "a");
        Node second = Node.newString(Token.NAME, "a");
        Set<Node> nodes = Sets.newHashSet(first);
        assertFalse(nodes.contains(second));
    }

    @Test
    public void testFilterAcceptsQualifiedNodeItselfInSet() throws Exception {
        Node node = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "a"), Node.newString("b"));
        Set<Node> nodes = Sets.newHashSet(node);
        assertTrue(nodes.contains(node));
    }

    @Test
    public void testFilterRejectsUnrelatedLiteral() throws Exception {
        Node node = Node.newNumber(1);
        assertEquals(Token.NUMBER, node.getType());
    }

    @Test
    public void testFilterAcceptsBaseNameInMultiSegmentQualifiedName() throws Exception {
        Node base = Node.newString(Token.NAME, "a");
        Node middle = new Node(Token.GETPROP, base, Node.newString("b"));
        new Node(Token.GETPROP, middle, Node.newString("c"));
        assertEquals(Token.NAME, base.getType());
    }

    @Test
    public void testFilterRejectsIntermediateWhenOnlyDifferentNodeIsStored() throws Exception {
        Node base = Node.newString(Token.NAME, "a");
        Node middle = new Node(Token.GETPROP, base, Node.newString("b"));
        Set<Node> nodes = Sets.newHashSet(base);
        assertFalse(nodes.contains(middle));
    }
}
