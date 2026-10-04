package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

public class TypeCheckTest {
    @Test
    public void testGetTypedPercentUnconfigured() throws Exception {
        fail("getTypedPercent is not public and cannot be called by this test");
    }

    @Test
    public void testProcessRequiresConfiguredScope() throws Exception {
        fail("process requires a scope creator and top scope that are not available here");
    }

    @Test
    public void testProcessForTestingRequiresParentedJsRoot() throws Exception {
        fail("processForTesting requires a configured compiler and parented roots");
    }

    @Test
    public void testCheckRequiresCompilerTraversalContext() throws Exception {
        fail("check requires a compiler and traversal context that cannot be constructed from the visible API");
    }

    @Test
    public void testShouldTraverseRequiresTraversal() throws Exception {
        fail("shouldTraverse requires a NodeTraversal instance that cannot be constructed from the visible API");
    }

    @Test
    public void testVisitRequiresTraversal() throws Exception {
        fail("visit requires a NodeTraversal instance that cannot be constructed from the visible API");
    }

    @Test
    public void testTokenNumberNodeConstruction() throws Exception {
        Node node = Node.newNumber(1.0);
        assertEquals(Token.NUMBER, node.getType());
        assertEquals(1.0, node.getDouble(), 0.0);
    }

    @Test
    public void testTokenStringNodeConstruction() throws Exception {
        Node node = Node.newString("x");
        assertEquals(Token.STRING, node.getType());
    }

    @Test
    public void testTokenNameNodeConstruction() throws Exception {
        Node node = Node.newString(Token.NAME, "x");
        assertEquals(Token.NAME, node.getType());
    }

    @Test
    public void testTokenParentChildConstruction() throws Exception {
        Node child = Node.newNumber(1.0);
        Node parent = new Node(Token.ADD, child, Node.newNumber(2.0));
        assertEquals(Token.ADD, parent.getType());
        assertEquals(child, parent.getFirstChild());
    }

    @Test
    public void testTokenNameDeclarationAvailable() throws Exception {
        assertEquals("NAME", Token.name(Token.NAME));
    }

    @Test
    public void testPreconditionsCheckNotNull() throws Exception {
        Object value = new Object();
        assertSame(value, Preconditions.checkNotNull(value));
    }

    @Test
    public void testPreconditionsCheckArgument() throws Exception {
        Preconditions.checkArgument(true);
        assertTrue(true);
    }

    @Test
    public void testNodeChildCountViaChildren() throws Exception {
        Node parent = new Node(Token.ADD, Node.newNumber(1.0), Node.newNumber(2.0));
        assertEquals(2, parent.getChildCount());
    }

    @Test
    public void testNodeLastChild() throws Exception {
        Node last = Node.newNumber(2.0);
        Node parent = new Node(Token.ADD, Node.newNumber(1.0), last);
        assertSame(last, parent.getLastChild());
    }

    @Test
    public void testNodeTypeMutation() throws Exception {
        Node node = Node.newNumber(1.0);
        node.setType(Token.STRING);
        assertEquals(Token.STRING, node.getType());
    }

    @Test
    public void testNodeNewStringValue() throws Exception {
        Node node = Node.newString("x");
        assertEquals("x", node.getString());
    }

    @Test
    public void testNodeNumberValue() throws Exception {
        Node node = Node.newNumber(2.0);
        assertEquals(2.0, node.getDouble(), 0.0);
    }

    @Test
    public void testNodeAddChildToBack() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node child = Node.newNumber(1.0);
        parent.addChildToBack(child);
        assertSame(child, parent.getFirstChild());
    }

    @Test
    public void testNodeAddChildToFront() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node first = Node.newNumber(1.0);
        Node second = Node.newNumber(2.0);
        parent.addChildToBack(second);
        parent.addChildToFront(first);
        assertSame(first, parent.getFirstChild());
    }

    @Test
    public void testProcessRejectsMissingScopeCreator() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.process(null, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingRejectsMissingParent() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.processForTesting(null, new Node(Token.SCRIPT));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testCheckRejectsNullNode() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.check(null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testShouldTraverseRejectsMissingTraversal() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.shouldTraverse(null, new Node(Token.SCRIPT), null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testVisitRejectsMissingTraversalForLiteral() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.visit(null, new Node(Token.TRUE), null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testCheckRejectsNullEvenWithExternFlag() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.check(null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingRejectsNullParent() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        Node jsRoot = new Node(Token.SCRIPT);
        try {
            checker.processForTesting(null, jsRoot);
            fail("expected IllegalStateException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testVisitNumberRequiresTraversal() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.visit(null, Node.newNumber(0.0), new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testShouldTraverseRequiresTraversalForScript() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null);
        try {
            checker.shouldTraverse(null, new Node(Token.SCRIPT), new Node(Token.BLOCK));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
