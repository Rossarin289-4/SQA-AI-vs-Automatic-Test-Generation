package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.NodeUtil.MatchNotFunction;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CodeGeneratorTest {

    // Helper to create a dummy CodeConsumer for testing.
    private static class RecordingConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();
        @Override
        char getLastChar() {
            if (sb.length() == 0) {
                return '\0';
            }
            return sb.charAt(sb.length() - 1);
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
        void startSourceMapping(Node node) {}

        @Override
        void endSourceMapping(Node node) {}

        @Override
        boolean continueProcessing() { return true; }

        @Override
        void appendBlockStart() { sb.append("{"); }

        @Override
        void appendBlockEnd() { sb.append("}"); }

        @Override
        void startNewLine() { sb.append("\n"); }

        @Override
        void maybeLineBreak() { sb.append("\n"); }

        @Override
        void maybeCutLine() { sb.append(" "); }

        @Override
        void endLine() { sb.append("\n"); }

        @Override
        void notePreferredLineBreak() { sb.append("\n"); }

        @Override
        void beginBlock() { sb.append("{"); }

        @Override
        void endBlock() { sb.append("}"); }

        @Override
        void endBlock(boolean shouldEndLine) { sb.append("}"); if (shouldEndLine) sb.append("\n"); }

        @Override
        void listSeparator() { sb.append(","); }

        @Override
        void endStatement() { sb.append(";"); }

        @Override
        void endStatement(boolean needSemiColon) { if (needSemiColon) sb.append(";"); }

        @Override
        void maybeEndStatement() { sb.append(";"); }

        @Override
        void endFunction() { }

        @Override
        void endFunction(boolean statementContext) { }

        @Override
        void beginCaseBody() { sb.append(":"); }

        @Override
        void endCaseBody() { }

        @Override
        void add(String newcode) { sb.append(newcode); }

        @Override
        boolean shouldPreserveExtraBlocks() { return false; }

        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) { return false; }

        @Override
        void endFile() { }

        String getText() {
            return sb.toString();
        }
    }

    private CodeGenerator createGenerator(CodeConsumer consumer, Charset charset) {
        return new CodeGenerator(consumer, charset);
    }

    private CodeGenerator createGenerator(CodeConsumer consumer) {
        return new CodeGenerator(consumer);
    }

    // Helper to create a Node from a string representation.
    // This is a simplified version for testing purposes.
    private Node parseJsCode(String jsCode) {
        if (jsCode.equals("'use strict';")) {
            Node script = new Node(Token.SCRIPT);
            Node stringNode = Node.newString(Token.STRING, jsCode.substring(1, jsCode.length() - 1));
            Node exprResult = new Node(Token.EXPR_RESULT, stringNode);
            script.addChildToBack(exprResult);
            return script;
        }
        return null;
    }

    @Test
    public void testTagAsStrict() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node script = parseJsCode("'use strict';");
        generator.add(script);
        assertEquals("'use strict';", consumer.getText());
    }

    @Test
    public void testAddMethodWithStringLiteral() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = Node.newString(Token.STRING, "test");
        generator.add(node);
        assertEquals("\"test\"", consumer.getText());
    }

    @Test
    public void testAddMethodWithNumberLiteral() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = Node.newNumber(123.45);
        generator.add(node);
        assertEquals("123.45", consumer.getText());
    }

    @Test
    public void testAddMethodWithNullLiteral() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.NULL);
        generator.add(node);
        assertEquals("null", consumer.getText());
    }

    @Test
    public void testAddMethodWithBooleanLiteralTrue() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.TRUE);
        generator.add(node);
        assertEquals("true", consumer.getText());
    }

    @Test
    public void testAddMethodWithBooleanLiteralFalse() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.FALSE);
        generator.add(node);
        assertEquals("false", consumer.getText());
    }

    @Test
    public void testAddMethodWithThisKeyword() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.THIS);
        generator.add(node);
        assertEquals("this", consumer.getText());
    }

    @Test
    public void testAddMethodWithArrayLiteralEmpty() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.ARRAYLIT);
        generator.add(node);
        assertEquals("[]", consumer.getText());
    }

    @Test
    public void testAddMethodWithArrayLiteralWithOneElement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.ARRAYLIT, Node.newNumber(1));
        generator.add(node);
        assertEquals("[1]", consumer.getText());
    }

    @Test
    public void testAddMethodWithArrayLiteralWithMultipleElements() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newString(Token.STRING, "a"));
        generator.add(node);
        assertEquals("[1,\"a\"]", consumer.getText());
    }

    @Test
    public void testAddMethodWithObjectLiteralEmpty() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.OBJECTLIT);
        generator.add(node);
        assertEquals("{}", consumer.getText());
    }

    @Test
    public void testAddMethodWithObjectLiteralWithOneProperty() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node property = Node.newString(Token.STRING, "key");
        property.addChildToBack(Node.newNumber(1));
        Node node = new Node(Token.OBJECTLIT, property);
        generator.add(node);
        assertEquals("{\"key\":1}", consumer.getText());
    }

    @Test
    public void testAddMethodWithObjectLiteralWithMultipleProperties() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node prop1 = Node.newString(Token.STRING, "key1");
        prop1.addChildToBack(Node.newNumber(1));
        Node prop2 = Node.newString(Token.STRING, "key2");
        prop2.addChildToBack(Node.newString(Token.STRING, "value"));
        Node node = new Node(Token.OBJECTLIT, prop1, prop2);
        generator.add(node);
        assertEquals("{\"key1\":1,\"key2\":\"value\"}", consumer.getText());
    }

    @Test
    public void testAddMethodWithVariableDeclaration() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNode = new Node(Token.NAME, "x");
        nameNode.addChildToBack(Node.newNumber(10));
        Node varNode = new Node(Token.VAR, nameNode);
        generator.add(varNode);
        assertEquals("var x=10;", consumer.getText());
    }

    @Test
    public void testAddMethodWithVariableDeclarationWithoutInitializer() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNode = new Node(Token.NAME, "y");
        Node varNode = new Node(Token.VAR, nameNode);
        generator.add(varNode);
        assertEquals("var y;", consumer.getText());
    }

    @Test
    public void testAddMethodWithAssignment() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNode = new Node(Token.NAME, "x");
        Node assignmentNode = new Node(Token.ASSIGN, nameNode, Node.newNumber(20));
        generator.add(assignmentNode);
        assertEquals("x=20", consumer.getText());
    }

    @Test
    public void testAddMethodWithBinaryAddOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node addNode = new Node(Token.ADD, Node.newNumber(5), Node.newNumber(10));
        generator.add(addNode);
        assertEquals("5+10", consumer.getText());
    }

    @Test
    public void testAddMethodWithBinarySubtractOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node subNode = new Node(Token.SUB, Node.newNumber(20), Node.newNumber(5));
        generator.add(subNode);
        assertEquals("20-5", consumer.getText());
    }

    @Test
    public void testAddMethodWithBinaryMultiplyOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node mulNode = new Node(Token.MUL, Node.newNumber(3), Node.newNumber(7));
        generator.add(mulNode);
        assertEquals("3*7", consumer.getText());
    }

    @Test
    public void testAddMethodWithBinaryDivideOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node divNode = new Node(Token.DIV, Node.newNumber(21), Node.newNumber(3));
        generator.add(divNode);
        assertEquals("21/3", consumer.getText());
    }

    @Test
    public void testAddMethodWithBinaryModuloOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node modNode = new Node(Token.MOD, Node.newNumber(10), Node.newNumber(3));
        generator.add(modNode);
        assertEquals("10%3", consumer.getText());
    }

    @Test
    public void testAddMethodWithUnaryNotOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node notNode = new Node(Token.NOT, Node.newNumber(0));
        generator.add(notNode);
        assertEquals("!0", consumer.getText());
    }

    @Test
    public void testAddMethodWithUnaryBitNotOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node bitNotNode = new Node(Token.BITNOT, Node.newNumber(5));
        generator.add(bitNotNode);
        assertEquals("~5", consumer.getText());
    }

    @Test
    public void testAddMethodWithUnaryPositiveOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node posNode = new Node(Token.POS, Node.newNumber(-10));
        generator.add(posNode);
        assertEquals("+ -10", consumer.getText()); // Note: CodeGenerator might print '+ -10' for '-10'
    }

    @Test
    public void testAddMethodWithUnaryNegativeOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node negNode = new Node(Token.NEG, Node.newNumber(15));
        generator.add(negNode);
        assertEquals("-15", consumer.getText());
    }

    @Test
    public void testAddMethodWithNegOperatorOnNumber() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node negNode = new Node(Token.NEG, Node.newNumber(-2));
        generator.add(negNode);
        assertEquals("2", consumer.getText()); // Special case in CodeGenerator.NEG
    }

    @Test
    public void testAddMethodWithTypeOfOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node typeofNode = new Node(Token.TYPEOF, Node.newString(Token.STRING, "variable"));
        generator.add(typeofNode);
        assertEquals("typeof variable", consumer.getText());
    }

    @Test
    public void testAddMethodWithVoidOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node voidNode = new Node(Token.VOID, Node.newNumber(0));
        generator.add(voidNode);
        assertEquals("void 0", consumer.getText());
    }

    @Test
    public void testAddMethodWithPrefixIncrementOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNode = new Node(Token.NAME, "count");
        Node incNode = new Node(Token.INC, nameNode);
        incNode.putIntProp(Node.INCRDECR_PROP, 0); // Pre-increment
        generator.add(incNode);
        assertEquals("++count", consumer.getText());
    }

    @Test
    public void testAddMethodWithPostfixIncrementOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNode = new Node(Token.NAME, "count");
        Node incNode = new Node(Token.INC, nameNode);
        incNode.putIntProp(Node.INCRDECR_PROP, 1); // Post-increment
        generator.add(incNode);
        assertEquals("count++", consumer.getText());
    }

    @Test
    public void testAddMethodWithPrefixDecrementOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNode = new Node(Token.NAME, "count");
        Node decNode = new Node(Token.DEC, nameNode);
        decNode.putIntProp(Node.INCRDECR_PROP, 0); // Pre-decrement
        generator.add(decNode);
        assertEquals("--count", consumer.getText());
    }

    @Test
    public void testAddMethodWithPostfixDecrementOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNode = new Node(Token.NAME, "count");
        Node decNode = new Node(Token.DEC, nameNode);
        decNode.putIntProp(Node.INCRDECR_PROP, 1); // Post-decrement
        generator.add(decNode);
        assertEquals("count--", consumer.getText());
    }

    @Test
    public void testAddMethodWithGetProp() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node objNode = new Node(Token.NAME, "obj");
        Node propNode = Node.newString(Token.STRING, "prop");
        Node getPropNode = new Node(Token.GETPROP, objNode, propNode);
        generator.add(getPropNode);
        assertEquals("obj.prop", consumer.getText());
    }

    @Test
    public void testAddMethodWithGetElem() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node arrNode = new Node(Token.NAME, "arr");
        Node indexNode = Node.newNumber(0);
        Node getElemNode = new Node(Token.GETELEM, arrNode, indexNode);
        generator.add(getElemNode);
        assertEquals("arr[0]", consumer.getText());
    }

    @Test
    public void testAddMethodWithCall() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node funcNode = new Node(Token.NAME, "func");
        Node callNode = new Node(Token.CALL, funcNode);
        callNode.addChildToBack(Node.newNumber(1));
        callNode.addChildToBack(Node.newNumber(2));
        generator.add(callNode);
        assertEquals("func(1,2)", consumer.getText());
    }

    @Test
    public void testAddMethodWithNewOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node classNameNode = new Node(Token.NAME, "MyClass");
        Node newNode = new Node(Token.NEW, classNameNode);
        newNode.addChildToBack(Node.newString(Token.STRING, "arg"));
        generator.add(newNode);
        assertEquals("new MyClass(\"arg\")", consumer.getText());
    }

    @Test
    public void testAddMethodWithNewOperatorNoArgs() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node classNameNode = new Node(Token.NAME, "MyClass");
        Node newNode = new Node(Token.NEW, classNameNode);
        generator.add(newNode);
        assertEquals("new MyClass()", consumer.getText());
    }

    @Test
    public void testAddMethodWithConditionalOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node condition = new Node(Token.LT, Node.newNumber(10), Node.newNumber(20));
        Node thenBranch = Node.newNumber(1);
        Node elseBranch = Node.newNumber(0);
        Node hookNode = new Node(Token.HOOK, condition, thenBranch, elseBranch);
        generator.add(hookNode);
        assertEquals("10<20?1:0", consumer.getText());
    }

    @Test
    public void testAddMethodWithIfStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node condition = new Node(Token.TRUE);
        Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "then")));
        Node ifNode = new Node(Token.IF, condition, thenBlock);
        generator.add(ifNode);
        assertEquals("if(true){\"then\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithIfElseStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node condition = new Node(Token.TRUE);
        Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "then")));
        Node elseBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "else")));
        Node ifNode = new Node(Token.IF, condition, thenBlock, elseBlock);
        generator.add(ifNode);
        assertEquals("if(true){\"then\";}else{\"else\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithWhileStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node condition = new Node(Token.TRUE);
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "loop")));
        Node whileNode = new Node(Token.WHILE, condition, body);
        generator.add(whileNode);
        assertEquals("while(true){\"loop\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithDoWhileStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node condition = new Node(Token.TRUE);
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "loop")));
        Node doNode = new Node(Token.DO, body, condition);
        generator.add(doNode);
        assertEquals("do{\"loop\";}while(true);", consumer.getText());
    }

    @Test
    public void testAddMethodWithForStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node nameNodeInit = new Node(Token.NAME, "i");
        nameNodeInit.addChildToBack(Node.newNumber(0));
        Node init = new Node(Token.VAR, nameNodeInit);
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), Node.newNumber(10));
        Node nameNodeInc = new Node(Token.NAME, "i");
        Node increment = new Node(Token.INC, nameNodeInc);
        increment.putIntProp(Node.INCRDECR_PROP, 0); // Pre-increment
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "loop")));
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        generator.add(forNode);
        assertEquals("for(var i=0;i<10;++i){\"loop\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithForInStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node leftNameNode = new Node(Token.NAME, "key");
        Node left = new Node(Token.VAR, leftNameNode);
        Node right = new Node(Token.NAME, "obj");
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "loop")));
        Node forInNode = new Node(Token.FOR, left, right, body);
        generator.add(forInNode);
        assertEquals("for(var key in obj){\"loop\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithTryCatchStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node tryBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "try")));
        Node catchParam = new Node(Token.NAME, "e");
        Node catchBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "catch")));
        Node catchNode = new Node(Token.CATCH, catchParam, catchBlock);
        Node tryCatchNode = new Node(Token.TRY, tryBlock, catchNode);
        generator.add(tryCatchNode);
        assertEquals("try{\"try\";}catch(e){\"catch\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithTryFinallyStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node tryBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "try")));
        Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "finally")));
        Node tryFinallyNode = new Node(Token.TRY, tryBlock, null, finallyBlock); // Third child is finally
        generator.add(tryFinallyNode);
        assertEquals("try{\"try\";}finally{\"finally\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithTryCatchFinallyStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node tryBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "try")));
        Node catchParam = new Node(Token.NAME, "e");
        Node catchBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "catch")));
        Node catchNode = new Node(Token.CATCH, catchParam, catchBlock);
        Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "finally")));
        Node tryCatchFinallyNode = new Node(Token.TRY, tryBlock, catchNode, finallyBlock);
        generator.add(tryCatchFinallyNode);
        assertEquals("try{\"try\";}catch(e){\"catch\";}finally{\"finally\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithThrowStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node throwNode = new Node(Token.THROW, Node.newString(Token.STRING, "Error"));
        generator.add(throwNode);
        assertEquals("throw\"Error\";", consumer.getText());
    }

    @Test
    public void testAddMethodWithReturnStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node returnNode = new Node(Token.RETURN, Node.newNumber(42));
        generator.add(returnNode);
        assertEquals("return 42;", consumer.getText());
    }

    @Test
    public void testAddMethodWithReturnStatementNoValue() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node returnNode = new Node(Token.RETURN);
        generator.add(returnNode);
        assertEquals("return;", consumer.getText());
    }

    @Test
    public void testAddMethodWithContinueStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node continueNode = new Node(Token.CONTINUE);
        generator.add(continueNode);
        assertEquals("continue;", consumer.getText());
    }

    @Test
    public void testAddMethodWithContinueStatementWithLabel() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node labelNode = new Node(Token.LABEL_NAME, "myLabel");
        Node continueNode = new Node(Token.CONTINUE, labelNode);
        generator.add(continueNode);
        assertEquals("continue myLabel;", consumer.getText());
    }

    @Test
    public void testAddMethodWithBreakStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node breakNode = new Node(Token.BREAK);
        generator.add(breakNode);
        assertEquals("break;", consumer.getText());
    }

    @Test
    public void testAddMethodWithBreakStatementWithLabel() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node labelNode = new Node(Token.LABEL_NAME, "myLabel");
        Node breakNode = new Node(Token.BREAK, labelNode);
        generator.add(breakNode);
        assertEquals("break myLabel;", consumer.getText());
    }

    @Test
    public void testAddMethodWithWithStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node objectNode = new Node(Token.NAME, "obj");
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "access")));
        Node withNode = new Node(Token.WITH, objectNode, body);
        generator.add(withNode);
        assertEquals("with(obj){\"access\";}", consumer.getText());
    }

    @Test
    public void testAddMethodWithFunctionDeclaration() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node name = new Node(Token.NAME, "myFunc");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
        Node functionNode = new Node(Token.FUNCTION, name, params, body);
        generator.add(functionNode, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc(){return 1;}", consumer.getText());
    }

    @Test
    public void testAddMethodWithFunctionExpression() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node name = new Node(Token.NAME, "myFunc"); // Function expression can have a name
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
        Node functionNode = new Node(Token.FUNCTION, name, params, body);
        generator.add(functionNode, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("(function myFunc(){return 1;})", consumer.getText());
    }

    @Test
    public void testAddMethodWithAnonymousFunctionExpression() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node name = new Node(Token.NAME, ""); // Empty name for anonymous
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
        Node functionNode = new Node(Token.FUNCTION, name, params, body);
        generator.add(functionNode, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("(function(){return 1;})", consumer.getText());
    }

    @Test
    public void testAddMethodWithRegExpLiteral() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node regexpNode = new Node(Token.REGEXP, Node.newString(Token.STRING, "/abc/"), Node.newString(Token.STRING, ""));
        generator.add(regexpNode);
        assertEquals("/abc/", consumer.getText());
    }

    @Test
    public void testAddMethodWithRegExpLiteralWithFlags() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node regexpNode = new Node(Token.REGEXP, Node.newString(Token.STRING, "/abc/"), Node.newString(Token.STRING, "gi"));
        generator.add(regexpNode);
        assertEquals("/abc/gi", consumer.getText());
    }

    @Test
    public void testAddMethodWithGetRef() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node getRefNode = new Node(Token.GET_REF, new Node(Token.NAME, "x"));
        generator.add(getRefNode);
        assertEquals("x", consumer.getText());
    }

    @Test
    public void testAddMethodWithRefSpecial() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node objNode = new Node(Token.NAME, "obj");
        Node refSpecialNode = new Node(Token.REF_SPECIAL, objNode);
        refSpecialNode.putProp(Node.NAME_PROP, "prop");
        generator.add(refSpecialNode);
        assertEquals("obj.prop", consumer.getText());
    }

    @Test
    public void testAddMethodWithLabel() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node labelNameNode = new Node(Token.LABEL_NAME, "loop");
        Node statementNode = new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "continue"));
        Node labelNode = new Node(Token.LABEL, labelNameNode, statementNode);
        generator.add(labelNode);
        assertEquals("loop:\"continue\";", consumer.getText());
    }

    @Test
    public void testAddMethodWithSwitchStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node expression = new Node(Token.NAME, "value");
        Node case1Body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "case1")));
        Node case1 = new Node(Token.CASE, Node.newNumber(1), case1Body);
        Node case2Body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "case2")));
        Node case2 = new Node(Token.CASE, Node.newNumber(2), case2Body);
        Node defaultBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.STRING, "default")));
        Node defaultCase = new Node(Token.DEFAULT, defaultBody);
        Node switchNode = new Node(Token.SWITCH, expression, case1, case2, defaultCase);
        generator.add(switchNode);
        assertEquals("switch(value){case 1:{\"case1\";}case 2:{\"case2\";}default:{\"default\";}}", consumer.getText());
    }

    @Test
    public void testAddMethodWithDeleteOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node objectNode = new Node(Token.NAME, "obj");
        Node propNameNode = Node.newString(Token.STRING, "prop");
        Node deleteNode = new Node(Token.DELPROP, objectNode, propNameNode);
        generator.add(deleteNode);
        assertEquals("delete obj.prop", consumer.getText());
    }

    @Test
    public void testAddMethodWithDebuggerStatement() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node debuggerNode = new Node(Token.DEBUGGER);
        generator.add(debuggerNode);
        assertEquals("debugger;", consumer.getText());
    }

    @Test
    public void testAddMethodWithCommaOperator() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node commaNode = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
        generator.add(commaNode);
        assertEquals("1,2", consumer.getText());
    }

    @Test
    public void testAddMethodWithParentheses() throws Exception {
        RecordingConsumer consumer = new RecordingConsumer();
        CodeGenerator generator = createGenerator(consumer);
        Node node = new Node(Token.LP, Node.newNumber(5));
        generator.add(node);
        assertEquals("(5)", consumer.getText());
    }
}
