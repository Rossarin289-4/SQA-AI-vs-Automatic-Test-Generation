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

    // Mock CodeConsumer to capture output
    private static class RecordingCodeConsumer extends CodeConsumer {
        StringBuilder sb = new StringBuilder();
        StringBuilder currentLine = new StringBuilder();
        private Node lastNode = null;

        @Override
        void append(String str) {
            sb.append(str);
            currentLine.append(str);
        }

        @Override
        void appendOp(String op, boolean binOp) {
            sb.append(op);
            currentLine.append(op);
        }

        @Override
        void addOp(String op, boolean binOp) {
            sb.append(op);
            currentLine.append(op);
        }

        @Override
        void addNumber(double x) {
            // Handle potential negative zero for correct output
            if (x == 0.0 && Double.compare(x, -0.0) == 0) {
                sb.append("-0");
                currentLine.append("-0");
            } else {
                sb.append(x);
                currentLine.append(x);
            }
        }

        @Override
        void addIdentifier(String identifier) {
            sb.append(identifier);
            currentLine.append(identifier);
        }

        @Override
        void listSeparator() {
            sb.append(",");
            currentLine.append(",");
        }

        @Override
        void endStatement() {
            sb.append(";");
            currentLine.append(";");
            // Simulate line break after statement
            endLine();
        }

        @Override
        void endStatement(boolean needSemiColon) {
            if (needSemiColon) {
                endStatement();
            } else {
                // If no semicolon needed, just end the current line.
                endLine();
            }
        }

        @Override
        void startNewLine() {
            // Ignored for simplicity in this mock
        }

        @Override
        void maybeLineBreak() {
            // Ignored for simplicity in this mock
        }

        @Override
        void maybeCutLine() {
            // Ignored for simplicity in this mock
        }

        @Override
        void endLine() {
            currentLine = new StringBuilder();
        }

        @Override
        void notePreferredLineBreak() {
            // Ignored for simplicity in this mock
        }

        @Override
        void beginBlock() {
            sb.append("{");
            currentLine.append("{");
        }

        @Override
        void endBlock() {
            sb.append("}");
            currentLine.append("}");
        }

        @Override
        void endBlock(boolean shouldEndLine) {
            endBlock();
            if (shouldEndLine) {
                endLine();
            }
        }

        @Override
        void beginCaseBody() {
            sb.append(":");
            currentLine.append(":");
        }

        @Override
        void endCaseBody() {
            // Ignored for simplicity in this mock
        }

        @Override
        void endFunction() {
            // Ignored for simplicity in this mock
        }

        @Override
        void endFunction(boolean statementContext) {
            // Ignored for simplicity in this mock
        }

        @Override
        char getLastChar() {
            if (sb.length() > 0) {
                return sb.charAt(sb.length() - 1);
            }
            return 0;
        }

        @Override
        void startSourceMapping(Node node) {
            this.lastNode = node;
        }

        @Override
        void endSourceMapping(Node node) {
            // Ignored for simplicity in this mock
        }

        @Override
        boolean continueProcessing() {
            return true; // Always continue processing in this mock
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return false; // Default to not preserving extra blocks
        }

        @Override
        boolean breakAfterBlockFor(Node n, boolean statementContext) {
            return true; // Default to breaking after blocks
        }

        @Override
        void endFile() {
            // Ignored for simplicity in this mock
        }

        String getCode() {
            return sb.toString();
        }
    }

    private RecordingCodeConsumer cc;
    private CodeGenerator cg;

    private void init() {
        cc = new RecordingCodeConsumer();
        cg = new CodeGenerator(cc);
    }

    private void init(Charset charset) {
        cc = new RecordingCodeConsumer();
        cg = new CodeGenerator(cc, charset);
    }

    // Test case for tagAsStrict()
    @Test
    public void testTagAsStrict() {
        init();
        cg.tagAsStrict();
        assertEquals("'use strict';", cc.getCode());
    }

    // Test case for adding a simple string
    @Test
    public void testAddSimpleString() {
        init();
        cg.add("hello world");
        assertEquals("hello world", cc.getCode());
    }

    // Test case for adding a binary operator (ADD)
    @Test
    public void testAddBinaryOperator() {
        init();
        Node n = new Node(Token.ADD);
        n.addChildToBack(Node.newNumber(1.0));
        n.addChildToBack(Node.newNumber(2.0));
        cg.add(n);
        assertEquals("1.0+2.0", cc.getCode());
    }

    // Test case for a TRY block without catch or finally
    @Test
    public void testTryWithoutCatchOrFinally() {
        init();
        Node tryNode = new Node(Token.TRY);
        Node blockNode = new Node(Token.BLOCK);
        blockNode.addChildToBack(Node.newNumber(1.0)); // Statement inside try
        tryNode.addChildToBack(blockNode);
        cg.add(tryNode);
        assertEquals("try{1.0}", cc.getCode());
    }

    // Test case for a TRY block with catch
    @Test
    public void testTryWithCatch() {
        init();
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        tryBlock.addChildToBack(Node.newNumber(1.0));
        tryNode.addChildToBack(tryBlock);

        Node catchNode = new Node(Token.CATCH);
        Node catchParam = Node.newString(Token.NAME, "e");
        catchNode.addChildToBack(catchParam);
        Node catchBlock = new Node(Token.BLOCK);
        catchBlock.addChildToBack(Node.newNumber(2.0));
        catchNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(catchNode);

        cg.add(tryNode);
        assertEquals("try{1.0}catch(e){2.0}", cc.getCode());
    }

    // Test case for a TRY block with finally
    @Test
    public void testTryWithFinally() {
        init();
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        tryBlock.addChildToBack(Node.newNumber(1.0));
        tryNode.addChildToBack(tryBlock);

        Node finallyBlock = new Node(Token.BLOCK);
        finallyBlock.addChildToBack(Node.newNumber(3.0));
        tryNode.addChildToBack(finallyBlock);

        cg.add(tryNode);
        assertEquals("try{1.0}finally{3.0}", cc.getCode());
    }

    // Test case for a TRY block with catch and finally
    @Test
    public void testTryWithCatchAndFinally() {
        init();
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        tryBlock.addChildToBack(Node.newNumber(1.0));
        tryNode.addChildToBack(tryBlock);

        Node catchNode = new Node(Token.CATCH);
        Node catchParam = Node.newString(Token.NAME, "e");
        catchNode.addChildToBack(catchParam);
        Node catchBlock = new Node(Token.BLOCK);
        catchBlock.addChildToBack(Node.newNumber(2.0));
        catchNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(catchNode);

        Node finallyBlock = new Node(Token.BLOCK);
        finallyBlock.addChildToBack(Node.newNumber(3.0));
        tryNode.addChildToBack(finallyBlock);

        cg.add(tryNode);
        assertEquals("try{1.0}catch(e){2.0}finally{3.0}", cc.getCode());
    }

    // Test case for a simple CATCH block
    @Test
    public void testCatchSimple() {
        init();
        Node catchNode = new Node(Token.CATCH);
        Node catchParam = Node.newString(Token.NAME, "err");
        catchNode.addChildToBack(catchParam);
        Node catchBlock = new Node(Token.BLOCK);
        catchBlock.addChildToBack(Node.newNumber(1.0));
        catchNode.addChildToBack(catchBlock);
        cg.add(catchNode);
        assertEquals("catch(err){1.0}", cc.getCode());
    }

    // Test case for THROW statement
    @Test
    public void testThrowStatement() {
        init();
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToBack(Node.newString("Error"));
        cg.add(throwNode);
        assertEquals("throw\"Error\";", cc.getCode());
    }

    // Test case for RETURN statement with value
    @Test
    public void testReturnStatementWithValue() {
        init();
        Node returnNode = new Node(Token.RETURN);
        returnNode.addChildToBack(Node.newNumber(10.0));
        cg.add(returnNode);
        assertEquals("return 10.0;", cc.getCode());
    }

    // Test case for RETURN statement without value
    @Test
    public void testReturnStatementWithoutValue() {
        init();
        Node returnNode = new Node(Token.RETURN);
        cg.add(returnNode);
        assertEquals("return;", cc.getCode());
    }

    // Test case for VAR declaration
    @Test
    public void testVarDeclaration() {
        init();
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        nameNode.addChildToBack(Node.newNumber(5.0));
        varNode.addChildToBack(nameNode);
        cg.add(varNode);
        assertEquals("var x=5.0;", cc.getCode());
    }

    // Test case for LABEL_NAME
    @Test
    public void testLabelName() {
        init();
        Node labelNameNode = Node.newString(Token.LABEL_NAME, "myLabel");
        cg.add(labelNameNode);
        assertEquals("myLabel", cc.getCode());
    }

    // Test case for NAME assignment
    @Test
    public void testNameAssignment() {
        init();
        Node nameNode = Node.newString(Token.NAME, "y");
        nameNode.addChildToBack(Node.newNumber(100.0));
        cg.add(nameNode);
        assertEquals("y=100.0", cc.getCode());
    }

    // Test case for NAME assignment with comma expression
    @Test
    public void testNameAssignmentWithComma() {
        init();
        Node nameNode = Node.newString(Token.NAME, "z");
        Node commaNode = new Node(Token.COMMA);
        commaNode.addChildToBack(Node.newNumber(1.0));
        commaNode.addChildToBack(Node.newNumber(2.0));
        nameNode.addChildToBack(commaNode);
        cg.add(nameNode);
        assertEquals("z=(1.0,2.0)", cc.getCode());
    }

    // Test case for ARRAYLIT
    @Test
    public void testArrayLiteral() {
        init();
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToBack(Node.newNumber(1.0));
        arrayNode.addChildToBack(Node.newNumber(2.0));
        cg.add(arrayNode);
        assertEquals("[1.0,2.0]", cc.getCode());
    }

    // Test case for LP (parenthesized expression)
    @Test
    public void testParenthesizedExpression() {
        init();
        Node lpNode = new Node(Token.LP);
        lpNode.addChildToBack(Node.newNumber(5.0));
        cg.add(lpNode);
        assertEquals("(5.0)", cc.getCode());
    }

    // Test case for COMMA operator
    @Test
    public void testCommaOperator() {
        init();
        Node commaNode = new Node(Token.COMMA);
        commaNode.addChildToBack(Node.newNumber(1.0));
        commaNode.addChildToBack(Node.newNumber(2.0));
        cg.add(commaNode);
        assertEquals("1.0,2.0", cc.getCode());
    }

    // Test case for NUMBER literal
    @Test
    public void testNumberLiteral() {
        init();
        cg.add(Node.newNumber(123.45));
        assertEquals("123.45", cc.getCode());
    }

    // Test case for TYPEOF operator
    @Test
    public void testTypeOfOperator() {
        init();
        Node typeofNode = new Node(Token.TYPEOF);
        typeofNode.addChildToBack(Node.newString(Token.NAME, "x"));
        cg.add(typeofNode);
        assertEquals("typeof x", cc.getCode());
    }

    // Test case for VOID operator
    @Test
    public void testVoidOperator() {
        init();
        Node voidNode = new Node(Token.VOID);
        voidNode.addChildToBack(Node.newNumber(0.0));
        cg.add(voidNode);
        assertEquals("void 0.0", cc.getCode());
    }

    // Test case for NOT operator
    @Test
    public void testNotOperator() {
        init();
        Node notNode = new Node(Token.NOT);
        notNode.addChildToBack(Node.newNumber(0.0));
        cg.add(notNode);
        assertEquals("!0.0", cc.getCode());
    }

    // Test case for BITNOT operator
    @Test
    public void testBitNotOperator() {
        init();
        Node bitNotNode = new Node(Token.BITNOT);
        bitNotNode.addChildToBack(Node.newNumber(5.0));
        cg.add(bitNotNode);
        assertEquals("~5.0", cc.getCode());
    }

    // Test case for POS operator
    @Test
    public void testPosOperator() {
        init();
        Node posNode = new Node(Token.POS);
        posNode.addChildToBack(Node.newNumber(-10.0));
        cg.add(posNode);
        assertEquals("+ -10.0", cc.getCode());
    }

    // Test case for NEG operator with a number
    @Test
    public void testNegOperatorWithNumber() {
        init();
        Node negNode = new Node(Token.NEG);
        negNode.addChildToBack(Node.newNumber(10.0));
        cg.add(negNode);
        assertEquals("-10.0", cc.getCode());
    }

    // Test case for NEG operator with an expression
    @Test
    public void testNegOperatorWithExpression() {
        init();
        Node negNode = new Node(Token.NEG);
        Node addNode = new Node(Token.ADD, Node.newNumber(1.0), Node.newNumber(2.0));
        negNode.addChildToBack(addNode);
        cg.add(negNode);
        assertEquals("-(1.0+2.0)", cc.getCode());
    }

    // Test case for HOOK (ternary) operator
    @Test
    public void testHookOperator() {
        init();
        Node hookNode = new Node(Token.HOOK);
        hookNode.addChildToBack(Node.newNumber(1.0)); // condition
        hookNode.addChildToBack(Node.newNumber(2.0)); // then
        hookNode.addChildToBack(Node.newNumber(3.0)); // else
        cg.add(hookNode);
        assertEquals("1.0?2.0:3.0", cc.getCode());
    }

    // Test case for REGEXP literal
    @Test
    public void testRegExpLiteral() {
        init();
        Node regexpNode = new Node(Token.REGEXP);
        regexpNode.addChildToBack(Node.newString("/abc/"));
        regexpNode.addChildToBack(Node.newString("g")); // flags
        cg.add(regexpNode);
        assertEquals("/abc/g", cc.getCode());
    }

    // Test case for GET_REF
    @Test
    public void testGetRef() {
        init();
        Node getRefNode = new Node(Token.GET_REF);
        getRefNode.addChildToBack(Node.newString(Token.NAME, "obj"));
        cg.add(getRefNode);
        assertEquals("obj", cc.getCode());
    }

    // Test case for REF_SPECIAL
    @Test
    public void testRefSpecial() {
        init();
        Node refSpecialNode = new Node(Token.REF_SPECIAL);
        refSpecialNode.addChildToBack(Node.newString(Token.NAME, "obj"));
        refSpecialNode.putProp(Node.NAME_PROP, "prop");
        cg.add(refSpecialNode);
        assertEquals("obj.prop", cc.getCode());
    }

    // Test case for FUNCTION declaration
    @Test
    public void testFunctionDeclaration() {
        init();
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToBack(Node.newString("myFunc")); // name
        Node params = new Node(Token.LP);
        params.addChildToBack(Node.newString(Token.NAME, "a"));
        funcNode.addChildToBack(params); // params
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(1.0));
        funcNode.addChildToBack(body); // body
        cg.add(funcNode);
        assertEquals("function myFunc(a){1.0}", cc.getCode());
    }

    // Test case for GET method in OBJECTLIT
    @Test
    public void testGetObjectMethod() {
        init();
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node getMethodNode = new Node(Token.GET);
        getMethodNode.setString("myGetter");
        Node funcNode = new Node(Token.FUNCTION);
        Node params = new Node(Token.LP); // no params for GET
        funcNode.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(1.0));
        funcNode.addChildToBack(body);
        getMethodNode.addChildToBack(funcNode);
        objectLitNode.addChildToBack(getMethodNode);
        cg.add(objectLitNode);
        assertEquals("{get myGetter(){1.0}}", cc.getCode());
    }

    // Test case for SET method in OBJECTLIT
    @Test
    public void testSetObjectMethod() {
        init();
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node setMethodNode = new Node(Token.SET);
        setMethodNode.setString("mySetter");
        Node funcNode = new Node(Token.FUNCTION);
        Node params = new Node(Token.LP);
        params.addChildToBack(Node.newString(Token.NAME, "val")); // one param for SET
        funcNode.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(2.0));
        funcNode.addChildToBack(body);
        setMethodNode.addChildToBack(funcNode);
        objectLitNode.addChildToBack(setMethodNode);
        cg.add(objectLitNode);
        assertEquals("{set mySetter(val){2.0}}", cc.getCode());
    }

    // Test case for SCRIPT block
    @Test
    public void testScriptBlock() {
        init();
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.addChildToBack(Node.newNumber(1.0));
        scriptNode.addChildToBack(Node.newNumber(2.0));
        cg.add(scriptNode);
        assertEquals("1.0;2.0;", cc.getCode());
    }

    // Test case for BLOCK
    @Test
    public void testBlock() {
        init();
        Node blockNode = new Node(Token.BLOCK);
        blockNode.addChildToBack(Node.newNumber(1.0));
        blockNode.addChildToBack(Node.newNumber(2.0));
        cg.add(blockNode, CodeGenerator.Context.STATEMENT);
        assertEquals("{1.0;2.0;}", cc.getCode());
    }

    // Test case for FOR loop with 4 children (initialization, condition, increment, body)
    @Test
    public void testForLoopFourChildren() {
        init();
        Node forNode = new Node(Token.FOR);
        // Initialization
        Node initVar = new Node(Token.VAR);
        initVar.addChildToBack(Node.newString(Token.NAME, "i"));
        initVar.addChildToBack(Node.newNumber(0.0));
        forNode.addChildToBack(initVar);
        // Condition
        Node condition = Node.newNumber(1.0); // Simplified condition
        forNode.addChildToBack(condition);
        // Increment
        Node increment = new Node(Token.INC, Node.newString(Token.NAME, "i"));
        forNode.addChildToBack(increment);
        // Body
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(10.0));
        forNode.addChildToBack(body);

        cg.add(forNode);
        assertEquals("for(var i=0.0;1.0;++i){10.0}", cc.getCode());
    }

    // Test case for FOR...IN loop
    @Test
    public void testForInLoop() {
        init();
        Node forNode = new Node(Token.FOR);
        // Variable
        Node varNode = Node.newString(Token.NAME, "key");
        forNode.addChildToBack(varNode);
        // Object
        Node objectNode = Node.newNumber(100.0);
        forNode.addChildToBack(objectNode);
        // Body
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(20.0));
        forNode.addChildToBack(body);

        cg.add(forNode);
        assertEquals("for(key in 100.0){20.0}", cc.getCode());
    }

    // Test case for DO...WHILE loop
    @Test
    public void testDoWhileLoop() {
        init();
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(1.0));
        doNode.addChildToBack(body);
        Node condition = Node.newNumber(1.0); // Simplified condition
        doNode.addChildToBack(condition);
        cg.add(doNode);
        assertEquals("do{1.0}while(1.0);", cc.getCode());
    }

    // Test case for WHILE loop
    @Test
    public void testWhileLoop() {
        init();
        Node whileNode = new Node(Token.WHILE);
        Node condition = Node.newNumber(1.0);
        whileNode.addChildToBack(condition);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(2.0));
        whileNode.addChildToBack(body);
        cg.add(whileNode);
        assertEquals("while(1.0){2.0}", cc.getCode());
    }

    // Test case for EMPTY statement
    @Test
    public void testEmptyStatement() {
        init();
        Node emptyNode = new Node(Token.EMPTY);
        cg.add(emptyNode);
        assertEquals(";", cc.getCode()); // Assuming empty statement becomes a semicolon
    }

    // Test case for GETPROP
    @Test
    public void testGetProp() {
        init();
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToBack(Node.newString(Token.NAME, "obj"));
        getPropNode.addChildToBack(Node.newString("prop"));
        cg.add(getPropNode);
        assertEquals("obj.prop", cc.getCode());
    }

    // Test case for GETELEM
    @Test
    public void testGetElem() {
        init();
        Node getElemNode = new Node(Token.GETELEM);
        getElemNode.addChildToBack(Node.newString(Token.NAME, "arr"));
        getElemNode.addChildToBack(Node.newNumber(0.0));
        cg.add(getElemNode);
        assertEquals("arr[0.0]", cc.getCode());
    }

    // Test case for WITH statement
    @Test
    public void testWithStatement() {
        init();
        Node withNode = new Node(Token.WITH);
        withNode.addChildToBack(Node.newNumber(10.0)); // Object
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(20.0));
        withNode.addChildToBack(body);
        cg.add(withNode);
        assertEquals("with(10.0){20.0}", cc.getCode());
    }

    // Test case for INC (pre-increment)
    @Test
    public void testPreIncrement() {
        init();
        Node incNode = new Node(Token.INC);
        incNode.addChildToBack(Node.newString(Token.NAME, "x"));
        incNode.putIntProp(Node.INCRDECR_PROP, 0); // Pre-increment
        cg.add(incNode);
        assertEquals("++x", cc.getCode());
    }

    // Test case for INC (post-increment)
    @Test
    public void testPostIncrement() {
        init();
        Node incNode = new Node(Token.INC);
        incNode.addChildToBack(Node.newString(Token.NAME, "x"));
        incNode.putIntProp(Node.INCRDECR_PROP, 1); // Post-increment
        cg.add(incNode);
        assertEquals("x++", cc.getCode());
    }

    // Test case for DEC (pre-decrement)
    @Test
    public void testPreDecrement() {
        init();
        Node decNode = new Node(Token.DEC);
        decNode.addChildToBack(Node.newString(Token.NAME, "y"));
        decNode.putIntProp(Node.INCRDECR_PROP, 0); // Pre-decrement
        cg.add(decNode);
        assertEquals("--y", cc.getCode());
    }

    // Test case for DEC (post-decrement)
    @Test
    public void testPostDecrement() {
        init();
        Node decNode = new Node(Token.DEC);
        decNode.addChildToBack(Node.newString(Token.NAME, "y"));
        decNode.putIntProp(Node.INCRDECR_PROP, 1); // Post-decrement
        cg.add(decNode);
        assertEquals("y--", cc.getCode());
    }

    // Test case for CALL expression
    @Test
    public void testCallExpression() {
        init();
        Node callNode = new Node(Token.CALL);
        callNode.addChildToBack(Node.newString(Token.NAME, "func"));
        callNode.addChildToBack(Node.newNumber(1.0));
        callNode.addChildToBack(Node.newNumber(2.0));
        cg.add(callNode);
        assertEquals("func(1.0,2.0)", cc.getCode());
    }

    // Test case for IF statement without else
    @Test
    public void testIfStatementWithoutElse() {
        init();
        Node ifNode = new Node(Token.IF);
        ifNode.addChildToBack(Node.newNumber(1.0)); // Condition
        Node thenBranch = new Node(Token.BLOCK);
        thenBranch.addChildToBack(Node.newNumber(2.0));
        ifNode.addChildToBack(thenBranch); // Then branch
        cg.add(ifNode);
        assertEquals("if(1.0){2.0}", cc.getCode());
    }

    // Test case for IF statement with else
    @Test
    public void testIfStatementWithElse() {
        init();
        Node ifNode = new Node(Token.IF);
        ifNode.addChildToBack(Node.newNumber(1.0)); // Condition
        Node thenBranch = new Node(Token.BLOCK);
        thenBranch.addChildToBack(Node.newNumber(2.0));
        ifNode.addChildToBack(thenBranch); // Then branch
        Node elseBranch = new Node(Token.BLOCK);
        elseBranch.addChildToBack(Node.newNumber(3.0));
        ifNode.addChildToBack(elseBranch); // Else branch
        cg.add(ifNode);
        assertEquals("if(1.0){2.0}else{3.0}", cc.getCode());
    }

    // Test case for NULL literal
    @Test
    public void testNullLiteral() {
        init();
        cg.add(new Node(Token.NULL));
        assertEquals("null", cc.getCode());
    }

    // Test case for THIS keyword
    @Test
    public void testThisKeyword() {
        init();
        cg.add(new Node(Token.THIS));
        assertEquals("this", cc.getCode());
    }

    // Test case for FALSE literal
    @Test
    public void testFalseLiteral() {
        init();
        cg.add(new Node(Token.FALSE));
        assertEquals("false", cc.getCode());
    }

    // Test case for TRUE literal
    @Test
    public void testTrueLiteral() {
        init();
        cg.add(new Node(Token.TRUE));
        assertEquals("true", cc.getCode());
    }

    // Test case for CONTINUE statement with label
    @Test
    public void testContinueStatementWithLabel() {
        init();
        Node continueNode = new Node(Token.CONTINUE);
        continueNode.addChildToBack(Node.newString(Token.LABEL_NAME, "myLoop"));
        cg.add(continueNode);
        assertEquals("continue myLoop;", cc.getCode());
    }

    // Test case for DEBUGGER statement
    @Test
    public void testDebuggerStatement() {
        init();
        Node debuggerNode = new Node(Token.DEBUGGER);
        cg.add(debuggerNode);
        assertEquals("debugger;", cc.getCode());
    }

    // Test case for BREAK statement with label
    @Test
    public void testBreakStatementWithLabel() {
        init();
        Node breakNode = new Node(Token.BREAK);
        breakNode.addChildToBack(Node.newString(Token.LABEL_NAME, "mySwitch"));
        cg.add(breakNode);
        assertEquals("break mySwitch;", cc.getCode());
    }

    // Test case for EXPR_RESULT
    @Test
    public void testExprResult() {
        init();
        Node exprResultNode = new Node(Token.EXPR_RESULT);
        exprResultNode.addChildToBack(Node.newNumber(42.0));
        cg.add(exprResultNode);
        assertEquals("42.0;", cc.getCode());
    }

    // Test case for NEW expression
    @Test
    public void testNewExpression() {
        init();
        Node newNode = new Node(Token.NEW);
        newNode.addChildToBack(Node.newString(Token.NAME, "MyClass"));
        newNode.addChildToBack(Node.newNumber(1.0)); // Argument
        cg.add(newNode);
        assertEquals("new MyClass(1.0)", cc.getCode());
    }

    // Test case for NEW expression without arguments
    @Test
    public void testNewExpressionNoArgs() {
        init();
        Node newNode = new Node(Token.NEW);
        newNode.addChildToBack(Node.newString(Token.NAME, "MyClass"));
        cg.add(newNode);
        assertEquals("new MyClass()", cc.getCode());
    }

    // Test case for STRING literal
    @Test
    public void testStringLiteral() {
        init();
        cg.add(Node.newString("hello"));
        assertEquals("\"hello\"", cc.getCode());
    }

    // Test case for DELPROP statement
    @Test
    public void testDelPropStatement() {
        init();
        Node delPropNode = new Node(Token.DELPROP);
        delPropNode.addChildToBack(Node.newString(Token.NAME, "obj"));
        delPropNode.addChildToBack(Node.newString("prop"));
        cg.add(delPropNode);
        assertEquals("delete obj.prop", cc.getCode());
    }

    // Test case for OBJECTLIT with string keys
    @Test
    public void testObjectLiteralStringKeys() {
        init();
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node stringNode1 = Node.newString(Token.STRING, "key1");
        stringNode1.addChildToBack(Node.newNumber(1.0));
        objectLitNode.addChildToBack(stringNode1);
        Node stringNode2 = Node.newString(Token.STRING, "key2");
        stringNode2.addChildToBack(Node.newNumber(2.0));
        objectLitNode.addChildToBack(stringNode2);
        cg.add(objectLitNode);
        assertEquals("{\"key1\":1.0,\"key2\":2.0}", cc.getCode());
    }

    // Test case for OBJECTLIT with numeric keys
    @Test
    public void testObjectLiteralNumericKeys() {
        init();
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node stringNode1 = Node.newString(Token.STRING, "0");
        stringNode1.addChildToBack(Node.newNumber(1.0));
        objectLitNode.addChildToBack(stringNode1);
        Node stringNode2 = Node.newString(Token.STRING, "1");
        stringNode2.addChildToBack(Node.newNumber(2.0));
        objectLitNode.addChildToBack(stringNode2);
        cg.add(objectLitNode);
        assertEquals("{\"0\":1.0,\"1\":2.0}", cc.getCode());
    }

    // Test case for SWITCH statement
    @Test
    public void testSwitchStatement() {
        init();
        Node switchNode = new Node(Token.SWITCH);
        switchNode.addChildToBack(Node.newNumber(10.0)); // switch expression
        Node caseNode1 = new Node(Token.CASE);
        caseNode1.addChildToBack(Node.newNumber(1.0)); // case value
        caseNode1.addChildToBack(Node.newNumber(11.0)); // case body
        switchNode.addChildToBack(caseNode1);
        Node defaultNode = new Node(Token.DEFAULT);
        defaultNode.addChildToBack(Node.newNumber(20.0)); // default body
        switchNode.addChildToBack(defaultNode);
        cg.add(switchNode);
        assertEquals("switch(10.0){case 1.0:11.0;default:20.0;}", cc.getCode());
    }

    // Test case for CASE clause
    @Test
    public void testCaseClause() {
        init();
        Node caseNode = new Node(Token.CASE);
        caseNode.addChildToBack(Node.newNumber(5.0));
        caseNode.addChildToBack(Node.newNumber(50.0));
        cg.add(caseNode);
        assertEquals("case 5.0:50.0;", cc.getCode());
    }

    // Test case for DEFAULT clause
    @Test
    public void testDefaultClause() {
        init();
        Node defaultNode = new Node(Token.DEFAULT);
        defaultNode.addChildToBack(Node.newNumber(100.0));
        cg.add(defaultNode);
        assertEquals("default:100.0;", cc.getCode());
    }

    // Test case for LABEL statement
    @Test
    public void testLabelStatement() {
        init();
        Node labelNode = new Node(Token.LABEL);
        labelNode.addChildToBack(Node.newString(Token.LABEL_NAME, "loop"));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(Node.newNumber(1.0));
        labelNode.addChildToBack(body);
        cg.add(labelNode);
        assertEquals("loop:{1.0}", cc.getCode());
    }

    // Test case for SETNAME (should be ignored)
    @Test
    public void testSetNameIgnored() {
        init();
        Node setNameNode = new Node(Token.SETNAME);
        setNameNode.setString("ignoredVar");
        cg.add(setNameNode);
        assertEquals("", cc.getCode()); // Should produce no output
    }

    // Test case for handling a number that requires scientific notation
    @Test
    public void testLargeNumber() {
        init();
        cg.add(Node.newNumber(1e10));
        assertEquals("1E10", cc.getCode());
    }

    // Test case for number 0
    @Test
    public void testZeroNumber() {
        init();
        cg.add(Node.newNumber(0.0));
        assertEquals("0.0", cc.getCode());
    }

    // Test case for negative zero
    @Test
    public void testNegativeZero() {
        init();
        Node negZero = Node.newNumber(-0.0);
        cg.add(negZero);
        assertEquals("-0", cc.getCode());
    }

    // Test case for identifier escape (non-latin characters)
    @Test
    public void testIdentifierEscapeNonLatin() {
        init();
        // The private method identifierEscape cannot be called directly.
        // We can indirectly test its behavior by observing how addIdentifier handles it.
        // However, the provided CodeGenerator class does not expose addIdentifier externally.
        // A workaround is to use jsString which uses strEscape and then check if
        // that method correctly escapes non-latin characters.
        // The CodeGenerator class has a helper `strEscape` that is used by `jsString`.
        // We will simulate the call that `jsString` makes to `strEscape`.
        CharsetEncoder asciiEncoder = Charsets.US_ASCII.newEncoder();
        String nonLatinString = "test\u1234string";
        // The CodeGenerator.strEscape is private, so we cannot call it directly.
        // We will simulate the output of jsString which is based on strEscape.
        // The goal is to check if unicode characters are escaped.
        // For this, we can rely on the behavior of `jsString` itself.
        // If `jsString` correctly escapes, then `cg.add(Node.newString(nonLatinString))`
        // should produce an escaped string.
        cg.add(Node.newString(nonLatinString));
        assertEquals("\"test\\u1234string\"", cc.getCode());
    }

    // Test case for string escape (special characters)
    @Test
    public void testJsStringEscapeSpecialChars() {
        init();
        String testString = "\"escaped\" \n \t \\ \r";
        cg.add(Node.newString(testString));
        // The jsString method will escape these characters.
        assertEquals("\"\\\"escaped\\\" \\n \\t \\\\ \\r\"", cc.getCode());
    }

    // Test case for regexp escape (special characters)
    @Test
    public void testRegexpEscapeSpecialChars() {
        init();
        // Test regexpEscape function indirectly through add method
        String regexp = "/([a-z])+/g";
        Node regexpNode = new Node(Token.REGEXP);
        regexpNode.addChildToBack(Node.newString(regexp));
        regexpNode.addChildToBack(Node.newString("g")); // flags
        cg.add(regexpNode);
        // The regexp itself is not escaped, but characters that might break script.
        assertEquals("/([a-z])+/g", cc.getCode());
    }

    // Test case for handling empty input to jsString
    @Test
    public void testJsStringEmpty() {
        init();
        cg.add(Node.newString(""));
        assertEquals("\"\"", cc.getCode());
    }

    // Test case for handling a string with only one quote type
    @Test
    public void testJsStringOnlySingleQuotes() {
        init();
        cg.add(Node.newString("test'test"));
        assertEquals("\"test'test\"", cc.getCode()); // Should use double quotes
    }

    // Test case for handling a string with only double quotes
    @Test
    public void testJsStringOnlyDoubleQuotes() {
        init();
        cg.add(Node.newString("test\"test"));
        assertEquals("'test\"test'", cc.getCode()); // Should use single quotes
    }
}
