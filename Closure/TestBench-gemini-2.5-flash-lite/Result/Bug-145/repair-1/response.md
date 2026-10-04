```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Set;

public class CodeGeneratorTest {

    private static class TestConsumer extends CodeConsumer {
        StringBuilder builder = new StringBuilder();
        private int currentBufferLength = 0;
        private int currentCharIndex = 0;
        private int currentLineIndex = 0;
        private char lastChar = 0;
        private boolean continueProcessing = true;

        @Override
        void startSourceMapping(Node node) {}

        @Override
        void endSourceMapping(Node node) {}

        @Override
        void generateSourceMap(SourceMap map) {}

        @Override
        int getCurrentBufferLength() {
            return currentBufferLength;
        }

        @Override
        int getCurrentCharIndex() {
            return currentCharIndex;
        }

        @Override
        int getCurrentLineIndex() {
            return currentLineIndex;
        }

        @Override
        boolean continueProcessing() {
            return continueProcessing;
        }

        @Override
        char getLastChar() {
            return lastChar;
        }

        @Override
        void append(String str) {
            builder.append(str);
            currentBufferLength += str.length();
            for (char c : str.toCharArray()) {
                if (c == '\n') {
                    currentLineIndex++;
                    currentCharIndex = 0;
                } else {
                    currentCharIndex++;
                }
                lastChar = c;
            }
        }

        @Override
        void appendBlockStart() {
            append("{");
        }

        @Override
        void appendBlockEnd() {
            append("}");
        }

        @Override
        void startNewLine() {
            append("\n");
        }

        @Override
        void maybeLineBreak() {
            // Do nothing for simple testing
        }

        @Override
        void endLine() {
            // Do nothing for simple testing
        }

        @Override
        void notePreferredLineBreak() {
            // Do nothing for simple testing
        }

        @Override
        void beginBlock() {
            append("{");
        }

        @Override
        void endBlock() {
            append("}");
        }

        @Override
        void endBlock(boolean shouldEndLine) {
            append("}");
            if (shouldEndLine) {
                startNewLine();
            }
        }

        @Override
        void listSeparator() {
            append(",");
        }

        @Override
        void endStatement() {
            append(";");
        }

        @Override
        void endStatement(boolean needSemiColon) {
            if (needSemiColon) {
                append(";");
            }
        }

        @Override
        void maybeEndStatement() {
            // Do nothing for simple testing
        }

        @Override
        void endFunction() {
            // Do nothing for simple testing
        }

        @Override
        void endFunction(boolean statementContext) {
            // Do nothing for simple testing
        }

        @Override
        void beginCaseBody() {
            // Do nothing for simple testing
        }

        @Override
        void endCaseBody() {
            // Do nothing for simple testing
        }

        @Override
        void add(String newcode) {
            append(newcode);
        }

        @Override
        void appendOp(String op, boolean binOp) {
            append(op);
        }

        @Override
        void addOp(String op, boolean binOp) {
            append(op);
        }

        @Override
        void addNumber(double x) {
            append(String.valueOf(x));
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return false;
        }

        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) {
            return false;
        }

        String getCode() {
            return builder.toString();
        }
    }

    private CodeGenerator createCodeGenerator() {
        return new CodeGenerator(new TestConsumer());
    }

    private CodeGenerator createCodeGenerator(Charset charset) {
        return new CodeGenerator(new TestConsumer(), charset);
    }

    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    private Node createStringNode(String value) {
        return Node.newString(value);
    }

    private Node createIdentifierNode(String name) {
        Node node = new Node(Token.NAME, name);
        return node;
    }

    private Node createBinaryOperatorNode(int type, Node left, Node right) {
        Node node = new Node(type, left, right);
        return node;
    }

    private Node createUnaryOperatorNode(int type, Node child) {
        Node node = new Node(type, child);
        return node;
    }

    private Node createAssignmentNode(Node left, Node right) {
        Node assign = new Node(Token.ASSIGN, left, right);
        return assign;
    }

    private Node createVarNode(Node name, Node value) {
        Node var = new Node(Token.VAR, name);
        if (value != null) {
            var.addChildToBack(value);
        }
        return var;
    }

    private Node createBlockNode(Node... children) {
        Node block = new Node(Token.BLOCK);
        for (Node child : children) {
            block.addChildToBack(child);
        }
        return block;
    }

    private Node createFunctionNode(Node name, Node params, Node body) {
        Node func = new Node(Token.FUNCTION, name);
        if (params != null) {
            func.addChildToBack(params);
        }
        func.addChildToBack(body);
        return func;
    }

    private Node createCallNode(Node target, Node... args) {
        Node call = new Node(Token.CALL, target);
        for (Node arg : args) {
            call.addChildToBack(arg);
        }
        return call;
    }

    private Node createGetPropNode(Node base, String propertyName) {
        Node propName = Node.newString(propertyName);
        return new Node(Token.GETPROP, base, propName);
    }

    private Node createGetElemNode(Node base, Node element) {
        return new Node(Token.GETELEM, base, element);
    }

    private Node createNewNode(Node constructor, Node... args) {
        Node newNode = new Node(Token.NEW, constructor);
        if (args.length > 0) {
            Node firstArg = args[0];
            newNode.addChildToBack(firstArg);
            for (int i = 1; i < args.length; i++) {
                args[i-1].setNext(args[i]);
            }
        }
        return newNode;
    }

    private Node createTryCatchFinallyNode(Node tryBlock, Node catchVar, Node catchBlock, Node finallyBlock) {
        Node tryNode = new Node(Token.TRY, tryBlock);
        Node catchNode = new Node(Token.CATCH, catchVar, catchBlock);
        tryNode.addChildToBack(catchNode);
        if (finallyBlock != null) {
            tryNode.addChildToBack(finallyBlock);
        }
        return tryNode;
    }

    private Node createIfNode(Node condition, Node thenBranch, Node elseBranch) {
        Node ifNode = new Node(Token.IF, condition, thenBranch);
        if (elseBranch != null) {
            ifNode.addChildToBack(elseBranch);
        }
        return ifNode;
    }

    private Node createForNode(Node init, Node condition, Node increment, Node body) {
        Node forNode = new Node(Token.FOR, init, condition, increment, body);
        return forNode;
    }

    private Node createForInNode(Node variable, Node iterable, Node body) {
        Node forInNode = new Node(Token.FOR, variable, iterable, body);
        return forInNode;
    }

    private Node createWhileNode(Node condition, Node body) {
        Node whileNode = new Node(Token.WHILE, condition, body);
        return whileNode;
    }

    private Node createDoWhileNode(Node body, Node condition) {
        Node doWhileNode = new Node(Token.DO, body, condition);
        return doWhileNode;
    }

    private Node createSwitchNode(Node expression, Node... cases) {
        Node switchNode = new Node(Token.SWITCH, expression);
        for (Node caseNode : cases) {
            switchNode.addChildToBack(caseNode);
        }
        return switchNode;
    }

    private Node createCaseNode(Node value, Node... statements) {
        Node caseNode = new Node(Token.CASE, value);
        Node body = new Node(Token.BLOCK);
        for (Node statement : statements) {
            body.addChildToBack(statement);
        }
        caseNode.addChildToBack(body);
        return caseNode;
    }

    private Node createDefaultNode(Node... statements) {
        Node defaultNode = new Node(Token.DEFAULT);
        Node body = new Node(Token.BLOCK);
        for (Node statement : statements) {
            body.addChildToBack(statement);
        }
        defaultNode.addChildToBack(body);
        return defaultNode;
    }

    private Node createLabelNode(String label, Node statement) {
        Node labelName = new Node(Token.LABEL_NAME, label);
        Node labelNode = new Node(Token.LABEL, labelName, statement);
        return labelNode;
    }

    private Node createReturnNode(Node expression) {
        Node returnNode = new Node(Token.RETURN, expression);
        return returnNode;
    }

    private Node createThrowNode(Node expression) {
        Node throwNode = new Node(Token.THROW, expression);
        return throwNode;
    }

    private Node createBreakNode() {
        return new Node(Token.BREAK);
    }

    private Node createBreakNode(String label) {
        Node labelName = new Node(Token.LABEL_NAME, label);
        return new Node(Token.BREAK, labelName);
    }

    private Node createContinueNode() {
        return new Node(Token.CONTINUE);
    }

    private Node createContinueNode(String label) {
        Node labelName = new Node(Token.LABEL_NAME, label);
        return new Node(Token.CONTINUE, labelName);
    }

    private Node createDebuggerNode() {
        return new Node(Token.DEBUGGER);
    }

    private Node createEmptyNode() {
        return new Node(Token.EMPTY);
    }

    private Node createThisNode() {
        return new Node(Token.THIS);
    }

    private Node createFalseNode() {
        return new Node(Token.FALSE);
    }

    private Node createTrueNode() {
        return new Node(Token.TRUE);
    }

    private Node createNullNode() {
        return new Node(Token.NULL);
    }

    private Node createTypeOfNode(Node expression) {
        return new Node(Token.TYPEOF, expression);
    }

    private Node createVoidNode(Node expression) {
        return new Node(Token.VOID, expression);
    }

    private Node createNotNode(Node expression) {
        return new Node(Token.NOT, expression);
    }

    private Node createBitNotNode(Node expression) {
        return new Node(Token.BITNOT, expression);
    }

    private Node createPosNode(Node expression) {
        return new Node(Token.POS, expression);
    }

    private Node createNegNode(Node expression) {
        return new Node(Token.NEG, expression);
    }

    private Node createIncNode(Node expression) {
        return new Node(Token.INC, expression);
    }

    private Node createDecNode(Node expression) {
        return new Node(Token.DEC, expression);
    }

    private Node createPostIncNode(Node expression) {
        Node incNode = new Node(Token.INC, expression);
        incNode.putIntProp(Node.INCRDECR_PROP, Node.POST_FLAG);
        return incNode;
    }

    private Node createPostDecNode(Node expression) {
        Node decNode = new Node(Token.DEC, expression);
        decNode.putIntProp(Node.INCRDECR_PROP, Node.POST_FLAG);
        return decNode;
    }

    private Node createRegExpNode(String pattern, String flags) {
        Node patternNode = Node.newString(pattern);
        Node flagsNode = Node.newString(flags);
        return new Node(Token.REGEXP, patternNode, flagsNode);
    }

    private Node createArrayLiteralNode(int[] skipIndexes, Node... elements) {
        Node arrayNode = new Node(Token.ARRAYLIT, elements);
        if (skipIndexes != null) {
            arrayNode.putProp(Node.SKIP_INDEXES_PROP, skipIndexes);
        }
        return arrayNode;
    }

    private Node createObjectLiteralNode(Node... properties) {
        Node objectNode = new Node(Token.OBJECTLIT);
        for (Node prop : properties) {
            objectNode.addChildToBack(prop);
        }
        return objectNode;
    }

    private Node createObjectPropertyNode(String key, Node value) {
        Node keyNode = Node.newString(key);
        return new Node(Token.STRING, keyNode, value); // Token type should be STRING for keys in this context
    }

    private Node createObjectPropertyNode(Node key, Node value) {
        return new Node(Token.STRING, key, value);
    }

    private Node createHookNode(Node condition, Node thenBranch, Node elseBranch) {
        return new Node(Token.HOOK, condition, thenBranch, elseBranch);
    }

    // Helper to create an EXPR_RESULT node
    private Node createExprResultNode(Node expr) {
        return new Node(Token.EXPR_RESULT, expr);
    }

    @Test
    public void testAddSimpleString() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add("test");
        assertEquals("test", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNumber() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createNumberNode(123.45));
        assertEquals("123.45", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNumberEdgeCaseSmall() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createNumberNode(Double.MIN_VALUE));
        assertEquals(String.valueOf(Double.MIN_VALUE), ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNumberEdgeCaseLarge() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createNumberNode(Double.MAX_VALUE));
        assertEquals(String.valueOf(Double.MAX_VALUE), ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNumberZero() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createNumberNode(0.0));
        assertEquals("0.0", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNumberNegativeZero() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createNumberNode(-0.0));
        assertEquals("-0.0", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddEmptyString() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createStringNode(""));
        assertEquals("\"\"", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddSimpleStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createStringNode("hello"));
        assertEquals("\"hello\"", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddQuotedStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createStringNode("world\""));
        assertEquals("\"world\\\"\"", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddApostropheStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createStringNode("it's"));
        assertEquals("'it\\''", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddEscapedCharsStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createStringNode("\n\r\t\\"));
        assertEquals("\"\\n\\r\\t\\\\\"", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddUnicodeCharsStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createStringNode("\u1234"));
        assertEquals("\"\\u1234\"", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddComplexStringLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createStringNode("a\"b'c\\d\ne\u0000")); // Including null character
        assertEquals("\"a\\\"b'c\\\\d\\ne\\u0000\"", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddIdentifier() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.addIdentifier("myVar");
        assertEquals("myVar", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddIdentifierWithEscape() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.addIdentifier("my-var"); // Invalid JS identifier character
        assertEquals("my\\u002dvar", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddSimpleAssignment() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = createIdentifierNode("a");
        Node value = createNumberNode(1);
        Node assignment = createAssignmentNode(name, value);
        cg.add(assignment);
        assertEquals("a=1;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddVarDeclaration() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = createIdentifierNode("b");
        Node value = createStringNode("hello");
        Node varDecl = createVarNode(name, value);
        cg.add(varDecl);
        assertEquals("var b=\"hello\";", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddVarDeclarationWithoutValue() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = createIdentifierNode("c");
        Node varDecl = createVarNode(name, null);
        cg.add(varDecl);
        assertEquals("var c;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddSimpleBlock() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node block = createBlockNode(createVarNode(createIdentifierNode("x"), createNumberNode(10)));
        cg.add(block, CodeGenerator.Context.STATEMENT);
        assertEquals("{var x=10;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddEmptyBlock() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node block = createBlockNode();
        cg.add(block, CodeGenerator.Context.STATEMENT);
        assertEquals("{}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddFunctionDeclaration() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = createIdentifierNode("myFunc");
        Node params = new Node(Token.COMMA, createIdentifierNode("a"), createIdentifierNode("b"));
        Node body = createBlockNode(createReturnNode(createIdentifierNode("a")));
        Node func = createFunctionNode(name, params, body);
        cg.add(func, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc(a,b){return a;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddFunctionExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = createIdentifierNode("anon"); // Named function expression
        Node params = createIdentifierNode("x");
        Node body = createBlockNode(createReturnNode(createIdentifierNode("x")));
        Node func = createFunctionNode(name, params, body);
        cg.add(func, CodeGenerator.Context.START_OF_EXPR); // Context for expression
        assertEquals("(function anon(x){return x;})", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAnonymousFunctionExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = new Node(Token.EMPTY); // Anonymous function
        Node params = createIdentifierNode("y");
        Node body = createBlockNode(createReturnNode(createIdentifierNode("y")));
        Node func = createFunctionNode(name, params, body);
        cg.add(func, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("(function(y){return y;})", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddSimpleCall() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node callee = createIdentifierNode("foo");
        Node arg1 = createNumberNode(1);
        Node arg2 = createStringNode("bar");
        Node call = createCallNode(callee, arg1, arg2);
        cg.add(call);
        assertEquals("foo(1,\"bar\");", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddCallWithNoArgs() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node callee = createIdentifierNode("baz");
        Node call = createCallNode(callee);
        cg.add(call);
        assertEquals("baz();", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddMethodCall() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node base = createIdentifierNode("obj");
        Node callee = createGetPropNode(base, "method");
        Node arg = createNumberNode(5);
        Node call = createCallNode(callee, arg);
        cg.add(call);
        assertEquals("obj.method(5);", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddArrayAccess() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node base = createIdentifierNode("arr");
        Node index = createNumberNode(2);
        Node getElem = createGetElemNode(base, index);
        cg.add(getElem);
        assertEquals("arr[2]", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddPropertyAccess() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node base = createIdentifierNode("obj");
        Node getProp = createGetPropNode(base, "prop");
        cg.add(getProp);
        assertEquals("obj.prop", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddObjectLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node prop1 = createObjectPropertyNode("key1", createNumberNode(1));
        Node prop2 = createObjectPropertyNode("key2", createStringNode("value"));
        Node objectLit = createObjectLiteralNode(prop1, prop2);
        cg.add(objectLit);
        assertEquals("{key1:1,key2:\"value\"}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddObjectLiteralWithQuotedKey() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node prop1 = createObjectPropertyNode(Node.newString("key-with-hyphen"), createNumberNode(1));
        Node objectLit = createObjectLiteralNode(prop1);
        cg.add(objectLit);
        assertEquals("{\"key-with-hyphen\":1}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddObjectLiteralWithKeywordKey() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node prop1 = createObjectPropertyNode(Node.newString("if"), createNumberNode(1));
        Node objectLit = createObjectLiteralNode(prop1);
        cg.add(objectLit);
        assertEquals("{\"if\":1}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddEmptyObjectLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node objectLit = createObjectLiteralNode();
        cg.add(objectLit);
        assertEquals("{}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddArrayLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node elem1 = createNumberNode(1);
        Node elem2 = createStringNode("two");
        Node arrayLit = createArrayLiteralNode(null, elem1, elem2);
        cg.add(arrayLit);
        assertEquals("[1,\"two\"]", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddArrayLiteralWithEmptySlots() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node elem1 = createNumberNode(1);
        Node elem3 = createNumberNode(3);
        int[] skipIndexes = {1, 2}; // Skip index 1 and 2
        Node arrayLit = createArrayLiteralNode(skipIndexes, elem1, elem3);
        cg.add(arrayLit);
        assertEquals("[1,,3]", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddEmptyArrayLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node arrayLit = createArrayLiteralNode(null);
        cg.add(arrayLit);
        assertEquals("[]", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddIfStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node condition = createIdentifierNode("x");
        Node thenBranch = createBlockNode(createExprResultNode(createNumberNode(1)));
        Node ifStatement = createIfNode(condition, thenBranch, null);
        cg.add(ifStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("if(x){1;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddIfElseStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node condition = createIdentifierNode("x");
        Node thenBranch = createBlockNode(createExprResultNode(createNumberNode(1)));
        Node elseBranch = createBlockNode(createExprResultNode(createNumberNode(0)));
        Node ifElseStatement = createIfNode(condition, thenBranch, elseBranch);
        cg.add(ifElseStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("if(x){1;}else{0;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddIfStatementWithElseIf() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node condition1 = createIdentifierNode("a");
        Node condition2 = createIdentifierNode("b");
        Node thenBranch1 = createBlockNode(createExprResultNode(createNumberNode(1)));
        Node thenBranch2 = createBlockNode(createExprResultNode(createNumberNode(2)));
        Node elseBranch2 = createBlockNode(createExprResultNode(createNumberNode(0)));
        Node ifElseStatement2 = createIfNode(condition2, thenBranch2, elseBranch2);
        Node ifStatement = createIfNode(condition1, thenBranch1, ifElseStatement2);
        cg.add(ifStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("if(a){1;}else{if(b){2;}else{0;}}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddWhileStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node condition = createIdentifierNode("cond");
        Node body = createBlockNode(createBreakNode());
        Node whileStatement = createWhileNode(condition, body);
        cg.add(whileStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("while(cond){break;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddDoWhileStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node body = createBlockNode(createContinueNode());
        Node condition = createIdentifierNode("c");
        Node doWhileStatement = createDoWhileNode(body, condition);
        cg.add(doWhileNode, CodeGenerator.Context.STATEMENT);
        assertEquals("do{continue;}while(c);", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = createVarNode(createIdentifierNode("i"), createNumberNode(0));
        Node condition = createIdentifierNode("i<10");
        Node increment = createPostIncNode(createIdentifierNode("i"));
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("i")));
        Node forStatement = createForNode(init, condition, increment, body);
        cg.add(forStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(var i=0;i<10;i++){i;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForInStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node variable = createVarNode(createIdentifierNode("key"), null);
        Node iterable = createIdentifierNode("obj");
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("key")));
        Node forInStatement = createForInNode(variable, iterable, body);
        cg.add(forInStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(var key in obj){key;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddEmptyStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createEmptyNode(), CodeGenerator.Context.STATEMENT);
        assertEquals(";", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddTryCatchStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node tryBlock = createBlockNode(createExprResultNode(createNumberNode(1)));
        Node catchVar = createIdentifierNode("e");
        Node catchBlock = createBlockNode(createExprResultNode(createIdentifierNode("e")));
        Node tryCatchStatement = createTryCatchFinallyNode(tryBlock, catchVar, catchBlock, null);
        cg.add(tryCatchStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("try{1;}catch(e){e;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddTryCatchFinallyStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node tryBlock = createBlockNode(createExprResultNode(createNumberNode(1)));
        Node catchVar = createIdentifierNode("e");
        Node catchBlock = createBlockNode(createExprResultNode(createIdentifierNode("e")));
        Node finallyBlock = createBlockNode(createExprResultNode(createNumberNode(2)));
        Node tryCatchFinallyStatement = createTryCatchFinallyNode(tryBlock, catchVar, catchBlock, finallyBlock);
        cg.add(tryCatchFinallyStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("try{1;}catch(e){e;}finally{2;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddThrowStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node exception = createStringNode("Error");
        Node throwStatement = createThrowNode(exception);
        cg.add(throwStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("throw\"Error\";", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddReturnStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node returnValue = createNumberNode(10);
        Node returnStatement = createReturnNode(returnValue);
        cg.add(returnStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("return 10;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddReturnStatementWithoutValue() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node returnStatement = createReturnNode(null);
        cg.add(returnStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("return;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBreakStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node breakStatement = createBreakNode();
        cg.add(breakStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("break;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBreakStatementWithLabel() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node breakStatement = createBreakNode("myLabel");
        cg.add(breakStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("break myLabel;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddContinueStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node continueStatement = createContinueNode();
        cg.add(continueStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("continue;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddContinueStatementWithLabel() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node continueStatement = createContinueNode("loopLabel");
        cg.add(continueStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("continue loopLabel;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddDebuggerStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node debuggerStatement = createDebuggerNode();
        cg.add(debuggerStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("debugger;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddLabeledStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node label = createLabelNode("myLabel", createExprResultNode(createNumberNode(5)));
        cg.add(label, CodeGenerator.Context.STATEMENT);
        assertEquals("myLabel:5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddExpressionStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expr = createIdentifierNode("someVar");
        Node exprStmt = new Node(Token.EXPR_RESULT, expr);
        cg.add(exprStmt, CodeGenerator.Context.STATEMENT);
        assertEquals("someVar;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddParenthesizedExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expr = createBinaryOperatorNode(Token.ADD, createNumberNode(1), createNumberNode(2));
        Node parenthesizedExpr = new Node(Token.LP, expr);
        cg.add(parenthesizedExpr);
        assertEquals("(1+2)", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorAdd() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(5);
        Node right = createNumberNode(3);
        Node addExpr = createBinaryOperatorNode(Token.ADD, left, right);
        cg.add(addExpr);
        assertEquals("5+3", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorSubtract() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(10);
        Node right = createNumberNode(4);
        Node subExpr = createBinaryOperatorNode(Token.SUB, left, right);
        cg.add(subExpr);
        assertEquals("10-4", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorMultiply() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(6);
        Node right = createNumberNode(7);
        Node mulExpr = createBinaryOperatorNode(Token.MUL, left, right);
        cg.add(mulExpr);
        assertEquals("6*7", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorDivide() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(20);
        Node right = createNumberNode(5);
        Node divExpr = createBinaryOperatorNode(Token.DIV, left, right);
        cg.add(divExpr);
        assertEquals("20/5", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorModulus() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(15);
        Node right = createNumberNode(4);
        Node modExpr = createBinaryOperatorNode(Token.MOD, left, right);
        cg.add(modExpr);
        assertEquals("15%4", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorEquals() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(10);
        Node right = createNumberNode(10);
        Node eqExpr = createBinaryOperatorNode(Token.EQ, left, right);
        cg.add(eqExpr);
        assertEquals("10==10", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorNotEquals() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(5);
        Node right = createNumberNode(6);
        Node neExpr = createBinaryOperatorNode(Token.NE, left, right);
        cg.add(neExpr);
        assertEquals("5!=6", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorLessThan() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(3);
        Node right = createNumberNode(7);
        Node ltExpr = createBinaryOperatorNode(Token.LT, left, right);
        cg.add(ltExpr);
        assertEquals("3<7", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorGreaterThan() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(9);
        Node right = createNumberNode(2);
        Node gtExpr = createBinaryOperatorNode(Token.GT, left, right);
        cg.add(gtExpr);
        assertEquals("9>2", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorLessThanOrEqual() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(5);
        Node right = createNumberNode(5);
        Node leExpr = createBinaryOperatorNode(Token.LE, left, right);
        cg.add(leExpr);
        assertEquals("5<=5", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorGreaterThanOrEqual() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(8);
        Node right = createNumberNode(8);
        Node geExpr = createBinaryOperatorNode(Token.GE, left, right);
        cg.add(geExpr);
        assertEquals("8>=8", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorOr() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createTrueNode();
        Node right = createFalseNode();
        Node orExpr = createBinaryOperatorNode(Token.OR, left, right);
        cg.add(orExpr);
        assertEquals("true||false", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorAnd() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createTrueNode();
        Node right = createFalseNode();
        Node andExpr = createBinaryOperatorNode(Token.AND, left, right);
        cg.add(andExpr);
        assertEquals("true&&false", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorBitwiseOr() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(5); // 101
        Node right = createNumberNode(3); // 011
        Node bitOrExpr = createBinaryOperatorNode(Token.BITOR, left, right); // 111
        cg.add(bitOrExpr);
        assertEquals("5|3", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorBitwiseXor() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(5); // 101
        Node right = createNumberNode(3); // 011
        Node bitXorExpr = createBinaryOperatorNode(Token.BITXOR, left, right); // 110
        cg.add(bitXorExpr);
        assertEquals("5^3", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorBitwiseAnd() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(5); // 101
        Node right = createNumberNode(3); // 011
        Node bitAndExpr = createBinaryOperatorNode(Token.BITAND, left, right); // 001
        cg.add(bitAndExpr);
        assertEquals("5&3", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorLeftShift() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(2);
        Node right = createNumberNode(3);
        Node lshExpr = createBinaryOperatorNode(Token.LSH, left, right);
        cg.add(lshExpr);
        assertEquals("2<<3", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorRightShift() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(16);
        Node right = createNumberNode(2);
        Node rshExpr = createBinaryOperatorNode(Token.RSH, left, right);
        cg.add(rshExpr);
        assertEquals("16>>2", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorUnsignedRightShift() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(-16);
        Node right = createNumberNode(2);
        Node urshExpr = createBinaryOperatorNode(Token.URSH, left, right);
        cg.add(urshExpr);
        assertEquals("-16>>>2", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorIn() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createStringNode("key");
        Node right = createIdentifierNode("obj");
        Node inExpr = createBinaryOperatorNode(Token.IN, left, right);
        cg.add(inExpr);
        assertEquals("\"key\"in obj", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorInstanceof() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("obj");
        Node right = createIdentifierNode("Object");
        Node instanceofExpr = createBinaryOperatorNode(Token.INSTANCEOF, left, right);
        cg.add(instanceofExpr);
        assertEquals("obj instanceof Object", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddUnaryOperatorNot() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createIdentifierNode("flag");
        Node notExpr = createUnaryOperatorNode(Token.NOT, operand);
        cg.add(notExpr);
        assertEquals("!flag", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddUnaryOperatorBitwiseNot() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNumberNode(5); // 0101
        Node bitNotExpr = createUnaryOperatorNode(Token.BITNOT, operand); // 1010 (two's complement)
        cg.add(bitNotExpr);
        assertEquals("~5", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddUnaryOperatorPos() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNumberNode(5);
        Node posExpr = createUnaryOperatorNode(Token.POS, operand);
        cg.add(posExpr);
        assertEquals("+5", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddUnaryOperatorNeg() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createNumberNode(10);
        Node negExpr = createUnaryOperatorNode(Token.NEG, operand);
        cg.add(negExpr);
        assertEquals("-10", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddUnaryOperatorTypeof() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createIdentifierNode("x");
        Node typeofExpr = createUnaryOperatorNode(Token.TYPEOF, operand);
        cg.add(typeofExpr);
        assertEquals("typeof x", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddUnaryOperatorVoid() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createIdentifierNode("y");
        Node voidExpr = createUnaryOperatorNode(Token.VOID, operand);
        cg.add(voidExpr);
        assertEquals("void y", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddPrefixIncrement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createIdentifierNode("z");
        Node incExpr = createIncNode(operand);
        cg.add(incExpr);
        assertEquals("++z", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddPrefixDecrement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createIdentifierNode("w");
        Node decExpr = createDecNode(operand);
        cg.add(decExpr);
        assertEquals("--w", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddPostfixIncrement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createIdentifierNode("count");
        Node postIncExpr = createPostIncNode(operand);
        cg.add(postIncExpr);
        assertEquals("count++", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddPostfixDecrement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node operand = createIdentifierNode("total");
        Node postDecExpr = createPostDecNode(operand);
        cg.add(postDecExpr);
        assertEquals("total--", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("abc", "");
        cg.add(regExp);
        assertEquals("/abc/", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteralWithFlags() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("a.b", "gi");
        cg.add(regExp);
        assertEquals("/a.b/gi", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteralWithSpecialChars() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("[abc]", "");
        cg.add(regExp);
        assertEquals("/[abc]/", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteralWithEscapedSlash() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("a/b", "");
        cg.add(regExp);
        assertEquals("/a\\/b/", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteralWithForwardSlashEscaping() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("</script>", "");
        cg.add(regExp);
        assertEquals("/<\\/script>/", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteralWithBackslashAndAngleBracket() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("\\>", "");
        cg.add(regExp);
        assertEquals("/\\\\>/", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddConditionalExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node condition = createIdentifierNode("x");
        Node thenBranch = createNumberNode(1);
        Node elseBranch = createNumberNode(0);
        Node hookExpr = createHookNode(condition, thenBranch, elseBranch);
        cg.add(hookExpr);
        assertEquals("x?1:0", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNewExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node constructor = createIdentifierNode("MyClass");
        Node arg1 = createNumberNode(1);
        Node arg2 = createStringNode("test");
        Node newNode = createNewNode(constructor, arg1, arg2);
        cg.add(newNode);
        assertEquals("new MyClass(1,\"test\")", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNewExpressionNoArgs() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node constructor = createIdentifierNode("MyClass");
        Node newNode = createNewNode(constructor);
        cg.add(newNode);
        assertEquals("new MyClass()", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddDeleteOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node target = createIdentifierNode("obj.prop");
        Node deleteNode = new Node(Token.DELPROP, target);
        cg.add(deleteNode);
        assertEquals("delete obj.prop", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddWithStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expression = createIdentifierNode("obj");
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("prop")));
        Node withStatement = new Node(Token.WITH, expression, body);
        cg.add(withStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("with(obj){prop;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddSwitchStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expression = createIdentifierNode("val");
        Node case1 = createCaseNode(createNumberNode(1), createExprResultNode(createStringNode("one")));
        Node case2 = createCaseNode(createNumberNode(2), createExprResultNode(createStringNode("two")));
        Node defaultCase = createDefaultNode(createExprResultNode(createStringNode("default")));
        Node switchStatement = createSwitchNode(expression, case1, case2, defaultCase);
        cg.add(switchStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("switch(val){case 1:\"one\";case 2:\"two\";default:\"default\";}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddCaseStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node caseStatement = createCaseNode(createNumberNode(1), createExprResultNode(createStringNode("value")));
        cg.add(caseStatement);
        assertEquals("case 1:\"value\";", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddDefaultStatement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node defaultStatement = createDefaultNode(createExprResultNode(createStringNode("default")));
        cg.add(defaultStatement);
        assertEquals("default:\"default\";", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddStringEscapingWithCharsetEncoder() throws Exception {
        CodeGenerator cg = createCodeGenerator(Charsets.ISO_8859_1); // A charset that doesn't support all chars
        Node strNode = createStringNode("你好"); // Non-ISO-8859-1 characters
        cg.add(strNode);
        // Expected: Unicode escape for characters not in ISO-8859-1
        assertEquals("\"\\u4f60\\u597d\"", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpEscapingWithCharsetEncoder() throws Exception {
        CodeGenerator cg = createCodeGenerator(Charsets.ISO_8859_1);
        // A regex pattern with characters that might be problematic and also non-ISO-8859-1
        // The \u{1F600} is a unicode escape sequence that needs to be represented correctly.
        // Java's String literal doesn't directly support \u{...} for unicode code points.
        // We should use the actual unicode character or its equivalent \uXXXX representation if it fits.
        // For this test, we'll represent the emoji using its surrogate pairs.
        // U+1F600 is 😀. Its surrogate pair is \uD83D\uDE00.
        Node regExpNode = createRegExpNode("[a-z\uD83D\uDE00]", "g");
        cg.add(regExpNode);
        // Expected: Unicode escapes for problematic chars and the emoji
        assertEquals("/[a-z\\u005b\\u0061\\u002d\\u007a\\ud83d\\ude00\\u005d/gu", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddIdentifierEscaping() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        // An identifier with characters that are not typically allowed in JS identifiers
        String escaped = CodeGenerator.identifierEscape("my-identifier");
        assertEquals("my\\u002didentifier", escaped);
    }

    @Test
    public void testAddIdentifierEscapingWithNonAscii() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        String escaped = CodeGenerator.identifierEscape("variable\u00E9"); // é is non-ASCII
        assertEquals("variable\\u00e9", escaped);
    }

    @Test
    public void testAddIdentifierEscapingWithControlChar() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        String escaped = CodeGenerator.identifierEscape("var\u0001name"); // Control character
        assertEquals("var\\u0001name", escaped);
    }

    @Test
    public void testAddNullLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createNullNode());
        assertEquals("null", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddThisExpression() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createThisNode());
        assertEquals("this", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBooleanTrueLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createTrueNode());
        assertEquals("true", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBooleanFalseLiteral() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        cg.add(createFalseNode());
        assertEquals("false", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddCommaOperator() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(1);
        Node right = createNumberNode(2);
        Node commaExpr = new Node(Token.COMMA, left, right);
        cg.add(commaExpr);
        assertEquals("1,2", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddArrayLiteralWithSkipIndexes() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node elem1 = createNumberNode(1);
        Node elem3 = createNumberNode(3);
        int[] skipIndexes = {1}; // Skip index 1
        Node arrayLit = createArrayLiteralNode(skipIndexes, elem1, elem3);
        cg.add(arrayLit);
        assertEquals("[1,,3]", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddCallToEvalDirect() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node evalName = createIdentifierNode("eval");
        evalName.putBooleanProp(Node.DIRECT_EVAL, true); // Mark as direct eval
        Node arg = createStringNode("alert('hello')");
        Node call = createCallNode(evalName, arg);
        cg.add(call);
        assertEquals("eval(\"alert('hello')\");", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddCallToEvalIndirect() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node evalName = createIdentifierNode("eval");
        // No DIRECT_EVAL prop, so it's indirect
        Node arg = createStringNode("alert('hello')");
        Node call = createCallNode(evalName, arg);
        cg.add(call);
        assertEquals("(0,eval(\"alert('hello')\"));", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentWithInForClauseContext() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node name = createIdentifierNode("a");
        Node value = createNumberNode(1);
        Node assignment = createAssignmentNode(name, value);
        cg.add(assignment, CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
        assertEquals("a=1", ((TestConsumer) cg.cc).getCode()); // No trailing semicolon in FOR_INIT_CLAUSE context
    }

    @Test
    public void testAddComplexExpressionWithParensInForClauseContext() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createIdentifierNode("y");
        Node inOp = new Node(Token.IN, left, right);
        cg.add(inOp, CodeGenerator.Context.IN_FOR_INIT_CLAUSE); // `in` operator should be parenthesized
        assertEquals("(x in y)", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryExpressionWithContext() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(1);
        Node right = createNumberNode(2);
        Node addExpr = createBinaryOperatorNode(Token.ADD, left, right);
        cg.add(addExpr, CodeGenerator.Context.STATEMENT);
        assertEquals("1+2;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddNestedFunctionDeclaration() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node innerName = createIdentifierNode("inner");
        Node innerParams = createIdentifierNode("b");
        Node innerBody = createBlockNode(createReturnNode(createIdentifierNode("b")));
        Node innerFunc = createFunctionNode(innerName, innerParams, innerBody);

        Node outerName = createIdentifierNode("outer");
        Node outerParams = createIdentifierNode("a");
        Node outerBody = createBlockNode(createReturnNode(innerFunc));
        Node outerFunc = createFunctionNode(outerName, outerParams, outerBody);

        cg.add(outerFunc, CodeGenerator.Context.STATEMENT);
        assertEquals("function outer(a){return function inner(b){return b;};}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddObjectLiteralWithNumberKey() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node keyNode = Node.newNumber(123);
        Node valueNode = createStringNode("value");
        Node prop = createObjectPropertyNode(keyNode, valueNode);
        Node objectLit = createObjectLiteralNode(prop);
        cg.add(objectLit);
        assertEquals("{123:\"value\"}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddArrayLiteralWithEmptyFirstElement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node elem2 = createStringNode("two");
        int[] skipIndexes = {0}; // Skip index 0
        Node arrayLit = createArrayLiteralNode(skipIndexes, elem2);
        cg.add(arrayLit);
        assertEquals("[,\"two\"]", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpAdd() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignAdd = new Node(Token.ASSIGN_ADD, left, right);
        cg.add(assignAdd);
        assertEquals("x+=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpSub() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignSub = new Node(Token.ASSIGN_SUB, left, right);
        cg.add(assignSub);
        assertEquals("x-=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpMul() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignMul = new Node(Token.ASSIGN_MUL, left, right);
        cg.add(assignMul);
        assertEquals("x*=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpDiv() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignDiv = new Node(Token.ASSIGN_DIV, left, right);
        cg.add(assignDiv);
        assertEquals("x/=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpMod() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignMod = new Node(Token.ASSIGN_MOD, left, right);
        cg.add(assignMod);
        assertEquals("x%=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpBitwiseAnd() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignBitAnd = new Node(Token.ASSIGN_BITAND, left, right);
        cg.add(assignBitAnd);
        assertEquals("x&=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpBitwiseOr() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignBitOr = new Node(Token.ASSIGN_BITOR, left, right);
        cg.add(assignBitOr);
        assertEquals("x|=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpBitwiseXor() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignBitXor = new Node(Token.ASSIGN_BITXOR, left, right);
        cg.add(assignBitXor);
        assertEquals("x^=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpLeftShift() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignLsh = new Node(Token.ASSIGN_LSH, left, right);
        cg.add(assignLsh);
        assertEquals("x<<=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpRightShift() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignRsh = new Node(Token.ASSIGN_RSH, left, right);
        cg.add(assignRsh);
        assertEquals("x>>=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddAssignmentOpUnsignedRightShift() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createIdentifierNode("x");
        Node right = createNumberNode(5);
        Node assignUrsh = new Node(Token.ASSIGN_URSH, left, right);
        cg.add(assignUrsh);
        assertEquals("x>>>=5;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddPropertyAccessWithNumber() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node base = createIdentifierNode("obj");
        Node getProp = createGetPropNode(base, "123"); // Property name is a number
        cg.add(getProp);
        assertEquals("obj.123", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddObjectLiteralWithEscapedStringKey() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node keyNode = Node.newString("\"key\""); // Key is a quoted string
        Node valueNode = createStringNode("value");
        Node prop = createObjectPropertyNode(keyNode, valueNode);
        Node objectLit = createObjectLiteralNode(prop);
        cg.add(objectLit);
        // JS requires single quotes for escaped double quotes in object keys when the key itself is a string literal.
        // However, if the keyNode itself is already a string literal, it should be printed as is.
        // The createObjectPropertyNode(Node key, Node value) overload expects a string key.
        // Let's assume the intention is to have a key that is literally the string "\"key\"".
        // If the keyNode is Node.newString("\"key\""), it should output {"\"key\"":...}.
        // The reference code handles this by creating a string literal for the key.
        assertEquals("{\"'key'\":\"value\"}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddWithStatementEmptyBody() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expression = createIdentifierNode("obj");
        Node body = createBlockNode(); // Empty block
        Node withStatement = new Node(Token.WITH, expression, body);
        cg.add(withStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("with(obj){}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForStatementWithEmptyInitAndIncrement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = createEmptyNode(); // Empty init
        Node condition = createIdentifierNode("i<10");
        Node increment = createEmptyNode(); // Empty increment
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("i")));
        Node forStatement = createForNode(init, condition, increment, body);
        cg.add(forStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(;i<10;){i;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForStatementWithVarInInit() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = createVarNode(createIdentifierNode("i"), createNumberNode(0));
        Node condition = createIdentifierNode("i<10");
        Node increment = createPostIncNode(createIdentifierNode("i"));
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("i")));
        Node forStatement = createForNode(init, condition, increment, body);
        cg.add(forStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(var i=0;i<10;i++){i;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForStatementWithExpressionInInit() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = createAssignmentNode(createIdentifierNode("i"), createNumberNode(0));
        Node condition = createIdentifierNode("i<10");
        Node increment = createPostIncNode(createIdentifierNode("i"));
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("i")));
        Node forStatement = createForNode(init, condition, increment, body);
        cg.add(forStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(i=0;i<10;i++){i;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForInStatementWithEmptyVariable() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node variable = createEmptyNode(); // Empty variable declaration
        Node iterable = createIdentifierNode("obj");
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("key")));
        Node forInStatement = createForInNode(variable, iterable, body);
        cg.add(forInStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(in obj){key;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForStatementWithOnlyCondition() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = new Node(Token.EMPTY);
        Node condition = createIdentifierNode("x > 0");
        Node increment = new Node(Token.EMPTY);
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("x--")));
        Node forStatement = createForNode(init, condition, increment, body);
        cg.add(forStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(;x>0;){x--;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForStatementWithOnlyIncrement() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = new Node(Token.EMPTY);
        Node condition = new Node(Token.EMPTY);
        Node increment = createPostIncNode(createIdentifierNode("i"));
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("i")));
        Node forStatement = createForNode(init, condition, increment, body);
        cg.add(forStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(;;i++){i;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddForStatementWithOnlyInit() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node init = createVarNode(createIdentifierNode("j"), createNumberNode(0));
        Node condition = new Node(Token.EMPTY);
        Node increment = new Node(Token.EMPTY);
        Node body = createBlockNode(createExprResultNode(createIdentifierNode("j")));
        Node forStatement = createForNode(init, condition, increment, body);
        cg.add(forStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("for(var j=0;;){j;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddSwitchStatementWithNoCases() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expression = createIdentifierNode("val");
        Node switchStatement = createSwitchNode(expression);
        cg.add(switchStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("switch(val){}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddSwitchStatementWithOnlyDefault() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node expression = createIdentifierNode("val");
        Node defaultCase = createDefaultNode(createExprResultNode(createStringNode("default")));
        Node switchStatement = createSwitchNode(expression, defaultCase);
        cg.add(switchStatement, CodeGenerator.Context.STATEMENT);
        assertEquals("switch(val){default:\"default\";}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddLabeledStatementWithEmptyBody() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node labelName = new Node(Token.LABEL_NAME, "myLabel");
        Node emptyStatement = createEmptyNode();
        Node labelNode = new Node(Token.LABEL, labelName, emptyStatement);
        cg.add(labelNode, CodeGenerator.Context.STATEMENT);
        assertEquals("myLabel:;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddLabeledStatementWithBlockBody() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node labelName = new Node(Token.LABEL_NAME, "myLabel");
        Node blockStatement = createBlockNode(createExprResultNode(createNumberNode(5)));
        Node labelNode = new Node(Token.LABEL, labelName, blockStatement);
        cg.add(labelNode, CodeGenerator.Context.STATEMENT);
        assertEquals("myLabel:{5;}", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddExpressionStatementWithComma() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node left = createNumberNode(1);
        Node right = createNumberNode(2);
        Node commaExpr = new Node(Token.COMMA, left, right);
        Node exprStmt = new Node(Token.EXPR_RESULT, commaExpr);
        cg.add(exprStmt, CodeGenerator.Context.STATEMENT);
        assertEquals("1,2;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorAssociativity() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node a = createNumberNode(1);
        Node b = createNumberNode(2);
        Node c = createNumberNode(3);
        Node expr1 = createBinaryOperatorNode(Token.ADD, b, c); // (2+3)
        Node expr2 = createBinaryOperatorNode(Token.ADD, a, expr1); // 1+(2+3)
        cg.add(expr2);
        assertEquals("1+2+3", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorRightAssociativity() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node a = createNumberNode(1);
        Node b = createNumberNode(2);
        Node c = createNumberNode(3);
        Node assign1 = createAssignmentNode(createIdentifierNode("x"), c); // x = 3
        Node assign2 = createAssignmentNode(createIdentifierNode("y"), assign1); // y = (x = 3)
        cg.add(assign2);
        assertEquals("y=x=3;", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorPrecedence() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node a = createNumberNode(2);
        Node b = createNumberNode(3);
        Node c = createNumberNode(4);
        Node mulExpr = createBinaryOperatorNode(Token.MUL, b, c); // 3*4
        Node addExpr = createBinaryOperatorNode(Token.ADD, a, mulExpr); // 2 + (3*4)
        cg.add(addExpr);
        assertEquals("2+3*4", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddBinaryOperatorPrecedenceWithParens() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node a = createNumberNode(2);
        Node b = createNumberNode(3);
        Node c = createNumberNode(4);
        Node addExpr = createBinaryOperatorNode(Token.ADD, a, b); // 2+3
        Node mulExpr = createBinaryOperatorNode(Token.MUL, addExpr, c); // (2+3)*4
        cg.add(mulExpr);
        assertEquals("(2+3)*4", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddHookNodeAssociativity() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node cond1 = createIdentifierNode("a");
        Node cond2 = createIdentifierNode("b");
        Node then1 = createNumberNode(1);
        Node then2 = createNumberNode(2);
        Node else1 = createNumberNode(3);
        Node hook1 = createHookNode(cond2, then2, else1); // b ? 2 : 3
        Node hook2 = createHookNode(cond1, then1, hook1); // a ? 1 : (b ? 2 : 3)
        cg.add(hook2);
        assertEquals("a?1:b?2:3", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteralWithSpecialCharsInFlags() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("abc", "g\\"); // Invalid flag
        cg.add(regExp);
        // The behavior for invalid flags might vary, but the current implementation likely just outputs them.
        assertEquals("/abc/g\\", ((TestConsumer) cg.cc).getCode());
    }

    @Test
    public void testAddRegExpLiteralWithEscapedBackslash() throws Exception {
        CodeGenerator cg = createCodeGenerator();
        Node regExp = createRegExpNode("a\\\\b", "");
        cg.add(regExp);
        assertEquals("/a\\\\\\\\b/", ((TestConsumer) cg.cc).getCode()); // Double escaping for backslash
    }
}
```