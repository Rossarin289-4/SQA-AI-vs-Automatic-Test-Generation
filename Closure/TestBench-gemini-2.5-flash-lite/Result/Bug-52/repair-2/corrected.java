package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.NodeUtil.MatchNotFunction;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

public class CodeGeneratorTest {

    // Helper method to create a simple CodeConsumer for testing.
    private static class TestCodeConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();

        @Override
        char getLastChar() {
            return sb.length() > 0 ? sb.charAt(sb.length() - 1) : 0;
        }

        @Override
        void append(String str) {
            sb.append(str);
        }

        @Override
        void addIdentifier(String identifier) {
            sb.append(identifier);
        }

        @Override
        void appendBlockStart() {}

        @Override
        void appendBlockEnd() {}

        @Override
        void startNewLine() {}

        @Override
        void maybeLineBreak() {}

        @Override
        void maybeCutLine() {}

        @Override
        void endLine() {}

        @Override
        void notePreferredLineBreak() {}

        @Override
        void beginBlock() {}

        @Override
        void endBlock() {}

        @Override
        void endBlock(boolean shouldEndLine) {}

        @Override
        void listSeparator() {
            sb.append(",");
        }

        @Override
        void endStatement() {
            sb.append(";");
        }

        @Override
        void endStatement(boolean needSemiColon) {
            if (needSemiColon) {
                sb.append(";");
            }
        }

        @Override
        void maybeEndStatement() {}

        @Override
        void endFunction() {}

        @Override
        void endFunction(boolean statementContext) {}

        @Override
        void beginCaseBody() {}

        @Override
        void endCaseBody() {}

        @Override
        void add(String newcode) {
            sb.append(newcode);
        }

        @Override
        void appendOp(String op, boolean binOp) {
            sb.append(op);
        }

        @Override
        void addOp(String op, boolean binOp) {
            sb.append(op);
        }

