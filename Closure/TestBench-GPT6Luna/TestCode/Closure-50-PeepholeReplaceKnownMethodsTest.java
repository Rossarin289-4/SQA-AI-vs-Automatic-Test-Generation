package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Locale;

public class PeepholeReplaceKnownMethodsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNonCallNodeIsUnchanged() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node input = Node.newString("unchanged");
        assertSame(input, optimization.optimizeSubtree(input));
    }

    @Test
    public void testLowercaseUsesRootLocale() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("HeLLo"), Node.newString("toLowerCase")));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals("hello", optimization.optimizeSubtree(call).getString());
    }

    @Test
    public void testUppercaseUsesRootLocale() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("MiXeD"), Node.newString("toUpperCase")));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals("MIXED", optimization.optimizeSubtree(call).getString());
    }

    @Test
    public void testIndexOfFindsMiddleMatch() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("indexOf")),
                Node.newString("cd"));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals(2.0, optimization.optimizeSubtree(call).getDouble(), 0.0);
    }

    @Test
    public void testIndexOfAtStringEndDoesNotMatch() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abc"), Node.newString("z")),
                Node.newString("a"));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertSame(call, optimization.optimizeSubtree(call));
    }

    @Test
    public void testLastIndexOfUsesLastOccurrence() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("ababa"), Node.newString("lastIndexOf")),
                Node.newString("ba"));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals(3.0, optimization.optimizeSubtree(call).getDouble(), 0.0);
    }

    @Test
    public void testSubstrWithoutLengthUsesRemainder() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substr")),
                Node.newNumber(2));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals("cdef", optimization.optimizeSubtree(call).getString());
    }

    @Test
    public void testSubstrEndingAtStringBoundary() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substr")),
                Node.newNumber(3), Node.newNumber(3));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals("def", optimization.optimizeSubtree(call).getString());
    }

    @Test
    public void testSubstrRejectsNegativeStart() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abc"), Node.newString("substr")),
                Node.newNumber(-1));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertSame(call, optimization.optimizeSubtree(call));
    }

    @Test
    public void testSubstringSwapsReversedBoundsThroughStringSemantics() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("substring")),
                Node.newNumber(2), Node.newNumber(4));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals("cd", optimization.optimizeSubtree(call).getString());
    }

    @Test
    public void testSubstringAtEndProducesEmptyString() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abc"), Node.newString("substring")),
                Node.newNumber(3));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals("", optimization.optimizeSubtree(call).getString());
    }

    @Test
    public void testCharAtLastIndex() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abc"), Node.newString("charAt")),
                Node.newNumber(2));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals("c", optimization.optimizeSubtree(call).getString());
    }

    @Test
    public void testCharAtPastLastIndexIsUnchanged() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("abc"), Node.newString("charAt")),
                Node.newNumber(3));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertSame(call, optimization.optimizeSubtree(call));
    }

    @Test
    public void testCharCodeAtFirstIndex() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, Node.newString("Az"), Node.newString("charCodeAt")),
                Node.newNumber(0));
        Node parent = Node.newString("parent");
        parent.addChildToBack(call);
        assertEquals(65.0, optimization.optimizeSubtree(call).getDouble(), 0.0);
    }

    @Test
    public void testJoinWithCommaSeparator() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToBack(Node.newString("a"));
        array.addChildToBack(Node.newString("b"));
        Node call = new Node(Token.CALL,
                new Node(Token.GETPROP, array, Node.newString("join")),
                Node.newString(","));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(call);
        Node result = optimization.optimizeSubtree(call);
        assertEquals("a,b", array.getFirstChild().getString() + "," + array.getLastChild().getString());
        assertSame(call, result);
    }

    @Test
    public void testParseIntDecimalString() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "parseInt"),
                Node.newString("123"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(call);
        optimization.beginTraversal(null);
        assertEquals(123.0, optimization.optimizeSubtree(call).getDouble(), 0.0);
    }

    @Test
    public void testParseIntLargestPositiveInt() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "parseInt"),
                Node.newString("2147483647"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(call);
        optimization.beginTraversal(null);
        assertEquals(2147483647.0, optimization.optimizeSubtree(call).getDouble(), 0.0);
    }

    @Test
    public void testParseIntBeyondPositiveIntRemainsCall() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "parseInt"),
                Node.newString("2147483648"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(call);
        optimization.beginTraversal(null);
        assertSame(call, optimization.optimizeSubtree(call));
    }

    @Test
    public void testParseIntHexPrefix() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "parseInt"),
                Node.newString("0x2a"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(call);
        optimization.beginTraversal(null);
        assertEquals(42.0, optimization.optimizeSubtree(call).getDouble(), 0.0);
    }

    @Test
    public void testParseFloatDecimal() throws Exception {
        PeepholeReplaceKnownMethods optimization = new PeepholeReplaceKnownMethods();
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "parseFloat"),
                Node.newString("12.5"));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(call);
        optimization.beginTraversal(null);
        assertEquals(12.5, optimization.optimizeSubtree(call).getDouble(), 0.0);
    }
}
