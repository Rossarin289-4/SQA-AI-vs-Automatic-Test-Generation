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

    // Helper method to create CodeGenerator with a specific consumer and charset
    private CodeGenerator createCodeGenerator(CodeConsumer consumer, Charset charset) {
        return new CodeGenerator(consumer, charset);
    }

    // Helper method to create CodeGenerator with default consumer and charset






















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
        // Non-ASCII characters should be escaped if they are not considered 'Latin' by NodeUtil.isLatin()
        // Assuming NodeUtil.isLatin() would return true for 'é'.
        assertEquals("aébc", CodeGenerator.identifierEscape("aébc"));
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
        CodeGenerator.appendHexJavaScriptRepresentation(sb, 0x10437);
        assertEquals("\\uD801\\uDC37", sb.toString()); // \uD801\uDC37 represents U+10437
    }
}