        @Override
        void addNumber(double x) {
            sb.append(x);
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return false;
        }

        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) {
            return false;
        }

        @Override
        void endFile() {}

        @Override
        void startSourceMapping(Node node) {}

        @Override
        void endSourceMapping(Node node) {}

        @Override
        boolean continueProcessing() {
            return true;
        }

        String getCode() {
            return sb.toString();
        }
    }

    private CodeGenerator createCodeGenerator(CodeConsumer consumer) {
        return new CodeGenerator(consumer);
    }

    private CodeGenerator createCodeGenerator(CodeConsumer consumer, Charset charset) {
        return new CodeGenerator(consumer, charset);
    }

    @Test
    public void testTagAsStrict() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.tagAsStrict();
        assertEquals("'use strict';", consumer.getCode());
    }

    @Test
    public void testAddEmptyString() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.add("");
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testAddSimpleString() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.add("var x = 1;");
        assertEquals("var x = 1;", consumer.getCode());
    }

    @Test
    public void testAddNodeNumber() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n = Node.newNumber(123.45);
        cg.add(n);
        assertEquals("123.45", consumer.getCode());
    }

    @Test
    public void testAddNodeStringLiteral() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n = Node.newString("hello");
        cg.add(n);
        assertEquals("\"hello\"", consumer.getCode());
    }

    @Test
    public void testAddNodeVariableDeclaration() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node varNode = new Node(Token.VAR, Node.newString("x"));
        cg.add(varNode);
        assertEquals("var x;", consumer.getCode());
    }

    @Test
    public void testAddNodeVariableDeclarationWithInitialValue() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node initValue = Node.newNumber(10);
        Node varNode = new Node(Token.VAR, new Node(Token.ASSIGN, Node.newString("y"), initValue));
        cg.add(varNode);
        assertEquals("var y = 10;", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorAdd() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(3);
        Node addNode = new Node(Token.ADD, left, right);
        cg.add(addNode);
        assertEquals("5+3", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorSubtract() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(4);
        Node subNode = new Node(Token.SUB, left, right);
        cg.add(subNode);
        assertEquals("10-4", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorMultiply() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newNumber(6);
        Node right = Node.newNumber(7);
        Node mulNode = new Node(Token.MUL, left, right);
        cg.add(mulNode);
        assertEquals("6*7", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorDivide() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newNumber(12);
        Node right = Node.newNumber(3);
        Node divNode = new Node(Token.DIV, left, right);
        cg.add(divNode);
        assertEquals("12/3", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorModulo() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(3);
        Node modNode = new Node(Token.MOD, left, right);
        cg.add(modNode);
        assertEquals("10%3", consumer.getCode());
    }

    @Test
    public void testAddNodeAssignment() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newString("x");
        Node right = Node.newNumber(100);
        Node assignNode = new Node(Token.ASSIGN, left, right);
        cg.add(assignNode);
        assertEquals("x=100", consumer.getCode());
    }

    @Test
    public void testAddNodeFunctionDeclaration() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node name = Node.newString("myFunc");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK, Node.newString("return 5;"));
        Node funcNode = new Node(Token.FUNCTION, name, params, body);
        cg.add(funcNode, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc() {return 5;}", consumer.getCode());
    }

    @Test
    public void testAddNodeFunctionExpression() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node name = Node.newString(""); // Anonymous function
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK, Node.newString("return 5;"));
        Node funcNode = new Node(Token.FUNCTION, name, params, body);
        cg.add(funcNode, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("(function(){return 5;})", consumer.getCode());
    }

    @Test
    public void testAddNodeArrayLiteralEmpty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node arrayNode = new Node(Token.ARRAYLIT);
        cg.add(arrayNode);
        assertEquals("[]", consumer.getCode());
    }

    @Test
    public void testAddNodeArrayLiteralWithElements() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node elem1 = Node.newNumber(1);
        Node elem2 = Node.newString("a");
        Node arrayNode = new Node(Token.ARRAYLIT, elem1, elem2);
        cg.add(arrayNode);
        assertEquals("[1,\"a\"]", consumer.getCode());
    }

    @Test
    public void testAddNodeObjectLiteralEmpty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node objNode = new Node(Token.OBJECTLIT);
        cg.add(objNode);
        assertEquals("{}", consumer.getCode());
    }

    @Test
    public void testAddNodeObjectLiteralWithProperties() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node key1 = Node.newString("prop1");
        Node value1 = Node.newNumber(10);
        Node prop1 = new Node(Token.STRING, key1, value1);

        Node key2 = Node.newString("prop2");
        Node value2 = Node.newString("val");
        Node prop2 = new Node(Token.STRING, key2, value2);

        Node objNode = new Node(Token.OBJECTLIT, prop1, prop2);
        cg.add(objNode);
        assertEquals("{\"prop1\":10,\"prop2\":\"val\"}", consumer.getCode());
    }

    @Test
    public void testAddNodeNewExpression() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node className = Node.newString("MyClass");
        Node arg1 = Node.newNumber(5);
        Node callNode = new Node(Token.CALL, className, arg1);
        Node newNode = new Node(Token.NEW, callNode);
        cg.add(newNode);
        assertEquals("new MyClass(5)", consumer.getCode());
    }

    @Test
    public void testAddNodeNewExpressionNoArgs() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node className = Node.newString("MyClass");
        Node newNode = new Node(Token.NEW, className);
        cg.add(newNode);
        assertEquals("new MyClass()", consumer.getCode());
    }

    @Test
    public void testAddNodeCallExpression() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node functionName = Node.newString("myFunc");
        Node arg1 = Node.newNumber(10);
        Node arg2 = Node.newString("test");
        Node callNode = new Node(Token.CALL, functionName, arg1, arg2);
        cg.add(callNode);
        assertEquals("myFunc(10,\"test\")", consumer.getCode());
    }

    @Test
    public void testAddNodeCallExpressionNoArgs() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node functionName = Node.newString("myFunc");
        Node callNode = new Node(Token.CALL, functionName);
        cg.add(callNode);
        assertEquals("myFunc()", consumer.getCode());
    }

    @Test
    public void testAddNodeGetProp() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node base = Node.newString("obj");
        Node propName = Node.newString("prop");
        Node getNode = new Node(Token.GETPROP, base, propName);
        cg.add(getNode);
        assertEquals("obj.prop", consumer.getCode());
    }

    @Test
    public void testAddNodeGetElem() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node base = Node.newString("arr");
        Node index = Node.newNumber(5);
        Node getNode = new Node(Token.GETELEM, base, index);
        cg.add(getNode);
        assertEquals("arr[5]", consumer.getCode());
    }

    @Test
    public void testAddNodeIfStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node condition = Node.newNumber(1);
        Node thenBranch = new Node(Token.BLOCK, Node.newString("var x = 1;"));
        Node ifNode = new Node(Token.IF, condition, thenBranch);
        cg.add(ifNode);
        assertEquals("if(1){var x = 1;}", consumer.getCode());
    }

    @Test
    public void testAddNodeIfElseStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node condition = Node.newNumber(0);
        Node thenBranch = new Node(Token.BLOCK, Node.newString("var x = 1;"));
        Node elseBranch = new Node(Token.BLOCK, Node.newString("var y = 2;"));
        Node ifNode = new Node(Token.IF, condition, thenBranch, elseBranch);
        cg.add(ifNode);
        assertEquals("if(!1){var x = 1;}else{var y = 2;}", consumer.getCode());
    }

    @Test
    public void testAddNodeWhileLoop() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node condition = Node.newString("a < b");
        Node body = new Node(Token.BLOCK, Node.newString("i++;"));
        Node whileNode = new Node(Token.WHILE, condition, body);
        cg.add(whileNode);
        assertEquals("while(a < b){i++;}", consumer.getCode());
    }

    @Test
    public void testAddNodeDoWhileLoop() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node body = new Node(Token.BLOCK, Node.newString("doIt();"));
        Node condition = Node.newString("x > 0");
        Node doNode = new Node(Token.DO, body, condition);
        cg.add(doNode);
        assertEquals("do{doIt();}while(x > 0);", consumer.getCode());
    }

    @Test
    public void testAddNodeForLoop() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node initializer = new Node(Token.VAR, new Node(Token.ASSIGN, Node.newString("i"), Node.newNumber(0)));
        Node condition = new Node(Token.LT, Node.newString("i"), Node.newNumber(10));
        Node increment = new Node(Token.INC, Node.newString("i"));
        Node body = new Node(Token.BLOCK, Node.newString("process(i);"));
        Node forNode = new Node(Token.FOR, initializer, condition, increment, body);
        cg.add(forNode);
        assertEquals("for(var i = 0;i < 10;++i){process(i);}", consumer.getCode());
    }

    @Test
    public void testAddNodeForInLoop() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node variable = Node.newString("key");
        Node iterable = Node.newString("myArray");
        Node body = new Node(Token.BLOCK, Node.newString("alert(myArray[key]);"));
        Node forInNode = new Node(Token.FOR, variable, iterable, body);
        cg.add(forInNode);
        assertEquals("for(key in myArray){alert(myArray[key]);}", consumer.getCode());
    }

    @Test
    public void testAddNodeTryCatchStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node tryBlock = new Node(Token.BLOCK, Node.newString("riskyOperation();"));
        Node catchVar = Node.newString("e");
        Node catchBlock = new Node(Token.BLOCK, Node.newString("logError(e);"));
        Node catchNode = new Node(Token.CATCH, catchVar, catchBlock);
        Node tryNode = new Node(Token.TRY, tryBlock, catchNode);
        cg.add(tryNode);
        assertEquals("try{riskyOperation();}catch(e){logError(e);}", consumer.getCode());
    }

    @Test
    public void testAddNodeTryFinallyStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node tryBlock = new Node(Token.BLOCK, Node.newString("doSomething();"));
        Node finallyBlock = new Node(Token.BLOCK, Node.newString("cleanup();"));
        Node tryNode = new Node(Token.TRY, tryBlock, null, finallyBlock);
        cg.add(tryNode);
        assertEquals("try{doSomething();}finally{cleanup();}", consumer.getCode());
    }

    @Test
    public void testAddNodeThrowStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node exception = Node.newString("Error('Something went wrong')");
        Node throwNode = new Node(Token.THROW, exception);
        cg.add(throwNode);
        assertEquals("throw Error('Something went wrong');", consumer.getCode());
    }

    @Test
    public void testAddNodeReturnStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node value = Node.newNumber(42);
        Node returnNode = new Node(Token.RETURN, value);
        cg.add(returnNode);
        assertEquals("return 42", consumer.getCode());
    }

    @Test
    public void testAddNodeReturnStatementNoValue() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node returnNode = new Node(Token.RETURN);
        cg.add(returnNode);
        assertEquals("return", consumer.getCode());
    }

    @Test
    public void testAddNodeBreakStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node breakNode = new Node(Token.BREAK);
        cg.add(breakNode);
        assertEquals("break;", consumer.getCode());
    }

    @Test
    public void testAddNodeBreakStatementWithLabel() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node label = new Node(Token.LABEL_NAME, "myLabel");
        Node breakNode = new Node(Token.BREAK, label);
        cg.add(breakNode);
        assertEquals("break myLabel;", consumer.getCode());
    }

    @Test
    public void testAddNodeContinueStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node continueNode = new Node(Token.CONTINUE);
        cg.add(continueNode);
        assertEquals("continue;", consumer.getCode());
    }

    @Test
    public void testAddNodeContinueStatementWithLabel() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node label = new Node(Token.LABEL_NAME, "loop");
        Node continueNode = new Node(Token.CONTINUE, label);
        cg.add(continueNode);
        assertEquals("continue loop;", consumer.getCode());
    }

    @Test
    public void testAddNodeUnaryOperatorNot() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node operand = Node.newNumber(1);
        Node notNode = new Node(Token.NOT, operand);
        cg.add(notNode);
        assertEquals("!1", consumer.getCode());
    }

    @Test
    public void testAddNodeUnaryOperatorBitwiseNot() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node operand = Node.newNumber(5);
        Node bitnotNode = new Node(Token.BITNOT, operand);
        cg.add(bitnotNode);
        assertEquals("~5", consumer.getCode());
    }

    @Test
    public void testAddNodeUnaryOperatorPos() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node operand = Node.newNumber(5);
        Node posNode = new Node(Token.POS, operand);
        cg.add(posNode);
        assertEquals("+5", consumer.getCode());
    }

    @Test
    public void testAddNodeUnaryOperatorNeg() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node operand = Node.newNumber(5);
        Node negNode = new Node(Token.NEG, operand);
        cg.add(negNode);
        assertEquals("-5", consumer.getCode());
    }

    @Test
    public void testAddNodeUnaryOperatorNegWithNumberChild() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node operand = Node.newNumber(-5); // Rhino parses --5 as 5, so this tests the NEG case with NUMBER
        Node negNode = new Node(Token.NEG, operand);
        cg.add(negNode);
        // The AST is -(-5). The CodeGenerator's NEG case for a NUMBER child
        // negates the double value. So, -(-5.0) becomes 5.0.
        assertEquals("5", consumer.getCode());
    }


    @Test
    public void testAddNodePrefixIncrement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node var = Node.newString("x");
        Node incNode = new Node(Token.INC, var);
        incNode.putIntProp(Node.INCRDECR_PROP, 0); // Prefix
        cg.add(incNode);
        assertEquals("++x", consumer.getCode());
    }

    @Test
    public void testAddNodePostfixIncrement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node var = Node.newString("x");
        Node incNode = new Node(Token.INC, var);
        incNode.putIntProp(Node.INCRDECR_PROP, 1); // Postfix
        cg.add(incNode);
        assertEquals("x++", consumer.getCode());
    }

    @Test
    public void testAddNodePrefixDecrement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node var = Node.newString("y");
        Node decNode = new Node(Token.DEC, var);
        decNode.putIntProp(Node.INCRDECR_PROP, 0); // Prefix
        cg.add(decNode);
        assertEquals("--y", consumer.getCode());
    }

    @Test
    public void testAddNodePostfixDecrement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node var = Node.newString("y");
        Node decNode = new Node(Token.DEC, var);
        decNode.putIntProp(Node.INCRDECR_PROP, 1); // Postfix
        cg.add(decNode);
        assertEquals("y--", consumer.getCode());
    }

    @Test
    public void testAddNodeDeleteProperty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node propertyAccess = new Node(Token.GETPROP, Node.newString("obj"), Node.newString("prop"));
        Node deleteNode = new Node(Token.DELPROP, propertyAccess);
        cg.add(deleteNode);
        assertEquals("delete obj.prop", consumer.getCode());
    }

    @Test
    public void testAddNodeCommaExpression() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        Node commaNode = new Node(Token.COMMA, left, right);
        cg.add(commaNode);
        assertEquals("1,2", consumer.getCode());
    }

    @Test
    public void testAddNodeExpressionStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node expression = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node exprStmtNode = new Node(Token.EXPR_RESULT, expression);
        cg.add(exprStmtNode);
        assertEquals("1+2;", consumer.getCode());
    }

    @Test
    public void testAddNodeWithStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node expression = Node.newString("myObj");
        Node body = new Node(Token.BLOCK, Node.newString("x = 10;"));
        Node withNode = new Node(Token.WITH, expression, body);
        cg.add(withNode);
        assertEquals("with(myObj){x = 10;}", consumer.getCode());
    }

    @Test
    public void testAddNodeLabeledStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node labelName = new Node(Token.LABEL_NAME, "loop");
        Node statement = new Node(Token.BLOCK, Node.newString("i++;"));
        Node labeledNode = new Node(Token.LABEL, labelName, statement);
        cg.add(labeledNode);
        assertEquals("loop:{i++;}", consumer.getCode());
    }

    @Test
    public void testAddNodeCaseStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node caseValue = Node.newNumber(1);
        Node caseBody = new Node(Token.BLOCK, Node.newString("doSomething();"));
        Node caseNode = new Node(Token.CASE, caseValue, caseBody);
        cg.add(caseNode);
        assertEquals("case 1:{doSomething();}", consumer.getCode());
    }

    @Test
    public void testAddNodeDefaultStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node defaultBody = new Node(Token.BLOCK, Node.newString("defaultAction();"));
        Node defaultNode = new Node(Token.DEFAULT, defaultBody);
        cg.add(defaultNode);
        assertEquals("default:{defaultAction();}", consumer.getCode());
    }

    @Test
    public void testAddNodeSwitchStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node caseValue1 = Node.newNumber(1);
        Node caseBody1 = new Node(Token.BLOCK, Node.newString("one();"));
        Node caseNode1 = new Node(Token.CASE, caseValue1, caseBody1);
        Node defaultBody = new Node(Token.BLOCK, Node.newString("other();"));
        Node defaultNode = new Node(Token.DEFAULT, defaultBody);
        Node switchNode = new Node(Token.SWITCH, Node.newString("x"), caseNode1, defaultNode);
        cg.add(switchNode);
        assertEquals("switch(x){case 1:{one();}default:{other();}}", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteral() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node regexp = Node.newString("/abc/g");
        Node regexpNode = new Node(Token.REGEXP, regexp);
        cg.add(regexpNode);
        assertEquals("/abc/g", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithFlags() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node regexp = Node.newString("/abc/gi");
        Node regexpNode = new Node(Token.REGEXP, regexp);
        cg.add(regexpNode);
        assertEquals("/abc/gi", consumer.getCode());
    }

    @Test
    public void testAddNodeUnaryOperatorTypeof() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node operand = Node.newString("x");
        Node typeofNode = new Node(Token.TYPEOF, operand);
        cg.add(typeofNode);
        assertEquals("typeof x", consumer.getCode());
    }

    @Test
    public void testAddNodeUnaryOperatorVoid() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node operand = Node.newString("y");
        Node voidNode = new Node(Token.VOID, operand);
        cg.add(voidNode);
        assertEquals("void y", consumer.getCode());
    }

    @Test
    public void testAddNodeGetRef() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node name = Node.newString("myVar");
        Node getRefNode = new Node(Token.GET_REF, name);
        cg.add(getRefNode);
        assertEquals("myVar", consumer.getCode());
    }

    @Test
    public void testAddNodeRefSpecial() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node base = Node.newString("obj");
        Node refSpecialNode = new Node(Token.REF_SPECIAL, base);
        refSpecialNode.putProp(Node.NAME_PROP, "property");
        cg.add(refSpecialNode);
        assertEquals("obj.property", consumer.getCode());
    }

    @Test
    public void testAddNodeGet() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node name = Node.newString("myGetter");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        Node funcNode = new Node(Token.FUNCTION, name, params, body);
        Node getNode = new Node(Token.GET, funcNode);
        getNode.setString("myGetter");
        cg.add(getNode);
        assertEquals("get myGetter(){}", consumer.getCode());
    }

    @Test
    public void testAddNodeSet() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node name = Node.newString("mySetter");
        Node param = new Node(Token.LP, Node.newString("val"));
        Node body = new Node(Token.BLOCK);
        Node funcNode = new Node(Token.FUNCTION, name, param, body);
        Node setNode = new Node(Token.SET, funcNode);
        setNode.setString("mySetter");
        cg.add(setNode);
        assertEquals("set mySetter(val){}", consumer.getCode());
    }

    @Test
    public void testAddNodeObjectLitWithNumericKey() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node key = Node.newString("123");
        Node value = Node.newNumber(456);
        Node prop = new Node(Token.STRING, key, value);
        Node objNode = new Node(Token.OBJECTLIT, prop);
        cg.add(objNode);
        assertEquals("{\"123\":456}", consumer.getCode());
    }

    @Test
    public void testAddNodeObjectLitWithQuotedKey() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node key = Node.newString("key with spaces");
        Node value = Node.newNumber(1);
        Node prop = new Node(Token.STRING, key, value);
        prop.putBooleanProp(Node.QUOTED_PROP, true); // Mark as quoted
        Node objNode = new Node(Token.OBJECTLIT, prop);
        cg.add(objNode);
        assertEquals("{\"key with spaces\":1}", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorAssociativity() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node node1 = Node.newNumber(1);
        Node node2 = Node.newNumber(2);
        Node node3 = Node.newNumber(3);
        Node innerAdd = new Node(Token.ADD, node2, node3);
        Node outerAdd = new Node(Token.ADD, node1, innerAdd);
        cg.add(outerAdd);
        assertEquals("1+2+3", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorRightAssociativity() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node node1 = Node.newNumber(1);
        Node node2 = Node.newNumber(2);
        Node node3 = Node.newNumber(3);
        Node innerAssign = new Node(Token.ASSIGN, Node.newString("x"), node3);
        Node outerAssign = new Node(Token.ASSIGN, Node.newString("y"), innerAssign);
        cg.add(outerAssign);
        assertEquals("y=x=3", consumer.getCode());
    }

    @Test
    public void testAddNodeCallWithIndirectEval() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node evalName = Node.newString("eval");
        evalName.putBooleanProp(Node.DIRECT_EVAL, false); // Mark as indirect eval
        Node arg = Node.newNumber(1);
        Node callNode = new Node(Token.CALL, evalName, arg);
        cg.add(callNode);
        assertEquals("(0,eval)(1)", consumer.getCode());
    }

    @Test
    public void testAddNodeCallWithFreeCallAndGet() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node obj = Node.newString("obj");
        Node prop = Node.newString("method");
        Node getPropNode = new Node(Token.GETPROP, obj, prop);
        getPropNode.putBooleanProp(Node.FREE_CALL, true); // Mark as free call
        Node arg = Node.newNumber(1);
        Node callNode = new Node(Token.CALL, getPropNode, arg);
        cg.add(callNode);
        assertEquals("(0,obj.method)(1)", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpWithEscapedChars() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        // Test for special characters that need escaping in regex.
        String pattern = "[\\^$.|?*+()";
        Node regexp = Node.newString("/" + pattern + "/");
        Node regexpNode = new Node(Token.REGEXP, regexp);
        cg.add(regexpNode);
        // Expected output of regexpEscape should handle these characters correctly.
        assertEquals("/[\\\\\\^\\$\\.\\|\\?\\*\\+\\(\\)]/", consumer.getCode());
    }

    @Test
    public void testAddJsStringWithQuotes() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String testString = "This string has \"double\" and 'single' quotes.";
        cg.addJsString(testString);
        // The jsString method should choose the optimal quote.
        // Here, single quotes are more frequent, so it should use double quotes.
        assertEquals("\"This string has \\\"double\\\" and 'single' quotes.\"", consumer.getCode());
    }

    @Test
    public void testAddJsStringWithMoreSingleQuotes() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String testString = "This 'string' has 'many' single quotes.";
        cg.addJsString(testString);
        // Here, single quotes are more frequent, so it should use double quotes.
        assertEquals("\"This 'string' has 'many' single quotes.\"", consumer.getCode());
    }

    @Test
    public void testAddJsStringWithMoreDoubleQuotes() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String testString = "This \"string\" has \"many\" double quotes.";
        cg.addJsString(testString);
        // Here, double quotes are more frequent, so it should use single quotes.
        assertEquals("'This \"string\" has \"many\" double quotes.'", consumer.getCode());
    }

    @Test
    public void testAddJsStringWithEscapedChars() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String testString = "String with\nnewline and\t tab.";
        cg.addJsString(testString);
        assertEquals("\"String with\\nnewline and\\t tab.\"", consumer.getCode());
    }

    @Test
    public void testAddIdentifierEscape() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String identifier = "my-var"; // Invalid JS identifier
        cg.addIdentifier(CodeGenerator.identifierEscape(identifier));
        // The identifierEscape method should convert to valid JS identifier
        assertEquals("my\\x2dvar", consumer.getCode());
    }

    @Test
    public void testAddIdentifierEscapeWithUnicode() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String identifier = "你好"; // Unicode characters
        cg.addIdentifier(CodeGenerator.identifierEscape(identifier));
        // The unicode escape should be \\uXXXX format, not literal \u
        assertEquals("\\u4f60\\u597d", consumer.getCode());
    }

    @Test
    public void testHandleNestedBinaryOperators() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node left = Node.newNumber(10);
        Node middle = Node.newNumber(5);
        Node right = Node.newNumber(2);
        Node divNode = new Node(Token.DIV, middle, right);
        Node addNode = new Node(Token.ADD, left, divNode);
        cg.add(addNode);
        assertEquals("10+5/2", consumer.getCode());
    }

    @Test
    public void testHandleAssignmentWithNestedExpression() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node target = Node.newString("a");
        Node expr = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node assignNode = new Node(Token.ASSIGN, target, expr);
        cg.add(assignNode);
        assertEquals("a=1+2", consumer.getCode());
    }
}
