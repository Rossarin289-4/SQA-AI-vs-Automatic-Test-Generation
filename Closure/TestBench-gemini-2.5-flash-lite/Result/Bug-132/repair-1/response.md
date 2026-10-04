```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PeepholeSubstituteAlternateSyntaxTest {

    // Helper to create a Node of a specific type and value
    private Node createNode(int type, Object value) {
        Node node = null;
        switch (type) {
            case Token.STRING:
                node = IR.string((String) value);
                break;
            case Token.NUMBER:
                node = IR.number((Double) value);
                break;
            case Token.TRUE:
                node = IR.trueNode();
                break;
            case Token.FALSE:
                node = IR.falseNode();
                break;
            case Token.NAME:
                node = IR.name((String) value);
                break;
            case Token.CALL:
                node = (Node) value; // value should be a Node
                break;
            case Token.NEW:
                node = (Node) value; // value should be a Node
                break;
            case Token.OBJECTLIT:
                node = IR.objectlit();
                break;
            case Token.ARRAYLIT:
                node = IR.arraylit();
                break;
            case Token.REGEXP:
                node = (Node) value; // value should be a Node
                break;
            case Token.RETURN:
                node = IR.returnNode((Node) value);
                break;
            case Token.THROW:
                node = IR.throwNode((Node) value);
                break;
            case Token.IF:
                node = (Node) value; // value should be a Node
                break;
            case Token.HOOK:
                node = (Node) value; // value should be a Node
                break;
            case Token.ASSIGN:
                node = (Node) value; // value should be a Node
                break;
            case Token.ADD:
                node = (Node) value; // value should be a Node
                break;
            case Token.OR:
                node = (Node) value; // value should be a Node
                break;
            case Token.AND:
                node = (Node) value; // value should be a Node
                break;
            case Token.NOT:
                node = (Node) value; // value should be a Node
                break;
            case Token.EQ:
                node = (Node) value; // value should be a Node
                break;
            case Token.NE:
                node = (Node) value; // value should be a Node
                break;
            case Token.VOID:
                node = IR.voidNode((Node) value);
                break;
            case Token.EXPR_RESULT:
                node = IR.exprResult((Node) value);
                break;
            default:
                throw new IllegalArgumentException("Unsupported token type: " + type);
        }
        return node;
    }

    // Helper to simplify AST creation for specific tests
    private Node createCall(String functionName, Node... args) {
        Node nameNode = IR.name(functionName);
        Node callNode = IR.call(nameNode, args);
        return callNode;
    }

    private Node createNew(String className, Node... args) {
        // Node constructor for NEW takes the className and then children nodes
        Node nameNode = IR.name(className);
        Node newNode = new Node(Token.NEW, nameNode, args); // Corrected constructor call
        return newNode;
    }

    private PeepholeSubstituteAlternateSyntax createOptimizer(boolean late) {
        // We need a minimal Compiler instance for the optimizer to use
        // The Compiler.init() method requires arguments that are not readily available or necessary for this test.
        // A simpler approach for testing peephole optimizers is often to not require a full Compiler instance if possible,
        // or to mock the necessary parts. However, looking at the PeepholeSubstituteAlternateSyntax constructor,
        // it doesn't take a compiler. Let's assume it doesn't *need* a full compiler for this test.
        // The error message for compiler.init() suggests it's part of a larger initialization process.
        // For standalone testing of PeepholeSubstituteAlternateSyntax, we can likely omit the Compiler instantiation and init.
        return new PeepholeSubstituteAlternateSyntax(late);
    }

    // Test for tryRemoveRedundantExit
    @Test
    public void testTryRemoveRedundantExit_return() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnNode = IR.returnNode(IR.number(1));
        Node parent = IR.block(returnNode); // Wrap in a block for context
        returnNode.setParent(parent); // Use setParent from Node API

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNull(result); // Should be removed
    }

    @Test
    public void testTryRemoveRedundantExit_throw() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node throwNode = IR.throwNode(IR.string("error"));
        Node parent = IR.block(throwNode);
        throwNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(throwNode);

        assertNull(result); // Should be removed
    }

    @Test
    public void testTryRemoveRedundantExit_noRemoval() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnNode = IR.returnNode(IR.number(1));
        Node followedBy = IR.string("something else"); // Something that does not match
        Node parent = IR.block(returnNode, followedBy);
        returnNode.setParent(parent);
        followedBy.setParent(parent);

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNotNull(result); // Should not be removed
        assertEquals(Token.RETURN, result.getType());
    }

    // Test for tryReplaceExitWithBreak
    @Test
    public void testTryReplaceExitWithBreak_return() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node loopBody = IR.block();
        Node whileNode = IR.whileNode(IR.trueNode(), loopBody); // Simple while loop
        Node returnNode = IR.returnNode(IR.number(1));
        loopBody.addChildToBack(returnNode);
        returnNode.setParent(loopBody); // Use setParent from Node API

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNotNull(result);
        assertEquals(Token.BREAK, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testTryReplaceExitWithBreak_throw() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node loopBody = IR.block();
        Node whileNode = IR.whileNode(IR.trueNode(), loopBody); // Simple while loop
        Node throwNode = IR.throwNode(IR.string("error"));
        loopBody.addChildToBack(throwNode);
        throwNode.setParent(loopBody);

        Node result = optimizer.optimizeSubtree(throwNode);

        assertNotNull(result);
        assertEquals(Token.BREAK, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testTryReplaceExitWithBreak_noReplacementIfNoBreakTarget() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnNode = IR.returnNode(IR.number(1));
        Node parent = IR.script(returnNode); // Not inside a loop or switch
        returnNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType()); // Should remain return
    }

    // Test for tryMinimizeNot
    @Test
    public void testTryMinimizeNot_eq_ne() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node notNode = IR.not(IR.eq(IR.number(1), IR.number(2)));
        Node parent = IR.exprResult(notNode);
        notNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(notNode);

        assertNotNull(result);
        assertEquals(Token.NE, result.getType());
        assertEquals(Token.NUMBER, result.getFirstChild().getType());
        assertEquals(1.0, result.getFirstChild().getDouble(), 0.00001);
        assertEquals(Token.NUMBER, result.getLastChild().getType());
        assertEquals(2.0, result.getLastChild().getDouble(), 0.00001);
    }

    @Test
    public void testTryMinimizeNot_ne_eq() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node notNode = IR.not(IR.ne(IR.number(1), IR.number(2)));
        Node parent = IR.exprResult(notNode);
        notNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(notNode);

        assertNotNull(result);
        assertEquals(Token.EQ, result.getType());
        assertEquals(Token.NUMBER, result.getFirstChild().getType());
        assertEquals(1.0, result.getFirstChild().getDouble(), 0.00001);
        assertEquals(Token.NUMBER, result.getLastChild().getType());
        assertEquals(2.0, result.getLastChild().getDouble(), 0.00001);
    }

    @Test
    public void testTryMinimizeNot_sheq_shne() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node notNode = IR.not(IR.sheq(IR.number(1), IR.number(2)));
        Node parent = IR.exprResult(notNode);
        notNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(notNode);

        assertNotNull(result);
        assertEquals(Token.SHNE, result.getType());
    }

    @Test
    public void testTryMinimizeNot_shne_sheq() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node notNode = IR.not(IR.shne(IR.number(1), IR.number(2)));
        Node parent = IR.exprResult(notNode);
        notNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(notNode);

        assertNotNull(result);
        assertEquals(Token.SHEQ, result.getType());
    }

    @Test
    public void testTryMinimizeNot_otherOperator() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node notNode = IR.not(IR.lt(IR.number(1), IR.number(2))); // LT is not handled
        Node parent = IR.exprResult(notNode);
        notNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(notNode);

        assertNotNull(result);
        assertEquals(Token.NOT, result.getType()); // Should remain NOT
        assertEquals(Token.LT, result.getFirstChild().getType());
    }

    // Test for tryMinimizeIf
    @Test
    public void testTryMinimizeIf_ifThenElse_toHook() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node cond = IR.trueNode();
        Node thenExpr = IR.string("a");
        Node elseExpr = IR.string("b");
        Node thenBlock = IR.block(IR.exprResult(thenExpr));
        Node elseBlock = IR.block(IR.exprResult(elseExpr));
        Node ifNode = IR.ifNode(cond, thenBlock, elseBlock);
        Node parent = IR.block(ifNode);
        ifNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(ifNode);

        assertNotNull(result);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertEquals(Token.HOOK, result.getFirstChild().getType());
        assertEquals(Token.TRUE, result.getFirstChild().getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getChildAtIndex(1).getString());
        assertEquals("b", result.getFirstChild().getLastChild().getString());
    }

    @Test
    public void testTryMinimizeIf_ifThen_toAnd() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node cond = IR.trueNode();
        Node expr = IR.string("a");
        Node thenBlock = IR.block(IR.exprResult(expr));
        Node ifNode = IR.ifNode(cond, thenBlock);
        Node parent = IR.block(ifNode);
        ifNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(ifNode);

        assertNotNull(result);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertEquals(Token.AND, result.getFirstChild().getType());
        assertEquals(Token.TRUE, result.getFirstChild().getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getLastChild().getString());
    }

    @Test
    public void testTryMinimizeIf_ifThen_toOr_whenConditionIsNot() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node cond = IR.not(IR.falseNode()); // Equivalent to true
        Node expr = IR.string("a");
        Node thenBlock = IR.block(IR.exprResult(expr));
        Node ifNode = IR.ifNode(cond, thenBlock);
        Node parent = IR.block(ifNode);
        ifNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(ifNode);

        assertNotNull(result);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertEquals(Token.OR, result.getFirstChild().getType()); // Should become OR
        assertEquals(Token.FALSE, result.getFirstChild().getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getLastChild().getString());
    }


    // Test for tryReplaceUndefined
    @Test
    public void testTryReplaceUndefined_undefined() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node undefinedNode = IR.name("undefined");
        Node parent = IR.exprResult(undefinedNode);
        undefinedNode.setParent(parent);

        // The method is tryReplaceUndefined, so we call optimizeSubtree on the node that *contains* it,
        // or the node itself if it's the target. optimizeSubtree is called on the root of the subtree.
        // For this test, we call it on undefinedNode.
        Node result = optimizer.optimizeSubtree(undefinedNode);

        assertNotNull(result);
        assertEquals(Token.VOID, result.getType());
        assertEquals(Token.NUMBER, result.getFirstChild().getType());
        assertEquals(0.0, result.getFirstChild().getDouble(), 0.00001);
    }

    @Test
    public void testTryReplaceUndefined_voidZero() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node voidNode = IR.voidNode(IR.number(0));
        Node parent = IR.exprResult(voidNode);
        voidNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(voidNode);

        assertNotNull(result);
        assertEquals(Token.VOID, result.getType());
        assertEquals(Token.NUMBER, result.getFirstChild().getType());
        assertEquals(0.0, result.getFirstChild().getDouble(), 0.00001);
    }

    @Test
    public void testTryReplaceUndefined_identifierNotUndefined() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node nameNode = IR.name("someName");
        Node parent = IR.exprResult(nameNode);
        nameNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(nameNode);

        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("someName", result.getString()); // Should remain unchanged
    }

    // Test for tryReduceReturn
    @Test
    public void testTryReduceReturn_returnUndefined() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnNode = IR.returnNode(IR.name("undefined"));
        Node parent = IR.block(returnNode);
        returnNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
        assertFalse(result.hasChildren()); // Should be reduced to just "return;"
    }

    @Test
    public void testTryReduceReturn_returnVoidZero() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnNode = IR.returnNode(IR.voidNode(IR.number(0)));
        Node parent = IR.block(returnNode);
        returnNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
        assertFalse(result.hasChildren()); // Should be reduced to just "return;"
    }

    @Test
    public void testTryReduceReturn_returnVoidOne() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnNode = IR.returnNode(IR.voidNode(IR.number(1))); // void 1 is pure
        Node parent = IR.block(returnNode);
        returnNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
        assertFalse(result.hasChildren()); // Should be reduced to just "return;"
    }

    @Test
    public void testTryReduceReturn_returnVoidExpressionWithSideEffects() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node callNode = createCall("foo"); // Assume foo has side effects
        Node returnNode = IR.returnNode(IR.voidNode(callNode));
        Node parent = IR.block(returnNode);
        returnNode.setParent(parent);
        callNode.setParent(returnNode);

        Node result = optimizer.optimizeSubtree(returnNode);

        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
        assertTrue(result.hasChildren()); // Should not be reduced if side effect
        assertEquals(Token.VOID, result.getFirstChild().getType());
        assertEquals(callNode, result.getFirstChild().getFirstChild());
    }

    // Test for trySplitComma
    @Test
    public void testTrySplitComma_exprResult() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(false); // late = false
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node commaNode = IR.comma(left, right);
        Node parent = IR.exprResult(commaNode);
        Node grandParent = IR.block(parent); // Need a parent for the new statement
        commaNode.setParent(parent);
        left.setParent(commaNode);
        right.setParent(commaNode);

        Node result = optimizer.optimizeSubtree(commaNode);

        assertNotNull(result);
        assertEquals(left, result); // Should return the left operand
        assertEquals(Token.EXPR_RESULT, parent.getType());
        assertEquals(Token.NUMBER, parent.getFirstChild().getType()); // Parent should now be left
        assertEquals(1.0, parent.getFirstChild().getDouble(), 0.00001);

        Node newStatement = parent.getNext();
        assertNotNull(newStatement);
        assertEquals(Token.EXPR_RESULT, newStatement.getType());
        assertEquals(Token.NUMBER, newStatement.getFirstChild().getType());
        assertEquals(2.0, newStatement.getFirstChild().getDouble(), 0.00001); // New statement should be right
    }

    @Test
    public void testTrySplitComma_notExprResult() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(false); // late = false
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node commaNode = IR.comma(left, right);
        Node parent = IR.assign(IR.name("x"), commaNode); // Assign is not ExprResult
        commaNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(commaNode);

        assertNotNull(result);
        assertEquals(commaNode, result); // Should remain unchanged
        assertEquals(Token.COMMA, result.getType());
        assertEquals(left, result.getFirstChild());
        assertEquals(right, result.getLastChild());
    }

    // Test for tryReplaceIf
    @Test
    public void testTryReplaceIf_ifReturnIfReturn() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnVal = IR.number(1);
        Node if1 = IR.ifNode(IR.trueNode(), IR.returnNode(returnVal));
        Node if2 = IR.ifNode(IR.trueNode(), IR.returnNode(returnVal.cloneTree()));
        Node block = IR.block(if1, if2);
        if1.setParent(block);
        if2.setParent(block);

        Node result = optimizer.optimizeSubtree(if1);

        assertNotNull(result);
        assertEquals(Token.IF, result.getType());
        assertEquals(Token.OR, result.getFirstChild().getType());
        assertEquals(Token.TRUE, result.getFirstChild().getFirstChild().getType());
        assertEquals(Token.TRUE, result.getFirstChild().getLastChild().getType());
        assertEquals(Token.RETURN, result.getLastChild().getFirstChild().getType());
        assertEquals(returnVal.getDouble(), result.getLastChild().getFirstChild().getDouble(), 0.00001);
    }

    @Test
    public void testTryReplaceIf_ifReturnIfElseReturn() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node returnVal = IR.number(1);
        Node if1 = IR.ifNode(IR.trueNode(), IR.returnNode(returnVal));
        Node innerElse = IR.returnNode(returnVal.cloneTree());
        Node if2 = IR.ifNode(IR.trueNode(), IR.string("foo"), innerElse); // if(true) foo else return 1
        Node block = IR.block(if1, if2);
        if1.setParent(block);
        if2.setParent(block);

        Node result = optimizer.optimizeSubtree(if1);

        assertNotNull(result);
        assertEquals(Token.IF, result.getType());
        assertEquals(Token.AND, result.getFirstChild().getType());
        assertEquals(Token.NOT, result.getFirstChild().getFirstChild().getType());
        assertEquals(Token.TRUE, result.getFirstChild().getFirstChild().getLastChild().getType());
        assertEquals(Token.TRUE, result.getFirstChild().getLastChild().getType());
        assertEquals(Token.STRING, result.getChildAtIndex(1).getType()); // then branch
        assertEquals("foo", result.getChildAtIndex(1).getString());
        assertEquals(innerElse, result.getLastChild()); // else branch
    }

    @Test
    public void testTryReplaceIf_ifReturnExpressionElseReturnExpression() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node cond = IR.trueNode();
        Node thenExpr = IR.number(1);
        Node elseExpr = IR.number(2);
        Node thenBlock = IR.block(IR.returnNode(thenExpr));
        Node elseBlock = IR.block(IR.returnNode(elseExpr));
        Node ifNode = IR.ifNode(cond, thenBlock, elseBlock);
        Node parent = IR.block(ifNode);
        ifNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(ifNode);

        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
        assertEquals(Token.HOOK, result.getFirstChild().getType());
        assertEquals(cond, result.getFirstChild().getFirstChild());
        assertEquals(thenExpr, result.getFirstChild().getChildAtIndex(1));
        assertEquals(elseExpr, result.getFirstChild().getLastChild());
    }

    // Test for tryFoldSimpleFunctionCall
    @Test
    public void testTryFoldSimpleFunctionCall_StringImmutable() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node stringLiteral = IR.string("hello");
        Node callNode = createCall("String", stringLiteral);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        stringLiteral.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.ADD, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("", result.getFirstChild().getString());
        assertEquals(Token.STRING, result.getLastChild().getType());
        assertEquals("hello", result.getLastChild().getString());
    }

    @Test
    public void testTryFoldSimpleFunctionCall_StringVariable() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node varNode = IR.name("myVar");
        Node callNode = createCall("String", varNode);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        varNode.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType()); // Should not fold if not immutable
        assertEquals("String", result.getFirstChild().getString());
        assertEquals(varNode, result.getLastChild());
    }

    // Test for tryFoldLiteralConstructor
    @Test
    public void testTryFoldLiteralConstructor_newObjectNoArgs() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node newNode = createNew("Object");
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.OBJECTLIT, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testTryFoldLiteralConstructor_newArrayNoArgs() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node newNode = createNew("Array");
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testTryFoldLiteralConstructor_newArrayOneStringArg() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node arg = IR.string("a");
        Node newNode = createNew("Array", arg);
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);
        arg.setParent(newNode);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertTrue(result.hasChildren());
        assertEquals(arg, result.getFirstChild());
    }

    @Test
    public void testTryFoldLiteralConstructor_newArrayOneNumberArg() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node arg = IR.number(5.0); // Array(5) creates an array of length 5
        Node newNode = createNew("Array", arg);
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);
        arg.setParent(newNode);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
        // Array(5) becomes [] with length 5, not [5.0]
        assertFalse(result.hasChildren());
    }

    @Test
    public void testTryFoldLiteralConstructor_newArrayZeroNumberArg() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node arg = IR.number(0.0); // Array(0)
        Node newNode = createNew("Array", arg);
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);
        arg.setParent(newNode);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testTryFoldLiteralConstructor_newArrayMultipleArgs() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node arg1 = IR.number(1.0);
        Node arg2 = IR.string("a");
        Node newNode = createNew("Array", arg1, arg2);
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);
        arg1.setParent(newNode);
        arg2.setParent(newNode);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertTrue(result.hasChildren());
        assertEquals(arg1, result.getFirstChild());
        assertEquals(arg2, result.getLastChild());
    }

    @Test
    public void testTryFoldLiteralConstructor_newRegExpLiteral() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node pattern = IR.string("abc");
        // The logic for RegExp folding is in tryFoldRegularExpressionConstructor,
        // which is called after tryFoldLiteralConstructor.
        // We need to simulate the node structure that tryFoldLiteralConstructor would receive.
        // It receives a NEW node.
        Node newNode = new Node(Token.NEW, IR.name("RegExp"), pattern); // Simulate new RegExp("abc")
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);
        pattern.setParent(newNode);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.REGEXP, result.getType());
        assertEquals("abc", result.getFirstChild().getString());
    }

    // Test for tryFoldStandardConstructors
    @Test
    public void testTryFoldStandardConstructors_newObject() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node newNode = new Node(Token.NEW, IR.name("Object")); // Simulate new Object()
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType()); // Should become a call
        assertEquals("Object", result.getFirstChild().getString());
    }

    @Test
    public void testTryFoldStandardConstructors_newArray() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node newNode = new Node(Token.NEW, IR.name("Array")); // Simulate new Array()
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType()); // Should become a call
        assertEquals("Array", result.getFirstChild().getString());
    }

    @Test
    public void testTryFoldStandardConstructors_newRegExp() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node newNode = new Node(Token.NEW, IR.name("RegExp")); // Simulate new RegExp()
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType()); // Should become a call
        assertEquals("RegExp", result.getFirstChild().getString());
    }

    @Test
    public void testTryFoldStandardConstructors_newError() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node newNode = new Node(Token.NEW, IR.name("Error")); // Simulate new Error()
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType()); // Should become a call
        assertEquals("Error", result.getFirstChild().getString());
    }

    @Test
    public void testTryFoldStandardConstructors_newCustomObject() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node newNode = new Node(Token.NEW, IR.name("MyObject")); // Custom constructor
        Node parent = IR.exprResult(newNode);
        newNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(newNode);

        assertNotNull(result);
        assertEquals(Token.NEW, result.getType()); // Should remain NEW
        assertEquals("MyObject", result.getFirstChild().getString());
    }

    // Test for trySplitComma
    @Test
    public void testTrySplitComma_lateFalse() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(false);
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node commaNode = IR.comma(left, right);
        Node parent = IR.exprResult(commaNode);
        Node grandParent = IR.block(parent); // Need a parent for the new statement
        commaNode.setParent(parent);

        optimizer.optimizeSubtree(commaNode);

        assertEquals(Token.EXPR_RESULT, parent.getType());
        assertEquals(Token.NUMBER, parent.getFirstChild().getType());
        assertEquals(1.0, parent.getFirstChild().getDouble(), 0.00001);
        Node newStatement = parent.getNext();
        assertNotNull(newStatement);
        assertEquals(Token.EXPR_RESULT, newStatement.getType());
        assertEquals(Token.NUMBER, newStatement.getFirstChild().getType());
        assertEquals(2.0, newStatement.getFirstChild().getDouble(), 0.00001);
    }

    // Test for tryReplaceUndefined
    @Test
    public void testTryReplaceUndefined_nameUndefined() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node nameNode = IR.name("undefined");
        Node parent = IR.exprResult(nameNode);
        nameNode.setParent(parent);

        optimizer.optimizeSubtree(nameNode);

        // The optimization happens within optimizeSubtree.
        // We need to check the parent of nameNode after optimization.
        // The test is written to check the result of optimizeSubtree directly,
        // which should be the transformed node.
        // If optimizeSubtree is called on `nameNode` itself, it should return the replacement.
        Node result = optimizer.optimizeSubtree(nameNode);
        assertNotNull(result);
        assertEquals(Token.VOID, result.getType());
        assertEquals(0.0, result.getFirstChild().getDouble(), 0.00001);
    }

    // Test for reduceTrueFalse
    @Test
    public void testReduceTrueFalse_trueLate() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node trueNode = IR.trueNode();
        Node parent = IR.exprResult(trueNode);
        trueNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(trueNode);

        assertNotNull(result);
        assertEquals(Token.NOT, result.getType());
        assertEquals(Token.NUMBER, result.getFirstChild().getType());
        assertEquals(0.0, result.getFirstChild().getDouble(), 0.00001);
    }

    @Test
    public void testReduceTrueFalse_falseLate() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node falseNode = IR.falseNode();
        Node parent = IR.exprResult(falseNode);
        falseNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(falseNode);

        assertNotNull(result);
        assertEquals(Token.NOT, result.getType());
        assertEquals(Token.NUMBER, result.getFirstChild().getType());
        assertEquals(1.0, result.getFirstChild().getDouble(), 0.00001);
    }

    @Test
    public void testReduceTrueFalse_trueNotLate() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(false);
        Node trueNode = IR.trueNode();
        Node parent = IR.exprResult(trueNode);
        trueNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(trueNode);

        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType()); // Should remain TRUE
    }

    // Test for tryMinimizeArrayLiteral and tryMinimizeStringArrayLiteral
    @Test
    public void testTryMinimizeStringArrayLiteral_late() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node s1 = IR.string("a");
        Node s2 = IR.string("b");
        Node s3 = IR.string("c");
        Node arrayLit = IR.arraylit(s1, s2, s3);
        Node parent = IR.exprResult(arrayLit);
        arrayLit.setParent(parent);

        Node result = optimizer.optimizeSubtree(arrayLit);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        // Check the structure: CALL(GETPROP(STRING("a,b,c"), STRING("split")), STRING(","))
        assertEquals(Token.GETPROP, result.getFirstChild().getType());
        assertEquals(Token.STRING, result.getFirstChild().getFirstChild().getType()); // Template string
        assertEquals("a,b,c", result.getFirstChild().getFirstChild().getString());
        assertEquals(Token.STRING, result.getFirstChild().getLastChild().getType()); // Method name
        assertEquals("split", result.getFirstChild().getLastChild().getString());
        assertEquals(Token.STRING, result.getLastChild().getType()); // Delimiter
        assertEquals(",", result.getLastChild().getString());
    }

    @Test
    public void testTryMinimizeStringArrayLiteral_notLate() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(false);
        Node s1 = IR.string("a");
        Node s2 = IR.string("b");
        Node arrayLit = IR.arraylit(s1, s2);
        Node parent = IR.exprResult(arrayLit);
        arrayLit.setParent(parent);

        Node result = optimizer.optimizeSubtree(arrayLit);

        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType()); // Should not be folded if not late
    }

    @Test
    public void testTryMinimizeStringArrayLiteral_savingTooSmall() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node s1 = IR.string("a");
        Node arrayLit = IR.arraylit(s1); // Saving will be 2*1 - ".split('.').length()" = 2 - 11 = -9
        Node parent = IR.exprResult(arrayLit);
        arrayLit.setParent(parent);

        Node result = optimizer.optimizeSubtree(arrayLit);

        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType()); // Should not be folded if saving <= 0
    }

    @Test
    public void testTryMinimizeStringArrayLiteral_pickDelimiter() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        String[] testStrings = {"apple", "banana", "cherry"};
        Node s1 = IR.string("apple");
        Node s2 = IR.string("banana");
        Node s3 = IR.string("cherry");
        Node arrayLit = IR.arraylit(s1, s2, s3);
        Node parent = IR.exprResult(arrayLit);
        arrayLit.setParent(parent);

        Node result = optimizer.optimizeSubtree(arrayLit);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        assertEquals("apple,banana,cherry", result.getFirstChild().getFirstChild().getString());
        assertEquals(",", result.getLastChild().getString());
    }

    // Test for tryFoldImmediateCallToBoundFunction
    // This test is complex because it relies on the behavior of getCodingConvention().describeFunctionBind.
    // As describeFunctionBind is internal and not directly mockable without more setup,
    // this test focuses on the *intended* transformation: `(fn.bind(a,b))()` to `fn.call(a,b)`.
    // We will manually construct the AST that would result from the transformation and check its equivalence.
    // A true unit test would involve mocking `getCodingConvention`.
    @Test
    public void testTryFoldImmediateCallToBoundFunction_basicTransformation() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);

        // Representing `(fn.bind(thisValue, param1, param2))()`
        Node fn = IR.name("myFunc");
        Node thisVal = IR.name("context");
        Node p1 = IR.number(1.0);
        Node p2 = IR.string("a");

        // The node structure for `(fn.bind(thisValue, param1, param2))`
        // is a CALL node where the target is a GETPROP node (fn.bind).
        // The outer CALL node is `(...)()`
        Node bindCallTarget = IR.getprop(fn.cloneTree(), IR.string("bind"));
        Node bindCall = IR.call(bindCallTarget, thisVal.cloneTree(), p1.cloneTree(), p2.cloneTree());
        Node callNodeToTransform = IR.call(bindCall); // The actual call to the bound function

        // The expected output after transformation: `fn.call(context, 1.0, "a")`
        Node expectedTarget = IR.getprop(fn.cloneTree(), IR.string("call"));
        Node expectedCall = IR.call(expectedTarget, thisVal.cloneTree(), p1.cloneTree(), p2.cloneTree());

        // The `optimizeSubtree` method should handle this.
        // We can't directly call `tryFoldImmediateCallToBoundFunction` because it's private.
        // We'll call `optimizeSubtree` on a node that would trigger it.
        // The `CALL` node `callNodeToTransform` is the root of the subtree.
        Node result = optimizer.optimizeSubtree(callNodeToTransform);

        // We'll assert that the result is equivalent to our expected transformation.
        // This test relies on `optimizeSubtree` correctly identifying and transforming the bound call.
        assertTrue(result.isEquivalentTo(expectedCall));
    }


    // Test for tryMinimizeCondition
    @Test
    public void testTryMinimizeCondition_doubleNot() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node n = IR.not(IR.not(IR.trueNode()));
        Node parent = IR.exprResult(n);
        n.setParent(parent);

        Node result = optimizer.optimizeSubtree(n);

        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryMinimizeCondition_notAnd_toOr() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node notA = IR.not(IR.name("a"));
        Node notB = IR.not(IR.name("b"));
        Node andNode = IR.and(notA, notB);
        Node n = IR.not(andNode);
        Node parent = IR.exprResult(n);
        n.setParent(parent);

        Node result = optimizer.optimizeSubtree(n);

        assertNotNull(result);
        assertEquals(Token.OR, result.getType());
        assertEquals(Token.NAME, result.getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getString());
        assertEquals(Token.NAME, result.getLastChild().getType());
        assertEquals("b", result.getLastChild().getString());
    }

    @Test
    public void testTryMinimizeCondition_notOr_toAnd() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node notA = IR.not(IR.name("a"));
        Node notB = IR.not(IR.name("b"));
        Node orNode = IR.or(notA, notB);
        Node n = IR.not(orNode);
        Node parent = IR.exprResult(n);
        n.setParent(parent);

        Node result = optimizer.optimizeSubtree(n);

        assertNotNull(result);
        assertEquals(Token.AND, result.getType());
        assertEquals(Token.NAME, result.getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getString());
        assertEquals(Token.NAME, result.getLastChild().getType());
        assertEquals("b", result.getLastChild().getString());
    }

    @Test
    public void testTryMinimizeCondition_hook_toOr() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node cond = IR.trueNode();
        Node trueExpr = IR.trueNode();
        Node falseExpr = IR.name("b");
        Node hookNode = IR.hook(cond, trueExpr, falseExpr);
        Node parent = IR.exprResult(hookNode);
        hookNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(hookNode);

        assertNotNull(result);
        assertEquals(Token.OR, result.getType());
        assertEquals(Token.TRUE, result.getFirstChild().getType());
        assertEquals(Token.NAME, result.getLastChild().getType());
        assertEquals("b", result.getLastChild().getString());
    }

    @Test
    public void testTryMinimizeCondition_hook_toAnd() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node cond = IR.trueNode();
        Node trueExpr = IR.name("a");
        Node falseExpr = IR.falseNode();
        Node hookNode = IR.hook(cond, trueExpr, falseExpr);
        Node parent = IR.exprResult(hookNode);
        hookNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(hookNode);

        assertNotNull(result);
        assertEquals(Token.AND, result.getType());
        assertEquals(Token.NAME, result.getFirstChild().getType());
        assertEquals("a", result.getFirstChild().getString());
        assertEquals(Token.FALSE, result.getLastChild().getType());
    }

    @Test
    public void testTryMinimizeCondition_and_rightFalse() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node left = IR.name("a");
        Node right = IR.falseNode();
        Node andNode = IR.and(left, right);
        Node parent = IR.exprResult(andNode);
        andNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(andNode);

        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryMinimizeCondition_or_rightTrue() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node left = IR.name("a");
        Node right = IR.trueNode();
        Node orNode = IR.or(left, right);
        Node parent = IR.exprResult(orNode);
        orNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(orNode);

        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryMinimizeCondition_and_leftTrue() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node left = IR.trueNode();
        Node right = IR.name("a");
        Node andNode = IR.and(left, right);
        Node parent = IR.exprResult(andNode);
        andNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(andNode);

        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("a", result.getString());
    }

    @Test
    public void testTryMinimizeCondition_or_leftFalse() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node left = IR.falseNode();
        Node right = IR.name("a");
        Node orNode = IR.or(left, right);
        Node parent = IR.exprResult(orNode);
        orNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(orNode);

        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("a", result.getString());
    }

    // Test for tryFoldRegularExpressionConstructor
    @Test
    public void testTryFoldRegularExpressionConstructor_basic() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node pattern = IR.string("abc");
        // The logic is within `tryFoldRegularExpressionConstructor`, which is called by `optimizeSubtree`.
        // `tryFoldLiteralConstructor` first transforms `new RegExp(...)` to `RegExp(...)`.
        // Then `optimizeSubtree` would call `tryFoldRegularExpressionConstructor` if the node type is CALL.
        // So, we need to simulate the node that is passed to `optimizeSubtree`.
        // It will be a CALL node, after `tryFoldLiteralConstructor` has potentially run.
        Node callNode = IR.call(IR.name("RegExp"), pattern);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        pattern.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.REGEXP, result.getType());
        assertEquals("abc", result.getFirstChild().getString());
    }

    @Test
    public void testTryFoldRegularExpressionConstructor_withFlags() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node pattern = IR.string("abc");
        Node flags = IR.string("i");
        Node callNode = IR.call(IR.name("RegExp"), pattern, flags);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        pattern.setParent(callNode);
        flags.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.REGEXP, result.getType());
        assertEquals("abc", result.getFirstChild().getString());
        assertEquals("i", result.getLastChild().getString());
    }

    @Test
    public void testTryFoldRegularExpressionConstructor_invalidFlags() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node pattern = IR.string("abc");
        Node flags = IR.string("xyz"); // Invalid flags
        Node callNode = IR.call(IR.name("RegExp"), pattern, flags);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        pattern.setParent(callNode);
        flags.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType()); // Should not fold
        assertEquals("RegExp", result.getFirstChild().getString());
    }

    @Test
    public void testTryFoldRegularExpressionConstructor_emptyPattern() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node pattern = IR.string("");
        Node callNode = IR.call(IR.name("RegExp"), pattern);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        pattern.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType()); // Should not fold empty pattern
    }

    // Test for tryJoinForCondition
    @Test
    public void testTryJoinForCondition_basic() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node ifBody = IR.block(IR.breakNode());
        Node ifNode = IR.ifNode(IR.trueNode(), ifBody);
        Node forCond = IR.trueNode();
        Node forBody = IR.block(ifNode); // If node is the first statement in the for loop body
        Node forNode = IR.forNode(null, forCond, null, forBody);
        Node parent = IR.block(forNode);
        forNode.setParent(parent);

        Node result = optimizer.optimizeSubtree(forNode);

        assertNotNull(result);
        assertEquals(Token.FOR, result.getType());
        assertEquals(Token.AND, result.getChildAtIndex(1).getType()); // Condition should be ANDed
        assertEquals(Token.TRUE, result.getChildAtIndex(1).getFirstChild().getType());
        assertEquals(Token.NOT, result.getChildAtIndex(1).getLastChild().getType());
        assertEquals(Token.TRUE, result.getChildAtIndex(1).getLastChild().getFirstChild().getType());
        assertEquals(1, forBody.getChildCount()); // IF node should be removed from the body
        assertNull(forBody.getFirstChild()); // The ifNode should be removed from the body
    }

    // Test for tryFoldSimpleFunctionCall with String constructor
    @Test
    public void testTryFoldSimpleFunctionCall_StringWithNumber() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node numberNode = IR.number(123.0);
        Node callNode = createCall("String", numberNode);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        numberNode.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.ADD, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("", result.getFirstChild().getString());
        assertEquals(Token.NUMBER, result.getLastChild().getType());
        assertEquals(123.0, result.getLastChild().getDouble(), 0.00001);
    }

    // Test for tryFoldSimpleFunctionCall with String constructor and boolean
    @Test
    public void testTryFoldSimpleFunctionCall_StringWithBoolean() throws Exception {
        PeepholeSubstituteAlternateSyntax optimizer = createOptimizer(true);
        Node booleanNode = IR.trueNode();
        Node callNode = createCall("String", booleanNode);
        Node parent = IR.exprResult(callNode);
        callNode.setParent(parent);
        booleanNode.setParent(callNode);

        Node result = optimizer.optimizeSubtree(callNode);

        assertNotNull(result);
        assertEquals(Token.ADD, result.getType());
        assertEquals(Token.STRING, result.getFirstChild().getType());
        assertEquals("", result.getFirstChild().getString());
        assertEquals(Token.TRUE, result.getLastChild().getType());
    }
}
```