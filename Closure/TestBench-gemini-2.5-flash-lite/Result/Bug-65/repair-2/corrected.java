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

    // Mock CodeConsumer to capture generated code.
    private static class RecordingCodeConsumer extends CodeConsumer {
        StringBuilder generatedCode = new StringBuilder();
        StringBuilder currentLine = new StringBuilder();
        private int indent = 0;
        private String indentUnit = "  ";

        @Override
        void startSourceMapping(Node node) {}
        @Override
        void endSourceMapping(Node node) {}
        @Override
        boolean continueProcessing() { return true; }
        @Override
        char getLastChar() { return currentLine.length() > 0 ? currentLine.charAt(currentLine.length() - 1) : '\0'; }
        @Override
        void addIdentifier(String identifier) { append(identifier); }
        @Override
        void append(String str) { currentLine.append(str); }
        @Override
        void appendBlockStart() {
            generatedCode.append(currentLine);
            currentLine = new StringBuilder();
            generatedCode.append('{');
            indent++;
        }
        @Override
        void appendBlockEnd() {
            generatedCode.append(currentLine);
            currentLine = new StringBuilder();
            indent--;
            generatedCode.append('}');
        }
        @Override
        void startNewLine() {
            generatedCode.append(currentLine);
            currentLine = new StringBuilder();
            for (int i = 0; i < indent; i++) {
                currentLine.append(indentUnit);
            }
        }
        @Override
        void maybeLineBreak() { startNewLine(); }
        @Override
        void maybeCutLine() {}
        @Override
        void endLine() { startNewLine(); }
        @Override
        void notePreferredLineBreak() {}
        @Override
        void beginBlock() { appendBlockStart(); }
        @Override
        void endBlock() { appendBlockEnd(); }
        @Override
        void endBlock(boolean shouldEndLine) { appendBlockEnd(); }
        @Override
        void listSeparator() { append(","); }
        @Override
        void endStatement() { endStatement(false); }
        @Override
        void endStatement(boolean needSemiColon) {
            generatedCode.append(currentLine);
            currentLine = new StringBuilder();
            if (needSemiColon) {
                generatedCode.append(';');
            }
        }
        @Override
        void maybeEndStatement() { endStatement(true); }
        @Override
        void endFunction() {}
        @Override
        void endFunction(boolean statementContext) {}
        @Override
        void beginCaseBody() { startNewLine(); }
        @Override
        void endCaseBody() { endStatement(true); }
        @Override
        void add(String newcode) { append(newcode); }
        @Override
        void appendOp(String op, boolean binOp) { append(op); }
        @Override
        void addOp(String op, boolean binOp) { append(op); }
        @Override
        void addNumber(double x) { append(String.valueOf(x)); }
        @Override
        boolean shouldPreserveExtraBlocks() { return true; }
        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) { return false; }
        @Override
        void endFile() { generatedCode.append(currentLine); }
        String getCode() { return generatedCode.toString() + currentLine.toString(); }
    }

    private CodeGenerator createCodeGenerator(CodeConsumer consumer) {
        return new CodeGenerator(consumer);
    }

    @Test
    public void testTagAsStrict() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.tagAsStrict();
        assertEquals("'use strict';", consumer.getCode());
    }

    @Test
    public void testAddSimpleString() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.add("var x = 1;");
        assertEquals("var x = 1;", consumer.getCode());
    }

    @Test
    public void testAddNumber() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.addNumber(123.45);
        assertEquals("123.45", consumer.getCode());
    }

    @Test
    public void testAddIdentifier() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.addIdentifier("myVar");
        assertEquals("myVar", consumer.getCode());
    }

    @Test
    public void testAddIdentifierWithEscape() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.addIdentifier("my-var");
        assertEquals("my-var", consumer.getCode());
    }

    @Test
    public void testAddLeftExpr() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node numberNode = Node.newNumber(10);
        cg.addLeftExpr(numberNode, 0, CodeGenerator.Context.OTHER);
        assertEquals("10", consumer.getCode());
    }

    @Test
    public void testAddExprWithPrecedence() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node addNode = new Node(Token.ADD, Node.newNumber(5), Node.newNumber(3));
        cg.addExpr(addNode, 10);
        assertEquals("5+3", consumer.getCode());
    }

    @Test
    public void testAddExprWithLowPrecedence() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node mulNode = new Node(Token.MUL, Node.newNumber(2), Node.newNumber(4));
        cg.addExpr(mulNode, 20);
        assertEquals("(2*4)", consumer.getCode());
    }

    @Test
    public void testAddListSimple() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n1 = Node.newNumber(1);
        Node n2 = Node.newNumber(2);
        n1.addChildAfter(n2, n1); // Use addChildAfter to link nodes
        cg.addList(n1);
        assertEquals("1,2", consumer.getCode());
    }

    @Test
    public void testAddArrayList() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n1 = Node.newNumber(1);
        Node n2 = Node.newNumber(2);
        n1.addChildAfter(n2, n1); // Use addChildAfter to link nodes
        cg.addArrayList(n1);
        assertEquals("1,2", consumer.getCode());
    }

    @Test
    public void testAddCaseBody() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node blockNode = new Node(Token.BLOCK, Node.newNumber(10));
        cg.addCaseBody(blockNode);
        assertEquals("10", consumer.getCode());
    }

    @Test
    public void testAddAllSiblings() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n1 = Node.newNumber(1);
        Node n2 = Node.newNumber(2);
        n1.addChildAfter(n2, n1); // Use addChildAfter to link nodes
        cg.addAllSiblings(n1);
        assertEquals("12", consumer.getCode());
    }

    @Test
    public void testAddJsStringDoubleQuote() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.addJsString("hello\"world");
        assertEquals("\"hello\\\"world\"", consumer.getCode());
    }

    @Test
    public void testAddJsStringSingleQuote() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.addJsString("hello'world");
        assertEquals("'hello\\'world'", consumer.getCode());
    }

    @Test
    public void testAddJsStringMixedQuotes() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.addJsString("a\"b'c"); // Should pick single quotes
        assertEquals("'a\"b\\'c'", consumer.getCode());
    }

    @Test
    public void testRegexpEscape() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node regexpNode = new Node(Token.REGEXP, Node.newString(Token.STRING, "/abc/gi"), Node.newString(Token.STRING, ""));
        cg.add(regexpNode);
        assertEquals("/abc/gi", consumer.getCode());
    }

    @Test
    public void testRegexpEscapeWithFlags() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node regexpNode = new Node(Token.REGEXP, Node.newString(Token.STRING, "/a.b/"), Node.newString(Token.STRING, "i"));
        cg.add(regexpNode);
        assertEquals("/a.b/i", consumer.getCode());
    }

    @Test
    public void testStrEscapeSpecialChars() throws Exception {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String result = cg.jsString("a\nb\rc\td\\e\"f'g<h>i");
        assertEquals("'a\\nb\\rc\\td\\\\e\"f\\'g<h>i'", result);
    }

    @Test
    public void testIdentifierEscapeLatin() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        assertEquals("abc", CodeGenerator.identifierEscape("abc"));
    }

    @Test
    public void testIdentifierEscapeNonLatin() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        assertEquals("\\u00E9", CodeGenerator.identifierEscape("é"));
    }

    @Test
    public void testAppendHexJavaScriptRepresentation() throws IOException {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        StringBuilder sb = new StringBuilder();
        CodeGenerator.appendHexJavaScriptRepresentation(sb, '€');
        assertEquals("\\u20AC", sb.toString());
    }

    @Test
    public void testAppendHexJavaScriptRepresentationSupplementary() throws IOException {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        StringBuilder sb = new StringBuilder();
        int codePoint = 0x1F4A9;
        CodeGenerator.appendHexJavaScriptRepresentation(sb, codePoint);
        assertEquals("\\uD83D\\uDCA9", sb.toString());
    }

    @Test
    public void testIsSimpleNumber() {
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertTrue(CodeGenerator.isSimpleNumber("0"));
        assertFalse(CodeGenerator.isSimpleNumber("123a"));
        assertFalse(CodeGenerator.isSimpleNumber("1.23"));
        assertFalse(CodeGenerator.isSimpleNumber(""));
    }

    @Test
    public void testGetSimpleNumber() {
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
        assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0);
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("123a")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("1.23")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("9223372036854775808")));
    }

    @Test
    public void testIsIndirectEval() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node nameNode = Node.newString(Token.NAME, "eval");
        nameNode.putBooleanProp(Node.DIRECT_EVAL, false);
        assertTrue(cg.isIndirectEval(nameNode));

        Node directEvalNode = Node.newString(Token.NAME, "eval");
        directEvalNode.putBooleanProp(Node.DIRECT_EVAL, true);
        assertFalse(cg.isIndirectEval(directEvalNode));

        Node notEvalNode = Node.newString(Token.NAME, "other");
        notEvalNode.putBooleanProp(Node.DIRECT_EVAL, false);
        assertFalse(cg.isIndirectEval(notEvalNode));
    }

    @Test
    public void testAddNonEmptyStatementEmpty() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node emptyNode = new Node(Token.EMPTY);
        cg.addNonEmptyStatement(emptyNode, CodeGenerator.Context.OTHER, false);
        assertEquals(";", consumer.getCode());
    }

    @Test
    public void testAddNonEmptyStatementBlockWithOneFunction() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node funcNode = new Node(Token.FUNCTION);
        Node blockNode = new Node(Token.BLOCK, funcNode);
        cg.addNonEmptyStatement(blockNode, CodeGenerator.Context.OTHER, true);
        assertEquals("{function() {}}", consumer.getCode());
    }

    @Test
    public void testAddNonEmptyStatementBlockWithMultipleStatements() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node stmt1 = new Node(Token.EXPR_RESULT, Node.newNumber(1));
        Node stmt2 = new Node(Token.EXPR_RESULT, Node.newNumber(2));
        stmt1.addChildAfter(stmt2, stmt1);
        Node blockNode = new Node(Token.BLOCK, stmt1);
        cg.addNonEmptyStatement(blockNode, CodeGenerator.Context.OTHER, true);
        assertEquals("{1;2;}", consumer.getCode());
    }

    @Test
    public void testAddNonEmptyStatementNonBlockSingleStatement() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node exprNode = new Node(Token.EXPR_RESULT, Node.newNumber(5));
        cg.addNonEmptyStatement(exprNode, CodeGenerator.Context.OTHER, false);
        assertEquals("5;", consumer.getCode());
    }

    @Test
    public void testIsOneExactlyFunctionOrDoWithLabel() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node labelNameNode = Node.newString(Token.LABEL_NAME, "myLabel");
        Node funcNode = new Node(Token.FUNCTION);
        Node labeledFunc = new Node(Token.LABEL, labelNameNode, funcNode);
        assertTrue(cg.isOneExactlyFunctionOrDo(labeledFunc));

        Node doNode = new Node(Token.DO);
        Node labeledDo = new Node(Token.LABEL, labelNameNode, doNode);
        assertTrue(cg.isOneExactlyFunctionOrDo(labeledDo));
    }

    @Test
    public void testIsOneExactlyFunctionOrDoWithBlockChild() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node labelNameNode = Node.newString(Token.LABEL_NAME, "myLabel");
        Node stmtNode = new Node(Token.EXPR_RESULT, Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, stmtNode);
        Node labeledBlock = new Node(Token.LABEL, labelNameNode, blockNode);
        assertFalse(cg.isOneExactlyFunctionOrDo(labeledBlock));
    }

    @Test
    public void testAddLeftExprWithContext() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node inNode = new Node(Token.IN, Node.newString(Token.STRING, "a"), Node.newString(Token.STRING, "b"));
        cg.addExpr(inNode, 0, CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
        assertEquals("(a in b)", consumer.getCode());
    }

    @Test
    public void testAddExprWithContextNoIn() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node inNode = new Node(Token.IN, Node.newString(Token.STRING, "a"), Node.newString(Token.STRING, "b"));
        cg.addExpr(inNode, 0, CodeGenerator.Context.OTHER);
        assertEquals("a in b", consumer.getCode());
    }

    @Test
    public void testAddListWithArrayOrFunctionArgumentContext() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n1 = Node.newNumber(1);
        Node n2 = new Node(Token.ADD, Node.newNumber(2), Node.newNumber(3));
        n1.addChildAfter(n2, n1);
        cg.addList(n1, true, CodeGenerator.Context.OTHER);
        assertEquals("1,2+3", consumer.getCode());
    }

    @Test
    public void testAddArrayListWithEmptyEntries() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n1 = Node.newNumber(1);
        Node n2 = new Node(Token.EMPTY);
        Node n3 = Node.newNumber(3);
        n1.addChildAfter(n2, n1);
        n2.addChildAfter(n3, n2);
        cg.addArrayList(n1);
        assertEquals("1,,3", consumer.getCode());
    }

    @Test
    public void testAddArrayListTrailingEmpty() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n1 = Node.newNumber(1);
        Node n2 = new Node(Token.EMPTY);
        n1.addChildAfter(n2, n1);
        cg.addArrayList(n1);
        assertEquals("1,", consumer.getCode());
    }

    @Test
    public void testAddAllSiblingsWithMultipleNodes() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node n1 = new Node(Token.VAR, Node.newNumber(1));
        Node n2 = new Node(Token.VAR, Node.newNumber(2));
        n1.addChildAfter(n2, n1);
        cg.addAllSiblings(n1);
        assertEquals("var 1var 2", consumer.getCode());
    }

    @Test
    public void testAddJsStringNonAscii() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        cg.addJsString("你好");
        assertEquals("\"\\u4f60\\u597d\"", consumer.getCode());
    }

    @Test
    public void testJsStringOptimalQuote() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        assertEquals("'It\\'s a test'", cg.jsString("It's a test"));
        assertEquals("\"He said \\\"hello\\\"\"", cg.jsString("He said \"hello\""));
    }

    @Test
    public void testRegexpEscapeWithSpecialChars() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        Node regexpNode = new Node(Token.REGEXP, Node.newString(Token.STRING, "/[.*+?^${}()[\\]\\\\]/"), Node.newString(Token.STRING, "g"));
        cg.add(regexpNode);
        assertEquals("/[.*+?^${}()[\\]\\\\]/g", consumer.getCode());
    }

    @Test
    public void testStrEscapeBreakTags() {
        RecordingCodeConsumer consumer = new RecordingCodeConsumer();
        CodeGenerator cg = createCodeGenerator(consumer);
        String test1 = "a-->b";
        String result1 = cg.jsString(test1);
        assertEquals("'a--\\>b'", result1);

        String test2 = "a]]>b";
        String result2 = cg.jsString(test2);
        assertEquals("'a]]\\>b'", result2);

        String test3 = "</script>";
        String result3 = cg.jsString(test3);
        assertEquals("'<\\/script>'", result3);
    }
}
