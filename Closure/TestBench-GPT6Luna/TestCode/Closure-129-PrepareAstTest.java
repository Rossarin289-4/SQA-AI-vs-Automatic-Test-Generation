package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PrepareAstTest {
    @Test
    public void testShouldTraverseObjectLiteral() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node object = new Node(Token.OBJECTLIT);
        assertTrue(callback.shouldTraverse(null, object, null));
    }

    @Test
    public void testShouldTraverseNonObjectLiteral() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node name = Node.newString(Token.NAME, "x");
        assertTrue(callback.shouldTraverse(null, name, null));
    }

    @Test
    public void testFreeCallIsAnnotated() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node callee = Node.newString(Token.NAME, "f");
        Node call = new Node(Token.CALL, callee);
        callback.visit(null, call, null);
        assertTrue(call.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testPropertyCallIsNotFree() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node receiver = Node.newString(Token.NAME, "o");
        Node property = Node.newString(Token.STRING, "m");
        Node callee = new Node(Token.GETPROP, receiver, property);
        Node call = new Node(Token.CALL, callee);
        callback.visit(null, call, null);
        assertFalse(call.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testDirectEvalIsAnnotated() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node eval = Node.newString(Token.NAME, "eval");
        Node call = new Node(Token.CALL, eval);
        callback.visit(null, call, null);
        assertTrue(eval.getBooleanProp(Node.DIRECT_EVAL));
    }

    @Test
    public void testOtherFreeCallIsNotDirectEval() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node callee = Node.newString(Token.NAME, "f");
        Node call = new Node(Token.CALL, callee);
        callback.visit(null, call, null);
        assertFalse(callee.getBooleanProp(Node.DIRECT_EVAL));
    }

    @Test
    public void testCallThroughCastIsAnnotated() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node name = Node.newString(Token.NAME, "f");
        Node cast = new Node(Token.CAST, name);
        Node call = new Node(Token.CALL, cast);
        callback.visit(null, call, null);
        assertTrue(call.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testCallThroughCastToEvalIsDirectEval() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node eval = Node.newString(Token.NAME, "eval");
        Node cast = new Node(Token.CAST, eval);
        Node call = new Node(Token.CALL, cast);
        callback.visit(null, call, null);
        assertTrue(eval.getBooleanProp(Node.DIRECT_EVAL));
    }

    @Test
    public void testCommaCallIsFreeAndNotDirectEval() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node comma = new Node(Token.COMMA,
                Node.newNumber(0), Node.newString(Token.NAME, "eval"));
        Node call = new Node(Token.CALL, comma);
        callback.visit(null, call, null);
        assertTrue(call.getBooleanProp(Node.FREE_CALL));
        assertFalse(comma.getFirstChild().getNext()
                .getBooleanProp(Node.DIRECT_EVAL));
    }

    @Test
    public void testVisitNonCallLeavesFreeCallUnset() throws Exception {
        PrepareAst.PrepareAnnotations callback =
                new PrepareAst.PrepareAnnotations();
        Node name = Node.newString(Token.NAME, "f");
        callback.visit(null, name, null);
        assertFalse(name.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testProcessWithNullRootsReturnsNormally() throws Exception {
        PrepareAst pass = new PrepareAst(null);
        pass.process(null, null);
        assertTrue(true);
    }

    @Test
    public void testCheckOnlyProcessWithSimpleRootReturnsNormally()
            throws Exception {
        PrepareAst pass = new PrepareAst(null, true);
        Node root = new Node(Token.SCRIPT);
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
    }
}
