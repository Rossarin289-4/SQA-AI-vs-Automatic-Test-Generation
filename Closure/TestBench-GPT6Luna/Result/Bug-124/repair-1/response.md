```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ExploitAssignsTest {
    @Test
    public void testCollapsesRepeatedName() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y")));
        Node second = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x"));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertSame(first, script.getFirstChild());
        assertSame(second.getFirstChild(), first.getFirstChild());
        assertEquals(Token.ASSIGN, first.getFirstChild().getType());
    }

    @Test
    public void testDoesNotCollapseDifferentName() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y")));
        Node second = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "z"));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertSame(first, script.getFirstChild());
        assertSame(second, first.getNext());
        assertEquals(Token.NAME, second.getFirstChild().getType());
        assertEquals("z", second.getFirstChild().getString());
    }

    @Test
    public void testCollapsesRepeatedNumberLiteral() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(7)));
        Node second = new Node(Token.EXPR_RESULT, Node.newNumber(7));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, second.getFirstChild().getType());
        assertEquals(7.0, second.getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testDoesNotCollapseDifferentNumberLiteral() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(7)));
        Node second = new Node(Token.EXPR_RESULT, Node.newNumber(8));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.NUMBER, second.getFirstChild().getType());
        assertEquals(8.0, second.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testCollapsesRepeatedBooleanLiteral() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.TRUE)));
        Node second = new Node(Token.EXPR_RESULT, new Node(Token.TRUE));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, second.getFirstChild().getType());
        assertEquals(Token.TRUE, second.getFirstChild().getLastChild().getType());
    }

    @Test
    public void testDoesNotCollapseDifferentBooleanLiteral() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.TRUE)));
        Node second = new Node(Token.EXPR_RESULT, new Node(Token.FALSE));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.FALSE, second.getFirstChild().getType());
    }

    @Test
    public void testCollapsesNameUsedInVarInitializer() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y")));
        Node varName = Node.newString(Token.NAME, "z");
        varName.addChildToBack(Node.newString(Token.NAME, "x"));
        Node var = new Node(Token.VAR, varName);
        script.addChildToBack(first);
        script.addChildToBack(var);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, var.getFirstChild().getLastChild().getType());
        assertEquals("x", var.getFirstChild().getLastChild().getFirstChild().getString());
    }

    @Test
    public void testDoesNotCollapseIntoUninitializedVar() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y")));
        Node var = new Node(Token.VAR, Node.newString(Token.NAME, "z"));
        script.addChildToBack(first);
        script.addChildToBack(var);

        new ExploitAssigns().optimizeSubtree(script);

        assertSame(first, script.getFirstChild());
        assertSame(var, first.getNext());
        assertEquals(Token.NAME, var.getFirstChild().getType());
    }

    @Test
    public void testCollapsesThroughReturn() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y")));
        Node ret = new Node(Token.RETURN, Node.newString(Token.NAME, "x"));
        script.addChildToBack(first);
        script.addChildToBack(ret);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, ret.getFirstChild().getType());
        assertEquals("x", ret.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testCollapsesThroughAndLeftSide() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y")));
        Node and = new Node(Token.AND, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "z"));
        Node second = new Node(Token.EXPR_RESULT, and);
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, and.getFirstChild().getType());
        assertEquals("x", and.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testDoesNotCollapseIntoCallExpression() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y")));
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        Node second = new Node(Token.EXPR_RESULT, call);
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertSame(call, second.getFirstChild());
        assertEquals(Token.CALL, second.getFirstChild().getType());
    }

    @Test
    public void testCollapsesAssignmentOnRightSide() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node first = new Node(Token.EXPR_RESULT,
                new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(3)));
        Node secondAssign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "y"), Node.newNumber(3));
        Node second = new Node(Token.EXPR_RESULT, secondAssign);
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, secondAssign.getLastChild().getType());
        assertEquals(Token.NUMBER, secondAssign.getLastChild().getLastChild().getType());
        assertEquals(3.0, secondAssign.getLastChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testDoesNotCollapseGetpropOnArbitraryObject() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node prop = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "p"));
        Node first = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, prop, Node.newNumber(3)));
        Node second = new Node(Token.EXPR_RESULT,
                new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "p")));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.GETPROP, second.getFirstChild().getType());
    }

    @Test
    public void testCollapsesThisGetprop() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node left = new Node(Token.GETPROP, new Node(Token.THIS), Node.newString(Token.STRING, "p"));
        Node first = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, left, Node.newNumber(3)));
        Node next = new Node(Token.GETPROP, new Node(Token.THIS), Node.newString(Token.STRING, "p"));
        Node second = new Node(Token.EXPR_RESULT, next);
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, second.getFirstChild().getType());
        assertEquals(3.0, second.getFirstChild().getLastChild().getDouble(), 0.0);
    }

    @Test
    public void testCollapsesNestedAssignmentToRepeatedName() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node inner = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(3));
        Node outer = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), inner);
        Node first = new Node(Token.EXPR_RESULT, outer);
        Node second = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x"));
        script.addChildToBack(first);
        script.addChildToBack(second);

        new ExploitAssigns().optimizeSubtree(script);

        assertEquals(Token.ASSIGN, second.getFirstChild().getType());
        assertEquals("x", second.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testPreservesEmptyScript() throws Exception {
        Node script = new Node(Token.SCRIPT);

        Node result = new ExploitAssigns().optimizeSubtree(script);

        assertSame(script, result);
        assertFalse(script.hasChildren());
    }
}
```