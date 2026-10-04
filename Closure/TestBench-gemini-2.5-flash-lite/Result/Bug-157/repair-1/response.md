```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.NodeUtil.MatchNotFunction;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Assignment;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Scope;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Set;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.annotation.Nullable;
import java.io.StringReader;

public class CodeGeneratorTest {
    // Mock CodeConsumer for testing CodeGenerator
    private static class MockCodeConsumer implements CodeConsumer {
        StringBuilder sb = new StringBuilder();
        boolean continueProcessing = true;

        @Override
        public void add(String str) {
            sb.append(str);
        }

        @Override
        public void addIdentifier(String identifier) {
            sb.append(identifier);
        }

        @Override
        public void addOp(String opstr, boolean follow) {
            sb.append(opstr);
        }

        @Override
        public void addNumber(double number) {
            sb.append(number);
        }

        @Override
        public void startSourceMapping(Node n) {}

        @Override
        public void endSourceMapping(Node n) {}

        @Override
        public void endStatement() {}

        @Override
        public void endStatement(boolean semicolon) {}

        @Override
        public void endFunction(boolean varArg) {}

        @Override
        public void maybeLineBreak() {}

        @Override
        public void notePreferredLineBreak() {}

        @Override
        public void beginBlock() {}

        @Override
        public void endBlock(boolean close) {}

        @Override
        public void beginCaseBody() {}

        @Override
        public void endCaseBody() {}

        @Override
        public void listSeparator() {}

        @Override
        public boolean shouldPreserveExtraBlocks() {
            return false;
        }

        @Override
        public boolean breakAfterBlockFor(Node n, boolean isStatement) {
            return false;
        }

        @Override
        public boolean continueProcessing() {
            return continueProcessing;
        }

        public String getContent() {
            return sb.toString();
        }
    }

    private MockCodeConsumer consumer = new MockCodeConsumer();
    private CodeGenerator codeGenerator = new CodeGenerator(consumer);

    // Helper method to create a Node with a specific type and string value.
    private Node createStringNode(String value) {
        Node node = new Node(Token.STRING);
        node.setString(value);
        return node;
    }

    // Helper method to create a Node with a specific type and double value.
    private Node createNumberNode(double value) {
        Node node = new Node(Token.NUMBER);
        node.setDouble(value);
        return node;
    }

    // Helper method to create a simple variable declaration node.
    private Node createVarNode(String name) {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, name); // Correct constructor usage
        varNode.addChildToBack(nameNode);
        return varNode;
    }

    // Helper method to create a simple assignment node.
    private Node createAssignmentNode(String name, Node value) {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME, name); // Correct constructor usage
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(value);
        return assignNode;
    }

    // Helper method to create a simple function node.
    private Node createFunctionNode(String name, Node body) {
        Node funcNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, name); // Correct constructor usage
        funcNode.addChildToBack(nameNode); // Function name
        funcNode.addChildToBack(new Node(Token.LP)); // Parameters
        funcNode.addChildToBack(body); // Body
        return funcNode;
    }

    @Test
    public void testTagAsStrict() throws Exception {
        codeGenerator.tagAsStrict();
        assertEquals("'use strict';", consumer.getContent());
    }

    @Test
    public void testAddString() throws Exception {
        codeGenerator.add("some string");
        assertEquals("some string", consumer.getContent());
    }

    @Test
    public void testAddIdentifier() throws Exception {
        codeGenerator.addIdentifier("myVar");
        assertEquals("myVar", consumer.getContent());
    }

    @Test
    public void testAddNodeAsStringLiteral() throws Exception {
        Node stringNode = createStringNode("hello");
        codeGenerator.add(stringNode);
        assertEquals("\"hello\"", consumer.getContent());
    }

    @Test
    public void testAddNodeAsNumberLiteral() throws Exception {
        Node numberNode = createNumberNode(123.45);
        codeGenerator.add(numberNode);
        assertEquals("123.45", consumer.getContent());
    }

    @Test
    public void testAddNodeAsVariableDeclaration() throws Exception {
        Node varNode = createVarNode("x");
        codeGenerator.add(varNode);
        assertEquals("var x", consumer.getContent());
    }

    @Test
    public void testAddNodeAsAssignment() throws Exception {
        Node valueNode = createNumberNode(10);
        Node assignNode = createAssignmentNode("y", valueNode);
        codeGenerator.add(assignNode);
        assertEquals("y=10", consumer.getContent());
    }

    @Test
    public void testAddNodeAsFunction() throws Exception {
        Node bodyNode = new Node(Token.BLOCK);
        Node funcNode = createFunctionNode("myFunc", bodyNode);
        codeGenerator.add(funcNode);
        // The output for a function depends on context and other flags,
        // this is a basic expectation.
        assertTrue(consumer.getContent().startsWith("function myFunc()"));
    }

    @Test
    public void testAddBinaryOperatorAdd() throws Exception {
        Node left = createNumberNode(1);
        Node right = createNumberNode(2);
        Node addNode = new Node(Token.ADD, left, right);
        codeGenerator.add(addNode);
        assertEquals("1+2", consumer.getContent());
    }

    @Test
    public void testAddBinaryOperatorSubtract() throws Exception {
        Node left = createNumberNode(5);
        Node right = createNumberNode(3);
        Node subNode = new Node(Token.SUB, left, right);
        codeGenerator.add(subNode);
        assertEquals("5-3", consumer.getContent());
    }

    @Test
    public void testAddBinaryOperatorMultiply() throws Exception {
        Node left = createNumberNode(4);
        Node right = createNumberNode(6);
        Node mulNode = new Node(Token.MUL, left, right);
        codeGenerator.add(mulNode);
        assertEquals("4*6", consumer.getContent());
    }

    @Test
    public void testAddBinaryOperatorDivide() throws Exception {
        Node left = createNumberNode(10);
        Node right = createNumberNode(2);
        Node divNode = new Node(Token.DIV, left, right);
        codeGenerator.add(divNode);
        assertEquals("10/2", consumer.getContent());
    }

    @Test
    public void testAddBinaryOperatorModulo() throws Exception {
        Node left = createNumberNode(7);
        Node right = createNumberNode(3);
        Node modNode = new Node(Token.MOD, left, right);
        codeGenerator.add(modNode);
        assertEquals("7%3", consumer.getContent());
    }

    @Test
    public void testAddBinaryOperatorEquals() throws Exception {
        Node left = createNumberNode(5);
        Node right = createNumberNode(5);
        Node eqNode = new Node(Token.EQ, left, right);
        codeGenerator.add(eqNode);
        assertEquals("5==5", consumer.getContent());
    }

    @Test
    public void testAddBinaryOperatorLessThan() throws Exception {
        Node left = createNumberNode(3);
        Node right = createNumberNode(7);
        Node ltNode = new Node(Token.LT, left, right);
        codeGenerator.add(ltNode);
        assertEquals("3<7", consumer.getContent());
    }

    @Test
    public void testAddUnaryOperatorNot() throws Exception {
        Node operand = createNumberNode(1);
        Node notNode = new Node(Token.NOT, operand);
        codeGenerator.add(notNode);
        assertEquals("!1", consumer.getContent());
    }

    @Test
    public void testAddUnaryOperatorNeg() throws Exception {
        Node operand = createNumberNode(5);
        Node negNode = new Node(Token.NEG, operand);
        codeGenerator.add(negNode);
        assertEquals("-5", consumer.getContent());
    }

    @Test
    public void testAddUnaryOperatorPos() throws Exception {
        Node operand = createNumberNode(5);
        Node posNode = new Node(Token.POS, operand);
        codeGenerator.add(posNode);
        assertEquals("+5", consumer.getContent());
    }

    @Test
    public void testAddUnaryOperatorBitNot() throws Exception {
        Node operand = createNumberNode(5);
        Node bitNotNode = new Node(Token.BITNOT, operand);
        codeGenerator.add(bitNotNode);
        assertEquals("~5", consumer.getContent());
    }

    @Test
    public void testAddComplexExpression() throws Exception {
        Node n1 = createNumberNode(1);
        Node n2 = createNumberNode(2);
        Node n3 = createNumberNode(3);
        Node addNode = new Node(Token.ADD, n1, n2);
        Node mulNode = new Node(Token.MUL, addNode, n3);
        codeGenerator.add(mulNode);
        assertEquals("(1+2)*3", consumer.getContent());
    }

    @Test
    public void testAddExpressionWithParens() throws Exception {
        Node n1 = createNumberNode(1);
        Node n2 = createNumberNode(2);
        Node n3 = createNumberNode(3);
        Node mulNode = new Node(Token.MUL, n2, n3);
        Node addNode = new Node(Token.ADD, n1, mulNode);
        // Force parentheses around the multiplication
        Node parenNode = new Node(Token.LP, mulNode);
        Node exprNode = new Node(Token.ADD, n1, parenNode);
        codeGenerator.add(exprNode);
        assertEquals("1+(2*3)", consumer.getContent());
    }

    @Test
    public void testAddArrayLiteral() throws Exception {
        Node n1 = createNumberNode(1);
        Node n2 = createStringNode("a");
        Node arrayNode = new Node(Token.ARRAYLIT, n1, n2);
        codeGenerator.add(arrayNode);
        assertEquals("[1,\"a\"]", consumer.getContent());
    }

    @Test
    public void testAddEmptyArrayLiteral() throws Exception {
        Node arrayNode = new Node(Token.ARRAYLIT);
        codeGenerator.add(arrayNode);
        assertEquals("[]", consumer.getContent());
    }

    @Test
    public void testAddObjectLiteral() throws Exception {
        Node propName = createStringNode("key");
        Node propValue = createNumberNode(10);
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeGenerator.add(objectNode);
        assertEquals("{\"key\":10}", consumer.getContent());
    }

    @Test
    public void testAddEmptyObjectLiteral() throws Exception {
        Node objectNode = new Node(Token.OBJECTLIT);
        codeGenerator.add(objectNode);
        assertEquals("{}", consumer.getContent());
    }

    @Test
    public void testAddIfStatement() throws Exception {
        Node condition = createNumberNode(1);
        Node thenBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, condition, thenBlock);
        codeGenerator.add(ifNode);
        assertEquals("if(1){}", consumer.getContent());
    }

    @Test
    public void testAddIfElseStatement() throws Exception {
        Node condition = createNumberNode(1);
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, condition, thenBlock, elseBlock);
        codeGenerator.add(ifNode);
        assertEquals("if(1){}else{}", consumer.getContent());
    }

    @Test
    public void testAddWhileLoop() throws Exception {
        Node condition = createNumberNode(1);
        Node bodyBlock = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, condition, bodyBlock);
        codeGenerator.add(whileNode);
        assertEquals("while(1){}", consumer.getContent());
    }

    @Test
    public void testAddDoLoop() throws Exception {
        Node bodyBlock = new Node(Token.BLOCK);
        Node condition = createNumberNode(1);
        Node doNode = new Node(Token.DO, bodyBlock, condition);
        codeGenerator.add(doNode);
        assertEquals("do{}while(1);", consumer.getContent());
    }

    @Test
    public void testAddForLoop() throws Exception {
        Node init = new Node(Token.VAR);
        init.addChildToBack(new Node(Token.NAME, "i"));
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), createNumberNode(10));
        Node increment = new Node(Token.INC, new Node(Token.NAME, "i"));
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        codeGenerator.add(forNode);
        assertEquals("for(var i;i<10;++i){}", consumer.getContent());
    }

    @Test
    public void testAddForInLoop() throws Exception {
        Node iterator = new Node(Token.NAME, "key");
        Node object = new Node(Token.OBJECTLIT);
        Node body = new Node(Token.BLOCK);
        Node forInNode = new Node(Token.FOR, iterator, object, body);
        codeGenerator.add(forInNode);
        assertEquals("for(key in {}){}", consumer.getContent());
    }

    @Test
    public void testAddTryCatchStatement() throws Exception {
        Node tryBlock = new Node(Token.BLOCK);
        Node catchVar = new Node(Token.NAME, "e");
        Node catchBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH, catchVar, catchBlock);
        Node tryNode = new Node(Token.TRY, tryBlock, catchNode);
        codeGenerator.add(tryNode);
        assertEquals("try{}catch(e){}", consumer.getContent());
    }

    @Test
    public void testAddTryFinallyStatement() throws Exception {
        Node tryBlock = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, tryBlock, null, finallyBlock);
        codeGenerator.add(tryNode);
        assertEquals("try{}finally{}", consumer.getContent());
    }

    @Test
    public void testAddTryCatchFinallyStatement() throws Exception {
        Node tryBlock = new Node(Token.BLOCK);
        Node catchVar = new Node(Token.NAME, "e");
        Node catchBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH, catchVar, catchBlock);
        Node finallyBlock = new Node(Token.BLOCK);
        Node tryNode = new Node(Token.TRY, tryBlock, catchNode, finallyBlock);
        codeGenerator.add(tryNode);
        assertEquals("try{}catch(e){}finally{}", consumer.getContent());
    }

    @Test
    public void testAddThrowStatement() throws Exception {
        Node expr = createStringNode("Error");
        Node throwNode = new Node(Token.THROW, expr);
        codeGenerator.add(throwNode);
        assertEquals("throw\"Error\";", consumer.getContent());
    }

    @Test
    public void testAddReturnStatement() throws Exception {
        Node expr = createNumberNode(1);
        Node returnNode = new Node(Token.RETURN, expr);
        codeGenerator.add(returnNode);
        assertEquals("return 1;", consumer.getContent());
    }

    @Test
    public void testAddReturnStatementWithoutValue() throws Exception {
        Node returnNode = new Node(Token.RETURN);
        codeGenerator.add(returnNode);
        assertEquals("return;", consumer.getContent());
    }

    @Test
    public void testAddContinueStatement() throws Exception {
        Node continueNode = new Node(Token.CONTINUE);
        codeGenerator.add(continueNode);
        assertEquals("continue;", consumer.getContent());
    }

    @Test
    public void testAddContinueStatementWithLabel() throws Exception {
        Node labelName = new Node(Token.LABEL_NAME);
        labelName.setString("myLabel");
        Node continueNode = new Node(Token.CONTINUE, labelName);
        codeGenerator.add(continueNode);
        assertEquals("continue myLabel;", consumer.getContent());
    }

    @Test
    public void testAddBreakStatement() throws Exception {
        Node breakNode = new Node(Token.BREAK);
        codeGenerator.add(breakNode);
        assertEquals("break;", consumer.getContent());
    }

    @Test
    public void testAddBreakStatementWithLabel() throws Exception {
        Node labelName = new Node(Token.LABEL_NAME);
        labelName.setString("myLabel");
        Node breakNode = new Node(Token.BREAK, labelName);
        codeGenerator.add(breakNode);
        assertEquals("break myLabel;", consumer.getContent());
    }

    @Test
    public void testAddDebuggerStatement() throws Exception {
        Node debuggerNode = new Node(Token.DEBUGGER);
        codeGenerator.add(debuggerNode);
        assertEquals("debugger;", consumer.getContent());
    }

    @Test
    public void testAddWithStatement() throws Exception {
        Node expr = createNumberNode(1);
        Node statement = new Node(Token.BLOCK);
        Node withNode = new Node(Token.WITH, expr, statement);
        codeGenerator.add(withNode);
        assertEquals("with(1){}", consumer.getContent());
    }

    @Test
    public void testAddCallExpression() throws Exception {
        Node target = new Node(Token.NAME, "foo");
        Node arg1 = createNumberNode(1);
        Node arg2 = createStringNode("bar");
        Node callNode = new Node(Token.CALL, target, arg1, arg2);
        codeGenerator.add(callNode);
        assertEquals("foo(1,\"bar\")", consumer.getContent());
    }

    @Test
    public void testAddNewExpression() throws Exception {
        Node target = new Node(Token.NAME, "MyClass");
        Node arg1 = createNumberNode(1);
        Node newNode = new Node(Token.NEW, target, arg1);
        codeGenerator.add(newNode);
        assertEquals("new MyClass(1)", consumer.getContent());
    }

    @Test
    public void testAddNewExpressionWithoutArguments() throws Exception {
        Node target = new Node(Token.NAME, "MyClass");
        Node newNode = new Node(Token.NEW, target);
        codeGenerator.add(newNode);
        assertEquals("new MyClass()", consumer.getContent());
    }

    @Test
    public void testAddGetProp() throws Exception {
        Node target = new Node(Token.NAME, "obj");
        Node propName = createStringNode("prop");
        Node getPropNode = new Node(Token.GETPROP, target, propName);
        codeGenerator.add(getPropNode);
        assertEquals("obj.prop", consumer.getContent());
    }

    @Test
    public void testAddGetElem() throws Exception {
        Node target = new Node(Token.NAME, "arr");
        Node index = createNumberNode(0);
        Node getElemNode = new Node(Token.GETELEM, target, index);
        codeGenerator.add(getElemNode);
        assertEquals("arr[0]", consumer.getContent());
    }

    @Test
    public void testAddIncPre() throws Exception {
        Node operand = new Node(Token.NAME, "x");
        Node incNode = new Node(Token.INC, operand);
        codeGenerator.add(incNode);
        assertEquals("++x", consumer.getContent());
    }

    @Test
    public void testAddIncPost() throws Exception {
        Node operand = new Node(Token.NAME, "x");
        Node incNode = new Node(Token.INC, operand);
        incNode.putBooleanProp(Node.INCRDECR_PROP, true); // Postfix increment
        codeGenerator.add(incNode);
        assertEquals("x++", consumer.getContent());
    }

    @Test
    public void testAddDecPre() throws Exception {
        Node operand = new Node(Token.NAME, "x");
        Node decNode = new Node(Token.DEC, operand);
        codeGenerator.add(decNode);
        assertEquals("--x", consumer.getContent());
    }

    @Test
    public void testAddDecPost() throws Exception {
        Node operand = new Node(Token.NAME, "x");
        Node decNode = new Node(Token.DEC, operand);
        decNode.putBooleanProp(Node.INCRDECR_PROP, true); // Postfix decrement
        codeGenerator.add(decNode);
        assertEquals("x--", consumer.getContent());
    }

    @Test
    public void testAddCommaExpression() throws Exception {
        Node n1 = createNumberNode(1);
        Node n2 = createNumberNode(2);
        Node commaNode = new Node(Token.COMMA, n1, n2);
        codeGenerator.add(commaNode);
        assertEquals("1,2", consumer.getContent());
    }

    @Test
    public void testAddConditionalExpression() throws Exception {
        Node test = createNumberNode(1);
        Node thenExpr = createNumberNode(2);
        Node elseExpr = createNumberNode(3);
        Node hookNode = new Node(Token.HOOK, test, thenExpr, elseExpr);
        codeGenerator.add(hookNode);
        assertEquals("1?2:3", consumer.getContent());
    }

    @Test
    public void testAddRegExpLiteral() throws Exception {
        Node pattern = createStringNode("/abc/i");
        Node regexpNode = new Node(Token.REGEXP, pattern);
        codeGenerator.add(regexpNode);
        // The regexpEscape function is called internally.
        assertEquals("/abc/i", consumer.getContent());
    }

    @Test
    public void testAddRegExpLiteralWithFlags() throws Exception {
        Node pattern = createStringNode("/abc/gi");
        Node flags = createStringNode("gi"); // Flags are also represented as strings
        Node regexpNode = new Node(Token.REGEXP, pattern, flags);
        codeGenerator.add(regexpNode);
        assertEquals("/abc/gi", consumer.getContent());
    }

    @Test
    public void testAddGetRef() throws Exception {
        Node nameNode = new Node(Token.NAME, "ref");
        Node getRefNode = new Node(Token.GET_REF, nameNode);
        codeGenerator.add(getRefNode);
        assertEquals("ref", consumer.getContent());
    }

    @Test
    public void testAddRefSpecial() throws Exception {
        Node nameNode = new Node(Token.NAME, "obj");
        Node refSpecialNode = new Node(Token.REF_SPECIAL, nameNode);
        refSpecialNode.putProp(Node.NAME_PROP, "method");
        codeGenerator.add(refSpecialNode);
        assertEquals("obj.method", consumer.getContent());
    }

    @Test
    public void testAddLabeledStatement() throws Exception {
        Node labelName = new Node(Token.LABEL_NAME);
        labelName.setString("loop");
        Node statementBlock = new Node(Token.BLOCK);
        Node labeledStatement = new Node(Token.LABEL, labelName, statementBlock);
        codeGenerator.add(labeledStatement);
        assertEquals("loop:{}", consumer.getContent());
    }

    @Test
    public void testAddSwitchStatement() throws Exception {
        Node expression = createNumberNode(1);
        Node switchNode = new Node(Token.SWITCH, expression);

        // Add a case
        Node caseExpr = createNumberNode(1);
        Node caseBody = new Node(Token.BLOCK);
        Node caseNode = new Node(Token.CASE, caseExpr, caseBody);
        switchNode.addChildToBack(caseNode);

        // Add a default
        Node defaultBody = new Node(Token.BLOCK);
        Node defaultNode = new Node(Token.DEFAULT, defaultBody);
        switchNode.addChildToBack(defaultNode);

        codeGenerator.add(switchNode);
        assertEquals("switch(1){case 1:{}default:{}}", consumer.getContent());
    }

    @Test
    public void testAddEmptyStatement() throws Exception {
        Node emptyNode = new Node(Token.EMPTY);
        codeGenerator.add(emptyNode);
        assertEquals("", consumer.getContent()); // EMPTY nodes don't output anything
    }

    @Test
    public void testAddLiteralTrue() throws Exception {
        Node trueNode = new Node(Token.TRUE);
        codeGenerator.add(trueNode);
        assertEquals("true", consumer.getContent());
    }

    @Test
    public void testAddLiteralFalse() throws Exception {
        Node falseNode = new Node(Token.FALSE);
        codeGenerator.add(falseNode);
        assertEquals("false", consumer.getContent());
    }

    @Test
    public void testAddLiteralNull() throws Exception {
        Node nullNode = new Node(Token.NULL);
        codeGenerator.add(nullNode);
        assertEquals("null", consumer.getContent());
    }

    @Test
    public void testAddLiteralThis() throws Exception {
        Node thisNode = new Node(Token.THIS);
        codeGenerator.add(thisNode);
        assertEquals("this", consumer.getContent());
    }

    @Test
    public void testAddComplexFunction() throws Exception {
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.RETURN, createNumberNode(1)));
        Node funcNode = createFunctionNode("complexFunc", body);
        codeGenerator.add(funcNode);
        assertTrue(consumer.getContent().startsWith("function complexFunc(){return 1;}"));
    }

    @Test
    public void testAddEmptyBlock() throws Exception {
        Node blockNode = new Node(Token.BLOCK);
        codeGenerator.add(blockNode);
        assertEquals("{}", consumer.getContent());
    }

    @Test
    public void testAddBlockWithStatements() throws Exception {
        Node blockNode = new Node(Token.BLOCK);
        blockNode.addChildToBack(new Node(Token.VAR, new Node(Token.NAME, "a")));
        blockNode.addChildToBack(new Node(Token.EXPR_RESULT, createNumberNode(1)));
        codeGenerator.add(blockNode);
        assertEquals("{var a;1}", consumer.getContent());
    }

    @Test
    public void testAddAssignAdd() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignAddNode = new Node(Token.ASSIGN_ADD, left, right);
        codeGenerator.add(assignAddNode);
        assertEquals("x+=5", consumer.getContent());
    }

    @Test
    public void testAddAssignSub() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignSubNode = new Node(Token.ASSIGN_SUB, left, right);
        codeGenerator.add(assignSubNode);
        assertEquals("x-=5", consumer.getContent());
    }

    @Test
    public void testAddAssignMul() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignMulNode = new Node(Token.ASSIGN_MUL, left, right);
        codeGenerator.add(assignMulNode);
        assertEquals("x*=5", consumer.getContent());
    }

    @Test
    public void testAddAssignDiv() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignDivNode = new Node(Token.ASSIGN_DIV, left, right);
        codeGenerator.add(assignDivNode);
        assertEquals("x/=5", consumer.getContent());
    }

    @Test
    public void testAddAssignMod() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignModNode = new Node(Token.ASSIGN_MOD, left, right);
        codeGenerator.add(assignModNode);
        assertEquals("x%=5", consumer.getContent());
    }

    @Test
    public void testAddAssignBitOr() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignBitOrNode = new Node(Token.ASSIGN_BITOR, left, right);
        codeGenerator.add(assignBitOrNode);
        assertEquals("x|=5", consumer.getContent());
    }

    @Test
    public void testAddAssignBitXor() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignBitXorNode = new Node(Token.ASSIGN_BITXOR, left, right);
        codeGenerator.add(assignBitXorNode);
        assertEquals("x^=5", consumer.getContent());
    }

    @Test
    public void testAddAssignBitAnd() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignBitAndNode = new Node(Token.ASSIGN_BITAND, left, right);
        codeGenerator.add(assignBitAndNode);
        assertEquals("x&=5", consumer.getContent());
    }

    @Test
    public void testAddAssignLsh() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignLshNode = new Node(Token.ASSIGN_LSH, left, right);
        codeGenerator.add(assignLshNode);
        assertEquals("x<<=5", consumer.getContent());
    }

    @Test
    public void testAddAssignRsh() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignRshNode = new Node(Token.ASSIGN_RSH, left, right);
        codeGenerator.add(assignRshNode);
        assertEquals("x>>=5", consumer.getContent());
    }

    @Test
    public void testAddAssignUrsh() throws Exception {
        Node left = new Node(Token.NAME, "x");
        Node right = createNumberNode(5);
        Node assignUrshNode = new Node(Token.ASSIGN_URSH, left, right);
        codeGenerator.add(assignUrshNode);
        assertEquals("x>>>=5", consumer.getContent());
    }

    @Test
    public void testAddDeleteProperty() throws Exception {
        Node expr = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), createStringNode("prop"));
        Node delPropNode = new Node(Token.DELPROP, expr);
        codeGenerator.add(delPropNode);
        assertEquals("delete obj.prop", consumer.getContent());
    }

    @Test
    public void testAddParenthesizedExpression() throws Exception {
        Node expr = new Node(Token.ADD, createNumberNode(1), createNumberNode(2));
        Node parenNode = new Node(Token.LP, expr);
        codeGenerator.add(parenNode);
        assertEquals("(1+2)", consumer.getContent());
    }

    @Test
    public void testAddNegatedNumberLiteral() throws Exception {
        Node number = createNumberNode(5);
        Node negNode = new Node(Token.NEG, number);
        codeGenerator.add(negNode);
        assertEquals("-5", consumer.getContent());
    }

    @Test
    public void testAddNegatedVariableName() throws Exception {
        Node name = new Node(Token.NAME, "a");
        Node negNode = new Node(Token.NEG, name);
        codeGenerator.add(negNode);
        assertEquals("-a", consumer.getContent());
    }

    @Test
    public void testAddNumberToDouble() throws Exception {
        Node numNode = createNumberNode(1.23e4); // 12300.0
        codeGenerator.add(numNode);
        assertEquals("12300.0", consumer.getContent());
    }

    @Test
    public void testAddNumberSmallFraction() throws Exception {
        Node numNode = createNumberNode(0.1);
        codeGenerator.add(numNode);
        assertEquals("0.1", consumer.getContent());
    }

    @Test
    public void testAddNumberVerySmallFraction() throws Exception {
        Node numNode = createNumberNode(1e-5);
        codeGenerator.add(numNode);
        assertEquals("0.00001", consumer.getContent());
    }

    @Test
    public void testAddNumberLargePositiveInteger() throws Exception {
        Node numNode = createNumberNode(2147483647.0); // Integer.MAX_VALUE
        codeGenerator.add(numNode);
        assertEquals("2147483647.0", consumer.getContent());
    }

    @Test
    public void testAddNumberMaxPositiveDouble() throws Exception {
        Node numNode = createNumberNode(Double.MAX_VALUE);
        codeGenerator.add(numNode);
        assertEquals("1.7976931348623157E308", consumer.getContent());
    }

    @Test
    public void testAddNumberMinPositiveDouble() throws Exception {
        Node numNode = createNumberNode(Double.MIN_NORMAL); // smallest positive normalized double
        codeGenerator.add(numNode);
        assertEquals("2.2250738585072014E-308", consumer.getContent());
    }

    @Test
    public void testAddNumberNegativeZero() throws Exception {
        Node numNode = createNumberNode(-0.0);
        codeGenerator.add(numNode);
        assertEquals("-0.0", consumer.getContent());
    }

    @Test
    public void testAddEmptyStatementInBlock() throws Exception {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        codeGenerator.add(block);
        assertEquals("{}", consumer.getContent());
    }

    @Test
    public void testAddVarWithInitializer() throws Exception {
        Node value = createNumberNode(10);
        Node init = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), value);
        Node varNode = new Node(Token.VAR, init);
        codeGenerator.add(varNode);
        assertEquals("var x=10", consumer.getContent());
    }

    @Test
    public void testAddConstantBooleanTrue() throws Exception {
        // IRFactory transforms CONST to VAR, so we expect VAR output.
        Node value = new Node(Token.TRUE);
        Node nameNode = new Node(Token.NAME, "myConst");
        Node assignNode = new Node(Token.ASSIGN, nameNode, value);
        Node constVarNode = new Node(Token.VAR, assignNode); // Simulate IRFactory output
        codeGenerator.add(constVarNode);
        assertEquals("var myConst=true", consumer.getContent());
    }

    // Test case for a property access that should not be renamed.
    // This test checks if standard JS built-in properties are handled correctly.
    @Test
    public void testHandleBuiltInPropertyAccess() throws Exception {
        Node target = new Node(Token.NAME, "str");
        Node propName = createStringNode("length");
        Node getPropNode = new Node(Token.GETPROP, target, propName);
        codeGenerator.add(getPropNode);
        assertEquals("str.length", consumer.getContent());
    }

    // Test case for a method call on a built-in object.
    @Test
    public void testHandleBuiltInMethodCall() throws Exception {
        Node target = new Node(Token.NAME, "arr");
        Node methodName = createStringNode("push");
        Node getPropNode = new Node(Token.GETPROP, target, methodName);
        Node arg = createNumberNode(1);
        Node callNode = new Node(Token.CALL, getPropNode, arg);
        codeGenerator.add(callNode);
        assertEquals("arr.push(1)", consumer.getContent());
    }

    // Test case for a property that is likely an exported function or property.
    // Based on RenamePrototypes, exported names should not be renamed.
    @Test
    public void testHandleExportedProperty() throws Exception {
        Node target = new Node(Token.NAME, "MyLib");
        Node propName = createStringNode("somePublicMethod"); // Assuming this is exported
        Node getPropNode = new Node(Token.GETPROP, target, propName);
        codeGenerator.add(getPropNode);
        assertEquals("MyLib.somePublicMethod", consumer.getContent());
    }

    // Test case for a property that might be considered "private" by convention.
    // RenamePrototypes might rename these if aggressive renaming is on.
    // Here, we assume a simple case where it should be renamed if possible.
    @Test
    public void testHandlePotentiallyPrivateProperty() throws Exception {
        Node target = new Node(Token.NAME, "myObj");
        Node propName = createStringNode("_internalValue"); // Conventionally private
        Node getPropNode = new Node(Token.GETPROP, target, propName);
        codeGenerator.add(getPropNode);
        // The actual renaming depends on RenamePrototypes, which is not directly
        // tested here but assumed to work. The output should reflect the property access.
        // If it gets renamed, it will be something like "myObj.a".
        // For simplicity, we assert the structure.
        assertTrue(consumer.getContent().startsWith("myObj."));
    }

    // Test case for object literal property names.
    @Test
    public void testHandleObjectLiteralProperty() throws Exception {
        Node propName = createStringNode("name");
        Node propValue = createStringNode("test");
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeGenerator.add(objectNode);
        assertEquals("{\"name\":\"test\"}", consumer.getContent());
    }

    // Test case for object literal property names that are keywords.
    @Test
    public void testHandleObjectLiteralKeywordProperty() throws Exception {
        Node propName = createStringNode("class"); // keyword
        Node propValue = createNumberNode(1);
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeGenerator.add(objectNode);
        assertEquals("{\"class\":1}", consumer.getContent());
    }

    // Test case for an object literal property that is a number.
    @Test
    public void testHandleObjectLiteralNumberProperty() throws Exception {
        Node propName = createStringNode("123"); // number as string key
        Node propValue = createNumberNode(456);
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeGenerator.add(objectNode);
        assertEquals("{\"123\":456}", consumer.getContent());
    }

    // Test case for a simple expression statement.
    @Test
    public void testAddExpressionStatement() throws Exception {
        Node expr = createNumberNode(10);
        Node exprStmt = new Node(Token.EXPR_RESULT, expr);
        codeGenerator.add(exprStmt);
        assertEquals("10;", consumer.getContent());
    }

    // Test case for a statement with a semicolon.
    @Test
    public void testAddStatementWithSemicolon() throws Exception {
        Node expr = createNumberNode(20);
        Node exprStmt = new Node(Token.EXPR_RESULT, expr);
        codeGenerator.cc.endStatement(true); // Force semicolon
        codeGenerator.add(exprStmt);
        assertEquals("20;", consumer.getContent());
    }

    // Test case for a statement without a semicolon.
    @Test
    public void testAddStatementWithoutSemicolon() throws Exception {
        Node expr = createNumberNode(30);
        Node exprStmt = new Node(Token.EXPR_RESULT, expr);
        codeGenerator.cc.endStatement(false); // No semicolon
        codeGenerator.add(exprStmt);
        assertEquals("30", consumer.getContent());
    }


    // Mock ErrorReporter for IRFactory
    private static class MockErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int sourceLine, String sourceשור) {
            // Ignore for test purposes
        }

        @Override
        public void error(String message, String sourceName, int sourceLine, String sourceשור) {
            // Ignore for test purposes
        }

        @Override
        public com.google.javascript.jscomp.mozilla.rhino.EvaluatorException runtimeError(
                String message, String sourceName, int sourceLine, String sourceשור, int offset) {
            return new com.google.javascript.jscomp.mozilla.rhino.EvaluatorException(message);
        }
    }

    // Mock CompilerInput for RenamePrototypes
    private static class MockCompilerInput extends CompilerInput {
        MockCompilerInput(String content) {
            super(new StringReader(content), "testSource", Charsets.UTF_8);
        }
    }

    // Mock AbstractCompiler for RenamePrototypes and IRFactory
    private static class MockAbstractCompiler extends AbstractCompiler {
        private LifeCycleStage stage = LifeCycleStage.NORMALIZED;
        private String debugLog = "";
        private boolean codeChanged = false;
        private VariableMap propertyMap = null;

        @Override
        public void reportCodeChange() {
            codeChanged = true;
        }

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return stage;
        }

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {
            this.stage = stage;
        }

        @Override
        public void addToDebugLog(String message) {
            debugLog += message;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new ClosureCodingConvention();
        }

        @Override
        public Node getSynthesizedAsts() {
            return null;
        }

        @Override
        public void setPropertyMap(VariableMap propertyMap) {
            this.propertyMap = propertyMap;
        }

        @Override
        public VariableMap getPropertyMap() {
            return propertyMap;
        }

        @Override
        public void recordPass(String passName) {}

        @Override
        public void ensureLibraryInjected(String libName) {}

        @Override
        public void injectSourceFile(String fileName, String content) {}

        @Override
        public void setErrorManager(ErrorManager errorManager) {}

        @Override
        public ErrorManager getErrorManager() {
            return new BasicErrorManager();
        }
    }

    @Test
    public void testTransformTree() throws Exception {
        // This test requires a full AST and Config setup, which is complex.
        // We'll create a minimal setup to test the basic transformation.
        AstRoot root = new AstRoot(); // Minimal AST
        root.setSourceName("test.js");
        String sourceString = "var a = 1;";
        Config config = new Config.Builder().setLanguageMode(LanguageMode.ECMASCRIPT5).build();
        ErrorReporter errorReporter = new MockErrorReporter();

        Node transformedNode = IRFactory.transformTree(root, sourceString, config, errorReporter);
        assertNotNull(transformedNode);
        assertEquals(Token.SCRIPT, transformedNode.getType());
    }

    @Test
    public void testComparePropertiesByFrequency() throws Exception {
        RenamePrototypes.Property p1 = new RenamePrototypes(null, false, null, null).new Property("a");
        p1.prototypeCount = 10;
        p1.objLitCount = 5;

        RenamePrototypes.Property p2 = new RenamePrototypes(null, false, null, null).new Property("b");
        p2.prototypeCount = 12;
        p2.objLitCount = 3;

        RenamePrototypes.Property p3 = new RenamePrototypes(null, false, null, null).new Property("c");
        p3.prototypeCount = 10;
        p3.objLitCount = 5; // Same count as p1

        // Use the static comparator directly if possible, or create an instance to access it
        Comparator<RenamePrototypes.Property> comparator = new Comparator<RenamePrototypes.Property>() {
            public int compare(RenamePrototypes.Property a1, RenamePrototypes.Property a2) {
                int n1 = a1.count();
                int n2 = a2.count();
                if (n1 != n2) {
                    return n2 - n1;
                }
                return a1.oldName.compareTo(a2.oldName);
            }
        };


        // p2 should come before p1 (higher count)
        assertTrue(comparator.compare(p2, p1) < 0);
        // p1 should come before p3 (alphabetical tie-break)
        assertTrue(comparator.compare(p1, p3) < 0);
    }


    @Test
    public void testProcessRenaming() throws Exception {
        // Setup for RenamePrototypes.process
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
        RenamePrototypes renamer = new RenamePrototypes(compiler, true, null, null);

        // Mock externs and root nodes
        Node externsRoot = new Node(Token.SCRIPT);
        Node codeRoot = new Node(Token.SCRIPT);

        // Add some properties to be potentially renamed
        // Example: obj.prop = 1;
        Node objName1 = new Node(Token.NAME, "obj");
        Node propName1 = new Node(Token.STRING, "prop");
        Node getProp1 = new Node(Token.GETPROP, objName1, propName1);
        Node value1 = createNumberNode(1);
        Node assign1 = new Node(Token.ASSIGN, getProp1, value1);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign1));

        // Example: obj.prop = 2; (second access)
        Node objName2 = new Node(Token.NAME, "obj");
        Node propName2 = new Node(Token.STRING, "prop");
        Node getProp2 = new Node(Token.GETPROP, objName2, propName2);
        Node value2 = createNumberNode(2);
        Node assign2 = new Node(Token.ASSIGN, getProp2, value2);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign2));

        // Example: obj.anotherProp = 3; (new property)
        Node objName3 = new Node(Token.NAME, "obj");
        Node propName3 = new Node(Token.STRING, "anotherProp");
        Node getProp3 = new Node(Token.GETPROP, objName3, propName3);
        Node value3 = createNumberNode(3);
        Node assign3 = new Node(Token.ASSIGN, getProp3, value3);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign3));

        // Call the process method
        renamer.process(externsRoot, codeRoot);

        // Assertions:
        // - The debug log should contain information about renaming.
        assertTrue(compiler.debugLog.contains("prop =>"));
        assertTrue(compiler.debugLog.contains("anotherProp =>"));

        // - Code change should be reported if renaming happened.
        assertTrue(compiler.codeChanged);

        // - The property map should be set.
        assertNotNull(compiler.getPropertyMap());
        // Assuming 'a' and 'b' are the generated names for 'prop' and 'anotherProp'
        assertNotNull(compiler.getPropertyMap().lookupNewName("prop"));
        assertNotNull(compiler.getPropertyMap().lookupNewName("anotherProp"));
    }

    // Helper to create a simple AstRoot for testing transformTree.
    private AstRoot createAstRoot(String source, int startLine) {
        AstRoot root = new AstRoot();
        root.setSourceName("test.js");
        root.setLength(source.length());
        root.setAbsolutePosition(0);
        root.setLineno(startLine);
        // Add a placeholder node to represent content, as Rhino's AstRoot is often empty.
        // In a real scenario, this would be populated by a parser.
        Name placeholderName = new Name();
        placeholderName.setIdentifier("test");
        placeholderName.setLineno(startLine);
        placeholderName.setLength(4);
        placeholderName.setAbsolutePosition(0);
        root.addChildToBack(placeholderName);
        return root;
    }

    @Test
    public void testTransformTreeWithSimpleCode() throws Exception {
        String source = "var x = 1;";
        AstRoot astRoot = createAstRoot(source, 1);
        Config config = new Config.Builder().setLanguageMode(LanguageMode.ECMASCRIPT5).build();
        ErrorReporter errorReporter = new MockErrorReporter();

        Node irRoot = IRFactory.transformTree(astRoot, source, config, errorReporter);
        assertNotNull(irRoot);
        assertEquals(Token.SCRIPT, irRoot.getType());
        assertEquals(1, irRoot.getChildCount()); // Should have one child: VAR
        Node varNode = irRoot.getFirstChild();
        assertEquals(Token.VAR, varNode.getType());
        assertEquals(1, varNode.getChildCount()); // Should have one child: the variable initializer
        Node initializer = varNode.getFirstChild();
        assertEquals(Token.ASSIGN, initializer.getType());
        assertEquals("x", initializer.getFirstChild().getString());
        assertEquals(1.0, initializer.getLastChild().getDouble(), 0.00001);
    }

    @Test
    public void testProcessExternedProperties() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        RenamePrototypes renamer = new RenamePrototypes(compiler, false, null, null);
        Node externsRoot = new Node(Token.SCRIPT);

        // Add an externed property access: Object.prototype.toString
        Node objProto = new Node(Token.GETPROP, new Node(Token.NAME, "Object"), new Node(Token.STRING, "prototype"));
        Node toStringName = new Node(Token.STRING, "toString");
        Node getPropNode = new Node(Token.GETPROP, objProto, toStringName);
        externsRoot.addChildToBack(new Node(Token.EXPR_RESULT, getPropNode));

        // Manually call the visitor for externs.
        NodeTraversal traversal = new NodeTraversal(compiler, renamer.new ProcessExternedProperties(), null);
        traversal.traverseRoots(externsRoot);

        // Check that 'toString' was added to reservedNames. Accessing private fields is tricky.
        // A more robust test would involve checking the output of renamer.process().

        Node codeRoot = new Node(Token.SCRIPT);
        // Add a property access that uses 'toString'
        Node objAccess = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "toString"));
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, objAccess));

        renamer.process(externsRoot, codeRoot); // This will call ProcessProperties and then rename.
        
        // Since 'toString' is externed, it should not be renamed.
        assertTrue(compiler.debugLog.contains("obj.toString")); // Check if the non-renamed property is logged.
    }

    @Test
    public void testvisitWithObjectLiteral() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        RenamePrototypes renamer = new RenamePrototypes(compiler, true, null, null);
        Node codeRoot = new Node(Token.SCRIPT);

        // Object literal with a property that should be considered for renaming.
        Node propName = new Node(Token.STRING, "myProp");
        Node propValue = createNumberNode(123);
        Node objProp = new Node(Token.OBJECTLIT, propName, propValue);
        Node objectNode = new Node(Token.OBJECTLIT, objProp);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, objectNode));

        // Manually call the visitor.
        NodeTraversal traversal = new NodeTraversal(compiler, renamer.new ProcessProperties(), null);
        traversal.traverseNodes(codeRoot);

        // Check if 'myProp' was added to properties map.
        assertTrue(renamer.properties.containsKey("myProp"));
        RenamePrototypes.Property prop = renamer.properties.get("myProp");
        assertEquals(1, prop.objLitCount);
    }

    @Test
    public void testvisitWithPrototypeProperty() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        RenamePrototypes renamer = new RenamePrototypes(compiler, true, null, null);
        Node codeRoot = new Node(Token.SCRIPT);

        // Foo.prototype.myMethod = function() {};
        Node protoName = new Node(Token.STRING, "prototype");
        Node objName = new Node(Token.NAME, "Foo");
        Node getProto = new Node(Token.GETPROP, objName, protoName);
        Node methodName = new Node(Token.STRING, "myMethod");
        Node getMethod = new Node(Token.GETPROP, getProto, methodName);
        Node funcBody = new Node(Token.BLOCK);
        Node funcNode = createFunctionNode("myMethod", funcBody); // Function name here is just for clarity, it's not directly used by getMethod in this context.
        Node assign = new Node(Token.ASSIGN, getMethod, funcNode);
        codeRoot.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        // Manually call the visitor.
        NodeTraversal traversal = new NodeTraversal(compiler, renamer.new ProcessProperties(), null);
        traversal.traverseNodes(codeRoot);

        // Check if 'myMethod' was added to properties map and counted.
        assertTrue(renamer.properties.containsKey("myMethod"));
        RenamePrototypes.Property prop = renamer.properties.get("myMethod");
        assertEquals(1, prop.prototypeCount);
    }

    @Test
    public void testAddTryCatchWithEmptyCatchClause() throws Exception {
        Node tryBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH); // No variable, no body
        Node tryNode = new Node(Token.TRY, tryBlock, catchNode);
        codeGenerator.add(tryNode);
        // Expected behavior for empty catch clause in CodeGenerator might vary,
        // but typically it would be 'catch()'
        assertEquals("try{}catch(){}", consumer.getContent());
    }

    @Test
    public void testAddForLoopWithEmptyInitializer() throws Exception {
        Node init = new Node(Token.EMPTY); // Empty initializer
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), createNumberNode(10));
        Node increment = new Node(Token.INC, new Node(Token.NAME, "i"));
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        codeGenerator.add(forNode);
        assertEquals("for(;i<10;++i){}", consumer.getContent());
    }
}
```