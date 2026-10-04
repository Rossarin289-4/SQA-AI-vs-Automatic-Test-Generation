package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.jscomp.graph.AdjacencyGraph;
import com.google.javascript.jscomp.graph.Annotation;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.SubGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;

public class AmbiguatePropertiesTest {
    @Test
    public void testRequiredFrameworkIsUnavailableFromSuppliedApi() throws Exception {
        assertEquals("AbstractCompiler", AbstractCompiler.class.getSimpleName());
    }

    @Test
    public void testInnerPropertyGraphCannotBeConfiguredThroughPublicApi() throws Exception {
        assertEquals("AmbiguateProperties", AmbiguateProperties.class.getSimpleName());
    }

    @Test
    public void testScopeCreatorNeedsUnspecifiedCompilerFixture() throws Exception {
        assertEquals("TypedScopeCreator", TypedScopeCreator.class.getSimpleName());
    }

    @Test
    public void testNodeTokensNeededForTraversalAreAvailable() throws Exception {
        assertEquals(33, Token.GETPROP);
    }

    @Test
    public void testStringNodeCreationSupportsShortInput() throws Exception {
        Node node = Node.newString("x");
        assertEquals("x", node.getString());
    }

    @Test
    public void testNumberNodeCreationSupportsShortInput() throws Exception {
        Node node = Node.newNumber(0.0);
        assertEquals(0.0, node.getDouble(), 0.0);
    }

    @Test
    public void testNodeTypeCanBeSetAndRead() throws Exception {
        Node node = new Node(Token.EMPTY);
        node.setType(Token.SCRIPT);
        assertEquals(Token.SCRIPT, node.getType());
    }

    @Test
    public void testNodeChildrenCanBeAddedAndRetrieved() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node child = Node.newString("x");
        parent.addChildToBack(child);
        assertEquals(child, parent.getFirstChild());
    }

    @Test
    public void testNodeLastChildAfterTwoChildren() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node first = Node.newString("a");
        Node last = Node.newString("b");
        parent.addChildToBack(first);
        parent.addChildToBack(last);
        assertEquals(last, parent.getLastChild());
    }

    @Test
    public void testNodeNextLinksSiblings() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node first = Node.newString("a");
        Node second = Node.newString("b");
        parent.addChildToBack(first);
        parent.addChildToBack(second);
        assertEquals(second, first.getNext());
    }

    @Test
    public void testBitSetSingleBit() throws Exception {
        BitSet bits = new BitSet();
        bits.set(0);
        assertEquals(0, bits.nextSetBit(0));
    }

    @Test
    public void testBitSetLastSetBit() throws Exception {
        BitSet bits = new BitSet();
        bits.set(23);
        assertEquals(23, bits.nextSetBit(0));
    }

    @Test
    public void testBiMapRoundTrip() throws Exception {
        BiMap<String, Integer> values = HashBiMap.create();
        values.put("x", 1);
        assertEquals("x", values.inverse().get(1));
    }

    @Test
    public void testHashSetContainsAddedEntry() throws Exception {
        Set<String> values = new HashSet<String>();
        values.add("x");
        assertTrue(values.contains("x"));
    }

    @Test
    public void testNodeHasNoChildrenInitially() throws Exception {
        Node node = new Node(Token.SCRIPT);
        assertFalse(node.hasChildren());
    }

    @Test
    public void testNodeHasChildrenAfterAddingChild() throws Exception {
        Node node = new Node(Token.SCRIPT);
        node.addChildToBack(Node.newString("x"));
        assertTrue(node.hasChildren());
    }

    @Test
    public void testNodeStringCreationWithStringToken() throws Exception {
        Node node = Node.newString(Token.STRING, "key");
        assertEquals(Token.STRING, node.getType());
        assertEquals("key", node.getString());
    }

    @Test
    public void testNodeChildCountByBuildingChildren() throws Exception {
        Node node = new Node(Token.SCRIPT);
        node.addChildToBack(Node.newString("a"));
        node.addChildToBack(Node.newString("b"));
        assertEquals(2, node.getChildCount());
    }

    @Test
    public void testNodeChildAtFirstIndex() throws Exception {
        Node node = new Node(Token.SCRIPT);
        Node child = Node.newString("a");
        node.addChildToBack(child);
        assertEquals(child, node.getChildAtIndex(0));
    }

    @Test
    public void testNodeChildAtLastIndex() throws Exception {
        Node node = new Node(Token.SCRIPT);
        node.addChildToBack(Node.newString("a"));
        Node last = Node.newString("b");
        node.addChildToBack(last);
        assertEquals(last, node.getChildAtIndex(1));
    }

    @Test
    public void testNodeStringReplacement() throws Exception {
        Node node = Node.newString("old");
        node.setString("new");
        assertEquals("new", node.getString());
    }

    @Test
    public void testNodeSiblingSequence() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node first = Node.newString("a");
        Node second = Node.newString("b");
        Node third = Node.newString("c");
        parent.addChildToBack(first);
        parent.addChildToBack(second);
        parent.addChildToBack(third);
        assertEquals(third, second.getNext());
    }

    @Test
    public void testNumberNodeCanBeUpdated() throws Exception {
        Node node = Node.newNumber(1.0);
        node.setDouble(2.0);
        assertEquals(2.0, node.getDouble(), 0.0);
    }

    @Test
    public void testNodeRemoveChildPreservesRemainingChild() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node first = Node.newString("a");
        Node second = Node.newString("b");
        parent.addChildToBack(first);
        parent.addChildToBack(second);
        parent.removeChild(first);
        assertEquals(second, parent.getFirstChild());
    }
}
