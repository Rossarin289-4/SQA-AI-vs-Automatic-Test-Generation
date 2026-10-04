package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.SourcePosition;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ScopedAliasesTest {
    @Test
    public void testNodeQualifiedNameAndTypePredicate() throws Exception {
        Node node = Node.newString("x");
        assertEquals("x", node.getString());
        assertEquals(Token.STRING, node.getType());
        assertFalse(node.isQualifiedName());
    }

    @Test
    public void testNumberValue() throws Exception {
        Node node = Node.newNumber(7.25);
        assertEquals(7.25, node.getDouble(), 0.0);
        node.setDouble(-2.5);
        assertEquals(-2.5, node.getDouble(), 0.0);
    }

    @Test
    public void testChildrenAndIndexEdges() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node first = Node.newString("a");
        Node last = Node.newString("b");
        parent.addChildToBack(first);
        parent.addChildToBack(last);
        assertEquals(2, parent.getChildCount());
        assertEquals(0, parent.getIndexOfChild(first));
        assertEquals(1, parent.getIndexOfChild(last));
        assertEquals(-1, parent.getIndexOfChild(Node.newString("c")));
        assertEquals(first, parent.getChildAtIndex(0));
        assertEquals(last, parent.getChildAtIndex(1));
        assertEquals(first, parent.getChildBefore(last));
    }

    @Test
    public void testChildMutationsAndParentLinks() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node a = Node.newString("a");
        Node b = Node.newString("b");
        Node c = Node.newString("c");
        parent.addChildToBack(a);
        parent.addChildToBack(c);
        parent.addChildBefore(b, c);
        assertEquals(3, parent.getChildCount());
        assertEquals(b, parent.getChildBefore(c));
        parent.removeChild(b);
        assertEquals(2, parent.getChildCount());
        assertNull(b.getParent());
        assertEquals(c, parent.getLastChild());
    }

    @Test
    public void testReplaceChildAndCloneTree() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node oldChild = Node.newString("old");
        parent.addChildToBack(oldChild);
        Node newChild = Node.newString("new");
        parent.replaceChild(oldChild, newChild);
        assertEquals(newChild, parent.getFirstChild());
        assertNull(oldChild.getParent());
        Node clone = parent.cloneTree();
        assertEquals("new", clone.getFirstChild().getString());
        assertNull(clone.getParent());
        assertNull(clone.getFirstChild().getParent() == parent ? parent : null);
    }

    @Test
    public void testIntegerPropertiesAtZeroAndEdges() throws Exception {
        Node node = new Node(Token.NAME);
        assertEquals(0, node.getIntProp(Node.LENGTH));
        node.putIntProp(Node.LENGTH, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, node.getExistingIntProp(Node.LENGTH));
        node.putIntProp(Node.LENGTH, Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, node.getIntProp(Node.LENGTH));
        node.putIntProp(Node.LENGTH, 0);
        assertEquals(0, node.getIntProp(Node.LENGTH));
    }

    @Test
    public void testBooleanPropertyToggle() throws Exception {
        Node node = new Node(Token.NAME);
        node.putBooleanProp(Node.QUOTED_PROP, true);
        assertTrue(node.getBooleanProp(Node.QUOTED_PROP));
        node.putBooleanProp(Node.QUOTED_PROP, false);
        assertFalse(node.getBooleanProp(Node.QUOTED_PROP));
    }

    @Test
    public void testObjectPropertyReplacementAndRemoval() throws Exception {
        Node node = new Node(Token.NAME);
        node.putProp(Node.INPUT_ID, "first");
        assertEquals("first", node.getProp(Node.INPUT_ID));
        node.putProp(Node.INPUT_ID, "second");
        assertEquals("second", node.getProp(Node.INPUT_ID));
        node.removeProp(Node.INPUT_ID);
        assertNull(node.getProp(Node.INPUT_ID));
    }

    @Test
    public void testMissingExistingIntegerPropertyThrows() throws Exception {
        Node node = new Node(Token.NAME);
        try {
            node.getExistingIntProp(Node.LENGTH);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(0, node.getIntProp(Node.LENGTH));
        }
    }

    @Test
    public void testSourcePositionLengthEdges() throws Exception {
        Node node = new Node(Token.NAME, 3, Node.MAX_COLUMN_NUMBER);
        assertEquals(3, node.getLineno());
        assertEquals(Node.MAX_COLUMN_NUMBER, node.getCharno());
        node.setLength(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, node.getLength());
        node.setLength(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, node.getLength());
    }

    @Test
    public void testSourceFileTestingName() throws Exception {
        Node node = new Node(Token.SCRIPT);
        assertNull(node.getSourceFileName());
        node.setSourceFileForTesting("sample.js");
        assertEquals("sample.js", node.getSourceFileName());
        assertFalse(node.isFromExterns());
    }

    @Test
    public void testSideEffectFlagQueries() throws Exception {
        Node call = new Node(Token.CALL);
        call.setSideEffectFlags(Node.NO_SIDE_EFFECTS | Node.FLAG_LOCAL_RESULTS);
        assertTrue(call.isNoSideEffectsCall());
        assertTrue(call.isLocalResultCall());
        assertFalse(call.mayMutateArguments());
        assertFalse(call.mayMutateGlobalStateOrThrow());
        call.setSideEffectFlags(Node.SIDE_EFFECTS_ALL);
        assertFalse(call.isNoSideEffectsCall());
        assertTrue(call.mayMutateArguments());
    }

    @Test
    public void testQualifiedNamesAndEmptyNameBoundary() throws Exception {
        Node simple = Node.newString(Token.NAME, "alpha");
        assertEquals("alpha", simple.getQualifiedName());
        assertTrue(simple.isQualifiedName());
        Node empty = Node.newString(Token.NAME, "");
        assertNull(empty.getQualifiedName());
        assertFalse(empty.isQualifiedName());
    }

    @Test
    public void testTreeEquivalenceAndDifference() throws Exception {
        Node left = new Node(Token.BLOCK, Node.newString("x"));
        Node right = left.cloneTree();
        assertTrue(left.isEquivalentTo(right));
        assertNull(left.checkTreeEquals(right));
        right.getFirstChild().setString("y");
        assertFalse(left.isEquivalentTo(right));
        assertNotNull(left.checkTreeEquals(right));
    }

    @Test
    public void testQuotedStringMutation() throws Exception {
        Node string = Node.newString("key");
        assertFalse(string.isQuotedString());
        string.setQuotedString();
        assertTrue(string.isQuotedString());
    }

    @Test
    public void testChildRemovalAndDetachChildren() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node one = Node.newString("one");
        Node two = Node.newString("two");
        parent.addChildToBack(one);
        parent.addChildToBack(two);
        assertEquals(one, parent.removeFirstChild());
        assertNull(one.getParent());
        parent.detachChildren();
        assertEquals(0, parent.getChildCount());
        assertNull(two.getParent());
    }

    @Test
    public void testSetTypeAndChildPresence() throws Exception {
        Node node = new Node(Token.EMPTY);
        assertFalse(node.hasChildren());
        node.setType(Token.BLOCK);
        node.addChildToFront(Node.newString("x"));
        assertEquals(Token.BLOCK, node.getType());
        assertTrue(node.hasChildren());
        assertEquals("x", node.getFirstChild().getString());
    }

    @Test
    public void testAddChildrenToFront() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node a = Node.newString("a");
        Node b = Node.newString("b");
        Node c = Node.newString("c");
        parent.addChildToBack(c);
        a.addChildToBack(b);
        Node detachedChildren = a.removeChildren();
        parent.addChildrenToFront(detachedChildren);
        assertEquals(3, parent.getChildCount());
        assertEquals(a, parent.getFirstChild());
        assertEquals(b, parent.getFirstChild().getNext());
        assertEquals(c, parent.getLastChild());
    }

    @Test
    public void testAddChildrenToBack() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node first = Node.newString("a");
        Node c = Node.newString("c");
        Node d = Node.newString("d");
        parent.addChildToBack(first);
        c.addChildToBack(d);
        Node detachedChildren = c.removeChildren();
        parent.addChildrenToBack(detachedChildren);
        assertEquals(3, parent.getChildCount());
        assertEquals(first, parent.getFirstChild());
        assertEquals(c, first.getNext());
        assertEquals(d, parent.getLastChild());
    }

    @Test
    public void testAddChildAfterAndChildrenAfter() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node a = Node.newString("a");
        Node d = Node.newString("d");
        parent.addChildToBack(a);
        parent.addChildToBack(d);
        Node b = Node.newString("b");
        parent.addChildAfter(b, a);
        Node c = Node.newString("c");
        Node e = Node.newString("e");
        c.addChildToBack(e);
        Node detachedChildren = c.removeChildren();
        parent.addChildrenAfter(detachedChildren, b);
        assertEquals(4, parent.getChildCount());
        assertEquals("a", parent.getFirstChild().getString());
        assertEquals("b", parent.getFirstChild().getNext().getString());
        assertEquals("c", parent.getFirstChild().getNext().getNext().getString());
        assertEquals("d", parent.getLastChild().getString());
    }

    @Test
    public void testReplaceChildAfter() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node a = Node.newString("a");
        Node b = Node.newString("b");
        Node c = Node.newString("c");
        parent.addChildToBack(a);
        parent.addChildToBack(b);
        parent.addChildToBack(c);
        Node replacement = Node.newString("x");
        parent.replaceChildAfter(a, replacement);
        assertEquals("a", parent.getFirstChild().getString());
        assertEquals("x", parent.getFirstChild().getNext().getString());
        assertEquals(c, parent.getLastChild());
        assertNull(b.getParent());
        assertEquals(parent, replacement.getParent());
    }

    @Test
    public void testClonePropsFromAndPropertyValue() throws Exception {
        Node original = new Node(Token.NAME);
        original.putProp(Node.INPUT_ID, "id");
        Node clone = new Node(Token.NAME);
        assertSame(clone, clone.clonePropsFrom(original));
        assertEquals("id", clone.getProp(Node.INPUT_ID));
        assertEquals("id", original.getProp(Node.INPUT_ID));
    }

    @Test
    public void testToStringTreeAndAppendStringTree() throws Exception {
        Node tree = new Node(Token.BLOCK, Node.newString("leaf"));
        String expected = tree.toStringTree();
        StringBuilder output = new StringBuilder();
        tree.appendStringTree(output);
        assertEquals(expected, output.toString());
        assertTrue(expected.contains("leaf"));
    }

    @Test
    public void testStaticSourceFileAndInputId() throws Exception {
        Node node = new Node(Token.SCRIPT);
        node.setSourceFileForTesting("unit.js");
        assertEquals("unit.js", node.getStaticSourceFile().getName());
        assertFalse(node.getStaticSourceFile().isExtern());
        assertNull(node.getInputId());
        node.setInputId(null);
        assertNull(node.getInputId());
    }

    @Test
    public void testLastSiblingAcrossSiblingChain() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node first = Node.newString("first");
        Node last = Node.newString("last");
        parent.addChildToBack(first);
        parent.addChildToBack(last);
        assertSame(last, first.getLastSibling());
        assertSame(last, last.getLastSibling());
    }
}
