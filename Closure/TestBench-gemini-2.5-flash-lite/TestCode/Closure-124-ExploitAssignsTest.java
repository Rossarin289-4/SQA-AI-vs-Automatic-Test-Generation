package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ExploitAssignsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }




























    @Test
    public void testCollapseAssignToGetPropOnThisIntoItself() throws Exception {
        ExploitAssigns peephole = new ExploitAssigns();
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("prop"));
        Node assignNode = Node.newAssign(getProp, Node.newNumber(1.0)); // this.prop = 1
        Node expr = Node.newExpr(assignNode);
        Node parent = Node.newBlock(expr);

        Node nextAssign = Node.newAssign(getProp, Node.newName("x")); // this.prop = x
        parent.addChildToBack(Node.newExpr(nextAssign));

        peephole.optimizeSubtree(parent);

        // Expected: this.prop = 1; this.prop = x; (no change)
        assertEquals(Token.EXPR_RESULT, parent.getFirstChild().getType());
        assertEquals(Token.ASSIGN, parent.getFirstChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getFirstChild().getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop", parent.getFirstChild().getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals(1.0, parent.getFirstChild().getFirstChild().getLastChild().getDouble(), 0.0);

        assertEquals(Token.EXPR_RESULT, parent.getLastChild().getType());
        assertEquals(Token.ASSIGN, parent.getLastChild().getFirstChild().getType());
        assertEquals(Token.GETPROP, parent.getLastChild().getFirstChild().getFirstChild().getType());
        assertEquals(Token.THIS, parent.getLastChild().getFirstChild().getFirstChild().getFirstChild().getType());
        assertEquals("prop", parent.getLastChild().getFirstChild().getFirstChild().getLastChild().getString());
        assertEquals("x", parent.getLastChild().getFirstChild().getLastChild().getString());
    }
}





