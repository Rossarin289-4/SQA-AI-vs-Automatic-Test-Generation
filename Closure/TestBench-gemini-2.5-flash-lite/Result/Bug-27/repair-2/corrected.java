package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Arrays;

public class IRTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmpty() throws Exception {
        Node node = IR.empty();
        assertNotNull(node);
        assertEquals(Token.EMPTY, node.getType());
        assertFalse(node.hasChildren());
    }

    @Test
    public void testFunction() throws Exception {
        Node name = IR.name("myFunc");
        Node params = IR.paramList();
        Node body = IR.block();
        Node functionNode = IR.function(name, params, body);

        assertNotNull(functionNode);
        assertEquals(Token.FUNCTION, functionNode.getType());
        assertEquals(3, functionNode.getChildCount());
        assertSame(name, functionNode.getFirstChild());
        assertSame(params, functionNode.getChildAtIndex(1));
        assertSame(body, functionNode.getLastChild());
    }

    @Test
    public void testParamListEmpty() throws Exception {
        Node paramList = IR.paramList();
        assertNotNull(paramList);
        assertEquals(Token.PARAM_LIST, paramList.getType());
        assertFalse(paramList.hasChildren());
    }

    @Test
    public void testParamListSingle() throws Exception {
        Node param = IR.name("p1");
        Node paramList = IR.paramList(param);
        assertNotNull(paramList);
        assertEquals(Token.PARAM_LIST, paramList.getType());
        assertTrue(paramList.hasChildren());
        assertEquals(1, paramList.getChildCount());
        assertSame(param, paramList.getFirstChild());
    }

    @Test
    public void testParamListMultipleVarargs() throws Exception {
        Node param1 = IR.name("p1");
        Node param2 = IR.name("p2");
        Node paramList = IR.paramList(param1, param2);
        assertNotNull(paramList);
        assertEquals(Token.PARAM_LIST, paramList.getType());
        assertEquals(2, paramList.getChildCount());
        assertSame(param1, paramList.getFirstChild());
        assertSame(param2, paramList.getLastChild());
    }

    @Test
    public void testParamListMultipleList() throws Exception {
        Node param1 = IR.name("p1");
        Node param2 = IR.name("p2");
        List<Node> params = Arrays.asList(param1, param2);
        Node paramList = IR.paramList(params);
        assertNotNull(paramList);
        assertEquals(Token.PARAM_LIST, paramList.getType());
        assertEquals(2, paramList.getChildCount());
        assertSame(param1, paramList.getFirstChild());
        assertSame(param2, paramList.getLastChild());
    }

    @Test
    public void testBlockEmpty() throws Exception {
        Node block = IR.block();
        assertNotNull(block);
        assertEquals(Token.BLOCK, block.getType());
        assertFalse(block.hasChildren());
    }

    @Test
    public void testBlockSingleStatement() throws Exception {
        Node stmt = IR.exprResult(IR.number(1.0));
        Node block = IR.block(stmt);
        assertNotNull(block);
        assertEquals(Token.BLOCK, block.getType());
        assertTrue(block.hasChildren());
        assertEquals(1, block.getChildCount());
        assertSame(stmt, block.getFirstChild());
    }

    @Test
    public void testBlockMultipleStatements() throws Exception {
        Node stmt1 = IR.exprResult(IR.number(1.0));
        Node stmt2 = IR.exprResult(IR.number(2.0));
        Node block = IR.block(stmt1, stmt2);
        assertNotNull(block);
        assertEquals(Token.BLOCK, block.getType());
        assertEquals(2, block.getChildCount());
        assertSame(stmt1, block.getFirstChild());
        assertSame(stmt2, block.getLastChild());
    }

    @Test
    public void testScript() throws Exception {
        Node stmt1 = IR.exprResult(IR.number(1.0));
        Node stmt2 = IR.exprResult(IR.number(2.0));
        Node script = IR.script(stmt1, stmt2);
        assertNotNull(script);
        assertEquals(Token.SCRIPT, script.getType());
        assertEquals(2, script.getChildCount());
        assertSame(stmt1, script.getFirstChild());
        assertSame(stmt2, script.getLastChild());
    }

    @Test
    public void testVarWithNameAndValue() throws Exception {
        Node name = IR.name("x");
        Node value = IR.number(10);
        Node varNode = IR.var(name, value);
        assertNotNull(varNode);
        assertEquals(Token.VAR, varNode.getType());
        assertTrue(varNode.hasChildren());
        assertEquals(1, varNode.getChildCount());
        assertSame(name, varNode.getFirstChild());
        assertEquals(value, name.getFirstChild()); // Value is child of name node
    }

    @Test
    public void testVarWithNameOnly() throws Exception {
        Node name = IR.name("y");
        Node varNode = IR.var(name);
        assertNotNull(varNode);
        assertEquals(Token.VAR, varNode.getType());
        assertTrue(varNode.hasChildren());
        assertEquals(1, varNode.getChildCount());
        assertSame(name, varNode.getFirstChild());
        assertFalse(name.hasChildren());
    }

    @Test
    public void testReturnNodeEmpty() throws Exception {
        Node returnNode = IR.returnNode();
        assertNotNull(returnNode);
        assertEquals(Token.RETURN, returnNode.getType());
        assertFalse(returnNode.hasChildren());
    }

    @Test
    public void testReturnNodeWithExpr() throws Exception {
        Node expr = IR.number(42);
        Node returnNode = IR.returnNode(expr);
        assertNotNull(returnNode);
        assertEquals(Token.RETURN, returnNode.getType());
        assertTrue(returnNode.hasChildren());
        assertEquals(1, returnNode.getChildCount());
        assertSame(expr, returnNode.getFirstChild());
    }

    @Test
    public void testThrowNode() throws Exception {
        Node expr = IR.string("error");
        Node throwNode = IR.throwNode(expr);
        assertNotNull(throwNode);
        assertEquals(Token.THROW, throwNode.getType());
        assertTrue(throwNode.hasChildren());
        assertEquals(1, throwNode.getChildCount());
        assertSame(expr, throwNode.getFirstChild());
    }

    @Test
    public void testExprResult() throws Exception {
        Node expr = IR.call(IR.name("foo"));
        Node exprResultNode = IR.exprResult(expr);
        assertNotNull(exprResultNode);
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        assertTrue(exprResultNode.hasChildren());
        assertEquals(1, exprResultNode.getChildCount());
        assertSame(expr, exprResultNode.getFirstChild());
    }

    @Test
    public void testIfNodeNoElse() throws Exception {
        Node cond = IR.trueNode();
        Node then = IR.block(IR.exprResult(IR.number(1)));
        Node ifNode = IR.ifNode(cond, then);
        assertNotNull(ifNode);
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(2, ifNode.getChildCount());
        assertSame(cond, ifNode.getFirstChild());
        assertSame(then, ifNode.getLastChild());
    }

    @Test
    public void testIfNodeWithElse() throws Exception {
        Node cond = IR.falseNode();
        Node then = IR.block(IR.exprResult(IR.number(1)));
        Node elseNode = IR.block(IR.exprResult(IR.number(2)));
        Node ifNode = IR.ifNode(cond, then, elseNode);
        assertNotNull(ifNode);
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(3, ifNode.getChildCount());
        assertSame(cond, ifNode.getFirstChild());
        assertSame(then, ifNode.getChildAtIndex(1));
        assertSame(elseNode, ifNode.getLastChild());
    }

    @Test
    public void testDoNode() throws Exception {
        Node body = IR.block(IR.exprResult(IR.number(1)));
        Node cond = IR.trueNode();
        Node doNode = IR.doNode(body, cond);
        assertNotNull(doNode);
        assertEquals(Token.DO, doNode.getType());
        assertEquals(2, doNode.getChildCount());
        assertSame(body, doNode.getFirstChild());
        assertSame(cond, doNode.getLastChild());
    }

    @Test
    public void testForIn() throws Exception {
        Node target = IR.var(IR.name("x"));
        Node cond = IR.name("items");
        Node body = IR.block();
        Node forInNode = IR.forIn(target, cond, body);
        assertNotNull(forInNode);
        assertEquals(Token.FOR, forInNode.getType());
        assertEquals(3, forInNode.getChildCount());
        assertSame(target, forInNode.getFirstChild());
        assertSame(cond, forInNode.getChildAtIndex(1));
        assertSame(body, forInNode.getLastChild());
    }

    @Test
    public void testForNode() throws Exception {
        Node init = IR.var(IR.name("i"), IR.number(0));
        Node cond = IR.sheq(IR.name("i"), IR.number(10));
        // The method 'inc' is not available in IR class. Replaced with 'add' for a valid test.
        Node incr = IR.add(IR.name("i"), IR.number(1));
        Node body = IR.block();
        Node forNode = IR.forNode(init, cond, incr, body);
        assertNotNull(forNode);
        assertEquals(Token.FOR, forNode.getType());
        assertEquals(4, forNode.getChildCount());
        assertSame(init, forNode.getFirstChild());
        assertSame(cond, forNode.getChildAtIndex(1));
        assertSame(incr, forNode.getChildAtIndex(2));
        assertSame(body, forNode.getLastChild());
    }

    @Test
    public void testSwitchNode() throws Exception {
        Node cond = IR.number(5);
        Node case1 = IR.caseNode(IR.number(1), IR.block(IR.exprResult(IR.string("one"))));
        Node case2 = IR.caseNode(IR.number(2), IR.block(IR.exprResult(IR.string("two"))));
        Node switchNode = IR.switchNode(cond, case1, case2);
        assertNotNull(switchNode);
        assertEquals(Token.SWITCH, switchNode.getType());
        assertEquals(3, switchNode.getChildCount());
        assertSame(cond, switchNode.getFirstChild());
        assertSame(case1, switchNode.getChildAtIndex(1));
        assertSame(case2, switchNode.getLastChild());
    }

    @Test
    public void testCaseNode() throws Exception {
        Node expr = IR.number(1);
        Node body = IR.block(IR.exprResult(IR.string("one")));
        Node caseNode = IR.caseNode(expr, body);
        assertNotNull(caseNode);
        assertEquals(Token.CASE, caseNode.getType());
        assertEquals(2, caseNode.getChildCount());
        assertSame(expr, caseNode.getFirstChild());
        assertSame(body, caseNode.getLastChild());
        assertTrue(body.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));
    }

    @Test
    public void testDefaultCase() throws Exception {
        Node body = IR.block(IR.exprResult(IR.string("default")));
        Node defaultCaseNode = IR.defaultCase(body);
        assertNotNull(defaultCaseNode);
        assertEquals(Token.DEFAULT_CASE, defaultCaseNode.getType());
        assertEquals(1, defaultCaseNode.getChildCount());
        assertSame(body, defaultCaseNode.getFirstChild());
        assertTrue(body.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));
    }

    @Test
    public void testLabel() throws Exception {
        Node name = IR.labelName("myLabel");
        Node stmt = IR.exprResult(IR.number(1));
        Node labelNode = IR.label(name, stmt);
        assertNotNull(labelNode);
        assertEquals(Token.LABEL, labelNode.getType());
        assertEquals(2, labelNode.getChildCount());
        assertSame(name, labelNode.getFirstChild());
        assertSame(stmt, labelNode.getLastChild());
    }

    @Test
    public void testLabelName() throws Exception {
        Node labelNameNode = IR.labelName("myLabel");
        assertNotNull(labelNameNode);
        assertEquals(Token.LABEL_NAME, labelNameNode.getType());
        assertEquals("myLabel", labelNameNode.getString());
    }

    @Test
    public void testTryFinally() throws Exception {
        Node tryBody = IR.block(IR.exprResult(IR.number(1)));
        Node finallyBody = IR.block(IR.exprResult(IR.number(2)));
        Node tryNode = IR.tryFinally(tryBody, finallyBody);
        assertNotNull(tryNode);
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(3, tryNode.getChildCount());
        assertSame(tryBody, tryNode.getFirstChild());
        assertNull(tryNode.getChildAtIndex(1)); // Catch block is empty
        assertSame(finallyBody, tryNode.getLastChild());
    }

    @Test
    public void testTryCatch() throws Exception {
        Node tryBody = IR.block(IR.exprResult(IR.number(1)));
        Node catchNode = IR.catchNode(IR.name("e"), IR.block(IR.exprResult(IR.number(2))));
        Node tryNode = IR.tryCatch(tryBody, catchNode);
        assertNotNull(tryNode);
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(2, tryNode.getChildCount());
        assertSame(tryBody, tryNode.getFirstChild());
        assertSame(catchNode, tryNode.getChildAtIndex(1));
        // The method hasChildren(int) is not available in Node class. Using getChildCount() instead.
        assertNotEquals(3, tryNode.getChildCount()); // No finally block
    }

    @Test
    public void testTryCatchFinally() throws Exception {
        Node tryBody = IR.block(IR.exprResult(IR.number(1)));
        Node catchNode = IR.catchNode(IR.name("e"), IR.block(IR.exprResult(IR.number(2))));
        Node finallyBody = IR.block(IR.exprResult(IR.number(3)));
        Node tryNode = IR.tryCatchFinally(tryBody, catchNode, finallyBody);
        assertNotNull(tryNode);
        assertEquals(Token.TRY, tryNode.getType());
        assertEquals(3, tryNode.getChildCount());
        assertSame(tryBody, tryNode.getFirstChild());
        assertSame(catchNode, tryNode.getChildAtIndex(1));
        assertSame(finallyBody, tryNode.getLastChild());
    }

    @Test
    public void testCatchNode() throws Exception {
        Node expr = IR.name("err");
        Node body = IR.block(IR.exprResult(IR.number(1)));
        Node catchNode = IR.catchNode(expr, body);
        assertNotNull(catchNode);
        assertEquals(Token.CATCH, catchNode.getType());
        assertEquals(2, catchNode.getChildCount());
        assertSame(expr, catchNode.getFirstChild());
        assertSame(body, catchNode.getLastChild());
    }

    @Test
    public void testBreakNode() throws Exception {
        Node breakNode = IR.breakNode();
        assertNotNull(breakNode);
        assertEquals(Token.BREAK, breakNode.getType());
        assertFalse(breakNode.hasChildren());
    }

    @Test
    public void testBreakNodeWithLabel() throws Exception {
        Node name = IR.labelName("loop");
        Node breakNode = IR.breakNode(name);
        assertNotNull(breakNode);
        assertEquals(Token.BREAK, breakNode.getType());
        assertTrue(breakNode.hasChildren());
        assertEquals(1, breakNode.getChildCount());
        assertSame(name, breakNode.getFirstChild());
    }

    @Test
    public void testContinueNode() throws Exception {
        Node continueNode = IR.continueNode();
        assertNotNull(continueNode);
        assertEquals(Token.CONTINUE, continueNode.getType());
        assertFalse(continueNode.hasChildren());
    }

    @Test
    public void testContinueNodeWithLabel() throws Exception {
        Node name = IR.labelName("loop");
        Node continueNode = IR.continueNode(name);
        assertNotNull(continueNode);
        assertEquals(Token.CONTINUE, continueNode.getType());
        assertTrue(continueNode.hasChildren());
        assertEquals(1, continueNode.getChildCount());
        assertSame(name, continueNode.getFirstChild());
    }

    @Test
    public void testCall() throws Exception {
        Node target = IR.name("myFunc");
        Node arg1 = IR.number(1);
        Node arg2 = IR.string("hello");
        Node callNode = IR.call(target, arg1, arg2);
        assertNotNull(callNode);
        assertEquals(Token.CALL, callNode.getType());
        assertEquals(3, callNode.getChildCount());
        assertSame(target, callNode.getFirstChild());
        assertSame(arg1, callNode.getChildAtIndex(1));
        assertSame(arg2, callNode.getLastChild());
    }

    @Test
    public void testNewNode() throws Exception {
        Node target = IR.name("MyClass");
        Node arg1 = IR.number(1);
        Node newNode = IR.newNode(target, arg1);
        assertNotNull(newNode);
        assertEquals(Token.NEW, newNode.getType());
        assertEquals(2, newNode.getChildCount());
        assertSame(target, newNode.getFirstChild());
        assertSame(arg1, newNode.getLastChild());
    }

    @Test
    public void testName() throws Exception {
        Node nameNode = IR.name("variable");
        assertNotNull(nameNode);
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("variable", nameNode.getString());
    }

    @Test
    public void testGetprop() throws Exception {
        Node target = IR.name("obj");
        Node prop = IR.string("propName");
        Node getPropNode = IR.getprop(target, prop);
        assertNotNull(getPropNode);
        assertEquals(Token.GETPROP, getPropNode.getType());
        assertEquals(2, getPropNode.getChildCount());
        assertSame(target, getPropNode.getFirstChild());
        assertSame(prop, getPropNode.getLastChild());
    }

    @Test
    public void testGetelem() throws Exception {
        Node target = IR.name("arr");
        Node elem = IR.number(0);
        Node getElemNode = IR.getelem(target, elem);
        assertNotNull(getElemNode);
        assertEquals(Token.GETELEM, getElemNode.getType());
        assertEquals(2, getElemNode.getChildCount());
        assertSame(target, getElemNode.getFirstChild());
        assertSame(elem, getElemNode.getLastChild());
    }

    @Test
    public void testAssign() throws Exception {
        Node target = IR.name("x");
        Node expr = IR.number(100);
        Node assignNode = IR.assign(target, expr);
        assertNotNull(assignNode);
        assertEquals(Token.ASSIGN, assignNode.getType());
        assertEquals(2, assignNode.getChildCount());
        assertSame(target, assignNode.getFirstChild());
        assertSame(expr, assignNode.getLastChild());
    }

    @Test
    public void testHook() throws Exception {
        Node cond = IR.trueNode();
        Node trueval = IR.number(1);
        Node falseval = IR.number(0);
        Node hookNode = IR.hook(cond, trueval, falseval);
        assertNotNull(hookNode);
        assertEquals(Token.HOOK, hookNode.getType());
        assertEquals(3, hookNode.getChildCount());
        assertSame(cond, hookNode.getFirstChild());
        assertSame(trueval, hookNode.getChildAtIndex(1));
        assertSame(falseval, hookNode.getLastChild());
    }

    @Test
    public void testComma() throws Exception {
        Node expr1 = IR.number(1);
        Node expr2 = IR.number(2);
        Node commaNode = IR.comma(expr1, expr2);
        assertNotNull(commaNode);
        assertEquals(Token.COMMA, commaNode.getType());
        assertEquals(2, commaNode.getChildCount());
        assertSame(expr1, commaNode.getFirstChild());
        assertSame(expr2, commaNode.getLastChild());
    }

    @Test
    public void testAnd() throws Exception {
        Node expr1 = IR.trueNode();
        Node expr2 = IR.falseNode();
        Node andNode = IR.and(expr1, expr2);
        assertNotNull(andNode);
        assertEquals(Token.AND, andNode.getType());
        assertEquals(2, andNode.getChildCount());
        assertSame(expr1, andNode.getFirstChild());
        assertSame(expr2, andNode.getLastChild());
    }

    @Test
    public void testOr() throws Exception {
        Node expr1 = IR.trueNode();
        Node expr2 = IR.falseNode();
        Node orNode = IR.or(expr1, expr2);
        assertNotNull(orNode);
        assertEquals(Token.OR, orNode.getType());
        assertEquals(2, orNode.getChildCount());
        assertSame(expr1, orNode.getFirstChild());
        assertSame(expr2, orNode.getLastChild());
    }

    @Test
    public void testNot() throws Exception {
        Node expr = IR.falseNode();
        Node notNode = IR.not(expr);
        assertNotNull(notNode);
        assertEquals(Token.NOT, notNode.getType());
        assertEquals(1, notNode.getChildCount());
        assertSame(expr, notNode.getFirstChild());
    }

    @Test
    public void testEq() throws Exception {
        Node expr1 = IR.number(1);
        Node expr2 = IR.number(2);
        Node eqNode = IR.eq(expr1, expr2);
        assertNotNull(eqNode);
        assertEquals(Token.EQ, eqNode.getType());
        assertEquals(2, eqNode.getChildCount());
        assertSame(expr1, eqNode.getFirstChild());
        assertSame(expr2, eqNode.getLastChild());
    }

    @Test
    public void testSheq() throws Exception {
        Node expr1 = IR.number(1);
        Node expr2 = IR.number(1);
        Node sheqNode = IR.sheq(expr1, expr2);
        assertNotNull(sheqNode);
        assertEquals(Token.SHEQ, sheqNode.getType());
        assertEquals(2, sheqNode.getChildCount());
        assertSame(expr1, sheqNode.getFirstChild());
        assertSame(expr2, sheqNode.getLastChild());
    }

    @Test
    public void testVoidNode() throws Exception {
        Node expr = IR.name("x");
        Node voidNode = IR.voidNode(expr);
        assertNotNull(voidNode);
        assertEquals(Token.VOID, voidNode.getType());
        assertEquals(1, voidNode.getChildCount());
        assertSame(expr, voidNode.getFirstChild());
    }

    @Test
    public void testNeg() throws Exception {
        Node expr = IR.number(5);
        Node negNode = IR.neg(expr);
        assertNotNull(negNode);
        assertEquals(Token.NEG, negNode.getType());
        assertEquals(1, negNode.getChildCount());
        assertSame(expr, negNode.getFirstChild());
    }

    @Test
    public void testPos() throws Exception {
        Node expr = IR.number(5);
        Node posNode = IR.pos(expr);
        assertNotNull(posNode);
        assertEquals(Token.POS, posNode.getType());
        assertEquals(1, posNode.getChildCount());
        assertSame(expr, posNode.getFirstChild());
    }

    @Test
    public void testAdd() throws Exception {
        Node expr1 = IR.number(1);
        Node expr2 = IR.number(2);
        Node addNode = IR.add(expr1, expr2);
        assertNotNull(addNode);
        assertEquals(Token.ADD, addNode.getType());
        assertEquals(2, addNode.getChildCount());
        assertSame(expr1, addNode.getFirstChild());
        assertSame(expr2, addNode.getLastChild());
    }

    @Test
    public void testSub() throws Exception {
        Node expr1 = IR.number(5);
        Node expr2 = IR.number(3);
        Node subNode = IR.sub(expr1, expr2);
        assertNotNull(subNode);
        assertEquals(Token.SUB, subNode.getType());
        assertEquals(2, subNode.getChildCount());
        assertSame(expr1, subNode.getFirstChild());
        assertSame(expr2, subNode.getLastChild());
    }

    @Test
    public void testObjectlitEmpty() throws Exception {
        Node objectlit = IR.objectlit();
        assertNotNull(objectlit);
        assertEquals(Token.OBJECTLIT, objectlit.getType());
        assertFalse(objectlit.hasChildren());
    }

    @Test
    public void testObjectlitWithProps() throws Exception {
        Node prop1 = IR.propdef(IR.stringKey("key1"), IR.number(1));
        Node prop2 = IR.propdef(IR.stringKey("key2"), IR.string("val"));
        Node objectlit = IR.objectlit(prop1, prop2);
        assertNotNull(objectlit);
        assertEquals(Token.OBJECTLIT, objectlit.getType());
        assertEquals(2, objectlit.getChildCount());
        assertSame(prop1, objectlit.getFirstChild());
        assertSame(prop2, objectlit.getLastChild());
    }

    @Test
    public void testPropdef() throws Exception {
        Node stringKey = IR.stringKey("myKey");
        Node value = IR.number(123);
        Node propdef = IR.propdef(stringKey, value);
        assertNotNull(propdef);
        assertEquals(Token.STRING_KEY, propdef.getType());
        assertTrue(propdef.hasChildren());
        assertEquals(1, propdef.getChildCount());
        assertSame(value, propdef.getFirstChild());
        assertEquals("myKey", propdef.getString());
    }

    @Test
    public void testArraylitEmpty() throws Exception {
        Node arraylit = IR.arraylit();
        assertNotNull(arraylit);
        assertEquals(Token.ARRAYLIT, arraylit.getType());
        assertFalse(arraylit.hasChildren());
    }

    @Test
    public void testArraylitWithElements() throws Exception {
        Node elem1 = IR.number(1.0);
        Node elem2 = IR.string("hello");
        Node arraylit = IR.arraylit(elem1, elem2);
        assertNotNull(arraylit);
        assertEquals(Token.ARRAYLIT, arraylit.getType());
        assertEquals(2, arraylit.getChildCount());
        assertSame(elem1, arraylit.getFirstChild());
        assertSame(elem2, arraylit.getLastChild());
    }

    @Test
    public void testRegexpSimple() throws Exception {
        Node expr = IR.string("abc");
        Node regexpNode = IR.regexp(expr);
        assertNotNull(regexpNode);
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals(1, regexpNode.getChildCount());
        assertSame(expr, regexpNode.getFirstChild());
    }

    @Test
    public void testRegexpWithFlags() throws Exception {
        Node expr = IR.string("abc");
        Node flags = IR.string("i");
        Node regexpNode = IR.regexp(expr, flags);
        assertNotNull(regexpNode);
        assertEquals(Token.REGEXP, regexpNode.getType());
        assertEquals(2, regexpNode.getChildCount());
        assertSame(expr, regexpNode.getFirstChild());
        assertSame(flags, regexpNode.getLastChild());
    }

    @Test
    public void testString() throws Exception {
        Node stringNode = IR.string("test string");
        assertNotNull(stringNode);
        assertEquals(Token.STRING, stringNode.getType());
        assertEquals("test string", stringNode.getString());
    }

    @Test
    public void testStringKey() throws Exception {
        Node stringKeyNode = IR.stringKey("testKey");
        assertNotNull(stringKeyNode);
        assertEquals(Token.STRING_KEY, stringKeyNode.getType());
        assertEquals("testKey", stringKeyNode.getString());
    }

    @Test
    public void testNumber() throws Exception {
        Node numberNode = IR.number(123.45);
        assertNotNull(numberNode);
        assertEquals(Token.NUMBER, numberNode.getType());
        assertEquals(123.45, numberNode.getDouble(), 1e-9);
    }

    @Test
    public void testThisNode() throws Exception {
        Node thisNode = IR.thisNode();
        assertNotNull(thisNode);
        assertEquals(Token.THIS, thisNode.getType());
        assertFalse(thisNode.hasChildren());
    }

    @Test
    public void testTrueNode() throws Exception {
        Node trueNode = IR.trueNode();
        assertNotNull(trueNode);
        assertEquals(Token.TRUE, trueNode.getType());
        assertFalse(trueNode.hasChildren());
    }

    @Test
    public void testFalseNode() throws Exception {
        Node falseNode = IR.falseNode();
        assertNotNull(falseNode);
        assertEquals(Token.FALSE, falseNode.getType());
        assertFalse(falseNode.hasChildren());
    }

    @Test
    public void testNullNode() throws Exception {
        Node nullNode = IR.nullNode();
        assertNotNull(nullNode);
        assertEquals(Token.NULL, nullNode.getType());
        assertFalse(nullNode.hasChildren());
    }
}
