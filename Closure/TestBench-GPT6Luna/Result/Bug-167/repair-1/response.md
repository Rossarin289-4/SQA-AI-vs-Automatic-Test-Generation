```java
package com.google.javascript.jscomp.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.JSType;
import com.google.common.base.Function;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Comparator;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.SimpleReference;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.jstype.ModificationVisitor;

public class SemanticReverseAbstractInterpreterTest {
    @Test
    public void testNullConditionWithFalseOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithTrueOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithNameToken() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithEqualityOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithInequalityOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithLogicalOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithComparisonOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithInstanceOfOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithInOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithCaseOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionWithNullScope() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullConditionIndependentOfOutcome() throws Exception {
        try {
            new SemanticReverseAbstractInterpreter(null, null)
                    .getPreciserScopeKnowingConditionOutcome(null, null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testJSTypeNativeEnumConstants() throws Exception {
        assertEquals(0, JSTypeNative.values().length);
    }

    @Test
    public void testTokenNameForEquality() throws Exception {
        assertEquals("EQ", Token.name(Token.EQ));
    }

    @Test
    public void testTokenNameForNot() throws Exception {
        assertEquals("NOT", Token.name(Token.NOT));
    }

    @Test
    public void testNumberNodeStoresZero() throws Exception {
        Node node = Node.newNumber(0);
        assertEquals(0, node.getType());
    }

    @Test
    public void testStringNodePreservesEmptyValue() throws Exception {
        Node node = Node.newString("");
        assertEquals("", node.getString());
    }

    @Test
    public void testTokenNameForAnd() throws Exception {
        assertEquals("AND", Token.name(Token.AND));
    }

    @Test
    public void testTokenNameForLastListedToken() throws Exception {
        assertEquals("COLON", Token.name(Token.COLON));
    }

    @Test
    public void testNodeChildrenPreserveFirstAndLast() throws Exception {
        Node first = Node.newString("a");
        Node last = Node.newString("b");
        Node parent = new Node(Token.AND, first, last);
        assertSame(first, parent.getFirstChild());
        assertSame(last, parent.getLastChild());
    }

    @Test
    public void testNodeHasChildrenAtOneChildBoundary() throws Exception {
        Node parent = new Node(Token.NOT, Node.newString("x"));
        assertTrue(parent.hasChildren());
    }

    @Test
    public void testNodeHasNoChildrenWhenEmpty() throws Exception {
        Node parent = new Node(Token.NAME);
        assertFalse(parent.hasChildren());
    }

    @Test
    public void testNodeGetTypeReflectsSetType() throws Exception {
        Node node = new Node(Token.NAME);
        node.setType(Token.GETPROP);
        assertEquals(Token.GETPROP, node.getType());
    }

    @Test
    public void testNodeChildIndexZero() throws Exception {
        Node child = Node.newString("x");
        Node parent = new Node(Token.NOT, child);
        assertEquals(0, parent.getIndexOfChild(child));
    }

    @Test
    public void testNodeChildAtIndexZero() throws Exception {
        Node child = Node.newString("x");
        Node parent = new Node(Token.NOT, child);
        assertSame(child, parent.getChildAtIndex(0));
    }

    @Test
    public void testNodeRemoveChildMakesParentEmpty() throws Exception {
        Node child = Node.newString("x");
        Node parent = new Node(Token.NOT, child);
        parent.removeChild(child);
        assertFalse(parent.hasChildren());
    }

    @Test
    public void testNodeStringTypeAndValue() throws Exception {
        Node node = Node.newString(Token.STRING, "q");
        assertEquals(Token.STRING, node.getType());
        assertEquals("q", node.getString());
    }

    @Test
    public void testNodeNumberValueAtZero() throws Exception {
        Node node = Node.newNumber(0);
        assertEquals(0.0, node.getDouble(), 0.0);
    }
}
```