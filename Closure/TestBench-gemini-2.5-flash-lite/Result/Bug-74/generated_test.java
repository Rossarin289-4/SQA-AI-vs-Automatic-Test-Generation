package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.io.Serializable;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Math;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.AssertionError;
import java.lang.RuntimeException;
import java.text.MessageFormat;

public class PeepholeFoldConstantsTest {

    private PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();

    // Helper method to create a Node representing a number.
    private Node createNodeFromNumber(double d) {
        return Node.newNumber(d);
    }

    // Helper method to create a Node representing a string.
    private Node createNodeFromString(String s) {
        return Node.newString(s);
    }

    // Helper method to create a Node representing a boolean.
    private Node createNodeFromBoolean(boolean b) {
        return new Node(b ? Token.TRUE : Token.FALSE);
    }

    // Helper method to create a Node representing null.
    private Node createNodeFromNull() {
        return new Node(Token.NULL);
    }

    // Helper method to create a Node representing undefined (as a NAME token).
    private Node createNodeFromUndefinedName() {
        return new Node(Token.NAME, Node.newString("undefined"));
    }

    // Helper method to create a void node.
    private Node createNodeFromVoid() {
        return new Node(Token.VOID);
    }

    // Mock compiler for PeepholeFoldConstants and NodeUtil.










































































    @Test
    public void testFoldVoidNonZero() throws Exception {
        Node voidNode = new Node(Token.VOID, createNodeFromString("something"));
        Node parent = new Node(Token.EXPR_RESULT, voidNode); // Parent for replaceChild
        // Need to pass the compiler to optimizeSubtree if it were to call reportCodeChange()
        // PeepholeFoldConstants' optimizeSubtree calls reportCodeChange directly, which we mocked.
        peepholeFoldConstants.optimizeSubtree(voidNode);
        Node replacedNode = parent.getFirstChild();
        assertEquals(Token.NUMBER, replacedNode.getType());
        assertEquals(0.0, replacedNode.getDouble(), 1e-9);
    }







}





