```java
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

public class CodeGeneratorTest {

    // Mock CodeConsumer to capture output
    private static class MockCodeConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();
        StringBuilder line = new StringBuilder();
        int indent = 0;
        boolean newLine = true;

        @Override
        void startSourceMapping(Node node) {}
        @Override
        void endSourceMapping(Node node) {}
        @Override
        boolean continueProcessing() { return true; }
        @Override
        char getLastChar() { return sb.length() > 0 ? sb.charAt(sb.length() - 1) : 0; }
        @Override
        void append(String str) {
            if (newLine) {
                for (int i = 0; i < indent; i++) sb.append("  ");
                newLine = false;
            }
            sb.append(str);
        }
        @Override
        void appendBlockStart() {
            append("{");
            indent++;
            newLine = true;
        }
        @Override
        void appendBlockEnd() {
            indent--;
            append("}");
            newLine = true;
        }
        @Override
        void startNewLine() {
            sb.append("\n");
            newLine = true;
        }
        @Override
        void maybeLineBreak() { startNewLine(); }
        @Override
        void maybeCutLine() { startNewLine(); }
        @Override
        void endLine() { startNewLine(); }
        @Override
        void notePreferredLineBreak() { startNewLine(); }
        @Override
        void beginBlock() { appendBlockStart(); }
        @Override
        void endBlock() { appendBlockEnd(); }
        @Override
        void endBlock(boolean shouldEndLine) {
            endBlock();
            if (shouldEndLine) endLine();
        }
        @Override
        void listSeparator() { append(","); }
        @Override
        void endStatement() { endStatement(false); }
        @Override
        void endStatement(boolean needSemiColon) {
            if (needSemiColon) append(";");
            startNewLine();
        }
        @Override
        void maybeEndStatement() {
            if (!newLine) endStatement();
        }
        @Override
        void endFunction() { endFunction(false); }
        @Override
        void endFunction(boolean statementContext) {
            if (statementContext) endStatement();
            else startNewLine();
        }
        @Override
        void beginCaseBody() {
            indent++;
            newLine = true;
        }
        @Override
        void endCaseBody() {
            indent--;
            startNewLine();
        }
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
        boolean shouldPreserveExtraBlocks() { return true; }
        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) { return true; }
        @Override
        void endFile() {
            startNewLine();
        }

        String getContent() {
            return sb.toString();
        }
    }

    private MockCodeConsumer consumer = new MockCodeConsumer();
    private CodeGenerator codeGenerator;

    private void setup(CompilerOptions options) {
        codeGenerator = new CodeGenerator(consumer, options);
        consumer = new MockCodeConsumer(); // Reset consumer for each test
        codeGenerator = new CodeGenerator(consumer, options);
    }

    private void setup() {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageOut(LanguageMode.ECMASCRIPT5);
        setup(options);
    }

    @Test
    public void testTagAsStrict() throws Exception {
        setup();
        codeGenerator.tagAsStrict();
        assertEquals("'use strict';", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBlock() throws Exception {
        setup();
        Node block = Node.newString(Token.BLOCK, "content"); // Node.newString is not a valid constructor for Block
        block = new Node(Token.BLOCK); // Correct way to create an empty block
        block.addChildToBack(Node.newString("content")); // Add content to the block
        codeGenerator.add(block);
        assertEquals("content", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeEmptyBlock() throws Exception {
        setup();
        Node block = new Node(Token.BLOCK);
        codeGenerator.add(block);
        assertEquals("", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeVarDecl() throws Exception {
        setup();
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME); // Correct constructor for NAME
        nameNode.setString("myVar"); // Set the name as a string
        varNode.addChildToBack(nameNode);
        codeGenerator.add(varNode);
        assertEquals("var myVar;", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeVarDeclWithAssignment() throws Exception {
        setup();
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME); // Correct constructor for NAME
        nameNode.setString("myVar"); // Set the name as a string
        nameNode.addChildToBack(Node.newNumber(5)); // Assignment is handled by NAME node in this context
        varNode.addChildToBack(nameNode);
        codeGenerator.add(varNode);
        assertEquals("var myVar = 5.0;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeNumberLiteral() throws Exception {
        setup();
        Node numberNode = Node.newNumber(123.45);
        codeGenerator.add(numberNode);
        assertEquals("123.45", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeNumberLiteralZero() throws Exception {
        setup();
        Node numberNode = Node.newNumber(0);
        codeGenerator.add(numberNode);
        assertEquals("0.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeNumberLiteralNegative() throws Exception {
        setup();
        Node numberNode = Node.newNumber(-99.5);
        codeGenerator.add(numberNode);
        assertEquals("-99.5", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeStringLiteral() throws Exception {
        setup();
        Node stringNode = Node.newString("hello world");
        codeGenerator.add(stringNode);
        assertEquals("\"hello world\"", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeStringLiteralWithQuotes() throws Exception {
        setup();
        Node stringNode = Node.newString("he said \"hi\"");
        codeGenerator.add(stringNode);
        assertEquals("\"he said \\\"hi\\\"\"", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeStringLiteralWithSingleQuotes() throws Exception {
        setup();
        CompilerOptions options = new CompilerOptions();
        options.preferSingleQuotes = true;
        setup(options);
        Node stringNode = Node.newString("He said 'hello'");
        codeGenerator.add(stringNode);
        assertEquals("'He said \\'hello\\''", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBooleanLiteralTrue() throws Exception {
        setup();
        Node trueNode = Node.newBoolean(true);
        codeGenerator.add(trueNode);
        assertEquals("true", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBooleanLiteralFalse() throws Exception {
        setup();
        Node falseNode = Node.newBoolean(false);
        codeGenerator.add(falseNode);
        assertEquals("false", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeNullLiteral() throws Exception {
        setup();
        Node nullNode = new Node(Token.NULL);
        codeGenerator.add(nullNode);
        assertEquals("null", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeThis() throws Exception {
        setup();
        Node thisNode = new Node(Token.THIS);
        codeGenerator.add(thisNode);
        assertEquals("this", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeArrayLit() throws Exception {
        setup();
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToBack(Node.newNumber(1));
        arrayNode.addChildToBack(Node.newNumber(2));
        codeGenerator.add(arrayNode);
        assertEquals("[1.0, 2.0]", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeArrayLitEmpty() throws Exception {
        setup();
        Node arrayNode = new Node(Token.ARRAYLIT);
        codeGenerator.add(arrayNode);
        assertEquals("[]", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeArrayLitWithEmptySlot() throws Exception {
        setup();
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToBack(Node.newNumber(1));
        arrayNode.addChildToBack(new Node(Token.EMPTY)); // Represents an empty slot
        arrayNode.addChildToBack(Node.newNumber(3));
        codeGenerator.add(arrayNode);
        assertEquals("[1.0,, 3.0]", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeObjectLit() throws Exception {
        setup();
        Node objectNode = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING_KEY, "prop1");
        key1.addChildToBack(Node.newNumber(10));
        objectNode.addChildToBack(key1);

        Node key2 = Node.newString(Token.STRING_KEY, "prop2");
        key2.addChildToBack(Node.newString("value2"));
        objectNode.addChildToBack(key2);
        
        codeGenerator.add(objectNode);
        assertEquals("{prop1:10.0,prop2:\"value2\"}", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeObjectLitEmpty() throws Exception {
        setup();
        Node objectNode = new Node(Token.OBJECTLIT);
        codeGenerator.add(objectNode);
        assertEquals("{}", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeObjectLitWithNumberKey() throws Exception {
        setup();
        Node objectNode = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING_KEY, "123");
        key1.addChildToBack(Node.newNumber(10));
        objectNode.addChildToBack(key1);
        
        codeGenerator.add(objectNode);
        assertEquals("{123:10.0}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpAdd() throws Exception {
        setup();
        Node addNode = new Node(Token.ADD, Node.newNumber(5), Node.newNumber(3));
        codeGenerator.add(addNode);
        assertEquals("5.0 + 3.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeBinaryOpSubtract() throws Exception {
        setup();
        Node subNode = new Node(Token.SUB, Node.newNumber(10), Node.newNumber(2));
        codeGenerator.add(subNode);
        assertEquals("10.0 - 2.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpMultiply() throws Exception {
        setup();
        Node mulNode = new Node(Token.MUL, Node.newNumber(4), Node.newNumber(6));
        codeGenerator.add(mulNode);
        assertEquals("4.0 * 6.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpDivide() throws Exception {
        setup();
        Node divNode = new Node(Token.DIV, Node.newNumber(20), Node.newNumber(5));
        codeGenerator.add(divNode);
        assertEquals("20.0 / 5.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeBinaryOpModulo() throws Exception {
        setup();
        Node modNode = new Node(Token.MOD, Node.newNumber(10), Node.newNumber(3));
        codeGenerator.add(modNode);
        assertEquals("10.0 % 3.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpEquality() throws Exception {
        setup();
        Node eqNode = new Node(Token.EQ, Node.newNumber(5), Node.newNumber(5));
        codeGenerator.add(eqNode);
        assertEquals("5.0 == 5.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeBinaryOpStrictEquality() throws Exception {
        setup();
        Node seqNode = new Node(Token.SHEQ, Node.newNumber(5), Node.newNumber(5));
        codeGenerator.add(seqNode);
        assertEquals("5.0 === 5.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpLessThan() throws Exception {
        setup();
        Node ltNode = new Node(Token.LT, Node.newNumber(5), Node.newNumber(10));
        codeGenerator.add(ltNode);
        assertEquals("5.0 < 10.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpGreaterThan() throws Exception {
        setup();
        Node gtNode = new Node(Token.GT, Node.newNumber(10), Node.newNumber(5));
        codeGenerator.add(gtNode);
        assertEquals("10.0 > 5.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpLogicalOr() throws Exception {
        setup();
        Node orNode = new Node(Token.OR, Node.newNumber(1), Node.newNumber(0)); // Use numbers for boolean context
        codeGenerator.add(orNode);
        assertEquals("1.0 || 0.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpLogicalAnd() throws Exception {
        setup();
        Node andNode = new Node(Token.AND, Node.newNumber(1), Node.newNumber(0)); // Use numbers for boolean context
        codeGenerator.add(andNode);
        assertEquals("1.0 && 0.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpComma() throws Exception {
        setup();
        Node commaNode = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
        codeGenerator.add(commaNode);
        assertEquals("1.0, 2.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeUnaryOpNot() throws Exception {
        setup();
        Node notNode = new Node(Token.NOT, Node.newNumber(0)); // Use 0 for false
        codeGenerator.add(notNode);
        assertEquals("!0.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeUnaryOpBitNot() throws Exception {
        setup();
        Node bitNotNode = new Node(Token.BITNOT, Node.newNumber(5));
        codeGenerator.add(bitNotNode);
        assertEquals("~5.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeUnaryOpPos() throws Exception {
        setup();
        Node posNode = new Node(Token.POS, Node.newNumber(-5));
        codeGenerator.add(posNode);
        assertEquals("+ -5.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeUnaryOpNeg() throws Exception {
        setup();
        Node negNode = new Node(Token.NEG, Node.newNumber(5));
        codeGenerator.add(negNode);
        assertEquals("-5.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeUnaryOpNegDoubleNegative() throws Exception {
        setup();
        // Rhino parses "- -2" as "2", so CodeGenerator should handle this.
        Node negNode = new Node(Token.NEG, Node.newNumber(-2.0));
        codeGenerator.add(negNode);
        assertEquals("2.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeTypeOf() throws Exception {
        setup();
        Node typeofNode = new Node(Token.TYPEOF, Node.newString("hello"));
        codeGenerator.add(typeofNode);
        assertEquals("typeof \"hello\"", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeVoid() throws Exception {
        setup();
        Node voidNode = new Node(Token.VOID, Node.newNumber(1));
        codeGenerator.add(voidNode);
        assertEquals("void 1.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeAssign() throws Exception {
        setup();
        Node assignNode = new Node(Token.ASSIGN,
                                   new Node(Token.NAME, "x"), // Correct constructor for NAME
                                   Node.newNumber(10));
        codeGenerator.add(assignNode);
        assertEquals("x = 10.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeCall() throws Exception {
        setup();
        Node callNode = new Node(Token.CALL, Node.newString("foo"));
        callNode.addChildToBack(Node.newNumber(1));
        callNode.addChildToBack(Node.newNumber(2));
        codeGenerator.add(callNode);
        assertEquals("foo(1.0, 2.0)", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeCallNoArgs() throws Exception {
        setup();
        Node callNode = new Node(Token.CALL, Node.newString("bar"));
        codeGenerator.add(callNode);
        assertEquals("bar()", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeNew() throws Exception {
        setup();
        Node newNode = new Node(Token.NEW, Node.newString("MyClass"));
        newNode.addChildToBack(Node.newNumber(10));
        codeGenerator.add(newNode);
        assertEquals("new MyClass(10.0)", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeNewNoArgs() throws Exception {
        setup();
        Node newNode = new Node(Token.NEW, Node.newString("MyClass"));
        codeGenerator.add(newNode);
        assertEquals("new MyClass()", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeIfStatement() throws Exception {
        setup();
        Node ifNode = new Node(Token.IF,
                               Node.newNumber(1), // Use number for true
                               Node.newString("then_block"));
        codeGenerator.add(ifNode);
        assertEquals("if(1.0) then_block", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeIfElseStatement() throws Exception {
        setup();
        Node ifNode = new Node(Token.IF,
                               Node.newNumber(1), // Use number for true
                               Node.newString("then_block"),
                               Node.newString("else_block"));
        codeGenerator.add(ifNode);
        assertEquals("if(1.0) then_block else else_block", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeIfElseStatementWithBlocks() throws Exception {
        setup();
        Node thenBlock = new Node(Token.BLOCK);
        thenBlock.addChildToBack(Node.newString("statement1"));
        Node elseBlock = new Node(Token.BLOCK);
        elseBlock.addChildToBack(Node.newString("statement2"));
        
        Node ifNode = new Node(Token.IF,
                               Node.newNumber(1), // Use number for true
                               thenBlock,
                               elseBlock);
        codeGenerator.add(ifNode);
        assertEquals("if(1.0) {\n  statement1\n}\nelse {\n  statement2\n}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeWhileLoop() throws Exception {
        setup();
        Node whileNode = new Node(Token.WHILE,
                                  Node.newNumber(1), // Use number for true
                                  Node.newString("body"));
        codeGenerator.add(whileNode);
        assertEquals("while(1.0) body", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeDoLoop() throws Exception {
        setup();
        Node doNode = new Node(Token.DO,
                               Node.newString("body"),
                               Node.newNumber(1)); // Use number for true
        codeGenerator.add(doNode);
        assertEquals("do body while(1.0);", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeForLoop() throws Exception {
        setup();
        Node forNode = new Node(Token.FOR,
                                Node.newVar("i", Node.newNumber(0)), // Corrected newVar usage
                                Node.newNumber(5), // Condition
                                Node.newString("increment"), // Increment
                                Node.newString("body")); // Body
        codeGenerator.add(forNode);
        assertEquals("for(var i = 0.0;5.0;increment) body", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeForLoopIn() throws Exception {
        setup();
        Node forInNode = new Node(Token.FOR,
                                  Node.newVar("key"), // Corrected newVar usage
                                  Node.newString("collection"), // Collection
                                  Node.newString("body")); // Body
        codeGenerator.add(forInNode);
        assertEquals("for(var key in collection) body", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeTryCatchFinally() throws Exception {
        setup();
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(Node.newString("try_stmt"));
        tryNode.addChildToBack(block);

        Node catchNode = new Node(Token.CATCH);
        catchNode.addChildToBack(Node.newString("e")); // Exception param
        Node catchBlock = new Node(Token.BLOCK);
        catchBlock.addChildToBack(Node.newString("catch_stmt"));
        catchNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(catchNode);

        Node finallyBlock = new Node(Token.BLOCK);
        finallyBlock.addChildToBack(Node.newString("finally_stmt"));
        tryNode.addChildToBack(finallyBlock);

        codeGenerator.add(tryNode);
        assertEquals("try {\n  try_stmt\n} catch(e) {\n  catch_stmt\n} finally {\n  finally_stmt\n}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeTryCatch() throws Exception {
        setup();
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(Node.newString("try_stmt"));
        tryNode.addChildToBack(block);

        Node catchNode = new Node(Token.CATCH);
        catchNode.addChildToBack(Node.newString("e")); // Exception param
        Node catchBlock = new Node(Token.BLOCK);
        catchBlock.addChildToBack(Node.newString("catch_stmt"));
        catchNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(catchNode);
        
        // No finally block

        codeGenerator.add(tryNode);
        assertEquals("try {\n  try_stmt\n} catch(e) {\n  catch_stmt\n}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeTryFinally() throws Exception {
        setup();
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(Node.newString("try_stmt"));
        tryNode.addChildToBack(block);
        
        // No catch block

        Node finallyBlock = new Node(Token.BLOCK);
        finallyBlock.addChildToBack(Node.newString("finally_stmt"));
        tryNode.addChildToBack(finallyBlock);

        codeGenerator.add(tryNode);
        assertEquals("try {\n  try_stmt\n} finally {\n  finally_stmt\n}", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeThrowStatement() throws Exception {
        setup();
        Node throwNode = new Node(Token.THROW, Node.newString("Error"));
        codeGenerator.add(throwNode);
        assertEquals("throw \"Error\";", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeReturnStatement() throws Exception {
        setup();
        Node returnNode = new Node(Token.RETURN, Node.newNumber(42));
        codeGenerator.add(returnNode);
        assertEquals("return 42.0;", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeReturnStatementNoValue() throws Exception {
        setup();
        Node returnNode = new Node(Token.RETURN);
        codeGenerator.add(returnNode);
        assertEquals("return;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBreakStatement() throws Exception {
        setup();
        Node breakNode = new Node(Token.BREAK);
        codeGenerator.add(breakNode);
        assertEquals("break;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBreakStatementWithLabel() throws Exception {
        setup();
        Node labelNode = new Node(Token.LABEL_NAME, "myLabel");
        Node breakNode = new Node(Token.BREAK, labelNode);
        codeGenerator.add(breakNode);
        assertEquals("break myLabel;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeContinueStatement() throws Exception {
        setup();
        Node continueNode = new Node(Token.CONTINUE);
        codeGenerator.add(continueNode);
        assertEquals("continue;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeContinueStatementWithLabel() throws Exception {
        setup();
        Node labelNode = new Node(Token.LABEL_NAME, "myLabel");
        Node continueNode = new Node(Token.CONTINUE, labelNode);
        codeGenerator.add(continueNode);
        assertEquals("continue myLabel;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeWithStatement() throws Exception {
        setup();
        Node withNode = new Node(Token.WITH,
                                 Node.newString("obj"),
                                 Node.newString("body"));
        codeGenerator.add(withNode);
        assertEquals("with(obj) body", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeExpressionResult() throws Exception {
        setup();
        Node exprResultNode = new Node(Token.EXPR_RESULT, Node.newNumber(10));
        codeGenerator.add(exprResultNode);
        assertEquals("10.0;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeGetProp() throws Exception {
        setup();
        Node getPropNode = new Node(Token.GETPROP,
                                    Node.newString("obj"),
                                    Node.newString("prop"));
        codeGenerator.add(getPropNode);
        assertEquals("obj.prop", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeGetElem() throws Exception {
        setup();
        Node getElemNode = new Node(Token.GETELEM,
                                    Node.newString("arr"),
                                    Node.newNumber(0));
        codeGenerator.add(getElemNode);
        assertEquals("arr[0.0]", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeGetPropWithNumberObject() throws Exception {
        setup();
        Node getPropNode = new Node(Token.GETPROP,
                                    Node.newNumber(123), // A number treated as object
                                    Node.newString("toString"));
        codeGenerator.add(getPropNode);
        assertEquals("(123.0).toString", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeIncPre() throws Exception {
        setup();
        Node incNode = new Node(Token.INC, Node.newString("x"));
        incNode.putIntProp(Node.INCRDECR_PROP, 0); // Pre-increment
        codeGenerator.add(incNode);
        assertEquals("++x", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeIncPost() throws Exception {
        setup();
        Node incNode = new Node(Token.INC, Node.newString("x"));
        incNode.putIntProp(Node.INCRDECR_PROP, Node.POST_FLAG); // Post-increment
        codeGenerator.add(incNode);
        assertEquals("x++", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeDecPre() throws Exception {
        setup();
        Node decNode = new Node(Token.DEC, Node.newString("y"));
        decNode.putIntProp(Node.INCRDECR_PROP, 0); // Pre-decrement
        codeGenerator.add(decNode);
        assertEquals("--y", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeDecPost() throws Exception {
        setup();
        Node decNode = new Node(Token.DEC, Node.newString("y"));
        decNode.putIntProp(Node.INCRDECR_PROP, Node.POST_FLAG); // Post-decrement
        codeGenerator.add(decNode);
        assertEquals("y--", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeFunctionDeclaration() throws Exception {
        setup();
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(Node.newString("myFunc")); // Name
        Node paramList = new Node(Token.PARAM_LIST);
        paramList.addChildToBack(Node.newString("a"));
        paramList.addChildToBack(Node.newString("b"));
        functionNode.addChildToBack(paramList); // Params
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newString("return a + b;"));
        functionNode.addChildToBack(body); // Body

        codeGenerator.add(functionNode, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc(a, b) {\n  return a + b;\n}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeFunctionExpression() throws Exception {
        setup();
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(Node.newString("")); // Anonymous function
        Node paramList = new Node(Token.PARAM_LIST);
        paramList.addChildToBack(Node.newString("x"));
        functionNode.addChildToBack(paramList); // Params
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newString("return x * 2;"));
        functionNode.addChildToBack(body); // Body

        // Context.START_OF_EXPR forces parens around function expression
        codeGenerator.add(functionNode, CodeGenerator.Context.START_OF_EXPR);
        assertEquals("(function(x) {\n  return x * 2;\n})", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeGetterDef() throws Exception {
        setup();
        Node getterDefNode = new Node(Token.GETTER_DEF); // Getter definition node
        getterDefNode.setString("myGetter"); // Set the name
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString("")); // Anonymous fn for getter
        fnNode.addChildToBack(new Node(Token.PARAM_LIST)); // No params
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newString("return 10;"));
        fnNode.addChildToBack(body);
        getterDefNode.addChildToBack(fnNode);
        
        // Simulating this being part of an object literal
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.addChildToBack(getterDefNode);
        
        codeGenerator.add(objLit);
        assertEquals("{get myGetter() {\n  return 10;\n}}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeSetterDef() throws Exception {
        setup();
        Node setterDefNode = new Node(Token.SETTER_DEF); // Setter definition node
        setterDefNode.setString("mySetter"); // Set the name
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(Node.newString("")); // Anonymous fn for setter
        Node paramList = new Node(Token.PARAM_LIST);
        paramList.addChildToBack(Node.newString("value"));
        fnNode.addChildToBack(paramList); // One param
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newString("this.value = value;"));
        fnNode.addChildToBack(body);
        setterDefNode.addChildToBack(fnNode);

        // Simulating this being part of an object literal
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.addChildToBack(setterDefNode);
        
        codeGenerator.add(objLit);
        assertEquals("{set mySetter(value) {\n  this.value = value;\n}}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeRegExpLiteral() throws Exception {
        setup();
        Node regExpNode = new Node(Token.REGEXP,
                                   Node.newString("/abc/g")); // The pattern string with flags
        codeGenerator.add(regExpNode);
        assertEquals("/abc/g", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeRegExpLiteralNoFlags() throws Exception {
        setup();
        Node regExpNode = new Node(Token.REGEXP, Node.newString("/abc/"));
        codeGenerator.add(regExpNode);
        assertEquals("/abc/", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeRegExpLiteralWithEscapes() throws Exception {
        setup();
        Node regExpNode = new Node(Token.REGEXP, Node.newString("[a-z]+"));
        codeGenerator.add(regExpNode);
        assertEquals("[a-z]+", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeHook() throws Exception {
        setup();
        Node hookNode = new Node(Token.HOOK,
                                 Node.newNumber(1), // Condition (truthy)
                                 Node.newNumber(1),    // Then value
                                 Node.newNumber(0));   // Else value
        codeGenerator.add(hookNode);
        assertEquals("1.0 ? 1.0 : 0.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeHookNested() throws Exception {
        setup();
        Node nestedHook = new Node(Token.HOOK,
                                   Node.newNumber(0), // Condition (falsy)
                                   Node.newNumber(2),
                                   Node.newNumber(3));
        Node hookNode = new Node(Token.HOOK,
                                 Node.newNumber(1), // Condition (truthy)
                                 nestedHook,
                                 Node.newNumber(0));
        codeGenerator.add(hookNode);
        assertEquals("1.0 ? (0.0 ? 2.0 : 3.0) : 0.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeBinaryOpAssocLeftToRight() throws Exception {
        setup();
        Node node1 = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node node2 = new Node(Token.ADD, node1, Node.newNumber(3));
        codeGenerator.add(node2);
        assertEquals("1.0 + 2.0 + 3.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpAssocRightToLeft() throws Exception {
        setup();
        // Assignment is right associative
        Node node1 = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), Node.newNumber(1));
        Node node2 = new Node(Token.ASSIGN, new Node(Token.NAME, "b"), node1);
        codeGenerator.add(node2);
        assertEquals("b = a = 1.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeBinaryOpPrecedence() throws Exception {
        setup();
        Node mulNode = new Node(Token.MUL, Node.newNumber(2), Node.newNumber(3));
        Node addNode = new Node(Token.ADD, Node.newNumber(1), mulNode);
        codeGenerator.add(addNode);
        assertEquals("1.0 + 2.0 * 3.0", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeBinaryOpPrecedenceWithParens() throws Exception {
        setup();
        Node addNode = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        Node mulNode = new Node(Token.MUL, addNode, Node.newNumber(3));
        codeGenerator.add(mulNode);
        assertEquals("(1.0 + 2.0) * 3.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeConditionalPrecedence() throws Exception {
        setup();
        Node hookNode = new Node(Token.HOOK,
                                 Node.newNumber(1), // Condition (truthy)
                                 Node.newNumber(1),
                                 Node.newNumber(0));
        Node addNode = new Node(Token.ADD, Node.newNumber(5), hookNode);
        codeGenerator.add(addNode);
        assertEquals("5.0 + (1.0 ? 1.0 : 0.0)", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeCommaPrecedence() throws Exception {
        setup();
        Node commaNode = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), commaNode);
        codeGenerator.add(assignNode);
        assertEquals("x = 1.0, 2.0", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeForInLoopWithComma() throws Exception {
        setup();
        Node commaNode = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
        Node forInNode = new Node(Token.FOR,
                                  Node.newVar("key"), // Corrected newVar usage
                                  commaNode, // Comma in collection position
                                  Node.newString("body"));
        codeGenerator.add(forInNode);
        assertEquals("for(var key in 1.0, 2.0) body", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeLabelledStatement() throws Exception {
        setup();
        Node labelName = new Node(Token.LABEL_NAME, "myLabel");
        Node labelStatement = new Node(Token.LABEL, labelName, Node.newString("statement"));
        codeGenerator.add(labelStatement);
        assertEquals("myLabel: statement", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeDebuggerStatement() throws Exception {
        setup();
        Node debuggerNode = new Node(Token.DEBUGGER);
        codeGenerator.add(debuggerNode);
        assertEquals("debugger;", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeEmptyStatement() throws Exception {
        setup();
        Node emptyNode = new Node(Token.EMPTY);
        codeGenerator.add(emptyNode);
        assertEquals(";", consumer.getContent().trim()); // Empty statement renders as a semicolon
    }
    
    @Test
    public void testAddNodeScriptBlock() throws Exception {
        setup();
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.addChildToBack(Node.newString("stmt1;"));
        scriptNode.addChildToBack(Node.newString("stmt2;"));
        codeGenerator.add(scriptNode, CodeGenerator.Context.STATEMENT);
        assertEquals("stmt1;\nstmt2;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeScriptBlockWithFunction() throws Exception {
        setup();
        Node scriptNode = new Node(Token.SCRIPT);
        Node funcDecl = new Node(Token.FUNCTION);
        funcDecl.addChildToBack(Node.newString("myFunc"));
        funcDecl.addChildToBack(new Node(Token.PARAM_LIST));
        funcDecl.addChildToBack(new Node(Token.BLOCK));
        scriptNode.addChildToBack(funcDecl);
        scriptNode.addChildToBack(Node.newString("stmt1;"));
        codeGenerator.add(scriptNode, CodeGenerator.Context.STATEMENT);
        assertEquals("function myFunc() {}\nstmt1;", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeCallIndirectEval() throws Exception {
        setup();
        Node evalName = Node.newName("eval");
        evalName.putBooleanProp(Node.DIRECT_EVAL, false); // Mark as indirect
        Node callNode = new Node(Token.CALL, evalName);
        codeGenerator.add(callNode);
        assertEquals("(0,eval)()", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeCallFreeCall() throws Exception {
        setup();
        Node obj = Node.newNumber(123); // Some object
        Node getPropNode = new Node(Token.GETPROP, obj, Node.newString("method"));
        getPropNode.putBooleanProp(Node.FREE_CALL, true); // Mark as free call
        Node callNode = new Node(Token.CALL, getPropNode);
        codeGenerator.add(callNode);
        assertEquals("(0,123.method)()", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeDelProp() throws Exception {
        setup();
        Node delPropNode = new Node(Token.DELPROP, Node.newString("obj"), Node.newString("prop"));
        codeGenerator.add(delPropNode);
        assertEquals("delete obj.prop", consumer.getContent().trim());
    }
    
    @Test
    public void testAddNodeDelElem() throws Exception {
        setup();
        Node delElemNode = new Node(Token.DELPROP, Node.newString("arr"), Node.newNumber(0));
        codeGenerator.add(delElemNode);
        assertEquals("delete arr[0.0]", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeCast() throws Exception {
        setup();
        Node castNode = new Node(Token.CAST, Node.newString("myType"), Node.newString("expr"));
        codeGenerator.add(castNode);
        assertEquals("(myType)expr", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeObjectLitWithNumberStringKey() throws Exception {
        setup();
        Node objectNode = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING_KEY, "123"); // Key is a string "123"
        key1.addChildToBack(Node.newNumber(10));
        objectNode.addChildToBack(key1);
        codeGenerator.add(objectNode);
        assertEquals("{123:10.0}", consumer.getContent().trim());
    }

    @Test
    public void testAddNodeObjectLitWithQuotedStringKey() throws Exception {
        setup();
        Node objectNode = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING_KEY, "\"prop\""); // Key is a quoted string
        key1.putBooleanProp(Node.QUOTED_PROP, true);
        key1.addChildToBack(Node.newNumber(10));
        objectNode.addChildToBack(key1);
        codeGenerator.add(objectNode);
        assertEquals("{\"prop\":10.0}", consumer.getContent().trim());
    }
}
```