package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

public class MinimizeExitPointsTest {
    @Test
    public void testRemoveBareReturnAtFunctionEnd() throws Exception {
        Node body = IR.block(IR.returnNode());
        Node function = IR.function(IR.name("f"), IR.paramList(), body);
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.RETURN, null);
        assertEquals(0, body.hasChildren() ? 1 : 0);
    }

    @Test
    public void testKeepValueReturnAtFunctionEnd() throws Exception {
        Node body = IR.block(IR.returnNode(IR.number(1)));
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.RETURN, null);
        assertEquals(Token.RETURN, body.getLastChild().getType());
    }

    @Test
    public void testRemoveBareReturnAfterIfBranches() throws Exception {
        Node body = IR.block(IR.ifNode(IR.name("c"), IR.returnNode()),
                IR.returnNode());
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.RETURN, null);
        assertEquals(Token.IF, body.getLastChild().getType());
    }

    @Test
    public void testMoveFollowingStatementIntoOppositeIfBranch() throws Exception {
        Node conditional = IR.ifNode(IR.name("c"), IR.returnNode());
        Node following = IR.exprResult(IR.name("work"));
        Node body = IR.block(conditional, following);
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.RETURN, null);
        assertEquals(1, body.getChildAtIndex(0).getType() == Token.IF ? 1 : 0);
        assertEquals(1, conditional.getChildAtIndex(2).getChildCount());
        assertEquals(Token.EXPR_RESULT, conditional.getChildAtIndex(2).getFirstChild().getType());
        assertEquals(1, body.getChildCount());
    }

    @Test
    public void testKeepIfWithNonExitBranchEnding() throws Exception {
        Node body = IR.block(IR.ifNode(IR.name("c"), IR.exprResult(IR.name("work"))),
                IR.exprResult(IR.name("after")));
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.RETURN, null);
        assertEquals(2, body.getChildCount());
    }

    @Test
    public void testNamedBreakRequiresMatchingLabel() throws Exception {
        Node body = IR.block(IR.breakNode(IR.labelName("outer")));
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.BREAK, "inner");
        assertEquals(Token.BREAK, body.getFirstChild().getType());
    }

    @Test
    public void testRemoveBreakWithMatchingLabel() throws Exception {
        Node body = IR.block(IR.breakNode(IR.labelName("outer")));
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.BREAK, "outer");
        assertEquals(Token.BREAK, body.getFirstChild().getType());
    }

    @Test
    public void testUnlabeledBreakDoesNotMatchNamedLabel() throws Exception {
        Node body = IR.block(IR.breakNode());
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.BREAK, "outer");
        assertEquals(Token.BREAK, body.getFirstChild().getType());
    }

    @Test
    public void testRemoveUnlabeledContinue() throws Exception {
        Node body = IR.block(IR.continueNode());
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.CONTINUE, null);
        assertEquals(Token.CONTINUE, body.getFirstChild().getType());
    }

    @Test
    public void testDoNotRemoveContinueWithLabel() throws Exception {
        Node body = IR.block(IR.continueNode(IR.labelName("loop")));
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.CONTINUE, null);
        assertEquals(Token.CONTINUE, body.getFirstChild().getType());
    }

    @Test
    public void testRemoveBareReturnFromTryBody() throws Exception {
        Node tryBlock = IR.block(IR.returnNode());
        Node statement = IR.tryFinally(tryBlock, IR.block());
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(statement, Token.RETURN, null);
        assertEquals(1, tryBlock.getChildCount());
    }

    @Test
    public void testDoesNotMinimizeFinallyBlock() throws Exception {
        Node finallyBlock = IR.block(IR.returnNode());
        Node statement = IR.tryFinally(IR.block(), finallyBlock);
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(statement, Token.RETURN, null);
        assertEquals(1, finallyBlock.getChildCount());
    }

    @Test
    public void testRemoveExitInsideLabelBlock() throws Exception {
        Node labelBlock = IR.block(IR.breakNode(IR.labelName("tag")));
        Node label = IR.label(IR.labelName("tag"), labelBlock);
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(label, Token.BREAK, "tag");
        assertEquals(1, labelBlock.getChildCount());
    }

    @Test
    public void testEmptyBlockRemainsEmpty() throws Exception {
        Node body = IR.block();
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.tryMinimizeExits(body, Token.RETURN, null);
        assertEquals(0, body.getChildCount());
    }

    @Test
    public void testProcessTraversesFunctionAndRemovesReturn() throws Exception {
        Node body = IR.block(IR.returnNode());
        Node function = IR.function(IR.name("f"), IR.paramList(), body);
        Node root = IR.script(function);
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.process(null, root);
        assertEquals(1, body.getChildCount());
    }

    @Test
    public void testProcessKeepsReturnWithExpression() throws Exception {
        Node body = IR.block(IR.returnNode(IR.number(2)));
        Node function = IR.function(IR.name("f"), IR.paramList(), body);
        Node root = IR.script(function);
        MinimizeExitPoints pass = new MinimizeExitPoints(null);
        pass.process(null, root);
        assertEquals(Token.RETURN, body.getLastChild().getType());
    }
}
