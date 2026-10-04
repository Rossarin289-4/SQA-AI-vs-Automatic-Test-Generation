package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.rhino.IR;
import java.util.regex.Pattern;

public class CodeGeneratorTest {
    // Dummy CodeConsumer for testing
    private static class TestCodeConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();
        private char lastChar = 0;

        @Override
        public void startSourceMapping(Node node) {}
        @Override
        public void endSourceMapping(Node node) {}
        @Override
        public boolean continueProcessing() { return true; }
        @Override
        public char getLastChar() { return lastChar; }
        @Override
        public void append(String str) {
            sb.append(str);
            if (!str.isEmpty()) {
                lastChar = str.charAt(str.length() - 1);
            }
        }
        @Override
        public void appendBlockStart() { sb.append("{"); }
        @Override
        public void appendBlockEnd() { sb.append("}"); }
        @Override
        public void startNewLine() { sb.append("\n"); }
        @Override
        public void maybeLineBreak() { sb.append(" "); } // For simplicity, treat as space
        @Override
        public void maybeCutLine() { sb.append(" "); } // For simplicity, treat as space
        @Override
        public void endLine() { sb.append("\n"); }
        @Override
        public void notePreferredLineBreak() { sb.append(" "); } // For simplicity, treat as space
        @Override
        public void beginBlock() { sb.append("{"); }
        @Override
        public void endBlock() { sb.append("}"); }
        @Override
        public void endBlock(boolean shouldEndLine) { endBlock(); if (shouldEndLine) endLine(); }
        @Override
        public void listSeparator() { sb.append(","); }
        @Override
        public void endStatement() { sb.append(";"); }
        @Override
        public void endStatement(boolean needSemiColon) { if (needSemiColon) sb.append(";"); }
        @Override
        public void maybeEndStatement() { sb.append(";"); }
        @Override
        public void endFunction() { sb.append("}"); }
        @Override
        public void endFunction(boolean statementContext) { sb.append("}"); }
        @Override
        public void beginCaseBody() { sb.append("{"); }
        @Override
        public void endCaseBody() { sb.append("}"); }
        @Override
        public void add(String newcode) { append(newcode); }
        @Override
        public void appendOp(String op, boolean binOp) { sb.append(op); }
        @Override
        public void addOp(String op, boolean binOp) { sb.append(op); }
        @Override
        public void addNumber(double x) { sb.append(x); }
        @Override
        public void addConstant(String newcode) { sb.append(newcode); }
        @Override
        public boolean shouldPreserveExtraBlocks() { return false; }
        @Override
        public boolean breakAfterBlockFor(Node n, boolean statementContext) { return false; }
        @Override
        public void endFile() {}

