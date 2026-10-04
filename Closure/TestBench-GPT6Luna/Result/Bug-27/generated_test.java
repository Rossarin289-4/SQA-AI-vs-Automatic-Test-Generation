package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import java.util.List;

public class IRTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmpty() throws Exception {
        assertEquals(Token.EMPTY, IR.empty().getType());
    }

    @Test
    public void testFunctionChildren() throws Exception {
        Node name = IR.name("f");
        Node params = IR.paramList();
        Node body = IR.block();
        Node function = IR.function(name, params, body);
        assertEquals(Token.FUNCTION, function.getType());
        assertSame(name, function.getFirstChild());
        assertSame(params, name.getNext());
        assertSame(body, params.getNext());
        assertNull(body.getNext());
    }

    @Test
    public void testParamListEmpty() throws Exception {
        assertEquals(Token.PARAM_LIST, IR.paramList().getType());
        assertFalse(IR.paramList().hasChildren());
    }

    @Test
    public void testBlockEmpty() throws Exception {
        assertEquals(Token.BLOCK, IR.block().getType());
        assertFalse(IR.block().hasChildren());
    }

    @Test
    public void testScriptStatements() throws Exception {
        Node first = IR.returnNode();
        Node second = IR.breakNode();
        Node script = IR.script(first, second);
        assertEquals(Token.SCRIPT, script.getType());
        assertSame(first, script.getFirstChild());
        assertSame(second, first.getNext());
        assertNull(second.getNext());
    }

    @Test
    public void testVarWithValue() throws Exception {
        Node name = IR.name("v");
        Node value = IR.number(3);
        Node var = IR.var(name, value);
        assertEquals(Token.VAR, var.getType());
        assertSame(name, var.getFirstChild());
        assertSame(value, name.getFirstChild());
        assertNull(name.getNext());
    }

    @Test
    public void testReturnWithoutExpression() throws Exception {
        Node result = IR.returnNode();
        assertEquals(Token.RETURN, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testThrowExpression() throws Exception {
        Node expr = IR.string("bad");
        Node result = IR.throwNode(expr);
        assertEquals(Token.THROW, result.getType());
        assertSame(expr, result.getFirstChild());
    }

    @Test
    public void testExpressionResult() throws Exception {
        Node expr = IR.number(2);
        Node result = IR.exprResult(expr);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertSame(expr, result.getFirstChild());
    }

    @Test
    public void testIfNodeWithoutElse() throws Exception {
        Node cond = IR.trueNode();
        Node then = IR.block();
        Node result = IR.ifNode(cond, then);
        assertEquals(Token.IF, result.getType());
        assertSame(cond, result.getFirstChild());
        assertSame(then, cond.getNext());
        assertNull(then.getNext());
    }

    @Test
    public void testDoNode() throws Exception {
        Node body = IR.block();
        Node cond = IR.falseNode();
        Node result = IR.doNode(body, cond);
        assertEquals(Token.DO, result.getType());
        assertSame(body, result.getFirstChild());
        assertSame(cond, body.getNext());
    }

    @Test
    public void testForInNode() throws Exception {
        Node target = IR.name("item");
        Node cond = IR.name("items");
        Node body = IR.block();
        Node result = IR.forIn(target, cond, body);
        assertEquals(Token.FOR, result.getType());
        assertSame(target, result.getFirstChild());
        assertSame(cond, target.getNext());
        assertSame(body, cond.getNext());
    }

    @Test
    public void testForNodeWithEmptyParts() throws Exception {
        Node init = IR.empty();
        Node cond = IR.empty();
        Node incr = IR.empty();
        Node body = IR.block();
        Node result = IR.forNode(init, cond, incr, body);
        assertEquals(Token.FOR, result.getType());
        assertSame(init, result.getFirstChild());
        assertSame(cond, init.getNext());
        assertSame(incr, cond.getNext());
        assertSame(body, incr.getNext());
    }

    @Test
    public void testSwitchNode() throws Exception {
        Node cond = IR.name("x");
        Node caseNode = IR.caseNode(IR.number(1), IR.block());
        Node defaultNode = IR.defaultCase(IR.block());
        Node result = IR.switchNode(cond, caseNode, defaultNode);
        assertEquals(Token.SWITCH, result.getType());
        assertSame(cond, result.getFirstChild());
        assertSame(caseNode, cond.getNext());
        assertSame(defaultNode, caseNode.getNext());
        assertNull(defaultNode.getNext());
    }

    @Test
    public void testCaseNodeMarksSyntheticBlock() throws Exception {
        Node body = IR.block();
        Node result = IR.caseNode(IR.string("k"), body);
        assertEquals(Token.CASE, result.getType());
        assertTrue(body.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));
    }

    @Test
    public void testDefaultCaseMarksSyntheticBlock() throws Exception {
        Node body = IR.block();
        Node result = IR.defaultCase(IR.block());
        assertEquals(Token.DEFAULT_CASE, result.getType());
        assertTrue(result.getFirstChild().getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));
    }

    @Test
    public void testLabel() throws Exception {
        Node name = IR.labelName("loop");
        Node stmt = IR.breakNode();
        Node result = IR.label(name, stmt);
        assertEquals(Token.LABEL, result.getType());
        assertSame(name, result.getFirstChild());
        assertSame(stmt, name.getNext());
    }

    @Test
    public void testLabelName() throws Exception {
        Node label = IR.labelName("L");
        assertEquals(Token.LABEL_NAME, label.getType());
        assertEquals("L", label.getString());
    }

    @Test
    public void testTryFinally() throws Exception {
        Node tryBody = IR.block();
        Node finallyBody = IR.block();
        Node result = IR.tryFinally(tryBody, finallyBody);
        assertEquals(Token.TRY, result.getType());
        assertSame(tryBody, result.getFirstChild());
        assertEquals(Token.BLOCK, tryBody.getNext().getType());
        assertSame(finallyBody, tryBody.getNext().getNext());
    }

    @Test
    public void testTryCatchFinally() throws Exception {
        Node tryBody = IR.block();
        Node catchNode = IR.catchNode(IR.name("e"), IR.block());
        Node finallyBody = IR.block();
        Node result = IR.tryCatchFinally(tryBody, catchNode, finallyBody);
        assertEquals(Token.TRY, result.getType());
        assertSame(tryBody, result.getFirstChild());
        assertSame(finallyBody, tryBody.getNext().getNext());
    }

    @Test
    public void testCatchNode() throws Exception {
        Node name = IR.name("e");
        Node body = IR.block();
        Node result = IR.catchNode(name, body);
        assertEquals(Token.CATCH, result.getType());
        assertSame(name, result.getFirstChild());
        assertSame(body, name.getNext());
    }

    @Test
    public void testBreakAndContinue() throws Exception {
        assertEquals(Token.BREAK, IR.breakNode().getType());
        assertEquals(Token.CONTINUE, IR.continueNode().getType());
    }

    @Test
    public void testCallArguments() throws Exception {
        Node target = IR.name("f");
        Node first = IR.number(1);
        Node second = IR.string("x");
        Node result = IR.call(target, first, second);
        assertEquals(Token.CALL, result.getType());
        assertSame(target, result.getFirstChild());
        assertSame(first, target.getNext());
        assertSame(second, first.getNext());
        assertNull(second.getNext());
    }

    @Test
    public void testNewNode() throws Exception {
        Node target = IR.name("C");
        Node arg = IR.trueNode();
        Node result = IR.newNode(target, arg);
        assertEquals(Token.NEW, result.getType());
        assertSame(target, result.getFirstChild());
        assertSame(arg, target.getNext());
    }

    @Test
    public void testName() throws Exception {
        Node result = IR.name("x");
        assertEquals(Token.NAME, result.getType());
        assertEquals("x", result.getString());
    }

    @Test
    public void testGetprop() throws Exception {
        Node target = IR.name("obj");
        Node prop = IR.string("p");
        Node result = IR.getprop(target, prop);
        assertEquals(Token.GETPROP, result.getType());
        assertSame(target, result.getFirstChild());
        assertSame(prop, target.getNext());
    }

    @Test
    public void testAssign() throws Exception {
        Node target = IR.name("x");
        Node value = IR.number(4);
        Node result = IR.assign(target, value);
        assertEquals(Token.ASSIGN, result.getType());
        assertSame(target, result.getFirstChild());
        assertSame(value, target.getNext());
    }

    @Test
    public void testBinaryAndUnaryOperators() throws Exception {
        assertEquals(Token.ADD, IR.add(IR.number(1), IR.number(2)).getType());
        assertEquals(Token.AND, IR.and(IR.trueNode(), IR.falseNode()).getType());
        assertEquals(Token.NOT, IR.not(IR.trueNode()).getType());
        assertEquals(Token.SHEQ, IR.sheq(IR.number(1), IR.number(1)).getType());
    }

    @Test
    public void testObjectAndArrayLiterals() throws Exception {
        Node value = IR.number(5);
        Node prop = IR.propdef(IR.stringKey("k"), value);
        Node object = IR.objectlit(prop);
        assertEquals(Token.OBJECTLIT, object.getType());
        assertSame(prop, object.getFirstChild());
        assertSame(value, prop.getFirstChild());

        Node array = IR.arraylit(IR.string("a"), IR.empty());
        assertEquals(Token.ARRAYLIT, array.getType());
        assertEquals(Token.STRING, array.getFirstChild().getType());
        assertEquals(Token.EMPTY, array.getFirstChild().getNext().getType());
        assertNull(array.getFirstChild().getNext().getNext());
    }

    @Test
    public void testLiterals() throws Exception {
        assertEquals(Token.REGEXP, IR.regexp(IR.string("a")).getType());
        assertEquals(Token.NUMBER, IR.number(2).getType());
        assertEquals(Token.THIS, IR.thisNode().getType());
        assertEquals(Token.TRUE, IR.trueNode().getType());
        assertEquals(Token.FALSE, IR.falseNode().getType());
        assertEquals(Token.NULL, IR.nullNode().getType());
    }

    @Test
    public void testTryCatchShape() throws Exception {
        Node tryBody = IR.block();
        Node caught = IR.catchNode(IR.name("e"), IR.block());
        Node result = IR.tryCatch(tryBody, caught);
        assertEquals(Token.TRY, result.getType());
        assertSame(tryBody, result.getFirstChild());
        Node catchContainer = tryBody.getNext();
        assertEquals(Token.BLOCK, catchContainer.getType());
        assertSame(caught, catchContainer.getFirstChild());
        assertNull(catchContainer.getNext());
    }

    @Test
    public void testGetelemWithNameAndNumber() throws Exception {
        Node target = IR.name("arr");
        Node index = IR.number(0);
        Node result = IR.getelem(target, index);
        assertEquals(Token.GETELEM, result.getType());
        assertSame(target, result.getFirstChild());
        assertSame(index, target.getNext());
        assertNull(index.getNext());
    }

    @Test
    public void testHookHasThreeOrderedOperands() throws Exception {
        Node condition = IR.trueNode();
        Node yes = IR.string("yes");
        Node no = IR.string("no");
        Node result = IR.hook(condition, yes, no);
        assertEquals(Token.HOOK, result.getType());
        assertSame(condition, result.getFirstChild());
        assertSame(yes, condition.getNext());
        assertSame(no, yes.getNext());
        assertNull(no.getNext());
    }

    @Test
    public void testCommaOperands() throws Exception {
        Node left = IR.name("a");
        Node right = IR.name("b");
        Node result = IR.comma(left, right);
        assertEquals(Token.COMMA, result.getType());
        assertSame(left, result.getFirstChild());
        assertSame(right, left.getNext());
        assertNull(right.getNext());
    }

    @Test
    public void testOrOperands() throws Exception {
        Node left = IR.falseNode();
        Node right = IR.trueNode();
        Node result = IR.or(left, right);
        assertEquals(Token.OR, result.getType());
        assertSame(left, result.getFirstChild());
        assertSame(right, left.getNext());
    }

    @Test
    public void testEqualityOperators() throws Exception {
        Node loose = IR.eq(IR.number(1), IR.string("1"));
        Node strict = IR.sheq(IR.number(1), IR.number(1));
        assertEquals(Token.EQ, loose.getType());
        assertEquals(Token.SHEQ, strict.getType());
        assertSame(loose.getFirstChild().getNext(), loose.getLastChild());
    }

    @Test
    public void testVoidNode() throws Exception {
        Node expr = IR.name("x");
        Node result = IR.voidNode(expr);
        assertEquals(Token.VOID, result.getType());
        assertSame(expr, result.getFirstChild());
        assertNull(expr.getNext());
    }

    @Test
    public void testNegAndPos() throws Exception {
        Node negative = IR.neg(IR.number(1));
        Node positive = IR.pos(IR.number(0));
        assertEquals(Token.NEG, negative.getType());
        assertEquals(Token.NUMBER, negative.getFirstChild().getType());
        assertEquals(Token.POS, positive.getType());
        assertEquals(0.0, positive.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testSubtractionOperands() throws Exception {
        Node left = IR.number(2);
        Node right = IR.number(1);
        Node result = IR.sub(left, right);
        assertEquals(Token.SUB, result.getType());
        assertSame(left, result.getFirstChild());
        assertSame(right, left.getNext());
    }
}
