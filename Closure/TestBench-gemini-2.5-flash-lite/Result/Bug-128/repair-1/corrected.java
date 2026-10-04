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

public class CodeGeneratorTest {

    // Mock CodeConsumer to capture output
    private static class RecordingCodeConsumer extends CodeConsumer {
        StringBuilder output = new StringBuilder();

        @Override
        void append(String str) {
            output.append(str);
        }

        @Override
        char getLastChar() {
            return output.length() > 0 ? output.charAt(output.length() - 1) : 0;
        }

        @Override
        void startSourceMapping(Node node) {}
        @Override
        void endSourceMapping(Node node) {}
        @Override
        boolean continueProcessing() { return true; }
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
        void endBlock(boolean shouldEndLine) {
            if (shouldEndLine) endLine();
        }
        @Override
        void listSeparator() { append(","); }
        @Override
        void endStatement() { append(";"); }
        @Override
        void endStatement(boolean needSemiColon) { if(needSemiColon) append(";"); }
        @Override
        void maybeEndStatement() { }
        @Override
        void endFunction() {}
        @Override
        void endFunction(boolean statementContext) {}
        @Override
        void beginCaseBody() {}
        @Override
        void endCaseBody() {}
        @Override
        void add(String newcode) { append(newcode); }
        @Override
        void appendOp(String op, boolean binOp) { append(op); }
        @Override
        void addOp(String op, boolean binOp) { append(op); }
        @Override
        void addNumber(double x) { append(String.valueOf(x)); }
        @Override
        void addConstant(String newcode) { append(newcode); }
        @Override
        boolean shouldPreserveExtraBlocks() { return false; }
        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) { return false; }
        @Override
        void endFile() {}
    }

    private CodeGenerator createCodeGenerator(CompilerOptions options) {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        return new CodeGenerator(consumer, options);
    }

    private CodeGenerator createCodeGenerator() {
        CompilerOptions options = new CompilerOptions();
        options.preferSingleQuotes = false; // Default to double quotes for consistency
        options.trustedStrings = true; // Default to trusted strings
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        return new CodeGenerator(consumer, options);
    }

    private String generateCode(Node n, CompilerOptions options) {
        CodeGenerator cg = createCodeGenerator(options);
        cg.add(n);
        return cg.cc.output.toString();
    }

    private String generateCode(Node n) {
        CompilerOptions options = new CompilerOptions();
        options.preferSingleQuotes = false;
        options.trustedStrings = true;
        return generateCode(n, options);
    }

    // Helper to create a simple node
    private Node createSimpleNode(int type) {
        return new Node(type);
    }

    // Helper to create a node with a string value
    private Node createStringNode(String value) {
        return Node.newString(value);
    }

    // Helper to create a node with a number value
    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    // Helper to create a node for a binary operator
    private Node createBinaryOpNode(int type, Node left, Node right) {
        Node node = new Node(type, left, right);
        return node;
    }

    // Helper to create a node for a unary operator
    private Node createUnaryOpNode(int type, Node child) {
        Node node = new Node(type, child);
        return node;
    }

    // Helper to create a VAR node
    private Node createVarNode(String name) {
        Node var = new Node(Token.VAR);
        var.addChildToBack(Node.newString(name));
        return var;
    }

    // Helper to create a simple assignment node
    private Node createAssignmentNode(Node left, Node right) {
        return createBinaryOpNode(Token.ASSIGN, left, right);
    }

    // Helper to create a simple name node
    private Node createNameNode(String name) {
        return Node.newString(Token.NAME, name);
    }

    // Helper to create a simple NUMBER node
    private Node createNumberTypeNode(double value) {
        return Node.newNumber(value);
    }

    // Helper to create a simple STRING node
    private Node createStringTypeNode(String value) {
        return Node.newString(Token.STRING, value);
    }

    // Helper to create a simple REGEXP node
    private Node createRegExpNode(String pattern, String flags) {
        Node regexNode = new Node(Token.REGEXP, Node.newString(pattern));
        if (flags != null) {
            regexNode.addChildToBack(Node.newString(flags));
        }
        return regexNode;
    }

    // Helper to create a simple FUNCTION node
    private Node createFunctionNode(String name, Node params, Node body) {
        Node fn = new Node(Token.FUNCTION, Node.newString(name), params, body);
        return fn;
    }

    // Helper to create a simple OBJECTLIT node
    private Node createObjectLitNode(Node... properties) {
        Node obj = new Node(Token.OBJECTLIT);
        for (Node prop : properties) {
            obj.addChildToBack(prop);
        }
        return obj;
    }

    // Helper to create a simple ARRAYLIT node
    private Node createArrayLitNode(Node... elements) {
        Node arr = new Node(Token.ARRAYLIT);
        for (Node elem : elements) {
            arr.addChildToBack(elem);
        }
        return arr;
    }

    // Helper to create a FOR node
    private Node createForNode(Node init, Node cond, Node increment, Node body) {
        Node forNode = new Node(Token.FOR, init, cond, increment, body);
        return forNode;
    }

    // Helper to create a FOR_IN node
    private Node createForInNode(Node iterated, Node body) {
        Node forInNode = new Node(Token.FOR, createNameNode("i"), iterated, body);
        return forInNode;
    }

    // Helper to create a IF node
    private Node createIfNode(Node cond, Node thenBranch, Node elseBranch) {
        Node ifNode = new Node(Token.IF, cond, thenBranch, elseBranch);
        return ifNode;
    }

    // Helper to create a TRY node
    private Node createTryNode(Node tryBlock, Node catchBlock, Node finallyBlock) {
        Node tryNode = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
        return tryNode;
    }

    // Helper to create a CATCH node
    private Node createCatchNode(Node exceptionVar, Node block) {
        Node catchNode = new Node(Token.CATCH, exceptionVar, block);
        return catchNode;
    }


    @Test
    public void testTagAsStrict() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.tagAsStrict();
        assertEquals("'use strict';", cg.cc.output.toString());
    }

    @Test
    public void testAddSimpleString() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add("var x = 1;");
        assertEquals("var x = 1;", cg.cc.output.toString());
    }

    @Test
    public void testAddNode() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node n = Node.newString("hello");
        cg.add(n);
        assertEquals("hello", cg.cc.output.toString());
    }

    @Test
    public void testAddIdentifier() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.addIdentifier("myVar");
        assertEquals("myVar", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithAssignment() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node assignment = createAssignmentNode(createNameNode("x"), createNumberNode(1));
        cg.add(assignment);
        assertEquals("x=1", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithVar() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node varDecl = createVarNode("y");
        varDecl.addChildToBack(createNumberNode(2));
        cg.add(varDecl);
        assertEquals("var y=2;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBinaryOp() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node add = createBinaryOpNode(Token.ADD, createNumberNode(3), createNumberNode(4));
        cg.add(add);
        assertEquals("3+4", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithArrayLit() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node arrayLit = createArrayLitNode(createNumberNode(1), createStringNode("a"), createNumberNode(3));
        cg.add(arrayLit);
        assertEquals("[1,\"a\",3]", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithObjectLit() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node key1 = Node.newString(Token.STRING_KEY, "key1");
        key1.addChildToBack(createNumberNode(10));
        Node key2 = Node.newString(Token.STRING_KEY, "key2");
        key2.addChildToBack(createStringNode("b"));
        Node objectLit = createObjectLitNode(key1, key2);
        cg.add(objectLit);
        assertEquals("{key1:10,key2:\"b\"}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithFunction() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node params = new Node(Token.PARAM_LIST, createNameNode("a"), createNameNode("b"));
        Node body = new Node(Token.BLOCK, createVarNode("c"));
        Node fn = createFunctionNode("myFunc", params, body);
        cg.add(fn);
        assertEquals("function myFunc(a,b){var c;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIfStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node cond = createNumberNode(1);
        Node thenBranch = new Node(Token.BLOCK, createVarNode("x"));
        Node elseBranch = new Node(Token.BLOCK, createVarNode("y"));
        Node ifStmt = createIfNode(cond, thenBranch, elseBranch);
        cg.add(ifStmt);
        assertEquals("if(1){var x;}else{var y;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithForLoop() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = createVarNode("i");
        init.addChildToBack(createNumberNode(0));
        Node cond = createBinaryOpNode(Token.LT, createNameNode("i"), createNumberNode(10));
        Node increment = createUnaryOpNode(Token.INC, createNameNode("i"));
        Node body = new Node(Token.BLOCK);
        Node forLoop = createForNode(init, cond, increment, body);
        cg.add(forLoop);
        assertEquals("for(var i=0;i<10;i++){}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithWhileLoop() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node cond = createNumberNode(1);
        Node body = new Node(Token.BLOCK, createVarNode("x"));
        Node whileLoop = new Node(Token.WHILE, cond, body);
        cg.add(whileLoop);
        assertEquals("while(1){var x;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDoLoop() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node body = new Node(Token.BLOCK, createVarNode("x"));
        Node cond = createNumberNode(1);
        Node doLoop = new Node(Token.DO, body, cond);
        cg.add(doLoop);
        assertEquals("do{var x;}while(1);", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithTryCatchFinally() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node tryBlock = new Node(Token.BLOCK, createVarNode("t"));
        Node catchVar = createNameNode("e");
        Node catchBlock = new Node(Token.BLOCK, createVarNode("c"));
        Node finallyBlock = new Node(Token.BLOCK, createVarNode("f"));
        Node tryStmt = createTryNode(tryBlock, createCatchNode(catchVar, catchBlock), finallyBlock);
        cg.add(tryStmt);
        assertEquals("try{var t;}catch(e){var c;}finally{var f;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithThrow() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node throwStmt = new Node(Token.THROW, createStringNode("error"));
        cg.add(throwStmt);
        assertEquals("throw \"error\";", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithReturn() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node returnStmt = new Node(Token.RETURN, createNumberNode(100));
        cg.add(returnStmt);
        assertEquals("return 100;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithContinue() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node continueStmt = new Node(Token.CONTINUE);
        cg.add(continueStmt);
        assertEquals("continue;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBreak() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node breakStmt = new Node(Token.BREAK);
        cg.add(breakStmt);
        assertEquals("break;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBreakWithLabel() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node label = new Node(Token.LABEL_NAME, "myLabel");
        Node breakStmt = new Node(Token.BREAK, label);
        cg.add(breakStmt);
        assertEquals("break myLabel;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithContinueWithLabel() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node label = new Node(Token.LABEL_NAME, "myLabel");
        Node continueStmt = new Node(Token.CONTINUE, label);
        cg.add(continueStmt);
        assertEquals("continue myLabel;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithWithStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expr = createNameNode("obj");
        Node body = new Node(Token.BLOCK, createVarNode("x"));
        Node withStmt = new Node(Token.WITH, expr, body);
        cg.add(withStmt);
        assertEquals("with(obj){var x;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithNewExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node constructor = createNameNode("MyClass");
        Node args = createNumberNode(1);
        Node newNode = new Node(Token.NEW, constructor);
        newNode.addChildToBack(args);
        cg.add(newNode);
        assertEquals("new MyClass(1)", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithNewExpressionNoArgs() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node constructor = createNameNode("MyClass");
        Node newNode = new Node(Token.NEW, constructor);
        cg.add(newNode);
        assertEquals("new MyClass()", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithCallExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node functionName = createNameNode("myFunc");
        Node arg1 = createNumberNode(1);
        Node arg2 = createStringNode("hello");
        Node callNode = new Node(Token.CALL, functionName, arg1, arg2);
        cg.add(callNode);
        assertEquals("myFunc(1,\"hello\")", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithPropertyAccess() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node obj = createNameNode("obj");
        Node prop = createStringNode("prop");
        Node getPropNode = new Node(Token.GETPROP, obj, prop);
        cg.add(getPropNode);
        assertEquals("obj.prop", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithElementAccess() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node obj = createNameNode("arr");
        Node index = createNumberNode(5);
        Node getElemNode = new Node(Token.GETELEM, obj, index);
        cg.add(getElemNode);
        assertEquals("arr[5]", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithUnaryOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNumberNode(5);
        Node unaryOp = createUnaryOpNode(Token.NEG, operand);
        cg.add(unaryOp);
        assertEquals("-5", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIncOperatorPre() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNameNode("x");
        Node incNode = new Node(Token.INC, operand);
        incNode.setIntProp(Node.INCRDECR_PROP, 0); // Pre-increment
        cg.add(incNode);
        assertEquals("++x", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIncOperatorPost() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNameNode("x");
        Node incNode = new Node(Token.INC, operand);
        incNode.setIntProp(Node.INCRDECR_PROP, 1); // Post-increment
        cg.add(incNode);
        assertEquals("x++", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDecOperatorPre() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNameNode("x");
        Node decNode = new Node(Token.DEC, operand);
        decNode.setIntProp(Node.INCRDECR_PROP, 0); // Pre-decrement
        cg.add(decNode);
        assertEquals("--x", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDecOperatorPost() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNameNode("x");
        Node decNode = new Node(Token.DEC, operand);
        decNode.setIntProp(Node.INCRDECR_PROP, 1); // Post-decrement
        cg.add(decNode);
        assertEquals("x--", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithRegExp() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regexp = createRegExpNode("a.b", null);
        cg.add(regexp);
        assertEquals("/a.b/", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithRegExpWithFlags() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regexp = createRegExpNode("a.b", "gi");
        cg.add(regexp);
        assertEquals("/a.b/gi", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithCommaOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node commaOp = createBinaryOpNode(Token.COMMA, createNumberNode(1), createNumberNode(2));
        cg.add(commaOp);
        assertEquals("1,2", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithHookOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node cond = createNumberNode(1);
        Node thenBranch = createNumberNode(2);
        Node elseBranch = createNumberNode(3);
        Node hookOp = new Node(Token.HOOK, cond, thenBranch, elseBranch);
        cg.add(hookOp);
        assertEquals("1?2:3", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithVoidOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNameNode("x");
        Node voidOp = createUnaryOpNode(Token.VOID, operand);
        cg.add(voidOp);
        assertEquals("void x", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithTypeOfOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNameNode("x");
        Node typeofOp = createUnaryOpNode(Token.TYPEOF, operand);
        cg.add(typeofOp);
        assertEquals("typeof x", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDeleteOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNameNode("obj.prop");
        Node deleteOp = new Node(Token.DELPROP, operand);
        cg.add(deleteOp);
        assertEquals("delete obj.prop", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGetPropOnNumber() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node numberNode = createNumberNode(123);
        Node propName = createStringNode("toString");
        Node getProp = new Node(Token.GETPROP, numberNode, propName);
        cg.add(getProp);
        assertEquals("(123).toString", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGetPropOnString() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node stringNode = createStringNode("hello");
        Node propName = createStringNode("length");
        Node getProp = new Node(Token.GETPROP, stringNode, propName);
        cg.add(getProp);
        assertEquals("\"hello\".length", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithAssignAdd() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(5);
        Node assignAdd = createBinaryOpNode(Token.ASSIGN_ADD, left, right);
        cg.add(assignAdd);
        assertEquals("x+=5", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithAssignSub() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(3);
        Node assignSub = createBinaryOpNode(Token.ASSIGN_SUB, left, right);
        cg.add(assignSub);
        assertEquals("x-=3", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithAssignMul() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(2);
        Node assignMul = createBinaryOpNode(Token.ASSIGN_MUL, left, right);
        cg.add(assignMul);
        assertEquals("x*=2", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithAssignDiv() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(4);
        Node assignDiv = createBinaryOpNode(Token.ASSIGN_DIV, left, right);
        cg.add(assignDiv);
        assertEquals("x/=4", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithAssignMod() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(7);
        Node assignMod = createBinaryOpNode(Token.ASSIGN_MOD, left, right);
        cg.add(assignMod);
        assertEquals("x%=7", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBitwiseAndAssign() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(1);
        Node assignBitAnd = createBinaryOpNode(Token.ASSIGN_BITAND, left, right);
        cg.add(assignBitAnd);
        assertEquals("x&=1", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBitwiseOrAssign() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(1);
        Node assignBitOr = createBinaryOpNode(Token.ASSIGN_BITOR, left, right);
        cg.add(assignBitOr);
        assertEquals("x|=1", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBitwiseXorAssign() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(1);
        Node assignBitXor = createBinaryOpNode(Token.ASSIGN_BITXOR, left, right);
        cg.add(assignBitXor);
        assertEquals("x^=1", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBitwiseLeftShiftAssign() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(2);
        Node assignLsh = createBinaryOpNode(Token.ASSIGN_LSH, left, right);
        cg.add(assignLsh);
        assertEquals("x<<=2", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBitwiseRightShiftAssign() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(2);
        Node assignRsh = createBinaryOpNode(Token.ASSIGN_RSH, left, right);
        cg.add(assignRsh);
        assertEquals("x>>=2", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBitwiseUnsignedRightShiftAssign() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNameNode("x");
        Node right = createNumberNode(2);
        Node assignUrsh = createBinaryOpNode(Token.ASSIGN_URSH, left, right);
        cg.add(assignUrsh);
        assertEquals("x>>>=2", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithLabel() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node labelName = new Node(Token.LABEL_NAME, "loop");
        Node statement = new Node(Token.EXPR_RESULT, createNumberNode(1));
        Node labelNode = new Node(Token.LABEL, labelName, statement);
        cg.add(labelNode);
        assertEquals("loop:1;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithExpressionResult() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node exprResult = new Node(Token.EXPR_RESULT, createNumberNode(42));
        cg.add(exprResult);
        assertEquals("42;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithCaseStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node caseValue = createNumberNode(1);
        Node caseBody = new Node(Token.BLOCK, createVarNode("a"));
        Node caseNode = new Node(Token.CASE, caseValue, caseBody);
        cg.add(caseNode);
        assertEquals("case 1:{var a;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDefaultCase() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node defaultCaseNode = new Node(Token.DEFAULT_CASE, createVarNode("b"));
        cg.add(defaultCaseNode);
        assertEquals("default{var b;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithSwitchStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node switchExpr = createNameNode("value");
        Node case1 = new Node(Token.CASE, createNumberNode(1), new Node(Token.BLOCK, createVarNode("c")));
        Node case2 = new Node(Token.CASE, createNumberNode(2), new Node(Token.BLOCK, createVarNode("d")));
        Node switchNode = new Node(Token.SWITCH, switchExpr);
        switchNode.addChildToBack(case1);
        switchNode.addChildToBack(case2);
        cg.add(switchNode);
        assertEquals("switch(value){case 1:{var c;}case 2:{var d;}}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithBlock() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node block = new Node(Token.BLOCK, createVarNode("x"));
        cg.add(block);
        assertEquals("{var x;}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithEmptyBlock() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node block = new Node(Token.BLOCK);
        cg.add(block);
        assertEquals("{};", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithEmptyStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node emptyStmt = new Node(Token.EMPTY);
        cg.add(emptyStmt);
        assertEquals(";", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithDebuggerStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node debuggerStmt = new Node(Token.DEBUGGER);
        cg.add(debuggerStmt);
        assertEquals("debugger;", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGETTER_DEF() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = Node.newString("myProp");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK, createVarNode("val"));
        Node funcNode = new Node(Token.FUNCTION, Node.newString(""), params, body);
        Node getterDef = new Node(Token.GETTER_DEF);
        getterDef.addChildToBack(funcNode);

        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(getterDef);
        // Need to set the string for the getterDef node itself to be the property name
        getterDef.setString("myProp");
        cg.add(objectLit);
        assertEquals("{get myProp(){var val;}}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithSETTER_DEF() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = Node.newString("myProp");
        Node param = createNameNode("v");
        Node params = new Node(Token.PARAM_LIST, param);
        Node body = new Node(Token.BLOCK);
        Node funcNode = new Node(Token.FUNCTION, Node.newString(""), params, body);
        Node setterDef = new Node(Token.SETTER_DEF);
        setterDef.addChildToBack(funcNode);

        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(setterDef);
        // Need to set the string for the setterDef node itself to be the property name
        setterDef.setString("myProp");
        cg.add(objectLit);
        assertEquals("{set myProp(v){}}", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithCAST() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node castNode = new Node(Token.CAST, createNameNode("foo"));
        cg.add(castNode);
        assertEquals("(foo)", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithSTRIP_V_special_case() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node stringNode = Node.newString("abc");
        stringNode.putBooleanProp(Node.SLASH_V, true);
        cg.add(stringNode);
        assertEquals("\\v", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithTrustedStringSpecialChars() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node stringNode = Node.newString("<script>");
        cg.add(stringNode);
        assertEquals("\"<script>\"", cg.cc.output.toString()); // Default trustedStrings = true
    }

    @Test
    public void testAddNodeWithUnTrustedStringSpecialChars() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.trustedStrings = false;
        CodeGenerator cg = createCodeGenerator(options);
        Node stringNode = Node.newString("<script>");
        cg.add(stringNode);
        assertEquals("\"\\x3cscript\\x3e\"", cg.cc.output.toString()); // trustedStrings = false
    }

    @Test
    public void testAddNodeWithRegExpEscape() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regexp = createRegExpNode("a.b", null);
        cg.add(regexp);
        assertEquals("/a.b/", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithRegExpEscape_special_chars() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.trustedStrings = false; // To trigger more escaping in strEscape
        CodeGenerator cg = createCodeGenerator(options);
        Node regexp = createRegExpNode("a[b]", null); // '[' and ']' are special in regex
        cg.add(regexp);
        assertEquals("/a\\x5Bb\\x5D/", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithRegExpEscape_slash() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regexp = createRegExpNode("/", null);
        cg.add(regexp);
        // '/' should be escaped in a regex literal when it's the delimiter.
        // In this case, it's the default delimiter, so it should be escaped.
        assertEquals("/\\//", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIdentifierEscape() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        // Test with a non-JS identifier character
        Node identNode = Node.newString(Token.NAME, "my-var");
        cg.addIdentifier(identNode.getString()); // Should use identifierEscape
        assertEquals("my\\x2dvar", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIdentifierEscape_nonLatin() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node identNode = Node.newString(Token.NAME, "var\u00E9"); // é
        cg.addIdentifier(identNode.getString());
        assertEquals("var\\u00E9", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithIdentifierEscape_valid() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node identNode = Node.newString(Token.NAME, "_validIdentifier");
        cg.addIdentifier(identNode.getString());
        assertEquals("_validIdentifier", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGetPropOnNumber_parenthesized() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node numberNode = createNumberNode(123);
        Node propName = createStringNode("toString");
        Node getProp = new Node(Token.GETPROP, numberNode, propName);
        cg.add(getProp);
        assertEquals("(123).toString", cg.cc.output.toString());
    }

    @Test
    public void testAddNodeWithGetElemOnStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node stringNode = Node.newString("hello");
        Node indexNode = createNumberNode(1);
        Node getElem = new Node(Token.GETELEM, stringNode, indexNode);
        cg.add(getElem);
        assertEquals("\"hello\"[1]", cg.cc.output.toString());
    }
}
