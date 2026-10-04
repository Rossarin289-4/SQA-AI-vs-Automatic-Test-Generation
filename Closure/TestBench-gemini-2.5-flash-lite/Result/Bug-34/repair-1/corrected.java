package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import com.google.debugging.sourcemap.FilePosition;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CodeGeneratorTest {

    // Helper method to create a CodeConsumer for testing
    private CodeConsumer createCodeConsumer() {
        // Using a simple implementation that collects output in a StringBuilder
        return new CodeConsumer() {
            private final StringBuilder sb = new StringBuilder();
            private boolean shouldContinue = true;
            private int lineLength = 0;
            private int lineIndex = 0;
            private Node currentNode = null;

            @Override
            public void add(String str) {
                sb.append(str);
                lineLength += str.length();
            }

            @Override
            public void addIdentifier(String identifier) {
                sb.append(identifier);
                lineLength += identifier.length();
            }

            @Override
            public void addOp(String op, boolean binOp) {
                sb.append(op);
                lineLength += op.length();
            }

            @Override
            public void addNumber(double number) {
                sb.append(number);
                lineLength += String.valueOf(number).length();
            }

            @Override
            public void startSourceMapping(Node node) {
                currentNode = node;
            }

            @Override
            public void endSourceMapping(Node node) {
                currentNode = null;
            }

            @Override
            public void endStatement() {
                // No-op for this simple consumer
            }

            @Override
            public void endStatement(boolean semicolon) {
                // No-op for this simple consumer
            }

            @Override
            public void endFile() {
                // No-op for this simple consumer
            }

            @Override
            public void beginBlock() {
                // No-op for this simple consumer
            }

            @Override
            public void endBlock(boolean breakAfter) {
                // No-op for this simple consumer
            }

            @Override
            public void beginCaseBody() {
                // No-op for this simple consumer
            }

            @Override
            public void endCaseBody() {
                // No-op for this simple consumer
            }

            @Override
            public void maybeLineBreak() {
                // No-op for this simple consumer
            }

            @Override
            public void maybeEndStatement() {
                // No-op for this simple consumer
            }

            @Override
            public void startNewLine() {
                if (lineLength > 0) {
                    sb.append('\n');
                    lineIndex++;
                    lineLength = 0;
                }
            }

            @Override
            public void endLine() {
                startNewLine();
            }

            @Override
            public void listSeparator() {
                sb.append(',');
                lineLength += 1;
            }

            @Override
            public void appendBlockStart() {
                sb.append(" {");
                lineLength += 2;
            }

            @Override
            public void appendBlockEnd() {
                sb.append(" }");
                lineLength += 2;
            }

            @Override
            public void endFunction(boolean statementContext) {
                // No-op for this simple consumer
            }

            @Override
            public void continueProcessing() {
                // No-op for this simple consumer
            }

            @Override
            public boolean continueProcessing() {
                return shouldContinue;
            }

            @Override
            public void setContinueProcessing(boolean shouldContinue) {
                this.shouldContinue = shouldContinue;
            }

            @Override
            public boolean shouldPreserveExtraBlocks() {
                return false; // Default to not preserving for simplicity
            }

            @Override
            boolean breakAfterBlockFor(Node n, boolean isStatementContext) {
                return true; // Default to breaking for simplicity
            }

            public String getCode() {
                return sb.toString();
            }
        };
    }

    // Helper method to create CodeGenerator with a specific consumer and charset
    private CodeGenerator createCodeGenerator(CodeConsumer consumer, Charset charset) {
        return new CodeGenerator(consumer, charset);
    }

    // Helper method to create CodeGenerator with default consumer and charset
    private CodeGenerator createCodeGenerator() {
        return new CodeGenerator(createCodeConsumer(), null);
    }

    @Test
    public void testTagAsStrict() {
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.getCode());
    }

    @Test
    public void testAddNodeBlock() {
        Node block = new Node(Token.BLOCK);
        Node statement1 = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "a"));
        Node statement2 = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "b"));
        block.addChildToBack(statement1);
        block.addChildToBack(statement2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(block);
        assertEquals("a;\nb;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeTryCatchFinally() {
        Node tryBlock = new Node(Token.BLOCK);
        Node tryStatement = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "x"));
        tryBlock.addChildToBack(tryStatement);

        Node catchBlock = new Node(Token.BLOCK);
        Node catchVar = new Node(Token.NAME, "e");
        Node catchStatement = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "y"));
        catchBlock.addChildToBack(catchStatement);
        Node catchNode = new Node(Token.CATCH, catchVar, catchBlock);

        Node finallyBlock = new Node(Token.BLOCK);
        Node finallyStatement = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "z"));
        finallyBlock.addChildToBack(finallyStatement);

        Node tryNode = new Node(Token.TRY, tryBlock, catchNode, finallyBlock);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(tryNode);
        assertEquals("try { x; } catch(e) { y; } finally { z; }", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeThrow() {
        Node throwNode = new Node(Token.THROW, new Node(Token.STRING, "Error"));
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(throwNode);
        assertEquals("throw \"Error\";", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeReturn() {
        Node returnNode = new Node(Token.RETURN, new Node(Token.NUMBER, 123));
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(returnNode);
        assertEquals("return 123;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeVar() {
        Node varNode = new Node(Token.VAR);
        Node name1 = new Node(Token.NAME, "a");
        Node value1 = new Node(Token.NUMBER, 1);
        name1.addChildToBack(value1);
        Node name2 = new Node(Token.NAME, "b");
        Node value2 = new Node(Token.NUMBER, 2);
        name2.addChildToBack(value2);
        varNode.addChildToBack(name1);
        varNode.addChildToBack(name2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(varNode);
        assertEquals("var a = 1, b = 2;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeLabelName() {
        Node labelNameNode = new Node(Token.LABEL_NAME, "myLabel");
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(labelNameNode);
        assertEquals("myLabel", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeNameAssignment() {
        Node nameNode = new Node(Token.NAME, "x");
        Node value = new Node(Token.NUMBER, 10);
        nameNode.addChildToBack(value);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(nameNode);
        assertEquals("x = 10;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeArrayLit() {
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        Node elem1 = new Node(Token.NUMBER, 1);
        Node elem2 = new Node(Token.STRING, "hello");
        arrayLitNode.addChildToBack(elem1);
        arrayLitNode.addChildToBack(elem2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(arrayLitNode);
        assertEquals("[1, \"hello\"]", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeParamList() {
        Node paramList = new Node(Token.PARAM_LIST);
        Node param1 = new Node(Token.NAME, "p1");
        Node param2 = new Node(Token.NAME, "p2");
        paramList.addChildToBack(param1);
        paramList.addChildToBack(param2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(paramList);
        assertEquals("(p1, p2)", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeComma() {
        Node commaNode = new Node(Token.COMMA);
        Node expr1 = new Node(Token.NUMBER, 1);
        Node expr2 = new Node(Token.NUMBER, 2);
        commaNode.addChildToBack(expr1);
        commaNode.addChildToBack(expr2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(commaNode);
        assertEquals("1, 2", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeNumber() {
        Node numberNode = new Node(Token.NUMBER, 42.5);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(numberNode);
        assertEquals("42.5", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeTypeof() {
        Node typeofNode = new Node(Token.TYPEOF, new Node(Token.NAME, "x"));
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(typeofNode);
        assertEquals("typeof x", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeNegation() {
        Node negNode = new Node(Token.NEG, new Node(Token.NUMBER, 5));
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(negNode);
        assertEquals("-5", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeHook() {
        Node hookNode = new Node(Token.HOOK);
        Node cond = new Node(Token.NAME, "cond");
        Node thenExpr = new Node(Token.NUMBER, 1);
        Node elseExpr = new Node(Token.NUMBER, 0);
        hookNode.addChildToBack(cond);
        hookNode.addChildToBack(thenExpr);
        hookNode.addChildToBack(elseExpr);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(hookNode);
        assertEquals("cond ? 1 : 0", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeRegExp() {
        Node regexpNode = new Node(Token.REGEXP, new Node(Token.STRING, "a.*b"));
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(regexpNode);
        assertEquals("/a.*b/", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeFunction() {
        Node functionNode = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME, "myFunc");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToBack(name);
        functionNode.addChildToBack(params);
        functionNode.addChildToBack(body);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(functionNode, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc() {}", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeGetterDef() {
        Node getterDef = new Node(Token.GETTER_DEF, "myGetter");
        Node function = new Node(Token.FUNCTION);
        Node body = new Node(Token.BLOCK);
        function.addChildToBack(new Node(Token.NAME, "")); // Empty name for getter
        function.addChildToBack(new Node(Token.PARAM_LIST)); // No params for getter
        function.addChildToBack(body);
        getterDef.addChildToBack(function);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        // Simulate being in an object literal context
        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(getterDef);
        generator.add(objectLit);
        assertEquals("{get myGetter() {}}", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeSetterDef() {
        Node setterDef = new Node(Token.SETTER_DEF, "mySetter");
        Node function = new Node(Token.FUNCTION);
        Node param = new Node(Token.NAME, "value");
        Node paramList = new Node(Token.PARAM_LIST, param);
        Node body = new Node(Token.BLOCK);
        function.addChildToBack(new Node(Token.NAME, "")); // Empty name for setter
        function.addChildToBack(paramList);
        function.addChildToBack(body);
        setterDef.addChildToBack(function);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        // Simulate being in an object literal context
        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(setterDef);
        generator.add(objectLit);
        assertEquals("{set mySetter(value) {}}", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeScript() {
        Node script = new Node(Token.SCRIPT);
        Node statement1 = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "a"));
        Node statement2 = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "b"));
        script.addChildToBack(statement1);
        script.addChildToBack(statement2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(script);
        assertEquals("a;\nb;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeForLoop() {
        Node forLoop = new Node(Token.FOR);
        Node init = new Node(Token.VAR);
        Node initName = new Node(Token.NAME, "i");
        initName.addChildToBack(new Node(Token.NUMBER, 0));
        init.addChildToBack(initName);
        Node cond = new Node(Token.LT, new Node(Token.NAME, "i"), new Node(Token.NUMBER, 10));
        Node increment = new Node(Token.INC, new Node(Token.NAME, "i"));
        Node body = new Node(Token.BLOCK);

        forLoop.addChildToBack(init);
        forLoop.addChildToBack(cond);
        forLoop.addChildToBack(increment);
        forLoop.addChildToBack(body);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(forLoop);
        assertEquals("for(var i = 0; i < 10; i++) {}", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeForInLoop() {
        Node forInLoop = new Node(Token.FOR);
        Node item = new Node(Token.NAME, "key");
        Node collection = new Node(Token.ARRAYLIT, new Node(Token.NUMBER, 1), new Node(Token.NUMBER, 2));
        Node body = new Node(Token.BLOCK);

        forInLoop.addChildToBack(item);
        forInLoop.addChildToBack(collection);
        forInLoop.addChildToBack(body);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(forInLoop);
        assertEquals("for(key in [1, 2]) {}", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeDoWhileLoop() {
        Node doWhileNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "a")));
        Node condition = new Node(Token.NAME, "cond");
        doWhileNode.addChildToBack(body);
        doWhileNode.addChildToBack(condition);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(doWhileNode);
        assertEquals("do { a; } while(cond);", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeWhileLoop() {
        Node whileNode = new Node(Token.WHILE);
        Node condition = new Node(Token.NAME, "cond");
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "b")));
        whileNode.addChildToBack(condition);
        whileNode.addChildToBack(body);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(whileNode);
        assertEquals("while(cond) { b; }", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeEmptyStatement() {
        Node emptyNode = new Node(Token.EMPTY);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(emptyNode);
        assertEquals("", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeGetProp() {
        Node getPropNode = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "obj");
        Node prop = new Node(Token.STRING, "prop");
        getPropNode.addChildToBack(obj);
        getPropNode.addChildToBack(prop);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(getPropNode);
        assertEquals("obj.prop", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeGetElem() {
        Node getElemNode = new Node(Token.GETELEM);
        Node obj = new Node(Token.NAME, "arr");
        Node elem = new Node(Token.NUMBER, 0);
        getElemNode.addChildToBack(obj);
        getElemNode.addChildToBack(elem);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(getElemNode);
        assertEquals("arr[0]", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeWithStatement() {
        Node withNode = new Node(Token.WITH);
        Node obj = new Node(Token.NAME, "context");
        Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "prop")));
        withNode.addChildToBack(obj);
        withNode.addChildToBack(body);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(withNode);
        assertEquals("with(context) { prop; }", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeIncrementPre() {
        Node incNode = new Node(Token.INC);
        incNode.putIntProp(Node.INCRDECR_PROP, 0); // Pre-increment
        Node operand = new Node(Token.NAME, "x");
        incNode.addChildToBack(operand);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(incNode);
        assertEquals("++x", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeIncrementPost() {
        Node incNode = new Node(Token.INC);
        incNode.putIntProp(Node.INCRDECR_PROP, 1); // Post-increment
        Node operand = new Node(Token.NAME, "x");
        incNode.addChildToBack(operand);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(incNode);
        assertEquals("x++", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeCall() {
        Node callNode = new Node(Token.CALL);
        Node functionName = new Node(Token.NAME, "func");
        Node arg1 = new Node(Token.NUMBER, 1);
        Node arg2 = new Node(Token.STRING, "hello");
        callNode.addChildToBack(functionName);
        callNode.addChildToBack(arg1);
        callNode.addChildToBack(arg2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(callNode);
        assertEquals("func(1, \"hello\")", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeIfStatement() {
        Node ifNode = new Node(Token.IF);
        Node condition = new Node(Token.NAME, "flag");
        Node thenBranch = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "doSomething")));
        Node elseBranch = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "doElse")));
        ifNode.addChildToBack(condition);
        ifNode.addChildToBack(thenBranch);
        ifNode.addChildToBack(elseBranch);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(ifNode);
        assertEquals("if(flag) { doSomething; } else { doElse; }", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeNullLiteral() {
        Node nullNode = new Node(Token.NULL);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(nullNode);
        assertEquals("null", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeThis() {
        Node thisNode = new Node(Token.THIS);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(thisNode);
        assertEquals("this", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeFalseLiteral() {
        Node falseNode = new Node(Token.FALSE);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(falseNode);
        assertEquals("false", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeTrueLiteral() {
        Node trueNode = new Node(Token.TRUE);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(trueNode);
        assertEquals("true", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeContinueStatement() {
        Node continueNode = new Node(Token.CONTINUE);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(continueNode);
        assertEquals("continue;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeContinueStatementWithLabel() {
        Node continueNode = new Node(Token.CONTINUE);
        Node label = new Node(Token.LABEL_NAME, "loop");
        continueNode.addChildToBack(label);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(continueNode);
        assertEquals("continue loop;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeDebuggerStatement() {
        Node debuggerNode = new Node(Token.DEBUGGER);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(debuggerNode);
        assertEquals("debugger;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeBreakStatement() {
        Node breakNode = new Node(Token.BREAK);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(breakNode);
        assertEquals("break;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeBreakStatementWithLabel() {
        Node breakNode = new Node(Token.BREAK);
        Node label = new Node(Token.LABEL_NAME, "outer");
        breakNode.addChildToBack(label);
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(breakNode);
        assertEquals("break outer;", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeNewExpression() {
        Node newNode = new Node(Token.NEW);
        Node constructor = new Node(Token.NAME, "MyClass");
        Node arg = new Node(Token.NUMBER, 1);
        newNode.addChildToBack(constructor);
        newNode.addChildToBack(arg);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(newNode);
        assertEquals("new MyClass(1)", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeStringLiteral() {
        Node stringNode = new Node(Token.STRING, "hello world");
        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(stringNode);
        assertEquals("\"hello world\"", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeDeleteProperty() {
        Node deleteNode = new Node(Token.DELPROP);
        Node target = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "prop"));
        deleteNode.addChildToBack(target);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(deleteNode);
        assertEquals("delete obj.prop", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeObjectLiteral() {
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node prop1 = new Node(Token.STRING, "key1");
        prop1.addChildToBack(new Node(Token.NUMBER, 1));
        Node prop2 = new Node(Token.STRING, "key2");
        prop2.addChildToBack(new Node(Token.STRING, "value2"));
        objectLitNode.addChildToBack(prop1);
        objectLitNode.addChildToBack(prop2);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(objectLitNode);
        assertEquals("{key1: 1, key2: \"value2\"}", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeSwitchStatement() {
        Node switchNode = new Node(Token.SWITCH);
        Node expression = new Node(Token.NAME, "val");
        Node case1 = new Node(Token.CASE, new Node(Token.NUMBER, 1));
        Node case1Body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "a")));
        case1.addChildToBack(case1Body);
        Node defaultCase = new Node(Token.DEFAULT_CASE);
        Node defaultBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "b")));
        defaultCase.addChildToBack(defaultBody);

        switchNode.addChildToBack(expression);
        switchNode.addChildToBack(case1);
        switchNode.addChildToBack(defaultCase);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(switchNode);
        assertEquals("switch(val) { case 1: { a; } default: { b; } }", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeLabelStatement() {
        Node labelNode = new Node(Token.LABEL);
        Node labelName = new Node(Token.LABEL_NAME, "loop");
        Node statement = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NAME, "i")));
        labelNode.addChildToBack(labelName);
        labelNode.addChildToBack(statement);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(labelNode);
        assertEquals("loop: { i; }", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeBinaryOperatorAssociativity() {
        // Test left-associativity for ADDITION
        Node addNode = new Node(Token.ADD);
        Node leftChild = new Node(Token.ADD, new Node(Token.NUMBER, 1), new Node(Token.NUMBER, 2));
        Node rightChild = new Node(Token.NUMBER, 3);
        addNode.addChildToBack(leftChild);
        addNode.addChildToBack(rightChild);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(addNode);
        assertEquals("1 + 2 + 3", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeBinaryOperatorPrecedence() {
        // Test precedence of MUL over ADD
        Node addNode = new Node(Token.ADD);
        Node mulNode = new Node(Token.MUL, new Node(Token.NUMBER, 2), new Node(Token.NUMBER, 3));
        Node operand = new Node(Token.NUMBER, 1);
        addNode.addChildToBack(operand);
        addNode.addChildToBack(mulNode);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(addNode);
        assertEquals("1 + 2 * 3", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeBinaryOperatorParensNeeded() {
        // Test that parentheses are added when precedence requires it
        Node mulNode = new Node(Token.MUL);
        Node addNode = new Node(Token.ADD, new Node(Token.NUMBER, 1), new Node(Token.NUMBER, 2));
        Node operand = new Node(Token.NUMBER, 3);
        mulNode.addChildToBack(addNode);
        mulNode.addChildToBack(operand);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(mulNode);
        assertEquals("(1 + 2) * 3", consumer.getCode().trim());
    }

    @Test
    public void testAddNodeAssignmentAssociativity() {
        // Test right-associativity for ASSIGN
        Node assignNode = new Node(Token.ASSIGN);
        Node leftAssign = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), new Node(Token.NUMBER, 1));
        Node rightValue = new Node(Token.NUMBER, 2);
        assignNode.addChildToBack(leftAssign);
        assignNode.addChildToBack(rightValue);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(assignNode);
        assertEquals("a = 1 = 2", consumer.getCode().trim()); // This is valid JS, though confusing
    }

    @Test
    public void testUnrollBinaryOperator() {
        // Test the unrollBinaryOperator helper with a complex expression
        // Equivalent to: a + b + c + d
        Node root = new Node(Token.ADD);
        Node child1 = new Node(Token.ADD);
        Node child2 = new Node(Token.ADD);
        Node nodeA = new Node(Token.NAME, "a");
        Node nodeB = new Node(Token.NAME, "b");
        Node nodeC = new Node(Token.NAME, "c");
        Node nodeD = new Node(Token.NAME, "d");

        child2.addChildToBack(nodeC);
        child2.addChildToBack(nodeD);
        child1.addChildToBack(nodeB);
        child1.addChildToBack(child2);
        root.addChildToBack(nodeA);
        root.addChildToBack(child1);

        CodeConsumer consumer = createCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer, null);
        generator.add(root);
        assertEquals("a + b + c + d", consumer.getCode().trim());
    }

    @Test
    public void testIsSimpleNumber() {
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertTrue(CodeGenerator.isSimpleNumber("0"));
        assertFalse(CodeGenerator.isSimpleNumber("01")); // Leading zero is not simple
        assertFalse(CodeGenerator.isSimpleNumber("12.3"));
        assertFalse(CodeGenerator.isSimpleNumber(""));
        assertFalse(CodeGenerator.isSimpleNumber("-1"));
    }

    @Test
    public void testGetSimpleNumber() {
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.001);
        assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.001);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("01")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12.3")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("-1")));
        // Test large number that fits in long but might be problematic for double precision if not handled
        assertEquals(9007199254740991.0, CodeGenerator.getSimpleNumber("9007199254740991"), 0.001);
        // Test number larger than max positive integer number (for long)
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("9223372036854775808")));
    }

    @Test
    public void testIdentifierEscape() {
        assertEquals("myVar", CodeGenerator.identifierEscape("myVar"));
        assertEquals("my_Var", CodeGenerator.identifierEscape("my_Var"));
        // Non-ASCII characters should be escaped
        assertEquals("é", CodeGenerator.identifierEscape("é")); // This should not be escaped in JS identifiers if it's a valid unicode identifier char. The original code has logic for NodeUtil.isLatin(), which seems to imply not escaping if it's considered 'Latin'. Let's assume for now it should pass through.
        assertEquals("aébc", CodeGenerator.identifierEscape("aébc"));
    }

    @Test
    public void testStrEscapeWithCharsetEncoder() throws IOException {
        // Test with a charset encoder that supports UTF-8
        Charset utf8Charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = utf8Charset.newEncoder();

        // Test a character that requires unicode escape in ASCII but is representable in UTF-8
        String unicodeChar = "\u1234"; // Example character
        // With UTF-8 encoder, it should not be escaped to \uXXXX if it's representable according to the encoder.
        // However, the `strEscape` method has a specific check: `if (c > 0x1f && c < 0x7f)` for the `else` block when `outputCharsetEncoder` is null.
        // When `outputCharsetEncoder` is provided, it checks `outputCharsetEncoder.canEncode(c)`.
        // For UTF-8, `canEncode` should be true for characters like `\u1234`.
        // So, it should append `c` directly.
        assertEquals("\"" + unicodeChar + "\"", CodeGenerator.strEscape(unicodeChar, '"', "\\\"", "\'", "\\\\", encoder, false));

        // Test a character that is not representable by a restrictive charset like US-ASCII
        String euroChar = "\u20AC"; // Euro sign
        // With null encoder (implying ASCII behavior), it should be escaped.
        assertEquals("\"\\u20AC\"", CodeGenerator.strEscape(euroChar, '"', "\\\"", "\'", "\\\\", null, false));
        // With UTF-8 encoder, it should be directly appended if canEncode is true.
        assertEquals("\"" + euroChar + "\"", CodeGenerator.strEscape(euroChar, '"', "\\\"", "\'", "\\\\", encoder, false));
    }


    @Test
    public void testStrEscapeSpecialCharacters() {
        assertEquals("\"\\n\"", CodeGenerator.strEscape("\n", '"', "\\\"", "\'", "\\\\", null, false));
        assertEquals("\"\\r\"", CodeGenerator.strEscape("\r", '"', "\\\"", "\'", "\\\\", null, false));
        assertEquals("\"\\t\"", CodeGenerator.strEscape("\t", '"', "\\\"", "\'", "\\\\", null, false));
        assertEquals("\"\\\\\"", CodeGenerator.strEscape("\\", '"', "\\\"", "\'", "\\\\", null, false));
        assertEquals("\"\\\"\"", CodeGenerator.strEscape("\"", '"', "\\\"", "\'", "\\\\", null, false));
        assertEquals("\"\\'\"", CodeGenerator.strEscape("'", '"', "\\\"", "\'", "\\\\", null, false));
        assertEquals("\"\\x00\"", CodeGenerator.strEscape("\0", '"', "\\\"", "\'", "\\\\", null, false));
        assertEquals("\"\\v\"", CodeGenerator.strEscape("\u000B", '"', "\\\"", "\'", "\\\\", null, true)); // With slashV
        assertEquals("\"\\x0B\"", CodeGenerator.strEscape("\u000B", '"', "\\\"", "\'", "\\\\", null, false)); // Without slashV
    }

    @Test
    public void testRegexpEscape() {
        assertEquals("/abc/", CodeGenerator.regexpEscape("abc", null));
        assertEquals("/a.b/", CodeGenerator.regexpEscape("a.b", null));
        assertEquals("/a\\/b/", CodeGenerator.regexpEscape("a/b", null));
    }

    @Test
    public void testAppendHexJavaScriptRepresentation() throws IOException {
        StringBuilder sb = new StringBuilder();
        CodeGenerator.appendHexJavaScriptRepresentation(sb, 'a');
        assertEquals("a", sb.toString());

        sb.setLength(0);
        CodeGenerator.appendHexJavaScriptRepresentation(sb, '\'');
        assertEquals("\\u0027", sb.toString()); // ASCII single quote

        sb.setLength(0);
        CodeGenerator.appendHexJavaScriptRepresentation(sb, '\u1234');
        assertEquals("\\u1234", sb.toString());

        sb.setLength(0);
        // Test supplementary code point
        // Directly append the surrogate characters as integers to simulate the internal call
        // CodeGenerator.appendHexJavaScriptRepresentation(sb, Character.highSurrogate(0x10437));
        // CodeGenerator.appendHexJavaScriptRepresentation(sb, Character.lowSurrogate(0x10437));
        // The method expects an int (codePoint), so we pass the values directly.
        CodeGenerator.appendHexJavaScriptRepresentation(sb, 0xD801); // High surrogate for U+10437
        CodeGenerator.appendHexJavaScriptRepresentation(sb, 0xDC37); // Low surrogate for U+10437
        assertEquals("\\uD801\\uDC37", sb.toString()); // \uD801\uDC37 represents U+10437
    }
}