        String getCode() {
            return sb.toString();
        }
    }

    private CodeGenerator createCodeGenerator(CodeConsumer consumer) {
        CompilerOptions options = new CompilerOptions();
        return new CodeGenerator(consumer, options);
    }

    private CodeGenerator createCodeGeneratorWithOptions(CodeConsumer consumer, CompilerOptions options) {
        return new CodeGenerator(consumer, options);
    }

    @Test
    public void testTagAsStrict() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.getCode());
    }

     @Test
    public void testAddNodeSimple() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.string("hello");
        generator.add(n);
        assertEquals("\"hello\"", consumer.getCode());
    }

    @Test
    public void testAddNodeNumber() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.number(123.45);
        generator.add(n);
        assertEquals("123.45", consumer.getCode());
    }

    @Test
    public void testAddNodeNumberBoundaryMax() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.number(Double.MAX_VALUE);
        generator.add(n);
        assertEquals(String.valueOf(Double.MAX_VALUE), consumer.getCode());
    }

    @Test
    public void testAddNodeNumberBoundaryMin() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.number(Double.MIN_VALUE);
        generator.add(n);
        assertEquals(String.valueOf(Double.MIN_VALUE), consumer.getCode());
    }

    @Test
    public void testAddNodeNumberZero() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.number(0.0);
        generator.add(n);
        assertEquals("0.0", consumer.getCode());
    }
    
    @Test
    public void testAddNodeNumberNegativeZero() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.number(-0.0);
        generator.add(n);
        assertEquals("-0.0", consumer.getCode());
    }

    @Test
    public void testAddNodeNull() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.nullNode();
        generator.add(n);
        assertEquals("null", consumer.getCode());
    }

    @Test
    public void testAddNodeThis() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.thisNode();
        generator.add(n);
        assertEquals("this", consumer.getCode());
    }

    @Test
    public void testAddNodeTrue() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.trueNode();
        generator.add(n);
        assertEquals("true", consumer.getCode());
    }

    @Test
    public void testAddNodeFalse() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.falseNode();
        generator.add(n);
        assertEquals("false", consumer.getCode());
    }

    @Test
    public void testAddNodeName() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.name("myVariable");
        generator.add(n);
        assertEquals("myVariable", consumer.getCode());
    }

    @Test
    public void testAddNodeNegation() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.neg(IR.number(5));
        generator.add(n);
        assertEquals("-5.0", consumer.getCode());
    }

    


    @Test
    public void testAddNodePositive() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.pos(IR.number(-5));
        generator.add(n);
        assertEquals("+ -5.0", consumer.getCode());
    }

    @Test
    public void testAddNodeNot() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.not(IR.trueNode());
        generator.add(n);
        assertEquals("!true", consumer.getCode());
    }

    @Test
    public void testAddNodeVoid() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.voidNode(IR.number(1));
        generator.add(n);
        assertEquals("void 1.0", consumer.getCode());
    }






    





    


    @Test
    public void testAddNodeFunctionDeclaration() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node fn = IR.function(IR.name("myFunc"), IR.paramList(), IR.block(IR.returnNode()));
        generator.add(fn, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc() {}", consumer.getCode());
    }
    
    @Test
    public void testAddNodeFunctionExpression() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block(IR.returnNode()));
        generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("function() {}", consumer.getCode());
    }
    
    @Test
    public void testAddNodeFunctionExpressionWithParens() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block(IR.returnNode()));
        generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("function() {}", consumer.getCode());
    }

    @Test
    public void testAddNodeVariableDeclaration() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.var(IR.name("myVar"), IR.number(10));
        generator.add(n);
        assertEquals("var myVar = 10.0", consumer.getCode());
    }

    @Test
    public void testAddNodeVariableDeclarationNoValue() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.var(IR.name("myVar"));
        generator.add(n);
        assertEquals("var myVar", consumer.getCode());
    }
    
    @Test
    public void testAddNodeVariableDeclarationMultiple() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.var(IR.name("a"), IR.number(1));
        Node next = IR.var(IR.name("b"), IR.number(2));
        n.addChildAfter(next.getFirstChild(), n.getFirstChild()); // Correct way to link nodes for a list
        generator.add(n);
        assertEquals("var a = 1.0,b = 2.0", consumer.getCode());
    }

    @Test
    public void testAddNodeArrayLiteralEmpty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.arraylit();
        generator.add(n);
        assertEquals("[]", consumer.getCode());
    }

    @Test
    public void testAddNodeArrayLiteralSingleElement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.arraylit(IR.number(1));
        generator.add(n);
        assertEquals("[1.0]", consumer.getCode());
    }

    @Test
    public void testAddNodeArrayLiteralMultipleElements() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.arraylit(IR.number(1), IR.string("two"), IR.trueNode());
        generator.add(n);
        assertEquals("[1.0,\"two\",true]", consumer.getCode());
    }
    
    @Test
    public void testAddNodeArrayLiteralWithEmptySlots() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.arraylit(IR.number(1), IR.empty(), IR.string("three"));
        generator.add(n);
        assertEquals("[1.0,,\"three\"]", consumer.getCode());
    }

    @Test
    public void testAddNodeArrayLiteralWithTrailingComma() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.arraylit(IR.number(1), IR.string("two"));
        Node lastElement = IR.empty(); // Representing a trailing empty slot
        n.addChildAfter(lastElement, n.getLastChild());
        generator.add(n);
        assertEquals("[1.0,\"two\",]", consumer.getCode());
    }

    @Test
    public void testAddNodeObjectLiteralEmpty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.objectlit();
        generator.add(n);
        assertEquals("{}", consumer.getCode());
    }




    


    @Test
    public void testAddNodeTryCatchFinally() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node tryBlock = IR.block(IR.returnNode());
        Node catchBlock = IR.catchNode(IR.name("e"), IR.block(IR.returnNode()));
        Node finallyBlock = IR.block(IR.returnNode());
        Node n = IR.tryFinally(tryBlock, finallyBlock);
        n.addChildAfter(catchBlock, tryBlock); // Manually add catch block
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("try{return;}catch(e){return;}finally{return;}", consumer.getCode());
    }

    @Test
    public void testAddNodeTryCatchNoFinally() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node tryBlock = IR.block(IR.returnNode());
        Node catchBlock = IR.catchNode(IR.name("e"), IR.block(IR.returnNode()));
        Node n = IR.tryCatch(tryBlock, catchBlock);
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("try{return;}catch(e){return;}", consumer.getCode());
    }
    


    @Test
    public void testAddNodeIfStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.ifNode(IR.trueNode(), IR.block(IR.returnNode()));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("if(true){return;}", consumer.getCode());
    }

    @Test
    public void testAddNodeIfElseStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.ifNode(IR.trueNode(), IR.block(IR.returnNode(IR.number(1))), IR.block(IR.returnNode(IR.number(2))));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("if(true){return 1.0}else{return 2.0}", consumer.getCode());
    }

    @Test
    public void testAddNodeIfElseStatementAmbiguous() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node ifBody = IR.ifNode(IR.falseNode(), IR.returnNode()); // Inner if
        Node elseBody = IR.returnNode(IR.number(1));
        Node n = IR.ifNode(IR.trueNode(), ifBody, elseBody);
        generator.add(n, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
        assertEquals("if(true){if(false){return;}}else{return 1.0}", consumer.getCode());
    }


    @Test
    public void testAddNodeDoLoop() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.doNode(IR.block(IR.returnNode()), IR.trueNode());
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("do{return;}while(true);", consumer.getCode());
    }


    @Test
    public void testAddNodeForInLoop() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.forIn(IR.var(IR.name("key"), null), IR.name("myObject"), IR.block(IR.returnNode()));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("for(var key in myObject){return;}", consumer.getCode());
    }


    @Test
    public void testAddNodeBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.breakNode();
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("break;", consumer.getCode());
    }

    @Test
    public void testAddNodeBreakWithLabel() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.breakNode(IR.labelName("myLabel"));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("break myLabel;", consumer.getCode());
    }

    @Test
    public void testAddNodeContinue() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.continueNode();
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("continue;", consumer.getCode());
    }

    @Test
    public void testAddNodeContinueWithLabel() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.continueNode(IR.labelName("myLabel"));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("continue myLabel;", consumer.getCode());
    }

    @Test
    public void testAddNodeThrow() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.throwNode(IR.string("error"));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("throw \"error\";", consumer.getCode());
    }


    @Test
    public void testAddNodeExpressionResult() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.exprResult(IR.call(IR.name("foo")));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("foo();", consumer.getCode());
    }

    @Test
    public void testAddNodeCommaOperator() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.comma(IR.number(1), IR.number(2));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("1.0,2.0", consumer.getCode());
    }

    @Test
    public void testAddNodeCommaOperatorNested() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.comma(IR.comma(IR.number(1), IR.number(2)), IR.number(3));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("1.0,2.0,3.0", consumer.getCode());
    }
    
    @Test
    public void testAddNodeAssignment() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.assign(IR.name("x"), IR.number(10));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("x = 10.0", consumer.getCode());
    }
    

    @Test
    public void testAddNodeGetProp() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.getprop(IR.name("obj"), IR.string("prop"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("obj.prop", consumer.getCode());
    }

    @Test
    public void testAddNodeGetPropKeyword() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.getprop(IR.name("obj"), IR.string("if")); // "if" is a keyword
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("obj.if", consumer.getCode());
    }

    @Test
    public void testAddNodeGetPropEncoded() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.getprop(IR.name("obj"), IR.string("if")); // "if" is a keyword
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("obj.if", consumer.getCode());
    }

    @Test
    public void testAddNodeGetElem() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.getelem(IR.name("obj"), IR.string("key"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("obj[\"key\"]", consumer.getCode());
    }

    @Test
    public void testAddNodeCallMethod() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.call(IR.getprop(IR.name("obj"), IR.string("method")), IR.number(1));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("obj.method(1.0)", consumer.getCode());
    }

    @Test
    public void testAddNodeCallMethodNoArgs() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.call(IR.getprop(IR.name("obj"), IR.string("method")));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("obj.method()", consumer.getCode());
    }





    @Test
    public void testAddNodeRegExpLiteral() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("a.b"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/a.b/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithFlags() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("a.b"), IR.string("gi"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/a.b/gi", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralEscapedSlash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("a/b"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/a\\/b/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithUnicodeEscape() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("\\u1234"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/\\\\u1234/", consumer.getCode());
    }
    
    @Test
    public void testAddNodeRegExpLiteralWithLineTerminator() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("a\nb"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/a\\n b/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithLessThanScriptTag() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("script"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/script/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithLessThanCommentStart() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("!--"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/<\\!--/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithGreaterThanScriptTagEnd() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("-->>"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/--\\x3e\\x3e/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithGreaterThanCommentEnd() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("]]>"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/]]\\x3e/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithEqualsSign() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("="));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/=/", consumer.getCode());
    }

    @Test
    public void testAddNodeRegExpLiteralWithAmpersand() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("&"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/&/", consumer.getCode());
    }

    @Test
    public void testAddNodeBlockEmpty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.block();
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("{}", consumer.getCode());
    }

    @Test
    public void testAddNodeBlockWithStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.block(IR.returnNode());
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("{return;}", consumer.getCode());
    }

    @Test
    public void testAddNodeBlockWithMultipleStatements() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.block(IR.returnNode(IR.number(1)), IR.returnNode(IR.number(2)));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("{return 1.0;return 2.0}", consumer.getCode());
    }

    @Test
    public void testAddNodeBlockWithVarStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.block(IR.var(IR.name("x"), IR.number(1)));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("{var x = 1.0;}", consumer.getCode());
    }



    @Test
    public void testAddNodeCaseStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.caseNode(IR.number(1), IR.block(IR.returnNode()));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("case 1.0:{return;}", consumer.getCode());
    }

    @Test
    public void testAddNodeDefaultCaseStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.defaultCase(IR.block(IR.returnNode()));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("default:{return;}", consumer.getCode());
    }

    @Test
    public void testAddNodeLabelStatement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.label(IR.labelName("myLabel"), IR.block(IR.returnNode()));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("myLabel:{return;}", consumer.getCode());
    }
    
    @Test
    public void testAddNodeLabelStatementWithBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.label(IR.labelName("myLabel"), IR.breakNode(IR.labelName("myLabel")));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("myLabel:break myLabel;", consumer.getCode());
    }


    



    



    


    



    
    






    @Test
    public void testAddNodeStringWithPreferSingleQuotesTrue() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setPreferSingleQuotes(true);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("value with \"quotes\"");
        generator.add(n);
        assertEquals("'value with \"quotes\"'", consumer.getCode());
    }
    
    @Test
    public void testAddNodeStringWithPreferSingleQuotesFalse() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setPreferSingleQuotes(false); // Default is false
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("value with 'quotes'");
        generator.add(n);
        assertEquals("\"value with 'quotes'\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithSpecialChars() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.string("abc\ndef");
        generator.add(n);
        assertEquals("\"abc\\ndef\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithUnicodeChar() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.string("\u0001"); // Start of Heading
        generator.add(n);
        assertEquals("\"\\x01\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithUnicodeCharSlashV() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.string("\u000B"); // Vertical Tab
        n.putBooleanProp(Node.SLASH_V, true); // Force \v escape
        generator.add(n);
        assertEquals("\"\\v\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithLineTerminators() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.string("\u2028\u2029"); // Line Separator, Paragraph Separator
        generator.add(n);
        assertEquals("\"\\u2028\\u2029\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithTrustedStringFalse() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(false);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("<script>");
        generator.add(n);
        assertEquals("\"\\x3cscript\\x3e\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithTrustedStringTrue() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(true);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("<script>");
        generator.add(n);
        assertEquals("\"<script>\"", consumer.getCode());
    }
    
    @Test
    public void testAddNodeStringWithTrustedStringFalseAmpersand() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(false);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("&");
        generator.add(n);
        assertEquals("\"\\x26\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithTrustedStringTrueAmpersand() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(true);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("&");
        generator.add(n);
        assertEquals("\"&\"", consumer.getCode());
    }
    
    @Test
    public void testAddNodeStringWithTrustedStringFalseGreaterThan() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(false);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string(">>");
        generator.add(n);
        assertEquals("\"--\\x3e\\x3e\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithTrustedStringTrueGreaterThan() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(true);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string(">>");
        generator.add(n);
        assertEquals("\">>\"", consumer.getCode());
    }
    
    @Test
    public void testAddNodeStringWithTrustedStringFalseLessThan() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(false);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("</script>");
        generator.add(n);
        assertEquals("\"\\x3c/script\\x3e\"", consumer.getCode());
    }
    
    @Test
    public void testAddNodeStringWithTrustedStringTrueLessThan() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(true);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("</script>");
        generator.add(n);
        assertEquals("\"</script>\"", consumer.getCode());
    }
    
    @Test
    public void testAddNodeStringWithTrustedStringFalseLessThanComment() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(false);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("<!--");
        generator.add(n);
        assertEquals("\"\\x3c!--\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithTrustedStringTrueLessThanComment() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(true);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        Node n = IR.string("<!--");
        generator.add(n);
        assertEquals("\"<!--\"", consumer.getCode());
    }

    @Test
    public void testAddNodeStringWithUnicodeNonAscii() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.string("你好"); // Chinese characters
        generator.add(n);
        assertEquals("\"\\u4f60\\u597d\"", consumer.getCode());
    }


    
    @Test
    public void testAddNodeRegExpLiteralRequiresParens() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.regexp(IR.string("a"));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("/a/", consumer.getCode());
    }

    @Test
    public void testAddNodeScript() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.script(IR.add(IR.number(1), IR.number(2)));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("1.0 + 2.0", consumer.getCode());
    }

    @Test
    public void testAddNodeScriptWithMultipleStatements() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.script(
            IR.var(IR.name("a"), IR.number(1)),
            IR.add(IR.name("a"), IR.number(2))
        );
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("var a = 1.0;\na + 2.0", consumer.getCode());
    }
    
    @Test
    public void testAddNodeScriptWithFunctionDeclaration() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node fn = IR.function(IR.name("myFunc"), IR.paramList(), IR.block(IR.returnNode()));
        Node n = IR.script(fn, IR.exprResult(IR.call(IR.name("myFunc"))));
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc() {}\nmyFunc()", consumer.getCode());
    }

    @Test
    public void testAddNodeScriptWithVARAndLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.script(
            IR.var(IR.name("a"), IR.number(1)),
            IR.exprResult(IR.call(IR.name("foo")))
        );
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("var a = 1.0;\nfoo()", consumer.getCode());
    }

    @Test
    public void testAddNodeBlockWithVARAndLineBreak() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.block(
            IR.var(IR.name("a"), IR.number(1))
        );
        generator.add(n, CodeGenerator.Context.STATEMENT);
        assertEquals("{var a = 1.0;}", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorADD() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.add(IR.number(1), IR.number(2));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("1.0 + 2.0", consumer.getCode());
    }

    @Test
    public void testAddNodeBinaryOperatorSUB() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.sub(IR.number(3), IR.number(1));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("3.0 - 1.0", consumer.getCode());
    }






















    @Test
    public void testAddNodeHook() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.hook(IR.trueNode(), IR.number(1), IR.number(2));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("true ? 1.0 : 2.0", consumer.getCode());
    }
    
    @Test
    public void testAddNodeHookNested() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.hook(IR.trueNode(), IR.hook(IR.falseNode(), IR.number(1), IR.number(2)), IR.number(3));
        generator.add(n, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("true ? (false ? 1.0 : 2.0) : 3.0", consumer.getCode());
    }




    








    
    


    

    

    

    @Test
    public void testAddListEmpty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        generator.addList((Node) null);
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testAddListSingleElement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        generator.addList(IR.number(1));
        assertEquals("1.0", consumer.getCode());
    }



    @Test
    public void testAddArrayListEmpty() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        generator.addArrayList(null);
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testAddArrayListSingleElement() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        generator.addArrayList(IR.number(1));
        assertEquals("1.0", consumer.getCode());
    }




    @Test
    public void testAddCaseBody() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        Node n = IR.block(IR.returnNode());
        generator.addCaseBody(n);
        assertEquals("{return;}", consumer.getCode());
    }













    @Test
    public void testRegexpEscapeSimple() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("abc");
        assertEquals("/abc/", escaped);
    }

    @Test
    public void testRegexpEscapeForwardSlash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("a/b");
        assertEquals("/a\\/b/", escaped);
    }

    @Test
    public void testRegexpEscapeSpecialChars() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("a.b*c+d?e^f$g|h(i)j[k]l{m}");
        assertEquals("/a\\.b\\*c\\+d\\?e\\^f\\$g\\|h\\(i\\)j\\[k\\]\\{m\\}/", escaped);
    }

    @Test
    public void testRegexpEscapeUnicode() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("你好");
        assertEquals("/\\u4f60\\u597d/", escaped);
    }
    
    @Test
    public void testRegexpEscapeLessThanScriptTag() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("</script>");
        assertEquals("/<\\/script>/", escaped);
    }
    
    @Test
    public void testRegexpEscapeLessThanCommentStart() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("<!--");
        assertEquals("/<\\!--/", escaped);
    }
    
    @Test
    public void testRegexpEscapeGreaterThanScriptTagEnd() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("-->>");
        assertEquals("/--\\x3e\\x3e/", escaped);
    }

    @Test
    public void testRegexpEscapeGreaterThanCommentEnd() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("]]>");
        assertEquals("/]]\\x3e/", escaped);
    }

    @Test
    public void testRegexpEscapeEqualsSign() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("=");
        assertEquals("/=/", escaped);
    }

    @Test
    public void testRegexpEscapeAmpersand() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.regexpEscape("&");
        assertEquals("/&/", escaped);
    }




    @Test
    public void testStrEscapeWithBackslash() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.strEscape("a\\b", '"', "\\\"", "'", "\\\\", null, false, false);
        assertEquals("\"a\\\\b\"", escaped);
    }

    @Test
    public void testStrEscapeWithNewline() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.strEscape("a\nb", '"', "\\\"", "'", "\\\\", null, false, false);
        assertEquals("\"a\\nb\"", escaped);
    }

    @Test
    public void testStrEscapeWithUnicode() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.strEscape("你好", '"', "\\\"", "'", "\\\\", null, false, false);
        assertEquals("\"\\u4f60\\u597d\"", escaped);
    }

    @Test
    public void testStrEscapeWithTrustedStringFalseLessThan() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(false);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        String escaped = generator.strEscape("<script>", '"', "\\\"", "'", "\\\\", null, false, false);
        assertEquals("\"\\x3cscript\\x3e\"", escaped);
    }
    
    @Test
    public void testStrEscapeWithTrustedStringTrueLessThan() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CompilerOptions options = new CompilerOptions();
        options.setTrustedStrings(true);
        CodeGenerator generator = createCodeGeneratorWithOptions(consumer, options);
        String escaped = generator.strEscape("<script>", '"', "\\\"", "'", "\\\\", null, false, false);
        assertEquals("\"<script>\"", escaped);
    }

    @Test
    public void testIdentifierEscapeSimple() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.identifierEscape("myVar");
        assertEquals("myVar", escaped);
    }

    @Test
    public void testIdentifierEscapeKeyword() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.identifierEscape("var"); // 'var' is a keyword
        assertEquals("var", escaped);
    }

    @Test
    public void testIdentifierEscapeUnicode() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.identifierEscape("你好"); // Chinese characters
        assertEquals("\\u4f60\\u597d", escaped);
    }

    @Test
    public void testIdentifierEscapeWithSpecialChars() throws Exception {
        TestCodeConsumer consumer = new TestCodeConsumer();
        CodeGenerator generator = createCodeGenerator(consumer);
        String escaped = generator.identifierEscape("a-b"); // '-' is not a valid JS identifier char
        assertEquals("a\\x2db", escaped);
    }

    @Test
    public void testGetNonEmptyChildCountEmptyBlock() {
        Node n = IR.block();
        assertEquals(0, CodeGenerator.getNonEmptyChildCount(n, 10));
    }

    @Test
    public void testGetNonEmptyChildCountWithEmptyNodes() {
        Node n = IR.block(IR.empty(), IR.returnNode(), IR.empty());
        assertEquals(1, CodeGenerator.getNonEmptyChildCount(n, 10));
    }

    @Test
    public void testGetNonEmptyChildCountWithNestedBlocks() {
        Node n = IR.block(IR.block(IR.returnNode()), IR.empty());
        assertEquals(1, CodeGenerator.getNonEmptyChildCount(n, 10));
    }
    
    @Test
    public void testGetNonEmptyChildCountMaxCount() {
        Node n = IR.block(IR.returnNode(), IR.returnNode(), IR.returnNode());
        assertEquals(2, CodeGenerator.getNonEmptyChildCount(n, 2));
    }

    @Test
    public void testGetFirstNonEmptyChildEmptyBlock() {
        Node n = IR.block();
        assertNull(CodeGenerator.getFirstNonEmptyChild(n));
    }

    @Test
    public void testGetFirstNonEmptyChildWithEmptyNodes() {
        Node n = IR.block(IR.empty(), IR.returnNode(), IR.empty());
        assertEquals(Token.RETURN, CodeGenerator.getFirstNonEmptyChild(n).getType());
    }

    @Test
    public void testGetFirstNonEmptyChildWithNestedBlocks() {
        Node n = IR.block(IR.block(IR.returnNode()), IR.empty());
        assertEquals(Token.RETURN, CodeGenerator.getFirstNonEmptyChild(n).getType());
    }

    @Test
    public void testGetFirstNonEmptyChildWithNestedEmptyBlocks() {
        Node n = IR.block(IR.block(IR.empty()), IR.returnNode());
        assertEquals(Token.RETURN, CodeGenerator.getFirstNonEmptyChild(n).getType());
    }

    @Test
    public void testAppendHexJavaScriptRepresentationSimple() throws IOException {
        StringBuilder sb = new StringBuilder();
        CodeGenerator.appendHexJavaScriptRepresentation(sb, 'A');
        assertEquals("\\u0041", sb.toString());
    }

    @Test
    public void testAppendHexJavaScriptRepresentationSpecialChar() throws IOException {
        StringBuilder sb = new StringBuilder();
        CodeGenerator.appendHexJavaScriptRepresentation(sb, '\u2028'); // Line Separator
        assertEquals("\\u2028", sb.toString());
    }

    @Test
    public void testAppendHexJavaScriptRepresentationSupplementaryCodePoint() throws IOException {
        StringBuilder sb = new StringBuilder();
        CodeGenerator.appendHexJavaScriptRepresentation(sb, 0x1F4A9);
        assertEquals("\\uD83D\\uDCA9", sb.toString());
    }

    @Test
    public void testIsIndirectEvalTrue() {
        Node n = IR.name("eval");
        n.putBooleanProp(Node.DIRECT_EVAL, false);
        assertTrue(CodeGenerator.isIndirectEval(n));
    }

    @Test
    public void testIsIndirectEvalFalseDirect() {
        Node n = IR.name("eval");
        n.putBooleanProp(Node.DIRECT_EVAL, true);
        assertFalse(CodeGenerator.isIndirectEval(n));
    }

    @Test
    public void testIsIndirectEvalFalseName() {
        Node n = IR.name("other");
        n.putBooleanProp(Node.DIRECT_EVAL, false);
        assertFalse(CodeGenerator.isIndirectEval(n));
    }
}





